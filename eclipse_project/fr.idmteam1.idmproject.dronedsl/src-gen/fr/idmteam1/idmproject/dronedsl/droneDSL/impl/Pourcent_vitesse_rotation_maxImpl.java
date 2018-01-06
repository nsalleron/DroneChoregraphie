/**
 * generated by Xtext 2.12.0
 */
package fr.idmteam1.idmproject.dronedsl.droneDSL.impl;

import fr.idmteam1.idmproject.dronedsl.droneDSL.DroneDSLPackage;
import fr.idmteam1.idmproject.dronedsl.droneDSL.PourcentConst;
import fr.idmteam1.idmproject.dronedsl.droneDSL.Pourcent_vitesse_rotation_max;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pourcent vitesse rotation max</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSL.impl.Pourcent_vitesse_rotation_maxImpl#getVitesse_rotation <em>Vitesse rotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Pourcent_vitesse_rotation_maxImpl extends MinimalEObjectImpl.Container implements Pourcent_vitesse_rotation_max
{
  /**
   * The cached value of the '{@link #getVitesse_rotation() <em>Vitesse rotation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVitesse_rotation()
   * @generated
   * @ordered
   */
  protected PourcentConst vitesse_rotation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Pourcent_vitesse_rotation_maxImpl()
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
    return DroneDSLPackage.Literals.POURCENT_VITESSE_ROTATION_MAX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PourcentConst getVitesse_rotation()
  {
    return vitesse_rotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVitesse_rotation(PourcentConst newVitesse_rotation, NotificationChain msgs)
  {
    PourcentConst oldVitesse_rotation = vitesse_rotation;
    vitesse_rotation = newVitesse_rotation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroneDSLPackage.POURCENT_VITESSE_ROTATION_MAX__VITESSE_ROTATION, oldVitesse_rotation, newVitesse_rotation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVitesse_rotation(PourcentConst newVitesse_rotation)
  {
    if (newVitesse_rotation != vitesse_rotation)
    {
      NotificationChain msgs = null;
      if (vitesse_rotation != null)
        msgs = ((InternalEObject)vitesse_rotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroneDSLPackage.POURCENT_VITESSE_ROTATION_MAX__VITESSE_ROTATION, null, msgs);
      if (newVitesse_rotation != null)
        msgs = ((InternalEObject)newVitesse_rotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroneDSLPackage.POURCENT_VITESSE_ROTATION_MAX__VITESSE_ROTATION, null, msgs);
      msgs = basicSetVitesse_rotation(newVitesse_rotation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroneDSLPackage.POURCENT_VITESSE_ROTATION_MAX__VITESSE_ROTATION, newVitesse_rotation, newVitesse_rotation));
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
      case DroneDSLPackage.POURCENT_VITESSE_ROTATION_MAX__VITESSE_ROTATION:
        return basicSetVitesse_rotation(null, msgs);
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
      case DroneDSLPackage.POURCENT_VITESSE_ROTATION_MAX__VITESSE_ROTATION:
        return getVitesse_rotation();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DroneDSLPackage.POURCENT_VITESSE_ROTATION_MAX__VITESSE_ROTATION:
        setVitesse_rotation((PourcentConst)newValue);
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
      case DroneDSLPackage.POURCENT_VITESSE_ROTATION_MAX__VITESSE_ROTATION:
        setVitesse_rotation((PourcentConst)null);
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
      case DroneDSLPackage.POURCENT_VITESSE_ROTATION_MAX__VITESSE_ROTATION:
        return vitesse_rotation != null;
    }
    return super.eIsSet(featureID);
  }
  @Override
  public String toString() {
      return this.vitesse_rotation.toString();
  }

} //ModifiedPourcent_vitesse_rotation_maxImpl toString added
