/**
 * generated by Xtext 2.12.0
 */
package fr.idmteam1.idmproject.dronedsl.droneDSL.impl;

import fr.idmteam1.idmproject.dronedsl.droneDSL.Atterrir;
import fr.idmteam1.idmproject.dronedsl.droneDSL.Decoller;
import fr.idmteam1.idmproject.dronedsl.droneDSL.DroneDSLPackage;
import fr.idmteam1.idmproject.dronedsl.droneDSL.FinDeMain;
import fr.idmteam1.idmproject.dronedsl.droneDSL.Main;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSL.impl.MainImpl#getDecollage <em>Decollage</em>}</li>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSL.impl.MainImpl#getMainbody <em>Mainbody</em>}</li>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSL.impl.MainImpl#getAtterrissage <em>Atterrissage</em>}</li>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSL.impl.MainImpl#getFdm <em>Fdm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MainImpl extends MinimalEObjectImpl.Container implements Main
{
  /**
   * The cached value of the '{@link #getDecollage() <em>Decollage</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecollage()
   * @generated
   * @ordered
   */
  protected Decoller decollage;

  /**
   * The cached value of the '{@link #getMainbody() <em>Mainbody</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMainbody()
   * @generated
   * @ordered
   */
  protected EList<EObject> mainbody;

  /**
   * The cached value of the '{@link #getAtterrissage() <em>Atterrissage</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtterrissage()
   * @generated
   * @ordered
   */
  protected Atterrir atterrissage;

  /**
   * The cached value of the '{@link #getFdm() <em>Fdm</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFdm()
   * @generated
   * @ordered
   */
  protected FinDeMain fdm;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MainImpl()
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
    return DroneDSLPackage.Literals.MAIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Decoller getDecollage()
  {
    return decollage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDecollage(Decoller newDecollage, NotificationChain msgs)
  {
    Decoller oldDecollage = decollage;
    decollage = newDecollage;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroneDSLPackage.MAIN__DECOLLAGE, oldDecollage, newDecollage);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDecollage(Decoller newDecollage)
  {
    if (newDecollage != decollage)
    {
      NotificationChain msgs = null;
      if (decollage != null)
        msgs = ((InternalEObject)decollage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroneDSLPackage.MAIN__DECOLLAGE, null, msgs);
      if (newDecollage != null)
        msgs = ((InternalEObject)newDecollage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroneDSLPackage.MAIN__DECOLLAGE, null, msgs);
      msgs = basicSetDecollage(newDecollage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroneDSLPackage.MAIN__DECOLLAGE, newDecollage, newDecollage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getMainbody()
  {
    if (mainbody == null)
    {
      mainbody = new EObjectContainmentEList<EObject>(EObject.class, this, DroneDSLPackage.MAIN__MAINBODY);
    }
    return mainbody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Atterrir getAtterrissage()
  {
    return atterrissage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAtterrissage(Atterrir newAtterrissage, NotificationChain msgs)
  {
    Atterrir oldAtterrissage = atterrissage;
    atterrissage = newAtterrissage;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroneDSLPackage.MAIN__ATTERRISSAGE, oldAtterrissage, newAtterrissage);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAtterrissage(Atterrir newAtterrissage)
  {
    if (newAtterrissage != atterrissage)
    {
      NotificationChain msgs = null;
      if (atterrissage != null)
        msgs = ((InternalEObject)atterrissage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroneDSLPackage.MAIN__ATTERRISSAGE, null, msgs);
      if (newAtterrissage != null)
        msgs = ((InternalEObject)newAtterrissage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroneDSLPackage.MAIN__ATTERRISSAGE, null, msgs);
      msgs = basicSetAtterrissage(newAtterrissage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroneDSLPackage.MAIN__ATTERRISSAGE, newAtterrissage, newAtterrissage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FinDeMain getFdm()
  {
    return fdm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFdm(FinDeMain newFdm, NotificationChain msgs)
  {
    FinDeMain oldFdm = fdm;
    fdm = newFdm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroneDSLPackage.MAIN__FDM, oldFdm, newFdm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFdm(FinDeMain newFdm)
  {
    if (newFdm != fdm)
    {
      NotificationChain msgs = null;
      if (fdm != null)
        msgs = ((InternalEObject)fdm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroneDSLPackage.MAIN__FDM, null, msgs);
      if (newFdm != null)
        msgs = ((InternalEObject)newFdm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroneDSLPackage.MAIN__FDM, null, msgs);
      msgs = basicSetFdm(newFdm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroneDSLPackage.MAIN__FDM, newFdm, newFdm));
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
      case DroneDSLPackage.MAIN__DECOLLAGE:
        return basicSetDecollage(null, msgs);
      case DroneDSLPackage.MAIN__MAINBODY:
        return ((InternalEList<?>)getMainbody()).basicRemove(otherEnd, msgs);
      case DroneDSLPackage.MAIN__ATTERRISSAGE:
        return basicSetAtterrissage(null, msgs);
      case DroneDSLPackage.MAIN__FDM:
        return basicSetFdm(null, msgs);
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
      case DroneDSLPackage.MAIN__DECOLLAGE:
        return getDecollage();
      case DroneDSLPackage.MAIN__MAINBODY:
        return getMainbody();
      case DroneDSLPackage.MAIN__ATTERRISSAGE:
        return getAtterrissage();
      case DroneDSLPackage.MAIN__FDM:
        return getFdm();
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
      case DroneDSLPackage.MAIN__DECOLLAGE:
        setDecollage((Decoller)newValue);
        return;
      case DroneDSLPackage.MAIN__MAINBODY:
        getMainbody().clear();
        getMainbody().addAll((Collection<? extends EObject>)newValue);
        return;
      case DroneDSLPackage.MAIN__ATTERRISSAGE:
        setAtterrissage((Atterrir)newValue);
        return;
      case DroneDSLPackage.MAIN__FDM:
        setFdm((FinDeMain)newValue);
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
      case DroneDSLPackage.MAIN__DECOLLAGE:
        setDecollage((Decoller)null);
        return;
      case DroneDSLPackage.MAIN__MAINBODY:
        getMainbody().clear();
        return;
      case DroneDSLPackage.MAIN__ATTERRISSAGE:
        setAtterrissage((Atterrir)null);
        return;
      case DroneDSLPackage.MAIN__FDM:
        setFdm((FinDeMain)null);
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
      case DroneDSLPackage.MAIN__DECOLLAGE:
        return decollage != null;
      case DroneDSLPackage.MAIN__MAINBODY:
        return mainbody != null && !mainbody.isEmpty();
      case DroneDSLPackage.MAIN__ATTERRISSAGE:
        return atterrissage != null;
      case DroneDSLPackage.MAIN__FDM:
        return fdm != null;
    }
    return super.eIsSet(featureID);
  }

} //MainImpl
