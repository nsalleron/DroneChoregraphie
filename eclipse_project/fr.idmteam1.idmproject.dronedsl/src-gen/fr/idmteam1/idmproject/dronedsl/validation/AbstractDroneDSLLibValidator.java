/*
 * generated by Xtext 2.12.0
 */
package fr.idmteam1.idmproject.dronedsl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractDroneDSLLibValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(fr.idmteam1.idmproject.dronedsl.droneDSLLib.DroneDSLLibPackage.eINSTANCE);
		return result;
	}
	
}
