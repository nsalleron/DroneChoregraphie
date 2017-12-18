/**
 * generated by Xtext 2.12.0
 */
package fr.idmteam1.idmproject.dronedsl.droneDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Model#getImports <em>Imports</em>}</li>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Model#getPvhm <em>Pvhm</em>}</li>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Model#getPvdm <em>Pvdm</em>}</li>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Model#getPvrm <em>Pvrm</em>}</li>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Model#getHm <em>Hm</em>}</li>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Model#getEm <em>Em</em>}</li>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Model#getM <em>M</em>}</li>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Model#getFonctions <em>Fonctions</em>}</li>
 * </ul>
 *
 * @see fr.idmteam1.idmproject.dronedsl.droneDSL.DroneDSLPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link fr.idmteam1.idmproject.dronedsl.droneDSL.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.DroneDSLPackage#getModel_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Pvhm</b></em>' containment reference list.
   * The list contents are of type {@link fr.idmteam1.idmproject.dronedsl.droneDSL.Pourcent_vitesse_hauteur_max}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pvhm</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pvhm</em>' containment reference list.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.DroneDSLPackage#getModel_Pvhm()
   * @model containment="true"
   * @generated
   */
  EList<Pourcent_vitesse_hauteur_max> getPvhm();

  /**
   * Returns the value of the '<em><b>Pvdm</b></em>' containment reference list.
   * The list contents are of type {@link fr.idmteam1.idmproject.dronedsl.droneDSL.Pourcent_vitesse_deplacement_max}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pvdm</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pvdm</em>' containment reference list.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.DroneDSLPackage#getModel_Pvdm()
   * @model containment="true"
   * @generated
   */
  EList<Pourcent_vitesse_deplacement_max> getPvdm();

  /**
   * Returns the value of the '<em><b>Pvrm</b></em>' containment reference list.
   * The list contents are of type {@link fr.idmteam1.idmproject.dronedsl.droneDSL.Pourcent_vitesse_rotation_max}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pvrm</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pvrm</em>' containment reference list.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.DroneDSLPackage#getModel_Pvrm()
   * @model containment="true"
   * @generated
   */
  EList<Pourcent_vitesse_rotation_max> getPvrm();

  /**
   * Returns the value of the '<em><b>Hm</b></em>' containment reference list.
   * The list contents are of type {@link fr.idmteam1.idmproject.dronedsl.droneDSL.Hauteur_max}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hm</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hm</em>' containment reference list.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.DroneDSLPackage#getModel_Hm()
   * @model containment="true"
   * @generated
   */
  EList<Hauteur_max> getHm();

  /**
   * Returns the value of the '<em><b>Em</b></em>' containment reference list.
   * The list contents are of type {@link fr.idmteam1.idmproject.dronedsl.droneDSL.Eloignement_max}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Em</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Em</em>' containment reference list.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.DroneDSLPackage#getModel_Em()
   * @model containment="true"
   * @generated
   */
  EList<Eloignement_max> getEm();

  /**
   * Returns the value of the '<em><b>M</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>M</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>M</em>' containment reference.
   * @see #setM(Main)
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.DroneDSLPackage#getModel_M()
   * @model containment="true"
   * @generated
   */
  Main getM();

  /**
   * Sets the value of the '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Model#getM <em>M</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>M</em>' containment reference.
   * @see #getM()
   * @generated
   */
  void setM(Main value);

  /**
   * Returns the value of the '<em><b>Fonctions</b></em>' containment reference list.
   * The list contents are of type {@link fr.idmteam1.idmproject.dronedsl.droneDSL.FonctionDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fonctions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fonctions</em>' containment reference list.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.DroneDSLPackage#getModel_Fonctions()
   * @model containment="true"
   * @generated
   */
  EList<FonctionDecl> getFonctions();

} // Model
