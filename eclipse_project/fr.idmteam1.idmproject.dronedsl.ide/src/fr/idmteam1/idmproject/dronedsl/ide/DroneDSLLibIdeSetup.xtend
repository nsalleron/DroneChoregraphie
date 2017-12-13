/*
 * generated by Xtext 2.12.0
 */
package fr.idmteam1.idmproject.dronedsl.ide

import com.google.inject.Guice
import fr.idmteam1.idmproject.dronedsl.DroneDSLLibRuntimeModule
import fr.idmteam1.idmproject.dronedsl.DroneDSLLibStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class DroneDSLLibIdeSetup extends DroneDSLLibStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new DroneDSLLibRuntimeModule, new DroneDSLLibIdeModule))
	}
	
}