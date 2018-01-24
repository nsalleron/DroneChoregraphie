package fr.roboticiens.commandes;

import fr.roboticiens.types.Pourcent;
import fr.roboticiens.types.Seconde;

public abstract class CommandeAvecDureeVitesse {
	
	protected final Seconde duree;
	protected final Pourcent vitesse;
	
	public CommandeAvecDureeVitesse(final Seconde duree, final Pourcent vitesse) {
		this.duree = duree;
		this.vitesse = vitesse;
	}

	/**
	 * @return the duree
	 */
	public Seconde getDuree() {
		return duree;
	}

	/**
	 * @return the vitesse
	 */
	public Pourcent getVitesse() {
		return vitesse;
	}

}
