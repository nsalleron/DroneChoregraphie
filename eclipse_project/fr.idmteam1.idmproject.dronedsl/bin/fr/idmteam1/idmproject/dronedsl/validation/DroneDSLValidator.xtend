/*
 * generated by Xtext 2.12.0
 */
package fr.idmteam1.idmproject.dronedsl.validation

import fr.idmteam1.idmproject.dronedsl.droneDSL.Atterrir
import fr.idmteam1.idmproject.dronedsl.droneDSL.Decoller
import fr.idmteam1.idmproject.dronedsl.droneDSL.DroneDSLPackage
import fr.idmteam1.idmproject.dronedsl.droneDSL.FinDeMain
import fr.idmteam1.idmproject.dronedsl.droneDSL.FonctionCall
import fr.idmteam1.idmproject.dronedsl.droneDSL.FonctionDecl
import fr.idmteam1.idmproject.dronedsl.droneDSL.Main
import fr.idmteam1.idmproject.dronedsl.droneDSL.Mouvement
import java.util.ArrayList
import java.util.Collection
import java.util.HashMap
import java.util.List
import java.util.Map.Entry
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.CheckType

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class DroneDSLValidator extends AbstractDroneDSLValidator {
	
	public static val CYCLE_ERR = "recursionDetected"
	public static val CYCLE_MSG = "Erreur: recursion non autorisée"
	
	public static val ALREADY_FLYING = "alreadyFlying"
	public static val ALREADY_FLYING_MSG = "Erreur: le drone a déjà décollé"
	public static val ALREADY_LANDING = "alreadyLanding"
	public static val ALREADY_LANDING_MSG = "Erreur: le drone a déjà atterri"
	public static val MOVEMENT_WHILE_ONLAND = "movementWhileNotFlying"
	public static val MOVEMENT_WHILE_ONLAND_MSG = "Erreur: le drone ne peut pas effectué de mouvement lorsqu'il n'a pas décollé"

	private static var inMain = false
	private static var actualFunc = ""
	private static var map = new HashMap
	private static var isFlying = false
	
	private var cycleDetected = true
	private Object cycleTestLock = new Object()	
	
	@Check(CheckType.NORMAL)
	def validDecollageAtterrisageLogic(Main m) {
		
		synchronized(cycleTestLock) {
		
			if(cycleDetected) {
				return	
			}
				
			isFlying = false
			
			if(m.decollage !== null) {
				if(isFlying) {
					error(ALREADY_FLYING_MSG, DroneDSLPackage.Literals.MAIN__DECOLLAGE, ALREADY_FLYING)
					return
				} else {
					isFlying = true
				}
			}
			
			if(checkDecollageAtterrir(m.mainbody)) {
				return
			}
			
			if(m.atterrissage !== null) {
				if(!isFlying) {
					error(ALREADY_LANDING_MSG, DroneDSLPackage.Literals.MAIN__ATTERRISSAGE, ALREADY_LANDING)
					return
				} else {
					isFlying = false
				}
			}
		}
	}
	
	def Boolean checkDecollageAtterrir(Collection<EObject> instructions) {
		for(EObject obj : instructions) {
			if(obj instanceof Decoller) {
				if(errorIfAlreadyDecolle(obj)) {
					return true
				}
			} 
			else if (obj instanceof Atterrir) {
				if(errorIfAlreadyAtterri(obj)) {
					return true
				}
			}
			else if(obj instanceof Mouvement) {
				if(errorIfNotFlying(obj)) {
					return true
				}
			}
			else if(obj instanceof FonctionCall) {
				var fonctionCall = FonctionCall.cast(obj)
				var fonctionDecl =  fonctionCall.ref
				if(checkDecollageAtterrir(fonctionDecl.body)) {
					return true
				}
			}
		}
		return false 
	}
	
	def errorIfAlreadyDecolle(EObject obj) {
		if(isFlying) {
			error(ALREADY_FLYING_MSG, obj, null, ALREADY_FLYING)
			return true
		} else {
			isFlying = true
		}
		return false
	}
	
	def errorIfAlreadyAtterri(EObject obj) {
		if(!isFlying) {
			error(ALREADY_LANDING_MSG, obj, null, ALREADY_LANDING)
			return true
		} else {
			isFlying = false
		}
		return false
	}
	
	def errorIfNotFlying(EObject obj) {
		if(!isFlying) {
			error(MOVEMENT_WHILE_ONLAND_MSG, obj, null, MOVEMENT_WHILE_ONLAND)
			return true
		}
		return false
	}
	
	@Check(CheckType.FAST)
	def checkMain(Main m) {
		inMain = true
	}
	
	@Check(CheckType.FAST)
	def checkFinDeMain(FinDeMain fdm) {
		inMain = false
	}
	
	@Check(CheckType.FAST)
	def checkFunctionDecl(FonctionDecl decl) {
//		println(decl.name)
		actualFunc =  decl.name
		map.put(actualFunc, new ArrayList)
	}
	
	@Check(CheckType.FAST)
	def validFunctionCall(FonctionCall call) {
		synchronized(cycleTestLock) {
			cycleDetected = true
			if(!inMain){
				if(!actualFunc.equals(call.ref.name)){
					(map.get(actualFunc) as List<Object>).add(call.ref.name)
					printMap()
					cycleDetected = checkCycle()
				}
				else{
					println("ERREUR DE CYCLE")
					cycleDetected = true
					error(CYCLE_MSG, DroneDSLPackage.Literals.FONCTION_CALL__REF, CYCLE_ERR)
				}
			}
		}
	}
	
	def printMap() {
		var set = map.entrySet();
		var iterator = set.iterator();
		while(iterator.hasNext()) {
			var mentry = iterator.next() as Entry<Object, Object>;
			System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
			System.out.println(mentry.getValue());
		}
	}
	
	/**
	 * Parcourt la map, pour chaque element de la liste de la clef en cours d'analyse (key)
	 * on verifie le cycle via la fonction checkCycleProfond
	 */
	def Boolean checkCycle() {
		var set = map.entrySet();
		var iterator = set.iterator();
		// Clef en cours d'analyse
		var key = ""
		
		// Parcourt de la map
		while(iterator.hasNext()) {
			// Recuperer l'iterator
			var mentry = iterator.next() as Entry<Object, Object>;
			// Recuperer la clef en cours d'analyse
			key = mentry.getKey() as String
			// Recuperer la liste des fonctions qu'elle appelle
			var funcCallList = mentry.getValue() as List<Object>
			// cf ci-dessous
			if(checkCycleProfond(key, funcCallList))
				return true
		}
		return false
	}
	
	/**
	 * Alors la c'est chaud.
	 * @param funcCallList c'est la liste des fonctions appelees par la fonction de nom key
	 * 
	 */
	def Boolean checkCycleProfond(String key, List<Object> funcCallList) {
		// fonction en cours d'analyse
		var func = ""
		
		// Parcourt la liste des fonctions appelees par key
		for(var i = 0; i < funcCallList.size; i++) {
				// On recupere la fonction appelee
				func = funcCallList.get(i) as String
				// On recupere la liste des fonctions appelee par cette fonction
				var list = map.get(func) as List<Object>
				
				// Parcourt de cette liste
				for(var j = 0; j < list.size; j++) {
					
					// Si elle appelle la fonction key (recursion croisee) c'est mort
					// @TODO : Faire error(...)
					if((list.get(j) as String).equals(key as String)) {
						println("ERREUR DE CYCLE")
						error(CYCLE_MSG, DroneDSLPackage.Literals.FONCTION_CALL__REF, CYCLE_ERR)
						cycleDetected = true
						return true
					// Sinon il faut faire un appel recursif la complexite est ouf mais ca passe
					} else {
						// On recupere la fonctions appelee
						var func2 = list.get(j) as String
						// Evite de boucler sur soit meme
						if(!func2.equals(key)) {
							// Et c'est reparti
							var list2 = map.get(func2) as List<Object>
							if(checkCycleProfond(key, list2))
								return true
						}
					}
			}
		}
		return false
	}
	
}
