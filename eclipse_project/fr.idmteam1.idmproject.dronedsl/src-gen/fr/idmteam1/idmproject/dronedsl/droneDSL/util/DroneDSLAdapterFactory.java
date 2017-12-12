/**
 * generated by Xtext 2.12.0
 */
package fr.idmteam1.idmproject.dronedsl.droneDSL.util;

import fr.idmteam1.idmproject.dronedsl.droneDSL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.idmteam1.idmproject.dronedsl.droneDSL.DroneDSLPackage
 * @generated
 */
public class DroneDSLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DroneDSLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DroneDSLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DroneDSLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DroneDSLSwitch<Adapter> modelSwitch =
    new DroneDSLSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseMain(Main object)
      {
        return createMainAdapter();
      }
      @Override
      public Adapter casePourcentConst(PourcentConst object)
      {
        return createPourcentConstAdapter();
      }
      @Override
      public Adapter caseImports(Imports object)
      {
        return createImportsAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter casePourcent_vitesse_hauteur_max(Pourcent_vitesse_hauteur_max object)
      {
        return createPourcent_vitesse_hauteur_maxAdapter();
      }
      @Override
      public Adapter casePourcent_vitesse_deplacement_max(Pourcent_vitesse_deplacement_max object)
      {
        return createPourcent_vitesse_deplacement_maxAdapter();
      }
      @Override
      public Adapter casePourcent_vitesse_rotation_max(Pourcent_vitesse_rotation_max object)
      {
        return createPourcent_vitesse_rotation_maxAdapter();
      }
      @Override
      public Adapter caseHauteur_max(Hauteur_max object)
      {
        return createHauteur_maxAdapter();
      }
      @Override
      public Adapter caseEloignement_max(Eloignement_max object)
      {
        return createEloignement_maxAdapter();
      }
      @Override
      public Adapter caseMonter(Monter object)
      {
        return createMonterAdapter();
      }
      @Override
      public Adapter caseDescendre(Descendre object)
      {
        return createDescendreAdapter();
      }
      @Override
      public Adapter caseAvancer(Avancer object)
      {
        return createAvancerAdapter();
      }
      @Override
      public Adapter caseReculer(Reculer object)
      {
        return createReculerAdapter();
      }
      @Override
      public Adapter caseGauche(Gauche object)
      {
        return createGaucheAdapter();
      }
      @Override
      public Adapter caseDroite(Droite object)
      {
        return createDroiteAdapter();
      }
      @Override
      public Adapter casePause(Pause object)
      {
        return createPauseAdapter();
      }
      @Override
      public Adapter caseRotationGauche(RotationGauche object)
      {
        return createRotationGaucheAdapter();
      }
      @Override
      public Adapter caseRotationDroite(RotationDroite object)
      {
        return createRotationDroiteAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseFonctionDecl(FonctionDecl object)
      {
        return createFonctionDeclAdapter();
      }
      @Override
      public Adapter casePourcentDecl(PourcentDecl object)
      {
        return createPourcentDeclAdapter();
      }
      @Override
      public Adapter caseIntDecl(IntDecl object)
      {
        return createIntDeclAdapter();
      }
      @Override
      public Adapter casePourcentExp(PourcentExp object)
      {
        return createPourcentExpAdapter();
      }
      @Override
      public Adapter caseRefIntVar(RefIntVar object)
      {
        return createRefIntVarAdapter();
      }
      @Override
      public Adapter caseRefPourcentVar(RefPourcentVar object)
      {
        return createRefPourcentVarAdapter();
      }
      @Override
      public Adapter caseIntConstante(IntConstante object)
      {
        return createIntConstanteAdapter();
      }
      @Override
      public Adapter caseIntExp(IntExp object)
      {
        return createIntExpAdapter();
      }
      @Override
      public Adapter caseFonctionCall(FonctionCall object)
      {
        return createFonctionCallAdapter();
      }
      @Override
      public Adapter caseMD(MD object)
      {
        return createMDAdapter();
      }
      @Override
      public Adapter caseGDr(GDr object)
      {
        return createGDrAdapter();
      }
      @Override
      public Adapter caseRGRD(RGRD object)
      {
        return createRGRDAdapter();
      }
      @Override
      public Adapter caseAR(AR object)
      {
        return createARAdapter();
      }
      @Override
      public Adapter caseParallele2(Parallele2 object)
      {
        return createParallele2Adapter();
      }
      @Override
      public Adapter caseParallele3(Parallele3 object)
      {
        return createParallele3Adapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Main <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.Main
   * @generated
   */
  public Adapter createMainAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.PourcentConst <em>Pourcent Const</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.PourcentConst
   * @generated
   */
  public Adapter createPourcentConstAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Imports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.Imports
   * @generated
   */
  public Adapter createImportsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Pourcent_vitesse_hauteur_max <em>Pourcent vitesse hauteur max</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.Pourcent_vitesse_hauteur_max
   * @generated
   */
  public Adapter createPourcent_vitesse_hauteur_maxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Pourcent_vitesse_deplacement_max <em>Pourcent vitesse deplacement max</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.Pourcent_vitesse_deplacement_max
   * @generated
   */
  public Adapter createPourcent_vitesse_deplacement_maxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Pourcent_vitesse_rotation_max <em>Pourcent vitesse rotation max</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.Pourcent_vitesse_rotation_max
   * @generated
   */
  public Adapter createPourcent_vitesse_rotation_maxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Hauteur_max <em>Hauteur max</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.Hauteur_max
   * @generated
   */
  public Adapter createHauteur_maxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Eloignement_max <em>Eloignement max</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.Eloignement_max
   * @generated
   */
  public Adapter createEloignement_maxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Monter <em>Monter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.Monter
   * @generated
   */
  public Adapter createMonterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Descendre <em>Descendre</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.Descendre
   * @generated
   */
  public Adapter createDescendreAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Avancer <em>Avancer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.Avancer
   * @generated
   */
  public Adapter createAvancerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Reculer <em>Reculer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.Reculer
   * @generated
   */
  public Adapter createReculerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Gauche <em>Gauche</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.Gauche
   * @generated
   */
  public Adapter createGaucheAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Droite <em>Droite</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.Droite
   * @generated
   */
  public Adapter createDroiteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Pause <em>Pause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.Pause
   * @generated
   */
  public Adapter createPauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.RotationGauche <em>Rotation Gauche</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.RotationGauche
   * @generated
   */
  public Adapter createRotationGaucheAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.RotationDroite <em>Rotation Droite</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.RotationDroite
   * @generated
   */
  public Adapter createRotationDroiteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.FonctionDecl <em>Fonction Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.FonctionDecl
   * @generated
   */
  public Adapter createFonctionDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.PourcentDecl <em>Pourcent Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.PourcentDecl
   * @generated
   */
  public Adapter createPourcentDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.IntDecl <em>Int Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.IntDecl
   * @generated
   */
  public Adapter createIntDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.PourcentExp <em>Pourcent Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.PourcentExp
   * @generated
   */
  public Adapter createPourcentExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.RefIntVar <em>Ref Int Var</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.RefIntVar
   * @generated
   */
  public Adapter createRefIntVarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.RefPourcentVar <em>Ref Pourcent Var</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.RefPourcentVar
   * @generated
   */
  public Adapter createRefPourcentVarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.IntConstante <em>Int Constante</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.IntConstante
   * @generated
   */
  public Adapter createIntConstanteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.IntExp <em>Int Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.IntExp
   * @generated
   */
  public Adapter createIntExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.FonctionCall <em>Fonction Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.FonctionCall
   * @generated
   */
  public Adapter createFonctionCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.MD <em>MD</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.MD
   * @generated
   */
  public Adapter createMDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.GDr <em>GDr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.GDr
   * @generated
   */
  public Adapter createGDrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.RGRD <em>RGRD</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.RGRD
   * @generated
   */
  public Adapter createRGRDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.AR <em>AR</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.AR
   * @generated
   */
  public Adapter createARAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Parallele2 <em>Parallele2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.Parallele2
   * @generated
   */
  public Adapter createParallele2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.idmteam1.idmproject.dronedsl.droneDSL.Parallele3 <em>Parallele3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.idmteam1.idmproject.dronedsl.droneDSL.Parallele3
   * @generated
   */
  public Adapter createParallele3Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DroneDSLAdapterFactory