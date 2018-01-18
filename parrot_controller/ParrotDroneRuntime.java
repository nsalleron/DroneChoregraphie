package fr.roboticiens.runtime;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

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
	
	
	
	private ProcessBuilder processBuilder;
	private Process process;
	
	private InputStream input;
	private OutputStream output;
	private InputStream error;
	private BufferedReader brInput;
	private BufferedWriter bwOutput;
	private BufferedReader brError;
	private Object bwOutputLock = new Object();
	
	private Thread printerThread;
	
	public ParrotDroneRuntime(final String parrotExecutablePath) {
		 try {
			 this.processBuilder = new ProcessBuilder(parrotExecutablePath);
			 this.process = processBuilder.start();
			 
			 this.input = process.getInputStream();
			 this.output = process.getOutputStream();
			 this.error = process.getErrorStream();
			 
			 this.brInput = new BufferedReader(new InputStreamReader(input));
			 this.bwOutput = new BufferedWriter(new OutputStreamWriter(output));
			 this.brError = new BufferedReader(new InputStreamReader(error));
			 
			 this.printerThread = new Thread(new Runnable() {
				 
				@Override
				public void run() {
					String line = null;
					try {
						while((line = brError.readLine()) != null) {
							System.out.println(line);
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			 });
			 this.printerThread.start();
			 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void execPrologue(Prologue p) {
		try {
			writeToSubProcessStdin(ELOIGNEMENT_MAX_CODE, p.getEloignementMax(), true);
			writeToSubProcessStdin(HAUTEUR_MAX_CODE, p.getHauteurMax(), true);
			writeToSubProcessStdin(VIT_DEPLACEMENT_MAX_CODE, p.getVitesseDeplacement().getValue(), true);
			writeToSubProcessStdin(VIT_HAUTEUR_MAX_CODE, p.getVitesseVerticale().getValue(), true);
			writeToSubProcessStdin(VIT_ROTATION_MAX_CODE, p.getVitesseRotation().getValue(), true);
		} catch (IOException e) {
			// TODO: handle exception
		}
	}

	@Override
	public void execDecoller(Decoller d) {
		try {
			writeToSubProcessStdin(DECOLLER_INPUT_CODE, 0, true);
			// TODO attendre que le drone réponde qu'il est prêt à bouger ?
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void execAtterrir(Atterrir a) {
		try {
			writeToSubProcessStdin(ATTERRIR_INPUT_CODE, 0, true);
			// TODO attendre que le drone réponde qu'il est bien au sol ?
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void execAvancer(Avancer a) {
		try {
			writeToSubProcessStdin(AVANCER_INPUT_CODE, a.getVitesse().getValue(), true);
			Thread.sleep(a.getDuree().getValue() * 1000);
			writeToSubProcessStdin(AVANCER_INPUT_CODE, 0, true);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void execReculer(Reculer r) {
		try {
			writeToSubProcessStdin(RECULER_INPUT_CODE, r.getVitesse().getValue(), true);
			Thread.sleep(r.getDuree().getValue() * 1000);
			writeToSubProcessStdin(RECULER_INPUT_CODE, 0, true);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void execMonter(Monter m) {
		try {
			writeToSubProcessStdin(MONTER_INPUT_CODE, m.getVitesse().getValue(), true);
			Thread.sleep(m.getDuree().getValue() * 1000);
			writeToSubProcessStdin(MONTER_INPUT_CODE, 0, true);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void execDescendre(Descendre d) {
		try {
			writeToSubProcessStdin(DESCENDRE_INPUT_CODE, d.getVitesse().getValue(), true);
			Thread.sleep(d.getDuree().getValue() * 1000);
			writeToSubProcessStdin(DESCENDRE_INPUT_CODE, 0, true);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void execGauche(Gauche g) {
		try {
			writeToSubProcessStdin(GAUCHE_INPUT_CODE, g.getVitesse().getValue(), true);
			Thread.sleep(g.getDuree().getValue() * 1000);
			writeToSubProcessStdin(GAUCHE_INPUT_CODE, 0, true);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void execDroite(Droite d) {
		try {
			writeToSubProcessStdin(DROITE_INPUT_CODE, d.getVitesse().getValue(), true);
			Thread.sleep(d.getDuree().getValue() * 1000);
			writeToSubProcessStdin(DROITE_INPUT_CODE, 0, true);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void execRotationGauche(RotationGauche rg) {
		try {
			writeToSubProcessStdin(ROTATION_GAUCHE_INPUT_CODE, rg.getVitesse().getValue(), true);
			Thread.sleep(rg.getDuree().getValue() * 1000);
			writeToSubProcessStdin(ROTATION_GAUCHE_INPUT_CODE, 0, true);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void execRotationDroite(RotationDroite rd) {
		try {
			writeToSubProcessStdin(ROTATION_DROITE_INPUT_CODE, rd.getVitesse().getValue(), true);
			Thread.sleep(rd.getDuree().getValue() * 1000);
			writeToSubProcessStdin(ROTATION_DROITE_INPUT_CODE, 0, true);
		} catch (InterruptedException e) {
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void execPause(Pause p) {
		try {
			Thread.sleep(p.getDuree().getValue() * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
	}

	@Override
	public void execParallele(Parallele p) {
		List<Thread> threads = new ArrayList<Thread>();
		Set<CommandeParallelisable> commandes = p.getCommandes();
		
		try {
			
			for (CommandeParallelisable commande : commandes) {
				if(commande instanceof CommandeAvecDureeVitesse) {
					CommandeAvecDureeVitesse cmdDureeVitesse = CommandeAvecDureeVitesse.class.cast(commande);
					writeToSubProcessStdin(objToCommandeCode(commande), cmdDureeVitesse.getVitesse().getValue(), false);
				}
			}
			bwOutput.flush();
			
			for (Iterator<CommandeParallelisable> cmdItr = commandes.iterator(); cmdItr.hasNext();) {
				CommandeParallelisable commande = cmdItr.next();
				if(commande instanceof CommandeAvecDureeVitesse) {
					CommandeAvecDureeVitesse cmdDureeVitesse = CommandeAvecDureeVitesse.class.cast(commande);
					
					threads.add(new Thread(new Runnable() {
						
						@Override
						public void run() {
							try {
								Thread.sleep(cmdDureeVitesse.getDuree().getValue()*1000);
								synchronized(bwOutputLock) {
									writeToSubProcessStdin(objToCommandeCode(commande), 0, true);
								}
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}));	
				}
			}
			
			for (Thread t : threads) {
				t.start();
			}
			
			for (Thread t : threads) {
				t.join();
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

}
