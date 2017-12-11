/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myTurtleDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myTurtleDsl.MyTurtleDslPackage;
import org.xtext.example.mydsl.myTurtleDsl.PourcentConst;
import org.xtext.example.mydsl.myTurtleDsl.Pourcent_vitesse_rotation_max;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pourcent vitesse rotation max</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myTurtleDsl.impl.Pourcent_vitesse_rotation_maxImpl#getVitesse_deplacement <em>Vitesse deplacement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Pourcent_vitesse_rotation_maxImpl extends MinimalEObjectImpl.Container implements Pourcent_vitesse_rotation_max
{
  /**
   * The cached value of the '{@link #getVitesse_deplacement() <em>Vitesse deplacement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVitesse_deplacement()
   * @generated
   * @ordered
   */
  protected PourcentConst vitesse_deplacement;

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
    return MyTurtleDslPackage.Literals.POURCENT_VITESSE_ROTATION_MAX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PourcentConst getVitesse_deplacement()
  {
    return vitesse_deplacement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVitesse_deplacement(PourcentConst newVitesse_deplacement, NotificationChain msgs)
  {
    PourcentConst oldVitesse_deplacement = vitesse_deplacement;
    vitesse_deplacement = newVitesse_deplacement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyTurtleDslPackage.POURCENT_VITESSE_ROTATION_MAX__VITESSE_DEPLACEMENT, oldVitesse_deplacement, newVitesse_deplacement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVitesse_deplacement(PourcentConst newVitesse_deplacement)
  {
    if (newVitesse_deplacement != vitesse_deplacement)
    {
      NotificationChain msgs = null;
      if (vitesse_deplacement != null)
        msgs = ((InternalEObject)vitesse_deplacement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyTurtleDslPackage.POURCENT_VITESSE_ROTATION_MAX__VITESSE_DEPLACEMENT, null, msgs);
      if (newVitesse_deplacement != null)
        msgs = ((InternalEObject)newVitesse_deplacement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyTurtleDslPackage.POURCENT_VITESSE_ROTATION_MAX__VITESSE_DEPLACEMENT, null, msgs);
      msgs = basicSetVitesse_deplacement(newVitesse_deplacement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyTurtleDslPackage.POURCENT_VITESSE_ROTATION_MAX__VITESSE_DEPLACEMENT, newVitesse_deplacement, newVitesse_deplacement));
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
      case MyTurtleDslPackage.POURCENT_VITESSE_ROTATION_MAX__VITESSE_DEPLACEMENT:
        return basicSetVitesse_deplacement(null, msgs);
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
      case MyTurtleDslPackage.POURCENT_VITESSE_ROTATION_MAX__VITESSE_DEPLACEMENT:
        return getVitesse_deplacement();
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
      case MyTurtleDslPackage.POURCENT_VITESSE_ROTATION_MAX__VITESSE_DEPLACEMENT:
        setVitesse_deplacement((PourcentConst)newValue);
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
      case MyTurtleDslPackage.POURCENT_VITESSE_ROTATION_MAX__VITESSE_DEPLACEMENT:
        setVitesse_deplacement((PourcentConst)null);
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
      case MyTurtleDslPackage.POURCENT_VITESSE_ROTATION_MAX__VITESSE_DEPLACEMENT:
        return vitesse_deplacement != null;
    }
    return super.eIsSet(featureID);
  }

} //Pourcent_vitesse_rotation_maxImpl
