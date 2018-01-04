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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SECONDE", "RULE_POURCENT", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'lib:'", "'Seconde'", "'='", "'Pourcent'", "'decoller()'", "'atterrir()'", "'monter('", "','", "')'", "'descendre('", "'avancer('", "'reculer('", "'gauche('", "'droite('", "'rotation_gauche('", "'rotation_droite('", "'pause('", "'func'", "'()'", "'{'", "'}'", "'&'"
    };
    public static final int RULE_POURCENT=6;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int RULE_SECONDE=5;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
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
    // InternalDroneDSLLib.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_lib_0_0= ruleLibName ) ) ( (lv_fonctions_1_0= ruleFonctionDecl ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_lib_0_0 = null;

        EObject lv_fonctions_1_0 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:77:2: ( ( ( (lv_lib_0_0= ruleLibName ) ) ( (lv_fonctions_1_0= ruleFonctionDecl ) )* ) )
            // InternalDroneDSLLib.g:78:2: ( ( (lv_lib_0_0= ruleLibName ) ) ( (lv_fonctions_1_0= ruleFonctionDecl ) )* )
            {
            // InternalDroneDSLLib.g:78:2: ( ( (lv_lib_0_0= ruleLibName ) ) ( (lv_fonctions_1_0= ruleFonctionDecl ) )* )
            // InternalDroneDSLLib.g:79:3: ( (lv_lib_0_0= ruleLibName ) ) ( (lv_fonctions_1_0= ruleFonctionDecl ) )*
            {
            // InternalDroneDSLLib.g:79:3: ( (lv_lib_0_0= ruleLibName ) )
            // InternalDroneDSLLib.g:80:4: (lv_lib_0_0= ruleLibName )
            {
            // InternalDroneDSLLib.g:80:4: (lv_lib_0_0= ruleLibName )
            // InternalDroneDSLLib.g:81:5: lv_lib_0_0= ruleLibName
            {

            					newCompositeNode(grammarAccess.getModelAccess().getLibLibNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_lib_0_0=ruleLibName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"lib",
            						lv_lib_0_0,
            						"fr.idmteam1.idmproject.dronedsl.DroneDSLLib.LibName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDroneDSLLib.g:98:3: ( (lv_fonctions_1_0= ruleFonctionDecl ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==30) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDroneDSLLib.g:99:4: (lv_fonctions_1_0= ruleFonctionDecl )
            	    {
            	    // InternalDroneDSLLib.g:99:4: (lv_fonctions_1_0= ruleFonctionDecl )
            	    // InternalDroneDSLLib.g:100:5: lv_fonctions_1_0= ruleFonctionDecl
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getFonctionsFonctionDeclParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_fonctions_1_0=ruleFonctionDecl();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"fonctions",
            	    						lv_fonctions_1_0,
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


    // $ANTLR start "entryRuleLibName"
    // InternalDroneDSLLib.g:121:1: entryRuleLibName returns [EObject current=null] : iv_ruleLibName= ruleLibName EOF ;
    public final EObject entryRuleLibName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibName = null;


        try {
            // InternalDroneDSLLib.g:121:48: (iv_ruleLibName= ruleLibName EOF )
            // InternalDroneDSLLib.g:122:2: iv_ruleLibName= ruleLibName EOF
            {
             newCompositeNode(grammarAccess.getLibNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLibName=ruleLibName();

            state._fsp--;

             current =iv_ruleLibName; 
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
    // $ANTLR end "entryRuleLibName"


    // $ANTLR start "ruleLibName"
    // InternalDroneDSLLib.g:128:1: ruleLibName returns [EObject current=null] : (otherlv_0= 'lib:' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLibName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDroneDSLLib.g:134:2: ( (otherlv_0= 'lib:' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalDroneDSLLib.g:135:2: (otherlv_0= 'lib:' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalDroneDSLLib.g:135:2: (otherlv_0= 'lib:' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalDroneDSLLib.g:136:3: otherlv_0= 'lib:' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLibNameAccess().getLibKeyword_0());
            		
            // InternalDroneDSLLib.g:140:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDroneDSLLib.g:141:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDroneDSLLib.g:141:4: (lv_name_1_0= RULE_ID )
            // InternalDroneDSLLib.g:142:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLibNameAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLibNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleLibName"


    // $ANTLR start "entryRuleSecondeConst"
    // InternalDroneDSLLib.g:162:1: entryRuleSecondeConst returns [EObject current=null] : iv_ruleSecondeConst= ruleSecondeConst EOF ;
    public final EObject entryRuleSecondeConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecondeConst = null;


        try {
            // InternalDroneDSLLib.g:162:53: (iv_ruleSecondeConst= ruleSecondeConst EOF )
            // InternalDroneDSLLib.g:163:2: iv_ruleSecondeConst= ruleSecondeConst EOF
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
    // InternalDroneDSLLib.g:169:1: ruleSecondeConst returns [EObject current=null] : ( (lv_val_0_0= RULE_SECONDE ) ) ;
    public final EObject ruleSecondeConst() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalDroneDSLLib.g:175:2: ( ( (lv_val_0_0= RULE_SECONDE ) ) )
            // InternalDroneDSLLib.g:176:2: ( (lv_val_0_0= RULE_SECONDE ) )
            {
            // InternalDroneDSLLib.g:176:2: ( (lv_val_0_0= RULE_SECONDE ) )
            // InternalDroneDSLLib.g:177:3: (lv_val_0_0= RULE_SECONDE )
            {
            // InternalDroneDSLLib.g:177:3: (lv_val_0_0= RULE_SECONDE )
            // InternalDroneDSLLib.g:178:4: lv_val_0_0= RULE_SECONDE
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
    // InternalDroneDSLLib.g:197:1: entryRulePourcentConst returns [EObject current=null] : iv_rulePourcentConst= rulePourcentConst EOF ;
    public final EObject entryRulePourcentConst() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePourcentConst = null;


        try {
            // InternalDroneDSLLib.g:197:54: (iv_rulePourcentConst= rulePourcentConst EOF )
            // InternalDroneDSLLib.g:198:2: iv_rulePourcentConst= rulePourcentConst EOF
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
    // InternalDroneDSLLib.g:204:1: rulePourcentConst returns [EObject current=null] : ( (lv_val_0_0= RULE_POURCENT ) ) ;
    public final EObject rulePourcentConst() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalDroneDSLLib.g:210:2: ( ( (lv_val_0_0= RULE_POURCENT ) ) )
            // InternalDroneDSLLib.g:211:2: ( (lv_val_0_0= RULE_POURCENT ) )
            {
            // InternalDroneDSLLib.g:211:2: ( (lv_val_0_0= RULE_POURCENT ) )
            // InternalDroneDSLLib.g:212:3: (lv_val_0_0= RULE_POURCENT )
            {
            // InternalDroneDSLLib.g:212:3: (lv_val_0_0= RULE_POURCENT )
            // InternalDroneDSLLib.g:213:4: lv_val_0_0= RULE_POURCENT
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
    // InternalDroneDSLLib.g:232:1: entryRuleSecondeDecl returns [EObject current=null] : iv_ruleSecondeDecl= ruleSecondeDecl EOF ;
    public final EObject entryRuleSecondeDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecondeDecl = null;


        try {
            // InternalDroneDSLLib.g:232:52: (iv_ruleSecondeDecl= ruleSecondeDecl EOF )
            // InternalDroneDSLLib.g:233:2: iv_ruleSecondeDecl= ruleSecondeDecl EOF
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
    // InternalDroneDSLLib.g:239:1: ruleSecondeDecl returns [EObject current=null] : (otherlv_0= 'Seconde' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleSecondeConst ) ) ) ;
    public final EObject ruleSecondeDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_val_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:245:2: ( (otherlv_0= 'Seconde' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleSecondeConst ) ) ) )
            // InternalDroneDSLLib.g:246:2: (otherlv_0= 'Seconde' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleSecondeConst ) ) )
            {
            // InternalDroneDSLLib.g:246:2: (otherlv_0= 'Seconde' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleSecondeConst ) ) )
            // InternalDroneDSLLib.g:247:3: otherlv_0= 'Seconde' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleSecondeConst ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSecondeDeclAccess().getSecondeKeyword_0());
            		
            // InternalDroneDSLLib.g:251:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDroneDSLLib.g:252:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDroneDSLLib.g:252:4: (lv_name_1_0= RULE_ID )
            // InternalDroneDSLLib.g:253:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getSecondeDeclAccess().getEqualsSignKeyword_2());
            		
            // InternalDroneDSLLib.g:273:3: ( (lv_val_3_0= ruleSecondeConst ) )
            // InternalDroneDSLLib.g:274:4: (lv_val_3_0= ruleSecondeConst )
            {
            // InternalDroneDSLLib.g:274:4: (lv_val_3_0= ruleSecondeConst )
            // InternalDroneDSLLib.g:275:5: lv_val_3_0= ruleSecondeConst
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
    // InternalDroneDSLLib.g:296:1: entryRulePourcentDecl returns [EObject current=null] : iv_rulePourcentDecl= rulePourcentDecl EOF ;
    public final EObject entryRulePourcentDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePourcentDecl = null;


        try {
            // InternalDroneDSLLib.g:296:53: (iv_rulePourcentDecl= rulePourcentDecl EOF )
            // InternalDroneDSLLib.g:297:2: iv_rulePourcentDecl= rulePourcentDecl EOF
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
    // InternalDroneDSLLib.g:303:1: rulePourcentDecl returns [EObject current=null] : (otherlv_0= 'Pourcent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= rulePourcentConst ) ) ) ;
    public final EObject rulePourcentDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_val_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:309:2: ( (otherlv_0= 'Pourcent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= rulePourcentConst ) ) ) )
            // InternalDroneDSLLib.g:310:2: (otherlv_0= 'Pourcent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= rulePourcentConst ) ) )
            {
            // InternalDroneDSLLib.g:310:2: (otherlv_0= 'Pourcent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= rulePourcentConst ) ) )
            // InternalDroneDSLLib.g:311:3: otherlv_0= 'Pourcent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= rulePourcentConst ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPourcentDeclAccess().getPourcentKeyword_0());
            		
            // InternalDroneDSLLib.g:315:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDroneDSLLib.g:316:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDroneDSLLib.g:316:4: (lv_name_1_0= RULE_ID )
            // InternalDroneDSLLib.g:317:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getPourcentDeclAccess().getEqualsSignKeyword_2());
            		
            // InternalDroneDSLLib.g:337:3: ( (lv_val_3_0= rulePourcentConst ) )
            // InternalDroneDSLLib.g:338:4: (lv_val_3_0= rulePourcentConst )
            {
            // InternalDroneDSLLib.g:338:4: (lv_val_3_0= rulePourcentConst )
            // InternalDroneDSLLib.g:339:5: lv_val_3_0= rulePourcentConst
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
    // InternalDroneDSLLib.g:360:1: entryRuleVarDecl returns [EObject current=null] : iv_ruleVarDecl= ruleVarDecl EOF ;
    public final EObject entryRuleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDecl = null;


        try {
            // InternalDroneDSLLib.g:360:48: (iv_ruleVarDecl= ruleVarDecl EOF )
            // InternalDroneDSLLib.g:361:2: iv_ruleVarDecl= ruleVarDecl EOF
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
    // InternalDroneDSLLib.g:367:1: ruleVarDecl returns [EObject current=null] : (this_PourcentDecl_0= rulePourcentDecl | this_SecondeDecl_1= ruleSecondeDecl ) ;
    public final EObject ruleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject this_PourcentDecl_0 = null;

        EObject this_SecondeDecl_1 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:373:2: ( (this_PourcentDecl_0= rulePourcentDecl | this_SecondeDecl_1= ruleSecondeDecl ) )
            // InternalDroneDSLLib.g:374:2: (this_PourcentDecl_0= rulePourcentDecl | this_SecondeDecl_1= ruleSecondeDecl )
            {
            // InternalDroneDSLLib.g:374:2: (this_PourcentDecl_0= rulePourcentDecl | this_SecondeDecl_1= ruleSecondeDecl )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDroneDSLLib.g:375:3: this_PourcentDecl_0= rulePourcentDecl
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
                    // InternalDroneDSLLib.g:384:3: this_SecondeDecl_1= ruleSecondeDecl
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
    // InternalDroneDSLLib.g:396:1: entryRuleRefSecondeVar returns [EObject current=null] : iv_ruleRefSecondeVar= ruleRefSecondeVar EOF ;
    public final EObject entryRuleRefSecondeVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefSecondeVar = null;


        try {
            // InternalDroneDSLLib.g:396:54: (iv_ruleRefSecondeVar= ruleRefSecondeVar EOF )
            // InternalDroneDSLLib.g:397:2: iv_ruleRefSecondeVar= ruleRefSecondeVar EOF
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
    // InternalDroneDSLLib.g:403:1: ruleRefSecondeVar returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleRefSecondeVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDroneDSLLib.g:409:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalDroneDSLLib.g:410:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalDroneDSLLib.g:410:2: ( (otherlv_0= RULE_ID ) )
            // InternalDroneDSLLib.g:411:3: (otherlv_0= RULE_ID )
            {
            // InternalDroneDSLLib.g:411:3: (otherlv_0= RULE_ID )
            // InternalDroneDSLLib.g:412:4: otherlv_0= RULE_ID
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
    // InternalDroneDSLLib.g:426:1: entryRuleRefPourcentVar returns [EObject current=null] : iv_ruleRefPourcentVar= ruleRefPourcentVar EOF ;
    public final EObject entryRuleRefPourcentVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefPourcentVar = null;


        try {
            // InternalDroneDSLLib.g:426:55: (iv_ruleRefPourcentVar= ruleRefPourcentVar EOF )
            // InternalDroneDSLLib.g:427:2: iv_ruleRefPourcentVar= ruleRefPourcentVar EOF
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
    // InternalDroneDSLLib.g:433:1: ruleRefPourcentVar returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleRefPourcentVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDroneDSLLib.g:439:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalDroneDSLLib.g:440:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalDroneDSLLib.g:440:2: ( (otherlv_0= RULE_ID ) )
            // InternalDroneDSLLib.g:441:3: (otherlv_0= RULE_ID )
            {
            // InternalDroneDSLLib.g:441:3: (otherlv_0= RULE_ID )
            // InternalDroneDSLLib.g:442:4: otherlv_0= RULE_ID
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
    // InternalDroneDSLLib.g:456:1: entryRulePourcentExp returns [EObject current=null] : iv_rulePourcentExp= rulePourcentExp EOF ;
    public final EObject entryRulePourcentExp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePourcentExp = null;


        try {
            // InternalDroneDSLLib.g:456:52: (iv_rulePourcentExp= rulePourcentExp EOF )
            // InternalDroneDSLLib.g:457:2: iv_rulePourcentExp= rulePourcentExp EOF
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
    // InternalDroneDSLLib.g:463:1: rulePourcentExp returns [EObject current=null] : (this_PourcentConst_0= rulePourcentConst | this_RefPourcentVar_1= ruleRefPourcentVar ) ;
    public final EObject rulePourcentExp() throws RecognitionException {
        EObject current = null;

        EObject this_PourcentConst_0 = null;

        EObject this_RefPourcentVar_1 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:469:2: ( (this_PourcentConst_0= rulePourcentConst | this_RefPourcentVar_1= ruleRefPourcentVar ) )
            // InternalDroneDSLLib.g:470:2: (this_PourcentConst_0= rulePourcentConst | this_RefPourcentVar_1= ruleRefPourcentVar )
            {
            // InternalDroneDSLLib.g:470:2: (this_PourcentConst_0= rulePourcentConst | this_RefPourcentVar_1= ruleRefPourcentVar )
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
                    // InternalDroneDSLLib.g:471:3: this_PourcentConst_0= rulePourcentConst
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
                    // InternalDroneDSLLib.g:480:3: this_RefPourcentVar_1= ruleRefPourcentVar
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
    // InternalDroneDSLLib.g:492:1: entryRuleSecondeExp returns [EObject current=null] : iv_ruleSecondeExp= ruleSecondeExp EOF ;
    public final EObject entryRuleSecondeExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecondeExp = null;


        try {
            // InternalDroneDSLLib.g:492:51: (iv_ruleSecondeExp= ruleSecondeExp EOF )
            // InternalDroneDSLLib.g:493:2: iv_ruleSecondeExp= ruleSecondeExp EOF
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
    // InternalDroneDSLLib.g:499:1: ruleSecondeExp returns [EObject current=null] : (this_SecondeConst_0= ruleSecondeConst | this_RefSecondeVar_1= ruleRefSecondeVar ) ;
    public final EObject ruleSecondeExp() throws RecognitionException {
        EObject current = null;

        EObject this_SecondeConst_0 = null;

        EObject this_RefSecondeVar_1 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:505:2: ( (this_SecondeConst_0= ruleSecondeConst | this_RefSecondeVar_1= ruleRefSecondeVar ) )
            // InternalDroneDSLLib.g:506:2: (this_SecondeConst_0= ruleSecondeConst | this_RefSecondeVar_1= ruleRefSecondeVar )
            {
            // InternalDroneDSLLib.g:506:2: (this_SecondeConst_0= ruleSecondeConst | this_RefSecondeVar_1= ruleRefSecondeVar )
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
                    // InternalDroneDSLLib.g:507:3: this_SecondeConst_0= ruleSecondeConst
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
                    // InternalDroneDSLLib.g:516:3: this_RefSecondeVar_1= ruleRefSecondeVar
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
    // InternalDroneDSLLib.g:528:1: entryRuleDecoller returns [EObject current=null] : iv_ruleDecoller= ruleDecoller EOF ;
    public final EObject entryRuleDecoller() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecoller = null;


        try {
            // InternalDroneDSLLib.g:528:49: (iv_ruleDecoller= ruleDecoller EOF )
            // InternalDroneDSLLib.g:529:2: iv_ruleDecoller= ruleDecoller EOF
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
    // InternalDroneDSLLib.g:535:1: ruleDecoller returns [EObject current=null] : ( (lv_str_0_0= 'decoller()' ) ) ;
    public final EObject ruleDecoller() throws RecognitionException {
        EObject current = null;

        Token lv_str_0_0=null;


        	enterRule();

        try {
            // InternalDroneDSLLib.g:541:2: ( ( (lv_str_0_0= 'decoller()' ) ) )
            // InternalDroneDSLLib.g:542:2: ( (lv_str_0_0= 'decoller()' ) )
            {
            // InternalDroneDSLLib.g:542:2: ( (lv_str_0_0= 'decoller()' ) )
            // InternalDroneDSLLib.g:543:3: (lv_str_0_0= 'decoller()' )
            {
            // InternalDroneDSLLib.g:543:3: (lv_str_0_0= 'decoller()' )
            // InternalDroneDSLLib.g:544:4: lv_str_0_0= 'decoller()'
            {
            lv_str_0_0=(Token)match(input,17,FOLLOW_2); 

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
    // InternalDroneDSLLib.g:559:1: entryRuleAtterrir returns [EObject current=null] : iv_ruleAtterrir= ruleAtterrir EOF ;
    public final EObject entryRuleAtterrir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtterrir = null;


        try {
            // InternalDroneDSLLib.g:559:49: (iv_ruleAtterrir= ruleAtterrir EOF )
            // InternalDroneDSLLib.g:560:2: iv_ruleAtterrir= ruleAtterrir EOF
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
    // InternalDroneDSLLib.g:566:1: ruleAtterrir returns [EObject current=null] : ( (lv_str_0_0= 'atterrir()' ) ) ;
    public final EObject ruleAtterrir() throws RecognitionException {
        EObject current = null;

        Token lv_str_0_0=null;


        	enterRule();

        try {
            // InternalDroneDSLLib.g:572:2: ( ( (lv_str_0_0= 'atterrir()' ) ) )
            // InternalDroneDSLLib.g:573:2: ( (lv_str_0_0= 'atterrir()' ) )
            {
            // InternalDroneDSLLib.g:573:2: ( (lv_str_0_0= 'atterrir()' ) )
            // InternalDroneDSLLib.g:574:3: (lv_str_0_0= 'atterrir()' )
            {
            // InternalDroneDSLLib.g:574:3: (lv_str_0_0= 'atterrir()' )
            // InternalDroneDSLLib.g:575:4: lv_str_0_0= 'atterrir()'
            {
            lv_str_0_0=(Token)match(input,18,FOLLOW_2); 

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
    // InternalDroneDSLLib.g:590:1: entryRuleMonter returns [EObject current=null] : iv_ruleMonter= ruleMonter EOF ;
    public final EObject entryRuleMonter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonter = null;


        try {
            // InternalDroneDSLLib.g:590:47: (iv_ruleMonter= ruleMonter EOF )
            // InternalDroneDSLLib.g:591:2: iv_ruleMonter= ruleMonter EOF
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
    // InternalDroneDSLLib.g:597:1: ruleMonter returns [EObject current=null] : (otherlv_0= 'monter(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) ;
    public final EObject ruleMonter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duree_1_0 = null;

        EObject lv_vitesse_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:603:2: ( (otherlv_0= 'monter(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) )
            // InternalDroneDSLLib.g:604:2: (otherlv_0= 'monter(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            {
            // InternalDroneDSLLib.g:604:2: (otherlv_0= 'monter(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            // InternalDroneDSLLib.g:605:3: otherlv_0= 'monter(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getMonterAccess().getMonterKeyword_0());
            		
            // InternalDroneDSLLib.g:609:3: ( (lv_duree_1_0= ruleSecondeExp ) )
            // InternalDroneDSLLib.g:610:4: (lv_duree_1_0= ruleSecondeExp )
            {
            // InternalDroneDSLLib.g:610:4: (lv_duree_1_0= ruleSecondeExp )
            // InternalDroneDSLLib.g:611:5: lv_duree_1_0= ruleSecondeExp
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

            otherlv_2=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getMonterAccess().getCommaKeyword_2());
            		
            // InternalDroneDSLLib.g:632:3: ( (lv_vitesse_3_0= rulePourcentExp ) )
            // InternalDroneDSLLib.g:633:4: (lv_vitesse_3_0= rulePourcentExp )
            {
            // InternalDroneDSLLib.g:633:4: (lv_vitesse_3_0= rulePourcentExp )
            // InternalDroneDSLLib.g:634:5: lv_vitesse_3_0= rulePourcentExp
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

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

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
    // InternalDroneDSLLib.g:659:1: entryRuleDescendre returns [EObject current=null] : iv_ruleDescendre= ruleDescendre EOF ;
    public final EObject entryRuleDescendre() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescendre = null;


        try {
            // InternalDroneDSLLib.g:659:50: (iv_ruleDescendre= ruleDescendre EOF )
            // InternalDroneDSLLib.g:660:2: iv_ruleDescendre= ruleDescendre EOF
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
    // InternalDroneDSLLib.g:666:1: ruleDescendre returns [EObject current=null] : (otherlv_0= 'descendre(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) ;
    public final EObject ruleDescendre() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duree_1_0 = null;

        EObject lv_vitesse_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:672:2: ( (otherlv_0= 'descendre(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) )
            // InternalDroneDSLLib.g:673:2: (otherlv_0= 'descendre(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            {
            // InternalDroneDSLLib.g:673:2: (otherlv_0= 'descendre(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            // InternalDroneDSLLib.g:674:3: otherlv_0= 'descendre(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDescendreAccess().getDescendreKeyword_0());
            		
            // InternalDroneDSLLib.g:678:3: ( (lv_duree_1_0= ruleSecondeExp ) )
            // InternalDroneDSLLib.g:679:4: (lv_duree_1_0= ruleSecondeExp )
            {
            // InternalDroneDSLLib.g:679:4: (lv_duree_1_0= ruleSecondeExp )
            // InternalDroneDSLLib.g:680:5: lv_duree_1_0= ruleSecondeExp
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

            otherlv_2=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDescendreAccess().getCommaKeyword_2());
            		
            // InternalDroneDSLLib.g:701:3: ( (lv_vitesse_3_0= rulePourcentExp ) )
            // InternalDroneDSLLib.g:702:4: (lv_vitesse_3_0= rulePourcentExp )
            {
            // InternalDroneDSLLib.g:702:4: (lv_vitesse_3_0= rulePourcentExp )
            // InternalDroneDSLLib.g:703:5: lv_vitesse_3_0= rulePourcentExp
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

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

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
    // InternalDroneDSLLib.g:728:1: entryRuleAvancer returns [EObject current=null] : iv_ruleAvancer= ruleAvancer EOF ;
    public final EObject entryRuleAvancer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvancer = null;


        try {
            // InternalDroneDSLLib.g:728:48: (iv_ruleAvancer= ruleAvancer EOF )
            // InternalDroneDSLLib.g:729:2: iv_ruleAvancer= ruleAvancer EOF
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
    // InternalDroneDSLLib.g:735:1: ruleAvancer returns [EObject current=null] : (otherlv_0= 'avancer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) ;
    public final EObject ruleAvancer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duree_1_0 = null;

        EObject lv_vitesse_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:741:2: ( (otherlv_0= 'avancer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) )
            // InternalDroneDSLLib.g:742:2: (otherlv_0= 'avancer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            {
            // InternalDroneDSLLib.g:742:2: (otherlv_0= 'avancer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            // InternalDroneDSLLib.g:743:3: otherlv_0= 'avancer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getAvancerAccess().getAvancerKeyword_0());
            		
            // InternalDroneDSLLib.g:747:3: ( (lv_duree_1_0= ruleSecondeExp ) )
            // InternalDroneDSLLib.g:748:4: (lv_duree_1_0= ruleSecondeExp )
            {
            // InternalDroneDSLLib.g:748:4: (lv_duree_1_0= ruleSecondeExp )
            // InternalDroneDSLLib.g:749:5: lv_duree_1_0= ruleSecondeExp
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

            otherlv_2=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getAvancerAccess().getCommaKeyword_2());
            		
            // InternalDroneDSLLib.g:770:3: ( (lv_vitesse_3_0= rulePourcentExp ) )
            // InternalDroneDSLLib.g:771:4: (lv_vitesse_3_0= rulePourcentExp )
            {
            // InternalDroneDSLLib.g:771:4: (lv_vitesse_3_0= rulePourcentExp )
            // InternalDroneDSLLib.g:772:5: lv_vitesse_3_0= rulePourcentExp
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

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

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
    // InternalDroneDSLLib.g:797:1: entryRuleReculer returns [EObject current=null] : iv_ruleReculer= ruleReculer EOF ;
    public final EObject entryRuleReculer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReculer = null;


        try {
            // InternalDroneDSLLib.g:797:48: (iv_ruleReculer= ruleReculer EOF )
            // InternalDroneDSLLib.g:798:2: iv_ruleReculer= ruleReculer EOF
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
    // InternalDroneDSLLib.g:804:1: ruleReculer returns [EObject current=null] : (otherlv_0= 'reculer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) ;
    public final EObject ruleReculer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duree_1_0 = null;

        EObject lv_vitesse_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:810:2: ( (otherlv_0= 'reculer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) )
            // InternalDroneDSLLib.g:811:2: (otherlv_0= 'reculer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            {
            // InternalDroneDSLLib.g:811:2: (otherlv_0= 'reculer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            // InternalDroneDSLLib.g:812:3: otherlv_0= 'reculer(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getReculerAccess().getReculerKeyword_0());
            		
            // InternalDroneDSLLib.g:816:3: ( (lv_duree_1_0= ruleSecondeExp ) )
            // InternalDroneDSLLib.g:817:4: (lv_duree_1_0= ruleSecondeExp )
            {
            // InternalDroneDSLLib.g:817:4: (lv_duree_1_0= ruleSecondeExp )
            // InternalDroneDSLLib.g:818:5: lv_duree_1_0= ruleSecondeExp
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

            otherlv_2=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getReculerAccess().getCommaKeyword_2());
            		
            // InternalDroneDSLLib.g:839:3: ( (lv_vitesse_3_0= rulePourcentExp ) )
            // InternalDroneDSLLib.g:840:4: (lv_vitesse_3_0= rulePourcentExp )
            {
            // InternalDroneDSLLib.g:840:4: (lv_vitesse_3_0= rulePourcentExp )
            // InternalDroneDSLLib.g:841:5: lv_vitesse_3_0= rulePourcentExp
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

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

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
    // InternalDroneDSLLib.g:866:1: entryRuleGauche returns [EObject current=null] : iv_ruleGauche= ruleGauche EOF ;
    public final EObject entryRuleGauche() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGauche = null;


        try {
            // InternalDroneDSLLib.g:866:47: (iv_ruleGauche= ruleGauche EOF )
            // InternalDroneDSLLib.g:867:2: iv_ruleGauche= ruleGauche EOF
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
    // InternalDroneDSLLib.g:873:1: ruleGauche returns [EObject current=null] : (otherlv_0= 'gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) ;
    public final EObject ruleGauche() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duree_1_0 = null;

        EObject lv_vitesse_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:879:2: ( (otherlv_0= 'gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) )
            // InternalDroneDSLLib.g:880:2: (otherlv_0= 'gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            {
            // InternalDroneDSLLib.g:880:2: (otherlv_0= 'gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            // InternalDroneDSLLib.g:881:3: otherlv_0= 'gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getGaucheAccess().getGaucheKeyword_0());
            		
            // InternalDroneDSLLib.g:885:3: ( (lv_duree_1_0= ruleSecondeExp ) )
            // InternalDroneDSLLib.g:886:4: (lv_duree_1_0= ruleSecondeExp )
            {
            // InternalDroneDSLLib.g:886:4: (lv_duree_1_0= ruleSecondeExp )
            // InternalDroneDSLLib.g:887:5: lv_duree_1_0= ruleSecondeExp
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

            otherlv_2=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getGaucheAccess().getCommaKeyword_2());
            		
            // InternalDroneDSLLib.g:908:3: ( (lv_vitesse_3_0= rulePourcentExp ) )
            // InternalDroneDSLLib.g:909:4: (lv_vitesse_3_0= rulePourcentExp )
            {
            // InternalDroneDSLLib.g:909:4: (lv_vitesse_3_0= rulePourcentExp )
            // InternalDroneDSLLib.g:910:5: lv_vitesse_3_0= rulePourcentExp
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

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

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
    // InternalDroneDSLLib.g:935:1: entryRuleDroite returns [EObject current=null] : iv_ruleDroite= ruleDroite EOF ;
    public final EObject entryRuleDroite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDroite = null;


        try {
            // InternalDroneDSLLib.g:935:47: (iv_ruleDroite= ruleDroite EOF )
            // InternalDroneDSLLib.g:936:2: iv_ruleDroite= ruleDroite EOF
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
    // InternalDroneDSLLib.g:942:1: ruleDroite returns [EObject current=null] : (otherlv_0= 'droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) ;
    public final EObject ruleDroite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duree_1_0 = null;

        EObject lv_vitesse_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:948:2: ( (otherlv_0= 'droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) )
            // InternalDroneDSLLib.g:949:2: (otherlv_0= 'droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            {
            // InternalDroneDSLLib.g:949:2: (otherlv_0= 'droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            // InternalDroneDSLLib.g:950:3: otherlv_0= 'droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDroiteAccess().getDroiteKeyword_0());
            		
            // InternalDroneDSLLib.g:954:3: ( (lv_duree_1_0= ruleSecondeExp ) )
            // InternalDroneDSLLib.g:955:4: (lv_duree_1_0= ruleSecondeExp )
            {
            // InternalDroneDSLLib.g:955:4: (lv_duree_1_0= ruleSecondeExp )
            // InternalDroneDSLLib.g:956:5: lv_duree_1_0= ruleSecondeExp
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

            otherlv_2=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDroiteAccess().getCommaKeyword_2());
            		
            // InternalDroneDSLLib.g:977:3: ( (lv_vitesse_3_0= rulePourcentExp ) )
            // InternalDroneDSLLib.g:978:4: (lv_vitesse_3_0= rulePourcentExp )
            {
            // InternalDroneDSLLib.g:978:4: (lv_vitesse_3_0= rulePourcentExp )
            // InternalDroneDSLLib.g:979:5: lv_vitesse_3_0= rulePourcentExp
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

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

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
    // InternalDroneDSLLib.g:1004:1: entryRuleRotationGauche returns [EObject current=null] : iv_ruleRotationGauche= ruleRotationGauche EOF ;
    public final EObject entryRuleRotationGauche() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotationGauche = null;


        try {
            // InternalDroneDSLLib.g:1004:55: (iv_ruleRotationGauche= ruleRotationGauche EOF )
            // InternalDroneDSLLib.g:1005:2: iv_ruleRotationGauche= ruleRotationGauche EOF
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
    // InternalDroneDSLLib.g:1011:1: ruleRotationGauche returns [EObject current=null] : (otherlv_0= 'rotation_gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) ;
    public final EObject ruleRotationGauche() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duree_1_0 = null;

        EObject lv_vitesse_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:1017:2: ( (otherlv_0= 'rotation_gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) )
            // InternalDroneDSLLib.g:1018:2: (otherlv_0= 'rotation_gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            {
            // InternalDroneDSLLib.g:1018:2: (otherlv_0= 'rotation_gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            // InternalDroneDSLLib.g:1019:3: otherlv_0= 'rotation_gauche(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getRotationGaucheAccess().getRotation_gaucheKeyword_0());
            		
            // InternalDroneDSLLib.g:1023:3: ( (lv_duree_1_0= ruleSecondeExp ) )
            // InternalDroneDSLLib.g:1024:4: (lv_duree_1_0= ruleSecondeExp )
            {
            // InternalDroneDSLLib.g:1024:4: (lv_duree_1_0= ruleSecondeExp )
            // InternalDroneDSLLib.g:1025:5: lv_duree_1_0= ruleSecondeExp
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

            otherlv_2=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getRotationGaucheAccess().getCommaKeyword_2());
            		
            // InternalDroneDSLLib.g:1046:3: ( (lv_vitesse_3_0= rulePourcentExp ) )
            // InternalDroneDSLLib.g:1047:4: (lv_vitesse_3_0= rulePourcentExp )
            {
            // InternalDroneDSLLib.g:1047:4: (lv_vitesse_3_0= rulePourcentExp )
            // InternalDroneDSLLib.g:1048:5: lv_vitesse_3_0= rulePourcentExp
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

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

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
    // InternalDroneDSLLib.g:1073:1: entryRuleRotationDroite returns [EObject current=null] : iv_ruleRotationDroite= ruleRotationDroite EOF ;
    public final EObject entryRuleRotationDroite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotationDroite = null;


        try {
            // InternalDroneDSLLib.g:1073:55: (iv_ruleRotationDroite= ruleRotationDroite EOF )
            // InternalDroneDSLLib.g:1074:2: iv_ruleRotationDroite= ruleRotationDroite EOF
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
    // InternalDroneDSLLib.g:1080:1: ruleRotationDroite returns [EObject current=null] : (otherlv_0= 'rotation_droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) ;
    public final EObject ruleRotationDroite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_duree_1_0 = null;

        EObject lv_vitesse_3_0 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:1086:2: ( (otherlv_0= 'rotation_droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' ) )
            // InternalDroneDSLLib.g:1087:2: (otherlv_0= 'rotation_droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            {
            // InternalDroneDSLLib.g:1087:2: (otherlv_0= 'rotation_droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')' )
            // InternalDroneDSLLib.g:1088:3: otherlv_0= 'rotation_droite(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ',' ( (lv_vitesse_3_0= rulePourcentExp ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getRotationDroiteAccess().getRotation_droiteKeyword_0());
            		
            // InternalDroneDSLLib.g:1092:3: ( (lv_duree_1_0= ruleSecondeExp ) )
            // InternalDroneDSLLib.g:1093:4: (lv_duree_1_0= ruleSecondeExp )
            {
            // InternalDroneDSLLib.g:1093:4: (lv_duree_1_0= ruleSecondeExp )
            // InternalDroneDSLLib.g:1094:5: lv_duree_1_0= ruleSecondeExp
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

            otherlv_2=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getRotationDroiteAccess().getCommaKeyword_2());
            		
            // InternalDroneDSLLib.g:1115:3: ( (lv_vitesse_3_0= rulePourcentExp ) )
            // InternalDroneDSLLib.g:1116:4: (lv_vitesse_3_0= rulePourcentExp )
            {
            // InternalDroneDSLLib.g:1116:4: (lv_vitesse_3_0= rulePourcentExp )
            // InternalDroneDSLLib.g:1117:5: lv_vitesse_3_0= rulePourcentExp
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

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

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
    // InternalDroneDSLLib.g:1142:1: entryRulePause returns [EObject current=null] : iv_rulePause= rulePause EOF ;
    public final EObject entryRulePause() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePause = null;


        try {
            // InternalDroneDSLLib.g:1142:46: (iv_rulePause= rulePause EOF )
            // InternalDroneDSLLib.g:1143:2: iv_rulePause= rulePause EOF
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
    // InternalDroneDSLLib.g:1149:1: rulePause returns [EObject current=null] : (otherlv_0= 'pause(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ')' ) ;
    public final EObject rulePause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_duree_1_0 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:1155:2: ( (otherlv_0= 'pause(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ')' ) )
            // InternalDroneDSLLib.g:1156:2: (otherlv_0= 'pause(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ')' )
            {
            // InternalDroneDSLLib.g:1156:2: (otherlv_0= 'pause(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ')' )
            // InternalDroneDSLLib.g:1157:3: otherlv_0= 'pause(' ( (lv_duree_1_0= ruleSecondeExp ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPauseAccess().getPauseKeyword_0());
            		
            // InternalDroneDSLLib.g:1161:3: ( (lv_duree_1_0= ruleSecondeExp ) )
            // InternalDroneDSLLib.g:1162:4: (lv_duree_1_0= ruleSecondeExp )
            {
            // InternalDroneDSLLib.g:1162:4: (lv_duree_1_0= ruleSecondeExp )
            // InternalDroneDSLLib.g:1163:5: lv_duree_1_0= ruleSecondeExp
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

            otherlv_2=(Token)match(input,21,FOLLOW_2); 

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
    // InternalDroneDSLLib.g:1188:1: entryRuleDecollerAtterrir returns [EObject current=null] : iv_ruleDecollerAtterrir= ruleDecollerAtterrir EOF ;
    public final EObject entryRuleDecollerAtterrir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecollerAtterrir = null;


        try {
            // InternalDroneDSLLib.g:1188:57: (iv_ruleDecollerAtterrir= ruleDecollerAtterrir EOF )
            // InternalDroneDSLLib.g:1189:2: iv_ruleDecollerAtterrir= ruleDecollerAtterrir EOF
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
    // InternalDroneDSLLib.g:1195:1: ruleDecollerAtterrir returns [EObject current=null] : (this_Decoller_0= ruleDecoller | this_Atterrir_1= ruleAtterrir ) ;
    public final EObject ruleDecollerAtterrir() throws RecognitionException {
        EObject current = null;

        EObject this_Decoller_0 = null;

        EObject this_Atterrir_1 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:1201:2: ( (this_Decoller_0= ruleDecoller | this_Atterrir_1= ruleAtterrir ) )
            // InternalDroneDSLLib.g:1202:2: (this_Decoller_0= ruleDecoller | this_Atterrir_1= ruleAtterrir )
            {
            // InternalDroneDSLLib.g:1202:2: (this_Decoller_0= ruleDecoller | this_Atterrir_1= ruleAtterrir )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDroneDSLLib.g:1203:3: this_Decoller_0= ruleDecoller
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
                    // InternalDroneDSLLib.g:1212:3: this_Atterrir_1= ruleAtterrir
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
    // InternalDroneDSLLib.g:1224:1: entryRuleCommandeBasique returns [EObject current=null] : iv_ruleCommandeBasique= ruleCommandeBasique EOF ;
    public final EObject entryRuleCommandeBasique() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommandeBasique = null;


        try {
            // InternalDroneDSLLib.g:1224:56: (iv_ruleCommandeBasique= ruleCommandeBasique EOF )
            // InternalDroneDSLLib.g:1225:2: iv_ruleCommandeBasique= ruleCommandeBasique EOF
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
    // InternalDroneDSLLib.g:1231:1: ruleCommandeBasique returns [EObject current=null] : (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer | this_Monter_2= ruleMonter | this_Descendre_3= ruleDescendre | this_Gauche_4= ruleGauche | this_Droite_5= ruleDroite | this_RotationGauche_6= ruleRotationGauche | this_RotationDroite_7= ruleRotationDroite | this_Pause_8= rulePause ) ;
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
            // InternalDroneDSLLib.g:1237:2: ( (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer | this_Monter_2= ruleMonter | this_Descendre_3= ruleDescendre | this_Gauche_4= ruleGauche | this_Droite_5= ruleDroite | this_RotationGauche_6= ruleRotationGauche | this_RotationDroite_7= ruleRotationDroite | this_Pause_8= rulePause ) )
            // InternalDroneDSLLib.g:1238:2: (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer | this_Monter_2= ruleMonter | this_Descendre_3= ruleDescendre | this_Gauche_4= ruleGauche | this_Droite_5= ruleDroite | this_RotationGauche_6= ruleRotationGauche | this_RotationDroite_7= ruleRotationDroite | this_Pause_8= rulePause )
            {
            // InternalDroneDSLLib.g:1238:2: (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer | this_Monter_2= ruleMonter | this_Descendre_3= ruleDescendre | this_Gauche_4= ruleGauche | this_Droite_5= ruleDroite | this_RotationGauche_6= ruleRotationGauche | this_RotationDroite_7= ruleRotationDroite | this_Pause_8= rulePause )
            int alt6=9;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt6=1;
                }
                break;
            case 24:
                {
                alt6=2;
                }
                break;
            case 19:
                {
                alt6=3;
                }
                break;
            case 22:
                {
                alt6=4;
                }
                break;
            case 25:
                {
                alt6=5;
                }
                break;
            case 26:
                {
                alt6=6;
                }
                break;
            case 27:
                {
                alt6=7;
                }
                break;
            case 28:
                {
                alt6=8;
                }
                break;
            case 29:
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
                    // InternalDroneDSLLib.g:1239:3: this_Avancer_0= ruleAvancer
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
                    // InternalDroneDSLLib.g:1248:3: this_Reculer_1= ruleReculer
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
                    // InternalDroneDSLLib.g:1257:3: this_Monter_2= ruleMonter
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
                    // InternalDroneDSLLib.g:1266:3: this_Descendre_3= ruleDescendre
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
                    // InternalDroneDSLLib.g:1275:3: this_Gauche_4= ruleGauche
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
                    // InternalDroneDSLLib.g:1284:3: this_Droite_5= ruleDroite
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
                    // InternalDroneDSLLib.g:1293:3: this_RotationGauche_6= ruleRotationGauche
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
                    // InternalDroneDSLLib.g:1302:3: this_RotationDroite_7= ruleRotationDroite
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
                    // InternalDroneDSLLib.g:1311:3: this_Pause_8= rulePause
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
    // InternalDroneDSLLib.g:1323:1: entryRuleFonctionDecl returns [EObject current=null] : iv_ruleFonctionDecl= ruleFonctionDecl EOF ;
    public final EObject entryRuleFonctionDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFonctionDecl = null;


        try {
            // InternalDroneDSLLib.g:1323:53: (iv_ruleFonctionDecl= ruleFonctionDecl EOF )
            // InternalDroneDSLLib.g:1324:2: iv_ruleFonctionDecl= ruleFonctionDecl EOF
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
    // InternalDroneDSLLib.g:1330:1: ruleFonctionDecl returns [EObject current=null] : (otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= '{' ( ( (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir ) ) )* otherlv_5= '}' ) ;
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
            // InternalDroneDSLLib.g:1336:2: ( (otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= '{' ( ( (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir ) ) )* otherlv_5= '}' ) )
            // InternalDroneDSLLib.g:1337:2: (otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= '{' ( ( (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir ) ) )* otherlv_5= '}' )
            {
            // InternalDroneDSLLib.g:1337:2: (otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= '{' ( ( (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir ) ) )* otherlv_5= '}' )
            // InternalDroneDSLLib.g:1338:3: otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '()' otherlv_3= '{' ( ( (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFonctionDeclAccess().getFuncKeyword_0());
            		
            // InternalDroneDSLLib.g:1342:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDroneDSLLib.g:1343:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDroneDSLLib.g:1343:4: (lv_name_1_0= RULE_ID )
            // InternalDroneDSLLib.g:1344:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,31,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getFonctionDeclAccess().getLeftParenthesisRightParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,32,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getFonctionDeclAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDroneDSLLib.g:1368:3: ( ( (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==14||(LA8_0>=16 && LA8_0<=19)||(LA8_0>=22 && LA8_0<=29)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDroneDSLLib.g:1369:4: ( (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir ) )
            	    {
            	    // InternalDroneDSLLib.g:1369:4: ( (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir ) )
            	    // InternalDroneDSLLib.g:1370:5: (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir )
            	    {
            	    // InternalDroneDSLLib.g:1370:5: (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir )
            	    int alt7=5;
            	    alt7 = dfa7.predict(input);
            	    switch (alt7) {
            	        case 1 :
            	            // InternalDroneDSLLib.g:1371:6: lv_body_4_1= ruleVarDecl
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
            	            // InternalDroneDSLLib.g:1387:6: lv_body_4_2= ruleCommandeBasique
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
            	            // InternalDroneDSLLib.g:1403:6: lv_body_4_3= ruleParallele
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
            	            // InternalDroneDSLLib.g:1419:6: lv_body_4_4= ruleFonctionCall
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
            	            // InternalDroneDSLLib.g:1435:6: lv_body_4_5= ruleDecollerAtterrir
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

            otherlv_5=(Token)match(input,33,FOLLOW_2); 

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
    // InternalDroneDSLLib.g:1461:1: entryRuleFonctionCall returns [EObject current=null] : iv_ruleFonctionCall= ruleFonctionCall EOF ;
    public final EObject entryRuleFonctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFonctionCall = null;


        try {
            // InternalDroneDSLLib.g:1461:53: (iv_ruleFonctionCall= ruleFonctionCall EOF )
            // InternalDroneDSLLib.g:1462:2: iv_ruleFonctionCall= ruleFonctionCall EOF
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
    // InternalDroneDSLLib.g:1468:1: ruleFonctionCall returns [EObject current=null] : this_FonctionCallInterne_0= ruleFonctionCallInterne ;
    public final EObject ruleFonctionCall() throws RecognitionException {
        EObject current = null;

        EObject this_FonctionCallInterne_0 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:1474:2: (this_FonctionCallInterne_0= ruleFonctionCallInterne )
            // InternalDroneDSLLib.g:1475:2: this_FonctionCallInterne_0= ruleFonctionCallInterne
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
    // InternalDroneDSLLib.g:1486:1: entryRuleFonctionCallInterne returns [EObject current=null] : iv_ruleFonctionCallInterne= ruleFonctionCallInterne EOF ;
    public final EObject entryRuleFonctionCallInterne() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFonctionCallInterne = null;


        try {
            // InternalDroneDSLLib.g:1486:60: (iv_ruleFonctionCallInterne= ruleFonctionCallInterne EOF )
            // InternalDroneDSLLib.g:1487:2: iv_ruleFonctionCallInterne= ruleFonctionCallInterne EOF
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
    // InternalDroneDSLLib.g:1493:1: ruleFonctionCallInterne returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '()' ) ;
    public final EObject ruleFonctionCallInterne() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDroneDSLLib.g:1499:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '()' ) )
            // InternalDroneDSLLib.g:1500:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '()' )
            {
            // InternalDroneDSLLib.g:1500:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '()' )
            // InternalDroneDSLLib.g:1501:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '()'
            {
            // InternalDroneDSLLib.g:1501:3: ( (otherlv_0= RULE_ID ) )
            // InternalDroneDSLLib.g:1502:4: (otherlv_0= RULE_ID )
            {
            // InternalDroneDSLLib.g:1502:4: (otherlv_0= RULE_ID )
            // InternalDroneDSLLib.g:1503:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFonctionCallInterneRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_0, grammarAccess.getFonctionCallInterneAccess().getRefFonctionDeclCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_2); 

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
    // InternalDroneDSLLib.g:1522:1: entryRuleMD returns [EObject current=null] : iv_ruleMD= ruleMD EOF ;
    public final EObject entryRuleMD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMD = null;


        try {
            // InternalDroneDSLLib.g:1522:43: (iv_ruleMD= ruleMD EOF )
            // InternalDroneDSLLib.g:1523:2: iv_ruleMD= ruleMD EOF
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
    // InternalDroneDSLLib.g:1529:1: ruleMD returns [EObject current=null] : (this_Monter_0= ruleMonter | this_Descendre_1= ruleDescendre ) ;
    public final EObject ruleMD() throws RecognitionException {
        EObject current = null;

        EObject this_Monter_0 = null;

        EObject this_Descendre_1 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:1535:2: ( (this_Monter_0= ruleMonter | this_Descendre_1= ruleDescendre ) )
            // InternalDroneDSLLib.g:1536:2: (this_Monter_0= ruleMonter | this_Descendre_1= ruleDescendre )
            {
            // InternalDroneDSLLib.g:1536:2: (this_Monter_0= ruleMonter | this_Descendre_1= ruleDescendre )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            else if ( (LA9_0==22) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDroneDSLLib.g:1537:3: this_Monter_0= ruleMonter
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
                    // InternalDroneDSLLib.g:1546:3: this_Descendre_1= ruleDescendre
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
    // InternalDroneDSLLib.g:1558:1: entryRuleGDr returns [EObject current=null] : iv_ruleGDr= ruleGDr EOF ;
    public final EObject entryRuleGDr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGDr = null;


        try {
            // InternalDroneDSLLib.g:1558:44: (iv_ruleGDr= ruleGDr EOF )
            // InternalDroneDSLLib.g:1559:2: iv_ruleGDr= ruleGDr EOF
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
    // InternalDroneDSLLib.g:1565:1: ruleGDr returns [EObject current=null] : (this_Gauche_0= ruleGauche | this_Droite_1= ruleDroite ) ;
    public final EObject ruleGDr() throws RecognitionException {
        EObject current = null;

        EObject this_Gauche_0 = null;

        EObject this_Droite_1 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:1571:2: ( (this_Gauche_0= ruleGauche | this_Droite_1= ruleDroite ) )
            // InternalDroneDSLLib.g:1572:2: (this_Gauche_0= ruleGauche | this_Droite_1= ruleDroite )
            {
            // InternalDroneDSLLib.g:1572:2: (this_Gauche_0= ruleGauche | this_Droite_1= ruleDroite )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            else if ( (LA10_0==26) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDroneDSLLib.g:1573:3: this_Gauche_0= ruleGauche
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
                    // InternalDroneDSLLib.g:1582:3: this_Droite_1= ruleDroite
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
    // InternalDroneDSLLib.g:1594:1: entryRuleRGRD returns [EObject current=null] : iv_ruleRGRD= ruleRGRD EOF ;
    public final EObject entryRuleRGRD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRGRD = null;


        try {
            // InternalDroneDSLLib.g:1594:45: (iv_ruleRGRD= ruleRGRD EOF )
            // InternalDroneDSLLib.g:1595:2: iv_ruleRGRD= ruleRGRD EOF
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
    // InternalDroneDSLLib.g:1601:1: ruleRGRD returns [EObject current=null] : (this_RotationGauche_0= ruleRotationGauche | this_RotationDroite_1= ruleRotationDroite ) ;
    public final EObject ruleRGRD() throws RecognitionException {
        EObject current = null;

        EObject this_RotationGauche_0 = null;

        EObject this_RotationDroite_1 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:1607:2: ( (this_RotationGauche_0= ruleRotationGauche | this_RotationDroite_1= ruleRotationDroite ) )
            // InternalDroneDSLLib.g:1608:2: (this_RotationGauche_0= ruleRotationGauche | this_RotationDroite_1= ruleRotationDroite )
            {
            // InternalDroneDSLLib.g:1608:2: (this_RotationGauche_0= ruleRotationGauche | this_RotationDroite_1= ruleRotationDroite )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            else if ( (LA11_0==28) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalDroneDSLLib.g:1609:3: this_RotationGauche_0= ruleRotationGauche
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
                    // InternalDroneDSLLib.g:1618:3: this_RotationDroite_1= ruleRotationDroite
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
    // InternalDroneDSLLib.g:1630:1: entryRuleAR returns [EObject current=null] : iv_ruleAR= ruleAR EOF ;
    public final EObject entryRuleAR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAR = null;


        try {
            // InternalDroneDSLLib.g:1630:43: (iv_ruleAR= ruleAR EOF )
            // InternalDroneDSLLib.g:1631:2: iv_ruleAR= ruleAR EOF
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
    // InternalDroneDSLLib.g:1637:1: ruleAR returns [EObject current=null] : (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer ) ;
    public final EObject ruleAR() throws RecognitionException {
        EObject current = null;

        EObject this_Avancer_0 = null;

        EObject this_Reculer_1 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:1643:2: ( (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer ) )
            // InternalDroneDSLLib.g:1644:2: (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer )
            {
            // InternalDroneDSLLib.g:1644:2: (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            else if ( (LA12_0==24) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalDroneDSLLib.g:1645:3: this_Avancer_0= ruleAvancer
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
                    // InternalDroneDSLLib.g:1654:3: this_Reculer_1= ruleReculer
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
    // InternalDroneDSLLib.g:1666:1: entryRuleParallele returns [EObject current=null] : iv_ruleParallele= ruleParallele EOF ;
    public final EObject entryRuleParallele() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallele = null;


        try {
            // InternalDroneDSLLib.g:1666:50: (iv_ruleParallele= ruleParallele EOF )
            // InternalDroneDSLLib.g:1667:2: iv_ruleParallele= ruleParallele EOF
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
    // InternalDroneDSLLib.g:1673:1: ruleParallele returns [EObject current=null] : (this_Parallele2_0= ruleParallele2 | this_Parallele3_1= ruleParallele3 | this_Parallele4_2= ruleParallele4 ) ;
    public final EObject ruleParallele() throws RecognitionException {
        EObject current = null;

        EObject this_Parallele2_0 = null;

        EObject this_Parallele3_1 = null;

        EObject this_Parallele4_2 = null;



        	enterRule();

        try {
            // InternalDroneDSLLib.g:1679:2: ( (this_Parallele2_0= ruleParallele2 | this_Parallele3_1= ruleParallele3 | this_Parallele4_2= ruleParallele4 ) )
            // InternalDroneDSLLib.g:1680:2: (this_Parallele2_0= ruleParallele2 | this_Parallele3_1= ruleParallele3 | this_Parallele4_2= ruleParallele4 )
            {
            // InternalDroneDSLLib.g:1680:2: (this_Parallele2_0= ruleParallele2 | this_Parallele3_1= ruleParallele3 | this_Parallele4_2= ruleParallele4 )
            int alt13=3;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalDroneDSLLib.g:1681:3: this_Parallele2_0= ruleParallele2
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
                    // InternalDroneDSLLib.g:1690:3: this_Parallele3_1= ruleParallele3
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
                    // InternalDroneDSLLib.g:1699:3: this_Parallele4_2= ruleParallele4
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
    // InternalDroneDSLLib.g:1711:1: entryRuleParallele2 returns [EObject current=null] : iv_ruleParallele2= ruleParallele2 EOF ;
    public final EObject entryRuleParallele2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallele2 = null;


        try {
            // InternalDroneDSLLib.g:1711:51: (iv_ruleParallele2= ruleParallele2 EOF )
            // InternalDroneDSLLib.g:1712:2: iv_ruleParallele2= ruleParallele2 EOF
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
    // InternalDroneDSLLib.g:1718:1: ruleParallele2 returns [EObject current=null] : ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) ) ;
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
            // InternalDroneDSLLib.g:1724:2: ( ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) ) )
            // InternalDroneDSLLib.g:1725:2: ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) )
            {
            // InternalDroneDSLLib.g:1725:2: ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) )
            int alt14=12;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalDroneDSLLib.g:1726:3: ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSLLib.g:1726:3: ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) )
                    // InternalDroneDSLLib.g:1727:4: ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) )
                    {
                    // InternalDroneDSLLib.g:1727:4: ( (lv_a_0_0= ruleMD ) )
                    // InternalDroneDSLLib.g:1728:5: (lv_a_0_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:1728:5: (lv_a_0_0= ruleMD )
                    // InternalDroneDSLLib.g:1729:6: lv_a_0_0= ruleMD
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

                    otherlv_1=(Token)match(input,34,FOLLOW_16); 

                    				newLeafNode(otherlv_1, grammarAccess.getParallele2Access().getAmpersandKeyword_0_1());
                    			
                    // InternalDroneDSLLib.g:1750:4: ( (lv_t_2_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:1751:5: (lv_t_2_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:1751:5: (lv_t_2_0= ruleGDr )
                    // InternalDroneDSLLib.g:1752:6: lv_t_2_0= ruleGDr
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
                    // InternalDroneDSLLib.g:1771:3: ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) )
                    {
                    // InternalDroneDSLLib.g:1771:3: ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) )
                    // InternalDroneDSLLib.g:1772:4: ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) )
                    {
                    // InternalDroneDSLLib.g:1772:4: ( (lv_a_3_0= ruleMD ) )
                    // InternalDroneDSLLib.g:1773:5: (lv_a_3_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:1773:5: (lv_a_3_0= ruleMD )
                    // InternalDroneDSLLib.g:1774:6: lv_a_3_0= ruleMD
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

                    otherlv_4=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getParallele2Access().getAmpersandKeyword_1_1());
                    			
                    // InternalDroneDSLLib.g:1795:4: ( (lv_t_5_0= ruleAR ) )
                    // InternalDroneDSLLib.g:1796:5: (lv_t_5_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:1796:5: (lv_t_5_0= ruleAR )
                    // InternalDroneDSLLib.g:1797:6: lv_t_5_0= ruleAR
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
                    // InternalDroneDSLLib.g:1816:3: ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSLLib.g:1816:3: ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) )
                    // InternalDroneDSLLib.g:1817:4: ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) )
                    {
                    // InternalDroneDSLLib.g:1817:4: ( (lv_a_6_0= ruleMD ) )
                    // InternalDroneDSLLib.g:1818:5: (lv_a_6_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:1818:5: (lv_a_6_0= ruleMD )
                    // InternalDroneDSLLib.g:1819:6: lv_a_6_0= ruleMD
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

                    otherlv_7=(Token)match(input,34,FOLLOW_18); 

                    				newLeafNode(otherlv_7, grammarAccess.getParallele2Access().getAmpersandKeyword_2_1());
                    			
                    // InternalDroneDSLLib.g:1840:4: ( (lv_t_8_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:1841:5: (lv_t_8_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:1841:5: (lv_t_8_0= ruleRGRD )
                    // InternalDroneDSLLib.g:1842:6: lv_t_8_0= ruleRGRD
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
                    // InternalDroneDSLLib.g:1861:3: ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) )
                    {
                    // InternalDroneDSLLib.g:1861:3: ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) )
                    // InternalDroneDSLLib.g:1862:4: ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) )
                    {
                    // InternalDroneDSLLib.g:1862:4: ( (lv_t_9_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:1863:5: (lv_t_9_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:1863:5: (lv_t_9_0= ruleGDr )
                    // InternalDroneDSLLib.g:1864:6: lv_t_9_0= ruleGDr
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

                    otherlv_10=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_10, grammarAccess.getParallele2Access().getAmpersandKeyword_3_1());
                    			
                    // InternalDroneDSLLib.g:1885:4: ( (lv_b_11_0= ruleAR ) )
                    // InternalDroneDSLLib.g:1886:5: (lv_b_11_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:1886:5: (lv_b_11_0= ruleAR )
                    // InternalDroneDSLLib.g:1887:6: lv_b_11_0= ruleAR
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
                    // InternalDroneDSLLib.g:1906:3: ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) )
                    {
                    // InternalDroneDSLLib.g:1906:3: ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) )
                    // InternalDroneDSLLib.g:1907:4: ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) )
                    {
                    // InternalDroneDSLLib.g:1907:4: ( (lv_t_12_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:1908:5: (lv_t_12_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:1908:5: (lv_t_12_0= ruleGDr )
                    // InternalDroneDSLLib.g:1909:6: lv_t_12_0= ruleGDr
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

                    otherlv_13=(Token)match(input,34,FOLLOW_19); 

                    				newLeafNode(otherlv_13, grammarAccess.getParallele2Access().getAmpersandKeyword_4_1());
                    			
                    // InternalDroneDSLLib.g:1930:4: ( (lv_b_14_0= ruleMD ) )
                    // InternalDroneDSLLib.g:1931:5: (lv_b_14_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:1931:5: (lv_b_14_0= ruleMD )
                    // InternalDroneDSLLib.g:1932:6: lv_b_14_0= ruleMD
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
                    // InternalDroneDSLLib.g:1951:3: ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSLLib.g:1951:3: ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) )
                    // InternalDroneDSLLib.g:1952:4: ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) )
                    {
                    // InternalDroneDSLLib.g:1952:4: ( (lv_t_15_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:1953:5: (lv_t_15_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:1953:5: (lv_t_15_0= ruleGDr )
                    // InternalDroneDSLLib.g:1954:6: lv_t_15_0= ruleGDr
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

                    otherlv_16=(Token)match(input,34,FOLLOW_18); 

                    				newLeafNode(otherlv_16, grammarAccess.getParallele2Access().getAmpersandKeyword_5_1());
                    			
                    // InternalDroneDSLLib.g:1975:4: ( (lv_b_17_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:1976:5: (lv_b_17_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:1976:5: (lv_b_17_0= ruleRGRD )
                    // InternalDroneDSLLib.g:1977:6: lv_b_17_0= ruleRGRD
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
                    // InternalDroneDSLLib.g:1996:3: ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) )
                    {
                    // InternalDroneDSLLib.g:1996:3: ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) )
                    // InternalDroneDSLLib.g:1997:4: ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) )
                    {
                    // InternalDroneDSLLib.g:1997:4: ( (lv_t_18_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:1998:5: (lv_t_18_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:1998:5: (lv_t_18_0= ruleRGRD )
                    // InternalDroneDSLLib.g:1999:6: lv_t_18_0= ruleRGRD
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

                    otherlv_19=(Token)match(input,34,FOLLOW_19); 

                    				newLeafNode(otherlv_19, grammarAccess.getParallele2Access().getAmpersandKeyword_6_1());
                    			
                    // InternalDroneDSLLib.g:2020:4: ( (lv_a_20_0= ruleMD ) )
                    // InternalDroneDSLLib.g:2021:5: (lv_a_20_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:2021:5: (lv_a_20_0= ruleMD )
                    // InternalDroneDSLLib.g:2022:6: lv_a_20_0= ruleMD
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
                    // InternalDroneDSLLib.g:2041:3: ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) )
                    {
                    // InternalDroneDSLLib.g:2041:3: ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) )
                    // InternalDroneDSLLib.g:2042:4: ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) )
                    {
                    // InternalDroneDSLLib.g:2042:4: ( (lv_t_21_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:2043:5: (lv_t_21_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:2043:5: (lv_t_21_0= ruleRGRD )
                    // InternalDroneDSLLib.g:2044:6: lv_t_21_0= ruleRGRD
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

                    otherlv_22=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_22, grammarAccess.getParallele2Access().getAmpersandKeyword_7_1());
                    			
                    // InternalDroneDSLLib.g:2065:4: ( (lv_a_23_0= ruleAR ) )
                    // InternalDroneDSLLib.g:2066:5: (lv_a_23_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:2066:5: (lv_a_23_0= ruleAR )
                    // InternalDroneDSLLib.g:2067:6: lv_a_23_0= ruleAR
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
                    // InternalDroneDSLLib.g:2086:3: ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSLLib.g:2086:3: ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) )
                    // InternalDroneDSLLib.g:2087:4: ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) )
                    {
                    // InternalDroneDSLLib.g:2087:4: ( (lv_t_24_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:2088:5: (lv_t_24_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:2088:5: (lv_t_24_0= ruleRGRD )
                    // InternalDroneDSLLib.g:2089:6: lv_t_24_0= ruleRGRD
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

                    otherlv_25=(Token)match(input,34,FOLLOW_16); 

                    				newLeafNode(otherlv_25, grammarAccess.getParallele2Access().getAmpersandKeyword_8_1());
                    			
                    // InternalDroneDSLLib.g:2110:4: ( (lv_a_26_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:2111:5: (lv_a_26_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:2111:5: (lv_a_26_0= ruleGDr )
                    // InternalDroneDSLLib.g:2112:6: lv_a_26_0= ruleGDr
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
                    // InternalDroneDSLLib.g:2131:3: ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) )
                    {
                    // InternalDroneDSLLib.g:2131:3: ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) )
                    // InternalDroneDSLLib.g:2132:4: ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) )
                    {
                    // InternalDroneDSLLib.g:2132:4: ( (lv_t_27_0= ruleAR ) )
                    // InternalDroneDSLLib.g:2133:5: (lv_t_27_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:2133:5: (lv_t_27_0= ruleAR )
                    // InternalDroneDSLLib.g:2134:6: lv_t_27_0= ruleAR
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

                    otherlv_28=(Token)match(input,34,FOLLOW_19); 

                    				newLeafNode(otherlv_28, grammarAccess.getParallele2Access().getAmpersandKeyword_9_1());
                    			
                    // InternalDroneDSLLib.g:2155:4: ( (lv_a_29_0= ruleMD ) )
                    // InternalDroneDSLLib.g:2156:5: (lv_a_29_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:2156:5: (lv_a_29_0= ruleMD )
                    // InternalDroneDSLLib.g:2157:6: lv_a_29_0= ruleMD
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
                    // InternalDroneDSLLib.g:2176:3: ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSLLib.g:2176:3: ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) )
                    // InternalDroneDSLLib.g:2177:4: ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) )
                    {
                    // InternalDroneDSLLib.g:2177:4: ( (lv_t_30_0= ruleAR ) )
                    // InternalDroneDSLLib.g:2178:5: (lv_t_30_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:2178:5: (lv_t_30_0= ruleAR )
                    // InternalDroneDSLLib.g:2179:6: lv_t_30_0= ruleAR
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

                    otherlv_31=(Token)match(input,34,FOLLOW_18); 

                    				newLeafNode(otherlv_31, grammarAccess.getParallele2Access().getAmpersandKeyword_10_1());
                    			
                    // InternalDroneDSLLib.g:2200:4: ( (lv_a_32_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:2201:5: (lv_a_32_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:2201:5: (lv_a_32_0= ruleRGRD )
                    // InternalDroneDSLLib.g:2202:6: lv_a_32_0= ruleRGRD
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
                    // InternalDroneDSLLib.g:2221:3: ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSLLib.g:2221:3: ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) )
                    // InternalDroneDSLLib.g:2222:4: ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) )
                    {
                    // InternalDroneDSLLib.g:2222:4: ( (lv_t_33_0= ruleAR ) )
                    // InternalDroneDSLLib.g:2223:5: (lv_t_33_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:2223:5: (lv_t_33_0= ruleAR )
                    // InternalDroneDSLLib.g:2224:6: lv_t_33_0= ruleAR
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

                    otherlv_34=(Token)match(input,34,FOLLOW_16); 

                    				newLeafNode(otherlv_34, grammarAccess.getParallele2Access().getAmpersandKeyword_11_1());
                    			
                    // InternalDroneDSLLib.g:2245:4: ( (lv_a_35_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:2246:5: (lv_a_35_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:2246:5: (lv_a_35_0= ruleGDr )
                    // InternalDroneDSLLib.g:2247:6: lv_a_35_0= ruleGDr
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
    // InternalDroneDSLLib.g:2269:1: entryRuleParallele3 returns [EObject current=null] : iv_ruleParallele3= ruleParallele3 EOF ;
    public final EObject entryRuleParallele3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallele3 = null;


        try {
            // InternalDroneDSLLib.g:2269:51: (iv_ruleParallele3= ruleParallele3 EOF )
            // InternalDroneDSLLib.g:2270:2: iv_ruleParallele3= ruleParallele3 EOF
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
    // InternalDroneDSLLib.g:2276:1: ruleParallele3 returns [EObject current=null] : ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) ) ;
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
            // InternalDroneDSLLib.g:2282:2: ( ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) ) )
            // InternalDroneDSLLib.g:2283:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) )
            {
            // InternalDroneDSLLib.g:2283:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) )
            int alt15=24;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalDroneDSLLib.g:2284:3: ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) )
                    {
                    // InternalDroneDSLLib.g:2284:3: ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) )
                    // InternalDroneDSLLib.g:2285:4: ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) )
                    {
                    // InternalDroneDSLLib.g:2285:4: ( (lv_a_0_0= ruleAR ) )
                    // InternalDroneDSLLib.g:2286:5: (lv_a_0_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:2286:5: (lv_a_0_0= ruleAR )
                    // InternalDroneDSLLib.g:2287:6: lv_a_0_0= ruleAR
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

                    otherlv_1=(Token)match(input,34,FOLLOW_16); 

                    				newLeafNode(otherlv_1, grammarAccess.getParallele3Access().getAmpersandKeyword_0_1());
                    			
                    // InternalDroneDSLLib.g:2308:4: ( (lv_b_2_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:2309:5: (lv_b_2_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:2309:5: (lv_b_2_0= ruleGDr )
                    // InternalDroneDSLLib.g:2310:6: lv_b_2_0= ruleGDr
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

                    otherlv_3=(Token)match(input,34,FOLLOW_19); 

                    				newLeafNode(otherlv_3, grammarAccess.getParallele3Access().getAmpersandKeyword_0_3());
                    			
                    // InternalDroneDSLLib.g:2331:4: ( (lv_c_4_0= ruleMD ) )
                    // InternalDroneDSLLib.g:2332:5: (lv_c_4_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:2332:5: (lv_c_4_0= ruleMD )
                    // InternalDroneDSLLib.g:2333:6: lv_c_4_0= ruleMD
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
                    // InternalDroneDSLLib.g:2352:3: ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSLLib.g:2352:3: ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) )
                    // InternalDroneDSLLib.g:2353:4: ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) )
                    {
                    // InternalDroneDSLLib.g:2353:4: ( (lv_a_5_0= ruleAR ) )
                    // InternalDroneDSLLib.g:2354:5: (lv_a_5_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:2354:5: (lv_a_5_0= ruleAR )
                    // InternalDroneDSLLib.g:2355:6: lv_a_5_0= ruleAR
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

                    otherlv_6=(Token)match(input,34,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getParallele3Access().getAmpersandKeyword_1_1());
                    			
                    // InternalDroneDSLLib.g:2376:4: ( (lv_b_7_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:2377:5: (lv_b_7_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:2377:5: (lv_b_7_0= ruleGDr )
                    // InternalDroneDSLLib.g:2378:6: lv_b_7_0= ruleGDr
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

                    otherlv_8=(Token)match(input,34,FOLLOW_18); 

                    				newLeafNode(otherlv_8, grammarAccess.getParallele3Access().getAmpersandKeyword_1_3());
                    			
                    // InternalDroneDSLLib.g:2399:4: ( (lv_c_9_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:2400:5: (lv_c_9_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:2400:5: (lv_c_9_0= ruleRGRD )
                    // InternalDroneDSLLib.g:2401:6: lv_c_9_0= ruleRGRD
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
                    // InternalDroneDSLLib.g:2420:3: ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSLLib.g:2420:3: ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) )
                    // InternalDroneDSLLib.g:2421:4: ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) )
                    {
                    // InternalDroneDSLLib.g:2421:4: ( (lv_a_10_0= ruleAR ) )
                    // InternalDroneDSLLib.g:2422:5: (lv_a_10_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:2422:5: (lv_a_10_0= ruleAR )
                    // InternalDroneDSLLib.g:2423:6: lv_a_10_0= ruleAR
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

                    otherlv_11=(Token)match(input,34,FOLLOW_19); 

                    				newLeafNode(otherlv_11, grammarAccess.getParallele3Access().getAmpersandKeyword_2_1());
                    			
                    // InternalDroneDSLLib.g:2444:4: ( (lv_b_12_0= ruleMD ) )
                    // InternalDroneDSLLib.g:2445:5: (lv_b_12_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:2445:5: (lv_b_12_0= ruleMD )
                    // InternalDroneDSLLib.g:2446:6: lv_b_12_0= ruleMD
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

                    otherlv_13=(Token)match(input,34,FOLLOW_16); 

                    				newLeafNode(otherlv_13, grammarAccess.getParallele3Access().getAmpersandKeyword_2_3());
                    			
                    // InternalDroneDSLLib.g:2467:4: ( (lv_c_14_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:2468:5: (lv_c_14_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:2468:5: (lv_c_14_0= ruleGDr )
                    // InternalDroneDSLLib.g:2469:6: lv_c_14_0= ruleGDr
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
                    // InternalDroneDSLLib.g:2488:3: ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSLLib.g:2488:3: ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) )
                    // InternalDroneDSLLib.g:2489:4: ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) )
                    {
                    // InternalDroneDSLLib.g:2489:4: ( (lv_a_15_0= ruleAR ) )
                    // InternalDroneDSLLib.g:2490:5: (lv_a_15_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:2490:5: (lv_a_15_0= ruleAR )
                    // InternalDroneDSLLib.g:2491:6: lv_a_15_0= ruleAR
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

                    otherlv_16=(Token)match(input,34,FOLLOW_19); 

                    				newLeafNode(otherlv_16, grammarAccess.getParallele3Access().getAmpersandKeyword_3_1());
                    			
                    // InternalDroneDSLLib.g:2512:4: ( (lv_b_17_0= ruleMD ) )
                    // InternalDroneDSLLib.g:2513:5: (lv_b_17_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:2513:5: (lv_b_17_0= ruleMD )
                    // InternalDroneDSLLib.g:2514:6: lv_b_17_0= ruleMD
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

                    otherlv_18=(Token)match(input,34,FOLLOW_18); 

                    				newLeafNode(otherlv_18, grammarAccess.getParallele3Access().getAmpersandKeyword_3_3());
                    			
                    // InternalDroneDSLLib.g:2535:4: ( (lv_c_19_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:2536:5: (lv_c_19_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:2536:5: (lv_c_19_0= ruleRGRD )
                    // InternalDroneDSLLib.g:2537:6: lv_c_19_0= ruleRGRD
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
                    // InternalDroneDSLLib.g:2556:3: ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) )
                    {
                    // InternalDroneDSLLib.g:2556:3: ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) )
                    // InternalDroneDSLLib.g:2557:4: ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) )
                    {
                    // InternalDroneDSLLib.g:2557:4: ( (lv_a_20_0= ruleAR ) )
                    // InternalDroneDSLLib.g:2558:5: (lv_a_20_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:2558:5: (lv_a_20_0= ruleAR )
                    // InternalDroneDSLLib.g:2559:6: lv_a_20_0= ruleAR
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

                    otherlv_21=(Token)match(input,34,FOLLOW_18); 

                    				newLeafNode(otherlv_21, grammarAccess.getParallele3Access().getAmpersandKeyword_4_1());
                    			
                    // InternalDroneDSLLib.g:2580:4: ( (lv_b_22_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:2581:5: (lv_b_22_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:2581:5: (lv_b_22_0= ruleRGRD )
                    // InternalDroneDSLLib.g:2582:6: lv_b_22_0= ruleRGRD
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

                    otherlv_23=(Token)match(input,34,FOLLOW_19); 

                    				newLeafNode(otherlv_23, grammarAccess.getParallele3Access().getAmpersandKeyword_4_3());
                    			
                    // InternalDroneDSLLib.g:2603:4: ( (lv_c_24_0= ruleMD ) )
                    // InternalDroneDSLLib.g:2604:5: (lv_c_24_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:2604:5: (lv_c_24_0= ruleMD )
                    // InternalDroneDSLLib.g:2605:6: lv_c_24_0= ruleMD
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
                    // InternalDroneDSLLib.g:2624:3: ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSLLib.g:2624:3: ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) )
                    // InternalDroneDSLLib.g:2625:4: ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) )
                    {
                    // InternalDroneDSLLib.g:2625:4: ( (lv_a_25_0= ruleAR ) )
                    // InternalDroneDSLLib.g:2626:5: (lv_a_25_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:2626:5: (lv_a_25_0= ruleAR )
                    // InternalDroneDSLLib.g:2627:6: lv_a_25_0= ruleAR
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

                    otherlv_26=(Token)match(input,34,FOLLOW_18); 

                    				newLeafNode(otherlv_26, grammarAccess.getParallele3Access().getAmpersandKeyword_5_1());
                    			
                    // InternalDroneDSLLib.g:2648:4: ( (lv_b_27_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:2649:5: (lv_b_27_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:2649:5: (lv_b_27_0= ruleRGRD )
                    // InternalDroneDSLLib.g:2650:6: lv_b_27_0= ruleRGRD
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

                    otherlv_28=(Token)match(input,34,FOLLOW_16); 

                    				newLeafNode(otherlv_28, grammarAccess.getParallele3Access().getAmpersandKeyword_5_3());
                    			
                    // InternalDroneDSLLib.g:2671:4: ( (lv_c_29_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:2672:5: (lv_c_29_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:2672:5: (lv_c_29_0= ruleGDr )
                    // InternalDroneDSLLib.g:2673:6: lv_c_29_0= ruleGDr
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
                    // InternalDroneDSLLib.g:2692:3: ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) )
                    {
                    // InternalDroneDSLLib.g:2692:3: ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) )
                    // InternalDroneDSLLib.g:2693:4: ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) )
                    {
                    // InternalDroneDSLLib.g:2693:4: ( (lv_a_30_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:2694:5: (lv_a_30_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:2694:5: (lv_a_30_0= ruleGDr )
                    // InternalDroneDSLLib.g:2695:6: lv_a_30_0= ruleGDr
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

                    otherlv_31=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_31, grammarAccess.getParallele3Access().getAmpersandKeyword_6_1());
                    			
                    // InternalDroneDSLLib.g:2716:4: ( (lv_b_32_0= ruleAR ) )
                    // InternalDroneDSLLib.g:2717:5: (lv_b_32_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:2717:5: (lv_b_32_0= ruleAR )
                    // InternalDroneDSLLib.g:2718:6: lv_b_32_0= ruleAR
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

                    otherlv_33=(Token)match(input,34,FOLLOW_19); 

                    				newLeafNode(otherlv_33, grammarAccess.getParallele3Access().getAmpersandKeyword_6_3());
                    			
                    // InternalDroneDSLLib.g:2739:4: ( (lv_c_34_0= ruleMD ) )
                    // InternalDroneDSLLib.g:2740:5: (lv_c_34_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:2740:5: (lv_c_34_0= ruleMD )
                    // InternalDroneDSLLib.g:2741:6: lv_c_34_0= ruleMD
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
                    // InternalDroneDSLLib.g:2760:3: ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSLLib.g:2760:3: ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) )
                    // InternalDroneDSLLib.g:2761:4: ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) )
                    {
                    // InternalDroneDSLLib.g:2761:4: ( (lv_a_35_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:2762:5: (lv_a_35_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:2762:5: (lv_a_35_0= ruleGDr )
                    // InternalDroneDSLLib.g:2763:6: lv_a_35_0= ruleGDr
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

                    otherlv_36=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_36, grammarAccess.getParallele3Access().getAmpersandKeyword_7_1());
                    			
                    // InternalDroneDSLLib.g:2784:4: ( (lv_b_37_0= ruleAR ) )
                    // InternalDroneDSLLib.g:2785:5: (lv_b_37_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:2785:5: (lv_b_37_0= ruleAR )
                    // InternalDroneDSLLib.g:2786:6: lv_b_37_0= ruleAR
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

                    otherlv_38=(Token)match(input,34,FOLLOW_18); 

                    				newLeafNode(otherlv_38, grammarAccess.getParallele3Access().getAmpersandKeyword_7_3());
                    			
                    // InternalDroneDSLLib.g:2807:4: ( (lv_c_39_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:2808:5: (lv_c_39_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:2808:5: (lv_c_39_0= ruleRGRD )
                    // InternalDroneDSLLib.g:2809:6: lv_c_39_0= ruleRGRD
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
                    // InternalDroneDSLLib.g:2828:3: ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) )
                    {
                    // InternalDroneDSLLib.g:2828:3: ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) )
                    // InternalDroneDSLLib.g:2829:4: ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) )
                    {
                    // InternalDroneDSLLib.g:2829:4: ( (lv_a_40_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:2830:5: (lv_a_40_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:2830:5: (lv_a_40_0= ruleGDr )
                    // InternalDroneDSLLib.g:2831:6: lv_a_40_0= ruleGDr
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

                    otherlv_41=(Token)match(input,34,FOLLOW_19); 

                    				newLeafNode(otherlv_41, grammarAccess.getParallele3Access().getAmpersandKeyword_8_1());
                    			
                    // InternalDroneDSLLib.g:2852:4: ( (lv_b_42_0= ruleMD ) )
                    // InternalDroneDSLLib.g:2853:5: (lv_b_42_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:2853:5: (lv_b_42_0= ruleMD )
                    // InternalDroneDSLLib.g:2854:6: lv_b_42_0= ruleMD
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

                    otherlv_43=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_43, grammarAccess.getParallele3Access().getAmpersandKeyword_8_3());
                    			
                    // InternalDroneDSLLib.g:2875:4: ( (lv_c_44_0= ruleAR ) )
                    // InternalDroneDSLLib.g:2876:5: (lv_c_44_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:2876:5: (lv_c_44_0= ruleAR )
                    // InternalDroneDSLLib.g:2877:6: lv_c_44_0= ruleAR
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
                    // InternalDroneDSLLib.g:2896:3: ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSLLib.g:2896:3: ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) )
                    // InternalDroneDSLLib.g:2897:4: ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) )
                    {
                    // InternalDroneDSLLib.g:2897:4: ( (lv_a_45_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:2898:5: (lv_a_45_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:2898:5: (lv_a_45_0= ruleGDr )
                    // InternalDroneDSLLib.g:2899:6: lv_a_45_0= ruleGDr
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

                    otherlv_46=(Token)match(input,34,FOLLOW_19); 

                    				newLeafNode(otherlv_46, grammarAccess.getParallele3Access().getAmpersandKeyword_9_1());
                    			
                    // InternalDroneDSLLib.g:2920:4: ( (lv_b_47_0= ruleMD ) )
                    // InternalDroneDSLLib.g:2921:5: (lv_b_47_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:2921:5: (lv_b_47_0= ruleMD )
                    // InternalDroneDSLLib.g:2922:6: lv_b_47_0= ruleMD
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

                    otherlv_48=(Token)match(input,34,FOLLOW_18); 

                    				newLeafNode(otherlv_48, grammarAccess.getParallele3Access().getAmpersandKeyword_9_3());
                    			
                    // InternalDroneDSLLib.g:2943:4: ( (lv_c_49_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:2944:5: (lv_c_49_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:2944:5: (lv_c_49_0= ruleRGRD )
                    // InternalDroneDSLLib.g:2945:6: lv_c_49_0= ruleRGRD
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
                    // InternalDroneDSLLib.g:2964:3: ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) )
                    {
                    // InternalDroneDSLLib.g:2964:3: ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) )
                    // InternalDroneDSLLib.g:2965:4: ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) )
                    {
                    // InternalDroneDSLLib.g:2965:4: ( (lv_a_50_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:2966:5: (lv_a_50_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:2966:5: (lv_a_50_0= ruleGDr )
                    // InternalDroneDSLLib.g:2967:6: lv_a_50_0= ruleGDr
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

                    otherlv_51=(Token)match(input,34,FOLLOW_18); 

                    				newLeafNode(otherlv_51, grammarAccess.getParallele3Access().getAmpersandKeyword_10_1());
                    			
                    // InternalDroneDSLLib.g:2988:4: ( (lv_b_52_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:2989:5: (lv_b_52_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:2989:5: (lv_b_52_0= ruleRGRD )
                    // InternalDroneDSLLib.g:2990:6: lv_b_52_0= ruleRGRD
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

                    otherlv_53=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_53, grammarAccess.getParallele3Access().getAmpersandKeyword_10_3());
                    			
                    // InternalDroneDSLLib.g:3011:4: ( (lv_c_54_0= ruleAR ) )
                    // InternalDroneDSLLib.g:3012:5: (lv_c_54_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:3012:5: (lv_c_54_0= ruleAR )
                    // InternalDroneDSLLib.g:3013:6: lv_c_54_0= ruleAR
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
                    // InternalDroneDSLLib.g:3032:3: ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) )
                    {
                    // InternalDroneDSLLib.g:3032:3: ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) )
                    // InternalDroneDSLLib.g:3033:4: ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) )
                    {
                    // InternalDroneDSLLib.g:3033:4: ( (lv_a_55_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:3034:5: (lv_a_55_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:3034:5: (lv_a_55_0= ruleGDr )
                    // InternalDroneDSLLib.g:3035:6: lv_a_55_0= ruleGDr
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

                    otherlv_56=(Token)match(input,34,FOLLOW_18); 

                    				newLeafNode(otherlv_56, grammarAccess.getParallele3Access().getAmpersandKeyword_11_1());
                    			
                    // InternalDroneDSLLib.g:3056:4: ( (lv_b_57_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:3057:5: (lv_b_57_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:3057:5: (lv_b_57_0= ruleRGRD )
                    // InternalDroneDSLLib.g:3058:6: lv_b_57_0= ruleRGRD
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

                    otherlv_58=(Token)match(input,34,FOLLOW_19); 

                    				newLeafNode(otherlv_58, grammarAccess.getParallele3Access().getAmpersandKeyword_11_3());
                    			
                    // InternalDroneDSLLib.g:3079:4: ( (lv_c_59_0= ruleMD ) )
                    // InternalDroneDSLLib.g:3080:5: (lv_c_59_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:3080:5: (lv_c_59_0= ruleMD )
                    // InternalDroneDSLLib.g:3081:6: lv_c_59_0= ruleMD
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
                    // InternalDroneDSLLib.g:3100:3: ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSLLib.g:3100:3: ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) )
                    // InternalDroneDSLLib.g:3101:4: ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) )
                    {
                    // InternalDroneDSLLib.g:3101:4: ( (lv_a_60_0= ruleMD ) )
                    // InternalDroneDSLLib.g:3102:5: (lv_a_60_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:3102:5: (lv_a_60_0= ruleMD )
                    // InternalDroneDSLLib.g:3103:6: lv_a_60_0= ruleMD
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

                    otherlv_61=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_61, grammarAccess.getParallele3Access().getAmpersandKeyword_12_1());
                    			
                    // InternalDroneDSLLib.g:3124:4: ( (lv_b_62_0= ruleAR ) )
                    // InternalDroneDSLLib.g:3125:5: (lv_b_62_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:3125:5: (lv_b_62_0= ruleAR )
                    // InternalDroneDSLLib.g:3126:6: lv_b_62_0= ruleAR
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

                    otherlv_63=(Token)match(input,34,FOLLOW_16); 

                    				newLeafNode(otherlv_63, grammarAccess.getParallele3Access().getAmpersandKeyword_12_3());
                    			
                    // InternalDroneDSLLib.g:3147:4: ( (lv_c_64_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:3148:5: (lv_c_64_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:3148:5: (lv_c_64_0= ruleGDr )
                    // InternalDroneDSLLib.g:3149:6: lv_c_64_0= ruleGDr
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
                    // InternalDroneDSLLib.g:3168:3: ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSLLib.g:3168:3: ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) )
                    // InternalDroneDSLLib.g:3169:4: ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) )
                    {
                    // InternalDroneDSLLib.g:3169:4: ( (lv_a_65_0= ruleMD ) )
                    // InternalDroneDSLLib.g:3170:5: (lv_a_65_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:3170:5: (lv_a_65_0= ruleMD )
                    // InternalDroneDSLLib.g:3171:6: lv_a_65_0= ruleMD
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

                    otherlv_66=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_66, grammarAccess.getParallele3Access().getAmpersandKeyword_13_1());
                    			
                    // InternalDroneDSLLib.g:3192:4: ( (lv_b_67_0= ruleAR ) )
                    // InternalDroneDSLLib.g:3193:5: (lv_b_67_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:3193:5: (lv_b_67_0= ruleAR )
                    // InternalDroneDSLLib.g:3194:6: lv_b_67_0= ruleAR
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

                    otherlv_68=(Token)match(input,34,FOLLOW_18); 

                    				newLeafNode(otherlv_68, grammarAccess.getParallele3Access().getAmpersandKeyword_13_3());
                    			
                    // InternalDroneDSLLib.g:3215:4: ( (lv_c_69_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:3216:5: (lv_c_69_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:3216:5: (lv_c_69_0= ruleRGRD )
                    // InternalDroneDSLLib.g:3217:6: lv_c_69_0= ruleRGRD
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
                    // InternalDroneDSLLib.g:3236:3: ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) )
                    {
                    // InternalDroneDSLLib.g:3236:3: ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) )
                    // InternalDroneDSLLib.g:3237:4: ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) )
                    {
                    // InternalDroneDSLLib.g:3237:4: ( (lv_a_70_0= ruleMD ) )
                    // InternalDroneDSLLib.g:3238:5: (lv_a_70_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:3238:5: (lv_a_70_0= ruleMD )
                    // InternalDroneDSLLib.g:3239:6: lv_a_70_0= ruleMD
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

                    otherlv_71=(Token)match(input,34,FOLLOW_16); 

                    				newLeafNode(otherlv_71, grammarAccess.getParallele3Access().getAmpersandKeyword_14_1());
                    			
                    // InternalDroneDSLLib.g:3260:4: ( (lv_b_72_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:3261:5: (lv_b_72_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:3261:5: (lv_b_72_0= ruleGDr )
                    // InternalDroneDSLLib.g:3262:6: lv_b_72_0= ruleGDr
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

                    otherlv_73=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_73, grammarAccess.getParallele3Access().getAmpersandKeyword_14_3());
                    			
                    // InternalDroneDSLLib.g:3283:4: ( (lv_c_74_0= ruleAR ) )
                    // InternalDroneDSLLib.g:3284:5: (lv_c_74_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:3284:5: (lv_c_74_0= ruleAR )
                    // InternalDroneDSLLib.g:3285:6: lv_c_74_0= ruleAR
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
                    // InternalDroneDSLLib.g:3304:3: ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSLLib.g:3304:3: ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) )
                    // InternalDroneDSLLib.g:3305:4: ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) )
                    {
                    // InternalDroneDSLLib.g:3305:4: ( (lv_a_75_0= ruleMD ) )
                    // InternalDroneDSLLib.g:3306:5: (lv_a_75_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:3306:5: (lv_a_75_0= ruleMD )
                    // InternalDroneDSLLib.g:3307:6: lv_a_75_0= ruleMD
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

                    otherlv_76=(Token)match(input,34,FOLLOW_16); 

                    				newLeafNode(otherlv_76, grammarAccess.getParallele3Access().getAmpersandKeyword_15_1());
                    			
                    // InternalDroneDSLLib.g:3328:4: ( (lv_b_77_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:3329:5: (lv_b_77_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:3329:5: (lv_b_77_0= ruleGDr )
                    // InternalDroneDSLLib.g:3330:6: lv_b_77_0= ruleGDr
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

                    otherlv_78=(Token)match(input,34,FOLLOW_18); 

                    				newLeafNode(otherlv_78, grammarAccess.getParallele3Access().getAmpersandKeyword_15_3());
                    			
                    // InternalDroneDSLLib.g:3351:4: ( (lv_c_79_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:3352:5: (lv_c_79_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:3352:5: (lv_c_79_0= ruleRGRD )
                    // InternalDroneDSLLib.g:3353:6: lv_c_79_0= ruleRGRD
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
                    // InternalDroneDSLLib.g:3372:3: ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSLLib.g:3372:3: ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) )
                    // InternalDroneDSLLib.g:3373:4: ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) )
                    {
                    // InternalDroneDSLLib.g:3373:4: ( (lv_a_80_0= ruleMD ) )
                    // InternalDroneDSLLib.g:3374:5: (lv_a_80_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:3374:5: (lv_a_80_0= ruleMD )
                    // InternalDroneDSLLib.g:3375:6: lv_a_80_0= ruleMD
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

                    otherlv_81=(Token)match(input,34,FOLLOW_18); 

                    				newLeafNode(otherlv_81, grammarAccess.getParallele3Access().getAmpersandKeyword_16_1());
                    			
                    // InternalDroneDSLLib.g:3396:4: ( (lv_b_82_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:3397:5: (lv_b_82_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:3397:5: (lv_b_82_0= ruleRGRD )
                    // InternalDroneDSLLib.g:3398:6: lv_b_82_0= ruleRGRD
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

                    otherlv_83=(Token)match(input,34,FOLLOW_16); 

                    				newLeafNode(otherlv_83, grammarAccess.getParallele3Access().getAmpersandKeyword_16_3());
                    			
                    // InternalDroneDSLLib.g:3419:4: ( (lv_c_84_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:3420:5: (lv_c_84_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:3420:5: (lv_c_84_0= ruleGDr )
                    // InternalDroneDSLLib.g:3421:6: lv_c_84_0= ruleGDr
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
                    // InternalDroneDSLLib.g:3440:3: ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) )
                    {
                    // InternalDroneDSLLib.g:3440:3: ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) )
                    // InternalDroneDSLLib.g:3441:4: ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) )
                    {
                    // InternalDroneDSLLib.g:3441:4: ( (lv_a_85_0= ruleMD ) )
                    // InternalDroneDSLLib.g:3442:5: (lv_a_85_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:3442:5: (lv_a_85_0= ruleMD )
                    // InternalDroneDSLLib.g:3443:6: lv_a_85_0= ruleMD
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

                    otherlv_86=(Token)match(input,34,FOLLOW_18); 

                    				newLeafNode(otherlv_86, grammarAccess.getParallele3Access().getAmpersandKeyword_17_1());
                    			
                    // InternalDroneDSLLib.g:3464:4: ( (lv_b_87_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:3465:5: (lv_b_87_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:3465:5: (lv_b_87_0= ruleRGRD )
                    // InternalDroneDSLLib.g:3466:6: lv_b_87_0= ruleRGRD
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

                    otherlv_88=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_88, grammarAccess.getParallele3Access().getAmpersandKeyword_17_3());
                    			
                    // InternalDroneDSLLib.g:3487:4: ( (lv_c_89_0= ruleAR ) )
                    // InternalDroneDSLLib.g:3488:5: (lv_c_89_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:3488:5: (lv_c_89_0= ruleAR )
                    // InternalDroneDSLLib.g:3489:6: lv_c_89_0= ruleAR
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
                    // InternalDroneDSLLib.g:3508:3: ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) )
                    {
                    // InternalDroneDSLLib.g:3508:3: ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) )
                    // InternalDroneDSLLib.g:3509:4: ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) )
                    {
                    // InternalDroneDSLLib.g:3509:4: ( (lv_a_90_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:3510:5: (lv_a_90_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:3510:5: (lv_a_90_0= ruleRGRD )
                    // InternalDroneDSLLib.g:3511:6: lv_a_90_0= ruleRGRD
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

                    otherlv_91=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_91, grammarAccess.getParallele3Access().getAmpersandKeyword_18_1());
                    			
                    // InternalDroneDSLLib.g:3532:4: ( (lv_b_92_0= ruleAR ) )
                    // InternalDroneDSLLib.g:3533:5: (lv_b_92_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:3533:5: (lv_b_92_0= ruleAR )
                    // InternalDroneDSLLib.g:3534:6: lv_b_92_0= ruleAR
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

                    otherlv_93=(Token)match(input,34,FOLLOW_19); 

                    				newLeafNode(otherlv_93, grammarAccess.getParallele3Access().getAmpersandKeyword_18_3());
                    			
                    // InternalDroneDSLLib.g:3555:4: ( (lv_c_94_0= ruleMD ) )
                    // InternalDroneDSLLib.g:3556:5: (lv_c_94_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:3556:5: (lv_c_94_0= ruleMD )
                    // InternalDroneDSLLib.g:3557:6: lv_c_94_0= ruleMD
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
                    // InternalDroneDSLLib.g:3576:3: ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSLLib.g:3576:3: ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) )
                    // InternalDroneDSLLib.g:3577:4: ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) )
                    {
                    // InternalDroneDSLLib.g:3577:4: ( (lv_a_95_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:3578:5: (lv_a_95_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:3578:5: (lv_a_95_0= ruleRGRD )
                    // InternalDroneDSLLib.g:3579:6: lv_a_95_0= ruleRGRD
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

                    otherlv_96=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_96, grammarAccess.getParallele3Access().getAmpersandKeyword_19_1());
                    			
                    // InternalDroneDSLLib.g:3600:4: ( (lv_b_97_0= ruleAR ) )
                    // InternalDroneDSLLib.g:3601:5: (lv_b_97_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:3601:5: (lv_b_97_0= ruleAR )
                    // InternalDroneDSLLib.g:3602:6: lv_b_97_0= ruleAR
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

                    otherlv_98=(Token)match(input,34,FOLLOW_16); 

                    				newLeafNode(otherlv_98, grammarAccess.getParallele3Access().getAmpersandKeyword_19_3());
                    			
                    // InternalDroneDSLLib.g:3623:4: ( (lv_c_99_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:3624:5: (lv_c_99_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:3624:5: (lv_c_99_0= ruleGDr )
                    // InternalDroneDSLLib.g:3625:6: lv_c_99_0= ruleGDr
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
                    // InternalDroneDSLLib.g:3644:3: ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) )
                    {
                    // InternalDroneDSLLib.g:3644:3: ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) )
                    // InternalDroneDSLLib.g:3645:4: ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) )
                    {
                    // InternalDroneDSLLib.g:3645:4: ( (lv_a_100_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:3646:5: (lv_a_100_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:3646:5: (lv_a_100_0= ruleRGRD )
                    // InternalDroneDSLLib.g:3647:6: lv_a_100_0= ruleRGRD
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

                    otherlv_101=(Token)match(input,34,FOLLOW_19); 

                    				newLeafNode(otherlv_101, grammarAccess.getParallele3Access().getAmpersandKeyword_20_1());
                    			
                    // InternalDroneDSLLib.g:3668:4: ( (lv_b_102_0= ruleMD ) )
                    // InternalDroneDSLLib.g:3669:5: (lv_b_102_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:3669:5: (lv_b_102_0= ruleMD )
                    // InternalDroneDSLLib.g:3670:6: lv_b_102_0= ruleMD
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

                    otherlv_103=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_103, grammarAccess.getParallele3Access().getAmpersandKeyword_20_3());
                    			
                    // InternalDroneDSLLib.g:3691:4: ( (lv_c_104_0= ruleAR ) )
                    // InternalDroneDSLLib.g:3692:5: (lv_c_104_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:3692:5: (lv_c_104_0= ruleAR )
                    // InternalDroneDSLLib.g:3693:6: lv_c_104_0= ruleAR
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
                    // InternalDroneDSLLib.g:3712:3: ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSLLib.g:3712:3: ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) )
                    // InternalDroneDSLLib.g:3713:4: ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) )
                    {
                    // InternalDroneDSLLib.g:3713:4: ( (lv_a_105_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:3714:5: (lv_a_105_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:3714:5: (lv_a_105_0= ruleRGRD )
                    // InternalDroneDSLLib.g:3715:6: lv_a_105_0= ruleRGRD
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

                    otherlv_106=(Token)match(input,34,FOLLOW_19); 

                    				newLeafNode(otherlv_106, grammarAccess.getParallele3Access().getAmpersandKeyword_21_1());
                    			
                    // InternalDroneDSLLib.g:3736:4: ( (lv_b_107_0= ruleMD ) )
                    // InternalDroneDSLLib.g:3737:5: (lv_b_107_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:3737:5: (lv_b_107_0= ruleMD )
                    // InternalDroneDSLLib.g:3738:6: lv_b_107_0= ruleMD
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

                    otherlv_108=(Token)match(input,34,FOLLOW_16); 

                    				newLeafNode(otherlv_108, grammarAccess.getParallele3Access().getAmpersandKeyword_21_3());
                    			
                    // InternalDroneDSLLib.g:3759:4: ( (lv_c_109_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:3760:5: (lv_c_109_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:3760:5: (lv_c_109_0= ruleGDr )
                    // InternalDroneDSLLib.g:3761:6: lv_c_109_0= ruleGDr
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
                    // InternalDroneDSLLib.g:3780:3: ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) )
                    {
                    // InternalDroneDSLLib.g:3780:3: ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) )
                    // InternalDroneDSLLib.g:3781:4: ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) )
                    {
                    // InternalDroneDSLLib.g:3781:4: ( (lv_a_110_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:3782:5: (lv_a_110_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:3782:5: (lv_a_110_0= ruleRGRD )
                    // InternalDroneDSLLib.g:3783:6: lv_a_110_0= ruleRGRD
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

                    otherlv_111=(Token)match(input,34,FOLLOW_16); 

                    				newLeafNode(otherlv_111, grammarAccess.getParallele3Access().getAmpersandKeyword_22_1());
                    			
                    // InternalDroneDSLLib.g:3804:4: ( (lv_b_112_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:3805:5: (lv_b_112_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:3805:5: (lv_b_112_0= ruleGDr )
                    // InternalDroneDSLLib.g:3806:6: lv_b_112_0= ruleGDr
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

                    otherlv_113=(Token)match(input,34,FOLLOW_19); 

                    				newLeafNode(otherlv_113, grammarAccess.getParallele3Access().getAmpersandKeyword_22_3());
                    			
                    // InternalDroneDSLLib.g:3827:4: ( (lv_c_114_0= ruleMD ) )
                    // InternalDroneDSLLib.g:3828:5: (lv_c_114_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:3828:5: (lv_c_114_0= ruleMD )
                    // InternalDroneDSLLib.g:3829:6: lv_c_114_0= ruleMD
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
                    // InternalDroneDSLLib.g:3848:3: ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) )
                    {
                    // InternalDroneDSLLib.g:3848:3: ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) )
                    // InternalDroneDSLLib.g:3849:4: ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) )
                    {
                    // InternalDroneDSLLib.g:3849:4: ( (lv_a_115_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:3850:5: (lv_a_115_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:3850:5: (lv_a_115_0= ruleRGRD )
                    // InternalDroneDSLLib.g:3851:6: lv_a_115_0= ruleRGRD
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

                    otherlv_116=(Token)match(input,34,FOLLOW_16); 

                    				newLeafNode(otherlv_116, grammarAccess.getParallele3Access().getAmpersandKeyword_23_1());
                    			
                    // InternalDroneDSLLib.g:3872:4: ( (lv_b_117_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:3873:5: (lv_b_117_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:3873:5: (lv_b_117_0= ruleGDr )
                    // InternalDroneDSLLib.g:3874:6: lv_b_117_0= ruleGDr
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

                    otherlv_118=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_118, grammarAccess.getParallele3Access().getAmpersandKeyword_23_3());
                    			
                    // InternalDroneDSLLib.g:3895:4: ( (lv_c_119_0= ruleAR ) )
                    // InternalDroneDSLLib.g:3896:5: (lv_c_119_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:3896:5: (lv_c_119_0= ruleAR )
                    // InternalDroneDSLLib.g:3897:6: lv_c_119_0= ruleAR
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
    // InternalDroneDSLLib.g:3919:1: entryRuleParallele4 returns [EObject current=null] : iv_ruleParallele4= ruleParallele4 EOF ;
    public final EObject entryRuleParallele4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallele4 = null;


        try {
            // InternalDroneDSLLib.g:3919:51: (iv_ruleParallele4= ruleParallele4 EOF )
            // InternalDroneDSLLib.g:3920:2: iv_ruleParallele4= ruleParallele4 EOF
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
    // InternalDroneDSLLib.g:3926:1: ruleParallele4 returns [EObject current=null] : ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) ) | ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) ) | ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) ) | ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) ) | ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) ) | ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) ) | ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) ) | ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) ) | ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) ) | ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) ) | ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) ) | ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) ) | ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) ) | ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) ) | ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) ) | ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) ) | ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) ) | ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) ) | ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) ) | ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) ) | ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) ) | ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) ) | ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) ) | ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) ) ) ;
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
            // InternalDroneDSLLib.g:3932:2: ( ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) ) | ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) ) | ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) ) | ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) ) | ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) ) | ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) ) | ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) ) | ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) ) | ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) ) | ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) ) | ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) ) | ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) ) | ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) ) | ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) ) | ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) ) | ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) ) | ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) ) | ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) ) | ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) ) | ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) ) | ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) ) | ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) ) | ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) ) | ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) ) ) )
            // InternalDroneDSLLib.g:3933:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) ) | ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) ) | ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) ) | ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) ) | ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) ) | ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) ) | ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) ) | ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) ) | ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) ) | ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) ) | ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) ) | ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) ) | ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) ) | ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) ) | ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) ) | ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) ) | ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) ) | ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) ) | ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) ) | ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) ) | ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) ) | ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) ) | ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) ) | ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) ) )
            {
            // InternalDroneDSLLib.g:3933:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) ) | ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) ) | ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) ) | ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) ) | ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) ) | ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) ) | ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) ) | ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) ) | ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) ) | ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) ) | ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) ) | ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) ) | ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) ) | ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) ) | ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) ) | ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) ) | ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) ) | ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) ) | ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) ) | ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) ) | ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) ) | ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) ) | ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) ) | ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) ) )
            int alt16=24;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalDroneDSLLib.g:3934:3: ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSLLib.g:3934:3: ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) )
                    // InternalDroneDSLLib.g:3935:4: ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) )
                    {
                    // InternalDroneDSLLib.g:3935:4: ( (lv_a_0_0= ruleAR ) )
                    // InternalDroneDSLLib.g:3936:5: (lv_a_0_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:3936:5: (lv_a_0_0= ruleAR )
                    // InternalDroneDSLLib.g:3937:6: lv_a_0_0= ruleAR
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

                    otherlv_1=(Token)match(input,34,FOLLOW_16); 

                    				newLeafNode(otherlv_1, grammarAccess.getParallele4Access().getAmpersandKeyword_0_1());
                    			
                    // InternalDroneDSLLib.g:3958:4: ( (lv_b_2_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:3959:5: (lv_b_2_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:3959:5: (lv_b_2_0= ruleGDr )
                    // InternalDroneDSLLib.g:3960:6: lv_b_2_0= ruleGDr
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

                    otherlv_3=(Token)match(input,34,FOLLOW_19); 

                    				newLeafNode(otherlv_3, grammarAccess.getParallele4Access().getAmpersandKeyword_0_3());
                    			
                    // InternalDroneDSLLib.g:3981:4: ( (lv_c_4_0= ruleMD ) )
                    // InternalDroneDSLLib.g:3982:5: (lv_c_4_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:3982:5: (lv_c_4_0= ruleMD )
                    // InternalDroneDSLLib.g:3983:6: lv_c_4_0= ruleMD
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

                    otherlv_5=(Token)match(input,34,FOLLOW_18); 

                    				newLeafNode(otherlv_5, grammarAccess.getParallele4Access().getAmpersandKeyword_0_5());
                    			
                    // InternalDroneDSLLib.g:4004:4: ( (lv_d_6_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:4005:5: (lv_d_6_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:4005:5: (lv_d_6_0= ruleRGRD )
                    // InternalDroneDSLLib.g:4006:6: lv_d_6_0= ruleRGRD
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
                    // InternalDroneDSLLib.g:4025:3: ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) )
                    {
                    // InternalDroneDSLLib.g:4025:3: ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) )
                    // InternalDroneDSLLib.g:4026:4: ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) )
                    {
                    // InternalDroneDSLLib.g:4026:4: ( (lv_a_7_0= ruleAR ) )
                    // InternalDroneDSLLib.g:4027:5: (lv_a_7_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:4027:5: (lv_a_7_0= ruleAR )
                    // InternalDroneDSLLib.g:4028:6: lv_a_7_0= ruleAR
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

                    otherlv_8=(Token)match(input,34,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getParallele4Access().getAmpersandKeyword_1_1());
                    			
                    // InternalDroneDSLLib.g:4049:4: ( (lv_b_9_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:4050:5: (lv_b_9_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:4050:5: (lv_b_9_0= ruleGDr )
                    // InternalDroneDSLLib.g:4051:6: lv_b_9_0= ruleGDr
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

                    otherlv_10=(Token)match(input,34,FOLLOW_18); 

                    				newLeafNode(otherlv_10, grammarAccess.getParallele4Access().getAmpersandKeyword_1_3());
                    			
                    // InternalDroneDSLLib.g:4072:4: ( (lv_c_11_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:4073:5: (lv_c_11_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:4073:5: (lv_c_11_0= ruleRGRD )
                    // InternalDroneDSLLib.g:4074:6: lv_c_11_0= ruleRGRD
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

                    otherlv_12=(Token)match(input,34,FOLLOW_19); 

                    				newLeafNode(otherlv_12, grammarAccess.getParallele4Access().getAmpersandKeyword_1_5());
                    			
                    // InternalDroneDSLLib.g:4095:4: ( (lv_d_13_0= ruleMD ) )
                    // InternalDroneDSLLib.g:4096:5: (lv_d_13_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:4096:5: (lv_d_13_0= ruleMD )
                    // InternalDroneDSLLib.g:4097:6: lv_d_13_0= ruleMD
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
                    // InternalDroneDSLLib.g:4116:3: ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSLLib.g:4116:3: ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) )
                    // InternalDroneDSLLib.g:4117:4: ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) )
                    {
                    // InternalDroneDSLLib.g:4117:4: ( (lv_a_14_0= ruleAR ) )
                    // InternalDroneDSLLib.g:4118:5: (lv_a_14_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:4118:5: (lv_a_14_0= ruleAR )
                    // InternalDroneDSLLib.g:4119:6: lv_a_14_0= ruleAR
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

                    otherlv_15=(Token)match(input,34,FOLLOW_19); 

                    				newLeafNode(otherlv_15, grammarAccess.getParallele4Access().getAmpersandKeyword_2_1());
                    			
                    // InternalDroneDSLLib.g:4140:4: ( (lv_b_16_0= ruleMD ) )
                    // InternalDroneDSLLib.g:4141:5: (lv_b_16_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:4141:5: (lv_b_16_0= ruleMD )
                    // InternalDroneDSLLib.g:4142:6: lv_b_16_0= ruleMD
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

                    otherlv_17=(Token)match(input,34,FOLLOW_16); 

                    				newLeafNode(otherlv_17, grammarAccess.getParallele4Access().getAmpersandKeyword_2_3());
                    			
                    // InternalDroneDSLLib.g:4163:4: ( (lv_c_18_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:4164:5: (lv_c_18_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:4164:5: (lv_c_18_0= ruleGDr )
                    // InternalDroneDSLLib.g:4165:6: lv_c_18_0= ruleGDr
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

                    otherlv_19=(Token)match(input,34,FOLLOW_18); 

                    				newLeafNode(otherlv_19, grammarAccess.getParallele4Access().getAmpersandKeyword_2_5());
                    			
                    // InternalDroneDSLLib.g:4186:4: ( (lv_d_20_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:4187:5: (lv_d_20_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:4187:5: (lv_d_20_0= ruleRGRD )
                    // InternalDroneDSLLib.g:4188:6: lv_d_20_0= ruleRGRD
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
                    // InternalDroneDSLLib.g:4207:3: ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSLLib.g:4207:3: ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) )
                    // InternalDroneDSLLib.g:4208:4: ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) )
                    {
                    // InternalDroneDSLLib.g:4208:4: ( (lv_a_21_0= ruleAR ) )
                    // InternalDroneDSLLib.g:4209:5: (lv_a_21_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:4209:5: (lv_a_21_0= ruleAR )
                    // InternalDroneDSLLib.g:4210:6: lv_a_21_0= ruleAR
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

                    otherlv_22=(Token)match(input,34,FOLLOW_19); 

                    				newLeafNode(otherlv_22, grammarAccess.getParallele4Access().getAmpersandKeyword_3_1());
                    			
                    // InternalDroneDSLLib.g:4231:4: ( (lv_b_23_0= ruleMD ) )
                    // InternalDroneDSLLib.g:4232:5: (lv_b_23_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:4232:5: (lv_b_23_0= ruleMD )
                    // InternalDroneDSLLib.g:4233:6: lv_b_23_0= ruleMD
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

                    otherlv_24=(Token)match(input,34,FOLLOW_18); 

                    				newLeafNode(otherlv_24, grammarAccess.getParallele4Access().getAmpersandKeyword_3_3());
                    			
                    // InternalDroneDSLLib.g:4254:4: ( (lv_c_25_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:4255:5: (lv_c_25_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:4255:5: (lv_c_25_0= ruleRGRD )
                    // InternalDroneDSLLib.g:4256:6: lv_c_25_0= ruleRGRD
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

                    otherlv_26=(Token)match(input,34,FOLLOW_16); 

                    				newLeafNode(otherlv_26, grammarAccess.getParallele4Access().getAmpersandKeyword_3_5());
                    			
                    // InternalDroneDSLLib.g:4277:4: ( (lv_d_27_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:4278:5: (lv_d_27_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:4278:5: (lv_d_27_0= ruleGDr )
                    // InternalDroneDSLLib.g:4279:6: lv_d_27_0= ruleGDr
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
                    // InternalDroneDSLLib.g:4298:3: ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSLLib.g:4298:3: ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) )
                    // InternalDroneDSLLib.g:4299:4: ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) )
                    {
                    // InternalDroneDSLLib.g:4299:4: ( (lv_a_28_0= ruleAR ) )
                    // InternalDroneDSLLib.g:4300:5: (lv_a_28_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:4300:5: (lv_a_28_0= ruleAR )
                    // InternalDroneDSLLib.g:4301:6: lv_a_28_0= ruleAR
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

                    otherlv_29=(Token)match(input,34,FOLLOW_18); 

                    				newLeafNode(otherlv_29, grammarAccess.getParallele4Access().getAmpersandKeyword_4_1());
                    			
                    // InternalDroneDSLLib.g:4322:4: ( (lv_b_30_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:4323:5: (lv_b_30_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:4323:5: (lv_b_30_0= ruleRGRD )
                    // InternalDroneDSLLib.g:4324:6: lv_b_30_0= ruleRGRD
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

                    otherlv_31=(Token)match(input,34,FOLLOW_19); 

                    				newLeafNode(otherlv_31, grammarAccess.getParallele4Access().getAmpersandKeyword_4_3());
                    			
                    // InternalDroneDSLLib.g:4345:4: ( (lv_c_32_0= ruleMD ) )
                    // InternalDroneDSLLib.g:4346:5: (lv_c_32_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:4346:5: (lv_c_32_0= ruleMD )
                    // InternalDroneDSLLib.g:4347:6: lv_c_32_0= ruleMD
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

                    otherlv_33=(Token)match(input,34,FOLLOW_16); 

                    				newLeafNode(otherlv_33, grammarAccess.getParallele4Access().getAmpersandKeyword_4_5());
                    			
                    // InternalDroneDSLLib.g:4368:4: ( (lv_d_34_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:4369:5: (lv_d_34_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:4369:5: (lv_d_34_0= ruleGDr )
                    // InternalDroneDSLLib.g:4370:6: lv_d_34_0= ruleGDr
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
                    // InternalDroneDSLLib.g:4389:3: ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) )
                    {
                    // InternalDroneDSLLib.g:4389:3: ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) )
                    // InternalDroneDSLLib.g:4390:4: ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) )
                    {
                    // InternalDroneDSLLib.g:4390:4: ( (lv_a_35_0= ruleAR ) )
                    // InternalDroneDSLLib.g:4391:5: (lv_a_35_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:4391:5: (lv_a_35_0= ruleAR )
                    // InternalDroneDSLLib.g:4392:6: lv_a_35_0= ruleAR
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

                    otherlv_36=(Token)match(input,34,FOLLOW_18); 

                    				newLeafNode(otherlv_36, grammarAccess.getParallele4Access().getAmpersandKeyword_5_1());
                    			
                    // InternalDroneDSLLib.g:4413:4: ( (lv_b_37_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:4414:5: (lv_b_37_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:4414:5: (lv_b_37_0= ruleRGRD )
                    // InternalDroneDSLLib.g:4415:6: lv_b_37_0= ruleRGRD
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

                    otherlv_38=(Token)match(input,34,FOLLOW_16); 

                    				newLeafNode(otherlv_38, grammarAccess.getParallele4Access().getAmpersandKeyword_5_3());
                    			
                    // InternalDroneDSLLib.g:4436:4: ( (lv_c_39_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:4437:5: (lv_c_39_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:4437:5: (lv_c_39_0= ruleGDr )
                    // InternalDroneDSLLib.g:4438:6: lv_c_39_0= ruleGDr
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

                    otherlv_40=(Token)match(input,34,FOLLOW_19); 

                    				newLeafNode(otherlv_40, grammarAccess.getParallele4Access().getAmpersandKeyword_5_5());
                    			
                    // InternalDroneDSLLib.g:4459:4: ( (lv_d_41_0= ruleMD ) )
                    // InternalDroneDSLLib.g:4460:5: (lv_d_41_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:4460:5: (lv_d_41_0= ruleMD )
                    // InternalDroneDSLLib.g:4461:6: lv_d_41_0= ruleMD
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
                    // InternalDroneDSLLib.g:4480:3: ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSLLib.g:4480:3: ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) )
                    // InternalDroneDSLLib.g:4481:4: ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) )
                    {
                    // InternalDroneDSLLib.g:4481:4: ( (lv_a_42_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:4482:5: (lv_a_42_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:4482:5: (lv_a_42_0= ruleGDr )
                    // InternalDroneDSLLib.g:4483:6: lv_a_42_0= ruleGDr
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

                    otherlv_43=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_43, grammarAccess.getParallele4Access().getAmpersandKeyword_6_1());
                    			
                    // InternalDroneDSLLib.g:4504:4: ( (lv_b_44_0= ruleAR ) )
                    // InternalDroneDSLLib.g:4505:5: (lv_b_44_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:4505:5: (lv_b_44_0= ruleAR )
                    // InternalDroneDSLLib.g:4506:6: lv_b_44_0= ruleAR
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

                    otherlv_45=(Token)match(input,34,FOLLOW_19); 

                    				newLeafNode(otherlv_45, grammarAccess.getParallele4Access().getAmpersandKeyword_6_3());
                    			
                    // InternalDroneDSLLib.g:4527:4: ( (lv_c_46_0= ruleMD ) )
                    // InternalDroneDSLLib.g:4528:5: (lv_c_46_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:4528:5: (lv_c_46_0= ruleMD )
                    // InternalDroneDSLLib.g:4529:6: lv_c_46_0= ruleMD
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

                    otherlv_47=(Token)match(input,34,FOLLOW_18); 

                    				newLeafNode(otherlv_47, grammarAccess.getParallele4Access().getAmpersandKeyword_6_5());
                    			
                    // InternalDroneDSLLib.g:4550:4: ( (lv_d_48_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:4551:5: (lv_d_48_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:4551:5: (lv_d_48_0= ruleRGRD )
                    // InternalDroneDSLLib.g:4552:6: lv_d_48_0= ruleRGRD
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
                    // InternalDroneDSLLib.g:4571:3: ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) )
                    {
                    // InternalDroneDSLLib.g:4571:3: ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) )
                    // InternalDroneDSLLib.g:4572:4: ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) )
                    {
                    // InternalDroneDSLLib.g:4572:4: ( (lv_a_49_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:4573:5: (lv_a_49_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:4573:5: (lv_a_49_0= ruleGDr )
                    // InternalDroneDSLLib.g:4574:6: lv_a_49_0= ruleGDr
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

                    otherlv_50=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_50, grammarAccess.getParallele4Access().getAmpersandKeyword_7_1());
                    			
                    // InternalDroneDSLLib.g:4595:4: ( (lv_b_51_0= ruleAR ) )
                    // InternalDroneDSLLib.g:4596:5: (lv_b_51_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:4596:5: (lv_b_51_0= ruleAR )
                    // InternalDroneDSLLib.g:4597:6: lv_b_51_0= ruleAR
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

                    otherlv_52=(Token)match(input,34,FOLLOW_18); 

                    				newLeafNode(otherlv_52, grammarAccess.getParallele4Access().getAmpersandKeyword_7_3());
                    			
                    // InternalDroneDSLLib.g:4618:4: ( (lv_c_53_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:4619:5: (lv_c_53_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:4619:5: (lv_c_53_0= ruleRGRD )
                    // InternalDroneDSLLib.g:4620:6: lv_c_53_0= ruleRGRD
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

                    otherlv_54=(Token)match(input,34,FOLLOW_19); 

                    				newLeafNode(otherlv_54, grammarAccess.getParallele4Access().getAmpersandKeyword_7_5());
                    			
                    // InternalDroneDSLLib.g:4641:4: ( (lv_d_55_0= ruleMD ) )
                    // InternalDroneDSLLib.g:4642:5: (lv_d_55_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:4642:5: (lv_d_55_0= ruleMD )
                    // InternalDroneDSLLib.g:4643:6: lv_d_55_0= ruleMD
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
                    // InternalDroneDSLLib.g:4662:3: ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSLLib.g:4662:3: ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) )
                    // InternalDroneDSLLib.g:4663:4: ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) )
                    {
                    // InternalDroneDSLLib.g:4663:4: ( (lv_a_56_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:4664:5: (lv_a_56_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:4664:5: (lv_a_56_0= ruleGDr )
                    // InternalDroneDSLLib.g:4665:6: lv_a_56_0= ruleGDr
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

                    otherlv_57=(Token)match(input,34,FOLLOW_19); 

                    				newLeafNode(otherlv_57, grammarAccess.getParallele4Access().getAmpersandKeyword_8_1());
                    			
                    // InternalDroneDSLLib.g:4686:4: ( (lv_b_58_0= ruleMD ) )
                    // InternalDroneDSLLib.g:4687:5: (lv_b_58_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:4687:5: (lv_b_58_0= ruleMD )
                    // InternalDroneDSLLib.g:4688:6: lv_b_58_0= ruleMD
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

                    otherlv_59=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_59, grammarAccess.getParallele4Access().getAmpersandKeyword_8_3());
                    			
                    // InternalDroneDSLLib.g:4709:4: ( (lv_c_60_0= ruleAR ) )
                    // InternalDroneDSLLib.g:4710:5: (lv_c_60_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:4710:5: (lv_c_60_0= ruleAR )
                    // InternalDroneDSLLib.g:4711:6: lv_c_60_0= ruleAR
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

                    otherlv_61=(Token)match(input,34,FOLLOW_18); 

                    				newLeafNode(otherlv_61, grammarAccess.getParallele4Access().getAmpersandKeyword_8_5());
                    			
                    // InternalDroneDSLLib.g:4732:4: ( (lv_d_62_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:4733:5: (lv_d_62_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:4733:5: (lv_d_62_0= ruleRGRD )
                    // InternalDroneDSLLib.g:4734:6: lv_d_62_0= ruleRGRD
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
                    // InternalDroneDSLLib.g:4753:3: ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) )
                    {
                    // InternalDroneDSLLib.g:4753:3: ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) )
                    // InternalDroneDSLLib.g:4754:4: ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) )
                    {
                    // InternalDroneDSLLib.g:4754:4: ( (lv_a_63_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:4755:5: (lv_a_63_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:4755:5: (lv_a_63_0= ruleGDr )
                    // InternalDroneDSLLib.g:4756:6: lv_a_63_0= ruleGDr
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

                    otherlv_64=(Token)match(input,34,FOLLOW_19); 

                    				newLeafNode(otherlv_64, grammarAccess.getParallele4Access().getAmpersandKeyword_9_1());
                    			
                    // InternalDroneDSLLib.g:4777:4: ( (lv_b_65_0= ruleMD ) )
                    // InternalDroneDSLLib.g:4778:5: (lv_b_65_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:4778:5: (lv_b_65_0= ruleMD )
                    // InternalDroneDSLLib.g:4779:6: lv_b_65_0= ruleMD
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

                    otherlv_66=(Token)match(input,34,FOLLOW_18); 

                    				newLeafNode(otherlv_66, grammarAccess.getParallele4Access().getAmpersandKeyword_9_3());
                    			
                    // InternalDroneDSLLib.g:4800:4: ( (lv_c_67_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:4801:5: (lv_c_67_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:4801:5: (lv_c_67_0= ruleRGRD )
                    // InternalDroneDSLLib.g:4802:6: lv_c_67_0= ruleRGRD
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

                    otherlv_68=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_68, grammarAccess.getParallele4Access().getAmpersandKeyword_9_5());
                    			
                    // InternalDroneDSLLib.g:4823:4: ( (lv_d_69_0= ruleAR ) )
                    // InternalDroneDSLLib.g:4824:5: (lv_d_69_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:4824:5: (lv_d_69_0= ruleAR )
                    // InternalDroneDSLLib.g:4825:6: lv_d_69_0= ruleAR
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
                    // InternalDroneDSLLib.g:4844:3: ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) )
                    {
                    // InternalDroneDSLLib.g:4844:3: ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) )
                    // InternalDroneDSLLib.g:4845:4: ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) )
                    {
                    // InternalDroneDSLLib.g:4845:4: ( (lv_a_70_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:4846:5: (lv_a_70_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:4846:5: (lv_a_70_0= ruleGDr )
                    // InternalDroneDSLLib.g:4847:6: lv_a_70_0= ruleGDr
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

                    otherlv_71=(Token)match(input,34,FOLLOW_18); 

                    				newLeafNode(otherlv_71, grammarAccess.getParallele4Access().getAmpersandKeyword_10_1());
                    			
                    // InternalDroneDSLLib.g:4868:4: ( (lv_b_72_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:4869:5: (lv_b_72_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:4869:5: (lv_b_72_0= ruleRGRD )
                    // InternalDroneDSLLib.g:4870:6: lv_b_72_0= ruleRGRD
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

                    otherlv_73=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_73, grammarAccess.getParallele4Access().getAmpersandKeyword_10_3());
                    			
                    // InternalDroneDSLLib.g:4891:4: ( (lv_c_74_0= ruleAR ) )
                    // InternalDroneDSLLib.g:4892:5: (lv_c_74_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:4892:5: (lv_c_74_0= ruleAR )
                    // InternalDroneDSLLib.g:4893:6: lv_c_74_0= ruleAR
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

                    otherlv_75=(Token)match(input,34,FOLLOW_19); 

                    				newLeafNode(otherlv_75, grammarAccess.getParallele4Access().getAmpersandKeyword_10_5());
                    			
                    // InternalDroneDSLLib.g:4914:4: ( (lv_d_76_0= ruleMD ) )
                    // InternalDroneDSLLib.g:4915:5: (lv_d_76_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:4915:5: (lv_d_76_0= ruleMD )
                    // InternalDroneDSLLib.g:4916:6: lv_d_76_0= ruleMD
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
                    // InternalDroneDSLLib.g:4935:3: ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) )
                    {
                    // InternalDroneDSLLib.g:4935:3: ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) )
                    // InternalDroneDSLLib.g:4936:4: ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) )
                    {
                    // InternalDroneDSLLib.g:4936:4: ( (lv_a_77_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:4937:5: (lv_a_77_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:4937:5: (lv_a_77_0= ruleGDr )
                    // InternalDroneDSLLib.g:4938:6: lv_a_77_0= ruleGDr
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

                    otherlv_78=(Token)match(input,34,FOLLOW_18); 

                    				newLeafNode(otherlv_78, grammarAccess.getParallele4Access().getAmpersandKeyword_11_1());
                    			
                    // InternalDroneDSLLib.g:4959:4: ( (lv_b_79_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:4960:5: (lv_b_79_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:4960:5: (lv_b_79_0= ruleRGRD )
                    // InternalDroneDSLLib.g:4961:6: lv_b_79_0= ruleRGRD
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

                    otherlv_80=(Token)match(input,34,FOLLOW_19); 

                    				newLeafNode(otherlv_80, grammarAccess.getParallele4Access().getAmpersandKeyword_11_3());
                    			
                    // InternalDroneDSLLib.g:4982:4: ( (lv_c_81_0= ruleMD ) )
                    // InternalDroneDSLLib.g:4983:5: (lv_c_81_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:4983:5: (lv_c_81_0= ruleMD )
                    // InternalDroneDSLLib.g:4984:6: lv_c_81_0= ruleMD
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

                    otherlv_82=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_82, grammarAccess.getParallele4Access().getAmpersandKeyword_11_5());
                    			
                    // InternalDroneDSLLib.g:5005:4: ( (lv_d_83_0= ruleAR ) )
                    // InternalDroneDSLLib.g:5006:5: (lv_d_83_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:5006:5: (lv_d_83_0= ruleAR )
                    // InternalDroneDSLLib.g:5007:6: lv_d_83_0= ruleAR
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
                    // InternalDroneDSLLib.g:5026:3: ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSLLib.g:5026:3: ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) )
                    // InternalDroneDSLLib.g:5027:4: ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) )
                    {
                    // InternalDroneDSLLib.g:5027:4: ( (lv_a_84_0= ruleMD ) )
                    // InternalDroneDSLLib.g:5028:5: (lv_a_84_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:5028:5: (lv_a_84_0= ruleMD )
                    // InternalDroneDSLLib.g:5029:6: lv_a_84_0= ruleMD
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

                    otherlv_85=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_85, grammarAccess.getParallele4Access().getAmpersandKeyword_12_1());
                    			
                    // InternalDroneDSLLib.g:5050:4: ( (lv_b_86_0= ruleAR ) )
                    // InternalDroneDSLLib.g:5051:5: (lv_b_86_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:5051:5: (lv_b_86_0= ruleAR )
                    // InternalDroneDSLLib.g:5052:6: lv_b_86_0= ruleAR
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

                    otherlv_87=(Token)match(input,34,FOLLOW_16); 

                    				newLeafNode(otherlv_87, grammarAccess.getParallele4Access().getAmpersandKeyword_12_3());
                    			
                    // InternalDroneDSLLib.g:5073:4: ( (lv_c_88_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:5074:5: (lv_c_88_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:5074:5: (lv_c_88_0= ruleGDr )
                    // InternalDroneDSLLib.g:5075:6: lv_c_88_0= ruleGDr
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

                    otherlv_89=(Token)match(input,34,FOLLOW_18); 

                    				newLeafNode(otherlv_89, grammarAccess.getParallele4Access().getAmpersandKeyword_12_5());
                    			
                    // InternalDroneDSLLib.g:5096:4: ( (lv_d_90_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:5097:5: (lv_d_90_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:5097:5: (lv_d_90_0= ruleRGRD )
                    // InternalDroneDSLLib.g:5098:6: lv_d_90_0= ruleRGRD
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
                    // InternalDroneDSLLib.g:5117:3: ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSLLib.g:5117:3: ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) )
                    // InternalDroneDSLLib.g:5118:4: ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) )
                    {
                    // InternalDroneDSLLib.g:5118:4: ( (lv_a_91_0= ruleMD ) )
                    // InternalDroneDSLLib.g:5119:5: (lv_a_91_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:5119:5: (lv_a_91_0= ruleMD )
                    // InternalDroneDSLLib.g:5120:6: lv_a_91_0= ruleMD
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

                    otherlv_92=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_92, grammarAccess.getParallele4Access().getAmpersandKeyword_13_1());
                    			
                    // InternalDroneDSLLib.g:5141:4: ( (lv_b_93_0= ruleAR ) )
                    // InternalDroneDSLLib.g:5142:5: (lv_b_93_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:5142:5: (lv_b_93_0= ruleAR )
                    // InternalDroneDSLLib.g:5143:6: lv_b_93_0= ruleAR
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

                    otherlv_94=(Token)match(input,34,FOLLOW_18); 

                    				newLeafNode(otherlv_94, grammarAccess.getParallele4Access().getAmpersandKeyword_13_3());
                    			
                    // InternalDroneDSLLib.g:5164:4: ( (lv_c_95_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:5165:5: (lv_c_95_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:5165:5: (lv_c_95_0= ruleRGRD )
                    // InternalDroneDSLLib.g:5166:6: lv_c_95_0= ruleRGRD
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

                    otherlv_96=(Token)match(input,34,FOLLOW_16); 

                    				newLeafNode(otherlv_96, grammarAccess.getParallele4Access().getAmpersandKeyword_13_5());
                    			
                    // InternalDroneDSLLib.g:5187:4: ( (lv_d_97_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:5188:5: (lv_d_97_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:5188:5: (lv_d_97_0= ruleGDr )
                    // InternalDroneDSLLib.g:5189:6: lv_d_97_0= ruleGDr
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
                    // InternalDroneDSLLib.g:5208:3: ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) )
                    {
                    // InternalDroneDSLLib.g:5208:3: ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) )
                    // InternalDroneDSLLib.g:5209:4: ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) )
                    {
                    // InternalDroneDSLLib.g:5209:4: ( (lv_a_98_0= ruleMD ) )
                    // InternalDroneDSLLib.g:5210:5: (lv_a_98_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:5210:5: (lv_a_98_0= ruleMD )
                    // InternalDroneDSLLib.g:5211:6: lv_a_98_0= ruleMD
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

                    otherlv_99=(Token)match(input,34,FOLLOW_16); 

                    				newLeafNode(otherlv_99, grammarAccess.getParallele4Access().getAmpersandKeyword_14_1());
                    			
                    // InternalDroneDSLLib.g:5232:4: ( (lv_b_100_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:5233:5: (lv_b_100_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:5233:5: (lv_b_100_0= ruleGDr )
                    // InternalDroneDSLLib.g:5234:6: lv_b_100_0= ruleGDr
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

                    otherlv_101=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_101, grammarAccess.getParallele4Access().getAmpersandKeyword_14_3());
                    			
                    // InternalDroneDSLLib.g:5255:4: ( (lv_c_102_0= ruleAR ) )
                    // InternalDroneDSLLib.g:5256:5: (lv_c_102_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:5256:5: (lv_c_102_0= ruleAR )
                    // InternalDroneDSLLib.g:5257:6: lv_c_102_0= ruleAR
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

                    otherlv_103=(Token)match(input,34,FOLLOW_18); 

                    				newLeafNode(otherlv_103, grammarAccess.getParallele4Access().getAmpersandKeyword_14_5());
                    			
                    // InternalDroneDSLLib.g:5278:4: ( (lv_d_104_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:5279:5: (lv_d_104_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:5279:5: (lv_d_104_0= ruleRGRD )
                    // InternalDroneDSLLib.g:5280:6: lv_d_104_0= ruleRGRD
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
                    // InternalDroneDSLLib.g:5299:3: ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) )
                    {
                    // InternalDroneDSLLib.g:5299:3: ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) )
                    // InternalDroneDSLLib.g:5300:4: ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) )
                    {
                    // InternalDroneDSLLib.g:5300:4: ( (lv_a_105_0= ruleMD ) )
                    // InternalDroneDSLLib.g:5301:5: (lv_a_105_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:5301:5: (lv_a_105_0= ruleMD )
                    // InternalDroneDSLLib.g:5302:6: lv_a_105_0= ruleMD
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

                    otherlv_106=(Token)match(input,34,FOLLOW_16); 

                    				newLeafNode(otherlv_106, grammarAccess.getParallele4Access().getAmpersandKeyword_15_1());
                    			
                    // InternalDroneDSLLib.g:5323:4: ( (lv_b_107_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:5324:5: (lv_b_107_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:5324:5: (lv_b_107_0= ruleGDr )
                    // InternalDroneDSLLib.g:5325:6: lv_b_107_0= ruleGDr
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

                    otherlv_108=(Token)match(input,34,FOLLOW_18); 

                    				newLeafNode(otherlv_108, grammarAccess.getParallele4Access().getAmpersandKeyword_15_3());
                    			
                    // InternalDroneDSLLib.g:5346:4: ( (lv_c_109_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:5347:5: (lv_c_109_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:5347:5: (lv_c_109_0= ruleRGRD )
                    // InternalDroneDSLLib.g:5348:6: lv_c_109_0= ruleRGRD
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

                    otherlv_110=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_110, grammarAccess.getParallele4Access().getAmpersandKeyword_15_5());
                    			
                    // InternalDroneDSLLib.g:5369:4: ( (lv_d_111_0= ruleAR ) )
                    // InternalDroneDSLLib.g:5370:5: (lv_d_111_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:5370:5: (lv_d_111_0= ruleAR )
                    // InternalDroneDSLLib.g:5371:6: lv_d_111_0= ruleAR
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
                    // InternalDroneDSLLib.g:5390:3: ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) )
                    {
                    // InternalDroneDSLLib.g:5390:3: ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) )
                    // InternalDroneDSLLib.g:5391:4: ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) )
                    {
                    // InternalDroneDSLLib.g:5391:4: ( (lv_a_112_0= ruleMD ) )
                    // InternalDroneDSLLib.g:5392:5: (lv_a_112_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:5392:5: (lv_a_112_0= ruleMD )
                    // InternalDroneDSLLib.g:5393:6: lv_a_112_0= ruleMD
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

                    otherlv_113=(Token)match(input,34,FOLLOW_18); 

                    				newLeafNode(otherlv_113, grammarAccess.getParallele4Access().getAmpersandKeyword_16_1());
                    			
                    // InternalDroneDSLLib.g:5414:4: ( (lv_b_114_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:5415:5: (lv_b_114_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:5415:5: (lv_b_114_0= ruleRGRD )
                    // InternalDroneDSLLib.g:5416:6: lv_b_114_0= ruleRGRD
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

                    otherlv_115=(Token)match(input,34,FOLLOW_16); 

                    				newLeafNode(otherlv_115, grammarAccess.getParallele4Access().getAmpersandKeyword_16_3());
                    			
                    // InternalDroneDSLLib.g:5437:4: ( (lv_c_116_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:5438:5: (lv_c_116_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:5438:5: (lv_c_116_0= ruleGDr )
                    // InternalDroneDSLLib.g:5439:6: lv_c_116_0= ruleGDr
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

                    otherlv_117=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_117, grammarAccess.getParallele4Access().getAmpersandKeyword_16_5());
                    			
                    // InternalDroneDSLLib.g:5460:4: ( (lv_d_118_0= ruleAR ) )
                    // InternalDroneDSLLib.g:5461:5: (lv_d_118_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:5461:5: (lv_d_118_0= ruleAR )
                    // InternalDroneDSLLib.g:5462:6: lv_d_118_0= ruleAR
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
                    // InternalDroneDSLLib.g:5481:3: ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSLLib.g:5481:3: ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) )
                    // InternalDroneDSLLib.g:5482:4: ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) )
                    {
                    // InternalDroneDSLLib.g:5482:4: ( (lv_a_119_0= ruleMD ) )
                    // InternalDroneDSLLib.g:5483:5: (lv_a_119_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:5483:5: (lv_a_119_0= ruleMD )
                    // InternalDroneDSLLib.g:5484:6: lv_a_119_0= ruleMD
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

                    otherlv_120=(Token)match(input,34,FOLLOW_18); 

                    				newLeafNode(otherlv_120, grammarAccess.getParallele4Access().getAmpersandKeyword_17_1());
                    			
                    // InternalDroneDSLLib.g:5505:4: ( (lv_b_121_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:5506:5: (lv_b_121_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:5506:5: (lv_b_121_0= ruleRGRD )
                    // InternalDroneDSLLib.g:5507:6: lv_b_121_0= ruleRGRD
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

                    otherlv_122=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_122, grammarAccess.getParallele4Access().getAmpersandKeyword_17_3());
                    			
                    // InternalDroneDSLLib.g:5528:4: ( (lv_c_123_0= ruleAR ) )
                    // InternalDroneDSLLib.g:5529:5: (lv_c_123_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:5529:5: (lv_c_123_0= ruleAR )
                    // InternalDroneDSLLib.g:5530:6: lv_c_123_0= ruleAR
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

                    otherlv_124=(Token)match(input,34,FOLLOW_16); 

                    				newLeafNode(otherlv_124, grammarAccess.getParallele4Access().getAmpersandKeyword_17_5());
                    			
                    // InternalDroneDSLLib.g:5551:4: ( (lv_d_125_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:5552:5: (lv_d_125_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:5552:5: (lv_d_125_0= ruleGDr )
                    // InternalDroneDSLLib.g:5553:6: lv_d_125_0= ruleGDr
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
                    // InternalDroneDSLLib.g:5572:3: ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSLLib.g:5572:3: ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) )
                    // InternalDroneDSLLib.g:5573:4: ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) )
                    {
                    // InternalDroneDSLLib.g:5573:4: ( (lv_a_126_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:5574:5: (lv_a_126_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:5574:5: (lv_a_126_0= ruleRGRD )
                    // InternalDroneDSLLib.g:5575:6: lv_a_126_0= ruleRGRD
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

                    otherlv_127=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_127, grammarAccess.getParallele4Access().getAmpersandKeyword_18_1());
                    			
                    // InternalDroneDSLLib.g:5596:4: ( (lv_b_128_0= ruleAR ) )
                    // InternalDroneDSLLib.g:5597:5: (lv_b_128_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:5597:5: (lv_b_128_0= ruleAR )
                    // InternalDroneDSLLib.g:5598:6: lv_b_128_0= ruleAR
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

                    otherlv_129=(Token)match(input,34,FOLLOW_19); 

                    				newLeafNode(otherlv_129, grammarAccess.getParallele4Access().getAmpersandKeyword_18_3());
                    			
                    // InternalDroneDSLLib.g:5619:4: ( (lv_c_130_0= ruleMD ) )
                    // InternalDroneDSLLib.g:5620:5: (lv_c_130_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:5620:5: (lv_c_130_0= ruleMD )
                    // InternalDroneDSLLib.g:5621:6: lv_c_130_0= ruleMD
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

                    otherlv_131=(Token)match(input,34,FOLLOW_16); 

                    				newLeafNode(otherlv_131, grammarAccess.getParallele4Access().getAmpersandKeyword_18_5());
                    			
                    // InternalDroneDSLLib.g:5642:4: ( (lv_d_132_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:5643:5: (lv_d_132_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:5643:5: (lv_d_132_0= ruleGDr )
                    // InternalDroneDSLLib.g:5644:6: lv_d_132_0= ruleGDr
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
                    // InternalDroneDSLLib.g:5663:3: ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) )
                    {
                    // InternalDroneDSLLib.g:5663:3: ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) )
                    // InternalDroneDSLLib.g:5664:4: ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) )
                    {
                    // InternalDroneDSLLib.g:5664:4: ( (lv_a_133_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:5665:5: (lv_a_133_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:5665:5: (lv_a_133_0= ruleRGRD )
                    // InternalDroneDSLLib.g:5666:6: lv_a_133_0= ruleRGRD
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

                    otherlv_134=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_134, grammarAccess.getParallele4Access().getAmpersandKeyword_19_1());
                    			
                    // InternalDroneDSLLib.g:5687:4: ( (lv_b_135_0= ruleAR ) )
                    // InternalDroneDSLLib.g:5688:5: (lv_b_135_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:5688:5: (lv_b_135_0= ruleAR )
                    // InternalDroneDSLLib.g:5689:6: lv_b_135_0= ruleAR
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

                    otherlv_136=(Token)match(input,34,FOLLOW_16); 

                    				newLeafNode(otherlv_136, grammarAccess.getParallele4Access().getAmpersandKeyword_19_3());
                    			
                    // InternalDroneDSLLib.g:5710:4: ( (lv_c_137_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:5711:5: (lv_c_137_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:5711:5: (lv_c_137_0= ruleGDr )
                    // InternalDroneDSLLib.g:5712:6: lv_c_137_0= ruleGDr
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

                    otherlv_138=(Token)match(input,34,FOLLOW_19); 

                    				newLeafNode(otherlv_138, grammarAccess.getParallele4Access().getAmpersandKeyword_19_5());
                    			
                    // InternalDroneDSLLib.g:5733:4: ( (lv_d_139_0= ruleMD ) )
                    // InternalDroneDSLLib.g:5734:5: (lv_d_139_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:5734:5: (lv_d_139_0= ruleMD )
                    // InternalDroneDSLLib.g:5735:6: lv_d_139_0= ruleMD
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
                    // InternalDroneDSLLib.g:5754:3: ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) )
                    {
                    // InternalDroneDSLLib.g:5754:3: ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) )
                    // InternalDroneDSLLib.g:5755:4: ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) )
                    {
                    // InternalDroneDSLLib.g:5755:4: ( (lv_a_140_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:5756:5: (lv_a_140_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:5756:5: (lv_a_140_0= ruleRGRD )
                    // InternalDroneDSLLib.g:5757:6: lv_a_140_0= ruleRGRD
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

                    otherlv_141=(Token)match(input,34,FOLLOW_19); 

                    				newLeafNode(otherlv_141, grammarAccess.getParallele4Access().getAmpersandKeyword_20_1());
                    			
                    // InternalDroneDSLLib.g:5778:4: ( (lv_b_142_0= ruleMD ) )
                    // InternalDroneDSLLib.g:5779:5: (lv_b_142_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:5779:5: (lv_b_142_0= ruleMD )
                    // InternalDroneDSLLib.g:5780:6: lv_b_142_0= ruleMD
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

                    otherlv_143=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_143, grammarAccess.getParallele4Access().getAmpersandKeyword_20_3());
                    			
                    // InternalDroneDSLLib.g:5801:4: ( (lv_c_144_0= ruleAR ) )
                    // InternalDroneDSLLib.g:5802:5: (lv_c_144_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:5802:5: (lv_c_144_0= ruleAR )
                    // InternalDroneDSLLib.g:5803:6: lv_c_144_0= ruleAR
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

                    otherlv_145=(Token)match(input,34,FOLLOW_16); 

                    				newLeafNode(otherlv_145, grammarAccess.getParallele4Access().getAmpersandKeyword_20_5());
                    			
                    // InternalDroneDSLLib.g:5824:4: ( (lv_d_146_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:5825:5: (lv_d_146_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:5825:5: (lv_d_146_0= ruleGDr )
                    // InternalDroneDSLLib.g:5826:6: lv_d_146_0= ruleGDr
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
                    // InternalDroneDSLLib.g:5845:3: ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) )
                    {
                    // InternalDroneDSLLib.g:5845:3: ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) )
                    // InternalDroneDSLLib.g:5846:4: ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) )
                    {
                    // InternalDroneDSLLib.g:5846:4: ( (lv_a_147_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:5847:5: (lv_a_147_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:5847:5: (lv_a_147_0= ruleRGRD )
                    // InternalDroneDSLLib.g:5848:6: lv_a_147_0= ruleRGRD
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

                    otherlv_148=(Token)match(input,34,FOLLOW_19); 

                    				newLeafNode(otherlv_148, grammarAccess.getParallele4Access().getAmpersandKeyword_21_1());
                    			
                    // InternalDroneDSLLib.g:5869:4: ( (lv_b_149_0= ruleMD ) )
                    // InternalDroneDSLLib.g:5870:5: (lv_b_149_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:5870:5: (lv_b_149_0= ruleMD )
                    // InternalDroneDSLLib.g:5871:6: lv_b_149_0= ruleMD
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

                    otherlv_150=(Token)match(input,34,FOLLOW_16); 

                    				newLeafNode(otherlv_150, grammarAccess.getParallele4Access().getAmpersandKeyword_21_3());
                    			
                    // InternalDroneDSLLib.g:5892:4: ( (lv_c_151_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:5893:5: (lv_c_151_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:5893:5: (lv_c_151_0= ruleGDr )
                    // InternalDroneDSLLib.g:5894:6: lv_c_151_0= ruleGDr
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

                    otherlv_152=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_152, grammarAccess.getParallele4Access().getAmpersandKeyword_21_5());
                    			
                    // InternalDroneDSLLib.g:5915:4: ( (lv_d_153_0= ruleAR ) )
                    // InternalDroneDSLLib.g:5916:5: (lv_d_153_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:5916:5: (lv_d_153_0= ruleAR )
                    // InternalDroneDSLLib.g:5917:6: lv_d_153_0= ruleAR
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
                    // InternalDroneDSLLib.g:5936:3: ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) )
                    {
                    // InternalDroneDSLLib.g:5936:3: ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) )
                    // InternalDroneDSLLib.g:5937:4: ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) )
                    {
                    // InternalDroneDSLLib.g:5937:4: ( (lv_a_154_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:5938:5: (lv_a_154_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:5938:5: (lv_a_154_0= ruleRGRD )
                    // InternalDroneDSLLib.g:5939:6: lv_a_154_0= ruleRGRD
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

                    otherlv_155=(Token)match(input,34,FOLLOW_16); 

                    				newLeafNode(otherlv_155, grammarAccess.getParallele4Access().getAmpersandKeyword_22_1());
                    			
                    // InternalDroneDSLLib.g:5960:4: ( (lv_b_156_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:5961:5: (lv_b_156_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:5961:5: (lv_b_156_0= ruleGDr )
                    // InternalDroneDSLLib.g:5962:6: lv_b_156_0= ruleGDr
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

                    otherlv_157=(Token)match(input,34,FOLLOW_19); 

                    				newLeafNode(otherlv_157, grammarAccess.getParallele4Access().getAmpersandKeyword_22_3());
                    			
                    // InternalDroneDSLLib.g:5983:4: ( (lv_c_158_0= ruleMD ) )
                    // InternalDroneDSLLib.g:5984:5: (lv_c_158_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:5984:5: (lv_c_158_0= ruleMD )
                    // InternalDroneDSLLib.g:5985:6: lv_c_158_0= ruleMD
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

                    otherlv_159=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_159, grammarAccess.getParallele4Access().getAmpersandKeyword_22_5());
                    			
                    // InternalDroneDSLLib.g:6006:4: ( (lv_d_160_0= ruleAR ) )
                    // InternalDroneDSLLib.g:6007:5: (lv_d_160_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:6007:5: (lv_d_160_0= ruleAR )
                    // InternalDroneDSLLib.g:6008:6: lv_d_160_0= ruleAR
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
                    // InternalDroneDSLLib.g:6027:3: ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) )
                    {
                    // InternalDroneDSLLib.g:6027:3: ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) )
                    // InternalDroneDSLLib.g:6028:4: ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) )
                    {
                    // InternalDroneDSLLib.g:6028:4: ( (lv_a_161_0= ruleRGRD ) )
                    // InternalDroneDSLLib.g:6029:5: (lv_a_161_0= ruleRGRD )
                    {
                    // InternalDroneDSLLib.g:6029:5: (lv_a_161_0= ruleRGRD )
                    // InternalDroneDSLLib.g:6030:6: lv_a_161_0= ruleRGRD
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

                    otherlv_162=(Token)match(input,34,FOLLOW_16); 

                    				newLeafNode(otherlv_162, grammarAccess.getParallele4Access().getAmpersandKeyword_23_1());
                    			
                    // InternalDroneDSLLib.g:6051:4: ( (lv_b_163_0= ruleGDr ) )
                    // InternalDroneDSLLib.g:6052:5: (lv_b_163_0= ruleGDr )
                    {
                    // InternalDroneDSLLib.g:6052:5: (lv_b_163_0= ruleGDr )
                    // InternalDroneDSLLib.g:6053:6: lv_b_163_0= ruleGDr
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

                    otherlv_164=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_164, grammarAccess.getParallele4Access().getAmpersandKeyword_23_3());
                    			
                    // InternalDroneDSLLib.g:6074:4: ( (lv_c_165_0= ruleAR ) )
                    // InternalDroneDSLLib.g:6075:5: (lv_c_165_0= ruleAR )
                    {
                    // InternalDroneDSLLib.g:6075:5: (lv_c_165_0= ruleAR )
                    // InternalDroneDSLLib.g:6076:6: lv_c_165_0= ruleAR
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

                    otherlv_166=(Token)match(input,34,FOLLOW_19); 

                    				newLeafNode(otherlv_166, grammarAccess.getParallele4Access().getAmpersandKeyword_23_5());
                    			
                    // InternalDroneDSLLib.g:6097:4: ( (lv_d_167_0= ruleMD ) )
                    // InternalDroneDSLLib.g:6098:5: (lv_d_167_0= ruleMD )
                    {
                    // InternalDroneDSLLib.g:6098:5: (lv_d_167_0= ruleMD )
                    // InternalDroneDSLLib.g:6099:6: lv_d_167_0= ruleMD
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
    static final String dfa_2s = "\1\4\1\uffff\10\4\3\uffff\20\24\10\4\20\25\10\4\1\uffff";
    static final String dfa_3s = "\1\35\1\uffff\10\5\3\uffff\20\24\10\6\20\25\10\42\1\uffff";
    static final String dfa_4s = "\1\uffff\1\1\10\uffff\1\2\1\4\1\5\60\uffff\1\3";
    static final String dfa_5s = "\76\uffff}>";
    static final String[] dfa_6s = {
            "\1\13\11\uffff\1\1\1\uffff\1\1\2\14\1\4\2\uffff\1\5\1\2\1\3\1\6\1\7\1\10\1\11\1\12",
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
            "\1\12\11\uffff\1\12\1\uffff\4\12\2\uffff\10\12\3\uffff\1\12\1\75",
            "\1\12\11\uffff\1\12\1\uffff\4\12\2\uffff\10\12\3\uffff\1\12\1\75",
            "\1\12\11\uffff\1\12\1\uffff\4\12\2\uffff\10\12\3\uffff\1\12\1\75",
            "\1\12\11\uffff\1\12\1\uffff\4\12\2\uffff\10\12\3\uffff\1\12\1\75",
            "\1\12\11\uffff\1\12\1\uffff\4\12\2\uffff\10\12\3\uffff\1\12\1\75",
            "\1\12\11\uffff\1\12\1\uffff\4\12\2\uffff\10\12\3\uffff\1\12\1\75",
            "\1\12\11\uffff\1\12\1\uffff\4\12\2\uffff\10\12\3\uffff\1\12\1\75",
            "\1\12\11\uffff\1\12\1\uffff\4\12\2\uffff\10\12\3\uffff\1\12\1\75",
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
            return "1370:5: (lv_body_4_1= ruleVarDecl | lv_body_4_2= ruleCommandeBasique | lv_body_4_3= ruleParallele | lv_body_4_4= ruleFonctionCall | lv_body_4_5= ruleDecollerAtterrir )";
        }
    }
    static final String dfa_7s = "\u0244\uffff";
    static final String dfa_8s = "\u00cd\uffff\30\u00e6\u012d\uffff\60\u0242\2\uffff";
    static final String dfa_9s = "\1\23\10\4\20\24\10\4\20\25\10\42\1\27\3\23\30\4\60\24\30\4\60\25\30\4\1\31\1\uffff\2\27\1\23\1\27\1\23\1\27\3\23\1\31\1\23\60\4\140\24\60\4\140\25\60\4\2\uffff";
    static final String dfa_10s = "\1\34\10\5\20\24\10\6\20\25\10\42\2\34\1\32\1\34\30\5\60\24\30\6\60\25\30\42\1\34\1\uffff\1\34\1\32\2\34\1\30\1\32\1\30\2\32\2\34\60\5\140\24\60\6\140\25\60\42\2\uffff";
    static final String dfa_11s = "\u00e6\uffff\1\1\u015b\uffff\1\2\1\3";
    static final String dfa_12s = "\u0244\uffff}>";
    static final String[] dfa_13s = {
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
            "\1\75\1\76\1\77\1\100\1\101\1\102",
            "\1\105\2\uffff\1\106\1\103\1\104\2\uffff\1\107\1\110",
            "\1\111\2\uffff\1\112\1\115\1\116\1\113\1\114",
            "\1\121\2\uffff\1\122\2\uffff\1\123\1\124\1\117\1\120",
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
            "\1\u00e6\11\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00e5",
            "\1\u00e6\11\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00e5",
            "\1\u00e6\11\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00e7",
            "\1\u00e6\11\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00e7",
            "\1\u00e6\11\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00e8",
            "\1\u00e6\11\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00e8",
            "\1\u00e6\11\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00e9",
            "\1\u00e6\11\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00e9",
            "\1\u00e6\11\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00ea",
            "\1\u00e6\11\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00ea",
            "\1\u00e6\11\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00eb",
            "\1\u00e6\11\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00eb",
            "\1\u00e6\11\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00ec",
            "\1\u00e6\11\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00ec",
            "\1\u00e6\11\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00ed",
            "\1\u00e6\11\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00ed",
            "\1\u00e6\11\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00ee",
            "\1\u00e6\11\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00ee",
            "\1\u00e6\11\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00ef",
            "\1\u00e6\11\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00ef",
            "\1\u00e6\11\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00f0",
            "\1\u00e6\11\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00f0",
            "\1\u00e6\11\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00f1",
            "\1\u00e6\11\uffff\1\u00e6\1\uffff\4\u00e6\2\uffff\10\u00e6\3\uffff\1\u00e6\1\u00f1",
            "\1\u00f4\1\u00f5\1\u00f2\1\u00f3",
            "",
            "\1\u00f6\1\u00f7\2\uffff\1\u00f8\1\u00f9",
            "\1\u00fa\1\u00fb\1\u00fc\1\u00fd",
            "\1\u00fe\2\uffff\1\u00ff\4\uffff\1\u0100\1\u0101",
            "\1\u0102\1\u0103\2\uffff\1\u0104\1\u0105",
            "\1\u0108\2\uffff\1\u0109\1\u0106\1\u0107",
            "\1\u010c\1\u010d\1\u010a\1\u010b",
            "\1\u010e\2\uffff\1\u010f\1\u0110\1\u0111",
            "\1\u0112\2\uffff\1\u0113\2\uffff\1\u0114\1\u0115",
            "\1\u0118\2\uffff\1\u0119\2\uffff\1\u0116\1\u0117",
            "\1\u011a\1\u011b\1\u011c\1\u011d",
            "\1\u0120\2\uffff\1\u0121\4\uffff\1\u011e\1\u011f",
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
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
            "\1\u0242\11\uffff\1\u0242\1\uffff\4\u0242\2\uffff\10\u0242\3\uffff\1\u0242\1\u0243",
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
            return "1680:2: (this_Parallele2_0= ruleParallele2 | this_Parallele3_1= ruleParallele3 | this_Parallele4_2= ruleParallele4 )";
        }
    }
    static final String dfa_14s = "\111\uffff";
    static final String dfa_15s = "\1\23\10\4\20\24\10\4\20\25\10\42\1\27\3\23\14\uffff";
    static final String dfa_16s = "\1\34\10\5\20\24\10\6\20\25\10\42\2\34\1\32\1\34\14\uffff";
    static final String dfa_17s = "\75\uffff\1\1\1\3\1\2\1\5\1\4\1\6\1\7\1\11\1\10\1\13\1\12\1\14";
    static final String dfa_18s = "\111\uffff}>";
    static final String[] dfa_19s = {
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
            return "1725:2: ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) )";
        }
    }
    static final String dfa_20s = "\u0109\uffff";
    static final String dfa_21s = "\1\23\10\4\20\24\10\4\20\25\10\42\2\23\1\27\1\23\30\4\60\24\30\4\60\25\30\42\2\23\1\31\2\23\2\27\1\31\1\27\1\23\1\27\1\23\30\uffff";
    static final String dfa_22s = "\1\34\10\5\20\24\10\6\20\25\10\42\3\34\1\32\30\5\60\24\30\6\60\25\30\42\1\34\1\32\1\34\1\30\2\34\1\32\2\34\1\30\2\32\30\uffff";
    static final String dfa_23s = "\u00f1\uffff\1\2\1\1\1\5\1\6\1\3\1\4\1\14\1\13\1\10\1\7\1\11\1\12\1\22\1\21\1\15\1\16\1\17\1\20\1\30\1\27\1\25\1\26\1\23\1\24";
    static final String dfa_24s = "\u0109\uffff}>";
    static final String[] dfa_25s = {
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
            "\1\107\2\uffff\1\110\1\105\1\106\2\uffff\1\103\1\104",
            "\1\113\1\114\1\115\1\116\1\111\1\112",
            "\1\121\2\uffff\1\122\1\123\1\124\1\117\1\120",
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
            "\1\u00f2\2\uffff\1\u00f2\4\uffff\2\u00f1",
            "\1\u00f3\2\uffff\1\u00f3\2\uffff\2\u00f4",
            "\2\u00f5\2\u00f6",
            "\1\u00f7\2\uffff\1\u00f7\2\u00f8",
            "\1\u00fa\2\uffff\1\u00fa\4\uffff\2\u00f9",
            "\2\u00fb\2\uffff\2\u00fc",
            "\2\u00fd\2\u00fe",
            "\2\u00ff\2\u0100",
            "\2\u0101\2\uffff\2\u0102",
            "\1\u0104\2\uffff\1\u0104\2\u0103",
            "\2\u0105\2\u0106",
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
            return "2283:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) )";
        }
    }
    static final String dfa_26s = "\1\23\10\4\20\24\10\4\20\25\10\42\2\23\1\27\1\23\30\4\60\24\30\4\60\25\30\42\1\23\1\31\2\23\1\27\1\23\2\27\1\31\2\23\1\27\30\uffff";
    static final String dfa_27s = "\1\34\10\5\20\24\10\6\20\25\10\42\3\34\1\32\30\5\60\24\30\6\60\25\30\42\2\34\1\32\2\34\1\30\1\34\1\32\1\34\1\30\2\32\30\uffff";
    static final String dfa_28s = "\u00f1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\17\1\20\1\21\1\22\1\15\1\16\1\27\1\30\1\23\1\24\1\25\1\26";
    static final String[] dfa_29s = {
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
            "\1\105\2\uffff\1\106\1\103\1\104\2\uffff\1\107\1\110",
            "\1\115\1\116\1\111\1\112\1\113\1\114",
            "\1\123\2\uffff\1\124\1\121\1\122\1\117\1\120",
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
            "\1\u00f7\2\uffff\1\u00f7\4\uffff\2\u00f8",
            "\2\u00f9\2\uffff\2\u00fa",
            "\1\u00fc\2\uffff\1\u00fc\2\u00fb",
            "\2\u00fd\2\uffff\2\u00fe",
            "\2\u0100\2\u00ff",
            "\2\u0101\2\u0102",
            "\1\u0103\2\uffff\1\u0103\2\u0104",
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
            return "3933:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) otherlv_5= '&' ( (lv_d_6_0= ruleRGRD ) ) ) | ( ( (lv_a_7_0= ruleAR ) ) otherlv_8= '&' ( (lv_b_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_c_11_0= ruleRGRD ) ) otherlv_12= '&' ( (lv_d_13_0= ruleMD ) ) ) | ( ( (lv_a_14_0= ruleAR ) ) otherlv_15= '&' ( (lv_b_16_0= ruleMD ) ) otherlv_17= '&' ( (lv_c_18_0= ruleGDr ) ) otherlv_19= '&' ( (lv_d_20_0= ruleRGRD ) ) ) | ( ( (lv_a_21_0= ruleAR ) ) otherlv_22= '&' ( (lv_b_23_0= ruleMD ) ) otherlv_24= '&' ( (lv_c_25_0= ruleRGRD ) ) otherlv_26= '&' ( (lv_d_27_0= ruleGDr ) ) ) | ( ( (lv_a_28_0= ruleAR ) ) otherlv_29= '&' ( (lv_b_30_0= ruleRGRD ) ) otherlv_31= '&' ( (lv_c_32_0= ruleMD ) ) otherlv_33= '&' ( (lv_d_34_0= ruleGDr ) ) ) | ( ( (lv_a_35_0= ruleAR ) ) otherlv_36= '&' ( (lv_b_37_0= ruleRGRD ) ) otherlv_38= '&' ( (lv_c_39_0= ruleGDr ) ) otherlv_40= '&' ( (lv_d_41_0= ruleMD ) ) ) | ( ( (lv_a_42_0= ruleGDr ) ) otherlv_43= '&' ( (lv_b_44_0= ruleAR ) ) otherlv_45= '&' ( (lv_c_46_0= ruleMD ) ) otherlv_47= '&' ( (lv_d_48_0= ruleRGRD ) ) ) | ( ( (lv_a_49_0= ruleGDr ) ) otherlv_50= '&' ( (lv_b_51_0= ruleAR ) ) otherlv_52= '&' ( (lv_c_53_0= ruleRGRD ) ) otherlv_54= '&' ( (lv_d_55_0= ruleMD ) ) ) | ( ( (lv_a_56_0= ruleGDr ) ) otherlv_57= '&' ( (lv_b_58_0= ruleMD ) ) otherlv_59= '&' ( (lv_c_60_0= ruleAR ) ) otherlv_61= '&' ( (lv_d_62_0= ruleRGRD ) ) ) | ( ( (lv_a_63_0= ruleGDr ) ) otherlv_64= '&' ( (lv_b_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_c_67_0= ruleRGRD ) ) otherlv_68= '&' ( (lv_d_69_0= ruleAR ) ) ) | ( ( (lv_a_70_0= ruleGDr ) ) otherlv_71= '&' ( (lv_b_72_0= ruleRGRD ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) otherlv_75= '&' ( (lv_d_76_0= ruleMD ) ) ) | ( ( (lv_a_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_b_79_0= ruleRGRD ) ) otherlv_80= '&' ( (lv_c_81_0= ruleMD ) ) otherlv_82= '&' ( (lv_d_83_0= ruleAR ) ) ) | ( ( (lv_a_84_0= ruleMD ) ) otherlv_85= '&' ( (lv_b_86_0= ruleAR ) ) otherlv_87= '&' ( (lv_c_88_0= ruleGDr ) ) otherlv_89= '&' ( (lv_d_90_0= ruleRGRD ) ) ) | ( ( (lv_a_91_0= ruleMD ) ) otherlv_92= '&' ( (lv_b_93_0= ruleAR ) ) otherlv_94= '&' ( (lv_c_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_d_97_0= ruleGDr ) ) ) | ( ( (lv_a_98_0= ruleMD ) ) otherlv_99= '&' ( (lv_b_100_0= ruleGDr ) ) otherlv_101= '&' ( (lv_c_102_0= ruleAR ) ) otherlv_103= '&' ( (lv_d_104_0= ruleRGRD ) ) ) | ( ( (lv_a_105_0= ruleMD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleGDr ) ) otherlv_108= '&' ( (lv_c_109_0= ruleRGRD ) ) otherlv_110= '&' ( (lv_d_111_0= ruleAR ) ) ) | ( ( (lv_a_112_0= ruleMD ) ) otherlv_113= '&' ( (lv_b_114_0= ruleRGRD ) ) otherlv_115= '&' ( (lv_c_116_0= ruleGDr ) ) otherlv_117= '&' ( (lv_d_118_0= ruleAR ) ) ) | ( ( (lv_a_119_0= ruleMD ) ) otherlv_120= '&' ( (lv_b_121_0= ruleRGRD ) ) otherlv_122= '&' ( (lv_c_123_0= ruleAR ) ) otherlv_124= '&' ( (lv_d_125_0= ruleGDr ) ) ) | ( ( (lv_a_126_0= ruleRGRD ) ) otherlv_127= '&' ( (lv_b_128_0= ruleAR ) ) otherlv_129= '&' ( (lv_c_130_0= ruleMD ) ) otherlv_131= '&' ( (lv_d_132_0= ruleGDr ) ) ) | ( ( (lv_a_133_0= ruleRGRD ) ) otherlv_134= '&' ( (lv_b_135_0= ruleAR ) ) otherlv_136= '&' ( (lv_c_137_0= ruleGDr ) ) otherlv_138= '&' ( (lv_d_139_0= ruleMD ) ) ) | ( ( (lv_a_140_0= ruleRGRD ) ) otherlv_141= '&' ( (lv_b_142_0= ruleMD ) ) otherlv_143= '&' ( (lv_c_144_0= ruleAR ) ) otherlv_145= '&' ( (lv_d_146_0= ruleGDr ) ) ) | ( ( (lv_a_147_0= ruleRGRD ) ) otherlv_148= '&' ( (lv_b_149_0= ruleMD ) ) otherlv_150= '&' ( (lv_c_151_0= ruleGDr ) ) otherlv_152= '&' ( (lv_d_153_0= ruleAR ) ) ) | ( ( (lv_a_154_0= ruleRGRD ) ) otherlv_155= '&' ( (lv_b_156_0= ruleGDr ) ) otherlv_157= '&' ( (lv_c_158_0= ruleMD ) ) otherlv_159= '&' ( (lv_d_160_0= ruleAR ) ) ) | ( ( (lv_a_161_0= ruleRGRD ) ) otherlv_162= '&' ( (lv_b_163_0= ruleGDr ) ) otherlv_164= '&' ( (lv_c_165_0= ruleAR ) ) otherlv_166= '&' ( (lv_d_167_0= ruleMD ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000023FCF4010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000480000L});

}