package fr.roboticiens.commandes;

import fr.roboticiens.types.Pourcent;
import fr.roboticiens.types.Seconde;
import fr.roboticiens.runtime.DroneRuntime;

public class Droite extends CommandeAvecDureeVitesse implements CommandeBasique, CommandeParallelisable {

	public Droite(final Seconde duree, final Pourcent vitesse) {
		super(duree, vitesse);
	}

	@Override
	public void execute(DroneRuntime droneRuntime) {
		droneRuntime.execDroite(this);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Droite [duree=" + duree + ", vitesse=" + vitesse + "]";
	}
	
}
