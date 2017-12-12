/*
 * generated by Xtext 2.12.0
 */
package fr.idmteam1.idmproject.dronedsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class DroneDSLGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(Greeting)
//				.map[name]
//				.join(', '))
//		generateMainFile(fsa)
	}
	
	def generateMainFile(IFileSystemAccess2 fsa) {
		fsa.generateFile('main.main_drone', mainContent())
	}
	
	def mainContent() {
		'''
		// generated mandatory constants
		define vitesse_hauteur_max 100%
		define vitesse_deplacement_max 100%
		define vitesse_rotation_max 100%
		define hauteur_max 3
		define eloignement_max 4
		
		// generated pseudo DroneDSL main
		main {
			decoller()
			// TODO
			atterrir()
		}
		'''
	}
}