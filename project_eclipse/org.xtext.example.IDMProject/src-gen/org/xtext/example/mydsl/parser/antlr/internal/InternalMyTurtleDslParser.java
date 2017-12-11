package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyTurtleDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyTurtleDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_POURCENT", "RULE_INCLUDE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\n'", "'main'", "'{'", "'}'", "'import'", "'<'", "'>'", "'define'", "'vitesse_hauteur_max'", "'vitesse_deplacement_max'", "'vitesse_rotation_max'", "'hauteur_max'", "'eloignement_max'", "'decoller'", "'('", "')'", "'atterrir'", "'monter'", "','", "'descendre'", "'avancer'", "'reculer'", "'gauche'", "'droite'", "'rotation_gauche'", "'rotation_droite'", "'func'", "'Pourcent'", "'='", "'Seconde'", "'&'"
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int RULE_INCLUDE=5;

    // delegates
    // delegators


        public InternalMyTurtleDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyTurtleDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyTurtleDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyTurtleDsl.g"; }



     	private MyTurtleDslGrammarAccess grammarAccess;

        public InternalMyTurtleDslParser(TokenStream input, MyTurtleDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyTurtleDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyTurtleDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyTurtleDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyTurtleDsl.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalMyTurtleDsl.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* (otherlv_1= '\\n' )* ( (lv_pvhm_2_0= rulePourcent_vitesse_hauteur_max ) ) (otherlv_3= '\\n' )* ( (lv_pvdm_4_0= rulePourcent_vitesse_deplacement_max ) ) (otherlv_5= '\\n' )* ( (lv_pvrm_6_0= rulePourcent_vitesse_rotation_max ) ) (otherlv_7= '\\n' )* ( (lv_hm_8_0= ruleHauteur_max ) ) (otherlv_9= '\\n' )* ( (lv_em_10_0= ruleEloignement_max ) ) (otherlv_11= '\\n' )* ( (lv_m_12_0= ruleMain ) ) ( (lv_fonctions_13_0= ruleFonctionDecl ) )* (otherlv_14= '\\n' )* ) ;
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
            // InternalMyTurtleDsl.g:77:2: ( ( ( (lv_imports_0_0= ruleImport ) )* (otherlv_1= '\\n' )* ( (lv_pvhm_2_0= rulePourcent_vitesse_hauteur_max ) ) (otherlv_3= '\\n' )* ( (lv_pvdm_4_0= rulePourcent_vitesse_deplacement_max ) ) (otherlv_5= '\\n' )* ( (lv_pvrm_6_0= rulePourcent_vitesse_rotation_max ) ) (otherlv_7= '\\n' )* ( (lv_hm_8_0= ruleHauteur_max ) ) (otherlv_9= '\\n' )* ( (lv_em_10_0= ruleEloignement_max ) ) (otherlv_11= '\\n' )* ( (lv_m_12_0= ruleMain ) ) ( (lv_fonctions_13_0= ruleFonctionDecl ) )* (otherlv_14= '\\n' )* ) )
            // InternalMyTurtleDsl.g:78:2: ( ( (lv_imports_0_0= ruleImport ) )* (otherlv_1= '\\n' )* ( (lv_pvhm_2_0= rulePourcent_vitesse_hauteur_max ) ) (otherlv_3= '\\n' )* ( (lv_pvdm_4_0= rulePourcent_vitesse_deplacement_max ) ) (otherlv_5= '\\n' )* ( (lv_pvrm_6_0= rulePourcent_vitesse_rotation_max ) ) (otherlv_7= '\\n' )* ( (lv_hm_8_0= ruleHauteur_max ) ) (otherlv_9= '\\n' )* ( (lv_em_10_0= ruleEloignement_max ) ) (otherlv_11= '\\n' )* ( (lv_m_12_0= ruleMain ) ) ( (lv_fonctions_13_0= ruleFonctionDecl ) )* (otherlv_14= '\\n' )* )
            {
            // InternalMyTurtleDsl.g:78:2: ( ( (lv_imports_0_0= ruleImport ) )* (otherlv_1= '\\n' )* ( (lv_pvhm_2_0= rulePourcent_vitesse_hauteur_max ) ) (otherlv_3= '\\n' )* ( (lv_pvdm_4_0= rulePourcent_vitesse_deplacement_max ) ) (otherlv_5= '\\n' )* ( (lv_pvrm_6_0= rulePourcent_vitesse_rotation_max ) ) (otherlv_7= '\\n' )* ( (lv_hm_8_0= ruleHauteur_max ) ) (otherlv_9= '\\n' )* ( (lv_em_10_0= ruleEloignement_max ) ) (otherlv_11= '\\n' )* ( (lv_m_12_0= ruleMain ) ) ( (lv_fonctions_13_0= ruleFonctionDecl ) )* (otherlv_14= '\\n' )* )
            // InternalMyTurtleDsl.g:79:3: ( (lv_imports_0_0= ruleImport ) )* (otherlv_1= '\\n' )* ( (lv_pvhm_2_0= rulePourcent_vitesse_hauteur_max ) ) (otherlv_3= '\\n' )* ( (lv_pvdm_4_0= rulePourcent_vitesse_deplacement_max ) ) (otherlv_5= '\\n' )* ( (lv_pvrm_6_0= rulePourcent_vitesse_rotation_max ) ) (otherlv_7= '\\n' )* ( (lv_hm_8_0= ruleHauteur_max ) ) (otherlv_9= '\\n' )* ( (lv_em_10_0= ruleEloignement_max ) ) (otherlv_11= '\\n' )* ( (lv_m_12_0= ruleMain ) ) ( (lv_fonctions_13_0= ruleFonctionDecl ) )* (otherlv_14= '\\n' )*
            {
            // InternalMyTurtleDsl.g:79:3: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:80:4: (lv_imports_0_0= ruleImport )
            	    {
            	    // InternalMyTurtleDsl.g:80:4: (lv_imports_0_0= ruleImport )
            	    // InternalMyTurtleDsl.g:81:5: lv_imports_0_0= ruleImport
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
            	    						"org.xtext.example.mydsl.MyTurtleDsl.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyTurtleDsl.g:98:3: (otherlv_1= '\\n' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:99:4: otherlv_1= '\\n'
            	    {
            	    otherlv_1=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLineFeedKeyword_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalMyTurtleDsl.g:104:3: ( (lv_pvhm_2_0= rulePourcent_vitesse_hauteur_max ) )
            // InternalMyTurtleDsl.g:105:4: (lv_pvhm_2_0= rulePourcent_vitesse_hauteur_max )
            {
            // InternalMyTurtleDsl.g:105:4: (lv_pvhm_2_0= rulePourcent_vitesse_hauteur_max )
            // InternalMyTurtleDsl.g:106:5: lv_pvhm_2_0= rulePourcent_vitesse_hauteur_max
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
            						"org.xtext.example.mydsl.MyTurtleDsl.Pourcent_vitesse_hauteur_max");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyTurtleDsl.g:123:3: (otherlv_3= '\\n' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:124:4: otherlv_3= '\\n'
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getModelAccess().getLineFeedKeyword_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalMyTurtleDsl.g:129:3: ( (lv_pvdm_4_0= rulePourcent_vitesse_deplacement_max ) )
            // InternalMyTurtleDsl.g:130:4: (lv_pvdm_4_0= rulePourcent_vitesse_deplacement_max )
            {
            // InternalMyTurtleDsl.g:130:4: (lv_pvdm_4_0= rulePourcent_vitesse_deplacement_max )
            // InternalMyTurtleDsl.g:131:5: lv_pvdm_4_0= rulePourcent_vitesse_deplacement_max
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
            						"org.xtext.example.mydsl.MyTurtleDsl.Pourcent_vitesse_deplacement_max");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyTurtleDsl.g:148:3: (otherlv_5= '\\n' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:149:4: otherlv_5= '\\n'
            	    {
            	    otherlv_5=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_5, grammarAccess.getModelAccess().getLineFeedKeyword_5());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalMyTurtleDsl.g:154:3: ( (lv_pvrm_6_0= rulePourcent_vitesse_rotation_max ) )
            // InternalMyTurtleDsl.g:155:4: (lv_pvrm_6_0= rulePourcent_vitesse_rotation_max )
            {
            // InternalMyTurtleDsl.g:155:4: (lv_pvrm_6_0= rulePourcent_vitesse_rotation_max )
            // InternalMyTurtleDsl.g:156:5: lv_pvrm_6_0= rulePourcent_vitesse_rotation_max
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
            						"org.xtext.example.mydsl.MyTurtleDsl.Pourcent_vitesse_rotation_max");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyTurtleDsl.g:173:3: (otherlv_7= '\\n' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:174:4: otherlv_7= '\\n'
            	    {
            	    otherlv_7=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_7, grammarAccess.getModelAccess().getLineFeedKeyword_7());
            	    			

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalMyTurtleDsl.g:179:3: ( (lv_hm_8_0= ruleHauteur_max ) )
            // InternalMyTurtleDsl.g:180:4: (lv_hm_8_0= ruleHauteur_max )
            {
            // InternalMyTurtleDsl.g:180:4: (lv_hm_8_0= ruleHauteur_max )
            // InternalMyTurtleDsl.g:181:5: lv_hm_8_0= ruleHauteur_max
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
            						"org.xtext.example.mydsl.MyTurtleDsl.Hauteur_max");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyTurtleDsl.g:198:3: (otherlv_9= '\\n' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:199:4: otherlv_9= '\\n'
            	    {
            	    otherlv_9=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_9, grammarAccess.getModelAccess().getLineFeedKeyword_9());
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalMyTurtleDsl.g:204:3: ( (lv_em_10_0= ruleEloignement_max ) )
            // InternalMyTurtleDsl.g:205:4: (lv_em_10_0= ruleEloignement_max )
            {
            // InternalMyTurtleDsl.g:205:4: (lv_em_10_0= ruleEloignement_max )
            // InternalMyTurtleDsl.g:206:5: lv_em_10_0= ruleEloignement_max
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
            						"org.xtext.example.mydsl.MyTurtleDsl.Eloignement_max");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyTurtleDsl.g:223:3: (otherlv_11= '\\n' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==13) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:224:4: otherlv_11= '\\n'
            	    {
            	    otherlv_11=(Token)match(input,13,FOLLOW_5); 

            	    				newLeafNode(otherlv_11, grammarAccess.getModelAccess().getLineFeedKeyword_11());
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalMyTurtleDsl.g:229:3: ( (lv_m_12_0= ruleMain ) )
            // InternalMyTurtleDsl.g:230:4: (lv_m_12_0= ruleMain )
            {
            // InternalMyTurtleDsl.g:230:4: (lv_m_12_0= ruleMain )
            // InternalMyTurtleDsl.g:231:5: lv_m_12_0= ruleMain
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
            						"org.xtext.example.mydsl.MyTurtleDsl.Main");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyTurtleDsl.g:248:3: ( (lv_fonctions_13_0= ruleFonctionDecl ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==39) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:249:4: (lv_fonctions_13_0= ruleFonctionDecl )
            	    {
            	    // InternalMyTurtleDsl.g:249:4: (lv_fonctions_13_0= ruleFonctionDecl )
            	    // InternalMyTurtleDsl.g:250:5: lv_fonctions_13_0= ruleFonctionDecl
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
            	    						"org.xtext.example.mydsl.MyTurtleDsl.FonctionDecl");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalMyTurtleDsl.g:267:3: (otherlv_14= '\\n' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==13) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:268:4: otherlv_14= '\\n'
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
    // InternalMyTurtleDsl.g:277:1: entryRuleMain returns [EObject current=null] : iv_ruleMain= ruleMain EOF ;
    public final EObject entryRuleMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMain = null;


        try {
            // InternalMyTurtleDsl.g:277:45: (iv_ruleMain= ruleMain EOF )
            // InternalMyTurtleDsl.g:278:2: iv_ruleMain= ruleMain EOF
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
    // InternalMyTurtleDsl.g:284:1: ruleMain returns [EObject current=null] : (otherlv_0= 'main' otherlv_1= '{' ruleStart (otherlv_3= '\\n' )* ( ( (lv_SeconDec_4_0= ruleIntDecl ) ) | ( (lv_PourDec_5_0= rulePourcentDecl ) ) | ( (lv_statements_6_0= ruleStatement ) ) | ( (lv_fonctions_7_0= ruleFonctionCall ) ) | ( ( (lv_parallele_8_1= ruleParallele2 | lv_parallele_8_2= ruleParallele3 ) ) ) )* (otherlv_9= '\\n' )* ruleEnd (otherlv_11= '\\n' )* otherlv_12= '}' (otherlv_13= '\\n' )* ) ;
    public final EObject ruleMain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_SeconDec_4_0 = null;

        EObject lv_PourDec_5_0 = null;

        EObject lv_statements_6_0 = null;

        EObject lv_fonctions_7_0 = null;

        EObject lv_parallele_8_1 = null;

        EObject lv_parallele_8_2 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:290:2: ( (otherlv_0= 'main' otherlv_1= '{' ruleStart (otherlv_3= '\\n' )* ( ( (lv_SeconDec_4_0= ruleIntDecl ) ) | ( (lv_PourDec_5_0= rulePourcentDecl ) ) | ( (lv_statements_6_0= ruleStatement ) ) | ( (lv_fonctions_7_0= ruleFonctionCall ) ) | ( ( (lv_parallele_8_1= ruleParallele2 | lv_parallele_8_2= ruleParallele3 ) ) ) )* (otherlv_9= '\\n' )* ruleEnd (otherlv_11= '\\n' )* otherlv_12= '}' (otherlv_13= '\\n' )* ) )
            // InternalMyTurtleDsl.g:291:2: (otherlv_0= 'main' otherlv_1= '{' ruleStart (otherlv_3= '\\n' )* ( ( (lv_SeconDec_4_0= ruleIntDecl ) ) | ( (lv_PourDec_5_0= rulePourcentDecl ) ) | ( (lv_statements_6_0= ruleStatement ) ) | ( (lv_fonctions_7_0= ruleFonctionCall ) ) | ( ( (lv_parallele_8_1= ruleParallele2 | lv_parallele_8_2= ruleParallele3 ) ) ) )* (otherlv_9= '\\n' )* ruleEnd (otherlv_11= '\\n' )* otherlv_12= '}' (otherlv_13= '\\n' )* )
            {
            // InternalMyTurtleDsl.g:291:2: (otherlv_0= 'main' otherlv_1= '{' ruleStart (otherlv_3= '\\n' )* ( ( (lv_SeconDec_4_0= ruleIntDecl ) ) | ( (lv_PourDec_5_0= rulePourcentDecl ) ) | ( (lv_statements_6_0= ruleStatement ) ) | ( (lv_fonctions_7_0= ruleFonctionCall ) ) | ( ( (lv_parallele_8_1= ruleParallele2 | lv_parallele_8_2= ruleParallele3 ) ) ) )* (otherlv_9= '\\n' )* ruleEnd (otherlv_11= '\\n' )* otherlv_12= '}' (otherlv_13= '\\n' )* )
            // InternalMyTurtleDsl.g:292:3: otherlv_0= 'main' otherlv_1= '{' ruleStart (otherlv_3= '\\n' )* ( ( (lv_SeconDec_4_0= ruleIntDecl ) ) | ( (lv_PourDec_5_0= rulePourcentDecl ) ) | ( (lv_statements_6_0= ruleStatement ) ) | ( (lv_fonctions_7_0= ruleFonctionCall ) ) | ( ( (lv_parallele_8_1= ruleParallele2 | lv_parallele_8_2= ruleParallele3 ) ) ) )* (otherlv_9= '\\n' )* ruleEnd (otherlv_11= '\\n' )* otherlv_12= '}' (otherlv_13= '\\n' )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getMainAccess().getMainKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getMainAccess().getLeftCurlyBracketKeyword_1());
            		

            			newCompositeNode(grammarAccess.getMainAccess().getStartParserRuleCall_2());
            		
            pushFollow(FOLLOW_10);
            ruleStart();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalMyTurtleDsl.g:307:3: (otherlv_3= '\\n' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==13) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:308:4: otherlv_3= '\\n'
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_10); 

            	    				newLeafNode(otherlv_3, grammarAccess.getMainAccess().getLineFeedKeyword_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalMyTurtleDsl.g:313:3: ( ( (lv_SeconDec_4_0= ruleIntDecl ) ) | ( (lv_PourDec_5_0= rulePourcentDecl ) ) | ( (lv_statements_6_0= ruleStatement ) ) | ( (lv_fonctions_7_0= ruleFonctionCall ) ) | ( ( (lv_parallele_8_1= ruleParallele2 | lv_parallele_8_2= ruleParallele3 ) ) ) )*
            loop12:
            do {
                int alt12=6;
                alt12 = dfa12.predict(input);
                switch (alt12) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:314:4: ( (lv_SeconDec_4_0= ruleIntDecl ) )
            	    {
            	    // InternalMyTurtleDsl.g:314:4: ( (lv_SeconDec_4_0= ruleIntDecl ) )
            	    // InternalMyTurtleDsl.g:315:5: (lv_SeconDec_4_0= ruleIntDecl )
            	    {
            	    // InternalMyTurtleDsl.g:315:5: (lv_SeconDec_4_0= ruleIntDecl )
            	    // InternalMyTurtleDsl.g:316:6: lv_SeconDec_4_0= ruleIntDecl
            	    {

            	    						newCompositeNode(grammarAccess.getMainAccess().getSeconDecIntDeclParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_SeconDec_4_0=ruleIntDecl();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMainRule());
            	    						}
            	    						add(
            	    							current,
            	    							"SeconDec",
            	    							lv_SeconDec_4_0,
            	    							"org.xtext.example.mydsl.MyTurtleDsl.IntDecl");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyTurtleDsl.g:334:4: ( (lv_PourDec_5_0= rulePourcentDecl ) )
            	    {
            	    // InternalMyTurtleDsl.g:334:4: ( (lv_PourDec_5_0= rulePourcentDecl ) )
            	    // InternalMyTurtleDsl.g:335:5: (lv_PourDec_5_0= rulePourcentDecl )
            	    {
            	    // InternalMyTurtleDsl.g:335:5: (lv_PourDec_5_0= rulePourcentDecl )
            	    // InternalMyTurtleDsl.g:336:6: lv_PourDec_5_0= rulePourcentDecl
            	    {

            	    						newCompositeNode(grammarAccess.getMainAccess().getPourDecPourcentDeclParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_PourDec_5_0=rulePourcentDecl();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMainRule());
            	    						}
            	    						add(
            	    							current,
            	    							"PourDec",
            	    							lv_PourDec_5_0,
            	    							"org.xtext.example.mydsl.MyTurtleDsl.PourcentDecl");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyTurtleDsl.g:354:4: ( (lv_statements_6_0= ruleStatement ) )
            	    {
            	    // InternalMyTurtleDsl.g:354:4: ( (lv_statements_6_0= ruleStatement ) )
            	    // InternalMyTurtleDsl.g:355:5: (lv_statements_6_0= ruleStatement )
            	    {
            	    // InternalMyTurtleDsl.g:355:5: (lv_statements_6_0= ruleStatement )
            	    // InternalMyTurtleDsl.g:356:6: lv_statements_6_0= ruleStatement
            	    {

            	    						newCompositeNode(grammarAccess.getMainAccess().getStatementsStatementParserRuleCall_4_2_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_statements_6_0=ruleStatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMainRule());
            	    						}
            	    						add(
            	    							current,
            	    							"statements",
            	    							lv_statements_6_0,
            	    							"org.xtext.example.mydsl.MyTurtleDsl.Statement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMyTurtleDsl.g:374:4: ( (lv_fonctions_7_0= ruleFonctionCall ) )
            	    {
            	    // InternalMyTurtleDsl.g:374:4: ( (lv_fonctions_7_0= ruleFonctionCall ) )
            	    // InternalMyTurtleDsl.g:375:5: (lv_fonctions_7_0= ruleFonctionCall )
            	    {
            	    // InternalMyTurtleDsl.g:375:5: (lv_fonctions_7_0= ruleFonctionCall )
            	    // InternalMyTurtleDsl.g:376:6: lv_fonctions_7_0= ruleFonctionCall
            	    {

            	    						newCompositeNode(grammarAccess.getMainAccess().getFonctionsFonctionCallParserRuleCall_4_3_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_fonctions_7_0=ruleFonctionCall();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMainRule());
            	    						}
            	    						add(
            	    							current,
            	    							"fonctions",
            	    							lv_fonctions_7_0,
            	    							"org.xtext.example.mydsl.MyTurtleDsl.FonctionCall");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMyTurtleDsl.g:394:4: ( ( (lv_parallele_8_1= ruleParallele2 | lv_parallele_8_2= ruleParallele3 ) ) )
            	    {
            	    // InternalMyTurtleDsl.g:394:4: ( ( (lv_parallele_8_1= ruleParallele2 | lv_parallele_8_2= ruleParallele3 ) ) )
            	    // InternalMyTurtleDsl.g:395:5: ( (lv_parallele_8_1= ruleParallele2 | lv_parallele_8_2= ruleParallele3 ) )
            	    {
            	    // InternalMyTurtleDsl.g:395:5: ( (lv_parallele_8_1= ruleParallele2 | lv_parallele_8_2= ruleParallele3 ) )
            	    // InternalMyTurtleDsl.g:396:6: (lv_parallele_8_1= ruleParallele2 | lv_parallele_8_2= ruleParallele3 )
            	    {
            	    // InternalMyTurtleDsl.g:396:6: (lv_parallele_8_1= ruleParallele2 | lv_parallele_8_2= ruleParallele3 )
            	    int alt11=2;
            	    alt11 = dfa11.predict(input);
            	    switch (alt11) {
            	        case 1 :
            	            // InternalMyTurtleDsl.g:397:7: lv_parallele_8_1= ruleParallele2
            	            {

            	            							newCompositeNode(grammarAccess.getMainAccess().getParalleleParallele2ParserRuleCall_4_4_0_0());
            	            						
            	            pushFollow(FOLLOW_10);
            	            lv_parallele_8_1=ruleParallele2();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getMainRule());
            	            							}
            	            							add(
            	            								current,
            	            								"parallele",
            	            								lv_parallele_8_1,
            	            								"org.xtext.example.mydsl.MyTurtleDsl.Parallele2");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalMyTurtleDsl.g:413:7: lv_parallele_8_2= ruleParallele3
            	            {

            	            							newCompositeNode(grammarAccess.getMainAccess().getParalleleParallele3ParserRuleCall_4_4_0_1());
            	            						
            	            pushFollow(FOLLOW_10);
            	            lv_parallele_8_2=ruleParallele3();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getMainRule());
            	            							}
            	            							add(
            	            								current,
            	            								"parallele",
            	            								lv_parallele_8_2,
            	            								"org.xtext.example.mydsl.MyTurtleDsl.Parallele3");
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

            // InternalMyTurtleDsl.g:432:3: (otherlv_9= '\\n' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==13) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:433:4: otherlv_9= '\\n'
            	    {
            	    otherlv_9=(Token)match(input,13,FOLLOW_10); 

            	    				newLeafNode(otherlv_9, grammarAccess.getMainAccess().getLineFeedKeyword_5());
            	    			

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            			newCompositeNode(grammarAccess.getMainAccess().getEndParserRuleCall_6());
            		
            pushFollow(FOLLOW_11);
            ruleEnd();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalMyTurtleDsl.g:445:3: (otherlv_11= '\\n' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==13) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:446:4: otherlv_11= '\\n'
            	    {
            	    otherlv_11=(Token)match(input,13,FOLLOW_11); 

            	    				newLeafNode(otherlv_11, grammarAccess.getMainAccess().getLineFeedKeyword_7());
            	    			

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_12=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_12, grammarAccess.getMainAccess().getRightCurlyBracketKeyword_8());
            		
            // InternalMyTurtleDsl.g:455:3: (otherlv_13= '\\n' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==13) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:456:4: otherlv_13= '\\n'
            	    {
            	    otherlv_13=(Token)match(input,13,FOLLOW_7); 

            	    				newLeafNode(otherlv_13, grammarAccess.getMainAccess().getLineFeedKeyword_9());
            	    			

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalMyTurtleDsl.g:465:1: entryRulePourcentConst returns [EObject current=null] : iv_rulePourcentConst= rulePourcentConst EOF ;
    public final EObject entryRulePourcentConst() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePourcentConst = null;


        try {
            // InternalMyTurtleDsl.g:465:54: (iv_rulePourcentConst= rulePourcentConst EOF )
            // InternalMyTurtleDsl.g:466:2: iv_rulePourcentConst= rulePourcentConst EOF
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
    // InternalMyTurtleDsl.g:472:1: rulePourcentConst returns [EObject current=null] : ( (lv_val_0_0= RULE_POURCENT ) ) ;
    public final EObject rulePourcentConst() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalMyTurtleDsl.g:478:2: ( ( (lv_val_0_0= RULE_POURCENT ) ) )
            // InternalMyTurtleDsl.g:479:2: ( (lv_val_0_0= RULE_POURCENT ) )
            {
            // InternalMyTurtleDsl.g:479:2: ( (lv_val_0_0= RULE_POURCENT ) )
            // InternalMyTurtleDsl.g:480:3: (lv_val_0_0= RULE_POURCENT )
            {
            // InternalMyTurtleDsl.g:480:3: (lv_val_0_0= RULE_POURCENT )
            // InternalMyTurtleDsl.g:481:4: lv_val_0_0= RULE_POURCENT
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
            					"org.xtext.example.mydsl.MyTurtleDsl.POURCENT");
            			

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
    // InternalMyTurtleDsl.g:500:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalMyTurtleDsl.g:500:47: (iv_ruleImport= ruleImport EOF )
            // InternalMyTurtleDsl.g:501:2: iv_ruleImport= ruleImport EOF
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
    // InternalMyTurtleDsl.g:507:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' otherlv_1= '<' ( (lv_importURI_2_0= RULE_INCLUDE ) ) otherlv_3= '>' (otherlv_4= '\\n' )* ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_importURI_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMyTurtleDsl.g:513:2: ( (otherlv_0= 'import' otherlv_1= '<' ( (lv_importURI_2_0= RULE_INCLUDE ) ) otherlv_3= '>' (otherlv_4= '\\n' )* ) )
            // InternalMyTurtleDsl.g:514:2: (otherlv_0= 'import' otherlv_1= '<' ( (lv_importURI_2_0= RULE_INCLUDE ) ) otherlv_3= '>' (otherlv_4= '\\n' )* )
            {
            // InternalMyTurtleDsl.g:514:2: (otherlv_0= 'import' otherlv_1= '<' ( (lv_importURI_2_0= RULE_INCLUDE ) ) otherlv_3= '>' (otherlv_4= '\\n' )* )
            // InternalMyTurtleDsl.g:515:3: otherlv_0= 'import' otherlv_1= '<' ( (lv_importURI_2_0= RULE_INCLUDE ) ) otherlv_3= '>' (otherlv_4= '\\n' )*
            {
            otherlv_0=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getImportAccess().getLessThanSignKeyword_1());
            		
            // InternalMyTurtleDsl.g:523:3: ( (lv_importURI_2_0= RULE_INCLUDE ) )
            // InternalMyTurtleDsl.g:524:4: (lv_importURI_2_0= RULE_INCLUDE )
            {
            // InternalMyTurtleDsl.g:524:4: (lv_importURI_2_0= RULE_INCLUDE )
            // InternalMyTurtleDsl.g:525:5: lv_importURI_2_0= RULE_INCLUDE
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
            						"org.xtext.example.mydsl.MyTurtleDsl.INCLUDE");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getImportAccess().getGreaterThanSignKeyword_3());
            		
            // InternalMyTurtleDsl.g:545:3: (otherlv_4= '\\n' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==13) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:546:4: otherlv_4= '\\n'
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_7); 

            	    				newLeafNode(otherlv_4, grammarAccess.getImportAccess().getLineFeedKeyword_4());
            	    			

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRulePourcent_vitesse_hauteur_max"
    // InternalMyTurtleDsl.g:555:1: entryRulePourcent_vitesse_hauteur_max returns [EObject current=null] : iv_rulePourcent_vitesse_hauteur_max= rulePourcent_vitesse_hauteur_max EOF ;
    public final EObject entryRulePourcent_vitesse_hauteur_max() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePourcent_vitesse_hauteur_max = null;


        try {
            // InternalMyTurtleDsl.g:555:69: (iv_rulePourcent_vitesse_hauteur_max= rulePourcent_vitesse_hauteur_max EOF )
            // InternalMyTurtleDsl.g:556:2: iv_rulePourcent_vitesse_hauteur_max= rulePourcent_vitesse_hauteur_max EOF
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
    // InternalMyTurtleDsl.g:562:1: rulePourcent_vitesse_hauteur_max returns [EObject current=null] : (otherlv_0= 'define' otherlv_1= 'vitesse_hauteur_max' ( (lv_vitesse_verticale_2_0= rulePourcentConst ) ) ) ;
    public final EObject rulePourcent_vitesse_hauteur_max() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_vitesse_verticale_2_0 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:568:2: ( (otherlv_0= 'define' otherlv_1= 'vitesse_hauteur_max' ( (lv_vitesse_verticale_2_0= rulePourcentConst ) ) ) )
            // InternalMyTurtleDsl.g:569:2: (otherlv_0= 'define' otherlv_1= 'vitesse_hauteur_max' ( (lv_vitesse_verticale_2_0= rulePourcentConst ) ) )
            {
            // InternalMyTurtleDsl.g:569:2: (otherlv_0= 'define' otherlv_1= 'vitesse_hauteur_max' ( (lv_vitesse_verticale_2_0= rulePourcentConst ) ) )
            // InternalMyTurtleDsl.g:570:3: otherlv_0= 'define' otherlv_1= 'vitesse_hauteur_max' ( (lv_vitesse_verticale_2_0= rulePourcentConst ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getPourcent_vitesse_hauteur_maxAccess().getDefineKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getPourcent_vitesse_hauteur_maxAccess().getVitesse_hauteur_maxKeyword_1());
            		
            // InternalMyTurtleDsl.g:578:3: ( (lv_vitesse_verticale_2_0= rulePourcentConst ) )
            // InternalMyTurtleDsl.g:579:4: (lv_vitesse_verticale_2_0= rulePourcentConst )
            {
            // InternalMyTurtleDsl.g:579:4: (lv_vitesse_verticale_2_0= rulePourcentConst )
            // InternalMyTurtleDsl.g:580:5: lv_vitesse_verticale_2_0= rulePourcentConst
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
            						"org.xtext.example.mydsl.MyTurtleDsl.PourcentConst");
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
    // InternalMyTurtleDsl.g:601:1: entryRulePourcent_vitesse_deplacement_max returns [EObject current=null] : iv_rulePourcent_vitesse_deplacement_max= rulePourcent_vitesse_deplacement_max EOF ;
    public final EObject entryRulePourcent_vitesse_deplacement_max() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePourcent_vitesse_deplacement_max = null;


        try {
            // InternalMyTurtleDsl.g:601:73: (iv_rulePourcent_vitesse_deplacement_max= rulePourcent_vitesse_deplacement_max EOF )
            // InternalMyTurtleDsl.g:602:2: iv_rulePourcent_vitesse_deplacement_max= rulePourcent_vitesse_deplacement_max EOF
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
    // InternalMyTurtleDsl.g:608:1: rulePourcent_vitesse_deplacement_max returns [EObject current=null] : (otherlv_0= 'define' otherlv_1= 'vitesse_deplacement_max' ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) ) ) ;
    public final EObject rulePourcent_vitesse_deplacement_max() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_vitesse_deplacement_2_0 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:614:2: ( (otherlv_0= 'define' otherlv_1= 'vitesse_deplacement_max' ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) ) ) )
            // InternalMyTurtleDsl.g:615:2: (otherlv_0= 'define' otherlv_1= 'vitesse_deplacement_max' ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) ) )
            {
            // InternalMyTurtleDsl.g:615:2: (otherlv_0= 'define' otherlv_1= 'vitesse_deplacement_max' ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) ) )
            // InternalMyTurtleDsl.g:616:3: otherlv_0= 'define' otherlv_1= 'vitesse_deplacement_max' ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getPourcent_vitesse_deplacement_maxAccess().getDefineKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getPourcent_vitesse_deplacement_maxAccess().getVitesse_deplacement_maxKeyword_1());
            		
            // InternalMyTurtleDsl.g:624:3: ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) )
            // InternalMyTurtleDsl.g:625:4: (lv_vitesse_deplacement_2_0= rulePourcentConst )
            {
            // InternalMyTurtleDsl.g:625:4: (lv_vitesse_deplacement_2_0= rulePourcentConst )
            // InternalMyTurtleDsl.g:626:5: lv_vitesse_deplacement_2_0= rulePourcentConst
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
            						"org.xtext.example.mydsl.MyTurtleDsl.PourcentConst");
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
    // InternalMyTurtleDsl.g:647:1: entryRulePourcent_vitesse_rotation_max returns [EObject current=null] : iv_rulePourcent_vitesse_rotation_max= rulePourcent_vitesse_rotation_max EOF ;
    public final EObject entryRulePourcent_vitesse_rotation_max() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePourcent_vitesse_rotation_max = null;


        try {
            // InternalMyTurtleDsl.g:647:70: (iv_rulePourcent_vitesse_rotation_max= rulePourcent_vitesse_rotation_max EOF )
            // InternalMyTurtleDsl.g:648:2: iv_rulePourcent_vitesse_rotation_max= rulePourcent_vitesse_rotation_max EOF
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
    // InternalMyTurtleDsl.g:654:1: rulePourcent_vitesse_rotation_max returns [EObject current=null] : (otherlv_0= 'define' otherlv_1= 'vitesse_rotation_max' ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) ) ) ;
    public final EObject rulePourcent_vitesse_rotation_max() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_vitesse_deplacement_2_0 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:660:2: ( (otherlv_0= 'define' otherlv_1= 'vitesse_rotation_max' ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) ) ) )
            // InternalMyTurtleDsl.g:661:2: (otherlv_0= 'define' otherlv_1= 'vitesse_rotation_max' ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) ) )
            {
            // InternalMyTurtleDsl.g:661:2: (otherlv_0= 'define' otherlv_1= 'vitesse_rotation_max' ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) ) )
            // InternalMyTurtleDsl.g:662:3: otherlv_0= 'define' otherlv_1= 'vitesse_rotation_max' ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getPourcent_vitesse_rotation_maxAccess().getDefineKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getPourcent_vitesse_rotation_maxAccess().getVitesse_rotation_maxKeyword_1());
            		
            // InternalMyTurtleDsl.g:670:3: ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) )
            // InternalMyTurtleDsl.g:671:4: (lv_vitesse_deplacement_2_0= rulePourcentConst )
            {
            // InternalMyTurtleDsl.g:671:4: (lv_vitesse_deplacement_2_0= rulePourcentConst )
            // InternalMyTurtleDsl.g:672:5: lv_vitesse_deplacement_2_0= rulePourcentConst
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
            						"org.xtext.example.mydsl.MyTurtleDsl.PourcentConst");
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
    // InternalMyTurtleDsl.g:693:1: entryRuleHauteur_max returns [EObject current=null] : iv_ruleHauteur_max= ruleHauteur_max EOF ;
    public final EObject entryRuleHauteur_max() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHauteur_max = null;


        try {
            // InternalMyTurtleDsl.g:693:52: (iv_ruleHauteur_max= ruleHauteur_max EOF )
            // InternalMyTurtleDsl.g:694:2: iv_ruleHauteur_max= ruleHauteur_max EOF
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
    // InternalMyTurtleDsl.g:700:1: ruleHauteur_max returns [EObject current=null] : (otherlv_0= 'define' otherlv_1= 'hauteur_max' ( (lv_hauteur_max_2_0= ruleIntExp ) ) ) ;
    public final EObject ruleHauteur_max() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_hauteur_max_2_0 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:706:2: ( (otherlv_0= 'define' otherlv_1= 'hauteur_max' ( (lv_hauteur_max_2_0= ruleIntExp ) ) ) )
            // InternalMyTurtleDsl.g:707:2: (otherlv_0= 'define' otherlv_1= 'hauteur_max' ( (lv_hauteur_max_2_0= ruleIntExp ) ) )
            {
            // InternalMyTurtleDsl.g:707:2: (otherlv_0= 'define' otherlv_1= 'hauteur_max' ( (lv_hauteur_max_2_0= ruleIntExp ) ) )
            // InternalMyTurtleDsl.g:708:3: otherlv_0= 'define' otherlv_1= 'hauteur_max' ( (lv_hauteur_max_2_0= ruleIntExp ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getHauteur_maxAccess().getDefineKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getHauteur_maxAccess().getHauteur_maxKeyword_1());
            		
            // InternalMyTurtleDsl.g:716:3: ( (lv_hauteur_max_2_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:717:4: (lv_hauteur_max_2_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:717:4: (lv_hauteur_max_2_0= ruleIntExp )
            // InternalMyTurtleDsl.g:718:5: lv_hauteur_max_2_0= ruleIntExp
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
            						"org.xtext.example.mydsl.MyTurtleDsl.IntExp");
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
    // InternalMyTurtleDsl.g:739:1: entryRuleEloignement_max returns [EObject current=null] : iv_ruleEloignement_max= ruleEloignement_max EOF ;
    public final EObject entryRuleEloignement_max() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEloignement_max = null;


        try {
            // InternalMyTurtleDsl.g:739:56: (iv_ruleEloignement_max= ruleEloignement_max EOF )
            // InternalMyTurtleDsl.g:740:2: iv_ruleEloignement_max= ruleEloignement_max EOF
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
    // InternalMyTurtleDsl.g:746:1: ruleEloignement_max returns [EObject current=null] : (otherlv_0= 'define' otherlv_1= 'eloignement_max' ( (lv_hauteur_max_2_0= ruleIntExp ) ) ) ;
    public final EObject ruleEloignement_max() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_hauteur_max_2_0 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:752:2: ( (otherlv_0= 'define' otherlv_1= 'eloignement_max' ( (lv_hauteur_max_2_0= ruleIntExp ) ) ) )
            // InternalMyTurtleDsl.g:753:2: (otherlv_0= 'define' otherlv_1= 'eloignement_max' ( (lv_hauteur_max_2_0= ruleIntExp ) ) )
            {
            // InternalMyTurtleDsl.g:753:2: (otherlv_0= 'define' otherlv_1= 'eloignement_max' ( (lv_hauteur_max_2_0= ruleIntExp ) ) )
            // InternalMyTurtleDsl.g:754:3: otherlv_0= 'define' otherlv_1= 'eloignement_max' ( (lv_hauteur_max_2_0= ruleIntExp ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getEloignement_maxAccess().getDefineKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getEloignement_maxAccess().getEloignement_maxKeyword_1());
            		
            // InternalMyTurtleDsl.g:762:3: ( (lv_hauteur_max_2_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:763:4: (lv_hauteur_max_2_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:763:4: (lv_hauteur_max_2_0= ruleIntExp )
            // InternalMyTurtleDsl.g:764:5: lv_hauteur_max_2_0= ruleIntExp
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
            						"org.xtext.example.mydsl.MyTurtleDsl.IntExp");
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
    // InternalMyTurtleDsl.g:785:1: entryRuleDecoller returns [String current=null] : iv_ruleDecoller= ruleDecoller EOF ;
    public final String entryRuleDecoller() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecoller = null;


        try {
            // InternalMyTurtleDsl.g:785:48: (iv_ruleDecoller= ruleDecoller EOF )
            // InternalMyTurtleDsl.g:786:2: iv_ruleDecoller= ruleDecoller EOF
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
    // InternalMyTurtleDsl.g:792:1: ruleDecoller returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'decoller' kw= '(' kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleDecoller() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyTurtleDsl.g:798:2: ( (kw= 'decoller' kw= '(' kw= ')' ) )
            // InternalMyTurtleDsl.g:799:2: (kw= 'decoller' kw= '(' kw= ')' )
            {
            // InternalMyTurtleDsl.g:799:2: (kw= 'decoller' kw= '(' kw= ')' )
            // InternalMyTurtleDsl.g:800:3: kw= 'decoller' kw= '(' kw= ')'
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
    // InternalMyTurtleDsl.g:819:1: entryRuleAtterrir returns [String current=null] : iv_ruleAtterrir= ruleAtterrir EOF ;
    public final String entryRuleAtterrir() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAtterrir = null;


        try {
            // InternalMyTurtleDsl.g:819:48: (iv_ruleAtterrir= ruleAtterrir EOF )
            // InternalMyTurtleDsl.g:820:2: iv_ruleAtterrir= ruleAtterrir EOF
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
    // InternalMyTurtleDsl.g:826:1: ruleAtterrir returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'atterrir' kw= '(' kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleAtterrir() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyTurtleDsl.g:832:2: ( (kw= 'atterrir' kw= '(' kw= ')' ) )
            // InternalMyTurtleDsl.g:833:2: (kw= 'atterrir' kw= '(' kw= ')' )
            {
            // InternalMyTurtleDsl.g:833:2: (kw= 'atterrir' kw= '(' kw= ')' )
            // InternalMyTurtleDsl.g:834:3: kw= 'atterrir' kw= '(' kw= ')'
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
    // InternalMyTurtleDsl.g:853:1: entryRuleMonter returns [EObject current=null] : iv_ruleMonter= ruleMonter EOF ;
    public final EObject entryRuleMonter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonter = null;


        try {
            // InternalMyTurtleDsl.g:853:47: (iv_ruleMonter= ruleMonter EOF )
            // InternalMyTurtleDsl.g:854:2: iv_ruleMonter= ruleMonter EOF
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
    // InternalMyTurtleDsl.g:860:1: ruleMonter returns [EObject current=null] : (otherlv_0= 'monter' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_verticale_4_0= rulePourcentExp ) ) otherlv_5= ')' ) ;
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
            // InternalMyTurtleDsl.g:866:2: ( (otherlv_0= 'monter' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_verticale_4_0= rulePourcentExp ) ) otherlv_5= ')' ) )
            // InternalMyTurtleDsl.g:867:2: (otherlv_0= 'monter' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_verticale_4_0= rulePourcentExp ) ) otherlv_5= ')' )
            {
            // InternalMyTurtleDsl.g:867:2: (otherlv_0= 'monter' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_verticale_4_0= rulePourcentExp ) ) otherlv_5= ')' )
            // InternalMyTurtleDsl.g:868:3: otherlv_0= 'monter' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_verticale_4_0= rulePourcentExp ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getMonterAccess().getMonterKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getMonterAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyTurtleDsl.g:876:3: ( (lv_duree_2_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:877:4: (lv_duree_2_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:877:4: (lv_duree_2_0= ruleIntExp )
            // InternalMyTurtleDsl.g:878:5: lv_duree_2_0= ruleIntExp
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
            						"org.xtext.example.mydsl.MyTurtleDsl.IntExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getMonterAccess().getCommaKeyword_3());
            		
            // InternalMyTurtleDsl.g:899:3: ( (lv_vitesse_verticale_4_0= rulePourcentExp ) )
            // InternalMyTurtleDsl.g:900:4: (lv_vitesse_verticale_4_0= rulePourcentExp )
            {
            // InternalMyTurtleDsl.g:900:4: (lv_vitesse_verticale_4_0= rulePourcentExp )
            // InternalMyTurtleDsl.g:901:5: lv_vitesse_verticale_4_0= rulePourcentExp
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
            						"org.xtext.example.mydsl.MyTurtleDsl.PourcentExp");
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
    // InternalMyTurtleDsl.g:926:1: entryRuleDescendre returns [EObject current=null] : iv_ruleDescendre= ruleDescendre EOF ;
    public final EObject entryRuleDescendre() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescendre = null;


        try {
            // InternalMyTurtleDsl.g:926:50: (iv_ruleDescendre= ruleDescendre EOF )
            // InternalMyTurtleDsl.g:927:2: iv_ruleDescendre= ruleDescendre EOF
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
    // InternalMyTurtleDsl.g:933:1: ruleDescendre returns [EObject current=null] : (otherlv_0= 'descendre' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_verticale_4_0= rulePourcentExp ) ) otherlv_5= ')' ) ;
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
            // InternalMyTurtleDsl.g:939:2: ( (otherlv_0= 'descendre' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_verticale_4_0= rulePourcentExp ) ) otherlv_5= ')' ) )
            // InternalMyTurtleDsl.g:940:2: (otherlv_0= 'descendre' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_verticale_4_0= rulePourcentExp ) ) otherlv_5= ')' )
            {
            // InternalMyTurtleDsl.g:940:2: (otherlv_0= 'descendre' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_verticale_4_0= rulePourcentExp ) ) otherlv_5= ')' )
            // InternalMyTurtleDsl.g:941:3: otherlv_0= 'descendre' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_verticale_4_0= rulePourcentExp ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getDescendreAccess().getDescendreKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getDescendreAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyTurtleDsl.g:949:3: ( (lv_duree_2_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:950:4: (lv_duree_2_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:950:4: (lv_duree_2_0= ruleIntExp )
            // InternalMyTurtleDsl.g:951:5: lv_duree_2_0= ruleIntExp
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
            						"org.xtext.example.mydsl.MyTurtleDsl.IntExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getDescendreAccess().getCommaKeyword_3());
            		
            // InternalMyTurtleDsl.g:972:3: ( (lv_vitesse_verticale_4_0= rulePourcentExp ) )
            // InternalMyTurtleDsl.g:973:4: (lv_vitesse_verticale_4_0= rulePourcentExp )
            {
            // InternalMyTurtleDsl.g:973:4: (lv_vitesse_verticale_4_0= rulePourcentExp )
            // InternalMyTurtleDsl.g:974:5: lv_vitesse_verticale_4_0= rulePourcentExp
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
            						"org.xtext.example.mydsl.MyTurtleDsl.PourcentExp");
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
    // InternalMyTurtleDsl.g:999:1: entryRuleAvancer returns [EObject current=null] : iv_ruleAvancer= ruleAvancer EOF ;
    public final EObject entryRuleAvancer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvancer = null;


        try {
            // InternalMyTurtleDsl.g:999:48: (iv_ruleAvancer= ruleAvancer EOF )
            // InternalMyTurtleDsl.g:1000:2: iv_ruleAvancer= ruleAvancer EOF
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
    // InternalMyTurtleDsl.g:1006:1: ruleAvancer returns [EObject current=null] : (otherlv_0= 'avancer' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) ) otherlv_5= ')' ) ;
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
            // InternalMyTurtleDsl.g:1012:2: ( (otherlv_0= 'avancer' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) ) otherlv_5= ')' ) )
            // InternalMyTurtleDsl.g:1013:2: (otherlv_0= 'avancer' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) ) otherlv_5= ')' )
            {
            // InternalMyTurtleDsl.g:1013:2: (otherlv_0= 'avancer' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) ) otherlv_5= ')' )
            // InternalMyTurtleDsl.g:1014:3: otherlv_0= 'avancer' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getAvancerAccess().getAvancerKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getAvancerAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyTurtleDsl.g:1022:3: ( (lv_duree_2_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:1023:4: (lv_duree_2_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:1023:4: (lv_duree_2_0= ruleIntExp )
            // InternalMyTurtleDsl.g:1024:5: lv_duree_2_0= ruleIntExp
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
            						"org.xtext.example.mydsl.MyTurtleDsl.IntExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getAvancerAccess().getCommaKeyword_3());
            		
            // InternalMyTurtleDsl.g:1045:3: ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) )
            // InternalMyTurtleDsl.g:1046:4: (lv_vitesse_deplacement_4_0= rulePourcentExp )
            {
            // InternalMyTurtleDsl.g:1046:4: (lv_vitesse_deplacement_4_0= rulePourcentExp )
            // InternalMyTurtleDsl.g:1047:5: lv_vitesse_deplacement_4_0= rulePourcentExp
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
            						"org.xtext.example.mydsl.MyTurtleDsl.PourcentExp");
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
    // InternalMyTurtleDsl.g:1072:1: entryRuleReculer returns [EObject current=null] : iv_ruleReculer= ruleReculer EOF ;
    public final EObject entryRuleReculer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReculer = null;


        try {
            // InternalMyTurtleDsl.g:1072:48: (iv_ruleReculer= ruleReculer EOF )
            // InternalMyTurtleDsl.g:1073:2: iv_ruleReculer= ruleReculer EOF
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
    // InternalMyTurtleDsl.g:1079:1: ruleReculer returns [EObject current=null] : (otherlv_0= 'reculer' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) ) otherlv_5= ')' ) ;
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
            // InternalMyTurtleDsl.g:1085:2: ( (otherlv_0= 'reculer' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) ) otherlv_5= ')' ) )
            // InternalMyTurtleDsl.g:1086:2: (otherlv_0= 'reculer' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) ) otherlv_5= ')' )
            {
            // InternalMyTurtleDsl.g:1086:2: (otherlv_0= 'reculer' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) ) otherlv_5= ')' )
            // InternalMyTurtleDsl.g:1087:3: otherlv_0= 'reculer' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getReculerAccess().getReculerKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getReculerAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyTurtleDsl.g:1095:3: ( (lv_duree_2_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:1096:4: (lv_duree_2_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:1096:4: (lv_duree_2_0= ruleIntExp )
            // InternalMyTurtleDsl.g:1097:5: lv_duree_2_0= ruleIntExp
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
            						"org.xtext.example.mydsl.MyTurtleDsl.IntExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getReculerAccess().getCommaKeyword_3());
            		
            // InternalMyTurtleDsl.g:1118:3: ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) )
            // InternalMyTurtleDsl.g:1119:4: (lv_vitesse_deplacement_4_0= rulePourcentExp )
            {
            // InternalMyTurtleDsl.g:1119:4: (lv_vitesse_deplacement_4_0= rulePourcentExp )
            // InternalMyTurtleDsl.g:1120:5: lv_vitesse_deplacement_4_0= rulePourcentExp
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
            						"org.xtext.example.mydsl.MyTurtleDsl.PourcentExp");
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
    // InternalMyTurtleDsl.g:1145:1: entryRuleGauche returns [EObject current=null] : iv_ruleGauche= ruleGauche EOF ;
    public final EObject entryRuleGauche() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGauche = null;


        try {
            // InternalMyTurtleDsl.g:1145:47: (iv_ruleGauche= ruleGauche EOF )
            // InternalMyTurtleDsl.g:1146:2: iv_ruleGauche= ruleGauche EOF
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
    // InternalMyTurtleDsl.g:1152:1: ruleGauche returns [EObject current=null] : (otherlv_0= 'gauche' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) ) otherlv_5= ')' ) ;
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
            // InternalMyTurtleDsl.g:1158:2: ( (otherlv_0= 'gauche' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) ) otherlv_5= ')' ) )
            // InternalMyTurtleDsl.g:1159:2: (otherlv_0= 'gauche' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) ) otherlv_5= ')' )
            {
            // InternalMyTurtleDsl.g:1159:2: (otherlv_0= 'gauche' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) ) otherlv_5= ')' )
            // InternalMyTurtleDsl.g:1160:3: otherlv_0= 'gauche' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getGaucheAccess().getGaucheKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getGaucheAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyTurtleDsl.g:1168:3: ( (lv_duree_2_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:1169:4: (lv_duree_2_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:1169:4: (lv_duree_2_0= ruleIntExp )
            // InternalMyTurtleDsl.g:1170:5: lv_duree_2_0= ruleIntExp
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
            						"org.xtext.example.mydsl.MyTurtleDsl.IntExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getGaucheAccess().getCommaKeyword_3());
            		
            // InternalMyTurtleDsl.g:1191:3: ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) )
            // InternalMyTurtleDsl.g:1192:4: (lv_vitesse_deplacement_4_0= rulePourcentExp )
            {
            // InternalMyTurtleDsl.g:1192:4: (lv_vitesse_deplacement_4_0= rulePourcentExp )
            // InternalMyTurtleDsl.g:1193:5: lv_vitesse_deplacement_4_0= rulePourcentExp
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
            						"org.xtext.example.mydsl.MyTurtleDsl.PourcentExp");
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
    // InternalMyTurtleDsl.g:1218:1: entryRuleDroite returns [EObject current=null] : iv_ruleDroite= ruleDroite EOF ;
    public final EObject entryRuleDroite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDroite = null;


        try {
            // InternalMyTurtleDsl.g:1218:47: (iv_ruleDroite= ruleDroite EOF )
            // InternalMyTurtleDsl.g:1219:2: iv_ruleDroite= ruleDroite EOF
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
    // InternalMyTurtleDsl.g:1225:1: ruleDroite returns [EObject current=null] : (otherlv_0= 'droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) ) otherlv_5= ')' ) ;
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
            // InternalMyTurtleDsl.g:1231:2: ( (otherlv_0= 'droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) ) otherlv_5= ')' ) )
            // InternalMyTurtleDsl.g:1232:2: (otherlv_0= 'droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) ) otherlv_5= ')' )
            {
            // InternalMyTurtleDsl.g:1232:2: (otherlv_0= 'droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) ) otherlv_5= ')' )
            // InternalMyTurtleDsl.g:1233:3: otherlv_0= 'droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getDroiteAccess().getDroiteKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getDroiteAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyTurtleDsl.g:1241:3: ( (lv_duree_2_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:1242:4: (lv_duree_2_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:1242:4: (lv_duree_2_0= ruleIntExp )
            // InternalMyTurtleDsl.g:1243:5: lv_duree_2_0= ruleIntExp
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
            						"org.xtext.example.mydsl.MyTurtleDsl.IntExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getDroiteAccess().getCommaKeyword_3());
            		
            // InternalMyTurtleDsl.g:1264:3: ( (lv_vitesse_deplacement_4_0= rulePourcentExp ) )
            // InternalMyTurtleDsl.g:1265:4: (lv_vitesse_deplacement_4_0= rulePourcentExp )
            {
            // InternalMyTurtleDsl.g:1265:4: (lv_vitesse_deplacement_4_0= rulePourcentExp )
            // InternalMyTurtleDsl.g:1266:5: lv_vitesse_deplacement_4_0= rulePourcentExp
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
            						"org.xtext.example.mydsl.MyTurtleDsl.PourcentExp");
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
    // InternalMyTurtleDsl.g:1291:1: entryRulePause returns [EObject current=null] : iv_rulePause= rulePause EOF ;
    public final EObject entryRulePause() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePause = null;


        try {
            // InternalMyTurtleDsl.g:1291:46: (iv_rulePause= rulePause EOF )
            // InternalMyTurtleDsl.g:1292:2: iv_rulePause= rulePause EOF
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
    // InternalMyTurtleDsl.g:1298:1: rulePause returns [EObject current=null] : (otherlv_0= 'droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ')' ) ;
    public final EObject rulePause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_duree_2_0 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:1304:2: ( (otherlv_0= 'droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ')' ) )
            // InternalMyTurtleDsl.g:1305:2: (otherlv_0= 'droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ')' )
            {
            // InternalMyTurtleDsl.g:1305:2: (otherlv_0= 'droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ')' )
            // InternalMyTurtleDsl.g:1306:3: otherlv_0= 'droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getPauseAccess().getDroiteKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getPauseAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyTurtleDsl.g:1314:3: ( (lv_duree_2_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:1315:4: (lv_duree_2_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:1315:4: (lv_duree_2_0= ruleIntExp )
            // InternalMyTurtleDsl.g:1316:5: lv_duree_2_0= ruleIntExp
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
            						"org.xtext.example.mydsl.MyTurtleDsl.IntExp");
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
    // InternalMyTurtleDsl.g:1341:1: entryRuleRotationGauche returns [EObject current=null] : iv_ruleRotationGauche= ruleRotationGauche EOF ;
    public final EObject entryRuleRotationGauche() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotationGauche = null;


        try {
            // InternalMyTurtleDsl.g:1341:55: (iv_ruleRotationGauche= ruleRotationGauche EOF )
            // InternalMyTurtleDsl.g:1342:2: iv_ruleRotationGauche= ruleRotationGauche EOF
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
    // InternalMyTurtleDsl.g:1348:1: ruleRotationGauche returns [EObject current=null] : (otherlv_0= 'rotation_gauche' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_rotation_4_0= rulePourcentExp ) ) otherlv_5= ')' ) ;
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
            // InternalMyTurtleDsl.g:1354:2: ( (otherlv_0= 'rotation_gauche' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_rotation_4_0= rulePourcentExp ) ) otherlv_5= ')' ) )
            // InternalMyTurtleDsl.g:1355:2: (otherlv_0= 'rotation_gauche' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_rotation_4_0= rulePourcentExp ) ) otherlv_5= ')' )
            {
            // InternalMyTurtleDsl.g:1355:2: (otherlv_0= 'rotation_gauche' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_rotation_4_0= rulePourcentExp ) ) otherlv_5= ')' )
            // InternalMyTurtleDsl.g:1356:3: otherlv_0= 'rotation_gauche' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_rotation_4_0= rulePourcentExp ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getRotationGaucheAccess().getRotation_gaucheKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getRotationGaucheAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyTurtleDsl.g:1364:3: ( (lv_duree_2_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:1365:4: (lv_duree_2_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:1365:4: (lv_duree_2_0= ruleIntExp )
            // InternalMyTurtleDsl.g:1366:5: lv_duree_2_0= ruleIntExp
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
            						"org.xtext.example.mydsl.MyTurtleDsl.IntExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getRotationGaucheAccess().getCommaKeyword_3());
            		
            // InternalMyTurtleDsl.g:1387:3: ( (lv_vitesse_rotation_4_0= rulePourcentExp ) )
            // InternalMyTurtleDsl.g:1388:4: (lv_vitesse_rotation_4_0= rulePourcentExp )
            {
            // InternalMyTurtleDsl.g:1388:4: (lv_vitesse_rotation_4_0= rulePourcentExp )
            // InternalMyTurtleDsl.g:1389:5: lv_vitesse_rotation_4_0= rulePourcentExp
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
            						"org.xtext.example.mydsl.MyTurtleDsl.PourcentExp");
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
    // InternalMyTurtleDsl.g:1414:1: entryRuleRotationDroite returns [EObject current=null] : iv_ruleRotationDroite= ruleRotationDroite EOF ;
    public final EObject entryRuleRotationDroite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotationDroite = null;


        try {
            // InternalMyTurtleDsl.g:1414:55: (iv_ruleRotationDroite= ruleRotationDroite EOF )
            // InternalMyTurtleDsl.g:1415:2: iv_ruleRotationDroite= ruleRotationDroite EOF
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
    // InternalMyTurtleDsl.g:1421:1: ruleRotationDroite returns [EObject current=null] : (otherlv_0= 'rotation_droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_rotation_4_0= rulePourcentExp ) ) otherlv_5= ')' ) ;
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
            // InternalMyTurtleDsl.g:1427:2: ( (otherlv_0= 'rotation_droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_rotation_4_0= rulePourcentExp ) ) otherlv_5= ')' ) )
            // InternalMyTurtleDsl.g:1428:2: (otherlv_0= 'rotation_droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_rotation_4_0= rulePourcentExp ) ) otherlv_5= ')' )
            {
            // InternalMyTurtleDsl.g:1428:2: (otherlv_0= 'rotation_droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_rotation_4_0= rulePourcentExp ) ) otherlv_5= ')' )
            // InternalMyTurtleDsl.g:1429:3: otherlv_0= 'rotation_droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_rotation_4_0= rulePourcentExp ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getRotationDroiteAccess().getRotation_droiteKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getRotationDroiteAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyTurtleDsl.g:1437:3: ( (lv_duree_2_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:1438:4: (lv_duree_2_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:1438:4: (lv_duree_2_0= ruleIntExp )
            // InternalMyTurtleDsl.g:1439:5: lv_duree_2_0= ruleIntExp
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
            						"org.xtext.example.mydsl.MyTurtleDsl.IntExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getRotationDroiteAccess().getCommaKeyword_3());
            		
            // InternalMyTurtleDsl.g:1460:3: ( (lv_vitesse_rotation_4_0= rulePourcentExp ) )
            // InternalMyTurtleDsl.g:1461:4: (lv_vitesse_rotation_4_0= rulePourcentExp )
            {
            // InternalMyTurtleDsl.g:1461:4: (lv_vitesse_rotation_4_0= rulePourcentExp )
            // InternalMyTurtleDsl.g:1462:5: lv_vitesse_rotation_4_0= rulePourcentExp
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
            						"org.xtext.example.mydsl.MyTurtleDsl.PourcentExp");
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
    // InternalMyTurtleDsl.g:1487:1: entryRuleStart returns [String current=null] : iv_ruleStart= ruleStart EOF ;
    public final String entryRuleStart() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStart = null;


        try {
            // InternalMyTurtleDsl.g:1487:45: (iv_ruleStart= ruleStart EOF )
            // InternalMyTurtleDsl.g:1488:2: iv_ruleStart= ruleStart EOF
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
    // InternalMyTurtleDsl.g:1494:1: ruleStart returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Decoller_0= ruleDecoller ;
    public final AntlrDatatypeRuleToken ruleStart() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Decoller_0 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:1500:2: (this_Decoller_0= ruleDecoller )
            // InternalMyTurtleDsl.g:1501:2: this_Decoller_0= ruleDecoller
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
    // InternalMyTurtleDsl.g:1514:1: entryRuleEnd returns [String current=null] : iv_ruleEnd= ruleEnd EOF ;
    public final String entryRuleEnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnd = null;


        try {
            // InternalMyTurtleDsl.g:1514:43: (iv_ruleEnd= ruleEnd EOF )
            // InternalMyTurtleDsl.g:1515:2: iv_ruleEnd= ruleEnd EOF
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
    // InternalMyTurtleDsl.g:1521:1: ruleEnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Atterrir_0= ruleAtterrir ;
    public final AntlrDatatypeRuleToken ruleEnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Atterrir_0 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:1527:2: (this_Atterrir_0= ruleAtterrir )
            // InternalMyTurtleDsl.g:1528:2: this_Atterrir_0= ruleAtterrir
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
    // InternalMyTurtleDsl.g:1541:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMyTurtleDsl.g:1541:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMyTurtleDsl.g:1542:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalMyTurtleDsl.g:1548:1: ruleStatement returns [EObject current=null] : (this_Avancer_0= ruleAvancer | this_Descendre_1= ruleDescendre | this_RotationDroite_2= ruleRotationDroite | this_RotationGauche_3= ruleRotationGauche | this_Pause_4= rulePause | this_Droite_5= ruleDroite | this_Gauche_6= ruleGauche | this_Reculer_7= ruleReculer | this_Monter_8= ruleMonter ) ;
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



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:1554:2: ( (this_Avancer_0= ruleAvancer | this_Descendre_1= ruleDescendre | this_RotationDroite_2= ruleRotationDroite | this_RotationGauche_3= ruleRotationGauche | this_Pause_4= rulePause | this_Droite_5= ruleDroite | this_Gauche_6= ruleGauche | this_Reculer_7= ruleReculer | this_Monter_8= ruleMonter ) )
            // InternalMyTurtleDsl.g:1555:2: (this_Avancer_0= ruleAvancer | this_Descendre_1= ruleDescendre | this_RotationDroite_2= ruleRotationDroite | this_RotationGauche_3= ruleRotationGauche | this_Pause_4= rulePause | this_Droite_5= ruleDroite | this_Gauche_6= ruleGauche | this_Reculer_7= ruleReculer | this_Monter_8= ruleMonter )
            {
            // InternalMyTurtleDsl.g:1555:2: (this_Avancer_0= ruleAvancer | this_Descendre_1= ruleDescendre | this_RotationDroite_2= ruleRotationDroite | this_RotationGauche_3= ruleRotationGauche | this_Pause_4= rulePause | this_Droite_5= ruleDroite | this_Gauche_6= ruleGauche | this_Reculer_7= ruleReculer | this_Monter_8= ruleMonter )
            int alt17=9;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalMyTurtleDsl.g:1556:3: this_Avancer_0= ruleAvancer
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
                    // InternalMyTurtleDsl.g:1565:3: this_Descendre_1= ruleDescendre
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
                    // InternalMyTurtleDsl.g:1574:3: this_RotationDroite_2= ruleRotationDroite
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
                    // InternalMyTurtleDsl.g:1583:3: this_RotationGauche_3= ruleRotationGauche
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
                    // InternalMyTurtleDsl.g:1592:3: this_Pause_4= rulePause
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
                    // InternalMyTurtleDsl.g:1601:3: this_Droite_5= ruleDroite
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
                    // InternalMyTurtleDsl.g:1610:3: this_Gauche_6= ruleGauche
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
                    // InternalMyTurtleDsl.g:1619:3: this_Reculer_7= ruleReculer
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
                    // InternalMyTurtleDsl.g:1628:3: this_Monter_8= ruleMonter
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getMonterParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Monter_8=ruleMonter();

                    state._fsp--;


                    			current = this_Monter_8;
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
    // InternalMyTurtleDsl.g:1640:1: entryRuleFonctionDecl returns [EObject current=null] : iv_ruleFonctionDecl= ruleFonctionDecl EOF ;
    public final EObject entryRuleFonctionDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFonctionDecl = null;


        try {
            // InternalMyTurtleDsl.g:1640:53: (iv_ruleFonctionDecl= ruleFonctionDecl EOF )
            // InternalMyTurtleDsl.g:1641:2: iv_ruleFonctionDecl= ruleFonctionDecl EOF
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
    // InternalMyTurtleDsl.g:1647:1: ruleFonctionDecl returns [EObject current=null] : (otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleStatement ) )* otherlv_6= '\\n' otherlv_7= '}' ) ;
    public final EObject ruleFonctionDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_body_5_0 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:1653:2: ( (otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleStatement ) )* otherlv_6= '\\n' otherlv_7= '}' ) )
            // InternalMyTurtleDsl.g:1654:2: (otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleStatement ) )* otherlv_6= '\\n' otherlv_7= '}' )
            {
            // InternalMyTurtleDsl.g:1654:2: (otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleStatement ) )* otherlv_6= '\\n' otherlv_7= '}' )
            // InternalMyTurtleDsl.g:1655:3: otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleStatement ) )* otherlv_6= '\\n' otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getFonctionDeclAccess().getFuncKeyword_0());
            		
            // InternalMyTurtleDsl.g:1659:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyTurtleDsl.g:1660:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyTurtleDsl.g:1660:4: (lv_name_1_0= RULE_ID )
            // InternalMyTurtleDsl.g:1661:5: lv_name_1_0= RULE_ID
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
            		
            // InternalMyTurtleDsl.g:1689:3: ( (lv_body_5_0= ruleStatement ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==30||(LA18_0>=32 && LA18_0<=38)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:1690:4: (lv_body_5_0= ruleStatement )
            	    {
            	    // InternalMyTurtleDsl.g:1690:4: (lv_body_5_0= ruleStatement )
            	    // InternalMyTurtleDsl.g:1691:5: lv_body_5_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getFonctionDeclAccess().getBodyStatementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_body_5_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFonctionDeclRule());
            	    					}
            	    					add(
            	    						current,
            	    						"body",
            	    						lv_body_5_0,
            	    						"org.xtext.example.mydsl.MyTurtleDsl.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_28); 

            			newLeafNode(otherlv_6, grammarAccess.getFonctionDeclAccess().getLineFeedKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getFonctionDeclAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "entryRulePourcentDecl"
    // InternalMyTurtleDsl.g:1720:1: entryRulePourcentDecl returns [EObject current=null] : iv_rulePourcentDecl= rulePourcentDecl EOF ;
    public final EObject entryRulePourcentDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePourcentDecl = null;


        try {
            // InternalMyTurtleDsl.g:1720:53: (iv_rulePourcentDecl= rulePourcentDecl EOF )
            // InternalMyTurtleDsl.g:1721:2: iv_rulePourcentDecl= rulePourcentDecl EOF
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
    // InternalMyTurtleDsl.g:1727:1: rulePourcentDecl returns [EObject current=null] : (otherlv_0= 'Pourcent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= rulePourcentConst ) ) ) ;
    public final EObject rulePourcentDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_val_3_0 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:1733:2: ( (otherlv_0= 'Pourcent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= rulePourcentConst ) ) ) )
            // InternalMyTurtleDsl.g:1734:2: (otherlv_0= 'Pourcent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= rulePourcentConst ) ) )
            {
            // InternalMyTurtleDsl.g:1734:2: (otherlv_0= 'Pourcent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= rulePourcentConst ) ) )
            // InternalMyTurtleDsl.g:1735:3: otherlv_0= 'Pourcent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= rulePourcentConst ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getPourcentDeclAccess().getPourcentKeyword_0());
            		
            // InternalMyTurtleDsl.g:1739:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyTurtleDsl.g:1740:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyTurtleDsl.g:1740:4: (lv_name_1_0= RULE_ID )
            // InternalMyTurtleDsl.g:1741:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_29); 

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

            otherlv_2=(Token)match(input,41,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getPourcentDeclAccess().getEqualsSignKeyword_2());
            		
            // InternalMyTurtleDsl.g:1761:3: ( (lv_val_3_0= rulePourcentConst ) )
            // InternalMyTurtleDsl.g:1762:4: (lv_val_3_0= rulePourcentConst )
            {
            // InternalMyTurtleDsl.g:1762:4: (lv_val_3_0= rulePourcentConst )
            // InternalMyTurtleDsl.g:1763:5: lv_val_3_0= rulePourcentConst
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
            						"org.xtext.example.mydsl.MyTurtleDsl.PourcentConst");
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
    // InternalMyTurtleDsl.g:1784:1: entryRuleIntDecl returns [EObject current=null] : iv_ruleIntDecl= ruleIntDecl EOF ;
    public final EObject entryRuleIntDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntDecl = null;


        try {
            // InternalMyTurtleDsl.g:1784:48: (iv_ruleIntDecl= ruleIntDecl EOF )
            // InternalMyTurtleDsl.g:1785:2: iv_ruleIntDecl= ruleIntDecl EOF
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
    // InternalMyTurtleDsl.g:1791:1: ruleIntDecl returns [EObject current=null] : (otherlv_0= 'Seconde' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleIntExp ) ) ) ;
    public final EObject ruleIntDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_val_3_0 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:1797:2: ( (otherlv_0= 'Seconde' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleIntExp ) ) ) )
            // InternalMyTurtleDsl.g:1798:2: (otherlv_0= 'Seconde' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleIntExp ) ) )
            {
            // InternalMyTurtleDsl.g:1798:2: (otherlv_0= 'Seconde' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleIntExp ) ) )
            // InternalMyTurtleDsl.g:1799:3: otherlv_0= 'Seconde' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleIntExp ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getIntDeclAccess().getSecondeKeyword_0());
            		
            // InternalMyTurtleDsl.g:1803:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyTurtleDsl.g:1804:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyTurtleDsl.g:1804:4: (lv_name_1_0= RULE_ID )
            // InternalMyTurtleDsl.g:1805:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_29); 

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

            otherlv_2=(Token)match(input,41,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getIntDeclAccess().getEqualsSignKeyword_2());
            		
            // InternalMyTurtleDsl.g:1825:3: ( (lv_val_3_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:1826:4: (lv_val_3_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:1826:4: (lv_val_3_0= ruleIntExp )
            // InternalMyTurtleDsl.g:1827:5: lv_val_3_0= ruleIntExp
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
            						"org.xtext.example.mydsl.MyTurtleDsl.IntExp");
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


    // $ANTLR start "entryRulePourcentExp"
    // InternalMyTurtleDsl.g:1848:1: entryRulePourcentExp returns [EObject current=null] : iv_rulePourcentExp= rulePourcentExp EOF ;
    public final EObject entryRulePourcentExp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePourcentExp = null;


        try {
            // InternalMyTurtleDsl.g:1848:52: (iv_rulePourcentExp= rulePourcentExp EOF )
            // InternalMyTurtleDsl.g:1849:2: iv_rulePourcentExp= rulePourcentExp EOF
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
    // InternalMyTurtleDsl.g:1855:1: rulePourcentExp returns [EObject current=null] : (this_PourcentConst_0= rulePourcentConst | this_RefPourcentVar_1= ruleRefPourcentVar ) ;
    public final EObject rulePourcentExp() throws RecognitionException {
        EObject current = null;

        EObject this_PourcentConst_0 = null;

        EObject this_RefPourcentVar_1 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:1861:2: ( (this_PourcentConst_0= rulePourcentConst | this_RefPourcentVar_1= ruleRefPourcentVar ) )
            // InternalMyTurtleDsl.g:1862:2: (this_PourcentConst_0= rulePourcentConst | this_RefPourcentVar_1= ruleRefPourcentVar )
            {
            // InternalMyTurtleDsl.g:1862:2: (this_PourcentConst_0= rulePourcentConst | this_RefPourcentVar_1= ruleRefPourcentVar )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_POURCENT) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyTurtleDsl.g:1863:3: this_PourcentConst_0= rulePourcentConst
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
                    // InternalMyTurtleDsl.g:1872:3: this_RefPourcentVar_1= ruleRefPourcentVar
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
    // InternalMyTurtleDsl.g:1884:1: entryRuleRefIntVar returns [EObject current=null] : iv_ruleRefIntVar= ruleRefIntVar EOF ;
    public final EObject entryRuleRefIntVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefIntVar = null;


        try {
            // InternalMyTurtleDsl.g:1884:50: (iv_ruleRefIntVar= ruleRefIntVar EOF )
            // InternalMyTurtleDsl.g:1885:2: iv_ruleRefIntVar= ruleRefIntVar EOF
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
    // InternalMyTurtleDsl.g:1891:1: ruleRefIntVar returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleRefIntVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMyTurtleDsl.g:1897:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMyTurtleDsl.g:1898:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMyTurtleDsl.g:1898:2: ( (otherlv_0= RULE_ID ) )
            // InternalMyTurtleDsl.g:1899:3: (otherlv_0= RULE_ID )
            {
            // InternalMyTurtleDsl.g:1899:3: (otherlv_0= RULE_ID )
            // InternalMyTurtleDsl.g:1900:4: otherlv_0= RULE_ID
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
    // InternalMyTurtleDsl.g:1914:1: entryRuleRefPourcentVar returns [EObject current=null] : iv_ruleRefPourcentVar= ruleRefPourcentVar EOF ;
    public final EObject entryRuleRefPourcentVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefPourcentVar = null;


        try {
            // InternalMyTurtleDsl.g:1914:55: (iv_ruleRefPourcentVar= ruleRefPourcentVar EOF )
            // InternalMyTurtleDsl.g:1915:2: iv_ruleRefPourcentVar= ruleRefPourcentVar EOF
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
    // InternalMyTurtleDsl.g:1921:1: ruleRefPourcentVar returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleRefPourcentVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMyTurtleDsl.g:1927:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMyTurtleDsl.g:1928:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMyTurtleDsl.g:1928:2: ( (otherlv_0= RULE_ID ) )
            // InternalMyTurtleDsl.g:1929:3: (otherlv_0= RULE_ID )
            {
            // InternalMyTurtleDsl.g:1929:3: (otherlv_0= RULE_ID )
            // InternalMyTurtleDsl.g:1930:4: otherlv_0= RULE_ID
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
    // InternalMyTurtleDsl.g:1944:1: entryRuleIntConstante returns [EObject current=null] : iv_ruleIntConstante= ruleIntConstante EOF ;
    public final EObject entryRuleIntConstante() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntConstante = null;


        try {
            // InternalMyTurtleDsl.g:1944:53: (iv_ruleIntConstante= ruleIntConstante EOF )
            // InternalMyTurtleDsl.g:1945:2: iv_ruleIntConstante= ruleIntConstante EOF
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
    // InternalMyTurtleDsl.g:1951:1: ruleIntConstante returns [EObject current=null] : ( (lv_val_0_0= RULE_INT ) ) ;
    public final EObject ruleIntConstante() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalMyTurtleDsl.g:1957:2: ( ( (lv_val_0_0= RULE_INT ) ) )
            // InternalMyTurtleDsl.g:1958:2: ( (lv_val_0_0= RULE_INT ) )
            {
            // InternalMyTurtleDsl.g:1958:2: ( (lv_val_0_0= RULE_INT ) )
            // InternalMyTurtleDsl.g:1959:3: (lv_val_0_0= RULE_INT )
            {
            // InternalMyTurtleDsl.g:1959:3: (lv_val_0_0= RULE_INT )
            // InternalMyTurtleDsl.g:1960:4: lv_val_0_0= RULE_INT
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
    // InternalMyTurtleDsl.g:1979:1: entryRuleIntExp returns [EObject current=null] : iv_ruleIntExp= ruleIntExp EOF ;
    public final EObject entryRuleIntExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntExp = null;


        try {
            // InternalMyTurtleDsl.g:1979:47: (iv_ruleIntExp= ruleIntExp EOF )
            // InternalMyTurtleDsl.g:1980:2: iv_ruleIntExp= ruleIntExp EOF
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
    // InternalMyTurtleDsl.g:1986:1: ruleIntExp returns [EObject current=null] : (this_IntConstante_0= ruleIntConstante | this_RefIntVar_1= ruleRefIntVar ) ;
    public final EObject ruleIntExp() throws RecognitionException {
        EObject current = null;

        EObject this_IntConstante_0 = null;

        EObject this_RefIntVar_1 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:1992:2: ( (this_IntConstante_0= ruleIntConstante | this_RefIntVar_1= ruleRefIntVar ) )
            // InternalMyTurtleDsl.g:1993:2: (this_IntConstante_0= ruleIntConstante | this_RefIntVar_1= ruleRefIntVar )
            {
            // InternalMyTurtleDsl.g:1993:2: (this_IntConstante_0= ruleIntConstante | this_RefIntVar_1= ruleRefIntVar )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_ID) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyTurtleDsl.g:1994:3: this_IntConstante_0= ruleIntConstante
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
                    // InternalMyTurtleDsl.g:2003:3: this_RefIntVar_1= ruleRefIntVar
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
    // InternalMyTurtleDsl.g:2015:1: entryRuleFonctionCall returns [EObject current=null] : iv_ruleFonctionCall= ruleFonctionCall EOF ;
    public final EObject entryRuleFonctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFonctionCall = null;


        try {
            // InternalMyTurtleDsl.g:2015:53: (iv_ruleFonctionCall= ruleFonctionCall EOF )
            // InternalMyTurtleDsl.g:2016:2: iv_ruleFonctionCall= ruleFonctionCall EOF
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
    // InternalMyTurtleDsl.g:2022:1: ruleFonctionCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' ) ;
    public final EObject ruleFonctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyTurtleDsl.g:2028:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' ) )
            // InternalMyTurtleDsl.g:2029:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' )
            {
            // InternalMyTurtleDsl.g:2029:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' )
            // InternalMyTurtleDsl.g:2030:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')'
            {
            // InternalMyTurtleDsl.g:2030:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyTurtleDsl.g:2031:4: (otherlv_0= RULE_ID )
            {
            // InternalMyTurtleDsl.g:2031:4: (otherlv_0= RULE_ID )
            // InternalMyTurtleDsl.g:2032:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFonctionCallRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_0, grammarAccess.getFonctionCallAccess().getFuncFonctionDeclCrossReference_0_0());
            				

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
    // InternalMyTurtleDsl.g:2055:1: entryRuleMD returns [EObject current=null] : iv_ruleMD= ruleMD EOF ;
    public final EObject entryRuleMD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMD = null;


        try {
            // InternalMyTurtleDsl.g:2055:43: (iv_ruleMD= ruleMD EOF )
            // InternalMyTurtleDsl.g:2056:2: iv_ruleMD= ruleMD EOF
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
    // InternalMyTurtleDsl.g:2062:1: ruleMD returns [EObject current=null] : (this_Monter_0= ruleMonter | this_Descendre_1= ruleDescendre ) ;
    public final EObject ruleMD() throws RecognitionException {
        EObject current = null;

        EObject this_Monter_0 = null;

        EObject this_Descendre_1 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:2068:2: ( (this_Monter_0= ruleMonter | this_Descendre_1= ruleDescendre ) )
            // InternalMyTurtleDsl.g:2069:2: (this_Monter_0= ruleMonter | this_Descendre_1= ruleDescendre )
            {
            // InternalMyTurtleDsl.g:2069:2: (this_Monter_0= ruleMonter | this_Descendre_1= ruleDescendre )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            else if ( (LA21_0==32) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyTurtleDsl.g:2070:3: this_Monter_0= ruleMonter
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
                    // InternalMyTurtleDsl.g:2079:3: this_Descendre_1= ruleDescendre
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
    // InternalMyTurtleDsl.g:2091:1: entryRuleGDr returns [EObject current=null] : iv_ruleGDr= ruleGDr EOF ;
    public final EObject entryRuleGDr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGDr = null;


        try {
            // InternalMyTurtleDsl.g:2091:44: (iv_ruleGDr= ruleGDr EOF )
            // InternalMyTurtleDsl.g:2092:2: iv_ruleGDr= ruleGDr EOF
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
    // InternalMyTurtleDsl.g:2098:1: ruleGDr returns [EObject current=null] : (this_Gauche_0= ruleGauche | this_Droite_1= ruleDroite ) ;
    public final EObject ruleGDr() throws RecognitionException {
        EObject current = null;

        EObject this_Gauche_0 = null;

        EObject this_Droite_1 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:2104:2: ( (this_Gauche_0= ruleGauche | this_Droite_1= ruleDroite ) )
            // InternalMyTurtleDsl.g:2105:2: (this_Gauche_0= ruleGauche | this_Droite_1= ruleDroite )
            {
            // InternalMyTurtleDsl.g:2105:2: (this_Gauche_0= ruleGauche | this_Droite_1= ruleDroite )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            else if ( (LA22_0==36) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyTurtleDsl.g:2106:3: this_Gauche_0= ruleGauche
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
                    // InternalMyTurtleDsl.g:2115:3: this_Droite_1= ruleDroite
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
    // InternalMyTurtleDsl.g:2127:1: entryRuleRGRD returns [EObject current=null] : iv_ruleRGRD= ruleRGRD EOF ;
    public final EObject entryRuleRGRD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRGRD = null;


        try {
            // InternalMyTurtleDsl.g:2127:45: (iv_ruleRGRD= ruleRGRD EOF )
            // InternalMyTurtleDsl.g:2128:2: iv_ruleRGRD= ruleRGRD EOF
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
    // InternalMyTurtleDsl.g:2134:1: ruleRGRD returns [EObject current=null] : (this_RotationGauche_0= ruleRotationGauche | this_RotationDroite_1= ruleRotationDroite ) ;
    public final EObject ruleRGRD() throws RecognitionException {
        EObject current = null;

        EObject this_RotationGauche_0 = null;

        EObject this_RotationDroite_1 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:2140:2: ( (this_RotationGauche_0= ruleRotationGauche | this_RotationDroite_1= ruleRotationDroite ) )
            // InternalMyTurtleDsl.g:2141:2: (this_RotationGauche_0= ruleRotationGauche | this_RotationDroite_1= ruleRotationDroite )
            {
            // InternalMyTurtleDsl.g:2141:2: (this_RotationGauche_0= ruleRotationGauche | this_RotationDroite_1= ruleRotationDroite )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            else if ( (LA23_0==38) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyTurtleDsl.g:2142:3: this_RotationGauche_0= ruleRotationGauche
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
                    // InternalMyTurtleDsl.g:2151:3: this_RotationDroite_1= ruleRotationDroite
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
    // InternalMyTurtleDsl.g:2163:1: entryRuleAR returns [EObject current=null] : iv_ruleAR= ruleAR EOF ;
    public final EObject entryRuleAR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAR = null;


        try {
            // InternalMyTurtleDsl.g:2163:43: (iv_ruleAR= ruleAR EOF )
            // InternalMyTurtleDsl.g:2164:2: iv_ruleAR= ruleAR EOF
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
    // InternalMyTurtleDsl.g:2170:1: ruleAR returns [EObject current=null] : (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer ) ;
    public final EObject ruleAR() throws RecognitionException {
        EObject current = null;

        EObject this_Avancer_0 = null;

        EObject this_Reculer_1 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:2176:2: ( (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer ) )
            // InternalMyTurtleDsl.g:2177:2: (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer )
            {
            // InternalMyTurtleDsl.g:2177:2: (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            else if ( (LA24_0==34) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyTurtleDsl.g:2178:3: this_Avancer_0= ruleAvancer
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
                    // InternalMyTurtleDsl.g:2187:3: this_Reculer_1= ruleReculer
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


    // $ANTLR start "entryRuleParallele2"
    // InternalMyTurtleDsl.g:2199:1: entryRuleParallele2 returns [EObject current=null] : iv_ruleParallele2= ruleParallele2 EOF ;
    public final EObject entryRuleParallele2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallele2 = null;


        try {
            // InternalMyTurtleDsl.g:2199:51: (iv_ruleParallele2= ruleParallele2 EOF )
            // InternalMyTurtleDsl.g:2200:2: iv_ruleParallele2= ruleParallele2 EOF
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
    // InternalMyTurtleDsl.g:2206:1: ruleParallele2 returns [EObject current=null] : ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) ) ;
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
            // InternalMyTurtleDsl.g:2212:2: ( ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) ) )
            // InternalMyTurtleDsl.g:2213:2: ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) )
            {
            // InternalMyTurtleDsl.g:2213:2: ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) )
            int alt25=12;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // InternalMyTurtleDsl.g:2214:3: ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) )
                    {
                    // InternalMyTurtleDsl.g:2214:3: ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) )
                    // InternalMyTurtleDsl.g:2215:4: ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) )
                    {
                    // InternalMyTurtleDsl.g:2215:4: ( (lv_a_0_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:2216:5: (lv_a_0_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:2216:5: (lv_a_0_0= ruleMD )
                    // InternalMyTurtleDsl.g:2217:6: lv_a_0_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getAMDParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_a_0_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_0_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_1, grammarAccess.getParallele2Access().getAmpersandKeyword_0_1());
                    			
                    // InternalMyTurtleDsl.g:2238:4: ( (lv_t_2_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:2239:5: (lv_t_2_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:2239:5: (lv_t_2_0= ruleGDr )
                    // InternalMyTurtleDsl.g:2240:6: lv_t_2_0= ruleGDr
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
                    							"org.xtext.example.mydsl.MyTurtleDsl.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyTurtleDsl.g:2259:3: ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) )
                    {
                    // InternalMyTurtleDsl.g:2259:3: ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) )
                    // InternalMyTurtleDsl.g:2260:4: ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) )
                    {
                    // InternalMyTurtleDsl.g:2260:4: ( (lv_a_3_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:2261:5: (lv_a_3_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:2261:5: (lv_a_3_0= ruleMD )
                    // InternalMyTurtleDsl.g:2262:6: lv_a_3_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getAMDParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_a_3_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_3_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_4, grammarAccess.getParallele2Access().getAmpersandKeyword_1_1());
                    			
                    // InternalMyTurtleDsl.g:2283:4: ( (lv_t_5_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:2284:5: (lv_t_5_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:2284:5: (lv_t_5_0= ruleAR )
                    // InternalMyTurtleDsl.g:2285:6: lv_t_5_0= ruleAR
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
                    							"org.xtext.example.mydsl.MyTurtleDsl.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyTurtleDsl.g:2304:3: ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) )
                    {
                    // InternalMyTurtleDsl.g:2304:3: ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) )
                    // InternalMyTurtleDsl.g:2305:4: ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) )
                    {
                    // InternalMyTurtleDsl.g:2305:4: ( (lv_a_6_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:2306:5: (lv_a_6_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:2306:5: (lv_a_6_0= ruleMD )
                    // InternalMyTurtleDsl.g:2307:6: lv_a_6_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getAMDParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_a_6_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_6_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_7, grammarAccess.getParallele2Access().getAmpersandKeyword_2_1());
                    			
                    // InternalMyTurtleDsl.g:2328:4: ( (lv_t_8_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:2329:5: (lv_t_8_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:2329:5: (lv_t_8_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:2330:6: lv_t_8_0= ruleRGRD
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
                    							"org.xtext.example.mydsl.MyTurtleDsl.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyTurtleDsl.g:2349:3: ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) )
                    {
                    // InternalMyTurtleDsl.g:2349:3: ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) )
                    // InternalMyTurtleDsl.g:2350:4: ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) )
                    {
                    // InternalMyTurtleDsl.g:2350:4: ( (lv_t_9_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:2351:5: (lv_t_9_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:2351:5: (lv_t_9_0= ruleGDr )
                    // InternalMyTurtleDsl.g:2352:6: lv_t_9_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTGDrParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_t_9_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"t",
                    							lv_t_9_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_10, grammarAccess.getParallele2Access().getAmpersandKeyword_3_1());
                    			
                    // InternalMyTurtleDsl.g:2373:4: ( (lv_b_11_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:2374:5: (lv_b_11_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:2374:5: (lv_b_11_0= ruleAR )
                    // InternalMyTurtleDsl.g:2375:6: lv_b_11_0= ruleAR
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
                    							"org.xtext.example.mydsl.MyTurtleDsl.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMyTurtleDsl.g:2394:3: ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) )
                    {
                    // InternalMyTurtleDsl.g:2394:3: ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) )
                    // InternalMyTurtleDsl.g:2395:4: ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) )
                    {
                    // InternalMyTurtleDsl.g:2395:4: ( (lv_t_12_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:2396:5: (lv_t_12_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:2396:5: (lv_t_12_0= ruleGDr )
                    // InternalMyTurtleDsl.g:2397:6: lv_t_12_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTGDrParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_t_12_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"t",
                    							lv_t_12_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,43,FOLLOW_34); 

                    				newLeafNode(otherlv_13, grammarAccess.getParallele2Access().getAmpersandKeyword_4_1());
                    			
                    // InternalMyTurtleDsl.g:2418:4: ( (lv_b_14_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:2419:5: (lv_b_14_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:2419:5: (lv_b_14_0= ruleMD )
                    // InternalMyTurtleDsl.g:2420:6: lv_b_14_0= ruleMD
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
                    							"org.xtext.example.mydsl.MyTurtleDsl.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalMyTurtleDsl.g:2439:3: ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) )
                    {
                    // InternalMyTurtleDsl.g:2439:3: ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) )
                    // InternalMyTurtleDsl.g:2440:4: ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) )
                    {
                    // InternalMyTurtleDsl.g:2440:4: ( (lv_t_15_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:2441:5: (lv_t_15_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:2441:5: (lv_t_15_0= ruleGDr )
                    // InternalMyTurtleDsl.g:2442:6: lv_t_15_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTGDrParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_t_15_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"t",
                    							lv_t_15_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_16, grammarAccess.getParallele2Access().getAmpersandKeyword_5_1());
                    			
                    // InternalMyTurtleDsl.g:2463:4: ( (lv_b_17_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:2464:5: (lv_b_17_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:2464:5: (lv_b_17_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:2465:6: lv_b_17_0= ruleRGRD
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
                    							"org.xtext.example.mydsl.MyTurtleDsl.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalMyTurtleDsl.g:2484:3: ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) )
                    {
                    // InternalMyTurtleDsl.g:2484:3: ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) )
                    // InternalMyTurtleDsl.g:2485:4: ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) )
                    {
                    // InternalMyTurtleDsl.g:2485:4: ( (lv_t_18_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:2486:5: (lv_t_18_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:2486:5: (lv_t_18_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:2487:6: lv_t_18_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTRGRDParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_t_18_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"t",
                    							lv_t_18_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_19=(Token)match(input,43,FOLLOW_34); 

                    				newLeafNode(otherlv_19, grammarAccess.getParallele2Access().getAmpersandKeyword_6_1());
                    			
                    // InternalMyTurtleDsl.g:2508:4: ( (lv_a_20_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:2509:5: (lv_a_20_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:2509:5: (lv_a_20_0= ruleMD )
                    // InternalMyTurtleDsl.g:2510:6: lv_a_20_0= ruleMD
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
                    							"org.xtext.example.mydsl.MyTurtleDsl.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalMyTurtleDsl.g:2529:3: ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) )
                    {
                    // InternalMyTurtleDsl.g:2529:3: ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) )
                    // InternalMyTurtleDsl.g:2530:4: ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) )
                    {
                    // InternalMyTurtleDsl.g:2530:4: ( (lv_t_21_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:2531:5: (lv_t_21_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:2531:5: (lv_t_21_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:2532:6: lv_t_21_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTRGRDParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_t_21_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"t",
                    							lv_t_21_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_22=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_22, grammarAccess.getParallele2Access().getAmpersandKeyword_7_1());
                    			
                    // InternalMyTurtleDsl.g:2553:4: ( (lv_a_23_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:2554:5: (lv_a_23_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:2554:5: (lv_a_23_0= ruleAR )
                    // InternalMyTurtleDsl.g:2555:6: lv_a_23_0= ruleAR
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
                    							"org.xtext.example.mydsl.MyTurtleDsl.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalMyTurtleDsl.g:2574:3: ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) )
                    {
                    // InternalMyTurtleDsl.g:2574:3: ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) )
                    // InternalMyTurtleDsl.g:2575:4: ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) )
                    {
                    // InternalMyTurtleDsl.g:2575:4: ( (lv_t_24_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:2576:5: (lv_t_24_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:2576:5: (lv_t_24_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:2577:6: lv_t_24_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTRGRDParserRuleCall_8_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_t_24_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"t",
                    							lv_t_24_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_25=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_25, grammarAccess.getParallele2Access().getAmpersandKeyword_8_1());
                    			
                    // InternalMyTurtleDsl.g:2598:4: ( (lv_a_26_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:2599:5: (lv_a_26_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:2599:5: (lv_a_26_0= ruleGDr )
                    // InternalMyTurtleDsl.g:2600:6: lv_a_26_0= ruleGDr
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
                    							"org.xtext.example.mydsl.MyTurtleDsl.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalMyTurtleDsl.g:2619:3: ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) )
                    {
                    // InternalMyTurtleDsl.g:2619:3: ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) )
                    // InternalMyTurtleDsl.g:2620:4: ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) )
                    {
                    // InternalMyTurtleDsl.g:2620:4: ( (lv_t_27_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:2621:5: (lv_t_27_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:2621:5: (lv_t_27_0= ruleAR )
                    // InternalMyTurtleDsl.g:2622:6: lv_t_27_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTARParserRuleCall_9_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_t_27_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"t",
                    							lv_t_27_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_28=(Token)match(input,43,FOLLOW_34); 

                    				newLeafNode(otherlv_28, grammarAccess.getParallele2Access().getAmpersandKeyword_9_1());
                    			
                    // InternalMyTurtleDsl.g:2643:4: ( (lv_a_29_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:2644:5: (lv_a_29_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:2644:5: (lv_a_29_0= ruleMD )
                    // InternalMyTurtleDsl.g:2645:6: lv_a_29_0= ruleMD
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
                    							"org.xtext.example.mydsl.MyTurtleDsl.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalMyTurtleDsl.g:2664:3: ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) )
                    {
                    // InternalMyTurtleDsl.g:2664:3: ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) )
                    // InternalMyTurtleDsl.g:2665:4: ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) )
                    {
                    // InternalMyTurtleDsl.g:2665:4: ( (lv_t_30_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:2666:5: (lv_t_30_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:2666:5: (lv_t_30_0= ruleAR )
                    // InternalMyTurtleDsl.g:2667:6: lv_t_30_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTARParserRuleCall_10_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_t_30_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"t",
                    							lv_t_30_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_31=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_31, grammarAccess.getParallele2Access().getAmpersandKeyword_10_1());
                    			
                    // InternalMyTurtleDsl.g:2688:4: ( (lv_a_32_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:2689:5: (lv_a_32_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:2689:5: (lv_a_32_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:2690:6: lv_a_32_0= ruleRGRD
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
                    							"org.xtext.example.mydsl.MyTurtleDsl.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 12 :
                    // InternalMyTurtleDsl.g:2709:3: ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) )
                    {
                    // InternalMyTurtleDsl.g:2709:3: ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) )
                    // InternalMyTurtleDsl.g:2710:4: ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) )
                    {
                    // InternalMyTurtleDsl.g:2710:4: ( (lv_t_33_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:2711:5: (lv_t_33_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:2711:5: (lv_t_33_0= ruleAR )
                    // InternalMyTurtleDsl.g:2712:6: lv_t_33_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTARParserRuleCall_11_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_t_33_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"t",
                    							lv_t_33_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_34=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_34, grammarAccess.getParallele2Access().getAmpersandKeyword_11_1());
                    			
                    // InternalMyTurtleDsl.g:2733:4: ( (lv_a_35_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:2734:5: (lv_a_35_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:2734:5: (lv_a_35_0= ruleGDr )
                    // InternalMyTurtleDsl.g:2735:6: lv_a_35_0= ruleGDr
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
                    							"org.xtext.example.mydsl.MyTurtleDsl.GDr");
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
    // InternalMyTurtleDsl.g:2757:1: entryRuleParallele3 returns [EObject current=null] : iv_ruleParallele3= ruleParallele3 EOF ;
    public final EObject entryRuleParallele3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallele3 = null;


        try {
            // InternalMyTurtleDsl.g:2757:51: (iv_ruleParallele3= ruleParallele3 EOF )
            // InternalMyTurtleDsl.g:2758:2: iv_ruleParallele3= ruleParallele3 EOF
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
    // InternalMyTurtleDsl.g:2764:1: ruleParallele3 returns [EObject current=null] : ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) ) ;
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
            // InternalMyTurtleDsl.g:2770:2: ( ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) ) )
            // InternalMyTurtleDsl.g:2771:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) )
            {
            // InternalMyTurtleDsl.g:2771:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) )
            int alt26=24;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // InternalMyTurtleDsl.g:2772:3: ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) )
                    {
                    // InternalMyTurtleDsl.g:2772:3: ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) )
                    // InternalMyTurtleDsl.g:2773:4: ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) )
                    {
                    // InternalMyTurtleDsl.g:2773:4: ( (lv_a_0_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:2774:5: (lv_a_0_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:2774:5: (lv_a_0_0= ruleAR )
                    // InternalMyTurtleDsl.g:2775:6: lv_a_0_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAARParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_a_0_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_0_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_1, grammarAccess.getParallele3Access().getAmpersandKeyword_0_1());
                    			
                    // InternalMyTurtleDsl.g:2796:4: ( (lv_b_2_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:2797:5: (lv_b_2_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:2797:5: (lv_b_2_0= ruleGDr )
                    // InternalMyTurtleDsl.g:2798:6: lv_b_2_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBGDrParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_b_2_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_2_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,43,FOLLOW_34); 

                    				newLeafNode(otherlv_3, grammarAccess.getParallele3Access().getAmpersandKeyword_0_3());
                    			
                    // InternalMyTurtleDsl.g:2819:4: ( (lv_c_4_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:2820:5: (lv_c_4_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:2820:5: (lv_c_4_0= ruleMD )
                    // InternalMyTurtleDsl.g:2821:6: lv_c_4_0= ruleMD
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
                    							"org.xtext.example.mydsl.MyTurtleDsl.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyTurtleDsl.g:2840:3: ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) )
                    {
                    // InternalMyTurtleDsl.g:2840:3: ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) )
                    // InternalMyTurtleDsl.g:2841:4: ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) )
                    {
                    // InternalMyTurtleDsl.g:2841:4: ( (lv_a_5_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:2842:5: (lv_a_5_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:2842:5: (lv_a_5_0= ruleAR )
                    // InternalMyTurtleDsl.g:2843:6: lv_a_5_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAARParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_a_5_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_5_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_6, grammarAccess.getParallele3Access().getAmpersandKeyword_1_1());
                    			
                    // InternalMyTurtleDsl.g:2864:4: ( (lv_b_7_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:2865:5: (lv_b_7_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:2865:5: (lv_b_7_0= ruleGDr )
                    // InternalMyTurtleDsl.g:2866:6: lv_b_7_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBGDrParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_b_7_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_7_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_8, grammarAccess.getParallele3Access().getAmpersandKeyword_1_3());
                    			
                    // InternalMyTurtleDsl.g:2887:4: ( (lv_c_9_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:2888:5: (lv_c_9_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:2888:5: (lv_c_9_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:2889:6: lv_c_9_0= ruleRGRD
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
                    							"org.xtext.example.mydsl.MyTurtleDsl.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyTurtleDsl.g:2908:3: ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) )
                    {
                    // InternalMyTurtleDsl.g:2908:3: ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) )
                    // InternalMyTurtleDsl.g:2909:4: ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) )
                    {
                    // InternalMyTurtleDsl.g:2909:4: ( (lv_a_10_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:2910:5: (lv_a_10_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:2910:5: (lv_a_10_0= ruleAR )
                    // InternalMyTurtleDsl.g:2911:6: lv_a_10_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAARParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_a_10_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_10_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,43,FOLLOW_34); 

                    				newLeafNode(otherlv_11, grammarAccess.getParallele3Access().getAmpersandKeyword_2_1());
                    			
                    // InternalMyTurtleDsl.g:2932:4: ( (lv_b_12_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:2933:5: (lv_b_12_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:2933:5: (lv_b_12_0= ruleMD )
                    // InternalMyTurtleDsl.g:2934:6: lv_b_12_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBMDParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_b_12_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_12_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_13, grammarAccess.getParallele3Access().getAmpersandKeyword_2_3());
                    			
                    // InternalMyTurtleDsl.g:2955:4: ( (lv_c_14_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:2956:5: (lv_c_14_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:2956:5: (lv_c_14_0= ruleGDr )
                    // InternalMyTurtleDsl.g:2957:6: lv_c_14_0= ruleGDr
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
                    							"org.xtext.example.mydsl.MyTurtleDsl.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyTurtleDsl.g:2976:3: ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) )
                    {
                    // InternalMyTurtleDsl.g:2976:3: ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) )
                    // InternalMyTurtleDsl.g:2977:4: ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) )
                    {
                    // InternalMyTurtleDsl.g:2977:4: ( (lv_a_15_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:2978:5: (lv_a_15_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:2978:5: (lv_a_15_0= ruleAR )
                    // InternalMyTurtleDsl.g:2979:6: lv_a_15_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAARParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_a_15_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_15_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,43,FOLLOW_34); 

                    				newLeafNode(otherlv_16, grammarAccess.getParallele3Access().getAmpersandKeyword_3_1());
                    			
                    // InternalMyTurtleDsl.g:3000:4: ( (lv_b_17_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:3001:5: (lv_b_17_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:3001:5: (lv_b_17_0= ruleMD )
                    // InternalMyTurtleDsl.g:3002:6: lv_b_17_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBMDParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_b_17_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_17_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_18=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_18, grammarAccess.getParallele3Access().getAmpersandKeyword_3_3());
                    			
                    // InternalMyTurtleDsl.g:3023:4: ( (lv_c_19_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:3024:5: (lv_c_19_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:3024:5: (lv_c_19_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:3025:6: lv_c_19_0= ruleRGRD
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
                    							"org.xtext.example.mydsl.MyTurtleDsl.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMyTurtleDsl.g:3044:3: ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) )
                    {
                    // InternalMyTurtleDsl.g:3044:3: ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) )
                    // InternalMyTurtleDsl.g:3045:4: ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) )
                    {
                    // InternalMyTurtleDsl.g:3045:4: ( (lv_a_20_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:3046:5: (lv_a_20_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:3046:5: (lv_a_20_0= ruleAR )
                    // InternalMyTurtleDsl.g:3047:6: lv_a_20_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAARParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_a_20_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_20_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_21=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_21, grammarAccess.getParallele3Access().getAmpersandKeyword_4_1());
                    			
                    // InternalMyTurtleDsl.g:3068:4: ( (lv_b_22_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:3069:5: (lv_b_22_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:3069:5: (lv_b_22_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:3070:6: lv_b_22_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_b_22_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_22_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_23=(Token)match(input,43,FOLLOW_34); 

                    				newLeafNode(otherlv_23, grammarAccess.getParallele3Access().getAmpersandKeyword_4_3());
                    			
                    // InternalMyTurtleDsl.g:3091:4: ( (lv_c_24_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:3092:5: (lv_c_24_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:3092:5: (lv_c_24_0= ruleMD )
                    // InternalMyTurtleDsl.g:3093:6: lv_c_24_0= ruleMD
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
                    							"org.xtext.example.mydsl.MyTurtleDsl.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalMyTurtleDsl.g:3112:3: ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) )
                    {
                    // InternalMyTurtleDsl.g:3112:3: ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) )
                    // InternalMyTurtleDsl.g:3113:4: ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) )
                    {
                    // InternalMyTurtleDsl.g:3113:4: ( (lv_a_25_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:3114:5: (lv_a_25_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:3114:5: (lv_a_25_0= ruleAR )
                    // InternalMyTurtleDsl.g:3115:6: lv_a_25_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAARParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_a_25_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_25_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_26=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_26, grammarAccess.getParallele3Access().getAmpersandKeyword_5_1());
                    			
                    // InternalMyTurtleDsl.g:3136:4: ( (lv_b_27_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:3137:5: (lv_b_27_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:3137:5: (lv_b_27_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:3138:6: lv_b_27_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_b_27_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_27_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_28=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_28, grammarAccess.getParallele3Access().getAmpersandKeyword_5_3());
                    			
                    // InternalMyTurtleDsl.g:3159:4: ( (lv_c_29_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:3160:5: (lv_c_29_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:3160:5: (lv_c_29_0= ruleGDr )
                    // InternalMyTurtleDsl.g:3161:6: lv_c_29_0= ruleGDr
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
                    							"org.xtext.example.mydsl.MyTurtleDsl.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalMyTurtleDsl.g:3180:3: ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) )
                    {
                    // InternalMyTurtleDsl.g:3180:3: ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) )
                    // InternalMyTurtleDsl.g:3181:4: ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) )
                    {
                    // InternalMyTurtleDsl.g:3181:4: ( (lv_a_30_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:3182:5: (lv_a_30_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:3182:5: (lv_a_30_0= ruleGDr )
                    // InternalMyTurtleDsl.g:3183:6: lv_a_30_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAGDrParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_a_30_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_30_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_31=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_31, grammarAccess.getParallele3Access().getAmpersandKeyword_6_1());
                    			
                    // InternalMyTurtleDsl.g:3204:4: ( (lv_b_32_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:3205:5: (lv_b_32_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:3205:5: (lv_b_32_0= ruleAR )
                    // InternalMyTurtleDsl.g:3206:6: lv_b_32_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBARParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_b_32_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_32_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_33=(Token)match(input,43,FOLLOW_34); 

                    				newLeafNode(otherlv_33, grammarAccess.getParallele3Access().getAmpersandKeyword_6_3());
                    			
                    // InternalMyTurtleDsl.g:3227:4: ( (lv_c_34_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:3228:5: (lv_c_34_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:3228:5: (lv_c_34_0= ruleMD )
                    // InternalMyTurtleDsl.g:3229:6: lv_c_34_0= ruleMD
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
                    							"org.xtext.example.mydsl.MyTurtleDsl.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalMyTurtleDsl.g:3248:3: ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) )
                    {
                    // InternalMyTurtleDsl.g:3248:3: ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) )
                    // InternalMyTurtleDsl.g:3249:4: ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) )
                    {
                    // InternalMyTurtleDsl.g:3249:4: ( (lv_a_35_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:3250:5: (lv_a_35_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:3250:5: (lv_a_35_0= ruleGDr )
                    // InternalMyTurtleDsl.g:3251:6: lv_a_35_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAGDrParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_a_35_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_35_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_36=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_36, grammarAccess.getParallele3Access().getAmpersandKeyword_7_1());
                    			
                    // InternalMyTurtleDsl.g:3272:4: ( (lv_b_37_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:3273:5: (lv_b_37_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:3273:5: (lv_b_37_0= ruleAR )
                    // InternalMyTurtleDsl.g:3274:6: lv_b_37_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBARParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_b_37_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_37_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_38=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_38, grammarAccess.getParallele3Access().getAmpersandKeyword_7_3());
                    			
                    // InternalMyTurtleDsl.g:3295:4: ( (lv_c_39_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:3296:5: (lv_c_39_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:3296:5: (lv_c_39_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:3297:6: lv_c_39_0= ruleRGRD
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
                    							"org.xtext.example.mydsl.MyTurtleDsl.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalMyTurtleDsl.g:3316:3: ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) )
                    {
                    // InternalMyTurtleDsl.g:3316:3: ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) )
                    // InternalMyTurtleDsl.g:3317:4: ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) )
                    {
                    // InternalMyTurtleDsl.g:3317:4: ( (lv_a_40_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:3318:5: (lv_a_40_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:3318:5: (lv_a_40_0= ruleGDr )
                    // InternalMyTurtleDsl.g:3319:6: lv_a_40_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAGDrParserRuleCall_8_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_a_40_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_40_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_41=(Token)match(input,43,FOLLOW_34); 

                    				newLeafNode(otherlv_41, grammarAccess.getParallele3Access().getAmpersandKeyword_8_1());
                    			
                    // InternalMyTurtleDsl.g:3340:4: ( (lv_b_42_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:3341:5: (lv_b_42_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:3341:5: (lv_b_42_0= ruleMD )
                    // InternalMyTurtleDsl.g:3342:6: lv_b_42_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBMDParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_b_42_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_42_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_43=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_43, grammarAccess.getParallele3Access().getAmpersandKeyword_8_3());
                    			
                    // InternalMyTurtleDsl.g:3363:4: ( (lv_c_44_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:3364:5: (lv_c_44_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:3364:5: (lv_c_44_0= ruleAR )
                    // InternalMyTurtleDsl.g:3365:6: lv_c_44_0= ruleAR
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
                    							"org.xtext.example.mydsl.MyTurtleDsl.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalMyTurtleDsl.g:3384:3: ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) )
                    {
                    // InternalMyTurtleDsl.g:3384:3: ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) )
                    // InternalMyTurtleDsl.g:3385:4: ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) )
                    {
                    // InternalMyTurtleDsl.g:3385:4: ( (lv_a_45_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:3386:5: (lv_a_45_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:3386:5: (lv_a_45_0= ruleGDr )
                    // InternalMyTurtleDsl.g:3387:6: lv_a_45_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAGDrParserRuleCall_9_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_a_45_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_45_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_46=(Token)match(input,43,FOLLOW_34); 

                    				newLeafNode(otherlv_46, grammarAccess.getParallele3Access().getAmpersandKeyword_9_1());
                    			
                    // InternalMyTurtleDsl.g:3408:4: ( (lv_b_47_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:3409:5: (lv_b_47_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:3409:5: (lv_b_47_0= ruleMD )
                    // InternalMyTurtleDsl.g:3410:6: lv_b_47_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBMDParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_b_47_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_47_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_48=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_48, grammarAccess.getParallele3Access().getAmpersandKeyword_9_3());
                    			
                    // InternalMyTurtleDsl.g:3431:4: ( (lv_c_49_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:3432:5: (lv_c_49_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:3432:5: (lv_c_49_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:3433:6: lv_c_49_0= ruleRGRD
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
                    							"org.xtext.example.mydsl.MyTurtleDsl.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalMyTurtleDsl.g:3452:3: ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) )
                    {
                    // InternalMyTurtleDsl.g:3452:3: ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) )
                    // InternalMyTurtleDsl.g:3453:4: ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) )
                    {
                    // InternalMyTurtleDsl.g:3453:4: ( (lv_a_50_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:3454:5: (lv_a_50_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:3454:5: (lv_a_50_0= ruleGDr )
                    // InternalMyTurtleDsl.g:3455:6: lv_a_50_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAGDrParserRuleCall_10_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_a_50_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_50_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_51=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_51, grammarAccess.getParallele3Access().getAmpersandKeyword_10_1());
                    			
                    // InternalMyTurtleDsl.g:3476:4: ( (lv_b_52_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:3477:5: (lv_b_52_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:3477:5: (lv_b_52_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:3478:6: lv_b_52_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_b_52_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_52_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_53=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_53, grammarAccess.getParallele3Access().getAmpersandKeyword_10_3());
                    			
                    // InternalMyTurtleDsl.g:3499:4: ( (lv_c_54_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:3500:5: (lv_c_54_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:3500:5: (lv_c_54_0= ruleAR )
                    // InternalMyTurtleDsl.g:3501:6: lv_c_54_0= ruleAR
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
                    							"org.xtext.example.mydsl.MyTurtleDsl.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 12 :
                    // InternalMyTurtleDsl.g:3520:3: ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) )
                    {
                    // InternalMyTurtleDsl.g:3520:3: ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) )
                    // InternalMyTurtleDsl.g:3521:4: ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) )
                    {
                    // InternalMyTurtleDsl.g:3521:4: ( (lv_a_55_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:3522:5: (lv_a_55_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:3522:5: (lv_a_55_0= ruleGDr )
                    // InternalMyTurtleDsl.g:3523:6: lv_a_55_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAGDrParserRuleCall_11_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_a_55_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_55_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_56=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_56, grammarAccess.getParallele3Access().getAmpersandKeyword_11_1());
                    			
                    // InternalMyTurtleDsl.g:3544:4: ( (lv_b_57_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:3545:5: (lv_b_57_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:3545:5: (lv_b_57_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:3546:6: lv_b_57_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_b_57_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_57_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_58=(Token)match(input,43,FOLLOW_34); 

                    				newLeafNode(otherlv_58, grammarAccess.getParallele3Access().getAmpersandKeyword_11_3());
                    			
                    // InternalMyTurtleDsl.g:3567:4: ( (lv_c_59_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:3568:5: (lv_c_59_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:3568:5: (lv_c_59_0= ruleMD )
                    // InternalMyTurtleDsl.g:3569:6: lv_c_59_0= ruleMD
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
                    							"org.xtext.example.mydsl.MyTurtleDsl.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 13 :
                    // InternalMyTurtleDsl.g:3588:3: ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) )
                    {
                    // InternalMyTurtleDsl.g:3588:3: ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) )
                    // InternalMyTurtleDsl.g:3589:4: ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) )
                    {
                    // InternalMyTurtleDsl.g:3589:4: ( (lv_a_60_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:3590:5: (lv_a_60_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:3590:5: (lv_a_60_0= ruleMD )
                    // InternalMyTurtleDsl.g:3591:6: lv_a_60_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAMDParserRuleCall_12_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_a_60_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_60_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_61=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_61, grammarAccess.getParallele3Access().getAmpersandKeyword_12_1());
                    			
                    // InternalMyTurtleDsl.g:3612:4: ( (lv_b_62_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:3613:5: (lv_b_62_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:3613:5: (lv_b_62_0= ruleAR )
                    // InternalMyTurtleDsl.g:3614:6: lv_b_62_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBARParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_b_62_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_62_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_63=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_63, grammarAccess.getParallele3Access().getAmpersandKeyword_12_3());
                    			
                    // InternalMyTurtleDsl.g:3635:4: ( (lv_c_64_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:3636:5: (lv_c_64_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:3636:5: (lv_c_64_0= ruleGDr )
                    // InternalMyTurtleDsl.g:3637:6: lv_c_64_0= ruleGDr
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
                    							"org.xtext.example.mydsl.MyTurtleDsl.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 14 :
                    // InternalMyTurtleDsl.g:3656:3: ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) )
                    {
                    // InternalMyTurtleDsl.g:3656:3: ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) )
                    // InternalMyTurtleDsl.g:3657:4: ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) )
                    {
                    // InternalMyTurtleDsl.g:3657:4: ( (lv_a_65_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:3658:5: (lv_a_65_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:3658:5: (lv_a_65_0= ruleMD )
                    // InternalMyTurtleDsl.g:3659:6: lv_a_65_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAMDParserRuleCall_13_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_a_65_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_65_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_66=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_66, grammarAccess.getParallele3Access().getAmpersandKeyword_13_1());
                    			
                    // InternalMyTurtleDsl.g:3680:4: ( (lv_b_67_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:3681:5: (lv_b_67_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:3681:5: (lv_b_67_0= ruleAR )
                    // InternalMyTurtleDsl.g:3682:6: lv_b_67_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBARParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_b_67_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_67_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_68=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_68, grammarAccess.getParallele3Access().getAmpersandKeyword_13_3());
                    			
                    // InternalMyTurtleDsl.g:3703:4: ( (lv_c_69_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:3704:5: (lv_c_69_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:3704:5: (lv_c_69_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:3705:6: lv_c_69_0= ruleRGRD
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
                    							"org.xtext.example.mydsl.MyTurtleDsl.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 15 :
                    // InternalMyTurtleDsl.g:3724:3: ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) )
                    {
                    // InternalMyTurtleDsl.g:3724:3: ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) )
                    // InternalMyTurtleDsl.g:3725:4: ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) )
                    {
                    // InternalMyTurtleDsl.g:3725:4: ( (lv_a_70_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:3726:5: (lv_a_70_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:3726:5: (lv_a_70_0= ruleMD )
                    // InternalMyTurtleDsl.g:3727:6: lv_a_70_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAMDParserRuleCall_14_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_a_70_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_70_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_71=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_71, grammarAccess.getParallele3Access().getAmpersandKeyword_14_1());
                    			
                    // InternalMyTurtleDsl.g:3748:4: ( (lv_b_72_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:3749:5: (lv_b_72_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:3749:5: (lv_b_72_0= ruleGDr )
                    // InternalMyTurtleDsl.g:3750:6: lv_b_72_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBGDrParserRuleCall_14_2_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_b_72_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_72_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_73=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_73, grammarAccess.getParallele3Access().getAmpersandKeyword_14_3());
                    			
                    // InternalMyTurtleDsl.g:3771:4: ( (lv_c_74_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:3772:5: (lv_c_74_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:3772:5: (lv_c_74_0= ruleAR )
                    // InternalMyTurtleDsl.g:3773:6: lv_c_74_0= ruleAR
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
                    							"org.xtext.example.mydsl.MyTurtleDsl.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 16 :
                    // InternalMyTurtleDsl.g:3792:3: ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) )
                    {
                    // InternalMyTurtleDsl.g:3792:3: ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) )
                    // InternalMyTurtleDsl.g:3793:4: ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) )
                    {
                    // InternalMyTurtleDsl.g:3793:4: ( (lv_a_75_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:3794:5: (lv_a_75_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:3794:5: (lv_a_75_0= ruleMD )
                    // InternalMyTurtleDsl.g:3795:6: lv_a_75_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAMDParserRuleCall_15_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_a_75_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_75_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_76=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_76, grammarAccess.getParallele3Access().getAmpersandKeyword_15_1());
                    			
                    // InternalMyTurtleDsl.g:3816:4: ( (lv_b_77_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:3817:5: (lv_b_77_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:3817:5: (lv_b_77_0= ruleGDr )
                    // InternalMyTurtleDsl.g:3818:6: lv_b_77_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBGDrParserRuleCall_15_2_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_b_77_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_77_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_78=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_78, grammarAccess.getParallele3Access().getAmpersandKeyword_15_3());
                    			
                    // InternalMyTurtleDsl.g:3839:4: ( (lv_c_79_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:3840:5: (lv_c_79_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:3840:5: (lv_c_79_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:3841:6: lv_c_79_0= ruleRGRD
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
                    							"org.xtext.example.mydsl.MyTurtleDsl.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 17 :
                    // InternalMyTurtleDsl.g:3860:3: ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) )
                    {
                    // InternalMyTurtleDsl.g:3860:3: ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) )
                    // InternalMyTurtleDsl.g:3861:4: ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) )
                    {
                    // InternalMyTurtleDsl.g:3861:4: ( (lv_a_80_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:3862:5: (lv_a_80_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:3862:5: (lv_a_80_0= ruleMD )
                    // InternalMyTurtleDsl.g:3863:6: lv_a_80_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAMDParserRuleCall_16_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_a_80_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_80_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_81=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_81, grammarAccess.getParallele3Access().getAmpersandKeyword_16_1());
                    			
                    // InternalMyTurtleDsl.g:3884:4: ( (lv_b_82_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:3885:5: (lv_b_82_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:3885:5: (lv_b_82_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:3886:6: lv_b_82_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_16_2_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_b_82_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_82_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_83=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_83, grammarAccess.getParallele3Access().getAmpersandKeyword_16_3());
                    			
                    // InternalMyTurtleDsl.g:3907:4: ( (lv_c_84_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:3908:5: (lv_c_84_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:3908:5: (lv_c_84_0= ruleGDr )
                    // InternalMyTurtleDsl.g:3909:6: lv_c_84_0= ruleGDr
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
                    							"org.xtext.example.mydsl.MyTurtleDsl.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 18 :
                    // InternalMyTurtleDsl.g:3928:3: ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) )
                    {
                    // InternalMyTurtleDsl.g:3928:3: ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) )
                    // InternalMyTurtleDsl.g:3929:4: ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) )
                    {
                    // InternalMyTurtleDsl.g:3929:4: ( (lv_a_85_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:3930:5: (lv_a_85_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:3930:5: (lv_a_85_0= ruleMD )
                    // InternalMyTurtleDsl.g:3931:6: lv_a_85_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAMDParserRuleCall_17_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_a_85_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_85_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_86=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_86, grammarAccess.getParallele3Access().getAmpersandKeyword_17_1());
                    			
                    // InternalMyTurtleDsl.g:3952:4: ( (lv_b_87_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:3953:5: (lv_b_87_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:3953:5: (lv_b_87_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:3954:6: lv_b_87_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_17_2_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_b_87_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_87_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_88=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_88, grammarAccess.getParallele3Access().getAmpersandKeyword_17_3());
                    			
                    // InternalMyTurtleDsl.g:3975:4: ( (lv_c_89_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:3976:5: (lv_c_89_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:3976:5: (lv_c_89_0= ruleAR )
                    // InternalMyTurtleDsl.g:3977:6: lv_c_89_0= ruleAR
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
                    							"org.xtext.example.mydsl.MyTurtleDsl.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 19 :
                    // InternalMyTurtleDsl.g:3996:3: ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) )
                    {
                    // InternalMyTurtleDsl.g:3996:3: ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) )
                    // InternalMyTurtleDsl.g:3997:4: ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) )
                    {
                    // InternalMyTurtleDsl.g:3997:4: ( (lv_a_90_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:3998:5: (lv_a_90_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:3998:5: (lv_a_90_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:3999:6: lv_a_90_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getARGRDParserRuleCall_18_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_a_90_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_90_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_91=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_91, grammarAccess.getParallele3Access().getAmpersandKeyword_18_1());
                    			
                    // InternalMyTurtleDsl.g:4020:4: ( (lv_b_92_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:4021:5: (lv_b_92_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:4021:5: (lv_b_92_0= ruleAR )
                    // InternalMyTurtleDsl.g:4022:6: lv_b_92_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBARParserRuleCall_18_2_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_b_92_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_92_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_93=(Token)match(input,43,FOLLOW_34); 

                    				newLeafNode(otherlv_93, grammarAccess.getParallele3Access().getAmpersandKeyword_18_3());
                    			
                    // InternalMyTurtleDsl.g:4043:4: ( (lv_c_94_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:4044:5: (lv_c_94_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:4044:5: (lv_c_94_0= ruleMD )
                    // InternalMyTurtleDsl.g:4045:6: lv_c_94_0= ruleMD
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
                    							"org.xtext.example.mydsl.MyTurtleDsl.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 20 :
                    // InternalMyTurtleDsl.g:4064:3: ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) )
                    {
                    // InternalMyTurtleDsl.g:4064:3: ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) )
                    // InternalMyTurtleDsl.g:4065:4: ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) )
                    {
                    // InternalMyTurtleDsl.g:4065:4: ( (lv_a_95_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:4066:5: (lv_a_95_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:4066:5: (lv_a_95_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:4067:6: lv_a_95_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getARGRDParserRuleCall_19_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_a_95_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_95_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_96=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_96, grammarAccess.getParallele3Access().getAmpersandKeyword_19_1());
                    			
                    // InternalMyTurtleDsl.g:4088:4: ( (lv_b_97_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:4089:5: (lv_b_97_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:4089:5: (lv_b_97_0= ruleAR )
                    // InternalMyTurtleDsl.g:4090:6: lv_b_97_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBARParserRuleCall_19_2_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_b_97_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_97_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_98=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_98, grammarAccess.getParallele3Access().getAmpersandKeyword_19_3());
                    			
                    // InternalMyTurtleDsl.g:4111:4: ( (lv_c_99_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:4112:5: (lv_c_99_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:4112:5: (lv_c_99_0= ruleGDr )
                    // InternalMyTurtleDsl.g:4113:6: lv_c_99_0= ruleGDr
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
                    							"org.xtext.example.mydsl.MyTurtleDsl.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 21 :
                    // InternalMyTurtleDsl.g:4132:3: ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) )
                    {
                    // InternalMyTurtleDsl.g:4132:3: ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) )
                    // InternalMyTurtleDsl.g:4133:4: ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) )
                    {
                    // InternalMyTurtleDsl.g:4133:4: ( (lv_a_100_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:4134:5: (lv_a_100_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:4134:5: (lv_a_100_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:4135:6: lv_a_100_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getARGRDParserRuleCall_20_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_a_100_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_100_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_101=(Token)match(input,43,FOLLOW_34); 

                    				newLeafNode(otherlv_101, grammarAccess.getParallele3Access().getAmpersandKeyword_20_1());
                    			
                    // InternalMyTurtleDsl.g:4156:4: ( (lv_b_102_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:4157:5: (lv_b_102_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:4157:5: (lv_b_102_0= ruleMD )
                    // InternalMyTurtleDsl.g:4158:6: lv_b_102_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBMDParserRuleCall_20_2_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_b_102_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_102_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_103=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_103, grammarAccess.getParallele3Access().getAmpersandKeyword_20_3());
                    			
                    // InternalMyTurtleDsl.g:4179:4: ( (lv_c_104_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:4180:5: (lv_c_104_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:4180:5: (lv_c_104_0= ruleAR )
                    // InternalMyTurtleDsl.g:4181:6: lv_c_104_0= ruleAR
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
                    							"org.xtext.example.mydsl.MyTurtleDsl.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 22 :
                    // InternalMyTurtleDsl.g:4200:3: ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) )
                    {
                    // InternalMyTurtleDsl.g:4200:3: ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) )
                    // InternalMyTurtleDsl.g:4201:4: ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) )
                    {
                    // InternalMyTurtleDsl.g:4201:4: ( (lv_a_105_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:4202:5: (lv_a_105_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:4202:5: (lv_a_105_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:4203:6: lv_a_105_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getARGRDParserRuleCall_21_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_a_105_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_105_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_106=(Token)match(input,43,FOLLOW_34); 

                    				newLeafNode(otherlv_106, grammarAccess.getParallele3Access().getAmpersandKeyword_21_1());
                    			
                    // InternalMyTurtleDsl.g:4224:4: ( (lv_b_107_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:4225:5: (lv_b_107_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:4225:5: (lv_b_107_0= ruleMD )
                    // InternalMyTurtleDsl.g:4226:6: lv_b_107_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBMDParserRuleCall_21_2_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_b_107_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_107_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_108=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_108, grammarAccess.getParallele3Access().getAmpersandKeyword_21_3());
                    			
                    // InternalMyTurtleDsl.g:4247:4: ( (lv_c_109_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:4248:5: (lv_c_109_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:4248:5: (lv_c_109_0= ruleGDr )
                    // InternalMyTurtleDsl.g:4249:6: lv_c_109_0= ruleGDr
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
                    							"org.xtext.example.mydsl.MyTurtleDsl.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 23 :
                    // InternalMyTurtleDsl.g:4268:3: ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) )
                    {
                    // InternalMyTurtleDsl.g:4268:3: ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) )
                    // InternalMyTurtleDsl.g:4269:4: ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) )
                    {
                    // InternalMyTurtleDsl.g:4269:4: ( (lv_a_110_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:4270:5: (lv_a_110_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:4270:5: (lv_a_110_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:4271:6: lv_a_110_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getARGRDParserRuleCall_22_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_a_110_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_110_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_111=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_111, grammarAccess.getParallele3Access().getAmpersandKeyword_22_1());
                    			
                    // InternalMyTurtleDsl.g:4292:4: ( (lv_b_112_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:4293:5: (lv_b_112_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:4293:5: (lv_b_112_0= ruleGDr )
                    // InternalMyTurtleDsl.g:4294:6: lv_b_112_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBGDrParserRuleCall_22_2_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_b_112_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_112_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_113=(Token)match(input,43,FOLLOW_34); 

                    				newLeafNode(otherlv_113, grammarAccess.getParallele3Access().getAmpersandKeyword_22_3());
                    			
                    // InternalMyTurtleDsl.g:4315:4: ( (lv_c_114_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:4316:5: (lv_c_114_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:4316:5: (lv_c_114_0= ruleMD )
                    // InternalMyTurtleDsl.g:4317:6: lv_c_114_0= ruleMD
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
                    							"org.xtext.example.mydsl.MyTurtleDsl.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 24 :
                    // InternalMyTurtleDsl.g:4336:3: ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) )
                    {
                    // InternalMyTurtleDsl.g:4336:3: ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) )
                    // InternalMyTurtleDsl.g:4337:4: ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) )
                    {
                    // InternalMyTurtleDsl.g:4337:4: ( (lv_a_115_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:4338:5: (lv_a_115_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:4338:5: (lv_a_115_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:4339:6: lv_a_115_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getARGRDParserRuleCall_23_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_a_115_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_115_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_116=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_116, grammarAccess.getParallele3Access().getAmpersandKeyword_23_1());
                    			
                    // InternalMyTurtleDsl.g:4360:4: ( (lv_b_117_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:4361:5: (lv_b_117_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:4361:5: (lv_b_117_0= ruleGDr )
                    // InternalMyTurtleDsl.g:4362:6: lv_b_117_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBGDrParserRuleCall_23_2_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_b_117_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_117_0,
                    							"org.xtext.example.mydsl.MyTurtleDsl.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_118=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_118, grammarAccess.getParallele3Access().getAmpersandKeyword_23_3());
                    			
                    // InternalMyTurtleDsl.g:4383:4: ( (lv_c_119_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:4384:5: (lv_c_119_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:4384:5: (lv_c_119_0= ruleAR )
                    // InternalMyTurtleDsl.g:4385:6: lv_c_119_0= ruleAR
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
                    							"org.xtext.example.mydsl.MyTurtleDsl.AR");
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

    // Delegated rules


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String dfa_1s = "\107\uffff";
    static final String dfa_2s = "\1\6\3\uffff\10\33\1\uffff\10\6\10\37\2\34\6\37\5\4\1\uffff\3\4\20\34\10\6\1\uffff";
    static final String dfa_3s = "\1\52\3\uffff\10\33\1\uffff\10\7\20\37\5\6\1\uffff\3\6\20\34\10\53\1\uffff";
    static final String dfa_4s = "\1\uffff\1\6\1\1\1\2\10\uffff\1\4\35\uffff\1\3\33\uffff\1\5";
    static final String dfa_5s = "\107\uffff}>";
    static final String[] dfa_6s = {
            "\1\14\6\uffff\1\1\17\uffff\1\1\1\13\1\uffff\1\5\1\4\1\12\1\11\1\10\1\7\1\6\1\uffff\1\3\1\uffff\1\2",
            "",
            "",
            "",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "",
            "\1\26\1\25",
            "\1\30\1\27",
            "\1\32\1\31",
            "\1\34\1\33",
            "\1\36\1\35",
            "\1\40\1\37",
            "\1\42\1\41",
            "\1\44\1\43",
            "\1\45",
            "\1\45",
            "\1\46",
            "\1\46",
            "\1\47",
            "\1\47",
            "\1\50",
            "\1\50",
            "\1\52\2\uffff\1\51",
            "\1\52\2\uffff\1\51",
            "\1\53",
            "\1\53",
            "\1\54",
            "\1\54",
            "\1\55",
            "\1\55",
            "\1\56\1\uffff\1\57",
            "\1\60\1\uffff\1\61",
            "\1\62\1\uffff\1\63",
            "\1\64\1\uffff\1\65",
            "\1\66\1\uffff\1\67",
            "",
            "\1\70\1\uffff\1\71",
            "\1\72\1\uffff\1\73",
            "\1\74\1\uffff\1\75",
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
            "\1\105",
            "\1\105",
            "\1\52\6\uffff\1\52\17\uffff\2\52\1\uffff\7\52\1\uffff\1\52\1\uffff\1\52\1\106",
            "\1\52\6\uffff\1\52\17\uffff\2\52\1\uffff\7\52\1\uffff\1\52\1\uffff\1\52\1\106",
            "\1\52\6\uffff\1\52\17\uffff\2\52\1\uffff\7\52\1\uffff\1\52\1\uffff\1\52\1\106",
            "\1\52\6\uffff\1\52\17\uffff\2\52\1\uffff\7\52\1\uffff\1\52\1\uffff\1\52\1\106",
            "\1\52\6\uffff\1\52\17\uffff\2\52\1\uffff\7\52\1\uffff\1\52\1\uffff\1\52\1\106",
            "\1\52\6\uffff\1\52\17\uffff\2\52\1\uffff\7\52\1\uffff\1\52\1\uffff\1\52\1\106",
            "\1\52\6\uffff\1\52\17\uffff\2\52\1\uffff\7\52\1\uffff\1\52\1\uffff\1\52\1\106",
            "\1\52\6\uffff\1\52\17\uffff\2\52\1\uffff\7\52\1\uffff\1\52\1\uffff\1\52\1\106",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 313:3: ( ( (lv_SeconDec_4_0= ruleIntDecl ) ) | ( (lv_PourDec_5_0= rulePourcentDecl ) ) | ( (lv_statements_6_0= ruleStatement ) ) | ( (lv_fonctions_7_0= ruleFonctionCall ) ) | ( ( (lv_parallele_8_1= ruleParallele2 | lv_parallele_8_2= ruleParallele3 ) ) ) )*";
        }
    }
    static final String dfa_7s = "\u0107\uffff";
    static final String dfa_8s = "\1\36\10\33\10\6\20\37\10\4\20\34\10\53\1\41\3\36\30\33\30\6\60\37\30\4\60\34\30\6\2\uffff";
    static final String dfa_9s = "\1\46\10\33\10\7\20\37\10\6\20\34\10\53\2\46\1\44\1\46\30\33\30\7\60\37\30\6\60\34\30\53\2\uffff";
    static final String dfa_10s = "\u0105\uffff\1\2\1\1";
    static final String dfa_11s = "\u0107\uffff}>";
    static final String[] dfa_12s = {
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
            "\1\105\1\106\1\111\1\112\1\107\1\110",
            "\1\113\1\uffff\1\114\1\115\1\116\2\uffff\1\117\1\120",
            "\1\121\1\uffff\1\122\1\125\1\126\1\123\1\124",
            "\1\133\1\uffff\1\134\2\uffff\1\127\1\130\1\131\1\132",
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
            "\1\u0106\6\uffff\1\u0106\17\uffff\2\u0106\1\uffff\7\u0106\1\uffff\1\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\17\uffff\2\u0106\1\uffff\7\u0106\1\uffff\1\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\17\uffff\2\u0106\1\uffff\7\u0106\1\uffff\1\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\17\uffff\2\u0106\1\uffff\7\u0106\1\uffff\1\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\17\uffff\2\u0106\1\uffff\7\u0106\1\uffff\1\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\17\uffff\2\u0106\1\uffff\7\u0106\1\uffff\1\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\17\uffff\2\u0106\1\uffff\7\u0106\1\uffff\1\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\17\uffff\2\u0106\1\uffff\7\u0106\1\uffff\1\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\17\uffff\2\u0106\1\uffff\7\u0106\1\uffff\1\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\17\uffff\2\u0106\1\uffff\7\u0106\1\uffff\1\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\17\uffff\2\u0106\1\uffff\7\u0106\1\uffff\1\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\17\uffff\2\u0106\1\uffff\7\u0106\1\uffff\1\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\17\uffff\2\u0106\1\uffff\7\u0106\1\uffff\1\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\17\uffff\2\u0106\1\uffff\7\u0106\1\uffff\1\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\17\uffff\2\u0106\1\uffff\7\u0106\1\uffff\1\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\17\uffff\2\u0106\1\uffff\7\u0106\1\uffff\1\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\17\uffff\2\u0106\1\uffff\7\u0106\1\uffff\1\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\17\uffff\2\u0106\1\uffff\7\u0106\1\uffff\1\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\17\uffff\2\u0106\1\uffff\7\u0106\1\uffff\1\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\17\uffff\2\u0106\1\uffff\7\u0106\1\uffff\1\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\17\uffff\2\u0106\1\uffff\7\u0106\1\uffff\1\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\17\uffff\2\u0106\1\uffff\7\u0106\1\uffff\1\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\17\uffff\2\u0106\1\uffff\7\u0106\1\uffff\1\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\17\uffff\2\u0106\1\uffff\7\u0106\1\uffff\1\u0106\1\uffff\1\u0106\1\u0105",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "396:6: (lv_parallele_8_1= ruleParallele2 | lv_parallele_8_2= ruleParallele3 )";
        }
    }
    static final String dfa_13s = "\16\uffff";
    static final String dfa_14s = "\1\36\4\uffff\1\33\3\uffff\1\6\2\34\2\uffff";
    static final String dfa_15s = "\1\46\4\uffff\1\33\3\uffff\1\7\2\37\2\uffff";
    static final String dfa_16s = "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\7\1\10\1\11\3\uffff\1\6\1\5";
    static final String dfa_17s = "\16\uffff}>";
    static final String[] dfa_18s = {
            "\1\10\1\uffff\1\2\1\1\1\7\1\6\1\5\1\4\1\3",
            "",
            "",
            "",
            "",
            "\1\11",
            "",
            "",
            "",
            "\1\13\1\12",
            "\1\15\2\uffff\1\14",
            "\1\15\2\uffff\1\14",
            "",
            ""
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "1555:2: (this_Avancer_0= ruleAvancer | this_Descendre_1= ruleDescendre | this_RotationDroite_2= ruleRotationDroite | this_RotationGauche_3= ruleRotationGauche | this_Pause_4= rulePause | this_Droite_5= ruleDroite | this_Gauche_6= ruleGauche | this_Reculer_7= ruleReculer | this_Monter_8= ruleMonter )";
        }
    }
    static final String dfa_19s = "\121\uffff";
    static final String dfa_20s = "\1\36\10\33\10\6\20\37\10\4\20\34\10\53\1\41\3\36\14\uffff";
    static final String dfa_21s = "\1\46\10\33\10\7\20\37\10\6\20\34\10\53\2\46\1\44\1\46\14\uffff";
    static final String dfa_22s = "\105\uffff\1\1\1\3\1\2\1\5\1\4\1\6\1\7\1\11\1\10\1\13\1\12\1\14";
    static final String dfa_23s = "\121\uffff}>";
    static final String[] dfa_24s = {
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

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_19;
            this.eof = dfa_19;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "2213:2: ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) )";
        }
    }
    static final String dfa_25s = "\u0129\uffff";
    static final String dfa_26s = "\1\36\10\33\10\6\20\37\10\4\20\34\10\53\2\36\1\41\1\36\30\33\30\6\60\37\30\4\60\34\30\53\1\43\2\36\1\41\2\36\1\41\1\43\1\41\2\36\1\41\30\uffff";
    static final String dfa_27s = "\1\46\10\33\10\7\20\37\10\6\20\34\10\53\3\46\1\44\30\33\30\7\60\37\30\6\60\34\30\53\2\46\1\44\2\46\1\42\1\44\2\46\1\42\2\44\30\uffff";
    static final String dfa_28s = "\u0111\uffff\1\3\1\4\1\1\1\2\1\5\1\6\1\11\1\12\1\10\1\7\1\13\1\14\1\21\1\22\1\16\1\15\1\17\1\20\1\30\1\27\1\23\1\24\1\25\1\26";
    static final String dfa_29s = "\u0129\uffff}>";
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
            "\1\105\1\uffff\1\106\2\uffff\1\107\1\110\1\111\1\112",
            "\1\113\1\uffff\1\114\1\115\1\116\2\uffff\1\117\1\120",
            "\1\123\1\124\1\125\1\126\1\121\1\122",
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
            "\2\u0111\2\u0112",
            "\1\u0113\1\uffff\1\u0113\4\uffff\2\u0114",
            "\1\u0115\1\uffff\1\u0115\2\uffff\2\u0116",
            "\2\u0117\2\uffff\2\u0118",
            "\1\u011a\1\uffff\1\u011a\4\uffff\2\u0119",
            "\1\u011c\1\uffff\1\u011c\2\u011b",
            "\2\u011e\2\u011d",
            "\2\u0120\2\u011f",
            "\2\u0121\2\uffff\2\u0122",
            "\1\u0124\1\uffff\1\u0124\2\u0123",
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

    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[][] dfa_30 = unpackEncodedStringArray(dfa_30s);

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_25;
            this.eof = dfa_25;
            this.min = dfa_26;
            this.max = dfa_27;
            this.accept = dfa_28;
            this.special = dfa_29;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "2771:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) )";
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
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000057F60002040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000012000L});
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
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000007F40002000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000007F40000000L});

}