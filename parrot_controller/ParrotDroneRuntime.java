package fr.roboticiens.runtime;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import fr.roboticiens.commandes.Atterrir;
import fr.roboticiens.commandes.Avancer;
import fr.roboticiens.commandes.CommandeAvecDureeVitesse;
import fr.roboticiens.commandes.CommandeParallelisable;
import fr.roboticiens.commandes.Decoller;
import fr.roboticiens.commandes.Descendre;
import fr.roboticiens.commandes.Droite;
import fr.roboticiens.commandes.Gauche;
import fr.roboticiens.commandes.Monter;
import fr.roboticiens.commandes.Pause;
import fr.roboticiens.commandes.Reculer;
import fr.roboticiens.commandes.RotationDroite;
import fr.roboticiens.commandes.RotationGauche;
import fr.roboticiens.paralleles.Parallele;
import fr.roboticiens.prologue.Prologue;
import fr.roboticiens.types.Pourcent;

public class ParrotDroneRuntime implements DroneRuntime {

	public static final int DECOLLER_INPUT_CODE = 1;
	public static final int ATTERRIR_INPUT_CODE = 2;
	public static final int AVANCER_INPUT_CODE = 3;
	public static final int RECULER_INPUT_CODE = 4;
	public static final int MONTER_INPUT_CODE = 5;
	public static final int DESCENDRE_INPUT_CODE = 6;
	public static final int GAUCHE_INPUT_CODE = 7;
	public static final int DROITE_INPUT_CODE = 8;
	public static final int ROTATION_GAUCHE_INPUT_CODE = 9;
	public static final int ROTATION_DROITE_INPUT_CODE = 10;
	
	public static final int ELOIGNEMENT_MAX_CODE = 11;
	public static final int HAUTEUR_MAX_CODE = 12;
	public static final int VIT_DEPLACEMENT_MAX_CODE = 13;
	public static final int VIT_HAUTEUR_MAX_CODE = 14;
	public static final int VIT_ROTATION_MAX_CODE = 15;
	
	public static final String STATE_STARTED = "STARTED";
	public static final String STATE_FLYING = "FLYING";
	public static final String STATE_LANDED = "LANDED";
	public static final String STATE_STOPPED = "STOPPED";
	
	public enum DroneState {
		STARTED, FLYING, LANDED, STOPPED
	}
	
	private ProcessBuilder processBuilder;
	private Process process;
	
	private InputStream input;
	private OutputStream output;
	private BufferedReader brInput;
	private BufferedWriter bwOutput;
	private Object bwOutputLock = new Object();
	
	private Thread printerThread;
	
	private double ratioVitesseDeplacement = 1.0;
	private double ratioVitesseHauteur = 1.0;
	private double ratioVitesseRotation = 1.0;
	
	private DroneState droneState = DroneState.STOPPED;
	private final Lock lockState = new ReentrantLock();
	private final Condition hasTakenOff = lockState.newCondition();
	private final Condition hasLanded = lockState.newCondition();
	private final Condition hasStarted = lockState.newCondition();
	
	public ParrotDroneRuntime(final String parrotExecutablePath) {
		 try {
			 this.processBuilder = new ProcessBuilder(parrotExecutablePath);
			 this.processBuilder.redirectError(Redirect.INHERIT);
			 this.process = processBuilder.start();
			 
			 this.input = process.getInputStream();
			 this.output = process.getOutputStream();
			 
			 this.brInput = new BufferedReader(new InputStreamReader(input));
			 this.bwOutput = new BufferedWriter(new OutputStreamWriter(output));
			 
			 this.printerThread = new Thread(new Runnable() {
				 
				@Override
				public void run() {
					String line = null;
					try {
						while((line = brInput.readLine()) != null) {
							
							if(line.equals(STATE_STARTED)) {
								droneState = DroneState.STARTED;
								lockState.lock();
								try {
									hasStarted.notifyAll();
								} finally {
									lockState.unlock();
								}
							} else if(line.equals(STATE_FLYING)) {
								droneState = DroneState.FLYING;
								lockState.lock();
								try {
									hasTakenOff.notifyAll();
								} finally {
									lockState.unlock();
								}
							} else if(line.equals(STATE_LANDED)) {
								droneState = DroneState.LANDED;
								lockState.lock();
								try {
									hasLanded.notifyAll();
								} finally {
									lockState.unlock();
								}
							} else if(line.equals(STATE_STOPPED)) {
								droneState = DroneState.STOPPED;
							} else {
								System.out.println(line);
							}
						} // fin while(readLine)
						
					} catch (IOException e) {
						e.printStackTrace();
						process.destroy();
						System.exit(-1);
					}
				}
			 });
			 this.printerThread.start();
			 
		} catch (IOException e) {
			e.printStackTrace();
			process.destroy();
			System.exit(-1);
		}
	}

	@Override
	public void execPrologue(Prologue p) {
		try {
			// enregistrement des pourcentages de vitesse pour les utiliser avec le paramètre de vitesse des mouvements
			this.ratioVitesseDeplacement = p.getVitesseDeplacement().getValue() / 100;
			this.ratioVitesseHauteur = p.getVitesseVerticale().getValue() / 100;
			this.ratioVitesseRotation = p.getVitesseRotation().getValue() / 100;
			
			writeToSubProcessStdin(ELOIGNEMENT_MAX_CODE, p.getEloignementMax(), true);
			writeToSubProcessStdin(HAUTEUR_MAX_CODE, p.getHauteurMax(), true);
			writeToSubProcessStdin(VIT_DEPLACEMENT_MAX_CODE, p.getVitesseDeplacement().getValue(), true);
			writeToSubProcessStdin(VIT_HAUTEUR_MAX_CODE, p.getVitesseVerticale().getValue(), true);
			writeToSubProcessStdin(VIT_ROTATION_MAX_CODE, p.getVitesseRotation().getValue(), true);
		} catch (Exception e) {
			e.printStackTrace();
			process.destroy();
			System.exit(-1);
		}
	}

	@Override
	public void execDecoller(Decoller d) {
		try {
			while(droneState == DroneState.STOPPED) {
				hasStarted.await();
			}
			writeToSubProcessStdin(DECOLLER_INPUT_CODE, 0, true);
			// attendre que le drone reponde qu'il a bien decolle
			while(droneState != DroneState.FLYING) {
				hasTakenOff.await();
			}
		} catch (Exception e) {
			e.printStackTrace();
			process.destroy();
			System.exit(-1);
		}
	}

	@Override
	public void execAtterrir(Atterrir a) {
		try {
			writeToSubProcessStdin(ATTERRIR_INPUT_CODE, 0, true);
			// attendre que le drone reponde qu'il a bien atterri
			while(droneState != DroneState.LANDED) {
				hasLanded.await();
			}
		} catch (Exception e) {
			e.printStackTrace();
			process.destroy();
			System.exit(-1);
		}
	}

	@Override
	public void execAvancer(Avancer a) {
		try {
			writeToSubProcessStdin(AVANCER_INPUT_CODE, adaptVitesse(a.getVitesse(), ratioVitesseDeplacement), true);
			Thread.sleep(a.getDuree().getValue() * 1000);
			writeToSubProcessStdin(AVANCER_INPUT_CODE, 0, true);
		} catch (Exception e) {
			e.printStackTrace();
			process.destroy();
			System.exit(-1);
		}
	}

	@Override
	public void execReculer(Reculer r) {
		try {
			writeToSubProcessStdin(RECULER_INPUT_CODE, adaptVitesse(r.getVitesse(), ratioVitesseDeplacement), true);
			Thread.sleep(r.getDuree().getValue() * 1000);
			writeToSubProcessStdin(RECULER_INPUT_CODE, 0, true);
		} catch (Exception e) {
			e.printStackTrace();
			process.destroy();
			System.exit(-1);
		}
	}

	@Override
	public void execMonter(Monter m) {
		try {
			writeToSubProcessStdin(MONTER_INPUT_CODE, adaptVitesse(m.getVitesse(), ratioVitesseHauteur), true);
			Thread.sleep(m.getDuree().getValue() * 1000);
			writeToSubProcessStdin(MONTER_INPUT_CODE, 0, true);
		} catch (Exception e) {
			e.printStackTrace();
			process.destroy();
			System.exit(-1);
		}
	}

	@Override
	public void execDescendre(Descendre d) {
		try {
			writeToSubProcessStdin(DESCENDRE_INPUT_CODE, adaptVitesse(d.getVitesse(), ratioVitesseHauteur), true);
			Thread.sleep(d.getDuree().getValue() * 1000);
			writeToSubProcessStdin(DESCENDRE_INPUT_CODE, 0, true);
		} catch (Exception e) {
			e.printStackTrace();
			process.destroy();
			System.exit(-1);
		}
	}

	@Override
	public void execGauche(Gauche g) {
		try {
			writeToSubProcessStdin(GAUCHE_INPUT_CODE, adaptVitesse(g.getVitesse(), ratioVitesseDeplacement), true);
			Thread.sleep(g.getDuree().getValue() * 1000);
			writeToSubProcessStdin(GAUCHE_INPUT_CODE, 0, true);
		} catch (Exception e) {
			e.printStackTrace();
			process.destroy();
			System.exit(-1);
		}
	}

	@Override
	public void execDroite(Droite d) {
		try {
			writeToSubProcessStdin(DROITE_INPUT_CODE, adaptVitesse(d.getVitesse(), ratioVitesseDeplacement), true);
			Thread.sleep(d.getDuree().getValue() * 1000);
			writeToSubProcessStdin(DROITE_INPUT_CODE, 0, true);
		} catch (Exception e) {
			e.printStackTrace();
			process.destroy();
			System.exit(-1);
		}
	}

	@Override
	public void execRotationGauche(RotationGauche rg) {
		try {
			writeToSubProcessStdin(ROTATION_GAUCHE_INPUT_CODE, adaptVitesse(rg.getVitesse(), ratioVitesseRotation), true);
			Thread.sleep(rg.getDuree().getValue() * 1000);
			writeToSubProcessStdin(ROTATION_GAUCHE_INPUT_CODE, 0, true);
		} catch (Exception e) {
			e.printStackTrace();
			process.destroy();
			System.exit(-1);
		}
	}

	@Override
	public void execRotationDroite(RotationDroite rd) {
		try {
			writeToSubProcessStdin(ROTATION_DROITE_INPUT_CODE, adaptVitesse(rd.getVitesse(), ratioVitesseRotation), true);
			Thread.sleep(rd.getDuree().getValue() * 1000);
			writeToSubProcessStdin(ROTATION_DROITE_INPUT_CODE, 0, true);
		} catch (Exception e) {
			e.printStackTrace();
			process.destroy();
			System.exit(-1);
		}
	}

	@Override
	public void execPause(Pause p) {
		try {
			Thread.sleep(p.getDuree().getValue() * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			process.destroy();
			System.exit(-1);
		}
	}

	@Override
	public void execParallele(Parallele p) {
		List<Thread> threads = new ArrayList<Thread>();
		Set<CommandeParallelisable> commandes = p.getCommandes();
		
		try {
				
			for (Iterator<CommandeParallelisable> cmdItr = commandes.iterator(); cmdItr.hasNext();) {
				CommandeParallelisable commande = cmdItr.next();
				if(commande instanceof CommandeAvecDureeVitesse) {
					CommandeAvecDureeVitesse cmdDureeVitesse = CommandeAvecDureeVitesse.class.cast(commande);
					
					threads.add(new Thread(new Runnable() {
						
						@Override
						public void run() {
							try {
								Thread.sleep(cmdDureeVitesse.getDuree().getValue() * 1000);
								synchronized(bwOutputLock) {
									writeToSubProcessStdin(objToCommandeCode(commande), 0, true);
								}
							} catch (Exception e) {
								e.printStackTrace();
								process.destroy();
								System.exit(-1);
							}
						}
					}));	
				}
			}

			for (CommandeParallelisable commande : commandes) {
				if(commande instanceof CommandeAvecDureeVitesse) {
					CommandeAvecDureeVitesse cmdDureeVitesse = CommandeAvecDureeVitesse.class.cast(commande);
					if(isMouvementHorizontal(commande)) {
						writeToSubProcessStdin(objToCommandeCode(commande), adaptVitesse(cmdDureeVitesse.getVitesse(), ratioVitesseDeplacement), false);
					}
					else if (isMouvementVertical(commande)) {
						writeToSubProcessStdin(objToCommandeCode(commande), adaptVitesse(cmdDureeVitesse.getVitesse(), ratioVitesseHauteur), false);
					}
					else if (isRotation(commande)) {
						writeToSubProcessStdin(objToCommandeCode(commande), adaptVitesse(cmdDureeVitesse.getVitesse(), ratioVitesseRotation), false);
					}
				}
			}
			bwOutput.flush();
			
			for (Thread t : threads) {
				t.start();
			}
			
			for (Thread t : threads) {
				t.join();
			}

		} catch (Exception e) {
			e.printStackTrace();
			process.destroy();
			System.exit(-1);
		}
	}
	
	private static int adaptVitesse(Pourcent vitesse, double ratio) {
		return (int) Math.ceil(vitesse.getValue() * ratio);
	}
	
	private void writeToSubProcessStdin(int code, int value, boolean flush) throws IOException {
		StringBuilder sb = new StringBuilder();
		
		sb.append(code);
		sb.append(' ');
		sb.append(value);
		
		bwOutput.write(sb.toString());
		bwOutput.newLine();
		if(flush)
			bwOutput.flush();
	}
	
	private static int objToCommandeCode(CommandeParallelisable commande) {
		Class<?> clazz = commande.getClass();
		if(clazz.equals(Avancer.class)) {
			return AVANCER_INPUT_CODE;
		} else if(clazz.equals(Reculer.class)) {
			return RECULER_INPUT_CODE;
		} else if(clazz.equals(Monter.class)) {
			return MONTER_INPUT_CODE;
		} else if(clazz.equals(Descendre.class)) {
			return DESCENDRE_INPUT_CODE;
		} else if(clazz.equals(Gauche.class)) {
			return GAUCHE_INPUT_CODE;
		} else if(clazz.equals(Droite.class)) {
			return DROITE_INPUT_CODE;
		} else if(clazz.equals(RotationGauche.class)) {
			return ROTATION_GAUCHE_INPUT_CODE;
		} else if(clazz.equals(RotationDroite.class)) {
			return ROTATION_DROITE_INPUT_CODE;
		} else {
			return 0;
		}
	}
	
	private static boolean isMouvementHorizontal(CommandeParallelisable commande) {
		return commande instanceof Avancer || commande instanceof Reculer
				|| commande instanceof Gauche || commande instanceof Droite;
	}
	
	private static boolean isMouvementVertical(CommandeParallelisable commande) {
		return commande instanceof Monter || commande instanceof Descendre;
	}
	
	private static boolean isRotation(CommandeParallelisable commande) {
		return commande instanceof RotationGauche || commande instanceof RotationDroite;
	}

}