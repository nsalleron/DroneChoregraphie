/**
 * generated by Xtext 2.12.0
 */
package fr.idmteam1.idmproject.dronedsl.droneDSL.impl;

import fr.idmteam1.idmproject.dronedsl.droneDSL.DroneDSLPackage;
import fr.idmteam1.idmproject.dronedsl.droneDSL.FonctionCall;
import fr.idmteam1.idmproject.dronedsl.droneDSL.FonctionDecl;
import fr.idmteam1.idmproject.dronedsl.droneDSL.Main;
import fr.idmteam1.idmproject.dronedsl.droneDSL.VarDecl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fonction Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSL.impl.FonctionCallImpl#getDecollage <em>Decollage</em>}</li>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSL.impl.FonctionCallImpl#getMainbody <em>Mainbody</em>}</li>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSL.impl.FonctionCallImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSL.impl.FonctionCallImpl#getAtterrissage <em>Atterrissage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FonctionCallImpl extends FonctionDeclImpl implements FonctionCall
{
  /**
   * The default value of the '{@link #getDecollage() <em>Decollage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecollage()
   * @generated
   * @ordered
   */
  protected static final String DECOLLAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDecollage() <em>Decollage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecollage()
   * @generated
   * @ordered
   */
  protected String decollage = DECOLLAGE_EDEFAULT;

  /**
   * The cached value of the '{@link #getMainbody() <em>Mainbody</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMainbody()
   * @generated
   * @ordered
   */
  protected EList<VarDecl> mainbody;

  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected FonctionDecl ref;

  /**
   * The default value of the '{@link #getAtterrissage() <em>Atterrissage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtterrissage()
   * @generated
   * @ordered
   */
  protected static final String ATTERRISSAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAtterrissage() <em>Atterrissage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtterrissage()
   * @generated
   * @ordered
   */
  protected String atterrissage = ATTERRISSAGE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FonctionCallImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DroneDSLPackage.Literals.FONCTION_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDecollage()
  {
    return decollage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDecollage(String newDecollage)
  {
    String oldDecollage = decollage;
    decollage = newDecollage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroneDSLPackage.FONCTION_CALL__DECOLLAGE, oldDecollage, decollage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VarDecl> getMainbody()
  {
    if (mainbody == null)
    {
      mainbody = new EObjectContainmentEList<VarDecl>(VarDecl.class, this, DroneDSLPackage.FONCTION_CALL__MAINBODY);
    }
    return mainbody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FonctionDecl getRef()
  {
    if (ref != null && ref.eIsProxy())
    {
      InternalEObject oldRef = (InternalEObject)ref;
      ref = (FonctionDecl)eResolveProxy(oldRef);
      if (ref != oldRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DroneDSLPackage.FONCTION_CALL__REF, oldRef, ref));
      }
    }
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FonctionDecl basicGetRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef(FonctionDecl newRef)
  {
    FonctionDecl oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroneDSLPackage.FONCTION_CALL__REF, oldRef, ref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAtterrissage()
  {
    return atterrissage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAtterrissage(String newAtterrissage)
  {
    String oldAtterrissage = atterrissage;
    atterrissage = newAtterrissage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroneDSLPackage.FONCTION_CALL__ATTERRISSAGE, oldAtterrissage, atterrissage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DroneDSLPackage.FONCTION_CALL__MAINBODY:
        return ((InternalEList<?>)getMainbody()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DroneDSLPackage.FONCTION_CALL__DECOLLAGE:
        return getDecollage();
      case DroneDSLPackage.FONCTION_CALL__MAINBODY:
        return getMainbody();
      case DroneDSLPackage.FONCTION_CALL__REF:
        if (resolve) return getRef();
        return basicGetRef();
      case DroneDSLPackage.FONCTION_CALL__ATTERRISSAGE:
        return getAtterrissage();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DroneDSLPackage.FONCTION_CALL__DECOLLAGE:
        setDecollage((String)newValue);
        return;
      case DroneDSLPackage.FONCTION_CALL__MAINBODY:
        getMainbody().clear();
        getMainbody().addAll((Collection<? extends VarDecl>)newValue);
        return;
      case DroneDSLPackage.FONCTION_CALL__REF:
        setRef((FonctionDecl)newValue);
        return;
      case DroneDSLPackage.FONCTION_CALL__ATTERRISSAGE:
        setAtterrissage((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DroneDSLPackage.FONCTION_CALL__DECOLLAGE:
        setDecollage(DECOLLAGE_EDEFAULT);
        return;
      case DroneDSLPackage.FONCTION_CALL__MAINBODY:
        getMainbody().clear();
        return;
      case DroneDSLPackage.FONCTION_CALL__REF:
        setRef((FonctionDecl)null);
        return;
      case DroneDSLPackage.FONCTION_CALL__ATTERRISSAGE:
        setAtterrissage(ATTERRISSAGE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DroneDSLPackage.FONCTION_CALL__DECOLLAGE:
        return DECOLLAGE_EDEFAULT == null ? decollage != null : !DECOLLAGE_EDEFAULT.equals(decollage);
      case DroneDSLPackage.FONCTION_CALL__MAINBODY:
        return mainbody != null && !mainbody.isEmpty();
      case DroneDSLPackage.FONCTION_CALL__REF:
        return ref != null;
      case DroneDSLPackage.FONCTION_CALL__ATTERRISSAGE:
        return ATTERRISSAGE_EDEFAULT == null ? atterrissage != null : !ATTERRISSAGE_EDEFAULT.equals(atterrissage);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Main.class)
    {
      switch (derivedFeatureID)
      {
        case DroneDSLPackage.FONCTION_CALL__DECOLLAGE: return DroneDSLPackage.MAIN__DECOLLAGE;
        case DroneDSLPackage.FONCTION_CALL__MAINBODY: return DroneDSLPackage.MAIN__MAINBODY;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Main.class)
    {
      switch (baseFeatureID)
      {
        case DroneDSLPackage.MAIN__DECOLLAGE: return DroneDSLPackage.FONCTION_CALL__DECOLLAGE;
        case DroneDSLPackage.MAIN__MAINBODY: return DroneDSLPackage.FONCTION_CALL__MAINBODY;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (decollage: ");
    result.append(decollage);
    result.append(", atterrissage: ");
    result.append(atterrissage);
    result.append(')');
    return result.toString();
  }

} //FonctionCallImpl
