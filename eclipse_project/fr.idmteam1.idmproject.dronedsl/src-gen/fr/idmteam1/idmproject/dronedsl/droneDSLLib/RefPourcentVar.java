/**
 * generated by Xtext 2.12.0
 */
package fr.idmteam1.idmproject.dronedsl.droneDSLLib;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Pourcent Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSLLib.RefPourcentVar#getVar <em>Var</em>}</li>
 * </ul>
 *
 * @see fr.idmteam1.idmproject.dronedsl.droneDSLLib.DroneDSLLibPackage#getRefPourcentVar()
 * @model
 * @generated
 */
public interface RefPourcentVar extends PourcentExp
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' reference.
   * @see #setVar(PourcentDecl)
   * @see fr.idmteam1.idmproject.dronedsl.droneDSLLib.DroneDSLLibPackage#getRefPourcentVar_Var()
   * @model
   * @generated
   */
  PourcentDecl getVar();

  /**
   * Sets the value of the '{@link fr.idmteam1.idmproject.dronedsl.droneDSLLib.RefPourcentVar#getVar <em>Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' reference.
   * @see #getVar()
   * @generated
   */
  void setVar(PourcentDecl value);

} // RefPourcentVar
