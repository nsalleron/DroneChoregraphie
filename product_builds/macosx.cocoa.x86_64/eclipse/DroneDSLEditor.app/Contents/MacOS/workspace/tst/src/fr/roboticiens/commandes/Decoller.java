package fr.roboticiens.commandes;

import fr.roboticiens.runtime.DroneRuntime;

public class Decoller implements CommandeBasique {

	@Override
	public void execute(DroneRuntime droneRuntime) {
		droneRuntime.execDecoller(this);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Decoller []";
	}

}
