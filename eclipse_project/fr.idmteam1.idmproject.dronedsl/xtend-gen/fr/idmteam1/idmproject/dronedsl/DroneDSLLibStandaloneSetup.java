/**
 * generated by Xtext 2.12.0
 */
package fr.idmteam1.idmproject.dronedsl;

import fr.idmteam1.idmproject.dronedsl.DroneDSLLibStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class DroneDSLLibStandaloneSetup extends DroneDSLLibStandaloneSetupGenerated {
  public static void doSetup() {
    new DroneDSLLibStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
