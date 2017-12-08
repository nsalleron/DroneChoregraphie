/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myTurtleDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Avancer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myTurtleDsl.Avancer#getDuree <em>Duree</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myTurtleDsl.Avancer#getVitesse_deplacement <em>Vitesse deplacement</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myTurtleDsl.MyTurtleDslPackage#getAvancer()
 * @model
 * @generated
 */
public interface Avancer extends AR, Statement
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
   * @see org.xtext.example.mydsl.myTurtleDsl.MyTurtleDslPackage#getAvancer_Duree()
   * @model containment="true"
   * @generated
   */
  IntExp getDuree();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myTurtleDsl.Avancer#getDuree <em>Duree</em>}' containment reference.
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
   * @see #setVitesse_deplacement(IntExp)
   * @see org.xtext.example.mydsl.myTurtleDsl.MyTurtleDslPackage#getAvancer_Vitesse_deplacement()
   * @model containment="true"
   * @generated
   */
  IntExp getVitesse_deplacement();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myTurtleDsl.Avancer#getVitesse_deplacement <em>Vitesse deplacement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vitesse deplacement</em>' containment reference.
   * @see #getVitesse_deplacement()
   * @generated
   */
  void setVitesse_deplacement(IntExp value);

} // Avancer
