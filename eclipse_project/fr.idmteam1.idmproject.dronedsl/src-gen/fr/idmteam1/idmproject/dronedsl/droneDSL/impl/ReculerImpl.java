/**
 * generated by Xtext 2.12.0
 */
package fr.idmteam1.idmproject.dronedsl.droneDSL.impl;

import fr.idmteam1.idmproject.dronedsl.droneDSL.DroneDSLPackage;
import fr.idmteam1.idmproject.dronedsl.droneDSL.PourcentExp;
import fr.idmteam1.idmproject.dronedsl.droneDSL.Reculer;
import fr.idmteam1.idmproject.dronedsl.droneDSL.SecondeExp;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reculer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSL.impl.ReculerImpl#getDuree <em>Duree</em>}</li>
 *   <li>{@link fr.idmteam1.idmproject.dronedsl.droneDSL.impl.ReculerImpl#getVitesse <em>Vitesse</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReculerImpl extends MouvementImpl implements Reculer
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
   * The cached value of the '{@link #getVitesse() <em>Vitesse</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVitesse()
   * @generated
   * @ordered
   */
  protected PourcentExp vitesse;

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
    return DroneDSLPackage.Literals.RECULER;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroneDSLPackage.RECULER__DUREE, oldDuree, newDuree);
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
        msgs = ((InternalEObject)duree).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroneDSLPackage.RECULER__DUREE, null, msgs);
      if (newDuree != null)
        msgs = ((InternalEObject)newDuree).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroneDSLPackage.RECULER__DUREE, null, msgs);
      msgs = basicSetDuree(newDuree, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroneDSLPackage.RECULER__DUREE, newDuree, newDuree));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PourcentExp getVitesse()
  {
    return vitesse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVitesse(PourcentExp newVitesse, NotificationChain msgs)
  {
    PourcentExp oldVitesse = vitesse;
    vitesse = newVitesse;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DroneDSLPackage.RECULER__VITESSE, oldVitesse, newVitesse);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVitesse(PourcentExp newVitesse)
  {
    if (newVitesse != vitesse)
    {
      NotificationChain msgs = null;
      if (vitesse != null)
        msgs = ((InternalEObject)vitesse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DroneDSLPackage.RECULER__VITESSE, null, msgs);
      if (newVitesse != null)
        msgs = ((InternalEObject)newVitesse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DroneDSLPackage.RECULER__VITESSE, null, msgs);
      msgs = basicSetVitesse(newVitesse, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DroneDSLPackage.RECULER__VITESSE, newVitesse, newVitesse));
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
      case DroneDSLPackage.RECULER__DUREE:
        return basicSetDuree(null, msgs);
      case DroneDSLPackage.RECULER__VITESSE:
        return basicSetVitesse(null, msgs);
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
      case DroneDSLPackage.RECULER__DUREE:
        return getDuree();
      case DroneDSLPackage.RECULER__VITESSE:
        return getVitesse();
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
      case DroneDSLPackage.RECULER__DUREE:
        setDuree((SecondeExp)newValue);
        return;
      case DroneDSLPackage.RECULER__VITESSE:
        setVitesse((PourcentExp)newValue);
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
      case DroneDSLPackage.RECULER__DUREE:
        setDuree((SecondeExp)null);
        return;
      case DroneDSLPackage.RECULER__VITESSE:
        setVitesse((PourcentExp)null);
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
      case DroneDSLPackage.RECULER__DUREE:
        return duree != null;
      case DroneDSLPackage.RECULER__VITESSE:
        return vitesse != null;
    }
    return super.eIsSet(featureID);
  }
  @Override
    public String toString() {
  	  return "		new Reculer("+this.duree+", "+this.vitesse+").execute(runtime);";
    }

} //ModifiedReculerImpl toString added
