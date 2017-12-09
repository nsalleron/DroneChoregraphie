/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myTurtleDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.myTurtleDsl.IntExp;
import org.xtext.example.mydsl.myTurtleDsl.MyTurtleDslPackage;
import org.xtext.example.mydsl.myTurtleDsl.RotationDroite;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rotation Droite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myTurtleDsl.impl.RotationDroiteImpl#getDuree <em>Duree</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myTurtleDsl.impl.RotationDroiteImpl#getVitesse_rotation <em>Vitesse rotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RotationDroiteImpl extends StatementImpl implements RotationDroite
{
  /**
   * The cached value of the '{@link #getDuree() <em>Duree</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuree()
   * @generated
   * @ordered
   */
  protected IntExp duree;

  /**
   * The cached value of the '{@link #getVitesse_rotation() <em>Vitesse rotation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVitesse_rotation()
   * @generated
   * @ordered
   */
  protected IntExp vitesse_rotation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RotationDroiteImpl()
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
    return MyTurtleDslPackage.Literals.ROTATION_DROITE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntExp getDuree()
  {
    return duree;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDuree(IntExp newDuree, NotificationChain msgs)
  {
    IntExp oldDuree = duree;
    duree = newDuree;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyTurtleDslPackage.ROTATION_DROITE__DUREE, oldDuree, newDuree);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDuree(IntExp newDuree)
  {
    if (newDuree != duree)
    {
      NotificationChain msgs = null;
      if (duree != null)
        msgs = ((InternalEObject)duree).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyTurtleDslPackage.ROTATION_DROITE__DUREE, null, msgs);
      if (newDuree != null)
        msgs = ((InternalEObject)newDuree).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyTurtleDslPackage.ROTATION_DROITE__DUREE, null, msgs);
      msgs = basicSetDuree(newDuree, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyTurtleDslPackage.ROTATION_DROITE__DUREE, newDuree, newDuree));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntExp getVitesse_rotation()
  {
    return vitesse_rotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVitesse_rotation(IntExp newVitesse_rotation, NotificationChain msgs)
  {
    IntExp oldVitesse_rotation = vitesse_rotation;
    vitesse_rotation = newVitesse_rotation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyTurtleDslPackage.ROTATION_DROITE__VITESSE_ROTATION, oldVitesse_rotation, newVitesse_rotation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVitesse_rotation(IntExp newVitesse_rotation)
  {
    if (newVitesse_rotation != vitesse_rotation)
    {
      NotificationChain msgs = null;
      if (vitesse_rotation != null)
        msgs = ((InternalEObject)vitesse_rotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyTurtleDslPackage.ROTATION_DROITE__VITESSE_ROTATION, null, msgs);
      if (newVitesse_rotation != null)
        msgs = ((InternalEObject)newVitesse_rotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyTurtleDslPackage.ROTATION_DROITE__VITESSE_ROTATION, null, msgs);
      msgs = basicSetVitesse_rotation(newVitesse_rotation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyTurtleDslPackage.ROTATION_DROITE__VITESSE_ROTATION, newVitesse_rotation, newVitesse_rotation));
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
      case MyTurtleDslPackage.ROTATION_DROITE__DUREE:
        return basicSetDuree(null, msgs);
      case MyTurtleDslPackage.ROTATION_DROITE__VITESSE_ROTATION:
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
      case MyTurtleDslPackage.ROTATION_DROITE__DUREE:
        return getDuree();
      case MyTurtleDslPackage.ROTATION_DROITE__VITESSE_ROTATION:
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
      case MyTurtleDslPackage.ROTATION_DROITE__DUREE:
        setDuree((IntExp)newValue);
        return;
      case MyTurtleDslPackage.ROTATION_DROITE__VITESSE_ROTATION:
        setVitesse_rotation((IntExp)newValue);
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
      case MyTurtleDslPackage.ROTATION_DROITE__DUREE:
        setDuree((IntExp)null);
        return;
      case MyTurtleDslPackage.ROTATION_DROITE__VITESSE_ROTATION:
        setVitesse_rotation((IntExp)null);
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
      case MyTurtleDslPackage.ROTATION_DROITE__DUREE:
        return duree != null;
      case MyTurtleDslPackage.ROTATION_DROITE__VITESSE_ROTATION:
        return vitesse_rotation != null;
    }
    return super.eIsSet(featureID);
  }

} //RotationDroiteImpl
