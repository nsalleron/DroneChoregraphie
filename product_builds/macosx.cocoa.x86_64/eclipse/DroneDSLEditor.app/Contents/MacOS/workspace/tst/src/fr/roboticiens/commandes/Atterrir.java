package fr.roboticiens.commandes;

import fr.roboticiens.runtime.DroneRuntime;

public class Atterrir implements CommandeBasique {

	@Override
	public void execute(DroneRuntime droneRuntime) {
		droneRuntime.execAtterrir(this);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Atterrir []";
	}
	
}
