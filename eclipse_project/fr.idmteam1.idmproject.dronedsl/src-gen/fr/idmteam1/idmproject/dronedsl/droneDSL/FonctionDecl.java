/**
 * generated by Xtext 2.12.0
 */
package fr.idmteam1.idmproject.dronedsl.droneDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fonction Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSL.FonctionDecl#getA <em>A</em>}</li>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSL.FonctionDecl#getB <em>B</em>}</li>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSL.FonctionDecl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see fr.idmteam1.idmproject.dronedsl.droneDSL.DroneDSLPackage#getFonctionDecl()
 * @model
 * @generated
 */
public interface FonctionDecl extends FonctionRef
{
  /**
   * Returns the value of the '<em><b>A</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>A</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>A</em>' attribute list.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.DroneDSLPackage#getFonctionDecl_A()
   * @model unique="false"
   * @generated
   */
  EList<String> getA();

  /**
   * Returns the value of the '<em><b>B</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>B</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>B</em>' attribute list.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.DroneDSLPackage#getFonctionDecl_B()
   * @model unique="false"
   * @generated
   */
  EList<String> getB();

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference list.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.DroneDSLPackage#getFonctionDecl_Body()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getBody();

} // FonctionDecl
