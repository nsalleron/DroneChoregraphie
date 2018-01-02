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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INCLUDE", "RULE_SECONDE", "RULE_POURCENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'<'", "'>'", "'define'", "'vitesse_hauteur_max'", "'vitesse_deplacement_max'", "'vitesse_rotation_max'", "'hauteur_max'", "'eloignement_max'", "'Seconde'", "'='", "'Pourcent'", "'decoller()'", "'atterrir()'", "'monter('", "','", "')'", "'descendre('", "'avancer('", "'reculer('", "'gauche('", "'droite('", "'rotation_gauche('", "'rotation_droite('", "'func'", "'()'", "'{'", "'}'", "'main'", "'&'"
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

                if ( (LA2_0==38) ) {
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
    // InternalDroneDSL.g:1045:1: ruleMonter returns [EObject current=null] : (otherlv_0= 'monter(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_verticale_3_0= rulePourcentExp ) ) otherlv_4= ')' ) ;
    public final EObject ruleMonter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duree_1_0 = null;

        EObject lv_vitesse_verticale_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1051:2: ( (otherlv_0= 'monter(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_verticale_3_0= rulePourcentExp ) ) otherlv_4= ')' ) )
            // InternalDroneDSL.g:1052:2: (otherlv_0= 'monter(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_verticale_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            {
            // InternalDroneDSL.g:1052:2: (otherlv_0= 'monter(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_verticale_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            // InternalDroneDSL.g:1053:3: otherlv_0= 'monter(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_verticale_3_0= rulePourcentExp ) ) otherlv_4= ')'
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
            		
            // InternalDroneDSL.g:1080:3: ( (lv_vitesse_verticale_3_0= rulePourcentExp ) )
            // InternalDroneDSL.g:1081:4: (lv_vitesse_verticale_3_0= rulePourcentExp )
            {
            // InternalDroneDSL.g:1081:4: (lv_vitesse_verticale_3_0= rulePourcentExp )
            // InternalDroneDSL.g:1082:5: lv_vitesse_verticale_3_0= rulePourcentExp
            {

            					newCompositeNode(grammarAccess.getMonterAccess().getVitesse_verticalePourcentExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_vitesse_verticale_3_0=rulePourcentExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMonterRule());
            					}
            					set(
            						current,
            						"vitesse_verticale",
            						lv_vitesse_verticale_3_0,
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
    // InternalDroneDSL.g:1114:1: ruleDescendre returns [EObject current=null] : (otherlv_0= 'descendre(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_verticale_3_0= rulePourcentExp ) ) otherlv_4= ')' ) ;
    public final EObject ruleDescendre() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duree_1_0 = null;

        EObject lv_vitesse_verticale_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1120:2: ( (otherlv_0= 'descendre(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_verticale_3_0= rulePourcentExp ) ) otherlv_4= ')' ) )
            // InternalDroneDSL.g:1121:2: (otherlv_0= 'descendre(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_verticale_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            {
            // InternalDroneDSL.g:1121:2: (otherlv_0= 'descendre(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_verticale_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            // InternalDroneDSL.g:1122:3: otherlv_0= 'descendre(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_verticale_3_0= rulePourcentExp ) ) otherlv_4= ')'
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
            		
            // InternalDroneDSL.g:1149:3: ( (lv_vitesse_verticale_3_0= rulePourcentExp ) )
            // InternalDroneDSL.g:1150:4: (lv_vitesse_verticale_3_0= rulePourcentExp )
            {
            // InternalDroneDSL.g:1150:4: (lv_vitesse_verticale_3_0= rulePourcentExp )
            // InternalDroneDSL.g:1151:5: lv_vitesse_verticale_3_0= rulePourcentExp
            {

            					newCompositeNode(grammarAccess.getDescendreAccess().getVitesse_verticalePourcentExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_vitesse_verticale_3_0=rulePourcentExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDescendreRule());
            					}
            					set(
            						current,
            						"vitesse_verticale",
            						lv_vitesse_verticale_3_0,
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
    // InternalDroneDSL.g:1183:1: ruleAvancer returns [EObject current=null] : (otherlv_0= 'avancer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_deplacement_3_0= rulePourcentExp ) ) otherlv_4= ')' ) ;
    public final EObject ruleAvancer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duree_1_0 = null;

        EObject lv_vitesse_deplacement_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1189:2: ( (otherlv_0= 'avancer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_deplacement_3_0= rulePourcentExp ) ) otherlv_4= ')' ) )
            // InternalDroneDSL.g:1190:2: (otherlv_0= 'avancer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_deplacement_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            {
            // InternalDroneDSL.g:1190:2: (otherlv_0= 'avancer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_deplacement_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            // InternalDroneDSL.g:1191:3: otherlv_0= 'avancer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_deplacement_3_0= rulePourcentExp ) ) otherlv_4= ')'
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
            		
            // InternalDroneDSL.g:1218:3: ( (lv_vitesse_deplacement_3_0= rulePourcentExp ) )
            // InternalDroneDSL.g:1219:4: (lv_vitesse_deplacement_3_0= rulePourcentExp )
            {
            // InternalDroneDSL.g:1219:4: (lv_vitesse_deplacement_3_0= rulePourcentExp )
            // InternalDroneDSL.g:1220:5: lv_vitesse_deplacement_3_0= rulePourcentExp
            {

            					newCompositeNode(grammarAccess.getAvancerAccess().getVitesse_deplacementPourcentExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_vitesse_deplacement_3_0=rulePourcentExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAvancerRule());
            					}
            					set(
            						current,
            						"vitesse_deplacement",
            						lv_vitesse_deplacement_3_0,
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
    // InternalDroneDSL.g:1252:1: ruleReculer returns [EObject current=null] : (otherlv_0= 'reculer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_deplacement_3_0= rulePourcentExp ) ) otherlv_4= ')' ) ;
    public final EObject ruleReculer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duree_1_0 = null;

        EObject lv_vitesse_deplacement_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1258:2: ( (otherlv_0= 'reculer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_deplacement_3_0= rulePourcentExp ) ) otherlv_4= ')' ) )
            // InternalDroneDSL.g:1259:2: (otherlv_0= 'reculer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_deplacement_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            {
            // InternalDroneDSL.g:1259:2: (otherlv_0= 'reculer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_deplacement_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            // InternalDroneDSL.g:1260:3: otherlv_0= 'reculer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_deplacement_3_0= rulePourcentExp ) ) otherlv_4= ')'
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
            		
            // InternalDroneDSL.g:1287:3: ( (lv_vitesse_deplacement_3_0= rulePourcentExp ) )
            // InternalDroneDSL.g:1288:4: (lv_vitesse_deplacement_3_0= rulePourcentExp )
            {
            // InternalDroneDSL.g:1288:4: (lv_vitesse_deplacement_3_0= rulePourcentExp )
            // InternalDroneDSL.g:1289:5: lv_vitesse_deplacement_3_0= rulePourcentExp
            {

            					newCompositeNode(grammarAccess.getReculerAccess().getVitesse_deplacementPourcentExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_vitesse_deplacement_3_0=rulePourcentExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReculerRule());
            					}
            					set(
            						current,
            						"vitesse_deplacement",
            						lv_vitesse_deplacement_3_0,
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
    // InternalDroneDSL.g:1321:1: ruleGauche returns [EObject current=null] : (otherlv_0= 'gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_deplacement_3_0= rulePourcentExp ) ) otherlv_4= ')' ) ;
    public final EObject ruleGauche() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duree_1_0 = null;

        EObject lv_vitesse_deplacement_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1327:2: ( (otherlv_0= 'gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_deplacement_3_0= rulePourcentExp ) ) otherlv_4= ')' ) )
            // InternalDroneDSL.g:1328:2: (otherlv_0= 'gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_deplacement_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            {
            // InternalDroneDSL.g:1328:2: (otherlv_0= 'gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_deplacement_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            // InternalDroneDSL.g:1329:3: otherlv_0= 'gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_deplacement_3_0= rulePourcentExp ) ) otherlv_4= ')'
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
            		
            // InternalDroneDSL.g:1356:3: ( (lv_vitesse_deplacement_3_0= rulePourcentExp ) )
            // InternalDroneDSL.g:1357:4: (lv_vitesse_deplacement_3_0= rulePourcentExp )
            {
            // InternalDroneDSL.g:1357:4: (lv_vitesse_deplacement_3_0= rulePourcentExp )
            // InternalDroneDSL.g:1358:5: lv_vitesse_deplacement_3_0= rulePourcentExp
            {

            					newCompositeNode(grammarAccess.getGaucheAccess().getVitesse_deplacementPourcentExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_vitesse_deplacement_3_0=rulePourcentExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGaucheRule());
            					}
            					set(
            						current,
            						"vitesse_deplacement",
            						lv_vitesse_deplacement_3_0,
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
    // InternalDroneDSL.g:1390:1: ruleDroite returns [EObject current=null] : (otherlv_0= 'droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_deplacement_3_0= rulePourcentExp ) ) otherlv_4= ')' ) ;
    public final EObject ruleDroite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duree_1_0 = null;

        EObject lv_vitesse_deplacement_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1396:2: ( (otherlv_0= 'droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_deplacement_3_0= rulePourcentExp ) ) otherlv_4= ')' ) )
            // InternalDroneDSL.g:1397:2: (otherlv_0= 'droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_deplacement_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            {
            // InternalDroneDSL.g:1397:2: (otherlv_0= 'droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_deplacement_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            // InternalDroneDSL.g:1398:3: otherlv_0= 'droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_deplacement_3_0= rulePourcentExp ) ) otherlv_4= ')'
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
            		
            // InternalDroneDSL.g:1425:3: ( (lv_vitesse_deplacement_3_0= rulePourcentExp ) )
            // InternalDroneDSL.g:1426:4: (lv_vitesse_deplacement_3_0= rulePourcentExp )
            {
            // InternalDroneDSL.g:1426:4: (lv_vitesse_deplacement_3_0= rulePourcentExp )
            // InternalDroneDSL.g:1427:5: lv_vitesse_deplacement_3_0= rulePourcentExp
            {

            					newCompositeNode(grammarAccess.getDroiteAccess().getVitesse_deplacementPourcentExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_vitesse_deplacement_3_0=rulePourcentExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDroiteRule());
            					}
            					set(
            						current,
            						"vitesse_deplacement",
            						lv_vitesse_deplacement_3_0,
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
    // InternalDroneDSL.g:1459:1: ruleRotationGauche returns [EObject current=null] : (otherlv_0= 'rotation_gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_rotation_3_0= rulePourcentExp ) ) otherlv_4= ')' ) ;
    public final EObject ruleRotationGauche() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duree_1_0 = null;

        EObject lv_vitesse_rotation_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1465:2: ( (otherlv_0= 'rotation_gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_rotation_3_0= rulePourcentExp ) ) otherlv_4= ')' ) )
            // InternalDroneDSL.g:1466:2: (otherlv_0= 'rotation_gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_rotation_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            {
            // InternalDroneDSL.g:1466:2: (otherlv_0= 'rotation_gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_rotation_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            // InternalDroneDSL.g:1467:3: otherlv_0= 'rotation_gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_rotation_3_0= rulePourcentExp ) ) otherlv_4= ')'
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
            		
            // InternalDroneDSL.g:1494:3: ( (lv_vitesse_rotation_3_0= rulePourcentExp ) )
            // InternalDroneDSL.g:1495:4: (lv_vitesse_rotation_3_0= rulePourcentExp )
            {
            // InternalDroneDSL.g:1495:4: (lv_vitesse_rotation_3_0= rulePourcentExp )
            // InternalDroneDSL.g:1496:5: lv_vitesse_rotation_3_0= rulePourcentExp
            {

            					newCompositeNode(grammarAccess.getRotationGaucheAccess().getVitesse_rotationPourcentExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_vitesse_rotation_3_0=rulePourcentExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotationGaucheRule());
            					}
            					set(
            						current,
            						"vitesse_rotation",
            						lv_vitesse_rotation_3_0,
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
    // InternalDroneDSL.g:1528:1: ruleRotationDroite returns [EObject current=null] : (otherlv_0= 'rotation_droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_rotation_3_0= rulePourcentExp ) ) otherlv_4= ')' ) ;
    public final EObject ruleRotationDroite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duree_1_0 = null;

        EObject lv_vitesse_rotation_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1534:2: ( (otherlv_0= 'rotation_droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_rotation_3_0= rulePourcentExp ) ) otherlv_4= ')' ) )
            // InternalDroneDSL.g:1535:2: (otherlv_0= 'rotation_droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_rotation_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            {
            // InternalDroneDSL.g:1535:2: (otherlv_0= 'rotation_droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_rotation_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            // InternalDroneDSL.g:1536:3: otherlv_0= 'rotation_droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_rotation_3_0= rulePourcentExp ) ) otherlv_4= ')'
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
            		
            // InternalDroneDSL.g:1563:3: ( (lv_vitesse_rotation_3_0= rulePourcentExp ) )
            // InternalDroneDSL.g:1564:4: (lv_vitesse_rotation_3_0= rulePourcentExp )
            {
            // InternalDroneDSL.g:1564:4: (lv_vitesse_rotation_3_0= rulePourcentExp )
            // InternalDroneDSL.g:1565:5: lv_vitesse_rotation_3_0= rulePourcentExp
            {

            					newCompositeNode(grammarAccess.getRotationDroiteAccess().getVitesse_rotationPourcentExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_vitesse_rotation_3_0=rulePourcentExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotationDroiteRule());
            					}
            					set(
            						current,
            						"vitesse_rotation",
            						lv_vitesse_rotation_3_0,
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
    // InternalDroneDSL.g:1597:1: rulePause returns [EObject current=null] : (otherlv_0= 'droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ')' ) ;
    public final EObject rulePause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_duree_1_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1603:2: ( (otherlv_0= 'droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ')' ) )
            // InternalDroneDSL.g:1604:2: (otherlv_0= 'droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ')' )
            {
            // InternalDroneDSL.g:1604:2: (otherlv_0= 'droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ')' )
            // InternalDroneDSL.g:1605:3: otherlv_0= 'droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getPauseAccess().getDroiteKeyword_0());
            		
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


    // $ANTLR start "entryRuleCommandeBasique"
    // InternalDroneDSL.g:1636:1: entryRuleCommandeBasique returns [EObject current=null] : iv_ruleCommandeBasique= ruleCommandeBasique EOF ;
    public final EObject entryRuleCommandeBasique() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandeBasique = null;


        try {
            // InternalDroneDSL.g:1636:56: (iv_ruleCommandeBasique= ruleCommandeBasique EOF )
            // InternalDroneDSL.g:1637:2: iv_ruleCommandeBasique= ruleCommandeBasique EOF
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
    // InternalDroneDSL.g:1643:1: ruleCommandeBasique returns [EObject current=null] : (this_Decoller_0= ruleDecoller | this_Atterrir_1= ruleAtterrir | this_Avancer_2= ruleAvancer | this_Reculer_3= ruleReculer | this_Monter_4= ruleMonter | this_Descendre_5= ruleDescendre | this_Gauche_6= ruleGauche | this_Droite_7= ruleDroite | this_RotationGauche_8= ruleRotationGauche | this_RotationDroite_9= ruleRotationDroite | this_Pause_10= rulePause ) ;
    public final EObject ruleCommandeBasique() throws RecognitionException {
        EObject current = null;

        EObject this_Decoller_0 = null;

        EObject this_Atterrir_1 = null;

        EObject this_Avancer_2 = null;

        EObject this_Reculer_3 = null;

        EObject this_Monter_4 = null;

        EObject this_Descendre_5 = null;

        EObject this_Gauche_6 = null;

        EObject this_Droite_7 = null;

        EObject this_RotationGauche_8 = null;

        EObject this_RotationDroite_9 = null;

        EObject this_Pause_10 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1649:2: ( (this_Decoller_0= ruleDecoller | this_Atterrir_1= ruleAtterrir | this_Avancer_2= ruleAvancer | this_Reculer_3= ruleReculer | this_Monter_4= ruleMonter | this_Descendre_5= ruleDescendre | this_Gauche_6= ruleGauche | this_Droite_7= ruleDroite | this_RotationGauche_8= ruleRotationGauche | this_RotationDroite_9= ruleRotationDroite | this_Pause_10= rulePause ) )
            // InternalDroneDSL.g:1650:2: (this_Decoller_0= ruleDecoller | this_Atterrir_1= ruleAtterrir | this_Avancer_2= ruleAvancer | this_Reculer_3= ruleReculer | this_Monter_4= ruleMonter | this_Descendre_5= ruleDescendre | this_Gauche_6= ruleGauche | this_Droite_7= ruleDroite | this_RotationGauche_8= ruleRotationGauche | this_RotationDroite_9= ruleRotationDroite | this_Pause_10= rulePause )
            {
            // InternalDroneDSL.g:1650:2: (this_Decoller_0= ruleDecoller | this_Atterrir_1= ruleAtterrir | this_Avancer_2= ruleAvancer | this_Reculer_3= ruleReculer | this_Monter_4= ruleMonter | this_Descendre_5= ruleDescendre | this_Gauche_6= ruleGauche | this_Droite_7= ruleDroite | this_RotationGauche_8= ruleRotationGauche | this_RotationDroite_9= ruleRotationDroite | this_Pause_10= rulePause )
            int alt7=11;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalDroneDSL.g:1651:3: this_Decoller_0= ruleDecoller
                    {

                    			newCompositeNode(grammarAccess.getCommandeBasiqueAccess().getDecollerParserRuleCall_0());
                    		
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

                    			newCompositeNode(grammarAccess.getCommandeBasiqueAccess().getAtterrirParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Atterrir_1=ruleAtterrir();

                    state._fsp--;


                    			current = this_Atterrir_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDroneDSL.g:1669:3: this_Avancer_2= ruleAvancer
                    {

                    			newCompositeNode(grammarAccess.getCommandeBasiqueAccess().getAvancerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Avancer_2=ruleAvancer();

                    state._fsp--;


                    			current = this_Avancer_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDroneDSL.g:1678:3: this_Reculer_3= ruleReculer
                    {

                    			newCompositeNode(grammarAccess.getCommandeBasiqueAccess().getReculerParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reculer_3=ruleReculer();

                    state._fsp--;


                    			current = this_Reculer_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDroneDSL.g:1687:3: this_Monter_4= ruleMonter
                    {

                    			newCompositeNode(grammarAccess.getCommandeBasiqueAccess().getMonterParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Monter_4=ruleMonter();

                    state._fsp--;


                    			current = this_Monter_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalDroneDSL.g:1696:3: this_Descendre_5= ruleDescendre
                    {

                    			newCompositeNode(grammarAccess.getCommandeBasiqueAccess().getDescendreParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Descendre_5=ruleDescendre();

                    state._fsp--;


                    			current = this_Descendre_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalDroneDSL.g:1705:3: this_Gauche_6= ruleGauche
                    {

                    			newCompositeNode(grammarAccess.getCommandeBasiqueAccess().getGaucheParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Gauche_6=ruleGauche();

                    state._fsp--;


                    			current = this_Gauche_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalDroneDSL.g:1714:3: this_Droite_7= ruleDroite
                    {

                    			newCompositeNode(grammarAccess.getCommandeBasiqueAccess().getDroiteParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Droite_7=ruleDroite();

                    state._fsp--;


                    			current = this_Droite_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalDroneDSL.g:1723:3: this_RotationGauche_8= ruleRotationGauche
                    {

                    			newCompositeNode(grammarAccess.getCommandeBasiqueAccess().getRotationGaucheParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_RotationGauche_8=ruleRotationGauche();

                    state._fsp--;


                    			current = this_RotationGauche_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalDroneDSL.g:1732:3: this_RotationDroite_9= ruleRotationDroite
                    {

                    			newCompositeNode(grammarAccess.getCommandeBasiqueAccess().getRotationDroiteParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_RotationDroite_9=ruleRotationDroite();

                    state._fsp--;


                    			current = this_RotationDroite_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalDroneDSL.g:1741:3: this_Pause_10= rulePause
                    {

                    			newCompositeNode(grammarAccess.getCommandeBasiqueAccess().getPauseParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_Pause_10=rulePause();

                    state._fsp--;


                    			current = this_Pause_10;
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
    // InternalDroneDSL.g:1753:1: entryRuleFonctionDecl returns [EObject current=null] : iv_ruleFonctionDecl= ruleFonctionDecl EOF ;
    public final EObject entryRuleFonctionDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFonctionDecl = null;


        try {
            // InternalDroneDSL.g:1753:53: (iv_ruleFonctionDecl= ruleFonctionDecl EOF )
            // InternalDroneDSL.g:1754:2: iv_ruleFonctionDecl= ruleFonctionDecl EOF
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
    // InternalDroneDSL.g:1760:1: ruleFonctionDecl returns [EObject current=null] : (otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= '{' ( ( (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall ) ) )* otherlv_5= '}' ) ;
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



        	enterRule();

        try {
            // InternalDroneDSL.g:1766:2: ( (otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= '{' ( ( (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall ) ) )* otherlv_5= '}' ) )
            // InternalDroneDSL.g:1767:2: (otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= '{' ( ( (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall ) ) )* otherlv_5= '}' )
            {
            // InternalDroneDSL.g:1767:2: (otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= '{' ( ( (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall ) ) )* otherlv_5= '}' )
            // InternalDroneDSL.g:1768:3: otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= '{' ( ( (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getFonctionDeclAccess().getFuncKeyword_0());
            		
            // InternalDroneDSL.g:1772:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDroneDSL.g:1773:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDroneDSL.g:1773:4: (lv_name_1_0= RULE_ID )
            // InternalDroneDSL.g:1774:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,39,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getFonctionDeclAccess().getLeftParenthesisRightParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,40,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getFonctionDeclAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDroneDSL.g:1798:3: ( ( (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==23||(LA9_0>=25 && LA9_0<=28)||(LA9_0>=31 && LA9_0<=37)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDroneDSL.g:1799:4: ( (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall ) )
            	    {
            	    // InternalDroneDSL.g:1799:4: ( (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall ) )
            	    // InternalDroneDSL.g:1800:5: (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall )
            	    {
            	    // InternalDroneDSL.g:1800:5: (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall )
            	    int alt8=4;
            	    alt8 = dfa8.predict(input);
            	    switch (alt8) {
            	        case 1 :
            	            // InternalDroneDSL.g:1801:6: lv_body_4_1= ruleVarDecl
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
            	            // InternalDroneDSL.g:1817:6: lv_body_4_2= ruleCommandeBasique
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
            	            // InternalDroneDSL.g:1833:6: lv_body_4_3= ruleParallele
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
            	            // InternalDroneDSL.g:1849:6: lv_body_4_4= ruleFonctionCall
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

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_5=(Token)match(input,41,FOLLOW_2); 

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
    // InternalDroneDSL.g:1875:1: entryRuleFinDeMain returns [EObject current=null] : iv_ruleFinDeMain= ruleFinDeMain EOF ;
    public final EObject entryRuleFinDeMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinDeMain = null;


        try {
            // InternalDroneDSL.g:1875:50: (iv_ruleFinDeMain= ruleFinDeMain EOF )
            // InternalDroneDSL.g:1876:2: iv_ruleFinDeMain= ruleFinDeMain EOF
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
    // InternalDroneDSL.g:1882:1: ruleFinDeMain returns [EObject current=null] : ( (lv_accolade_0_0= '}' ) ) ;
    public final EObject ruleFinDeMain() throws RecognitionException {
        EObject current = null;

        Token lv_accolade_0_0=null;


        	enterRule();

        try {
            // InternalDroneDSL.g:1888:2: ( ( (lv_accolade_0_0= '}' ) ) )
            // InternalDroneDSL.g:1889:2: ( (lv_accolade_0_0= '}' ) )
            {
            // InternalDroneDSL.g:1889:2: ( (lv_accolade_0_0= '}' ) )
            // InternalDroneDSL.g:1890:3: (lv_accolade_0_0= '}' )
            {
            // InternalDroneDSL.g:1890:3: (lv_accolade_0_0= '}' )
            // InternalDroneDSL.g:1891:4: lv_accolade_0_0= '}'
            {
            lv_accolade_0_0=(Token)match(input,41,FOLLOW_2); 

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
    // InternalDroneDSL.g:1906:1: entryRuleFonctionCall returns [EObject current=null] : iv_ruleFonctionCall= ruleFonctionCall EOF ;
    public final EObject entryRuleFonctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFonctionCall = null;


        try {
            // InternalDroneDSL.g:1906:53: (iv_ruleFonctionCall= ruleFonctionCall EOF )
            // InternalDroneDSL.g:1907:2: iv_ruleFonctionCall= ruleFonctionCall EOF
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
    // InternalDroneDSL.g:1913:1: ruleFonctionCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '()' ) ;
    public final EObject ruleFonctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDroneDSL.g:1919:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '()' ) )
            // InternalDroneDSL.g:1920:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '()' )
            {
            // InternalDroneDSL.g:1920:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '()' )
            // InternalDroneDSL.g:1921:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '()'
            {
            // InternalDroneDSL.g:1921:3: ( (otherlv_0= RULE_ID ) )
            // InternalDroneDSL.g:1922:4: (otherlv_0= RULE_ID )
            {
            // InternalDroneDSL.g:1922:4: (otherlv_0= RULE_ID )
            // InternalDroneDSL.g:1923:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFonctionCallRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_0, grammarAccess.getFonctionCallAccess().getRefFonctionDeclCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,39,FOLLOW_2); 

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
    // InternalDroneDSL.g:1942:1: entryRuleMain returns [EObject current=null] : iv_ruleMain= ruleMain EOF ;
    public final EObject entryRuleMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMain = null;


        try {
            // InternalDroneDSL.g:1942:45: (iv_ruleMain= ruleMain EOF )
            // InternalDroneDSL.g:1943:2: iv_ruleMain= ruleMain EOF
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
    // InternalDroneDSL.g:1949:1: ruleMain returns [EObject current=null] : (otherlv_0= 'main' otherlv_1= '{' ( (lv_decollage_2_0= ruleDecoller ) ) ( ( (lv_mainbody_3_1= ruleVarDecl | lv_mainbody_3_2= ruleCommandeBasique | lv_mainbody_3_3= ruleParallele | lv_mainbody_3_4= ruleFonctionCall ) ) )* ( (lv_atterrissage_4_0= ruleAtterrir ) ) ( (lv_fdm_5_0= ruleFinDeMain ) ) ) ;
    public final EObject ruleMain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_decollage_2_0 = null;

        EObject lv_mainbody_3_1 = null;

        EObject lv_mainbody_3_2 = null;

        EObject lv_mainbody_3_3 = null;

        EObject lv_mainbody_3_4 = null;

        EObject lv_atterrissage_4_0 = null;

        EObject lv_fdm_5_0 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:1955:2: ( (otherlv_0= 'main' otherlv_1= '{' ( (lv_decollage_2_0= ruleDecoller ) ) ( ( (lv_mainbody_3_1= ruleVarDecl | lv_mainbody_3_2= ruleCommandeBasique | lv_mainbody_3_3= ruleParallele | lv_mainbody_3_4= ruleFonctionCall ) ) )* ( (lv_atterrissage_4_0= ruleAtterrir ) ) ( (lv_fdm_5_0= ruleFinDeMain ) ) ) )
            // InternalDroneDSL.g:1956:2: (otherlv_0= 'main' otherlv_1= '{' ( (lv_decollage_2_0= ruleDecoller ) ) ( ( (lv_mainbody_3_1= ruleVarDecl | lv_mainbody_3_2= ruleCommandeBasique | lv_mainbody_3_3= ruleParallele | lv_mainbody_3_4= ruleFonctionCall ) ) )* ( (lv_atterrissage_4_0= ruleAtterrir ) ) ( (lv_fdm_5_0= ruleFinDeMain ) ) )
            {
            // InternalDroneDSL.g:1956:2: (otherlv_0= 'main' otherlv_1= '{' ( (lv_decollage_2_0= ruleDecoller ) ) ( ( (lv_mainbody_3_1= ruleVarDecl | lv_mainbody_3_2= ruleCommandeBasique | lv_mainbody_3_3= ruleParallele | lv_mainbody_3_4= ruleFonctionCall ) ) )* ( (lv_atterrissage_4_0= ruleAtterrir ) ) ( (lv_fdm_5_0= ruleFinDeMain ) ) )
            // InternalDroneDSL.g:1957:3: otherlv_0= 'main' otherlv_1= '{' ( (lv_decollage_2_0= ruleDecoller ) ) ( ( (lv_mainbody_3_1= ruleVarDecl | lv_mainbody_3_2= ruleCommandeBasique | lv_mainbody_3_3= ruleParallele | lv_mainbody_3_4= ruleFonctionCall ) ) )* ( (lv_atterrissage_4_0= ruleAtterrir ) ) ( (lv_fdm_5_0= ruleFinDeMain ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getMainAccess().getMainKeyword_0());
            		
            otherlv_1=(Token)match(input,40,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getMainAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDroneDSL.g:1965:3: ( (lv_decollage_2_0= ruleDecoller ) )
            // InternalDroneDSL.g:1966:4: (lv_decollage_2_0= ruleDecoller )
            {
            // InternalDroneDSL.g:1966:4: (lv_decollage_2_0= ruleDecoller )
            // InternalDroneDSL.g:1967:5: lv_decollage_2_0= ruleDecoller
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

            // InternalDroneDSL.g:1984:3: ( ( (lv_mainbody_3_1= ruleVarDecl | lv_mainbody_3_2= ruleCommandeBasique | lv_mainbody_3_3= ruleParallele | lv_mainbody_3_4= ruleFonctionCall ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==RULE_ID||LA11_1==23||(LA11_1>=25 && LA11_1<=28)||(LA11_1>=31 && LA11_1<=37)) ) {
                        alt11=1;
                    }


                }
                else if ( (LA11_0==RULE_ID||LA11_0==23||(LA11_0>=25 && LA11_0<=26)||LA11_0==28||(LA11_0>=31 && LA11_0<=37)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDroneDSL.g:1985:4: ( (lv_mainbody_3_1= ruleVarDecl | lv_mainbody_3_2= ruleCommandeBasique | lv_mainbody_3_3= ruleParallele | lv_mainbody_3_4= ruleFonctionCall ) )
            	    {
            	    // InternalDroneDSL.g:1985:4: ( (lv_mainbody_3_1= ruleVarDecl | lv_mainbody_3_2= ruleCommandeBasique | lv_mainbody_3_3= ruleParallele | lv_mainbody_3_4= ruleFonctionCall ) )
            	    // InternalDroneDSL.g:1986:5: (lv_mainbody_3_1= ruleVarDecl | lv_mainbody_3_2= ruleCommandeBasique | lv_mainbody_3_3= ruleParallele | lv_mainbody_3_4= ruleFonctionCall )
            	    {
            	    // InternalDroneDSL.g:1986:5: (lv_mainbody_3_1= ruleVarDecl | lv_mainbody_3_2= ruleCommandeBasique | lv_mainbody_3_3= ruleParallele | lv_mainbody_3_4= ruleFonctionCall )
            	    int alt10=4;
            	    alt10 = dfa10.predict(input);
            	    switch (alt10) {
            	        case 1 :
            	            // InternalDroneDSL.g:1987:6: lv_mainbody_3_1= ruleVarDecl
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
            	            // InternalDroneDSL.g:2003:6: lv_mainbody_3_2= ruleCommandeBasique
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
            	            // InternalDroneDSL.g:2019:6: lv_mainbody_3_3= ruleParallele
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
            	            // InternalDroneDSL.g:2035:6: lv_mainbody_3_4= ruleFonctionCall
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

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalDroneDSL.g:2053:3: ( (lv_atterrissage_4_0= ruleAtterrir ) )
            // InternalDroneDSL.g:2054:4: (lv_atterrissage_4_0= ruleAtterrir )
            {
            // InternalDroneDSL.g:2054:4: (lv_atterrissage_4_0= ruleAtterrir )
            // InternalDroneDSL.g:2055:5: lv_atterrissage_4_0= ruleAtterrir
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

            // InternalDroneDSL.g:2072:3: ( (lv_fdm_5_0= ruleFinDeMain ) )
            // InternalDroneDSL.g:2073:4: (lv_fdm_5_0= ruleFinDeMain )
            {
            // InternalDroneDSL.g:2073:4: (lv_fdm_5_0= ruleFinDeMain )
            // InternalDroneDSL.g:2074:5: lv_fdm_5_0= ruleFinDeMain
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
    // InternalDroneDSL.g:2095:1: entryRuleMD returns [EObject current=null] : iv_ruleMD= ruleMD EOF ;
    public final EObject entryRuleMD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMD = null;


        try {
            // InternalDroneDSL.g:2095:43: (iv_ruleMD= ruleMD EOF )
            // InternalDroneDSL.g:2096:2: iv_ruleMD= ruleMD EOF
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
    // InternalDroneDSL.g:2102:1: ruleMD returns [EObject current=null] : (this_Monter_0= ruleMonter | this_Descendre_1= ruleDescendre ) ;
    public final EObject ruleMD() throws RecognitionException {
        EObject current = null;

        EObject this_Monter_0 = null;

        EObject this_Descendre_1 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:2108:2: ( (this_Monter_0= ruleMonter | this_Descendre_1= ruleDescendre ) )
            // InternalDroneDSL.g:2109:2: (this_Monter_0= ruleMonter | this_Descendre_1= ruleDescendre )
            {
            // InternalDroneDSL.g:2109:2: (this_Monter_0= ruleMonter | this_Descendre_1= ruleDescendre )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            else if ( (LA12_0==31) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalDroneDSL.g:2110:3: this_Monter_0= ruleMonter
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
                    // InternalDroneDSL.g:2119:3: this_Descendre_1= ruleDescendre
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
    // InternalDroneDSL.g:2131:1: entryRuleGDr returns [EObject current=null] : iv_ruleGDr= ruleGDr EOF ;
    public final EObject entryRuleGDr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGDr = null;


        try {
            // InternalDroneDSL.g:2131:44: (iv_ruleGDr= ruleGDr EOF )
            // InternalDroneDSL.g:2132:2: iv_ruleGDr= ruleGDr EOF
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
    // InternalDroneDSL.g:2138:1: ruleGDr returns [EObject current=null] : (this_Gauche_0= ruleGauche | this_Droite_1= ruleDroite ) ;
    public final EObject ruleGDr() throws RecognitionException {
        EObject current = null;

        EObject this_Gauche_0 = null;

        EObject this_Droite_1 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:2144:2: ( (this_Gauche_0= ruleGauche | this_Droite_1= ruleDroite ) )
            // InternalDroneDSL.g:2145:2: (this_Gauche_0= ruleGauche | this_Droite_1= ruleDroite )
            {
            // InternalDroneDSL.g:2145:2: (this_Gauche_0= ruleGauche | this_Droite_1= ruleDroite )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==34) ) {
                alt13=1;
            }
            else if ( (LA13_0==35) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalDroneDSL.g:2146:3: this_Gauche_0= ruleGauche
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
                    // InternalDroneDSL.g:2155:3: this_Droite_1= ruleDroite
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
    // InternalDroneDSL.g:2167:1: entryRuleRGRD returns [EObject current=null] : iv_ruleRGRD= ruleRGRD EOF ;
    public final EObject entryRuleRGRD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRGRD = null;


        try {
            // InternalDroneDSL.g:2167:45: (iv_ruleRGRD= ruleRGRD EOF )
            // InternalDroneDSL.g:2168:2: iv_ruleRGRD= ruleRGRD EOF
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
    // InternalDroneDSL.g:2174:1: ruleRGRD returns [EObject current=null] : (this_RotationGauche_0= ruleRotationGauche | this_RotationDroite_1= ruleRotationDroite ) ;
    public final EObject ruleRGRD() throws RecognitionException {
        EObject current = null;

        EObject this_RotationGauche_0 = null;

        EObject this_RotationDroite_1 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:2180:2: ( (this_RotationGauche_0= ruleRotationGauche | this_RotationDroite_1= ruleRotationDroite ) )
            // InternalDroneDSL.g:2181:2: (this_RotationGauche_0= ruleRotationGauche | this_RotationDroite_1= ruleRotationDroite )
            {
            // InternalDroneDSL.g:2181:2: (this_RotationGauche_0= ruleRotationGauche | this_RotationDroite_1= ruleRotationDroite )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==36) ) {
                alt14=1;
            }
            else if ( (LA14_0==37) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalDroneDSL.g:2182:3: this_RotationGauche_0= ruleRotationGauche
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
                    // InternalDroneDSL.g:2191:3: this_RotationDroite_1= ruleRotationDroite
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
    // InternalDroneDSL.g:2203:1: entryRuleAR returns [EObject current=null] : iv_ruleAR= ruleAR EOF ;
    public final EObject entryRuleAR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAR = null;


        try {
            // InternalDroneDSL.g:2203:43: (iv_ruleAR= ruleAR EOF )
            // InternalDroneDSL.g:2204:2: iv_ruleAR= ruleAR EOF
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
    // InternalDroneDSL.g:2210:1: ruleAR returns [EObject current=null] : (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer ) ;
    public final EObject ruleAR() throws RecognitionException {
        EObject current = null;

        EObject this_Avancer_0 = null;

        EObject this_Reculer_1 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:2216:2: ( (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer ) )
            // InternalDroneDSL.g:2217:2: (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer )
            {
            // InternalDroneDSL.g:2217:2: (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            else if ( (LA15_0==33) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalDroneDSL.g:2218:3: this_Avancer_0= ruleAvancer
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
                    // InternalDroneDSL.g:2227:3: this_Reculer_1= ruleReculer
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
    // InternalDroneDSL.g:2239:1: entryRuleParallele returns [EObject current=null] : iv_ruleParallele= ruleParallele EOF ;
    public final EObject entryRuleParallele() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallele = null;


        try {
            // InternalDroneDSL.g:2239:50: (iv_ruleParallele= ruleParallele EOF )
            // InternalDroneDSL.g:2240:2: iv_ruleParallele= ruleParallele EOF
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
    // InternalDroneDSL.g:2246:1: ruleParallele returns [EObject current=null] : (this_Parallele2_0= ruleParallele2 | this_Parallele3_1= ruleParallele3 | this_Parallele4_2= ruleParallele4 ) ;
    public final EObject ruleParallele() throws RecognitionException {
        EObject current = null;

        EObject this_Parallele2_0 = null;

        EObject this_Parallele3_1 = null;

        EObject this_Parallele4_2 = null;



        	enterRule();

        try {
            // InternalDroneDSL.g:2252:2: ( (this_Parallele2_0= ruleParallele2 | this_Parallele3_1= ruleParallele3 | this_Parallele4_2= ruleParallele4 ) )
            // InternalDroneDSL.g:2253:2: (this_Parallele2_0= ruleParallele2 | this_Parallele3_1= ruleParallele3 | this_Parallele4_2= ruleParallele4 )
            {
            // InternalDroneDSL.g:2253:2: (this_Parallele2_0= ruleParallele2 | this_Parallele3_1= ruleParallele3 | this_Parallele4_2= ruleParallele4 )
            int alt16=3;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalDroneDSL.g:2254:3: this_Parallele2_0= ruleParallele2
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
                    // InternalDroneDSL.g:2263:3: this_Parallele3_1= ruleParallele3
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
                    // InternalDroneDSL.g:2272:3: this_Parallele4_2= ruleParallele4
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
    // InternalDroneDSL.g:2284:1: entryRuleParallele2 returns [EObject current=null] : iv_ruleParallele2= ruleParallele2 EOF ;
    public final EObject entryRuleParallele2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallele2 = null;


        try {
            // InternalDroneDSL.g:2284:51: (iv_ruleParallele2= ruleParallele2 EOF )
            // InternalDroneDSL.g:2285:2: iv_ruleParallele2= ruleParallele2 EOF
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
    // InternalDroneDSL.g:2291:1: ruleParallele2 returns [EObject current=null] : ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) ) ;
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
            // InternalDroneDSL.g:2297:2: ( ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) ) )
            // InternalDroneDSL.g:2298:2: ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) )
            {
            // InternalDroneDSL.g:2298:2: ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) )
            int alt17=12;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalDroneDSL.g:2299:3: ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:2299:3: ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:2300:4: ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:2300:4: ( (lv_a_0_0= ruleMD ) )
                    // InternalDroneDSL.g:2301:5: (lv_a_0_0= ruleMD )
                    {
                    // InternalDroneDSL.g:2301:5: (lv_a_0_0= ruleMD )
                    // InternalDroneDSL.g:2302:6: lv_a_0_0= ruleMD
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

                    otherlv_1=(Token)match(input,43,FOLLOW_30); 

                    				newLeafNode(otherlv_1, grammarAccess.getParallele2Access().getAmpersandKeyword_0_1());
                    			
                    // InternalDroneDSL.g:2323:4: ( (lv_t_2_0= ruleGDr ) )
                    // InternalDroneDSL.g:2324:5: (lv_t_2_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:2324:5: (lv_t_2_0= ruleGDr )
                    // InternalDroneDSL.g:2325:6: lv_t_2_0= ruleGDr
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
                    // InternalDroneDSL.g:2344:3: ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:2344:3: ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) )
                    // InternalDroneDSL.g:2345:4: ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:2345:4: ( (lv_a_3_0= ruleMD ) )
                    // InternalDroneDSL.g:2346:5: (lv_a_3_0= ruleMD )
                    {
                    // InternalDroneDSL.g:2346:5: (lv_a_3_0= ruleMD )
                    // InternalDroneDSL.g:2347:6: lv_a_3_0= ruleMD
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

                    otherlv_4=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_4, grammarAccess.getParallele2Access().getAmpersandKeyword_1_1());
                    			
                    // InternalDroneDSL.g:2368:4: ( (lv_t_5_0= ruleAR ) )
                    // InternalDroneDSL.g:2369:5: (lv_t_5_0= ruleAR )
                    {
                    // InternalDroneDSL.g:2369:5: (lv_t_5_0= ruleAR )
                    // InternalDroneDSL.g:2370:6: lv_t_5_0= ruleAR
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
                    // InternalDroneDSL.g:2389:3: ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:2389:3: ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:2390:4: ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:2390:4: ( (lv_a_6_0= ruleMD ) )
                    // InternalDroneDSL.g:2391:5: (lv_a_6_0= ruleMD )
                    {
                    // InternalDroneDSL.g:2391:5: (lv_a_6_0= ruleMD )
                    // InternalDroneDSL.g:2392:6: lv_a_6_0= ruleMD
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

                    otherlv_7=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_7, grammarAccess.getParallele2Access().getAmpersandKeyword_2_1());
                    			
                    // InternalDroneDSL.g:2413:4: ( (lv_t_8_0= ruleRGRD ) )
                    // InternalDroneDSL.g:2414:5: (lv_t_8_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:2414:5: (lv_t_8_0= ruleRGRD )
                    // InternalDroneDSL.g:2415:6: lv_t_8_0= ruleRGRD
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
                    // InternalDroneDSL.g:2434:3: ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:2434:3: ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) )
                    // InternalDroneDSL.g:2435:4: ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:2435:4: ( (lv_t_9_0= ruleGDr ) )
                    // InternalDroneDSL.g:2436:5: (lv_t_9_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:2436:5: (lv_t_9_0= ruleGDr )
                    // InternalDroneDSL.g:2437:6: lv_t_9_0= ruleGDr
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

                    otherlv_10=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_10, grammarAccess.getParallele2Access().getAmpersandKeyword_3_1());
                    			
                    // InternalDroneDSL.g:2458:4: ( (lv_b_11_0= ruleAR ) )
                    // InternalDroneDSL.g:2459:5: (lv_b_11_0= ruleAR )
                    {
                    // InternalDroneDSL.g:2459:5: (lv_b_11_0= ruleAR )
                    // InternalDroneDSL.g:2460:6: lv_b_11_0= ruleAR
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
                    // InternalDroneDSL.g:2479:3: ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:2479:3: ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) )
                    // InternalDroneDSL.g:2480:4: ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:2480:4: ( (lv_t_12_0= ruleGDr ) )
                    // InternalDroneDSL.g:2481:5: (lv_t_12_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:2481:5: (lv_t_12_0= ruleGDr )
                    // InternalDroneDSL.g:2482:6: lv_t_12_0= ruleGDr
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

                    otherlv_13=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_13, grammarAccess.getParallele2Access().getAmpersandKeyword_4_1());
                    			
                    // InternalDroneDSL.g:2503:4: ( (lv_b_14_0= ruleMD ) )
                    // InternalDroneDSL.g:2504:5: (lv_b_14_0= ruleMD )
                    {
                    // InternalDroneDSL.g:2504:5: (lv_b_14_0= ruleMD )
                    // InternalDroneDSL.g:2505:6: lv_b_14_0= ruleMD
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
                    // InternalDroneDSL.g:2524:3: ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:2524:3: ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:2525:4: ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:2525:4: ( (lv_t_15_0= ruleGDr ) )
                    // InternalDroneDSL.g:2526:5: (lv_t_15_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:2526:5: (lv_t_15_0= ruleGDr )
                    // InternalDroneDSL.g:2527:6: lv_t_15_0= ruleGDr
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

                    otherlv_16=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_16, grammarAccess.getParallele2Access().getAmpersandKeyword_5_1());
                    			
                    // InternalDroneDSL.g:2548:4: ( (lv_b_17_0= ruleRGRD ) )
                    // InternalDroneDSL.g:2549:5: (lv_b_17_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:2549:5: (lv_b_17_0= ruleRGRD )
                    // InternalDroneDSL.g:2550:6: lv_b_17_0= ruleRGRD
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
                    // InternalDroneDSL.g:2569:3: ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:2569:3: ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) )
                    // InternalDroneDSL.g:2570:4: ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:2570:4: ( (lv_t_18_0= ruleRGRD ) )
                    // InternalDroneDSL.g:2571:5: (lv_t_18_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:2571:5: (lv_t_18_0= ruleRGRD )
                    // InternalDroneDSL.g:2572:6: lv_t_18_0= ruleRGRD
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

                    otherlv_19=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_19, grammarAccess.getParallele2Access().getAmpersandKeyword_6_1());
                    			
                    // InternalDroneDSL.g:2593:4: ( (lv_a_20_0= ruleMD ) )
                    // InternalDroneDSL.g:2594:5: (lv_a_20_0= ruleMD )
                    {
                    // InternalDroneDSL.g:2594:5: (lv_a_20_0= ruleMD )
                    // InternalDroneDSL.g:2595:6: lv_a_20_0= ruleMD
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
                    // InternalDroneDSL.g:2614:3: ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:2614:3: ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) )
                    // InternalDroneDSL.g:2615:4: ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:2615:4: ( (lv_t_21_0= ruleRGRD ) )
                    // InternalDroneDSL.g:2616:5: (lv_t_21_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:2616:5: (lv_t_21_0= ruleRGRD )
                    // InternalDroneDSL.g:2617:6: lv_t_21_0= ruleRGRD
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

                    otherlv_22=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_22, grammarAccess.getParallele2Access().getAmpersandKeyword_7_1());
                    			
                    // InternalDroneDSL.g:2638:4: ( (lv_a_23_0= ruleAR ) )
                    // InternalDroneDSL.g:2639:5: (lv_a_23_0= ruleAR )
                    {
                    // InternalDroneDSL.g:2639:5: (lv_a_23_0= ruleAR )
                    // InternalDroneDSL.g:2640:6: lv_a_23_0= ruleAR
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
                    // InternalDroneDSL.g:2659:3: ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:2659:3: ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:2660:4: ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:2660:4: ( (lv_t_24_0= ruleRGRD ) )
                    // InternalDroneDSL.g:2661:5: (lv_t_24_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:2661:5: (lv_t_24_0= ruleRGRD )
                    // InternalDroneDSL.g:2662:6: lv_t_24_0= ruleRGRD
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

                    otherlv_25=(Token)match(input,43,FOLLOW_30); 

                    				newLeafNode(otherlv_25, grammarAccess.getParallele2Access().getAmpersandKeyword_8_1());
                    			
                    // InternalDroneDSL.g:2683:4: ( (lv_a_26_0= ruleGDr ) )
                    // InternalDroneDSL.g:2684:5: (lv_a_26_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:2684:5: (lv_a_26_0= ruleGDr )
                    // InternalDroneDSL.g:2685:6: lv_a_26_0= ruleGDr
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
                    // InternalDroneDSL.g:2704:3: ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:2704:3: ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) )
                    // InternalDroneDSL.g:2705:4: ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:2705:4: ( (lv_t_27_0= ruleAR ) )
                    // InternalDroneDSL.g:2706:5: (lv_t_27_0= ruleAR )
                    {
                    // InternalDroneDSL.g:2706:5: (lv_t_27_0= ruleAR )
                    // InternalDroneDSL.g:2707:6: lv_t_27_0= ruleAR
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

                    otherlv_28=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_28, grammarAccess.getParallele2Access().getAmpersandKeyword_9_1());
                    			
                    // InternalDroneDSL.g:2728:4: ( (lv_a_29_0= ruleMD ) )
                    // InternalDroneDSL.g:2729:5: (lv_a_29_0= ruleMD )
                    {
                    // InternalDroneDSL.g:2729:5: (lv_a_29_0= ruleMD )
                    // InternalDroneDSL.g:2730:6: lv_a_29_0= ruleMD
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
                    // InternalDroneDSL.g:2749:3: ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:2749:3: ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:2750:4: ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:2750:4: ( (lv_t_30_0= ruleAR ) )
                    // InternalDroneDSL.g:2751:5: (lv_t_30_0= ruleAR )
                    {
                    // InternalDroneDSL.g:2751:5: (lv_t_30_0= ruleAR )
                    // InternalDroneDSL.g:2752:6: lv_t_30_0= ruleAR
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

                    otherlv_31=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_31, grammarAccess.getParallele2Access().getAmpersandKeyword_10_1());
                    			
                    // InternalDroneDSL.g:2773:4: ( (lv_a_32_0= ruleRGRD ) )
                    // InternalDroneDSL.g:2774:5: (lv_a_32_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:2774:5: (lv_a_32_0= ruleRGRD )
                    // InternalDroneDSL.g:2775:6: lv_a_32_0= ruleRGRD
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
                    // InternalDroneDSL.g:2794:3: ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:2794:3: ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:2795:4: ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:2795:4: ( (lv_t_33_0= ruleAR ) )
                    // InternalDroneDSL.g:2796:5: (lv_t_33_0= ruleAR )
                    {
                    // InternalDroneDSL.g:2796:5: (lv_t_33_0= ruleAR )
                    // InternalDroneDSL.g:2797:6: lv_t_33_0= ruleAR
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

                    otherlv_34=(Token)match(input,43,FOLLOW_30); 

                    				newLeafNode(otherlv_34, grammarAccess.getParallele2Access().getAmpersandKeyword_11_1());
                    			
                    // InternalDroneDSL.g:2818:4: ( (lv_a_35_0= ruleGDr ) )
                    // InternalDroneDSL.g:2819:5: (lv_a_35_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:2819:5: (lv_a_35_0= ruleGDr )
                    // InternalDroneDSL.g:2820:6: lv_a_35_0= ruleGDr
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
    // InternalDroneDSL.g:2842:1: entryRuleParallele3 returns [EObject current=null] : iv_ruleParallele3= ruleParallele3 EOF ;
    public final EObject entryRuleParallele3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallele3 = null;


        try {
            // InternalDroneDSL.g:2842:51: (iv_ruleParallele3= ruleParallele3 EOF )
            // InternalDroneDSL.g:2843:2: iv_ruleParallele3= ruleParallele3 EOF
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
    // InternalDroneDSL.g:2849:1: ruleParallele3 returns [EObject current=null] : ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) ) ;
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
            // InternalDroneDSL.g:2855:2: ( ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) ) )
            // InternalDroneDSL.g:2856:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) )
            {
            // InternalDroneDSL.g:2856:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) )
            int alt18=24;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalDroneDSL.g:2857:3: ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:2857:3: ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) )
                    // InternalDroneDSL.g:2858:4: ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:2858:4: ( (lv_a_0_0= ruleAR ) )
                    // InternalDroneDSL.g:2859:5: (lv_a_0_0= ruleAR )
                    {
                    // InternalDroneDSL.g:2859:5: (lv_a_0_0= ruleAR )
                    // InternalDroneDSL.g:2860:6: lv_a_0_0= ruleAR
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

                    otherlv_1=(Token)match(input,43,FOLLOW_30); 

                    				newLeafNode(otherlv_1, grammarAccess.getParallele3Access().getAmpersandKeyword_0_1());
                    			
                    // InternalDroneDSL.g:2881:4: ( (lv_b_2_0= ruleGDr ) )
                    // InternalDroneDSL.g:2882:5: (lv_b_2_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:2882:5: (lv_b_2_0= ruleGDr )
                    // InternalDroneDSL.g:2883:6: lv_b_2_0= ruleGDr
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

                    otherlv_3=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_3, grammarAccess.getParallele3Access().getAmpersandKeyword_0_3());
                    			
                    // InternalDroneDSL.g:2904:4: ( (lv_c_4_0= ruleMD ) )
                    // InternalDroneDSL.g:2905:5: (lv_c_4_0= ruleMD )
                    {
                    // InternalDroneDSL.g:2905:5: (lv_c_4_0= ruleMD )
                    // InternalDroneDSL.g:2906:6: lv_c_4_0= ruleMD
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
                    // InternalDroneDSL.g:2925:3: ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:2925:3: ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:2926:4: ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:2926:4: ( (lv_a_5_0= ruleAR ) )
                    // InternalDroneDSL.g:2927:5: (lv_a_5_0= ruleAR )
                    {
                    // InternalDroneDSL.g:2927:5: (lv_a_5_0= ruleAR )
                    // InternalDroneDSL.g:2928:6: lv_a_5_0= ruleAR
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

                    otherlv_6=(Token)match(input,43,FOLLOW_30); 

                    				newLeafNode(otherlv_6, grammarAccess.getParallele3Access().getAmpersandKeyword_1_1());
                    			
                    // InternalDroneDSL.g:2949:4: ( (lv_b_7_0= ruleGDr ) )
                    // InternalDroneDSL.g:2950:5: (lv_b_7_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:2950:5: (lv_b_7_0= ruleGDr )
                    // InternalDroneDSL.g:2951:6: lv_b_7_0= ruleGDr
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

                    otherlv_8=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_8, grammarAccess.getParallele3Access().getAmpersandKeyword_1_3());
                    			
                    // InternalDroneDSL.g:2972:4: ( (lv_c_9_0= ruleRGRD ) )
                    // InternalDroneDSL.g:2973:5: (lv_c_9_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:2973:5: (lv_c_9_0= ruleRGRD )
                    // InternalDroneDSL.g:2974:6: lv_c_9_0= ruleRGRD
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
                    // InternalDroneDSL.g:2993:3: ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:2993:3: ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:2994:4: ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:2994:4: ( (lv_a_10_0= ruleAR ) )
                    // InternalDroneDSL.g:2995:5: (lv_a_10_0= ruleAR )
                    {
                    // InternalDroneDSL.g:2995:5: (lv_a_10_0= ruleAR )
                    // InternalDroneDSL.g:2996:6: lv_a_10_0= ruleAR
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

                    otherlv_11=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_11, grammarAccess.getParallele3Access().getAmpersandKeyword_2_1());
                    			
                    // InternalDroneDSL.g:3017:4: ( (lv_b_12_0= ruleMD ) )
                    // InternalDroneDSL.g:3018:5: (lv_b_12_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3018:5: (lv_b_12_0= ruleMD )
                    // InternalDroneDSL.g:3019:6: lv_b_12_0= ruleMD
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

                    otherlv_13=(Token)match(input,43,FOLLOW_30); 

                    				newLeafNode(otherlv_13, grammarAccess.getParallele3Access().getAmpersandKeyword_2_3());
                    			
                    // InternalDroneDSL.g:3040:4: ( (lv_c_14_0= ruleGDr ) )
                    // InternalDroneDSL.g:3041:5: (lv_c_14_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3041:5: (lv_c_14_0= ruleGDr )
                    // InternalDroneDSL.g:3042:6: lv_c_14_0= ruleGDr
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
                    // InternalDroneDSL.g:3061:3: ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:3061:3: ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:3062:4: ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:3062:4: ( (lv_a_15_0= ruleAR ) )
                    // InternalDroneDSL.g:3063:5: (lv_a_15_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3063:5: (lv_a_15_0= ruleAR )
                    // InternalDroneDSL.g:3064:6: lv_a_15_0= ruleAR
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

                    otherlv_16=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_16, grammarAccess.getParallele3Access().getAmpersandKeyword_3_1());
                    			
                    // InternalDroneDSL.g:3085:4: ( (lv_b_17_0= ruleMD ) )
                    // InternalDroneDSL.g:3086:5: (lv_b_17_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3086:5: (lv_b_17_0= ruleMD )
                    // InternalDroneDSL.g:3087:6: lv_b_17_0= ruleMD
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

                    otherlv_18=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_18, grammarAccess.getParallele3Access().getAmpersandKeyword_3_3());
                    			
                    // InternalDroneDSL.g:3108:4: ( (lv_c_19_0= ruleRGRD ) )
                    // InternalDroneDSL.g:3109:5: (lv_c_19_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:3109:5: (lv_c_19_0= ruleRGRD )
                    // InternalDroneDSL.g:3110:6: lv_c_19_0= ruleRGRD
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
                    // InternalDroneDSL.g:3129:3: ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:3129:3: ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) )
                    // InternalDroneDSL.g:3130:4: ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:3130:4: ( (lv_a_20_0= ruleAR ) )
                    // InternalDroneDSL.g:3131:5: (lv_a_20_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3131:5: (lv_a_20_0= ruleAR )
                    // InternalDroneDSL.g:3132:6: lv_a_20_0= ruleAR
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

                    otherlv_21=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_21, grammarAccess.getParallele3Access().getAmpersandKeyword_4_1());
                    			
                    // InternalDroneDSL.g:3153:4: ( (lv_b_22_0= ruleRGRD ) )
                    // InternalDroneDSL.g:3154:5: (lv_b_22_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:3154:5: (lv_b_22_0= ruleRGRD )
                    // InternalDroneDSL.g:3155:6: lv_b_22_0= ruleRGRD
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

                    otherlv_23=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_23, grammarAccess.getParallele3Access().getAmpersandKeyword_4_3());
                    			
                    // InternalDroneDSL.g:3176:4: ( (lv_c_24_0= ruleMD ) )
                    // InternalDroneDSL.g:3177:5: (lv_c_24_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3177:5: (lv_c_24_0= ruleMD )
                    // InternalDroneDSL.g:3178:6: lv_c_24_0= ruleMD
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
                    // InternalDroneDSL.g:3197:3: ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:3197:3: ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:3198:4: ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:3198:4: ( (lv_a_25_0= ruleAR ) )
                    // InternalDroneDSL.g:3199:5: (lv_a_25_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3199:5: (lv_a_25_0= ruleAR )
                    // InternalDroneDSL.g:3200:6: lv_a_25_0= ruleAR
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

                    otherlv_26=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_26, grammarAccess.getParallele3Access().getAmpersandKeyword_5_1());
                    			
                    // InternalDroneDSL.g:3221:4: ( (lv_b_27_0= ruleRGRD ) )
                    // InternalDroneDSL.g:3222:5: (lv_b_27_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:3222:5: (lv_b_27_0= ruleRGRD )
                    // InternalDroneDSL.g:3223:6: lv_b_27_0= ruleRGRD
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

                    otherlv_28=(Token)match(input,43,FOLLOW_30); 

                    				newLeafNode(otherlv_28, grammarAccess.getParallele3Access().getAmpersandKeyword_5_3());
                    			
                    // InternalDroneDSL.g:3244:4: ( (lv_c_29_0= ruleGDr ) )
                    // InternalDroneDSL.g:3245:5: (lv_c_29_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3245:5: (lv_c_29_0= ruleGDr )
                    // InternalDroneDSL.g:3246:6: lv_c_29_0= ruleGDr
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
                    // InternalDroneDSL.g:3265:3: ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:3265:3: ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) )
                    // InternalDroneDSL.g:3266:4: ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:3266:4: ( (lv_a_30_0= ruleGDr ) )
                    // InternalDroneDSL.g:3267:5: (lv_a_30_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3267:5: (lv_a_30_0= ruleGDr )
                    // InternalDroneDSL.g:3268:6: lv_a_30_0= ruleGDr
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

                    otherlv_31=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_31, grammarAccess.getParallele3Access().getAmpersandKeyword_6_1());
                    			
                    // InternalDroneDSL.g:3289:4: ( (lv_b_32_0= ruleAR ) )
                    // InternalDroneDSL.g:3290:5: (lv_b_32_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3290:5: (lv_b_32_0= ruleAR )
                    // InternalDroneDSL.g:3291:6: lv_b_32_0= ruleAR
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

                    otherlv_33=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_33, grammarAccess.getParallele3Access().getAmpersandKeyword_6_3());
                    			
                    // InternalDroneDSL.g:3312:4: ( (lv_c_34_0= ruleMD ) )
                    // InternalDroneDSL.g:3313:5: (lv_c_34_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3313:5: (lv_c_34_0= ruleMD )
                    // InternalDroneDSL.g:3314:6: lv_c_34_0= ruleMD
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
                    // InternalDroneDSL.g:3333:3: ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:3333:3: ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:3334:4: ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:3334:4: ( (lv_a_35_0= ruleGDr ) )
                    // InternalDroneDSL.g:3335:5: (lv_a_35_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3335:5: (lv_a_35_0= ruleGDr )
                    // InternalDroneDSL.g:3336:6: lv_a_35_0= ruleGDr
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

                    otherlv_36=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_36, grammarAccess.getParallele3Access().getAmpersandKeyword_7_1());
                    			
                    // InternalDroneDSL.g:3357:4: ( (lv_b_37_0= ruleAR ) )
                    // InternalDroneDSL.g:3358:5: (lv_b_37_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3358:5: (lv_b_37_0= ruleAR )
                    // InternalDroneDSL.g:3359:6: lv_b_37_0= ruleAR
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

                    otherlv_38=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_38, grammarAccess.getParallele3Access().getAmpersandKeyword_7_3());
                    			
                    // InternalDroneDSL.g:3380:4: ( (lv_c_39_0= ruleRGRD ) )
                    // InternalDroneDSL.g:3381:5: (lv_c_39_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:3381:5: (lv_c_39_0= ruleRGRD )
                    // InternalDroneDSL.g:3382:6: lv_c_39_0= ruleRGRD
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
                    // InternalDroneDSL.g:3401:3: ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:3401:3: ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) )
                    // InternalDroneDSL.g:3402:4: ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:3402:4: ( (lv_a_40_0= ruleGDr ) )
                    // InternalDroneDSL.g:3403:5: (lv_a_40_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3403:5: (lv_a_40_0= ruleGDr )
                    // InternalDroneDSL.g:3404:6: lv_a_40_0= ruleGDr
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

                    otherlv_41=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_41, grammarAccess.getParallele3Access().getAmpersandKeyword_8_1());
                    			
                    // InternalDroneDSL.g:3425:4: ( (lv_b_42_0= ruleMD ) )
                    // InternalDroneDSL.g:3426:5: (lv_b_42_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3426:5: (lv_b_42_0= ruleMD )
                    // InternalDroneDSL.g:3427:6: lv_b_42_0= ruleMD
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

                    otherlv_43=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_43, grammarAccess.getParallele3Access().getAmpersandKeyword_8_3());
                    			
                    // InternalDroneDSL.g:3448:4: ( (lv_c_44_0= ruleAR ) )
                    // InternalDroneDSL.g:3449:5: (lv_c_44_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3449:5: (lv_c_44_0= ruleAR )
                    // InternalDroneDSL.g:3450:6: lv_c_44_0= ruleAR
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
                    // InternalDroneDSL.g:3469:3: ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:3469:3: ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:3470:4: ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:3470:4: ( (lv_a_45_0= ruleGDr ) )
                    // InternalDroneDSL.g:3471:5: (lv_a_45_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3471:5: (lv_a_45_0= ruleGDr )
                    // InternalDroneDSL.g:3472:6: lv_a_45_0= ruleGDr
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

                    otherlv_46=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_46, grammarAccess.getParallele3Access().getAmpersandKeyword_9_1());
                    			
                    // InternalDroneDSL.g:3493:4: ( (lv_b_47_0= ruleMD ) )
                    // InternalDroneDSL.g:3494:5: (lv_b_47_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3494:5: (lv_b_47_0= ruleMD )
                    // InternalDroneDSL.g:3495:6: lv_b_47_0= ruleMD
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

                    otherlv_48=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_48, grammarAccess.getParallele3Access().getAmpersandKeyword_9_3());
                    			
                    // InternalDroneDSL.g:3516:4: ( (lv_c_49_0= ruleRGRD ) )
                    // InternalDroneDSL.g:3517:5: (lv_c_49_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:3517:5: (lv_c_49_0= ruleRGRD )
                    // InternalDroneDSL.g:3518:6: lv_c_49_0= ruleRGRD
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
                    // InternalDroneDSL.g:3537:3: ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:3537:3: ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) )
                    // InternalDroneDSL.g:3538:4: ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:3538:4: ( (lv_a_50_0= ruleGDr ) )
                    // InternalDroneDSL.g:3539:5: (lv_a_50_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3539:5: (lv_a_50_0= ruleGDr )
                    // InternalDroneDSL.g:3540:6: lv_a_50_0= ruleGDr
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

                    otherlv_51=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_51, grammarAccess.getParallele3Access().getAmpersandKeyword_10_1());
                    			
                    // InternalDroneDSL.g:3561:4: ( (lv_b_52_0= ruleRGRD ) )
                    // InternalDroneDSL.g:3562:5: (lv_b_52_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:3562:5: (lv_b_52_0= ruleRGRD )
                    // InternalDroneDSL.g:3563:6: lv_b_52_0= ruleRGRD
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

                    otherlv_53=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_53, grammarAccess.getParallele3Access().getAmpersandKeyword_10_3());
                    			
                    // InternalDroneDSL.g:3584:4: ( (lv_c_54_0= ruleAR ) )
                    // InternalDroneDSL.g:3585:5: (lv_c_54_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3585:5: (lv_c_54_0= ruleAR )
                    // InternalDroneDSL.g:3586:6: lv_c_54_0= ruleAR
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
                    // InternalDroneDSL.g:3605:3: ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:3605:3: ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) )
                    // InternalDroneDSL.g:3606:4: ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:3606:4: ( (lv_a_55_0= ruleGDr ) )
                    // InternalDroneDSL.g:3607:5: (lv_a_55_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3607:5: (lv_a_55_0= ruleGDr )
                    // InternalDroneDSL.g:3608:6: lv_a_55_0= ruleGDr
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

                    otherlv_56=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_56, grammarAccess.getParallele3Access().getAmpersandKeyword_11_1());
                    			
                    // InternalDroneDSL.g:3629:4: ( (lv_b_57_0= ruleRGRD ) )
                    // InternalDroneDSL.g:3630:5: (lv_b_57_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:3630:5: (lv_b_57_0= ruleRGRD )
                    // InternalDroneDSL.g:3631:6: lv_b_57_0= ruleRGRD
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

                    otherlv_58=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_58, grammarAccess.getParallele3Access().getAmpersandKeyword_11_3());
                    			
                    // InternalDroneDSL.g:3652:4: ( (lv_c_59_0= ruleMD ) )
                    // InternalDroneDSL.g:3653:5: (lv_c_59_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3653:5: (lv_c_59_0= ruleMD )
                    // InternalDroneDSL.g:3654:6: lv_c_59_0= ruleMD
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
                    // InternalDroneDSL.g:3673:3: ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:3673:3: ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:3674:4: ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:3674:4: ( (lv_a_60_0= ruleMD ) )
                    // InternalDroneDSL.g:3675:5: (lv_a_60_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3675:5: (lv_a_60_0= ruleMD )
                    // InternalDroneDSL.g:3676:6: lv_a_60_0= ruleMD
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

                    otherlv_61=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_61, grammarAccess.getParallele3Access().getAmpersandKeyword_12_1());
                    			
                    // InternalDroneDSL.g:3697:4: ( (lv_b_62_0= ruleAR ) )
                    // InternalDroneDSL.g:3698:5: (lv_b_62_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3698:5: (lv_b_62_0= ruleAR )
                    // InternalDroneDSL.g:3699:6: lv_b_62_0= ruleAR
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

                    otherlv_63=(Token)match(input,43,FOLLOW_30); 

                    				newLeafNode(otherlv_63, grammarAccess.getParallele3Access().getAmpersandKeyword_12_3());
                    			
                    // InternalDroneDSL.g:3720:4: ( (lv_c_64_0= ruleGDr ) )
                    // InternalDroneDSL.g:3721:5: (lv_c_64_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3721:5: (lv_c_64_0= ruleGDr )
                    // InternalDroneDSL.g:3722:6: lv_c_64_0= ruleGDr
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
                    // InternalDroneDSL.g:3741:3: ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:3741:3: ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:3742:4: ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:3742:4: ( (lv_a_65_0= ruleMD ) )
                    // InternalDroneDSL.g:3743:5: (lv_a_65_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3743:5: (lv_a_65_0= ruleMD )
                    // InternalDroneDSL.g:3744:6: lv_a_65_0= ruleMD
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

                    otherlv_66=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_66, grammarAccess.getParallele3Access().getAmpersandKeyword_13_1());
                    			
                    // InternalDroneDSL.g:3765:4: ( (lv_b_67_0= ruleAR ) )
                    // InternalDroneDSL.g:3766:5: (lv_b_67_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3766:5: (lv_b_67_0= ruleAR )
                    // InternalDroneDSL.g:3767:6: lv_b_67_0= ruleAR
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

                    otherlv_68=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_68, grammarAccess.getParallele3Access().getAmpersandKeyword_13_3());
                    			
                    // InternalDroneDSL.g:3788:4: ( (lv_c_69_0= ruleRGRD ) )
                    // InternalDroneDSL.g:3789:5: (lv_c_69_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:3789:5: (lv_c_69_0= ruleRGRD )
                    // InternalDroneDSL.g:3790:6: lv_c_69_0= ruleRGRD
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
                    // InternalDroneDSL.g:3809:3: ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:3809:3: ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) )
                    // InternalDroneDSL.g:3810:4: ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:3810:4: ( (lv_a_70_0= ruleMD ) )
                    // InternalDroneDSL.g:3811:5: (lv_a_70_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3811:5: (lv_a_70_0= ruleMD )
                    // InternalDroneDSL.g:3812:6: lv_a_70_0= ruleMD
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

                    otherlv_71=(Token)match(input,43,FOLLOW_30); 

                    				newLeafNode(otherlv_71, grammarAccess.getParallele3Access().getAmpersandKeyword_14_1());
                    			
                    // InternalDroneDSL.g:3833:4: ( (lv_b_72_0= ruleGDr ) )
                    // InternalDroneDSL.g:3834:5: (lv_b_72_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3834:5: (lv_b_72_0= ruleGDr )
                    // InternalDroneDSL.g:3835:6: lv_b_72_0= ruleGDr
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

                    otherlv_73=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_73, grammarAccess.getParallele3Access().getAmpersandKeyword_14_3());
                    			
                    // InternalDroneDSL.g:3856:4: ( (lv_c_74_0= ruleAR ) )
                    // InternalDroneDSL.g:3857:5: (lv_c_74_0= ruleAR )
                    {
                    // InternalDroneDSL.g:3857:5: (lv_c_74_0= ruleAR )
                    // InternalDroneDSL.g:3858:6: lv_c_74_0= ruleAR
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
                    // InternalDroneDSL.g:3877:3: ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:3877:3: ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:3878:4: ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:3878:4: ( (lv_a_75_0= ruleMD ) )
                    // InternalDroneDSL.g:3879:5: (lv_a_75_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3879:5: (lv_a_75_0= ruleMD )
                    // InternalDroneDSL.g:3880:6: lv_a_75_0= ruleMD
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

                    otherlv_76=(Token)match(input,43,FOLLOW_30); 

                    				newLeafNode(otherlv_76, grammarAccess.getParallele3Access().getAmpersandKeyword_15_1());
                    			
                    // InternalDroneDSL.g:3901:4: ( (lv_b_77_0= ruleGDr ) )
                    // InternalDroneDSL.g:3902:5: (lv_b_77_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3902:5: (lv_b_77_0= ruleGDr )
                    // InternalDroneDSL.g:3903:6: lv_b_77_0= ruleGDr
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

                    otherlv_78=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_78, grammarAccess.getParallele3Access().getAmpersandKeyword_15_3());
                    			
                    // InternalDroneDSL.g:3924:4: ( (lv_c_79_0= ruleRGRD ) )
                    // InternalDroneDSL.g:3925:5: (lv_c_79_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:3925:5: (lv_c_79_0= ruleRGRD )
                    // InternalDroneDSL.g:3926:6: lv_c_79_0= ruleRGRD
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
                    // InternalDroneDSL.g:3945:3: ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:3945:3: ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:3946:4: ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:3946:4: ( (lv_a_80_0= ruleMD ) )
                    // InternalDroneDSL.g:3947:5: (lv_a_80_0= ruleMD )
                    {
                    // InternalDroneDSL.g:3947:5: (lv_a_80_0= ruleMD )
                    // InternalDroneDSL.g:3948:6: lv_a_80_0= ruleMD
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

                    otherlv_81=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_81, grammarAccess.getParallele3Access().getAmpersandKeyword_16_1());
                    			
                    // InternalDroneDSL.g:3969:4: ( (lv_b_82_0= ruleRGRD ) )
                    // InternalDroneDSL.g:3970:5: (lv_b_82_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:3970:5: (lv_b_82_0= ruleRGRD )
                    // InternalDroneDSL.g:3971:6: lv_b_82_0= ruleRGRD
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

                    otherlv_83=(Token)match(input,43,FOLLOW_30); 

                    				newLeafNode(otherlv_83, grammarAccess.getParallele3Access().getAmpersandKeyword_16_3());
                    			
                    // InternalDroneDSL.g:3992:4: ( (lv_c_84_0= ruleGDr ) )
                    // InternalDroneDSL.g:3993:5: (lv_c_84_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:3993:5: (lv_c_84_0= ruleGDr )
                    // InternalDroneDSL.g:3994:6: lv_c_84_0= ruleGDr
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
                    // InternalDroneDSL.g:4013:3: ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:4013:3: ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) )
                    // InternalDroneDSL.g:4014:4: ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:4014:4: ( (lv_a_85_0= ruleMD ) )
                    // InternalDroneDSL.g:4015:5: (lv_a_85_0= ruleMD )
                    {
                    // InternalDroneDSL.g:4015:5: (lv_a_85_0= ruleMD )
                    // InternalDroneDSL.g:4016:6: lv_a_85_0= ruleMD
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

                    otherlv_86=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_86, grammarAccess.getParallele3Access().getAmpersandKeyword_17_1());
                    			
                    // InternalDroneDSL.g:4037:4: ( (lv_b_87_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4038:5: (lv_b_87_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4038:5: (lv_b_87_0= ruleRGRD )
                    // InternalDroneDSL.g:4039:6: lv_b_87_0= ruleRGRD
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

                    otherlv_88=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_88, grammarAccess.getParallele3Access().getAmpersandKeyword_17_3());
                    			
                    // InternalDroneDSL.g:4060:4: ( (lv_c_89_0= ruleAR ) )
                    // InternalDroneDSL.g:4061:5: (lv_c_89_0= ruleAR )
                    {
                    // InternalDroneDSL.g:4061:5: (lv_c_89_0= ruleAR )
                    // InternalDroneDSL.g:4062:6: lv_c_89_0= ruleAR
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
                    // InternalDroneDSL.g:4081:3: ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:4081:3: ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) )
                    // InternalDroneDSL.g:4082:4: ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:4082:4: ( (lv_a_90_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4083:5: (lv_a_90_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4083:5: (lv_a_90_0= ruleRGRD )
                    // InternalDroneDSL.g:4084:6: lv_a_90_0= ruleRGRD
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

                    otherlv_91=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_91, grammarAccess.getParallele3Access().getAmpersandKeyword_18_1());
                    			
                    // InternalDroneDSL.g:4105:4: ( (lv_b_92_0= ruleAR ) )
                    // InternalDroneDSL.g:4106:5: (lv_b_92_0= ruleAR )
                    {
                    // InternalDroneDSL.g:4106:5: (lv_b_92_0= ruleAR )
                    // InternalDroneDSL.g:4107:6: lv_b_92_0= ruleAR
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

                    otherlv_93=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_93, grammarAccess.getParallele3Access().getAmpersandKeyword_18_3());
                    			
                    // InternalDroneDSL.g:4128:4: ( (lv_c_94_0= ruleMD ) )
                    // InternalDroneDSL.g:4129:5: (lv_c_94_0= ruleMD )
                    {
                    // InternalDroneDSL.g:4129:5: (lv_c_94_0= ruleMD )
                    // InternalDroneDSL.g:4130:6: lv_c_94_0= ruleMD
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
                    // InternalDroneDSL.g:4149:3: ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:4149:3: ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:4150:4: ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:4150:4: ( (lv_a_95_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4151:5: (lv_a_95_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4151:5: (lv_a_95_0= ruleRGRD )
                    // InternalDroneDSL.g:4152:6: lv_a_95_0= ruleRGRD
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

                    otherlv_96=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_96, grammarAccess.getParallele3Access().getAmpersandKeyword_19_1());
                    			
                    // InternalDroneDSL.g:4173:4: ( (lv_b_97_0= ruleAR ) )
                    // InternalDroneDSL.g:4174:5: (lv_b_97_0= ruleAR )
                    {
                    // InternalDroneDSL.g:4174:5: (lv_b_97_0= ruleAR )
                    // InternalDroneDSL.g:4175:6: lv_b_97_0= ruleAR
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

                    otherlv_98=(Token)match(input,43,FOLLOW_30); 

                    				newLeafNode(otherlv_98, grammarAccess.getParallele3Access().getAmpersandKeyword_19_3());
                    			
                    // InternalDroneDSL.g:4196:4: ( (lv_c_99_0= ruleGDr ) )
                    // InternalDroneDSL.g:4197:5: (lv_c_99_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:4197:5: (lv_c_99_0= ruleGDr )
                    // InternalDroneDSL.g:4198:6: lv_c_99_0= ruleGDr
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
                    // InternalDroneDSL.g:4217:3: ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:4217:3: ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) )
                    // InternalDroneDSL.g:4218:4: ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:4218:4: ( (lv_a_100_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4219:5: (lv_a_100_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4219:5: (lv_a_100_0= ruleRGRD )
                    // InternalDroneDSL.g:4220:6: lv_a_100_0= ruleRGRD
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

                    otherlv_101=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_101, grammarAccess.getParallele3Access().getAmpersandKeyword_20_1());
                    			
                    // InternalDroneDSL.g:4241:4: ( (lv_b_102_0= ruleMD ) )
                    // InternalDroneDSL.g:4242:5: (lv_b_102_0= ruleMD )
                    {
                    // InternalDroneDSL.g:4242:5: (lv_b_102_0= ruleMD )
                    // InternalDroneDSL.g:4243:6: lv_b_102_0= ruleMD
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

                    otherlv_103=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_103, grammarAccess.getParallele3Access().getAmpersandKeyword_20_3());
                    			
                    // InternalDroneDSL.g:4264:4: ( (lv_c_104_0= ruleAR ) )
                    // InternalDroneDSL.g:4265:5: (lv_c_104_0= ruleAR )
                    {
                    // InternalDroneDSL.g:4265:5: (lv_c_104_0= ruleAR )
                    // InternalDroneDSL.g:4266:6: lv_c_104_0= ruleAR
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
                    // InternalDroneDSL.g:4285:3: ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:4285:3: ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:4286:4: ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:4286:4: ( (lv_a_105_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4287:5: (lv_a_105_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4287:5: (lv_a_105_0= ruleRGRD )
                    // InternalDroneDSL.g:4288:6: lv_a_105_0= ruleRGRD
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

                    otherlv_106=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_106, grammarAccess.getParallele3Access().getAmpersandKeyword_21_1());
                    			
                    // InternalDroneDSL.g:4309:4: ( (lv_b_107_0= ruleMD ) )
                    // InternalDroneDSL.g:4310:5: (lv_b_107_0= ruleMD )
                    {
                    // InternalDroneDSL.g:4310:5: (lv_b_107_0= ruleMD )
                    // InternalDroneDSL.g:4311:6: lv_b_107_0= ruleMD
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

                    otherlv_108=(Token)match(input,43,FOLLOW_30); 

                    				newLeafNode(otherlv_108, grammarAccess.getParallele3Access().getAmpersandKeyword_21_3());
                    			
                    // InternalDroneDSL.g:4332:4: ( (lv_c_109_0= ruleGDr ) )
                    // InternalDroneDSL.g:4333:5: (lv_c_109_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:4333:5: (lv_c_109_0= ruleGDr )
                    // InternalDroneDSL.g:4334:6: lv_c_109_0= ruleGDr
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
                    // InternalDroneDSL.g:4353:3: ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:4353:3: ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) )
                    // InternalDroneDSL.g:4354:4: ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:4354:4: ( (lv_a_110_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4355:5: (lv_a_110_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4355:5: (lv_a_110_0= ruleRGRD )
                    // InternalDroneDSL.g:4356:6: lv_a_110_0= ruleRGRD
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

                    otherlv_111=(Token)match(input,43,FOLLOW_30); 

                    				newLeafNode(otherlv_111, grammarAccess.getParallele3Access().getAmpersandKeyword_22_1());
                    			
                    // InternalDroneDSL.g:4377:4: ( (lv_b_112_0= ruleGDr ) )
                    // InternalDroneDSL.g:4378:5: (lv_b_112_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:4378:5: (lv_b_112_0= ruleGDr )
                    // InternalDroneDSL.g:4379:6: lv_b_112_0= ruleGDr
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

                    otherlv_113=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_113, grammarAccess.getParallele3Access().getAmpersandKeyword_22_3());
                    			
                    // InternalDroneDSL.g:4400:4: ( (lv_c_114_0= ruleMD ) )
                    // InternalDroneDSL.g:4401:5: (lv_c_114_0= ruleMD )
                    {
                    // InternalDroneDSL.g:4401:5: (lv_c_114_0= ruleMD )
                    // InternalDroneDSL.g:4402:6: lv_c_114_0= ruleMD
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
                    // InternalDroneDSL.g:4421:3: ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:4421:3: ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) )
                    // InternalDroneDSL.g:4422:4: ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:4422:4: ( (lv_a_115_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4423:5: (lv_a_115_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4423:5: (lv_a_115_0= ruleRGRD )
                    // InternalDroneDSL.g:4424:6: lv_a_115_0= ruleRGRD
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

                    otherlv_116=(Token)match(input,43,FOLLOW_30); 

                    				newLeafNode(otherlv_116, grammarAccess.getParallele3Access().getAmpersandKeyword_23_1());
                    			
                    // InternalDroneDSL.g:4445:4: ( (lv_b_117_0= ruleGDr ) )
                    // InternalDroneDSL.g:4446:5: (lv_b_117_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:4446:5: (lv_b_117_0= ruleGDr )
                    // InternalDroneDSL.g:4447:6: lv_b_117_0= ruleGDr
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

                    otherlv_118=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_118, grammarAccess.getParallele3Access().getAmpersandKeyword_23_3());
                    			
                    // InternalDroneDSL.g:4468:4: ( (lv_c_119_0= ruleAR ) )
                    // InternalDroneDSL.g:4469:5: (lv_c_119_0= ruleAR )
                    {
                    // InternalDroneDSL.g:4469:5: (lv_c_119_0= ruleAR )
                    // InternalDroneDSL.g:4470:6: lv_c_119_0= ruleAR
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
    // InternalDroneDSL.g:4492:1: entryRuleParallele4 returns [EObject current=null] : iv_ruleParallele4= ruleParallele4 EOF ;
    public final EObject entryRuleParallele4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallele4 = null;


        try {
            // InternalDroneDSL.g:4492:51: (iv_ruleParallele4= ruleParallele4 EOF )
            // InternalDroneDSL.g:4493:2: iv_ruleParallele4= ruleParallele4 EOF
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
    // InternalDroneDSL.g:4499:1: ruleParallele4 returns [EObject current=null] : ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) ) | ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) ) | ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) ) | ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) ) | ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) ) | ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) ) | ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) ) | ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) ) | ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) ) | ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) ) | ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) ) | ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) ) | ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) ) | ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) ) | ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) ) | ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) ) | ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) ) | ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) ) | ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) ) | ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) ) | ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) ) | ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) ) | ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) ) | ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) ) ) ;
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
            // InternalDroneDSL.g:4505:2: ( ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) ) | ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) ) | ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) ) | ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) ) | ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) ) | ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) ) | ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) ) | ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) ) | ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) ) | ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) ) | ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) ) | ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) ) | ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) ) | ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) ) | ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) ) | ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) ) | ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) ) | ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) ) | ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) ) | ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) ) | ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) ) | ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) ) | ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) ) | ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) ) ) )
            // InternalDroneDSL.g:4506:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) ) | ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) ) | ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) ) | ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) ) | ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) ) | ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) ) | ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) ) | ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) ) | ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) ) | ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) ) | ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) ) | ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) ) | ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) ) | ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) ) | ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) ) | ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) ) | ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) ) | ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) ) | ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) ) | ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) ) | ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) ) | ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) ) | ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) ) | ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) ) )
            {
            // InternalDroneDSL.g:4506:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) ) | ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) ) | ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) ) | ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) ) | ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) ) | ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) ) | ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) ) | ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) ) | ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) ) | ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) ) | ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) ) | ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) ) | ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) ) | ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) ) | ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) ) | ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) ) | ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) ) | ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) ) | ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) ) | ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) ) | ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) ) | ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) ) | ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) ) | ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) ) )
            int alt19=24;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalDroneDSL.g:4507:3: ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:4507:3: ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:4508:4: ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:4508:4: ( (lv_a_0_0= ruleAR ) )
                    // InternalDroneDSL.g:4509:5: (lv_a_0_0= ruleAR )
                    {
                    // InternalDroneDSL.g:4509:5: (lv_a_0_0= ruleAR )
                    // InternalDroneDSL.g:4510:6: lv_a_0_0= ruleAR
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

                    otherlv_1=(Token)match(input,43,FOLLOW_30); 

                    				newLeafNode(otherlv_1, grammarAccess.getParallele4Access().getAmpersandKeyword_0_1());
                    			
                    // InternalDroneDSL.g:4531:4: ( (lv_b_2_0= ruleGDr ) )
                    // InternalDroneDSL.g:4532:5: (lv_b_2_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:4532:5: (lv_b_2_0= ruleGDr )
                    // InternalDroneDSL.g:4533:6: lv_b_2_0= ruleGDr
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

                    otherlv_3=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_3, grammarAccess.getParallele4Access().getAmpersandKeyword_0_3());
                    			
                    // InternalDroneDSL.g:4554:4: ( (lv_c_4_0= ruleMD ) )
                    // InternalDroneDSL.g:4555:5: (lv_c_4_0= ruleMD )
                    {
                    // InternalDroneDSL.g:4555:5: (lv_c_4_0= ruleMD )
                    // InternalDroneDSL.g:4556:6: lv_c_4_0= ruleMD
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

                    otherlv_5=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_5, grammarAccess.getParallele4Access().getAmpersandKeyword_0_5());
                    			
                    // InternalDroneDSL.g:4577:4: ( (lv_d_6_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4578:5: (lv_d_6_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4578:5: (lv_d_6_0= ruleRGRD )
                    // InternalDroneDSL.g:4579:6: lv_d_6_0= ruleRGRD
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
                    // InternalDroneDSL.g:4598:3: ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:4598:3: ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) )
                    // InternalDroneDSL.g:4599:4: ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:4599:4: ( (lv_a_7_0= ruleAR ) )
                    // InternalDroneDSL.g:4600:5: (lv_a_7_0= ruleAR )
                    {
                    // InternalDroneDSL.g:4600:5: (lv_a_7_0= ruleAR )
                    // InternalDroneDSL.g:4601:6: lv_a_7_0= ruleAR
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

                    otherlv_8=(Token)match(input,43,FOLLOW_30); 

                    				newLeafNode(otherlv_8, grammarAccess.getParallele4Access().getAmpersandKeyword_1_1());
                    			
                    // InternalDroneDSL.g:4622:4: ( (lv_b_9_0= ruleGDr ) )
                    // InternalDroneDSL.g:4623:5: (lv_b_9_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:4623:5: (lv_b_9_0= ruleGDr )
                    // InternalDroneDSL.g:4624:6: lv_b_9_0= ruleGDr
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

                    otherlv_10=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_10, grammarAccess.getParallele4Access().getAmpersandKeyword_1_3());
                    			
                    // InternalDroneDSL.g:4645:4: ( (lv_c_11_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4646:5: (lv_c_11_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4646:5: (lv_c_11_0= ruleRGRD )
                    // InternalDroneDSL.g:4647:6: lv_c_11_0= ruleRGRD
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

                    otherlv_12=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_12, grammarAccess.getParallele4Access().getAmpersandKeyword_1_5());
                    			
                    // InternalDroneDSL.g:4668:4: ( (lv_d_13_0= ruleMD ) )
                    // InternalDroneDSL.g:4669:5: (lv_d_13_0= ruleMD )
                    {
                    // InternalDroneDSL.g:4669:5: (lv_d_13_0= ruleMD )
                    // InternalDroneDSL.g:4670:6: lv_d_13_0= ruleMD
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
                    // InternalDroneDSL.g:4689:3: ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:4689:3: ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:4690:4: ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:4690:4: ( (lv_a_14_0= ruleAR ) )
                    // InternalDroneDSL.g:4691:5: (lv_a_14_0= ruleAR )
                    {
                    // InternalDroneDSL.g:4691:5: (lv_a_14_0= ruleAR )
                    // InternalDroneDSL.g:4692:6: lv_a_14_0= ruleAR
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

                    otherlv_15=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_15, grammarAccess.getParallele4Access().getAmpersandKeyword_2_1());
                    			
                    // InternalDroneDSL.g:4713:4: ( (lv_b_16_0= ruleMD ) )
                    // InternalDroneDSL.g:4714:5: (lv_b_16_0= ruleMD )
                    {
                    // InternalDroneDSL.g:4714:5: (lv_b_16_0= ruleMD )
                    // InternalDroneDSL.g:4715:6: lv_b_16_0= ruleMD
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

                    otherlv_17=(Token)match(input,43,FOLLOW_30); 

                    				newLeafNode(otherlv_17, grammarAccess.getParallele4Access().getAmpersandKeyword_2_3());
                    			
                    // InternalDroneDSL.g:4736:4: ( (lv_c_18_0= ruleGDr ) )
                    // InternalDroneDSL.g:4737:5: (lv_c_18_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:4737:5: (lv_c_18_0= ruleGDr )
                    // InternalDroneDSL.g:4738:6: lv_c_18_0= ruleGDr
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

                    otherlv_19=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_19, grammarAccess.getParallele4Access().getAmpersandKeyword_2_5());
                    			
                    // InternalDroneDSL.g:4759:4: ( (lv_d_20_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4760:5: (lv_d_20_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4760:5: (lv_d_20_0= ruleRGRD )
                    // InternalDroneDSL.g:4761:6: lv_d_20_0= ruleRGRD
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
                    // InternalDroneDSL.g:4780:3: ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:4780:3: ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:4781:4: ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:4781:4: ( (lv_a_21_0= ruleAR ) )
                    // InternalDroneDSL.g:4782:5: (lv_a_21_0= ruleAR )
                    {
                    // InternalDroneDSL.g:4782:5: (lv_a_21_0= ruleAR )
                    // InternalDroneDSL.g:4783:6: lv_a_21_0= ruleAR
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

                    otherlv_22=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_22, grammarAccess.getParallele4Access().getAmpersandKeyword_3_1());
                    			
                    // InternalDroneDSL.g:4804:4: ( (lv_b_23_0= ruleMD ) )
                    // InternalDroneDSL.g:4805:5: (lv_b_23_0= ruleMD )
                    {
                    // InternalDroneDSL.g:4805:5: (lv_b_23_0= ruleMD )
                    // InternalDroneDSL.g:4806:6: lv_b_23_0= ruleMD
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

                    otherlv_24=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_24, grammarAccess.getParallele4Access().getAmpersandKeyword_3_3());
                    			
                    // InternalDroneDSL.g:4827:4: ( (lv_c_25_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4828:5: (lv_c_25_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4828:5: (lv_c_25_0= ruleRGRD )
                    // InternalDroneDSL.g:4829:6: lv_c_25_0= ruleRGRD
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

                    otherlv_26=(Token)match(input,43,FOLLOW_30); 

                    				newLeafNode(otherlv_26, grammarAccess.getParallele4Access().getAmpersandKeyword_3_5());
                    			
                    // InternalDroneDSL.g:4850:4: ( (lv_d_27_0= ruleGDr ) )
                    // InternalDroneDSL.g:4851:5: (lv_d_27_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:4851:5: (lv_d_27_0= ruleGDr )
                    // InternalDroneDSL.g:4852:6: lv_d_27_0= ruleGDr
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
                    // InternalDroneDSL.g:4871:3: ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:4871:3: ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:4872:4: ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:4872:4: ( (lv_a_28_0= ruleAR ) )
                    // InternalDroneDSL.g:4873:5: (lv_a_28_0= ruleAR )
                    {
                    // InternalDroneDSL.g:4873:5: (lv_a_28_0= ruleAR )
                    // InternalDroneDSL.g:4874:6: lv_a_28_0= ruleAR
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

                    otherlv_29=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_29, grammarAccess.getParallele4Access().getAmpersandKeyword_4_1());
                    			
                    // InternalDroneDSL.g:4895:4: ( (lv_b_30_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4896:5: (lv_b_30_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4896:5: (lv_b_30_0= ruleRGRD )
                    // InternalDroneDSL.g:4897:6: lv_b_30_0= ruleRGRD
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

                    otherlv_31=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_31, grammarAccess.getParallele4Access().getAmpersandKeyword_4_3());
                    			
                    // InternalDroneDSL.g:4918:4: ( (lv_c_32_0= ruleMD ) )
                    // InternalDroneDSL.g:4919:5: (lv_c_32_0= ruleMD )
                    {
                    // InternalDroneDSL.g:4919:5: (lv_c_32_0= ruleMD )
                    // InternalDroneDSL.g:4920:6: lv_c_32_0= ruleMD
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

                    otherlv_33=(Token)match(input,43,FOLLOW_30); 

                    				newLeafNode(otherlv_33, grammarAccess.getParallele4Access().getAmpersandKeyword_4_5());
                    			
                    // InternalDroneDSL.g:4941:4: ( (lv_d_34_0= ruleGDr ) )
                    // InternalDroneDSL.g:4942:5: (lv_d_34_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:4942:5: (lv_d_34_0= ruleGDr )
                    // InternalDroneDSL.g:4943:6: lv_d_34_0= ruleGDr
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
                    // InternalDroneDSL.g:4962:3: ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:4962:3: ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) )
                    // InternalDroneDSL.g:4963:4: ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:4963:4: ( (lv_a_35_0= ruleAR ) )
                    // InternalDroneDSL.g:4964:5: (lv_a_35_0= ruleAR )
                    {
                    // InternalDroneDSL.g:4964:5: (lv_a_35_0= ruleAR )
                    // InternalDroneDSL.g:4965:6: lv_a_35_0= ruleAR
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

                    otherlv_36=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_36, grammarAccess.getParallele4Access().getAmpersandKeyword_5_1());
                    			
                    // InternalDroneDSL.g:4986:4: ( (lv_b_37_0= ruleRGRD ) )
                    // InternalDroneDSL.g:4987:5: (lv_b_37_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:4987:5: (lv_b_37_0= ruleRGRD )
                    // InternalDroneDSL.g:4988:6: lv_b_37_0= ruleRGRD
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

                    otherlv_38=(Token)match(input,43,FOLLOW_30); 

                    				newLeafNode(otherlv_38, grammarAccess.getParallele4Access().getAmpersandKeyword_5_3());
                    			
                    // InternalDroneDSL.g:5009:4: ( (lv_c_39_0= ruleGDr ) )
                    // InternalDroneDSL.g:5010:5: (lv_c_39_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5010:5: (lv_c_39_0= ruleGDr )
                    // InternalDroneDSL.g:5011:6: lv_c_39_0= ruleGDr
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

                    otherlv_40=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_40, grammarAccess.getParallele4Access().getAmpersandKeyword_5_5());
                    			
                    // InternalDroneDSL.g:5032:4: ( (lv_d_41_0= ruleMD ) )
                    // InternalDroneDSL.g:5033:5: (lv_d_41_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5033:5: (lv_d_41_0= ruleMD )
                    // InternalDroneDSL.g:5034:6: lv_d_41_0= ruleMD
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
                    // InternalDroneDSL.g:5053:3: ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:5053:3: ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:5054:4: ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:5054:4: ( (lv_a_42_0= ruleGDr ) )
                    // InternalDroneDSL.g:5055:5: (lv_a_42_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5055:5: (lv_a_42_0= ruleGDr )
                    // InternalDroneDSL.g:5056:6: lv_a_42_0= ruleGDr
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

                    otherlv_43=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_43, grammarAccess.getParallele4Access().getAmpersandKeyword_6_1());
                    			
                    // InternalDroneDSL.g:5077:4: ( (lv_b_44_0= ruleAR ) )
                    // InternalDroneDSL.g:5078:5: (lv_b_44_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5078:5: (lv_b_44_0= ruleAR )
                    // InternalDroneDSL.g:5079:6: lv_b_44_0= ruleAR
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

                    otherlv_45=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_45, grammarAccess.getParallele4Access().getAmpersandKeyword_6_3());
                    			
                    // InternalDroneDSL.g:5100:4: ( (lv_c_46_0= ruleMD ) )
                    // InternalDroneDSL.g:5101:5: (lv_c_46_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5101:5: (lv_c_46_0= ruleMD )
                    // InternalDroneDSL.g:5102:6: lv_c_46_0= ruleMD
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

                    otherlv_47=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_47, grammarAccess.getParallele4Access().getAmpersandKeyword_6_5());
                    			
                    // InternalDroneDSL.g:5123:4: ( (lv_d_48_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5124:5: (lv_d_48_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5124:5: (lv_d_48_0= ruleRGRD )
                    // InternalDroneDSL.g:5125:6: lv_d_48_0= ruleRGRD
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
                    // InternalDroneDSL.g:5144:3: ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:5144:3: ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) )
                    // InternalDroneDSL.g:5145:4: ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:5145:4: ( (lv_a_49_0= ruleGDr ) )
                    // InternalDroneDSL.g:5146:5: (lv_a_49_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5146:5: (lv_a_49_0= ruleGDr )
                    // InternalDroneDSL.g:5147:6: lv_a_49_0= ruleGDr
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

                    otherlv_50=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_50, grammarAccess.getParallele4Access().getAmpersandKeyword_7_1());
                    			
                    // InternalDroneDSL.g:5168:4: ( (lv_b_51_0= ruleAR ) )
                    // InternalDroneDSL.g:5169:5: (lv_b_51_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5169:5: (lv_b_51_0= ruleAR )
                    // InternalDroneDSL.g:5170:6: lv_b_51_0= ruleAR
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

                    otherlv_52=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_52, grammarAccess.getParallele4Access().getAmpersandKeyword_7_3());
                    			
                    // InternalDroneDSL.g:5191:4: ( (lv_c_53_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5192:5: (lv_c_53_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5192:5: (lv_c_53_0= ruleRGRD )
                    // InternalDroneDSL.g:5193:6: lv_c_53_0= ruleRGRD
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

                    otherlv_54=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_54, grammarAccess.getParallele4Access().getAmpersandKeyword_7_5());
                    			
                    // InternalDroneDSL.g:5214:4: ( (lv_d_55_0= ruleMD ) )
                    // InternalDroneDSL.g:5215:5: (lv_d_55_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5215:5: (lv_d_55_0= ruleMD )
                    // InternalDroneDSL.g:5216:6: lv_d_55_0= ruleMD
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
                    // InternalDroneDSL.g:5235:3: ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:5235:3: ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:5236:4: ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:5236:4: ( (lv_a_56_0= ruleGDr ) )
                    // InternalDroneDSL.g:5237:5: (lv_a_56_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5237:5: (lv_a_56_0= ruleGDr )
                    // InternalDroneDSL.g:5238:6: lv_a_56_0= ruleGDr
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

                    otherlv_57=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_57, grammarAccess.getParallele4Access().getAmpersandKeyword_8_1());
                    			
                    // InternalDroneDSL.g:5259:4: ( (lv_b_58_0= ruleMD ) )
                    // InternalDroneDSL.g:5260:5: (lv_b_58_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5260:5: (lv_b_58_0= ruleMD )
                    // InternalDroneDSL.g:5261:6: lv_b_58_0= ruleMD
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

                    otherlv_59=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_59, grammarAccess.getParallele4Access().getAmpersandKeyword_8_3());
                    			
                    // InternalDroneDSL.g:5282:4: ( (lv_c_60_0= ruleAR ) )
                    // InternalDroneDSL.g:5283:5: (lv_c_60_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5283:5: (lv_c_60_0= ruleAR )
                    // InternalDroneDSL.g:5284:6: lv_c_60_0= ruleAR
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

                    otherlv_61=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_61, grammarAccess.getParallele4Access().getAmpersandKeyword_8_5());
                    			
                    // InternalDroneDSL.g:5305:4: ( (lv_d_62_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5306:5: (lv_d_62_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5306:5: (lv_d_62_0= ruleRGRD )
                    // InternalDroneDSL.g:5307:6: lv_d_62_0= ruleRGRD
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
                    // InternalDroneDSL.g:5326:3: ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:5326:3: ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) )
                    // InternalDroneDSL.g:5327:4: ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:5327:4: ( (lv_a_63_0= ruleGDr ) )
                    // InternalDroneDSL.g:5328:5: (lv_a_63_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5328:5: (lv_a_63_0= ruleGDr )
                    // InternalDroneDSL.g:5329:6: lv_a_63_0= ruleGDr
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

                    otherlv_64=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_64, grammarAccess.getParallele4Access().getAmpersandKeyword_9_1());
                    			
                    // InternalDroneDSL.g:5350:4: ( (lv_b_65_0= ruleMD ) )
                    // InternalDroneDSL.g:5351:5: (lv_b_65_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5351:5: (lv_b_65_0= ruleMD )
                    // InternalDroneDSL.g:5352:6: lv_b_65_0= ruleMD
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

                    otherlv_66=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_66, grammarAccess.getParallele4Access().getAmpersandKeyword_9_3());
                    			
                    // InternalDroneDSL.g:5373:4: ( (lv_c_67_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5374:5: (lv_c_67_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5374:5: (lv_c_67_0= ruleRGRD )
                    // InternalDroneDSL.g:5375:6: lv_c_67_0= ruleRGRD
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

                    otherlv_68=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_68, grammarAccess.getParallele4Access().getAmpersandKeyword_9_5());
                    			
                    // InternalDroneDSL.g:5396:4: ( (lv_d_69_0= ruleAR ) )
                    // InternalDroneDSL.g:5397:5: (lv_d_69_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5397:5: (lv_d_69_0= ruleAR )
                    // InternalDroneDSL.g:5398:6: lv_d_69_0= ruleAR
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
                    // InternalDroneDSL.g:5417:3: ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:5417:3: ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) )
                    // InternalDroneDSL.g:5418:4: ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:5418:4: ( (lv_a_70_0= ruleGDr ) )
                    // InternalDroneDSL.g:5419:5: (lv_a_70_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5419:5: (lv_a_70_0= ruleGDr )
                    // InternalDroneDSL.g:5420:6: lv_a_70_0= ruleGDr
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

                    otherlv_71=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_71, grammarAccess.getParallele4Access().getAmpersandKeyword_10_1());
                    			
                    // InternalDroneDSL.g:5441:4: ( (lv_b_72_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5442:5: (lv_b_72_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5442:5: (lv_b_72_0= ruleRGRD )
                    // InternalDroneDSL.g:5443:6: lv_b_72_0= ruleRGRD
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

                    otherlv_73=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_73, grammarAccess.getParallele4Access().getAmpersandKeyword_10_3());
                    			
                    // InternalDroneDSL.g:5464:4: ( (lv_c_74_0= ruleAR ) )
                    // InternalDroneDSL.g:5465:5: (lv_c_74_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5465:5: (lv_c_74_0= ruleAR )
                    // InternalDroneDSL.g:5466:6: lv_c_74_0= ruleAR
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

                    otherlv_75=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_75, grammarAccess.getParallele4Access().getAmpersandKeyword_10_5());
                    			
                    // InternalDroneDSL.g:5487:4: ( (lv_d_76_0= ruleMD ) )
                    // InternalDroneDSL.g:5488:5: (lv_d_76_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5488:5: (lv_d_76_0= ruleMD )
                    // InternalDroneDSL.g:5489:6: lv_d_76_0= ruleMD
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
                    // InternalDroneDSL.g:5508:3: ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:5508:3: ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) )
                    // InternalDroneDSL.g:5509:4: ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:5509:4: ( (lv_a_77_0= ruleGDr ) )
                    // InternalDroneDSL.g:5510:5: (lv_a_77_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5510:5: (lv_a_77_0= ruleGDr )
                    // InternalDroneDSL.g:5511:6: lv_a_77_0= ruleGDr
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

                    otherlv_78=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_78, grammarAccess.getParallele4Access().getAmpersandKeyword_11_1());
                    			
                    // InternalDroneDSL.g:5532:4: ( (lv_b_79_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5533:5: (lv_b_79_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5533:5: (lv_b_79_0= ruleRGRD )
                    // InternalDroneDSL.g:5534:6: lv_b_79_0= ruleRGRD
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

                    otherlv_80=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_80, grammarAccess.getParallele4Access().getAmpersandKeyword_11_3());
                    			
                    // InternalDroneDSL.g:5555:4: ( (lv_c_81_0= ruleMD ) )
                    // InternalDroneDSL.g:5556:5: (lv_c_81_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5556:5: (lv_c_81_0= ruleMD )
                    // InternalDroneDSL.g:5557:6: lv_c_81_0= ruleMD
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

                    otherlv_82=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_82, grammarAccess.getParallele4Access().getAmpersandKeyword_11_5());
                    			
                    // InternalDroneDSL.g:5578:4: ( (lv_d_83_0= ruleAR ) )
                    // InternalDroneDSL.g:5579:5: (lv_d_83_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5579:5: (lv_d_83_0= ruleAR )
                    // InternalDroneDSL.g:5580:6: lv_d_83_0= ruleAR
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
                    // InternalDroneDSL.g:5599:3: ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:5599:3: ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:5600:4: ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:5600:4: ( (lv_a_84_0= ruleMD ) )
                    // InternalDroneDSL.g:5601:5: (lv_a_84_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5601:5: (lv_a_84_0= ruleMD )
                    // InternalDroneDSL.g:5602:6: lv_a_84_0= ruleMD
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

                    otherlv_85=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_85, grammarAccess.getParallele4Access().getAmpersandKeyword_12_1());
                    			
                    // InternalDroneDSL.g:5623:4: ( (lv_b_86_0= ruleAR ) )
                    // InternalDroneDSL.g:5624:5: (lv_b_86_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5624:5: (lv_b_86_0= ruleAR )
                    // InternalDroneDSL.g:5625:6: lv_b_86_0= ruleAR
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

                    otherlv_87=(Token)match(input,43,FOLLOW_30); 

                    				newLeafNode(otherlv_87, grammarAccess.getParallele4Access().getAmpersandKeyword_12_3());
                    			
                    // InternalDroneDSL.g:5646:4: ( (lv_c_88_0= ruleGDr ) )
                    // InternalDroneDSL.g:5647:5: (lv_c_88_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5647:5: (lv_c_88_0= ruleGDr )
                    // InternalDroneDSL.g:5648:6: lv_c_88_0= ruleGDr
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

                    otherlv_89=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_89, grammarAccess.getParallele4Access().getAmpersandKeyword_12_5());
                    			
                    // InternalDroneDSL.g:5669:4: ( (lv_d_90_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5670:5: (lv_d_90_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5670:5: (lv_d_90_0= ruleRGRD )
                    // InternalDroneDSL.g:5671:6: lv_d_90_0= ruleRGRD
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
                    // InternalDroneDSL.g:5690:3: ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:5690:3: ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:5691:4: ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:5691:4: ( (lv_a_91_0= ruleMD ) )
                    // InternalDroneDSL.g:5692:5: (lv_a_91_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5692:5: (lv_a_91_0= ruleMD )
                    // InternalDroneDSL.g:5693:6: lv_a_91_0= ruleMD
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

                    otherlv_92=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_92, grammarAccess.getParallele4Access().getAmpersandKeyword_13_1());
                    			
                    // InternalDroneDSL.g:5714:4: ( (lv_b_93_0= ruleAR ) )
                    // InternalDroneDSL.g:5715:5: (lv_b_93_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5715:5: (lv_b_93_0= ruleAR )
                    // InternalDroneDSL.g:5716:6: lv_b_93_0= ruleAR
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

                    otherlv_94=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_94, grammarAccess.getParallele4Access().getAmpersandKeyword_13_3());
                    			
                    // InternalDroneDSL.g:5737:4: ( (lv_c_95_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5738:5: (lv_c_95_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5738:5: (lv_c_95_0= ruleRGRD )
                    // InternalDroneDSL.g:5739:6: lv_c_95_0= ruleRGRD
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

                    otherlv_96=(Token)match(input,43,FOLLOW_30); 

                    				newLeafNode(otherlv_96, grammarAccess.getParallele4Access().getAmpersandKeyword_13_5());
                    			
                    // InternalDroneDSL.g:5760:4: ( (lv_d_97_0= ruleGDr ) )
                    // InternalDroneDSL.g:5761:5: (lv_d_97_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5761:5: (lv_d_97_0= ruleGDr )
                    // InternalDroneDSL.g:5762:6: lv_d_97_0= ruleGDr
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
                    // InternalDroneDSL.g:5781:3: ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSL.g:5781:3: ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) )
                    // InternalDroneDSL.g:5782:4: ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) )
                    {
                    // InternalDroneDSL.g:5782:4: ( (lv_a_98_0= ruleMD ) )
                    // InternalDroneDSL.g:5783:5: (lv_a_98_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5783:5: (lv_a_98_0= ruleMD )
                    // InternalDroneDSL.g:5784:6: lv_a_98_0= ruleMD
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

                    otherlv_99=(Token)match(input,43,FOLLOW_30); 

                    				newLeafNode(otherlv_99, grammarAccess.getParallele4Access().getAmpersandKeyword_14_1());
                    			
                    // InternalDroneDSL.g:5805:4: ( (lv_b_100_0= ruleGDr ) )
                    // InternalDroneDSL.g:5806:5: (lv_b_100_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5806:5: (lv_b_100_0= ruleGDr )
                    // InternalDroneDSL.g:5807:6: lv_b_100_0= ruleGDr
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

                    otherlv_101=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_101, grammarAccess.getParallele4Access().getAmpersandKeyword_14_3());
                    			
                    // InternalDroneDSL.g:5828:4: ( (lv_c_102_0= ruleAR ) )
                    // InternalDroneDSL.g:5829:5: (lv_c_102_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5829:5: (lv_c_102_0= ruleAR )
                    // InternalDroneDSL.g:5830:6: lv_c_102_0= ruleAR
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

                    otherlv_103=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_103, grammarAccess.getParallele4Access().getAmpersandKeyword_14_5());
                    			
                    // InternalDroneDSL.g:5851:4: ( (lv_d_104_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5852:5: (lv_d_104_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5852:5: (lv_d_104_0= ruleRGRD )
                    // InternalDroneDSL.g:5853:6: lv_d_104_0= ruleRGRD
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
                    // InternalDroneDSL.g:5872:3: ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:5872:3: ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) )
                    // InternalDroneDSL.g:5873:4: ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:5873:4: ( (lv_a_105_0= ruleMD ) )
                    // InternalDroneDSL.g:5874:5: (lv_a_105_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5874:5: (lv_a_105_0= ruleMD )
                    // InternalDroneDSL.g:5875:6: lv_a_105_0= ruleMD
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

                    otherlv_106=(Token)match(input,43,FOLLOW_30); 

                    				newLeafNode(otherlv_106, grammarAccess.getParallele4Access().getAmpersandKeyword_15_1());
                    			
                    // InternalDroneDSL.g:5896:4: ( (lv_b_107_0= ruleGDr ) )
                    // InternalDroneDSL.g:5897:5: (lv_b_107_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:5897:5: (lv_b_107_0= ruleGDr )
                    // InternalDroneDSL.g:5898:6: lv_b_107_0= ruleGDr
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

                    otherlv_108=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_108, grammarAccess.getParallele4Access().getAmpersandKeyword_15_3());
                    			
                    // InternalDroneDSL.g:5919:4: ( (lv_c_109_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5920:5: (lv_c_109_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5920:5: (lv_c_109_0= ruleRGRD )
                    // InternalDroneDSL.g:5921:6: lv_c_109_0= ruleRGRD
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

                    otherlv_110=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_110, grammarAccess.getParallele4Access().getAmpersandKeyword_15_5());
                    			
                    // InternalDroneDSL.g:5942:4: ( (lv_d_111_0= ruleAR ) )
                    // InternalDroneDSL.g:5943:5: (lv_d_111_0= ruleAR )
                    {
                    // InternalDroneDSL.g:5943:5: (lv_d_111_0= ruleAR )
                    // InternalDroneDSL.g:5944:6: lv_d_111_0= ruleAR
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
                    // InternalDroneDSL.g:5963:3: ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:5963:3: ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) )
                    // InternalDroneDSL.g:5964:4: ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:5964:4: ( (lv_a_112_0= ruleMD ) )
                    // InternalDroneDSL.g:5965:5: (lv_a_112_0= ruleMD )
                    {
                    // InternalDroneDSL.g:5965:5: (lv_a_112_0= ruleMD )
                    // InternalDroneDSL.g:5966:6: lv_a_112_0= ruleMD
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

                    otherlv_113=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_113, grammarAccess.getParallele4Access().getAmpersandKeyword_16_1());
                    			
                    // InternalDroneDSL.g:5987:4: ( (lv_b_114_0= ruleRGRD ) )
                    // InternalDroneDSL.g:5988:5: (lv_b_114_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:5988:5: (lv_b_114_0= ruleRGRD )
                    // InternalDroneDSL.g:5989:6: lv_b_114_0= ruleRGRD
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

                    otherlv_115=(Token)match(input,43,FOLLOW_30); 

                    				newLeafNode(otherlv_115, grammarAccess.getParallele4Access().getAmpersandKeyword_16_3());
                    			
                    // InternalDroneDSL.g:6010:4: ( (lv_c_116_0= ruleGDr ) )
                    // InternalDroneDSL.g:6011:5: (lv_c_116_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:6011:5: (lv_c_116_0= ruleGDr )
                    // InternalDroneDSL.g:6012:6: lv_c_116_0= ruleGDr
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

                    otherlv_117=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_117, grammarAccess.getParallele4Access().getAmpersandKeyword_16_5());
                    			
                    // InternalDroneDSL.g:6033:4: ( (lv_d_118_0= ruleAR ) )
                    // InternalDroneDSL.g:6034:5: (lv_d_118_0= ruleAR )
                    {
                    // InternalDroneDSL.g:6034:5: (lv_d_118_0= ruleAR )
                    // InternalDroneDSL.g:6035:6: lv_d_118_0= ruleAR
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
                    // InternalDroneDSL.g:6054:3: ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:6054:3: ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:6055:4: ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:6055:4: ( (lv_a_119_0= ruleMD ) )
                    // InternalDroneDSL.g:6056:5: (lv_a_119_0= ruleMD )
                    {
                    // InternalDroneDSL.g:6056:5: (lv_a_119_0= ruleMD )
                    // InternalDroneDSL.g:6057:6: lv_a_119_0= ruleMD
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

                    otherlv_120=(Token)match(input,43,FOLLOW_32); 

                    				newLeafNode(otherlv_120, grammarAccess.getParallele4Access().getAmpersandKeyword_17_1());
                    			
                    // InternalDroneDSL.g:6078:4: ( (lv_b_121_0= ruleRGRD ) )
                    // InternalDroneDSL.g:6079:5: (lv_b_121_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:6079:5: (lv_b_121_0= ruleRGRD )
                    // InternalDroneDSL.g:6080:6: lv_b_121_0= ruleRGRD
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

                    otherlv_122=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_122, grammarAccess.getParallele4Access().getAmpersandKeyword_17_3());
                    			
                    // InternalDroneDSL.g:6101:4: ( (lv_c_123_0= ruleAR ) )
                    // InternalDroneDSL.g:6102:5: (lv_c_123_0= ruleAR )
                    {
                    // InternalDroneDSL.g:6102:5: (lv_c_123_0= ruleAR )
                    // InternalDroneDSL.g:6103:6: lv_c_123_0= ruleAR
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

                    otherlv_124=(Token)match(input,43,FOLLOW_30); 

                    				newLeafNode(otherlv_124, grammarAccess.getParallele4Access().getAmpersandKeyword_17_5());
                    			
                    // InternalDroneDSL.g:6124:4: ( (lv_d_125_0= ruleGDr ) )
                    // InternalDroneDSL.g:6125:5: (lv_d_125_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:6125:5: (lv_d_125_0= ruleGDr )
                    // InternalDroneDSL.g:6126:6: lv_d_125_0= ruleGDr
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
                    // InternalDroneDSL.g:6145:3: ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:6145:3: ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:6146:4: ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:6146:4: ( (lv_a_126_0= ruleRGRD ) )
                    // InternalDroneDSL.g:6147:5: (lv_a_126_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:6147:5: (lv_a_126_0= ruleRGRD )
                    // InternalDroneDSL.g:6148:6: lv_a_126_0= ruleRGRD
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

                    otherlv_127=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_127, grammarAccess.getParallele4Access().getAmpersandKeyword_18_1());
                    			
                    // InternalDroneDSL.g:6169:4: ( (lv_b_128_0= ruleAR ) )
                    // InternalDroneDSL.g:6170:5: (lv_b_128_0= ruleAR )
                    {
                    // InternalDroneDSL.g:6170:5: (lv_b_128_0= ruleAR )
                    // InternalDroneDSL.g:6171:6: lv_b_128_0= ruleAR
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

                    otherlv_129=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_129, grammarAccess.getParallele4Access().getAmpersandKeyword_18_3());
                    			
                    // InternalDroneDSL.g:6192:4: ( (lv_c_130_0= ruleMD ) )
                    // InternalDroneDSL.g:6193:5: (lv_c_130_0= ruleMD )
                    {
                    // InternalDroneDSL.g:6193:5: (lv_c_130_0= ruleMD )
                    // InternalDroneDSL.g:6194:6: lv_c_130_0= ruleMD
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

                    otherlv_131=(Token)match(input,43,FOLLOW_30); 

                    				newLeafNode(otherlv_131, grammarAccess.getParallele4Access().getAmpersandKeyword_18_5());
                    			
                    // InternalDroneDSL.g:6215:4: ( (lv_d_132_0= ruleGDr ) )
                    // InternalDroneDSL.g:6216:5: (lv_d_132_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:6216:5: (lv_d_132_0= ruleGDr )
                    // InternalDroneDSL.g:6217:6: lv_d_132_0= ruleGDr
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
                    // InternalDroneDSL.g:6236:3: ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:6236:3: ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) )
                    // InternalDroneDSL.g:6237:4: ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:6237:4: ( (lv_a_133_0= ruleRGRD ) )
                    // InternalDroneDSL.g:6238:5: (lv_a_133_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:6238:5: (lv_a_133_0= ruleRGRD )
                    // InternalDroneDSL.g:6239:6: lv_a_133_0= ruleRGRD
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

                    otherlv_134=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_134, grammarAccess.getParallele4Access().getAmpersandKeyword_19_1());
                    			
                    // InternalDroneDSL.g:6260:4: ( (lv_b_135_0= ruleAR ) )
                    // InternalDroneDSL.g:6261:5: (lv_b_135_0= ruleAR )
                    {
                    // InternalDroneDSL.g:6261:5: (lv_b_135_0= ruleAR )
                    // InternalDroneDSL.g:6262:6: lv_b_135_0= ruleAR
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

                    otherlv_136=(Token)match(input,43,FOLLOW_30); 

                    				newLeafNode(otherlv_136, grammarAccess.getParallele4Access().getAmpersandKeyword_19_3());
                    			
                    // InternalDroneDSL.g:6283:4: ( (lv_c_137_0= ruleGDr ) )
                    // InternalDroneDSL.g:6284:5: (lv_c_137_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:6284:5: (lv_c_137_0= ruleGDr )
                    // InternalDroneDSL.g:6285:6: lv_c_137_0= ruleGDr
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

                    otherlv_138=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_138, grammarAccess.getParallele4Access().getAmpersandKeyword_19_5());
                    			
                    // InternalDroneDSL.g:6306:4: ( (lv_d_139_0= ruleMD ) )
                    // InternalDroneDSL.g:6307:5: (lv_d_139_0= ruleMD )
                    {
                    // InternalDroneDSL.g:6307:5: (lv_d_139_0= ruleMD )
                    // InternalDroneDSL.g:6308:6: lv_d_139_0= ruleMD
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
                    // InternalDroneDSL.g:6327:3: ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSL.g:6327:3: ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) )
                    // InternalDroneDSL.g:6328:4: ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) )
                    {
                    // InternalDroneDSL.g:6328:4: ( (lv_a_140_0= ruleRGRD ) )
                    // InternalDroneDSL.g:6329:5: (lv_a_140_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:6329:5: (lv_a_140_0= ruleRGRD )
                    // InternalDroneDSL.g:6330:6: lv_a_140_0= ruleRGRD
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

                    otherlv_141=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_141, grammarAccess.getParallele4Access().getAmpersandKeyword_20_1());
                    			
                    // InternalDroneDSL.g:6351:4: ( (lv_b_142_0= ruleMD ) )
                    // InternalDroneDSL.g:6352:5: (lv_b_142_0= ruleMD )
                    {
                    // InternalDroneDSL.g:6352:5: (lv_b_142_0= ruleMD )
                    // InternalDroneDSL.g:6353:6: lv_b_142_0= ruleMD
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

                    otherlv_143=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_143, grammarAccess.getParallele4Access().getAmpersandKeyword_20_3());
                    			
                    // InternalDroneDSL.g:6374:4: ( (lv_c_144_0= ruleAR ) )
                    // InternalDroneDSL.g:6375:5: (lv_c_144_0= ruleAR )
                    {
                    // InternalDroneDSL.g:6375:5: (lv_c_144_0= ruleAR )
                    // InternalDroneDSL.g:6376:6: lv_c_144_0= ruleAR
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

                    otherlv_145=(Token)match(input,43,FOLLOW_30); 

                    				newLeafNode(otherlv_145, grammarAccess.getParallele4Access().getAmpersandKeyword_20_5());
                    			
                    // InternalDroneDSL.g:6397:4: ( (lv_d_146_0= ruleGDr ) )
                    // InternalDroneDSL.g:6398:5: (lv_d_146_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:6398:5: (lv_d_146_0= ruleGDr )
                    // InternalDroneDSL.g:6399:6: lv_d_146_0= ruleGDr
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
                    // InternalDroneDSL.g:6418:3: ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:6418:3: ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) )
                    // InternalDroneDSL.g:6419:4: ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:6419:4: ( (lv_a_147_0= ruleRGRD ) )
                    // InternalDroneDSL.g:6420:5: (lv_a_147_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:6420:5: (lv_a_147_0= ruleRGRD )
                    // InternalDroneDSL.g:6421:6: lv_a_147_0= ruleRGRD
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

                    otherlv_148=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_148, grammarAccess.getParallele4Access().getAmpersandKeyword_21_1());
                    			
                    // InternalDroneDSL.g:6442:4: ( (lv_b_149_0= ruleMD ) )
                    // InternalDroneDSL.g:6443:5: (lv_b_149_0= ruleMD )
                    {
                    // InternalDroneDSL.g:6443:5: (lv_b_149_0= ruleMD )
                    // InternalDroneDSL.g:6444:6: lv_b_149_0= ruleMD
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

                    otherlv_150=(Token)match(input,43,FOLLOW_30); 

                    				newLeafNode(otherlv_150, grammarAccess.getParallele4Access().getAmpersandKeyword_21_3());
                    			
                    // InternalDroneDSL.g:6465:4: ( (lv_c_151_0= ruleGDr ) )
                    // InternalDroneDSL.g:6466:5: (lv_c_151_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:6466:5: (lv_c_151_0= ruleGDr )
                    // InternalDroneDSL.g:6467:6: lv_c_151_0= ruleGDr
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

                    otherlv_152=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_152, grammarAccess.getParallele4Access().getAmpersandKeyword_21_5());
                    			
                    // InternalDroneDSL.g:6488:4: ( (lv_d_153_0= ruleAR ) )
                    // InternalDroneDSL.g:6489:5: (lv_d_153_0= ruleAR )
                    {
                    // InternalDroneDSL.g:6489:5: (lv_d_153_0= ruleAR )
                    // InternalDroneDSL.g:6490:6: lv_d_153_0= ruleAR
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
                    // InternalDroneDSL.g:6509:3: ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) )
                    {
                    // InternalDroneDSL.g:6509:3: ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) )
                    // InternalDroneDSL.g:6510:4: ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) )
                    {
                    // InternalDroneDSL.g:6510:4: ( (lv_a_154_0= ruleRGRD ) )
                    // InternalDroneDSL.g:6511:5: (lv_a_154_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:6511:5: (lv_a_154_0= ruleRGRD )
                    // InternalDroneDSL.g:6512:6: lv_a_154_0= ruleRGRD
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

                    otherlv_155=(Token)match(input,43,FOLLOW_30); 

                    				newLeafNode(otherlv_155, grammarAccess.getParallele4Access().getAmpersandKeyword_22_1());
                    			
                    // InternalDroneDSL.g:6533:4: ( (lv_b_156_0= ruleGDr ) )
                    // InternalDroneDSL.g:6534:5: (lv_b_156_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:6534:5: (lv_b_156_0= ruleGDr )
                    // InternalDroneDSL.g:6535:6: lv_b_156_0= ruleGDr
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

                    otherlv_157=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_157, grammarAccess.getParallele4Access().getAmpersandKeyword_22_3());
                    			
                    // InternalDroneDSL.g:6556:4: ( (lv_c_158_0= ruleMD ) )
                    // InternalDroneDSL.g:6557:5: (lv_c_158_0= ruleMD )
                    {
                    // InternalDroneDSL.g:6557:5: (lv_c_158_0= ruleMD )
                    // InternalDroneDSL.g:6558:6: lv_c_158_0= ruleMD
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

                    otherlv_159=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_159, grammarAccess.getParallele4Access().getAmpersandKeyword_22_5());
                    			
                    // InternalDroneDSL.g:6579:4: ( (lv_d_160_0= ruleAR ) )
                    // InternalDroneDSL.g:6580:5: (lv_d_160_0= ruleAR )
                    {
                    // InternalDroneDSL.g:6580:5: (lv_d_160_0= ruleAR )
                    // InternalDroneDSL.g:6581:6: lv_d_160_0= ruleAR
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
                    // InternalDroneDSL.g:6600:3: ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) )
                    {
                    // InternalDroneDSL.g:6600:3: ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) )
                    // InternalDroneDSL.g:6601:4: ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) )
                    {
                    // InternalDroneDSL.g:6601:4: ( (lv_a_161_0= ruleRGRD ) )
                    // InternalDroneDSL.g:6602:5: (lv_a_161_0= ruleRGRD )
                    {
                    // InternalDroneDSL.g:6602:5: (lv_a_161_0= ruleRGRD )
                    // InternalDroneDSL.g:6603:6: lv_a_161_0= ruleRGRD
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

                    otherlv_162=(Token)match(input,43,FOLLOW_30); 

                    				newLeafNode(otherlv_162, grammarAccess.getParallele4Access().getAmpersandKeyword_23_1());
                    			
                    // InternalDroneDSL.g:6624:4: ( (lv_b_163_0= ruleGDr ) )
                    // InternalDroneDSL.g:6625:5: (lv_b_163_0= ruleGDr )
                    {
                    // InternalDroneDSL.g:6625:5: (lv_b_163_0= ruleGDr )
                    // InternalDroneDSL.g:6626:6: lv_b_163_0= ruleGDr
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

                    otherlv_164=(Token)match(input,43,FOLLOW_31); 

                    				newLeafNode(otherlv_164, grammarAccess.getParallele4Access().getAmpersandKeyword_23_3());
                    			
                    // InternalDroneDSL.g:6647:4: ( (lv_c_165_0= ruleAR ) )
                    // InternalDroneDSL.g:6648:5: (lv_c_165_0= ruleAR )
                    {
                    // InternalDroneDSL.g:6648:5: (lv_c_165_0= ruleAR )
                    // InternalDroneDSL.g:6649:6: lv_c_165_0= ruleAR
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

                    otherlv_166=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_166, grammarAccess.getParallele4Access().getAmpersandKeyword_23_5());
                    			
                    // InternalDroneDSL.g:6670:4: ( (lv_d_167_0= ruleMD ) )
                    // InternalDroneDSL.g:6671:5: (lv_d_167_0= ruleMD )
                    {
                    // InternalDroneDSL.g:6671:5: (lv_d_167_0= ruleMD )
                    // InternalDroneDSL.g:6672:6: lv_d_167_0= ruleMD
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


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA19 dfa19 = new DFA19(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\32\7\uffff\1\5\2\uffff\2\35\2\uffff";
    static final String dfa_3s = "\1\45\7\uffff\1\7\2\uffff\2\36\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\11\1\12\2\uffff\1\10\1\13";
    static final String dfa_5s = "\17\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\1\5\2\uffff\1\6\1\3\1\4\1\7\1\10\1\11\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\13\1\uffff\1\14",
            "",
            "",
            "\1\15\1\16",
            "\1\15\1\16",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1650:2: (this_Decoller_0= ruleDecoller | this_Atterrir_1= ruleAtterrir | this_Avancer_2= ruleAvancer | this_Reculer_3= ruleReculer | this_Monter_4= ruleMonter | this_Descendre_5= ruleDescendre | this_Gauche_6= ruleGauche | this_Droite_7= ruleDroite | this_RotationGauche_8= ruleRotationGauche | this_RotationDroite_9= ruleRotationDroite | this_Pause_10= rulePause )";
        }
    }
    static final String dfa_7s = "\75\uffff";
    static final String dfa_8s = "\1\7\2\uffff\10\5\1\uffff\20\35\10\6\20\36\10\7\1\uffff";
    static final String dfa_9s = "\1\45\2\uffff\10\7\1\uffff\12\35\2\36\4\35\10\7\20\36\10\53\1\uffff";
    static final String dfa_10s = "\1\uffff\1\1\1\2\10\uffff\1\4\60\uffff\1\3";
    static final String dfa_11s = "\75\uffff}>";
    static final String[] dfa_12s = {
            "\1\13\17\uffff\1\1\1\uffff\1\1\2\2\1\5\2\uffff\1\6\1\3\1\4\1\7\1\10\1\11\1\12",
            "",
            "",
            "\1\14\1\uffff\1\15",
            "\1\16\1\uffff\1\17",
            "\1\20\1\uffff\1\21",
            "\1\22\1\uffff\1\23",
            "\1\24\1\uffff\1\25",
            "\1\26\1\uffff\1\27",
            "\1\30\1\uffff\1\31",
            "\1\32\1\uffff\1\33",
            "",
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
            "\1\41\1\2",
            "\1\41\1\2",
            "\1\42",
            "\1\42",
            "\1\43",
            "\1\43",
            "\1\44\1\45",
            "\1\46\1\47",
            "\1\50\1\51",
            "\1\52\1\53",
            "\1\54\1\55",
            "\1\56\1\57",
            "\1\60\1\61",
            "\1\62\1\63",
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
            "\1\2\17\uffff\1\2\1\uffff\4\2\2\uffff\7\2\3\uffff\1\2\1\uffff\1\74",
            "\1\2\17\uffff\1\2\1\uffff\4\2\2\uffff\7\2\3\uffff\1\2\1\uffff\1\74",
            "\1\2\17\uffff\1\2\1\uffff\4\2\2\uffff\7\2\3\uffff\1\2\1\uffff\1\74",
            "\1\2\17\uffff\1\2\1\uffff\4\2\2\uffff\7\2\3\uffff\1\2\1\uffff\1\74",
            "\1\2\17\uffff\1\2\1\uffff\4\2\2\uffff\7\2\3\uffff\1\2\1\uffff\1\74",
            "\1\2\17\uffff\1\2\1\uffff\4\2\2\uffff\7\2\3\uffff\1\2\1\uffff\1\74",
            "\1\2\17\uffff\1\2\1\uffff\4\2\2\uffff\7\2\3\uffff\1\2\1\uffff\1\74",
            "\1\2\17\uffff\1\2\1\uffff\4\2\2\uffff\7\2\3\uffff\1\2\1\uffff\1\74",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1800:5: (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall )";
        }
    }
    static final String[] dfa_13s = {
            "\1\13\17\uffff\1\1\1\uffff\1\1\2\2\1\5\2\uffff\1\6\1\3\1\4\1\7\1\10\1\11\1\12",
            "",
            "",
            "\1\14\1\uffff\1\15",
            "\1\16\1\uffff\1\17",
            "\1\20\1\uffff\1\21",
            "\1\22\1\uffff\1\23",
            "\1\24\1\uffff\1\25",
            "\1\26\1\uffff\1\27",
            "\1\30\1\uffff\1\31",
            "\1\32\1\uffff\1\33",
            "",
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
            "\1\41\1\2",
            "\1\41\1\2",
            "\1\42",
            "\1\42",
            "\1\43",
            "\1\43",
            "\1\44\1\45",
            "\1\46\1\47",
            "\1\50\1\51",
            "\1\52\1\53",
            "\1\54\1\55",
            "\1\56\1\57",
            "\1\60\1\61",
            "\1\62\1\63",
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
            "\1\2\17\uffff\1\2\1\uffff\4\2\2\uffff\7\2\5\uffff\1\74",
            "\1\2\17\uffff\1\2\1\uffff\4\2\2\uffff\7\2\5\uffff\1\74",
            "\1\2\17\uffff\1\2\1\uffff\4\2\2\uffff\7\2\5\uffff\1\74",
            "\1\2\17\uffff\1\2\1\uffff\4\2\2\uffff\7\2\5\uffff\1\74",
            "\1\2\17\uffff\1\2\1\uffff\4\2\2\uffff\7\2\5\uffff\1\74",
            "\1\2\17\uffff\1\2\1\uffff\4\2\2\uffff\7\2\5\uffff\1\74",
            "\1\2\17\uffff\1\2\1\uffff\4\2\2\uffff\7\2\5\uffff\1\74",
            "\1\2\17\uffff\1\2\1\uffff\4\2\2\uffff\7\2\5\uffff\1\74",
            ""
    };
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1986:5: (lv_mainbody_3_1= ruleVarDecl | lv_mainbody_3_2= ruleCommandeBasique | lv_mainbody_3_3= ruleParallele | lv_mainbody_3_4= ruleFonctionCall )";
        }
    }
    static final String dfa_14s = "\u0244\uffff";
    static final String dfa_15s = "\u00cd\uffff\30\u00e6\u012d\uffff\60\u0243\2\uffff";
    static final String dfa_16s = "\1\34\10\5\20\35\10\6\20\36\10\53\1\40\3\34\30\5\60\35\30\6\60\36\30\7\1\40\1\uffff\1\40\1\42\2\34\1\40\1\34\1\40\1\34\1\42\2\34\60\5\140\35\60\6\140\36\60\7\2\uffff";
    static final String dfa_17s = "\1\45\10\7\20\35\10\7\20\36\10\53\2\45\1\43\1\45\30\7\60\35\30\7\60\36\30\53\1\43\1\uffff\2\45\1\41\2\45\2\43\1\41\1\45\1\43\1\45\60\7\140\35\60\7\140\36\60\53\2\uffff";
    static final String dfa_18s = "\u00e6\uffff\1\1\u015b\uffff\1\3\1\2";
    static final String dfa_19s = "\u0244\uffff}>";
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
            "\1\101\1\102\1\77\1\100\1\75\1\76",
            "\1\107\2\uffff\1\110\1\105\1\106\2\uffff\1\103\1\104",
            "\1\113\2\uffff\1\114\1\111\1\112\1\115\1\116",
            "\1\117\2\uffff\1\120\2\uffff\1\123\1\124\1\121\1\122",
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
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\7\u00e6\3\uffff\1\u00e6\1\uffff\1\u00e5",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\7\u00e6\3\uffff\1\u00e6\1\uffff\1\u00e5",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\7\u00e6\3\uffff\1\u00e6\1\uffff\1\u00e7",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\7\u00e6\3\uffff\1\u00e6\1\uffff\1\u00e7",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\7\u00e6\3\uffff\1\u00e6\1\uffff\1\u00e8",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\7\u00e6\3\uffff\1\u00e6\1\uffff\1\u00e8",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\7\u00e6\3\uffff\1\u00e6\1\uffff\1\u00e9",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\7\u00e6\3\uffff\1\u00e6\1\uffff\1\u00e9",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\7\u00e6\3\uffff\1\u00e6\1\uffff\1\u00ea",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\7\u00e6\3\uffff\1\u00e6\1\uffff\1\u00ea",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\7\u00e6\3\uffff\1\u00e6\1\uffff\1\u00eb",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\7\u00e6\3\uffff\1\u00e6\1\uffff\1\u00eb",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\7\u00e6\3\uffff\1\u00e6\1\uffff\1\u00ec",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\7\u00e6\3\uffff\1\u00e6\1\uffff\1\u00ec",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\7\u00e6\3\uffff\1\u00e6\1\uffff\1\u00ed",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\7\u00e6\3\uffff\1\u00e6\1\uffff\1\u00ed",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\7\u00e6\3\uffff\1\u00e6\1\uffff\1\u00ee",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\7\u00e6\3\uffff\1\u00e6\1\uffff\1\u00ee",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\7\u00e6\3\uffff\1\u00e6\1\uffff\1\u00ef",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\7\u00e6\3\uffff\1\u00e6\1\uffff\1\u00ef",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\7\u00e6\3\uffff\1\u00e6\1\uffff\1\u00f0",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\7\u00e6\3\uffff\1\u00e6\1\uffff\1\u00f0",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\7\u00e6\3\uffff\1\u00e6\1\uffff\1\u00f1",
            "\1\u00e6\17\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\7\u00e6\3\uffff\1\u00e6\1\uffff\1\u00f1",
            "\1\u00f4\1\u00f5\1\u00f2\1\u00f3",
            "",
            "\1\u00f6\1\u00f7\2\uffff\1\u00f8\1\u00f9",
            "\1\u00fa\1\u00fb\1\u00fc\1\u00fd",
            "\1\u0100\2\uffff\1\u0101\1\u00fe\1\u00ff",
            "\1\u0102\2\uffff\1\u0103\4\uffff\1\u0104\1\u0105",
            "\1\u0106\1\u0107\2\uffff\1\u0108\1\u0109",
            "\1\u010a\2\uffff\1\u010b\2\uffff\1\u010c\1\u010d",
            "\1\u010e\1\u010f\1\u0110\1\u0111",
            "\1\u0112\2\uffff\1\u0113\1\u0114\1\u0115",
            "\1\u0116\1\u0117\1\u0118\1\u0119",
            "\1\u011a\2\uffff\1\u011b\2\uffff\1\u011c\1\u011d",
            "\1\u011e\2\uffff\1\u011f\4\uffff\1\u0120\1\u0121",
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
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "\1\u0243\17\uffff\1\u0243\1\uffff\4\u0243\2\uffff\7\u0243\3\uffff\1\u0243\1\uffff\1\u0242",
            "",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "2253:2: (this_Parallele2_0= ruleParallele2 | this_Parallele3_1= ruleParallele3 | this_Parallele4_2= ruleParallele4 )";
        }
    }
    static final String dfa_21s = "\111\uffff";
    static final String dfa_22s = "\1\34\10\5\20\35\10\6\20\36\10\53\1\40\3\34\14\uffff";
    static final String dfa_23s = "\1\45\10\7\20\35\10\7\20\36\10\53\2\45\1\43\1\45\14\uffff";
    static final String dfa_24s = "\75\uffff\1\1\1\3\1\2\1\5\1\4\1\6\1\7\1\11\1\10\1\13\1\12\1\14";
    static final String dfa_25s = "\111\uffff}>";
    static final String[] dfa_26s = {
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

    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_21;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "2298:2: ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) )";
        }
    }
    static final String dfa_27s = "\u0109\uffff";
    static final String dfa_28s = "\1\34\10\5\20\35\10\6\20\36\10\53\2\34\1\40\1\34\30\5\60\35\30\6\60\36\30\53\1\42\4\34\2\40\1\42\1\40\2\34\1\40\30\uffff";
    static final String dfa_29s = "\1\45\10\7\20\35\10\7\20\36\10\53\3\45\1\43\30\7\60\35\30\7\60\36\30\53\2\45\1\43\1\45\1\41\1\45\1\43\2\45\1\41\2\43\30\uffff";
    static final String dfa_30s = "\u00f1\uffff\1\3\1\4\1\2\1\1\1\5\1\6\1\10\1\7\1\13\1\14\1\11\1\12\1\22\1\21\1\16\1\15\1\17\1\20\1\30\1\27\1\23\1\24\1\25\1\26";
    static final String dfa_31s = "\u0109\uffff}>";
    static final String[] dfa_32s = {
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
            "\1\107\2\uffff\1\110\1\103\1\104\2\uffff\1\105\1\106",
            "\1\113\1\114\1\115\1\116\1\111\1\112",
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
            "\2\u00f1\2\u00f2",
            "\1\u00f4\2\uffff\1\u00f4\4\uffff\2\u00f3",
            "\1\u00f5\2\uffff\1\u00f5\2\uffff\2\u00f6",
            "\1\u00f8\2\uffff\1\u00f8\4\uffff\2\u00f7",
            "\1\u00fa\2\uffff\1\u00fa\2\u00f9",
            "\2\u00fb\2\uffff\2\u00fc",
            "\2\u00fd\2\u00fe",
            "\2\u0100\2\u00ff",
            "\2\u0101\2\uffff\2\u0102",
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

    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_27;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "2856:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) )";
        }
    }
    static final String dfa_33s = "\1\34\10\5\20\35\10\6\20\36\10\53\2\34\1\40\1\34\30\5\60\35\30\6\60\36\30\53\2\34\1\42\1\34\1\40\1\34\1\42\3\40\2\34\30\uffff";
    static final String dfa_34s = "\1\45\10\7\20\35\10\7\20\36\10\53\3\45\1\43\30\7\60\35\30\7\60\36\30\53\1\43\4\45\1\41\2\45\2\43\1\41\1\43\30\uffff";
    static final String dfa_35s = "\u00f1\uffff\1\5\1\6\1\1\1\2\1\3\1\4\1\10\1\7\1\11\1\12\1\13\1\14\1\15\1\16\1\20\1\17\1\21\1\22\1\25\1\26\1\30\1\27\1\23\1\24";
    static final String[] dfa_36s = {
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
            "\1\101\2\uffff\1\102\2\uffff\1\77\1\100\1\75\1\76",
            "\1\105\2\uffff\1\106\1\103\1\104\2\uffff\1\107\1\110",
            "\1\111\1\112\1\113\1\114\1\115\1\116",
            "\1\117\2\uffff\1\120\1\123\1\124\1\121\1\122",
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
            "\1\u00f1\2\uffff\1\u00f1\2\uffff\2\u00f2",
            "\1\u00f3\2\uffff\1\u00f3\4\uffff\2\u00f4",
            "\2\u00f5\2\u00f6",
            "\1\u00f8\2\uffff\1\u00f8\4\uffff\2\u00f7",
            "\2\u00f9\2\uffff\2\u00fa",
            "\1\u00fc\2\uffff\1\u00fc\2\u00fb",
            "\2\u00fd\2\u00fe",
            "\2\u0100\2\uffff\2\u00ff",
            "\2\u0102\2\u0101",
            "\2\u0103\2\u0104",
            "\1\u0106\2\uffff\1\u0106\2\u0105",
            "\1\u0107\2\uffff\1\u0107\2\uffff\2\u0108",
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
    static final char[] dfa_33 = DFA.unpackEncodedStringToUnsignedChars(dfa_33s);
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final short[][] dfa_36 = unpackEncodedStringArray(dfa_36s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_27;
            this.eof = dfa_27;
            this.min = dfa_33;
            this.max = dfa_34;
            this.accept = dfa_35;
            this.special = dfa_31;
            this.transition = dfa_36;
        }
        public String getDescription() {
            return "4506:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) ) | ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) ) | ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) ) | ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) ) | ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) ) | ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) ) | ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) ) | ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) ) | ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) ) | ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) ) | ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) ) | ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) ) | ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) ) | ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) ) | ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) ) | ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) ) | ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) ) | ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) ) | ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) ) | ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) ) | ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) ) | ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) ) | ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) ) | ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000004000000002L});
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
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000023F9E800080L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000003F9E800080L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000090000000L});

}
