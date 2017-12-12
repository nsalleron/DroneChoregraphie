/**
 * generated by Xtext 2.12.0
 */
package org.roboticiens.idmProject.droneMain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reculer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.roboticiens.idmProject.droneMain.Reculer#getDuree <em>Duree</em>}</li>
 *   <li>{@link org.roboticiens.idmProject.droneMain.Reculer#getVitesse_deplacement <em>Vitesse deplacement</em>}</li>
 * </ul>
 *
 * @see org.roboticiens.idmProject.droneMain.DroneMainPackage#getReculer()
 * @model
 * @generated
 */
public interface Reculer extends Statement, AR
{
  /**
   * Returns the value of the '<em><b>Duree</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Duree</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Duree</em>' containment reference.
   * @see #setDuree(IntExp)
   * @see org.roboticiens.idmProject.droneMain.DroneMainPackage#getReculer_Duree()
   * @model containment="true"
   * @generated
   */
  IntExp getDuree();

  /**
   * Sets the value of the '{@link org.roboticiens.idmProject.droneMain.Reculer#getDuree <em>Duree</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duree</em>' containment reference.
   * @see #getDuree()
   * @generated
   */
  void setDuree(IntExp value);

  /**
   * Returns the value of the '<em><b>Vitesse deplacement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vitesse deplacement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vitesse deplacement</em>' containment reference.
   * @see #setVitesse_deplacement(PourcentExp)
   * @see org.roboticiens.idmProject.droneMain.DroneMainPackage#getReculer_Vitesse_deplacement()
   * @model containment="true"
   * @generated
   */
  PourcentExp getVitesse_deplacement();

  /**
   * Sets the value of the '{@link org.roboticiens.idmProject.droneMain.Reculer#getVitesse_deplacement <em>Vitesse deplacement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vitesse deplacement</em>' containment reference.
   * @see #getVitesse_deplacement()
   * @generated
   */
  void setVitesse_deplacement(PourcentExp value);

} // Reculer