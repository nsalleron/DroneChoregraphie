package fr.roboticiens.commandes;

import fr.roboticiens.types.Pourcent;
import fr.roboticiens.types.Seconde;
import fr.roboticiens.runtime.DroneRuntime;

public class Avancer extends CommandeAvecDureeVitesse implements CommandeBasique, CommandeParallelisable {

	public Avancer(final Seconde duree, final Pourcent vitesse) {
		super(duree, vitesse);
	}

	@Override
	public void execute(DroneRuntime droneRuntime) {
		droneRuntime.execAvancer(this);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Avancer [duree=" + duree + ", vitesse=" + vitesse + "]";
	}
	
}
