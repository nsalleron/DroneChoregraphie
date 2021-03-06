/**
 * generated by Xtext 2.12.0
 */
package fr.idmteam1.idmproject.dronedsl.droneDSL.impl;

import fr.idmteam1.idmproject.dronedsl.droneDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DroneDSLFactoryImpl extends EFactoryImpl implements DroneDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DroneDSLFactory init()
  {
    try
    {
      DroneDSLFactory theDroneDSLFactory = (DroneDSLFactory)EPackage.Registry.INSTANCE.getEFactory(DroneDSLPackage.eNS_URI);
      if (theDroneDSLFactory != null)
      {
        return theDroneDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DroneDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DroneDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DroneDSLPackage.MODEL: return createModel();
      case DroneDSLPackage.IMPORT: return createImport();
      case DroneDSLPackage.POURCENT_VITESSE_HAUTEUR_MAX: return createPourcent_vitesse_hauteur_max();
      case DroneDSLPackage.POURCENT_VITESSE_DEPLACEMENT_MAX: return createPourcent_vitesse_deplacement_max();
      case DroneDSLPackage.POURCENT_VITESSE_ROTATION_MAX: return createPourcent_vitesse_rotation_max();
      case DroneDSLPackage.HAUTEUR_MAX: return createHauteur_max();
      case DroneDSLPackage.ELOIGNEMENT_MAX: return createEloignement_max();
      case DroneDSLPackage.PROLOGUE: return createPrologue();
      case DroneDSLPackage.SECONDE_CONST: return createSecondeConst();
      case DroneDSLPackage.POURCENT_CONST: return createPourcentConst();
      case DroneDSLPackage.SECONDE_DECL: return createSecondeDecl();
      case DroneDSLPackage.POURCENT_DECL: return createPourcentDecl();
      case DroneDSLPackage.VAR_DECL: return createVarDecl();
      case DroneDSLPackage.REF_SECONDE_VAR: return createRefSecondeVar();
      case DroneDSLPackage.REF_POURCENT_VAR: return createRefPourcentVar();
      case DroneDSLPackage.POURCENT_EXP: return createPourcentExp();
      case DroneDSLPackage.SECONDE_EXP: return createSecondeExp();
      case DroneDSLPackage.DECOLLER: return createDecoller();
      case DroneDSLPackage.ATTERRIR: return createAtterrir();
      case DroneDSLPackage.MONTER: return createMonter();
      case DroneDSLPackage.DESCENDRE: return createDescendre();
      case DroneDSLPackage.AVANCER: return createAvancer();
      case DroneDSLPackage.RECULER: return createReculer();
      case DroneDSLPackage.GAUCHE: return createGauche();
      case DroneDSLPackage.DROITE: return createDroite();
      case DroneDSLPackage.ROTATION_GAUCHE: return createRotationGauche();
      case DroneDSLPackage.ROTATION_DROITE: return createRotationDroite();
      case DroneDSLPackage.PAUSE: return createPause();
      case DroneDSLPackage.MOUVEMENT: return createMouvement();
      case DroneDSLPackage.DECOLLER_ATTERRIR: return createDecollerAtterrir();
      case DroneDSLPackage.COMMANDE_BASIQUE: return createCommandeBasique();
      case DroneDSLPackage.FONCTION_DECL: return createFonctionDecl();
      case DroneDSLPackage.FIN_DE_MAIN: return createFinDeMain();
      case DroneDSLPackage.FONCTION_CALL: return createFonctionCall();
      case DroneDSLPackage.FONCTION_CALL_INTERNE: return createFonctionCallInterne();
      case DroneDSLPackage.FONCTION_CALL_EXTERNE: return createFonctionCallExterne();
      case DroneDSLPackage.MAIN: return createMain();
      case DroneDSLPackage.MD: return createMD();
      case DroneDSLPackage.GDR: return createGDr();
      case DroneDSLPackage.RGRD: return createRGRD();
      case DroneDSLPackage.AR: return createAR();
      case DroneDSLPackage.PARALLELE: return createParallele();
      case DroneDSLPackage.PARALLELE2: return createParallele2();
      case DroneDSLPackage.PARALLELE3: return createParallele3();
      case DroneDSLPackage.PARALLELE4: return createParallele4();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pourcent_vitesse_hauteur_max createPourcent_vitesse_hauteur_max()
  {
    Pourcent_vitesse_hauteur_maxImpl pourcent_vitesse_hauteur_max = new Pourcent_vitesse_hauteur_maxImpl();
    return pourcent_vitesse_hauteur_max;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pourcent_vitesse_deplacement_max createPourcent_vitesse_deplacement_max()
  {
    Pourcent_vitesse_deplacement_maxImpl pourcent_vitesse_deplacement_max = new Pourcent_vitesse_deplacement_maxImpl();
    return pourcent_vitesse_deplacement_max;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pourcent_vitesse_rotation_max createPourcent_vitesse_rotation_max()
  {
    Pourcent_vitesse_rotation_maxImpl pourcent_vitesse_rotation_max = new Pourcent_vitesse_rotation_maxImpl();
    return pourcent_vitesse_rotation_max;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Hauteur_max createHauteur_max()
  {
    Hauteur_maxImpl hauteur_max = new Hauteur_maxImpl();
    return hauteur_max;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Eloignement_max createEloignement_max()
  {
    Eloignement_maxImpl eloignement_max = new Eloignement_maxImpl();
    return eloignement_max;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Prologue createPrologue()
  {
    PrologueImpl prologue = new PrologueImpl();
    return prologue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SecondeConst createSecondeConst()
  {
    SecondeConstImpl secondeConst = new SecondeConstImpl();
    return secondeConst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PourcentConst createPourcentConst()
  {
    PourcentConstImpl pourcentConst = new PourcentConstImpl();
    return pourcentConst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SecondeDecl createSecondeDecl()
  {
    SecondeDeclImpl secondeDecl = new SecondeDeclImpl();
    return secondeDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PourcentDecl createPourcentDecl()
  {
    PourcentDeclImpl pourcentDecl = new PourcentDeclImpl();
    return pourcentDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarDecl createVarDecl()
  {
    VarDeclImpl varDecl = new VarDeclImpl();
    return varDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefSecondeVar createRefSecondeVar()
  {
    RefSecondeVarImpl refSecondeVar = new RefSecondeVarImpl();
    return refSecondeVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefPourcentVar createRefPourcentVar()
  {
    RefPourcentVarImpl refPourcentVar = new RefPourcentVarImpl();
    return refPourcentVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PourcentExp createPourcentExp()
  {
    PourcentExpImpl pourcentExp = new PourcentExpImpl();
    return pourcentExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SecondeExp createSecondeExp()
  {
    SecondeExpImpl secondeExp = new SecondeExpImpl();
    return secondeExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Decoller createDecoller()
  {
    DecollerImpl decoller = new DecollerImpl();
    return decoller;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Atterrir createAtterrir()
  {
    AtterrirImpl atterrir = new AtterrirImpl();
    return atterrir;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Monter createMonter()
  {
    MonterImpl monter = new MonterImpl();
    return monter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Descendre createDescendre()
  {
    DescendreImpl descendre = new DescendreImpl();
    return descendre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Avancer createAvancer()
  {
    AvancerImpl avancer = new AvancerImpl();
    return avancer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reculer createReculer()
  {
    ReculerImpl reculer = new ReculerImpl();
    return reculer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Gauche createGauche()
  {
    GaucheImpl gauche = new GaucheImpl();
    return gauche;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Droite createDroite()
  {
    DroiteImpl droite = new DroiteImpl();
    return droite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RotationGauche createRotationGauche()
  {
    RotationGaucheImpl rotationGauche = new RotationGaucheImpl();
    return rotationGauche;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RotationDroite createRotationDroite()
  {
    RotationDroiteImpl rotationDroite = new RotationDroiteImpl();
    return rotationDroite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pause createPause()
  {
    PauseImpl pause = new PauseImpl();
    return pause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mouvement createMouvement()
  {
    MouvementImpl mouvement = new MouvementImpl();
    return mouvement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecollerAtterrir createDecollerAtterrir()
  {
    DecollerAtterrirImpl decollerAtterrir = new DecollerAtterrirImpl();
    return decollerAtterrir;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommandeBasique createCommandeBasique()
  {
    CommandeBasiqueImpl commandeBasique = new CommandeBasiqueImpl();
    return commandeBasique;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FonctionDecl createFonctionDecl()
  {
    FonctionDeclImpl fonctionDecl = new FonctionDeclImpl();
    return fonctionDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FinDeMain createFinDeMain()
  {
    FinDeMainImpl finDeMain = new FinDeMainImpl();
    return finDeMain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FonctionCall createFonctionCall()
  {
    FonctionCallImpl fonctionCall = new FonctionCallImpl();
    return fonctionCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FonctionCallInterne createFonctionCallInterne()
  {
    FonctionCallInterneImpl fonctionCallInterne = new FonctionCallInterneImpl();
    return fonctionCallInterne;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FonctionCallExterne createFonctionCallExterne()
  {
    FonctionCallExterneImpl fonctionCallExterne = new FonctionCallExterneImpl();
    return fonctionCallExterne;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Main createMain()
  {
    MainImpl main = new MainImpl();
    return main;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MD createMD()
  {
    MDImpl md = new MDImpl();
    return md;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GDr createGDr()
  {
    GDrImpl gDr = new GDrImpl();
    return gDr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RGRD createRGRD()
  {
    RGRDImpl rgrd = new RGRDImpl();
    return rgrd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AR createAR()
  {
    ARImpl ar = new ARImpl();
    return ar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parallele createParallele()
  {
    ParalleleImpl parallele = new ParalleleImpl();
    return parallele;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parallele2 createParallele2()
  {
    Parallele2Impl parallele2 = new Parallele2Impl();
    return parallele2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parallele3 createParallele3()
  {
    Parallele3Impl parallele3 = new Parallele3Impl();
    return parallele3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parallele4 createParallele4()
  {
    Parallele4Impl parallele4 = new Parallele4Impl();
    return parallele4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DroneDSLPackage getDroneDSLPackage()
  {
    return (DroneDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DroneDSLPackage getPackage()
  {
    return DroneDSLPackage.eINSTANCE;
  }

} //DroneDSLFactoryImpl
