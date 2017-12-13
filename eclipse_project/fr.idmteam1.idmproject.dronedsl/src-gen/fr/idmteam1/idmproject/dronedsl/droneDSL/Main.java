/**
 * generated by Xtext 2.12.0
 */
package fr.idmteam1.idmproject.dronedsl.droneDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Main#getStatements <em>Statements</em>}</li>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Main#getFonctions <em>Fonctions</em>}</li>
 * </ul>
 *
 * @see fr.idmteam1.idmproject.dronedsl.droneDSL.DroneDSLPackage#getMain()
 * @model
 * @generated
 */
public interface Main extends EObject
{
  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link fr.idmteam1.idmproject.dronedsl.droneDSL.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.DroneDSLPackage#getMain_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

  /**
   * Returns the value of the '<em><b>Fonctions</b></em>' containment reference list.
   * The list contents are of type {@link fr.idmteam1.idmproject.dronedsl.droneDSL.FonctionCall}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fonctions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fonctions</em>' containment reference list.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.DroneDSLPackage#getMain_Fonctions()
   * @model containment="true"
   * @generated
   */
  EList<FonctionCall> getFonctions();

} // Main
