/**
 * generated by Xtext 2.12.0
 */
package fr.idmteam1.idmproject.dronedsl.droneDSLLib;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotation Gauche</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSLLib.RotationGauche#getDuree <em>Duree</em>}</li>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSLLib.RotationGauche#getVitesse_rotation <em>Vitesse rotation</em>}</li>
 * </ul>
 *
 * @see fr.idmteam1.idmproject.dronedsl.droneDSLLib.DroneDSLLibPackage#getRotationGauche()
 * @model
 * @generated
 */
public interface RotationGauche extends Mouvement, CommandeBasique, RGRD
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
   * @see #setDuree(SecondeExp)
   * @see fr.idmteam1.idmproject.dronedsl.droneDSLLib.DroneDSLLibPackage#getRotationGauche_Duree()
   * @model containment="true"
   * @generated
   */
  SecondeExp getDuree();

  /**
   * Sets the value of the '{@link fr.idmteam1.idmproject.dronedsl.droneDSLLib.RotationGauche#getDuree <em>Duree</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duree</em>' containment reference.
   * @see #getDuree()
   * @generated
   */
  void setDuree(SecondeExp value);

  /**
   * Returns the value of the '<em><b>Vitesse rotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vitesse rotation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vitesse rotation</em>' containment reference.
   * @see #setVitesse_rotation(PourcentExp)
   * @see fr.idmteam1.idmproject.dronedsl.droneDSLLib.DroneDSLLibPackage#getRotationGauche_Vitesse_rotation()
   * @model containment="true"
   * @generated
   */
  PourcentExp getVitesse_rotation();

  /**
   * Sets the value of the '{@link fr.idmteam1.idmproject.dronedsl.droneDSLLib.RotationGauche#getVitesse_rotation <em>Vitesse rotation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vitesse rotation</em>' containment reference.
   * @see #getVitesse_rotation()
   * @generated
   */
  void setVitesse_rotation(PourcentExp value);

} // RotationGauche
