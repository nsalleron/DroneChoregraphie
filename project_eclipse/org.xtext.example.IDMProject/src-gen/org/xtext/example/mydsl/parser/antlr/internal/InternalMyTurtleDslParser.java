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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INCLUDE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\n'", "'func'", "'main'", "'{'", "'}'", "'&'", "'import'", "'<'", "'>;'", "'decoller'", "'('", "')'", "'atterrir'", "'monter'", "','", "'descendre'", "'avancer'", "'reculer'", "'gauche'", "'droite'", "'rotation_gauche'", "'rotation_droite'", "'Seconde'", "'='", "'Pourcent'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_INCLUDE=4;

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
    // InternalMyTurtleDsl.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_includes_0_0= ruleIncludes ) )* (otherlv_1= '\\n' )* otherlv_2= 'func' otherlv_3= 'main' otherlv_4= '{' ruleStart (otherlv_6= '\\n' )* ( ( (lv_SeconDec_7_0= ruleIntDecl ) ) | ( (lv_PourDec_8_0= rulePourcentDecl ) ) | ( (lv_statements_9_0= ruleStatement ) ) | ( (lv_fonctions_10_0= ruleFonctionCall ) ) | ( ( (lv_parallele_11_1= ruleParallele2 | lv_parallele_11_2= ruleParallele3 ) ) ) )* (otherlv_12= '\\n' )* ruleEnd (otherlv_14= '\\n' )* otherlv_15= '}' (otherlv_16= '\\n' )* ( (lv_fonctions_17_0= ruleFonctionDecl ) )* (otherlv_18= '\\n' )* )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_includes_0_0 = null;

        EObject lv_SeconDec_7_0 = null;

        EObject lv_PourDec_8_0 = null;

        EObject lv_statements_9_0 = null;

        EObject lv_fonctions_10_0 = null;

        EObject lv_parallele_11_1 = null;

        EObject lv_parallele_11_2 = null;

        EObject lv_fonctions_17_0 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:77:2: ( ( ( (lv_includes_0_0= ruleIncludes ) )* (otherlv_1= '\\n' )* otherlv_2= 'func' otherlv_3= 'main' otherlv_4= '{' ruleStart (otherlv_6= '\\n' )* ( ( (lv_SeconDec_7_0= ruleIntDecl ) ) | ( (lv_PourDec_8_0= rulePourcentDecl ) ) | ( (lv_statements_9_0= ruleStatement ) ) | ( (lv_fonctions_10_0= ruleFonctionCall ) ) | ( ( (lv_parallele_11_1= ruleParallele2 | lv_parallele_11_2= ruleParallele3 ) ) ) )* (otherlv_12= '\\n' )* ruleEnd (otherlv_14= '\\n' )* otherlv_15= '}' (otherlv_16= '\\n' )* ( (lv_fonctions_17_0= ruleFonctionDecl ) )* (otherlv_18= '\\n' )* )* )
            // InternalMyTurtleDsl.g:78:2: ( ( (lv_includes_0_0= ruleIncludes ) )* (otherlv_1= '\\n' )* otherlv_2= 'func' otherlv_3= 'main' otherlv_4= '{' ruleStart (otherlv_6= '\\n' )* ( ( (lv_SeconDec_7_0= ruleIntDecl ) ) | ( (lv_PourDec_8_0= rulePourcentDecl ) ) | ( (lv_statements_9_0= ruleStatement ) ) | ( (lv_fonctions_10_0= ruleFonctionCall ) ) | ( ( (lv_parallele_11_1= ruleParallele2 | lv_parallele_11_2= ruleParallele3 ) ) ) )* (otherlv_12= '\\n' )* ruleEnd (otherlv_14= '\\n' )* otherlv_15= '}' (otherlv_16= '\\n' )* ( (lv_fonctions_17_0= ruleFonctionDecl ) )* (otherlv_18= '\\n' )* )*
            {
            // InternalMyTurtleDsl.g:78:2: ( ( (lv_includes_0_0= ruleIncludes ) )* (otherlv_1= '\\n' )* otherlv_2= 'func' otherlv_3= 'main' otherlv_4= '{' ruleStart (otherlv_6= '\\n' )* ( ( (lv_SeconDec_7_0= ruleIntDecl ) ) | ( (lv_PourDec_8_0= rulePourcentDecl ) ) | ( (lv_statements_9_0= ruleStatement ) ) | ( (lv_fonctions_10_0= ruleFonctionCall ) ) | ( ( (lv_parallele_11_1= ruleParallele2 | lv_parallele_11_2= ruleParallele3 ) ) ) )* (otherlv_12= '\\n' )* ruleEnd (otherlv_14= '\\n' )* otherlv_15= '}' (otherlv_16= '\\n' )* ( (lv_fonctions_17_0= ruleFonctionDecl ) )* (otherlv_18= '\\n' )* )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=12 && LA11_0<=13)||LA11_0==18) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:79:3: ( (lv_includes_0_0= ruleIncludes ) )* (otherlv_1= '\\n' )* otherlv_2= 'func' otherlv_3= 'main' otherlv_4= '{' ruleStart (otherlv_6= '\\n' )* ( ( (lv_SeconDec_7_0= ruleIntDecl ) ) | ( (lv_PourDec_8_0= rulePourcentDecl ) ) | ( (lv_statements_9_0= ruleStatement ) ) | ( (lv_fonctions_10_0= ruleFonctionCall ) ) | ( ( (lv_parallele_11_1= ruleParallele2 | lv_parallele_11_2= ruleParallele3 ) ) ) )* (otherlv_12= '\\n' )* ruleEnd (otherlv_14= '\\n' )* otherlv_15= '}' (otherlv_16= '\\n' )* ( (lv_fonctions_17_0= ruleFonctionDecl ) )* (otherlv_18= '\\n' )*
            	    {
            	    // InternalMyTurtleDsl.g:79:3: ( (lv_includes_0_0= ruleIncludes ) )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==18) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalMyTurtleDsl.g:80:4: (lv_includes_0_0= ruleIncludes )
            	    	    {
            	    	    // InternalMyTurtleDsl.g:80:4: (lv_includes_0_0= ruleIncludes )
            	    	    // InternalMyTurtleDsl.g:81:5: lv_includes_0_0= ruleIncludes
            	    	    {

            	    	    					newCompositeNode(grammarAccess.getModelAccess().getIncludesIncludesParserRuleCall_0_0());
            	    	    				
            	    	    pushFollow(FOLLOW_3);
            	    	    lv_includes_0_0=ruleIncludes();

            	    	    state._fsp--;


            	    	    					if (current==null) {
            	    	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    	    					}
            	    	    					add(
            	    	    						current,
            	    	    						"includes",
            	    	    						lv_includes_0_0,
            	    	    						"org.xtext.example.mydsl.MyTurtleDsl.Includes");
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

            	        if ( (LA2_0==12) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalMyTurtleDsl.g:99:4: otherlv_1= '\\n'
            	    	    {
            	    	    otherlv_1=(Token)match(input,12,FOLLOW_4); 

            	    	    				newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLineFeedKeyword_1());
            	    	    			

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);

            	    otherlv_2=(Token)match(input,13,FOLLOW_5); 

            	    			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getFuncKeyword_2());
            	    		
            	    otherlv_3=(Token)match(input,14,FOLLOW_6); 

            	    			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getMainKeyword_3());
            	    		
            	    otherlv_4=(Token)match(input,15,FOLLOW_7); 

            	    			newLeafNode(otherlv_4, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_4());
            	    		

            	    			newCompositeNode(grammarAccess.getModelAccess().getStartParserRuleCall_5());
            	    		
            	    pushFollow(FOLLOW_8);
            	    ruleStart();

            	    state._fsp--;


            	    			afterParserOrEnumRuleCall();
            	    		
            	    // InternalMyTurtleDsl.g:123:3: (otherlv_6= '\\n' )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==12) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalMyTurtleDsl.g:124:4: otherlv_6= '\\n'
            	    	    {
            	    	    otherlv_6=(Token)match(input,12,FOLLOW_8); 

            	    	    				newLeafNode(otherlv_6, grammarAccess.getModelAccess().getLineFeedKeyword_6());
            	    	    			

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);

            	    // InternalMyTurtleDsl.g:129:3: ( ( (lv_SeconDec_7_0= ruleIntDecl ) ) | ( (lv_PourDec_8_0= rulePourcentDecl ) ) | ( (lv_statements_9_0= ruleStatement ) ) | ( (lv_fonctions_10_0= ruleFonctionCall ) ) | ( ( (lv_parallele_11_1= ruleParallele2 | lv_parallele_11_2= ruleParallele3 ) ) ) )*
            	    loop5:
            	    do {
            	        int alt5=6;
            	        alt5 = dfa5.predict(input);
            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalMyTurtleDsl.g:130:4: ( (lv_SeconDec_7_0= ruleIntDecl ) )
            	    	    {
            	    	    // InternalMyTurtleDsl.g:130:4: ( (lv_SeconDec_7_0= ruleIntDecl ) )
            	    	    // InternalMyTurtleDsl.g:131:5: (lv_SeconDec_7_0= ruleIntDecl )
            	    	    {
            	    	    // InternalMyTurtleDsl.g:131:5: (lv_SeconDec_7_0= ruleIntDecl )
            	    	    // InternalMyTurtleDsl.g:132:6: lv_SeconDec_7_0= ruleIntDecl
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getModelAccess().getSeconDecIntDeclParserRuleCall_7_0_0());
            	    	    					
            	    	    pushFollow(FOLLOW_8);
            	    	    lv_SeconDec_7_0=ruleIntDecl();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"SeconDec",
            	    	    							lv_SeconDec_7_0,
            	    	    							"org.xtext.example.mydsl.MyTurtleDsl.IntDecl");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalMyTurtleDsl.g:150:4: ( (lv_PourDec_8_0= rulePourcentDecl ) )
            	    	    {
            	    	    // InternalMyTurtleDsl.g:150:4: ( (lv_PourDec_8_0= rulePourcentDecl ) )
            	    	    // InternalMyTurtleDsl.g:151:5: (lv_PourDec_8_0= rulePourcentDecl )
            	    	    {
            	    	    // InternalMyTurtleDsl.g:151:5: (lv_PourDec_8_0= rulePourcentDecl )
            	    	    // InternalMyTurtleDsl.g:152:6: lv_PourDec_8_0= rulePourcentDecl
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getModelAccess().getPourDecPourcentDeclParserRuleCall_7_1_0());
            	    	    					
            	    	    pushFollow(FOLLOW_8);
            	    	    lv_PourDec_8_0=rulePourcentDecl();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"PourDec",
            	    	    							lv_PourDec_8_0,
            	    	    							"org.xtext.example.mydsl.MyTurtleDsl.PourcentDecl");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 3 :
            	    	    // InternalMyTurtleDsl.g:170:4: ( (lv_statements_9_0= ruleStatement ) )
            	    	    {
            	    	    // InternalMyTurtleDsl.g:170:4: ( (lv_statements_9_0= ruleStatement ) )
            	    	    // InternalMyTurtleDsl.g:171:5: (lv_statements_9_0= ruleStatement )
            	    	    {
            	    	    // InternalMyTurtleDsl.g:171:5: (lv_statements_9_0= ruleStatement )
            	    	    // InternalMyTurtleDsl.g:172:6: lv_statements_9_0= ruleStatement
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_7_2_0());
            	    	    					
            	    	    pushFollow(FOLLOW_8);
            	    	    lv_statements_9_0=ruleStatement();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"statements",
            	    	    							lv_statements_9_0,
            	    	    							"org.xtext.example.mydsl.MyTurtleDsl.Statement");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 4 :
            	    	    // InternalMyTurtleDsl.g:190:4: ( (lv_fonctions_10_0= ruleFonctionCall ) )
            	    	    {
            	    	    // InternalMyTurtleDsl.g:190:4: ( (lv_fonctions_10_0= ruleFonctionCall ) )
            	    	    // InternalMyTurtleDsl.g:191:5: (lv_fonctions_10_0= ruleFonctionCall )
            	    	    {
            	    	    // InternalMyTurtleDsl.g:191:5: (lv_fonctions_10_0= ruleFonctionCall )
            	    	    // InternalMyTurtleDsl.g:192:6: lv_fonctions_10_0= ruleFonctionCall
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getModelAccess().getFonctionsFonctionCallParserRuleCall_7_3_0());
            	    	    					
            	    	    pushFollow(FOLLOW_8);
            	    	    lv_fonctions_10_0=ruleFonctionCall();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"fonctions",
            	    	    							lv_fonctions_10_0,
            	    	    							"org.xtext.example.mydsl.MyTurtleDsl.FonctionCall");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 5 :
            	    	    // InternalMyTurtleDsl.g:210:4: ( ( (lv_parallele_11_1= ruleParallele2 | lv_parallele_11_2= ruleParallele3 ) ) )
            	    	    {
            	    	    // InternalMyTurtleDsl.g:210:4: ( ( (lv_parallele_11_1= ruleParallele2 | lv_parallele_11_2= ruleParallele3 ) ) )
            	    	    // InternalMyTurtleDsl.g:211:5: ( (lv_parallele_11_1= ruleParallele2 | lv_parallele_11_2= ruleParallele3 ) )
            	    	    {
            	    	    // InternalMyTurtleDsl.g:211:5: ( (lv_parallele_11_1= ruleParallele2 | lv_parallele_11_2= ruleParallele3 ) )
            	    	    // InternalMyTurtleDsl.g:212:6: (lv_parallele_11_1= ruleParallele2 | lv_parallele_11_2= ruleParallele3 )
            	    	    {
            	    	    // InternalMyTurtleDsl.g:212:6: (lv_parallele_11_1= ruleParallele2 | lv_parallele_11_2= ruleParallele3 )
            	    	    int alt4=2;
            	    	    alt4 = dfa4.predict(input);
            	    	    switch (alt4) {
            	    	        case 1 :
            	    	            // InternalMyTurtleDsl.g:213:7: lv_parallele_11_1= ruleParallele2
            	    	            {

            	    	            							newCompositeNode(grammarAccess.getModelAccess().getParalleleParallele2ParserRuleCall_7_4_0_0());
            	    	            						
            	    	            pushFollow(FOLLOW_8);
            	    	            lv_parallele_11_1=ruleParallele2();

            	    	            state._fsp--;


            	    	            							if (current==null) {
            	    	            								current = createModelElementForParent(grammarAccess.getModelRule());
            	    	            							}
            	    	            							add(
            	    	            								current,
            	    	            								"parallele",
            	    	            								lv_parallele_11_1,
            	    	            								"org.xtext.example.mydsl.MyTurtleDsl.Parallele2");
            	    	            							afterParserOrEnumRuleCall();
            	    	            						

            	    	            }
            	    	            break;
            	    	        case 2 :
            	    	            // InternalMyTurtleDsl.g:229:7: lv_parallele_11_2= ruleParallele3
            	    	            {

            	    	            							newCompositeNode(grammarAccess.getModelAccess().getParalleleParallele3ParserRuleCall_7_4_0_1());
            	    	            						
            	    	            pushFollow(FOLLOW_8);
            	    	            lv_parallele_11_2=ruleParallele3();

            	    	            state._fsp--;


            	    	            							if (current==null) {
            	    	            								current = createModelElementForParent(grammarAccess.getModelRule());
            	    	            							}
            	    	            							add(
            	    	            								current,
            	    	            								"parallele",
            	    	            								lv_parallele_11_2,
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
            	    	    break loop5;
            	        }
            	    } while (true);

            	    // InternalMyTurtleDsl.g:248:3: (otherlv_12= '\\n' )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==12) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalMyTurtleDsl.g:249:4: otherlv_12= '\\n'
            	    	    {
            	    	    otherlv_12=(Token)match(input,12,FOLLOW_8); 

            	    	    				newLeafNode(otherlv_12, grammarAccess.getModelAccess().getLineFeedKeyword_8());
            	    	    			

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop6;
            	        }
            	    } while (true);


            	    			newCompositeNode(grammarAccess.getModelAccess().getEndParserRuleCall_9());
            	    		
            	    pushFollow(FOLLOW_9);
            	    ruleEnd();

            	    state._fsp--;


            	    			afterParserOrEnumRuleCall();
            	    		
            	    // InternalMyTurtleDsl.g:261:3: (otherlv_14= '\\n' )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==12) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalMyTurtleDsl.g:262:4: otherlv_14= '\\n'
            	    	    {
            	    	    otherlv_14=(Token)match(input,12,FOLLOW_9); 

            	    	    				newLeafNode(otherlv_14, grammarAccess.getModelAccess().getLineFeedKeyword_10());
            	    	    			

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);

            	    otherlv_15=(Token)match(input,16,FOLLOW_10); 

            	    			newLeafNode(otherlv_15, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_11());
            	    		
            	    // InternalMyTurtleDsl.g:271:3: (otherlv_16= '\\n' )*
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==12) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalMyTurtleDsl.g:272:4: otherlv_16= '\\n'
            	    	    {
            	    	    otherlv_16=(Token)match(input,12,FOLLOW_10); 

            	    	    				newLeafNode(otherlv_16, grammarAccess.getModelAccess().getLineFeedKeyword_12());
            	    	    			

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop8;
            	        }
            	    } while (true);

            	    // InternalMyTurtleDsl.g:277:3: ( (lv_fonctions_17_0= ruleFonctionDecl ) )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==13) ) {
            	            int LA9_2 = input.LA(2);

            	            if ( (LA9_2==RULE_ID) ) {
            	                alt9=1;
            	            }


            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalMyTurtleDsl.g:278:4: (lv_fonctions_17_0= ruleFonctionDecl )
            	    	    {
            	    	    // InternalMyTurtleDsl.g:278:4: (lv_fonctions_17_0= ruleFonctionDecl )
            	    	    // InternalMyTurtleDsl.g:279:5: lv_fonctions_17_0= ruleFonctionDecl
            	    	    {

            	    	    					newCompositeNode(grammarAccess.getModelAccess().getFonctionsFonctionDeclParserRuleCall_13_0());
            	    	    				
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_fonctions_17_0=ruleFonctionDecl();

            	    	    state._fsp--;


            	    	    					if (current==null) {
            	    	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    	    					}
            	    	    					add(
            	    	    						current,
            	    	    						"fonctions",
            	    	    						lv_fonctions_17_0,
            	    	    						"org.xtext.example.mydsl.MyTurtleDsl.FonctionDecl");
            	    	    					afterParserOrEnumRuleCall();
            	    	    				

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop9;
            	        }
            	    } while (true);

            	    // InternalMyTurtleDsl.g:296:3: (otherlv_18= '\\n' )*
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==12) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // InternalMyTurtleDsl.g:297:4: otherlv_18= '\\n'
            	    	    {
            	    	    otherlv_18=(Token)match(input,12,FOLLOW_10); 

            	    	    				newLeafNode(otherlv_18, grammarAccess.getModelAccess().getLineFeedKeyword_14());
            	    	    			

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop10;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop11;
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


    // $ANTLR start "entryRuleMD"
    // InternalMyTurtleDsl.g:306:1: entryRuleMD returns [EObject current=null] : iv_ruleMD= ruleMD EOF ;
    public final EObject entryRuleMD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMD = null;


        try {
            // InternalMyTurtleDsl.g:306:43: (iv_ruleMD= ruleMD EOF )
            // InternalMyTurtleDsl.g:307:2: iv_ruleMD= ruleMD EOF
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
    // InternalMyTurtleDsl.g:313:1: ruleMD returns [EObject current=null] : (this_Monter_0= ruleMonter | this_Descendre_1= ruleDescendre ) ;
    public final EObject ruleMD() throws RecognitionException {
        EObject current = null;

        EObject this_Monter_0 = null;

        EObject this_Descendre_1 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:319:2: ( (this_Monter_0= ruleMonter | this_Descendre_1= ruleDescendre ) )
            // InternalMyTurtleDsl.g:320:2: (this_Monter_0= ruleMonter | this_Descendre_1= ruleDescendre )
            {
            // InternalMyTurtleDsl.g:320:2: (this_Monter_0= ruleMonter | this_Descendre_1= ruleDescendre )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            else if ( (LA12_0==27) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyTurtleDsl.g:321:3: this_Monter_0= ruleMonter
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
                    // InternalMyTurtleDsl.g:330:3: this_Descendre_1= ruleDescendre
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
    // InternalMyTurtleDsl.g:342:1: entryRuleGDr returns [EObject current=null] : iv_ruleGDr= ruleGDr EOF ;
    public final EObject entryRuleGDr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGDr = null;


        try {
            // InternalMyTurtleDsl.g:342:44: (iv_ruleGDr= ruleGDr EOF )
            // InternalMyTurtleDsl.g:343:2: iv_ruleGDr= ruleGDr EOF
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
    // InternalMyTurtleDsl.g:349:1: ruleGDr returns [EObject current=null] : (this_Gauche_0= ruleGauche | this_Droite_1= ruleDroite ) ;
    public final EObject ruleGDr() throws RecognitionException {
        EObject current = null;

        EObject this_Gauche_0 = null;

        EObject this_Droite_1 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:355:2: ( (this_Gauche_0= ruleGauche | this_Droite_1= ruleDroite ) )
            // InternalMyTurtleDsl.g:356:2: (this_Gauche_0= ruleGauche | this_Droite_1= ruleDroite )
            {
            // InternalMyTurtleDsl.g:356:2: (this_Gauche_0= ruleGauche | this_Droite_1= ruleDroite )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
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
                    // InternalMyTurtleDsl.g:357:3: this_Gauche_0= ruleGauche
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
                    // InternalMyTurtleDsl.g:366:3: this_Droite_1= ruleDroite
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
    // InternalMyTurtleDsl.g:378:1: entryRuleRGRD returns [EObject current=null] : iv_ruleRGRD= ruleRGRD EOF ;
    public final EObject entryRuleRGRD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRGRD = null;


        try {
            // InternalMyTurtleDsl.g:378:45: (iv_ruleRGRD= ruleRGRD EOF )
            // InternalMyTurtleDsl.g:379:2: iv_ruleRGRD= ruleRGRD EOF
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
    // InternalMyTurtleDsl.g:385:1: ruleRGRD returns [EObject current=null] : (this_RotationGauche_0= ruleRotationGauche | this_RotationDroite_1= ruleRotationDroite ) ;
    public final EObject ruleRGRD() throws RecognitionException {
        EObject current = null;

        EObject this_RotationGauche_0 = null;

        EObject this_RotationDroite_1 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:391:2: ( (this_RotationGauche_0= ruleRotationGauche | this_RotationDroite_1= ruleRotationDroite ) )
            // InternalMyTurtleDsl.g:392:2: (this_RotationGauche_0= ruleRotationGauche | this_RotationDroite_1= ruleRotationDroite )
            {
            // InternalMyTurtleDsl.g:392:2: (this_RotationGauche_0= ruleRotationGauche | this_RotationDroite_1= ruleRotationDroite )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            else if ( (LA14_0==33) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyTurtleDsl.g:393:3: this_RotationGauche_0= ruleRotationGauche
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
                    // InternalMyTurtleDsl.g:402:3: this_RotationDroite_1= ruleRotationDroite
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
    // InternalMyTurtleDsl.g:414:1: entryRuleAR returns [EObject current=null] : iv_ruleAR= ruleAR EOF ;
    public final EObject entryRuleAR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAR = null;


        try {
            // InternalMyTurtleDsl.g:414:43: (iv_ruleAR= ruleAR EOF )
            // InternalMyTurtleDsl.g:415:2: iv_ruleAR= ruleAR EOF
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
    // InternalMyTurtleDsl.g:421:1: ruleAR returns [EObject current=null] : (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer ) ;
    public final EObject ruleAR() throws RecognitionException {
        EObject current = null;

        EObject this_Avancer_0 = null;

        EObject this_Reculer_1 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:427:2: ( (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer ) )
            // InternalMyTurtleDsl.g:428:2: (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer )
            {
            // InternalMyTurtleDsl.g:428:2: (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            else if ( (LA15_0==29) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyTurtleDsl.g:429:3: this_Avancer_0= ruleAvancer
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
                    // InternalMyTurtleDsl.g:438:3: this_Reculer_1= ruleReculer
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
    // InternalMyTurtleDsl.g:450:1: entryRuleParallele2 returns [EObject current=null] : iv_ruleParallele2= ruleParallele2 EOF ;
    public final EObject entryRuleParallele2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallele2 = null;


        try {
            // InternalMyTurtleDsl.g:450:51: (iv_ruleParallele2= ruleParallele2 EOF )
            // InternalMyTurtleDsl.g:451:2: iv_ruleParallele2= ruleParallele2 EOF
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
    // InternalMyTurtleDsl.g:457:1: ruleParallele2 returns [EObject current=null] : ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) ) ;
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
            // InternalMyTurtleDsl.g:463:2: ( ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) ) )
            // InternalMyTurtleDsl.g:464:2: ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) )
            {
            // InternalMyTurtleDsl.g:464:2: ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) )
            int alt16=12;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalMyTurtleDsl.g:465:3: ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) )
                    {
                    // InternalMyTurtleDsl.g:465:3: ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) )
                    // InternalMyTurtleDsl.g:466:4: ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) )
                    {
                    // InternalMyTurtleDsl.g:466:4: ( (lv_a_0_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:467:5: (lv_a_0_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:467:5: (lv_a_0_0= ruleMD )
                    // InternalMyTurtleDsl.g:468:6: lv_a_0_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getAMDParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_1=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getParallele2Access().getAmpersandKeyword_0_1());
                    			
                    // InternalMyTurtleDsl.g:489:4: ( (lv_t_2_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:490:5: (lv_t_2_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:490:5: (lv_t_2_0= ruleGDr )
                    // InternalMyTurtleDsl.g:491:6: lv_t_2_0= ruleGDr
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
                    // InternalMyTurtleDsl.g:510:3: ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) )
                    {
                    // InternalMyTurtleDsl.g:510:3: ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) )
                    // InternalMyTurtleDsl.g:511:4: ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) )
                    {
                    // InternalMyTurtleDsl.g:511:4: ( (lv_a_3_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:512:5: (lv_a_3_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:512:5: (lv_a_3_0= ruleMD )
                    // InternalMyTurtleDsl.g:513:6: lv_a_3_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getAMDParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_4=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getParallele2Access().getAmpersandKeyword_1_1());
                    			
                    // InternalMyTurtleDsl.g:534:4: ( (lv_t_5_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:535:5: (lv_t_5_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:535:5: (lv_t_5_0= ruleAR )
                    // InternalMyTurtleDsl.g:536:6: lv_t_5_0= ruleAR
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
                    // InternalMyTurtleDsl.g:555:3: ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) )
                    {
                    // InternalMyTurtleDsl.g:555:3: ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) )
                    // InternalMyTurtleDsl.g:556:4: ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) )
                    {
                    // InternalMyTurtleDsl.g:556:4: ( (lv_a_6_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:557:5: (lv_a_6_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:557:5: (lv_a_6_0= ruleMD )
                    // InternalMyTurtleDsl.g:558:6: lv_a_6_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getAMDParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_7=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getParallele2Access().getAmpersandKeyword_2_1());
                    			
                    // InternalMyTurtleDsl.g:579:4: ( (lv_t_8_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:580:5: (lv_t_8_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:580:5: (lv_t_8_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:581:6: lv_t_8_0= ruleRGRD
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
                    // InternalMyTurtleDsl.g:600:3: ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) )
                    {
                    // InternalMyTurtleDsl.g:600:3: ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) )
                    // InternalMyTurtleDsl.g:601:4: ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) )
                    {
                    // InternalMyTurtleDsl.g:601:4: ( (lv_t_9_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:602:5: (lv_t_9_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:602:5: (lv_t_9_0= ruleGDr )
                    // InternalMyTurtleDsl.g:603:6: lv_t_9_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTGDrParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_10=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_10, grammarAccess.getParallele2Access().getAmpersandKeyword_3_1());
                    			
                    // InternalMyTurtleDsl.g:624:4: ( (lv_b_11_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:625:5: (lv_b_11_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:625:5: (lv_b_11_0= ruleAR )
                    // InternalMyTurtleDsl.g:626:6: lv_b_11_0= ruleAR
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
                    // InternalMyTurtleDsl.g:645:3: ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) )
                    {
                    // InternalMyTurtleDsl.g:645:3: ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) )
                    // InternalMyTurtleDsl.g:646:4: ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) )
                    {
                    // InternalMyTurtleDsl.g:646:4: ( (lv_t_12_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:647:5: (lv_t_12_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:647:5: (lv_t_12_0= ruleGDr )
                    // InternalMyTurtleDsl.g:648:6: lv_t_12_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTGDrParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_13=(Token)match(input,17,FOLLOW_15); 

                    				newLeafNode(otherlv_13, grammarAccess.getParallele2Access().getAmpersandKeyword_4_1());
                    			
                    // InternalMyTurtleDsl.g:669:4: ( (lv_b_14_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:670:5: (lv_b_14_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:670:5: (lv_b_14_0= ruleMD )
                    // InternalMyTurtleDsl.g:671:6: lv_b_14_0= ruleMD
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
                    // InternalMyTurtleDsl.g:690:3: ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) )
                    {
                    // InternalMyTurtleDsl.g:690:3: ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) )
                    // InternalMyTurtleDsl.g:691:4: ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) )
                    {
                    // InternalMyTurtleDsl.g:691:4: ( (lv_t_15_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:692:5: (lv_t_15_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:692:5: (lv_t_15_0= ruleGDr )
                    // InternalMyTurtleDsl.g:693:6: lv_t_15_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTGDrParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_16=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_16, grammarAccess.getParallele2Access().getAmpersandKeyword_5_1());
                    			
                    // InternalMyTurtleDsl.g:714:4: ( (lv_b_17_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:715:5: (lv_b_17_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:715:5: (lv_b_17_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:716:6: lv_b_17_0= ruleRGRD
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
                    // InternalMyTurtleDsl.g:735:3: ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) )
                    {
                    // InternalMyTurtleDsl.g:735:3: ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) )
                    // InternalMyTurtleDsl.g:736:4: ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) )
                    {
                    // InternalMyTurtleDsl.g:736:4: ( (lv_t_18_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:737:5: (lv_t_18_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:737:5: (lv_t_18_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:738:6: lv_t_18_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTRGRDParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_19=(Token)match(input,17,FOLLOW_15); 

                    				newLeafNode(otherlv_19, grammarAccess.getParallele2Access().getAmpersandKeyword_6_1());
                    			
                    // InternalMyTurtleDsl.g:759:4: ( (lv_a_20_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:760:5: (lv_a_20_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:760:5: (lv_a_20_0= ruleMD )
                    // InternalMyTurtleDsl.g:761:6: lv_a_20_0= ruleMD
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
                    // InternalMyTurtleDsl.g:780:3: ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) )
                    {
                    // InternalMyTurtleDsl.g:780:3: ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) )
                    // InternalMyTurtleDsl.g:781:4: ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) )
                    {
                    // InternalMyTurtleDsl.g:781:4: ( (lv_t_21_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:782:5: (lv_t_21_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:782:5: (lv_t_21_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:783:6: lv_t_21_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTRGRDParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_22=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_22, grammarAccess.getParallele2Access().getAmpersandKeyword_7_1());
                    			
                    // InternalMyTurtleDsl.g:804:4: ( (lv_a_23_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:805:5: (lv_a_23_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:805:5: (lv_a_23_0= ruleAR )
                    // InternalMyTurtleDsl.g:806:6: lv_a_23_0= ruleAR
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
                    // InternalMyTurtleDsl.g:825:3: ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) )
                    {
                    // InternalMyTurtleDsl.g:825:3: ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) )
                    // InternalMyTurtleDsl.g:826:4: ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) )
                    {
                    // InternalMyTurtleDsl.g:826:4: ( (lv_t_24_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:827:5: (lv_t_24_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:827:5: (lv_t_24_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:828:6: lv_t_24_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTRGRDParserRuleCall_8_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_25=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_25, grammarAccess.getParallele2Access().getAmpersandKeyword_8_1());
                    			
                    // InternalMyTurtleDsl.g:849:4: ( (lv_a_26_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:850:5: (lv_a_26_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:850:5: (lv_a_26_0= ruleGDr )
                    // InternalMyTurtleDsl.g:851:6: lv_a_26_0= ruleGDr
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
                    // InternalMyTurtleDsl.g:870:3: ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) )
                    {
                    // InternalMyTurtleDsl.g:870:3: ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) )
                    // InternalMyTurtleDsl.g:871:4: ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) )
                    {
                    // InternalMyTurtleDsl.g:871:4: ( (lv_t_27_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:872:5: (lv_t_27_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:872:5: (lv_t_27_0= ruleAR )
                    // InternalMyTurtleDsl.g:873:6: lv_t_27_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTARParserRuleCall_9_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_28=(Token)match(input,17,FOLLOW_15); 

                    				newLeafNode(otherlv_28, grammarAccess.getParallele2Access().getAmpersandKeyword_9_1());
                    			
                    // InternalMyTurtleDsl.g:894:4: ( (lv_a_29_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:895:5: (lv_a_29_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:895:5: (lv_a_29_0= ruleMD )
                    // InternalMyTurtleDsl.g:896:6: lv_a_29_0= ruleMD
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
                    // InternalMyTurtleDsl.g:915:3: ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) )
                    {
                    // InternalMyTurtleDsl.g:915:3: ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) )
                    // InternalMyTurtleDsl.g:916:4: ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) )
                    {
                    // InternalMyTurtleDsl.g:916:4: ( (lv_t_30_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:917:5: (lv_t_30_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:917:5: (lv_t_30_0= ruleAR )
                    // InternalMyTurtleDsl.g:918:6: lv_t_30_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTARParserRuleCall_10_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_31=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_31, grammarAccess.getParallele2Access().getAmpersandKeyword_10_1());
                    			
                    // InternalMyTurtleDsl.g:939:4: ( (lv_a_32_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:940:5: (lv_a_32_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:940:5: (lv_a_32_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:941:6: lv_a_32_0= ruleRGRD
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
                    // InternalMyTurtleDsl.g:960:3: ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) )
                    {
                    // InternalMyTurtleDsl.g:960:3: ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) )
                    // InternalMyTurtleDsl.g:961:4: ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) )
                    {
                    // InternalMyTurtleDsl.g:961:4: ( (lv_t_33_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:962:5: (lv_t_33_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:962:5: (lv_t_33_0= ruleAR )
                    // InternalMyTurtleDsl.g:963:6: lv_t_33_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTARParserRuleCall_11_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_34=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_34, grammarAccess.getParallele2Access().getAmpersandKeyword_11_1());
                    			
                    // InternalMyTurtleDsl.g:984:4: ( (lv_a_35_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:985:5: (lv_a_35_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:985:5: (lv_a_35_0= ruleGDr )
                    // InternalMyTurtleDsl.g:986:6: lv_a_35_0= ruleGDr
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
    // InternalMyTurtleDsl.g:1008:1: entryRuleParallele3 returns [EObject current=null] : iv_ruleParallele3= ruleParallele3 EOF ;
    public final EObject entryRuleParallele3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallele3 = null;


        try {
            // InternalMyTurtleDsl.g:1008:51: (iv_ruleParallele3= ruleParallele3 EOF )
            // InternalMyTurtleDsl.g:1009:2: iv_ruleParallele3= ruleParallele3 EOF
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
    // InternalMyTurtleDsl.g:1015:1: ruleParallele3 returns [EObject current=null] : ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) ) ;
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
            // InternalMyTurtleDsl.g:1021:2: ( ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) ) )
            // InternalMyTurtleDsl.g:1022:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) )
            {
            // InternalMyTurtleDsl.g:1022:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) )
            int alt17=24;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalMyTurtleDsl.g:1023:3: ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) )
                    {
                    // InternalMyTurtleDsl.g:1023:3: ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) )
                    // InternalMyTurtleDsl.g:1024:4: ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) )
                    {
                    // InternalMyTurtleDsl.g:1024:4: ( (lv_a_0_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:1025:5: (lv_a_0_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:1025:5: (lv_a_0_0= ruleAR )
                    // InternalMyTurtleDsl.g:1026:6: lv_a_0_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAARParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_1=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getParallele3Access().getAmpersandKeyword_0_1());
                    			
                    // InternalMyTurtleDsl.g:1047:4: ( (lv_b_2_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:1048:5: (lv_b_2_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:1048:5: (lv_b_2_0= ruleGDr )
                    // InternalMyTurtleDsl.g:1049:6: lv_b_2_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBGDrParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_3=(Token)match(input,17,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getParallele3Access().getAmpersandKeyword_0_3());
                    			
                    // InternalMyTurtleDsl.g:1070:4: ( (lv_c_4_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:1071:5: (lv_c_4_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:1071:5: (lv_c_4_0= ruleMD )
                    // InternalMyTurtleDsl.g:1072:6: lv_c_4_0= ruleMD
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
                    // InternalMyTurtleDsl.g:1091:3: ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) )
                    {
                    // InternalMyTurtleDsl.g:1091:3: ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) )
                    // InternalMyTurtleDsl.g:1092:4: ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) )
                    {
                    // InternalMyTurtleDsl.g:1092:4: ( (lv_a_5_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:1093:5: (lv_a_5_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:1093:5: (lv_a_5_0= ruleAR )
                    // InternalMyTurtleDsl.g:1094:6: lv_a_5_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAARParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_6=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getParallele3Access().getAmpersandKeyword_1_1());
                    			
                    // InternalMyTurtleDsl.g:1115:4: ( (lv_b_7_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:1116:5: (lv_b_7_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:1116:5: (lv_b_7_0= ruleGDr )
                    // InternalMyTurtleDsl.g:1117:6: lv_b_7_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBGDrParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_8=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_8, grammarAccess.getParallele3Access().getAmpersandKeyword_1_3());
                    			
                    // InternalMyTurtleDsl.g:1138:4: ( (lv_c_9_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:1139:5: (lv_c_9_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:1139:5: (lv_c_9_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:1140:6: lv_c_9_0= ruleRGRD
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
                    // InternalMyTurtleDsl.g:1159:3: ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) )
                    {
                    // InternalMyTurtleDsl.g:1159:3: ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) )
                    // InternalMyTurtleDsl.g:1160:4: ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) )
                    {
                    // InternalMyTurtleDsl.g:1160:4: ( (lv_a_10_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:1161:5: (lv_a_10_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:1161:5: (lv_a_10_0= ruleAR )
                    // InternalMyTurtleDsl.g:1162:6: lv_a_10_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAARParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_11=(Token)match(input,17,FOLLOW_15); 

                    				newLeafNode(otherlv_11, grammarAccess.getParallele3Access().getAmpersandKeyword_2_1());
                    			
                    // InternalMyTurtleDsl.g:1183:4: ( (lv_b_12_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:1184:5: (lv_b_12_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:1184:5: (lv_b_12_0= ruleMD )
                    // InternalMyTurtleDsl.g:1185:6: lv_b_12_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBMDParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_13=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_13, grammarAccess.getParallele3Access().getAmpersandKeyword_2_3());
                    			
                    // InternalMyTurtleDsl.g:1206:4: ( (lv_c_14_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:1207:5: (lv_c_14_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:1207:5: (lv_c_14_0= ruleGDr )
                    // InternalMyTurtleDsl.g:1208:6: lv_c_14_0= ruleGDr
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
                    // InternalMyTurtleDsl.g:1227:3: ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) )
                    {
                    // InternalMyTurtleDsl.g:1227:3: ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) )
                    // InternalMyTurtleDsl.g:1228:4: ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) )
                    {
                    // InternalMyTurtleDsl.g:1228:4: ( (lv_a_15_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:1229:5: (lv_a_15_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:1229:5: (lv_a_15_0= ruleAR )
                    // InternalMyTurtleDsl.g:1230:6: lv_a_15_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAARParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_16=(Token)match(input,17,FOLLOW_15); 

                    				newLeafNode(otherlv_16, grammarAccess.getParallele3Access().getAmpersandKeyword_3_1());
                    			
                    // InternalMyTurtleDsl.g:1251:4: ( (lv_b_17_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:1252:5: (lv_b_17_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:1252:5: (lv_b_17_0= ruleMD )
                    // InternalMyTurtleDsl.g:1253:6: lv_b_17_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBMDParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_18=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_18, grammarAccess.getParallele3Access().getAmpersandKeyword_3_3());
                    			
                    // InternalMyTurtleDsl.g:1274:4: ( (lv_c_19_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:1275:5: (lv_c_19_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:1275:5: (lv_c_19_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:1276:6: lv_c_19_0= ruleRGRD
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
                    // InternalMyTurtleDsl.g:1295:3: ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) )
                    {
                    // InternalMyTurtleDsl.g:1295:3: ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) )
                    // InternalMyTurtleDsl.g:1296:4: ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) )
                    {
                    // InternalMyTurtleDsl.g:1296:4: ( (lv_a_20_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:1297:5: (lv_a_20_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:1297:5: (lv_a_20_0= ruleAR )
                    // InternalMyTurtleDsl.g:1298:6: lv_a_20_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAARParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_21=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_21, grammarAccess.getParallele3Access().getAmpersandKeyword_4_1());
                    			
                    // InternalMyTurtleDsl.g:1319:4: ( (lv_b_22_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:1320:5: (lv_b_22_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:1320:5: (lv_b_22_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:1321:6: lv_b_22_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_23=(Token)match(input,17,FOLLOW_15); 

                    				newLeafNode(otherlv_23, grammarAccess.getParallele3Access().getAmpersandKeyword_4_3());
                    			
                    // InternalMyTurtleDsl.g:1342:4: ( (lv_c_24_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:1343:5: (lv_c_24_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:1343:5: (lv_c_24_0= ruleMD )
                    // InternalMyTurtleDsl.g:1344:6: lv_c_24_0= ruleMD
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
                    // InternalMyTurtleDsl.g:1363:3: ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) )
                    {
                    // InternalMyTurtleDsl.g:1363:3: ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) )
                    // InternalMyTurtleDsl.g:1364:4: ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) )
                    {
                    // InternalMyTurtleDsl.g:1364:4: ( (lv_a_25_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:1365:5: (lv_a_25_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:1365:5: (lv_a_25_0= ruleAR )
                    // InternalMyTurtleDsl.g:1366:6: lv_a_25_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAARParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_26=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_26, grammarAccess.getParallele3Access().getAmpersandKeyword_5_1());
                    			
                    // InternalMyTurtleDsl.g:1387:4: ( (lv_b_27_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:1388:5: (lv_b_27_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:1388:5: (lv_b_27_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:1389:6: lv_b_27_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_28=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_28, grammarAccess.getParallele3Access().getAmpersandKeyword_5_3());
                    			
                    // InternalMyTurtleDsl.g:1410:4: ( (lv_c_29_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:1411:5: (lv_c_29_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:1411:5: (lv_c_29_0= ruleGDr )
                    // InternalMyTurtleDsl.g:1412:6: lv_c_29_0= ruleGDr
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
                    // InternalMyTurtleDsl.g:1431:3: ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) )
                    {
                    // InternalMyTurtleDsl.g:1431:3: ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) )
                    // InternalMyTurtleDsl.g:1432:4: ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) )
                    {
                    // InternalMyTurtleDsl.g:1432:4: ( (lv_a_30_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:1433:5: (lv_a_30_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:1433:5: (lv_a_30_0= ruleGDr )
                    // InternalMyTurtleDsl.g:1434:6: lv_a_30_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAGDrParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_31=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_31, grammarAccess.getParallele3Access().getAmpersandKeyword_6_1());
                    			
                    // InternalMyTurtleDsl.g:1455:4: ( (lv_b_32_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:1456:5: (lv_b_32_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:1456:5: (lv_b_32_0= ruleAR )
                    // InternalMyTurtleDsl.g:1457:6: lv_b_32_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBARParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_33=(Token)match(input,17,FOLLOW_15); 

                    				newLeafNode(otherlv_33, grammarAccess.getParallele3Access().getAmpersandKeyword_6_3());
                    			
                    // InternalMyTurtleDsl.g:1478:4: ( (lv_c_34_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:1479:5: (lv_c_34_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:1479:5: (lv_c_34_0= ruleMD )
                    // InternalMyTurtleDsl.g:1480:6: lv_c_34_0= ruleMD
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
                    // InternalMyTurtleDsl.g:1499:3: ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) )
                    {
                    // InternalMyTurtleDsl.g:1499:3: ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) )
                    // InternalMyTurtleDsl.g:1500:4: ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) )
                    {
                    // InternalMyTurtleDsl.g:1500:4: ( (lv_a_35_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:1501:5: (lv_a_35_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:1501:5: (lv_a_35_0= ruleGDr )
                    // InternalMyTurtleDsl.g:1502:6: lv_a_35_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAGDrParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_36=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_36, grammarAccess.getParallele3Access().getAmpersandKeyword_7_1());
                    			
                    // InternalMyTurtleDsl.g:1523:4: ( (lv_b_37_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:1524:5: (lv_b_37_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:1524:5: (lv_b_37_0= ruleAR )
                    // InternalMyTurtleDsl.g:1525:6: lv_b_37_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBARParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_38=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_38, grammarAccess.getParallele3Access().getAmpersandKeyword_7_3());
                    			
                    // InternalMyTurtleDsl.g:1546:4: ( (lv_c_39_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:1547:5: (lv_c_39_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:1547:5: (lv_c_39_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:1548:6: lv_c_39_0= ruleRGRD
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
                    // InternalMyTurtleDsl.g:1567:3: ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) )
                    {
                    // InternalMyTurtleDsl.g:1567:3: ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) )
                    // InternalMyTurtleDsl.g:1568:4: ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) )
                    {
                    // InternalMyTurtleDsl.g:1568:4: ( (lv_a_40_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:1569:5: (lv_a_40_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:1569:5: (lv_a_40_0= ruleGDr )
                    // InternalMyTurtleDsl.g:1570:6: lv_a_40_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAGDrParserRuleCall_8_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_41=(Token)match(input,17,FOLLOW_15); 

                    				newLeafNode(otherlv_41, grammarAccess.getParallele3Access().getAmpersandKeyword_8_1());
                    			
                    // InternalMyTurtleDsl.g:1591:4: ( (lv_b_42_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:1592:5: (lv_b_42_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:1592:5: (lv_b_42_0= ruleMD )
                    // InternalMyTurtleDsl.g:1593:6: lv_b_42_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBMDParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_43=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_43, grammarAccess.getParallele3Access().getAmpersandKeyword_8_3());
                    			
                    // InternalMyTurtleDsl.g:1614:4: ( (lv_c_44_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:1615:5: (lv_c_44_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:1615:5: (lv_c_44_0= ruleAR )
                    // InternalMyTurtleDsl.g:1616:6: lv_c_44_0= ruleAR
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
                    // InternalMyTurtleDsl.g:1635:3: ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) )
                    {
                    // InternalMyTurtleDsl.g:1635:3: ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) )
                    // InternalMyTurtleDsl.g:1636:4: ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) )
                    {
                    // InternalMyTurtleDsl.g:1636:4: ( (lv_a_45_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:1637:5: (lv_a_45_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:1637:5: (lv_a_45_0= ruleGDr )
                    // InternalMyTurtleDsl.g:1638:6: lv_a_45_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAGDrParserRuleCall_9_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_46=(Token)match(input,17,FOLLOW_15); 

                    				newLeafNode(otherlv_46, grammarAccess.getParallele3Access().getAmpersandKeyword_9_1());
                    			
                    // InternalMyTurtleDsl.g:1659:4: ( (lv_b_47_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:1660:5: (lv_b_47_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:1660:5: (lv_b_47_0= ruleMD )
                    // InternalMyTurtleDsl.g:1661:6: lv_b_47_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBMDParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_48=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_48, grammarAccess.getParallele3Access().getAmpersandKeyword_9_3());
                    			
                    // InternalMyTurtleDsl.g:1682:4: ( (lv_c_49_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:1683:5: (lv_c_49_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:1683:5: (lv_c_49_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:1684:6: lv_c_49_0= ruleRGRD
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
                    // InternalMyTurtleDsl.g:1703:3: ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) )
                    {
                    // InternalMyTurtleDsl.g:1703:3: ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) )
                    // InternalMyTurtleDsl.g:1704:4: ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) )
                    {
                    // InternalMyTurtleDsl.g:1704:4: ( (lv_a_50_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:1705:5: (lv_a_50_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:1705:5: (lv_a_50_0= ruleGDr )
                    // InternalMyTurtleDsl.g:1706:6: lv_a_50_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAGDrParserRuleCall_10_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_51=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_51, grammarAccess.getParallele3Access().getAmpersandKeyword_10_1());
                    			
                    // InternalMyTurtleDsl.g:1727:4: ( (lv_b_52_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:1728:5: (lv_b_52_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:1728:5: (lv_b_52_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:1729:6: lv_b_52_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_53=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_53, grammarAccess.getParallele3Access().getAmpersandKeyword_10_3());
                    			
                    // InternalMyTurtleDsl.g:1750:4: ( (lv_c_54_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:1751:5: (lv_c_54_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:1751:5: (lv_c_54_0= ruleAR )
                    // InternalMyTurtleDsl.g:1752:6: lv_c_54_0= ruleAR
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
                    // InternalMyTurtleDsl.g:1771:3: ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) )
                    {
                    // InternalMyTurtleDsl.g:1771:3: ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) )
                    // InternalMyTurtleDsl.g:1772:4: ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) )
                    {
                    // InternalMyTurtleDsl.g:1772:4: ( (lv_a_55_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:1773:5: (lv_a_55_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:1773:5: (lv_a_55_0= ruleGDr )
                    // InternalMyTurtleDsl.g:1774:6: lv_a_55_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAGDrParserRuleCall_11_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_56=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_56, grammarAccess.getParallele3Access().getAmpersandKeyword_11_1());
                    			
                    // InternalMyTurtleDsl.g:1795:4: ( (lv_b_57_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:1796:5: (lv_b_57_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:1796:5: (lv_b_57_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:1797:6: lv_b_57_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_58=(Token)match(input,17,FOLLOW_15); 

                    				newLeafNode(otherlv_58, grammarAccess.getParallele3Access().getAmpersandKeyword_11_3());
                    			
                    // InternalMyTurtleDsl.g:1818:4: ( (lv_c_59_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:1819:5: (lv_c_59_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:1819:5: (lv_c_59_0= ruleMD )
                    // InternalMyTurtleDsl.g:1820:6: lv_c_59_0= ruleMD
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
                    // InternalMyTurtleDsl.g:1839:3: ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) )
                    {
                    // InternalMyTurtleDsl.g:1839:3: ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) )
                    // InternalMyTurtleDsl.g:1840:4: ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) )
                    {
                    // InternalMyTurtleDsl.g:1840:4: ( (lv_a_60_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:1841:5: (lv_a_60_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:1841:5: (lv_a_60_0= ruleMD )
                    // InternalMyTurtleDsl.g:1842:6: lv_a_60_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAMDParserRuleCall_12_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_61=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_61, grammarAccess.getParallele3Access().getAmpersandKeyword_12_1());
                    			
                    // InternalMyTurtleDsl.g:1863:4: ( (lv_b_62_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:1864:5: (lv_b_62_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:1864:5: (lv_b_62_0= ruleAR )
                    // InternalMyTurtleDsl.g:1865:6: lv_b_62_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBARParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_63=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_63, grammarAccess.getParallele3Access().getAmpersandKeyword_12_3());
                    			
                    // InternalMyTurtleDsl.g:1886:4: ( (lv_c_64_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:1887:5: (lv_c_64_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:1887:5: (lv_c_64_0= ruleGDr )
                    // InternalMyTurtleDsl.g:1888:6: lv_c_64_0= ruleGDr
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
                    // InternalMyTurtleDsl.g:1907:3: ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) )
                    {
                    // InternalMyTurtleDsl.g:1907:3: ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) )
                    // InternalMyTurtleDsl.g:1908:4: ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) )
                    {
                    // InternalMyTurtleDsl.g:1908:4: ( (lv_a_65_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:1909:5: (lv_a_65_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:1909:5: (lv_a_65_0= ruleMD )
                    // InternalMyTurtleDsl.g:1910:6: lv_a_65_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAMDParserRuleCall_13_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_66=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_66, grammarAccess.getParallele3Access().getAmpersandKeyword_13_1());
                    			
                    // InternalMyTurtleDsl.g:1931:4: ( (lv_b_67_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:1932:5: (lv_b_67_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:1932:5: (lv_b_67_0= ruleAR )
                    // InternalMyTurtleDsl.g:1933:6: lv_b_67_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBARParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_68=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_68, grammarAccess.getParallele3Access().getAmpersandKeyword_13_3());
                    			
                    // InternalMyTurtleDsl.g:1954:4: ( (lv_c_69_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:1955:5: (lv_c_69_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:1955:5: (lv_c_69_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:1956:6: lv_c_69_0= ruleRGRD
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
                    // InternalMyTurtleDsl.g:1975:3: ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) )
                    {
                    // InternalMyTurtleDsl.g:1975:3: ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) )
                    // InternalMyTurtleDsl.g:1976:4: ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) )
                    {
                    // InternalMyTurtleDsl.g:1976:4: ( (lv_a_70_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:1977:5: (lv_a_70_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:1977:5: (lv_a_70_0= ruleMD )
                    // InternalMyTurtleDsl.g:1978:6: lv_a_70_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAMDParserRuleCall_14_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_71=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_71, grammarAccess.getParallele3Access().getAmpersandKeyword_14_1());
                    			
                    // InternalMyTurtleDsl.g:1999:4: ( (lv_b_72_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:2000:5: (lv_b_72_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:2000:5: (lv_b_72_0= ruleGDr )
                    // InternalMyTurtleDsl.g:2001:6: lv_b_72_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBGDrParserRuleCall_14_2_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_73=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_73, grammarAccess.getParallele3Access().getAmpersandKeyword_14_3());
                    			
                    // InternalMyTurtleDsl.g:2022:4: ( (lv_c_74_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:2023:5: (lv_c_74_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:2023:5: (lv_c_74_0= ruleAR )
                    // InternalMyTurtleDsl.g:2024:6: lv_c_74_0= ruleAR
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
                    // InternalMyTurtleDsl.g:2043:3: ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) )
                    {
                    // InternalMyTurtleDsl.g:2043:3: ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) )
                    // InternalMyTurtleDsl.g:2044:4: ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) )
                    {
                    // InternalMyTurtleDsl.g:2044:4: ( (lv_a_75_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:2045:5: (lv_a_75_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:2045:5: (lv_a_75_0= ruleMD )
                    // InternalMyTurtleDsl.g:2046:6: lv_a_75_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAMDParserRuleCall_15_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_76=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_76, grammarAccess.getParallele3Access().getAmpersandKeyword_15_1());
                    			
                    // InternalMyTurtleDsl.g:2067:4: ( (lv_b_77_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:2068:5: (lv_b_77_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:2068:5: (lv_b_77_0= ruleGDr )
                    // InternalMyTurtleDsl.g:2069:6: lv_b_77_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBGDrParserRuleCall_15_2_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_78=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_78, grammarAccess.getParallele3Access().getAmpersandKeyword_15_3());
                    			
                    // InternalMyTurtleDsl.g:2090:4: ( (lv_c_79_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:2091:5: (lv_c_79_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:2091:5: (lv_c_79_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:2092:6: lv_c_79_0= ruleRGRD
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
                    // InternalMyTurtleDsl.g:2111:3: ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) )
                    {
                    // InternalMyTurtleDsl.g:2111:3: ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) )
                    // InternalMyTurtleDsl.g:2112:4: ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) )
                    {
                    // InternalMyTurtleDsl.g:2112:4: ( (lv_a_80_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:2113:5: (lv_a_80_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:2113:5: (lv_a_80_0= ruleMD )
                    // InternalMyTurtleDsl.g:2114:6: lv_a_80_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAMDParserRuleCall_16_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_81=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_81, grammarAccess.getParallele3Access().getAmpersandKeyword_16_1());
                    			
                    // InternalMyTurtleDsl.g:2135:4: ( (lv_b_82_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:2136:5: (lv_b_82_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:2136:5: (lv_b_82_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:2137:6: lv_b_82_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_16_2_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_83=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_83, grammarAccess.getParallele3Access().getAmpersandKeyword_16_3());
                    			
                    // InternalMyTurtleDsl.g:2158:4: ( (lv_c_84_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:2159:5: (lv_c_84_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:2159:5: (lv_c_84_0= ruleGDr )
                    // InternalMyTurtleDsl.g:2160:6: lv_c_84_0= ruleGDr
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
                    // InternalMyTurtleDsl.g:2179:3: ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) )
                    {
                    // InternalMyTurtleDsl.g:2179:3: ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) )
                    // InternalMyTurtleDsl.g:2180:4: ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) )
                    {
                    // InternalMyTurtleDsl.g:2180:4: ( (lv_a_85_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:2181:5: (lv_a_85_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:2181:5: (lv_a_85_0= ruleMD )
                    // InternalMyTurtleDsl.g:2182:6: lv_a_85_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAMDParserRuleCall_17_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_86=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_86, grammarAccess.getParallele3Access().getAmpersandKeyword_17_1());
                    			
                    // InternalMyTurtleDsl.g:2203:4: ( (lv_b_87_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:2204:5: (lv_b_87_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:2204:5: (lv_b_87_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:2205:6: lv_b_87_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_17_2_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_88=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_88, grammarAccess.getParallele3Access().getAmpersandKeyword_17_3());
                    			
                    // InternalMyTurtleDsl.g:2226:4: ( (lv_c_89_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:2227:5: (lv_c_89_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:2227:5: (lv_c_89_0= ruleAR )
                    // InternalMyTurtleDsl.g:2228:6: lv_c_89_0= ruleAR
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
                    // InternalMyTurtleDsl.g:2247:3: ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) )
                    {
                    // InternalMyTurtleDsl.g:2247:3: ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) )
                    // InternalMyTurtleDsl.g:2248:4: ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) )
                    {
                    // InternalMyTurtleDsl.g:2248:4: ( (lv_a_90_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:2249:5: (lv_a_90_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:2249:5: (lv_a_90_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:2250:6: lv_a_90_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getARGRDParserRuleCall_18_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_91=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_91, grammarAccess.getParallele3Access().getAmpersandKeyword_18_1());
                    			
                    // InternalMyTurtleDsl.g:2271:4: ( (lv_b_92_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:2272:5: (lv_b_92_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:2272:5: (lv_b_92_0= ruleAR )
                    // InternalMyTurtleDsl.g:2273:6: lv_b_92_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBARParserRuleCall_18_2_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_93=(Token)match(input,17,FOLLOW_15); 

                    				newLeafNode(otherlv_93, grammarAccess.getParallele3Access().getAmpersandKeyword_18_3());
                    			
                    // InternalMyTurtleDsl.g:2294:4: ( (lv_c_94_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:2295:5: (lv_c_94_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:2295:5: (lv_c_94_0= ruleMD )
                    // InternalMyTurtleDsl.g:2296:6: lv_c_94_0= ruleMD
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
                    // InternalMyTurtleDsl.g:2315:3: ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) )
                    {
                    // InternalMyTurtleDsl.g:2315:3: ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) )
                    // InternalMyTurtleDsl.g:2316:4: ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) )
                    {
                    // InternalMyTurtleDsl.g:2316:4: ( (lv_a_95_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:2317:5: (lv_a_95_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:2317:5: (lv_a_95_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:2318:6: lv_a_95_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getARGRDParserRuleCall_19_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_96=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_96, grammarAccess.getParallele3Access().getAmpersandKeyword_19_1());
                    			
                    // InternalMyTurtleDsl.g:2339:4: ( (lv_b_97_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:2340:5: (lv_b_97_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:2340:5: (lv_b_97_0= ruleAR )
                    // InternalMyTurtleDsl.g:2341:6: lv_b_97_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBARParserRuleCall_19_2_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_98=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_98, grammarAccess.getParallele3Access().getAmpersandKeyword_19_3());
                    			
                    // InternalMyTurtleDsl.g:2362:4: ( (lv_c_99_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:2363:5: (lv_c_99_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:2363:5: (lv_c_99_0= ruleGDr )
                    // InternalMyTurtleDsl.g:2364:6: lv_c_99_0= ruleGDr
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
                    // InternalMyTurtleDsl.g:2383:3: ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) )
                    {
                    // InternalMyTurtleDsl.g:2383:3: ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) )
                    // InternalMyTurtleDsl.g:2384:4: ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) )
                    {
                    // InternalMyTurtleDsl.g:2384:4: ( (lv_a_100_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:2385:5: (lv_a_100_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:2385:5: (lv_a_100_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:2386:6: lv_a_100_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getARGRDParserRuleCall_20_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_101=(Token)match(input,17,FOLLOW_15); 

                    				newLeafNode(otherlv_101, grammarAccess.getParallele3Access().getAmpersandKeyword_20_1());
                    			
                    // InternalMyTurtleDsl.g:2407:4: ( (lv_b_102_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:2408:5: (lv_b_102_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:2408:5: (lv_b_102_0= ruleMD )
                    // InternalMyTurtleDsl.g:2409:6: lv_b_102_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBMDParserRuleCall_20_2_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_103=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_103, grammarAccess.getParallele3Access().getAmpersandKeyword_20_3());
                    			
                    // InternalMyTurtleDsl.g:2430:4: ( (lv_c_104_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:2431:5: (lv_c_104_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:2431:5: (lv_c_104_0= ruleAR )
                    // InternalMyTurtleDsl.g:2432:6: lv_c_104_0= ruleAR
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
                    // InternalMyTurtleDsl.g:2451:3: ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) )
                    {
                    // InternalMyTurtleDsl.g:2451:3: ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) )
                    // InternalMyTurtleDsl.g:2452:4: ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) )
                    {
                    // InternalMyTurtleDsl.g:2452:4: ( (lv_a_105_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:2453:5: (lv_a_105_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:2453:5: (lv_a_105_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:2454:6: lv_a_105_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getARGRDParserRuleCall_21_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_106=(Token)match(input,17,FOLLOW_15); 

                    				newLeafNode(otherlv_106, grammarAccess.getParallele3Access().getAmpersandKeyword_21_1());
                    			
                    // InternalMyTurtleDsl.g:2475:4: ( (lv_b_107_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:2476:5: (lv_b_107_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:2476:5: (lv_b_107_0= ruleMD )
                    // InternalMyTurtleDsl.g:2477:6: lv_b_107_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBMDParserRuleCall_21_2_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_108=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_108, grammarAccess.getParallele3Access().getAmpersandKeyword_21_3());
                    			
                    // InternalMyTurtleDsl.g:2498:4: ( (lv_c_109_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:2499:5: (lv_c_109_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:2499:5: (lv_c_109_0= ruleGDr )
                    // InternalMyTurtleDsl.g:2500:6: lv_c_109_0= ruleGDr
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
                    // InternalMyTurtleDsl.g:2519:3: ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) )
                    {
                    // InternalMyTurtleDsl.g:2519:3: ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) )
                    // InternalMyTurtleDsl.g:2520:4: ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) )
                    {
                    // InternalMyTurtleDsl.g:2520:4: ( (lv_a_110_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:2521:5: (lv_a_110_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:2521:5: (lv_a_110_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:2522:6: lv_a_110_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getARGRDParserRuleCall_22_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_111=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_111, grammarAccess.getParallele3Access().getAmpersandKeyword_22_1());
                    			
                    // InternalMyTurtleDsl.g:2543:4: ( (lv_b_112_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:2544:5: (lv_b_112_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:2544:5: (lv_b_112_0= ruleGDr )
                    // InternalMyTurtleDsl.g:2545:6: lv_b_112_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBGDrParserRuleCall_22_2_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_113=(Token)match(input,17,FOLLOW_15); 

                    				newLeafNode(otherlv_113, grammarAccess.getParallele3Access().getAmpersandKeyword_22_3());
                    			
                    // InternalMyTurtleDsl.g:2566:4: ( (lv_c_114_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:2567:5: (lv_c_114_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:2567:5: (lv_c_114_0= ruleMD )
                    // InternalMyTurtleDsl.g:2568:6: lv_c_114_0= ruleMD
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
                    // InternalMyTurtleDsl.g:2587:3: ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) )
                    {
                    // InternalMyTurtleDsl.g:2587:3: ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) )
                    // InternalMyTurtleDsl.g:2588:4: ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) )
                    {
                    // InternalMyTurtleDsl.g:2588:4: ( (lv_a_115_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:2589:5: (lv_a_115_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:2589:5: (lv_a_115_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:2590:6: lv_a_115_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getARGRDParserRuleCall_23_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_116=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_116, grammarAccess.getParallele3Access().getAmpersandKeyword_23_1());
                    			
                    // InternalMyTurtleDsl.g:2611:4: ( (lv_b_117_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:2612:5: (lv_b_117_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:2612:5: (lv_b_117_0= ruleGDr )
                    // InternalMyTurtleDsl.g:2613:6: lv_b_117_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBGDrParserRuleCall_23_2_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    otherlv_118=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_118, grammarAccess.getParallele3Access().getAmpersandKeyword_23_3());
                    			
                    // InternalMyTurtleDsl.g:2634:4: ( (lv_c_119_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:2635:5: (lv_c_119_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:2635:5: (lv_c_119_0= ruleAR )
                    // InternalMyTurtleDsl.g:2636:6: lv_c_119_0= ruleAR
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


    // $ANTLR start "entryRuleIncludes"
    // InternalMyTurtleDsl.g:2658:1: entryRuleIncludes returns [EObject current=null] : iv_ruleIncludes= ruleIncludes EOF ;
    public final EObject entryRuleIncludes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncludes = null;


        try {
            // InternalMyTurtleDsl.g:2658:49: (iv_ruleIncludes= ruleIncludes EOF )
            // InternalMyTurtleDsl.g:2659:2: iv_ruleIncludes= ruleIncludes EOF
            {
             newCompositeNode(grammarAccess.getIncludesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIncludes=ruleIncludes();

            state._fsp--;

             current =iv_ruleIncludes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIncludes"


    // $ANTLR start "ruleIncludes"
    // InternalMyTurtleDsl.g:2665:1: ruleIncludes returns [EObject current=null] : (otherlv_0= 'import' otherlv_1= '<' ( (lv_importURI_2_0= RULE_INCLUDE ) ) otherlv_3= '>;' ) ;
    public final EObject ruleIncludes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_importURI_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyTurtleDsl.g:2671:2: ( (otherlv_0= 'import' otherlv_1= '<' ( (lv_importURI_2_0= RULE_INCLUDE ) ) otherlv_3= '>;' ) )
            // InternalMyTurtleDsl.g:2672:2: (otherlv_0= 'import' otherlv_1= '<' ( (lv_importURI_2_0= RULE_INCLUDE ) ) otherlv_3= '>;' )
            {
            // InternalMyTurtleDsl.g:2672:2: (otherlv_0= 'import' otherlv_1= '<' ( (lv_importURI_2_0= RULE_INCLUDE ) ) otherlv_3= '>;' )
            // InternalMyTurtleDsl.g:2673:3: otherlv_0= 'import' otherlv_1= '<' ( (lv_importURI_2_0= RULE_INCLUDE ) ) otherlv_3= '>;'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getIncludesAccess().getImportKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getIncludesAccess().getLessThanSignKeyword_1());
            		
            // InternalMyTurtleDsl.g:2681:3: ( (lv_importURI_2_0= RULE_INCLUDE ) )
            // InternalMyTurtleDsl.g:2682:4: (lv_importURI_2_0= RULE_INCLUDE )
            {
            // InternalMyTurtleDsl.g:2682:4: (lv_importURI_2_0= RULE_INCLUDE )
            // InternalMyTurtleDsl.g:2683:5: lv_importURI_2_0= RULE_INCLUDE
            {
            lv_importURI_2_0=(Token)match(input,RULE_INCLUDE,FOLLOW_18); 

            					newLeafNode(lv_importURI_2_0, grammarAccess.getIncludesAccess().getImportURIINCLUDETerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIncludesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"importURI",
            						lv_importURI_2_0,
            						"org.xtext.example.mydsl.MyTurtleDsl.INCLUDE");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getIncludesAccess().getGreaterThanSignSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIncludes"


    // $ANTLR start "entryRuleDecoller"
    // InternalMyTurtleDsl.g:2707:1: entryRuleDecoller returns [String current=null] : iv_ruleDecoller= ruleDecoller EOF ;
    public final String entryRuleDecoller() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecoller = null;


        try {
            // InternalMyTurtleDsl.g:2707:48: (iv_ruleDecoller= ruleDecoller EOF )
            // InternalMyTurtleDsl.g:2708:2: iv_ruleDecoller= ruleDecoller EOF
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
    // InternalMyTurtleDsl.g:2714:1: ruleDecoller returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'decoller' kw= '(' kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleDecoller() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyTurtleDsl.g:2720:2: ( (kw= 'decoller' kw= '(' kw= ')' ) )
            // InternalMyTurtleDsl.g:2721:2: (kw= 'decoller' kw= '(' kw= ')' )
            {
            // InternalMyTurtleDsl.g:2721:2: (kw= 'decoller' kw= '(' kw= ')' )
            // InternalMyTurtleDsl.g:2722:3: kw= 'decoller' kw= '(' kw= ')'
            {
            kw=(Token)match(input,21,FOLLOW_19); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDecollerAccess().getDecollerKeyword_0());
            		
            kw=(Token)match(input,22,FOLLOW_20); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDecollerAccess().getLeftParenthesisKeyword_1());
            		
            kw=(Token)match(input,23,FOLLOW_2); 

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
    // InternalMyTurtleDsl.g:2741:1: entryRuleAtterrir returns [String current=null] : iv_ruleAtterrir= ruleAtterrir EOF ;
    public final String entryRuleAtterrir() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAtterrir = null;


        try {
            // InternalMyTurtleDsl.g:2741:48: (iv_ruleAtterrir= ruleAtterrir EOF )
            // InternalMyTurtleDsl.g:2742:2: iv_ruleAtterrir= ruleAtterrir EOF
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
    // InternalMyTurtleDsl.g:2748:1: ruleAtterrir returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'atterrir' kw= '(' kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleAtterrir() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyTurtleDsl.g:2754:2: ( (kw= 'atterrir' kw= '(' kw= ')' ) )
            // InternalMyTurtleDsl.g:2755:2: (kw= 'atterrir' kw= '(' kw= ')' )
            {
            // InternalMyTurtleDsl.g:2755:2: (kw= 'atterrir' kw= '(' kw= ')' )
            // InternalMyTurtleDsl.g:2756:3: kw= 'atterrir' kw= '(' kw= ')'
            {
            kw=(Token)match(input,24,FOLLOW_19); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAtterrirAccess().getAtterrirKeyword_0());
            		
            kw=(Token)match(input,22,FOLLOW_20); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAtterrirAccess().getLeftParenthesisKeyword_1());
            		
            kw=(Token)match(input,23,FOLLOW_2); 

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
    // InternalMyTurtleDsl.g:2775:1: entryRuleMonter returns [EObject current=null] : iv_ruleMonter= ruleMonter EOF ;
    public final EObject entryRuleMonter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonter = null;


        try {
            // InternalMyTurtleDsl.g:2775:47: (iv_ruleMonter= ruleMonter EOF )
            // InternalMyTurtleDsl.g:2776:2: iv_ruleMonter= ruleMonter EOF
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
    // InternalMyTurtleDsl.g:2782:1: ruleMonter returns [EObject current=null] : (otherlv_0= 'monter' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_verticale_4_0= ruleIntExp ) ) otherlv_5= ')' ) ;
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
            // InternalMyTurtleDsl.g:2788:2: ( (otherlv_0= 'monter' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_verticale_4_0= ruleIntExp ) ) otherlv_5= ')' ) )
            // InternalMyTurtleDsl.g:2789:2: (otherlv_0= 'monter' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_verticale_4_0= ruleIntExp ) ) otherlv_5= ')' )
            {
            // InternalMyTurtleDsl.g:2789:2: (otherlv_0= 'monter' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_verticale_4_0= ruleIntExp ) ) otherlv_5= ')' )
            // InternalMyTurtleDsl.g:2790:3: otherlv_0= 'monter' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_verticale_4_0= ruleIntExp ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getMonterAccess().getMonterKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getMonterAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyTurtleDsl.g:2798:3: ( (lv_duree_2_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:2799:4: (lv_duree_2_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:2799:4: (lv_duree_2_0= ruleIntExp )
            // InternalMyTurtleDsl.g:2800:5: lv_duree_2_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getMonterAccess().getDureeIntExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
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

            otherlv_3=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getMonterAccess().getCommaKeyword_3());
            		
            // InternalMyTurtleDsl.g:2821:3: ( (lv_vitesse_verticale_4_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:2822:4: (lv_vitesse_verticale_4_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:2822:4: (lv_vitesse_verticale_4_0= ruleIntExp )
            // InternalMyTurtleDsl.g:2823:5: lv_vitesse_verticale_4_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getMonterAccess().getVitesse_verticaleIntExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
            lv_vitesse_verticale_4_0=ruleIntExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMonterRule());
            					}
            					set(
            						current,
            						"vitesse_verticale",
            						lv_vitesse_verticale_4_0,
            						"org.xtext.example.mydsl.MyTurtleDsl.IntExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_2); 

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
    // InternalMyTurtleDsl.g:2848:1: entryRuleDescendre returns [EObject current=null] : iv_ruleDescendre= ruleDescendre EOF ;
    public final EObject entryRuleDescendre() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescendre = null;


        try {
            // InternalMyTurtleDsl.g:2848:50: (iv_ruleDescendre= ruleDescendre EOF )
            // InternalMyTurtleDsl.g:2849:2: iv_ruleDescendre= ruleDescendre EOF
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
    // InternalMyTurtleDsl.g:2855:1: ruleDescendre returns [EObject current=null] : (otherlv_0= 'descendre' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_verticale_4_0= ruleIntExp ) ) otherlv_5= ')' ) ;
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
            // InternalMyTurtleDsl.g:2861:2: ( (otherlv_0= 'descendre' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_verticale_4_0= ruleIntExp ) ) otherlv_5= ')' ) )
            // InternalMyTurtleDsl.g:2862:2: (otherlv_0= 'descendre' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_verticale_4_0= ruleIntExp ) ) otherlv_5= ')' )
            {
            // InternalMyTurtleDsl.g:2862:2: (otherlv_0= 'descendre' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_verticale_4_0= ruleIntExp ) ) otherlv_5= ')' )
            // InternalMyTurtleDsl.g:2863:3: otherlv_0= 'descendre' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_verticale_4_0= ruleIntExp ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getDescendreAccess().getDescendreKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getDescendreAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyTurtleDsl.g:2871:3: ( (lv_duree_2_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:2872:4: (lv_duree_2_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:2872:4: (lv_duree_2_0= ruleIntExp )
            // InternalMyTurtleDsl.g:2873:5: lv_duree_2_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getDescendreAccess().getDureeIntExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
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

            otherlv_3=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getDescendreAccess().getCommaKeyword_3());
            		
            // InternalMyTurtleDsl.g:2894:3: ( (lv_vitesse_verticale_4_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:2895:4: (lv_vitesse_verticale_4_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:2895:4: (lv_vitesse_verticale_4_0= ruleIntExp )
            // InternalMyTurtleDsl.g:2896:5: lv_vitesse_verticale_4_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getDescendreAccess().getVitesse_verticaleIntExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
            lv_vitesse_verticale_4_0=ruleIntExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDescendreRule());
            					}
            					set(
            						current,
            						"vitesse_verticale",
            						lv_vitesse_verticale_4_0,
            						"org.xtext.example.mydsl.MyTurtleDsl.IntExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_2); 

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
    // InternalMyTurtleDsl.g:2921:1: entryRuleAvancer returns [EObject current=null] : iv_ruleAvancer= ruleAvancer EOF ;
    public final EObject entryRuleAvancer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvancer = null;


        try {
            // InternalMyTurtleDsl.g:2921:48: (iv_ruleAvancer= ruleAvancer EOF )
            // InternalMyTurtleDsl.g:2922:2: iv_ruleAvancer= ruleAvancer EOF
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
    // InternalMyTurtleDsl.g:2928:1: ruleAvancer returns [EObject current=null] : (otherlv_0= 'avancer' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= ruleIntExp ) ) otherlv_5= ')' ) ;
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
            // InternalMyTurtleDsl.g:2934:2: ( (otherlv_0= 'avancer' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= ruleIntExp ) ) otherlv_5= ')' ) )
            // InternalMyTurtleDsl.g:2935:2: (otherlv_0= 'avancer' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= ruleIntExp ) ) otherlv_5= ')' )
            {
            // InternalMyTurtleDsl.g:2935:2: (otherlv_0= 'avancer' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= ruleIntExp ) ) otherlv_5= ')' )
            // InternalMyTurtleDsl.g:2936:3: otherlv_0= 'avancer' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= ruleIntExp ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getAvancerAccess().getAvancerKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getAvancerAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyTurtleDsl.g:2944:3: ( (lv_duree_2_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:2945:4: (lv_duree_2_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:2945:4: (lv_duree_2_0= ruleIntExp )
            // InternalMyTurtleDsl.g:2946:5: lv_duree_2_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getAvancerAccess().getDureeIntExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
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

            otherlv_3=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getAvancerAccess().getCommaKeyword_3());
            		
            // InternalMyTurtleDsl.g:2967:3: ( (lv_vitesse_deplacement_4_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:2968:4: (lv_vitesse_deplacement_4_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:2968:4: (lv_vitesse_deplacement_4_0= ruleIntExp )
            // InternalMyTurtleDsl.g:2969:5: lv_vitesse_deplacement_4_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getAvancerAccess().getVitesse_deplacementIntExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
            lv_vitesse_deplacement_4_0=ruleIntExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAvancerRule());
            					}
            					set(
            						current,
            						"vitesse_deplacement",
            						lv_vitesse_deplacement_4_0,
            						"org.xtext.example.mydsl.MyTurtleDsl.IntExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_2); 

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
    // InternalMyTurtleDsl.g:2994:1: entryRuleReculer returns [EObject current=null] : iv_ruleReculer= ruleReculer EOF ;
    public final EObject entryRuleReculer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReculer = null;


        try {
            // InternalMyTurtleDsl.g:2994:48: (iv_ruleReculer= ruleReculer EOF )
            // InternalMyTurtleDsl.g:2995:2: iv_ruleReculer= ruleReculer EOF
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
    // InternalMyTurtleDsl.g:3001:1: ruleReculer returns [EObject current=null] : (otherlv_0= 'reculer' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= ruleIntExp ) ) otherlv_5= ')' ) ;
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
            // InternalMyTurtleDsl.g:3007:2: ( (otherlv_0= 'reculer' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= ruleIntExp ) ) otherlv_5= ')' ) )
            // InternalMyTurtleDsl.g:3008:2: (otherlv_0= 'reculer' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= ruleIntExp ) ) otherlv_5= ')' )
            {
            // InternalMyTurtleDsl.g:3008:2: (otherlv_0= 'reculer' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= ruleIntExp ) ) otherlv_5= ')' )
            // InternalMyTurtleDsl.g:3009:3: otherlv_0= 'reculer' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= ruleIntExp ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getReculerAccess().getReculerKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getReculerAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyTurtleDsl.g:3017:3: ( (lv_duree_2_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:3018:4: (lv_duree_2_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:3018:4: (lv_duree_2_0= ruleIntExp )
            // InternalMyTurtleDsl.g:3019:5: lv_duree_2_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getReculerAccess().getDureeIntExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
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

            otherlv_3=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getReculerAccess().getCommaKeyword_3());
            		
            // InternalMyTurtleDsl.g:3040:3: ( (lv_vitesse_deplacement_4_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:3041:4: (lv_vitesse_deplacement_4_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:3041:4: (lv_vitesse_deplacement_4_0= ruleIntExp )
            // InternalMyTurtleDsl.g:3042:5: lv_vitesse_deplacement_4_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getReculerAccess().getVitesse_deplacementIntExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
            lv_vitesse_deplacement_4_0=ruleIntExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReculerRule());
            					}
            					set(
            						current,
            						"vitesse_deplacement",
            						lv_vitesse_deplacement_4_0,
            						"org.xtext.example.mydsl.MyTurtleDsl.IntExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_2); 

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
    // InternalMyTurtleDsl.g:3067:1: entryRuleGauche returns [EObject current=null] : iv_ruleGauche= ruleGauche EOF ;
    public final EObject entryRuleGauche() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGauche = null;


        try {
            // InternalMyTurtleDsl.g:3067:47: (iv_ruleGauche= ruleGauche EOF )
            // InternalMyTurtleDsl.g:3068:2: iv_ruleGauche= ruleGauche EOF
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
    // InternalMyTurtleDsl.g:3074:1: ruleGauche returns [EObject current=null] : (otherlv_0= 'gauche' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= ruleIntExp ) ) otherlv_5= ')' ) ;
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
            // InternalMyTurtleDsl.g:3080:2: ( (otherlv_0= 'gauche' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= ruleIntExp ) ) otherlv_5= ')' ) )
            // InternalMyTurtleDsl.g:3081:2: (otherlv_0= 'gauche' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= ruleIntExp ) ) otherlv_5= ')' )
            {
            // InternalMyTurtleDsl.g:3081:2: (otherlv_0= 'gauche' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= ruleIntExp ) ) otherlv_5= ')' )
            // InternalMyTurtleDsl.g:3082:3: otherlv_0= 'gauche' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= ruleIntExp ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getGaucheAccess().getGaucheKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getGaucheAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyTurtleDsl.g:3090:3: ( (lv_duree_2_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:3091:4: (lv_duree_2_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:3091:4: (lv_duree_2_0= ruleIntExp )
            // InternalMyTurtleDsl.g:3092:5: lv_duree_2_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getGaucheAccess().getDureeIntExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
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

            otherlv_3=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getGaucheAccess().getCommaKeyword_3());
            		
            // InternalMyTurtleDsl.g:3113:3: ( (lv_vitesse_deplacement_4_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:3114:4: (lv_vitesse_deplacement_4_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:3114:4: (lv_vitesse_deplacement_4_0= ruleIntExp )
            // InternalMyTurtleDsl.g:3115:5: lv_vitesse_deplacement_4_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getGaucheAccess().getVitesse_deplacementIntExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
            lv_vitesse_deplacement_4_0=ruleIntExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGaucheRule());
            					}
            					set(
            						current,
            						"vitesse_deplacement",
            						lv_vitesse_deplacement_4_0,
            						"org.xtext.example.mydsl.MyTurtleDsl.IntExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_2); 

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
    // InternalMyTurtleDsl.g:3140:1: entryRuleDroite returns [EObject current=null] : iv_ruleDroite= ruleDroite EOF ;
    public final EObject entryRuleDroite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDroite = null;


        try {
            // InternalMyTurtleDsl.g:3140:47: (iv_ruleDroite= ruleDroite EOF )
            // InternalMyTurtleDsl.g:3141:2: iv_ruleDroite= ruleDroite EOF
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
    // InternalMyTurtleDsl.g:3147:1: ruleDroite returns [EObject current=null] : (otherlv_0= 'droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= ruleIntExp ) ) otherlv_5= ')' ) ;
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
            // InternalMyTurtleDsl.g:3153:2: ( (otherlv_0= 'droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= ruleIntExp ) ) otherlv_5= ')' ) )
            // InternalMyTurtleDsl.g:3154:2: (otherlv_0= 'droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= ruleIntExp ) ) otherlv_5= ')' )
            {
            // InternalMyTurtleDsl.g:3154:2: (otherlv_0= 'droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= ruleIntExp ) ) otherlv_5= ')' )
            // InternalMyTurtleDsl.g:3155:3: otherlv_0= 'droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= ruleIntExp ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getDroiteAccess().getDroiteKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getDroiteAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyTurtleDsl.g:3163:3: ( (lv_duree_2_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:3164:4: (lv_duree_2_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:3164:4: (lv_duree_2_0= ruleIntExp )
            // InternalMyTurtleDsl.g:3165:5: lv_duree_2_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getDroiteAccess().getDureeIntExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
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

            otherlv_3=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getDroiteAccess().getCommaKeyword_3());
            		
            // InternalMyTurtleDsl.g:3186:3: ( (lv_vitesse_deplacement_4_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:3187:4: (lv_vitesse_deplacement_4_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:3187:4: (lv_vitesse_deplacement_4_0= ruleIntExp )
            // InternalMyTurtleDsl.g:3188:5: lv_vitesse_deplacement_4_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getDroiteAccess().getVitesse_deplacementIntExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
            lv_vitesse_deplacement_4_0=ruleIntExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDroiteRule());
            					}
            					set(
            						current,
            						"vitesse_deplacement",
            						lv_vitesse_deplacement_4_0,
            						"org.xtext.example.mydsl.MyTurtleDsl.IntExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_2); 

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
    // InternalMyTurtleDsl.g:3213:1: entryRulePause returns [EObject current=null] : iv_rulePause= rulePause EOF ;
    public final EObject entryRulePause() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePause = null;


        try {
            // InternalMyTurtleDsl.g:3213:46: (iv_rulePause= rulePause EOF )
            // InternalMyTurtleDsl.g:3214:2: iv_rulePause= rulePause EOF
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
    // InternalMyTurtleDsl.g:3220:1: rulePause returns [EObject current=null] : (otherlv_0= 'droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ')' ) ;
    public final EObject rulePause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_duree_2_0 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:3226:2: ( (otherlv_0= 'droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ')' ) )
            // InternalMyTurtleDsl.g:3227:2: (otherlv_0= 'droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ')' )
            {
            // InternalMyTurtleDsl.g:3227:2: (otherlv_0= 'droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ')' )
            // InternalMyTurtleDsl.g:3228:3: otherlv_0= 'droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getPauseAccess().getDroiteKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getPauseAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyTurtleDsl.g:3236:3: ( (lv_duree_2_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:3237:4: (lv_duree_2_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:3237:4: (lv_duree_2_0= ruleIntExp )
            // InternalMyTurtleDsl.g:3238:5: lv_duree_2_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getPauseAccess().getDureeIntExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
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

            otherlv_3=(Token)match(input,23,FOLLOW_2); 

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
    // InternalMyTurtleDsl.g:3263:1: entryRuleRotationGauche returns [EObject current=null] : iv_ruleRotationGauche= ruleRotationGauche EOF ;
    public final EObject entryRuleRotationGauche() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotationGauche = null;


        try {
            // InternalMyTurtleDsl.g:3263:55: (iv_ruleRotationGauche= ruleRotationGauche EOF )
            // InternalMyTurtleDsl.g:3264:2: iv_ruleRotationGauche= ruleRotationGauche EOF
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
    // InternalMyTurtleDsl.g:3270:1: ruleRotationGauche returns [EObject current=null] : (otherlv_0= 'rotation_gauche' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_rotation_4_0= ruleIntExp ) ) otherlv_5= ')' ) ;
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
            // InternalMyTurtleDsl.g:3276:2: ( (otherlv_0= 'rotation_gauche' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_rotation_4_0= ruleIntExp ) ) otherlv_5= ')' ) )
            // InternalMyTurtleDsl.g:3277:2: (otherlv_0= 'rotation_gauche' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_rotation_4_0= ruleIntExp ) ) otherlv_5= ')' )
            {
            // InternalMyTurtleDsl.g:3277:2: (otherlv_0= 'rotation_gauche' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_rotation_4_0= ruleIntExp ) ) otherlv_5= ')' )
            // InternalMyTurtleDsl.g:3278:3: otherlv_0= 'rotation_gauche' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_rotation_4_0= ruleIntExp ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getRotationGaucheAccess().getRotation_gaucheKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getRotationGaucheAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyTurtleDsl.g:3286:3: ( (lv_duree_2_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:3287:4: (lv_duree_2_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:3287:4: (lv_duree_2_0= ruleIntExp )
            // InternalMyTurtleDsl.g:3288:5: lv_duree_2_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getRotationGaucheAccess().getDureeIntExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
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

            otherlv_3=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getRotationGaucheAccess().getCommaKeyword_3());
            		
            // InternalMyTurtleDsl.g:3309:3: ( (lv_vitesse_rotation_4_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:3310:4: (lv_vitesse_rotation_4_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:3310:4: (lv_vitesse_rotation_4_0= ruleIntExp )
            // InternalMyTurtleDsl.g:3311:5: lv_vitesse_rotation_4_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getRotationGaucheAccess().getVitesse_rotationIntExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
            lv_vitesse_rotation_4_0=ruleIntExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotationGaucheRule());
            					}
            					set(
            						current,
            						"vitesse_rotation",
            						lv_vitesse_rotation_4_0,
            						"org.xtext.example.mydsl.MyTurtleDsl.IntExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_2); 

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
    // InternalMyTurtleDsl.g:3336:1: entryRuleRotationDroite returns [EObject current=null] : iv_ruleRotationDroite= ruleRotationDroite EOF ;
    public final EObject entryRuleRotationDroite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotationDroite = null;


        try {
            // InternalMyTurtleDsl.g:3336:55: (iv_ruleRotationDroite= ruleRotationDroite EOF )
            // InternalMyTurtleDsl.g:3337:2: iv_ruleRotationDroite= ruleRotationDroite EOF
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
    // InternalMyTurtleDsl.g:3343:1: ruleRotationDroite returns [EObject current=null] : (otherlv_0= 'rotation_droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_rotation_4_0= ruleIntExp ) ) otherlv_5= ')' ) ;
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
            // InternalMyTurtleDsl.g:3349:2: ( (otherlv_0= 'rotation_droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_rotation_4_0= ruleIntExp ) ) otherlv_5= ')' ) )
            // InternalMyTurtleDsl.g:3350:2: (otherlv_0= 'rotation_droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_rotation_4_0= ruleIntExp ) ) otherlv_5= ')' )
            {
            // InternalMyTurtleDsl.g:3350:2: (otherlv_0= 'rotation_droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_rotation_4_0= ruleIntExp ) ) otherlv_5= ')' )
            // InternalMyTurtleDsl.g:3351:3: otherlv_0= 'rotation_droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_rotation_4_0= ruleIntExp ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getRotationDroiteAccess().getRotation_droiteKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getRotationDroiteAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyTurtleDsl.g:3359:3: ( (lv_duree_2_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:3360:4: (lv_duree_2_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:3360:4: (lv_duree_2_0= ruleIntExp )
            // InternalMyTurtleDsl.g:3361:5: lv_duree_2_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getRotationDroiteAccess().getDureeIntExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
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

            otherlv_3=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getRotationDroiteAccess().getCommaKeyword_3());
            		
            // InternalMyTurtleDsl.g:3382:3: ( (lv_vitesse_rotation_4_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:3383:4: (lv_vitesse_rotation_4_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:3383:4: (lv_vitesse_rotation_4_0= ruleIntExp )
            // InternalMyTurtleDsl.g:3384:5: lv_vitesse_rotation_4_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getRotationDroiteAccess().getVitesse_rotationIntExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
            lv_vitesse_rotation_4_0=ruleIntExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotationDroiteRule());
            					}
            					set(
            						current,
            						"vitesse_rotation",
            						lv_vitesse_rotation_4_0,
            						"org.xtext.example.mydsl.MyTurtleDsl.IntExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_2); 

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
    // InternalMyTurtleDsl.g:3409:1: entryRuleStart returns [String current=null] : iv_ruleStart= ruleStart EOF ;
    public final String entryRuleStart() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStart = null;


        try {
            // InternalMyTurtleDsl.g:3409:45: (iv_ruleStart= ruleStart EOF )
            // InternalMyTurtleDsl.g:3410:2: iv_ruleStart= ruleStart EOF
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
    // InternalMyTurtleDsl.g:3416:1: ruleStart returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Decoller_0= ruleDecoller ;
    public final AntlrDatatypeRuleToken ruleStart() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Decoller_0 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:3422:2: (this_Decoller_0= ruleDecoller )
            // InternalMyTurtleDsl.g:3423:2: this_Decoller_0= ruleDecoller
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
    // InternalMyTurtleDsl.g:3436:1: entryRuleEnd returns [String current=null] : iv_ruleEnd= ruleEnd EOF ;
    public final String entryRuleEnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnd = null;


        try {
            // InternalMyTurtleDsl.g:3436:43: (iv_ruleEnd= ruleEnd EOF )
            // InternalMyTurtleDsl.g:3437:2: iv_ruleEnd= ruleEnd EOF
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
    // InternalMyTurtleDsl.g:3443:1: ruleEnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Atterrir_0= ruleAtterrir ;
    public final AntlrDatatypeRuleToken ruleEnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Atterrir_0 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:3449:2: (this_Atterrir_0= ruleAtterrir )
            // InternalMyTurtleDsl.g:3450:2: this_Atterrir_0= ruleAtterrir
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
    // InternalMyTurtleDsl.g:3463:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMyTurtleDsl.g:3463:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMyTurtleDsl.g:3464:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalMyTurtleDsl.g:3470:1: ruleStatement returns [EObject current=null] : (this_Avancer_0= ruleAvancer | this_Descendre_1= ruleDescendre | this_RotationDroite_2= ruleRotationDroite | this_RotationGauche_3= ruleRotationGauche | this_Pause_4= rulePause | this_Droite_5= ruleDroite | this_Gauche_6= ruleGauche | this_Reculer_7= ruleReculer | this_Monter_8= ruleMonter ) ;
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
            // InternalMyTurtleDsl.g:3476:2: ( (this_Avancer_0= ruleAvancer | this_Descendre_1= ruleDescendre | this_RotationDroite_2= ruleRotationDroite | this_RotationGauche_3= ruleRotationGauche | this_Pause_4= rulePause | this_Droite_5= ruleDroite | this_Gauche_6= ruleGauche | this_Reculer_7= ruleReculer | this_Monter_8= ruleMonter ) )
            // InternalMyTurtleDsl.g:3477:2: (this_Avancer_0= ruleAvancer | this_Descendre_1= ruleDescendre | this_RotationDroite_2= ruleRotationDroite | this_RotationGauche_3= ruleRotationGauche | this_Pause_4= rulePause | this_Droite_5= ruleDroite | this_Gauche_6= ruleGauche | this_Reculer_7= ruleReculer | this_Monter_8= ruleMonter )
            {
            // InternalMyTurtleDsl.g:3477:2: (this_Avancer_0= ruleAvancer | this_Descendre_1= ruleDescendre | this_RotationDroite_2= ruleRotationDroite | this_RotationGauche_3= ruleRotationGauche | this_Pause_4= rulePause | this_Droite_5= ruleDroite | this_Gauche_6= ruleGauche | this_Reculer_7= ruleReculer | this_Monter_8= ruleMonter )
            int alt18=9;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalMyTurtleDsl.g:3478:3: this_Avancer_0= ruleAvancer
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
                    // InternalMyTurtleDsl.g:3487:3: this_Descendre_1= ruleDescendre
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
                    // InternalMyTurtleDsl.g:3496:3: this_RotationDroite_2= ruleRotationDroite
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
                    // InternalMyTurtleDsl.g:3505:3: this_RotationGauche_3= ruleRotationGauche
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
                    // InternalMyTurtleDsl.g:3514:3: this_Pause_4= rulePause
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
                    // InternalMyTurtleDsl.g:3523:3: this_Droite_5= ruleDroite
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
                    // InternalMyTurtleDsl.g:3532:3: this_Gauche_6= ruleGauche
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
                    // InternalMyTurtleDsl.g:3541:3: this_Reculer_7= ruleReculer
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
                    // InternalMyTurtleDsl.g:3550:3: this_Monter_8= ruleMonter
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
    // InternalMyTurtleDsl.g:3562:1: entryRuleFonctionDecl returns [EObject current=null] : iv_ruleFonctionDecl= ruleFonctionDecl EOF ;
    public final EObject entryRuleFonctionDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFonctionDecl = null;


        try {
            // InternalMyTurtleDsl.g:3562:53: (iv_ruleFonctionDecl= ruleFonctionDecl EOF )
            // InternalMyTurtleDsl.g:3563:2: iv_ruleFonctionDecl= ruleFonctionDecl EOF
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
    // InternalMyTurtleDsl.g:3569:1: ruleFonctionDecl returns [EObject current=null] : (otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleStatement ) )* otherlv_6= '\\n' otherlv_7= '}' ) ;
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
            // InternalMyTurtleDsl.g:3575:2: ( (otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleStatement ) )* otherlv_6= '\\n' otherlv_7= '}' ) )
            // InternalMyTurtleDsl.g:3576:2: (otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleStatement ) )* otherlv_6= '\\n' otherlv_7= '}' )
            {
            // InternalMyTurtleDsl.g:3576:2: (otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleStatement ) )* otherlv_6= '\\n' otherlv_7= '}' )
            // InternalMyTurtleDsl.g:3577:3: otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleStatement ) )* otherlv_6= '\\n' otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getFonctionDeclAccess().getFuncKeyword_0());
            		
            // InternalMyTurtleDsl.g:3581:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyTurtleDsl.g:3582:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyTurtleDsl.g:3582:4: (lv_name_1_0= RULE_ID )
            // InternalMyTurtleDsl.g:3583:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            otherlv_2=(Token)match(input,22,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getFonctionDeclAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getFonctionDeclAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getFonctionDeclAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMyTurtleDsl.g:3611:3: ( (lv_body_5_0= ruleStatement ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==25||(LA19_0>=27 && LA19_0<=33)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:3612:4: (lv_body_5_0= ruleStatement )
            	    {
            	    // InternalMyTurtleDsl.g:3612:4: (lv_body_5_0= ruleStatement )
            	    // InternalMyTurtleDsl.g:3613:5: lv_body_5_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getFonctionDeclAccess().getBodyStatementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_24);
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
            	    break loop19;
                }
            } while (true);

            otherlv_6=(Token)match(input,12,FOLLOW_25); 

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


    // $ANTLR start "entryRuleIntConstante"
    // InternalMyTurtleDsl.g:3642:1: entryRuleIntConstante returns [EObject current=null] : iv_ruleIntConstante= ruleIntConstante EOF ;
    public final EObject entryRuleIntConstante() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntConstante = null;


        try {
            // InternalMyTurtleDsl.g:3642:53: (iv_ruleIntConstante= ruleIntConstante EOF )
            // InternalMyTurtleDsl.g:3643:2: iv_ruleIntConstante= ruleIntConstante EOF
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
    // InternalMyTurtleDsl.g:3649:1: ruleIntConstante returns [EObject current=null] : ( (lv_val_0_0= RULE_INT ) ) ;
    public final EObject ruleIntConstante() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalMyTurtleDsl.g:3655:2: ( ( (lv_val_0_0= RULE_INT ) ) )
            // InternalMyTurtleDsl.g:3656:2: ( (lv_val_0_0= RULE_INT ) )
            {
            // InternalMyTurtleDsl.g:3656:2: ( (lv_val_0_0= RULE_INT ) )
            // InternalMyTurtleDsl.g:3657:3: (lv_val_0_0= RULE_INT )
            {
            // InternalMyTurtleDsl.g:3657:3: (lv_val_0_0= RULE_INT )
            // InternalMyTurtleDsl.g:3658:4: lv_val_0_0= RULE_INT
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


    // $ANTLR start "entryRuleIntDecl"
    // InternalMyTurtleDsl.g:3677:1: entryRuleIntDecl returns [EObject current=null] : iv_ruleIntDecl= ruleIntDecl EOF ;
    public final EObject entryRuleIntDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntDecl = null;


        try {
            // InternalMyTurtleDsl.g:3677:48: (iv_ruleIntDecl= ruleIntDecl EOF )
            // InternalMyTurtleDsl.g:3678:2: iv_ruleIntDecl= ruleIntDecl EOF
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
    // InternalMyTurtleDsl.g:3684:1: ruleIntDecl returns [EObject current=null] : (otherlv_0= 'Seconde' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleIntExp ) ) ) ;
    public final EObject ruleIntDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_val_3_0 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:3690:2: ( (otherlv_0= 'Seconde' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleIntExp ) ) ) )
            // InternalMyTurtleDsl.g:3691:2: (otherlv_0= 'Seconde' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleIntExp ) ) )
            {
            // InternalMyTurtleDsl.g:3691:2: (otherlv_0= 'Seconde' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleIntExp ) ) )
            // InternalMyTurtleDsl.g:3692:3: otherlv_0= 'Seconde' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleIntExp ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getIntDeclAccess().getSecondeKeyword_0());
            		
            // InternalMyTurtleDsl.g:3696:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyTurtleDsl.g:3697:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyTurtleDsl.g:3697:4: (lv_name_1_0= RULE_ID )
            // InternalMyTurtleDsl.g:3698:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_26); 

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

            otherlv_2=(Token)match(input,35,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getIntDeclAccess().getEqualsSignKeyword_2());
            		
            // InternalMyTurtleDsl.g:3718:3: ( (lv_val_3_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:3719:4: (lv_val_3_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:3719:4: (lv_val_3_0= ruleIntExp )
            // InternalMyTurtleDsl.g:3720:5: lv_val_3_0= ruleIntExp
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


    // $ANTLR start "entryRulePourcentDecl"
    // InternalMyTurtleDsl.g:3741:1: entryRulePourcentDecl returns [EObject current=null] : iv_rulePourcentDecl= rulePourcentDecl EOF ;
    public final EObject entryRulePourcentDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePourcentDecl = null;


        try {
            // InternalMyTurtleDsl.g:3741:53: (iv_rulePourcentDecl= rulePourcentDecl EOF )
            // InternalMyTurtleDsl.g:3742:2: iv_rulePourcentDecl= rulePourcentDecl EOF
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
    // InternalMyTurtleDsl.g:3748:1: rulePourcentDecl returns [EObject current=null] : (otherlv_0= 'Pourcent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleIntExp ) ) ) ;
    public final EObject rulePourcentDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_val_3_0 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:3754:2: ( (otherlv_0= 'Pourcent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleIntExp ) ) ) )
            // InternalMyTurtleDsl.g:3755:2: (otherlv_0= 'Pourcent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleIntExp ) ) )
            {
            // InternalMyTurtleDsl.g:3755:2: (otherlv_0= 'Pourcent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleIntExp ) ) )
            // InternalMyTurtleDsl.g:3756:3: otherlv_0= 'Pourcent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleIntExp ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getPourcentDeclAccess().getPourcentKeyword_0());
            		
            // InternalMyTurtleDsl.g:3760:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyTurtleDsl.g:3761:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyTurtleDsl.g:3761:4: (lv_name_1_0= RULE_ID )
            // InternalMyTurtleDsl.g:3762:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_26); 

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

            otherlv_2=(Token)match(input,35,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getPourcentDeclAccess().getEqualsSignKeyword_2());
            		
            // InternalMyTurtleDsl.g:3782:3: ( (lv_val_3_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:3783:4: (lv_val_3_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:3783:4: (lv_val_3_0= ruleIntExp )
            // InternalMyTurtleDsl.g:3784:5: lv_val_3_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getPourcentDeclAccess().getValIntExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_3_0=ruleIntExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPourcentDeclRule());
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
    // $ANTLR end "rulePourcentDecl"


    // $ANTLR start "entryRuleRefIntVar"
    // InternalMyTurtleDsl.g:3805:1: entryRuleRefIntVar returns [EObject current=null] : iv_ruleRefIntVar= ruleRefIntVar EOF ;
    public final EObject entryRuleRefIntVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefIntVar = null;


        try {
            // InternalMyTurtleDsl.g:3805:50: (iv_ruleRefIntVar= ruleRefIntVar EOF )
            // InternalMyTurtleDsl.g:3806:2: iv_ruleRefIntVar= ruleRefIntVar EOF
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
    // InternalMyTurtleDsl.g:3812:1: ruleRefIntVar returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleRefIntVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMyTurtleDsl.g:3818:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMyTurtleDsl.g:3819:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMyTurtleDsl.g:3819:2: ( (otherlv_0= RULE_ID ) )
            // InternalMyTurtleDsl.g:3820:3: (otherlv_0= RULE_ID )
            {
            // InternalMyTurtleDsl.g:3820:3: (otherlv_0= RULE_ID )
            // InternalMyTurtleDsl.g:3821:4: otherlv_0= RULE_ID
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


    // $ANTLR start "entryRuleIntExp"
    // InternalMyTurtleDsl.g:3835:1: entryRuleIntExp returns [EObject current=null] : iv_ruleIntExp= ruleIntExp EOF ;
    public final EObject entryRuleIntExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntExp = null;


        try {
            // InternalMyTurtleDsl.g:3835:47: (iv_ruleIntExp= ruleIntExp EOF )
            // InternalMyTurtleDsl.g:3836:2: iv_ruleIntExp= ruleIntExp EOF
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
    // InternalMyTurtleDsl.g:3842:1: ruleIntExp returns [EObject current=null] : (this_IntConstante_0= ruleIntConstante | this_RefIntVar_1= ruleRefIntVar ) ;
    public final EObject ruleIntExp() throws RecognitionException {
        EObject current = null;

        EObject this_IntConstante_0 = null;

        EObject this_RefIntVar_1 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:3848:2: ( (this_IntConstante_0= ruleIntConstante | this_RefIntVar_1= ruleRefIntVar ) )
            // InternalMyTurtleDsl.g:3849:2: (this_IntConstante_0= ruleIntConstante | this_RefIntVar_1= ruleRefIntVar )
            {
            // InternalMyTurtleDsl.g:3849:2: (this_IntConstante_0= ruleIntConstante | this_RefIntVar_1= ruleRefIntVar )
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
                    // InternalMyTurtleDsl.g:3850:3: this_IntConstante_0= ruleIntConstante
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
                    // InternalMyTurtleDsl.g:3859:3: this_RefIntVar_1= ruleRefIntVar
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
    // InternalMyTurtleDsl.g:3871:1: entryRuleFonctionCall returns [EObject current=null] : iv_ruleFonctionCall= ruleFonctionCall EOF ;
    public final EObject entryRuleFonctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFonctionCall = null;


        try {
            // InternalMyTurtleDsl.g:3871:53: (iv_ruleFonctionCall= ruleFonctionCall EOF )
            // InternalMyTurtleDsl.g:3872:2: iv_ruleFonctionCall= ruleFonctionCall EOF
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
    // InternalMyTurtleDsl.g:3878:1: ruleFonctionCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' ) ;
    public final EObject ruleFonctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyTurtleDsl.g:3884:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' ) )
            // InternalMyTurtleDsl.g:3885:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' )
            {
            // InternalMyTurtleDsl.g:3885:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' )
            // InternalMyTurtleDsl.g:3886:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')'
            {
            // InternalMyTurtleDsl.g:3886:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyTurtleDsl.g:3887:4: (otherlv_0= RULE_ID )
            {
            // InternalMyTurtleDsl.g:3887:4: (otherlv_0= RULE_ID )
            // InternalMyTurtleDsl.g:3888:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFonctionCallRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_0, grammarAccess.getFonctionCallAccess().getFuncFonctionDeclCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getFonctionCallAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_2); 

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

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String dfa_1s = "\107\uffff";
    static final String dfa_2s = "\1\5\3\uffff\10\26\1\uffff\10\5\10\32\2\27\6\32\5\5\1\uffff\3\5\20\27\10\5\1\uffff";
    static final String dfa_3s = "\1\44\3\uffff\10\26\1\uffff\10\6\20\32\5\6\1\uffff\3\6\20\27\10\44\1\uffff";
    static final String dfa_4s = "\1\uffff\1\6\1\1\1\2\10\uffff\1\4\35\uffff\1\3\33\uffff\1\5";
    static final String dfa_5s = "\107\uffff}>";
    static final String[] dfa_6s = {
            "\1\14\6\uffff\1\1\13\uffff\1\1\1\13\1\uffff\1\5\1\4\1\12\1\11\1\10\1\7\1\6\1\2\1\uffff\1\3",
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
            "\1\57\1\56",
            "\1\61\1\60",
            "\1\63\1\62",
            "\1\65\1\64",
            "\1\67\1\66",
            "",
            "\1\71\1\70",
            "\1\73\1\72",
            "\1\75\1\74",
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
            "\1\52\6\uffff\1\52\4\uffff\1\106\6\uffff\2\52\1\uffff\10\52\1\uffff\1\52",
            "\1\52\6\uffff\1\52\4\uffff\1\106\6\uffff\2\52\1\uffff\10\52\1\uffff\1\52",
            "\1\52\6\uffff\1\52\4\uffff\1\106\6\uffff\2\52\1\uffff\10\52\1\uffff\1\52",
            "\1\52\6\uffff\1\52\4\uffff\1\106\6\uffff\2\52\1\uffff\10\52\1\uffff\1\52",
            "\1\52\6\uffff\1\52\4\uffff\1\106\6\uffff\2\52\1\uffff\10\52\1\uffff\1\52",
            "\1\52\6\uffff\1\52\4\uffff\1\106\6\uffff\2\52\1\uffff\10\52\1\uffff\1\52",
            "\1\52\6\uffff\1\52\4\uffff\1\106\6\uffff\2\52\1\uffff\10\52\1\uffff\1\52",
            "\1\52\6\uffff\1\52\4\uffff\1\106\6\uffff\2\52\1\uffff\10\52\1\uffff\1\52",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 129:3: ( ( (lv_SeconDec_7_0= ruleIntDecl ) ) | ( (lv_PourDec_8_0= rulePourcentDecl ) ) | ( (lv_statements_9_0= ruleStatement ) ) | ( (lv_fonctions_10_0= ruleFonctionCall ) ) | ( ( (lv_parallele_11_1= ruleParallele2 | lv_parallele_11_2= ruleParallele3 ) ) ) )*";
        }
    }
    static final String dfa_7s = "\u0107\uffff";
    static final String dfa_8s = "\1\31\10\26\10\5\20\32\10\5\20\27\10\21\1\34\3\31\30\26\30\5\60\32\30\5\60\27\30\5\2\uffff";
    static final String dfa_9s = "\1\41\10\26\10\6\20\32\10\6\20\27\10\21\2\41\1\37\1\41\30\26\30\6\60\32\30\6\60\27\30\44\2\uffff";
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
            "\1\52\1\51",
            "\1\54\1\53",
            "\1\56\1\55",
            "\1\60\1\57",
            "\1\62\1\61",
            "\1\64\1\63",
            "\1\66\1\65",
            "\1\70\1\67",
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
            "\1\111\1\112\1\107\1\110\1\105\1\106",
            "\1\117\1\uffff\1\120\1\113\1\114\2\uffff\1\115\1\116",
            "\1\125\1\uffff\1\126\1\121\1\122\1\123\1\124",
            "\1\131\1\uffff\1\132\2\uffff\1\127\1\130\1\133\1\134",
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
            "\1\u00be\1\u00bd",
            "\1\u00c0\1\u00bf",
            "\1\u00c2\1\u00c1",
            "\1\u00c4\1\u00c3",
            "\1\u00c6\1\u00c5",
            "\1\u00c8\1\u00c7",
            "\1\u00ca\1\u00c9",
            "\1\u00cc\1\u00cb",
            "\1\u00ce\1\u00cd",
            "\1\u00d0\1\u00cf",
            "\1\u00d2\1\u00d1",
            "\1\u00d4\1\u00d3",
            "\1\u00d6\1\u00d5",
            "\1\u00d8\1\u00d7",
            "\1\u00da\1\u00d9",
            "\1\u00dc\1\u00db",
            "\1\u00de\1\u00dd",
            "\1\u00e0\1\u00df",
            "\1\u00e2\1\u00e1",
            "\1\u00e4\1\u00e3",
            "\1\u00e6\1\u00e5",
            "\1\u00e8\1\u00e7",
            "\1\u00ea\1\u00e9",
            "\1\u00ec\1\u00eb",
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
            "\1\u0106\6\uffff\1\u0106\4\uffff\1\u0105\6\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106",
            "\1\u0106\6\uffff\1\u0106\4\uffff\1\u0105\6\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106",
            "\1\u0106\6\uffff\1\u0106\4\uffff\1\u0105\6\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106",
            "\1\u0106\6\uffff\1\u0106\4\uffff\1\u0105\6\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106",
            "\1\u0106\6\uffff\1\u0106\4\uffff\1\u0105\6\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106",
            "\1\u0106\6\uffff\1\u0106\4\uffff\1\u0105\6\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106",
            "\1\u0106\6\uffff\1\u0106\4\uffff\1\u0105\6\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106",
            "\1\u0106\6\uffff\1\u0106\4\uffff\1\u0105\6\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106",
            "\1\u0106\6\uffff\1\u0106\4\uffff\1\u0105\6\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106",
            "\1\u0106\6\uffff\1\u0106\4\uffff\1\u0105\6\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106",
            "\1\u0106\6\uffff\1\u0106\4\uffff\1\u0105\6\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106",
            "\1\u0106\6\uffff\1\u0106\4\uffff\1\u0105\6\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106",
            "\1\u0106\6\uffff\1\u0106\4\uffff\1\u0105\6\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106",
            "\1\u0106\6\uffff\1\u0106\4\uffff\1\u0105\6\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106",
            "\1\u0106\6\uffff\1\u0106\4\uffff\1\u0105\6\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106",
            "\1\u0106\6\uffff\1\u0106\4\uffff\1\u0105\6\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106",
            "\1\u0106\6\uffff\1\u0106\4\uffff\1\u0105\6\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106",
            "\1\u0106\6\uffff\1\u0106\4\uffff\1\u0105\6\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106",
            "\1\u0106\6\uffff\1\u0106\4\uffff\1\u0105\6\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106",
            "\1\u0106\6\uffff\1\u0106\4\uffff\1\u0105\6\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106",
            "\1\u0106\6\uffff\1\u0106\4\uffff\1\u0105\6\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106",
            "\1\u0106\6\uffff\1\u0106\4\uffff\1\u0105\6\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106",
            "\1\u0106\6\uffff\1\u0106\4\uffff\1\u0105\6\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106",
            "\1\u0106\6\uffff\1\u0106\4\uffff\1\u0105\6\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "212:6: (lv_parallele_11_1= ruleParallele2 | lv_parallele_11_2= ruleParallele3 )";
        }
    }
    static final String dfa_13s = "\121\uffff";
    static final String dfa_14s = "\1\31\10\26\10\5\20\32\10\5\20\27\10\21\1\34\3\31\14\uffff";
    static final String dfa_15s = "\1\41\10\26\10\6\20\32\10\6\20\27\10\21\2\41\1\37\1\41\14\uffff";
    static final String dfa_16s = "\105\uffff\1\2\1\1\1\3\1\4\1\6\1\5\1\10\1\7\1\11\1\12\1\14\1\13";
    static final String dfa_17s = "\121\uffff}>";
    static final String[] dfa_18s = {
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
            "\1\52\1\51",
            "\1\54\1\53",
            "\1\56\1\55",
            "\1\60\1\57",
            "\1\62\1\61",
            "\1\64\1\63",
            "\1\66\1\65",
            "\1\70\1\67",
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
            "\2\105\2\106\2\107",
            "\1\112\1\uffff\1\112\2\110\2\uffff\2\111",
            "\1\114\1\uffff\1\114\2\113\2\115",
            "\1\116\1\uffff\1\116\2\uffff\2\117\2\120",
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

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "464:2: ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) )";
        }
    }
    static final String dfa_19s = "\u0129\uffff";
    static final String dfa_20s = "\1\31\10\26\10\5\20\32\10\5\20\27\10\21\2\31\1\34\1\31\30\26\30\5\60\32\30\5\60\27\30\21\1\36\2\31\1\34\2\31\1\36\2\34\2\31\1\34\30\uffff";
    static final String dfa_21s = "\1\41\10\26\10\6\20\32\10\6\20\27\10\21\3\41\1\37\30\26\30\6\60\32\30\6\60\27\30\21\2\41\1\37\2\41\1\35\1\41\1\37\1\41\1\35\2\37\30\uffff";
    static final String dfa_22s = "\u0111\uffff\1\4\1\3\1\1\1\2\1\5\1\6\1\11\1\12\1\10\1\7\1\13\1\14\1\16\1\15\1\21\1\22\1\17\1\20\1\30\1\27\1\24\1\23\1\25\1\26";
    static final String dfa_23s = "\u0129\uffff}>";
    static final String[] dfa_24s = {
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
            "\1\52\1\51",
            "\1\54\1\53",
            "\1\56\1\55",
            "\1\60\1\57",
            "\1\62\1\61",
            "\1\64\1\63",
            "\1\66\1\65",
            "\1\70\1\67",
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
            "\1\121\1\122\1\125\1\126\1\123\1\124",
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
            "\1\u00be\1\u00bd",
            "\1\u00c0\1\u00bf",
            "\1\u00c2\1\u00c1",
            "\1\u00c4\1\u00c3",
            "\1\u00c6\1\u00c5",
            "\1\u00c8\1\u00c7",
            "\1\u00ca\1\u00c9",
            "\1\u00cc\1\u00cb",
            "\1\u00ce\1\u00cd",
            "\1\u00d0\1\u00cf",
            "\1\u00d2\1\u00d1",
            "\1\u00d4\1\u00d3",
            "\1\u00d6\1\u00d5",
            "\1\u00d8\1\u00d7",
            "\1\u00da\1\u00d9",
            "\1\u00dc\1\u00db",
            "\1\u00de\1\u00dd",
            "\1\u00e0\1\u00df",
            "\1\u00e2\1\u00e1",
            "\1\u00e4\1\u00e3",
            "\1\u00e6\1\u00e5",
            "\1\u00e8\1\u00e7",
            "\1\u00ea\1\u00e9",
            "\1\u00ec\1\u00eb",
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
            "\2\u0112\2\u0111",
            "\1\u0113\1\uffff\1\u0113\4\uffff\2\u0114",
            "\1\u0115\1\uffff\1\u0115\2\uffff\2\u0116",
            "\2\u0117\2\uffff\2\u0118",
            "\1\u011a\1\uffff\1\u011a\4\uffff\2\u0119",
            "\1\u011c\1\uffff\1\u011c\2\u011b",
            "\2\u011e\2\u011d",
            "\2\u0120\2\u011f",
            "\2\u0121\2\uffff\2\u0122",
            "\1\u0124\1\uffff\1\u0124\2\u0123",
            "\1\u0126\1\uffff\1\u0126\2\uffff\2\u0125",
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

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_19;
            this.eof = dfa_19;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "1022:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) )";
        }
    }
    static final String dfa_25s = "\16\uffff";
    static final String dfa_26s = "\1\31\4\uffff\1\26\3\uffff\1\5\2\27\2\uffff";
    static final String dfa_27s = "\1\41\4\uffff\1\26\3\uffff\1\6\2\32\2\uffff";
    static final String dfa_28s = "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\7\1\10\1\11\3\uffff\1\6\1\5";
    static final String dfa_29s = "\16\uffff}>";
    static final String[] dfa_30s = {
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

    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[][] dfa_30 = unpackEncodedStringArray(dfa_30s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_25;
            this.eof = dfa_25;
            this.min = dfa_26;
            this.max = dfa_27;
            this.accept = dfa_28;
            this.special = dfa_29;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "3477:2: (this_Avancer_0= ruleAvancer | this_Descendre_1= ruleDescendre | this_RotationDroite_2= ruleRotationDroite | this_RotationGauche_3= ruleRotationGauche | this_Pause_4= rulePause | this_Droite_5= ruleDroite | this_Gauche_6= ruleGauche | this_Reculer_7= ruleReculer | this_Monter_8= ruleMonter )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000043000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000017FB001020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000043002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000003FA000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000003FA001000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});

}