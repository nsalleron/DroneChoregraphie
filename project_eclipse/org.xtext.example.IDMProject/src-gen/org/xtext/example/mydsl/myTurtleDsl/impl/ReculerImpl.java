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
import org.xtext.example.mydsl.myTurtleDsl.Reculer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reculer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myTurtleDsl.impl.ReculerImpl#getDuree <em>Duree</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myTurtleDsl.impl.ReculerImpl#getVitesse_deplacement <em>Vitesse deplacement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReculerImpl extends StatementImpl implements Reculer
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
   * The cached value of the '{@link #getVitesse_deplacement() <em>Vitesse deplacement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVitesse_deplacement()
   * @generated
   * @ordered
   */
  protected IntExp vitesse_deplacement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReculerImpl()
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
    return MyTurtleDslPackage.Literals.RECULER;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyTurtleDslPackage.RECULER__DUREE, oldDuree, newDuree);
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
        msgs = ((InternalEObject)duree).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyTurtleDslPackage.RECULER__DUREE, null, msgs);
      if (newDuree != null)
        msgs = ((InternalEObject)newDuree).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyTurtleDslPackage.RECULER__DUREE, null, msgs);
      msgs = basicSetDuree(newDuree, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyTurtleDslPackage.RECULER__DUREE, newDuree, newDuree));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntExp getVitesse_deplacement()
  {
    return vitesse_deplacement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVitesse_deplacement(IntExp newVitesse_deplacement, NotificationChain msgs)
  {
    IntExp oldVitesse_deplacement = vitesse_deplacement;
    vitesse_deplacement = newVitesse_deplacement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyTurtleDslPackage.RECULER__VITESSE_DEPLACEMENT, oldVitesse_deplacement, newVitesse_deplacement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVitesse_deplacement(IntExp newVitesse_deplacement)
  {
    if (newVitesse_deplacement != vitesse_deplacement)
    {
      NotificationChain msgs = null;
      if (vitesse_deplacement != null)
        msgs = ((InternalEObject)vitesse_deplacement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyTurtleDslPackage.RECULER__VITESSE_DEPLACEMENT, null, msgs);
      if (newVitesse_deplacement != null)
        msgs = ((InternalEObject)newVitesse_deplacement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyTurtleDslPackage.RECULER__VITESSE_DEPLACEMENT, null, msgs);
      msgs = basicSetVitesse_deplacement(newVitesse_deplacement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyTurtleDslPackage.RECULER__VITESSE_DEPLACEMENT, newVitesse_deplacement, newVitesse_deplacement));
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
      case MyTurtleDslPackage.RECULER__DUREE:
        return basicSetDuree(null, msgs);
      case MyTurtleDslPackage.RECULER__VITESSE_DEPLACEMENT:
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
      case MyTurtleDslPackage.RECULER__DUREE:
        return getDuree();
      case MyTurtleDslPackage.RECULER__VITESSE_DEPLACEMENT:
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
      case MyTurtleDslPackage.RECULER__DUREE:
        setDuree((IntExp)newValue);
        return;
      case MyTurtleDslPackage.RECULER__VITESSE_DEPLACEMENT:
        setVitesse_deplacement((IntExp)newValue);
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
      case MyTurtleDslPackage.RECULER__DUREE:
        setDuree((IntExp)null);
        return;
      case MyTurtleDslPackage.RECULER__VITESSE_DEPLACEMENT:
        setVitesse_deplacement((IntExp)null);
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
      case MyTurtleDslPackage.RECULER__DUREE:
        return duree != null;
      case MyTurtleDslPackage.RECULER__VITESSE_DEPLACEMENT:
        return vitesse_deplacement != null;
    }
    return super.eIsSet(featureID);
  }

} //ReculerImpl
