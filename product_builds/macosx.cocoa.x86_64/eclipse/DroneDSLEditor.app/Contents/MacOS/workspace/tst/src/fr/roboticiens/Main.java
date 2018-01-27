package fr.roboticiens;

import fr.roboticiens.commandes.*;
import fr.roboticiens.paralleles.*;
import fr.roboticiens.prologue.*;
import fr.roboticiens.runtime.*;
import fr.roboticiens.types.*;

public class Main {
	static DroneRuntime runtime = new DroneRuntimePrint();
	static Prologue prologue_460062681 = new Prologue(new Pourcent(100), new Pourcent(100), new Pourcent(100), 2, 2);
	public static void main(String[] args) {
		
		runtime.execPrologue(prologue_460062681);
		new Decoller().execute(runtime);
		new Atterrir().execute(runtime);	
	}
	
	
}
