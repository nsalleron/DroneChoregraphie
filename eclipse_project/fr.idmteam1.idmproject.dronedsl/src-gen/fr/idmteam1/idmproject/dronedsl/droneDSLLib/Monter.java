/**
 * generated by Xtext 2.12.0
 */
package fr.idmteam1.idmproject.dronedsl.droneDSLLib;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSLLib.Monter#getDuree <em>Duree</em>}</li>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSLLib.Monter#getVitesse <em>Vitesse</em>}</li>
 * </ul>
 *
 * @see fr.idmteam1.idmproject.dronedsl.droneDSLLib.DroneDSLLibPackage#getMonter()
 * @model
 * @generated
 */
public interface Monter extends Mouvement, CommandeBasique, MD
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
   * @see fr.idmteam1.idmproject.dronedsl.droneDSLLib.DroneDSLLibPackage#getMonter_Duree()
   * @model containment="true"
   * @generated
   */
  SecondeExp getDuree();

  /**
   * Sets the value of the '{@link fr.idmteam1.idmproject.dronedsl.droneDSLLib.Monter#getDuree <em>Duree</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duree</em>' containment reference.
   * @see #getDuree()
   * @generated
   */
  void setDuree(SecondeExp value);

  /**
   * Returns the value of the '<em><b>Vitesse</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vitesse</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vitesse</em>' containment reference.
   * @see #setVitesse(PourcentExp)
   * @see fr.idmteam1.idmproject.dronedsl.droneDSLLib.DroneDSLLibPackage#getMonter_Vitesse()
   * @model containment="true"
   * @generated
   */
  PourcentExp getVitesse();

  /**
   * Sets the value of the '{@link fr.idmteam1.idmproject.dronedsl.droneDSLLib.Monter#getVitesse <em>Vitesse</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vitesse</em>' containment reference.
   * @see #getVitesse()
   * @generated
   */
  void setVitesse(PourcentExp value);

} // Monter
