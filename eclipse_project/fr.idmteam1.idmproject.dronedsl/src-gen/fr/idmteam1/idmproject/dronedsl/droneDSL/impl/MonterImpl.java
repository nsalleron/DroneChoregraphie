/**
 * generated by Xtext 2.12.0
 */
package fr.idmteam1.idmproject.dronedsl.droneDSL.impl;

import fr.idmteam1.idmproject.dronedsl.droneDSL.DroneDSLPackage;
import fr.idmteam1.idmproject.dronedsl.droneDSL.Monter;
import fr.idmteam1.idmproject.dronedsl.droneDSL.PourcentExp;
import fr.idmteam1.idmproject.dronedsl.droneDSL.SecondeExp;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSL.impl.MonterImpl#getDuree <em>Duree</em>}</li>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSL.impl.MonterImpl#getVitesse_verticale <em>Vitesse verticale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MonterImpl extends CommandeBasiqueImpl implements Monter
{
  /**
   * The cached value of the '{@link #getDuree() <em>Duree</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuree()
   * @generated
   * @ordered
   */
  protected SecondeExp duree;

  /**
   * The cached value of the '{@link #getVitesse_verticale() <em>Vitesse verticale</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVitesse_verticale()
   * @generated
   * @ordered
   */
  protected PourcentExp vitesse_verticale;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MonterImpl()
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
    return DroneDSLPackage.Literals.MONTER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SecondeExp getDuree()
  {
    return duree;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDuree(SecondeExp newDuree, NotificationChain msgs)
  {
    SecondeExp oldDuree = duree;
    duree = newDuree;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroneDSLPackage.MONTER__DUREE, oldDuree, newDuree);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDuree(SecondeExp newDuree)
  {
    if (newDuree != duree)
    {
      NotificationChain msgs = null;
      if (duree != null)
        msgs = ((InternalEObject)duree).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroneDSLPackage.MONTER__DUREE, null, msgs);
      if (newDuree != null)
        msgs = ((InternalEObject)newDuree).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroneDSLPackage.MONTER__DUREE, null, msgs);
      msgs = basicSetDuree(newDuree, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroneDSLPackage.MONTER__DUREE, newDuree, newDuree));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PourcentExp getVitesse_verticale()
  {
    return vitesse_verticale;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVitesse_verticale(PourcentExp newVitesse_verticale, NotificationChain msgs)
  {
    PourcentExp oldVitesse_verticale = vitesse_verticale;
    vitesse_verticale = newVitesse_verticale;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroneDSLPackage.MONTER__VITESSE_VERTICALE, oldVitesse_verticale, newVitesse_verticale);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVitesse_verticale(PourcentExp newVitesse_verticale)
  {
    if (newVitesse_verticale != vitesse_verticale)
    {
      NotificationChain msgs = null;
      if (vitesse_verticale != null)
        msgs = ((InternalEObject)vitesse_verticale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroneDSLPackage.MONTER__VITESSE_VERTICALE, null, msgs);
      if (newVitesse_verticale != null)
        msgs = ((InternalEObject)newVitesse_verticale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroneDSLPackage.MONTER__VITESSE_VERTICALE, null, msgs);
      msgs = basicSetVitesse_verticale(newVitesse_verticale, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroneDSLPackage.MONTER__VITESSE_VERTICALE, newVitesse_verticale, newVitesse_verticale));
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
      case DroneDSLPackage.MONTER__DUREE:
        return basicSetDuree(null, msgs);
      case DroneDSLPackage.MONTER__VITESSE_VERTICALE:
        return basicSetVitesse_verticale(null, msgs);
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
      case DroneDSLPackage.MONTER__DUREE:
        return getDuree();
      case DroneDSLPackage.MONTER__VITESSE_VERTICALE:
        return getVitesse_verticale();
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
      case DroneDSLPackage.MONTER__DUREE:
        setDuree((SecondeExp)newValue);
        return;
      case DroneDSLPackage.MONTER__VITESSE_VERTICALE:
        setVitesse_verticale((PourcentExp)newValue);
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
      case DroneDSLPackage.MONTER__DUREE:
        setDuree((SecondeExp)null);
        return;
      case DroneDSLPackage.MONTER__VITESSE_VERTICALE:
        setVitesse_verticale((PourcentExp)null);
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
      case DroneDSLPackage.MONTER__DUREE:
        return duree != null;
      case DroneDSLPackage.MONTER__VITESSE_VERTICALE:
        return vitesse_verticale != null;
    }
    return super.eIsSet(featureID);
  }

} //MonterImpl
