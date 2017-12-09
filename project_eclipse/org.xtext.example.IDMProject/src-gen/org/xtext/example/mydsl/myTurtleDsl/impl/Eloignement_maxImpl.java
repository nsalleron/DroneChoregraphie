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

import org.xtext.example.mydsl.myTurtleDsl.Eloignement_max;
import org.xtext.example.mydsl.myTurtleDsl.IntExp;
import org.xtext.example.mydsl.myTurtleDsl.MyTurtleDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eloignement max</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myTurtleDsl.impl.Eloignement_maxImpl#getHauteur_max <em>Hauteur max</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Eloignement_maxImpl extends MinimalEObjectImpl.Container implements Eloignement_max
{
  /**
   * The cached value of the '{@link #getHauteur_max() <em>Hauteur max</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHauteur_max()
   * @generated
   * @ordered
   */
  protected IntExp hauteur_max;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Eloignement_maxImpl()
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
    return MyTurtleDslPackage.Literals.ELOIGNEMENT_MAX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntExp getHauteur_max()
  {
    return hauteur_max;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHauteur_max(IntExp newHauteur_max, NotificationChain msgs)
  {
    IntExp oldHauteur_max = hauteur_max;
    hauteur_max = newHauteur_max;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyTurtleDslPackage.ELOIGNEMENT_MAX__HAUTEUR_MAX, oldHauteur_max, newHauteur_max);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHauteur_max(IntExp newHauteur_max)
  {
    if (newHauteur_max != hauteur_max)
    {
      NotificationChain msgs = null;
      if (hauteur_max != null)
        msgs = ((InternalEObject)hauteur_max).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyTurtleDslPackage.ELOIGNEMENT_MAX__HAUTEUR_MAX, null, msgs);
      if (newHauteur_max != null)
        msgs = ((InternalEObject)newHauteur_max).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyTurtleDslPackage.ELOIGNEMENT_MAX__HAUTEUR_MAX, null, msgs);
      msgs = basicSetHauteur_max(newHauteur_max, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyTurtleDslPackage.ELOIGNEMENT_MAX__HAUTEUR_MAX, newHauteur_max, newHauteur_max));
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
      case MyTurtleDslPackage.ELOIGNEMENT_MAX__HAUTEUR_MAX:
        return basicSetHauteur_max(null, msgs);
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
      case MyTurtleDslPackage.ELOIGNEMENT_MAX__HAUTEUR_MAX:
        return getHauteur_max();
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
      case MyTurtleDslPackage.ELOIGNEMENT_MAX__HAUTEUR_MAX:
        setHauteur_max((IntExp)newValue);
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
      case MyTurtleDslPackage.ELOIGNEMENT_MAX__HAUTEUR_MAX:
        setHauteur_max((IntExp)null);
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
      case MyTurtleDslPackage.ELOIGNEMENT_MAX__HAUTEUR_MAX:
        return hauteur_max != null;
    }
    return super.eIsSet(featureID);
  }

} //Eloignement_maxImpl
