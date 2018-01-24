package fr.roboticiens.runtime;

import fr.roboticiens.commandes.Atterrir;
import fr.roboticiens.commandes.Avancer;
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

public interface DroneRuntime {
	
	public void execPrologue(Prologue p);
	
	public void execDecoller(Decoller d);
	public void execAtterrir(Atterrir a);
	
	public void execAvancer(Avancer a);
	public void execReculer(Reculer r);
	public void execMonter(Monter m);
	public void execDescendre(Descendre d);
	public void execGauche(Gauche g);
	public void execDroite(Droite d);
	public void execRotationGauche(RotationGauche rg);
	public void execRotationDroite(RotationDroite rd);
	public void execPause(Pause p);
	
	public void execParallele(Parallele p);
	
}
