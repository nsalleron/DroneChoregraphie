/**
 * generated by Xtext 2.12.0
 */
package org.roboticiens.idmProject.droneMain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eloignement max</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.roboticiens.idmProject.droneMain.Eloignement_max#getHauteur_max <em>Hauteur max</em>}</li>
 * </ul>
 *
 * @see org.roboticiens.idmProject.droneMain.DroneMainPackage#getEloignement_max()
 * @model
 * @generated
 */
public interface Eloignement_max extends EObject
{
  /**
   * Returns the value of the '<em><b>Hauteur max</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hauteur max</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hauteur max</em>' containment reference.
   * @see #setHauteur_max(IntExp)
   * @see org.roboticiens.idmProject.droneMain.DroneMainPackage#getEloignement_max_Hauteur_max()
   * @model containment="true"
   * @generated
   */
  IntExp getHauteur_max();

  /**
   * Sets the value of the '{@link org.roboticiens.idmProject.droneMain.Eloignement_max#getHauteur_max <em>Hauteur max</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hauteur max</em>' containment reference.
   * @see #getHauteur_max()
   * @generated
   */
  void setHauteur_max(IntExp value);

} // Eloignement_max