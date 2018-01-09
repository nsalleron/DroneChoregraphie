/*
 * generated by Xtext 2.12.0
 */
package fr.idmteam1.idmproject.dronedsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import fr.idmteam1.idmproject.dronedsl.droneDSL.FonctionDecl
import fr.idmteam1.idmproject.dronedsl.droneDSL.Model
import fr.idmteam1.idmproject.dronedsl.droneDSL.Import
import org.eclipse.xtext.generator.IOutputConfigurationProvider
import org.eclipse.xtext.generator.OutputConfiguration
import org.eclipse.xtext.generator.IFileSystemAccess
import java.util.HashSet

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class DroneDSLGenerator extends AbstractGenerator implements IOutputConfigurationProvider {
	
	val stubFilesMap = newLinkedHashMap(
		"../src/fr/roboticiens/body/BodyInstruction.java" -> contentBodyInstructionClass(),
		"../src/fr/roboticiens/commandes/Atterrir.java" -> contentAtterrirClass(),
		"../src/fr/roboticiens/commandes/Avancer.java" -> contentAvancerClass(),
		"../src/fr/roboticiens/commandes/CommandeAvecDureeVitesse.java" -> contentCommandeAvecDureeVitesseClass(),
		"../src/fr/roboticiens/commandes/CommandeBasique.java" -> contentCommandeBasiqueClass(),
		"../src/fr/roboticiens/commandes/CommandeParallelisable.java" -> contentCommandeParallelisableClass(),
		"../src/fr/roboticiens/commandes/Decoller.java" -> contentDecollerClass(),
		"../src/fr/roboticiens/commandes/Descendre.java" -> contentDescendreClass(),
		"../src/fr/roboticiens/commandes/Droite.java" -> contentDroiteClass(),
		"../src/fr/roboticiens/commandes/Gauche.java" -> contentGaucheClass(),
		"../src/fr/roboticiens/commandes/Monter.java" -> contentMonterClass(),
		"../src/fr/roboticiens/commandes/Pause.java" -> contentPauseClass(),
		"../src/fr/roboticiens/commandes/Reculer.java" -> contentReculerClass(),
		"../src/fr/roboticiens/commandes/RotationDroite.java" -> contentRotationDroiteClass(),
		"../src/fr/roboticiens/commandes/RotationGauche.java" -> contentRotationGaucheClass(),
		"../src/fr/roboticiens/imports/Import.java" -> contentImportClass(),
		"../src/fr/roboticiens/paralleles/Parallele.java" -> contentParalleleClass(),
		"../src/fr/roboticiens/prologue/Prologue.java" -> contentPrologueClass(),
		"../src/fr/roboticiens/types/Pourcent.java" -> contentPourcentClass(),
		"../src/fr/roboticiens/types/Seconde.java" -> contentSecondeClass(),
		"../src/fr/roboticiens/runtime/DroneRuntime.java" -> contentDroneRuntimeClass(),
		"../src/fr/roboticiens/runtime/DroneRuntimeExecutable.java" -> contentDroneRuntimeExecutableClass(),
		"../src/fr/roboticiens/runtime/DroneRuntimePrint.java" -> contentDroneRuntimePrintClass()
	)
	
	val mainFilePath = "../src/fr/roboticiens/Main.java"
	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {

		if(!input.allContents.toIterable.filter(Model).empty) {
			generateStubFiles(fsa)
			
			for (m : input.allContents.toIterable.filter(Model)) {
				fsa.generateFile(mainFilePath, m.compile)
			}
		}
		fsa.deleteFile("../src-gen/")
	}
	
	def generateStubFiles(IFileSystemAccess2 fsa) {
		var itr = stubFilesMap.entrySet().iterator();
		while(itr.hasNext()) {
			var entry = itr.next()
			var filepath = entry.key
			var content = entry.value
			fsa.generateFile(filepath, content)
		}
	}
	
	/*
	    «IF e.imports!== null»
             « FOR f:e.imports»
         		 «f.compile»
             «ENDFOR»
        «ENDIF»
	 */
	
	def compile(Model e) 
		''' 
		package fr.roboticiens;
		
		import fr.roboticiens.commandes.*;
		//import fr.roboticiens.imports.*;
		import fr.roboticiens.paralleles.*;
		import fr.roboticiens.prologue.*;
		import fr.roboticiens.runtime.*;
		import fr.roboticiens.types.*;
		
		public class Main {
			static DroneRuntime runtime = new DroneRuntimePrint();
			«IF e.prologue!== null»
			                     « e.prologue.toString»
			«ENDIF»
			public static void main(String[] args) {
				
				runtime.execPrologue(prologue_« e.prologue.hashCode»);
				«e.m.decollage.toString»
	           	«FOR f : e.m.mainbody »
		       		«f.toString»
	            «ENDFOR»
				«e.m.atterrissage.toString»	
			}
			
			«IF e.fonctions!== null»
			    « FOR f:e.fonctions»
					«f.compile»
				«ENDFOR»
			«ENDIF»
			
		}
		
        '''
        
    def compile(FonctionDecl e)
    	'''	public static void «e.name»(DroneRuntime runtime) {
		« FOR f:e.body»
	«f.toString»
		«ENDFOR»
	}'''
        
    def compile(Import e) 
        '''
		import «e.toString».java;
        '''
	
	def contentDroneRuntimePrintClass() {
		'''
		package fr.roboticiens.runtime;
		
		import fr.roboticiens.commandes.Atterrir;
		import fr.roboticiens.commandes.Avancer;
		import fr.roboticiens.commandes.Decoller;
		import fr.roboticiens.commandes.Descendre;
		import fr.roboticiens.commandes.Droite;
		import fr.roboticiens.commandes.Gauche;
		import fr.roboticiens.commandes.Monter;
		import fr.roboticiens.commandes.Pause;
		import fr.roboticiens.commandes.Reculer;
		import fr.roboticiens.commandes.RotationDroite;
		import fr.roboticiens.commandes.RotationGauche;
		import fr.roboticiens.paralleles.Parallele;
		import fr.roboticiens.prologue.Prologue;
		
		public class DroneRuntimePrint implements DroneRuntime {
		
			@Override
			public void execPrologue(Prologue p) {
				System.out.println("Execution de " + p);
			}
		
			@Override
			public void execDecoller(Decoller d) {
				System.out.println("Execution de " + d);
			}
		
			@Override
			public void execAtterrir(Atterrir a) {
				System.out.println("Execution de " + a);
			}
		
			@Override
			public void execAvancer(Avancer a) {
				System.out.println("Execution de " + a);
			}
		
			@Override
			public void execReculer(Reculer r) {
				System.out.println("Execution de " + r);
			}
		
			@Override
			public void execMonter(Monter m) {
				System.out.println("Execution de " + m);
			}
		
			@Override
			public void execDescendre(Descendre d) {
				System.out.println("Execution de " + d);
			}
		
			@Override
			public void execGauche(Gauche g) {
				System.out.println("Execution de " + g);
			}
		
			@Override
			public void execDroite(Droite d) {
				System.out.println("Execution de " + d);
			}
		
			@Override
			public void execRotationGauche(RotationGauche rg) {
				System.out.println("Execution de " + rg);
			}
		
			@Override
			public void execRotationDroite(RotationDroite rd) {
				System.out.println("Execution de " + rd);
			}
		
			@Override
			public void execPause(Pause p) {
				System.out.println("Execution de " + p);
			}
		
			@Override
			public void execParallele(Parallele p) {
				System.out.println("Execution de " + p);
			}
		
		}
		'''
	}
	
	def contentDroneRuntimeExecutableClass() {
		'''
		package fr.roboticiens.runtime;
		
		public interface DroneRuntimeExecutable {
			
			public void execute(DroneRuntime droneRuntime);
		
		}
		'''
	}
	
	def contentDroneRuntimeClass() {
		'''
		package fr.roboticiens.runtime;
		
		import fr.roboticiens.commandes.Atterrir;
		import fr.roboticiens.commandes.Avancer;
		import fr.roboticiens.commandes.Decoller;
		import fr.roboticiens.commandes.Descendre;
		import fr.roboticiens.commandes.Droite;
		import fr.roboticiens.commandes.Gauche;
		import fr.roboticiens.commandes.Monter;
		import fr.roboticiens.commandes.Pause;
		import fr.roboticiens.commandes.Reculer;
		import fr.roboticiens.commandes.RotationDroite;
		import fr.roboticiens.commandes.RotationGauche;
		import fr.roboticiens.paralleles.Parallele;
		import fr.roboticiens.prologue.Prologue;
		
		public interface DroneRuntime {
			
			public void execPrologue(Prologue p);
			
			public void execDecoller(Decoller d);
			public void execAtterrir(Atterrir a);
			
			public void execAvancer(Avancer a);
			public void execReculer(Reculer r);
			public void execMonter(Monter m);
			public void execDescendre(Descendre d);
			public void execGauche(Gauche g);
			public void execDroite(Droite d);
			public void execRotationGauche(RotationGauche rg);
			public void execRotationDroite(RotationDroite rd);
			public void execPause(Pause p);
			
			public void execParallele(Parallele p);
			
		}
		'''
	}
	
	def contentSecondeClass() {
		'''
		package fr.roboticiens.types;
		
		public class Seconde {
			
			private final int value;
		
			public Seconde(final int value) {
				this.value = value;
			}
		
			/**
			 * @return the value
			 */
			public Integer getValue() {
				return value;
			}
		
			/* (non-Javadoc)
			 * @see java.lang.Object#toString()
			 */
			@Override
			public String toString() {
				return "Seconde [value=" + value + "]";
			}
			
		}
		'''
	}
	
	def contentPourcentClass() {
		'''
		package fr.roboticiens.types;
		
		public class Pourcent {
			
			private final int value;
		
			public Pourcent(final int value) {
				this.value = value;
			}
		
			/**
			 * @return the value
			 */
			public Integer getValue() {
				return value;
			}
		
			/* (non-Javadoc)
			 * @see java.lang.Object#toString()
			 */
			@Override
			public String toString() {
				return "Pourcent [value=" + value + "]";
			}
		
		}
		'''
	}
	
	def contentPrologueClass() {
		'''
		package fr.roboticiens.prologue;
		
		import fr.roboticiens.types.Pourcent;
		import fr.roboticiens.runtime.DroneRuntime;
		import fr.roboticiens.runtime.DroneRuntimeExecutable;
		
		public class Prologue implements DroneRuntimeExecutable {
			
			private final Pourcent vitesseVerticale;
			private final Pourcent vitesseDeplacement;
			private final Pourcent vitesseRotation;
			private final int hauteurMax;
			private final int eloignementMax;
			
			public Prologue(final Pourcent vitesseVerticale, final Pourcent vitesseDeplacement, 
					final Pourcent vitesseRotation, final int hauteurMax, final int eloignementMax) {
				
				this.vitesseVerticale = vitesseVerticale;
				this.vitesseDeplacement = vitesseDeplacement;
				this.vitesseRotation = vitesseRotation;
				this.hauteurMax = hauteurMax;
				this.eloignementMax = eloignementMax;
			}
		
			/**
			 * @return the vitesseVerticale
			 */
			public Pourcent getVitesseVerticale() {
				return vitesseVerticale;
			}
		
			/**
			 * @return the vitesseDeplacement
			 */
			public Pourcent getVitesseDeplacement() {
				return vitesseDeplacement;
			}
		
			/**
			 * @return the vitesseRotation
			 */
			public Pourcent getVitesseRotation() {
				return vitesseRotation;
			}
		
			/**
			 * @return the hauteurMax
			 */
			public int getHauteurMax() {
				return hauteurMax;
			}
		
			/**
			 * @return the eloignementMax
			 */
			public int getEloignementMax() {
				return eloignementMax;
			}
		
			@Override
			public void execute(DroneRuntime droneRuntime) {
				droneRuntime.execPrologue(this);
			}
		
			/* (non-Javadoc)
			 * @see java.lang.Object#toString()
			 */
			@Override
			public String toString() {
				return "Prologue [vitesseVerticale=" + vitesseVerticale + ", vitesseDeplacement=" + vitesseDeplacement + ", vitesseRotation=" + vitesseRotation + ", hauteurMax="
						+ hauteurMax + ", eloignementMax=" + eloignementMax + "]";
			}
		}
		'''
	}
	
	def contentParalleleClass() {
		'''
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
		'''
	}
	
	def contentImportClass() {
		'''
		package fr.roboticiens.imports;
		
		public class Import {
			
			private final String filename;
		
			public Import(final String filename) {
				super();
				this.filename = filename;
			}
		
			/**
			 * @return the filename
			 */
			public String getFilename() {
				return filename;
			}
			
		}
		'''
	}
	
	def contentRotationGaucheClass() {
		'''
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
		'''
	}
	
	def contentRotationDroiteClass() {
		'''
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
		'''
	}
	
	def contentReculerClass() {
		'''
		package fr.roboticiens.commandes;
		
		import fr.roboticiens.types.Pourcent;
		import fr.roboticiens.types.Seconde;
		import fr.roboticiens.runtime.DroneRuntime;
		
		public class Reculer extends CommandeAvecDureeVitesse implements CommandeBasique, CommandeParallelisable {
		
			public Reculer(final Seconde duree, final Pourcent vitesse) {
				super(duree, vitesse);
			}
		
			@Override
			public void execute(DroneRuntime droneRuntime) {
				droneRuntime.execReculer(this);
			}
		
			/* (non-Javadoc)
			 * @see java.lang.Object#toString()
			 */
			@Override
			public String toString() {
				return "Reculer [duree=" + duree + ", vitesse=" + vitesse + "]";
			}
		
		}
		'''
	}
	
	def contentPauseClass() {
		'''
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
		'''
	}
	
	def contentMonterClass() {
		'''
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
		'''
	}
	
	def contentGaucheClass() {
		'''
		package fr.roboticiens.commandes;
		
		import fr.roboticiens.types.Pourcent;
		import fr.roboticiens.types.Seconde;
		import fr.roboticiens.runtime.DroneRuntime;
		
		public class Gauche extends CommandeAvecDureeVitesse implements CommandeBasique, CommandeParallelisable {
		
			public Gauche(final Seconde duree, final Pourcent vitesse) {
				super(duree, vitesse);
			}
		
			@Override
			public void execute(DroneRuntime droneRuntime) {
				droneRuntime.execGauche(this);
			}
		
			/* (non-Javadoc)
			 * @see java.lang.Object#toString()
			 */
			@Override
			public String toString() {
				return "Gauche [duree=" + duree + ", vitesse=" + vitesse + "]";
			}
			
		}
		'''
	}
	
	def contentDroiteClass() {
		'''
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
		'''
	}
	
	def contentDescendreClass() {
		'''
		package fr.roboticiens.commandes;
		
		import fr.roboticiens.types.Pourcent;
		import fr.roboticiens.types.Seconde;
		import fr.roboticiens.runtime.DroneRuntime;
		
		public class Descendre extends CommandeAvecDureeVitesse implements CommandeBasique, CommandeParallelisable {
		
			public Descendre(final Seconde duree, final Pourcent vitesse) {
				super(duree, vitesse);
			}
		
			@Override
			public void execute(DroneRuntime droneRuntime) {
				droneRuntime.execDescendre(this);
			}
		
			/* (non-Javadoc)
			 * @see java.lang.Object#toString()
			 */
			@Override
			public String toString() {
				return "Descendre [duree=" + duree + ", vitesse=" + vitesse + "]";
			}
			
		}
		'''
	}
	
	def contentDecollerClass() {
		'''
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
		'''
	}
	
	def contentCommandeParallelisableClass() {
		'''
		package fr.roboticiens.commandes;
		
		public interface CommandeParallelisable {
		
		}
		'''
	}
	
	def contentCommandeBasiqueClass() {
		'''
		package fr.roboticiens.commandes;
		
		import fr.roboticiens.body.BodyInstruction;
		
		public interface CommandeBasique extends BodyInstruction {
		
		}
		'''
	}
	
	def contentCommandeAvecDureeVitesseClass() {
		'''
		package fr.roboticiens.commandes;
		
		import fr.roboticiens.types.Pourcent;
		import fr.roboticiens.types.Seconde;
		
		public abstract class CommandeAvecDureeVitesse {
			
			protected final Seconde duree;
			protected final Pourcent vitesse;
			
			public CommandeAvecDureeVitesse(final Seconde duree, final Pourcent vitesse) {
				this.duree = duree;
				this.vitesse = vitesse;
			}
		
			/**
			 * @return the duree
			 */
			public Seconde getDuree() {
				return duree;
			}
		
			/**
			 * @return the vitesse
			 */
			public Pourcent getVitesse() {
				return vitesse;
			}
		
		}
		'''
	}
	
	def contentAvancerClass() {
		'''
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
		'''
	}
	
	def contentAtterrirClass() {
		'''
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
		'''
	}
	
	def contentBodyInstructionClass() {
		'''
		package fr.roboticiens.body;
		
		import fr.roboticiens.runtime.DroneRuntimeExecutable;
		
		public interface BodyInstruction extends DroneRuntimeExecutable {
		
		}
		'''
	}
	override getOutputConfigurations() {
		
		// NON FONCTIONNEL
		var OutputConfiguration defaultOutput = new OutputConfiguration(IFileSystemAccess.DEFAULT_OUTPUT)
		defaultOutput.setDescription("Output Folder")
		defaultOutput.setOutputDirectory("./srcTEST")
		defaultOutput.setOverrideExistingResources(true)
		defaultOutput.setCreateOutputDirectory(false)
		defaultOutput.setCleanUpDerivedResources(true)
		defaultOutput.setSetDerivedProperty(true)
		var HashSet<OutputConfiguration> configurations = new HashSet<OutputConfiguration>()
		configurations.add(defaultOutput)
		return configurations
	}
	
}
