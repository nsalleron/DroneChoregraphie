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

public class DroneRuntimePrint implements DroneRuntime {

	@Override
	public void execPrologue(Prologue p) {
		System.out.println("Execution de " + p);
	}

	@Override
	public void execDecoller(Decoller d) {
		System.out.println("Execution de " + d);
	}

	@Override
	public void execAtterrir(Atterrir a) {
		System.out.println("Execution de " + a);
	}

	@Override
	public void execAvancer(Avancer a) {
		System.out.println("Execution de " + a);
	}

	@Override
	public void execReculer(Reculer r) {
		System.out.println("Execution de " + r);
	}

	@Override
	public void execMonter(Monter m) {
		System.out.println("Execution de " + m);
	}

	@Override
	public void execDescendre(Descendre d) {
		System.out.println("Execution de " + d);
	}

	@Override
	public void execGauche(Gauche g) {
		System.out.println("Execution de " + g);
	}

	@Override
	public void execDroite(Droite d) {
		System.out.println("Execution de " + d);
	}

	@Override
	public void execRotationGauche(RotationGauche rg) {
		System.out.println("Execution de " + rg);
	}

	@Override
	public void execRotationDroite(RotationDroite rd) {
		System.out.println("Execution de " + rd);
	}

	@Override
	public void execPause(Pause p) {
		System.out.println("Execution de " + p);
	}

	@Override
	public void execParallele(Parallele p) {
		System.out.println("Execution de " + p);
	}

}
