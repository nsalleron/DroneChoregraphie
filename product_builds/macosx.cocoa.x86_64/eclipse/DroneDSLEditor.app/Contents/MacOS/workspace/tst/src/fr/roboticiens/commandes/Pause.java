package fr.roboticiens.commandes;

import fr.roboticiens.types.Seconde;
import fr.roboticiens.runtime.DroneRuntime;

public class Pause implements CommandeBasique {
	
	protected final Seconde duree;
	
	public Pause(final Seconde duree) {
		this.duree = duree;
	}

	/**
	 * @return the duree
	 */
	public Seconde getDuree() {
		return duree;
	}

	@Override
	public void execute(DroneRuntime droneRuntime) {
		droneRuntime.execPause(this);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pause [duree=" + duree + "]";
	}
	
}
