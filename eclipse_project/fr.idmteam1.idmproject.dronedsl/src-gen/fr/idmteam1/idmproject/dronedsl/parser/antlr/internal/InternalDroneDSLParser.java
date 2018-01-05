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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SECONDE", "RULE_POURCENT", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'<'", "'.lib_drone'", "'>'", "'define'", "'vitesse_hauteur_max'", "'vitesse_deplacement_max'", "'vitesse_rotation_max'", "'hauteur_max'", "'eloignement_max'", "'Seconde'", "'='", "'Pourcent'", "'decoller()'", "'atterrir()'", "'monter('", "','", "')'", "'descendre('", "'avancer('", "'reculer('", "'gauche('", "'droite('", "'rotation_gauche('", "'rotation_droite('", "'pause('", "'func'", "'()'", "'{'", "'}'", "'.'", "'main'", "'&'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
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
    public static final int RULE_POURCENT=6;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_SECONDE=5;
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
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
    // InternalDroneDSL.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_prologue_1_0= rulePrologue ) ) ( (lv_m_2_0= ruleMain ) ) ( (lv_fonctions_3_0= ruleFonctionDecl ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_prologue_1_0 = null;

        EObject lv_m_2_0 = null;

        EObject lv_fonctions_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:77:2: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_prologue_1_0= rulePrologue ) ) ( (lv_m_2_0= ruleMain ) ) ( (lv_fonctions_3_0= ruleFonctionDecl ) )* ) )
            // InternalDroneDSL.g:78:2: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_prologue_1_0= rulePrologue ) ) ( (lv_m_2_0= ruleMain ) ) ( (lv_fonctions_3_0= ruleFonctionDecl ) )* )
            {
            // InternalDroneDSL.g:78:2: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_prologue_1_0= rulePrologue ) ) ( (lv_m_2_0= ruleMain ) ) ( (lv_fonctions_3_0= ruleFonctionDecl ) )* )
            // InternalDroneDSL.g:79:3: ( (lv_imports_0_0= ruleImport ) )* ( (lv_prologue_1_0= rulePrologue ) ) ( (lv_m_2_0= ruleMain ) ) ( (lv_fonctions_3_0= ruleFonctionDecl ) )*
            {
            // InternalDroneDSL.g:79:3: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
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

            // InternalDroneDSL.g:98:3: ( (lv_prologue_1_0= rulePrologue ) )
            // InternalDroneDSL.g:99:4: (lv_prologue_1_0= rulePrologue )
            {
            // InternalDroneDSL.g:99:4: (lv_prologue_1_0= rulePrologue )
            // InternalDroneDSL.g:100:5: lv_prologue_1_0= rulePrologue
            {

            					newCompositeNode(grammarAccess.getModelAccess().getProloguePrologueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_prologue_1_0=rulePrologue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"prologue",
            						lv_prologue_1_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.Prologue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDroneDSL.g:117:3: ( (lv_m_2_0= ruleMain ) )
            // InternalDroneDSL.g:118:4: (lv_m_2_0= ruleMain )
            {
            // InternalDroneDSL.g:118:4: (lv_m_2_0= ruleMain )
            // InternalDroneDSL.g:119:5: lv_m_2_0= ruleMain
            {

            					newCompositeNode(grammarAccess.getModelAccess().getMMainParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_m_2_0=ruleMain();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"m",
            						lv_m_2_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.Main");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDroneDSL.g:136:3: ( (lv_fonctions_3_0= ruleFonctionDecl ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==39) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDroneDSL.g:137:4: (lv_fonctions_3_0= ruleFonctionDecl )
            	    {
            	    // InternalDroneDSL.g:137:4: (lv_fonctions_3_0= ruleFonctionDecl )
            	    // InternalDroneDSL.g:138:5: lv_fonctions_3_0= ruleFonctionDecl
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getFonctionsFonctionDeclParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_fonctions_3_0=ruleFonctionDecl();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fonctions",
            	    						lv_fonctions_3_0,
            	    						"fr.idmteam1.idmproject.dronedsl.DroneDSL.FonctionDecl");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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


    // $ANTLR start "entryRuleImport"
    // InternalDroneDSL.g:159:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalDroneDSL.g:159:47: (iv_ruleImport= ruleImport EOF )
            // InternalDroneDSL.g:160:2: iv_ruleImport= ruleImport EOF
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
    // InternalDroneDSL.g:166:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' otherlv_1= '<' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '.lib_drone' otherlv_4= '>' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalDroneDSL.g:172:2: ( (otherlv_0= 'import' otherlv_1= '<' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '.lib_drone' otherlv_4= '>' ) )
            // InternalDroneDSL.g:173:2: (otherlv_0= 'import' otherlv_1= '<' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '.lib_drone' otherlv_4= '>' )
            {
            // InternalDroneDSL.g:173:2: (otherlv_0= 'import' otherlv_1= '<' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '.lib_drone' otherlv_4= '>' )
            // InternalDroneDSL.g:174:3: otherlv_0= 'import' otherlv_1= '<' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '.lib_drone' otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getImportAccess().getLessThanSignKeyword_1());
            		
            // InternalDroneDSL.g:182:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDroneDSL.g:183:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDroneDSL.g:183:4: (lv_name_2_0= RULE_ID )
            // InternalDroneDSL.g:184:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_2_0, grammarAccess.getImportAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getImportAccess().getLib_droneKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getImportAccess().getGreaterThanSignKeyword_4());
            		

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
    // InternalDroneDSL.g:212:1: entryRulePourcent_vitesse_hauteur_max returns [EObject current=null] : iv_rulePourcent_vitesse_hauteur_max= rulePourcent_vitesse_hauteur_max EOF ;
    public final EObject entryRulePourcent_vitesse_hauteur_max() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePourcent_vitesse_hauteur_max = null;


        try {
            // InternalDroneDSL.g:212:69: (iv_rulePourcent_vitesse_hauteur_max= rulePourcent_vitesse_hauteur_max EOF )
            // InternalDroneDSL.g:213:2: iv_rulePourcent_vitesse_hauteur_max= rulePourcent_vitesse_hauteur_max EOF
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
    // InternalDroneDSL.g:219:1: rulePourcent_vitesse_hauteur_max returns [EObject current=null] : (otherlv_0= 'define' otherlv_1= 'vitesse_hauteur_max' ( (lv_vitesse_verticale_2_0= rulePourcentConst ) ) ) ;
    public final EObject rulePourcent_vitesse_hauteur_max() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_vitesse_verticale_2_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:225:2: ( (otherlv_0= 'define' otherlv_1= 'vitesse_hauteur_max' ( (lv_vitesse_verticale_2_0= rulePourcentConst ) ) ) )
            // InternalDroneDSL.g:226:2: (otherlv_0= 'define' otherlv_1= 'vitesse_hauteur_max' ( (lv_vitesse_verticale_2_0= rulePourcentConst ) ) )
            {
            // InternalDroneDSL.g:226:2: (otherlv_0= 'define' otherlv_1= 'vitesse_hauteur_max' ( (lv_vitesse_verticale_2_0= rulePourcentConst ) ) )
            // InternalDroneDSL.g:227:3: otherlv_0= 'define' otherlv_1= 'vitesse_hauteur_max' ( (lv_vitesse_verticale_2_0= rulePourcentConst ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getPourcent_vitesse_hauteur_maxAccess().getDefineKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getPourcent_vitesse_hauteur_maxAccess().getVitesse_hauteur_maxKeyword_1());
            		
            // InternalDroneDSL.g:235:3: ( (lv_vitesse_verticale_2_0= rulePourcentConst ) )
            // InternalDroneDSL.g:236:4: (lv_vitesse_verticale_2_0= rulePourcentConst )
            {
            // InternalDroneDSL.g:236:4: (lv_vitesse_verticale_2_0= rulePourcentConst )
            // InternalDroneDSL.g:237:5: lv_vitesse_verticale_2_0= rulePourcentConst
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
    // InternalDroneDSL.g:258:1: entryRulePourcent_vitesse_deplacement_max returns [EObject current=null] : iv_rulePourcent_vitesse_deplacement_max= rulePourcent_vitesse_deplacement_max EOF ;
    public final EObject entryRulePourcent_vitesse_deplacement_max() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePourcent_vitesse_deplacement_max = null;


        try {
            // InternalDroneDSL.g:258:73: (iv_rulePourcent_vitesse_deplacement_max= rulePourcent_vitesse_deplacement_max EOF )
            // InternalDroneDSL.g:259:2: iv_rulePourcent_vitesse_deplacement_max= rulePourcent_vitesse_deplacement_max EOF
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
    // InternalDroneDSL.g:265:1: rulePourcent_vitesse_deplacement_max returns [EObject current=null] : (otherlv_0= 'define' otherlv_1= 'vitesse_deplacement_max' ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) ) ) ;
    public final EObject rulePourcent_vitesse_deplacement_max() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_vitesse_deplacement_2_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:271:2: ( (otherlv_0= 'define' otherlv_1= 'vitesse_deplacement_max' ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) ) ) )
            // InternalDroneDSL.g:272:2: (otherlv_0= 'define' otherlv_1= 'vitesse_deplacement_max' ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) ) )
            {
            // InternalDroneDSL.g:272:2: (otherlv_0= 'define' otherlv_1= 'vitesse_deplacement_max' ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) ) )
            // InternalDroneDSL.g:273:3: otherlv_0= 'define' otherlv_1= 'vitesse_deplacement_max' ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getPourcent_vitesse_deplacement_maxAccess().getDefineKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getPourcent_vitesse_deplacement_maxAccess().getVitesse_deplacement_maxKeyword_1());
            		
            // InternalDroneDSL.g:281:3: ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) )
            // InternalDroneDSL.g:282:4: (lv_vitesse_deplacement_2_0= rulePourcentConst )
            {
            // InternalDroneDSL.g:282:4: (lv_vitesse_deplacement_2_0= rulePourcentConst )
            // InternalDroneDSL.g:283:5: lv_vitesse_deplacement_2_0= rulePourcentConst
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
    // InternalDroneDSL.g:304:1: entryRulePourcent_vitesse_rotation_max returns [EObject current=null] : iv_rulePourcent_vitesse_rotation_max= rulePourcent_vitesse_rotation_max EOF ;
    public final EObject entryRulePourcent_vitesse_rotation_max() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePourcent_vitesse_rotation_max = null;


        try {
            // InternalDroneDSL.g:304:70: (iv_rulePourcent_vitesse_rotation_max= rulePourcent_vitesse_rotation_max EOF )
            // InternalDroneDSL.g:305:2: iv_rulePourcent_vitesse_rotation_max= rulePourcent_vitesse_rotation_max EOF
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
    // InternalDroneDSL.g:311:1: rulePourcent_vitesse_rotation_max returns [EObject current=null] : (otherlv_0= 'define' otherlv_1= 'vitesse_rotation_max' ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) ) ) ;
    public final EObject rulePourcent_vitesse_rotation_max() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_vitesse_deplacement_2_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:317:2: ( (otherlv_0= 'define' otherlv_1= 'vitesse_rotation_max' ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) ) ) )
            // InternalDroneDSL.g:318:2: (otherlv_0= 'define' otherlv_1= 'vitesse_rotation_max' ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) ) )
            {
            // InternalDroneDSL.g:318:2: (otherlv_0= 'define' otherlv_1= 'vitesse_rotation_max' ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) ) )
            // InternalDroneDSL.g:319:3: otherlv_0= 'define' otherlv_1= 'vitesse_rotation_max' ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getPourcent_vitesse_rotation_maxAccess().getDefineKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getPourcent_vitesse_rotation_maxAccess().getVitesse_rotation_maxKeyword_1());
            		
            // InternalDroneDSL.g:327:3: ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) )
            // InternalDroneDSL.g:328:4: (lv_vitesse_deplacement_2_0= rulePourcentConst )
            {
            // InternalDroneDSL.g:328:4: (lv_vitesse_deplacement_2_0= rulePourcentConst )
            // InternalDroneDSL.g:329:5: lv_vitesse_deplacement_2_0= rulePourcentConst
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
    // InternalDroneDSL.g:350:1: entryRuleHauteur_max returns [EObject current=null] : iv_ruleHauteur_max= ruleHauteur_max EOF ;
    public final EObject entryRuleHauteur_max() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHauteur_max = null;


        try {
            // InternalDroneDSL.g:350:52: (iv_ruleHauteur_max= ruleHauteur_max EOF )
            // InternalDroneDSL.g:351:2: iv_ruleHauteur_max= ruleHauteur_max EOF
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
    // InternalDroneDSL.g:357:1: ruleHauteur_max returns [EObject current=null] : (otherlv_0= 'define' otherlv_1= 'hauteur_max' ( (lv_hauteur_max_2_0= ruleSecondeExp ) ) ) ;
    public final EObject ruleHauteur_max() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_hauteur_max_2_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:363:2: ( (otherlv_0= 'define' otherlv_1= 'hauteur_max' ( (lv_hauteur_max_2_0= ruleSecondeExp ) ) ) )
            // InternalDroneDSL.g:364:2: (otherlv_0= 'define' otherlv_1= 'hauteur_max' ( (lv_hauteur_max_2_0= ruleSecondeExp ) ) )
            {
            // InternalDroneDSL.g:364:2: (otherlv_0= 'define' otherlv_1= 'hauteur_max' ( (lv_hauteur_max_2_0= ruleSecondeExp ) ) )
            // InternalDroneDSL.g:365:3: otherlv_0= 'define' otherlv_1= 'hauteur_max' ( (lv_hauteur_max_2_0= ruleSecondeExp ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getHauteur_maxAccess().getDefineKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getHauteur_maxAccess().getHauteur_maxKeyword_1());
            		
            // InternalDroneDSL.g:373:3: ( (lv_hauteur_max_2_0= ruleSecondeExp ) )
            // InternalDroneDSL.g:374:4: (lv_hauteur_max_2_0= ruleSecondeExp )
            {
            // InternalDroneDSL.g:374:4: (lv_hauteur_max_2_0= ruleSecondeExp )
            // InternalDroneDSL.g:375:5: lv_hauteur_max_2_0= ruleSecondeExp
            {

            					newCompositeNode(grammarAccess.getHauteur_maxAccess().getHauteur_maxSecondeExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_hauteur_max_2_0=ruleSecondeExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHauteur_maxRule());
            					}
            					set(
            						current,
            						"hauteur_max",
            						lv_hauteur_max_2_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.SecondeExp");
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
    // InternalDroneDSL.g:396:1: entryRuleEloignement_max returns [EObject current=null] : iv_ruleEloignement_max= ruleEloignement_max EOF ;
    public final EObject entryRuleEloignement_max() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEloignement_max = null;


        try {
            // InternalDroneDSL.g:396:56: (iv_ruleEloignement_max= ruleEloignement_max EOF )
            // InternalDroneDSL.g:397:2: iv_ruleEloignement_max= ruleEloignement_max EOF
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
    // InternalDroneDSL.g:403:1: ruleEloignement_max returns [EObject current=null] : (otherlv_0= 'define' otherlv_1= 'eloignement_max' ( (lv_hauteur_max_2_0= ruleSecondeExp ) ) ) ;
    public final EObject ruleEloignement_max() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_hauteur_max_2_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:409:2: ( (otherlv_0= 'define' otherlv_1= 'eloignement_max' ( (lv_hauteur_max_2_0= ruleSecondeExp ) ) ) )
            // InternalDroneDSL.g:410:2: (otherlv_0= 'define' otherlv_1= 'eloignement_max' ( (lv_hauteur_max_2_0= ruleSecondeExp ) ) )
            {
            // InternalDroneDSL.g:410:2: (otherlv_0= 'define' otherlv_1= 'eloignement_max' ( (lv_hauteur_max_2_0= ruleSecondeExp ) ) )
            // InternalDroneDSL.g:411:3: otherlv_0= 'define' otherlv_1= 'eloignement_max' ( (lv_hauteur_max_2_0= ruleSecondeExp ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getEloignement_maxAccess().getDefineKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getEloignement_maxAccess().getEloignement_maxKeyword_1());
            		
            // InternalDroneDSL.g:419:3: ( (lv_hauteur_max_2_0= ruleSecondeExp ) )
            // InternalDroneDSL.g:420:4: (lv_hauteur_max_2_0= ruleSecondeExp )
            {
            // InternalDroneDSL.g:420:4: (lv_hauteur_max_2_0= ruleSecondeExp )
            // InternalDroneDSL.g:421:5: lv_hauteur_max_2_0= ruleSecondeExp
            {

            					newCompositeNode(grammarAccess.getEloignement_maxAccess().getHauteur_maxSecondeExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_hauteur_max_2_0=ruleSecondeExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEloignement_maxRule());
            					}
            					set(
            						current,
            						"hauteur_max",
            						lv_hauteur_max_2_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.SecondeExp");
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


    // $ANTLR start "entryRulePrologue"
    // InternalDroneDSL.g:442:1: entryRulePrologue returns [EObject current=null] : iv_rulePrologue= rulePrologue EOF ;
    public final EObject entryRulePrologue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrologue = null;


        try {
            // InternalDroneDSL.g:442:49: (iv_rulePrologue= rulePrologue EOF )
            // InternalDroneDSL.g:443:2: iv_rulePrologue= rulePrologue EOF
            {
             newCompositeNode(grammarAccess.getPrologueRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrologue=rulePrologue();

            state._fsp--;

             current =iv_rulePrologue; 
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
    // $ANTLR end "entryRulePrologue"


    // $ANTLR start "rulePrologue"
    // InternalDroneDSL.g:449:1: rulePrologue returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hauteur_4_0= ruleHauteur_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eloignement_5_0= ruleEloignement_max ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject rulePrologue() throws RecognitionException {
        EObject current = null;

        EObject lv_vitesse_verticale_1_0 = null;

        EObject lv_vitesse_deplacement_2_0 = null;

        EObject lv_vitesse_rotation_3_0 = null;

        EObject lv_hauteur_4_0 = null;

        EObject lv_eloignement_5_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:455:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hauteur_4_0= ruleHauteur_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eloignement_5_0= ruleEloignement_max ) ) ) ) ) )+ {...}?) ) ) )
            // InternalDroneDSL.g:456:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hauteur_4_0= ruleHauteur_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eloignement_5_0= ruleEloignement_max ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalDroneDSL.g:456:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hauteur_4_0= ruleHauteur_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eloignement_5_0= ruleEloignement_max ) ) ) ) ) )+ {...}?) ) )
            // InternalDroneDSL.g:457:3: ( ( ( ({...}? => ( ({...}? => ( (lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hauteur_4_0= ruleHauteur_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eloignement_5_0= ruleEloignement_max ) ) ) ) ) )+ {...}?) )
            {
            // InternalDroneDSL.g:457:3: ( ( ( ({...}? => ( ({...}? => ( (lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hauteur_4_0= ruleHauteur_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eloignement_5_0= ruleEloignement_max ) ) ) ) ) )+ {...}?) )
            // InternalDroneDSL.g:458:4: ( ( ({...}? => ( ({...}? => ( (lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hauteur_4_0= ruleHauteur_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eloignement_5_0= ruleEloignement_max ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getPrologueAccess().getUnorderedGroup());
            			
            // InternalDroneDSL.g:461:4: ( ( ({...}? => ( ({...}? => ( (lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hauteur_4_0= ruleHauteur_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eloignement_5_0= ruleEloignement_max ) ) ) ) ) )+ {...}?)
            // InternalDroneDSL.g:462:5: ( ({...}? => ( ({...}? => ( (lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hauteur_4_0= ruleHauteur_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eloignement_5_0= ruleEloignement_max ) ) ) ) ) )+ {...}?
            {
            // InternalDroneDSL.g:462:5: ( ({...}? => ( ({...}? => ( (lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hauteur_4_0= ruleHauteur_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eloignement_5_0= ruleEloignement_max ) ) ) ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=6;
                int LA3_0 = input.LA(1);

                if ( LA3_0 == 17 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getPrologueAccess().getUnorderedGroup(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getPrologueAccess().getUnorderedGroup(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getPrologueAccess().getUnorderedGroup(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getPrologueAccess().getUnorderedGroup(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getPrologueAccess().getUnorderedGroup(), 4) ) ) {
                    int LA3_2 = input.LA(2);

                    if ( LA3_2 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getPrologueAccess().getUnorderedGroup(), 0) ) {
                        alt3=1;
                    }
                    else if ( LA3_2 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getPrologueAccess().getUnorderedGroup(), 1) ) {
                        alt3=2;
                    }
                    else if ( LA3_2 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getPrologueAccess().getUnorderedGroup(), 2) ) {
                        alt3=3;
                    }
                    else if ( LA3_2 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getPrologueAccess().getUnorderedGroup(), 3) ) {
                        alt3=4;
                    }
                    else if ( LA3_2 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getPrologueAccess().getUnorderedGroup(), 4) ) {
                        alt3=5;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // InternalDroneDSL.g:463:3: ({...}? => ( ({...}? => ( (lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max ) ) ) ) )
            	    {
            	    // InternalDroneDSL.g:463:3: ({...}? => ( ({...}? => ( (lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max ) ) ) ) )
            	    // InternalDroneDSL.g:464:4: {...}? => ( ({...}? => ( (lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPrologueAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePrologue", "getUnorderedGroupHelper().canSelect(grammarAccess.getPrologueAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalDroneDSL.g:464:102: ( ({...}? => ( (lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max ) ) ) )
            	    // InternalDroneDSL.g:465:5: ({...}? => ( (lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPrologueAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalDroneDSL.g:468:8: ({...}? => ( (lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max ) ) )
            	    // InternalDroneDSL.g:468:9: {...}? => ( (lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePrologue", "true");
            	    }
            	    // InternalDroneDSL.g:468:18: ( (lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max ) )
            	    // InternalDroneDSL.g:468:19: (lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max )
            	    {
            	    // InternalDroneDSL.g:468:19: (lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max )
            	    // InternalDroneDSL.g:469:9: lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max
            	    {

            	    									newCompositeNode(grammarAccess.getPrologueAccess().getVitesse_verticalePourcent_vitesse_hauteur_maxParserRuleCall_0_0());
            	    								
            	    pushFollow(FOLLOW_17);
            	    lv_vitesse_verticale_1_0=rulePourcent_vitesse_hauteur_max();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getPrologueRule());
            	    									}
            	    									set(
            	    										current,
            	    										"vitesse_verticale",
            	    										lv_vitesse_verticale_1_0,
            	    										"fr.idmteam1.idmproject.dronedsl.DroneDSL.Pourcent_vitesse_hauteur_max");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPrologueAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDroneDSL.g:491:3: ({...}? => ( ({...}? => ( (lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max ) ) ) ) )
            	    {
            	    // InternalDroneDSL.g:491:3: ({...}? => ( ({...}? => ( (lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max ) ) ) ) )
            	    // InternalDroneDSL.g:492:4: {...}? => ( ({...}? => ( (lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPrologueAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePrologue", "getUnorderedGroupHelper().canSelect(grammarAccess.getPrologueAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalDroneDSL.g:492:102: ( ({...}? => ( (lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max ) ) ) )
            	    // InternalDroneDSL.g:493:5: ({...}? => ( (lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPrologueAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalDroneDSL.g:496:8: ({...}? => ( (lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max ) ) )
            	    // InternalDroneDSL.g:496:9: {...}? => ( (lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePrologue", "true");
            	    }
            	    // InternalDroneDSL.g:496:18: ( (lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max ) )
            	    // InternalDroneDSL.g:496:19: (lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max )
            	    {
            	    // InternalDroneDSL.g:496:19: (lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max )
            	    // InternalDroneDSL.g:497:9: lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max
            	    {

            	    									newCompositeNode(grammarAccess.getPrologueAccess().getVitesse_deplacementPourcent_vitesse_deplacement_maxParserRuleCall_1_0());
            	    								
            	    pushFollow(FOLLOW_17);
            	    lv_vitesse_deplacement_2_0=rulePourcent_vitesse_deplacement_max();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getPrologueRule());
            	    									}
            	    									set(
            	    										current,
            	    										"vitesse_deplacement",
            	    										lv_vitesse_deplacement_2_0,
            	    										"fr.idmteam1.idmproject.dronedsl.DroneDSL.Pourcent_vitesse_deplacement_max");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPrologueAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDroneDSL.g:519:3: ({...}? => ( ({...}? => ( (lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max ) ) ) ) )
            	    {
            	    // InternalDroneDSL.g:519:3: ({...}? => ( ({...}? => ( (lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max ) ) ) ) )
            	    // InternalDroneDSL.g:520:4: {...}? => ( ({...}? => ( (lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPrologueAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "rulePrologue", "getUnorderedGroupHelper().canSelect(grammarAccess.getPrologueAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalDroneDSL.g:520:102: ( ({...}? => ( (lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max ) ) ) )
            	    // InternalDroneDSL.g:521:5: ({...}? => ( (lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPrologueAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalDroneDSL.g:524:8: ({...}? => ( (lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max ) ) )
            	    // InternalDroneDSL.g:524:9: {...}? => ( (lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePrologue", "true");
            	    }
            	    // InternalDroneDSL.g:524:18: ( (lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max ) )
            	    // InternalDroneDSL.g:524:19: (lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max )
            	    {
            	    // InternalDroneDSL.g:524:19: (lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max )
            	    // InternalDroneDSL.g:525:9: lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max
            	    {

            	    									newCompositeNode(grammarAccess.getPrologueAccess().getVitesse_rotationPourcent_vitesse_rotation_maxParserRuleCall_2_0());
            	    								
            	    pushFollow(FOLLOW_17);
            	    lv_vitesse_rotation_3_0=rulePourcent_vitesse_rotation_max();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getPrologueRule());
            	    									}
            	    									set(
            	    										current,
            	    										"vitesse_rotation",
            	    										lv_vitesse_rotation_3_0,
            	    										"fr.idmteam1.idmproject.dronedsl.DroneDSL.Pourcent_vitesse_rotation_max");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPrologueAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalDroneDSL.g:547:3: ({...}? => ( ({...}? => ( (lv_hauteur_4_0= ruleHauteur_max ) ) ) ) )
            	    {
            	    // InternalDroneDSL.g:547:3: ({...}? => ( ({...}? => ( (lv_hauteur_4_0= ruleHauteur_max ) ) ) ) )
            	    // InternalDroneDSL.g:548:4: {...}? => ( ({...}? => ( (lv_hauteur_4_0= ruleHauteur_max ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPrologueAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "rulePrologue", "getUnorderedGroupHelper().canSelect(grammarAccess.getPrologueAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalDroneDSL.g:548:102: ( ({...}? => ( (lv_hauteur_4_0= ruleHauteur_max ) ) ) )
            	    // InternalDroneDSL.g:549:5: ({...}? => ( (lv_hauteur_4_0= ruleHauteur_max ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPrologueAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalDroneDSL.g:552:8: ({...}? => ( (lv_hauteur_4_0= ruleHauteur_max ) ) )
            	    // InternalDroneDSL.g:552:9: {...}? => ( (lv_hauteur_4_0= ruleHauteur_max ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePrologue", "true");
            	    }
            	    // InternalDroneDSL.g:552:18: ( (lv_hauteur_4_0= ruleHauteur_max ) )
            	    // InternalDroneDSL.g:552:19: (lv_hauteur_4_0= ruleHauteur_max )
            	    {
            	    // InternalDroneDSL.g:552:19: (lv_hauteur_4_0= ruleHauteur_max )
            	    // InternalDroneDSL.g:553:9: lv_hauteur_4_0= ruleHauteur_max
            	    {

            	    									newCompositeNode(grammarAccess.getPrologueAccess().getHauteurHauteur_maxParserRuleCall_3_0());
            	    								
            	    pushFollow(FOLLOW_17);
            	    lv_hauteur_4_0=ruleHauteur_max();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getPrologueRule());
            	    									}
            	    									set(
            	    										current,
            	    										"hauteur",
            	    										lv_hauteur_4_0,
            	    										"fr.idmteam1.idmproject.dronedsl.DroneDSL.Hauteur_max");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPrologueAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalDroneDSL.g:575:3: ({...}? => ( ({...}? => ( (lv_eloignement_5_0= ruleEloignement_max ) ) ) ) )
            	    {
            	    // InternalDroneDSL.g:575:3: ({...}? => ( ({...}? => ( (lv_eloignement_5_0= ruleEloignement_max ) ) ) ) )
            	    // InternalDroneDSL.g:576:4: {...}? => ( ({...}? => ( (lv_eloignement_5_0= ruleEloignement_max ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPrologueAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "rulePrologue", "getUnorderedGroupHelper().canSelect(grammarAccess.getPrologueAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalDroneDSL.g:576:102: ( ({...}? => ( (lv_eloignement_5_0= ruleEloignement_max ) ) ) )
            	    // InternalDroneDSL.g:577:5: ({...}? => ( (lv_eloignement_5_0= ruleEloignement_max ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPrologueAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalDroneDSL.g:580:8: ({...}? => ( (lv_eloignement_5_0= ruleEloignement_max ) ) )
            	    // InternalDroneDSL.g:580:9: {...}? => ( (lv_eloignement_5_0= ruleEloignement_max ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePrologue", "true");
            	    }
            	    // InternalDroneDSL.g:580:18: ( (lv_eloignement_5_0= ruleEloignement_max ) )
            	    // InternalDroneDSL.g:580:19: (lv_eloignement_5_0= ruleEloignement_max )
            	    {
            	    // InternalDroneDSL.g:580:19: (lv_eloignement_5_0= ruleEloignement_max )
            	    // InternalDroneDSL.g:581:9: lv_eloignement_5_0= ruleEloignement_max
            	    {

            	    									newCompositeNode(grammarAccess.getPrologueAccess().getEloignementEloignement_maxParserRuleCall_4_0());
            	    								
            	    pushFollow(FOLLOW_17);
            	    lv_eloignement_5_0=ruleEloignement_max();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getPrologueRule());
            	    									}
            	    									set(
            	    										current,
            	    										"eloignement",
            	    										lv_eloignement_5_0,
            	    										"fr.idmteam1.idmproject.dronedsl.DroneDSL.Eloignement_max");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPrologueAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getPrologueAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "rulePrologue", "getUnorderedGroupHelper().canLeave(grammarAccess.getPrologueAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getPrologueAccess().getUnorderedGroup());
            			

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
    // $ANTLR end "rulePrologue"


    // $ANTLR start "entryRuleSecondeConst"
    // InternalDroneDSL.g:614:1: entryRuleSecondeConst returns [EObject current=null] : iv_ruleSecondeConst= ruleSecondeConst EOF ;
    public final EObject entryRuleSecondeConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecondeConst = null;


        try {
            // InternalDroneDSL.g:614:53: (iv_ruleSecondeConst= ruleSecondeConst EOF )
            // InternalDroneDSL.g:615:2: iv_ruleSecondeConst= ruleSecondeConst EOF
            {
             newCompositeNode(grammarAccess.getSecondeConstRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSecondeConst=ruleSecondeConst();

            state._fsp--;

             current =iv_ruleSecondeConst; 
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
    // $ANTLR end "entryRuleSecondeConst"


    // $ANTLR start "ruleSecondeConst"
    // InternalDroneDSL.g:621:1: ruleSecondeConst returns [EObject current=null] : ( (lv_val_0_0= RULE_SECONDE ) ) ;
    public final EObject ruleSecondeConst() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalDroneDSL.g:627:2: ( ( (lv_val_0_0= RULE_SECONDE ) ) )
            // InternalDroneDSL.g:628:2: ( (lv_val_0_0= RULE_SECONDE ) )
            {
            // InternalDroneDSL.g:628:2: ( (lv_val_0_0= RULE_SECONDE ) )
            // InternalDroneDSL.g:629:3: (lv_val_0_0= RULE_SECONDE )
            {
            // InternalDroneDSL.g:629:3: (lv_val_0_0= RULE_SECONDE )
            // InternalDroneDSL.g:630:4: lv_val_0_0= RULE_SECONDE
            {
            lv_val_0_0=(Token)match(input,RULE_SECONDE,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getSecondeConstAccess().getValSECONDETerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSecondeConstRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
            					"fr.idmteam1.idmproject.dronedsl.DroneDSL.SECONDE");
            			

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
    // $ANTLR end "ruleSecondeConst"


    // $ANTLR start "entryRulePourcentConst"
    // InternalDroneDSL.g:649:1: entryRulePourcentConst returns [EObject current=null] : iv_rulePourcentConst= rulePourcentConst EOF ;
    public final EObject entryRulePourcentConst() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePourcentConst = null;


        try {
            // InternalDroneDSL.g:649:54: (iv_rulePourcentConst= rulePourcentConst EOF )
            // InternalDroneDSL.g:650:2: iv_rulePourcentConst= rulePourcentConst EOF
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
    // InternalDroneDSL.g:656:1: rulePourcentConst returns [EObject current=null] : ( (lv_val_0_0= RULE_POURCENT ) ) ;
    public final EObject rulePourcentConst() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalDroneDSL.g:662:2: ( ( (lv_val_0_0= RULE_POURCENT ) ) )
            // InternalDroneDSL.g:663:2: ( (lv_val_0_0= RULE_POURCENT ) )
            {
            // InternalDroneDSL.g:663:2: ( (lv_val_0_0= RULE_POURCENT ) )
            // InternalDroneDSL.g:664:3: (lv_val_0_0= RULE_POURCENT )
            {
            // InternalDroneDSL.g:664:3: (lv_val_0_0= RULE_POURCENT )
            // InternalDroneDSL.g:665:4: lv_val_0_0= RULE_POURCENT
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


    // $ANTLR start "entryRuleSecondeDecl"
    // InternalDroneDSL.g:684:1: entryRuleSecondeDecl returns [EObject current=null] : iv_ruleSecondeDecl= ruleSecondeDecl EOF ;
    public final EObject entryRuleSecondeDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecondeDecl = null;


        try {
            // InternalDroneDSL.g:684:52: (iv_ruleSecondeDecl= ruleSecondeDecl EOF )
            // InternalDroneDSL.g:685:2: iv_ruleSecondeDecl= ruleSecondeDecl EOF
            {
             newCompositeNode(grammarAccess.getSecondeDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSecondeDecl=ruleSecondeDecl();

            state._fsp--;

             current =iv_ruleSecondeDecl; 
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
    // $ANTLR end "entryRuleSecondeDecl"


    // $ANTLR start "ruleSecondeDecl"
    // InternalDroneDSL.g:691:1: ruleSecondeDecl returns [EObject current=null] : (otherlv_0= 'Seconde' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleSecondeConst ) ) ) ;
    public final EObject ruleSecondeDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_val_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:697:2: ( (otherlv_0= 'Seconde' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleSecondeConst ) ) ) )
            // InternalDroneDSL.g:698:2: (otherlv_0= 'Seconde' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleSecondeConst ) ) )
            {
            // InternalDroneDSL.g:698:2: (otherlv_0= 'Seconde' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleSecondeConst ) ) )
            // InternalDroneDSL.g:699:3: otherlv_0= 'Seconde' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleSecondeConst ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getSecondeDeclAccess().getSecondeKeyword_0());
            		
            // InternalDroneDSL.g:703:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDroneDSL.g:704:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDroneDSL.g:704:4: (lv_name_1_0= RULE_ID )
            // InternalDroneDSL.g:705:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSecondeDeclAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSecondeDeclRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getSecondeDeclAccess().getEqualsSignKeyword_2());
            		
            // InternalDroneDSL.g:725:3: ( (lv_val_3_0= ruleSecondeConst ) )
            // InternalDroneDSL.g:726:4: (lv_val_3_0= ruleSecondeConst )
            {
            // InternalDroneDSL.g:726:4: (lv_val_3_0= ruleSecondeConst )
            // InternalDroneDSL.g:727:5: lv_val_3_0= ruleSecondeConst
            {

            					newCompositeNode(grammarAccess.getSecondeDeclAccess().getValSecondeConstParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_3_0=ruleSecondeConst();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSecondeDeclRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_3_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.SecondeConst");
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
    // $ANTLR end "ruleSecondeDecl"


    // $ANTLR start "entryRulePourcentDecl"
    // InternalDroneDSL.g:748:1: entryRulePourcentDecl returns [EObject current=null] : iv_rulePourcentDecl= rulePourcentDecl EOF ;
    public final EObject entryRulePourcentDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePourcentDecl = null;


        try {
            // InternalDroneDSL.g:748:53: (iv_rulePourcentDecl= rulePourcentDecl EOF )
            // InternalDroneDSL.g:749:2: iv_rulePourcentDecl= rulePourcentDecl EOF
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
    // InternalDroneDSL.g:755:1: rulePourcentDecl returns [EObject current=null] : (otherlv_0= 'Pourcent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= rulePourcentConst ) ) ) ;
    public final EObject rulePourcentDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_val_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:761:2: ( (otherlv_0= 'Pourcent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= rulePourcentConst ) ) ) )
            // InternalDroneDSL.g:762:2: (otherlv_0= 'Pourcent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= rulePourcentConst ) ) )
            {
            // InternalDroneDSL.g:762:2: (otherlv_0= 'Pourcent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= rulePourcentConst ) ) )
            // InternalDroneDSL.g:763:3: otherlv_0= 'Pourcent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= rulePourcentConst ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPourcentDeclAccess().getPourcentKeyword_0());
            		
            // InternalDroneDSL.g:767:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDroneDSL.g:768:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDroneDSL.g:768:4: (lv_name_1_0= RULE_ID )
            // InternalDroneDSL.g:769:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_18); 

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

            otherlv_2=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getPourcentDeclAccess().getEqualsSignKeyword_2());
            		
            // InternalDroneDSL.g:789:3: ( (lv_val_3_0= rulePourcentConst ) )
            // InternalDroneDSL.g:790:4: (lv_val_3_0= rulePourcentConst )
            {
            // InternalDroneDSL.g:790:4: (lv_val_3_0= rulePourcentConst )
            // InternalDroneDSL.g:791:5: lv_val_3_0= rulePourcentConst
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


    // $ANTLR start "entryRuleVarDecl"
    // InternalDroneDSL.g:812:1: entryRuleVarDecl returns [EObject current=null] : iv_ruleVarDecl= ruleVarDecl EOF ;
    public final EObject entryRuleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDecl = null;


        try {
            // InternalDroneDSL.g:812:48: (iv_ruleVarDecl= ruleVarDecl EOF )
            // InternalDroneDSL.g:813:2: iv_ruleVarDecl= ruleVarDecl EOF
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
    // InternalDroneDSL.g:819:1: ruleVarDecl returns [EObject current=null] : (this_PourcentDecl_0= rulePourcentDecl | this_SecondeDecl_1= ruleSecondeDecl ) ;
    public final EObject ruleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject this_PourcentDecl_0 = null;

        EObject this_SecondeDecl_1 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:825:2: ( (this_PourcentDecl_0= rulePourcentDecl | this_SecondeDecl_1= ruleSecondeDecl ) )
            // InternalDroneDSL.g:826:2: (this_PourcentDecl_0= rulePourcentDecl | this_SecondeDecl_1= ruleSecondeDecl )
            {
            // InternalDroneDSL.g:826:2: (this_PourcentDecl_0= rulePourcentDecl | this_SecondeDecl_1= ruleSecondeDecl )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            else if ( (LA4_0==23) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDroneDSL.g:827:3: this_PourcentDecl_0= rulePourcentDecl
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
                    // InternalDroneDSL.g:836:3: this_SecondeDecl_1= ruleSecondeDecl
                    {

                    			newCompositeNode(grammarAccess.getVarDeclAccess().getSecondeDeclParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SecondeDecl_1=ruleSecondeDecl();

                    state._fsp--;


                    			current = this_SecondeDecl_1;
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


    // $ANTLR start "entryRuleRefSecondeVar"
    // InternalDroneDSL.g:848:1: entryRuleRefSecondeVar returns [EObject current=null] : iv_ruleRefSecondeVar= ruleRefSecondeVar EOF ;
    public final EObject entryRuleRefSecondeVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefSecondeVar = null;


        try {
            // InternalDroneDSL.g:848:54: (iv_ruleRefSecondeVar= ruleRefSecondeVar EOF )
            // InternalDroneDSL.g:849:2: iv_ruleRefSecondeVar= ruleRefSecondeVar EOF
            {
             newCompositeNode(grammarAccess.getRefSecondeVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRefSecondeVar=ruleRefSecondeVar();

            state._fsp--;

             current =iv_ruleRefSecondeVar; 
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
    // $ANTLR end "entryRuleRefSecondeVar"


    // $ANTLR start "ruleRefSecondeVar"
    // InternalDroneDSL.g:855:1: ruleRefSecondeVar returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleRefSecondeVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDroneDSL.g:861:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalDroneDSL.g:862:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalDroneDSL.g:862:2: ( (otherlv_0= RULE_ID ) )
            // InternalDroneDSL.g:863:3: (otherlv_0= RULE_ID )
            {
            // InternalDroneDSL.g:863:3: (otherlv_0= RULE_ID )
            // InternalDroneDSL.g:864:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRefSecondeVarRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getRefSecondeVarAccess().getVarSecondeDeclCrossReference_0());
            			

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
    // $ANTLR end "ruleRefSecondeVar"


    // $ANTLR start "entryRuleRefPourcentVar"
    // InternalDroneDSL.g:878:1: entryRuleRefPourcentVar returns [EObject current=null] : iv_ruleRefPourcentVar= ruleRefPourcentVar EOF ;
    public final EObject entryRuleRefPourcentVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefPourcentVar = null;


        try {
            // InternalDroneDSL.g:878:55: (iv_ruleRefPourcentVar= ruleRefPourcentVar EOF )
            // InternalDroneDSL.g:879:2: iv_ruleRefPourcentVar= ruleRefPourcentVar EOF
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
    // InternalDroneDSL.g:885:1: ruleRefPourcentVar returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleRefPourcentVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDroneDSL.g:891:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalDroneDSL.g:892:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalDroneDSL.g:892:2: ( (otherlv_0= RULE_ID ) )
            // InternalDroneDSL.g:893:3: (otherlv_0= RULE_ID )
            {
            // InternalDroneDSL.g:893:3: (otherlv_0= RULE_ID )
            // InternalDroneDSL.g:894:4: otherlv_0= RULE_ID
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


    // $ANTLR start "entryRulePourcentExp"
    // InternalDroneDSL.g:908:1: entryRulePourcentExp returns [EObject current=null] : iv_rulePourcentExp= rulePourcentExp EOF ;
    public final EObject entryRulePourcentExp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePourcentExp = null;


        try {
            // InternalDroneDSL.g:908:52: (iv_rulePourcentExp= rulePourcentExp EOF )
            // InternalDroneDSL.g:909:2: iv_rulePourcentExp= rulePourcentExp EOF
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
    // InternalDroneDSL.g:915:1: rulePourcentExp returns [EObject current=null] : (this_PourcentConst_0= rulePourcentConst | this_RefPourcentVar_1= ruleRefPourcentVar ) ;
    public final EObject rulePourcentExp() throws RecognitionException {
        EObject current = null;

        EObject this_PourcentConst_0 = null;

        EObject this_RefPourcentVar_1 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:921:2: ( (this_PourcentConst_0= rulePourcentConst | this_RefPourcentVar_1= ruleRefPourcentVar ) )
            // InternalDroneDSL.g:922:2: (this_PourcentConst_0= rulePourcentConst | this_RefPourcentVar_1= ruleRefPourcentVar )
            {
            // InternalDroneDSL.g:922:2: (this_PourcentConst_0= rulePourcentConst | this_RefPourcentVar_1= ruleRefPourcentVar )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_POURCENT) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDroneDSL.g:923:3: this_PourcentConst_0= rulePourcentConst
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
                    // InternalDroneDSL.g:932:3: this_RefPourcentVar_1= ruleRefPourcentVar
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


    // $ANTLR start "entryRuleSecondeExp"
    // InternalDroneDSL.g:944:1: entryRuleSecondeExp returns [EObject current=null] : iv_ruleSecondeExp= ruleSecondeExp EOF ;
    public final EObject entryRuleSecondeExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecondeExp = null;


        try {
            // InternalDroneDSL.g:944:51: (iv_ruleSecondeExp= ruleSecondeExp EOF )
            // InternalDroneDSL.g:945:2: iv_ruleSecondeExp= ruleSecondeExp EOF
            {
             newCompositeNode(grammarAccess.getSecondeExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSecondeExp=ruleSecondeExp();

            state._fsp--;

             current =iv_ruleSecondeExp; 
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
    // $ANTLR end "entryRuleSecondeExp"


    // $ANTLR start "ruleSecondeExp"
    // InternalDroneDSL.g:951:1: ruleSecondeExp returns [EObject current=null] : (this_SecondeConst_0= ruleSecondeConst | this_RefSecondeVar_1= ruleRefSecondeVar ) ;
    public final EObject ruleSecondeExp() throws RecognitionException {
        EObject current = null;

        EObject this_SecondeConst_0 = null;

        EObject this_RefSecondeVar_1 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:957:2: ( (this_SecondeConst_0= ruleSecondeConst | this_RefSecondeVar_1= ruleRefSecondeVar ) )
            // InternalDroneDSL.g:958:2: (this_SecondeConst_0= ruleSecondeConst | this_RefSecondeVar_1= ruleRefSecondeVar )
            {
            // InternalDroneDSL.g:958:2: (this_SecondeConst_0= ruleSecondeConst | this_RefSecondeVar_1= ruleRefSecondeVar )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_SECONDE) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDroneDSL.g:959:3: this_SecondeConst_0= ruleSecondeConst
                    {

                    			newCompositeNode(grammarAccess.getSecondeExpAccess().getSecondeConstParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SecondeConst_0=ruleSecondeConst();

                    state._fsp--;


                    			current = this_SecondeConst_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDroneDSL.g:968:3: this_RefSecondeVar_1= ruleRefSecondeVar
                    {

                    			newCompositeNode(grammarAccess.getSecondeExpAccess().getRefSecondeVarParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RefSecondeVar_1=ruleRefSecondeVar();

                    state._fsp--;


                    			current = this_RefSecondeVar_1;
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
    // $ANTLR end "ruleSecondeExp"


    // $ANTLR start "entryRuleDecoller"
    // InternalDroneDSL.g:980:1: entryRuleDecoller returns [EObject current=null] : iv_ruleDecoller= ruleDecoller EOF ;
    public final EObject entryRuleDecoller() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecoller = null;


        try {
            // InternalDroneDSL.g:980:49: (iv_ruleDecoller= ruleDecoller EOF )
            // InternalDroneDSL.g:981:2: iv_ruleDecoller= ruleDecoller EOF
            {
             newCompositeNode(grammarAccess.getDecollerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecoller=ruleDecoller();

            state._fsp--;

             current =iv_ruleDecoller; 
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
    // InternalDroneDSL.g:987:1: ruleDecoller returns [EObject current=null] : ( (lv_str_0_0= 'decoller()' ) ) ;
    public final EObject ruleDecoller() throws RecognitionException {
        EObject current = null;

        Token lv_str_0_0=null;


        	enterRule();

        try {
            // InternalDroneDSL.g:993:2: ( ( (lv_str_0_0= 'decoller()' ) ) )
            // InternalDroneDSL.g:994:2: ( (lv_str_0_0= 'decoller()' ) )
            {
            // InternalDroneDSL.g:994:2: ( (lv_str_0_0= 'decoller()' ) )
            // InternalDroneDSL.g:995:3: (lv_str_0_0= 'decoller()' )
            {
            // InternalDroneDSL.g:995:3: (lv_str_0_0= 'decoller()' )
            // InternalDroneDSL.g:996:4: lv_str_0_0= 'decoller()'
            {
            lv_str_0_0=(Token)match(input,26,FOLLOW_2); 

            				newLeafNode(lv_str_0_0, grammarAccess.getDecollerAccess().getStrDecollerKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDecollerRule());
            				}
            				setWithLastConsumed(current, "str", lv_str_0_0, "decoller()");
            			

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
    // $ANTLR end "ruleDecoller"


    // $ANTLR start "entryRuleAtterrir"
    // InternalDroneDSL.g:1011:1: entryRuleAtterrir returns [EObject current=null] : iv_ruleAtterrir= ruleAtterrir EOF ;
    public final EObject entryRuleAtterrir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtterrir = null;


        try {
            // InternalDroneDSL.g:1011:49: (iv_ruleAtterrir= ruleAtterrir EOF )
            // InternalDroneDSL.g:1012:2: iv_ruleAtterrir= ruleAtterrir EOF
            {
             newCompositeNode(grammarAccess.getAtterrirRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtterrir=ruleAtterrir();

            state._fsp--;

             current =iv_ruleAtterrir; 
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
    // InternalDroneDSL.g:1018:1: ruleAtterrir returns [EObject current=null] : ( (lv_str_0_0= 'atterrir()' ) ) ;
    public final EObject ruleAtterrir() throws RecognitionException {
        EObject current = null;

        Token lv_str_0_0=null;


        	enterRule();

        try {
            // InternalDroneDSL.g:1024:2: ( ( (lv_str_0_0= 'atterrir()' ) ) )
            // InternalDroneDSL.g:1025:2: ( (lv_str_0_0= 'atterrir()' ) )
            {
            // InternalDroneDSL.g:1025:2: ( (lv_str_0_0= 'atterrir()' ) )
            // InternalDroneDSL.g:1026:3: (lv_str_0_0= 'atterrir()' )
            {
            // InternalDroneDSL.g:1026:3: (lv_str_0_0= 'atterrir()' )
            // InternalDroneDSL.g:1027:4: lv_str_0_0= 'atterrir()'
            {
            lv_str_0_0=(Token)match(input,27,FOLLOW_2); 

            				newLeafNode(lv_str_0_0, grammarAccess.getAtterrirAccess().getStrAtterrirKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAtterrirRule());
            				}
            				setWithLastConsumed(current, "str", lv_str_0_0, "atterrir()");
            			

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
    // $ANTLR end "ruleAtterrir"


    // $ANTLR start "entryRuleMonter"
    // InternalDroneDSL.g:1042:1: entryRuleMonter returns [EObject current=null] : iv_ruleMonter= ruleMonter EOF ;
    public final EObject entryRuleMonter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonter = null;


        try {
            // InternalDroneDSL.g:1042:47: (iv_ruleMonter= ruleMonter EOF )
            // InternalDroneDSL.g:1043:2: iv_ruleMonter= ruleMonter EOF
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
    // InternalDroneDSL.g:1049:1: ruleMonter returns [EObject current=null] : (otherlv_0= 'monter(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) ;
    public final EObject ruleMonter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duree_1_0 = null;

        EObject lv_vitesse_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1055:2: ( (otherlv_0= 'monter(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) )
            // InternalDroneDSL.g:1056:2: (otherlv_0= 'monter(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            {
            // InternalDroneDSL.g:1056:2: (otherlv_0= 'monter(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            // InternalDroneDSL.g:1057:3: otherlv_0= 'monter(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getMonterAccess().getMonterKeyword_0());
            		
            // InternalDroneDSL.g:1061:3: ( (lv_duree_1_0= ruleSecondeExp ) )
            // InternalDroneDSL.g:1062:4: (lv_duree_1_0= ruleSecondeExp )
            {
            // InternalDroneDSL.g:1062:4: (lv_duree_1_0= ruleSecondeExp )
            // InternalDroneDSL.g:1063:5: lv_duree_1_0= ruleSecondeExp
            {

            					newCompositeNode(grammarAccess.getMonterAccess().getDureeSecondeExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_duree_1_0=ruleSecondeExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMonterRule());
            					}
            					set(
            						current,
            						"duree",
            						lv_duree_1_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.SecondeExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getMonterAccess().getCommaKeyword_2());
            		
            // InternalDroneDSL.g:1084:3: ( (lv_vitesse_3_0= rulePourcentExp ) )
            // InternalDroneDSL.g:1085:4: (lv_vitesse_3_0= rulePourcentExp )
            {
            // InternalDroneDSL.g:1085:4: (lv_vitesse_3_0= rulePourcentExp )
            // InternalDroneDSL.g:1086:5: lv_vitesse_3_0= rulePourcentExp
            {

            					newCompositeNode(grammarAccess.getMonterAccess().getVitessePourcentExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_vitesse_3_0=rulePourcentExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMonterRule());
            					}
            					set(
            						current,
            						"vitesse",
            						lv_vitesse_3_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.PourcentExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMonterAccess().getRightParenthesisKeyword_4());
            		

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
    // InternalDroneDSL.g:1111:1: entryRuleDescendre returns [EObject current=null] : iv_ruleDescendre= ruleDescendre EOF ;
    public final EObject entryRuleDescendre() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescendre = null;


        try {
            // InternalDroneDSL.g:1111:50: (iv_ruleDescendre= ruleDescendre EOF )
            // InternalDroneDSL.g:1112:2: iv_ruleDescendre= ruleDescendre EOF
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
    // InternalDroneDSL.g:1118:1: ruleDescendre returns [EObject current=null] : (otherlv_0= 'descendre(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) ;
    public final EObject ruleDescendre() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duree_1_0 = null;

        EObject lv_vitesse_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1124:2: ( (otherlv_0= 'descendre(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) )
            // InternalDroneDSL.g:1125:2: (otherlv_0= 'descendre(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            {
            // InternalDroneDSL.g:1125:2: (otherlv_0= 'descendre(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            // InternalDroneDSL.g:1126:3: otherlv_0= 'descendre(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getDescendreAccess().getDescendreKeyword_0());
            		
            // InternalDroneDSL.g:1130:3: ( (lv_duree_1_0= ruleSecondeExp ) )
            // InternalDroneDSL.g:1131:4: (lv_duree_1_0= ruleSecondeExp )
            {
            // InternalDroneDSL.g:1131:4: (lv_duree_1_0= ruleSecondeExp )
            // InternalDroneDSL.g:1132:5: lv_duree_1_0= ruleSecondeExp
            {

            					newCompositeNode(grammarAccess.getDescendreAccess().getDureeSecondeExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_duree_1_0=ruleSecondeExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDescendreRule());
            					}
            					set(
            						current,
            						"duree",
            						lv_duree_1_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.SecondeExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getDescendreAccess().getCommaKeyword_2());
            		
            // InternalDroneDSL.g:1153:3: ( (lv_vitesse_3_0= rulePourcentExp ) )
            // InternalDroneDSL.g:1154:4: (lv_vitesse_3_0= rulePourcentExp )
            {
            // InternalDroneDSL.g:1154:4: (lv_vitesse_3_0= rulePourcentExp )
            // InternalDroneDSL.g:1155:5: lv_vitesse_3_0= rulePourcentExp
            {

            					newCompositeNode(grammarAccess.getDescendreAccess().getVitessePourcentExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_vitesse_3_0=rulePourcentExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDescendreRule());
            					}
            					set(
            						current,
            						"vitesse",
            						lv_vitesse_3_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.PourcentExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDescendreAccess().getRightParenthesisKeyword_4());
            		

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
    // InternalDroneDSL.g:1180:1: entryRuleAvancer returns [EObject current=null] : iv_ruleAvancer= ruleAvancer EOF ;
    public final EObject entryRuleAvancer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvancer = null;


        try {
            // InternalDroneDSL.g:1180:48: (iv_ruleAvancer= ruleAvancer EOF )
            // InternalDroneDSL.g:1181:2: iv_ruleAvancer= ruleAvancer EOF
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
    // InternalDroneDSL.g:1187:1: ruleAvancer returns [EObject current=null] : (otherlv_0= 'avancer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) ;
    public final EObject ruleAvancer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duree_1_0 = null;

        EObject lv_vitesse_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1193:2: ( (otherlv_0= 'avancer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) )
            // InternalDroneDSL.g:1194:2: (otherlv_0= 'avancer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            {
            // InternalDroneDSL.g:1194:2: (otherlv_0= 'avancer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            // InternalDroneDSL.g:1195:3: otherlv_0= 'avancer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getAvancerAccess().getAvancerKeyword_0());
            		
            // InternalDroneDSL.g:1199:3: ( (lv_duree_1_0= ruleSecondeExp ) )
            // InternalDroneDSL.g:1200:4: (lv_duree_1_0= ruleSecondeExp )
            {
            // InternalDroneDSL.g:1200:4: (lv_duree_1_0= ruleSecondeExp )
            // InternalDroneDSL.g:1201:5: lv_duree_1_0= ruleSecondeExp
            {

            					newCompositeNode(grammarAccess.getAvancerAccess().getDureeSecondeExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_duree_1_0=ruleSecondeExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAvancerRule());
            					}
            					set(
            						current,
            						"duree",
            						lv_duree_1_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.SecondeExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getAvancerAccess().getCommaKeyword_2());
            		
            // InternalDroneDSL.g:1222:3: ( (lv_vitesse_3_0= rulePourcentExp ) )
            // InternalDroneDSL.g:1223:4: (lv_vitesse_3_0= rulePourcentExp )
            {
            // InternalDroneDSL.g:1223:4: (lv_vitesse_3_0= rulePourcentExp )
            // InternalDroneDSL.g:1224:5: lv_vitesse_3_0= rulePourcentExp
            {

            					newCompositeNode(grammarAccess.getAvancerAccess().getVitessePourcentExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_vitesse_3_0=rulePourcentExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAvancerRule());
            					}
            					set(
            						current,
            						"vitesse",
            						lv_vitesse_3_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.PourcentExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAvancerAccess().getRightParenthesisKeyword_4());
            		

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
    // InternalDroneDSL.g:1249:1: entryRuleReculer returns [EObject current=null] : iv_ruleReculer= ruleReculer EOF ;
    public final EObject entryRuleReculer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReculer = null;


        try {
            // InternalDroneDSL.g:1249:48: (iv_ruleReculer= ruleReculer EOF )
            // InternalDroneDSL.g:1250:2: iv_ruleReculer= ruleReculer EOF
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
    // InternalDroneDSL.g:1256:1: ruleReculer returns [EObject current=null] : (otherlv_0= 'reculer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) ;
    public final EObject ruleReculer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duree_1_0 = null;

        EObject lv_vitesse_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1262:2: ( (otherlv_0= 'reculer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) )
            // InternalDroneDSL.g:1263:2: (otherlv_0= 'reculer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            {
            // InternalDroneDSL.g:1263:2: (otherlv_0= 'reculer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            // InternalDroneDSL.g:1264:3: otherlv_0= 'reculer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getReculerAccess().getReculerKeyword_0());
            		
            // InternalDroneDSL.g:1268:3: ( (lv_duree_1_0= ruleSecondeExp ) )
            // InternalDroneDSL.g:1269:4: (lv_duree_1_0= ruleSecondeExp )
            {
            // InternalDroneDSL.g:1269:4: (lv_duree_1_0= ruleSecondeExp )
            // InternalDroneDSL.g:1270:5: lv_duree_1_0= ruleSecondeExp
            {

            					newCompositeNode(grammarAccess.getReculerAccess().getDureeSecondeExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_duree_1_0=ruleSecondeExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReculerRule());
            					}
            					set(
            						current,
            						"duree",
            						lv_duree_1_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.SecondeExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getReculerAccess().getCommaKeyword_2());
            		
            // InternalDroneDSL.g:1291:3: ( (lv_vitesse_3_0= rulePourcentExp ) )
            // InternalDroneDSL.g:1292:4: (lv_vitesse_3_0= rulePourcentExp )
            {
            // InternalDroneDSL.g:1292:4: (lv_vitesse_3_0= rulePourcentExp )
            // InternalDroneDSL.g:1293:5: lv_vitesse_3_0= rulePourcentExp
            {

            					newCompositeNode(grammarAccess.getReculerAccess().getVitessePourcentExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_vitesse_3_0=rulePourcentExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReculerRule());
            					}
            					set(
            						current,
            						"vitesse",
            						lv_vitesse_3_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.PourcentExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getReculerAccess().getRightParenthesisKeyword_4());
            		

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
    // InternalDroneDSL.g:1318:1: entryRuleGauche returns [EObject current=null] : iv_ruleGauche= ruleGauche EOF ;
    public final EObject entryRuleGauche() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGauche = null;


        try {
            // InternalDroneDSL.g:1318:47: (iv_ruleGauche= ruleGauche EOF )
            // InternalDroneDSL.g:1319:2: iv_ruleGauche= ruleGauche EOF
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
    // InternalDroneDSL.g:1325:1: ruleGauche returns [EObject current=null] : (otherlv_0= 'gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) ;
    public final EObject ruleGauche() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duree_1_0 = null;

        EObject lv_vitesse_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1331:2: ( (otherlv_0= 'gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) )
            // InternalDroneDSL.g:1332:2: (otherlv_0= 'gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            {
            // InternalDroneDSL.g:1332:2: (otherlv_0= 'gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            // InternalDroneDSL.g:1333:3: otherlv_0= 'gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getGaucheAccess().getGaucheKeyword_0());
            		
            // InternalDroneDSL.g:1337:3: ( (lv_duree_1_0= ruleSecondeExp ) )
            // InternalDroneDSL.g:1338:4: (lv_duree_1_0= ruleSecondeExp )
            {
            // InternalDroneDSL.g:1338:4: (lv_duree_1_0= ruleSecondeExp )
            // InternalDroneDSL.g:1339:5: lv_duree_1_0= ruleSecondeExp
            {

            					newCompositeNode(grammarAccess.getGaucheAccess().getDureeSecondeExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_duree_1_0=ruleSecondeExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGaucheRule());
            					}
            					set(
            						current,
            						"duree",
            						lv_duree_1_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.SecondeExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getGaucheAccess().getCommaKeyword_2());
            		
            // InternalDroneDSL.g:1360:3: ( (lv_vitesse_3_0= rulePourcentExp ) )
            // InternalDroneDSL.g:1361:4: (lv_vitesse_3_0= rulePourcentExp )
            {
            // InternalDroneDSL.g:1361:4: (lv_vitesse_3_0= rulePourcentExp )
            // InternalDroneDSL.g:1362:5: lv_vitesse_3_0= rulePourcentExp
            {

            					newCompositeNode(grammarAccess.getGaucheAccess().getVitessePourcentExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_vitesse_3_0=rulePourcentExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGaucheRule());
            					}
            					set(
            						current,
            						"vitesse",
            						lv_vitesse_3_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.PourcentExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getGaucheAccess().getRightParenthesisKeyword_4());
            		

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
    // InternalDroneDSL.g:1387:1: entryRuleDroite returns [EObject current=null] : iv_ruleDroite= ruleDroite EOF ;
    public final EObject entryRuleDroite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDroite = null;


        try {
            // InternalDroneDSL.g:1387:47: (iv_ruleDroite= ruleDroite EOF )
            // InternalDroneDSL.g:1388:2: iv_ruleDroite= ruleDroite EOF
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
    // InternalDroneDSL.g:1394:1: ruleDroite returns [EObject current=null] : (otherlv_0= 'droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) ;
    public final EObject ruleDroite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duree_1_0 = null;

        EObject lv_vitesse_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1400:2: ( (otherlv_0= 'droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) )
            // InternalDroneDSL.g:1401:2: (otherlv_0= 'droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            {
            // InternalDroneDSL.g:1401:2: (otherlv_0= 'droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            // InternalDroneDSL.g:1402:3: otherlv_0= 'droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getDroiteAccess().getDroiteKeyword_0());
            		
            // InternalDroneDSL.g:1406:3: ( (lv_duree_1_0= ruleSecondeExp ) )
            // InternalDroneDSL.g:1407:4: (lv_duree_1_0= ruleSecondeExp )
            {
            // InternalDroneDSL.g:1407:4: (lv_duree_1_0= ruleSecondeExp )
            // InternalDroneDSL.g:1408:5: lv_duree_1_0= ruleSecondeExp
            {

            					newCompositeNode(grammarAccess.getDroiteAccess().getDureeSecondeExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_duree_1_0=ruleSecondeExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDroiteRule());
            					}
            					set(
            						current,
            						"duree",
            						lv_duree_1_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.SecondeExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getDroiteAccess().getCommaKeyword_2());
            		
            // InternalDroneDSL.g:1429:3: ( (lv_vitesse_3_0= rulePourcentExp ) )
            // InternalDroneDSL.g:1430:4: (lv_vitesse_3_0= rulePourcentExp )
            {
            // InternalDroneDSL.g:1430:4: (lv_vitesse_3_0= rulePourcentExp )
            // InternalDroneDSL.g:1431:5: lv_vitesse_3_0= rulePourcentExp
            {

            					newCompositeNode(grammarAccess.getDroiteAccess().getVitessePourcentExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_vitesse_3_0=rulePourcentExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDroiteRule());
            					}
            					set(
            						current,
            						"vitesse",
            						lv_vitesse_3_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.PourcentExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDroiteAccess().getRightParenthesisKeyword_4());
            		

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


    // $ANTLR start "entryRuleRotationGauche"
    // InternalDroneDSL.g:1456:1: entryRuleRotationGauche returns [EObject current=null] : iv_ruleRotationGauche= ruleRotationGauche EOF ;
    public final EObject entryRuleRotationGauche() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotationGauche = null;


        try {
            // InternalDroneDSL.g:1456:55: (iv_ruleRotationGauche= ruleRotationGauche EOF )
            // InternalDroneDSL.g:1457:2: iv_ruleRotationGauche= ruleRotationGauche EOF
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
    // InternalDroneDSL.g:1463:1: ruleRotationGauche returns [EObject current=null] : (otherlv_0= 'rotation_gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) ;
    public final EObject ruleRotationGauche() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duree_1_0 = null;

        EObject lv_vitesse_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1469:2: ( (otherlv_0= 'rotation_gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) )
            // InternalDroneDSL.g:1470:2: (otherlv_0= 'rotation_gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            {
            // InternalDroneDSL.g:1470:2: (otherlv_0= 'rotation_gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            // InternalDroneDSL.g:1471:3: otherlv_0= 'rotation_gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getRotationGaucheAccess().getRotation_gaucheKeyword_0());
            		
            // InternalDroneDSL.g:1475:3: ( (lv_duree_1_0= ruleSecondeExp ) )
            // InternalDroneDSL.g:1476:4: (lv_duree_1_0= ruleSecondeExp )
            {
            // InternalDroneDSL.g:1476:4: (lv_duree_1_0= ruleSecondeExp )
            // InternalDroneDSL.g:1477:5: lv_duree_1_0= ruleSecondeExp
            {

            					newCompositeNode(grammarAccess.getRotationGaucheAccess().getDureeSecondeExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_duree_1_0=ruleSecondeExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotationGaucheRule());
            					}
            					set(
            						current,
            						"duree",
            						lv_duree_1_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.SecondeExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getRotationGaucheAccess().getCommaKeyword_2());
            		
            // InternalDroneDSL.g:1498:3: ( (lv_vitesse_3_0= rulePourcentExp ) )
            // InternalDroneDSL.g:1499:4: (lv_vitesse_3_0= rulePourcentExp )
            {
            // InternalDroneDSL.g:1499:4: (lv_vitesse_3_0= rulePourcentExp )
            // InternalDroneDSL.g:1500:5: lv_vitesse_3_0= rulePourcentExp
            {

            					newCompositeNode(grammarAccess.getRotationGaucheAccess().getVitessePourcentExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_vitesse_3_0=rulePourcentExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotationGaucheRule());
            					}
            					set(
            						current,
            						"vitesse",
            						lv_vitesse_3_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.PourcentExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRotationGaucheAccess().getRightParenthesisKeyword_4());
            		

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
    // InternalDroneDSL.g:1525:1: entryRuleRotationDroite returns [EObject current=null] : iv_ruleRotationDroite= ruleRotationDroite EOF ;
    public final EObject entryRuleRotationDroite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotationDroite = null;


        try {
            // InternalDroneDSL.g:1525:55: (iv_ruleRotationDroite= ruleRotationDroite EOF )
            // InternalDroneDSL.g:1526:2: iv_ruleRotationDroite= ruleRotationDroite EOF
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
    // InternalDroneDSL.g:1532:1: ruleRotationDroite returns [EObject current=null] : (otherlv_0= 'rotation_droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) ;
    public final EObject ruleRotationDroite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duree_1_0 = null;

        EObject lv_vitesse_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1538:2: ( (otherlv_0= 'rotation_droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) )
            // InternalDroneDSL.g:1539:2: (otherlv_0= 'rotation_droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            {
            // InternalDroneDSL.g:1539:2: (otherlv_0= 'rotation_droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            // InternalDroneDSL.g:1540:3: otherlv_0= 'rotation_droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getRotationDroiteAccess().getRotation_droiteKeyword_0());
            		
            // InternalDroneDSL.g:1544:3: ( (lv_duree_1_0= ruleSecondeExp ) )
            // InternalDroneDSL.g:1545:4: (lv_duree_1_0= ruleSecondeExp )
            {
            // InternalDroneDSL.g:1545:4: (lv_duree_1_0= ruleSecondeExp )
            // InternalDroneDSL.g:1546:5: lv_duree_1_0= ruleSecondeExp
            {

            					newCompositeNode(grammarAccess.getRotationDroiteAccess().getDureeSecondeExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_duree_1_0=ruleSecondeExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotationDroiteRule());
            					}
            					set(
            						current,
            						"duree",
            						lv_duree_1_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.SecondeExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getRotationDroiteAccess().getCommaKeyword_2());
            		
            // InternalDroneDSL.g:1567:3: ( (lv_vitesse_3_0= rulePourcentExp ) )
            // InternalDroneDSL.g:1568:4: (lv_vitesse_3_0= rulePourcentExp )
            {
            // InternalDroneDSL.g:1568:4: (lv_vitesse_3_0= rulePourcentExp )
            // InternalDroneDSL.g:1569:5: lv_vitesse_3_0= rulePourcentExp
            {

            					newCompositeNode(grammarAccess.getRotationDroiteAccess().getVitessePourcentExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_vitesse_3_0=rulePourcentExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotationDroiteRule());
            					}
            					set(
            						current,
            						"vitesse",
            						lv_vitesse_3_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.PourcentExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRotationDroiteAccess().getRightParenthesisKeyword_4());
            		

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


    // $ANTLR start "entryRulePause"
    // InternalDroneDSL.g:1594:1: entryRulePause returns [EObject current=null] : iv_rulePause= rulePause EOF ;
    public final EObject entryRulePause() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePause = null;


        try {
            // InternalDroneDSL.g:1594:46: (iv_rulePause= rulePause EOF )
            // InternalDroneDSL.g:1595:2: iv_rulePause= rulePause EOF
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
    // InternalDroneDSL.g:1601:1: rulePause returns [EObject current=null] : (otherlv_0= 'pause(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ')' ) ;
    public final EObject rulePause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_duree_1_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1607:2: ( (otherlv_0= 'pause(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ')' ) )
            // InternalDroneDSL.g:1608:2: (otherlv_0= 'pause(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ')' )
            {
            // InternalDroneDSL.g:1608:2: (otherlv_0= 'pause(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ')' )
            // InternalDroneDSL.g:1609:3: otherlv_0= 'pause(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getPauseAccess().getPauseKeyword_0());
            		
            // InternalDroneDSL.g:1613:3: ( (lv_duree_1_0= ruleSecondeExp ) )
            // InternalDroneDSL.g:1614:4: (lv_duree_1_0= ruleSecondeExp )
            {
            // InternalDroneDSL.g:1614:4: (lv_duree_1_0= ruleSecondeExp )
            // InternalDroneDSL.g:1615:5: lv_duree_1_0= ruleSecondeExp
            {

            					newCompositeNode(grammarAccess.getPauseAccess().getDureeSecondeExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_duree_1_0=ruleSecondeExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPauseRule());
            					}
            					set(
            						current,
            						"duree",
            						lv_duree_1_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.SecondeExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getPauseAccess().getRightParenthesisKeyword_2());
            		

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


    // $ANTLR start "entryRuleDecollerAtterrir"
    // InternalDroneDSL.g:1640:1: entryRuleDecollerAtterrir returns [EObject current=null] : iv_ruleDecollerAtterrir= ruleDecollerAtterrir EOF ;
    public final EObject entryRuleDecollerAtterrir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecollerAtterrir = null;


        try {
            // InternalDroneDSL.g:1640:57: (iv_ruleDecollerAtterrir= ruleDecollerAtterrir EOF )
            // InternalDroneDSL.g:1641:2: iv_ruleDecollerAtterrir= ruleDecollerAtterrir EOF
            {
             newCompositeNode(grammarAccess.getDecollerAtterrirRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecollerAtterrir=ruleDecollerAtterrir();

            state._fsp--;

             current =iv_ruleDecollerAtterrir; 
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
    // $ANTLR end "entryRuleDecollerAtterrir"


    // $ANTLR start "ruleDecollerAtterrir"
    // InternalDroneDSL.g:1647:1: ruleDecollerAtterrir returns [EObject current=null] : (this_Decoller_0= ruleDecoller | this_Atterrir_1= ruleAtterrir ) ;
    public final EObject ruleDecollerAtterrir() throws RecognitionException {
        EObject current = null;

        EObject this_Decoller_0 = null;

        EObject this_Atterrir_1 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1653:2: ( (this_Decoller_0= ruleDecoller | this_Atterrir_1= ruleAtterrir ) )
            // InternalDroneDSL.g:1654:2: (this_Decoller_0= ruleDecoller | this_Atterrir_1= ruleAtterrir )
            {
            // InternalDroneDSL.g:1654:2: (this_Decoller_0= ruleDecoller | this_Atterrir_1= ruleAtterrir )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            else if ( (LA7_0==27) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDroneDSL.g:1655:3: this_Decoller_0= ruleDecoller
                    {

                    			newCompositeNode(grammarAccess.getDecollerAtterrirAccess().getDecollerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Decoller_0=ruleDecoller();

                    state._fsp--;


                    			current = this_Decoller_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDroneDSL.g:1664:3: this_Atterrir_1= ruleAtterrir
                    {

                    			newCompositeNode(grammarAccess.getDecollerAtterrirAccess().getAtterrirParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Atterrir_1=ruleAtterrir();

                    state._fsp--;


                    			current = this_Atterrir_1;
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
    // $ANTLR end "ruleDecollerAtterrir"


    // $ANTLR start "entryRuleCommandeBasique"
    // InternalDroneDSL.g:1676:1: entryRuleCommandeBasique returns [EObject current=null] : iv_ruleCommandeBasique= ruleCommandeBasique EOF ;
    public final EObject entryRuleCommandeBasique() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandeBasique = null;


        try {
            // InternalDroneDSL.g:1676:56: (iv_ruleCommandeBasique= ruleCommandeBasique EOF )
            // InternalDroneDSL.g:1677:2: iv_ruleCommandeBasique= ruleCommandeBasique EOF
            {
             newCompositeNode(grammarAccess.getCommandeBasiqueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommandeBasique=ruleCommandeBasique();

            state._fsp--;

             current =iv_ruleCommandeBasique; 
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
    // $ANTLR end "entryRuleCommandeBasique"


    // $ANTLR start "ruleCommandeBasique"
    // InternalDroneDSL.g:1683:1: ruleCommandeBasique returns [EObject current=null] : (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer | this_Monter_2= ruleMonter | this_Descendre_3= ruleDescendre | this_Gauche_4= ruleGauche | this_Droite_5= ruleDroite | this_RotationGauche_6= ruleRotationGauche | this_RotationDroite_7= ruleRotationDroite | this_Pause_8= rulePause ) ;
    public final EObject ruleCommandeBasique() throws RecognitionException {
        EObject current = null;

        EObject this_Avancer_0 = null;

        EObject this_Reculer_1 = null;

        EObject this_Monter_2 = null;

        EObject this_Descendre_3 = null;

        EObject this_Gauche_4 = null;

        EObject this_Droite_5 = null;

        EObject this_RotationGauche_6 = null;

        EObject this_RotationDroite_7 = null;

        EObject this_Pause_8 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1689:2: ( (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer | this_Monter_2= ruleMonter | this_Descendre_3= ruleDescendre | this_Gauche_4= ruleGauche | this_Droite_5= ruleDroite | this_RotationGauche_6= ruleRotationGauche | this_RotationDroite_7= ruleRotationDroite | this_Pause_8= rulePause ) )
            // InternalDroneDSL.g:1690:2: (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer | this_Monter_2= ruleMonter | this_Descendre_3= ruleDescendre | this_Gauche_4= ruleGauche | this_Droite_5= ruleDroite | this_RotationGauche_6= ruleRotationGauche | this_RotationDroite_7= ruleRotationDroite | this_Pause_8= rulePause )
            {
            // InternalDroneDSL.g:1690:2: (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer | this_Monter_2= ruleMonter | this_Descendre_3= ruleDescendre | this_Gauche_4= ruleGauche | this_Droite_5= ruleDroite | this_RotationGauche_6= ruleRotationGauche | this_RotationDroite_7= ruleRotationDroite | this_Pause_8= rulePause )
            int alt8=9;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt8=1;
                }
                break;
            case 33:
                {
                alt8=2;
                }
                break;
            case 28:
                {
                alt8=3;
                }
                break;
            case 31:
                {
                alt8=4;
                }
                break;
            case 34:
                {
                alt8=5;
                }
                break;
            case 35:
                {
                alt8=6;
                }
                break;
            case 36:
                {
                alt8=7;
                }
                break;
            case 37:
                {
                alt8=8;
                }
                break;
            case 38:
                {
                alt8=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalDroneDSL.g:1691:3: this_Avancer_0= ruleAvancer
                    {

                    			newCompositeNode(grammarAccess.getCommandeBasiqueAccess().getAvancerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Avancer_0=ruleAvancer();

                    state._fsp--;


                    			current = this_Avancer_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDroneDSL.g:1700:3: this_Reculer_1= ruleReculer
                    {

                    			newCompositeNode(grammarAccess.getCommandeBasiqueAccess().getReculerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reculer_1=ruleReculer();

                    state._fsp--;


                    			current = this_Reculer_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDroneDSL.g:1709:3: this_Monter_2= ruleMonter
                    {

                    			newCompositeNode(grammarAccess.getCommandeBasiqueAccess().getMonterParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Monter_2=ruleMonter();

                    state._fsp--;


                    			current = this_Monter_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDroneDSL.g:1718:3: this_Descendre_3= ruleDescendre
                    {

                    			newCompositeNode(grammarAccess.getCommandeBasiqueAccess().getDescendreParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Descendre_3=ruleDescendre();

                    state._fsp--;


                    			current = this_Descendre_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDroneDSL.g:1727:3: this_Gauche_4= ruleGauche
                    {

                    			newCompositeNode(grammarAccess.getCommandeBasiqueAccess().getGaucheParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Gauche_4=ruleGauche();

                    state._fsp--;


                    			current = this_Gauche_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalDroneDSL.g:1736:3: this_Droite_5= ruleDroite
                    {

                    			newCompositeNode(grammarAccess.getCommandeBasiqueAccess().getDroiteParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Droite_5=ruleDroite();

                    state._fsp--;


                    			current = this_Droite_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalDroneDSL.g:1745:3: this_RotationGauche_6= ruleRotationGauche
                    {

                    			newCompositeNode(grammarAccess.getCommandeBasiqueAccess().getRotationGaucheParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_RotationGauche_6=ruleRotationGauche();

                    state._fsp--;


                    			current = this_RotationGauche_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalDroneDSL.g:1754:3: this_RotationDroite_7= ruleRotationDroite
                    {

                    			newCompositeNode(grammarAccess.getCommandeBasiqueAccess().getRotationDroiteParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_RotationDroite_7=ruleRotationDroite();

                    state._fsp--;


                    			current = this_RotationDroite_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalDroneDSL.g:1763:3: this_Pause_8= rulePause
                    {

                    			newCompositeNode(grammarAccess.getCommandeBasiqueAccess().getPauseParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Pause_8=rulePause();

                    state._fsp--;


                    			current = this_Pause_8;
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
    // $ANTLR end "ruleCommandeBasique"


    // $ANTLR start "entryRuleFonctionDecl"
    // InternalDroneDSL.g:1775:1: entryRuleFonctionDecl returns [EObject current=null] : iv_ruleFonctionDecl= ruleFonctionDecl EOF ;
    public final EObject entryRuleFonctionDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFonctionDecl = null;


        try {
            // InternalDroneDSL.g:1775:53: (iv_ruleFonctionDecl= ruleFonctionDecl EOF )
            // InternalDroneDSL.g:1776:2: iv_ruleFonctionDecl= ruleFonctionDecl EOF
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
    // InternalDroneDSL.g:1782:1: ruleFonctionDecl returns [EObject current=null] : (otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= '{' ( ( (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleFonctionDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_body_4_1 = null;

        EObject lv_body_4_2 = null;

        EObject lv_body_4_3 = null;

        EObject lv_body_4_4 = null;

        EObject lv_body_4_5 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1788:2: ( (otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= '{' ( ( (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir ) ) )* otherlv_5= '}' ) )
            // InternalDroneDSL.g:1789:2: (otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= '{' ( ( (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir ) ) )* otherlv_5= '}' )
            {
            // InternalDroneDSL.g:1789:2: (otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= '{' ( ( (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir ) ) )* otherlv_5= '}' )
            // InternalDroneDSL.g:1790:3: otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= '{' ( ( (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getFonctionDeclAccess().getFuncKeyword_0());
            		
            // InternalDroneDSL.g:1794:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDroneDSL.g:1795:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDroneDSL.g:1795:4: (lv_name_1_0= RULE_ID )
            // InternalDroneDSL.g:1796:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

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

            otherlv_2=(Token)match(input,40,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getFonctionDeclAccess().getLeftParenthesisRightParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,41,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getFonctionDeclAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDroneDSL.g:1820:3: ( ( (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==23||(LA10_0>=25 && LA10_0<=28)||(LA10_0>=31 && LA10_0<=38)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDroneDSL.g:1821:4: ( (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir ) )
            	    {
            	    // InternalDroneDSL.g:1821:4: ( (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir ) )
            	    // InternalDroneDSL.g:1822:5: (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir )
            	    {
            	    // InternalDroneDSL.g:1822:5: (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir )
            	    int alt9=5;
            	    alt9 = dfa9.predict(input);
            	    switch (alt9) {
            	        case 1 :
            	            // InternalDroneDSL.g:1823:6: lv_body_4_1= ruleVarDecl
            	            {

            	            						newCompositeNode(grammarAccess.getFonctionDeclAccess().getBodyVarDeclParserRuleCall_4_0_0());
            	            					
            	            pushFollow(FOLLOW_25);
            	            lv_body_4_1=ruleVarDecl();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getFonctionDeclRule());
            	            						}
            	            						add(
            	            							current,
            	            							"body",
            	            							lv_body_4_1,
            	            							"fr.idmteam1.idmproject.dronedsl.DroneDSL.VarDecl");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalDroneDSL.g:1839:6: lv_body_4_2= ruleCommandeBasique
            	            {

            	            						newCompositeNode(grammarAccess.getFonctionDeclAccess().getBodyCommandeBasiqueParserRuleCall_4_0_1());
            	            					
            	            pushFollow(FOLLOW_25);
            	            lv_body_4_2=ruleCommandeBasique();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getFonctionDeclRule());
            	            						}
            	            						add(
            	            							current,
            	            							"body",
            	            							lv_body_4_2,
            	            							"fr.idmteam1.idmproject.dronedsl.DroneDSL.CommandeBasique");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 3 :
            	            // InternalDroneDSL.g:1855:6: lv_body_4_3= ruleParallele
            	            {

            	            						newCompositeNode(grammarAccess.getFonctionDeclAccess().getBodyParalleleParserRuleCall_4_0_2());
            	            					
            	            pushFollow(FOLLOW_25);
            	            lv_body_4_3=ruleParallele();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getFonctionDeclRule());
            	            						}
            	            						add(
            	            							current,
            	            							"body",
            	            							lv_body_4_3,
            	            							"fr.idmteam1.idmproject.dronedsl.DroneDSL.Parallele");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 4 :
            	            // InternalDroneDSL.g:1871:6: lv_body_4_4= ruleFonctionCall
            	            {

            	            						newCompositeNode(grammarAccess.getFonctionDeclAccess().getBodyFonctionCallParserRuleCall_4_0_3());
            	            					
            	            pushFollow(FOLLOW_25);
            	            lv_body_4_4=ruleFonctionCall();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getFonctionDeclRule());
            	            						}
            	            						add(
            	            							current,
            	            							"body",
            	            							lv_body_4_4,
            	            							"fr.idmteam1.idmproject.dronedsl.DroneDSL.FonctionCall");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 5 :
            	            // InternalDroneDSL.g:1887:6: lv_body_4_5= ruleDecollerAtterrir
            	            {

            	            						newCompositeNode(grammarAccess.getFonctionDeclAccess().getBodyDecollerAtterrirParserRuleCall_4_0_4());
            	            					
            	            pushFollow(FOLLOW_25);
            	            lv_body_4_5=ruleDecollerAtterrir();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getFonctionDeclRule());
            	            						}
            	            						add(
            	            							current,
            	            							"body",
            	            							lv_body_4_5,
            	            							"fr.idmteam1.idmproject.dronedsl.DroneDSL.DecollerAtterrir");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_5=(Token)match(input,42,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFonctionDeclAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleFinDeMain"
    // InternalDroneDSL.g:1913:1: entryRuleFinDeMain returns [EObject current=null] : iv_ruleFinDeMain= ruleFinDeMain EOF ;
    public final EObject entryRuleFinDeMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinDeMain = null;


        try {
            // InternalDroneDSL.g:1913:50: (iv_ruleFinDeMain= ruleFinDeMain EOF )
            // InternalDroneDSL.g:1914:2: iv_ruleFinDeMain= ruleFinDeMain EOF
            {
             newCompositeNode(grammarAccess.getFinDeMainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFinDeMain=ruleFinDeMain();

            state._fsp--;

             current =iv_ruleFinDeMain; 
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
    // $ANTLR end "entryRuleFinDeMain"


    // $ANTLR start "ruleFinDeMain"
    // InternalDroneDSL.g:1920:1: ruleFinDeMain returns [EObject current=null] : ( (lv_accolade_0_0= '}' ) ) ;
    public final EObject ruleFinDeMain() throws RecognitionException {
        EObject current = null;

        Token lv_accolade_0_0=null;


        	enterRule();

        try {
            // InternalDroneDSL.g:1926:2: ( ( (lv_accolade_0_0= '}' ) ) )
            // InternalDroneDSL.g:1927:2: ( (lv_accolade_0_0= '}' ) )
            {
            // InternalDroneDSL.g:1927:2: ( (lv_accolade_0_0= '}' ) )
            // InternalDroneDSL.g:1928:3: (lv_accolade_0_0= '}' )
            {
            // InternalDroneDSL.g:1928:3: (lv_accolade_0_0= '}' )
            // InternalDroneDSL.g:1929:4: lv_accolade_0_0= '}'
            {
            lv_accolade_0_0=(Token)match(input,42,FOLLOW_2); 

            				newLeafNode(lv_accolade_0_0, grammarAccess.getFinDeMainAccess().getAccoladeRightCurlyBracketKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFinDeMainRule());
            				}
            				setWithLastConsumed(current, "accolade", lv_accolade_0_0, "}");
            			

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
    // $ANTLR end "ruleFinDeMain"


    // $ANTLR start "entryRuleFonctionCall"
    // InternalDroneDSL.g:1944:1: entryRuleFonctionCall returns [EObject current=null] : iv_ruleFonctionCall= ruleFonctionCall EOF ;
    public final EObject entryRuleFonctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFonctionCall = null;


        try {
            // InternalDroneDSL.g:1944:53: (iv_ruleFonctionCall= ruleFonctionCall EOF )
            // InternalDroneDSL.g:1945:2: iv_ruleFonctionCall= ruleFonctionCall EOF
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
    // InternalDroneDSL.g:1951:1: ruleFonctionCall returns [EObject current=null] : (this_FonctionCallInterne_0= ruleFonctionCallInterne | this_FonctionCallExterne_1= ruleFonctionCallExterne ) ;
    public final EObject ruleFonctionCall() throws RecognitionException {
        EObject current = null;

        EObject this_FonctionCallInterne_0 = null;

        EObject this_FonctionCallExterne_1 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1957:2: ( (this_FonctionCallInterne_0= ruleFonctionCallInterne | this_FonctionCallExterne_1= ruleFonctionCallExterne ) )
            // InternalDroneDSL.g:1958:2: (this_FonctionCallInterne_0= ruleFonctionCallInterne | this_FonctionCallExterne_1= ruleFonctionCallExterne )
            {
            // InternalDroneDSL.g:1958:2: (this_FonctionCallInterne_0= ruleFonctionCallInterne | this_FonctionCallExterne_1= ruleFonctionCallExterne )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==43) ) {
                    alt11=2;
                }
                else if ( (LA11_1==40) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalDroneDSL.g:1959:3: this_FonctionCallInterne_0= ruleFonctionCallInterne
                    {

                    			newCompositeNode(grammarAccess.getFonctionCallAccess().getFonctionCallInterneParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FonctionCallInterne_0=ruleFonctionCallInterne();

                    state._fsp--;


                    			current = this_FonctionCallInterne_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDroneDSL.g:1968:3: this_FonctionCallExterne_1= ruleFonctionCallExterne
                    {

                    			newCompositeNode(grammarAccess.getFonctionCallAccess().getFonctionCallExterneParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FonctionCallExterne_1=ruleFonctionCallExterne();

                    state._fsp--;


                    			current = this_FonctionCallExterne_1;
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
    // $ANTLR end "ruleFonctionCall"


    // $ANTLR start "entryRuleFonctionCallInterne"
    // InternalDroneDSL.g:1980:1: entryRuleFonctionCallInterne returns [EObject current=null] : iv_ruleFonctionCallInterne= ruleFonctionCallInterne EOF ;
    public final EObject entryRuleFonctionCallInterne() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFonctionCallInterne = null;


        try {
            // InternalDroneDSL.g:1980:60: (iv_ruleFonctionCallInterne= ruleFonctionCallInterne EOF )
            // InternalDroneDSL.g:1981:2: iv_ruleFonctionCallInterne= ruleFonctionCallInterne EOF
            {
             newCompositeNode(grammarAccess.getFonctionCallInterneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFonctionCallInterne=ruleFonctionCallInterne();

            state._fsp--;

             current =iv_ruleFonctionCallInterne; 
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
    // $ANTLR end "entryRuleFonctionCallInterne"


    // $ANTLR start "ruleFonctionCallInterne"
    // InternalDroneDSL.g:1987:1: ruleFonctionCallInterne returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '()' ) ;
    public final EObject ruleFonctionCallInterne() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDroneDSL.g:1993:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '()' ) )
            // InternalDroneDSL.g:1994:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '()' )
            {
            // InternalDroneDSL.g:1994:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '()' )
            // InternalDroneDSL.g:1995:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '()'
            {
            // InternalDroneDSL.g:1995:3: ( (otherlv_0= RULE_ID ) )
            // InternalDroneDSL.g:1996:4: (otherlv_0= RULE_ID )
            {
            // InternalDroneDSL.g:1996:4: (otherlv_0= RULE_ID )
            // InternalDroneDSL.g:1997:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFonctionCallInterneRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_0, grammarAccess.getFonctionCallInterneAccess().getRefFonctionDeclCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getFonctionCallInterneAccess().getLeftParenthesisRightParenthesisKeyword_1());
            		

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
    // $ANTLR end "ruleFonctionCallInterne"


    // $ANTLR start "entryRuleFonctionCallExterne"
    // InternalDroneDSL.g:2016:1: entryRuleFonctionCallExterne returns [EObject current=null] : iv_ruleFonctionCallExterne= ruleFonctionCallExterne EOF ;
    public final EObject entryRuleFonctionCallExterne() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFonctionCallExterne = null;


        try {
            // InternalDroneDSL.g:2016:60: (iv_ruleFonctionCallExterne= ruleFonctionCallExterne EOF )
            // InternalDroneDSL.g:2017:2: iv_ruleFonctionCallExterne= ruleFonctionCallExterne EOF
            {
             newCompositeNode(grammarAccess.getFonctionCallExterneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFonctionCallExterne=ruleFonctionCallExterne();

            state._fsp--;

             current =iv_ruleFonctionCallExterne; 
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
    // $ANTLR end "entryRuleFonctionCallExterne"


    // $ANTLR start "ruleFonctionCallExterne"
    // InternalDroneDSL.g:2023:1: ruleFonctionCallExterne returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '()' ) ;
    public final EObject ruleFonctionCallExterne() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDroneDSL.g:2029:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '()' ) )
            // InternalDroneDSL.g:2030:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '()' )
            {
            // InternalDroneDSL.g:2030:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '()' )
            // InternalDroneDSL.g:2031:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '()'
            {
            // InternalDroneDSL.g:2031:3: ( (otherlv_0= RULE_ID ) )
            // InternalDroneDSL.g:2032:4: (otherlv_0= RULE_ID )
            {
            // InternalDroneDSL.g:2032:4: (otherlv_0= RULE_ID )
            // InternalDroneDSL.g:2033:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFonctionCallExterneRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_0, grammarAccess.getFonctionCallExterneAccess().getFileImportCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,43,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getFonctionCallExterneAccess().getFullStopKeyword_1());
            		
            // InternalDroneDSL.g:2048:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDroneDSL.g:2049:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDroneDSL.g:2049:4: (lv_name_2_0= RULE_ID )
            // InternalDroneDSL.g:2050:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFonctionCallExterneAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFonctionCallExterneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,40,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFonctionCallExterneAccess().getLeftParenthesisRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleFonctionCallExterne"


    // $ANTLR start "entryRuleMain"
    // InternalDroneDSL.g:2074:1: entryRuleMain returns [EObject current=null] : iv_ruleMain= ruleMain EOF ;
    public final EObject entryRuleMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMain = null;


        try {
            // InternalDroneDSL.g:2074:45: (iv_ruleMain= ruleMain EOF )
            // InternalDroneDSL.g:2075:2: iv_ruleMain= ruleMain EOF
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
    // InternalDroneDSL.g:2081:1: ruleMain returns [EObject current=null] : (otherlv_0= 'main' otherlv_1= '{' ( (lv_decollage_2_0= ruleDecoller ) ) ( ( (lv_mainbody_3_1= ruleVarDecl | lv_mainbody_3_2= ruleCommandeBasique | lv_mainbody_3_3= ruleParallele | lv_mainbody_3_4= ruleFonctionCall | lv_mainbody_3_5= ruleDecollerAtterrir ) ) )* ( (lv_atterrissage_4_0= ruleAtterrir ) ) ( (lv_fdm_5_0= ruleFinDeMain ) ) ) ;
    public final EObject ruleMain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_decollage_2_0 = null;

        EObject lv_mainbody_3_1 = null;

        EObject lv_mainbody_3_2 = null;

        EObject lv_mainbody_3_3 = null;

        EObject lv_mainbody_3_4 = null;

        EObject lv_mainbody_3_5 = null;

        EObject lv_atterrissage_4_0 = null;

        EObject lv_fdm_5_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:2087:2: ( (otherlv_0= 'main' otherlv_1= '{' ( (lv_decollage_2_0= ruleDecoller ) ) ( ( (lv_mainbody_3_1= ruleVarDecl | lv_mainbody_3_2= ruleCommandeBasique | lv_mainbody_3_3= ruleParallele | lv_mainbody_3_4= ruleFonctionCall | lv_mainbody_3_5= ruleDecollerAtterrir ) ) )* ( (lv_atterrissage_4_0= ruleAtterrir ) ) ( (lv_fdm_5_0= ruleFinDeMain ) ) ) )
            // InternalDroneDSL.g:2088:2: (otherlv_0= 'main' otherlv_1= '{' ( (lv_decollage_2_0= ruleDecoller ) ) ( ( (lv_mainbody_3_1= ruleVarDecl | lv_mainbody_3_2= ruleCommandeBasique | lv_mainbody_3_3= ruleParallele | lv_mainbody_3_4= ruleFonctionCall | lv_mainbody_3_5= ruleDecollerAtterrir ) ) )* ( (lv_atterrissage_4_0= ruleAtterrir ) ) ( (lv_fdm_5_0= ruleFinDeMain ) ) )
            {
            // InternalDroneDSL.g:2088:2: (otherlv_0= 'main' otherlv_1= '{' ( (lv_decollage_2_0= ruleDecoller ) ) ( ( (lv_mainbody_3_1= ruleVarDecl | lv_mainbody_3_2= ruleCommandeBasique | lv_mainbody_3_3= ruleParallele | lv_mainbody_3_4= ruleFonctionCall | lv_mainbody_3_5= ruleDecollerAtterrir ) ) )* ( (lv_atterrissage_4_0= ruleAtterrir ) ) ( (lv_fdm_5_0= ruleFinDeMain ) ) )
            // InternalDroneDSL.g:2089:3: otherlv_0= 'main' otherlv_1= '{' ( (lv_decollage_2_0= ruleDecoller ) ) ( ( (lv_mainbody_3_1= ruleVarDecl | lv_mainbody_3_2= ruleCommandeBasique | lv_mainbody_3_3= ruleParallele | lv_mainbody_3_4= ruleFonctionCall | lv_mainbody_3_5= ruleDecollerAtterrir ) ) )* ( (lv_atterrissage_4_0= ruleAtterrir ) ) ( (lv_fdm_5_0= ruleFinDeMain ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getMainAccess().getMainKeyword_0());
            		
            otherlv_1=(Token)match(input,41,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getMainAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDroneDSL.g:2097:3: ( (lv_decollage_2_0= ruleDecoller ) )
            // InternalDroneDSL.g:2098:4: (lv_decollage_2_0= ruleDecoller )
            {
            // InternalDroneDSL.g:2098:4: (lv_decollage_2_0= ruleDecoller )
            // InternalDroneDSL.g:2099:5: lv_decollage_2_0= ruleDecoller
            {

            					newCompositeNode(grammarAccess.getMainAccess().getDecollageDecollerParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_28);
            lv_decollage_2_0=ruleDecoller();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMainRule());
            					}
            					set(
            						current,
            						"decollage",
            						lv_decollage_2_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.Decoller");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDroneDSL.g:2116:3: ( ( (lv_mainbody_3_1= ruleVarDecl | lv_mainbody_3_2= ruleCommandeBasique | lv_mainbody_3_3= ruleParallele | lv_mainbody_3_4= ruleFonctionCall | lv_mainbody_3_5= ruleDecollerAtterrir ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1==RULE_ID||LA13_1==23||(LA13_1>=25 && LA13_1<=28)||(LA13_1>=31 && LA13_1<=38)) ) {
                        alt13=1;
                    }


                }
                else if ( (LA13_0==RULE_ID||LA13_0==23||(LA13_0>=25 && LA13_0<=26)||LA13_0==28||(LA13_0>=31 && LA13_0<=38)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDroneDSL.g:2117:4: ( (lv_mainbody_3_1= ruleVarDecl | lv_mainbody_3_2= ruleCommandeBasique | lv_mainbody_3_3= ruleParallele | lv_mainbody_3_4= ruleFonctionCall | lv_mainbody_3_5= ruleDecollerAtterrir ) )
            	    {
            	    // InternalDroneDSL.g:2117:4: ( (lv_mainbody_3_1= ruleVarDecl | lv_mainbody_3_2= ruleCommandeBasique | lv_mainbody_3_3= ruleParallele | lv_mainbody_3_4= ruleFonctionCall | lv_mainbody_3_5= ruleDecollerAtterrir ) )
            	    // InternalDroneDSL.g:2118:5: (lv_mainbody_3_1= ruleVarDecl | lv_mainbody_3_2= ruleCommandeBasique | lv_mainbody_3_3= ruleParallele | lv_mainbody_3_4= ruleFonctionCall | lv_mainbody_3_5= ruleDecollerAtterrir )
            	    {
            	    // InternalDroneDSL.g:2118:5: (lv_mainbody_3_1= ruleVarDecl | lv_mainbody_3_2= ruleCommandeBasique | lv_mainbody_3_3= ruleParallele | lv_mainbody_3_4= ruleFonctionCall | lv_mainbody_3_5= ruleDecollerAtterrir )
            	    int alt12=5;
            	    alt12 = dfa12.predict(input);
            	    switch (alt12) {
            	        case 1 :
            	            // InternalDroneDSL.g:2119:6: lv_mainbody_3_1= ruleVarDecl
            	            {

            	            						newCompositeNode(grammarAccess.getMainAccess().getMainbodyVarDeclParserRuleCall_3_0_0());
            	            					
            	            pushFollow(FOLLOW_28);
            	            lv_mainbody_3_1=ruleVarDecl();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getMainRule());
            	            						}
            	            						add(
            	            							current,
            	            							"mainbody",
            	            							lv_mainbody_3_1,
            	            							"fr.idmteam1.idmproject.dronedsl.DroneDSL.VarDecl");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalDroneDSL.g:2135:6: lv_mainbody_3_2= ruleCommandeBasique
            	            {

            	            						newCompositeNode(grammarAccess.getMainAccess().getMainbodyCommandeBasiqueParserRuleCall_3_0_1());
            	            					
            	            pushFollow(FOLLOW_28);
            	            lv_mainbody_3_2=ruleCommandeBasique();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getMainRule());
            	            						}
            	            						add(
            	            							current,
            	            							"mainbody",
            	            							lv_mainbody_3_2,
            	            							"fr.idmteam1.idmproject.dronedsl.DroneDSL.CommandeBasique");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 3 :
            	            // InternalDroneDSL.g:2151:6: lv_mainbody_3_3= ruleParallele
            	            {

            	            						newCompositeNode(grammarAccess.getMainAccess().getMainbodyParalleleParserRuleCall_3_0_2());
            	            					
            	            pushFollow(FOLLOW_28);
            	            lv_mainbody_3_3=ruleParallele();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getMainRule());
            	            						}
            	            						add(
            	            							current,
            	            							"mainbody",
            	            							lv_mainbody_3_3,
            	            							"fr.idmteam1.idmproject.dronedsl.DroneDSL.Parallele");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 4 :
            	            // InternalDroneDSL.g:2167:6: lv_mainbody_3_4= ruleFonctionCall
            	            {

            	            						newCompositeNode(grammarAccess.getMainAccess().getMainbodyFonctionCallParserRuleCall_3_0_3());
            	            					
            	            pushFollow(FOLLOW_28);
            	            lv_mainbody_3_4=ruleFonctionCall();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getMainRule());
            	            						}
            	            						add(
            	            							current,
            	            							"mainbody",
            	            							lv_mainbody_3_4,
            	            							"fr.idmteam1.idmproject.dronedsl.DroneDSL.FonctionCall");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 5 :
            	            // InternalDroneDSL.g:2183:6: lv_mainbody_3_5= ruleDecollerAtterrir
            	            {

            	            						newCompositeNode(grammarAccess.getMainAccess().getMainbodyDecollerAtterrirParserRuleCall_3_0_4());
            	            					
            	            pushFollow(FOLLOW_28);
            	            lv_mainbody_3_5=ruleDecollerAtterrir();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getMainRule());
            	            						}
            	            						add(
            	            							current,
            	            							"mainbody",
            	            							lv_mainbody_3_5,
            	            							"fr.idmteam1.idmproject.dronedsl.DroneDSL.DecollerAtterrir");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalDroneDSL.g:2201:3: ( (lv_atterrissage_4_0= ruleAtterrir ) )
            // InternalDroneDSL.g:2202:4: (lv_atterrissage_4_0= ruleAtterrir )
            {
            // InternalDroneDSL.g:2202:4: (lv_atterrissage_4_0= ruleAtterrir )
            // InternalDroneDSL.g:2203:5: lv_atterrissage_4_0= ruleAtterrir
            {

            					newCompositeNode(grammarAccess.getMainAccess().getAtterrissageAtterrirParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_29);
            lv_atterrissage_4_0=ruleAtterrir();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMainRule());
            					}
            					set(
            						current,
            						"atterrissage",
            						lv_atterrissage_4_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.Atterrir");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDroneDSL.g:2220:3: ( (lv_fdm_5_0= ruleFinDeMain ) )
            // InternalDroneDSL.g:2221:4: (lv_fdm_5_0= ruleFinDeMain )
            {
            // InternalDroneDSL.g:2221:4: (lv_fdm_5_0= ruleFinDeMain )
            // InternalDroneDSL.g:2222:5: lv_fdm_5_0= ruleFinDeMain
            {

            					newCompositeNode(grammarAccess.getMainAccess().getFdmFinDeMainParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_fdm_5_0=ruleFinDeMain();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMainRule());
            					}
            					set(
            						current,
            						"fdm",
            						lv_fdm_5_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSL.FinDeMain");
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
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleMD"
    // InternalDroneDSL.g:2243:1: entryRuleMD returns [EObject current=null] : iv_ruleMD= ruleMD EOF ;
    public final EObject entryRuleMD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMD = null;


        try {
            // InternalDroneDSL.g:2243:43: (iv_ruleMD= ruleMD EOF )
            // InternalDroneDSL.g:2244:2: iv_ruleMD= ruleMD EOF
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
    // InternalDroneDSL.g:2250:1: ruleMD returns [EObject current=null] : (this_Monter_0= ruleMonter | this_Descendre_1= ruleDescendre ) ;
    public final EObject ruleMD() throws RecognitionException {
        EObject current = null;

        EObject this_Monter_0 = null;

        EObject this_Descendre_1 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:2256:2: ( (this_Monter_0= ruleMonter | this_Descendre_1= ruleDescendre ) )
            // InternalDroneDSL.g:2257:2: (this_Monter_0= ruleMonter | this_Descendre_1= ruleDescendre )
            {
            // InternalDroneDSL.g:2257:2: (this_Monter_0= ruleMonter | this_Descendre_1= ruleDescendre )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            else if ( (LA14_0==31) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalDroneDSL.g:2258:3: this_Monter_0= ruleMonter
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
                    // InternalDroneDSL.g:2267:3: this_Descendre_1= ruleDescendre
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
    // InternalDroneDSL.g:2279:1: entryRuleGDr returns [EObject current=null] : iv_ruleGDr= ruleGDr EOF ;
    public final EObject entryRuleGDr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGDr = null;


        try {
            // InternalDroneDSL.g:2279:44: (iv_ruleGDr= ruleGDr EOF )
            // InternalDroneDSL.g:2280:2: iv_ruleGDr= ruleGDr EOF
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
    // InternalDroneDSL.g:2286:1: ruleGDr returns [EObject current=null] : (this_Gauche_0= ruleGauche | this_Droite_1= ruleDroite ) ;
    public final EObject ruleGDr() throws RecognitionException {
        EObject current = null;

        EObject this_Gauche_0 = null;

        EObject this_Droite_1 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:2292:2: ( (this_Gauche_0= ruleGauche | this_Droite_1= ruleDroite ) )
            // InternalDroneDSL.g:2293:2: (this_Gauche_0= ruleGauche | this_Droite_1= ruleDroite )
            {
            // InternalDroneDSL.g:2293:2: (this_Gauche_0= ruleGauche | this_Droite_1= ruleDroite )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            else if ( (LA15_0==35) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalDroneDSL.g:2294:3: this_Gauche_0= ruleGauche
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
                    // InternalDroneDSL.g:2303:3: this_Droite_1= ruleDroite
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
    // InternalDroneDSL.g:2315:1: entryRuleRGRD returns [EObject current=null] : iv_ruleRGRD= ruleRGRD EOF ;
    public final EObject entryRuleRGRD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRGRD = null;


        try {
            // InternalDroneDSL.g:2315:45: (iv_ruleRGRD= ruleRGRD EOF )
            // InternalDroneDSL.g:2316:2: iv_ruleRGRD= ruleRGRD EOF
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
    // InternalDroneDSL.g:2322:1: ruleRGRD returns [EObject current=null] : (this_RotationGauche_0= ruleRotationGauche | this_RotationDroite_1= ruleRotationDroite ) ;
    public final EObject ruleRGRD() throws RecognitionException {
        EObject current = null;

        EObject this_RotationGauche_0 = null;

        EObject this_RotationDroite_1 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:2328:2: ( (this_RotationGauche_0= ruleRotationGauche | this_RotationDroite_1= ruleRotationDroite ) )
            // InternalDroneDSL.g:2329:2: (this_RotationGauche_0= ruleRotationGauche | this_RotationDroite_1= ruleRotationDroite )
            {
            // InternalDroneDSL.g:2329:2: (this_RotationGauche_0= ruleRotationGauche | this_RotationDroite_1= ruleRotationDroite )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==36) ) {
                alt16=1;
            }
            else if ( (LA16_0==37) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalDroneDSL.g:2330:3: this_RotationGauche_0= ruleRotationGauche
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
                    // InternalDroneDSL.g:2339:3: this_RotationDroite_1= ruleRotationDroite
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
    // InternalDroneDSL.g:2351:1: entryRuleAR returns [EObject current=null] : iv_ruleAR= ruleAR EOF ;
    public final EObject entryRuleAR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAR = null;


        try {
            // InternalDroneDSL.g:2351:43: (iv_ruleAR= ruleAR EOF )
            // InternalDroneDSL.g:2352:2: iv_ruleAR= ruleAR EOF
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
    // InternalDroneDSL.g:2358:1: ruleAR returns [EObject current=null] : (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer ) ;
    public final EObject ruleAR() throws RecognitionException {
        EObject current = null;

        EObject this_Avancer_0 = null;

        EObject this_Reculer_1 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:2364:2: ( (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer ) )
            // InternalDroneDSL.g:2365:2: (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer )
            {
            // InternalDroneDSL.g:2365:2: (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            else if ( (LA17_0==33) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalDroneDSL.g:2366:3: this_Avancer_0= ruleAvancer
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
                    // InternalDroneDSL.g:2375:3: this_Reculer_1= ruleReculer
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
    // InternalDroneDSL.g:2387:1: entryRuleParallele returns [EObject current=null] : iv_ruleParallele= ruleParallele EOF ;
    public final EObject entryRuleParallele() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallele = null;


        try {
            // InternalDroneDSL.g:2387:50: (iv_ruleParallele= ruleParallele EOF )
            // InternalDroneDSL.g:2388:2: iv_ruleParallele= ruleParallele EOF
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
    // InternalDroneDSL.g:2394:1: ruleParallele returns [EObject current=null] : (this_Parallele2_0= ruleParallele2 | this_Parallele3_1= ruleParallele3 | this_Parallele4_2= ruleParallele4 ) ;
    public final EObject ruleParallele() throws RecognitionException {
        EObject current = null;

        EObject this_Parallele2_0 = null;

        EObject this_Parallele3_1 = null;

        EObject this_Parallele4_2 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:2400:2: ( (this_Parallele2_0= ruleParallele2 | this_Parallele3_1= ruleParallele3 | this_Parallele4_2= ruleParallele4 ) )
            // InternalDroneDSL.g:2401:2: (this_Parallele2_0= ruleParallele2 | this_Parallele3_1= ruleParallele3 | this_Parallele4_2= ruleParallele4 )
            {
            // InternalDroneDSL.g:2401:2: (this_Parallele2_0= ruleParallele2 | this_Parallele3_1= ruleParallele3 | this_Parallele4_2= ruleParallele4 )
            int alt18=3;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalDroneDSL.g:2402:3: this_Parallele2_0= ruleParallele2
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
                    // InternalDroneDSL.g:2411:3: this_Parallele3_1= ruleParallele3
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
                    // InternalDroneDSL.g:2420:3: this_Parallele4_2= ruleParallele4
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
    // InternalDroneDSL.g:2432:1: entryRuleParallele2 returns [EObject current=null] : iv_ruleParallele2= ruleParallele2 EOF ;
    public final EObject entryRuleParallele2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallele2 = null;


        try {
            // InternalDroneDSL.g:2432:51: (iv_ruleParallele2= ruleParallele2 EOF )
            // InternalDroneDSL.g:2433:2: iv_ruleParallele2= ruleParallele2 EOF
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
    // InternalDroneDSL.g:2439:1: ruleParallele2 returns [EObject current=null] : ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) ) ;
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
            // InternalDroneDSL.g:2445:2: ( ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) ) )
            // InternalDroneDSL.g:2446:2: ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) )
            {
            // InternalDroneDSL.g:2446:2: ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) )
            int alt19=12;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalDroneDSL.g:2447:3: ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:2447:3: ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:2448:4: ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:2448:4: ( (lv_a_0_0= ruleMD ) )
                    // InternalDroneDSL.g:2449:5: (lv_a_0_0= ruleMD )
                    {
                    // InternalDroneDSL.g:2449:5: (lv_a_0_0= ruleMD )
                    // InternalDroneDSL.g:2450:6: lv_a_0_0= ruleMD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,45,FOLLOW_31); 

                    				newLeafNode(otherlv_1, grammarAccess.getParallele2Access().getAmpersandKeyword_0_1());
                    			
                    // InternalDroneDSL.g:2471:4: ( (lv_t_2_0= ruleGDr ) )
                    // InternalDroneDSL.g:2472:5: (lv_t_2_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:2472:5: (lv_t_2_0= ruleGDr )
                    // InternalDroneDSL.g:2473:6: lv_t_2_0= ruleGDr
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
                    // InternalDroneDSL.g:2492:3: ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:2492:3: ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) )
                    // InternalDroneDSL.g:2493:4: ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:2493:4: ( (lv_a_3_0= ruleMD ) )
                    // InternalDroneDSL.g:2494:5: (lv_a_3_0= ruleMD )
                    {
                    // InternalDroneDSL.g:2494:5: (lv_a_3_0= ruleMD )
                    // InternalDroneDSL.g:2495:6: lv_a_3_0= ruleMD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,45,FOLLOW_32); 

                    				newLeafNode(otherlv_4, grammarAccess.getParallele2Access().getAmpersandKeyword_1_1());
                    			
                    // InternalDroneDSL.g:2516:4: ( (lv_t_5_0= ruleAR ) )
                    // InternalDroneDSL.g:2517:5: (lv_t_5_0= ruleAR )
                    {
                    // InternalDroneDSL.g:2517:5: (lv_t_5_0= ruleAR )
                    // InternalDroneDSL.g:2518:6: lv_t_5_0= ruleAR
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
                    // InternalDroneDSL.g:2537:3: ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:2537:3: ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:2538:4: ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:2538:4: ( (lv_a_6_0= ruleMD ) )
                    // InternalDroneDSL.g:2539:5: (lv_a_6_0= ruleMD )
                    {
                    // InternalDroneDSL.g:2539:5: (lv_a_6_0= ruleMD )
                    // InternalDroneDSL.g:2540:6: lv_a_6_0= ruleMD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,45,FOLLOW_33); 

                    				newLeafNode(otherlv_7, grammarAccess.getParallele2Access().getAmpersandKeyword_2_1());
                    			
                    // InternalDroneDSL.g:2561:4: ( (lv_t_8_0= ruleRGRD ) )
                    // InternalDroneDSL.g:2562:5: (lv_t_8_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:2562:5: (lv_t_8_0= ruleRGRD )
                    // InternalDroneDSL.g:2563:6: lv_t_8_0= ruleRGRD
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
                    // InternalDroneDSL.g:2582:3: ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:2582:3: ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) )
                    // InternalDroneDSL.g:2583:4: ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:2583:4: ( (lv_t_9_0= ruleGDr ) )
                    // InternalDroneDSL.g:2584:5: (lv_t_9_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:2584:5: (lv_t_9_0= ruleGDr )
                    // InternalDroneDSL.g:2585:6: lv_t_9_0= ruleGDr
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,45,FOLLOW_32); 

                    				newLeafNode(otherlv_10, grammarAccess.getParallele2Access().getAmpersandKeyword_3_1());
                    			
                    // InternalDroneDSL.g:2606:4: ( (lv_b_11_0= ruleAR ) )
                    // InternalDroneDSL.g:2607:5: (lv_b_11_0= ruleAR )
                    {
                    // InternalDroneDSL.g:2607:5: (lv_b_11_0= ruleAR )
                    // InternalDroneDSL.g:2608:6: lv_b_11_0= ruleAR
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
                    // InternalDroneDSL.g:2627:3: ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:2627:3: ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) )
                    // InternalDroneDSL.g:2628:4: ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:2628:4: ( (lv_t_12_0= ruleGDr ) )
                    // InternalDroneDSL.g:2629:5: (lv_t_12_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:2629:5: (lv_t_12_0= ruleGDr )
                    // InternalDroneDSL.g:2630:6: lv_t_12_0= ruleGDr
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,45,FOLLOW_34); 

                    				newLeafNode(otherlv_13, grammarAccess.getParallele2Access().getAmpersandKeyword_4_1());
                    			
                    // InternalDroneDSL.g:2651:4: ( (lv_b_14_0= ruleMD ) )
                    // InternalDroneDSL.g:2652:5: (lv_b_14_0= ruleMD )
                    {
                    // InternalDroneDSL.g:2652:5: (lv_b_14_0= ruleMD )
                    // InternalDroneDSL.g:2653:6: lv_b_14_0= ruleMD
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
                    // InternalDroneDSL.g:2672:3: ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:2672:3: ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:2673:4: ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:2673:4: ( (lv_t_15_0= ruleGDr ) )
                    // InternalDroneDSL.g:2674:5: (lv_t_15_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:2674:5: (lv_t_15_0= ruleGDr )
                    // InternalDroneDSL.g:2675:6: lv_t_15_0= ruleGDr
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,45,FOLLOW_33); 

                    				newLeafNode(otherlv_16, grammarAccess.getParallele2Access().getAmpersandKeyword_5_1());
                    			
                    // InternalDroneDSL.g:2696:4: ( (lv_b_17_0= ruleRGRD ) )
                    // InternalDroneDSL.g:2697:5: (lv_b_17_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:2697:5: (lv_b_17_0= ruleRGRD )
                    // InternalDroneDSL.g:2698:6: lv_b_17_0= ruleRGRD
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
                    // InternalDroneDSL.g:2717:3: ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:2717:3: ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) )
                    // InternalDroneDSL.g:2718:4: ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:2718:4: ( (lv_t_18_0= ruleRGRD ) )
                    // InternalDroneDSL.g:2719:5: (lv_t_18_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:2719:5: (lv_t_18_0= ruleRGRD )
                    // InternalDroneDSL.g:2720:6: lv_t_18_0= ruleRGRD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_19=(Token)match(input,45,FOLLOW_34); 

                    				newLeafNode(otherlv_19, grammarAccess.getParallele2Access().getAmpersandKeyword_6_1());
                    			
                    // InternalDroneDSL.g:2741:4: ( (lv_a_20_0= ruleMD ) )
                    // InternalDroneDSL.g:2742:5: (lv_a_20_0= ruleMD )
                    {
                    // InternalDroneDSL.g:2742:5: (lv_a_20_0= ruleMD )
                    // InternalDroneDSL.g:2743:6: lv_a_20_0= ruleMD
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
                    // InternalDroneDSL.g:2762:3: ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:2762:3: ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) )
                    // InternalDroneDSL.g:2763:4: ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:2763:4: ( (lv_t_21_0= ruleRGRD ) )
                    // InternalDroneDSL.g:2764:5: (lv_t_21_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:2764:5: (lv_t_21_0= ruleRGRD )
                    // InternalDroneDSL.g:2765:6: lv_t_21_0= ruleRGRD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_22=(Token)match(input,45,FOLLOW_32); 

                    				newLeafNode(otherlv_22, grammarAccess.getParallele2Access().getAmpersandKeyword_7_1());
                    			
                    // InternalDroneDSL.g:2786:4: ( (lv_a_23_0= ruleAR ) )
                    // InternalDroneDSL.g:2787:5: (lv_a_23_0= ruleAR )
                    {
                    // InternalDroneDSL.g:2787:5: (lv_a_23_0= ruleAR )
                    // InternalDroneDSL.g:2788:6: lv_a_23_0= ruleAR
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
                    // InternalDroneDSL.g:2807:3: ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:2807:3: ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:2808:4: ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:2808:4: ( (lv_t_24_0= ruleRGRD ) )
                    // InternalDroneDSL.g:2809:5: (lv_t_24_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:2809:5: (lv_t_24_0= ruleRGRD )
                    // InternalDroneDSL.g:2810:6: lv_t_24_0= ruleRGRD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_25=(Token)match(input,45,FOLLOW_31); 

                    				newLeafNode(otherlv_25, grammarAccess.getParallele2Access().getAmpersandKeyword_8_1());
                    			
                    // InternalDroneDSL.g:2831:4: ( (lv_a_26_0= ruleGDr ) )
                    // InternalDroneDSL.g:2832:5: (lv_a_26_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:2832:5: (lv_a_26_0= ruleGDr )
                    // InternalDroneDSL.g:2833:6: lv_a_26_0= ruleGDr
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
                    // InternalDroneDSL.g:2852:3: ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:2852:3: ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) )
                    // InternalDroneDSL.g:2853:4: ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:2853:4: ( (lv_t_27_0= ruleAR ) )
                    // InternalDroneDSL.g:2854:5: (lv_t_27_0= ruleAR )
                    {
                    // InternalDroneDSL.g:2854:5: (lv_t_27_0= ruleAR )
                    // InternalDroneDSL.g:2855:6: lv_t_27_0= ruleAR
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_28=(Token)match(input,45,FOLLOW_34); 

                    				newLeafNode(otherlv_28, grammarAccess.getParallele2Access().getAmpersandKeyword_9_1());
                    			
                    // InternalDroneDSL.g:2876:4: ( (lv_a_29_0= ruleMD ) )
                    // InternalDroneDSL.g:2877:5: (lv_a_29_0= ruleMD )
                    {
                    // InternalDroneDSL.g:2877:5: (lv_a_29_0= ruleMD )
                    // InternalDroneDSL.g:2878:6: lv_a_29_0= ruleMD
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
                    // InternalDroneDSL.g:2897:3: ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:2897:3: ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:2898:4: ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:2898:4: ( (lv_t_30_0= ruleAR ) )
                    // InternalDroneDSL.g:2899:5: (lv_t_30_0= ruleAR )
                    {
                    // InternalDroneDSL.g:2899:5: (lv_t_30_0= ruleAR )
                    // InternalDroneDSL.g:2900:6: lv_t_30_0= ruleAR
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_31=(Token)match(input,45,FOLLOW_33); 

                    				newLeafNode(otherlv_31, grammarAccess.getParallele2Access().getAmpersandKeyword_10_1());
                    			
                    // InternalDroneDSL.g:2921:4: ( (lv_a_32_0= ruleRGRD ) )
                    // InternalDroneDSL.g:2922:5: (lv_a_32_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:2922:5: (lv_a_32_0= ruleRGRD )
                    // InternalDroneDSL.g:2923:6: lv_a_32_0= ruleRGRD
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
                    // InternalDroneDSL.g:2942:3: ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:2942:3: ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:2943:4: ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:2943:4: ( (lv_t_33_0= ruleAR ) )
                    // InternalDroneDSL.g:2944:5: (lv_t_33_0= ruleAR )
                    {
                    // InternalDroneDSL.g:2944:5: (lv_t_33_0= ruleAR )
                    // InternalDroneDSL.g:2945:6: lv_t_33_0= ruleAR
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_34=(Token)match(input,45,FOLLOW_31); 

                    				newLeafNode(otherlv_34, grammarAccess.getParallele2Access().getAmpersandKeyword_11_1());
                    			
                    // InternalDroneDSL.g:2966:4: ( (lv_a_35_0= ruleGDr ) )
                    // InternalDroneDSL.g:2967:5: (lv_a_35_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:2967:5: (lv_a_35_0= ruleGDr )
                    // InternalDroneDSL.g:2968:6: lv_a_35_0= ruleGDr
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
    // InternalDroneDSL.g:2990:1: entryRuleParallele3 returns [EObject current=null] : iv_ruleParallele3= ruleParallele3 EOF ;
    public final EObject entryRuleParallele3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallele3 = null;


        try {
            // InternalDroneDSL.g:2990:51: (iv_ruleParallele3= ruleParallele3 EOF )
            // InternalDroneDSL.g:2991:2: iv_ruleParallele3= ruleParallele3 EOF
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
    // InternalDroneDSL.g:2997:1: ruleParallele3 returns [EObject current=null] : ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) ) ;
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
            // InternalDroneDSL.g:3003:2: ( ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) ) )
            // InternalDroneDSL.g:3004:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) )
            {
            // InternalDroneDSL.g:3004:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) )
            int alt20=24;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalDroneDSL.g:3005:3: ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:3005:3: ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) )
                    // InternalDroneDSL.g:3006:4: ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:3006:4: ( (lv_a_0_0= ruleAR ) )
                    // InternalDroneDSL.g:3007:5: (lv_a_0_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3007:5: (lv_a_0_0= ruleAR )
                    // InternalDroneDSL.g:3008:6: lv_a_0_0= ruleAR
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,45,FOLLOW_31); 

                    				newLeafNode(otherlv_1, grammarAccess.getParallele3Access().getAmpersandKeyword_0_1());
                    			
                    // InternalDroneDSL.g:3029:4: ( (lv_b_2_0= ruleGDr ) )
                    // InternalDroneDSL.g:3030:5: (lv_b_2_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3030:5: (lv_b_2_0= ruleGDr )
                    // InternalDroneDSL.g:3031:6: lv_b_2_0= ruleGDr
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,45,FOLLOW_34); 

                    				newLeafNode(otherlv_3, grammarAccess.getParallele3Access().getAmpersandKeyword_0_3());
                    			
                    // InternalDroneDSL.g:3052:4: ( (lv_c_4_0= ruleMD ) )
                    // InternalDroneDSL.g:3053:5: (lv_c_4_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3053:5: (lv_c_4_0= ruleMD )
                    // InternalDroneDSL.g:3054:6: lv_c_4_0= ruleMD
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
                    // InternalDroneDSL.g:3073:3: ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:3073:3: ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:3074:4: ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:3074:4: ( (lv_a_5_0= ruleAR ) )
                    // InternalDroneDSL.g:3075:5: (lv_a_5_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3075:5: (lv_a_5_0= ruleAR )
                    // InternalDroneDSL.g:3076:6: lv_a_5_0= ruleAR
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,45,FOLLOW_31); 

                    				newLeafNode(otherlv_6, grammarAccess.getParallele3Access().getAmpersandKeyword_1_1());
                    			
                    // InternalDroneDSL.g:3097:4: ( (lv_b_7_0= ruleGDr ) )
                    // InternalDroneDSL.g:3098:5: (lv_b_7_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3098:5: (lv_b_7_0= ruleGDr )
                    // InternalDroneDSL.g:3099:6: lv_b_7_0= ruleGDr
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,45,FOLLOW_33); 

                    				newLeafNode(otherlv_8, grammarAccess.getParallele3Access().getAmpersandKeyword_1_3());
                    			
                    // InternalDroneDSL.g:3120:4: ( (lv_c_9_0= ruleRGRD ) )
                    // InternalDroneDSL.g:3121:5: (lv_c_9_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:3121:5: (lv_c_9_0= ruleRGRD )
                    // InternalDroneDSL.g:3122:6: lv_c_9_0= ruleRGRD
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
                    // InternalDroneDSL.g:3141:3: ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:3141:3: ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:3142:4: ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:3142:4: ( (lv_a_10_0= ruleAR ) )
                    // InternalDroneDSL.g:3143:5: (lv_a_10_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3143:5: (lv_a_10_0= ruleAR )
                    // InternalDroneDSL.g:3144:6: lv_a_10_0= ruleAR
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,45,FOLLOW_34); 

                    				newLeafNode(otherlv_11, grammarAccess.getParallele3Access().getAmpersandKeyword_2_1());
                    			
                    // InternalDroneDSL.g:3165:4: ( (lv_b_12_0= ruleMD ) )
                    // InternalDroneDSL.g:3166:5: (lv_b_12_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3166:5: (lv_b_12_0= ruleMD )
                    // InternalDroneDSL.g:3167:6: lv_b_12_0= ruleMD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,45,FOLLOW_31); 

                    				newLeafNode(otherlv_13, grammarAccess.getParallele3Access().getAmpersandKeyword_2_3());
                    			
                    // InternalDroneDSL.g:3188:4: ( (lv_c_14_0= ruleGDr ) )
                    // InternalDroneDSL.g:3189:5: (lv_c_14_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3189:5: (lv_c_14_0= ruleGDr )
                    // InternalDroneDSL.g:3190:6: lv_c_14_0= ruleGDr
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
                    // InternalDroneDSL.g:3209:3: ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:3209:3: ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:3210:4: ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:3210:4: ( (lv_a_15_0= ruleAR ) )
                    // InternalDroneDSL.g:3211:5: (lv_a_15_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3211:5: (lv_a_15_0= ruleAR )
                    // InternalDroneDSL.g:3212:6: lv_a_15_0= ruleAR
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,45,FOLLOW_34); 

                    				newLeafNode(otherlv_16, grammarAccess.getParallele3Access().getAmpersandKeyword_3_1());
                    			
                    // InternalDroneDSL.g:3233:4: ( (lv_b_17_0= ruleMD ) )
                    // InternalDroneDSL.g:3234:5: (lv_b_17_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3234:5: (lv_b_17_0= ruleMD )
                    // InternalDroneDSL.g:3235:6: lv_b_17_0= ruleMD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_18=(Token)match(input,45,FOLLOW_33); 

                    				newLeafNode(otherlv_18, grammarAccess.getParallele3Access().getAmpersandKeyword_3_3());
                    			
                    // InternalDroneDSL.g:3256:4: ( (lv_c_19_0= ruleRGRD ) )
                    // InternalDroneDSL.g:3257:5: (lv_c_19_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:3257:5: (lv_c_19_0= ruleRGRD )
                    // InternalDroneDSL.g:3258:6: lv_c_19_0= ruleRGRD
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
                    // InternalDroneDSL.g:3277:3: ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:3277:3: ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) )
                    // InternalDroneDSL.g:3278:4: ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:3278:4: ( (lv_a_20_0= ruleAR ) )
                    // InternalDroneDSL.g:3279:5: (lv_a_20_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3279:5: (lv_a_20_0= ruleAR )
                    // InternalDroneDSL.g:3280:6: lv_a_20_0= ruleAR
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_21=(Token)match(input,45,FOLLOW_33); 

                    				newLeafNode(otherlv_21, grammarAccess.getParallele3Access().getAmpersandKeyword_4_1());
                    			
                    // InternalDroneDSL.g:3301:4: ( (lv_b_22_0= ruleRGRD ) )
                    // InternalDroneDSL.g:3302:5: (lv_b_22_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:3302:5: (lv_b_22_0= ruleRGRD )
                    // InternalDroneDSL.g:3303:6: lv_b_22_0= ruleRGRD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_23=(Token)match(input,45,FOLLOW_34); 

                    				newLeafNode(otherlv_23, grammarAccess.getParallele3Access().getAmpersandKeyword_4_3());
                    			
                    // InternalDroneDSL.g:3324:4: ( (lv_c_24_0= ruleMD ) )
                    // InternalDroneDSL.g:3325:5: (lv_c_24_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3325:5: (lv_c_24_0= ruleMD )
                    // InternalDroneDSL.g:3326:6: lv_c_24_0= ruleMD
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
                    // InternalDroneDSL.g:3345:3: ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:3345:3: ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:3346:4: ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:3346:4: ( (lv_a_25_0= ruleAR ) )
                    // InternalDroneDSL.g:3347:5: (lv_a_25_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3347:5: (lv_a_25_0= ruleAR )
                    // InternalDroneDSL.g:3348:6: lv_a_25_0= ruleAR
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_26=(Token)match(input,45,FOLLOW_33); 

                    				newLeafNode(otherlv_26, grammarAccess.getParallele3Access().getAmpersandKeyword_5_1());
                    			
                    // InternalDroneDSL.g:3369:4: ( (lv_b_27_0= ruleRGRD ) )
                    // InternalDroneDSL.g:3370:5: (lv_b_27_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:3370:5: (lv_b_27_0= ruleRGRD )
                    // InternalDroneDSL.g:3371:6: lv_b_27_0= ruleRGRD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_28=(Token)match(input,45,FOLLOW_31); 

                    				newLeafNode(otherlv_28, grammarAccess.getParallele3Access().getAmpersandKeyword_5_3());
                    			
                    // InternalDroneDSL.g:3392:4: ( (lv_c_29_0= ruleGDr ) )
                    // InternalDroneDSL.g:3393:5: (lv_c_29_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3393:5: (lv_c_29_0= ruleGDr )
                    // InternalDroneDSL.g:3394:6: lv_c_29_0= ruleGDr
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
                    // InternalDroneDSL.g:3413:3: ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:3413:3: ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) )
                    // InternalDroneDSL.g:3414:4: ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:3414:4: ( (lv_a_30_0= ruleGDr ) )
                    // InternalDroneDSL.g:3415:5: (lv_a_30_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3415:5: (lv_a_30_0= ruleGDr )
                    // InternalDroneDSL.g:3416:6: lv_a_30_0= ruleGDr
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_31=(Token)match(input,45,FOLLOW_32); 

                    				newLeafNode(otherlv_31, grammarAccess.getParallele3Access().getAmpersandKeyword_6_1());
                    			
                    // InternalDroneDSL.g:3437:4: ( (lv_b_32_0= ruleAR ) )
                    // InternalDroneDSL.g:3438:5: (lv_b_32_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3438:5: (lv_b_32_0= ruleAR )
                    // InternalDroneDSL.g:3439:6: lv_b_32_0= ruleAR
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_33=(Token)match(input,45,FOLLOW_34); 

                    				newLeafNode(otherlv_33, grammarAccess.getParallele3Access().getAmpersandKeyword_6_3());
                    			
                    // InternalDroneDSL.g:3460:4: ( (lv_c_34_0= ruleMD ) )
                    // InternalDroneDSL.g:3461:5: (lv_c_34_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3461:5: (lv_c_34_0= ruleMD )
                    // InternalDroneDSL.g:3462:6: lv_c_34_0= ruleMD
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
                    // InternalDroneDSL.g:3481:3: ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:3481:3: ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:3482:4: ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:3482:4: ( (lv_a_35_0= ruleGDr ) )
                    // InternalDroneDSL.g:3483:5: (lv_a_35_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3483:5: (lv_a_35_0= ruleGDr )
                    // InternalDroneDSL.g:3484:6: lv_a_35_0= ruleGDr
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_36=(Token)match(input,45,FOLLOW_32); 

                    				newLeafNode(otherlv_36, grammarAccess.getParallele3Access().getAmpersandKeyword_7_1());
                    			
                    // InternalDroneDSL.g:3505:4: ( (lv_b_37_0= ruleAR ) )
                    // InternalDroneDSL.g:3506:5: (lv_b_37_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3506:5: (lv_b_37_0= ruleAR )
                    // InternalDroneDSL.g:3507:6: lv_b_37_0= ruleAR
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_38=(Token)match(input,45,FOLLOW_33); 

                    				newLeafNode(otherlv_38, grammarAccess.getParallele3Access().getAmpersandKeyword_7_3());
                    			
                    // InternalDroneDSL.g:3528:4: ( (lv_c_39_0= ruleRGRD ) )
                    // InternalDroneDSL.g:3529:5: (lv_c_39_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:3529:5: (lv_c_39_0= ruleRGRD )
                    // InternalDroneDSL.g:3530:6: lv_c_39_0= ruleRGRD
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
                    // InternalDroneDSL.g:3549:3: ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:3549:3: ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) )
                    // InternalDroneDSL.g:3550:4: ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:3550:4: ( (lv_a_40_0= ruleGDr ) )
                    // InternalDroneDSL.g:3551:5: (lv_a_40_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3551:5: (lv_a_40_0= ruleGDr )
                    // InternalDroneDSL.g:3552:6: lv_a_40_0= ruleGDr
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_41=(Token)match(input,45,FOLLOW_34); 

                    				newLeafNode(otherlv_41, grammarAccess.getParallele3Access().getAmpersandKeyword_8_1());
                    			
                    // InternalDroneDSL.g:3573:4: ( (lv_b_42_0= ruleMD ) )
                    // InternalDroneDSL.g:3574:5: (lv_b_42_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3574:5: (lv_b_42_0= ruleMD )
                    // InternalDroneDSL.g:3575:6: lv_b_42_0= ruleMD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_43=(Token)match(input,45,FOLLOW_32); 

                    				newLeafNode(otherlv_43, grammarAccess.getParallele3Access().getAmpersandKeyword_8_3());
                    			
                    // InternalDroneDSL.g:3596:4: ( (lv_c_44_0= ruleAR ) )
                    // InternalDroneDSL.g:3597:5: (lv_c_44_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3597:5: (lv_c_44_0= ruleAR )
                    // InternalDroneDSL.g:3598:6: lv_c_44_0= ruleAR
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
                    // InternalDroneDSL.g:3617:3: ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:3617:3: ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:3618:4: ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:3618:4: ( (lv_a_45_0= ruleGDr ) )
                    // InternalDroneDSL.g:3619:5: (lv_a_45_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3619:5: (lv_a_45_0= ruleGDr )
                    // InternalDroneDSL.g:3620:6: lv_a_45_0= ruleGDr
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_46=(Token)match(input,45,FOLLOW_34); 

                    				newLeafNode(otherlv_46, grammarAccess.getParallele3Access().getAmpersandKeyword_9_1());
                    			
                    // InternalDroneDSL.g:3641:4: ( (lv_b_47_0= ruleMD ) )
                    // InternalDroneDSL.g:3642:5: (lv_b_47_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3642:5: (lv_b_47_0= ruleMD )
                    // InternalDroneDSL.g:3643:6: lv_b_47_0= ruleMD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_48=(Token)match(input,45,FOLLOW_33); 

                    				newLeafNode(otherlv_48, grammarAccess.getParallele3Access().getAmpersandKeyword_9_3());
                    			
                    // InternalDroneDSL.g:3664:4: ( (lv_c_49_0= ruleRGRD ) )
                    // InternalDroneDSL.g:3665:5: (lv_c_49_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:3665:5: (lv_c_49_0= ruleRGRD )
                    // InternalDroneDSL.g:3666:6: lv_c_49_0= ruleRGRD
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
                    // InternalDroneDSL.g:3685:3: ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:3685:3: ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) )
                    // InternalDroneDSL.g:3686:4: ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:3686:4: ( (lv_a_50_0= ruleGDr ) )
                    // InternalDroneDSL.g:3687:5: (lv_a_50_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3687:5: (lv_a_50_0= ruleGDr )
                    // InternalDroneDSL.g:3688:6: lv_a_50_0= ruleGDr
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_51=(Token)match(input,45,FOLLOW_33); 

                    				newLeafNode(otherlv_51, grammarAccess.getParallele3Access().getAmpersandKeyword_10_1());
                    			
                    // InternalDroneDSL.g:3709:4: ( (lv_b_52_0= ruleRGRD ) )
                    // InternalDroneDSL.g:3710:5: (lv_b_52_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:3710:5: (lv_b_52_0= ruleRGRD )
                    // InternalDroneDSL.g:3711:6: lv_b_52_0= ruleRGRD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_53=(Token)match(input,45,FOLLOW_32); 

                    				newLeafNode(otherlv_53, grammarAccess.getParallele3Access().getAmpersandKeyword_10_3());
                    			
                    // InternalDroneDSL.g:3732:4: ( (lv_c_54_0= ruleAR ) )
                    // InternalDroneDSL.g:3733:5: (lv_c_54_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3733:5: (lv_c_54_0= ruleAR )
                    // InternalDroneDSL.g:3734:6: lv_c_54_0= ruleAR
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
                    // InternalDroneDSL.g:3753:3: ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:3753:3: ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) )
                    // InternalDroneDSL.g:3754:4: ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:3754:4: ( (lv_a_55_0= ruleGDr ) )
                    // InternalDroneDSL.g:3755:5: (lv_a_55_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3755:5: (lv_a_55_0= ruleGDr )
                    // InternalDroneDSL.g:3756:6: lv_a_55_0= ruleGDr
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_56=(Token)match(input,45,FOLLOW_33); 

                    				newLeafNode(otherlv_56, grammarAccess.getParallele3Access().getAmpersandKeyword_11_1());
                    			
                    // InternalDroneDSL.g:3777:4: ( (lv_b_57_0= ruleRGRD ) )
                    // InternalDroneDSL.g:3778:5: (lv_b_57_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:3778:5: (lv_b_57_0= ruleRGRD )
                    // InternalDroneDSL.g:3779:6: lv_b_57_0= ruleRGRD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_58=(Token)match(input,45,FOLLOW_34); 

                    				newLeafNode(otherlv_58, grammarAccess.getParallele3Access().getAmpersandKeyword_11_3());
                    			
                    // InternalDroneDSL.g:3800:4: ( (lv_c_59_0= ruleMD ) )
                    // InternalDroneDSL.g:3801:5: (lv_c_59_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3801:5: (lv_c_59_0= ruleMD )
                    // InternalDroneDSL.g:3802:6: lv_c_59_0= ruleMD
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
                    // InternalDroneDSL.g:3821:3: ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:3821:3: ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:3822:4: ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:3822:4: ( (lv_a_60_0= ruleMD ) )
                    // InternalDroneDSL.g:3823:5: (lv_a_60_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3823:5: (lv_a_60_0= ruleMD )
                    // InternalDroneDSL.g:3824:6: lv_a_60_0= ruleMD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_61=(Token)match(input,45,FOLLOW_32); 

                    				newLeafNode(otherlv_61, grammarAccess.getParallele3Access().getAmpersandKeyword_12_1());
                    			
                    // InternalDroneDSL.g:3845:4: ( (lv_b_62_0= ruleAR ) )
                    // InternalDroneDSL.g:3846:5: (lv_b_62_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3846:5: (lv_b_62_0= ruleAR )
                    // InternalDroneDSL.g:3847:6: lv_b_62_0= ruleAR
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_63=(Token)match(input,45,FOLLOW_31); 

                    				newLeafNode(otherlv_63, grammarAccess.getParallele3Access().getAmpersandKeyword_12_3());
                    			
                    // InternalDroneDSL.g:3868:4: ( (lv_c_64_0= ruleGDr ) )
                    // InternalDroneDSL.g:3869:5: (lv_c_64_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3869:5: (lv_c_64_0= ruleGDr )
                    // InternalDroneDSL.g:3870:6: lv_c_64_0= ruleGDr
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
                    // InternalDroneDSL.g:3889:3: ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:3889:3: ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:3890:4: ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:3890:4: ( (lv_a_65_0= ruleMD ) )
                    // InternalDroneDSL.g:3891:5: (lv_a_65_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3891:5: (lv_a_65_0= ruleMD )
                    // InternalDroneDSL.g:3892:6: lv_a_65_0= ruleMD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_66=(Token)match(input,45,FOLLOW_32); 

                    				newLeafNode(otherlv_66, grammarAccess.getParallele3Access().getAmpersandKeyword_13_1());
                    			
                    // InternalDroneDSL.g:3913:4: ( (lv_b_67_0= ruleAR ) )
                    // InternalDroneDSL.g:3914:5: (lv_b_67_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3914:5: (lv_b_67_0= ruleAR )
                    // InternalDroneDSL.g:3915:6: lv_b_67_0= ruleAR
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_68=(Token)match(input,45,FOLLOW_33); 

                    				newLeafNode(otherlv_68, grammarAccess.getParallele3Access().getAmpersandKeyword_13_3());
                    			
                    // InternalDroneDSL.g:3936:4: ( (lv_c_69_0= ruleRGRD ) )
                    // InternalDroneDSL.g:3937:5: (lv_c_69_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:3937:5: (lv_c_69_0= ruleRGRD )
                    // InternalDroneDSL.g:3938:6: lv_c_69_0= ruleRGRD
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
                    // InternalDroneDSL.g:3957:3: ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:3957:3: ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) )
                    // InternalDroneDSL.g:3958:4: ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:3958:4: ( (lv_a_70_0= ruleMD ) )
                    // InternalDroneDSL.g:3959:5: (lv_a_70_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3959:5: (lv_a_70_0= ruleMD )
                    // InternalDroneDSL.g:3960:6: lv_a_70_0= ruleMD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_71=(Token)match(input,45,FOLLOW_31); 

                    				newLeafNode(otherlv_71, grammarAccess.getParallele3Access().getAmpersandKeyword_14_1());
                    			
                    // InternalDroneDSL.g:3981:4: ( (lv_b_72_0= ruleGDr ) )
                    // InternalDroneDSL.g:3982:5: (lv_b_72_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3982:5: (lv_b_72_0= ruleGDr )
                    // InternalDroneDSL.g:3983:6: lv_b_72_0= ruleGDr
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_73=(Token)match(input,45,FOLLOW_32); 

                    				newLeafNode(otherlv_73, grammarAccess.getParallele3Access().getAmpersandKeyword_14_3());
                    			
                    // InternalDroneDSL.g:4004:4: ( (lv_c_74_0= ruleAR ) )
                    // InternalDroneDSL.g:4005:5: (lv_c_74_0= ruleAR )
                    {
                    // InternalDroneDSL.g:4005:5: (lv_c_74_0= ruleAR )
                    // InternalDroneDSL.g:4006:6: lv_c_74_0= ruleAR
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
                    // InternalDroneDSL.g:4025:3: ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:4025:3: ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:4026:4: ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:4026:4: ( (lv_a_75_0= ruleMD ) )
                    // InternalDroneDSL.g:4027:5: (lv_a_75_0= ruleMD )
                    {
                    // InternalDroneDSL.g:4027:5: (lv_a_75_0= ruleMD )
                    // InternalDroneDSL.g:4028:6: lv_a_75_0= ruleMD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_76=(Token)match(input,45,FOLLOW_31); 

                    				newLeafNode(otherlv_76, grammarAccess.getParallele3Access().getAmpersandKeyword_15_1());
                    			
                    // InternalDroneDSL.g:4049:4: ( (lv_b_77_0= ruleGDr ) )
                    // InternalDroneDSL.g:4050:5: (lv_b_77_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:4050:5: (lv_b_77_0= ruleGDr )
                    // InternalDroneDSL.g:4051:6: lv_b_77_0= ruleGDr
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_78=(Token)match(input,45,FOLLOW_33); 

                    				newLeafNode(otherlv_78, grammarAccess.getParallele3Access().getAmpersandKeyword_15_3());
                    			
                    // InternalDroneDSL.g:4072:4: ( (lv_c_79_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4073:5: (lv_c_79_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4073:5: (lv_c_79_0= ruleRGRD )
                    // InternalDroneDSL.g:4074:6: lv_c_79_0= ruleRGRD
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
                    // InternalDroneDSL.g:4093:3: ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:4093:3: ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:4094:4: ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:4094:4: ( (lv_a_80_0= ruleMD ) )
                    // InternalDroneDSL.g:4095:5: (lv_a_80_0= ruleMD )
                    {
                    // InternalDroneDSL.g:4095:5: (lv_a_80_0= ruleMD )
                    // InternalDroneDSL.g:4096:6: lv_a_80_0= ruleMD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_81=(Token)match(input,45,FOLLOW_33); 

                    				newLeafNode(otherlv_81, grammarAccess.getParallele3Access().getAmpersandKeyword_16_1());
                    			
                    // InternalDroneDSL.g:4117:4: ( (lv_b_82_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4118:5: (lv_b_82_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4118:5: (lv_b_82_0= ruleRGRD )
                    // InternalDroneDSL.g:4119:6: lv_b_82_0= ruleRGRD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_83=(Token)match(input,45,FOLLOW_31); 

                    				newLeafNode(otherlv_83, grammarAccess.getParallele3Access().getAmpersandKeyword_16_3());
                    			
                    // InternalDroneDSL.g:4140:4: ( (lv_c_84_0= ruleGDr ) )
                    // InternalDroneDSL.g:4141:5: (lv_c_84_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:4141:5: (lv_c_84_0= ruleGDr )
                    // InternalDroneDSL.g:4142:6: lv_c_84_0= ruleGDr
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
                    // InternalDroneDSL.g:4161:3: ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:4161:3: ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) )
                    // InternalDroneDSL.g:4162:4: ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:4162:4: ( (lv_a_85_0= ruleMD ) )
                    // InternalDroneDSL.g:4163:5: (lv_a_85_0= ruleMD )
                    {
                    // InternalDroneDSL.g:4163:5: (lv_a_85_0= ruleMD )
                    // InternalDroneDSL.g:4164:6: lv_a_85_0= ruleMD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_86=(Token)match(input,45,FOLLOW_33); 

                    				newLeafNode(otherlv_86, grammarAccess.getParallele3Access().getAmpersandKeyword_17_1());
                    			
                    // InternalDroneDSL.g:4185:4: ( (lv_b_87_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4186:5: (lv_b_87_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4186:5: (lv_b_87_0= ruleRGRD )
                    // InternalDroneDSL.g:4187:6: lv_b_87_0= ruleRGRD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_88=(Token)match(input,45,FOLLOW_32); 

                    				newLeafNode(otherlv_88, grammarAccess.getParallele3Access().getAmpersandKeyword_17_3());
                    			
                    // InternalDroneDSL.g:4208:4: ( (lv_c_89_0= ruleAR ) )
                    // InternalDroneDSL.g:4209:5: (lv_c_89_0= ruleAR )
                    {
                    // InternalDroneDSL.g:4209:5: (lv_c_89_0= ruleAR )
                    // InternalDroneDSL.g:4210:6: lv_c_89_0= ruleAR
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
                    // InternalDroneDSL.g:4229:3: ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:4229:3: ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) )
                    // InternalDroneDSL.g:4230:4: ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:4230:4: ( (lv_a_90_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4231:5: (lv_a_90_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4231:5: (lv_a_90_0= ruleRGRD )
                    // InternalDroneDSL.g:4232:6: lv_a_90_0= ruleRGRD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_91=(Token)match(input,45,FOLLOW_32); 

                    				newLeafNode(otherlv_91, grammarAccess.getParallele3Access().getAmpersandKeyword_18_1());
                    			
                    // InternalDroneDSL.g:4253:4: ( (lv_b_92_0= ruleAR ) )
                    // InternalDroneDSL.g:4254:5: (lv_b_92_0= ruleAR )
                    {
                    // InternalDroneDSL.g:4254:5: (lv_b_92_0= ruleAR )
                    // InternalDroneDSL.g:4255:6: lv_b_92_0= ruleAR
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_93=(Token)match(input,45,FOLLOW_34); 

                    				newLeafNode(otherlv_93, grammarAccess.getParallele3Access().getAmpersandKeyword_18_3());
                    			
                    // InternalDroneDSL.g:4276:4: ( (lv_c_94_0= ruleMD ) )
                    // InternalDroneDSL.g:4277:5: (lv_c_94_0= ruleMD )
                    {
                    // InternalDroneDSL.g:4277:5: (lv_c_94_0= ruleMD )
                    // InternalDroneDSL.g:4278:6: lv_c_94_0= ruleMD
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
                    // InternalDroneDSL.g:4297:3: ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:4297:3: ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:4298:4: ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:4298:4: ( (lv_a_95_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4299:5: (lv_a_95_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4299:5: (lv_a_95_0= ruleRGRD )
                    // InternalDroneDSL.g:4300:6: lv_a_95_0= ruleRGRD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_96=(Token)match(input,45,FOLLOW_32); 

                    				newLeafNode(otherlv_96, grammarAccess.getParallele3Access().getAmpersandKeyword_19_1());
                    			
                    // InternalDroneDSL.g:4321:4: ( (lv_b_97_0= ruleAR ) )
                    // InternalDroneDSL.g:4322:5: (lv_b_97_0= ruleAR )
                    {
                    // InternalDroneDSL.g:4322:5: (lv_b_97_0= ruleAR )
                    // InternalDroneDSL.g:4323:6: lv_b_97_0= ruleAR
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_98=(Token)match(input,45,FOLLOW_31); 

                    				newLeafNode(otherlv_98, grammarAccess.getParallele3Access().getAmpersandKeyword_19_3());
                    			
                    // InternalDroneDSL.g:4344:4: ( (lv_c_99_0= ruleGDr ) )
                    // InternalDroneDSL.g:4345:5: (lv_c_99_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:4345:5: (lv_c_99_0= ruleGDr )
                    // InternalDroneDSL.g:4346:6: lv_c_99_0= ruleGDr
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
                    // InternalDroneDSL.g:4365:3: ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:4365:3: ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) )
                    // InternalDroneDSL.g:4366:4: ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:4366:4: ( (lv_a_100_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4367:5: (lv_a_100_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4367:5: (lv_a_100_0= ruleRGRD )
                    // InternalDroneDSL.g:4368:6: lv_a_100_0= ruleRGRD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_101=(Token)match(input,45,FOLLOW_34); 

                    				newLeafNode(otherlv_101, grammarAccess.getParallele3Access().getAmpersandKeyword_20_1());
                    			
                    // InternalDroneDSL.g:4389:4: ( (lv_b_102_0= ruleMD ) )
                    // InternalDroneDSL.g:4390:5: (lv_b_102_0= ruleMD )
                    {
                    // InternalDroneDSL.g:4390:5: (lv_b_102_0= ruleMD )
                    // InternalDroneDSL.g:4391:6: lv_b_102_0= ruleMD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_103=(Token)match(input,45,FOLLOW_32); 

                    				newLeafNode(otherlv_103, grammarAccess.getParallele3Access().getAmpersandKeyword_20_3());
                    			
                    // InternalDroneDSL.g:4412:4: ( (lv_c_104_0= ruleAR ) )
                    // InternalDroneDSL.g:4413:5: (lv_c_104_0= ruleAR )
                    {
                    // InternalDroneDSL.g:4413:5: (lv_c_104_0= ruleAR )
                    // InternalDroneDSL.g:4414:6: lv_c_104_0= ruleAR
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
                    // InternalDroneDSL.g:4433:3: ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:4433:3: ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:4434:4: ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:4434:4: ( (lv_a_105_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4435:5: (lv_a_105_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4435:5: (lv_a_105_0= ruleRGRD )
                    // InternalDroneDSL.g:4436:6: lv_a_105_0= ruleRGRD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_106=(Token)match(input,45,FOLLOW_34); 

                    				newLeafNode(otherlv_106, grammarAccess.getParallele3Access().getAmpersandKeyword_21_1());
                    			
                    // InternalDroneDSL.g:4457:4: ( (lv_b_107_0= ruleMD ) )
                    // InternalDroneDSL.g:4458:5: (lv_b_107_0= ruleMD )
                    {
                    // InternalDroneDSL.g:4458:5: (lv_b_107_0= ruleMD )
                    // InternalDroneDSL.g:4459:6: lv_b_107_0= ruleMD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_108=(Token)match(input,45,FOLLOW_31); 

                    				newLeafNode(otherlv_108, grammarAccess.getParallele3Access().getAmpersandKeyword_21_3());
                    			
                    // InternalDroneDSL.g:4480:4: ( (lv_c_109_0= ruleGDr ) )
                    // InternalDroneDSL.g:4481:5: (lv_c_109_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:4481:5: (lv_c_109_0= ruleGDr )
                    // InternalDroneDSL.g:4482:6: lv_c_109_0= ruleGDr
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
                    // InternalDroneDSL.g:4501:3: ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:4501:3: ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) )
                    // InternalDroneDSL.g:4502:4: ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:4502:4: ( (lv_a_110_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4503:5: (lv_a_110_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4503:5: (lv_a_110_0= ruleRGRD )
                    // InternalDroneDSL.g:4504:6: lv_a_110_0= ruleRGRD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_111=(Token)match(input,45,FOLLOW_31); 

                    				newLeafNode(otherlv_111, grammarAccess.getParallele3Access().getAmpersandKeyword_22_1());
                    			
                    // InternalDroneDSL.g:4525:4: ( (lv_b_112_0= ruleGDr ) )
                    // InternalDroneDSL.g:4526:5: (lv_b_112_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:4526:5: (lv_b_112_0= ruleGDr )
                    // InternalDroneDSL.g:4527:6: lv_b_112_0= ruleGDr
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_113=(Token)match(input,45,FOLLOW_34); 

                    				newLeafNode(otherlv_113, grammarAccess.getParallele3Access().getAmpersandKeyword_22_3());
                    			
                    // InternalDroneDSL.g:4548:4: ( (lv_c_114_0= ruleMD ) )
                    // InternalDroneDSL.g:4549:5: (lv_c_114_0= ruleMD )
                    {
                    // InternalDroneDSL.g:4549:5: (lv_c_114_0= ruleMD )
                    // InternalDroneDSL.g:4550:6: lv_c_114_0= ruleMD
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
                    // InternalDroneDSL.g:4569:3: ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:4569:3: ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) )
                    // InternalDroneDSL.g:4570:4: ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:4570:4: ( (lv_a_115_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4571:5: (lv_a_115_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4571:5: (lv_a_115_0= ruleRGRD )
                    // InternalDroneDSL.g:4572:6: lv_a_115_0= ruleRGRD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_116=(Token)match(input,45,FOLLOW_31); 

                    				newLeafNode(otherlv_116, grammarAccess.getParallele3Access().getAmpersandKeyword_23_1());
                    			
                    // InternalDroneDSL.g:4593:4: ( (lv_b_117_0= ruleGDr ) )
                    // InternalDroneDSL.g:4594:5: (lv_b_117_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:4594:5: (lv_b_117_0= ruleGDr )
                    // InternalDroneDSL.g:4595:6: lv_b_117_0= ruleGDr
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSL.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_118=(Token)match(input,45,FOLLOW_32); 

                    				newLeafNode(otherlv_118, grammarAccess.getParallele3Access().getAmpersandKeyword_23_3());
                    			
                    // InternalDroneDSL.g:4616:4: ( (lv_c_119_0= ruleAR ) )
                    // InternalDroneDSL.g:4617:5: (lv_c_119_0= ruleAR )
                    {
                    // InternalDroneDSL.g:4617:5: (lv_c_119_0= ruleAR )
                    // InternalDroneDSL.g:4618:6: lv_c_119_0= ruleAR
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
    // InternalDroneDSL.g:4640:1: entryRuleParallele4 returns [EObject current=null] : iv_ruleParallele4= ruleParallele4 EOF ;
    public final EObject entryRuleParallele4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallele4 = null;


        try {
            // InternalDroneDSL.g:4640:51: (iv_ruleParallele4= ruleParallele4 EOF )
            // InternalDroneDSL.g:4641:2: iv_ruleParallele4= ruleParallele4 EOF
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
    // InternalDroneDSL.g:4647:1: ruleParallele4 returns [EObject current=null] : ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) ) | ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) ) | ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) ) | ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) ) | ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) ) | ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) ) | ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) ) | ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) ) | ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) ) | ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) ) | ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) ) | ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) ) | ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) ) | ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) ) | ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) ) | ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) ) | ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) ) | ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) ) | ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) ) | ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) ) | ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) ) | ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) ) | ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) ) | ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) ) ) ;
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
            // InternalDroneDSL.g:4653:2: ( ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) ) | ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) ) | ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) ) | ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) ) | ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) ) | ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) ) | ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) ) | ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) ) | ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) ) | ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) ) | ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) ) | ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) ) | ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) ) | ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) ) | ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) ) | ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) ) | ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) ) | ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) ) | ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) ) | ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) ) | ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) ) | ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) ) | ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) ) | ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) ) ) )
            // InternalDroneDSL.g:4654:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) ) | ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) ) | ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) ) | ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) ) | ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) ) | ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) ) | ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) ) | ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) ) | ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) ) | ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) ) | ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) ) | ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) ) | ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) ) | ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) ) | ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) ) | ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) ) | ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) ) | ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) ) | ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) ) | ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) ) | ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) ) | ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) ) | ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) ) | ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) ) )
            {
            // InternalDroneDSL.g:4654:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) ) | ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) ) | ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) ) | ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) ) | ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) ) | ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) ) | ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) ) | ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) ) | ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) ) | ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) ) | ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) ) | ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) ) | ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) ) | ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) ) | ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) ) | ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) ) | ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) ) | ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) ) | ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) ) | ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) ) | ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) ) | ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) ) | ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) ) | ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) ) )
            int alt21=24;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalDroneDSL.g:4655:3: ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:4655:3: ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:4656:4: ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:4656:4: ( (lv_a_0_0= ruleAR ) )
                    // InternalDroneDSL.g:4657:5: (lv_a_0_0= ruleAR )
                    {
                    // InternalDroneDSL.g:4657:5: (lv_a_0_0= ruleAR )
                    // InternalDroneDSL.g:4658:6: lv_a_0_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAARParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_1=(Token)match(input,45,FOLLOW_31); 

                    				newLeafNode(otherlv_1, grammarAccess.getParallele4Access().getAmpersandKeyword_0_1());
                    			
                    // InternalDroneDSL.g:4679:4: ( (lv_b_2_0= ruleGDr ) )
                    // InternalDroneDSL.g:4680:5: (lv_b_2_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:4680:5: (lv_b_2_0= ruleGDr )
                    // InternalDroneDSL.g:4681:6: lv_b_2_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBGDrParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_3=(Token)match(input,45,FOLLOW_34); 

                    				newLeafNode(otherlv_3, grammarAccess.getParallele4Access().getAmpersandKeyword_0_3());
                    			
                    // InternalDroneDSL.g:4702:4: ( (lv_c_4_0= ruleMD ) )
                    // InternalDroneDSL.g:4703:5: (lv_c_4_0= ruleMD )
                    {
                    // InternalDroneDSL.g:4703:5: (lv_c_4_0= ruleMD )
                    // InternalDroneDSL.g:4704:6: lv_c_4_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCMDParserRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_5=(Token)match(input,45,FOLLOW_33); 

                    				newLeafNode(otherlv_5, grammarAccess.getParallele4Access().getAmpersandKeyword_0_5());
                    			
                    // InternalDroneDSL.g:4725:4: ( (lv_d_6_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4726:5: (lv_d_6_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4726:5: (lv_d_6_0= ruleRGRD )
                    // InternalDroneDSL.g:4727:6: lv_d_6_0= ruleRGRD
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
                    // InternalDroneDSL.g:4746:3: ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:4746:3: ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) )
                    // InternalDroneDSL.g:4747:4: ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:4747:4: ( (lv_a_7_0= ruleAR ) )
                    // InternalDroneDSL.g:4748:5: (lv_a_7_0= ruleAR )
                    {
                    // InternalDroneDSL.g:4748:5: (lv_a_7_0= ruleAR )
                    // InternalDroneDSL.g:4749:6: lv_a_7_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAARParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_8=(Token)match(input,45,FOLLOW_31); 

                    				newLeafNode(otherlv_8, grammarAccess.getParallele4Access().getAmpersandKeyword_1_1());
                    			
                    // InternalDroneDSL.g:4770:4: ( (lv_b_9_0= ruleGDr ) )
                    // InternalDroneDSL.g:4771:5: (lv_b_9_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:4771:5: (lv_b_9_0= ruleGDr )
                    // InternalDroneDSL.g:4772:6: lv_b_9_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBGDrParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_10=(Token)match(input,45,FOLLOW_33); 

                    				newLeafNode(otherlv_10, grammarAccess.getParallele4Access().getAmpersandKeyword_1_3());
                    			
                    // InternalDroneDSL.g:4793:4: ( (lv_c_11_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4794:5: (lv_c_11_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4794:5: (lv_c_11_0= ruleRGRD )
                    // InternalDroneDSL.g:4795:6: lv_c_11_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCRGRDParserRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_12=(Token)match(input,45,FOLLOW_34); 

                    				newLeafNode(otherlv_12, grammarAccess.getParallele4Access().getAmpersandKeyword_1_5());
                    			
                    // InternalDroneDSL.g:4816:4: ( (lv_d_13_0= ruleMD ) )
                    // InternalDroneDSL.g:4817:5: (lv_d_13_0= ruleMD )
                    {
                    // InternalDroneDSL.g:4817:5: (lv_d_13_0= ruleMD )
                    // InternalDroneDSL.g:4818:6: lv_d_13_0= ruleMD
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
                    // InternalDroneDSL.g:4837:3: ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:4837:3: ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:4838:4: ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:4838:4: ( (lv_a_14_0= ruleAR ) )
                    // InternalDroneDSL.g:4839:5: (lv_a_14_0= ruleAR )
                    {
                    // InternalDroneDSL.g:4839:5: (lv_a_14_0= ruleAR )
                    // InternalDroneDSL.g:4840:6: lv_a_14_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAARParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_15=(Token)match(input,45,FOLLOW_34); 

                    				newLeafNode(otherlv_15, grammarAccess.getParallele4Access().getAmpersandKeyword_2_1());
                    			
                    // InternalDroneDSL.g:4861:4: ( (lv_b_16_0= ruleMD ) )
                    // InternalDroneDSL.g:4862:5: (lv_b_16_0= ruleMD )
                    {
                    // InternalDroneDSL.g:4862:5: (lv_b_16_0= ruleMD )
                    // InternalDroneDSL.g:4863:6: lv_b_16_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBMDParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_17=(Token)match(input,45,FOLLOW_31); 

                    				newLeafNode(otherlv_17, grammarAccess.getParallele4Access().getAmpersandKeyword_2_3());
                    			
                    // InternalDroneDSL.g:4884:4: ( (lv_c_18_0= ruleGDr ) )
                    // InternalDroneDSL.g:4885:5: (lv_c_18_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:4885:5: (lv_c_18_0= ruleGDr )
                    // InternalDroneDSL.g:4886:6: lv_c_18_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCGDrParserRuleCall_2_4_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_19=(Token)match(input,45,FOLLOW_33); 

                    				newLeafNode(otherlv_19, grammarAccess.getParallele4Access().getAmpersandKeyword_2_5());
                    			
                    // InternalDroneDSL.g:4907:4: ( (lv_d_20_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4908:5: (lv_d_20_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4908:5: (lv_d_20_0= ruleRGRD )
                    // InternalDroneDSL.g:4909:6: lv_d_20_0= ruleRGRD
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
                    // InternalDroneDSL.g:4928:3: ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:4928:3: ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:4929:4: ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:4929:4: ( (lv_a_21_0= ruleAR ) )
                    // InternalDroneDSL.g:4930:5: (lv_a_21_0= ruleAR )
                    {
                    // InternalDroneDSL.g:4930:5: (lv_a_21_0= ruleAR )
                    // InternalDroneDSL.g:4931:6: lv_a_21_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAARParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_22=(Token)match(input,45,FOLLOW_34); 

                    				newLeafNode(otherlv_22, grammarAccess.getParallele4Access().getAmpersandKeyword_3_1());
                    			
                    // InternalDroneDSL.g:4952:4: ( (lv_b_23_0= ruleMD ) )
                    // InternalDroneDSL.g:4953:5: (lv_b_23_0= ruleMD )
                    {
                    // InternalDroneDSL.g:4953:5: (lv_b_23_0= ruleMD )
                    // InternalDroneDSL.g:4954:6: lv_b_23_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBMDParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_24=(Token)match(input,45,FOLLOW_33); 

                    				newLeafNode(otherlv_24, grammarAccess.getParallele4Access().getAmpersandKeyword_3_3());
                    			
                    // InternalDroneDSL.g:4975:4: ( (lv_c_25_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4976:5: (lv_c_25_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4976:5: (lv_c_25_0= ruleRGRD )
                    // InternalDroneDSL.g:4977:6: lv_c_25_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCRGRDParserRuleCall_3_4_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_26=(Token)match(input,45,FOLLOW_31); 

                    				newLeafNode(otherlv_26, grammarAccess.getParallele4Access().getAmpersandKeyword_3_5());
                    			
                    // InternalDroneDSL.g:4998:4: ( (lv_d_27_0= ruleGDr ) )
                    // InternalDroneDSL.g:4999:5: (lv_d_27_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:4999:5: (lv_d_27_0= ruleGDr )
                    // InternalDroneDSL.g:5000:6: lv_d_27_0= ruleGDr
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
                    // InternalDroneDSL.g:5019:3: ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:5019:3: ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:5020:4: ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:5020:4: ( (lv_a_28_0= ruleAR ) )
                    // InternalDroneDSL.g:5021:5: (lv_a_28_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5021:5: (lv_a_28_0= ruleAR )
                    // InternalDroneDSL.g:5022:6: lv_a_28_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAARParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_29=(Token)match(input,45,FOLLOW_33); 

                    				newLeafNode(otherlv_29, grammarAccess.getParallele4Access().getAmpersandKeyword_4_1());
                    			
                    // InternalDroneDSL.g:5043:4: ( (lv_b_30_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5044:5: (lv_b_30_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5044:5: (lv_b_30_0= ruleRGRD )
                    // InternalDroneDSL.g:5045:6: lv_b_30_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBRGRDParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_31=(Token)match(input,45,FOLLOW_34); 

                    				newLeafNode(otherlv_31, grammarAccess.getParallele4Access().getAmpersandKeyword_4_3());
                    			
                    // InternalDroneDSL.g:5066:4: ( (lv_c_32_0= ruleMD ) )
                    // InternalDroneDSL.g:5067:5: (lv_c_32_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5067:5: (lv_c_32_0= ruleMD )
                    // InternalDroneDSL.g:5068:6: lv_c_32_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCMDParserRuleCall_4_4_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_33=(Token)match(input,45,FOLLOW_31); 

                    				newLeafNode(otherlv_33, grammarAccess.getParallele4Access().getAmpersandKeyword_4_5());
                    			
                    // InternalDroneDSL.g:5089:4: ( (lv_d_34_0= ruleGDr ) )
                    // InternalDroneDSL.g:5090:5: (lv_d_34_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5090:5: (lv_d_34_0= ruleGDr )
                    // InternalDroneDSL.g:5091:6: lv_d_34_0= ruleGDr
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
                    // InternalDroneDSL.g:5110:3: ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:5110:3: ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) )
                    // InternalDroneDSL.g:5111:4: ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:5111:4: ( (lv_a_35_0= ruleAR ) )
                    // InternalDroneDSL.g:5112:5: (lv_a_35_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5112:5: (lv_a_35_0= ruleAR )
                    // InternalDroneDSL.g:5113:6: lv_a_35_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAARParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_36=(Token)match(input,45,FOLLOW_33); 

                    				newLeafNode(otherlv_36, grammarAccess.getParallele4Access().getAmpersandKeyword_5_1());
                    			
                    // InternalDroneDSL.g:5134:4: ( (lv_b_37_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5135:5: (lv_b_37_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5135:5: (lv_b_37_0= ruleRGRD )
                    // InternalDroneDSL.g:5136:6: lv_b_37_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBRGRDParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_38=(Token)match(input,45,FOLLOW_31); 

                    				newLeafNode(otherlv_38, grammarAccess.getParallele4Access().getAmpersandKeyword_5_3());
                    			
                    // InternalDroneDSL.g:5157:4: ( (lv_c_39_0= ruleGDr ) )
                    // InternalDroneDSL.g:5158:5: (lv_c_39_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5158:5: (lv_c_39_0= ruleGDr )
                    // InternalDroneDSL.g:5159:6: lv_c_39_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCGDrParserRuleCall_5_4_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_40=(Token)match(input,45,FOLLOW_34); 

                    				newLeafNode(otherlv_40, grammarAccess.getParallele4Access().getAmpersandKeyword_5_5());
                    			
                    // InternalDroneDSL.g:5180:4: ( (lv_d_41_0= ruleMD ) )
                    // InternalDroneDSL.g:5181:5: (lv_d_41_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5181:5: (lv_d_41_0= ruleMD )
                    // InternalDroneDSL.g:5182:6: lv_d_41_0= ruleMD
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
                    // InternalDroneDSL.g:5201:3: ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:5201:3: ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:5202:4: ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:5202:4: ( (lv_a_42_0= ruleGDr ) )
                    // InternalDroneDSL.g:5203:5: (lv_a_42_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5203:5: (lv_a_42_0= ruleGDr )
                    // InternalDroneDSL.g:5204:6: lv_a_42_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAGDrParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_43=(Token)match(input,45,FOLLOW_32); 

                    				newLeafNode(otherlv_43, grammarAccess.getParallele4Access().getAmpersandKeyword_6_1());
                    			
                    // InternalDroneDSL.g:5225:4: ( (lv_b_44_0= ruleAR ) )
                    // InternalDroneDSL.g:5226:5: (lv_b_44_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5226:5: (lv_b_44_0= ruleAR )
                    // InternalDroneDSL.g:5227:6: lv_b_44_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBARParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_45=(Token)match(input,45,FOLLOW_34); 

                    				newLeafNode(otherlv_45, grammarAccess.getParallele4Access().getAmpersandKeyword_6_3());
                    			
                    // InternalDroneDSL.g:5248:4: ( (lv_c_46_0= ruleMD ) )
                    // InternalDroneDSL.g:5249:5: (lv_c_46_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5249:5: (lv_c_46_0= ruleMD )
                    // InternalDroneDSL.g:5250:6: lv_c_46_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCMDParserRuleCall_6_4_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_47=(Token)match(input,45,FOLLOW_33); 

                    				newLeafNode(otherlv_47, grammarAccess.getParallele4Access().getAmpersandKeyword_6_5());
                    			
                    // InternalDroneDSL.g:5271:4: ( (lv_d_48_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5272:5: (lv_d_48_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5272:5: (lv_d_48_0= ruleRGRD )
                    // InternalDroneDSL.g:5273:6: lv_d_48_0= ruleRGRD
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
                    // InternalDroneDSL.g:5292:3: ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:5292:3: ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) )
                    // InternalDroneDSL.g:5293:4: ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:5293:4: ( (lv_a_49_0= ruleGDr ) )
                    // InternalDroneDSL.g:5294:5: (lv_a_49_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5294:5: (lv_a_49_0= ruleGDr )
                    // InternalDroneDSL.g:5295:6: lv_a_49_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAGDrParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_50=(Token)match(input,45,FOLLOW_32); 

                    				newLeafNode(otherlv_50, grammarAccess.getParallele4Access().getAmpersandKeyword_7_1());
                    			
                    // InternalDroneDSL.g:5316:4: ( (lv_b_51_0= ruleAR ) )
                    // InternalDroneDSL.g:5317:5: (lv_b_51_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5317:5: (lv_b_51_0= ruleAR )
                    // InternalDroneDSL.g:5318:6: lv_b_51_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBARParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_52=(Token)match(input,45,FOLLOW_33); 

                    				newLeafNode(otherlv_52, grammarAccess.getParallele4Access().getAmpersandKeyword_7_3());
                    			
                    // InternalDroneDSL.g:5339:4: ( (lv_c_53_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5340:5: (lv_c_53_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5340:5: (lv_c_53_0= ruleRGRD )
                    // InternalDroneDSL.g:5341:6: lv_c_53_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCRGRDParserRuleCall_7_4_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_54=(Token)match(input,45,FOLLOW_34); 

                    				newLeafNode(otherlv_54, grammarAccess.getParallele4Access().getAmpersandKeyword_7_5());
                    			
                    // InternalDroneDSL.g:5362:4: ( (lv_d_55_0= ruleMD ) )
                    // InternalDroneDSL.g:5363:5: (lv_d_55_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5363:5: (lv_d_55_0= ruleMD )
                    // InternalDroneDSL.g:5364:6: lv_d_55_0= ruleMD
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
                    // InternalDroneDSL.g:5383:3: ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:5383:3: ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:5384:4: ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:5384:4: ( (lv_a_56_0= ruleGDr ) )
                    // InternalDroneDSL.g:5385:5: (lv_a_56_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5385:5: (lv_a_56_0= ruleGDr )
                    // InternalDroneDSL.g:5386:6: lv_a_56_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAGDrParserRuleCall_8_0_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_57=(Token)match(input,45,FOLLOW_34); 

                    				newLeafNode(otherlv_57, grammarAccess.getParallele4Access().getAmpersandKeyword_8_1());
                    			
                    // InternalDroneDSL.g:5407:4: ( (lv_b_58_0= ruleMD ) )
                    // InternalDroneDSL.g:5408:5: (lv_b_58_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5408:5: (lv_b_58_0= ruleMD )
                    // InternalDroneDSL.g:5409:6: lv_b_58_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBMDParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_59=(Token)match(input,45,FOLLOW_32); 

                    				newLeafNode(otherlv_59, grammarAccess.getParallele4Access().getAmpersandKeyword_8_3());
                    			
                    // InternalDroneDSL.g:5430:4: ( (lv_c_60_0= ruleAR ) )
                    // InternalDroneDSL.g:5431:5: (lv_c_60_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5431:5: (lv_c_60_0= ruleAR )
                    // InternalDroneDSL.g:5432:6: lv_c_60_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCARParserRuleCall_8_4_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_61=(Token)match(input,45,FOLLOW_33); 

                    				newLeafNode(otherlv_61, grammarAccess.getParallele4Access().getAmpersandKeyword_8_5());
                    			
                    // InternalDroneDSL.g:5453:4: ( (lv_d_62_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5454:5: (lv_d_62_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5454:5: (lv_d_62_0= ruleRGRD )
                    // InternalDroneDSL.g:5455:6: lv_d_62_0= ruleRGRD
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
                    // InternalDroneDSL.g:5474:3: ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:5474:3: ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) )
                    // InternalDroneDSL.g:5475:4: ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:5475:4: ( (lv_a_63_0= ruleGDr ) )
                    // InternalDroneDSL.g:5476:5: (lv_a_63_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5476:5: (lv_a_63_0= ruleGDr )
                    // InternalDroneDSL.g:5477:6: lv_a_63_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAGDrParserRuleCall_9_0_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_64=(Token)match(input,45,FOLLOW_34); 

                    				newLeafNode(otherlv_64, grammarAccess.getParallele4Access().getAmpersandKeyword_9_1());
                    			
                    // InternalDroneDSL.g:5498:4: ( (lv_b_65_0= ruleMD ) )
                    // InternalDroneDSL.g:5499:5: (lv_b_65_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5499:5: (lv_b_65_0= ruleMD )
                    // InternalDroneDSL.g:5500:6: lv_b_65_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBMDParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_66=(Token)match(input,45,FOLLOW_33); 

                    				newLeafNode(otherlv_66, grammarAccess.getParallele4Access().getAmpersandKeyword_9_3());
                    			
                    // InternalDroneDSL.g:5521:4: ( (lv_c_67_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5522:5: (lv_c_67_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5522:5: (lv_c_67_0= ruleRGRD )
                    // InternalDroneDSL.g:5523:6: lv_c_67_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCRGRDParserRuleCall_9_4_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_68=(Token)match(input,45,FOLLOW_32); 

                    				newLeafNode(otherlv_68, grammarAccess.getParallele4Access().getAmpersandKeyword_9_5());
                    			
                    // InternalDroneDSL.g:5544:4: ( (lv_d_69_0= ruleAR ) )
                    // InternalDroneDSL.g:5545:5: (lv_d_69_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5545:5: (lv_d_69_0= ruleAR )
                    // InternalDroneDSL.g:5546:6: lv_d_69_0= ruleAR
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
                    // InternalDroneDSL.g:5565:3: ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:5565:3: ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) )
                    // InternalDroneDSL.g:5566:4: ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:5566:4: ( (lv_a_70_0= ruleGDr ) )
                    // InternalDroneDSL.g:5567:5: (lv_a_70_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5567:5: (lv_a_70_0= ruleGDr )
                    // InternalDroneDSL.g:5568:6: lv_a_70_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAGDrParserRuleCall_10_0_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_71=(Token)match(input,45,FOLLOW_33); 

                    				newLeafNode(otherlv_71, grammarAccess.getParallele4Access().getAmpersandKeyword_10_1());
                    			
                    // InternalDroneDSL.g:5589:4: ( (lv_b_72_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5590:5: (lv_b_72_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5590:5: (lv_b_72_0= ruleRGRD )
                    // InternalDroneDSL.g:5591:6: lv_b_72_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBRGRDParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_73=(Token)match(input,45,FOLLOW_32); 

                    				newLeafNode(otherlv_73, grammarAccess.getParallele4Access().getAmpersandKeyword_10_3());
                    			
                    // InternalDroneDSL.g:5612:4: ( (lv_c_74_0= ruleAR ) )
                    // InternalDroneDSL.g:5613:5: (lv_c_74_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5613:5: (lv_c_74_0= ruleAR )
                    // InternalDroneDSL.g:5614:6: lv_c_74_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCARParserRuleCall_10_4_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_75=(Token)match(input,45,FOLLOW_34); 

                    				newLeafNode(otherlv_75, grammarAccess.getParallele4Access().getAmpersandKeyword_10_5());
                    			
                    // InternalDroneDSL.g:5635:4: ( (lv_d_76_0= ruleMD ) )
                    // InternalDroneDSL.g:5636:5: (lv_d_76_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5636:5: (lv_d_76_0= ruleMD )
                    // InternalDroneDSL.g:5637:6: lv_d_76_0= ruleMD
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
                    // InternalDroneDSL.g:5656:3: ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:5656:3: ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) )
                    // InternalDroneDSL.g:5657:4: ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:5657:4: ( (lv_a_77_0= ruleGDr ) )
                    // InternalDroneDSL.g:5658:5: (lv_a_77_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5658:5: (lv_a_77_0= ruleGDr )
                    // InternalDroneDSL.g:5659:6: lv_a_77_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAGDrParserRuleCall_11_0_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_78=(Token)match(input,45,FOLLOW_33); 

                    				newLeafNode(otherlv_78, grammarAccess.getParallele4Access().getAmpersandKeyword_11_1());
                    			
                    // InternalDroneDSL.g:5680:4: ( (lv_b_79_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5681:5: (lv_b_79_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5681:5: (lv_b_79_0= ruleRGRD )
                    // InternalDroneDSL.g:5682:6: lv_b_79_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBRGRDParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_80=(Token)match(input,45,FOLLOW_34); 

                    				newLeafNode(otherlv_80, grammarAccess.getParallele4Access().getAmpersandKeyword_11_3());
                    			
                    // InternalDroneDSL.g:5703:4: ( (lv_c_81_0= ruleMD ) )
                    // InternalDroneDSL.g:5704:5: (lv_c_81_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5704:5: (lv_c_81_0= ruleMD )
                    // InternalDroneDSL.g:5705:6: lv_c_81_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCMDParserRuleCall_11_4_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_82=(Token)match(input,45,FOLLOW_32); 

                    				newLeafNode(otherlv_82, grammarAccess.getParallele4Access().getAmpersandKeyword_11_5());
                    			
                    // InternalDroneDSL.g:5726:4: ( (lv_d_83_0= ruleAR ) )
                    // InternalDroneDSL.g:5727:5: (lv_d_83_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5727:5: (lv_d_83_0= ruleAR )
                    // InternalDroneDSL.g:5728:6: lv_d_83_0= ruleAR
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
                    // InternalDroneDSL.g:5747:3: ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:5747:3: ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:5748:4: ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:5748:4: ( (lv_a_84_0= ruleMD ) )
                    // InternalDroneDSL.g:5749:5: (lv_a_84_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5749:5: (lv_a_84_0= ruleMD )
                    // InternalDroneDSL.g:5750:6: lv_a_84_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAMDParserRuleCall_12_0_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_85=(Token)match(input,45,FOLLOW_32); 

                    				newLeafNode(otherlv_85, grammarAccess.getParallele4Access().getAmpersandKeyword_12_1());
                    			
                    // InternalDroneDSL.g:5771:4: ( (lv_b_86_0= ruleAR ) )
                    // InternalDroneDSL.g:5772:5: (lv_b_86_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5772:5: (lv_b_86_0= ruleAR )
                    // InternalDroneDSL.g:5773:6: lv_b_86_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBARParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_87=(Token)match(input,45,FOLLOW_31); 

                    				newLeafNode(otherlv_87, grammarAccess.getParallele4Access().getAmpersandKeyword_12_3());
                    			
                    // InternalDroneDSL.g:5794:4: ( (lv_c_88_0= ruleGDr ) )
                    // InternalDroneDSL.g:5795:5: (lv_c_88_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5795:5: (lv_c_88_0= ruleGDr )
                    // InternalDroneDSL.g:5796:6: lv_c_88_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCGDrParserRuleCall_12_4_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_89=(Token)match(input,45,FOLLOW_33); 

                    				newLeafNode(otherlv_89, grammarAccess.getParallele4Access().getAmpersandKeyword_12_5());
                    			
                    // InternalDroneDSL.g:5817:4: ( (lv_d_90_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5818:5: (lv_d_90_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5818:5: (lv_d_90_0= ruleRGRD )
                    // InternalDroneDSL.g:5819:6: lv_d_90_0= ruleRGRD
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
                    // InternalDroneDSL.g:5838:3: ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:5838:3: ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:5839:4: ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:5839:4: ( (lv_a_91_0= ruleMD ) )
                    // InternalDroneDSL.g:5840:5: (lv_a_91_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5840:5: (lv_a_91_0= ruleMD )
                    // InternalDroneDSL.g:5841:6: lv_a_91_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAMDParserRuleCall_13_0_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_92=(Token)match(input,45,FOLLOW_32); 

                    				newLeafNode(otherlv_92, grammarAccess.getParallele4Access().getAmpersandKeyword_13_1());
                    			
                    // InternalDroneDSL.g:5862:4: ( (lv_b_93_0= ruleAR ) )
                    // InternalDroneDSL.g:5863:5: (lv_b_93_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5863:5: (lv_b_93_0= ruleAR )
                    // InternalDroneDSL.g:5864:6: lv_b_93_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBARParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_94=(Token)match(input,45,FOLLOW_33); 

                    				newLeafNode(otherlv_94, grammarAccess.getParallele4Access().getAmpersandKeyword_13_3());
                    			
                    // InternalDroneDSL.g:5885:4: ( (lv_c_95_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5886:5: (lv_c_95_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5886:5: (lv_c_95_0= ruleRGRD )
                    // InternalDroneDSL.g:5887:6: lv_c_95_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCRGRDParserRuleCall_13_4_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_96=(Token)match(input,45,FOLLOW_31); 

                    				newLeafNode(otherlv_96, grammarAccess.getParallele4Access().getAmpersandKeyword_13_5());
                    			
                    // InternalDroneDSL.g:5908:4: ( (lv_d_97_0= ruleGDr ) )
                    // InternalDroneDSL.g:5909:5: (lv_d_97_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5909:5: (lv_d_97_0= ruleGDr )
                    // InternalDroneDSL.g:5910:6: lv_d_97_0= ruleGDr
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
                    // InternalDroneDSL.g:5929:3: ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:5929:3: ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:5930:4: ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:5930:4: ( (lv_a_98_0= ruleMD ) )
                    // InternalDroneDSL.g:5931:5: (lv_a_98_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5931:5: (lv_a_98_0= ruleMD )
                    // InternalDroneDSL.g:5932:6: lv_a_98_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAMDParserRuleCall_14_0_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_99=(Token)match(input,45,FOLLOW_31); 

                    				newLeafNode(otherlv_99, grammarAccess.getParallele4Access().getAmpersandKeyword_14_1());
                    			
                    // InternalDroneDSL.g:5953:4: ( (lv_b_100_0= ruleGDr ) )
                    // InternalDroneDSL.g:5954:5: (lv_b_100_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5954:5: (lv_b_100_0= ruleGDr )
                    // InternalDroneDSL.g:5955:6: lv_b_100_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBGDrParserRuleCall_14_2_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_101=(Token)match(input,45,FOLLOW_32); 

                    				newLeafNode(otherlv_101, grammarAccess.getParallele4Access().getAmpersandKeyword_14_3());
                    			
                    // InternalDroneDSL.g:5976:4: ( (lv_c_102_0= ruleAR ) )
                    // InternalDroneDSL.g:5977:5: (lv_c_102_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5977:5: (lv_c_102_0= ruleAR )
                    // InternalDroneDSL.g:5978:6: lv_c_102_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCARParserRuleCall_14_4_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_103=(Token)match(input,45,FOLLOW_33); 

                    				newLeafNode(otherlv_103, grammarAccess.getParallele4Access().getAmpersandKeyword_14_5());
                    			
                    // InternalDroneDSL.g:5999:4: ( (lv_d_104_0= ruleRGRD ) )
                    // InternalDroneDSL.g:6000:5: (lv_d_104_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:6000:5: (lv_d_104_0= ruleRGRD )
                    // InternalDroneDSL.g:6001:6: lv_d_104_0= ruleRGRD
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
                    // InternalDroneDSL.g:6020:3: ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:6020:3: ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) )
                    // InternalDroneDSL.g:6021:4: ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:6021:4: ( (lv_a_105_0= ruleMD ) )
                    // InternalDroneDSL.g:6022:5: (lv_a_105_0= ruleMD )
                    {
                    // InternalDroneDSL.g:6022:5: (lv_a_105_0= ruleMD )
                    // InternalDroneDSL.g:6023:6: lv_a_105_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAMDParserRuleCall_15_0_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_106=(Token)match(input,45,FOLLOW_31); 

                    				newLeafNode(otherlv_106, grammarAccess.getParallele4Access().getAmpersandKeyword_15_1());
                    			
                    // InternalDroneDSL.g:6044:4: ( (lv_b_107_0= ruleGDr ) )
                    // InternalDroneDSL.g:6045:5: (lv_b_107_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:6045:5: (lv_b_107_0= ruleGDr )
                    // InternalDroneDSL.g:6046:6: lv_b_107_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBGDrParserRuleCall_15_2_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_108=(Token)match(input,45,FOLLOW_33); 

                    				newLeafNode(otherlv_108, grammarAccess.getParallele4Access().getAmpersandKeyword_15_3());
                    			
                    // InternalDroneDSL.g:6067:4: ( (lv_c_109_0= ruleRGRD ) )
                    // InternalDroneDSL.g:6068:5: (lv_c_109_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:6068:5: (lv_c_109_0= ruleRGRD )
                    // InternalDroneDSL.g:6069:6: lv_c_109_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCRGRDParserRuleCall_15_4_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_110=(Token)match(input,45,FOLLOW_32); 

                    				newLeafNode(otherlv_110, grammarAccess.getParallele4Access().getAmpersandKeyword_15_5());
                    			
                    // InternalDroneDSL.g:6090:4: ( (lv_d_111_0= ruleAR ) )
                    // InternalDroneDSL.g:6091:5: (lv_d_111_0= ruleAR )
                    {
                    // InternalDroneDSL.g:6091:5: (lv_d_111_0= ruleAR )
                    // InternalDroneDSL.g:6092:6: lv_d_111_0= ruleAR
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
                    // InternalDroneDSL.g:6111:3: ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:6111:3: ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) )
                    // InternalDroneDSL.g:6112:4: ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:6112:4: ( (lv_a_112_0= ruleMD ) )
                    // InternalDroneDSL.g:6113:5: (lv_a_112_0= ruleMD )
                    {
                    // InternalDroneDSL.g:6113:5: (lv_a_112_0= ruleMD )
                    // InternalDroneDSL.g:6114:6: lv_a_112_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAMDParserRuleCall_16_0_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_113=(Token)match(input,45,FOLLOW_33); 

                    				newLeafNode(otherlv_113, grammarAccess.getParallele4Access().getAmpersandKeyword_16_1());
                    			
                    // InternalDroneDSL.g:6135:4: ( (lv_b_114_0= ruleRGRD ) )
                    // InternalDroneDSL.g:6136:5: (lv_b_114_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:6136:5: (lv_b_114_0= ruleRGRD )
                    // InternalDroneDSL.g:6137:6: lv_b_114_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBRGRDParserRuleCall_16_2_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_115=(Token)match(input,45,FOLLOW_31); 

                    				newLeafNode(otherlv_115, grammarAccess.getParallele4Access().getAmpersandKeyword_16_3());
                    			
                    // InternalDroneDSL.g:6158:4: ( (lv_c_116_0= ruleGDr ) )
                    // InternalDroneDSL.g:6159:5: (lv_c_116_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:6159:5: (lv_c_116_0= ruleGDr )
                    // InternalDroneDSL.g:6160:6: lv_c_116_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCGDrParserRuleCall_16_4_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_117=(Token)match(input,45,FOLLOW_32); 

                    				newLeafNode(otherlv_117, grammarAccess.getParallele4Access().getAmpersandKeyword_16_5());
                    			
                    // InternalDroneDSL.g:6181:4: ( (lv_d_118_0= ruleAR ) )
                    // InternalDroneDSL.g:6182:5: (lv_d_118_0= ruleAR )
                    {
                    // InternalDroneDSL.g:6182:5: (lv_d_118_0= ruleAR )
                    // InternalDroneDSL.g:6183:6: lv_d_118_0= ruleAR
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
                    // InternalDroneDSL.g:6202:3: ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:6202:3: ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:6203:4: ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:6203:4: ( (lv_a_119_0= ruleMD ) )
                    // InternalDroneDSL.g:6204:5: (lv_a_119_0= ruleMD )
                    {
                    // InternalDroneDSL.g:6204:5: (lv_a_119_0= ruleMD )
                    // InternalDroneDSL.g:6205:6: lv_a_119_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAMDParserRuleCall_17_0_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_120=(Token)match(input,45,FOLLOW_33); 

                    				newLeafNode(otherlv_120, grammarAccess.getParallele4Access().getAmpersandKeyword_17_1());
                    			
                    // InternalDroneDSL.g:6226:4: ( (lv_b_121_0= ruleRGRD ) )
                    // InternalDroneDSL.g:6227:5: (lv_b_121_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:6227:5: (lv_b_121_0= ruleRGRD )
                    // InternalDroneDSL.g:6228:6: lv_b_121_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBRGRDParserRuleCall_17_2_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_122=(Token)match(input,45,FOLLOW_32); 

                    				newLeafNode(otherlv_122, grammarAccess.getParallele4Access().getAmpersandKeyword_17_3());
                    			
                    // InternalDroneDSL.g:6249:4: ( (lv_c_123_0= ruleAR ) )
                    // InternalDroneDSL.g:6250:5: (lv_c_123_0= ruleAR )
                    {
                    // InternalDroneDSL.g:6250:5: (lv_c_123_0= ruleAR )
                    // InternalDroneDSL.g:6251:6: lv_c_123_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCARParserRuleCall_17_4_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_124=(Token)match(input,45,FOLLOW_31); 

                    				newLeafNode(otherlv_124, grammarAccess.getParallele4Access().getAmpersandKeyword_17_5());
                    			
                    // InternalDroneDSL.g:6272:4: ( (lv_d_125_0= ruleGDr ) )
                    // InternalDroneDSL.g:6273:5: (lv_d_125_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:6273:5: (lv_d_125_0= ruleGDr )
                    // InternalDroneDSL.g:6274:6: lv_d_125_0= ruleGDr
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
                    // InternalDroneDSL.g:6293:3: ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:6293:3: ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:6294:4: ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:6294:4: ( (lv_a_126_0= ruleRGRD ) )
                    // InternalDroneDSL.g:6295:5: (lv_a_126_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:6295:5: (lv_a_126_0= ruleRGRD )
                    // InternalDroneDSL.g:6296:6: lv_a_126_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getARGRDParserRuleCall_18_0_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_127=(Token)match(input,45,FOLLOW_32); 

                    				newLeafNode(otherlv_127, grammarAccess.getParallele4Access().getAmpersandKeyword_18_1());
                    			
                    // InternalDroneDSL.g:6317:4: ( (lv_b_128_0= ruleAR ) )
                    // InternalDroneDSL.g:6318:5: (lv_b_128_0= ruleAR )
                    {
                    // InternalDroneDSL.g:6318:5: (lv_b_128_0= ruleAR )
                    // InternalDroneDSL.g:6319:6: lv_b_128_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBARParserRuleCall_18_2_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_129=(Token)match(input,45,FOLLOW_34); 

                    				newLeafNode(otherlv_129, grammarAccess.getParallele4Access().getAmpersandKeyword_18_3());
                    			
                    // InternalDroneDSL.g:6340:4: ( (lv_c_130_0= ruleMD ) )
                    // InternalDroneDSL.g:6341:5: (lv_c_130_0= ruleMD )
                    {
                    // InternalDroneDSL.g:6341:5: (lv_c_130_0= ruleMD )
                    // InternalDroneDSL.g:6342:6: lv_c_130_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCMDParserRuleCall_18_4_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_131=(Token)match(input,45,FOLLOW_31); 

                    				newLeafNode(otherlv_131, grammarAccess.getParallele4Access().getAmpersandKeyword_18_5());
                    			
                    // InternalDroneDSL.g:6363:4: ( (lv_d_132_0= ruleGDr ) )
                    // InternalDroneDSL.g:6364:5: (lv_d_132_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:6364:5: (lv_d_132_0= ruleGDr )
                    // InternalDroneDSL.g:6365:6: lv_d_132_0= ruleGDr
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
                    // InternalDroneDSL.g:6384:3: ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:6384:3: ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) )
                    // InternalDroneDSL.g:6385:4: ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:6385:4: ( (lv_a_133_0= ruleRGRD ) )
                    // InternalDroneDSL.g:6386:5: (lv_a_133_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:6386:5: (lv_a_133_0= ruleRGRD )
                    // InternalDroneDSL.g:6387:6: lv_a_133_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getARGRDParserRuleCall_19_0_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_134=(Token)match(input,45,FOLLOW_32); 

                    				newLeafNode(otherlv_134, grammarAccess.getParallele4Access().getAmpersandKeyword_19_1());
                    			
                    // InternalDroneDSL.g:6408:4: ( (lv_b_135_0= ruleAR ) )
                    // InternalDroneDSL.g:6409:5: (lv_b_135_0= ruleAR )
                    {
                    // InternalDroneDSL.g:6409:5: (lv_b_135_0= ruleAR )
                    // InternalDroneDSL.g:6410:6: lv_b_135_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBARParserRuleCall_19_2_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_136=(Token)match(input,45,FOLLOW_31); 

                    				newLeafNode(otherlv_136, grammarAccess.getParallele4Access().getAmpersandKeyword_19_3());
                    			
                    // InternalDroneDSL.g:6431:4: ( (lv_c_137_0= ruleGDr ) )
                    // InternalDroneDSL.g:6432:5: (lv_c_137_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:6432:5: (lv_c_137_0= ruleGDr )
                    // InternalDroneDSL.g:6433:6: lv_c_137_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCGDrParserRuleCall_19_4_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_138=(Token)match(input,45,FOLLOW_34); 

                    				newLeafNode(otherlv_138, grammarAccess.getParallele4Access().getAmpersandKeyword_19_5());
                    			
                    // InternalDroneDSL.g:6454:4: ( (lv_d_139_0= ruleMD ) )
                    // InternalDroneDSL.g:6455:5: (lv_d_139_0= ruleMD )
                    {
                    // InternalDroneDSL.g:6455:5: (lv_d_139_0= ruleMD )
                    // InternalDroneDSL.g:6456:6: lv_d_139_0= ruleMD
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
                    // InternalDroneDSL.g:6475:3: ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:6475:3: ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:6476:4: ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:6476:4: ( (lv_a_140_0= ruleRGRD ) )
                    // InternalDroneDSL.g:6477:5: (lv_a_140_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:6477:5: (lv_a_140_0= ruleRGRD )
                    // InternalDroneDSL.g:6478:6: lv_a_140_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getARGRDParserRuleCall_20_0_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_141=(Token)match(input,45,FOLLOW_34); 

                    				newLeafNode(otherlv_141, grammarAccess.getParallele4Access().getAmpersandKeyword_20_1());
                    			
                    // InternalDroneDSL.g:6499:4: ( (lv_b_142_0= ruleMD ) )
                    // InternalDroneDSL.g:6500:5: (lv_b_142_0= ruleMD )
                    {
                    // InternalDroneDSL.g:6500:5: (lv_b_142_0= ruleMD )
                    // InternalDroneDSL.g:6501:6: lv_b_142_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBMDParserRuleCall_20_2_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_143=(Token)match(input,45,FOLLOW_32); 

                    				newLeafNode(otherlv_143, grammarAccess.getParallele4Access().getAmpersandKeyword_20_3());
                    			
                    // InternalDroneDSL.g:6522:4: ( (lv_c_144_0= ruleAR ) )
                    // InternalDroneDSL.g:6523:5: (lv_c_144_0= ruleAR )
                    {
                    // InternalDroneDSL.g:6523:5: (lv_c_144_0= ruleAR )
                    // InternalDroneDSL.g:6524:6: lv_c_144_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCARParserRuleCall_20_4_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_145=(Token)match(input,45,FOLLOW_31); 

                    				newLeafNode(otherlv_145, grammarAccess.getParallele4Access().getAmpersandKeyword_20_5());
                    			
                    // InternalDroneDSL.g:6545:4: ( (lv_d_146_0= ruleGDr ) )
                    // InternalDroneDSL.g:6546:5: (lv_d_146_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:6546:5: (lv_d_146_0= ruleGDr )
                    // InternalDroneDSL.g:6547:6: lv_d_146_0= ruleGDr
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
                    // InternalDroneDSL.g:6566:3: ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:6566:3: ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) )
                    // InternalDroneDSL.g:6567:4: ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:6567:4: ( (lv_a_147_0= ruleRGRD ) )
                    // InternalDroneDSL.g:6568:5: (lv_a_147_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:6568:5: (lv_a_147_0= ruleRGRD )
                    // InternalDroneDSL.g:6569:6: lv_a_147_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getARGRDParserRuleCall_21_0_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_148=(Token)match(input,45,FOLLOW_34); 

                    				newLeafNode(otherlv_148, grammarAccess.getParallele4Access().getAmpersandKeyword_21_1());
                    			
                    // InternalDroneDSL.g:6590:4: ( (lv_b_149_0= ruleMD ) )
                    // InternalDroneDSL.g:6591:5: (lv_b_149_0= ruleMD )
                    {
                    // InternalDroneDSL.g:6591:5: (lv_b_149_0= ruleMD )
                    // InternalDroneDSL.g:6592:6: lv_b_149_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBMDParserRuleCall_21_2_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_150=(Token)match(input,45,FOLLOW_31); 

                    				newLeafNode(otherlv_150, grammarAccess.getParallele4Access().getAmpersandKeyword_21_3());
                    			
                    // InternalDroneDSL.g:6613:4: ( (lv_c_151_0= ruleGDr ) )
                    // InternalDroneDSL.g:6614:5: (lv_c_151_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:6614:5: (lv_c_151_0= ruleGDr )
                    // InternalDroneDSL.g:6615:6: lv_c_151_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCGDrParserRuleCall_21_4_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_152=(Token)match(input,45,FOLLOW_32); 

                    				newLeafNode(otherlv_152, grammarAccess.getParallele4Access().getAmpersandKeyword_21_5());
                    			
                    // InternalDroneDSL.g:6636:4: ( (lv_d_153_0= ruleAR ) )
                    // InternalDroneDSL.g:6637:5: (lv_d_153_0= ruleAR )
                    {
                    // InternalDroneDSL.g:6637:5: (lv_d_153_0= ruleAR )
                    // InternalDroneDSL.g:6638:6: lv_d_153_0= ruleAR
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
                    // InternalDroneDSL.g:6657:3: ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:6657:3: ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) )
                    // InternalDroneDSL.g:6658:4: ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:6658:4: ( (lv_a_154_0= ruleRGRD ) )
                    // InternalDroneDSL.g:6659:5: (lv_a_154_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:6659:5: (lv_a_154_0= ruleRGRD )
                    // InternalDroneDSL.g:6660:6: lv_a_154_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getARGRDParserRuleCall_22_0_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_155=(Token)match(input,45,FOLLOW_31); 

                    				newLeafNode(otherlv_155, grammarAccess.getParallele4Access().getAmpersandKeyword_22_1());
                    			
                    // InternalDroneDSL.g:6681:4: ( (lv_b_156_0= ruleGDr ) )
                    // InternalDroneDSL.g:6682:5: (lv_b_156_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:6682:5: (lv_b_156_0= ruleGDr )
                    // InternalDroneDSL.g:6683:6: lv_b_156_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBGDrParserRuleCall_22_2_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_157=(Token)match(input,45,FOLLOW_34); 

                    				newLeafNode(otherlv_157, grammarAccess.getParallele4Access().getAmpersandKeyword_22_3());
                    			
                    // InternalDroneDSL.g:6704:4: ( (lv_c_158_0= ruleMD ) )
                    // InternalDroneDSL.g:6705:5: (lv_c_158_0= ruleMD )
                    {
                    // InternalDroneDSL.g:6705:5: (lv_c_158_0= ruleMD )
                    // InternalDroneDSL.g:6706:6: lv_c_158_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCMDParserRuleCall_22_4_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_159=(Token)match(input,45,FOLLOW_32); 

                    				newLeafNode(otherlv_159, grammarAccess.getParallele4Access().getAmpersandKeyword_22_5());
                    			
                    // InternalDroneDSL.g:6727:4: ( (lv_d_160_0= ruleAR ) )
                    // InternalDroneDSL.g:6728:5: (lv_d_160_0= ruleAR )
                    {
                    // InternalDroneDSL.g:6728:5: (lv_d_160_0= ruleAR )
                    // InternalDroneDSL.g:6729:6: lv_d_160_0= ruleAR
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
                    // InternalDroneDSL.g:6748:3: ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:6748:3: ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) )
                    // InternalDroneDSL.g:6749:4: ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:6749:4: ( (lv_a_161_0= ruleRGRD ) )
                    // InternalDroneDSL.g:6750:5: (lv_a_161_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:6750:5: (lv_a_161_0= ruleRGRD )
                    // InternalDroneDSL.g:6751:6: lv_a_161_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getARGRDParserRuleCall_23_0_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_162=(Token)match(input,45,FOLLOW_31); 

                    				newLeafNode(otherlv_162, grammarAccess.getParallele4Access().getAmpersandKeyword_23_1());
                    			
                    // InternalDroneDSL.g:6772:4: ( (lv_b_163_0= ruleGDr ) )
                    // InternalDroneDSL.g:6773:5: (lv_b_163_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:6773:5: (lv_b_163_0= ruleGDr )
                    // InternalDroneDSL.g:6774:6: lv_b_163_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBGDrParserRuleCall_23_2_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_164=(Token)match(input,45,FOLLOW_32); 

                    				newLeafNode(otherlv_164, grammarAccess.getParallele4Access().getAmpersandKeyword_23_3());
                    			
                    // InternalDroneDSL.g:6795:4: ( (lv_c_165_0= ruleAR ) )
                    // InternalDroneDSL.g:6796:5: (lv_c_165_0= ruleAR )
                    {
                    // InternalDroneDSL.g:6796:5: (lv_c_165_0= ruleAR )
                    // InternalDroneDSL.g:6797:6: lv_c_165_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCARParserRuleCall_23_4_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_166=(Token)match(input,45,FOLLOW_34); 

                    				newLeafNode(otherlv_166, grammarAccess.getParallele4Access().getAmpersandKeyword_23_5());
                    			
                    // InternalDroneDSL.g:6818:4: ( (lv_d_167_0= ruleMD ) )
                    // InternalDroneDSL.g:6819:5: (lv_d_167_0= ruleMD )
                    {
                    // InternalDroneDSL.g:6819:5: (lv_d_167_0= ruleMD )
                    // InternalDroneDSL.g:6820:6: lv_d_167_0= ruleMD
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


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String dfa_1s = "\76\uffff";
    static final String dfa_2s = "\1\4\1\uffff\10\4\3\uffff\20\35\10\4\20\36\10\4\1\uffff";
    static final String dfa_3s = "\1\46\1\uffff\10\5\3\uffff\20\35\10\6\20\36\10\55\1\uffff";
    static final String dfa_4s = "\1\uffff\1\1\10\uffff\1\2\1\4\1\5\60\uffff\1\3";
    static final String dfa_5s = "\76\uffff}>";
    static final String[] dfa_6s = {
            "\1\13\22\uffff\1\1\1\uffff\1\1\2\14\1\4\2\uffff\1\5\1\2\1\3\1\6\1\7\1\10\1\11\1\12",
            "",
            "\1\16\1\15",
            "\1\20\1\17",
            "\1\22\1\21",
            "\1\24\1\23",
            "\1\26\1\25",
            "\1\30\1\27",
            "\1\32\1\31",
            "\1\34\1\33",
            "",
            "",
            "",
            "\1\35",
            "\1\35",
            "\1\36",
            "\1\36",
            "\1\37",
            "\1\37",
            "\1\40",
            "\1\40",
            "\1\41",
            "\1\41",
            "\1\42",
            "\1\42",
            "\1\43",
            "\1\43",
            "\1\44",
            "\1\44",
            "\1\46\1\uffff\1\45",
            "\1\50\1\uffff\1\47",
            "\1\52\1\uffff\1\51",
            "\1\54\1\uffff\1\53",
            "\1\56\1\uffff\1\55",
            "\1\60\1\uffff\1\57",
            "\1\62\1\uffff\1\61",
            "\1\64\1\uffff\1\63",
            "\1\65",
            "\1\65",
            "\1\66",
            "\1\66",
            "\1\67",
            "\1\67",
            "\1\70",
            "\1\70",
            "\1\71",
            "\1\71",
            "\1\72",
            "\1\72",
            "\1\73",
            "\1\73",
            "\1\74",
            "\1\74",
            "\1\12\22\uffff\1\12\1\uffff\4\12\2\uffff\10\12\3\uffff\1\12\2\uffff\1\75",
            "\1\12\22\uffff\1\12\1\uffff\4\12\2\uffff\10\12\3\uffff\1\12\2\uffff\1\75",
            "\1\12\22\uffff\1\12\1\uffff\4\12\2\uffff\10\12\3\uffff\1\12\2\uffff\1\75",
            "\1\12\22\uffff\1\12\1\uffff\4\12\2\uffff\10\12\3\uffff\1\12\2\uffff\1\75",
            "\1\12\22\uffff\1\12\1\uffff\4\12\2\uffff\10\12\3\uffff\1\12\2\uffff\1\75",
            "\1\12\22\uffff\1\12\1\uffff\4\12\2\uffff\10\12\3\uffff\1\12\2\uffff\1\75",
            "\1\12\22\uffff\1\12\1\uffff\4\12\2\uffff\10\12\3\uffff\1\12\2\uffff\1\75",
            "\1\12\22\uffff\1\12\1\uffff\4\12\2\uffff\10\12\3\uffff\1\12\2\uffff\1\75",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1822:5: (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir )";
        }
    }
    static final String[] dfa_7s = {
            "\1\13\22\uffff\1\1\1\uffff\1\1\2\14\1\4\2\uffff\1\5\1\2\1\3\1\6\1\7\1\10\1\11\1\12",
            "",
            "\1\16\1\15",
            "\1\20\1\17",
            "\1\22\1\21",
            "\1\24\1\23",
            "\1\26\1\25",
            "\1\30\1\27",
            "\1\32\1\31",
            "\1\34\1\33",
            "",
            "",
            "",
            "\1\35",
            "\1\35",
            "\1\36",
            "\1\36",
            "\1\37",
            "\1\37",
            "\1\40",
            "\1\40",
            "\1\41",
            "\1\41",
            "\1\42",
            "\1\42",
            "\1\43",
            "\1\43",
            "\1\44",
            "\1\44",
            "\1\46\1\uffff\1\45",
            "\1\50\1\uffff\1\47",
            "\1\52\1\uffff\1\51",
            "\1\54\1\uffff\1\53",
            "\1\56\1\uffff\1\55",
            "\1\60\1\uffff\1\57",
            "\1\62\1\uffff\1\61",
            "\1\64\1\uffff\1\63",
            "\1\65",
            "\1\65",
            "\1\66",
            "\1\66",
            "\1\67",
            "\1\67",
            "\1\70",
            "\1\70",
            "\1\71",
            "\1\71",
            "\1\72",
            "\1\72",
            "\1\73",
            "\1\73",
            "\1\74",
            "\1\74",
            "\1\12\22\uffff\1\12\1\uffff\4\12\2\uffff\10\12\6\uffff\1\75",
            "\1\12\22\uffff\1\12\1\uffff\4\12\2\uffff\10\12\6\uffff\1\75",
            "\1\12\22\uffff\1\12\1\uffff\4\12\2\uffff\10\12\6\uffff\1\75",
            "\1\12\22\uffff\1\12\1\uffff\4\12\2\uffff\10\12\6\uffff\1\75",
            "\1\12\22\uffff\1\12\1\uffff\4\12\2\uffff\10\12\6\uffff\1\75",
            "\1\12\22\uffff\1\12\1\uffff\4\12\2\uffff\10\12\6\uffff\1\75",
            "\1\12\22\uffff\1\12\1\uffff\4\12\2\uffff\10\12\6\uffff\1\75",
            "\1\12\22\uffff\1\12\1\uffff\4\12\2\uffff\10\12\6\uffff\1\75",
            ""
    };
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

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
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "2118:5: (lv_mainbody_3_1= ruleVarDecl | lv_mainbody_3_2= ruleCommandeBasique | lv_mainbody_3_3= ruleParallele | lv_mainbody_3_4= ruleFonctionCall | lv_mainbody_3_5= ruleDecollerAtterrir )";
        }
    }
    static final String dfa_8s = "\u0244\uffff";
    static final String dfa_9s = "\u00cd\uffff\30\u00e5\u012d\uffff\60\u0243\2\uffff";
    static final String dfa_10s = "\1\34\10\4\20\35\10\4\20\36\10\55\1\40\3\34\30\4\60\35\30\4\60\36\30\4\1\uffff\2\40\1\42\2\34\1\40\2\34\1\40\1\42\2\34\60\4\140\35\60\4\140\36\60\4\2\uffff";
    static final String dfa_11s = "\1\45\10\5\20\35\10\6\20\36\10\55\2\45\1\43\1\45\30\5\60\35\30\6\60\36\30\55\1\uffff\1\43\3\45\1\41\1\45\1\41\2\43\2\45\1\43\60\5\140\35\60\6\140\36\60\55\2\uffff";
    static final String dfa_12s = "\u00e5\uffff\1\1\u015c\uffff\1\3\1\2";
    static final String dfa_13s = "\u0244\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\2\uffff\1\2\1\7\1\10\1\3\1\4\1\5\1\6",
            "\1\12\1\11",
            "\1\14\1\13",
            "\1\16\1\15",
            "\1\20\1\17",
            "\1\22\1\21",
            "\1\24\1\23",
            "\1\26\1\25",
            "\1\30\1\27",
            "\1\31",
            "\1\31",
            "\1\32",
            "\1\32",
            "\1\33",
            "\1\33",
            "\1\34",
            "\1\34",
            "\1\35",
            "\1\35",
            "\1\36",
            "\1\36",
            "\1\37",
            "\1\37",
            "\1\40",
            "\1\40",
            "\1\42\1\uffff\1\41",
            "\1\44\1\uffff\1\43",
            "\1\46\1\uffff\1\45",
            "\1\50\1\uffff\1\47",
            "\1\52\1\uffff\1\51",
            "\1\54\1\uffff\1\53",
            "\1\56\1\uffff\1\55",
            "\1\60\1\uffff\1\57",
            "\1\61",
            "\1\61",
            "\1\62",
            "\1\62",
            "\1\63",
            "\1\63",
            "\1\64",
            "\1\64",
            "\1\65",
            "\1\65",
            "\1\66",
            "\1\66",
            "\1\67",
            "\1\67",
            "\1\70",
            "\1\70",
            "\1\71",
            "\1\71",
            "\1\72",
            "\1\72",
            "\1\73",
            "\1\73",
            "\1\74",
            "\1\74",
            "\1\101\1\102\1\77\1\100\1\75\1\76",
            "\1\107\2\uffff\1\110\1\103\1\104\2\uffff\1\105\1\106",
            "\1\115\2\uffff\1\116\1\113\1\114\1\111\1\112",
            "\1\117\2\uffff\1\120\2\uffff\1\121\1\122\1\123\1\124",
            "\1\126\1\125",
            "\1\130\1\127",
            "\1\132\1\131",
            "\1\134\1\133",
            "\1\136\1\135",
            "\1\140\1\137",
            "\1\142\1\141",
            "\1\144\1\143",
            "\1\146\1\145",
            "\1\150\1\147",
            "\1\152\1\151",
            "\1\154\1\153",
            "\1\156\1\155",
            "\1\160\1\157",
            "\1\162\1\161",
            "\1\164\1\163",
            "\1\166\1\165",
            "\1\170\1\167",
            "\1\172\1\171",
            "\1\174\1\173",
            "\1\176\1\175",
            "\1\u0080\1\177",
            "\1\u0082\1\u0081",
            "\1\u0084\1\u0083",
            "\1\u0085",
            "\1\u0085",
            "\1\u0086",
            "\1\u0086",
            "\1\u0087",
            "\1\u0087",
            "\1\u0088",
            "\1\u0088",
            "\1\u0089",
            "\1\u0089",
            "\1\u008a",
            "\1\u008a",
            "\1\u008b",
            "\1\u008b",
            "\1\u008c",
            "\1\u008c",
            "\1\u008d",
            "\1\u008d",
            "\1\u008e",
            "\1\u008e",
            "\1\u008f",
            "\1\u008f",
            "\1\u0090",
            "\1\u0090",
            "\1\u0091",
            "\1\u0091",
            "\1\u0092",
            "\1\u0092",
            "\1\u0093",
            "\1\u0093",
            "\1\u0094",
            "\1\u0094",
            "\1\u0095",
            "\1\u0095",
            "\1\u0096",
            "\1\u0096",
            "\1\u0097",
            "\1\u0097",
            "\1\u0098",
            "\1\u0098",
            "\1\u0099",
            "\1\u0099",
            "\1\u009a",
            "\1\u009a",
            "\1\u009b",
            "\1\u009b",
            "\1\u009c",
            "\1\u009c",
            "\1\u009e\1\uffff\1\u009d",
            "\1\u00a0\1\uffff\1\u009f",
            "\1\u00a2\1\uffff\1\u00a1",
            "\1\u00a4\1\uffff\1\u00a3",
            "\1\u00a6\1\uffff\1\u00a5",
            "\1\u00a8\1\uffff\1\u00a7",
            "\1\u00aa\1\uffff\1\u00a9",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00b0\1\uffff\1\u00af",
            "\1\u00b2\1\uffff\1\u00b1",
            "\1\u00b4\1\uffff\1\u00b3",
            "\1\u00b6\1\uffff\1\u00b5",
            "\1\u00b8\1\uffff\1\u00b7",
            "\1\u00ba\1\uffff\1\u00b9",
            "\1\u00bc\1\uffff\1\u00bb",
            "\1\u00be\1\uffff\1\u00bd",
            "\1\u00c0\1\uffff\1\u00bf",
            "\1\u00c2\1\uffff\1\u00c1",
            "\1\u00c4\1\uffff\1\u00c3",
            "\1\u00c6\1\uffff\1\u00c5",
            "\1\u00c8\1\uffff\1\u00c7",
            "\1\u00ca\1\uffff\1\u00c9",
            "\1\u00cc\1\uffff\1\u00cb",
            "\1\u00cd",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00da",
            "\1\u00db",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00de",
            "\1\u00df",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e4",
            "\1\u00e5\22\uffff\1\u00e5\1\uffff\4\u00e5\2\uffff\10\u00e5\3\uffff\1\u00e5\2\uffff\1\u00e6",
            "\1\u00e5\22\uffff\1\u00e5\1\uffff\4\u00e5\2\uffff\10\u00e5\3\uffff\1\u00e5\2\uffff\1\u00e6",
            "\1\u00e5\22\uffff\1\u00e5\1\uffff\4\u00e5\2\uffff\10\u00e5\3\uffff\1\u00e5\2\uffff\1\u00e7",
            "\1\u00e5\22\uffff\1\u00e5\1\uffff\4\u00e5\2\uffff\10\u00e5\3\uffff\1\u00e5\2\uffff\1\u00e7",
            "\1\u00e5\22\uffff\1\u00e5\1\uffff\4\u00e5\2\uffff\10\u00e5\3\uffff\1\u00e5\2\uffff\1\u00e8",
            "\1\u00e5\22\uffff\1\u00e5\1\uffff\4\u00e5\2\uffff\10\u00e5\3\uffff\1\u00e5\2\uffff\1\u00e8",
            "\1\u00e5\22\uffff\1\u00e5\1\uffff\4\u00e5\2\uffff\10\u00e5\3\uffff\1\u00e5\2\uffff\1\u00e9",
            "\1\u00e5\22\uffff\1\u00e5\1\uffff\4\u00e5\2\uffff\10\u00e5\3\uffff\1\u00e5\2\uffff\1\u00e9",
            "\1\u00e5\22\uffff\1\u00e5\1\uffff\4\u00e5\2\uffff\10\u00e5\3\uffff\1\u00e5\2\uffff\1\u00ea",
            "\1\u00e5\22\uffff\1\u00e5\1\uffff\4\u00e5\2\uffff\10\u00e5\3\uffff\1\u00e5\2\uffff\1\u00ea",
            "\1\u00e5\22\uffff\1\u00e5\1\uffff\4\u00e5\2\uffff\10\u00e5\3\uffff\1\u00e5\2\uffff\1\u00eb",
            "\1\u00e5\22\uffff\1\u00e5\1\uffff\4\u00e5\2\uffff\10\u00e5\3\uffff\1\u00e5\2\uffff\1\u00eb",
            "\1\u00e5\22\uffff\1\u00e5\1\uffff\4\u00e5\2\uffff\10\u00e5\3\uffff\1\u00e5\2\uffff\1\u00ec",
            "\1\u00e5\22\uffff\1\u00e5\1\uffff\4\u00e5\2\uffff\10\u00e5\3\uffff\1\u00e5\2\uffff\1\u00ec",
            "\1\u00e5\22\uffff\1\u00e5\1\uffff\4\u00e5\2\uffff\10\u00e5\3\uffff\1\u00e5\2\uffff\1\u00ed",
            "\1\u00e5\22\uffff\1\u00e5\1\uffff\4\u00e5\2\uffff\10\u00e5\3\uffff\1\u00e5\2\uffff\1\u00ed",
            "\1\u00e5\22\uffff\1\u00e5\1\uffff\4\u00e5\2\uffff\10\u00e5\3\uffff\1\u00e5\2\uffff\1\u00ee",
            "\1\u00e5\22\uffff\1\u00e5\1\uffff\4\u00e5\2\uffff\10\u00e5\3\uffff\1\u00e5\2\uffff\1\u00ee",
            "\1\u00e5\22\uffff\1\u00e5\1\uffff\4\u00e5\2\uffff\10\u00e5\3\uffff\1\u00e5\2\uffff\1\u00ef",
            "\1\u00e5\22\uffff\1\u00e5\1\uffff\4\u00e5\2\uffff\10\u00e5\3\uffff\1\u00e5\2\uffff\1\u00ef",
            "\1\u00e5\22\uffff\1\u00e5\1\uffff\4\u00e5\2\uffff\10\u00e5\3\uffff\1\u00e5\2\uffff\1\u00f0",
            "\1\u00e5\22\uffff\1\u00e5\1\uffff\4\u00e5\2\uffff\10\u00e5\3\uffff\1\u00e5\2\uffff\1\u00f0",
            "\1\u00e5\22\uffff\1\u00e5\1\uffff\4\u00e5\2\uffff\10\u00e5\3\uffff\1\u00e5\2\uffff\1\u00f1",
            "\1\u00e5\22\uffff\1\u00e5\1\uffff\4\u00e5\2\uffff\10\u00e5\3\uffff\1\u00e5\2\uffff\1\u00f1",
            "",
            "\1\u00f4\1\u00f5\1\u00f2\1\u00f3",
            "\1\u00f6\1\u00f7\2\uffff\1\u00f8\1\u00f9",
            "\1\u00fa\1\u00fb\1\u00fc\1\u00fd",
            "\1\u00fe\2\uffff\1\u00ff\4\uffff\1\u0100\1\u0101",
            "\1\u0104\2\uffff\1\u0105\1\u0102\1\u0103",
            "\1\u0106\1\u0107\2\uffff\1\u0108\1\u0109",
            "\1\u010a\2\uffff\1\u010b\1\u010c\1\u010d",
            "\1\u010e\2\uffff\1\u010f\2\uffff\1\u0110\1\u0111",
            "\1\u0112\1\u0113\1\u0114\1\u0115",
            "\1\u0116\1\u0117\1\u0118\1\u0119",
            "\1\u011a\2\uffff\1\u011b\4\uffff\1\u011c\1\u011d",
            "\1\u011e\2\uffff\1\u011f\2\uffff\1\u0120\1\u0121",
            "\1\u0123\1\u0122",
            "\1\u0125\1\u0124",
            "\1\u0127\1\u0126",
            "\1\u0129\1\u0128",
            "\1\u012b\1\u012a",
            "\1\u012d\1\u012c",
            "\1\u012f\1\u012e",
            "\1\u0131\1\u0130",
            "\1\u0133\1\u0132",
            "\1\u0135\1\u0134",
            "\1\u0137\1\u0136",
            "\1\u0139\1\u0138",
            "\1\u013b\1\u013a",
            "\1\u013d\1\u013c",
            "\1\u013f\1\u013e",
            "\1\u0141\1\u0140",
            "\1\u0143\1\u0142",
            "\1\u0145\1\u0144",
            "\1\u0147\1\u0146",
            "\1\u0149\1\u0148",
            "\1\u014b\1\u014a",
            "\1\u014d\1\u014c",
            "\1\u014f\1\u014e",
            "\1\u0151\1\u0150",
            "\1\u0153\1\u0152",
            "\1\u0155\1\u0154",
            "\1\u0157\1\u0156",
            "\1\u0159\1\u0158",
            "\1\u015b\1\u015a",
            "\1\u015d\1\u015c",
            "\1\u015f\1\u015e",
            "\1\u0161\1\u0160",
            "\1\u0163\1\u0162",
            "\1\u0165\1\u0164",
            "\1\u0167\1\u0166",
            "\1\u0169\1\u0168",
            "\1\u016b\1\u016a",
            "\1\u016d\1\u016c",
            "\1\u016f\1\u016e",
            "\1\u0171\1\u0170",
            "\1\u0173\1\u0172",
            "\1\u0175\1\u0174",
            "\1\u0177\1\u0176",
            "\1\u0179\1\u0178",
            "\1\u017b\1\u017a",
            "\1\u017d\1\u017c",
            "\1\u017f\1\u017e",
            "\1\u0181\1\u0180",
            "\1\u0182",
            "\1\u0182",
            "\1\u0183",
            "\1\u0183",
            "\1\u0184",
            "\1\u0184",
            "\1\u0185",
            "\1\u0185",
            "\1\u0186",
            "\1\u0186",
            "\1\u0187",
            "\1\u0187",
            "\1\u0188",
            "\1\u0188",
            "\1\u0189",
            "\1\u0189",
            "\1\u018a",
            "\1\u018a",
            "\1\u018b",
            "\1\u018b",
            "\1\u018c",
            "\1\u018c",
            "\1\u018d",
            "\1\u018d",
            "\1\u018e",
            "\1\u018e",
            "\1\u018f",
            "\1\u018f",
            "\1\u0190",
            "\1\u0190",
            "\1\u0191",
            "\1\u0191",
            "\1\u0192",
            "\1\u0192",
            "\1\u0193",
            "\1\u0193",
            "\1\u0194",
            "\1\u0194",
            "\1\u0195",
            "\1\u0195",
            "\1\u0196",
            "\1\u0196",
            "\1\u0197",
            "\1\u0197",
            "\1\u0198",
            "\1\u0198",
            "\1\u0199",
            "\1\u0199",
            "\1\u019a",
            "\1\u019a",
            "\1\u019b",
            "\1\u019b",
            "\1\u019c",
            "\1\u019c",
            "\1\u019d",
            "\1\u019d",
            "\1\u019e",
            "\1\u019e",
            "\1\u019f",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a7",
            "\1\u01a8",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ab",
            "\1\u01ac",
            "\1\u01ac",
            "\1\u01ad",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b1",
            "\1\u01b3\1\uffff\1\u01b2",
            "\1\u01b5\1\uffff\1\u01b4",
            "\1\u01b7\1\uffff\1\u01b6",
            "\1\u01b9\1\uffff\1\u01b8",
            "\1\u01bb\1\uffff\1\u01ba",
            "\1\u01bd\1\uffff\1\u01bc",
            "\1\u01bf\1\uffff\1\u01be",
            "\1\u01c1\1\uffff\1\u01c0",
            "\1\u01c3\1\uffff\1\u01c2",
            "\1\u01c5\1\uffff\1\u01c4",
            "\1\u01c7\1\uffff\1\u01c6",
            "\1\u01c9\1\uffff\1\u01c8",
            "\1\u01cb\1\uffff\1\u01ca",
            "\1\u01cd\1\uffff\1\u01cc",
            "\1\u01cf\1\uffff\1\u01ce",
            "\1\u01d1\1\uffff\1\u01d0",
            "\1\u01d3\1\uffff\1\u01d2",
            "\1\u01d5\1\uffff\1\u01d4",
            "\1\u01d7\1\uffff\1\u01d6",
            "\1\u01d9\1\uffff\1\u01d8",
            "\1\u01db\1\uffff\1\u01da",
            "\1\u01dd\1\uffff\1\u01dc",
            "\1\u01df\1\uffff\1\u01de",
            "\1\u01e1\1\uffff\1\u01e0",
            "\1\u01e3\1\uffff\1\u01e2",
            "\1\u01e5\1\uffff\1\u01e4",
            "\1\u01e7\1\uffff\1\u01e6",
            "\1\u01e9\1\uffff\1\u01e8",
            "\1\u01eb\1\uffff\1\u01ea",
            "\1\u01ed\1\uffff\1\u01ec",
            "\1\u01ef\1\uffff\1\u01ee",
            "\1\u01f1\1\uffff\1\u01f0",
            "\1\u01f3\1\uffff\1\u01f2",
            "\1\u01f5\1\uffff\1\u01f4",
            "\1\u01f7\1\uffff\1\u01f6",
            "\1\u01f9\1\uffff\1\u01f8",
            "\1\u01fb\1\uffff\1\u01fa",
            "\1\u01fd\1\uffff\1\u01fc",
            "\1\u01ff\1\uffff\1\u01fe",
            "\1\u0201\1\uffff\1\u0200",
            "\1\u0203\1\uffff\1\u0202",
            "\1\u0205\1\uffff\1\u0204",
            "\1\u0207\1\uffff\1\u0206",
            "\1\u0209\1\uffff\1\u0208",
            "\1\u020b\1\uffff\1\u020a",
            "\1\u020d\1\uffff\1\u020c",
            "\1\u020f\1\uffff\1\u020e",
            "\1\u0211\1\uffff\1\u0210",
            "\1\u0212",
            "\1\u0212",
            "\1\u0213",
            "\1\u0213",
            "\1\u0214",
            "\1\u0214",
            "\1\u0215",
            "\1\u0215",
            "\1\u0216",
            "\1\u0216",
            "\1\u0217",
            "\1\u0217",
            "\1\u0218",
            "\1\u0218",
            "\1\u0219",
            "\1\u0219",
            "\1\u021a",
            "\1\u021a",
            "\1\u021b",
            "\1\u021b",
            "\1\u021c",
            "\1\u021c",
            "\1\u021d",
            "\1\u021d",
            "\1\u021e",
            "\1\u021e",
            "\1\u021f",
            "\1\u021f",
            "\1\u0220",
            "\1\u0220",
            "\1\u0221",
            "\1\u0221",
            "\1\u0222",
            "\1\u0222",
            "\1\u0223",
            "\1\u0223",
            "\1\u0224",
            "\1\u0224",
            "\1\u0225",
            "\1\u0225",
            "\1\u0226",
            "\1\u0226",
            "\1\u0227",
            "\1\u0227",
            "\1\u0228",
            "\1\u0228",
            "\1\u0229",
            "\1\u0229",
            "\1\u022a",
            "\1\u022a",
            "\1\u022b",
            "\1\u022b",
            "\1\u022c",
            "\1\u022c",
            "\1\u022d",
            "\1\u022d",
            "\1\u022e",
            "\1\u022e",
            "\1\u022f",
            "\1\u022f",
            "\1\u0230",
            "\1\u0230",
            "\1\u0231",
            "\1\u0231",
            "\1\u0232",
            "\1\u0232",
            "\1\u0233",
            "\1\u0233",
            "\1\u0234",
            "\1\u0234",
            "\1\u0235",
            "\1\u0235",
            "\1\u0236",
            "\1\u0236",
            "\1\u0237",
            "\1\u0237",
            "\1\u0238",
            "\1\u0238",
            "\1\u0239",
            "\1\u0239",
            "\1\u023a",
            "\1\u023a",
            "\1\u023b",
            "\1\u023b",
            "\1\u023c",
            "\1\u023c",
            "\1\u023d",
            "\1\u023d",
            "\1\u023e",
            "\1\u023e",
            "\1\u023f",
            "\1\u023f",
            "\1\u0240",
            "\1\u0240",
            "\1\u0241",
            "\1\u0241",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
            "\1\u0243\22\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\2\uffff\1\u0242",
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

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "2401:2: (this_Parallele2_0= ruleParallele2 | this_Parallele3_1= ruleParallele3 | this_Parallele4_2= ruleParallele4 )";
        }
    }
    static final String dfa_15s = "\111\uffff";
    static final String dfa_16s = "\1\34\10\4\20\35\10\4\20\36\10\55\1\40\3\34\14\uffff";
    static final String dfa_17s = "\1\45\10\5\20\35\10\6\20\36\10\55\2\45\1\43\1\45\14\uffff";
    static final String dfa_18s = "\75\uffff\1\2\1\1\1\3\1\4\1\6\1\5\1\10\1\7\1\11\1\12\1\14\1\13";
    static final String dfa_19s = "\111\uffff}>";
    static final String[] dfa_20s = {
            "\1\1\2\uffff\1\2\1\7\1\10\1\3\1\4\1\5\1\6",
            "\1\12\1\11",
            "\1\14\1\13",
            "\1\16\1\15",
            "\1\20\1\17",
            "\1\22\1\21",
            "\1\24\1\23",
            "\1\26\1\25",
            "\1\30\1\27",
            "\1\31",
            "\1\31",
            "\1\32",
            "\1\32",
            "\1\33",
            "\1\33",
            "\1\34",
            "\1\34",
            "\1\35",
            "\1\35",
            "\1\36",
            "\1\36",
            "\1\37",
            "\1\37",
            "\1\40",
            "\1\40",
            "\1\42\1\uffff\1\41",
            "\1\44\1\uffff\1\43",
            "\1\46\1\uffff\1\45",
            "\1\50\1\uffff\1\47",
            "\1\52\1\uffff\1\51",
            "\1\54\1\uffff\1\53",
            "\1\56\1\uffff\1\55",
            "\1\60\1\uffff\1\57",
            "\1\61",
            "\1\61",
            "\1\62",
            "\1\62",
            "\1\63",
            "\1\63",
            "\1\64",
            "\1\64",
            "\1\65",
            "\1\65",
            "\1\66",
            "\1\66",
            "\1\67",
            "\1\67",
            "\1\70",
            "\1\70",
            "\1\71",
            "\1\71",
            "\1\72",
            "\1\72",
            "\1\73",
            "\1\73",
            "\1\74",
            "\1\74",
            "\2\75\2\76\2\77",
            "\1\102\2\uffff\1\102\2\100\2\uffff\2\101",
            "\1\104\2\uffff\1\104\2\103\2\105",
            "\1\106\2\uffff\1\106\2\uffff\2\107\2\110",
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

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_15;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "2446:2: ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) )";
        }
    }
    static final String dfa_21s = "\u0109\uffff";
    static final String dfa_22s = "\1\34\10\4\20\35\10\4\20\36\10\55\2\34\1\40\1\34\30\4\60\35\30\4\60\36\30\55\2\34\1\42\1\34\1\40\1\34\2\40\1\42\1\40\2\34\30\uffff";
    static final String dfa_23s = "\1\45\10\5\20\35\10\6\20\36\10\55\3\45\1\43\30\5\60\35\30\6\60\36\30\55\1\45\1\43\1\45\1\41\2\45\1\43\2\45\2\43\1\41\30\uffff";
    static final String dfa_24s = "\u00f1\uffff\1\1\1\2\1\6\1\5\1\3\1\4\1\13\1\14\1\11\1\12\1\7\1\10\1\21\1\22\1\20\1\17\1\15\1\16\1\26\1\25\1\23\1\24\1\27\1\30";
    static final String dfa_25s = "\u0109\uffff}>";
    static final String[] dfa_26s = {
            "\1\5\2\uffff\1\6\1\1\1\2\1\3\1\4\1\7\1\10",
            "\1\12\1\11",
            "\1\14\1\13",
            "\1\16\1\15",
            "\1\20\1\17",
            "\1\22\1\21",
            "\1\24\1\23",
            "\1\26\1\25",
            "\1\30\1\27",
            "\1\31",
            "\1\31",
            "\1\32",
            "\1\32",
            "\1\33",
            "\1\33",
            "\1\34",
            "\1\34",
            "\1\35",
            "\1\35",
            "\1\36",
            "\1\36",
            "\1\37",
            "\1\37",
            "\1\40",
            "\1\40",
            "\1\42\1\uffff\1\41",
            "\1\44\1\uffff\1\43",
            "\1\46\1\uffff\1\45",
            "\1\50\1\uffff\1\47",
            "\1\52\1\uffff\1\51",
            "\1\54\1\uffff\1\53",
            "\1\56\1\uffff\1\55",
            "\1\60\1\uffff\1\57",
            "\1\61",
            "\1\61",
            "\1\62",
            "\1\62",
            "\1\63",
            "\1\63",
            "\1\64",
            "\1\64",
            "\1\65",
            "\1\65",
            "\1\66",
            "\1\66",
            "\1\67",
            "\1\67",
            "\1\70",
            "\1\70",
            "\1\71",
            "\1\71",
            "\1\72",
            "\1\72",
            "\1\73",
            "\1\73",
            "\1\74",
            "\1\74",
            "\1\101\2\uffff\1\102\2\uffff\1\75\1\76\1\77\1\100",
            "\1\105\2\uffff\1\106\1\107\1\110\2\uffff\1\103\1\104",
            "\1\115\1\116\1\113\1\114\1\111\1\112",
            "\1\117\2\uffff\1\120\1\121\1\122\1\123\1\124",
            "\1\126\1\125",
            "\1\130\1\127",
            "\1\132\1\131",
            "\1\134\1\133",
            "\1\136\1\135",
            "\1\140\1\137",
            "\1\142\1\141",
            "\1\144\1\143",
            "\1\146\1\145",
            "\1\150\1\147",
            "\1\152\1\151",
            "\1\154\1\153",
            "\1\156\1\155",
            "\1\160\1\157",
            "\1\162\1\161",
            "\1\164\1\163",
            "\1\166\1\165",
            "\1\170\1\167",
            "\1\172\1\171",
            "\1\174\1\173",
            "\1\176\1\175",
            "\1\u0080\1\177",
            "\1\u0082\1\u0081",
            "\1\u0084\1\u0083",
            "\1\u0085",
            "\1\u0085",
            "\1\u0086",
            "\1\u0086",
            "\1\u0087",
            "\1\u0087",
            "\1\u0088",
            "\1\u0088",
            "\1\u0089",
            "\1\u0089",
            "\1\u008a",
            "\1\u008a",
            "\1\u008b",
            "\1\u008b",
            "\1\u008c",
            "\1\u008c",
            "\1\u008d",
            "\1\u008d",
            "\1\u008e",
            "\1\u008e",
            "\1\u008f",
            "\1\u008f",
            "\1\u0090",
            "\1\u0090",
            "\1\u0091",
            "\1\u0091",
            "\1\u0092",
            "\1\u0092",
            "\1\u0093",
            "\1\u0093",
            "\1\u0094",
            "\1\u0094",
            "\1\u0095",
            "\1\u0095",
            "\1\u0096",
            "\1\u0096",
            "\1\u0097",
            "\1\u0097",
            "\1\u0098",
            "\1\u0098",
            "\1\u0099",
            "\1\u0099",
            "\1\u009a",
            "\1\u009a",
            "\1\u009b",
            "\1\u009b",
            "\1\u009c",
            "\1\u009c",
            "\1\u009e\1\uffff\1\u009d",
            "\1\u00a0\1\uffff\1\u009f",
            "\1\u00a2\1\uffff\1\u00a1",
            "\1\u00a4\1\uffff\1\u00a3",
            "\1\u00a6\1\uffff\1\u00a5",
            "\1\u00a8\1\uffff\1\u00a7",
            "\1\u00aa\1\uffff\1\u00a9",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00b0\1\uffff\1\u00af",
            "\1\u00b2\1\uffff\1\u00b1",
            "\1\u00b4\1\uffff\1\u00b3",
            "\1\u00b6\1\uffff\1\u00b5",
            "\1\u00b8\1\uffff\1\u00b7",
            "\1\u00ba\1\uffff\1\u00b9",
            "\1\u00bc\1\uffff\1\u00bb",
            "\1\u00be\1\uffff\1\u00bd",
            "\1\u00c0\1\uffff\1\u00bf",
            "\1\u00c2\1\uffff\1\u00c1",
            "\1\u00c4\1\uffff\1\u00c3",
            "\1\u00c6\1\uffff\1\u00c5",
            "\1\u00c8\1\uffff\1\u00c7",
            "\1\u00ca\1\uffff\1\u00c9",
            "\1\u00cc\1\uffff\1\u00cb",
            "\1\u00cd",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00da",
            "\1\u00db",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00de",
            "\1\u00df",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f0",
            "\1\u00f1\2\uffff\1\u00f1\4\uffff\2\u00f2",
            "\1\u00f4\2\uffff\1\u00f4\2\uffff\2\u00f3",
            "\2\u00f5\2\u00f6",
            "\1\u00f8\2\uffff\1\u00f8\2\u00f7",
            "\2\u00f9\2\uffff\2\u00fa",
            "\1\u00fb\2\uffff\1\u00fb\4\uffff\2\u00fc",
            "\2\u00fe\2\u00fd",
            "\2\u0100\2\uffff\2\u00ff",
            "\2\u0101\2\u0102",
            "\2\u0104\2\u0103",
            "\1\u0105\2\uffff\1\u0105\2\uffff\2\u0106",
            "\1\u0107\2\uffff\1\u0107\2\u0108",
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

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_21;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "3004:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) )";
        }
    }
    static final String dfa_27s = "\1\34\10\4\20\35\10\4\20\36\10\55\2\34\1\40\1\34\30\4\60\35\30\4\60\36\30\55\1\34\1\42\1\34\1\40\2\34\1\40\1\42\1\40\1\34\1\40\1\34\30\uffff";
    static final String dfa_28s = "\1\45\10\5\20\35\10\6\20\36\10\55\3\45\1\43\30\5\60\35\30\6\60\36\30\55\2\45\1\43\1\45\1\41\1\45\1\43\2\45\2\43\1\41\30\uffff";
    static final String dfa_29s = "\u00f1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\11\1\12\1\13\1\14\1\7\1\10\1\21\1\22\1\15\1\16\1\17\1\20\1\23\1\24\1\25\1\26\1\27\1\30";
    static final String[] dfa_30s = {
            "\1\5\2\uffff\1\6\1\1\1\2\1\3\1\4\1\7\1\10",
            "\1\12\1\11",
            "\1\14\1\13",
            "\1\16\1\15",
            "\1\20\1\17",
            "\1\22\1\21",
            "\1\24\1\23",
            "\1\26\1\25",
            "\1\30\1\27",
            "\1\31",
            "\1\31",
            "\1\32",
            "\1\32",
            "\1\33",
            "\1\33",
            "\1\34",
            "\1\34",
            "\1\35",
            "\1\35",
            "\1\36",
            "\1\36",
            "\1\37",
            "\1\37",
            "\1\40",
            "\1\40",
            "\1\42\1\uffff\1\41",
            "\1\44\1\uffff\1\43",
            "\1\46\1\uffff\1\45",
            "\1\50\1\uffff\1\47",
            "\1\52\1\uffff\1\51",
            "\1\54\1\uffff\1\53",
            "\1\56\1\uffff\1\55",
            "\1\60\1\uffff\1\57",
            "\1\61",
            "\1\61",
            "\1\62",
            "\1\62",
            "\1\63",
            "\1\63",
            "\1\64",
            "\1\64",
            "\1\65",
            "\1\65",
            "\1\66",
            "\1\66",
            "\1\67",
            "\1\67",
            "\1\70",
            "\1\70",
            "\1\71",
            "\1\71",
            "\1\72",
            "\1\72",
            "\1\73",
            "\1\73",
            "\1\74",
            "\1\74",
            "\1\77\2\uffff\1\100\2\uffff\1\75\1\76\1\101\1\102",
            "\1\103\2\uffff\1\104\1\107\1\110\2\uffff\1\105\1\106",
            "\1\113\1\114\1\115\1\116\1\111\1\112",
            "\1\121\2\uffff\1\122\1\117\1\120\1\123\1\124",
            "\1\126\1\125",
            "\1\130\1\127",
            "\1\132\1\131",
            "\1\134\1\133",
            "\1\136\1\135",
            "\1\140\1\137",
            "\1\142\1\141",
            "\1\144\1\143",
            "\1\146\1\145",
            "\1\150\1\147",
            "\1\152\1\151",
            "\1\154\1\153",
            "\1\156\1\155",
            "\1\160\1\157",
            "\1\162\1\161",
            "\1\164\1\163",
            "\1\166\1\165",
            "\1\170\1\167",
            "\1\172\1\171",
            "\1\174\1\173",
            "\1\176\1\175",
            "\1\u0080\1\177",
            "\1\u0082\1\u0081",
            "\1\u0084\1\u0083",
            "\1\u0085",
            "\1\u0085",
            "\1\u0086",
            "\1\u0086",
            "\1\u0087",
            "\1\u0087",
            "\1\u0088",
            "\1\u0088",
            "\1\u0089",
            "\1\u0089",
            "\1\u008a",
            "\1\u008a",
            "\1\u008b",
            "\1\u008b",
            "\1\u008c",
            "\1\u008c",
            "\1\u008d",
            "\1\u008d",
            "\1\u008e",
            "\1\u008e",
            "\1\u008f",
            "\1\u008f",
            "\1\u0090",
            "\1\u0090",
            "\1\u0091",
            "\1\u0091",
            "\1\u0092",
            "\1\u0092",
            "\1\u0093",
            "\1\u0093",
            "\1\u0094",
            "\1\u0094",
            "\1\u0095",
            "\1\u0095",
            "\1\u0096",
            "\1\u0096",
            "\1\u0097",
            "\1\u0097",
            "\1\u0098",
            "\1\u0098",
            "\1\u0099",
            "\1\u0099",
            "\1\u009a",
            "\1\u009a",
            "\1\u009b",
            "\1\u009b",
            "\1\u009c",
            "\1\u009c",
            "\1\u009e\1\uffff\1\u009d",
            "\1\u00a0\1\uffff\1\u009f",
            "\1\u00a2\1\uffff\1\u00a1",
            "\1\u00a4\1\uffff\1\u00a3",
            "\1\u00a6\1\uffff\1\u00a5",
            "\1\u00a8\1\uffff\1\u00a7",
            "\1\u00aa\1\uffff\1\u00a9",
            "\1\u00ac\1\uffff\1\u00ab",
            "\1\u00ae\1\uffff\1\u00ad",
            "\1\u00b0\1\uffff\1\u00af",
            "\1\u00b2\1\uffff\1\u00b1",
            "\1\u00b4\1\uffff\1\u00b3",
            "\1\u00b6\1\uffff\1\u00b5",
            "\1\u00b8\1\uffff\1\u00b7",
            "\1\u00ba\1\uffff\1\u00b9",
            "\1\u00bc\1\uffff\1\u00bb",
            "\1\u00be\1\uffff\1\u00bd",
            "\1\u00c0\1\uffff\1\u00bf",
            "\1\u00c2\1\uffff\1\u00c1",
            "\1\u00c4\1\uffff\1\u00c3",
            "\1\u00c6\1\uffff\1\u00c5",
            "\1\u00c8\1\uffff\1\u00c7",
            "\1\u00ca\1\uffff\1\u00c9",
            "\1\u00cc\1\uffff\1\u00cb",
            "\1\u00cd",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00da",
            "\1\u00db",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00de",
            "\1\u00df",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f0",
            "\1\u00f1\2\uffff\1\u00f1\4\uffff\2\u00f2",
            "\2\u00f3\2\u00f4",
            "\1\u00f5\2\uffff\1\u00f5\2\uffff\2\u00f6",
            "\2\u00f7\2\uffff\2\u00f8",
            "\1\u00fa\2\uffff\1\u00fa\2\u00f9",
            "\1\u00fb\2\uffff\1\u00fb\4\uffff\2\u00fc",
            "\2\u00fe\2\u00fd",
            "\2\u00ff\2\u0100",
            "\2\u0101\2\uffff\2\u0102",
            "\1\u0103\2\uffff\1\u0103\2\uffff\2\u0104",
            "\2\u0105\2\u0106",
            "\1\u0107\2\uffff\1\u0107\2\u0108",
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

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_21;
            this.eof = dfa_21;
            this.min = dfa_27;
            this.max = dfa_28;
            this.accept = dfa_29;
            this.special = dfa_25;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "4654:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) ) | ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) ) | ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) ) | ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) ) | ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) ) | ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) ) | ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) ) | ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) ) | ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) ) | ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) ) | ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) ) | ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) ) | ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) ) | ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) ) | ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) ) | ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) ) | ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) ) | ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) ) | ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) ) | ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) ) | ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) ) | ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) ) | ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) ) | ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000047F9E800010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000007F9E800010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000090000000L});

}
