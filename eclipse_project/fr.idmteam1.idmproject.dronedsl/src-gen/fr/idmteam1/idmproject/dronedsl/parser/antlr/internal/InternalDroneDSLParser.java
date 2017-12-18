package fr.idmteam1.idmproject.dronedsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.idmteam1.idmproject.dronedsl.services.DroneDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDroneDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_POURCENT", "RULE_INCLUDE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\n'", "'main'", "'{'", "'}'", "'import'", "'<'", "'>'", "'define'", "'vitesse_hauteur_max'", "'vitesse_deplacement_max'", "'vitesse_rotation_max'", "'hauteur_max'", "'eloignement_max'", "'decoller'", "'('", "')'", "'atterrir'", "'monter'", "','", "'descendre'", "'avancer'", "'reculer'", "'gauche'", "'droite'", "'rotation_gauche'", "'rotation_droite'", "'func'", "'extern'", "'Pourcent'", "'='", "'Seconde'", "'&'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_POURCENT=4;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int RULE_INCLUDE=5;

    // delegates
    // delegators


        public InternalDroneDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDroneDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDroneDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDroneDSL.g"; }



     	private DroneDSLGrammarAccess grammarAccess;

        public InternalDroneDSLParser(TokenStream input, DroneDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected DroneDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalDroneDSL.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalDroneDSL.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalDroneDSL.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDroneDSL.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* (otherlv_1= '\\n' )* ( (lv_pvhm_2_0= rulePourcent_vitesse_hauteur_max ) ) (otherlv_3= '\\n' )* ( (lv_pvdm_4_0= rulePourcent_vitesse_deplacement_max ) ) (otherlv_5= '\\n' )* ( (lv_pvrm_6_0= rulePourcent_vitesse_rotation_max ) ) (otherlv_7= '\\n' )* ( (lv_hm_8_0= ruleHauteur_max ) ) (otherlv_9= '\\n' )* ( (lv_em_10_0= ruleEloignement_max ) ) (otherlv_11= '\\n' )* ( (lv_m_12_0= ruleMain ) ) ( (lv_fonctions_13_0= ruleFonctionDecl ) )* (otherlv_14= '\\n' )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        EObject lv_imports_0_0 = null;

        EObject lv_pvhm_2_0 = null;

        EObject lv_pvdm_4_0 = null;

        EObject lv_pvrm_6_0 = null;

        EObject lv_hm_8_0 = null;

        EObject lv_em_10_0 = null;

        EObject lv_m_12_0 = null;

        EObject lv_fonctions_13_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:77:2: ( ( ( (lv_imports_0_0= ruleImport ) )* (otherlv_1= '\\n' )* ( (lv_pvhm_2_0= rulePourcent_vitesse_hauteur_max ) ) (otherlv_3= '\\n' )* ( (lv_pvdm_4_0= rulePourcent_vitesse_deplacement_max ) ) (otherlv_5= '\\n' )* ( (lv_pvrm_6_0= rulePourcent_vitesse_rotation_max ) ) (otherlv_7= '\\n' )* ( (lv_hm_8_0= ruleHauteur_max ) ) (otherlv_9= '\\n' )* ( (lv_em_10_0= ruleEloignement_max ) ) (otherlv_11= '\\n' )* ( (lv_m_12_0= ruleMain ) ) ( (lv_fonctions_13_0= ruleFonctionDecl ) )* (otherlv_14= '\\n' )* ) )
            // InternalDroneDSL.g:78:2: ( ( (lv_imports_0_0= ruleImport ) )* (otherlv_1= '\\n' )* ( (lv_pvhm_2_0= rulePourcent_vitesse_hauteur_max ) ) (otherlv_3= '\\n' )* ( (lv_pvdm_4_0= rulePourcent_vitesse_deplacement_max ) ) (otherlv_5= '\\n' )* ( (lv_pvrm_6_0= rulePourcent_vitesse_rotation_max ) ) (otherlv_7= '\\n' )* ( (lv_hm_8_0= ruleHauteur_max ) ) (otherlv_9= '\\n' )* ( (lv_em_10_0= ruleEloignement_max ) ) (otherlv_11= '\\n' )* ( (lv_m_12_0= ruleMain ) ) ( (lv_fonctions_13_0= ruleFonctionDecl ) )* (otherlv_14= '\\n' )* )
            {
            // InternalDroneDSL.g:78:2: ( ( (lv_imports_0_0= ruleImport ) )* (otherlv_1= '\\n' )* ( (lv_pvhm_2_0= rulePourcent_vitesse_hauteur_max ) ) (otherlv_3= '\\n' )* ( (lv_pvdm_4_0= rulePourcent_vitesse_deplacement_max ) ) (otherlv_5= '\\n' )* ( (lv_pvrm_6_0= rulePourcent_vitesse_rotation_max ) ) (otherlv_7= '\\n' )* ( (lv_hm_8_0= ruleHauteur_max ) ) (otherlv_9= '\\n' )* ( (lv_em_10_0= ruleEloignement_max ) ) (otherlv_11= '\\n' )* ( (lv_m_12_0= ruleMain ) ) ( (lv_fonctions_13_0= ruleFonctionDecl ) )* (otherlv_14= '\\n' )* )
            // InternalDroneDSL.g:79:3: ( (lv_imports_0_0= ruleImport ) )* (otherlv_1= '\\n' )* ( (lv_pvhm_2_0= rulePourcent_vitesse_hauteur_max ) ) (otherlv_3= '\\n' )* ( (lv_pvdm_4_0= rulePourcent_vitesse_deplacement_max ) ) (otherlv_5= '\\n' )* ( (lv_pvrm_6_0= rulePourcent_vitesse_rotation_max ) ) (otherlv_7= '\\n' )* ( (lv_hm_8_0= ruleHauteur_max ) ) (otherlv_9= '\\n' )* ( (lv_em_10_0= ruleEloignement_max ) ) (otherlv_11= '\\n' )* ( (lv_m_12_0= ruleMain ) ) ( (lv_fonctions_13_0= ruleFonctionDecl ) )* (otherlv_14= '\\n' )*
            {
            // InternalDroneDSL.g:79:3: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDroneDSL.g:80:4: (lv_imports_0_0= ruleImport )
            	    {
            	    // InternalDroneDSL.g:80:4: (lv_imports_0_0= ruleImport )
            	    // InternalDroneDSL.g:81:5: lv_imports_0_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_0_0,
            	    						"fr.idmteam1.idmproject.dronedsl.DroneDSL.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalDroneDSL.g:98:3: (otherlv_1= '\\n' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDroneDSL.g:99:4: otherlv_1= '\\n'
            	    {
            	    otherlv_1=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLineFeedKeyword_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalDroneDSL.g:104:3: ( (lv_pvhm_2_0= rulePourcent_vitesse_hauteur_max ) )
            // InternalDroneDSL.g:105:4: (lv_pvhm_2_0= rulePourcent_vitesse_hauteur_max )
            {
            // InternalDroneDSL.g:105:4: (lv_pvhm_2_0= rulePourcent_vitesse_hauteur_max )
            // InternalDroneDSL.g:106:5: lv_pvhm_2_0= rulePourcent_vitesse_hauteur_max
            {

            					newCompositeNode(grammarAccess.getModelAccess().getPvhmPourcent_vitesse_hauteur_maxParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_pvhm_2_0=rulePourcent_vitesse_hauteur_max();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"pvhm",
            						lv_pvhm_2_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.Pourcent_vitesse_hauteur_max");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDroneDSL.g:123:3: (otherlv_3= '\\n' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDroneDSL.g:124:4: otherlv_3= '\\n'
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getModelAccess().getLineFeedKeyword_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalDroneDSL.g:129:3: ( (lv_pvdm_4_0= rulePourcent_vitesse_deplacement_max ) )
            // InternalDroneDSL.g:130:4: (lv_pvdm_4_0= rulePourcent_vitesse_deplacement_max )
            {
            // InternalDroneDSL.g:130:4: (lv_pvdm_4_0= rulePourcent_vitesse_deplacement_max )
            // InternalDroneDSL.g:131:5: lv_pvdm_4_0= rulePourcent_vitesse_deplacement_max
            {

            					newCompositeNode(grammarAccess.getModelAccess().getPvdmPourcent_vitesse_deplacement_maxParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_4);
            lv_pvdm_4_0=rulePourcent_vitesse_deplacement_max();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"pvdm",
            						lv_pvdm_4_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.Pourcent_vitesse_deplacement_max");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDroneDSL.g:148:3: (otherlv_5= '\\n' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDroneDSL.g:149:4: otherlv_5= '\\n'
            	    {
            	    otherlv_5=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_5, grammarAccess.getModelAccess().getLineFeedKeyword_5());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalDroneDSL.g:154:3: ( (lv_pvrm_6_0= rulePourcent_vitesse_rotation_max ) )
            // InternalDroneDSL.g:155:4: (lv_pvrm_6_0= rulePourcent_vitesse_rotation_max )
            {
            // InternalDroneDSL.g:155:4: (lv_pvrm_6_0= rulePourcent_vitesse_rotation_max )
            // InternalDroneDSL.g:156:5: lv_pvrm_6_0= rulePourcent_vitesse_rotation_max
            {

            					newCompositeNode(grammarAccess.getModelAccess().getPvrmPourcent_vitesse_rotation_maxParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_4);
            lv_pvrm_6_0=rulePourcent_vitesse_rotation_max();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"pvrm",
            						lv_pvrm_6_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.Pourcent_vitesse_rotation_max");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDroneDSL.g:173:3: (otherlv_7= '\\n' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDroneDSL.g:174:4: otherlv_7= '\\n'
            	    {
            	    otherlv_7=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_7, grammarAccess.getModelAccess().getLineFeedKeyword_7());
            	    			

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalDroneDSL.g:179:3: ( (lv_hm_8_0= ruleHauteur_max ) )
            // InternalDroneDSL.g:180:4: (lv_hm_8_0= ruleHauteur_max )
            {
            // InternalDroneDSL.g:180:4: (lv_hm_8_0= ruleHauteur_max )
            // InternalDroneDSL.g:181:5: lv_hm_8_0= ruleHauteur_max
            {

            					newCompositeNode(grammarAccess.getModelAccess().getHmHauteur_maxParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_4);
            lv_hm_8_0=ruleHauteur_max();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"hm",
            						lv_hm_8_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.Hauteur_max");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDroneDSL.g:198:3: (otherlv_9= '\\n' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDroneDSL.g:199:4: otherlv_9= '\\n'
            	    {
            	    otherlv_9=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_9, grammarAccess.getModelAccess().getLineFeedKeyword_9());
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalDroneDSL.g:204:3: ( (lv_em_10_0= ruleEloignement_max ) )
            // InternalDroneDSL.g:205:4: (lv_em_10_0= ruleEloignement_max )
            {
            // InternalDroneDSL.g:205:4: (lv_em_10_0= ruleEloignement_max )
            // InternalDroneDSL.g:206:5: lv_em_10_0= ruleEloignement_max
            {

            					newCompositeNode(grammarAccess.getModelAccess().getEmEloignement_maxParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_5);
            lv_em_10_0=ruleEloignement_max();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"em",
            						lv_em_10_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.Eloignement_max");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDroneDSL.g:223:3: (otherlv_11= '\\n' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==13) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDroneDSL.g:224:4: otherlv_11= '\\n'
            	    {
            	    otherlv_11=(Token)match(input,13,FOLLOW_5); 

            	    				newLeafNode(otherlv_11, grammarAccess.getModelAccess().getLineFeedKeyword_11());
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalDroneDSL.g:229:3: ( (lv_m_12_0= ruleMain ) )
            // InternalDroneDSL.g:230:4: (lv_m_12_0= ruleMain )
            {
            // InternalDroneDSL.g:230:4: (lv_m_12_0= ruleMain )
            // InternalDroneDSL.g:231:5: lv_m_12_0= ruleMain
            {

            					newCompositeNode(grammarAccess.getModelAccess().getMMainParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_6);
            lv_m_12_0=ruleMain();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"m",
            						lv_m_12_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.Main");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDroneDSL.g:248:3: ( (lv_fonctions_13_0= ruleFonctionDecl ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==39) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDroneDSL.g:249:4: (lv_fonctions_13_0= ruleFonctionDecl )
            	    {
            	    // InternalDroneDSL.g:249:4: (lv_fonctions_13_0= ruleFonctionDecl )
            	    // InternalDroneDSL.g:250:5: lv_fonctions_13_0= ruleFonctionDecl
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getFonctionsFonctionDeclParserRuleCall_13_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_fonctions_13_0=ruleFonctionDecl();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fonctions",
            	    						lv_fonctions_13_0,
            	    						"fr.idmteam1.idmproject.dronedsl.DroneDSL.FonctionDecl");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalDroneDSL.g:267:3: (otherlv_14= '\\n' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==13) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDroneDSL.g:268:4: otherlv_14= '\\n'
            	    {
            	    otherlv_14=(Token)match(input,13,FOLLOW_7); 

            	    				newLeafNode(otherlv_14, grammarAccess.getModelAccess().getLineFeedKeyword_14());
            	    			

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleMain"
    // InternalDroneDSL.g:277:1: entryRuleMain returns [EObject current=null] : iv_ruleMain= ruleMain EOF ;
    public final EObject entryRuleMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMain = null;


        try {
            // InternalDroneDSL.g:277:45: (iv_ruleMain= ruleMain EOF )
            // InternalDroneDSL.g:278:2: iv_ruleMain= ruleMain EOF
            {
             newCompositeNode(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMain=ruleMain();

            state._fsp--;

             current =iv_ruleMain; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // InternalDroneDSL.g:284:1: ruleMain returns [EObject current=null] : (otherlv_0= 'main' otherlv_1= '{' ( ruleStart (otherlv_3= '\\n' )* ( ( (lv_statements_4_0= ruleStatement ) ) | ( ( (lv_fonctions_5_1= ruleFonctionCall | lv_fonctions_5_2= ruleFonctionExterne ) ) ) )* (otherlv_6= '\\n' )* ruleEnd (otherlv_8= '\\n' )* )* otherlv_9= '}' (otherlv_10= '\\n' )* ) ;
    public final EObject ruleMain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_statements_4_0 = null;

        EObject lv_fonctions_5_1 = null;

        EObject lv_fonctions_5_2 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:290:2: ( (otherlv_0= 'main' otherlv_1= '{' ( ruleStart (otherlv_3= '\\n' )* ( ( (lv_statements_4_0= ruleStatement ) ) | ( ( (lv_fonctions_5_1= ruleFonctionCall | lv_fonctions_5_2= ruleFonctionExterne ) ) ) )* (otherlv_6= '\\n' )* ruleEnd (otherlv_8= '\\n' )* )* otherlv_9= '}' (otherlv_10= '\\n' )* ) )
            // InternalDroneDSL.g:291:2: (otherlv_0= 'main' otherlv_1= '{' ( ruleStart (otherlv_3= '\\n' )* ( ( (lv_statements_4_0= ruleStatement ) ) | ( ( (lv_fonctions_5_1= ruleFonctionCall | lv_fonctions_5_2= ruleFonctionExterne ) ) ) )* (otherlv_6= '\\n' )* ruleEnd (otherlv_8= '\\n' )* )* otherlv_9= '}' (otherlv_10= '\\n' )* )
            {
            // InternalDroneDSL.g:291:2: (otherlv_0= 'main' otherlv_1= '{' ( ruleStart (otherlv_3= '\\n' )* ( ( (lv_statements_4_0= ruleStatement ) ) | ( ( (lv_fonctions_5_1= ruleFonctionCall | lv_fonctions_5_2= ruleFonctionExterne ) ) ) )* (otherlv_6= '\\n' )* ruleEnd (otherlv_8= '\\n' )* )* otherlv_9= '}' (otherlv_10= '\\n' )* )
            // InternalDroneDSL.g:292:3: otherlv_0= 'main' otherlv_1= '{' ( ruleStart (otherlv_3= '\\n' )* ( ( (lv_statements_4_0= ruleStatement ) ) | ( ( (lv_fonctions_5_1= ruleFonctionCall | lv_fonctions_5_2= ruleFonctionExterne ) ) ) )* (otherlv_6= '\\n' )* ruleEnd (otherlv_8= '\\n' )* )* otherlv_9= '}' (otherlv_10= '\\n' )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getMainAccess().getMainKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getMainAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDroneDSL.g:300:3: ( ruleStart (otherlv_3= '\\n' )* ( ( (lv_statements_4_0= ruleStatement ) ) | ( ( (lv_fonctions_5_1= ruleFonctionCall | lv_fonctions_5_2= ruleFonctionExterne ) ) ) )* (otherlv_6= '\\n' )* ruleEnd (otherlv_8= '\\n' )* )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDroneDSL.g:301:4: ruleStart (otherlv_3= '\\n' )* ( ( (lv_statements_4_0= ruleStatement ) ) | ( ( (lv_fonctions_5_1= ruleFonctionCall | lv_fonctions_5_2= ruleFonctionExterne ) ) ) )* (otherlv_6= '\\n' )* ruleEnd (otherlv_8= '\\n' )*
            	    {

            	    				newCompositeNode(grammarAccess.getMainAccess().getStartParserRuleCall_2_0());
            	    			
            	    pushFollow(FOLLOW_10);
            	    ruleStart();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalDroneDSL.g:308:4: (otherlv_3= '\\n' )*
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==13) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // InternalDroneDSL.g:309:5: otherlv_3= '\\n'
            	    	    {
            	    	    otherlv_3=(Token)match(input,13,FOLLOW_10); 

            	    	    					newLeafNode(otherlv_3, grammarAccess.getMainAccess().getLineFeedKeyword_2_1());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop10;
            	        }
            	    } while (true);

            	    // InternalDroneDSL.g:314:4: ( ( (lv_statements_4_0= ruleStatement ) ) | ( ( (lv_fonctions_5_1= ruleFonctionCall | lv_fonctions_5_2= ruleFonctionExterne ) ) ) )*
            	    loop12:
            	    do {
            	        int alt12=3;
            	        int LA12_0 = input.LA(1);

            	        if ( (LA12_0==30||(LA12_0>=32 && LA12_0<=38)||LA12_0==41||LA12_0==43) ) {
            	            alt12=1;
            	        }
            	        else if ( (LA12_0==RULE_ID||LA12_0==40) ) {
            	            alt12=2;
            	        }


            	        switch (alt12) {
            	    	case 1 :
            	    	    // InternalDroneDSL.g:315:5: ( (lv_statements_4_0= ruleStatement ) )
            	    	    {
            	    	    // InternalDroneDSL.g:315:5: ( (lv_statements_4_0= ruleStatement ) )
            	    	    // InternalDroneDSL.g:316:6: (lv_statements_4_0= ruleStatement )
            	    	    {
            	    	    // InternalDroneDSL.g:316:6: (lv_statements_4_0= ruleStatement )
            	    	    // InternalDroneDSL.g:317:7: lv_statements_4_0= ruleStatement
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getMainAccess().getStatementsStatementParserRuleCall_2_2_0_0());
            	    	    						
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_statements_4_0=ruleStatement();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getMainRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"statements",
            	    	    								lv_statements_4_0,
            	    	    								"fr.idmteam1.idmproject.dronedsl.DroneDSL.Statement");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalDroneDSL.g:335:5: ( ( (lv_fonctions_5_1= ruleFonctionCall | lv_fonctions_5_2= ruleFonctionExterne ) ) )
            	    	    {
            	    	    // InternalDroneDSL.g:335:5: ( ( (lv_fonctions_5_1= ruleFonctionCall | lv_fonctions_5_2= ruleFonctionExterne ) ) )
            	    	    // InternalDroneDSL.g:336:6: ( (lv_fonctions_5_1= ruleFonctionCall | lv_fonctions_5_2= ruleFonctionExterne ) )
            	    	    {
            	    	    // InternalDroneDSL.g:336:6: ( (lv_fonctions_5_1= ruleFonctionCall | lv_fonctions_5_2= ruleFonctionExterne ) )
            	    	    // InternalDroneDSL.g:337:7: (lv_fonctions_5_1= ruleFonctionCall | lv_fonctions_5_2= ruleFonctionExterne )
            	    	    {
            	    	    // InternalDroneDSL.g:337:7: (lv_fonctions_5_1= ruleFonctionCall | lv_fonctions_5_2= ruleFonctionExterne )
            	    	    int alt11=2;
            	    	    int LA11_0 = input.LA(1);

            	    	    if ( (LA11_0==RULE_ID) ) {
            	    	        alt11=1;
            	    	    }
            	    	    else if ( (LA11_0==40) ) {
            	    	        alt11=2;
            	    	    }
            	    	    else {
            	    	        NoViableAltException nvae =
            	    	            new NoViableAltException("", 11, 0, input);

            	    	        throw nvae;
            	    	    }
            	    	    switch (alt11) {
            	    	        case 1 :
            	    	            // InternalDroneDSL.g:338:8: lv_fonctions_5_1= ruleFonctionCall
            	    	            {

            	    	            								newCompositeNode(grammarAccess.getMainAccess().getFonctionsFonctionCallParserRuleCall_2_2_1_0_0());
            	    	            							
            	    	            pushFollow(FOLLOW_10);
            	    	            lv_fonctions_5_1=ruleFonctionCall();

            	    	            state._fsp--;


            	    	            								if (current==null) {
            	    	            									current = createModelElementForParent(grammarAccess.getMainRule());
            	    	            								}
            	    	            								add(
            	    	            									current,
            	    	            									"fonctions",
            	    	            									lv_fonctions_5_1,
            	    	            									"fr.idmteam1.idmproject.dronedsl.DroneDSL.FonctionCall");
            	    	            								afterParserOrEnumRuleCall();
            	    	            							

            	    	            }
            	    	            break;
            	    	        case 2 :
            	    	            // InternalDroneDSL.g:354:8: lv_fonctions_5_2= ruleFonctionExterne
            	    	            {

            	    	            								newCompositeNode(grammarAccess.getMainAccess().getFonctionsFonctionExterneParserRuleCall_2_2_1_0_1());
            	    	            							
            	    	            pushFollow(FOLLOW_10);
            	    	            lv_fonctions_5_2=ruleFonctionExterne();

            	    	            state._fsp--;


            	    	            								if (current==null) {
            	    	            									current = createModelElementForParent(grammarAccess.getMainRule());
            	    	            								}
            	    	            								add(
            	    	            									current,
            	    	            									"fonctions",
            	    	            									lv_fonctions_5_2,
            	    	            									"fr.idmteam1.idmproject.dronedsl.DroneDSL.FonctionExterne");
            	    	            								afterParserOrEnumRuleCall();
            	    	            							

            	    	            }
            	    	            break;

            	    	    }


            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop12;
            	        }
            	    } while (true);

            	    // InternalDroneDSL.g:373:4: (otherlv_6= '\\n' )*
            	    loop13:
            	    do {
            	        int alt13=2;
            	        int LA13_0 = input.LA(1);

            	        if ( (LA13_0==13) ) {
            	            alt13=1;
            	        }


            	        switch (alt13) {
            	    	case 1 :
            	    	    // InternalDroneDSL.g:374:5: otherlv_6= '\\n'
            	    	    {
            	    	    otherlv_6=(Token)match(input,13,FOLLOW_10); 

            	    	    					newLeafNode(otherlv_6, grammarAccess.getMainAccess().getLineFeedKeyword_2_3());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop13;
            	        }
            	    } while (true);


            	    				newCompositeNode(grammarAccess.getMainAccess().getEndParserRuleCall_2_4());
            	    			
            	    pushFollow(FOLLOW_11);
            	    ruleEnd();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalDroneDSL.g:386:4: (otherlv_8= '\\n' )*
            	    loop14:
            	    do {
            	        int alt14=2;
            	        int LA14_0 = input.LA(1);

            	        if ( (LA14_0==13) ) {
            	            alt14=1;
            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // InternalDroneDSL.g:387:5: otherlv_8= '\\n'
            	    	    {
            	    	    otherlv_8=(Token)match(input,13,FOLLOW_11); 

            	    	    					newLeafNode(otherlv_8, grammarAccess.getMainAccess().getLineFeedKeyword_2_5());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop14;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getMainAccess().getRightCurlyBracketKeyword_3());
            		
            // InternalDroneDSL.g:397:3: (otherlv_10= '\\n' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==13) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDroneDSL.g:398:4: otherlv_10= '\\n'
            	    {
            	    otherlv_10=(Token)match(input,13,FOLLOW_7); 

            	    				newLeafNode(otherlv_10, grammarAccess.getMainAccess().getLineFeedKeyword_4());
            	    			

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRulePourcentConst"
    // InternalDroneDSL.g:407:1: entryRulePourcentConst returns [EObject current=null] : iv_rulePourcentConst= rulePourcentConst EOF ;
    public final EObject entryRulePourcentConst() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePourcentConst = null;


        try {
            // InternalDroneDSL.g:407:54: (iv_rulePourcentConst= rulePourcentConst EOF )
            // InternalDroneDSL.g:408:2: iv_rulePourcentConst= rulePourcentConst EOF
            {
             newCompositeNode(grammarAccess.getPourcentConstRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePourcentConst=rulePourcentConst();

            state._fsp--;

             current =iv_rulePourcentConst; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePourcentConst"


    // $ANTLR start "rulePourcentConst"
    // InternalDroneDSL.g:414:1: rulePourcentConst returns [EObject current=null] : ( (lv_val_0_0= RULE_POURCENT ) ) ;
    public final EObject rulePourcentConst() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalDroneDSL.g:420:2: ( ( (lv_val_0_0= RULE_POURCENT ) ) )
            // InternalDroneDSL.g:421:2: ( (lv_val_0_0= RULE_POURCENT ) )
            {
            // InternalDroneDSL.g:421:2: ( (lv_val_0_0= RULE_POURCENT ) )
            // InternalDroneDSL.g:422:3: (lv_val_0_0= RULE_POURCENT )
            {
            // InternalDroneDSL.g:422:3: (lv_val_0_0= RULE_POURCENT )
            // InternalDroneDSL.g:423:4: lv_val_0_0= RULE_POURCENT
            {
            lv_val_0_0=(Token)match(input,RULE_POURCENT,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getPourcentConstAccess().getValPOURCENTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPourcentConstRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
            					"fr.idmteam1.idmproject.dronedsl.DroneDSL.POURCENT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePourcentConst"


    // $ANTLR start "entryRuleImport"
    // InternalDroneDSL.g:442:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalDroneDSL.g:442:47: (iv_ruleImport= ruleImport EOF )
            // InternalDroneDSL.g:443:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalDroneDSL.g:449:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' otherlv_1= '<' ( (lv_importURI_2_0= RULE_INCLUDE ) ) otherlv_3= '>' (otherlv_4= '\\n' )* ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_importURI_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalDroneDSL.g:455:2: ( (otherlv_0= 'import' otherlv_1= '<' ( (lv_importURI_2_0= RULE_INCLUDE ) ) otherlv_3= '>' (otherlv_4= '\\n' )* ) )
            // InternalDroneDSL.g:456:2: (otherlv_0= 'import' otherlv_1= '<' ( (lv_importURI_2_0= RULE_INCLUDE ) ) otherlv_3= '>' (otherlv_4= '\\n' )* )
            {
            // InternalDroneDSL.g:456:2: (otherlv_0= 'import' otherlv_1= '<' ( (lv_importURI_2_0= RULE_INCLUDE ) ) otherlv_3= '>' (otherlv_4= '\\n' )* )
            // InternalDroneDSL.g:457:3: otherlv_0= 'import' otherlv_1= '<' ( (lv_importURI_2_0= RULE_INCLUDE ) ) otherlv_3= '>' (otherlv_4= '\\n' )*
            {
            otherlv_0=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getImportAccess().getLessThanSignKeyword_1());
            		
            // InternalDroneDSL.g:465:3: ( (lv_importURI_2_0= RULE_INCLUDE ) )
            // InternalDroneDSL.g:466:4: (lv_importURI_2_0= RULE_INCLUDE )
            {
            // InternalDroneDSL.g:466:4: (lv_importURI_2_0= RULE_INCLUDE )
            // InternalDroneDSL.g:467:5: lv_importURI_2_0= RULE_INCLUDE
            {
            lv_importURI_2_0=(Token)match(input,RULE_INCLUDE,FOLLOW_14); 

            					newLeafNode(lv_importURI_2_0, grammarAccess.getImportAccess().getImportURIINCLUDETerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"importURI",
            						lv_importURI_2_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.INCLUDE");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getImportAccess().getGreaterThanSignKeyword_3());
            		
            // InternalDroneDSL.g:487:3: (otherlv_4= '\\n' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==13) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDroneDSL.g:488:4: otherlv_4= '\\n'
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_7); 

            	    				newLeafNode(otherlv_4, grammarAccess.getImportAccess().getLineFeedKeyword_4());
            	    			

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRulePourcent_vitesse_hauteur_max"
    // InternalDroneDSL.g:497:1: entryRulePourcent_vitesse_hauteur_max returns [EObject current=null] : iv_rulePourcent_vitesse_hauteur_max= rulePourcent_vitesse_hauteur_max EOF ;
    public final EObject entryRulePourcent_vitesse_hauteur_max() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePourcent_vitesse_hauteur_max = null;


        try {
            // InternalDroneDSL.g:497:69: (iv_rulePourcent_vitesse_hauteur_max= rulePourcent_vitesse_hauteur_max EOF )
            // InternalDroneDSL.g:498:2: iv_rulePourcent_vitesse_hauteur_max= rulePourcent_vitesse_hauteur_max EOF
            {
             newCompositeNode(grammarAccess.getPourcent_vitesse_hauteur_maxRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePourcent_vitesse_hauteur_max=rulePourcent_vitesse_hauteur_max();

            state._fsp--;

             current =iv_rulePourcent_vitesse_hauteur_max; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePourcent_vitesse_hauteur_max"


    // $ANTLR start "rulePourcent_vitesse_hauteur_max"
    // InternalDroneDSL.g:504:1: rulePourcent_vitesse_hauteur_max returns [EObject current=null] : (otherlv_0= 'define' otherlv_1= 'vitesse_hauteur_max' ( (lv_vitesse_verticale_2_0= rulePourcentConst ) ) ) ;
    public final EObject rulePourcent_vitesse_hauteur_max() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_vitesse_verticale_2_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:510:2: ( (otherlv_0= 'define' otherlv_1= 'vitesse_hauteur_max' ( (lv_vitesse_verticale_2_0= rulePourcentConst ) ) ) )
            // InternalDroneDSL.g:511:2: (otherlv_0= 'define' otherlv_1= 'vitesse_hauteur_max' ( (lv_vitesse_verticale_2_0= rulePourcentConst ) ) )
            {
            // InternalDroneDSL.g:511:2: (otherlv_0= 'define' otherlv_1= 'vitesse_hauteur_max' ( (lv_vitesse_verticale_2_0= rulePourcentConst ) ) )
            // InternalDroneDSL.g:512:3: otherlv_0= 'define' otherlv_1= 'vitesse_hauteur_max' ( (lv_vitesse_verticale_2_0= rulePourcentConst ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getPourcent_vitesse_hauteur_maxAccess().getDefineKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getPourcent_vitesse_hauteur_maxAccess().getVitesse_hauteur_maxKeyword_1());
            		
            // InternalDroneDSL.g:520:3: ( (lv_vitesse_verticale_2_0= rulePourcentConst ) )
            // InternalDroneDSL.g:521:4: (lv_vitesse_verticale_2_0= rulePourcentConst )
            {
            // InternalDroneDSL.g:521:4: (lv_vitesse_verticale_2_0= rulePourcentConst )
            // InternalDroneDSL.g:522:5: lv_vitesse_verticale_2_0= rulePourcentConst
            {

            					newCompositeNode(grammarAccess.getPourcent_vitesse_hauteur_maxAccess().getVitesse_verticalePourcentConstParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_vitesse_verticale_2_0=rulePourcentConst();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPourcent_vitesse_hauteur_maxRule());
            					}
            					set(
            						current,
            						"vitesse_verticale",
            						lv_vitesse_verticale_2_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.PourcentConst");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePourcent_vitesse_hauteur_max"


    // $ANTLR start "entryRulePourcent_vitesse_deplacement_max"
    // InternalDroneDSL.g:543:1: entryRulePourcent_vitesse_deplacement_max returns [EObject current=null] : iv_rulePourcent_vitesse_deplacement_max= rulePourcent_vitesse_deplacement_max EOF ;
    public final EObject entryRulePourcent_vitesse_deplacement_max() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePourcent_vitesse_deplacement_max = null;


        try {
            // InternalDroneDSL.g:543:73: (iv_rulePourcent_vitesse_deplacement_max= rulePourcent_vitesse_deplacement_max EOF )
            // InternalDroneDSL.g:544:2: iv_rulePourcent_vitesse_deplacement_max= rulePourcent_vitesse_deplacement_max EOF
            {
             newCompositeNode(grammarAccess.getPourcent_vitesse_deplacement_maxRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePourcent_vitesse_deplacement_max=rulePourcent_vitesse_deplacement_max();

            state._fsp--;

             current =iv_rulePourcent_vitesse_deplacement_max; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePourcent_vitesse_deplacement_max"


    // $ANTLR start "rulePourcent_vitesse_deplacement_max"
    // InternalDroneDSL.g:550:1: rulePourcent_vitesse_deplacement_max returns [EObject current=null] : (otherlv_0= 'define' otherlv_1= 'vitesse_deplacement_max' ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) ) ) ;
    public final EObject rulePourcent_vitesse_deplacement_max() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_vitesse_deplacement_2_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:556:2: ( (otherlv_0= 'define' otherlv_1= 'vitesse_deplacement_max' ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) ) ) )
            // InternalDroneDSL.g:557:2: (otherlv_0= 'define' otherlv_1= 'vitesse_deplacement_max' ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) ) )
            {
            // InternalDroneDSL.g:557:2: (otherlv_0= 'define' otherlv_1= 'vitesse_deplacement_max' ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) ) )
            // InternalDroneDSL.g:558:3: otherlv_0= 'define' otherlv_1= 'vitesse_deplacement_max' ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getPourcent_vitesse_deplacement_maxAccess().getDefineKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getPourcent_vitesse_deplacement_maxAccess().getVitesse_deplacement_maxKeyword_1());
            		
            // InternalDroneDSL.g:566:3: ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) )
            // InternalDroneDSL.g:567:4: (lv_vitesse_deplacement_2_0= rulePourcentConst )
            {
            // InternalDroneDSL.g:567:4: (lv_vitesse_deplacement_2_0= rulePourcentConst )
            // InternalDroneDSL.g:568:5: lv_vitesse_deplacement_2_0= rulePourcentConst
            {

            					newCompositeNode(grammarAccess.getPourcent_vitesse_deplacement_maxAccess().getVitesse_deplacementPourcentConstParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_vitesse_deplacement_2_0=rulePourcentConst();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPourcent_vitesse_deplacement_maxRule());
            					}
            					set(
            						current,
            						"vitesse_deplacement",
            						lv_vitesse_deplacement_2_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.PourcentConst");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePourcent_vitesse_deplacement_max"


    // $ANTLR start "entryRulePourcent_vitesse_rotation_max"
    // InternalDroneDSL.g:589:1: entryRulePourcent_vitesse_rotation_max returns [EObject current=null] : iv_rulePourcent_vitesse_rotation_max= rulePourcent_vitesse_rotation_max EOF ;
    public final EObject entryRulePourcent_vitesse_rotation_max() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePourcent_vitesse_rotation_max = null;


        try {
            // InternalDroneDSL.g:589:70: (iv_rulePourcent_vitesse_rotation_max= rulePourcent_vitesse_rotation_max EOF )
            // InternalDroneDSL.g:590:2: iv_rulePourcent_vitesse_rotation_max= rulePourcent_vitesse_rotation_max EOF
            {
             newCompositeNode(grammarAccess.getPourcent_vitesse_rotation_maxRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePourcent_vitesse_rotation_max=rulePourcent_vitesse_rotation_max();

            state._fsp--;

             current =iv_rulePourcent_vitesse_rotation_max; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePourcent_vitesse_rotation_max"


    // $ANTLR start "rulePourcent_vitesse_rotation_max"
    // InternalDroneDSL.g:596:1: rulePourcent_vitesse_rotation_max returns [EObject current=null] : (otherlv_0= 'define' otherlv_1= 'vitesse_rotation_max' ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) ) ) ;
    public final EObject rulePourcent_vitesse_rotation_max() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_vitesse_deplacement_2_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:602:2: ( (otherlv_0= 'define' otherlv_1= 'vitesse_rotation_max' ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) ) ) )
            // InternalDroneDSL.g:603:2: (otherlv_0= 'define' otherlv_1= 'vitesse_rotation_max' ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) ) )
            {
            // InternalDroneDSL.g:603:2: (otherlv_0= 'define' otherlv_1= 'vitesse_rotation_max' ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) ) )
            // InternalDroneDSL.g:604:3: otherlv_0= 'define' otherlv_1= 'vitesse_rotation_max' ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getPourcent_vitesse_rotation_maxAccess().getDefineKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getPourcent_vitesse_rotation_maxAccess().getVitesse_rotation_maxKeyword_1());
            		
            // InternalDroneDSL.g:612:3: ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) )
            // InternalDroneDSL.g:613:4: (lv_vitesse_deplacement_2_0= rulePourcentConst )
            {
            // InternalDroneDSL.g:613:4: (lv_vitesse_deplacement_2_0= rulePourcentConst )
            // InternalDroneDSL.g:614:5: lv_vitesse_deplacement_2_0= rulePourcentConst
            {

            					newCompositeNode(grammarAccess.getPourcent_vitesse_rotation_maxAccess().getVitesse_deplacementPourcentConstParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_vitesse_deplacement_2_0=rulePourcentConst();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPourcent_vitesse_rotation_maxRule());
            					}
            					set(
            						current,
            						"vitesse_deplacement",
            						lv_vitesse_deplacement_2_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.PourcentConst");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePourcent_vitesse_rotation_max"


    // $ANTLR start "entryRuleHauteur_max"
    // InternalDroneDSL.g:635:1: entryRuleHauteur_max returns [EObject current=null] : iv_ruleHauteur_max= ruleHauteur_max EOF ;
    public final EObject entryRuleHauteur_max() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHauteur_max = null;


        try {
            // InternalDroneDSL.g:635:52: (iv_ruleHauteur_max= ruleHauteur_max EOF )
            // InternalDroneDSL.g:636:2: iv_ruleHauteur_max= ruleHauteur_max EOF
            {
             newCompositeNode(grammarAccess.getHauteur_maxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHauteur_max=ruleHauteur_max();

            state._fsp--;

             current =iv_ruleHauteur_max; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHauteur_max"


    // $ANTLR start "ruleHauteur_max"
    // InternalDroneDSL.g:642:1: ruleHauteur_max returns [EObject current=null] : (otherlv_0= 'define' otherlv_1= 'hauteur_max' ( (lv_hauteur_max_2_0= ruleIntExp ) ) ) ;
    public final EObject ruleHauteur_max() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_hauteur_max_2_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:648:2: ( (otherlv_0= 'define' otherlv_1= 'hauteur_max' ( (lv_hauteur_max_2_0= ruleIntExp ) ) ) )
            // InternalDroneDSL.g:649:2: (otherlv_0= 'define' otherlv_1= 'hauteur_max' ( (lv_hauteur_max_2_0= ruleIntExp ) ) )
            {
            // InternalDroneDSL.g:649:2: (otherlv_0= 'define' otherlv_1= 'hauteur_max' ( (lv_hauteur_max_2_0= ruleIntExp ) ) )
            // InternalDroneDSL.g:650:3: otherlv_0= 'define' otherlv_1= 'hauteur_max' ( (lv_hauteur_max_2_0= ruleIntExp ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getHauteur_maxAccess().getDefineKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getHauteur_maxAccess().getHauteur_maxKeyword_1());
            		
            // InternalDroneDSL.g:658:3: ( (lv_hauteur_max_2_0= ruleIntExp ) )
            // InternalDroneDSL.g:659:4: (lv_hauteur_max_2_0= ruleIntExp )
            {
            // InternalDroneDSL.g:659:4: (lv_hauteur_max_2_0= ruleIntExp )
            // InternalDroneDSL.g:660:5: lv_hauteur_max_2_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getHauteur_maxAccess().getHauteur_maxIntExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_hauteur_max_2_0=ruleIntExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHauteur_maxRule());
            					}
            					set(
            						current,
            						"hauteur_max",
            						lv_hauteur_max_2_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.IntExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHauteur_max"


    // $ANTLR start "entryRuleEloignement_max"
    // InternalDroneDSL.g:681:1: entryRuleEloignement_max returns [EObject current=null] : iv_ruleEloignement_max= ruleEloignement_max EOF ;
    public final EObject entryRuleEloignement_max() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEloignement_max = null;


        try {
            // InternalDroneDSL.g:681:56: (iv_ruleEloignement_max= ruleEloignement_max EOF )
            // InternalDroneDSL.g:682:2: iv_ruleEloignement_max= ruleEloignement_max EOF
            {
             newCompositeNode(grammarAccess.getEloignement_maxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEloignement_max=ruleEloignement_max();

            state._fsp--;

             current =iv_ruleEloignement_max; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEloignement_max"


    // $ANTLR start "ruleEloignement_max"
    // InternalDroneDSL.g:688:1: ruleEloignement_max returns [EObject current=null] : (otherlv_0= 'define' otherlv_1= 'eloignement_max' ( (lv_hauteur_max_2_0= ruleIntExp ) ) ) ;
    public final EObject ruleEloignement_max() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_hauteur_max_2_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:694:2: ( (otherlv_0= 'define' otherlv_1= 'eloignement_max' ( (lv_hauteur_max_2_0= ruleIntExp ) ) ) )
            // InternalDroneDSL.g:695:2: (otherlv_0= 'define' otherlv_1= 'eloignement_max' ( (lv_hauteur_max_2_0= ruleIntExp ) ) )
            {
            // InternalDroneDSL.g:695:2: (otherlv_0= 'define' otherlv_1= 'eloignement_max' ( (lv_hauteur_max_2_0= ruleIntExp ) ) )
            // InternalDroneDSL.g:696:3: otherlv_0= 'define' otherlv_1= 'eloignement_max' ( (lv_hauteur_max_2_0= ruleIntExp ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getEloignement_maxAccess().getDefineKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getEloignement_maxAccess().getEloignement_maxKeyword_1());
            		
            // InternalDroneDSL.g:704:3: ( (lv_hauteur_max_2_0= ruleIntExp ) )
            // InternalDroneDSL.g:705:4: (lv_hauteur_max_2_0= ruleIntExp )
            {
            // InternalDroneDSL.g:705:4: (lv_hauteur_max_2_0= ruleIntExp )
            // InternalDroneDSL.g:706:5: lv_hauteur_max_2_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getEloignement_maxAccess().getHauteur_maxIntExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_hauteur_max_2_0=ruleIntExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEloignement_maxRule());
            					}
            					set(
            						current,
            						"hauteur_max",
            						lv_hauteur_max_2_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.IntExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEloignement_max"


    // $ANTLR start "entryRuleDecoller"
    // InternalDroneDSL.g:727:1: entryRuleDecoller returns [String current=null] : iv_ruleDecoller= ruleDecoller EOF ;
    public final String entryRuleDecoller() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecoller = null;


        try {
            // InternalDroneDSL.g:727:48: (iv_ruleDecoller= ruleDecoller EOF )
            // InternalDroneDSL.g:728:2: iv_ruleDecoller= ruleDecoller EOF
            {
             newCompositeNode(grammarAccess.getDecollerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecoller=ruleDecoller();

            state._fsp--;

             current =iv_ruleDecoller.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDecoller"


    // $ANTLR start "ruleDecoller"
    // InternalDroneDSL.g:734:1: ruleDecoller returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'decoller' kw= '(' kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleDecoller() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDroneDSL.g:740:2: ( (kw= 'decoller' kw= '(' kw= ')' ) )
            // InternalDroneDSL.g:741:2: (kw= 'decoller' kw= '(' kw= ')' )
            {
            // InternalDroneDSL.g:741:2: (kw= 'decoller' kw= '(' kw= ')' )
            // InternalDroneDSL.g:742:3: kw= 'decoller' kw= '(' kw= ')'
            {
            kw=(Token)match(input,26,FOLLOW_22); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDecollerAccess().getDecollerKeyword_0());
            		
            kw=(Token)match(input,27,FOLLOW_23); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDecollerAccess().getLeftParenthesisKeyword_1());
            		
            kw=(Token)match(input,28,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDecollerAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDecoller"


    // $ANTLR start "entryRuleAtterrir"
    // InternalDroneDSL.g:761:1: entryRuleAtterrir returns [String current=null] : iv_ruleAtterrir= ruleAtterrir EOF ;
    public final String entryRuleAtterrir() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAtterrir = null;


        try {
            // InternalDroneDSL.g:761:48: (iv_ruleAtterrir= ruleAtterrir EOF )
            // InternalDroneDSL.g:762:2: iv_ruleAtterrir= ruleAtterrir EOF
            {
             newCompositeNode(grammarAccess.getAtterrirRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtterrir=ruleAtterrir();

            state._fsp--;

             current =iv_ruleAtterrir.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtterrir"


    // $ANTLR start "ruleAtterrir"
    // InternalDroneDSL.g:768:1: ruleAtterrir returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'atterrir' kw= '(' kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleAtterrir() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDroneDSL.g:774:2: ( (kw= 'atterrir' kw= '(' kw= ')' ) )
            // InternalDroneDSL.g:775:2: (kw= 'atterrir' kw= '(' kw= ')' )
            {
            // InternalDroneDSL.g:775:2: (kw= 'atterrir' kw= '(' kw= ')' )
            // InternalDroneDSL.g:776:3: kw= 'atterrir' kw= '(' kw= ')'
            {
            kw=(Token)match(input,29,FOLLOW_22); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAtterrirAccess().getAtterrirKeyword_0());
            		
            kw=(Token)match(input,27,FOLLOW_23); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAtterrirAccess().getLeftParenthesisKeyword_1());
            		
            kw=(Token)match(input,28,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAtterrirAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtterrir"


    // $ANTLR start "entryRuleMonter"
    // InternalDroneDSL.g:795:1: entryRuleMonter returns [EObject current=null] : iv_ruleMonter= ruleMonter EOF ;
    public final EObject entryRuleMonter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonter = null;


        try {
            // InternalDroneDSL.g:795:47: (iv_ruleMonter= ruleMonter EOF )
            // InternalDroneDSL.g:796:2: iv_ruleMonter= ruleMonter EOF
            {
             newCompositeNode(grammarAccess.getMonterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMonter=ruleMonter();

            state._fsp--;

             current =iv_ruleMonter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMonter"


    // $ANTLR start "ruleMonter"
    // InternalDroneDSL.g:802:1: ruleMonter returns [EObject current=null] : (otherlv_0= 'monter' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_verticale_4_0= rulePourcentExp ) ) otherlv_5= ')' ) ;
    public final EObject ruleMonter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_duree_2_0 = null;

        EObject lv_vitesse_verticale_4_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:808:2: ( (otherlv_0= 'monter' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_verticale_4_0= rulePourcentExp ) ) otherlv_5= ')' ) )
            // InternalDroneDSL.g:809:2: (otherlv_0= 'monter' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_verticale_4_0= rulePourcentExp ) ) otherlv_5= ')' )
            {
            // InternalDroneDSL.g:809:2: (otherlv_0= 'monter' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_verticale_4_0= rulePourcentExp ) ) otherlv_5= ')' )
            // InternalDroneDSL.g:810:3: otherlv_0= 'monter' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_verticale_4_0= rulePourcentExp ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getMonterAccess().getMonterKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getMonterAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDroneDSL.g:818:3: ( (lv_duree_2_0= ruleIntExp ) )
            // InternalDroneDSL.g:819:4: (lv_duree_2_0= ruleIntExp )
            {
            // InternalDroneDSL.g:819:4: (lv_duree_2_0= ruleIntExp )
            // InternalDroneDSL.g:820:5: lv_duree_2_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getMonterAccess().getDureeIntExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_duree_2_0=ruleIntExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMonterRule());
            					}
            					set(
            						current,
            						"duree",
            						lv_duree_2_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.IntExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getMonterAccess().getCommaKeyword_3());
            		
            // InternalDroneDSL.g:841:3: ( (lv_vitesse_verticale_4_0= rulePourcentExp ) )
            // InternalDroneDSL.g:842:4: (lv_vitesse_verticale_4_0= rulePourcentExp )
            {
            // InternalDroneDSL.g:842:4: (lv_vitesse_verticale_4_0= rulePourcentExp )
            // InternalDroneDSL.g:843:5: lv_vitesse_verticale_4_0= rulePourcentExp
            {

            					newCompositeNode(grammarAccess.getMonterAccess().getVitesse_verticalePourcentExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
            lv_vitesse_verticale_4_0=rulePourcentExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMonterRule());
            					}
            					set(
            						current,
            						"vitesse_verticale",
            						lv_vitesse_verticale_4_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.PourcentExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMonterAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMonter"


    // $ANTLR start "entryRuleDescendre"
    // InternalDroneDSL.g:868:1: entryRuleDescendre returns [EObject current=null] : iv_ruleDescendre= ruleDescendre EOF ;
    public final EObject entryRuleDescendre() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescendre = null;


        try {
            // InternalDroneDSL.g:868:50: (iv_ruleDescendre= ruleDescendre EOF )
            // InternalDroneDSL.g:869:2: iv_ruleDescendre= ruleDescendre EOF
            {
             newCompositeNode(grammarAccess.getDescendreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescendre=ruleDescendre();

            state._fsp--;

             current =iv_ruleDescendre; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDescendre"


    // $ANTLR start "ruleDescendre"
    // InternalDroneDSL.g:875:1: ruleDescendre returns [EObject current=null] : (otherlv_0= 'descendre' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_verticale_4_0= rulePourcentExp ) ) otherlv_5= ')' ) ;
    public final EObject ruleDescendre() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_duree_2_0 = null;

        EObject lv_vitesse_verticale_4_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:881:2: ( (otherlv_0= 'descendre' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_verticale_4_0= rulePourcentExp ) ) otherlv_5= ')' ) )
            // InternalDroneDSL.g:882:2: (otherlv_0= 'descendre' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_verticale_4_0= rulePourcentExp ) ) otherlv_5= ')' )
            {
            // InternalDroneDSL.g:882:2: (otherlv_0= 'descendre' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_verticale_4_0= rulePourcentExp ) ) otherlv_5= ')' )
            // InternalDroneDSL.g:883:3: otherlv_0= 'descendre' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_verticale_4_0= rulePourcentExp ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getDescendreAccess().getDescendreKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getDescendreAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDroneDSL.g:891:3: ( (lv_duree_2_0= ruleIntExp ) )
            // InternalDroneDSL.g:892:4: (lv_duree_2_0= ruleIntExp )
            {
            // InternalDroneDSL.g:892:4: (lv_duree_2_0= ruleIntExp )
            // InternalDroneDSL.g:893:5: lv_duree_2_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getDescendreAccess().getDureeIntExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_duree_2_0=ruleIntExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDescendreRule());
            					}
            					set(
            						current,
            						"duree",
            						lv_duree_2_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.IntExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getDescendreAccess().getCommaKeyword_3());
            		
            // InternalDroneDSL.g:914:3: ( (lv_vitesse_verticale_4_0= rulePourcentExp ) )
            // InternalDroneDSL.g:915:4: (lv_vitesse_verticale_4_0= rulePourcentExp )
            {
            // InternalDroneDSL.g:915:4: (lv_vitesse_verticale_4_0= rulePourcentExp )
            // InternalDroneDSL.g:916:5: lv_vitesse_verticale_4_0= rulePourcentExp
            {

            					newCompositeNode(grammarAccess.getDescendreAccess().getVitesse_verticalePourcentExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
            lv_vitesse_verticale_4_0=rulePourcentExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDescendreRule());
            					}
            					set(
            						current,
            						"vitesse_verticale",
            						lv_vitesse_verticale_4_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.PourcentExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDescendreAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDescendre"


    // $ANTLR start "entryRuleAvancer"
    // InternalDroneDSL.g:941:1: entryRuleAvancer returns [EObject current=null] : iv_ruleAvancer= ruleAvancer EOF ;
    public final EObject entryRuleAvancer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvancer = null;


        try {
            // InternalDroneDSL.g:941:48: (iv_ruleAvancer= ruleAvancer EOF )
            // InternalDroneDSL.g:942:2: iv_ruleAvancer= ruleAvancer EOF
            {
             newCompositeNode(grammarAccess.getAvancerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAvancer=ruleAvancer();

            state._fsp--;

             current =iv_ruleAvancer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAvancer"


    // $ANTLR start "ruleAvancer"
    // InternalDroneDSL.g:948:1: ruleAvancer returns [EObject current=null] : (otherlv_0= 'avancer' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) ) otherlv_5= ')' ) ;
    public final EObject ruleAvancer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_duree_2_0 = null;

        EObject lv_vitesse_deplacement_4_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:954:2: ( (otherlv_0= 'avancer' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) ) otherlv_5= ')' ) )
            // InternalDroneDSL.g:955:2: (otherlv_0= 'avancer' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) ) otherlv_5= ')' )
            {
            // InternalDroneDSL.g:955:2: (otherlv_0= 'avancer' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) ) otherlv_5= ')' )
            // InternalDroneDSL.g:956:3: otherlv_0= 'avancer' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getAvancerAccess().getAvancerKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getAvancerAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDroneDSL.g:964:3: ( (lv_duree_2_0= ruleIntExp ) )
            // InternalDroneDSL.g:965:4: (lv_duree_2_0= ruleIntExp )
            {
            // InternalDroneDSL.g:965:4: (lv_duree_2_0= ruleIntExp )
            // InternalDroneDSL.g:966:5: lv_duree_2_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getAvancerAccess().getDureeIntExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_duree_2_0=ruleIntExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAvancerRule());
            					}
            					set(
            						current,
            						"duree",
            						lv_duree_2_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.IntExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getAvancerAccess().getCommaKeyword_3());
            		
            // InternalDroneDSL.g:987:3: ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) )
            // InternalDroneDSL.g:988:4: (lv_vitesse_deplacement_4_0= rulePourcentExp )
            {
            // InternalDroneDSL.g:988:4: (lv_vitesse_deplacement_4_0= rulePourcentExp )
            // InternalDroneDSL.g:989:5: lv_vitesse_deplacement_4_0= rulePourcentExp
            {

            					newCompositeNode(grammarAccess.getAvancerAccess().getVitesse_deplacementPourcentExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
            lv_vitesse_deplacement_4_0=rulePourcentExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAvancerRule());
            					}
            					set(
            						current,
            						"vitesse_deplacement",
            						lv_vitesse_deplacement_4_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.PourcentExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAvancerAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAvancer"


    // $ANTLR start "entryRuleReculer"
    // InternalDroneDSL.g:1014:1: entryRuleReculer returns [EObject current=null] : iv_ruleReculer= ruleReculer EOF ;
    public final EObject entryRuleReculer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReculer = null;


        try {
            // InternalDroneDSL.g:1014:48: (iv_ruleReculer= ruleReculer EOF )
            // InternalDroneDSL.g:1015:2: iv_ruleReculer= ruleReculer EOF
            {
             newCompositeNode(grammarAccess.getReculerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReculer=ruleReculer();

            state._fsp--;

             current =iv_ruleReculer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReculer"


    // $ANTLR start "ruleReculer"
    // InternalDroneDSL.g:1021:1: ruleReculer returns [EObject current=null] : (otherlv_0= 'reculer' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) ) otherlv_5= ')' ) ;
    public final EObject ruleReculer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_duree_2_0 = null;

        EObject lv_vitesse_deplacement_4_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1027:2: ( (otherlv_0= 'reculer' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) ) otherlv_5= ')' ) )
            // InternalDroneDSL.g:1028:2: (otherlv_0= 'reculer' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) ) otherlv_5= ')' )
            {
            // InternalDroneDSL.g:1028:2: (otherlv_0= 'reculer' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) ) otherlv_5= ')' )
            // InternalDroneDSL.g:1029:3: otherlv_0= 'reculer' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getReculerAccess().getReculerKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getReculerAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDroneDSL.g:1037:3: ( (lv_duree_2_0= ruleIntExp ) )
            // InternalDroneDSL.g:1038:4: (lv_duree_2_0= ruleIntExp )
            {
            // InternalDroneDSL.g:1038:4: (lv_duree_2_0= ruleIntExp )
            // InternalDroneDSL.g:1039:5: lv_duree_2_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getReculerAccess().getDureeIntExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_duree_2_0=ruleIntExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReculerRule());
            					}
            					set(
            						current,
            						"duree",
            						lv_duree_2_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.IntExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getReculerAccess().getCommaKeyword_3());
            		
            // InternalDroneDSL.g:1060:3: ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) )
            // InternalDroneDSL.g:1061:4: (lv_vitesse_deplacement_4_0= rulePourcentExp )
            {
            // InternalDroneDSL.g:1061:4: (lv_vitesse_deplacement_4_0= rulePourcentExp )
            // InternalDroneDSL.g:1062:5: lv_vitesse_deplacement_4_0= rulePourcentExp
            {

            					newCompositeNode(grammarAccess.getReculerAccess().getVitesse_deplacementPourcentExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
            lv_vitesse_deplacement_4_0=rulePourcentExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReculerRule());
            					}
            					set(
            						current,
            						"vitesse_deplacement",
            						lv_vitesse_deplacement_4_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.PourcentExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getReculerAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReculer"


    // $ANTLR start "entryRuleGauche"
    // InternalDroneDSL.g:1087:1: entryRuleGauche returns [EObject current=null] : iv_ruleGauche= ruleGauche EOF ;
    public final EObject entryRuleGauche() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGauche = null;


        try {
            // InternalDroneDSL.g:1087:47: (iv_ruleGauche= ruleGauche EOF )
            // InternalDroneDSL.g:1088:2: iv_ruleGauche= ruleGauche EOF
            {
             newCompositeNode(grammarAccess.getGaucheRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGauche=ruleGauche();

            state._fsp--;

             current =iv_ruleGauche; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGauche"


    // $ANTLR start "ruleGauche"
    // InternalDroneDSL.g:1094:1: ruleGauche returns [EObject current=null] : (otherlv_0= 'gauche' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) ) otherlv_5= ')' ) ;
    public final EObject ruleGauche() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_duree_2_0 = null;

        EObject lv_vitesse_deplacement_4_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1100:2: ( (otherlv_0= 'gauche' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) ) otherlv_5= ')' ) )
            // InternalDroneDSL.g:1101:2: (otherlv_0= 'gauche' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) ) otherlv_5= ')' )
            {
            // InternalDroneDSL.g:1101:2: (otherlv_0= 'gauche' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) ) otherlv_5= ')' )
            // InternalDroneDSL.g:1102:3: otherlv_0= 'gauche' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getGaucheAccess().getGaucheKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getGaucheAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDroneDSL.g:1110:3: ( (lv_duree_2_0= ruleIntExp ) )
            // InternalDroneDSL.g:1111:4: (lv_duree_2_0= ruleIntExp )
            {
            // InternalDroneDSL.g:1111:4: (lv_duree_2_0= ruleIntExp )
            // InternalDroneDSL.g:1112:5: lv_duree_2_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getGaucheAccess().getDureeIntExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_duree_2_0=ruleIntExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGaucheRule());
            					}
            					set(
            						current,
            						"duree",
            						lv_duree_2_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.IntExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getGaucheAccess().getCommaKeyword_3());
            		
            // InternalDroneDSL.g:1133:3: ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) )
            // InternalDroneDSL.g:1134:4: (lv_vitesse_deplacement_4_0= rulePourcentExp )
            {
            // InternalDroneDSL.g:1134:4: (lv_vitesse_deplacement_4_0= rulePourcentExp )
            // InternalDroneDSL.g:1135:5: lv_vitesse_deplacement_4_0= rulePourcentExp
            {

            					newCompositeNode(grammarAccess.getGaucheAccess().getVitesse_deplacementPourcentExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
            lv_vitesse_deplacement_4_0=rulePourcentExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGaucheRule());
            					}
            					set(
            						current,
            						"vitesse_deplacement",
            						lv_vitesse_deplacement_4_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.PourcentExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getGaucheAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGauche"


    // $ANTLR start "entryRuleDroite"
    // InternalDroneDSL.g:1160:1: entryRuleDroite returns [EObject current=null] : iv_ruleDroite= ruleDroite EOF ;
    public final EObject entryRuleDroite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDroite = null;


        try {
            // InternalDroneDSL.g:1160:47: (iv_ruleDroite= ruleDroite EOF )
            // InternalDroneDSL.g:1161:2: iv_ruleDroite= ruleDroite EOF
            {
             newCompositeNode(grammarAccess.getDroiteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDroite=ruleDroite();

            state._fsp--;

             current =iv_ruleDroite; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDroite"


    // $ANTLR start "ruleDroite"
    // InternalDroneDSL.g:1167:1: ruleDroite returns [EObject current=null] : (otherlv_0= 'droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) ) otherlv_5= ')' ) ;
    public final EObject ruleDroite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_duree_2_0 = null;

        EObject lv_vitesse_deplacement_4_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1173:2: ( (otherlv_0= 'droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) ) otherlv_5= ')' ) )
            // InternalDroneDSL.g:1174:2: (otherlv_0= 'droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) ) otherlv_5= ')' )
            {
            // InternalDroneDSL.g:1174:2: (otherlv_0= 'droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) ) otherlv_5= ')' )
            // InternalDroneDSL.g:1175:3: otherlv_0= 'droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getDroiteAccess().getDroiteKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getDroiteAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDroneDSL.g:1183:3: ( (lv_duree_2_0= ruleIntExp ) )
            // InternalDroneDSL.g:1184:4: (lv_duree_2_0= ruleIntExp )
            {
            // InternalDroneDSL.g:1184:4: (lv_duree_2_0= ruleIntExp )
            // InternalDroneDSL.g:1185:5: lv_duree_2_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getDroiteAccess().getDureeIntExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_duree_2_0=ruleIntExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDroiteRule());
            					}
            					set(
            						current,
            						"duree",
            						lv_duree_2_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.IntExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getDroiteAccess().getCommaKeyword_3());
            		
            // InternalDroneDSL.g:1206:3: ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) )
            // InternalDroneDSL.g:1207:4: (lv_vitesse_deplacement_4_0= rulePourcentExp )
            {
            // InternalDroneDSL.g:1207:4: (lv_vitesse_deplacement_4_0= rulePourcentExp )
            // InternalDroneDSL.g:1208:5: lv_vitesse_deplacement_4_0= rulePourcentExp
            {

            					newCompositeNode(grammarAccess.getDroiteAccess().getVitesse_deplacementPourcentExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
            lv_vitesse_deplacement_4_0=rulePourcentExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDroiteRule());
            					}
            					set(
            						current,
            						"vitesse_deplacement",
            						lv_vitesse_deplacement_4_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.PourcentExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDroiteAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDroite"


    // $ANTLR start "entryRulePause"
    // InternalDroneDSL.g:1233:1: entryRulePause returns [EObject current=null] : iv_rulePause= rulePause EOF ;
    public final EObject entryRulePause() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePause = null;


        try {
            // InternalDroneDSL.g:1233:46: (iv_rulePause= rulePause EOF )
            // InternalDroneDSL.g:1234:2: iv_rulePause= rulePause EOF
            {
             newCompositeNode(grammarAccess.getPauseRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePause=rulePause();

            state._fsp--;

             current =iv_rulePause; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePause"


    // $ANTLR start "rulePause"
    // InternalDroneDSL.g:1240:1: rulePause returns [EObject current=null] : (otherlv_0= 'droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ')' ) ;
    public final EObject rulePause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_duree_2_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1246:2: ( (otherlv_0= 'droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ')' ) )
            // InternalDroneDSL.g:1247:2: (otherlv_0= 'droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ')' )
            {
            // InternalDroneDSL.g:1247:2: (otherlv_0= 'droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ')' )
            // InternalDroneDSL.g:1248:3: otherlv_0= 'droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getPauseAccess().getDroiteKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getPauseAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDroneDSL.g:1256:3: ( (lv_duree_2_0= ruleIntExp ) )
            // InternalDroneDSL.g:1257:4: (lv_duree_2_0= ruleIntExp )
            {
            // InternalDroneDSL.g:1257:4: (lv_duree_2_0= ruleIntExp )
            // InternalDroneDSL.g:1258:5: lv_duree_2_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getPauseAccess().getDureeIntExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
            lv_duree_2_0=ruleIntExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPauseRule());
            					}
            					set(
            						current,
            						"duree",
            						lv_duree_2_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.IntExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPauseAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePause"


    // $ANTLR start "entryRuleRotationGauche"
    // InternalDroneDSL.g:1283:1: entryRuleRotationGauche returns [EObject current=null] : iv_ruleRotationGauche= ruleRotationGauche EOF ;
    public final EObject entryRuleRotationGauche() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotationGauche = null;


        try {
            // InternalDroneDSL.g:1283:55: (iv_ruleRotationGauche= ruleRotationGauche EOF )
            // InternalDroneDSL.g:1284:2: iv_ruleRotationGauche= ruleRotationGauche EOF
            {
             newCompositeNode(grammarAccess.getRotationGaucheRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRotationGauche=ruleRotationGauche();

            state._fsp--;

             current =iv_ruleRotationGauche; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRotationGauche"


    // $ANTLR start "ruleRotationGauche"
    // InternalDroneDSL.g:1290:1: ruleRotationGauche returns [EObject current=null] : (otherlv_0= 'rotation_gauche' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_rotation_4_0= rulePourcentExp ) ) otherlv_5= ')' ) ;
    public final EObject ruleRotationGauche() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_duree_2_0 = null;

        EObject lv_vitesse_rotation_4_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1296:2: ( (otherlv_0= 'rotation_gauche' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_rotation_4_0= rulePourcentExp ) ) otherlv_5= ')' ) )
            // InternalDroneDSL.g:1297:2: (otherlv_0= 'rotation_gauche' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_rotation_4_0= rulePourcentExp ) ) otherlv_5= ')' )
            {
            // InternalDroneDSL.g:1297:2: (otherlv_0= 'rotation_gauche' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_rotation_4_0= rulePourcentExp ) ) otherlv_5= ')' )
            // InternalDroneDSL.g:1298:3: otherlv_0= 'rotation_gauche' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_rotation_4_0= rulePourcentExp ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getRotationGaucheAccess().getRotation_gaucheKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getRotationGaucheAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDroneDSL.g:1306:3: ( (lv_duree_2_0= ruleIntExp ) )
            // InternalDroneDSL.g:1307:4: (lv_duree_2_0= ruleIntExp )
            {
            // InternalDroneDSL.g:1307:4: (lv_duree_2_0= ruleIntExp )
            // InternalDroneDSL.g:1308:5: lv_duree_2_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getRotationGaucheAccess().getDureeIntExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_duree_2_0=ruleIntExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotationGaucheRule());
            					}
            					set(
            						current,
            						"duree",
            						lv_duree_2_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.IntExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getRotationGaucheAccess().getCommaKeyword_3());
            		
            // InternalDroneDSL.g:1329:3: ( (lv_vitesse_rotation_4_0= rulePourcentExp ) )
            // InternalDroneDSL.g:1330:4: (lv_vitesse_rotation_4_0= rulePourcentExp )
            {
            // InternalDroneDSL.g:1330:4: (lv_vitesse_rotation_4_0= rulePourcentExp )
            // InternalDroneDSL.g:1331:5: lv_vitesse_rotation_4_0= rulePourcentExp
            {

            					newCompositeNode(grammarAccess.getRotationGaucheAccess().getVitesse_rotationPourcentExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
            lv_vitesse_rotation_4_0=rulePourcentExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotationGaucheRule());
            					}
            					set(
            						current,
            						"vitesse_rotation",
            						lv_vitesse_rotation_4_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.PourcentExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRotationGaucheAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRotationGauche"


    // $ANTLR start "entryRuleRotationDroite"
    // InternalDroneDSL.g:1356:1: entryRuleRotationDroite returns [EObject current=null] : iv_ruleRotationDroite= ruleRotationDroite EOF ;
    public final EObject entryRuleRotationDroite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotationDroite = null;


        try {
            // InternalDroneDSL.g:1356:55: (iv_ruleRotationDroite= ruleRotationDroite EOF )
            // InternalDroneDSL.g:1357:2: iv_ruleRotationDroite= ruleRotationDroite EOF
            {
             newCompositeNode(grammarAccess.getRotationDroiteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRotationDroite=ruleRotationDroite();

            state._fsp--;

             current =iv_ruleRotationDroite; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRotationDroite"


    // $ANTLR start "ruleRotationDroite"
    // InternalDroneDSL.g:1363:1: ruleRotationDroite returns [EObject current=null] : (otherlv_0= 'rotation_droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_rotation_4_0= rulePourcentExp ) ) otherlv_5= ')' ) ;
    public final EObject ruleRotationDroite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_duree_2_0 = null;

        EObject lv_vitesse_rotation_4_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1369:2: ( (otherlv_0= 'rotation_droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_rotation_4_0= rulePourcentExp ) ) otherlv_5= ')' ) )
            // InternalDroneDSL.g:1370:2: (otherlv_0= 'rotation_droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_rotation_4_0= rulePourcentExp ) ) otherlv_5= ')' )
            {
            // InternalDroneDSL.g:1370:2: (otherlv_0= 'rotation_droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_rotation_4_0= rulePourcentExp ) ) otherlv_5= ')' )
            // InternalDroneDSL.g:1371:3: otherlv_0= 'rotation_droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_rotation_4_0= rulePourcentExp ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getRotationDroiteAccess().getRotation_droiteKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getRotationDroiteAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDroneDSL.g:1379:3: ( (lv_duree_2_0= ruleIntExp ) )
            // InternalDroneDSL.g:1380:4: (lv_duree_2_0= ruleIntExp )
            {
            // InternalDroneDSL.g:1380:4: (lv_duree_2_0= ruleIntExp )
            // InternalDroneDSL.g:1381:5: lv_duree_2_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getRotationDroiteAccess().getDureeIntExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_duree_2_0=ruleIntExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotationDroiteRule());
            					}
            					set(
            						current,
            						"duree",
            						lv_duree_2_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.IntExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getRotationDroiteAccess().getCommaKeyword_3());
            		
            // InternalDroneDSL.g:1402:3: ( (lv_vitesse_rotation_4_0= rulePourcentExp ) )
            // InternalDroneDSL.g:1403:4: (lv_vitesse_rotation_4_0= rulePourcentExp )
            {
            // InternalDroneDSL.g:1403:4: (lv_vitesse_rotation_4_0= rulePourcentExp )
            // InternalDroneDSL.g:1404:5: lv_vitesse_rotation_4_0= rulePourcentExp
            {

            					newCompositeNode(grammarAccess.getRotationDroiteAccess().getVitesse_rotationPourcentExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
            lv_vitesse_rotation_4_0=rulePourcentExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotationDroiteRule());
            					}
            					set(
            						current,
            						"vitesse_rotation",
            						lv_vitesse_rotation_4_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.PourcentExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRotationDroiteAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRotationDroite"


    // $ANTLR start "entryRuleStart"
    // InternalDroneDSL.g:1429:1: entryRuleStart returns [String current=null] : iv_ruleStart= ruleStart EOF ;
    public final String entryRuleStart() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStart = null;


        try {
            // InternalDroneDSL.g:1429:45: (iv_ruleStart= ruleStart EOF )
            // InternalDroneDSL.g:1430:2: iv_ruleStart= ruleStart EOF
            {
             newCompositeNode(grammarAccess.getStartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStart=ruleStart();

            state._fsp--;

             current =iv_ruleStart.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStart"


    // $ANTLR start "ruleStart"
    // InternalDroneDSL.g:1436:1: ruleStart returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Decoller_0= ruleDecoller ;
    public final AntlrDatatypeRuleToken ruleStart() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Decoller_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1442:2: (this_Decoller_0= ruleDecoller )
            // InternalDroneDSL.g:1443:2: this_Decoller_0= ruleDecoller
            {

            		newCompositeNode(grammarAccess.getStartAccess().getDecollerParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Decoller_0=ruleDecoller();

            state._fsp--;


            		current.merge(this_Decoller_0);
            	

            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStart"


    // $ANTLR start "entryRuleEnd"
    // InternalDroneDSL.g:1456:1: entryRuleEnd returns [String current=null] : iv_ruleEnd= ruleEnd EOF ;
    public final String entryRuleEnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnd = null;


        try {
            // InternalDroneDSL.g:1456:43: (iv_ruleEnd= ruleEnd EOF )
            // InternalDroneDSL.g:1457:2: iv_ruleEnd= ruleEnd EOF
            {
             newCompositeNode(grammarAccess.getEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnd=ruleEnd();

            state._fsp--;

             current =iv_ruleEnd.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnd"


    // $ANTLR start "ruleEnd"
    // InternalDroneDSL.g:1463:1: ruleEnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Atterrir_0= ruleAtterrir ;
    public final AntlrDatatypeRuleToken ruleEnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Atterrir_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1469:2: (this_Atterrir_0= ruleAtterrir )
            // InternalDroneDSL.g:1470:2: this_Atterrir_0= ruleAtterrir
            {

            		newCompositeNode(grammarAccess.getEndAccess().getAtterrirParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Atterrir_0=ruleAtterrir();

            state._fsp--;


            		current.merge(this_Atterrir_0);
            	

            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnd"


    // $ANTLR start "entryRuleStatement"
    // InternalDroneDSL.g:1483:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalDroneDSL.g:1483:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalDroneDSL.g:1484:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalDroneDSL.g:1490:1: ruleStatement returns [EObject current=null] : (this_Avancer_0= ruleAvancer | this_Descendre_1= ruleDescendre | this_RotationDroite_2= ruleRotationDroite | this_RotationGauche_3= ruleRotationGauche | this_Pause_4= rulePause | this_Droite_5= ruleDroite | this_Gauche_6= ruleGauche | this_Reculer_7= ruleReculer | this_Monter_8= ruleMonter | this_Parallele_9= ruleParallele | this_VarDecl_10= ruleVarDecl ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Avancer_0 = null;

        EObject this_Descendre_1 = null;

        EObject this_RotationDroite_2 = null;

        EObject this_RotationGauche_3 = null;

        EObject this_Pause_4 = null;

        EObject this_Droite_5 = null;

        EObject this_Gauche_6 = null;

        EObject this_Reculer_7 = null;

        EObject this_Monter_8 = null;

        EObject this_Parallele_9 = null;

        EObject this_VarDecl_10 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1496:2: ( (this_Avancer_0= ruleAvancer | this_Descendre_1= ruleDescendre | this_RotationDroite_2= ruleRotationDroite | this_RotationGauche_3= ruleRotationGauche | this_Pause_4= rulePause | this_Droite_5= ruleDroite | this_Gauche_6= ruleGauche | this_Reculer_7= ruleReculer | this_Monter_8= ruleMonter | this_Parallele_9= ruleParallele | this_VarDecl_10= ruleVarDecl ) )
            // InternalDroneDSL.g:1497:2: (this_Avancer_0= ruleAvancer | this_Descendre_1= ruleDescendre | this_RotationDroite_2= ruleRotationDroite | this_RotationGauche_3= ruleRotationGauche | this_Pause_4= rulePause | this_Droite_5= ruleDroite | this_Gauche_6= ruleGauche | this_Reculer_7= ruleReculer | this_Monter_8= ruleMonter | this_Parallele_9= ruleParallele | this_VarDecl_10= ruleVarDecl )
            {
            // InternalDroneDSL.g:1497:2: (this_Avancer_0= ruleAvancer | this_Descendre_1= ruleDescendre | this_RotationDroite_2= ruleRotationDroite | this_RotationGauche_3= ruleRotationGauche | this_Pause_4= rulePause | this_Droite_5= ruleDroite | this_Gauche_6= ruleGauche | this_Reculer_7= ruleReculer | this_Monter_8= ruleMonter | this_Parallele_9= ruleParallele | this_VarDecl_10= ruleVarDecl )
            int alt18=11;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalDroneDSL.g:1498:3: this_Avancer_0= ruleAvancer
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getAvancerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Avancer_0=ruleAvancer();

                    state._fsp--;


                    			current = this_Avancer_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDroneDSL.g:1507:3: this_Descendre_1= ruleDescendre
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getDescendreParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Descendre_1=ruleDescendre();

                    state._fsp--;


                    			current = this_Descendre_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDroneDSL.g:1516:3: this_RotationDroite_2= ruleRotationDroite
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getRotationDroiteParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RotationDroite_2=ruleRotationDroite();

                    state._fsp--;


                    			current = this_RotationDroite_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDroneDSL.g:1525:3: this_RotationGauche_3= ruleRotationGauche
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getRotationGaucheParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_RotationGauche_3=ruleRotationGauche();

                    state._fsp--;


                    			current = this_RotationGauche_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDroneDSL.g:1534:3: this_Pause_4= rulePause
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getPauseParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Pause_4=rulePause();

                    state._fsp--;


                    			current = this_Pause_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalDroneDSL.g:1543:3: this_Droite_5= ruleDroite
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getDroiteParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Droite_5=ruleDroite();

                    state._fsp--;


                    			current = this_Droite_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalDroneDSL.g:1552:3: this_Gauche_6= ruleGauche
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getGaucheParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Gauche_6=ruleGauche();

                    state._fsp--;


                    			current = this_Gauche_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalDroneDSL.g:1561:3: this_Reculer_7= ruleReculer
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getReculerParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reculer_7=ruleReculer();

                    state._fsp--;


                    			current = this_Reculer_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalDroneDSL.g:1570:3: this_Monter_8= ruleMonter
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getMonterParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Monter_8=ruleMonter();

                    state._fsp--;


                    			current = this_Monter_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalDroneDSL.g:1579:3: this_Parallele_9= ruleParallele
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getParalleleParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parallele_9=ruleParallele();

                    state._fsp--;


                    			current = this_Parallele_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalDroneDSL.g:1588:3: this_VarDecl_10= ruleVarDecl
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getVarDeclParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_VarDecl_10=ruleVarDecl();

                    state._fsp--;


                    			current = this_VarDecl_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleFonctionDecl"
    // InternalDroneDSL.g:1600:1: entryRuleFonctionDecl returns [EObject current=null] : iv_ruleFonctionDecl= ruleFonctionDecl EOF ;
    public final EObject entryRuleFonctionDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFonctionDecl = null;


        try {
            // InternalDroneDSL.g:1600:53: (iv_ruleFonctionDecl= ruleFonctionDecl EOF )
            // InternalDroneDSL.g:1601:2: iv_ruleFonctionDecl= ruleFonctionDecl EOF
            {
             newCompositeNode(grammarAccess.getFonctionDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFonctionDecl=ruleFonctionDecl();

            state._fsp--;

             current =iv_ruleFonctionDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFonctionDecl"


    // $ANTLR start "ruleFonctionDecl"
    // InternalDroneDSL.g:1607:1: ruleFonctionDecl returns [EObject current=null] : (otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( ( (lv_a_5_0= ruleStart ) ) | ( (lv_b_6_0= ruleEnd ) ) | ( ( (lv_body_7_1= ruleStatement | lv_body_7_2= ruleFonctionExterne | lv_body_7_3= ruleFonctionCall ) ) ) )* (otherlv_8= '\\n' )* otherlv_9= '}' ) ;
    public final EObject ruleFonctionDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_a_5_0 = null;

        AntlrDatatypeRuleToken lv_b_6_0 = null;

        EObject lv_body_7_1 = null;

        EObject lv_body_7_2 = null;

        EObject lv_body_7_3 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1613:2: ( (otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( ( (lv_a_5_0= ruleStart ) ) | ( (lv_b_6_0= ruleEnd ) ) | ( ( (lv_body_7_1= ruleStatement | lv_body_7_2= ruleFonctionExterne | lv_body_7_3= ruleFonctionCall ) ) ) )* (otherlv_8= '\\n' )* otherlv_9= '}' ) )
            // InternalDroneDSL.g:1614:2: (otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( ( (lv_a_5_0= ruleStart ) ) | ( (lv_b_6_0= ruleEnd ) ) | ( ( (lv_body_7_1= ruleStatement | lv_body_7_2= ruleFonctionExterne | lv_body_7_3= ruleFonctionCall ) ) ) )* (otherlv_8= '\\n' )* otherlv_9= '}' )
            {
            // InternalDroneDSL.g:1614:2: (otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( ( (lv_a_5_0= ruleStart ) ) | ( (lv_b_6_0= ruleEnd ) ) | ( ( (lv_body_7_1= ruleStatement | lv_body_7_2= ruleFonctionExterne | lv_body_7_3= ruleFonctionCall ) ) ) )* (otherlv_8= '\\n' )* otherlv_9= '}' )
            // InternalDroneDSL.g:1615:3: otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( ( (lv_a_5_0= ruleStart ) ) | ( (lv_b_6_0= ruleEnd ) ) | ( ( (lv_body_7_1= ruleStatement | lv_body_7_2= ruleFonctionExterne | lv_body_7_3= ruleFonctionCall ) ) ) )* (otherlv_8= '\\n' )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getFonctionDeclAccess().getFuncKeyword_0());
            		
            // InternalDroneDSL.g:1619:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDroneDSL.g:1620:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDroneDSL.g:1620:4: (lv_name_1_0= RULE_ID )
            // InternalDroneDSL.g:1621:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFonctionDeclAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFonctionDeclRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getFonctionDeclAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getFonctionDeclAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getFonctionDeclAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalDroneDSL.g:1649:3: ( ( (lv_a_5_0= ruleStart ) ) | ( (lv_b_6_0= ruleEnd ) ) | ( ( (lv_body_7_1= ruleStatement | lv_body_7_2= ruleFonctionExterne | lv_body_7_3= ruleFonctionCall ) ) ) )*
            loop20:
            do {
                int alt20=4;
                switch ( input.LA(1) ) {
                case 26:
                    {
                    alt20=1;
                    }
                    break;
                case 29:
                    {
                    alt20=2;
                    }
                    break;
                case RULE_ID:
                case 30:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 40:
                case 41:
                case 43:
                    {
                    alt20=3;
                    }
                    break;

                }

                switch (alt20) {
            	case 1 :
            	    // InternalDroneDSL.g:1650:4: ( (lv_a_5_0= ruleStart ) )
            	    {
            	    // InternalDroneDSL.g:1650:4: ( (lv_a_5_0= ruleStart ) )
            	    // InternalDroneDSL.g:1651:5: (lv_a_5_0= ruleStart )
            	    {
            	    // InternalDroneDSL.g:1651:5: (lv_a_5_0= ruleStart )
            	    // InternalDroneDSL.g:1652:6: lv_a_5_0= ruleStart
            	    {

            	    						newCompositeNode(grammarAccess.getFonctionDeclAccess().getAStartParserRuleCall_5_0_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_a_5_0=ruleStart();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFonctionDeclRule());
            	    						}
            	    						add(
            	    							current,
            	    							"a",
            	    							lv_a_5_0,
            	    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.Start");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDroneDSL.g:1670:4: ( (lv_b_6_0= ruleEnd ) )
            	    {
            	    // InternalDroneDSL.g:1670:4: ( (lv_b_6_0= ruleEnd ) )
            	    // InternalDroneDSL.g:1671:5: (lv_b_6_0= ruleEnd )
            	    {
            	    // InternalDroneDSL.g:1671:5: (lv_b_6_0= ruleEnd )
            	    // InternalDroneDSL.g:1672:6: lv_b_6_0= ruleEnd
            	    {

            	    						newCompositeNode(grammarAccess.getFonctionDeclAccess().getBEndParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_b_6_0=ruleEnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFonctionDeclRule());
            	    						}
            	    						add(
            	    							current,
            	    							"b",
            	    							lv_b_6_0,
            	    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.End");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDroneDSL.g:1690:4: ( ( (lv_body_7_1= ruleStatement | lv_body_7_2= ruleFonctionExterne | lv_body_7_3= ruleFonctionCall ) ) )
            	    {
            	    // InternalDroneDSL.g:1690:4: ( ( (lv_body_7_1= ruleStatement | lv_body_7_2= ruleFonctionExterne | lv_body_7_3= ruleFonctionCall ) ) )
            	    // InternalDroneDSL.g:1691:5: ( (lv_body_7_1= ruleStatement | lv_body_7_2= ruleFonctionExterne | lv_body_7_3= ruleFonctionCall ) )
            	    {
            	    // InternalDroneDSL.g:1691:5: ( (lv_body_7_1= ruleStatement | lv_body_7_2= ruleFonctionExterne | lv_body_7_3= ruleFonctionCall ) )
            	    // InternalDroneDSL.g:1692:6: (lv_body_7_1= ruleStatement | lv_body_7_2= ruleFonctionExterne | lv_body_7_3= ruleFonctionCall )
            	    {
            	    // InternalDroneDSL.g:1692:6: (lv_body_7_1= ruleStatement | lv_body_7_2= ruleFonctionExterne | lv_body_7_3= ruleFonctionCall )
            	    int alt19=3;
            	    switch ( input.LA(1) ) {
            	    case 30:
            	    case 32:
            	    case 33:
            	    case 34:
            	    case 35:
            	    case 36:
            	    case 37:
            	    case 38:
            	    case 41:
            	    case 43:
            	        {
            	        alt19=1;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt19=2;
            	        }
            	        break;
            	    case RULE_ID:
            	        {
            	        alt19=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt19) {
            	        case 1 :
            	            // InternalDroneDSL.g:1693:7: lv_body_7_1= ruleStatement
            	            {

            	            							newCompositeNode(grammarAccess.getFonctionDeclAccess().getBodyStatementParserRuleCall_5_2_0_0());
            	            						
            	            pushFollow(FOLLOW_27);
            	            lv_body_7_1=ruleStatement();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getFonctionDeclRule());
            	            							}
            	            							add(
            	            								current,
            	            								"body",
            	            								lv_body_7_1,
            	            								"fr.idmteam1.idmproject.dronedsl.DroneDSL.Statement");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalDroneDSL.g:1709:7: lv_body_7_2= ruleFonctionExterne
            	            {

            	            							newCompositeNode(grammarAccess.getFonctionDeclAccess().getBodyFonctionExterneParserRuleCall_5_2_0_1());
            	            						
            	            pushFollow(FOLLOW_27);
            	            lv_body_7_2=ruleFonctionExterne();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getFonctionDeclRule());
            	            							}
            	            							add(
            	            								current,
            	            								"body",
            	            								lv_body_7_2,
            	            								"fr.idmteam1.idmproject.dronedsl.DroneDSL.FonctionExterne");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalDroneDSL.g:1725:7: lv_body_7_3= ruleFonctionCall
            	            {

            	            							newCompositeNode(grammarAccess.getFonctionDeclAccess().getBodyFonctionCallParserRuleCall_5_2_0_2());
            	            						
            	            pushFollow(FOLLOW_27);
            	            lv_body_7_3=ruleFonctionCall();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getFonctionDeclRule());
            	            							}
            	            							add(
            	            								current,
            	            								"body",
            	            								lv_body_7_3,
            	            								"fr.idmteam1.idmproject.dronedsl.DroneDSL.FonctionCall");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // InternalDroneDSL.g:1744:3: (otherlv_8= '\\n' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==13) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDroneDSL.g:1745:4: otherlv_8= '\\n'
            	    {
            	    otherlv_8=(Token)match(input,13,FOLLOW_28); 

            	    				newLeafNode(otherlv_8, grammarAccess.getFonctionDeclAccess().getLineFeedKeyword_6());
            	    			

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getFonctionDeclAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFonctionDecl"


    // $ANTLR start "entryRuleFonctionExterne"
    // InternalDroneDSL.g:1758:1: entryRuleFonctionExterne returns [EObject current=null] : iv_ruleFonctionExterne= ruleFonctionExterne EOF ;
    public final EObject entryRuleFonctionExterne() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFonctionExterne = null;


        try {
            // InternalDroneDSL.g:1758:56: (iv_ruleFonctionExterne= ruleFonctionExterne EOF )
            // InternalDroneDSL.g:1759:2: iv_ruleFonctionExterne= ruleFonctionExterne EOF
            {
             newCompositeNode(grammarAccess.getFonctionExterneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFonctionExterne=ruleFonctionExterne();

            state._fsp--;

             current =iv_ruleFonctionExterne; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFonctionExterne"


    // $ANTLR start "ruleFonctionExterne"
    // InternalDroneDSL.g:1765:1: ruleFonctionExterne returns [EObject current=null] : (otherlv_0= 'extern' otherlv_1= 'func' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' otherlv_4= ')' (otherlv_5= '\\n' )* ) ;
    public final EObject ruleFonctionExterne() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalDroneDSL.g:1771:2: ( (otherlv_0= 'extern' otherlv_1= 'func' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' otherlv_4= ')' (otherlv_5= '\\n' )* ) )
            // InternalDroneDSL.g:1772:2: (otherlv_0= 'extern' otherlv_1= 'func' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' otherlv_4= ')' (otherlv_5= '\\n' )* )
            {
            // InternalDroneDSL.g:1772:2: (otherlv_0= 'extern' otherlv_1= 'func' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' otherlv_4= ')' (otherlv_5= '\\n' )* )
            // InternalDroneDSL.g:1773:3: otherlv_0= 'extern' otherlv_1= 'func' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' otherlv_4= ')' (otherlv_5= '\\n' )*
            {
            otherlv_0=(Token)match(input,40,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getFonctionExterneAccess().getExternKeyword_0());
            		
            otherlv_1=(Token)match(input,39,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getFonctionExterneAccess().getFuncKeyword_1());
            		
            // InternalDroneDSL.g:1781:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDroneDSL.g:1782:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDroneDSL.g:1782:4: (lv_name_2_0= RULE_ID )
            // InternalDroneDSL.g:1783:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFonctionExterneAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFonctionExterneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getFonctionExterneAccess().getLeftParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,28,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getFonctionExterneAccess().getRightParenthesisKeyword_4());
            		
            // InternalDroneDSL.g:1807:3: (otherlv_5= '\\n' )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==13) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDroneDSL.g:1808:4: otherlv_5= '\\n'
            	    {
            	    otherlv_5=(Token)match(input,13,FOLLOW_7); 

            	    				newLeafNode(otherlv_5, grammarAccess.getFonctionExterneAccess().getLineFeedKeyword_5());
            	    			

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFonctionExterne"


    // $ANTLR start "entryRulePourcentDecl"
    // InternalDroneDSL.g:1817:1: entryRulePourcentDecl returns [EObject current=null] : iv_rulePourcentDecl= rulePourcentDecl EOF ;
    public final EObject entryRulePourcentDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePourcentDecl = null;


        try {
            // InternalDroneDSL.g:1817:53: (iv_rulePourcentDecl= rulePourcentDecl EOF )
            // InternalDroneDSL.g:1818:2: iv_rulePourcentDecl= rulePourcentDecl EOF
            {
             newCompositeNode(grammarAccess.getPourcentDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePourcentDecl=rulePourcentDecl();

            state._fsp--;

             current =iv_rulePourcentDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePourcentDecl"


    // $ANTLR start "rulePourcentDecl"
    // InternalDroneDSL.g:1824:1: rulePourcentDecl returns [EObject current=null] : (otherlv_0= 'Pourcent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= rulePourcentConst ) ) ) ;
    public final EObject rulePourcentDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_val_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1830:2: ( (otherlv_0= 'Pourcent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= rulePourcentConst ) ) ) )
            // InternalDroneDSL.g:1831:2: (otherlv_0= 'Pourcent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= rulePourcentConst ) ) )
            {
            // InternalDroneDSL.g:1831:2: (otherlv_0= 'Pourcent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= rulePourcentConst ) ) )
            // InternalDroneDSL.g:1832:3: otherlv_0= 'Pourcent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= rulePourcentConst ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getPourcentDeclAccess().getPourcentKeyword_0());
            		
            // InternalDroneDSL.g:1836:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDroneDSL.g:1837:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDroneDSL.g:1837:4: (lv_name_1_0= RULE_ID )
            // InternalDroneDSL.g:1838:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPourcentDeclAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPourcentDeclRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,42,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getPourcentDeclAccess().getEqualsSignKeyword_2());
            		
            // InternalDroneDSL.g:1858:3: ( (lv_val_3_0= rulePourcentConst ) )
            // InternalDroneDSL.g:1859:4: (lv_val_3_0= rulePourcentConst )
            {
            // InternalDroneDSL.g:1859:4: (lv_val_3_0= rulePourcentConst )
            // InternalDroneDSL.g:1860:5: lv_val_3_0= rulePourcentConst
            {

            					newCompositeNode(grammarAccess.getPourcentDeclAccess().getValPourcentConstParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_3_0=rulePourcentConst();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPourcentDeclRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_3_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.PourcentConst");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePourcentDecl"


    // $ANTLR start "entryRuleIntDecl"
    // InternalDroneDSL.g:1881:1: entryRuleIntDecl returns [EObject current=null] : iv_ruleIntDecl= ruleIntDecl EOF ;
    public final EObject entryRuleIntDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntDecl = null;


        try {
            // InternalDroneDSL.g:1881:48: (iv_ruleIntDecl= ruleIntDecl EOF )
            // InternalDroneDSL.g:1882:2: iv_ruleIntDecl= ruleIntDecl EOF
            {
             newCompositeNode(grammarAccess.getIntDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntDecl=ruleIntDecl();

            state._fsp--;

             current =iv_ruleIntDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntDecl"


    // $ANTLR start "ruleIntDecl"
    // InternalDroneDSL.g:1888:1: ruleIntDecl returns [EObject current=null] : (otherlv_0= 'Seconde' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleIntExp ) ) ) ;
    public final EObject ruleIntDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_val_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1894:2: ( (otherlv_0= 'Seconde' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleIntExp ) ) ) )
            // InternalDroneDSL.g:1895:2: (otherlv_0= 'Seconde' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleIntExp ) ) )
            {
            // InternalDroneDSL.g:1895:2: (otherlv_0= 'Seconde' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleIntExp ) ) )
            // InternalDroneDSL.g:1896:3: otherlv_0= 'Seconde' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleIntExp ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getIntDeclAccess().getSecondeKeyword_0());
            		
            // InternalDroneDSL.g:1900:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDroneDSL.g:1901:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDroneDSL.g:1901:4: (lv_name_1_0= RULE_ID )
            // InternalDroneDSL.g:1902:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(lv_name_1_0, grammarAccess.getIntDeclAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntDeclRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,42,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getIntDeclAccess().getEqualsSignKeyword_2());
            		
            // InternalDroneDSL.g:1922:3: ( (lv_val_3_0= ruleIntExp ) )
            // InternalDroneDSL.g:1923:4: (lv_val_3_0= ruleIntExp )
            {
            // InternalDroneDSL.g:1923:4: (lv_val_3_0= ruleIntExp )
            // InternalDroneDSL.g:1924:5: lv_val_3_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getIntDeclAccess().getValIntExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_3_0=ruleIntExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntDeclRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_3_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.IntExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntDecl"


    // $ANTLR start "entryRuleVarDecl"
    // InternalDroneDSL.g:1945:1: entryRuleVarDecl returns [EObject current=null] : iv_ruleVarDecl= ruleVarDecl EOF ;
    public final EObject entryRuleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDecl = null;


        try {
            // InternalDroneDSL.g:1945:48: (iv_ruleVarDecl= ruleVarDecl EOF )
            // InternalDroneDSL.g:1946:2: iv_ruleVarDecl= ruleVarDecl EOF
            {
             newCompositeNode(grammarAccess.getVarDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarDecl=ruleVarDecl();

            state._fsp--;

             current =iv_ruleVarDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarDecl"


    // $ANTLR start "ruleVarDecl"
    // InternalDroneDSL.g:1952:1: ruleVarDecl returns [EObject current=null] : (this_PourcentDecl_0= rulePourcentDecl | this_IntDecl_1= ruleIntDecl ) ;
    public final EObject ruleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject this_PourcentDecl_0 = null;

        EObject this_IntDecl_1 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1958:2: ( (this_PourcentDecl_0= rulePourcentDecl | this_IntDecl_1= ruleIntDecl ) )
            // InternalDroneDSL.g:1959:2: (this_PourcentDecl_0= rulePourcentDecl | this_IntDecl_1= ruleIntDecl )
            {
            // InternalDroneDSL.g:1959:2: (this_PourcentDecl_0= rulePourcentDecl | this_IntDecl_1= ruleIntDecl )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==41) ) {
                alt23=1;
            }
            else if ( (LA23_0==43) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalDroneDSL.g:1960:3: this_PourcentDecl_0= rulePourcentDecl
                    {

                    			newCompositeNode(grammarAccess.getVarDeclAccess().getPourcentDeclParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PourcentDecl_0=rulePourcentDecl();

                    state._fsp--;


                    			current = this_PourcentDecl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDroneDSL.g:1969:3: this_IntDecl_1= ruleIntDecl
                    {

                    			newCompositeNode(grammarAccess.getVarDeclAccess().getIntDeclParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntDecl_1=ruleIntDecl();

                    state._fsp--;


                    			current = this_IntDecl_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarDecl"


    // $ANTLR start "entryRulePourcentExp"
    // InternalDroneDSL.g:1981:1: entryRulePourcentExp returns [EObject current=null] : iv_rulePourcentExp= rulePourcentExp EOF ;
    public final EObject entryRulePourcentExp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePourcentExp = null;


        try {
            // InternalDroneDSL.g:1981:52: (iv_rulePourcentExp= rulePourcentExp EOF )
            // InternalDroneDSL.g:1982:2: iv_rulePourcentExp= rulePourcentExp EOF
            {
             newCompositeNode(grammarAccess.getPourcentExpRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePourcentExp=rulePourcentExp();

            state._fsp--;

             current =iv_rulePourcentExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePourcentExp"


    // $ANTLR start "rulePourcentExp"
    // InternalDroneDSL.g:1988:1: rulePourcentExp returns [EObject current=null] : (this_PourcentConst_0= rulePourcentConst | this_RefPourcentVar_1= ruleRefPourcentVar ) ;
    public final EObject rulePourcentExp() throws RecognitionException {
        EObject current = null;

        EObject this_PourcentConst_0 = null;

        EObject this_RefPourcentVar_1 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1994:2: ( (this_PourcentConst_0= rulePourcentConst | this_RefPourcentVar_1= ruleRefPourcentVar ) )
            // InternalDroneDSL.g:1995:2: (this_PourcentConst_0= rulePourcentConst | this_RefPourcentVar_1= ruleRefPourcentVar )
            {
            // InternalDroneDSL.g:1995:2: (this_PourcentConst_0= rulePourcentConst | this_RefPourcentVar_1= ruleRefPourcentVar )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_POURCENT) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_ID) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalDroneDSL.g:1996:3: this_PourcentConst_0= rulePourcentConst
                    {

                    			newCompositeNode(grammarAccess.getPourcentExpAccess().getPourcentConstParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PourcentConst_0=rulePourcentConst();

                    state._fsp--;


                    			current = this_PourcentConst_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDroneDSL.g:2005:3: this_RefPourcentVar_1= ruleRefPourcentVar
                    {

                    			newCompositeNode(grammarAccess.getPourcentExpAccess().getRefPourcentVarParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RefPourcentVar_1=ruleRefPourcentVar();

                    state._fsp--;


                    			current = this_RefPourcentVar_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePourcentExp"


    // $ANTLR start "entryRuleRefIntVar"
    // InternalDroneDSL.g:2017:1: entryRuleRefIntVar returns [EObject current=null] : iv_ruleRefIntVar= ruleRefIntVar EOF ;
    public final EObject entryRuleRefIntVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefIntVar = null;


        try {
            // InternalDroneDSL.g:2017:50: (iv_ruleRefIntVar= ruleRefIntVar EOF )
            // InternalDroneDSL.g:2018:2: iv_ruleRefIntVar= ruleRefIntVar EOF
            {
             newCompositeNode(grammarAccess.getRefIntVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRefIntVar=ruleRefIntVar();

            state._fsp--;

             current =iv_ruleRefIntVar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRefIntVar"


    // $ANTLR start "ruleRefIntVar"
    // InternalDroneDSL.g:2024:1: ruleRefIntVar returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleRefIntVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDroneDSL.g:2030:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalDroneDSL.g:2031:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalDroneDSL.g:2031:2: ( (otherlv_0= RULE_ID ) )
            // InternalDroneDSL.g:2032:3: (otherlv_0= RULE_ID )
            {
            // InternalDroneDSL.g:2032:3: (otherlv_0= RULE_ID )
            // InternalDroneDSL.g:2033:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRefIntVarRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getRefIntVarAccess().getVarIntDeclCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRefIntVar"


    // $ANTLR start "entryRuleRefPourcentVar"
    // InternalDroneDSL.g:2047:1: entryRuleRefPourcentVar returns [EObject current=null] : iv_ruleRefPourcentVar= ruleRefPourcentVar EOF ;
    public final EObject entryRuleRefPourcentVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefPourcentVar = null;


        try {
            // InternalDroneDSL.g:2047:55: (iv_ruleRefPourcentVar= ruleRefPourcentVar EOF )
            // InternalDroneDSL.g:2048:2: iv_ruleRefPourcentVar= ruleRefPourcentVar EOF
            {
             newCompositeNode(grammarAccess.getRefPourcentVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRefPourcentVar=ruleRefPourcentVar();

            state._fsp--;

             current =iv_ruleRefPourcentVar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRefPourcentVar"


    // $ANTLR start "ruleRefPourcentVar"
    // InternalDroneDSL.g:2054:1: ruleRefPourcentVar returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleRefPourcentVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDroneDSL.g:2060:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalDroneDSL.g:2061:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalDroneDSL.g:2061:2: ( (otherlv_0= RULE_ID ) )
            // InternalDroneDSL.g:2062:3: (otherlv_0= RULE_ID )
            {
            // InternalDroneDSL.g:2062:3: (otherlv_0= RULE_ID )
            // InternalDroneDSL.g:2063:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRefPourcentVarRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getRefPourcentVarAccess().getVarPourcentDeclCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRefPourcentVar"


    // $ANTLR start "entryRuleIntConstante"
    // InternalDroneDSL.g:2077:1: entryRuleIntConstante returns [EObject current=null] : iv_ruleIntConstante= ruleIntConstante EOF ;
    public final EObject entryRuleIntConstante() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntConstante = null;


        try {
            // InternalDroneDSL.g:2077:53: (iv_ruleIntConstante= ruleIntConstante EOF )
            // InternalDroneDSL.g:2078:2: iv_ruleIntConstante= ruleIntConstante EOF
            {
             newCompositeNode(grammarAccess.getIntConstanteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntConstante=ruleIntConstante();

            state._fsp--;

             current =iv_ruleIntConstante; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntConstante"


    // $ANTLR start "ruleIntConstante"
    // InternalDroneDSL.g:2084:1: ruleIntConstante returns [EObject current=null] : ( (lv_val_0_0= RULE_INT ) ) ;
    public final EObject ruleIntConstante() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalDroneDSL.g:2090:2: ( ( (lv_val_0_0= RULE_INT ) ) )
            // InternalDroneDSL.g:2091:2: ( (lv_val_0_0= RULE_INT ) )
            {
            // InternalDroneDSL.g:2091:2: ( (lv_val_0_0= RULE_INT ) )
            // InternalDroneDSL.g:2092:3: (lv_val_0_0= RULE_INT )
            {
            // InternalDroneDSL.g:2092:3: (lv_val_0_0= RULE_INT )
            // InternalDroneDSL.g:2093:4: lv_val_0_0= RULE_INT
            {
            lv_val_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getIntConstanteAccess().getValINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntConstanteRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntConstante"


    // $ANTLR start "entryRuleIntExp"
    // InternalDroneDSL.g:2112:1: entryRuleIntExp returns [EObject current=null] : iv_ruleIntExp= ruleIntExp EOF ;
    public final EObject entryRuleIntExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntExp = null;


        try {
            // InternalDroneDSL.g:2112:47: (iv_ruleIntExp= ruleIntExp EOF )
            // InternalDroneDSL.g:2113:2: iv_ruleIntExp= ruleIntExp EOF
            {
             newCompositeNode(grammarAccess.getIntExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntExp=ruleIntExp();

            state._fsp--;

             current =iv_ruleIntExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntExp"


    // $ANTLR start "ruleIntExp"
    // InternalDroneDSL.g:2119:1: ruleIntExp returns [EObject current=null] : (this_IntConstante_0= ruleIntConstante | this_RefIntVar_1= ruleRefIntVar ) ;
    public final EObject ruleIntExp() throws RecognitionException {
        EObject current = null;

        EObject this_IntConstante_0 = null;

        EObject this_RefIntVar_1 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:2125:2: ( (this_IntConstante_0= ruleIntConstante | this_RefIntVar_1= ruleRefIntVar ) )
            // InternalDroneDSL.g:2126:2: (this_IntConstante_0= ruleIntConstante | this_RefIntVar_1= ruleRefIntVar )
            {
            // InternalDroneDSL.g:2126:2: (this_IntConstante_0= ruleIntConstante | this_RefIntVar_1= ruleRefIntVar )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_INT) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_ID) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalDroneDSL.g:2127:3: this_IntConstante_0= ruleIntConstante
                    {

                    			newCompositeNode(grammarAccess.getIntExpAccess().getIntConstanteParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntConstante_0=ruleIntConstante();

                    state._fsp--;


                    			current = this_IntConstante_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDroneDSL.g:2136:3: this_RefIntVar_1= ruleRefIntVar
                    {

                    			newCompositeNode(grammarAccess.getIntExpAccess().getRefIntVarParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RefIntVar_1=ruleRefIntVar();

                    state._fsp--;


                    			current = this_RefIntVar_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntExp"


    // $ANTLR start "entryRuleFonctionCall"
    // InternalDroneDSL.g:2148:1: entryRuleFonctionCall returns [EObject current=null] : iv_ruleFonctionCall= ruleFonctionCall EOF ;
    public final EObject entryRuleFonctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFonctionCall = null;


        try {
            // InternalDroneDSL.g:2148:53: (iv_ruleFonctionCall= ruleFonctionCall EOF )
            // InternalDroneDSL.g:2149:2: iv_ruleFonctionCall= ruleFonctionCall EOF
            {
             newCompositeNode(grammarAccess.getFonctionCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFonctionCall=ruleFonctionCall();

            state._fsp--;

             current =iv_ruleFonctionCall; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFonctionCall"


    // $ANTLR start "ruleFonctionCall"
    // InternalDroneDSL.g:2155:1: ruleFonctionCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' ) ;
    public final EObject ruleFonctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDroneDSL.g:2161:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' ) )
            // InternalDroneDSL.g:2162:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' )
            {
            // InternalDroneDSL.g:2162:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' )
            // InternalDroneDSL.g:2163:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')'
            {
            // InternalDroneDSL.g:2163:3: ( (otherlv_0= RULE_ID ) )
            // InternalDroneDSL.g:2164:4: (otherlv_0= RULE_ID )
            {
            // InternalDroneDSL.g:2164:4: (otherlv_0= RULE_ID )
            // InternalDroneDSL.g:2165:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFonctionCallRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_0, grammarAccess.getFonctionCallAccess().getFuncFonctionRefCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getFonctionCallAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getFonctionCallAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFonctionCall"


    // $ANTLR start "entryRuleMD"
    // InternalDroneDSL.g:2188:1: entryRuleMD returns [EObject current=null] : iv_ruleMD= ruleMD EOF ;
    public final EObject entryRuleMD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMD = null;


        try {
            // InternalDroneDSL.g:2188:43: (iv_ruleMD= ruleMD EOF )
            // InternalDroneDSL.g:2189:2: iv_ruleMD= ruleMD EOF
            {
             newCompositeNode(grammarAccess.getMDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMD=ruleMD();

            state._fsp--;

             current =iv_ruleMD; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMD"


    // $ANTLR start "ruleMD"
    // InternalDroneDSL.g:2195:1: ruleMD returns [EObject current=null] : (this_Monter_0= ruleMonter | this_Descendre_1= ruleDescendre ) ;
    public final EObject ruleMD() throws RecognitionException {
        EObject current = null;

        EObject this_Monter_0 = null;

        EObject this_Descendre_1 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:2201:2: ( (this_Monter_0= ruleMonter | this_Descendre_1= ruleDescendre ) )
            // InternalDroneDSL.g:2202:2: (this_Monter_0= ruleMonter | this_Descendre_1= ruleDescendre )
            {
            // InternalDroneDSL.g:2202:2: (this_Monter_0= ruleMonter | this_Descendre_1= ruleDescendre )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==30) ) {
                alt26=1;
            }
            else if ( (LA26_0==32) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalDroneDSL.g:2203:3: this_Monter_0= ruleMonter
                    {

                    			newCompositeNode(grammarAccess.getMDAccess().getMonterParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Monter_0=ruleMonter();

                    state._fsp--;


                    			current = this_Monter_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDroneDSL.g:2212:3: this_Descendre_1= ruleDescendre
                    {

                    			newCompositeNode(grammarAccess.getMDAccess().getDescendreParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Descendre_1=ruleDescendre();

                    state._fsp--;


                    			current = this_Descendre_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMD"


    // $ANTLR start "entryRuleGDr"
    // InternalDroneDSL.g:2224:1: entryRuleGDr returns [EObject current=null] : iv_ruleGDr= ruleGDr EOF ;
    public final EObject entryRuleGDr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGDr = null;


        try {
            // InternalDroneDSL.g:2224:44: (iv_ruleGDr= ruleGDr EOF )
            // InternalDroneDSL.g:2225:2: iv_ruleGDr= ruleGDr EOF
            {
             newCompositeNode(grammarAccess.getGDrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGDr=ruleGDr();

            state._fsp--;

             current =iv_ruleGDr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGDr"


    // $ANTLR start "ruleGDr"
    // InternalDroneDSL.g:2231:1: ruleGDr returns [EObject current=null] : (this_Gauche_0= ruleGauche | this_Droite_1= ruleDroite ) ;
    public final EObject ruleGDr() throws RecognitionException {
        EObject current = null;

        EObject this_Gauche_0 = null;

        EObject this_Droite_1 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:2237:2: ( (this_Gauche_0= ruleGauche | this_Droite_1= ruleDroite ) )
            // InternalDroneDSL.g:2238:2: (this_Gauche_0= ruleGauche | this_Droite_1= ruleDroite )
            {
            // InternalDroneDSL.g:2238:2: (this_Gauche_0= ruleGauche | this_Droite_1= ruleDroite )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35) ) {
                alt27=1;
            }
            else if ( (LA27_0==36) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalDroneDSL.g:2239:3: this_Gauche_0= ruleGauche
                    {

                    			newCompositeNode(grammarAccess.getGDrAccess().getGaucheParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Gauche_0=ruleGauche();

                    state._fsp--;


                    			current = this_Gauche_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDroneDSL.g:2248:3: this_Droite_1= ruleDroite
                    {

                    			newCompositeNode(grammarAccess.getGDrAccess().getDroiteParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Droite_1=ruleDroite();

                    state._fsp--;


                    			current = this_Droite_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGDr"


    // $ANTLR start "entryRuleRGRD"
    // InternalDroneDSL.g:2260:1: entryRuleRGRD returns [EObject current=null] : iv_ruleRGRD= ruleRGRD EOF ;
    public final EObject entryRuleRGRD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRGRD = null;


        try {
            // InternalDroneDSL.g:2260:45: (iv_ruleRGRD= ruleRGRD EOF )
            // InternalDroneDSL.g:2261:2: iv_ruleRGRD= ruleRGRD EOF
            {
             newCompositeNode(grammarAccess.getRGRDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRGRD=ruleRGRD();

            state._fsp--;

             current =iv_ruleRGRD; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRGRD"


    // $ANTLR start "ruleRGRD"
    // InternalDroneDSL.g:2267:1: ruleRGRD returns [EObject current=null] : (this_RotationGauche_0= ruleRotationGauche | this_RotationDroite_1= ruleRotationDroite ) ;
    public final EObject ruleRGRD() throws RecognitionException {
        EObject current = null;

        EObject this_RotationGauche_0 = null;

        EObject this_RotationDroite_1 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:2273:2: ( (this_RotationGauche_0= ruleRotationGauche | this_RotationDroite_1= ruleRotationDroite ) )
            // InternalDroneDSL.g:2274:2: (this_RotationGauche_0= ruleRotationGauche | this_RotationDroite_1= ruleRotationDroite )
            {
            // InternalDroneDSL.g:2274:2: (this_RotationGauche_0= ruleRotationGauche | this_RotationDroite_1= ruleRotationDroite )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==37) ) {
                alt28=1;
            }
            else if ( (LA28_0==38) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalDroneDSL.g:2275:3: this_RotationGauche_0= ruleRotationGauche
                    {

                    			newCompositeNode(grammarAccess.getRGRDAccess().getRotationGaucheParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RotationGauche_0=ruleRotationGauche();

                    state._fsp--;


                    			current = this_RotationGauche_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDroneDSL.g:2284:3: this_RotationDroite_1= ruleRotationDroite
                    {

                    			newCompositeNode(grammarAccess.getRGRDAccess().getRotationDroiteParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RotationDroite_1=ruleRotationDroite();

                    state._fsp--;


                    			current = this_RotationDroite_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRGRD"


    // $ANTLR start "entryRuleAR"
    // InternalDroneDSL.g:2296:1: entryRuleAR returns [EObject current=null] : iv_ruleAR= ruleAR EOF ;
    public final EObject entryRuleAR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAR = null;


        try {
            // InternalDroneDSL.g:2296:43: (iv_ruleAR= ruleAR EOF )
            // InternalDroneDSL.g:2297:2: iv_ruleAR= ruleAR EOF
            {
             newCompositeNode(grammarAccess.getARRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAR=ruleAR();

            state._fsp--;

             current =iv_ruleAR; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAR"


    // $ANTLR start "ruleAR"
    // InternalDroneDSL.g:2303:1: ruleAR returns [EObject current=null] : (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer ) ;
    public final EObject ruleAR() throws RecognitionException {
        EObject current = null;

        EObject this_Avancer_0 = null;

        EObject this_Reculer_1 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:2309:2: ( (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer ) )
            // InternalDroneDSL.g:2310:2: (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer )
            {
            // InternalDroneDSL.g:2310:2: (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==33) ) {
                alt29=1;
            }
            else if ( (LA29_0==34) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalDroneDSL.g:2311:3: this_Avancer_0= ruleAvancer
                    {

                    			newCompositeNode(grammarAccess.getARAccess().getAvancerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Avancer_0=ruleAvancer();

                    state._fsp--;


                    			current = this_Avancer_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDroneDSL.g:2320:3: this_Reculer_1= ruleReculer
                    {

                    			newCompositeNode(grammarAccess.getARAccess().getReculerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reculer_1=ruleReculer();

                    state._fsp--;


                    			current = this_Reculer_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAR"


    // $ANTLR start "entryRuleParallele"
    // InternalDroneDSL.g:2332:1: entryRuleParallele returns [EObject current=null] : iv_ruleParallele= ruleParallele EOF ;
    public final EObject entryRuleParallele() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallele = null;


        try {
            // InternalDroneDSL.g:2332:50: (iv_ruleParallele= ruleParallele EOF )
            // InternalDroneDSL.g:2333:2: iv_ruleParallele= ruleParallele EOF
            {
             newCompositeNode(grammarAccess.getParalleleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParallele=ruleParallele();

            state._fsp--;

             current =iv_ruleParallele; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParallele"


    // $ANTLR start "ruleParallele"
    // InternalDroneDSL.g:2339:1: ruleParallele returns [EObject current=null] : (this_Parallele2_0= ruleParallele2 | this_Parallele3_1= ruleParallele3 | this_Parallele4_2= ruleParallele4 ) ;
    public final EObject ruleParallele() throws RecognitionException {
        EObject current = null;

        EObject this_Parallele2_0 = null;

        EObject this_Parallele3_1 = null;

        EObject this_Parallele4_2 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:2345:2: ( (this_Parallele2_0= ruleParallele2 | this_Parallele3_1= ruleParallele3 | this_Parallele4_2= ruleParallele4 ) )
            // InternalDroneDSL.g:2346:2: (this_Parallele2_0= ruleParallele2 | this_Parallele3_1= ruleParallele3 | this_Parallele4_2= ruleParallele4 )
            {
            // InternalDroneDSL.g:2346:2: (this_Parallele2_0= ruleParallele2 | this_Parallele3_1= ruleParallele3 | this_Parallele4_2= ruleParallele4 )
            int alt30=3;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // InternalDroneDSL.g:2347:3: this_Parallele2_0= ruleParallele2
                    {

                    			newCompositeNode(grammarAccess.getParalleleAccess().getParallele2ParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parallele2_0=ruleParallele2();

                    state._fsp--;


                    			current = this_Parallele2_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDroneDSL.g:2356:3: this_Parallele3_1= ruleParallele3
                    {

                    			newCompositeNode(grammarAccess.getParalleleAccess().getParallele3ParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parallele3_1=ruleParallele3();

                    state._fsp--;


                    			current = this_Parallele3_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDroneDSL.g:2365:3: this_Parallele4_2= ruleParallele4
                    {

                    			newCompositeNode(grammarAccess.getParalleleAccess().getParallele4ParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parallele4_2=ruleParallele4();

                    state._fsp--;


                    			current = this_Parallele4_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParallele"


    // $ANTLR start "entryRuleParallele2"
    // InternalDroneDSL.g:2377:1: entryRuleParallele2 returns [EObject current=null] : iv_ruleParallele2= ruleParallele2 EOF ;
    public final EObject entryRuleParallele2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallele2 = null;


        try {
            // InternalDroneDSL.g:2377:51: (iv_ruleParallele2= ruleParallele2 EOF )
            // InternalDroneDSL.g:2378:2: iv_ruleParallele2= ruleParallele2 EOF
            {
             newCompositeNode(grammarAccess.getParallele2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParallele2=ruleParallele2();

            state._fsp--;

             current =iv_ruleParallele2; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParallele2"


    // $ANTLR start "ruleParallele2"
    // InternalDroneDSL.g:2384:1: ruleParallele2 returns [EObject current=null] : ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) ) ;
    public final EObject ruleParallele2() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_16=null;
        Token otherlv_19=null;
        Token otherlv_22=null;
        Token otherlv_25=null;
        Token otherlv_28=null;
        Token otherlv_31=null;
        Token otherlv_34=null;
        EObject lv_a_0_0 = null;

        EObject lv_t_2_0 = null;

        EObject lv_a_3_0 = null;

        EObject lv_t_5_0 = null;

        EObject lv_a_6_0 = null;

        EObject lv_t_8_0 = null;

        EObject lv_t_9_0 = null;

        EObject lv_b_11_0 = null;

        EObject lv_t_12_0 = null;

        EObject lv_b_14_0 = null;

        EObject lv_t_15_0 = null;

        EObject lv_b_17_0 = null;

        EObject lv_t_18_0 = null;

        EObject lv_a_20_0 = null;

        EObject lv_t_21_0 = null;

        EObject lv_a_23_0 = null;

        EObject lv_t_24_0 = null;

        EObject lv_a_26_0 = null;

        EObject lv_t_27_0 = null;

        EObject lv_a_29_0 = null;

        EObject lv_t_30_0 = null;

        EObject lv_a_32_0 = null;

        EObject lv_t_33_0 = null;

        EObject lv_a_35_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:2390:2: ( ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) ) )
            // InternalDroneDSL.g:2391:2: ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) )
            {
            // InternalDroneDSL.g:2391:2: ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) )
            int alt31=12;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // InternalDroneDSL.g:2392:3: ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:2392:3: ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:2393:4: ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:2393:4: ( (lv_a_0_0= ruleMD ) )
                    // InternalDroneDSL.g:2394:5: (lv_a_0_0= ruleMD )
                    {
                    // InternalDroneDSL.g:2394:5: (lv_a_0_0= ruleMD )
                    // InternalDroneDSL.g:2395:6: lv_a_0_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getAMDParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_0_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_0_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_1, grammarAccess.getParallele2Access().getAmpersandKeyword_0_1());
                    			
                    // InternalDroneDSL.g:2416:4: ( (lv_t_2_0= ruleGDr ) )
                    // InternalDroneDSL.g:2417:5: (lv_t_2_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:2417:5: (lv_t_2_0= ruleGDr )
                    // InternalDroneDSL.g:2418:6: lv_t_2_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTGDrParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_t_2_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"t",
                    							lv_t_2_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDroneDSL.g:2437:3: ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:2437:3: ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) )
                    // InternalDroneDSL.g:2438:4: ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:2438:4: ( (lv_a_3_0= ruleMD ) )
                    // InternalDroneDSL.g:2439:5: (lv_a_3_0= ruleMD )
                    {
                    // InternalDroneDSL.g:2439:5: (lv_a_3_0= ruleMD )
                    // InternalDroneDSL.g:2440:6: lv_a_3_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getAMDParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_3_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_3_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_4, grammarAccess.getParallele2Access().getAmpersandKeyword_1_1());
                    			
                    // InternalDroneDSL.g:2461:4: ( (lv_t_5_0= ruleAR ) )
                    // InternalDroneDSL.g:2462:5: (lv_t_5_0= ruleAR )
                    {
                    // InternalDroneDSL.g:2462:5: (lv_t_5_0= ruleAR )
                    // InternalDroneDSL.g:2463:6: lv_t_5_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTARParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_t_5_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"t",
                    							lv_t_5_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDroneDSL.g:2482:3: ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:2482:3: ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:2483:4: ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:2483:4: ( (lv_a_6_0= ruleMD ) )
                    // InternalDroneDSL.g:2484:5: (lv_a_6_0= ruleMD )
                    {
                    // InternalDroneDSL.g:2484:5: (lv_a_6_0= ruleMD )
                    // InternalDroneDSL.g:2485:6: lv_a_6_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getAMDParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_6_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_6_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,44,FOLLOW_34); 

                    				newLeafNode(otherlv_7, grammarAccess.getParallele2Access().getAmpersandKeyword_2_1());
                    			
                    // InternalDroneDSL.g:2506:4: ( (lv_t_8_0= ruleRGRD ) )
                    // InternalDroneDSL.g:2507:5: (lv_t_8_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:2507:5: (lv_t_8_0= ruleRGRD )
                    // InternalDroneDSL.g:2508:6: lv_t_8_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTRGRDParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_t_8_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"t",
                    							lv_t_8_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDroneDSL.g:2527:3: ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:2527:3: ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) )
                    // InternalDroneDSL.g:2528:4: ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:2528:4: ( (lv_t_9_0= ruleGDr ) )
                    // InternalDroneDSL.g:2529:5: (lv_t_9_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:2529:5: (lv_t_9_0= ruleGDr )
                    // InternalDroneDSL.g:2530:6: lv_t_9_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTGDrParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_t_9_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"t",
                    							lv_t_9_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_10, grammarAccess.getParallele2Access().getAmpersandKeyword_3_1());
                    			
                    // InternalDroneDSL.g:2551:4: ( (lv_b_11_0= ruleAR ) )
                    // InternalDroneDSL.g:2552:5: (lv_b_11_0= ruleAR )
                    {
                    // InternalDroneDSL.g:2552:5: (lv_b_11_0= ruleAR )
                    // InternalDroneDSL.g:2553:6: lv_b_11_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getBARParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_b_11_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_11_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalDroneDSL.g:2572:3: ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:2572:3: ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) )
                    // InternalDroneDSL.g:2573:4: ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:2573:4: ( (lv_t_12_0= ruleGDr ) )
                    // InternalDroneDSL.g:2574:5: (lv_t_12_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:2574:5: (lv_t_12_0= ruleGDr )
                    // InternalDroneDSL.g:2575:6: lv_t_12_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTGDrParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_t_12_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"t",
                    							lv_t_12_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,44,FOLLOW_35); 

                    				newLeafNode(otherlv_13, grammarAccess.getParallele2Access().getAmpersandKeyword_4_1());
                    			
                    // InternalDroneDSL.g:2596:4: ( (lv_b_14_0= ruleMD ) )
                    // InternalDroneDSL.g:2597:5: (lv_b_14_0= ruleMD )
                    {
                    // InternalDroneDSL.g:2597:5: (lv_b_14_0= ruleMD )
                    // InternalDroneDSL.g:2598:6: lv_b_14_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getBMDParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_b_14_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_14_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalDroneDSL.g:2617:3: ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:2617:3: ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:2618:4: ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:2618:4: ( (lv_t_15_0= ruleGDr ) )
                    // InternalDroneDSL.g:2619:5: (lv_t_15_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:2619:5: (lv_t_15_0= ruleGDr )
                    // InternalDroneDSL.g:2620:6: lv_t_15_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTGDrParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_t_15_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"t",
                    							lv_t_15_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,44,FOLLOW_34); 

                    				newLeafNode(otherlv_16, grammarAccess.getParallele2Access().getAmpersandKeyword_5_1());
                    			
                    // InternalDroneDSL.g:2641:4: ( (lv_b_17_0= ruleRGRD ) )
                    // InternalDroneDSL.g:2642:5: (lv_b_17_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:2642:5: (lv_b_17_0= ruleRGRD )
                    // InternalDroneDSL.g:2643:6: lv_b_17_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getBRGRDParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_b_17_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_17_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalDroneDSL.g:2662:3: ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:2662:3: ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) )
                    // InternalDroneDSL.g:2663:4: ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:2663:4: ( (lv_t_18_0= ruleRGRD ) )
                    // InternalDroneDSL.g:2664:5: (lv_t_18_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:2664:5: (lv_t_18_0= ruleRGRD )
                    // InternalDroneDSL.g:2665:6: lv_t_18_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTRGRDParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_t_18_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"t",
                    							lv_t_18_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_19=(Token)match(input,44,FOLLOW_35); 

                    				newLeafNode(otherlv_19, grammarAccess.getParallele2Access().getAmpersandKeyword_6_1());
                    			
                    // InternalDroneDSL.g:2686:4: ( (lv_a_20_0= ruleMD ) )
                    // InternalDroneDSL.g:2687:5: (lv_a_20_0= ruleMD )
                    {
                    // InternalDroneDSL.g:2687:5: (lv_a_20_0= ruleMD )
                    // InternalDroneDSL.g:2688:6: lv_a_20_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getAMDParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_a_20_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_20_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalDroneDSL.g:2707:3: ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:2707:3: ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) )
                    // InternalDroneDSL.g:2708:4: ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:2708:4: ( (lv_t_21_0= ruleRGRD ) )
                    // InternalDroneDSL.g:2709:5: (lv_t_21_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:2709:5: (lv_t_21_0= ruleRGRD )
                    // InternalDroneDSL.g:2710:6: lv_t_21_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTRGRDParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_t_21_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"t",
                    							lv_t_21_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_22=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_22, grammarAccess.getParallele2Access().getAmpersandKeyword_7_1());
                    			
                    // InternalDroneDSL.g:2731:4: ( (lv_a_23_0= ruleAR ) )
                    // InternalDroneDSL.g:2732:5: (lv_a_23_0= ruleAR )
                    {
                    // InternalDroneDSL.g:2732:5: (lv_a_23_0= ruleAR )
                    // InternalDroneDSL.g:2733:6: lv_a_23_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getAARParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_a_23_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_23_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalDroneDSL.g:2752:3: ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:2752:3: ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:2753:4: ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:2753:4: ( (lv_t_24_0= ruleRGRD ) )
                    // InternalDroneDSL.g:2754:5: (lv_t_24_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:2754:5: (lv_t_24_0= ruleRGRD )
                    // InternalDroneDSL.g:2755:6: lv_t_24_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTRGRDParserRuleCall_8_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_t_24_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"t",
                    							lv_t_24_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_25=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_25, grammarAccess.getParallele2Access().getAmpersandKeyword_8_1());
                    			
                    // InternalDroneDSL.g:2776:4: ( (lv_a_26_0= ruleGDr ) )
                    // InternalDroneDSL.g:2777:5: (lv_a_26_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:2777:5: (lv_a_26_0= ruleGDr )
                    // InternalDroneDSL.g:2778:6: lv_a_26_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getAGDrParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_a_26_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_26_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalDroneDSL.g:2797:3: ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:2797:3: ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) )
                    // InternalDroneDSL.g:2798:4: ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:2798:4: ( (lv_t_27_0= ruleAR ) )
                    // InternalDroneDSL.g:2799:5: (lv_t_27_0= ruleAR )
                    {
                    // InternalDroneDSL.g:2799:5: (lv_t_27_0= ruleAR )
                    // InternalDroneDSL.g:2800:6: lv_t_27_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTARParserRuleCall_9_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_t_27_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"t",
                    							lv_t_27_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_28=(Token)match(input,44,FOLLOW_35); 

                    				newLeafNode(otherlv_28, grammarAccess.getParallele2Access().getAmpersandKeyword_9_1());
                    			
                    // InternalDroneDSL.g:2821:4: ( (lv_a_29_0= ruleMD ) )
                    // InternalDroneDSL.g:2822:5: (lv_a_29_0= ruleMD )
                    {
                    // InternalDroneDSL.g:2822:5: (lv_a_29_0= ruleMD )
                    // InternalDroneDSL.g:2823:6: lv_a_29_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getAMDParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_a_29_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_29_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalDroneDSL.g:2842:3: ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:2842:3: ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:2843:4: ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:2843:4: ( (lv_t_30_0= ruleAR ) )
                    // InternalDroneDSL.g:2844:5: (lv_t_30_0= ruleAR )
                    {
                    // InternalDroneDSL.g:2844:5: (lv_t_30_0= ruleAR )
                    // InternalDroneDSL.g:2845:6: lv_t_30_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTARParserRuleCall_10_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_t_30_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"t",
                    							lv_t_30_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_31=(Token)match(input,44,FOLLOW_34); 

                    				newLeafNode(otherlv_31, grammarAccess.getParallele2Access().getAmpersandKeyword_10_1());
                    			
                    // InternalDroneDSL.g:2866:4: ( (lv_a_32_0= ruleRGRD ) )
                    // InternalDroneDSL.g:2867:5: (lv_a_32_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:2867:5: (lv_a_32_0= ruleRGRD )
                    // InternalDroneDSL.g:2868:6: lv_a_32_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getARGRDParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_a_32_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_32_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 12 :
                    // InternalDroneDSL.g:2887:3: ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:2887:3: ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:2888:4: ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:2888:4: ( (lv_t_33_0= ruleAR ) )
                    // InternalDroneDSL.g:2889:5: (lv_t_33_0= ruleAR )
                    {
                    // InternalDroneDSL.g:2889:5: (lv_t_33_0= ruleAR )
                    // InternalDroneDSL.g:2890:6: lv_t_33_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTARParserRuleCall_11_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_t_33_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"t",
                    							lv_t_33_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_34=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_34, grammarAccess.getParallele2Access().getAmpersandKeyword_11_1());
                    			
                    // InternalDroneDSL.g:2911:4: ( (lv_a_35_0= ruleGDr ) )
                    // InternalDroneDSL.g:2912:5: (lv_a_35_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:2912:5: (lv_a_35_0= ruleGDr )
                    // InternalDroneDSL.g:2913:6: lv_a_35_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getAGDrParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_a_35_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_35_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParallele2"


    // $ANTLR start "entryRuleParallele3"
    // InternalDroneDSL.g:2935:1: entryRuleParallele3 returns [EObject current=null] : iv_ruleParallele3= ruleParallele3 EOF ;
    public final EObject entryRuleParallele3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallele3 = null;


        try {
            // InternalDroneDSL.g:2935:51: (iv_ruleParallele3= ruleParallele3 EOF )
            // InternalDroneDSL.g:2936:2: iv_ruleParallele3= ruleParallele3 EOF
            {
             newCompositeNode(grammarAccess.getParallele3Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParallele3=ruleParallele3();

            state._fsp--;

             current =iv_ruleParallele3; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParallele3"


    // $ANTLR start "ruleParallele3"
    // InternalDroneDSL.g:2942:1: ruleParallele3 returns [EObject current=null] : ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) ) ;
    public final EObject ruleParallele3() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_46=null;
        Token otherlv_48=null;
        Token otherlv_51=null;
        Token otherlv_53=null;
        Token otherlv_56=null;
        Token otherlv_58=null;
        Token otherlv_61=null;
        Token otherlv_63=null;
        Token otherlv_66=null;
        Token otherlv_68=null;
        Token otherlv_71=null;
        Token otherlv_73=null;
        Token otherlv_76=null;
        Token otherlv_78=null;
        Token otherlv_81=null;
        Token otherlv_83=null;
        Token otherlv_86=null;
        Token otherlv_88=null;
        Token otherlv_91=null;
        Token otherlv_93=null;
        Token otherlv_96=null;
        Token otherlv_98=null;
        Token otherlv_101=null;
        Token otherlv_103=null;
        Token otherlv_106=null;
        Token otherlv_108=null;
        Token otherlv_111=null;
        Token otherlv_113=null;
        Token otherlv_116=null;
        Token otherlv_118=null;
        EObject lv_a_0_0 = null;

        EObject lv_b_2_0 = null;

        EObject lv_c_4_0 = null;

        EObject lv_a_5_0 = null;

        EObject lv_b_7_0 = null;

        EObject lv_c_9_0 = null;

        EObject lv_a_10_0 = null;

        EObject lv_b_12_0 = null;

        EObject lv_c_14_0 = null;

        EObject lv_a_15_0 = null;

        EObject lv_b_17_0 = null;

        EObject lv_c_19_0 = null;

        EObject lv_a_20_0 = null;

        EObject lv_b_22_0 = null;

        EObject lv_c_24_0 = null;

        EObject lv_a_25_0 = null;

        EObject lv_b_27_0 = null;

        EObject lv_c_29_0 = null;

        EObject lv_a_30_0 = null;

        EObject lv_b_32_0 = null;

        EObject lv_c_34_0 = null;

        EObject lv_a_35_0 = null;

        EObject lv_b_37_0 = null;

        EObject lv_c_39_0 = null;

        EObject lv_a_40_0 = null;

        EObject lv_b_42_0 = null;

        EObject lv_c_44_0 = null;

        EObject lv_a_45_0 = null;

        EObject lv_b_47_0 = null;

        EObject lv_c_49_0 = null;

        EObject lv_a_50_0 = null;

        EObject lv_b_52_0 = null;

        EObject lv_c_54_0 = null;

        EObject lv_a_55_0 = null;

        EObject lv_b_57_0 = null;

        EObject lv_c_59_0 = null;

        EObject lv_a_60_0 = null;

        EObject lv_b_62_0 = null;

        EObject lv_c_64_0 = null;

        EObject lv_a_65_0 = null;

        EObject lv_b_67_0 = null;

        EObject lv_c_69_0 = null;

        EObject lv_a_70_0 = null;

        EObject lv_b_72_0 = null;

        EObject lv_c_74_0 = null;

        EObject lv_a_75_0 = null;

        EObject lv_b_77_0 = null;

        EObject lv_c_79_0 = null;

        EObject lv_a_80_0 = null;

        EObject lv_b_82_0 = null;

        EObject lv_c_84_0 = null;

        EObject lv_a_85_0 = null;

        EObject lv_b_87_0 = null;

        EObject lv_c_89_0 = null;

        EObject lv_a_90_0 = null;

        EObject lv_b_92_0 = null;

        EObject lv_c_94_0 = null;

        EObject lv_a_95_0 = null;

        EObject lv_b_97_0 = null;

        EObject lv_c_99_0 = null;

        EObject lv_a_100_0 = null;

        EObject lv_b_102_0 = null;

        EObject lv_c_104_0 = null;

        EObject lv_a_105_0 = null;

        EObject lv_b_107_0 = null;

        EObject lv_c_109_0 = null;

        EObject lv_a_110_0 = null;

        EObject lv_b_112_0 = null;

        EObject lv_c_114_0 = null;

        EObject lv_a_115_0 = null;

        EObject lv_b_117_0 = null;

        EObject lv_c_119_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:2948:2: ( ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) ) )
            // InternalDroneDSL.g:2949:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) )
            {
            // InternalDroneDSL.g:2949:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) )
            int alt32=24;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // InternalDroneDSL.g:2950:3: ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:2950:3: ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) )
                    // InternalDroneDSL.g:2951:4: ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:2951:4: ( (lv_a_0_0= ruleAR ) )
                    // InternalDroneDSL.g:2952:5: (lv_a_0_0= ruleAR )
                    {
                    // InternalDroneDSL.g:2952:5: (lv_a_0_0= ruleAR )
                    // InternalDroneDSL.g:2953:6: lv_a_0_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAARParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_0_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_0_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_1, grammarAccess.getParallele3Access().getAmpersandKeyword_0_1());
                    			
                    // InternalDroneDSL.g:2974:4: ( (lv_b_2_0= ruleGDr ) )
                    // InternalDroneDSL.g:2975:5: (lv_b_2_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:2975:5: (lv_b_2_0= ruleGDr )
                    // InternalDroneDSL.g:2976:6: lv_b_2_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBGDrParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_2_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_2_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,44,FOLLOW_35); 

                    				newLeafNode(otherlv_3, grammarAccess.getParallele3Access().getAmpersandKeyword_0_3());
                    			
                    // InternalDroneDSL.g:2997:4: ( (lv_c_4_0= ruleMD ) )
                    // InternalDroneDSL.g:2998:5: (lv_c_4_0= ruleMD )
                    {
                    // InternalDroneDSL.g:2998:5: (lv_c_4_0= ruleMD )
                    // InternalDroneDSL.g:2999:6: lv_c_4_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getCMDParserRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_c_4_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_4_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDroneDSL.g:3018:3: ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:3018:3: ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:3019:4: ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:3019:4: ( (lv_a_5_0= ruleAR ) )
                    // InternalDroneDSL.g:3020:5: (lv_a_5_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3020:5: (lv_a_5_0= ruleAR )
                    // InternalDroneDSL.g:3021:6: lv_a_5_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAARParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_5_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_5_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_6, grammarAccess.getParallele3Access().getAmpersandKeyword_1_1());
                    			
                    // InternalDroneDSL.g:3042:4: ( (lv_b_7_0= ruleGDr ) )
                    // InternalDroneDSL.g:3043:5: (lv_b_7_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3043:5: (lv_b_7_0= ruleGDr )
                    // InternalDroneDSL.g:3044:6: lv_b_7_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBGDrParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_7_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_7_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,44,FOLLOW_34); 

                    				newLeafNode(otherlv_8, grammarAccess.getParallele3Access().getAmpersandKeyword_1_3());
                    			
                    // InternalDroneDSL.g:3065:4: ( (lv_c_9_0= ruleRGRD ) )
                    // InternalDroneDSL.g:3066:5: (lv_c_9_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:3066:5: (lv_c_9_0= ruleRGRD )
                    // InternalDroneDSL.g:3067:6: lv_c_9_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getCRGRDParserRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_c_9_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_9_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDroneDSL.g:3086:3: ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:3086:3: ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:3087:4: ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:3087:4: ( (lv_a_10_0= ruleAR ) )
                    // InternalDroneDSL.g:3088:5: (lv_a_10_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3088:5: (lv_a_10_0= ruleAR )
                    // InternalDroneDSL.g:3089:6: lv_a_10_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAARParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_10_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_10_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,44,FOLLOW_35); 

                    				newLeafNode(otherlv_11, grammarAccess.getParallele3Access().getAmpersandKeyword_2_1());
                    			
                    // InternalDroneDSL.g:3110:4: ( (lv_b_12_0= ruleMD ) )
                    // InternalDroneDSL.g:3111:5: (lv_b_12_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3111:5: (lv_b_12_0= ruleMD )
                    // InternalDroneDSL.g:3112:6: lv_b_12_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBMDParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_12_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_12_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_13, grammarAccess.getParallele3Access().getAmpersandKeyword_2_3());
                    			
                    // InternalDroneDSL.g:3133:4: ( (lv_c_14_0= ruleGDr ) )
                    // InternalDroneDSL.g:3134:5: (lv_c_14_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3134:5: (lv_c_14_0= ruleGDr )
                    // InternalDroneDSL.g:3135:6: lv_c_14_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getCGDrParserRuleCall_2_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_c_14_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_14_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDroneDSL.g:3154:3: ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:3154:3: ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:3155:4: ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:3155:4: ( (lv_a_15_0= ruleAR ) )
                    // InternalDroneDSL.g:3156:5: (lv_a_15_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3156:5: (lv_a_15_0= ruleAR )
                    // InternalDroneDSL.g:3157:6: lv_a_15_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAARParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_15_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_15_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,44,FOLLOW_35); 

                    				newLeafNode(otherlv_16, grammarAccess.getParallele3Access().getAmpersandKeyword_3_1());
                    			
                    // InternalDroneDSL.g:3178:4: ( (lv_b_17_0= ruleMD ) )
                    // InternalDroneDSL.g:3179:5: (lv_b_17_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3179:5: (lv_b_17_0= ruleMD )
                    // InternalDroneDSL.g:3180:6: lv_b_17_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBMDParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_17_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_17_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_18=(Token)match(input,44,FOLLOW_34); 

                    				newLeafNode(otherlv_18, grammarAccess.getParallele3Access().getAmpersandKeyword_3_3());
                    			
                    // InternalDroneDSL.g:3201:4: ( (lv_c_19_0= ruleRGRD ) )
                    // InternalDroneDSL.g:3202:5: (lv_c_19_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:3202:5: (lv_c_19_0= ruleRGRD )
                    // InternalDroneDSL.g:3203:6: lv_c_19_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getCRGRDParserRuleCall_3_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_c_19_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_19_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalDroneDSL.g:3222:3: ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:3222:3: ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) )
                    // InternalDroneDSL.g:3223:4: ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:3223:4: ( (lv_a_20_0= ruleAR ) )
                    // InternalDroneDSL.g:3224:5: (lv_a_20_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3224:5: (lv_a_20_0= ruleAR )
                    // InternalDroneDSL.g:3225:6: lv_a_20_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAARParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_20_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_20_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_21=(Token)match(input,44,FOLLOW_34); 

                    				newLeafNode(otherlv_21, grammarAccess.getParallele3Access().getAmpersandKeyword_4_1());
                    			
                    // InternalDroneDSL.g:3246:4: ( (lv_b_22_0= ruleRGRD ) )
                    // InternalDroneDSL.g:3247:5: (lv_b_22_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:3247:5: (lv_b_22_0= ruleRGRD )
                    // InternalDroneDSL.g:3248:6: lv_b_22_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_22_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_22_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_23=(Token)match(input,44,FOLLOW_35); 

                    				newLeafNode(otherlv_23, grammarAccess.getParallele3Access().getAmpersandKeyword_4_3());
                    			
                    // InternalDroneDSL.g:3269:4: ( (lv_c_24_0= ruleMD ) )
                    // InternalDroneDSL.g:3270:5: (lv_c_24_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3270:5: (lv_c_24_0= ruleMD )
                    // InternalDroneDSL.g:3271:6: lv_c_24_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getCMDParserRuleCall_4_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_c_24_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_24_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalDroneDSL.g:3290:3: ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:3290:3: ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:3291:4: ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:3291:4: ( (lv_a_25_0= ruleAR ) )
                    // InternalDroneDSL.g:3292:5: (lv_a_25_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3292:5: (lv_a_25_0= ruleAR )
                    // InternalDroneDSL.g:3293:6: lv_a_25_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAARParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_25_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_25_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_26=(Token)match(input,44,FOLLOW_34); 

                    				newLeafNode(otherlv_26, grammarAccess.getParallele3Access().getAmpersandKeyword_5_1());
                    			
                    // InternalDroneDSL.g:3314:4: ( (lv_b_27_0= ruleRGRD ) )
                    // InternalDroneDSL.g:3315:5: (lv_b_27_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:3315:5: (lv_b_27_0= ruleRGRD )
                    // InternalDroneDSL.g:3316:6: lv_b_27_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_27_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_27_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_28=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_28, grammarAccess.getParallele3Access().getAmpersandKeyword_5_3());
                    			
                    // InternalDroneDSL.g:3337:4: ( (lv_c_29_0= ruleGDr ) )
                    // InternalDroneDSL.g:3338:5: (lv_c_29_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3338:5: (lv_c_29_0= ruleGDr )
                    // InternalDroneDSL.g:3339:6: lv_c_29_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getCGDrParserRuleCall_5_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_c_29_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_29_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalDroneDSL.g:3358:3: ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:3358:3: ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) )
                    // InternalDroneDSL.g:3359:4: ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:3359:4: ( (lv_a_30_0= ruleGDr ) )
                    // InternalDroneDSL.g:3360:5: (lv_a_30_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3360:5: (lv_a_30_0= ruleGDr )
                    // InternalDroneDSL.g:3361:6: lv_a_30_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAGDrParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_30_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_30_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_31=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_31, grammarAccess.getParallele3Access().getAmpersandKeyword_6_1());
                    			
                    // InternalDroneDSL.g:3382:4: ( (lv_b_32_0= ruleAR ) )
                    // InternalDroneDSL.g:3383:5: (lv_b_32_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3383:5: (lv_b_32_0= ruleAR )
                    // InternalDroneDSL.g:3384:6: lv_b_32_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBARParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_32_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_32_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_33=(Token)match(input,44,FOLLOW_35); 

                    				newLeafNode(otherlv_33, grammarAccess.getParallele3Access().getAmpersandKeyword_6_3());
                    			
                    // InternalDroneDSL.g:3405:4: ( (lv_c_34_0= ruleMD ) )
                    // InternalDroneDSL.g:3406:5: (lv_c_34_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3406:5: (lv_c_34_0= ruleMD )
                    // InternalDroneDSL.g:3407:6: lv_c_34_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getCMDParserRuleCall_6_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_c_34_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_34_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalDroneDSL.g:3426:3: ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:3426:3: ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:3427:4: ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:3427:4: ( (lv_a_35_0= ruleGDr ) )
                    // InternalDroneDSL.g:3428:5: (lv_a_35_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3428:5: (lv_a_35_0= ruleGDr )
                    // InternalDroneDSL.g:3429:6: lv_a_35_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAGDrParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_35_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_35_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_36=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_36, grammarAccess.getParallele3Access().getAmpersandKeyword_7_1());
                    			
                    // InternalDroneDSL.g:3450:4: ( (lv_b_37_0= ruleAR ) )
                    // InternalDroneDSL.g:3451:5: (lv_b_37_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3451:5: (lv_b_37_0= ruleAR )
                    // InternalDroneDSL.g:3452:6: lv_b_37_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBARParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_37_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_37_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_38=(Token)match(input,44,FOLLOW_34); 

                    				newLeafNode(otherlv_38, grammarAccess.getParallele3Access().getAmpersandKeyword_7_3());
                    			
                    // InternalDroneDSL.g:3473:4: ( (lv_c_39_0= ruleRGRD ) )
                    // InternalDroneDSL.g:3474:5: (lv_c_39_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:3474:5: (lv_c_39_0= ruleRGRD )
                    // InternalDroneDSL.g:3475:6: lv_c_39_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getCRGRDParserRuleCall_7_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_c_39_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_39_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalDroneDSL.g:3494:3: ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:3494:3: ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) )
                    // InternalDroneDSL.g:3495:4: ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:3495:4: ( (lv_a_40_0= ruleGDr ) )
                    // InternalDroneDSL.g:3496:5: (lv_a_40_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3496:5: (lv_a_40_0= ruleGDr )
                    // InternalDroneDSL.g:3497:6: lv_a_40_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAGDrParserRuleCall_8_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_40_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_40_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_41=(Token)match(input,44,FOLLOW_35); 

                    				newLeafNode(otherlv_41, grammarAccess.getParallele3Access().getAmpersandKeyword_8_1());
                    			
                    // InternalDroneDSL.g:3518:4: ( (lv_b_42_0= ruleMD ) )
                    // InternalDroneDSL.g:3519:5: (lv_b_42_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3519:5: (lv_b_42_0= ruleMD )
                    // InternalDroneDSL.g:3520:6: lv_b_42_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBMDParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_42_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_42_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_43=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_43, grammarAccess.getParallele3Access().getAmpersandKeyword_8_3());
                    			
                    // InternalDroneDSL.g:3541:4: ( (lv_c_44_0= ruleAR ) )
                    // InternalDroneDSL.g:3542:5: (lv_c_44_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3542:5: (lv_c_44_0= ruleAR )
                    // InternalDroneDSL.g:3543:6: lv_c_44_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getCARParserRuleCall_8_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_c_44_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_44_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalDroneDSL.g:3562:3: ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:3562:3: ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:3563:4: ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:3563:4: ( (lv_a_45_0= ruleGDr ) )
                    // InternalDroneDSL.g:3564:5: (lv_a_45_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3564:5: (lv_a_45_0= ruleGDr )
                    // InternalDroneDSL.g:3565:6: lv_a_45_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAGDrParserRuleCall_9_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_45_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_45_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_46=(Token)match(input,44,FOLLOW_35); 

                    				newLeafNode(otherlv_46, grammarAccess.getParallele3Access().getAmpersandKeyword_9_1());
                    			
                    // InternalDroneDSL.g:3586:4: ( (lv_b_47_0= ruleMD ) )
                    // InternalDroneDSL.g:3587:5: (lv_b_47_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3587:5: (lv_b_47_0= ruleMD )
                    // InternalDroneDSL.g:3588:6: lv_b_47_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBMDParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_47_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_47_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_48=(Token)match(input,44,FOLLOW_34); 

                    				newLeafNode(otherlv_48, grammarAccess.getParallele3Access().getAmpersandKeyword_9_3());
                    			
                    // InternalDroneDSL.g:3609:4: ( (lv_c_49_0= ruleRGRD ) )
                    // InternalDroneDSL.g:3610:5: (lv_c_49_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:3610:5: (lv_c_49_0= ruleRGRD )
                    // InternalDroneDSL.g:3611:6: lv_c_49_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getCRGRDParserRuleCall_9_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_c_49_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_49_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalDroneDSL.g:3630:3: ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:3630:3: ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) )
                    // InternalDroneDSL.g:3631:4: ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:3631:4: ( (lv_a_50_0= ruleGDr ) )
                    // InternalDroneDSL.g:3632:5: (lv_a_50_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3632:5: (lv_a_50_0= ruleGDr )
                    // InternalDroneDSL.g:3633:6: lv_a_50_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAGDrParserRuleCall_10_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_50_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_50_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_51=(Token)match(input,44,FOLLOW_34); 

                    				newLeafNode(otherlv_51, grammarAccess.getParallele3Access().getAmpersandKeyword_10_1());
                    			
                    // InternalDroneDSL.g:3654:4: ( (lv_b_52_0= ruleRGRD ) )
                    // InternalDroneDSL.g:3655:5: (lv_b_52_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:3655:5: (lv_b_52_0= ruleRGRD )
                    // InternalDroneDSL.g:3656:6: lv_b_52_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_52_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_52_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_53=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_53, grammarAccess.getParallele3Access().getAmpersandKeyword_10_3());
                    			
                    // InternalDroneDSL.g:3677:4: ( (lv_c_54_0= ruleAR ) )
                    // InternalDroneDSL.g:3678:5: (lv_c_54_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3678:5: (lv_c_54_0= ruleAR )
                    // InternalDroneDSL.g:3679:6: lv_c_54_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getCARParserRuleCall_10_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_c_54_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_54_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 12 :
                    // InternalDroneDSL.g:3698:3: ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:3698:3: ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) )
                    // InternalDroneDSL.g:3699:4: ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:3699:4: ( (lv_a_55_0= ruleGDr ) )
                    // InternalDroneDSL.g:3700:5: (lv_a_55_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3700:5: (lv_a_55_0= ruleGDr )
                    // InternalDroneDSL.g:3701:6: lv_a_55_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAGDrParserRuleCall_11_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_55_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_55_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_56=(Token)match(input,44,FOLLOW_34); 

                    				newLeafNode(otherlv_56, grammarAccess.getParallele3Access().getAmpersandKeyword_11_1());
                    			
                    // InternalDroneDSL.g:3722:4: ( (lv_b_57_0= ruleRGRD ) )
                    // InternalDroneDSL.g:3723:5: (lv_b_57_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:3723:5: (lv_b_57_0= ruleRGRD )
                    // InternalDroneDSL.g:3724:6: lv_b_57_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_57_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_57_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_58=(Token)match(input,44,FOLLOW_35); 

                    				newLeafNode(otherlv_58, grammarAccess.getParallele3Access().getAmpersandKeyword_11_3());
                    			
                    // InternalDroneDSL.g:3745:4: ( (lv_c_59_0= ruleMD ) )
                    // InternalDroneDSL.g:3746:5: (lv_c_59_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3746:5: (lv_c_59_0= ruleMD )
                    // InternalDroneDSL.g:3747:6: lv_c_59_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getCMDParserRuleCall_11_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_c_59_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_59_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 13 :
                    // InternalDroneDSL.g:3766:3: ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:3766:3: ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:3767:4: ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:3767:4: ( (lv_a_60_0= ruleMD ) )
                    // InternalDroneDSL.g:3768:5: (lv_a_60_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3768:5: (lv_a_60_0= ruleMD )
                    // InternalDroneDSL.g:3769:6: lv_a_60_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAMDParserRuleCall_12_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_60_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_60_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_61=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_61, grammarAccess.getParallele3Access().getAmpersandKeyword_12_1());
                    			
                    // InternalDroneDSL.g:3790:4: ( (lv_b_62_0= ruleAR ) )
                    // InternalDroneDSL.g:3791:5: (lv_b_62_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3791:5: (lv_b_62_0= ruleAR )
                    // InternalDroneDSL.g:3792:6: lv_b_62_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBARParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_62_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_62_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_63=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_63, grammarAccess.getParallele3Access().getAmpersandKeyword_12_3());
                    			
                    // InternalDroneDSL.g:3813:4: ( (lv_c_64_0= ruleGDr ) )
                    // InternalDroneDSL.g:3814:5: (lv_c_64_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3814:5: (lv_c_64_0= ruleGDr )
                    // InternalDroneDSL.g:3815:6: lv_c_64_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getCGDrParserRuleCall_12_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_c_64_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_64_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 14 :
                    // InternalDroneDSL.g:3834:3: ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:3834:3: ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:3835:4: ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:3835:4: ( (lv_a_65_0= ruleMD ) )
                    // InternalDroneDSL.g:3836:5: (lv_a_65_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3836:5: (lv_a_65_0= ruleMD )
                    // InternalDroneDSL.g:3837:6: lv_a_65_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAMDParserRuleCall_13_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_65_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_65_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_66=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_66, grammarAccess.getParallele3Access().getAmpersandKeyword_13_1());
                    			
                    // InternalDroneDSL.g:3858:4: ( (lv_b_67_0= ruleAR ) )
                    // InternalDroneDSL.g:3859:5: (lv_b_67_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3859:5: (lv_b_67_0= ruleAR )
                    // InternalDroneDSL.g:3860:6: lv_b_67_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBARParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_67_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_67_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_68=(Token)match(input,44,FOLLOW_34); 

                    				newLeafNode(otherlv_68, grammarAccess.getParallele3Access().getAmpersandKeyword_13_3());
                    			
                    // InternalDroneDSL.g:3881:4: ( (lv_c_69_0= ruleRGRD ) )
                    // InternalDroneDSL.g:3882:5: (lv_c_69_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:3882:5: (lv_c_69_0= ruleRGRD )
                    // InternalDroneDSL.g:3883:6: lv_c_69_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getCRGRDParserRuleCall_13_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_c_69_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_69_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 15 :
                    // InternalDroneDSL.g:3902:3: ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:3902:3: ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) )
                    // InternalDroneDSL.g:3903:4: ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:3903:4: ( (lv_a_70_0= ruleMD ) )
                    // InternalDroneDSL.g:3904:5: (lv_a_70_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3904:5: (lv_a_70_0= ruleMD )
                    // InternalDroneDSL.g:3905:6: lv_a_70_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAMDParserRuleCall_14_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_70_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_70_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_71=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_71, grammarAccess.getParallele3Access().getAmpersandKeyword_14_1());
                    			
                    // InternalDroneDSL.g:3926:4: ( (lv_b_72_0= ruleGDr ) )
                    // InternalDroneDSL.g:3927:5: (lv_b_72_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3927:5: (lv_b_72_0= ruleGDr )
                    // InternalDroneDSL.g:3928:6: lv_b_72_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBGDrParserRuleCall_14_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_72_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_72_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_73=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_73, grammarAccess.getParallele3Access().getAmpersandKeyword_14_3());
                    			
                    // InternalDroneDSL.g:3949:4: ( (lv_c_74_0= ruleAR ) )
                    // InternalDroneDSL.g:3950:5: (lv_c_74_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3950:5: (lv_c_74_0= ruleAR )
                    // InternalDroneDSL.g:3951:6: lv_c_74_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getCARParserRuleCall_14_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_c_74_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_74_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 16 :
                    // InternalDroneDSL.g:3970:3: ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:3970:3: ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:3971:4: ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:3971:4: ( (lv_a_75_0= ruleMD ) )
                    // InternalDroneDSL.g:3972:5: (lv_a_75_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3972:5: (lv_a_75_0= ruleMD )
                    // InternalDroneDSL.g:3973:6: lv_a_75_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAMDParserRuleCall_15_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_75_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_75_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_76=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_76, grammarAccess.getParallele3Access().getAmpersandKeyword_15_1());
                    			
                    // InternalDroneDSL.g:3994:4: ( (lv_b_77_0= ruleGDr ) )
                    // InternalDroneDSL.g:3995:5: (lv_b_77_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3995:5: (lv_b_77_0= ruleGDr )
                    // InternalDroneDSL.g:3996:6: lv_b_77_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBGDrParserRuleCall_15_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_77_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_77_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_78=(Token)match(input,44,FOLLOW_34); 

                    				newLeafNode(otherlv_78, grammarAccess.getParallele3Access().getAmpersandKeyword_15_3());
                    			
                    // InternalDroneDSL.g:4017:4: ( (lv_c_79_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4018:5: (lv_c_79_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4018:5: (lv_c_79_0= ruleRGRD )
                    // InternalDroneDSL.g:4019:6: lv_c_79_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getCRGRDParserRuleCall_15_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_c_79_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_79_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 17 :
                    // InternalDroneDSL.g:4038:3: ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:4038:3: ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:4039:4: ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:4039:4: ( (lv_a_80_0= ruleMD ) )
                    // InternalDroneDSL.g:4040:5: (lv_a_80_0= ruleMD )
                    {
                    // InternalDroneDSL.g:4040:5: (lv_a_80_0= ruleMD )
                    // InternalDroneDSL.g:4041:6: lv_a_80_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAMDParserRuleCall_16_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_80_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_80_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_81=(Token)match(input,44,FOLLOW_34); 

                    				newLeafNode(otherlv_81, grammarAccess.getParallele3Access().getAmpersandKeyword_16_1());
                    			
                    // InternalDroneDSL.g:4062:4: ( (lv_b_82_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4063:5: (lv_b_82_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4063:5: (lv_b_82_0= ruleRGRD )
                    // InternalDroneDSL.g:4064:6: lv_b_82_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_16_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_82_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_82_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_83=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_83, grammarAccess.getParallele3Access().getAmpersandKeyword_16_3());
                    			
                    // InternalDroneDSL.g:4085:4: ( (lv_c_84_0= ruleGDr ) )
                    // InternalDroneDSL.g:4086:5: (lv_c_84_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:4086:5: (lv_c_84_0= ruleGDr )
                    // InternalDroneDSL.g:4087:6: lv_c_84_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getCGDrParserRuleCall_16_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_c_84_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_84_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 18 :
                    // InternalDroneDSL.g:4106:3: ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:4106:3: ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) )
                    // InternalDroneDSL.g:4107:4: ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:4107:4: ( (lv_a_85_0= ruleMD ) )
                    // InternalDroneDSL.g:4108:5: (lv_a_85_0= ruleMD )
                    {
                    // InternalDroneDSL.g:4108:5: (lv_a_85_0= ruleMD )
                    // InternalDroneDSL.g:4109:6: lv_a_85_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAMDParserRuleCall_17_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_85_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_85_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_86=(Token)match(input,44,FOLLOW_34); 

                    				newLeafNode(otherlv_86, grammarAccess.getParallele3Access().getAmpersandKeyword_17_1());
                    			
                    // InternalDroneDSL.g:4130:4: ( (lv_b_87_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4131:5: (lv_b_87_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4131:5: (lv_b_87_0= ruleRGRD )
                    // InternalDroneDSL.g:4132:6: lv_b_87_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_17_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_87_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_87_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_88=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_88, grammarAccess.getParallele3Access().getAmpersandKeyword_17_3());
                    			
                    // InternalDroneDSL.g:4153:4: ( (lv_c_89_0= ruleAR ) )
                    // InternalDroneDSL.g:4154:5: (lv_c_89_0= ruleAR )
                    {
                    // InternalDroneDSL.g:4154:5: (lv_c_89_0= ruleAR )
                    // InternalDroneDSL.g:4155:6: lv_c_89_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getCARParserRuleCall_17_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_c_89_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_89_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 19 :
                    // InternalDroneDSL.g:4174:3: ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:4174:3: ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) )
                    // InternalDroneDSL.g:4175:4: ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:4175:4: ( (lv_a_90_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4176:5: (lv_a_90_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4176:5: (lv_a_90_0= ruleRGRD )
                    // InternalDroneDSL.g:4177:6: lv_a_90_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getARGRDParserRuleCall_18_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_90_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_90_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_91=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_91, grammarAccess.getParallele3Access().getAmpersandKeyword_18_1());
                    			
                    // InternalDroneDSL.g:4198:4: ( (lv_b_92_0= ruleAR ) )
                    // InternalDroneDSL.g:4199:5: (lv_b_92_0= ruleAR )
                    {
                    // InternalDroneDSL.g:4199:5: (lv_b_92_0= ruleAR )
                    // InternalDroneDSL.g:4200:6: lv_b_92_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBARParserRuleCall_18_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_92_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_92_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_93=(Token)match(input,44,FOLLOW_35); 

                    				newLeafNode(otherlv_93, grammarAccess.getParallele3Access().getAmpersandKeyword_18_3());
                    			
                    // InternalDroneDSL.g:4221:4: ( (lv_c_94_0= ruleMD ) )
                    // InternalDroneDSL.g:4222:5: (lv_c_94_0= ruleMD )
                    {
                    // InternalDroneDSL.g:4222:5: (lv_c_94_0= ruleMD )
                    // InternalDroneDSL.g:4223:6: lv_c_94_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getCMDParserRuleCall_18_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_c_94_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_94_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 20 :
                    // InternalDroneDSL.g:4242:3: ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:4242:3: ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:4243:4: ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:4243:4: ( (lv_a_95_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4244:5: (lv_a_95_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4244:5: (lv_a_95_0= ruleRGRD )
                    // InternalDroneDSL.g:4245:6: lv_a_95_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getARGRDParserRuleCall_19_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_95_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_95_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_96=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_96, grammarAccess.getParallele3Access().getAmpersandKeyword_19_1());
                    			
                    // InternalDroneDSL.g:4266:4: ( (lv_b_97_0= ruleAR ) )
                    // InternalDroneDSL.g:4267:5: (lv_b_97_0= ruleAR )
                    {
                    // InternalDroneDSL.g:4267:5: (lv_b_97_0= ruleAR )
                    // InternalDroneDSL.g:4268:6: lv_b_97_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBARParserRuleCall_19_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_97_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_97_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_98=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_98, grammarAccess.getParallele3Access().getAmpersandKeyword_19_3());
                    			
                    // InternalDroneDSL.g:4289:4: ( (lv_c_99_0= ruleGDr ) )
                    // InternalDroneDSL.g:4290:5: (lv_c_99_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:4290:5: (lv_c_99_0= ruleGDr )
                    // InternalDroneDSL.g:4291:6: lv_c_99_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getCGDrParserRuleCall_19_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_c_99_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_99_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 21 :
                    // InternalDroneDSL.g:4310:3: ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:4310:3: ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) )
                    // InternalDroneDSL.g:4311:4: ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:4311:4: ( (lv_a_100_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4312:5: (lv_a_100_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4312:5: (lv_a_100_0= ruleRGRD )
                    // InternalDroneDSL.g:4313:6: lv_a_100_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getARGRDParserRuleCall_20_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_100_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_100_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_101=(Token)match(input,44,FOLLOW_35); 

                    				newLeafNode(otherlv_101, grammarAccess.getParallele3Access().getAmpersandKeyword_20_1());
                    			
                    // InternalDroneDSL.g:4334:4: ( (lv_b_102_0= ruleMD ) )
                    // InternalDroneDSL.g:4335:5: (lv_b_102_0= ruleMD )
                    {
                    // InternalDroneDSL.g:4335:5: (lv_b_102_0= ruleMD )
                    // InternalDroneDSL.g:4336:6: lv_b_102_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBMDParserRuleCall_20_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_102_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_102_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_103=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_103, grammarAccess.getParallele3Access().getAmpersandKeyword_20_3());
                    			
                    // InternalDroneDSL.g:4357:4: ( (lv_c_104_0= ruleAR ) )
                    // InternalDroneDSL.g:4358:5: (lv_c_104_0= ruleAR )
                    {
                    // InternalDroneDSL.g:4358:5: (lv_c_104_0= ruleAR )
                    // InternalDroneDSL.g:4359:6: lv_c_104_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getCARParserRuleCall_20_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_c_104_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_104_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 22 :
                    // InternalDroneDSL.g:4378:3: ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:4378:3: ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:4379:4: ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:4379:4: ( (lv_a_105_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4380:5: (lv_a_105_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4380:5: (lv_a_105_0= ruleRGRD )
                    // InternalDroneDSL.g:4381:6: lv_a_105_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getARGRDParserRuleCall_21_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_105_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_105_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_106=(Token)match(input,44,FOLLOW_35); 

                    				newLeafNode(otherlv_106, grammarAccess.getParallele3Access().getAmpersandKeyword_21_1());
                    			
                    // InternalDroneDSL.g:4402:4: ( (lv_b_107_0= ruleMD ) )
                    // InternalDroneDSL.g:4403:5: (lv_b_107_0= ruleMD )
                    {
                    // InternalDroneDSL.g:4403:5: (lv_b_107_0= ruleMD )
                    // InternalDroneDSL.g:4404:6: lv_b_107_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBMDParserRuleCall_21_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_107_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_107_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_108=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_108, grammarAccess.getParallele3Access().getAmpersandKeyword_21_3());
                    			
                    // InternalDroneDSL.g:4425:4: ( (lv_c_109_0= ruleGDr ) )
                    // InternalDroneDSL.g:4426:5: (lv_c_109_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:4426:5: (lv_c_109_0= ruleGDr )
                    // InternalDroneDSL.g:4427:6: lv_c_109_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getCGDrParserRuleCall_21_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_c_109_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_109_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 23 :
                    // InternalDroneDSL.g:4446:3: ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:4446:3: ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) )
                    // InternalDroneDSL.g:4447:4: ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:4447:4: ( (lv_a_110_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4448:5: (lv_a_110_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4448:5: (lv_a_110_0= ruleRGRD )
                    // InternalDroneDSL.g:4449:6: lv_a_110_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getARGRDParserRuleCall_22_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_110_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_110_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_111=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_111, grammarAccess.getParallele3Access().getAmpersandKeyword_22_1());
                    			
                    // InternalDroneDSL.g:4470:4: ( (lv_b_112_0= ruleGDr ) )
                    // InternalDroneDSL.g:4471:5: (lv_b_112_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:4471:5: (lv_b_112_0= ruleGDr )
                    // InternalDroneDSL.g:4472:6: lv_b_112_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBGDrParserRuleCall_22_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_112_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_112_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_113=(Token)match(input,44,FOLLOW_35); 

                    				newLeafNode(otherlv_113, grammarAccess.getParallele3Access().getAmpersandKeyword_22_3());
                    			
                    // InternalDroneDSL.g:4493:4: ( (lv_c_114_0= ruleMD ) )
                    // InternalDroneDSL.g:4494:5: (lv_c_114_0= ruleMD )
                    {
                    // InternalDroneDSL.g:4494:5: (lv_c_114_0= ruleMD )
                    // InternalDroneDSL.g:4495:6: lv_c_114_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getCMDParserRuleCall_22_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_c_114_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_114_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 24 :
                    // InternalDroneDSL.g:4514:3: ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:4514:3: ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) )
                    // InternalDroneDSL.g:4515:4: ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:4515:4: ( (lv_a_115_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4516:5: (lv_a_115_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4516:5: (lv_a_115_0= ruleRGRD )
                    // InternalDroneDSL.g:4517:6: lv_a_115_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getARGRDParserRuleCall_23_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_115_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_115_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_116=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_116, grammarAccess.getParallele3Access().getAmpersandKeyword_23_1());
                    			
                    // InternalDroneDSL.g:4538:4: ( (lv_b_117_0= ruleGDr ) )
                    // InternalDroneDSL.g:4539:5: (lv_b_117_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:4539:5: (lv_b_117_0= ruleGDr )
                    // InternalDroneDSL.g:4540:6: lv_b_117_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBGDrParserRuleCall_23_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_117_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_117_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_118=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_118, grammarAccess.getParallele3Access().getAmpersandKeyword_23_3());
                    			
                    // InternalDroneDSL.g:4561:4: ( (lv_c_119_0= ruleAR ) )
                    // InternalDroneDSL.g:4562:5: (lv_c_119_0= ruleAR )
                    {
                    // InternalDroneDSL.g:4562:5: (lv_c_119_0= ruleAR )
                    // InternalDroneDSL.g:4563:6: lv_c_119_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getCARParserRuleCall_23_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_c_119_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_119_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParallele3"


    // $ANTLR start "entryRuleParallele4"
    // InternalDroneDSL.g:4585:1: entryRuleParallele4 returns [EObject current=null] : iv_ruleParallele4= ruleParallele4 EOF ;
    public final EObject entryRuleParallele4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallele4 = null;


        try {
            // InternalDroneDSL.g:4585:51: (iv_ruleParallele4= ruleParallele4 EOF )
            // InternalDroneDSL.g:4586:2: iv_ruleParallele4= ruleParallele4 EOF
            {
             newCompositeNode(grammarAccess.getParallele4Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParallele4=ruleParallele4();

            state._fsp--;

             current =iv_ruleParallele4; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParallele4"


    // $ANTLR start "ruleParallele4"
    // InternalDroneDSL.g:4592:1: ruleParallele4 returns [EObject current=null] : ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) ) | ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) ) | ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) ) | ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) ) | ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) ) | ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) ) | ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) ) | ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) ) | ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) ) | ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) ) | ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) ) | ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) ) | ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) ) | ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) ) | ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) ) | ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) ) | ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) ) | ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) ) | ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) ) | ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) ) | ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) ) | ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) ) | ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) ) | ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) ) ) ;
    public final EObject ruleParallele4() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_47=null;
        Token otherlv_50=null;
        Token otherlv_52=null;
        Token otherlv_54=null;
        Token otherlv_57=null;
        Token otherlv_59=null;
        Token otherlv_61=null;
        Token otherlv_64=null;
        Token otherlv_66=null;
        Token otherlv_68=null;
        Token otherlv_71=null;
        Token otherlv_73=null;
        Token otherlv_75=null;
        Token otherlv_78=null;
        Token otherlv_80=null;
        Token otherlv_82=null;
        Token otherlv_85=null;
        Token otherlv_87=null;
        Token otherlv_89=null;
        Token otherlv_92=null;
        Token otherlv_94=null;
        Token otherlv_96=null;
        Token otherlv_99=null;
        Token otherlv_101=null;
        Token otherlv_103=null;
        Token otherlv_106=null;
        Token otherlv_108=null;
        Token otherlv_110=null;
        Token otherlv_113=null;
        Token otherlv_115=null;
        Token otherlv_117=null;
        Token otherlv_120=null;
        Token otherlv_122=null;
        Token otherlv_124=null;
        Token otherlv_127=null;
        Token otherlv_129=null;
        Token otherlv_131=null;
        Token otherlv_134=null;
        Token otherlv_136=null;
        Token otherlv_138=null;
        Token otherlv_141=null;
        Token otherlv_143=null;
        Token otherlv_145=null;
        Token otherlv_148=null;
        Token otherlv_150=null;
        Token otherlv_152=null;
        Token otherlv_155=null;
        Token otherlv_157=null;
        Token otherlv_159=null;
        Token otherlv_162=null;
        Token otherlv_164=null;
        Token otherlv_166=null;
        EObject lv_a_0_0 = null;

        EObject lv_b_2_0 = null;

        EObject lv_c_4_0 = null;

        EObject lv_d_6_0 = null;

        EObject lv_a_7_0 = null;

        EObject lv_b_9_0 = null;

        EObject lv_c_11_0 = null;

        EObject lv_d_13_0 = null;

        EObject lv_a_14_0 = null;

        EObject lv_b_16_0 = null;

        EObject lv_c_18_0 = null;

        EObject lv_d_20_0 = null;

        EObject lv_a_21_0 = null;

        EObject lv_b_23_0 = null;

        EObject lv_c_25_0 = null;

        EObject lv_d_27_0 = null;

        EObject lv_a_28_0 = null;

        EObject lv_b_30_0 = null;

        EObject lv_c_32_0 = null;

        EObject lv_d_34_0 = null;

        EObject lv_a_35_0 = null;

        EObject lv_b_37_0 = null;

        EObject lv_c_39_0 = null;

        EObject lv_d_41_0 = null;

        EObject lv_a_42_0 = null;

        EObject lv_b_44_0 = null;

        EObject lv_c_46_0 = null;

        EObject lv_d_48_0 = null;

        EObject lv_a_49_0 = null;

        EObject lv_b_51_0 = null;

        EObject lv_c_53_0 = null;

        EObject lv_d_55_0 = null;

        EObject lv_a_56_0 = null;

        EObject lv_b_58_0 = null;

        EObject lv_c_60_0 = null;

        EObject lv_d_62_0 = null;

        EObject lv_a_63_0 = null;

        EObject lv_b_65_0 = null;

        EObject lv_c_67_0 = null;

        EObject lv_d_69_0 = null;

        EObject lv_a_70_0 = null;

        EObject lv_b_72_0 = null;

        EObject lv_c_74_0 = null;

        EObject lv_d_76_0 = null;

        EObject lv_a_77_0 = null;

        EObject lv_b_79_0 = null;

        EObject lv_c_81_0 = null;

        EObject lv_d_83_0 = null;

        EObject lv_a_84_0 = null;

        EObject lv_b_86_0 = null;

        EObject lv_c_88_0 = null;

        EObject lv_d_90_0 = null;

        EObject lv_a_91_0 = null;

        EObject lv_b_93_0 = null;

        EObject lv_c_95_0 = null;

        EObject lv_d_97_0 = null;

        EObject lv_a_98_0 = null;

        EObject lv_b_100_0 = null;

        EObject lv_c_102_0 = null;

        EObject lv_d_104_0 = null;

        EObject lv_a_105_0 = null;

        EObject lv_b_107_0 = null;

        EObject lv_c_109_0 = null;

        EObject lv_d_111_0 = null;

        EObject lv_a_112_0 = null;

        EObject lv_b_114_0 = null;

        EObject lv_c_116_0 = null;

        EObject lv_d_118_0 = null;

        EObject lv_a_119_0 = null;

        EObject lv_b_121_0 = null;

        EObject lv_c_123_0 = null;

        EObject lv_d_125_0 = null;

        EObject lv_a_126_0 = null;

        EObject lv_b_128_0 = null;

        EObject lv_c_130_0 = null;

        EObject lv_d_132_0 = null;

        EObject lv_a_133_0 = null;

        EObject lv_b_135_0 = null;

        EObject lv_c_137_0 = null;

        EObject lv_d_139_0 = null;

        EObject lv_a_140_0 = null;

        EObject lv_b_142_0 = null;

        EObject lv_c_144_0 = null;

        EObject lv_d_146_0 = null;

        EObject lv_a_147_0 = null;

        EObject lv_b_149_0 = null;

        EObject lv_c_151_0 = null;

        EObject lv_d_153_0 = null;

        EObject lv_a_154_0 = null;

        EObject lv_b_156_0 = null;

        EObject lv_c_158_0 = null;

        EObject lv_d_160_0 = null;

        EObject lv_a_161_0 = null;

        EObject lv_b_163_0 = null;

        EObject lv_c_165_0 = null;

        EObject lv_d_167_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:4598:2: ( ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) ) | ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) ) | ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) ) | ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) ) | ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) ) | ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) ) | ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) ) | ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) ) | ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) ) | ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) ) | ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) ) | ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) ) | ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) ) | ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) ) | ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) ) | ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) ) | ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) ) | ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) ) | ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) ) | ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) ) | ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) ) | ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) ) | ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) ) | ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) ) ) )
            // InternalDroneDSL.g:4599:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) ) | ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) ) | ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) ) | ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) ) | ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) ) | ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) ) | ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) ) | ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) ) | ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) ) | ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) ) | ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) ) | ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) ) | ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) ) | ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) ) | ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) ) | ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) ) | ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) ) | ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) ) | ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) ) | ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) ) | ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) ) | ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) ) | ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) ) | ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) ) )
            {
            // InternalDroneDSL.g:4599:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) ) | ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) ) | ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) ) | ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) ) | ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) ) | ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) ) | ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) ) | ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) ) | ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) ) | ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) ) | ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) ) | ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) ) | ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) ) | ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) ) | ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) ) | ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) ) | ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) ) | ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) ) | ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) ) | ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) ) | ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) ) | ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) ) | ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) ) | ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) ) )
            int alt33=24;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // InternalDroneDSL.g:4600:3: ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:4600:3: ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:4601:4: ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:4601:4: ( (lv_a_0_0= ruleAR ) )
                    // InternalDroneDSL.g:4602:5: (lv_a_0_0= ruleAR )
                    {
                    // InternalDroneDSL.g:4602:5: (lv_a_0_0= ruleAR )
                    // InternalDroneDSL.g:4603:6: lv_a_0_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAARParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_0_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_0_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_1, grammarAccess.getParallele4Access().getAmpersandKeyword_0_1());
                    			
                    // InternalDroneDSL.g:4624:4: ( (lv_b_2_0= ruleGDr ) )
                    // InternalDroneDSL.g:4625:5: (lv_b_2_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:4625:5: (lv_b_2_0= ruleGDr )
                    // InternalDroneDSL.g:4626:6: lv_b_2_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBGDrParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_2_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_2_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,44,FOLLOW_35); 

                    				newLeafNode(otherlv_3, grammarAccess.getParallele4Access().getAmpersandKeyword_0_3());
                    			
                    // InternalDroneDSL.g:4647:4: ( (lv_c_4_0= ruleMD ) )
                    // InternalDroneDSL.g:4648:5: (lv_c_4_0= ruleMD )
                    {
                    // InternalDroneDSL.g:4648:5: (lv_c_4_0= ruleMD )
                    // InternalDroneDSL.g:4649:6: lv_c_4_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCMDParserRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_c_4_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_4_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,44,FOLLOW_34); 

                    				newLeafNode(otherlv_5, grammarAccess.getParallele4Access().getAmpersandKeyword_0_5());
                    			
                    // InternalDroneDSL.g:4670:4: ( (lv_d_6_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4671:5: (lv_d_6_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4671:5: (lv_d_6_0= ruleRGRD )
                    // InternalDroneDSL.g:4672:6: lv_d_6_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getDRGRDParserRuleCall_0_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_d_6_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"d",
                    							lv_d_6_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDroneDSL.g:4691:3: ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:4691:3: ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) )
                    // InternalDroneDSL.g:4692:4: ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:4692:4: ( (lv_a_7_0= ruleAR ) )
                    // InternalDroneDSL.g:4693:5: (lv_a_7_0= ruleAR )
                    {
                    // InternalDroneDSL.g:4693:5: (lv_a_7_0= ruleAR )
                    // InternalDroneDSL.g:4694:6: lv_a_7_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAARParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_7_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_7_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_8, grammarAccess.getParallele4Access().getAmpersandKeyword_1_1());
                    			
                    // InternalDroneDSL.g:4715:4: ( (lv_b_9_0= ruleGDr ) )
                    // InternalDroneDSL.g:4716:5: (lv_b_9_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:4716:5: (lv_b_9_0= ruleGDr )
                    // InternalDroneDSL.g:4717:6: lv_b_9_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBGDrParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_9_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_9_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,44,FOLLOW_34); 

                    				newLeafNode(otherlv_10, grammarAccess.getParallele4Access().getAmpersandKeyword_1_3());
                    			
                    // InternalDroneDSL.g:4738:4: ( (lv_c_11_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4739:5: (lv_c_11_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4739:5: (lv_c_11_0= ruleRGRD )
                    // InternalDroneDSL.g:4740:6: lv_c_11_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCRGRDParserRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_c_11_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_11_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,44,FOLLOW_35); 

                    				newLeafNode(otherlv_12, grammarAccess.getParallele4Access().getAmpersandKeyword_1_5());
                    			
                    // InternalDroneDSL.g:4761:4: ( (lv_d_13_0= ruleMD ) )
                    // InternalDroneDSL.g:4762:5: (lv_d_13_0= ruleMD )
                    {
                    // InternalDroneDSL.g:4762:5: (lv_d_13_0= ruleMD )
                    // InternalDroneDSL.g:4763:6: lv_d_13_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getDMDParserRuleCall_1_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_d_13_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"d",
                    							lv_d_13_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDroneDSL.g:4782:3: ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:4782:3: ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:4783:4: ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:4783:4: ( (lv_a_14_0= ruleAR ) )
                    // InternalDroneDSL.g:4784:5: (lv_a_14_0= ruleAR )
                    {
                    // InternalDroneDSL.g:4784:5: (lv_a_14_0= ruleAR )
                    // InternalDroneDSL.g:4785:6: lv_a_14_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAARParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_14_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_14_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,44,FOLLOW_35); 

                    				newLeafNode(otherlv_15, grammarAccess.getParallele4Access().getAmpersandKeyword_2_1());
                    			
                    // InternalDroneDSL.g:4806:4: ( (lv_b_16_0= ruleMD ) )
                    // InternalDroneDSL.g:4807:5: (lv_b_16_0= ruleMD )
                    {
                    // InternalDroneDSL.g:4807:5: (lv_b_16_0= ruleMD )
                    // InternalDroneDSL.g:4808:6: lv_b_16_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBMDParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_16_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_16_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_17, grammarAccess.getParallele4Access().getAmpersandKeyword_2_3());
                    			
                    // InternalDroneDSL.g:4829:4: ( (lv_c_18_0= ruleGDr ) )
                    // InternalDroneDSL.g:4830:5: (lv_c_18_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:4830:5: (lv_c_18_0= ruleGDr )
                    // InternalDroneDSL.g:4831:6: lv_c_18_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCGDrParserRuleCall_2_4_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_c_18_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_18_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_19=(Token)match(input,44,FOLLOW_34); 

                    				newLeafNode(otherlv_19, grammarAccess.getParallele4Access().getAmpersandKeyword_2_5());
                    			
                    // InternalDroneDSL.g:4852:4: ( (lv_d_20_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4853:5: (lv_d_20_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4853:5: (lv_d_20_0= ruleRGRD )
                    // InternalDroneDSL.g:4854:6: lv_d_20_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getDRGRDParserRuleCall_2_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_d_20_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"d",
                    							lv_d_20_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDroneDSL.g:4873:3: ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:4873:3: ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:4874:4: ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:4874:4: ( (lv_a_21_0= ruleAR ) )
                    // InternalDroneDSL.g:4875:5: (lv_a_21_0= ruleAR )
                    {
                    // InternalDroneDSL.g:4875:5: (lv_a_21_0= ruleAR )
                    // InternalDroneDSL.g:4876:6: lv_a_21_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAARParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_21_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_21_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_22=(Token)match(input,44,FOLLOW_35); 

                    				newLeafNode(otherlv_22, grammarAccess.getParallele4Access().getAmpersandKeyword_3_1());
                    			
                    // InternalDroneDSL.g:4897:4: ( (lv_b_23_0= ruleMD ) )
                    // InternalDroneDSL.g:4898:5: (lv_b_23_0= ruleMD )
                    {
                    // InternalDroneDSL.g:4898:5: (lv_b_23_0= ruleMD )
                    // InternalDroneDSL.g:4899:6: lv_b_23_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBMDParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_23_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_23_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_24=(Token)match(input,44,FOLLOW_34); 

                    				newLeafNode(otherlv_24, grammarAccess.getParallele4Access().getAmpersandKeyword_3_3());
                    			
                    // InternalDroneDSL.g:4920:4: ( (lv_c_25_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4921:5: (lv_c_25_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4921:5: (lv_c_25_0= ruleRGRD )
                    // InternalDroneDSL.g:4922:6: lv_c_25_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCRGRDParserRuleCall_3_4_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_c_25_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_25_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_26=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_26, grammarAccess.getParallele4Access().getAmpersandKeyword_3_5());
                    			
                    // InternalDroneDSL.g:4943:4: ( (lv_d_27_0= ruleGDr ) )
                    // InternalDroneDSL.g:4944:5: (lv_d_27_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:4944:5: (lv_d_27_0= ruleGDr )
                    // InternalDroneDSL.g:4945:6: lv_d_27_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getDGDrParserRuleCall_3_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_d_27_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"d",
                    							lv_d_27_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalDroneDSL.g:4964:3: ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:4964:3: ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:4965:4: ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:4965:4: ( (lv_a_28_0= ruleAR ) )
                    // InternalDroneDSL.g:4966:5: (lv_a_28_0= ruleAR )
                    {
                    // InternalDroneDSL.g:4966:5: (lv_a_28_0= ruleAR )
                    // InternalDroneDSL.g:4967:6: lv_a_28_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAARParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_28_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_28_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_29=(Token)match(input,44,FOLLOW_34); 

                    				newLeafNode(otherlv_29, grammarAccess.getParallele4Access().getAmpersandKeyword_4_1());
                    			
                    // InternalDroneDSL.g:4988:4: ( (lv_b_30_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4989:5: (lv_b_30_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4989:5: (lv_b_30_0= ruleRGRD )
                    // InternalDroneDSL.g:4990:6: lv_b_30_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBRGRDParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_30_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_30_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_31=(Token)match(input,44,FOLLOW_35); 

                    				newLeafNode(otherlv_31, grammarAccess.getParallele4Access().getAmpersandKeyword_4_3());
                    			
                    // InternalDroneDSL.g:5011:4: ( (lv_c_32_0= ruleMD ) )
                    // InternalDroneDSL.g:5012:5: (lv_c_32_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5012:5: (lv_c_32_0= ruleMD )
                    // InternalDroneDSL.g:5013:6: lv_c_32_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCMDParserRuleCall_4_4_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_c_32_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_32_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_33=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_33, grammarAccess.getParallele4Access().getAmpersandKeyword_4_5());
                    			
                    // InternalDroneDSL.g:5034:4: ( (lv_d_34_0= ruleGDr ) )
                    // InternalDroneDSL.g:5035:5: (lv_d_34_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5035:5: (lv_d_34_0= ruleGDr )
                    // InternalDroneDSL.g:5036:6: lv_d_34_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getDGDrParserRuleCall_4_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_d_34_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"d",
                    							lv_d_34_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalDroneDSL.g:5055:3: ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:5055:3: ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) )
                    // InternalDroneDSL.g:5056:4: ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:5056:4: ( (lv_a_35_0= ruleAR ) )
                    // InternalDroneDSL.g:5057:5: (lv_a_35_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5057:5: (lv_a_35_0= ruleAR )
                    // InternalDroneDSL.g:5058:6: lv_a_35_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAARParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_35_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_35_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_36=(Token)match(input,44,FOLLOW_34); 

                    				newLeafNode(otherlv_36, grammarAccess.getParallele4Access().getAmpersandKeyword_5_1());
                    			
                    // InternalDroneDSL.g:5079:4: ( (lv_b_37_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5080:5: (lv_b_37_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5080:5: (lv_b_37_0= ruleRGRD )
                    // InternalDroneDSL.g:5081:6: lv_b_37_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBRGRDParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_37_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_37_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_38=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_38, grammarAccess.getParallele4Access().getAmpersandKeyword_5_3());
                    			
                    // InternalDroneDSL.g:5102:4: ( (lv_c_39_0= ruleGDr ) )
                    // InternalDroneDSL.g:5103:5: (lv_c_39_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5103:5: (lv_c_39_0= ruleGDr )
                    // InternalDroneDSL.g:5104:6: lv_c_39_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCGDrParserRuleCall_5_4_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_c_39_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_39_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_40=(Token)match(input,44,FOLLOW_35); 

                    				newLeafNode(otherlv_40, grammarAccess.getParallele4Access().getAmpersandKeyword_5_5());
                    			
                    // InternalDroneDSL.g:5125:4: ( (lv_d_41_0= ruleMD ) )
                    // InternalDroneDSL.g:5126:5: (lv_d_41_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5126:5: (lv_d_41_0= ruleMD )
                    // InternalDroneDSL.g:5127:6: lv_d_41_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getDMDParserRuleCall_5_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_d_41_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"d",
                    							lv_d_41_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalDroneDSL.g:5146:3: ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:5146:3: ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:5147:4: ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:5147:4: ( (lv_a_42_0= ruleGDr ) )
                    // InternalDroneDSL.g:5148:5: (lv_a_42_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5148:5: (lv_a_42_0= ruleGDr )
                    // InternalDroneDSL.g:5149:6: lv_a_42_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAGDrParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_42_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_42_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_43=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_43, grammarAccess.getParallele4Access().getAmpersandKeyword_6_1());
                    			
                    // InternalDroneDSL.g:5170:4: ( (lv_b_44_0= ruleAR ) )
                    // InternalDroneDSL.g:5171:5: (lv_b_44_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5171:5: (lv_b_44_0= ruleAR )
                    // InternalDroneDSL.g:5172:6: lv_b_44_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBARParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_44_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_44_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_45=(Token)match(input,44,FOLLOW_35); 

                    				newLeafNode(otherlv_45, grammarAccess.getParallele4Access().getAmpersandKeyword_6_3());
                    			
                    // InternalDroneDSL.g:5193:4: ( (lv_c_46_0= ruleMD ) )
                    // InternalDroneDSL.g:5194:5: (lv_c_46_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5194:5: (lv_c_46_0= ruleMD )
                    // InternalDroneDSL.g:5195:6: lv_c_46_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCMDParserRuleCall_6_4_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_c_46_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_46_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_47=(Token)match(input,44,FOLLOW_34); 

                    				newLeafNode(otherlv_47, grammarAccess.getParallele4Access().getAmpersandKeyword_6_5());
                    			
                    // InternalDroneDSL.g:5216:4: ( (lv_d_48_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5217:5: (lv_d_48_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5217:5: (lv_d_48_0= ruleRGRD )
                    // InternalDroneDSL.g:5218:6: lv_d_48_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getDRGRDParserRuleCall_6_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_d_48_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"d",
                    							lv_d_48_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalDroneDSL.g:5237:3: ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:5237:3: ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) )
                    // InternalDroneDSL.g:5238:4: ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:5238:4: ( (lv_a_49_0= ruleGDr ) )
                    // InternalDroneDSL.g:5239:5: (lv_a_49_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5239:5: (lv_a_49_0= ruleGDr )
                    // InternalDroneDSL.g:5240:6: lv_a_49_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAGDrParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_49_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_49_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_50=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_50, grammarAccess.getParallele4Access().getAmpersandKeyword_7_1());
                    			
                    // InternalDroneDSL.g:5261:4: ( (lv_b_51_0= ruleAR ) )
                    // InternalDroneDSL.g:5262:5: (lv_b_51_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5262:5: (lv_b_51_0= ruleAR )
                    // InternalDroneDSL.g:5263:6: lv_b_51_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBARParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_51_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_51_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_52=(Token)match(input,44,FOLLOW_34); 

                    				newLeafNode(otherlv_52, grammarAccess.getParallele4Access().getAmpersandKeyword_7_3());
                    			
                    // InternalDroneDSL.g:5284:4: ( (lv_c_53_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5285:5: (lv_c_53_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5285:5: (lv_c_53_0= ruleRGRD )
                    // InternalDroneDSL.g:5286:6: lv_c_53_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCRGRDParserRuleCall_7_4_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_c_53_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_53_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_54=(Token)match(input,44,FOLLOW_35); 

                    				newLeafNode(otherlv_54, grammarAccess.getParallele4Access().getAmpersandKeyword_7_5());
                    			
                    // InternalDroneDSL.g:5307:4: ( (lv_d_55_0= ruleMD ) )
                    // InternalDroneDSL.g:5308:5: (lv_d_55_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5308:5: (lv_d_55_0= ruleMD )
                    // InternalDroneDSL.g:5309:6: lv_d_55_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getDMDParserRuleCall_7_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_d_55_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"d",
                    							lv_d_55_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalDroneDSL.g:5328:3: ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:5328:3: ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:5329:4: ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:5329:4: ( (lv_a_56_0= ruleGDr ) )
                    // InternalDroneDSL.g:5330:5: (lv_a_56_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5330:5: (lv_a_56_0= ruleGDr )
                    // InternalDroneDSL.g:5331:6: lv_a_56_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAGDrParserRuleCall_8_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_56_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_56_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_57=(Token)match(input,44,FOLLOW_35); 

                    				newLeafNode(otherlv_57, grammarAccess.getParallele4Access().getAmpersandKeyword_8_1());
                    			
                    // InternalDroneDSL.g:5352:4: ( (lv_b_58_0= ruleMD ) )
                    // InternalDroneDSL.g:5353:5: (lv_b_58_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5353:5: (lv_b_58_0= ruleMD )
                    // InternalDroneDSL.g:5354:6: lv_b_58_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBMDParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_58_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_58_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_59=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_59, grammarAccess.getParallele4Access().getAmpersandKeyword_8_3());
                    			
                    // InternalDroneDSL.g:5375:4: ( (lv_c_60_0= ruleAR ) )
                    // InternalDroneDSL.g:5376:5: (lv_c_60_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5376:5: (lv_c_60_0= ruleAR )
                    // InternalDroneDSL.g:5377:6: lv_c_60_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCARParserRuleCall_8_4_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_c_60_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_60_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_61=(Token)match(input,44,FOLLOW_34); 

                    				newLeafNode(otherlv_61, grammarAccess.getParallele4Access().getAmpersandKeyword_8_5());
                    			
                    // InternalDroneDSL.g:5398:4: ( (lv_d_62_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5399:5: (lv_d_62_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5399:5: (lv_d_62_0= ruleRGRD )
                    // InternalDroneDSL.g:5400:6: lv_d_62_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getDRGRDParserRuleCall_8_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_d_62_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"d",
                    							lv_d_62_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalDroneDSL.g:5419:3: ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:5419:3: ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) )
                    // InternalDroneDSL.g:5420:4: ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:5420:4: ( (lv_a_63_0= ruleGDr ) )
                    // InternalDroneDSL.g:5421:5: (lv_a_63_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5421:5: (lv_a_63_0= ruleGDr )
                    // InternalDroneDSL.g:5422:6: lv_a_63_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAGDrParserRuleCall_9_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_63_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_63_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_64=(Token)match(input,44,FOLLOW_35); 

                    				newLeafNode(otherlv_64, grammarAccess.getParallele4Access().getAmpersandKeyword_9_1());
                    			
                    // InternalDroneDSL.g:5443:4: ( (lv_b_65_0= ruleMD ) )
                    // InternalDroneDSL.g:5444:5: (lv_b_65_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5444:5: (lv_b_65_0= ruleMD )
                    // InternalDroneDSL.g:5445:6: lv_b_65_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBMDParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_65_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_65_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_66=(Token)match(input,44,FOLLOW_34); 

                    				newLeafNode(otherlv_66, grammarAccess.getParallele4Access().getAmpersandKeyword_9_3());
                    			
                    // InternalDroneDSL.g:5466:4: ( (lv_c_67_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5467:5: (lv_c_67_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5467:5: (lv_c_67_0= ruleRGRD )
                    // InternalDroneDSL.g:5468:6: lv_c_67_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCRGRDParserRuleCall_9_4_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_c_67_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_67_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_68=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_68, grammarAccess.getParallele4Access().getAmpersandKeyword_9_5());
                    			
                    // InternalDroneDSL.g:5489:4: ( (lv_d_69_0= ruleAR ) )
                    // InternalDroneDSL.g:5490:5: (lv_d_69_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5490:5: (lv_d_69_0= ruleAR )
                    // InternalDroneDSL.g:5491:6: lv_d_69_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getDARParserRuleCall_9_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_d_69_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"d",
                    							lv_d_69_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalDroneDSL.g:5510:3: ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:5510:3: ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) )
                    // InternalDroneDSL.g:5511:4: ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:5511:4: ( (lv_a_70_0= ruleGDr ) )
                    // InternalDroneDSL.g:5512:5: (lv_a_70_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5512:5: (lv_a_70_0= ruleGDr )
                    // InternalDroneDSL.g:5513:6: lv_a_70_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAGDrParserRuleCall_10_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_70_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_70_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_71=(Token)match(input,44,FOLLOW_34); 

                    				newLeafNode(otherlv_71, grammarAccess.getParallele4Access().getAmpersandKeyword_10_1());
                    			
                    // InternalDroneDSL.g:5534:4: ( (lv_b_72_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5535:5: (lv_b_72_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5535:5: (lv_b_72_0= ruleRGRD )
                    // InternalDroneDSL.g:5536:6: lv_b_72_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBRGRDParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_72_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_72_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_73=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_73, grammarAccess.getParallele4Access().getAmpersandKeyword_10_3());
                    			
                    // InternalDroneDSL.g:5557:4: ( (lv_c_74_0= ruleAR ) )
                    // InternalDroneDSL.g:5558:5: (lv_c_74_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5558:5: (lv_c_74_0= ruleAR )
                    // InternalDroneDSL.g:5559:6: lv_c_74_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCARParserRuleCall_10_4_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_c_74_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_74_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_75=(Token)match(input,44,FOLLOW_35); 

                    				newLeafNode(otherlv_75, grammarAccess.getParallele4Access().getAmpersandKeyword_10_5());
                    			
                    // InternalDroneDSL.g:5580:4: ( (lv_d_76_0= ruleMD ) )
                    // InternalDroneDSL.g:5581:5: (lv_d_76_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5581:5: (lv_d_76_0= ruleMD )
                    // InternalDroneDSL.g:5582:6: lv_d_76_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getDMDParserRuleCall_10_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_d_76_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"d",
                    							lv_d_76_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 12 :
                    // InternalDroneDSL.g:5601:3: ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:5601:3: ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) )
                    // InternalDroneDSL.g:5602:4: ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:5602:4: ( (lv_a_77_0= ruleGDr ) )
                    // InternalDroneDSL.g:5603:5: (lv_a_77_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5603:5: (lv_a_77_0= ruleGDr )
                    // InternalDroneDSL.g:5604:6: lv_a_77_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAGDrParserRuleCall_11_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_77_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_77_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_78=(Token)match(input,44,FOLLOW_34); 

                    				newLeafNode(otherlv_78, grammarAccess.getParallele4Access().getAmpersandKeyword_11_1());
                    			
                    // InternalDroneDSL.g:5625:4: ( (lv_b_79_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5626:5: (lv_b_79_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5626:5: (lv_b_79_0= ruleRGRD )
                    // InternalDroneDSL.g:5627:6: lv_b_79_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBRGRDParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_79_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_79_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_80=(Token)match(input,44,FOLLOW_35); 

                    				newLeafNode(otherlv_80, grammarAccess.getParallele4Access().getAmpersandKeyword_11_3());
                    			
                    // InternalDroneDSL.g:5648:4: ( (lv_c_81_0= ruleMD ) )
                    // InternalDroneDSL.g:5649:5: (lv_c_81_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5649:5: (lv_c_81_0= ruleMD )
                    // InternalDroneDSL.g:5650:6: lv_c_81_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCMDParserRuleCall_11_4_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_c_81_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_81_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_82=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_82, grammarAccess.getParallele4Access().getAmpersandKeyword_11_5());
                    			
                    // InternalDroneDSL.g:5671:4: ( (lv_d_83_0= ruleAR ) )
                    // InternalDroneDSL.g:5672:5: (lv_d_83_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5672:5: (lv_d_83_0= ruleAR )
                    // InternalDroneDSL.g:5673:6: lv_d_83_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getDARParserRuleCall_11_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_d_83_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"d",
                    							lv_d_83_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 13 :
                    // InternalDroneDSL.g:5692:3: ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:5692:3: ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:5693:4: ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:5693:4: ( (lv_a_84_0= ruleMD ) )
                    // InternalDroneDSL.g:5694:5: (lv_a_84_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5694:5: (lv_a_84_0= ruleMD )
                    // InternalDroneDSL.g:5695:6: lv_a_84_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAMDParserRuleCall_12_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_84_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_84_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_85=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_85, grammarAccess.getParallele4Access().getAmpersandKeyword_12_1());
                    			
                    // InternalDroneDSL.g:5716:4: ( (lv_b_86_0= ruleAR ) )
                    // InternalDroneDSL.g:5717:5: (lv_b_86_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5717:5: (lv_b_86_0= ruleAR )
                    // InternalDroneDSL.g:5718:6: lv_b_86_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBARParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_86_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_86_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_87=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_87, grammarAccess.getParallele4Access().getAmpersandKeyword_12_3());
                    			
                    // InternalDroneDSL.g:5739:4: ( (lv_c_88_0= ruleGDr ) )
                    // InternalDroneDSL.g:5740:5: (lv_c_88_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5740:5: (lv_c_88_0= ruleGDr )
                    // InternalDroneDSL.g:5741:6: lv_c_88_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCGDrParserRuleCall_12_4_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_c_88_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_88_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_89=(Token)match(input,44,FOLLOW_34); 

                    				newLeafNode(otherlv_89, grammarAccess.getParallele4Access().getAmpersandKeyword_12_5());
                    			
                    // InternalDroneDSL.g:5762:4: ( (lv_d_90_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5763:5: (lv_d_90_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5763:5: (lv_d_90_0= ruleRGRD )
                    // InternalDroneDSL.g:5764:6: lv_d_90_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getDRGRDParserRuleCall_12_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_d_90_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"d",
                    							lv_d_90_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 14 :
                    // InternalDroneDSL.g:5783:3: ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:5783:3: ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:5784:4: ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:5784:4: ( (lv_a_91_0= ruleMD ) )
                    // InternalDroneDSL.g:5785:5: (lv_a_91_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5785:5: (lv_a_91_0= ruleMD )
                    // InternalDroneDSL.g:5786:6: lv_a_91_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAMDParserRuleCall_13_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_91_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_91_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_92=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_92, grammarAccess.getParallele4Access().getAmpersandKeyword_13_1());
                    			
                    // InternalDroneDSL.g:5807:4: ( (lv_b_93_0= ruleAR ) )
                    // InternalDroneDSL.g:5808:5: (lv_b_93_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5808:5: (lv_b_93_0= ruleAR )
                    // InternalDroneDSL.g:5809:6: lv_b_93_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBARParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_93_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_93_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_94=(Token)match(input,44,FOLLOW_34); 

                    				newLeafNode(otherlv_94, grammarAccess.getParallele4Access().getAmpersandKeyword_13_3());
                    			
                    // InternalDroneDSL.g:5830:4: ( (lv_c_95_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5831:5: (lv_c_95_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5831:5: (lv_c_95_0= ruleRGRD )
                    // InternalDroneDSL.g:5832:6: lv_c_95_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCRGRDParserRuleCall_13_4_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_c_95_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_95_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_96=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_96, grammarAccess.getParallele4Access().getAmpersandKeyword_13_5());
                    			
                    // InternalDroneDSL.g:5853:4: ( (lv_d_97_0= ruleGDr ) )
                    // InternalDroneDSL.g:5854:5: (lv_d_97_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5854:5: (lv_d_97_0= ruleGDr )
                    // InternalDroneDSL.g:5855:6: lv_d_97_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getDGDrParserRuleCall_13_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_d_97_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"d",
                    							lv_d_97_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 15 :
                    // InternalDroneDSL.g:5874:3: ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:5874:3: ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:5875:4: ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:5875:4: ( (lv_a_98_0= ruleMD ) )
                    // InternalDroneDSL.g:5876:5: (lv_a_98_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5876:5: (lv_a_98_0= ruleMD )
                    // InternalDroneDSL.g:5877:6: lv_a_98_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAMDParserRuleCall_14_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_98_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_98_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_99=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_99, grammarAccess.getParallele4Access().getAmpersandKeyword_14_1());
                    			
                    // InternalDroneDSL.g:5898:4: ( (lv_b_100_0= ruleGDr ) )
                    // InternalDroneDSL.g:5899:5: (lv_b_100_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5899:5: (lv_b_100_0= ruleGDr )
                    // InternalDroneDSL.g:5900:6: lv_b_100_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBGDrParserRuleCall_14_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_100_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_100_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_101=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_101, grammarAccess.getParallele4Access().getAmpersandKeyword_14_3());
                    			
                    // InternalDroneDSL.g:5921:4: ( (lv_c_102_0= ruleAR ) )
                    // InternalDroneDSL.g:5922:5: (lv_c_102_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5922:5: (lv_c_102_0= ruleAR )
                    // InternalDroneDSL.g:5923:6: lv_c_102_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCARParserRuleCall_14_4_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_c_102_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_102_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_103=(Token)match(input,44,FOLLOW_34); 

                    				newLeafNode(otherlv_103, grammarAccess.getParallele4Access().getAmpersandKeyword_14_5());
                    			
                    // InternalDroneDSL.g:5944:4: ( (lv_d_104_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5945:5: (lv_d_104_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5945:5: (lv_d_104_0= ruleRGRD )
                    // InternalDroneDSL.g:5946:6: lv_d_104_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getDRGRDParserRuleCall_14_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_d_104_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"d",
                    							lv_d_104_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 16 :
                    // InternalDroneDSL.g:5965:3: ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:5965:3: ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) )
                    // InternalDroneDSL.g:5966:4: ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:5966:4: ( (lv_a_105_0= ruleMD ) )
                    // InternalDroneDSL.g:5967:5: (lv_a_105_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5967:5: (lv_a_105_0= ruleMD )
                    // InternalDroneDSL.g:5968:6: lv_a_105_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAMDParserRuleCall_15_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_105_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_105_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_106=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_106, grammarAccess.getParallele4Access().getAmpersandKeyword_15_1());
                    			
                    // InternalDroneDSL.g:5989:4: ( (lv_b_107_0= ruleGDr ) )
                    // InternalDroneDSL.g:5990:5: (lv_b_107_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5990:5: (lv_b_107_0= ruleGDr )
                    // InternalDroneDSL.g:5991:6: lv_b_107_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBGDrParserRuleCall_15_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_107_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_107_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_108=(Token)match(input,44,FOLLOW_34); 

                    				newLeafNode(otherlv_108, grammarAccess.getParallele4Access().getAmpersandKeyword_15_3());
                    			
                    // InternalDroneDSL.g:6012:4: ( (lv_c_109_0= ruleRGRD ) )
                    // InternalDroneDSL.g:6013:5: (lv_c_109_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:6013:5: (lv_c_109_0= ruleRGRD )
                    // InternalDroneDSL.g:6014:6: lv_c_109_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCRGRDParserRuleCall_15_4_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_c_109_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_109_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_110=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_110, grammarAccess.getParallele4Access().getAmpersandKeyword_15_5());
                    			
                    // InternalDroneDSL.g:6035:4: ( (lv_d_111_0= ruleAR ) )
                    // InternalDroneDSL.g:6036:5: (lv_d_111_0= ruleAR )
                    {
                    // InternalDroneDSL.g:6036:5: (lv_d_111_0= ruleAR )
                    // InternalDroneDSL.g:6037:6: lv_d_111_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getDARParserRuleCall_15_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_d_111_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"d",
                    							lv_d_111_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 17 :
                    // InternalDroneDSL.g:6056:3: ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:6056:3: ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) )
                    // InternalDroneDSL.g:6057:4: ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:6057:4: ( (lv_a_112_0= ruleMD ) )
                    // InternalDroneDSL.g:6058:5: (lv_a_112_0= ruleMD )
                    {
                    // InternalDroneDSL.g:6058:5: (lv_a_112_0= ruleMD )
                    // InternalDroneDSL.g:6059:6: lv_a_112_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAMDParserRuleCall_16_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_112_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_112_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_113=(Token)match(input,44,FOLLOW_34); 

                    				newLeafNode(otherlv_113, grammarAccess.getParallele4Access().getAmpersandKeyword_16_1());
                    			
                    // InternalDroneDSL.g:6080:4: ( (lv_b_114_0= ruleRGRD ) )
                    // InternalDroneDSL.g:6081:5: (lv_b_114_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:6081:5: (lv_b_114_0= ruleRGRD )
                    // InternalDroneDSL.g:6082:6: lv_b_114_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBRGRDParserRuleCall_16_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_114_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_114_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_115=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_115, grammarAccess.getParallele4Access().getAmpersandKeyword_16_3());
                    			
                    // InternalDroneDSL.g:6103:4: ( (lv_c_116_0= ruleGDr ) )
                    // InternalDroneDSL.g:6104:5: (lv_c_116_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:6104:5: (lv_c_116_0= ruleGDr )
                    // InternalDroneDSL.g:6105:6: lv_c_116_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCGDrParserRuleCall_16_4_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_c_116_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_116_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_117=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_117, grammarAccess.getParallele4Access().getAmpersandKeyword_16_5());
                    			
                    // InternalDroneDSL.g:6126:4: ( (lv_d_118_0= ruleAR ) )
                    // InternalDroneDSL.g:6127:5: (lv_d_118_0= ruleAR )
                    {
                    // InternalDroneDSL.g:6127:5: (lv_d_118_0= ruleAR )
                    // InternalDroneDSL.g:6128:6: lv_d_118_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getDARParserRuleCall_16_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_d_118_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"d",
                    							lv_d_118_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 18 :
                    // InternalDroneDSL.g:6147:3: ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:6147:3: ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:6148:4: ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:6148:4: ( (lv_a_119_0= ruleMD ) )
                    // InternalDroneDSL.g:6149:5: (lv_a_119_0= ruleMD )
                    {
                    // InternalDroneDSL.g:6149:5: (lv_a_119_0= ruleMD )
                    // InternalDroneDSL.g:6150:6: lv_a_119_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAMDParserRuleCall_17_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_119_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_119_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_120=(Token)match(input,44,FOLLOW_34); 

                    				newLeafNode(otherlv_120, grammarAccess.getParallele4Access().getAmpersandKeyword_17_1());
                    			
                    // InternalDroneDSL.g:6171:4: ( (lv_b_121_0= ruleRGRD ) )
                    // InternalDroneDSL.g:6172:5: (lv_b_121_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:6172:5: (lv_b_121_0= ruleRGRD )
                    // InternalDroneDSL.g:6173:6: lv_b_121_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBRGRDParserRuleCall_17_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_121_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_121_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_122=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_122, grammarAccess.getParallele4Access().getAmpersandKeyword_17_3());
                    			
                    // InternalDroneDSL.g:6194:4: ( (lv_c_123_0= ruleAR ) )
                    // InternalDroneDSL.g:6195:5: (lv_c_123_0= ruleAR )
                    {
                    // InternalDroneDSL.g:6195:5: (lv_c_123_0= ruleAR )
                    // InternalDroneDSL.g:6196:6: lv_c_123_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCARParserRuleCall_17_4_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_c_123_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_123_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_124=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_124, grammarAccess.getParallele4Access().getAmpersandKeyword_17_5());
                    			
                    // InternalDroneDSL.g:6217:4: ( (lv_d_125_0= ruleGDr ) )
                    // InternalDroneDSL.g:6218:5: (lv_d_125_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:6218:5: (lv_d_125_0= ruleGDr )
                    // InternalDroneDSL.g:6219:6: lv_d_125_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getDGDrParserRuleCall_17_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_d_125_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"d",
                    							lv_d_125_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 19 :
                    // InternalDroneDSL.g:6238:3: ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:6238:3: ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:6239:4: ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:6239:4: ( (lv_a_126_0= ruleRGRD ) )
                    // InternalDroneDSL.g:6240:5: (lv_a_126_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:6240:5: (lv_a_126_0= ruleRGRD )
                    // InternalDroneDSL.g:6241:6: lv_a_126_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getARGRDParserRuleCall_18_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_126_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_126_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_127=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_127, grammarAccess.getParallele4Access().getAmpersandKeyword_18_1());
                    			
                    // InternalDroneDSL.g:6262:4: ( (lv_b_128_0= ruleAR ) )
                    // InternalDroneDSL.g:6263:5: (lv_b_128_0= ruleAR )
                    {
                    // InternalDroneDSL.g:6263:5: (lv_b_128_0= ruleAR )
                    // InternalDroneDSL.g:6264:6: lv_b_128_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBARParserRuleCall_18_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_128_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_128_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_129=(Token)match(input,44,FOLLOW_35); 

                    				newLeafNode(otherlv_129, grammarAccess.getParallele4Access().getAmpersandKeyword_18_3());
                    			
                    // InternalDroneDSL.g:6285:4: ( (lv_c_130_0= ruleMD ) )
                    // InternalDroneDSL.g:6286:5: (lv_c_130_0= ruleMD )
                    {
                    // InternalDroneDSL.g:6286:5: (lv_c_130_0= ruleMD )
                    // InternalDroneDSL.g:6287:6: lv_c_130_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCMDParserRuleCall_18_4_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_c_130_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_130_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_131=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_131, grammarAccess.getParallele4Access().getAmpersandKeyword_18_5());
                    			
                    // InternalDroneDSL.g:6308:4: ( (lv_d_132_0= ruleGDr ) )
                    // InternalDroneDSL.g:6309:5: (lv_d_132_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:6309:5: (lv_d_132_0= ruleGDr )
                    // InternalDroneDSL.g:6310:6: lv_d_132_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getDGDrParserRuleCall_18_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_d_132_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"d",
                    							lv_d_132_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 20 :
                    // InternalDroneDSL.g:6329:3: ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:6329:3: ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) )
                    // InternalDroneDSL.g:6330:4: ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:6330:4: ( (lv_a_133_0= ruleRGRD ) )
                    // InternalDroneDSL.g:6331:5: (lv_a_133_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:6331:5: (lv_a_133_0= ruleRGRD )
                    // InternalDroneDSL.g:6332:6: lv_a_133_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getARGRDParserRuleCall_19_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_133_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_133_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_134=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_134, grammarAccess.getParallele4Access().getAmpersandKeyword_19_1());
                    			
                    // InternalDroneDSL.g:6353:4: ( (lv_b_135_0= ruleAR ) )
                    // InternalDroneDSL.g:6354:5: (lv_b_135_0= ruleAR )
                    {
                    // InternalDroneDSL.g:6354:5: (lv_b_135_0= ruleAR )
                    // InternalDroneDSL.g:6355:6: lv_b_135_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBARParserRuleCall_19_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_135_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_135_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_136=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_136, grammarAccess.getParallele4Access().getAmpersandKeyword_19_3());
                    			
                    // InternalDroneDSL.g:6376:4: ( (lv_c_137_0= ruleGDr ) )
                    // InternalDroneDSL.g:6377:5: (lv_c_137_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:6377:5: (lv_c_137_0= ruleGDr )
                    // InternalDroneDSL.g:6378:6: lv_c_137_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCGDrParserRuleCall_19_4_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_c_137_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_137_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_138=(Token)match(input,44,FOLLOW_35); 

                    				newLeafNode(otherlv_138, grammarAccess.getParallele4Access().getAmpersandKeyword_19_5());
                    			
                    // InternalDroneDSL.g:6399:4: ( (lv_d_139_0= ruleMD ) )
                    // InternalDroneDSL.g:6400:5: (lv_d_139_0= ruleMD )
                    {
                    // InternalDroneDSL.g:6400:5: (lv_d_139_0= ruleMD )
                    // InternalDroneDSL.g:6401:6: lv_d_139_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getDMDParserRuleCall_19_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_d_139_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"d",
                    							lv_d_139_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 21 :
                    // InternalDroneDSL.g:6420:3: ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:6420:3: ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:6421:4: ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:6421:4: ( (lv_a_140_0= ruleRGRD ) )
                    // InternalDroneDSL.g:6422:5: (lv_a_140_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:6422:5: (lv_a_140_0= ruleRGRD )
                    // InternalDroneDSL.g:6423:6: lv_a_140_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getARGRDParserRuleCall_20_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_140_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_140_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_141=(Token)match(input,44,FOLLOW_35); 

                    				newLeafNode(otherlv_141, grammarAccess.getParallele4Access().getAmpersandKeyword_20_1());
                    			
                    // InternalDroneDSL.g:6444:4: ( (lv_b_142_0= ruleMD ) )
                    // InternalDroneDSL.g:6445:5: (lv_b_142_0= ruleMD )
                    {
                    // InternalDroneDSL.g:6445:5: (lv_b_142_0= ruleMD )
                    // InternalDroneDSL.g:6446:6: lv_b_142_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBMDParserRuleCall_20_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_142_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_142_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_143=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_143, grammarAccess.getParallele4Access().getAmpersandKeyword_20_3());
                    			
                    // InternalDroneDSL.g:6467:4: ( (lv_c_144_0= ruleAR ) )
                    // InternalDroneDSL.g:6468:5: (lv_c_144_0= ruleAR )
                    {
                    // InternalDroneDSL.g:6468:5: (lv_c_144_0= ruleAR )
                    // InternalDroneDSL.g:6469:6: lv_c_144_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCARParserRuleCall_20_4_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_c_144_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_144_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_145=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_145, grammarAccess.getParallele4Access().getAmpersandKeyword_20_5());
                    			
                    // InternalDroneDSL.g:6490:4: ( (lv_d_146_0= ruleGDr ) )
                    // InternalDroneDSL.g:6491:5: (lv_d_146_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:6491:5: (lv_d_146_0= ruleGDr )
                    // InternalDroneDSL.g:6492:6: lv_d_146_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getDGDrParserRuleCall_20_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_d_146_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"d",
                    							lv_d_146_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 22 :
                    // InternalDroneDSL.g:6511:3: ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:6511:3: ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) )
                    // InternalDroneDSL.g:6512:4: ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:6512:4: ( (lv_a_147_0= ruleRGRD ) )
                    // InternalDroneDSL.g:6513:5: (lv_a_147_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:6513:5: (lv_a_147_0= ruleRGRD )
                    // InternalDroneDSL.g:6514:6: lv_a_147_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getARGRDParserRuleCall_21_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_147_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_147_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_148=(Token)match(input,44,FOLLOW_35); 

                    				newLeafNode(otherlv_148, grammarAccess.getParallele4Access().getAmpersandKeyword_21_1());
                    			
                    // InternalDroneDSL.g:6535:4: ( (lv_b_149_0= ruleMD ) )
                    // InternalDroneDSL.g:6536:5: (lv_b_149_0= ruleMD )
                    {
                    // InternalDroneDSL.g:6536:5: (lv_b_149_0= ruleMD )
                    // InternalDroneDSL.g:6537:6: lv_b_149_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBMDParserRuleCall_21_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_149_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_149_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_150=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_150, grammarAccess.getParallele4Access().getAmpersandKeyword_21_3());
                    			
                    // InternalDroneDSL.g:6558:4: ( (lv_c_151_0= ruleGDr ) )
                    // InternalDroneDSL.g:6559:5: (lv_c_151_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:6559:5: (lv_c_151_0= ruleGDr )
                    // InternalDroneDSL.g:6560:6: lv_c_151_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCGDrParserRuleCall_21_4_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_c_151_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_151_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_152=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_152, grammarAccess.getParallele4Access().getAmpersandKeyword_21_5());
                    			
                    // InternalDroneDSL.g:6581:4: ( (lv_d_153_0= ruleAR ) )
                    // InternalDroneDSL.g:6582:5: (lv_d_153_0= ruleAR )
                    {
                    // InternalDroneDSL.g:6582:5: (lv_d_153_0= ruleAR )
                    // InternalDroneDSL.g:6583:6: lv_d_153_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getDARParserRuleCall_21_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_d_153_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"d",
                    							lv_d_153_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 23 :
                    // InternalDroneDSL.g:6602:3: ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:6602:3: ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) )
                    // InternalDroneDSL.g:6603:4: ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:6603:4: ( (lv_a_154_0= ruleRGRD ) )
                    // InternalDroneDSL.g:6604:5: (lv_a_154_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:6604:5: (lv_a_154_0= ruleRGRD )
                    // InternalDroneDSL.g:6605:6: lv_a_154_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getARGRDParserRuleCall_22_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_154_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_154_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_155=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_155, grammarAccess.getParallele4Access().getAmpersandKeyword_22_1());
                    			
                    // InternalDroneDSL.g:6626:4: ( (lv_b_156_0= ruleGDr ) )
                    // InternalDroneDSL.g:6627:5: (lv_b_156_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:6627:5: (lv_b_156_0= ruleGDr )
                    // InternalDroneDSL.g:6628:6: lv_b_156_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBGDrParserRuleCall_22_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_156_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_156_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_157=(Token)match(input,44,FOLLOW_35); 

                    				newLeafNode(otherlv_157, grammarAccess.getParallele4Access().getAmpersandKeyword_22_3());
                    			
                    // InternalDroneDSL.g:6649:4: ( (lv_c_158_0= ruleMD ) )
                    // InternalDroneDSL.g:6650:5: (lv_c_158_0= ruleMD )
                    {
                    // InternalDroneDSL.g:6650:5: (lv_c_158_0= ruleMD )
                    // InternalDroneDSL.g:6651:6: lv_c_158_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCMDParserRuleCall_22_4_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_c_158_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_158_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_159=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_159, grammarAccess.getParallele4Access().getAmpersandKeyword_22_5());
                    			
                    // InternalDroneDSL.g:6672:4: ( (lv_d_160_0= ruleAR ) )
                    // InternalDroneDSL.g:6673:5: (lv_d_160_0= ruleAR )
                    {
                    // InternalDroneDSL.g:6673:5: (lv_d_160_0= ruleAR )
                    // InternalDroneDSL.g:6674:6: lv_d_160_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getDARParserRuleCall_22_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_d_160_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"d",
                    							lv_d_160_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 24 :
                    // InternalDroneDSL.g:6693:3: ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:6693:3: ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) )
                    // InternalDroneDSL.g:6694:4: ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:6694:4: ( (lv_a_161_0= ruleRGRD ) )
                    // InternalDroneDSL.g:6695:5: (lv_a_161_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:6695:5: (lv_a_161_0= ruleRGRD )
                    // InternalDroneDSL.g:6696:6: lv_a_161_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getARGRDParserRuleCall_23_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_a_161_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_161_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_162=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_162, grammarAccess.getParallele4Access().getAmpersandKeyword_23_1());
                    			
                    // InternalDroneDSL.g:6717:4: ( (lv_b_163_0= ruleGDr ) )
                    // InternalDroneDSL.g:6718:5: (lv_b_163_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:6718:5: (lv_b_163_0= ruleGDr )
                    // InternalDroneDSL.g:6719:6: lv_b_163_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBGDrParserRuleCall_23_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_b_163_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_163_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_164=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_164, grammarAccess.getParallele4Access().getAmpersandKeyword_23_3());
                    			
                    // InternalDroneDSL.g:6740:4: ( (lv_c_165_0= ruleAR ) )
                    // InternalDroneDSL.g:6741:5: (lv_c_165_0= ruleAR )
                    {
                    // InternalDroneDSL.g:6741:5: (lv_c_165_0= ruleAR )
                    // InternalDroneDSL.g:6742:6: lv_c_165_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCARParserRuleCall_23_4_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_c_165_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_165_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_166=(Token)match(input,44,FOLLOW_35); 

                    				newLeafNode(otherlv_166, grammarAccess.getParallele4Access().getAmpersandKeyword_23_5());
                    			
                    // InternalDroneDSL.g:6763:4: ( (lv_d_167_0= ruleMD ) )
                    // InternalDroneDSL.g:6764:5: (lv_d_167_0= ruleMD )
                    {
                    // InternalDroneDSL.g:6764:5: (lv_d_167_0= ruleMD )
                    // InternalDroneDSL.g:6765:6: lv_d_167_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getDMDParserRuleCall_23_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_d_167_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"d",
                    							lv_d_167_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParallele4"

    // Delegated rules


    protected DFA18 dfa18 = new DFA18(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA33 dfa33 = new DFA33(this);
    static final String dfa_1s = "\114\uffff";
    static final String dfa_2s = "\73\uffff\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\11\uffff";
    static final String dfa_3s = "\1\36\10\33\1\uffff\10\6\10\37\2\34\6\37\5\4\1\uffff\3\4\20\34\10\6\11\uffff";
    static final String dfa_4s = "\1\53\10\33\1\uffff\10\7\20\37\5\6\1\uffff\3\6\20\34\10\54\11\uffff";
    static final String dfa_5s = "\11\uffff\1\13\35\uffff\1\5\33\uffff\1\12\1\1\1\2\1\3\1\4\1\6\1\7\1\10\1\11";
    static final String dfa_6s = "\114\uffff}>";
    static final String[] dfa_7s = {
            "\1\10\1\uffff\1\2\1\1\1\7\1\6\1\5\1\4\1\3\2\uffff\1\11\1\uffff\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "",
            "\1\23\1\22",
            "\1\25\1\24",
            "\1\27\1\26",
            "\1\31\1\30",
            "\1\33\1\32",
            "\1\35\1\34",
            "\1\37\1\36",
            "\1\41\1\40",
            "\1\42",
            "\1\42",
            "\1\43",
            "\1\43",
            "\1\44",
            "\1\44",
            "\1\45",
            "\1\45",
            "\1\47\2\uffff\1\46",
            "\1\47\2\uffff\1\46",
            "\1\50",
            "\1\50",
            "\1\51",
            "\1\51",
            "\1\52",
            "\1\52",
            "\1\53\1\uffff\1\54",
            "\1\55\1\uffff\1\56",
            "\1\57\1\uffff\1\60",
            "\1\61\1\uffff\1\62",
            "\1\63\1\uffff\1\64",
            "",
            "\1\65\1\uffff\1\66",
            "\1\67\1\uffff\1\70",
            "\1\71\1\uffff\1\72",
            "\1\73",
            "\1\73",
            "\1\74",
            "\1\74",
            "\1\75",
            "\1\75",
            "\1\76",
            "\1\76",
            "\1\77",
            "\1\77",
            "\1\100",
            "\1\100",
            "\1\101",
            "\1\101",
            "\1\102",
            "\1\102",
            "\1\104\6\uffff\1\104\2\uffff\1\104\11\uffff\1\104\2\uffff\2\104\1\uffff\7\104\1\uffff\2\104\1\uffff\1\104\1\103",
            "\1\105\6\uffff\1\105\2\uffff\1\105\11\uffff\1\105\2\uffff\2\105\1\uffff\7\105\1\uffff\2\105\1\uffff\1\105\1\103",
            "\1\106\6\uffff\1\106\2\uffff\1\106\11\uffff\1\106\2\uffff\2\106\1\uffff\7\106\1\uffff\2\106\1\uffff\1\106\1\103",
            "\1\107\6\uffff\1\107\2\uffff\1\107\11\uffff\1\107\2\uffff\2\107\1\uffff\7\107\1\uffff\2\107\1\uffff\1\107\1\103",
            "\1\110\6\uffff\1\110\2\uffff\1\110\11\uffff\1\110\2\uffff\2\110\1\uffff\7\110\1\uffff\2\110\1\uffff\1\110\1\103",
            "\1\111\6\uffff\1\111\2\uffff\1\111\11\uffff\1\111\2\uffff\2\111\1\uffff\7\111\1\uffff\2\111\1\uffff\1\111\1\103",
            "\1\112\6\uffff\1\112\2\uffff\1\112\11\uffff\1\112\2\uffff\2\112\1\uffff\7\112\1\uffff\2\112\1\uffff\1\112\1\103",
            "\1\113\6\uffff\1\113\2\uffff\1\113\11\uffff\1\113\2\uffff\2\113\1\uffff\7\113\1\uffff\2\113\1\uffff\1\113\1\103",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1497:2: (this_Avancer_0= ruleAvancer | this_Descendre_1= ruleDescendre | this_RotationDroite_2= ruleRotationDroite | this_RotationGauche_3= ruleRotationGauche | this_Pause_4= rulePause | this_Droite_5= ruleDroite | this_Gauche_6= ruleGauche | this_Reculer_7= ruleReculer | this_Monter_8= ruleMonter | this_Parallele_9= ruleParallele | this_VarDecl_10= ruleVarDecl )";
        }
    }
    static final String dfa_8s = "\u0294\uffff";
    static final String dfa_9s = "\u00ed\uffff\30\u0106\u015d\uffff\60\u0293\2\uffff";
    static final String dfa_10s = "\1\36\10\33\10\6\20\37\10\4\20\34\10\54\1\41\3\36\30\33\30\6\60\37\30\4\60\34\30\6\1\43\1\uffff\2\41\2\36\2\41\3\36\1\43\1\36\60\33\60\6\140\37\60\4\140\34\60\6\2\uffff";
    static final String dfa_11s = "\1\46\10\33\10\7\20\37\10\6\20\34\10\54\2\46\1\44\1\46\30\33\30\7\60\37\30\6\60\34\30\54\1\46\1\uffff\1\46\1\44\1\42\2\46\1\44\1\42\2\44\2\46\60\33\60\7\140\37\60\6\140\34\60\54\2\uffff";
    static final String dfa_12s = "\u0106\uffff\1\1\u018b\uffff\1\3\1\2";
    static final String dfa_13s = "\u0294\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\1\uffff\1\2\1\7\1\10\1\3\1\4\1\5\1\6",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\22\1\21",
            "\1\24\1\23",
            "\1\26\1\25",
            "\1\30\1\27",
            "\1\32\1\31",
            "\1\34\1\33",
            "\1\36\1\35",
            "\1\40\1\37",
            "\1\41",
            "\1\41",
            "\1\42",
            "\1\42",
            "\1\43",
            "\1\43",
            "\1\44",
            "\1\44",
            "\1\45",
            "\1\45",
            "\1\46",
            "\1\46",
            "\1\47",
            "\1\47",
            "\1\50",
            "\1\50",
            "\1\51\1\uffff\1\52",
            "\1\53\1\uffff\1\54",
            "\1\55\1\uffff\1\56",
            "\1\57\1\uffff\1\60",
            "\1\61\1\uffff\1\62",
            "\1\63\1\uffff\1\64",
            "\1\65\1\uffff\1\66",
            "\1\67\1\uffff\1\70",
            "\1\71",
            "\1\71",
            "\1\72",
            "\1\72",
            "\1\73",
            "\1\73",
            "\1\74",
            "\1\74",
            "\1\75",
            "\1\75",
            "\1\76",
            "\1\76",
            "\1\77",
            "\1\77",
            "\1\100",
            "\1\100",
            "\1\101",
            "\1\101",
            "\1\102",
            "\1\102",
            "\1\103",
            "\1\103",
            "\1\104",
            "\1\104",
            "\1\105\1\106\1\107\1\110\1\111\1\112",
            "\1\117\1\uffff\1\120\1\115\1\116\2\uffff\1\113\1\114",
            "\1\121\1\uffff\1\122\1\125\1\126\1\123\1\124",
            "\1\131\1\uffff\1\132\2\uffff\1\133\1\134\1\127\1\130",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\166\1\165",
            "\1\170\1\167",
            "\1\172\1\171",
            "\1\174\1\173",
            "\1\176\1\175",
            "\1\u0080\1\177",
            "\1\u0082\1\u0081",
            "\1\u0084\1\u0083",
            "\1\u0086\1\u0085",
            "\1\u0088\1\u0087",
            "\1\u008a\1\u0089",
            "\1\u008c\1\u008b",
            "\1\u008e\1\u008d",
            "\1\u0090\1\u008f",
            "\1\u0092\1\u0091",
            "\1\u0094\1\u0093",
            "\1\u0096\1\u0095",
            "\1\u0098\1\u0097",
            "\1\u009a\1\u0099",
            "\1\u009c\1\u009b",
            "\1\u009e\1\u009d",
            "\1\u00a0\1\u009f",
            "\1\u00a2\1\u00a1",
            "\1\u00a4\1\u00a3",
            "\1\u00a5",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bc",
            "\1\u00bd\1\uffff\1\u00be",
            "\1\u00bf\1\uffff\1\u00c0",
            "\1\u00c1\1\uffff\1\u00c2",
            "\1\u00c3\1\uffff\1\u00c4",
            "\1\u00c5\1\uffff\1\u00c6",
            "\1\u00c7\1\uffff\1\u00c8",
            "\1\u00c9\1\uffff\1\u00ca",
            "\1\u00cb\1\uffff\1\u00cc",
            "\1\u00cd\1\uffff\1\u00ce",
            "\1\u00cf\1\uffff\1\u00d0",
            "\1\u00d1\1\uffff\1\u00d2",
            "\1\u00d3\1\uffff\1\u00d4",
            "\1\u00d5\1\uffff\1\u00d6",
            "\1\u00d7\1\uffff\1\u00d8",
            "\1\u00d9\1\uffff\1\u00da",
            "\1\u00db\1\uffff\1\u00dc",
            "\1\u00dd\1\uffff\1\u00de",
            "\1\u00df\1\uffff\1\u00e0",
            "\1\u00e1\1\uffff\1\u00e2",
            "\1\u00e3\1\uffff\1\u00e4",
            "\1\u00e5\1\uffff\1\u00e6",
            "\1\u00e7\1\uffff\1\u00e8",
            "\1\u00e9\1\uffff\1\u00ea",
            "\1\u00eb\1\uffff\1\u00ec",
            "\1\u00ed",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0100",
            "\1\u0101",
            "\1\u0101",
            "\1\u0102",
            "\1\u0102",
            "\1\u0103",
            "\1\u0103",
            "\1\u0104",
            "\1\u0104",
            "\1\u0106\6\uffff\1\u0106\2\uffff\1\u0106\11\uffff\1\u0106\2\uffff\2\u0106\1\uffff\7\u0106\1\uffff\2\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\2\uffff\1\u0106\11\uffff\1\u0106\2\uffff\2\u0106\1\uffff\7\u0106\1\uffff\2\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\2\uffff\1\u0106\11\uffff\1\u0106\2\uffff\2\u0106\1\uffff\7\u0106\1\uffff\2\u0106\1\uffff\1\u0106\1\u0107",
            "\1\u0106\6\uffff\1\u0106\2\uffff\1\u0106\11\uffff\1\u0106\2\uffff\2\u0106\1\uffff\7\u0106\1\uffff\2\u0106\1\uffff\1\u0106\1\u0107",
            "\1\u0106\6\uffff\1\u0106\2\uffff\1\u0106\11\uffff\1\u0106\2\uffff\2\u0106\1\uffff\7\u0106\1\uffff\2\u0106\1\uffff\1\u0106\1\u0108",
            "\1\u0106\6\uffff\1\u0106\2\uffff\1\u0106\11\uffff\1\u0106\2\uffff\2\u0106\1\uffff\7\u0106\1\uffff\2\u0106\1\uffff\1\u0106\1\u0108",
            "\1\u0106\6\uffff\1\u0106\2\uffff\1\u0106\11\uffff\1\u0106\2\uffff\2\u0106\1\uffff\7\u0106\1\uffff\2\u0106\1\uffff\1\u0106\1\u0109",
            "\1\u0106\6\uffff\1\u0106\2\uffff\1\u0106\11\uffff\1\u0106\2\uffff\2\u0106\1\uffff\7\u0106\1\uffff\2\u0106\1\uffff\1\u0106\1\u0109",
            "\1\u0106\6\uffff\1\u0106\2\uffff\1\u0106\11\uffff\1\u0106\2\uffff\2\u0106\1\uffff\7\u0106\1\uffff\2\u0106\1\uffff\1\u0106\1\u010a",
            "\1\u0106\6\uffff\1\u0106\2\uffff\1\u0106\11\uffff\1\u0106\2\uffff\2\u0106\1\uffff\7\u0106\1\uffff\2\u0106\1\uffff\1\u0106\1\u010a",
            "\1\u0106\6\uffff\1\u0106\2\uffff\1\u0106\11\uffff\1\u0106\2\uffff\2\u0106\1\uffff\7\u0106\1\uffff\2\u0106\1\uffff\1\u0106\1\u010b",
            "\1\u0106\6\uffff\1\u0106\2\uffff\1\u0106\11\uffff\1\u0106\2\uffff\2\u0106\1\uffff\7\u0106\1\uffff\2\u0106\1\uffff\1\u0106\1\u010b",
            "\1\u0106\6\uffff\1\u0106\2\uffff\1\u0106\11\uffff\1\u0106\2\uffff\2\u0106\1\uffff\7\u0106\1\uffff\2\u0106\1\uffff\1\u0106\1\u010c",
            "\1\u0106\6\uffff\1\u0106\2\uffff\1\u0106\11\uffff\1\u0106\2\uffff\2\u0106\1\uffff\7\u0106\1\uffff\2\u0106\1\uffff\1\u0106\1\u010c",
            "\1\u0106\6\uffff\1\u0106\2\uffff\1\u0106\11\uffff\1\u0106\2\uffff\2\u0106\1\uffff\7\u0106\1\uffff\2\u0106\1\uffff\1\u0106\1\u010d",
            "\1\u0106\6\uffff\1\u0106\2\uffff\1\u0106\11\uffff\1\u0106\2\uffff\2\u0106\1\uffff\7\u0106\1\uffff\2\u0106\1\uffff\1\u0106\1\u010d",
            "\1\u0106\6\uffff\1\u0106\2\uffff\1\u0106\11\uffff\1\u0106\2\uffff\2\u0106\1\uffff\7\u0106\1\uffff\2\u0106\1\uffff\1\u0106\1\u010e",
            "\1\u0106\6\uffff\1\u0106\2\uffff\1\u0106\11\uffff\1\u0106\2\uffff\2\u0106\1\uffff\7\u0106\1\uffff\2\u0106\1\uffff\1\u0106\1\u010e",
            "\1\u0106\6\uffff\1\u0106\2\uffff\1\u0106\11\uffff\1\u0106\2\uffff\2\u0106\1\uffff\7\u0106\1\uffff\2\u0106\1\uffff\1\u0106\1\u010f",
            "\1\u0106\6\uffff\1\u0106\2\uffff\1\u0106\11\uffff\1\u0106\2\uffff\2\u0106\1\uffff\7\u0106\1\uffff\2\u0106\1\uffff\1\u0106\1\u010f",
            "\1\u0106\6\uffff\1\u0106\2\uffff\1\u0106\11\uffff\1\u0106\2\uffff\2\u0106\1\uffff\7\u0106\1\uffff\2\u0106\1\uffff\1\u0106\1\u0110",
            "\1\u0106\6\uffff\1\u0106\2\uffff\1\u0106\11\uffff\1\u0106\2\uffff\2\u0106\1\uffff\7\u0106\1\uffff\2\u0106\1\uffff\1\u0106\1\u0110",
            "\1\u0106\6\uffff\1\u0106\2\uffff\1\u0106\11\uffff\1\u0106\2\uffff\2\u0106\1\uffff\7\u0106\1\uffff\2\u0106\1\uffff\1\u0106\1\u0111",
            "\1\u0106\6\uffff\1\u0106\2\uffff\1\u0106\11\uffff\1\u0106\2\uffff\2\u0106\1\uffff\7\u0106\1\uffff\2\u0106\1\uffff\1\u0106\1\u0111",
            "\1\u0112\1\u0113\1\u0114\1\u0115",
            "",
            "\1\u0116\1\u0117\2\uffff\1\u0118\1\u0119",
            "\1\u011c\1\u011d\1\u011a\1\u011b",
            "\1\u0120\1\uffff\1\u0121\1\u011e\1\u011f",
            "\1\u0122\1\uffff\1\u0123\4\uffff\1\u0124\1\u0125",
            "\1\u0126\1\u0127\2\uffff\1\u0128\1\u0129",
            "\1\u012a\1\u012b\1\u012c\1\u012d",
            "\1\u012e\1\uffff\1\u012f\1\u0130\1\u0131",
            "\1\u0132\1\uffff\1\u0133\2\uffff\1\u0134\1\u0135",
            "\1\u0136\1\uffff\1\u0137\2\uffff\1\u0138\1\u0139",
            "\1\u013a\1\u013b\1\u013c\1\u013d",
            "\1\u013e\1\uffff\1\u013f\4\uffff\1\u0140\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0173\1\u0172",
            "\1\u0175\1\u0174",
            "\1\u0177\1\u0176",
            "\1\u0179\1\u0178",
            "\1\u017b\1\u017a",
            "\1\u017d\1\u017c",
            "\1\u017f\1\u017e",
            "\1\u0181\1\u0180",
            "\1\u0183\1\u0182",
            "\1\u0185\1\u0184",
            "\1\u0187\1\u0186",
            "\1\u0189\1\u0188",
            "\1\u018b\1\u018a",
            "\1\u018d\1\u018c",
            "\1\u018f\1\u018e",
            "\1\u0191\1\u0190",
            "\1\u0193\1\u0192",
            "\1\u0195\1\u0194",
            "\1\u0197\1\u0196",
            "\1\u0199\1\u0198",
            "\1\u019b\1\u019a",
            "\1\u019d\1\u019c",
            "\1\u019f\1\u019e",
            "\1\u01a1\1\u01a0",
            "\1\u01a3\1\u01a2",
            "\1\u01a5\1\u01a4",
            "\1\u01a7\1\u01a6",
            "\1\u01a9\1\u01a8",
            "\1\u01ab\1\u01aa",
            "\1\u01ad\1\u01ac",
            "\1\u01af\1\u01ae",
            "\1\u01b1\1\u01b0",
            "\1\u01b3\1\u01b2",
            "\1\u01b5\1\u01b4",
            "\1\u01b7\1\u01b6",
            "\1\u01b9\1\u01b8",
            "\1\u01bb\1\u01ba",
            "\1\u01bd\1\u01bc",
            "\1\u01bf\1\u01be",
            "\1\u01c1\1\u01c0",
            "\1\u01c3\1\u01c2",
            "\1\u01c5\1\u01c4",
            "\1\u01c7\1\u01c6",
            "\1\u01c9\1\u01c8",
            "\1\u01cb\1\u01ca",
            "\1\u01cd\1\u01cc",
            "\1\u01cf\1\u01ce",
            "\1\u01d1\1\u01d0",
            "\1\u01d2",
            "\1\u01d2",
            "\1\u01d3",
            "\1\u01d3",
            "\1\u01d4",
            "\1\u01d4",
            "\1\u01d5",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01d9",
            "\1\u01da",
            "\1\u01da",
            "\1\u01db",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01dc",
            "\1\u01dd",
            "\1\u01dd",
            "\1\u01de",
            "\1\u01de",
            "\1\u01df",
            "\1\u01df",
            "\1\u01e0",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e1",
            "\1\u01e2",
            "\1\u01e2",
            "\1\u01e3",
            "\1\u01e3",
            "\1\u01e4",
            "\1\u01e4",
            "\1\u01e5",
            "\1\u01e5",
            "\1\u01e6",
            "\1\u01e6",
            "\1\u01e7",
            "\1\u01e7",
            "\1\u01e8",
            "\1\u01e8",
            "\1\u01e9",
            "\1\u01e9",
            "\1\u01ea",
            "\1\u01ea",
            "\1\u01eb",
            "\1\u01eb",
            "\1\u01ec",
            "\1\u01ec",
            "\1\u01ed",
            "\1\u01ed",
            "\1\u01ee",
            "\1\u01ee",
            "\1\u01ef",
            "\1\u01ef",
            "\1\u01f0",
            "\1\u01f0",
            "\1\u01f1",
            "\1\u01f1",
            "\1\u01f2",
            "\1\u01f2",
            "\1\u01f3",
            "\1\u01f3",
            "\1\u01f4",
            "\1\u01f4",
            "\1\u01f5",
            "\1\u01f5",
            "\1\u01f6",
            "\1\u01f6",
            "\1\u01f7",
            "\1\u01f7",
            "\1\u01f8",
            "\1\u01f8",
            "\1\u01f9",
            "\1\u01f9",
            "\1\u01fa",
            "\1\u01fa",
            "\1\u01fb",
            "\1\u01fb",
            "\1\u01fc",
            "\1\u01fc",
            "\1\u01fd",
            "\1\u01fd",
            "\1\u01fe",
            "\1\u01fe",
            "\1\u01ff",
            "\1\u01ff",
            "\1\u0200",
            "\1\u0200",
            "\1\u0201",
            "\1\u0201",
            "\1\u0202\1\uffff\1\u0203",
            "\1\u0204\1\uffff\1\u0205",
            "\1\u0206\1\uffff\1\u0207",
            "\1\u0208\1\uffff\1\u0209",
            "\1\u020a\1\uffff\1\u020b",
            "\1\u020c\1\uffff\1\u020d",
            "\1\u020e\1\uffff\1\u020f",
            "\1\u0210\1\uffff\1\u0211",
            "\1\u0212\1\uffff\1\u0213",
            "\1\u0214\1\uffff\1\u0215",
            "\1\u0216\1\uffff\1\u0217",
            "\1\u0218\1\uffff\1\u0219",
            "\1\u021a\1\uffff\1\u021b",
            "\1\u021c\1\uffff\1\u021d",
            "\1\u021e\1\uffff\1\u021f",
            "\1\u0220\1\uffff\1\u0221",
            "\1\u0222\1\uffff\1\u0223",
            "\1\u0224\1\uffff\1\u0225",
            "\1\u0226\1\uffff\1\u0227",
            "\1\u0228\1\uffff\1\u0229",
            "\1\u022a\1\uffff\1\u022b",
            "\1\u022c\1\uffff\1\u022d",
            "\1\u022e\1\uffff\1\u022f",
            "\1\u0230\1\uffff\1\u0231",
            "\1\u0232\1\uffff\1\u0233",
            "\1\u0234\1\uffff\1\u0235",
            "\1\u0236\1\uffff\1\u0237",
            "\1\u0238\1\uffff\1\u0239",
            "\1\u023a\1\uffff\1\u023b",
            "\1\u023c\1\uffff\1\u023d",
            "\1\u023e\1\uffff\1\u023f",
            "\1\u0240\1\uffff\1\u0241",
            "\1\u0242\1\uffff\1\u0243",
            "\1\u0244\1\uffff\1\u0245",
            "\1\u0246\1\uffff\1\u0247",
            "\1\u0248\1\uffff\1\u0249",
            "\1\u024a\1\uffff\1\u024b",
            "\1\u024c\1\uffff\1\u024d",
            "\1\u024e\1\uffff\1\u024f",
            "\1\u0250\1\uffff\1\u0251",
            "\1\u0252\1\uffff\1\u0253",
            "\1\u0254\1\uffff\1\u0255",
            "\1\u0256\1\uffff\1\u0257",
            "\1\u0258\1\uffff\1\u0259",
            "\1\u025a\1\uffff\1\u025b",
            "\1\u025c\1\uffff\1\u025d",
            "\1\u025e\1\uffff\1\u025f",
            "\1\u0260\1\uffff\1\u0261",
            "\1\u0262",
            "\1\u0262",
            "\1\u0263",
            "\1\u0263",
            "\1\u0264",
            "\1\u0264",
            "\1\u0265",
            "\1\u0265",
            "\1\u0266",
            "\1\u0266",
            "\1\u0267",
            "\1\u0267",
            "\1\u0268",
            "\1\u0268",
            "\1\u0269",
            "\1\u0269",
            "\1\u026a",
            "\1\u026a",
            "\1\u026b",
            "\1\u026b",
            "\1\u026c",
            "\1\u026c",
            "\1\u026d",
            "\1\u026d",
            "\1\u026e",
            "\1\u026e",
            "\1\u026f",
            "\1\u026f",
            "\1\u0270",
            "\1\u0270",
            "\1\u0271",
            "\1\u0271",
            "\1\u0272",
            "\1\u0272",
            "\1\u0273",
            "\1\u0273",
            "\1\u0274",
            "\1\u0274",
            "\1\u0275",
            "\1\u0275",
            "\1\u0276",
            "\1\u0276",
            "\1\u0277",
            "\1\u0277",
            "\1\u0278",
            "\1\u0278",
            "\1\u0279",
            "\1\u0279",
            "\1\u027a",
            "\1\u027a",
            "\1\u027b",
            "\1\u027b",
            "\1\u027c",
            "\1\u027c",
            "\1\u027d",
            "\1\u027d",
            "\1\u027e",
            "\1\u027e",
            "\1\u027f",
            "\1\u027f",
            "\1\u0280",
            "\1\u0280",
            "\1\u0281",
            "\1\u0281",
            "\1\u0282",
            "\1\u0282",
            "\1\u0283",
            "\1\u0283",
            "\1\u0284",
            "\1\u0284",
            "\1\u0285",
            "\1\u0285",
            "\1\u0286",
            "\1\u0286",
            "\1\u0287",
            "\1\u0287",
            "\1\u0288",
            "\1\u0288",
            "\1\u0289",
            "\1\u0289",
            "\1\u028a",
            "\1\u028a",
            "\1\u028b",
            "\1\u028b",
            "\1\u028c",
            "\1\u028c",
            "\1\u028d",
            "\1\u028d",
            "\1\u028e",
            "\1\u028e",
            "\1\u028f",
            "\1\u028f",
            "\1\u0290",
            "\1\u0290",
            "\1\u0291",
            "\1\u0291",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "\1\u0293\6\uffff\1\u0293\2\uffff\1\u0293\11\uffff\1\u0293\2\uffff\2\u0293\1\uffff\7\u0293\1\uffff\2\u0293\1\uffff\1\u0293\1\u0292",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "2346:2: (this_Parallele2_0= ruleParallele2 | this_Parallele3_1= ruleParallele3 | this_Parallele4_2= ruleParallele4 )";
        }
    }
    static final String dfa_15s = "\121\uffff";
    static final String dfa_16s = "\1\36\10\33\10\6\20\37\10\4\20\34\10\54\1\41\3\36\14\uffff";
    static final String dfa_17s = "\1\46\10\33\10\7\20\37\10\6\20\34\10\54\2\46\1\44\1\46\14\uffff";
    static final String dfa_18s = "\105\uffff\1\1\1\3\1\2\1\5\1\4\1\6\1\7\1\11\1\10\1\13\1\12\1\14";
    static final String dfa_19s = "\121\uffff}>";
    static final String[] dfa_20s = {
            "\1\1\1\uffff\1\2\1\7\1\10\1\3\1\4\1\5\1\6",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\22\1\21",
            "\1\24\1\23",
            "\1\26\1\25",
            "\1\30\1\27",
            "\1\32\1\31",
            "\1\34\1\33",
            "\1\36\1\35",
            "\1\40\1\37",
            "\1\41",
            "\1\41",
            "\1\42",
            "\1\42",
            "\1\43",
            "\1\43",
            "\1\44",
            "\1\44",
            "\1\45",
            "\1\45",
            "\1\46",
            "\1\46",
            "\1\47",
            "\1\47",
            "\1\50",
            "\1\50",
            "\1\51\1\uffff\1\52",
            "\1\53\1\uffff\1\54",
            "\1\55\1\uffff\1\56",
            "\1\57\1\uffff\1\60",
            "\1\61\1\uffff\1\62",
            "\1\63\1\uffff\1\64",
            "\1\65\1\uffff\1\66",
            "\1\67\1\uffff\1\70",
            "\1\71",
            "\1\71",
            "\1\72",
            "\1\72",
            "\1\73",
            "\1\73",
            "\1\74",
            "\1\74",
            "\1\75",
            "\1\75",
            "\1\76",
            "\1\76",
            "\1\77",
            "\1\77",
            "\1\100",
            "\1\100",
            "\1\101",
            "\1\101",
            "\1\102",
            "\1\102",
            "\1\103",
            "\1\103",
            "\1\104",
            "\1\104",
            "\2\107\2\105\2\106",
            "\1\110\1\uffff\1\110\2\111\2\uffff\2\112",
            "\1\113\1\uffff\1\113\2\115\2\114",
            "\1\117\1\uffff\1\117\2\uffff\2\120\2\116",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = dfa_15;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "2391:2: ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) )";
        }
    }
    static final String dfa_21s = "\u0129\uffff";
    static final String dfa_22s = "\1\36\10\33\10\6\20\37\10\4\20\34\10\54\2\36\1\41\1\36\30\33\30\6\60\37\30\4\60\34\30\54\2\36\1\43\2\36\3\41\1\43\1\36\1\41\1\36\30\uffff";
    static final String dfa_23s = "\1\46\10\33\10\7\20\37\10\6\20\34\10\54\3\46\1\44\30\33\30\7\60\37\30\6\60\34\30\54\1\44\2\46\1\42\2\46\1\44\2\46\1\42\2\44\30\uffff";
    static final String dfa_24s = "\u0111\uffff\1\6\1\5\1\2\1\1\1\3\1\4\1\14\1\13\1\7\1\10\1\11\1\12\1\22\1\21\1\17\1\20\1\15\1\16\1\27\1\30\1\26\1\25\1\23\1\24";
    static final String dfa_25s = "\u0129\uffff}>";
    static final String[] dfa_26s = {
            "\1\5\1\uffff\1\6\1\1\1\2\1\3\1\4\1\7\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\22\1\21",
            "\1\24\1\23",
            "\1\26\1\25",
            "\1\30\1\27",
            "\1\32\1\31",
            "\1\34\1\33",
            "\1\36\1\35",
            "\1\40\1\37",
            "\1\41",
            "\1\41",
            "\1\42",
            "\1\42",
            "\1\43",
            "\1\43",
            "\1\44",
            "\1\44",
            "\1\45",
            "\1\45",
            "\1\46",
            "\1\46",
            "\1\47",
            "\1\47",
            "\1\50",
            "\1\50",
            "\1\51\1\uffff\1\52",
            "\1\53\1\uffff\1\54",
            "\1\55\1\uffff\1\56",
            "\1\57\1\uffff\1\60",
            "\1\61\1\uffff\1\62",
            "\1\63\1\uffff\1\64",
            "\1\65\1\uffff\1\66",
            "\1\67\1\uffff\1\70",
            "\1\71",
            "\1\71",
            "\1\72",
            "\1\72",
            "\1\73",
            "\1\73",
            "\1\74",
            "\1\74",
            "\1\75",
            "\1\75",
            "\1\76",
            "\1\76",
            "\1\77",
            "\1\77",
            "\1\100",
            "\1\100",
            "\1\101",
            "\1\101",
            "\1\102",
            "\1\102",
            "\1\103",
            "\1\103",
            "\1\104",
            "\1\104",
            "\1\111\1\uffff\1\112\2\uffff\1\107\1\110\1\105\1\106",
            "\1\117\1\uffff\1\120\1\115\1\116\2\uffff\1\113\1\114",
            "\1\125\1\126\1\123\1\124\1\121\1\122",
            "\1\131\1\uffff\1\132\1\133\1\134\1\127\1\130",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\166\1\165",
            "\1\170\1\167",
            "\1\172\1\171",
            "\1\174\1\173",
            "\1\176\1\175",
            "\1\u0080\1\177",
            "\1\u0082\1\u0081",
            "\1\u0084\1\u0083",
            "\1\u0086\1\u0085",
            "\1\u0088\1\u0087",
            "\1\u008a\1\u0089",
            "\1\u008c\1\u008b",
            "\1\u008e\1\u008d",
            "\1\u0090\1\u008f",
            "\1\u0092\1\u0091",
            "\1\u0094\1\u0093",
            "\1\u0096\1\u0095",
            "\1\u0098\1\u0097",
            "\1\u009a\1\u0099",
            "\1\u009c\1\u009b",
            "\1\u009e\1\u009d",
            "\1\u00a0\1\u009f",
            "\1\u00a2\1\u00a1",
            "\1\u00a4\1\u00a3",
            "\1\u00a5",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bc",
            "\1\u00bd\1\uffff\1\u00be",
            "\1\u00bf\1\uffff\1\u00c0",
            "\1\u00c1\1\uffff\1\u00c2",
            "\1\u00c3\1\uffff\1\u00c4",
            "\1\u00c5\1\uffff\1\u00c6",
            "\1\u00c7\1\uffff\1\u00c8",
            "\1\u00c9\1\uffff\1\u00ca",
            "\1\u00cb\1\uffff\1\u00cc",
            "\1\u00cd\1\uffff\1\u00ce",
            "\1\u00cf\1\uffff\1\u00d0",
            "\1\u00d1\1\uffff\1\u00d2",
            "\1\u00d3\1\uffff\1\u00d4",
            "\1\u00d5\1\uffff\1\u00d6",
            "\1\u00d7\1\uffff\1\u00d8",
            "\1\u00d9\1\uffff\1\u00da",
            "\1\u00db\1\uffff\1\u00dc",
            "\1\u00dd\1\uffff\1\u00de",
            "\1\u00df\1\uffff\1\u00e0",
            "\1\u00e1\1\uffff\1\u00e2",
            "\1\u00e3\1\uffff\1\u00e4",
            "\1\u00e5\1\uffff\1\u00e6",
            "\1\u00e7\1\uffff\1\u00e8",
            "\1\u00e9\1\uffff\1\u00ea",
            "\1\u00eb\1\uffff\1\u00ec",
            "\1\u00ed",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0100",
            "\1\u0101",
            "\1\u0101",
            "\1\u0102",
            "\1\u0102",
            "\1\u0103",
            "\1\u0103",
            "\1\u0104",
            "\1\u0104",
            "\1\u0105",
            "\1\u0105",
            "\1\u0106",
            "\1\u0106",
            "\1\u0107",
            "\1\u0107",
            "\1\u0108",
            "\1\u0108",
            "\1\u0109",
            "\1\u0109",
            "\1\u010a",
            "\1\u010a",
            "\1\u010b",
            "\1\u010b",
            "\1\u010c",
            "\1\u010c",
            "\1\u010d",
            "\1\u010d",
            "\1\u010e",
            "\1\u010e",
            "\1\u010f",
            "\1\u010f",
            "\1\u0110",
            "\1\u0110",
            "\1\u0112\1\uffff\1\u0112\2\uffff\2\u0111",
            "\1\u0114\1\uffff\1\u0114\4\uffff\2\u0113",
            "\2\u0115\2\u0116",
            "\1\u0117\1\uffff\1\u0117\2\u0118",
            "\1\u0119\1\uffff\1\u0119\4\uffff\2\u011a",
            "\2\u011b\2\uffff\2\u011c",
            "\2\u011d\2\u011e",
            "\2\u011f\2\uffff\2\u0120",
            "\2\u0121\2\u0122",
            "\1\u0123\1\uffff\1\u0123\2\u0124",
            "\2\u0126\2\u0125",
            "\1\u0127\1\uffff\1\u0127\2\uffff\2\u0128",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = dfa_21;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "2949:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) )";
        }
    }
    static final String dfa_27s = "\1\36\10\33\10\6\20\37\10\4\20\34\10\54\2\36\1\41\1\36\30\33\30\6\60\37\30\4\60\34\30\54\1\36\1\43\2\36\1\41\1\36\2\41\1\43\2\36\1\41\30\uffff";
    static final String dfa_28s = "\1\46\10\33\10\7\20\37\10\6\20\34\10\54\3\46\1\44\30\33\30\7\60\37\30\6\60\34\30\54\2\46\1\44\2\46\1\42\1\46\1\44\1\46\1\42\2\44\30\uffff";
    static final String dfa_29s = "\u0111\uffff\1\2\1\1\1\3\1\4\1\5\1\6\1\7\1\10\1\12\1\11\1\13\1\14\1\17\1\20\1\22\1\21\1\15\1\16\1\27\1\30\1\23\1\24\1\25\1\26";
    static final String[] dfa_30s = {
            "\1\5\1\uffff\1\6\1\1\1\2\1\3\1\4\1\7\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\22\1\21",
            "\1\24\1\23",
            "\1\26\1\25",
            "\1\30\1\27",
            "\1\32\1\31",
            "\1\34\1\33",
            "\1\36\1\35",
            "\1\40\1\37",
            "\1\41",
            "\1\41",
            "\1\42",
            "\1\42",
            "\1\43",
            "\1\43",
            "\1\44",
            "\1\44",
            "\1\45",
            "\1\45",
            "\1\46",
            "\1\46",
            "\1\47",
            "\1\47",
            "\1\50",
            "\1\50",
            "\1\51\1\uffff\1\52",
            "\1\53\1\uffff\1\54",
            "\1\55\1\uffff\1\56",
            "\1\57\1\uffff\1\60",
            "\1\61\1\uffff\1\62",
            "\1\63\1\uffff\1\64",
            "\1\65\1\uffff\1\66",
            "\1\67\1\uffff\1\70",
            "\1\71",
            "\1\71",
            "\1\72",
            "\1\72",
            "\1\73",
            "\1\73",
            "\1\74",
            "\1\74",
            "\1\75",
            "\1\75",
            "\1\76",
            "\1\76",
            "\1\77",
            "\1\77",
            "\1\100",
            "\1\100",
            "\1\101",
            "\1\101",
            "\1\102",
            "\1\102",
            "\1\103",
            "\1\103",
            "\1\104",
            "\1\104",
            "\1\107\1\uffff\1\110\2\uffff\1\105\1\106\1\111\1\112",
            "\1\115\1\uffff\1\116\1\113\1\114\2\uffff\1\117\1\120",
            "\1\125\1\126\1\121\1\122\1\123\1\124",
            "\1\133\1\uffff\1\134\1\131\1\132\1\127\1\130",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\166\1\165",
            "\1\170\1\167",
            "\1\172\1\171",
            "\1\174\1\173",
            "\1\176\1\175",
            "\1\u0080\1\177",
            "\1\u0082\1\u0081",
            "\1\u0084\1\u0083",
            "\1\u0086\1\u0085",
            "\1\u0088\1\u0087",
            "\1\u008a\1\u0089",
            "\1\u008c\1\u008b",
            "\1\u008e\1\u008d",
            "\1\u0090\1\u008f",
            "\1\u0092\1\u0091",
            "\1\u0094\1\u0093",
            "\1\u0096\1\u0095",
            "\1\u0098\1\u0097",
            "\1\u009a\1\u0099",
            "\1\u009c\1\u009b",
            "\1\u009e\1\u009d",
            "\1\u00a0\1\u009f",
            "\1\u00a2\1\u00a1",
            "\1\u00a4\1\u00a3",
            "\1\u00a5",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bc",
            "\1\u00bd\1\uffff\1\u00be",
            "\1\u00bf\1\uffff\1\u00c0",
            "\1\u00c1\1\uffff\1\u00c2",
            "\1\u00c3\1\uffff\1\u00c4",
            "\1\u00c5\1\uffff\1\u00c6",
            "\1\u00c7\1\uffff\1\u00c8",
            "\1\u00c9\1\uffff\1\u00ca",
            "\1\u00cb\1\uffff\1\u00cc",
            "\1\u00cd\1\uffff\1\u00ce",
            "\1\u00cf\1\uffff\1\u00d0",
            "\1\u00d1\1\uffff\1\u00d2",
            "\1\u00d3\1\uffff\1\u00d4",
            "\1\u00d5\1\uffff\1\u00d6",
            "\1\u00d7\1\uffff\1\u00d8",
            "\1\u00d9\1\uffff\1\u00da",
            "\1\u00db\1\uffff\1\u00dc",
            "\1\u00dd\1\uffff\1\u00de",
            "\1\u00df\1\uffff\1\u00e0",
            "\1\u00e1\1\uffff\1\u00e2",
            "\1\u00e3\1\uffff\1\u00e4",
            "\1\u00e5\1\uffff\1\u00e6",
            "\1\u00e7\1\uffff\1\u00e8",
            "\1\u00e9\1\uffff\1\u00ea",
            "\1\u00eb\1\uffff\1\u00ec",
            "\1\u00ed",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0100",
            "\1\u0101",
            "\1\u0101",
            "\1\u0102",
            "\1\u0102",
            "\1\u0103",
            "\1\u0103",
            "\1\u0104",
            "\1\u0104",
            "\1\u0105",
            "\1\u0105",
            "\1\u0106",
            "\1\u0106",
            "\1\u0107",
            "\1\u0107",
            "\1\u0108",
            "\1\u0108",
            "\1\u0109",
            "\1\u0109",
            "\1\u010a",
            "\1\u010a",
            "\1\u010b",
            "\1\u010b",
            "\1\u010c",
            "\1\u010c",
            "\1\u010d",
            "\1\u010d",
            "\1\u010e",
            "\1\u010e",
            "\1\u010f",
            "\1\u010f",
            "\1\u0110",
            "\1\u0110",
            "\1\u0112\1\uffff\1\u0112\4\uffff\2\u0111",
            "\2\u0113\2\u0114",
            "\1\u0115\1\uffff\1\u0115\2\uffff\2\u0116",
            "\1\u0117\1\uffff\1\u0117\4\uffff\2\u0118",
            "\2\u011a\2\uffff\2\u0119",
            "\1\u011c\1\uffff\1\u011c\2\u011b",
            "\2\u011d\2\uffff\2\u011e",
            "\2\u011f\2\u0120",
            "\2\u0121\2\u0122",
            "\1\u0123\1\uffff\1\u0123\2\u0124",
            "\1\u0125\1\uffff\1\u0125\2\uffff\2\u0126",
            "\2\u0127\2\u0128",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[][] dfa_30 = unpackEncodedStringArray(dfa_30s);

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = dfa_21;
            this.eof = dfa_21;
            this.min = dfa_27;
            this.max = dfa_28;
            this.accept = dfa_29;
            this.special = dfa_25;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "4599:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) ) | ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) ) | ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) ) | ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) ) | ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) ) | ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) ) | ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) ) | ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) ) | ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) ) | ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) ) | ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) ) | ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) ) | ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) ) | ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) ) | ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) ) | ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) ) | ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) ) | ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) ) | ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) ) | ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) ) | ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) ) | ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) ) | ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) ) | ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000122000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000008000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000B7F60002040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004012000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000B7F64012040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000140000000L});

}