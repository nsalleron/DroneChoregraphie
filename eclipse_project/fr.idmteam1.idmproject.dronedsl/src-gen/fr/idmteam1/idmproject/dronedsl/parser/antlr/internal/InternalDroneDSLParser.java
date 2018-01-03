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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INCLUDE", "RULE_SECONDE", "RULE_POURCENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'<'", "'>'", "'define'", "'vitesse_hauteur_max'", "'vitesse_deplacement_max'", "'vitesse_rotation_max'", "'hauteur_max'", "'eloignement_max'", "'Seconde'", "'='", "'Pourcent'", "'decoller()'", "'atterrir()'", "'monter('", "','", "')'", "'descendre('", "'avancer('", "'reculer('", "'gauche('", "'droite('", "'rotation_gauche('", "'rotation_droite('", "'pause('", "'func'", "'()'", "'{'", "'}'", "'main'", "'&'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int RULE_ID=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_POURCENT=6;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
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
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int RULE_INCLUDE=4;

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

                if ( (LA1_0==14) ) {
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
    // InternalDroneDSL.g:166:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' otherlv_1= '<' ( (lv_importURI_2_0= RULE_INCLUDE ) ) otherlv_3= '>' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_importURI_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDroneDSL.g:172:2: ( (otherlv_0= 'import' otherlv_1= '<' ( (lv_importURI_2_0= RULE_INCLUDE ) ) otherlv_3= '>' ) )
            // InternalDroneDSL.g:173:2: (otherlv_0= 'import' otherlv_1= '<' ( (lv_importURI_2_0= RULE_INCLUDE ) ) otherlv_3= '>' )
            {
            // InternalDroneDSL.g:173:2: (otherlv_0= 'import' otherlv_1= '<' ( (lv_importURI_2_0= RULE_INCLUDE ) ) otherlv_3= '>' )
            // InternalDroneDSL.g:174:3: otherlv_0= 'import' otherlv_1= '<' ( (lv_importURI_2_0= RULE_INCLUDE ) ) otherlv_3= '>'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getImportAccess().getLessThanSignKeyword_1());
            		
            // InternalDroneDSL.g:182:3: ( (lv_importURI_2_0= RULE_INCLUDE ) )
            // InternalDroneDSL.g:183:4: (lv_importURI_2_0= RULE_INCLUDE )
            {
            // InternalDroneDSL.g:183:4: (lv_importURI_2_0= RULE_INCLUDE )
            // InternalDroneDSL.g:184:5: lv_importURI_2_0= RULE_INCLUDE
            {
            lv_importURI_2_0=(Token)match(input,RULE_INCLUDE,FOLLOW_8); 

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

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getImportAccess().getGreaterThanSignKeyword_3());
            		

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
    // InternalDroneDSL.g:208:1: entryRulePourcent_vitesse_hauteur_max returns [EObject current=null] : iv_rulePourcent_vitesse_hauteur_max= rulePourcent_vitesse_hauteur_max EOF ;
    public final EObject entryRulePourcent_vitesse_hauteur_max() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePourcent_vitesse_hauteur_max = null;


        try {
            // InternalDroneDSL.g:208:69: (iv_rulePourcent_vitesse_hauteur_max= rulePourcent_vitesse_hauteur_max EOF )
            // InternalDroneDSL.g:209:2: iv_rulePourcent_vitesse_hauteur_max= rulePourcent_vitesse_hauteur_max EOF
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
    // InternalDroneDSL.g:215:1: rulePourcent_vitesse_hauteur_max returns [EObject current=null] : (otherlv_0= 'define' otherlv_1= 'vitesse_hauteur_max' ( (lv_vitesse_verticale_2_0= rulePourcentConst ) ) ) ;
    public final EObject rulePourcent_vitesse_hauteur_max() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_vitesse_verticale_2_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:221:2: ( (otherlv_0= 'define' otherlv_1= 'vitesse_hauteur_max' ( (lv_vitesse_verticale_2_0= rulePourcentConst ) ) ) )
            // InternalDroneDSL.g:222:2: (otherlv_0= 'define' otherlv_1= 'vitesse_hauteur_max' ( (lv_vitesse_verticale_2_0= rulePourcentConst ) ) )
            {
            // InternalDroneDSL.g:222:2: (otherlv_0= 'define' otherlv_1= 'vitesse_hauteur_max' ( (lv_vitesse_verticale_2_0= rulePourcentConst ) ) )
            // InternalDroneDSL.g:223:3: otherlv_0= 'define' otherlv_1= 'vitesse_hauteur_max' ( (lv_vitesse_verticale_2_0= rulePourcentConst ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPourcent_vitesse_hauteur_maxAccess().getDefineKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getPourcent_vitesse_hauteur_maxAccess().getVitesse_hauteur_maxKeyword_1());
            		
            // InternalDroneDSL.g:231:3: ( (lv_vitesse_verticale_2_0= rulePourcentConst ) )
            // InternalDroneDSL.g:232:4: (lv_vitesse_verticale_2_0= rulePourcentConst )
            {
            // InternalDroneDSL.g:232:4: (lv_vitesse_verticale_2_0= rulePourcentConst )
            // InternalDroneDSL.g:233:5: lv_vitesse_verticale_2_0= rulePourcentConst
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
    // InternalDroneDSL.g:254:1: entryRulePourcent_vitesse_deplacement_max returns [EObject current=null] : iv_rulePourcent_vitesse_deplacement_max= rulePourcent_vitesse_deplacement_max EOF ;
    public final EObject entryRulePourcent_vitesse_deplacement_max() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePourcent_vitesse_deplacement_max = null;


        try {
            // InternalDroneDSL.g:254:73: (iv_rulePourcent_vitesse_deplacement_max= rulePourcent_vitesse_deplacement_max EOF )
            // InternalDroneDSL.g:255:2: iv_rulePourcent_vitesse_deplacement_max= rulePourcent_vitesse_deplacement_max EOF
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
    // InternalDroneDSL.g:261:1: rulePourcent_vitesse_deplacement_max returns [EObject current=null] : (otherlv_0= 'define' otherlv_1= 'vitesse_deplacement_max' ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) ) ) ;
    public final EObject rulePourcent_vitesse_deplacement_max() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_vitesse_deplacement_2_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:267:2: ( (otherlv_0= 'define' otherlv_1= 'vitesse_deplacement_max' ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) ) ) )
            // InternalDroneDSL.g:268:2: (otherlv_0= 'define' otherlv_1= 'vitesse_deplacement_max' ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) ) )
            {
            // InternalDroneDSL.g:268:2: (otherlv_0= 'define' otherlv_1= 'vitesse_deplacement_max' ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) ) )
            // InternalDroneDSL.g:269:3: otherlv_0= 'define' otherlv_1= 'vitesse_deplacement_max' ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getPourcent_vitesse_deplacement_maxAccess().getDefineKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getPourcent_vitesse_deplacement_maxAccess().getVitesse_deplacement_maxKeyword_1());
            		
            // InternalDroneDSL.g:277:3: ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) )
            // InternalDroneDSL.g:278:4: (lv_vitesse_deplacement_2_0= rulePourcentConst )
            {
            // InternalDroneDSL.g:278:4: (lv_vitesse_deplacement_2_0= rulePourcentConst )
            // InternalDroneDSL.g:279:5: lv_vitesse_deplacement_2_0= rulePourcentConst
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
    // InternalDroneDSL.g:300:1: entryRulePourcent_vitesse_rotation_max returns [EObject current=null] : iv_rulePourcent_vitesse_rotation_max= rulePourcent_vitesse_rotation_max EOF ;
    public final EObject entryRulePourcent_vitesse_rotation_max() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePourcent_vitesse_rotation_max = null;


        try {
            // InternalDroneDSL.g:300:70: (iv_rulePourcent_vitesse_rotation_max= rulePourcent_vitesse_rotation_max EOF )
            // InternalDroneDSL.g:301:2: iv_rulePourcent_vitesse_rotation_max= rulePourcent_vitesse_rotation_max EOF
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
    // InternalDroneDSL.g:307:1: rulePourcent_vitesse_rotation_max returns [EObject current=null] : (otherlv_0= 'define' otherlv_1= 'vitesse_rotation_max' ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) ) ) ;
    public final EObject rulePourcent_vitesse_rotation_max() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_vitesse_deplacement_2_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:313:2: ( (otherlv_0= 'define' otherlv_1= 'vitesse_rotation_max' ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) ) ) )
            // InternalDroneDSL.g:314:2: (otherlv_0= 'define' otherlv_1= 'vitesse_rotation_max' ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) ) )
            {
            // InternalDroneDSL.g:314:2: (otherlv_0= 'define' otherlv_1= 'vitesse_rotation_max' ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) ) )
            // InternalDroneDSL.g:315:3: otherlv_0= 'define' otherlv_1= 'vitesse_rotation_max' ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getPourcent_vitesse_rotation_maxAccess().getDefineKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getPourcent_vitesse_rotation_maxAccess().getVitesse_rotation_maxKeyword_1());
            		
            // InternalDroneDSL.g:323:3: ( (lv_vitesse_deplacement_2_0= rulePourcentConst ) )
            // InternalDroneDSL.g:324:4: (lv_vitesse_deplacement_2_0= rulePourcentConst )
            {
            // InternalDroneDSL.g:324:4: (lv_vitesse_deplacement_2_0= rulePourcentConst )
            // InternalDroneDSL.g:325:5: lv_vitesse_deplacement_2_0= rulePourcentConst
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
    // InternalDroneDSL.g:346:1: entryRuleHauteur_max returns [EObject current=null] : iv_ruleHauteur_max= ruleHauteur_max EOF ;
    public final EObject entryRuleHauteur_max() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHauteur_max = null;


        try {
            // InternalDroneDSL.g:346:52: (iv_ruleHauteur_max= ruleHauteur_max EOF )
            // InternalDroneDSL.g:347:2: iv_ruleHauteur_max= ruleHauteur_max EOF
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
    // InternalDroneDSL.g:353:1: ruleHauteur_max returns [EObject current=null] : (otherlv_0= 'define' otherlv_1= 'hauteur_max' ( (lv_hauteur_max_2_0= ruleSecondeExp ) ) ) ;
    public final EObject ruleHauteur_max() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_hauteur_max_2_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:359:2: ( (otherlv_0= 'define' otherlv_1= 'hauteur_max' ( (lv_hauteur_max_2_0= ruleSecondeExp ) ) ) )
            // InternalDroneDSL.g:360:2: (otherlv_0= 'define' otherlv_1= 'hauteur_max' ( (lv_hauteur_max_2_0= ruleSecondeExp ) ) )
            {
            // InternalDroneDSL.g:360:2: (otherlv_0= 'define' otherlv_1= 'hauteur_max' ( (lv_hauteur_max_2_0= ruleSecondeExp ) ) )
            // InternalDroneDSL.g:361:3: otherlv_0= 'define' otherlv_1= 'hauteur_max' ( (lv_hauteur_max_2_0= ruleSecondeExp ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getHauteur_maxAccess().getDefineKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getHauteur_maxAccess().getHauteur_maxKeyword_1());
            		
            // InternalDroneDSL.g:369:3: ( (lv_hauteur_max_2_0= ruleSecondeExp ) )
            // InternalDroneDSL.g:370:4: (lv_hauteur_max_2_0= ruleSecondeExp )
            {
            // InternalDroneDSL.g:370:4: (lv_hauteur_max_2_0= ruleSecondeExp )
            // InternalDroneDSL.g:371:5: lv_hauteur_max_2_0= ruleSecondeExp
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
    // InternalDroneDSL.g:392:1: entryRuleEloignement_max returns [EObject current=null] : iv_ruleEloignement_max= ruleEloignement_max EOF ;
    public final EObject entryRuleEloignement_max() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEloignement_max = null;


        try {
            // InternalDroneDSL.g:392:56: (iv_ruleEloignement_max= ruleEloignement_max EOF )
            // InternalDroneDSL.g:393:2: iv_ruleEloignement_max= ruleEloignement_max EOF
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
    // InternalDroneDSL.g:399:1: ruleEloignement_max returns [EObject current=null] : (otherlv_0= 'define' otherlv_1= 'eloignement_max' ( (lv_hauteur_max_2_0= ruleSecondeExp ) ) ) ;
    public final EObject ruleEloignement_max() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_hauteur_max_2_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:405:2: ( (otherlv_0= 'define' otherlv_1= 'eloignement_max' ( (lv_hauteur_max_2_0= ruleSecondeExp ) ) ) )
            // InternalDroneDSL.g:406:2: (otherlv_0= 'define' otherlv_1= 'eloignement_max' ( (lv_hauteur_max_2_0= ruleSecondeExp ) ) )
            {
            // InternalDroneDSL.g:406:2: (otherlv_0= 'define' otherlv_1= 'eloignement_max' ( (lv_hauteur_max_2_0= ruleSecondeExp ) ) )
            // InternalDroneDSL.g:407:3: otherlv_0= 'define' otherlv_1= 'eloignement_max' ( (lv_hauteur_max_2_0= ruleSecondeExp ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getEloignement_maxAccess().getDefineKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getEloignement_maxAccess().getEloignement_maxKeyword_1());
            		
            // InternalDroneDSL.g:415:3: ( (lv_hauteur_max_2_0= ruleSecondeExp ) )
            // InternalDroneDSL.g:416:4: (lv_hauteur_max_2_0= ruleSecondeExp )
            {
            // InternalDroneDSL.g:416:4: (lv_hauteur_max_2_0= ruleSecondeExp )
            // InternalDroneDSL.g:417:5: lv_hauteur_max_2_0= ruleSecondeExp
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
    // InternalDroneDSL.g:438:1: entryRulePrologue returns [EObject current=null] : iv_rulePrologue= rulePrologue EOF ;
    public final EObject entryRulePrologue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrologue = null;


        try {
            // InternalDroneDSL.g:438:49: (iv_rulePrologue= rulePrologue EOF )
            // InternalDroneDSL.g:439:2: iv_rulePrologue= rulePrologue EOF
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
    // InternalDroneDSL.g:445:1: rulePrologue returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hauteur_4_0= ruleHauteur_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eloignement_5_0= ruleEloignement_max ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject rulePrologue() throws RecognitionException {
        EObject current = null;

        EObject lv_vitesse_verticale_1_0 = null;

        EObject lv_vitesse_deplacement_2_0 = null;

        EObject lv_vitesse_rotation_3_0 = null;

        EObject lv_hauteur_4_0 = null;

        EObject lv_eloignement_5_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:451:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hauteur_4_0= ruleHauteur_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eloignement_5_0= ruleEloignement_max ) ) ) ) ) )+ {...}?) ) ) )
            // InternalDroneDSL.g:452:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hauteur_4_0= ruleHauteur_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eloignement_5_0= ruleEloignement_max ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalDroneDSL.g:452:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hauteur_4_0= ruleHauteur_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eloignement_5_0= ruleEloignement_max ) ) ) ) ) )+ {...}?) ) )
            // InternalDroneDSL.g:453:3: ( ( ( ({...}? => ( ({...}? => ( (lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hauteur_4_0= ruleHauteur_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eloignement_5_0= ruleEloignement_max ) ) ) ) ) )+ {...}?) )
            {
            // InternalDroneDSL.g:453:3: ( ( ( ({...}? => ( ({...}? => ( (lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hauteur_4_0= ruleHauteur_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eloignement_5_0= ruleEloignement_max ) ) ) ) ) )+ {...}?) )
            // InternalDroneDSL.g:454:4: ( ( ({...}? => ( ({...}? => ( (lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hauteur_4_0= ruleHauteur_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eloignement_5_0= ruleEloignement_max ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getPrologueAccess().getUnorderedGroup());
            			
            // InternalDroneDSL.g:457:4: ( ( ({...}? => ( ({...}? => ( (lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hauteur_4_0= ruleHauteur_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eloignement_5_0= ruleEloignement_max ) ) ) ) ) )+ {...}?)
            // InternalDroneDSL.g:458:5: ( ({...}? => ( ({...}? => ( (lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hauteur_4_0= ruleHauteur_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eloignement_5_0= ruleEloignement_max ) ) ) ) ) )+ {...}?
            {
            // InternalDroneDSL.g:458:5: ( ({...}? => ( ({...}? => ( (lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hauteur_4_0= ruleHauteur_max ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_eloignement_5_0= ruleEloignement_max ) ) ) ) ) )+
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
            	    // InternalDroneDSL.g:459:3: ({...}? => ( ({...}? => ( (lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max ) ) ) ) )
            	    {
            	    // InternalDroneDSL.g:459:3: ({...}? => ( ({...}? => ( (lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max ) ) ) ) )
            	    // InternalDroneDSL.g:460:4: {...}? => ( ({...}? => ( (lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPrologueAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePrologue", "getUnorderedGroupHelper().canSelect(grammarAccess.getPrologueAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalDroneDSL.g:460:102: ( ({...}? => ( (lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max ) ) ) )
            	    // InternalDroneDSL.g:461:5: ({...}? => ( (lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPrologueAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalDroneDSL.g:464:8: ({...}? => ( (lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max ) ) )
            	    // InternalDroneDSL.g:464:9: {...}? => ( (lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePrologue", "true");
            	    }
            	    // InternalDroneDSL.g:464:18: ( (lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max ) )
            	    // InternalDroneDSL.g:464:19: (lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max )
            	    {
            	    // InternalDroneDSL.g:464:19: (lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max )
            	    // InternalDroneDSL.g:465:9: lv_vitesse_verticale_1_0= rulePourcent_vitesse_hauteur_max
            	    {

            	    									newCompositeNode(grammarAccess.getPrologueAccess().getVitesse_verticalePourcent_vitesse_hauteur_maxParserRuleCall_0_0());
            	    								
            	    pushFollow(FOLLOW_16);
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
            	    // InternalDroneDSL.g:487:3: ({...}? => ( ({...}? => ( (lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max ) ) ) ) )
            	    {
            	    // InternalDroneDSL.g:487:3: ({...}? => ( ({...}? => ( (lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max ) ) ) ) )
            	    // InternalDroneDSL.g:488:4: {...}? => ( ({...}? => ( (lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPrologueAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePrologue", "getUnorderedGroupHelper().canSelect(grammarAccess.getPrologueAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalDroneDSL.g:488:102: ( ({...}? => ( (lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max ) ) ) )
            	    // InternalDroneDSL.g:489:5: ({...}? => ( (lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPrologueAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalDroneDSL.g:492:8: ({...}? => ( (lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max ) ) )
            	    // InternalDroneDSL.g:492:9: {...}? => ( (lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePrologue", "true");
            	    }
            	    // InternalDroneDSL.g:492:18: ( (lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max ) )
            	    // InternalDroneDSL.g:492:19: (lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max )
            	    {
            	    // InternalDroneDSL.g:492:19: (lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max )
            	    // InternalDroneDSL.g:493:9: lv_vitesse_deplacement_2_0= rulePourcent_vitesse_deplacement_max
            	    {

            	    									newCompositeNode(grammarAccess.getPrologueAccess().getVitesse_deplacementPourcent_vitesse_deplacement_maxParserRuleCall_1_0());
            	    								
            	    pushFollow(FOLLOW_16);
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
            	    // InternalDroneDSL.g:515:3: ({...}? => ( ({...}? => ( (lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max ) ) ) ) )
            	    {
            	    // InternalDroneDSL.g:515:3: ({...}? => ( ({...}? => ( (lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max ) ) ) ) )
            	    // InternalDroneDSL.g:516:4: {...}? => ( ({...}? => ( (lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPrologueAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "rulePrologue", "getUnorderedGroupHelper().canSelect(grammarAccess.getPrologueAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalDroneDSL.g:516:102: ( ({...}? => ( (lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max ) ) ) )
            	    // InternalDroneDSL.g:517:5: ({...}? => ( (lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPrologueAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalDroneDSL.g:520:8: ({...}? => ( (lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max ) ) )
            	    // InternalDroneDSL.g:520:9: {...}? => ( (lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePrologue", "true");
            	    }
            	    // InternalDroneDSL.g:520:18: ( (lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max ) )
            	    // InternalDroneDSL.g:520:19: (lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max )
            	    {
            	    // InternalDroneDSL.g:520:19: (lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max )
            	    // InternalDroneDSL.g:521:9: lv_vitesse_rotation_3_0= rulePourcent_vitesse_rotation_max
            	    {

            	    									newCompositeNode(grammarAccess.getPrologueAccess().getVitesse_rotationPourcent_vitesse_rotation_maxParserRuleCall_2_0());
            	    								
            	    pushFollow(FOLLOW_16);
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
            	    // InternalDroneDSL.g:543:3: ({...}? => ( ({...}? => ( (lv_hauteur_4_0= ruleHauteur_max ) ) ) ) )
            	    {
            	    // InternalDroneDSL.g:543:3: ({...}? => ( ({...}? => ( (lv_hauteur_4_0= ruleHauteur_max ) ) ) ) )
            	    // InternalDroneDSL.g:544:4: {...}? => ( ({...}? => ( (lv_hauteur_4_0= ruleHauteur_max ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPrologueAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "rulePrologue", "getUnorderedGroupHelper().canSelect(grammarAccess.getPrologueAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalDroneDSL.g:544:102: ( ({...}? => ( (lv_hauteur_4_0= ruleHauteur_max ) ) ) )
            	    // InternalDroneDSL.g:545:5: ({...}? => ( (lv_hauteur_4_0= ruleHauteur_max ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPrologueAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalDroneDSL.g:548:8: ({...}? => ( (lv_hauteur_4_0= ruleHauteur_max ) ) )
            	    // InternalDroneDSL.g:548:9: {...}? => ( (lv_hauteur_4_0= ruleHauteur_max ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePrologue", "true");
            	    }
            	    // InternalDroneDSL.g:548:18: ( (lv_hauteur_4_0= ruleHauteur_max ) )
            	    // InternalDroneDSL.g:548:19: (lv_hauteur_4_0= ruleHauteur_max )
            	    {
            	    // InternalDroneDSL.g:548:19: (lv_hauteur_4_0= ruleHauteur_max )
            	    // InternalDroneDSL.g:549:9: lv_hauteur_4_0= ruleHauteur_max
            	    {

            	    									newCompositeNode(grammarAccess.getPrologueAccess().getHauteurHauteur_maxParserRuleCall_3_0());
            	    								
            	    pushFollow(FOLLOW_16);
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
            	    // InternalDroneDSL.g:571:3: ({...}? => ( ({...}? => ( (lv_eloignement_5_0= ruleEloignement_max ) ) ) ) )
            	    {
            	    // InternalDroneDSL.g:571:3: ({...}? => ( ({...}? => ( (lv_eloignement_5_0= ruleEloignement_max ) ) ) ) )
            	    // InternalDroneDSL.g:572:4: {...}? => ( ({...}? => ( (lv_eloignement_5_0= ruleEloignement_max ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPrologueAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "rulePrologue", "getUnorderedGroupHelper().canSelect(grammarAccess.getPrologueAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalDroneDSL.g:572:102: ( ({...}? => ( (lv_eloignement_5_0= ruleEloignement_max ) ) ) )
            	    // InternalDroneDSL.g:573:5: ({...}? => ( (lv_eloignement_5_0= ruleEloignement_max ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPrologueAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalDroneDSL.g:576:8: ({...}? => ( (lv_eloignement_5_0= ruleEloignement_max ) ) )
            	    // InternalDroneDSL.g:576:9: {...}? => ( (lv_eloignement_5_0= ruleEloignement_max ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePrologue", "true");
            	    }
            	    // InternalDroneDSL.g:576:18: ( (lv_eloignement_5_0= ruleEloignement_max ) )
            	    // InternalDroneDSL.g:576:19: (lv_eloignement_5_0= ruleEloignement_max )
            	    {
            	    // InternalDroneDSL.g:576:19: (lv_eloignement_5_0= ruleEloignement_max )
            	    // InternalDroneDSL.g:577:9: lv_eloignement_5_0= ruleEloignement_max
            	    {

            	    									newCompositeNode(grammarAccess.getPrologueAccess().getEloignementEloignement_maxParserRuleCall_4_0());
            	    								
            	    pushFollow(FOLLOW_16);
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
    // InternalDroneDSL.g:610:1: entryRuleSecondeConst returns [EObject current=null] : iv_ruleSecondeConst= ruleSecondeConst EOF ;
    public final EObject entryRuleSecondeConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecondeConst = null;


        try {
            // InternalDroneDSL.g:610:53: (iv_ruleSecondeConst= ruleSecondeConst EOF )
            // InternalDroneDSL.g:611:2: iv_ruleSecondeConst= ruleSecondeConst EOF
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
    // InternalDroneDSL.g:617:1: ruleSecondeConst returns [EObject current=null] : ( (lv_val_0_0= RULE_SECONDE ) ) ;
    public final EObject ruleSecondeConst() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalDroneDSL.g:623:2: ( ( (lv_val_0_0= RULE_SECONDE ) ) )
            // InternalDroneDSL.g:624:2: ( (lv_val_0_0= RULE_SECONDE ) )
            {
            // InternalDroneDSL.g:624:2: ( (lv_val_0_0= RULE_SECONDE ) )
            // InternalDroneDSL.g:625:3: (lv_val_0_0= RULE_SECONDE )
            {
            // InternalDroneDSL.g:625:3: (lv_val_0_0= RULE_SECONDE )
            // InternalDroneDSL.g:626:4: lv_val_0_0= RULE_SECONDE
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
    // InternalDroneDSL.g:645:1: entryRulePourcentConst returns [EObject current=null] : iv_rulePourcentConst= rulePourcentConst EOF ;
    public final EObject entryRulePourcentConst() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePourcentConst = null;


        try {
            // InternalDroneDSL.g:645:54: (iv_rulePourcentConst= rulePourcentConst EOF )
            // InternalDroneDSL.g:646:2: iv_rulePourcentConst= rulePourcentConst EOF
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
    // InternalDroneDSL.g:652:1: rulePourcentConst returns [EObject current=null] : ( (lv_val_0_0= RULE_POURCENT ) ) ;
    public final EObject rulePourcentConst() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalDroneDSL.g:658:2: ( ( (lv_val_0_0= RULE_POURCENT ) ) )
            // InternalDroneDSL.g:659:2: ( (lv_val_0_0= RULE_POURCENT ) )
            {
            // InternalDroneDSL.g:659:2: ( (lv_val_0_0= RULE_POURCENT ) )
            // InternalDroneDSL.g:660:3: (lv_val_0_0= RULE_POURCENT )
            {
            // InternalDroneDSL.g:660:3: (lv_val_0_0= RULE_POURCENT )
            // InternalDroneDSL.g:661:4: lv_val_0_0= RULE_POURCENT
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
    // InternalDroneDSL.g:680:1: entryRuleSecondeDecl returns [EObject current=null] : iv_ruleSecondeDecl= ruleSecondeDecl EOF ;
    public final EObject entryRuleSecondeDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecondeDecl = null;


        try {
            // InternalDroneDSL.g:680:52: (iv_ruleSecondeDecl= ruleSecondeDecl EOF )
            // InternalDroneDSL.g:681:2: iv_ruleSecondeDecl= ruleSecondeDecl EOF
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
    // InternalDroneDSL.g:687:1: ruleSecondeDecl returns [EObject current=null] : (otherlv_0= 'Seconde' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleSecondeConst ) ) ) ;
    public final EObject ruleSecondeDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_val_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:693:2: ( (otherlv_0= 'Seconde' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleSecondeConst ) ) ) )
            // InternalDroneDSL.g:694:2: (otherlv_0= 'Seconde' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleSecondeConst ) ) )
            {
            // InternalDroneDSL.g:694:2: (otherlv_0= 'Seconde' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleSecondeConst ) ) )
            // InternalDroneDSL.g:695:3: otherlv_0= 'Seconde' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleSecondeConst ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getSecondeDeclAccess().getSecondeKeyword_0());
            		
            // InternalDroneDSL.g:699:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDroneDSL.g:700:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDroneDSL.g:700:4: (lv_name_1_0= RULE_ID )
            // InternalDroneDSL.g:701:5: lv_name_1_0= RULE_ID
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
            		
            // InternalDroneDSL.g:721:3: ( (lv_val_3_0= ruleSecondeConst ) )
            // InternalDroneDSL.g:722:4: (lv_val_3_0= ruleSecondeConst )
            {
            // InternalDroneDSL.g:722:4: (lv_val_3_0= ruleSecondeConst )
            // InternalDroneDSL.g:723:5: lv_val_3_0= ruleSecondeConst
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
    // InternalDroneDSL.g:744:1: entryRulePourcentDecl returns [EObject current=null] : iv_rulePourcentDecl= rulePourcentDecl EOF ;
    public final EObject entryRulePourcentDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePourcentDecl = null;


        try {
            // InternalDroneDSL.g:744:53: (iv_rulePourcentDecl= rulePourcentDecl EOF )
            // InternalDroneDSL.g:745:2: iv_rulePourcentDecl= rulePourcentDecl EOF
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
    // InternalDroneDSL.g:751:1: rulePourcentDecl returns [EObject current=null] : (otherlv_0= 'Pourcent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= rulePourcentConst ) ) ) ;
    public final EObject rulePourcentDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_val_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:757:2: ( (otherlv_0= 'Pourcent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= rulePourcentConst ) ) ) )
            // InternalDroneDSL.g:758:2: (otherlv_0= 'Pourcent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= rulePourcentConst ) ) )
            {
            // InternalDroneDSL.g:758:2: (otherlv_0= 'Pourcent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= rulePourcentConst ) ) )
            // InternalDroneDSL.g:759:3: otherlv_0= 'Pourcent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= rulePourcentConst ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getPourcentDeclAccess().getPourcentKeyword_0());
            		
            // InternalDroneDSL.g:763:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDroneDSL.g:764:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDroneDSL.g:764:4: (lv_name_1_0= RULE_ID )
            // InternalDroneDSL.g:765:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getPourcentDeclAccess().getEqualsSignKeyword_2());
            		
            // InternalDroneDSL.g:785:3: ( (lv_val_3_0= rulePourcentConst ) )
            // InternalDroneDSL.g:786:4: (lv_val_3_0= rulePourcentConst )
            {
            // InternalDroneDSL.g:786:4: (lv_val_3_0= rulePourcentConst )
            // InternalDroneDSL.g:787:5: lv_val_3_0= rulePourcentConst
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
    // InternalDroneDSL.g:808:1: entryRuleVarDecl returns [EObject current=null] : iv_ruleVarDecl= ruleVarDecl EOF ;
    public final EObject entryRuleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDecl = null;


        try {
            // InternalDroneDSL.g:808:48: (iv_ruleVarDecl= ruleVarDecl EOF )
            // InternalDroneDSL.g:809:2: iv_ruleVarDecl= ruleVarDecl EOF
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
    // InternalDroneDSL.g:815:1: ruleVarDecl returns [EObject current=null] : (this_PourcentDecl_0= rulePourcentDecl | this_SecondeDecl_1= ruleSecondeDecl ) ;
    public final EObject ruleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject this_PourcentDecl_0 = null;

        EObject this_SecondeDecl_1 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:821:2: ( (this_PourcentDecl_0= rulePourcentDecl | this_SecondeDecl_1= ruleSecondeDecl ) )
            // InternalDroneDSL.g:822:2: (this_PourcentDecl_0= rulePourcentDecl | this_SecondeDecl_1= ruleSecondeDecl )
            {
            // InternalDroneDSL.g:822:2: (this_PourcentDecl_0= rulePourcentDecl | this_SecondeDecl_1= ruleSecondeDecl )
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
                    // InternalDroneDSL.g:823:3: this_PourcentDecl_0= rulePourcentDecl
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
                    // InternalDroneDSL.g:832:3: this_SecondeDecl_1= ruleSecondeDecl
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
    // InternalDroneDSL.g:844:1: entryRuleRefSecondeVar returns [EObject current=null] : iv_ruleRefSecondeVar= ruleRefSecondeVar EOF ;
    public final EObject entryRuleRefSecondeVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefSecondeVar = null;


        try {
            // InternalDroneDSL.g:844:54: (iv_ruleRefSecondeVar= ruleRefSecondeVar EOF )
            // InternalDroneDSL.g:845:2: iv_ruleRefSecondeVar= ruleRefSecondeVar EOF
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
    // InternalDroneDSL.g:851:1: ruleRefSecondeVar returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleRefSecondeVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDroneDSL.g:857:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalDroneDSL.g:858:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalDroneDSL.g:858:2: ( (otherlv_0= RULE_ID ) )
            // InternalDroneDSL.g:859:3: (otherlv_0= RULE_ID )
            {
            // InternalDroneDSL.g:859:3: (otherlv_0= RULE_ID )
            // InternalDroneDSL.g:860:4: otherlv_0= RULE_ID
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
    // InternalDroneDSL.g:874:1: entryRuleRefPourcentVar returns [EObject current=null] : iv_ruleRefPourcentVar= ruleRefPourcentVar EOF ;
    public final EObject entryRuleRefPourcentVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefPourcentVar = null;


        try {
            // InternalDroneDSL.g:874:55: (iv_ruleRefPourcentVar= ruleRefPourcentVar EOF )
            // InternalDroneDSL.g:875:2: iv_ruleRefPourcentVar= ruleRefPourcentVar EOF
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
    // InternalDroneDSL.g:881:1: ruleRefPourcentVar returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleRefPourcentVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDroneDSL.g:887:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalDroneDSL.g:888:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalDroneDSL.g:888:2: ( (otherlv_0= RULE_ID ) )
            // InternalDroneDSL.g:889:3: (otherlv_0= RULE_ID )
            {
            // InternalDroneDSL.g:889:3: (otherlv_0= RULE_ID )
            // InternalDroneDSL.g:890:4: otherlv_0= RULE_ID
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
    // InternalDroneDSL.g:904:1: entryRulePourcentExp returns [EObject current=null] : iv_rulePourcentExp= rulePourcentExp EOF ;
    public final EObject entryRulePourcentExp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePourcentExp = null;


        try {
            // InternalDroneDSL.g:904:52: (iv_rulePourcentExp= rulePourcentExp EOF )
            // InternalDroneDSL.g:905:2: iv_rulePourcentExp= rulePourcentExp EOF
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
    // InternalDroneDSL.g:911:1: rulePourcentExp returns [EObject current=null] : (this_PourcentConst_0= rulePourcentConst | this_RefPourcentVar_1= ruleRefPourcentVar ) ;
    public final EObject rulePourcentExp() throws RecognitionException {
        EObject current = null;

        EObject this_PourcentConst_0 = null;

        EObject this_RefPourcentVar_1 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:917:2: ( (this_PourcentConst_0= rulePourcentConst | this_RefPourcentVar_1= ruleRefPourcentVar ) )
            // InternalDroneDSL.g:918:2: (this_PourcentConst_0= rulePourcentConst | this_RefPourcentVar_1= ruleRefPourcentVar )
            {
            // InternalDroneDSL.g:918:2: (this_PourcentConst_0= rulePourcentConst | this_RefPourcentVar_1= ruleRefPourcentVar )
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
                    // InternalDroneDSL.g:919:3: this_PourcentConst_0= rulePourcentConst
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
                    // InternalDroneDSL.g:928:3: this_RefPourcentVar_1= ruleRefPourcentVar
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
    // InternalDroneDSL.g:940:1: entryRuleSecondeExp returns [EObject current=null] : iv_ruleSecondeExp= ruleSecondeExp EOF ;
    public final EObject entryRuleSecondeExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecondeExp = null;


        try {
            // InternalDroneDSL.g:940:51: (iv_ruleSecondeExp= ruleSecondeExp EOF )
            // InternalDroneDSL.g:941:2: iv_ruleSecondeExp= ruleSecondeExp EOF
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
    // InternalDroneDSL.g:947:1: ruleSecondeExp returns [EObject current=null] : (this_SecondeConst_0= ruleSecondeConst | this_RefSecondeVar_1= ruleRefSecondeVar ) ;
    public final EObject ruleSecondeExp() throws RecognitionException {
        EObject current = null;

        EObject this_SecondeConst_0 = null;

        EObject this_RefSecondeVar_1 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:953:2: ( (this_SecondeConst_0= ruleSecondeConst | this_RefSecondeVar_1= ruleRefSecondeVar ) )
            // InternalDroneDSL.g:954:2: (this_SecondeConst_0= ruleSecondeConst | this_RefSecondeVar_1= ruleRefSecondeVar )
            {
            // InternalDroneDSL.g:954:2: (this_SecondeConst_0= ruleSecondeConst | this_RefSecondeVar_1= ruleRefSecondeVar )
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
                    // InternalDroneDSL.g:955:3: this_SecondeConst_0= ruleSecondeConst
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
                    // InternalDroneDSL.g:964:3: this_RefSecondeVar_1= ruleRefSecondeVar
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
    // InternalDroneDSL.g:976:1: entryRuleDecoller returns [EObject current=null] : iv_ruleDecoller= ruleDecoller EOF ;
    public final EObject entryRuleDecoller() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecoller = null;


        try {
            // InternalDroneDSL.g:976:49: (iv_ruleDecoller= ruleDecoller EOF )
            // InternalDroneDSL.g:977:2: iv_ruleDecoller= ruleDecoller EOF
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
    // InternalDroneDSL.g:983:1: ruleDecoller returns [EObject current=null] : ( (lv_str_0_0= 'decoller()' ) ) ;
    public final EObject ruleDecoller() throws RecognitionException {
        EObject current = null;

        Token lv_str_0_0=null;


        	enterRule();

        try {
            // InternalDroneDSL.g:989:2: ( ( (lv_str_0_0= 'decoller()' ) ) )
            // InternalDroneDSL.g:990:2: ( (lv_str_0_0= 'decoller()' ) )
            {
            // InternalDroneDSL.g:990:2: ( (lv_str_0_0= 'decoller()' ) )
            // InternalDroneDSL.g:991:3: (lv_str_0_0= 'decoller()' )
            {
            // InternalDroneDSL.g:991:3: (lv_str_0_0= 'decoller()' )
            // InternalDroneDSL.g:992:4: lv_str_0_0= 'decoller()'
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
    // InternalDroneDSL.g:1007:1: entryRuleAtterrir returns [EObject current=null] : iv_ruleAtterrir= ruleAtterrir EOF ;
    public final EObject entryRuleAtterrir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtterrir = null;


        try {
            // InternalDroneDSL.g:1007:49: (iv_ruleAtterrir= ruleAtterrir EOF )
            // InternalDroneDSL.g:1008:2: iv_ruleAtterrir= ruleAtterrir EOF
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
    // InternalDroneDSL.g:1014:1: ruleAtterrir returns [EObject current=null] : ( (lv_str_0_0= 'atterrir()' ) ) ;
    public final EObject ruleAtterrir() throws RecognitionException {
        EObject current = null;

        Token lv_str_0_0=null;


        	enterRule();

        try {
            // InternalDroneDSL.g:1020:2: ( ( (lv_str_0_0= 'atterrir()' ) ) )
            // InternalDroneDSL.g:1021:2: ( (lv_str_0_0= 'atterrir()' ) )
            {
            // InternalDroneDSL.g:1021:2: ( (lv_str_0_0= 'atterrir()' ) )
            // InternalDroneDSL.g:1022:3: (lv_str_0_0= 'atterrir()' )
            {
            // InternalDroneDSL.g:1022:3: (lv_str_0_0= 'atterrir()' )
            // InternalDroneDSL.g:1023:4: lv_str_0_0= 'atterrir()'
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
    // InternalDroneDSL.g:1038:1: entryRuleMonter returns [EObject current=null] : iv_ruleMonter= ruleMonter EOF ;
    public final EObject entryRuleMonter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonter = null;


        try {
            // InternalDroneDSL.g:1038:47: (iv_ruleMonter= ruleMonter EOF )
            // InternalDroneDSL.g:1039:2: iv_ruleMonter= ruleMonter EOF
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
    // InternalDroneDSL.g:1045:1: ruleMonter returns [EObject current=null] : (otherlv_0= 'monter(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) ;
    public final EObject ruleMonter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duree_1_0 = null;

        EObject lv_vitesse_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1051:2: ( (otherlv_0= 'monter(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) )
            // InternalDroneDSL.g:1052:2: (otherlv_0= 'monter(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            {
            // InternalDroneDSL.g:1052:2: (otherlv_0= 'monter(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            // InternalDroneDSL.g:1053:3: otherlv_0= 'monter(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getMonterAccess().getMonterKeyword_0());
            		
            // InternalDroneDSL.g:1057:3: ( (lv_duree_1_0= ruleSecondeExp ) )
            // InternalDroneDSL.g:1058:4: (lv_duree_1_0= ruleSecondeExp )
            {
            // InternalDroneDSL.g:1058:4: (lv_duree_1_0= ruleSecondeExp )
            // InternalDroneDSL.g:1059:5: lv_duree_1_0= ruleSecondeExp
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
            		
            // InternalDroneDSL.g:1080:3: ( (lv_vitesse_3_0= rulePourcentExp ) )
            // InternalDroneDSL.g:1081:4: (lv_vitesse_3_0= rulePourcentExp )
            {
            // InternalDroneDSL.g:1081:4: (lv_vitesse_3_0= rulePourcentExp )
            // InternalDroneDSL.g:1082:5: lv_vitesse_3_0= rulePourcentExp
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
    // InternalDroneDSL.g:1107:1: entryRuleDescendre returns [EObject current=null] : iv_ruleDescendre= ruleDescendre EOF ;
    public final EObject entryRuleDescendre() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescendre = null;


        try {
            // InternalDroneDSL.g:1107:50: (iv_ruleDescendre= ruleDescendre EOF )
            // InternalDroneDSL.g:1108:2: iv_ruleDescendre= ruleDescendre EOF
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
    // InternalDroneDSL.g:1114:1: ruleDescendre returns [EObject current=null] : (otherlv_0= 'descendre(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) ;
    public final EObject ruleDescendre() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duree_1_0 = null;

        EObject lv_vitesse_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1120:2: ( (otherlv_0= 'descendre(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) )
            // InternalDroneDSL.g:1121:2: (otherlv_0= 'descendre(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            {
            // InternalDroneDSL.g:1121:2: (otherlv_0= 'descendre(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            // InternalDroneDSL.g:1122:3: otherlv_0= 'descendre(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getDescendreAccess().getDescendreKeyword_0());
            		
            // InternalDroneDSL.g:1126:3: ( (lv_duree_1_0= ruleSecondeExp ) )
            // InternalDroneDSL.g:1127:4: (lv_duree_1_0= ruleSecondeExp )
            {
            // InternalDroneDSL.g:1127:4: (lv_duree_1_0= ruleSecondeExp )
            // InternalDroneDSL.g:1128:5: lv_duree_1_0= ruleSecondeExp
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
            		
            // InternalDroneDSL.g:1149:3: ( (lv_vitesse_3_0= rulePourcentExp ) )
            // InternalDroneDSL.g:1150:4: (lv_vitesse_3_0= rulePourcentExp )
            {
            // InternalDroneDSL.g:1150:4: (lv_vitesse_3_0= rulePourcentExp )
            // InternalDroneDSL.g:1151:5: lv_vitesse_3_0= rulePourcentExp
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
    // InternalDroneDSL.g:1176:1: entryRuleAvancer returns [EObject current=null] : iv_ruleAvancer= ruleAvancer EOF ;
    public final EObject entryRuleAvancer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvancer = null;


        try {
            // InternalDroneDSL.g:1176:48: (iv_ruleAvancer= ruleAvancer EOF )
            // InternalDroneDSL.g:1177:2: iv_ruleAvancer= ruleAvancer EOF
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
    // InternalDroneDSL.g:1183:1: ruleAvancer returns [EObject current=null] : (otherlv_0= 'avancer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) ;
    public final EObject ruleAvancer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duree_1_0 = null;

        EObject lv_vitesse_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1189:2: ( (otherlv_0= 'avancer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) )
            // InternalDroneDSL.g:1190:2: (otherlv_0= 'avancer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            {
            // InternalDroneDSL.g:1190:2: (otherlv_0= 'avancer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            // InternalDroneDSL.g:1191:3: otherlv_0= 'avancer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getAvancerAccess().getAvancerKeyword_0());
            		
            // InternalDroneDSL.g:1195:3: ( (lv_duree_1_0= ruleSecondeExp ) )
            // InternalDroneDSL.g:1196:4: (lv_duree_1_0= ruleSecondeExp )
            {
            // InternalDroneDSL.g:1196:4: (lv_duree_1_0= ruleSecondeExp )
            // InternalDroneDSL.g:1197:5: lv_duree_1_0= ruleSecondeExp
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
            		
            // InternalDroneDSL.g:1218:3: ( (lv_vitesse_3_0= rulePourcentExp ) )
            // InternalDroneDSL.g:1219:4: (lv_vitesse_3_0= rulePourcentExp )
            {
            // InternalDroneDSL.g:1219:4: (lv_vitesse_3_0= rulePourcentExp )
            // InternalDroneDSL.g:1220:5: lv_vitesse_3_0= rulePourcentExp
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
    // InternalDroneDSL.g:1245:1: entryRuleReculer returns [EObject current=null] : iv_ruleReculer= ruleReculer EOF ;
    public final EObject entryRuleReculer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReculer = null;


        try {
            // InternalDroneDSL.g:1245:48: (iv_ruleReculer= ruleReculer EOF )
            // InternalDroneDSL.g:1246:2: iv_ruleReculer= ruleReculer EOF
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
    // InternalDroneDSL.g:1252:1: ruleReculer returns [EObject current=null] : (otherlv_0= 'reculer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) ;
    public final EObject ruleReculer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duree_1_0 = null;

        EObject lv_vitesse_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1258:2: ( (otherlv_0= 'reculer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) )
            // InternalDroneDSL.g:1259:2: (otherlv_0= 'reculer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            {
            // InternalDroneDSL.g:1259:2: (otherlv_0= 'reculer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            // InternalDroneDSL.g:1260:3: otherlv_0= 'reculer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getReculerAccess().getReculerKeyword_0());
            		
            // InternalDroneDSL.g:1264:3: ( (lv_duree_1_0= ruleSecondeExp ) )
            // InternalDroneDSL.g:1265:4: (lv_duree_1_0= ruleSecondeExp )
            {
            // InternalDroneDSL.g:1265:4: (lv_duree_1_0= ruleSecondeExp )
            // InternalDroneDSL.g:1266:5: lv_duree_1_0= ruleSecondeExp
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
            		
            // InternalDroneDSL.g:1287:3: ( (lv_vitesse_3_0= rulePourcentExp ) )
            // InternalDroneDSL.g:1288:4: (lv_vitesse_3_0= rulePourcentExp )
            {
            // InternalDroneDSL.g:1288:4: (lv_vitesse_3_0= rulePourcentExp )
            // InternalDroneDSL.g:1289:5: lv_vitesse_3_0= rulePourcentExp
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
    // InternalDroneDSL.g:1314:1: entryRuleGauche returns [EObject current=null] : iv_ruleGauche= ruleGauche EOF ;
    public final EObject entryRuleGauche() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGauche = null;


        try {
            // InternalDroneDSL.g:1314:47: (iv_ruleGauche= ruleGauche EOF )
            // InternalDroneDSL.g:1315:2: iv_ruleGauche= ruleGauche EOF
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
    // InternalDroneDSL.g:1321:1: ruleGauche returns [EObject current=null] : (otherlv_0= 'gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) ;
    public final EObject ruleGauche() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duree_1_0 = null;

        EObject lv_vitesse_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1327:2: ( (otherlv_0= 'gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) )
            // InternalDroneDSL.g:1328:2: (otherlv_0= 'gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            {
            // InternalDroneDSL.g:1328:2: (otherlv_0= 'gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            // InternalDroneDSL.g:1329:3: otherlv_0= 'gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getGaucheAccess().getGaucheKeyword_0());
            		
            // InternalDroneDSL.g:1333:3: ( (lv_duree_1_0= ruleSecondeExp ) )
            // InternalDroneDSL.g:1334:4: (lv_duree_1_0= ruleSecondeExp )
            {
            // InternalDroneDSL.g:1334:4: (lv_duree_1_0= ruleSecondeExp )
            // InternalDroneDSL.g:1335:5: lv_duree_1_0= ruleSecondeExp
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
            		
            // InternalDroneDSL.g:1356:3: ( (lv_vitesse_3_0= rulePourcentExp ) )
            // InternalDroneDSL.g:1357:4: (lv_vitesse_3_0= rulePourcentExp )
            {
            // InternalDroneDSL.g:1357:4: (lv_vitesse_3_0= rulePourcentExp )
            // InternalDroneDSL.g:1358:5: lv_vitesse_3_0= rulePourcentExp
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
    // InternalDroneDSL.g:1383:1: entryRuleDroite returns [EObject current=null] : iv_ruleDroite= ruleDroite EOF ;
    public final EObject entryRuleDroite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDroite = null;


        try {
            // InternalDroneDSL.g:1383:47: (iv_ruleDroite= ruleDroite EOF )
            // InternalDroneDSL.g:1384:2: iv_ruleDroite= ruleDroite EOF
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
    // InternalDroneDSL.g:1390:1: ruleDroite returns [EObject current=null] : (otherlv_0= 'droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) ;
    public final EObject ruleDroite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duree_1_0 = null;

        EObject lv_vitesse_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1396:2: ( (otherlv_0= 'droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) )
            // InternalDroneDSL.g:1397:2: (otherlv_0= 'droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            {
            // InternalDroneDSL.g:1397:2: (otherlv_0= 'droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            // InternalDroneDSL.g:1398:3: otherlv_0= 'droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getDroiteAccess().getDroiteKeyword_0());
            		
            // InternalDroneDSL.g:1402:3: ( (lv_duree_1_0= ruleSecondeExp ) )
            // InternalDroneDSL.g:1403:4: (lv_duree_1_0= ruleSecondeExp )
            {
            // InternalDroneDSL.g:1403:4: (lv_duree_1_0= ruleSecondeExp )
            // InternalDroneDSL.g:1404:5: lv_duree_1_0= ruleSecondeExp
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
            		
            // InternalDroneDSL.g:1425:3: ( (lv_vitesse_3_0= rulePourcentExp ) )
            // InternalDroneDSL.g:1426:4: (lv_vitesse_3_0= rulePourcentExp )
            {
            // InternalDroneDSL.g:1426:4: (lv_vitesse_3_0= rulePourcentExp )
            // InternalDroneDSL.g:1427:5: lv_vitesse_3_0= rulePourcentExp
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
    // InternalDroneDSL.g:1452:1: entryRuleRotationGauche returns [EObject current=null] : iv_ruleRotationGauche= ruleRotationGauche EOF ;
    public final EObject entryRuleRotationGauche() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotationGauche = null;


        try {
            // InternalDroneDSL.g:1452:55: (iv_ruleRotationGauche= ruleRotationGauche EOF )
            // InternalDroneDSL.g:1453:2: iv_ruleRotationGauche= ruleRotationGauche EOF
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
    // InternalDroneDSL.g:1459:1: ruleRotationGauche returns [EObject current=null] : (otherlv_0= 'rotation_gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) ;
    public final EObject ruleRotationGauche() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duree_1_0 = null;

        EObject lv_vitesse_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1465:2: ( (otherlv_0= 'rotation_gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) )
            // InternalDroneDSL.g:1466:2: (otherlv_0= 'rotation_gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            {
            // InternalDroneDSL.g:1466:2: (otherlv_0= 'rotation_gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            // InternalDroneDSL.g:1467:3: otherlv_0= 'rotation_gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getRotationGaucheAccess().getRotation_gaucheKeyword_0());
            		
            // InternalDroneDSL.g:1471:3: ( (lv_duree_1_0= ruleSecondeExp ) )
            // InternalDroneDSL.g:1472:4: (lv_duree_1_0= ruleSecondeExp )
            {
            // InternalDroneDSL.g:1472:4: (lv_duree_1_0= ruleSecondeExp )
            // InternalDroneDSL.g:1473:5: lv_duree_1_0= ruleSecondeExp
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
            		
            // InternalDroneDSL.g:1494:3: ( (lv_vitesse_3_0= rulePourcentExp ) )
            // InternalDroneDSL.g:1495:4: (lv_vitesse_3_0= rulePourcentExp )
            {
            // InternalDroneDSL.g:1495:4: (lv_vitesse_3_0= rulePourcentExp )
            // InternalDroneDSL.g:1496:5: lv_vitesse_3_0= rulePourcentExp
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
    // InternalDroneDSL.g:1521:1: entryRuleRotationDroite returns [EObject current=null] : iv_ruleRotationDroite= ruleRotationDroite EOF ;
    public final EObject entryRuleRotationDroite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotationDroite = null;


        try {
            // InternalDroneDSL.g:1521:55: (iv_ruleRotationDroite= ruleRotationDroite EOF )
            // InternalDroneDSL.g:1522:2: iv_ruleRotationDroite= ruleRotationDroite EOF
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
    // InternalDroneDSL.g:1528:1: ruleRotationDroite returns [EObject current=null] : (otherlv_0= 'rotation_droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) ;
    public final EObject ruleRotationDroite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duree_1_0 = null;

        EObject lv_vitesse_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1534:2: ( (otherlv_0= 'rotation_droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) )
            // InternalDroneDSL.g:1535:2: (otherlv_0= 'rotation_droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            {
            // InternalDroneDSL.g:1535:2: (otherlv_0= 'rotation_droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            // InternalDroneDSL.g:1536:3: otherlv_0= 'rotation_droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getRotationDroiteAccess().getRotation_droiteKeyword_0());
            		
            // InternalDroneDSL.g:1540:3: ( (lv_duree_1_0= ruleSecondeExp ) )
            // InternalDroneDSL.g:1541:4: (lv_duree_1_0= ruleSecondeExp )
            {
            // InternalDroneDSL.g:1541:4: (lv_duree_1_0= ruleSecondeExp )
            // InternalDroneDSL.g:1542:5: lv_duree_1_0= ruleSecondeExp
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
            		
            // InternalDroneDSL.g:1563:3: ( (lv_vitesse_3_0= rulePourcentExp ) )
            // InternalDroneDSL.g:1564:4: (lv_vitesse_3_0= rulePourcentExp )
            {
            // InternalDroneDSL.g:1564:4: (lv_vitesse_3_0= rulePourcentExp )
            // InternalDroneDSL.g:1565:5: lv_vitesse_3_0= rulePourcentExp
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
    // InternalDroneDSL.g:1590:1: entryRulePause returns [EObject current=null] : iv_rulePause= rulePause EOF ;
    public final EObject entryRulePause() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePause = null;


        try {
            // InternalDroneDSL.g:1590:46: (iv_rulePause= rulePause EOF )
            // InternalDroneDSL.g:1591:2: iv_rulePause= rulePause EOF
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
    // InternalDroneDSL.g:1597:1: rulePause returns [EObject current=null] : (otherlv_0= 'pause(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ')' ) ;
    public final EObject rulePause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_duree_1_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1603:2: ( (otherlv_0= 'pause(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ')' ) )
            // InternalDroneDSL.g:1604:2: (otherlv_0= 'pause(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ')' )
            {
            // InternalDroneDSL.g:1604:2: (otherlv_0= 'pause(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ')' )
            // InternalDroneDSL.g:1605:3: otherlv_0= 'pause(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getPauseAccess().getPauseKeyword_0());
            		
            // InternalDroneDSL.g:1609:3: ( (lv_duree_1_0= ruleSecondeExp ) )
            // InternalDroneDSL.g:1610:4: (lv_duree_1_0= ruleSecondeExp )
            {
            // InternalDroneDSL.g:1610:4: (lv_duree_1_0= ruleSecondeExp )
            // InternalDroneDSL.g:1611:5: lv_duree_1_0= ruleSecondeExp
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
    // InternalDroneDSL.g:1636:1: entryRuleDecollerAtterrir returns [EObject current=null] : iv_ruleDecollerAtterrir= ruleDecollerAtterrir EOF ;
    public final EObject entryRuleDecollerAtterrir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecollerAtterrir = null;


        try {
            // InternalDroneDSL.g:1636:57: (iv_ruleDecollerAtterrir= ruleDecollerAtterrir EOF )
            // InternalDroneDSL.g:1637:2: iv_ruleDecollerAtterrir= ruleDecollerAtterrir EOF
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
    // InternalDroneDSL.g:1643:1: ruleDecollerAtterrir returns [EObject current=null] : (this_Decoller_0= ruleDecoller | this_Atterrir_1= ruleAtterrir ) ;
    public final EObject ruleDecollerAtterrir() throws RecognitionException {
        EObject current = null;

        EObject this_Decoller_0 = null;

        EObject this_Atterrir_1 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1649:2: ( (this_Decoller_0= ruleDecoller | this_Atterrir_1= ruleAtterrir ) )
            // InternalDroneDSL.g:1650:2: (this_Decoller_0= ruleDecoller | this_Atterrir_1= ruleAtterrir )
            {
            // InternalDroneDSL.g:1650:2: (this_Decoller_0= ruleDecoller | this_Atterrir_1= ruleAtterrir )
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
                    // InternalDroneDSL.g:1651:3: this_Decoller_0= ruleDecoller
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
                    // InternalDroneDSL.g:1660:3: this_Atterrir_1= ruleAtterrir
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
    // InternalDroneDSL.g:1672:1: entryRuleCommandeBasique returns [EObject current=null] : iv_ruleCommandeBasique= ruleCommandeBasique EOF ;
    public final EObject entryRuleCommandeBasique() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandeBasique = null;


        try {
            // InternalDroneDSL.g:1672:56: (iv_ruleCommandeBasique= ruleCommandeBasique EOF )
            // InternalDroneDSL.g:1673:2: iv_ruleCommandeBasique= ruleCommandeBasique EOF
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
    // InternalDroneDSL.g:1679:1: ruleCommandeBasique returns [EObject current=null] : (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer | this_Monter_2= ruleMonter | this_Descendre_3= ruleDescendre | this_Gauche_4= ruleGauche | this_Droite_5= ruleDroite | this_RotationGauche_6= ruleRotationGauche | this_RotationDroite_7= ruleRotationDroite | this_Pause_8= rulePause ) ;
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
            // InternalDroneDSL.g:1685:2: ( (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer | this_Monter_2= ruleMonter | this_Descendre_3= ruleDescendre | this_Gauche_4= ruleGauche | this_Droite_5= ruleDroite | this_RotationGauche_6= ruleRotationGauche | this_RotationDroite_7= ruleRotationDroite | this_Pause_8= rulePause ) )
            // InternalDroneDSL.g:1686:2: (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer | this_Monter_2= ruleMonter | this_Descendre_3= ruleDescendre | this_Gauche_4= ruleGauche | this_Droite_5= ruleDroite | this_RotationGauche_6= ruleRotationGauche | this_RotationDroite_7= ruleRotationDroite | this_Pause_8= rulePause )
            {
            // InternalDroneDSL.g:1686:2: (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer | this_Monter_2= ruleMonter | this_Descendre_3= ruleDescendre | this_Gauche_4= ruleGauche | this_Droite_5= ruleDroite | this_RotationGauche_6= ruleRotationGauche | this_RotationDroite_7= ruleRotationDroite | this_Pause_8= rulePause )
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
                    // InternalDroneDSL.g:1687:3: this_Avancer_0= ruleAvancer
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
                    // InternalDroneDSL.g:1696:3: this_Reculer_1= ruleReculer
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
                    // InternalDroneDSL.g:1705:3: this_Monter_2= ruleMonter
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
                    // InternalDroneDSL.g:1714:3: this_Descendre_3= ruleDescendre
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
                    // InternalDroneDSL.g:1723:3: this_Gauche_4= ruleGauche
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
                    // InternalDroneDSL.g:1732:3: this_Droite_5= ruleDroite
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
                    // InternalDroneDSL.g:1741:3: this_RotationGauche_6= ruleRotationGauche
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
                    // InternalDroneDSL.g:1750:3: this_RotationDroite_7= ruleRotationDroite
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
                    // InternalDroneDSL.g:1759:3: this_Pause_8= rulePause
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
    // InternalDroneDSL.g:1771:1: entryRuleFonctionDecl returns [EObject current=null] : iv_ruleFonctionDecl= ruleFonctionDecl EOF ;
    public final EObject entryRuleFonctionDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFonctionDecl = null;


        try {
            // InternalDroneDSL.g:1771:53: (iv_ruleFonctionDecl= ruleFonctionDecl EOF )
            // InternalDroneDSL.g:1772:2: iv_ruleFonctionDecl= ruleFonctionDecl EOF
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
    // InternalDroneDSL.g:1778:1: ruleFonctionDecl returns [EObject current=null] : (otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= '{' ( ( (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir ) ) )* otherlv_5= '}' ) ;
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
            // InternalDroneDSL.g:1784:2: ( (otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= '{' ( ( (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir ) ) )* otherlv_5= '}' ) )
            // InternalDroneDSL.g:1785:2: (otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= '{' ( ( (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir ) ) )* otherlv_5= '}' )
            {
            // InternalDroneDSL.g:1785:2: (otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= '{' ( ( (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir ) ) )* otherlv_5= '}' )
            // InternalDroneDSL.g:1786:3: otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= '{' ( ( (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getFonctionDeclAccess().getFuncKeyword_0());
            		
            // InternalDroneDSL.g:1790:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDroneDSL.g:1791:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDroneDSL.g:1791:4: (lv_name_1_0= RULE_ID )
            // InternalDroneDSL.g:1792:5: lv_name_1_0= RULE_ID
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
            		
            // InternalDroneDSL.g:1816:3: ( ( (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==23||(LA10_0>=25 && LA10_0<=28)||(LA10_0>=31 && LA10_0<=38)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDroneDSL.g:1817:4: ( (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir ) )
            	    {
            	    // InternalDroneDSL.g:1817:4: ( (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir ) )
            	    // InternalDroneDSL.g:1818:5: (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir )
            	    {
            	    // InternalDroneDSL.g:1818:5: (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir )
            	    int alt9=5;
            	    alt9 = dfa9.predict(input);
            	    switch (alt9) {
            	        case 1 :
            	            // InternalDroneDSL.g:1819:6: lv_body_4_1= ruleVarDecl
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
            	            // InternalDroneDSL.g:1835:6: lv_body_4_2= ruleCommandeBasique
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
            	            // InternalDroneDSL.g:1851:6: lv_body_4_3= ruleParallele
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
            	            // InternalDroneDSL.g:1867:6: lv_body_4_4= ruleFonctionCall
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
            	            // InternalDroneDSL.g:1883:6: lv_body_4_5= ruleDecollerAtterrir
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
    // InternalDroneDSL.g:1909:1: entryRuleFinDeMain returns [EObject current=null] : iv_ruleFinDeMain= ruleFinDeMain EOF ;
    public final EObject entryRuleFinDeMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinDeMain = null;


        try {
            // InternalDroneDSL.g:1909:50: (iv_ruleFinDeMain= ruleFinDeMain EOF )
            // InternalDroneDSL.g:1910:2: iv_ruleFinDeMain= ruleFinDeMain EOF
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
    // InternalDroneDSL.g:1916:1: ruleFinDeMain returns [EObject current=null] : ( (lv_accolade_0_0= '}' ) ) ;
    public final EObject ruleFinDeMain() throws RecognitionException {
        EObject current = null;

        Token lv_accolade_0_0=null;


        	enterRule();

        try {
            // InternalDroneDSL.g:1922:2: ( ( (lv_accolade_0_0= '}' ) ) )
            // InternalDroneDSL.g:1923:2: ( (lv_accolade_0_0= '}' ) )
            {
            // InternalDroneDSL.g:1923:2: ( (lv_accolade_0_0= '}' ) )
            // InternalDroneDSL.g:1924:3: (lv_accolade_0_0= '}' )
            {
            // InternalDroneDSL.g:1924:3: (lv_accolade_0_0= '}' )
            // InternalDroneDSL.g:1925:4: lv_accolade_0_0= '}'
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
    // InternalDroneDSL.g:1940:1: entryRuleFonctionCall returns [EObject current=null] : iv_ruleFonctionCall= ruleFonctionCall EOF ;
    public final EObject entryRuleFonctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFonctionCall = null;


        try {
            // InternalDroneDSL.g:1940:53: (iv_ruleFonctionCall= ruleFonctionCall EOF )
            // InternalDroneDSL.g:1941:2: iv_ruleFonctionCall= ruleFonctionCall EOF
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
    // InternalDroneDSL.g:1947:1: ruleFonctionCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '()' ) ;
    public final EObject ruleFonctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDroneDSL.g:1953:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '()' ) )
            // InternalDroneDSL.g:1954:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '()' )
            {
            // InternalDroneDSL.g:1954:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '()' )
            // InternalDroneDSL.g:1955:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '()'
            {
            // InternalDroneDSL.g:1955:3: ( (otherlv_0= RULE_ID ) )
            // InternalDroneDSL.g:1956:4: (otherlv_0= RULE_ID )
            {
            // InternalDroneDSL.g:1956:4: (otherlv_0= RULE_ID )
            // InternalDroneDSL.g:1957:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFonctionCallRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_0, grammarAccess.getFonctionCallAccess().getRefFonctionDeclCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getFonctionCallAccess().getLeftParenthesisRightParenthesisKeyword_1());
            		

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


    // $ANTLR start "entryRuleMain"
    // InternalDroneDSL.g:1976:1: entryRuleMain returns [EObject current=null] : iv_ruleMain= ruleMain EOF ;
    public final EObject entryRuleMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMain = null;


        try {
            // InternalDroneDSL.g:1976:45: (iv_ruleMain= ruleMain EOF )
            // InternalDroneDSL.g:1977:2: iv_ruleMain= ruleMain EOF
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
    // InternalDroneDSL.g:1983:1: ruleMain returns [EObject current=null] : (otherlv_0= 'main' otherlv_1= '{' ( (lv_decollage_2_0= ruleDecoller ) ) ( ( (lv_mainbody_3_1= ruleVarDecl | lv_mainbody_3_2= ruleCommandeBasique | lv_mainbody_3_3= ruleParallele | lv_mainbody_3_4= ruleFonctionCall | lv_mainbody_3_5= ruleDecollerAtterrir ) ) )* ( (lv_atterrissage_4_0= ruleAtterrir ) ) ( (lv_fdm_5_0= ruleFinDeMain ) ) ) ;
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
            // InternalDroneDSL.g:1989:2: ( (otherlv_0= 'main' otherlv_1= '{' ( (lv_decollage_2_0= ruleDecoller ) ) ( ( (lv_mainbody_3_1= ruleVarDecl | lv_mainbody_3_2= ruleCommandeBasique | lv_mainbody_3_3= ruleParallele | lv_mainbody_3_4= ruleFonctionCall | lv_mainbody_3_5= ruleDecollerAtterrir ) ) )* ( (lv_atterrissage_4_0= ruleAtterrir ) ) ( (lv_fdm_5_0= ruleFinDeMain ) ) ) )
            // InternalDroneDSL.g:1990:2: (otherlv_0= 'main' otherlv_1= '{' ( (lv_decollage_2_0= ruleDecoller ) ) ( ( (lv_mainbody_3_1= ruleVarDecl | lv_mainbody_3_2= ruleCommandeBasique | lv_mainbody_3_3= ruleParallele | lv_mainbody_3_4= ruleFonctionCall | lv_mainbody_3_5= ruleDecollerAtterrir ) ) )* ( (lv_atterrissage_4_0= ruleAtterrir ) ) ( (lv_fdm_5_0= ruleFinDeMain ) ) )
            {
            // InternalDroneDSL.g:1990:2: (otherlv_0= 'main' otherlv_1= '{' ( (lv_decollage_2_0= ruleDecoller ) ) ( ( (lv_mainbody_3_1= ruleVarDecl | lv_mainbody_3_2= ruleCommandeBasique | lv_mainbody_3_3= ruleParallele | lv_mainbody_3_4= ruleFonctionCall | lv_mainbody_3_5= ruleDecollerAtterrir ) ) )* ( (lv_atterrissage_4_0= ruleAtterrir ) ) ( (lv_fdm_5_0= ruleFinDeMain ) ) )
            // InternalDroneDSL.g:1991:3: otherlv_0= 'main' otherlv_1= '{' ( (lv_decollage_2_0= ruleDecoller ) ) ( ( (lv_mainbody_3_1= ruleVarDecl | lv_mainbody_3_2= ruleCommandeBasique | lv_mainbody_3_3= ruleParallele | lv_mainbody_3_4= ruleFonctionCall | lv_mainbody_3_5= ruleDecollerAtterrir ) ) )* ( (lv_atterrissage_4_0= ruleAtterrir ) ) ( (lv_fdm_5_0= ruleFinDeMain ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getMainAccess().getMainKeyword_0());
            		
            otherlv_1=(Token)match(input,41,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getMainAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDroneDSL.g:1999:3: ( (lv_decollage_2_0= ruleDecoller ) )
            // InternalDroneDSL.g:2000:4: (lv_decollage_2_0= ruleDecoller )
            {
            // InternalDroneDSL.g:2000:4: (lv_decollage_2_0= ruleDecoller )
            // InternalDroneDSL.g:2001:5: lv_decollage_2_0= ruleDecoller
            {

            					newCompositeNode(grammarAccess.getMainAccess().getDecollageDecollerParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
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

            // InternalDroneDSL.g:2018:3: ( ( (lv_mainbody_3_1= ruleVarDecl | lv_mainbody_3_2= ruleCommandeBasique | lv_mainbody_3_3= ruleParallele | lv_mainbody_3_4= ruleFonctionCall | lv_mainbody_3_5= ruleDecollerAtterrir ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==RULE_ID||LA12_1==23||(LA12_1>=25 && LA12_1<=28)||(LA12_1>=31 && LA12_1<=38)) ) {
                        alt12=1;
                    }


                }
                else if ( (LA12_0==RULE_ID||LA12_0==23||(LA12_0>=25 && LA12_0<=26)||LA12_0==28||(LA12_0>=31 && LA12_0<=38)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDroneDSL.g:2019:4: ( (lv_mainbody_3_1= ruleVarDecl | lv_mainbody_3_2= ruleCommandeBasique | lv_mainbody_3_3= ruleParallele | lv_mainbody_3_4= ruleFonctionCall | lv_mainbody_3_5= ruleDecollerAtterrir ) )
            	    {
            	    // InternalDroneDSL.g:2019:4: ( (lv_mainbody_3_1= ruleVarDecl | lv_mainbody_3_2= ruleCommandeBasique | lv_mainbody_3_3= ruleParallele | lv_mainbody_3_4= ruleFonctionCall | lv_mainbody_3_5= ruleDecollerAtterrir ) )
            	    // InternalDroneDSL.g:2020:5: (lv_mainbody_3_1= ruleVarDecl | lv_mainbody_3_2= ruleCommandeBasique | lv_mainbody_3_3= ruleParallele | lv_mainbody_3_4= ruleFonctionCall | lv_mainbody_3_5= ruleDecollerAtterrir )
            	    {
            	    // InternalDroneDSL.g:2020:5: (lv_mainbody_3_1= ruleVarDecl | lv_mainbody_3_2= ruleCommandeBasique | lv_mainbody_3_3= ruleParallele | lv_mainbody_3_4= ruleFonctionCall | lv_mainbody_3_5= ruleDecollerAtterrir )
            	    int alt11=5;
            	    alt11 = dfa11.predict(input);
            	    switch (alt11) {
            	        case 1 :
            	            // InternalDroneDSL.g:2021:6: lv_mainbody_3_1= ruleVarDecl
            	            {

            	            						newCompositeNode(grammarAccess.getMainAccess().getMainbodyVarDeclParserRuleCall_3_0_0());
            	            					
            	            pushFollow(FOLLOW_27);
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
            	            // InternalDroneDSL.g:2037:6: lv_mainbody_3_2= ruleCommandeBasique
            	            {

            	            						newCompositeNode(grammarAccess.getMainAccess().getMainbodyCommandeBasiqueParserRuleCall_3_0_1());
            	            					
            	            pushFollow(FOLLOW_27);
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
            	            // InternalDroneDSL.g:2053:6: lv_mainbody_3_3= ruleParallele
            	            {

            	            						newCompositeNode(grammarAccess.getMainAccess().getMainbodyParalleleParserRuleCall_3_0_2());
            	            					
            	            pushFollow(FOLLOW_27);
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
            	            // InternalDroneDSL.g:2069:6: lv_mainbody_3_4= ruleFonctionCall
            	            {

            	            						newCompositeNode(grammarAccess.getMainAccess().getMainbodyFonctionCallParserRuleCall_3_0_3());
            	            					
            	            pushFollow(FOLLOW_27);
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
            	            // InternalDroneDSL.g:2085:6: lv_mainbody_3_5= ruleDecollerAtterrir
            	            {

            	            						newCompositeNode(grammarAccess.getMainAccess().getMainbodyDecollerAtterrirParserRuleCall_3_0_4());
            	            					
            	            pushFollow(FOLLOW_27);
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
            	    break loop12;
                }
            } while (true);

            // InternalDroneDSL.g:2103:3: ( (lv_atterrissage_4_0= ruleAtterrir ) )
            // InternalDroneDSL.g:2104:4: (lv_atterrissage_4_0= ruleAtterrir )
            {
            // InternalDroneDSL.g:2104:4: (lv_atterrissage_4_0= ruleAtterrir )
            // InternalDroneDSL.g:2105:5: lv_atterrissage_4_0= ruleAtterrir
            {

            					newCompositeNode(grammarAccess.getMainAccess().getAtterrissageAtterrirParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_28);
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

            // InternalDroneDSL.g:2122:3: ( (lv_fdm_5_0= ruleFinDeMain ) )
            // InternalDroneDSL.g:2123:4: (lv_fdm_5_0= ruleFinDeMain )
            {
            // InternalDroneDSL.g:2123:4: (lv_fdm_5_0= ruleFinDeMain )
            // InternalDroneDSL.g:2124:5: lv_fdm_5_0= ruleFinDeMain
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
    // InternalDroneDSL.g:2145:1: entryRuleMD returns [EObject current=null] : iv_ruleMD= ruleMD EOF ;
    public final EObject entryRuleMD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMD = null;


        try {
            // InternalDroneDSL.g:2145:43: (iv_ruleMD= ruleMD EOF )
            // InternalDroneDSL.g:2146:2: iv_ruleMD= ruleMD EOF
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
    // InternalDroneDSL.g:2152:1: ruleMD returns [EObject current=null] : (this_Monter_0= ruleMonter | this_Descendre_1= ruleDescendre ) ;
    public final EObject ruleMD() throws RecognitionException {
        EObject current = null;

        EObject this_Monter_0 = null;

        EObject this_Descendre_1 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:2158:2: ( (this_Monter_0= ruleMonter | this_Descendre_1= ruleDescendre ) )
            // InternalDroneDSL.g:2159:2: (this_Monter_0= ruleMonter | this_Descendre_1= ruleDescendre )
            {
            // InternalDroneDSL.g:2159:2: (this_Monter_0= ruleMonter | this_Descendre_1= ruleDescendre )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            else if ( (LA13_0==31) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalDroneDSL.g:2160:3: this_Monter_0= ruleMonter
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
                    // InternalDroneDSL.g:2169:3: this_Descendre_1= ruleDescendre
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
    // InternalDroneDSL.g:2181:1: entryRuleGDr returns [EObject current=null] : iv_ruleGDr= ruleGDr EOF ;
    public final EObject entryRuleGDr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGDr = null;


        try {
            // InternalDroneDSL.g:2181:44: (iv_ruleGDr= ruleGDr EOF )
            // InternalDroneDSL.g:2182:2: iv_ruleGDr= ruleGDr EOF
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
    // InternalDroneDSL.g:2188:1: ruleGDr returns [EObject current=null] : (this_Gauche_0= ruleGauche | this_Droite_1= ruleDroite ) ;
    public final EObject ruleGDr() throws RecognitionException {
        EObject current = null;

        EObject this_Gauche_0 = null;

        EObject this_Droite_1 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:2194:2: ( (this_Gauche_0= ruleGauche | this_Droite_1= ruleDroite ) )
            // InternalDroneDSL.g:2195:2: (this_Gauche_0= ruleGauche | this_Droite_1= ruleDroite )
            {
            // InternalDroneDSL.g:2195:2: (this_Gauche_0= ruleGauche | this_Droite_1= ruleDroite )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            else if ( (LA14_0==35) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalDroneDSL.g:2196:3: this_Gauche_0= ruleGauche
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
                    // InternalDroneDSL.g:2205:3: this_Droite_1= ruleDroite
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
    // InternalDroneDSL.g:2217:1: entryRuleRGRD returns [EObject current=null] : iv_ruleRGRD= ruleRGRD EOF ;
    public final EObject entryRuleRGRD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRGRD = null;


        try {
            // InternalDroneDSL.g:2217:45: (iv_ruleRGRD= ruleRGRD EOF )
            // InternalDroneDSL.g:2218:2: iv_ruleRGRD= ruleRGRD EOF
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
    // InternalDroneDSL.g:2224:1: ruleRGRD returns [EObject current=null] : (this_RotationGauche_0= ruleRotationGauche | this_RotationDroite_1= ruleRotationDroite ) ;
    public final EObject ruleRGRD() throws RecognitionException {
        EObject current = null;

        EObject this_RotationGauche_0 = null;

        EObject this_RotationDroite_1 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:2230:2: ( (this_RotationGauche_0= ruleRotationGauche | this_RotationDroite_1= ruleRotationDroite ) )
            // InternalDroneDSL.g:2231:2: (this_RotationGauche_0= ruleRotationGauche | this_RotationDroite_1= ruleRotationDroite )
            {
            // InternalDroneDSL.g:2231:2: (this_RotationGauche_0= ruleRotationGauche | this_RotationDroite_1= ruleRotationDroite )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==36) ) {
                alt15=1;
            }
            else if ( (LA15_0==37) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalDroneDSL.g:2232:3: this_RotationGauche_0= ruleRotationGauche
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
                    // InternalDroneDSL.g:2241:3: this_RotationDroite_1= ruleRotationDroite
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
    // InternalDroneDSL.g:2253:1: entryRuleAR returns [EObject current=null] : iv_ruleAR= ruleAR EOF ;
    public final EObject entryRuleAR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAR = null;


        try {
            // InternalDroneDSL.g:2253:43: (iv_ruleAR= ruleAR EOF )
            // InternalDroneDSL.g:2254:2: iv_ruleAR= ruleAR EOF
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
    // InternalDroneDSL.g:2260:1: ruleAR returns [EObject current=null] : (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer ) ;
    public final EObject ruleAR() throws RecognitionException {
        EObject current = null;

        EObject this_Avancer_0 = null;

        EObject this_Reculer_1 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:2266:2: ( (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer ) )
            // InternalDroneDSL.g:2267:2: (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer )
            {
            // InternalDroneDSL.g:2267:2: (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            else if ( (LA16_0==33) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalDroneDSL.g:2268:3: this_Avancer_0= ruleAvancer
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
                    // InternalDroneDSL.g:2277:3: this_Reculer_1= ruleReculer
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
    // InternalDroneDSL.g:2289:1: entryRuleParallele returns [EObject current=null] : iv_ruleParallele= ruleParallele EOF ;
    public final EObject entryRuleParallele() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallele = null;


        try {
            // InternalDroneDSL.g:2289:50: (iv_ruleParallele= ruleParallele EOF )
            // InternalDroneDSL.g:2290:2: iv_ruleParallele= ruleParallele EOF
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
    // InternalDroneDSL.g:2296:1: ruleParallele returns [EObject current=null] : (this_Parallele2_0= ruleParallele2 | this_Parallele3_1= ruleParallele3 | this_Parallele4_2= ruleParallele4 ) ;
    public final EObject ruleParallele() throws RecognitionException {
        EObject current = null;

        EObject this_Parallele2_0 = null;

        EObject this_Parallele3_1 = null;

        EObject this_Parallele4_2 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:2302:2: ( (this_Parallele2_0= ruleParallele2 | this_Parallele3_1= ruleParallele3 | this_Parallele4_2= ruleParallele4 ) )
            // InternalDroneDSL.g:2303:2: (this_Parallele2_0= ruleParallele2 | this_Parallele3_1= ruleParallele3 | this_Parallele4_2= ruleParallele4 )
            {
            // InternalDroneDSL.g:2303:2: (this_Parallele2_0= ruleParallele2 | this_Parallele3_1= ruleParallele3 | this_Parallele4_2= ruleParallele4 )
            int alt17=3;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalDroneDSL.g:2304:3: this_Parallele2_0= ruleParallele2
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
                    // InternalDroneDSL.g:2313:3: this_Parallele3_1= ruleParallele3
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
                    // InternalDroneDSL.g:2322:3: this_Parallele4_2= ruleParallele4
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
    // InternalDroneDSL.g:2334:1: entryRuleParallele2 returns [EObject current=null] : iv_ruleParallele2= ruleParallele2 EOF ;
    public final EObject entryRuleParallele2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallele2 = null;


        try {
            // InternalDroneDSL.g:2334:51: (iv_ruleParallele2= ruleParallele2 EOF )
            // InternalDroneDSL.g:2335:2: iv_ruleParallele2= ruleParallele2 EOF
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
    // InternalDroneDSL.g:2341:1: ruleParallele2 returns [EObject current=null] : ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) ) ;
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
            // InternalDroneDSL.g:2347:2: ( ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) ) )
            // InternalDroneDSL.g:2348:2: ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) )
            {
            // InternalDroneDSL.g:2348:2: ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) )
            int alt18=12;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalDroneDSL.g:2349:3: ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:2349:3: ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:2350:4: ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:2350:4: ( (lv_a_0_0= ruleMD ) )
                    // InternalDroneDSL.g:2351:5: (lv_a_0_0= ruleMD )
                    {
                    // InternalDroneDSL.g:2351:5: (lv_a_0_0= ruleMD )
                    // InternalDroneDSL.g:2352:6: lv_a_0_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getAMDParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_1=(Token)match(input,44,FOLLOW_30); 

                    				newLeafNode(otherlv_1, grammarAccess.getParallele2Access().getAmpersandKeyword_0_1());
                    			
                    // InternalDroneDSL.g:2373:4: ( (lv_t_2_0= ruleGDr ) )
                    // InternalDroneDSL.g:2374:5: (lv_t_2_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:2374:5: (lv_t_2_0= ruleGDr )
                    // InternalDroneDSL.g:2375:6: lv_t_2_0= ruleGDr
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
                    // InternalDroneDSL.g:2394:3: ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:2394:3: ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) )
                    // InternalDroneDSL.g:2395:4: ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:2395:4: ( (lv_a_3_0= ruleMD ) )
                    // InternalDroneDSL.g:2396:5: (lv_a_3_0= ruleMD )
                    {
                    // InternalDroneDSL.g:2396:5: (lv_a_3_0= ruleMD )
                    // InternalDroneDSL.g:2397:6: lv_a_3_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getAMDParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_4=(Token)match(input,44,FOLLOW_31); 

                    				newLeafNode(otherlv_4, grammarAccess.getParallele2Access().getAmpersandKeyword_1_1());
                    			
                    // InternalDroneDSL.g:2418:4: ( (lv_t_5_0= ruleAR ) )
                    // InternalDroneDSL.g:2419:5: (lv_t_5_0= ruleAR )
                    {
                    // InternalDroneDSL.g:2419:5: (lv_t_5_0= ruleAR )
                    // InternalDroneDSL.g:2420:6: lv_t_5_0= ruleAR
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
                    // InternalDroneDSL.g:2439:3: ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:2439:3: ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:2440:4: ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:2440:4: ( (lv_a_6_0= ruleMD ) )
                    // InternalDroneDSL.g:2441:5: (lv_a_6_0= ruleMD )
                    {
                    // InternalDroneDSL.g:2441:5: (lv_a_6_0= ruleMD )
                    // InternalDroneDSL.g:2442:6: lv_a_6_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getAMDParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_7=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_7, grammarAccess.getParallele2Access().getAmpersandKeyword_2_1());
                    			
                    // InternalDroneDSL.g:2463:4: ( (lv_t_8_0= ruleRGRD ) )
                    // InternalDroneDSL.g:2464:5: (lv_t_8_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:2464:5: (lv_t_8_0= ruleRGRD )
                    // InternalDroneDSL.g:2465:6: lv_t_8_0= ruleRGRD
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
                    // InternalDroneDSL.g:2484:3: ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:2484:3: ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) )
                    // InternalDroneDSL.g:2485:4: ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:2485:4: ( (lv_t_9_0= ruleGDr ) )
                    // InternalDroneDSL.g:2486:5: (lv_t_9_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:2486:5: (lv_t_9_0= ruleGDr )
                    // InternalDroneDSL.g:2487:6: lv_t_9_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTGDrParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_10=(Token)match(input,44,FOLLOW_31); 

                    				newLeafNode(otherlv_10, grammarAccess.getParallele2Access().getAmpersandKeyword_3_1());
                    			
                    // InternalDroneDSL.g:2508:4: ( (lv_b_11_0= ruleAR ) )
                    // InternalDroneDSL.g:2509:5: (lv_b_11_0= ruleAR )
                    {
                    // InternalDroneDSL.g:2509:5: (lv_b_11_0= ruleAR )
                    // InternalDroneDSL.g:2510:6: lv_b_11_0= ruleAR
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
                    // InternalDroneDSL.g:2529:3: ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:2529:3: ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) )
                    // InternalDroneDSL.g:2530:4: ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:2530:4: ( (lv_t_12_0= ruleGDr ) )
                    // InternalDroneDSL.g:2531:5: (lv_t_12_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:2531:5: (lv_t_12_0= ruleGDr )
                    // InternalDroneDSL.g:2532:6: lv_t_12_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTGDrParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_13=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_13, grammarAccess.getParallele2Access().getAmpersandKeyword_4_1());
                    			
                    // InternalDroneDSL.g:2553:4: ( (lv_b_14_0= ruleMD ) )
                    // InternalDroneDSL.g:2554:5: (lv_b_14_0= ruleMD )
                    {
                    // InternalDroneDSL.g:2554:5: (lv_b_14_0= ruleMD )
                    // InternalDroneDSL.g:2555:6: lv_b_14_0= ruleMD
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
                    // InternalDroneDSL.g:2574:3: ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:2574:3: ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:2575:4: ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:2575:4: ( (lv_t_15_0= ruleGDr ) )
                    // InternalDroneDSL.g:2576:5: (lv_t_15_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:2576:5: (lv_t_15_0= ruleGDr )
                    // InternalDroneDSL.g:2577:6: lv_t_15_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTGDrParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_16=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_16, grammarAccess.getParallele2Access().getAmpersandKeyword_5_1());
                    			
                    // InternalDroneDSL.g:2598:4: ( (lv_b_17_0= ruleRGRD ) )
                    // InternalDroneDSL.g:2599:5: (lv_b_17_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:2599:5: (lv_b_17_0= ruleRGRD )
                    // InternalDroneDSL.g:2600:6: lv_b_17_0= ruleRGRD
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
                    // InternalDroneDSL.g:2619:3: ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:2619:3: ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) )
                    // InternalDroneDSL.g:2620:4: ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:2620:4: ( (lv_t_18_0= ruleRGRD ) )
                    // InternalDroneDSL.g:2621:5: (lv_t_18_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:2621:5: (lv_t_18_0= ruleRGRD )
                    // InternalDroneDSL.g:2622:6: lv_t_18_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTRGRDParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_19=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_19, grammarAccess.getParallele2Access().getAmpersandKeyword_6_1());
                    			
                    // InternalDroneDSL.g:2643:4: ( (lv_a_20_0= ruleMD ) )
                    // InternalDroneDSL.g:2644:5: (lv_a_20_0= ruleMD )
                    {
                    // InternalDroneDSL.g:2644:5: (lv_a_20_0= ruleMD )
                    // InternalDroneDSL.g:2645:6: lv_a_20_0= ruleMD
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
                    // InternalDroneDSL.g:2664:3: ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:2664:3: ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) )
                    // InternalDroneDSL.g:2665:4: ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:2665:4: ( (lv_t_21_0= ruleRGRD ) )
                    // InternalDroneDSL.g:2666:5: (lv_t_21_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:2666:5: (lv_t_21_0= ruleRGRD )
                    // InternalDroneDSL.g:2667:6: lv_t_21_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTRGRDParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_22=(Token)match(input,44,FOLLOW_31); 

                    				newLeafNode(otherlv_22, grammarAccess.getParallele2Access().getAmpersandKeyword_7_1());
                    			
                    // InternalDroneDSL.g:2688:4: ( (lv_a_23_0= ruleAR ) )
                    // InternalDroneDSL.g:2689:5: (lv_a_23_0= ruleAR )
                    {
                    // InternalDroneDSL.g:2689:5: (lv_a_23_0= ruleAR )
                    // InternalDroneDSL.g:2690:6: lv_a_23_0= ruleAR
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
                    // InternalDroneDSL.g:2709:3: ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:2709:3: ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:2710:4: ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:2710:4: ( (lv_t_24_0= ruleRGRD ) )
                    // InternalDroneDSL.g:2711:5: (lv_t_24_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:2711:5: (lv_t_24_0= ruleRGRD )
                    // InternalDroneDSL.g:2712:6: lv_t_24_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTRGRDParserRuleCall_8_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_25=(Token)match(input,44,FOLLOW_30); 

                    				newLeafNode(otherlv_25, grammarAccess.getParallele2Access().getAmpersandKeyword_8_1());
                    			
                    // InternalDroneDSL.g:2733:4: ( (lv_a_26_0= ruleGDr ) )
                    // InternalDroneDSL.g:2734:5: (lv_a_26_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:2734:5: (lv_a_26_0= ruleGDr )
                    // InternalDroneDSL.g:2735:6: lv_a_26_0= ruleGDr
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
                    // InternalDroneDSL.g:2754:3: ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:2754:3: ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) )
                    // InternalDroneDSL.g:2755:4: ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:2755:4: ( (lv_t_27_0= ruleAR ) )
                    // InternalDroneDSL.g:2756:5: (lv_t_27_0= ruleAR )
                    {
                    // InternalDroneDSL.g:2756:5: (lv_t_27_0= ruleAR )
                    // InternalDroneDSL.g:2757:6: lv_t_27_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTARParserRuleCall_9_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_28=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_28, grammarAccess.getParallele2Access().getAmpersandKeyword_9_1());
                    			
                    // InternalDroneDSL.g:2778:4: ( (lv_a_29_0= ruleMD ) )
                    // InternalDroneDSL.g:2779:5: (lv_a_29_0= ruleMD )
                    {
                    // InternalDroneDSL.g:2779:5: (lv_a_29_0= ruleMD )
                    // InternalDroneDSL.g:2780:6: lv_a_29_0= ruleMD
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
                    // InternalDroneDSL.g:2799:3: ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:2799:3: ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:2800:4: ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:2800:4: ( (lv_t_30_0= ruleAR ) )
                    // InternalDroneDSL.g:2801:5: (lv_t_30_0= ruleAR )
                    {
                    // InternalDroneDSL.g:2801:5: (lv_t_30_0= ruleAR )
                    // InternalDroneDSL.g:2802:6: lv_t_30_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTARParserRuleCall_10_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_31=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_31, grammarAccess.getParallele2Access().getAmpersandKeyword_10_1());
                    			
                    // InternalDroneDSL.g:2823:4: ( (lv_a_32_0= ruleRGRD ) )
                    // InternalDroneDSL.g:2824:5: (lv_a_32_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:2824:5: (lv_a_32_0= ruleRGRD )
                    // InternalDroneDSL.g:2825:6: lv_a_32_0= ruleRGRD
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
                    // InternalDroneDSL.g:2844:3: ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:2844:3: ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:2845:4: ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:2845:4: ( (lv_t_33_0= ruleAR ) )
                    // InternalDroneDSL.g:2846:5: (lv_t_33_0= ruleAR )
                    {
                    // InternalDroneDSL.g:2846:5: (lv_t_33_0= ruleAR )
                    // InternalDroneDSL.g:2847:6: lv_t_33_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTARParserRuleCall_11_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_34=(Token)match(input,44,FOLLOW_30); 

                    				newLeafNode(otherlv_34, grammarAccess.getParallele2Access().getAmpersandKeyword_11_1());
                    			
                    // InternalDroneDSL.g:2868:4: ( (lv_a_35_0= ruleGDr ) )
                    // InternalDroneDSL.g:2869:5: (lv_a_35_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:2869:5: (lv_a_35_0= ruleGDr )
                    // InternalDroneDSL.g:2870:6: lv_a_35_0= ruleGDr
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
    // InternalDroneDSL.g:2892:1: entryRuleParallele3 returns [EObject current=null] : iv_ruleParallele3= ruleParallele3 EOF ;
    public final EObject entryRuleParallele3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallele3 = null;


        try {
            // InternalDroneDSL.g:2892:51: (iv_ruleParallele3= ruleParallele3 EOF )
            // InternalDroneDSL.g:2893:2: iv_ruleParallele3= ruleParallele3 EOF
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
    // InternalDroneDSL.g:2899:1: ruleParallele3 returns [EObject current=null] : ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) ) ;
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
            // InternalDroneDSL.g:2905:2: ( ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) ) )
            // InternalDroneDSL.g:2906:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) )
            {
            // InternalDroneDSL.g:2906:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) )
            int alt19=24;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalDroneDSL.g:2907:3: ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:2907:3: ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) )
                    // InternalDroneDSL.g:2908:4: ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:2908:4: ( (lv_a_0_0= ruleAR ) )
                    // InternalDroneDSL.g:2909:5: (lv_a_0_0= ruleAR )
                    {
                    // InternalDroneDSL.g:2909:5: (lv_a_0_0= ruleAR )
                    // InternalDroneDSL.g:2910:6: lv_a_0_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAARParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_1=(Token)match(input,44,FOLLOW_30); 

                    				newLeafNode(otherlv_1, grammarAccess.getParallele3Access().getAmpersandKeyword_0_1());
                    			
                    // InternalDroneDSL.g:2931:4: ( (lv_b_2_0= ruleGDr ) )
                    // InternalDroneDSL.g:2932:5: (lv_b_2_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:2932:5: (lv_b_2_0= ruleGDr )
                    // InternalDroneDSL.g:2933:6: lv_b_2_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBGDrParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_3=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_3, grammarAccess.getParallele3Access().getAmpersandKeyword_0_3());
                    			
                    // InternalDroneDSL.g:2954:4: ( (lv_c_4_0= ruleMD ) )
                    // InternalDroneDSL.g:2955:5: (lv_c_4_0= ruleMD )
                    {
                    // InternalDroneDSL.g:2955:5: (lv_c_4_0= ruleMD )
                    // InternalDroneDSL.g:2956:6: lv_c_4_0= ruleMD
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
                    // InternalDroneDSL.g:2975:3: ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:2975:3: ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:2976:4: ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:2976:4: ( (lv_a_5_0= ruleAR ) )
                    // InternalDroneDSL.g:2977:5: (lv_a_5_0= ruleAR )
                    {
                    // InternalDroneDSL.g:2977:5: (lv_a_5_0= ruleAR )
                    // InternalDroneDSL.g:2978:6: lv_a_5_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAARParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_6=(Token)match(input,44,FOLLOW_30); 

                    				newLeafNode(otherlv_6, grammarAccess.getParallele3Access().getAmpersandKeyword_1_1());
                    			
                    // InternalDroneDSL.g:2999:4: ( (lv_b_7_0= ruleGDr ) )
                    // InternalDroneDSL.g:3000:5: (lv_b_7_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3000:5: (lv_b_7_0= ruleGDr )
                    // InternalDroneDSL.g:3001:6: lv_b_7_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBGDrParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_8=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_8, grammarAccess.getParallele3Access().getAmpersandKeyword_1_3());
                    			
                    // InternalDroneDSL.g:3022:4: ( (lv_c_9_0= ruleRGRD ) )
                    // InternalDroneDSL.g:3023:5: (lv_c_9_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:3023:5: (lv_c_9_0= ruleRGRD )
                    // InternalDroneDSL.g:3024:6: lv_c_9_0= ruleRGRD
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
                    // InternalDroneDSL.g:3043:3: ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:3043:3: ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:3044:4: ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:3044:4: ( (lv_a_10_0= ruleAR ) )
                    // InternalDroneDSL.g:3045:5: (lv_a_10_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3045:5: (lv_a_10_0= ruleAR )
                    // InternalDroneDSL.g:3046:6: lv_a_10_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAARParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_11=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_11, grammarAccess.getParallele3Access().getAmpersandKeyword_2_1());
                    			
                    // InternalDroneDSL.g:3067:4: ( (lv_b_12_0= ruleMD ) )
                    // InternalDroneDSL.g:3068:5: (lv_b_12_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3068:5: (lv_b_12_0= ruleMD )
                    // InternalDroneDSL.g:3069:6: lv_b_12_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBMDParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_13=(Token)match(input,44,FOLLOW_30); 

                    				newLeafNode(otherlv_13, grammarAccess.getParallele3Access().getAmpersandKeyword_2_3());
                    			
                    // InternalDroneDSL.g:3090:4: ( (lv_c_14_0= ruleGDr ) )
                    // InternalDroneDSL.g:3091:5: (lv_c_14_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3091:5: (lv_c_14_0= ruleGDr )
                    // InternalDroneDSL.g:3092:6: lv_c_14_0= ruleGDr
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
                    // InternalDroneDSL.g:3111:3: ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:3111:3: ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:3112:4: ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:3112:4: ( (lv_a_15_0= ruleAR ) )
                    // InternalDroneDSL.g:3113:5: (lv_a_15_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3113:5: (lv_a_15_0= ruleAR )
                    // InternalDroneDSL.g:3114:6: lv_a_15_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAARParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_16=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_16, grammarAccess.getParallele3Access().getAmpersandKeyword_3_1());
                    			
                    // InternalDroneDSL.g:3135:4: ( (lv_b_17_0= ruleMD ) )
                    // InternalDroneDSL.g:3136:5: (lv_b_17_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3136:5: (lv_b_17_0= ruleMD )
                    // InternalDroneDSL.g:3137:6: lv_b_17_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBMDParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_18=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_18, grammarAccess.getParallele3Access().getAmpersandKeyword_3_3());
                    			
                    // InternalDroneDSL.g:3158:4: ( (lv_c_19_0= ruleRGRD ) )
                    // InternalDroneDSL.g:3159:5: (lv_c_19_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:3159:5: (lv_c_19_0= ruleRGRD )
                    // InternalDroneDSL.g:3160:6: lv_c_19_0= ruleRGRD
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
                    // InternalDroneDSL.g:3179:3: ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:3179:3: ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) )
                    // InternalDroneDSL.g:3180:4: ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:3180:4: ( (lv_a_20_0= ruleAR ) )
                    // InternalDroneDSL.g:3181:5: (lv_a_20_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3181:5: (lv_a_20_0= ruleAR )
                    // InternalDroneDSL.g:3182:6: lv_a_20_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAARParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_21=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_21, grammarAccess.getParallele3Access().getAmpersandKeyword_4_1());
                    			
                    // InternalDroneDSL.g:3203:4: ( (lv_b_22_0= ruleRGRD ) )
                    // InternalDroneDSL.g:3204:5: (lv_b_22_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:3204:5: (lv_b_22_0= ruleRGRD )
                    // InternalDroneDSL.g:3205:6: lv_b_22_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_23=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_23, grammarAccess.getParallele3Access().getAmpersandKeyword_4_3());
                    			
                    // InternalDroneDSL.g:3226:4: ( (lv_c_24_0= ruleMD ) )
                    // InternalDroneDSL.g:3227:5: (lv_c_24_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3227:5: (lv_c_24_0= ruleMD )
                    // InternalDroneDSL.g:3228:6: lv_c_24_0= ruleMD
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
                    // InternalDroneDSL.g:3247:3: ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:3247:3: ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:3248:4: ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:3248:4: ( (lv_a_25_0= ruleAR ) )
                    // InternalDroneDSL.g:3249:5: (lv_a_25_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3249:5: (lv_a_25_0= ruleAR )
                    // InternalDroneDSL.g:3250:6: lv_a_25_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAARParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_26=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_26, grammarAccess.getParallele3Access().getAmpersandKeyword_5_1());
                    			
                    // InternalDroneDSL.g:3271:4: ( (lv_b_27_0= ruleRGRD ) )
                    // InternalDroneDSL.g:3272:5: (lv_b_27_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:3272:5: (lv_b_27_0= ruleRGRD )
                    // InternalDroneDSL.g:3273:6: lv_b_27_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_28=(Token)match(input,44,FOLLOW_30); 

                    				newLeafNode(otherlv_28, grammarAccess.getParallele3Access().getAmpersandKeyword_5_3());
                    			
                    // InternalDroneDSL.g:3294:4: ( (lv_c_29_0= ruleGDr ) )
                    // InternalDroneDSL.g:3295:5: (lv_c_29_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3295:5: (lv_c_29_0= ruleGDr )
                    // InternalDroneDSL.g:3296:6: lv_c_29_0= ruleGDr
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
                    // InternalDroneDSL.g:3315:3: ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:3315:3: ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) )
                    // InternalDroneDSL.g:3316:4: ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:3316:4: ( (lv_a_30_0= ruleGDr ) )
                    // InternalDroneDSL.g:3317:5: (lv_a_30_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3317:5: (lv_a_30_0= ruleGDr )
                    // InternalDroneDSL.g:3318:6: lv_a_30_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAGDrParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_31=(Token)match(input,44,FOLLOW_31); 

                    				newLeafNode(otherlv_31, grammarAccess.getParallele3Access().getAmpersandKeyword_6_1());
                    			
                    // InternalDroneDSL.g:3339:4: ( (lv_b_32_0= ruleAR ) )
                    // InternalDroneDSL.g:3340:5: (lv_b_32_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3340:5: (lv_b_32_0= ruleAR )
                    // InternalDroneDSL.g:3341:6: lv_b_32_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBARParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_33=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_33, grammarAccess.getParallele3Access().getAmpersandKeyword_6_3());
                    			
                    // InternalDroneDSL.g:3362:4: ( (lv_c_34_0= ruleMD ) )
                    // InternalDroneDSL.g:3363:5: (lv_c_34_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3363:5: (lv_c_34_0= ruleMD )
                    // InternalDroneDSL.g:3364:6: lv_c_34_0= ruleMD
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
                    // InternalDroneDSL.g:3383:3: ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:3383:3: ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:3384:4: ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:3384:4: ( (lv_a_35_0= ruleGDr ) )
                    // InternalDroneDSL.g:3385:5: (lv_a_35_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3385:5: (lv_a_35_0= ruleGDr )
                    // InternalDroneDSL.g:3386:6: lv_a_35_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAGDrParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_36=(Token)match(input,44,FOLLOW_31); 

                    				newLeafNode(otherlv_36, grammarAccess.getParallele3Access().getAmpersandKeyword_7_1());
                    			
                    // InternalDroneDSL.g:3407:4: ( (lv_b_37_0= ruleAR ) )
                    // InternalDroneDSL.g:3408:5: (lv_b_37_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3408:5: (lv_b_37_0= ruleAR )
                    // InternalDroneDSL.g:3409:6: lv_b_37_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBARParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_38=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_38, grammarAccess.getParallele3Access().getAmpersandKeyword_7_3());
                    			
                    // InternalDroneDSL.g:3430:4: ( (lv_c_39_0= ruleRGRD ) )
                    // InternalDroneDSL.g:3431:5: (lv_c_39_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:3431:5: (lv_c_39_0= ruleRGRD )
                    // InternalDroneDSL.g:3432:6: lv_c_39_0= ruleRGRD
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
                    // InternalDroneDSL.g:3451:3: ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:3451:3: ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) )
                    // InternalDroneDSL.g:3452:4: ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:3452:4: ( (lv_a_40_0= ruleGDr ) )
                    // InternalDroneDSL.g:3453:5: (lv_a_40_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3453:5: (lv_a_40_0= ruleGDr )
                    // InternalDroneDSL.g:3454:6: lv_a_40_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAGDrParserRuleCall_8_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_41=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_41, grammarAccess.getParallele3Access().getAmpersandKeyword_8_1());
                    			
                    // InternalDroneDSL.g:3475:4: ( (lv_b_42_0= ruleMD ) )
                    // InternalDroneDSL.g:3476:5: (lv_b_42_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3476:5: (lv_b_42_0= ruleMD )
                    // InternalDroneDSL.g:3477:6: lv_b_42_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBMDParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_43=(Token)match(input,44,FOLLOW_31); 

                    				newLeafNode(otherlv_43, grammarAccess.getParallele3Access().getAmpersandKeyword_8_3());
                    			
                    // InternalDroneDSL.g:3498:4: ( (lv_c_44_0= ruleAR ) )
                    // InternalDroneDSL.g:3499:5: (lv_c_44_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3499:5: (lv_c_44_0= ruleAR )
                    // InternalDroneDSL.g:3500:6: lv_c_44_0= ruleAR
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
                    // InternalDroneDSL.g:3519:3: ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:3519:3: ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:3520:4: ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:3520:4: ( (lv_a_45_0= ruleGDr ) )
                    // InternalDroneDSL.g:3521:5: (lv_a_45_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3521:5: (lv_a_45_0= ruleGDr )
                    // InternalDroneDSL.g:3522:6: lv_a_45_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAGDrParserRuleCall_9_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_46=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_46, grammarAccess.getParallele3Access().getAmpersandKeyword_9_1());
                    			
                    // InternalDroneDSL.g:3543:4: ( (lv_b_47_0= ruleMD ) )
                    // InternalDroneDSL.g:3544:5: (lv_b_47_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3544:5: (lv_b_47_0= ruleMD )
                    // InternalDroneDSL.g:3545:6: lv_b_47_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBMDParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_48=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_48, grammarAccess.getParallele3Access().getAmpersandKeyword_9_3());
                    			
                    // InternalDroneDSL.g:3566:4: ( (lv_c_49_0= ruleRGRD ) )
                    // InternalDroneDSL.g:3567:5: (lv_c_49_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:3567:5: (lv_c_49_0= ruleRGRD )
                    // InternalDroneDSL.g:3568:6: lv_c_49_0= ruleRGRD
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
                    // InternalDroneDSL.g:3587:3: ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:3587:3: ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) )
                    // InternalDroneDSL.g:3588:4: ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:3588:4: ( (lv_a_50_0= ruleGDr ) )
                    // InternalDroneDSL.g:3589:5: (lv_a_50_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3589:5: (lv_a_50_0= ruleGDr )
                    // InternalDroneDSL.g:3590:6: lv_a_50_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAGDrParserRuleCall_10_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_51=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_51, grammarAccess.getParallele3Access().getAmpersandKeyword_10_1());
                    			
                    // InternalDroneDSL.g:3611:4: ( (lv_b_52_0= ruleRGRD ) )
                    // InternalDroneDSL.g:3612:5: (lv_b_52_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:3612:5: (lv_b_52_0= ruleRGRD )
                    // InternalDroneDSL.g:3613:6: lv_b_52_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_53=(Token)match(input,44,FOLLOW_31); 

                    				newLeafNode(otherlv_53, grammarAccess.getParallele3Access().getAmpersandKeyword_10_3());
                    			
                    // InternalDroneDSL.g:3634:4: ( (lv_c_54_0= ruleAR ) )
                    // InternalDroneDSL.g:3635:5: (lv_c_54_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3635:5: (lv_c_54_0= ruleAR )
                    // InternalDroneDSL.g:3636:6: lv_c_54_0= ruleAR
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
                    // InternalDroneDSL.g:3655:3: ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:3655:3: ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) )
                    // InternalDroneDSL.g:3656:4: ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:3656:4: ( (lv_a_55_0= ruleGDr ) )
                    // InternalDroneDSL.g:3657:5: (lv_a_55_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3657:5: (lv_a_55_0= ruleGDr )
                    // InternalDroneDSL.g:3658:6: lv_a_55_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAGDrParserRuleCall_11_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_56=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_56, grammarAccess.getParallele3Access().getAmpersandKeyword_11_1());
                    			
                    // InternalDroneDSL.g:3679:4: ( (lv_b_57_0= ruleRGRD ) )
                    // InternalDroneDSL.g:3680:5: (lv_b_57_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:3680:5: (lv_b_57_0= ruleRGRD )
                    // InternalDroneDSL.g:3681:6: lv_b_57_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_58=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_58, grammarAccess.getParallele3Access().getAmpersandKeyword_11_3());
                    			
                    // InternalDroneDSL.g:3702:4: ( (lv_c_59_0= ruleMD ) )
                    // InternalDroneDSL.g:3703:5: (lv_c_59_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3703:5: (lv_c_59_0= ruleMD )
                    // InternalDroneDSL.g:3704:6: lv_c_59_0= ruleMD
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
                    // InternalDroneDSL.g:3723:3: ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:3723:3: ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:3724:4: ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:3724:4: ( (lv_a_60_0= ruleMD ) )
                    // InternalDroneDSL.g:3725:5: (lv_a_60_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3725:5: (lv_a_60_0= ruleMD )
                    // InternalDroneDSL.g:3726:6: lv_a_60_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAMDParserRuleCall_12_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_61=(Token)match(input,44,FOLLOW_31); 

                    				newLeafNode(otherlv_61, grammarAccess.getParallele3Access().getAmpersandKeyword_12_1());
                    			
                    // InternalDroneDSL.g:3747:4: ( (lv_b_62_0= ruleAR ) )
                    // InternalDroneDSL.g:3748:5: (lv_b_62_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3748:5: (lv_b_62_0= ruleAR )
                    // InternalDroneDSL.g:3749:6: lv_b_62_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBARParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_63=(Token)match(input,44,FOLLOW_30); 

                    				newLeafNode(otherlv_63, grammarAccess.getParallele3Access().getAmpersandKeyword_12_3());
                    			
                    // InternalDroneDSL.g:3770:4: ( (lv_c_64_0= ruleGDr ) )
                    // InternalDroneDSL.g:3771:5: (lv_c_64_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3771:5: (lv_c_64_0= ruleGDr )
                    // InternalDroneDSL.g:3772:6: lv_c_64_0= ruleGDr
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
                    // InternalDroneDSL.g:3791:3: ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:3791:3: ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:3792:4: ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:3792:4: ( (lv_a_65_0= ruleMD ) )
                    // InternalDroneDSL.g:3793:5: (lv_a_65_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3793:5: (lv_a_65_0= ruleMD )
                    // InternalDroneDSL.g:3794:6: lv_a_65_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAMDParserRuleCall_13_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_66=(Token)match(input,44,FOLLOW_31); 

                    				newLeafNode(otherlv_66, grammarAccess.getParallele3Access().getAmpersandKeyword_13_1());
                    			
                    // InternalDroneDSL.g:3815:4: ( (lv_b_67_0= ruleAR ) )
                    // InternalDroneDSL.g:3816:5: (lv_b_67_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3816:5: (lv_b_67_0= ruleAR )
                    // InternalDroneDSL.g:3817:6: lv_b_67_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBARParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_68=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_68, grammarAccess.getParallele3Access().getAmpersandKeyword_13_3());
                    			
                    // InternalDroneDSL.g:3838:4: ( (lv_c_69_0= ruleRGRD ) )
                    // InternalDroneDSL.g:3839:5: (lv_c_69_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:3839:5: (lv_c_69_0= ruleRGRD )
                    // InternalDroneDSL.g:3840:6: lv_c_69_0= ruleRGRD
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
                    // InternalDroneDSL.g:3859:3: ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:3859:3: ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) )
                    // InternalDroneDSL.g:3860:4: ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:3860:4: ( (lv_a_70_0= ruleMD ) )
                    // InternalDroneDSL.g:3861:5: (lv_a_70_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3861:5: (lv_a_70_0= ruleMD )
                    // InternalDroneDSL.g:3862:6: lv_a_70_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAMDParserRuleCall_14_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_71=(Token)match(input,44,FOLLOW_30); 

                    				newLeafNode(otherlv_71, grammarAccess.getParallele3Access().getAmpersandKeyword_14_1());
                    			
                    // InternalDroneDSL.g:3883:4: ( (lv_b_72_0= ruleGDr ) )
                    // InternalDroneDSL.g:3884:5: (lv_b_72_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3884:5: (lv_b_72_0= ruleGDr )
                    // InternalDroneDSL.g:3885:6: lv_b_72_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBGDrParserRuleCall_14_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_73=(Token)match(input,44,FOLLOW_31); 

                    				newLeafNode(otherlv_73, grammarAccess.getParallele3Access().getAmpersandKeyword_14_3());
                    			
                    // InternalDroneDSL.g:3906:4: ( (lv_c_74_0= ruleAR ) )
                    // InternalDroneDSL.g:3907:5: (lv_c_74_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3907:5: (lv_c_74_0= ruleAR )
                    // InternalDroneDSL.g:3908:6: lv_c_74_0= ruleAR
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
                    // InternalDroneDSL.g:3927:3: ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:3927:3: ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:3928:4: ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:3928:4: ( (lv_a_75_0= ruleMD ) )
                    // InternalDroneDSL.g:3929:5: (lv_a_75_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3929:5: (lv_a_75_0= ruleMD )
                    // InternalDroneDSL.g:3930:6: lv_a_75_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAMDParserRuleCall_15_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_76=(Token)match(input,44,FOLLOW_30); 

                    				newLeafNode(otherlv_76, grammarAccess.getParallele3Access().getAmpersandKeyword_15_1());
                    			
                    // InternalDroneDSL.g:3951:4: ( (lv_b_77_0= ruleGDr ) )
                    // InternalDroneDSL.g:3952:5: (lv_b_77_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3952:5: (lv_b_77_0= ruleGDr )
                    // InternalDroneDSL.g:3953:6: lv_b_77_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBGDrParserRuleCall_15_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_78=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_78, grammarAccess.getParallele3Access().getAmpersandKeyword_15_3());
                    			
                    // InternalDroneDSL.g:3974:4: ( (lv_c_79_0= ruleRGRD ) )
                    // InternalDroneDSL.g:3975:5: (lv_c_79_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:3975:5: (lv_c_79_0= ruleRGRD )
                    // InternalDroneDSL.g:3976:6: lv_c_79_0= ruleRGRD
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
                    // InternalDroneDSL.g:3995:3: ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:3995:3: ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:3996:4: ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:3996:4: ( (lv_a_80_0= ruleMD ) )
                    // InternalDroneDSL.g:3997:5: (lv_a_80_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3997:5: (lv_a_80_0= ruleMD )
                    // InternalDroneDSL.g:3998:6: lv_a_80_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAMDParserRuleCall_16_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_81=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_81, grammarAccess.getParallele3Access().getAmpersandKeyword_16_1());
                    			
                    // InternalDroneDSL.g:4019:4: ( (lv_b_82_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4020:5: (lv_b_82_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4020:5: (lv_b_82_0= ruleRGRD )
                    // InternalDroneDSL.g:4021:6: lv_b_82_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_16_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_83=(Token)match(input,44,FOLLOW_30); 

                    				newLeafNode(otherlv_83, grammarAccess.getParallele3Access().getAmpersandKeyword_16_3());
                    			
                    // InternalDroneDSL.g:4042:4: ( (lv_c_84_0= ruleGDr ) )
                    // InternalDroneDSL.g:4043:5: (lv_c_84_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:4043:5: (lv_c_84_0= ruleGDr )
                    // InternalDroneDSL.g:4044:6: lv_c_84_0= ruleGDr
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
                    // InternalDroneDSL.g:4063:3: ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:4063:3: ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) )
                    // InternalDroneDSL.g:4064:4: ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:4064:4: ( (lv_a_85_0= ruleMD ) )
                    // InternalDroneDSL.g:4065:5: (lv_a_85_0= ruleMD )
                    {
                    // InternalDroneDSL.g:4065:5: (lv_a_85_0= ruleMD )
                    // InternalDroneDSL.g:4066:6: lv_a_85_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAMDParserRuleCall_17_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_86=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_86, grammarAccess.getParallele3Access().getAmpersandKeyword_17_1());
                    			
                    // InternalDroneDSL.g:4087:4: ( (lv_b_87_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4088:5: (lv_b_87_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4088:5: (lv_b_87_0= ruleRGRD )
                    // InternalDroneDSL.g:4089:6: lv_b_87_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_17_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_88=(Token)match(input,44,FOLLOW_31); 

                    				newLeafNode(otherlv_88, grammarAccess.getParallele3Access().getAmpersandKeyword_17_3());
                    			
                    // InternalDroneDSL.g:4110:4: ( (lv_c_89_0= ruleAR ) )
                    // InternalDroneDSL.g:4111:5: (lv_c_89_0= ruleAR )
                    {
                    // InternalDroneDSL.g:4111:5: (lv_c_89_0= ruleAR )
                    // InternalDroneDSL.g:4112:6: lv_c_89_0= ruleAR
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
                    // InternalDroneDSL.g:4131:3: ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:4131:3: ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) )
                    // InternalDroneDSL.g:4132:4: ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:4132:4: ( (lv_a_90_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4133:5: (lv_a_90_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4133:5: (lv_a_90_0= ruleRGRD )
                    // InternalDroneDSL.g:4134:6: lv_a_90_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getARGRDParserRuleCall_18_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_91=(Token)match(input,44,FOLLOW_31); 

                    				newLeafNode(otherlv_91, grammarAccess.getParallele3Access().getAmpersandKeyword_18_1());
                    			
                    // InternalDroneDSL.g:4155:4: ( (lv_b_92_0= ruleAR ) )
                    // InternalDroneDSL.g:4156:5: (lv_b_92_0= ruleAR )
                    {
                    // InternalDroneDSL.g:4156:5: (lv_b_92_0= ruleAR )
                    // InternalDroneDSL.g:4157:6: lv_b_92_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBARParserRuleCall_18_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_93=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_93, grammarAccess.getParallele3Access().getAmpersandKeyword_18_3());
                    			
                    // InternalDroneDSL.g:4178:4: ( (lv_c_94_0= ruleMD ) )
                    // InternalDroneDSL.g:4179:5: (lv_c_94_0= ruleMD )
                    {
                    // InternalDroneDSL.g:4179:5: (lv_c_94_0= ruleMD )
                    // InternalDroneDSL.g:4180:6: lv_c_94_0= ruleMD
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
                    // InternalDroneDSL.g:4199:3: ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:4199:3: ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:4200:4: ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:4200:4: ( (lv_a_95_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4201:5: (lv_a_95_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4201:5: (lv_a_95_0= ruleRGRD )
                    // InternalDroneDSL.g:4202:6: lv_a_95_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getARGRDParserRuleCall_19_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_96=(Token)match(input,44,FOLLOW_31); 

                    				newLeafNode(otherlv_96, grammarAccess.getParallele3Access().getAmpersandKeyword_19_1());
                    			
                    // InternalDroneDSL.g:4223:4: ( (lv_b_97_0= ruleAR ) )
                    // InternalDroneDSL.g:4224:5: (lv_b_97_0= ruleAR )
                    {
                    // InternalDroneDSL.g:4224:5: (lv_b_97_0= ruleAR )
                    // InternalDroneDSL.g:4225:6: lv_b_97_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBARParserRuleCall_19_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_98=(Token)match(input,44,FOLLOW_30); 

                    				newLeafNode(otherlv_98, grammarAccess.getParallele3Access().getAmpersandKeyword_19_3());
                    			
                    // InternalDroneDSL.g:4246:4: ( (lv_c_99_0= ruleGDr ) )
                    // InternalDroneDSL.g:4247:5: (lv_c_99_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:4247:5: (lv_c_99_0= ruleGDr )
                    // InternalDroneDSL.g:4248:6: lv_c_99_0= ruleGDr
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
                    // InternalDroneDSL.g:4267:3: ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:4267:3: ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) )
                    // InternalDroneDSL.g:4268:4: ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:4268:4: ( (lv_a_100_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4269:5: (lv_a_100_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4269:5: (lv_a_100_0= ruleRGRD )
                    // InternalDroneDSL.g:4270:6: lv_a_100_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getARGRDParserRuleCall_20_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_101=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_101, grammarAccess.getParallele3Access().getAmpersandKeyword_20_1());
                    			
                    // InternalDroneDSL.g:4291:4: ( (lv_b_102_0= ruleMD ) )
                    // InternalDroneDSL.g:4292:5: (lv_b_102_0= ruleMD )
                    {
                    // InternalDroneDSL.g:4292:5: (lv_b_102_0= ruleMD )
                    // InternalDroneDSL.g:4293:6: lv_b_102_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBMDParserRuleCall_20_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_103=(Token)match(input,44,FOLLOW_31); 

                    				newLeafNode(otherlv_103, grammarAccess.getParallele3Access().getAmpersandKeyword_20_3());
                    			
                    // InternalDroneDSL.g:4314:4: ( (lv_c_104_0= ruleAR ) )
                    // InternalDroneDSL.g:4315:5: (lv_c_104_0= ruleAR )
                    {
                    // InternalDroneDSL.g:4315:5: (lv_c_104_0= ruleAR )
                    // InternalDroneDSL.g:4316:6: lv_c_104_0= ruleAR
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
                    // InternalDroneDSL.g:4335:3: ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:4335:3: ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:4336:4: ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:4336:4: ( (lv_a_105_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4337:5: (lv_a_105_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4337:5: (lv_a_105_0= ruleRGRD )
                    // InternalDroneDSL.g:4338:6: lv_a_105_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getARGRDParserRuleCall_21_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_106=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_106, grammarAccess.getParallele3Access().getAmpersandKeyword_21_1());
                    			
                    // InternalDroneDSL.g:4359:4: ( (lv_b_107_0= ruleMD ) )
                    // InternalDroneDSL.g:4360:5: (lv_b_107_0= ruleMD )
                    {
                    // InternalDroneDSL.g:4360:5: (lv_b_107_0= ruleMD )
                    // InternalDroneDSL.g:4361:6: lv_b_107_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBMDParserRuleCall_21_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_108=(Token)match(input,44,FOLLOW_30); 

                    				newLeafNode(otherlv_108, grammarAccess.getParallele3Access().getAmpersandKeyword_21_3());
                    			
                    // InternalDroneDSL.g:4382:4: ( (lv_c_109_0= ruleGDr ) )
                    // InternalDroneDSL.g:4383:5: (lv_c_109_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:4383:5: (lv_c_109_0= ruleGDr )
                    // InternalDroneDSL.g:4384:6: lv_c_109_0= ruleGDr
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
                    // InternalDroneDSL.g:4403:3: ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:4403:3: ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) )
                    // InternalDroneDSL.g:4404:4: ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:4404:4: ( (lv_a_110_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4405:5: (lv_a_110_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4405:5: (lv_a_110_0= ruleRGRD )
                    // InternalDroneDSL.g:4406:6: lv_a_110_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getARGRDParserRuleCall_22_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_111=(Token)match(input,44,FOLLOW_30); 

                    				newLeafNode(otherlv_111, grammarAccess.getParallele3Access().getAmpersandKeyword_22_1());
                    			
                    // InternalDroneDSL.g:4427:4: ( (lv_b_112_0= ruleGDr ) )
                    // InternalDroneDSL.g:4428:5: (lv_b_112_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:4428:5: (lv_b_112_0= ruleGDr )
                    // InternalDroneDSL.g:4429:6: lv_b_112_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBGDrParserRuleCall_22_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_113=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_113, grammarAccess.getParallele3Access().getAmpersandKeyword_22_3());
                    			
                    // InternalDroneDSL.g:4450:4: ( (lv_c_114_0= ruleMD ) )
                    // InternalDroneDSL.g:4451:5: (lv_c_114_0= ruleMD )
                    {
                    // InternalDroneDSL.g:4451:5: (lv_c_114_0= ruleMD )
                    // InternalDroneDSL.g:4452:6: lv_c_114_0= ruleMD
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
                    // InternalDroneDSL.g:4471:3: ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:4471:3: ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) )
                    // InternalDroneDSL.g:4472:4: ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:4472:4: ( (lv_a_115_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4473:5: (lv_a_115_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4473:5: (lv_a_115_0= ruleRGRD )
                    // InternalDroneDSL.g:4474:6: lv_a_115_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getARGRDParserRuleCall_23_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_116=(Token)match(input,44,FOLLOW_30); 

                    				newLeafNode(otherlv_116, grammarAccess.getParallele3Access().getAmpersandKeyword_23_1());
                    			
                    // InternalDroneDSL.g:4495:4: ( (lv_b_117_0= ruleGDr ) )
                    // InternalDroneDSL.g:4496:5: (lv_b_117_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:4496:5: (lv_b_117_0= ruleGDr )
                    // InternalDroneDSL.g:4497:6: lv_b_117_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBGDrParserRuleCall_23_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_118=(Token)match(input,44,FOLLOW_31); 

                    				newLeafNode(otherlv_118, grammarAccess.getParallele3Access().getAmpersandKeyword_23_3());
                    			
                    // InternalDroneDSL.g:4518:4: ( (lv_c_119_0= ruleAR ) )
                    // InternalDroneDSL.g:4519:5: (lv_c_119_0= ruleAR )
                    {
                    // InternalDroneDSL.g:4519:5: (lv_c_119_0= ruleAR )
                    // InternalDroneDSL.g:4520:6: lv_c_119_0= ruleAR
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
    // InternalDroneDSL.g:4542:1: entryRuleParallele4 returns [EObject current=null] : iv_ruleParallele4= ruleParallele4 EOF ;
    public final EObject entryRuleParallele4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallele4 = null;


        try {
            // InternalDroneDSL.g:4542:51: (iv_ruleParallele4= ruleParallele4 EOF )
            // InternalDroneDSL.g:4543:2: iv_ruleParallele4= ruleParallele4 EOF
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
    // InternalDroneDSL.g:4549:1: ruleParallele4 returns [EObject current=null] : ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) ) | ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) ) | ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) ) | ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) ) | ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) ) | ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) ) | ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) ) | ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) ) | ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) ) | ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) ) | ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) ) | ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) ) | ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) ) | ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) ) | ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) ) | ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) ) | ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) ) | ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) ) | ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) ) | ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) ) | ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) ) | ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) ) | ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) ) | ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) ) ) ;
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
            // InternalDroneDSL.g:4555:2: ( ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) ) | ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) ) | ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) ) | ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) ) | ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) ) | ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) ) | ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) ) | ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) ) | ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) ) | ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) ) | ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) ) | ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) ) | ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) ) | ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) ) | ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) ) | ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) ) | ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) ) | ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) ) | ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) ) | ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) ) | ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) ) | ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) ) | ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) ) | ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) ) ) )
            // InternalDroneDSL.g:4556:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) ) | ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) ) | ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) ) | ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) ) | ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) ) | ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) ) | ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) ) | ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) ) | ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) ) | ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) ) | ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) ) | ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) ) | ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) ) | ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) ) | ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) ) | ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) ) | ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) ) | ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) ) | ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) ) | ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) ) | ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) ) | ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) ) | ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) ) | ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) ) )
            {
            // InternalDroneDSL.g:4556:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) ) | ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) ) | ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) ) | ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) ) | ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) ) | ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) ) | ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) ) | ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) ) | ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) ) | ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) ) | ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) ) | ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) ) | ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) ) | ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) ) | ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) ) | ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) ) | ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) ) | ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) ) | ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) ) | ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) ) | ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) ) | ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) ) | ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) ) | ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) ) )
            int alt20=24;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalDroneDSL.g:4557:3: ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:4557:3: ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:4558:4: ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:4558:4: ( (lv_a_0_0= ruleAR ) )
                    // InternalDroneDSL.g:4559:5: (lv_a_0_0= ruleAR )
                    {
                    // InternalDroneDSL.g:4559:5: (lv_a_0_0= ruleAR )
                    // InternalDroneDSL.g:4560:6: lv_a_0_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAARParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_1=(Token)match(input,44,FOLLOW_30); 

                    				newLeafNode(otherlv_1, grammarAccess.getParallele4Access().getAmpersandKeyword_0_1());
                    			
                    // InternalDroneDSL.g:4581:4: ( (lv_b_2_0= ruleGDr ) )
                    // InternalDroneDSL.g:4582:5: (lv_b_2_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:4582:5: (lv_b_2_0= ruleGDr )
                    // InternalDroneDSL.g:4583:6: lv_b_2_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBGDrParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_3=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_3, grammarAccess.getParallele4Access().getAmpersandKeyword_0_3());
                    			
                    // InternalDroneDSL.g:4604:4: ( (lv_c_4_0= ruleMD ) )
                    // InternalDroneDSL.g:4605:5: (lv_c_4_0= ruleMD )
                    {
                    // InternalDroneDSL.g:4605:5: (lv_c_4_0= ruleMD )
                    // InternalDroneDSL.g:4606:6: lv_c_4_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCMDParserRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_5=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_5, grammarAccess.getParallele4Access().getAmpersandKeyword_0_5());
                    			
                    // InternalDroneDSL.g:4627:4: ( (lv_d_6_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4628:5: (lv_d_6_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4628:5: (lv_d_6_0= ruleRGRD )
                    // InternalDroneDSL.g:4629:6: lv_d_6_0= ruleRGRD
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
                    // InternalDroneDSL.g:4648:3: ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:4648:3: ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) )
                    // InternalDroneDSL.g:4649:4: ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:4649:4: ( (lv_a_7_0= ruleAR ) )
                    // InternalDroneDSL.g:4650:5: (lv_a_7_0= ruleAR )
                    {
                    // InternalDroneDSL.g:4650:5: (lv_a_7_0= ruleAR )
                    // InternalDroneDSL.g:4651:6: lv_a_7_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAARParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_8=(Token)match(input,44,FOLLOW_30); 

                    				newLeafNode(otherlv_8, grammarAccess.getParallele4Access().getAmpersandKeyword_1_1());
                    			
                    // InternalDroneDSL.g:4672:4: ( (lv_b_9_0= ruleGDr ) )
                    // InternalDroneDSL.g:4673:5: (lv_b_9_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:4673:5: (lv_b_9_0= ruleGDr )
                    // InternalDroneDSL.g:4674:6: lv_b_9_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBGDrParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_10=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_10, grammarAccess.getParallele4Access().getAmpersandKeyword_1_3());
                    			
                    // InternalDroneDSL.g:4695:4: ( (lv_c_11_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4696:5: (lv_c_11_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4696:5: (lv_c_11_0= ruleRGRD )
                    // InternalDroneDSL.g:4697:6: lv_c_11_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCRGRDParserRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_12=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_12, grammarAccess.getParallele4Access().getAmpersandKeyword_1_5());
                    			
                    // InternalDroneDSL.g:4718:4: ( (lv_d_13_0= ruleMD ) )
                    // InternalDroneDSL.g:4719:5: (lv_d_13_0= ruleMD )
                    {
                    // InternalDroneDSL.g:4719:5: (lv_d_13_0= ruleMD )
                    // InternalDroneDSL.g:4720:6: lv_d_13_0= ruleMD
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
                    // InternalDroneDSL.g:4739:3: ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:4739:3: ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:4740:4: ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:4740:4: ( (lv_a_14_0= ruleAR ) )
                    // InternalDroneDSL.g:4741:5: (lv_a_14_0= ruleAR )
                    {
                    // InternalDroneDSL.g:4741:5: (lv_a_14_0= ruleAR )
                    // InternalDroneDSL.g:4742:6: lv_a_14_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAARParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_15=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_15, grammarAccess.getParallele4Access().getAmpersandKeyword_2_1());
                    			
                    // InternalDroneDSL.g:4763:4: ( (lv_b_16_0= ruleMD ) )
                    // InternalDroneDSL.g:4764:5: (lv_b_16_0= ruleMD )
                    {
                    // InternalDroneDSL.g:4764:5: (lv_b_16_0= ruleMD )
                    // InternalDroneDSL.g:4765:6: lv_b_16_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBMDParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_17=(Token)match(input,44,FOLLOW_30); 

                    				newLeafNode(otherlv_17, grammarAccess.getParallele4Access().getAmpersandKeyword_2_3());
                    			
                    // InternalDroneDSL.g:4786:4: ( (lv_c_18_0= ruleGDr ) )
                    // InternalDroneDSL.g:4787:5: (lv_c_18_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:4787:5: (lv_c_18_0= ruleGDr )
                    // InternalDroneDSL.g:4788:6: lv_c_18_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCGDrParserRuleCall_2_4_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_19=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_19, grammarAccess.getParallele4Access().getAmpersandKeyword_2_5());
                    			
                    // InternalDroneDSL.g:4809:4: ( (lv_d_20_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4810:5: (lv_d_20_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4810:5: (lv_d_20_0= ruleRGRD )
                    // InternalDroneDSL.g:4811:6: lv_d_20_0= ruleRGRD
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
                    // InternalDroneDSL.g:4830:3: ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:4830:3: ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:4831:4: ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:4831:4: ( (lv_a_21_0= ruleAR ) )
                    // InternalDroneDSL.g:4832:5: (lv_a_21_0= ruleAR )
                    {
                    // InternalDroneDSL.g:4832:5: (lv_a_21_0= ruleAR )
                    // InternalDroneDSL.g:4833:6: lv_a_21_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAARParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_22=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_22, grammarAccess.getParallele4Access().getAmpersandKeyword_3_1());
                    			
                    // InternalDroneDSL.g:4854:4: ( (lv_b_23_0= ruleMD ) )
                    // InternalDroneDSL.g:4855:5: (lv_b_23_0= ruleMD )
                    {
                    // InternalDroneDSL.g:4855:5: (lv_b_23_0= ruleMD )
                    // InternalDroneDSL.g:4856:6: lv_b_23_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBMDParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_24=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_24, grammarAccess.getParallele4Access().getAmpersandKeyword_3_3());
                    			
                    // InternalDroneDSL.g:4877:4: ( (lv_c_25_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4878:5: (lv_c_25_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4878:5: (lv_c_25_0= ruleRGRD )
                    // InternalDroneDSL.g:4879:6: lv_c_25_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCRGRDParserRuleCall_3_4_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_26=(Token)match(input,44,FOLLOW_30); 

                    				newLeafNode(otherlv_26, grammarAccess.getParallele4Access().getAmpersandKeyword_3_5());
                    			
                    // InternalDroneDSL.g:4900:4: ( (lv_d_27_0= ruleGDr ) )
                    // InternalDroneDSL.g:4901:5: (lv_d_27_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:4901:5: (lv_d_27_0= ruleGDr )
                    // InternalDroneDSL.g:4902:6: lv_d_27_0= ruleGDr
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
                    // InternalDroneDSL.g:4921:3: ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:4921:3: ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:4922:4: ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:4922:4: ( (lv_a_28_0= ruleAR ) )
                    // InternalDroneDSL.g:4923:5: (lv_a_28_0= ruleAR )
                    {
                    // InternalDroneDSL.g:4923:5: (lv_a_28_0= ruleAR )
                    // InternalDroneDSL.g:4924:6: lv_a_28_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAARParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_29=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_29, grammarAccess.getParallele4Access().getAmpersandKeyword_4_1());
                    			
                    // InternalDroneDSL.g:4945:4: ( (lv_b_30_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4946:5: (lv_b_30_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4946:5: (lv_b_30_0= ruleRGRD )
                    // InternalDroneDSL.g:4947:6: lv_b_30_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBRGRDParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_31=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_31, grammarAccess.getParallele4Access().getAmpersandKeyword_4_3());
                    			
                    // InternalDroneDSL.g:4968:4: ( (lv_c_32_0= ruleMD ) )
                    // InternalDroneDSL.g:4969:5: (lv_c_32_0= ruleMD )
                    {
                    // InternalDroneDSL.g:4969:5: (lv_c_32_0= ruleMD )
                    // InternalDroneDSL.g:4970:6: lv_c_32_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCMDParserRuleCall_4_4_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_33=(Token)match(input,44,FOLLOW_30); 

                    				newLeafNode(otherlv_33, grammarAccess.getParallele4Access().getAmpersandKeyword_4_5());
                    			
                    // InternalDroneDSL.g:4991:4: ( (lv_d_34_0= ruleGDr ) )
                    // InternalDroneDSL.g:4992:5: (lv_d_34_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:4992:5: (lv_d_34_0= ruleGDr )
                    // InternalDroneDSL.g:4993:6: lv_d_34_0= ruleGDr
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
                    // InternalDroneDSL.g:5012:3: ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:5012:3: ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) )
                    // InternalDroneDSL.g:5013:4: ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:5013:4: ( (lv_a_35_0= ruleAR ) )
                    // InternalDroneDSL.g:5014:5: (lv_a_35_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5014:5: (lv_a_35_0= ruleAR )
                    // InternalDroneDSL.g:5015:6: lv_a_35_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAARParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_36=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_36, grammarAccess.getParallele4Access().getAmpersandKeyword_5_1());
                    			
                    // InternalDroneDSL.g:5036:4: ( (lv_b_37_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5037:5: (lv_b_37_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5037:5: (lv_b_37_0= ruleRGRD )
                    // InternalDroneDSL.g:5038:6: lv_b_37_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBRGRDParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_38=(Token)match(input,44,FOLLOW_30); 

                    				newLeafNode(otherlv_38, grammarAccess.getParallele4Access().getAmpersandKeyword_5_3());
                    			
                    // InternalDroneDSL.g:5059:4: ( (lv_c_39_0= ruleGDr ) )
                    // InternalDroneDSL.g:5060:5: (lv_c_39_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5060:5: (lv_c_39_0= ruleGDr )
                    // InternalDroneDSL.g:5061:6: lv_c_39_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCGDrParserRuleCall_5_4_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_40=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_40, grammarAccess.getParallele4Access().getAmpersandKeyword_5_5());
                    			
                    // InternalDroneDSL.g:5082:4: ( (lv_d_41_0= ruleMD ) )
                    // InternalDroneDSL.g:5083:5: (lv_d_41_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5083:5: (lv_d_41_0= ruleMD )
                    // InternalDroneDSL.g:5084:6: lv_d_41_0= ruleMD
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
                    // InternalDroneDSL.g:5103:3: ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:5103:3: ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:5104:4: ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:5104:4: ( (lv_a_42_0= ruleGDr ) )
                    // InternalDroneDSL.g:5105:5: (lv_a_42_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5105:5: (lv_a_42_0= ruleGDr )
                    // InternalDroneDSL.g:5106:6: lv_a_42_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAGDrParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_43=(Token)match(input,44,FOLLOW_31); 

                    				newLeafNode(otherlv_43, grammarAccess.getParallele4Access().getAmpersandKeyword_6_1());
                    			
                    // InternalDroneDSL.g:5127:4: ( (lv_b_44_0= ruleAR ) )
                    // InternalDroneDSL.g:5128:5: (lv_b_44_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5128:5: (lv_b_44_0= ruleAR )
                    // InternalDroneDSL.g:5129:6: lv_b_44_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBARParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_45=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_45, grammarAccess.getParallele4Access().getAmpersandKeyword_6_3());
                    			
                    // InternalDroneDSL.g:5150:4: ( (lv_c_46_0= ruleMD ) )
                    // InternalDroneDSL.g:5151:5: (lv_c_46_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5151:5: (lv_c_46_0= ruleMD )
                    // InternalDroneDSL.g:5152:6: lv_c_46_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCMDParserRuleCall_6_4_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_47=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_47, grammarAccess.getParallele4Access().getAmpersandKeyword_6_5());
                    			
                    // InternalDroneDSL.g:5173:4: ( (lv_d_48_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5174:5: (lv_d_48_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5174:5: (lv_d_48_0= ruleRGRD )
                    // InternalDroneDSL.g:5175:6: lv_d_48_0= ruleRGRD
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
                    // InternalDroneDSL.g:5194:3: ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:5194:3: ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) )
                    // InternalDroneDSL.g:5195:4: ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:5195:4: ( (lv_a_49_0= ruleGDr ) )
                    // InternalDroneDSL.g:5196:5: (lv_a_49_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5196:5: (lv_a_49_0= ruleGDr )
                    // InternalDroneDSL.g:5197:6: lv_a_49_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAGDrParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_50=(Token)match(input,44,FOLLOW_31); 

                    				newLeafNode(otherlv_50, grammarAccess.getParallele4Access().getAmpersandKeyword_7_1());
                    			
                    // InternalDroneDSL.g:5218:4: ( (lv_b_51_0= ruleAR ) )
                    // InternalDroneDSL.g:5219:5: (lv_b_51_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5219:5: (lv_b_51_0= ruleAR )
                    // InternalDroneDSL.g:5220:6: lv_b_51_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBARParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_52=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_52, grammarAccess.getParallele4Access().getAmpersandKeyword_7_3());
                    			
                    // InternalDroneDSL.g:5241:4: ( (lv_c_53_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5242:5: (lv_c_53_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5242:5: (lv_c_53_0= ruleRGRD )
                    // InternalDroneDSL.g:5243:6: lv_c_53_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCRGRDParserRuleCall_7_4_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_54=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_54, grammarAccess.getParallele4Access().getAmpersandKeyword_7_5());
                    			
                    // InternalDroneDSL.g:5264:4: ( (lv_d_55_0= ruleMD ) )
                    // InternalDroneDSL.g:5265:5: (lv_d_55_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5265:5: (lv_d_55_0= ruleMD )
                    // InternalDroneDSL.g:5266:6: lv_d_55_0= ruleMD
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
                    // InternalDroneDSL.g:5285:3: ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:5285:3: ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:5286:4: ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:5286:4: ( (lv_a_56_0= ruleGDr ) )
                    // InternalDroneDSL.g:5287:5: (lv_a_56_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5287:5: (lv_a_56_0= ruleGDr )
                    // InternalDroneDSL.g:5288:6: lv_a_56_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAGDrParserRuleCall_8_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_57=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_57, grammarAccess.getParallele4Access().getAmpersandKeyword_8_1());
                    			
                    // InternalDroneDSL.g:5309:4: ( (lv_b_58_0= ruleMD ) )
                    // InternalDroneDSL.g:5310:5: (lv_b_58_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5310:5: (lv_b_58_0= ruleMD )
                    // InternalDroneDSL.g:5311:6: lv_b_58_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBMDParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_59=(Token)match(input,44,FOLLOW_31); 

                    				newLeafNode(otherlv_59, grammarAccess.getParallele4Access().getAmpersandKeyword_8_3());
                    			
                    // InternalDroneDSL.g:5332:4: ( (lv_c_60_0= ruleAR ) )
                    // InternalDroneDSL.g:5333:5: (lv_c_60_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5333:5: (lv_c_60_0= ruleAR )
                    // InternalDroneDSL.g:5334:6: lv_c_60_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCARParserRuleCall_8_4_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_61=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_61, grammarAccess.getParallele4Access().getAmpersandKeyword_8_5());
                    			
                    // InternalDroneDSL.g:5355:4: ( (lv_d_62_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5356:5: (lv_d_62_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5356:5: (lv_d_62_0= ruleRGRD )
                    // InternalDroneDSL.g:5357:6: lv_d_62_0= ruleRGRD
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
                    // InternalDroneDSL.g:5376:3: ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:5376:3: ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) )
                    // InternalDroneDSL.g:5377:4: ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:5377:4: ( (lv_a_63_0= ruleGDr ) )
                    // InternalDroneDSL.g:5378:5: (lv_a_63_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5378:5: (lv_a_63_0= ruleGDr )
                    // InternalDroneDSL.g:5379:6: lv_a_63_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAGDrParserRuleCall_9_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_64=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_64, grammarAccess.getParallele4Access().getAmpersandKeyword_9_1());
                    			
                    // InternalDroneDSL.g:5400:4: ( (lv_b_65_0= ruleMD ) )
                    // InternalDroneDSL.g:5401:5: (lv_b_65_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5401:5: (lv_b_65_0= ruleMD )
                    // InternalDroneDSL.g:5402:6: lv_b_65_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBMDParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_66=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_66, grammarAccess.getParallele4Access().getAmpersandKeyword_9_3());
                    			
                    // InternalDroneDSL.g:5423:4: ( (lv_c_67_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5424:5: (lv_c_67_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5424:5: (lv_c_67_0= ruleRGRD )
                    // InternalDroneDSL.g:5425:6: lv_c_67_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCRGRDParserRuleCall_9_4_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_68=(Token)match(input,44,FOLLOW_31); 

                    				newLeafNode(otherlv_68, grammarAccess.getParallele4Access().getAmpersandKeyword_9_5());
                    			
                    // InternalDroneDSL.g:5446:4: ( (lv_d_69_0= ruleAR ) )
                    // InternalDroneDSL.g:5447:5: (lv_d_69_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5447:5: (lv_d_69_0= ruleAR )
                    // InternalDroneDSL.g:5448:6: lv_d_69_0= ruleAR
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
                    // InternalDroneDSL.g:5467:3: ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:5467:3: ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) )
                    // InternalDroneDSL.g:5468:4: ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:5468:4: ( (lv_a_70_0= ruleGDr ) )
                    // InternalDroneDSL.g:5469:5: (lv_a_70_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5469:5: (lv_a_70_0= ruleGDr )
                    // InternalDroneDSL.g:5470:6: lv_a_70_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAGDrParserRuleCall_10_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_71=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_71, grammarAccess.getParallele4Access().getAmpersandKeyword_10_1());
                    			
                    // InternalDroneDSL.g:5491:4: ( (lv_b_72_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5492:5: (lv_b_72_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5492:5: (lv_b_72_0= ruleRGRD )
                    // InternalDroneDSL.g:5493:6: lv_b_72_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBRGRDParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_73=(Token)match(input,44,FOLLOW_31); 

                    				newLeafNode(otherlv_73, grammarAccess.getParallele4Access().getAmpersandKeyword_10_3());
                    			
                    // InternalDroneDSL.g:5514:4: ( (lv_c_74_0= ruleAR ) )
                    // InternalDroneDSL.g:5515:5: (lv_c_74_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5515:5: (lv_c_74_0= ruleAR )
                    // InternalDroneDSL.g:5516:6: lv_c_74_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCARParserRuleCall_10_4_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_75=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_75, grammarAccess.getParallele4Access().getAmpersandKeyword_10_5());
                    			
                    // InternalDroneDSL.g:5537:4: ( (lv_d_76_0= ruleMD ) )
                    // InternalDroneDSL.g:5538:5: (lv_d_76_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5538:5: (lv_d_76_0= ruleMD )
                    // InternalDroneDSL.g:5539:6: lv_d_76_0= ruleMD
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
                    // InternalDroneDSL.g:5558:3: ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:5558:3: ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) )
                    // InternalDroneDSL.g:5559:4: ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:5559:4: ( (lv_a_77_0= ruleGDr ) )
                    // InternalDroneDSL.g:5560:5: (lv_a_77_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5560:5: (lv_a_77_0= ruleGDr )
                    // InternalDroneDSL.g:5561:6: lv_a_77_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAGDrParserRuleCall_11_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_78=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_78, grammarAccess.getParallele4Access().getAmpersandKeyword_11_1());
                    			
                    // InternalDroneDSL.g:5582:4: ( (lv_b_79_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5583:5: (lv_b_79_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5583:5: (lv_b_79_0= ruleRGRD )
                    // InternalDroneDSL.g:5584:6: lv_b_79_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBRGRDParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_80=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_80, grammarAccess.getParallele4Access().getAmpersandKeyword_11_3());
                    			
                    // InternalDroneDSL.g:5605:4: ( (lv_c_81_0= ruleMD ) )
                    // InternalDroneDSL.g:5606:5: (lv_c_81_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5606:5: (lv_c_81_0= ruleMD )
                    // InternalDroneDSL.g:5607:6: lv_c_81_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCMDParserRuleCall_11_4_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_82=(Token)match(input,44,FOLLOW_31); 

                    				newLeafNode(otherlv_82, grammarAccess.getParallele4Access().getAmpersandKeyword_11_5());
                    			
                    // InternalDroneDSL.g:5628:4: ( (lv_d_83_0= ruleAR ) )
                    // InternalDroneDSL.g:5629:5: (lv_d_83_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5629:5: (lv_d_83_0= ruleAR )
                    // InternalDroneDSL.g:5630:6: lv_d_83_0= ruleAR
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
                    // InternalDroneDSL.g:5649:3: ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:5649:3: ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:5650:4: ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:5650:4: ( (lv_a_84_0= ruleMD ) )
                    // InternalDroneDSL.g:5651:5: (lv_a_84_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5651:5: (lv_a_84_0= ruleMD )
                    // InternalDroneDSL.g:5652:6: lv_a_84_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAMDParserRuleCall_12_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_85=(Token)match(input,44,FOLLOW_31); 

                    				newLeafNode(otherlv_85, grammarAccess.getParallele4Access().getAmpersandKeyword_12_1());
                    			
                    // InternalDroneDSL.g:5673:4: ( (lv_b_86_0= ruleAR ) )
                    // InternalDroneDSL.g:5674:5: (lv_b_86_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5674:5: (lv_b_86_0= ruleAR )
                    // InternalDroneDSL.g:5675:6: lv_b_86_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBARParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_87=(Token)match(input,44,FOLLOW_30); 

                    				newLeafNode(otherlv_87, grammarAccess.getParallele4Access().getAmpersandKeyword_12_3());
                    			
                    // InternalDroneDSL.g:5696:4: ( (lv_c_88_0= ruleGDr ) )
                    // InternalDroneDSL.g:5697:5: (lv_c_88_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5697:5: (lv_c_88_0= ruleGDr )
                    // InternalDroneDSL.g:5698:6: lv_c_88_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCGDrParserRuleCall_12_4_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_89=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_89, grammarAccess.getParallele4Access().getAmpersandKeyword_12_5());
                    			
                    // InternalDroneDSL.g:5719:4: ( (lv_d_90_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5720:5: (lv_d_90_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5720:5: (lv_d_90_0= ruleRGRD )
                    // InternalDroneDSL.g:5721:6: lv_d_90_0= ruleRGRD
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
                    // InternalDroneDSL.g:5740:3: ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:5740:3: ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:5741:4: ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:5741:4: ( (lv_a_91_0= ruleMD ) )
                    // InternalDroneDSL.g:5742:5: (lv_a_91_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5742:5: (lv_a_91_0= ruleMD )
                    // InternalDroneDSL.g:5743:6: lv_a_91_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAMDParserRuleCall_13_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_92=(Token)match(input,44,FOLLOW_31); 

                    				newLeafNode(otherlv_92, grammarAccess.getParallele4Access().getAmpersandKeyword_13_1());
                    			
                    // InternalDroneDSL.g:5764:4: ( (lv_b_93_0= ruleAR ) )
                    // InternalDroneDSL.g:5765:5: (lv_b_93_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5765:5: (lv_b_93_0= ruleAR )
                    // InternalDroneDSL.g:5766:6: lv_b_93_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBARParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_94=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_94, grammarAccess.getParallele4Access().getAmpersandKeyword_13_3());
                    			
                    // InternalDroneDSL.g:5787:4: ( (lv_c_95_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5788:5: (lv_c_95_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5788:5: (lv_c_95_0= ruleRGRD )
                    // InternalDroneDSL.g:5789:6: lv_c_95_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCRGRDParserRuleCall_13_4_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_96=(Token)match(input,44,FOLLOW_30); 

                    				newLeafNode(otherlv_96, grammarAccess.getParallele4Access().getAmpersandKeyword_13_5());
                    			
                    // InternalDroneDSL.g:5810:4: ( (lv_d_97_0= ruleGDr ) )
                    // InternalDroneDSL.g:5811:5: (lv_d_97_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5811:5: (lv_d_97_0= ruleGDr )
                    // InternalDroneDSL.g:5812:6: lv_d_97_0= ruleGDr
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
                    // InternalDroneDSL.g:5831:3: ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:5831:3: ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:5832:4: ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:5832:4: ( (lv_a_98_0= ruleMD ) )
                    // InternalDroneDSL.g:5833:5: (lv_a_98_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5833:5: (lv_a_98_0= ruleMD )
                    // InternalDroneDSL.g:5834:6: lv_a_98_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAMDParserRuleCall_14_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_99=(Token)match(input,44,FOLLOW_30); 

                    				newLeafNode(otherlv_99, grammarAccess.getParallele4Access().getAmpersandKeyword_14_1());
                    			
                    // InternalDroneDSL.g:5855:4: ( (lv_b_100_0= ruleGDr ) )
                    // InternalDroneDSL.g:5856:5: (lv_b_100_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5856:5: (lv_b_100_0= ruleGDr )
                    // InternalDroneDSL.g:5857:6: lv_b_100_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBGDrParserRuleCall_14_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_101=(Token)match(input,44,FOLLOW_31); 

                    				newLeafNode(otherlv_101, grammarAccess.getParallele4Access().getAmpersandKeyword_14_3());
                    			
                    // InternalDroneDSL.g:5878:4: ( (lv_c_102_0= ruleAR ) )
                    // InternalDroneDSL.g:5879:5: (lv_c_102_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5879:5: (lv_c_102_0= ruleAR )
                    // InternalDroneDSL.g:5880:6: lv_c_102_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCARParserRuleCall_14_4_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_103=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_103, grammarAccess.getParallele4Access().getAmpersandKeyword_14_5());
                    			
                    // InternalDroneDSL.g:5901:4: ( (lv_d_104_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5902:5: (lv_d_104_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5902:5: (lv_d_104_0= ruleRGRD )
                    // InternalDroneDSL.g:5903:6: lv_d_104_0= ruleRGRD
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
                    // InternalDroneDSL.g:5922:3: ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:5922:3: ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) )
                    // InternalDroneDSL.g:5923:4: ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:5923:4: ( (lv_a_105_0= ruleMD ) )
                    // InternalDroneDSL.g:5924:5: (lv_a_105_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5924:5: (lv_a_105_0= ruleMD )
                    // InternalDroneDSL.g:5925:6: lv_a_105_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAMDParserRuleCall_15_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_106=(Token)match(input,44,FOLLOW_30); 

                    				newLeafNode(otherlv_106, grammarAccess.getParallele4Access().getAmpersandKeyword_15_1());
                    			
                    // InternalDroneDSL.g:5946:4: ( (lv_b_107_0= ruleGDr ) )
                    // InternalDroneDSL.g:5947:5: (lv_b_107_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5947:5: (lv_b_107_0= ruleGDr )
                    // InternalDroneDSL.g:5948:6: lv_b_107_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBGDrParserRuleCall_15_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_108=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_108, grammarAccess.getParallele4Access().getAmpersandKeyword_15_3());
                    			
                    // InternalDroneDSL.g:5969:4: ( (lv_c_109_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5970:5: (lv_c_109_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5970:5: (lv_c_109_0= ruleRGRD )
                    // InternalDroneDSL.g:5971:6: lv_c_109_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCRGRDParserRuleCall_15_4_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_110=(Token)match(input,44,FOLLOW_31); 

                    				newLeafNode(otherlv_110, grammarAccess.getParallele4Access().getAmpersandKeyword_15_5());
                    			
                    // InternalDroneDSL.g:5992:4: ( (lv_d_111_0= ruleAR ) )
                    // InternalDroneDSL.g:5993:5: (lv_d_111_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5993:5: (lv_d_111_0= ruleAR )
                    // InternalDroneDSL.g:5994:6: lv_d_111_0= ruleAR
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
                    // InternalDroneDSL.g:6013:3: ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:6013:3: ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) )
                    // InternalDroneDSL.g:6014:4: ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:6014:4: ( (lv_a_112_0= ruleMD ) )
                    // InternalDroneDSL.g:6015:5: (lv_a_112_0= ruleMD )
                    {
                    // InternalDroneDSL.g:6015:5: (lv_a_112_0= ruleMD )
                    // InternalDroneDSL.g:6016:6: lv_a_112_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAMDParserRuleCall_16_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_113=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_113, grammarAccess.getParallele4Access().getAmpersandKeyword_16_1());
                    			
                    // InternalDroneDSL.g:6037:4: ( (lv_b_114_0= ruleRGRD ) )
                    // InternalDroneDSL.g:6038:5: (lv_b_114_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:6038:5: (lv_b_114_0= ruleRGRD )
                    // InternalDroneDSL.g:6039:6: lv_b_114_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBRGRDParserRuleCall_16_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_115=(Token)match(input,44,FOLLOW_30); 

                    				newLeafNode(otherlv_115, grammarAccess.getParallele4Access().getAmpersandKeyword_16_3());
                    			
                    // InternalDroneDSL.g:6060:4: ( (lv_c_116_0= ruleGDr ) )
                    // InternalDroneDSL.g:6061:5: (lv_c_116_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:6061:5: (lv_c_116_0= ruleGDr )
                    // InternalDroneDSL.g:6062:6: lv_c_116_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCGDrParserRuleCall_16_4_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_117=(Token)match(input,44,FOLLOW_31); 

                    				newLeafNode(otherlv_117, grammarAccess.getParallele4Access().getAmpersandKeyword_16_5());
                    			
                    // InternalDroneDSL.g:6083:4: ( (lv_d_118_0= ruleAR ) )
                    // InternalDroneDSL.g:6084:5: (lv_d_118_0= ruleAR )
                    {
                    // InternalDroneDSL.g:6084:5: (lv_d_118_0= ruleAR )
                    // InternalDroneDSL.g:6085:6: lv_d_118_0= ruleAR
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
                    // InternalDroneDSL.g:6104:3: ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:6104:3: ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:6105:4: ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:6105:4: ( (lv_a_119_0= ruleMD ) )
                    // InternalDroneDSL.g:6106:5: (lv_a_119_0= ruleMD )
                    {
                    // InternalDroneDSL.g:6106:5: (lv_a_119_0= ruleMD )
                    // InternalDroneDSL.g:6107:6: lv_a_119_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAMDParserRuleCall_17_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_120=(Token)match(input,44,FOLLOW_32); 

                    				newLeafNode(otherlv_120, grammarAccess.getParallele4Access().getAmpersandKeyword_17_1());
                    			
                    // InternalDroneDSL.g:6128:4: ( (lv_b_121_0= ruleRGRD ) )
                    // InternalDroneDSL.g:6129:5: (lv_b_121_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:6129:5: (lv_b_121_0= ruleRGRD )
                    // InternalDroneDSL.g:6130:6: lv_b_121_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBRGRDParserRuleCall_17_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_122=(Token)match(input,44,FOLLOW_31); 

                    				newLeafNode(otherlv_122, grammarAccess.getParallele4Access().getAmpersandKeyword_17_3());
                    			
                    // InternalDroneDSL.g:6151:4: ( (lv_c_123_0= ruleAR ) )
                    // InternalDroneDSL.g:6152:5: (lv_c_123_0= ruleAR )
                    {
                    // InternalDroneDSL.g:6152:5: (lv_c_123_0= ruleAR )
                    // InternalDroneDSL.g:6153:6: lv_c_123_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCARParserRuleCall_17_4_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_124=(Token)match(input,44,FOLLOW_30); 

                    				newLeafNode(otherlv_124, grammarAccess.getParallele4Access().getAmpersandKeyword_17_5());
                    			
                    // InternalDroneDSL.g:6174:4: ( (lv_d_125_0= ruleGDr ) )
                    // InternalDroneDSL.g:6175:5: (lv_d_125_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:6175:5: (lv_d_125_0= ruleGDr )
                    // InternalDroneDSL.g:6176:6: lv_d_125_0= ruleGDr
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
                    // InternalDroneDSL.g:6195:3: ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:6195:3: ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:6196:4: ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:6196:4: ( (lv_a_126_0= ruleRGRD ) )
                    // InternalDroneDSL.g:6197:5: (lv_a_126_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:6197:5: (lv_a_126_0= ruleRGRD )
                    // InternalDroneDSL.g:6198:6: lv_a_126_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getARGRDParserRuleCall_18_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_127=(Token)match(input,44,FOLLOW_31); 

                    				newLeafNode(otherlv_127, grammarAccess.getParallele4Access().getAmpersandKeyword_18_1());
                    			
                    // InternalDroneDSL.g:6219:4: ( (lv_b_128_0= ruleAR ) )
                    // InternalDroneDSL.g:6220:5: (lv_b_128_0= ruleAR )
                    {
                    // InternalDroneDSL.g:6220:5: (lv_b_128_0= ruleAR )
                    // InternalDroneDSL.g:6221:6: lv_b_128_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBARParserRuleCall_18_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_129=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_129, grammarAccess.getParallele4Access().getAmpersandKeyword_18_3());
                    			
                    // InternalDroneDSL.g:6242:4: ( (lv_c_130_0= ruleMD ) )
                    // InternalDroneDSL.g:6243:5: (lv_c_130_0= ruleMD )
                    {
                    // InternalDroneDSL.g:6243:5: (lv_c_130_0= ruleMD )
                    // InternalDroneDSL.g:6244:6: lv_c_130_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCMDParserRuleCall_18_4_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_131=(Token)match(input,44,FOLLOW_30); 

                    				newLeafNode(otherlv_131, grammarAccess.getParallele4Access().getAmpersandKeyword_18_5());
                    			
                    // InternalDroneDSL.g:6265:4: ( (lv_d_132_0= ruleGDr ) )
                    // InternalDroneDSL.g:6266:5: (lv_d_132_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:6266:5: (lv_d_132_0= ruleGDr )
                    // InternalDroneDSL.g:6267:6: lv_d_132_0= ruleGDr
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
                    // InternalDroneDSL.g:6286:3: ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:6286:3: ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) )
                    // InternalDroneDSL.g:6287:4: ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:6287:4: ( (lv_a_133_0= ruleRGRD ) )
                    // InternalDroneDSL.g:6288:5: (lv_a_133_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:6288:5: (lv_a_133_0= ruleRGRD )
                    // InternalDroneDSL.g:6289:6: lv_a_133_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getARGRDParserRuleCall_19_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_134=(Token)match(input,44,FOLLOW_31); 

                    				newLeafNode(otherlv_134, grammarAccess.getParallele4Access().getAmpersandKeyword_19_1());
                    			
                    // InternalDroneDSL.g:6310:4: ( (lv_b_135_0= ruleAR ) )
                    // InternalDroneDSL.g:6311:5: (lv_b_135_0= ruleAR )
                    {
                    // InternalDroneDSL.g:6311:5: (lv_b_135_0= ruleAR )
                    // InternalDroneDSL.g:6312:6: lv_b_135_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBARParserRuleCall_19_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_136=(Token)match(input,44,FOLLOW_30); 

                    				newLeafNode(otherlv_136, grammarAccess.getParallele4Access().getAmpersandKeyword_19_3());
                    			
                    // InternalDroneDSL.g:6333:4: ( (lv_c_137_0= ruleGDr ) )
                    // InternalDroneDSL.g:6334:5: (lv_c_137_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:6334:5: (lv_c_137_0= ruleGDr )
                    // InternalDroneDSL.g:6335:6: lv_c_137_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCGDrParserRuleCall_19_4_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_138=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_138, grammarAccess.getParallele4Access().getAmpersandKeyword_19_5());
                    			
                    // InternalDroneDSL.g:6356:4: ( (lv_d_139_0= ruleMD ) )
                    // InternalDroneDSL.g:6357:5: (lv_d_139_0= ruleMD )
                    {
                    // InternalDroneDSL.g:6357:5: (lv_d_139_0= ruleMD )
                    // InternalDroneDSL.g:6358:6: lv_d_139_0= ruleMD
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
                    // InternalDroneDSL.g:6377:3: ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:6377:3: ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:6378:4: ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:6378:4: ( (lv_a_140_0= ruleRGRD ) )
                    // InternalDroneDSL.g:6379:5: (lv_a_140_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:6379:5: (lv_a_140_0= ruleRGRD )
                    // InternalDroneDSL.g:6380:6: lv_a_140_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getARGRDParserRuleCall_20_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_141=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_141, grammarAccess.getParallele4Access().getAmpersandKeyword_20_1());
                    			
                    // InternalDroneDSL.g:6401:4: ( (lv_b_142_0= ruleMD ) )
                    // InternalDroneDSL.g:6402:5: (lv_b_142_0= ruleMD )
                    {
                    // InternalDroneDSL.g:6402:5: (lv_b_142_0= ruleMD )
                    // InternalDroneDSL.g:6403:6: lv_b_142_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBMDParserRuleCall_20_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_143=(Token)match(input,44,FOLLOW_31); 

                    				newLeafNode(otherlv_143, grammarAccess.getParallele4Access().getAmpersandKeyword_20_3());
                    			
                    // InternalDroneDSL.g:6424:4: ( (lv_c_144_0= ruleAR ) )
                    // InternalDroneDSL.g:6425:5: (lv_c_144_0= ruleAR )
                    {
                    // InternalDroneDSL.g:6425:5: (lv_c_144_0= ruleAR )
                    // InternalDroneDSL.g:6426:6: lv_c_144_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCARParserRuleCall_20_4_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_145=(Token)match(input,44,FOLLOW_30); 

                    				newLeafNode(otherlv_145, grammarAccess.getParallele4Access().getAmpersandKeyword_20_5());
                    			
                    // InternalDroneDSL.g:6447:4: ( (lv_d_146_0= ruleGDr ) )
                    // InternalDroneDSL.g:6448:5: (lv_d_146_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:6448:5: (lv_d_146_0= ruleGDr )
                    // InternalDroneDSL.g:6449:6: lv_d_146_0= ruleGDr
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
                    // InternalDroneDSL.g:6468:3: ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:6468:3: ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) )
                    // InternalDroneDSL.g:6469:4: ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:6469:4: ( (lv_a_147_0= ruleRGRD ) )
                    // InternalDroneDSL.g:6470:5: (lv_a_147_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:6470:5: (lv_a_147_0= ruleRGRD )
                    // InternalDroneDSL.g:6471:6: lv_a_147_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getARGRDParserRuleCall_21_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_148=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_148, grammarAccess.getParallele4Access().getAmpersandKeyword_21_1());
                    			
                    // InternalDroneDSL.g:6492:4: ( (lv_b_149_0= ruleMD ) )
                    // InternalDroneDSL.g:6493:5: (lv_b_149_0= ruleMD )
                    {
                    // InternalDroneDSL.g:6493:5: (lv_b_149_0= ruleMD )
                    // InternalDroneDSL.g:6494:6: lv_b_149_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBMDParserRuleCall_21_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_150=(Token)match(input,44,FOLLOW_30); 

                    				newLeafNode(otherlv_150, grammarAccess.getParallele4Access().getAmpersandKeyword_21_3());
                    			
                    // InternalDroneDSL.g:6515:4: ( (lv_c_151_0= ruleGDr ) )
                    // InternalDroneDSL.g:6516:5: (lv_c_151_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:6516:5: (lv_c_151_0= ruleGDr )
                    // InternalDroneDSL.g:6517:6: lv_c_151_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCGDrParserRuleCall_21_4_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_152=(Token)match(input,44,FOLLOW_31); 

                    				newLeafNode(otherlv_152, grammarAccess.getParallele4Access().getAmpersandKeyword_21_5());
                    			
                    // InternalDroneDSL.g:6538:4: ( (lv_d_153_0= ruleAR ) )
                    // InternalDroneDSL.g:6539:5: (lv_d_153_0= ruleAR )
                    {
                    // InternalDroneDSL.g:6539:5: (lv_d_153_0= ruleAR )
                    // InternalDroneDSL.g:6540:6: lv_d_153_0= ruleAR
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
                    // InternalDroneDSL.g:6559:3: ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:6559:3: ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) )
                    // InternalDroneDSL.g:6560:4: ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:6560:4: ( (lv_a_154_0= ruleRGRD ) )
                    // InternalDroneDSL.g:6561:5: (lv_a_154_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:6561:5: (lv_a_154_0= ruleRGRD )
                    // InternalDroneDSL.g:6562:6: lv_a_154_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getARGRDParserRuleCall_22_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_155=(Token)match(input,44,FOLLOW_30); 

                    				newLeafNode(otherlv_155, grammarAccess.getParallele4Access().getAmpersandKeyword_22_1());
                    			
                    // InternalDroneDSL.g:6583:4: ( (lv_b_156_0= ruleGDr ) )
                    // InternalDroneDSL.g:6584:5: (lv_b_156_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:6584:5: (lv_b_156_0= ruleGDr )
                    // InternalDroneDSL.g:6585:6: lv_b_156_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBGDrParserRuleCall_22_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_157=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_157, grammarAccess.getParallele4Access().getAmpersandKeyword_22_3());
                    			
                    // InternalDroneDSL.g:6606:4: ( (lv_c_158_0= ruleMD ) )
                    // InternalDroneDSL.g:6607:5: (lv_c_158_0= ruleMD )
                    {
                    // InternalDroneDSL.g:6607:5: (lv_c_158_0= ruleMD )
                    // InternalDroneDSL.g:6608:6: lv_c_158_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCMDParserRuleCall_22_4_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_159=(Token)match(input,44,FOLLOW_31); 

                    				newLeafNode(otherlv_159, grammarAccess.getParallele4Access().getAmpersandKeyword_22_5());
                    			
                    // InternalDroneDSL.g:6629:4: ( (lv_d_160_0= ruleAR ) )
                    // InternalDroneDSL.g:6630:5: (lv_d_160_0= ruleAR )
                    {
                    // InternalDroneDSL.g:6630:5: (lv_d_160_0= ruleAR )
                    // InternalDroneDSL.g:6631:6: lv_d_160_0= ruleAR
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
                    // InternalDroneDSL.g:6650:3: ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:6650:3: ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) )
                    // InternalDroneDSL.g:6651:4: ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:6651:4: ( (lv_a_161_0= ruleRGRD ) )
                    // InternalDroneDSL.g:6652:5: (lv_a_161_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:6652:5: (lv_a_161_0= ruleRGRD )
                    // InternalDroneDSL.g:6653:6: lv_a_161_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getARGRDParserRuleCall_23_0_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_162=(Token)match(input,44,FOLLOW_30); 

                    				newLeafNode(otherlv_162, grammarAccess.getParallele4Access().getAmpersandKeyword_23_1());
                    			
                    // InternalDroneDSL.g:6674:4: ( (lv_b_163_0= ruleGDr ) )
                    // InternalDroneDSL.g:6675:5: (lv_b_163_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:6675:5: (lv_b_163_0= ruleGDr )
                    // InternalDroneDSL.g:6676:6: lv_b_163_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBGDrParserRuleCall_23_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_164=(Token)match(input,44,FOLLOW_31); 

                    				newLeafNode(otherlv_164, grammarAccess.getParallele4Access().getAmpersandKeyword_23_3());
                    			
                    // InternalDroneDSL.g:6697:4: ( (lv_c_165_0= ruleAR ) )
                    // InternalDroneDSL.g:6698:5: (lv_c_165_0= ruleAR )
                    {
                    // InternalDroneDSL.g:6698:5: (lv_c_165_0= ruleAR )
                    // InternalDroneDSL.g:6699:6: lv_c_165_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCARParserRuleCall_23_4_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_166=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_166, grammarAccess.getParallele4Access().getAmpersandKeyword_23_5());
                    			
                    // InternalDroneDSL.g:6720:4: ( (lv_d_167_0= ruleMD ) )
                    // InternalDroneDSL.g:6721:5: (lv_d_167_0= ruleMD )
                    {
                    // InternalDroneDSL.g:6721:5: (lv_d_167_0= ruleMD )
                    // InternalDroneDSL.g:6722:6: lv_d_167_0= ruleMD
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
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String dfa_1s = "\76\uffff";
    static final String dfa_2s = "\1\7\1\uffff\10\5\3\uffff\20\35\10\6\20\36\10\7\1\uffff";
    static final String dfa_3s = "\1\46\1\uffff\10\7\3\uffff\20\35\10\7\20\36\10\54\1\uffff";
    static final String dfa_4s = "\1\uffff\1\1\10\uffff\1\2\1\4\1\5\60\uffff\1\3";
    static final String dfa_5s = "\76\uffff}>";
    static final String[] dfa_6s = {
            "\1\13\17\uffff\1\1\1\uffff\1\1\2\14\1\4\2\uffff\1\5\1\2\1\3\1\6\1\7\1\10\1\11\1\12",
            "",
            "\1\15\1\uffff\1\16",
            "\1\17\1\uffff\1\20",
            "\1\21\1\uffff\1\22",
            "\1\23\1\uffff\1\24",
            "\1\25\1\uffff\1\26",
            "\1\27\1\uffff\1\30",
            "\1\31\1\uffff\1\32",
            "\1\33\1\uffff\1\34",
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
            "\1\45\1\46",
            "\1\47\1\50",
            "\1\51\1\52",
            "\1\53\1\54",
            "\1\55\1\56",
            "\1\57\1\60",
            "\1\61\1\62",
            "\1\63\1\64",
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
            "\1\12\17\uffff\1\12\1\uffff\4\12\2\uffff\10\12\3\uffff\1\12\1\uffff\1\75",
            "\1\12\17\uffff\1\12\1\uffff\4\12\2\uffff\10\12\3\uffff\1\12\1\uffff\1\75",
            "\1\12\17\uffff\1\12\1\uffff\4\12\2\uffff\10\12\3\uffff\1\12\1\uffff\1\75",
            "\1\12\17\uffff\1\12\1\uffff\4\12\2\uffff\10\12\3\uffff\1\12\1\uffff\1\75",
            "\1\12\17\uffff\1\12\1\uffff\4\12\2\uffff\10\12\3\uffff\1\12\1\uffff\1\75",
            "\1\12\17\uffff\1\12\1\uffff\4\12\2\uffff\10\12\3\uffff\1\12\1\uffff\1\75",
            "\1\12\17\uffff\1\12\1\uffff\4\12\2\uffff\10\12\3\uffff\1\12\1\uffff\1\75",
            "\1\12\17\uffff\1\12\1\uffff\4\12\2\uffff\10\12\3\uffff\1\12\1\uffff\1\75",
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
            return "1818:5: (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir )";
        }
    }
    static final String[] dfa_7s = {
            "\1\13\17\uffff\1\1\1\uffff\1\1\2\14\1\4\2\uffff\1\5\1\2\1\3\1\6\1\7\1\10\1\11\1\12",
            "",
            "\1\15\1\uffff\1\16",
            "\1\17\1\uffff\1\20",
            "\1\21\1\uffff\1\22",
            "\1\23\1\uffff\1\24",
            "\1\25\1\uffff\1\26",
            "\1\27\1\uffff\1\30",
            "\1\31\1\uffff\1\32",
            "\1\33\1\uffff\1\34",
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
            "\1\45\1\46",
            "\1\47\1\50",
            "\1\51\1\52",
            "\1\53\1\54",
            "\1\55\1\56",
            "\1\57\1\60",
            "\1\61\1\62",
            "\1\63\1\64",
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
            "\1\12\17\uffff\1\12\1\uffff\4\12\2\uffff\10\12\5\uffff\1\75",
            "\1\12\17\uffff\1\12\1\uffff\4\12\2\uffff\10\12\5\uffff\1\75",
            "\1\12\17\uffff\1\12\1\uffff\4\12\2\uffff\10\12\5\uffff\1\75",
            "\1\12\17\uffff\1\12\1\uffff\4\12\2\uffff\10\12\5\uffff\1\75",
            "\1\12\17\uffff\1\12\1\uffff\4\12\2\uffff\10\12\5\uffff\1\75",
            "\1\12\17\uffff\1\12\1\uffff\4\12\2\uffff\10\12\5\uffff\1\75",
            "\1\12\17\uffff\1\12\1\uffff\4\12\2\uffff\10\12\5\uffff\1\75",
            "\1\12\17\uffff\1\12\1\uffff\4\12\2\uffff\10\12\5\uffff\1\75",
            ""
    };
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "2020:5: (lv_mainbody_3_1= ruleVarDecl | lv_mainbody_3_2= ruleCommandeBasique | lv_mainbody_3_3= ruleParallele | lv_mainbody_3_4= ruleFonctionCall | lv_mainbody_3_5= ruleDecollerAtterrir )";
        }
    }
    static final String dfa_8s = "\u0244\uffff";
    static final String dfa_9s = "\u00cd\uffff\30\u00e6\u012d\uffff\60\u0243\2\uffff";
    static final String dfa_10s = "\1\34\10\5\20\35\10\6\20\36\10\54\1\40\3\34\30\5\60\35\30\6\60\36\30\7\1\42\1\uffff\2\40\1\34\1\40\2\34\1\40\2\34\1\42\1\34\60\5\140\35\60\6\140\36\60\7\2\uffff";
    static final String dfa_11s = "\1\45\10\7\20\35\10\7\20\36\10\54\2\45\1\43\1\45\30\7\60\35\30\7\60\36\30\54\1\45\1\uffff\1\45\1\43\2\45\1\41\2\43\1\41\1\43\2\45\60\7\140\35\60\7\140\36\60\54\2\uffff";
    static final String dfa_12s = "\u00e6\uffff\1\1\u015b\uffff\1\3\1\2";
    static final String dfa_13s = "\u0244\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\2\uffff\1\2\1\7\1\10\1\3\1\4\1\5\1\6",
            "\1\11\1\uffff\1\12",
            "\1\13\1\uffff\1\14",
            "\1\15\1\uffff\1\16",
            "\1\17\1\uffff\1\20",
            "\1\21\1\uffff\1\22",
            "\1\23\1\uffff\1\24",
            "\1\25\1\uffff\1\26",
            "\1\27\1\uffff\1\30",
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
            "\1\41\1\42",
            "\1\43\1\44",
            "\1\45\1\46",
            "\1\47\1\50",
            "\1\51\1\52",
            "\1\53\1\54",
            "\1\55\1\56",
            "\1\57\1\60",
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
            "\1\75\1\76\1\77\1\100\1\101\1\102",
            "\1\105\2\uffff\1\106\1\103\1\104\2\uffff\1\107\1\110",
            "\1\113\2\uffff\1\114\1\111\1\112\1\115\1\116",
            "\1\121\2\uffff\1\122\2\uffff\1\123\1\124\1\117\1\120",
            "\1\125\1\uffff\1\126",
            "\1\127\1\uffff\1\130",
            "\1\131\1\uffff\1\132",
            "\1\133\1\uffff\1\134",
            "\1\135\1\uffff\1\136",
            "\1\137\1\uffff\1\140",
            "\1\141\1\uffff\1\142",
            "\1\143\1\uffff\1\144",
            "\1\145\1\uffff\1\146",
            "\1\147\1\uffff\1\150",
            "\1\151\1\uffff\1\152",
            "\1\153\1\uffff\1\154",
            "\1\155\1\uffff\1\156",
            "\1\157\1\uffff\1\160",
            "\1\161\1\uffff\1\162",
            "\1\163\1\uffff\1\164",
            "\1\165\1\uffff\1\166",
            "\1\167\1\uffff\1\170",
            "\1\171\1\uffff\1\172",
            "\1\173\1\uffff\1\174",
            "\1\175\1\uffff\1\176",
            "\1\177\1\uffff\1\u0080",
            "\1\u0081\1\uffff\1\u0082",
            "\1\u0083\1\uffff\1\u0084",
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
            "\1\u009d\1\u009e",
            "\1\u009f\1\u00a0",
            "\1\u00a1\1\u00a2",
            "\1\u00a3\1\u00a4",
            "\1\u00a5\1\u00a6",
            "\1\u00a7\1\u00a8",
            "\1\u00a9\1\u00aa",
            "\1\u00ab\1\u00ac",
            "\1\u00ad\1\u00ae",
            "\1\u00af\1\u00b0",
            "\1\u00b1\1\u00b2",
            "\1\u00b3\1\u00b4",
            "\1\u00b5\1\u00b6",
            "\1\u00b7\1\u00b8",
            "\1\u00b9\1\u00ba",
            "\1\u00bb\1\u00bc",
            "\1\u00bd\1\u00be",
            "\1\u00bf\1\u00c0",
            "\1\u00c1\1\u00c2",
            "\1\u00c3\1\u00c4",
            "\1\u00c5\1\u00c6",
            "\1\u00c7\1\u00c8",
            "\1\u00c9\1\u00ca",
            "\1\u00cb\1\u00cc",
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
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\uffff\1\u00e5",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\uffff\1\u00e5",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\uffff\1\u00e7",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\uffff\1\u00e7",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\uffff\1\u00e8",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\uffff\1\u00e8",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\uffff\1\u00e9",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\uffff\1\u00e9",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\uffff\1\u00ea",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\uffff\1\u00ea",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\uffff\1\u00eb",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\uffff\1\u00eb",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\uffff\1\u00ec",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\uffff\1\u00ec",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\uffff\1\u00ed",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\uffff\1\u00ed",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\uffff\1\u00ee",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\uffff\1\u00ee",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\uffff\1\u00ef",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\uffff\1\u00ef",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\uffff\1\u00f0",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\uffff\1\u00f0",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\uffff\1\u00f1",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\uffff\1\u00f1",
            "\1\u00f4\1\u00f5\1\u00f2\1\u00f3",
            "",
            "\1\u00f6\1\u00f7\2\uffff\1\u00f8\1\u00f9",
            "\1\u00fa\1\u00fb\1\u00fc\1\u00fd",
            "\1\u00fe\2\uffff\1\u00ff\4\uffff\1\u0100\1\u0101",
            "\1\u0102\1\u0103\2\uffff\1\u0104\1\u0105",
            "\1\u0108\2\uffff\1\u0109\1\u0106\1\u0107",
            "\1\u010a\2\uffff\1\u010b\2\uffff\1\u010c\1\u010d",
            "\1\u0110\1\u0111\1\u010e\1\u010f",
            "\1\u0112\2\uffff\1\u0113\1\u0114\1\u0115",
            "\1\u0118\2\uffff\1\u0119\2\uffff\1\u0116\1\u0117",
            "\1\u011a\1\u011b\1\u011c\1\u011d",
            "\1\u0120\2\uffff\1\u0121\4\uffff\1\u011e\1\u011f",
            "\1\u0122\1\uffff\1\u0123",
            "\1\u0124\1\uffff\1\u0125",
            "\1\u0126\1\uffff\1\u0127",
            "\1\u0128\1\uffff\1\u0129",
            "\1\u012a\1\uffff\1\u012b",
            "\1\u012c\1\uffff\1\u012d",
            "\1\u012e\1\uffff\1\u012f",
            "\1\u0130\1\uffff\1\u0131",
            "\1\u0132\1\uffff\1\u0133",
            "\1\u0134\1\uffff\1\u0135",
            "\1\u0136\1\uffff\1\u0137",
            "\1\u0138\1\uffff\1\u0139",
            "\1\u013a\1\uffff\1\u013b",
            "\1\u013c\1\uffff\1\u013d",
            "\1\u013e\1\uffff\1\u013f",
            "\1\u0140\1\uffff\1\u0141",
            "\1\u0142\1\uffff\1\u0143",
            "\1\u0144\1\uffff\1\u0145",
            "\1\u0146\1\uffff\1\u0147",
            "\1\u0148\1\uffff\1\u0149",
            "\1\u014a\1\uffff\1\u014b",
            "\1\u014c\1\uffff\1\u014d",
            "\1\u014e\1\uffff\1\u014f",
            "\1\u0150\1\uffff\1\u0151",
            "\1\u0152\1\uffff\1\u0153",
            "\1\u0154\1\uffff\1\u0155",
            "\1\u0156\1\uffff\1\u0157",
            "\1\u0158\1\uffff\1\u0159",
            "\1\u015a\1\uffff\1\u015b",
            "\1\u015c\1\uffff\1\u015d",
            "\1\u015e\1\uffff\1\u015f",
            "\1\u0160\1\uffff\1\u0161",
            "\1\u0162\1\uffff\1\u0163",
            "\1\u0164\1\uffff\1\u0165",
            "\1\u0166\1\uffff\1\u0167",
            "\1\u0168\1\uffff\1\u0169",
            "\1\u016a\1\uffff\1\u016b",
            "\1\u016c\1\uffff\1\u016d",
            "\1\u016e\1\uffff\1\u016f",
            "\1\u0170\1\uffff\1\u0171",
            "\1\u0172\1\uffff\1\u0173",
            "\1\u0174\1\uffff\1\u0175",
            "\1\u0176\1\uffff\1\u0177",
            "\1\u0178\1\uffff\1\u0179",
            "\1\u017a\1\uffff\1\u017b",
            "\1\u017c\1\uffff\1\u017d",
            "\1\u017e\1\uffff\1\u017f",
            "\1\u0180\1\uffff\1\u0181",
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
            "\1\u01b2\1\u01b3",
            "\1\u01b4\1\u01b5",
            "\1\u01b6\1\u01b7",
            "\1\u01b8\1\u01b9",
            "\1\u01ba\1\u01bb",
            "\1\u01bc\1\u01bd",
            "\1\u01be\1\u01bf",
            "\1\u01c0\1\u01c1",
            "\1\u01c2\1\u01c3",
            "\1\u01c4\1\u01c5",
            "\1\u01c6\1\u01c7",
            "\1\u01c8\1\u01c9",
            "\1\u01ca\1\u01cb",
            "\1\u01cc\1\u01cd",
            "\1\u01ce\1\u01cf",
            "\1\u01d0\1\u01d1",
            "\1\u01d2\1\u01d3",
            "\1\u01d4\1\u01d5",
            "\1\u01d6\1\u01d7",
            "\1\u01d8\1\u01d9",
            "\1\u01da\1\u01db",
            "\1\u01dc\1\u01dd",
            "\1\u01de\1\u01df",
            "\1\u01e0\1\u01e1",
            "\1\u01e2\1\u01e3",
            "\1\u01e4\1\u01e5",
            "\1\u01e6\1\u01e7",
            "\1\u01e8\1\u01e9",
            "\1\u01ea\1\u01eb",
            "\1\u01ec\1\u01ed",
            "\1\u01ee\1\u01ef",
            "\1\u01f0\1\u01f1",
            "\1\u01f2\1\u01f3",
            "\1\u01f4\1\u01f5",
            "\1\u01f6\1\u01f7",
            "\1\u01f8\1\u01f9",
            "\1\u01fa\1\u01fb",
            "\1\u01fc\1\u01fd",
            "\1\u01fe\1\u01ff",
            "\1\u0200\1\u0201",
            "\1\u0202\1\u0203",
            "\1\u0204\1\u0205",
            "\1\u0206\1\u0207",
            "\1\u0208\1\u0209",
            "\1\u020a\1\u020b",
            "\1\u020c\1\u020d",
            "\1\u020e\1\u020f",
            "\1\u0210\1\u0211",
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
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\10\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
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

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "2303:2: (this_Parallele2_0= ruleParallele2 | this_Parallele3_1= ruleParallele3 | this_Parallele4_2= ruleParallele4 )";
        }
    }
    static final String dfa_15s = "\111\uffff";
    static final String dfa_16s = "\1\34\10\5\20\35\10\6\20\36\10\54\1\40\3\34\14\uffff";
    static final String dfa_17s = "\1\45\10\7\20\35\10\7\20\36\10\54\2\45\1\43\1\45\14\uffff";
    static final String dfa_18s = "\75\uffff\1\1\1\3\1\2\1\5\1\4\1\6\1\7\1\11\1\10\1\13\1\12\1\14";
    static final String dfa_19s = "\111\uffff}>";
    static final String[] dfa_20s = {
            "\1\1\2\uffff\1\2\1\7\1\10\1\3\1\4\1\5\1\6",
            "\1\11\1\uffff\1\12",
            "\1\13\1\uffff\1\14",
            "\1\15\1\uffff\1\16",
            "\1\17\1\uffff\1\20",
            "\1\21\1\uffff\1\22",
            "\1\23\1\uffff\1\24",
            "\1\25\1\uffff\1\26",
            "\1\27\1\uffff\1\30",
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
            "\1\41\1\42",
            "\1\43\1\44",
            "\1\45\1\46",
            "\1\47\1\50",
            "\1\51\1\52",
            "\1\53\1\54",
            "\1\55\1\56",
            "\1\57\1\60",
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
            "\2\77\2\75\2\76",
            "\1\100\2\uffff\1\100\2\101\2\uffff\2\102",
            "\1\103\2\uffff\1\103\2\105\2\104",
            "\1\107\2\uffff\1\107\2\uffff\2\110\2\106",
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

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_15;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "2348:2: ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) )";
        }
    }
    static final String dfa_21s = "\u0109\uffff";
    static final String dfa_22s = "\1\34\10\5\20\35\10\6\20\36\10\54\2\34\1\40\1\34\30\5\60\35\30\6\60\36\30\54\1\42\4\34\2\40\1\42\1\40\2\34\1\40\30\uffff";
    static final String dfa_23s = "\1\45\10\7\20\35\10\7\20\36\10\54\3\45\1\43\30\7\60\35\30\7\60\36\30\54\2\45\1\43\1\41\2\45\1\43\2\45\1\43\1\41\1\43\30\uffff";
    static final String dfa_24s = "\u00f1\uffff\1\3\1\4\1\2\1\1\1\5\1\6\1\13\1\14\1\10\1\7\1\11\1\12\1\22\1\21\1\15\1\16\1\17\1\20\1\23\1\24\1\30\1\27\1\25\1\26";
    static final String dfa_25s = "\u0109\uffff}>";
    static final String[] dfa_26s = {
            "\1\5\2\uffff\1\6\1\1\1\2\1\3\1\4\1\7\1\10",
            "\1\11\1\uffff\1\12",
            "\1\13\1\uffff\1\14",
            "\1\15\1\uffff\1\16",
            "\1\17\1\uffff\1\20",
            "\1\21\1\uffff\1\22",
            "\1\23\1\uffff\1\24",
            "\1\25\1\uffff\1\26",
            "\1\27\1\uffff\1\30",
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
            "\1\41\1\42",
            "\1\43\1\44",
            "\1\45\1\46",
            "\1\47\1\50",
            "\1\51\1\52",
            "\1\53\1\54",
            "\1\55\1\56",
            "\1\57\1\60",
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
            "\1\75\2\uffff\1\76\2\uffff\1\77\1\100\1\101\1\102",
            "\1\107\2\uffff\1\110\1\105\1\106\2\uffff\1\103\1\104",
            "\1\113\1\114\1\115\1\116\1\111\1\112",
            "\1\123\2\uffff\1\124\1\117\1\120\1\121\1\122",
            "\1\125\1\uffff\1\126",
            "\1\127\1\uffff\1\130",
            "\1\131\1\uffff\1\132",
            "\1\133\1\uffff\1\134",
            "\1\135\1\uffff\1\136",
            "\1\137\1\uffff\1\140",
            "\1\141\1\uffff\1\142",
            "\1\143\1\uffff\1\144",
            "\1\145\1\uffff\1\146",
            "\1\147\1\uffff\1\150",
            "\1\151\1\uffff\1\152",
            "\1\153\1\uffff\1\154",
            "\1\155\1\uffff\1\156",
            "\1\157\1\uffff\1\160",
            "\1\161\1\uffff\1\162",
            "\1\163\1\uffff\1\164",
            "\1\165\1\uffff\1\166",
            "\1\167\1\uffff\1\170",
            "\1\171\1\uffff\1\172",
            "\1\173\1\uffff\1\174",
            "\1\175\1\uffff\1\176",
            "\1\177\1\uffff\1\u0080",
            "\1\u0081\1\uffff\1\u0082",
            "\1\u0083\1\uffff\1\u0084",
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
            "\1\u009d\1\u009e",
            "\1\u009f\1\u00a0",
            "\1\u00a1\1\u00a2",
            "\1\u00a3\1\u00a4",
            "\1\u00a5\1\u00a6",
            "\1\u00a7\1\u00a8",
            "\1\u00a9\1\u00aa",
            "\1\u00ab\1\u00ac",
            "\1\u00ad\1\u00ae",
            "\1\u00af\1\u00b0",
            "\1\u00b1\1\u00b2",
            "\1\u00b3\1\u00b4",
            "\1\u00b5\1\u00b6",
            "\1\u00b7\1\u00b8",
            "\1\u00b9\1\u00ba",
            "\1\u00bb\1\u00bc",
            "\1\u00bd\1\u00be",
            "\1\u00bf\1\u00c0",
            "\1\u00c1\1\u00c2",
            "\1\u00c3\1\u00c4",
            "\1\u00c5\1\u00c6",
            "\1\u00c7\1\u00c8",
            "\1\u00c9\1\u00ca",
            "\1\u00cb\1\u00cc",
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
            "\2\u00f1\2\u00f2",
            "\1\u00f4\2\uffff\1\u00f4\4\uffff\2\u00f3",
            "\1\u00f5\2\uffff\1\u00f5\2\uffff\2\u00f6",
            "\1\u00f8\2\uffff\1\u00f8\2\u00f7",
            "\1\u00fa\2\uffff\1\u00fa\4\uffff\2\u00f9",
            "\2\u00fb\2\uffff\2\u00fc",
            "\2\u00fd\2\u00fe",
            "\2\u00ff\2\u0100",
            "\2\u0101\2\uffff\2\u0102",
            "\1\u0103\2\uffff\1\u0103\2\uffff\2\u0104",
            "\1\u0106\2\uffff\1\u0106\2\u0105",
            "\2\u0107\2\u0108",
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

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_21;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "2906:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) )";
        }
    }
    static final String dfa_27s = "\1\34\10\5\20\35\10\6\20\36\10\54\2\34\1\40\1\34\30\5\60\35\30\6\60\36\30\54\1\34\1\42\2\34\1\40\1\34\2\40\1\42\2\34\1\40\30\uffff";
    static final String dfa_28s = "\1\45\10\7\20\35\10\7\20\36\10\54\3\45\1\43\30\7\60\35\30\7\60\36\30\54\2\45\1\43\2\45\1\41\1\45\1\43\1\45\1\41\2\43\30\uffff";
    static final String dfa_29s = "\u00f1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\10\1\7\1\11\1\12\1\13\1\14\1\20\1\17\1\21\1\22\1\15\1\16\1\30\1\27\1\23\1\24\1\25\1\26";
    static final String[] dfa_30s = {
            "\1\5\2\uffff\1\6\1\1\1\2\1\3\1\4\1\7\1\10",
            "\1\11\1\uffff\1\12",
            "\1\13\1\uffff\1\14",
            "\1\15\1\uffff\1\16",
            "\1\17\1\uffff\1\20",
            "\1\21\1\uffff\1\22",
            "\1\23\1\uffff\1\24",
            "\1\25\1\uffff\1\26",
            "\1\27\1\uffff\1\30",
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
            "\1\41\1\42",
            "\1\43\1\44",
            "\1\45\1\46",
            "\1\47\1\50",
            "\1\51\1\52",
            "\1\53\1\54",
            "\1\55\1\56",
            "\1\57\1\60",
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
            "\1\105\2\uffff\1\106\1\103\1\104\2\uffff\1\107\1\110",
            "\1\115\1\116\1\111\1\112\1\113\1\114",
            "\1\123\2\uffff\1\124\1\121\1\122\1\117\1\120",
            "\1\125\1\uffff\1\126",
            "\1\127\1\uffff\1\130",
            "\1\131\1\uffff\1\132",
            "\1\133\1\uffff\1\134",
            "\1\135\1\uffff\1\136",
            "\1\137\1\uffff\1\140",
            "\1\141\1\uffff\1\142",
            "\1\143\1\uffff\1\144",
            "\1\145\1\uffff\1\146",
            "\1\147\1\uffff\1\150",
            "\1\151\1\uffff\1\152",
            "\1\153\1\uffff\1\154",
            "\1\155\1\uffff\1\156",
            "\1\157\1\uffff\1\160",
            "\1\161\1\uffff\1\162",
            "\1\163\1\uffff\1\164",
            "\1\165\1\uffff\1\166",
            "\1\167\1\uffff\1\170",
            "\1\171\1\uffff\1\172",
            "\1\173\1\uffff\1\174",
            "\1\175\1\uffff\1\176",
            "\1\177\1\uffff\1\u0080",
            "\1\u0081\1\uffff\1\u0082",
            "\1\u0083\1\uffff\1\u0084",
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
            "\1\u009d\1\u009e",
            "\1\u009f\1\u00a0",
            "\1\u00a1\1\u00a2",
            "\1\u00a3\1\u00a4",
            "\1\u00a5\1\u00a6",
            "\1\u00a7\1\u00a8",
            "\1\u00a9\1\u00aa",
            "\1\u00ab\1\u00ac",
            "\1\u00ad\1\u00ae",
            "\1\u00af\1\u00b0",
            "\1\u00b1\1\u00b2",
            "\1\u00b3\1\u00b4",
            "\1\u00b5\1\u00b6",
            "\1\u00b7\1\u00b8",
            "\1\u00b9\1\u00ba",
            "\1\u00bb\1\u00bc",
            "\1\u00bd\1\u00be",
            "\1\u00bf\1\u00c0",
            "\1\u00c1\1\u00c2",
            "\1\u00c3\1\u00c4",
            "\1\u00c5\1\u00c6",
            "\1\u00c7\1\u00c8",
            "\1\u00c9\1\u00ca",
            "\1\u00cb\1\u00cc",
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
            "\1\u00f8\2\uffff\1\u00f8\4\uffff\2\u00f7",
            "\2\u00f9\2\uffff\2\u00fa",
            "\1\u00fc\2\uffff\1\u00fc\2\u00fb",
            "\2\u00fe\2\uffff\2\u00fd",
            "\2\u0100\2\u00ff",
            "\2\u0101\2\u0102",
            "\1\u0104\2\uffff\1\u0104\2\u0103",
            "\1\u0105\2\uffff\1\u0105\2\uffff\2\u0106",
            "\2\u0107\2\u0108",
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

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_21;
            this.eof = dfa_21;
            this.min = dfa_27;
            this.max = dfa_28;
            this.accept = dfa_29;
            this.special = dfa_25;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "4556:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) ) | ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) ) | ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) ) | ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) ) | ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) ) | ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) ) | ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) ) | ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) ) | ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) ) | ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) ) | ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) ) | ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) ) | ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) ) | ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) ) | ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) ) | ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) ) | ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) ) | ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) ) | ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) ) | ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) ) | ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) ) | ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) ) | ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) ) | ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000047F9E800080L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000007F9E800080L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000090000000L});

}
