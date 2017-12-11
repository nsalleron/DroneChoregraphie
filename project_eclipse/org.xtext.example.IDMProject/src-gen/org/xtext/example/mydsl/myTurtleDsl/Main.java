/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myTurtleDsl;

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
 *   <li>{@link org.xtext.example.mydsl.myTurtleDsl.Main#getSeconDec <em>Secon Dec</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myTurtleDsl.Main#getPourDec <em>Pour Dec</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myTurtleDsl.Main#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myTurtleDsl.Main#getFonctions <em>Fonctions</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myTurtleDsl.Main#getParallele <em>Parallele</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myTurtleDsl.MyTurtleDslPackage#getMain()
 * @model
 * @generated
 */
public interface Main extends EObject
{
  /**
   * Returns the value of the '<em><b>Secon Dec</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myTurtleDsl.IntDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Secon Dec</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Secon Dec</em>' containment reference list.
   * @see org.xtext.example.mydsl.myTurtleDsl.MyTurtleDslPackage#getMain_SeconDec()
   * @model containment="true"
   * @generated
   */
  EList<IntDecl> getSeconDec();

  /**
   * Returns the value of the '<em><b>Pour Dec</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myTurtleDsl.PourcentDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pour Dec</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pour Dec</em>' containment reference list.
   * @see org.xtext.example.mydsl.myTurtleDsl.MyTurtleDslPackage#getMain_PourDec()
   * @model containment="true"
   * @generated
   */
  EList<PourcentDecl> getPourDec();

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myTurtleDsl.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see org.xtext.example.mydsl.myTurtleDsl.MyTurtleDslPackage#getMain_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

  /**
   * Returns the value of the '<em><b>Fonctions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myTurtleDsl.FonctionCall}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fonctions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fonctions</em>' containment reference list.
   * @see org.xtext.example.mydsl.myTurtleDsl.MyTurtleDslPackage#getMain_Fonctions()
   * @model containment="true"
   * @generated
   */
  EList<FonctionCall> getFonctions();

  /**
   * Returns the value of the '<em><b>Parallele</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parallele</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parallele</em>' containment reference list.
   * @see org.xtext.example.mydsl.myTurtleDsl.MyTurtleDslPackage#getMain_Parallele()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getParallele();

} // Main
