package fr.roboticiens.paralleles;

import java.util.HashSet;
import java.util.Set;

import fr.roboticiens.body.BodyInstruction;
import fr.roboticiens.commandes.CommandeParallelisable;
import fr.roboticiens.runtime.DroneRuntime;

public class Parallele implements BodyInstruction {
	
	private Set<CommandeParallelisable> commandes;
	
	public Parallele() {
		this.commandes = new HashSet<CommandeParallelisable>();
	}
	
	public boolean addCommande(final CommandeParallelisable cp) {
		return commandes.add(cp);
	}

	/**
	 * @return the commandes
	 */
	public Set<CommandeParallelisable> getCommandes() {
		return commandes;
	}

	@Override
	public void execute(DroneRuntime droneRuntime) {
		droneRuntime.execParallele(this);
	}

	@Override
	public String toString() {
		String tmp = "Parallele" + commandes.size() + " [\n";
		for (CommandeParallelisable e : commandes) {
			tmp += "\t" + e.toString() + "\n";
		}
		tmp += "]";
		return tmp;
	}
}
