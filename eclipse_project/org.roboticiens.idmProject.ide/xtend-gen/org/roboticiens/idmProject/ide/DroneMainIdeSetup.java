/**
 * generated by Xtext 2.12.0
 */
package org.roboticiens.idmProject.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.roboticiens.idmProject.DroneMainRuntimeModule;
import org.roboticiens.idmProject.DroneMainStandaloneSetup;
import org.roboticiens.idmProject.ide.DroneMainIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class DroneMainIdeSetup extends DroneMainStandaloneSetup {
  @Override
  public Injector createInjector() {
    DroneMainRuntimeModule _droneMainRuntimeModule = new DroneMainRuntimeModule();
    DroneMainIdeModule _droneMainIdeModule = new DroneMainIdeModule();
    return Guice.createInjector(Modules2.mixin(_droneMainRuntimeModule, _droneMainIdeModule));
  }
}
