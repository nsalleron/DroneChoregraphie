/**
 * generated by Xtext 2.12.0
 */
package fr.idmteam1.idmproject.dronedsl.droneDSL.impl;

import fr.idmteam1.idmproject.dronedsl.droneDSL.Avancer;
import fr.idmteam1.idmproject.dronedsl.droneDSL.DroneDSLPackage;
import fr.idmteam1.idmproject.dronedsl.droneDSL.PourcentExp;
import fr.idmteam1.idmproject.dronedsl.droneDSL.SecondeExp;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Avancer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSL.impl.AvancerImpl#getDuree <em>Duree</em>}</li>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSL.impl.AvancerImpl#getVitesse_deplacement <em>Vitesse deplacement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AvancerImpl extends CommandeBasiqueImpl implements Avancer
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
   * The cached value of the '{@link #getVitesse_deplacement() <em>Vitesse deplacement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVitesse_deplacement()
   * @generated
   * @ordered
   */
  protected PourcentExp vitesse_deplacement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AvancerImpl()
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
    return DroneDSLPackage.Literals.AVANCER;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroneDSLPackage.AVANCER__DUREE, oldDuree, newDuree);
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
        msgs = ((InternalEObject)duree).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroneDSLPackage.AVANCER__DUREE, null, msgs);
      if (newDuree != null)
        msgs = ((InternalEObject)newDuree).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroneDSLPackage.AVANCER__DUREE, null, msgs);
      msgs = basicSetDuree(newDuree, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroneDSLPackage.AVANCER__DUREE, newDuree, newDuree));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PourcentExp getVitesse_deplacement()
  {
    return vitesse_deplacement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVitesse_deplacement(PourcentExp newVitesse_deplacement, NotificationChain msgs)
  {
    PourcentExp oldVitesse_deplacement = vitesse_deplacement;
    vitesse_deplacement = newVitesse_deplacement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroneDSLPackage.AVANCER__VITESSE_DEPLACEMENT, oldVitesse_deplacement, newVitesse_deplacement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVitesse_deplacement(PourcentExp newVitesse_deplacement)
  {
    if (newVitesse_deplacement != vitesse_deplacement)
    {
      NotificationChain msgs = null;
      if (vitesse_deplacement != null)
        msgs = ((InternalEObject)vitesse_deplacement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroneDSLPackage.AVANCER__VITESSE_DEPLACEMENT, null, msgs);
      if (newVitesse_deplacement != null)
        msgs = ((InternalEObject)newVitesse_deplacement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroneDSLPackage.AVANCER__VITESSE_DEPLACEMENT, null, msgs);
      msgs = basicSetVitesse_deplacement(newVitesse_deplacement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroneDSLPackage.AVANCER__VITESSE_DEPLACEMENT, newVitesse_deplacement, newVitesse_deplacement));
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
      case DroneDSLPackage.AVANCER__DUREE:
        return basicSetDuree(null, msgs);
      case DroneDSLPackage.AVANCER__VITESSE_DEPLACEMENT:
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
      case DroneDSLPackage.AVANCER__DUREE:
        return getDuree();
      case DroneDSLPackage.AVANCER__VITESSE_DEPLACEMENT:
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
      case DroneDSLPackage.AVANCER__DUREE:
        setDuree((SecondeExp)newValue);
        return;
      case DroneDSLPackage.AVANCER__VITESSE_DEPLACEMENT:
        setVitesse_deplacement((PourcentExp)newValue);
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
      case DroneDSLPackage.AVANCER__DUREE:
        setDuree((SecondeExp)null);
        return;
      case DroneDSLPackage.AVANCER__VITESSE_DEPLACEMENT:
        setVitesse_deplacement((PourcentExp)null);
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
      case DroneDSLPackage.AVANCER__DUREE:
        return duree != null;
      case DroneDSLPackage.AVANCER__VITESSE_DEPLACEMENT:
        return vitesse_deplacement != null;
    }
    return super.eIsSet(featureID);
  }

} //AvancerImpl
