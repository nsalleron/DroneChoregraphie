/*
 * generated by Xtext 2.12.0
 */
package fr.idmteam1.idmproject.dronedsl.ui.tests;

import com.google.inject.Injector;
import fr.idmteam1.idmproject.dronedsl.ui.internal.DronedslActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class DroneDSLUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DronedslActivator.getInstance().getInjector("fr.idmteam1.idmproject.dronedsl.DroneDSL");
	}

}
