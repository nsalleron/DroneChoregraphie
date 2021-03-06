/**
 * generated by Xtext 2.12.0
 */
package fr.idmteam1.idmproject.dronedsl.droneDSLLib.util;

import fr.idmteam1.idmproject.dronedsl.droneDSLLib.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.idmteam1.idmproject.dronedsl.droneDSLLib.DroneDSLLibPackage
 * @generated
 */
public class DroneDSLLibSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DroneDSLLibPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DroneDSLLibSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DroneDSLLibPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case DroneDSLLibPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroneDSLLibPackage.SECONDE_CONST:
      {
        SecondeConst secondeConst = (SecondeConst)theEObject;
        T result = caseSecondeConst(secondeConst);
        if (result == null) result = caseSecondeExp(secondeConst);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroneDSLLibPackage.POURCENT_CONST:
      {
        PourcentConst pourcentConst = (PourcentConst)theEObject;
        T result = casePourcentConst(pourcentConst);
        if (result == null) result = casePourcentExp(pourcentConst);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroneDSLLibPackage.SECONDE_DECL:
      {
        SecondeDecl secondeDecl = (SecondeDecl)theEObject;
        T result = caseSecondeDecl(secondeDecl);
        if (result == null) result = caseVarDecl(secondeDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroneDSLLibPackage.POURCENT_DECL:
      {
        PourcentDecl pourcentDecl = (PourcentDecl)theEObject;
        T result = casePourcentDecl(pourcentDecl);
        if (result == null) result = caseVarDecl(pourcentDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroneDSLLibPackage.VAR_DECL:
      {
        VarDecl varDecl = (VarDecl)theEObject;
        T result = caseVarDecl(varDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroneDSLLibPackage.REF_SECONDE_VAR:
      {
        RefSecondeVar refSecondeVar = (RefSecondeVar)theEObject;
        T result = caseRefSecondeVar(refSecondeVar);
        if (result == null) result = caseSecondeExp(refSecondeVar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroneDSLLibPackage.REF_POURCENT_VAR:
      {
        RefPourcentVar refPourcentVar = (RefPourcentVar)theEObject;
        T result = caseRefPourcentVar(refPourcentVar);
        if (result == null) result = casePourcentExp(refPourcentVar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroneDSLLibPackage.POURCENT_EXP:
      {
        PourcentExp pourcentExp = (PourcentExp)theEObject;
        T result = casePourcentExp(pourcentExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroneDSLLibPackage.SECONDE_EXP:
      {
        SecondeExp secondeExp = (SecondeExp)theEObject;
        T result = caseSecondeExp(secondeExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroneDSLLibPackage.DECOLLER:
      {
        Decoller decoller = (Decoller)theEObject;
        T result = caseDecoller(decoller);
        if (result == null) result = caseDecollerAtterrir(decoller);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroneDSLLibPackage.ATTERRIR:
      {
        Atterrir atterrir = (Atterrir)theEObject;
        T result = caseAtterrir(atterrir);
        if (result == null) result = caseDecollerAtterrir(atterrir);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroneDSLLibPackage.MONTER:
      {
        Monter monter = (Monter)theEObject;
        T result = caseMonter(monter);
        if (result == null) result = caseMouvement(monter);
        if (result == null) result = caseCommandeBasique(monter);
        if (result == null) result = caseMD(monter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroneDSLLibPackage.DESCENDRE:
      {
        Descendre descendre = (Descendre)theEObject;
        T result = caseDescendre(descendre);
        if (result == null) result = caseMouvement(descendre);
        if (result == null) result = caseCommandeBasique(descendre);
        if (result == null) result = caseMD(descendre);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroneDSLLibPackage.AVANCER:
      {
        Avancer avancer = (Avancer)theEObject;
        T result = caseAvancer(avancer);
        if (result == null) result = caseMouvement(avancer);
        if (result == null) result = caseCommandeBasique(avancer);
        if (result == null) result = caseAR(avancer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroneDSLLibPackage.RECULER:
      {
        Reculer reculer = (Reculer)theEObject;
        T result = caseReculer(reculer);
        if (result == null) result = caseMouvement(reculer);
        if (result == null) result = caseCommandeBasique(reculer);
        if (result == null) result = caseAR(reculer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroneDSLLibPackage.GAUCHE:
      {
        Gauche gauche = (Gauche)theEObject;
        T result = caseGauche(gauche);
        if (result == null) result = caseMouvement(gauche);
        if (result == null) result = caseCommandeBasique(gauche);
        if (result == null) result = caseGDr(gauche);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroneDSLLibPackage.DROITE:
      {
        Droite droite = (Droite)theEObject;
        T result = caseDroite(droite);
        if (result == null) result = caseMouvement(droite);
        if (result == null) result = caseCommandeBasique(droite);
        if (result == null) result = caseGDr(droite);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroneDSLLibPackage.ROTATION_GAUCHE:
      {
        RotationGauche rotationGauche = (RotationGauche)theEObject;
        T result = caseRotationGauche(rotationGauche);
        if (result == null) result = caseMouvement(rotationGauche);
        if (result == null) result = caseCommandeBasique(rotationGauche);
        if (result == null) result = caseRGRD(rotationGauche);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroneDSLLibPackage.ROTATION_DROITE:
      {
        RotationDroite rotationDroite = (RotationDroite)theEObject;
        T result = caseRotationDroite(rotationDroite);
        if (result == null) result = caseMouvement(rotationDroite);
        if (result == null) result = caseCommandeBasique(rotationDroite);
        if (result == null) result = caseRGRD(rotationDroite);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroneDSLLibPackage.PAUSE:
      {
        Pause pause = (Pause)theEObject;
        T result = casePause(pause);
        if (result == null) result = caseCommandeBasique(pause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroneDSLLibPackage.MOUVEMENT:
      {
        Mouvement mouvement = (Mouvement)theEObject;
        T result = caseMouvement(mouvement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroneDSLLibPackage.DECOLLER_ATTERRIR:
      {
        DecollerAtterrir decollerAtterrir = (DecollerAtterrir)theEObject;
        T result = caseDecollerAtterrir(decollerAtterrir);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroneDSLLibPackage.COMMANDE_BASIQUE:
      {
        CommandeBasique commandeBasique = (CommandeBasique)theEObject;
        T result = caseCommandeBasique(commandeBasique);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroneDSLLibPackage.FONCTION_DECL:
      {
        FonctionDecl fonctionDecl = (FonctionDecl)theEObject;
        T result = caseFonctionDecl(fonctionDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroneDSLLibPackage.FONCTION_CALL:
      {
        FonctionCall fonctionCall = (FonctionCall)theEObject;
        T result = caseFonctionCall(fonctionCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroneDSLLibPackage.FONCTION_CALL_INTERNE:
      {
        FonctionCallInterne fonctionCallInterne = (FonctionCallInterne)theEObject;
        T result = caseFonctionCallInterne(fonctionCallInterne);
        if (result == null) result = caseFonctionCall(fonctionCallInterne);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroneDSLLibPackage.MD:
      {
        MD md = (MD)theEObject;
        T result = caseMD(md);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroneDSLLibPackage.GDR:
      {
        GDr gDr = (GDr)theEObject;
        T result = caseGDr(gDr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroneDSLLibPackage.RGRD:
      {
        RGRD rgrd = (RGRD)theEObject;
        T result = caseRGRD(rgrd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroneDSLLibPackage.AR:
      {
        AR ar = (AR)theEObject;
        T result = caseAR(ar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroneDSLLibPackage.PARALLELE:
      {
        Parallele parallele = (Parallele)theEObject;
        T result = caseParallele(parallele);
        if (result == null) result = caseMouvement(parallele);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroneDSLLibPackage.PARALLELE2:
      {
        Parallele2 parallele2 = (Parallele2)theEObject;
        T result = caseParallele2(parallele2);
        if (result == null) result = caseParallele(parallele2);
        if (result == null) result = caseMouvement(parallele2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroneDSLLibPackage.PARALLELE3:
      {
        Parallele3 parallele3 = (Parallele3)theEObject;
        T result = caseParallele3(parallele3);
        if (result == null) result = caseParallele(parallele3);
        if (result == null) result = caseMouvement(parallele3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DroneDSLLibPackage.PARALLELE4:
      {
        Parallele4 parallele4 = (Parallele4)theEObject;
        T result = caseParallele4(parallele4);
        if (result == null) result = caseParallele(parallele4);
        if (result == null) result = caseMouvement(parallele4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Seconde Const</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Seconde Const</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSecondeConst(SecondeConst object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pourcent Const</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pourcent Const</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePourcentConst(PourcentConst object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Seconde Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Seconde Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSecondeDecl(SecondeDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pourcent Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pourcent Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePourcentDecl(PourcentDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Var Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Var Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVarDecl(VarDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ref Seconde Var</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ref Seconde Var</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRefSecondeVar(RefSecondeVar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ref Pourcent Var</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ref Pourcent Var</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRefPourcentVar(RefPourcentVar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pourcent Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pourcent Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePourcentExp(PourcentExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Seconde Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Seconde Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSecondeExp(SecondeExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decoller</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decoller</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecoller(Decoller object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atterrir</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atterrir</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtterrir(Atterrir object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Monter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Monter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMonter(Monter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Descendre</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Descendre</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDescendre(Descendre object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Avancer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Avancer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAvancer(Avancer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reculer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reculer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReculer(Reculer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Gauche</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gauche</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGauche(Gauche object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Droite</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Droite</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDroite(Droite object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rotation Gauche</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rotation Gauche</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRotationGauche(RotationGauche object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rotation Droite</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rotation Droite</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRotationDroite(RotationDroite object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePause(Pause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mouvement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mouvement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMouvement(Mouvement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decoller Atterrir</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decoller Atterrir</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecollerAtterrir(DecollerAtterrir object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Commande Basique</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Commande Basique</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommandeBasique(CommandeBasique object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fonction Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fonction Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFonctionDecl(FonctionDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fonction Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fonction Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFonctionCall(FonctionCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fonction Call Interne</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fonction Call Interne</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFonctionCallInterne(FonctionCallInterne object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MD</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MD</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMD(MD object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>GDr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>GDr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGDr(GDr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RGRD</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RGRD</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRGRD(RGRD object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>AR</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>AR</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAR(AR object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parallele</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parallele</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParallele(Parallele object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parallele2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parallele2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParallele2(Parallele2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parallele3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parallele3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParallele3(Parallele3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parallele4</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parallele4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParallele4(Parallele4 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //DroneDSLLibSwitch
