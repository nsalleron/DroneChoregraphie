/**
 * generated by Xtext 2.12.0
 */
package fr.idmteam1.idmproject.dronedsl.droneDSLLib;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Droite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSLLib.Droite#getDuree <em>Duree</em>}</li>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSLLib.Droite#getVitesse_deplacement <em>Vitesse deplacement</em>}</li>
 * </ul>
 *
 * @see fr.idmteam1.idmproject.dronedsl.droneDSLLib.DroneDSLLibPackage#getDroite()
 * @model
 * @generated
 */
public interface Droite extends Mouvement, CommandeBasique, GDr
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
   * @see fr.idmteam1.idmproject.dronedsl.droneDSLLib.DroneDSLLibPackage#getDroite_Duree()
   * @model containment="true"
   * @generated
   */
  SecondeExp getDuree();

  /**
   * Sets the value of the '{@link fr.idmteam1.idmproject.dronedsl.droneDSLLib.Droite#getDuree <em>Duree</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duree</em>' containment reference.
   * @see #getDuree()
   * @generated
   */
  void setDuree(SecondeExp value);

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
   * @see fr.idmteam1.idmproject.dronedsl.droneDSLLib.DroneDSLLibPackage#getDroite_Vitesse_deplacement()
   * @model containment="true"
   * @generated
   */
  PourcentExp getVitesse_deplacement();

  /**
   * Sets the value of the '{@link fr.idmteam1.idmproject.dronedsl.droneDSLLib.Droite#getVitesse_deplacement <em>Vitesse deplacement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vitesse deplacement</em>' containment reference.
   * @see #getVitesse_deplacement()
   * @generated
   */
  void setVitesse_deplacement(PourcentExp value);

} // Droite
