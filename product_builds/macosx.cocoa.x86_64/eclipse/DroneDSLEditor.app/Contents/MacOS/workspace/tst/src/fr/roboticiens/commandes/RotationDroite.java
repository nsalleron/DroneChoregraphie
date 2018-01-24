package fr.roboticiens.commandes;

import fr.roboticiens.types.Pourcent;
import fr.roboticiens.types.Seconde;
import fr.roboticiens.runtime.DroneRuntime;

public class RotationDroite extends CommandeAvecDureeVitesse implements CommandeBasique, CommandeParallelisable {

	public RotationDroite(final Seconde duree, final Pourcent vitesse) {
		super(duree, vitesse);
	}

	@Override
	public void execute(DroneRuntime droneRuntime) {
		droneRuntime.execRotationDroite(this);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RotationDroite [duree=" + duree + ", vitesse=" + vitesse + "]";
	}

}
