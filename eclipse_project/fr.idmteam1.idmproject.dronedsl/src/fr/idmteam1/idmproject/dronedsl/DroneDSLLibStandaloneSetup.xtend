/*
 * generated by Xtext 2.12.0
 */
package fr.idmteam1.idmproject.dronedsl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class DroneDSLLibStandaloneSetup extends DroneDSLLibStandaloneSetupGenerated {

	def static void doSetup() {
		new DroneDSLLibStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
