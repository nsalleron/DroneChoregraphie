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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INCLUDE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\n'", "'func'", "'main'", "'{'", "'prologue'", "'}'", "'import'", "'<'", "'>;'", "'def_pourcent_vitesse_hauteur_max'", "'('", "')'", "'def_pourcent_vitesse_deplacement_max'", "'def_pourcent_vitesse_rotation_max'", "'def_hauteur_max'", "'def_eloignement_max'", "'decoller'", "'atterrir'", "'monter'", "','", "'descendre'", "'avancer'", "'reculer'", "'gauche'", "'droite'", "'rotation_gauche'", "'rotation_droite'", "'Seconde'", "'='", "'Pourcent'", "'&'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
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
    // InternalMyTurtleDsl.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_includes_0_0= ruleIncludes ) )* (otherlv_1= '\\n' )* otherlv_2= 'func' otherlv_3= 'main' otherlv_4= '{' otherlv_5= 'prologue' otherlv_6= '{' ( (lv_pvhm_7_0= rulePourcent_vitesse_hauteur_max ) ) (otherlv_8= '\\n' )* ( (lv_pvdm_9_0= rulePourcent_vitesse_deplacement_max ) ) (otherlv_10= '\\n' )* ( (lv_pvrm_11_0= rulePourcent_vitesse_rotation_max ) ) (otherlv_12= '\\n' )* ( (lv_hm_13_0= ruleHauteur_max ) ) (otherlv_14= '\\n' )* ( (lv_em_15_0= ruleEloignement_max ) ) (otherlv_16= '\\n' )* otherlv_17= '}' ruleStart (otherlv_19= '\\n' )* ( ( (lv_SeconDec_20_0= ruleIntDecl ) ) | ( (lv_PourDec_21_0= rulePourcentDecl ) ) | ( (lv_statements_22_0= ruleStatement ) ) | ( (lv_fonctions_23_0= ruleFonctionCall ) ) | ( ( (lv_parallele_24_1= ruleParallele2 | lv_parallele_24_2= ruleParallele3 ) ) ) )* (otherlv_25= '\\n' )* ruleEnd (otherlv_27= '\\n' )* otherlv_28= '}' (otherlv_29= '\\n' )* ( (lv_fonctions_30_0= ruleFonctionDecl ) )* (otherlv_31= '\\n' )* )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        EObject lv_includes_0_0 = null;

        EObject lv_pvhm_7_0 = null;

        EObject lv_pvdm_9_0 = null;

        EObject lv_pvrm_11_0 = null;

        EObject lv_hm_13_0 = null;

        EObject lv_em_15_0 = null;

        EObject lv_SeconDec_20_0 = null;

        EObject lv_PourDec_21_0 = null;

        EObject lv_statements_22_0 = null;

        EObject lv_fonctions_23_0 = null;

        EObject lv_parallele_24_1 = null;

        EObject lv_parallele_24_2 = null;

        EObject lv_fonctions_30_0 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:77:2: ( ( ( (lv_includes_0_0= ruleIncludes ) )* (otherlv_1= '\\n' )* otherlv_2= 'func' otherlv_3= 'main' otherlv_4= '{' otherlv_5= 'prologue' otherlv_6= '{' ( (lv_pvhm_7_0= rulePourcent_vitesse_hauteur_max ) ) (otherlv_8= '\\n' )* ( (lv_pvdm_9_0= rulePourcent_vitesse_deplacement_max ) ) (otherlv_10= '\\n' )* ( (lv_pvrm_11_0= rulePourcent_vitesse_rotation_max ) ) (otherlv_12= '\\n' )* ( (lv_hm_13_0= ruleHauteur_max ) ) (otherlv_14= '\\n' )* ( (lv_em_15_0= ruleEloignement_max ) ) (otherlv_16= '\\n' )* otherlv_17= '}' ruleStart (otherlv_19= '\\n' )* ( ( (lv_SeconDec_20_0= ruleIntDecl ) ) | ( (lv_PourDec_21_0= rulePourcentDecl ) ) | ( (lv_statements_22_0= ruleStatement ) ) | ( (lv_fonctions_23_0= ruleFonctionCall ) ) | ( ( (lv_parallele_24_1= ruleParallele2 | lv_parallele_24_2= ruleParallele3 ) ) ) )* (otherlv_25= '\\n' )* ruleEnd (otherlv_27= '\\n' )* otherlv_28= '}' (otherlv_29= '\\n' )* ( (lv_fonctions_30_0= ruleFonctionDecl ) )* (otherlv_31= '\\n' )* )* )
            // InternalMyTurtleDsl.g:78:2: ( ( (lv_includes_0_0= ruleIncludes ) )* (otherlv_1= '\\n' )* otherlv_2= 'func' otherlv_3= 'main' otherlv_4= '{' otherlv_5= 'prologue' otherlv_6= '{' ( (lv_pvhm_7_0= rulePourcent_vitesse_hauteur_max ) ) (otherlv_8= '\\n' )* ( (lv_pvdm_9_0= rulePourcent_vitesse_deplacement_max ) ) (otherlv_10= '\\n' )* ( (lv_pvrm_11_0= rulePourcent_vitesse_rotation_max ) ) (otherlv_12= '\\n' )* ( (lv_hm_13_0= ruleHauteur_max ) ) (otherlv_14= '\\n' )* ( (lv_em_15_0= ruleEloignement_max ) ) (otherlv_16= '\\n' )* otherlv_17= '}' ruleStart (otherlv_19= '\\n' )* ( ( (lv_SeconDec_20_0= ruleIntDecl ) ) | ( (lv_PourDec_21_0= rulePourcentDecl ) ) | ( (lv_statements_22_0= ruleStatement ) ) | ( (lv_fonctions_23_0= ruleFonctionCall ) ) | ( ( (lv_parallele_24_1= ruleParallele2 | lv_parallele_24_2= ruleParallele3 ) ) ) )* (otherlv_25= '\\n' )* ruleEnd (otherlv_27= '\\n' )* otherlv_28= '}' (otherlv_29= '\\n' )* ( (lv_fonctions_30_0= ruleFonctionDecl ) )* (otherlv_31= '\\n' )* )*
            {
            // InternalMyTurtleDsl.g:78:2: ( ( (lv_includes_0_0= ruleIncludes ) )* (otherlv_1= '\\n' )* otherlv_2= 'func' otherlv_3= 'main' otherlv_4= '{' otherlv_5= 'prologue' otherlv_6= '{' ( (lv_pvhm_7_0= rulePourcent_vitesse_hauteur_max ) ) (otherlv_8= '\\n' )* ( (lv_pvdm_9_0= rulePourcent_vitesse_deplacement_max ) ) (otherlv_10= '\\n' )* ( (lv_pvrm_11_0= rulePourcent_vitesse_rotation_max ) ) (otherlv_12= '\\n' )* ( (lv_hm_13_0= ruleHauteur_max ) ) (otherlv_14= '\\n' )* ( (lv_em_15_0= ruleEloignement_max ) ) (otherlv_16= '\\n' )* otherlv_17= '}' ruleStart (otherlv_19= '\\n' )* ( ( (lv_SeconDec_20_0= ruleIntDecl ) ) | ( (lv_PourDec_21_0= rulePourcentDecl ) ) | ( (lv_statements_22_0= ruleStatement ) ) | ( (lv_fonctions_23_0= ruleFonctionCall ) ) | ( ( (lv_parallele_24_1= ruleParallele2 | lv_parallele_24_2= ruleParallele3 ) ) ) )* (otherlv_25= '\\n' )* ruleEnd (otherlv_27= '\\n' )* otherlv_28= '}' (otherlv_29= '\\n' )* ( (lv_fonctions_30_0= ruleFonctionDecl ) )* (otherlv_31= '\\n' )* )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=12 && LA16_0<=13)||LA16_0==18) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:79:3: ( (lv_includes_0_0= ruleIncludes ) )* (otherlv_1= '\\n' )* otherlv_2= 'func' otherlv_3= 'main' otherlv_4= '{' otherlv_5= 'prologue' otherlv_6= '{' ( (lv_pvhm_7_0= rulePourcent_vitesse_hauteur_max ) ) (otherlv_8= '\\n' )* ( (lv_pvdm_9_0= rulePourcent_vitesse_deplacement_max ) ) (otherlv_10= '\\n' )* ( (lv_pvrm_11_0= rulePourcent_vitesse_rotation_max ) ) (otherlv_12= '\\n' )* ( (lv_hm_13_0= ruleHauteur_max ) ) (otherlv_14= '\\n' )* ( (lv_em_15_0= ruleEloignement_max ) ) (otherlv_16= '\\n' )* otherlv_17= '}' ruleStart (otherlv_19= '\\n' )* ( ( (lv_SeconDec_20_0= ruleIntDecl ) ) | ( (lv_PourDec_21_0= rulePourcentDecl ) ) | ( (lv_statements_22_0= ruleStatement ) ) | ( (lv_fonctions_23_0= ruleFonctionCall ) ) | ( ( (lv_parallele_24_1= ruleParallele2 | lv_parallele_24_2= ruleParallele3 ) ) ) )* (otherlv_25= '\\n' )* ruleEnd (otherlv_27= '\\n' )* otherlv_28= '}' (otherlv_29= '\\n' )* ( (lv_fonctions_30_0= ruleFonctionDecl ) )* (otherlv_31= '\\n' )*
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
            	    		
            	    otherlv_5=(Token)match(input,16,FOLLOW_6); 

            	    			newLeafNode(otherlv_5, grammarAccess.getModelAccess().getPrologueKeyword_5());
            	    		
            	    otherlv_6=(Token)match(input,15,FOLLOW_8); 

            	    			newLeafNode(otherlv_6, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_6());
            	    		
            	    // InternalMyTurtleDsl.g:124:3: ( (lv_pvhm_7_0= rulePourcent_vitesse_hauteur_max ) )
            	    // InternalMyTurtleDsl.g:125:4: (lv_pvhm_7_0= rulePourcent_vitesse_hauteur_max )
            	    {
            	    // InternalMyTurtleDsl.g:125:4: (lv_pvhm_7_0= rulePourcent_vitesse_hauteur_max )
            	    // InternalMyTurtleDsl.g:126:5: lv_pvhm_7_0= rulePourcent_vitesse_hauteur_max
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getPvhmPourcent_vitesse_hauteur_maxParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_pvhm_7_0=rulePourcent_vitesse_hauteur_max();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"pvhm",
            	    						lv_pvhm_7_0,
            	    						"org.xtext.example.mydsl.MyTurtleDsl.Pourcent_vitesse_hauteur_max");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }

            	    // InternalMyTurtleDsl.g:143:3: (otherlv_8= '\\n' )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==12) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalMyTurtleDsl.g:144:4: otherlv_8= '\\n'
            	    	    {
            	    	    otherlv_8=(Token)match(input,12,FOLLOW_9); 

            	    	    				newLeafNode(otherlv_8, grammarAccess.getModelAccess().getLineFeedKeyword_8());
            	    	    			

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);

            	    // InternalMyTurtleDsl.g:149:3: ( (lv_pvdm_9_0= rulePourcent_vitesse_deplacement_max ) )
            	    // InternalMyTurtleDsl.g:150:4: (lv_pvdm_9_0= rulePourcent_vitesse_deplacement_max )
            	    {
            	    // InternalMyTurtleDsl.g:150:4: (lv_pvdm_9_0= rulePourcent_vitesse_deplacement_max )
            	    // InternalMyTurtleDsl.g:151:5: lv_pvdm_9_0= rulePourcent_vitesse_deplacement_max
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getPvdmPourcent_vitesse_deplacement_maxParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_pvdm_9_0=rulePourcent_vitesse_deplacement_max();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"pvdm",
            	    						lv_pvdm_9_0,
            	    						"org.xtext.example.mydsl.MyTurtleDsl.Pourcent_vitesse_deplacement_max");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }

            	    // InternalMyTurtleDsl.g:168:3: (otherlv_10= '\\n' )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==12) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalMyTurtleDsl.g:169:4: otherlv_10= '\\n'
            	    	    {
            	    	    otherlv_10=(Token)match(input,12,FOLLOW_10); 

            	    	    				newLeafNode(otherlv_10, grammarAccess.getModelAccess().getLineFeedKeyword_10());
            	    	    			

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop4;
            	        }
            	    } while (true);

            	    // InternalMyTurtleDsl.g:174:3: ( (lv_pvrm_11_0= rulePourcent_vitesse_rotation_max ) )
            	    // InternalMyTurtleDsl.g:175:4: (lv_pvrm_11_0= rulePourcent_vitesse_rotation_max )
            	    {
            	    // InternalMyTurtleDsl.g:175:4: (lv_pvrm_11_0= rulePourcent_vitesse_rotation_max )
            	    // InternalMyTurtleDsl.g:176:5: lv_pvrm_11_0= rulePourcent_vitesse_rotation_max
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getPvrmPourcent_vitesse_rotation_maxParserRuleCall_11_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_pvrm_11_0=rulePourcent_vitesse_rotation_max();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"pvrm",
            	    						lv_pvrm_11_0,
            	    						"org.xtext.example.mydsl.MyTurtleDsl.Pourcent_vitesse_rotation_max");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }

            	    // InternalMyTurtleDsl.g:193:3: (otherlv_12= '\\n' )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==12) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalMyTurtleDsl.g:194:4: otherlv_12= '\\n'
            	    	    {
            	    	    otherlv_12=(Token)match(input,12,FOLLOW_11); 

            	    	    				newLeafNode(otherlv_12, grammarAccess.getModelAccess().getLineFeedKeyword_12());
            	    	    			

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);

            	    // InternalMyTurtleDsl.g:199:3: ( (lv_hm_13_0= ruleHauteur_max ) )
            	    // InternalMyTurtleDsl.g:200:4: (lv_hm_13_0= ruleHauteur_max )
            	    {
            	    // InternalMyTurtleDsl.g:200:4: (lv_hm_13_0= ruleHauteur_max )
            	    // InternalMyTurtleDsl.g:201:5: lv_hm_13_0= ruleHauteur_max
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getHmHauteur_maxParserRuleCall_13_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_hm_13_0=ruleHauteur_max();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"hm",
            	    						lv_hm_13_0,
            	    						"org.xtext.example.mydsl.MyTurtleDsl.Hauteur_max");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }

            	    // InternalMyTurtleDsl.g:218:3: (otherlv_14= '\\n' )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==12) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalMyTurtleDsl.g:219:4: otherlv_14= '\\n'
            	    	    {
            	    	    otherlv_14=(Token)match(input,12,FOLLOW_12); 

            	    	    				newLeafNode(otherlv_14, grammarAccess.getModelAccess().getLineFeedKeyword_14());
            	    	    			

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop6;
            	        }
            	    } while (true);

            	    // InternalMyTurtleDsl.g:224:3: ( (lv_em_15_0= ruleEloignement_max ) )
            	    // InternalMyTurtleDsl.g:225:4: (lv_em_15_0= ruleEloignement_max )
            	    {
            	    // InternalMyTurtleDsl.g:225:4: (lv_em_15_0= ruleEloignement_max )
            	    // InternalMyTurtleDsl.g:226:5: lv_em_15_0= ruleEloignement_max
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getEmEloignement_maxParserRuleCall_15_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_em_15_0=ruleEloignement_max();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"em",
            	    						lv_em_15_0,
            	    						"org.xtext.example.mydsl.MyTurtleDsl.Eloignement_max");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }

            	    // InternalMyTurtleDsl.g:243:3: (otherlv_16= '\\n' )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==12) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalMyTurtleDsl.g:244:4: otherlv_16= '\\n'
            	    	    {
            	    	    otherlv_16=(Token)match(input,12,FOLLOW_13); 

            	    	    				newLeafNode(otherlv_16, grammarAccess.getModelAccess().getLineFeedKeyword_16());
            	    	    			

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);

            	    otherlv_17=(Token)match(input,17,FOLLOW_14); 

            	    			newLeafNode(otherlv_17, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_17());
            	    		

            	    			newCompositeNode(grammarAccess.getModelAccess().getStartParserRuleCall_18());
            	    		
            	    pushFollow(FOLLOW_15);
            	    ruleStart();

            	    state._fsp--;


            	    			afterParserOrEnumRuleCall();
            	    		
            	    // InternalMyTurtleDsl.g:260:3: (otherlv_19= '\\n' )*
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==12) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalMyTurtleDsl.g:261:4: otherlv_19= '\\n'
            	    	    {
            	    	    otherlv_19=(Token)match(input,12,FOLLOW_15); 

            	    	    				newLeafNode(otherlv_19, grammarAccess.getModelAccess().getLineFeedKeyword_19());
            	    	    			

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop8;
            	        }
            	    } while (true);

            	    // InternalMyTurtleDsl.g:266:3: ( ( (lv_SeconDec_20_0= ruleIntDecl ) ) | ( (lv_PourDec_21_0= rulePourcentDecl ) ) | ( (lv_statements_22_0= ruleStatement ) ) | ( (lv_fonctions_23_0= ruleFonctionCall ) ) | ( ( (lv_parallele_24_1= ruleParallele2 | lv_parallele_24_2= ruleParallele3 ) ) ) )*
            	    loop10:
            	    do {
            	        int alt10=6;
            	        alt10 = dfa10.predict(input);
            	        switch (alt10) {
            	    	case 1 :
            	    	    // InternalMyTurtleDsl.g:267:4: ( (lv_SeconDec_20_0= ruleIntDecl ) )
            	    	    {
            	    	    // InternalMyTurtleDsl.g:267:4: ( (lv_SeconDec_20_0= ruleIntDecl ) )
            	    	    // InternalMyTurtleDsl.g:268:5: (lv_SeconDec_20_0= ruleIntDecl )
            	    	    {
            	    	    // InternalMyTurtleDsl.g:268:5: (lv_SeconDec_20_0= ruleIntDecl )
            	    	    // InternalMyTurtleDsl.g:269:6: lv_SeconDec_20_0= ruleIntDecl
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getModelAccess().getSeconDecIntDeclParserRuleCall_20_0_0());
            	    	    					
            	    	    pushFollow(FOLLOW_15);
            	    	    lv_SeconDec_20_0=ruleIntDecl();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"SeconDec",
            	    	    							lv_SeconDec_20_0,
            	    	    							"org.xtext.example.mydsl.MyTurtleDsl.IntDecl");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalMyTurtleDsl.g:287:4: ( (lv_PourDec_21_0= rulePourcentDecl ) )
            	    	    {
            	    	    // InternalMyTurtleDsl.g:287:4: ( (lv_PourDec_21_0= rulePourcentDecl ) )
            	    	    // InternalMyTurtleDsl.g:288:5: (lv_PourDec_21_0= rulePourcentDecl )
            	    	    {
            	    	    // InternalMyTurtleDsl.g:288:5: (lv_PourDec_21_0= rulePourcentDecl )
            	    	    // InternalMyTurtleDsl.g:289:6: lv_PourDec_21_0= rulePourcentDecl
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getModelAccess().getPourDecPourcentDeclParserRuleCall_20_1_0());
            	    	    					
            	    	    pushFollow(FOLLOW_15);
            	    	    lv_PourDec_21_0=rulePourcentDecl();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"PourDec",
            	    	    							lv_PourDec_21_0,
            	    	    							"org.xtext.example.mydsl.MyTurtleDsl.PourcentDecl");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 3 :
            	    	    // InternalMyTurtleDsl.g:307:4: ( (lv_statements_22_0= ruleStatement ) )
            	    	    {
            	    	    // InternalMyTurtleDsl.g:307:4: ( (lv_statements_22_0= ruleStatement ) )
            	    	    // InternalMyTurtleDsl.g:308:5: (lv_statements_22_0= ruleStatement )
            	    	    {
            	    	    // InternalMyTurtleDsl.g:308:5: (lv_statements_22_0= ruleStatement )
            	    	    // InternalMyTurtleDsl.g:309:6: lv_statements_22_0= ruleStatement
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_20_2_0());
            	    	    					
            	    	    pushFollow(FOLLOW_15);
            	    	    lv_statements_22_0=ruleStatement();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"statements",
            	    	    							lv_statements_22_0,
            	    	    							"org.xtext.example.mydsl.MyTurtleDsl.Statement");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 4 :
            	    	    // InternalMyTurtleDsl.g:327:4: ( (lv_fonctions_23_0= ruleFonctionCall ) )
            	    	    {
            	    	    // InternalMyTurtleDsl.g:327:4: ( (lv_fonctions_23_0= ruleFonctionCall ) )
            	    	    // InternalMyTurtleDsl.g:328:5: (lv_fonctions_23_0= ruleFonctionCall )
            	    	    {
            	    	    // InternalMyTurtleDsl.g:328:5: (lv_fonctions_23_0= ruleFonctionCall )
            	    	    // InternalMyTurtleDsl.g:329:6: lv_fonctions_23_0= ruleFonctionCall
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getModelAccess().getFonctionsFonctionCallParserRuleCall_20_3_0());
            	    	    					
            	    	    pushFollow(FOLLOW_15);
            	    	    lv_fonctions_23_0=ruleFonctionCall();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"fonctions",
            	    	    							lv_fonctions_23_0,
            	    	    							"org.xtext.example.mydsl.MyTurtleDsl.FonctionCall");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 5 :
            	    	    // InternalMyTurtleDsl.g:347:4: ( ( (lv_parallele_24_1= ruleParallele2 | lv_parallele_24_2= ruleParallele3 ) ) )
            	    	    {
            	    	    // InternalMyTurtleDsl.g:347:4: ( ( (lv_parallele_24_1= ruleParallele2 | lv_parallele_24_2= ruleParallele3 ) ) )
            	    	    // InternalMyTurtleDsl.g:348:5: ( (lv_parallele_24_1= ruleParallele2 | lv_parallele_24_2= ruleParallele3 ) )
            	    	    {
            	    	    // InternalMyTurtleDsl.g:348:5: ( (lv_parallele_24_1= ruleParallele2 | lv_parallele_24_2= ruleParallele3 ) )
            	    	    // InternalMyTurtleDsl.g:349:6: (lv_parallele_24_1= ruleParallele2 | lv_parallele_24_2= ruleParallele3 )
            	    	    {
            	    	    // InternalMyTurtleDsl.g:349:6: (lv_parallele_24_1= ruleParallele2 | lv_parallele_24_2= ruleParallele3 )
            	    	    int alt9=2;
            	    	    alt9 = dfa9.predict(input);
            	    	    switch (alt9) {
            	    	        case 1 :
            	    	            // InternalMyTurtleDsl.g:350:7: lv_parallele_24_1= ruleParallele2
            	    	            {

            	    	            							newCompositeNode(grammarAccess.getModelAccess().getParalleleParallele2ParserRuleCall_20_4_0_0());
            	    	            						
            	    	            pushFollow(FOLLOW_15);
            	    	            lv_parallele_24_1=ruleParallele2();

            	    	            state._fsp--;


            	    	            							if (current==null) {
            	    	            								current = createModelElementForParent(grammarAccess.getModelRule());
            	    	            							}
            	    	            							add(
            	    	            								current,
            	    	            								"parallele",
            	    	            								lv_parallele_24_1,
            	    	            								"org.xtext.example.mydsl.MyTurtleDsl.Parallele2");
            	    	            							afterParserOrEnumRuleCall();
            	    	            						

            	    	            }
            	    	            break;
            	    	        case 2 :
            	    	            // InternalMyTurtleDsl.g:366:7: lv_parallele_24_2= ruleParallele3
            	    	            {

            	    	            							newCompositeNode(grammarAccess.getModelAccess().getParalleleParallele3ParserRuleCall_20_4_0_1());
            	    	            						
            	    	            pushFollow(FOLLOW_15);
            	    	            lv_parallele_24_2=ruleParallele3();

            	    	            state._fsp--;


            	    	            							if (current==null) {
            	    	            								current = createModelElementForParent(grammarAccess.getModelRule());
            	    	            							}
            	    	            							add(
            	    	            								current,
            	    	            								"parallele",
            	    	            								lv_parallele_24_2,
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
            	    	    break loop10;
            	        }
            	    } while (true);

            	    // InternalMyTurtleDsl.g:385:3: (otherlv_25= '\\n' )*
            	    loop11:
            	    do {
            	        int alt11=2;
            	        int LA11_0 = input.LA(1);

            	        if ( (LA11_0==12) ) {
            	            alt11=1;
            	        }


            	        switch (alt11) {
            	    	case 1 :
            	    	    // InternalMyTurtleDsl.g:386:4: otherlv_25= '\\n'
            	    	    {
            	    	    otherlv_25=(Token)match(input,12,FOLLOW_15); 

            	    	    				newLeafNode(otherlv_25, grammarAccess.getModelAccess().getLineFeedKeyword_21());
            	    	    			

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop11;
            	        }
            	    } while (true);


            	    			newCompositeNode(grammarAccess.getModelAccess().getEndParserRuleCall_22());
            	    		
            	    pushFollow(FOLLOW_13);
            	    ruleEnd();

            	    state._fsp--;


            	    			afterParserOrEnumRuleCall();
            	    		
            	    // InternalMyTurtleDsl.g:398:3: (otherlv_27= '\\n' )*
            	    loop12:
            	    do {
            	        int alt12=2;
            	        int LA12_0 = input.LA(1);

            	        if ( (LA12_0==12) ) {
            	            alt12=1;
            	        }


            	        switch (alt12) {
            	    	case 1 :
            	    	    // InternalMyTurtleDsl.g:399:4: otherlv_27= '\\n'
            	    	    {
            	    	    otherlv_27=(Token)match(input,12,FOLLOW_13); 

            	    	    				newLeafNode(otherlv_27, grammarAccess.getModelAccess().getLineFeedKeyword_23());
            	    	    			

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop12;
            	        }
            	    } while (true);

            	    otherlv_28=(Token)match(input,17,FOLLOW_16); 

            	    			newLeafNode(otherlv_28, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_24());
            	    		
            	    // InternalMyTurtleDsl.g:408:3: (otherlv_29= '\\n' )*
            	    loop13:
            	    do {
            	        int alt13=2;
            	        int LA13_0 = input.LA(1);

            	        if ( (LA13_0==12) ) {
            	            alt13=1;
            	        }


            	        switch (alt13) {
            	    	case 1 :
            	    	    // InternalMyTurtleDsl.g:409:4: otherlv_29= '\\n'
            	    	    {
            	    	    otherlv_29=(Token)match(input,12,FOLLOW_16); 

            	    	    				newLeafNode(otherlv_29, grammarAccess.getModelAccess().getLineFeedKeyword_25());
            	    	    			

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop13;
            	        }
            	    } while (true);

            	    // InternalMyTurtleDsl.g:414:3: ( (lv_fonctions_30_0= ruleFonctionDecl ) )*
            	    loop14:
            	    do {
            	        int alt14=2;
            	        int LA14_0 = input.LA(1);

            	        if ( (LA14_0==13) ) {
            	            int LA14_2 = input.LA(2);

            	            if ( (LA14_2==RULE_ID) ) {
            	                alt14=1;
            	            }


            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // InternalMyTurtleDsl.g:415:4: (lv_fonctions_30_0= ruleFonctionDecl )
            	    	    {
            	    	    // InternalMyTurtleDsl.g:415:4: (lv_fonctions_30_0= ruleFonctionDecl )
            	    	    // InternalMyTurtleDsl.g:416:5: lv_fonctions_30_0= ruleFonctionDecl
            	    	    {

            	    	    					newCompositeNode(grammarAccess.getModelAccess().getFonctionsFonctionDeclParserRuleCall_26_0());
            	    	    				
            	    	    pushFollow(FOLLOW_16);
            	    	    lv_fonctions_30_0=ruleFonctionDecl();

            	    	    state._fsp--;


            	    	    					if (current==null) {
            	    	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    	    					}
            	    	    					add(
            	    	    						current,
            	    	    						"fonctions",
            	    	    						lv_fonctions_30_0,
            	    	    						"org.xtext.example.mydsl.MyTurtleDsl.FonctionDecl");
            	    	    					afterParserOrEnumRuleCall();
            	    	    				

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop14;
            	        }
            	    } while (true);

            	    // InternalMyTurtleDsl.g:433:3: (otherlv_31= '\\n' )*
            	    loop15:
            	    do {
            	        int alt15=2;
            	        int LA15_0 = input.LA(1);

            	        if ( (LA15_0==12) ) {
            	            alt15=1;
            	        }


            	        switch (alt15) {
            	    	case 1 :
            	    	    // InternalMyTurtleDsl.g:434:4: otherlv_31= '\\n'
            	    	    {
            	    	    otherlv_31=(Token)match(input,12,FOLLOW_16); 

            	    	    				newLeafNode(otherlv_31, grammarAccess.getModelAccess().getLineFeedKeyword_27());
            	    	    			

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop15;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop16;
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


    // $ANTLR start "entryRuleIncludes"
    // InternalMyTurtleDsl.g:443:1: entryRuleIncludes returns [EObject current=null] : iv_ruleIncludes= ruleIncludes EOF ;
    public final EObject entryRuleIncludes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncludes = null;


        try {
            // InternalMyTurtleDsl.g:443:49: (iv_ruleIncludes= ruleIncludes EOF )
            // InternalMyTurtleDsl.g:444:2: iv_ruleIncludes= ruleIncludes EOF
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
    // InternalMyTurtleDsl.g:450:1: ruleIncludes returns [EObject current=null] : (otherlv_0= 'import' otherlv_1= '<' ( (lv_importURI_2_0= RULE_INCLUDE ) ) otherlv_3= '>;' ) ;
    public final EObject ruleIncludes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_importURI_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyTurtleDsl.g:456:2: ( (otherlv_0= 'import' otherlv_1= '<' ( (lv_importURI_2_0= RULE_INCLUDE ) ) otherlv_3= '>;' ) )
            // InternalMyTurtleDsl.g:457:2: (otherlv_0= 'import' otherlv_1= '<' ( (lv_importURI_2_0= RULE_INCLUDE ) ) otherlv_3= '>;' )
            {
            // InternalMyTurtleDsl.g:457:2: (otherlv_0= 'import' otherlv_1= '<' ( (lv_importURI_2_0= RULE_INCLUDE ) ) otherlv_3= '>;' )
            // InternalMyTurtleDsl.g:458:3: otherlv_0= 'import' otherlv_1= '<' ( (lv_importURI_2_0= RULE_INCLUDE ) ) otherlv_3= '>;'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getIncludesAccess().getImportKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getIncludesAccess().getLessThanSignKeyword_1());
            		
            // InternalMyTurtleDsl.g:466:3: ( (lv_importURI_2_0= RULE_INCLUDE ) )
            // InternalMyTurtleDsl.g:467:4: (lv_importURI_2_0= RULE_INCLUDE )
            {
            // InternalMyTurtleDsl.g:467:4: (lv_importURI_2_0= RULE_INCLUDE )
            // InternalMyTurtleDsl.g:468:5: lv_importURI_2_0= RULE_INCLUDE
            {
            lv_importURI_2_0=(Token)match(input,RULE_INCLUDE,FOLLOW_19); 

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


    // $ANTLR start "entryRulePourcent_vitesse_hauteur_max"
    // InternalMyTurtleDsl.g:492:1: entryRulePourcent_vitesse_hauteur_max returns [EObject current=null] : iv_rulePourcent_vitesse_hauteur_max= rulePourcent_vitesse_hauteur_max EOF ;
    public final EObject entryRulePourcent_vitesse_hauteur_max() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePourcent_vitesse_hauteur_max = null;


        try {
            // InternalMyTurtleDsl.g:492:69: (iv_rulePourcent_vitesse_hauteur_max= rulePourcent_vitesse_hauteur_max EOF )
            // InternalMyTurtleDsl.g:493:2: iv_rulePourcent_vitesse_hauteur_max= rulePourcent_vitesse_hauteur_max EOF
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
    // InternalMyTurtleDsl.g:499:1: rulePourcent_vitesse_hauteur_max returns [EObject current=null] : (otherlv_0= 'def_pourcent_vitesse_hauteur_max' otherlv_1= '(' ( (lv_vitesse_verticale_2_0= ruleIntExp ) ) otherlv_3= ')' ) ;
    public final EObject rulePourcent_vitesse_hauteur_max() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_vitesse_verticale_2_0 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:505:2: ( (otherlv_0= 'def_pourcent_vitesse_hauteur_max' otherlv_1= '(' ( (lv_vitesse_verticale_2_0= ruleIntExp ) ) otherlv_3= ')' ) )
            // InternalMyTurtleDsl.g:506:2: (otherlv_0= 'def_pourcent_vitesse_hauteur_max' otherlv_1= '(' ( (lv_vitesse_verticale_2_0= ruleIntExp ) ) otherlv_3= ')' )
            {
            // InternalMyTurtleDsl.g:506:2: (otherlv_0= 'def_pourcent_vitesse_hauteur_max' otherlv_1= '(' ( (lv_vitesse_verticale_2_0= ruleIntExp ) ) otherlv_3= ')' )
            // InternalMyTurtleDsl.g:507:3: otherlv_0= 'def_pourcent_vitesse_hauteur_max' otherlv_1= '(' ( (lv_vitesse_verticale_2_0= ruleIntExp ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getPourcent_vitesse_hauteur_maxAccess().getDef_pourcent_vitesse_hauteur_maxKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getPourcent_vitesse_hauteur_maxAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyTurtleDsl.g:515:3: ( (lv_vitesse_verticale_2_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:516:4: (lv_vitesse_verticale_2_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:516:4: (lv_vitesse_verticale_2_0= ruleIntExp )
            // InternalMyTurtleDsl.g:517:5: lv_vitesse_verticale_2_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getPourcent_vitesse_hauteur_maxAccess().getVitesse_verticaleIntExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_vitesse_verticale_2_0=ruleIntExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPourcent_vitesse_hauteur_maxRule());
            					}
            					set(
            						current,
            						"vitesse_verticale",
            						lv_vitesse_verticale_2_0,
            						"org.xtext.example.mydsl.MyTurtleDsl.IntExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPourcent_vitesse_hauteur_maxAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

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
    // InternalMyTurtleDsl.g:542:1: entryRulePourcent_vitesse_deplacement_max returns [EObject current=null] : iv_rulePourcent_vitesse_deplacement_max= rulePourcent_vitesse_deplacement_max EOF ;
    public final EObject entryRulePourcent_vitesse_deplacement_max() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePourcent_vitesse_deplacement_max = null;


        try {
            // InternalMyTurtleDsl.g:542:73: (iv_rulePourcent_vitesse_deplacement_max= rulePourcent_vitesse_deplacement_max EOF )
            // InternalMyTurtleDsl.g:543:2: iv_rulePourcent_vitesse_deplacement_max= rulePourcent_vitesse_deplacement_max EOF
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
    // InternalMyTurtleDsl.g:549:1: rulePourcent_vitesse_deplacement_max returns [EObject current=null] : (otherlv_0= 'def_pourcent_vitesse_deplacement_max' otherlv_1= '(' ( (lv_vitesse_deplacement_2_0= ruleIntExp ) ) otherlv_3= ')' ) ;
    public final EObject rulePourcent_vitesse_deplacement_max() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_vitesse_deplacement_2_0 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:555:2: ( (otherlv_0= 'def_pourcent_vitesse_deplacement_max' otherlv_1= '(' ( (lv_vitesse_deplacement_2_0= ruleIntExp ) ) otherlv_3= ')' ) )
            // InternalMyTurtleDsl.g:556:2: (otherlv_0= 'def_pourcent_vitesse_deplacement_max' otherlv_1= '(' ( (lv_vitesse_deplacement_2_0= ruleIntExp ) ) otherlv_3= ')' )
            {
            // InternalMyTurtleDsl.g:556:2: (otherlv_0= 'def_pourcent_vitesse_deplacement_max' otherlv_1= '(' ( (lv_vitesse_deplacement_2_0= ruleIntExp ) ) otherlv_3= ')' )
            // InternalMyTurtleDsl.g:557:3: otherlv_0= 'def_pourcent_vitesse_deplacement_max' otherlv_1= '(' ( (lv_vitesse_deplacement_2_0= ruleIntExp ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getPourcent_vitesse_deplacement_maxAccess().getDef_pourcent_vitesse_deplacement_maxKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getPourcent_vitesse_deplacement_maxAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyTurtleDsl.g:565:3: ( (lv_vitesse_deplacement_2_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:566:4: (lv_vitesse_deplacement_2_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:566:4: (lv_vitesse_deplacement_2_0= ruleIntExp )
            // InternalMyTurtleDsl.g:567:5: lv_vitesse_deplacement_2_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getPourcent_vitesse_deplacement_maxAccess().getVitesse_deplacementIntExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_vitesse_deplacement_2_0=ruleIntExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPourcent_vitesse_deplacement_maxRule());
            					}
            					set(
            						current,
            						"vitesse_deplacement",
            						lv_vitesse_deplacement_2_0,
            						"org.xtext.example.mydsl.MyTurtleDsl.IntExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPourcent_vitesse_deplacement_maxAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

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
    // InternalMyTurtleDsl.g:592:1: entryRulePourcent_vitesse_rotation_max returns [EObject current=null] : iv_rulePourcent_vitesse_rotation_max= rulePourcent_vitesse_rotation_max EOF ;
    public final EObject entryRulePourcent_vitesse_rotation_max() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePourcent_vitesse_rotation_max = null;


        try {
            // InternalMyTurtleDsl.g:592:70: (iv_rulePourcent_vitesse_rotation_max= rulePourcent_vitesse_rotation_max EOF )
            // InternalMyTurtleDsl.g:593:2: iv_rulePourcent_vitesse_rotation_max= rulePourcent_vitesse_rotation_max EOF
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
    // InternalMyTurtleDsl.g:599:1: rulePourcent_vitesse_rotation_max returns [EObject current=null] : (otherlv_0= 'def_pourcent_vitesse_rotation_max' otherlv_1= '(' ( (lv_vitesse_deplacement_2_0= ruleIntExp ) ) otherlv_3= ')' ) ;
    public final EObject rulePourcent_vitesse_rotation_max() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_vitesse_deplacement_2_0 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:605:2: ( (otherlv_0= 'def_pourcent_vitesse_rotation_max' otherlv_1= '(' ( (lv_vitesse_deplacement_2_0= ruleIntExp ) ) otherlv_3= ')' ) )
            // InternalMyTurtleDsl.g:606:2: (otherlv_0= 'def_pourcent_vitesse_rotation_max' otherlv_1= '(' ( (lv_vitesse_deplacement_2_0= ruleIntExp ) ) otherlv_3= ')' )
            {
            // InternalMyTurtleDsl.g:606:2: (otherlv_0= 'def_pourcent_vitesse_rotation_max' otherlv_1= '(' ( (lv_vitesse_deplacement_2_0= ruleIntExp ) ) otherlv_3= ')' )
            // InternalMyTurtleDsl.g:607:3: otherlv_0= 'def_pourcent_vitesse_rotation_max' otherlv_1= '(' ( (lv_vitesse_deplacement_2_0= ruleIntExp ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getPourcent_vitesse_rotation_maxAccess().getDef_pourcent_vitesse_rotation_maxKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getPourcent_vitesse_rotation_maxAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyTurtleDsl.g:615:3: ( (lv_vitesse_deplacement_2_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:616:4: (lv_vitesse_deplacement_2_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:616:4: (lv_vitesse_deplacement_2_0= ruleIntExp )
            // InternalMyTurtleDsl.g:617:5: lv_vitesse_deplacement_2_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getPourcent_vitesse_rotation_maxAccess().getVitesse_deplacementIntExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_vitesse_deplacement_2_0=ruleIntExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPourcent_vitesse_rotation_maxRule());
            					}
            					set(
            						current,
            						"vitesse_deplacement",
            						lv_vitesse_deplacement_2_0,
            						"org.xtext.example.mydsl.MyTurtleDsl.IntExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPourcent_vitesse_rotation_maxAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

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
    // InternalMyTurtleDsl.g:642:1: entryRuleHauteur_max returns [EObject current=null] : iv_ruleHauteur_max= ruleHauteur_max EOF ;
    public final EObject entryRuleHauteur_max() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHauteur_max = null;


        try {
            // InternalMyTurtleDsl.g:642:52: (iv_ruleHauteur_max= ruleHauteur_max EOF )
            // InternalMyTurtleDsl.g:643:2: iv_ruleHauteur_max= ruleHauteur_max EOF
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
    // InternalMyTurtleDsl.g:649:1: ruleHauteur_max returns [EObject current=null] : (otherlv_0= 'def_hauteur_max' otherlv_1= '(' ( (lv_hauteur_max_2_0= ruleIntExp ) ) otherlv_3= ')' ) ;
    public final EObject ruleHauteur_max() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_hauteur_max_2_0 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:655:2: ( (otherlv_0= 'def_hauteur_max' otherlv_1= '(' ( (lv_hauteur_max_2_0= ruleIntExp ) ) otherlv_3= ')' ) )
            // InternalMyTurtleDsl.g:656:2: (otherlv_0= 'def_hauteur_max' otherlv_1= '(' ( (lv_hauteur_max_2_0= ruleIntExp ) ) otherlv_3= ')' )
            {
            // InternalMyTurtleDsl.g:656:2: (otherlv_0= 'def_hauteur_max' otherlv_1= '(' ( (lv_hauteur_max_2_0= ruleIntExp ) ) otherlv_3= ')' )
            // InternalMyTurtleDsl.g:657:3: otherlv_0= 'def_hauteur_max' otherlv_1= '(' ( (lv_hauteur_max_2_0= ruleIntExp ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getHauteur_maxAccess().getDef_hauteur_maxKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getHauteur_maxAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyTurtleDsl.g:665:3: ( (lv_hauteur_max_2_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:666:4: (lv_hauteur_max_2_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:666:4: (lv_hauteur_max_2_0= ruleIntExp )
            // InternalMyTurtleDsl.g:667:5: lv_hauteur_max_2_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getHauteur_maxAccess().getHauteur_maxIntExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
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

            otherlv_3=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getHauteur_maxAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

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
    // InternalMyTurtleDsl.g:692:1: entryRuleEloignement_max returns [EObject current=null] : iv_ruleEloignement_max= ruleEloignement_max EOF ;
    public final EObject entryRuleEloignement_max() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEloignement_max = null;


        try {
            // InternalMyTurtleDsl.g:692:56: (iv_ruleEloignement_max= ruleEloignement_max EOF )
            // InternalMyTurtleDsl.g:693:2: iv_ruleEloignement_max= ruleEloignement_max EOF
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
    // InternalMyTurtleDsl.g:699:1: ruleEloignement_max returns [EObject current=null] : (otherlv_0= 'def_eloignement_max' otherlv_1= '(' ( (lv_hauteur_max_2_0= ruleIntExp ) ) otherlv_3= ')' ) ;
    public final EObject ruleEloignement_max() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_hauteur_max_2_0 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:705:2: ( (otherlv_0= 'def_eloignement_max' otherlv_1= '(' ( (lv_hauteur_max_2_0= ruleIntExp ) ) otherlv_3= ')' ) )
            // InternalMyTurtleDsl.g:706:2: (otherlv_0= 'def_eloignement_max' otherlv_1= '(' ( (lv_hauteur_max_2_0= ruleIntExp ) ) otherlv_3= ')' )
            {
            // InternalMyTurtleDsl.g:706:2: (otherlv_0= 'def_eloignement_max' otherlv_1= '(' ( (lv_hauteur_max_2_0= ruleIntExp ) ) otherlv_3= ')' )
            // InternalMyTurtleDsl.g:707:3: otherlv_0= 'def_eloignement_max' otherlv_1= '(' ( (lv_hauteur_max_2_0= ruleIntExp ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getEloignement_maxAccess().getDef_eloignement_maxKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getEloignement_maxAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyTurtleDsl.g:715:3: ( (lv_hauteur_max_2_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:716:4: (lv_hauteur_max_2_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:716:4: (lv_hauteur_max_2_0= ruleIntExp )
            // InternalMyTurtleDsl.g:717:5: lv_hauteur_max_2_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getEloignement_maxAccess().getHauteur_maxIntExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
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

            otherlv_3=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEloignement_maxAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

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
    // InternalMyTurtleDsl.g:742:1: entryRuleDecoller returns [String current=null] : iv_ruleDecoller= ruleDecoller EOF ;
    public final String entryRuleDecoller() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecoller = null;


        try {
            // InternalMyTurtleDsl.g:742:48: (iv_ruleDecoller= ruleDecoller EOF )
            // InternalMyTurtleDsl.g:743:2: iv_ruleDecoller= ruleDecoller EOF
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
    // InternalMyTurtleDsl.g:749:1: ruleDecoller returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'decoller' kw= '(' kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleDecoller() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyTurtleDsl.g:755:2: ( (kw= 'decoller' kw= '(' kw= ')' ) )
            // InternalMyTurtleDsl.g:756:2: (kw= 'decoller' kw= '(' kw= ')' )
            {
            // InternalMyTurtleDsl.g:756:2: (kw= 'decoller' kw= '(' kw= ')' )
            // InternalMyTurtleDsl.g:757:3: kw= 'decoller' kw= '(' kw= ')'
            {
            kw=(Token)match(input,28,FOLLOW_20); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDecollerAccess().getDecollerKeyword_0());
            		
            kw=(Token)match(input,22,FOLLOW_22); 

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
    // InternalMyTurtleDsl.g:776:1: entryRuleAtterrir returns [String current=null] : iv_ruleAtterrir= ruleAtterrir EOF ;
    public final String entryRuleAtterrir() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAtterrir = null;


        try {
            // InternalMyTurtleDsl.g:776:48: (iv_ruleAtterrir= ruleAtterrir EOF )
            // InternalMyTurtleDsl.g:777:2: iv_ruleAtterrir= ruleAtterrir EOF
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
    // InternalMyTurtleDsl.g:783:1: ruleAtterrir returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'atterrir' kw= '(' kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleAtterrir() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyTurtleDsl.g:789:2: ( (kw= 'atterrir' kw= '(' kw= ')' ) )
            // InternalMyTurtleDsl.g:790:2: (kw= 'atterrir' kw= '(' kw= ')' )
            {
            // InternalMyTurtleDsl.g:790:2: (kw= 'atterrir' kw= '(' kw= ')' )
            // InternalMyTurtleDsl.g:791:3: kw= 'atterrir' kw= '(' kw= ')'
            {
            kw=(Token)match(input,29,FOLLOW_20); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAtterrirAccess().getAtterrirKeyword_0());
            		
            kw=(Token)match(input,22,FOLLOW_22); 

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
    // InternalMyTurtleDsl.g:810:1: entryRuleMonter returns [EObject current=null] : iv_ruleMonter= ruleMonter EOF ;
    public final EObject entryRuleMonter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonter = null;


        try {
            // InternalMyTurtleDsl.g:810:47: (iv_ruleMonter= ruleMonter EOF )
            // InternalMyTurtleDsl.g:811:2: iv_ruleMonter= ruleMonter EOF
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
    // InternalMyTurtleDsl.g:817:1: ruleMonter returns [EObject current=null] : (otherlv_0= 'monter' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_verticale_4_0= ruleIntExp ) ) otherlv_5= ')' ) ;
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
            // InternalMyTurtleDsl.g:823:2: ( (otherlv_0= 'monter' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_verticale_4_0= ruleIntExp ) ) otherlv_5= ')' ) )
            // InternalMyTurtleDsl.g:824:2: (otherlv_0= 'monter' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_verticale_4_0= ruleIntExp ) ) otherlv_5= ')' )
            {
            // InternalMyTurtleDsl.g:824:2: (otherlv_0= 'monter' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_verticale_4_0= ruleIntExp ) ) otherlv_5= ')' )
            // InternalMyTurtleDsl.g:825:3: otherlv_0= 'monter' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_verticale_4_0= ruleIntExp ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getMonterAccess().getMonterKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getMonterAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyTurtleDsl.g:833:3: ( (lv_duree_2_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:834:4: (lv_duree_2_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:834:4: (lv_duree_2_0= ruleIntExp )
            // InternalMyTurtleDsl.g:835:5: lv_duree_2_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getMonterAccess().getDureeIntExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
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

            otherlv_3=(Token)match(input,31,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getMonterAccess().getCommaKeyword_3());
            		
            // InternalMyTurtleDsl.g:856:3: ( (lv_vitesse_verticale_4_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:857:4: (lv_vitesse_verticale_4_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:857:4: (lv_vitesse_verticale_4_0= ruleIntExp )
            // InternalMyTurtleDsl.g:858:5: lv_vitesse_verticale_4_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getMonterAccess().getVitesse_verticaleIntExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
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
    // InternalMyTurtleDsl.g:883:1: entryRuleDescendre returns [EObject current=null] : iv_ruleDescendre= ruleDescendre EOF ;
    public final EObject entryRuleDescendre() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescendre = null;


        try {
            // InternalMyTurtleDsl.g:883:50: (iv_ruleDescendre= ruleDescendre EOF )
            // InternalMyTurtleDsl.g:884:2: iv_ruleDescendre= ruleDescendre EOF
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
    // InternalMyTurtleDsl.g:890:1: ruleDescendre returns [EObject current=null] : (otherlv_0= 'descendre' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_verticale_4_0= ruleIntExp ) ) otherlv_5= ')' ) ;
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
            // InternalMyTurtleDsl.g:896:2: ( (otherlv_0= 'descendre' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_verticale_4_0= ruleIntExp ) ) otherlv_5= ')' ) )
            // InternalMyTurtleDsl.g:897:2: (otherlv_0= 'descendre' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_verticale_4_0= ruleIntExp ) ) otherlv_5= ')' )
            {
            // InternalMyTurtleDsl.g:897:2: (otherlv_0= 'descendre' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_verticale_4_0= ruleIntExp ) ) otherlv_5= ')' )
            // InternalMyTurtleDsl.g:898:3: otherlv_0= 'descendre' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_verticale_4_0= ruleIntExp ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getDescendreAccess().getDescendreKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getDescendreAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyTurtleDsl.g:906:3: ( (lv_duree_2_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:907:4: (lv_duree_2_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:907:4: (lv_duree_2_0= ruleIntExp )
            // InternalMyTurtleDsl.g:908:5: lv_duree_2_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getDescendreAccess().getDureeIntExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
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

            otherlv_3=(Token)match(input,31,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getDescendreAccess().getCommaKeyword_3());
            		
            // InternalMyTurtleDsl.g:929:3: ( (lv_vitesse_verticale_4_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:930:4: (lv_vitesse_verticale_4_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:930:4: (lv_vitesse_verticale_4_0= ruleIntExp )
            // InternalMyTurtleDsl.g:931:5: lv_vitesse_verticale_4_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getDescendreAccess().getVitesse_verticaleIntExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
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
    // InternalMyTurtleDsl.g:956:1: entryRuleAvancer returns [EObject current=null] : iv_ruleAvancer= ruleAvancer EOF ;
    public final EObject entryRuleAvancer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvancer = null;


        try {
            // InternalMyTurtleDsl.g:956:48: (iv_ruleAvancer= ruleAvancer EOF )
            // InternalMyTurtleDsl.g:957:2: iv_ruleAvancer= ruleAvancer EOF
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
    // InternalMyTurtleDsl.g:963:1: ruleAvancer returns [EObject current=null] : (otherlv_0= 'avancer' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= ruleIntExp ) ) otherlv_5= ')' ) ;
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
            // InternalMyTurtleDsl.g:969:2: ( (otherlv_0= 'avancer' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= ruleIntExp ) ) otherlv_5= ')' ) )
            // InternalMyTurtleDsl.g:970:2: (otherlv_0= 'avancer' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= ruleIntExp ) ) otherlv_5= ')' )
            {
            // InternalMyTurtleDsl.g:970:2: (otherlv_0= 'avancer' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= ruleIntExp ) ) otherlv_5= ')' )
            // InternalMyTurtleDsl.g:971:3: otherlv_0= 'avancer' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= ruleIntExp ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getAvancerAccess().getAvancerKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getAvancerAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyTurtleDsl.g:979:3: ( (lv_duree_2_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:980:4: (lv_duree_2_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:980:4: (lv_duree_2_0= ruleIntExp )
            // InternalMyTurtleDsl.g:981:5: lv_duree_2_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getAvancerAccess().getDureeIntExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
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

            otherlv_3=(Token)match(input,31,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getAvancerAccess().getCommaKeyword_3());
            		
            // InternalMyTurtleDsl.g:1002:3: ( (lv_vitesse_deplacement_4_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:1003:4: (lv_vitesse_deplacement_4_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:1003:4: (lv_vitesse_deplacement_4_0= ruleIntExp )
            // InternalMyTurtleDsl.g:1004:5: lv_vitesse_deplacement_4_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getAvancerAccess().getVitesse_deplacementIntExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
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
    // InternalMyTurtleDsl.g:1029:1: entryRuleReculer returns [EObject current=null] : iv_ruleReculer= ruleReculer EOF ;
    public final EObject entryRuleReculer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReculer = null;


        try {
            // InternalMyTurtleDsl.g:1029:48: (iv_ruleReculer= ruleReculer EOF )
            // InternalMyTurtleDsl.g:1030:2: iv_ruleReculer= ruleReculer EOF
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
    // InternalMyTurtleDsl.g:1036:1: ruleReculer returns [EObject current=null] : (otherlv_0= 'reculer' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= ruleIntExp ) ) otherlv_5= ')' ) ;
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
            // InternalMyTurtleDsl.g:1042:2: ( (otherlv_0= 'reculer' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= ruleIntExp ) ) otherlv_5= ')' ) )
            // InternalMyTurtleDsl.g:1043:2: (otherlv_0= 'reculer' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= ruleIntExp ) ) otherlv_5= ')' )
            {
            // InternalMyTurtleDsl.g:1043:2: (otherlv_0= 'reculer' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= ruleIntExp ) ) otherlv_5= ')' )
            // InternalMyTurtleDsl.g:1044:3: otherlv_0= 'reculer' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= ruleIntExp ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getReculerAccess().getReculerKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getReculerAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyTurtleDsl.g:1052:3: ( (lv_duree_2_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:1053:4: (lv_duree_2_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:1053:4: (lv_duree_2_0= ruleIntExp )
            // InternalMyTurtleDsl.g:1054:5: lv_duree_2_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getReculerAccess().getDureeIntExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
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

            otherlv_3=(Token)match(input,31,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getReculerAccess().getCommaKeyword_3());
            		
            // InternalMyTurtleDsl.g:1075:3: ( (lv_vitesse_deplacement_4_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:1076:4: (lv_vitesse_deplacement_4_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:1076:4: (lv_vitesse_deplacement_4_0= ruleIntExp )
            // InternalMyTurtleDsl.g:1077:5: lv_vitesse_deplacement_4_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getReculerAccess().getVitesse_deplacementIntExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
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
    // InternalMyTurtleDsl.g:1102:1: entryRuleGauche returns [EObject current=null] : iv_ruleGauche= ruleGauche EOF ;
    public final EObject entryRuleGauche() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGauche = null;


        try {
            // InternalMyTurtleDsl.g:1102:47: (iv_ruleGauche= ruleGauche EOF )
            // InternalMyTurtleDsl.g:1103:2: iv_ruleGauche= ruleGauche EOF
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
    // InternalMyTurtleDsl.g:1109:1: ruleGauche returns [EObject current=null] : (otherlv_0= 'gauche' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= ruleIntExp ) ) otherlv_5= ')' ) ;
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
            // InternalMyTurtleDsl.g:1115:2: ( (otherlv_0= 'gauche' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= ruleIntExp ) ) otherlv_5= ')' ) )
            // InternalMyTurtleDsl.g:1116:2: (otherlv_0= 'gauche' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= ruleIntExp ) ) otherlv_5= ')' )
            {
            // InternalMyTurtleDsl.g:1116:2: (otherlv_0= 'gauche' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= ruleIntExp ) ) otherlv_5= ')' )
            // InternalMyTurtleDsl.g:1117:3: otherlv_0= 'gauche' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= ruleIntExp ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getGaucheAccess().getGaucheKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getGaucheAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyTurtleDsl.g:1125:3: ( (lv_duree_2_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:1126:4: (lv_duree_2_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:1126:4: (lv_duree_2_0= ruleIntExp )
            // InternalMyTurtleDsl.g:1127:5: lv_duree_2_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getGaucheAccess().getDureeIntExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
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

            otherlv_3=(Token)match(input,31,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getGaucheAccess().getCommaKeyword_3());
            		
            // InternalMyTurtleDsl.g:1148:3: ( (lv_vitesse_deplacement_4_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:1149:4: (lv_vitesse_deplacement_4_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:1149:4: (lv_vitesse_deplacement_4_0= ruleIntExp )
            // InternalMyTurtleDsl.g:1150:5: lv_vitesse_deplacement_4_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getGaucheAccess().getVitesse_deplacementIntExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
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
    // InternalMyTurtleDsl.g:1175:1: entryRuleDroite returns [EObject current=null] : iv_ruleDroite= ruleDroite EOF ;
    public final EObject entryRuleDroite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDroite = null;


        try {
            // InternalMyTurtleDsl.g:1175:47: (iv_ruleDroite= ruleDroite EOF )
            // InternalMyTurtleDsl.g:1176:2: iv_ruleDroite= ruleDroite EOF
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
    // InternalMyTurtleDsl.g:1182:1: ruleDroite returns [EObject current=null] : (otherlv_0= 'droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= ruleIntExp ) ) otherlv_5= ')' ) ;
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
            // InternalMyTurtleDsl.g:1188:2: ( (otherlv_0= 'droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= ruleIntExp ) ) otherlv_5= ')' ) )
            // InternalMyTurtleDsl.g:1189:2: (otherlv_0= 'droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= ruleIntExp ) ) otherlv_5= ')' )
            {
            // InternalMyTurtleDsl.g:1189:2: (otherlv_0= 'droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= ruleIntExp ) ) otherlv_5= ')' )
            // InternalMyTurtleDsl.g:1190:3: otherlv_0= 'droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_deplacement_4_0= ruleIntExp ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getDroiteAccess().getDroiteKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getDroiteAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyTurtleDsl.g:1198:3: ( (lv_duree_2_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:1199:4: (lv_duree_2_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:1199:4: (lv_duree_2_0= ruleIntExp )
            // InternalMyTurtleDsl.g:1200:5: lv_duree_2_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getDroiteAccess().getDureeIntExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
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

            otherlv_3=(Token)match(input,31,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getDroiteAccess().getCommaKeyword_3());
            		
            // InternalMyTurtleDsl.g:1221:3: ( (lv_vitesse_deplacement_4_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:1222:4: (lv_vitesse_deplacement_4_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:1222:4: (lv_vitesse_deplacement_4_0= ruleIntExp )
            // InternalMyTurtleDsl.g:1223:5: lv_vitesse_deplacement_4_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getDroiteAccess().getVitesse_deplacementIntExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
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
    // InternalMyTurtleDsl.g:1248:1: entryRulePause returns [EObject current=null] : iv_rulePause= rulePause EOF ;
    public final EObject entryRulePause() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePause = null;


        try {
            // InternalMyTurtleDsl.g:1248:46: (iv_rulePause= rulePause EOF )
            // InternalMyTurtleDsl.g:1249:2: iv_rulePause= rulePause EOF
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
    // InternalMyTurtleDsl.g:1255:1: rulePause returns [EObject current=null] : (otherlv_0= 'droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ')' ) ;
    public final EObject rulePause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_duree_2_0 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:1261:2: ( (otherlv_0= 'droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ')' ) )
            // InternalMyTurtleDsl.g:1262:2: (otherlv_0= 'droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ')' )
            {
            // InternalMyTurtleDsl.g:1262:2: (otherlv_0= 'droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ')' )
            // InternalMyTurtleDsl.g:1263:3: otherlv_0= 'droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getPauseAccess().getDroiteKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getPauseAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyTurtleDsl.g:1271:3: ( (lv_duree_2_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:1272:4: (lv_duree_2_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:1272:4: (lv_duree_2_0= ruleIntExp )
            // InternalMyTurtleDsl.g:1273:5: lv_duree_2_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getPauseAccess().getDureeIntExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
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
    // InternalMyTurtleDsl.g:1298:1: entryRuleRotationGauche returns [EObject current=null] : iv_ruleRotationGauche= ruleRotationGauche EOF ;
    public final EObject entryRuleRotationGauche() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotationGauche = null;


        try {
            // InternalMyTurtleDsl.g:1298:55: (iv_ruleRotationGauche= ruleRotationGauche EOF )
            // InternalMyTurtleDsl.g:1299:2: iv_ruleRotationGauche= ruleRotationGauche EOF
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
    // InternalMyTurtleDsl.g:1305:1: ruleRotationGauche returns [EObject current=null] : (otherlv_0= 'rotation_gauche' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_rotation_4_0= ruleIntExp ) ) otherlv_5= ')' ) ;
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
            // InternalMyTurtleDsl.g:1311:2: ( (otherlv_0= 'rotation_gauche' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_rotation_4_0= ruleIntExp ) ) otherlv_5= ')' ) )
            // InternalMyTurtleDsl.g:1312:2: (otherlv_0= 'rotation_gauche' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_rotation_4_0= ruleIntExp ) ) otherlv_5= ')' )
            {
            // InternalMyTurtleDsl.g:1312:2: (otherlv_0= 'rotation_gauche' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_rotation_4_0= ruleIntExp ) ) otherlv_5= ')' )
            // InternalMyTurtleDsl.g:1313:3: otherlv_0= 'rotation_gauche' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_rotation_4_0= ruleIntExp ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getRotationGaucheAccess().getRotation_gaucheKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getRotationGaucheAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyTurtleDsl.g:1321:3: ( (lv_duree_2_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:1322:4: (lv_duree_2_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:1322:4: (lv_duree_2_0= ruleIntExp )
            // InternalMyTurtleDsl.g:1323:5: lv_duree_2_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getRotationGaucheAccess().getDureeIntExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
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

            otherlv_3=(Token)match(input,31,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getRotationGaucheAccess().getCommaKeyword_3());
            		
            // InternalMyTurtleDsl.g:1344:3: ( (lv_vitesse_rotation_4_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:1345:4: (lv_vitesse_rotation_4_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:1345:4: (lv_vitesse_rotation_4_0= ruleIntExp )
            // InternalMyTurtleDsl.g:1346:5: lv_vitesse_rotation_4_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getRotationGaucheAccess().getVitesse_rotationIntExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
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
    // InternalMyTurtleDsl.g:1371:1: entryRuleRotationDroite returns [EObject current=null] : iv_ruleRotationDroite= ruleRotationDroite EOF ;
    public final EObject entryRuleRotationDroite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotationDroite = null;


        try {
            // InternalMyTurtleDsl.g:1371:55: (iv_ruleRotationDroite= ruleRotationDroite EOF )
            // InternalMyTurtleDsl.g:1372:2: iv_ruleRotationDroite= ruleRotationDroite EOF
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
    // InternalMyTurtleDsl.g:1378:1: ruleRotationDroite returns [EObject current=null] : (otherlv_0= 'rotation_droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_rotation_4_0= ruleIntExp ) ) otherlv_5= ')' ) ;
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
            // InternalMyTurtleDsl.g:1384:2: ( (otherlv_0= 'rotation_droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_rotation_4_0= ruleIntExp ) ) otherlv_5= ')' ) )
            // InternalMyTurtleDsl.g:1385:2: (otherlv_0= 'rotation_droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_rotation_4_0= ruleIntExp ) ) otherlv_5= ')' )
            {
            // InternalMyTurtleDsl.g:1385:2: (otherlv_0= 'rotation_droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_rotation_4_0= ruleIntExp ) ) otherlv_5= ')' )
            // InternalMyTurtleDsl.g:1386:3: otherlv_0= 'rotation_droite' otherlv_1= '(' ( (lv_duree_2_0= ruleIntExp ) ) otherlv_3= ',' ( (lv_vitesse_rotation_4_0= ruleIntExp ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getRotationDroiteAccess().getRotation_droiteKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getRotationDroiteAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyTurtleDsl.g:1394:3: ( (lv_duree_2_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:1395:4: (lv_duree_2_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:1395:4: (lv_duree_2_0= ruleIntExp )
            // InternalMyTurtleDsl.g:1396:5: lv_duree_2_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getRotationDroiteAccess().getDureeIntExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
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

            otherlv_3=(Token)match(input,31,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getRotationDroiteAccess().getCommaKeyword_3());
            		
            // InternalMyTurtleDsl.g:1417:3: ( (lv_vitesse_rotation_4_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:1418:4: (lv_vitesse_rotation_4_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:1418:4: (lv_vitesse_rotation_4_0= ruleIntExp )
            // InternalMyTurtleDsl.g:1419:5: lv_vitesse_rotation_4_0= ruleIntExp
            {

            					newCompositeNode(grammarAccess.getRotationDroiteAccess().getVitesse_rotationIntExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
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
    // InternalMyTurtleDsl.g:1444:1: entryRuleStart returns [String current=null] : iv_ruleStart= ruleStart EOF ;
    public final String entryRuleStart() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStart = null;


        try {
            // InternalMyTurtleDsl.g:1444:45: (iv_ruleStart= ruleStart EOF )
            // InternalMyTurtleDsl.g:1445:2: iv_ruleStart= ruleStart EOF
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
    // InternalMyTurtleDsl.g:1451:1: ruleStart returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Decoller_0= ruleDecoller ;
    public final AntlrDatatypeRuleToken ruleStart() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Decoller_0 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:1457:2: (this_Decoller_0= ruleDecoller )
            // InternalMyTurtleDsl.g:1458:2: this_Decoller_0= ruleDecoller
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
    // InternalMyTurtleDsl.g:1471:1: entryRuleEnd returns [String current=null] : iv_ruleEnd= ruleEnd EOF ;
    public final String entryRuleEnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnd = null;


        try {
            // InternalMyTurtleDsl.g:1471:43: (iv_ruleEnd= ruleEnd EOF )
            // InternalMyTurtleDsl.g:1472:2: iv_ruleEnd= ruleEnd EOF
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
    // InternalMyTurtleDsl.g:1478:1: ruleEnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Atterrir_0= ruleAtterrir ;
    public final AntlrDatatypeRuleToken ruleEnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Atterrir_0 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:1484:2: (this_Atterrir_0= ruleAtterrir )
            // InternalMyTurtleDsl.g:1485:2: this_Atterrir_0= ruleAtterrir
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
    // InternalMyTurtleDsl.g:1498:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMyTurtleDsl.g:1498:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMyTurtleDsl.g:1499:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalMyTurtleDsl.g:1505:1: ruleStatement returns [EObject current=null] : (this_Avancer_0= ruleAvancer | this_Descendre_1= ruleDescendre | this_RotationDroite_2= ruleRotationDroite | this_RotationGauche_3= ruleRotationGauche | this_Pause_4= rulePause | this_Droite_5= ruleDroite | this_Gauche_6= ruleGauche | this_Reculer_7= ruleReculer | this_Monter_8= ruleMonter ) ;
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
            // InternalMyTurtleDsl.g:1511:2: ( (this_Avancer_0= ruleAvancer | this_Descendre_1= ruleDescendre | this_RotationDroite_2= ruleRotationDroite | this_RotationGauche_3= ruleRotationGauche | this_Pause_4= rulePause | this_Droite_5= ruleDroite | this_Gauche_6= ruleGauche | this_Reculer_7= ruleReculer | this_Monter_8= ruleMonter ) )
            // InternalMyTurtleDsl.g:1512:2: (this_Avancer_0= ruleAvancer | this_Descendre_1= ruleDescendre | this_RotationDroite_2= ruleRotationDroite | this_RotationGauche_3= ruleRotationGauche | this_Pause_4= rulePause | this_Droite_5= ruleDroite | this_Gauche_6= ruleGauche | this_Reculer_7= ruleReculer | this_Monter_8= ruleMonter )
            {
            // InternalMyTurtleDsl.g:1512:2: (this_Avancer_0= ruleAvancer | this_Descendre_1= ruleDescendre | this_RotationDroite_2= ruleRotationDroite | this_RotationGauche_3= ruleRotationGauche | this_Pause_4= rulePause | this_Droite_5= ruleDroite | this_Gauche_6= ruleGauche | this_Reculer_7= ruleReculer | this_Monter_8= ruleMonter )
            int alt17=9;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalMyTurtleDsl.g:1513:3: this_Avancer_0= ruleAvancer
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
                    // InternalMyTurtleDsl.g:1522:3: this_Descendre_1= ruleDescendre
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
                    // InternalMyTurtleDsl.g:1531:3: this_RotationDroite_2= ruleRotationDroite
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
                    // InternalMyTurtleDsl.g:1540:3: this_RotationGauche_3= ruleRotationGauche
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
                    // InternalMyTurtleDsl.g:1549:3: this_Pause_4= rulePause
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
                    // InternalMyTurtleDsl.g:1558:3: this_Droite_5= ruleDroite
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
                    // InternalMyTurtleDsl.g:1567:3: this_Gauche_6= ruleGauche
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
                    // InternalMyTurtleDsl.g:1576:3: this_Reculer_7= ruleReculer
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
                    // InternalMyTurtleDsl.g:1585:3: this_Monter_8= ruleMonter
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
    // InternalMyTurtleDsl.g:1597:1: entryRuleFonctionDecl returns [EObject current=null] : iv_ruleFonctionDecl= ruleFonctionDecl EOF ;
    public final EObject entryRuleFonctionDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFonctionDecl = null;


        try {
            // InternalMyTurtleDsl.g:1597:53: (iv_ruleFonctionDecl= ruleFonctionDecl EOF )
            // InternalMyTurtleDsl.g:1598:2: iv_ruleFonctionDecl= ruleFonctionDecl EOF
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
    // InternalMyTurtleDsl.g:1604:1: ruleFonctionDecl returns [EObject current=null] : (otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleStatement ) )* otherlv_6= '\\n' otherlv_7= '}' ) ;
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
            // InternalMyTurtleDsl.g:1610:2: ( (otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleStatement ) )* otherlv_6= '\\n' otherlv_7= '}' ) )
            // InternalMyTurtleDsl.g:1611:2: (otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleStatement ) )* otherlv_6= '\\n' otherlv_7= '}' )
            {
            // InternalMyTurtleDsl.g:1611:2: (otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleStatement ) )* otherlv_6= '\\n' otherlv_7= '}' )
            // InternalMyTurtleDsl.g:1612:3: otherlv_0= 'func' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( (lv_body_5_0= ruleStatement ) )* otherlv_6= '\\n' otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getFonctionDeclAccess().getFuncKeyword_0());
            		
            // InternalMyTurtleDsl.g:1616:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyTurtleDsl.g:1617:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyTurtleDsl.g:1617:4: (lv_name_1_0= RULE_ID )
            // InternalMyTurtleDsl.g:1618:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

            otherlv_2=(Token)match(input,22,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getFonctionDeclAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getFonctionDeclAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_25); 

            			newLeafNode(otherlv_4, grammarAccess.getFonctionDeclAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMyTurtleDsl.g:1646:3: ( (lv_body_5_0= ruleStatement ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==30||(LA18_0>=32 && LA18_0<=38)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:1647:4: (lv_body_5_0= ruleStatement )
            	    {
            	    // InternalMyTurtleDsl.g:1647:4: (lv_body_5_0= ruleStatement )
            	    // InternalMyTurtleDsl.g:1648:5: lv_body_5_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getFonctionDeclAccess().getBodyStatementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_25);
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

            otherlv_6=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_6, grammarAccess.getFonctionDeclAccess().getLineFeedKeyword_6());
            		
            otherlv_7=(Token)match(input,17,FOLLOW_2); 

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
    // InternalMyTurtleDsl.g:1677:1: entryRuleIntConstante returns [EObject current=null] : iv_ruleIntConstante= ruleIntConstante EOF ;
    public final EObject entryRuleIntConstante() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntConstante = null;


        try {
            // InternalMyTurtleDsl.g:1677:53: (iv_ruleIntConstante= ruleIntConstante EOF )
            // InternalMyTurtleDsl.g:1678:2: iv_ruleIntConstante= ruleIntConstante EOF
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
    // InternalMyTurtleDsl.g:1684:1: ruleIntConstante returns [EObject current=null] : ( (lv_val_0_0= RULE_INT ) ) ;
    public final EObject ruleIntConstante() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalMyTurtleDsl.g:1690:2: ( ( (lv_val_0_0= RULE_INT ) ) )
            // InternalMyTurtleDsl.g:1691:2: ( (lv_val_0_0= RULE_INT ) )
            {
            // InternalMyTurtleDsl.g:1691:2: ( (lv_val_0_0= RULE_INT ) )
            // InternalMyTurtleDsl.g:1692:3: (lv_val_0_0= RULE_INT )
            {
            // InternalMyTurtleDsl.g:1692:3: (lv_val_0_0= RULE_INT )
            // InternalMyTurtleDsl.g:1693:4: lv_val_0_0= RULE_INT
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
    // InternalMyTurtleDsl.g:1712:1: entryRuleIntDecl returns [EObject current=null] : iv_ruleIntDecl= ruleIntDecl EOF ;
    public final EObject entryRuleIntDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntDecl = null;


        try {
            // InternalMyTurtleDsl.g:1712:48: (iv_ruleIntDecl= ruleIntDecl EOF )
            // InternalMyTurtleDsl.g:1713:2: iv_ruleIntDecl= ruleIntDecl EOF
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
    // InternalMyTurtleDsl.g:1719:1: ruleIntDecl returns [EObject current=null] : (otherlv_0= 'Seconde' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleIntExp ) ) ) ;
    public final EObject ruleIntDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_val_3_0 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:1725:2: ( (otherlv_0= 'Seconde' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleIntExp ) ) ) )
            // InternalMyTurtleDsl.g:1726:2: (otherlv_0= 'Seconde' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleIntExp ) ) )
            {
            // InternalMyTurtleDsl.g:1726:2: (otherlv_0= 'Seconde' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleIntExp ) ) )
            // InternalMyTurtleDsl.g:1727:3: otherlv_0= 'Seconde' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleIntExp ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getIntDeclAccess().getSecondeKeyword_0());
            		
            // InternalMyTurtleDsl.g:1731:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyTurtleDsl.g:1732:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyTurtleDsl.g:1732:4: (lv_name_1_0= RULE_ID )
            // InternalMyTurtleDsl.g:1733:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_27); 

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

            otherlv_2=(Token)match(input,40,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getIntDeclAccess().getEqualsSignKeyword_2());
            		
            // InternalMyTurtleDsl.g:1753:3: ( (lv_val_3_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:1754:4: (lv_val_3_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:1754:4: (lv_val_3_0= ruleIntExp )
            // InternalMyTurtleDsl.g:1755:5: lv_val_3_0= ruleIntExp
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
    // InternalMyTurtleDsl.g:1776:1: entryRulePourcentDecl returns [EObject current=null] : iv_rulePourcentDecl= rulePourcentDecl EOF ;
    public final EObject entryRulePourcentDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePourcentDecl = null;


        try {
            // InternalMyTurtleDsl.g:1776:53: (iv_rulePourcentDecl= rulePourcentDecl EOF )
            // InternalMyTurtleDsl.g:1777:2: iv_rulePourcentDecl= rulePourcentDecl EOF
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
    // InternalMyTurtleDsl.g:1783:1: rulePourcentDecl returns [EObject current=null] : (otherlv_0= 'Pourcent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleIntExp ) ) ) ;
    public final EObject rulePourcentDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_val_3_0 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:1789:2: ( (otherlv_0= 'Pourcent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleIntExp ) ) ) )
            // InternalMyTurtleDsl.g:1790:2: (otherlv_0= 'Pourcent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleIntExp ) ) )
            {
            // InternalMyTurtleDsl.g:1790:2: (otherlv_0= 'Pourcent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleIntExp ) ) )
            // InternalMyTurtleDsl.g:1791:3: otherlv_0= 'Pourcent' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_val_3_0= ruleIntExp ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getPourcentDeclAccess().getPourcentKeyword_0());
            		
            // InternalMyTurtleDsl.g:1795:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyTurtleDsl.g:1796:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyTurtleDsl.g:1796:4: (lv_name_1_0= RULE_ID )
            // InternalMyTurtleDsl.g:1797:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_27); 

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

            otherlv_2=(Token)match(input,40,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getPourcentDeclAccess().getEqualsSignKeyword_2());
            		
            // InternalMyTurtleDsl.g:1817:3: ( (lv_val_3_0= ruleIntExp ) )
            // InternalMyTurtleDsl.g:1818:4: (lv_val_3_0= ruleIntExp )
            {
            // InternalMyTurtleDsl.g:1818:4: (lv_val_3_0= ruleIntExp )
            // InternalMyTurtleDsl.g:1819:5: lv_val_3_0= ruleIntExp
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
    // InternalMyTurtleDsl.g:1840:1: entryRuleRefIntVar returns [EObject current=null] : iv_ruleRefIntVar= ruleRefIntVar EOF ;
    public final EObject entryRuleRefIntVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefIntVar = null;


        try {
            // InternalMyTurtleDsl.g:1840:50: (iv_ruleRefIntVar= ruleRefIntVar EOF )
            // InternalMyTurtleDsl.g:1841:2: iv_ruleRefIntVar= ruleRefIntVar EOF
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
    // InternalMyTurtleDsl.g:1847:1: ruleRefIntVar returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleRefIntVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMyTurtleDsl.g:1853:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMyTurtleDsl.g:1854:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMyTurtleDsl.g:1854:2: ( (otherlv_0= RULE_ID ) )
            // InternalMyTurtleDsl.g:1855:3: (otherlv_0= RULE_ID )
            {
            // InternalMyTurtleDsl.g:1855:3: (otherlv_0= RULE_ID )
            // InternalMyTurtleDsl.g:1856:4: otherlv_0= RULE_ID
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
    // InternalMyTurtleDsl.g:1870:1: entryRuleIntExp returns [EObject current=null] : iv_ruleIntExp= ruleIntExp EOF ;
    public final EObject entryRuleIntExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntExp = null;


        try {
            // InternalMyTurtleDsl.g:1870:47: (iv_ruleIntExp= ruleIntExp EOF )
            // InternalMyTurtleDsl.g:1871:2: iv_ruleIntExp= ruleIntExp EOF
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
    // InternalMyTurtleDsl.g:1877:1: ruleIntExp returns [EObject current=null] : (this_IntConstante_0= ruleIntConstante | this_RefIntVar_1= ruleRefIntVar ) ;
    public final EObject ruleIntExp() throws RecognitionException {
        EObject current = null;

        EObject this_IntConstante_0 = null;

        EObject this_RefIntVar_1 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:1883:2: ( (this_IntConstante_0= ruleIntConstante | this_RefIntVar_1= ruleRefIntVar ) )
            // InternalMyTurtleDsl.g:1884:2: (this_IntConstante_0= ruleIntConstante | this_RefIntVar_1= ruleRefIntVar )
            {
            // InternalMyTurtleDsl.g:1884:2: (this_IntConstante_0= ruleIntConstante | this_RefIntVar_1= ruleRefIntVar )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT) ) {
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
                    // InternalMyTurtleDsl.g:1885:3: this_IntConstante_0= ruleIntConstante
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
                    // InternalMyTurtleDsl.g:1894:3: this_RefIntVar_1= ruleRefIntVar
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
    // InternalMyTurtleDsl.g:1906:1: entryRuleFonctionCall returns [EObject current=null] : iv_ruleFonctionCall= ruleFonctionCall EOF ;
    public final EObject entryRuleFonctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFonctionCall = null;


        try {
            // InternalMyTurtleDsl.g:1906:53: (iv_ruleFonctionCall= ruleFonctionCall EOF )
            // InternalMyTurtleDsl.g:1907:2: iv_ruleFonctionCall= ruleFonctionCall EOF
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
    // InternalMyTurtleDsl.g:1913:1: ruleFonctionCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' ) ;
    public final EObject ruleFonctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyTurtleDsl.g:1919:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' ) )
            // InternalMyTurtleDsl.g:1920:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' )
            {
            // InternalMyTurtleDsl.g:1920:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')' )
            // InternalMyTurtleDsl.g:1921:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' otherlv_2= ')'
            {
            // InternalMyTurtleDsl.g:1921:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyTurtleDsl.g:1922:4: (otherlv_0= RULE_ID )
            {
            // InternalMyTurtleDsl.g:1922:4: (otherlv_0= RULE_ID )
            // InternalMyTurtleDsl.g:1923:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFonctionCallRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_0, grammarAccess.getFonctionCallAccess().getFuncFonctionDeclCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_22); 

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


    // $ANTLR start "entryRuleMD"
    // InternalMyTurtleDsl.g:1946:1: entryRuleMD returns [EObject current=null] : iv_ruleMD= ruleMD EOF ;
    public final EObject entryRuleMD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMD = null;


        try {
            // InternalMyTurtleDsl.g:1946:43: (iv_ruleMD= ruleMD EOF )
            // InternalMyTurtleDsl.g:1947:2: iv_ruleMD= ruleMD EOF
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
    // InternalMyTurtleDsl.g:1953:1: ruleMD returns [EObject current=null] : (this_Monter_0= ruleMonter | this_Descendre_1= ruleDescendre ) ;
    public final EObject ruleMD() throws RecognitionException {
        EObject current = null;

        EObject this_Monter_0 = null;

        EObject this_Descendre_1 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:1959:2: ( (this_Monter_0= ruleMonter | this_Descendre_1= ruleDescendre ) )
            // InternalMyTurtleDsl.g:1960:2: (this_Monter_0= ruleMonter | this_Descendre_1= ruleDescendre )
            {
            // InternalMyTurtleDsl.g:1960:2: (this_Monter_0= ruleMonter | this_Descendre_1= ruleDescendre )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            else if ( (LA20_0==32) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyTurtleDsl.g:1961:3: this_Monter_0= ruleMonter
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
                    // InternalMyTurtleDsl.g:1970:3: this_Descendre_1= ruleDescendre
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
    // InternalMyTurtleDsl.g:1982:1: entryRuleGDr returns [EObject current=null] : iv_ruleGDr= ruleGDr EOF ;
    public final EObject entryRuleGDr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGDr = null;


        try {
            // InternalMyTurtleDsl.g:1982:44: (iv_ruleGDr= ruleGDr EOF )
            // InternalMyTurtleDsl.g:1983:2: iv_ruleGDr= ruleGDr EOF
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
    // InternalMyTurtleDsl.g:1989:1: ruleGDr returns [EObject current=null] : (this_Gauche_0= ruleGauche | this_Droite_1= ruleDroite ) ;
    public final EObject ruleGDr() throws RecognitionException {
        EObject current = null;

        EObject this_Gauche_0 = null;

        EObject this_Droite_1 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:1995:2: ( (this_Gauche_0= ruleGauche | this_Droite_1= ruleDroite ) )
            // InternalMyTurtleDsl.g:1996:2: (this_Gauche_0= ruleGauche | this_Droite_1= ruleDroite )
            {
            // InternalMyTurtleDsl.g:1996:2: (this_Gauche_0= ruleGauche | this_Droite_1= ruleDroite )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            else if ( (LA21_0==36) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyTurtleDsl.g:1997:3: this_Gauche_0= ruleGauche
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
                    // InternalMyTurtleDsl.g:2006:3: this_Droite_1= ruleDroite
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
    // InternalMyTurtleDsl.g:2018:1: entryRuleRGRD returns [EObject current=null] : iv_ruleRGRD= ruleRGRD EOF ;
    public final EObject entryRuleRGRD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRGRD = null;


        try {
            // InternalMyTurtleDsl.g:2018:45: (iv_ruleRGRD= ruleRGRD EOF )
            // InternalMyTurtleDsl.g:2019:2: iv_ruleRGRD= ruleRGRD EOF
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
    // InternalMyTurtleDsl.g:2025:1: ruleRGRD returns [EObject current=null] : (this_RotationGauche_0= ruleRotationGauche | this_RotationDroite_1= ruleRotationDroite ) ;
    public final EObject ruleRGRD() throws RecognitionException {
        EObject current = null;

        EObject this_RotationGauche_0 = null;

        EObject this_RotationDroite_1 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:2031:2: ( (this_RotationGauche_0= ruleRotationGauche | this_RotationDroite_1= ruleRotationDroite ) )
            // InternalMyTurtleDsl.g:2032:2: (this_RotationGauche_0= ruleRotationGauche | this_RotationDroite_1= ruleRotationDroite )
            {
            // InternalMyTurtleDsl.g:2032:2: (this_RotationGauche_0= ruleRotationGauche | this_RotationDroite_1= ruleRotationDroite )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==37) ) {
                alt22=1;
            }
            else if ( (LA22_0==38) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyTurtleDsl.g:2033:3: this_RotationGauche_0= ruleRotationGauche
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
                    // InternalMyTurtleDsl.g:2042:3: this_RotationDroite_1= ruleRotationDroite
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
    // InternalMyTurtleDsl.g:2054:1: entryRuleAR returns [EObject current=null] : iv_ruleAR= ruleAR EOF ;
    public final EObject entryRuleAR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAR = null;


        try {
            // InternalMyTurtleDsl.g:2054:43: (iv_ruleAR= ruleAR EOF )
            // InternalMyTurtleDsl.g:2055:2: iv_ruleAR= ruleAR EOF
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
    // InternalMyTurtleDsl.g:2061:1: ruleAR returns [EObject current=null] : (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer ) ;
    public final EObject ruleAR() throws RecognitionException {
        EObject current = null;

        EObject this_Avancer_0 = null;

        EObject this_Reculer_1 = null;



        	enterRule();

        try {
            // InternalMyTurtleDsl.g:2067:2: ( (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer ) )
            // InternalMyTurtleDsl.g:2068:2: (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer )
            {
            // InternalMyTurtleDsl.g:2068:2: (this_Avancer_0= ruleAvancer | this_Reculer_1= ruleReculer )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==33) ) {
                alt23=1;
            }
            else if ( (LA23_0==34) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyTurtleDsl.g:2069:3: this_Avancer_0= ruleAvancer
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
                    // InternalMyTurtleDsl.g:2078:3: this_Reculer_1= ruleReculer
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
    // InternalMyTurtleDsl.g:2090:1: entryRuleParallele2 returns [EObject current=null] : iv_ruleParallele2= ruleParallele2 EOF ;
    public final EObject entryRuleParallele2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallele2 = null;


        try {
            // InternalMyTurtleDsl.g:2090:51: (iv_ruleParallele2= ruleParallele2 EOF )
            // InternalMyTurtleDsl.g:2091:2: iv_ruleParallele2= ruleParallele2 EOF
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
    // InternalMyTurtleDsl.g:2097:1: ruleParallele2 returns [EObject current=null] : ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) ) ;
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
            // InternalMyTurtleDsl.g:2103:2: ( ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) ) )
            // InternalMyTurtleDsl.g:2104:2: ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) )
            {
            // InternalMyTurtleDsl.g:2104:2: ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) )
            int alt24=12;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // InternalMyTurtleDsl.g:2105:3: ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) )
                    {
                    // InternalMyTurtleDsl.g:2105:3: ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) )
                    // InternalMyTurtleDsl.g:2106:4: ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) )
                    {
                    // InternalMyTurtleDsl.g:2106:4: ( (lv_a_0_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:2107:5: (lv_a_0_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:2107:5: (lv_a_0_0= ruleMD )
                    // InternalMyTurtleDsl.g:2108:6: lv_a_0_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getAMDParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_1=(Token)match(input,42,FOLLOW_29); 

                    				newLeafNode(otherlv_1, grammarAccess.getParallele2Access().getAmpersandKeyword_0_1());
                    			
                    // InternalMyTurtleDsl.g:2129:4: ( (lv_t_2_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:2130:5: (lv_t_2_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:2130:5: (lv_t_2_0= ruleGDr )
                    // InternalMyTurtleDsl.g:2131:6: lv_t_2_0= ruleGDr
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
                    // InternalMyTurtleDsl.g:2150:3: ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) )
                    {
                    // InternalMyTurtleDsl.g:2150:3: ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) )
                    // InternalMyTurtleDsl.g:2151:4: ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) )
                    {
                    // InternalMyTurtleDsl.g:2151:4: ( (lv_a_3_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:2152:5: (lv_a_3_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:2152:5: (lv_a_3_0= ruleMD )
                    // InternalMyTurtleDsl.g:2153:6: lv_a_3_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getAMDParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_4=(Token)match(input,42,FOLLOW_30); 

                    				newLeafNode(otherlv_4, grammarAccess.getParallele2Access().getAmpersandKeyword_1_1());
                    			
                    // InternalMyTurtleDsl.g:2174:4: ( (lv_t_5_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:2175:5: (lv_t_5_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:2175:5: (lv_t_5_0= ruleAR )
                    // InternalMyTurtleDsl.g:2176:6: lv_t_5_0= ruleAR
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
                    // InternalMyTurtleDsl.g:2195:3: ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) )
                    {
                    // InternalMyTurtleDsl.g:2195:3: ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) )
                    // InternalMyTurtleDsl.g:2196:4: ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) )
                    {
                    // InternalMyTurtleDsl.g:2196:4: ( (lv_a_6_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:2197:5: (lv_a_6_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:2197:5: (lv_a_6_0= ruleMD )
                    // InternalMyTurtleDsl.g:2198:6: lv_a_6_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getAMDParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_7=(Token)match(input,42,FOLLOW_31); 

                    				newLeafNode(otherlv_7, grammarAccess.getParallele2Access().getAmpersandKeyword_2_1());
                    			
                    // InternalMyTurtleDsl.g:2219:4: ( (lv_t_8_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:2220:5: (lv_t_8_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:2220:5: (lv_t_8_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:2221:6: lv_t_8_0= ruleRGRD
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
                    // InternalMyTurtleDsl.g:2240:3: ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) )
                    {
                    // InternalMyTurtleDsl.g:2240:3: ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) )
                    // InternalMyTurtleDsl.g:2241:4: ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) )
                    {
                    // InternalMyTurtleDsl.g:2241:4: ( (lv_t_9_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:2242:5: (lv_t_9_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:2242:5: (lv_t_9_0= ruleGDr )
                    // InternalMyTurtleDsl.g:2243:6: lv_t_9_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTGDrParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_10=(Token)match(input,42,FOLLOW_30); 

                    				newLeafNode(otherlv_10, grammarAccess.getParallele2Access().getAmpersandKeyword_3_1());
                    			
                    // InternalMyTurtleDsl.g:2264:4: ( (lv_b_11_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:2265:5: (lv_b_11_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:2265:5: (lv_b_11_0= ruleAR )
                    // InternalMyTurtleDsl.g:2266:6: lv_b_11_0= ruleAR
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
                    // InternalMyTurtleDsl.g:2285:3: ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) )
                    {
                    // InternalMyTurtleDsl.g:2285:3: ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) )
                    // InternalMyTurtleDsl.g:2286:4: ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) )
                    {
                    // InternalMyTurtleDsl.g:2286:4: ( (lv_t_12_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:2287:5: (lv_t_12_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:2287:5: (lv_t_12_0= ruleGDr )
                    // InternalMyTurtleDsl.g:2288:6: lv_t_12_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTGDrParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_13=(Token)match(input,42,FOLLOW_32); 

                    				newLeafNode(otherlv_13, grammarAccess.getParallele2Access().getAmpersandKeyword_4_1());
                    			
                    // InternalMyTurtleDsl.g:2309:4: ( (lv_b_14_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:2310:5: (lv_b_14_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:2310:5: (lv_b_14_0= ruleMD )
                    // InternalMyTurtleDsl.g:2311:6: lv_b_14_0= ruleMD
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
                    // InternalMyTurtleDsl.g:2330:3: ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) )
                    {
                    // InternalMyTurtleDsl.g:2330:3: ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) )
                    // InternalMyTurtleDsl.g:2331:4: ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) )
                    {
                    // InternalMyTurtleDsl.g:2331:4: ( (lv_t_15_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:2332:5: (lv_t_15_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:2332:5: (lv_t_15_0= ruleGDr )
                    // InternalMyTurtleDsl.g:2333:6: lv_t_15_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTGDrParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_16=(Token)match(input,42,FOLLOW_31); 

                    				newLeafNode(otherlv_16, grammarAccess.getParallele2Access().getAmpersandKeyword_5_1());
                    			
                    // InternalMyTurtleDsl.g:2354:4: ( (lv_b_17_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:2355:5: (lv_b_17_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:2355:5: (lv_b_17_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:2356:6: lv_b_17_0= ruleRGRD
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
                    // InternalMyTurtleDsl.g:2375:3: ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) )
                    {
                    // InternalMyTurtleDsl.g:2375:3: ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) )
                    // InternalMyTurtleDsl.g:2376:4: ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) )
                    {
                    // InternalMyTurtleDsl.g:2376:4: ( (lv_t_18_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:2377:5: (lv_t_18_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:2377:5: (lv_t_18_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:2378:6: lv_t_18_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTRGRDParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_19=(Token)match(input,42,FOLLOW_32); 

                    				newLeafNode(otherlv_19, grammarAccess.getParallele2Access().getAmpersandKeyword_6_1());
                    			
                    // InternalMyTurtleDsl.g:2399:4: ( (lv_a_20_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:2400:5: (lv_a_20_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:2400:5: (lv_a_20_0= ruleMD )
                    // InternalMyTurtleDsl.g:2401:6: lv_a_20_0= ruleMD
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
                    // InternalMyTurtleDsl.g:2420:3: ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) )
                    {
                    // InternalMyTurtleDsl.g:2420:3: ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) )
                    // InternalMyTurtleDsl.g:2421:4: ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) )
                    {
                    // InternalMyTurtleDsl.g:2421:4: ( (lv_t_21_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:2422:5: (lv_t_21_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:2422:5: (lv_t_21_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:2423:6: lv_t_21_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTRGRDParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_22=(Token)match(input,42,FOLLOW_30); 

                    				newLeafNode(otherlv_22, grammarAccess.getParallele2Access().getAmpersandKeyword_7_1());
                    			
                    // InternalMyTurtleDsl.g:2444:4: ( (lv_a_23_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:2445:5: (lv_a_23_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:2445:5: (lv_a_23_0= ruleAR )
                    // InternalMyTurtleDsl.g:2446:6: lv_a_23_0= ruleAR
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
                    // InternalMyTurtleDsl.g:2465:3: ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) )
                    {
                    // InternalMyTurtleDsl.g:2465:3: ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) )
                    // InternalMyTurtleDsl.g:2466:4: ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) )
                    {
                    // InternalMyTurtleDsl.g:2466:4: ( (lv_t_24_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:2467:5: (lv_t_24_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:2467:5: (lv_t_24_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:2468:6: lv_t_24_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTRGRDParserRuleCall_8_0_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_25=(Token)match(input,42,FOLLOW_29); 

                    				newLeafNode(otherlv_25, grammarAccess.getParallele2Access().getAmpersandKeyword_8_1());
                    			
                    // InternalMyTurtleDsl.g:2489:4: ( (lv_a_26_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:2490:5: (lv_a_26_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:2490:5: (lv_a_26_0= ruleGDr )
                    // InternalMyTurtleDsl.g:2491:6: lv_a_26_0= ruleGDr
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
                    // InternalMyTurtleDsl.g:2510:3: ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) )
                    {
                    // InternalMyTurtleDsl.g:2510:3: ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) )
                    // InternalMyTurtleDsl.g:2511:4: ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) )
                    {
                    // InternalMyTurtleDsl.g:2511:4: ( (lv_t_27_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:2512:5: (lv_t_27_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:2512:5: (lv_t_27_0= ruleAR )
                    // InternalMyTurtleDsl.g:2513:6: lv_t_27_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTARParserRuleCall_9_0_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_28=(Token)match(input,42,FOLLOW_32); 

                    				newLeafNode(otherlv_28, grammarAccess.getParallele2Access().getAmpersandKeyword_9_1());
                    			
                    // InternalMyTurtleDsl.g:2534:4: ( (lv_a_29_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:2535:5: (lv_a_29_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:2535:5: (lv_a_29_0= ruleMD )
                    // InternalMyTurtleDsl.g:2536:6: lv_a_29_0= ruleMD
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
                    // InternalMyTurtleDsl.g:2555:3: ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) )
                    {
                    // InternalMyTurtleDsl.g:2555:3: ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) )
                    // InternalMyTurtleDsl.g:2556:4: ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) )
                    {
                    // InternalMyTurtleDsl.g:2556:4: ( (lv_t_30_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:2557:5: (lv_t_30_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:2557:5: (lv_t_30_0= ruleAR )
                    // InternalMyTurtleDsl.g:2558:6: lv_t_30_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTARParserRuleCall_10_0_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_31=(Token)match(input,42,FOLLOW_31); 

                    				newLeafNode(otherlv_31, grammarAccess.getParallele2Access().getAmpersandKeyword_10_1());
                    			
                    // InternalMyTurtleDsl.g:2579:4: ( (lv_a_32_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:2580:5: (lv_a_32_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:2580:5: (lv_a_32_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:2581:6: lv_a_32_0= ruleRGRD
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
                    // InternalMyTurtleDsl.g:2600:3: ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) )
                    {
                    // InternalMyTurtleDsl.g:2600:3: ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) )
                    // InternalMyTurtleDsl.g:2601:4: ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) )
                    {
                    // InternalMyTurtleDsl.g:2601:4: ( (lv_t_33_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:2602:5: (lv_t_33_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:2602:5: (lv_t_33_0= ruleAR )
                    // InternalMyTurtleDsl.g:2603:6: lv_t_33_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele2Access().getTARParserRuleCall_11_0_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_34=(Token)match(input,42,FOLLOW_29); 

                    				newLeafNode(otherlv_34, grammarAccess.getParallele2Access().getAmpersandKeyword_11_1());
                    			
                    // InternalMyTurtleDsl.g:2624:4: ( (lv_a_35_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:2625:5: (lv_a_35_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:2625:5: (lv_a_35_0= ruleGDr )
                    // InternalMyTurtleDsl.g:2626:6: lv_a_35_0= ruleGDr
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
    // InternalMyTurtleDsl.g:2648:1: entryRuleParallele3 returns [EObject current=null] : iv_ruleParallele3= ruleParallele3 EOF ;
    public final EObject entryRuleParallele3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallele3 = null;


        try {
            // InternalMyTurtleDsl.g:2648:51: (iv_ruleParallele3= ruleParallele3 EOF )
            // InternalMyTurtleDsl.g:2649:2: iv_ruleParallele3= ruleParallele3 EOF
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
    // InternalMyTurtleDsl.g:2655:1: ruleParallele3 returns [EObject current=null] : ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) ) ;
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
            // InternalMyTurtleDsl.g:2661:2: ( ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) ) )
            // InternalMyTurtleDsl.g:2662:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) )
            {
            // InternalMyTurtleDsl.g:2662:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) )
            int alt25=24;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // InternalMyTurtleDsl.g:2663:3: ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) )
                    {
                    // InternalMyTurtleDsl.g:2663:3: ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) )
                    // InternalMyTurtleDsl.g:2664:4: ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) )
                    {
                    // InternalMyTurtleDsl.g:2664:4: ( (lv_a_0_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:2665:5: (lv_a_0_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:2665:5: (lv_a_0_0= ruleAR )
                    // InternalMyTurtleDsl.g:2666:6: lv_a_0_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAARParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_1=(Token)match(input,42,FOLLOW_29); 

                    				newLeafNode(otherlv_1, grammarAccess.getParallele3Access().getAmpersandKeyword_0_1());
                    			
                    // InternalMyTurtleDsl.g:2687:4: ( (lv_b_2_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:2688:5: (lv_b_2_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:2688:5: (lv_b_2_0= ruleGDr )
                    // InternalMyTurtleDsl.g:2689:6: lv_b_2_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBGDrParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_3=(Token)match(input,42,FOLLOW_32); 

                    				newLeafNode(otherlv_3, grammarAccess.getParallele3Access().getAmpersandKeyword_0_3());
                    			
                    // InternalMyTurtleDsl.g:2710:4: ( (lv_c_4_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:2711:5: (lv_c_4_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:2711:5: (lv_c_4_0= ruleMD )
                    // InternalMyTurtleDsl.g:2712:6: lv_c_4_0= ruleMD
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
                    // InternalMyTurtleDsl.g:2731:3: ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) )
                    {
                    // InternalMyTurtleDsl.g:2731:3: ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) )
                    // InternalMyTurtleDsl.g:2732:4: ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) )
                    {
                    // InternalMyTurtleDsl.g:2732:4: ( (lv_a_5_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:2733:5: (lv_a_5_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:2733:5: (lv_a_5_0= ruleAR )
                    // InternalMyTurtleDsl.g:2734:6: lv_a_5_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAARParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_6=(Token)match(input,42,FOLLOW_29); 

                    				newLeafNode(otherlv_6, grammarAccess.getParallele3Access().getAmpersandKeyword_1_1());
                    			
                    // InternalMyTurtleDsl.g:2755:4: ( (lv_b_7_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:2756:5: (lv_b_7_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:2756:5: (lv_b_7_0= ruleGDr )
                    // InternalMyTurtleDsl.g:2757:6: lv_b_7_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBGDrParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_8=(Token)match(input,42,FOLLOW_31); 

                    				newLeafNode(otherlv_8, grammarAccess.getParallele3Access().getAmpersandKeyword_1_3());
                    			
                    // InternalMyTurtleDsl.g:2778:4: ( (lv_c_9_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:2779:5: (lv_c_9_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:2779:5: (lv_c_9_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:2780:6: lv_c_9_0= ruleRGRD
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
                    // InternalMyTurtleDsl.g:2799:3: ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) )
                    {
                    // InternalMyTurtleDsl.g:2799:3: ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) )
                    // InternalMyTurtleDsl.g:2800:4: ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) )
                    {
                    // InternalMyTurtleDsl.g:2800:4: ( (lv_a_10_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:2801:5: (lv_a_10_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:2801:5: (lv_a_10_0= ruleAR )
                    // InternalMyTurtleDsl.g:2802:6: lv_a_10_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAARParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_11=(Token)match(input,42,FOLLOW_32); 

                    				newLeafNode(otherlv_11, grammarAccess.getParallele3Access().getAmpersandKeyword_2_1());
                    			
                    // InternalMyTurtleDsl.g:2823:4: ( (lv_b_12_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:2824:5: (lv_b_12_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:2824:5: (lv_b_12_0= ruleMD )
                    // InternalMyTurtleDsl.g:2825:6: lv_b_12_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBMDParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_13=(Token)match(input,42,FOLLOW_29); 

                    				newLeafNode(otherlv_13, grammarAccess.getParallele3Access().getAmpersandKeyword_2_3());
                    			
                    // InternalMyTurtleDsl.g:2846:4: ( (lv_c_14_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:2847:5: (lv_c_14_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:2847:5: (lv_c_14_0= ruleGDr )
                    // InternalMyTurtleDsl.g:2848:6: lv_c_14_0= ruleGDr
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
                    // InternalMyTurtleDsl.g:2867:3: ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) )
                    {
                    // InternalMyTurtleDsl.g:2867:3: ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) )
                    // InternalMyTurtleDsl.g:2868:4: ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) )
                    {
                    // InternalMyTurtleDsl.g:2868:4: ( (lv_a_15_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:2869:5: (lv_a_15_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:2869:5: (lv_a_15_0= ruleAR )
                    // InternalMyTurtleDsl.g:2870:6: lv_a_15_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAARParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_16=(Token)match(input,42,FOLLOW_32); 

                    				newLeafNode(otherlv_16, grammarAccess.getParallele3Access().getAmpersandKeyword_3_1());
                    			
                    // InternalMyTurtleDsl.g:2891:4: ( (lv_b_17_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:2892:5: (lv_b_17_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:2892:5: (lv_b_17_0= ruleMD )
                    // InternalMyTurtleDsl.g:2893:6: lv_b_17_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBMDParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_18=(Token)match(input,42,FOLLOW_31); 

                    				newLeafNode(otherlv_18, grammarAccess.getParallele3Access().getAmpersandKeyword_3_3());
                    			
                    // InternalMyTurtleDsl.g:2914:4: ( (lv_c_19_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:2915:5: (lv_c_19_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:2915:5: (lv_c_19_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:2916:6: lv_c_19_0= ruleRGRD
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
                    // InternalMyTurtleDsl.g:2935:3: ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) )
                    {
                    // InternalMyTurtleDsl.g:2935:3: ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) )
                    // InternalMyTurtleDsl.g:2936:4: ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) )
                    {
                    // InternalMyTurtleDsl.g:2936:4: ( (lv_a_20_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:2937:5: (lv_a_20_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:2937:5: (lv_a_20_0= ruleAR )
                    // InternalMyTurtleDsl.g:2938:6: lv_a_20_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAARParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_21=(Token)match(input,42,FOLLOW_31); 

                    				newLeafNode(otherlv_21, grammarAccess.getParallele3Access().getAmpersandKeyword_4_1());
                    			
                    // InternalMyTurtleDsl.g:2959:4: ( (lv_b_22_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:2960:5: (lv_b_22_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:2960:5: (lv_b_22_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:2961:6: lv_b_22_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_23=(Token)match(input,42,FOLLOW_32); 

                    				newLeafNode(otherlv_23, grammarAccess.getParallele3Access().getAmpersandKeyword_4_3());
                    			
                    // InternalMyTurtleDsl.g:2982:4: ( (lv_c_24_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:2983:5: (lv_c_24_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:2983:5: (lv_c_24_0= ruleMD )
                    // InternalMyTurtleDsl.g:2984:6: lv_c_24_0= ruleMD
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
                    // InternalMyTurtleDsl.g:3003:3: ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) )
                    {
                    // InternalMyTurtleDsl.g:3003:3: ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) )
                    // InternalMyTurtleDsl.g:3004:4: ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) )
                    {
                    // InternalMyTurtleDsl.g:3004:4: ( (lv_a_25_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:3005:5: (lv_a_25_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:3005:5: (lv_a_25_0= ruleAR )
                    // InternalMyTurtleDsl.g:3006:6: lv_a_25_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAARParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_26=(Token)match(input,42,FOLLOW_31); 

                    				newLeafNode(otherlv_26, grammarAccess.getParallele3Access().getAmpersandKeyword_5_1());
                    			
                    // InternalMyTurtleDsl.g:3027:4: ( (lv_b_27_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:3028:5: (lv_b_27_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:3028:5: (lv_b_27_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:3029:6: lv_b_27_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_28=(Token)match(input,42,FOLLOW_29); 

                    				newLeafNode(otherlv_28, grammarAccess.getParallele3Access().getAmpersandKeyword_5_3());
                    			
                    // InternalMyTurtleDsl.g:3050:4: ( (lv_c_29_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:3051:5: (lv_c_29_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:3051:5: (lv_c_29_0= ruleGDr )
                    // InternalMyTurtleDsl.g:3052:6: lv_c_29_0= ruleGDr
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
                    // InternalMyTurtleDsl.g:3071:3: ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) )
                    {
                    // InternalMyTurtleDsl.g:3071:3: ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) )
                    // InternalMyTurtleDsl.g:3072:4: ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) )
                    {
                    // InternalMyTurtleDsl.g:3072:4: ( (lv_a_30_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:3073:5: (lv_a_30_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:3073:5: (lv_a_30_0= ruleGDr )
                    // InternalMyTurtleDsl.g:3074:6: lv_a_30_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAGDrParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_31=(Token)match(input,42,FOLLOW_30); 

                    				newLeafNode(otherlv_31, grammarAccess.getParallele3Access().getAmpersandKeyword_6_1());
                    			
                    // InternalMyTurtleDsl.g:3095:4: ( (lv_b_32_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:3096:5: (lv_b_32_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:3096:5: (lv_b_32_0= ruleAR )
                    // InternalMyTurtleDsl.g:3097:6: lv_b_32_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBARParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_33=(Token)match(input,42,FOLLOW_32); 

                    				newLeafNode(otherlv_33, grammarAccess.getParallele3Access().getAmpersandKeyword_6_3());
                    			
                    // InternalMyTurtleDsl.g:3118:4: ( (lv_c_34_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:3119:5: (lv_c_34_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:3119:5: (lv_c_34_0= ruleMD )
                    // InternalMyTurtleDsl.g:3120:6: lv_c_34_0= ruleMD
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
                    // InternalMyTurtleDsl.g:3139:3: ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) )
                    {
                    // InternalMyTurtleDsl.g:3139:3: ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) )
                    // InternalMyTurtleDsl.g:3140:4: ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) )
                    {
                    // InternalMyTurtleDsl.g:3140:4: ( (lv_a_35_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:3141:5: (lv_a_35_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:3141:5: (lv_a_35_0= ruleGDr )
                    // InternalMyTurtleDsl.g:3142:6: lv_a_35_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAGDrParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_36=(Token)match(input,42,FOLLOW_30); 

                    				newLeafNode(otherlv_36, grammarAccess.getParallele3Access().getAmpersandKeyword_7_1());
                    			
                    // InternalMyTurtleDsl.g:3163:4: ( (lv_b_37_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:3164:5: (lv_b_37_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:3164:5: (lv_b_37_0= ruleAR )
                    // InternalMyTurtleDsl.g:3165:6: lv_b_37_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBARParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_38=(Token)match(input,42,FOLLOW_31); 

                    				newLeafNode(otherlv_38, grammarAccess.getParallele3Access().getAmpersandKeyword_7_3());
                    			
                    // InternalMyTurtleDsl.g:3186:4: ( (lv_c_39_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:3187:5: (lv_c_39_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:3187:5: (lv_c_39_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:3188:6: lv_c_39_0= ruleRGRD
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
                    // InternalMyTurtleDsl.g:3207:3: ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) )
                    {
                    // InternalMyTurtleDsl.g:3207:3: ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) )
                    // InternalMyTurtleDsl.g:3208:4: ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) )
                    {
                    // InternalMyTurtleDsl.g:3208:4: ( (lv_a_40_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:3209:5: (lv_a_40_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:3209:5: (lv_a_40_0= ruleGDr )
                    // InternalMyTurtleDsl.g:3210:6: lv_a_40_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAGDrParserRuleCall_8_0_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_41=(Token)match(input,42,FOLLOW_32); 

                    				newLeafNode(otherlv_41, grammarAccess.getParallele3Access().getAmpersandKeyword_8_1());
                    			
                    // InternalMyTurtleDsl.g:3231:4: ( (lv_b_42_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:3232:5: (lv_b_42_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:3232:5: (lv_b_42_0= ruleMD )
                    // InternalMyTurtleDsl.g:3233:6: lv_b_42_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBMDParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_43=(Token)match(input,42,FOLLOW_30); 

                    				newLeafNode(otherlv_43, grammarAccess.getParallele3Access().getAmpersandKeyword_8_3());
                    			
                    // InternalMyTurtleDsl.g:3254:4: ( (lv_c_44_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:3255:5: (lv_c_44_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:3255:5: (lv_c_44_0= ruleAR )
                    // InternalMyTurtleDsl.g:3256:6: lv_c_44_0= ruleAR
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
                    // InternalMyTurtleDsl.g:3275:3: ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) )
                    {
                    // InternalMyTurtleDsl.g:3275:3: ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) )
                    // InternalMyTurtleDsl.g:3276:4: ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) )
                    {
                    // InternalMyTurtleDsl.g:3276:4: ( (lv_a_45_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:3277:5: (lv_a_45_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:3277:5: (lv_a_45_0= ruleGDr )
                    // InternalMyTurtleDsl.g:3278:6: lv_a_45_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAGDrParserRuleCall_9_0_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_46=(Token)match(input,42,FOLLOW_32); 

                    				newLeafNode(otherlv_46, grammarAccess.getParallele3Access().getAmpersandKeyword_9_1());
                    			
                    // InternalMyTurtleDsl.g:3299:4: ( (lv_b_47_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:3300:5: (lv_b_47_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:3300:5: (lv_b_47_0= ruleMD )
                    // InternalMyTurtleDsl.g:3301:6: lv_b_47_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBMDParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_48=(Token)match(input,42,FOLLOW_31); 

                    				newLeafNode(otherlv_48, grammarAccess.getParallele3Access().getAmpersandKeyword_9_3());
                    			
                    // InternalMyTurtleDsl.g:3322:4: ( (lv_c_49_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:3323:5: (lv_c_49_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:3323:5: (lv_c_49_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:3324:6: lv_c_49_0= ruleRGRD
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
                    // InternalMyTurtleDsl.g:3343:3: ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) )
                    {
                    // InternalMyTurtleDsl.g:3343:3: ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) )
                    // InternalMyTurtleDsl.g:3344:4: ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) )
                    {
                    // InternalMyTurtleDsl.g:3344:4: ( (lv_a_50_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:3345:5: (lv_a_50_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:3345:5: (lv_a_50_0= ruleGDr )
                    // InternalMyTurtleDsl.g:3346:6: lv_a_50_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAGDrParserRuleCall_10_0_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_51=(Token)match(input,42,FOLLOW_31); 

                    				newLeafNode(otherlv_51, grammarAccess.getParallele3Access().getAmpersandKeyword_10_1());
                    			
                    // InternalMyTurtleDsl.g:3367:4: ( (lv_b_52_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:3368:5: (lv_b_52_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:3368:5: (lv_b_52_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:3369:6: lv_b_52_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_53=(Token)match(input,42,FOLLOW_30); 

                    				newLeafNode(otherlv_53, grammarAccess.getParallele3Access().getAmpersandKeyword_10_3());
                    			
                    // InternalMyTurtleDsl.g:3390:4: ( (lv_c_54_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:3391:5: (lv_c_54_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:3391:5: (lv_c_54_0= ruleAR )
                    // InternalMyTurtleDsl.g:3392:6: lv_c_54_0= ruleAR
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
                    // InternalMyTurtleDsl.g:3411:3: ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) )
                    {
                    // InternalMyTurtleDsl.g:3411:3: ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) )
                    // InternalMyTurtleDsl.g:3412:4: ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) )
                    {
                    // InternalMyTurtleDsl.g:3412:4: ( (lv_a_55_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:3413:5: (lv_a_55_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:3413:5: (lv_a_55_0= ruleGDr )
                    // InternalMyTurtleDsl.g:3414:6: lv_a_55_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAGDrParserRuleCall_11_0_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_56=(Token)match(input,42,FOLLOW_31); 

                    				newLeafNode(otherlv_56, grammarAccess.getParallele3Access().getAmpersandKeyword_11_1());
                    			
                    // InternalMyTurtleDsl.g:3435:4: ( (lv_b_57_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:3436:5: (lv_b_57_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:3436:5: (lv_b_57_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:3437:6: lv_b_57_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_58=(Token)match(input,42,FOLLOW_32); 

                    				newLeafNode(otherlv_58, grammarAccess.getParallele3Access().getAmpersandKeyword_11_3());
                    			
                    // InternalMyTurtleDsl.g:3458:4: ( (lv_c_59_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:3459:5: (lv_c_59_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:3459:5: (lv_c_59_0= ruleMD )
                    // InternalMyTurtleDsl.g:3460:6: lv_c_59_0= ruleMD
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
                    // InternalMyTurtleDsl.g:3479:3: ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) )
                    {
                    // InternalMyTurtleDsl.g:3479:3: ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) )
                    // InternalMyTurtleDsl.g:3480:4: ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) )
                    {
                    // InternalMyTurtleDsl.g:3480:4: ( (lv_a_60_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:3481:5: (lv_a_60_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:3481:5: (lv_a_60_0= ruleMD )
                    // InternalMyTurtleDsl.g:3482:6: lv_a_60_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAMDParserRuleCall_12_0_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_61=(Token)match(input,42,FOLLOW_30); 

                    				newLeafNode(otherlv_61, grammarAccess.getParallele3Access().getAmpersandKeyword_12_1());
                    			
                    // InternalMyTurtleDsl.g:3503:4: ( (lv_b_62_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:3504:5: (lv_b_62_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:3504:5: (lv_b_62_0= ruleAR )
                    // InternalMyTurtleDsl.g:3505:6: lv_b_62_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBARParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_63=(Token)match(input,42,FOLLOW_29); 

                    				newLeafNode(otherlv_63, grammarAccess.getParallele3Access().getAmpersandKeyword_12_3());
                    			
                    // InternalMyTurtleDsl.g:3526:4: ( (lv_c_64_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:3527:5: (lv_c_64_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:3527:5: (lv_c_64_0= ruleGDr )
                    // InternalMyTurtleDsl.g:3528:6: lv_c_64_0= ruleGDr
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
                    // InternalMyTurtleDsl.g:3547:3: ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) )
                    {
                    // InternalMyTurtleDsl.g:3547:3: ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) )
                    // InternalMyTurtleDsl.g:3548:4: ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) )
                    {
                    // InternalMyTurtleDsl.g:3548:4: ( (lv_a_65_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:3549:5: (lv_a_65_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:3549:5: (lv_a_65_0= ruleMD )
                    // InternalMyTurtleDsl.g:3550:6: lv_a_65_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAMDParserRuleCall_13_0_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_66=(Token)match(input,42,FOLLOW_30); 

                    				newLeafNode(otherlv_66, grammarAccess.getParallele3Access().getAmpersandKeyword_13_1());
                    			
                    // InternalMyTurtleDsl.g:3571:4: ( (lv_b_67_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:3572:5: (lv_b_67_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:3572:5: (lv_b_67_0= ruleAR )
                    // InternalMyTurtleDsl.g:3573:6: lv_b_67_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBARParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_68=(Token)match(input,42,FOLLOW_31); 

                    				newLeafNode(otherlv_68, grammarAccess.getParallele3Access().getAmpersandKeyword_13_3());
                    			
                    // InternalMyTurtleDsl.g:3594:4: ( (lv_c_69_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:3595:5: (lv_c_69_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:3595:5: (lv_c_69_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:3596:6: lv_c_69_0= ruleRGRD
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
                    // InternalMyTurtleDsl.g:3615:3: ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) )
                    {
                    // InternalMyTurtleDsl.g:3615:3: ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) )
                    // InternalMyTurtleDsl.g:3616:4: ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) )
                    {
                    // InternalMyTurtleDsl.g:3616:4: ( (lv_a_70_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:3617:5: (lv_a_70_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:3617:5: (lv_a_70_0= ruleMD )
                    // InternalMyTurtleDsl.g:3618:6: lv_a_70_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAMDParserRuleCall_14_0_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_71=(Token)match(input,42,FOLLOW_29); 

                    				newLeafNode(otherlv_71, grammarAccess.getParallele3Access().getAmpersandKeyword_14_1());
                    			
                    // InternalMyTurtleDsl.g:3639:4: ( (lv_b_72_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:3640:5: (lv_b_72_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:3640:5: (lv_b_72_0= ruleGDr )
                    // InternalMyTurtleDsl.g:3641:6: lv_b_72_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBGDrParserRuleCall_14_2_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_73=(Token)match(input,42,FOLLOW_30); 

                    				newLeafNode(otherlv_73, grammarAccess.getParallele3Access().getAmpersandKeyword_14_3());
                    			
                    // InternalMyTurtleDsl.g:3662:4: ( (lv_c_74_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:3663:5: (lv_c_74_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:3663:5: (lv_c_74_0= ruleAR )
                    // InternalMyTurtleDsl.g:3664:6: lv_c_74_0= ruleAR
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
                    // InternalMyTurtleDsl.g:3683:3: ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) )
                    {
                    // InternalMyTurtleDsl.g:3683:3: ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) )
                    // InternalMyTurtleDsl.g:3684:4: ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) )
                    {
                    // InternalMyTurtleDsl.g:3684:4: ( (lv_a_75_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:3685:5: (lv_a_75_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:3685:5: (lv_a_75_0= ruleMD )
                    // InternalMyTurtleDsl.g:3686:6: lv_a_75_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAMDParserRuleCall_15_0_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_76=(Token)match(input,42,FOLLOW_29); 

                    				newLeafNode(otherlv_76, grammarAccess.getParallele3Access().getAmpersandKeyword_15_1());
                    			
                    // InternalMyTurtleDsl.g:3707:4: ( (lv_b_77_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:3708:5: (lv_b_77_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:3708:5: (lv_b_77_0= ruleGDr )
                    // InternalMyTurtleDsl.g:3709:6: lv_b_77_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBGDrParserRuleCall_15_2_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_78=(Token)match(input,42,FOLLOW_31); 

                    				newLeafNode(otherlv_78, grammarAccess.getParallele3Access().getAmpersandKeyword_15_3());
                    			
                    // InternalMyTurtleDsl.g:3730:4: ( (lv_c_79_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:3731:5: (lv_c_79_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:3731:5: (lv_c_79_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:3732:6: lv_c_79_0= ruleRGRD
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
                    // InternalMyTurtleDsl.g:3751:3: ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) )
                    {
                    // InternalMyTurtleDsl.g:3751:3: ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) )
                    // InternalMyTurtleDsl.g:3752:4: ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) )
                    {
                    // InternalMyTurtleDsl.g:3752:4: ( (lv_a_80_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:3753:5: (lv_a_80_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:3753:5: (lv_a_80_0= ruleMD )
                    // InternalMyTurtleDsl.g:3754:6: lv_a_80_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAMDParserRuleCall_16_0_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_81=(Token)match(input,42,FOLLOW_31); 

                    				newLeafNode(otherlv_81, grammarAccess.getParallele3Access().getAmpersandKeyword_16_1());
                    			
                    // InternalMyTurtleDsl.g:3775:4: ( (lv_b_82_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:3776:5: (lv_b_82_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:3776:5: (lv_b_82_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:3777:6: lv_b_82_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_16_2_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_83=(Token)match(input,42,FOLLOW_29); 

                    				newLeafNode(otherlv_83, grammarAccess.getParallele3Access().getAmpersandKeyword_16_3());
                    			
                    // InternalMyTurtleDsl.g:3798:4: ( (lv_c_84_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:3799:5: (lv_c_84_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:3799:5: (lv_c_84_0= ruleGDr )
                    // InternalMyTurtleDsl.g:3800:6: lv_c_84_0= ruleGDr
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
                    // InternalMyTurtleDsl.g:3819:3: ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) )
                    {
                    // InternalMyTurtleDsl.g:3819:3: ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) )
                    // InternalMyTurtleDsl.g:3820:4: ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) )
                    {
                    // InternalMyTurtleDsl.g:3820:4: ( (lv_a_85_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:3821:5: (lv_a_85_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:3821:5: (lv_a_85_0= ruleMD )
                    // InternalMyTurtleDsl.g:3822:6: lv_a_85_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getAMDParserRuleCall_17_0_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_86=(Token)match(input,42,FOLLOW_31); 

                    				newLeafNode(otherlv_86, grammarAccess.getParallele3Access().getAmpersandKeyword_17_1());
                    			
                    // InternalMyTurtleDsl.g:3843:4: ( (lv_b_87_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:3844:5: (lv_b_87_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:3844:5: (lv_b_87_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:3845:6: lv_b_87_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_17_2_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_88=(Token)match(input,42,FOLLOW_30); 

                    				newLeafNode(otherlv_88, grammarAccess.getParallele3Access().getAmpersandKeyword_17_3());
                    			
                    // InternalMyTurtleDsl.g:3866:4: ( (lv_c_89_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:3867:5: (lv_c_89_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:3867:5: (lv_c_89_0= ruleAR )
                    // InternalMyTurtleDsl.g:3868:6: lv_c_89_0= ruleAR
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
                    // InternalMyTurtleDsl.g:3887:3: ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) )
                    {
                    // InternalMyTurtleDsl.g:3887:3: ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) )
                    // InternalMyTurtleDsl.g:3888:4: ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) )
                    {
                    // InternalMyTurtleDsl.g:3888:4: ( (lv_a_90_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:3889:5: (lv_a_90_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:3889:5: (lv_a_90_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:3890:6: lv_a_90_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getARGRDParserRuleCall_18_0_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_91=(Token)match(input,42,FOLLOW_30); 

                    				newLeafNode(otherlv_91, grammarAccess.getParallele3Access().getAmpersandKeyword_18_1());
                    			
                    // InternalMyTurtleDsl.g:3911:4: ( (lv_b_92_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:3912:5: (lv_b_92_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:3912:5: (lv_b_92_0= ruleAR )
                    // InternalMyTurtleDsl.g:3913:6: lv_b_92_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBARParserRuleCall_18_2_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_93=(Token)match(input,42,FOLLOW_32); 

                    				newLeafNode(otherlv_93, grammarAccess.getParallele3Access().getAmpersandKeyword_18_3());
                    			
                    // InternalMyTurtleDsl.g:3934:4: ( (lv_c_94_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:3935:5: (lv_c_94_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:3935:5: (lv_c_94_0= ruleMD )
                    // InternalMyTurtleDsl.g:3936:6: lv_c_94_0= ruleMD
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
                    // InternalMyTurtleDsl.g:3955:3: ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) )
                    {
                    // InternalMyTurtleDsl.g:3955:3: ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) )
                    // InternalMyTurtleDsl.g:3956:4: ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) )
                    {
                    // InternalMyTurtleDsl.g:3956:4: ( (lv_a_95_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:3957:5: (lv_a_95_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:3957:5: (lv_a_95_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:3958:6: lv_a_95_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getARGRDParserRuleCall_19_0_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_96=(Token)match(input,42,FOLLOW_30); 

                    				newLeafNode(otherlv_96, grammarAccess.getParallele3Access().getAmpersandKeyword_19_1());
                    			
                    // InternalMyTurtleDsl.g:3979:4: ( (lv_b_97_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:3980:5: (lv_b_97_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:3980:5: (lv_b_97_0= ruleAR )
                    // InternalMyTurtleDsl.g:3981:6: lv_b_97_0= ruleAR
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBARParserRuleCall_19_2_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_98=(Token)match(input,42,FOLLOW_29); 

                    				newLeafNode(otherlv_98, grammarAccess.getParallele3Access().getAmpersandKeyword_19_3());
                    			
                    // InternalMyTurtleDsl.g:4002:4: ( (lv_c_99_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:4003:5: (lv_c_99_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:4003:5: (lv_c_99_0= ruleGDr )
                    // InternalMyTurtleDsl.g:4004:6: lv_c_99_0= ruleGDr
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
                    // InternalMyTurtleDsl.g:4023:3: ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) )
                    {
                    // InternalMyTurtleDsl.g:4023:3: ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) )
                    // InternalMyTurtleDsl.g:4024:4: ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) )
                    {
                    // InternalMyTurtleDsl.g:4024:4: ( (lv_a_100_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:4025:5: (lv_a_100_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:4025:5: (lv_a_100_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:4026:6: lv_a_100_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getARGRDParserRuleCall_20_0_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_101=(Token)match(input,42,FOLLOW_32); 

                    				newLeafNode(otherlv_101, grammarAccess.getParallele3Access().getAmpersandKeyword_20_1());
                    			
                    // InternalMyTurtleDsl.g:4047:4: ( (lv_b_102_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:4048:5: (lv_b_102_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:4048:5: (lv_b_102_0= ruleMD )
                    // InternalMyTurtleDsl.g:4049:6: lv_b_102_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBMDParserRuleCall_20_2_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_103=(Token)match(input,42,FOLLOW_30); 

                    				newLeafNode(otherlv_103, grammarAccess.getParallele3Access().getAmpersandKeyword_20_3());
                    			
                    // InternalMyTurtleDsl.g:4070:4: ( (lv_c_104_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:4071:5: (lv_c_104_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:4071:5: (lv_c_104_0= ruleAR )
                    // InternalMyTurtleDsl.g:4072:6: lv_c_104_0= ruleAR
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
                    // InternalMyTurtleDsl.g:4091:3: ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) )
                    {
                    // InternalMyTurtleDsl.g:4091:3: ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) )
                    // InternalMyTurtleDsl.g:4092:4: ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) )
                    {
                    // InternalMyTurtleDsl.g:4092:4: ( (lv_a_105_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:4093:5: (lv_a_105_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:4093:5: (lv_a_105_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:4094:6: lv_a_105_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getARGRDParserRuleCall_21_0_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_106=(Token)match(input,42,FOLLOW_32); 

                    				newLeafNode(otherlv_106, grammarAccess.getParallele3Access().getAmpersandKeyword_21_1());
                    			
                    // InternalMyTurtleDsl.g:4115:4: ( (lv_b_107_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:4116:5: (lv_b_107_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:4116:5: (lv_b_107_0= ruleMD )
                    // InternalMyTurtleDsl.g:4117:6: lv_b_107_0= ruleMD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBMDParserRuleCall_21_2_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_108=(Token)match(input,42,FOLLOW_29); 

                    				newLeafNode(otherlv_108, grammarAccess.getParallele3Access().getAmpersandKeyword_21_3());
                    			
                    // InternalMyTurtleDsl.g:4138:4: ( (lv_c_109_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:4139:5: (lv_c_109_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:4139:5: (lv_c_109_0= ruleGDr )
                    // InternalMyTurtleDsl.g:4140:6: lv_c_109_0= ruleGDr
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
                    // InternalMyTurtleDsl.g:4159:3: ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) )
                    {
                    // InternalMyTurtleDsl.g:4159:3: ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) )
                    // InternalMyTurtleDsl.g:4160:4: ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) )
                    {
                    // InternalMyTurtleDsl.g:4160:4: ( (lv_a_110_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:4161:5: (lv_a_110_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:4161:5: (lv_a_110_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:4162:6: lv_a_110_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getARGRDParserRuleCall_22_0_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_111=(Token)match(input,42,FOLLOW_29); 

                    				newLeafNode(otherlv_111, grammarAccess.getParallele3Access().getAmpersandKeyword_22_1());
                    			
                    // InternalMyTurtleDsl.g:4183:4: ( (lv_b_112_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:4184:5: (lv_b_112_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:4184:5: (lv_b_112_0= ruleGDr )
                    // InternalMyTurtleDsl.g:4185:6: lv_b_112_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBGDrParserRuleCall_22_2_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_113=(Token)match(input,42,FOLLOW_32); 

                    				newLeafNode(otherlv_113, grammarAccess.getParallele3Access().getAmpersandKeyword_22_3());
                    			
                    // InternalMyTurtleDsl.g:4206:4: ( (lv_c_114_0= ruleMD ) )
                    // InternalMyTurtleDsl.g:4207:5: (lv_c_114_0= ruleMD )
                    {
                    // InternalMyTurtleDsl.g:4207:5: (lv_c_114_0= ruleMD )
                    // InternalMyTurtleDsl.g:4208:6: lv_c_114_0= ruleMD
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
                    // InternalMyTurtleDsl.g:4227:3: ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) )
                    {
                    // InternalMyTurtleDsl.g:4227:3: ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) )
                    // InternalMyTurtleDsl.g:4228:4: ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) )
                    {
                    // InternalMyTurtleDsl.g:4228:4: ( (lv_a_115_0= ruleRGRD ) )
                    // InternalMyTurtleDsl.g:4229:5: (lv_a_115_0= ruleRGRD )
                    {
                    // InternalMyTurtleDsl.g:4229:5: (lv_a_115_0= ruleRGRD )
                    // InternalMyTurtleDsl.g:4230:6: lv_a_115_0= ruleRGRD
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getARGRDParserRuleCall_23_0_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_116=(Token)match(input,42,FOLLOW_29); 

                    				newLeafNode(otherlv_116, grammarAccess.getParallele3Access().getAmpersandKeyword_23_1());
                    			
                    // InternalMyTurtleDsl.g:4251:4: ( (lv_b_117_0= ruleGDr ) )
                    // InternalMyTurtleDsl.g:4252:5: (lv_b_117_0= ruleGDr )
                    {
                    // InternalMyTurtleDsl.g:4252:5: (lv_b_117_0= ruleGDr )
                    // InternalMyTurtleDsl.g:4253:6: lv_b_117_0= ruleGDr
                    {

                    						newCompositeNode(grammarAccess.getParallele3Access().getBGDrParserRuleCall_23_2_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    otherlv_118=(Token)match(input,42,FOLLOW_30); 

                    				newLeafNode(otherlv_118, grammarAccess.getParallele3Access().getAmpersandKeyword_23_3());
                    			
                    // InternalMyTurtleDsl.g:4274:4: ( (lv_c_119_0= ruleAR ) )
                    // InternalMyTurtleDsl.g:4275:5: (lv_c_119_0= ruleAR )
                    {
                    // InternalMyTurtleDsl.g:4275:5: (lv_c_119_0= ruleAR )
                    // InternalMyTurtleDsl.g:4276:6: lv_c_119_0= ruleAR
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


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA25 dfa25 = new DFA25(this);
    static final String dfa_1s = "\107\uffff";
    static final String dfa_2s = "\1\5\3\uffff\10\26\1\uffff\10\5\10\37\2\27\6\37\5\5\1\uffff\3\5\20\27\10\5\1\uffff";
    static final String dfa_3s = "\1\51\3\uffff\10\26\1\uffff\10\6\20\37\5\6\1\uffff\3\6\20\27\10\52\1\uffff";
    static final String dfa_4s = "\1\uffff\1\6\1\1\1\2\10\uffff\1\4\35\uffff\1\3\33\uffff\1\5";
    static final String dfa_5s = "\107\uffff}>";
    static final String[] dfa_6s = {
            "\1\14\6\uffff\1\1\20\uffff\1\1\1\13\1\uffff\1\5\1\4\1\12\1\11\1\10\1\7\1\6\1\2\1\uffff\1\3",
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
            "\1\52\7\uffff\1\51",
            "\1\52\7\uffff\1\51",
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
            "\1\52\6\uffff\1\52\20\uffff\2\52\1\uffff\10\52\1\uffff\1\52\1\106",
            "\1\52\6\uffff\1\52\20\uffff\2\52\1\uffff\10\52\1\uffff\1\52\1\106",
            "\1\52\6\uffff\1\52\20\uffff\2\52\1\uffff\10\52\1\uffff\1\52\1\106",
            "\1\52\6\uffff\1\52\20\uffff\2\52\1\uffff\10\52\1\uffff\1\52\1\106",
            "\1\52\6\uffff\1\52\20\uffff\2\52\1\uffff\10\52\1\uffff\1\52\1\106",
            "\1\52\6\uffff\1\52\20\uffff\2\52\1\uffff\10\52\1\uffff\1\52\1\106",
            "\1\52\6\uffff\1\52\20\uffff\2\52\1\uffff\10\52\1\uffff\1\52\1\106",
            "\1\52\6\uffff\1\52\20\uffff\2\52\1\uffff\10\52\1\uffff\1\52\1\106",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 266:3: ( ( (lv_SeconDec_20_0= ruleIntDecl ) ) | ( (lv_PourDec_21_0= rulePourcentDecl ) ) | ( (lv_statements_22_0= ruleStatement ) ) | ( (lv_fonctions_23_0= ruleFonctionCall ) ) | ( ( (lv_parallele_24_1= ruleParallele2 | lv_parallele_24_2= ruleParallele3 ) ) ) )*";
        }
    }
    static final String dfa_7s = "\u0107\uffff";
    static final String dfa_8s = "\1\36\10\26\10\5\20\37\10\5\20\27\10\52\1\41\3\36\30\26\30\5\60\37\30\5\60\27\30\5\2\uffff";
    static final String dfa_9s = "\1\46\10\26\10\6\20\37\10\6\20\27\10\52\2\46\1\44\1\46\30\26\30\6\60\37\30\6\60\27\30\52\2\uffff";
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
            "\1\105\1\106\1\111\1\112\1\107\1\110",
            "\1\115\1\uffff\1\116\1\117\1\120\2\uffff\1\113\1\114",
            "\1\123\1\uffff\1\124\1\121\1\122\1\125\1\126",
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
            "\1\u0106\6\uffff\1\u0106\20\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\20\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\20\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\20\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\20\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\20\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\20\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\20\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\20\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\20\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\20\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\20\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\20\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\20\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\20\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\20\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\20\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\20\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\20\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\20\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\20\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\20\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\20\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106\1\u0105",
            "\1\u0106\6\uffff\1\u0106\20\uffff\2\u0106\1\uffff\10\u0106\1\uffff\1\u0106\1\u0105",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "349:6: (lv_parallele_24_1= ruleParallele2 | lv_parallele_24_2= ruleParallele3 )";
        }
    }
    static final String dfa_13s = "\16\uffff";
    static final String dfa_14s = "\1\36\4\uffff\1\26\3\uffff\1\5\2\27\2\uffff";
    static final String dfa_15s = "\1\46\4\uffff\1\26\3\uffff\1\6\2\37\2\uffff";
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
            "\1\15\7\uffff\1\14",
            "\1\15\7\uffff\1\14",
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
            return "1512:2: (this_Avancer_0= ruleAvancer | this_Descendre_1= ruleDescendre | this_RotationDroite_2= ruleRotationDroite | this_RotationGauche_3= ruleRotationGauche | this_Pause_4= rulePause | this_Droite_5= ruleDroite | this_Gauche_6= ruleGauche | this_Reculer_7= ruleReculer | this_Monter_8= ruleMonter )";
        }
    }
    static final String dfa_19s = "\121\uffff";
    static final String dfa_20s = "\1\36\10\26\10\5\20\37\10\5\20\27\10\52\1\41\3\36\14\uffff";
    static final String dfa_21s = "\1\46\10\26\10\6\20\37\10\6\20\27\10\52\2\46\1\44\1\46\14\uffff";
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

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_19;
            this.eof = dfa_19;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "2104:2: ( ( ( (lv_a_0_0= ruleMD ) ) otherlv_1= '&' ( (lv_t_2_0= ruleGDr ) ) ) | ( ( (lv_a_3_0= ruleMD ) ) otherlv_4= '&' ( (lv_t_5_0= ruleAR ) ) ) | ( ( (lv_a_6_0= ruleMD ) ) otherlv_7= '&' ( (lv_t_8_0= ruleRGRD ) ) ) | ( ( (lv_t_9_0= ruleGDr ) ) otherlv_10= '&' ( (lv_b_11_0= ruleAR ) ) ) | ( ( (lv_t_12_0= ruleGDr ) ) otherlv_13= '&' ( (lv_b_14_0= ruleMD ) ) ) | ( ( (lv_t_15_0= ruleGDr ) ) otherlv_16= '&' ( (lv_b_17_0= ruleRGRD ) ) ) | ( ( (lv_t_18_0= ruleRGRD ) ) otherlv_19= '&' ( (lv_a_20_0= ruleMD ) ) ) | ( ( (lv_t_21_0= ruleRGRD ) ) otherlv_22= '&' ( (lv_a_23_0= ruleAR ) ) ) | ( ( (lv_t_24_0= ruleRGRD ) ) otherlv_25= '&' ( (lv_a_26_0= ruleGDr ) ) ) | ( ( (lv_t_27_0= ruleAR ) ) otherlv_28= '&' ( (lv_a_29_0= ruleMD ) ) ) | ( ( (lv_t_30_0= ruleAR ) ) otherlv_31= '&' ( (lv_a_32_0= ruleRGRD ) ) ) | ( ( (lv_t_33_0= ruleAR ) ) otherlv_34= '&' ( (lv_a_35_0= ruleGDr ) ) ) )";
        }
    }
    static final String dfa_25s = "\u0129\uffff";
    static final String dfa_26s = "\1\36\10\26\10\5\20\37\10\5\20\27\10\52\2\36\1\41\1\36\30\26\30\5\60\37\30\5\60\27\30\52\2\36\1\43\2\36\2\41\1\43\1\41\1\36\1\41\1\36\30\uffff";
    static final String dfa_27s = "\1\46\10\26\10\6\20\37\10\6\20\27\10\52\3\46\1\44\30\26\30\6\60\37\30\6\60\27\30\52\1\46\1\44\1\46\1\42\2\46\1\44\2\46\1\42\2\44\30\uffff";
    static final String dfa_28s = "\u0111\uffff\1\2\1\1\1\5\1\6\1\3\1\4\1\14\1\13\1\10\1\7\1\11\1\12\1\22\1\21\1\15\1\16\1\17\1\20\1\30\1\27\1\25\1\26\1\23\1\24";
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
            "\1\111\1\uffff\1\112\2\uffff\1\105\1\106\1\107\1\110",
            "\1\117\1\uffff\1\120\1\115\1\116\2\uffff\1\113\1\114",
            "\1\123\1\124\1\125\1\126\1\121\1\122",
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
            "\1\u0112\1\uffff\1\u0112\4\uffff\2\u0111",
            "\1\u0113\1\uffff\1\u0113\2\uffff\2\u0114",
            "\2\u0115\2\u0116",
            "\1\u0117\1\uffff\1\u0117\2\u0118",
            "\1\u011a\1\uffff\1\u011a\4\uffff\2\u0119",
            "\2\u011b\2\uffff\2\u011c",
            "\2\u011d\2\u011e",
            "\2\u011f\2\u0120",
            "\2\u0121\2\uffff\2\u0122",
            "\1\u0124\1\uffff\1\u0124\2\u0123",
            "\2\u0125\2\u0126",
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

    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[][] dfa_30 = unpackEncodedStringArray(dfa_30s);

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_25;
            this.eof = dfa_25;
            this.min = dfa_26;
            this.max = dfa_27;
            this.accept = dfa_28;
            this.special = dfa_29;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "2662:2: ( ( ( (lv_a_0_0= ruleAR ) ) otherlv_1= '&' ( (lv_b_2_0= ruleGDr ) ) otherlv_3= '&' ( (lv_c_4_0= ruleMD ) ) ) | ( ( (lv_a_5_0= ruleAR ) ) otherlv_6= '&' ( (lv_b_7_0= ruleGDr ) ) otherlv_8= '&' ( (lv_c_9_0= ruleRGRD ) ) ) | ( ( (lv_a_10_0= ruleAR ) ) otherlv_11= '&' ( (lv_b_12_0= ruleMD ) ) otherlv_13= '&' ( (lv_c_14_0= ruleGDr ) ) ) | ( ( (lv_a_15_0= ruleAR ) ) otherlv_16= '&' ( (lv_b_17_0= ruleMD ) ) otherlv_18= '&' ( (lv_c_19_0= ruleRGRD ) ) ) | ( ( (lv_a_20_0= ruleAR ) ) otherlv_21= '&' ( (lv_b_22_0= ruleRGRD ) ) otherlv_23= '&' ( (lv_c_24_0= ruleMD ) ) ) | ( ( (lv_a_25_0= ruleAR ) ) otherlv_26= '&' ( (lv_b_27_0= ruleRGRD ) ) otherlv_28= '&' ( (lv_c_29_0= ruleGDr ) ) ) | ( ( (lv_a_30_0= ruleGDr ) ) otherlv_31= '&' ( (lv_b_32_0= ruleAR ) ) otherlv_33= '&' ( (lv_c_34_0= ruleMD ) ) ) | ( ( (lv_a_35_0= ruleGDr ) ) otherlv_36= '&' ( (lv_b_37_0= ruleAR ) ) otherlv_38= '&' ( (lv_c_39_0= ruleRGRD ) ) ) | ( ( (lv_a_40_0= ruleGDr ) ) otherlv_41= '&' ( (lv_b_42_0= ruleMD ) ) otherlv_43= '&' ( (lv_c_44_0= ruleAR ) ) ) | ( ( (lv_a_45_0= ruleGDr ) ) otherlv_46= '&' ( (lv_b_47_0= ruleMD ) ) otherlv_48= '&' ( (lv_c_49_0= ruleRGRD ) ) ) | ( ( (lv_a_50_0= ruleGDr ) ) otherlv_51= '&' ( (lv_b_52_0= ruleRGRD ) ) otherlv_53= '&' ( (lv_c_54_0= ruleAR ) ) ) | ( ( (lv_a_55_0= ruleGDr ) ) otherlv_56= '&' ( (lv_b_57_0= ruleRGRD ) ) otherlv_58= '&' ( (lv_c_59_0= ruleMD ) ) ) | ( ( (lv_a_60_0= ruleMD ) ) otherlv_61= '&' ( (lv_b_62_0= ruleAR ) ) otherlv_63= '&' ( (lv_c_64_0= ruleGDr ) ) ) | ( ( (lv_a_65_0= ruleMD ) ) otherlv_66= '&' ( (lv_b_67_0= ruleAR ) ) otherlv_68= '&' ( (lv_c_69_0= ruleRGRD ) ) ) | ( ( (lv_a_70_0= ruleMD ) ) otherlv_71= '&' ( (lv_b_72_0= ruleGDr ) ) otherlv_73= '&' ( (lv_c_74_0= ruleAR ) ) ) | ( ( (lv_a_75_0= ruleMD ) ) otherlv_76= '&' ( (lv_b_77_0= ruleGDr ) ) otherlv_78= '&' ( (lv_c_79_0= ruleRGRD ) ) ) | ( ( (lv_a_80_0= ruleMD ) ) otherlv_81= '&' ( (lv_b_82_0= ruleRGRD ) ) otherlv_83= '&' ( (lv_c_84_0= ruleGDr ) ) ) | ( ( (lv_a_85_0= ruleMD ) ) otherlv_86= '&' ( (lv_b_87_0= ruleRGRD ) ) otherlv_88= '&' ( (lv_c_89_0= ruleAR ) ) ) | ( ( (lv_a_90_0= ruleRGRD ) ) otherlv_91= '&' ( (lv_b_92_0= ruleAR ) ) otherlv_93= '&' ( (lv_c_94_0= ruleMD ) ) ) | ( ( (lv_a_95_0= ruleRGRD ) ) otherlv_96= '&' ( (lv_b_97_0= ruleAR ) ) otherlv_98= '&' ( (lv_c_99_0= ruleGDr ) ) ) | ( ( (lv_a_100_0= ruleRGRD ) ) otherlv_101= '&' ( (lv_b_102_0= ruleMD ) ) otherlv_103= '&' ( (lv_c_104_0= ruleAR ) ) ) | ( ( (lv_a_105_0= ruleRGRD ) ) otherlv_106= '&' ( (lv_b_107_0= ruleMD ) ) otherlv_108= '&' ( (lv_c_109_0= ruleGDr ) ) ) | ( ( (lv_a_110_0= ruleRGRD ) ) otherlv_111= '&' ( (lv_b_112_0= ruleGDr ) ) otherlv_113= '&' ( (lv_c_114_0= ruleMD ) ) ) | ( ( (lv_a_115_0= ruleRGRD ) ) otherlv_116= '&' ( (lv_b_117_0= ruleGDr ) ) otherlv_118= '&' ( (lv_c_119_0= ruleAR ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000043000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002001000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004001000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008001000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000002FF60001020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000043002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000007F40001000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000007F40000000L});

}