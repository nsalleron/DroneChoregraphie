/**
 * generated by Xtext 2.12.0
 */
package fr.idmteam1.idmproject.dronedsl.droneDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pourcent vitesse hauteur max</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Pourcent_vitesse_hauteur_max#getVitesse_verticale <em>Vitesse verticale</em>}</li>
 * </ul>
 *
 * @see fr.idmteam1.idmproject.dronedsl.droneDSL.DroneDSLPackage#getPourcent_vitesse_hauteur_max()
 * @model
 * @generated
 */
public interface Pourcent_vitesse_hauteur_max extends EObject
{
  /**
   * Returns the value of the '<em><b>Vitesse verticale</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vitesse verticale</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vitesse verticale</em>' containment reference.
   * @see #setVitesse_verticale(PourcentConst)
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.DroneDSLPackage#getPourcent_vitesse_hauteur_max_Vitesse_verticale()
   * @model containment="true"
   * @generated
   */
  PourcentConst getVitesse_verticale();

  /**
   * Sets the value of the '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Pourcent_vitesse_hauteur_max#getVitesse_verticale <em>Vitesse verticale</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vitesse verticale</em>' containment reference.
   * @see #getVitesse_verticale()
   * @generated
   */
  void setVitesse_verticale(PourcentConst value);

} // Pourcent_vitesse_hauteur_max
