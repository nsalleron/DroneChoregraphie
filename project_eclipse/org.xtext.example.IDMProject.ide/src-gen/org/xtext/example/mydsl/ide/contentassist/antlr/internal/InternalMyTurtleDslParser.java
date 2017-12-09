package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyTurtleDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyTurtleDslParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(MyTurtleDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMyTurtleDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:54:1: ( ruleModel EOF )
            // InternalMyTurtleDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyTurtleDsl.g:62:1: ruleModel : ( ( rule__Model__Group__0 )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:66:2: ( ( ( rule__Model__Group__0 )* ) )
            // InternalMyTurtleDsl.g:67:2: ( ( rule__Model__Group__0 )* )
            {
            // InternalMyTurtleDsl.g:67:2: ( ( rule__Model__Group__0 )* )
            // InternalMyTurtleDsl.g:68:3: ( rule__Model__Group__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalMyTurtleDsl.g:69:3: ( rule__Model__Group__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=13)||LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:69:4: rule__Model__Group__0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__Group__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleIncludes"
    // InternalMyTurtleDsl.g:78:1: entryRuleIncludes : ruleIncludes EOF ;
    public final void entryRuleIncludes() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:79:1: ( ruleIncludes EOF )
            // InternalMyTurtleDsl.g:80:1: ruleIncludes EOF
            {
             before(grammarAccess.getIncludesRule()); 
            pushFollow(FOLLOW_1);
            ruleIncludes();

            state._fsp--;

             after(grammarAccess.getIncludesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIncludes"


    // $ANTLR start "ruleIncludes"
    // InternalMyTurtleDsl.g:87:1: ruleIncludes : ( ( rule__Includes__Group__0 ) ) ;
    public final void ruleIncludes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:91:2: ( ( ( rule__Includes__Group__0 ) ) )
            // InternalMyTurtleDsl.g:92:2: ( ( rule__Includes__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:92:2: ( ( rule__Includes__Group__0 ) )
            // InternalMyTurtleDsl.g:93:3: ( rule__Includes__Group__0 )
            {
             before(grammarAccess.getIncludesAccess().getGroup()); 
            // InternalMyTurtleDsl.g:94:3: ( rule__Includes__Group__0 )
            // InternalMyTurtleDsl.g:94:4: rule__Includes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Includes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIncludesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIncludes"


    // $ANTLR start "entryRulePourcent_vitesse_hauteur_max"
    // InternalMyTurtleDsl.g:103:1: entryRulePourcent_vitesse_hauteur_max : rulePourcent_vitesse_hauteur_max EOF ;
    public final void entryRulePourcent_vitesse_hauteur_max() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:104:1: ( rulePourcent_vitesse_hauteur_max EOF )
            // InternalMyTurtleDsl.g:105:1: rulePourcent_vitesse_hauteur_max EOF
            {
             before(grammarAccess.getPourcent_vitesse_hauteur_maxRule()); 
            pushFollow(FOLLOW_1);
            rulePourcent_vitesse_hauteur_max();

            state._fsp--;

             after(grammarAccess.getPourcent_vitesse_hauteur_maxRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePourcent_vitesse_hauteur_max"


    // $ANTLR start "rulePourcent_vitesse_hauteur_max"
    // InternalMyTurtleDsl.g:112:1: rulePourcent_vitesse_hauteur_max : ( ( rule__Pourcent_vitesse_hauteur_max__Group__0 ) ) ;
    public final void rulePourcent_vitesse_hauteur_max() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:116:2: ( ( ( rule__Pourcent_vitesse_hauteur_max__Group__0 ) ) )
            // InternalMyTurtleDsl.g:117:2: ( ( rule__Pourcent_vitesse_hauteur_max__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:117:2: ( ( rule__Pourcent_vitesse_hauteur_max__Group__0 ) )
            // InternalMyTurtleDsl.g:118:3: ( rule__Pourcent_vitesse_hauteur_max__Group__0 )
            {
             before(grammarAccess.getPourcent_vitesse_hauteur_maxAccess().getGroup()); 
            // InternalMyTurtleDsl.g:119:3: ( rule__Pourcent_vitesse_hauteur_max__Group__0 )
            // InternalMyTurtleDsl.g:119:4: rule__Pourcent_vitesse_hauteur_max__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pourcent_vitesse_hauteur_max__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPourcent_vitesse_hauteur_maxAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePourcent_vitesse_hauteur_max"


    // $ANTLR start "entryRulePourcent_vitesse_deplacement_max"
    // InternalMyTurtleDsl.g:128:1: entryRulePourcent_vitesse_deplacement_max : rulePourcent_vitesse_deplacement_max EOF ;
    public final void entryRulePourcent_vitesse_deplacement_max() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:129:1: ( rulePourcent_vitesse_deplacement_max EOF )
            // InternalMyTurtleDsl.g:130:1: rulePourcent_vitesse_deplacement_max EOF
            {
             before(grammarAccess.getPourcent_vitesse_deplacement_maxRule()); 
            pushFollow(FOLLOW_1);
            rulePourcent_vitesse_deplacement_max();

            state._fsp--;

             after(grammarAccess.getPourcent_vitesse_deplacement_maxRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePourcent_vitesse_deplacement_max"


    // $ANTLR start "rulePourcent_vitesse_deplacement_max"
    // InternalMyTurtleDsl.g:137:1: rulePourcent_vitesse_deplacement_max : ( ( rule__Pourcent_vitesse_deplacement_max__Group__0 ) ) ;
    public final void rulePourcent_vitesse_deplacement_max() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:141:2: ( ( ( rule__Pourcent_vitesse_deplacement_max__Group__0 ) ) )
            // InternalMyTurtleDsl.g:142:2: ( ( rule__Pourcent_vitesse_deplacement_max__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:142:2: ( ( rule__Pourcent_vitesse_deplacement_max__Group__0 ) )
            // InternalMyTurtleDsl.g:143:3: ( rule__Pourcent_vitesse_deplacement_max__Group__0 )
            {
             before(grammarAccess.getPourcent_vitesse_deplacement_maxAccess().getGroup()); 
            // InternalMyTurtleDsl.g:144:3: ( rule__Pourcent_vitesse_deplacement_max__Group__0 )
            // InternalMyTurtleDsl.g:144:4: rule__Pourcent_vitesse_deplacement_max__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pourcent_vitesse_deplacement_max__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPourcent_vitesse_deplacement_maxAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePourcent_vitesse_deplacement_max"


    // $ANTLR start "entryRulePourcent_vitesse_rotation_max"
    // InternalMyTurtleDsl.g:153:1: entryRulePourcent_vitesse_rotation_max : rulePourcent_vitesse_rotation_max EOF ;
    public final void entryRulePourcent_vitesse_rotation_max() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:154:1: ( rulePourcent_vitesse_rotation_max EOF )
            // InternalMyTurtleDsl.g:155:1: rulePourcent_vitesse_rotation_max EOF
            {
             before(grammarAccess.getPourcent_vitesse_rotation_maxRule()); 
            pushFollow(FOLLOW_1);
            rulePourcent_vitesse_rotation_max();

            state._fsp--;

             after(grammarAccess.getPourcent_vitesse_rotation_maxRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePourcent_vitesse_rotation_max"


    // $ANTLR start "rulePourcent_vitesse_rotation_max"
    // InternalMyTurtleDsl.g:162:1: rulePourcent_vitesse_rotation_max : ( ( rule__Pourcent_vitesse_rotation_max__Group__0 ) ) ;
    public final void rulePourcent_vitesse_rotation_max() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:166:2: ( ( ( rule__Pourcent_vitesse_rotation_max__Group__0 ) ) )
            // InternalMyTurtleDsl.g:167:2: ( ( rule__Pourcent_vitesse_rotation_max__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:167:2: ( ( rule__Pourcent_vitesse_rotation_max__Group__0 ) )
            // InternalMyTurtleDsl.g:168:3: ( rule__Pourcent_vitesse_rotation_max__Group__0 )
            {
             before(grammarAccess.getPourcent_vitesse_rotation_maxAccess().getGroup()); 
            // InternalMyTurtleDsl.g:169:3: ( rule__Pourcent_vitesse_rotation_max__Group__0 )
            // InternalMyTurtleDsl.g:169:4: rule__Pourcent_vitesse_rotation_max__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pourcent_vitesse_rotation_max__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPourcent_vitesse_rotation_maxAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePourcent_vitesse_rotation_max"


    // $ANTLR start "entryRuleHauteur_max"
    // InternalMyTurtleDsl.g:178:1: entryRuleHauteur_max : ruleHauteur_max EOF ;
    public final void entryRuleHauteur_max() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:179:1: ( ruleHauteur_max EOF )
            // InternalMyTurtleDsl.g:180:1: ruleHauteur_max EOF
            {
             before(grammarAccess.getHauteur_maxRule()); 
            pushFollow(FOLLOW_1);
            ruleHauteur_max();

            state._fsp--;

             after(grammarAccess.getHauteur_maxRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHauteur_max"


    // $ANTLR start "ruleHauteur_max"
    // InternalMyTurtleDsl.g:187:1: ruleHauteur_max : ( ( rule__Hauteur_max__Group__0 ) ) ;
    public final void ruleHauteur_max() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:191:2: ( ( ( rule__Hauteur_max__Group__0 ) ) )
            // InternalMyTurtleDsl.g:192:2: ( ( rule__Hauteur_max__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:192:2: ( ( rule__Hauteur_max__Group__0 ) )
            // InternalMyTurtleDsl.g:193:3: ( rule__Hauteur_max__Group__0 )
            {
             before(grammarAccess.getHauteur_maxAccess().getGroup()); 
            // InternalMyTurtleDsl.g:194:3: ( rule__Hauteur_max__Group__0 )
            // InternalMyTurtleDsl.g:194:4: rule__Hauteur_max__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Hauteur_max__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHauteur_maxAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHauteur_max"


    // $ANTLR start "entryRuleEloignement_max"
    // InternalMyTurtleDsl.g:203:1: entryRuleEloignement_max : ruleEloignement_max EOF ;
    public final void entryRuleEloignement_max() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:204:1: ( ruleEloignement_max EOF )
            // InternalMyTurtleDsl.g:205:1: ruleEloignement_max EOF
            {
             before(grammarAccess.getEloignement_maxRule()); 
            pushFollow(FOLLOW_1);
            ruleEloignement_max();

            state._fsp--;

             after(grammarAccess.getEloignement_maxRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEloignement_max"


    // $ANTLR start "ruleEloignement_max"
    // InternalMyTurtleDsl.g:212:1: ruleEloignement_max : ( ( rule__Eloignement_max__Group__0 ) ) ;
    public final void ruleEloignement_max() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:216:2: ( ( ( rule__Eloignement_max__Group__0 ) ) )
            // InternalMyTurtleDsl.g:217:2: ( ( rule__Eloignement_max__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:217:2: ( ( rule__Eloignement_max__Group__0 ) )
            // InternalMyTurtleDsl.g:218:3: ( rule__Eloignement_max__Group__0 )
            {
             before(grammarAccess.getEloignement_maxAccess().getGroup()); 
            // InternalMyTurtleDsl.g:219:3: ( rule__Eloignement_max__Group__0 )
            // InternalMyTurtleDsl.g:219:4: rule__Eloignement_max__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Eloignement_max__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEloignement_maxAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEloignement_max"


    // $ANTLR start "entryRuleDecoller"
    // InternalMyTurtleDsl.g:228:1: entryRuleDecoller : ruleDecoller EOF ;
    public final void entryRuleDecoller() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:229:1: ( ruleDecoller EOF )
            // InternalMyTurtleDsl.g:230:1: ruleDecoller EOF
            {
             before(grammarAccess.getDecollerRule()); 
            pushFollow(FOLLOW_1);
            ruleDecoller();

            state._fsp--;

             after(grammarAccess.getDecollerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDecoller"


    // $ANTLR start "ruleDecoller"
    // InternalMyTurtleDsl.g:237:1: ruleDecoller : ( ( rule__Decoller__Group__0 ) ) ;
    public final void ruleDecoller() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:241:2: ( ( ( rule__Decoller__Group__0 ) ) )
            // InternalMyTurtleDsl.g:242:2: ( ( rule__Decoller__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:242:2: ( ( rule__Decoller__Group__0 ) )
            // InternalMyTurtleDsl.g:243:3: ( rule__Decoller__Group__0 )
            {
             before(grammarAccess.getDecollerAccess().getGroup()); 
            // InternalMyTurtleDsl.g:244:3: ( rule__Decoller__Group__0 )
            // InternalMyTurtleDsl.g:244:4: rule__Decoller__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Decoller__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDecollerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDecoller"


    // $ANTLR start "entryRuleAtterrir"
    // InternalMyTurtleDsl.g:253:1: entryRuleAtterrir : ruleAtterrir EOF ;
    public final void entryRuleAtterrir() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:254:1: ( ruleAtterrir EOF )
            // InternalMyTurtleDsl.g:255:1: ruleAtterrir EOF
            {
             before(grammarAccess.getAtterrirRule()); 
            pushFollow(FOLLOW_1);
            ruleAtterrir();

            state._fsp--;

             after(grammarAccess.getAtterrirRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtterrir"


    // $ANTLR start "ruleAtterrir"
    // InternalMyTurtleDsl.g:262:1: ruleAtterrir : ( ( rule__Atterrir__Group__0 ) ) ;
    public final void ruleAtterrir() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:266:2: ( ( ( rule__Atterrir__Group__0 ) ) )
            // InternalMyTurtleDsl.g:267:2: ( ( rule__Atterrir__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:267:2: ( ( rule__Atterrir__Group__0 ) )
            // InternalMyTurtleDsl.g:268:3: ( rule__Atterrir__Group__0 )
            {
             before(grammarAccess.getAtterrirAccess().getGroup()); 
            // InternalMyTurtleDsl.g:269:3: ( rule__Atterrir__Group__0 )
            // InternalMyTurtleDsl.g:269:4: rule__Atterrir__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Atterrir__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtterrirAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtterrir"


    // $ANTLR start "entryRuleMonter"
    // InternalMyTurtleDsl.g:278:1: entryRuleMonter : ruleMonter EOF ;
    public final void entryRuleMonter() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:279:1: ( ruleMonter EOF )
            // InternalMyTurtleDsl.g:280:1: ruleMonter EOF
            {
             before(grammarAccess.getMonterRule()); 
            pushFollow(FOLLOW_1);
            ruleMonter();

            state._fsp--;

             after(grammarAccess.getMonterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMonter"


    // $ANTLR start "ruleMonter"
    // InternalMyTurtleDsl.g:287:1: ruleMonter : ( ( rule__Monter__Group__0 ) ) ;
    public final void ruleMonter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:291:2: ( ( ( rule__Monter__Group__0 ) ) )
            // InternalMyTurtleDsl.g:292:2: ( ( rule__Monter__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:292:2: ( ( rule__Monter__Group__0 ) )
            // InternalMyTurtleDsl.g:293:3: ( rule__Monter__Group__0 )
            {
             before(grammarAccess.getMonterAccess().getGroup()); 
            // InternalMyTurtleDsl.g:294:3: ( rule__Monter__Group__0 )
            // InternalMyTurtleDsl.g:294:4: rule__Monter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Monter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMonterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMonter"


    // $ANTLR start "entryRuleDescendre"
    // InternalMyTurtleDsl.g:303:1: entryRuleDescendre : ruleDescendre EOF ;
    public final void entryRuleDescendre() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:304:1: ( ruleDescendre EOF )
            // InternalMyTurtleDsl.g:305:1: ruleDescendre EOF
            {
             before(grammarAccess.getDescendreRule()); 
            pushFollow(FOLLOW_1);
            ruleDescendre();

            state._fsp--;

             after(grammarAccess.getDescendreRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDescendre"


    // $ANTLR start "ruleDescendre"
    // InternalMyTurtleDsl.g:312:1: ruleDescendre : ( ( rule__Descendre__Group__0 ) ) ;
    public final void ruleDescendre() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:316:2: ( ( ( rule__Descendre__Group__0 ) ) )
            // InternalMyTurtleDsl.g:317:2: ( ( rule__Descendre__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:317:2: ( ( rule__Descendre__Group__0 ) )
            // InternalMyTurtleDsl.g:318:3: ( rule__Descendre__Group__0 )
            {
             before(grammarAccess.getDescendreAccess().getGroup()); 
            // InternalMyTurtleDsl.g:319:3: ( rule__Descendre__Group__0 )
            // InternalMyTurtleDsl.g:319:4: rule__Descendre__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Descendre__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDescendreAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDescendre"


    // $ANTLR start "entryRuleAvancer"
    // InternalMyTurtleDsl.g:328:1: entryRuleAvancer : ruleAvancer EOF ;
    public final void entryRuleAvancer() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:329:1: ( ruleAvancer EOF )
            // InternalMyTurtleDsl.g:330:1: ruleAvancer EOF
            {
             before(grammarAccess.getAvancerRule()); 
            pushFollow(FOLLOW_1);
            ruleAvancer();

            state._fsp--;

             after(grammarAccess.getAvancerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAvancer"


    // $ANTLR start "ruleAvancer"
    // InternalMyTurtleDsl.g:337:1: ruleAvancer : ( ( rule__Avancer__Group__0 ) ) ;
    public final void ruleAvancer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:341:2: ( ( ( rule__Avancer__Group__0 ) ) )
            // InternalMyTurtleDsl.g:342:2: ( ( rule__Avancer__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:342:2: ( ( rule__Avancer__Group__0 ) )
            // InternalMyTurtleDsl.g:343:3: ( rule__Avancer__Group__0 )
            {
             before(grammarAccess.getAvancerAccess().getGroup()); 
            // InternalMyTurtleDsl.g:344:3: ( rule__Avancer__Group__0 )
            // InternalMyTurtleDsl.g:344:4: rule__Avancer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Avancer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAvancerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAvancer"


    // $ANTLR start "entryRuleReculer"
    // InternalMyTurtleDsl.g:353:1: entryRuleReculer : ruleReculer EOF ;
    public final void entryRuleReculer() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:354:1: ( ruleReculer EOF )
            // InternalMyTurtleDsl.g:355:1: ruleReculer EOF
            {
             before(grammarAccess.getReculerRule()); 
            pushFollow(FOLLOW_1);
            ruleReculer();

            state._fsp--;

             after(grammarAccess.getReculerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReculer"


    // $ANTLR start "ruleReculer"
    // InternalMyTurtleDsl.g:362:1: ruleReculer : ( ( rule__Reculer__Group__0 ) ) ;
    public final void ruleReculer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:366:2: ( ( ( rule__Reculer__Group__0 ) ) )
            // InternalMyTurtleDsl.g:367:2: ( ( rule__Reculer__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:367:2: ( ( rule__Reculer__Group__0 ) )
            // InternalMyTurtleDsl.g:368:3: ( rule__Reculer__Group__0 )
            {
             before(grammarAccess.getReculerAccess().getGroup()); 
            // InternalMyTurtleDsl.g:369:3: ( rule__Reculer__Group__0 )
            // InternalMyTurtleDsl.g:369:4: rule__Reculer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Reculer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReculerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReculer"


    // $ANTLR start "entryRuleGauche"
    // InternalMyTurtleDsl.g:378:1: entryRuleGauche : ruleGauche EOF ;
    public final void entryRuleGauche() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:379:1: ( ruleGauche EOF )
            // InternalMyTurtleDsl.g:380:1: ruleGauche EOF
            {
             before(grammarAccess.getGaucheRule()); 
            pushFollow(FOLLOW_1);
            ruleGauche();

            state._fsp--;

             after(grammarAccess.getGaucheRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGauche"


    // $ANTLR start "ruleGauche"
    // InternalMyTurtleDsl.g:387:1: ruleGauche : ( ( rule__Gauche__Group__0 ) ) ;
    public final void ruleGauche() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:391:2: ( ( ( rule__Gauche__Group__0 ) ) )
            // InternalMyTurtleDsl.g:392:2: ( ( rule__Gauche__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:392:2: ( ( rule__Gauche__Group__0 ) )
            // InternalMyTurtleDsl.g:393:3: ( rule__Gauche__Group__0 )
            {
             before(grammarAccess.getGaucheAccess().getGroup()); 
            // InternalMyTurtleDsl.g:394:3: ( rule__Gauche__Group__0 )
            // InternalMyTurtleDsl.g:394:4: rule__Gauche__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Gauche__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGaucheAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGauche"


    // $ANTLR start "entryRuleDroite"
    // InternalMyTurtleDsl.g:403:1: entryRuleDroite : ruleDroite EOF ;
    public final void entryRuleDroite() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:404:1: ( ruleDroite EOF )
            // InternalMyTurtleDsl.g:405:1: ruleDroite EOF
            {
             before(grammarAccess.getDroiteRule()); 
            pushFollow(FOLLOW_1);
            ruleDroite();

            state._fsp--;

             after(grammarAccess.getDroiteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDroite"


    // $ANTLR start "ruleDroite"
    // InternalMyTurtleDsl.g:412:1: ruleDroite : ( ( rule__Droite__Group__0 ) ) ;
    public final void ruleDroite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:416:2: ( ( ( rule__Droite__Group__0 ) ) )
            // InternalMyTurtleDsl.g:417:2: ( ( rule__Droite__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:417:2: ( ( rule__Droite__Group__0 ) )
            // InternalMyTurtleDsl.g:418:3: ( rule__Droite__Group__0 )
            {
             before(grammarAccess.getDroiteAccess().getGroup()); 
            // InternalMyTurtleDsl.g:419:3: ( rule__Droite__Group__0 )
            // InternalMyTurtleDsl.g:419:4: rule__Droite__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Droite__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDroiteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDroite"


    // $ANTLR start "entryRulePause"
    // InternalMyTurtleDsl.g:428:1: entryRulePause : rulePause EOF ;
    public final void entryRulePause() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:429:1: ( rulePause EOF )
            // InternalMyTurtleDsl.g:430:1: rulePause EOF
            {
             before(grammarAccess.getPauseRule()); 
            pushFollow(FOLLOW_1);
            rulePause();

            state._fsp--;

             after(grammarAccess.getPauseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePause"


    // $ANTLR start "rulePause"
    // InternalMyTurtleDsl.g:437:1: rulePause : ( ( rule__Pause__Group__0 ) ) ;
    public final void rulePause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:441:2: ( ( ( rule__Pause__Group__0 ) ) )
            // InternalMyTurtleDsl.g:442:2: ( ( rule__Pause__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:442:2: ( ( rule__Pause__Group__0 ) )
            // InternalMyTurtleDsl.g:443:3: ( rule__Pause__Group__0 )
            {
             before(grammarAccess.getPauseAccess().getGroup()); 
            // InternalMyTurtleDsl.g:444:3: ( rule__Pause__Group__0 )
            // InternalMyTurtleDsl.g:444:4: rule__Pause__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPauseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePause"


    // $ANTLR start "entryRuleRotationGauche"
    // InternalMyTurtleDsl.g:453:1: entryRuleRotationGauche : ruleRotationGauche EOF ;
    public final void entryRuleRotationGauche() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:454:1: ( ruleRotationGauche EOF )
            // InternalMyTurtleDsl.g:455:1: ruleRotationGauche EOF
            {
             before(grammarAccess.getRotationGaucheRule()); 
            pushFollow(FOLLOW_1);
            ruleRotationGauche();

            state._fsp--;

             after(grammarAccess.getRotationGaucheRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRotationGauche"


    // $ANTLR start "ruleRotationGauche"
    // InternalMyTurtleDsl.g:462:1: ruleRotationGauche : ( ( rule__RotationGauche__Group__0 ) ) ;
    public final void ruleRotationGauche() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:466:2: ( ( ( rule__RotationGauche__Group__0 ) ) )
            // InternalMyTurtleDsl.g:467:2: ( ( rule__RotationGauche__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:467:2: ( ( rule__RotationGauche__Group__0 ) )
            // InternalMyTurtleDsl.g:468:3: ( rule__RotationGauche__Group__0 )
            {
             before(grammarAccess.getRotationGaucheAccess().getGroup()); 
            // InternalMyTurtleDsl.g:469:3: ( rule__RotationGauche__Group__0 )
            // InternalMyTurtleDsl.g:469:4: rule__RotationGauche__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RotationGauche__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRotationGaucheAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRotationGauche"


    // $ANTLR start "entryRuleRotationDroite"
    // InternalMyTurtleDsl.g:478:1: entryRuleRotationDroite : ruleRotationDroite EOF ;
    public final void entryRuleRotationDroite() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:479:1: ( ruleRotationDroite EOF )
            // InternalMyTurtleDsl.g:480:1: ruleRotationDroite EOF
            {
             before(grammarAccess.getRotationDroiteRule()); 
            pushFollow(FOLLOW_1);
            ruleRotationDroite();

            state._fsp--;

             after(grammarAccess.getRotationDroiteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRotationDroite"


    // $ANTLR start "ruleRotationDroite"
    // InternalMyTurtleDsl.g:487:1: ruleRotationDroite : ( ( rule__RotationDroite__Group__0 ) ) ;
    public final void ruleRotationDroite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:491:2: ( ( ( rule__RotationDroite__Group__0 ) ) )
            // InternalMyTurtleDsl.g:492:2: ( ( rule__RotationDroite__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:492:2: ( ( rule__RotationDroite__Group__0 ) )
            // InternalMyTurtleDsl.g:493:3: ( rule__RotationDroite__Group__0 )
            {
             before(grammarAccess.getRotationDroiteAccess().getGroup()); 
            // InternalMyTurtleDsl.g:494:3: ( rule__RotationDroite__Group__0 )
            // InternalMyTurtleDsl.g:494:4: rule__RotationDroite__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RotationDroite__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRotationDroiteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRotationDroite"


    // $ANTLR start "entryRuleStart"
    // InternalMyTurtleDsl.g:503:1: entryRuleStart : ruleStart EOF ;
    public final void entryRuleStart() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:504:1: ( ruleStart EOF )
            // InternalMyTurtleDsl.g:505:1: ruleStart EOF
            {
             before(grammarAccess.getStartRule()); 
            pushFollow(FOLLOW_1);
            ruleStart();

            state._fsp--;

             after(grammarAccess.getStartRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStart"


    // $ANTLR start "ruleStart"
    // InternalMyTurtleDsl.g:512:1: ruleStart : ( ruleDecoller ) ;
    public final void ruleStart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:516:2: ( ( ruleDecoller ) )
            // InternalMyTurtleDsl.g:517:2: ( ruleDecoller )
            {
            // InternalMyTurtleDsl.g:517:2: ( ruleDecoller )
            // InternalMyTurtleDsl.g:518:3: ruleDecoller
            {
             before(grammarAccess.getStartAccess().getDecollerParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleDecoller();

            state._fsp--;

             after(grammarAccess.getStartAccess().getDecollerParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStart"


    // $ANTLR start "entryRuleEnd"
    // InternalMyTurtleDsl.g:528:1: entryRuleEnd : ruleEnd EOF ;
    public final void entryRuleEnd() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:529:1: ( ruleEnd EOF )
            // InternalMyTurtleDsl.g:530:1: ruleEnd EOF
            {
             before(grammarAccess.getEndRule()); 
            pushFollow(FOLLOW_1);
            ruleEnd();

            state._fsp--;

             after(grammarAccess.getEndRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnd"


    // $ANTLR start "ruleEnd"
    // InternalMyTurtleDsl.g:537:1: ruleEnd : ( ruleAtterrir ) ;
    public final void ruleEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:541:2: ( ( ruleAtterrir ) )
            // InternalMyTurtleDsl.g:542:2: ( ruleAtterrir )
            {
            // InternalMyTurtleDsl.g:542:2: ( ruleAtterrir )
            // InternalMyTurtleDsl.g:543:3: ruleAtterrir
            {
             before(grammarAccess.getEndAccess().getAtterrirParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleAtterrir();

            state._fsp--;

             after(grammarAccess.getEndAccess().getAtterrirParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnd"


    // $ANTLR start "entryRuleStatement"
    // InternalMyTurtleDsl.g:553:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:554:1: ( ruleStatement EOF )
            // InternalMyTurtleDsl.g:555:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMyTurtleDsl.g:562:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:566:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalMyTurtleDsl.g:567:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalMyTurtleDsl.g:567:2: ( ( rule__Statement__Alternatives ) )
            // InternalMyTurtleDsl.g:568:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalMyTurtleDsl.g:569:3: ( rule__Statement__Alternatives )
            // InternalMyTurtleDsl.g:569:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleFonctionDecl"
    // InternalMyTurtleDsl.g:578:1: entryRuleFonctionDecl : ruleFonctionDecl EOF ;
    public final void entryRuleFonctionDecl() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:579:1: ( ruleFonctionDecl EOF )
            // InternalMyTurtleDsl.g:580:1: ruleFonctionDecl EOF
            {
             before(grammarAccess.getFonctionDeclRule()); 
            pushFollow(FOLLOW_1);
            ruleFonctionDecl();

            state._fsp--;

             after(grammarAccess.getFonctionDeclRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFonctionDecl"


    // $ANTLR start "ruleFonctionDecl"
    // InternalMyTurtleDsl.g:587:1: ruleFonctionDecl : ( ( rule__FonctionDecl__Group__0 ) ) ;
    public final void ruleFonctionDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:591:2: ( ( ( rule__FonctionDecl__Group__0 ) ) )
            // InternalMyTurtleDsl.g:592:2: ( ( rule__FonctionDecl__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:592:2: ( ( rule__FonctionDecl__Group__0 ) )
            // InternalMyTurtleDsl.g:593:3: ( rule__FonctionDecl__Group__0 )
            {
             before(grammarAccess.getFonctionDeclAccess().getGroup()); 
            // InternalMyTurtleDsl.g:594:3: ( rule__FonctionDecl__Group__0 )
            // InternalMyTurtleDsl.g:594:4: rule__FonctionDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FonctionDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFonctionDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFonctionDecl"


    // $ANTLR start "entryRuleIntConstante"
    // InternalMyTurtleDsl.g:603:1: entryRuleIntConstante : ruleIntConstante EOF ;
    public final void entryRuleIntConstante() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:604:1: ( ruleIntConstante EOF )
            // InternalMyTurtleDsl.g:605:1: ruleIntConstante EOF
            {
             before(grammarAccess.getIntConstanteRule()); 
            pushFollow(FOLLOW_1);
            ruleIntConstante();

            state._fsp--;

             after(grammarAccess.getIntConstanteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntConstante"


    // $ANTLR start "ruleIntConstante"
    // InternalMyTurtleDsl.g:612:1: ruleIntConstante : ( ( rule__IntConstante__ValAssignment ) ) ;
    public final void ruleIntConstante() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:616:2: ( ( ( rule__IntConstante__ValAssignment ) ) )
            // InternalMyTurtleDsl.g:617:2: ( ( rule__IntConstante__ValAssignment ) )
            {
            // InternalMyTurtleDsl.g:617:2: ( ( rule__IntConstante__ValAssignment ) )
            // InternalMyTurtleDsl.g:618:3: ( rule__IntConstante__ValAssignment )
            {
             before(grammarAccess.getIntConstanteAccess().getValAssignment()); 
            // InternalMyTurtleDsl.g:619:3: ( rule__IntConstante__ValAssignment )
            // InternalMyTurtleDsl.g:619:4: rule__IntConstante__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntConstante__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntConstanteAccess().getValAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntConstante"


    // $ANTLR start "entryRuleIntDecl"
    // InternalMyTurtleDsl.g:628:1: entryRuleIntDecl : ruleIntDecl EOF ;
    public final void entryRuleIntDecl() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:629:1: ( ruleIntDecl EOF )
            // InternalMyTurtleDsl.g:630:1: ruleIntDecl EOF
            {
             before(grammarAccess.getIntDeclRule()); 
            pushFollow(FOLLOW_1);
            ruleIntDecl();

            state._fsp--;

             after(grammarAccess.getIntDeclRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntDecl"


    // $ANTLR start "ruleIntDecl"
    // InternalMyTurtleDsl.g:637:1: ruleIntDecl : ( ( rule__IntDecl__Group__0 ) ) ;
    public final void ruleIntDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:641:2: ( ( ( rule__IntDecl__Group__0 ) ) )
            // InternalMyTurtleDsl.g:642:2: ( ( rule__IntDecl__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:642:2: ( ( rule__IntDecl__Group__0 ) )
            // InternalMyTurtleDsl.g:643:3: ( rule__IntDecl__Group__0 )
            {
             before(grammarAccess.getIntDeclAccess().getGroup()); 
            // InternalMyTurtleDsl.g:644:3: ( rule__IntDecl__Group__0 )
            // InternalMyTurtleDsl.g:644:4: rule__IntDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntDecl"


    // $ANTLR start "entryRulePourcentDecl"
    // InternalMyTurtleDsl.g:653:1: entryRulePourcentDecl : rulePourcentDecl EOF ;
    public final void entryRulePourcentDecl() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:654:1: ( rulePourcentDecl EOF )
            // InternalMyTurtleDsl.g:655:1: rulePourcentDecl EOF
            {
             before(grammarAccess.getPourcentDeclRule()); 
            pushFollow(FOLLOW_1);
            rulePourcentDecl();

            state._fsp--;

             after(grammarAccess.getPourcentDeclRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePourcentDecl"


    // $ANTLR start "rulePourcentDecl"
    // InternalMyTurtleDsl.g:662:1: rulePourcentDecl : ( ( rule__PourcentDecl__Group__0 ) ) ;
    public final void rulePourcentDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:666:2: ( ( ( rule__PourcentDecl__Group__0 ) ) )
            // InternalMyTurtleDsl.g:667:2: ( ( rule__PourcentDecl__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:667:2: ( ( rule__PourcentDecl__Group__0 ) )
            // InternalMyTurtleDsl.g:668:3: ( rule__PourcentDecl__Group__0 )
            {
             before(grammarAccess.getPourcentDeclAccess().getGroup()); 
            // InternalMyTurtleDsl.g:669:3: ( rule__PourcentDecl__Group__0 )
            // InternalMyTurtleDsl.g:669:4: rule__PourcentDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PourcentDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPourcentDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePourcentDecl"


    // $ANTLR start "entryRuleRefIntVar"
    // InternalMyTurtleDsl.g:678:1: entryRuleRefIntVar : ruleRefIntVar EOF ;
    public final void entryRuleRefIntVar() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:679:1: ( ruleRefIntVar EOF )
            // InternalMyTurtleDsl.g:680:1: ruleRefIntVar EOF
            {
             before(grammarAccess.getRefIntVarRule()); 
            pushFollow(FOLLOW_1);
            ruleRefIntVar();

            state._fsp--;

             after(grammarAccess.getRefIntVarRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRefIntVar"


    // $ANTLR start "ruleRefIntVar"
    // InternalMyTurtleDsl.g:687:1: ruleRefIntVar : ( ( rule__RefIntVar__VarAssignment ) ) ;
    public final void ruleRefIntVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:691:2: ( ( ( rule__RefIntVar__VarAssignment ) ) )
            // InternalMyTurtleDsl.g:692:2: ( ( rule__RefIntVar__VarAssignment ) )
            {
            // InternalMyTurtleDsl.g:692:2: ( ( rule__RefIntVar__VarAssignment ) )
            // InternalMyTurtleDsl.g:693:3: ( rule__RefIntVar__VarAssignment )
            {
             before(grammarAccess.getRefIntVarAccess().getVarAssignment()); 
            // InternalMyTurtleDsl.g:694:3: ( rule__RefIntVar__VarAssignment )
            // InternalMyTurtleDsl.g:694:4: rule__RefIntVar__VarAssignment
            {
            pushFollow(FOLLOW_2);
            rule__RefIntVar__VarAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRefIntVarAccess().getVarAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRefIntVar"


    // $ANTLR start "entryRuleIntExp"
    // InternalMyTurtleDsl.g:703:1: entryRuleIntExp : ruleIntExp EOF ;
    public final void entryRuleIntExp() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:704:1: ( ruleIntExp EOF )
            // InternalMyTurtleDsl.g:705:1: ruleIntExp EOF
            {
             before(grammarAccess.getIntExpRule()); 
            pushFollow(FOLLOW_1);
            ruleIntExp();

            state._fsp--;

             after(grammarAccess.getIntExpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntExp"


    // $ANTLR start "ruleIntExp"
    // InternalMyTurtleDsl.g:712:1: ruleIntExp : ( ( rule__IntExp__Alternatives ) ) ;
    public final void ruleIntExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:716:2: ( ( ( rule__IntExp__Alternatives ) ) )
            // InternalMyTurtleDsl.g:717:2: ( ( rule__IntExp__Alternatives ) )
            {
            // InternalMyTurtleDsl.g:717:2: ( ( rule__IntExp__Alternatives ) )
            // InternalMyTurtleDsl.g:718:3: ( rule__IntExp__Alternatives )
            {
             before(grammarAccess.getIntExpAccess().getAlternatives()); 
            // InternalMyTurtleDsl.g:719:3: ( rule__IntExp__Alternatives )
            // InternalMyTurtleDsl.g:719:4: rule__IntExp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__IntExp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIntExpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntExp"


    // $ANTLR start "entryRuleFonctionCall"
    // InternalMyTurtleDsl.g:728:1: entryRuleFonctionCall : ruleFonctionCall EOF ;
    public final void entryRuleFonctionCall() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:729:1: ( ruleFonctionCall EOF )
            // InternalMyTurtleDsl.g:730:1: ruleFonctionCall EOF
            {
             before(grammarAccess.getFonctionCallRule()); 
            pushFollow(FOLLOW_1);
            ruleFonctionCall();

            state._fsp--;

             after(grammarAccess.getFonctionCallRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFonctionCall"


    // $ANTLR start "ruleFonctionCall"
    // InternalMyTurtleDsl.g:737:1: ruleFonctionCall : ( ( rule__FonctionCall__Group__0 ) ) ;
    public final void ruleFonctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:741:2: ( ( ( rule__FonctionCall__Group__0 ) ) )
            // InternalMyTurtleDsl.g:742:2: ( ( rule__FonctionCall__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:742:2: ( ( rule__FonctionCall__Group__0 ) )
            // InternalMyTurtleDsl.g:743:3: ( rule__FonctionCall__Group__0 )
            {
             before(grammarAccess.getFonctionCallAccess().getGroup()); 
            // InternalMyTurtleDsl.g:744:3: ( rule__FonctionCall__Group__0 )
            // InternalMyTurtleDsl.g:744:4: rule__FonctionCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FonctionCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFonctionCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFonctionCall"


    // $ANTLR start "entryRuleMD"
    // InternalMyTurtleDsl.g:753:1: entryRuleMD : ruleMD EOF ;
    public final void entryRuleMD() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:754:1: ( ruleMD EOF )
            // InternalMyTurtleDsl.g:755:1: ruleMD EOF
            {
             before(grammarAccess.getMDRule()); 
            pushFollow(FOLLOW_1);
            ruleMD();

            state._fsp--;

             after(grammarAccess.getMDRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMD"


    // $ANTLR start "ruleMD"
    // InternalMyTurtleDsl.g:762:1: ruleMD : ( ( rule__MD__Alternatives ) ) ;
    public final void ruleMD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:766:2: ( ( ( rule__MD__Alternatives ) ) )
            // InternalMyTurtleDsl.g:767:2: ( ( rule__MD__Alternatives ) )
            {
            // InternalMyTurtleDsl.g:767:2: ( ( rule__MD__Alternatives ) )
            // InternalMyTurtleDsl.g:768:3: ( rule__MD__Alternatives )
            {
             before(grammarAccess.getMDAccess().getAlternatives()); 
            // InternalMyTurtleDsl.g:769:3: ( rule__MD__Alternatives )
            // InternalMyTurtleDsl.g:769:4: rule__MD__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MD__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMDAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMD"


    // $ANTLR start "entryRuleGDr"
    // InternalMyTurtleDsl.g:778:1: entryRuleGDr : ruleGDr EOF ;
    public final void entryRuleGDr() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:779:1: ( ruleGDr EOF )
            // InternalMyTurtleDsl.g:780:1: ruleGDr EOF
            {
             before(grammarAccess.getGDrRule()); 
            pushFollow(FOLLOW_1);
            ruleGDr();

            state._fsp--;

             after(grammarAccess.getGDrRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGDr"


    // $ANTLR start "ruleGDr"
    // InternalMyTurtleDsl.g:787:1: ruleGDr : ( ( rule__GDr__Alternatives ) ) ;
    public final void ruleGDr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:791:2: ( ( ( rule__GDr__Alternatives ) ) )
            // InternalMyTurtleDsl.g:792:2: ( ( rule__GDr__Alternatives ) )
            {
            // InternalMyTurtleDsl.g:792:2: ( ( rule__GDr__Alternatives ) )
            // InternalMyTurtleDsl.g:793:3: ( rule__GDr__Alternatives )
            {
             before(grammarAccess.getGDrAccess().getAlternatives()); 
            // InternalMyTurtleDsl.g:794:3: ( rule__GDr__Alternatives )
            // InternalMyTurtleDsl.g:794:4: rule__GDr__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GDr__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGDrAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGDr"


    // $ANTLR start "entryRuleRGRD"
    // InternalMyTurtleDsl.g:803:1: entryRuleRGRD : ruleRGRD EOF ;
    public final void entryRuleRGRD() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:804:1: ( ruleRGRD EOF )
            // InternalMyTurtleDsl.g:805:1: ruleRGRD EOF
            {
             before(grammarAccess.getRGRDRule()); 
            pushFollow(FOLLOW_1);
            ruleRGRD();

            state._fsp--;

             after(grammarAccess.getRGRDRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRGRD"


    // $ANTLR start "ruleRGRD"
    // InternalMyTurtleDsl.g:812:1: ruleRGRD : ( ( rule__RGRD__Alternatives ) ) ;
    public final void ruleRGRD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:816:2: ( ( ( rule__RGRD__Alternatives ) ) )
            // InternalMyTurtleDsl.g:817:2: ( ( rule__RGRD__Alternatives ) )
            {
            // InternalMyTurtleDsl.g:817:2: ( ( rule__RGRD__Alternatives ) )
            // InternalMyTurtleDsl.g:818:3: ( rule__RGRD__Alternatives )
            {
             before(grammarAccess.getRGRDAccess().getAlternatives()); 
            // InternalMyTurtleDsl.g:819:3: ( rule__RGRD__Alternatives )
            // InternalMyTurtleDsl.g:819:4: rule__RGRD__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RGRD__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRGRDAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRGRD"


    // $ANTLR start "entryRuleAR"
    // InternalMyTurtleDsl.g:828:1: entryRuleAR : ruleAR EOF ;
    public final void entryRuleAR() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:829:1: ( ruleAR EOF )
            // InternalMyTurtleDsl.g:830:1: ruleAR EOF
            {
             before(grammarAccess.getARRule()); 
            pushFollow(FOLLOW_1);
            ruleAR();

            state._fsp--;

             after(grammarAccess.getARRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAR"


    // $ANTLR start "ruleAR"
    // InternalMyTurtleDsl.g:837:1: ruleAR : ( ( rule__AR__Alternatives ) ) ;
    public final void ruleAR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:841:2: ( ( ( rule__AR__Alternatives ) ) )
            // InternalMyTurtleDsl.g:842:2: ( ( rule__AR__Alternatives ) )
            {
            // InternalMyTurtleDsl.g:842:2: ( ( rule__AR__Alternatives ) )
            // InternalMyTurtleDsl.g:843:3: ( rule__AR__Alternatives )
            {
             before(grammarAccess.getARAccess().getAlternatives()); 
            // InternalMyTurtleDsl.g:844:3: ( rule__AR__Alternatives )
            // InternalMyTurtleDsl.g:844:4: rule__AR__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AR__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getARAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAR"


    // $ANTLR start "entryRuleParallele2"
    // InternalMyTurtleDsl.g:853:1: entryRuleParallele2 : ruleParallele2 EOF ;
    public final void entryRuleParallele2() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:854:1: ( ruleParallele2 EOF )
            // InternalMyTurtleDsl.g:855:1: ruleParallele2 EOF
            {
             before(grammarAccess.getParallele2Rule()); 
            pushFollow(FOLLOW_1);
            ruleParallele2();

            state._fsp--;

             after(grammarAccess.getParallele2Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParallele2"


    // $ANTLR start "ruleParallele2"
    // InternalMyTurtleDsl.g:862:1: ruleParallele2 : ( ( rule__Parallele2__Alternatives ) ) ;
    public final void ruleParallele2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:866:2: ( ( ( rule__Parallele2__Alternatives ) ) )
            // InternalMyTurtleDsl.g:867:2: ( ( rule__Parallele2__Alternatives ) )
            {
            // InternalMyTurtleDsl.g:867:2: ( ( rule__Parallele2__Alternatives ) )
            // InternalMyTurtleDsl.g:868:3: ( rule__Parallele2__Alternatives )
            {
             before(grammarAccess.getParallele2Access().getAlternatives()); 
            // InternalMyTurtleDsl.g:869:3: ( rule__Parallele2__Alternatives )
            // InternalMyTurtleDsl.g:869:4: rule__Parallele2__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Parallele2__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParallele2Access().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParallele2"


    // $ANTLR start "entryRuleParallele3"
    // InternalMyTurtleDsl.g:878:1: entryRuleParallele3 : ruleParallele3 EOF ;
    public final void entryRuleParallele3() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:879:1: ( ruleParallele3 EOF )
            // InternalMyTurtleDsl.g:880:1: ruleParallele3 EOF
            {
             before(grammarAccess.getParallele3Rule()); 
            pushFollow(FOLLOW_1);
            ruleParallele3();

            state._fsp--;

             after(grammarAccess.getParallele3Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParallele3"


    // $ANTLR start "ruleParallele3"
    // InternalMyTurtleDsl.g:887:1: ruleParallele3 : ( ( rule__Parallele3__Alternatives ) ) ;
    public final void ruleParallele3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:891:2: ( ( ( rule__Parallele3__Alternatives ) ) )
            // InternalMyTurtleDsl.g:892:2: ( ( rule__Parallele3__Alternatives ) )
            {
            // InternalMyTurtleDsl.g:892:2: ( ( rule__Parallele3__Alternatives ) )
            // InternalMyTurtleDsl.g:893:3: ( rule__Parallele3__Alternatives )
            {
             before(grammarAccess.getParallele3Access().getAlternatives()); 
            // InternalMyTurtleDsl.g:894:3: ( rule__Parallele3__Alternatives )
            // InternalMyTurtleDsl.g:894:4: rule__Parallele3__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParallele3"


    // $ANTLR start "rule__Model__Alternatives_20"
    // InternalMyTurtleDsl.g:902:1: rule__Model__Alternatives_20 : ( ( ( rule__Model__SeconDecAssignment_20_0 ) ) | ( ( rule__Model__PourDecAssignment_20_1 ) ) | ( ( rule__Model__StatementsAssignment_20_2 ) ) | ( ( rule__Model__FonctionsAssignment_20_3 ) ) | ( ( rule__Model__ParalleleAssignment_20_4 ) ) );
    public final void rule__Model__Alternatives_20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:906:1: ( ( ( rule__Model__SeconDecAssignment_20_0 ) ) | ( ( rule__Model__PourDecAssignment_20_1 ) ) | ( ( rule__Model__StatementsAssignment_20_2 ) ) | ( ( rule__Model__FonctionsAssignment_20_3 ) ) | ( ( rule__Model__ParalleleAssignment_20_4 ) ) )
            int alt2=5;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalMyTurtleDsl.g:907:2: ( ( rule__Model__SeconDecAssignment_20_0 ) )
                    {
                    // InternalMyTurtleDsl.g:907:2: ( ( rule__Model__SeconDecAssignment_20_0 ) )
                    // InternalMyTurtleDsl.g:908:3: ( rule__Model__SeconDecAssignment_20_0 )
                    {
                     before(grammarAccess.getModelAccess().getSeconDecAssignment_20_0()); 
                    // InternalMyTurtleDsl.g:909:3: ( rule__Model__SeconDecAssignment_20_0 )
                    // InternalMyTurtleDsl.g:909:4: rule__Model__SeconDecAssignment_20_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__SeconDecAssignment_20_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getSeconDecAssignment_20_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyTurtleDsl.g:913:2: ( ( rule__Model__PourDecAssignment_20_1 ) )
                    {
                    // InternalMyTurtleDsl.g:913:2: ( ( rule__Model__PourDecAssignment_20_1 ) )
                    // InternalMyTurtleDsl.g:914:3: ( rule__Model__PourDecAssignment_20_1 )
                    {
                     before(grammarAccess.getModelAccess().getPourDecAssignment_20_1()); 
                    // InternalMyTurtleDsl.g:915:3: ( rule__Model__PourDecAssignment_20_1 )
                    // InternalMyTurtleDsl.g:915:4: rule__Model__PourDecAssignment_20_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__PourDecAssignment_20_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getPourDecAssignment_20_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyTurtleDsl.g:919:2: ( ( rule__Model__StatementsAssignment_20_2 ) )
                    {
                    // InternalMyTurtleDsl.g:919:2: ( ( rule__Model__StatementsAssignment_20_2 ) )
                    // InternalMyTurtleDsl.g:920:3: ( rule__Model__StatementsAssignment_20_2 )
                    {
                     before(grammarAccess.getModelAccess().getStatementsAssignment_20_2()); 
                    // InternalMyTurtleDsl.g:921:3: ( rule__Model__StatementsAssignment_20_2 )
                    // InternalMyTurtleDsl.g:921:4: rule__Model__StatementsAssignment_20_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__StatementsAssignment_20_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getStatementsAssignment_20_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyTurtleDsl.g:925:2: ( ( rule__Model__FonctionsAssignment_20_3 ) )
                    {
                    // InternalMyTurtleDsl.g:925:2: ( ( rule__Model__FonctionsAssignment_20_3 ) )
                    // InternalMyTurtleDsl.g:926:3: ( rule__Model__FonctionsAssignment_20_3 )
                    {
                     before(grammarAccess.getModelAccess().getFonctionsAssignment_20_3()); 
                    // InternalMyTurtleDsl.g:927:3: ( rule__Model__FonctionsAssignment_20_3 )
                    // InternalMyTurtleDsl.g:927:4: rule__Model__FonctionsAssignment_20_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__FonctionsAssignment_20_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getFonctionsAssignment_20_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyTurtleDsl.g:931:2: ( ( rule__Model__ParalleleAssignment_20_4 ) )
                    {
                    // InternalMyTurtleDsl.g:931:2: ( ( rule__Model__ParalleleAssignment_20_4 ) )
                    // InternalMyTurtleDsl.g:932:3: ( rule__Model__ParalleleAssignment_20_4 )
                    {
                     before(grammarAccess.getModelAccess().getParalleleAssignment_20_4()); 
                    // InternalMyTurtleDsl.g:933:3: ( rule__Model__ParalleleAssignment_20_4 )
                    // InternalMyTurtleDsl.g:933:4: rule__Model__ParalleleAssignment_20_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ParalleleAssignment_20_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getParalleleAssignment_20_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Alternatives_20"


    // $ANTLR start "rule__Model__ParalleleAlternatives_20_4_0"
    // InternalMyTurtleDsl.g:941:1: rule__Model__ParalleleAlternatives_20_4_0 : ( ( ruleParallele2 ) | ( ruleParallele3 ) );
    public final void rule__Model__ParalleleAlternatives_20_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:945:1: ( ( ruleParallele2 ) | ( ruleParallele3 ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalMyTurtleDsl.g:946:2: ( ruleParallele2 )
                    {
                    // InternalMyTurtleDsl.g:946:2: ( ruleParallele2 )
                    // InternalMyTurtleDsl.g:947:3: ruleParallele2
                    {
                     before(grammarAccess.getModelAccess().getParalleleParallele2ParserRuleCall_20_4_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleParallele2();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getParalleleParallele2ParserRuleCall_20_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyTurtleDsl.g:952:2: ( ruleParallele3 )
                    {
                    // InternalMyTurtleDsl.g:952:2: ( ruleParallele3 )
                    // InternalMyTurtleDsl.g:953:3: ruleParallele3
                    {
                     before(grammarAccess.getModelAccess().getParalleleParallele3ParserRuleCall_20_4_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleParallele3();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getParalleleParallele3ParserRuleCall_20_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ParalleleAlternatives_20_4_0"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalMyTurtleDsl.g:962:1: rule__Statement__Alternatives : ( ( ruleAvancer ) | ( ruleDescendre ) | ( ruleRotationDroite ) | ( ruleRotationGauche ) | ( rulePause ) | ( ruleDroite ) | ( ruleGauche ) | ( ruleReculer ) | ( ruleMonter ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:966:1: ( ( ruleAvancer ) | ( ruleDescendre ) | ( ruleRotationDroite ) | ( ruleRotationGauche ) | ( rulePause ) | ( ruleDroite ) | ( ruleGauche ) | ( ruleReculer ) | ( ruleMonter ) )
            int alt4=9;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalMyTurtleDsl.g:967:2: ( ruleAvancer )
                    {
                    // InternalMyTurtleDsl.g:967:2: ( ruleAvancer )
                    // InternalMyTurtleDsl.g:968:3: ruleAvancer
                    {
                     before(grammarAccess.getStatementAccess().getAvancerParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAvancer();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getAvancerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyTurtleDsl.g:973:2: ( ruleDescendre )
                    {
                    // InternalMyTurtleDsl.g:973:2: ( ruleDescendre )
                    // InternalMyTurtleDsl.g:974:3: ruleDescendre
                    {
                     before(grammarAccess.getStatementAccess().getDescendreParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDescendre();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getDescendreParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyTurtleDsl.g:979:2: ( ruleRotationDroite )
                    {
                    // InternalMyTurtleDsl.g:979:2: ( ruleRotationDroite )
                    // InternalMyTurtleDsl.g:980:3: ruleRotationDroite
                    {
                     before(grammarAccess.getStatementAccess().getRotationDroiteParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRotationDroite();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getRotationDroiteParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyTurtleDsl.g:985:2: ( ruleRotationGauche )
                    {
                    // InternalMyTurtleDsl.g:985:2: ( ruleRotationGauche )
                    // InternalMyTurtleDsl.g:986:3: ruleRotationGauche
                    {
                     before(grammarAccess.getStatementAccess().getRotationGaucheParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleRotationGauche();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getRotationGaucheParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyTurtleDsl.g:991:2: ( rulePause )
                    {
                    // InternalMyTurtleDsl.g:991:2: ( rulePause )
                    // InternalMyTurtleDsl.g:992:3: rulePause
                    {
                     before(grammarAccess.getStatementAccess().getPauseParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    rulePause();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getPauseParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyTurtleDsl.g:997:2: ( ruleDroite )
                    {
                    // InternalMyTurtleDsl.g:997:2: ( ruleDroite )
                    // InternalMyTurtleDsl.g:998:3: ruleDroite
                    {
                     before(grammarAccess.getStatementAccess().getDroiteParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleDroite();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getDroiteParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyTurtleDsl.g:1003:2: ( ruleGauche )
                    {
                    // InternalMyTurtleDsl.g:1003:2: ( ruleGauche )
                    // InternalMyTurtleDsl.g:1004:3: ruleGauche
                    {
                     before(grammarAccess.getStatementAccess().getGaucheParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleGauche();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getGaucheParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyTurtleDsl.g:1009:2: ( ruleReculer )
                    {
                    // InternalMyTurtleDsl.g:1009:2: ( ruleReculer )
                    // InternalMyTurtleDsl.g:1010:3: ruleReculer
                    {
                     before(grammarAccess.getStatementAccess().getReculerParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleReculer();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getReculerParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyTurtleDsl.g:1015:2: ( ruleMonter )
                    {
                    // InternalMyTurtleDsl.g:1015:2: ( ruleMonter )
                    // InternalMyTurtleDsl.g:1016:3: ruleMonter
                    {
                     before(grammarAccess.getStatementAccess().getMonterParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleMonter();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getMonterParserRuleCall_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__IntExp__Alternatives"
    // InternalMyTurtleDsl.g:1025:1: rule__IntExp__Alternatives : ( ( ruleIntConstante ) | ( ruleRefIntVar ) );
    public final void rule__IntExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1029:1: ( ( ruleIntConstante ) | ( ruleRefIntVar ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
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
                    // InternalMyTurtleDsl.g:1030:2: ( ruleIntConstante )
                    {
                    // InternalMyTurtleDsl.g:1030:2: ( ruleIntConstante )
                    // InternalMyTurtleDsl.g:1031:3: ruleIntConstante
                    {
                     before(grammarAccess.getIntExpAccess().getIntConstanteParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntConstante();

                    state._fsp--;

                     after(grammarAccess.getIntExpAccess().getIntConstanteParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyTurtleDsl.g:1036:2: ( ruleRefIntVar )
                    {
                    // InternalMyTurtleDsl.g:1036:2: ( ruleRefIntVar )
                    // InternalMyTurtleDsl.g:1037:3: ruleRefIntVar
                    {
                     before(grammarAccess.getIntExpAccess().getRefIntVarParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRefIntVar();

                    state._fsp--;

                     after(grammarAccess.getIntExpAccess().getRefIntVarParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntExp__Alternatives"


    // $ANTLR start "rule__MD__Alternatives"
    // InternalMyTurtleDsl.g:1046:1: rule__MD__Alternatives : ( ( ruleMonter ) | ( ruleDescendre ) );
    public final void rule__MD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1050:1: ( ( ruleMonter ) | ( ruleDescendre ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==30) ) {
                alt6=1;
            }
            else if ( (LA6_0==32) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyTurtleDsl.g:1051:2: ( ruleMonter )
                    {
                    // InternalMyTurtleDsl.g:1051:2: ( ruleMonter )
                    // InternalMyTurtleDsl.g:1052:3: ruleMonter
                    {
                     before(grammarAccess.getMDAccess().getMonterParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMonter();

                    state._fsp--;

                     after(grammarAccess.getMDAccess().getMonterParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyTurtleDsl.g:1057:2: ( ruleDescendre )
                    {
                    // InternalMyTurtleDsl.g:1057:2: ( ruleDescendre )
                    // InternalMyTurtleDsl.g:1058:3: ruleDescendre
                    {
                     before(grammarAccess.getMDAccess().getDescendreParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDescendre();

                    state._fsp--;

                     after(grammarAccess.getMDAccess().getDescendreParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MD__Alternatives"


    // $ANTLR start "rule__GDr__Alternatives"
    // InternalMyTurtleDsl.g:1067:1: rule__GDr__Alternatives : ( ( ruleGauche ) | ( ruleDroite ) );
    public final void rule__GDr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1071:1: ( ( ruleGauche ) | ( ruleDroite ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==35) ) {
                alt7=1;
            }
            else if ( (LA7_0==36) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyTurtleDsl.g:1072:2: ( ruleGauche )
                    {
                    // InternalMyTurtleDsl.g:1072:2: ( ruleGauche )
                    // InternalMyTurtleDsl.g:1073:3: ruleGauche
                    {
                     before(grammarAccess.getGDrAccess().getGaucheParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGauche();

                    state._fsp--;

                     after(grammarAccess.getGDrAccess().getGaucheParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyTurtleDsl.g:1078:2: ( ruleDroite )
                    {
                    // InternalMyTurtleDsl.g:1078:2: ( ruleDroite )
                    // InternalMyTurtleDsl.g:1079:3: ruleDroite
                    {
                     before(grammarAccess.getGDrAccess().getDroiteParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDroite();

                    state._fsp--;

                     after(grammarAccess.getGDrAccess().getDroiteParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GDr__Alternatives"


    // $ANTLR start "rule__RGRD__Alternatives"
    // InternalMyTurtleDsl.g:1088:1: rule__RGRD__Alternatives : ( ( ruleRotationGauche ) | ( ruleRotationDroite ) );
    public final void rule__RGRD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1092:1: ( ( ruleRotationGauche ) | ( ruleRotationDroite ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==37) ) {
                alt8=1;
            }
            else if ( (LA8_0==38) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyTurtleDsl.g:1093:2: ( ruleRotationGauche )
                    {
                    // InternalMyTurtleDsl.g:1093:2: ( ruleRotationGauche )
                    // InternalMyTurtleDsl.g:1094:3: ruleRotationGauche
                    {
                     before(grammarAccess.getRGRDAccess().getRotationGaucheParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRotationGauche();

                    state._fsp--;

                     after(grammarAccess.getRGRDAccess().getRotationGaucheParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyTurtleDsl.g:1099:2: ( ruleRotationDroite )
                    {
                    // InternalMyTurtleDsl.g:1099:2: ( ruleRotationDroite )
                    // InternalMyTurtleDsl.g:1100:3: ruleRotationDroite
                    {
                     before(grammarAccess.getRGRDAccess().getRotationDroiteParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRotationDroite();

                    state._fsp--;

                     after(grammarAccess.getRGRDAccess().getRotationDroiteParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RGRD__Alternatives"


    // $ANTLR start "rule__AR__Alternatives"
    // InternalMyTurtleDsl.g:1109:1: rule__AR__Alternatives : ( ( ruleAvancer ) | ( ruleReculer ) );
    public final void rule__AR__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1113:1: ( ( ruleAvancer ) | ( ruleReculer ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==33) ) {
                alt9=1;
            }
            else if ( (LA9_0==34) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyTurtleDsl.g:1114:2: ( ruleAvancer )
                    {
                    // InternalMyTurtleDsl.g:1114:2: ( ruleAvancer )
                    // InternalMyTurtleDsl.g:1115:3: ruleAvancer
                    {
                     before(grammarAccess.getARAccess().getAvancerParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAvancer();

                    state._fsp--;

                     after(grammarAccess.getARAccess().getAvancerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyTurtleDsl.g:1120:2: ( ruleReculer )
                    {
                    // InternalMyTurtleDsl.g:1120:2: ( ruleReculer )
                    // InternalMyTurtleDsl.g:1121:3: ruleReculer
                    {
                     before(grammarAccess.getARAccess().getReculerParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleReculer();

                    state._fsp--;

                     after(grammarAccess.getARAccess().getReculerParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AR__Alternatives"


    // $ANTLR start "rule__Parallele2__Alternatives"
    // InternalMyTurtleDsl.g:1130:1: rule__Parallele2__Alternatives : ( ( ( rule__Parallele2__Group_0__0 ) ) | ( ( rule__Parallele2__Group_1__0 ) ) | ( ( rule__Parallele2__Group_2__0 ) ) | ( ( rule__Parallele2__Group_3__0 ) ) | ( ( rule__Parallele2__Group_4__0 ) ) | ( ( rule__Parallele2__Group_5__0 ) ) | ( ( rule__Parallele2__Group_6__0 ) ) | ( ( rule__Parallele2__Group_7__0 ) ) | ( ( rule__Parallele2__Group_8__0 ) ) | ( ( rule__Parallele2__Group_9__0 ) ) | ( ( rule__Parallele2__Group_10__0 ) ) | ( ( rule__Parallele2__Group_11__0 ) ) );
    public final void rule__Parallele2__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1134:1: ( ( ( rule__Parallele2__Group_0__0 ) ) | ( ( rule__Parallele2__Group_1__0 ) ) | ( ( rule__Parallele2__Group_2__0 ) ) | ( ( rule__Parallele2__Group_3__0 ) ) | ( ( rule__Parallele2__Group_4__0 ) ) | ( ( rule__Parallele2__Group_5__0 ) ) | ( ( rule__Parallele2__Group_6__0 ) ) | ( ( rule__Parallele2__Group_7__0 ) ) | ( ( rule__Parallele2__Group_8__0 ) ) | ( ( rule__Parallele2__Group_9__0 ) ) | ( ( rule__Parallele2__Group_10__0 ) ) | ( ( rule__Parallele2__Group_11__0 ) ) )
            int alt10=12;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalMyTurtleDsl.g:1135:2: ( ( rule__Parallele2__Group_0__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1135:2: ( ( rule__Parallele2__Group_0__0 ) )
                    // InternalMyTurtleDsl.g:1136:3: ( rule__Parallele2__Group_0__0 )
                    {
                     before(grammarAccess.getParallele2Access().getGroup_0()); 
                    // InternalMyTurtleDsl.g:1137:3: ( rule__Parallele2__Group_0__0 )
                    // InternalMyTurtleDsl.g:1137:4: rule__Parallele2__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parallele2__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParallele2Access().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyTurtleDsl.g:1141:2: ( ( rule__Parallele2__Group_1__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1141:2: ( ( rule__Parallele2__Group_1__0 ) )
                    // InternalMyTurtleDsl.g:1142:3: ( rule__Parallele2__Group_1__0 )
                    {
                     before(grammarAccess.getParallele2Access().getGroup_1()); 
                    // InternalMyTurtleDsl.g:1143:3: ( rule__Parallele2__Group_1__0 )
                    // InternalMyTurtleDsl.g:1143:4: rule__Parallele2__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parallele2__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParallele2Access().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyTurtleDsl.g:1147:2: ( ( rule__Parallele2__Group_2__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1147:2: ( ( rule__Parallele2__Group_2__0 ) )
                    // InternalMyTurtleDsl.g:1148:3: ( rule__Parallele2__Group_2__0 )
                    {
                     before(grammarAccess.getParallele2Access().getGroup_2()); 
                    // InternalMyTurtleDsl.g:1149:3: ( rule__Parallele2__Group_2__0 )
                    // InternalMyTurtleDsl.g:1149:4: rule__Parallele2__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parallele2__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParallele2Access().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyTurtleDsl.g:1153:2: ( ( rule__Parallele2__Group_3__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1153:2: ( ( rule__Parallele2__Group_3__0 ) )
                    // InternalMyTurtleDsl.g:1154:3: ( rule__Parallele2__Group_3__0 )
                    {
                     before(grammarAccess.getParallele2Access().getGroup_3()); 
                    // InternalMyTurtleDsl.g:1155:3: ( rule__Parallele2__Group_3__0 )
                    // InternalMyTurtleDsl.g:1155:4: rule__Parallele2__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parallele2__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParallele2Access().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyTurtleDsl.g:1159:2: ( ( rule__Parallele2__Group_4__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1159:2: ( ( rule__Parallele2__Group_4__0 ) )
                    // InternalMyTurtleDsl.g:1160:3: ( rule__Parallele2__Group_4__0 )
                    {
                     before(grammarAccess.getParallele2Access().getGroup_4()); 
                    // InternalMyTurtleDsl.g:1161:3: ( rule__Parallele2__Group_4__0 )
                    // InternalMyTurtleDsl.g:1161:4: rule__Parallele2__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parallele2__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParallele2Access().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyTurtleDsl.g:1165:2: ( ( rule__Parallele2__Group_5__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1165:2: ( ( rule__Parallele2__Group_5__0 ) )
                    // InternalMyTurtleDsl.g:1166:3: ( rule__Parallele2__Group_5__0 )
                    {
                     before(grammarAccess.getParallele2Access().getGroup_5()); 
                    // InternalMyTurtleDsl.g:1167:3: ( rule__Parallele2__Group_5__0 )
                    // InternalMyTurtleDsl.g:1167:4: rule__Parallele2__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parallele2__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParallele2Access().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyTurtleDsl.g:1171:2: ( ( rule__Parallele2__Group_6__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1171:2: ( ( rule__Parallele2__Group_6__0 ) )
                    // InternalMyTurtleDsl.g:1172:3: ( rule__Parallele2__Group_6__0 )
                    {
                     before(grammarAccess.getParallele2Access().getGroup_6()); 
                    // InternalMyTurtleDsl.g:1173:3: ( rule__Parallele2__Group_6__0 )
                    // InternalMyTurtleDsl.g:1173:4: rule__Parallele2__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parallele2__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParallele2Access().getGroup_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyTurtleDsl.g:1177:2: ( ( rule__Parallele2__Group_7__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1177:2: ( ( rule__Parallele2__Group_7__0 ) )
                    // InternalMyTurtleDsl.g:1178:3: ( rule__Parallele2__Group_7__0 )
                    {
                     before(grammarAccess.getParallele2Access().getGroup_7()); 
                    // InternalMyTurtleDsl.g:1179:3: ( rule__Parallele2__Group_7__0 )
                    // InternalMyTurtleDsl.g:1179:4: rule__Parallele2__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parallele2__Group_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParallele2Access().getGroup_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyTurtleDsl.g:1183:2: ( ( rule__Parallele2__Group_8__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1183:2: ( ( rule__Parallele2__Group_8__0 ) )
                    // InternalMyTurtleDsl.g:1184:3: ( rule__Parallele2__Group_8__0 )
                    {
                     before(grammarAccess.getParallele2Access().getGroup_8()); 
                    // InternalMyTurtleDsl.g:1185:3: ( rule__Parallele2__Group_8__0 )
                    // InternalMyTurtleDsl.g:1185:4: rule__Parallele2__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parallele2__Group_8__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParallele2Access().getGroup_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyTurtleDsl.g:1189:2: ( ( rule__Parallele2__Group_9__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1189:2: ( ( rule__Parallele2__Group_9__0 ) )
                    // InternalMyTurtleDsl.g:1190:3: ( rule__Parallele2__Group_9__0 )
                    {
                     before(grammarAccess.getParallele2Access().getGroup_9()); 
                    // InternalMyTurtleDsl.g:1191:3: ( rule__Parallele2__Group_9__0 )
                    // InternalMyTurtleDsl.g:1191:4: rule__Parallele2__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parallele2__Group_9__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParallele2Access().getGroup_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMyTurtleDsl.g:1195:2: ( ( rule__Parallele2__Group_10__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1195:2: ( ( rule__Parallele2__Group_10__0 ) )
                    // InternalMyTurtleDsl.g:1196:3: ( rule__Parallele2__Group_10__0 )
                    {
                     before(grammarAccess.getParallele2Access().getGroup_10()); 
                    // InternalMyTurtleDsl.g:1197:3: ( rule__Parallele2__Group_10__0 )
                    // InternalMyTurtleDsl.g:1197:4: rule__Parallele2__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parallele2__Group_10__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParallele2Access().getGroup_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalMyTurtleDsl.g:1201:2: ( ( rule__Parallele2__Group_11__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1201:2: ( ( rule__Parallele2__Group_11__0 ) )
                    // InternalMyTurtleDsl.g:1202:3: ( rule__Parallele2__Group_11__0 )
                    {
                     before(grammarAccess.getParallele2Access().getGroup_11()); 
                    // InternalMyTurtleDsl.g:1203:3: ( rule__Parallele2__Group_11__0 )
                    // InternalMyTurtleDsl.g:1203:4: rule__Parallele2__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parallele2__Group_11__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParallele2Access().getGroup_11()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Alternatives"


    // $ANTLR start "rule__Parallele3__Alternatives"
    // InternalMyTurtleDsl.g:1211:1: rule__Parallele3__Alternatives : ( ( ( rule__Parallele3__Group_0__0 ) ) | ( ( rule__Parallele3__Group_1__0 ) ) | ( ( rule__Parallele3__Group_2__0 ) ) | ( ( rule__Parallele3__Group_3__0 ) ) | ( ( rule__Parallele3__Group_4__0 ) ) | ( ( rule__Parallele3__Group_5__0 ) ) | ( ( rule__Parallele3__Group_6__0 ) ) | ( ( rule__Parallele3__Group_7__0 ) ) | ( ( rule__Parallele3__Group_8__0 ) ) | ( ( rule__Parallele3__Group_9__0 ) ) | ( ( rule__Parallele3__Group_10__0 ) ) | ( ( rule__Parallele3__Group_11__0 ) ) | ( ( rule__Parallele3__Group_12__0 ) ) | ( ( rule__Parallele3__Group_13__0 ) ) | ( ( rule__Parallele3__Group_14__0 ) ) | ( ( rule__Parallele3__Group_15__0 ) ) | ( ( rule__Parallele3__Group_16__0 ) ) | ( ( rule__Parallele3__Group_17__0 ) ) | ( ( rule__Parallele3__Group_18__0 ) ) | ( ( rule__Parallele3__Group_19__0 ) ) | ( ( rule__Parallele3__Group_20__0 ) ) | ( ( rule__Parallele3__Group_21__0 ) ) | ( ( rule__Parallele3__Group_22__0 ) ) | ( ( rule__Parallele3__Group_23__0 ) ) );
    public final void rule__Parallele3__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1215:1: ( ( ( rule__Parallele3__Group_0__0 ) ) | ( ( rule__Parallele3__Group_1__0 ) ) | ( ( rule__Parallele3__Group_2__0 ) ) | ( ( rule__Parallele3__Group_3__0 ) ) | ( ( rule__Parallele3__Group_4__0 ) ) | ( ( rule__Parallele3__Group_5__0 ) ) | ( ( rule__Parallele3__Group_6__0 ) ) | ( ( rule__Parallele3__Group_7__0 ) ) | ( ( rule__Parallele3__Group_8__0 ) ) | ( ( rule__Parallele3__Group_9__0 ) ) | ( ( rule__Parallele3__Group_10__0 ) ) | ( ( rule__Parallele3__Group_11__0 ) ) | ( ( rule__Parallele3__Group_12__0 ) ) | ( ( rule__Parallele3__Group_13__0 ) ) | ( ( rule__Parallele3__Group_14__0 ) ) | ( ( rule__Parallele3__Group_15__0 ) ) | ( ( rule__Parallele3__Group_16__0 ) ) | ( ( rule__Parallele3__Group_17__0 ) ) | ( ( rule__Parallele3__Group_18__0 ) ) | ( ( rule__Parallele3__Group_19__0 ) ) | ( ( rule__Parallele3__Group_20__0 ) ) | ( ( rule__Parallele3__Group_21__0 ) ) | ( ( rule__Parallele3__Group_22__0 ) ) | ( ( rule__Parallele3__Group_23__0 ) ) )
            int alt11=24;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalMyTurtleDsl.g:1216:2: ( ( rule__Parallele3__Group_0__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1216:2: ( ( rule__Parallele3__Group_0__0 ) )
                    // InternalMyTurtleDsl.g:1217:3: ( rule__Parallele3__Group_0__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_0()); 
                    // InternalMyTurtleDsl.g:1218:3: ( rule__Parallele3__Group_0__0 )
                    // InternalMyTurtleDsl.g:1218:4: rule__Parallele3__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parallele3__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParallele3Access().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyTurtleDsl.g:1222:2: ( ( rule__Parallele3__Group_1__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1222:2: ( ( rule__Parallele3__Group_1__0 ) )
                    // InternalMyTurtleDsl.g:1223:3: ( rule__Parallele3__Group_1__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_1()); 
                    // InternalMyTurtleDsl.g:1224:3: ( rule__Parallele3__Group_1__0 )
                    // InternalMyTurtleDsl.g:1224:4: rule__Parallele3__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parallele3__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParallele3Access().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyTurtleDsl.g:1228:2: ( ( rule__Parallele3__Group_2__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1228:2: ( ( rule__Parallele3__Group_2__0 ) )
                    // InternalMyTurtleDsl.g:1229:3: ( rule__Parallele3__Group_2__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_2()); 
                    // InternalMyTurtleDsl.g:1230:3: ( rule__Parallele3__Group_2__0 )
                    // InternalMyTurtleDsl.g:1230:4: rule__Parallele3__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parallele3__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParallele3Access().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyTurtleDsl.g:1234:2: ( ( rule__Parallele3__Group_3__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1234:2: ( ( rule__Parallele3__Group_3__0 ) )
                    // InternalMyTurtleDsl.g:1235:3: ( rule__Parallele3__Group_3__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_3()); 
                    // InternalMyTurtleDsl.g:1236:3: ( rule__Parallele3__Group_3__0 )
                    // InternalMyTurtleDsl.g:1236:4: rule__Parallele3__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parallele3__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParallele3Access().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyTurtleDsl.g:1240:2: ( ( rule__Parallele3__Group_4__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1240:2: ( ( rule__Parallele3__Group_4__0 ) )
                    // InternalMyTurtleDsl.g:1241:3: ( rule__Parallele3__Group_4__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_4()); 
                    // InternalMyTurtleDsl.g:1242:3: ( rule__Parallele3__Group_4__0 )
                    // InternalMyTurtleDsl.g:1242:4: rule__Parallele3__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parallele3__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParallele3Access().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyTurtleDsl.g:1246:2: ( ( rule__Parallele3__Group_5__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1246:2: ( ( rule__Parallele3__Group_5__0 ) )
                    // InternalMyTurtleDsl.g:1247:3: ( rule__Parallele3__Group_5__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_5()); 
                    // InternalMyTurtleDsl.g:1248:3: ( rule__Parallele3__Group_5__0 )
                    // InternalMyTurtleDsl.g:1248:4: rule__Parallele3__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parallele3__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParallele3Access().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyTurtleDsl.g:1252:2: ( ( rule__Parallele3__Group_6__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1252:2: ( ( rule__Parallele3__Group_6__0 ) )
                    // InternalMyTurtleDsl.g:1253:3: ( rule__Parallele3__Group_6__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_6()); 
                    // InternalMyTurtleDsl.g:1254:3: ( rule__Parallele3__Group_6__0 )
                    // InternalMyTurtleDsl.g:1254:4: rule__Parallele3__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parallele3__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParallele3Access().getGroup_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyTurtleDsl.g:1258:2: ( ( rule__Parallele3__Group_7__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1258:2: ( ( rule__Parallele3__Group_7__0 ) )
                    // InternalMyTurtleDsl.g:1259:3: ( rule__Parallele3__Group_7__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_7()); 
                    // InternalMyTurtleDsl.g:1260:3: ( rule__Parallele3__Group_7__0 )
                    // InternalMyTurtleDsl.g:1260:4: rule__Parallele3__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parallele3__Group_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParallele3Access().getGroup_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyTurtleDsl.g:1264:2: ( ( rule__Parallele3__Group_8__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1264:2: ( ( rule__Parallele3__Group_8__0 ) )
                    // InternalMyTurtleDsl.g:1265:3: ( rule__Parallele3__Group_8__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_8()); 
                    // InternalMyTurtleDsl.g:1266:3: ( rule__Parallele3__Group_8__0 )
                    // InternalMyTurtleDsl.g:1266:4: rule__Parallele3__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parallele3__Group_8__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParallele3Access().getGroup_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyTurtleDsl.g:1270:2: ( ( rule__Parallele3__Group_9__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1270:2: ( ( rule__Parallele3__Group_9__0 ) )
                    // InternalMyTurtleDsl.g:1271:3: ( rule__Parallele3__Group_9__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_9()); 
                    // InternalMyTurtleDsl.g:1272:3: ( rule__Parallele3__Group_9__0 )
                    // InternalMyTurtleDsl.g:1272:4: rule__Parallele3__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parallele3__Group_9__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParallele3Access().getGroup_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMyTurtleDsl.g:1276:2: ( ( rule__Parallele3__Group_10__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1276:2: ( ( rule__Parallele3__Group_10__0 ) )
                    // InternalMyTurtleDsl.g:1277:3: ( rule__Parallele3__Group_10__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_10()); 
                    // InternalMyTurtleDsl.g:1278:3: ( rule__Parallele3__Group_10__0 )
                    // InternalMyTurtleDsl.g:1278:4: rule__Parallele3__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parallele3__Group_10__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParallele3Access().getGroup_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalMyTurtleDsl.g:1282:2: ( ( rule__Parallele3__Group_11__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1282:2: ( ( rule__Parallele3__Group_11__0 ) )
                    // InternalMyTurtleDsl.g:1283:3: ( rule__Parallele3__Group_11__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_11()); 
                    // InternalMyTurtleDsl.g:1284:3: ( rule__Parallele3__Group_11__0 )
                    // InternalMyTurtleDsl.g:1284:4: rule__Parallele3__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parallele3__Group_11__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParallele3Access().getGroup_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalMyTurtleDsl.g:1288:2: ( ( rule__Parallele3__Group_12__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1288:2: ( ( rule__Parallele3__Group_12__0 ) )
                    // InternalMyTurtleDsl.g:1289:3: ( rule__Parallele3__Group_12__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_12()); 
                    // InternalMyTurtleDsl.g:1290:3: ( rule__Parallele3__Group_12__0 )
                    // InternalMyTurtleDsl.g:1290:4: rule__Parallele3__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parallele3__Group_12__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParallele3Access().getGroup_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalMyTurtleDsl.g:1294:2: ( ( rule__Parallele3__Group_13__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1294:2: ( ( rule__Parallele3__Group_13__0 ) )
                    // InternalMyTurtleDsl.g:1295:3: ( rule__Parallele3__Group_13__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_13()); 
                    // InternalMyTurtleDsl.g:1296:3: ( rule__Parallele3__Group_13__0 )
                    // InternalMyTurtleDsl.g:1296:4: rule__Parallele3__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parallele3__Group_13__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParallele3Access().getGroup_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalMyTurtleDsl.g:1300:2: ( ( rule__Parallele3__Group_14__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1300:2: ( ( rule__Parallele3__Group_14__0 ) )
                    // InternalMyTurtleDsl.g:1301:3: ( rule__Parallele3__Group_14__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_14()); 
                    // InternalMyTurtleDsl.g:1302:3: ( rule__Parallele3__Group_14__0 )
                    // InternalMyTurtleDsl.g:1302:4: rule__Parallele3__Group_14__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parallele3__Group_14__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParallele3Access().getGroup_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalMyTurtleDsl.g:1306:2: ( ( rule__Parallele3__Group_15__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1306:2: ( ( rule__Parallele3__Group_15__0 ) )
                    // InternalMyTurtleDsl.g:1307:3: ( rule__Parallele3__Group_15__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_15()); 
                    // InternalMyTurtleDsl.g:1308:3: ( rule__Parallele3__Group_15__0 )
                    // InternalMyTurtleDsl.g:1308:4: rule__Parallele3__Group_15__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parallele3__Group_15__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParallele3Access().getGroup_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalMyTurtleDsl.g:1312:2: ( ( rule__Parallele3__Group_16__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1312:2: ( ( rule__Parallele3__Group_16__0 ) )
                    // InternalMyTurtleDsl.g:1313:3: ( rule__Parallele3__Group_16__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_16()); 
                    // InternalMyTurtleDsl.g:1314:3: ( rule__Parallele3__Group_16__0 )
                    // InternalMyTurtleDsl.g:1314:4: rule__Parallele3__Group_16__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parallele3__Group_16__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParallele3Access().getGroup_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalMyTurtleDsl.g:1318:2: ( ( rule__Parallele3__Group_17__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1318:2: ( ( rule__Parallele3__Group_17__0 ) )
                    // InternalMyTurtleDsl.g:1319:3: ( rule__Parallele3__Group_17__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_17()); 
                    // InternalMyTurtleDsl.g:1320:3: ( rule__Parallele3__Group_17__0 )
                    // InternalMyTurtleDsl.g:1320:4: rule__Parallele3__Group_17__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parallele3__Group_17__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParallele3Access().getGroup_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalMyTurtleDsl.g:1324:2: ( ( rule__Parallele3__Group_18__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1324:2: ( ( rule__Parallele3__Group_18__0 ) )
                    // InternalMyTurtleDsl.g:1325:3: ( rule__Parallele3__Group_18__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_18()); 
                    // InternalMyTurtleDsl.g:1326:3: ( rule__Parallele3__Group_18__0 )
                    // InternalMyTurtleDsl.g:1326:4: rule__Parallele3__Group_18__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parallele3__Group_18__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParallele3Access().getGroup_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalMyTurtleDsl.g:1330:2: ( ( rule__Parallele3__Group_19__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1330:2: ( ( rule__Parallele3__Group_19__0 ) )
                    // InternalMyTurtleDsl.g:1331:3: ( rule__Parallele3__Group_19__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_19()); 
                    // InternalMyTurtleDsl.g:1332:3: ( rule__Parallele3__Group_19__0 )
                    // InternalMyTurtleDsl.g:1332:4: rule__Parallele3__Group_19__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parallele3__Group_19__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParallele3Access().getGroup_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalMyTurtleDsl.g:1336:2: ( ( rule__Parallele3__Group_20__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1336:2: ( ( rule__Parallele3__Group_20__0 ) )
                    // InternalMyTurtleDsl.g:1337:3: ( rule__Parallele3__Group_20__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_20()); 
                    // InternalMyTurtleDsl.g:1338:3: ( rule__Parallele3__Group_20__0 )
                    // InternalMyTurtleDsl.g:1338:4: rule__Parallele3__Group_20__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parallele3__Group_20__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParallele3Access().getGroup_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalMyTurtleDsl.g:1342:2: ( ( rule__Parallele3__Group_21__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1342:2: ( ( rule__Parallele3__Group_21__0 ) )
                    // InternalMyTurtleDsl.g:1343:3: ( rule__Parallele3__Group_21__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_21()); 
                    // InternalMyTurtleDsl.g:1344:3: ( rule__Parallele3__Group_21__0 )
                    // InternalMyTurtleDsl.g:1344:4: rule__Parallele3__Group_21__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parallele3__Group_21__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParallele3Access().getGroup_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalMyTurtleDsl.g:1348:2: ( ( rule__Parallele3__Group_22__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1348:2: ( ( rule__Parallele3__Group_22__0 ) )
                    // InternalMyTurtleDsl.g:1349:3: ( rule__Parallele3__Group_22__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_22()); 
                    // InternalMyTurtleDsl.g:1350:3: ( rule__Parallele3__Group_22__0 )
                    // InternalMyTurtleDsl.g:1350:4: rule__Parallele3__Group_22__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parallele3__Group_22__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParallele3Access().getGroup_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalMyTurtleDsl.g:1354:2: ( ( rule__Parallele3__Group_23__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1354:2: ( ( rule__Parallele3__Group_23__0 ) )
                    // InternalMyTurtleDsl.g:1355:3: ( rule__Parallele3__Group_23__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_23()); 
                    // InternalMyTurtleDsl.g:1356:3: ( rule__Parallele3__Group_23__0 )
                    // InternalMyTurtleDsl.g:1356:4: rule__Parallele3__Group_23__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parallele3__Group_23__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParallele3Access().getGroup_23()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalMyTurtleDsl.g:1364:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1368:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMyTurtleDsl.g:1369:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalMyTurtleDsl.g:1376:1: rule__Model__Group__0__Impl : ( ( rule__Model__IncludesAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1380:1: ( ( ( rule__Model__IncludesAssignment_0 )* ) )
            // InternalMyTurtleDsl.g:1381:1: ( ( rule__Model__IncludesAssignment_0 )* )
            {
            // InternalMyTurtleDsl.g:1381:1: ( ( rule__Model__IncludesAssignment_0 )* )
            // InternalMyTurtleDsl.g:1382:2: ( rule__Model__IncludesAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getIncludesAssignment_0()); 
            // InternalMyTurtleDsl.g:1383:2: ( rule__Model__IncludesAssignment_0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:1383:3: rule__Model__IncludesAssignment_0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__IncludesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getIncludesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalMyTurtleDsl.g:1391:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1395:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalMyTurtleDsl.g:1396:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalMyTurtleDsl.g:1403:1: rule__Model__Group__1__Impl : ( ( '\\n' )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1407:1: ( ( ( '\\n' )* ) )
            // InternalMyTurtleDsl.g:1408:1: ( ( '\\n' )* )
            {
            // InternalMyTurtleDsl.g:1408:1: ( ( '\\n' )* )
            // InternalMyTurtleDsl.g:1409:2: ( '\\n' )*
            {
             before(grammarAccess.getModelAccess().getLineFeedKeyword_1()); 
            // InternalMyTurtleDsl.g:1410:2: ( '\\n' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==12) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:1410:3: '\\n'
            	    {
            	    match(input,12,FOLLOW_6); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getLineFeedKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalMyTurtleDsl.g:1418:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1422:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalMyTurtleDsl.g:1423:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalMyTurtleDsl.g:1430:1: rule__Model__Group__2__Impl : ( 'func' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1434:1: ( ( 'func' ) )
            // InternalMyTurtleDsl.g:1435:1: ( 'func' )
            {
            // InternalMyTurtleDsl.g:1435:1: ( 'func' )
            // InternalMyTurtleDsl.g:1436:2: 'func'
            {
             before(grammarAccess.getModelAccess().getFuncKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFuncKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalMyTurtleDsl.g:1445:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1449:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalMyTurtleDsl.g:1450:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalMyTurtleDsl.g:1457:1: rule__Model__Group__3__Impl : ( 'main' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1461:1: ( ( 'main' ) )
            // InternalMyTurtleDsl.g:1462:1: ( 'main' )
            {
            // InternalMyTurtleDsl.g:1462:1: ( 'main' )
            // InternalMyTurtleDsl.g:1463:2: 'main'
            {
             before(grammarAccess.getModelAccess().getMainKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getMainKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalMyTurtleDsl.g:1472:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1476:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalMyTurtleDsl.g:1477:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalMyTurtleDsl.g:1484:1: rule__Model__Group__4__Impl : ( '{' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1488:1: ( ( '{' ) )
            // InternalMyTurtleDsl.g:1489:1: ( '{' )
            {
            // InternalMyTurtleDsl.g:1489:1: ( '{' )
            // InternalMyTurtleDsl.g:1490:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // InternalMyTurtleDsl.g:1499:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1503:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalMyTurtleDsl.g:1504:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // InternalMyTurtleDsl.g:1511:1: rule__Model__Group__5__Impl : ( 'prologue' ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1515:1: ( ( 'prologue' ) )
            // InternalMyTurtleDsl.g:1516:1: ( 'prologue' )
            {
            // InternalMyTurtleDsl.g:1516:1: ( 'prologue' )
            // InternalMyTurtleDsl.g:1517:2: 'prologue'
            {
             before(grammarAccess.getModelAccess().getPrologueKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getPrologueKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group__6"
    // InternalMyTurtleDsl.g:1526:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1530:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // InternalMyTurtleDsl.g:1531:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Model__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6"


    // $ANTLR start "rule__Model__Group__6__Impl"
    // InternalMyTurtleDsl.g:1538:1: rule__Model__Group__6__Impl : ( '{' ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1542:1: ( ( '{' ) )
            // InternalMyTurtleDsl.g:1543:1: ( '{' )
            {
            // InternalMyTurtleDsl.g:1543:1: ( '{' )
            // InternalMyTurtleDsl.g:1544:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6__Impl"


    // $ANTLR start "rule__Model__Group__7"
    // InternalMyTurtleDsl.g:1553:1: rule__Model__Group__7 : rule__Model__Group__7__Impl rule__Model__Group__8 ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1557:1: ( rule__Model__Group__7__Impl rule__Model__Group__8 )
            // InternalMyTurtleDsl.g:1558:2: rule__Model__Group__7__Impl rule__Model__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__Model__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__7"


    // $ANTLR start "rule__Model__Group__7__Impl"
    // InternalMyTurtleDsl.g:1565:1: rule__Model__Group__7__Impl : ( ( rule__Model__PvhmAssignment_7 ) ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1569:1: ( ( ( rule__Model__PvhmAssignment_7 ) ) )
            // InternalMyTurtleDsl.g:1570:1: ( ( rule__Model__PvhmAssignment_7 ) )
            {
            // InternalMyTurtleDsl.g:1570:1: ( ( rule__Model__PvhmAssignment_7 ) )
            // InternalMyTurtleDsl.g:1571:2: ( rule__Model__PvhmAssignment_7 )
            {
             before(grammarAccess.getModelAccess().getPvhmAssignment_7()); 
            // InternalMyTurtleDsl.g:1572:2: ( rule__Model__PvhmAssignment_7 )
            // InternalMyTurtleDsl.g:1572:3: rule__Model__PvhmAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Model__PvhmAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPvhmAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__7__Impl"


    // $ANTLR start "rule__Model__Group__8"
    // InternalMyTurtleDsl.g:1580:1: rule__Model__Group__8 : rule__Model__Group__8__Impl rule__Model__Group__9 ;
    public final void rule__Model__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1584:1: ( rule__Model__Group__8__Impl rule__Model__Group__9 )
            // InternalMyTurtleDsl.g:1585:2: rule__Model__Group__8__Impl rule__Model__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__Model__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__8"


    // $ANTLR start "rule__Model__Group__8__Impl"
    // InternalMyTurtleDsl.g:1592:1: rule__Model__Group__8__Impl : ( ( '\\n' )* ) ;
    public final void rule__Model__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1596:1: ( ( ( '\\n' )* ) )
            // InternalMyTurtleDsl.g:1597:1: ( ( '\\n' )* )
            {
            // InternalMyTurtleDsl.g:1597:1: ( ( '\\n' )* )
            // InternalMyTurtleDsl.g:1598:2: ( '\\n' )*
            {
             before(grammarAccess.getModelAccess().getLineFeedKeyword_8()); 
            // InternalMyTurtleDsl.g:1599:2: ( '\\n' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==12) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:1599:3: '\\n'
            	    {
            	    match(input,12,FOLLOW_6); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getLineFeedKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__8__Impl"


    // $ANTLR start "rule__Model__Group__9"
    // InternalMyTurtleDsl.g:1607:1: rule__Model__Group__9 : rule__Model__Group__9__Impl rule__Model__Group__10 ;
    public final void rule__Model__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1611:1: ( rule__Model__Group__9__Impl rule__Model__Group__10 )
            // InternalMyTurtleDsl.g:1612:2: rule__Model__Group__9__Impl rule__Model__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__Model__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__9"


    // $ANTLR start "rule__Model__Group__9__Impl"
    // InternalMyTurtleDsl.g:1619:1: rule__Model__Group__9__Impl : ( ( rule__Model__PvdmAssignment_9 ) ) ;
    public final void rule__Model__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1623:1: ( ( ( rule__Model__PvdmAssignment_9 ) ) )
            // InternalMyTurtleDsl.g:1624:1: ( ( rule__Model__PvdmAssignment_9 ) )
            {
            // InternalMyTurtleDsl.g:1624:1: ( ( rule__Model__PvdmAssignment_9 ) )
            // InternalMyTurtleDsl.g:1625:2: ( rule__Model__PvdmAssignment_9 )
            {
             before(grammarAccess.getModelAccess().getPvdmAssignment_9()); 
            // InternalMyTurtleDsl.g:1626:2: ( rule__Model__PvdmAssignment_9 )
            // InternalMyTurtleDsl.g:1626:3: rule__Model__PvdmAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Model__PvdmAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPvdmAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__9__Impl"


    // $ANTLR start "rule__Model__Group__10"
    // InternalMyTurtleDsl.g:1634:1: rule__Model__Group__10 : rule__Model__Group__10__Impl rule__Model__Group__11 ;
    public final void rule__Model__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1638:1: ( rule__Model__Group__10__Impl rule__Model__Group__11 )
            // InternalMyTurtleDsl.g:1639:2: rule__Model__Group__10__Impl rule__Model__Group__11
            {
            pushFollow(FOLLOW_12);
            rule__Model__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__10"


    // $ANTLR start "rule__Model__Group__10__Impl"
    // InternalMyTurtleDsl.g:1646:1: rule__Model__Group__10__Impl : ( ( '\\n' )* ) ;
    public final void rule__Model__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1650:1: ( ( ( '\\n' )* ) )
            // InternalMyTurtleDsl.g:1651:1: ( ( '\\n' )* )
            {
            // InternalMyTurtleDsl.g:1651:1: ( ( '\\n' )* )
            // InternalMyTurtleDsl.g:1652:2: ( '\\n' )*
            {
             before(grammarAccess.getModelAccess().getLineFeedKeyword_10()); 
            // InternalMyTurtleDsl.g:1653:2: ( '\\n' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==12) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:1653:3: '\\n'
            	    {
            	    match(input,12,FOLLOW_6); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getLineFeedKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__10__Impl"


    // $ANTLR start "rule__Model__Group__11"
    // InternalMyTurtleDsl.g:1661:1: rule__Model__Group__11 : rule__Model__Group__11__Impl rule__Model__Group__12 ;
    public final void rule__Model__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1665:1: ( rule__Model__Group__11__Impl rule__Model__Group__12 )
            // InternalMyTurtleDsl.g:1666:2: rule__Model__Group__11__Impl rule__Model__Group__12
            {
            pushFollow(FOLLOW_13);
            rule__Model__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__11"


    // $ANTLR start "rule__Model__Group__11__Impl"
    // InternalMyTurtleDsl.g:1673:1: rule__Model__Group__11__Impl : ( ( rule__Model__PvrmAssignment_11 ) ) ;
    public final void rule__Model__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1677:1: ( ( ( rule__Model__PvrmAssignment_11 ) ) )
            // InternalMyTurtleDsl.g:1678:1: ( ( rule__Model__PvrmAssignment_11 ) )
            {
            // InternalMyTurtleDsl.g:1678:1: ( ( rule__Model__PvrmAssignment_11 ) )
            // InternalMyTurtleDsl.g:1679:2: ( rule__Model__PvrmAssignment_11 )
            {
             before(grammarAccess.getModelAccess().getPvrmAssignment_11()); 
            // InternalMyTurtleDsl.g:1680:2: ( rule__Model__PvrmAssignment_11 )
            // InternalMyTurtleDsl.g:1680:3: rule__Model__PvrmAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Model__PvrmAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPvrmAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__11__Impl"


    // $ANTLR start "rule__Model__Group__12"
    // InternalMyTurtleDsl.g:1688:1: rule__Model__Group__12 : rule__Model__Group__12__Impl rule__Model__Group__13 ;
    public final void rule__Model__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1692:1: ( rule__Model__Group__12__Impl rule__Model__Group__13 )
            // InternalMyTurtleDsl.g:1693:2: rule__Model__Group__12__Impl rule__Model__Group__13
            {
            pushFollow(FOLLOW_13);
            rule__Model__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__12"


    // $ANTLR start "rule__Model__Group__12__Impl"
    // InternalMyTurtleDsl.g:1700:1: rule__Model__Group__12__Impl : ( ( '\\n' )* ) ;
    public final void rule__Model__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1704:1: ( ( ( '\\n' )* ) )
            // InternalMyTurtleDsl.g:1705:1: ( ( '\\n' )* )
            {
            // InternalMyTurtleDsl.g:1705:1: ( ( '\\n' )* )
            // InternalMyTurtleDsl.g:1706:2: ( '\\n' )*
            {
             before(grammarAccess.getModelAccess().getLineFeedKeyword_12()); 
            // InternalMyTurtleDsl.g:1707:2: ( '\\n' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==12) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:1707:3: '\\n'
            	    {
            	    match(input,12,FOLLOW_6); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getLineFeedKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__12__Impl"


    // $ANTLR start "rule__Model__Group__13"
    // InternalMyTurtleDsl.g:1715:1: rule__Model__Group__13 : rule__Model__Group__13__Impl rule__Model__Group__14 ;
    public final void rule__Model__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1719:1: ( rule__Model__Group__13__Impl rule__Model__Group__14 )
            // InternalMyTurtleDsl.g:1720:2: rule__Model__Group__13__Impl rule__Model__Group__14
            {
            pushFollow(FOLLOW_14);
            rule__Model__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__13"


    // $ANTLR start "rule__Model__Group__13__Impl"
    // InternalMyTurtleDsl.g:1727:1: rule__Model__Group__13__Impl : ( ( rule__Model__HmAssignment_13 ) ) ;
    public final void rule__Model__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1731:1: ( ( ( rule__Model__HmAssignment_13 ) ) )
            // InternalMyTurtleDsl.g:1732:1: ( ( rule__Model__HmAssignment_13 ) )
            {
            // InternalMyTurtleDsl.g:1732:1: ( ( rule__Model__HmAssignment_13 ) )
            // InternalMyTurtleDsl.g:1733:2: ( rule__Model__HmAssignment_13 )
            {
             before(grammarAccess.getModelAccess().getHmAssignment_13()); 
            // InternalMyTurtleDsl.g:1734:2: ( rule__Model__HmAssignment_13 )
            // InternalMyTurtleDsl.g:1734:3: rule__Model__HmAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Model__HmAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getHmAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__13__Impl"


    // $ANTLR start "rule__Model__Group__14"
    // InternalMyTurtleDsl.g:1742:1: rule__Model__Group__14 : rule__Model__Group__14__Impl rule__Model__Group__15 ;
    public final void rule__Model__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1746:1: ( rule__Model__Group__14__Impl rule__Model__Group__15 )
            // InternalMyTurtleDsl.g:1747:2: rule__Model__Group__14__Impl rule__Model__Group__15
            {
            pushFollow(FOLLOW_14);
            rule__Model__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__14"


    // $ANTLR start "rule__Model__Group__14__Impl"
    // InternalMyTurtleDsl.g:1754:1: rule__Model__Group__14__Impl : ( ( '\\n' )* ) ;
    public final void rule__Model__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1758:1: ( ( ( '\\n' )* ) )
            // InternalMyTurtleDsl.g:1759:1: ( ( '\\n' )* )
            {
            // InternalMyTurtleDsl.g:1759:1: ( ( '\\n' )* )
            // InternalMyTurtleDsl.g:1760:2: ( '\\n' )*
            {
             before(grammarAccess.getModelAccess().getLineFeedKeyword_14()); 
            // InternalMyTurtleDsl.g:1761:2: ( '\\n' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==12) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:1761:3: '\\n'
            	    {
            	    match(input,12,FOLLOW_6); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getLineFeedKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__14__Impl"


    // $ANTLR start "rule__Model__Group__15"
    // InternalMyTurtleDsl.g:1769:1: rule__Model__Group__15 : rule__Model__Group__15__Impl rule__Model__Group__16 ;
    public final void rule__Model__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1773:1: ( rule__Model__Group__15__Impl rule__Model__Group__16 )
            // InternalMyTurtleDsl.g:1774:2: rule__Model__Group__15__Impl rule__Model__Group__16
            {
            pushFollow(FOLLOW_15);
            rule__Model__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__15"


    // $ANTLR start "rule__Model__Group__15__Impl"
    // InternalMyTurtleDsl.g:1781:1: rule__Model__Group__15__Impl : ( ( rule__Model__EmAssignment_15 ) ) ;
    public final void rule__Model__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1785:1: ( ( ( rule__Model__EmAssignment_15 ) ) )
            // InternalMyTurtleDsl.g:1786:1: ( ( rule__Model__EmAssignment_15 ) )
            {
            // InternalMyTurtleDsl.g:1786:1: ( ( rule__Model__EmAssignment_15 ) )
            // InternalMyTurtleDsl.g:1787:2: ( rule__Model__EmAssignment_15 )
            {
             before(grammarAccess.getModelAccess().getEmAssignment_15()); 
            // InternalMyTurtleDsl.g:1788:2: ( rule__Model__EmAssignment_15 )
            // InternalMyTurtleDsl.g:1788:3: rule__Model__EmAssignment_15
            {
            pushFollow(FOLLOW_2);
            rule__Model__EmAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getEmAssignment_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__15__Impl"


    // $ANTLR start "rule__Model__Group__16"
    // InternalMyTurtleDsl.g:1796:1: rule__Model__Group__16 : rule__Model__Group__16__Impl rule__Model__Group__17 ;
    public final void rule__Model__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1800:1: ( rule__Model__Group__16__Impl rule__Model__Group__17 )
            // InternalMyTurtleDsl.g:1801:2: rule__Model__Group__16__Impl rule__Model__Group__17
            {
            pushFollow(FOLLOW_15);
            rule__Model__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__16"


    // $ANTLR start "rule__Model__Group__16__Impl"
    // InternalMyTurtleDsl.g:1808:1: rule__Model__Group__16__Impl : ( ( '\\n' )* ) ;
    public final void rule__Model__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1812:1: ( ( ( '\\n' )* ) )
            // InternalMyTurtleDsl.g:1813:1: ( ( '\\n' )* )
            {
            // InternalMyTurtleDsl.g:1813:1: ( ( '\\n' )* )
            // InternalMyTurtleDsl.g:1814:2: ( '\\n' )*
            {
             before(grammarAccess.getModelAccess().getLineFeedKeyword_16()); 
            // InternalMyTurtleDsl.g:1815:2: ( '\\n' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==12) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:1815:3: '\\n'
            	    {
            	    match(input,12,FOLLOW_6); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getLineFeedKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__16__Impl"


    // $ANTLR start "rule__Model__Group__17"
    // InternalMyTurtleDsl.g:1823:1: rule__Model__Group__17 : rule__Model__Group__17__Impl rule__Model__Group__18 ;
    public final void rule__Model__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1827:1: ( rule__Model__Group__17__Impl rule__Model__Group__18 )
            // InternalMyTurtleDsl.g:1828:2: rule__Model__Group__17__Impl rule__Model__Group__18
            {
            pushFollow(FOLLOW_16);
            rule__Model__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__17"


    // $ANTLR start "rule__Model__Group__17__Impl"
    // InternalMyTurtleDsl.g:1835:1: rule__Model__Group__17__Impl : ( '}' ) ;
    public final void rule__Model__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1839:1: ( ( '}' ) )
            // InternalMyTurtleDsl.g:1840:1: ( '}' )
            {
            // InternalMyTurtleDsl.g:1840:1: ( '}' )
            // InternalMyTurtleDsl.g:1841:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_17()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__17__Impl"


    // $ANTLR start "rule__Model__Group__18"
    // InternalMyTurtleDsl.g:1850:1: rule__Model__Group__18 : rule__Model__Group__18__Impl rule__Model__Group__19 ;
    public final void rule__Model__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1854:1: ( rule__Model__Group__18__Impl rule__Model__Group__19 )
            // InternalMyTurtleDsl.g:1855:2: rule__Model__Group__18__Impl rule__Model__Group__19
            {
            pushFollow(FOLLOW_17);
            rule__Model__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__18"


    // $ANTLR start "rule__Model__Group__18__Impl"
    // InternalMyTurtleDsl.g:1862:1: rule__Model__Group__18__Impl : ( ruleStart ) ;
    public final void rule__Model__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1866:1: ( ( ruleStart ) )
            // InternalMyTurtleDsl.g:1867:1: ( ruleStart )
            {
            // InternalMyTurtleDsl.g:1867:1: ( ruleStart )
            // InternalMyTurtleDsl.g:1868:2: ruleStart
            {
             before(grammarAccess.getModelAccess().getStartParserRuleCall_18()); 
            pushFollow(FOLLOW_2);
            ruleStart();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStartParserRuleCall_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__18__Impl"


    // $ANTLR start "rule__Model__Group__19"
    // InternalMyTurtleDsl.g:1877:1: rule__Model__Group__19 : rule__Model__Group__19__Impl rule__Model__Group__20 ;
    public final void rule__Model__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1881:1: ( rule__Model__Group__19__Impl rule__Model__Group__20 )
            // InternalMyTurtleDsl.g:1882:2: rule__Model__Group__19__Impl rule__Model__Group__20
            {
            pushFollow(FOLLOW_17);
            rule__Model__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__19"


    // $ANTLR start "rule__Model__Group__19__Impl"
    // InternalMyTurtleDsl.g:1889:1: rule__Model__Group__19__Impl : ( ( '\\n' )* ) ;
    public final void rule__Model__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1893:1: ( ( ( '\\n' )* ) )
            // InternalMyTurtleDsl.g:1894:1: ( ( '\\n' )* )
            {
            // InternalMyTurtleDsl.g:1894:1: ( ( '\\n' )* )
            // InternalMyTurtleDsl.g:1895:2: ( '\\n' )*
            {
             before(grammarAccess.getModelAccess().getLineFeedKeyword_19()); 
            // InternalMyTurtleDsl.g:1896:2: ( '\\n' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==12) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:1896:3: '\\n'
            	    {
            	    match(input,12,FOLLOW_6); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getLineFeedKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__19__Impl"


    // $ANTLR start "rule__Model__Group__20"
    // InternalMyTurtleDsl.g:1904:1: rule__Model__Group__20 : rule__Model__Group__20__Impl rule__Model__Group__21 ;
    public final void rule__Model__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1908:1: ( rule__Model__Group__20__Impl rule__Model__Group__21 )
            // InternalMyTurtleDsl.g:1909:2: rule__Model__Group__20__Impl rule__Model__Group__21
            {
            pushFollow(FOLLOW_17);
            rule__Model__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__20"


    // $ANTLR start "rule__Model__Group__20__Impl"
    // InternalMyTurtleDsl.g:1916:1: rule__Model__Group__20__Impl : ( ( rule__Model__Alternatives_20 )* ) ;
    public final void rule__Model__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1920:1: ( ( ( rule__Model__Alternatives_20 )* ) )
            // InternalMyTurtleDsl.g:1921:1: ( ( rule__Model__Alternatives_20 )* )
            {
            // InternalMyTurtleDsl.g:1921:1: ( ( rule__Model__Alternatives_20 )* )
            // InternalMyTurtleDsl.g:1922:2: ( rule__Model__Alternatives_20 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_20()); 
            // InternalMyTurtleDsl.g:1923:2: ( rule__Model__Alternatives_20 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||LA20_0==30||(LA20_0>=32 && LA20_0<=39)||LA20_0==41) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:1923:3: rule__Model__Alternatives_20
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Model__Alternatives_20();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlternatives_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__20__Impl"


    // $ANTLR start "rule__Model__Group__21"
    // InternalMyTurtleDsl.g:1931:1: rule__Model__Group__21 : rule__Model__Group__21__Impl rule__Model__Group__22 ;
    public final void rule__Model__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1935:1: ( rule__Model__Group__21__Impl rule__Model__Group__22 )
            // InternalMyTurtleDsl.g:1936:2: rule__Model__Group__21__Impl rule__Model__Group__22
            {
            pushFollow(FOLLOW_17);
            rule__Model__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__21"


    // $ANTLR start "rule__Model__Group__21__Impl"
    // InternalMyTurtleDsl.g:1943:1: rule__Model__Group__21__Impl : ( ( '\\n' )* ) ;
    public final void rule__Model__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1947:1: ( ( ( '\\n' )* ) )
            // InternalMyTurtleDsl.g:1948:1: ( ( '\\n' )* )
            {
            // InternalMyTurtleDsl.g:1948:1: ( ( '\\n' )* )
            // InternalMyTurtleDsl.g:1949:2: ( '\\n' )*
            {
             before(grammarAccess.getModelAccess().getLineFeedKeyword_21()); 
            // InternalMyTurtleDsl.g:1950:2: ( '\\n' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==12) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:1950:3: '\\n'
            	    {
            	    match(input,12,FOLLOW_6); 

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getLineFeedKeyword_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__21__Impl"


    // $ANTLR start "rule__Model__Group__22"
    // InternalMyTurtleDsl.g:1958:1: rule__Model__Group__22 : rule__Model__Group__22__Impl rule__Model__Group__23 ;
    public final void rule__Model__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1962:1: ( rule__Model__Group__22__Impl rule__Model__Group__23 )
            // InternalMyTurtleDsl.g:1963:2: rule__Model__Group__22__Impl rule__Model__Group__23
            {
            pushFollow(FOLLOW_15);
            rule__Model__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__23();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__22"


    // $ANTLR start "rule__Model__Group__22__Impl"
    // InternalMyTurtleDsl.g:1970:1: rule__Model__Group__22__Impl : ( ruleEnd ) ;
    public final void rule__Model__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1974:1: ( ( ruleEnd ) )
            // InternalMyTurtleDsl.g:1975:1: ( ruleEnd )
            {
            // InternalMyTurtleDsl.g:1975:1: ( ruleEnd )
            // InternalMyTurtleDsl.g:1976:2: ruleEnd
            {
             before(grammarAccess.getModelAccess().getEndParserRuleCall_22()); 
            pushFollow(FOLLOW_2);
            ruleEnd();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEndParserRuleCall_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__22__Impl"


    // $ANTLR start "rule__Model__Group__23"
    // InternalMyTurtleDsl.g:1985:1: rule__Model__Group__23 : rule__Model__Group__23__Impl rule__Model__Group__24 ;
    public final void rule__Model__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1989:1: ( rule__Model__Group__23__Impl rule__Model__Group__24 )
            // InternalMyTurtleDsl.g:1990:2: rule__Model__Group__23__Impl rule__Model__Group__24
            {
            pushFollow(FOLLOW_15);
            rule__Model__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__24();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__23"


    // $ANTLR start "rule__Model__Group__23__Impl"
    // InternalMyTurtleDsl.g:1997:1: rule__Model__Group__23__Impl : ( ( '\\n' )* ) ;
    public final void rule__Model__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2001:1: ( ( ( '\\n' )* ) )
            // InternalMyTurtleDsl.g:2002:1: ( ( '\\n' )* )
            {
            // InternalMyTurtleDsl.g:2002:1: ( ( '\\n' )* )
            // InternalMyTurtleDsl.g:2003:2: ( '\\n' )*
            {
             before(grammarAccess.getModelAccess().getLineFeedKeyword_23()); 
            // InternalMyTurtleDsl.g:2004:2: ( '\\n' )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==12) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:2004:3: '\\n'
            	    {
            	    match(input,12,FOLLOW_6); 

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getLineFeedKeyword_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__23__Impl"


    // $ANTLR start "rule__Model__Group__24"
    // InternalMyTurtleDsl.g:2012:1: rule__Model__Group__24 : rule__Model__Group__24__Impl rule__Model__Group__25 ;
    public final void rule__Model__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2016:1: ( rule__Model__Group__24__Impl rule__Model__Group__25 )
            // InternalMyTurtleDsl.g:2017:2: rule__Model__Group__24__Impl rule__Model__Group__25
            {
            pushFollow(FOLLOW_19);
            rule__Model__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__25();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__24"


    // $ANTLR start "rule__Model__Group__24__Impl"
    // InternalMyTurtleDsl.g:2024:1: rule__Model__Group__24__Impl : ( '}' ) ;
    public final void rule__Model__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2028:1: ( ( '}' ) )
            // InternalMyTurtleDsl.g:2029:1: ( '}' )
            {
            // InternalMyTurtleDsl.g:2029:1: ( '}' )
            // InternalMyTurtleDsl.g:2030:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_24()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_24()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__24__Impl"


    // $ANTLR start "rule__Model__Group__25"
    // InternalMyTurtleDsl.g:2039:1: rule__Model__Group__25 : rule__Model__Group__25__Impl rule__Model__Group__26 ;
    public final void rule__Model__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2043:1: ( rule__Model__Group__25__Impl rule__Model__Group__26 )
            // InternalMyTurtleDsl.g:2044:2: rule__Model__Group__25__Impl rule__Model__Group__26
            {
            pushFollow(FOLLOW_19);
            rule__Model__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__26();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__25"


    // $ANTLR start "rule__Model__Group__25__Impl"
    // InternalMyTurtleDsl.g:2051:1: rule__Model__Group__25__Impl : ( ( '\\n' )* ) ;
    public final void rule__Model__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2055:1: ( ( ( '\\n' )* ) )
            // InternalMyTurtleDsl.g:2056:1: ( ( '\\n' )* )
            {
            // InternalMyTurtleDsl.g:2056:1: ( ( '\\n' )* )
            // InternalMyTurtleDsl.g:2057:2: ( '\\n' )*
            {
             before(grammarAccess.getModelAccess().getLineFeedKeyword_25()); 
            // InternalMyTurtleDsl.g:2058:2: ( '\\n' )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==12) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:2058:3: '\\n'
            	    {
            	    match(input,12,FOLLOW_6); 

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getLineFeedKeyword_25()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__25__Impl"


    // $ANTLR start "rule__Model__Group__26"
    // InternalMyTurtleDsl.g:2066:1: rule__Model__Group__26 : rule__Model__Group__26__Impl rule__Model__Group__27 ;
    public final void rule__Model__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2070:1: ( rule__Model__Group__26__Impl rule__Model__Group__27 )
            // InternalMyTurtleDsl.g:2071:2: rule__Model__Group__26__Impl rule__Model__Group__27
            {
            pushFollow(FOLLOW_19);
            rule__Model__Group__26__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__27();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__26"


    // $ANTLR start "rule__Model__Group__26__Impl"
    // InternalMyTurtleDsl.g:2078:1: rule__Model__Group__26__Impl : ( ( rule__Model__FonctionsAssignment_26 )* ) ;
    public final void rule__Model__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2082:1: ( ( ( rule__Model__FonctionsAssignment_26 )* ) )
            // InternalMyTurtleDsl.g:2083:1: ( ( rule__Model__FonctionsAssignment_26 )* )
            {
            // InternalMyTurtleDsl.g:2083:1: ( ( rule__Model__FonctionsAssignment_26 )* )
            // InternalMyTurtleDsl.g:2084:2: ( rule__Model__FonctionsAssignment_26 )*
            {
             before(grammarAccess.getModelAccess().getFonctionsAssignment_26()); 
            // InternalMyTurtleDsl.g:2085:2: ( rule__Model__FonctionsAssignment_26 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==13) ) {
                    int LA24_2 = input.LA(2);

                    if ( (LA24_2==RULE_ID) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:2085:3: rule__Model__FonctionsAssignment_26
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Model__FonctionsAssignment_26();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getFonctionsAssignment_26()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__26__Impl"


    // $ANTLR start "rule__Model__Group__27"
    // InternalMyTurtleDsl.g:2093:1: rule__Model__Group__27 : rule__Model__Group__27__Impl ;
    public final void rule__Model__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2097:1: ( rule__Model__Group__27__Impl )
            // InternalMyTurtleDsl.g:2098:2: rule__Model__Group__27__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__27__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__27"


    // $ANTLR start "rule__Model__Group__27__Impl"
    // InternalMyTurtleDsl.g:2104:1: rule__Model__Group__27__Impl : ( ( '\\n' )* ) ;
    public final void rule__Model__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2108:1: ( ( ( '\\n' )* ) )
            // InternalMyTurtleDsl.g:2109:1: ( ( '\\n' )* )
            {
            // InternalMyTurtleDsl.g:2109:1: ( ( '\\n' )* )
            // InternalMyTurtleDsl.g:2110:2: ( '\\n' )*
            {
             before(grammarAccess.getModelAccess().getLineFeedKeyword_27()); 
            // InternalMyTurtleDsl.g:2111:2: ( '\\n' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==12) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:2111:3: '\\n'
            	    {
            	    match(input,12,FOLLOW_6); 

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getLineFeedKeyword_27()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__27__Impl"


    // $ANTLR start "rule__Includes__Group__0"
    // InternalMyTurtleDsl.g:2120:1: rule__Includes__Group__0 : rule__Includes__Group__0__Impl rule__Includes__Group__1 ;
    public final void rule__Includes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2124:1: ( rule__Includes__Group__0__Impl rule__Includes__Group__1 )
            // InternalMyTurtleDsl.g:2125:2: rule__Includes__Group__0__Impl rule__Includes__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Includes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Includes__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__Group__0"


    // $ANTLR start "rule__Includes__Group__0__Impl"
    // InternalMyTurtleDsl.g:2132:1: rule__Includes__Group__0__Impl : ( 'import' ) ;
    public final void rule__Includes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2136:1: ( ( 'import' ) )
            // InternalMyTurtleDsl.g:2137:1: ( 'import' )
            {
            // InternalMyTurtleDsl.g:2137:1: ( 'import' )
            // InternalMyTurtleDsl.g:2138:2: 'import'
            {
             before(grammarAccess.getIncludesAccess().getImportKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getIncludesAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__Group__0__Impl"


    // $ANTLR start "rule__Includes__Group__1"
    // InternalMyTurtleDsl.g:2147:1: rule__Includes__Group__1 : rule__Includes__Group__1__Impl rule__Includes__Group__2 ;
    public final void rule__Includes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2151:1: ( rule__Includes__Group__1__Impl rule__Includes__Group__2 )
            // InternalMyTurtleDsl.g:2152:2: rule__Includes__Group__1__Impl rule__Includes__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Includes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Includes__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__Group__1"


    // $ANTLR start "rule__Includes__Group__1__Impl"
    // InternalMyTurtleDsl.g:2159:1: rule__Includes__Group__1__Impl : ( '<' ) ;
    public final void rule__Includes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2163:1: ( ( '<' ) )
            // InternalMyTurtleDsl.g:2164:1: ( '<' )
            {
            // InternalMyTurtleDsl.g:2164:1: ( '<' )
            // InternalMyTurtleDsl.g:2165:2: '<'
            {
             before(grammarAccess.getIncludesAccess().getLessThanSignKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getIncludesAccess().getLessThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__Group__1__Impl"


    // $ANTLR start "rule__Includes__Group__2"
    // InternalMyTurtleDsl.g:2174:1: rule__Includes__Group__2 : rule__Includes__Group__2__Impl rule__Includes__Group__3 ;
    public final void rule__Includes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2178:1: ( rule__Includes__Group__2__Impl rule__Includes__Group__3 )
            // InternalMyTurtleDsl.g:2179:2: rule__Includes__Group__2__Impl rule__Includes__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Includes__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Includes__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__Group__2"


    // $ANTLR start "rule__Includes__Group__2__Impl"
    // InternalMyTurtleDsl.g:2186:1: rule__Includes__Group__2__Impl : ( ( rule__Includes__ImportURIAssignment_2 ) ) ;
    public final void rule__Includes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2190:1: ( ( ( rule__Includes__ImportURIAssignment_2 ) ) )
            // InternalMyTurtleDsl.g:2191:1: ( ( rule__Includes__ImportURIAssignment_2 ) )
            {
            // InternalMyTurtleDsl.g:2191:1: ( ( rule__Includes__ImportURIAssignment_2 ) )
            // InternalMyTurtleDsl.g:2192:2: ( rule__Includes__ImportURIAssignment_2 )
            {
             before(grammarAccess.getIncludesAccess().getImportURIAssignment_2()); 
            // InternalMyTurtleDsl.g:2193:2: ( rule__Includes__ImportURIAssignment_2 )
            // InternalMyTurtleDsl.g:2193:3: rule__Includes__ImportURIAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Includes__ImportURIAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIncludesAccess().getImportURIAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__Group__2__Impl"


    // $ANTLR start "rule__Includes__Group__3"
    // InternalMyTurtleDsl.g:2201:1: rule__Includes__Group__3 : rule__Includes__Group__3__Impl ;
    public final void rule__Includes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2205:1: ( rule__Includes__Group__3__Impl )
            // InternalMyTurtleDsl.g:2206:2: rule__Includes__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Includes__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__Group__3"


    // $ANTLR start "rule__Includes__Group__3__Impl"
    // InternalMyTurtleDsl.g:2212:1: rule__Includes__Group__3__Impl : ( '>;' ) ;
    public final void rule__Includes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2216:1: ( ( '>;' ) )
            // InternalMyTurtleDsl.g:2217:1: ( '>;' )
            {
            // InternalMyTurtleDsl.g:2217:1: ( '>;' )
            // InternalMyTurtleDsl.g:2218:2: '>;'
            {
             before(grammarAccess.getIncludesAccess().getGreaterThanSignSemicolonKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getIncludesAccess().getGreaterThanSignSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__Group__3__Impl"


    // $ANTLR start "rule__Pourcent_vitesse_hauteur_max__Group__0"
    // InternalMyTurtleDsl.g:2228:1: rule__Pourcent_vitesse_hauteur_max__Group__0 : rule__Pourcent_vitesse_hauteur_max__Group__0__Impl rule__Pourcent_vitesse_hauteur_max__Group__1 ;
    public final void rule__Pourcent_vitesse_hauteur_max__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2232:1: ( rule__Pourcent_vitesse_hauteur_max__Group__0__Impl rule__Pourcent_vitesse_hauteur_max__Group__1 )
            // InternalMyTurtleDsl.g:2233:2: rule__Pourcent_vitesse_hauteur_max__Group__0__Impl rule__Pourcent_vitesse_hauteur_max__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Pourcent_vitesse_hauteur_max__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pourcent_vitesse_hauteur_max__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pourcent_vitesse_hauteur_max__Group__0"


    // $ANTLR start "rule__Pourcent_vitesse_hauteur_max__Group__0__Impl"
    // InternalMyTurtleDsl.g:2240:1: rule__Pourcent_vitesse_hauteur_max__Group__0__Impl : ( 'def_pourcent_vitesse_hauteur_max' ) ;
    public final void rule__Pourcent_vitesse_hauteur_max__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2244:1: ( ( 'def_pourcent_vitesse_hauteur_max' ) )
            // InternalMyTurtleDsl.g:2245:1: ( 'def_pourcent_vitesse_hauteur_max' )
            {
            // InternalMyTurtleDsl.g:2245:1: ( 'def_pourcent_vitesse_hauteur_max' )
            // InternalMyTurtleDsl.g:2246:2: 'def_pourcent_vitesse_hauteur_max'
            {
             before(grammarAccess.getPourcent_vitesse_hauteur_maxAccess().getDef_pourcent_vitesse_hauteur_maxKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPourcent_vitesse_hauteur_maxAccess().getDef_pourcent_vitesse_hauteur_maxKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pourcent_vitesse_hauteur_max__Group__0__Impl"


    // $ANTLR start "rule__Pourcent_vitesse_hauteur_max__Group__1"
    // InternalMyTurtleDsl.g:2255:1: rule__Pourcent_vitesse_hauteur_max__Group__1 : rule__Pourcent_vitesse_hauteur_max__Group__1__Impl rule__Pourcent_vitesse_hauteur_max__Group__2 ;
    public final void rule__Pourcent_vitesse_hauteur_max__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2259:1: ( rule__Pourcent_vitesse_hauteur_max__Group__1__Impl rule__Pourcent_vitesse_hauteur_max__Group__2 )
            // InternalMyTurtleDsl.g:2260:2: rule__Pourcent_vitesse_hauteur_max__Group__1__Impl rule__Pourcent_vitesse_hauteur_max__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Pourcent_vitesse_hauteur_max__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pourcent_vitesse_hauteur_max__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pourcent_vitesse_hauteur_max__Group__1"


    // $ANTLR start "rule__Pourcent_vitesse_hauteur_max__Group__1__Impl"
    // InternalMyTurtleDsl.g:2267:1: rule__Pourcent_vitesse_hauteur_max__Group__1__Impl : ( '(' ) ;
    public final void rule__Pourcent_vitesse_hauteur_max__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2271:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:2272:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:2272:1: ( '(' )
            // InternalMyTurtleDsl.g:2273:2: '('
            {
             before(grammarAccess.getPourcent_vitesse_hauteur_maxAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPourcent_vitesse_hauteur_maxAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pourcent_vitesse_hauteur_max__Group__1__Impl"


    // $ANTLR start "rule__Pourcent_vitesse_hauteur_max__Group__2"
    // InternalMyTurtleDsl.g:2282:1: rule__Pourcent_vitesse_hauteur_max__Group__2 : rule__Pourcent_vitesse_hauteur_max__Group__2__Impl rule__Pourcent_vitesse_hauteur_max__Group__3 ;
    public final void rule__Pourcent_vitesse_hauteur_max__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2286:1: ( rule__Pourcent_vitesse_hauteur_max__Group__2__Impl rule__Pourcent_vitesse_hauteur_max__Group__3 )
            // InternalMyTurtleDsl.g:2287:2: rule__Pourcent_vitesse_hauteur_max__Group__2__Impl rule__Pourcent_vitesse_hauteur_max__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Pourcent_vitesse_hauteur_max__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pourcent_vitesse_hauteur_max__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pourcent_vitesse_hauteur_max__Group__2"


    // $ANTLR start "rule__Pourcent_vitesse_hauteur_max__Group__2__Impl"
    // InternalMyTurtleDsl.g:2294:1: rule__Pourcent_vitesse_hauteur_max__Group__2__Impl : ( ( rule__Pourcent_vitesse_hauteur_max__Vitesse_verticaleAssignment_2 ) ) ;
    public final void rule__Pourcent_vitesse_hauteur_max__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2298:1: ( ( ( rule__Pourcent_vitesse_hauteur_max__Vitesse_verticaleAssignment_2 ) ) )
            // InternalMyTurtleDsl.g:2299:1: ( ( rule__Pourcent_vitesse_hauteur_max__Vitesse_verticaleAssignment_2 ) )
            {
            // InternalMyTurtleDsl.g:2299:1: ( ( rule__Pourcent_vitesse_hauteur_max__Vitesse_verticaleAssignment_2 ) )
            // InternalMyTurtleDsl.g:2300:2: ( rule__Pourcent_vitesse_hauteur_max__Vitesse_verticaleAssignment_2 )
            {
             before(grammarAccess.getPourcent_vitesse_hauteur_maxAccess().getVitesse_verticaleAssignment_2()); 
            // InternalMyTurtleDsl.g:2301:2: ( rule__Pourcent_vitesse_hauteur_max__Vitesse_verticaleAssignment_2 )
            // InternalMyTurtleDsl.g:2301:3: rule__Pourcent_vitesse_hauteur_max__Vitesse_verticaleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Pourcent_vitesse_hauteur_max__Vitesse_verticaleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPourcent_vitesse_hauteur_maxAccess().getVitesse_verticaleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pourcent_vitesse_hauteur_max__Group__2__Impl"


    // $ANTLR start "rule__Pourcent_vitesse_hauteur_max__Group__3"
    // InternalMyTurtleDsl.g:2309:1: rule__Pourcent_vitesse_hauteur_max__Group__3 : rule__Pourcent_vitesse_hauteur_max__Group__3__Impl ;
    public final void rule__Pourcent_vitesse_hauteur_max__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2313:1: ( rule__Pourcent_vitesse_hauteur_max__Group__3__Impl )
            // InternalMyTurtleDsl.g:2314:2: rule__Pourcent_vitesse_hauteur_max__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pourcent_vitesse_hauteur_max__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pourcent_vitesse_hauteur_max__Group__3"


    // $ANTLR start "rule__Pourcent_vitesse_hauteur_max__Group__3__Impl"
    // InternalMyTurtleDsl.g:2320:1: rule__Pourcent_vitesse_hauteur_max__Group__3__Impl : ( ')' ) ;
    public final void rule__Pourcent_vitesse_hauteur_max__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2324:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:2325:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:2325:1: ( ')' )
            // InternalMyTurtleDsl.g:2326:2: ')'
            {
             before(grammarAccess.getPourcent_vitesse_hauteur_maxAccess().getRightParenthesisKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPourcent_vitesse_hauteur_maxAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pourcent_vitesse_hauteur_max__Group__3__Impl"


    // $ANTLR start "rule__Pourcent_vitesse_deplacement_max__Group__0"
    // InternalMyTurtleDsl.g:2336:1: rule__Pourcent_vitesse_deplacement_max__Group__0 : rule__Pourcent_vitesse_deplacement_max__Group__0__Impl rule__Pourcent_vitesse_deplacement_max__Group__1 ;
    public final void rule__Pourcent_vitesse_deplacement_max__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2340:1: ( rule__Pourcent_vitesse_deplacement_max__Group__0__Impl rule__Pourcent_vitesse_deplacement_max__Group__1 )
            // InternalMyTurtleDsl.g:2341:2: rule__Pourcent_vitesse_deplacement_max__Group__0__Impl rule__Pourcent_vitesse_deplacement_max__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Pourcent_vitesse_deplacement_max__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pourcent_vitesse_deplacement_max__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pourcent_vitesse_deplacement_max__Group__0"


    // $ANTLR start "rule__Pourcent_vitesse_deplacement_max__Group__0__Impl"
    // InternalMyTurtleDsl.g:2348:1: rule__Pourcent_vitesse_deplacement_max__Group__0__Impl : ( 'def_pourcent_vitesse_deplacement_max' ) ;
    public final void rule__Pourcent_vitesse_deplacement_max__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2352:1: ( ( 'def_pourcent_vitesse_deplacement_max' ) )
            // InternalMyTurtleDsl.g:2353:1: ( 'def_pourcent_vitesse_deplacement_max' )
            {
            // InternalMyTurtleDsl.g:2353:1: ( 'def_pourcent_vitesse_deplacement_max' )
            // InternalMyTurtleDsl.g:2354:2: 'def_pourcent_vitesse_deplacement_max'
            {
             before(grammarAccess.getPourcent_vitesse_deplacement_maxAccess().getDef_pourcent_vitesse_deplacement_maxKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPourcent_vitesse_deplacement_maxAccess().getDef_pourcent_vitesse_deplacement_maxKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pourcent_vitesse_deplacement_max__Group__0__Impl"


    // $ANTLR start "rule__Pourcent_vitesse_deplacement_max__Group__1"
    // InternalMyTurtleDsl.g:2363:1: rule__Pourcent_vitesse_deplacement_max__Group__1 : rule__Pourcent_vitesse_deplacement_max__Group__1__Impl rule__Pourcent_vitesse_deplacement_max__Group__2 ;
    public final void rule__Pourcent_vitesse_deplacement_max__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2367:1: ( rule__Pourcent_vitesse_deplacement_max__Group__1__Impl rule__Pourcent_vitesse_deplacement_max__Group__2 )
            // InternalMyTurtleDsl.g:2368:2: rule__Pourcent_vitesse_deplacement_max__Group__1__Impl rule__Pourcent_vitesse_deplacement_max__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Pourcent_vitesse_deplacement_max__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pourcent_vitesse_deplacement_max__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pourcent_vitesse_deplacement_max__Group__1"


    // $ANTLR start "rule__Pourcent_vitesse_deplacement_max__Group__1__Impl"
    // InternalMyTurtleDsl.g:2375:1: rule__Pourcent_vitesse_deplacement_max__Group__1__Impl : ( '(' ) ;
    public final void rule__Pourcent_vitesse_deplacement_max__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2379:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:2380:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:2380:1: ( '(' )
            // InternalMyTurtleDsl.g:2381:2: '('
            {
             before(grammarAccess.getPourcent_vitesse_deplacement_maxAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPourcent_vitesse_deplacement_maxAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pourcent_vitesse_deplacement_max__Group__1__Impl"


    // $ANTLR start "rule__Pourcent_vitesse_deplacement_max__Group__2"
    // InternalMyTurtleDsl.g:2390:1: rule__Pourcent_vitesse_deplacement_max__Group__2 : rule__Pourcent_vitesse_deplacement_max__Group__2__Impl rule__Pourcent_vitesse_deplacement_max__Group__3 ;
    public final void rule__Pourcent_vitesse_deplacement_max__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2394:1: ( rule__Pourcent_vitesse_deplacement_max__Group__2__Impl rule__Pourcent_vitesse_deplacement_max__Group__3 )
            // InternalMyTurtleDsl.g:2395:2: rule__Pourcent_vitesse_deplacement_max__Group__2__Impl rule__Pourcent_vitesse_deplacement_max__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Pourcent_vitesse_deplacement_max__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pourcent_vitesse_deplacement_max__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pourcent_vitesse_deplacement_max__Group__2"


    // $ANTLR start "rule__Pourcent_vitesse_deplacement_max__Group__2__Impl"
    // InternalMyTurtleDsl.g:2402:1: rule__Pourcent_vitesse_deplacement_max__Group__2__Impl : ( ( rule__Pourcent_vitesse_deplacement_max__Vitesse_deplacementAssignment_2 ) ) ;
    public final void rule__Pourcent_vitesse_deplacement_max__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2406:1: ( ( ( rule__Pourcent_vitesse_deplacement_max__Vitesse_deplacementAssignment_2 ) ) )
            // InternalMyTurtleDsl.g:2407:1: ( ( rule__Pourcent_vitesse_deplacement_max__Vitesse_deplacementAssignment_2 ) )
            {
            // InternalMyTurtleDsl.g:2407:1: ( ( rule__Pourcent_vitesse_deplacement_max__Vitesse_deplacementAssignment_2 ) )
            // InternalMyTurtleDsl.g:2408:2: ( rule__Pourcent_vitesse_deplacement_max__Vitesse_deplacementAssignment_2 )
            {
             before(grammarAccess.getPourcent_vitesse_deplacement_maxAccess().getVitesse_deplacementAssignment_2()); 
            // InternalMyTurtleDsl.g:2409:2: ( rule__Pourcent_vitesse_deplacement_max__Vitesse_deplacementAssignment_2 )
            // InternalMyTurtleDsl.g:2409:3: rule__Pourcent_vitesse_deplacement_max__Vitesse_deplacementAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Pourcent_vitesse_deplacement_max__Vitesse_deplacementAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPourcent_vitesse_deplacement_maxAccess().getVitesse_deplacementAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pourcent_vitesse_deplacement_max__Group__2__Impl"


    // $ANTLR start "rule__Pourcent_vitesse_deplacement_max__Group__3"
    // InternalMyTurtleDsl.g:2417:1: rule__Pourcent_vitesse_deplacement_max__Group__3 : rule__Pourcent_vitesse_deplacement_max__Group__3__Impl ;
    public final void rule__Pourcent_vitesse_deplacement_max__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2421:1: ( rule__Pourcent_vitesse_deplacement_max__Group__3__Impl )
            // InternalMyTurtleDsl.g:2422:2: rule__Pourcent_vitesse_deplacement_max__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pourcent_vitesse_deplacement_max__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pourcent_vitesse_deplacement_max__Group__3"


    // $ANTLR start "rule__Pourcent_vitesse_deplacement_max__Group__3__Impl"
    // InternalMyTurtleDsl.g:2428:1: rule__Pourcent_vitesse_deplacement_max__Group__3__Impl : ( ')' ) ;
    public final void rule__Pourcent_vitesse_deplacement_max__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2432:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:2433:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:2433:1: ( ')' )
            // InternalMyTurtleDsl.g:2434:2: ')'
            {
             before(grammarAccess.getPourcent_vitesse_deplacement_maxAccess().getRightParenthesisKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPourcent_vitesse_deplacement_maxAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pourcent_vitesse_deplacement_max__Group__3__Impl"


    // $ANTLR start "rule__Pourcent_vitesse_rotation_max__Group__0"
    // InternalMyTurtleDsl.g:2444:1: rule__Pourcent_vitesse_rotation_max__Group__0 : rule__Pourcent_vitesse_rotation_max__Group__0__Impl rule__Pourcent_vitesse_rotation_max__Group__1 ;
    public final void rule__Pourcent_vitesse_rotation_max__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2448:1: ( rule__Pourcent_vitesse_rotation_max__Group__0__Impl rule__Pourcent_vitesse_rotation_max__Group__1 )
            // InternalMyTurtleDsl.g:2449:2: rule__Pourcent_vitesse_rotation_max__Group__0__Impl rule__Pourcent_vitesse_rotation_max__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Pourcent_vitesse_rotation_max__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pourcent_vitesse_rotation_max__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pourcent_vitesse_rotation_max__Group__0"


    // $ANTLR start "rule__Pourcent_vitesse_rotation_max__Group__0__Impl"
    // InternalMyTurtleDsl.g:2456:1: rule__Pourcent_vitesse_rotation_max__Group__0__Impl : ( 'def_pourcent_vitesse_rotation_max' ) ;
    public final void rule__Pourcent_vitesse_rotation_max__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2460:1: ( ( 'def_pourcent_vitesse_rotation_max' ) )
            // InternalMyTurtleDsl.g:2461:1: ( 'def_pourcent_vitesse_rotation_max' )
            {
            // InternalMyTurtleDsl.g:2461:1: ( 'def_pourcent_vitesse_rotation_max' )
            // InternalMyTurtleDsl.g:2462:2: 'def_pourcent_vitesse_rotation_max'
            {
             before(grammarAccess.getPourcent_vitesse_rotation_maxAccess().getDef_pourcent_vitesse_rotation_maxKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPourcent_vitesse_rotation_maxAccess().getDef_pourcent_vitesse_rotation_maxKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pourcent_vitesse_rotation_max__Group__0__Impl"


    // $ANTLR start "rule__Pourcent_vitesse_rotation_max__Group__1"
    // InternalMyTurtleDsl.g:2471:1: rule__Pourcent_vitesse_rotation_max__Group__1 : rule__Pourcent_vitesse_rotation_max__Group__1__Impl rule__Pourcent_vitesse_rotation_max__Group__2 ;
    public final void rule__Pourcent_vitesse_rotation_max__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2475:1: ( rule__Pourcent_vitesse_rotation_max__Group__1__Impl rule__Pourcent_vitesse_rotation_max__Group__2 )
            // InternalMyTurtleDsl.g:2476:2: rule__Pourcent_vitesse_rotation_max__Group__1__Impl rule__Pourcent_vitesse_rotation_max__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Pourcent_vitesse_rotation_max__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pourcent_vitesse_rotation_max__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pourcent_vitesse_rotation_max__Group__1"


    // $ANTLR start "rule__Pourcent_vitesse_rotation_max__Group__1__Impl"
    // InternalMyTurtleDsl.g:2483:1: rule__Pourcent_vitesse_rotation_max__Group__1__Impl : ( '(' ) ;
    public final void rule__Pourcent_vitesse_rotation_max__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2487:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:2488:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:2488:1: ( '(' )
            // InternalMyTurtleDsl.g:2489:2: '('
            {
             before(grammarAccess.getPourcent_vitesse_rotation_maxAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPourcent_vitesse_rotation_maxAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pourcent_vitesse_rotation_max__Group__1__Impl"


    // $ANTLR start "rule__Pourcent_vitesse_rotation_max__Group__2"
    // InternalMyTurtleDsl.g:2498:1: rule__Pourcent_vitesse_rotation_max__Group__2 : rule__Pourcent_vitesse_rotation_max__Group__2__Impl rule__Pourcent_vitesse_rotation_max__Group__3 ;
    public final void rule__Pourcent_vitesse_rotation_max__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2502:1: ( rule__Pourcent_vitesse_rotation_max__Group__2__Impl rule__Pourcent_vitesse_rotation_max__Group__3 )
            // InternalMyTurtleDsl.g:2503:2: rule__Pourcent_vitesse_rotation_max__Group__2__Impl rule__Pourcent_vitesse_rotation_max__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Pourcent_vitesse_rotation_max__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pourcent_vitesse_rotation_max__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pourcent_vitesse_rotation_max__Group__2"


    // $ANTLR start "rule__Pourcent_vitesse_rotation_max__Group__2__Impl"
    // InternalMyTurtleDsl.g:2510:1: rule__Pourcent_vitesse_rotation_max__Group__2__Impl : ( ( rule__Pourcent_vitesse_rotation_max__Vitesse_deplacementAssignment_2 ) ) ;
    public final void rule__Pourcent_vitesse_rotation_max__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2514:1: ( ( ( rule__Pourcent_vitesse_rotation_max__Vitesse_deplacementAssignment_2 ) ) )
            // InternalMyTurtleDsl.g:2515:1: ( ( rule__Pourcent_vitesse_rotation_max__Vitesse_deplacementAssignment_2 ) )
            {
            // InternalMyTurtleDsl.g:2515:1: ( ( rule__Pourcent_vitesse_rotation_max__Vitesse_deplacementAssignment_2 ) )
            // InternalMyTurtleDsl.g:2516:2: ( rule__Pourcent_vitesse_rotation_max__Vitesse_deplacementAssignment_2 )
            {
             before(grammarAccess.getPourcent_vitesse_rotation_maxAccess().getVitesse_deplacementAssignment_2()); 
            // InternalMyTurtleDsl.g:2517:2: ( rule__Pourcent_vitesse_rotation_max__Vitesse_deplacementAssignment_2 )
            // InternalMyTurtleDsl.g:2517:3: rule__Pourcent_vitesse_rotation_max__Vitesse_deplacementAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Pourcent_vitesse_rotation_max__Vitesse_deplacementAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPourcent_vitesse_rotation_maxAccess().getVitesse_deplacementAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pourcent_vitesse_rotation_max__Group__2__Impl"


    // $ANTLR start "rule__Pourcent_vitesse_rotation_max__Group__3"
    // InternalMyTurtleDsl.g:2525:1: rule__Pourcent_vitesse_rotation_max__Group__3 : rule__Pourcent_vitesse_rotation_max__Group__3__Impl ;
    public final void rule__Pourcent_vitesse_rotation_max__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2529:1: ( rule__Pourcent_vitesse_rotation_max__Group__3__Impl )
            // InternalMyTurtleDsl.g:2530:2: rule__Pourcent_vitesse_rotation_max__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pourcent_vitesse_rotation_max__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pourcent_vitesse_rotation_max__Group__3"


    // $ANTLR start "rule__Pourcent_vitesse_rotation_max__Group__3__Impl"
    // InternalMyTurtleDsl.g:2536:1: rule__Pourcent_vitesse_rotation_max__Group__3__Impl : ( ')' ) ;
    public final void rule__Pourcent_vitesse_rotation_max__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2540:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:2541:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:2541:1: ( ')' )
            // InternalMyTurtleDsl.g:2542:2: ')'
            {
             before(grammarAccess.getPourcent_vitesse_rotation_maxAccess().getRightParenthesisKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPourcent_vitesse_rotation_maxAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pourcent_vitesse_rotation_max__Group__3__Impl"


    // $ANTLR start "rule__Hauteur_max__Group__0"
    // InternalMyTurtleDsl.g:2552:1: rule__Hauteur_max__Group__0 : rule__Hauteur_max__Group__0__Impl rule__Hauteur_max__Group__1 ;
    public final void rule__Hauteur_max__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2556:1: ( rule__Hauteur_max__Group__0__Impl rule__Hauteur_max__Group__1 )
            // InternalMyTurtleDsl.g:2557:2: rule__Hauteur_max__Group__0__Impl rule__Hauteur_max__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Hauteur_max__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hauteur_max__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hauteur_max__Group__0"


    // $ANTLR start "rule__Hauteur_max__Group__0__Impl"
    // InternalMyTurtleDsl.g:2564:1: rule__Hauteur_max__Group__0__Impl : ( 'def_hauteur_max' ) ;
    public final void rule__Hauteur_max__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2568:1: ( ( 'def_hauteur_max' ) )
            // InternalMyTurtleDsl.g:2569:1: ( 'def_hauteur_max' )
            {
            // InternalMyTurtleDsl.g:2569:1: ( 'def_hauteur_max' )
            // InternalMyTurtleDsl.g:2570:2: 'def_hauteur_max'
            {
             before(grammarAccess.getHauteur_maxAccess().getDef_hauteur_maxKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getHauteur_maxAccess().getDef_hauteur_maxKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hauteur_max__Group__0__Impl"


    // $ANTLR start "rule__Hauteur_max__Group__1"
    // InternalMyTurtleDsl.g:2579:1: rule__Hauteur_max__Group__1 : rule__Hauteur_max__Group__1__Impl rule__Hauteur_max__Group__2 ;
    public final void rule__Hauteur_max__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2583:1: ( rule__Hauteur_max__Group__1__Impl rule__Hauteur_max__Group__2 )
            // InternalMyTurtleDsl.g:2584:2: rule__Hauteur_max__Group__1__Impl rule__Hauteur_max__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Hauteur_max__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hauteur_max__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hauteur_max__Group__1"


    // $ANTLR start "rule__Hauteur_max__Group__1__Impl"
    // InternalMyTurtleDsl.g:2591:1: rule__Hauteur_max__Group__1__Impl : ( '(' ) ;
    public final void rule__Hauteur_max__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2595:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:2596:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:2596:1: ( '(' )
            // InternalMyTurtleDsl.g:2597:2: '('
            {
             before(grammarAccess.getHauteur_maxAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getHauteur_maxAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hauteur_max__Group__1__Impl"


    // $ANTLR start "rule__Hauteur_max__Group__2"
    // InternalMyTurtleDsl.g:2606:1: rule__Hauteur_max__Group__2 : rule__Hauteur_max__Group__2__Impl rule__Hauteur_max__Group__3 ;
    public final void rule__Hauteur_max__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2610:1: ( rule__Hauteur_max__Group__2__Impl rule__Hauteur_max__Group__3 )
            // InternalMyTurtleDsl.g:2611:2: rule__Hauteur_max__Group__2__Impl rule__Hauteur_max__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Hauteur_max__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hauteur_max__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hauteur_max__Group__2"


    // $ANTLR start "rule__Hauteur_max__Group__2__Impl"
    // InternalMyTurtleDsl.g:2618:1: rule__Hauteur_max__Group__2__Impl : ( ( rule__Hauteur_max__Hauteur_maxAssignment_2 ) ) ;
    public final void rule__Hauteur_max__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2622:1: ( ( ( rule__Hauteur_max__Hauteur_maxAssignment_2 ) ) )
            // InternalMyTurtleDsl.g:2623:1: ( ( rule__Hauteur_max__Hauteur_maxAssignment_2 ) )
            {
            // InternalMyTurtleDsl.g:2623:1: ( ( rule__Hauteur_max__Hauteur_maxAssignment_2 ) )
            // InternalMyTurtleDsl.g:2624:2: ( rule__Hauteur_max__Hauteur_maxAssignment_2 )
            {
             before(grammarAccess.getHauteur_maxAccess().getHauteur_maxAssignment_2()); 
            // InternalMyTurtleDsl.g:2625:2: ( rule__Hauteur_max__Hauteur_maxAssignment_2 )
            // InternalMyTurtleDsl.g:2625:3: rule__Hauteur_max__Hauteur_maxAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Hauteur_max__Hauteur_maxAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHauteur_maxAccess().getHauteur_maxAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hauteur_max__Group__2__Impl"


    // $ANTLR start "rule__Hauteur_max__Group__3"
    // InternalMyTurtleDsl.g:2633:1: rule__Hauteur_max__Group__3 : rule__Hauteur_max__Group__3__Impl ;
    public final void rule__Hauteur_max__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2637:1: ( rule__Hauteur_max__Group__3__Impl )
            // InternalMyTurtleDsl.g:2638:2: rule__Hauteur_max__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Hauteur_max__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hauteur_max__Group__3"


    // $ANTLR start "rule__Hauteur_max__Group__3__Impl"
    // InternalMyTurtleDsl.g:2644:1: rule__Hauteur_max__Group__3__Impl : ( ')' ) ;
    public final void rule__Hauteur_max__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2648:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:2649:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:2649:1: ( ')' )
            // InternalMyTurtleDsl.g:2650:2: ')'
            {
             before(grammarAccess.getHauteur_maxAccess().getRightParenthesisKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getHauteur_maxAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hauteur_max__Group__3__Impl"


    // $ANTLR start "rule__Eloignement_max__Group__0"
    // InternalMyTurtleDsl.g:2660:1: rule__Eloignement_max__Group__0 : rule__Eloignement_max__Group__0__Impl rule__Eloignement_max__Group__1 ;
    public final void rule__Eloignement_max__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2664:1: ( rule__Eloignement_max__Group__0__Impl rule__Eloignement_max__Group__1 )
            // InternalMyTurtleDsl.g:2665:2: rule__Eloignement_max__Group__0__Impl rule__Eloignement_max__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Eloignement_max__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Eloignement_max__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eloignement_max__Group__0"


    // $ANTLR start "rule__Eloignement_max__Group__0__Impl"
    // InternalMyTurtleDsl.g:2672:1: rule__Eloignement_max__Group__0__Impl : ( 'def_eloignement_max' ) ;
    public final void rule__Eloignement_max__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2676:1: ( ( 'def_eloignement_max' ) )
            // InternalMyTurtleDsl.g:2677:1: ( 'def_eloignement_max' )
            {
            // InternalMyTurtleDsl.g:2677:1: ( 'def_eloignement_max' )
            // InternalMyTurtleDsl.g:2678:2: 'def_eloignement_max'
            {
             before(grammarAccess.getEloignement_maxAccess().getDef_eloignement_maxKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEloignement_maxAccess().getDef_eloignement_maxKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eloignement_max__Group__0__Impl"


    // $ANTLR start "rule__Eloignement_max__Group__1"
    // InternalMyTurtleDsl.g:2687:1: rule__Eloignement_max__Group__1 : rule__Eloignement_max__Group__1__Impl rule__Eloignement_max__Group__2 ;
    public final void rule__Eloignement_max__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2691:1: ( rule__Eloignement_max__Group__1__Impl rule__Eloignement_max__Group__2 )
            // InternalMyTurtleDsl.g:2692:2: rule__Eloignement_max__Group__1__Impl rule__Eloignement_max__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Eloignement_max__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Eloignement_max__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eloignement_max__Group__1"


    // $ANTLR start "rule__Eloignement_max__Group__1__Impl"
    // InternalMyTurtleDsl.g:2699:1: rule__Eloignement_max__Group__1__Impl : ( '(' ) ;
    public final void rule__Eloignement_max__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2703:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:2704:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:2704:1: ( '(' )
            // InternalMyTurtleDsl.g:2705:2: '('
            {
             before(grammarAccess.getEloignement_maxAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEloignement_maxAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eloignement_max__Group__1__Impl"


    // $ANTLR start "rule__Eloignement_max__Group__2"
    // InternalMyTurtleDsl.g:2714:1: rule__Eloignement_max__Group__2 : rule__Eloignement_max__Group__2__Impl rule__Eloignement_max__Group__3 ;
    public final void rule__Eloignement_max__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2718:1: ( rule__Eloignement_max__Group__2__Impl rule__Eloignement_max__Group__3 )
            // InternalMyTurtleDsl.g:2719:2: rule__Eloignement_max__Group__2__Impl rule__Eloignement_max__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Eloignement_max__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Eloignement_max__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eloignement_max__Group__2"


    // $ANTLR start "rule__Eloignement_max__Group__2__Impl"
    // InternalMyTurtleDsl.g:2726:1: rule__Eloignement_max__Group__2__Impl : ( ( rule__Eloignement_max__Hauteur_maxAssignment_2 ) ) ;
    public final void rule__Eloignement_max__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2730:1: ( ( ( rule__Eloignement_max__Hauteur_maxAssignment_2 ) ) )
            // InternalMyTurtleDsl.g:2731:1: ( ( rule__Eloignement_max__Hauteur_maxAssignment_2 ) )
            {
            // InternalMyTurtleDsl.g:2731:1: ( ( rule__Eloignement_max__Hauteur_maxAssignment_2 ) )
            // InternalMyTurtleDsl.g:2732:2: ( rule__Eloignement_max__Hauteur_maxAssignment_2 )
            {
             before(grammarAccess.getEloignement_maxAccess().getHauteur_maxAssignment_2()); 
            // InternalMyTurtleDsl.g:2733:2: ( rule__Eloignement_max__Hauteur_maxAssignment_2 )
            // InternalMyTurtleDsl.g:2733:3: rule__Eloignement_max__Hauteur_maxAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Eloignement_max__Hauteur_maxAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEloignement_maxAccess().getHauteur_maxAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eloignement_max__Group__2__Impl"


    // $ANTLR start "rule__Eloignement_max__Group__3"
    // InternalMyTurtleDsl.g:2741:1: rule__Eloignement_max__Group__3 : rule__Eloignement_max__Group__3__Impl ;
    public final void rule__Eloignement_max__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2745:1: ( rule__Eloignement_max__Group__3__Impl )
            // InternalMyTurtleDsl.g:2746:2: rule__Eloignement_max__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Eloignement_max__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eloignement_max__Group__3"


    // $ANTLR start "rule__Eloignement_max__Group__3__Impl"
    // InternalMyTurtleDsl.g:2752:1: rule__Eloignement_max__Group__3__Impl : ( ')' ) ;
    public final void rule__Eloignement_max__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2756:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:2757:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:2757:1: ( ')' )
            // InternalMyTurtleDsl.g:2758:2: ')'
            {
             before(grammarAccess.getEloignement_maxAccess().getRightParenthesisKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEloignement_maxAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eloignement_max__Group__3__Impl"


    // $ANTLR start "rule__Decoller__Group__0"
    // InternalMyTurtleDsl.g:2768:1: rule__Decoller__Group__0 : rule__Decoller__Group__0__Impl rule__Decoller__Group__1 ;
    public final void rule__Decoller__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2772:1: ( rule__Decoller__Group__0__Impl rule__Decoller__Group__1 )
            // InternalMyTurtleDsl.g:2773:2: rule__Decoller__Group__0__Impl rule__Decoller__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Decoller__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Decoller__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decoller__Group__0"


    // $ANTLR start "rule__Decoller__Group__0__Impl"
    // InternalMyTurtleDsl.g:2780:1: rule__Decoller__Group__0__Impl : ( 'decoller' ) ;
    public final void rule__Decoller__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2784:1: ( ( 'decoller' ) )
            // InternalMyTurtleDsl.g:2785:1: ( 'decoller' )
            {
            // InternalMyTurtleDsl.g:2785:1: ( 'decoller' )
            // InternalMyTurtleDsl.g:2786:2: 'decoller'
            {
             before(grammarAccess.getDecollerAccess().getDecollerKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDecollerAccess().getDecollerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decoller__Group__0__Impl"


    // $ANTLR start "rule__Decoller__Group__1"
    // InternalMyTurtleDsl.g:2795:1: rule__Decoller__Group__1 : rule__Decoller__Group__1__Impl rule__Decoller__Group__2 ;
    public final void rule__Decoller__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2799:1: ( rule__Decoller__Group__1__Impl rule__Decoller__Group__2 )
            // InternalMyTurtleDsl.g:2800:2: rule__Decoller__Group__1__Impl rule__Decoller__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Decoller__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Decoller__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decoller__Group__1"


    // $ANTLR start "rule__Decoller__Group__1__Impl"
    // InternalMyTurtleDsl.g:2807:1: rule__Decoller__Group__1__Impl : ( '(' ) ;
    public final void rule__Decoller__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2811:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:2812:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:2812:1: ( '(' )
            // InternalMyTurtleDsl.g:2813:2: '('
            {
             before(grammarAccess.getDecollerAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDecollerAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decoller__Group__1__Impl"


    // $ANTLR start "rule__Decoller__Group__2"
    // InternalMyTurtleDsl.g:2822:1: rule__Decoller__Group__2 : rule__Decoller__Group__2__Impl ;
    public final void rule__Decoller__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2826:1: ( rule__Decoller__Group__2__Impl )
            // InternalMyTurtleDsl.g:2827:2: rule__Decoller__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Decoller__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decoller__Group__2"


    // $ANTLR start "rule__Decoller__Group__2__Impl"
    // InternalMyTurtleDsl.g:2833:1: rule__Decoller__Group__2__Impl : ( ')' ) ;
    public final void rule__Decoller__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2837:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:2838:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:2838:1: ( ')' )
            // InternalMyTurtleDsl.g:2839:2: ')'
            {
             before(grammarAccess.getDecollerAccess().getRightParenthesisKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDecollerAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decoller__Group__2__Impl"


    // $ANTLR start "rule__Atterrir__Group__0"
    // InternalMyTurtleDsl.g:2849:1: rule__Atterrir__Group__0 : rule__Atterrir__Group__0__Impl rule__Atterrir__Group__1 ;
    public final void rule__Atterrir__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2853:1: ( rule__Atterrir__Group__0__Impl rule__Atterrir__Group__1 )
            // InternalMyTurtleDsl.g:2854:2: rule__Atterrir__Group__0__Impl rule__Atterrir__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Atterrir__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atterrir__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atterrir__Group__0"


    // $ANTLR start "rule__Atterrir__Group__0__Impl"
    // InternalMyTurtleDsl.g:2861:1: rule__Atterrir__Group__0__Impl : ( 'atterrir' ) ;
    public final void rule__Atterrir__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2865:1: ( ( 'atterrir' ) )
            // InternalMyTurtleDsl.g:2866:1: ( 'atterrir' )
            {
            // InternalMyTurtleDsl.g:2866:1: ( 'atterrir' )
            // InternalMyTurtleDsl.g:2867:2: 'atterrir'
            {
             before(grammarAccess.getAtterrirAccess().getAtterrirKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAtterrirAccess().getAtterrirKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atterrir__Group__0__Impl"


    // $ANTLR start "rule__Atterrir__Group__1"
    // InternalMyTurtleDsl.g:2876:1: rule__Atterrir__Group__1 : rule__Atterrir__Group__1__Impl rule__Atterrir__Group__2 ;
    public final void rule__Atterrir__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2880:1: ( rule__Atterrir__Group__1__Impl rule__Atterrir__Group__2 )
            // InternalMyTurtleDsl.g:2881:2: rule__Atterrir__Group__1__Impl rule__Atterrir__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Atterrir__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atterrir__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atterrir__Group__1"


    // $ANTLR start "rule__Atterrir__Group__1__Impl"
    // InternalMyTurtleDsl.g:2888:1: rule__Atterrir__Group__1__Impl : ( '(' ) ;
    public final void rule__Atterrir__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2892:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:2893:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:2893:1: ( '(' )
            // InternalMyTurtleDsl.g:2894:2: '('
            {
             before(grammarAccess.getAtterrirAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAtterrirAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atterrir__Group__1__Impl"


    // $ANTLR start "rule__Atterrir__Group__2"
    // InternalMyTurtleDsl.g:2903:1: rule__Atterrir__Group__2 : rule__Atterrir__Group__2__Impl ;
    public final void rule__Atterrir__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2907:1: ( rule__Atterrir__Group__2__Impl )
            // InternalMyTurtleDsl.g:2908:2: rule__Atterrir__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atterrir__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atterrir__Group__2"


    // $ANTLR start "rule__Atterrir__Group__2__Impl"
    // InternalMyTurtleDsl.g:2914:1: rule__Atterrir__Group__2__Impl : ( ')' ) ;
    public final void rule__Atterrir__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2918:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:2919:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:2919:1: ( ')' )
            // InternalMyTurtleDsl.g:2920:2: ')'
            {
             before(grammarAccess.getAtterrirAccess().getRightParenthesisKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAtterrirAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atterrir__Group__2__Impl"


    // $ANTLR start "rule__Monter__Group__0"
    // InternalMyTurtleDsl.g:2930:1: rule__Monter__Group__0 : rule__Monter__Group__0__Impl rule__Monter__Group__1 ;
    public final void rule__Monter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2934:1: ( rule__Monter__Group__0__Impl rule__Monter__Group__1 )
            // InternalMyTurtleDsl.g:2935:2: rule__Monter__Group__0__Impl rule__Monter__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Monter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Monter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monter__Group__0"


    // $ANTLR start "rule__Monter__Group__0__Impl"
    // InternalMyTurtleDsl.g:2942:1: rule__Monter__Group__0__Impl : ( 'monter' ) ;
    public final void rule__Monter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2946:1: ( ( 'monter' ) )
            // InternalMyTurtleDsl.g:2947:1: ( 'monter' )
            {
            // InternalMyTurtleDsl.g:2947:1: ( 'monter' )
            // InternalMyTurtleDsl.g:2948:2: 'monter'
            {
             before(grammarAccess.getMonterAccess().getMonterKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMonterAccess().getMonterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monter__Group__0__Impl"


    // $ANTLR start "rule__Monter__Group__1"
    // InternalMyTurtleDsl.g:2957:1: rule__Monter__Group__1 : rule__Monter__Group__1__Impl rule__Monter__Group__2 ;
    public final void rule__Monter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2961:1: ( rule__Monter__Group__1__Impl rule__Monter__Group__2 )
            // InternalMyTurtleDsl.g:2962:2: rule__Monter__Group__1__Impl rule__Monter__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Monter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Monter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monter__Group__1"


    // $ANTLR start "rule__Monter__Group__1__Impl"
    // InternalMyTurtleDsl.g:2969:1: rule__Monter__Group__1__Impl : ( '(' ) ;
    public final void rule__Monter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2973:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:2974:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:2974:1: ( '(' )
            // InternalMyTurtleDsl.g:2975:2: '('
            {
             before(grammarAccess.getMonterAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMonterAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monter__Group__1__Impl"


    // $ANTLR start "rule__Monter__Group__2"
    // InternalMyTurtleDsl.g:2984:1: rule__Monter__Group__2 : rule__Monter__Group__2__Impl rule__Monter__Group__3 ;
    public final void rule__Monter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2988:1: ( rule__Monter__Group__2__Impl rule__Monter__Group__3 )
            // InternalMyTurtleDsl.g:2989:2: rule__Monter__Group__2__Impl rule__Monter__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Monter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Monter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monter__Group__2"


    // $ANTLR start "rule__Monter__Group__2__Impl"
    // InternalMyTurtleDsl.g:2996:1: rule__Monter__Group__2__Impl : ( ( rule__Monter__DureeAssignment_2 ) ) ;
    public final void rule__Monter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3000:1: ( ( ( rule__Monter__DureeAssignment_2 ) ) )
            // InternalMyTurtleDsl.g:3001:1: ( ( rule__Monter__DureeAssignment_2 ) )
            {
            // InternalMyTurtleDsl.g:3001:1: ( ( rule__Monter__DureeAssignment_2 ) )
            // InternalMyTurtleDsl.g:3002:2: ( rule__Monter__DureeAssignment_2 )
            {
             before(grammarAccess.getMonterAccess().getDureeAssignment_2()); 
            // InternalMyTurtleDsl.g:3003:2: ( rule__Monter__DureeAssignment_2 )
            // InternalMyTurtleDsl.g:3003:3: rule__Monter__DureeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Monter__DureeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMonterAccess().getDureeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monter__Group__2__Impl"


    // $ANTLR start "rule__Monter__Group__3"
    // InternalMyTurtleDsl.g:3011:1: rule__Monter__Group__3 : rule__Monter__Group__3__Impl rule__Monter__Group__4 ;
    public final void rule__Monter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3015:1: ( rule__Monter__Group__3__Impl rule__Monter__Group__4 )
            // InternalMyTurtleDsl.g:3016:2: rule__Monter__Group__3__Impl rule__Monter__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Monter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Monter__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monter__Group__3"


    // $ANTLR start "rule__Monter__Group__3__Impl"
    // InternalMyTurtleDsl.g:3023:1: rule__Monter__Group__3__Impl : ( ',' ) ;
    public final void rule__Monter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3027:1: ( ( ',' ) )
            // InternalMyTurtleDsl.g:3028:1: ( ',' )
            {
            // InternalMyTurtleDsl.g:3028:1: ( ',' )
            // InternalMyTurtleDsl.g:3029:2: ','
            {
             before(grammarAccess.getMonterAccess().getCommaKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMonterAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monter__Group__3__Impl"


    // $ANTLR start "rule__Monter__Group__4"
    // InternalMyTurtleDsl.g:3038:1: rule__Monter__Group__4 : rule__Monter__Group__4__Impl rule__Monter__Group__5 ;
    public final void rule__Monter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3042:1: ( rule__Monter__Group__4__Impl rule__Monter__Group__5 )
            // InternalMyTurtleDsl.g:3043:2: rule__Monter__Group__4__Impl rule__Monter__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__Monter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Monter__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monter__Group__4"


    // $ANTLR start "rule__Monter__Group__4__Impl"
    // InternalMyTurtleDsl.g:3050:1: rule__Monter__Group__4__Impl : ( ( rule__Monter__Vitesse_verticaleAssignment_4 ) ) ;
    public final void rule__Monter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3054:1: ( ( ( rule__Monter__Vitesse_verticaleAssignment_4 ) ) )
            // InternalMyTurtleDsl.g:3055:1: ( ( rule__Monter__Vitesse_verticaleAssignment_4 ) )
            {
            // InternalMyTurtleDsl.g:3055:1: ( ( rule__Monter__Vitesse_verticaleAssignment_4 ) )
            // InternalMyTurtleDsl.g:3056:2: ( rule__Monter__Vitesse_verticaleAssignment_4 )
            {
             before(grammarAccess.getMonterAccess().getVitesse_verticaleAssignment_4()); 
            // InternalMyTurtleDsl.g:3057:2: ( rule__Monter__Vitesse_verticaleAssignment_4 )
            // InternalMyTurtleDsl.g:3057:3: rule__Monter__Vitesse_verticaleAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Monter__Vitesse_verticaleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMonterAccess().getVitesse_verticaleAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monter__Group__4__Impl"


    // $ANTLR start "rule__Monter__Group__5"
    // InternalMyTurtleDsl.g:3065:1: rule__Monter__Group__5 : rule__Monter__Group__5__Impl ;
    public final void rule__Monter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3069:1: ( rule__Monter__Group__5__Impl )
            // InternalMyTurtleDsl.g:3070:2: rule__Monter__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Monter__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monter__Group__5"


    // $ANTLR start "rule__Monter__Group__5__Impl"
    // InternalMyTurtleDsl.g:3076:1: rule__Monter__Group__5__Impl : ( ')' ) ;
    public final void rule__Monter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3080:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:3081:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:3081:1: ( ')' )
            // InternalMyTurtleDsl.g:3082:2: ')'
            {
             before(grammarAccess.getMonterAccess().getRightParenthesisKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMonterAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monter__Group__5__Impl"


    // $ANTLR start "rule__Descendre__Group__0"
    // InternalMyTurtleDsl.g:3092:1: rule__Descendre__Group__0 : rule__Descendre__Group__0__Impl rule__Descendre__Group__1 ;
    public final void rule__Descendre__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3096:1: ( rule__Descendre__Group__0__Impl rule__Descendre__Group__1 )
            // InternalMyTurtleDsl.g:3097:2: rule__Descendre__Group__0__Impl rule__Descendre__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Descendre__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Descendre__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Descendre__Group__0"


    // $ANTLR start "rule__Descendre__Group__0__Impl"
    // InternalMyTurtleDsl.g:3104:1: rule__Descendre__Group__0__Impl : ( 'descendre' ) ;
    public final void rule__Descendre__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3108:1: ( ( 'descendre' ) )
            // InternalMyTurtleDsl.g:3109:1: ( 'descendre' )
            {
            // InternalMyTurtleDsl.g:3109:1: ( 'descendre' )
            // InternalMyTurtleDsl.g:3110:2: 'descendre'
            {
             before(grammarAccess.getDescendreAccess().getDescendreKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDescendreAccess().getDescendreKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Descendre__Group__0__Impl"


    // $ANTLR start "rule__Descendre__Group__1"
    // InternalMyTurtleDsl.g:3119:1: rule__Descendre__Group__1 : rule__Descendre__Group__1__Impl rule__Descendre__Group__2 ;
    public final void rule__Descendre__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3123:1: ( rule__Descendre__Group__1__Impl rule__Descendre__Group__2 )
            // InternalMyTurtleDsl.g:3124:2: rule__Descendre__Group__1__Impl rule__Descendre__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Descendre__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Descendre__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Descendre__Group__1"


    // $ANTLR start "rule__Descendre__Group__1__Impl"
    // InternalMyTurtleDsl.g:3131:1: rule__Descendre__Group__1__Impl : ( '(' ) ;
    public final void rule__Descendre__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3135:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:3136:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:3136:1: ( '(' )
            // InternalMyTurtleDsl.g:3137:2: '('
            {
             before(grammarAccess.getDescendreAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDescendreAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Descendre__Group__1__Impl"


    // $ANTLR start "rule__Descendre__Group__2"
    // InternalMyTurtleDsl.g:3146:1: rule__Descendre__Group__2 : rule__Descendre__Group__2__Impl rule__Descendre__Group__3 ;
    public final void rule__Descendre__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3150:1: ( rule__Descendre__Group__2__Impl rule__Descendre__Group__3 )
            // InternalMyTurtleDsl.g:3151:2: rule__Descendre__Group__2__Impl rule__Descendre__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Descendre__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Descendre__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Descendre__Group__2"


    // $ANTLR start "rule__Descendre__Group__2__Impl"
    // InternalMyTurtleDsl.g:3158:1: rule__Descendre__Group__2__Impl : ( ( rule__Descendre__DureeAssignment_2 ) ) ;
    public final void rule__Descendre__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3162:1: ( ( ( rule__Descendre__DureeAssignment_2 ) ) )
            // InternalMyTurtleDsl.g:3163:1: ( ( rule__Descendre__DureeAssignment_2 ) )
            {
            // InternalMyTurtleDsl.g:3163:1: ( ( rule__Descendre__DureeAssignment_2 ) )
            // InternalMyTurtleDsl.g:3164:2: ( rule__Descendre__DureeAssignment_2 )
            {
             before(grammarAccess.getDescendreAccess().getDureeAssignment_2()); 
            // InternalMyTurtleDsl.g:3165:2: ( rule__Descendre__DureeAssignment_2 )
            // InternalMyTurtleDsl.g:3165:3: rule__Descendre__DureeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Descendre__DureeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDescendreAccess().getDureeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Descendre__Group__2__Impl"


    // $ANTLR start "rule__Descendre__Group__3"
    // InternalMyTurtleDsl.g:3173:1: rule__Descendre__Group__3 : rule__Descendre__Group__3__Impl rule__Descendre__Group__4 ;
    public final void rule__Descendre__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3177:1: ( rule__Descendre__Group__3__Impl rule__Descendre__Group__4 )
            // InternalMyTurtleDsl.g:3178:2: rule__Descendre__Group__3__Impl rule__Descendre__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Descendre__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Descendre__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Descendre__Group__3"


    // $ANTLR start "rule__Descendre__Group__3__Impl"
    // InternalMyTurtleDsl.g:3185:1: rule__Descendre__Group__3__Impl : ( ',' ) ;
    public final void rule__Descendre__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3189:1: ( ( ',' ) )
            // InternalMyTurtleDsl.g:3190:1: ( ',' )
            {
            // InternalMyTurtleDsl.g:3190:1: ( ',' )
            // InternalMyTurtleDsl.g:3191:2: ','
            {
             before(grammarAccess.getDescendreAccess().getCommaKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDescendreAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Descendre__Group__3__Impl"


    // $ANTLR start "rule__Descendre__Group__4"
    // InternalMyTurtleDsl.g:3200:1: rule__Descendre__Group__4 : rule__Descendre__Group__4__Impl rule__Descendre__Group__5 ;
    public final void rule__Descendre__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3204:1: ( rule__Descendre__Group__4__Impl rule__Descendre__Group__5 )
            // InternalMyTurtleDsl.g:3205:2: rule__Descendre__Group__4__Impl rule__Descendre__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__Descendre__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Descendre__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Descendre__Group__4"


    // $ANTLR start "rule__Descendre__Group__4__Impl"
    // InternalMyTurtleDsl.g:3212:1: rule__Descendre__Group__4__Impl : ( ( rule__Descendre__Vitesse_verticaleAssignment_4 ) ) ;
    public final void rule__Descendre__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3216:1: ( ( ( rule__Descendre__Vitesse_verticaleAssignment_4 ) ) )
            // InternalMyTurtleDsl.g:3217:1: ( ( rule__Descendre__Vitesse_verticaleAssignment_4 ) )
            {
            // InternalMyTurtleDsl.g:3217:1: ( ( rule__Descendre__Vitesse_verticaleAssignment_4 ) )
            // InternalMyTurtleDsl.g:3218:2: ( rule__Descendre__Vitesse_verticaleAssignment_4 )
            {
             before(grammarAccess.getDescendreAccess().getVitesse_verticaleAssignment_4()); 
            // InternalMyTurtleDsl.g:3219:2: ( rule__Descendre__Vitesse_verticaleAssignment_4 )
            // InternalMyTurtleDsl.g:3219:3: rule__Descendre__Vitesse_verticaleAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Descendre__Vitesse_verticaleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDescendreAccess().getVitesse_verticaleAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Descendre__Group__4__Impl"


    // $ANTLR start "rule__Descendre__Group__5"
    // InternalMyTurtleDsl.g:3227:1: rule__Descendre__Group__5 : rule__Descendre__Group__5__Impl ;
    public final void rule__Descendre__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3231:1: ( rule__Descendre__Group__5__Impl )
            // InternalMyTurtleDsl.g:3232:2: rule__Descendre__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Descendre__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Descendre__Group__5"


    // $ANTLR start "rule__Descendre__Group__5__Impl"
    // InternalMyTurtleDsl.g:3238:1: rule__Descendre__Group__5__Impl : ( ')' ) ;
    public final void rule__Descendre__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3242:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:3243:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:3243:1: ( ')' )
            // InternalMyTurtleDsl.g:3244:2: ')'
            {
             before(grammarAccess.getDescendreAccess().getRightParenthesisKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDescendreAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Descendre__Group__5__Impl"


    // $ANTLR start "rule__Avancer__Group__0"
    // InternalMyTurtleDsl.g:3254:1: rule__Avancer__Group__0 : rule__Avancer__Group__0__Impl rule__Avancer__Group__1 ;
    public final void rule__Avancer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3258:1: ( rule__Avancer__Group__0__Impl rule__Avancer__Group__1 )
            // InternalMyTurtleDsl.g:3259:2: rule__Avancer__Group__0__Impl rule__Avancer__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Avancer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Avancer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Avancer__Group__0"


    // $ANTLR start "rule__Avancer__Group__0__Impl"
    // InternalMyTurtleDsl.g:3266:1: rule__Avancer__Group__0__Impl : ( 'avancer' ) ;
    public final void rule__Avancer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3270:1: ( ( 'avancer' ) )
            // InternalMyTurtleDsl.g:3271:1: ( 'avancer' )
            {
            // InternalMyTurtleDsl.g:3271:1: ( 'avancer' )
            // InternalMyTurtleDsl.g:3272:2: 'avancer'
            {
             before(grammarAccess.getAvancerAccess().getAvancerKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAvancerAccess().getAvancerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Avancer__Group__0__Impl"


    // $ANTLR start "rule__Avancer__Group__1"
    // InternalMyTurtleDsl.g:3281:1: rule__Avancer__Group__1 : rule__Avancer__Group__1__Impl rule__Avancer__Group__2 ;
    public final void rule__Avancer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3285:1: ( rule__Avancer__Group__1__Impl rule__Avancer__Group__2 )
            // InternalMyTurtleDsl.g:3286:2: rule__Avancer__Group__1__Impl rule__Avancer__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Avancer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Avancer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Avancer__Group__1"


    // $ANTLR start "rule__Avancer__Group__1__Impl"
    // InternalMyTurtleDsl.g:3293:1: rule__Avancer__Group__1__Impl : ( '(' ) ;
    public final void rule__Avancer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3297:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:3298:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:3298:1: ( '(' )
            // InternalMyTurtleDsl.g:3299:2: '('
            {
             before(grammarAccess.getAvancerAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAvancerAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Avancer__Group__1__Impl"


    // $ANTLR start "rule__Avancer__Group__2"
    // InternalMyTurtleDsl.g:3308:1: rule__Avancer__Group__2 : rule__Avancer__Group__2__Impl rule__Avancer__Group__3 ;
    public final void rule__Avancer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3312:1: ( rule__Avancer__Group__2__Impl rule__Avancer__Group__3 )
            // InternalMyTurtleDsl.g:3313:2: rule__Avancer__Group__2__Impl rule__Avancer__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Avancer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Avancer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Avancer__Group__2"


    // $ANTLR start "rule__Avancer__Group__2__Impl"
    // InternalMyTurtleDsl.g:3320:1: rule__Avancer__Group__2__Impl : ( ( rule__Avancer__DureeAssignment_2 ) ) ;
    public final void rule__Avancer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3324:1: ( ( ( rule__Avancer__DureeAssignment_2 ) ) )
            // InternalMyTurtleDsl.g:3325:1: ( ( rule__Avancer__DureeAssignment_2 ) )
            {
            // InternalMyTurtleDsl.g:3325:1: ( ( rule__Avancer__DureeAssignment_2 ) )
            // InternalMyTurtleDsl.g:3326:2: ( rule__Avancer__DureeAssignment_2 )
            {
             before(grammarAccess.getAvancerAccess().getDureeAssignment_2()); 
            // InternalMyTurtleDsl.g:3327:2: ( rule__Avancer__DureeAssignment_2 )
            // InternalMyTurtleDsl.g:3327:3: rule__Avancer__DureeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Avancer__DureeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAvancerAccess().getDureeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Avancer__Group__2__Impl"


    // $ANTLR start "rule__Avancer__Group__3"
    // InternalMyTurtleDsl.g:3335:1: rule__Avancer__Group__3 : rule__Avancer__Group__3__Impl rule__Avancer__Group__4 ;
    public final void rule__Avancer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3339:1: ( rule__Avancer__Group__3__Impl rule__Avancer__Group__4 )
            // InternalMyTurtleDsl.g:3340:2: rule__Avancer__Group__3__Impl rule__Avancer__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Avancer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Avancer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Avancer__Group__3"


    // $ANTLR start "rule__Avancer__Group__3__Impl"
    // InternalMyTurtleDsl.g:3347:1: rule__Avancer__Group__3__Impl : ( ',' ) ;
    public final void rule__Avancer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3351:1: ( ( ',' ) )
            // InternalMyTurtleDsl.g:3352:1: ( ',' )
            {
            // InternalMyTurtleDsl.g:3352:1: ( ',' )
            // InternalMyTurtleDsl.g:3353:2: ','
            {
             before(grammarAccess.getAvancerAccess().getCommaKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAvancerAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Avancer__Group__3__Impl"


    // $ANTLR start "rule__Avancer__Group__4"
    // InternalMyTurtleDsl.g:3362:1: rule__Avancer__Group__4 : rule__Avancer__Group__4__Impl rule__Avancer__Group__5 ;
    public final void rule__Avancer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3366:1: ( rule__Avancer__Group__4__Impl rule__Avancer__Group__5 )
            // InternalMyTurtleDsl.g:3367:2: rule__Avancer__Group__4__Impl rule__Avancer__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__Avancer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Avancer__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Avancer__Group__4"


    // $ANTLR start "rule__Avancer__Group__4__Impl"
    // InternalMyTurtleDsl.g:3374:1: rule__Avancer__Group__4__Impl : ( ( rule__Avancer__Vitesse_deplacementAssignment_4 ) ) ;
    public final void rule__Avancer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3378:1: ( ( ( rule__Avancer__Vitesse_deplacementAssignment_4 ) ) )
            // InternalMyTurtleDsl.g:3379:1: ( ( rule__Avancer__Vitesse_deplacementAssignment_4 ) )
            {
            // InternalMyTurtleDsl.g:3379:1: ( ( rule__Avancer__Vitesse_deplacementAssignment_4 ) )
            // InternalMyTurtleDsl.g:3380:2: ( rule__Avancer__Vitesse_deplacementAssignment_4 )
            {
             before(grammarAccess.getAvancerAccess().getVitesse_deplacementAssignment_4()); 
            // InternalMyTurtleDsl.g:3381:2: ( rule__Avancer__Vitesse_deplacementAssignment_4 )
            // InternalMyTurtleDsl.g:3381:3: rule__Avancer__Vitesse_deplacementAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Avancer__Vitesse_deplacementAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAvancerAccess().getVitesse_deplacementAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Avancer__Group__4__Impl"


    // $ANTLR start "rule__Avancer__Group__5"
    // InternalMyTurtleDsl.g:3389:1: rule__Avancer__Group__5 : rule__Avancer__Group__5__Impl ;
    public final void rule__Avancer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3393:1: ( rule__Avancer__Group__5__Impl )
            // InternalMyTurtleDsl.g:3394:2: rule__Avancer__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Avancer__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Avancer__Group__5"


    // $ANTLR start "rule__Avancer__Group__5__Impl"
    // InternalMyTurtleDsl.g:3400:1: rule__Avancer__Group__5__Impl : ( ')' ) ;
    public final void rule__Avancer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3404:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:3405:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:3405:1: ( ')' )
            // InternalMyTurtleDsl.g:3406:2: ')'
            {
             before(grammarAccess.getAvancerAccess().getRightParenthesisKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAvancerAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Avancer__Group__5__Impl"


    // $ANTLR start "rule__Reculer__Group__0"
    // InternalMyTurtleDsl.g:3416:1: rule__Reculer__Group__0 : rule__Reculer__Group__0__Impl rule__Reculer__Group__1 ;
    public final void rule__Reculer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3420:1: ( rule__Reculer__Group__0__Impl rule__Reculer__Group__1 )
            // InternalMyTurtleDsl.g:3421:2: rule__Reculer__Group__0__Impl rule__Reculer__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Reculer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reculer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reculer__Group__0"


    // $ANTLR start "rule__Reculer__Group__0__Impl"
    // InternalMyTurtleDsl.g:3428:1: rule__Reculer__Group__0__Impl : ( 'reculer' ) ;
    public final void rule__Reculer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3432:1: ( ( 'reculer' ) )
            // InternalMyTurtleDsl.g:3433:1: ( 'reculer' )
            {
            // InternalMyTurtleDsl.g:3433:1: ( 'reculer' )
            // InternalMyTurtleDsl.g:3434:2: 'reculer'
            {
             before(grammarAccess.getReculerAccess().getReculerKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getReculerAccess().getReculerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reculer__Group__0__Impl"


    // $ANTLR start "rule__Reculer__Group__1"
    // InternalMyTurtleDsl.g:3443:1: rule__Reculer__Group__1 : rule__Reculer__Group__1__Impl rule__Reculer__Group__2 ;
    public final void rule__Reculer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3447:1: ( rule__Reculer__Group__1__Impl rule__Reculer__Group__2 )
            // InternalMyTurtleDsl.g:3448:2: rule__Reculer__Group__1__Impl rule__Reculer__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Reculer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reculer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reculer__Group__1"


    // $ANTLR start "rule__Reculer__Group__1__Impl"
    // InternalMyTurtleDsl.g:3455:1: rule__Reculer__Group__1__Impl : ( '(' ) ;
    public final void rule__Reculer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3459:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:3460:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:3460:1: ( '(' )
            // InternalMyTurtleDsl.g:3461:2: '('
            {
             before(grammarAccess.getReculerAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getReculerAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reculer__Group__1__Impl"


    // $ANTLR start "rule__Reculer__Group__2"
    // InternalMyTurtleDsl.g:3470:1: rule__Reculer__Group__2 : rule__Reculer__Group__2__Impl rule__Reculer__Group__3 ;
    public final void rule__Reculer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3474:1: ( rule__Reculer__Group__2__Impl rule__Reculer__Group__3 )
            // InternalMyTurtleDsl.g:3475:2: rule__Reculer__Group__2__Impl rule__Reculer__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Reculer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reculer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reculer__Group__2"


    // $ANTLR start "rule__Reculer__Group__2__Impl"
    // InternalMyTurtleDsl.g:3482:1: rule__Reculer__Group__2__Impl : ( ( rule__Reculer__DureeAssignment_2 ) ) ;
    public final void rule__Reculer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3486:1: ( ( ( rule__Reculer__DureeAssignment_2 ) ) )
            // InternalMyTurtleDsl.g:3487:1: ( ( rule__Reculer__DureeAssignment_2 ) )
            {
            // InternalMyTurtleDsl.g:3487:1: ( ( rule__Reculer__DureeAssignment_2 ) )
            // InternalMyTurtleDsl.g:3488:2: ( rule__Reculer__DureeAssignment_2 )
            {
             before(grammarAccess.getReculerAccess().getDureeAssignment_2()); 
            // InternalMyTurtleDsl.g:3489:2: ( rule__Reculer__DureeAssignment_2 )
            // InternalMyTurtleDsl.g:3489:3: rule__Reculer__DureeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Reculer__DureeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReculerAccess().getDureeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reculer__Group__2__Impl"


    // $ANTLR start "rule__Reculer__Group__3"
    // InternalMyTurtleDsl.g:3497:1: rule__Reculer__Group__3 : rule__Reculer__Group__3__Impl rule__Reculer__Group__4 ;
    public final void rule__Reculer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3501:1: ( rule__Reculer__Group__3__Impl rule__Reculer__Group__4 )
            // InternalMyTurtleDsl.g:3502:2: rule__Reculer__Group__3__Impl rule__Reculer__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Reculer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reculer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reculer__Group__3"


    // $ANTLR start "rule__Reculer__Group__3__Impl"
    // InternalMyTurtleDsl.g:3509:1: rule__Reculer__Group__3__Impl : ( ',' ) ;
    public final void rule__Reculer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3513:1: ( ( ',' ) )
            // InternalMyTurtleDsl.g:3514:1: ( ',' )
            {
            // InternalMyTurtleDsl.g:3514:1: ( ',' )
            // InternalMyTurtleDsl.g:3515:2: ','
            {
             before(grammarAccess.getReculerAccess().getCommaKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getReculerAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reculer__Group__3__Impl"


    // $ANTLR start "rule__Reculer__Group__4"
    // InternalMyTurtleDsl.g:3524:1: rule__Reculer__Group__4 : rule__Reculer__Group__4__Impl rule__Reculer__Group__5 ;
    public final void rule__Reculer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3528:1: ( rule__Reculer__Group__4__Impl rule__Reculer__Group__5 )
            // InternalMyTurtleDsl.g:3529:2: rule__Reculer__Group__4__Impl rule__Reculer__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__Reculer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reculer__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reculer__Group__4"


    // $ANTLR start "rule__Reculer__Group__4__Impl"
    // InternalMyTurtleDsl.g:3536:1: rule__Reculer__Group__4__Impl : ( ( rule__Reculer__Vitesse_deplacementAssignment_4 ) ) ;
    public final void rule__Reculer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3540:1: ( ( ( rule__Reculer__Vitesse_deplacementAssignment_4 ) ) )
            // InternalMyTurtleDsl.g:3541:1: ( ( rule__Reculer__Vitesse_deplacementAssignment_4 ) )
            {
            // InternalMyTurtleDsl.g:3541:1: ( ( rule__Reculer__Vitesse_deplacementAssignment_4 ) )
            // InternalMyTurtleDsl.g:3542:2: ( rule__Reculer__Vitesse_deplacementAssignment_4 )
            {
             before(grammarAccess.getReculerAccess().getVitesse_deplacementAssignment_4()); 
            // InternalMyTurtleDsl.g:3543:2: ( rule__Reculer__Vitesse_deplacementAssignment_4 )
            // InternalMyTurtleDsl.g:3543:3: rule__Reculer__Vitesse_deplacementAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Reculer__Vitesse_deplacementAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getReculerAccess().getVitesse_deplacementAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reculer__Group__4__Impl"


    // $ANTLR start "rule__Reculer__Group__5"
    // InternalMyTurtleDsl.g:3551:1: rule__Reculer__Group__5 : rule__Reculer__Group__5__Impl ;
    public final void rule__Reculer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3555:1: ( rule__Reculer__Group__5__Impl )
            // InternalMyTurtleDsl.g:3556:2: rule__Reculer__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reculer__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reculer__Group__5"


    // $ANTLR start "rule__Reculer__Group__5__Impl"
    // InternalMyTurtleDsl.g:3562:1: rule__Reculer__Group__5__Impl : ( ')' ) ;
    public final void rule__Reculer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3566:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:3567:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:3567:1: ( ')' )
            // InternalMyTurtleDsl.g:3568:2: ')'
            {
             before(grammarAccess.getReculerAccess().getRightParenthesisKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getReculerAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reculer__Group__5__Impl"


    // $ANTLR start "rule__Gauche__Group__0"
    // InternalMyTurtleDsl.g:3578:1: rule__Gauche__Group__0 : rule__Gauche__Group__0__Impl rule__Gauche__Group__1 ;
    public final void rule__Gauche__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3582:1: ( rule__Gauche__Group__0__Impl rule__Gauche__Group__1 )
            // InternalMyTurtleDsl.g:3583:2: rule__Gauche__Group__0__Impl rule__Gauche__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Gauche__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gauche__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gauche__Group__0"


    // $ANTLR start "rule__Gauche__Group__0__Impl"
    // InternalMyTurtleDsl.g:3590:1: rule__Gauche__Group__0__Impl : ( 'gauche' ) ;
    public final void rule__Gauche__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3594:1: ( ( 'gauche' ) )
            // InternalMyTurtleDsl.g:3595:1: ( 'gauche' )
            {
            // InternalMyTurtleDsl.g:3595:1: ( 'gauche' )
            // InternalMyTurtleDsl.g:3596:2: 'gauche'
            {
             before(grammarAccess.getGaucheAccess().getGaucheKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getGaucheAccess().getGaucheKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gauche__Group__0__Impl"


    // $ANTLR start "rule__Gauche__Group__1"
    // InternalMyTurtleDsl.g:3605:1: rule__Gauche__Group__1 : rule__Gauche__Group__1__Impl rule__Gauche__Group__2 ;
    public final void rule__Gauche__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3609:1: ( rule__Gauche__Group__1__Impl rule__Gauche__Group__2 )
            // InternalMyTurtleDsl.g:3610:2: rule__Gauche__Group__1__Impl rule__Gauche__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Gauche__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gauche__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gauche__Group__1"


    // $ANTLR start "rule__Gauche__Group__1__Impl"
    // InternalMyTurtleDsl.g:3617:1: rule__Gauche__Group__1__Impl : ( '(' ) ;
    public final void rule__Gauche__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3621:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:3622:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:3622:1: ( '(' )
            // InternalMyTurtleDsl.g:3623:2: '('
            {
             before(grammarAccess.getGaucheAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGaucheAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gauche__Group__1__Impl"


    // $ANTLR start "rule__Gauche__Group__2"
    // InternalMyTurtleDsl.g:3632:1: rule__Gauche__Group__2 : rule__Gauche__Group__2__Impl rule__Gauche__Group__3 ;
    public final void rule__Gauche__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3636:1: ( rule__Gauche__Group__2__Impl rule__Gauche__Group__3 )
            // InternalMyTurtleDsl.g:3637:2: rule__Gauche__Group__2__Impl rule__Gauche__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Gauche__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gauche__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gauche__Group__2"


    // $ANTLR start "rule__Gauche__Group__2__Impl"
    // InternalMyTurtleDsl.g:3644:1: rule__Gauche__Group__2__Impl : ( ( rule__Gauche__DureeAssignment_2 ) ) ;
    public final void rule__Gauche__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3648:1: ( ( ( rule__Gauche__DureeAssignment_2 ) ) )
            // InternalMyTurtleDsl.g:3649:1: ( ( rule__Gauche__DureeAssignment_2 ) )
            {
            // InternalMyTurtleDsl.g:3649:1: ( ( rule__Gauche__DureeAssignment_2 ) )
            // InternalMyTurtleDsl.g:3650:2: ( rule__Gauche__DureeAssignment_2 )
            {
             before(grammarAccess.getGaucheAccess().getDureeAssignment_2()); 
            // InternalMyTurtleDsl.g:3651:2: ( rule__Gauche__DureeAssignment_2 )
            // InternalMyTurtleDsl.g:3651:3: rule__Gauche__DureeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Gauche__DureeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGaucheAccess().getDureeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gauche__Group__2__Impl"


    // $ANTLR start "rule__Gauche__Group__3"
    // InternalMyTurtleDsl.g:3659:1: rule__Gauche__Group__3 : rule__Gauche__Group__3__Impl rule__Gauche__Group__4 ;
    public final void rule__Gauche__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3663:1: ( rule__Gauche__Group__3__Impl rule__Gauche__Group__4 )
            // InternalMyTurtleDsl.g:3664:2: rule__Gauche__Group__3__Impl rule__Gauche__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Gauche__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gauche__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gauche__Group__3"


    // $ANTLR start "rule__Gauche__Group__3__Impl"
    // InternalMyTurtleDsl.g:3671:1: rule__Gauche__Group__3__Impl : ( ',' ) ;
    public final void rule__Gauche__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3675:1: ( ( ',' ) )
            // InternalMyTurtleDsl.g:3676:1: ( ',' )
            {
            // InternalMyTurtleDsl.g:3676:1: ( ',' )
            // InternalMyTurtleDsl.g:3677:2: ','
            {
             before(grammarAccess.getGaucheAccess().getCommaKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getGaucheAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gauche__Group__3__Impl"


    // $ANTLR start "rule__Gauche__Group__4"
    // InternalMyTurtleDsl.g:3686:1: rule__Gauche__Group__4 : rule__Gauche__Group__4__Impl rule__Gauche__Group__5 ;
    public final void rule__Gauche__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3690:1: ( rule__Gauche__Group__4__Impl rule__Gauche__Group__5 )
            // InternalMyTurtleDsl.g:3691:2: rule__Gauche__Group__4__Impl rule__Gauche__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__Gauche__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gauche__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gauche__Group__4"


    // $ANTLR start "rule__Gauche__Group__4__Impl"
    // InternalMyTurtleDsl.g:3698:1: rule__Gauche__Group__4__Impl : ( ( rule__Gauche__Vitesse_deplacementAssignment_4 ) ) ;
    public final void rule__Gauche__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3702:1: ( ( ( rule__Gauche__Vitesse_deplacementAssignment_4 ) ) )
            // InternalMyTurtleDsl.g:3703:1: ( ( rule__Gauche__Vitesse_deplacementAssignment_4 ) )
            {
            // InternalMyTurtleDsl.g:3703:1: ( ( rule__Gauche__Vitesse_deplacementAssignment_4 ) )
            // InternalMyTurtleDsl.g:3704:2: ( rule__Gauche__Vitesse_deplacementAssignment_4 )
            {
             before(grammarAccess.getGaucheAccess().getVitesse_deplacementAssignment_4()); 
            // InternalMyTurtleDsl.g:3705:2: ( rule__Gauche__Vitesse_deplacementAssignment_4 )
            // InternalMyTurtleDsl.g:3705:3: rule__Gauche__Vitesse_deplacementAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Gauche__Vitesse_deplacementAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGaucheAccess().getVitesse_deplacementAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gauche__Group__4__Impl"


    // $ANTLR start "rule__Gauche__Group__5"
    // InternalMyTurtleDsl.g:3713:1: rule__Gauche__Group__5 : rule__Gauche__Group__5__Impl ;
    public final void rule__Gauche__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3717:1: ( rule__Gauche__Group__5__Impl )
            // InternalMyTurtleDsl.g:3718:2: rule__Gauche__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gauche__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gauche__Group__5"


    // $ANTLR start "rule__Gauche__Group__5__Impl"
    // InternalMyTurtleDsl.g:3724:1: rule__Gauche__Group__5__Impl : ( ')' ) ;
    public final void rule__Gauche__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3728:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:3729:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:3729:1: ( ')' )
            // InternalMyTurtleDsl.g:3730:2: ')'
            {
             before(grammarAccess.getGaucheAccess().getRightParenthesisKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGaucheAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gauche__Group__5__Impl"


    // $ANTLR start "rule__Droite__Group__0"
    // InternalMyTurtleDsl.g:3740:1: rule__Droite__Group__0 : rule__Droite__Group__0__Impl rule__Droite__Group__1 ;
    public final void rule__Droite__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3744:1: ( rule__Droite__Group__0__Impl rule__Droite__Group__1 )
            // InternalMyTurtleDsl.g:3745:2: rule__Droite__Group__0__Impl rule__Droite__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Droite__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Droite__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Droite__Group__0"


    // $ANTLR start "rule__Droite__Group__0__Impl"
    // InternalMyTurtleDsl.g:3752:1: rule__Droite__Group__0__Impl : ( 'droite' ) ;
    public final void rule__Droite__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3756:1: ( ( 'droite' ) )
            // InternalMyTurtleDsl.g:3757:1: ( 'droite' )
            {
            // InternalMyTurtleDsl.g:3757:1: ( 'droite' )
            // InternalMyTurtleDsl.g:3758:2: 'droite'
            {
             before(grammarAccess.getDroiteAccess().getDroiteKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getDroiteAccess().getDroiteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Droite__Group__0__Impl"


    // $ANTLR start "rule__Droite__Group__1"
    // InternalMyTurtleDsl.g:3767:1: rule__Droite__Group__1 : rule__Droite__Group__1__Impl rule__Droite__Group__2 ;
    public final void rule__Droite__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3771:1: ( rule__Droite__Group__1__Impl rule__Droite__Group__2 )
            // InternalMyTurtleDsl.g:3772:2: rule__Droite__Group__1__Impl rule__Droite__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Droite__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Droite__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Droite__Group__1"


    // $ANTLR start "rule__Droite__Group__1__Impl"
    // InternalMyTurtleDsl.g:3779:1: rule__Droite__Group__1__Impl : ( '(' ) ;
    public final void rule__Droite__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3783:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:3784:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:3784:1: ( '(' )
            // InternalMyTurtleDsl.g:3785:2: '('
            {
             before(grammarAccess.getDroiteAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDroiteAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Droite__Group__1__Impl"


    // $ANTLR start "rule__Droite__Group__2"
    // InternalMyTurtleDsl.g:3794:1: rule__Droite__Group__2 : rule__Droite__Group__2__Impl rule__Droite__Group__3 ;
    public final void rule__Droite__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3798:1: ( rule__Droite__Group__2__Impl rule__Droite__Group__3 )
            // InternalMyTurtleDsl.g:3799:2: rule__Droite__Group__2__Impl rule__Droite__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Droite__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Droite__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Droite__Group__2"


    // $ANTLR start "rule__Droite__Group__2__Impl"
    // InternalMyTurtleDsl.g:3806:1: rule__Droite__Group__2__Impl : ( ( rule__Droite__DureeAssignment_2 ) ) ;
    public final void rule__Droite__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3810:1: ( ( ( rule__Droite__DureeAssignment_2 ) ) )
            // InternalMyTurtleDsl.g:3811:1: ( ( rule__Droite__DureeAssignment_2 ) )
            {
            // InternalMyTurtleDsl.g:3811:1: ( ( rule__Droite__DureeAssignment_2 ) )
            // InternalMyTurtleDsl.g:3812:2: ( rule__Droite__DureeAssignment_2 )
            {
             before(grammarAccess.getDroiteAccess().getDureeAssignment_2()); 
            // InternalMyTurtleDsl.g:3813:2: ( rule__Droite__DureeAssignment_2 )
            // InternalMyTurtleDsl.g:3813:3: rule__Droite__DureeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Droite__DureeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDroiteAccess().getDureeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Droite__Group__2__Impl"


    // $ANTLR start "rule__Droite__Group__3"
    // InternalMyTurtleDsl.g:3821:1: rule__Droite__Group__3 : rule__Droite__Group__3__Impl rule__Droite__Group__4 ;
    public final void rule__Droite__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3825:1: ( rule__Droite__Group__3__Impl rule__Droite__Group__4 )
            // InternalMyTurtleDsl.g:3826:2: rule__Droite__Group__3__Impl rule__Droite__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Droite__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Droite__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Droite__Group__3"


    // $ANTLR start "rule__Droite__Group__3__Impl"
    // InternalMyTurtleDsl.g:3833:1: rule__Droite__Group__3__Impl : ( ',' ) ;
    public final void rule__Droite__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3837:1: ( ( ',' ) )
            // InternalMyTurtleDsl.g:3838:1: ( ',' )
            {
            // InternalMyTurtleDsl.g:3838:1: ( ',' )
            // InternalMyTurtleDsl.g:3839:2: ','
            {
             before(grammarAccess.getDroiteAccess().getCommaKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDroiteAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Droite__Group__3__Impl"


    // $ANTLR start "rule__Droite__Group__4"
    // InternalMyTurtleDsl.g:3848:1: rule__Droite__Group__4 : rule__Droite__Group__4__Impl rule__Droite__Group__5 ;
    public final void rule__Droite__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3852:1: ( rule__Droite__Group__4__Impl rule__Droite__Group__5 )
            // InternalMyTurtleDsl.g:3853:2: rule__Droite__Group__4__Impl rule__Droite__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__Droite__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Droite__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Droite__Group__4"


    // $ANTLR start "rule__Droite__Group__4__Impl"
    // InternalMyTurtleDsl.g:3860:1: rule__Droite__Group__4__Impl : ( ( rule__Droite__Vitesse_deplacementAssignment_4 ) ) ;
    public final void rule__Droite__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3864:1: ( ( ( rule__Droite__Vitesse_deplacementAssignment_4 ) ) )
            // InternalMyTurtleDsl.g:3865:1: ( ( rule__Droite__Vitesse_deplacementAssignment_4 ) )
            {
            // InternalMyTurtleDsl.g:3865:1: ( ( rule__Droite__Vitesse_deplacementAssignment_4 ) )
            // InternalMyTurtleDsl.g:3866:2: ( rule__Droite__Vitesse_deplacementAssignment_4 )
            {
             before(grammarAccess.getDroiteAccess().getVitesse_deplacementAssignment_4()); 
            // InternalMyTurtleDsl.g:3867:2: ( rule__Droite__Vitesse_deplacementAssignment_4 )
            // InternalMyTurtleDsl.g:3867:3: rule__Droite__Vitesse_deplacementAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Droite__Vitesse_deplacementAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDroiteAccess().getVitesse_deplacementAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Droite__Group__4__Impl"


    // $ANTLR start "rule__Droite__Group__5"
    // InternalMyTurtleDsl.g:3875:1: rule__Droite__Group__5 : rule__Droite__Group__5__Impl ;
    public final void rule__Droite__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3879:1: ( rule__Droite__Group__5__Impl )
            // InternalMyTurtleDsl.g:3880:2: rule__Droite__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Droite__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Droite__Group__5"


    // $ANTLR start "rule__Droite__Group__5__Impl"
    // InternalMyTurtleDsl.g:3886:1: rule__Droite__Group__5__Impl : ( ')' ) ;
    public final void rule__Droite__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3890:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:3891:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:3891:1: ( ')' )
            // InternalMyTurtleDsl.g:3892:2: ')'
            {
             before(grammarAccess.getDroiteAccess().getRightParenthesisKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDroiteAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Droite__Group__5__Impl"


    // $ANTLR start "rule__Pause__Group__0"
    // InternalMyTurtleDsl.g:3902:1: rule__Pause__Group__0 : rule__Pause__Group__0__Impl rule__Pause__Group__1 ;
    public final void rule__Pause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3906:1: ( rule__Pause__Group__0__Impl rule__Pause__Group__1 )
            // InternalMyTurtleDsl.g:3907:2: rule__Pause__Group__0__Impl rule__Pause__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Pause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pause__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pause__Group__0"


    // $ANTLR start "rule__Pause__Group__0__Impl"
    // InternalMyTurtleDsl.g:3914:1: rule__Pause__Group__0__Impl : ( 'droite' ) ;
    public final void rule__Pause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3918:1: ( ( 'droite' ) )
            // InternalMyTurtleDsl.g:3919:1: ( 'droite' )
            {
            // InternalMyTurtleDsl.g:3919:1: ( 'droite' )
            // InternalMyTurtleDsl.g:3920:2: 'droite'
            {
             before(grammarAccess.getPauseAccess().getDroiteKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPauseAccess().getDroiteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pause__Group__0__Impl"


    // $ANTLR start "rule__Pause__Group__1"
    // InternalMyTurtleDsl.g:3929:1: rule__Pause__Group__1 : rule__Pause__Group__1__Impl rule__Pause__Group__2 ;
    public final void rule__Pause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3933:1: ( rule__Pause__Group__1__Impl rule__Pause__Group__2 )
            // InternalMyTurtleDsl.g:3934:2: rule__Pause__Group__1__Impl rule__Pause__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Pause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pause__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pause__Group__1"


    // $ANTLR start "rule__Pause__Group__1__Impl"
    // InternalMyTurtleDsl.g:3941:1: rule__Pause__Group__1__Impl : ( '(' ) ;
    public final void rule__Pause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3945:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:3946:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:3946:1: ( '(' )
            // InternalMyTurtleDsl.g:3947:2: '('
            {
             before(grammarAccess.getPauseAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPauseAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pause__Group__1__Impl"


    // $ANTLR start "rule__Pause__Group__2"
    // InternalMyTurtleDsl.g:3956:1: rule__Pause__Group__2 : rule__Pause__Group__2__Impl rule__Pause__Group__3 ;
    public final void rule__Pause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3960:1: ( rule__Pause__Group__2__Impl rule__Pause__Group__3 )
            // InternalMyTurtleDsl.g:3961:2: rule__Pause__Group__2__Impl rule__Pause__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Pause__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pause__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pause__Group__2"


    // $ANTLR start "rule__Pause__Group__2__Impl"
    // InternalMyTurtleDsl.g:3968:1: rule__Pause__Group__2__Impl : ( ( rule__Pause__DureeAssignment_2 ) ) ;
    public final void rule__Pause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3972:1: ( ( ( rule__Pause__DureeAssignment_2 ) ) )
            // InternalMyTurtleDsl.g:3973:1: ( ( rule__Pause__DureeAssignment_2 ) )
            {
            // InternalMyTurtleDsl.g:3973:1: ( ( rule__Pause__DureeAssignment_2 ) )
            // InternalMyTurtleDsl.g:3974:2: ( rule__Pause__DureeAssignment_2 )
            {
             before(grammarAccess.getPauseAccess().getDureeAssignment_2()); 
            // InternalMyTurtleDsl.g:3975:2: ( rule__Pause__DureeAssignment_2 )
            // InternalMyTurtleDsl.g:3975:3: rule__Pause__DureeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Pause__DureeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPauseAccess().getDureeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pause__Group__2__Impl"


    // $ANTLR start "rule__Pause__Group__3"
    // InternalMyTurtleDsl.g:3983:1: rule__Pause__Group__3 : rule__Pause__Group__3__Impl ;
    public final void rule__Pause__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3987:1: ( rule__Pause__Group__3__Impl )
            // InternalMyTurtleDsl.g:3988:2: rule__Pause__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pause__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pause__Group__3"


    // $ANTLR start "rule__Pause__Group__3__Impl"
    // InternalMyTurtleDsl.g:3994:1: rule__Pause__Group__3__Impl : ( ')' ) ;
    public final void rule__Pause__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3998:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:3999:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:3999:1: ( ')' )
            // InternalMyTurtleDsl.g:4000:2: ')'
            {
             before(grammarAccess.getPauseAccess().getRightParenthesisKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPauseAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pause__Group__3__Impl"


    // $ANTLR start "rule__RotationGauche__Group__0"
    // InternalMyTurtleDsl.g:4010:1: rule__RotationGauche__Group__0 : rule__RotationGauche__Group__0__Impl rule__RotationGauche__Group__1 ;
    public final void rule__RotationGauche__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4014:1: ( rule__RotationGauche__Group__0__Impl rule__RotationGauche__Group__1 )
            // InternalMyTurtleDsl.g:4015:2: rule__RotationGauche__Group__0__Impl rule__RotationGauche__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__RotationGauche__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotationGauche__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotationGauche__Group__0"


    // $ANTLR start "rule__RotationGauche__Group__0__Impl"
    // InternalMyTurtleDsl.g:4022:1: rule__RotationGauche__Group__0__Impl : ( 'rotation_gauche' ) ;
    public final void rule__RotationGauche__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4026:1: ( ( 'rotation_gauche' ) )
            // InternalMyTurtleDsl.g:4027:1: ( 'rotation_gauche' )
            {
            // InternalMyTurtleDsl.g:4027:1: ( 'rotation_gauche' )
            // InternalMyTurtleDsl.g:4028:2: 'rotation_gauche'
            {
             before(grammarAccess.getRotationGaucheAccess().getRotation_gaucheKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getRotationGaucheAccess().getRotation_gaucheKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotationGauche__Group__0__Impl"


    // $ANTLR start "rule__RotationGauche__Group__1"
    // InternalMyTurtleDsl.g:4037:1: rule__RotationGauche__Group__1 : rule__RotationGauche__Group__1__Impl rule__RotationGauche__Group__2 ;
    public final void rule__RotationGauche__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4041:1: ( rule__RotationGauche__Group__1__Impl rule__RotationGauche__Group__2 )
            // InternalMyTurtleDsl.g:4042:2: rule__RotationGauche__Group__1__Impl rule__RotationGauche__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__RotationGauche__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotationGauche__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotationGauche__Group__1"


    // $ANTLR start "rule__RotationGauche__Group__1__Impl"
    // InternalMyTurtleDsl.g:4049:1: rule__RotationGauche__Group__1__Impl : ( '(' ) ;
    public final void rule__RotationGauche__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4053:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:4054:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:4054:1: ( '(' )
            // InternalMyTurtleDsl.g:4055:2: '('
            {
             before(grammarAccess.getRotationGaucheAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRotationGaucheAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotationGauche__Group__1__Impl"


    // $ANTLR start "rule__RotationGauche__Group__2"
    // InternalMyTurtleDsl.g:4064:1: rule__RotationGauche__Group__2 : rule__RotationGauche__Group__2__Impl rule__RotationGauche__Group__3 ;
    public final void rule__RotationGauche__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4068:1: ( rule__RotationGauche__Group__2__Impl rule__RotationGauche__Group__3 )
            // InternalMyTurtleDsl.g:4069:2: rule__RotationGauche__Group__2__Impl rule__RotationGauche__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__RotationGauche__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotationGauche__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotationGauche__Group__2"


    // $ANTLR start "rule__RotationGauche__Group__2__Impl"
    // InternalMyTurtleDsl.g:4076:1: rule__RotationGauche__Group__2__Impl : ( ( rule__RotationGauche__DureeAssignment_2 ) ) ;
    public final void rule__RotationGauche__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4080:1: ( ( ( rule__RotationGauche__DureeAssignment_2 ) ) )
            // InternalMyTurtleDsl.g:4081:1: ( ( rule__RotationGauche__DureeAssignment_2 ) )
            {
            // InternalMyTurtleDsl.g:4081:1: ( ( rule__RotationGauche__DureeAssignment_2 ) )
            // InternalMyTurtleDsl.g:4082:2: ( rule__RotationGauche__DureeAssignment_2 )
            {
             before(grammarAccess.getRotationGaucheAccess().getDureeAssignment_2()); 
            // InternalMyTurtleDsl.g:4083:2: ( rule__RotationGauche__DureeAssignment_2 )
            // InternalMyTurtleDsl.g:4083:3: rule__RotationGauche__DureeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RotationGauche__DureeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRotationGaucheAccess().getDureeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotationGauche__Group__2__Impl"


    // $ANTLR start "rule__RotationGauche__Group__3"
    // InternalMyTurtleDsl.g:4091:1: rule__RotationGauche__Group__3 : rule__RotationGauche__Group__3__Impl rule__RotationGauche__Group__4 ;
    public final void rule__RotationGauche__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4095:1: ( rule__RotationGauche__Group__3__Impl rule__RotationGauche__Group__4 )
            // InternalMyTurtleDsl.g:4096:2: rule__RotationGauche__Group__3__Impl rule__RotationGauche__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__RotationGauche__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotationGauche__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotationGauche__Group__3"


    // $ANTLR start "rule__RotationGauche__Group__3__Impl"
    // InternalMyTurtleDsl.g:4103:1: rule__RotationGauche__Group__3__Impl : ( ',' ) ;
    public final void rule__RotationGauche__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4107:1: ( ( ',' ) )
            // InternalMyTurtleDsl.g:4108:1: ( ',' )
            {
            // InternalMyTurtleDsl.g:4108:1: ( ',' )
            // InternalMyTurtleDsl.g:4109:2: ','
            {
             before(grammarAccess.getRotationGaucheAccess().getCommaKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRotationGaucheAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotationGauche__Group__3__Impl"


    // $ANTLR start "rule__RotationGauche__Group__4"
    // InternalMyTurtleDsl.g:4118:1: rule__RotationGauche__Group__4 : rule__RotationGauche__Group__4__Impl rule__RotationGauche__Group__5 ;
    public final void rule__RotationGauche__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4122:1: ( rule__RotationGauche__Group__4__Impl rule__RotationGauche__Group__5 )
            // InternalMyTurtleDsl.g:4123:2: rule__RotationGauche__Group__4__Impl rule__RotationGauche__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__RotationGauche__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotationGauche__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotationGauche__Group__4"


    // $ANTLR start "rule__RotationGauche__Group__4__Impl"
    // InternalMyTurtleDsl.g:4130:1: rule__RotationGauche__Group__4__Impl : ( ( rule__RotationGauche__Vitesse_rotationAssignment_4 ) ) ;
    public final void rule__RotationGauche__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4134:1: ( ( ( rule__RotationGauche__Vitesse_rotationAssignment_4 ) ) )
            // InternalMyTurtleDsl.g:4135:1: ( ( rule__RotationGauche__Vitesse_rotationAssignment_4 ) )
            {
            // InternalMyTurtleDsl.g:4135:1: ( ( rule__RotationGauche__Vitesse_rotationAssignment_4 ) )
            // InternalMyTurtleDsl.g:4136:2: ( rule__RotationGauche__Vitesse_rotationAssignment_4 )
            {
             before(grammarAccess.getRotationGaucheAccess().getVitesse_rotationAssignment_4()); 
            // InternalMyTurtleDsl.g:4137:2: ( rule__RotationGauche__Vitesse_rotationAssignment_4 )
            // InternalMyTurtleDsl.g:4137:3: rule__RotationGauche__Vitesse_rotationAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RotationGauche__Vitesse_rotationAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRotationGaucheAccess().getVitesse_rotationAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotationGauche__Group__4__Impl"


    // $ANTLR start "rule__RotationGauche__Group__5"
    // InternalMyTurtleDsl.g:4145:1: rule__RotationGauche__Group__5 : rule__RotationGauche__Group__5__Impl ;
    public final void rule__RotationGauche__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4149:1: ( rule__RotationGauche__Group__5__Impl )
            // InternalMyTurtleDsl.g:4150:2: rule__RotationGauche__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RotationGauche__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotationGauche__Group__5"


    // $ANTLR start "rule__RotationGauche__Group__5__Impl"
    // InternalMyTurtleDsl.g:4156:1: rule__RotationGauche__Group__5__Impl : ( ')' ) ;
    public final void rule__RotationGauche__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4160:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:4161:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:4161:1: ( ')' )
            // InternalMyTurtleDsl.g:4162:2: ')'
            {
             before(grammarAccess.getRotationGaucheAccess().getRightParenthesisKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRotationGaucheAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotationGauche__Group__5__Impl"


    // $ANTLR start "rule__RotationDroite__Group__0"
    // InternalMyTurtleDsl.g:4172:1: rule__RotationDroite__Group__0 : rule__RotationDroite__Group__0__Impl rule__RotationDroite__Group__1 ;
    public final void rule__RotationDroite__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4176:1: ( rule__RotationDroite__Group__0__Impl rule__RotationDroite__Group__1 )
            // InternalMyTurtleDsl.g:4177:2: rule__RotationDroite__Group__0__Impl rule__RotationDroite__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__RotationDroite__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotationDroite__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotationDroite__Group__0"


    // $ANTLR start "rule__RotationDroite__Group__0__Impl"
    // InternalMyTurtleDsl.g:4184:1: rule__RotationDroite__Group__0__Impl : ( 'rotation_droite' ) ;
    public final void rule__RotationDroite__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4188:1: ( ( 'rotation_droite' ) )
            // InternalMyTurtleDsl.g:4189:1: ( 'rotation_droite' )
            {
            // InternalMyTurtleDsl.g:4189:1: ( 'rotation_droite' )
            // InternalMyTurtleDsl.g:4190:2: 'rotation_droite'
            {
             before(grammarAccess.getRotationDroiteAccess().getRotation_droiteKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRotationDroiteAccess().getRotation_droiteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotationDroite__Group__0__Impl"


    // $ANTLR start "rule__RotationDroite__Group__1"
    // InternalMyTurtleDsl.g:4199:1: rule__RotationDroite__Group__1 : rule__RotationDroite__Group__1__Impl rule__RotationDroite__Group__2 ;
    public final void rule__RotationDroite__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4203:1: ( rule__RotationDroite__Group__1__Impl rule__RotationDroite__Group__2 )
            // InternalMyTurtleDsl.g:4204:2: rule__RotationDroite__Group__1__Impl rule__RotationDroite__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__RotationDroite__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotationDroite__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotationDroite__Group__1"


    // $ANTLR start "rule__RotationDroite__Group__1__Impl"
    // InternalMyTurtleDsl.g:4211:1: rule__RotationDroite__Group__1__Impl : ( '(' ) ;
    public final void rule__RotationDroite__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4215:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:4216:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:4216:1: ( '(' )
            // InternalMyTurtleDsl.g:4217:2: '('
            {
             before(grammarAccess.getRotationDroiteAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRotationDroiteAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotationDroite__Group__1__Impl"


    // $ANTLR start "rule__RotationDroite__Group__2"
    // InternalMyTurtleDsl.g:4226:1: rule__RotationDroite__Group__2 : rule__RotationDroite__Group__2__Impl rule__RotationDroite__Group__3 ;
    public final void rule__RotationDroite__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4230:1: ( rule__RotationDroite__Group__2__Impl rule__RotationDroite__Group__3 )
            // InternalMyTurtleDsl.g:4231:2: rule__RotationDroite__Group__2__Impl rule__RotationDroite__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__RotationDroite__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotationDroite__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotationDroite__Group__2"


    // $ANTLR start "rule__RotationDroite__Group__2__Impl"
    // InternalMyTurtleDsl.g:4238:1: rule__RotationDroite__Group__2__Impl : ( ( rule__RotationDroite__DureeAssignment_2 ) ) ;
    public final void rule__RotationDroite__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4242:1: ( ( ( rule__RotationDroite__DureeAssignment_2 ) ) )
            // InternalMyTurtleDsl.g:4243:1: ( ( rule__RotationDroite__DureeAssignment_2 ) )
            {
            // InternalMyTurtleDsl.g:4243:1: ( ( rule__RotationDroite__DureeAssignment_2 ) )
            // InternalMyTurtleDsl.g:4244:2: ( rule__RotationDroite__DureeAssignment_2 )
            {
             before(grammarAccess.getRotationDroiteAccess().getDureeAssignment_2()); 
            // InternalMyTurtleDsl.g:4245:2: ( rule__RotationDroite__DureeAssignment_2 )
            // InternalMyTurtleDsl.g:4245:3: rule__RotationDroite__DureeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RotationDroite__DureeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRotationDroiteAccess().getDureeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotationDroite__Group__2__Impl"


    // $ANTLR start "rule__RotationDroite__Group__3"
    // InternalMyTurtleDsl.g:4253:1: rule__RotationDroite__Group__3 : rule__RotationDroite__Group__3__Impl rule__RotationDroite__Group__4 ;
    public final void rule__RotationDroite__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4257:1: ( rule__RotationDroite__Group__3__Impl rule__RotationDroite__Group__4 )
            // InternalMyTurtleDsl.g:4258:2: rule__RotationDroite__Group__3__Impl rule__RotationDroite__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__RotationDroite__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotationDroite__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotationDroite__Group__3"


    // $ANTLR start "rule__RotationDroite__Group__3__Impl"
    // InternalMyTurtleDsl.g:4265:1: rule__RotationDroite__Group__3__Impl : ( ',' ) ;
    public final void rule__RotationDroite__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4269:1: ( ( ',' ) )
            // InternalMyTurtleDsl.g:4270:1: ( ',' )
            {
            // InternalMyTurtleDsl.g:4270:1: ( ',' )
            // InternalMyTurtleDsl.g:4271:2: ','
            {
             before(grammarAccess.getRotationDroiteAccess().getCommaKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRotationDroiteAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotationDroite__Group__3__Impl"


    // $ANTLR start "rule__RotationDroite__Group__4"
    // InternalMyTurtleDsl.g:4280:1: rule__RotationDroite__Group__4 : rule__RotationDroite__Group__4__Impl rule__RotationDroite__Group__5 ;
    public final void rule__RotationDroite__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4284:1: ( rule__RotationDroite__Group__4__Impl rule__RotationDroite__Group__5 )
            // InternalMyTurtleDsl.g:4285:2: rule__RotationDroite__Group__4__Impl rule__RotationDroite__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__RotationDroite__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotationDroite__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotationDroite__Group__4"


    // $ANTLR start "rule__RotationDroite__Group__4__Impl"
    // InternalMyTurtleDsl.g:4292:1: rule__RotationDroite__Group__4__Impl : ( ( rule__RotationDroite__Vitesse_rotationAssignment_4 ) ) ;
    public final void rule__RotationDroite__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4296:1: ( ( ( rule__RotationDroite__Vitesse_rotationAssignment_4 ) ) )
            // InternalMyTurtleDsl.g:4297:1: ( ( rule__RotationDroite__Vitesse_rotationAssignment_4 ) )
            {
            // InternalMyTurtleDsl.g:4297:1: ( ( rule__RotationDroite__Vitesse_rotationAssignment_4 ) )
            // InternalMyTurtleDsl.g:4298:2: ( rule__RotationDroite__Vitesse_rotationAssignment_4 )
            {
             before(grammarAccess.getRotationDroiteAccess().getVitesse_rotationAssignment_4()); 
            // InternalMyTurtleDsl.g:4299:2: ( rule__RotationDroite__Vitesse_rotationAssignment_4 )
            // InternalMyTurtleDsl.g:4299:3: rule__RotationDroite__Vitesse_rotationAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RotationDroite__Vitesse_rotationAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRotationDroiteAccess().getVitesse_rotationAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotationDroite__Group__4__Impl"


    // $ANTLR start "rule__RotationDroite__Group__5"
    // InternalMyTurtleDsl.g:4307:1: rule__RotationDroite__Group__5 : rule__RotationDroite__Group__5__Impl ;
    public final void rule__RotationDroite__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4311:1: ( rule__RotationDroite__Group__5__Impl )
            // InternalMyTurtleDsl.g:4312:2: rule__RotationDroite__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RotationDroite__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotationDroite__Group__5"


    // $ANTLR start "rule__RotationDroite__Group__5__Impl"
    // InternalMyTurtleDsl.g:4318:1: rule__RotationDroite__Group__5__Impl : ( ')' ) ;
    public final void rule__RotationDroite__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4322:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:4323:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:4323:1: ( ')' )
            // InternalMyTurtleDsl.g:4324:2: ')'
            {
             before(grammarAccess.getRotationDroiteAccess().getRightParenthesisKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRotationDroiteAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotationDroite__Group__5__Impl"


    // $ANTLR start "rule__FonctionDecl__Group__0"
    // InternalMyTurtleDsl.g:4334:1: rule__FonctionDecl__Group__0 : rule__FonctionDecl__Group__0__Impl rule__FonctionDecl__Group__1 ;
    public final void rule__FonctionDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4338:1: ( rule__FonctionDecl__Group__0__Impl rule__FonctionDecl__Group__1 )
            // InternalMyTurtleDsl.g:4339:2: rule__FonctionDecl__Group__0__Impl rule__FonctionDecl__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__FonctionDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FonctionDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FonctionDecl__Group__0"


    // $ANTLR start "rule__FonctionDecl__Group__0__Impl"
    // InternalMyTurtleDsl.g:4346:1: rule__FonctionDecl__Group__0__Impl : ( 'func' ) ;
    public final void rule__FonctionDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4350:1: ( ( 'func' ) )
            // InternalMyTurtleDsl.g:4351:1: ( 'func' )
            {
            // InternalMyTurtleDsl.g:4351:1: ( 'func' )
            // InternalMyTurtleDsl.g:4352:2: 'func'
            {
             before(grammarAccess.getFonctionDeclAccess().getFuncKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFonctionDeclAccess().getFuncKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FonctionDecl__Group__0__Impl"


    // $ANTLR start "rule__FonctionDecl__Group__1"
    // InternalMyTurtleDsl.g:4361:1: rule__FonctionDecl__Group__1 : rule__FonctionDecl__Group__1__Impl rule__FonctionDecl__Group__2 ;
    public final void rule__FonctionDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4365:1: ( rule__FonctionDecl__Group__1__Impl rule__FonctionDecl__Group__2 )
            // InternalMyTurtleDsl.g:4366:2: rule__FonctionDecl__Group__1__Impl rule__FonctionDecl__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__FonctionDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FonctionDecl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FonctionDecl__Group__1"


    // $ANTLR start "rule__FonctionDecl__Group__1__Impl"
    // InternalMyTurtleDsl.g:4373:1: rule__FonctionDecl__Group__1__Impl : ( ( rule__FonctionDecl__NameAssignment_1 ) ) ;
    public final void rule__FonctionDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4377:1: ( ( ( rule__FonctionDecl__NameAssignment_1 ) ) )
            // InternalMyTurtleDsl.g:4378:1: ( ( rule__FonctionDecl__NameAssignment_1 ) )
            {
            // InternalMyTurtleDsl.g:4378:1: ( ( rule__FonctionDecl__NameAssignment_1 ) )
            // InternalMyTurtleDsl.g:4379:2: ( rule__FonctionDecl__NameAssignment_1 )
            {
             before(grammarAccess.getFonctionDeclAccess().getNameAssignment_1()); 
            // InternalMyTurtleDsl.g:4380:2: ( rule__FonctionDecl__NameAssignment_1 )
            // InternalMyTurtleDsl.g:4380:3: rule__FonctionDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FonctionDecl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFonctionDeclAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FonctionDecl__Group__1__Impl"


    // $ANTLR start "rule__FonctionDecl__Group__2"
    // InternalMyTurtleDsl.g:4388:1: rule__FonctionDecl__Group__2 : rule__FonctionDecl__Group__2__Impl rule__FonctionDecl__Group__3 ;
    public final void rule__FonctionDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4392:1: ( rule__FonctionDecl__Group__2__Impl rule__FonctionDecl__Group__3 )
            // InternalMyTurtleDsl.g:4393:2: rule__FonctionDecl__Group__2__Impl rule__FonctionDecl__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__FonctionDecl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FonctionDecl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FonctionDecl__Group__2"


    // $ANTLR start "rule__FonctionDecl__Group__2__Impl"
    // InternalMyTurtleDsl.g:4400:1: rule__FonctionDecl__Group__2__Impl : ( '(' ) ;
    public final void rule__FonctionDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4404:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:4405:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:4405:1: ( '(' )
            // InternalMyTurtleDsl.g:4406:2: '('
            {
             before(grammarAccess.getFonctionDeclAccess().getLeftParenthesisKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFonctionDeclAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FonctionDecl__Group__2__Impl"


    // $ANTLR start "rule__FonctionDecl__Group__3"
    // InternalMyTurtleDsl.g:4415:1: rule__FonctionDecl__Group__3 : rule__FonctionDecl__Group__3__Impl rule__FonctionDecl__Group__4 ;
    public final void rule__FonctionDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4419:1: ( rule__FonctionDecl__Group__3__Impl rule__FonctionDecl__Group__4 )
            // InternalMyTurtleDsl.g:4420:2: rule__FonctionDecl__Group__3__Impl rule__FonctionDecl__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__FonctionDecl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FonctionDecl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FonctionDecl__Group__3"


    // $ANTLR start "rule__FonctionDecl__Group__3__Impl"
    // InternalMyTurtleDsl.g:4427:1: rule__FonctionDecl__Group__3__Impl : ( ')' ) ;
    public final void rule__FonctionDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4431:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:4432:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:4432:1: ( ')' )
            // InternalMyTurtleDsl.g:4433:2: ')'
            {
             before(grammarAccess.getFonctionDeclAccess().getRightParenthesisKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFonctionDeclAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FonctionDecl__Group__3__Impl"


    // $ANTLR start "rule__FonctionDecl__Group__4"
    // InternalMyTurtleDsl.g:4442:1: rule__FonctionDecl__Group__4 : rule__FonctionDecl__Group__4__Impl rule__FonctionDecl__Group__5 ;
    public final void rule__FonctionDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4446:1: ( rule__FonctionDecl__Group__4__Impl rule__FonctionDecl__Group__5 )
            // InternalMyTurtleDsl.g:4447:2: rule__FonctionDecl__Group__4__Impl rule__FonctionDecl__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__FonctionDecl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FonctionDecl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FonctionDecl__Group__4"


    // $ANTLR start "rule__FonctionDecl__Group__4__Impl"
    // InternalMyTurtleDsl.g:4454:1: rule__FonctionDecl__Group__4__Impl : ( '{' ) ;
    public final void rule__FonctionDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4458:1: ( ( '{' ) )
            // InternalMyTurtleDsl.g:4459:1: ( '{' )
            {
            // InternalMyTurtleDsl.g:4459:1: ( '{' )
            // InternalMyTurtleDsl.g:4460:2: '{'
            {
             before(grammarAccess.getFonctionDeclAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFonctionDeclAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FonctionDecl__Group__4__Impl"


    // $ANTLR start "rule__FonctionDecl__Group__5"
    // InternalMyTurtleDsl.g:4469:1: rule__FonctionDecl__Group__5 : rule__FonctionDecl__Group__5__Impl rule__FonctionDecl__Group__6 ;
    public final void rule__FonctionDecl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4473:1: ( rule__FonctionDecl__Group__5__Impl rule__FonctionDecl__Group__6 )
            // InternalMyTurtleDsl.g:4474:2: rule__FonctionDecl__Group__5__Impl rule__FonctionDecl__Group__6
            {
            pushFollow(FOLLOW_29);
            rule__FonctionDecl__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FonctionDecl__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FonctionDecl__Group__5"


    // $ANTLR start "rule__FonctionDecl__Group__5__Impl"
    // InternalMyTurtleDsl.g:4481:1: rule__FonctionDecl__Group__5__Impl : ( ( rule__FonctionDecl__BodyAssignment_5 )* ) ;
    public final void rule__FonctionDecl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4485:1: ( ( ( rule__FonctionDecl__BodyAssignment_5 )* ) )
            // InternalMyTurtleDsl.g:4486:1: ( ( rule__FonctionDecl__BodyAssignment_5 )* )
            {
            // InternalMyTurtleDsl.g:4486:1: ( ( rule__FonctionDecl__BodyAssignment_5 )* )
            // InternalMyTurtleDsl.g:4487:2: ( rule__FonctionDecl__BodyAssignment_5 )*
            {
             before(grammarAccess.getFonctionDeclAccess().getBodyAssignment_5()); 
            // InternalMyTurtleDsl.g:4488:2: ( rule__FonctionDecl__BodyAssignment_5 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==30||(LA26_0>=32 && LA26_0<=38)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:4488:3: rule__FonctionDecl__BodyAssignment_5
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__FonctionDecl__BodyAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getFonctionDeclAccess().getBodyAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FonctionDecl__Group__5__Impl"


    // $ANTLR start "rule__FonctionDecl__Group__6"
    // InternalMyTurtleDsl.g:4496:1: rule__FonctionDecl__Group__6 : rule__FonctionDecl__Group__6__Impl rule__FonctionDecl__Group__7 ;
    public final void rule__FonctionDecl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4500:1: ( rule__FonctionDecl__Group__6__Impl rule__FonctionDecl__Group__7 )
            // InternalMyTurtleDsl.g:4501:2: rule__FonctionDecl__Group__6__Impl rule__FonctionDecl__Group__7
            {
            pushFollow(FOLLOW_31);
            rule__FonctionDecl__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FonctionDecl__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FonctionDecl__Group__6"


    // $ANTLR start "rule__FonctionDecl__Group__6__Impl"
    // InternalMyTurtleDsl.g:4508:1: rule__FonctionDecl__Group__6__Impl : ( '\\n' ) ;
    public final void rule__FonctionDecl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4512:1: ( ( '\\n' ) )
            // InternalMyTurtleDsl.g:4513:1: ( '\\n' )
            {
            // InternalMyTurtleDsl.g:4513:1: ( '\\n' )
            // InternalMyTurtleDsl.g:4514:2: '\\n'
            {
             before(grammarAccess.getFonctionDeclAccess().getLineFeedKeyword_6()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFonctionDeclAccess().getLineFeedKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FonctionDecl__Group__6__Impl"


    // $ANTLR start "rule__FonctionDecl__Group__7"
    // InternalMyTurtleDsl.g:4523:1: rule__FonctionDecl__Group__7 : rule__FonctionDecl__Group__7__Impl ;
    public final void rule__FonctionDecl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4527:1: ( rule__FonctionDecl__Group__7__Impl )
            // InternalMyTurtleDsl.g:4528:2: rule__FonctionDecl__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FonctionDecl__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FonctionDecl__Group__7"


    // $ANTLR start "rule__FonctionDecl__Group__7__Impl"
    // InternalMyTurtleDsl.g:4534:1: rule__FonctionDecl__Group__7__Impl : ( '}' ) ;
    public final void rule__FonctionDecl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4538:1: ( ( '}' ) )
            // InternalMyTurtleDsl.g:4539:1: ( '}' )
            {
            // InternalMyTurtleDsl.g:4539:1: ( '}' )
            // InternalMyTurtleDsl.g:4540:2: '}'
            {
             before(grammarAccess.getFonctionDeclAccess().getRightCurlyBracketKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFonctionDeclAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FonctionDecl__Group__7__Impl"


    // $ANTLR start "rule__IntDecl__Group__0"
    // InternalMyTurtleDsl.g:4550:1: rule__IntDecl__Group__0 : rule__IntDecl__Group__0__Impl rule__IntDecl__Group__1 ;
    public final void rule__IntDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4554:1: ( rule__IntDecl__Group__0__Impl rule__IntDecl__Group__1 )
            // InternalMyTurtleDsl.g:4555:2: rule__IntDecl__Group__0__Impl rule__IntDecl__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__IntDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntDecl__Group__0"


    // $ANTLR start "rule__IntDecl__Group__0__Impl"
    // InternalMyTurtleDsl.g:4562:1: rule__IntDecl__Group__0__Impl : ( 'Seconde' ) ;
    public final void rule__IntDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4566:1: ( ( 'Seconde' ) )
            // InternalMyTurtleDsl.g:4567:1: ( 'Seconde' )
            {
            // InternalMyTurtleDsl.g:4567:1: ( 'Seconde' )
            // InternalMyTurtleDsl.g:4568:2: 'Seconde'
            {
             before(grammarAccess.getIntDeclAccess().getSecondeKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getIntDeclAccess().getSecondeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntDecl__Group__0__Impl"


    // $ANTLR start "rule__IntDecl__Group__1"
    // InternalMyTurtleDsl.g:4577:1: rule__IntDecl__Group__1 : rule__IntDecl__Group__1__Impl rule__IntDecl__Group__2 ;
    public final void rule__IntDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4581:1: ( rule__IntDecl__Group__1__Impl rule__IntDecl__Group__2 )
            // InternalMyTurtleDsl.g:4582:2: rule__IntDecl__Group__1__Impl rule__IntDecl__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__IntDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntDecl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntDecl__Group__1"


    // $ANTLR start "rule__IntDecl__Group__1__Impl"
    // InternalMyTurtleDsl.g:4589:1: rule__IntDecl__Group__1__Impl : ( ( rule__IntDecl__NameAssignment_1 ) ) ;
    public final void rule__IntDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4593:1: ( ( ( rule__IntDecl__NameAssignment_1 ) ) )
            // InternalMyTurtleDsl.g:4594:1: ( ( rule__IntDecl__NameAssignment_1 ) )
            {
            // InternalMyTurtleDsl.g:4594:1: ( ( rule__IntDecl__NameAssignment_1 ) )
            // InternalMyTurtleDsl.g:4595:2: ( rule__IntDecl__NameAssignment_1 )
            {
             before(grammarAccess.getIntDeclAccess().getNameAssignment_1()); 
            // InternalMyTurtleDsl.g:4596:2: ( rule__IntDecl__NameAssignment_1 )
            // InternalMyTurtleDsl.g:4596:3: rule__IntDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IntDecl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIntDeclAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntDecl__Group__1__Impl"


    // $ANTLR start "rule__IntDecl__Group__2"
    // InternalMyTurtleDsl.g:4604:1: rule__IntDecl__Group__2 : rule__IntDecl__Group__2__Impl rule__IntDecl__Group__3 ;
    public final void rule__IntDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4608:1: ( rule__IntDecl__Group__2__Impl rule__IntDecl__Group__3 )
            // InternalMyTurtleDsl.g:4609:2: rule__IntDecl__Group__2__Impl rule__IntDecl__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__IntDecl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntDecl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntDecl__Group__2"


    // $ANTLR start "rule__IntDecl__Group__2__Impl"
    // InternalMyTurtleDsl.g:4616:1: rule__IntDecl__Group__2__Impl : ( '=' ) ;
    public final void rule__IntDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4620:1: ( ( '=' ) )
            // InternalMyTurtleDsl.g:4621:1: ( '=' )
            {
            // InternalMyTurtleDsl.g:4621:1: ( '=' )
            // InternalMyTurtleDsl.g:4622:2: '='
            {
             before(grammarAccess.getIntDeclAccess().getEqualsSignKeyword_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getIntDeclAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntDecl__Group__2__Impl"


    // $ANTLR start "rule__IntDecl__Group__3"
    // InternalMyTurtleDsl.g:4631:1: rule__IntDecl__Group__3 : rule__IntDecl__Group__3__Impl ;
    public final void rule__IntDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4635:1: ( rule__IntDecl__Group__3__Impl )
            // InternalMyTurtleDsl.g:4636:2: rule__IntDecl__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntDecl__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntDecl__Group__3"


    // $ANTLR start "rule__IntDecl__Group__3__Impl"
    // InternalMyTurtleDsl.g:4642:1: rule__IntDecl__Group__3__Impl : ( ( rule__IntDecl__ValAssignment_3 ) ) ;
    public final void rule__IntDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4646:1: ( ( ( rule__IntDecl__ValAssignment_3 ) ) )
            // InternalMyTurtleDsl.g:4647:1: ( ( rule__IntDecl__ValAssignment_3 ) )
            {
            // InternalMyTurtleDsl.g:4647:1: ( ( rule__IntDecl__ValAssignment_3 ) )
            // InternalMyTurtleDsl.g:4648:2: ( rule__IntDecl__ValAssignment_3 )
            {
             before(grammarAccess.getIntDeclAccess().getValAssignment_3()); 
            // InternalMyTurtleDsl.g:4649:2: ( rule__IntDecl__ValAssignment_3 )
            // InternalMyTurtleDsl.g:4649:3: rule__IntDecl__ValAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__IntDecl__ValAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIntDeclAccess().getValAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntDecl__Group__3__Impl"


    // $ANTLR start "rule__PourcentDecl__Group__0"
    // InternalMyTurtleDsl.g:4658:1: rule__PourcentDecl__Group__0 : rule__PourcentDecl__Group__0__Impl rule__PourcentDecl__Group__1 ;
    public final void rule__PourcentDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4662:1: ( rule__PourcentDecl__Group__0__Impl rule__PourcentDecl__Group__1 )
            // InternalMyTurtleDsl.g:4663:2: rule__PourcentDecl__Group__0__Impl rule__PourcentDecl__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__PourcentDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PourcentDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PourcentDecl__Group__0"


    // $ANTLR start "rule__PourcentDecl__Group__0__Impl"
    // InternalMyTurtleDsl.g:4670:1: rule__PourcentDecl__Group__0__Impl : ( 'Pourcent' ) ;
    public final void rule__PourcentDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4674:1: ( ( 'Pourcent' ) )
            // InternalMyTurtleDsl.g:4675:1: ( 'Pourcent' )
            {
            // InternalMyTurtleDsl.g:4675:1: ( 'Pourcent' )
            // InternalMyTurtleDsl.g:4676:2: 'Pourcent'
            {
             before(grammarAccess.getPourcentDeclAccess().getPourcentKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getPourcentDeclAccess().getPourcentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PourcentDecl__Group__0__Impl"


    // $ANTLR start "rule__PourcentDecl__Group__1"
    // InternalMyTurtleDsl.g:4685:1: rule__PourcentDecl__Group__1 : rule__PourcentDecl__Group__1__Impl rule__PourcentDecl__Group__2 ;
    public final void rule__PourcentDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4689:1: ( rule__PourcentDecl__Group__1__Impl rule__PourcentDecl__Group__2 )
            // InternalMyTurtleDsl.g:4690:2: rule__PourcentDecl__Group__1__Impl rule__PourcentDecl__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__PourcentDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PourcentDecl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PourcentDecl__Group__1"


    // $ANTLR start "rule__PourcentDecl__Group__1__Impl"
    // InternalMyTurtleDsl.g:4697:1: rule__PourcentDecl__Group__1__Impl : ( ( rule__PourcentDecl__NameAssignment_1 ) ) ;
    public final void rule__PourcentDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4701:1: ( ( ( rule__PourcentDecl__NameAssignment_1 ) ) )
            // InternalMyTurtleDsl.g:4702:1: ( ( rule__PourcentDecl__NameAssignment_1 ) )
            {
            // InternalMyTurtleDsl.g:4702:1: ( ( rule__PourcentDecl__NameAssignment_1 ) )
            // InternalMyTurtleDsl.g:4703:2: ( rule__PourcentDecl__NameAssignment_1 )
            {
             before(grammarAccess.getPourcentDeclAccess().getNameAssignment_1()); 
            // InternalMyTurtleDsl.g:4704:2: ( rule__PourcentDecl__NameAssignment_1 )
            // InternalMyTurtleDsl.g:4704:3: rule__PourcentDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PourcentDecl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPourcentDeclAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PourcentDecl__Group__1__Impl"


    // $ANTLR start "rule__PourcentDecl__Group__2"
    // InternalMyTurtleDsl.g:4712:1: rule__PourcentDecl__Group__2 : rule__PourcentDecl__Group__2__Impl rule__PourcentDecl__Group__3 ;
    public final void rule__PourcentDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4716:1: ( rule__PourcentDecl__Group__2__Impl rule__PourcentDecl__Group__3 )
            // InternalMyTurtleDsl.g:4717:2: rule__PourcentDecl__Group__2__Impl rule__PourcentDecl__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__PourcentDecl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PourcentDecl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PourcentDecl__Group__2"


    // $ANTLR start "rule__PourcentDecl__Group__2__Impl"
    // InternalMyTurtleDsl.g:4724:1: rule__PourcentDecl__Group__2__Impl : ( '=' ) ;
    public final void rule__PourcentDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4728:1: ( ( '=' ) )
            // InternalMyTurtleDsl.g:4729:1: ( '=' )
            {
            // InternalMyTurtleDsl.g:4729:1: ( '=' )
            // InternalMyTurtleDsl.g:4730:2: '='
            {
             before(grammarAccess.getPourcentDeclAccess().getEqualsSignKeyword_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getPourcentDeclAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PourcentDecl__Group__2__Impl"


    // $ANTLR start "rule__PourcentDecl__Group__3"
    // InternalMyTurtleDsl.g:4739:1: rule__PourcentDecl__Group__3 : rule__PourcentDecl__Group__3__Impl ;
    public final void rule__PourcentDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4743:1: ( rule__PourcentDecl__Group__3__Impl )
            // InternalMyTurtleDsl.g:4744:2: rule__PourcentDecl__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PourcentDecl__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PourcentDecl__Group__3"


    // $ANTLR start "rule__PourcentDecl__Group__3__Impl"
    // InternalMyTurtleDsl.g:4750:1: rule__PourcentDecl__Group__3__Impl : ( ( rule__PourcentDecl__ValAssignment_3 ) ) ;
    public final void rule__PourcentDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4754:1: ( ( ( rule__PourcentDecl__ValAssignment_3 ) ) )
            // InternalMyTurtleDsl.g:4755:1: ( ( rule__PourcentDecl__ValAssignment_3 ) )
            {
            // InternalMyTurtleDsl.g:4755:1: ( ( rule__PourcentDecl__ValAssignment_3 ) )
            // InternalMyTurtleDsl.g:4756:2: ( rule__PourcentDecl__ValAssignment_3 )
            {
             before(grammarAccess.getPourcentDeclAccess().getValAssignment_3()); 
            // InternalMyTurtleDsl.g:4757:2: ( rule__PourcentDecl__ValAssignment_3 )
            // InternalMyTurtleDsl.g:4757:3: rule__PourcentDecl__ValAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PourcentDecl__ValAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPourcentDeclAccess().getValAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PourcentDecl__Group__3__Impl"


    // $ANTLR start "rule__FonctionCall__Group__0"
    // InternalMyTurtleDsl.g:4766:1: rule__FonctionCall__Group__0 : rule__FonctionCall__Group__0__Impl rule__FonctionCall__Group__1 ;
    public final void rule__FonctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4770:1: ( rule__FonctionCall__Group__0__Impl rule__FonctionCall__Group__1 )
            // InternalMyTurtleDsl.g:4771:2: rule__FonctionCall__Group__0__Impl rule__FonctionCall__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__FonctionCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FonctionCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FonctionCall__Group__0"


    // $ANTLR start "rule__FonctionCall__Group__0__Impl"
    // InternalMyTurtleDsl.g:4778:1: rule__FonctionCall__Group__0__Impl : ( ( rule__FonctionCall__FuncAssignment_0 ) ) ;
    public final void rule__FonctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4782:1: ( ( ( rule__FonctionCall__FuncAssignment_0 ) ) )
            // InternalMyTurtleDsl.g:4783:1: ( ( rule__FonctionCall__FuncAssignment_0 ) )
            {
            // InternalMyTurtleDsl.g:4783:1: ( ( rule__FonctionCall__FuncAssignment_0 ) )
            // InternalMyTurtleDsl.g:4784:2: ( rule__FonctionCall__FuncAssignment_0 )
            {
             before(grammarAccess.getFonctionCallAccess().getFuncAssignment_0()); 
            // InternalMyTurtleDsl.g:4785:2: ( rule__FonctionCall__FuncAssignment_0 )
            // InternalMyTurtleDsl.g:4785:3: rule__FonctionCall__FuncAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FonctionCall__FuncAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFonctionCallAccess().getFuncAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FonctionCall__Group__0__Impl"


    // $ANTLR start "rule__FonctionCall__Group__1"
    // InternalMyTurtleDsl.g:4793:1: rule__FonctionCall__Group__1 : rule__FonctionCall__Group__1__Impl rule__FonctionCall__Group__2 ;
    public final void rule__FonctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4797:1: ( rule__FonctionCall__Group__1__Impl rule__FonctionCall__Group__2 )
            // InternalMyTurtleDsl.g:4798:2: rule__FonctionCall__Group__1__Impl rule__FonctionCall__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__FonctionCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FonctionCall__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FonctionCall__Group__1"


    // $ANTLR start "rule__FonctionCall__Group__1__Impl"
    // InternalMyTurtleDsl.g:4805:1: rule__FonctionCall__Group__1__Impl : ( '(' ) ;
    public final void rule__FonctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4809:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:4810:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:4810:1: ( '(' )
            // InternalMyTurtleDsl.g:4811:2: '('
            {
             before(grammarAccess.getFonctionCallAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFonctionCallAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FonctionCall__Group__1__Impl"


    // $ANTLR start "rule__FonctionCall__Group__2"
    // InternalMyTurtleDsl.g:4820:1: rule__FonctionCall__Group__2 : rule__FonctionCall__Group__2__Impl ;
    public final void rule__FonctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4824:1: ( rule__FonctionCall__Group__2__Impl )
            // InternalMyTurtleDsl.g:4825:2: rule__FonctionCall__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FonctionCall__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FonctionCall__Group__2"


    // $ANTLR start "rule__FonctionCall__Group__2__Impl"
    // InternalMyTurtleDsl.g:4831:1: rule__FonctionCall__Group__2__Impl : ( ')' ) ;
    public final void rule__FonctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4835:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:4836:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:4836:1: ( ')' )
            // InternalMyTurtleDsl.g:4837:2: ')'
            {
             before(grammarAccess.getFonctionCallAccess().getRightParenthesisKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFonctionCallAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FonctionCall__Group__2__Impl"


    // $ANTLR start "rule__Parallele2__Group_0__0"
    // InternalMyTurtleDsl.g:4847:1: rule__Parallele2__Group_0__0 : rule__Parallele2__Group_0__0__Impl rule__Parallele2__Group_0__1 ;
    public final void rule__Parallele2__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4851:1: ( rule__Parallele2__Group_0__0__Impl rule__Parallele2__Group_0__1 )
            // InternalMyTurtleDsl.g:4852:2: rule__Parallele2__Group_0__0__Impl rule__Parallele2__Group_0__1
            {
            pushFollow(FOLLOW_33);
            rule__Parallele2__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele2__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_0__0"


    // $ANTLR start "rule__Parallele2__Group_0__0__Impl"
    // InternalMyTurtleDsl.g:4859:1: rule__Parallele2__Group_0__0__Impl : ( ( rule__Parallele2__AAssignment_0_0 ) ) ;
    public final void rule__Parallele2__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4863:1: ( ( ( rule__Parallele2__AAssignment_0_0 ) ) )
            // InternalMyTurtleDsl.g:4864:1: ( ( rule__Parallele2__AAssignment_0_0 ) )
            {
            // InternalMyTurtleDsl.g:4864:1: ( ( rule__Parallele2__AAssignment_0_0 ) )
            // InternalMyTurtleDsl.g:4865:2: ( rule__Parallele2__AAssignment_0_0 )
            {
             before(grammarAccess.getParallele2Access().getAAssignment_0_0()); 
            // InternalMyTurtleDsl.g:4866:2: ( rule__Parallele2__AAssignment_0_0 )
            // InternalMyTurtleDsl.g:4866:3: rule__Parallele2__AAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Parallele2__AAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getParallele2Access().getAAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_0__0__Impl"


    // $ANTLR start "rule__Parallele2__Group_0__1"
    // InternalMyTurtleDsl.g:4874:1: rule__Parallele2__Group_0__1 : rule__Parallele2__Group_0__1__Impl rule__Parallele2__Group_0__2 ;
    public final void rule__Parallele2__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4878:1: ( rule__Parallele2__Group_0__1__Impl rule__Parallele2__Group_0__2 )
            // InternalMyTurtleDsl.g:4879:2: rule__Parallele2__Group_0__1__Impl rule__Parallele2__Group_0__2
            {
            pushFollow(FOLLOW_34);
            rule__Parallele2__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele2__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_0__1"


    // $ANTLR start "rule__Parallele2__Group_0__1__Impl"
    // InternalMyTurtleDsl.g:4886:1: rule__Parallele2__Group_0__1__Impl : ( '&' ) ;
    public final void rule__Parallele2__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4890:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:4891:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:4891:1: ( '&' )
            // InternalMyTurtleDsl.g:4892:2: '&'
            {
             before(grammarAccess.getParallele2Access().getAmpersandKeyword_0_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele2Access().getAmpersandKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_0__1__Impl"


    // $ANTLR start "rule__Parallele2__Group_0__2"
    // InternalMyTurtleDsl.g:4901:1: rule__Parallele2__Group_0__2 : rule__Parallele2__Group_0__2__Impl ;
    public final void rule__Parallele2__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4905:1: ( rule__Parallele2__Group_0__2__Impl )
            // InternalMyTurtleDsl.g:4906:2: rule__Parallele2__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parallele2__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_0__2"


    // $ANTLR start "rule__Parallele2__Group_0__2__Impl"
    // InternalMyTurtleDsl.g:4912:1: rule__Parallele2__Group_0__2__Impl : ( ( rule__Parallele2__TAssignment_0_2 ) ) ;
    public final void rule__Parallele2__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4916:1: ( ( ( rule__Parallele2__TAssignment_0_2 ) ) )
            // InternalMyTurtleDsl.g:4917:1: ( ( rule__Parallele2__TAssignment_0_2 ) )
            {
            // InternalMyTurtleDsl.g:4917:1: ( ( rule__Parallele2__TAssignment_0_2 ) )
            // InternalMyTurtleDsl.g:4918:2: ( rule__Parallele2__TAssignment_0_2 )
            {
             before(grammarAccess.getParallele2Access().getTAssignment_0_2()); 
            // InternalMyTurtleDsl.g:4919:2: ( rule__Parallele2__TAssignment_0_2 )
            // InternalMyTurtleDsl.g:4919:3: rule__Parallele2__TAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Parallele2__TAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getParallele2Access().getTAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_0__2__Impl"


    // $ANTLR start "rule__Parallele2__Group_1__0"
    // InternalMyTurtleDsl.g:4928:1: rule__Parallele2__Group_1__0 : rule__Parallele2__Group_1__0__Impl rule__Parallele2__Group_1__1 ;
    public final void rule__Parallele2__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4932:1: ( rule__Parallele2__Group_1__0__Impl rule__Parallele2__Group_1__1 )
            // InternalMyTurtleDsl.g:4933:2: rule__Parallele2__Group_1__0__Impl rule__Parallele2__Group_1__1
            {
            pushFollow(FOLLOW_33);
            rule__Parallele2__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele2__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_1__0"


    // $ANTLR start "rule__Parallele2__Group_1__0__Impl"
    // InternalMyTurtleDsl.g:4940:1: rule__Parallele2__Group_1__0__Impl : ( ( rule__Parallele2__AAssignment_1_0 ) ) ;
    public final void rule__Parallele2__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4944:1: ( ( ( rule__Parallele2__AAssignment_1_0 ) ) )
            // InternalMyTurtleDsl.g:4945:1: ( ( rule__Parallele2__AAssignment_1_0 ) )
            {
            // InternalMyTurtleDsl.g:4945:1: ( ( rule__Parallele2__AAssignment_1_0 ) )
            // InternalMyTurtleDsl.g:4946:2: ( rule__Parallele2__AAssignment_1_0 )
            {
             before(grammarAccess.getParallele2Access().getAAssignment_1_0()); 
            // InternalMyTurtleDsl.g:4947:2: ( rule__Parallele2__AAssignment_1_0 )
            // InternalMyTurtleDsl.g:4947:3: rule__Parallele2__AAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Parallele2__AAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getParallele2Access().getAAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_1__0__Impl"


    // $ANTLR start "rule__Parallele2__Group_1__1"
    // InternalMyTurtleDsl.g:4955:1: rule__Parallele2__Group_1__1 : rule__Parallele2__Group_1__1__Impl rule__Parallele2__Group_1__2 ;
    public final void rule__Parallele2__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4959:1: ( rule__Parallele2__Group_1__1__Impl rule__Parallele2__Group_1__2 )
            // InternalMyTurtleDsl.g:4960:2: rule__Parallele2__Group_1__1__Impl rule__Parallele2__Group_1__2
            {
            pushFollow(FOLLOW_35);
            rule__Parallele2__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele2__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_1__1"


    // $ANTLR start "rule__Parallele2__Group_1__1__Impl"
    // InternalMyTurtleDsl.g:4967:1: rule__Parallele2__Group_1__1__Impl : ( '&' ) ;
    public final void rule__Parallele2__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4971:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:4972:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:4972:1: ( '&' )
            // InternalMyTurtleDsl.g:4973:2: '&'
            {
             before(grammarAccess.getParallele2Access().getAmpersandKeyword_1_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele2Access().getAmpersandKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_1__1__Impl"


    // $ANTLR start "rule__Parallele2__Group_1__2"
    // InternalMyTurtleDsl.g:4982:1: rule__Parallele2__Group_1__2 : rule__Parallele2__Group_1__2__Impl ;
    public final void rule__Parallele2__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4986:1: ( rule__Parallele2__Group_1__2__Impl )
            // InternalMyTurtleDsl.g:4987:2: rule__Parallele2__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parallele2__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_1__2"


    // $ANTLR start "rule__Parallele2__Group_1__2__Impl"
    // InternalMyTurtleDsl.g:4993:1: rule__Parallele2__Group_1__2__Impl : ( ( rule__Parallele2__TAssignment_1_2 ) ) ;
    public final void rule__Parallele2__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4997:1: ( ( ( rule__Parallele2__TAssignment_1_2 ) ) )
            // InternalMyTurtleDsl.g:4998:1: ( ( rule__Parallele2__TAssignment_1_2 ) )
            {
            // InternalMyTurtleDsl.g:4998:1: ( ( rule__Parallele2__TAssignment_1_2 ) )
            // InternalMyTurtleDsl.g:4999:2: ( rule__Parallele2__TAssignment_1_2 )
            {
             before(grammarAccess.getParallele2Access().getTAssignment_1_2()); 
            // InternalMyTurtleDsl.g:5000:2: ( rule__Parallele2__TAssignment_1_2 )
            // InternalMyTurtleDsl.g:5000:3: rule__Parallele2__TAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Parallele2__TAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getParallele2Access().getTAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_1__2__Impl"


    // $ANTLR start "rule__Parallele2__Group_2__0"
    // InternalMyTurtleDsl.g:5009:1: rule__Parallele2__Group_2__0 : rule__Parallele2__Group_2__0__Impl rule__Parallele2__Group_2__1 ;
    public final void rule__Parallele2__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5013:1: ( rule__Parallele2__Group_2__0__Impl rule__Parallele2__Group_2__1 )
            // InternalMyTurtleDsl.g:5014:2: rule__Parallele2__Group_2__0__Impl rule__Parallele2__Group_2__1
            {
            pushFollow(FOLLOW_33);
            rule__Parallele2__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele2__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_2__0"


    // $ANTLR start "rule__Parallele2__Group_2__0__Impl"
    // InternalMyTurtleDsl.g:5021:1: rule__Parallele2__Group_2__0__Impl : ( ( rule__Parallele2__AAssignment_2_0 ) ) ;
    public final void rule__Parallele2__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5025:1: ( ( ( rule__Parallele2__AAssignment_2_0 ) ) )
            // InternalMyTurtleDsl.g:5026:1: ( ( rule__Parallele2__AAssignment_2_0 ) )
            {
            // InternalMyTurtleDsl.g:5026:1: ( ( rule__Parallele2__AAssignment_2_0 ) )
            // InternalMyTurtleDsl.g:5027:2: ( rule__Parallele2__AAssignment_2_0 )
            {
             before(grammarAccess.getParallele2Access().getAAssignment_2_0()); 
            // InternalMyTurtleDsl.g:5028:2: ( rule__Parallele2__AAssignment_2_0 )
            // InternalMyTurtleDsl.g:5028:3: rule__Parallele2__AAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Parallele2__AAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getParallele2Access().getAAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_2__0__Impl"


    // $ANTLR start "rule__Parallele2__Group_2__1"
    // InternalMyTurtleDsl.g:5036:1: rule__Parallele2__Group_2__1 : rule__Parallele2__Group_2__1__Impl rule__Parallele2__Group_2__2 ;
    public final void rule__Parallele2__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5040:1: ( rule__Parallele2__Group_2__1__Impl rule__Parallele2__Group_2__2 )
            // InternalMyTurtleDsl.g:5041:2: rule__Parallele2__Group_2__1__Impl rule__Parallele2__Group_2__2
            {
            pushFollow(FOLLOW_36);
            rule__Parallele2__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele2__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_2__1"


    // $ANTLR start "rule__Parallele2__Group_2__1__Impl"
    // InternalMyTurtleDsl.g:5048:1: rule__Parallele2__Group_2__1__Impl : ( '&' ) ;
    public final void rule__Parallele2__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5052:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:5053:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:5053:1: ( '&' )
            // InternalMyTurtleDsl.g:5054:2: '&'
            {
             before(grammarAccess.getParallele2Access().getAmpersandKeyword_2_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele2Access().getAmpersandKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_2__1__Impl"


    // $ANTLR start "rule__Parallele2__Group_2__2"
    // InternalMyTurtleDsl.g:5063:1: rule__Parallele2__Group_2__2 : rule__Parallele2__Group_2__2__Impl ;
    public final void rule__Parallele2__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5067:1: ( rule__Parallele2__Group_2__2__Impl )
            // InternalMyTurtleDsl.g:5068:2: rule__Parallele2__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parallele2__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_2__2"


    // $ANTLR start "rule__Parallele2__Group_2__2__Impl"
    // InternalMyTurtleDsl.g:5074:1: rule__Parallele2__Group_2__2__Impl : ( ( rule__Parallele2__TAssignment_2_2 ) ) ;
    public final void rule__Parallele2__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5078:1: ( ( ( rule__Parallele2__TAssignment_2_2 ) ) )
            // InternalMyTurtleDsl.g:5079:1: ( ( rule__Parallele2__TAssignment_2_2 ) )
            {
            // InternalMyTurtleDsl.g:5079:1: ( ( rule__Parallele2__TAssignment_2_2 ) )
            // InternalMyTurtleDsl.g:5080:2: ( rule__Parallele2__TAssignment_2_2 )
            {
             before(grammarAccess.getParallele2Access().getTAssignment_2_2()); 
            // InternalMyTurtleDsl.g:5081:2: ( rule__Parallele2__TAssignment_2_2 )
            // InternalMyTurtleDsl.g:5081:3: rule__Parallele2__TAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Parallele2__TAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getParallele2Access().getTAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_2__2__Impl"


    // $ANTLR start "rule__Parallele2__Group_3__0"
    // InternalMyTurtleDsl.g:5090:1: rule__Parallele2__Group_3__0 : rule__Parallele2__Group_3__0__Impl rule__Parallele2__Group_3__1 ;
    public final void rule__Parallele2__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5094:1: ( rule__Parallele2__Group_3__0__Impl rule__Parallele2__Group_3__1 )
            // InternalMyTurtleDsl.g:5095:2: rule__Parallele2__Group_3__0__Impl rule__Parallele2__Group_3__1
            {
            pushFollow(FOLLOW_33);
            rule__Parallele2__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele2__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_3__0"


    // $ANTLR start "rule__Parallele2__Group_3__0__Impl"
    // InternalMyTurtleDsl.g:5102:1: rule__Parallele2__Group_3__0__Impl : ( ( rule__Parallele2__TAssignment_3_0 ) ) ;
    public final void rule__Parallele2__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5106:1: ( ( ( rule__Parallele2__TAssignment_3_0 ) ) )
            // InternalMyTurtleDsl.g:5107:1: ( ( rule__Parallele2__TAssignment_3_0 ) )
            {
            // InternalMyTurtleDsl.g:5107:1: ( ( rule__Parallele2__TAssignment_3_0 ) )
            // InternalMyTurtleDsl.g:5108:2: ( rule__Parallele2__TAssignment_3_0 )
            {
             before(grammarAccess.getParallele2Access().getTAssignment_3_0()); 
            // InternalMyTurtleDsl.g:5109:2: ( rule__Parallele2__TAssignment_3_0 )
            // InternalMyTurtleDsl.g:5109:3: rule__Parallele2__TAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Parallele2__TAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getParallele2Access().getTAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_3__0__Impl"


    // $ANTLR start "rule__Parallele2__Group_3__1"
    // InternalMyTurtleDsl.g:5117:1: rule__Parallele2__Group_3__1 : rule__Parallele2__Group_3__1__Impl rule__Parallele2__Group_3__2 ;
    public final void rule__Parallele2__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5121:1: ( rule__Parallele2__Group_3__1__Impl rule__Parallele2__Group_3__2 )
            // InternalMyTurtleDsl.g:5122:2: rule__Parallele2__Group_3__1__Impl rule__Parallele2__Group_3__2
            {
            pushFollow(FOLLOW_35);
            rule__Parallele2__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele2__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_3__1"


    // $ANTLR start "rule__Parallele2__Group_3__1__Impl"
    // InternalMyTurtleDsl.g:5129:1: rule__Parallele2__Group_3__1__Impl : ( '&' ) ;
    public final void rule__Parallele2__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5133:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:5134:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:5134:1: ( '&' )
            // InternalMyTurtleDsl.g:5135:2: '&'
            {
             before(grammarAccess.getParallele2Access().getAmpersandKeyword_3_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele2Access().getAmpersandKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_3__1__Impl"


    // $ANTLR start "rule__Parallele2__Group_3__2"
    // InternalMyTurtleDsl.g:5144:1: rule__Parallele2__Group_3__2 : rule__Parallele2__Group_3__2__Impl ;
    public final void rule__Parallele2__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5148:1: ( rule__Parallele2__Group_3__2__Impl )
            // InternalMyTurtleDsl.g:5149:2: rule__Parallele2__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parallele2__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_3__2"


    // $ANTLR start "rule__Parallele2__Group_3__2__Impl"
    // InternalMyTurtleDsl.g:5155:1: rule__Parallele2__Group_3__2__Impl : ( ( rule__Parallele2__BAssignment_3_2 ) ) ;
    public final void rule__Parallele2__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5159:1: ( ( ( rule__Parallele2__BAssignment_3_2 ) ) )
            // InternalMyTurtleDsl.g:5160:1: ( ( rule__Parallele2__BAssignment_3_2 ) )
            {
            // InternalMyTurtleDsl.g:5160:1: ( ( rule__Parallele2__BAssignment_3_2 ) )
            // InternalMyTurtleDsl.g:5161:2: ( rule__Parallele2__BAssignment_3_2 )
            {
             before(grammarAccess.getParallele2Access().getBAssignment_3_2()); 
            // InternalMyTurtleDsl.g:5162:2: ( rule__Parallele2__BAssignment_3_2 )
            // InternalMyTurtleDsl.g:5162:3: rule__Parallele2__BAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Parallele2__BAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getParallele2Access().getBAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_3__2__Impl"


    // $ANTLR start "rule__Parallele2__Group_4__0"
    // InternalMyTurtleDsl.g:5171:1: rule__Parallele2__Group_4__0 : rule__Parallele2__Group_4__0__Impl rule__Parallele2__Group_4__1 ;
    public final void rule__Parallele2__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5175:1: ( rule__Parallele2__Group_4__0__Impl rule__Parallele2__Group_4__1 )
            // InternalMyTurtleDsl.g:5176:2: rule__Parallele2__Group_4__0__Impl rule__Parallele2__Group_4__1
            {
            pushFollow(FOLLOW_33);
            rule__Parallele2__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele2__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_4__0"


    // $ANTLR start "rule__Parallele2__Group_4__0__Impl"
    // InternalMyTurtleDsl.g:5183:1: rule__Parallele2__Group_4__0__Impl : ( ( rule__Parallele2__TAssignment_4_0 ) ) ;
    public final void rule__Parallele2__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5187:1: ( ( ( rule__Parallele2__TAssignment_4_0 ) ) )
            // InternalMyTurtleDsl.g:5188:1: ( ( rule__Parallele2__TAssignment_4_0 ) )
            {
            // InternalMyTurtleDsl.g:5188:1: ( ( rule__Parallele2__TAssignment_4_0 ) )
            // InternalMyTurtleDsl.g:5189:2: ( rule__Parallele2__TAssignment_4_0 )
            {
             before(grammarAccess.getParallele2Access().getTAssignment_4_0()); 
            // InternalMyTurtleDsl.g:5190:2: ( rule__Parallele2__TAssignment_4_0 )
            // InternalMyTurtleDsl.g:5190:3: rule__Parallele2__TAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Parallele2__TAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getParallele2Access().getTAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_4__0__Impl"


    // $ANTLR start "rule__Parallele2__Group_4__1"
    // InternalMyTurtleDsl.g:5198:1: rule__Parallele2__Group_4__1 : rule__Parallele2__Group_4__1__Impl rule__Parallele2__Group_4__2 ;
    public final void rule__Parallele2__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5202:1: ( rule__Parallele2__Group_4__1__Impl rule__Parallele2__Group_4__2 )
            // InternalMyTurtleDsl.g:5203:2: rule__Parallele2__Group_4__1__Impl rule__Parallele2__Group_4__2
            {
            pushFollow(FOLLOW_37);
            rule__Parallele2__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele2__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_4__1"


    // $ANTLR start "rule__Parallele2__Group_4__1__Impl"
    // InternalMyTurtleDsl.g:5210:1: rule__Parallele2__Group_4__1__Impl : ( '&' ) ;
    public final void rule__Parallele2__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5214:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:5215:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:5215:1: ( '&' )
            // InternalMyTurtleDsl.g:5216:2: '&'
            {
             before(grammarAccess.getParallele2Access().getAmpersandKeyword_4_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele2Access().getAmpersandKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_4__1__Impl"


    // $ANTLR start "rule__Parallele2__Group_4__2"
    // InternalMyTurtleDsl.g:5225:1: rule__Parallele2__Group_4__2 : rule__Parallele2__Group_4__2__Impl ;
    public final void rule__Parallele2__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5229:1: ( rule__Parallele2__Group_4__2__Impl )
            // InternalMyTurtleDsl.g:5230:2: rule__Parallele2__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parallele2__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_4__2"


    // $ANTLR start "rule__Parallele2__Group_4__2__Impl"
    // InternalMyTurtleDsl.g:5236:1: rule__Parallele2__Group_4__2__Impl : ( ( rule__Parallele2__BAssignment_4_2 ) ) ;
    public final void rule__Parallele2__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5240:1: ( ( ( rule__Parallele2__BAssignment_4_2 ) ) )
            // InternalMyTurtleDsl.g:5241:1: ( ( rule__Parallele2__BAssignment_4_2 ) )
            {
            // InternalMyTurtleDsl.g:5241:1: ( ( rule__Parallele2__BAssignment_4_2 ) )
            // InternalMyTurtleDsl.g:5242:2: ( rule__Parallele2__BAssignment_4_2 )
            {
             before(grammarAccess.getParallele2Access().getBAssignment_4_2()); 
            // InternalMyTurtleDsl.g:5243:2: ( rule__Parallele2__BAssignment_4_2 )
            // InternalMyTurtleDsl.g:5243:3: rule__Parallele2__BAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Parallele2__BAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getParallele2Access().getBAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_4__2__Impl"


    // $ANTLR start "rule__Parallele2__Group_5__0"
    // InternalMyTurtleDsl.g:5252:1: rule__Parallele2__Group_5__0 : rule__Parallele2__Group_5__0__Impl rule__Parallele2__Group_5__1 ;
    public final void rule__Parallele2__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5256:1: ( rule__Parallele2__Group_5__0__Impl rule__Parallele2__Group_5__1 )
            // InternalMyTurtleDsl.g:5257:2: rule__Parallele2__Group_5__0__Impl rule__Parallele2__Group_5__1
            {
            pushFollow(FOLLOW_33);
            rule__Parallele2__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele2__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_5__0"


    // $ANTLR start "rule__Parallele2__Group_5__0__Impl"
    // InternalMyTurtleDsl.g:5264:1: rule__Parallele2__Group_5__0__Impl : ( ( rule__Parallele2__TAssignment_5_0 ) ) ;
    public final void rule__Parallele2__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5268:1: ( ( ( rule__Parallele2__TAssignment_5_0 ) ) )
            // InternalMyTurtleDsl.g:5269:1: ( ( rule__Parallele2__TAssignment_5_0 ) )
            {
            // InternalMyTurtleDsl.g:5269:1: ( ( rule__Parallele2__TAssignment_5_0 ) )
            // InternalMyTurtleDsl.g:5270:2: ( rule__Parallele2__TAssignment_5_0 )
            {
             before(grammarAccess.getParallele2Access().getTAssignment_5_0()); 
            // InternalMyTurtleDsl.g:5271:2: ( rule__Parallele2__TAssignment_5_0 )
            // InternalMyTurtleDsl.g:5271:3: rule__Parallele2__TAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__Parallele2__TAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getParallele2Access().getTAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_5__0__Impl"


    // $ANTLR start "rule__Parallele2__Group_5__1"
    // InternalMyTurtleDsl.g:5279:1: rule__Parallele2__Group_5__1 : rule__Parallele2__Group_5__1__Impl rule__Parallele2__Group_5__2 ;
    public final void rule__Parallele2__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5283:1: ( rule__Parallele2__Group_5__1__Impl rule__Parallele2__Group_5__2 )
            // InternalMyTurtleDsl.g:5284:2: rule__Parallele2__Group_5__1__Impl rule__Parallele2__Group_5__2
            {
            pushFollow(FOLLOW_36);
            rule__Parallele2__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele2__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_5__1"


    // $ANTLR start "rule__Parallele2__Group_5__1__Impl"
    // InternalMyTurtleDsl.g:5291:1: rule__Parallele2__Group_5__1__Impl : ( '&' ) ;
    public final void rule__Parallele2__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5295:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:5296:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:5296:1: ( '&' )
            // InternalMyTurtleDsl.g:5297:2: '&'
            {
             before(grammarAccess.getParallele2Access().getAmpersandKeyword_5_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele2Access().getAmpersandKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_5__1__Impl"


    // $ANTLR start "rule__Parallele2__Group_5__2"
    // InternalMyTurtleDsl.g:5306:1: rule__Parallele2__Group_5__2 : rule__Parallele2__Group_5__2__Impl ;
    public final void rule__Parallele2__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5310:1: ( rule__Parallele2__Group_5__2__Impl )
            // InternalMyTurtleDsl.g:5311:2: rule__Parallele2__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parallele2__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_5__2"


    // $ANTLR start "rule__Parallele2__Group_5__2__Impl"
    // InternalMyTurtleDsl.g:5317:1: rule__Parallele2__Group_5__2__Impl : ( ( rule__Parallele2__BAssignment_5_2 ) ) ;
    public final void rule__Parallele2__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5321:1: ( ( ( rule__Parallele2__BAssignment_5_2 ) ) )
            // InternalMyTurtleDsl.g:5322:1: ( ( rule__Parallele2__BAssignment_5_2 ) )
            {
            // InternalMyTurtleDsl.g:5322:1: ( ( rule__Parallele2__BAssignment_5_2 ) )
            // InternalMyTurtleDsl.g:5323:2: ( rule__Parallele2__BAssignment_5_2 )
            {
             before(grammarAccess.getParallele2Access().getBAssignment_5_2()); 
            // InternalMyTurtleDsl.g:5324:2: ( rule__Parallele2__BAssignment_5_2 )
            // InternalMyTurtleDsl.g:5324:3: rule__Parallele2__BAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Parallele2__BAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getParallele2Access().getBAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_5__2__Impl"


    // $ANTLR start "rule__Parallele2__Group_6__0"
    // InternalMyTurtleDsl.g:5333:1: rule__Parallele2__Group_6__0 : rule__Parallele2__Group_6__0__Impl rule__Parallele2__Group_6__1 ;
    public final void rule__Parallele2__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5337:1: ( rule__Parallele2__Group_6__0__Impl rule__Parallele2__Group_6__1 )
            // InternalMyTurtleDsl.g:5338:2: rule__Parallele2__Group_6__0__Impl rule__Parallele2__Group_6__1
            {
            pushFollow(FOLLOW_33);
            rule__Parallele2__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele2__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_6__0"


    // $ANTLR start "rule__Parallele2__Group_6__0__Impl"
    // InternalMyTurtleDsl.g:5345:1: rule__Parallele2__Group_6__0__Impl : ( ( rule__Parallele2__TAssignment_6_0 ) ) ;
    public final void rule__Parallele2__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5349:1: ( ( ( rule__Parallele2__TAssignment_6_0 ) ) )
            // InternalMyTurtleDsl.g:5350:1: ( ( rule__Parallele2__TAssignment_6_0 ) )
            {
            // InternalMyTurtleDsl.g:5350:1: ( ( rule__Parallele2__TAssignment_6_0 ) )
            // InternalMyTurtleDsl.g:5351:2: ( rule__Parallele2__TAssignment_6_0 )
            {
             before(grammarAccess.getParallele2Access().getTAssignment_6_0()); 
            // InternalMyTurtleDsl.g:5352:2: ( rule__Parallele2__TAssignment_6_0 )
            // InternalMyTurtleDsl.g:5352:3: rule__Parallele2__TAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__Parallele2__TAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getParallele2Access().getTAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_6__0__Impl"


    // $ANTLR start "rule__Parallele2__Group_6__1"
    // InternalMyTurtleDsl.g:5360:1: rule__Parallele2__Group_6__1 : rule__Parallele2__Group_6__1__Impl rule__Parallele2__Group_6__2 ;
    public final void rule__Parallele2__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5364:1: ( rule__Parallele2__Group_6__1__Impl rule__Parallele2__Group_6__2 )
            // InternalMyTurtleDsl.g:5365:2: rule__Parallele2__Group_6__1__Impl rule__Parallele2__Group_6__2
            {
            pushFollow(FOLLOW_37);
            rule__Parallele2__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele2__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_6__1"


    // $ANTLR start "rule__Parallele2__Group_6__1__Impl"
    // InternalMyTurtleDsl.g:5372:1: rule__Parallele2__Group_6__1__Impl : ( '&' ) ;
    public final void rule__Parallele2__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5376:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:5377:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:5377:1: ( '&' )
            // InternalMyTurtleDsl.g:5378:2: '&'
            {
             before(grammarAccess.getParallele2Access().getAmpersandKeyword_6_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele2Access().getAmpersandKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_6__1__Impl"


    // $ANTLR start "rule__Parallele2__Group_6__2"
    // InternalMyTurtleDsl.g:5387:1: rule__Parallele2__Group_6__2 : rule__Parallele2__Group_6__2__Impl ;
    public final void rule__Parallele2__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5391:1: ( rule__Parallele2__Group_6__2__Impl )
            // InternalMyTurtleDsl.g:5392:2: rule__Parallele2__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parallele2__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_6__2"


    // $ANTLR start "rule__Parallele2__Group_6__2__Impl"
    // InternalMyTurtleDsl.g:5398:1: rule__Parallele2__Group_6__2__Impl : ( ( rule__Parallele2__AAssignment_6_2 ) ) ;
    public final void rule__Parallele2__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5402:1: ( ( ( rule__Parallele2__AAssignment_6_2 ) ) )
            // InternalMyTurtleDsl.g:5403:1: ( ( rule__Parallele2__AAssignment_6_2 ) )
            {
            // InternalMyTurtleDsl.g:5403:1: ( ( rule__Parallele2__AAssignment_6_2 ) )
            // InternalMyTurtleDsl.g:5404:2: ( rule__Parallele2__AAssignment_6_2 )
            {
             before(grammarAccess.getParallele2Access().getAAssignment_6_2()); 
            // InternalMyTurtleDsl.g:5405:2: ( rule__Parallele2__AAssignment_6_2 )
            // InternalMyTurtleDsl.g:5405:3: rule__Parallele2__AAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Parallele2__AAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getParallele2Access().getAAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_6__2__Impl"


    // $ANTLR start "rule__Parallele2__Group_7__0"
    // InternalMyTurtleDsl.g:5414:1: rule__Parallele2__Group_7__0 : rule__Parallele2__Group_7__0__Impl rule__Parallele2__Group_7__1 ;
    public final void rule__Parallele2__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5418:1: ( rule__Parallele2__Group_7__0__Impl rule__Parallele2__Group_7__1 )
            // InternalMyTurtleDsl.g:5419:2: rule__Parallele2__Group_7__0__Impl rule__Parallele2__Group_7__1
            {
            pushFollow(FOLLOW_33);
            rule__Parallele2__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele2__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_7__0"


    // $ANTLR start "rule__Parallele2__Group_7__0__Impl"
    // InternalMyTurtleDsl.g:5426:1: rule__Parallele2__Group_7__0__Impl : ( ( rule__Parallele2__TAssignment_7_0 ) ) ;
    public final void rule__Parallele2__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5430:1: ( ( ( rule__Parallele2__TAssignment_7_0 ) ) )
            // InternalMyTurtleDsl.g:5431:1: ( ( rule__Parallele2__TAssignment_7_0 ) )
            {
            // InternalMyTurtleDsl.g:5431:1: ( ( rule__Parallele2__TAssignment_7_0 ) )
            // InternalMyTurtleDsl.g:5432:2: ( rule__Parallele2__TAssignment_7_0 )
            {
             before(grammarAccess.getParallele2Access().getTAssignment_7_0()); 
            // InternalMyTurtleDsl.g:5433:2: ( rule__Parallele2__TAssignment_7_0 )
            // InternalMyTurtleDsl.g:5433:3: rule__Parallele2__TAssignment_7_0
            {
            pushFollow(FOLLOW_2);
            rule__Parallele2__TAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getParallele2Access().getTAssignment_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_7__0__Impl"


    // $ANTLR start "rule__Parallele2__Group_7__1"
    // InternalMyTurtleDsl.g:5441:1: rule__Parallele2__Group_7__1 : rule__Parallele2__Group_7__1__Impl rule__Parallele2__Group_7__2 ;
    public final void rule__Parallele2__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5445:1: ( rule__Parallele2__Group_7__1__Impl rule__Parallele2__Group_7__2 )
            // InternalMyTurtleDsl.g:5446:2: rule__Parallele2__Group_7__1__Impl rule__Parallele2__Group_7__2
            {
            pushFollow(FOLLOW_35);
            rule__Parallele2__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele2__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_7__1"


    // $ANTLR start "rule__Parallele2__Group_7__1__Impl"
    // InternalMyTurtleDsl.g:5453:1: rule__Parallele2__Group_7__1__Impl : ( '&' ) ;
    public final void rule__Parallele2__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5457:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:5458:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:5458:1: ( '&' )
            // InternalMyTurtleDsl.g:5459:2: '&'
            {
             before(grammarAccess.getParallele2Access().getAmpersandKeyword_7_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele2Access().getAmpersandKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_7__1__Impl"


    // $ANTLR start "rule__Parallele2__Group_7__2"
    // InternalMyTurtleDsl.g:5468:1: rule__Parallele2__Group_7__2 : rule__Parallele2__Group_7__2__Impl ;
    public final void rule__Parallele2__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5472:1: ( rule__Parallele2__Group_7__2__Impl )
            // InternalMyTurtleDsl.g:5473:2: rule__Parallele2__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parallele2__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_7__2"


    // $ANTLR start "rule__Parallele2__Group_7__2__Impl"
    // InternalMyTurtleDsl.g:5479:1: rule__Parallele2__Group_7__2__Impl : ( ( rule__Parallele2__AAssignment_7_2 ) ) ;
    public final void rule__Parallele2__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5483:1: ( ( ( rule__Parallele2__AAssignment_7_2 ) ) )
            // InternalMyTurtleDsl.g:5484:1: ( ( rule__Parallele2__AAssignment_7_2 ) )
            {
            // InternalMyTurtleDsl.g:5484:1: ( ( rule__Parallele2__AAssignment_7_2 ) )
            // InternalMyTurtleDsl.g:5485:2: ( rule__Parallele2__AAssignment_7_2 )
            {
             before(grammarAccess.getParallele2Access().getAAssignment_7_2()); 
            // InternalMyTurtleDsl.g:5486:2: ( rule__Parallele2__AAssignment_7_2 )
            // InternalMyTurtleDsl.g:5486:3: rule__Parallele2__AAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Parallele2__AAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getParallele2Access().getAAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_7__2__Impl"


    // $ANTLR start "rule__Parallele2__Group_8__0"
    // InternalMyTurtleDsl.g:5495:1: rule__Parallele2__Group_8__0 : rule__Parallele2__Group_8__0__Impl rule__Parallele2__Group_8__1 ;
    public final void rule__Parallele2__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5499:1: ( rule__Parallele2__Group_8__0__Impl rule__Parallele2__Group_8__1 )
            // InternalMyTurtleDsl.g:5500:2: rule__Parallele2__Group_8__0__Impl rule__Parallele2__Group_8__1
            {
            pushFollow(FOLLOW_33);
            rule__Parallele2__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele2__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_8__0"


    // $ANTLR start "rule__Parallele2__Group_8__0__Impl"
    // InternalMyTurtleDsl.g:5507:1: rule__Parallele2__Group_8__0__Impl : ( ( rule__Parallele2__TAssignment_8_0 ) ) ;
    public final void rule__Parallele2__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5511:1: ( ( ( rule__Parallele2__TAssignment_8_0 ) ) )
            // InternalMyTurtleDsl.g:5512:1: ( ( rule__Parallele2__TAssignment_8_0 ) )
            {
            // InternalMyTurtleDsl.g:5512:1: ( ( rule__Parallele2__TAssignment_8_0 ) )
            // InternalMyTurtleDsl.g:5513:2: ( rule__Parallele2__TAssignment_8_0 )
            {
             before(grammarAccess.getParallele2Access().getTAssignment_8_0()); 
            // InternalMyTurtleDsl.g:5514:2: ( rule__Parallele2__TAssignment_8_0 )
            // InternalMyTurtleDsl.g:5514:3: rule__Parallele2__TAssignment_8_0
            {
            pushFollow(FOLLOW_2);
            rule__Parallele2__TAssignment_8_0();

            state._fsp--;


            }

             after(grammarAccess.getParallele2Access().getTAssignment_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_8__0__Impl"


    // $ANTLR start "rule__Parallele2__Group_8__1"
    // InternalMyTurtleDsl.g:5522:1: rule__Parallele2__Group_8__1 : rule__Parallele2__Group_8__1__Impl rule__Parallele2__Group_8__2 ;
    public final void rule__Parallele2__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5526:1: ( rule__Parallele2__Group_8__1__Impl rule__Parallele2__Group_8__2 )
            // InternalMyTurtleDsl.g:5527:2: rule__Parallele2__Group_8__1__Impl rule__Parallele2__Group_8__2
            {
            pushFollow(FOLLOW_34);
            rule__Parallele2__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele2__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_8__1"


    // $ANTLR start "rule__Parallele2__Group_8__1__Impl"
    // InternalMyTurtleDsl.g:5534:1: rule__Parallele2__Group_8__1__Impl : ( '&' ) ;
    public final void rule__Parallele2__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5538:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:5539:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:5539:1: ( '&' )
            // InternalMyTurtleDsl.g:5540:2: '&'
            {
             before(grammarAccess.getParallele2Access().getAmpersandKeyword_8_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele2Access().getAmpersandKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_8__1__Impl"


    // $ANTLR start "rule__Parallele2__Group_8__2"
    // InternalMyTurtleDsl.g:5549:1: rule__Parallele2__Group_8__2 : rule__Parallele2__Group_8__2__Impl ;
    public final void rule__Parallele2__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5553:1: ( rule__Parallele2__Group_8__2__Impl )
            // InternalMyTurtleDsl.g:5554:2: rule__Parallele2__Group_8__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parallele2__Group_8__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_8__2"


    // $ANTLR start "rule__Parallele2__Group_8__2__Impl"
    // InternalMyTurtleDsl.g:5560:1: rule__Parallele2__Group_8__2__Impl : ( ( rule__Parallele2__AAssignment_8_2 ) ) ;
    public final void rule__Parallele2__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5564:1: ( ( ( rule__Parallele2__AAssignment_8_2 ) ) )
            // InternalMyTurtleDsl.g:5565:1: ( ( rule__Parallele2__AAssignment_8_2 ) )
            {
            // InternalMyTurtleDsl.g:5565:1: ( ( rule__Parallele2__AAssignment_8_2 ) )
            // InternalMyTurtleDsl.g:5566:2: ( rule__Parallele2__AAssignment_8_2 )
            {
             before(grammarAccess.getParallele2Access().getAAssignment_8_2()); 
            // InternalMyTurtleDsl.g:5567:2: ( rule__Parallele2__AAssignment_8_2 )
            // InternalMyTurtleDsl.g:5567:3: rule__Parallele2__AAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__Parallele2__AAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getParallele2Access().getAAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_8__2__Impl"


    // $ANTLR start "rule__Parallele2__Group_9__0"
    // InternalMyTurtleDsl.g:5576:1: rule__Parallele2__Group_9__0 : rule__Parallele2__Group_9__0__Impl rule__Parallele2__Group_9__1 ;
    public final void rule__Parallele2__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5580:1: ( rule__Parallele2__Group_9__0__Impl rule__Parallele2__Group_9__1 )
            // InternalMyTurtleDsl.g:5581:2: rule__Parallele2__Group_9__0__Impl rule__Parallele2__Group_9__1
            {
            pushFollow(FOLLOW_33);
            rule__Parallele2__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele2__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_9__0"


    // $ANTLR start "rule__Parallele2__Group_9__0__Impl"
    // InternalMyTurtleDsl.g:5588:1: rule__Parallele2__Group_9__0__Impl : ( ( rule__Parallele2__TAssignment_9_0 ) ) ;
    public final void rule__Parallele2__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5592:1: ( ( ( rule__Parallele2__TAssignment_9_0 ) ) )
            // InternalMyTurtleDsl.g:5593:1: ( ( rule__Parallele2__TAssignment_9_0 ) )
            {
            // InternalMyTurtleDsl.g:5593:1: ( ( rule__Parallele2__TAssignment_9_0 ) )
            // InternalMyTurtleDsl.g:5594:2: ( rule__Parallele2__TAssignment_9_0 )
            {
             before(grammarAccess.getParallele2Access().getTAssignment_9_0()); 
            // InternalMyTurtleDsl.g:5595:2: ( rule__Parallele2__TAssignment_9_0 )
            // InternalMyTurtleDsl.g:5595:3: rule__Parallele2__TAssignment_9_0
            {
            pushFollow(FOLLOW_2);
            rule__Parallele2__TAssignment_9_0();

            state._fsp--;


            }

             after(grammarAccess.getParallele2Access().getTAssignment_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_9__0__Impl"


    // $ANTLR start "rule__Parallele2__Group_9__1"
    // InternalMyTurtleDsl.g:5603:1: rule__Parallele2__Group_9__1 : rule__Parallele2__Group_9__1__Impl rule__Parallele2__Group_9__2 ;
    public final void rule__Parallele2__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5607:1: ( rule__Parallele2__Group_9__1__Impl rule__Parallele2__Group_9__2 )
            // InternalMyTurtleDsl.g:5608:2: rule__Parallele2__Group_9__1__Impl rule__Parallele2__Group_9__2
            {
            pushFollow(FOLLOW_37);
            rule__Parallele2__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele2__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_9__1"


    // $ANTLR start "rule__Parallele2__Group_9__1__Impl"
    // InternalMyTurtleDsl.g:5615:1: rule__Parallele2__Group_9__1__Impl : ( '&' ) ;
    public final void rule__Parallele2__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5619:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:5620:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:5620:1: ( '&' )
            // InternalMyTurtleDsl.g:5621:2: '&'
            {
             before(grammarAccess.getParallele2Access().getAmpersandKeyword_9_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele2Access().getAmpersandKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_9__1__Impl"


    // $ANTLR start "rule__Parallele2__Group_9__2"
    // InternalMyTurtleDsl.g:5630:1: rule__Parallele2__Group_9__2 : rule__Parallele2__Group_9__2__Impl ;
    public final void rule__Parallele2__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5634:1: ( rule__Parallele2__Group_9__2__Impl )
            // InternalMyTurtleDsl.g:5635:2: rule__Parallele2__Group_9__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parallele2__Group_9__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_9__2"


    // $ANTLR start "rule__Parallele2__Group_9__2__Impl"
    // InternalMyTurtleDsl.g:5641:1: rule__Parallele2__Group_9__2__Impl : ( ( rule__Parallele2__AAssignment_9_2 ) ) ;
    public final void rule__Parallele2__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5645:1: ( ( ( rule__Parallele2__AAssignment_9_2 ) ) )
            // InternalMyTurtleDsl.g:5646:1: ( ( rule__Parallele2__AAssignment_9_2 ) )
            {
            // InternalMyTurtleDsl.g:5646:1: ( ( rule__Parallele2__AAssignment_9_2 ) )
            // InternalMyTurtleDsl.g:5647:2: ( rule__Parallele2__AAssignment_9_2 )
            {
             before(grammarAccess.getParallele2Access().getAAssignment_9_2()); 
            // InternalMyTurtleDsl.g:5648:2: ( rule__Parallele2__AAssignment_9_2 )
            // InternalMyTurtleDsl.g:5648:3: rule__Parallele2__AAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__Parallele2__AAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getParallele2Access().getAAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_9__2__Impl"


    // $ANTLR start "rule__Parallele2__Group_10__0"
    // InternalMyTurtleDsl.g:5657:1: rule__Parallele2__Group_10__0 : rule__Parallele2__Group_10__0__Impl rule__Parallele2__Group_10__1 ;
    public final void rule__Parallele2__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5661:1: ( rule__Parallele2__Group_10__0__Impl rule__Parallele2__Group_10__1 )
            // InternalMyTurtleDsl.g:5662:2: rule__Parallele2__Group_10__0__Impl rule__Parallele2__Group_10__1
            {
            pushFollow(FOLLOW_33);
            rule__Parallele2__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele2__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_10__0"


    // $ANTLR start "rule__Parallele2__Group_10__0__Impl"
    // InternalMyTurtleDsl.g:5669:1: rule__Parallele2__Group_10__0__Impl : ( ( rule__Parallele2__TAssignment_10_0 ) ) ;
    public final void rule__Parallele2__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5673:1: ( ( ( rule__Parallele2__TAssignment_10_0 ) ) )
            // InternalMyTurtleDsl.g:5674:1: ( ( rule__Parallele2__TAssignment_10_0 ) )
            {
            // InternalMyTurtleDsl.g:5674:1: ( ( rule__Parallele2__TAssignment_10_0 ) )
            // InternalMyTurtleDsl.g:5675:2: ( rule__Parallele2__TAssignment_10_0 )
            {
             before(grammarAccess.getParallele2Access().getTAssignment_10_0()); 
            // InternalMyTurtleDsl.g:5676:2: ( rule__Parallele2__TAssignment_10_0 )
            // InternalMyTurtleDsl.g:5676:3: rule__Parallele2__TAssignment_10_0
            {
            pushFollow(FOLLOW_2);
            rule__Parallele2__TAssignment_10_0();

            state._fsp--;


            }

             after(grammarAccess.getParallele2Access().getTAssignment_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_10__0__Impl"


    // $ANTLR start "rule__Parallele2__Group_10__1"
    // InternalMyTurtleDsl.g:5684:1: rule__Parallele2__Group_10__1 : rule__Parallele2__Group_10__1__Impl rule__Parallele2__Group_10__2 ;
    public final void rule__Parallele2__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5688:1: ( rule__Parallele2__Group_10__1__Impl rule__Parallele2__Group_10__2 )
            // InternalMyTurtleDsl.g:5689:2: rule__Parallele2__Group_10__1__Impl rule__Parallele2__Group_10__2
            {
            pushFollow(FOLLOW_36);
            rule__Parallele2__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele2__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_10__1"


    // $ANTLR start "rule__Parallele2__Group_10__1__Impl"
    // InternalMyTurtleDsl.g:5696:1: rule__Parallele2__Group_10__1__Impl : ( '&' ) ;
    public final void rule__Parallele2__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5700:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:5701:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:5701:1: ( '&' )
            // InternalMyTurtleDsl.g:5702:2: '&'
            {
             before(grammarAccess.getParallele2Access().getAmpersandKeyword_10_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele2Access().getAmpersandKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_10__1__Impl"


    // $ANTLR start "rule__Parallele2__Group_10__2"
    // InternalMyTurtleDsl.g:5711:1: rule__Parallele2__Group_10__2 : rule__Parallele2__Group_10__2__Impl ;
    public final void rule__Parallele2__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5715:1: ( rule__Parallele2__Group_10__2__Impl )
            // InternalMyTurtleDsl.g:5716:2: rule__Parallele2__Group_10__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parallele2__Group_10__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_10__2"


    // $ANTLR start "rule__Parallele2__Group_10__2__Impl"
    // InternalMyTurtleDsl.g:5722:1: rule__Parallele2__Group_10__2__Impl : ( ( rule__Parallele2__AAssignment_10_2 ) ) ;
    public final void rule__Parallele2__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5726:1: ( ( ( rule__Parallele2__AAssignment_10_2 ) ) )
            // InternalMyTurtleDsl.g:5727:1: ( ( rule__Parallele2__AAssignment_10_2 ) )
            {
            // InternalMyTurtleDsl.g:5727:1: ( ( rule__Parallele2__AAssignment_10_2 ) )
            // InternalMyTurtleDsl.g:5728:2: ( rule__Parallele2__AAssignment_10_2 )
            {
             before(grammarAccess.getParallele2Access().getAAssignment_10_2()); 
            // InternalMyTurtleDsl.g:5729:2: ( rule__Parallele2__AAssignment_10_2 )
            // InternalMyTurtleDsl.g:5729:3: rule__Parallele2__AAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__Parallele2__AAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getParallele2Access().getAAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_10__2__Impl"


    // $ANTLR start "rule__Parallele2__Group_11__0"
    // InternalMyTurtleDsl.g:5738:1: rule__Parallele2__Group_11__0 : rule__Parallele2__Group_11__0__Impl rule__Parallele2__Group_11__1 ;
    public final void rule__Parallele2__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5742:1: ( rule__Parallele2__Group_11__0__Impl rule__Parallele2__Group_11__1 )
            // InternalMyTurtleDsl.g:5743:2: rule__Parallele2__Group_11__0__Impl rule__Parallele2__Group_11__1
            {
            pushFollow(FOLLOW_33);
            rule__Parallele2__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele2__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_11__0"


    // $ANTLR start "rule__Parallele2__Group_11__0__Impl"
    // InternalMyTurtleDsl.g:5750:1: rule__Parallele2__Group_11__0__Impl : ( ( rule__Parallele2__TAssignment_11_0 ) ) ;
    public final void rule__Parallele2__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5754:1: ( ( ( rule__Parallele2__TAssignment_11_0 ) ) )
            // InternalMyTurtleDsl.g:5755:1: ( ( rule__Parallele2__TAssignment_11_0 ) )
            {
            // InternalMyTurtleDsl.g:5755:1: ( ( rule__Parallele2__TAssignment_11_0 ) )
            // InternalMyTurtleDsl.g:5756:2: ( rule__Parallele2__TAssignment_11_0 )
            {
             before(grammarAccess.getParallele2Access().getTAssignment_11_0()); 
            // InternalMyTurtleDsl.g:5757:2: ( rule__Parallele2__TAssignment_11_0 )
            // InternalMyTurtleDsl.g:5757:3: rule__Parallele2__TAssignment_11_0
            {
            pushFollow(FOLLOW_2);
            rule__Parallele2__TAssignment_11_0();

            state._fsp--;


            }

             after(grammarAccess.getParallele2Access().getTAssignment_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_11__0__Impl"


    // $ANTLR start "rule__Parallele2__Group_11__1"
    // InternalMyTurtleDsl.g:5765:1: rule__Parallele2__Group_11__1 : rule__Parallele2__Group_11__1__Impl rule__Parallele2__Group_11__2 ;
    public final void rule__Parallele2__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5769:1: ( rule__Parallele2__Group_11__1__Impl rule__Parallele2__Group_11__2 )
            // InternalMyTurtleDsl.g:5770:2: rule__Parallele2__Group_11__1__Impl rule__Parallele2__Group_11__2
            {
            pushFollow(FOLLOW_34);
            rule__Parallele2__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele2__Group_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_11__1"


    // $ANTLR start "rule__Parallele2__Group_11__1__Impl"
    // InternalMyTurtleDsl.g:5777:1: rule__Parallele2__Group_11__1__Impl : ( '&' ) ;
    public final void rule__Parallele2__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5781:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:5782:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:5782:1: ( '&' )
            // InternalMyTurtleDsl.g:5783:2: '&'
            {
             before(grammarAccess.getParallele2Access().getAmpersandKeyword_11_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele2Access().getAmpersandKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_11__1__Impl"


    // $ANTLR start "rule__Parallele2__Group_11__2"
    // InternalMyTurtleDsl.g:5792:1: rule__Parallele2__Group_11__2 : rule__Parallele2__Group_11__2__Impl ;
    public final void rule__Parallele2__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5796:1: ( rule__Parallele2__Group_11__2__Impl )
            // InternalMyTurtleDsl.g:5797:2: rule__Parallele2__Group_11__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parallele2__Group_11__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_11__2"


    // $ANTLR start "rule__Parallele2__Group_11__2__Impl"
    // InternalMyTurtleDsl.g:5803:1: rule__Parallele2__Group_11__2__Impl : ( ( rule__Parallele2__AAssignment_11_2 ) ) ;
    public final void rule__Parallele2__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5807:1: ( ( ( rule__Parallele2__AAssignment_11_2 ) ) )
            // InternalMyTurtleDsl.g:5808:1: ( ( rule__Parallele2__AAssignment_11_2 ) )
            {
            // InternalMyTurtleDsl.g:5808:1: ( ( rule__Parallele2__AAssignment_11_2 ) )
            // InternalMyTurtleDsl.g:5809:2: ( rule__Parallele2__AAssignment_11_2 )
            {
             before(grammarAccess.getParallele2Access().getAAssignment_11_2()); 
            // InternalMyTurtleDsl.g:5810:2: ( rule__Parallele2__AAssignment_11_2 )
            // InternalMyTurtleDsl.g:5810:3: rule__Parallele2__AAssignment_11_2
            {
            pushFollow(FOLLOW_2);
            rule__Parallele2__AAssignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getParallele2Access().getAAssignment_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__Group_11__2__Impl"


    // $ANTLR start "rule__Parallele3__Group_0__0"
    // InternalMyTurtleDsl.g:5819:1: rule__Parallele3__Group_0__0 : rule__Parallele3__Group_0__0__Impl rule__Parallele3__Group_0__1 ;
    public final void rule__Parallele3__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5823:1: ( rule__Parallele3__Group_0__0__Impl rule__Parallele3__Group_0__1 )
            // InternalMyTurtleDsl.g:5824:2: rule__Parallele3__Group_0__0__Impl rule__Parallele3__Group_0__1
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_0__0"


    // $ANTLR start "rule__Parallele3__Group_0__0__Impl"
    // InternalMyTurtleDsl.g:5831:1: rule__Parallele3__Group_0__0__Impl : ( ( rule__Parallele3__AAssignment_0_0 ) ) ;
    public final void rule__Parallele3__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5835:1: ( ( ( rule__Parallele3__AAssignment_0_0 ) ) )
            // InternalMyTurtleDsl.g:5836:1: ( ( rule__Parallele3__AAssignment_0_0 ) )
            {
            // InternalMyTurtleDsl.g:5836:1: ( ( rule__Parallele3__AAssignment_0_0 ) )
            // InternalMyTurtleDsl.g:5837:2: ( rule__Parallele3__AAssignment_0_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_0_0()); 
            // InternalMyTurtleDsl.g:5838:2: ( rule__Parallele3__AAssignment_0_0 )
            // InternalMyTurtleDsl.g:5838:3: rule__Parallele3__AAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__AAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getAAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_0__0__Impl"


    // $ANTLR start "rule__Parallele3__Group_0__1"
    // InternalMyTurtleDsl.g:5846:1: rule__Parallele3__Group_0__1 : rule__Parallele3__Group_0__1__Impl rule__Parallele3__Group_0__2 ;
    public final void rule__Parallele3__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5850:1: ( rule__Parallele3__Group_0__1__Impl rule__Parallele3__Group_0__2 )
            // InternalMyTurtleDsl.g:5851:2: rule__Parallele3__Group_0__1__Impl rule__Parallele3__Group_0__2
            {
            pushFollow(FOLLOW_34);
            rule__Parallele3__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_0__1"


    // $ANTLR start "rule__Parallele3__Group_0__1__Impl"
    // InternalMyTurtleDsl.g:5858:1: rule__Parallele3__Group_0__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5862:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:5863:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:5863:1: ( '&' )
            // InternalMyTurtleDsl.g:5864:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_0_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_0__1__Impl"


    // $ANTLR start "rule__Parallele3__Group_0__2"
    // InternalMyTurtleDsl.g:5873:1: rule__Parallele3__Group_0__2 : rule__Parallele3__Group_0__2__Impl rule__Parallele3__Group_0__3 ;
    public final void rule__Parallele3__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5877:1: ( rule__Parallele3__Group_0__2__Impl rule__Parallele3__Group_0__3 )
            // InternalMyTurtleDsl.g:5878:2: rule__Parallele3__Group_0__2__Impl rule__Parallele3__Group_0__3
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_0__2"


    // $ANTLR start "rule__Parallele3__Group_0__2__Impl"
    // InternalMyTurtleDsl.g:5885:1: rule__Parallele3__Group_0__2__Impl : ( ( rule__Parallele3__BAssignment_0_2 ) ) ;
    public final void rule__Parallele3__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5889:1: ( ( ( rule__Parallele3__BAssignment_0_2 ) ) )
            // InternalMyTurtleDsl.g:5890:1: ( ( rule__Parallele3__BAssignment_0_2 ) )
            {
            // InternalMyTurtleDsl.g:5890:1: ( ( rule__Parallele3__BAssignment_0_2 ) )
            // InternalMyTurtleDsl.g:5891:2: ( rule__Parallele3__BAssignment_0_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_0_2()); 
            // InternalMyTurtleDsl.g:5892:2: ( rule__Parallele3__BAssignment_0_2 )
            // InternalMyTurtleDsl.g:5892:3: rule__Parallele3__BAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__BAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getBAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_0__2__Impl"


    // $ANTLR start "rule__Parallele3__Group_0__3"
    // InternalMyTurtleDsl.g:5900:1: rule__Parallele3__Group_0__3 : rule__Parallele3__Group_0__3__Impl rule__Parallele3__Group_0__4 ;
    public final void rule__Parallele3__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5904:1: ( rule__Parallele3__Group_0__3__Impl rule__Parallele3__Group_0__4 )
            // InternalMyTurtleDsl.g:5905:2: rule__Parallele3__Group_0__3__Impl rule__Parallele3__Group_0__4
            {
            pushFollow(FOLLOW_37);
            rule__Parallele3__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_0__3"


    // $ANTLR start "rule__Parallele3__Group_0__3__Impl"
    // InternalMyTurtleDsl.g:5912:1: rule__Parallele3__Group_0__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5916:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:5917:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:5917:1: ( '&' )
            // InternalMyTurtleDsl.g:5918:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_0_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_0__3__Impl"


    // $ANTLR start "rule__Parallele3__Group_0__4"
    // InternalMyTurtleDsl.g:5927:1: rule__Parallele3__Group_0__4 : rule__Parallele3__Group_0__4__Impl ;
    public final void rule__Parallele3__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5931:1: ( rule__Parallele3__Group_0__4__Impl )
            // InternalMyTurtleDsl.g:5932:2: rule__Parallele3__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_0__4"


    // $ANTLR start "rule__Parallele3__Group_0__4__Impl"
    // InternalMyTurtleDsl.g:5938:1: rule__Parallele3__Group_0__4__Impl : ( ( rule__Parallele3__CAssignment_0_4 ) ) ;
    public final void rule__Parallele3__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5942:1: ( ( ( rule__Parallele3__CAssignment_0_4 ) ) )
            // InternalMyTurtleDsl.g:5943:1: ( ( rule__Parallele3__CAssignment_0_4 ) )
            {
            // InternalMyTurtleDsl.g:5943:1: ( ( rule__Parallele3__CAssignment_0_4 ) )
            // InternalMyTurtleDsl.g:5944:2: ( rule__Parallele3__CAssignment_0_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_0_4()); 
            // InternalMyTurtleDsl.g:5945:2: ( rule__Parallele3__CAssignment_0_4 )
            // InternalMyTurtleDsl.g:5945:3: rule__Parallele3__CAssignment_0_4
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__CAssignment_0_4();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getCAssignment_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_0__4__Impl"


    // $ANTLR start "rule__Parallele3__Group_1__0"
    // InternalMyTurtleDsl.g:5954:1: rule__Parallele3__Group_1__0 : rule__Parallele3__Group_1__0__Impl rule__Parallele3__Group_1__1 ;
    public final void rule__Parallele3__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5958:1: ( rule__Parallele3__Group_1__0__Impl rule__Parallele3__Group_1__1 )
            // InternalMyTurtleDsl.g:5959:2: rule__Parallele3__Group_1__0__Impl rule__Parallele3__Group_1__1
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_1__0"


    // $ANTLR start "rule__Parallele3__Group_1__0__Impl"
    // InternalMyTurtleDsl.g:5966:1: rule__Parallele3__Group_1__0__Impl : ( ( rule__Parallele3__AAssignment_1_0 ) ) ;
    public final void rule__Parallele3__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5970:1: ( ( ( rule__Parallele3__AAssignment_1_0 ) ) )
            // InternalMyTurtleDsl.g:5971:1: ( ( rule__Parallele3__AAssignment_1_0 ) )
            {
            // InternalMyTurtleDsl.g:5971:1: ( ( rule__Parallele3__AAssignment_1_0 ) )
            // InternalMyTurtleDsl.g:5972:2: ( rule__Parallele3__AAssignment_1_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_1_0()); 
            // InternalMyTurtleDsl.g:5973:2: ( rule__Parallele3__AAssignment_1_0 )
            // InternalMyTurtleDsl.g:5973:3: rule__Parallele3__AAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__AAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getAAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_1__0__Impl"


    // $ANTLR start "rule__Parallele3__Group_1__1"
    // InternalMyTurtleDsl.g:5981:1: rule__Parallele3__Group_1__1 : rule__Parallele3__Group_1__1__Impl rule__Parallele3__Group_1__2 ;
    public final void rule__Parallele3__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5985:1: ( rule__Parallele3__Group_1__1__Impl rule__Parallele3__Group_1__2 )
            // InternalMyTurtleDsl.g:5986:2: rule__Parallele3__Group_1__1__Impl rule__Parallele3__Group_1__2
            {
            pushFollow(FOLLOW_34);
            rule__Parallele3__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_1__1"


    // $ANTLR start "rule__Parallele3__Group_1__1__Impl"
    // InternalMyTurtleDsl.g:5993:1: rule__Parallele3__Group_1__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5997:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:5998:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:5998:1: ( '&' )
            // InternalMyTurtleDsl.g:5999:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_1_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_1__1__Impl"


    // $ANTLR start "rule__Parallele3__Group_1__2"
    // InternalMyTurtleDsl.g:6008:1: rule__Parallele3__Group_1__2 : rule__Parallele3__Group_1__2__Impl rule__Parallele3__Group_1__3 ;
    public final void rule__Parallele3__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6012:1: ( rule__Parallele3__Group_1__2__Impl rule__Parallele3__Group_1__3 )
            // InternalMyTurtleDsl.g:6013:2: rule__Parallele3__Group_1__2__Impl rule__Parallele3__Group_1__3
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_1__2"


    // $ANTLR start "rule__Parallele3__Group_1__2__Impl"
    // InternalMyTurtleDsl.g:6020:1: rule__Parallele3__Group_1__2__Impl : ( ( rule__Parallele3__BAssignment_1_2 ) ) ;
    public final void rule__Parallele3__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6024:1: ( ( ( rule__Parallele3__BAssignment_1_2 ) ) )
            // InternalMyTurtleDsl.g:6025:1: ( ( rule__Parallele3__BAssignment_1_2 ) )
            {
            // InternalMyTurtleDsl.g:6025:1: ( ( rule__Parallele3__BAssignment_1_2 ) )
            // InternalMyTurtleDsl.g:6026:2: ( rule__Parallele3__BAssignment_1_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_1_2()); 
            // InternalMyTurtleDsl.g:6027:2: ( rule__Parallele3__BAssignment_1_2 )
            // InternalMyTurtleDsl.g:6027:3: rule__Parallele3__BAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__BAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getBAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_1__2__Impl"


    // $ANTLR start "rule__Parallele3__Group_1__3"
    // InternalMyTurtleDsl.g:6035:1: rule__Parallele3__Group_1__3 : rule__Parallele3__Group_1__3__Impl rule__Parallele3__Group_1__4 ;
    public final void rule__Parallele3__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6039:1: ( rule__Parallele3__Group_1__3__Impl rule__Parallele3__Group_1__4 )
            // InternalMyTurtleDsl.g:6040:2: rule__Parallele3__Group_1__3__Impl rule__Parallele3__Group_1__4
            {
            pushFollow(FOLLOW_36);
            rule__Parallele3__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_1__3"


    // $ANTLR start "rule__Parallele3__Group_1__3__Impl"
    // InternalMyTurtleDsl.g:6047:1: rule__Parallele3__Group_1__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6051:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:6052:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:6052:1: ( '&' )
            // InternalMyTurtleDsl.g:6053:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_1_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_1__3__Impl"


    // $ANTLR start "rule__Parallele3__Group_1__4"
    // InternalMyTurtleDsl.g:6062:1: rule__Parallele3__Group_1__4 : rule__Parallele3__Group_1__4__Impl ;
    public final void rule__Parallele3__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6066:1: ( rule__Parallele3__Group_1__4__Impl )
            // InternalMyTurtleDsl.g:6067:2: rule__Parallele3__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_1__4"


    // $ANTLR start "rule__Parallele3__Group_1__4__Impl"
    // InternalMyTurtleDsl.g:6073:1: rule__Parallele3__Group_1__4__Impl : ( ( rule__Parallele3__CAssignment_1_4 ) ) ;
    public final void rule__Parallele3__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6077:1: ( ( ( rule__Parallele3__CAssignment_1_4 ) ) )
            // InternalMyTurtleDsl.g:6078:1: ( ( rule__Parallele3__CAssignment_1_4 ) )
            {
            // InternalMyTurtleDsl.g:6078:1: ( ( rule__Parallele3__CAssignment_1_4 ) )
            // InternalMyTurtleDsl.g:6079:2: ( rule__Parallele3__CAssignment_1_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_1_4()); 
            // InternalMyTurtleDsl.g:6080:2: ( rule__Parallele3__CAssignment_1_4 )
            // InternalMyTurtleDsl.g:6080:3: rule__Parallele3__CAssignment_1_4
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__CAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getCAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_1__4__Impl"


    // $ANTLR start "rule__Parallele3__Group_2__0"
    // InternalMyTurtleDsl.g:6089:1: rule__Parallele3__Group_2__0 : rule__Parallele3__Group_2__0__Impl rule__Parallele3__Group_2__1 ;
    public final void rule__Parallele3__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6093:1: ( rule__Parallele3__Group_2__0__Impl rule__Parallele3__Group_2__1 )
            // InternalMyTurtleDsl.g:6094:2: rule__Parallele3__Group_2__0__Impl rule__Parallele3__Group_2__1
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_2__0"


    // $ANTLR start "rule__Parallele3__Group_2__0__Impl"
    // InternalMyTurtleDsl.g:6101:1: rule__Parallele3__Group_2__0__Impl : ( ( rule__Parallele3__AAssignment_2_0 ) ) ;
    public final void rule__Parallele3__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6105:1: ( ( ( rule__Parallele3__AAssignment_2_0 ) ) )
            // InternalMyTurtleDsl.g:6106:1: ( ( rule__Parallele3__AAssignment_2_0 ) )
            {
            // InternalMyTurtleDsl.g:6106:1: ( ( rule__Parallele3__AAssignment_2_0 ) )
            // InternalMyTurtleDsl.g:6107:2: ( rule__Parallele3__AAssignment_2_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_2_0()); 
            // InternalMyTurtleDsl.g:6108:2: ( rule__Parallele3__AAssignment_2_0 )
            // InternalMyTurtleDsl.g:6108:3: rule__Parallele3__AAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__AAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getAAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_2__0__Impl"


    // $ANTLR start "rule__Parallele3__Group_2__1"
    // InternalMyTurtleDsl.g:6116:1: rule__Parallele3__Group_2__1 : rule__Parallele3__Group_2__1__Impl rule__Parallele3__Group_2__2 ;
    public final void rule__Parallele3__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6120:1: ( rule__Parallele3__Group_2__1__Impl rule__Parallele3__Group_2__2 )
            // InternalMyTurtleDsl.g:6121:2: rule__Parallele3__Group_2__1__Impl rule__Parallele3__Group_2__2
            {
            pushFollow(FOLLOW_37);
            rule__Parallele3__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_2__1"


    // $ANTLR start "rule__Parallele3__Group_2__1__Impl"
    // InternalMyTurtleDsl.g:6128:1: rule__Parallele3__Group_2__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6132:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:6133:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:6133:1: ( '&' )
            // InternalMyTurtleDsl.g:6134:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_2_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_2__1__Impl"


    // $ANTLR start "rule__Parallele3__Group_2__2"
    // InternalMyTurtleDsl.g:6143:1: rule__Parallele3__Group_2__2 : rule__Parallele3__Group_2__2__Impl rule__Parallele3__Group_2__3 ;
    public final void rule__Parallele3__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6147:1: ( rule__Parallele3__Group_2__2__Impl rule__Parallele3__Group_2__3 )
            // InternalMyTurtleDsl.g:6148:2: rule__Parallele3__Group_2__2__Impl rule__Parallele3__Group_2__3
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_2__2"


    // $ANTLR start "rule__Parallele3__Group_2__2__Impl"
    // InternalMyTurtleDsl.g:6155:1: rule__Parallele3__Group_2__2__Impl : ( ( rule__Parallele3__BAssignment_2_2 ) ) ;
    public final void rule__Parallele3__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6159:1: ( ( ( rule__Parallele3__BAssignment_2_2 ) ) )
            // InternalMyTurtleDsl.g:6160:1: ( ( rule__Parallele3__BAssignment_2_2 ) )
            {
            // InternalMyTurtleDsl.g:6160:1: ( ( rule__Parallele3__BAssignment_2_2 ) )
            // InternalMyTurtleDsl.g:6161:2: ( rule__Parallele3__BAssignment_2_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_2_2()); 
            // InternalMyTurtleDsl.g:6162:2: ( rule__Parallele3__BAssignment_2_2 )
            // InternalMyTurtleDsl.g:6162:3: rule__Parallele3__BAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__BAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getBAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_2__2__Impl"


    // $ANTLR start "rule__Parallele3__Group_2__3"
    // InternalMyTurtleDsl.g:6170:1: rule__Parallele3__Group_2__3 : rule__Parallele3__Group_2__3__Impl rule__Parallele3__Group_2__4 ;
    public final void rule__Parallele3__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6174:1: ( rule__Parallele3__Group_2__3__Impl rule__Parallele3__Group_2__4 )
            // InternalMyTurtleDsl.g:6175:2: rule__Parallele3__Group_2__3__Impl rule__Parallele3__Group_2__4
            {
            pushFollow(FOLLOW_34);
            rule__Parallele3__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_2__3"


    // $ANTLR start "rule__Parallele3__Group_2__3__Impl"
    // InternalMyTurtleDsl.g:6182:1: rule__Parallele3__Group_2__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6186:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:6187:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:6187:1: ( '&' )
            // InternalMyTurtleDsl.g:6188:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_2_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_2__3__Impl"


    // $ANTLR start "rule__Parallele3__Group_2__4"
    // InternalMyTurtleDsl.g:6197:1: rule__Parallele3__Group_2__4 : rule__Parallele3__Group_2__4__Impl ;
    public final void rule__Parallele3__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6201:1: ( rule__Parallele3__Group_2__4__Impl )
            // InternalMyTurtleDsl.g:6202:2: rule__Parallele3__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_2__4"


    // $ANTLR start "rule__Parallele3__Group_2__4__Impl"
    // InternalMyTurtleDsl.g:6208:1: rule__Parallele3__Group_2__4__Impl : ( ( rule__Parallele3__CAssignment_2_4 ) ) ;
    public final void rule__Parallele3__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6212:1: ( ( ( rule__Parallele3__CAssignment_2_4 ) ) )
            // InternalMyTurtleDsl.g:6213:1: ( ( rule__Parallele3__CAssignment_2_4 ) )
            {
            // InternalMyTurtleDsl.g:6213:1: ( ( rule__Parallele3__CAssignment_2_4 ) )
            // InternalMyTurtleDsl.g:6214:2: ( rule__Parallele3__CAssignment_2_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_2_4()); 
            // InternalMyTurtleDsl.g:6215:2: ( rule__Parallele3__CAssignment_2_4 )
            // InternalMyTurtleDsl.g:6215:3: rule__Parallele3__CAssignment_2_4
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__CAssignment_2_4();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getCAssignment_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_2__4__Impl"


    // $ANTLR start "rule__Parallele3__Group_3__0"
    // InternalMyTurtleDsl.g:6224:1: rule__Parallele3__Group_3__0 : rule__Parallele3__Group_3__0__Impl rule__Parallele3__Group_3__1 ;
    public final void rule__Parallele3__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6228:1: ( rule__Parallele3__Group_3__0__Impl rule__Parallele3__Group_3__1 )
            // InternalMyTurtleDsl.g:6229:2: rule__Parallele3__Group_3__0__Impl rule__Parallele3__Group_3__1
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_3__0"


    // $ANTLR start "rule__Parallele3__Group_3__0__Impl"
    // InternalMyTurtleDsl.g:6236:1: rule__Parallele3__Group_3__0__Impl : ( ( rule__Parallele3__AAssignment_3_0 ) ) ;
    public final void rule__Parallele3__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6240:1: ( ( ( rule__Parallele3__AAssignment_3_0 ) ) )
            // InternalMyTurtleDsl.g:6241:1: ( ( rule__Parallele3__AAssignment_3_0 ) )
            {
            // InternalMyTurtleDsl.g:6241:1: ( ( rule__Parallele3__AAssignment_3_0 ) )
            // InternalMyTurtleDsl.g:6242:2: ( rule__Parallele3__AAssignment_3_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_3_0()); 
            // InternalMyTurtleDsl.g:6243:2: ( rule__Parallele3__AAssignment_3_0 )
            // InternalMyTurtleDsl.g:6243:3: rule__Parallele3__AAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__AAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getAAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_3__0__Impl"


    // $ANTLR start "rule__Parallele3__Group_3__1"
    // InternalMyTurtleDsl.g:6251:1: rule__Parallele3__Group_3__1 : rule__Parallele3__Group_3__1__Impl rule__Parallele3__Group_3__2 ;
    public final void rule__Parallele3__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6255:1: ( rule__Parallele3__Group_3__1__Impl rule__Parallele3__Group_3__2 )
            // InternalMyTurtleDsl.g:6256:2: rule__Parallele3__Group_3__1__Impl rule__Parallele3__Group_3__2
            {
            pushFollow(FOLLOW_37);
            rule__Parallele3__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_3__1"


    // $ANTLR start "rule__Parallele3__Group_3__1__Impl"
    // InternalMyTurtleDsl.g:6263:1: rule__Parallele3__Group_3__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6267:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:6268:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:6268:1: ( '&' )
            // InternalMyTurtleDsl.g:6269:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_3_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_3__1__Impl"


    // $ANTLR start "rule__Parallele3__Group_3__2"
    // InternalMyTurtleDsl.g:6278:1: rule__Parallele3__Group_3__2 : rule__Parallele3__Group_3__2__Impl rule__Parallele3__Group_3__3 ;
    public final void rule__Parallele3__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6282:1: ( rule__Parallele3__Group_3__2__Impl rule__Parallele3__Group_3__3 )
            // InternalMyTurtleDsl.g:6283:2: rule__Parallele3__Group_3__2__Impl rule__Parallele3__Group_3__3
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_3__2"


    // $ANTLR start "rule__Parallele3__Group_3__2__Impl"
    // InternalMyTurtleDsl.g:6290:1: rule__Parallele3__Group_3__2__Impl : ( ( rule__Parallele3__BAssignment_3_2 ) ) ;
    public final void rule__Parallele3__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6294:1: ( ( ( rule__Parallele3__BAssignment_3_2 ) ) )
            // InternalMyTurtleDsl.g:6295:1: ( ( rule__Parallele3__BAssignment_3_2 ) )
            {
            // InternalMyTurtleDsl.g:6295:1: ( ( rule__Parallele3__BAssignment_3_2 ) )
            // InternalMyTurtleDsl.g:6296:2: ( rule__Parallele3__BAssignment_3_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_3_2()); 
            // InternalMyTurtleDsl.g:6297:2: ( rule__Parallele3__BAssignment_3_2 )
            // InternalMyTurtleDsl.g:6297:3: rule__Parallele3__BAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__BAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getBAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_3__2__Impl"


    // $ANTLR start "rule__Parallele3__Group_3__3"
    // InternalMyTurtleDsl.g:6305:1: rule__Parallele3__Group_3__3 : rule__Parallele3__Group_3__3__Impl rule__Parallele3__Group_3__4 ;
    public final void rule__Parallele3__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6309:1: ( rule__Parallele3__Group_3__3__Impl rule__Parallele3__Group_3__4 )
            // InternalMyTurtleDsl.g:6310:2: rule__Parallele3__Group_3__3__Impl rule__Parallele3__Group_3__4
            {
            pushFollow(FOLLOW_36);
            rule__Parallele3__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_3__3"


    // $ANTLR start "rule__Parallele3__Group_3__3__Impl"
    // InternalMyTurtleDsl.g:6317:1: rule__Parallele3__Group_3__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6321:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:6322:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:6322:1: ( '&' )
            // InternalMyTurtleDsl.g:6323:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_3_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_3__3__Impl"


    // $ANTLR start "rule__Parallele3__Group_3__4"
    // InternalMyTurtleDsl.g:6332:1: rule__Parallele3__Group_3__4 : rule__Parallele3__Group_3__4__Impl ;
    public final void rule__Parallele3__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6336:1: ( rule__Parallele3__Group_3__4__Impl )
            // InternalMyTurtleDsl.g:6337:2: rule__Parallele3__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_3__4"


    // $ANTLR start "rule__Parallele3__Group_3__4__Impl"
    // InternalMyTurtleDsl.g:6343:1: rule__Parallele3__Group_3__4__Impl : ( ( rule__Parallele3__CAssignment_3_4 ) ) ;
    public final void rule__Parallele3__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6347:1: ( ( ( rule__Parallele3__CAssignment_3_4 ) ) )
            // InternalMyTurtleDsl.g:6348:1: ( ( rule__Parallele3__CAssignment_3_4 ) )
            {
            // InternalMyTurtleDsl.g:6348:1: ( ( rule__Parallele3__CAssignment_3_4 ) )
            // InternalMyTurtleDsl.g:6349:2: ( rule__Parallele3__CAssignment_3_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_3_4()); 
            // InternalMyTurtleDsl.g:6350:2: ( rule__Parallele3__CAssignment_3_4 )
            // InternalMyTurtleDsl.g:6350:3: rule__Parallele3__CAssignment_3_4
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__CAssignment_3_4();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getCAssignment_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_3__4__Impl"


    // $ANTLR start "rule__Parallele3__Group_4__0"
    // InternalMyTurtleDsl.g:6359:1: rule__Parallele3__Group_4__0 : rule__Parallele3__Group_4__0__Impl rule__Parallele3__Group_4__1 ;
    public final void rule__Parallele3__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6363:1: ( rule__Parallele3__Group_4__0__Impl rule__Parallele3__Group_4__1 )
            // InternalMyTurtleDsl.g:6364:2: rule__Parallele3__Group_4__0__Impl rule__Parallele3__Group_4__1
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_4__0"


    // $ANTLR start "rule__Parallele3__Group_4__0__Impl"
    // InternalMyTurtleDsl.g:6371:1: rule__Parallele3__Group_4__0__Impl : ( ( rule__Parallele3__AAssignment_4_0 ) ) ;
    public final void rule__Parallele3__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6375:1: ( ( ( rule__Parallele3__AAssignment_4_0 ) ) )
            // InternalMyTurtleDsl.g:6376:1: ( ( rule__Parallele3__AAssignment_4_0 ) )
            {
            // InternalMyTurtleDsl.g:6376:1: ( ( rule__Parallele3__AAssignment_4_0 ) )
            // InternalMyTurtleDsl.g:6377:2: ( rule__Parallele3__AAssignment_4_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_4_0()); 
            // InternalMyTurtleDsl.g:6378:2: ( rule__Parallele3__AAssignment_4_0 )
            // InternalMyTurtleDsl.g:6378:3: rule__Parallele3__AAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__AAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getAAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_4__0__Impl"


    // $ANTLR start "rule__Parallele3__Group_4__1"
    // InternalMyTurtleDsl.g:6386:1: rule__Parallele3__Group_4__1 : rule__Parallele3__Group_4__1__Impl rule__Parallele3__Group_4__2 ;
    public final void rule__Parallele3__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6390:1: ( rule__Parallele3__Group_4__1__Impl rule__Parallele3__Group_4__2 )
            // InternalMyTurtleDsl.g:6391:2: rule__Parallele3__Group_4__1__Impl rule__Parallele3__Group_4__2
            {
            pushFollow(FOLLOW_36);
            rule__Parallele3__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_4__1"


    // $ANTLR start "rule__Parallele3__Group_4__1__Impl"
    // InternalMyTurtleDsl.g:6398:1: rule__Parallele3__Group_4__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6402:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:6403:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:6403:1: ( '&' )
            // InternalMyTurtleDsl.g:6404:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_4_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_4__1__Impl"


    // $ANTLR start "rule__Parallele3__Group_4__2"
    // InternalMyTurtleDsl.g:6413:1: rule__Parallele3__Group_4__2 : rule__Parallele3__Group_4__2__Impl rule__Parallele3__Group_4__3 ;
    public final void rule__Parallele3__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6417:1: ( rule__Parallele3__Group_4__2__Impl rule__Parallele3__Group_4__3 )
            // InternalMyTurtleDsl.g:6418:2: rule__Parallele3__Group_4__2__Impl rule__Parallele3__Group_4__3
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_4__2"


    // $ANTLR start "rule__Parallele3__Group_4__2__Impl"
    // InternalMyTurtleDsl.g:6425:1: rule__Parallele3__Group_4__2__Impl : ( ( rule__Parallele3__BAssignment_4_2 ) ) ;
    public final void rule__Parallele3__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6429:1: ( ( ( rule__Parallele3__BAssignment_4_2 ) ) )
            // InternalMyTurtleDsl.g:6430:1: ( ( rule__Parallele3__BAssignment_4_2 ) )
            {
            // InternalMyTurtleDsl.g:6430:1: ( ( rule__Parallele3__BAssignment_4_2 ) )
            // InternalMyTurtleDsl.g:6431:2: ( rule__Parallele3__BAssignment_4_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_4_2()); 
            // InternalMyTurtleDsl.g:6432:2: ( rule__Parallele3__BAssignment_4_2 )
            // InternalMyTurtleDsl.g:6432:3: rule__Parallele3__BAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__BAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getBAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_4__2__Impl"


    // $ANTLR start "rule__Parallele3__Group_4__3"
    // InternalMyTurtleDsl.g:6440:1: rule__Parallele3__Group_4__3 : rule__Parallele3__Group_4__3__Impl rule__Parallele3__Group_4__4 ;
    public final void rule__Parallele3__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6444:1: ( rule__Parallele3__Group_4__3__Impl rule__Parallele3__Group_4__4 )
            // InternalMyTurtleDsl.g:6445:2: rule__Parallele3__Group_4__3__Impl rule__Parallele3__Group_4__4
            {
            pushFollow(FOLLOW_37);
            rule__Parallele3__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_4__3"


    // $ANTLR start "rule__Parallele3__Group_4__3__Impl"
    // InternalMyTurtleDsl.g:6452:1: rule__Parallele3__Group_4__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6456:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:6457:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:6457:1: ( '&' )
            // InternalMyTurtleDsl.g:6458:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_4_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_4__3__Impl"


    // $ANTLR start "rule__Parallele3__Group_4__4"
    // InternalMyTurtleDsl.g:6467:1: rule__Parallele3__Group_4__4 : rule__Parallele3__Group_4__4__Impl ;
    public final void rule__Parallele3__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6471:1: ( rule__Parallele3__Group_4__4__Impl )
            // InternalMyTurtleDsl.g:6472:2: rule__Parallele3__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_4__4"


    // $ANTLR start "rule__Parallele3__Group_4__4__Impl"
    // InternalMyTurtleDsl.g:6478:1: rule__Parallele3__Group_4__4__Impl : ( ( rule__Parallele3__CAssignment_4_4 ) ) ;
    public final void rule__Parallele3__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6482:1: ( ( ( rule__Parallele3__CAssignment_4_4 ) ) )
            // InternalMyTurtleDsl.g:6483:1: ( ( rule__Parallele3__CAssignment_4_4 ) )
            {
            // InternalMyTurtleDsl.g:6483:1: ( ( rule__Parallele3__CAssignment_4_4 ) )
            // InternalMyTurtleDsl.g:6484:2: ( rule__Parallele3__CAssignment_4_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_4_4()); 
            // InternalMyTurtleDsl.g:6485:2: ( rule__Parallele3__CAssignment_4_4 )
            // InternalMyTurtleDsl.g:6485:3: rule__Parallele3__CAssignment_4_4
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__CAssignment_4_4();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getCAssignment_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_4__4__Impl"


    // $ANTLR start "rule__Parallele3__Group_5__0"
    // InternalMyTurtleDsl.g:6494:1: rule__Parallele3__Group_5__0 : rule__Parallele3__Group_5__0__Impl rule__Parallele3__Group_5__1 ;
    public final void rule__Parallele3__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6498:1: ( rule__Parallele3__Group_5__0__Impl rule__Parallele3__Group_5__1 )
            // InternalMyTurtleDsl.g:6499:2: rule__Parallele3__Group_5__0__Impl rule__Parallele3__Group_5__1
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_5__0"


    // $ANTLR start "rule__Parallele3__Group_5__0__Impl"
    // InternalMyTurtleDsl.g:6506:1: rule__Parallele3__Group_5__0__Impl : ( ( rule__Parallele3__AAssignment_5_0 ) ) ;
    public final void rule__Parallele3__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6510:1: ( ( ( rule__Parallele3__AAssignment_5_0 ) ) )
            // InternalMyTurtleDsl.g:6511:1: ( ( rule__Parallele3__AAssignment_5_0 ) )
            {
            // InternalMyTurtleDsl.g:6511:1: ( ( rule__Parallele3__AAssignment_5_0 ) )
            // InternalMyTurtleDsl.g:6512:2: ( rule__Parallele3__AAssignment_5_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_5_0()); 
            // InternalMyTurtleDsl.g:6513:2: ( rule__Parallele3__AAssignment_5_0 )
            // InternalMyTurtleDsl.g:6513:3: rule__Parallele3__AAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__AAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getAAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_5__0__Impl"


    // $ANTLR start "rule__Parallele3__Group_5__1"
    // InternalMyTurtleDsl.g:6521:1: rule__Parallele3__Group_5__1 : rule__Parallele3__Group_5__1__Impl rule__Parallele3__Group_5__2 ;
    public final void rule__Parallele3__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6525:1: ( rule__Parallele3__Group_5__1__Impl rule__Parallele3__Group_5__2 )
            // InternalMyTurtleDsl.g:6526:2: rule__Parallele3__Group_5__1__Impl rule__Parallele3__Group_5__2
            {
            pushFollow(FOLLOW_36);
            rule__Parallele3__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_5__1"


    // $ANTLR start "rule__Parallele3__Group_5__1__Impl"
    // InternalMyTurtleDsl.g:6533:1: rule__Parallele3__Group_5__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6537:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:6538:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:6538:1: ( '&' )
            // InternalMyTurtleDsl.g:6539:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_5_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_5__1__Impl"


    // $ANTLR start "rule__Parallele3__Group_5__2"
    // InternalMyTurtleDsl.g:6548:1: rule__Parallele3__Group_5__2 : rule__Parallele3__Group_5__2__Impl rule__Parallele3__Group_5__3 ;
    public final void rule__Parallele3__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6552:1: ( rule__Parallele3__Group_5__2__Impl rule__Parallele3__Group_5__3 )
            // InternalMyTurtleDsl.g:6553:2: rule__Parallele3__Group_5__2__Impl rule__Parallele3__Group_5__3
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_5__2"


    // $ANTLR start "rule__Parallele3__Group_5__2__Impl"
    // InternalMyTurtleDsl.g:6560:1: rule__Parallele3__Group_5__2__Impl : ( ( rule__Parallele3__BAssignment_5_2 ) ) ;
    public final void rule__Parallele3__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6564:1: ( ( ( rule__Parallele3__BAssignment_5_2 ) ) )
            // InternalMyTurtleDsl.g:6565:1: ( ( rule__Parallele3__BAssignment_5_2 ) )
            {
            // InternalMyTurtleDsl.g:6565:1: ( ( rule__Parallele3__BAssignment_5_2 ) )
            // InternalMyTurtleDsl.g:6566:2: ( rule__Parallele3__BAssignment_5_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_5_2()); 
            // InternalMyTurtleDsl.g:6567:2: ( rule__Parallele3__BAssignment_5_2 )
            // InternalMyTurtleDsl.g:6567:3: rule__Parallele3__BAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__BAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getBAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_5__2__Impl"


    // $ANTLR start "rule__Parallele3__Group_5__3"
    // InternalMyTurtleDsl.g:6575:1: rule__Parallele3__Group_5__3 : rule__Parallele3__Group_5__3__Impl rule__Parallele3__Group_5__4 ;
    public final void rule__Parallele3__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6579:1: ( rule__Parallele3__Group_5__3__Impl rule__Parallele3__Group_5__4 )
            // InternalMyTurtleDsl.g:6580:2: rule__Parallele3__Group_5__3__Impl rule__Parallele3__Group_5__4
            {
            pushFollow(FOLLOW_34);
            rule__Parallele3__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_5__3"


    // $ANTLR start "rule__Parallele3__Group_5__3__Impl"
    // InternalMyTurtleDsl.g:6587:1: rule__Parallele3__Group_5__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6591:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:6592:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:6592:1: ( '&' )
            // InternalMyTurtleDsl.g:6593:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_5_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_5__3__Impl"


    // $ANTLR start "rule__Parallele3__Group_5__4"
    // InternalMyTurtleDsl.g:6602:1: rule__Parallele3__Group_5__4 : rule__Parallele3__Group_5__4__Impl ;
    public final void rule__Parallele3__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6606:1: ( rule__Parallele3__Group_5__4__Impl )
            // InternalMyTurtleDsl.g:6607:2: rule__Parallele3__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_5__4"


    // $ANTLR start "rule__Parallele3__Group_5__4__Impl"
    // InternalMyTurtleDsl.g:6613:1: rule__Parallele3__Group_5__4__Impl : ( ( rule__Parallele3__CAssignment_5_4 ) ) ;
    public final void rule__Parallele3__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6617:1: ( ( ( rule__Parallele3__CAssignment_5_4 ) ) )
            // InternalMyTurtleDsl.g:6618:1: ( ( rule__Parallele3__CAssignment_5_4 ) )
            {
            // InternalMyTurtleDsl.g:6618:1: ( ( rule__Parallele3__CAssignment_5_4 ) )
            // InternalMyTurtleDsl.g:6619:2: ( rule__Parallele3__CAssignment_5_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_5_4()); 
            // InternalMyTurtleDsl.g:6620:2: ( rule__Parallele3__CAssignment_5_4 )
            // InternalMyTurtleDsl.g:6620:3: rule__Parallele3__CAssignment_5_4
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__CAssignment_5_4();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getCAssignment_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_5__4__Impl"


    // $ANTLR start "rule__Parallele3__Group_6__0"
    // InternalMyTurtleDsl.g:6629:1: rule__Parallele3__Group_6__0 : rule__Parallele3__Group_6__0__Impl rule__Parallele3__Group_6__1 ;
    public final void rule__Parallele3__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6633:1: ( rule__Parallele3__Group_6__0__Impl rule__Parallele3__Group_6__1 )
            // InternalMyTurtleDsl.g:6634:2: rule__Parallele3__Group_6__0__Impl rule__Parallele3__Group_6__1
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_6__0"


    // $ANTLR start "rule__Parallele3__Group_6__0__Impl"
    // InternalMyTurtleDsl.g:6641:1: rule__Parallele3__Group_6__0__Impl : ( ( rule__Parallele3__AAssignment_6_0 ) ) ;
    public final void rule__Parallele3__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6645:1: ( ( ( rule__Parallele3__AAssignment_6_0 ) ) )
            // InternalMyTurtleDsl.g:6646:1: ( ( rule__Parallele3__AAssignment_6_0 ) )
            {
            // InternalMyTurtleDsl.g:6646:1: ( ( rule__Parallele3__AAssignment_6_0 ) )
            // InternalMyTurtleDsl.g:6647:2: ( rule__Parallele3__AAssignment_6_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_6_0()); 
            // InternalMyTurtleDsl.g:6648:2: ( rule__Parallele3__AAssignment_6_0 )
            // InternalMyTurtleDsl.g:6648:3: rule__Parallele3__AAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__AAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getAAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_6__0__Impl"


    // $ANTLR start "rule__Parallele3__Group_6__1"
    // InternalMyTurtleDsl.g:6656:1: rule__Parallele3__Group_6__1 : rule__Parallele3__Group_6__1__Impl rule__Parallele3__Group_6__2 ;
    public final void rule__Parallele3__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6660:1: ( rule__Parallele3__Group_6__1__Impl rule__Parallele3__Group_6__2 )
            // InternalMyTurtleDsl.g:6661:2: rule__Parallele3__Group_6__1__Impl rule__Parallele3__Group_6__2
            {
            pushFollow(FOLLOW_35);
            rule__Parallele3__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_6__1"


    // $ANTLR start "rule__Parallele3__Group_6__1__Impl"
    // InternalMyTurtleDsl.g:6668:1: rule__Parallele3__Group_6__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6672:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:6673:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:6673:1: ( '&' )
            // InternalMyTurtleDsl.g:6674:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_6_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_6__1__Impl"


    // $ANTLR start "rule__Parallele3__Group_6__2"
    // InternalMyTurtleDsl.g:6683:1: rule__Parallele3__Group_6__2 : rule__Parallele3__Group_6__2__Impl rule__Parallele3__Group_6__3 ;
    public final void rule__Parallele3__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6687:1: ( rule__Parallele3__Group_6__2__Impl rule__Parallele3__Group_6__3 )
            // InternalMyTurtleDsl.g:6688:2: rule__Parallele3__Group_6__2__Impl rule__Parallele3__Group_6__3
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_6__2"


    // $ANTLR start "rule__Parallele3__Group_6__2__Impl"
    // InternalMyTurtleDsl.g:6695:1: rule__Parallele3__Group_6__2__Impl : ( ( rule__Parallele3__BAssignment_6_2 ) ) ;
    public final void rule__Parallele3__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6699:1: ( ( ( rule__Parallele3__BAssignment_6_2 ) ) )
            // InternalMyTurtleDsl.g:6700:1: ( ( rule__Parallele3__BAssignment_6_2 ) )
            {
            // InternalMyTurtleDsl.g:6700:1: ( ( rule__Parallele3__BAssignment_6_2 ) )
            // InternalMyTurtleDsl.g:6701:2: ( rule__Parallele3__BAssignment_6_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_6_2()); 
            // InternalMyTurtleDsl.g:6702:2: ( rule__Parallele3__BAssignment_6_2 )
            // InternalMyTurtleDsl.g:6702:3: rule__Parallele3__BAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__BAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getBAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_6__2__Impl"


    // $ANTLR start "rule__Parallele3__Group_6__3"
    // InternalMyTurtleDsl.g:6710:1: rule__Parallele3__Group_6__3 : rule__Parallele3__Group_6__3__Impl rule__Parallele3__Group_6__4 ;
    public final void rule__Parallele3__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6714:1: ( rule__Parallele3__Group_6__3__Impl rule__Parallele3__Group_6__4 )
            // InternalMyTurtleDsl.g:6715:2: rule__Parallele3__Group_6__3__Impl rule__Parallele3__Group_6__4
            {
            pushFollow(FOLLOW_37);
            rule__Parallele3__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_6__3"


    // $ANTLR start "rule__Parallele3__Group_6__3__Impl"
    // InternalMyTurtleDsl.g:6722:1: rule__Parallele3__Group_6__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6726:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:6727:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:6727:1: ( '&' )
            // InternalMyTurtleDsl.g:6728:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_6_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_6__3__Impl"


    // $ANTLR start "rule__Parallele3__Group_6__4"
    // InternalMyTurtleDsl.g:6737:1: rule__Parallele3__Group_6__4 : rule__Parallele3__Group_6__4__Impl ;
    public final void rule__Parallele3__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6741:1: ( rule__Parallele3__Group_6__4__Impl )
            // InternalMyTurtleDsl.g:6742:2: rule__Parallele3__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_6__4"


    // $ANTLR start "rule__Parallele3__Group_6__4__Impl"
    // InternalMyTurtleDsl.g:6748:1: rule__Parallele3__Group_6__4__Impl : ( ( rule__Parallele3__CAssignment_6_4 ) ) ;
    public final void rule__Parallele3__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6752:1: ( ( ( rule__Parallele3__CAssignment_6_4 ) ) )
            // InternalMyTurtleDsl.g:6753:1: ( ( rule__Parallele3__CAssignment_6_4 ) )
            {
            // InternalMyTurtleDsl.g:6753:1: ( ( rule__Parallele3__CAssignment_6_4 ) )
            // InternalMyTurtleDsl.g:6754:2: ( rule__Parallele3__CAssignment_6_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_6_4()); 
            // InternalMyTurtleDsl.g:6755:2: ( rule__Parallele3__CAssignment_6_4 )
            // InternalMyTurtleDsl.g:6755:3: rule__Parallele3__CAssignment_6_4
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__CAssignment_6_4();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getCAssignment_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_6__4__Impl"


    // $ANTLR start "rule__Parallele3__Group_7__0"
    // InternalMyTurtleDsl.g:6764:1: rule__Parallele3__Group_7__0 : rule__Parallele3__Group_7__0__Impl rule__Parallele3__Group_7__1 ;
    public final void rule__Parallele3__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6768:1: ( rule__Parallele3__Group_7__0__Impl rule__Parallele3__Group_7__1 )
            // InternalMyTurtleDsl.g:6769:2: rule__Parallele3__Group_7__0__Impl rule__Parallele3__Group_7__1
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_7__0"


    // $ANTLR start "rule__Parallele3__Group_7__0__Impl"
    // InternalMyTurtleDsl.g:6776:1: rule__Parallele3__Group_7__0__Impl : ( ( rule__Parallele3__AAssignment_7_0 ) ) ;
    public final void rule__Parallele3__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6780:1: ( ( ( rule__Parallele3__AAssignment_7_0 ) ) )
            // InternalMyTurtleDsl.g:6781:1: ( ( rule__Parallele3__AAssignment_7_0 ) )
            {
            // InternalMyTurtleDsl.g:6781:1: ( ( rule__Parallele3__AAssignment_7_0 ) )
            // InternalMyTurtleDsl.g:6782:2: ( rule__Parallele3__AAssignment_7_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_7_0()); 
            // InternalMyTurtleDsl.g:6783:2: ( rule__Parallele3__AAssignment_7_0 )
            // InternalMyTurtleDsl.g:6783:3: rule__Parallele3__AAssignment_7_0
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__AAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getAAssignment_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_7__0__Impl"


    // $ANTLR start "rule__Parallele3__Group_7__1"
    // InternalMyTurtleDsl.g:6791:1: rule__Parallele3__Group_7__1 : rule__Parallele3__Group_7__1__Impl rule__Parallele3__Group_7__2 ;
    public final void rule__Parallele3__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6795:1: ( rule__Parallele3__Group_7__1__Impl rule__Parallele3__Group_7__2 )
            // InternalMyTurtleDsl.g:6796:2: rule__Parallele3__Group_7__1__Impl rule__Parallele3__Group_7__2
            {
            pushFollow(FOLLOW_35);
            rule__Parallele3__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_7__1"


    // $ANTLR start "rule__Parallele3__Group_7__1__Impl"
    // InternalMyTurtleDsl.g:6803:1: rule__Parallele3__Group_7__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6807:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:6808:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:6808:1: ( '&' )
            // InternalMyTurtleDsl.g:6809:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_7_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_7__1__Impl"


    // $ANTLR start "rule__Parallele3__Group_7__2"
    // InternalMyTurtleDsl.g:6818:1: rule__Parallele3__Group_7__2 : rule__Parallele3__Group_7__2__Impl rule__Parallele3__Group_7__3 ;
    public final void rule__Parallele3__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6822:1: ( rule__Parallele3__Group_7__2__Impl rule__Parallele3__Group_7__3 )
            // InternalMyTurtleDsl.g:6823:2: rule__Parallele3__Group_7__2__Impl rule__Parallele3__Group_7__3
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_7__2"


    // $ANTLR start "rule__Parallele3__Group_7__2__Impl"
    // InternalMyTurtleDsl.g:6830:1: rule__Parallele3__Group_7__2__Impl : ( ( rule__Parallele3__BAssignment_7_2 ) ) ;
    public final void rule__Parallele3__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6834:1: ( ( ( rule__Parallele3__BAssignment_7_2 ) ) )
            // InternalMyTurtleDsl.g:6835:1: ( ( rule__Parallele3__BAssignment_7_2 ) )
            {
            // InternalMyTurtleDsl.g:6835:1: ( ( rule__Parallele3__BAssignment_7_2 ) )
            // InternalMyTurtleDsl.g:6836:2: ( rule__Parallele3__BAssignment_7_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_7_2()); 
            // InternalMyTurtleDsl.g:6837:2: ( rule__Parallele3__BAssignment_7_2 )
            // InternalMyTurtleDsl.g:6837:3: rule__Parallele3__BAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__BAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getBAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_7__2__Impl"


    // $ANTLR start "rule__Parallele3__Group_7__3"
    // InternalMyTurtleDsl.g:6845:1: rule__Parallele3__Group_7__3 : rule__Parallele3__Group_7__3__Impl rule__Parallele3__Group_7__4 ;
    public final void rule__Parallele3__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6849:1: ( rule__Parallele3__Group_7__3__Impl rule__Parallele3__Group_7__4 )
            // InternalMyTurtleDsl.g:6850:2: rule__Parallele3__Group_7__3__Impl rule__Parallele3__Group_7__4
            {
            pushFollow(FOLLOW_36);
            rule__Parallele3__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_7__3"


    // $ANTLR start "rule__Parallele3__Group_7__3__Impl"
    // InternalMyTurtleDsl.g:6857:1: rule__Parallele3__Group_7__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6861:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:6862:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:6862:1: ( '&' )
            // InternalMyTurtleDsl.g:6863:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_7_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_7__3__Impl"


    // $ANTLR start "rule__Parallele3__Group_7__4"
    // InternalMyTurtleDsl.g:6872:1: rule__Parallele3__Group_7__4 : rule__Parallele3__Group_7__4__Impl ;
    public final void rule__Parallele3__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6876:1: ( rule__Parallele3__Group_7__4__Impl )
            // InternalMyTurtleDsl.g:6877:2: rule__Parallele3__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_7__4"


    // $ANTLR start "rule__Parallele3__Group_7__4__Impl"
    // InternalMyTurtleDsl.g:6883:1: rule__Parallele3__Group_7__4__Impl : ( ( rule__Parallele3__CAssignment_7_4 ) ) ;
    public final void rule__Parallele3__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6887:1: ( ( ( rule__Parallele3__CAssignment_7_4 ) ) )
            // InternalMyTurtleDsl.g:6888:1: ( ( rule__Parallele3__CAssignment_7_4 ) )
            {
            // InternalMyTurtleDsl.g:6888:1: ( ( rule__Parallele3__CAssignment_7_4 ) )
            // InternalMyTurtleDsl.g:6889:2: ( rule__Parallele3__CAssignment_7_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_7_4()); 
            // InternalMyTurtleDsl.g:6890:2: ( rule__Parallele3__CAssignment_7_4 )
            // InternalMyTurtleDsl.g:6890:3: rule__Parallele3__CAssignment_7_4
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__CAssignment_7_4();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getCAssignment_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_7__4__Impl"


    // $ANTLR start "rule__Parallele3__Group_8__0"
    // InternalMyTurtleDsl.g:6899:1: rule__Parallele3__Group_8__0 : rule__Parallele3__Group_8__0__Impl rule__Parallele3__Group_8__1 ;
    public final void rule__Parallele3__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6903:1: ( rule__Parallele3__Group_8__0__Impl rule__Parallele3__Group_8__1 )
            // InternalMyTurtleDsl.g:6904:2: rule__Parallele3__Group_8__0__Impl rule__Parallele3__Group_8__1
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_8__0"


    // $ANTLR start "rule__Parallele3__Group_8__0__Impl"
    // InternalMyTurtleDsl.g:6911:1: rule__Parallele3__Group_8__0__Impl : ( ( rule__Parallele3__AAssignment_8_0 ) ) ;
    public final void rule__Parallele3__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6915:1: ( ( ( rule__Parallele3__AAssignment_8_0 ) ) )
            // InternalMyTurtleDsl.g:6916:1: ( ( rule__Parallele3__AAssignment_8_0 ) )
            {
            // InternalMyTurtleDsl.g:6916:1: ( ( rule__Parallele3__AAssignment_8_0 ) )
            // InternalMyTurtleDsl.g:6917:2: ( rule__Parallele3__AAssignment_8_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_8_0()); 
            // InternalMyTurtleDsl.g:6918:2: ( rule__Parallele3__AAssignment_8_0 )
            // InternalMyTurtleDsl.g:6918:3: rule__Parallele3__AAssignment_8_0
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__AAssignment_8_0();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getAAssignment_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_8__0__Impl"


    // $ANTLR start "rule__Parallele3__Group_8__1"
    // InternalMyTurtleDsl.g:6926:1: rule__Parallele3__Group_8__1 : rule__Parallele3__Group_8__1__Impl rule__Parallele3__Group_8__2 ;
    public final void rule__Parallele3__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6930:1: ( rule__Parallele3__Group_8__1__Impl rule__Parallele3__Group_8__2 )
            // InternalMyTurtleDsl.g:6931:2: rule__Parallele3__Group_8__1__Impl rule__Parallele3__Group_8__2
            {
            pushFollow(FOLLOW_37);
            rule__Parallele3__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_8__1"


    // $ANTLR start "rule__Parallele3__Group_8__1__Impl"
    // InternalMyTurtleDsl.g:6938:1: rule__Parallele3__Group_8__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6942:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:6943:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:6943:1: ( '&' )
            // InternalMyTurtleDsl.g:6944:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_8_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_8__1__Impl"


    // $ANTLR start "rule__Parallele3__Group_8__2"
    // InternalMyTurtleDsl.g:6953:1: rule__Parallele3__Group_8__2 : rule__Parallele3__Group_8__2__Impl rule__Parallele3__Group_8__3 ;
    public final void rule__Parallele3__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6957:1: ( rule__Parallele3__Group_8__2__Impl rule__Parallele3__Group_8__3 )
            // InternalMyTurtleDsl.g:6958:2: rule__Parallele3__Group_8__2__Impl rule__Parallele3__Group_8__3
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_8__2"


    // $ANTLR start "rule__Parallele3__Group_8__2__Impl"
    // InternalMyTurtleDsl.g:6965:1: rule__Parallele3__Group_8__2__Impl : ( ( rule__Parallele3__BAssignment_8_2 ) ) ;
    public final void rule__Parallele3__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6969:1: ( ( ( rule__Parallele3__BAssignment_8_2 ) ) )
            // InternalMyTurtleDsl.g:6970:1: ( ( rule__Parallele3__BAssignment_8_2 ) )
            {
            // InternalMyTurtleDsl.g:6970:1: ( ( rule__Parallele3__BAssignment_8_2 ) )
            // InternalMyTurtleDsl.g:6971:2: ( rule__Parallele3__BAssignment_8_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_8_2()); 
            // InternalMyTurtleDsl.g:6972:2: ( rule__Parallele3__BAssignment_8_2 )
            // InternalMyTurtleDsl.g:6972:3: rule__Parallele3__BAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__BAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getBAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_8__2__Impl"


    // $ANTLR start "rule__Parallele3__Group_8__3"
    // InternalMyTurtleDsl.g:6980:1: rule__Parallele3__Group_8__3 : rule__Parallele3__Group_8__3__Impl rule__Parallele3__Group_8__4 ;
    public final void rule__Parallele3__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6984:1: ( rule__Parallele3__Group_8__3__Impl rule__Parallele3__Group_8__4 )
            // InternalMyTurtleDsl.g:6985:2: rule__Parallele3__Group_8__3__Impl rule__Parallele3__Group_8__4
            {
            pushFollow(FOLLOW_35);
            rule__Parallele3__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_8__3"


    // $ANTLR start "rule__Parallele3__Group_8__3__Impl"
    // InternalMyTurtleDsl.g:6992:1: rule__Parallele3__Group_8__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6996:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:6997:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:6997:1: ( '&' )
            // InternalMyTurtleDsl.g:6998:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_8_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_8__3__Impl"


    // $ANTLR start "rule__Parallele3__Group_8__4"
    // InternalMyTurtleDsl.g:7007:1: rule__Parallele3__Group_8__4 : rule__Parallele3__Group_8__4__Impl ;
    public final void rule__Parallele3__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7011:1: ( rule__Parallele3__Group_8__4__Impl )
            // InternalMyTurtleDsl.g:7012:2: rule__Parallele3__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_8__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_8__4"


    // $ANTLR start "rule__Parallele3__Group_8__4__Impl"
    // InternalMyTurtleDsl.g:7018:1: rule__Parallele3__Group_8__4__Impl : ( ( rule__Parallele3__CAssignment_8_4 ) ) ;
    public final void rule__Parallele3__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7022:1: ( ( ( rule__Parallele3__CAssignment_8_4 ) ) )
            // InternalMyTurtleDsl.g:7023:1: ( ( rule__Parallele3__CAssignment_8_4 ) )
            {
            // InternalMyTurtleDsl.g:7023:1: ( ( rule__Parallele3__CAssignment_8_4 ) )
            // InternalMyTurtleDsl.g:7024:2: ( rule__Parallele3__CAssignment_8_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_8_4()); 
            // InternalMyTurtleDsl.g:7025:2: ( rule__Parallele3__CAssignment_8_4 )
            // InternalMyTurtleDsl.g:7025:3: rule__Parallele3__CAssignment_8_4
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__CAssignment_8_4();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getCAssignment_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_8__4__Impl"


    // $ANTLR start "rule__Parallele3__Group_9__0"
    // InternalMyTurtleDsl.g:7034:1: rule__Parallele3__Group_9__0 : rule__Parallele3__Group_9__0__Impl rule__Parallele3__Group_9__1 ;
    public final void rule__Parallele3__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7038:1: ( rule__Parallele3__Group_9__0__Impl rule__Parallele3__Group_9__1 )
            // InternalMyTurtleDsl.g:7039:2: rule__Parallele3__Group_9__0__Impl rule__Parallele3__Group_9__1
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_9__0"


    // $ANTLR start "rule__Parallele3__Group_9__0__Impl"
    // InternalMyTurtleDsl.g:7046:1: rule__Parallele3__Group_9__0__Impl : ( ( rule__Parallele3__AAssignment_9_0 ) ) ;
    public final void rule__Parallele3__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7050:1: ( ( ( rule__Parallele3__AAssignment_9_0 ) ) )
            // InternalMyTurtleDsl.g:7051:1: ( ( rule__Parallele3__AAssignment_9_0 ) )
            {
            // InternalMyTurtleDsl.g:7051:1: ( ( rule__Parallele3__AAssignment_9_0 ) )
            // InternalMyTurtleDsl.g:7052:2: ( rule__Parallele3__AAssignment_9_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_9_0()); 
            // InternalMyTurtleDsl.g:7053:2: ( rule__Parallele3__AAssignment_9_0 )
            // InternalMyTurtleDsl.g:7053:3: rule__Parallele3__AAssignment_9_0
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__AAssignment_9_0();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getAAssignment_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_9__0__Impl"


    // $ANTLR start "rule__Parallele3__Group_9__1"
    // InternalMyTurtleDsl.g:7061:1: rule__Parallele3__Group_9__1 : rule__Parallele3__Group_9__1__Impl rule__Parallele3__Group_9__2 ;
    public final void rule__Parallele3__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7065:1: ( rule__Parallele3__Group_9__1__Impl rule__Parallele3__Group_9__2 )
            // InternalMyTurtleDsl.g:7066:2: rule__Parallele3__Group_9__1__Impl rule__Parallele3__Group_9__2
            {
            pushFollow(FOLLOW_37);
            rule__Parallele3__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_9__1"


    // $ANTLR start "rule__Parallele3__Group_9__1__Impl"
    // InternalMyTurtleDsl.g:7073:1: rule__Parallele3__Group_9__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7077:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:7078:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:7078:1: ( '&' )
            // InternalMyTurtleDsl.g:7079:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_9_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_9__1__Impl"


    // $ANTLR start "rule__Parallele3__Group_9__2"
    // InternalMyTurtleDsl.g:7088:1: rule__Parallele3__Group_9__2 : rule__Parallele3__Group_9__2__Impl rule__Parallele3__Group_9__3 ;
    public final void rule__Parallele3__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7092:1: ( rule__Parallele3__Group_9__2__Impl rule__Parallele3__Group_9__3 )
            // InternalMyTurtleDsl.g:7093:2: rule__Parallele3__Group_9__2__Impl rule__Parallele3__Group_9__3
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_9__2"


    // $ANTLR start "rule__Parallele3__Group_9__2__Impl"
    // InternalMyTurtleDsl.g:7100:1: rule__Parallele3__Group_9__2__Impl : ( ( rule__Parallele3__BAssignment_9_2 ) ) ;
    public final void rule__Parallele3__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7104:1: ( ( ( rule__Parallele3__BAssignment_9_2 ) ) )
            // InternalMyTurtleDsl.g:7105:1: ( ( rule__Parallele3__BAssignment_9_2 ) )
            {
            // InternalMyTurtleDsl.g:7105:1: ( ( rule__Parallele3__BAssignment_9_2 ) )
            // InternalMyTurtleDsl.g:7106:2: ( rule__Parallele3__BAssignment_9_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_9_2()); 
            // InternalMyTurtleDsl.g:7107:2: ( rule__Parallele3__BAssignment_9_2 )
            // InternalMyTurtleDsl.g:7107:3: rule__Parallele3__BAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__BAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getBAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_9__2__Impl"


    // $ANTLR start "rule__Parallele3__Group_9__3"
    // InternalMyTurtleDsl.g:7115:1: rule__Parallele3__Group_9__3 : rule__Parallele3__Group_9__3__Impl rule__Parallele3__Group_9__4 ;
    public final void rule__Parallele3__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7119:1: ( rule__Parallele3__Group_9__3__Impl rule__Parallele3__Group_9__4 )
            // InternalMyTurtleDsl.g:7120:2: rule__Parallele3__Group_9__3__Impl rule__Parallele3__Group_9__4
            {
            pushFollow(FOLLOW_36);
            rule__Parallele3__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_9__3"


    // $ANTLR start "rule__Parallele3__Group_9__3__Impl"
    // InternalMyTurtleDsl.g:7127:1: rule__Parallele3__Group_9__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7131:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:7132:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:7132:1: ( '&' )
            // InternalMyTurtleDsl.g:7133:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_9_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_9__3__Impl"


    // $ANTLR start "rule__Parallele3__Group_9__4"
    // InternalMyTurtleDsl.g:7142:1: rule__Parallele3__Group_9__4 : rule__Parallele3__Group_9__4__Impl ;
    public final void rule__Parallele3__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7146:1: ( rule__Parallele3__Group_9__4__Impl )
            // InternalMyTurtleDsl.g:7147:2: rule__Parallele3__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_9__4"


    // $ANTLR start "rule__Parallele3__Group_9__4__Impl"
    // InternalMyTurtleDsl.g:7153:1: rule__Parallele3__Group_9__4__Impl : ( ( rule__Parallele3__CAssignment_9_4 ) ) ;
    public final void rule__Parallele3__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7157:1: ( ( ( rule__Parallele3__CAssignment_9_4 ) ) )
            // InternalMyTurtleDsl.g:7158:1: ( ( rule__Parallele3__CAssignment_9_4 ) )
            {
            // InternalMyTurtleDsl.g:7158:1: ( ( rule__Parallele3__CAssignment_9_4 ) )
            // InternalMyTurtleDsl.g:7159:2: ( rule__Parallele3__CAssignment_9_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_9_4()); 
            // InternalMyTurtleDsl.g:7160:2: ( rule__Parallele3__CAssignment_9_4 )
            // InternalMyTurtleDsl.g:7160:3: rule__Parallele3__CAssignment_9_4
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__CAssignment_9_4();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getCAssignment_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_9__4__Impl"


    // $ANTLR start "rule__Parallele3__Group_10__0"
    // InternalMyTurtleDsl.g:7169:1: rule__Parallele3__Group_10__0 : rule__Parallele3__Group_10__0__Impl rule__Parallele3__Group_10__1 ;
    public final void rule__Parallele3__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7173:1: ( rule__Parallele3__Group_10__0__Impl rule__Parallele3__Group_10__1 )
            // InternalMyTurtleDsl.g:7174:2: rule__Parallele3__Group_10__0__Impl rule__Parallele3__Group_10__1
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_10__0"


    // $ANTLR start "rule__Parallele3__Group_10__0__Impl"
    // InternalMyTurtleDsl.g:7181:1: rule__Parallele3__Group_10__0__Impl : ( ( rule__Parallele3__AAssignment_10_0 ) ) ;
    public final void rule__Parallele3__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7185:1: ( ( ( rule__Parallele3__AAssignment_10_0 ) ) )
            // InternalMyTurtleDsl.g:7186:1: ( ( rule__Parallele3__AAssignment_10_0 ) )
            {
            // InternalMyTurtleDsl.g:7186:1: ( ( rule__Parallele3__AAssignment_10_0 ) )
            // InternalMyTurtleDsl.g:7187:2: ( rule__Parallele3__AAssignment_10_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_10_0()); 
            // InternalMyTurtleDsl.g:7188:2: ( rule__Parallele3__AAssignment_10_0 )
            // InternalMyTurtleDsl.g:7188:3: rule__Parallele3__AAssignment_10_0
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__AAssignment_10_0();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getAAssignment_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_10__0__Impl"


    // $ANTLR start "rule__Parallele3__Group_10__1"
    // InternalMyTurtleDsl.g:7196:1: rule__Parallele3__Group_10__1 : rule__Parallele3__Group_10__1__Impl rule__Parallele3__Group_10__2 ;
    public final void rule__Parallele3__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7200:1: ( rule__Parallele3__Group_10__1__Impl rule__Parallele3__Group_10__2 )
            // InternalMyTurtleDsl.g:7201:2: rule__Parallele3__Group_10__1__Impl rule__Parallele3__Group_10__2
            {
            pushFollow(FOLLOW_36);
            rule__Parallele3__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_10__1"


    // $ANTLR start "rule__Parallele3__Group_10__1__Impl"
    // InternalMyTurtleDsl.g:7208:1: rule__Parallele3__Group_10__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7212:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:7213:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:7213:1: ( '&' )
            // InternalMyTurtleDsl.g:7214:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_10_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_10__1__Impl"


    // $ANTLR start "rule__Parallele3__Group_10__2"
    // InternalMyTurtleDsl.g:7223:1: rule__Parallele3__Group_10__2 : rule__Parallele3__Group_10__2__Impl rule__Parallele3__Group_10__3 ;
    public final void rule__Parallele3__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7227:1: ( rule__Parallele3__Group_10__2__Impl rule__Parallele3__Group_10__3 )
            // InternalMyTurtleDsl.g:7228:2: rule__Parallele3__Group_10__2__Impl rule__Parallele3__Group_10__3
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_10__2"


    // $ANTLR start "rule__Parallele3__Group_10__2__Impl"
    // InternalMyTurtleDsl.g:7235:1: rule__Parallele3__Group_10__2__Impl : ( ( rule__Parallele3__BAssignment_10_2 ) ) ;
    public final void rule__Parallele3__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7239:1: ( ( ( rule__Parallele3__BAssignment_10_2 ) ) )
            // InternalMyTurtleDsl.g:7240:1: ( ( rule__Parallele3__BAssignment_10_2 ) )
            {
            // InternalMyTurtleDsl.g:7240:1: ( ( rule__Parallele3__BAssignment_10_2 ) )
            // InternalMyTurtleDsl.g:7241:2: ( rule__Parallele3__BAssignment_10_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_10_2()); 
            // InternalMyTurtleDsl.g:7242:2: ( rule__Parallele3__BAssignment_10_2 )
            // InternalMyTurtleDsl.g:7242:3: rule__Parallele3__BAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__BAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getBAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_10__2__Impl"


    // $ANTLR start "rule__Parallele3__Group_10__3"
    // InternalMyTurtleDsl.g:7250:1: rule__Parallele3__Group_10__3 : rule__Parallele3__Group_10__3__Impl rule__Parallele3__Group_10__4 ;
    public final void rule__Parallele3__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7254:1: ( rule__Parallele3__Group_10__3__Impl rule__Parallele3__Group_10__4 )
            // InternalMyTurtleDsl.g:7255:2: rule__Parallele3__Group_10__3__Impl rule__Parallele3__Group_10__4
            {
            pushFollow(FOLLOW_35);
            rule__Parallele3__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_10__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_10__3"


    // $ANTLR start "rule__Parallele3__Group_10__3__Impl"
    // InternalMyTurtleDsl.g:7262:1: rule__Parallele3__Group_10__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7266:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:7267:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:7267:1: ( '&' )
            // InternalMyTurtleDsl.g:7268:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_10_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_10__3__Impl"


    // $ANTLR start "rule__Parallele3__Group_10__4"
    // InternalMyTurtleDsl.g:7277:1: rule__Parallele3__Group_10__4 : rule__Parallele3__Group_10__4__Impl ;
    public final void rule__Parallele3__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7281:1: ( rule__Parallele3__Group_10__4__Impl )
            // InternalMyTurtleDsl.g:7282:2: rule__Parallele3__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_10__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_10__4"


    // $ANTLR start "rule__Parallele3__Group_10__4__Impl"
    // InternalMyTurtleDsl.g:7288:1: rule__Parallele3__Group_10__4__Impl : ( ( rule__Parallele3__CAssignment_10_4 ) ) ;
    public final void rule__Parallele3__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7292:1: ( ( ( rule__Parallele3__CAssignment_10_4 ) ) )
            // InternalMyTurtleDsl.g:7293:1: ( ( rule__Parallele3__CAssignment_10_4 ) )
            {
            // InternalMyTurtleDsl.g:7293:1: ( ( rule__Parallele3__CAssignment_10_4 ) )
            // InternalMyTurtleDsl.g:7294:2: ( rule__Parallele3__CAssignment_10_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_10_4()); 
            // InternalMyTurtleDsl.g:7295:2: ( rule__Parallele3__CAssignment_10_4 )
            // InternalMyTurtleDsl.g:7295:3: rule__Parallele3__CAssignment_10_4
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__CAssignment_10_4();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getCAssignment_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_10__4__Impl"


    // $ANTLR start "rule__Parallele3__Group_11__0"
    // InternalMyTurtleDsl.g:7304:1: rule__Parallele3__Group_11__0 : rule__Parallele3__Group_11__0__Impl rule__Parallele3__Group_11__1 ;
    public final void rule__Parallele3__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7308:1: ( rule__Parallele3__Group_11__0__Impl rule__Parallele3__Group_11__1 )
            // InternalMyTurtleDsl.g:7309:2: rule__Parallele3__Group_11__0__Impl rule__Parallele3__Group_11__1
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_11__0"


    // $ANTLR start "rule__Parallele3__Group_11__0__Impl"
    // InternalMyTurtleDsl.g:7316:1: rule__Parallele3__Group_11__0__Impl : ( ( rule__Parallele3__AAssignment_11_0 ) ) ;
    public final void rule__Parallele3__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7320:1: ( ( ( rule__Parallele3__AAssignment_11_0 ) ) )
            // InternalMyTurtleDsl.g:7321:1: ( ( rule__Parallele3__AAssignment_11_0 ) )
            {
            // InternalMyTurtleDsl.g:7321:1: ( ( rule__Parallele3__AAssignment_11_0 ) )
            // InternalMyTurtleDsl.g:7322:2: ( rule__Parallele3__AAssignment_11_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_11_0()); 
            // InternalMyTurtleDsl.g:7323:2: ( rule__Parallele3__AAssignment_11_0 )
            // InternalMyTurtleDsl.g:7323:3: rule__Parallele3__AAssignment_11_0
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__AAssignment_11_0();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getAAssignment_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_11__0__Impl"


    // $ANTLR start "rule__Parallele3__Group_11__1"
    // InternalMyTurtleDsl.g:7331:1: rule__Parallele3__Group_11__1 : rule__Parallele3__Group_11__1__Impl rule__Parallele3__Group_11__2 ;
    public final void rule__Parallele3__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7335:1: ( rule__Parallele3__Group_11__1__Impl rule__Parallele3__Group_11__2 )
            // InternalMyTurtleDsl.g:7336:2: rule__Parallele3__Group_11__1__Impl rule__Parallele3__Group_11__2
            {
            pushFollow(FOLLOW_36);
            rule__Parallele3__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_11__1"


    // $ANTLR start "rule__Parallele3__Group_11__1__Impl"
    // InternalMyTurtleDsl.g:7343:1: rule__Parallele3__Group_11__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7347:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:7348:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:7348:1: ( '&' )
            // InternalMyTurtleDsl.g:7349:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_11_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_11__1__Impl"


    // $ANTLR start "rule__Parallele3__Group_11__2"
    // InternalMyTurtleDsl.g:7358:1: rule__Parallele3__Group_11__2 : rule__Parallele3__Group_11__2__Impl rule__Parallele3__Group_11__3 ;
    public final void rule__Parallele3__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7362:1: ( rule__Parallele3__Group_11__2__Impl rule__Parallele3__Group_11__3 )
            // InternalMyTurtleDsl.g:7363:2: rule__Parallele3__Group_11__2__Impl rule__Parallele3__Group_11__3
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_11__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_11__2"


    // $ANTLR start "rule__Parallele3__Group_11__2__Impl"
    // InternalMyTurtleDsl.g:7370:1: rule__Parallele3__Group_11__2__Impl : ( ( rule__Parallele3__BAssignment_11_2 ) ) ;
    public final void rule__Parallele3__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7374:1: ( ( ( rule__Parallele3__BAssignment_11_2 ) ) )
            // InternalMyTurtleDsl.g:7375:1: ( ( rule__Parallele3__BAssignment_11_2 ) )
            {
            // InternalMyTurtleDsl.g:7375:1: ( ( rule__Parallele3__BAssignment_11_2 ) )
            // InternalMyTurtleDsl.g:7376:2: ( rule__Parallele3__BAssignment_11_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_11_2()); 
            // InternalMyTurtleDsl.g:7377:2: ( rule__Parallele3__BAssignment_11_2 )
            // InternalMyTurtleDsl.g:7377:3: rule__Parallele3__BAssignment_11_2
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__BAssignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getBAssignment_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_11__2__Impl"


    // $ANTLR start "rule__Parallele3__Group_11__3"
    // InternalMyTurtleDsl.g:7385:1: rule__Parallele3__Group_11__3 : rule__Parallele3__Group_11__3__Impl rule__Parallele3__Group_11__4 ;
    public final void rule__Parallele3__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7389:1: ( rule__Parallele3__Group_11__3__Impl rule__Parallele3__Group_11__4 )
            // InternalMyTurtleDsl.g:7390:2: rule__Parallele3__Group_11__3__Impl rule__Parallele3__Group_11__4
            {
            pushFollow(FOLLOW_37);
            rule__Parallele3__Group_11__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_11__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_11__3"


    // $ANTLR start "rule__Parallele3__Group_11__3__Impl"
    // InternalMyTurtleDsl.g:7397:1: rule__Parallele3__Group_11__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7401:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:7402:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:7402:1: ( '&' )
            // InternalMyTurtleDsl.g:7403:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_11_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_11_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_11__3__Impl"


    // $ANTLR start "rule__Parallele3__Group_11__4"
    // InternalMyTurtleDsl.g:7412:1: rule__Parallele3__Group_11__4 : rule__Parallele3__Group_11__4__Impl ;
    public final void rule__Parallele3__Group_11__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7416:1: ( rule__Parallele3__Group_11__4__Impl )
            // InternalMyTurtleDsl.g:7417:2: rule__Parallele3__Group_11__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_11__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_11__4"


    // $ANTLR start "rule__Parallele3__Group_11__4__Impl"
    // InternalMyTurtleDsl.g:7423:1: rule__Parallele3__Group_11__4__Impl : ( ( rule__Parallele3__CAssignment_11_4 ) ) ;
    public final void rule__Parallele3__Group_11__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7427:1: ( ( ( rule__Parallele3__CAssignment_11_4 ) ) )
            // InternalMyTurtleDsl.g:7428:1: ( ( rule__Parallele3__CAssignment_11_4 ) )
            {
            // InternalMyTurtleDsl.g:7428:1: ( ( rule__Parallele3__CAssignment_11_4 ) )
            // InternalMyTurtleDsl.g:7429:2: ( rule__Parallele3__CAssignment_11_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_11_4()); 
            // InternalMyTurtleDsl.g:7430:2: ( rule__Parallele3__CAssignment_11_4 )
            // InternalMyTurtleDsl.g:7430:3: rule__Parallele3__CAssignment_11_4
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__CAssignment_11_4();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getCAssignment_11_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_11__4__Impl"


    // $ANTLR start "rule__Parallele3__Group_12__0"
    // InternalMyTurtleDsl.g:7439:1: rule__Parallele3__Group_12__0 : rule__Parallele3__Group_12__0__Impl rule__Parallele3__Group_12__1 ;
    public final void rule__Parallele3__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7443:1: ( rule__Parallele3__Group_12__0__Impl rule__Parallele3__Group_12__1 )
            // InternalMyTurtleDsl.g:7444:2: rule__Parallele3__Group_12__0__Impl rule__Parallele3__Group_12__1
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_12__0"


    // $ANTLR start "rule__Parallele3__Group_12__0__Impl"
    // InternalMyTurtleDsl.g:7451:1: rule__Parallele3__Group_12__0__Impl : ( ( rule__Parallele3__AAssignment_12_0 ) ) ;
    public final void rule__Parallele3__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7455:1: ( ( ( rule__Parallele3__AAssignment_12_0 ) ) )
            // InternalMyTurtleDsl.g:7456:1: ( ( rule__Parallele3__AAssignment_12_0 ) )
            {
            // InternalMyTurtleDsl.g:7456:1: ( ( rule__Parallele3__AAssignment_12_0 ) )
            // InternalMyTurtleDsl.g:7457:2: ( rule__Parallele3__AAssignment_12_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_12_0()); 
            // InternalMyTurtleDsl.g:7458:2: ( rule__Parallele3__AAssignment_12_0 )
            // InternalMyTurtleDsl.g:7458:3: rule__Parallele3__AAssignment_12_0
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__AAssignment_12_0();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getAAssignment_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_12__0__Impl"


    // $ANTLR start "rule__Parallele3__Group_12__1"
    // InternalMyTurtleDsl.g:7466:1: rule__Parallele3__Group_12__1 : rule__Parallele3__Group_12__1__Impl rule__Parallele3__Group_12__2 ;
    public final void rule__Parallele3__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7470:1: ( rule__Parallele3__Group_12__1__Impl rule__Parallele3__Group_12__2 )
            // InternalMyTurtleDsl.g:7471:2: rule__Parallele3__Group_12__1__Impl rule__Parallele3__Group_12__2
            {
            pushFollow(FOLLOW_35);
            rule__Parallele3__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_12__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_12__1"


    // $ANTLR start "rule__Parallele3__Group_12__1__Impl"
    // InternalMyTurtleDsl.g:7478:1: rule__Parallele3__Group_12__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7482:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:7483:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:7483:1: ( '&' )
            // InternalMyTurtleDsl.g:7484:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_12_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_12__1__Impl"


    // $ANTLR start "rule__Parallele3__Group_12__2"
    // InternalMyTurtleDsl.g:7493:1: rule__Parallele3__Group_12__2 : rule__Parallele3__Group_12__2__Impl rule__Parallele3__Group_12__3 ;
    public final void rule__Parallele3__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7497:1: ( rule__Parallele3__Group_12__2__Impl rule__Parallele3__Group_12__3 )
            // InternalMyTurtleDsl.g:7498:2: rule__Parallele3__Group_12__2__Impl rule__Parallele3__Group_12__3
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_12__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_12__2"


    // $ANTLR start "rule__Parallele3__Group_12__2__Impl"
    // InternalMyTurtleDsl.g:7505:1: rule__Parallele3__Group_12__2__Impl : ( ( rule__Parallele3__BAssignment_12_2 ) ) ;
    public final void rule__Parallele3__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7509:1: ( ( ( rule__Parallele3__BAssignment_12_2 ) ) )
            // InternalMyTurtleDsl.g:7510:1: ( ( rule__Parallele3__BAssignment_12_2 ) )
            {
            // InternalMyTurtleDsl.g:7510:1: ( ( rule__Parallele3__BAssignment_12_2 ) )
            // InternalMyTurtleDsl.g:7511:2: ( rule__Parallele3__BAssignment_12_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_12_2()); 
            // InternalMyTurtleDsl.g:7512:2: ( rule__Parallele3__BAssignment_12_2 )
            // InternalMyTurtleDsl.g:7512:3: rule__Parallele3__BAssignment_12_2
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__BAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getBAssignment_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_12__2__Impl"


    // $ANTLR start "rule__Parallele3__Group_12__3"
    // InternalMyTurtleDsl.g:7520:1: rule__Parallele3__Group_12__3 : rule__Parallele3__Group_12__3__Impl rule__Parallele3__Group_12__4 ;
    public final void rule__Parallele3__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7524:1: ( rule__Parallele3__Group_12__3__Impl rule__Parallele3__Group_12__4 )
            // InternalMyTurtleDsl.g:7525:2: rule__Parallele3__Group_12__3__Impl rule__Parallele3__Group_12__4
            {
            pushFollow(FOLLOW_34);
            rule__Parallele3__Group_12__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_12__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_12__3"


    // $ANTLR start "rule__Parallele3__Group_12__3__Impl"
    // InternalMyTurtleDsl.g:7532:1: rule__Parallele3__Group_12__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7536:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:7537:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:7537:1: ( '&' )
            // InternalMyTurtleDsl.g:7538:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_12_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_12_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_12__3__Impl"


    // $ANTLR start "rule__Parallele3__Group_12__4"
    // InternalMyTurtleDsl.g:7547:1: rule__Parallele3__Group_12__4 : rule__Parallele3__Group_12__4__Impl ;
    public final void rule__Parallele3__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7551:1: ( rule__Parallele3__Group_12__4__Impl )
            // InternalMyTurtleDsl.g:7552:2: rule__Parallele3__Group_12__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_12__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_12__4"


    // $ANTLR start "rule__Parallele3__Group_12__4__Impl"
    // InternalMyTurtleDsl.g:7558:1: rule__Parallele3__Group_12__4__Impl : ( ( rule__Parallele3__CAssignment_12_4 ) ) ;
    public final void rule__Parallele3__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7562:1: ( ( ( rule__Parallele3__CAssignment_12_4 ) ) )
            // InternalMyTurtleDsl.g:7563:1: ( ( rule__Parallele3__CAssignment_12_4 ) )
            {
            // InternalMyTurtleDsl.g:7563:1: ( ( rule__Parallele3__CAssignment_12_4 ) )
            // InternalMyTurtleDsl.g:7564:2: ( rule__Parallele3__CAssignment_12_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_12_4()); 
            // InternalMyTurtleDsl.g:7565:2: ( rule__Parallele3__CAssignment_12_4 )
            // InternalMyTurtleDsl.g:7565:3: rule__Parallele3__CAssignment_12_4
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__CAssignment_12_4();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getCAssignment_12_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_12__4__Impl"


    // $ANTLR start "rule__Parallele3__Group_13__0"
    // InternalMyTurtleDsl.g:7574:1: rule__Parallele3__Group_13__0 : rule__Parallele3__Group_13__0__Impl rule__Parallele3__Group_13__1 ;
    public final void rule__Parallele3__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7578:1: ( rule__Parallele3__Group_13__0__Impl rule__Parallele3__Group_13__1 )
            // InternalMyTurtleDsl.g:7579:2: rule__Parallele3__Group_13__0__Impl rule__Parallele3__Group_13__1
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_13__0"


    // $ANTLR start "rule__Parallele3__Group_13__0__Impl"
    // InternalMyTurtleDsl.g:7586:1: rule__Parallele3__Group_13__0__Impl : ( ( rule__Parallele3__AAssignment_13_0 ) ) ;
    public final void rule__Parallele3__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7590:1: ( ( ( rule__Parallele3__AAssignment_13_0 ) ) )
            // InternalMyTurtleDsl.g:7591:1: ( ( rule__Parallele3__AAssignment_13_0 ) )
            {
            // InternalMyTurtleDsl.g:7591:1: ( ( rule__Parallele3__AAssignment_13_0 ) )
            // InternalMyTurtleDsl.g:7592:2: ( rule__Parallele3__AAssignment_13_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_13_0()); 
            // InternalMyTurtleDsl.g:7593:2: ( rule__Parallele3__AAssignment_13_0 )
            // InternalMyTurtleDsl.g:7593:3: rule__Parallele3__AAssignment_13_0
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__AAssignment_13_0();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getAAssignment_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_13__0__Impl"


    // $ANTLR start "rule__Parallele3__Group_13__1"
    // InternalMyTurtleDsl.g:7601:1: rule__Parallele3__Group_13__1 : rule__Parallele3__Group_13__1__Impl rule__Parallele3__Group_13__2 ;
    public final void rule__Parallele3__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7605:1: ( rule__Parallele3__Group_13__1__Impl rule__Parallele3__Group_13__2 )
            // InternalMyTurtleDsl.g:7606:2: rule__Parallele3__Group_13__1__Impl rule__Parallele3__Group_13__2
            {
            pushFollow(FOLLOW_35);
            rule__Parallele3__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_13__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_13__1"


    // $ANTLR start "rule__Parallele3__Group_13__1__Impl"
    // InternalMyTurtleDsl.g:7613:1: rule__Parallele3__Group_13__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7617:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:7618:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:7618:1: ( '&' )
            // InternalMyTurtleDsl.g:7619:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_13_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_13__1__Impl"


    // $ANTLR start "rule__Parallele3__Group_13__2"
    // InternalMyTurtleDsl.g:7628:1: rule__Parallele3__Group_13__2 : rule__Parallele3__Group_13__2__Impl rule__Parallele3__Group_13__3 ;
    public final void rule__Parallele3__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7632:1: ( rule__Parallele3__Group_13__2__Impl rule__Parallele3__Group_13__3 )
            // InternalMyTurtleDsl.g:7633:2: rule__Parallele3__Group_13__2__Impl rule__Parallele3__Group_13__3
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_13__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_13__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_13__2"


    // $ANTLR start "rule__Parallele3__Group_13__2__Impl"
    // InternalMyTurtleDsl.g:7640:1: rule__Parallele3__Group_13__2__Impl : ( ( rule__Parallele3__BAssignment_13_2 ) ) ;
    public final void rule__Parallele3__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7644:1: ( ( ( rule__Parallele3__BAssignment_13_2 ) ) )
            // InternalMyTurtleDsl.g:7645:1: ( ( rule__Parallele3__BAssignment_13_2 ) )
            {
            // InternalMyTurtleDsl.g:7645:1: ( ( rule__Parallele3__BAssignment_13_2 ) )
            // InternalMyTurtleDsl.g:7646:2: ( rule__Parallele3__BAssignment_13_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_13_2()); 
            // InternalMyTurtleDsl.g:7647:2: ( rule__Parallele3__BAssignment_13_2 )
            // InternalMyTurtleDsl.g:7647:3: rule__Parallele3__BAssignment_13_2
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__BAssignment_13_2();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getBAssignment_13_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_13__2__Impl"


    // $ANTLR start "rule__Parallele3__Group_13__3"
    // InternalMyTurtleDsl.g:7655:1: rule__Parallele3__Group_13__3 : rule__Parallele3__Group_13__3__Impl rule__Parallele3__Group_13__4 ;
    public final void rule__Parallele3__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7659:1: ( rule__Parallele3__Group_13__3__Impl rule__Parallele3__Group_13__4 )
            // InternalMyTurtleDsl.g:7660:2: rule__Parallele3__Group_13__3__Impl rule__Parallele3__Group_13__4
            {
            pushFollow(FOLLOW_36);
            rule__Parallele3__Group_13__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_13__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_13__3"


    // $ANTLR start "rule__Parallele3__Group_13__3__Impl"
    // InternalMyTurtleDsl.g:7667:1: rule__Parallele3__Group_13__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7671:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:7672:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:7672:1: ( '&' )
            // InternalMyTurtleDsl.g:7673:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_13_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_13_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_13__3__Impl"


    // $ANTLR start "rule__Parallele3__Group_13__4"
    // InternalMyTurtleDsl.g:7682:1: rule__Parallele3__Group_13__4 : rule__Parallele3__Group_13__4__Impl ;
    public final void rule__Parallele3__Group_13__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7686:1: ( rule__Parallele3__Group_13__4__Impl )
            // InternalMyTurtleDsl.g:7687:2: rule__Parallele3__Group_13__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_13__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_13__4"


    // $ANTLR start "rule__Parallele3__Group_13__4__Impl"
    // InternalMyTurtleDsl.g:7693:1: rule__Parallele3__Group_13__4__Impl : ( ( rule__Parallele3__CAssignment_13_4 ) ) ;
    public final void rule__Parallele3__Group_13__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7697:1: ( ( ( rule__Parallele3__CAssignment_13_4 ) ) )
            // InternalMyTurtleDsl.g:7698:1: ( ( rule__Parallele3__CAssignment_13_4 ) )
            {
            // InternalMyTurtleDsl.g:7698:1: ( ( rule__Parallele3__CAssignment_13_4 ) )
            // InternalMyTurtleDsl.g:7699:2: ( rule__Parallele3__CAssignment_13_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_13_4()); 
            // InternalMyTurtleDsl.g:7700:2: ( rule__Parallele3__CAssignment_13_4 )
            // InternalMyTurtleDsl.g:7700:3: rule__Parallele3__CAssignment_13_4
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__CAssignment_13_4();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getCAssignment_13_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_13__4__Impl"


    // $ANTLR start "rule__Parallele3__Group_14__0"
    // InternalMyTurtleDsl.g:7709:1: rule__Parallele3__Group_14__0 : rule__Parallele3__Group_14__0__Impl rule__Parallele3__Group_14__1 ;
    public final void rule__Parallele3__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7713:1: ( rule__Parallele3__Group_14__0__Impl rule__Parallele3__Group_14__1 )
            // InternalMyTurtleDsl.g:7714:2: rule__Parallele3__Group_14__0__Impl rule__Parallele3__Group_14__1
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_14__0"


    // $ANTLR start "rule__Parallele3__Group_14__0__Impl"
    // InternalMyTurtleDsl.g:7721:1: rule__Parallele3__Group_14__0__Impl : ( ( rule__Parallele3__AAssignment_14_0 ) ) ;
    public final void rule__Parallele3__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7725:1: ( ( ( rule__Parallele3__AAssignment_14_0 ) ) )
            // InternalMyTurtleDsl.g:7726:1: ( ( rule__Parallele3__AAssignment_14_0 ) )
            {
            // InternalMyTurtleDsl.g:7726:1: ( ( rule__Parallele3__AAssignment_14_0 ) )
            // InternalMyTurtleDsl.g:7727:2: ( rule__Parallele3__AAssignment_14_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_14_0()); 
            // InternalMyTurtleDsl.g:7728:2: ( rule__Parallele3__AAssignment_14_0 )
            // InternalMyTurtleDsl.g:7728:3: rule__Parallele3__AAssignment_14_0
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__AAssignment_14_0();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getAAssignment_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_14__0__Impl"


    // $ANTLR start "rule__Parallele3__Group_14__1"
    // InternalMyTurtleDsl.g:7736:1: rule__Parallele3__Group_14__1 : rule__Parallele3__Group_14__1__Impl rule__Parallele3__Group_14__2 ;
    public final void rule__Parallele3__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7740:1: ( rule__Parallele3__Group_14__1__Impl rule__Parallele3__Group_14__2 )
            // InternalMyTurtleDsl.g:7741:2: rule__Parallele3__Group_14__1__Impl rule__Parallele3__Group_14__2
            {
            pushFollow(FOLLOW_34);
            rule__Parallele3__Group_14__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_14__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_14__1"


    // $ANTLR start "rule__Parallele3__Group_14__1__Impl"
    // InternalMyTurtleDsl.g:7748:1: rule__Parallele3__Group_14__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7752:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:7753:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:7753:1: ( '&' )
            // InternalMyTurtleDsl.g:7754:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_14_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_14__1__Impl"


    // $ANTLR start "rule__Parallele3__Group_14__2"
    // InternalMyTurtleDsl.g:7763:1: rule__Parallele3__Group_14__2 : rule__Parallele3__Group_14__2__Impl rule__Parallele3__Group_14__3 ;
    public final void rule__Parallele3__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7767:1: ( rule__Parallele3__Group_14__2__Impl rule__Parallele3__Group_14__3 )
            // InternalMyTurtleDsl.g:7768:2: rule__Parallele3__Group_14__2__Impl rule__Parallele3__Group_14__3
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_14__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_14__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_14__2"


    // $ANTLR start "rule__Parallele3__Group_14__2__Impl"
    // InternalMyTurtleDsl.g:7775:1: rule__Parallele3__Group_14__2__Impl : ( ( rule__Parallele3__BAssignment_14_2 ) ) ;
    public final void rule__Parallele3__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7779:1: ( ( ( rule__Parallele3__BAssignment_14_2 ) ) )
            // InternalMyTurtleDsl.g:7780:1: ( ( rule__Parallele3__BAssignment_14_2 ) )
            {
            // InternalMyTurtleDsl.g:7780:1: ( ( rule__Parallele3__BAssignment_14_2 ) )
            // InternalMyTurtleDsl.g:7781:2: ( rule__Parallele3__BAssignment_14_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_14_2()); 
            // InternalMyTurtleDsl.g:7782:2: ( rule__Parallele3__BAssignment_14_2 )
            // InternalMyTurtleDsl.g:7782:3: rule__Parallele3__BAssignment_14_2
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__BAssignment_14_2();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getBAssignment_14_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_14__2__Impl"


    // $ANTLR start "rule__Parallele3__Group_14__3"
    // InternalMyTurtleDsl.g:7790:1: rule__Parallele3__Group_14__3 : rule__Parallele3__Group_14__3__Impl rule__Parallele3__Group_14__4 ;
    public final void rule__Parallele3__Group_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7794:1: ( rule__Parallele3__Group_14__3__Impl rule__Parallele3__Group_14__4 )
            // InternalMyTurtleDsl.g:7795:2: rule__Parallele3__Group_14__3__Impl rule__Parallele3__Group_14__4
            {
            pushFollow(FOLLOW_35);
            rule__Parallele3__Group_14__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_14__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_14__3"


    // $ANTLR start "rule__Parallele3__Group_14__3__Impl"
    // InternalMyTurtleDsl.g:7802:1: rule__Parallele3__Group_14__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_14__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7806:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:7807:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:7807:1: ( '&' )
            // InternalMyTurtleDsl.g:7808:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_14_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_14_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_14__3__Impl"


    // $ANTLR start "rule__Parallele3__Group_14__4"
    // InternalMyTurtleDsl.g:7817:1: rule__Parallele3__Group_14__4 : rule__Parallele3__Group_14__4__Impl ;
    public final void rule__Parallele3__Group_14__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7821:1: ( rule__Parallele3__Group_14__4__Impl )
            // InternalMyTurtleDsl.g:7822:2: rule__Parallele3__Group_14__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_14__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_14__4"


    // $ANTLR start "rule__Parallele3__Group_14__4__Impl"
    // InternalMyTurtleDsl.g:7828:1: rule__Parallele3__Group_14__4__Impl : ( ( rule__Parallele3__CAssignment_14_4 ) ) ;
    public final void rule__Parallele3__Group_14__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7832:1: ( ( ( rule__Parallele3__CAssignment_14_4 ) ) )
            // InternalMyTurtleDsl.g:7833:1: ( ( rule__Parallele3__CAssignment_14_4 ) )
            {
            // InternalMyTurtleDsl.g:7833:1: ( ( rule__Parallele3__CAssignment_14_4 ) )
            // InternalMyTurtleDsl.g:7834:2: ( rule__Parallele3__CAssignment_14_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_14_4()); 
            // InternalMyTurtleDsl.g:7835:2: ( rule__Parallele3__CAssignment_14_4 )
            // InternalMyTurtleDsl.g:7835:3: rule__Parallele3__CAssignment_14_4
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__CAssignment_14_4();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getCAssignment_14_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_14__4__Impl"


    // $ANTLR start "rule__Parallele3__Group_15__0"
    // InternalMyTurtleDsl.g:7844:1: rule__Parallele3__Group_15__0 : rule__Parallele3__Group_15__0__Impl rule__Parallele3__Group_15__1 ;
    public final void rule__Parallele3__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7848:1: ( rule__Parallele3__Group_15__0__Impl rule__Parallele3__Group_15__1 )
            // InternalMyTurtleDsl.g:7849:2: rule__Parallele3__Group_15__0__Impl rule__Parallele3__Group_15__1
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_15__0"


    // $ANTLR start "rule__Parallele3__Group_15__0__Impl"
    // InternalMyTurtleDsl.g:7856:1: rule__Parallele3__Group_15__0__Impl : ( ( rule__Parallele3__AAssignment_15_0 ) ) ;
    public final void rule__Parallele3__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7860:1: ( ( ( rule__Parallele3__AAssignment_15_0 ) ) )
            // InternalMyTurtleDsl.g:7861:1: ( ( rule__Parallele3__AAssignment_15_0 ) )
            {
            // InternalMyTurtleDsl.g:7861:1: ( ( rule__Parallele3__AAssignment_15_0 ) )
            // InternalMyTurtleDsl.g:7862:2: ( rule__Parallele3__AAssignment_15_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_15_0()); 
            // InternalMyTurtleDsl.g:7863:2: ( rule__Parallele3__AAssignment_15_0 )
            // InternalMyTurtleDsl.g:7863:3: rule__Parallele3__AAssignment_15_0
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__AAssignment_15_0();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getAAssignment_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_15__0__Impl"


    // $ANTLR start "rule__Parallele3__Group_15__1"
    // InternalMyTurtleDsl.g:7871:1: rule__Parallele3__Group_15__1 : rule__Parallele3__Group_15__1__Impl rule__Parallele3__Group_15__2 ;
    public final void rule__Parallele3__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7875:1: ( rule__Parallele3__Group_15__1__Impl rule__Parallele3__Group_15__2 )
            // InternalMyTurtleDsl.g:7876:2: rule__Parallele3__Group_15__1__Impl rule__Parallele3__Group_15__2
            {
            pushFollow(FOLLOW_34);
            rule__Parallele3__Group_15__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_15__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_15__1"


    // $ANTLR start "rule__Parallele3__Group_15__1__Impl"
    // InternalMyTurtleDsl.g:7883:1: rule__Parallele3__Group_15__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7887:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:7888:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:7888:1: ( '&' )
            // InternalMyTurtleDsl.g:7889:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_15_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_15__1__Impl"


    // $ANTLR start "rule__Parallele3__Group_15__2"
    // InternalMyTurtleDsl.g:7898:1: rule__Parallele3__Group_15__2 : rule__Parallele3__Group_15__2__Impl rule__Parallele3__Group_15__3 ;
    public final void rule__Parallele3__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7902:1: ( rule__Parallele3__Group_15__2__Impl rule__Parallele3__Group_15__3 )
            // InternalMyTurtleDsl.g:7903:2: rule__Parallele3__Group_15__2__Impl rule__Parallele3__Group_15__3
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_15__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_15__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_15__2"


    // $ANTLR start "rule__Parallele3__Group_15__2__Impl"
    // InternalMyTurtleDsl.g:7910:1: rule__Parallele3__Group_15__2__Impl : ( ( rule__Parallele3__BAssignment_15_2 ) ) ;
    public final void rule__Parallele3__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7914:1: ( ( ( rule__Parallele3__BAssignment_15_2 ) ) )
            // InternalMyTurtleDsl.g:7915:1: ( ( rule__Parallele3__BAssignment_15_2 ) )
            {
            // InternalMyTurtleDsl.g:7915:1: ( ( rule__Parallele3__BAssignment_15_2 ) )
            // InternalMyTurtleDsl.g:7916:2: ( rule__Parallele3__BAssignment_15_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_15_2()); 
            // InternalMyTurtleDsl.g:7917:2: ( rule__Parallele3__BAssignment_15_2 )
            // InternalMyTurtleDsl.g:7917:3: rule__Parallele3__BAssignment_15_2
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__BAssignment_15_2();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getBAssignment_15_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_15__2__Impl"


    // $ANTLR start "rule__Parallele3__Group_15__3"
    // InternalMyTurtleDsl.g:7925:1: rule__Parallele3__Group_15__3 : rule__Parallele3__Group_15__3__Impl rule__Parallele3__Group_15__4 ;
    public final void rule__Parallele3__Group_15__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7929:1: ( rule__Parallele3__Group_15__3__Impl rule__Parallele3__Group_15__4 )
            // InternalMyTurtleDsl.g:7930:2: rule__Parallele3__Group_15__3__Impl rule__Parallele3__Group_15__4
            {
            pushFollow(FOLLOW_36);
            rule__Parallele3__Group_15__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_15__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_15__3"


    // $ANTLR start "rule__Parallele3__Group_15__3__Impl"
    // InternalMyTurtleDsl.g:7937:1: rule__Parallele3__Group_15__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_15__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7941:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:7942:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:7942:1: ( '&' )
            // InternalMyTurtleDsl.g:7943:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_15_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_15_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_15__3__Impl"


    // $ANTLR start "rule__Parallele3__Group_15__4"
    // InternalMyTurtleDsl.g:7952:1: rule__Parallele3__Group_15__4 : rule__Parallele3__Group_15__4__Impl ;
    public final void rule__Parallele3__Group_15__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7956:1: ( rule__Parallele3__Group_15__4__Impl )
            // InternalMyTurtleDsl.g:7957:2: rule__Parallele3__Group_15__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_15__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_15__4"


    // $ANTLR start "rule__Parallele3__Group_15__4__Impl"
    // InternalMyTurtleDsl.g:7963:1: rule__Parallele3__Group_15__4__Impl : ( ( rule__Parallele3__CAssignment_15_4 ) ) ;
    public final void rule__Parallele3__Group_15__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7967:1: ( ( ( rule__Parallele3__CAssignment_15_4 ) ) )
            // InternalMyTurtleDsl.g:7968:1: ( ( rule__Parallele3__CAssignment_15_4 ) )
            {
            // InternalMyTurtleDsl.g:7968:1: ( ( rule__Parallele3__CAssignment_15_4 ) )
            // InternalMyTurtleDsl.g:7969:2: ( rule__Parallele3__CAssignment_15_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_15_4()); 
            // InternalMyTurtleDsl.g:7970:2: ( rule__Parallele3__CAssignment_15_4 )
            // InternalMyTurtleDsl.g:7970:3: rule__Parallele3__CAssignment_15_4
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__CAssignment_15_4();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getCAssignment_15_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_15__4__Impl"


    // $ANTLR start "rule__Parallele3__Group_16__0"
    // InternalMyTurtleDsl.g:7979:1: rule__Parallele3__Group_16__0 : rule__Parallele3__Group_16__0__Impl rule__Parallele3__Group_16__1 ;
    public final void rule__Parallele3__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7983:1: ( rule__Parallele3__Group_16__0__Impl rule__Parallele3__Group_16__1 )
            // InternalMyTurtleDsl.g:7984:2: rule__Parallele3__Group_16__0__Impl rule__Parallele3__Group_16__1
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_16__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_16__0"


    // $ANTLR start "rule__Parallele3__Group_16__0__Impl"
    // InternalMyTurtleDsl.g:7991:1: rule__Parallele3__Group_16__0__Impl : ( ( rule__Parallele3__AAssignment_16_0 ) ) ;
    public final void rule__Parallele3__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7995:1: ( ( ( rule__Parallele3__AAssignment_16_0 ) ) )
            // InternalMyTurtleDsl.g:7996:1: ( ( rule__Parallele3__AAssignment_16_0 ) )
            {
            // InternalMyTurtleDsl.g:7996:1: ( ( rule__Parallele3__AAssignment_16_0 ) )
            // InternalMyTurtleDsl.g:7997:2: ( rule__Parallele3__AAssignment_16_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_16_0()); 
            // InternalMyTurtleDsl.g:7998:2: ( rule__Parallele3__AAssignment_16_0 )
            // InternalMyTurtleDsl.g:7998:3: rule__Parallele3__AAssignment_16_0
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__AAssignment_16_0();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getAAssignment_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_16__0__Impl"


    // $ANTLR start "rule__Parallele3__Group_16__1"
    // InternalMyTurtleDsl.g:8006:1: rule__Parallele3__Group_16__1 : rule__Parallele3__Group_16__1__Impl rule__Parallele3__Group_16__2 ;
    public final void rule__Parallele3__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8010:1: ( rule__Parallele3__Group_16__1__Impl rule__Parallele3__Group_16__2 )
            // InternalMyTurtleDsl.g:8011:2: rule__Parallele3__Group_16__1__Impl rule__Parallele3__Group_16__2
            {
            pushFollow(FOLLOW_36);
            rule__Parallele3__Group_16__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_16__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_16__1"


    // $ANTLR start "rule__Parallele3__Group_16__1__Impl"
    // InternalMyTurtleDsl.g:8018:1: rule__Parallele3__Group_16__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8022:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:8023:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:8023:1: ( '&' )
            // InternalMyTurtleDsl.g:8024:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_16_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_16_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_16__1__Impl"


    // $ANTLR start "rule__Parallele3__Group_16__2"
    // InternalMyTurtleDsl.g:8033:1: rule__Parallele3__Group_16__2 : rule__Parallele3__Group_16__2__Impl rule__Parallele3__Group_16__3 ;
    public final void rule__Parallele3__Group_16__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8037:1: ( rule__Parallele3__Group_16__2__Impl rule__Parallele3__Group_16__3 )
            // InternalMyTurtleDsl.g:8038:2: rule__Parallele3__Group_16__2__Impl rule__Parallele3__Group_16__3
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_16__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_16__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_16__2"


    // $ANTLR start "rule__Parallele3__Group_16__2__Impl"
    // InternalMyTurtleDsl.g:8045:1: rule__Parallele3__Group_16__2__Impl : ( ( rule__Parallele3__BAssignment_16_2 ) ) ;
    public final void rule__Parallele3__Group_16__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8049:1: ( ( ( rule__Parallele3__BAssignment_16_2 ) ) )
            // InternalMyTurtleDsl.g:8050:1: ( ( rule__Parallele3__BAssignment_16_2 ) )
            {
            // InternalMyTurtleDsl.g:8050:1: ( ( rule__Parallele3__BAssignment_16_2 ) )
            // InternalMyTurtleDsl.g:8051:2: ( rule__Parallele3__BAssignment_16_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_16_2()); 
            // InternalMyTurtleDsl.g:8052:2: ( rule__Parallele3__BAssignment_16_2 )
            // InternalMyTurtleDsl.g:8052:3: rule__Parallele3__BAssignment_16_2
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__BAssignment_16_2();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getBAssignment_16_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_16__2__Impl"


    // $ANTLR start "rule__Parallele3__Group_16__3"
    // InternalMyTurtleDsl.g:8060:1: rule__Parallele3__Group_16__3 : rule__Parallele3__Group_16__3__Impl rule__Parallele3__Group_16__4 ;
    public final void rule__Parallele3__Group_16__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8064:1: ( rule__Parallele3__Group_16__3__Impl rule__Parallele3__Group_16__4 )
            // InternalMyTurtleDsl.g:8065:2: rule__Parallele3__Group_16__3__Impl rule__Parallele3__Group_16__4
            {
            pushFollow(FOLLOW_34);
            rule__Parallele3__Group_16__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_16__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_16__3"


    // $ANTLR start "rule__Parallele3__Group_16__3__Impl"
    // InternalMyTurtleDsl.g:8072:1: rule__Parallele3__Group_16__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_16__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8076:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:8077:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:8077:1: ( '&' )
            // InternalMyTurtleDsl.g:8078:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_16_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_16_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_16__3__Impl"


    // $ANTLR start "rule__Parallele3__Group_16__4"
    // InternalMyTurtleDsl.g:8087:1: rule__Parallele3__Group_16__4 : rule__Parallele3__Group_16__4__Impl ;
    public final void rule__Parallele3__Group_16__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8091:1: ( rule__Parallele3__Group_16__4__Impl )
            // InternalMyTurtleDsl.g:8092:2: rule__Parallele3__Group_16__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_16__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_16__4"


    // $ANTLR start "rule__Parallele3__Group_16__4__Impl"
    // InternalMyTurtleDsl.g:8098:1: rule__Parallele3__Group_16__4__Impl : ( ( rule__Parallele3__CAssignment_16_4 ) ) ;
    public final void rule__Parallele3__Group_16__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8102:1: ( ( ( rule__Parallele3__CAssignment_16_4 ) ) )
            // InternalMyTurtleDsl.g:8103:1: ( ( rule__Parallele3__CAssignment_16_4 ) )
            {
            // InternalMyTurtleDsl.g:8103:1: ( ( rule__Parallele3__CAssignment_16_4 ) )
            // InternalMyTurtleDsl.g:8104:2: ( rule__Parallele3__CAssignment_16_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_16_4()); 
            // InternalMyTurtleDsl.g:8105:2: ( rule__Parallele3__CAssignment_16_4 )
            // InternalMyTurtleDsl.g:8105:3: rule__Parallele3__CAssignment_16_4
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__CAssignment_16_4();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getCAssignment_16_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_16__4__Impl"


    // $ANTLR start "rule__Parallele3__Group_17__0"
    // InternalMyTurtleDsl.g:8114:1: rule__Parallele3__Group_17__0 : rule__Parallele3__Group_17__0__Impl rule__Parallele3__Group_17__1 ;
    public final void rule__Parallele3__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8118:1: ( rule__Parallele3__Group_17__0__Impl rule__Parallele3__Group_17__1 )
            // InternalMyTurtleDsl.g:8119:2: rule__Parallele3__Group_17__0__Impl rule__Parallele3__Group_17__1
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_17__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_17__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_17__0"


    // $ANTLR start "rule__Parallele3__Group_17__0__Impl"
    // InternalMyTurtleDsl.g:8126:1: rule__Parallele3__Group_17__0__Impl : ( ( rule__Parallele3__AAssignment_17_0 ) ) ;
    public final void rule__Parallele3__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8130:1: ( ( ( rule__Parallele3__AAssignment_17_0 ) ) )
            // InternalMyTurtleDsl.g:8131:1: ( ( rule__Parallele3__AAssignment_17_0 ) )
            {
            // InternalMyTurtleDsl.g:8131:1: ( ( rule__Parallele3__AAssignment_17_0 ) )
            // InternalMyTurtleDsl.g:8132:2: ( rule__Parallele3__AAssignment_17_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_17_0()); 
            // InternalMyTurtleDsl.g:8133:2: ( rule__Parallele3__AAssignment_17_0 )
            // InternalMyTurtleDsl.g:8133:3: rule__Parallele3__AAssignment_17_0
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__AAssignment_17_0();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getAAssignment_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_17__0__Impl"


    // $ANTLR start "rule__Parallele3__Group_17__1"
    // InternalMyTurtleDsl.g:8141:1: rule__Parallele3__Group_17__1 : rule__Parallele3__Group_17__1__Impl rule__Parallele3__Group_17__2 ;
    public final void rule__Parallele3__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8145:1: ( rule__Parallele3__Group_17__1__Impl rule__Parallele3__Group_17__2 )
            // InternalMyTurtleDsl.g:8146:2: rule__Parallele3__Group_17__1__Impl rule__Parallele3__Group_17__2
            {
            pushFollow(FOLLOW_36);
            rule__Parallele3__Group_17__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_17__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_17__1"


    // $ANTLR start "rule__Parallele3__Group_17__1__Impl"
    // InternalMyTurtleDsl.g:8153:1: rule__Parallele3__Group_17__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8157:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:8158:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:8158:1: ( '&' )
            // InternalMyTurtleDsl.g:8159:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_17_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_17_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_17__1__Impl"


    // $ANTLR start "rule__Parallele3__Group_17__2"
    // InternalMyTurtleDsl.g:8168:1: rule__Parallele3__Group_17__2 : rule__Parallele3__Group_17__2__Impl rule__Parallele3__Group_17__3 ;
    public final void rule__Parallele3__Group_17__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8172:1: ( rule__Parallele3__Group_17__2__Impl rule__Parallele3__Group_17__3 )
            // InternalMyTurtleDsl.g:8173:2: rule__Parallele3__Group_17__2__Impl rule__Parallele3__Group_17__3
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_17__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_17__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_17__2"


    // $ANTLR start "rule__Parallele3__Group_17__2__Impl"
    // InternalMyTurtleDsl.g:8180:1: rule__Parallele3__Group_17__2__Impl : ( ( rule__Parallele3__BAssignment_17_2 ) ) ;
    public final void rule__Parallele3__Group_17__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8184:1: ( ( ( rule__Parallele3__BAssignment_17_2 ) ) )
            // InternalMyTurtleDsl.g:8185:1: ( ( rule__Parallele3__BAssignment_17_2 ) )
            {
            // InternalMyTurtleDsl.g:8185:1: ( ( rule__Parallele3__BAssignment_17_2 ) )
            // InternalMyTurtleDsl.g:8186:2: ( rule__Parallele3__BAssignment_17_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_17_2()); 
            // InternalMyTurtleDsl.g:8187:2: ( rule__Parallele3__BAssignment_17_2 )
            // InternalMyTurtleDsl.g:8187:3: rule__Parallele3__BAssignment_17_2
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__BAssignment_17_2();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getBAssignment_17_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_17__2__Impl"


    // $ANTLR start "rule__Parallele3__Group_17__3"
    // InternalMyTurtleDsl.g:8195:1: rule__Parallele3__Group_17__3 : rule__Parallele3__Group_17__3__Impl rule__Parallele3__Group_17__4 ;
    public final void rule__Parallele3__Group_17__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8199:1: ( rule__Parallele3__Group_17__3__Impl rule__Parallele3__Group_17__4 )
            // InternalMyTurtleDsl.g:8200:2: rule__Parallele3__Group_17__3__Impl rule__Parallele3__Group_17__4
            {
            pushFollow(FOLLOW_35);
            rule__Parallele3__Group_17__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_17__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_17__3"


    // $ANTLR start "rule__Parallele3__Group_17__3__Impl"
    // InternalMyTurtleDsl.g:8207:1: rule__Parallele3__Group_17__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_17__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8211:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:8212:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:8212:1: ( '&' )
            // InternalMyTurtleDsl.g:8213:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_17_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_17_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_17__3__Impl"


    // $ANTLR start "rule__Parallele3__Group_17__4"
    // InternalMyTurtleDsl.g:8222:1: rule__Parallele3__Group_17__4 : rule__Parallele3__Group_17__4__Impl ;
    public final void rule__Parallele3__Group_17__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8226:1: ( rule__Parallele3__Group_17__4__Impl )
            // InternalMyTurtleDsl.g:8227:2: rule__Parallele3__Group_17__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_17__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_17__4"


    // $ANTLR start "rule__Parallele3__Group_17__4__Impl"
    // InternalMyTurtleDsl.g:8233:1: rule__Parallele3__Group_17__4__Impl : ( ( rule__Parallele3__CAssignment_17_4 ) ) ;
    public final void rule__Parallele3__Group_17__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8237:1: ( ( ( rule__Parallele3__CAssignment_17_4 ) ) )
            // InternalMyTurtleDsl.g:8238:1: ( ( rule__Parallele3__CAssignment_17_4 ) )
            {
            // InternalMyTurtleDsl.g:8238:1: ( ( rule__Parallele3__CAssignment_17_4 ) )
            // InternalMyTurtleDsl.g:8239:2: ( rule__Parallele3__CAssignment_17_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_17_4()); 
            // InternalMyTurtleDsl.g:8240:2: ( rule__Parallele3__CAssignment_17_4 )
            // InternalMyTurtleDsl.g:8240:3: rule__Parallele3__CAssignment_17_4
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__CAssignment_17_4();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getCAssignment_17_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_17__4__Impl"


    // $ANTLR start "rule__Parallele3__Group_18__0"
    // InternalMyTurtleDsl.g:8249:1: rule__Parallele3__Group_18__0 : rule__Parallele3__Group_18__0__Impl rule__Parallele3__Group_18__1 ;
    public final void rule__Parallele3__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8253:1: ( rule__Parallele3__Group_18__0__Impl rule__Parallele3__Group_18__1 )
            // InternalMyTurtleDsl.g:8254:2: rule__Parallele3__Group_18__0__Impl rule__Parallele3__Group_18__1
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_18__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_18__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_18__0"


    // $ANTLR start "rule__Parallele3__Group_18__0__Impl"
    // InternalMyTurtleDsl.g:8261:1: rule__Parallele3__Group_18__0__Impl : ( ( rule__Parallele3__AAssignment_18_0 ) ) ;
    public final void rule__Parallele3__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8265:1: ( ( ( rule__Parallele3__AAssignment_18_0 ) ) )
            // InternalMyTurtleDsl.g:8266:1: ( ( rule__Parallele3__AAssignment_18_0 ) )
            {
            // InternalMyTurtleDsl.g:8266:1: ( ( rule__Parallele3__AAssignment_18_0 ) )
            // InternalMyTurtleDsl.g:8267:2: ( rule__Parallele3__AAssignment_18_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_18_0()); 
            // InternalMyTurtleDsl.g:8268:2: ( rule__Parallele3__AAssignment_18_0 )
            // InternalMyTurtleDsl.g:8268:3: rule__Parallele3__AAssignment_18_0
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__AAssignment_18_0();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getAAssignment_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_18__0__Impl"


    // $ANTLR start "rule__Parallele3__Group_18__1"
    // InternalMyTurtleDsl.g:8276:1: rule__Parallele3__Group_18__1 : rule__Parallele3__Group_18__1__Impl rule__Parallele3__Group_18__2 ;
    public final void rule__Parallele3__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8280:1: ( rule__Parallele3__Group_18__1__Impl rule__Parallele3__Group_18__2 )
            // InternalMyTurtleDsl.g:8281:2: rule__Parallele3__Group_18__1__Impl rule__Parallele3__Group_18__2
            {
            pushFollow(FOLLOW_35);
            rule__Parallele3__Group_18__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_18__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_18__1"


    // $ANTLR start "rule__Parallele3__Group_18__1__Impl"
    // InternalMyTurtleDsl.g:8288:1: rule__Parallele3__Group_18__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8292:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:8293:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:8293:1: ( '&' )
            // InternalMyTurtleDsl.g:8294:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_18_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_18_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_18__1__Impl"


    // $ANTLR start "rule__Parallele3__Group_18__2"
    // InternalMyTurtleDsl.g:8303:1: rule__Parallele3__Group_18__2 : rule__Parallele3__Group_18__2__Impl rule__Parallele3__Group_18__3 ;
    public final void rule__Parallele3__Group_18__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8307:1: ( rule__Parallele3__Group_18__2__Impl rule__Parallele3__Group_18__3 )
            // InternalMyTurtleDsl.g:8308:2: rule__Parallele3__Group_18__2__Impl rule__Parallele3__Group_18__3
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_18__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_18__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_18__2"


    // $ANTLR start "rule__Parallele3__Group_18__2__Impl"
    // InternalMyTurtleDsl.g:8315:1: rule__Parallele3__Group_18__2__Impl : ( ( rule__Parallele3__BAssignment_18_2 ) ) ;
    public final void rule__Parallele3__Group_18__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8319:1: ( ( ( rule__Parallele3__BAssignment_18_2 ) ) )
            // InternalMyTurtleDsl.g:8320:1: ( ( rule__Parallele3__BAssignment_18_2 ) )
            {
            // InternalMyTurtleDsl.g:8320:1: ( ( rule__Parallele3__BAssignment_18_2 ) )
            // InternalMyTurtleDsl.g:8321:2: ( rule__Parallele3__BAssignment_18_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_18_2()); 
            // InternalMyTurtleDsl.g:8322:2: ( rule__Parallele3__BAssignment_18_2 )
            // InternalMyTurtleDsl.g:8322:3: rule__Parallele3__BAssignment_18_2
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__BAssignment_18_2();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getBAssignment_18_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_18__2__Impl"


    // $ANTLR start "rule__Parallele3__Group_18__3"
    // InternalMyTurtleDsl.g:8330:1: rule__Parallele3__Group_18__3 : rule__Parallele3__Group_18__3__Impl rule__Parallele3__Group_18__4 ;
    public final void rule__Parallele3__Group_18__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8334:1: ( rule__Parallele3__Group_18__3__Impl rule__Parallele3__Group_18__4 )
            // InternalMyTurtleDsl.g:8335:2: rule__Parallele3__Group_18__3__Impl rule__Parallele3__Group_18__4
            {
            pushFollow(FOLLOW_37);
            rule__Parallele3__Group_18__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_18__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_18__3"


    // $ANTLR start "rule__Parallele3__Group_18__3__Impl"
    // InternalMyTurtleDsl.g:8342:1: rule__Parallele3__Group_18__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_18__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8346:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:8347:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:8347:1: ( '&' )
            // InternalMyTurtleDsl.g:8348:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_18_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_18_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_18__3__Impl"


    // $ANTLR start "rule__Parallele3__Group_18__4"
    // InternalMyTurtleDsl.g:8357:1: rule__Parallele3__Group_18__4 : rule__Parallele3__Group_18__4__Impl ;
    public final void rule__Parallele3__Group_18__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8361:1: ( rule__Parallele3__Group_18__4__Impl )
            // InternalMyTurtleDsl.g:8362:2: rule__Parallele3__Group_18__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_18__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_18__4"


    // $ANTLR start "rule__Parallele3__Group_18__4__Impl"
    // InternalMyTurtleDsl.g:8368:1: rule__Parallele3__Group_18__4__Impl : ( ( rule__Parallele3__CAssignment_18_4 ) ) ;
    public final void rule__Parallele3__Group_18__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8372:1: ( ( ( rule__Parallele3__CAssignment_18_4 ) ) )
            // InternalMyTurtleDsl.g:8373:1: ( ( rule__Parallele3__CAssignment_18_4 ) )
            {
            // InternalMyTurtleDsl.g:8373:1: ( ( rule__Parallele3__CAssignment_18_4 ) )
            // InternalMyTurtleDsl.g:8374:2: ( rule__Parallele3__CAssignment_18_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_18_4()); 
            // InternalMyTurtleDsl.g:8375:2: ( rule__Parallele3__CAssignment_18_4 )
            // InternalMyTurtleDsl.g:8375:3: rule__Parallele3__CAssignment_18_4
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__CAssignment_18_4();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getCAssignment_18_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_18__4__Impl"


    // $ANTLR start "rule__Parallele3__Group_19__0"
    // InternalMyTurtleDsl.g:8384:1: rule__Parallele3__Group_19__0 : rule__Parallele3__Group_19__0__Impl rule__Parallele3__Group_19__1 ;
    public final void rule__Parallele3__Group_19__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8388:1: ( rule__Parallele3__Group_19__0__Impl rule__Parallele3__Group_19__1 )
            // InternalMyTurtleDsl.g:8389:2: rule__Parallele3__Group_19__0__Impl rule__Parallele3__Group_19__1
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_19__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_19__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_19__0"


    // $ANTLR start "rule__Parallele3__Group_19__0__Impl"
    // InternalMyTurtleDsl.g:8396:1: rule__Parallele3__Group_19__0__Impl : ( ( rule__Parallele3__AAssignment_19_0 ) ) ;
    public final void rule__Parallele3__Group_19__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8400:1: ( ( ( rule__Parallele3__AAssignment_19_0 ) ) )
            // InternalMyTurtleDsl.g:8401:1: ( ( rule__Parallele3__AAssignment_19_0 ) )
            {
            // InternalMyTurtleDsl.g:8401:1: ( ( rule__Parallele3__AAssignment_19_0 ) )
            // InternalMyTurtleDsl.g:8402:2: ( rule__Parallele3__AAssignment_19_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_19_0()); 
            // InternalMyTurtleDsl.g:8403:2: ( rule__Parallele3__AAssignment_19_0 )
            // InternalMyTurtleDsl.g:8403:3: rule__Parallele3__AAssignment_19_0
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__AAssignment_19_0();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getAAssignment_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_19__0__Impl"


    // $ANTLR start "rule__Parallele3__Group_19__1"
    // InternalMyTurtleDsl.g:8411:1: rule__Parallele3__Group_19__1 : rule__Parallele3__Group_19__1__Impl rule__Parallele3__Group_19__2 ;
    public final void rule__Parallele3__Group_19__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8415:1: ( rule__Parallele3__Group_19__1__Impl rule__Parallele3__Group_19__2 )
            // InternalMyTurtleDsl.g:8416:2: rule__Parallele3__Group_19__1__Impl rule__Parallele3__Group_19__2
            {
            pushFollow(FOLLOW_35);
            rule__Parallele3__Group_19__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_19__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_19__1"


    // $ANTLR start "rule__Parallele3__Group_19__1__Impl"
    // InternalMyTurtleDsl.g:8423:1: rule__Parallele3__Group_19__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_19__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8427:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:8428:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:8428:1: ( '&' )
            // InternalMyTurtleDsl.g:8429:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_19_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_19_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_19__1__Impl"


    // $ANTLR start "rule__Parallele3__Group_19__2"
    // InternalMyTurtleDsl.g:8438:1: rule__Parallele3__Group_19__2 : rule__Parallele3__Group_19__2__Impl rule__Parallele3__Group_19__3 ;
    public final void rule__Parallele3__Group_19__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8442:1: ( rule__Parallele3__Group_19__2__Impl rule__Parallele3__Group_19__3 )
            // InternalMyTurtleDsl.g:8443:2: rule__Parallele3__Group_19__2__Impl rule__Parallele3__Group_19__3
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_19__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_19__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_19__2"


    // $ANTLR start "rule__Parallele3__Group_19__2__Impl"
    // InternalMyTurtleDsl.g:8450:1: rule__Parallele3__Group_19__2__Impl : ( ( rule__Parallele3__BAssignment_19_2 ) ) ;
    public final void rule__Parallele3__Group_19__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8454:1: ( ( ( rule__Parallele3__BAssignment_19_2 ) ) )
            // InternalMyTurtleDsl.g:8455:1: ( ( rule__Parallele3__BAssignment_19_2 ) )
            {
            // InternalMyTurtleDsl.g:8455:1: ( ( rule__Parallele3__BAssignment_19_2 ) )
            // InternalMyTurtleDsl.g:8456:2: ( rule__Parallele3__BAssignment_19_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_19_2()); 
            // InternalMyTurtleDsl.g:8457:2: ( rule__Parallele3__BAssignment_19_2 )
            // InternalMyTurtleDsl.g:8457:3: rule__Parallele3__BAssignment_19_2
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__BAssignment_19_2();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getBAssignment_19_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_19__2__Impl"


    // $ANTLR start "rule__Parallele3__Group_19__3"
    // InternalMyTurtleDsl.g:8465:1: rule__Parallele3__Group_19__3 : rule__Parallele3__Group_19__3__Impl rule__Parallele3__Group_19__4 ;
    public final void rule__Parallele3__Group_19__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8469:1: ( rule__Parallele3__Group_19__3__Impl rule__Parallele3__Group_19__4 )
            // InternalMyTurtleDsl.g:8470:2: rule__Parallele3__Group_19__3__Impl rule__Parallele3__Group_19__4
            {
            pushFollow(FOLLOW_34);
            rule__Parallele3__Group_19__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_19__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_19__3"


    // $ANTLR start "rule__Parallele3__Group_19__3__Impl"
    // InternalMyTurtleDsl.g:8477:1: rule__Parallele3__Group_19__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_19__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8481:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:8482:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:8482:1: ( '&' )
            // InternalMyTurtleDsl.g:8483:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_19_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_19_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_19__3__Impl"


    // $ANTLR start "rule__Parallele3__Group_19__4"
    // InternalMyTurtleDsl.g:8492:1: rule__Parallele3__Group_19__4 : rule__Parallele3__Group_19__4__Impl ;
    public final void rule__Parallele3__Group_19__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8496:1: ( rule__Parallele3__Group_19__4__Impl )
            // InternalMyTurtleDsl.g:8497:2: rule__Parallele3__Group_19__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_19__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_19__4"


    // $ANTLR start "rule__Parallele3__Group_19__4__Impl"
    // InternalMyTurtleDsl.g:8503:1: rule__Parallele3__Group_19__4__Impl : ( ( rule__Parallele3__CAssignment_19_4 ) ) ;
    public final void rule__Parallele3__Group_19__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8507:1: ( ( ( rule__Parallele3__CAssignment_19_4 ) ) )
            // InternalMyTurtleDsl.g:8508:1: ( ( rule__Parallele3__CAssignment_19_4 ) )
            {
            // InternalMyTurtleDsl.g:8508:1: ( ( rule__Parallele3__CAssignment_19_4 ) )
            // InternalMyTurtleDsl.g:8509:2: ( rule__Parallele3__CAssignment_19_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_19_4()); 
            // InternalMyTurtleDsl.g:8510:2: ( rule__Parallele3__CAssignment_19_4 )
            // InternalMyTurtleDsl.g:8510:3: rule__Parallele3__CAssignment_19_4
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__CAssignment_19_4();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getCAssignment_19_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_19__4__Impl"


    // $ANTLR start "rule__Parallele3__Group_20__0"
    // InternalMyTurtleDsl.g:8519:1: rule__Parallele3__Group_20__0 : rule__Parallele3__Group_20__0__Impl rule__Parallele3__Group_20__1 ;
    public final void rule__Parallele3__Group_20__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8523:1: ( rule__Parallele3__Group_20__0__Impl rule__Parallele3__Group_20__1 )
            // InternalMyTurtleDsl.g:8524:2: rule__Parallele3__Group_20__0__Impl rule__Parallele3__Group_20__1
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_20__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_20__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_20__0"


    // $ANTLR start "rule__Parallele3__Group_20__0__Impl"
    // InternalMyTurtleDsl.g:8531:1: rule__Parallele3__Group_20__0__Impl : ( ( rule__Parallele3__AAssignment_20_0 ) ) ;
    public final void rule__Parallele3__Group_20__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8535:1: ( ( ( rule__Parallele3__AAssignment_20_0 ) ) )
            // InternalMyTurtleDsl.g:8536:1: ( ( rule__Parallele3__AAssignment_20_0 ) )
            {
            // InternalMyTurtleDsl.g:8536:1: ( ( rule__Parallele3__AAssignment_20_0 ) )
            // InternalMyTurtleDsl.g:8537:2: ( rule__Parallele3__AAssignment_20_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_20_0()); 
            // InternalMyTurtleDsl.g:8538:2: ( rule__Parallele3__AAssignment_20_0 )
            // InternalMyTurtleDsl.g:8538:3: rule__Parallele3__AAssignment_20_0
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__AAssignment_20_0();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getAAssignment_20_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_20__0__Impl"


    // $ANTLR start "rule__Parallele3__Group_20__1"
    // InternalMyTurtleDsl.g:8546:1: rule__Parallele3__Group_20__1 : rule__Parallele3__Group_20__1__Impl rule__Parallele3__Group_20__2 ;
    public final void rule__Parallele3__Group_20__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8550:1: ( rule__Parallele3__Group_20__1__Impl rule__Parallele3__Group_20__2 )
            // InternalMyTurtleDsl.g:8551:2: rule__Parallele3__Group_20__1__Impl rule__Parallele3__Group_20__2
            {
            pushFollow(FOLLOW_37);
            rule__Parallele3__Group_20__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_20__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_20__1"


    // $ANTLR start "rule__Parallele3__Group_20__1__Impl"
    // InternalMyTurtleDsl.g:8558:1: rule__Parallele3__Group_20__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_20__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8562:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:8563:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:8563:1: ( '&' )
            // InternalMyTurtleDsl.g:8564:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_20_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_20_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_20__1__Impl"


    // $ANTLR start "rule__Parallele3__Group_20__2"
    // InternalMyTurtleDsl.g:8573:1: rule__Parallele3__Group_20__2 : rule__Parallele3__Group_20__2__Impl rule__Parallele3__Group_20__3 ;
    public final void rule__Parallele3__Group_20__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8577:1: ( rule__Parallele3__Group_20__2__Impl rule__Parallele3__Group_20__3 )
            // InternalMyTurtleDsl.g:8578:2: rule__Parallele3__Group_20__2__Impl rule__Parallele3__Group_20__3
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_20__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_20__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_20__2"


    // $ANTLR start "rule__Parallele3__Group_20__2__Impl"
    // InternalMyTurtleDsl.g:8585:1: rule__Parallele3__Group_20__2__Impl : ( ( rule__Parallele3__BAssignment_20_2 ) ) ;
    public final void rule__Parallele3__Group_20__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8589:1: ( ( ( rule__Parallele3__BAssignment_20_2 ) ) )
            // InternalMyTurtleDsl.g:8590:1: ( ( rule__Parallele3__BAssignment_20_2 ) )
            {
            // InternalMyTurtleDsl.g:8590:1: ( ( rule__Parallele3__BAssignment_20_2 ) )
            // InternalMyTurtleDsl.g:8591:2: ( rule__Parallele3__BAssignment_20_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_20_2()); 
            // InternalMyTurtleDsl.g:8592:2: ( rule__Parallele3__BAssignment_20_2 )
            // InternalMyTurtleDsl.g:8592:3: rule__Parallele3__BAssignment_20_2
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__BAssignment_20_2();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getBAssignment_20_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_20__2__Impl"


    // $ANTLR start "rule__Parallele3__Group_20__3"
    // InternalMyTurtleDsl.g:8600:1: rule__Parallele3__Group_20__3 : rule__Parallele3__Group_20__3__Impl rule__Parallele3__Group_20__4 ;
    public final void rule__Parallele3__Group_20__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8604:1: ( rule__Parallele3__Group_20__3__Impl rule__Parallele3__Group_20__4 )
            // InternalMyTurtleDsl.g:8605:2: rule__Parallele3__Group_20__3__Impl rule__Parallele3__Group_20__4
            {
            pushFollow(FOLLOW_35);
            rule__Parallele3__Group_20__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_20__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_20__3"


    // $ANTLR start "rule__Parallele3__Group_20__3__Impl"
    // InternalMyTurtleDsl.g:8612:1: rule__Parallele3__Group_20__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_20__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8616:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:8617:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:8617:1: ( '&' )
            // InternalMyTurtleDsl.g:8618:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_20_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_20_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_20__3__Impl"


    // $ANTLR start "rule__Parallele3__Group_20__4"
    // InternalMyTurtleDsl.g:8627:1: rule__Parallele3__Group_20__4 : rule__Parallele3__Group_20__4__Impl ;
    public final void rule__Parallele3__Group_20__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8631:1: ( rule__Parallele3__Group_20__4__Impl )
            // InternalMyTurtleDsl.g:8632:2: rule__Parallele3__Group_20__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_20__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_20__4"


    // $ANTLR start "rule__Parallele3__Group_20__4__Impl"
    // InternalMyTurtleDsl.g:8638:1: rule__Parallele3__Group_20__4__Impl : ( ( rule__Parallele3__CAssignment_20_4 ) ) ;
    public final void rule__Parallele3__Group_20__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8642:1: ( ( ( rule__Parallele3__CAssignment_20_4 ) ) )
            // InternalMyTurtleDsl.g:8643:1: ( ( rule__Parallele3__CAssignment_20_4 ) )
            {
            // InternalMyTurtleDsl.g:8643:1: ( ( rule__Parallele3__CAssignment_20_4 ) )
            // InternalMyTurtleDsl.g:8644:2: ( rule__Parallele3__CAssignment_20_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_20_4()); 
            // InternalMyTurtleDsl.g:8645:2: ( rule__Parallele3__CAssignment_20_4 )
            // InternalMyTurtleDsl.g:8645:3: rule__Parallele3__CAssignment_20_4
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__CAssignment_20_4();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getCAssignment_20_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_20__4__Impl"


    // $ANTLR start "rule__Parallele3__Group_21__0"
    // InternalMyTurtleDsl.g:8654:1: rule__Parallele3__Group_21__0 : rule__Parallele3__Group_21__0__Impl rule__Parallele3__Group_21__1 ;
    public final void rule__Parallele3__Group_21__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8658:1: ( rule__Parallele3__Group_21__0__Impl rule__Parallele3__Group_21__1 )
            // InternalMyTurtleDsl.g:8659:2: rule__Parallele3__Group_21__0__Impl rule__Parallele3__Group_21__1
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_21__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_21__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_21__0"


    // $ANTLR start "rule__Parallele3__Group_21__0__Impl"
    // InternalMyTurtleDsl.g:8666:1: rule__Parallele3__Group_21__0__Impl : ( ( rule__Parallele3__AAssignment_21_0 ) ) ;
    public final void rule__Parallele3__Group_21__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8670:1: ( ( ( rule__Parallele3__AAssignment_21_0 ) ) )
            // InternalMyTurtleDsl.g:8671:1: ( ( rule__Parallele3__AAssignment_21_0 ) )
            {
            // InternalMyTurtleDsl.g:8671:1: ( ( rule__Parallele3__AAssignment_21_0 ) )
            // InternalMyTurtleDsl.g:8672:2: ( rule__Parallele3__AAssignment_21_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_21_0()); 
            // InternalMyTurtleDsl.g:8673:2: ( rule__Parallele3__AAssignment_21_0 )
            // InternalMyTurtleDsl.g:8673:3: rule__Parallele3__AAssignment_21_0
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__AAssignment_21_0();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getAAssignment_21_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_21__0__Impl"


    // $ANTLR start "rule__Parallele3__Group_21__1"
    // InternalMyTurtleDsl.g:8681:1: rule__Parallele3__Group_21__1 : rule__Parallele3__Group_21__1__Impl rule__Parallele3__Group_21__2 ;
    public final void rule__Parallele3__Group_21__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8685:1: ( rule__Parallele3__Group_21__1__Impl rule__Parallele3__Group_21__2 )
            // InternalMyTurtleDsl.g:8686:2: rule__Parallele3__Group_21__1__Impl rule__Parallele3__Group_21__2
            {
            pushFollow(FOLLOW_37);
            rule__Parallele3__Group_21__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_21__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_21__1"


    // $ANTLR start "rule__Parallele3__Group_21__1__Impl"
    // InternalMyTurtleDsl.g:8693:1: rule__Parallele3__Group_21__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_21__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8697:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:8698:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:8698:1: ( '&' )
            // InternalMyTurtleDsl.g:8699:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_21_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_21_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_21__1__Impl"


    // $ANTLR start "rule__Parallele3__Group_21__2"
    // InternalMyTurtleDsl.g:8708:1: rule__Parallele3__Group_21__2 : rule__Parallele3__Group_21__2__Impl rule__Parallele3__Group_21__3 ;
    public final void rule__Parallele3__Group_21__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8712:1: ( rule__Parallele3__Group_21__2__Impl rule__Parallele3__Group_21__3 )
            // InternalMyTurtleDsl.g:8713:2: rule__Parallele3__Group_21__2__Impl rule__Parallele3__Group_21__3
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_21__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_21__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_21__2"


    // $ANTLR start "rule__Parallele3__Group_21__2__Impl"
    // InternalMyTurtleDsl.g:8720:1: rule__Parallele3__Group_21__2__Impl : ( ( rule__Parallele3__BAssignment_21_2 ) ) ;
    public final void rule__Parallele3__Group_21__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8724:1: ( ( ( rule__Parallele3__BAssignment_21_2 ) ) )
            // InternalMyTurtleDsl.g:8725:1: ( ( rule__Parallele3__BAssignment_21_2 ) )
            {
            // InternalMyTurtleDsl.g:8725:1: ( ( rule__Parallele3__BAssignment_21_2 ) )
            // InternalMyTurtleDsl.g:8726:2: ( rule__Parallele3__BAssignment_21_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_21_2()); 
            // InternalMyTurtleDsl.g:8727:2: ( rule__Parallele3__BAssignment_21_2 )
            // InternalMyTurtleDsl.g:8727:3: rule__Parallele3__BAssignment_21_2
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__BAssignment_21_2();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getBAssignment_21_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_21__2__Impl"


    // $ANTLR start "rule__Parallele3__Group_21__3"
    // InternalMyTurtleDsl.g:8735:1: rule__Parallele3__Group_21__3 : rule__Parallele3__Group_21__3__Impl rule__Parallele3__Group_21__4 ;
    public final void rule__Parallele3__Group_21__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8739:1: ( rule__Parallele3__Group_21__3__Impl rule__Parallele3__Group_21__4 )
            // InternalMyTurtleDsl.g:8740:2: rule__Parallele3__Group_21__3__Impl rule__Parallele3__Group_21__4
            {
            pushFollow(FOLLOW_34);
            rule__Parallele3__Group_21__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_21__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_21__3"


    // $ANTLR start "rule__Parallele3__Group_21__3__Impl"
    // InternalMyTurtleDsl.g:8747:1: rule__Parallele3__Group_21__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_21__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8751:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:8752:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:8752:1: ( '&' )
            // InternalMyTurtleDsl.g:8753:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_21_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_21_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_21__3__Impl"


    // $ANTLR start "rule__Parallele3__Group_21__4"
    // InternalMyTurtleDsl.g:8762:1: rule__Parallele3__Group_21__4 : rule__Parallele3__Group_21__4__Impl ;
    public final void rule__Parallele3__Group_21__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8766:1: ( rule__Parallele3__Group_21__4__Impl )
            // InternalMyTurtleDsl.g:8767:2: rule__Parallele3__Group_21__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_21__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_21__4"


    // $ANTLR start "rule__Parallele3__Group_21__4__Impl"
    // InternalMyTurtleDsl.g:8773:1: rule__Parallele3__Group_21__4__Impl : ( ( rule__Parallele3__CAssignment_21_4 ) ) ;
    public final void rule__Parallele3__Group_21__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8777:1: ( ( ( rule__Parallele3__CAssignment_21_4 ) ) )
            // InternalMyTurtleDsl.g:8778:1: ( ( rule__Parallele3__CAssignment_21_4 ) )
            {
            // InternalMyTurtleDsl.g:8778:1: ( ( rule__Parallele3__CAssignment_21_4 ) )
            // InternalMyTurtleDsl.g:8779:2: ( rule__Parallele3__CAssignment_21_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_21_4()); 
            // InternalMyTurtleDsl.g:8780:2: ( rule__Parallele3__CAssignment_21_4 )
            // InternalMyTurtleDsl.g:8780:3: rule__Parallele3__CAssignment_21_4
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__CAssignment_21_4();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getCAssignment_21_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_21__4__Impl"


    // $ANTLR start "rule__Parallele3__Group_22__0"
    // InternalMyTurtleDsl.g:8789:1: rule__Parallele3__Group_22__0 : rule__Parallele3__Group_22__0__Impl rule__Parallele3__Group_22__1 ;
    public final void rule__Parallele3__Group_22__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8793:1: ( rule__Parallele3__Group_22__0__Impl rule__Parallele3__Group_22__1 )
            // InternalMyTurtleDsl.g:8794:2: rule__Parallele3__Group_22__0__Impl rule__Parallele3__Group_22__1
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_22__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_22__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_22__0"


    // $ANTLR start "rule__Parallele3__Group_22__0__Impl"
    // InternalMyTurtleDsl.g:8801:1: rule__Parallele3__Group_22__0__Impl : ( ( rule__Parallele3__AAssignment_22_0 ) ) ;
    public final void rule__Parallele3__Group_22__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8805:1: ( ( ( rule__Parallele3__AAssignment_22_0 ) ) )
            // InternalMyTurtleDsl.g:8806:1: ( ( rule__Parallele3__AAssignment_22_0 ) )
            {
            // InternalMyTurtleDsl.g:8806:1: ( ( rule__Parallele3__AAssignment_22_0 ) )
            // InternalMyTurtleDsl.g:8807:2: ( rule__Parallele3__AAssignment_22_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_22_0()); 
            // InternalMyTurtleDsl.g:8808:2: ( rule__Parallele3__AAssignment_22_0 )
            // InternalMyTurtleDsl.g:8808:3: rule__Parallele3__AAssignment_22_0
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__AAssignment_22_0();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getAAssignment_22_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_22__0__Impl"


    // $ANTLR start "rule__Parallele3__Group_22__1"
    // InternalMyTurtleDsl.g:8816:1: rule__Parallele3__Group_22__1 : rule__Parallele3__Group_22__1__Impl rule__Parallele3__Group_22__2 ;
    public final void rule__Parallele3__Group_22__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8820:1: ( rule__Parallele3__Group_22__1__Impl rule__Parallele3__Group_22__2 )
            // InternalMyTurtleDsl.g:8821:2: rule__Parallele3__Group_22__1__Impl rule__Parallele3__Group_22__2
            {
            pushFollow(FOLLOW_34);
            rule__Parallele3__Group_22__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_22__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_22__1"


    // $ANTLR start "rule__Parallele3__Group_22__1__Impl"
    // InternalMyTurtleDsl.g:8828:1: rule__Parallele3__Group_22__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_22__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8832:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:8833:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:8833:1: ( '&' )
            // InternalMyTurtleDsl.g:8834:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_22_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_22_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_22__1__Impl"


    // $ANTLR start "rule__Parallele3__Group_22__2"
    // InternalMyTurtleDsl.g:8843:1: rule__Parallele3__Group_22__2 : rule__Parallele3__Group_22__2__Impl rule__Parallele3__Group_22__3 ;
    public final void rule__Parallele3__Group_22__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8847:1: ( rule__Parallele3__Group_22__2__Impl rule__Parallele3__Group_22__3 )
            // InternalMyTurtleDsl.g:8848:2: rule__Parallele3__Group_22__2__Impl rule__Parallele3__Group_22__3
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_22__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_22__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_22__2"


    // $ANTLR start "rule__Parallele3__Group_22__2__Impl"
    // InternalMyTurtleDsl.g:8855:1: rule__Parallele3__Group_22__2__Impl : ( ( rule__Parallele3__BAssignment_22_2 ) ) ;
    public final void rule__Parallele3__Group_22__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8859:1: ( ( ( rule__Parallele3__BAssignment_22_2 ) ) )
            // InternalMyTurtleDsl.g:8860:1: ( ( rule__Parallele3__BAssignment_22_2 ) )
            {
            // InternalMyTurtleDsl.g:8860:1: ( ( rule__Parallele3__BAssignment_22_2 ) )
            // InternalMyTurtleDsl.g:8861:2: ( rule__Parallele3__BAssignment_22_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_22_2()); 
            // InternalMyTurtleDsl.g:8862:2: ( rule__Parallele3__BAssignment_22_2 )
            // InternalMyTurtleDsl.g:8862:3: rule__Parallele3__BAssignment_22_2
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__BAssignment_22_2();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getBAssignment_22_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_22__2__Impl"


    // $ANTLR start "rule__Parallele3__Group_22__3"
    // InternalMyTurtleDsl.g:8870:1: rule__Parallele3__Group_22__3 : rule__Parallele3__Group_22__3__Impl rule__Parallele3__Group_22__4 ;
    public final void rule__Parallele3__Group_22__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8874:1: ( rule__Parallele3__Group_22__3__Impl rule__Parallele3__Group_22__4 )
            // InternalMyTurtleDsl.g:8875:2: rule__Parallele3__Group_22__3__Impl rule__Parallele3__Group_22__4
            {
            pushFollow(FOLLOW_37);
            rule__Parallele3__Group_22__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_22__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_22__3"


    // $ANTLR start "rule__Parallele3__Group_22__3__Impl"
    // InternalMyTurtleDsl.g:8882:1: rule__Parallele3__Group_22__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_22__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8886:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:8887:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:8887:1: ( '&' )
            // InternalMyTurtleDsl.g:8888:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_22_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_22_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_22__3__Impl"


    // $ANTLR start "rule__Parallele3__Group_22__4"
    // InternalMyTurtleDsl.g:8897:1: rule__Parallele3__Group_22__4 : rule__Parallele3__Group_22__4__Impl ;
    public final void rule__Parallele3__Group_22__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8901:1: ( rule__Parallele3__Group_22__4__Impl )
            // InternalMyTurtleDsl.g:8902:2: rule__Parallele3__Group_22__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_22__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_22__4"


    // $ANTLR start "rule__Parallele3__Group_22__4__Impl"
    // InternalMyTurtleDsl.g:8908:1: rule__Parallele3__Group_22__4__Impl : ( ( rule__Parallele3__CAssignment_22_4 ) ) ;
    public final void rule__Parallele3__Group_22__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8912:1: ( ( ( rule__Parallele3__CAssignment_22_4 ) ) )
            // InternalMyTurtleDsl.g:8913:1: ( ( rule__Parallele3__CAssignment_22_4 ) )
            {
            // InternalMyTurtleDsl.g:8913:1: ( ( rule__Parallele3__CAssignment_22_4 ) )
            // InternalMyTurtleDsl.g:8914:2: ( rule__Parallele3__CAssignment_22_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_22_4()); 
            // InternalMyTurtleDsl.g:8915:2: ( rule__Parallele3__CAssignment_22_4 )
            // InternalMyTurtleDsl.g:8915:3: rule__Parallele3__CAssignment_22_4
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__CAssignment_22_4();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getCAssignment_22_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_22__4__Impl"


    // $ANTLR start "rule__Parallele3__Group_23__0"
    // InternalMyTurtleDsl.g:8924:1: rule__Parallele3__Group_23__0 : rule__Parallele3__Group_23__0__Impl rule__Parallele3__Group_23__1 ;
    public final void rule__Parallele3__Group_23__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8928:1: ( rule__Parallele3__Group_23__0__Impl rule__Parallele3__Group_23__1 )
            // InternalMyTurtleDsl.g:8929:2: rule__Parallele3__Group_23__0__Impl rule__Parallele3__Group_23__1
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_23__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_23__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_23__0"


    // $ANTLR start "rule__Parallele3__Group_23__0__Impl"
    // InternalMyTurtleDsl.g:8936:1: rule__Parallele3__Group_23__0__Impl : ( ( rule__Parallele3__AAssignment_23_0 ) ) ;
    public final void rule__Parallele3__Group_23__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8940:1: ( ( ( rule__Parallele3__AAssignment_23_0 ) ) )
            // InternalMyTurtleDsl.g:8941:1: ( ( rule__Parallele3__AAssignment_23_0 ) )
            {
            // InternalMyTurtleDsl.g:8941:1: ( ( rule__Parallele3__AAssignment_23_0 ) )
            // InternalMyTurtleDsl.g:8942:2: ( rule__Parallele3__AAssignment_23_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_23_0()); 
            // InternalMyTurtleDsl.g:8943:2: ( rule__Parallele3__AAssignment_23_0 )
            // InternalMyTurtleDsl.g:8943:3: rule__Parallele3__AAssignment_23_0
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__AAssignment_23_0();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getAAssignment_23_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_23__0__Impl"


    // $ANTLR start "rule__Parallele3__Group_23__1"
    // InternalMyTurtleDsl.g:8951:1: rule__Parallele3__Group_23__1 : rule__Parallele3__Group_23__1__Impl rule__Parallele3__Group_23__2 ;
    public final void rule__Parallele3__Group_23__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8955:1: ( rule__Parallele3__Group_23__1__Impl rule__Parallele3__Group_23__2 )
            // InternalMyTurtleDsl.g:8956:2: rule__Parallele3__Group_23__1__Impl rule__Parallele3__Group_23__2
            {
            pushFollow(FOLLOW_34);
            rule__Parallele3__Group_23__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_23__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_23__1"


    // $ANTLR start "rule__Parallele3__Group_23__1__Impl"
    // InternalMyTurtleDsl.g:8963:1: rule__Parallele3__Group_23__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_23__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8967:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:8968:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:8968:1: ( '&' )
            // InternalMyTurtleDsl.g:8969:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_23_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_23_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_23__1__Impl"


    // $ANTLR start "rule__Parallele3__Group_23__2"
    // InternalMyTurtleDsl.g:8978:1: rule__Parallele3__Group_23__2 : rule__Parallele3__Group_23__2__Impl rule__Parallele3__Group_23__3 ;
    public final void rule__Parallele3__Group_23__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8982:1: ( rule__Parallele3__Group_23__2__Impl rule__Parallele3__Group_23__3 )
            // InternalMyTurtleDsl.g:8983:2: rule__Parallele3__Group_23__2__Impl rule__Parallele3__Group_23__3
            {
            pushFollow(FOLLOW_33);
            rule__Parallele3__Group_23__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_23__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_23__2"


    // $ANTLR start "rule__Parallele3__Group_23__2__Impl"
    // InternalMyTurtleDsl.g:8990:1: rule__Parallele3__Group_23__2__Impl : ( ( rule__Parallele3__BAssignment_23_2 ) ) ;
    public final void rule__Parallele3__Group_23__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8994:1: ( ( ( rule__Parallele3__BAssignment_23_2 ) ) )
            // InternalMyTurtleDsl.g:8995:1: ( ( rule__Parallele3__BAssignment_23_2 ) )
            {
            // InternalMyTurtleDsl.g:8995:1: ( ( rule__Parallele3__BAssignment_23_2 ) )
            // InternalMyTurtleDsl.g:8996:2: ( rule__Parallele3__BAssignment_23_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_23_2()); 
            // InternalMyTurtleDsl.g:8997:2: ( rule__Parallele3__BAssignment_23_2 )
            // InternalMyTurtleDsl.g:8997:3: rule__Parallele3__BAssignment_23_2
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__BAssignment_23_2();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getBAssignment_23_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_23__2__Impl"


    // $ANTLR start "rule__Parallele3__Group_23__3"
    // InternalMyTurtleDsl.g:9005:1: rule__Parallele3__Group_23__3 : rule__Parallele3__Group_23__3__Impl rule__Parallele3__Group_23__4 ;
    public final void rule__Parallele3__Group_23__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9009:1: ( rule__Parallele3__Group_23__3__Impl rule__Parallele3__Group_23__4 )
            // InternalMyTurtleDsl.g:9010:2: rule__Parallele3__Group_23__3__Impl rule__Parallele3__Group_23__4
            {
            pushFollow(FOLLOW_35);
            rule__Parallele3__Group_23__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_23__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_23__3"


    // $ANTLR start "rule__Parallele3__Group_23__3__Impl"
    // InternalMyTurtleDsl.g:9017:1: rule__Parallele3__Group_23__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_23__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9021:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:9022:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:9022:1: ( '&' )
            // InternalMyTurtleDsl.g:9023:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_23_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getParallele3Access().getAmpersandKeyword_23_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_23__3__Impl"


    // $ANTLR start "rule__Parallele3__Group_23__4"
    // InternalMyTurtleDsl.g:9032:1: rule__Parallele3__Group_23__4 : rule__Parallele3__Group_23__4__Impl ;
    public final void rule__Parallele3__Group_23__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9036:1: ( rule__Parallele3__Group_23__4__Impl )
            // InternalMyTurtleDsl.g:9037:2: rule__Parallele3__Group_23__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__Group_23__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_23__4"


    // $ANTLR start "rule__Parallele3__Group_23__4__Impl"
    // InternalMyTurtleDsl.g:9043:1: rule__Parallele3__Group_23__4__Impl : ( ( rule__Parallele3__CAssignment_23_4 ) ) ;
    public final void rule__Parallele3__Group_23__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9047:1: ( ( ( rule__Parallele3__CAssignment_23_4 ) ) )
            // InternalMyTurtleDsl.g:9048:1: ( ( rule__Parallele3__CAssignment_23_4 ) )
            {
            // InternalMyTurtleDsl.g:9048:1: ( ( rule__Parallele3__CAssignment_23_4 ) )
            // InternalMyTurtleDsl.g:9049:2: ( rule__Parallele3__CAssignment_23_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_23_4()); 
            // InternalMyTurtleDsl.g:9050:2: ( rule__Parallele3__CAssignment_23_4 )
            // InternalMyTurtleDsl.g:9050:3: rule__Parallele3__CAssignment_23_4
            {
            pushFollow(FOLLOW_2);
            rule__Parallele3__CAssignment_23_4();

            state._fsp--;


            }

             after(grammarAccess.getParallele3Access().getCAssignment_23_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__Group_23__4__Impl"


    // $ANTLR start "rule__Model__IncludesAssignment_0"
    // InternalMyTurtleDsl.g:9059:1: rule__Model__IncludesAssignment_0 : ( ruleIncludes ) ;
    public final void rule__Model__IncludesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9063:1: ( ( ruleIncludes ) )
            // InternalMyTurtleDsl.g:9064:2: ( ruleIncludes )
            {
            // InternalMyTurtleDsl.g:9064:2: ( ruleIncludes )
            // InternalMyTurtleDsl.g:9065:3: ruleIncludes
            {
             before(grammarAccess.getModelAccess().getIncludesIncludesParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleIncludes();

            state._fsp--;

             after(grammarAccess.getModelAccess().getIncludesIncludesParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__IncludesAssignment_0"


    // $ANTLR start "rule__Model__PvhmAssignment_7"
    // InternalMyTurtleDsl.g:9074:1: rule__Model__PvhmAssignment_7 : ( rulePourcent_vitesse_hauteur_max ) ;
    public final void rule__Model__PvhmAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9078:1: ( ( rulePourcent_vitesse_hauteur_max ) )
            // InternalMyTurtleDsl.g:9079:2: ( rulePourcent_vitesse_hauteur_max )
            {
            // InternalMyTurtleDsl.g:9079:2: ( rulePourcent_vitesse_hauteur_max )
            // InternalMyTurtleDsl.g:9080:3: rulePourcent_vitesse_hauteur_max
            {
             before(grammarAccess.getModelAccess().getPvhmPourcent_vitesse_hauteur_maxParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            rulePourcent_vitesse_hauteur_max();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPvhmPourcent_vitesse_hauteur_maxParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PvhmAssignment_7"


    // $ANTLR start "rule__Model__PvdmAssignment_9"
    // InternalMyTurtleDsl.g:9089:1: rule__Model__PvdmAssignment_9 : ( rulePourcent_vitesse_deplacement_max ) ;
    public final void rule__Model__PvdmAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9093:1: ( ( rulePourcent_vitesse_deplacement_max ) )
            // InternalMyTurtleDsl.g:9094:2: ( rulePourcent_vitesse_deplacement_max )
            {
            // InternalMyTurtleDsl.g:9094:2: ( rulePourcent_vitesse_deplacement_max )
            // InternalMyTurtleDsl.g:9095:3: rulePourcent_vitesse_deplacement_max
            {
             before(grammarAccess.getModelAccess().getPvdmPourcent_vitesse_deplacement_maxParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            rulePourcent_vitesse_deplacement_max();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPvdmPourcent_vitesse_deplacement_maxParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PvdmAssignment_9"


    // $ANTLR start "rule__Model__PvrmAssignment_11"
    // InternalMyTurtleDsl.g:9104:1: rule__Model__PvrmAssignment_11 : ( rulePourcent_vitesse_rotation_max ) ;
    public final void rule__Model__PvrmAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9108:1: ( ( rulePourcent_vitesse_rotation_max ) )
            // InternalMyTurtleDsl.g:9109:2: ( rulePourcent_vitesse_rotation_max )
            {
            // InternalMyTurtleDsl.g:9109:2: ( rulePourcent_vitesse_rotation_max )
            // InternalMyTurtleDsl.g:9110:3: rulePourcent_vitesse_rotation_max
            {
             before(grammarAccess.getModelAccess().getPvrmPourcent_vitesse_rotation_maxParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            rulePourcent_vitesse_rotation_max();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPvrmPourcent_vitesse_rotation_maxParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PvrmAssignment_11"


    // $ANTLR start "rule__Model__HmAssignment_13"
    // InternalMyTurtleDsl.g:9119:1: rule__Model__HmAssignment_13 : ( ruleHauteur_max ) ;
    public final void rule__Model__HmAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9123:1: ( ( ruleHauteur_max ) )
            // InternalMyTurtleDsl.g:9124:2: ( ruleHauteur_max )
            {
            // InternalMyTurtleDsl.g:9124:2: ( ruleHauteur_max )
            // InternalMyTurtleDsl.g:9125:3: ruleHauteur_max
            {
             before(grammarAccess.getModelAccess().getHmHauteur_maxParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleHauteur_max();

            state._fsp--;

             after(grammarAccess.getModelAccess().getHmHauteur_maxParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__HmAssignment_13"


    // $ANTLR start "rule__Model__EmAssignment_15"
    // InternalMyTurtleDsl.g:9134:1: rule__Model__EmAssignment_15 : ( ruleEloignement_max ) ;
    public final void rule__Model__EmAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9138:1: ( ( ruleEloignement_max ) )
            // InternalMyTurtleDsl.g:9139:2: ( ruleEloignement_max )
            {
            // InternalMyTurtleDsl.g:9139:2: ( ruleEloignement_max )
            // InternalMyTurtleDsl.g:9140:3: ruleEloignement_max
            {
             before(grammarAccess.getModelAccess().getEmEloignement_maxParserRuleCall_15_0()); 
            pushFollow(FOLLOW_2);
            ruleEloignement_max();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEmEloignement_maxParserRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__EmAssignment_15"


    // $ANTLR start "rule__Model__SeconDecAssignment_20_0"
    // InternalMyTurtleDsl.g:9149:1: rule__Model__SeconDecAssignment_20_0 : ( ruleIntDecl ) ;
    public final void rule__Model__SeconDecAssignment_20_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9153:1: ( ( ruleIntDecl ) )
            // InternalMyTurtleDsl.g:9154:2: ( ruleIntDecl )
            {
            // InternalMyTurtleDsl.g:9154:2: ( ruleIntDecl )
            // InternalMyTurtleDsl.g:9155:3: ruleIntDecl
            {
             before(grammarAccess.getModelAccess().getSeconDecIntDeclParserRuleCall_20_0_0()); 
            pushFollow(FOLLOW_2);
            ruleIntDecl();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSeconDecIntDeclParserRuleCall_20_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__SeconDecAssignment_20_0"


    // $ANTLR start "rule__Model__PourDecAssignment_20_1"
    // InternalMyTurtleDsl.g:9164:1: rule__Model__PourDecAssignment_20_1 : ( rulePourcentDecl ) ;
    public final void rule__Model__PourDecAssignment_20_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9168:1: ( ( rulePourcentDecl ) )
            // InternalMyTurtleDsl.g:9169:2: ( rulePourcentDecl )
            {
            // InternalMyTurtleDsl.g:9169:2: ( rulePourcentDecl )
            // InternalMyTurtleDsl.g:9170:3: rulePourcentDecl
            {
             before(grammarAccess.getModelAccess().getPourDecPourcentDeclParserRuleCall_20_1_0()); 
            pushFollow(FOLLOW_2);
            rulePourcentDecl();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPourDecPourcentDeclParserRuleCall_20_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PourDecAssignment_20_1"


    // $ANTLR start "rule__Model__StatementsAssignment_20_2"
    // InternalMyTurtleDsl.g:9179:1: rule__Model__StatementsAssignment_20_2 : ( ruleStatement ) ;
    public final void rule__Model__StatementsAssignment_20_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9183:1: ( ( ruleStatement ) )
            // InternalMyTurtleDsl.g:9184:2: ( ruleStatement )
            {
            // InternalMyTurtleDsl.g:9184:2: ( ruleStatement )
            // InternalMyTurtleDsl.g:9185:3: ruleStatement
            {
             before(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_20_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_20_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__StatementsAssignment_20_2"


    // $ANTLR start "rule__Model__FonctionsAssignment_20_3"
    // InternalMyTurtleDsl.g:9194:1: rule__Model__FonctionsAssignment_20_3 : ( ruleFonctionCall ) ;
    public final void rule__Model__FonctionsAssignment_20_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9198:1: ( ( ruleFonctionCall ) )
            // InternalMyTurtleDsl.g:9199:2: ( ruleFonctionCall )
            {
            // InternalMyTurtleDsl.g:9199:2: ( ruleFonctionCall )
            // InternalMyTurtleDsl.g:9200:3: ruleFonctionCall
            {
             before(grammarAccess.getModelAccess().getFonctionsFonctionCallParserRuleCall_20_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFonctionCall();

            state._fsp--;

             after(grammarAccess.getModelAccess().getFonctionsFonctionCallParserRuleCall_20_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__FonctionsAssignment_20_3"


    // $ANTLR start "rule__Model__ParalleleAssignment_20_4"
    // InternalMyTurtleDsl.g:9209:1: rule__Model__ParalleleAssignment_20_4 : ( ( rule__Model__ParalleleAlternatives_20_4_0 ) ) ;
    public final void rule__Model__ParalleleAssignment_20_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9213:1: ( ( ( rule__Model__ParalleleAlternatives_20_4_0 ) ) )
            // InternalMyTurtleDsl.g:9214:2: ( ( rule__Model__ParalleleAlternatives_20_4_0 ) )
            {
            // InternalMyTurtleDsl.g:9214:2: ( ( rule__Model__ParalleleAlternatives_20_4_0 ) )
            // InternalMyTurtleDsl.g:9215:3: ( rule__Model__ParalleleAlternatives_20_4_0 )
            {
             before(grammarAccess.getModelAccess().getParalleleAlternatives_20_4_0()); 
            // InternalMyTurtleDsl.g:9216:3: ( rule__Model__ParalleleAlternatives_20_4_0 )
            // InternalMyTurtleDsl.g:9216:4: rule__Model__ParalleleAlternatives_20_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__ParalleleAlternatives_20_4_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getParalleleAlternatives_20_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ParalleleAssignment_20_4"


    // $ANTLR start "rule__Model__FonctionsAssignment_26"
    // InternalMyTurtleDsl.g:9224:1: rule__Model__FonctionsAssignment_26 : ( ruleFonctionDecl ) ;
    public final void rule__Model__FonctionsAssignment_26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9228:1: ( ( ruleFonctionDecl ) )
            // InternalMyTurtleDsl.g:9229:2: ( ruleFonctionDecl )
            {
            // InternalMyTurtleDsl.g:9229:2: ( ruleFonctionDecl )
            // InternalMyTurtleDsl.g:9230:3: ruleFonctionDecl
            {
             before(grammarAccess.getModelAccess().getFonctionsFonctionDeclParserRuleCall_26_0()); 
            pushFollow(FOLLOW_2);
            ruleFonctionDecl();

            state._fsp--;

             after(grammarAccess.getModelAccess().getFonctionsFonctionDeclParserRuleCall_26_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__FonctionsAssignment_26"


    // $ANTLR start "rule__Includes__ImportURIAssignment_2"
    // InternalMyTurtleDsl.g:9239:1: rule__Includes__ImportURIAssignment_2 : ( RULE_INCLUDE ) ;
    public final void rule__Includes__ImportURIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9243:1: ( ( RULE_INCLUDE ) )
            // InternalMyTurtleDsl.g:9244:2: ( RULE_INCLUDE )
            {
            // InternalMyTurtleDsl.g:9244:2: ( RULE_INCLUDE )
            // InternalMyTurtleDsl.g:9245:3: RULE_INCLUDE
            {
             before(grammarAccess.getIncludesAccess().getImportURIINCLUDETerminalRuleCall_2_0()); 
            match(input,RULE_INCLUDE,FOLLOW_2); 
             after(grammarAccess.getIncludesAccess().getImportURIINCLUDETerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__ImportURIAssignment_2"


    // $ANTLR start "rule__Pourcent_vitesse_hauteur_max__Vitesse_verticaleAssignment_2"
    // InternalMyTurtleDsl.g:9254:1: rule__Pourcent_vitesse_hauteur_max__Vitesse_verticaleAssignment_2 : ( ruleIntExp ) ;
    public final void rule__Pourcent_vitesse_hauteur_max__Vitesse_verticaleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9258:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9259:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9259:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9260:3: ruleIntExp
            {
             before(grammarAccess.getPourcent_vitesse_hauteur_maxAccess().getVitesse_verticaleIntExpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleIntExp();

            state._fsp--;

             after(grammarAccess.getPourcent_vitesse_hauteur_maxAccess().getVitesse_verticaleIntExpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pourcent_vitesse_hauteur_max__Vitesse_verticaleAssignment_2"


    // $ANTLR start "rule__Pourcent_vitesse_deplacement_max__Vitesse_deplacementAssignment_2"
    // InternalMyTurtleDsl.g:9269:1: rule__Pourcent_vitesse_deplacement_max__Vitesse_deplacementAssignment_2 : ( ruleIntExp ) ;
    public final void rule__Pourcent_vitesse_deplacement_max__Vitesse_deplacementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9273:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9274:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9274:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9275:3: ruleIntExp
            {
             before(grammarAccess.getPourcent_vitesse_deplacement_maxAccess().getVitesse_deplacementIntExpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleIntExp();

            state._fsp--;

             after(grammarAccess.getPourcent_vitesse_deplacement_maxAccess().getVitesse_deplacementIntExpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pourcent_vitesse_deplacement_max__Vitesse_deplacementAssignment_2"


    // $ANTLR start "rule__Pourcent_vitesse_rotation_max__Vitesse_deplacementAssignment_2"
    // InternalMyTurtleDsl.g:9284:1: rule__Pourcent_vitesse_rotation_max__Vitesse_deplacementAssignment_2 : ( ruleIntExp ) ;
    public final void rule__Pourcent_vitesse_rotation_max__Vitesse_deplacementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9288:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9289:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9289:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9290:3: ruleIntExp
            {
             before(grammarAccess.getPourcent_vitesse_rotation_maxAccess().getVitesse_deplacementIntExpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleIntExp();

            state._fsp--;

             after(grammarAccess.getPourcent_vitesse_rotation_maxAccess().getVitesse_deplacementIntExpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pourcent_vitesse_rotation_max__Vitesse_deplacementAssignment_2"


    // $ANTLR start "rule__Hauteur_max__Hauteur_maxAssignment_2"
    // InternalMyTurtleDsl.g:9299:1: rule__Hauteur_max__Hauteur_maxAssignment_2 : ( ruleIntExp ) ;
    public final void rule__Hauteur_max__Hauteur_maxAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9303:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9304:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9304:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9305:3: ruleIntExp
            {
             before(grammarAccess.getHauteur_maxAccess().getHauteur_maxIntExpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleIntExp();

            state._fsp--;

             after(grammarAccess.getHauteur_maxAccess().getHauteur_maxIntExpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hauteur_max__Hauteur_maxAssignment_2"


    // $ANTLR start "rule__Eloignement_max__Hauteur_maxAssignment_2"
    // InternalMyTurtleDsl.g:9314:1: rule__Eloignement_max__Hauteur_maxAssignment_2 : ( ruleIntExp ) ;
    public final void rule__Eloignement_max__Hauteur_maxAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9318:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9319:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9319:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9320:3: ruleIntExp
            {
             before(grammarAccess.getEloignement_maxAccess().getHauteur_maxIntExpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleIntExp();

            state._fsp--;

             after(grammarAccess.getEloignement_maxAccess().getHauteur_maxIntExpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eloignement_max__Hauteur_maxAssignment_2"


    // $ANTLR start "rule__Monter__DureeAssignment_2"
    // InternalMyTurtleDsl.g:9329:1: rule__Monter__DureeAssignment_2 : ( ruleIntExp ) ;
    public final void rule__Monter__DureeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9333:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9334:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9334:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9335:3: ruleIntExp
            {
             before(grammarAccess.getMonterAccess().getDureeIntExpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleIntExp();

            state._fsp--;

             after(grammarAccess.getMonterAccess().getDureeIntExpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monter__DureeAssignment_2"


    // $ANTLR start "rule__Monter__Vitesse_verticaleAssignment_4"
    // InternalMyTurtleDsl.g:9344:1: rule__Monter__Vitesse_verticaleAssignment_4 : ( ruleIntExp ) ;
    public final void rule__Monter__Vitesse_verticaleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9348:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9349:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9349:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9350:3: ruleIntExp
            {
             before(grammarAccess.getMonterAccess().getVitesse_verticaleIntExpParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleIntExp();

            state._fsp--;

             after(grammarAccess.getMonterAccess().getVitesse_verticaleIntExpParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monter__Vitesse_verticaleAssignment_4"


    // $ANTLR start "rule__Descendre__DureeAssignment_2"
    // InternalMyTurtleDsl.g:9359:1: rule__Descendre__DureeAssignment_2 : ( ruleIntExp ) ;
    public final void rule__Descendre__DureeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9363:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9364:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9364:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9365:3: ruleIntExp
            {
             before(grammarAccess.getDescendreAccess().getDureeIntExpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleIntExp();

            state._fsp--;

             after(grammarAccess.getDescendreAccess().getDureeIntExpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Descendre__DureeAssignment_2"


    // $ANTLR start "rule__Descendre__Vitesse_verticaleAssignment_4"
    // InternalMyTurtleDsl.g:9374:1: rule__Descendre__Vitesse_verticaleAssignment_4 : ( ruleIntExp ) ;
    public final void rule__Descendre__Vitesse_verticaleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9378:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9379:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9379:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9380:3: ruleIntExp
            {
             before(grammarAccess.getDescendreAccess().getVitesse_verticaleIntExpParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleIntExp();

            state._fsp--;

             after(grammarAccess.getDescendreAccess().getVitesse_verticaleIntExpParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Descendre__Vitesse_verticaleAssignment_4"


    // $ANTLR start "rule__Avancer__DureeAssignment_2"
    // InternalMyTurtleDsl.g:9389:1: rule__Avancer__DureeAssignment_2 : ( ruleIntExp ) ;
    public final void rule__Avancer__DureeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9393:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9394:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9394:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9395:3: ruleIntExp
            {
             before(grammarAccess.getAvancerAccess().getDureeIntExpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleIntExp();

            state._fsp--;

             after(grammarAccess.getAvancerAccess().getDureeIntExpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Avancer__DureeAssignment_2"


    // $ANTLR start "rule__Avancer__Vitesse_deplacementAssignment_4"
    // InternalMyTurtleDsl.g:9404:1: rule__Avancer__Vitesse_deplacementAssignment_4 : ( ruleIntExp ) ;
    public final void rule__Avancer__Vitesse_deplacementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9408:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9409:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9409:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9410:3: ruleIntExp
            {
             before(grammarAccess.getAvancerAccess().getVitesse_deplacementIntExpParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleIntExp();

            state._fsp--;

             after(grammarAccess.getAvancerAccess().getVitesse_deplacementIntExpParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Avancer__Vitesse_deplacementAssignment_4"


    // $ANTLR start "rule__Reculer__DureeAssignment_2"
    // InternalMyTurtleDsl.g:9419:1: rule__Reculer__DureeAssignment_2 : ( ruleIntExp ) ;
    public final void rule__Reculer__DureeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9423:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9424:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9424:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9425:3: ruleIntExp
            {
             before(grammarAccess.getReculerAccess().getDureeIntExpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleIntExp();

            state._fsp--;

             after(grammarAccess.getReculerAccess().getDureeIntExpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reculer__DureeAssignment_2"


    // $ANTLR start "rule__Reculer__Vitesse_deplacementAssignment_4"
    // InternalMyTurtleDsl.g:9434:1: rule__Reculer__Vitesse_deplacementAssignment_4 : ( ruleIntExp ) ;
    public final void rule__Reculer__Vitesse_deplacementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9438:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9439:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9439:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9440:3: ruleIntExp
            {
             before(grammarAccess.getReculerAccess().getVitesse_deplacementIntExpParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleIntExp();

            state._fsp--;

             after(grammarAccess.getReculerAccess().getVitesse_deplacementIntExpParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reculer__Vitesse_deplacementAssignment_4"


    // $ANTLR start "rule__Gauche__DureeAssignment_2"
    // InternalMyTurtleDsl.g:9449:1: rule__Gauche__DureeAssignment_2 : ( ruleIntExp ) ;
    public final void rule__Gauche__DureeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9453:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9454:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9454:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9455:3: ruleIntExp
            {
             before(grammarAccess.getGaucheAccess().getDureeIntExpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleIntExp();

            state._fsp--;

             after(grammarAccess.getGaucheAccess().getDureeIntExpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gauche__DureeAssignment_2"


    // $ANTLR start "rule__Gauche__Vitesse_deplacementAssignment_4"
    // InternalMyTurtleDsl.g:9464:1: rule__Gauche__Vitesse_deplacementAssignment_4 : ( ruleIntExp ) ;
    public final void rule__Gauche__Vitesse_deplacementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9468:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9469:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9469:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9470:3: ruleIntExp
            {
             before(grammarAccess.getGaucheAccess().getVitesse_deplacementIntExpParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleIntExp();

            state._fsp--;

             after(grammarAccess.getGaucheAccess().getVitesse_deplacementIntExpParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gauche__Vitesse_deplacementAssignment_4"


    // $ANTLR start "rule__Droite__DureeAssignment_2"
    // InternalMyTurtleDsl.g:9479:1: rule__Droite__DureeAssignment_2 : ( ruleIntExp ) ;
    public final void rule__Droite__DureeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9483:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9484:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9484:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9485:3: ruleIntExp
            {
             before(grammarAccess.getDroiteAccess().getDureeIntExpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleIntExp();

            state._fsp--;

             after(grammarAccess.getDroiteAccess().getDureeIntExpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Droite__DureeAssignment_2"


    // $ANTLR start "rule__Droite__Vitesse_deplacementAssignment_4"
    // InternalMyTurtleDsl.g:9494:1: rule__Droite__Vitesse_deplacementAssignment_4 : ( ruleIntExp ) ;
    public final void rule__Droite__Vitesse_deplacementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9498:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9499:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9499:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9500:3: ruleIntExp
            {
             before(grammarAccess.getDroiteAccess().getVitesse_deplacementIntExpParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleIntExp();

            state._fsp--;

             after(grammarAccess.getDroiteAccess().getVitesse_deplacementIntExpParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Droite__Vitesse_deplacementAssignment_4"


    // $ANTLR start "rule__Pause__DureeAssignment_2"
    // InternalMyTurtleDsl.g:9509:1: rule__Pause__DureeAssignment_2 : ( ruleIntExp ) ;
    public final void rule__Pause__DureeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9513:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9514:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9514:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9515:3: ruleIntExp
            {
             before(grammarAccess.getPauseAccess().getDureeIntExpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleIntExp();

            state._fsp--;

             after(grammarAccess.getPauseAccess().getDureeIntExpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pause__DureeAssignment_2"


    // $ANTLR start "rule__RotationGauche__DureeAssignment_2"
    // InternalMyTurtleDsl.g:9524:1: rule__RotationGauche__DureeAssignment_2 : ( ruleIntExp ) ;
    public final void rule__RotationGauche__DureeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9528:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9529:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9529:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9530:3: ruleIntExp
            {
             before(grammarAccess.getRotationGaucheAccess().getDureeIntExpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleIntExp();

            state._fsp--;

             after(grammarAccess.getRotationGaucheAccess().getDureeIntExpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotationGauche__DureeAssignment_2"


    // $ANTLR start "rule__RotationGauche__Vitesse_rotationAssignment_4"
    // InternalMyTurtleDsl.g:9539:1: rule__RotationGauche__Vitesse_rotationAssignment_4 : ( ruleIntExp ) ;
    public final void rule__RotationGauche__Vitesse_rotationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9543:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9544:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9544:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9545:3: ruleIntExp
            {
             before(grammarAccess.getRotationGaucheAccess().getVitesse_rotationIntExpParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleIntExp();

            state._fsp--;

             after(grammarAccess.getRotationGaucheAccess().getVitesse_rotationIntExpParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotationGauche__Vitesse_rotationAssignment_4"


    // $ANTLR start "rule__RotationDroite__DureeAssignment_2"
    // InternalMyTurtleDsl.g:9554:1: rule__RotationDroite__DureeAssignment_2 : ( ruleIntExp ) ;
    public final void rule__RotationDroite__DureeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9558:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9559:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9559:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9560:3: ruleIntExp
            {
             before(grammarAccess.getRotationDroiteAccess().getDureeIntExpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleIntExp();

            state._fsp--;

             after(grammarAccess.getRotationDroiteAccess().getDureeIntExpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotationDroite__DureeAssignment_2"


    // $ANTLR start "rule__RotationDroite__Vitesse_rotationAssignment_4"
    // InternalMyTurtleDsl.g:9569:1: rule__RotationDroite__Vitesse_rotationAssignment_4 : ( ruleIntExp ) ;
    public final void rule__RotationDroite__Vitesse_rotationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9573:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9574:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9574:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9575:3: ruleIntExp
            {
             before(grammarAccess.getRotationDroiteAccess().getVitesse_rotationIntExpParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleIntExp();

            state._fsp--;

             after(grammarAccess.getRotationDroiteAccess().getVitesse_rotationIntExpParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotationDroite__Vitesse_rotationAssignment_4"


    // $ANTLR start "rule__FonctionDecl__NameAssignment_1"
    // InternalMyTurtleDsl.g:9584:1: rule__FonctionDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FonctionDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9588:1: ( ( RULE_ID ) )
            // InternalMyTurtleDsl.g:9589:2: ( RULE_ID )
            {
            // InternalMyTurtleDsl.g:9589:2: ( RULE_ID )
            // InternalMyTurtleDsl.g:9590:3: RULE_ID
            {
             before(grammarAccess.getFonctionDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFonctionDeclAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FonctionDecl__NameAssignment_1"


    // $ANTLR start "rule__FonctionDecl__BodyAssignment_5"
    // InternalMyTurtleDsl.g:9599:1: rule__FonctionDecl__BodyAssignment_5 : ( ruleStatement ) ;
    public final void rule__FonctionDecl__BodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9603:1: ( ( ruleStatement ) )
            // InternalMyTurtleDsl.g:9604:2: ( ruleStatement )
            {
            // InternalMyTurtleDsl.g:9604:2: ( ruleStatement )
            // InternalMyTurtleDsl.g:9605:3: ruleStatement
            {
             before(grammarAccess.getFonctionDeclAccess().getBodyStatementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getFonctionDeclAccess().getBodyStatementParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FonctionDecl__BodyAssignment_5"


    // $ANTLR start "rule__IntConstante__ValAssignment"
    // InternalMyTurtleDsl.g:9614:1: rule__IntConstante__ValAssignment : ( RULE_INT ) ;
    public final void rule__IntConstante__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9618:1: ( ( RULE_INT ) )
            // InternalMyTurtleDsl.g:9619:2: ( RULE_INT )
            {
            // InternalMyTurtleDsl.g:9619:2: ( RULE_INT )
            // InternalMyTurtleDsl.g:9620:3: RULE_INT
            {
             before(grammarAccess.getIntConstanteAccess().getValINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntConstanteAccess().getValINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntConstante__ValAssignment"


    // $ANTLR start "rule__IntDecl__NameAssignment_1"
    // InternalMyTurtleDsl.g:9629:1: rule__IntDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__IntDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9633:1: ( ( RULE_ID ) )
            // InternalMyTurtleDsl.g:9634:2: ( RULE_ID )
            {
            // InternalMyTurtleDsl.g:9634:2: ( RULE_ID )
            // InternalMyTurtleDsl.g:9635:3: RULE_ID
            {
             before(grammarAccess.getIntDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIntDeclAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntDecl__NameAssignment_1"


    // $ANTLR start "rule__IntDecl__ValAssignment_3"
    // InternalMyTurtleDsl.g:9644:1: rule__IntDecl__ValAssignment_3 : ( ruleIntExp ) ;
    public final void rule__IntDecl__ValAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9648:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9649:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9649:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9650:3: ruleIntExp
            {
             before(grammarAccess.getIntDeclAccess().getValIntExpParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleIntExp();

            state._fsp--;

             after(grammarAccess.getIntDeclAccess().getValIntExpParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntDecl__ValAssignment_3"


    // $ANTLR start "rule__PourcentDecl__NameAssignment_1"
    // InternalMyTurtleDsl.g:9659:1: rule__PourcentDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PourcentDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9663:1: ( ( RULE_ID ) )
            // InternalMyTurtleDsl.g:9664:2: ( RULE_ID )
            {
            // InternalMyTurtleDsl.g:9664:2: ( RULE_ID )
            // InternalMyTurtleDsl.g:9665:3: RULE_ID
            {
             before(grammarAccess.getPourcentDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPourcentDeclAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PourcentDecl__NameAssignment_1"


    // $ANTLR start "rule__PourcentDecl__ValAssignment_3"
    // InternalMyTurtleDsl.g:9674:1: rule__PourcentDecl__ValAssignment_3 : ( ruleIntExp ) ;
    public final void rule__PourcentDecl__ValAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9678:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9679:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9679:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9680:3: ruleIntExp
            {
             before(grammarAccess.getPourcentDeclAccess().getValIntExpParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleIntExp();

            state._fsp--;

             after(grammarAccess.getPourcentDeclAccess().getValIntExpParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PourcentDecl__ValAssignment_3"


    // $ANTLR start "rule__RefIntVar__VarAssignment"
    // InternalMyTurtleDsl.g:9689:1: rule__RefIntVar__VarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__RefIntVar__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9693:1: ( ( ( RULE_ID ) ) )
            // InternalMyTurtleDsl.g:9694:2: ( ( RULE_ID ) )
            {
            // InternalMyTurtleDsl.g:9694:2: ( ( RULE_ID ) )
            // InternalMyTurtleDsl.g:9695:3: ( RULE_ID )
            {
             before(grammarAccess.getRefIntVarAccess().getVarIntDeclCrossReference_0()); 
            // InternalMyTurtleDsl.g:9696:3: ( RULE_ID )
            // InternalMyTurtleDsl.g:9697:4: RULE_ID
            {
             before(grammarAccess.getRefIntVarAccess().getVarIntDeclIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRefIntVarAccess().getVarIntDeclIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getRefIntVarAccess().getVarIntDeclCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefIntVar__VarAssignment"


    // $ANTLR start "rule__FonctionCall__FuncAssignment_0"
    // InternalMyTurtleDsl.g:9708:1: rule__FonctionCall__FuncAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FonctionCall__FuncAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9712:1: ( ( ( RULE_ID ) ) )
            // InternalMyTurtleDsl.g:9713:2: ( ( RULE_ID ) )
            {
            // InternalMyTurtleDsl.g:9713:2: ( ( RULE_ID ) )
            // InternalMyTurtleDsl.g:9714:3: ( RULE_ID )
            {
             before(grammarAccess.getFonctionCallAccess().getFuncFonctionDeclCrossReference_0_0()); 
            // InternalMyTurtleDsl.g:9715:3: ( RULE_ID )
            // InternalMyTurtleDsl.g:9716:4: RULE_ID
            {
             before(grammarAccess.getFonctionCallAccess().getFuncFonctionDeclIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFonctionCallAccess().getFuncFonctionDeclIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getFonctionCallAccess().getFuncFonctionDeclCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FonctionCall__FuncAssignment_0"


    // $ANTLR start "rule__Parallele2__AAssignment_0_0"
    // InternalMyTurtleDsl.g:9727:1: rule__Parallele2__AAssignment_0_0 : ( ruleMD ) ;
    public final void rule__Parallele2__AAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9731:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:9732:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:9732:2: ( ruleMD )
            // InternalMyTurtleDsl.g:9733:3: ruleMD
            {
             before(grammarAccess.getParallele2Access().getAMDParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMD();

            state._fsp--;

             after(grammarAccess.getParallele2Access().getAMDParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__AAssignment_0_0"


    // $ANTLR start "rule__Parallele2__TAssignment_0_2"
    // InternalMyTurtleDsl.g:9742:1: rule__Parallele2__TAssignment_0_2 : ( ruleGDr ) ;
    public final void rule__Parallele2__TAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9746:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:9747:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:9747:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:9748:3: ruleGDr
            {
             before(grammarAccess.getParallele2Access().getTGDrParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGDr();

            state._fsp--;

             after(grammarAccess.getParallele2Access().getTGDrParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__TAssignment_0_2"


    // $ANTLR start "rule__Parallele2__AAssignment_1_0"
    // InternalMyTurtleDsl.g:9757:1: rule__Parallele2__AAssignment_1_0 : ( ruleMD ) ;
    public final void rule__Parallele2__AAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9761:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:9762:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:9762:2: ( ruleMD )
            // InternalMyTurtleDsl.g:9763:3: ruleMD
            {
             before(grammarAccess.getParallele2Access().getAMDParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMD();

            state._fsp--;

             after(grammarAccess.getParallele2Access().getAMDParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__AAssignment_1_0"


    // $ANTLR start "rule__Parallele2__TAssignment_1_2"
    // InternalMyTurtleDsl.g:9772:1: rule__Parallele2__TAssignment_1_2 : ( ruleAR ) ;
    public final void rule__Parallele2__TAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9776:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:9777:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:9777:2: ( ruleAR )
            // InternalMyTurtleDsl.g:9778:3: ruleAR
            {
             before(grammarAccess.getParallele2Access().getTARParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAR();

            state._fsp--;

             after(grammarAccess.getParallele2Access().getTARParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__TAssignment_1_2"


    // $ANTLR start "rule__Parallele2__AAssignment_2_0"
    // InternalMyTurtleDsl.g:9787:1: rule__Parallele2__AAssignment_2_0 : ( ruleMD ) ;
    public final void rule__Parallele2__AAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9791:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:9792:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:9792:2: ( ruleMD )
            // InternalMyTurtleDsl.g:9793:3: ruleMD
            {
             before(grammarAccess.getParallele2Access().getAMDParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMD();

            state._fsp--;

             after(grammarAccess.getParallele2Access().getAMDParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__AAssignment_2_0"


    // $ANTLR start "rule__Parallele2__TAssignment_2_2"
    // InternalMyTurtleDsl.g:9802:1: rule__Parallele2__TAssignment_2_2 : ( ruleRGRD ) ;
    public final void rule__Parallele2__TAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9806:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:9807:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:9807:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:9808:3: ruleRGRD
            {
             before(grammarAccess.getParallele2Access().getTRGRDParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRGRD();

            state._fsp--;

             after(grammarAccess.getParallele2Access().getTRGRDParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__TAssignment_2_2"


    // $ANTLR start "rule__Parallele2__TAssignment_3_0"
    // InternalMyTurtleDsl.g:9817:1: rule__Parallele2__TAssignment_3_0 : ( ruleGDr ) ;
    public final void rule__Parallele2__TAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9821:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:9822:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:9822:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:9823:3: ruleGDr
            {
             before(grammarAccess.getParallele2Access().getTGDrParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGDr();

            state._fsp--;

             after(grammarAccess.getParallele2Access().getTGDrParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__TAssignment_3_0"


    // $ANTLR start "rule__Parallele2__BAssignment_3_2"
    // InternalMyTurtleDsl.g:9832:1: rule__Parallele2__BAssignment_3_2 : ( ruleAR ) ;
    public final void rule__Parallele2__BAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9836:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:9837:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:9837:2: ( ruleAR )
            // InternalMyTurtleDsl.g:9838:3: ruleAR
            {
             before(grammarAccess.getParallele2Access().getBARParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAR();

            state._fsp--;

             after(grammarAccess.getParallele2Access().getBARParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__BAssignment_3_2"


    // $ANTLR start "rule__Parallele2__TAssignment_4_0"
    // InternalMyTurtleDsl.g:9847:1: rule__Parallele2__TAssignment_4_0 : ( ruleGDr ) ;
    public final void rule__Parallele2__TAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9851:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:9852:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:9852:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:9853:3: ruleGDr
            {
             before(grammarAccess.getParallele2Access().getTGDrParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGDr();

            state._fsp--;

             after(grammarAccess.getParallele2Access().getTGDrParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__TAssignment_4_0"


    // $ANTLR start "rule__Parallele2__BAssignment_4_2"
    // InternalMyTurtleDsl.g:9862:1: rule__Parallele2__BAssignment_4_2 : ( ruleMD ) ;
    public final void rule__Parallele2__BAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9866:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:9867:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:9867:2: ( ruleMD )
            // InternalMyTurtleDsl.g:9868:3: ruleMD
            {
             before(grammarAccess.getParallele2Access().getBMDParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMD();

            state._fsp--;

             after(grammarAccess.getParallele2Access().getBMDParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__BAssignment_4_2"


    // $ANTLR start "rule__Parallele2__TAssignment_5_0"
    // InternalMyTurtleDsl.g:9877:1: rule__Parallele2__TAssignment_5_0 : ( ruleGDr ) ;
    public final void rule__Parallele2__TAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9881:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:9882:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:9882:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:9883:3: ruleGDr
            {
             before(grammarAccess.getParallele2Access().getTGDrParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGDr();

            state._fsp--;

             after(grammarAccess.getParallele2Access().getTGDrParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__TAssignment_5_0"


    // $ANTLR start "rule__Parallele2__BAssignment_5_2"
    // InternalMyTurtleDsl.g:9892:1: rule__Parallele2__BAssignment_5_2 : ( ruleRGRD ) ;
    public final void rule__Parallele2__BAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9896:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:9897:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:9897:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:9898:3: ruleRGRD
            {
             before(grammarAccess.getParallele2Access().getBRGRDParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRGRD();

            state._fsp--;

             after(grammarAccess.getParallele2Access().getBRGRDParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__BAssignment_5_2"


    // $ANTLR start "rule__Parallele2__TAssignment_6_0"
    // InternalMyTurtleDsl.g:9907:1: rule__Parallele2__TAssignment_6_0 : ( ruleRGRD ) ;
    public final void rule__Parallele2__TAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9911:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:9912:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:9912:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:9913:3: ruleRGRD
            {
             before(grammarAccess.getParallele2Access().getTRGRDParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRGRD();

            state._fsp--;

             after(grammarAccess.getParallele2Access().getTRGRDParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__TAssignment_6_0"


    // $ANTLR start "rule__Parallele2__AAssignment_6_2"
    // InternalMyTurtleDsl.g:9922:1: rule__Parallele2__AAssignment_6_2 : ( ruleMD ) ;
    public final void rule__Parallele2__AAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9926:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:9927:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:9927:2: ( ruleMD )
            // InternalMyTurtleDsl.g:9928:3: ruleMD
            {
             before(grammarAccess.getParallele2Access().getAMDParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMD();

            state._fsp--;

             after(grammarAccess.getParallele2Access().getAMDParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__AAssignment_6_2"


    // $ANTLR start "rule__Parallele2__TAssignment_7_0"
    // InternalMyTurtleDsl.g:9937:1: rule__Parallele2__TAssignment_7_0 : ( ruleRGRD ) ;
    public final void rule__Parallele2__TAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9941:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:9942:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:9942:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:9943:3: ruleRGRD
            {
             before(grammarAccess.getParallele2Access().getTRGRDParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRGRD();

            state._fsp--;

             after(grammarAccess.getParallele2Access().getTRGRDParserRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__TAssignment_7_0"


    // $ANTLR start "rule__Parallele2__AAssignment_7_2"
    // InternalMyTurtleDsl.g:9952:1: rule__Parallele2__AAssignment_7_2 : ( ruleAR ) ;
    public final void rule__Parallele2__AAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9956:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:9957:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:9957:2: ( ruleAR )
            // InternalMyTurtleDsl.g:9958:3: ruleAR
            {
             before(grammarAccess.getParallele2Access().getAARParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAR();

            state._fsp--;

             after(grammarAccess.getParallele2Access().getAARParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__AAssignment_7_2"


    // $ANTLR start "rule__Parallele2__TAssignment_8_0"
    // InternalMyTurtleDsl.g:9967:1: rule__Parallele2__TAssignment_8_0 : ( ruleRGRD ) ;
    public final void rule__Parallele2__TAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9971:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:9972:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:9972:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:9973:3: ruleRGRD
            {
             before(grammarAccess.getParallele2Access().getTRGRDParserRuleCall_8_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRGRD();

            state._fsp--;

             after(grammarAccess.getParallele2Access().getTRGRDParserRuleCall_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__TAssignment_8_0"


    // $ANTLR start "rule__Parallele2__AAssignment_8_2"
    // InternalMyTurtleDsl.g:9982:1: rule__Parallele2__AAssignment_8_2 : ( ruleGDr ) ;
    public final void rule__Parallele2__AAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9986:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:9987:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:9987:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:9988:3: ruleGDr
            {
             before(grammarAccess.getParallele2Access().getAGDrParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGDr();

            state._fsp--;

             after(grammarAccess.getParallele2Access().getAGDrParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__AAssignment_8_2"


    // $ANTLR start "rule__Parallele2__TAssignment_9_0"
    // InternalMyTurtleDsl.g:9997:1: rule__Parallele2__TAssignment_9_0 : ( ruleAR ) ;
    public final void rule__Parallele2__TAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10001:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:10002:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:10002:2: ( ruleAR )
            // InternalMyTurtleDsl.g:10003:3: ruleAR
            {
             before(grammarAccess.getParallele2Access().getTARParserRuleCall_9_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAR();

            state._fsp--;

             after(grammarAccess.getParallele2Access().getTARParserRuleCall_9_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__TAssignment_9_0"


    // $ANTLR start "rule__Parallele2__AAssignment_9_2"
    // InternalMyTurtleDsl.g:10012:1: rule__Parallele2__AAssignment_9_2 : ( ruleMD ) ;
    public final void rule__Parallele2__AAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10016:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:10017:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:10017:2: ( ruleMD )
            // InternalMyTurtleDsl.g:10018:3: ruleMD
            {
             before(grammarAccess.getParallele2Access().getAMDParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMD();

            state._fsp--;

             after(grammarAccess.getParallele2Access().getAMDParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__AAssignment_9_2"


    // $ANTLR start "rule__Parallele2__TAssignment_10_0"
    // InternalMyTurtleDsl.g:10027:1: rule__Parallele2__TAssignment_10_0 : ( ruleAR ) ;
    public final void rule__Parallele2__TAssignment_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10031:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:10032:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:10032:2: ( ruleAR )
            // InternalMyTurtleDsl.g:10033:3: ruleAR
            {
             before(grammarAccess.getParallele2Access().getTARParserRuleCall_10_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAR();

            state._fsp--;

             after(grammarAccess.getParallele2Access().getTARParserRuleCall_10_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__TAssignment_10_0"


    // $ANTLR start "rule__Parallele2__AAssignment_10_2"
    // InternalMyTurtleDsl.g:10042:1: rule__Parallele2__AAssignment_10_2 : ( ruleRGRD ) ;
    public final void rule__Parallele2__AAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10046:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:10047:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:10047:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:10048:3: ruleRGRD
            {
             before(grammarAccess.getParallele2Access().getARGRDParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRGRD();

            state._fsp--;

             after(grammarAccess.getParallele2Access().getARGRDParserRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__AAssignment_10_2"


    // $ANTLR start "rule__Parallele2__TAssignment_11_0"
    // InternalMyTurtleDsl.g:10057:1: rule__Parallele2__TAssignment_11_0 : ( ruleAR ) ;
    public final void rule__Parallele2__TAssignment_11_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10061:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:10062:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:10062:2: ( ruleAR )
            // InternalMyTurtleDsl.g:10063:3: ruleAR
            {
             before(grammarAccess.getParallele2Access().getTARParserRuleCall_11_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAR();

            state._fsp--;

             after(grammarAccess.getParallele2Access().getTARParserRuleCall_11_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__TAssignment_11_0"


    // $ANTLR start "rule__Parallele2__AAssignment_11_2"
    // InternalMyTurtleDsl.g:10072:1: rule__Parallele2__AAssignment_11_2 : ( ruleGDr ) ;
    public final void rule__Parallele2__AAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10076:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:10077:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:10077:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:10078:3: ruleGDr
            {
             before(grammarAccess.getParallele2Access().getAGDrParserRuleCall_11_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGDr();

            state._fsp--;

             after(grammarAccess.getParallele2Access().getAGDrParserRuleCall_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele2__AAssignment_11_2"


    // $ANTLR start "rule__Parallele3__AAssignment_0_0"
    // InternalMyTurtleDsl.g:10087:1: rule__Parallele3__AAssignment_0_0 : ( ruleAR ) ;
    public final void rule__Parallele3__AAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10091:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:10092:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:10092:2: ( ruleAR )
            // InternalMyTurtleDsl.g:10093:3: ruleAR
            {
             before(grammarAccess.getParallele3Access().getAARParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAR();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getAARParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__AAssignment_0_0"


    // $ANTLR start "rule__Parallele3__BAssignment_0_2"
    // InternalMyTurtleDsl.g:10102:1: rule__Parallele3__BAssignment_0_2 : ( ruleGDr ) ;
    public final void rule__Parallele3__BAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10106:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:10107:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:10107:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:10108:3: ruleGDr
            {
             before(grammarAccess.getParallele3Access().getBGDrParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGDr();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getBGDrParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__BAssignment_0_2"


    // $ANTLR start "rule__Parallele3__CAssignment_0_4"
    // InternalMyTurtleDsl.g:10117:1: rule__Parallele3__CAssignment_0_4 : ( ruleMD ) ;
    public final void rule__Parallele3__CAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10121:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:10122:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:10122:2: ( ruleMD )
            // InternalMyTurtleDsl.g:10123:3: ruleMD
            {
             before(grammarAccess.getParallele3Access().getCMDParserRuleCall_0_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMD();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getCMDParserRuleCall_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__CAssignment_0_4"


    // $ANTLR start "rule__Parallele3__AAssignment_1_0"
    // InternalMyTurtleDsl.g:10132:1: rule__Parallele3__AAssignment_1_0 : ( ruleAR ) ;
    public final void rule__Parallele3__AAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10136:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:10137:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:10137:2: ( ruleAR )
            // InternalMyTurtleDsl.g:10138:3: ruleAR
            {
             before(grammarAccess.getParallele3Access().getAARParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAR();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getAARParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__AAssignment_1_0"


    // $ANTLR start "rule__Parallele3__BAssignment_1_2"
    // InternalMyTurtleDsl.g:10147:1: rule__Parallele3__BAssignment_1_2 : ( ruleGDr ) ;
    public final void rule__Parallele3__BAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10151:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:10152:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:10152:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:10153:3: ruleGDr
            {
             before(grammarAccess.getParallele3Access().getBGDrParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGDr();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getBGDrParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__BAssignment_1_2"


    // $ANTLR start "rule__Parallele3__CAssignment_1_4"
    // InternalMyTurtleDsl.g:10162:1: rule__Parallele3__CAssignment_1_4 : ( ruleRGRD ) ;
    public final void rule__Parallele3__CAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10166:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:10167:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:10167:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:10168:3: ruleRGRD
            {
             before(grammarAccess.getParallele3Access().getCRGRDParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRGRD();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getCRGRDParserRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__CAssignment_1_4"


    // $ANTLR start "rule__Parallele3__AAssignment_2_0"
    // InternalMyTurtleDsl.g:10177:1: rule__Parallele3__AAssignment_2_0 : ( ruleAR ) ;
    public final void rule__Parallele3__AAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10181:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:10182:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:10182:2: ( ruleAR )
            // InternalMyTurtleDsl.g:10183:3: ruleAR
            {
             before(grammarAccess.getParallele3Access().getAARParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAR();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getAARParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__AAssignment_2_0"


    // $ANTLR start "rule__Parallele3__BAssignment_2_2"
    // InternalMyTurtleDsl.g:10192:1: rule__Parallele3__BAssignment_2_2 : ( ruleMD ) ;
    public final void rule__Parallele3__BAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10196:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:10197:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:10197:2: ( ruleMD )
            // InternalMyTurtleDsl.g:10198:3: ruleMD
            {
             before(grammarAccess.getParallele3Access().getBMDParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMD();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getBMDParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__BAssignment_2_2"


    // $ANTLR start "rule__Parallele3__CAssignment_2_4"
    // InternalMyTurtleDsl.g:10207:1: rule__Parallele3__CAssignment_2_4 : ( ruleGDr ) ;
    public final void rule__Parallele3__CAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10211:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:10212:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:10212:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:10213:3: ruleGDr
            {
             before(grammarAccess.getParallele3Access().getCGDrParserRuleCall_2_4_0()); 
            pushFollow(FOLLOW_2);
            ruleGDr();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getCGDrParserRuleCall_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__CAssignment_2_4"


    // $ANTLR start "rule__Parallele3__AAssignment_3_0"
    // InternalMyTurtleDsl.g:10222:1: rule__Parallele3__AAssignment_3_0 : ( ruleAR ) ;
    public final void rule__Parallele3__AAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10226:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:10227:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:10227:2: ( ruleAR )
            // InternalMyTurtleDsl.g:10228:3: ruleAR
            {
             before(grammarAccess.getParallele3Access().getAARParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAR();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getAARParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__AAssignment_3_0"


    // $ANTLR start "rule__Parallele3__BAssignment_3_2"
    // InternalMyTurtleDsl.g:10237:1: rule__Parallele3__BAssignment_3_2 : ( ruleMD ) ;
    public final void rule__Parallele3__BAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10241:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:10242:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:10242:2: ( ruleMD )
            // InternalMyTurtleDsl.g:10243:3: ruleMD
            {
             before(grammarAccess.getParallele3Access().getBMDParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMD();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getBMDParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__BAssignment_3_2"


    // $ANTLR start "rule__Parallele3__CAssignment_3_4"
    // InternalMyTurtleDsl.g:10252:1: rule__Parallele3__CAssignment_3_4 : ( ruleRGRD ) ;
    public final void rule__Parallele3__CAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10256:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:10257:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:10257:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:10258:3: ruleRGRD
            {
             before(grammarAccess.getParallele3Access().getCRGRDParserRuleCall_3_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRGRD();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getCRGRDParserRuleCall_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__CAssignment_3_4"


    // $ANTLR start "rule__Parallele3__AAssignment_4_0"
    // InternalMyTurtleDsl.g:10267:1: rule__Parallele3__AAssignment_4_0 : ( ruleAR ) ;
    public final void rule__Parallele3__AAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10271:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:10272:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:10272:2: ( ruleAR )
            // InternalMyTurtleDsl.g:10273:3: ruleAR
            {
             before(grammarAccess.getParallele3Access().getAARParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAR();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getAARParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__AAssignment_4_0"


    // $ANTLR start "rule__Parallele3__BAssignment_4_2"
    // InternalMyTurtleDsl.g:10282:1: rule__Parallele3__BAssignment_4_2 : ( ruleRGRD ) ;
    public final void rule__Parallele3__BAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10286:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:10287:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:10287:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:10288:3: ruleRGRD
            {
             before(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRGRD();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__BAssignment_4_2"


    // $ANTLR start "rule__Parallele3__CAssignment_4_4"
    // InternalMyTurtleDsl.g:10297:1: rule__Parallele3__CAssignment_4_4 : ( ruleMD ) ;
    public final void rule__Parallele3__CAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10301:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:10302:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:10302:2: ( ruleMD )
            // InternalMyTurtleDsl.g:10303:3: ruleMD
            {
             before(grammarAccess.getParallele3Access().getCMDParserRuleCall_4_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMD();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getCMDParserRuleCall_4_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__CAssignment_4_4"


    // $ANTLR start "rule__Parallele3__AAssignment_5_0"
    // InternalMyTurtleDsl.g:10312:1: rule__Parallele3__AAssignment_5_0 : ( ruleAR ) ;
    public final void rule__Parallele3__AAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10316:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:10317:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:10317:2: ( ruleAR )
            // InternalMyTurtleDsl.g:10318:3: ruleAR
            {
             before(grammarAccess.getParallele3Access().getAARParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAR();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getAARParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__AAssignment_5_0"


    // $ANTLR start "rule__Parallele3__BAssignment_5_2"
    // InternalMyTurtleDsl.g:10327:1: rule__Parallele3__BAssignment_5_2 : ( ruleRGRD ) ;
    public final void rule__Parallele3__BAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10331:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:10332:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:10332:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:10333:3: ruleRGRD
            {
             before(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRGRD();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__BAssignment_5_2"


    // $ANTLR start "rule__Parallele3__CAssignment_5_4"
    // InternalMyTurtleDsl.g:10342:1: rule__Parallele3__CAssignment_5_4 : ( ruleGDr ) ;
    public final void rule__Parallele3__CAssignment_5_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10346:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:10347:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:10347:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:10348:3: ruleGDr
            {
             before(grammarAccess.getParallele3Access().getCGDrParserRuleCall_5_4_0()); 
            pushFollow(FOLLOW_2);
            ruleGDr();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getCGDrParserRuleCall_5_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__CAssignment_5_4"


    // $ANTLR start "rule__Parallele3__AAssignment_6_0"
    // InternalMyTurtleDsl.g:10357:1: rule__Parallele3__AAssignment_6_0 : ( ruleGDr ) ;
    public final void rule__Parallele3__AAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10361:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:10362:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:10362:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:10363:3: ruleGDr
            {
             before(grammarAccess.getParallele3Access().getAGDrParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGDr();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getAGDrParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__AAssignment_6_0"


    // $ANTLR start "rule__Parallele3__BAssignment_6_2"
    // InternalMyTurtleDsl.g:10372:1: rule__Parallele3__BAssignment_6_2 : ( ruleAR ) ;
    public final void rule__Parallele3__BAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10376:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:10377:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:10377:2: ( ruleAR )
            // InternalMyTurtleDsl.g:10378:3: ruleAR
            {
             before(grammarAccess.getParallele3Access().getBARParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAR();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getBARParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__BAssignment_6_2"


    // $ANTLR start "rule__Parallele3__CAssignment_6_4"
    // InternalMyTurtleDsl.g:10387:1: rule__Parallele3__CAssignment_6_4 : ( ruleMD ) ;
    public final void rule__Parallele3__CAssignment_6_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10391:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:10392:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:10392:2: ( ruleMD )
            // InternalMyTurtleDsl.g:10393:3: ruleMD
            {
             before(grammarAccess.getParallele3Access().getCMDParserRuleCall_6_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMD();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getCMDParserRuleCall_6_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__CAssignment_6_4"


    // $ANTLR start "rule__Parallele3__AAssignment_7_0"
    // InternalMyTurtleDsl.g:10402:1: rule__Parallele3__AAssignment_7_0 : ( ruleGDr ) ;
    public final void rule__Parallele3__AAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10406:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:10407:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:10407:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:10408:3: ruleGDr
            {
             before(grammarAccess.getParallele3Access().getAGDrParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGDr();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getAGDrParserRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__AAssignment_7_0"


    // $ANTLR start "rule__Parallele3__BAssignment_7_2"
    // InternalMyTurtleDsl.g:10417:1: rule__Parallele3__BAssignment_7_2 : ( ruleAR ) ;
    public final void rule__Parallele3__BAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10421:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:10422:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:10422:2: ( ruleAR )
            // InternalMyTurtleDsl.g:10423:3: ruleAR
            {
             before(grammarAccess.getParallele3Access().getBARParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAR();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getBARParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__BAssignment_7_2"


    // $ANTLR start "rule__Parallele3__CAssignment_7_4"
    // InternalMyTurtleDsl.g:10432:1: rule__Parallele3__CAssignment_7_4 : ( ruleRGRD ) ;
    public final void rule__Parallele3__CAssignment_7_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10436:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:10437:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:10437:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:10438:3: ruleRGRD
            {
             before(grammarAccess.getParallele3Access().getCRGRDParserRuleCall_7_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRGRD();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getCRGRDParserRuleCall_7_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__CAssignment_7_4"


    // $ANTLR start "rule__Parallele3__AAssignment_8_0"
    // InternalMyTurtleDsl.g:10447:1: rule__Parallele3__AAssignment_8_0 : ( ruleGDr ) ;
    public final void rule__Parallele3__AAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10451:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:10452:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:10452:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:10453:3: ruleGDr
            {
             before(grammarAccess.getParallele3Access().getAGDrParserRuleCall_8_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGDr();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getAGDrParserRuleCall_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__AAssignment_8_0"


    // $ANTLR start "rule__Parallele3__BAssignment_8_2"
    // InternalMyTurtleDsl.g:10462:1: rule__Parallele3__BAssignment_8_2 : ( ruleMD ) ;
    public final void rule__Parallele3__BAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10466:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:10467:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:10467:2: ( ruleMD )
            // InternalMyTurtleDsl.g:10468:3: ruleMD
            {
             before(grammarAccess.getParallele3Access().getBMDParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMD();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getBMDParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__BAssignment_8_2"


    // $ANTLR start "rule__Parallele3__CAssignment_8_4"
    // InternalMyTurtleDsl.g:10477:1: rule__Parallele3__CAssignment_8_4 : ( ruleAR ) ;
    public final void rule__Parallele3__CAssignment_8_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10481:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:10482:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:10482:2: ( ruleAR )
            // InternalMyTurtleDsl.g:10483:3: ruleAR
            {
             before(grammarAccess.getParallele3Access().getCARParserRuleCall_8_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAR();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getCARParserRuleCall_8_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__CAssignment_8_4"


    // $ANTLR start "rule__Parallele3__AAssignment_9_0"
    // InternalMyTurtleDsl.g:10492:1: rule__Parallele3__AAssignment_9_0 : ( ruleGDr ) ;
    public final void rule__Parallele3__AAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10496:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:10497:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:10497:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:10498:3: ruleGDr
            {
             before(grammarAccess.getParallele3Access().getAGDrParserRuleCall_9_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGDr();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getAGDrParserRuleCall_9_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__AAssignment_9_0"


    // $ANTLR start "rule__Parallele3__BAssignment_9_2"
    // InternalMyTurtleDsl.g:10507:1: rule__Parallele3__BAssignment_9_2 : ( ruleMD ) ;
    public final void rule__Parallele3__BAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10511:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:10512:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:10512:2: ( ruleMD )
            // InternalMyTurtleDsl.g:10513:3: ruleMD
            {
             before(grammarAccess.getParallele3Access().getBMDParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMD();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getBMDParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__BAssignment_9_2"


    // $ANTLR start "rule__Parallele3__CAssignment_9_4"
    // InternalMyTurtleDsl.g:10522:1: rule__Parallele3__CAssignment_9_4 : ( ruleRGRD ) ;
    public final void rule__Parallele3__CAssignment_9_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10526:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:10527:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:10527:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:10528:3: ruleRGRD
            {
             before(grammarAccess.getParallele3Access().getCRGRDParserRuleCall_9_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRGRD();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getCRGRDParserRuleCall_9_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__CAssignment_9_4"


    // $ANTLR start "rule__Parallele3__AAssignment_10_0"
    // InternalMyTurtleDsl.g:10537:1: rule__Parallele3__AAssignment_10_0 : ( ruleGDr ) ;
    public final void rule__Parallele3__AAssignment_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10541:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:10542:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:10542:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:10543:3: ruleGDr
            {
             before(grammarAccess.getParallele3Access().getAGDrParserRuleCall_10_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGDr();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getAGDrParserRuleCall_10_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__AAssignment_10_0"


    // $ANTLR start "rule__Parallele3__BAssignment_10_2"
    // InternalMyTurtleDsl.g:10552:1: rule__Parallele3__BAssignment_10_2 : ( ruleRGRD ) ;
    public final void rule__Parallele3__BAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10556:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:10557:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:10557:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:10558:3: ruleRGRD
            {
             before(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRGRD();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__BAssignment_10_2"


    // $ANTLR start "rule__Parallele3__CAssignment_10_4"
    // InternalMyTurtleDsl.g:10567:1: rule__Parallele3__CAssignment_10_4 : ( ruleAR ) ;
    public final void rule__Parallele3__CAssignment_10_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10571:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:10572:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:10572:2: ( ruleAR )
            // InternalMyTurtleDsl.g:10573:3: ruleAR
            {
             before(grammarAccess.getParallele3Access().getCARParserRuleCall_10_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAR();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getCARParserRuleCall_10_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__CAssignment_10_4"


    // $ANTLR start "rule__Parallele3__AAssignment_11_0"
    // InternalMyTurtleDsl.g:10582:1: rule__Parallele3__AAssignment_11_0 : ( ruleGDr ) ;
    public final void rule__Parallele3__AAssignment_11_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10586:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:10587:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:10587:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:10588:3: ruleGDr
            {
             before(grammarAccess.getParallele3Access().getAGDrParserRuleCall_11_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGDr();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getAGDrParserRuleCall_11_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__AAssignment_11_0"


    // $ANTLR start "rule__Parallele3__BAssignment_11_2"
    // InternalMyTurtleDsl.g:10597:1: rule__Parallele3__BAssignment_11_2 : ( ruleRGRD ) ;
    public final void rule__Parallele3__BAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10601:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:10602:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:10602:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:10603:3: ruleRGRD
            {
             before(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_11_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRGRD();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__BAssignment_11_2"


    // $ANTLR start "rule__Parallele3__CAssignment_11_4"
    // InternalMyTurtleDsl.g:10612:1: rule__Parallele3__CAssignment_11_4 : ( ruleMD ) ;
    public final void rule__Parallele3__CAssignment_11_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10616:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:10617:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:10617:2: ( ruleMD )
            // InternalMyTurtleDsl.g:10618:3: ruleMD
            {
             before(grammarAccess.getParallele3Access().getCMDParserRuleCall_11_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMD();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getCMDParserRuleCall_11_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__CAssignment_11_4"


    // $ANTLR start "rule__Parallele3__AAssignment_12_0"
    // InternalMyTurtleDsl.g:10627:1: rule__Parallele3__AAssignment_12_0 : ( ruleMD ) ;
    public final void rule__Parallele3__AAssignment_12_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10631:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:10632:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:10632:2: ( ruleMD )
            // InternalMyTurtleDsl.g:10633:3: ruleMD
            {
             before(grammarAccess.getParallele3Access().getAMDParserRuleCall_12_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMD();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getAMDParserRuleCall_12_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__AAssignment_12_0"


    // $ANTLR start "rule__Parallele3__BAssignment_12_2"
    // InternalMyTurtleDsl.g:10642:1: rule__Parallele3__BAssignment_12_2 : ( ruleAR ) ;
    public final void rule__Parallele3__BAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10646:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:10647:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:10647:2: ( ruleAR )
            // InternalMyTurtleDsl.g:10648:3: ruleAR
            {
             before(grammarAccess.getParallele3Access().getBARParserRuleCall_12_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAR();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getBARParserRuleCall_12_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__BAssignment_12_2"


    // $ANTLR start "rule__Parallele3__CAssignment_12_4"
    // InternalMyTurtleDsl.g:10657:1: rule__Parallele3__CAssignment_12_4 : ( ruleGDr ) ;
    public final void rule__Parallele3__CAssignment_12_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10661:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:10662:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:10662:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:10663:3: ruleGDr
            {
             before(grammarAccess.getParallele3Access().getCGDrParserRuleCall_12_4_0()); 
            pushFollow(FOLLOW_2);
            ruleGDr();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getCGDrParserRuleCall_12_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__CAssignment_12_4"


    // $ANTLR start "rule__Parallele3__AAssignment_13_0"
    // InternalMyTurtleDsl.g:10672:1: rule__Parallele3__AAssignment_13_0 : ( ruleMD ) ;
    public final void rule__Parallele3__AAssignment_13_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10676:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:10677:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:10677:2: ( ruleMD )
            // InternalMyTurtleDsl.g:10678:3: ruleMD
            {
             before(grammarAccess.getParallele3Access().getAMDParserRuleCall_13_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMD();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getAMDParserRuleCall_13_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__AAssignment_13_0"


    // $ANTLR start "rule__Parallele3__BAssignment_13_2"
    // InternalMyTurtleDsl.g:10687:1: rule__Parallele3__BAssignment_13_2 : ( ruleAR ) ;
    public final void rule__Parallele3__BAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10691:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:10692:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:10692:2: ( ruleAR )
            // InternalMyTurtleDsl.g:10693:3: ruleAR
            {
             before(grammarAccess.getParallele3Access().getBARParserRuleCall_13_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAR();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getBARParserRuleCall_13_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__BAssignment_13_2"


    // $ANTLR start "rule__Parallele3__CAssignment_13_4"
    // InternalMyTurtleDsl.g:10702:1: rule__Parallele3__CAssignment_13_4 : ( ruleRGRD ) ;
    public final void rule__Parallele3__CAssignment_13_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10706:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:10707:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:10707:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:10708:3: ruleRGRD
            {
             before(grammarAccess.getParallele3Access().getCRGRDParserRuleCall_13_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRGRD();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getCRGRDParserRuleCall_13_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__CAssignment_13_4"


    // $ANTLR start "rule__Parallele3__AAssignment_14_0"
    // InternalMyTurtleDsl.g:10717:1: rule__Parallele3__AAssignment_14_0 : ( ruleMD ) ;
    public final void rule__Parallele3__AAssignment_14_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10721:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:10722:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:10722:2: ( ruleMD )
            // InternalMyTurtleDsl.g:10723:3: ruleMD
            {
             before(grammarAccess.getParallele3Access().getAMDParserRuleCall_14_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMD();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getAMDParserRuleCall_14_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__AAssignment_14_0"


    // $ANTLR start "rule__Parallele3__BAssignment_14_2"
    // InternalMyTurtleDsl.g:10732:1: rule__Parallele3__BAssignment_14_2 : ( ruleGDr ) ;
    public final void rule__Parallele3__BAssignment_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10736:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:10737:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:10737:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:10738:3: ruleGDr
            {
             before(grammarAccess.getParallele3Access().getBGDrParserRuleCall_14_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGDr();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getBGDrParserRuleCall_14_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__BAssignment_14_2"


    // $ANTLR start "rule__Parallele3__CAssignment_14_4"
    // InternalMyTurtleDsl.g:10747:1: rule__Parallele3__CAssignment_14_4 : ( ruleAR ) ;
    public final void rule__Parallele3__CAssignment_14_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10751:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:10752:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:10752:2: ( ruleAR )
            // InternalMyTurtleDsl.g:10753:3: ruleAR
            {
             before(grammarAccess.getParallele3Access().getCARParserRuleCall_14_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAR();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getCARParserRuleCall_14_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__CAssignment_14_4"


    // $ANTLR start "rule__Parallele3__AAssignment_15_0"
    // InternalMyTurtleDsl.g:10762:1: rule__Parallele3__AAssignment_15_0 : ( ruleMD ) ;
    public final void rule__Parallele3__AAssignment_15_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10766:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:10767:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:10767:2: ( ruleMD )
            // InternalMyTurtleDsl.g:10768:3: ruleMD
            {
             before(grammarAccess.getParallele3Access().getAMDParserRuleCall_15_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMD();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getAMDParserRuleCall_15_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__AAssignment_15_0"


    // $ANTLR start "rule__Parallele3__BAssignment_15_2"
    // InternalMyTurtleDsl.g:10777:1: rule__Parallele3__BAssignment_15_2 : ( ruleGDr ) ;
    public final void rule__Parallele3__BAssignment_15_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10781:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:10782:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:10782:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:10783:3: ruleGDr
            {
             before(grammarAccess.getParallele3Access().getBGDrParserRuleCall_15_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGDr();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getBGDrParserRuleCall_15_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__BAssignment_15_2"


    // $ANTLR start "rule__Parallele3__CAssignment_15_4"
    // InternalMyTurtleDsl.g:10792:1: rule__Parallele3__CAssignment_15_4 : ( ruleRGRD ) ;
    public final void rule__Parallele3__CAssignment_15_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10796:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:10797:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:10797:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:10798:3: ruleRGRD
            {
             before(grammarAccess.getParallele3Access().getCRGRDParserRuleCall_15_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRGRD();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getCRGRDParserRuleCall_15_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__CAssignment_15_4"


    // $ANTLR start "rule__Parallele3__AAssignment_16_0"
    // InternalMyTurtleDsl.g:10807:1: rule__Parallele3__AAssignment_16_0 : ( ruleMD ) ;
    public final void rule__Parallele3__AAssignment_16_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10811:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:10812:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:10812:2: ( ruleMD )
            // InternalMyTurtleDsl.g:10813:3: ruleMD
            {
             before(grammarAccess.getParallele3Access().getAMDParserRuleCall_16_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMD();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getAMDParserRuleCall_16_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__AAssignment_16_0"


    // $ANTLR start "rule__Parallele3__BAssignment_16_2"
    // InternalMyTurtleDsl.g:10822:1: rule__Parallele3__BAssignment_16_2 : ( ruleRGRD ) ;
    public final void rule__Parallele3__BAssignment_16_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10826:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:10827:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:10827:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:10828:3: ruleRGRD
            {
             before(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_16_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRGRD();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_16_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__BAssignment_16_2"


    // $ANTLR start "rule__Parallele3__CAssignment_16_4"
    // InternalMyTurtleDsl.g:10837:1: rule__Parallele3__CAssignment_16_4 : ( ruleGDr ) ;
    public final void rule__Parallele3__CAssignment_16_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10841:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:10842:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:10842:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:10843:3: ruleGDr
            {
             before(grammarAccess.getParallele3Access().getCGDrParserRuleCall_16_4_0()); 
            pushFollow(FOLLOW_2);
            ruleGDr();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getCGDrParserRuleCall_16_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__CAssignment_16_4"


    // $ANTLR start "rule__Parallele3__AAssignment_17_0"
    // InternalMyTurtleDsl.g:10852:1: rule__Parallele3__AAssignment_17_0 : ( ruleMD ) ;
    public final void rule__Parallele3__AAssignment_17_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10856:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:10857:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:10857:2: ( ruleMD )
            // InternalMyTurtleDsl.g:10858:3: ruleMD
            {
             before(grammarAccess.getParallele3Access().getAMDParserRuleCall_17_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMD();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getAMDParserRuleCall_17_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__AAssignment_17_0"


    // $ANTLR start "rule__Parallele3__BAssignment_17_2"
    // InternalMyTurtleDsl.g:10867:1: rule__Parallele3__BAssignment_17_2 : ( ruleRGRD ) ;
    public final void rule__Parallele3__BAssignment_17_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10871:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:10872:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:10872:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:10873:3: ruleRGRD
            {
             before(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_17_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRGRD();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getBRGRDParserRuleCall_17_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__BAssignment_17_2"


    // $ANTLR start "rule__Parallele3__CAssignment_17_4"
    // InternalMyTurtleDsl.g:10882:1: rule__Parallele3__CAssignment_17_4 : ( ruleAR ) ;
    public final void rule__Parallele3__CAssignment_17_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10886:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:10887:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:10887:2: ( ruleAR )
            // InternalMyTurtleDsl.g:10888:3: ruleAR
            {
             before(grammarAccess.getParallele3Access().getCARParserRuleCall_17_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAR();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getCARParserRuleCall_17_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__CAssignment_17_4"


    // $ANTLR start "rule__Parallele3__AAssignment_18_0"
    // InternalMyTurtleDsl.g:10897:1: rule__Parallele3__AAssignment_18_0 : ( ruleRGRD ) ;
    public final void rule__Parallele3__AAssignment_18_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10901:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:10902:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:10902:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:10903:3: ruleRGRD
            {
             before(grammarAccess.getParallele3Access().getARGRDParserRuleCall_18_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRGRD();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getARGRDParserRuleCall_18_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__AAssignment_18_0"


    // $ANTLR start "rule__Parallele3__BAssignment_18_2"
    // InternalMyTurtleDsl.g:10912:1: rule__Parallele3__BAssignment_18_2 : ( ruleAR ) ;
    public final void rule__Parallele3__BAssignment_18_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10916:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:10917:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:10917:2: ( ruleAR )
            // InternalMyTurtleDsl.g:10918:3: ruleAR
            {
             before(grammarAccess.getParallele3Access().getBARParserRuleCall_18_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAR();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getBARParserRuleCall_18_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__BAssignment_18_2"


    // $ANTLR start "rule__Parallele3__CAssignment_18_4"
    // InternalMyTurtleDsl.g:10927:1: rule__Parallele3__CAssignment_18_4 : ( ruleMD ) ;
    public final void rule__Parallele3__CAssignment_18_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10931:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:10932:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:10932:2: ( ruleMD )
            // InternalMyTurtleDsl.g:10933:3: ruleMD
            {
             before(grammarAccess.getParallele3Access().getCMDParserRuleCall_18_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMD();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getCMDParserRuleCall_18_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__CAssignment_18_4"


    // $ANTLR start "rule__Parallele3__AAssignment_19_0"
    // InternalMyTurtleDsl.g:10942:1: rule__Parallele3__AAssignment_19_0 : ( ruleRGRD ) ;
    public final void rule__Parallele3__AAssignment_19_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10946:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:10947:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:10947:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:10948:3: ruleRGRD
            {
             before(grammarAccess.getParallele3Access().getARGRDParserRuleCall_19_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRGRD();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getARGRDParserRuleCall_19_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__AAssignment_19_0"


    // $ANTLR start "rule__Parallele3__BAssignment_19_2"
    // InternalMyTurtleDsl.g:10957:1: rule__Parallele3__BAssignment_19_2 : ( ruleAR ) ;
    public final void rule__Parallele3__BAssignment_19_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10961:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:10962:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:10962:2: ( ruleAR )
            // InternalMyTurtleDsl.g:10963:3: ruleAR
            {
             before(grammarAccess.getParallele3Access().getBARParserRuleCall_19_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAR();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getBARParserRuleCall_19_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__BAssignment_19_2"


    // $ANTLR start "rule__Parallele3__CAssignment_19_4"
    // InternalMyTurtleDsl.g:10972:1: rule__Parallele3__CAssignment_19_4 : ( ruleGDr ) ;
    public final void rule__Parallele3__CAssignment_19_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10976:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:10977:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:10977:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:10978:3: ruleGDr
            {
             before(grammarAccess.getParallele3Access().getCGDrParserRuleCall_19_4_0()); 
            pushFollow(FOLLOW_2);
            ruleGDr();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getCGDrParserRuleCall_19_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__CAssignment_19_4"


    // $ANTLR start "rule__Parallele3__AAssignment_20_0"
    // InternalMyTurtleDsl.g:10987:1: rule__Parallele3__AAssignment_20_0 : ( ruleRGRD ) ;
    public final void rule__Parallele3__AAssignment_20_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10991:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:10992:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:10992:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:10993:3: ruleRGRD
            {
             before(grammarAccess.getParallele3Access().getARGRDParserRuleCall_20_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRGRD();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getARGRDParserRuleCall_20_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__AAssignment_20_0"


    // $ANTLR start "rule__Parallele3__BAssignment_20_2"
    // InternalMyTurtleDsl.g:11002:1: rule__Parallele3__BAssignment_20_2 : ( ruleMD ) ;
    public final void rule__Parallele3__BAssignment_20_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:11006:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:11007:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:11007:2: ( ruleMD )
            // InternalMyTurtleDsl.g:11008:3: ruleMD
            {
             before(grammarAccess.getParallele3Access().getBMDParserRuleCall_20_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMD();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getBMDParserRuleCall_20_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__BAssignment_20_2"


    // $ANTLR start "rule__Parallele3__CAssignment_20_4"
    // InternalMyTurtleDsl.g:11017:1: rule__Parallele3__CAssignment_20_4 : ( ruleAR ) ;
    public final void rule__Parallele3__CAssignment_20_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:11021:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:11022:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:11022:2: ( ruleAR )
            // InternalMyTurtleDsl.g:11023:3: ruleAR
            {
             before(grammarAccess.getParallele3Access().getCARParserRuleCall_20_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAR();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getCARParserRuleCall_20_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__CAssignment_20_4"


    // $ANTLR start "rule__Parallele3__AAssignment_21_0"
    // InternalMyTurtleDsl.g:11032:1: rule__Parallele3__AAssignment_21_0 : ( ruleRGRD ) ;
    public final void rule__Parallele3__AAssignment_21_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:11036:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:11037:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:11037:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:11038:3: ruleRGRD
            {
             before(grammarAccess.getParallele3Access().getARGRDParserRuleCall_21_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRGRD();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getARGRDParserRuleCall_21_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__AAssignment_21_0"


    // $ANTLR start "rule__Parallele3__BAssignment_21_2"
    // InternalMyTurtleDsl.g:11047:1: rule__Parallele3__BAssignment_21_2 : ( ruleMD ) ;
    public final void rule__Parallele3__BAssignment_21_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:11051:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:11052:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:11052:2: ( ruleMD )
            // InternalMyTurtleDsl.g:11053:3: ruleMD
            {
             before(grammarAccess.getParallele3Access().getBMDParserRuleCall_21_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMD();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getBMDParserRuleCall_21_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__BAssignment_21_2"


    // $ANTLR start "rule__Parallele3__CAssignment_21_4"
    // InternalMyTurtleDsl.g:11062:1: rule__Parallele3__CAssignment_21_4 : ( ruleGDr ) ;
    public final void rule__Parallele3__CAssignment_21_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:11066:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:11067:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:11067:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:11068:3: ruleGDr
            {
             before(grammarAccess.getParallele3Access().getCGDrParserRuleCall_21_4_0()); 
            pushFollow(FOLLOW_2);
            ruleGDr();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getCGDrParserRuleCall_21_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__CAssignment_21_4"


    // $ANTLR start "rule__Parallele3__AAssignment_22_0"
    // InternalMyTurtleDsl.g:11077:1: rule__Parallele3__AAssignment_22_0 : ( ruleRGRD ) ;
    public final void rule__Parallele3__AAssignment_22_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:11081:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:11082:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:11082:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:11083:3: ruleRGRD
            {
             before(grammarAccess.getParallele3Access().getARGRDParserRuleCall_22_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRGRD();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getARGRDParserRuleCall_22_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__AAssignment_22_0"


    // $ANTLR start "rule__Parallele3__BAssignment_22_2"
    // InternalMyTurtleDsl.g:11092:1: rule__Parallele3__BAssignment_22_2 : ( ruleGDr ) ;
    public final void rule__Parallele3__BAssignment_22_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:11096:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:11097:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:11097:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:11098:3: ruleGDr
            {
             before(grammarAccess.getParallele3Access().getBGDrParserRuleCall_22_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGDr();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getBGDrParserRuleCall_22_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__BAssignment_22_2"


    // $ANTLR start "rule__Parallele3__CAssignment_22_4"
    // InternalMyTurtleDsl.g:11107:1: rule__Parallele3__CAssignment_22_4 : ( ruleMD ) ;
    public final void rule__Parallele3__CAssignment_22_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:11111:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:11112:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:11112:2: ( ruleMD )
            // InternalMyTurtleDsl.g:11113:3: ruleMD
            {
             before(grammarAccess.getParallele3Access().getCMDParserRuleCall_22_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMD();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getCMDParserRuleCall_22_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__CAssignment_22_4"


    // $ANTLR start "rule__Parallele3__AAssignment_23_0"
    // InternalMyTurtleDsl.g:11122:1: rule__Parallele3__AAssignment_23_0 : ( ruleRGRD ) ;
    public final void rule__Parallele3__AAssignment_23_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:11126:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:11127:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:11127:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:11128:3: ruleRGRD
            {
             before(grammarAccess.getParallele3Access().getARGRDParserRuleCall_23_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRGRD();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getARGRDParserRuleCall_23_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__AAssignment_23_0"


    // $ANTLR start "rule__Parallele3__BAssignment_23_2"
    // InternalMyTurtleDsl.g:11137:1: rule__Parallele3__BAssignment_23_2 : ( ruleGDr ) ;
    public final void rule__Parallele3__BAssignment_23_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:11141:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:11142:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:11142:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:11143:3: ruleGDr
            {
             before(grammarAccess.getParallele3Access().getBGDrParserRuleCall_23_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGDr();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getBGDrParserRuleCall_23_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__BAssignment_23_2"


    // $ANTLR start "rule__Parallele3__CAssignment_23_4"
    // InternalMyTurtleDsl.g:11152:1: rule__Parallele3__CAssignment_23_4 : ( ruleAR ) ;
    public final void rule__Parallele3__CAssignment_23_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:11156:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:11157:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:11157:2: ( ruleAR )
            // InternalMyTurtleDsl.g:11158:3: ruleAR
            {
             before(grammarAccess.getParallele3Access().getCARParserRuleCall_23_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAR();

            state._fsp--;

             after(grammarAccess.getParallele3Access().getCARParserRuleCall_23_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parallele3__CAssignment_23_4"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\106\uffff";
    static final String dfa_2s = "\1\5\2\uffff\10\26\1\uffff\10\5\10\37\2\27\6\37\5\5\1\uffff\3\5\20\27\10\5\1\uffff";
    static final String dfa_3s = "\1\51\2\uffff\10\26\1\uffff\10\6\20\37\5\6\1\uffff\3\6\20\27\10\52\1\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\10\uffff\1\4\35\uffff\1\3\33\uffff\1\5";
    static final String dfa_5s = "\106\uffff}>";
    static final String[] dfa_6s = {
            "\1\13\30\uffff\1\12\1\uffff\1\4\1\3\1\11\1\10\1\7\1\6\1\5\1\1\1\uffff\1\2",
            "",
            "",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "",
            "\1\25\1\24",
            "\1\27\1\26",
            "\1\31\1\30",
            "\1\33\1\32",
            "\1\35\1\34",
            "\1\37\1\36",
            "\1\41\1\40",
            "\1\43\1\42",
            "\1\44",
            "\1\44",
            "\1\45",
            "\1\45",
            "\1\46",
            "\1\46",
            "\1\47",
            "\1\47",
            "\1\51\7\uffff\1\50",
            "\1\51\7\uffff\1\50",
            "\1\52",
            "\1\52",
            "\1\53",
            "\1\53",
            "\1\54",
            "\1\54",
            "\1\56\1\55",
            "\1\60\1\57",
            "\1\62\1\61",
            "\1\64\1\63",
            "\1\66\1\65",
            "",
            "\1\70\1\67",
            "\1\72\1\71",
            "\1\74\1\73",
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
            "\1\51\6\uffff\1\51\20\uffff\2\51\1\uffff\10\51\1\uffff\1\51\1\105",
            "\1\51\6\uffff\1\51\20\uffff\2\51\1\uffff\10\51\1\uffff\1\51\1\105",
            "\1\51\6\uffff\1\51\20\uffff\2\51\1\uffff\10\51\1\uffff\1\51\1\105",
            "\1\51\6\uffff\1\51\20\uffff\2\51\1\uffff\10\51\1\uffff\1\51\1\105",
            "\1\51\6\uffff\1\51\20\uffff\2\51\1\uffff\10\51\1\uffff\1\51\1\105",
            "\1\51\6\uffff\1\51\20\uffff\2\51\1\uffff\10\51\1\uffff\1\51\1\105",
            "\1\51\6\uffff\1\51\20\uffff\2\51\1\uffff\10\51\1\uffff\1\51\1\105",
            "\1\51\6\uffff\1\51\20\uffff\2\51\1\uffff\10\51\1\uffff\1\51\1\105",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "902:1: rule__Model__Alternatives_20 : ( ( ( rule__Model__SeconDecAssignment_20_0 ) ) | ( ( rule__Model__PourDecAssignment_20_1 ) ) | ( ( rule__Model__StatementsAssignment_20_2 ) ) | ( ( rule__Model__FonctionsAssignment_20_3 ) ) | ( ( rule__Model__ParalleleAssignment_20_4 ) ) );";
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
            "\1\105\1\106\1\107\1\110\1\111\1\112",
            "\1\115\1\uffff\1\116\1\117\1\120\2\uffff\1\113\1\114",
            "\1\123\1\uffff\1\124\1\121\1\122\1\125\1\126",
            "\1\127\1\uffff\1\130\2\uffff\1\131\1\132\1\133\1\134",
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

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "941:1: rule__Model__ParalleleAlternatives_20_4_0 : ( ( ruleParallele2 ) | ( ruleParallele3 ) );";
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

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "962:1: rule__Statement__Alternatives : ( ( ruleAvancer ) | ( ruleDescendre ) | ( ruleRotationDroite ) | ( ruleRotationGauche ) | ( rulePause ) | ( ruleDroite ) | ( ruleGauche ) | ( ruleReculer ) | ( ruleMonter ) );";
        }
    }
    static final String dfa_19s = "\121\uffff";
    static final String dfa_20s = "\1\36\10\26\10\5\20\37\10\5\20\27\10\52\1\41\3\36\14\uffff";
    static final String dfa_21s = "\1\46\10\26\10\6\20\37\10\6\20\27\10\52\2\46\1\44\1\46\14\uffff";
    static final String dfa_22s = "\105\uffff\1\1\1\3\1\2\1\6\1\5\1\4\1\11\1\10\1\7\1\14\1\13\1\12";
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
            "\1\111\1\uffff\1\111\2\112\2\uffff\2\110",
            "\1\115\1\uffff\1\115\2\114\2\113",
            "\1\120\1\uffff\1\120\2\uffff\2\116\2\117",
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

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_19;
            this.eof = dfa_19;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "1130:1: rule__Parallele2__Alternatives : ( ( ( rule__Parallele2__Group_0__0 ) ) | ( ( rule__Parallele2__Group_1__0 ) ) | ( ( rule__Parallele2__Group_2__0 ) ) | ( ( rule__Parallele2__Group_3__0 ) ) | ( ( rule__Parallele2__Group_4__0 ) ) | ( ( rule__Parallele2__Group_5__0 ) ) | ( ( rule__Parallele2__Group_6__0 ) ) | ( ( rule__Parallele2__Group_7__0 ) ) | ( ( rule__Parallele2__Group_8__0 ) ) | ( ( rule__Parallele2__Group_9__0 ) ) | ( ( rule__Parallele2__Group_10__0 ) ) | ( ( rule__Parallele2__Group_11__0 ) ) );";
        }
    }
    static final String dfa_25s = "\u0129\uffff";
    static final String dfa_26s = "\1\36\10\26\10\5\20\37\10\5\20\27\10\52\2\36\1\41\1\36\30\26\30\5\60\37\30\5\60\27\30\52\1\36\1\43\1\36\1\41\2\36\2\41\1\43\1\36\1\41\1\36\30\uffff";
    static final String dfa_27s = "\1\46\10\26\10\6\20\37\10\6\20\27\10\52\3\46\1\44\30\26\30\6\60\37\30\6\60\27\30\52\1\44\4\46\1\42\1\44\2\46\1\42\2\44\30\uffff";
    static final String dfa_28s = "\u0111\uffff\1\6\1\5\1\3\1\4\1\1\1\2\1\11\1\12\1\7\1\10\1\13\1\14\1\21\1\22\1\17\1\20\1\15\1\16\1\27\1\30\1\26\1\25\1\23\1\24";
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
            "\1\107\1\uffff\1\110\2\uffff\1\111\1\112\1\105\1\106",
            "\1\113\1\uffff\1\114\1\115\1\116\2\uffff\1\117\1\120",
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
            "\1\u0112\1\uffff\1\u0112\2\uffff\2\u0111",
            "\2\u0113\2\u0114",
            "\1\u0115\1\uffff\1\u0115\4\uffff\2\u0116",
            "\2\u0117\2\uffff\2\u0118",
            "\1\u0119\1\uffff\1\u0119\4\uffff\2\u011a",
            "\1\u011c\1\uffff\1\u011c\2\u011b",
            "\2\u011e\2\u011d",
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

    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[][] dfa_30 = unpackEncodedStringArray(dfa_30s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_25;
            this.eof = dfa_25;
            this.min = dfa_26;
            this.max = dfa_27;
            this.accept = dfa_28;
            this.special = dfa_29;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "1211:1: rule__Parallele3__Alternatives : ( ( ( rule__Parallele3__Group_0__0 ) ) | ( ( rule__Parallele3__Group_1__0 ) ) | ( ( rule__Parallele3__Group_2__0 ) ) | ( ( rule__Parallele3__Group_3__0 ) ) | ( ( rule__Parallele3__Group_4__0 ) ) | ( ( rule__Parallele3__Group_5__0 ) ) | ( ( rule__Parallele3__Group_6__0 ) ) | ( ( rule__Parallele3__Group_7__0 ) ) | ( ( rule__Parallele3__Group_8__0 ) ) | ( ( rule__Parallele3__Group_9__0 ) ) | ( ( rule__Parallele3__Group_10__0 ) ) | ( ( rule__Parallele3__Group_11__0 ) ) | ( ( rule__Parallele3__Group_12__0 ) ) | ( ( rule__Parallele3__Group_13__0 ) ) | ( ( rule__Parallele3__Group_14__0 ) ) | ( ( rule__Parallele3__Group_15__0 ) ) | ( ( rule__Parallele3__Group_16__0 ) ) | ( ( rule__Parallele3__Group_17__0 ) ) | ( ( rule__Parallele3__Group_18__0 ) ) | ( ( rule__Parallele3__Group_19__0 ) ) | ( ( rule__Parallele3__Group_20__0 ) ) | ( ( rule__Parallele3__Group_21__0 ) ) | ( ( rule__Parallele3__Group_22__0 ) ) | ( ( rule__Parallele3__Group_23__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000043002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000043000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002001000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004001000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008001000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000002FF60001020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000002FF40000022L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000007F40001000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000007F40000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000007F40000000L});

}