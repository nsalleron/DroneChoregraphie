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
import fr.idmteam1.idmproject.dronedsl.services.DroneDSLLibGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDroneDSLLibParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SECONDE", "RULE_POURCENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Seconde'", "'='", "'Pourcent'", "'decoller()'", "'atterrir()'", "'monter('", "','", "')'", "'descendre('", "'avancer('", "'reculer('", "'gauche('", "'droite('", "'rotation_gauche('", "'rotation_droite('", "'pause('", "'func'", "'()'", "'{'", "'}'", "'&'"
    };
    public static final int RULE_POURCENT=5;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int RULE_SECONDE=4;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
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

    // delegates
    // delegators


        public InternalDroneDSLLibParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDroneDSLLibParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDroneDSLLibParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDroneDSLLib.g"; }



     	private DroneDSLLibGrammarAccess grammarAccess;

        public InternalDroneDSLLibParser(TokenStream input, DroneDSLLibGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected DroneDSLLibGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalDroneDSLLib.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalDroneDSLLib.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalDroneDSLLib.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalDroneDSLLib.g:71:1: ruleModel returns [EObject current=null] : ( (lv_fonctions_0_0= ruleFonctionDecl ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_fonctions_0_0 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:77:2: ( ( (lv_fonctions_0_0= ruleFonctionDecl ) )* )
            // InternalDroneDSLLib.g:78:2: ( (lv_fonctions_0_0= ruleFonctionDecl ) )*
            {
            // InternalDroneDSLLib.g:78:2: ( (lv_fonctions_0_0= ruleFonctionDecl ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==29) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDroneDSLLib.g:79:3: (lv_fonctions_0_0= ruleFonctionDecl )
            	    {
            	    // InternalDroneDSLLib.g:79:3: (lv_fonctions_0_0= ruleFonctionDecl )
            	    // InternalDroneDSLLib.g:80:4: lv_fonctions_0_0= ruleFonctionDecl
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getFonctionsFonctionDeclParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_fonctions_0_0=ruleFonctionDecl();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"fonctions",
            	    					lv_fonctions_0_0,
            	    					"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.FonctionDecl");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleSecondeConst"
    // InternalDroneDSLLib.g:100:1: entryRuleSecondeConst returns [EObject current=null] : iv_ruleSecondeConst= ruleSecondeConst EOF ;
    public final EObject entryRuleSecondeConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecondeConst = null;


        try {
            // InternalDroneDSLLib.g:100:53: (iv_ruleSecondeConst= ruleSecondeConst EOF )
            // InternalDroneDSLLib.g:101:2: iv_ruleSecondeConst= ruleSecondeConst EOF
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
    // InternalDroneDSLLib.g:107:1: ruleSecondeConst returns [EObject current=null] : ( (lv_val_0_0= RULE_SECONDE ) ) ;
    public final EObject ruleSecondeConst() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalDroneDSLLib.g:113:2: ( ( (lv_val_0_0= RULE_SECONDE ) ) )
            // InternalDroneDSLLib.g:114:2: ( (lv_val_0_0= RULE_SECONDE ) )
            {
            // InternalDroneDSLLib.g:114:2: ( (lv_val_0_0= RULE_SECONDE ) )
            // InternalDroneDSLLib.g:115:3: (lv_val_0_0= RULE_SECONDE )
            {
            // InternalDroneDSLLib.g:115:3: (lv_val_0_0= RULE_SECONDE )
            // InternalDroneDSLLib.g:116:4: lv_val_0_0= RULE_SECONDE
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
            					"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.SECONDE");
            			

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
    // InternalDroneDSLLib.g:135:1: entryRulePourcentConst returns [EObject current=null] : iv_rulePourcentConst= rulePourcentConst EOF ;
    public final EObject entryRulePourcentConst() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePourcentConst = null;


        try {
            // InternalDroneDSLLib.g:135:54: (iv_rulePourcentConst= rulePourcentConst EOF )
            // InternalDroneDSLLib.g:136:2: iv_rulePourcentConst= rulePourcentConst EOF
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
    // InternalDroneDSLLib.g:142:1: rulePourcentConst returns [EObject current=null] : ( (lv_val_0_0= RULE_POURCENT ) ) ;
    public final EObject rulePourcentConst() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalDroneDSLLib.g:148:2: ( ( (lv_val_0_0= RULE_POURCENT ) ) )
            // InternalDroneDSLLib.g:149:2: ( (lv_val_0_0= RULE_POURCENT ) )
            {
            // InternalDroneDSLLib.g:149:2: ( (lv_val_0_0= RULE_POURCENT ) )
            // InternalDroneDSLLib.g:150:3: (lv_val_0_0= RULE_POURCENT )
            {
            // InternalDroneDSLLib.g:150:3: (lv_val_0_0= RULE_POURCENT )
            // InternalDroneDSLLib.g:151:4: lv_val_0_0= RULE_POURCENT
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
            					"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.POURCENT");
            			

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
    // InternalDroneDSLLib.g:170:1: entryRuleSecondeDecl returns [EObject current=null] : iv_ruleSecondeDecl= ruleSecondeDecl EOF ;
    public final EObject entryRuleSecondeDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecondeDecl = null;


        try {
            // InternalDroneDSLLib.g:170:52: (iv_ruleSecondeDecl= ruleSecondeDecl EOF )
            // InternalDroneDSLLib.g:171:2: iv_ruleSecondeDecl= ruleSecondeDecl EOF
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
    // InternalDroneDSLLib.g:177:1: ruleSecondeDecl returns [EObject current=null] : (otherlv_0= 'Seconde' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleSecondeConst ) ) ) ;
    public final EObject ruleSecondeDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_val_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:183:2: ( (otherlv_0= 'Seconde' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleSecondeConst ) ) ) )
            // InternalDroneDSLLib.g:184:2: (otherlv_0= 'Seconde' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleSecondeConst ) ) )
            {
            // InternalDroneDSLLib.g:184:2: (otherlv_0= 'Seconde' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleSecondeConst ) ) )
            // InternalDroneDSLLib.g:185:3: otherlv_0= 'Seconde' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleSecondeConst ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSecondeDeclAccess().getSecondeKeyword_0());
            		
            // InternalDroneDSLLib.g:189:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDroneDSLLib.g:190:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDroneDSLLib.g:190:4: (lv_name_1_0= RULE_ID )
            // InternalDroneDSLLib.g:191:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getSecondeDeclAccess().getEqualsSignKeyword_2());
            		
            // InternalDroneDSLLib.g:211:3: ( (lv_val_3_0= ruleSecondeConst ) )
            // InternalDroneDSLLib.g:212:4: (lv_val_3_0= ruleSecondeConst )
            {
            // InternalDroneDSLLib.g:212:4: (lv_val_3_0= ruleSecondeConst )
            // InternalDroneDSLLib.g:213:5: lv_val_3_0= ruleSecondeConst
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
            						"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.SecondeConst");
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
    // InternalDroneDSLLib.g:234:1: entryRulePourcentDecl returns [EObject current=null] : iv_rulePourcentDecl= rulePourcentDecl EOF ;
    public final EObject entryRulePourcentDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePourcentDecl = null;


        try {
            // InternalDroneDSLLib.g:234:53: (iv_rulePourcentDecl= rulePourcentDecl EOF )
            // InternalDroneDSLLib.g:235:2: iv_rulePourcentDecl= rulePourcentDecl EOF
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
    // InternalDroneDSLLib.g:241:1: rulePourcentDecl returns [EObject current=null] : (otherlv_0= 'Pourcent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= rulePourcentConst ) ) ) ;
    public final EObject rulePourcentDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_val_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:247:2: ( (otherlv_0= 'Pourcent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= rulePourcentConst ) ) ) )
            // InternalDroneDSLLib.g:248:2: (otherlv_0= 'Pourcent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= rulePourcentConst ) ) )
            {
            // InternalDroneDSLLib.g:248:2: (otherlv_0= 'Pourcent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= rulePourcentConst ) ) )
            // InternalDroneDSLLib.g:249:3: otherlv_0= 'Pourcent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= rulePourcentConst ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPourcentDeclAccess().getPourcentKeyword_0());
            		
            // InternalDroneDSLLib.g:253:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDroneDSLLib.g:254:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDroneDSLLib.g:254:4: (lv_name_1_0= RULE_ID )
            // InternalDroneDSLLib.g:255:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getPourcentDeclAccess().getEqualsSignKeyword_2());
            		
            // InternalDroneDSLLib.g:275:3: ( (lv_val_3_0= rulePourcentConst ) )
            // InternalDroneDSLLib.g:276:4: (lv_val_3_0= rulePourcentConst )
            {
            // InternalDroneDSLLib.g:276:4: (lv_val_3_0= rulePourcentConst )
            // InternalDroneDSLLib.g:277:5: lv_val_3_0= rulePourcentConst
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
            						"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.PourcentConst");
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
    // InternalDroneDSLLib.g:298:1: entryRuleVarDecl returns [EObject current=null] : iv_ruleVarDecl= ruleVarDecl EOF ;
    public final EObject entryRuleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDecl = null;


        try {
            // InternalDroneDSLLib.g:298:48: (iv_ruleVarDecl= ruleVarDecl EOF )
            // InternalDroneDSLLib.g:299:2: iv_ruleVarDecl= ruleVarDecl EOF
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
    // InternalDroneDSLLib.g:305:1: ruleVarDecl returns [EObject current=null] : (this_PourcentDecl_0= rulePourcentDecl | this_SecondeDecl_1= ruleSecondeDecl ) ;
    public final EObject ruleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject this_PourcentDecl_0 = null;

        EObject this_SecondeDecl_1 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:311:2: ( (this_PourcentDecl_0= rulePourcentDecl | this_SecondeDecl_1= ruleSecondeDecl ) )
            // InternalDroneDSLLib.g:312:2: (this_PourcentDecl_0= rulePourcentDecl | this_SecondeDecl_1= ruleSecondeDecl )
            {
            // InternalDroneDSLLib.g:312:2: (this_PourcentDecl_0= rulePourcentDecl | this_SecondeDecl_1= ruleSecondeDecl )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDroneDSLLib.g:313:3: this_PourcentDecl_0= rulePourcentDecl
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
                    // InternalDroneDSLLib.g:322:3: this_SecondeDecl_1= ruleSecondeDecl
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
    // InternalDroneDSLLib.g:334:1: entryRuleRefSecondeVar returns [EObject current=null] : iv_ruleRefSecondeVar= ruleRefSecondeVar EOF ;
    public final EObject entryRuleRefSecondeVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefSecondeVar = null;


        try {
            // InternalDroneDSLLib.g:334:54: (iv_ruleRefSecondeVar= ruleRefSecondeVar EOF )
            // InternalDroneDSLLib.g:335:2: iv_ruleRefSecondeVar= ruleRefSecondeVar EOF
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
    // InternalDroneDSLLib.g:341:1: ruleRefSecondeVar returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleRefSecondeVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDroneDSLLib.g:347:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalDroneDSLLib.g:348:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalDroneDSLLib.g:348:2: ( (otherlv_0= RULE_ID ) )
            // InternalDroneDSLLib.g:349:3: (otherlv_0= RULE_ID )
            {
            // InternalDroneDSLLib.g:349:3: (otherlv_0= RULE_ID )
            // InternalDroneDSLLib.g:350:4: otherlv_0= RULE_ID
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
    // InternalDroneDSLLib.g:364:1: entryRuleRefPourcentVar returns [EObject current=null] : iv_ruleRefPourcentVar= ruleRefPourcentVar EOF ;
    public final EObject entryRuleRefPourcentVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefPourcentVar = null;


        try {
            // InternalDroneDSLLib.g:364:55: (iv_ruleRefPourcentVar= ruleRefPourcentVar EOF )
            // InternalDroneDSLLib.g:365:2: iv_ruleRefPourcentVar= ruleRefPourcentVar EOF
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
    // InternalDroneDSLLib.g:371:1: ruleRefPourcentVar returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleRefPourcentVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDroneDSLLib.g:377:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalDroneDSLLib.g:378:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalDroneDSLLib.g:378:2: ( (otherlv_0= RULE_ID ) )
            // InternalDroneDSLLib.g:379:3: (otherlv_0= RULE_ID )
            {
            // InternalDroneDSLLib.g:379:3: (otherlv_0= RULE_ID )
            // InternalDroneDSLLib.g:380:4: otherlv_0= RULE_ID
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
    // InternalDroneDSLLib.g:394:1: entryRulePourcentExp returns [EObject current=null] : iv_rulePourcentExp= rulePourcentExp EOF ;
    public final EObject entryRulePourcentExp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePourcentExp = null;


        try {
            // InternalDroneDSLLib.g:394:52: (iv_rulePourcentExp= rulePourcentExp EOF )
            // InternalDroneDSLLib.g:395:2: iv_rulePourcentExp= rulePourcentExp EOF
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
    // InternalDroneDSLLib.g:401:1: rulePourcentExp returns [EObject current=null] : (this_PourcentConst_0= rulePourcentConst | this_RefPourcentVar_1= ruleRefPourcentVar ) ;
    public final EObject rulePourcentExp() throws RecognitionException {
        EObject current = null;

        EObject this_PourcentConst_0 = null;

        EObject this_RefPourcentVar_1 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:407:2: ( (this_PourcentConst_0= rulePourcentConst | this_RefPourcentVar_1= ruleRefPourcentVar ) )
            // InternalDroneDSLLib.g:408:2: (this_PourcentConst_0= rulePourcentConst | this_RefPourcentVar_1= ruleRefPourcentVar )
            {
            // InternalDroneDSLLib.g:408:2: (this_PourcentConst_0= rulePourcentConst | this_RefPourcentVar_1= ruleRefPourcentVar )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_POURCENT) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDroneDSLLib.g:409:3: this_PourcentConst_0= rulePourcentConst
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
                    // InternalDroneDSLLib.g:418:3: this_RefPourcentVar_1= ruleRefPourcentVar
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
    // InternalDroneDSLLib.g:430:1: entryRuleSecondeExp returns [EObject current=null] : iv_ruleSecondeExp= ruleSecondeExp EOF ;
    public final EObject entryRuleSecondeExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecondeExp = null;


        try {
            // InternalDroneDSLLib.g:430:51: (iv_ruleSecondeExp= ruleSecondeExp EOF )
            // InternalDroneDSLLib.g:431:2: iv_ruleSecondeExp= ruleSecondeExp EOF
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
    // InternalDroneDSLLib.g:437:1: ruleSecondeExp returns [EObject current=null] : (this_SecondeConst_0= ruleSecondeConst | this_RefSecondeVar_1= ruleRefSecondeVar ) ;
    public final EObject ruleSecondeExp() throws RecognitionException {
        EObject current = null;

        EObject this_SecondeConst_0 = null;

        EObject this_RefSecondeVar_1 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:443:2: ( (this_SecondeConst_0= ruleSecondeConst | this_RefSecondeVar_1= ruleRefSecondeVar ) )
            // InternalDroneDSLLib.g:444:2: (this_SecondeConst_0= ruleSecondeConst | this_RefSecondeVar_1= ruleRefSecondeVar )
            {
            // InternalDroneDSLLib.g:444:2: (this_SecondeConst_0= ruleSecondeConst | this_RefSecondeVar_1= ruleRefSecondeVar )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_SECONDE) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDroneDSLLib.g:445:3: this_SecondeConst_0= ruleSecondeConst
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
                    // InternalDroneDSLLib.g:454:3: this_RefSecondeVar_1= ruleRefSecondeVar
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
    // InternalDroneDSLLib.g:466:1: entryRuleDecoller returns [EObject current=null] : iv_ruleDecoller= ruleDecoller EOF ;
    public final EObject entryRuleDecoller() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecoller = null;


        try {
            // InternalDroneDSLLib.g:466:49: (iv_ruleDecoller= ruleDecoller EOF )
            // InternalDroneDSLLib.g:467:2: iv_ruleDecoller= ruleDecoller EOF
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
    // InternalDroneDSLLib.g:473:1: ruleDecoller returns [EObject current=null] : ( (lv_str_0_0= 'decoller()' ) ) ;
    public final EObject ruleDecoller() throws RecognitionException {
        EObject current = null;

        Token lv_str_0_0=null;


        	enterRule();

        try {
            // InternalDroneDSLLib.g:479:2: ( ( (lv_str_0_0= 'decoller()' ) ) )
            // InternalDroneDSLLib.g:480:2: ( (lv_str_0_0= 'decoller()' ) )
            {
            // InternalDroneDSLLib.g:480:2: ( (lv_str_0_0= 'decoller()' ) )
            // InternalDroneDSLLib.g:481:3: (lv_str_0_0= 'decoller()' )
            {
            // InternalDroneDSLLib.g:481:3: (lv_str_0_0= 'decoller()' )
            // InternalDroneDSLLib.g:482:4: lv_str_0_0= 'decoller()'
            {
            lv_str_0_0=(Token)match(input,16,FOLLOW_2); 

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
    // InternalDroneDSLLib.g:497:1: entryRuleAtterrir returns [EObject current=null] : iv_ruleAtterrir= ruleAtterrir EOF ;
    public final EObject entryRuleAtterrir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtterrir = null;


        try {
            // InternalDroneDSLLib.g:497:49: (iv_ruleAtterrir= ruleAtterrir EOF )
            // InternalDroneDSLLib.g:498:2: iv_ruleAtterrir= ruleAtterrir EOF
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
    // InternalDroneDSLLib.g:504:1: ruleAtterrir returns [EObject current=null] : ( (lv_str_0_0= 'atterrir()' ) ) ;
    public final EObject ruleAtterrir() throws RecognitionException {
        EObject current = null;

        Token lv_str_0_0=null;


        	enterRule();

        try {
            // InternalDroneDSLLib.g:510:2: ( ( (lv_str_0_0= 'atterrir()' ) ) )
            // InternalDroneDSLLib.g:511:2: ( (lv_str_0_0= 'atterrir()' ) )
            {
            // InternalDroneDSLLib.g:511:2: ( (lv_str_0_0= 'atterrir()' ) )
            // InternalDroneDSLLib.g:512:3: (lv_str_0_0= 'atterrir()' )
            {
            // InternalDroneDSLLib.g:512:3: (lv_str_0_0= 'atterrir()' )
            // InternalDroneDSLLib.g:513:4: lv_str_0_0= 'atterrir()'
            {
            lv_str_0_0=(Token)match(input,17,FOLLOW_2); 

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
    // InternalDroneDSLLib.g:528:1: entryRuleMonter returns [EObject current=null] : iv_ruleMonter= ruleMonter EOF ;
    public final EObject entryRuleMonter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonter = null;


        try {
            // InternalDroneDSLLib.g:528:47: (iv_ruleMonter= ruleMonter EOF )
            // InternalDroneDSLLib.g:529:2: iv_ruleMonter= ruleMonter EOF
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
    // InternalDroneDSLLib.g:535:1: ruleMonter returns [EObject current=null] : (otherlv_0= 'monter(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) ;
    public final EObject ruleMonter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duree_1_0 = null;

        EObject lv_vitesse_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:541:2: ( (otherlv_0= 'monter(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) )
            // InternalDroneDSLLib.g:542:2: (otherlv_0= 'monter(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            {
            // InternalDroneDSLLib.g:542:2: (otherlv_0= 'monter(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            // InternalDroneDSLLib.g:543:3: otherlv_0= 'monter(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getMonterAccess().getMonterKeyword_0());
            		
            // InternalDroneDSLLib.g:547:3: ( (lv_duree_1_0= ruleSecondeExp ) )
            // InternalDroneDSLLib.g:548:4: (lv_duree_1_0= ruleSecondeExp )
            {
            // InternalDroneDSLLib.g:548:4: (lv_duree_1_0= ruleSecondeExp )
            // InternalDroneDSLLib.g:549:5: lv_duree_1_0= ruleSecondeExp
            {

            					newCompositeNode(grammarAccess.getMonterAccess().getDureeSecondeExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_duree_1_0=ruleSecondeExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMonterRule());
            					}
            					set(
            						current,
            						"duree",
            						lv_duree_1_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.SecondeExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getMonterAccess().getCommaKeyword_2());
            		
            // InternalDroneDSLLib.g:570:3: ( (lv_vitesse_3_0= rulePourcentExp ) )
            // InternalDroneDSLLib.g:571:4: (lv_vitesse_3_0= rulePourcentExp )
            {
            // InternalDroneDSLLib.g:571:4: (lv_vitesse_3_0= rulePourcentExp )
            // InternalDroneDSLLib.g:572:5: lv_vitesse_3_0= rulePourcentExp
            {

            					newCompositeNode(grammarAccess.getMonterAccess().getVitessePourcentExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_vitesse_3_0=rulePourcentExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMonterRule());
            					}
            					set(
            						current,
            						"vitesse",
            						lv_vitesse_3_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.PourcentExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

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
    // InternalDroneDSLLib.g:597:1: entryRuleDescendre returns [EObject current=null] : iv_ruleDescendre= ruleDescendre EOF ;
    public final EObject entryRuleDescendre() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescendre = null;


        try {
            // InternalDroneDSLLib.g:597:50: (iv_ruleDescendre= ruleDescendre EOF )
            // InternalDroneDSLLib.g:598:2: iv_ruleDescendre= ruleDescendre EOF
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
    // InternalDroneDSLLib.g:604:1: ruleDescendre returns [EObject current=null] : (otherlv_0= 'descendre(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) ;
    public final EObject ruleDescendre() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duree_1_0 = null;

        EObject lv_vitesse_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:610:2: ( (otherlv_0= 'descendre(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) )
            // InternalDroneDSLLib.g:611:2: (otherlv_0= 'descendre(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            {
            // InternalDroneDSLLib.g:611:2: (otherlv_0= 'descendre(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            // InternalDroneDSLLib.g:612:3: otherlv_0= 'descendre(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDescendreAccess().getDescendreKeyword_0());
            		
            // InternalDroneDSLLib.g:616:3: ( (lv_duree_1_0= ruleSecondeExp ) )
            // InternalDroneDSLLib.g:617:4: (lv_duree_1_0= ruleSecondeExp )
            {
            // InternalDroneDSLLib.g:617:4: (lv_duree_1_0= ruleSecondeExp )
            // InternalDroneDSLLib.g:618:5: lv_duree_1_0= ruleSecondeExp
            {

            					newCompositeNode(grammarAccess.getDescendreAccess().getDureeSecondeExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_duree_1_0=ruleSecondeExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDescendreRule());
            					}
            					set(
            						current,
            						"duree",
            						lv_duree_1_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.SecondeExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDescendreAccess().getCommaKeyword_2());
            		
            // InternalDroneDSLLib.g:639:3: ( (lv_vitesse_3_0= rulePourcentExp ) )
            // InternalDroneDSLLib.g:640:4: (lv_vitesse_3_0= rulePourcentExp )
            {
            // InternalDroneDSLLib.g:640:4: (lv_vitesse_3_0= rulePourcentExp )
            // InternalDroneDSLLib.g:641:5: lv_vitesse_3_0= rulePourcentExp
            {

            					newCompositeNode(grammarAccess.getDescendreAccess().getVitessePourcentExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_vitesse_3_0=rulePourcentExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDescendreRule());
            					}
            					set(
            						current,
            						"vitesse",
            						lv_vitesse_3_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.PourcentExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

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
    // InternalDroneDSLLib.g:666:1: entryRuleAvancer returns [EObject current=null] : iv_ruleAvancer= ruleAvancer EOF ;
    public final EObject entryRuleAvancer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvancer = null;


        try {
            // InternalDroneDSLLib.g:666:48: (iv_ruleAvancer= ruleAvancer EOF )
            // InternalDroneDSLLib.g:667:2: iv_ruleAvancer= ruleAvancer EOF
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
    // InternalDroneDSLLib.g:673:1: ruleAvancer returns [EObject current=null] : (otherlv_0= 'avancer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) ;
    public final EObject ruleAvancer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duree_1_0 = null;

        EObject lv_vitesse_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:679:2: ( (otherlv_0= 'avancer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) )
            // InternalDroneDSLLib.g:680:2: (otherlv_0= 'avancer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            {
            // InternalDroneDSLLib.g:680:2: (otherlv_0= 'avancer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            // InternalDroneDSLLib.g:681:3: otherlv_0= 'avancer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getAvancerAccess().getAvancerKeyword_0());
            		
            // InternalDroneDSLLib.g:685:3: ( (lv_duree_1_0= ruleSecondeExp ) )
            // InternalDroneDSLLib.g:686:4: (lv_duree_1_0= ruleSecondeExp )
            {
            // InternalDroneDSLLib.g:686:4: (lv_duree_1_0= ruleSecondeExp )
            // InternalDroneDSLLib.g:687:5: lv_duree_1_0= ruleSecondeExp
            {

            					newCompositeNode(grammarAccess.getAvancerAccess().getDureeSecondeExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_duree_1_0=ruleSecondeExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAvancerRule());
            					}
            					set(
            						current,
            						"duree",
            						lv_duree_1_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.SecondeExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getAvancerAccess().getCommaKeyword_2());
            		
            // InternalDroneDSLLib.g:708:3: ( (lv_vitesse_3_0= rulePourcentExp ) )
            // InternalDroneDSLLib.g:709:4: (lv_vitesse_3_0= rulePourcentExp )
            {
            // InternalDroneDSLLib.g:709:4: (lv_vitesse_3_0= rulePourcentExp )
            // InternalDroneDSLLib.g:710:5: lv_vitesse_3_0= rulePourcentExp
            {

            					newCompositeNode(grammarAccess.getAvancerAccess().getVitessePourcentExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_vitesse_3_0=rulePourcentExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAvancerRule());
            					}
            					set(
            						current,
            						"vitesse",
            						lv_vitesse_3_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.PourcentExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

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
    // InternalDroneDSLLib.g:735:1: entryRuleReculer returns [EObject current=null] : iv_ruleReculer= ruleReculer EOF ;
    public final EObject entryRuleReculer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReculer = null;


        try {
            // InternalDroneDSLLib.g:735:48: (iv_ruleReculer= ruleReculer EOF )
            // InternalDroneDSLLib.g:736:2: iv_ruleReculer= ruleReculer EOF
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
    // InternalDroneDSLLib.g:742:1: ruleReculer returns [EObject current=null] : (otherlv_0= 'reculer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) ;
    public final EObject ruleReculer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duree_1_0 = null;

        EObject lv_vitesse_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:748:2: ( (otherlv_0= 'reculer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) )
            // InternalDroneDSLLib.g:749:2: (otherlv_0= 'reculer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            {
            // InternalDroneDSLLib.g:749:2: (otherlv_0= 'reculer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            // InternalDroneDSLLib.g:750:3: otherlv_0= 'reculer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getReculerAccess().getReculerKeyword_0());
            		
            // InternalDroneDSLLib.g:754:3: ( (lv_duree_1_0= ruleSecondeExp ) )
            // InternalDroneDSLLib.g:755:4: (lv_duree_1_0= ruleSecondeExp )
            {
            // InternalDroneDSLLib.g:755:4: (lv_duree_1_0= ruleSecondeExp )
            // InternalDroneDSLLib.g:756:5: lv_duree_1_0= ruleSecondeExp
            {

            					newCompositeNode(grammarAccess.getReculerAccess().getDureeSecondeExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_duree_1_0=ruleSecondeExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReculerRule());
            					}
            					set(
            						current,
            						"duree",
            						lv_duree_1_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.SecondeExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getReculerAccess().getCommaKeyword_2());
            		
            // InternalDroneDSLLib.g:777:3: ( (lv_vitesse_3_0= rulePourcentExp ) )
            // InternalDroneDSLLib.g:778:4: (lv_vitesse_3_0= rulePourcentExp )
            {
            // InternalDroneDSLLib.g:778:4: (lv_vitesse_3_0= rulePourcentExp )
            // InternalDroneDSLLib.g:779:5: lv_vitesse_3_0= rulePourcentExp
            {

            					newCompositeNode(grammarAccess.getReculerAccess().getVitessePourcentExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_vitesse_3_0=rulePourcentExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReculerRule());
            					}
            					set(
            						current,
            						"vitesse",
            						lv_vitesse_3_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.PourcentExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

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
    // InternalDroneDSLLib.g:804:1: entryRuleGauche returns [EObject current=null] : iv_ruleGauche= ruleGauche EOF ;
    public final EObject entryRuleGauche() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGauche = null;


        try {
            // InternalDroneDSLLib.g:804:47: (iv_ruleGauche= ruleGauche EOF )
            // InternalDroneDSLLib.g:805:2: iv_ruleGauche= ruleGauche EOF
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
    // InternalDroneDSLLib.g:811:1: ruleGauche returns [EObject current=null] : (otherlv_0= 'gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) ;
    public final EObject ruleGauche() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duree_1_0 = null;

        EObject lv_vitesse_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:817:2: ( (otherlv_0= 'gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) )
            // InternalDroneDSLLib.g:818:2: (otherlv_0= 'gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            {
            // InternalDroneDSLLib.g:818:2: (otherlv_0= 'gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            // InternalDroneDSLLib.g:819:3: otherlv_0= 'gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getGaucheAccess().getGaucheKeyword_0());
            		
            // InternalDroneDSLLib.g:823:3: ( (lv_duree_1_0= ruleSecondeExp ) )
            // InternalDroneDSLLib.g:824:4: (lv_duree_1_0= ruleSecondeExp )
            {
            // InternalDroneDSLLib.g:824:4: (lv_duree_1_0= ruleSecondeExp )
            // InternalDroneDSLLib.g:825:5: lv_duree_1_0= ruleSecondeExp
            {

            					newCompositeNode(grammarAccess.getGaucheAccess().getDureeSecondeExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_duree_1_0=ruleSecondeExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGaucheRule());
            					}
            					set(
            						current,
            						"duree",
            						lv_duree_1_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.SecondeExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getGaucheAccess().getCommaKeyword_2());
            		
            // InternalDroneDSLLib.g:846:3: ( (lv_vitesse_3_0= rulePourcentExp ) )
            // InternalDroneDSLLib.g:847:4: (lv_vitesse_3_0= rulePourcentExp )
            {
            // InternalDroneDSLLib.g:847:4: (lv_vitesse_3_0= rulePourcentExp )
            // InternalDroneDSLLib.g:848:5: lv_vitesse_3_0= rulePourcentExp
            {

            					newCompositeNode(grammarAccess.getGaucheAccess().getVitessePourcentExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_vitesse_3_0=rulePourcentExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGaucheRule());
            					}
            					set(
            						current,
            						"vitesse",
            						lv_vitesse_3_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.PourcentExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

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
    // InternalDroneDSLLib.g:873:1: entryRuleDroite returns [EObject current=null] : iv_ruleDroite= ruleDroite EOF ;
    public final EObject entryRuleDroite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDroite = null;


        try {
            // InternalDroneDSLLib.g:873:47: (iv_ruleDroite= ruleDroite EOF )
            // InternalDroneDSLLib.g:874:2: iv_ruleDroite= ruleDroite EOF
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
    // InternalDroneDSLLib.g:880:1: ruleDroite returns [EObject current=null] : (otherlv_0= 'droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) ;
    public final EObject ruleDroite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duree_1_0 = null;

        EObject lv_vitesse_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:886:2: ( (otherlv_0= 'droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) )
            // InternalDroneDSLLib.g:887:2: (otherlv_0= 'droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            {
            // InternalDroneDSLLib.g:887:2: (otherlv_0= 'droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            // InternalDroneDSLLib.g:888:3: otherlv_0= 'droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDroiteAccess().getDroiteKeyword_0());
            		
            // InternalDroneDSLLib.g:892:3: ( (lv_duree_1_0= ruleSecondeExp ) )
            // InternalDroneDSLLib.g:893:4: (lv_duree_1_0= ruleSecondeExp )
            {
            // InternalDroneDSLLib.g:893:4: (lv_duree_1_0= ruleSecondeExp )
            // InternalDroneDSLLib.g:894:5: lv_duree_1_0= ruleSecondeExp
            {

            					newCompositeNode(grammarAccess.getDroiteAccess().getDureeSecondeExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_duree_1_0=ruleSecondeExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDroiteRule());
            					}
            					set(
            						current,
            						"duree",
            						lv_duree_1_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.SecondeExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDroiteAccess().getCommaKeyword_2());
            		
            // InternalDroneDSLLib.g:915:3: ( (lv_vitesse_3_0= rulePourcentExp ) )
            // InternalDroneDSLLib.g:916:4: (lv_vitesse_3_0= rulePourcentExp )
            {
            // InternalDroneDSLLib.g:916:4: (lv_vitesse_3_0= rulePourcentExp )
            // InternalDroneDSLLib.g:917:5: lv_vitesse_3_0= rulePourcentExp
            {

            					newCompositeNode(grammarAccess.getDroiteAccess().getVitessePourcentExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_vitesse_3_0=rulePourcentExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDroiteRule());
            					}
            					set(
            						current,
            						"vitesse",
            						lv_vitesse_3_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.PourcentExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

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
    // InternalDroneDSLLib.g:942:1: entryRuleRotationGauche returns [EObject current=null] : iv_ruleRotationGauche= ruleRotationGauche EOF ;
    public final EObject entryRuleRotationGauche() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotationGauche = null;


        try {
            // InternalDroneDSLLib.g:942:55: (iv_ruleRotationGauche= ruleRotationGauche EOF )
            // InternalDroneDSLLib.g:943:2: iv_ruleRotationGauche= ruleRotationGauche EOF
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
    // InternalDroneDSLLib.g:949:1: ruleRotationGauche returns [EObject current=null] : (otherlv_0= 'rotation_gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) ;
    public final EObject ruleRotationGauche() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duree_1_0 = null;

        EObject lv_vitesse_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:955:2: ( (otherlv_0= 'rotation_gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) )
            // InternalDroneDSLLib.g:956:2: (otherlv_0= 'rotation_gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            {
            // InternalDroneDSLLib.g:956:2: (otherlv_0= 'rotation_gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            // InternalDroneDSLLib.g:957:3: otherlv_0= 'rotation_gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getRotationGaucheAccess().getRotation_gaucheKeyword_0());
            		
            // InternalDroneDSLLib.g:961:3: ( (lv_duree_1_0= ruleSecondeExp ) )
            // InternalDroneDSLLib.g:962:4: (lv_duree_1_0= ruleSecondeExp )
            {
            // InternalDroneDSLLib.g:962:4: (lv_duree_1_0= ruleSecondeExp )
            // InternalDroneDSLLib.g:963:5: lv_duree_1_0= ruleSecondeExp
            {

            					newCompositeNode(grammarAccess.getRotationGaucheAccess().getDureeSecondeExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_duree_1_0=ruleSecondeExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotationGaucheRule());
            					}
            					set(
            						current,
            						"duree",
            						lv_duree_1_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.SecondeExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getRotationGaucheAccess().getCommaKeyword_2());
            		
            // InternalDroneDSLLib.g:984:3: ( (lv_vitesse_3_0= rulePourcentExp ) )
            // InternalDroneDSLLib.g:985:4: (lv_vitesse_3_0= rulePourcentExp )
            {
            // InternalDroneDSLLib.g:985:4: (lv_vitesse_3_0= rulePourcentExp )
            // InternalDroneDSLLib.g:986:5: lv_vitesse_3_0= rulePourcentExp
            {

            					newCompositeNode(grammarAccess.getRotationGaucheAccess().getVitessePourcentExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_vitesse_3_0=rulePourcentExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotationGaucheRule());
            					}
            					set(
            						current,
            						"vitesse",
            						lv_vitesse_3_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.PourcentExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

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
    // InternalDroneDSLLib.g:1011:1: entryRuleRotationDroite returns [EObject current=null] : iv_ruleRotationDroite= ruleRotationDroite EOF ;
    public final EObject entryRuleRotationDroite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotationDroite = null;


        try {
            // InternalDroneDSLLib.g:1011:55: (iv_ruleRotationDroite= ruleRotationDroite EOF )
            // InternalDroneDSLLib.g:1012:2: iv_ruleRotationDroite= ruleRotationDroite EOF
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
    // InternalDroneDSLLib.g:1018:1: ruleRotationDroite returns [EObject current=null] : (otherlv_0= 'rotation_droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) ;
    public final EObject ruleRotationDroite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duree_1_0 = null;

        EObject lv_vitesse_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:1024:2: ( (otherlv_0= 'rotation_droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) )
            // InternalDroneDSLLib.g:1025:2: (otherlv_0= 'rotation_droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            {
            // InternalDroneDSLLib.g:1025:2: (otherlv_0= 'rotation_droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            // InternalDroneDSLLib.g:1026:3: otherlv_0= 'rotation_droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getRotationDroiteAccess().getRotation_droiteKeyword_0());
            		
            // InternalDroneDSLLib.g:1030:3: ( (lv_duree_1_0= ruleSecondeExp ) )
            // InternalDroneDSLLib.g:1031:4: (lv_duree_1_0= ruleSecondeExp )
            {
            // InternalDroneDSLLib.g:1031:4: (lv_duree_1_0= ruleSecondeExp )
            // InternalDroneDSLLib.g:1032:5: lv_duree_1_0= ruleSecondeExp
            {

            					newCompositeNode(grammarAccess.getRotationDroiteAccess().getDureeSecondeExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_duree_1_0=ruleSecondeExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotationDroiteRule());
            					}
            					set(
            						current,
            						"duree",
            						lv_duree_1_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.SecondeExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getRotationDroiteAccess().getCommaKeyword_2());
            		
            // InternalDroneDSLLib.g:1053:3: ( (lv_vitesse_3_0= rulePourcentExp ) )
            // InternalDroneDSLLib.g:1054:4: (lv_vitesse_3_0= rulePourcentExp )
            {
            // InternalDroneDSLLib.g:1054:4: (lv_vitesse_3_0= rulePourcentExp )
            // InternalDroneDSLLib.g:1055:5: lv_vitesse_3_0= rulePourcentExp
            {

            					newCompositeNode(grammarAccess.getRotationDroiteAccess().getVitessePourcentExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_vitesse_3_0=rulePourcentExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotationDroiteRule());
            					}
            					set(
            						current,
            						"vitesse",
            						lv_vitesse_3_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.PourcentExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

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
    // InternalDroneDSLLib.g:1080:1: entryRulePause returns [EObject current=null] : iv_rulePause= rulePause EOF ;
    public final EObject entryRulePause() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePause = null;


        try {
            // InternalDroneDSLLib.g:1080:46: (iv_rulePause= rulePause EOF )
            // InternalDroneDSLLib.g:1081:2: iv_rulePause= rulePause EOF
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
    // InternalDroneDSLLib.g:1087:1: rulePause returns [EObject current=null] : (otherlv_0= 'pause(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ')' ) ;
    public final EObject rulePause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_duree_1_0 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:1093:2: ( (otherlv_0= 'pause(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ')' ) )
            // InternalDroneDSLLib.g:1094:2: (otherlv_0= 'pause(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ')' )
            {
            // InternalDroneDSLLib.g:1094:2: (otherlv_0= 'pause(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ')' )
            // InternalDroneDSLLib.g:1095:3: otherlv_0= 'pause(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPauseAccess().getPauseKeyword_0());
            		
            // InternalDroneDSLLib.g:1099:3: ( (lv_duree_1_0= ruleSecondeExp ) )
            // InternalDroneDSLLib.g:1100:4: (lv_duree_1_0= ruleSecondeExp )
            {
            // InternalDroneDSLLib.g:1100:4: (lv_duree_1_0= ruleSecondeExp )
            // InternalDroneDSLLib.g:1101:5: lv_duree_1_0= ruleSecondeExp
            {

            					newCompositeNode(grammarAccess.getPauseAccess().getDureeSecondeExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_duree_1_0=ruleSecondeExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPauseRule());
            					}
            					set(
            						current,
            						"duree",
            						lv_duree_1_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.SecondeExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_2); 

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
    // InternalDroneDSLLib.g:1126:1: entryRuleDecollerAtterrir returns [EObject current=null] : iv_ruleDecollerAtterrir= ruleDecollerAtterrir EOF ;
    public final EObject entryRuleDecollerAtterrir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecollerAtterrir = null;


        try {
            // InternalDroneDSLLib.g:1126:57: (iv_ruleDecollerAtterrir= ruleDecollerAtterrir EOF )
            // InternalDroneDSLLib.g:1127:2: iv_ruleDecollerAtterrir= ruleDecollerAtterrir EOF
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
    // InternalDroneDSLLib.g:1133:1: ruleDecollerAtterrir returns [EObject current=null] : (this_Decoller_0= ruleDecoller | this_Atterrir_1= ruleAtterrir ) ;
    public final EObject ruleDecollerAtterrir() throws RecognitionException {
        EObject current = null;

        EObject this_Decoller_0 = null;

        EObject this_Atterrir_1 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:1139:2: ( (this_Decoller_0= ruleDecoller | this_Atterrir_1= ruleAtterrir ) )
            // InternalDroneDSLLib.g:1140:2: (this_Decoller_0= ruleDecoller | this_Atterrir_1= ruleAtterrir )
            {
            // InternalDroneDSLLib.g:1140:2: (this_Decoller_0= ruleDecoller | this_Atterrir_1= ruleAtterrir )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDroneDSLLib.g:1141:3: this_Decoller_0= ruleDecoller
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
                    // InternalDroneDSLLib.g:1150:3: this_Atterrir_1= ruleAtterrir
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
    // InternalDroneDSLLib.g:1162:1: entryRuleCommandeBasique returns [EObject current=null] : iv_ruleCommandeBasique= ruleCommandeBasique EOF ;
    public final EObject entryRuleCommandeBasique() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandeBasique = null;


        try {
            // InternalDroneDSLLib.g:1162:56: (iv_ruleCommandeBasique= ruleCommandeBasique EOF )
            // InternalDroneDSLLib.g:1163:2: iv_ruleCommandeBasique= ruleCommandeBasique EOF
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
    // InternalDroneDSLLib.g:1169:1: ruleCommandeBasique returns [EObject current=null] : (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer | this_Monter_2= ruleMonter | this_Descendre_3= ruleDescendre | this_Gauche_4= ruleGauche | this_Droite_5= ruleDroite | this_RotationGauche_6= ruleRotationGauche | this_RotationDroite_7= ruleRotationDroite | this_Pause_8= rulePause ) ;
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
            // InternalDroneDSLLib.g:1175:2: ( (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer | this_Monter_2= ruleMonter | this_Descendre_3= ruleDescendre | this_Gauche_4= ruleGauche | this_Droite_5= ruleDroite | this_RotationGauche_6= ruleRotationGauche | this_RotationDroite_7= ruleRotationDroite | this_Pause_8= rulePause ) )
            // InternalDroneDSLLib.g:1176:2: (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer | this_Monter_2= ruleMonter | this_Descendre_3= ruleDescendre | this_Gauche_4= ruleGauche | this_Droite_5= ruleDroite | this_RotationGauche_6= ruleRotationGauche | this_RotationDroite_7= ruleRotationDroite | this_Pause_8= rulePause )
            {
            // InternalDroneDSLLib.g:1176:2: (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer | this_Monter_2= ruleMonter | this_Descendre_3= ruleDescendre | this_Gauche_4= ruleGauche | this_Droite_5= ruleDroite | this_RotationGauche_6= ruleRotationGauche | this_RotationDroite_7= ruleRotationDroite | this_Pause_8= rulePause )
            int alt6=9;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt6=1;
                }
                break;
            case 23:
                {
                alt6=2;
                }
                break;
            case 18:
                {
                alt6=3;
                }
                break;
            case 21:
                {
                alt6=4;
                }
                break;
            case 24:
                {
                alt6=5;
                }
                break;
            case 25:
                {
                alt6=6;
                }
                break;
            case 26:
                {
                alt6=7;
                }
                break;
            case 27:
                {
                alt6=8;
                }
                break;
            case 28:
                {
                alt6=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDroneDSLLib.g:1177:3: this_Avancer_0= ruleAvancer
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
                    // InternalDroneDSLLib.g:1186:3: this_Reculer_1= ruleReculer
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
                    // InternalDroneDSLLib.g:1195:3: this_Monter_2= ruleMonter
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
                    // InternalDroneDSLLib.g:1204:3: this_Descendre_3= ruleDescendre
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
                    // InternalDroneDSLLib.g:1213:3: this_Gauche_4= ruleGauche
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
                    // InternalDroneDSLLib.g:1222:3: this_Droite_5= ruleDroite
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
                    // InternalDroneDSLLib.g:1231:3: this_RotationGauche_6= ruleRotationGauche
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
                    // InternalDroneDSLLib.g:1240:3: this_RotationDroite_7= ruleRotationDroite
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
                    // InternalDroneDSLLib.g:1249:3: this_Pause_8= rulePause
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
    // InternalDroneDSLLib.g:1261:1: entryRuleFonctionDecl returns [EObject current=null] : iv_ruleFonctionDecl= ruleFonctionDecl EOF ;
    public final EObject entryRuleFonctionDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFonctionDecl = null;


        try {
            // InternalDroneDSLLib.g:1261:53: (iv_ruleFonctionDecl= ruleFonctionDecl EOF )
            // InternalDroneDSLLib.g:1262:2: iv_ruleFonctionDecl= ruleFonctionDecl EOF
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
    // InternalDroneDSLLib.g:1268:1: ruleFonctionDecl returns [EObject current=null] : (otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= '{' ( ( (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir ) ) )* otherlv_5= '}' ) ;
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
            // InternalDroneDSLLib.g:1274:2: ( (otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= '{' ( ( (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir ) ) )* otherlv_5= '}' ) )
            // InternalDroneDSLLib.g:1275:2: (otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= '{' ( ( (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir ) ) )* otherlv_5= '}' )
            {
            // InternalDroneDSLLib.g:1275:2: (otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= '{' ( ( (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir ) ) )* otherlv_5= '}' )
            // InternalDroneDSLLib.g:1276:3: otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= '{' ( ( (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFonctionDeclAccess().getFuncKeyword_0());
            		
            // InternalDroneDSLLib.g:1280:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDroneDSLLib.g:1281:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDroneDSLLib.g:1281:4: (lv_name_1_0= RULE_ID )
            // InternalDroneDSLLib.g:1282:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            otherlv_2=(Token)match(input,30,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getFonctionDeclAccess().getLeftParenthesisRightParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,31,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getFonctionDeclAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDroneDSLLib.g:1306:3: ( ( (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==13||(LA8_0>=15 && LA8_0<=18)||(LA8_0>=21 && LA8_0<=28)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDroneDSLLib.g:1307:4: ( (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir ) )
            	    {
            	    // InternalDroneDSLLib.g:1307:4: ( (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir ) )
            	    // InternalDroneDSLLib.g:1308:5: (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir )
            	    {
            	    // InternalDroneDSLLib.g:1308:5: (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir )
            	    int alt7=5;
            	    alt7 = dfa7.predict(input);
            	    switch (alt7) {
            	        case 1 :
            	            // InternalDroneDSLLib.g:1309:6: lv_body_4_1= ruleVarDecl
            	            {

            	            						newCompositeNode(grammarAccess.getFonctionDeclAccess().getBodyVarDeclParserRuleCall_4_0_0());
            	            					
            	            pushFollow(FOLLOW_14);
            	            lv_body_4_1=ruleVarDecl();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getFonctionDeclRule());
            	            						}
            	            						add(
            	            							current,
            	            							"body",
            	            							lv_body_4_1,
            	            							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.VarDecl");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalDroneDSLLib.g:1325:6: lv_body_4_2= ruleCommandeBasique
            	            {

            	            						newCompositeNode(grammarAccess.getFonctionDeclAccess().getBodyCommandeBasiqueParserRuleCall_4_0_1());
            	            					
            	            pushFollow(FOLLOW_14);
            	            lv_body_4_2=ruleCommandeBasique();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getFonctionDeclRule());
            	            						}
            	            						add(
            	            							current,
            	            							"body",
            	            							lv_body_4_2,
            	            							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.CommandeBasique");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 3 :
            	            // InternalDroneDSLLib.g:1341:6: lv_body_4_3= ruleParallele
            	            {

            	            						newCompositeNode(grammarAccess.getFonctionDeclAccess().getBodyParalleleParserRuleCall_4_0_2());
            	            					
            	            pushFollow(FOLLOW_14);
            	            lv_body_4_3=ruleParallele();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getFonctionDeclRule());
            	            						}
            	            						add(
            	            							current,
            	            							"body",
            	            							lv_body_4_3,
            	            							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.Parallele");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 4 :
            	            // InternalDroneDSLLib.g:1357:6: lv_body_4_4= ruleFonctionCall
            	            {

            	            						newCompositeNode(grammarAccess.getFonctionDeclAccess().getBodyFonctionCallParserRuleCall_4_0_3());
            	            					
            	            pushFollow(FOLLOW_14);
            	            lv_body_4_4=ruleFonctionCall();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getFonctionDeclRule());
            	            						}
            	            						add(
            	            							current,
            	            							"body",
            	            							lv_body_4_4,
            	            							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.FonctionCall");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 5 :
            	            // InternalDroneDSLLib.g:1373:6: lv_body_4_5= ruleDecollerAtterrir
            	            {

            	            						newCompositeNode(grammarAccess.getFonctionDeclAccess().getBodyDecollerAtterrirParserRuleCall_4_0_4());
            	            					
            	            pushFollow(FOLLOW_14);
            	            lv_body_4_5=ruleDecollerAtterrir();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getFonctionDeclRule());
            	            						}
            	            						add(
            	            							current,
            	            							"body",
            	            							lv_body_4_5,
            	            							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.DecollerAtterrir");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_5=(Token)match(input,32,FOLLOW_2); 

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


    // $ANTLR start "entryRuleFonctionCall"
    // InternalDroneDSLLib.g:1399:1: entryRuleFonctionCall returns [EObject current=null] : iv_ruleFonctionCall= ruleFonctionCall EOF ;
    public final EObject entryRuleFonctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFonctionCall = null;


        try {
            // InternalDroneDSLLib.g:1399:53: (iv_ruleFonctionCall= ruleFonctionCall EOF )
            // InternalDroneDSLLib.g:1400:2: iv_ruleFonctionCall= ruleFonctionCall EOF
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
    // InternalDroneDSLLib.g:1406:1: ruleFonctionCall returns [EObject current=null] : this_FonctionCallInterne_0= ruleFonctionCallInterne ;
    public final EObject ruleFonctionCall() throws RecognitionException {
        EObject current = null;

        EObject this_FonctionCallInterne_0 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:1412:2: (this_FonctionCallInterne_0= ruleFonctionCallInterne )
            // InternalDroneDSLLib.g:1413:2: this_FonctionCallInterne_0= ruleFonctionCallInterne
            {

            		newCompositeNode(grammarAccess.getFonctionCallAccess().getFonctionCallInterneParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_FonctionCallInterne_0=ruleFonctionCallInterne();

            state._fsp--;


            		current = this_FonctionCallInterne_0;
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
    // $ANTLR end "ruleFonctionCall"


    // $ANTLR start "entryRuleFonctionCallInterne"
    // InternalDroneDSLLib.g:1424:1: entryRuleFonctionCallInterne returns [EObject current=null] : iv_ruleFonctionCallInterne= ruleFonctionCallInterne EOF ;
    public final EObject entryRuleFonctionCallInterne() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFonctionCallInterne = null;


        try {
            // InternalDroneDSLLib.g:1424:60: (iv_ruleFonctionCallInterne= ruleFonctionCallInterne EOF )
            // InternalDroneDSLLib.g:1425:2: iv_ruleFonctionCallInterne= ruleFonctionCallInterne EOF
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
    // InternalDroneDSLLib.g:1431:1: ruleFonctionCallInterne returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '()' ) ;
    public final EObject ruleFonctionCallInterne() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDroneDSLLib.g:1437:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '()' ) )
            // InternalDroneDSLLib.g:1438:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '()' )
            {
            // InternalDroneDSLLib.g:1438:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '()' )
            // InternalDroneDSLLib.g:1439:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '()'
            {
            // InternalDroneDSLLib.g:1439:3: ( (otherlv_0= RULE_ID ) )
            // InternalDroneDSLLib.g:1440:4: (otherlv_0= RULE_ID )
            {
            // InternalDroneDSLLib.g:1440:4: (otherlv_0= RULE_ID )
            // InternalDroneDSLLib.g:1441:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFonctionCallInterneRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_0, grammarAccess.getFonctionCallInterneAccess().getRefFonctionDeclCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_2); 

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


    // $ANTLR start "entryRuleMD"
    // InternalDroneDSLLib.g:1460:1: entryRuleMD returns [EObject current=null] : iv_ruleMD= ruleMD EOF ;
    public final EObject entryRuleMD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMD = null;


        try {
            // InternalDroneDSLLib.g:1460:43: (iv_ruleMD= ruleMD EOF )
            // InternalDroneDSLLib.g:1461:2: iv_ruleMD= ruleMD EOF
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
    // InternalDroneDSLLib.g:1467:1: ruleMD returns [EObject current=null] : (this_Monter_0= ruleMonter | this_Descendre_1= ruleDescendre ) ;
    public final EObject ruleMD() throws RecognitionException {
        EObject current = null;

        EObject this_Monter_0 = null;

        EObject this_Descendre_1 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:1473:2: ( (this_Monter_0= ruleMonter | this_Descendre_1= ruleDescendre ) )
            // InternalDroneDSLLib.g:1474:2: (this_Monter_0= ruleMonter | this_Descendre_1= ruleDescendre )
            {
            // InternalDroneDSLLib.g:1474:2: (this_Monter_0= ruleMonter | this_Descendre_1= ruleDescendre )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            else if ( (LA9_0==21) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDroneDSLLib.g:1475:3: this_Monter_0= ruleMonter
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
                    // InternalDroneDSLLib.g:1484:3: this_Descendre_1= ruleDescendre
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
    // InternalDroneDSLLib.g:1496:1: entryRuleGDr returns [EObject current=null] : iv_ruleGDr= ruleGDr EOF ;
    public final EObject entryRuleGDr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGDr = null;


        try {
            // InternalDroneDSLLib.g:1496:44: (iv_ruleGDr= ruleGDr EOF )
            // InternalDroneDSLLib.g:1497:2: iv_ruleGDr= ruleGDr EOF
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
    // InternalDroneDSLLib.g:1503:1: ruleGDr returns [EObject current=null] : (this_Gauche_0= ruleGauche | this_Droite_1= ruleDroite ) ;
    public final EObject ruleGDr() throws RecognitionException {
        EObject current = null;

        EObject this_Gauche_0 = null;

        EObject this_Droite_1 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:1509:2: ( (this_Gauche_0= ruleGauche | this_Droite_1= ruleDroite ) )
            // InternalDroneDSLLib.g:1510:2: (this_Gauche_0= ruleGauche | this_Droite_1= ruleDroite )
            {
            // InternalDroneDSLLib.g:1510:2: (this_Gauche_0= ruleGauche | this_Droite_1= ruleDroite )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            else if ( (LA10_0==25) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDroneDSLLib.g:1511:3: this_Gauche_0= ruleGauche
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
                    // InternalDroneDSLLib.g:1520:3: this_Droite_1= ruleDroite
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
    // InternalDroneDSLLib.g:1532:1: entryRuleRGRD returns [EObject current=null] : iv_ruleRGRD= ruleRGRD EOF ;
    public final EObject entryRuleRGRD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRGRD = null;


        try {
            // InternalDroneDSLLib.g:1532:45: (iv_ruleRGRD= ruleRGRD EOF )
            // InternalDroneDSLLib.g:1533:2: iv_ruleRGRD= ruleRGRD EOF
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
    // InternalDroneDSLLib.g:1539:1: ruleRGRD returns [EObject current=null] : (this_RotationGauche_0= ruleRotationGauche | this_RotationDroite_1= ruleRotationDroite ) ;
    public final EObject ruleRGRD() throws RecognitionException {
        EObject current = null;

        EObject this_RotationGauche_0 = null;

        EObject this_RotationDroite_1 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:1545:2: ( (this_RotationGauche_0= ruleRotationGauche | this_RotationDroite_1= ruleRotationDroite ) )
            // InternalDroneDSLLib.g:1546:2: (this_RotationGauche_0= ruleRotationGauche | this_RotationDroite_1= ruleRotationDroite )
            {
            // InternalDroneDSLLib.g:1546:2: (this_RotationGauche_0= ruleRotationGauche | this_RotationDroite_1= ruleRotationDroite )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            else if ( (LA11_0==27) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalDroneDSLLib.g:1547:3: this_RotationGauche_0= ruleRotationGauche
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
                    // InternalDroneDSLLib.g:1556:3: this_RotationDroite_1= ruleRotationDroite
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
    // InternalDroneDSLLib.g:1568:1: entryRuleAR returns [EObject current=null] : iv_ruleAR= ruleAR EOF ;
    public final EObject entryRuleAR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAR = null;


        try {
            // InternalDroneDSLLib.g:1568:43: (iv_ruleAR= ruleAR EOF )
            // InternalDroneDSLLib.g:1569:2: iv_ruleAR= ruleAR EOF
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
    // InternalDroneDSLLib.g:1575:1: ruleAR returns [EObject current=null] : (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer ) ;
    public final EObject ruleAR() throws RecognitionException {
        EObject current = null;

        EObject this_Avancer_0 = null;

        EObject this_Reculer_1 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:1581:2: ( (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer ) )
            // InternalDroneDSLLib.g:1582:2: (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer )
            {
            // InternalDroneDSLLib.g:1582:2: (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            else if ( (LA12_0==23) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalDroneDSLLib.g:1583:3: this_Avancer_0= ruleAvancer
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
                    // InternalDroneDSLLib.g:1592:3: this_Reculer_1= ruleReculer
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
    // InternalDroneDSLLib.g:1604:1: entryRuleParallele returns [EObject current=null] : iv_ruleParallele= ruleParallele EOF ;
    public final EObject entryRuleParallele() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallele = null;


        try {
            // InternalDroneDSLLib.g:1604:50: (iv_ruleParallele= ruleParallele EOF )
            // InternalDroneDSLLib.g:1605:2: iv_ruleParallele= ruleParallele EOF
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
    // InternalDroneDSLLib.g:1611:1: ruleParallele returns [EObject current=null] : (this_Parallele2_0= ruleParallele2 | this_Parallele3_1= ruleParallele3 | this_Parallele4_2= ruleParallele4 ) ;
    public final EObject ruleParallele() throws RecognitionException {
        EObject current = null;

        EObject this_Parallele2_0 = null;

        EObject this_Parallele3_1 = null;

        EObject this_Parallele4_2 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:1617:2: ( (this_Parallele2_0= ruleParallele2 | this_Parallele3_1= ruleParallele3 | this_Parallele4_2= ruleParallele4 ) )
            // InternalDroneDSLLib.g:1618:2: (this_Parallele2_0= ruleParallele2 | this_Parallele3_1= ruleParallele3 | this_Parallele4_2= ruleParallele4 )
            {
            // InternalDroneDSLLib.g:1618:2: (this_Parallele2_0= ruleParallele2 | this_Parallele3_1= ruleParallele3 | this_Parallele4_2= ruleParallele4 )
            int alt13=3;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalDroneDSLLib.g:1619:3: this_Parallele2_0= ruleParallele2
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
                    // InternalDroneDSLLib.g:1628:3: this_Parallele3_1= ruleParallele3
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
                    // InternalDroneDSLLib.g:1637:3: this_Parallele4_2= ruleParallele4
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
    // InternalDroneDSLLib.g:1649:1: entryRuleParallele2 returns [EObject current=null] : iv_ruleParallele2= ruleParallele2 EOF ;
    public final EObject entryRuleParallele2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallele2 = null;


        try {
            // InternalDroneDSLLib.g:1649:51: (iv_ruleParallele2= ruleParallele2 EOF )
            // InternalDroneDSLLib.g:1650:2: iv_ruleParallele2= ruleParallele2 EOF
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
    // InternalDroneDSLLib.g:1656:1: ruleParallele2 returns [EObject current=null] : ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) ) ;
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
            // InternalDroneDSLLib.g:1662:2: ( ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) ) )
            // InternalDroneDSLLib.g:1663:2: ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) )
            {
            // InternalDroneDSLLib.g:1663:2: ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) )
            int alt14=12;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalDroneDSLLib.g:1664:3: ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSLLib.g:1664:3: ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) )
                    // InternalDroneDSLLib.g:1665:4: ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) )
                    {
                    // InternalDroneDSLLib.g:1665:4: ( (lv_a_0_0= ruleMD ) )
                    // InternalDroneDSLLib.g:1666:5: (lv_a_0_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:1666:5: (lv_a_0_0= ruleMD )
                    // InternalDroneDSLLib.g:1667:6: lv_a_0_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getAMDParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_0_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_0_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,33,FOLLOW_16); 

                    				newLeafNode(otherlv_1, grammarAccess.getParallele2Access().getAmpersandKeyword_0_1());
                    			
                    // InternalDroneDSLLib.g:1688:4: ( (lv_t_2_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:1689:5: (lv_t_2_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:1689:5: (lv_t_2_0= ruleGDr )
                    // InternalDroneDSLLib.g:1690:6: lv_t_2_0= ruleGDr
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDroneDSLLib.g:1709:3: ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) )
                    {
                    // InternalDroneDSLLib.g:1709:3: ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) )
                    // InternalDroneDSLLib.g:1710:4: ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) )
                    {
                    // InternalDroneDSLLib.g:1710:4: ( (lv_a_3_0= ruleMD ) )
                    // InternalDroneDSLLib.g:1711:5: (lv_a_3_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:1711:5: (lv_a_3_0= ruleMD )
                    // InternalDroneDSLLib.g:1712:6: lv_a_3_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getAMDParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_3_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_3_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,33,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getParallele2Access().getAmpersandKeyword_1_1());
                    			
                    // InternalDroneDSLLib.g:1733:4: ( (lv_t_5_0= ruleAR ) )
                    // InternalDroneDSLLib.g:1734:5: (lv_t_5_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:1734:5: (lv_t_5_0= ruleAR )
                    // InternalDroneDSLLib.g:1735:6: lv_t_5_0= ruleAR
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDroneDSLLib.g:1754:3: ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSLLib.g:1754:3: ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) )
                    // InternalDroneDSLLib.g:1755:4: ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) )
                    {
                    // InternalDroneDSLLib.g:1755:4: ( (lv_a_6_0= ruleMD ) )
                    // InternalDroneDSLLib.g:1756:5: (lv_a_6_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:1756:5: (lv_a_6_0= ruleMD )
                    // InternalDroneDSLLib.g:1757:6: lv_a_6_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getAMDParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_6_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_6_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_7, grammarAccess.getParallele2Access().getAmpersandKeyword_2_1());
                    			
                    // InternalDroneDSLLib.g:1778:4: ( (lv_t_8_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:1779:5: (lv_t_8_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:1779:5: (lv_t_8_0= ruleRGRD )
                    // InternalDroneDSLLib.g:1780:6: lv_t_8_0= ruleRGRD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDroneDSLLib.g:1799:3: ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) )
                    {
                    // InternalDroneDSLLib.g:1799:3: ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) )
                    // InternalDroneDSLLib.g:1800:4: ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) )
                    {
                    // InternalDroneDSLLib.g:1800:4: ( (lv_t_9_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:1801:5: (lv_t_9_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:1801:5: (lv_t_9_0= ruleGDr )
                    // InternalDroneDSLLib.g:1802:6: lv_t_9_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTGDrParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_t_9_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"t",
                    							lv_t_9_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,33,FOLLOW_17); 

                    				newLeafNode(otherlv_10, grammarAccess.getParallele2Access().getAmpersandKeyword_3_1());
                    			
                    // InternalDroneDSLLib.g:1823:4: ( (lv_b_11_0= ruleAR ) )
                    // InternalDroneDSLLib.g:1824:5: (lv_b_11_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:1824:5: (lv_b_11_0= ruleAR )
                    // InternalDroneDSLLib.g:1825:6: lv_b_11_0= ruleAR
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalDroneDSLLib.g:1844:3: ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) )
                    {
                    // InternalDroneDSLLib.g:1844:3: ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) )
                    // InternalDroneDSLLib.g:1845:4: ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) )
                    {
                    // InternalDroneDSLLib.g:1845:4: ( (lv_t_12_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:1846:5: (lv_t_12_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:1846:5: (lv_t_12_0= ruleGDr )
                    // InternalDroneDSLLib.g:1847:6: lv_t_12_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTGDrParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_t_12_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"t",
                    							lv_t_12_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,33,FOLLOW_19); 

                    				newLeafNode(otherlv_13, grammarAccess.getParallele2Access().getAmpersandKeyword_4_1());
                    			
                    // InternalDroneDSLLib.g:1868:4: ( (lv_b_14_0= ruleMD ) )
                    // InternalDroneDSLLib.g:1869:5: (lv_b_14_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:1869:5: (lv_b_14_0= ruleMD )
                    // InternalDroneDSLLib.g:1870:6: lv_b_14_0= ruleMD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalDroneDSLLib.g:1889:3: ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSLLib.g:1889:3: ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) )
                    // InternalDroneDSLLib.g:1890:4: ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) )
                    {
                    // InternalDroneDSLLib.g:1890:4: ( (lv_t_15_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:1891:5: (lv_t_15_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:1891:5: (lv_t_15_0= ruleGDr )
                    // InternalDroneDSLLib.g:1892:6: lv_t_15_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTGDrParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_t_15_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"t",
                    							lv_t_15_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_16, grammarAccess.getParallele2Access().getAmpersandKeyword_5_1());
                    			
                    // InternalDroneDSLLib.g:1913:4: ( (lv_b_17_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:1914:5: (lv_b_17_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:1914:5: (lv_b_17_0= ruleRGRD )
                    // InternalDroneDSLLib.g:1915:6: lv_b_17_0= ruleRGRD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalDroneDSLLib.g:1934:3: ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) )
                    {
                    // InternalDroneDSLLib.g:1934:3: ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) )
                    // InternalDroneDSLLib.g:1935:4: ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) )
                    {
                    // InternalDroneDSLLib.g:1935:4: ( (lv_t_18_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:1936:5: (lv_t_18_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:1936:5: (lv_t_18_0= ruleRGRD )
                    // InternalDroneDSLLib.g:1937:6: lv_t_18_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTRGRDParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_t_18_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"t",
                    							lv_t_18_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_19=(Token)match(input,33,FOLLOW_19); 

                    				newLeafNode(otherlv_19, grammarAccess.getParallele2Access().getAmpersandKeyword_6_1());
                    			
                    // InternalDroneDSLLib.g:1958:4: ( (lv_a_20_0= ruleMD ) )
                    // InternalDroneDSLLib.g:1959:5: (lv_a_20_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:1959:5: (lv_a_20_0= ruleMD )
                    // InternalDroneDSLLib.g:1960:6: lv_a_20_0= ruleMD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalDroneDSLLib.g:1979:3: ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) )
                    {
                    // InternalDroneDSLLib.g:1979:3: ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) )
                    // InternalDroneDSLLib.g:1980:4: ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) )
                    {
                    // InternalDroneDSLLib.g:1980:4: ( (lv_t_21_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:1981:5: (lv_t_21_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:1981:5: (lv_t_21_0= ruleRGRD )
                    // InternalDroneDSLLib.g:1982:6: lv_t_21_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTRGRDParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_t_21_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"t",
                    							lv_t_21_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_22=(Token)match(input,33,FOLLOW_17); 

                    				newLeafNode(otherlv_22, grammarAccess.getParallele2Access().getAmpersandKeyword_7_1());
                    			
                    // InternalDroneDSLLib.g:2003:4: ( (lv_a_23_0= ruleAR ) )
                    // InternalDroneDSLLib.g:2004:5: (lv_a_23_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:2004:5: (lv_a_23_0= ruleAR )
                    // InternalDroneDSLLib.g:2005:6: lv_a_23_0= ruleAR
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalDroneDSLLib.g:2024:3: ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSLLib.g:2024:3: ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) )
                    // InternalDroneDSLLib.g:2025:4: ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) )
                    {
                    // InternalDroneDSLLib.g:2025:4: ( (lv_t_24_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:2026:5: (lv_t_24_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:2026:5: (lv_t_24_0= ruleRGRD )
                    // InternalDroneDSLLib.g:2027:6: lv_t_24_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTRGRDParserRuleCall_8_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_t_24_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"t",
                    							lv_t_24_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_25=(Token)match(input,33,FOLLOW_16); 

                    				newLeafNode(otherlv_25, grammarAccess.getParallele2Access().getAmpersandKeyword_8_1());
                    			
                    // InternalDroneDSLLib.g:2048:4: ( (lv_a_26_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:2049:5: (lv_a_26_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:2049:5: (lv_a_26_0= ruleGDr )
                    // InternalDroneDSLLib.g:2050:6: lv_a_26_0= ruleGDr
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalDroneDSLLib.g:2069:3: ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) )
                    {
                    // InternalDroneDSLLib.g:2069:3: ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) )
                    // InternalDroneDSLLib.g:2070:4: ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) )
                    {
                    // InternalDroneDSLLib.g:2070:4: ( (lv_t_27_0= ruleAR ) )
                    // InternalDroneDSLLib.g:2071:5: (lv_t_27_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:2071:5: (lv_t_27_0= ruleAR )
                    // InternalDroneDSLLib.g:2072:6: lv_t_27_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTARParserRuleCall_9_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_t_27_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"t",
                    							lv_t_27_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_28=(Token)match(input,33,FOLLOW_19); 

                    				newLeafNode(otherlv_28, grammarAccess.getParallele2Access().getAmpersandKeyword_9_1());
                    			
                    // InternalDroneDSLLib.g:2093:4: ( (lv_a_29_0= ruleMD ) )
                    // InternalDroneDSLLib.g:2094:5: (lv_a_29_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:2094:5: (lv_a_29_0= ruleMD )
                    // InternalDroneDSLLib.g:2095:6: lv_a_29_0= ruleMD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalDroneDSLLib.g:2114:3: ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSLLib.g:2114:3: ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) )
                    // InternalDroneDSLLib.g:2115:4: ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) )
                    {
                    // InternalDroneDSLLib.g:2115:4: ( (lv_t_30_0= ruleAR ) )
                    // InternalDroneDSLLib.g:2116:5: (lv_t_30_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:2116:5: (lv_t_30_0= ruleAR )
                    // InternalDroneDSLLib.g:2117:6: lv_t_30_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTARParserRuleCall_10_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_t_30_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"t",
                    							lv_t_30_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_31=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_31, grammarAccess.getParallele2Access().getAmpersandKeyword_10_1());
                    			
                    // InternalDroneDSLLib.g:2138:4: ( (lv_a_32_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:2139:5: (lv_a_32_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:2139:5: (lv_a_32_0= ruleRGRD )
                    // InternalDroneDSLLib.g:2140:6: lv_a_32_0= ruleRGRD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 12 :
                    // InternalDroneDSLLib.g:2159:3: ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSLLib.g:2159:3: ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) )
                    // InternalDroneDSLLib.g:2160:4: ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) )
                    {
                    // InternalDroneDSLLib.g:2160:4: ( (lv_t_33_0= ruleAR ) )
                    // InternalDroneDSLLib.g:2161:5: (lv_t_33_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:2161:5: (lv_t_33_0= ruleAR )
                    // InternalDroneDSLLib.g:2162:6: lv_t_33_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTARParserRuleCall_11_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_t_33_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele2Rule());
                    						}
                    						set(
                    							current,
                    							"t",
                    							lv_t_33_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_34=(Token)match(input,33,FOLLOW_16); 

                    				newLeafNode(otherlv_34, grammarAccess.getParallele2Access().getAmpersandKeyword_11_1());
                    			
                    // InternalDroneDSLLib.g:2183:4: ( (lv_a_35_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:2184:5: (lv_a_35_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:2184:5: (lv_a_35_0= ruleGDr )
                    // InternalDroneDSLLib.g:2185:6: lv_a_35_0= ruleGDr
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
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
    // InternalDroneDSLLib.g:2207:1: entryRuleParallele3 returns [EObject current=null] : iv_ruleParallele3= ruleParallele3 EOF ;
    public final EObject entryRuleParallele3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallele3 = null;


        try {
            // InternalDroneDSLLib.g:2207:51: (iv_ruleParallele3= ruleParallele3 EOF )
            // InternalDroneDSLLib.g:2208:2: iv_ruleParallele3= ruleParallele3 EOF
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
    // InternalDroneDSLLib.g:2214:1: ruleParallele3 returns [EObject current=null] : ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) ) ;
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
            // InternalDroneDSLLib.g:2220:2: ( ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) ) )
            // InternalDroneDSLLib.g:2221:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) )
            {
            // InternalDroneDSLLib.g:2221:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) )
            int alt15=24;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalDroneDSLLib.g:2222:3: ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) )
                    {
                    // InternalDroneDSLLib.g:2222:3: ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) )
                    // InternalDroneDSLLib.g:2223:4: ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) )
                    {
                    // InternalDroneDSLLib.g:2223:4: ( (lv_a_0_0= ruleAR ) )
                    // InternalDroneDSLLib.g:2224:5: (lv_a_0_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:2224:5: (lv_a_0_0= ruleAR )
                    // InternalDroneDSLLib.g:2225:6: lv_a_0_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAARParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_0_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_0_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,33,FOLLOW_16); 

                    				newLeafNode(otherlv_1, grammarAccess.getParallele3Access().getAmpersandKeyword_0_1());
                    			
                    // InternalDroneDSLLib.g:2246:4: ( (lv_b_2_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:2247:5: (lv_b_2_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:2247:5: (lv_b_2_0= ruleGDr )
                    // InternalDroneDSLLib.g:2248:6: lv_b_2_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBGDrParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_2_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_2_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,33,FOLLOW_19); 

                    				newLeafNode(otherlv_3, grammarAccess.getParallele3Access().getAmpersandKeyword_0_3());
                    			
                    // InternalDroneDSLLib.g:2269:4: ( (lv_c_4_0= ruleMD ) )
                    // InternalDroneDSLLib.g:2270:5: (lv_c_4_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:2270:5: (lv_c_4_0= ruleMD )
                    // InternalDroneDSLLib.g:2271:6: lv_c_4_0= ruleMD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDroneDSLLib.g:2290:3: ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSLLib.g:2290:3: ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) )
                    // InternalDroneDSLLib.g:2291:4: ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) )
                    {
                    // InternalDroneDSLLib.g:2291:4: ( (lv_a_5_0= ruleAR ) )
                    // InternalDroneDSLLib.g:2292:5: (lv_a_5_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:2292:5: (lv_a_5_0= ruleAR )
                    // InternalDroneDSLLib.g:2293:6: lv_a_5_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAARParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_5_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_5_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,33,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getParallele3Access().getAmpersandKeyword_1_1());
                    			
                    // InternalDroneDSLLib.g:2314:4: ( (lv_b_7_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:2315:5: (lv_b_7_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:2315:5: (lv_b_7_0= ruleGDr )
                    // InternalDroneDSLLib.g:2316:6: lv_b_7_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBGDrParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_7_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_7_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_8, grammarAccess.getParallele3Access().getAmpersandKeyword_1_3());
                    			
                    // InternalDroneDSLLib.g:2337:4: ( (lv_c_9_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:2338:5: (lv_c_9_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:2338:5: (lv_c_9_0= ruleRGRD )
                    // InternalDroneDSLLib.g:2339:6: lv_c_9_0= ruleRGRD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDroneDSLLib.g:2358:3: ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSLLib.g:2358:3: ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) )
                    // InternalDroneDSLLib.g:2359:4: ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) )
                    {
                    // InternalDroneDSLLib.g:2359:4: ( (lv_a_10_0= ruleAR ) )
                    // InternalDroneDSLLib.g:2360:5: (lv_a_10_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:2360:5: (lv_a_10_0= ruleAR )
                    // InternalDroneDSLLib.g:2361:6: lv_a_10_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAARParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_10_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_10_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,33,FOLLOW_19); 

                    				newLeafNode(otherlv_11, grammarAccess.getParallele3Access().getAmpersandKeyword_2_1());
                    			
                    // InternalDroneDSLLib.g:2382:4: ( (lv_b_12_0= ruleMD ) )
                    // InternalDroneDSLLib.g:2383:5: (lv_b_12_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:2383:5: (lv_b_12_0= ruleMD )
                    // InternalDroneDSLLib.g:2384:6: lv_b_12_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBMDParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_12_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_12_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,33,FOLLOW_16); 

                    				newLeafNode(otherlv_13, grammarAccess.getParallele3Access().getAmpersandKeyword_2_3());
                    			
                    // InternalDroneDSLLib.g:2405:4: ( (lv_c_14_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:2406:5: (lv_c_14_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:2406:5: (lv_c_14_0= ruleGDr )
                    // InternalDroneDSLLib.g:2407:6: lv_c_14_0= ruleGDr
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDroneDSLLib.g:2426:3: ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSLLib.g:2426:3: ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) )
                    // InternalDroneDSLLib.g:2427:4: ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) )
                    {
                    // InternalDroneDSLLib.g:2427:4: ( (lv_a_15_0= ruleAR ) )
                    // InternalDroneDSLLib.g:2428:5: (lv_a_15_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:2428:5: (lv_a_15_0= ruleAR )
                    // InternalDroneDSLLib.g:2429:6: lv_a_15_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAARParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_15_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_15_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,33,FOLLOW_19); 

                    				newLeafNode(otherlv_16, grammarAccess.getParallele3Access().getAmpersandKeyword_3_1());
                    			
                    // InternalDroneDSLLib.g:2450:4: ( (lv_b_17_0= ruleMD ) )
                    // InternalDroneDSLLib.g:2451:5: (lv_b_17_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:2451:5: (lv_b_17_0= ruleMD )
                    // InternalDroneDSLLib.g:2452:6: lv_b_17_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBMDParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_17_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_17_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_18=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_18, grammarAccess.getParallele3Access().getAmpersandKeyword_3_3());
                    			
                    // InternalDroneDSLLib.g:2473:4: ( (lv_c_19_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:2474:5: (lv_c_19_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:2474:5: (lv_c_19_0= ruleRGRD )
                    // InternalDroneDSLLib.g:2475:6: lv_c_19_0= ruleRGRD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalDroneDSLLib.g:2494:3: ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) )
                    {
                    // InternalDroneDSLLib.g:2494:3: ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) )
                    // InternalDroneDSLLib.g:2495:4: ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) )
                    {
                    // InternalDroneDSLLib.g:2495:4: ( (lv_a_20_0= ruleAR ) )
                    // InternalDroneDSLLib.g:2496:5: (lv_a_20_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:2496:5: (lv_a_20_0= ruleAR )
                    // InternalDroneDSLLib.g:2497:6: lv_a_20_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAARParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_20_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_20_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_21=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_21, grammarAccess.getParallele3Access().getAmpersandKeyword_4_1());
                    			
                    // InternalDroneDSLLib.g:2518:4: ( (lv_b_22_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:2519:5: (lv_b_22_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:2519:5: (lv_b_22_0= ruleRGRD )
                    // InternalDroneDSLLib.g:2520:6: lv_b_22_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_22_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_22_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_23=(Token)match(input,33,FOLLOW_19); 

                    				newLeafNode(otherlv_23, grammarAccess.getParallele3Access().getAmpersandKeyword_4_3());
                    			
                    // InternalDroneDSLLib.g:2541:4: ( (lv_c_24_0= ruleMD ) )
                    // InternalDroneDSLLib.g:2542:5: (lv_c_24_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:2542:5: (lv_c_24_0= ruleMD )
                    // InternalDroneDSLLib.g:2543:6: lv_c_24_0= ruleMD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalDroneDSLLib.g:2562:3: ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSLLib.g:2562:3: ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) )
                    // InternalDroneDSLLib.g:2563:4: ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) )
                    {
                    // InternalDroneDSLLib.g:2563:4: ( (lv_a_25_0= ruleAR ) )
                    // InternalDroneDSLLib.g:2564:5: (lv_a_25_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:2564:5: (lv_a_25_0= ruleAR )
                    // InternalDroneDSLLib.g:2565:6: lv_a_25_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAARParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_25_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_25_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_26=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_26, grammarAccess.getParallele3Access().getAmpersandKeyword_5_1());
                    			
                    // InternalDroneDSLLib.g:2586:4: ( (lv_b_27_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:2587:5: (lv_b_27_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:2587:5: (lv_b_27_0= ruleRGRD )
                    // InternalDroneDSLLib.g:2588:6: lv_b_27_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_27_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_27_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_28=(Token)match(input,33,FOLLOW_16); 

                    				newLeafNode(otherlv_28, grammarAccess.getParallele3Access().getAmpersandKeyword_5_3());
                    			
                    // InternalDroneDSLLib.g:2609:4: ( (lv_c_29_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:2610:5: (lv_c_29_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:2610:5: (lv_c_29_0= ruleGDr )
                    // InternalDroneDSLLib.g:2611:6: lv_c_29_0= ruleGDr
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalDroneDSLLib.g:2630:3: ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) )
                    {
                    // InternalDroneDSLLib.g:2630:3: ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) )
                    // InternalDroneDSLLib.g:2631:4: ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) )
                    {
                    // InternalDroneDSLLib.g:2631:4: ( (lv_a_30_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:2632:5: (lv_a_30_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:2632:5: (lv_a_30_0= ruleGDr )
                    // InternalDroneDSLLib.g:2633:6: lv_a_30_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAGDrParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_30_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_30_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_31=(Token)match(input,33,FOLLOW_17); 

                    				newLeafNode(otherlv_31, grammarAccess.getParallele3Access().getAmpersandKeyword_6_1());
                    			
                    // InternalDroneDSLLib.g:2654:4: ( (lv_b_32_0= ruleAR ) )
                    // InternalDroneDSLLib.g:2655:5: (lv_b_32_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:2655:5: (lv_b_32_0= ruleAR )
                    // InternalDroneDSLLib.g:2656:6: lv_b_32_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBARParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_32_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_32_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_33=(Token)match(input,33,FOLLOW_19); 

                    				newLeafNode(otherlv_33, grammarAccess.getParallele3Access().getAmpersandKeyword_6_3());
                    			
                    // InternalDroneDSLLib.g:2677:4: ( (lv_c_34_0= ruleMD ) )
                    // InternalDroneDSLLib.g:2678:5: (lv_c_34_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:2678:5: (lv_c_34_0= ruleMD )
                    // InternalDroneDSLLib.g:2679:6: lv_c_34_0= ruleMD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalDroneDSLLib.g:2698:3: ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSLLib.g:2698:3: ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) )
                    // InternalDroneDSLLib.g:2699:4: ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) )
                    {
                    // InternalDroneDSLLib.g:2699:4: ( (lv_a_35_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:2700:5: (lv_a_35_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:2700:5: (lv_a_35_0= ruleGDr )
                    // InternalDroneDSLLib.g:2701:6: lv_a_35_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAGDrParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_35_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_35_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_36=(Token)match(input,33,FOLLOW_17); 

                    				newLeafNode(otherlv_36, grammarAccess.getParallele3Access().getAmpersandKeyword_7_1());
                    			
                    // InternalDroneDSLLib.g:2722:4: ( (lv_b_37_0= ruleAR ) )
                    // InternalDroneDSLLib.g:2723:5: (lv_b_37_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:2723:5: (lv_b_37_0= ruleAR )
                    // InternalDroneDSLLib.g:2724:6: lv_b_37_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBARParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_37_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_37_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_38=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_38, grammarAccess.getParallele3Access().getAmpersandKeyword_7_3());
                    			
                    // InternalDroneDSLLib.g:2745:4: ( (lv_c_39_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:2746:5: (lv_c_39_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:2746:5: (lv_c_39_0= ruleRGRD )
                    // InternalDroneDSLLib.g:2747:6: lv_c_39_0= ruleRGRD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalDroneDSLLib.g:2766:3: ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) )
                    {
                    // InternalDroneDSLLib.g:2766:3: ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) )
                    // InternalDroneDSLLib.g:2767:4: ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) )
                    {
                    // InternalDroneDSLLib.g:2767:4: ( (lv_a_40_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:2768:5: (lv_a_40_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:2768:5: (lv_a_40_0= ruleGDr )
                    // InternalDroneDSLLib.g:2769:6: lv_a_40_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAGDrParserRuleCall_8_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_40_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_40_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_41=(Token)match(input,33,FOLLOW_19); 

                    				newLeafNode(otherlv_41, grammarAccess.getParallele3Access().getAmpersandKeyword_8_1());
                    			
                    // InternalDroneDSLLib.g:2790:4: ( (lv_b_42_0= ruleMD ) )
                    // InternalDroneDSLLib.g:2791:5: (lv_b_42_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:2791:5: (lv_b_42_0= ruleMD )
                    // InternalDroneDSLLib.g:2792:6: lv_b_42_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBMDParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_42_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_42_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_43=(Token)match(input,33,FOLLOW_17); 

                    				newLeafNode(otherlv_43, grammarAccess.getParallele3Access().getAmpersandKeyword_8_3());
                    			
                    // InternalDroneDSLLib.g:2813:4: ( (lv_c_44_0= ruleAR ) )
                    // InternalDroneDSLLib.g:2814:5: (lv_c_44_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:2814:5: (lv_c_44_0= ruleAR )
                    // InternalDroneDSLLib.g:2815:6: lv_c_44_0= ruleAR
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalDroneDSLLib.g:2834:3: ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSLLib.g:2834:3: ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) )
                    // InternalDroneDSLLib.g:2835:4: ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) )
                    {
                    // InternalDroneDSLLib.g:2835:4: ( (lv_a_45_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:2836:5: (lv_a_45_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:2836:5: (lv_a_45_0= ruleGDr )
                    // InternalDroneDSLLib.g:2837:6: lv_a_45_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAGDrParserRuleCall_9_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_45_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_45_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_46=(Token)match(input,33,FOLLOW_19); 

                    				newLeafNode(otherlv_46, grammarAccess.getParallele3Access().getAmpersandKeyword_9_1());
                    			
                    // InternalDroneDSLLib.g:2858:4: ( (lv_b_47_0= ruleMD ) )
                    // InternalDroneDSLLib.g:2859:5: (lv_b_47_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:2859:5: (lv_b_47_0= ruleMD )
                    // InternalDroneDSLLib.g:2860:6: lv_b_47_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBMDParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_47_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_47_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_48=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_48, grammarAccess.getParallele3Access().getAmpersandKeyword_9_3());
                    			
                    // InternalDroneDSLLib.g:2881:4: ( (lv_c_49_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:2882:5: (lv_c_49_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:2882:5: (lv_c_49_0= ruleRGRD )
                    // InternalDroneDSLLib.g:2883:6: lv_c_49_0= ruleRGRD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalDroneDSLLib.g:2902:3: ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) )
                    {
                    // InternalDroneDSLLib.g:2902:3: ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) )
                    // InternalDroneDSLLib.g:2903:4: ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) )
                    {
                    // InternalDroneDSLLib.g:2903:4: ( (lv_a_50_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:2904:5: (lv_a_50_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:2904:5: (lv_a_50_0= ruleGDr )
                    // InternalDroneDSLLib.g:2905:6: lv_a_50_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAGDrParserRuleCall_10_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_50_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_50_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_51=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_51, grammarAccess.getParallele3Access().getAmpersandKeyword_10_1());
                    			
                    // InternalDroneDSLLib.g:2926:4: ( (lv_b_52_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:2927:5: (lv_b_52_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:2927:5: (lv_b_52_0= ruleRGRD )
                    // InternalDroneDSLLib.g:2928:6: lv_b_52_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_52_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_52_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_53=(Token)match(input,33,FOLLOW_17); 

                    				newLeafNode(otherlv_53, grammarAccess.getParallele3Access().getAmpersandKeyword_10_3());
                    			
                    // InternalDroneDSLLib.g:2949:4: ( (lv_c_54_0= ruleAR ) )
                    // InternalDroneDSLLib.g:2950:5: (lv_c_54_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:2950:5: (lv_c_54_0= ruleAR )
                    // InternalDroneDSLLib.g:2951:6: lv_c_54_0= ruleAR
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 12 :
                    // InternalDroneDSLLib.g:2970:3: ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) )
                    {
                    // InternalDroneDSLLib.g:2970:3: ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) )
                    // InternalDroneDSLLib.g:2971:4: ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) )
                    {
                    // InternalDroneDSLLib.g:2971:4: ( (lv_a_55_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:2972:5: (lv_a_55_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:2972:5: (lv_a_55_0= ruleGDr )
                    // InternalDroneDSLLib.g:2973:6: lv_a_55_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAGDrParserRuleCall_11_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_55_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_55_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_56=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_56, grammarAccess.getParallele3Access().getAmpersandKeyword_11_1());
                    			
                    // InternalDroneDSLLib.g:2994:4: ( (lv_b_57_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:2995:5: (lv_b_57_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:2995:5: (lv_b_57_0= ruleRGRD )
                    // InternalDroneDSLLib.g:2996:6: lv_b_57_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_57_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_57_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_58=(Token)match(input,33,FOLLOW_19); 

                    				newLeafNode(otherlv_58, grammarAccess.getParallele3Access().getAmpersandKeyword_11_3());
                    			
                    // InternalDroneDSLLib.g:3017:4: ( (lv_c_59_0= ruleMD ) )
                    // InternalDroneDSLLib.g:3018:5: (lv_c_59_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:3018:5: (lv_c_59_0= ruleMD )
                    // InternalDroneDSLLib.g:3019:6: lv_c_59_0= ruleMD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 13 :
                    // InternalDroneDSLLib.g:3038:3: ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSLLib.g:3038:3: ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) )
                    // InternalDroneDSLLib.g:3039:4: ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) )
                    {
                    // InternalDroneDSLLib.g:3039:4: ( (lv_a_60_0= ruleMD ) )
                    // InternalDroneDSLLib.g:3040:5: (lv_a_60_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:3040:5: (lv_a_60_0= ruleMD )
                    // InternalDroneDSLLib.g:3041:6: lv_a_60_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAMDParserRuleCall_12_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_60_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_60_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_61=(Token)match(input,33,FOLLOW_17); 

                    				newLeafNode(otherlv_61, grammarAccess.getParallele3Access().getAmpersandKeyword_12_1());
                    			
                    // InternalDroneDSLLib.g:3062:4: ( (lv_b_62_0= ruleAR ) )
                    // InternalDroneDSLLib.g:3063:5: (lv_b_62_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:3063:5: (lv_b_62_0= ruleAR )
                    // InternalDroneDSLLib.g:3064:6: lv_b_62_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBARParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_62_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_62_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_63=(Token)match(input,33,FOLLOW_16); 

                    				newLeafNode(otherlv_63, grammarAccess.getParallele3Access().getAmpersandKeyword_12_3());
                    			
                    // InternalDroneDSLLib.g:3085:4: ( (lv_c_64_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:3086:5: (lv_c_64_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:3086:5: (lv_c_64_0= ruleGDr )
                    // InternalDroneDSLLib.g:3087:6: lv_c_64_0= ruleGDr
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 14 :
                    // InternalDroneDSLLib.g:3106:3: ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSLLib.g:3106:3: ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) )
                    // InternalDroneDSLLib.g:3107:4: ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) )
                    {
                    // InternalDroneDSLLib.g:3107:4: ( (lv_a_65_0= ruleMD ) )
                    // InternalDroneDSLLib.g:3108:5: (lv_a_65_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:3108:5: (lv_a_65_0= ruleMD )
                    // InternalDroneDSLLib.g:3109:6: lv_a_65_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAMDParserRuleCall_13_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_65_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_65_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_66=(Token)match(input,33,FOLLOW_17); 

                    				newLeafNode(otherlv_66, grammarAccess.getParallele3Access().getAmpersandKeyword_13_1());
                    			
                    // InternalDroneDSLLib.g:3130:4: ( (lv_b_67_0= ruleAR ) )
                    // InternalDroneDSLLib.g:3131:5: (lv_b_67_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:3131:5: (lv_b_67_0= ruleAR )
                    // InternalDroneDSLLib.g:3132:6: lv_b_67_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBARParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_67_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_67_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_68=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_68, grammarAccess.getParallele3Access().getAmpersandKeyword_13_3());
                    			
                    // InternalDroneDSLLib.g:3153:4: ( (lv_c_69_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:3154:5: (lv_c_69_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:3154:5: (lv_c_69_0= ruleRGRD )
                    // InternalDroneDSLLib.g:3155:6: lv_c_69_0= ruleRGRD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 15 :
                    // InternalDroneDSLLib.g:3174:3: ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) )
                    {
                    // InternalDroneDSLLib.g:3174:3: ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) )
                    // InternalDroneDSLLib.g:3175:4: ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) )
                    {
                    // InternalDroneDSLLib.g:3175:4: ( (lv_a_70_0= ruleMD ) )
                    // InternalDroneDSLLib.g:3176:5: (lv_a_70_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:3176:5: (lv_a_70_0= ruleMD )
                    // InternalDroneDSLLib.g:3177:6: lv_a_70_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAMDParserRuleCall_14_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_70_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_70_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_71=(Token)match(input,33,FOLLOW_16); 

                    				newLeafNode(otherlv_71, grammarAccess.getParallele3Access().getAmpersandKeyword_14_1());
                    			
                    // InternalDroneDSLLib.g:3198:4: ( (lv_b_72_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:3199:5: (lv_b_72_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:3199:5: (lv_b_72_0= ruleGDr )
                    // InternalDroneDSLLib.g:3200:6: lv_b_72_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBGDrParserRuleCall_14_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_72_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_72_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_73=(Token)match(input,33,FOLLOW_17); 

                    				newLeafNode(otherlv_73, grammarAccess.getParallele3Access().getAmpersandKeyword_14_3());
                    			
                    // InternalDroneDSLLib.g:3221:4: ( (lv_c_74_0= ruleAR ) )
                    // InternalDroneDSLLib.g:3222:5: (lv_c_74_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:3222:5: (lv_c_74_0= ruleAR )
                    // InternalDroneDSLLib.g:3223:6: lv_c_74_0= ruleAR
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 16 :
                    // InternalDroneDSLLib.g:3242:3: ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSLLib.g:3242:3: ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) )
                    // InternalDroneDSLLib.g:3243:4: ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) )
                    {
                    // InternalDroneDSLLib.g:3243:4: ( (lv_a_75_0= ruleMD ) )
                    // InternalDroneDSLLib.g:3244:5: (lv_a_75_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:3244:5: (lv_a_75_0= ruleMD )
                    // InternalDroneDSLLib.g:3245:6: lv_a_75_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAMDParserRuleCall_15_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_75_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_75_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_76=(Token)match(input,33,FOLLOW_16); 

                    				newLeafNode(otherlv_76, grammarAccess.getParallele3Access().getAmpersandKeyword_15_1());
                    			
                    // InternalDroneDSLLib.g:3266:4: ( (lv_b_77_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:3267:5: (lv_b_77_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:3267:5: (lv_b_77_0= ruleGDr )
                    // InternalDroneDSLLib.g:3268:6: lv_b_77_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBGDrParserRuleCall_15_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_77_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_77_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_78=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_78, grammarAccess.getParallele3Access().getAmpersandKeyword_15_3());
                    			
                    // InternalDroneDSLLib.g:3289:4: ( (lv_c_79_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:3290:5: (lv_c_79_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:3290:5: (lv_c_79_0= ruleRGRD )
                    // InternalDroneDSLLib.g:3291:6: lv_c_79_0= ruleRGRD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 17 :
                    // InternalDroneDSLLib.g:3310:3: ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSLLib.g:3310:3: ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) )
                    // InternalDroneDSLLib.g:3311:4: ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) )
                    {
                    // InternalDroneDSLLib.g:3311:4: ( (lv_a_80_0= ruleMD ) )
                    // InternalDroneDSLLib.g:3312:5: (lv_a_80_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:3312:5: (lv_a_80_0= ruleMD )
                    // InternalDroneDSLLib.g:3313:6: lv_a_80_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAMDParserRuleCall_16_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_80_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_80_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_81=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_81, grammarAccess.getParallele3Access().getAmpersandKeyword_16_1());
                    			
                    // InternalDroneDSLLib.g:3334:4: ( (lv_b_82_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:3335:5: (lv_b_82_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:3335:5: (lv_b_82_0= ruleRGRD )
                    // InternalDroneDSLLib.g:3336:6: lv_b_82_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_16_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_82_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_82_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_83=(Token)match(input,33,FOLLOW_16); 

                    				newLeafNode(otherlv_83, grammarAccess.getParallele3Access().getAmpersandKeyword_16_3());
                    			
                    // InternalDroneDSLLib.g:3357:4: ( (lv_c_84_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:3358:5: (lv_c_84_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:3358:5: (lv_c_84_0= ruleGDr )
                    // InternalDroneDSLLib.g:3359:6: lv_c_84_0= ruleGDr
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 18 :
                    // InternalDroneDSLLib.g:3378:3: ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) )
                    {
                    // InternalDroneDSLLib.g:3378:3: ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) )
                    // InternalDroneDSLLib.g:3379:4: ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) )
                    {
                    // InternalDroneDSLLib.g:3379:4: ( (lv_a_85_0= ruleMD ) )
                    // InternalDroneDSLLib.g:3380:5: (lv_a_85_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:3380:5: (lv_a_85_0= ruleMD )
                    // InternalDroneDSLLib.g:3381:6: lv_a_85_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAMDParserRuleCall_17_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_85_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_85_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_86=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_86, grammarAccess.getParallele3Access().getAmpersandKeyword_17_1());
                    			
                    // InternalDroneDSLLib.g:3402:4: ( (lv_b_87_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:3403:5: (lv_b_87_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:3403:5: (lv_b_87_0= ruleRGRD )
                    // InternalDroneDSLLib.g:3404:6: lv_b_87_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_17_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_87_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_87_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_88=(Token)match(input,33,FOLLOW_17); 

                    				newLeafNode(otherlv_88, grammarAccess.getParallele3Access().getAmpersandKeyword_17_3());
                    			
                    // InternalDroneDSLLib.g:3425:4: ( (lv_c_89_0= ruleAR ) )
                    // InternalDroneDSLLib.g:3426:5: (lv_c_89_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:3426:5: (lv_c_89_0= ruleAR )
                    // InternalDroneDSLLib.g:3427:6: lv_c_89_0= ruleAR
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 19 :
                    // InternalDroneDSLLib.g:3446:3: ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) )
                    {
                    // InternalDroneDSLLib.g:3446:3: ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) )
                    // InternalDroneDSLLib.g:3447:4: ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) )
                    {
                    // InternalDroneDSLLib.g:3447:4: ( (lv_a_90_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:3448:5: (lv_a_90_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:3448:5: (lv_a_90_0= ruleRGRD )
                    // InternalDroneDSLLib.g:3449:6: lv_a_90_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getARGRDParserRuleCall_18_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_90_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_90_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_91=(Token)match(input,33,FOLLOW_17); 

                    				newLeafNode(otherlv_91, grammarAccess.getParallele3Access().getAmpersandKeyword_18_1());
                    			
                    // InternalDroneDSLLib.g:3470:4: ( (lv_b_92_0= ruleAR ) )
                    // InternalDroneDSLLib.g:3471:5: (lv_b_92_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:3471:5: (lv_b_92_0= ruleAR )
                    // InternalDroneDSLLib.g:3472:6: lv_b_92_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBARParserRuleCall_18_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_92_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_92_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_93=(Token)match(input,33,FOLLOW_19); 

                    				newLeafNode(otherlv_93, grammarAccess.getParallele3Access().getAmpersandKeyword_18_3());
                    			
                    // InternalDroneDSLLib.g:3493:4: ( (lv_c_94_0= ruleMD ) )
                    // InternalDroneDSLLib.g:3494:5: (lv_c_94_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:3494:5: (lv_c_94_0= ruleMD )
                    // InternalDroneDSLLib.g:3495:6: lv_c_94_0= ruleMD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 20 :
                    // InternalDroneDSLLib.g:3514:3: ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSLLib.g:3514:3: ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) )
                    // InternalDroneDSLLib.g:3515:4: ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) )
                    {
                    // InternalDroneDSLLib.g:3515:4: ( (lv_a_95_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:3516:5: (lv_a_95_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:3516:5: (lv_a_95_0= ruleRGRD )
                    // InternalDroneDSLLib.g:3517:6: lv_a_95_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getARGRDParserRuleCall_19_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_95_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_95_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_96=(Token)match(input,33,FOLLOW_17); 

                    				newLeafNode(otherlv_96, grammarAccess.getParallele3Access().getAmpersandKeyword_19_1());
                    			
                    // InternalDroneDSLLib.g:3538:4: ( (lv_b_97_0= ruleAR ) )
                    // InternalDroneDSLLib.g:3539:5: (lv_b_97_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:3539:5: (lv_b_97_0= ruleAR )
                    // InternalDroneDSLLib.g:3540:6: lv_b_97_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBARParserRuleCall_19_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_97_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_97_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_98=(Token)match(input,33,FOLLOW_16); 

                    				newLeafNode(otherlv_98, grammarAccess.getParallele3Access().getAmpersandKeyword_19_3());
                    			
                    // InternalDroneDSLLib.g:3561:4: ( (lv_c_99_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:3562:5: (lv_c_99_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:3562:5: (lv_c_99_0= ruleGDr )
                    // InternalDroneDSLLib.g:3563:6: lv_c_99_0= ruleGDr
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 21 :
                    // InternalDroneDSLLib.g:3582:3: ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) )
                    {
                    // InternalDroneDSLLib.g:3582:3: ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) )
                    // InternalDroneDSLLib.g:3583:4: ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) )
                    {
                    // InternalDroneDSLLib.g:3583:4: ( (lv_a_100_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:3584:5: (lv_a_100_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:3584:5: (lv_a_100_0= ruleRGRD )
                    // InternalDroneDSLLib.g:3585:6: lv_a_100_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getARGRDParserRuleCall_20_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_100_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_100_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_101=(Token)match(input,33,FOLLOW_19); 

                    				newLeafNode(otherlv_101, grammarAccess.getParallele3Access().getAmpersandKeyword_20_1());
                    			
                    // InternalDroneDSLLib.g:3606:4: ( (lv_b_102_0= ruleMD ) )
                    // InternalDroneDSLLib.g:3607:5: (lv_b_102_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:3607:5: (lv_b_102_0= ruleMD )
                    // InternalDroneDSLLib.g:3608:6: lv_b_102_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBMDParserRuleCall_20_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_102_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_102_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_103=(Token)match(input,33,FOLLOW_17); 

                    				newLeafNode(otherlv_103, grammarAccess.getParallele3Access().getAmpersandKeyword_20_3());
                    			
                    // InternalDroneDSLLib.g:3629:4: ( (lv_c_104_0= ruleAR ) )
                    // InternalDroneDSLLib.g:3630:5: (lv_c_104_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:3630:5: (lv_c_104_0= ruleAR )
                    // InternalDroneDSLLib.g:3631:6: lv_c_104_0= ruleAR
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 22 :
                    // InternalDroneDSLLib.g:3650:3: ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSLLib.g:3650:3: ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) )
                    // InternalDroneDSLLib.g:3651:4: ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) )
                    {
                    // InternalDroneDSLLib.g:3651:4: ( (lv_a_105_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:3652:5: (lv_a_105_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:3652:5: (lv_a_105_0= ruleRGRD )
                    // InternalDroneDSLLib.g:3653:6: lv_a_105_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getARGRDParserRuleCall_21_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_105_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_105_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_106=(Token)match(input,33,FOLLOW_19); 

                    				newLeafNode(otherlv_106, grammarAccess.getParallele3Access().getAmpersandKeyword_21_1());
                    			
                    // InternalDroneDSLLib.g:3674:4: ( (lv_b_107_0= ruleMD ) )
                    // InternalDroneDSLLib.g:3675:5: (lv_b_107_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:3675:5: (lv_b_107_0= ruleMD )
                    // InternalDroneDSLLib.g:3676:6: lv_b_107_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBMDParserRuleCall_21_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_107_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_107_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_108=(Token)match(input,33,FOLLOW_16); 

                    				newLeafNode(otherlv_108, grammarAccess.getParallele3Access().getAmpersandKeyword_21_3());
                    			
                    // InternalDroneDSLLib.g:3697:4: ( (lv_c_109_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:3698:5: (lv_c_109_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:3698:5: (lv_c_109_0= ruleGDr )
                    // InternalDroneDSLLib.g:3699:6: lv_c_109_0= ruleGDr
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 23 :
                    // InternalDroneDSLLib.g:3718:3: ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) )
                    {
                    // InternalDroneDSLLib.g:3718:3: ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) )
                    // InternalDroneDSLLib.g:3719:4: ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) )
                    {
                    // InternalDroneDSLLib.g:3719:4: ( (lv_a_110_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:3720:5: (lv_a_110_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:3720:5: (lv_a_110_0= ruleRGRD )
                    // InternalDroneDSLLib.g:3721:6: lv_a_110_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getARGRDParserRuleCall_22_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_110_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_110_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_111=(Token)match(input,33,FOLLOW_16); 

                    				newLeafNode(otherlv_111, grammarAccess.getParallele3Access().getAmpersandKeyword_22_1());
                    			
                    // InternalDroneDSLLib.g:3742:4: ( (lv_b_112_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:3743:5: (lv_b_112_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:3743:5: (lv_b_112_0= ruleGDr )
                    // InternalDroneDSLLib.g:3744:6: lv_b_112_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBGDrParserRuleCall_22_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_112_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_112_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_113=(Token)match(input,33,FOLLOW_19); 

                    				newLeafNode(otherlv_113, grammarAccess.getParallele3Access().getAmpersandKeyword_22_3());
                    			
                    // InternalDroneDSLLib.g:3765:4: ( (lv_c_114_0= ruleMD ) )
                    // InternalDroneDSLLib.g:3766:5: (lv_c_114_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:3766:5: (lv_c_114_0= ruleMD )
                    // InternalDroneDSLLib.g:3767:6: lv_c_114_0= ruleMD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 24 :
                    // InternalDroneDSLLib.g:3786:3: ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) )
                    {
                    // InternalDroneDSLLib.g:3786:3: ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) )
                    // InternalDroneDSLLib.g:3787:4: ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) )
                    {
                    // InternalDroneDSLLib.g:3787:4: ( (lv_a_115_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:3788:5: (lv_a_115_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:3788:5: (lv_a_115_0= ruleRGRD )
                    // InternalDroneDSLLib.g:3789:6: lv_a_115_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getARGRDParserRuleCall_23_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_115_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_115_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_116=(Token)match(input,33,FOLLOW_16); 

                    				newLeafNode(otherlv_116, grammarAccess.getParallele3Access().getAmpersandKeyword_23_1());
                    			
                    // InternalDroneDSLLib.g:3810:4: ( (lv_b_117_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:3811:5: (lv_b_117_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:3811:5: (lv_b_117_0= ruleGDr )
                    // InternalDroneDSLLib.g:3812:6: lv_b_117_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBGDrParserRuleCall_23_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_117_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele3Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_117_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_118=(Token)match(input,33,FOLLOW_17); 

                    				newLeafNode(otherlv_118, grammarAccess.getParallele3Access().getAmpersandKeyword_23_3());
                    			
                    // InternalDroneDSLLib.g:3833:4: ( (lv_c_119_0= ruleAR ) )
                    // InternalDroneDSLLib.g:3834:5: (lv_c_119_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:3834:5: (lv_c_119_0= ruleAR )
                    // InternalDroneDSLLib.g:3835:6: lv_c_119_0= ruleAR
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
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
    // InternalDroneDSLLib.g:3857:1: entryRuleParallele4 returns [EObject current=null] : iv_ruleParallele4= ruleParallele4 EOF ;
    public final EObject entryRuleParallele4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallele4 = null;


        try {
            // InternalDroneDSLLib.g:3857:51: (iv_ruleParallele4= ruleParallele4 EOF )
            // InternalDroneDSLLib.g:3858:2: iv_ruleParallele4= ruleParallele4 EOF
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
    // InternalDroneDSLLib.g:3864:1: ruleParallele4 returns [EObject current=null] : ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) ) | ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) ) | ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) ) | ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) ) | ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) ) | ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) ) | ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) ) | ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) ) | ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) ) | ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) ) | ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) ) | ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) ) | ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) ) | ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) ) | ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) ) | ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) ) | ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) ) | ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) ) | ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) ) | ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) ) | ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) ) | ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) ) | ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) ) | ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) ) ) ;
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
            // InternalDroneDSLLib.g:3870:2: ( ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) ) | ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) ) | ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) ) | ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) ) | ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) ) | ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) ) | ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) ) | ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) ) | ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) ) | ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) ) | ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) ) | ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) ) | ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) ) | ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) ) | ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) ) | ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) ) | ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) ) | ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) ) | ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) ) | ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) ) | ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) ) | ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) ) | ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) ) | ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) ) ) )
            // InternalDroneDSLLib.g:3871:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) ) | ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) ) | ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) ) | ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) ) | ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) ) | ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) ) | ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) ) | ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) ) | ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) ) | ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) ) | ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) ) | ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) ) | ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) ) | ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) ) | ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) ) | ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) ) | ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) ) | ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) ) | ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) ) | ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) ) | ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) ) | ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) ) | ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) ) | ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) ) )
            {
            // InternalDroneDSLLib.g:3871:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) ) | ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) ) | ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) ) | ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) ) | ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) ) | ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) ) | ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) ) | ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) ) | ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) ) | ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) ) | ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) ) | ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) ) | ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) ) | ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) ) | ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) ) | ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) ) | ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) ) | ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) ) | ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) ) | ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) ) | ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) ) | ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) ) | ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) ) | ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) ) )
            int alt16=24;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalDroneDSLLib.g:3872:3: ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSLLib.g:3872:3: ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) )
                    // InternalDroneDSLLib.g:3873:4: ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) )
                    {
                    // InternalDroneDSLLib.g:3873:4: ( (lv_a_0_0= ruleAR ) )
                    // InternalDroneDSLLib.g:3874:5: (lv_a_0_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:3874:5: (lv_a_0_0= ruleAR )
                    // InternalDroneDSLLib.g:3875:6: lv_a_0_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAARParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_0_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_0_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,33,FOLLOW_16); 

                    				newLeafNode(otherlv_1, grammarAccess.getParallele4Access().getAmpersandKeyword_0_1());
                    			
                    // InternalDroneDSLLib.g:3896:4: ( (lv_b_2_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:3897:5: (lv_b_2_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:3897:5: (lv_b_2_0= ruleGDr )
                    // InternalDroneDSLLib.g:3898:6: lv_b_2_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBGDrParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_2_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_2_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,33,FOLLOW_19); 

                    				newLeafNode(otherlv_3, grammarAccess.getParallele4Access().getAmpersandKeyword_0_3());
                    			
                    // InternalDroneDSLLib.g:3919:4: ( (lv_c_4_0= ruleMD ) )
                    // InternalDroneDSLLib.g:3920:5: (lv_c_4_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:3920:5: (lv_c_4_0= ruleMD )
                    // InternalDroneDSLLib.g:3921:6: lv_c_4_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCMDParserRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_c_4_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_4_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_5, grammarAccess.getParallele4Access().getAmpersandKeyword_0_5());
                    			
                    // InternalDroneDSLLib.g:3942:4: ( (lv_d_6_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:3943:5: (lv_d_6_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:3943:5: (lv_d_6_0= ruleRGRD )
                    // InternalDroneDSLLib.g:3944:6: lv_d_6_0= ruleRGRD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDroneDSLLib.g:3963:3: ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) )
                    {
                    // InternalDroneDSLLib.g:3963:3: ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) )
                    // InternalDroneDSLLib.g:3964:4: ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) )
                    {
                    // InternalDroneDSLLib.g:3964:4: ( (lv_a_7_0= ruleAR ) )
                    // InternalDroneDSLLib.g:3965:5: (lv_a_7_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:3965:5: (lv_a_7_0= ruleAR )
                    // InternalDroneDSLLib.g:3966:6: lv_a_7_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAARParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_7_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_7_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,33,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getParallele4Access().getAmpersandKeyword_1_1());
                    			
                    // InternalDroneDSLLib.g:3987:4: ( (lv_b_9_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:3988:5: (lv_b_9_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:3988:5: (lv_b_9_0= ruleGDr )
                    // InternalDroneDSLLib.g:3989:6: lv_b_9_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBGDrParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_9_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_9_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_10, grammarAccess.getParallele4Access().getAmpersandKeyword_1_3());
                    			
                    // InternalDroneDSLLib.g:4010:4: ( (lv_c_11_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:4011:5: (lv_c_11_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:4011:5: (lv_c_11_0= ruleRGRD )
                    // InternalDroneDSLLib.g:4012:6: lv_c_11_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCRGRDParserRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_c_11_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_11_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,33,FOLLOW_19); 

                    				newLeafNode(otherlv_12, grammarAccess.getParallele4Access().getAmpersandKeyword_1_5());
                    			
                    // InternalDroneDSLLib.g:4033:4: ( (lv_d_13_0= ruleMD ) )
                    // InternalDroneDSLLib.g:4034:5: (lv_d_13_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:4034:5: (lv_d_13_0= ruleMD )
                    // InternalDroneDSLLib.g:4035:6: lv_d_13_0= ruleMD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDroneDSLLib.g:4054:3: ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSLLib.g:4054:3: ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) )
                    // InternalDroneDSLLib.g:4055:4: ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) )
                    {
                    // InternalDroneDSLLib.g:4055:4: ( (lv_a_14_0= ruleAR ) )
                    // InternalDroneDSLLib.g:4056:5: (lv_a_14_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:4056:5: (lv_a_14_0= ruleAR )
                    // InternalDroneDSLLib.g:4057:6: lv_a_14_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAARParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_14_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_14_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,33,FOLLOW_19); 

                    				newLeafNode(otherlv_15, grammarAccess.getParallele4Access().getAmpersandKeyword_2_1());
                    			
                    // InternalDroneDSLLib.g:4078:4: ( (lv_b_16_0= ruleMD ) )
                    // InternalDroneDSLLib.g:4079:5: (lv_b_16_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:4079:5: (lv_b_16_0= ruleMD )
                    // InternalDroneDSLLib.g:4080:6: lv_b_16_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBMDParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_16_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_16_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,33,FOLLOW_16); 

                    				newLeafNode(otherlv_17, grammarAccess.getParallele4Access().getAmpersandKeyword_2_3());
                    			
                    // InternalDroneDSLLib.g:4101:4: ( (lv_c_18_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:4102:5: (lv_c_18_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:4102:5: (lv_c_18_0= ruleGDr )
                    // InternalDroneDSLLib.g:4103:6: lv_c_18_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCGDrParserRuleCall_2_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_c_18_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_18_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_19=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_19, grammarAccess.getParallele4Access().getAmpersandKeyword_2_5());
                    			
                    // InternalDroneDSLLib.g:4124:4: ( (lv_d_20_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:4125:5: (lv_d_20_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:4125:5: (lv_d_20_0= ruleRGRD )
                    // InternalDroneDSLLib.g:4126:6: lv_d_20_0= ruleRGRD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDroneDSLLib.g:4145:3: ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSLLib.g:4145:3: ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) )
                    // InternalDroneDSLLib.g:4146:4: ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) )
                    {
                    // InternalDroneDSLLib.g:4146:4: ( (lv_a_21_0= ruleAR ) )
                    // InternalDroneDSLLib.g:4147:5: (lv_a_21_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:4147:5: (lv_a_21_0= ruleAR )
                    // InternalDroneDSLLib.g:4148:6: lv_a_21_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAARParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_21_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_21_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_22=(Token)match(input,33,FOLLOW_19); 

                    				newLeafNode(otherlv_22, grammarAccess.getParallele4Access().getAmpersandKeyword_3_1());
                    			
                    // InternalDroneDSLLib.g:4169:4: ( (lv_b_23_0= ruleMD ) )
                    // InternalDroneDSLLib.g:4170:5: (lv_b_23_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:4170:5: (lv_b_23_0= ruleMD )
                    // InternalDroneDSLLib.g:4171:6: lv_b_23_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBMDParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_23_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_23_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_24=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_24, grammarAccess.getParallele4Access().getAmpersandKeyword_3_3());
                    			
                    // InternalDroneDSLLib.g:4192:4: ( (lv_c_25_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:4193:5: (lv_c_25_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:4193:5: (lv_c_25_0= ruleRGRD )
                    // InternalDroneDSLLib.g:4194:6: lv_c_25_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCRGRDParserRuleCall_3_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_c_25_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_25_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_26=(Token)match(input,33,FOLLOW_16); 

                    				newLeafNode(otherlv_26, grammarAccess.getParallele4Access().getAmpersandKeyword_3_5());
                    			
                    // InternalDroneDSLLib.g:4215:4: ( (lv_d_27_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:4216:5: (lv_d_27_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:4216:5: (lv_d_27_0= ruleGDr )
                    // InternalDroneDSLLib.g:4217:6: lv_d_27_0= ruleGDr
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalDroneDSLLib.g:4236:3: ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSLLib.g:4236:3: ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) )
                    // InternalDroneDSLLib.g:4237:4: ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) )
                    {
                    // InternalDroneDSLLib.g:4237:4: ( (lv_a_28_0= ruleAR ) )
                    // InternalDroneDSLLib.g:4238:5: (lv_a_28_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:4238:5: (lv_a_28_0= ruleAR )
                    // InternalDroneDSLLib.g:4239:6: lv_a_28_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAARParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_28_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_28_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_29=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_29, grammarAccess.getParallele4Access().getAmpersandKeyword_4_1());
                    			
                    // InternalDroneDSLLib.g:4260:4: ( (lv_b_30_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:4261:5: (lv_b_30_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:4261:5: (lv_b_30_0= ruleRGRD )
                    // InternalDroneDSLLib.g:4262:6: lv_b_30_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBRGRDParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_30_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_30_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_31=(Token)match(input,33,FOLLOW_19); 

                    				newLeafNode(otherlv_31, grammarAccess.getParallele4Access().getAmpersandKeyword_4_3());
                    			
                    // InternalDroneDSLLib.g:4283:4: ( (lv_c_32_0= ruleMD ) )
                    // InternalDroneDSLLib.g:4284:5: (lv_c_32_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:4284:5: (lv_c_32_0= ruleMD )
                    // InternalDroneDSLLib.g:4285:6: lv_c_32_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCMDParserRuleCall_4_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_c_32_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_32_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_33=(Token)match(input,33,FOLLOW_16); 

                    				newLeafNode(otherlv_33, grammarAccess.getParallele4Access().getAmpersandKeyword_4_5());
                    			
                    // InternalDroneDSLLib.g:4306:4: ( (lv_d_34_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:4307:5: (lv_d_34_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:4307:5: (lv_d_34_0= ruleGDr )
                    // InternalDroneDSLLib.g:4308:6: lv_d_34_0= ruleGDr
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalDroneDSLLib.g:4327:3: ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) )
                    {
                    // InternalDroneDSLLib.g:4327:3: ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) )
                    // InternalDroneDSLLib.g:4328:4: ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) )
                    {
                    // InternalDroneDSLLib.g:4328:4: ( (lv_a_35_0= ruleAR ) )
                    // InternalDroneDSLLib.g:4329:5: (lv_a_35_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:4329:5: (lv_a_35_0= ruleAR )
                    // InternalDroneDSLLib.g:4330:6: lv_a_35_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAARParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_35_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_35_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_36=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_36, grammarAccess.getParallele4Access().getAmpersandKeyword_5_1());
                    			
                    // InternalDroneDSLLib.g:4351:4: ( (lv_b_37_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:4352:5: (lv_b_37_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:4352:5: (lv_b_37_0= ruleRGRD )
                    // InternalDroneDSLLib.g:4353:6: lv_b_37_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBRGRDParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_37_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_37_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_38=(Token)match(input,33,FOLLOW_16); 

                    				newLeafNode(otherlv_38, grammarAccess.getParallele4Access().getAmpersandKeyword_5_3());
                    			
                    // InternalDroneDSLLib.g:4374:4: ( (lv_c_39_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:4375:5: (lv_c_39_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:4375:5: (lv_c_39_0= ruleGDr )
                    // InternalDroneDSLLib.g:4376:6: lv_c_39_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCGDrParserRuleCall_5_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_c_39_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_39_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_40=(Token)match(input,33,FOLLOW_19); 

                    				newLeafNode(otherlv_40, grammarAccess.getParallele4Access().getAmpersandKeyword_5_5());
                    			
                    // InternalDroneDSLLib.g:4397:4: ( (lv_d_41_0= ruleMD ) )
                    // InternalDroneDSLLib.g:4398:5: (lv_d_41_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:4398:5: (lv_d_41_0= ruleMD )
                    // InternalDroneDSLLib.g:4399:6: lv_d_41_0= ruleMD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalDroneDSLLib.g:4418:3: ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSLLib.g:4418:3: ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) )
                    // InternalDroneDSLLib.g:4419:4: ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) )
                    {
                    // InternalDroneDSLLib.g:4419:4: ( (lv_a_42_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:4420:5: (lv_a_42_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:4420:5: (lv_a_42_0= ruleGDr )
                    // InternalDroneDSLLib.g:4421:6: lv_a_42_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAGDrParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_42_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_42_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_43=(Token)match(input,33,FOLLOW_17); 

                    				newLeafNode(otherlv_43, grammarAccess.getParallele4Access().getAmpersandKeyword_6_1());
                    			
                    // InternalDroneDSLLib.g:4442:4: ( (lv_b_44_0= ruleAR ) )
                    // InternalDroneDSLLib.g:4443:5: (lv_b_44_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:4443:5: (lv_b_44_0= ruleAR )
                    // InternalDroneDSLLib.g:4444:6: lv_b_44_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBARParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_44_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_44_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_45=(Token)match(input,33,FOLLOW_19); 

                    				newLeafNode(otherlv_45, grammarAccess.getParallele4Access().getAmpersandKeyword_6_3());
                    			
                    // InternalDroneDSLLib.g:4465:4: ( (lv_c_46_0= ruleMD ) )
                    // InternalDroneDSLLib.g:4466:5: (lv_c_46_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:4466:5: (lv_c_46_0= ruleMD )
                    // InternalDroneDSLLib.g:4467:6: lv_c_46_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCMDParserRuleCall_6_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_c_46_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_46_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_47=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_47, grammarAccess.getParallele4Access().getAmpersandKeyword_6_5());
                    			
                    // InternalDroneDSLLib.g:4488:4: ( (lv_d_48_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:4489:5: (lv_d_48_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:4489:5: (lv_d_48_0= ruleRGRD )
                    // InternalDroneDSLLib.g:4490:6: lv_d_48_0= ruleRGRD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalDroneDSLLib.g:4509:3: ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) )
                    {
                    // InternalDroneDSLLib.g:4509:3: ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) )
                    // InternalDroneDSLLib.g:4510:4: ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) )
                    {
                    // InternalDroneDSLLib.g:4510:4: ( (lv_a_49_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:4511:5: (lv_a_49_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:4511:5: (lv_a_49_0= ruleGDr )
                    // InternalDroneDSLLib.g:4512:6: lv_a_49_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAGDrParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_49_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_49_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_50=(Token)match(input,33,FOLLOW_17); 

                    				newLeafNode(otherlv_50, grammarAccess.getParallele4Access().getAmpersandKeyword_7_1());
                    			
                    // InternalDroneDSLLib.g:4533:4: ( (lv_b_51_0= ruleAR ) )
                    // InternalDroneDSLLib.g:4534:5: (lv_b_51_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:4534:5: (lv_b_51_0= ruleAR )
                    // InternalDroneDSLLib.g:4535:6: lv_b_51_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBARParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_51_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_51_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_52=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_52, grammarAccess.getParallele4Access().getAmpersandKeyword_7_3());
                    			
                    // InternalDroneDSLLib.g:4556:4: ( (lv_c_53_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:4557:5: (lv_c_53_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:4557:5: (lv_c_53_0= ruleRGRD )
                    // InternalDroneDSLLib.g:4558:6: lv_c_53_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCRGRDParserRuleCall_7_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_c_53_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_53_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_54=(Token)match(input,33,FOLLOW_19); 

                    				newLeafNode(otherlv_54, grammarAccess.getParallele4Access().getAmpersandKeyword_7_5());
                    			
                    // InternalDroneDSLLib.g:4579:4: ( (lv_d_55_0= ruleMD ) )
                    // InternalDroneDSLLib.g:4580:5: (lv_d_55_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:4580:5: (lv_d_55_0= ruleMD )
                    // InternalDroneDSLLib.g:4581:6: lv_d_55_0= ruleMD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalDroneDSLLib.g:4600:3: ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSLLib.g:4600:3: ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) )
                    // InternalDroneDSLLib.g:4601:4: ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) )
                    {
                    // InternalDroneDSLLib.g:4601:4: ( (lv_a_56_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:4602:5: (lv_a_56_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:4602:5: (lv_a_56_0= ruleGDr )
                    // InternalDroneDSLLib.g:4603:6: lv_a_56_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAGDrParserRuleCall_8_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_56_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_56_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_57=(Token)match(input,33,FOLLOW_19); 

                    				newLeafNode(otherlv_57, grammarAccess.getParallele4Access().getAmpersandKeyword_8_1());
                    			
                    // InternalDroneDSLLib.g:4624:4: ( (lv_b_58_0= ruleMD ) )
                    // InternalDroneDSLLib.g:4625:5: (lv_b_58_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:4625:5: (lv_b_58_0= ruleMD )
                    // InternalDroneDSLLib.g:4626:6: lv_b_58_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBMDParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_58_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_58_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_59=(Token)match(input,33,FOLLOW_17); 

                    				newLeafNode(otherlv_59, grammarAccess.getParallele4Access().getAmpersandKeyword_8_3());
                    			
                    // InternalDroneDSLLib.g:4647:4: ( (lv_c_60_0= ruleAR ) )
                    // InternalDroneDSLLib.g:4648:5: (lv_c_60_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:4648:5: (lv_c_60_0= ruleAR )
                    // InternalDroneDSLLib.g:4649:6: lv_c_60_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCARParserRuleCall_8_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_c_60_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_60_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_61=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_61, grammarAccess.getParallele4Access().getAmpersandKeyword_8_5());
                    			
                    // InternalDroneDSLLib.g:4670:4: ( (lv_d_62_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:4671:5: (lv_d_62_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:4671:5: (lv_d_62_0= ruleRGRD )
                    // InternalDroneDSLLib.g:4672:6: lv_d_62_0= ruleRGRD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalDroneDSLLib.g:4691:3: ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) )
                    {
                    // InternalDroneDSLLib.g:4691:3: ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) )
                    // InternalDroneDSLLib.g:4692:4: ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) )
                    {
                    // InternalDroneDSLLib.g:4692:4: ( (lv_a_63_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:4693:5: (lv_a_63_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:4693:5: (lv_a_63_0= ruleGDr )
                    // InternalDroneDSLLib.g:4694:6: lv_a_63_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAGDrParserRuleCall_9_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_63_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_63_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_64=(Token)match(input,33,FOLLOW_19); 

                    				newLeafNode(otherlv_64, grammarAccess.getParallele4Access().getAmpersandKeyword_9_1());
                    			
                    // InternalDroneDSLLib.g:4715:4: ( (lv_b_65_0= ruleMD ) )
                    // InternalDroneDSLLib.g:4716:5: (lv_b_65_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:4716:5: (lv_b_65_0= ruleMD )
                    // InternalDroneDSLLib.g:4717:6: lv_b_65_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBMDParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_65_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_65_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_66=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_66, grammarAccess.getParallele4Access().getAmpersandKeyword_9_3());
                    			
                    // InternalDroneDSLLib.g:4738:4: ( (lv_c_67_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:4739:5: (lv_c_67_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:4739:5: (lv_c_67_0= ruleRGRD )
                    // InternalDroneDSLLib.g:4740:6: lv_c_67_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCRGRDParserRuleCall_9_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_c_67_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_67_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_68=(Token)match(input,33,FOLLOW_17); 

                    				newLeafNode(otherlv_68, grammarAccess.getParallele4Access().getAmpersandKeyword_9_5());
                    			
                    // InternalDroneDSLLib.g:4761:4: ( (lv_d_69_0= ruleAR ) )
                    // InternalDroneDSLLib.g:4762:5: (lv_d_69_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:4762:5: (lv_d_69_0= ruleAR )
                    // InternalDroneDSLLib.g:4763:6: lv_d_69_0= ruleAR
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalDroneDSLLib.g:4782:3: ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) )
                    {
                    // InternalDroneDSLLib.g:4782:3: ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) )
                    // InternalDroneDSLLib.g:4783:4: ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) )
                    {
                    // InternalDroneDSLLib.g:4783:4: ( (lv_a_70_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:4784:5: (lv_a_70_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:4784:5: (lv_a_70_0= ruleGDr )
                    // InternalDroneDSLLib.g:4785:6: lv_a_70_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAGDrParserRuleCall_10_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_70_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_70_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_71=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_71, grammarAccess.getParallele4Access().getAmpersandKeyword_10_1());
                    			
                    // InternalDroneDSLLib.g:4806:4: ( (lv_b_72_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:4807:5: (lv_b_72_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:4807:5: (lv_b_72_0= ruleRGRD )
                    // InternalDroneDSLLib.g:4808:6: lv_b_72_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBRGRDParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_72_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_72_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_73=(Token)match(input,33,FOLLOW_17); 

                    				newLeafNode(otherlv_73, grammarAccess.getParallele4Access().getAmpersandKeyword_10_3());
                    			
                    // InternalDroneDSLLib.g:4829:4: ( (lv_c_74_0= ruleAR ) )
                    // InternalDroneDSLLib.g:4830:5: (lv_c_74_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:4830:5: (lv_c_74_0= ruleAR )
                    // InternalDroneDSLLib.g:4831:6: lv_c_74_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCARParserRuleCall_10_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_c_74_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_74_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_75=(Token)match(input,33,FOLLOW_19); 

                    				newLeafNode(otherlv_75, grammarAccess.getParallele4Access().getAmpersandKeyword_10_5());
                    			
                    // InternalDroneDSLLib.g:4852:4: ( (lv_d_76_0= ruleMD ) )
                    // InternalDroneDSLLib.g:4853:5: (lv_d_76_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:4853:5: (lv_d_76_0= ruleMD )
                    // InternalDroneDSLLib.g:4854:6: lv_d_76_0= ruleMD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 12 :
                    // InternalDroneDSLLib.g:4873:3: ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) )
                    {
                    // InternalDroneDSLLib.g:4873:3: ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) )
                    // InternalDroneDSLLib.g:4874:4: ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) )
                    {
                    // InternalDroneDSLLib.g:4874:4: ( (lv_a_77_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:4875:5: (lv_a_77_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:4875:5: (lv_a_77_0= ruleGDr )
                    // InternalDroneDSLLib.g:4876:6: lv_a_77_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAGDrParserRuleCall_11_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_77_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_77_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_78=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_78, grammarAccess.getParallele4Access().getAmpersandKeyword_11_1());
                    			
                    // InternalDroneDSLLib.g:4897:4: ( (lv_b_79_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:4898:5: (lv_b_79_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:4898:5: (lv_b_79_0= ruleRGRD )
                    // InternalDroneDSLLib.g:4899:6: lv_b_79_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBRGRDParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_79_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_79_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_80=(Token)match(input,33,FOLLOW_19); 

                    				newLeafNode(otherlv_80, grammarAccess.getParallele4Access().getAmpersandKeyword_11_3());
                    			
                    // InternalDroneDSLLib.g:4920:4: ( (lv_c_81_0= ruleMD ) )
                    // InternalDroneDSLLib.g:4921:5: (lv_c_81_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:4921:5: (lv_c_81_0= ruleMD )
                    // InternalDroneDSLLib.g:4922:6: lv_c_81_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCMDParserRuleCall_11_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_c_81_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_81_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_82=(Token)match(input,33,FOLLOW_17); 

                    				newLeafNode(otherlv_82, grammarAccess.getParallele4Access().getAmpersandKeyword_11_5());
                    			
                    // InternalDroneDSLLib.g:4943:4: ( (lv_d_83_0= ruleAR ) )
                    // InternalDroneDSLLib.g:4944:5: (lv_d_83_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:4944:5: (lv_d_83_0= ruleAR )
                    // InternalDroneDSLLib.g:4945:6: lv_d_83_0= ruleAR
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 13 :
                    // InternalDroneDSLLib.g:4964:3: ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSLLib.g:4964:3: ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) )
                    // InternalDroneDSLLib.g:4965:4: ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) )
                    {
                    // InternalDroneDSLLib.g:4965:4: ( (lv_a_84_0= ruleMD ) )
                    // InternalDroneDSLLib.g:4966:5: (lv_a_84_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:4966:5: (lv_a_84_0= ruleMD )
                    // InternalDroneDSLLib.g:4967:6: lv_a_84_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAMDParserRuleCall_12_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_84_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_84_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_85=(Token)match(input,33,FOLLOW_17); 

                    				newLeafNode(otherlv_85, grammarAccess.getParallele4Access().getAmpersandKeyword_12_1());
                    			
                    // InternalDroneDSLLib.g:4988:4: ( (lv_b_86_0= ruleAR ) )
                    // InternalDroneDSLLib.g:4989:5: (lv_b_86_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:4989:5: (lv_b_86_0= ruleAR )
                    // InternalDroneDSLLib.g:4990:6: lv_b_86_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBARParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_86_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_86_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_87=(Token)match(input,33,FOLLOW_16); 

                    				newLeafNode(otherlv_87, grammarAccess.getParallele4Access().getAmpersandKeyword_12_3());
                    			
                    // InternalDroneDSLLib.g:5011:4: ( (lv_c_88_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:5012:5: (lv_c_88_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:5012:5: (lv_c_88_0= ruleGDr )
                    // InternalDroneDSLLib.g:5013:6: lv_c_88_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCGDrParserRuleCall_12_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_c_88_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_88_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_89=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_89, grammarAccess.getParallele4Access().getAmpersandKeyword_12_5());
                    			
                    // InternalDroneDSLLib.g:5034:4: ( (lv_d_90_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:5035:5: (lv_d_90_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:5035:5: (lv_d_90_0= ruleRGRD )
                    // InternalDroneDSLLib.g:5036:6: lv_d_90_0= ruleRGRD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 14 :
                    // InternalDroneDSLLib.g:5055:3: ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSLLib.g:5055:3: ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) )
                    // InternalDroneDSLLib.g:5056:4: ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) )
                    {
                    // InternalDroneDSLLib.g:5056:4: ( (lv_a_91_0= ruleMD ) )
                    // InternalDroneDSLLib.g:5057:5: (lv_a_91_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:5057:5: (lv_a_91_0= ruleMD )
                    // InternalDroneDSLLib.g:5058:6: lv_a_91_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAMDParserRuleCall_13_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_91_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_91_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_92=(Token)match(input,33,FOLLOW_17); 

                    				newLeafNode(otherlv_92, grammarAccess.getParallele4Access().getAmpersandKeyword_13_1());
                    			
                    // InternalDroneDSLLib.g:5079:4: ( (lv_b_93_0= ruleAR ) )
                    // InternalDroneDSLLib.g:5080:5: (lv_b_93_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:5080:5: (lv_b_93_0= ruleAR )
                    // InternalDroneDSLLib.g:5081:6: lv_b_93_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBARParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_93_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_93_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_94=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_94, grammarAccess.getParallele4Access().getAmpersandKeyword_13_3());
                    			
                    // InternalDroneDSLLib.g:5102:4: ( (lv_c_95_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:5103:5: (lv_c_95_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:5103:5: (lv_c_95_0= ruleRGRD )
                    // InternalDroneDSLLib.g:5104:6: lv_c_95_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCRGRDParserRuleCall_13_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_c_95_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_95_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_96=(Token)match(input,33,FOLLOW_16); 

                    				newLeafNode(otherlv_96, grammarAccess.getParallele4Access().getAmpersandKeyword_13_5());
                    			
                    // InternalDroneDSLLib.g:5125:4: ( (lv_d_97_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:5126:5: (lv_d_97_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:5126:5: (lv_d_97_0= ruleGDr )
                    // InternalDroneDSLLib.g:5127:6: lv_d_97_0= ruleGDr
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 15 :
                    // InternalDroneDSLLib.g:5146:3: ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSLLib.g:5146:3: ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) )
                    // InternalDroneDSLLib.g:5147:4: ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) )
                    {
                    // InternalDroneDSLLib.g:5147:4: ( (lv_a_98_0= ruleMD ) )
                    // InternalDroneDSLLib.g:5148:5: (lv_a_98_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:5148:5: (lv_a_98_0= ruleMD )
                    // InternalDroneDSLLib.g:5149:6: lv_a_98_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAMDParserRuleCall_14_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_98_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_98_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_99=(Token)match(input,33,FOLLOW_16); 

                    				newLeafNode(otherlv_99, grammarAccess.getParallele4Access().getAmpersandKeyword_14_1());
                    			
                    // InternalDroneDSLLib.g:5170:4: ( (lv_b_100_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:5171:5: (lv_b_100_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:5171:5: (lv_b_100_0= ruleGDr )
                    // InternalDroneDSLLib.g:5172:6: lv_b_100_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBGDrParserRuleCall_14_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_100_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_100_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_101=(Token)match(input,33,FOLLOW_17); 

                    				newLeafNode(otherlv_101, grammarAccess.getParallele4Access().getAmpersandKeyword_14_3());
                    			
                    // InternalDroneDSLLib.g:5193:4: ( (lv_c_102_0= ruleAR ) )
                    // InternalDroneDSLLib.g:5194:5: (lv_c_102_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:5194:5: (lv_c_102_0= ruleAR )
                    // InternalDroneDSLLib.g:5195:6: lv_c_102_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCARParserRuleCall_14_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_c_102_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_102_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_103=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_103, grammarAccess.getParallele4Access().getAmpersandKeyword_14_5());
                    			
                    // InternalDroneDSLLib.g:5216:4: ( (lv_d_104_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:5217:5: (lv_d_104_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:5217:5: (lv_d_104_0= ruleRGRD )
                    // InternalDroneDSLLib.g:5218:6: lv_d_104_0= ruleRGRD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 16 :
                    // InternalDroneDSLLib.g:5237:3: ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) )
                    {
                    // InternalDroneDSLLib.g:5237:3: ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) )
                    // InternalDroneDSLLib.g:5238:4: ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) )
                    {
                    // InternalDroneDSLLib.g:5238:4: ( (lv_a_105_0= ruleMD ) )
                    // InternalDroneDSLLib.g:5239:5: (lv_a_105_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:5239:5: (lv_a_105_0= ruleMD )
                    // InternalDroneDSLLib.g:5240:6: lv_a_105_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAMDParserRuleCall_15_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_105_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_105_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_106=(Token)match(input,33,FOLLOW_16); 

                    				newLeafNode(otherlv_106, grammarAccess.getParallele4Access().getAmpersandKeyword_15_1());
                    			
                    // InternalDroneDSLLib.g:5261:4: ( (lv_b_107_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:5262:5: (lv_b_107_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:5262:5: (lv_b_107_0= ruleGDr )
                    // InternalDroneDSLLib.g:5263:6: lv_b_107_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBGDrParserRuleCall_15_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_107_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_107_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_108=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_108, grammarAccess.getParallele4Access().getAmpersandKeyword_15_3());
                    			
                    // InternalDroneDSLLib.g:5284:4: ( (lv_c_109_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:5285:5: (lv_c_109_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:5285:5: (lv_c_109_0= ruleRGRD )
                    // InternalDroneDSLLib.g:5286:6: lv_c_109_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCRGRDParserRuleCall_15_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_c_109_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_109_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_110=(Token)match(input,33,FOLLOW_17); 

                    				newLeafNode(otherlv_110, grammarAccess.getParallele4Access().getAmpersandKeyword_15_5());
                    			
                    // InternalDroneDSLLib.g:5307:4: ( (lv_d_111_0= ruleAR ) )
                    // InternalDroneDSLLib.g:5308:5: (lv_d_111_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:5308:5: (lv_d_111_0= ruleAR )
                    // InternalDroneDSLLib.g:5309:6: lv_d_111_0= ruleAR
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 17 :
                    // InternalDroneDSLLib.g:5328:3: ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) )
                    {
                    // InternalDroneDSLLib.g:5328:3: ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) )
                    // InternalDroneDSLLib.g:5329:4: ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) )
                    {
                    // InternalDroneDSLLib.g:5329:4: ( (lv_a_112_0= ruleMD ) )
                    // InternalDroneDSLLib.g:5330:5: (lv_a_112_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:5330:5: (lv_a_112_0= ruleMD )
                    // InternalDroneDSLLib.g:5331:6: lv_a_112_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAMDParserRuleCall_16_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_112_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_112_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_113=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_113, grammarAccess.getParallele4Access().getAmpersandKeyword_16_1());
                    			
                    // InternalDroneDSLLib.g:5352:4: ( (lv_b_114_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:5353:5: (lv_b_114_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:5353:5: (lv_b_114_0= ruleRGRD )
                    // InternalDroneDSLLib.g:5354:6: lv_b_114_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBRGRDParserRuleCall_16_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_114_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_114_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_115=(Token)match(input,33,FOLLOW_16); 

                    				newLeafNode(otherlv_115, grammarAccess.getParallele4Access().getAmpersandKeyword_16_3());
                    			
                    // InternalDroneDSLLib.g:5375:4: ( (lv_c_116_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:5376:5: (lv_c_116_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:5376:5: (lv_c_116_0= ruleGDr )
                    // InternalDroneDSLLib.g:5377:6: lv_c_116_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCGDrParserRuleCall_16_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_c_116_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_116_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_117=(Token)match(input,33,FOLLOW_17); 

                    				newLeafNode(otherlv_117, grammarAccess.getParallele4Access().getAmpersandKeyword_16_5());
                    			
                    // InternalDroneDSLLib.g:5398:4: ( (lv_d_118_0= ruleAR ) )
                    // InternalDroneDSLLib.g:5399:5: (lv_d_118_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:5399:5: (lv_d_118_0= ruleAR )
                    // InternalDroneDSLLib.g:5400:6: lv_d_118_0= ruleAR
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 18 :
                    // InternalDroneDSLLib.g:5419:3: ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSLLib.g:5419:3: ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) )
                    // InternalDroneDSLLib.g:5420:4: ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) )
                    {
                    // InternalDroneDSLLib.g:5420:4: ( (lv_a_119_0= ruleMD ) )
                    // InternalDroneDSLLib.g:5421:5: (lv_a_119_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:5421:5: (lv_a_119_0= ruleMD )
                    // InternalDroneDSLLib.g:5422:6: lv_a_119_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getAMDParserRuleCall_17_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_119_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_119_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_120=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_120, grammarAccess.getParallele4Access().getAmpersandKeyword_17_1());
                    			
                    // InternalDroneDSLLib.g:5443:4: ( (lv_b_121_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:5444:5: (lv_b_121_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:5444:5: (lv_b_121_0= ruleRGRD )
                    // InternalDroneDSLLib.g:5445:6: lv_b_121_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBRGRDParserRuleCall_17_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_121_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_121_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_122=(Token)match(input,33,FOLLOW_17); 

                    				newLeafNode(otherlv_122, grammarAccess.getParallele4Access().getAmpersandKeyword_17_3());
                    			
                    // InternalDroneDSLLib.g:5466:4: ( (lv_c_123_0= ruleAR ) )
                    // InternalDroneDSLLib.g:5467:5: (lv_c_123_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:5467:5: (lv_c_123_0= ruleAR )
                    // InternalDroneDSLLib.g:5468:6: lv_c_123_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCARParserRuleCall_17_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_c_123_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_123_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_124=(Token)match(input,33,FOLLOW_16); 

                    				newLeafNode(otherlv_124, grammarAccess.getParallele4Access().getAmpersandKeyword_17_5());
                    			
                    // InternalDroneDSLLib.g:5489:4: ( (lv_d_125_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:5490:5: (lv_d_125_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:5490:5: (lv_d_125_0= ruleGDr )
                    // InternalDroneDSLLib.g:5491:6: lv_d_125_0= ruleGDr
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 19 :
                    // InternalDroneDSLLib.g:5510:3: ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSLLib.g:5510:3: ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) )
                    // InternalDroneDSLLib.g:5511:4: ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) )
                    {
                    // InternalDroneDSLLib.g:5511:4: ( (lv_a_126_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:5512:5: (lv_a_126_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:5512:5: (lv_a_126_0= ruleRGRD )
                    // InternalDroneDSLLib.g:5513:6: lv_a_126_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getARGRDParserRuleCall_18_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_126_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_126_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_127=(Token)match(input,33,FOLLOW_17); 

                    				newLeafNode(otherlv_127, grammarAccess.getParallele4Access().getAmpersandKeyword_18_1());
                    			
                    // InternalDroneDSLLib.g:5534:4: ( (lv_b_128_0= ruleAR ) )
                    // InternalDroneDSLLib.g:5535:5: (lv_b_128_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:5535:5: (lv_b_128_0= ruleAR )
                    // InternalDroneDSLLib.g:5536:6: lv_b_128_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBARParserRuleCall_18_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_128_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_128_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_129=(Token)match(input,33,FOLLOW_19); 

                    				newLeafNode(otherlv_129, grammarAccess.getParallele4Access().getAmpersandKeyword_18_3());
                    			
                    // InternalDroneDSLLib.g:5557:4: ( (lv_c_130_0= ruleMD ) )
                    // InternalDroneDSLLib.g:5558:5: (lv_c_130_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:5558:5: (lv_c_130_0= ruleMD )
                    // InternalDroneDSLLib.g:5559:6: lv_c_130_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCMDParserRuleCall_18_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_c_130_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_130_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_131=(Token)match(input,33,FOLLOW_16); 

                    				newLeafNode(otherlv_131, grammarAccess.getParallele4Access().getAmpersandKeyword_18_5());
                    			
                    // InternalDroneDSLLib.g:5580:4: ( (lv_d_132_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:5581:5: (lv_d_132_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:5581:5: (lv_d_132_0= ruleGDr )
                    // InternalDroneDSLLib.g:5582:6: lv_d_132_0= ruleGDr
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 20 :
                    // InternalDroneDSLLib.g:5601:3: ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) )
                    {
                    // InternalDroneDSLLib.g:5601:3: ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) )
                    // InternalDroneDSLLib.g:5602:4: ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) )
                    {
                    // InternalDroneDSLLib.g:5602:4: ( (lv_a_133_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:5603:5: (lv_a_133_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:5603:5: (lv_a_133_0= ruleRGRD )
                    // InternalDroneDSLLib.g:5604:6: lv_a_133_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getARGRDParserRuleCall_19_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_133_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_133_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_134=(Token)match(input,33,FOLLOW_17); 

                    				newLeafNode(otherlv_134, grammarAccess.getParallele4Access().getAmpersandKeyword_19_1());
                    			
                    // InternalDroneDSLLib.g:5625:4: ( (lv_b_135_0= ruleAR ) )
                    // InternalDroneDSLLib.g:5626:5: (lv_b_135_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:5626:5: (lv_b_135_0= ruleAR )
                    // InternalDroneDSLLib.g:5627:6: lv_b_135_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBARParserRuleCall_19_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_135_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_135_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_136=(Token)match(input,33,FOLLOW_16); 

                    				newLeafNode(otherlv_136, grammarAccess.getParallele4Access().getAmpersandKeyword_19_3());
                    			
                    // InternalDroneDSLLib.g:5648:4: ( (lv_c_137_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:5649:5: (lv_c_137_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:5649:5: (lv_c_137_0= ruleGDr )
                    // InternalDroneDSLLib.g:5650:6: lv_c_137_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCGDrParserRuleCall_19_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_c_137_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_137_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_138=(Token)match(input,33,FOLLOW_19); 

                    				newLeafNode(otherlv_138, grammarAccess.getParallele4Access().getAmpersandKeyword_19_5());
                    			
                    // InternalDroneDSLLib.g:5671:4: ( (lv_d_139_0= ruleMD ) )
                    // InternalDroneDSLLib.g:5672:5: (lv_d_139_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:5672:5: (lv_d_139_0= ruleMD )
                    // InternalDroneDSLLib.g:5673:6: lv_d_139_0= ruleMD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 21 :
                    // InternalDroneDSLLib.g:5692:3: ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSLLib.g:5692:3: ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) )
                    // InternalDroneDSLLib.g:5693:4: ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) )
                    {
                    // InternalDroneDSLLib.g:5693:4: ( (lv_a_140_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:5694:5: (lv_a_140_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:5694:5: (lv_a_140_0= ruleRGRD )
                    // InternalDroneDSLLib.g:5695:6: lv_a_140_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getARGRDParserRuleCall_20_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_140_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_140_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_141=(Token)match(input,33,FOLLOW_19); 

                    				newLeafNode(otherlv_141, grammarAccess.getParallele4Access().getAmpersandKeyword_20_1());
                    			
                    // InternalDroneDSLLib.g:5716:4: ( (lv_b_142_0= ruleMD ) )
                    // InternalDroneDSLLib.g:5717:5: (lv_b_142_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:5717:5: (lv_b_142_0= ruleMD )
                    // InternalDroneDSLLib.g:5718:6: lv_b_142_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBMDParserRuleCall_20_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_142_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_142_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_143=(Token)match(input,33,FOLLOW_17); 

                    				newLeafNode(otherlv_143, grammarAccess.getParallele4Access().getAmpersandKeyword_20_3());
                    			
                    // InternalDroneDSLLib.g:5739:4: ( (lv_c_144_0= ruleAR ) )
                    // InternalDroneDSLLib.g:5740:5: (lv_c_144_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:5740:5: (lv_c_144_0= ruleAR )
                    // InternalDroneDSLLib.g:5741:6: lv_c_144_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCARParserRuleCall_20_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_c_144_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_144_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_145=(Token)match(input,33,FOLLOW_16); 

                    				newLeafNode(otherlv_145, grammarAccess.getParallele4Access().getAmpersandKeyword_20_5());
                    			
                    // InternalDroneDSLLib.g:5762:4: ( (lv_d_146_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:5763:5: (lv_d_146_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:5763:5: (lv_d_146_0= ruleGDr )
                    // InternalDroneDSLLib.g:5764:6: lv_d_146_0= ruleGDr
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 22 :
                    // InternalDroneDSLLib.g:5783:3: ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) )
                    {
                    // InternalDroneDSLLib.g:5783:3: ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) )
                    // InternalDroneDSLLib.g:5784:4: ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) )
                    {
                    // InternalDroneDSLLib.g:5784:4: ( (lv_a_147_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:5785:5: (lv_a_147_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:5785:5: (lv_a_147_0= ruleRGRD )
                    // InternalDroneDSLLib.g:5786:6: lv_a_147_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getARGRDParserRuleCall_21_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_147_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_147_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_148=(Token)match(input,33,FOLLOW_19); 

                    				newLeafNode(otherlv_148, grammarAccess.getParallele4Access().getAmpersandKeyword_21_1());
                    			
                    // InternalDroneDSLLib.g:5807:4: ( (lv_b_149_0= ruleMD ) )
                    // InternalDroneDSLLib.g:5808:5: (lv_b_149_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:5808:5: (lv_b_149_0= ruleMD )
                    // InternalDroneDSLLib.g:5809:6: lv_b_149_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBMDParserRuleCall_21_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_149_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_149_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_150=(Token)match(input,33,FOLLOW_16); 

                    				newLeafNode(otherlv_150, grammarAccess.getParallele4Access().getAmpersandKeyword_21_3());
                    			
                    // InternalDroneDSLLib.g:5830:4: ( (lv_c_151_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:5831:5: (lv_c_151_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:5831:5: (lv_c_151_0= ruleGDr )
                    // InternalDroneDSLLib.g:5832:6: lv_c_151_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCGDrParserRuleCall_21_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_c_151_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_151_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_152=(Token)match(input,33,FOLLOW_17); 

                    				newLeafNode(otherlv_152, grammarAccess.getParallele4Access().getAmpersandKeyword_21_5());
                    			
                    // InternalDroneDSLLib.g:5853:4: ( (lv_d_153_0= ruleAR ) )
                    // InternalDroneDSLLib.g:5854:5: (lv_d_153_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:5854:5: (lv_d_153_0= ruleAR )
                    // InternalDroneDSLLib.g:5855:6: lv_d_153_0= ruleAR
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 23 :
                    // InternalDroneDSLLib.g:5874:3: ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) )
                    {
                    // InternalDroneDSLLib.g:5874:3: ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) )
                    // InternalDroneDSLLib.g:5875:4: ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) )
                    {
                    // InternalDroneDSLLib.g:5875:4: ( (lv_a_154_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:5876:5: (lv_a_154_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:5876:5: (lv_a_154_0= ruleRGRD )
                    // InternalDroneDSLLib.g:5877:6: lv_a_154_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getARGRDParserRuleCall_22_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_154_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_154_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_155=(Token)match(input,33,FOLLOW_16); 

                    				newLeafNode(otherlv_155, grammarAccess.getParallele4Access().getAmpersandKeyword_22_1());
                    			
                    // InternalDroneDSLLib.g:5898:4: ( (lv_b_156_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:5899:5: (lv_b_156_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:5899:5: (lv_b_156_0= ruleGDr )
                    // InternalDroneDSLLib.g:5900:6: lv_b_156_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBGDrParserRuleCall_22_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_156_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_156_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_157=(Token)match(input,33,FOLLOW_19); 

                    				newLeafNode(otherlv_157, grammarAccess.getParallele4Access().getAmpersandKeyword_22_3());
                    			
                    // InternalDroneDSLLib.g:5921:4: ( (lv_c_158_0= ruleMD ) )
                    // InternalDroneDSLLib.g:5922:5: (lv_c_158_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:5922:5: (lv_c_158_0= ruleMD )
                    // InternalDroneDSLLib.g:5923:6: lv_c_158_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCMDParserRuleCall_22_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_c_158_0=ruleMD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_158_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_159=(Token)match(input,33,FOLLOW_17); 

                    				newLeafNode(otherlv_159, grammarAccess.getParallele4Access().getAmpersandKeyword_22_5());
                    			
                    // InternalDroneDSLLib.g:5944:4: ( (lv_d_160_0= ruleAR ) )
                    // InternalDroneDSLLib.g:5945:5: (lv_d_160_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:5945:5: (lv_d_160_0= ruleAR )
                    // InternalDroneDSLLib.g:5946:6: lv_d_160_0= ruleAR
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 24 :
                    // InternalDroneDSLLib.g:5965:3: ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) )
                    {
                    // InternalDroneDSLLib.g:5965:3: ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) )
                    // InternalDroneDSLLib.g:5966:4: ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) )
                    {
                    // InternalDroneDSLLib.g:5966:4: ( (lv_a_161_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:5967:5: (lv_a_161_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:5967:5: (lv_a_161_0= ruleRGRD )
                    // InternalDroneDSLLib.g:5968:6: lv_a_161_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getARGRDParserRuleCall_23_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_a_161_0=ruleRGRD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"a",
                    							lv_a_161_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.RGRD");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_162=(Token)match(input,33,FOLLOW_16); 

                    				newLeafNode(otherlv_162, grammarAccess.getParallele4Access().getAmpersandKeyword_23_1());
                    			
                    // InternalDroneDSLLib.g:5989:4: ( (lv_b_163_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:5990:5: (lv_b_163_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:5990:5: (lv_b_163_0= ruleGDr )
                    // InternalDroneDSLLib.g:5991:6: lv_b_163_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getBGDrParserRuleCall_23_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_b_163_0=ruleGDr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"b",
                    							lv_b_163_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.GDr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_164=(Token)match(input,33,FOLLOW_17); 

                    				newLeafNode(otherlv_164, grammarAccess.getParallele4Access().getAmpersandKeyword_23_3());
                    			
                    // InternalDroneDSLLib.g:6012:4: ( (lv_c_165_0= ruleAR ) )
                    // InternalDroneDSLLib.g:6013:5: (lv_c_165_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:6013:5: (lv_c_165_0= ruleAR )
                    // InternalDroneDSLLib.g:6014:6: lv_c_165_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele4Access().getCARParserRuleCall_23_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_c_165_0=ruleAR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParallele4Rule());
                    						}
                    						set(
                    							current,
                    							"c",
                    							lv_c_165_0,
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.AR");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_166=(Token)match(input,33,FOLLOW_19); 

                    				newLeafNode(otherlv_166, grammarAccess.getParallele4Access().getAmpersandKeyword_23_5());
                    			
                    // InternalDroneDSLLib.g:6035:4: ( (lv_d_167_0= ruleMD ) )
                    // InternalDroneDSLLib.g:6036:5: (lv_d_167_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:6036:5: (lv_d_167_0= ruleMD )
                    // InternalDroneDSLLib.g:6037:6: lv_d_167_0= ruleMD
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
                    							"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.MD");
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
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String dfa_1s = "\76\uffff";
    static final String dfa_2s = "\1\6\1\uffff\10\4\3\uffff\20\23\10\5\20\24\10\6\1\uffff";
    static final String dfa_3s = "\1\34\1\uffff\10\6\3\uffff\20\23\10\6\20\24\10\41\1\uffff";
    static final String dfa_4s = "\1\uffff\1\1\10\uffff\1\2\1\4\1\5\60\uffff\1\3";
    static final String dfa_5s = "\76\uffff}>";
    static final String[] dfa_6s = {
            "\1\13\6\uffff\1\1\1\uffff\1\1\2\14\1\4\2\uffff\1\5\1\2\1\3\1\6\1\7\1\10\1\11\1\12",
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
            "\1\12\6\uffff\1\12\1\uffff\4\12\2\uffff\10\12\3\uffff\1\12\1\75",
            "\1\12\6\uffff\1\12\1\uffff\4\12\2\uffff\10\12\3\uffff\1\12\1\75",
            "\1\12\6\uffff\1\12\1\uffff\4\12\2\uffff\10\12\3\uffff\1\12\1\75",
            "\1\12\6\uffff\1\12\1\uffff\4\12\2\uffff\10\12\3\uffff\1\12\1\75",
            "\1\12\6\uffff\1\12\1\uffff\4\12\2\uffff\10\12\3\uffff\1\12\1\75",
            "\1\12\6\uffff\1\12\1\uffff\4\12\2\uffff\10\12\3\uffff\1\12\1\75",
            "\1\12\6\uffff\1\12\1\uffff\4\12\2\uffff\10\12\3\uffff\1\12\1\75",
            "\1\12\6\uffff\1\12\1\uffff\4\12\2\uffff\10\12\3\uffff\1\12\1\75",
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
            return "1308:5: (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir )";
        }
    }
    static final String dfa_7s = "\u0244\uffff";
    static final String dfa_8s = "\u00cd\uffff\30\u00e6\u012d\uffff\60\u0242\2\uffff";
    static final String dfa_9s = "\1\22\10\4\20\23\10\5\20\24\10\41\1\26\3\22\30\4\60\23\30\5\60\24\30\6\1\26\1\uffff\1\26\1\30\2\22\1\26\2\22\1\26\1\30\2\22\60\4\140\23\60\5\140\24\60\6\2\uffff";
    static final String dfa_10s = "\1\33\10\6\20\23\10\6\20\24\10\41\2\33\1\31\1\33\30\6\60\23\30\6\60\24\30\41\1\31\1\uffff\3\33\1\27\1\33\1\27\2\31\2\33\1\31\60\6\140\23\60\6\140\24\60\41\2\uffff";
    static final String dfa_11s = "\u00e6\uffff\1\1\u015b\uffff\1\2\1\3";
    static final String dfa_12s = "\u0244\uffff}>";
    static final String[] dfa_13s = {
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
            "\1\107\2\uffff\1\110\1\103\1\104\2\uffff\1\105\1\106",
            "\1\115\2\uffff\1\116\1\113\1\114\1\111\1\112",
            "\1\117\2\uffff\1\120\2\uffff\1\121\1\122\1\123\1\124",
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
            "\1\u00e6\6\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00e5",
            "\1\u00e6\6\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00e5",
            "\1\u00e6\6\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00e7",
            "\1\u00e6\6\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00e7",
            "\1\u00e6\6\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00e8",
            "\1\u00e6\6\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00e8",
            "\1\u00e6\6\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00e9",
            "\1\u00e6\6\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00e9",
            "\1\u00e6\6\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00ea",
            "\1\u00e6\6\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00ea",
            "\1\u00e6\6\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00eb",
            "\1\u00e6\6\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00eb",
            "\1\u00e6\6\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00ec",
            "\1\u00e6\6\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00ec",
            "\1\u00e6\6\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00ed",
            "\1\u00e6\6\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00ed",
            "\1\u00e6\6\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00ee",
            "\1\u00e6\6\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00ee",
            "\1\u00e6\6\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00ef",
            "\1\u00e6\6\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00ef",
            "\1\u00e6\6\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00f0",
            "\1\u00e6\6\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00f0",
            "\1\u00e6\6\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00f1",
            "\1\u00e6\6\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00f1",
            "\1\u00f4\1\u00f5\1\u00f2\1\u00f3",
            "",
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
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\6\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1618:2: (this_Parallele2_0= ruleParallele2 | this_Parallele3_1= ruleParallele3 | this_Parallele4_2= ruleParallele4 )";
        }
    }
    static final String dfa_14s = "\111\uffff";
    static final String dfa_15s = "\1\22\10\4\20\23\10\5\20\24\10\41\1\26\3\22\14\uffff";
    static final String dfa_16s = "\1\33\10\6\20\23\10\6\20\24\10\41\2\33\1\31\1\33\14\uffff";
    static final String dfa_17s = "\75\uffff\1\2\1\1\1\3\1\4\1\6\1\5\1\10\1\7\1\11\1\12\1\14\1\13";
    static final String dfa_18s = "\111\uffff}>";
    static final String[] dfa_19s = {
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

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "1663:2: ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) )";
        }
    }
    static final String dfa_20s = "\u0109\uffff";
    static final String dfa_21s = "\1\22\10\4\20\23\10\5\20\24\10\41\2\22\1\26\1\22\30\4\60\23\30\5\60\24\30\41\2\22\1\30\1\22\1\26\1\22\2\26\1\30\1\26\2\22\30\uffff";
    static final String dfa_22s = "\1\33\10\6\20\23\10\6\20\24\10\41\3\33\1\31\30\6\60\23\30\6\60\24\30\41\1\33\1\31\1\33\1\27\2\33\1\31\2\33\2\31\1\27\30\uffff";
    static final String dfa_23s = "\u00f1\uffff\1\1\1\2\1\6\1\5\1\3\1\4\1\13\1\14\1\11\1\12\1\7\1\10\1\21\1\22\1\20\1\17\1\15\1\16\1\26\1\25\1\23\1\24\1\27\1\30";
    static final String dfa_24s = "\u0109\uffff}>";
    static final String[] dfa_25s = {
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
            "\1\101\2\uffff\1\102\2\uffff\1\75\1\76\1\77\1\100",
            "\1\105\2\uffff\1\106\1\107\1\110\2\uffff\1\103\1\104",
            "\1\115\1\116\1\113\1\114\1\111\1\112",
            "\1\117\2\uffff\1\120\1\121\1\122\1\123\1\124",
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

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "2221:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) )";
        }
    }
    static final String dfa_26s = "\1\22\10\4\20\23\10\5\20\24\10\41\2\22\1\26\1\22\30\4\60\23\30\5\60\24\30\41\1\22\1\30\1\22\1\26\2\22\1\26\1\30\1\26\1\22\1\26\1\22\30\uffff";
    static final String dfa_27s = "\1\33\10\6\20\23\10\6\20\24\10\41\3\33\1\31\30\6\60\23\30\6\60\24\30\41\2\33\1\31\1\33\1\27\1\33\1\31\2\33\2\31\1\27\30\uffff";
    static final String dfa_28s = "\u00f1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\11\1\12\1\13\1\14\1\7\1\10\1\21\1\22\1\15\1\16\1\17\1\20\1\23\1\24\1\25\1\26\1\27\1\30";
    static final String[] dfa_29s = {
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
            "\1\103\2\uffff\1\104\1\107\1\110\2\uffff\1\105\1\106",
            "\1\113\1\114\1\115\1\116\1\111\1\112",
            "\1\121\2\uffff\1\122\1\117\1\120\1\123\1\124",
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
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[][] dfa_29 = unpackEncodedStringArray(dfa_29s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_26;
            this.max = dfa_27;
            this.accept = dfa_28;
            this.special = dfa_24;
            this.transition = dfa_29;
        }
        public String getDescription() {
            return "3871:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) ) | ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) ) | ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) ) | ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) ) | ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) ) | ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) ) | ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) ) | ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) ) | ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) ) | ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) ) | ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) ) | ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) ) | ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) ) | ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) ) | ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) ) | ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) ) | ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) ) | ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) ) | ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) ) | ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) ) | ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) ) | ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) ) | ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) ) | ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000011FE7A040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000240000L});

}