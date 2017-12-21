/**
 * generated by Xtext 2.12.0
 */
package fr.idmteam1.idmproject.dronedsl.droneDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prologue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Prologue#getVitesse_verticale <em>Vitesse verticale</em>}</li>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Prologue#getVitesse_deplacement <em>Vitesse deplacement</em>}</li>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Prologue#getVitesse_rotation <em>Vitesse rotation</em>}</li>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Prologue#getHauteur <em>Hauteur</em>}</li>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Prologue#getEloignement <em>Eloignement</em>}</li>
 * </ul>
 *
 * @see fr.idmteam1.idmproject.dronedsl.droneDSL.DroneDSLPackage#getPrologue()
 * @model
 * @generated
 */
public interface Prologue extends EObject
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
   * @see #setVitesse_verticale(Pourcent_vitesse_hauteur_max)
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.DroneDSLPackage#getPrologue_Vitesse_verticale()
   * @model containment="true"
   * @generated
   */
  Pourcent_vitesse_hauteur_max getVitesse_verticale();

  /**
   * Sets the value of the '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Prologue#getVitesse_verticale <em>Vitesse verticale</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vitesse verticale</em>' containment reference.
   * @see #getVitesse_verticale()
   * @generated
   */
  void setVitesse_verticale(Pourcent_vitesse_hauteur_max value);

  /**
   * Returns the value of the '<em><b>Vitesse deplacement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vitesse deplacement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vitesse deplacement</em>' containment reference.
   * @see #setVitesse_deplacement(Pourcent_vitesse_deplacement_max)
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.DroneDSLPackage#getPrologue_Vitesse_deplacement()
   * @model containment="true"
   * @generated
   */
  Pourcent_vitesse_deplacement_max getVitesse_deplacement();

  /**
   * Sets the value of the '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Prologue#getVitesse_deplacement <em>Vitesse deplacement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vitesse deplacement</em>' containment reference.
   * @see #getVitesse_deplacement()
   * @generated
   */
  void setVitesse_deplacement(Pourcent_vitesse_deplacement_max value);

  /**
   * Returns the value of the '<em><b>Vitesse rotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vitesse rotation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vitesse rotation</em>' containment reference.
   * @see #setVitesse_rotation(Pourcent_vitesse_rotation_max)
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.DroneDSLPackage#getPrologue_Vitesse_rotation()
   * @model containment="true"
   * @generated
   */
  Pourcent_vitesse_rotation_max getVitesse_rotation();

  /**
   * Sets the value of the '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Prologue#getVitesse_rotation <em>Vitesse rotation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vitesse rotation</em>' containment reference.
   * @see #getVitesse_rotation()
   * @generated
   */
  void setVitesse_rotation(Pourcent_vitesse_rotation_max value);

  /**
   * Returns the value of the '<em><b>Hauteur</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hauteur</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hauteur</em>' containment reference.
   * @see #setHauteur(Hauteur_max)
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.DroneDSLPackage#getPrologue_Hauteur()
   * @model containment="true"
   * @generated
   */
  Hauteur_max getHauteur();

  /**
   * Sets the value of the '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Prologue#getHauteur <em>Hauteur</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hauteur</em>' containment reference.
   * @see #getHauteur()
   * @generated
   */
  void setHauteur(Hauteur_max value);

  /**
   * Returns the value of the '<em><b>Eloignement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Eloignement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Eloignement</em>' containment reference.
   * @see #setEloignement(Eloignement_max)
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.DroneDSLPackage#getPrologue_Eloignement()
   * @model containment="true"
   * @generated
   */
  Eloignement_max getEloignement();

  /**
   * Sets the value of the '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Prologue#getEloignement <em>Eloignement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Eloignement</em>' containment reference.
   * @see #getEloignement()
   * @generated
   */
  void setEloignement(Eloignement_max value);

} // Prologue