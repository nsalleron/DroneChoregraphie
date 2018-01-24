package fr.roboticiens.prologue;

import fr.roboticiens.types.Pourcent;
import fr.roboticiens.runtime.DroneRuntime;
import fr.roboticiens.runtime.DroneRuntimeExecutable;

public class Prologue implements DroneRuntimeExecutable {
	
	private final Pourcent vitesseVerticale;
	private final Pourcent vitesseDeplacement;
	private final Pourcent vitesseRotation;
	private final int hauteurMax;
	private final int eloignementMax;
	
	public Prologue(final Pourcent vitesseVerticale, final Pourcent vitesseDeplacement, 
			final Pourcent vitesseRotation, final int hauteurMax, final int eloignementMax) {
		
		this.vitesseVerticale = vitesseVerticale;
		this.vitesseDeplacement = vitesseDeplacement;
		this.vitesseRotation = vitesseRotation;
		this.hauteurMax = hauteurMax;
		this.eloignementMax = eloignementMax;
	}

	/**
	 * @return the vitesseVerticale
	 */
	public Pourcent getVitesseVerticale() {
		return vitesseVerticale;
	}

	/**
	 * @return the vitesseDeplacement
	 */
	public Pourcent getVitesseDeplacement() {
		return vitesseDeplacement;
	}

	/**
	 * @return the vitesseRotation
	 */
	public Pourcent getVitesseRotation() {
		return vitesseRotation;
	}

	/**
	 * @return the hauteurMax
	 */
	public int getHauteurMax() {
		return hauteurMax;
	}

	/**
	 * @return the eloignementMax
	 */
	public int getEloignementMax() {
		return eloignementMax;
	}

	@Override
	public void execute(DroneRuntime droneRuntime) {
		droneRuntime.execPrologue(this);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Prologue [vitesseVerticale=" + vitesseVerticale + ", vitesseDeplacement=" + vitesseDeplacement + ", vitesseRotation=" + vitesseRotation + ", hauteurMax="
				+ hauteurMax + ", eloignementMax=" + eloignementMax + "]";
	}
}
