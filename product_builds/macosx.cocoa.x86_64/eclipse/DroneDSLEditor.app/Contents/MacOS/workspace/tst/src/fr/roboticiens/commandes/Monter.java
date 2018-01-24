package fr.roboticiens.commandes;

import fr.roboticiens.types.Pourcent;
import fr.roboticiens.types.Seconde;
import fr.roboticiens.runtime.DroneRuntime;

public class Monter extends CommandeAvecDureeVitesse implements CommandeBasique, CommandeParallelisable {

	public Monter(final Seconde duree, final Pourcent vitesse) {
		super(duree, vitesse);
	}

	@Override
	public void execute(DroneRuntime droneRuntime) {
		droneRuntime.execMonter(this);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Monter [duree=" + duree + ", vitesse=" + vitesse + "]";
	}
	
}
