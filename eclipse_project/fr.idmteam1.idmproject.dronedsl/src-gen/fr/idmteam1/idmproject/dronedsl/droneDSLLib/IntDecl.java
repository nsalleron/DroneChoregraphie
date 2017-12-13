/**
 * generated by Xtext 2.12.0
 */
package fr.idmteam1.idmproject.dronedsl.droneDSLLib;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSLLib.IntDecl#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @see fr.idmteam1.idmproject.dronedsl.droneDSLLib.DroneDSLLibPackage#getIntDecl()
 * @model
 * @generated
 */
public interface IntDecl extends VarDecl
{
  /**
   * Returns the value of the '<em><b>Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' containment reference.
   * @see #setVal(IntExp)
   * @see fr.idmteam1.idmproject.dronedsl.droneDSLLib.DroneDSLLibPackage#getIntDecl_Val()
   * @model containment="true"
   * @generated
   */
  IntExp getVal();

  /**
   * Sets the value of the '{@link fr.idmteam1.idmproject.dronedsl.droneDSLLib.IntDecl#getVal <em>Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' containment reference.
   * @see #getVal()
   * @generated
   */
  void setVal(IntExp value);

} // IntDecl
