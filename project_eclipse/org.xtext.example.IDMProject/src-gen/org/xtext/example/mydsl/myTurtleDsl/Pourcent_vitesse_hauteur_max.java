/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myTurtleDsl;

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
 *   <li>{@link org.xtext.example.mydsl.myTurtleDsl.Pourcent_vitesse_hauteur_max#getVitesse_verticale <em>Vitesse verticale</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myTurtleDsl.MyTurtleDslPackage#getPourcent_vitesse_hauteur_max()
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
   * @see #setVitesse_verticale(IntExp)
   * @see org.xtext.example.mydsl.myTurtleDsl.MyTurtleDslPackage#getPourcent_vitesse_hauteur_max_Vitesse_verticale()
   * @model containment="true"
   * @generated
   */
  IntExp getVitesse_verticale();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myTurtleDsl.Pourcent_vitesse_hauteur_max#getVitesse_verticale <em>Vitesse verticale</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vitesse verticale</em>' containment reference.
   * @see #getVitesse_verticale()
   * @generated
   */
  void setVitesse_verticale(IntExp value);

} // Pourcent_vitesse_hauteur_max
