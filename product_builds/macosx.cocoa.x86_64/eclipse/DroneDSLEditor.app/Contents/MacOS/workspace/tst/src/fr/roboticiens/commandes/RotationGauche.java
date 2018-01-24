package fr.roboticiens.commandes;

import fr.roboticiens.types.Pourcent;
import fr.roboticiens.types.Seconde;
import fr.roboticiens.runtime.DroneRuntime;

public class RotationGauche extends CommandeAvecDureeVitesse implements CommandeBasique, CommandeParallelisable {

	public RotationGauche(final Seconde duree, final Pourcent vitesse) {
		super(duree, vitesse);
	}

	@Override
	public void execute(DroneRuntime droneRuntime) {
		droneRuntime.execRotationGauche(this);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RotationGauche [duree=" + duree + ", vitesse=" + vitesse + "]";
	}

}
