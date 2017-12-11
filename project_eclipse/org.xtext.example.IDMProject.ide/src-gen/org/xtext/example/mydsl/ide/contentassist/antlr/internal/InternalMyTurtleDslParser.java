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
    // InternalMyTurtleDsl.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalMyTurtleDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalMyTurtleDsl.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalMyTurtleDsl.g:69:3: ( rule__Model__Group__0 )
            // InternalMyTurtleDsl.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

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


    // $ANTLR start "entryRuleMain"
    // InternalMyTurtleDsl.g:78:1: entryRuleMain : ruleMain EOF ;
    public final void entryRuleMain() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:79:1: ( ruleMain EOF )
            // InternalMyTurtleDsl.g:80:1: ruleMain EOF
            {
             before(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_1);
            ruleMain();

            state._fsp--;

             after(grammarAccess.getMainRule()); 
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
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // InternalMyTurtleDsl.g:87:1: ruleMain : ( ( rule__Main__Group__0 ) ) ;
    public final void ruleMain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:91:2: ( ( ( rule__Main__Group__0 ) ) )
            // InternalMyTurtleDsl.g:92:2: ( ( rule__Main__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:92:2: ( ( rule__Main__Group__0 ) )
            // InternalMyTurtleDsl.g:93:3: ( rule__Main__Group__0 )
            {
             before(grammarAccess.getMainAccess().getGroup()); 
            // InternalMyTurtleDsl.g:94:3: ( rule__Main__Group__0 )
            // InternalMyTurtleDsl.g:94:4: rule__Main__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Main__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRulePourcentConst"
    // InternalMyTurtleDsl.g:103:1: entryRulePourcentConst : rulePourcentConst EOF ;
    public final void entryRulePourcentConst() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:104:1: ( rulePourcentConst EOF )
            // InternalMyTurtleDsl.g:105:1: rulePourcentConst EOF
            {
             before(grammarAccess.getPourcentConstRule()); 
            pushFollow(FOLLOW_1);
            rulePourcentConst();

            state._fsp--;

             after(grammarAccess.getPourcentConstRule()); 
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
    // $ANTLR end "entryRulePourcentConst"


    // $ANTLR start "rulePourcentConst"
    // InternalMyTurtleDsl.g:112:1: rulePourcentConst : ( ( rule__PourcentConst__ValAssignment ) ) ;
    public final void rulePourcentConst() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:116:2: ( ( ( rule__PourcentConst__ValAssignment ) ) )
            // InternalMyTurtleDsl.g:117:2: ( ( rule__PourcentConst__ValAssignment ) )
            {
            // InternalMyTurtleDsl.g:117:2: ( ( rule__PourcentConst__ValAssignment ) )
            // InternalMyTurtleDsl.g:118:3: ( rule__PourcentConst__ValAssignment )
            {
             before(grammarAccess.getPourcentConstAccess().getValAssignment()); 
            // InternalMyTurtleDsl.g:119:3: ( rule__PourcentConst__ValAssignment )
            // InternalMyTurtleDsl.g:119:4: rule__PourcentConst__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__PourcentConst__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPourcentConstAccess().getValAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePourcentConst"


    // $ANTLR start "entryRuleImport"
    // InternalMyTurtleDsl.g:128:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:129:1: ( ruleImport EOF )
            // InternalMyTurtleDsl.g:130:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalMyTurtleDsl.g:137:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:141:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalMyTurtleDsl.g:142:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:142:2: ( ( rule__Import__Group__0 ) )
            // InternalMyTurtleDsl.g:143:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalMyTurtleDsl.g:144:3: ( rule__Import__Group__0 )
            // InternalMyTurtleDsl.g:144:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRulePourcent_vitesse_hauteur_max"
    // InternalMyTurtleDsl.g:153:1: entryRulePourcent_vitesse_hauteur_max : rulePourcent_vitesse_hauteur_max EOF ;
    public final void entryRulePourcent_vitesse_hauteur_max() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:154:1: ( rulePourcent_vitesse_hauteur_max EOF )
            // InternalMyTurtleDsl.g:155:1: rulePourcent_vitesse_hauteur_max EOF
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
    // InternalMyTurtleDsl.g:162:1: rulePourcent_vitesse_hauteur_max : ( ( rule__Pourcent_vitesse_hauteur_max__Group__0 ) ) ;
    public final void rulePourcent_vitesse_hauteur_max() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:166:2: ( ( ( rule__Pourcent_vitesse_hauteur_max__Group__0 ) ) )
            // InternalMyTurtleDsl.g:167:2: ( ( rule__Pourcent_vitesse_hauteur_max__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:167:2: ( ( rule__Pourcent_vitesse_hauteur_max__Group__0 ) )
            // InternalMyTurtleDsl.g:168:3: ( rule__Pourcent_vitesse_hauteur_max__Group__0 )
            {
             before(grammarAccess.getPourcent_vitesse_hauteur_maxAccess().getGroup()); 
            // InternalMyTurtleDsl.g:169:3: ( rule__Pourcent_vitesse_hauteur_max__Group__0 )
            // InternalMyTurtleDsl.g:169:4: rule__Pourcent_vitesse_hauteur_max__Group__0
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
    // InternalMyTurtleDsl.g:178:1: entryRulePourcent_vitesse_deplacement_max : rulePourcent_vitesse_deplacement_max EOF ;
    public final void entryRulePourcent_vitesse_deplacement_max() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:179:1: ( rulePourcent_vitesse_deplacement_max EOF )
            // InternalMyTurtleDsl.g:180:1: rulePourcent_vitesse_deplacement_max EOF
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
    // InternalMyTurtleDsl.g:187:1: rulePourcent_vitesse_deplacement_max : ( ( rule__Pourcent_vitesse_deplacement_max__Group__0 ) ) ;
    public final void rulePourcent_vitesse_deplacement_max() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:191:2: ( ( ( rule__Pourcent_vitesse_deplacement_max__Group__0 ) ) )
            // InternalMyTurtleDsl.g:192:2: ( ( rule__Pourcent_vitesse_deplacement_max__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:192:2: ( ( rule__Pourcent_vitesse_deplacement_max__Group__0 ) )
            // InternalMyTurtleDsl.g:193:3: ( rule__Pourcent_vitesse_deplacement_max__Group__0 )
            {
             before(grammarAccess.getPourcent_vitesse_deplacement_maxAccess().getGroup()); 
            // InternalMyTurtleDsl.g:194:3: ( rule__Pourcent_vitesse_deplacement_max__Group__0 )
            // InternalMyTurtleDsl.g:194:4: rule__Pourcent_vitesse_deplacement_max__Group__0
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
    // InternalMyTurtleDsl.g:203:1: entryRulePourcent_vitesse_rotation_max : rulePourcent_vitesse_rotation_max EOF ;
    public final void entryRulePourcent_vitesse_rotation_max() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:204:1: ( rulePourcent_vitesse_rotation_max EOF )
            // InternalMyTurtleDsl.g:205:1: rulePourcent_vitesse_rotation_max EOF
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
    // InternalMyTurtleDsl.g:212:1: rulePourcent_vitesse_rotation_max : ( ( rule__Pourcent_vitesse_rotation_max__Group__0 ) ) ;
    public final void rulePourcent_vitesse_rotation_max() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:216:2: ( ( ( rule__Pourcent_vitesse_rotation_max__Group__0 ) ) )
            // InternalMyTurtleDsl.g:217:2: ( ( rule__Pourcent_vitesse_rotation_max__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:217:2: ( ( rule__Pourcent_vitesse_rotation_max__Group__0 ) )
            // InternalMyTurtleDsl.g:218:3: ( rule__Pourcent_vitesse_rotation_max__Group__0 )
            {
             before(grammarAccess.getPourcent_vitesse_rotation_maxAccess().getGroup()); 
            // InternalMyTurtleDsl.g:219:3: ( rule__Pourcent_vitesse_rotation_max__Group__0 )
            // InternalMyTurtleDsl.g:219:4: rule__Pourcent_vitesse_rotation_max__Group__0
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
    // InternalMyTurtleDsl.g:228:1: entryRuleHauteur_max : ruleHauteur_max EOF ;
    public final void entryRuleHauteur_max() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:229:1: ( ruleHauteur_max EOF )
            // InternalMyTurtleDsl.g:230:1: ruleHauteur_max EOF
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
    // InternalMyTurtleDsl.g:237:1: ruleHauteur_max : ( ( rule__Hauteur_max__Group__0 ) ) ;
    public final void ruleHauteur_max() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:241:2: ( ( ( rule__Hauteur_max__Group__0 ) ) )
            // InternalMyTurtleDsl.g:242:2: ( ( rule__Hauteur_max__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:242:2: ( ( rule__Hauteur_max__Group__0 ) )
            // InternalMyTurtleDsl.g:243:3: ( rule__Hauteur_max__Group__0 )
            {
             before(grammarAccess.getHauteur_maxAccess().getGroup()); 
            // InternalMyTurtleDsl.g:244:3: ( rule__Hauteur_max__Group__0 )
            // InternalMyTurtleDsl.g:244:4: rule__Hauteur_max__Group__0
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
    // InternalMyTurtleDsl.g:253:1: entryRuleEloignement_max : ruleEloignement_max EOF ;
    public final void entryRuleEloignement_max() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:254:1: ( ruleEloignement_max EOF )
            // InternalMyTurtleDsl.g:255:1: ruleEloignement_max EOF
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
    // InternalMyTurtleDsl.g:262:1: ruleEloignement_max : ( ( rule__Eloignement_max__Group__0 ) ) ;
    public final void ruleEloignement_max() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:266:2: ( ( ( rule__Eloignement_max__Group__0 ) ) )
            // InternalMyTurtleDsl.g:267:2: ( ( rule__Eloignement_max__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:267:2: ( ( rule__Eloignement_max__Group__0 ) )
            // InternalMyTurtleDsl.g:268:3: ( rule__Eloignement_max__Group__0 )
            {
             before(grammarAccess.getEloignement_maxAccess().getGroup()); 
            // InternalMyTurtleDsl.g:269:3: ( rule__Eloignement_max__Group__0 )
            // InternalMyTurtleDsl.g:269:4: rule__Eloignement_max__Group__0
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
    // InternalMyTurtleDsl.g:278:1: entryRuleDecoller : ruleDecoller EOF ;
    public final void entryRuleDecoller() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:279:1: ( ruleDecoller EOF )
            // InternalMyTurtleDsl.g:280:1: ruleDecoller EOF
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
    // InternalMyTurtleDsl.g:287:1: ruleDecoller : ( ( rule__Decoller__Group__0 ) ) ;
    public final void ruleDecoller() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:291:2: ( ( ( rule__Decoller__Group__0 ) ) )
            // InternalMyTurtleDsl.g:292:2: ( ( rule__Decoller__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:292:2: ( ( rule__Decoller__Group__0 ) )
            // InternalMyTurtleDsl.g:293:3: ( rule__Decoller__Group__0 )
            {
             before(grammarAccess.getDecollerAccess().getGroup()); 
            // InternalMyTurtleDsl.g:294:3: ( rule__Decoller__Group__0 )
            // InternalMyTurtleDsl.g:294:4: rule__Decoller__Group__0
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
    // InternalMyTurtleDsl.g:303:1: entryRuleAtterrir : ruleAtterrir EOF ;
    public final void entryRuleAtterrir() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:304:1: ( ruleAtterrir EOF )
            // InternalMyTurtleDsl.g:305:1: ruleAtterrir EOF
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
    // InternalMyTurtleDsl.g:312:1: ruleAtterrir : ( ( rule__Atterrir__Group__0 ) ) ;
    public final void ruleAtterrir() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:316:2: ( ( ( rule__Atterrir__Group__0 ) ) )
            // InternalMyTurtleDsl.g:317:2: ( ( rule__Atterrir__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:317:2: ( ( rule__Atterrir__Group__0 ) )
            // InternalMyTurtleDsl.g:318:3: ( rule__Atterrir__Group__0 )
            {
             before(grammarAccess.getAtterrirAccess().getGroup()); 
            // InternalMyTurtleDsl.g:319:3: ( rule__Atterrir__Group__0 )
            // InternalMyTurtleDsl.g:319:4: rule__Atterrir__Group__0
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
    // InternalMyTurtleDsl.g:328:1: entryRuleMonter : ruleMonter EOF ;
    public final void entryRuleMonter() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:329:1: ( ruleMonter EOF )
            // InternalMyTurtleDsl.g:330:1: ruleMonter EOF
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
    // InternalMyTurtleDsl.g:337:1: ruleMonter : ( ( rule__Monter__Group__0 ) ) ;
    public final void ruleMonter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:341:2: ( ( ( rule__Monter__Group__0 ) ) )
            // InternalMyTurtleDsl.g:342:2: ( ( rule__Monter__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:342:2: ( ( rule__Monter__Group__0 ) )
            // InternalMyTurtleDsl.g:343:3: ( rule__Monter__Group__0 )
            {
             before(grammarAccess.getMonterAccess().getGroup()); 
            // InternalMyTurtleDsl.g:344:3: ( rule__Monter__Group__0 )
            // InternalMyTurtleDsl.g:344:4: rule__Monter__Group__0
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
    // InternalMyTurtleDsl.g:353:1: entryRuleDescendre : ruleDescendre EOF ;
    public final void entryRuleDescendre() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:354:1: ( ruleDescendre EOF )
            // InternalMyTurtleDsl.g:355:1: ruleDescendre EOF
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
    // InternalMyTurtleDsl.g:362:1: ruleDescendre : ( ( rule__Descendre__Group__0 ) ) ;
    public final void ruleDescendre() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:366:2: ( ( ( rule__Descendre__Group__0 ) ) )
            // InternalMyTurtleDsl.g:367:2: ( ( rule__Descendre__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:367:2: ( ( rule__Descendre__Group__0 ) )
            // InternalMyTurtleDsl.g:368:3: ( rule__Descendre__Group__0 )
            {
             before(grammarAccess.getDescendreAccess().getGroup()); 
            // InternalMyTurtleDsl.g:369:3: ( rule__Descendre__Group__0 )
            // InternalMyTurtleDsl.g:369:4: rule__Descendre__Group__0
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
    // InternalMyTurtleDsl.g:378:1: entryRuleAvancer : ruleAvancer EOF ;
    public final void entryRuleAvancer() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:379:1: ( ruleAvancer EOF )
            // InternalMyTurtleDsl.g:380:1: ruleAvancer EOF
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
    // InternalMyTurtleDsl.g:387:1: ruleAvancer : ( ( rule__Avancer__Group__0 ) ) ;
    public final void ruleAvancer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:391:2: ( ( ( rule__Avancer__Group__0 ) ) )
            // InternalMyTurtleDsl.g:392:2: ( ( rule__Avancer__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:392:2: ( ( rule__Avancer__Group__0 ) )
            // InternalMyTurtleDsl.g:393:3: ( rule__Avancer__Group__0 )
            {
             before(grammarAccess.getAvancerAccess().getGroup()); 
            // InternalMyTurtleDsl.g:394:3: ( rule__Avancer__Group__0 )
            // InternalMyTurtleDsl.g:394:4: rule__Avancer__Group__0
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
    // InternalMyTurtleDsl.g:403:1: entryRuleReculer : ruleReculer EOF ;
    public final void entryRuleReculer() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:404:1: ( ruleReculer EOF )
            // InternalMyTurtleDsl.g:405:1: ruleReculer EOF
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
    // InternalMyTurtleDsl.g:412:1: ruleReculer : ( ( rule__Reculer__Group__0 ) ) ;
    public final void ruleReculer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:416:2: ( ( ( rule__Reculer__Group__0 ) ) )
            // InternalMyTurtleDsl.g:417:2: ( ( rule__Reculer__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:417:2: ( ( rule__Reculer__Group__0 ) )
            // InternalMyTurtleDsl.g:418:3: ( rule__Reculer__Group__0 )
            {
             before(grammarAccess.getReculerAccess().getGroup()); 
            // InternalMyTurtleDsl.g:419:3: ( rule__Reculer__Group__0 )
            // InternalMyTurtleDsl.g:419:4: rule__Reculer__Group__0
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
    // InternalMyTurtleDsl.g:428:1: entryRuleGauche : ruleGauche EOF ;
    public final void entryRuleGauche() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:429:1: ( ruleGauche EOF )
            // InternalMyTurtleDsl.g:430:1: ruleGauche EOF
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
    // InternalMyTurtleDsl.g:437:1: ruleGauche : ( ( rule__Gauche__Group__0 ) ) ;
    public final void ruleGauche() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:441:2: ( ( ( rule__Gauche__Group__0 ) ) )
            // InternalMyTurtleDsl.g:442:2: ( ( rule__Gauche__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:442:2: ( ( rule__Gauche__Group__0 ) )
            // InternalMyTurtleDsl.g:443:3: ( rule__Gauche__Group__0 )
            {
             before(grammarAccess.getGaucheAccess().getGroup()); 
            // InternalMyTurtleDsl.g:444:3: ( rule__Gauche__Group__0 )
            // InternalMyTurtleDsl.g:444:4: rule__Gauche__Group__0
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
    // InternalMyTurtleDsl.g:453:1: entryRuleDroite : ruleDroite EOF ;
    public final void entryRuleDroite() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:454:1: ( ruleDroite EOF )
            // InternalMyTurtleDsl.g:455:1: ruleDroite EOF
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
    // InternalMyTurtleDsl.g:462:1: ruleDroite : ( ( rule__Droite__Group__0 ) ) ;
    public final void ruleDroite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:466:2: ( ( ( rule__Droite__Group__0 ) ) )
            // InternalMyTurtleDsl.g:467:2: ( ( rule__Droite__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:467:2: ( ( rule__Droite__Group__0 ) )
            // InternalMyTurtleDsl.g:468:3: ( rule__Droite__Group__0 )
            {
             before(grammarAccess.getDroiteAccess().getGroup()); 
            // InternalMyTurtleDsl.g:469:3: ( rule__Droite__Group__0 )
            // InternalMyTurtleDsl.g:469:4: rule__Droite__Group__0
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
    // InternalMyTurtleDsl.g:478:1: entryRulePause : rulePause EOF ;
    public final void entryRulePause() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:479:1: ( rulePause EOF )
            // InternalMyTurtleDsl.g:480:1: rulePause EOF
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
    // InternalMyTurtleDsl.g:487:1: rulePause : ( ( rule__Pause__Group__0 ) ) ;
    public final void rulePause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:491:2: ( ( ( rule__Pause__Group__0 ) ) )
            // InternalMyTurtleDsl.g:492:2: ( ( rule__Pause__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:492:2: ( ( rule__Pause__Group__0 ) )
            // InternalMyTurtleDsl.g:493:3: ( rule__Pause__Group__0 )
            {
             before(grammarAccess.getPauseAccess().getGroup()); 
            // InternalMyTurtleDsl.g:494:3: ( rule__Pause__Group__0 )
            // InternalMyTurtleDsl.g:494:4: rule__Pause__Group__0
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
    // InternalMyTurtleDsl.g:503:1: entryRuleRotationGauche : ruleRotationGauche EOF ;
    public final void entryRuleRotationGauche() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:504:1: ( ruleRotationGauche EOF )
            // InternalMyTurtleDsl.g:505:1: ruleRotationGauche EOF
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
    // InternalMyTurtleDsl.g:512:1: ruleRotationGauche : ( ( rule__RotationGauche__Group__0 ) ) ;
    public final void ruleRotationGauche() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:516:2: ( ( ( rule__RotationGauche__Group__0 ) ) )
            // InternalMyTurtleDsl.g:517:2: ( ( rule__RotationGauche__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:517:2: ( ( rule__RotationGauche__Group__0 ) )
            // InternalMyTurtleDsl.g:518:3: ( rule__RotationGauche__Group__0 )
            {
             before(grammarAccess.getRotationGaucheAccess().getGroup()); 
            // InternalMyTurtleDsl.g:519:3: ( rule__RotationGauche__Group__0 )
            // InternalMyTurtleDsl.g:519:4: rule__RotationGauche__Group__0
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
    // InternalMyTurtleDsl.g:528:1: entryRuleRotationDroite : ruleRotationDroite EOF ;
    public final void entryRuleRotationDroite() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:529:1: ( ruleRotationDroite EOF )
            // InternalMyTurtleDsl.g:530:1: ruleRotationDroite EOF
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
    // InternalMyTurtleDsl.g:537:1: ruleRotationDroite : ( ( rule__RotationDroite__Group__0 ) ) ;
    public final void ruleRotationDroite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:541:2: ( ( ( rule__RotationDroite__Group__0 ) ) )
            // InternalMyTurtleDsl.g:542:2: ( ( rule__RotationDroite__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:542:2: ( ( rule__RotationDroite__Group__0 ) )
            // InternalMyTurtleDsl.g:543:3: ( rule__RotationDroite__Group__0 )
            {
             before(grammarAccess.getRotationDroiteAccess().getGroup()); 
            // InternalMyTurtleDsl.g:544:3: ( rule__RotationDroite__Group__0 )
            // InternalMyTurtleDsl.g:544:4: rule__RotationDroite__Group__0
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
    // InternalMyTurtleDsl.g:553:1: entryRuleStart : ruleStart EOF ;
    public final void entryRuleStart() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:554:1: ( ruleStart EOF )
            // InternalMyTurtleDsl.g:555:1: ruleStart EOF
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
    // InternalMyTurtleDsl.g:562:1: ruleStart : ( ruleDecoller ) ;
    public final void ruleStart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:566:2: ( ( ruleDecoller ) )
            // InternalMyTurtleDsl.g:567:2: ( ruleDecoller )
            {
            // InternalMyTurtleDsl.g:567:2: ( ruleDecoller )
            // InternalMyTurtleDsl.g:568:3: ruleDecoller
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
    // InternalMyTurtleDsl.g:578:1: entryRuleEnd : ruleEnd EOF ;
    public final void entryRuleEnd() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:579:1: ( ruleEnd EOF )
            // InternalMyTurtleDsl.g:580:1: ruleEnd EOF
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
    // InternalMyTurtleDsl.g:587:1: ruleEnd : ( ruleAtterrir ) ;
    public final void ruleEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:591:2: ( ( ruleAtterrir ) )
            // InternalMyTurtleDsl.g:592:2: ( ruleAtterrir )
            {
            // InternalMyTurtleDsl.g:592:2: ( ruleAtterrir )
            // InternalMyTurtleDsl.g:593:3: ruleAtterrir
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
    // InternalMyTurtleDsl.g:603:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:604:1: ( ruleStatement EOF )
            // InternalMyTurtleDsl.g:605:1: ruleStatement EOF
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
    // InternalMyTurtleDsl.g:612:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:616:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalMyTurtleDsl.g:617:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalMyTurtleDsl.g:617:2: ( ( rule__Statement__Alternatives ) )
            // InternalMyTurtleDsl.g:618:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalMyTurtleDsl.g:619:3: ( rule__Statement__Alternatives )
            // InternalMyTurtleDsl.g:619:4: rule__Statement__Alternatives
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
    // InternalMyTurtleDsl.g:628:1: entryRuleFonctionDecl : ruleFonctionDecl EOF ;
    public final void entryRuleFonctionDecl() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:629:1: ( ruleFonctionDecl EOF )
            // InternalMyTurtleDsl.g:630:1: ruleFonctionDecl EOF
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
    // InternalMyTurtleDsl.g:637:1: ruleFonctionDecl : ( ( rule__FonctionDecl__Group__0 ) ) ;
    public final void ruleFonctionDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:641:2: ( ( ( rule__FonctionDecl__Group__0 ) ) )
            // InternalMyTurtleDsl.g:642:2: ( ( rule__FonctionDecl__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:642:2: ( ( rule__FonctionDecl__Group__0 ) )
            // InternalMyTurtleDsl.g:643:3: ( rule__FonctionDecl__Group__0 )
            {
             before(grammarAccess.getFonctionDeclAccess().getGroup()); 
            // InternalMyTurtleDsl.g:644:3: ( rule__FonctionDecl__Group__0 )
            // InternalMyTurtleDsl.g:644:4: rule__FonctionDecl__Group__0
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


    // $ANTLR start "entryRuleIntDecl"
    // InternalMyTurtleDsl.g:678:1: entryRuleIntDecl : ruleIntDecl EOF ;
    public final void entryRuleIntDecl() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:679:1: ( ruleIntDecl EOF )
            // InternalMyTurtleDsl.g:680:1: ruleIntDecl EOF
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
    // InternalMyTurtleDsl.g:687:1: ruleIntDecl : ( ( rule__IntDecl__Group__0 ) ) ;
    public final void ruleIntDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:691:2: ( ( ( rule__IntDecl__Group__0 ) ) )
            // InternalMyTurtleDsl.g:692:2: ( ( rule__IntDecl__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:692:2: ( ( rule__IntDecl__Group__0 ) )
            // InternalMyTurtleDsl.g:693:3: ( rule__IntDecl__Group__0 )
            {
             before(grammarAccess.getIntDeclAccess().getGroup()); 
            // InternalMyTurtleDsl.g:694:3: ( rule__IntDecl__Group__0 )
            // InternalMyTurtleDsl.g:694:4: rule__IntDecl__Group__0
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


    // $ANTLR start "entryRulePourcentExp"
    // InternalMyTurtleDsl.g:703:1: entryRulePourcentExp : rulePourcentExp EOF ;
    public final void entryRulePourcentExp() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:704:1: ( rulePourcentExp EOF )
            // InternalMyTurtleDsl.g:705:1: rulePourcentExp EOF
            {
             before(grammarAccess.getPourcentExpRule()); 
            pushFollow(FOLLOW_1);
            rulePourcentExp();

            state._fsp--;

             after(grammarAccess.getPourcentExpRule()); 
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
    // $ANTLR end "entryRulePourcentExp"


    // $ANTLR start "rulePourcentExp"
    // InternalMyTurtleDsl.g:712:1: rulePourcentExp : ( ( rule__PourcentExp__Alternatives ) ) ;
    public final void rulePourcentExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:716:2: ( ( ( rule__PourcentExp__Alternatives ) ) )
            // InternalMyTurtleDsl.g:717:2: ( ( rule__PourcentExp__Alternatives ) )
            {
            // InternalMyTurtleDsl.g:717:2: ( ( rule__PourcentExp__Alternatives ) )
            // InternalMyTurtleDsl.g:718:3: ( rule__PourcentExp__Alternatives )
            {
             before(grammarAccess.getPourcentExpAccess().getAlternatives()); 
            // InternalMyTurtleDsl.g:719:3: ( rule__PourcentExp__Alternatives )
            // InternalMyTurtleDsl.g:719:4: rule__PourcentExp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PourcentExp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPourcentExpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePourcentExp"


    // $ANTLR start "entryRuleRefIntVar"
    // InternalMyTurtleDsl.g:728:1: entryRuleRefIntVar : ruleRefIntVar EOF ;
    public final void entryRuleRefIntVar() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:729:1: ( ruleRefIntVar EOF )
            // InternalMyTurtleDsl.g:730:1: ruleRefIntVar EOF
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
    // InternalMyTurtleDsl.g:737:1: ruleRefIntVar : ( ( rule__RefIntVar__VarAssignment ) ) ;
    public final void ruleRefIntVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:741:2: ( ( ( rule__RefIntVar__VarAssignment ) ) )
            // InternalMyTurtleDsl.g:742:2: ( ( rule__RefIntVar__VarAssignment ) )
            {
            // InternalMyTurtleDsl.g:742:2: ( ( rule__RefIntVar__VarAssignment ) )
            // InternalMyTurtleDsl.g:743:3: ( rule__RefIntVar__VarAssignment )
            {
             before(grammarAccess.getRefIntVarAccess().getVarAssignment()); 
            // InternalMyTurtleDsl.g:744:3: ( rule__RefIntVar__VarAssignment )
            // InternalMyTurtleDsl.g:744:4: rule__RefIntVar__VarAssignment
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


    // $ANTLR start "entryRuleRefPourcentVar"
    // InternalMyTurtleDsl.g:753:1: entryRuleRefPourcentVar : ruleRefPourcentVar EOF ;
    public final void entryRuleRefPourcentVar() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:754:1: ( ruleRefPourcentVar EOF )
            // InternalMyTurtleDsl.g:755:1: ruleRefPourcentVar EOF
            {
             before(grammarAccess.getRefPourcentVarRule()); 
            pushFollow(FOLLOW_1);
            ruleRefPourcentVar();

            state._fsp--;

             after(grammarAccess.getRefPourcentVarRule()); 
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
    // $ANTLR end "entryRuleRefPourcentVar"


    // $ANTLR start "ruleRefPourcentVar"
    // InternalMyTurtleDsl.g:762:1: ruleRefPourcentVar : ( ( rule__RefPourcentVar__VarAssignment ) ) ;
    public final void ruleRefPourcentVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:766:2: ( ( ( rule__RefPourcentVar__VarAssignment ) ) )
            // InternalMyTurtleDsl.g:767:2: ( ( rule__RefPourcentVar__VarAssignment ) )
            {
            // InternalMyTurtleDsl.g:767:2: ( ( rule__RefPourcentVar__VarAssignment ) )
            // InternalMyTurtleDsl.g:768:3: ( rule__RefPourcentVar__VarAssignment )
            {
             before(grammarAccess.getRefPourcentVarAccess().getVarAssignment()); 
            // InternalMyTurtleDsl.g:769:3: ( rule__RefPourcentVar__VarAssignment )
            // InternalMyTurtleDsl.g:769:4: rule__RefPourcentVar__VarAssignment
            {
            pushFollow(FOLLOW_2);
            rule__RefPourcentVar__VarAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRefPourcentVarAccess().getVarAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRefPourcentVar"


    // $ANTLR start "entryRuleIntConstante"
    // InternalMyTurtleDsl.g:778:1: entryRuleIntConstante : ruleIntConstante EOF ;
    public final void entryRuleIntConstante() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:779:1: ( ruleIntConstante EOF )
            // InternalMyTurtleDsl.g:780:1: ruleIntConstante EOF
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
    // InternalMyTurtleDsl.g:787:1: ruleIntConstante : ( ( rule__IntConstante__ValAssignment ) ) ;
    public final void ruleIntConstante() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:791:2: ( ( ( rule__IntConstante__ValAssignment ) ) )
            // InternalMyTurtleDsl.g:792:2: ( ( rule__IntConstante__ValAssignment ) )
            {
            // InternalMyTurtleDsl.g:792:2: ( ( rule__IntConstante__ValAssignment ) )
            // InternalMyTurtleDsl.g:793:3: ( rule__IntConstante__ValAssignment )
            {
             before(grammarAccess.getIntConstanteAccess().getValAssignment()); 
            // InternalMyTurtleDsl.g:794:3: ( rule__IntConstante__ValAssignment )
            // InternalMyTurtleDsl.g:794:4: rule__IntConstante__ValAssignment
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


    // $ANTLR start "entryRuleIntExp"
    // InternalMyTurtleDsl.g:803:1: entryRuleIntExp : ruleIntExp EOF ;
    public final void entryRuleIntExp() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:804:1: ( ruleIntExp EOF )
            // InternalMyTurtleDsl.g:805:1: ruleIntExp EOF
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
    // InternalMyTurtleDsl.g:812:1: ruleIntExp : ( ( rule__IntExp__Alternatives ) ) ;
    public final void ruleIntExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:816:2: ( ( ( rule__IntExp__Alternatives ) ) )
            // InternalMyTurtleDsl.g:817:2: ( ( rule__IntExp__Alternatives ) )
            {
            // InternalMyTurtleDsl.g:817:2: ( ( rule__IntExp__Alternatives ) )
            // InternalMyTurtleDsl.g:818:3: ( rule__IntExp__Alternatives )
            {
             before(grammarAccess.getIntExpAccess().getAlternatives()); 
            // InternalMyTurtleDsl.g:819:3: ( rule__IntExp__Alternatives )
            // InternalMyTurtleDsl.g:819:4: rule__IntExp__Alternatives
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
    // InternalMyTurtleDsl.g:828:1: entryRuleFonctionCall : ruleFonctionCall EOF ;
    public final void entryRuleFonctionCall() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:829:1: ( ruleFonctionCall EOF )
            // InternalMyTurtleDsl.g:830:1: ruleFonctionCall EOF
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
    // InternalMyTurtleDsl.g:837:1: ruleFonctionCall : ( ( rule__FonctionCall__Group__0 ) ) ;
    public final void ruleFonctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:841:2: ( ( ( rule__FonctionCall__Group__0 ) ) )
            // InternalMyTurtleDsl.g:842:2: ( ( rule__FonctionCall__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:842:2: ( ( rule__FonctionCall__Group__0 ) )
            // InternalMyTurtleDsl.g:843:3: ( rule__FonctionCall__Group__0 )
            {
             before(grammarAccess.getFonctionCallAccess().getGroup()); 
            // InternalMyTurtleDsl.g:844:3: ( rule__FonctionCall__Group__0 )
            // InternalMyTurtleDsl.g:844:4: rule__FonctionCall__Group__0
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
    // InternalMyTurtleDsl.g:853:1: entryRuleMD : ruleMD EOF ;
    public final void entryRuleMD() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:854:1: ( ruleMD EOF )
            // InternalMyTurtleDsl.g:855:1: ruleMD EOF
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
    // InternalMyTurtleDsl.g:862:1: ruleMD : ( ( rule__MD__Alternatives ) ) ;
    public final void ruleMD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:866:2: ( ( ( rule__MD__Alternatives ) ) )
            // InternalMyTurtleDsl.g:867:2: ( ( rule__MD__Alternatives ) )
            {
            // InternalMyTurtleDsl.g:867:2: ( ( rule__MD__Alternatives ) )
            // InternalMyTurtleDsl.g:868:3: ( rule__MD__Alternatives )
            {
             before(grammarAccess.getMDAccess().getAlternatives()); 
            // InternalMyTurtleDsl.g:869:3: ( rule__MD__Alternatives )
            // InternalMyTurtleDsl.g:869:4: rule__MD__Alternatives
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
    // InternalMyTurtleDsl.g:878:1: entryRuleGDr : ruleGDr EOF ;
    public final void entryRuleGDr() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:879:1: ( ruleGDr EOF )
            // InternalMyTurtleDsl.g:880:1: ruleGDr EOF
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
    // InternalMyTurtleDsl.g:887:1: ruleGDr : ( ( rule__GDr__Alternatives ) ) ;
    public final void ruleGDr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:891:2: ( ( ( rule__GDr__Alternatives ) ) )
            // InternalMyTurtleDsl.g:892:2: ( ( rule__GDr__Alternatives ) )
            {
            // InternalMyTurtleDsl.g:892:2: ( ( rule__GDr__Alternatives ) )
            // InternalMyTurtleDsl.g:893:3: ( rule__GDr__Alternatives )
            {
             before(grammarAccess.getGDrAccess().getAlternatives()); 
            // InternalMyTurtleDsl.g:894:3: ( rule__GDr__Alternatives )
            // InternalMyTurtleDsl.g:894:4: rule__GDr__Alternatives
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
    // InternalMyTurtleDsl.g:903:1: entryRuleRGRD : ruleRGRD EOF ;
    public final void entryRuleRGRD() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:904:1: ( ruleRGRD EOF )
            // InternalMyTurtleDsl.g:905:1: ruleRGRD EOF
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
    // InternalMyTurtleDsl.g:912:1: ruleRGRD : ( ( rule__RGRD__Alternatives ) ) ;
    public final void ruleRGRD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:916:2: ( ( ( rule__RGRD__Alternatives ) ) )
            // InternalMyTurtleDsl.g:917:2: ( ( rule__RGRD__Alternatives ) )
            {
            // InternalMyTurtleDsl.g:917:2: ( ( rule__RGRD__Alternatives ) )
            // InternalMyTurtleDsl.g:918:3: ( rule__RGRD__Alternatives )
            {
             before(grammarAccess.getRGRDAccess().getAlternatives()); 
            // InternalMyTurtleDsl.g:919:3: ( rule__RGRD__Alternatives )
            // InternalMyTurtleDsl.g:919:4: rule__RGRD__Alternatives
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
    // InternalMyTurtleDsl.g:928:1: entryRuleAR : ruleAR EOF ;
    public final void entryRuleAR() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:929:1: ( ruleAR EOF )
            // InternalMyTurtleDsl.g:930:1: ruleAR EOF
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
    // InternalMyTurtleDsl.g:937:1: ruleAR : ( ( rule__AR__Alternatives ) ) ;
    public final void ruleAR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:941:2: ( ( ( rule__AR__Alternatives ) ) )
            // InternalMyTurtleDsl.g:942:2: ( ( rule__AR__Alternatives ) )
            {
            // InternalMyTurtleDsl.g:942:2: ( ( rule__AR__Alternatives ) )
            // InternalMyTurtleDsl.g:943:3: ( rule__AR__Alternatives )
            {
             before(grammarAccess.getARAccess().getAlternatives()); 
            // InternalMyTurtleDsl.g:944:3: ( rule__AR__Alternatives )
            // InternalMyTurtleDsl.g:944:4: rule__AR__Alternatives
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
    // InternalMyTurtleDsl.g:953:1: entryRuleParallele2 : ruleParallele2 EOF ;
    public final void entryRuleParallele2() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:954:1: ( ruleParallele2 EOF )
            // InternalMyTurtleDsl.g:955:1: ruleParallele2 EOF
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
    // InternalMyTurtleDsl.g:962:1: ruleParallele2 : ( ( rule__Parallele2__Alternatives ) ) ;
    public final void ruleParallele2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:966:2: ( ( ( rule__Parallele2__Alternatives ) ) )
            // InternalMyTurtleDsl.g:967:2: ( ( rule__Parallele2__Alternatives ) )
            {
            // InternalMyTurtleDsl.g:967:2: ( ( rule__Parallele2__Alternatives ) )
            // InternalMyTurtleDsl.g:968:3: ( rule__Parallele2__Alternatives )
            {
             before(grammarAccess.getParallele2Access().getAlternatives()); 
            // InternalMyTurtleDsl.g:969:3: ( rule__Parallele2__Alternatives )
            // InternalMyTurtleDsl.g:969:4: rule__Parallele2__Alternatives
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
    // InternalMyTurtleDsl.g:978:1: entryRuleParallele3 : ruleParallele3 EOF ;
    public final void entryRuleParallele3() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:979:1: ( ruleParallele3 EOF )
            // InternalMyTurtleDsl.g:980:1: ruleParallele3 EOF
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
    // InternalMyTurtleDsl.g:987:1: ruleParallele3 : ( ( rule__Parallele3__Alternatives ) ) ;
    public final void ruleParallele3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:991:2: ( ( ( rule__Parallele3__Alternatives ) ) )
            // InternalMyTurtleDsl.g:992:2: ( ( rule__Parallele3__Alternatives ) )
            {
            // InternalMyTurtleDsl.g:992:2: ( ( rule__Parallele3__Alternatives ) )
            // InternalMyTurtleDsl.g:993:3: ( rule__Parallele3__Alternatives )
            {
             before(grammarAccess.getParallele3Access().getAlternatives()); 
            // InternalMyTurtleDsl.g:994:3: ( rule__Parallele3__Alternatives )
            // InternalMyTurtleDsl.g:994:4: rule__Parallele3__Alternatives
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


    // $ANTLR start "rule__Main__Alternatives_4"
    // InternalMyTurtleDsl.g:1002:1: rule__Main__Alternatives_4 : ( ( ( rule__Main__SeconDecAssignment_4_0 ) ) | ( ( rule__Main__PourDecAssignment_4_1 ) ) | ( ( rule__Main__StatementsAssignment_4_2 ) ) | ( ( rule__Main__FonctionsAssignment_4_3 ) ) | ( ( rule__Main__ParalleleAssignment_4_4 ) ) );
    public final void rule__Main__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1006:1: ( ( ( rule__Main__SeconDecAssignment_4_0 ) ) | ( ( rule__Main__PourDecAssignment_4_1 ) ) | ( ( rule__Main__StatementsAssignment_4_2 ) ) | ( ( rule__Main__FonctionsAssignment_4_3 ) ) | ( ( rule__Main__ParalleleAssignment_4_4 ) ) )
            int alt1=5;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalMyTurtleDsl.g:1007:2: ( ( rule__Main__SeconDecAssignment_4_0 ) )
                    {
                    // InternalMyTurtleDsl.g:1007:2: ( ( rule__Main__SeconDecAssignment_4_0 ) )
                    // InternalMyTurtleDsl.g:1008:3: ( rule__Main__SeconDecAssignment_4_0 )
                    {
                     before(grammarAccess.getMainAccess().getSeconDecAssignment_4_0()); 
                    // InternalMyTurtleDsl.g:1009:3: ( rule__Main__SeconDecAssignment_4_0 )
                    // InternalMyTurtleDsl.g:1009:4: rule__Main__SeconDecAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Main__SeconDecAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMainAccess().getSeconDecAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyTurtleDsl.g:1013:2: ( ( rule__Main__PourDecAssignment_4_1 ) )
                    {
                    // InternalMyTurtleDsl.g:1013:2: ( ( rule__Main__PourDecAssignment_4_1 ) )
                    // InternalMyTurtleDsl.g:1014:3: ( rule__Main__PourDecAssignment_4_1 )
                    {
                     before(grammarAccess.getMainAccess().getPourDecAssignment_4_1()); 
                    // InternalMyTurtleDsl.g:1015:3: ( rule__Main__PourDecAssignment_4_1 )
                    // InternalMyTurtleDsl.g:1015:4: rule__Main__PourDecAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Main__PourDecAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMainAccess().getPourDecAssignment_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyTurtleDsl.g:1019:2: ( ( rule__Main__StatementsAssignment_4_2 ) )
                    {
                    // InternalMyTurtleDsl.g:1019:2: ( ( rule__Main__StatementsAssignment_4_2 ) )
                    // InternalMyTurtleDsl.g:1020:3: ( rule__Main__StatementsAssignment_4_2 )
                    {
                     before(grammarAccess.getMainAccess().getStatementsAssignment_4_2()); 
                    // InternalMyTurtleDsl.g:1021:3: ( rule__Main__StatementsAssignment_4_2 )
                    // InternalMyTurtleDsl.g:1021:4: rule__Main__StatementsAssignment_4_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Main__StatementsAssignment_4_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getMainAccess().getStatementsAssignment_4_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyTurtleDsl.g:1025:2: ( ( rule__Main__FonctionsAssignment_4_3 ) )
                    {
                    // InternalMyTurtleDsl.g:1025:2: ( ( rule__Main__FonctionsAssignment_4_3 ) )
                    // InternalMyTurtleDsl.g:1026:3: ( rule__Main__FonctionsAssignment_4_3 )
                    {
                     before(grammarAccess.getMainAccess().getFonctionsAssignment_4_3()); 
                    // InternalMyTurtleDsl.g:1027:3: ( rule__Main__FonctionsAssignment_4_3 )
                    // InternalMyTurtleDsl.g:1027:4: rule__Main__FonctionsAssignment_4_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Main__FonctionsAssignment_4_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getMainAccess().getFonctionsAssignment_4_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyTurtleDsl.g:1031:2: ( ( rule__Main__ParalleleAssignment_4_4 ) )
                    {
                    // InternalMyTurtleDsl.g:1031:2: ( ( rule__Main__ParalleleAssignment_4_4 ) )
                    // InternalMyTurtleDsl.g:1032:3: ( rule__Main__ParalleleAssignment_4_4 )
                    {
                     before(grammarAccess.getMainAccess().getParalleleAssignment_4_4()); 
                    // InternalMyTurtleDsl.g:1033:3: ( rule__Main__ParalleleAssignment_4_4 )
                    // InternalMyTurtleDsl.g:1033:4: rule__Main__ParalleleAssignment_4_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Main__ParalleleAssignment_4_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getMainAccess().getParalleleAssignment_4_4()); 

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
    // $ANTLR end "rule__Main__Alternatives_4"


    // $ANTLR start "rule__Main__ParalleleAlternatives_4_4_0"
    // InternalMyTurtleDsl.g:1041:1: rule__Main__ParalleleAlternatives_4_4_0 : ( ( ruleParallele2 ) | ( ruleParallele3 ) );
    public final void rule__Main__ParalleleAlternatives_4_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1045:1: ( ( ruleParallele2 ) | ( ruleParallele3 ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalMyTurtleDsl.g:1046:2: ( ruleParallele2 )
                    {
                    // InternalMyTurtleDsl.g:1046:2: ( ruleParallele2 )
                    // InternalMyTurtleDsl.g:1047:3: ruleParallele2
                    {
                     before(grammarAccess.getMainAccess().getParalleleParallele2ParserRuleCall_4_4_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleParallele2();

                    state._fsp--;

                     after(grammarAccess.getMainAccess().getParalleleParallele2ParserRuleCall_4_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyTurtleDsl.g:1052:2: ( ruleParallele3 )
                    {
                    // InternalMyTurtleDsl.g:1052:2: ( ruleParallele3 )
                    // InternalMyTurtleDsl.g:1053:3: ruleParallele3
                    {
                     before(grammarAccess.getMainAccess().getParalleleParallele3ParserRuleCall_4_4_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleParallele3();

                    state._fsp--;

                     after(grammarAccess.getMainAccess().getParalleleParallele3ParserRuleCall_4_4_0_1()); 

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
    // $ANTLR end "rule__Main__ParalleleAlternatives_4_4_0"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalMyTurtleDsl.g:1062:1: rule__Statement__Alternatives : ( ( ruleAvancer ) | ( ruleDescendre ) | ( ruleRotationDroite ) | ( ruleRotationGauche ) | ( rulePause ) | ( ruleDroite ) | ( ruleGauche ) | ( ruleReculer ) | ( ruleMonter ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1066:1: ( ( ruleAvancer ) | ( ruleDescendre ) | ( ruleRotationDroite ) | ( ruleRotationGauche ) | ( rulePause ) | ( ruleDroite ) | ( ruleGauche ) | ( ruleReculer ) | ( ruleMonter ) )
            int alt3=9;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalMyTurtleDsl.g:1067:2: ( ruleAvancer )
                    {
                    // InternalMyTurtleDsl.g:1067:2: ( ruleAvancer )
                    // InternalMyTurtleDsl.g:1068:3: ruleAvancer
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
                    // InternalMyTurtleDsl.g:1073:2: ( ruleDescendre )
                    {
                    // InternalMyTurtleDsl.g:1073:2: ( ruleDescendre )
                    // InternalMyTurtleDsl.g:1074:3: ruleDescendre
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
                    // InternalMyTurtleDsl.g:1079:2: ( ruleRotationDroite )
                    {
                    // InternalMyTurtleDsl.g:1079:2: ( ruleRotationDroite )
                    // InternalMyTurtleDsl.g:1080:3: ruleRotationDroite
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
                    // InternalMyTurtleDsl.g:1085:2: ( ruleRotationGauche )
                    {
                    // InternalMyTurtleDsl.g:1085:2: ( ruleRotationGauche )
                    // InternalMyTurtleDsl.g:1086:3: ruleRotationGauche
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
                    // InternalMyTurtleDsl.g:1091:2: ( rulePause )
                    {
                    // InternalMyTurtleDsl.g:1091:2: ( rulePause )
                    // InternalMyTurtleDsl.g:1092:3: rulePause
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
                    // InternalMyTurtleDsl.g:1097:2: ( ruleDroite )
                    {
                    // InternalMyTurtleDsl.g:1097:2: ( ruleDroite )
                    // InternalMyTurtleDsl.g:1098:3: ruleDroite
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
                    // InternalMyTurtleDsl.g:1103:2: ( ruleGauche )
                    {
                    // InternalMyTurtleDsl.g:1103:2: ( ruleGauche )
                    // InternalMyTurtleDsl.g:1104:3: ruleGauche
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
                    // InternalMyTurtleDsl.g:1109:2: ( ruleReculer )
                    {
                    // InternalMyTurtleDsl.g:1109:2: ( ruleReculer )
                    // InternalMyTurtleDsl.g:1110:3: ruleReculer
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
                    // InternalMyTurtleDsl.g:1115:2: ( ruleMonter )
                    {
                    // InternalMyTurtleDsl.g:1115:2: ( ruleMonter )
                    // InternalMyTurtleDsl.g:1116:3: ruleMonter
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


    // $ANTLR start "rule__PourcentExp__Alternatives"
    // InternalMyTurtleDsl.g:1125:1: rule__PourcentExp__Alternatives : ( ( rulePourcentConst ) | ( ruleRefPourcentVar ) );
    public final void rule__PourcentExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1129:1: ( ( rulePourcentConst ) | ( ruleRefPourcentVar ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_POURCENT) ) {
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
                    // InternalMyTurtleDsl.g:1130:2: ( rulePourcentConst )
                    {
                    // InternalMyTurtleDsl.g:1130:2: ( rulePourcentConst )
                    // InternalMyTurtleDsl.g:1131:3: rulePourcentConst
                    {
                     before(grammarAccess.getPourcentExpAccess().getPourcentConstParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePourcentConst();

                    state._fsp--;

                     after(grammarAccess.getPourcentExpAccess().getPourcentConstParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyTurtleDsl.g:1136:2: ( ruleRefPourcentVar )
                    {
                    // InternalMyTurtleDsl.g:1136:2: ( ruleRefPourcentVar )
                    // InternalMyTurtleDsl.g:1137:3: ruleRefPourcentVar
                    {
                     before(grammarAccess.getPourcentExpAccess().getRefPourcentVarParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRefPourcentVar();

                    state._fsp--;

                     after(grammarAccess.getPourcentExpAccess().getRefPourcentVarParserRuleCall_1()); 

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
    // $ANTLR end "rule__PourcentExp__Alternatives"


    // $ANTLR start "rule__IntExp__Alternatives"
    // InternalMyTurtleDsl.g:1146:1: rule__IntExp__Alternatives : ( ( ruleIntConstante ) | ( ruleRefIntVar ) );
    public final void rule__IntExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1150:1: ( ( ruleIntConstante ) | ( ruleRefIntVar ) )
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
                    // InternalMyTurtleDsl.g:1151:2: ( ruleIntConstante )
                    {
                    // InternalMyTurtleDsl.g:1151:2: ( ruleIntConstante )
                    // InternalMyTurtleDsl.g:1152:3: ruleIntConstante
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
                    // InternalMyTurtleDsl.g:1157:2: ( ruleRefIntVar )
                    {
                    // InternalMyTurtleDsl.g:1157:2: ( ruleRefIntVar )
                    // InternalMyTurtleDsl.g:1158:3: ruleRefIntVar
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
    // InternalMyTurtleDsl.g:1167:1: rule__MD__Alternatives : ( ( ruleMonter ) | ( ruleDescendre ) );
    public final void rule__MD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1171:1: ( ( ruleMonter ) | ( ruleDescendre ) )
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
                    // InternalMyTurtleDsl.g:1172:2: ( ruleMonter )
                    {
                    // InternalMyTurtleDsl.g:1172:2: ( ruleMonter )
                    // InternalMyTurtleDsl.g:1173:3: ruleMonter
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
                    // InternalMyTurtleDsl.g:1178:2: ( ruleDescendre )
                    {
                    // InternalMyTurtleDsl.g:1178:2: ( ruleDescendre )
                    // InternalMyTurtleDsl.g:1179:3: ruleDescendre
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
    // InternalMyTurtleDsl.g:1188:1: rule__GDr__Alternatives : ( ( ruleGauche ) | ( ruleDroite ) );
    public final void rule__GDr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1192:1: ( ( ruleGauche ) | ( ruleDroite ) )
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
                    // InternalMyTurtleDsl.g:1193:2: ( ruleGauche )
                    {
                    // InternalMyTurtleDsl.g:1193:2: ( ruleGauche )
                    // InternalMyTurtleDsl.g:1194:3: ruleGauche
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
                    // InternalMyTurtleDsl.g:1199:2: ( ruleDroite )
                    {
                    // InternalMyTurtleDsl.g:1199:2: ( ruleDroite )
                    // InternalMyTurtleDsl.g:1200:3: ruleDroite
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
    // InternalMyTurtleDsl.g:1209:1: rule__RGRD__Alternatives : ( ( ruleRotationGauche ) | ( ruleRotationDroite ) );
    public final void rule__RGRD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1213:1: ( ( ruleRotationGauche ) | ( ruleRotationDroite ) )
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
                    // InternalMyTurtleDsl.g:1214:2: ( ruleRotationGauche )
                    {
                    // InternalMyTurtleDsl.g:1214:2: ( ruleRotationGauche )
                    // InternalMyTurtleDsl.g:1215:3: ruleRotationGauche
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
                    // InternalMyTurtleDsl.g:1220:2: ( ruleRotationDroite )
                    {
                    // InternalMyTurtleDsl.g:1220:2: ( ruleRotationDroite )
                    // InternalMyTurtleDsl.g:1221:3: ruleRotationDroite
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
    // InternalMyTurtleDsl.g:1230:1: rule__AR__Alternatives : ( ( ruleAvancer ) | ( ruleReculer ) );
    public final void rule__AR__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1234:1: ( ( ruleAvancer ) | ( ruleReculer ) )
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
                    // InternalMyTurtleDsl.g:1235:2: ( ruleAvancer )
                    {
                    // InternalMyTurtleDsl.g:1235:2: ( ruleAvancer )
                    // InternalMyTurtleDsl.g:1236:3: ruleAvancer
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
                    // InternalMyTurtleDsl.g:1241:2: ( ruleReculer )
                    {
                    // InternalMyTurtleDsl.g:1241:2: ( ruleReculer )
                    // InternalMyTurtleDsl.g:1242:3: ruleReculer
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
    // InternalMyTurtleDsl.g:1251:1: rule__Parallele2__Alternatives : ( ( ( rule__Parallele2__Group_0__0 ) ) | ( ( rule__Parallele2__Group_1__0 ) ) | ( ( rule__Parallele2__Group_2__0 ) ) | ( ( rule__Parallele2__Group_3__0 ) ) | ( ( rule__Parallele2__Group_4__0 ) ) | ( ( rule__Parallele2__Group_5__0 ) ) | ( ( rule__Parallele2__Group_6__0 ) ) | ( ( rule__Parallele2__Group_7__0 ) ) | ( ( rule__Parallele2__Group_8__0 ) ) | ( ( rule__Parallele2__Group_9__0 ) ) | ( ( rule__Parallele2__Group_10__0 ) ) | ( ( rule__Parallele2__Group_11__0 ) ) );
    public final void rule__Parallele2__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1255:1: ( ( ( rule__Parallele2__Group_0__0 ) ) | ( ( rule__Parallele2__Group_1__0 ) ) | ( ( rule__Parallele2__Group_2__0 ) ) | ( ( rule__Parallele2__Group_3__0 ) ) | ( ( rule__Parallele2__Group_4__0 ) ) | ( ( rule__Parallele2__Group_5__0 ) ) | ( ( rule__Parallele2__Group_6__0 ) ) | ( ( rule__Parallele2__Group_7__0 ) ) | ( ( rule__Parallele2__Group_8__0 ) ) | ( ( rule__Parallele2__Group_9__0 ) ) | ( ( rule__Parallele2__Group_10__0 ) ) | ( ( rule__Parallele2__Group_11__0 ) ) )
            int alt10=12;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalMyTurtleDsl.g:1256:2: ( ( rule__Parallele2__Group_0__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1256:2: ( ( rule__Parallele2__Group_0__0 ) )
                    // InternalMyTurtleDsl.g:1257:3: ( rule__Parallele2__Group_0__0 )
                    {
                     before(grammarAccess.getParallele2Access().getGroup_0()); 
                    // InternalMyTurtleDsl.g:1258:3: ( rule__Parallele2__Group_0__0 )
                    // InternalMyTurtleDsl.g:1258:4: rule__Parallele2__Group_0__0
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
                    // InternalMyTurtleDsl.g:1262:2: ( ( rule__Parallele2__Group_1__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1262:2: ( ( rule__Parallele2__Group_1__0 ) )
                    // InternalMyTurtleDsl.g:1263:3: ( rule__Parallele2__Group_1__0 )
                    {
                     before(grammarAccess.getParallele2Access().getGroup_1()); 
                    // InternalMyTurtleDsl.g:1264:3: ( rule__Parallele2__Group_1__0 )
                    // InternalMyTurtleDsl.g:1264:4: rule__Parallele2__Group_1__0
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
                    // InternalMyTurtleDsl.g:1268:2: ( ( rule__Parallele2__Group_2__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1268:2: ( ( rule__Parallele2__Group_2__0 ) )
                    // InternalMyTurtleDsl.g:1269:3: ( rule__Parallele2__Group_2__0 )
                    {
                     before(grammarAccess.getParallele2Access().getGroup_2()); 
                    // InternalMyTurtleDsl.g:1270:3: ( rule__Parallele2__Group_2__0 )
                    // InternalMyTurtleDsl.g:1270:4: rule__Parallele2__Group_2__0
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
                    // InternalMyTurtleDsl.g:1274:2: ( ( rule__Parallele2__Group_3__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1274:2: ( ( rule__Parallele2__Group_3__0 ) )
                    // InternalMyTurtleDsl.g:1275:3: ( rule__Parallele2__Group_3__0 )
                    {
                     before(grammarAccess.getParallele2Access().getGroup_3()); 
                    // InternalMyTurtleDsl.g:1276:3: ( rule__Parallele2__Group_3__0 )
                    // InternalMyTurtleDsl.g:1276:4: rule__Parallele2__Group_3__0
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
                    // InternalMyTurtleDsl.g:1280:2: ( ( rule__Parallele2__Group_4__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1280:2: ( ( rule__Parallele2__Group_4__0 ) )
                    // InternalMyTurtleDsl.g:1281:3: ( rule__Parallele2__Group_4__0 )
                    {
                     before(grammarAccess.getParallele2Access().getGroup_4()); 
                    // InternalMyTurtleDsl.g:1282:3: ( rule__Parallele2__Group_4__0 )
                    // InternalMyTurtleDsl.g:1282:4: rule__Parallele2__Group_4__0
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
                    // InternalMyTurtleDsl.g:1286:2: ( ( rule__Parallele2__Group_5__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1286:2: ( ( rule__Parallele2__Group_5__0 ) )
                    // InternalMyTurtleDsl.g:1287:3: ( rule__Parallele2__Group_5__0 )
                    {
                     before(grammarAccess.getParallele2Access().getGroup_5()); 
                    // InternalMyTurtleDsl.g:1288:3: ( rule__Parallele2__Group_5__0 )
                    // InternalMyTurtleDsl.g:1288:4: rule__Parallele2__Group_5__0
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
                    // InternalMyTurtleDsl.g:1292:2: ( ( rule__Parallele2__Group_6__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1292:2: ( ( rule__Parallele2__Group_6__0 ) )
                    // InternalMyTurtleDsl.g:1293:3: ( rule__Parallele2__Group_6__0 )
                    {
                     before(grammarAccess.getParallele2Access().getGroup_6()); 
                    // InternalMyTurtleDsl.g:1294:3: ( rule__Parallele2__Group_6__0 )
                    // InternalMyTurtleDsl.g:1294:4: rule__Parallele2__Group_6__0
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
                    // InternalMyTurtleDsl.g:1298:2: ( ( rule__Parallele2__Group_7__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1298:2: ( ( rule__Parallele2__Group_7__0 ) )
                    // InternalMyTurtleDsl.g:1299:3: ( rule__Parallele2__Group_7__0 )
                    {
                     before(grammarAccess.getParallele2Access().getGroup_7()); 
                    // InternalMyTurtleDsl.g:1300:3: ( rule__Parallele2__Group_7__0 )
                    // InternalMyTurtleDsl.g:1300:4: rule__Parallele2__Group_7__0
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
                    // InternalMyTurtleDsl.g:1304:2: ( ( rule__Parallele2__Group_8__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1304:2: ( ( rule__Parallele2__Group_8__0 ) )
                    // InternalMyTurtleDsl.g:1305:3: ( rule__Parallele2__Group_8__0 )
                    {
                     before(grammarAccess.getParallele2Access().getGroup_8()); 
                    // InternalMyTurtleDsl.g:1306:3: ( rule__Parallele2__Group_8__0 )
                    // InternalMyTurtleDsl.g:1306:4: rule__Parallele2__Group_8__0
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
                    // InternalMyTurtleDsl.g:1310:2: ( ( rule__Parallele2__Group_9__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1310:2: ( ( rule__Parallele2__Group_9__0 ) )
                    // InternalMyTurtleDsl.g:1311:3: ( rule__Parallele2__Group_9__0 )
                    {
                     before(grammarAccess.getParallele2Access().getGroup_9()); 
                    // InternalMyTurtleDsl.g:1312:3: ( rule__Parallele2__Group_9__0 )
                    // InternalMyTurtleDsl.g:1312:4: rule__Parallele2__Group_9__0
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
                    // InternalMyTurtleDsl.g:1316:2: ( ( rule__Parallele2__Group_10__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1316:2: ( ( rule__Parallele2__Group_10__0 ) )
                    // InternalMyTurtleDsl.g:1317:3: ( rule__Parallele2__Group_10__0 )
                    {
                     before(grammarAccess.getParallele2Access().getGroup_10()); 
                    // InternalMyTurtleDsl.g:1318:3: ( rule__Parallele2__Group_10__0 )
                    // InternalMyTurtleDsl.g:1318:4: rule__Parallele2__Group_10__0
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
                    // InternalMyTurtleDsl.g:1322:2: ( ( rule__Parallele2__Group_11__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1322:2: ( ( rule__Parallele2__Group_11__0 ) )
                    // InternalMyTurtleDsl.g:1323:3: ( rule__Parallele2__Group_11__0 )
                    {
                     before(grammarAccess.getParallele2Access().getGroup_11()); 
                    // InternalMyTurtleDsl.g:1324:3: ( rule__Parallele2__Group_11__0 )
                    // InternalMyTurtleDsl.g:1324:4: rule__Parallele2__Group_11__0
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
    // InternalMyTurtleDsl.g:1332:1: rule__Parallele3__Alternatives : ( ( ( rule__Parallele3__Group_0__0 ) ) | ( ( rule__Parallele3__Group_1__0 ) ) | ( ( rule__Parallele3__Group_2__0 ) ) | ( ( rule__Parallele3__Group_3__0 ) ) | ( ( rule__Parallele3__Group_4__0 ) ) | ( ( rule__Parallele3__Group_5__0 ) ) | ( ( rule__Parallele3__Group_6__0 ) ) | ( ( rule__Parallele3__Group_7__0 ) ) | ( ( rule__Parallele3__Group_8__0 ) ) | ( ( rule__Parallele3__Group_9__0 ) ) | ( ( rule__Parallele3__Group_10__0 ) ) | ( ( rule__Parallele3__Group_11__0 ) ) | ( ( rule__Parallele3__Group_12__0 ) ) | ( ( rule__Parallele3__Group_13__0 ) ) | ( ( rule__Parallele3__Group_14__0 ) ) | ( ( rule__Parallele3__Group_15__0 ) ) | ( ( rule__Parallele3__Group_16__0 ) ) | ( ( rule__Parallele3__Group_17__0 ) ) | ( ( rule__Parallele3__Group_18__0 ) ) | ( ( rule__Parallele3__Group_19__0 ) ) | ( ( rule__Parallele3__Group_20__0 ) ) | ( ( rule__Parallele3__Group_21__0 ) ) | ( ( rule__Parallele3__Group_22__0 ) ) | ( ( rule__Parallele3__Group_23__0 ) ) );
    public final void rule__Parallele3__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1336:1: ( ( ( rule__Parallele3__Group_0__0 ) ) | ( ( rule__Parallele3__Group_1__0 ) ) | ( ( rule__Parallele3__Group_2__0 ) ) | ( ( rule__Parallele3__Group_3__0 ) ) | ( ( rule__Parallele3__Group_4__0 ) ) | ( ( rule__Parallele3__Group_5__0 ) ) | ( ( rule__Parallele3__Group_6__0 ) ) | ( ( rule__Parallele3__Group_7__0 ) ) | ( ( rule__Parallele3__Group_8__0 ) ) | ( ( rule__Parallele3__Group_9__0 ) ) | ( ( rule__Parallele3__Group_10__0 ) ) | ( ( rule__Parallele3__Group_11__0 ) ) | ( ( rule__Parallele3__Group_12__0 ) ) | ( ( rule__Parallele3__Group_13__0 ) ) | ( ( rule__Parallele3__Group_14__0 ) ) | ( ( rule__Parallele3__Group_15__0 ) ) | ( ( rule__Parallele3__Group_16__0 ) ) | ( ( rule__Parallele3__Group_17__0 ) ) | ( ( rule__Parallele3__Group_18__0 ) ) | ( ( rule__Parallele3__Group_19__0 ) ) | ( ( rule__Parallele3__Group_20__0 ) ) | ( ( rule__Parallele3__Group_21__0 ) ) | ( ( rule__Parallele3__Group_22__0 ) ) | ( ( rule__Parallele3__Group_23__0 ) ) )
            int alt11=24;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalMyTurtleDsl.g:1337:2: ( ( rule__Parallele3__Group_0__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1337:2: ( ( rule__Parallele3__Group_0__0 ) )
                    // InternalMyTurtleDsl.g:1338:3: ( rule__Parallele3__Group_0__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_0()); 
                    // InternalMyTurtleDsl.g:1339:3: ( rule__Parallele3__Group_0__0 )
                    // InternalMyTurtleDsl.g:1339:4: rule__Parallele3__Group_0__0
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
                    // InternalMyTurtleDsl.g:1343:2: ( ( rule__Parallele3__Group_1__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1343:2: ( ( rule__Parallele3__Group_1__0 ) )
                    // InternalMyTurtleDsl.g:1344:3: ( rule__Parallele3__Group_1__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_1()); 
                    // InternalMyTurtleDsl.g:1345:3: ( rule__Parallele3__Group_1__0 )
                    // InternalMyTurtleDsl.g:1345:4: rule__Parallele3__Group_1__0
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
                    // InternalMyTurtleDsl.g:1349:2: ( ( rule__Parallele3__Group_2__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1349:2: ( ( rule__Parallele3__Group_2__0 ) )
                    // InternalMyTurtleDsl.g:1350:3: ( rule__Parallele3__Group_2__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_2()); 
                    // InternalMyTurtleDsl.g:1351:3: ( rule__Parallele3__Group_2__0 )
                    // InternalMyTurtleDsl.g:1351:4: rule__Parallele3__Group_2__0
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
                    // InternalMyTurtleDsl.g:1355:2: ( ( rule__Parallele3__Group_3__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1355:2: ( ( rule__Parallele3__Group_3__0 ) )
                    // InternalMyTurtleDsl.g:1356:3: ( rule__Parallele3__Group_3__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_3()); 
                    // InternalMyTurtleDsl.g:1357:3: ( rule__Parallele3__Group_3__0 )
                    // InternalMyTurtleDsl.g:1357:4: rule__Parallele3__Group_3__0
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
                    // InternalMyTurtleDsl.g:1361:2: ( ( rule__Parallele3__Group_4__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1361:2: ( ( rule__Parallele3__Group_4__0 ) )
                    // InternalMyTurtleDsl.g:1362:3: ( rule__Parallele3__Group_4__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_4()); 
                    // InternalMyTurtleDsl.g:1363:3: ( rule__Parallele3__Group_4__0 )
                    // InternalMyTurtleDsl.g:1363:4: rule__Parallele3__Group_4__0
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
                    // InternalMyTurtleDsl.g:1367:2: ( ( rule__Parallele3__Group_5__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1367:2: ( ( rule__Parallele3__Group_5__0 ) )
                    // InternalMyTurtleDsl.g:1368:3: ( rule__Parallele3__Group_5__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_5()); 
                    // InternalMyTurtleDsl.g:1369:3: ( rule__Parallele3__Group_5__0 )
                    // InternalMyTurtleDsl.g:1369:4: rule__Parallele3__Group_5__0
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
                    // InternalMyTurtleDsl.g:1373:2: ( ( rule__Parallele3__Group_6__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1373:2: ( ( rule__Parallele3__Group_6__0 ) )
                    // InternalMyTurtleDsl.g:1374:3: ( rule__Parallele3__Group_6__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_6()); 
                    // InternalMyTurtleDsl.g:1375:3: ( rule__Parallele3__Group_6__0 )
                    // InternalMyTurtleDsl.g:1375:4: rule__Parallele3__Group_6__0
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
                    // InternalMyTurtleDsl.g:1379:2: ( ( rule__Parallele3__Group_7__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1379:2: ( ( rule__Parallele3__Group_7__0 ) )
                    // InternalMyTurtleDsl.g:1380:3: ( rule__Parallele3__Group_7__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_7()); 
                    // InternalMyTurtleDsl.g:1381:3: ( rule__Parallele3__Group_7__0 )
                    // InternalMyTurtleDsl.g:1381:4: rule__Parallele3__Group_7__0
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
                    // InternalMyTurtleDsl.g:1385:2: ( ( rule__Parallele3__Group_8__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1385:2: ( ( rule__Parallele3__Group_8__0 ) )
                    // InternalMyTurtleDsl.g:1386:3: ( rule__Parallele3__Group_8__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_8()); 
                    // InternalMyTurtleDsl.g:1387:3: ( rule__Parallele3__Group_8__0 )
                    // InternalMyTurtleDsl.g:1387:4: rule__Parallele3__Group_8__0
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
                    // InternalMyTurtleDsl.g:1391:2: ( ( rule__Parallele3__Group_9__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1391:2: ( ( rule__Parallele3__Group_9__0 ) )
                    // InternalMyTurtleDsl.g:1392:3: ( rule__Parallele3__Group_9__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_9()); 
                    // InternalMyTurtleDsl.g:1393:3: ( rule__Parallele3__Group_9__0 )
                    // InternalMyTurtleDsl.g:1393:4: rule__Parallele3__Group_9__0
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
                    // InternalMyTurtleDsl.g:1397:2: ( ( rule__Parallele3__Group_10__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1397:2: ( ( rule__Parallele3__Group_10__0 ) )
                    // InternalMyTurtleDsl.g:1398:3: ( rule__Parallele3__Group_10__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_10()); 
                    // InternalMyTurtleDsl.g:1399:3: ( rule__Parallele3__Group_10__0 )
                    // InternalMyTurtleDsl.g:1399:4: rule__Parallele3__Group_10__0
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
                    // InternalMyTurtleDsl.g:1403:2: ( ( rule__Parallele3__Group_11__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1403:2: ( ( rule__Parallele3__Group_11__0 ) )
                    // InternalMyTurtleDsl.g:1404:3: ( rule__Parallele3__Group_11__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_11()); 
                    // InternalMyTurtleDsl.g:1405:3: ( rule__Parallele3__Group_11__0 )
                    // InternalMyTurtleDsl.g:1405:4: rule__Parallele3__Group_11__0
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
                    // InternalMyTurtleDsl.g:1409:2: ( ( rule__Parallele3__Group_12__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1409:2: ( ( rule__Parallele3__Group_12__0 ) )
                    // InternalMyTurtleDsl.g:1410:3: ( rule__Parallele3__Group_12__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_12()); 
                    // InternalMyTurtleDsl.g:1411:3: ( rule__Parallele3__Group_12__0 )
                    // InternalMyTurtleDsl.g:1411:4: rule__Parallele3__Group_12__0
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
                    // InternalMyTurtleDsl.g:1415:2: ( ( rule__Parallele3__Group_13__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1415:2: ( ( rule__Parallele3__Group_13__0 ) )
                    // InternalMyTurtleDsl.g:1416:3: ( rule__Parallele3__Group_13__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_13()); 
                    // InternalMyTurtleDsl.g:1417:3: ( rule__Parallele3__Group_13__0 )
                    // InternalMyTurtleDsl.g:1417:4: rule__Parallele3__Group_13__0
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
                    // InternalMyTurtleDsl.g:1421:2: ( ( rule__Parallele3__Group_14__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1421:2: ( ( rule__Parallele3__Group_14__0 ) )
                    // InternalMyTurtleDsl.g:1422:3: ( rule__Parallele3__Group_14__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_14()); 
                    // InternalMyTurtleDsl.g:1423:3: ( rule__Parallele3__Group_14__0 )
                    // InternalMyTurtleDsl.g:1423:4: rule__Parallele3__Group_14__0
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
                    // InternalMyTurtleDsl.g:1427:2: ( ( rule__Parallele3__Group_15__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1427:2: ( ( rule__Parallele3__Group_15__0 ) )
                    // InternalMyTurtleDsl.g:1428:3: ( rule__Parallele3__Group_15__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_15()); 
                    // InternalMyTurtleDsl.g:1429:3: ( rule__Parallele3__Group_15__0 )
                    // InternalMyTurtleDsl.g:1429:4: rule__Parallele3__Group_15__0
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
                    // InternalMyTurtleDsl.g:1433:2: ( ( rule__Parallele3__Group_16__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1433:2: ( ( rule__Parallele3__Group_16__0 ) )
                    // InternalMyTurtleDsl.g:1434:3: ( rule__Parallele3__Group_16__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_16()); 
                    // InternalMyTurtleDsl.g:1435:3: ( rule__Parallele3__Group_16__0 )
                    // InternalMyTurtleDsl.g:1435:4: rule__Parallele3__Group_16__0
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
                    // InternalMyTurtleDsl.g:1439:2: ( ( rule__Parallele3__Group_17__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1439:2: ( ( rule__Parallele3__Group_17__0 ) )
                    // InternalMyTurtleDsl.g:1440:3: ( rule__Parallele3__Group_17__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_17()); 
                    // InternalMyTurtleDsl.g:1441:3: ( rule__Parallele3__Group_17__0 )
                    // InternalMyTurtleDsl.g:1441:4: rule__Parallele3__Group_17__0
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
                    // InternalMyTurtleDsl.g:1445:2: ( ( rule__Parallele3__Group_18__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1445:2: ( ( rule__Parallele3__Group_18__0 ) )
                    // InternalMyTurtleDsl.g:1446:3: ( rule__Parallele3__Group_18__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_18()); 
                    // InternalMyTurtleDsl.g:1447:3: ( rule__Parallele3__Group_18__0 )
                    // InternalMyTurtleDsl.g:1447:4: rule__Parallele3__Group_18__0
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
                    // InternalMyTurtleDsl.g:1451:2: ( ( rule__Parallele3__Group_19__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1451:2: ( ( rule__Parallele3__Group_19__0 ) )
                    // InternalMyTurtleDsl.g:1452:3: ( rule__Parallele3__Group_19__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_19()); 
                    // InternalMyTurtleDsl.g:1453:3: ( rule__Parallele3__Group_19__0 )
                    // InternalMyTurtleDsl.g:1453:4: rule__Parallele3__Group_19__0
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
                    // InternalMyTurtleDsl.g:1457:2: ( ( rule__Parallele3__Group_20__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1457:2: ( ( rule__Parallele3__Group_20__0 ) )
                    // InternalMyTurtleDsl.g:1458:3: ( rule__Parallele3__Group_20__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_20()); 
                    // InternalMyTurtleDsl.g:1459:3: ( rule__Parallele3__Group_20__0 )
                    // InternalMyTurtleDsl.g:1459:4: rule__Parallele3__Group_20__0
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
                    // InternalMyTurtleDsl.g:1463:2: ( ( rule__Parallele3__Group_21__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1463:2: ( ( rule__Parallele3__Group_21__0 ) )
                    // InternalMyTurtleDsl.g:1464:3: ( rule__Parallele3__Group_21__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_21()); 
                    // InternalMyTurtleDsl.g:1465:3: ( rule__Parallele3__Group_21__0 )
                    // InternalMyTurtleDsl.g:1465:4: rule__Parallele3__Group_21__0
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
                    // InternalMyTurtleDsl.g:1469:2: ( ( rule__Parallele3__Group_22__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1469:2: ( ( rule__Parallele3__Group_22__0 ) )
                    // InternalMyTurtleDsl.g:1470:3: ( rule__Parallele3__Group_22__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_22()); 
                    // InternalMyTurtleDsl.g:1471:3: ( rule__Parallele3__Group_22__0 )
                    // InternalMyTurtleDsl.g:1471:4: rule__Parallele3__Group_22__0
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
                    // InternalMyTurtleDsl.g:1475:2: ( ( rule__Parallele3__Group_23__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1475:2: ( ( rule__Parallele3__Group_23__0 ) )
                    // InternalMyTurtleDsl.g:1476:3: ( rule__Parallele3__Group_23__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_23()); 
                    // InternalMyTurtleDsl.g:1477:3: ( rule__Parallele3__Group_23__0 )
                    // InternalMyTurtleDsl.g:1477:4: rule__Parallele3__Group_23__0
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
    // InternalMyTurtleDsl.g:1485:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1489:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMyTurtleDsl.g:1490:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyTurtleDsl.g:1497:1: rule__Model__Group__0__Impl : ( ( rule__Model__ImportsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1501:1: ( ( ( rule__Model__ImportsAssignment_0 )* ) )
            // InternalMyTurtleDsl.g:1502:1: ( ( rule__Model__ImportsAssignment_0 )* )
            {
            // InternalMyTurtleDsl.g:1502:1: ( ( rule__Model__ImportsAssignment_0 )* )
            // InternalMyTurtleDsl.g:1503:2: ( rule__Model__ImportsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_0()); 
            // InternalMyTurtleDsl.g:1504:2: ( rule__Model__ImportsAssignment_0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:1504:3: rule__Model__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getImportsAssignment_0()); 

            }


            }

        }
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
    // InternalMyTurtleDsl.g:1512:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1516:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalMyTurtleDsl.g:1517:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyTurtleDsl.g:1524:1: rule__Model__Group__1__Impl : ( ( '\\n' )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1528:1: ( ( ( '\\n' )* ) )
            // InternalMyTurtleDsl.g:1529:1: ( ( '\\n' )* )
            {
            // InternalMyTurtleDsl.g:1529:1: ( ( '\\n' )* )
            // InternalMyTurtleDsl.g:1530:2: ( '\\n' )*
            {
             before(grammarAccess.getModelAccess().getLineFeedKeyword_1()); 
            // InternalMyTurtleDsl.g:1531:2: ( '\\n' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==13) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:1531:3: '\\n'
            	    {
            	    match(input,13,FOLLOW_5); 

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
    // InternalMyTurtleDsl.g:1539:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1543:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalMyTurtleDsl.g:1544:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyTurtleDsl.g:1551:1: rule__Model__Group__2__Impl : ( ( rule__Model__PvhmAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1555:1: ( ( ( rule__Model__PvhmAssignment_2 ) ) )
            // InternalMyTurtleDsl.g:1556:1: ( ( rule__Model__PvhmAssignment_2 ) )
            {
            // InternalMyTurtleDsl.g:1556:1: ( ( rule__Model__PvhmAssignment_2 ) )
            // InternalMyTurtleDsl.g:1557:2: ( rule__Model__PvhmAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getPvhmAssignment_2()); 
            // InternalMyTurtleDsl.g:1558:2: ( rule__Model__PvhmAssignment_2 )
            // InternalMyTurtleDsl.g:1558:3: rule__Model__PvhmAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__PvhmAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPvhmAssignment_2()); 

            }


            }

        }
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
    // InternalMyTurtleDsl.g:1566:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1570:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalMyTurtleDsl.g:1571:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyTurtleDsl.g:1578:1: rule__Model__Group__3__Impl : ( ( '\\n' )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1582:1: ( ( ( '\\n' )* ) )
            // InternalMyTurtleDsl.g:1583:1: ( ( '\\n' )* )
            {
            // InternalMyTurtleDsl.g:1583:1: ( ( '\\n' )* )
            // InternalMyTurtleDsl.g:1584:2: ( '\\n' )*
            {
             before(grammarAccess.getModelAccess().getLineFeedKeyword_3()); 
            // InternalMyTurtleDsl.g:1585:2: ( '\\n' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==13) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:1585:3: '\\n'
            	    {
            	    match(input,13,FOLLOW_5); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getLineFeedKeyword_3()); 

            }


            }

        }
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
    // InternalMyTurtleDsl.g:1593:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1597:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalMyTurtleDsl.g:1598:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyTurtleDsl.g:1605:1: rule__Model__Group__4__Impl : ( ( rule__Model__PvdmAssignment_4 ) ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1609:1: ( ( ( rule__Model__PvdmAssignment_4 ) ) )
            // InternalMyTurtleDsl.g:1610:1: ( ( rule__Model__PvdmAssignment_4 ) )
            {
            // InternalMyTurtleDsl.g:1610:1: ( ( rule__Model__PvdmAssignment_4 ) )
            // InternalMyTurtleDsl.g:1611:2: ( rule__Model__PvdmAssignment_4 )
            {
             before(grammarAccess.getModelAccess().getPvdmAssignment_4()); 
            // InternalMyTurtleDsl.g:1612:2: ( rule__Model__PvdmAssignment_4 )
            // InternalMyTurtleDsl.g:1612:3: rule__Model__PvdmAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Model__PvdmAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPvdmAssignment_4()); 

            }


            }

        }
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
    // InternalMyTurtleDsl.g:1620:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1624:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalMyTurtleDsl.g:1625:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyTurtleDsl.g:1632:1: rule__Model__Group__5__Impl : ( ( '\\n' )* ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1636:1: ( ( ( '\\n' )* ) )
            // InternalMyTurtleDsl.g:1637:1: ( ( '\\n' )* )
            {
            // InternalMyTurtleDsl.g:1637:1: ( ( '\\n' )* )
            // InternalMyTurtleDsl.g:1638:2: ( '\\n' )*
            {
             before(grammarAccess.getModelAccess().getLineFeedKeyword_5()); 
            // InternalMyTurtleDsl.g:1639:2: ( '\\n' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==13) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:1639:3: '\\n'
            	    {
            	    match(input,13,FOLLOW_5); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getLineFeedKeyword_5()); 

            }


            }

        }
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
    // InternalMyTurtleDsl.g:1647:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1651:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // InternalMyTurtleDsl.g:1652:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyTurtleDsl.g:1659:1: rule__Model__Group__6__Impl : ( ( rule__Model__PvrmAssignment_6 ) ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1663:1: ( ( ( rule__Model__PvrmAssignment_6 ) ) )
            // InternalMyTurtleDsl.g:1664:1: ( ( rule__Model__PvrmAssignment_6 ) )
            {
            // InternalMyTurtleDsl.g:1664:1: ( ( rule__Model__PvrmAssignment_6 ) )
            // InternalMyTurtleDsl.g:1665:2: ( rule__Model__PvrmAssignment_6 )
            {
             before(grammarAccess.getModelAccess().getPvrmAssignment_6()); 
            // InternalMyTurtleDsl.g:1666:2: ( rule__Model__PvrmAssignment_6 )
            // InternalMyTurtleDsl.g:1666:3: rule__Model__PvrmAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Model__PvrmAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPvrmAssignment_6()); 

            }


            }

        }
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
    // InternalMyTurtleDsl.g:1674:1: rule__Model__Group__7 : rule__Model__Group__7__Impl rule__Model__Group__8 ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1678:1: ( rule__Model__Group__7__Impl rule__Model__Group__8 )
            // InternalMyTurtleDsl.g:1679:2: rule__Model__Group__7__Impl rule__Model__Group__8
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyTurtleDsl.g:1686:1: rule__Model__Group__7__Impl : ( ( '\\n' )* ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1690:1: ( ( ( '\\n' )* ) )
            // InternalMyTurtleDsl.g:1691:1: ( ( '\\n' )* )
            {
            // InternalMyTurtleDsl.g:1691:1: ( ( '\\n' )* )
            // InternalMyTurtleDsl.g:1692:2: ( '\\n' )*
            {
             before(grammarAccess.getModelAccess().getLineFeedKeyword_7()); 
            // InternalMyTurtleDsl.g:1693:2: ( '\\n' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==13) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:1693:3: '\\n'
            	    {
            	    match(input,13,FOLLOW_5); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getLineFeedKeyword_7()); 

            }


            }

        }
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
    // InternalMyTurtleDsl.g:1701:1: rule__Model__Group__8 : rule__Model__Group__8__Impl rule__Model__Group__9 ;
    public final void rule__Model__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1705:1: ( rule__Model__Group__8__Impl rule__Model__Group__9 )
            // InternalMyTurtleDsl.g:1706:2: rule__Model__Group__8__Impl rule__Model__Group__9
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyTurtleDsl.g:1713:1: rule__Model__Group__8__Impl : ( ( rule__Model__HmAssignment_8 ) ) ;
    public final void rule__Model__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1717:1: ( ( ( rule__Model__HmAssignment_8 ) ) )
            // InternalMyTurtleDsl.g:1718:1: ( ( rule__Model__HmAssignment_8 ) )
            {
            // InternalMyTurtleDsl.g:1718:1: ( ( rule__Model__HmAssignment_8 ) )
            // InternalMyTurtleDsl.g:1719:2: ( rule__Model__HmAssignment_8 )
            {
             before(grammarAccess.getModelAccess().getHmAssignment_8()); 
            // InternalMyTurtleDsl.g:1720:2: ( rule__Model__HmAssignment_8 )
            // InternalMyTurtleDsl.g:1720:3: rule__Model__HmAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Model__HmAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getHmAssignment_8()); 

            }


            }

        }
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
    // InternalMyTurtleDsl.g:1728:1: rule__Model__Group__9 : rule__Model__Group__9__Impl rule__Model__Group__10 ;
    public final void rule__Model__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1732:1: ( rule__Model__Group__9__Impl rule__Model__Group__10 )
            // InternalMyTurtleDsl.g:1733:2: rule__Model__Group__9__Impl rule__Model__Group__10
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyTurtleDsl.g:1740:1: rule__Model__Group__9__Impl : ( ( '\\n' )* ) ;
    public final void rule__Model__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1744:1: ( ( ( '\\n' )* ) )
            // InternalMyTurtleDsl.g:1745:1: ( ( '\\n' )* )
            {
            // InternalMyTurtleDsl.g:1745:1: ( ( '\\n' )* )
            // InternalMyTurtleDsl.g:1746:2: ( '\\n' )*
            {
             before(grammarAccess.getModelAccess().getLineFeedKeyword_9()); 
            // InternalMyTurtleDsl.g:1747:2: ( '\\n' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==13) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:1747:3: '\\n'
            	    {
            	    match(input,13,FOLLOW_5); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getLineFeedKeyword_9()); 

            }


            }

        }
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
    // InternalMyTurtleDsl.g:1755:1: rule__Model__Group__10 : rule__Model__Group__10__Impl rule__Model__Group__11 ;
    public final void rule__Model__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1759:1: ( rule__Model__Group__10__Impl rule__Model__Group__11 )
            // InternalMyTurtleDsl.g:1760:2: rule__Model__Group__10__Impl rule__Model__Group__11
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyTurtleDsl.g:1767:1: rule__Model__Group__10__Impl : ( ( rule__Model__EmAssignment_10 ) ) ;
    public final void rule__Model__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1771:1: ( ( ( rule__Model__EmAssignment_10 ) ) )
            // InternalMyTurtleDsl.g:1772:1: ( ( rule__Model__EmAssignment_10 ) )
            {
            // InternalMyTurtleDsl.g:1772:1: ( ( rule__Model__EmAssignment_10 ) )
            // InternalMyTurtleDsl.g:1773:2: ( rule__Model__EmAssignment_10 )
            {
             before(grammarAccess.getModelAccess().getEmAssignment_10()); 
            // InternalMyTurtleDsl.g:1774:2: ( rule__Model__EmAssignment_10 )
            // InternalMyTurtleDsl.g:1774:3: rule__Model__EmAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Model__EmAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getEmAssignment_10()); 

            }


            }

        }
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
    // InternalMyTurtleDsl.g:1782:1: rule__Model__Group__11 : rule__Model__Group__11__Impl rule__Model__Group__12 ;
    public final void rule__Model__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1786:1: ( rule__Model__Group__11__Impl rule__Model__Group__12 )
            // InternalMyTurtleDsl.g:1787:2: rule__Model__Group__11__Impl rule__Model__Group__12
            {
            pushFollow(FOLLOW_6);
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
    // InternalMyTurtleDsl.g:1794:1: rule__Model__Group__11__Impl : ( ( '\\n' )* ) ;
    public final void rule__Model__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1798:1: ( ( ( '\\n' )* ) )
            // InternalMyTurtleDsl.g:1799:1: ( ( '\\n' )* )
            {
            // InternalMyTurtleDsl.g:1799:1: ( ( '\\n' )* )
            // InternalMyTurtleDsl.g:1800:2: ( '\\n' )*
            {
             before(grammarAccess.getModelAccess().getLineFeedKeyword_11()); 
            // InternalMyTurtleDsl.g:1801:2: ( '\\n' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==13) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:1801:3: '\\n'
            	    {
            	    match(input,13,FOLLOW_5); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getLineFeedKeyword_11()); 

            }


            }

        }
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
    // InternalMyTurtleDsl.g:1809:1: rule__Model__Group__12 : rule__Model__Group__12__Impl rule__Model__Group__13 ;
    public final void rule__Model__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1813:1: ( rule__Model__Group__12__Impl rule__Model__Group__13 )
            // InternalMyTurtleDsl.g:1814:2: rule__Model__Group__12__Impl rule__Model__Group__13
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyTurtleDsl.g:1821:1: rule__Model__Group__12__Impl : ( ( rule__Model__MAssignment_12 ) ) ;
    public final void rule__Model__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1825:1: ( ( ( rule__Model__MAssignment_12 ) ) )
            // InternalMyTurtleDsl.g:1826:1: ( ( rule__Model__MAssignment_12 ) )
            {
            // InternalMyTurtleDsl.g:1826:1: ( ( rule__Model__MAssignment_12 ) )
            // InternalMyTurtleDsl.g:1827:2: ( rule__Model__MAssignment_12 )
            {
             before(grammarAccess.getModelAccess().getMAssignment_12()); 
            // InternalMyTurtleDsl.g:1828:2: ( rule__Model__MAssignment_12 )
            // InternalMyTurtleDsl.g:1828:3: rule__Model__MAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Model__MAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getMAssignment_12()); 

            }


            }

        }
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
    // InternalMyTurtleDsl.g:1836:1: rule__Model__Group__13 : rule__Model__Group__13__Impl rule__Model__Group__14 ;
    public final void rule__Model__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1840:1: ( rule__Model__Group__13__Impl rule__Model__Group__14 )
            // InternalMyTurtleDsl.g:1841:2: rule__Model__Group__13__Impl rule__Model__Group__14
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyTurtleDsl.g:1848:1: rule__Model__Group__13__Impl : ( ( rule__Model__FonctionsAssignment_13 )* ) ;
    public final void rule__Model__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1852:1: ( ( ( rule__Model__FonctionsAssignment_13 )* ) )
            // InternalMyTurtleDsl.g:1853:1: ( ( rule__Model__FonctionsAssignment_13 )* )
            {
            // InternalMyTurtleDsl.g:1853:1: ( ( rule__Model__FonctionsAssignment_13 )* )
            // InternalMyTurtleDsl.g:1854:2: ( rule__Model__FonctionsAssignment_13 )*
            {
             before(grammarAccess.getModelAccess().getFonctionsAssignment_13()); 
            // InternalMyTurtleDsl.g:1855:2: ( rule__Model__FonctionsAssignment_13 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==39) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:1855:3: rule__Model__FonctionsAssignment_13
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Model__FonctionsAssignment_13();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getFonctionsAssignment_13()); 

            }


            }

        }
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
    // InternalMyTurtleDsl.g:1863:1: rule__Model__Group__14 : rule__Model__Group__14__Impl ;
    public final void rule__Model__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1867:1: ( rule__Model__Group__14__Impl )
            // InternalMyTurtleDsl.g:1868:2: rule__Model__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__14__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyTurtleDsl.g:1874:1: rule__Model__Group__14__Impl : ( ( '\\n' )* ) ;
    public final void rule__Model__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1878:1: ( ( ( '\\n' )* ) )
            // InternalMyTurtleDsl.g:1879:1: ( ( '\\n' )* )
            {
            // InternalMyTurtleDsl.g:1879:1: ( ( '\\n' )* )
            // InternalMyTurtleDsl.g:1880:2: ( '\\n' )*
            {
             before(grammarAccess.getModelAccess().getLineFeedKeyword_14()); 
            // InternalMyTurtleDsl.g:1881:2: ( '\\n' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==13) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:1881:3: '\\n'
            	    {
            	    match(input,13,FOLLOW_5); 

            	    }
            	    break;

            	default :
            	    break loop20;
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


    // $ANTLR start "rule__Main__Group__0"
    // InternalMyTurtleDsl.g:1890:1: rule__Main__Group__0 : rule__Main__Group__0__Impl rule__Main__Group__1 ;
    public final void rule__Main__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1894:1: ( rule__Main__Group__0__Impl rule__Main__Group__1 )
            // InternalMyTurtleDsl.g:1895:2: rule__Main__Group__0__Impl rule__Main__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Main__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Main__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__0"


    // $ANTLR start "rule__Main__Group__0__Impl"
    // InternalMyTurtleDsl.g:1902:1: rule__Main__Group__0__Impl : ( 'main' ) ;
    public final void rule__Main__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1906:1: ( ( 'main' ) )
            // InternalMyTurtleDsl.g:1907:1: ( 'main' )
            {
            // InternalMyTurtleDsl.g:1907:1: ( 'main' )
            // InternalMyTurtleDsl.g:1908:2: 'main'
            {
             before(grammarAccess.getMainAccess().getMainKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMainAccess().getMainKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__0__Impl"


    // $ANTLR start "rule__Main__Group__1"
    // InternalMyTurtleDsl.g:1917:1: rule__Main__Group__1 : rule__Main__Group__1__Impl rule__Main__Group__2 ;
    public final void rule__Main__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1921:1: ( rule__Main__Group__1__Impl rule__Main__Group__2 )
            // InternalMyTurtleDsl.g:1922:2: rule__Main__Group__1__Impl rule__Main__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Main__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Main__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__1"


    // $ANTLR start "rule__Main__Group__1__Impl"
    // InternalMyTurtleDsl.g:1929:1: rule__Main__Group__1__Impl : ( '{' ) ;
    public final void rule__Main__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1933:1: ( ( '{' ) )
            // InternalMyTurtleDsl.g:1934:1: ( '{' )
            {
            // InternalMyTurtleDsl.g:1934:1: ( '{' )
            // InternalMyTurtleDsl.g:1935:2: '{'
            {
             before(grammarAccess.getMainAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMainAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__1__Impl"


    // $ANTLR start "rule__Main__Group__2"
    // InternalMyTurtleDsl.g:1944:1: rule__Main__Group__2 : rule__Main__Group__2__Impl rule__Main__Group__3 ;
    public final void rule__Main__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1948:1: ( rule__Main__Group__2__Impl rule__Main__Group__3 )
            // InternalMyTurtleDsl.g:1949:2: rule__Main__Group__2__Impl rule__Main__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Main__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Main__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__2"


    // $ANTLR start "rule__Main__Group__2__Impl"
    // InternalMyTurtleDsl.g:1956:1: rule__Main__Group__2__Impl : ( ruleStart ) ;
    public final void rule__Main__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1960:1: ( ( ruleStart ) )
            // InternalMyTurtleDsl.g:1961:1: ( ruleStart )
            {
            // InternalMyTurtleDsl.g:1961:1: ( ruleStart )
            // InternalMyTurtleDsl.g:1962:2: ruleStart
            {
             before(grammarAccess.getMainAccess().getStartParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleStart();

            state._fsp--;

             after(grammarAccess.getMainAccess().getStartParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__2__Impl"


    // $ANTLR start "rule__Main__Group__3"
    // InternalMyTurtleDsl.g:1971:1: rule__Main__Group__3 : rule__Main__Group__3__Impl rule__Main__Group__4 ;
    public final void rule__Main__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1975:1: ( rule__Main__Group__3__Impl rule__Main__Group__4 )
            // InternalMyTurtleDsl.g:1976:2: rule__Main__Group__3__Impl rule__Main__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Main__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Main__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__3"


    // $ANTLR start "rule__Main__Group__3__Impl"
    // InternalMyTurtleDsl.g:1983:1: rule__Main__Group__3__Impl : ( ( '\\n' )* ) ;
    public final void rule__Main__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1987:1: ( ( ( '\\n' )* ) )
            // InternalMyTurtleDsl.g:1988:1: ( ( '\\n' )* )
            {
            // InternalMyTurtleDsl.g:1988:1: ( ( '\\n' )* )
            // InternalMyTurtleDsl.g:1989:2: ( '\\n' )*
            {
             before(grammarAccess.getMainAccess().getLineFeedKeyword_3()); 
            // InternalMyTurtleDsl.g:1990:2: ( '\\n' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==13) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:1990:3: '\\n'
            	    {
            	    match(input,13,FOLLOW_5); 

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getMainAccess().getLineFeedKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__3__Impl"


    // $ANTLR start "rule__Main__Group__4"
    // InternalMyTurtleDsl.g:1998:1: rule__Main__Group__4 : rule__Main__Group__4__Impl rule__Main__Group__5 ;
    public final void rule__Main__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2002:1: ( rule__Main__Group__4__Impl rule__Main__Group__5 )
            // InternalMyTurtleDsl.g:2003:2: rule__Main__Group__4__Impl rule__Main__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Main__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Main__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__4"


    // $ANTLR start "rule__Main__Group__4__Impl"
    // InternalMyTurtleDsl.g:2010:1: rule__Main__Group__4__Impl : ( ( rule__Main__Alternatives_4 )* ) ;
    public final void rule__Main__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2014:1: ( ( ( rule__Main__Alternatives_4 )* ) )
            // InternalMyTurtleDsl.g:2015:1: ( ( rule__Main__Alternatives_4 )* )
            {
            // InternalMyTurtleDsl.g:2015:1: ( ( rule__Main__Alternatives_4 )* )
            // InternalMyTurtleDsl.g:2016:2: ( rule__Main__Alternatives_4 )*
            {
             before(grammarAccess.getMainAccess().getAlternatives_4()); 
            // InternalMyTurtleDsl.g:2017:2: ( rule__Main__Alternatives_4 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID||LA22_0==30||(LA22_0>=32 && LA22_0<=38)||LA22_0==40||LA22_0==42) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:2017:3: rule__Main__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Main__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getMainAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__4__Impl"


    // $ANTLR start "rule__Main__Group__5"
    // InternalMyTurtleDsl.g:2025:1: rule__Main__Group__5 : rule__Main__Group__5__Impl rule__Main__Group__6 ;
    public final void rule__Main__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2029:1: ( rule__Main__Group__5__Impl rule__Main__Group__6 )
            // InternalMyTurtleDsl.g:2030:2: rule__Main__Group__5__Impl rule__Main__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Main__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Main__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__5"


    // $ANTLR start "rule__Main__Group__5__Impl"
    // InternalMyTurtleDsl.g:2037:1: rule__Main__Group__5__Impl : ( ( '\\n' )* ) ;
    public final void rule__Main__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2041:1: ( ( ( '\\n' )* ) )
            // InternalMyTurtleDsl.g:2042:1: ( ( '\\n' )* )
            {
            // InternalMyTurtleDsl.g:2042:1: ( ( '\\n' )* )
            // InternalMyTurtleDsl.g:2043:2: ( '\\n' )*
            {
             before(grammarAccess.getMainAccess().getLineFeedKeyword_5()); 
            // InternalMyTurtleDsl.g:2044:2: ( '\\n' )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==13) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:2044:3: '\\n'
            	    {
            	    match(input,13,FOLLOW_5); 

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getMainAccess().getLineFeedKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__5__Impl"


    // $ANTLR start "rule__Main__Group__6"
    // InternalMyTurtleDsl.g:2052:1: rule__Main__Group__6 : rule__Main__Group__6__Impl rule__Main__Group__7 ;
    public final void rule__Main__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2056:1: ( rule__Main__Group__6__Impl rule__Main__Group__7 )
            // InternalMyTurtleDsl.g:2057:2: rule__Main__Group__6__Impl rule__Main__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__Main__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Main__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__6"


    // $ANTLR start "rule__Main__Group__6__Impl"
    // InternalMyTurtleDsl.g:2064:1: rule__Main__Group__6__Impl : ( ruleEnd ) ;
    public final void rule__Main__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2068:1: ( ( ruleEnd ) )
            // InternalMyTurtleDsl.g:2069:1: ( ruleEnd )
            {
            // InternalMyTurtleDsl.g:2069:1: ( ruleEnd )
            // InternalMyTurtleDsl.g:2070:2: ruleEnd
            {
             before(grammarAccess.getMainAccess().getEndParserRuleCall_6()); 
            pushFollow(FOLLOW_2);
            ruleEnd();

            state._fsp--;

             after(grammarAccess.getMainAccess().getEndParserRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__6__Impl"


    // $ANTLR start "rule__Main__Group__7"
    // InternalMyTurtleDsl.g:2079:1: rule__Main__Group__7 : rule__Main__Group__7__Impl rule__Main__Group__8 ;
    public final void rule__Main__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2083:1: ( rule__Main__Group__7__Impl rule__Main__Group__8 )
            // InternalMyTurtleDsl.g:2084:2: rule__Main__Group__7__Impl rule__Main__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__Main__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Main__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__7"


    // $ANTLR start "rule__Main__Group__7__Impl"
    // InternalMyTurtleDsl.g:2091:1: rule__Main__Group__7__Impl : ( ( '\\n' )* ) ;
    public final void rule__Main__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2095:1: ( ( ( '\\n' )* ) )
            // InternalMyTurtleDsl.g:2096:1: ( ( '\\n' )* )
            {
            // InternalMyTurtleDsl.g:2096:1: ( ( '\\n' )* )
            // InternalMyTurtleDsl.g:2097:2: ( '\\n' )*
            {
             before(grammarAccess.getMainAccess().getLineFeedKeyword_7()); 
            // InternalMyTurtleDsl.g:2098:2: ( '\\n' )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==13) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:2098:3: '\\n'
            	    {
            	    match(input,13,FOLLOW_5); 

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getMainAccess().getLineFeedKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__7__Impl"


    // $ANTLR start "rule__Main__Group__8"
    // InternalMyTurtleDsl.g:2106:1: rule__Main__Group__8 : rule__Main__Group__8__Impl rule__Main__Group__9 ;
    public final void rule__Main__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2110:1: ( rule__Main__Group__8__Impl rule__Main__Group__9 )
            // InternalMyTurtleDsl.g:2111:2: rule__Main__Group__8__Impl rule__Main__Group__9
            {
            pushFollow(FOLLOW_14);
            rule__Main__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Main__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__8"


    // $ANTLR start "rule__Main__Group__8__Impl"
    // InternalMyTurtleDsl.g:2118:1: rule__Main__Group__8__Impl : ( '}' ) ;
    public final void rule__Main__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2122:1: ( ( '}' ) )
            // InternalMyTurtleDsl.g:2123:1: ( '}' )
            {
            // InternalMyTurtleDsl.g:2123:1: ( '}' )
            // InternalMyTurtleDsl.g:2124:2: '}'
            {
             before(grammarAccess.getMainAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMainAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__8__Impl"


    // $ANTLR start "rule__Main__Group__9"
    // InternalMyTurtleDsl.g:2133:1: rule__Main__Group__9 : rule__Main__Group__9__Impl ;
    public final void rule__Main__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2137:1: ( rule__Main__Group__9__Impl )
            // InternalMyTurtleDsl.g:2138:2: rule__Main__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Main__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__9"


    // $ANTLR start "rule__Main__Group__9__Impl"
    // InternalMyTurtleDsl.g:2144:1: rule__Main__Group__9__Impl : ( ( '\\n' )* ) ;
    public final void rule__Main__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2148:1: ( ( ( '\\n' )* ) )
            // InternalMyTurtleDsl.g:2149:1: ( ( '\\n' )* )
            {
            // InternalMyTurtleDsl.g:2149:1: ( ( '\\n' )* )
            // InternalMyTurtleDsl.g:2150:2: ( '\\n' )*
            {
             before(grammarAccess.getMainAccess().getLineFeedKeyword_9()); 
            // InternalMyTurtleDsl.g:2151:2: ( '\\n' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==13) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:2151:3: '\\n'
            	    {
            	    match(input,13,FOLLOW_5); 

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getMainAccess().getLineFeedKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__9__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalMyTurtleDsl.g:2160:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2164:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalMyTurtleDsl.g:2165:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalMyTurtleDsl.g:2172:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2176:1: ( ( 'import' ) )
            // InternalMyTurtleDsl.g:2177:1: ( 'import' )
            {
            // InternalMyTurtleDsl.g:2177:1: ( 'import' )
            // InternalMyTurtleDsl.g:2178:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalMyTurtleDsl.g:2187:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2191:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalMyTurtleDsl.g:2192:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Import__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalMyTurtleDsl.g:2199:1: rule__Import__Group__1__Impl : ( '<' ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2203:1: ( ( '<' ) )
            // InternalMyTurtleDsl.g:2204:1: ( '<' )
            {
            // InternalMyTurtleDsl.g:2204:1: ( '<' )
            // InternalMyTurtleDsl.g:2205:2: '<'
            {
             before(grammarAccess.getImportAccess().getLessThanSignKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getLessThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__2"
    // InternalMyTurtleDsl.g:2214:1: rule__Import__Group__2 : rule__Import__Group__2__Impl rule__Import__Group__3 ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2218:1: ( rule__Import__Group__2__Impl rule__Import__Group__3 )
            // InternalMyTurtleDsl.g:2219:2: rule__Import__Group__2__Impl rule__Import__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Import__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2"


    // $ANTLR start "rule__Import__Group__2__Impl"
    // InternalMyTurtleDsl.g:2226:1: rule__Import__Group__2__Impl : ( ( rule__Import__ImportURIAssignment_2 ) ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2230:1: ( ( ( rule__Import__ImportURIAssignment_2 ) ) )
            // InternalMyTurtleDsl.g:2231:1: ( ( rule__Import__ImportURIAssignment_2 ) )
            {
            // InternalMyTurtleDsl.g:2231:1: ( ( rule__Import__ImportURIAssignment_2 ) )
            // InternalMyTurtleDsl.g:2232:2: ( rule__Import__ImportURIAssignment_2 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_2()); 
            // InternalMyTurtleDsl.g:2233:2: ( rule__Import__ImportURIAssignment_2 )
            // InternalMyTurtleDsl.g:2233:3: rule__Import__ImportURIAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportURIAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportURIAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2__Impl"


    // $ANTLR start "rule__Import__Group__3"
    // InternalMyTurtleDsl.g:2241:1: rule__Import__Group__3 : rule__Import__Group__3__Impl rule__Import__Group__4 ;
    public final void rule__Import__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2245:1: ( rule__Import__Group__3__Impl rule__Import__Group__4 )
            // InternalMyTurtleDsl.g:2246:2: rule__Import__Group__3__Impl rule__Import__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Import__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__3"


    // $ANTLR start "rule__Import__Group__3__Impl"
    // InternalMyTurtleDsl.g:2253:1: rule__Import__Group__3__Impl : ( '>' ) ;
    public final void rule__Import__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2257:1: ( ( '>' ) )
            // InternalMyTurtleDsl.g:2258:1: ( '>' )
            {
            // InternalMyTurtleDsl.g:2258:1: ( '>' )
            // InternalMyTurtleDsl.g:2259:2: '>'
            {
             before(grammarAccess.getImportAccess().getGreaterThanSignKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__3__Impl"


    // $ANTLR start "rule__Import__Group__4"
    // InternalMyTurtleDsl.g:2268:1: rule__Import__Group__4 : rule__Import__Group__4__Impl ;
    public final void rule__Import__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2272:1: ( rule__Import__Group__4__Impl )
            // InternalMyTurtleDsl.g:2273:2: rule__Import__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__4"


    // $ANTLR start "rule__Import__Group__4__Impl"
    // InternalMyTurtleDsl.g:2279:1: rule__Import__Group__4__Impl : ( ( '\\n' )* ) ;
    public final void rule__Import__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2283:1: ( ( ( '\\n' )* ) )
            // InternalMyTurtleDsl.g:2284:1: ( ( '\\n' )* )
            {
            // InternalMyTurtleDsl.g:2284:1: ( ( '\\n' )* )
            // InternalMyTurtleDsl.g:2285:2: ( '\\n' )*
            {
             before(grammarAccess.getImportAccess().getLineFeedKeyword_4()); 
            // InternalMyTurtleDsl.g:2286:2: ( '\\n' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==13) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:2286:3: '\\n'
            	    {
            	    match(input,13,FOLLOW_5); 

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getImportAccess().getLineFeedKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__4__Impl"


    // $ANTLR start "rule__Pourcent_vitesse_hauteur_max__Group__0"
    // InternalMyTurtleDsl.g:2295:1: rule__Pourcent_vitesse_hauteur_max__Group__0 : rule__Pourcent_vitesse_hauteur_max__Group__0__Impl rule__Pourcent_vitesse_hauteur_max__Group__1 ;
    public final void rule__Pourcent_vitesse_hauteur_max__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2299:1: ( rule__Pourcent_vitesse_hauteur_max__Group__0__Impl rule__Pourcent_vitesse_hauteur_max__Group__1 )
            // InternalMyTurtleDsl.g:2300:2: rule__Pourcent_vitesse_hauteur_max__Group__0__Impl rule__Pourcent_vitesse_hauteur_max__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyTurtleDsl.g:2307:1: rule__Pourcent_vitesse_hauteur_max__Group__0__Impl : ( 'define' ) ;
    public final void rule__Pourcent_vitesse_hauteur_max__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2311:1: ( ( 'define' ) )
            // InternalMyTurtleDsl.g:2312:1: ( 'define' )
            {
            // InternalMyTurtleDsl.g:2312:1: ( 'define' )
            // InternalMyTurtleDsl.g:2313:2: 'define'
            {
             before(grammarAccess.getPourcent_vitesse_hauteur_maxAccess().getDefineKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPourcent_vitesse_hauteur_maxAccess().getDefineKeyword_0()); 

            }


            }

        }
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
    // InternalMyTurtleDsl.g:2322:1: rule__Pourcent_vitesse_hauteur_max__Group__1 : rule__Pourcent_vitesse_hauteur_max__Group__1__Impl rule__Pourcent_vitesse_hauteur_max__Group__2 ;
    public final void rule__Pourcent_vitesse_hauteur_max__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2326:1: ( rule__Pourcent_vitesse_hauteur_max__Group__1__Impl rule__Pourcent_vitesse_hauteur_max__Group__2 )
            // InternalMyTurtleDsl.g:2327:2: rule__Pourcent_vitesse_hauteur_max__Group__1__Impl rule__Pourcent_vitesse_hauteur_max__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyTurtleDsl.g:2334:1: rule__Pourcent_vitesse_hauteur_max__Group__1__Impl : ( 'vitesse_hauteur_max' ) ;
    public final void rule__Pourcent_vitesse_hauteur_max__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2338:1: ( ( 'vitesse_hauteur_max' ) )
            // InternalMyTurtleDsl.g:2339:1: ( 'vitesse_hauteur_max' )
            {
            // InternalMyTurtleDsl.g:2339:1: ( 'vitesse_hauteur_max' )
            // InternalMyTurtleDsl.g:2340:2: 'vitesse_hauteur_max'
            {
             before(grammarAccess.getPourcent_vitesse_hauteur_maxAccess().getVitesse_hauteur_maxKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPourcent_vitesse_hauteur_maxAccess().getVitesse_hauteur_maxKeyword_1()); 

            }


            }

        }
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
    // InternalMyTurtleDsl.g:2349:1: rule__Pourcent_vitesse_hauteur_max__Group__2 : rule__Pourcent_vitesse_hauteur_max__Group__2__Impl ;
    public final void rule__Pourcent_vitesse_hauteur_max__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2353:1: ( rule__Pourcent_vitesse_hauteur_max__Group__2__Impl )
            // InternalMyTurtleDsl.g:2354:2: rule__Pourcent_vitesse_hauteur_max__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pourcent_vitesse_hauteur_max__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyTurtleDsl.g:2360:1: rule__Pourcent_vitesse_hauteur_max__Group__2__Impl : ( ( rule__Pourcent_vitesse_hauteur_max__Vitesse_verticaleAssignment_2 ) ) ;
    public final void rule__Pourcent_vitesse_hauteur_max__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2364:1: ( ( ( rule__Pourcent_vitesse_hauteur_max__Vitesse_verticaleAssignment_2 ) ) )
            // InternalMyTurtleDsl.g:2365:1: ( ( rule__Pourcent_vitesse_hauteur_max__Vitesse_verticaleAssignment_2 ) )
            {
            // InternalMyTurtleDsl.g:2365:1: ( ( rule__Pourcent_vitesse_hauteur_max__Vitesse_verticaleAssignment_2 ) )
            // InternalMyTurtleDsl.g:2366:2: ( rule__Pourcent_vitesse_hauteur_max__Vitesse_verticaleAssignment_2 )
            {
             before(grammarAccess.getPourcent_vitesse_hauteur_maxAccess().getVitesse_verticaleAssignment_2()); 
            // InternalMyTurtleDsl.g:2367:2: ( rule__Pourcent_vitesse_hauteur_max__Vitesse_verticaleAssignment_2 )
            // InternalMyTurtleDsl.g:2367:3: rule__Pourcent_vitesse_hauteur_max__Vitesse_verticaleAssignment_2
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


    // $ANTLR start "rule__Pourcent_vitesse_deplacement_max__Group__0"
    // InternalMyTurtleDsl.g:2376:1: rule__Pourcent_vitesse_deplacement_max__Group__0 : rule__Pourcent_vitesse_deplacement_max__Group__0__Impl rule__Pourcent_vitesse_deplacement_max__Group__1 ;
    public final void rule__Pourcent_vitesse_deplacement_max__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2380:1: ( rule__Pourcent_vitesse_deplacement_max__Group__0__Impl rule__Pourcent_vitesse_deplacement_max__Group__1 )
            // InternalMyTurtleDsl.g:2381:2: rule__Pourcent_vitesse_deplacement_max__Group__0__Impl rule__Pourcent_vitesse_deplacement_max__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyTurtleDsl.g:2388:1: rule__Pourcent_vitesse_deplacement_max__Group__0__Impl : ( 'define' ) ;
    public final void rule__Pourcent_vitesse_deplacement_max__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2392:1: ( ( 'define' ) )
            // InternalMyTurtleDsl.g:2393:1: ( 'define' )
            {
            // InternalMyTurtleDsl.g:2393:1: ( 'define' )
            // InternalMyTurtleDsl.g:2394:2: 'define'
            {
             before(grammarAccess.getPourcent_vitesse_deplacement_maxAccess().getDefineKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPourcent_vitesse_deplacement_maxAccess().getDefineKeyword_0()); 

            }


            }

        }
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
    // InternalMyTurtleDsl.g:2403:1: rule__Pourcent_vitesse_deplacement_max__Group__1 : rule__Pourcent_vitesse_deplacement_max__Group__1__Impl rule__Pourcent_vitesse_deplacement_max__Group__2 ;
    public final void rule__Pourcent_vitesse_deplacement_max__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2407:1: ( rule__Pourcent_vitesse_deplacement_max__Group__1__Impl rule__Pourcent_vitesse_deplacement_max__Group__2 )
            // InternalMyTurtleDsl.g:2408:2: rule__Pourcent_vitesse_deplacement_max__Group__1__Impl rule__Pourcent_vitesse_deplacement_max__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyTurtleDsl.g:2415:1: rule__Pourcent_vitesse_deplacement_max__Group__1__Impl : ( 'vitesse_deplacement_max' ) ;
    public final void rule__Pourcent_vitesse_deplacement_max__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2419:1: ( ( 'vitesse_deplacement_max' ) )
            // InternalMyTurtleDsl.g:2420:1: ( 'vitesse_deplacement_max' )
            {
            // InternalMyTurtleDsl.g:2420:1: ( 'vitesse_deplacement_max' )
            // InternalMyTurtleDsl.g:2421:2: 'vitesse_deplacement_max'
            {
             before(grammarAccess.getPourcent_vitesse_deplacement_maxAccess().getVitesse_deplacement_maxKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPourcent_vitesse_deplacement_maxAccess().getVitesse_deplacement_maxKeyword_1()); 

            }


            }

        }
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
    // InternalMyTurtleDsl.g:2430:1: rule__Pourcent_vitesse_deplacement_max__Group__2 : rule__Pourcent_vitesse_deplacement_max__Group__2__Impl ;
    public final void rule__Pourcent_vitesse_deplacement_max__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2434:1: ( rule__Pourcent_vitesse_deplacement_max__Group__2__Impl )
            // InternalMyTurtleDsl.g:2435:2: rule__Pourcent_vitesse_deplacement_max__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pourcent_vitesse_deplacement_max__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyTurtleDsl.g:2441:1: rule__Pourcent_vitesse_deplacement_max__Group__2__Impl : ( ( rule__Pourcent_vitesse_deplacement_max__Vitesse_deplacementAssignment_2 ) ) ;
    public final void rule__Pourcent_vitesse_deplacement_max__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2445:1: ( ( ( rule__Pourcent_vitesse_deplacement_max__Vitesse_deplacementAssignment_2 ) ) )
            // InternalMyTurtleDsl.g:2446:1: ( ( rule__Pourcent_vitesse_deplacement_max__Vitesse_deplacementAssignment_2 ) )
            {
            // InternalMyTurtleDsl.g:2446:1: ( ( rule__Pourcent_vitesse_deplacement_max__Vitesse_deplacementAssignment_2 ) )
            // InternalMyTurtleDsl.g:2447:2: ( rule__Pourcent_vitesse_deplacement_max__Vitesse_deplacementAssignment_2 )
            {
             before(grammarAccess.getPourcent_vitesse_deplacement_maxAccess().getVitesse_deplacementAssignment_2()); 
            // InternalMyTurtleDsl.g:2448:2: ( rule__Pourcent_vitesse_deplacement_max__Vitesse_deplacementAssignment_2 )
            // InternalMyTurtleDsl.g:2448:3: rule__Pourcent_vitesse_deplacement_max__Vitesse_deplacementAssignment_2
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


    // $ANTLR start "rule__Pourcent_vitesse_rotation_max__Group__0"
    // InternalMyTurtleDsl.g:2457:1: rule__Pourcent_vitesse_rotation_max__Group__0 : rule__Pourcent_vitesse_rotation_max__Group__0__Impl rule__Pourcent_vitesse_rotation_max__Group__1 ;
    public final void rule__Pourcent_vitesse_rotation_max__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2461:1: ( rule__Pourcent_vitesse_rotation_max__Group__0__Impl rule__Pourcent_vitesse_rotation_max__Group__1 )
            // InternalMyTurtleDsl.g:2462:2: rule__Pourcent_vitesse_rotation_max__Group__0__Impl rule__Pourcent_vitesse_rotation_max__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyTurtleDsl.g:2469:1: rule__Pourcent_vitesse_rotation_max__Group__0__Impl : ( 'define' ) ;
    public final void rule__Pourcent_vitesse_rotation_max__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2473:1: ( ( 'define' ) )
            // InternalMyTurtleDsl.g:2474:1: ( 'define' )
            {
            // InternalMyTurtleDsl.g:2474:1: ( 'define' )
            // InternalMyTurtleDsl.g:2475:2: 'define'
            {
             before(grammarAccess.getPourcent_vitesse_rotation_maxAccess().getDefineKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPourcent_vitesse_rotation_maxAccess().getDefineKeyword_0()); 

            }


            }

        }
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
    // InternalMyTurtleDsl.g:2484:1: rule__Pourcent_vitesse_rotation_max__Group__1 : rule__Pourcent_vitesse_rotation_max__Group__1__Impl rule__Pourcent_vitesse_rotation_max__Group__2 ;
    public final void rule__Pourcent_vitesse_rotation_max__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2488:1: ( rule__Pourcent_vitesse_rotation_max__Group__1__Impl rule__Pourcent_vitesse_rotation_max__Group__2 )
            // InternalMyTurtleDsl.g:2489:2: rule__Pourcent_vitesse_rotation_max__Group__1__Impl rule__Pourcent_vitesse_rotation_max__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyTurtleDsl.g:2496:1: rule__Pourcent_vitesse_rotation_max__Group__1__Impl : ( 'vitesse_rotation_max' ) ;
    public final void rule__Pourcent_vitesse_rotation_max__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2500:1: ( ( 'vitesse_rotation_max' ) )
            // InternalMyTurtleDsl.g:2501:1: ( 'vitesse_rotation_max' )
            {
            // InternalMyTurtleDsl.g:2501:1: ( 'vitesse_rotation_max' )
            // InternalMyTurtleDsl.g:2502:2: 'vitesse_rotation_max'
            {
             before(grammarAccess.getPourcent_vitesse_rotation_maxAccess().getVitesse_rotation_maxKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPourcent_vitesse_rotation_maxAccess().getVitesse_rotation_maxKeyword_1()); 

            }


            }

        }
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
    // InternalMyTurtleDsl.g:2511:1: rule__Pourcent_vitesse_rotation_max__Group__2 : rule__Pourcent_vitesse_rotation_max__Group__2__Impl ;
    public final void rule__Pourcent_vitesse_rotation_max__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2515:1: ( rule__Pourcent_vitesse_rotation_max__Group__2__Impl )
            // InternalMyTurtleDsl.g:2516:2: rule__Pourcent_vitesse_rotation_max__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pourcent_vitesse_rotation_max__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyTurtleDsl.g:2522:1: rule__Pourcent_vitesse_rotation_max__Group__2__Impl : ( ( rule__Pourcent_vitesse_rotation_max__Vitesse_deplacementAssignment_2 ) ) ;
    public final void rule__Pourcent_vitesse_rotation_max__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2526:1: ( ( ( rule__Pourcent_vitesse_rotation_max__Vitesse_deplacementAssignment_2 ) ) )
            // InternalMyTurtleDsl.g:2527:1: ( ( rule__Pourcent_vitesse_rotation_max__Vitesse_deplacementAssignment_2 ) )
            {
            // InternalMyTurtleDsl.g:2527:1: ( ( rule__Pourcent_vitesse_rotation_max__Vitesse_deplacementAssignment_2 ) )
            // InternalMyTurtleDsl.g:2528:2: ( rule__Pourcent_vitesse_rotation_max__Vitesse_deplacementAssignment_2 )
            {
             before(grammarAccess.getPourcent_vitesse_rotation_maxAccess().getVitesse_deplacementAssignment_2()); 
            // InternalMyTurtleDsl.g:2529:2: ( rule__Pourcent_vitesse_rotation_max__Vitesse_deplacementAssignment_2 )
            // InternalMyTurtleDsl.g:2529:3: rule__Pourcent_vitesse_rotation_max__Vitesse_deplacementAssignment_2
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


    // $ANTLR start "rule__Hauteur_max__Group__0"
    // InternalMyTurtleDsl.g:2538:1: rule__Hauteur_max__Group__0 : rule__Hauteur_max__Group__0__Impl rule__Hauteur_max__Group__1 ;
    public final void rule__Hauteur_max__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2542:1: ( rule__Hauteur_max__Group__0__Impl rule__Hauteur_max__Group__1 )
            // InternalMyTurtleDsl.g:2543:2: rule__Hauteur_max__Group__0__Impl rule__Hauteur_max__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyTurtleDsl.g:2550:1: rule__Hauteur_max__Group__0__Impl : ( 'define' ) ;
    public final void rule__Hauteur_max__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2554:1: ( ( 'define' ) )
            // InternalMyTurtleDsl.g:2555:1: ( 'define' )
            {
            // InternalMyTurtleDsl.g:2555:1: ( 'define' )
            // InternalMyTurtleDsl.g:2556:2: 'define'
            {
             before(grammarAccess.getHauteur_maxAccess().getDefineKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getHauteur_maxAccess().getDefineKeyword_0()); 

            }


            }

        }
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
    // InternalMyTurtleDsl.g:2565:1: rule__Hauteur_max__Group__1 : rule__Hauteur_max__Group__1__Impl rule__Hauteur_max__Group__2 ;
    public final void rule__Hauteur_max__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2569:1: ( rule__Hauteur_max__Group__1__Impl rule__Hauteur_max__Group__2 )
            // InternalMyTurtleDsl.g:2570:2: rule__Hauteur_max__Group__1__Impl rule__Hauteur_max__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyTurtleDsl.g:2577:1: rule__Hauteur_max__Group__1__Impl : ( 'hauteur_max' ) ;
    public final void rule__Hauteur_max__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2581:1: ( ( 'hauteur_max' ) )
            // InternalMyTurtleDsl.g:2582:1: ( 'hauteur_max' )
            {
            // InternalMyTurtleDsl.g:2582:1: ( 'hauteur_max' )
            // InternalMyTurtleDsl.g:2583:2: 'hauteur_max'
            {
             before(grammarAccess.getHauteur_maxAccess().getHauteur_maxKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getHauteur_maxAccess().getHauteur_maxKeyword_1()); 

            }


            }

        }
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
    // InternalMyTurtleDsl.g:2592:1: rule__Hauteur_max__Group__2 : rule__Hauteur_max__Group__2__Impl ;
    public final void rule__Hauteur_max__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2596:1: ( rule__Hauteur_max__Group__2__Impl )
            // InternalMyTurtleDsl.g:2597:2: rule__Hauteur_max__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Hauteur_max__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyTurtleDsl.g:2603:1: rule__Hauteur_max__Group__2__Impl : ( ( rule__Hauteur_max__Hauteur_maxAssignment_2 ) ) ;
    public final void rule__Hauteur_max__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2607:1: ( ( ( rule__Hauteur_max__Hauteur_maxAssignment_2 ) ) )
            // InternalMyTurtleDsl.g:2608:1: ( ( rule__Hauteur_max__Hauteur_maxAssignment_2 ) )
            {
            // InternalMyTurtleDsl.g:2608:1: ( ( rule__Hauteur_max__Hauteur_maxAssignment_2 ) )
            // InternalMyTurtleDsl.g:2609:2: ( rule__Hauteur_max__Hauteur_maxAssignment_2 )
            {
             before(grammarAccess.getHauteur_maxAccess().getHauteur_maxAssignment_2()); 
            // InternalMyTurtleDsl.g:2610:2: ( rule__Hauteur_max__Hauteur_maxAssignment_2 )
            // InternalMyTurtleDsl.g:2610:3: rule__Hauteur_max__Hauteur_maxAssignment_2
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


    // $ANTLR start "rule__Eloignement_max__Group__0"
    // InternalMyTurtleDsl.g:2619:1: rule__Eloignement_max__Group__0 : rule__Eloignement_max__Group__0__Impl rule__Eloignement_max__Group__1 ;
    public final void rule__Eloignement_max__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2623:1: ( rule__Eloignement_max__Group__0__Impl rule__Eloignement_max__Group__1 )
            // InternalMyTurtleDsl.g:2624:2: rule__Eloignement_max__Group__0__Impl rule__Eloignement_max__Group__1
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
    // InternalMyTurtleDsl.g:2631:1: rule__Eloignement_max__Group__0__Impl : ( 'define' ) ;
    public final void rule__Eloignement_max__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2635:1: ( ( 'define' ) )
            // InternalMyTurtleDsl.g:2636:1: ( 'define' )
            {
            // InternalMyTurtleDsl.g:2636:1: ( 'define' )
            // InternalMyTurtleDsl.g:2637:2: 'define'
            {
             before(grammarAccess.getEloignement_maxAccess().getDefineKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEloignement_maxAccess().getDefineKeyword_0()); 

            }


            }

        }
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
    // InternalMyTurtleDsl.g:2646:1: rule__Eloignement_max__Group__1 : rule__Eloignement_max__Group__1__Impl rule__Eloignement_max__Group__2 ;
    public final void rule__Eloignement_max__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2650:1: ( rule__Eloignement_max__Group__1__Impl rule__Eloignement_max__Group__2 )
            // InternalMyTurtleDsl.g:2651:2: rule__Eloignement_max__Group__1__Impl rule__Eloignement_max__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyTurtleDsl.g:2658:1: rule__Eloignement_max__Group__1__Impl : ( 'eloignement_max' ) ;
    public final void rule__Eloignement_max__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2662:1: ( ( 'eloignement_max' ) )
            // InternalMyTurtleDsl.g:2663:1: ( 'eloignement_max' )
            {
            // InternalMyTurtleDsl.g:2663:1: ( 'eloignement_max' )
            // InternalMyTurtleDsl.g:2664:2: 'eloignement_max'
            {
             before(grammarAccess.getEloignement_maxAccess().getEloignement_maxKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEloignement_maxAccess().getEloignement_maxKeyword_1()); 

            }


            }

        }
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
    // InternalMyTurtleDsl.g:2673:1: rule__Eloignement_max__Group__2 : rule__Eloignement_max__Group__2__Impl ;
    public final void rule__Eloignement_max__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2677:1: ( rule__Eloignement_max__Group__2__Impl )
            // InternalMyTurtleDsl.g:2678:2: rule__Eloignement_max__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Eloignement_max__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalMyTurtleDsl.g:2684:1: rule__Eloignement_max__Group__2__Impl : ( ( rule__Eloignement_max__Hauteur_maxAssignment_2 ) ) ;
    public final void rule__Eloignement_max__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2688:1: ( ( ( rule__Eloignement_max__Hauteur_maxAssignment_2 ) ) )
            // InternalMyTurtleDsl.g:2689:1: ( ( rule__Eloignement_max__Hauteur_maxAssignment_2 ) )
            {
            // InternalMyTurtleDsl.g:2689:1: ( ( rule__Eloignement_max__Hauteur_maxAssignment_2 ) )
            // InternalMyTurtleDsl.g:2690:2: ( rule__Eloignement_max__Hauteur_maxAssignment_2 )
            {
             before(grammarAccess.getEloignement_maxAccess().getHauteur_maxAssignment_2()); 
            // InternalMyTurtleDsl.g:2691:2: ( rule__Eloignement_max__Hauteur_maxAssignment_2 )
            // InternalMyTurtleDsl.g:2691:3: rule__Eloignement_max__Hauteur_maxAssignment_2
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


    // $ANTLR start "rule__Decoller__Group__0"
    // InternalMyTurtleDsl.g:2700:1: rule__Decoller__Group__0 : rule__Decoller__Group__0__Impl rule__Decoller__Group__1 ;
    public final void rule__Decoller__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2704:1: ( rule__Decoller__Group__0__Impl rule__Decoller__Group__1 )
            // InternalMyTurtleDsl.g:2705:2: rule__Decoller__Group__0__Impl rule__Decoller__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyTurtleDsl.g:2712:1: rule__Decoller__Group__0__Impl : ( 'decoller' ) ;
    public final void rule__Decoller__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2716:1: ( ( 'decoller' ) )
            // InternalMyTurtleDsl.g:2717:1: ( 'decoller' )
            {
            // InternalMyTurtleDsl.g:2717:1: ( 'decoller' )
            // InternalMyTurtleDsl.g:2718:2: 'decoller'
            {
             before(grammarAccess.getDecollerAccess().getDecollerKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:2727:1: rule__Decoller__Group__1 : rule__Decoller__Group__1__Impl rule__Decoller__Group__2 ;
    public final void rule__Decoller__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2731:1: ( rule__Decoller__Group__1__Impl rule__Decoller__Group__2 )
            // InternalMyTurtleDsl.g:2732:2: rule__Decoller__Group__1__Impl rule__Decoller__Group__2
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
    // InternalMyTurtleDsl.g:2739:1: rule__Decoller__Group__1__Impl : ( '(' ) ;
    public final void rule__Decoller__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2743:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:2744:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:2744:1: ( '(' )
            // InternalMyTurtleDsl.g:2745:2: '('
            {
             before(grammarAccess.getDecollerAccess().getLeftParenthesisKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:2754:1: rule__Decoller__Group__2 : rule__Decoller__Group__2__Impl ;
    public final void rule__Decoller__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2758:1: ( rule__Decoller__Group__2__Impl )
            // InternalMyTurtleDsl.g:2759:2: rule__Decoller__Group__2__Impl
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
    // InternalMyTurtleDsl.g:2765:1: rule__Decoller__Group__2__Impl : ( ')' ) ;
    public final void rule__Decoller__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2769:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:2770:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:2770:1: ( ')' )
            // InternalMyTurtleDsl.g:2771:2: ')'
            {
             before(grammarAccess.getDecollerAccess().getRightParenthesisKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:2781:1: rule__Atterrir__Group__0 : rule__Atterrir__Group__0__Impl rule__Atterrir__Group__1 ;
    public final void rule__Atterrir__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2785:1: ( rule__Atterrir__Group__0__Impl rule__Atterrir__Group__1 )
            // InternalMyTurtleDsl.g:2786:2: rule__Atterrir__Group__0__Impl rule__Atterrir__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyTurtleDsl.g:2793:1: rule__Atterrir__Group__0__Impl : ( 'atterrir' ) ;
    public final void rule__Atterrir__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2797:1: ( ( 'atterrir' ) )
            // InternalMyTurtleDsl.g:2798:1: ( 'atterrir' )
            {
            // InternalMyTurtleDsl.g:2798:1: ( 'atterrir' )
            // InternalMyTurtleDsl.g:2799:2: 'atterrir'
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
    // InternalMyTurtleDsl.g:2808:1: rule__Atterrir__Group__1 : rule__Atterrir__Group__1__Impl rule__Atterrir__Group__2 ;
    public final void rule__Atterrir__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2812:1: ( rule__Atterrir__Group__1__Impl rule__Atterrir__Group__2 )
            // InternalMyTurtleDsl.g:2813:2: rule__Atterrir__Group__1__Impl rule__Atterrir__Group__2
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
    // InternalMyTurtleDsl.g:2820:1: rule__Atterrir__Group__1__Impl : ( '(' ) ;
    public final void rule__Atterrir__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2824:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:2825:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:2825:1: ( '(' )
            // InternalMyTurtleDsl.g:2826:2: '('
            {
             before(grammarAccess.getAtterrirAccess().getLeftParenthesisKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:2835:1: rule__Atterrir__Group__2 : rule__Atterrir__Group__2__Impl ;
    public final void rule__Atterrir__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2839:1: ( rule__Atterrir__Group__2__Impl )
            // InternalMyTurtleDsl.g:2840:2: rule__Atterrir__Group__2__Impl
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
    // InternalMyTurtleDsl.g:2846:1: rule__Atterrir__Group__2__Impl : ( ')' ) ;
    public final void rule__Atterrir__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2850:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:2851:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:2851:1: ( ')' )
            // InternalMyTurtleDsl.g:2852:2: ')'
            {
             before(grammarAccess.getAtterrirAccess().getRightParenthesisKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:2862:1: rule__Monter__Group__0 : rule__Monter__Group__0__Impl rule__Monter__Group__1 ;
    public final void rule__Monter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2866:1: ( rule__Monter__Group__0__Impl rule__Monter__Group__1 )
            // InternalMyTurtleDsl.g:2867:2: rule__Monter__Group__0__Impl rule__Monter__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyTurtleDsl.g:2874:1: rule__Monter__Group__0__Impl : ( 'monter' ) ;
    public final void rule__Monter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2878:1: ( ( 'monter' ) )
            // InternalMyTurtleDsl.g:2879:1: ( 'monter' )
            {
            // InternalMyTurtleDsl.g:2879:1: ( 'monter' )
            // InternalMyTurtleDsl.g:2880:2: 'monter'
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
    // InternalMyTurtleDsl.g:2889:1: rule__Monter__Group__1 : rule__Monter__Group__1__Impl rule__Monter__Group__2 ;
    public final void rule__Monter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2893:1: ( rule__Monter__Group__1__Impl rule__Monter__Group__2 )
            // InternalMyTurtleDsl.g:2894:2: rule__Monter__Group__1__Impl rule__Monter__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyTurtleDsl.g:2901:1: rule__Monter__Group__1__Impl : ( '(' ) ;
    public final void rule__Monter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2905:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:2906:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:2906:1: ( '(' )
            // InternalMyTurtleDsl.g:2907:2: '('
            {
             before(grammarAccess.getMonterAccess().getLeftParenthesisKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:2916:1: rule__Monter__Group__2 : rule__Monter__Group__2__Impl rule__Monter__Group__3 ;
    public final void rule__Monter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2920:1: ( rule__Monter__Group__2__Impl rule__Monter__Group__3 )
            // InternalMyTurtleDsl.g:2921:2: rule__Monter__Group__2__Impl rule__Monter__Group__3
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
    // InternalMyTurtleDsl.g:2928:1: rule__Monter__Group__2__Impl : ( ( rule__Monter__DureeAssignment_2 ) ) ;
    public final void rule__Monter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2932:1: ( ( ( rule__Monter__DureeAssignment_2 ) ) )
            // InternalMyTurtleDsl.g:2933:1: ( ( rule__Monter__DureeAssignment_2 ) )
            {
            // InternalMyTurtleDsl.g:2933:1: ( ( rule__Monter__DureeAssignment_2 ) )
            // InternalMyTurtleDsl.g:2934:2: ( rule__Monter__DureeAssignment_2 )
            {
             before(grammarAccess.getMonterAccess().getDureeAssignment_2()); 
            // InternalMyTurtleDsl.g:2935:2: ( rule__Monter__DureeAssignment_2 )
            // InternalMyTurtleDsl.g:2935:3: rule__Monter__DureeAssignment_2
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
    // InternalMyTurtleDsl.g:2943:1: rule__Monter__Group__3 : rule__Monter__Group__3__Impl rule__Monter__Group__4 ;
    public final void rule__Monter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2947:1: ( rule__Monter__Group__3__Impl rule__Monter__Group__4 )
            // InternalMyTurtleDsl.g:2948:2: rule__Monter__Group__3__Impl rule__Monter__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyTurtleDsl.g:2955:1: rule__Monter__Group__3__Impl : ( ',' ) ;
    public final void rule__Monter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2959:1: ( ( ',' ) )
            // InternalMyTurtleDsl.g:2960:1: ( ',' )
            {
            // InternalMyTurtleDsl.g:2960:1: ( ',' )
            // InternalMyTurtleDsl.g:2961:2: ','
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
    // InternalMyTurtleDsl.g:2970:1: rule__Monter__Group__4 : rule__Monter__Group__4__Impl rule__Monter__Group__5 ;
    public final void rule__Monter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2974:1: ( rule__Monter__Group__4__Impl rule__Monter__Group__5 )
            // InternalMyTurtleDsl.g:2975:2: rule__Monter__Group__4__Impl rule__Monter__Group__5
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
    // InternalMyTurtleDsl.g:2982:1: rule__Monter__Group__4__Impl : ( ( rule__Monter__Vitesse_verticaleAssignment_4 ) ) ;
    public final void rule__Monter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2986:1: ( ( ( rule__Monter__Vitesse_verticaleAssignment_4 ) ) )
            // InternalMyTurtleDsl.g:2987:1: ( ( rule__Monter__Vitesse_verticaleAssignment_4 ) )
            {
            // InternalMyTurtleDsl.g:2987:1: ( ( rule__Monter__Vitesse_verticaleAssignment_4 ) )
            // InternalMyTurtleDsl.g:2988:2: ( rule__Monter__Vitesse_verticaleAssignment_4 )
            {
             before(grammarAccess.getMonterAccess().getVitesse_verticaleAssignment_4()); 
            // InternalMyTurtleDsl.g:2989:2: ( rule__Monter__Vitesse_verticaleAssignment_4 )
            // InternalMyTurtleDsl.g:2989:3: rule__Monter__Vitesse_verticaleAssignment_4
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
    // InternalMyTurtleDsl.g:2997:1: rule__Monter__Group__5 : rule__Monter__Group__5__Impl ;
    public final void rule__Monter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3001:1: ( rule__Monter__Group__5__Impl )
            // InternalMyTurtleDsl.g:3002:2: rule__Monter__Group__5__Impl
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
    // InternalMyTurtleDsl.g:3008:1: rule__Monter__Group__5__Impl : ( ')' ) ;
    public final void rule__Monter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3012:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:3013:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:3013:1: ( ')' )
            // InternalMyTurtleDsl.g:3014:2: ')'
            {
             before(grammarAccess.getMonterAccess().getRightParenthesisKeyword_5()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:3024:1: rule__Descendre__Group__0 : rule__Descendre__Group__0__Impl rule__Descendre__Group__1 ;
    public final void rule__Descendre__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3028:1: ( rule__Descendre__Group__0__Impl rule__Descendre__Group__1 )
            // InternalMyTurtleDsl.g:3029:2: rule__Descendre__Group__0__Impl rule__Descendre__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyTurtleDsl.g:3036:1: rule__Descendre__Group__0__Impl : ( 'descendre' ) ;
    public final void rule__Descendre__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3040:1: ( ( 'descendre' ) )
            // InternalMyTurtleDsl.g:3041:1: ( 'descendre' )
            {
            // InternalMyTurtleDsl.g:3041:1: ( 'descendre' )
            // InternalMyTurtleDsl.g:3042:2: 'descendre'
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
    // InternalMyTurtleDsl.g:3051:1: rule__Descendre__Group__1 : rule__Descendre__Group__1__Impl rule__Descendre__Group__2 ;
    public final void rule__Descendre__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3055:1: ( rule__Descendre__Group__1__Impl rule__Descendre__Group__2 )
            // InternalMyTurtleDsl.g:3056:2: rule__Descendre__Group__1__Impl rule__Descendre__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyTurtleDsl.g:3063:1: rule__Descendre__Group__1__Impl : ( '(' ) ;
    public final void rule__Descendre__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3067:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:3068:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:3068:1: ( '(' )
            // InternalMyTurtleDsl.g:3069:2: '('
            {
             before(grammarAccess.getDescendreAccess().getLeftParenthesisKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:3078:1: rule__Descendre__Group__2 : rule__Descendre__Group__2__Impl rule__Descendre__Group__3 ;
    public final void rule__Descendre__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3082:1: ( rule__Descendre__Group__2__Impl rule__Descendre__Group__3 )
            // InternalMyTurtleDsl.g:3083:2: rule__Descendre__Group__2__Impl rule__Descendre__Group__3
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
    // InternalMyTurtleDsl.g:3090:1: rule__Descendre__Group__2__Impl : ( ( rule__Descendre__DureeAssignment_2 ) ) ;
    public final void rule__Descendre__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3094:1: ( ( ( rule__Descendre__DureeAssignment_2 ) ) )
            // InternalMyTurtleDsl.g:3095:1: ( ( rule__Descendre__DureeAssignment_2 ) )
            {
            // InternalMyTurtleDsl.g:3095:1: ( ( rule__Descendre__DureeAssignment_2 ) )
            // InternalMyTurtleDsl.g:3096:2: ( rule__Descendre__DureeAssignment_2 )
            {
             before(grammarAccess.getDescendreAccess().getDureeAssignment_2()); 
            // InternalMyTurtleDsl.g:3097:2: ( rule__Descendre__DureeAssignment_2 )
            // InternalMyTurtleDsl.g:3097:3: rule__Descendre__DureeAssignment_2
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
    // InternalMyTurtleDsl.g:3105:1: rule__Descendre__Group__3 : rule__Descendre__Group__3__Impl rule__Descendre__Group__4 ;
    public final void rule__Descendre__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3109:1: ( rule__Descendre__Group__3__Impl rule__Descendre__Group__4 )
            // InternalMyTurtleDsl.g:3110:2: rule__Descendre__Group__3__Impl rule__Descendre__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyTurtleDsl.g:3117:1: rule__Descendre__Group__3__Impl : ( ',' ) ;
    public final void rule__Descendre__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3121:1: ( ( ',' ) )
            // InternalMyTurtleDsl.g:3122:1: ( ',' )
            {
            // InternalMyTurtleDsl.g:3122:1: ( ',' )
            // InternalMyTurtleDsl.g:3123:2: ','
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
    // InternalMyTurtleDsl.g:3132:1: rule__Descendre__Group__4 : rule__Descendre__Group__4__Impl rule__Descendre__Group__5 ;
    public final void rule__Descendre__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3136:1: ( rule__Descendre__Group__4__Impl rule__Descendre__Group__5 )
            // InternalMyTurtleDsl.g:3137:2: rule__Descendre__Group__4__Impl rule__Descendre__Group__5
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
    // InternalMyTurtleDsl.g:3144:1: rule__Descendre__Group__4__Impl : ( ( rule__Descendre__Vitesse_verticaleAssignment_4 ) ) ;
    public final void rule__Descendre__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3148:1: ( ( ( rule__Descendre__Vitesse_verticaleAssignment_4 ) ) )
            // InternalMyTurtleDsl.g:3149:1: ( ( rule__Descendre__Vitesse_verticaleAssignment_4 ) )
            {
            // InternalMyTurtleDsl.g:3149:1: ( ( rule__Descendre__Vitesse_verticaleAssignment_4 ) )
            // InternalMyTurtleDsl.g:3150:2: ( rule__Descendre__Vitesse_verticaleAssignment_4 )
            {
             before(grammarAccess.getDescendreAccess().getVitesse_verticaleAssignment_4()); 
            // InternalMyTurtleDsl.g:3151:2: ( rule__Descendre__Vitesse_verticaleAssignment_4 )
            // InternalMyTurtleDsl.g:3151:3: rule__Descendre__Vitesse_verticaleAssignment_4
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
    // InternalMyTurtleDsl.g:3159:1: rule__Descendre__Group__5 : rule__Descendre__Group__5__Impl ;
    public final void rule__Descendre__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3163:1: ( rule__Descendre__Group__5__Impl )
            // InternalMyTurtleDsl.g:3164:2: rule__Descendre__Group__5__Impl
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
    // InternalMyTurtleDsl.g:3170:1: rule__Descendre__Group__5__Impl : ( ')' ) ;
    public final void rule__Descendre__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3174:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:3175:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:3175:1: ( ')' )
            // InternalMyTurtleDsl.g:3176:2: ')'
            {
             before(grammarAccess.getDescendreAccess().getRightParenthesisKeyword_5()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:3186:1: rule__Avancer__Group__0 : rule__Avancer__Group__0__Impl rule__Avancer__Group__1 ;
    public final void rule__Avancer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3190:1: ( rule__Avancer__Group__0__Impl rule__Avancer__Group__1 )
            // InternalMyTurtleDsl.g:3191:2: rule__Avancer__Group__0__Impl rule__Avancer__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyTurtleDsl.g:3198:1: rule__Avancer__Group__0__Impl : ( 'avancer' ) ;
    public final void rule__Avancer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3202:1: ( ( 'avancer' ) )
            // InternalMyTurtleDsl.g:3203:1: ( 'avancer' )
            {
            // InternalMyTurtleDsl.g:3203:1: ( 'avancer' )
            // InternalMyTurtleDsl.g:3204:2: 'avancer'
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
    // InternalMyTurtleDsl.g:3213:1: rule__Avancer__Group__1 : rule__Avancer__Group__1__Impl rule__Avancer__Group__2 ;
    public final void rule__Avancer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3217:1: ( rule__Avancer__Group__1__Impl rule__Avancer__Group__2 )
            // InternalMyTurtleDsl.g:3218:2: rule__Avancer__Group__1__Impl rule__Avancer__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyTurtleDsl.g:3225:1: rule__Avancer__Group__1__Impl : ( '(' ) ;
    public final void rule__Avancer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3229:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:3230:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:3230:1: ( '(' )
            // InternalMyTurtleDsl.g:3231:2: '('
            {
             before(grammarAccess.getAvancerAccess().getLeftParenthesisKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:3240:1: rule__Avancer__Group__2 : rule__Avancer__Group__2__Impl rule__Avancer__Group__3 ;
    public final void rule__Avancer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3244:1: ( rule__Avancer__Group__2__Impl rule__Avancer__Group__3 )
            // InternalMyTurtleDsl.g:3245:2: rule__Avancer__Group__2__Impl rule__Avancer__Group__3
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
    // InternalMyTurtleDsl.g:3252:1: rule__Avancer__Group__2__Impl : ( ( rule__Avancer__DureeAssignment_2 ) ) ;
    public final void rule__Avancer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3256:1: ( ( ( rule__Avancer__DureeAssignment_2 ) ) )
            // InternalMyTurtleDsl.g:3257:1: ( ( rule__Avancer__DureeAssignment_2 ) )
            {
            // InternalMyTurtleDsl.g:3257:1: ( ( rule__Avancer__DureeAssignment_2 ) )
            // InternalMyTurtleDsl.g:3258:2: ( rule__Avancer__DureeAssignment_2 )
            {
             before(grammarAccess.getAvancerAccess().getDureeAssignment_2()); 
            // InternalMyTurtleDsl.g:3259:2: ( rule__Avancer__DureeAssignment_2 )
            // InternalMyTurtleDsl.g:3259:3: rule__Avancer__DureeAssignment_2
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
    // InternalMyTurtleDsl.g:3267:1: rule__Avancer__Group__3 : rule__Avancer__Group__3__Impl rule__Avancer__Group__4 ;
    public final void rule__Avancer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3271:1: ( rule__Avancer__Group__3__Impl rule__Avancer__Group__4 )
            // InternalMyTurtleDsl.g:3272:2: rule__Avancer__Group__3__Impl rule__Avancer__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyTurtleDsl.g:3279:1: rule__Avancer__Group__3__Impl : ( ',' ) ;
    public final void rule__Avancer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3283:1: ( ( ',' ) )
            // InternalMyTurtleDsl.g:3284:1: ( ',' )
            {
            // InternalMyTurtleDsl.g:3284:1: ( ',' )
            // InternalMyTurtleDsl.g:3285:2: ','
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
    // InternalMyTurtleDsl.g:3294:1: rule__Avancer__Group__4 : rule__Avancer__Group__4__Impl rule__Avancer__Group__5 ;
    public final void rule__Avancer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3298:1: ( rule__Avancer__Group__4__Impl rule__Avancer__Group__5 )
            // InternalMyTurtleDsl.g:3299:2: rule__Avancer__Group__4__Impl rule__Avancer__Group__5
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
    // InternalMyTurtleDsl.g:3306:1: rule__Avancer__Group__4__Impl : ( ( rule__Avancer__Vitesse_deplacementAssignment_4 ) ) ;
    public final void rule__Avancer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3310:1: ( ( ( rule__Avancer__Vitesse_deplacementAssignment_4 ) ) )
            // InternalMyTurtleDsl.g:3311:1: ( ( rule__Avancer__Vitesse_deplacementAssignment_4 ) )
            {
            // InternalMyTurtleDsl.g:3311:1: ( ( rule__Avancer__Vitesse_deplacementAssignment_4 ) )
            // InternalMyTurtleDsl.g:3312:2: ( rule__Avancer__Vitesse_deplacementAssignment_4 )
            {
             before(grammarAccess.getAvancerAccess().getVitesse_deplacementAssignment_4()); 
            // InternalMyTurtleDsl.g:3313:2: ( rule__Avancer__Vitesse_deplacementAssignment_4 )
            // InternalMyTurtleDsl.g:3313:3: rule__Avancer__Vitesse_deplacementAssignment_4
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
    // InternalMyTurtleDsl.g:3321:1: rule__Avancer__Group__5 : rule__Avancer__Group__5__Impl ;
    public final void rule__Avancer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3325:1: ( rule__Avancer__Group__5__Impl )
            // InternalMyTurtleDsl.g:3326:2: rule__Avancer__Group__5__Impl
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
    // InternalMyTurtleDsl.g:3332:1: rule__Avancer__Group__5__Impl : ( ')' ) ;
    public final void rule__Avancer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3336:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:3337:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:3337:1: ( ')' )
            // InternalMyTurtleDsl.g:3338:2: ')'
            {
             before(grammarAccess.getAvancerAccess().getRightParenthesisKeyword_5()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:3348:1: rule__Reculer__Group__0 : rule__Reculer__Group__0__Impl rule__Reculer__Group__1 ;
    public final void rule__Reculer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3352:1: ( rule__Reculer__Group__0__Impl rule__Reculer__Group__1 )
            // InternalMyTurtleDsl.g:3353:2: rule__Reculer__Group__0__Impl rule__Reculer__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyTurtleDsl.g:3360:1: rule__Reculer__Group__0__Impl : ( 'reculer' ) ;
    public final void rule__Reculer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3364:1: ( ( 'reculer' ) )
            // InternalMyTurtleDsl.g:3365:1: ( 'reculer' )
            {
            // InternalMyTurtleDsl.g:3365:1: ( 'reculer' )
            // InternalMyTurtleDsl.g:3366:2: 'reculer'
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
    // InternalMyTurtleDsl.g:3375:1: rule__Reculer__Group__1 : rule__Reculer__Group__1__Impl rule__Reculer__Group__2 ;
    public final void rule__Reculer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3379:1: ( rule__Reculer__Group__1__Impl rule__Reculer__Group__2 )
            // InternalMyTurtleDsl.g:3380:2: rule__Reculer__Group__1__Impl rule__Reculer__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyTurtleDsl.g:3387:1: rule__Reculer__Group__1__Impl : ( '(' ) ;
    public final void rule__Reculer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3391:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:3392:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:3392:1: ( '(' )
            // InternalMyTurtleDsl.g:3393:2: '('
            {
             before(grammarAccess.getReculerAccess().getLeftParenthesisKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:3402:1: rule__Reculer__Group__2 : rule__Reculer__Group__2__Impl rule__Reculer__Group__3 ;
    public final void rule__Reculer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3406:1: ( rule__Reculer__Group__2__Impl rule__Reculer__Group__3 )
            // InternalMyTurtleDsl.g:3407:2: rule__Reculer__Group__2__Impl rule__Reculer__Group__3
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
    // InternalMyTurtleDsl.g:3414:1: rule__Reculer__Group__2__Impl : ( ( rule__Reculer__DureeAssignment_2 ) ) ;
    public final void rule__Reculer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3418:1: ( ( ( rule__Reculer__DureeAssignment_2 ) ) )
            // InternalMyTurtleDsl.g:3419:1: ( ( rule__Reculer__DureeAssignment_2 ) )
            {
            // InternalMyTurtleDsl.g:3419:1: ( ( rule__Reculer__DureeAssignment_2 ) )
            // InternalMyTurtleDsl.g:3420:2: ( rule__Reculer__DureeAssignment_2 )
            {
             before(grammarAccess.getReculerAccess().getDureeAssignment_2()); 
            // InternalMyTurtleDsl.g:3421:2: ( rule__Reculer__DureeAssignment_2 )
            // InternalMyTurtleDsl.g:3421:3: rule__Reculer__DureeAssignment_2
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
    // InternalMyTurtleDsl.g:3429:1: rule__Reculer__Group__3 : rule__Reculer__Group__3__Impl rule__Reculer__Group__4 ;
    public final void rule__Reculer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3433:1: ( rule__Reculer__Group__3__Impl rule__Reculer__Group__4 )
            // InternalMyTurtleDsl.g:3434:2: rule__Reculer__Group__3__Impl rule__Reculer__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyTurtleDsl.g:3441:1: rule__Reculer__Group__3__Impl : ( ',' ) ;
    public final void rule__Reculer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3445:1: ( ( ',' ) )
            // InternalMyTurtleDsl.g:3446:1: ( ',' )
            {
            // InternalMyTurtleDsl.g:3446:1: ( ',' )
            // InternalMyTurtleDsl.g:3447:2: ','
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
    // InternalMyTurtleDsl.g:3456:1: rule__Reculer__Group__4 : rule__Reculer__Group__4__Impl rule__Reculer__Group__5 ;
    public final void rule__Reculer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3460:1: ( rule__Reculer__Group__4__Impl rule__Reculer__Group__5 )
            // InternalMyTurtleDsl.g:3461:2: rule__Reculer__Group__4__Impl rule__Reculer__Group__5
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
    // InternalMyTurtleDsl.g:3468:1: rule__Reculer__Group__4__Impl : ( ( rule__Reculer__Vitesse_deplacementAssignment_4 ) ) ;
    public final void rule__Reculer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3472:1: ( ( ( rule__Reculer__Vitesse_deplacementAssignment_4 ) ) )
            // InternalMyTurtleDsl.g:3473:1: ( ( rule__Reculer__Vitesse_deplacementAssignment_4 ) )
            {
            // InternalMyTurtleDsl.g:3473:1: ( ( rule__Reculer__Vitesse_deplacementAssignment_4 ) )
            // InternalMyTurtleDsl.g:3474:2: ( rule__Reculer__Vitesse_deplacementAssignment_4 )
            {
             before(grammarAccess.getReculerAccess().getVitesse_deplacementAssignment_4()); 
            // InternalMyTurtleDsl.g:3475:2: ( rule__Reculer__Vitesse_deplacementAssignment_4 )
            // InternalMyTurtleDsl.g:3475:3: rule__Reculer__Vitesse_deplacementAssignment_4
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
    // InternalMyTurtleDsl.g:3483:1: rule__Reculer__Group__5 : rule__Reculer__Group__5__Impl ;
    public final void rule__Reculer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3487:1: ( rule__Reculer__Group__5__Impl )
            // InternalMyTurtleDsl.g:3488:2: rule__Reculer__Group__5__Impl
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
    // InternalMyTurtleDsl.g:3494:1: rule__Reculer__Group__5__Impl : ( ')' ) ;
    public final void rule__Reculer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3498:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:3499:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:3499:1: ( ')' )
            // InternalMyTurtleDsl.g:3500:2: ')'
            {
             before(grammarAccess.getReculerAccess().getRightParenthesisKeyword_5()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:3510:1: rule__Gauche__Group__0 : rule__Gauche__Group__0__Impl rule__Gauche__Group__1 ;
    public final void rule__Gauche__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3514:1: ( rule__Gauche__Group__0__Impl rule__Gauche__Group__1 )
            // InternalMyTurtleDsl.g:3515:2: rule__Gauche__Group__0__Impl rule__Gauche__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyTurtleDsl.g:3522:1: rule__Gauche__Group__0__Impl : ( 'gauche' ) ;
    public final void rule__Gauche__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3526:1: ( ( 'gauche' ) )
            // InternalMyTurtleDsl.g:3527:1: ( 'gauche' )
            {
            // InternalMyTurtleDsl.g:3527:1: ( 'gauche' )
            // InternalMyTurtleDsl.g:3528:2: 'gauche'
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
    // InternalMyTurtleDsl.g:3537:1: rule__Gauche__Group__1 : rule__Gauche__Group__1__Impl rule__Gauche__Group__2 ;
    public final void rule__Gauche__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3541:1: ( rule__Gauche__Group__1__Impl rule__Gauche__Group__2 )
            // InternalMyTurtleDsl.g:3542:2: rule__Gauche__Group__1__Impl rule__Gauche__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyTurtleDsl.g:3549:1: rule__Gauche__Group__1__Impl : ( '(' ) ;
    public final void rule__Gauche__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3553:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:3554:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:3554:1: ( '(' )
            // InternalMyTurtleDsl.g:3555:2: '('
            {
             before(grammarAccess.getGaucheAccess().getLeftParenthesisKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:3564:1: rule__Gauche__Group__2 : rule__Gauche__Group__2__Impl rule__Gauche__Group__3 ;
    public final void rule__Gauche__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3568:1: ( rule__Gauche__Group__2__Impl rule__Gauche__Group__3 )
            // InternalMyTurtleDsl.g:3569:2: rule__Gauche__Group__2__Impl rule__Gauche__Group__3
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
    // InternalMyTurtleDsl.g:3576:1: rule__Gauche__Group__2__Impl : ( ( rule__Gauche__DureeAssignment_2 ) ) ;
    public final void rule__Gauche__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3580:1: ( ( ( rule__Gauche__DureeAssignment_2 ) ) )
            // InternalMyTurtleDsl.g:3581:1: ( ( rule__Gauche__DureeAssignment_2 ) )
            {
            // InternalMyTurtleDsl.g:3581:1: ( ( rule__Gauche__DureeAssignment_2 ) )
            // InternalMyTurtleDsl.g:3582:2: ( rule__Gauche__DureeAssignment_2 )
            {
             before(grammarAccess.getGaucheAccess().getDureeAssignment_2()); 
            // InternalMyTurtleDsl.g:3583:2: ( rule__Gauche__DureeAssignment_2 )
            // InternalMyTurtleDsl.g:3583:3: rule__Gauche__DureeAssignment_2
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
    // InternalMyTurtleDsl.g:3591:1: rule__Gauche__Group__3 : rule__Gauche__Group__3__Impl rule__Gauche__Group__4 ;
    public final void rule__Gauche__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3595:1: ( rule__Gauche__Group__3__Impl rule__Gauche__Group__4 )
            // InternalMyTurtleDsl.g:3596:2: rule__Gauche__Group__3__Impl rule__Gauche__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyTurtleDsl.g:3603:1: rule__Gauche__Group__3__Impl : ( ',' ) ;
    public final void rule__Gauche__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3607:1: ( ( ',' ) )
            // InternalMyTurtleDsl.g:3608:1: ( ',' )
            {
            // InternalMyTurtleDsl.g:3608:1: ( ',' )
            // InternalMyTurtleDsl.g:3609:2: ','
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
    // InternalMyTurtleDsl.g:3618:1: rule__Gauche__Group__4 : rule__Gauche__Group__4__Impl rule__Gauche__Group__5 ;
    public final void rule__Gauche__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3622:1: ( rule__Gauche__Group__4__Impl rule__Gauche__Group__5 )
            // InternalMyTurtleDsl.g:3623:2: rule__Gauche__Group__4__Impl rule__Gauche__Group__5
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
    // InternalMyTurtleDsl.g:3630:1: rule__Gauche__Group__4__Impl : ( ( rule__Gauche__Vitesse_deplacementAssignment_4 ) ) ;
    public final void rule__Gauche__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3634:1: ( ( ( rule__Gauche__Vitesse_deplacementAssignment_4 ) ) )
            // InternalMyTurtleDsl.g:3635:1: ( ( rule__Gauche__Vitesse_deplacementAssignment_4 ) )
            {
            // InternalMyTurtleDsl.g:3635:1: ( ( rule__Gauche__Vitesse_deplacementAssignment_4 ) )
            // InternalMyTurtleDsl.g:3636:2: ( rule__Gauche__Vitesse_deplacementAssignment_4 )
            {
             before(grammarAccess.getGaucheAccess().getVitesse_deplacementAssignment_4()); 
            // InternalMyTurtleDsl.g:3637:2: ( rule__Gauche__Vitesse_deplacementAssignment_4 )
            // InternalMyTurtleDsl.g:3637:3: rule__Gauche__Vitesse_deplacementAssignment_4
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
    // InternalMyTurtleDsl.g:3645:1: rule__Gauche__Group__5 : rule__Gauche__Group__5__Impl ;
    public final void rule__Gauche__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3649:1: ( rule__Gauche__Group__5__Impl )
            // InternalMyTurtleDsl.g:3650:2: rule__Gauche__Group__5__Impl
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
    // InternalMyTurtleDsl.g:3656:1: rule__Gauche__Group__5__Impl : ( ')' ) ;
    public final void rule__Gauche__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3660:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:3661:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:3661:1: ( ')' )
            // InternalMyTurtleDsl.g:3662:2: ')'
            {
             before(grammarAccess.getGaucheAccess().getRightParenthesisKeyword_5()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:3672:1: rule__Droite__Group__0 : rule__Droite__Group__0__Impl rule__Droite__Group__1 ;
    public final void rule__Droite__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3676:1: ( rule__Droite__Group__0__Impl rule__Droite__Group__1 )
            // InternalMyTurtleDsl.g:3677:2: rule__Droite__Group__0__Impl rule__Droite__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyTurtleDsl.g:3684:1: rule__Droite__Group__0__Impl : ( 'droite' ) ;
    public final void rule__Droite__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3688:1: ( ( 'droite' ) )
            // InternalMyTurtleDsl.g:3689:1: ( 'droite' )
            {
            // InternalMyTurtleDsl.g:3689:1: ( 'droite' )
            // InternalMyTurtleDsl.g:3690:2: 'droite'
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
    // InternalMyTurtleDsl.g:3699:1: rule__Droite__Group__1 : rule__Droite__Group__1__Impl rule__Droite__Group__2 ;
    public final void rule__Droite__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3703:1: ( rule__Droite__Group__1__Impl rule__Droite__Group__2 )
            // InternalMyTurtleDsl.g:3704:2: rule__Droite__Group__1__Impl rule__Droite__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyTurtleDsl.g:3711:1: rule__Droite__Group__1__Impl : ( '(' ) ;
    public final void rule__Droite__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3715:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:3716:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:3716:1: ( '(' )
            // InternalMyTurtleDsl.g:3717:2: '('
            {
             before(grammarAccess.getDroiteAccess().getLeftParenthesisKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:3726:1: rule__Droite__Group__2 : rule__Droite__Group__2__Impl rule__Droite__Group__3 ;
    public final void rule__Droite__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3730:1: ( rule__Droite__Group__2__Impl rule__Droite__Group__3 )
            // InternalMyTurtleDsl.g:3731:2: rule__Droite__Group__2__Impl rule__Droite__Group__3
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
    // InternalMyTurtleDsl.g:3738:1: rule__Droite__Group__2__Impl : ( ( rule__Droite__DureeAssignment_2 ) ) ;
    public final void rule__Droite__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3742:1: ( ( ( rule__Droite__DureeAssignment_2 ) ) )
            // InternalMyTurtleDsl.g:3743:1: ( ( rule__Droite__DureeAssignment_2 ) )
            {
            // InternalMyTurtleDsl.g:3743:1: ( ( rule__Droite__DureeAssignment_2 ) )
            // InternalMyTurtleDsl.g:3744:2: ( rule__Droite__DureeAssignment_2 )
            {
             before(grammarAccess.getDroiteAccess().getDureeAssignment_2()); 
            // InternalMyTurtleDsl.g:3745:2: ( rule__Droite__DureeAssignment_2 )
            // InternalMyTurtleDsl.g:3745:3: rule__Droite__DureeAssignment_2
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
    // InternalMyTurtleDsl.g:3753:1: rule__Droite__Group__3 : rule__Droite__Group__3__Impl rule__Droite__Group__4 ;
    public final void rule__Droite__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3757:1: ( rule__Droite__Group__3__Impl rule__Droite__Group__4 )
            // InternalMyTurtleDsl.g:3758:2: rule__Droite__Group__3__Impl rule__Droite__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyTurtleDsl.g:3765:1: rule__Droite__Group__3__Impl : ( ',' ) ;
    public final void rule__Droite__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3769:1: ( ( ',' ) )
            // InternalMyTurtleDsl.g:3770:1: ( ',' )
            {
            // InternalMyTurtleDsl.g:3770:1: ( ',' )
            // InternalMyTurtleDsl.g:3771:2: ','
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
    // InternalMyTurtleDsl.g:3780:1: rule__Droite__Group__4 : rule__Droite__Group__4__Impl rule__Droite__Group__5 ;
    public final void rule__Droite__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3784:1: ( rule__Droite__Group__4__Impl rule__Droite__Group__5 )
            // InternalMyTurtleDsl.g:3785:2: rule__Droite__Group__4__Impl rule__Droite__Group__5
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
    // InternalMyTurtleDsl.g:3792:1: rule__Droite__Group__4__Impl : ( ( rule__Droite__Vitesse_deplacementAssignment_4 ) ) ;
    public final void rule__Droite__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3796:1: ( ( ( rule__Droite__Vitesse_deplacementAssignment_4 ) ) )
            // InternalMyTurtleDsl.g:3797:1: ( ( rule__Droite__Vitesse_deplacementAssignment_4 ) )
            {
            // InternalMyTurtleDsl.g:3797:1: ( ( rule__Droite__Vitesse_deplacementAssignment_4 ) )
            // InternalMyTurtleDsl.g:3798:2: ( rule__Droite__Vitesse_deplacementAssignment_4 )
            {
             before(grammarAccess.getDroiteAccess().getVitesse_deplacementAssignment_4()); 
            // InternalMyTurtleDsl.g:3799:2: ( rule__Droite__Vitesse_deplacementAssignment_4 )
            // InternalMyTurtleDsl.g:3799:3: rule__Droite__Vitesse_deplacementAssignment_4
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
    // InternalMyTurtleDsl.g:3807:1: rule__Droite__Group__5 : rule__Droite__Group__5__Impl ;
    public final void rule__Droite__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3811:1: ( rule__Droite__Group__5__Impl )
            // InternalMyTurtleDsl.g:3812:2: rule__Droite__Group__5__Impl
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
    // InternalMyTurtleDsl.g:3818:1: rule__Droite__Group__5__Impl : ( ')' ) ;
    public final void rule__Droite__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3822:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:3823:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:3823:1: ( ')' )
            // InternalMyTurtleDsl.g:3824:2: ')'
            {
             before(grammarAccess.getDroiteAccess().getRightParenthesisKeyword_5()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:3834:1: rule__Pause__Group__0 : rule__Pause__Group__0__Impl rule__Pause__Group__1 ;
    public final void rule__Pause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3838:1: ( rule__Pause__Group__0__Impl rule__Pause__Group__1 )
            // InternalMyTurtleDsl.g:3839:2: rule__Pause__Group__0__Impl rule__Pause__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyTurtleDsl.g:3846:1: rule__Pause__Group__0__Impl : ( 'droite' ) ;
    public final void rule__Pause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3850:1: ( ( 'droite' ) )
            // InternalMyTurtleDsl.g:3851:1: ( 'droite' )
            {
            // InternalMyTurtleDsl.g:3851:1: ( 'droite' )
            // InternalMyTurtleDsl.g:3852:2: 'droite'
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
    // InternalMyTurtleDsl.g:3861:1: rule__Pause__Group__1 : rule__Pause__Group__1__Impl rule__Pause__Group__2 ;
    public final void rule__Pause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3865:1: ( rule__Pause__Group__1__Impl rule__Pause__Group__2 )
            // InternalMyTurtleDsl.g:3866:2: rule__Pause__Group__1__Impl rule__Pause__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyTurtleDsl.g:3873:1: rule__Pause__Group__1__Impl : ( '(' ) ;
    public final void rule__Pause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3877:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:3878:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:3878:1: ( '(' )
            // InternalMyTurtleDsl.g:3879:2: '('
            {
             before(grammarAccess.getPauseAccess().getLeftParenthesisKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:3888:1: rule__Pause__Group__2 : rule__Pause__Group__2__Impl rule__Pause__Group__3 ;
    public final void rule__Pause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3892:1: ( rule__Pause__Group__2__Impl rule__Pause__Group__3 )
            // InternalMyTurtleDsl.g:3893:2: rule__Pause__Group__2__Impl rule__Pause__Group__3
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
    // InternalMyTurtleDsl.g:3900:1: rule__Pause__Group__2__Impl : ( ( rule__Pause__DureeAssignment_2 ) ) ;
    public final void rule__Pause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3904:1: ( ( ( rule__Pause__DureeAssignment_2 ) ) )
            // InternalMyTurtleDsl.g:3905:1: ( ( rule__Pause__DureeAssignment_2 ) )
            {
            // InternalMyTurtleDsl.g:3905:1: ( ( rule__Pause__DureeAssignment_2 ) )
            // InternalMyTurtleDsl.g:3906:2: ( rule__Pause__DureeAssignment_2 )
            {
             before(grammarAccess.getPauseAccess().getDureeAssignment_2()); 
            // InternalMyTurtleDsl.g:3907:2: ( rule__Pause__DureeAssignment_2 )
            // InternalMyTurtleDsl.g:3907:3: rule__Pause__DureeAssignment_2
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
    // InternalMyTurtleDsl.g:3915:1: rule__Pause__Group__3 : rule__Pause__Group__3__Impl ;
    public final void rule__Pause__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3919:1: ( rule__Pause__Group__3__Impl )
            // InternalMyTurtleDsl.g:3920:2: rule__Pause__Group__3__Impl
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
    // InternalMyTurtleDsl.g:3926:1: rule__Pause__Group__3__Impl : ( ')' ) ;
    public final void rule__Pause__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3930:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:3931:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:3931:1: ( ')' )
            // InternalMyTurtleDsl.g:3932:2: ')'
            {
             before(grammarAccess.getPauseAccess().getRightParenthesisKeyword_3()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:3942:1: rule__RotationGauche__Group__0 : rule__RotationGauche__Group__0__Impl rule__RotationGauche__Group__1 ;
    public final void rule__RotationGauche__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3946:1: ( rule__RotationGauche__Group__0__Impl rule__RotationGauche__Group__1 )
            // InternalMyTurtleDsl.g:3947:2: rule__RotationGauche__Group__0__Impl rule__RotationGauche__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyTurtleDsl.g:3954:1: rule__RotationGauche__Group__0__Impl : ( 'rotation_gauche' ) ;
    public final void rule__RotationGauche__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3958:1: ( ( 'rotation_gauche' ) )
            // InternalMyTurtleDsl.g:3959:1: ( 'rotation_gauche' )
            {
            // InternalMyTurtleDsl.g:3959:1: ( 'rotation_gauche' )
            // InternalMyTurtleDsl.g:3960:2: 'rotation_gauche'
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
    // InternalMyTurtleDsl.g:3969:1: rule__RotationGauche__Group__1 : rule__RotationGauche__Group__1__Impl rule__RotationGauche__Group__2 ;
    public final void rule__RotationGauche__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3973:1: ( rule__RotationGauche__Group__1__Impl rule__RotationGauche__Group__2 )
            // InternalMyTurtleDsl.g:3974:2: rule__RotationGauche__Group__1__Impl rule__RotationGauche__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyTurtleDsl.g:3981:1: rule__RotationGauche__Group__1__Impl : ( '(' ) ;
    public final void rule__RotationGauche__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3985:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:3986:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:3986:1: ( '(' )
            // InternalMyTurtleDsl.g:3987:2: '('
            {
             before(grammarAccess.getRotationGaucheAccess().getLeftParenthesisKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:3996:1: rule__RotationGauche__Group__2 : rule__RotationGauche__Group__2__Impl rule__RotationGauche__Group__3 ;
    public final void rule__RotationGauche__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4000:1: ( rule__RotationGauche__Group__2__Impl rule__RotationGauche__Group__3 )
            // InternalMyTurtleDsl.g:4001:2: rule__RotationGauche__Group__2__Impl rule__RotationGauche__Group__3
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
    // InternalMyTurtleDsl.g:4008:1: rule__RotationGauche__Group__2__Impl : ( ( rule__RotationGauche__DureeAssignment_2 ) ) ;
    public final void rule__RotationGauche__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4012:1: ( ( ( rule__RotationGauche__DureeAssignment_2 ) ) )
            // InternalMyTurtleDsl.g:4013:1: ( ( rule__RotationGauche__DureeAssignment_2 ) )
            {
            // InternalMyTurtleDsl.g:4013:1: ( ( rule__RotationGauche__DureeAssignment_2 ) )
            // InternalMyTurtleDsl.g:4014:2: ( rule__RotationGauche__DureeAssignment_2 )
            {
             before(grammarAccess.getRotationGaucheAccess().getDureeAssignment_2()); 
            // InternalMyTurtleDsl.g:4015:2: ( rule__RotationGauche__DureeAssignment_2 )
            // InternalMyTurtleDsl.g:4015:3: rule__RotationGauche__DureeAssignment_2
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
    // InternalMyTurtleDsl.g:4023:1: rule__RotationGauche__Group__3 : rule__RotationGauche__Group__3__Impl rule__RotationGauche__Group__4 ;
    public final void rule__RotationGauche__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4027:1: ( rule__RotationGauche__Group__3__Impl rule__RotationGauche__Group__4 )
            // InternalMyTurtleDsl.g:4028:2: rule__RotationGauche__Group__3__Impl rule__RotationGauche__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyTurtleDsl.g:4035:1: rule__RotationGauche__Group__3__Impl : ( ',' ) ;
    public final void rule__RotationGauche__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4039:1: ( ( ',' ) )
            // InternalMyTurtleDsl.g:4040:1: ( ',' )
            {
            // InternalMyTurtleDsl.g:4040:1: ( ',' )
            // InternalMyTurtleDsl.g:4041:2: ','
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
    // InternalMyTurtleDsl.g:4050:1: rule__RotationGauche__Group__4 : rule__RotationGauche__Group__4__Impl rule__RotationGauche__Group__5 ;
    public final void rule__RotationGauche__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4054:1: ( rule__RotationGauche__Group__4__Impl rule__RotationGauche__Group__5 )
            // InternalMyTurtleDsl.g:4055:2: rule__RotationGauche__Group__4__Impl rule__RotationGauche__Group__5
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
    // InternalMyTurtleDsl.g:4062:1: rule__RotationGauche__Group__4__Impl : ( ( rule__RotationGauche__Vitesse_rotationAssignment_4 ) ) ;
    public final void rule__RotationGauche__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4066:1: ( ( ( rule__RotationGauche__Vitesse_rotationAssignment_4 ) ) )
            // InternalMyTurtleDsl.g:4067:1: ( ( rule__RotationGauche__Vitesse_rotationAssignment_4 ) )
            {
            // InternalMyTurtleDsl.g:4067:1: ( ( rule__RotationGauche__Vitesse_rotationAssignment_4 ) )
            // InternalMyTurtleDsl.g:4068:2: ( rule__RotationGauche__Vitesse_rotationAssignment_4 )
            {
             before(grammarAccess.getRotationGaucheAccess().getVitesse_rotationAssignment_4()); 
            // InternalMyTurtleDsl.g:4069:2: ( rule__RotationGauche__Vitesse_rotationAssignment_4 )
            // InternalMyTurtleDsl.g:4069:3: rule__RotationGauche__Vitesse_rotationAssignment_4
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
    // InternalMyTurtleDsl.g:4077:1: rule__RotationGauche__Group__5 : rule__RotationGauche__Group__5__Impl ;
    public final void rule__RotationGauche__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4081:1: ( rule__RotationGauche__Group__5__Impl )
            // InternalMyTurtleDsl.g:4082:2: rule__RotationGauche__Group__5__Impl
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
    // InternalMyTurtleDsl.g:4088:1: rule__RotationGauche__Group__5__Impl : ( ')' ) ;
    public final void rule__RotationGauche__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4092:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:4093:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:4093:1: ( ')' )
            // InternalMyTurtleDsl.g:4094:2: ')'
            {
             before(grammarAccess.getRotationGaucheAccess().getRightParenthesisKeyword_5()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:4104:1: rule__RotationDroite__Group__0 : rule__RotationDroite__Group__0__Impl rule__RotationDroite__Group__1 ;
    public final void rule__RotationDroite__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4108:1: ( rule__RotationDroite__Group__0__Impl rule__RotationDroite__Group__1 )
            // InternalMyTurtleDsl.g:4109:2: rule__RotationDroite__Group__0__Impl rule__RotationDroite__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyTurtleDsl.g:4116:1: rule__RotationDroite__Group__0__Impl : ( 'rotation_droite' ) ;
    public final void rule__RotationDroite__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4120:1: ( ( 'rotation_droite' ) )
            // InternalMyTurtleDsl.g:4121:1: ( 'rotation_droite' )
            {
            // InternalMyTurtleDsl.g:4121:1: ( 'rotation_droite' )
            // InternalMyTurtleDsl.g:4122:2: 'rotation_droite'
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
    // InternalMyTurtleDsl.g:4131:1: rule__RotationDroite__Group__1 : rule__RotationDroite__Group__1__Impl rule__RotationDroite__Group__2 ;
    public final void rule__RotationDroite__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4135:1: ( rule__RotationDroite__Group__1__Impl rule__RotationDroite__Group__2 )
            // InternalMyTurtleDsl.g:4136:2: rule__RotationDroite__Group__1__Impl rule__RotationDroite__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyTurtleDsl.g:4143:1: rule__RotationDroite__Group__1__Impl : ( '(' ) ;
    public final void rule__RotationDroite__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4147:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:4148:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:4148:1: ( '(' )
            // InternalMyTurtleDsl.g:4149:2: '('
            {
             before(grammarAccess.getRotationDroiteAccess().getLeftParenthesisKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:4158:1: rule__RotationDroite__Group__2 : rule__RotationDroite__Group__2__Impl rule__RotationDroite__Group__3 ;
    public final void rule__RotationDroite__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4162:1: ( rule__RotationDroite__Group__2__Impl rule__RotationDroite__Group__3 )
            // InternalMyTurtleDsl.g:4163:2: rule__RotationDroite__Group__2__Impl rule__RotationDroite__Group__3
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
    // InternalMyTurtleDsl.g:4170:1: rule__RotationDroite__Group__2__Impl : ( ( rule__RotationDroite__DureeAssignment_2 ) ) ;
    public final void rule__RotationDroite__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4174:1: ( ( ( rule__RotationDroite__DureeAssignment_2 ) ) )
            // InternalMyTurtleDsl.g:4175:1: ( ( rule__RotationDroite__DureeAssignment_2 ) )
            {
            // InternalMyTurtleDsl.g:4175:1: ( ( rule__RotationDroite__DureeAssignment_2 ) )
            // InternalMyTurtleDsl.g:4176:2: ( rule__RotationDroite__DureeAssignment_2 )
            {
             before(grammarAccess.getRotationDroiteAccess().getDureeAssignment_2()); 
            // InternalMyTurtleDsl.g:4177:2: ( rule__RotationDroite__DureeAssignment_2 )
            // InternalMyTurtleDsl.g:4177:3: rule__RotationDroite__DureeAssignment_2
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
    // InternalMyTurtleDsl.g:4185:1: rule__RotationDroite__Group__3 : rule__RotationDroite__Group__3__Impl rule__RotationDroite__Group__4 ;
    public final void rule__RotationDroite__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4189:1: ( rule__RotationDroite__Group__3__Impl rule__RotationDroite__Group__4 )
            // InternalMyTurtleDsl.g:4190:2: rule__RotationDroite__Group__3__Impl rule__RotationDroite__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyTurtleDsl.g:4197:1: rule__RotationDroite__Group__3__Impl : ( ',' ) ;
    public final void rule__RotationDroite__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4201:1: ( ( ',' ) )
            // InternalMyTurtleDsl.g:4202:1: ( ',' )
            {
            // InternalMyTurtleDsl.g:4202:1: ( ',' )
            // InternalMyTurtleDsl.g:4203:2: ','
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
    // InternalMyTurtleDsl.g:4212:1: rule__RotationDroite__Group__4 : rule__RotationDroite__Group__4__Impl rule__RotationDroite__Group__5 ;
    public final void rule__RotationDroite__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4216:1: ( rule__RotationDroite__Group__4__Impl rule__RotationDroite__Group__5 )
            // InternalMyTurtleDsl.g:4217:2: rule__RotationDroite__Group__4__Impl rule__RotationDroite__Group__5
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
    // InternalMyTurtleDsl.g:4224:1: rule__RotationDroite__Group__4__Impl : ( ( rule__RotationDroite__Vitesse_rotationAssignment_4 ) ) ;
    public final void rule__RotationDroite__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4228:1: ( ( ( rule__RotationDroite__Vitesse_rotationAssignment_4 ) ) )
            // InternalMyTurtleDsl.g:4229:1: ( ( rule__RotationDroite__Vitesse_rotationAssignment_4 ) )
            {
            // InternalMyTurtleDsl.g:4229:1: ( ( rule__RotationDroite__Vitesse_rotationAssignment_4 ) )
            // InternalMyTurtleDsl.g:4230:2: ( rule__RotationDroite__Vitesse_rotationAssignment_4 )
            {
             before(grammarAccess.getRotationDroiteAccess().getVitesse_rotationAssignment_4()); 
            // InternalMyTurtleDsl.g:4231:2: ( rule__RotationDroite__Vitesse_rotationAssignment_4 )
            // InternalMyTurtleDsl.g:4231:3: rule__RotationDroite__Vitesse_rotationAssignment_4
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
    // InternalMyTurtleDsl.g:4239:1: rule__RotationDroite__Group__5 : rule__RotationDroite__Group__5__Impl ;
    public final void rule__RotationDroite__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4243:1: ( rule__RotationDroite__Group__5__Impl )
            // InternalMyTurtleDsl.g:4244:2: rule__RotationDroite__Group__5__Impl
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
    // InternalMyTurtleDsl.g:4250:1: rule__RotationDroite__Group__5__Impl : ( ')' ) ;
    public final void rule__RotationDroite__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4254:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:4255:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:4255:1: ( ')' )
            // InternalMyTurtleDsl.g:4256:2: ')'
            {
             before(grammarAccess.getRotationDroiteAccess().getRightParenthesisKeyword_5()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:4266:1: rule__FonctionDecl__Group__0 : rule__FonctionDecl__Group__0__Impl rule__FonctionDecl__Group__1 ;
    public final void rule__FonctionDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4270:1: ( rule__FonctionDecl__Group__0__Impl rule__FonctionDecl__Group__1 )
            // InternalMyTurtleDsl.g:4271:2: rule__FonctionDecl__Group__0__Impl rule__FonctionDecl__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyTurtleDsl.g:4278:1: rule__FonctionDecl__Group__0__Impl : ( 'func' ) ;
    public final void rule__FonctionDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4282:1: ( ( 'func' ) )
            // InternalMyTurtleDsl.g:4283:1: ( 'func' )
            {
            // InternalMyTurtleDsl.g:4283:1: ( 'func' )
            // InternalMyTurtleDsl.g:4284:2: 'func'
            {
             before(grammarAccess.getFonctionDeclAccess().getFuncKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:4293:1: rule__FonctionDecl__Group__1 : rule__FonctionDecl__Group__1__Impl rule__FonctionDecl__Group__2 ;
    public final void rule__FonctionDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4297:1: ( rule__FonctionDecl__Group__1__Impl rule__FonctionDecl__Group__2 )
            // InternalMyTurtleDsl.g:4298:2: rule__FonctionDecl__Group__1__Impl rule__FonctionDecl__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyTurtleDsl.g:4305:1: rule__FonctionDecl__Group__1__Impl : ( ( rule__FonctionDecl__NameAssignment_1 ) ) ;
    public final void rule__FonctionDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4309:1: ( ( ( rule__FonctionDecl__NameAssignment_1 ) ) )
            // InternalMyTurtleDsl.g:4310:1: ( ( rule__FonctionDecl__NameAssignment_1 ) )
            {
            // InternalMyTurtleDsl.g:4310:1: ( ( rule__FonctionDecl__NameAssignment_1 ) )
            // InternalMyTurtleDsl.g:4311:2: ( rule__FonctionDecl__NameAssignment_1 )
            {
             before(grammarAccess.getFonctionDeclAccess().getNameAssignment_1()); 
            // InternalMyTurtleDsl.g:4312:2: ( rule__FonctionDecl__NameAssignment_1 )
            // InternalMyTurtleDsl.g:4312:3: rule__FonctionDecl__NameAssignment_1
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
    // InternalMyTurtleDsl.g:4320:1: rule__FonctionDecl__Group__2 : rule__FonctionDecl__Group__2__Impl rule__FonctionDecl__Group__3 ;
    public final void rule__FonctionDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4324:1: ( rule__FonctionDecl__Group__2__Impl rule__FonctionDecl__Group__3 )
            // InternalMyTurtleDsl.g:4325:2: rule__FonctionDecl__Group__2__Impl rule__FonctionDecl__Group__3
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
    // InternalMyTurtleDsl.g:4332:1: rule__FonctionDecl__Group__2__Impl : ( '(' ) ;
    public final void rule__FonctionDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4336:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:4337:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:4337:1: ( '(' )
            // InternalMyTurtleDsl.g:4338:2: '('
            {
             before(grammarAccess.getFonctionDeclAccess().getLeftParenthesisKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:4347:1: rule__FonctionDecl__Group__3 : rule__FonctionDecl__Group__3__Impl rule__FonctionDecl__Group__4 ;
    public final void rule__FonctionDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4351:1: ( rule__FonctionDecl__Group__3__Impl rule__FonctionDecl__Group__4 )
            // InternalMyTurtleDsl.g:4352:2: rule__FonctionDecl__Group__3__Impl rule__FonctionDecl__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyTurtleDsl.g:4359:1: rule__FonctionDecl__Group__3__Impl : ( ')' ) ;
    public final void rule__FonctionDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4363:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:4364:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:4364:1: ( ')' )
            // InternalMyTurtleDsl.g:4365:2: ')'
            {
             before(grammarAccess.getFonctionDeclAccess().getRightParenthesisKeyword_3()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:4374:1: rule__FonctionDecl__Group__4 : rule__FonctionDecl__Group__4__Impl rule__FonctionDecl__Group__5 ;
    public final void rule__FonctionDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4378:1: ( rule__FonctionDecl__Group__4__Impl rule__FonctionDecl__Group__5 )
            // InternalMyTurtleDsl.g:4379:2: rule__FonctionDecl__Group__4__Impl rule__FonctionDecl__Group__5
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyTurtleDsl.g:4386:1: rule__FonctionDecl__Group__4__Impl : ( '{' ) ;
    public final void rule__FonctionDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4390:1: ( ( '{' ) )
            // InternalMyTurtleDsl.g:4391:1: ( '{' )
            {
            // InternalMyTurtleDsl.g:4391:1: ( '{' )
            // InternalMyTurtleDsl.g:4392:2: '{'
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
    // InternalMyTurtleDsl.g:4401:1: rule__FonctionDecl__Group__5 : rule__FonctionDecl__Group__5__Impl rule__FonctionDecl__Group__6 ;
    public final void rule__FonctionDecl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4405:1: ( rule__FonctionDecl__Group__5__Impl rule__FonctionDecl__Group__6 )
            // InternalMyTurtleDsl.g:4406:2: rule__FonctionDecl__Group__5__Impl rule__FonctionDecl__Group__6
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyTurtleDsl.g:4413:1: rule__FonctionDecl__Group__5__Impl : ( ( rule__FonctionDecl__BodyAssignment_5 )* ) ;
    public final void rule__FonctionDecl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4417:1: ( ( ( rule__FonctionDecl__BodyAssignment_5 )* ) )
            // InternalMyTurtleDsl.g:4418:1: ( ( rule__FonctionDecl__BodyAssignment_5 )* )
            {
            // InternalMyTurtleDsl.g:4418:1: ( ( rule__FonctionDecl__BodyAssignment_5 )* )
            // InternalMyTurtleDsl.g:4419:2: ( rule__FonctionDecl__BodyAssignment_5 )*
            {
             before(grammarAccess.getFonctionDeclAccess().getBodyAssignment_5()); 
            // InternalMyTurtleDsl.g:4420:2: ( rule__FonctionDecl__BodyAssignment_5 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==30||(LA27_0>=32 && LA27_0<=38)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:4420:3: rule__FonctionDecl__BodyAssignment_5
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__FonctionDecl__BodyAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalMyTurtleDsl.g:4428:1: rule__FonctionDecl__Group__6 : rule__FonctionDecl__Group__6__Impl rule__FonctionDecl__Group__7 ;
    public final void rule__FonctionDecl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4432:1: ( rule__FonctionDecl__Group__6__Impl rule__FonctionDecl__Group__7 )
            // InternalMyTurtleDsl.g:4433:2: rule__FonctionDecl__Group__6__Impl rule__FonctionDecl__Group__7
            {
            pushFollow(FOLLOW_32);
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
    // InternalMyTurtleDsl.g:4440:1: rule__FonctionDecl__Group__6__Impl : ( '\\n' ) ;
    public final void rule__FonctionDecl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4444:1: ( ( '\\n' ) )
            // InternalMyTurtleDsl.g:4445:1: ( '\\n' )
            {
            // InternalMyTurtleDsl.g:4445:1: ( '\\n' )
            // InternalMyTurtleDsl.g:4446:2: '\\n'
            {
             before(grammarAccess.getFonctionDeclAccess().getLineFeedKeyword_6()); 
            match(input,13,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:4455:1: rule__FonctionDecl__Group__7 : rule__FonctionDecl__Group__7__Impl ;
    public final void rule__FonctionDecl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4459:1: ( rule__FonctionDecl__Group__7__Impl )
            // InternalMyTurtleDsl.g:4460:2: rule__FonctionDecl__Group__7__Impl
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
    // InternalMyTurtleDsl.g:4466:1: rule__FonctionDecl__Group__7__Impl : ( '}' ) ;
    public final void rule__FonctionDecl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4470:1: ( ( '}' ) )
            // InternalMyTurtleDsl.g:4471:1: ( '}' )
            {
            // InternalMyTurtleDsl.g:4471:1: ( '}' )
            // InternalMyTurtleDsl.g:4472:2: '}'
            {
             before(grammarAccess.getFonctionDeclAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_2); 
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


    // $ANTLR start "rule__PourcentDecl__Group__0"
    // InternalMyTurtleDsl.g:4482:1: rule__PourcentDecl__Group__0 : rule__PourcentDecl__Group__0__Impl rule__PourcentDecl__Group__1 ;
    public final void rule__PourcentDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4486:1: ( rule__PourcentDecl__Group__0__Impl rule__PourcentDecl__Group__1 )
            // InternalMyTurtleDsl.g:4487:2: rule__PourcentDecl__Group__0__Impl rule__PourcentDecl__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyTurtleDsl.g:4494:1: rule__PourcentDecl__Group__0__Impl : ( 'Pourcent' ) ;
    public final void rule__PourcentDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4498:1: ( ( 'Pourcent' ) )
            // InternalMyTurtleDsl.g:4499:1: ( 'Pourcent' )
            {
            // InternalMyTurtleDsl.g:4499:1: ( 'Pourcent' )
            // InternalMyTurtleDsl.g:4500:2: 'Pourcent'
            {
             before(grammarAccess.getPourcentDeclAccess().getPourcentKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:4509:1: rule__PourcentDecl__Group__1 : rule__PourcentDecl__Group__1__Impl rule__PourcentDecl__Group__2 ;
    public final void rule__PourcentDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4513:1: ( rule__PourcentDecl__Group__1__Impl rule__PourcentDecl__Group__2 )
            // InternalMyTurtleDsl.g:4514:2: rule__PourcentDecl__Group__1__Impl rule__PourcentDecl__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalMyTurtleDsl.g:4521:1: rule__PourcentDecl__Group__1__Impl : ( ( rule__PourcentDecl__NameAssignment_1 ) ) ;
    public final void rule__PourcentDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4525:1: ( ( ( rule__PourcentDecl__NameAssignment_1 ) ) )
            // InternalMyTurtleDsl.g:4526:1: ( ( rule__PourcentDecl__NameAssignment_1 ) )
            {
            // InternalMyTurtleDsl.g:4526:1: ( ( rule__PourcentDecl__NameAssignment_1 ) )
            // InternalMyTurtleDsl.g:4527:2: ( rule__PourcentDecl__NameAssignment_1 )
            {
             before(grammarAccess.getPourcentDeclAccess().getNameAssignment_1()); 
            // InternalMyTurtleDsl.g:4528:2: ( rule__PourcentDecl__NameAssignment_1 )
            // InternalMyTurtleDsl.g:4528:3: rule__PourcentDecl__NameAssignment_1
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
    // InternalMyTurtleDsl.g:4536:1: rule__PourcentDecl__Group__2 : rule__PourcentDecl__Group__2__Impl rule__PourcentDecl__Group__3 ;
    public final void rule__PourcentDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4540:1: ( rule__PourcentDecl__Group__2__Impl rule__PourcentDecl__Group__3 )
            // InternalMyTurtleDsl.g:4541:2: rule__PourcentDecl__Group__2__Impl rule__PourcentDecl__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyTurtleDsl.g:4548:1: rule__PourcentDecl__Group__2__Impl : ( '=' ) ;
    public final void rule__PourcentDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4552:1: ( ( '=' ) )
            // InternalMyTurtleDsl.g:4553:1: ( '=' )
            {
            // InternalMyTurtleDsl.g:4553:1: ( '=' )
            // InternalMyTurtleDsl.g:4554:2: '='
            {
             before(grammarAccess.getPourcentDeclAccess().getEqualsSignKeyword_2()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:4563:1: rule__PourcentDecl__Group__3 : rule__PourcentDecl__Group__3__Impl ;
    public final void rule__PourcentDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4567:1: ( rule__PourcentDecl__Group__3__Impl )
            // InternalMyTurtleDsl.g:4568:2: rule__PourcentDecl__Group__3__Impl
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
    // InternalMyTurtleDsl.g:4574:1: rule__PourcentDecl__Group__3__Impl : ( ( rule__PourcentDecl__ValAssignment_3 ) ) ;
    public final void rule__PourcentDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4578:1: ( ( ( rule__PourcentDecl__ValAssignment_3 ) ) )
            // InternalMyTurtleDsl.g:4579:1: ( ( rule__PourcentDecl__ValAssignment_3 ) )
            {
            // InternalMyTurtleDsl.g:4579:1: ( ( rule__PourcentDecl__ValAssignment_3 ) )
            // InternalMyTurtleDsl.g:4580:2: ( rule__PourcentDecl__ValAssignment_3 )
            {
             before(grammarAccess.getPourcentDeclAccess().getValAssignment_3()); 
            // InternalMyTurtleDsl.g:4581:2: ( rule__PourcentDecl__ValAssignment_3 )
            // InternalMyTurtleDsl.g:4581:3: rule__PourcentDecl__ValAssignment_3
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


    // $ANTLR start "rule__IntDecl__Group__0"
    // InternalMyTurtleDsl.g:4590:1: rule__IntDecl__Group__0 : rule__IntDecl__Group__0__Impl rule__IntDecl__Group__1 ;
    public final void rule__IntDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4594:1: ( rule__IntDecl__Group__0__Impl rule__IntDecl__Group__1 )
            // InternalMyTurtleDsl.g:4595:2: rule__IntDecl__Group__0__Impl rule__IntDecl__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyTurtleDsl.g:4602:1: rule__IntDecl__Group__0__Impl : ( 'Seconde' ) ;
    public final void rule__IntDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4606:1: ( ( 'Seconde' ) )
            // InternalMyTurtleDsl.g:4607:1: ( 'Seconde' )
            {
            // InternalMyTurtleDsl.g:4607:1: ( 'Seconde' )
            // InternalMyTurtleDsl.g:4608:2: 'Seconde'
            {
             before(grammarAccess.getIntDeclAccess().getSecondeKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:4617:1: rule__IntDecl__Group__1 : rule__IntDecl__Group__1__Impl rule__IntDecl__Group__2 ;
    public final void rule__IntDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4621:1: ( rule__IntDecl__Group__1__Impl rule__IntDecl__Group__2 )
            // InternalMyTurtleDsl.g:4622:2: rule__IntDecl__Group__1__Impl rule__IntDecl__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalMyTurtleDsl.g:4629:1: rule__IntDecl__Group__1__Impl : ( ( rule__IntDecl__NameAssignment_1 ) ) ;
    public final void rule__IntDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4633:1: ( ( ( rule__IntDecl__NameAssignment_1 ) ) )
            // InternalMyTurtleDsl.g:4634:1: ( ( rule__IntDecl__NameAssignment_1 ) )
            {
            // InternalMyTurtleDsl.g:4634:1: ( ( rule__IntDecl__NameAssignment_1 ) )
            // InternalMyTurtleDsl.g:4635:2: ( rule__IntDecl__NameAssignment_1 )
            {
             before(grammarAccess.getIntDeclAccess().getNameAssignment_1()); 
            // InternalMyTurtleDsl.g:4636:2: ( rule__IntDecl__NameAssignment_1 )
            // InternalMyTurtleDsl.g:4636:3: rule__IntDecl__NameAssignment_1
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
    // InternalMyTurtleDsl.g:4644:1: rule__IntDecl__Group__2 : rule__IntDecl__Group__2__Impl rule__IntDecl__Group__3 ;
    public final void rule__IntDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4648:1: ( rule__IntDecl__Group__2__Impl rule__IntDecl__Group__3 )
            // InternalMyTurtleDsl.g:4649:2: rule__IntDecl__Group__2__Impl rule__IntDecl__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyTurtleDsl.g:4656:1: rule__IntDecl__Group__2__Impl : ( '=' ) ;
    public final void rule__IntDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4660:1: ( ( '=' ) )
            // InternalMyTurtleDsl.g:4661:1: ( '=' )
            {
            // InternalMyTurtleDsl.g:4661:1: ( '=' )
            // InternalMyTurtleDsl.g:4662:2: '='
            {
             before(grammarAccess.getIntDeclAccess().getEqualsSignKeyword_2()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:4671:1: rule__IntDecl__Group__3 : rule__IntDecl__Group__3__Impl ;
    public final void rule__IntDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4675:1: ( rule__IntDecl__Group__3__Impl )
            // InternalMyTurtleDsl.g:4676:2: rule__IntDecl__Group__3__Impl
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
    // InternalMyTurtleDsl.g:4682:1: rule__IntDecl__Group__3__Impl : ( ( rule__IntDecl__ValAssignment_3 ) ) ;
    public final void rule__IntDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4686:1: ( ( ( rule__IntDecl__ValAssignment_3 ) ) )
            // InternalMyTurtleDsl.g:4687:1: ( ( rule__IntDecl__ValAssignment_3 ) )
            {
            // InternalMyTurtleDsl.g:4687:1: ( ( rule__IntDecl__ValAssignment_3 ) )
            // InternalMyTurtleDsl.g:4688:2: ( rule__IntDecl__ValAssignment_3 )
            {
             before(grammarAccess.getIntDeclAccess().getValAssignment_3()); 
            // InternalMyTurtleDsl.g:4689:2: ( rule__IntDecl__ValAssignment_3 )
            // InternalMyTurtleDsl.g:4689:3: rule__IntDecl__ValAssignment_3
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


    // $ANTLR start "rule__FonctionCall__Group__0"
    // InternalMyTurtleDsl.g:4698:1: rule__FonctionCall__Group__0 : rule__FonctionCall__Group__0__Impl rule__FonctionCall__Group__1 ;
    public final void rule__FonctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4702:1: ( rule__FonctionCall__Group__0__Impl rule__FonctionCall__Group__1 )
            // InternalMyTurtleDsl.g:4703:2: rule__FonctionCall__Group__0__Impl rule__FonctionCall__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyTurtleDsl.g:4710:1: rule__FonctionCall__Group__0__Impl : ( ( rule__FonctionCall__FuncAssignment_0 ) ) ;
    public final void rule__FonctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4714:1: ( ( ( rule__FonctionCall__FuncAssignment_0 ) ) )
            // InternalMyTurtleDsl.g:4715:1: ( ( rule__FonctionCall__FuncAssignment_0 ) )
            {
            // InternalMyTurtleDsl.g:4715:1: ( ( rule__FonctionCall__FuncAssignment_0 ) )
            // InternalMyTurtleDsl.g:4716:2: ( rule__FonctionCall__FuncAssignment_0 )
            {
             before(grammarAccess.getFonctionCallAccess().getFuncAssignment_0()); 
            // InternalMyTurtleDsl.g:4717:2: ( rule__FonctionCall__FuncAssignment_0 )
            // InternalMyTurtleDsl.g:4717:3: rule__FonctionCall__FuncAssignment_0
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
    // InternalMyTurtleDsl.g:4725:1: rule__FonctionCall__Group__1 : rule__FonctionCall__Group__1__Impl rule__FonctionCall__Group__2 ;
    public final void rule__FonctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4729:1: ( rule__FonctionCall__Group__1__Impl rule__FonctionCall__Group__2 )
            // InternalMyTurtleDsl.g:4730:2: rule__FonctionCall__Group__1__Impl rule__FonctionCall__Group__2
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
    // InternalMyTurtleDsl.g:4737:1: rule__FonctionCall__Group__1__Impl : ( '(' ) ;
    public final void rule__FonctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4741:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:4742:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:4742:1: ( '(' )
            // InternalMyTurtleDsl.g:4743:2: '('
            {
             before(grammarAccess.getFonctionCallAccess().getLeftParenthesisKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:4752:1: rule__FonctionCall__Group__2 : rule__FonctionCall__Group__2__Impl ;
    public final void rule__FonctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4756:1: ( rule__FonctionCall__Group__2__Impl )
            // InternalMyTurtleDsl.g:4757:2: rule__FonctionCall__Group__2__Impl
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
    // InternalMyTurtleDsl.g:4763:1: rule__FonctionCall__Group__2__Impl : ( ')' ) ;
    public final void rule__FonctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4767:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:4768:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:4768:1: ( ')' )
            // InternalMyTurtleDsl.g:4769:2: ')'
            {
             before(grammarAccess.getFonctionCallAccess().getRightParenthesisKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:4779:1: rule__Parallele2__Group_0__0 : rule__Parallele2__Group_0__0__Impl rule__Parallele2__Group_0__1 ;
    public final void rule__Parallele2__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4783:1: ( rule__Parallele2__Group_0__0__Impl rule__Parallele2__Group_0__1 )
            // InternalMyTurtleDsl.g:4784:2: rule__Parallele2__Group_0__0__Impl rule__Parallele2__Group_0__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:4791:1: rule__Parallele2__Group_0__0__Impl : ( ( rule__Parallele2__AAssignment_0_0 ) ) ;
    public final void rule__Parallele2__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4795:1: ( ( ( rule__Parallele2__AAssignment_0_0 ) ) )
            // InternalMyTurtleDsl.g:4796:1: ( ( rule__Parallele2__AAssignment_0_0 ) )
            {
            // InternalMyTurtleDsl.g:4796:1: ( ( rule__Parallele2__AAssignment_0_0 ) )
            // InternalMyTurtleDsl.g:4797:2: ( rule__Parallele2__AAssignment_0_0 )
            {
             before(grammarAccess.getParallele2Access().getAAssignment_0_0()); 
            // InternalMyTurtleDsl.g:4798:2: ( rule__Parallele2__AAssignment_0_0 )
            // InternalMyTurtleDsl.g:4798:3: rule__Parallele2__AAssignment_0_0
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
    // InternalMyTurtleDsl.g:4806:1: rule__Parallele2__Group_0__1 : rule__Parallele2__Group_0__1__Impl rule__Parallele2__Group_0__2 ;
    public final void rule__Parallele2__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4810:1: ( rule__Parallele2__Group_0__1__Impl rule__Parallele2__Group_0__2 )
            // InternalMyTurtleDsl.g:4811:2: rule__Parallele2__Group_0__1__Impl rule__Parallele2__Group_0__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyTurtleDsl.g:4818:1: rule__Parallele2__Group_0__1__Impl : ( '&' ) ;
    public final void rule__Parallele2__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4822:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:4823:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:4823:1: ( '&' )
            // InternalMyTurtleDsl.g:4824:2: '&'
            {
             before(grammarAccess.getParallele2Access().getAmpersandKeyword_0_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:4833:1: rule__Parallele2__Group_0__2 : rule__Parallele2__Group_0__2__Impl ;
    public final void rule__Parallele2__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4837:1: ( rule__Parallele2__Group_0__2__Impl )
            // InternalMyTurtleDsl.g:4838:2: rule__Parallele2__Group_0__2__Impl
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
    // InternalMyTurtleDsl.g:4844:1: rule__Parallele2__Group_0__2__Impl : ( ( rule__Parallele2__TAssignment_0_2 ) ) ;
    public final void rule__Parallele2__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4848:1: ( ( ( rule__Parallele2__TAssignment_0_2 ) ) )
            // InternalMyTurtleDsl.g:4849:1: ( ( rule__Parallele2__TAssignment_0_2 ) )
            {
            // InternalMyTurtleDsl.g:4849:1: ( ( rule__Parallele2__TAssignment_0_2 ) )
            // InternalMyTurtleDsl.g:4850:2: ( rule__Parallele2__TAssignment_0_2 )
            {
             before(grammarAccess.getParallele2Access().getTAssignment_0_2()); 
            // InternalMyTurtleDsl.g:4851:2: ( rule__Parallele2__TAssignment_0_2 )
            // InternalMyTurtleDsl.g:4851:3: rule__Parallele2__TAssignment_0_2
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
    // InternalMyTurtleDsl.g:4860:1: rule__Parallele2__Group_1__0 : rule__Parallele2__Group_1__0__Impl rule__Parallele2__Group_1__1 ;
    public final void rule__Parallele2__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4864:1: ( rule__Parallele2__Group_1__0__Impl rule__Parallele2__Group_1__1 )
            // InternalMyTurtleDsl.g:4865:2: rule__Parallele2__Group_1__0__Impl rule__Parallele2__Group_1__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:4872:1: rule__Parallele2__Group_1__0__Impl : ( ( rule__Parallele2__AAssignment_1_0 ) ) ;
    public final void rule__Parallele2__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4876:1: ( ( ( rule__Parallele2__AAssignment_1_0 ) ) )
            // InternalMyTurtleDsl.g:4877:1: ( ( rule__Parallele2__AAssignment_1_0 ) )
            {
            // InternalMyTurtleDsl.g:4877:1: ( ( rule__Parallele2__AAssignment_1_0 ) )
            // InternalMyTurtleDsl.g:4878:2: ( rule__Parallele2__AAssignment_1_0 )
            {
             before(grammarAccess.getParallele2Access().getAAssignment_1_0()); 
            // InternalMyTurtleDsl.g:4879:2: ( rule__Parallele2__AAssignment_1_0 )
            // InternalMyTurtleDsl.g:4879:3: rule__Parallele2__AAssignment_1_0
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
    // InternalMyTurtleDsl.g:4887:1: rule__Parallele2__Group_1__1 : rule__Parallele2__Group_1__1__Impl rule__Parallele2__Group_1__2 ;
    public final void rule__Parallele2__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4891:1: ( rule__Parallele2__Group_1__1__Impl rule__Parallele2__Group_1__2 )
            // InternalMyTurtleDsl.g:4892:2: rule__Parallele2__Group_1__1__Impl rule__Parallele2__Group_1__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalMyTurtleDsl.g:4899:1: rule__Parallele2__Group_1__1__Impl : ( '&' ) ;
    public final void rule__Parallele2__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4903:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:4904:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:4904:1: ( '&' )
            // InternalMyTurtleDsl.g:4905:2: '&'
            {
             before(grammarAccess.getParallele2Access().getAmpersandKeyword_1_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:4914:1: rule__Parallele2__Group_1__2 : rule__Parallele2__Group_1__2__Impl ;
    public final void rule__Parallele2__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4918:1: ( rule__Parallele2__Group_1__2__Impl )
            // InternalMyTurtleDsl.g:4919:2: rule__Parallele2__Group_1__2__Impl
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
    // InternalMyTurtleDsl.g:4925:1: rule__Parallele2__Group_1__2__Impl : ( ( rule__Parallele2__TAssignment_1_2 ) ) ;
    public final void rule__Parallele2__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4929:1: ( ( ( rule__Parallele2__TAssignment_1_2 ) ) )
            // InternalMyTurtleDsl.g:4930:1: ( ( rule__Parallele2__TAssignment_1_2 ) )
            {
            // InternalMyTurtleDsl.g:4930:1: ( ( rule__Parallele2__TAssignment_1_2 ) )
            // InternalMyTurtleDsl.g:4931:2: ( rule__Parallele2__TAssignment_1_2 )
            {
             before(grammarAccess.getParallele2Access().getTAssignment_1_2()); 
            // InternalMyTurtleDsl.g:4932:2: ( rule__Parallele2__TAssignment_1_2 )
            // InternalMyTurtleDsl.g:4932:3: rule__Parallele2__TAssignment_1_2
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
    // InternalMyTurtleDsl.g:4941:1: rule__Parallele2__Group_2__0 : rule__Parallele2__Group_2__0__Impl rule__Parallele2__Group_2__1 ;
    public final void rule__Parallele2__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4945:1: ( rule__Parallele2__Group_2__0__Impl rule__Parallele2__Group_2__1 )
            // InternalMyTurtleDsl.g:4946:2: rule__Parallele2__Group_2__0__Impl rule__Parallele2__Group_2__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:4953:1: rule__Parallele2__Group_2__0__Impl : ( ( rule__Parallele2__AAssignment_2_0 ) ) ;
    public final void rule__Parallele2__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4957:1: ( ( ( rule__Parallele2__AAssignment_2_0 ) ) )
            // InternalMyTurtleDsl.g:4958:1: ( ( rule__Parallele2__AAssignment_2_0 ) )
            {
            // InternalMyTurtleDsl.g:4958:1: ( ( rule__Parallele2__AAssignment_2_0 ) )
            // InternalMyTurtleDsl.g:4959:2: ( rule__Parallele2__AAssignment_2_0 )
            {
             before(grammarAccess.getParallele2Access().getAAssignment_2_0()); 
            // InternalMyTurtleDsl.g:4960:2: ( rule__Parallele2__AAssignment_2_0 )
            // InternalMyTurtleDsl.g:4960:3: rule__Parallele2__AAssignment_2_0
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
    // InternalMyTurtleDsl.g:4968:1: rule__Parallele2__Group_2__1 : rule__Parallele2__Group_2__1__Impl rule__Parallele2__Group_2__2 ;
    public final void rule__Parallele2__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4972:1: ( rule__Parallele2__Group_2__1__Impl rule__Parallele2__Group_2__2 )
            // InternalMyTurtleDsl.g:4973:2: rule__Parallele2__Group_2__1__Impl rule__Parallele2__Group_2__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyTurtleDsl.g:4980:1: rule__Parallele2__Group_2__1__Impl : ( '&' ) ;
    public final void rule__Parallele2__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4984:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:4985:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:4985:1: ( '&' )
            // InternalMyTurtleDsl.g:4986:2: '&'
            {
             before(grammarAccess.getParallele2Access().getAmpersandKeyword_2_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:4995:1: rule__Parallele2__Group_2__2 : rule__Parallele2__Group_2__2__Impl ;
    public final void rule__Parallele2__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4999:1: ( rule__Parallele2__Group_2__2__Impl )
            // InternalMyTurtleDsl.g:5000:2: rule__Parallele2__Group_2__2__Impl
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
    // InternalMyTurtleDsl.g:5006:1: rule__Parallele2__Group_2__2__Impl : ( ( rule__Parallele2__TAssignment_2_2 ) ) ;
    public final void rule__Parallele2__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5010:1: ( ( ( rule__Parallele2__TAssignment_2_2 ) ) )
            // InternalMyTurtleDsl.g:5011:1: ( ( rule__Parallele2__TAssignment_2_2 ) )
            {
            // InternalMyTurtleDsl.g:5011:1: ( ( rule__Parallele2__TAssignment_2_2 ) )
            // InternalMyTurtleDsl.g:5012:2: ( rule__Parallele2__TAssignment_2_2 )
            {
             before(grammarAccess.getParallele2Access().getTAssignment_2_2()); 
            // InternalMyTurtleDsl.g:5013:2: ( rule__Parallele2__TAssignment_2_2 )
            // InternalMyTurtleDsl.g:5013:3: rule__Parallele2__TAssignment_2_2
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
    // InternalMyTurtleDsl.g:5022:1: rule__Parallele2__Group_3__0 : rule__Parallele2__Group_3__0__Impl rule__Parallele2__Group_3__1 ;
    public final void rule__Parallele2__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5026:1: ( rule__Parallele2__Group_3__0__Impl rule__Parallele2__Group_3__1 )
            // InternalMyTurtleDsl.g:5027:2: rule__Parallele2__Group_3__0__Impl rule__Parallele2__Group_3__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:5034:1: rule__Parallele2__Group_3__0__Impl : ( ( rule__Parallele2__TAssignment_3_0 ) ) ;
    public final void rule__Parallele2__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5038:1: ( ( ( rule__Parallele2__TAssignment_3_0 ) ) )
            // InternalMyTurtleDsl.g:5039:1: ( ( rule__Parallele2__TAssignment_3_0 ) )
            {
            // InternalMyTurtleDsl.g:5039:1: ( ( rule__Parallele2__TAssignment_3_0 ) )
            // InternalMyTurtleDsl.g:5040:2: ( rule__Parallele2__TAssignment_3_0 )
            {
             before(grammarAccess.getParallele2Access().getTAssignment_3_0()); 
            // InternalMyTurtleDsl.g:5041:2: ( rule__Parallele2__TAssignment_3_0 )
            // InternalMyTurtleDsl.g:5041:3: rule__Parallele2__TAssignment_3_0
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
    // InternalMyTurtleDsl.g:5049:1: rule__Parallele2__Group_3__1 : rule__Parallele2__Group_3__1__Impl rule__Parallele2__Group_3__2 ;
    public final void rule__Parallele2__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5053:1: ( rule__Parallele2__Group_3__1__Impl rule__Parallele2__Group_3__2 )
            // InternalMyTurtleDsl.g:5054:2: rule__Parallele2__Group_3__1__Impl rule__Parallele2__Group_3__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalMyTurtleDsl.g:5061:1: rule__Parallele2__Group_3__1__Impl : ( '&' ) ;
    public final void rule__Parallele2__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5065:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:5066:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:5066:1: ( '&' )
            // InternalMyTurtleDsl.g:5067:2: '&'
            {
             before(grammarAccess.getParallele2Access().getAmpersandKeyword_3_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:5076:1: rule__Parallele2__Group_3__2 : rule__Parallele2__Group_3__2__Impl ;
    public final void rule__Parallele2__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5080:1: ( rule__Parallele2__Group_3__2__Impl )
            // InternalMyTurtleDsl.g:5081:2: rule__Parallele2__Group_3__2__Impl
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
    // InternalMyTurtleDsl.g:5087:1: rule__Parallele2__Group_3__2__Impl : ( ( rule__Parallele2__BAssignment_3_2 ) ) ;
    public final void rule__Parallele2__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5091:1: ( ( ( rule__Parallele2__BAssignment_3_2 ) ) )
            // InternalMyTurtleDsl.g:5092:1: ( ( rule__Parallele2__BAssignment_3_2 ) )
            {
            // InternalMyTurtleDsl.g:5092:1: ( ( rule__Parallele2__BAssignment_3_2 ) )
            // InternalMyTurtleDsl.g:5093:2: ( rule__Parallele2__BAssignment_3_2 )
            {
             before(grammarAccess.getParallele2Access().getBAssignment_3_2()); 
            // InternalMyTurtleDsl.g:5094:2: ( rule__Parallele2__BAssignment_3_2 )
            // InternalMyTurtleDsl.g:5094:3: rule__Parallele2__BAssignment_3_2
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
    // InternalMyTurtleDsl.g:5103:1: rule__Parallele2__Group_4__0 : rule__Parallele2__Group_4__0__Impl rule__Parallele2__Group_4__1 ;
    public final void rule__Parallele2__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5107:1: ( rule__Parallele2__Group_4__0__Impl rule__Parallele2__Group_4__1 )
            // InternalMyTurtleDsl.g:5108:2: rule__Parallele2__Group_4__0__Impl rule__Parallele2__Group_4__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:5115:1: rule__Parallele2__Group_4__0__Impl : ( ( rule__Parallele2__TAssignment_4_0 ) ) ;
    public final void rule__Parallele2__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5119:1: ( ( ( rule__Parallele2__TAssignment_4_0 ) ) )
            // InternalMyTurtleDsl.g:5120:1: ( ( rule__Parallele2__TAssignment_4_0 ) )
            {
            // InternalMyTurtleDsl.g:5120:1: ( ( rule__Parallele2__TAssignment_4_0 ) )
            // InternalMyTurtleDsl.g:5121:2: ( rule__Parallele2__TAssignment_4_0 )
            {
             before(grammarAccess.getParallele2Access().getTAssignment_4_0()); 
            // InternalMyTurtleDsl.g:5122:2: ( rule__Parallele2__TAssignment_4_0 )
            // InternalMyTurtleDsl.g:5122:3: rule__Parallele2__TAssignment_4_0
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
    // InternalMyTurtleDsl.g:5130:1: rule__Parallele2__Group_4__1 : rule__Parallele2__Group_4__1__Impl rule__Parallele2__Group_4__2 ;
    public final void rule__Parallele2__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5134:1: ( rule__Parallele2__Group_4__1__Impl rule__Parallele2__Group_4__2 )
            // InternalMyTurtleDsl.g:5135:2: rule__Parallele2__Group_4__1__Impl rule__Parallele2__Group_4__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalMyTurtleDsl.g:5142:1: rule__Parallele2__Group_4__1__Impl : ( '&' ) ;
    public final void rule__Parallele2__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5146:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:5147:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:5147:1: ( '&' )
            // InternalMyTurtleDsl.g:5148:2: '&'
            {
             before(grammarAccess.getParallele2Access().getAmpersandKeyword_4_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:5157:1: rule__Parallele2__Group_4__2 : rule__Parallele2__Group_4__2__Impl ;
    public final void rule__Parallele2__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5161:1: ( rule__Parallele2__Group_4__2__Impl )
            // InternalMyTurtleDsl.g:5162:2: rule__Parallele2__Group_4__2__Impl
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
    // InternalMyTurtleDsl.g:5168:1: rule__Parallele2__Group_4__2__Impl : ( ( rule__Parallele2__BAssignment_4_2 ) ) ;
    public final void rule__Parallele2__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5172:1: ( ( ( rule__Parallele2__BAssignment_4_2 ) ) )
            // InternalMyTurtleDsl.g:5173:1: ( ( rule__Parallele2__BAssignment_4_2 ) )
            {
            // InternalMyTurtleDsl.g:5173:1: ( ( rule__Parallele2__BAssignment_4_2 ) )
            // InternalMyTurtleDsl.g:5174:2: ( rule__Parallele2__BAssignment_4_2 )
            {
             before(grammarAccess.getParallele2Access().getBAssignment_4_2()); 
            // InternalMyTurtleDsl.g:5175:2: ( rule__Parallele2__BAssignment_4_2 )
            // InternalMyTurtleDsl.g:5175:3: rule__Parallele2__BAssignment_4_2
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
    // InternalMyTurtleDsl.g:5184:1: rule__Parallele2__Group_5__0 : rule__Parallele2__Group_5__0__Impl rule__Parallele2__Group_5__1 ;
    public final void rule__Parallele2__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5188:1: ( rule__Parallele2__Group_5__0__Impl rule__Parallele2__Group_5__1 )
            // InternalMyTurtleDsl.g:5189:2: rule__Parallele2__Group_5__0__Impl rule__Parallele2__Group_5__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:5196:1: rule__Parallele2__Group_5__0__Impl : ( ( rule__Parallele2__TAssignment_5_0 ) ) ;
    public final void rule__Parallele2__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5200:1: ( ( ( rule__Parallele2__TAssignment_5_0 ) ) )
            // InternalMyTurtleDsl.g:5201:1: ( ( rule__Parallele2__TAssignment_5_0 ) )
            {
            // InternalMyTurtleDsl.g:5201:1: ( ( rule__Parallele2__TAssignment_5_0 ) )
            // InternalMyTurtleDsl.g:5202:2: ( rule__Parallele2__TAssignment_5_0 )
            {
             before(grammarAccess.getParallele2Access().getTAssignment_5_0()); 
            // InternalMyTurtleDsl.g:5203:2: ( rule__Parallele2__TAssignment_5_0 )
            // InternalMyTurtleDsl.g:5203:3: rule__Parallele2__TAssignment_5_0
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
    // InternalMyTurtleDsl.g:5211:1: rule__Parallele2__Group_5__1 : rule__Parallele2__Group_5__1__Impl rule__Parallele2__Group_5__2 ;
    public final void rule__Parallele2__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5215:1: ( rule__Parallele2__Group_5__1__Impl rule__Parallele2__Group_5__2 )
            // InternalMyTurtleDsl.g:5216:2: rule__Parallele2__Group_5__1__Impl rule__Parallele2__Group_5__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyTurtleDsl.g:5223:1: rule__Parallele2__Group_5__1__Impl : ( '&' ) ;
    public final void rule__Parallele2__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5227:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:5228:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:5228:1: ( '&' )
            // InternalMyTurtleDsl.g:5229:2: '&'
            {
             before(grammarAccess.getParallele2Access().getAmpersandKeyword_5_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:5238:1: rule__Parallele2__Group_5__2 : rule__Parallele2__Group_5__2__Impl ;
    public final void rule__Parallele2__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5242:1: ( rule__Parallele2__Group_5__2__Impl )
            // InternalMyTurtleDsl.g:5243:2: rule__Parallele2__Group_5__2__Impl
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
    // InternalMyTurtleDsl.g:5249:1: rule__Parallele2__Group_5__2__Impl : ( ( rule__Parallele2__BAssignment_5_2 ) ) ;
    public final void rule__Parallele2__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5253:1: ( ( ( rule__Parallele2__BAssignment_5_2 ) ) )
            // InternalMyTurtleDsl.g:5254:1: ( ( rule__Parallele2__BAssignment_5_2 ) )
            {
            // InternalMyTurtleDsl.g:5254:1: ( ( rule__Parallele2__BAssignment_5_2 ) )
            // InternalMyTurtleDsl.g:5255:2: ( rule__Parallele2__BAssignment_5_2 )
            {
             before(grammarAccess.getParallele2Access().getBAssignment_5_2()); 
            // InternalMyTurtleDsl.g:5256:2: ( rule__Parallele2__BAssignment_5_2 )
            // InternalMyTurtleDsl.g:5256:3: rule__Parallele2__BAssignment_5_2
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
    // InternalMyTurtleDsl.g:5265:1: rule__Parallele2__Group_6__0 : rule__Parallele2__Group_6__0__Impl rule__Parallele2__Group_6__1 ;
    public final void rule__Parallele2__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5269:1: ( rule__Parallele2__Group_6__0__Impl rule__Parallele2__Group_6__1 )
            // InternalMyTurtleDsl.g:5270:2: rule__Parallele2__Group_6__0__Impl rule__Parallele2__Group_6__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:5277:1: rule__Parallele2__Group_6__0__Impl : ( ( rule__Parallele2__TAssignment_6_0 ) ) ;
    public final void rule__Parallele2__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5281:1: ( ( ( rule__Parallele2__TAssignment_6_0 ) ) )
            // InternalMyTurtleDsl.g:5282:1: ( ( rule__Parallele2__TAssignment_6_0 ) )
            {
            // InternalMyTurtleDsl.g:5282:1: ( ( rule__Parallele2__TAssignment_6_0 ) )
            // InternalMyTurtleDsl.g:5283:2: ( rule__Parallele2__TAssignment_6_0 )
            {
             before(grammarAccess.getParallele2Access().getTAssignment_6_0()); 
            // InternalMyTurtleDsl.g:5284:2: ( rule__Parallele2__TAssignment_6_0 )
            // InternalMyTurtleDsl.g:5284:3: rule__Parallele2__TAssignment_6_0
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
    // InternalMyTurtleDsl.g:5292:1: rule__Parallele2__Group_6__1 : rule__Parallele2__Group_6__1__Impl rule__Parallele2__Group_6__2 ;
    public final void rule__Parallele2__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5296:1: ( rule__Parallele2__Group_6__1__Impl rule__Parallele2__Group_6__2 )
            // InternalMyTurtleDsl.g:5297:2: rule__Parallele2__Group_6__1__Impl rule__Parallele2__Group_6__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalMyTurtleDsl.g:5304:1: rule__Parallele2__Group_6__1__Impl : ( '&' ) ;
    public final void rule__Parallele2__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5308:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:5309:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:5309:1: ( '&' )
            // InternalMyTurtleDsl.g:5310:2: '&'
            {
             before(grammarAccess.getParallele2Access().getAmpersandKeyword_6_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:5319:1: rule__Parallele2__Group_6__2 : rule__Parallele2__Group_6__2__Impl ;
    public final void rule__Parallele2__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5323:1: ( rule__Parallele2__Group_6__2__Impl )
            // InternalMyTurtleDsl.g:5324:2: rule__Parallele2__Group_6__2__Impl
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
    // InternalMyTurtleDsl.g:5330:1: rule__Parallele2__Group_6__2__Impl : ( ( rule__Parallele2__AAssignment_6_2 ) ) ;
    public final void rule__Parallele2__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5334:1: ( ( ( rule__Parallele2__AAssignment_6_2 ) ) )
            // InternalMyTurtleDsl.g:5335:1: ( ( rule__Parallele2__AAssignment_6_2 ) )
            {
            // InternalMyTurtleDsl.g:5335:1: ( ( rule__Parallele2__AAssignment_6_2 ) )
            // InternalMyTurtleDsl.g:5336:2: ( rule__Parallele2__AAssignment_6_2 )
            {
             before(grammarAccess.getParallele2Access().getAAssignment_6_2()); 
            // InternalMyTurtleDsl.g:5337:2: ( rule__Parallele2__AAssignment_6_2 )
            // InternalMyTurtleDsl.g:5337:3: rule__Parallele2__AAssignment_6_2
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
    // InternalMyTurtleDsl.g:5346:1: rule__Parallele2__Group_7__0 : rule__Parallele2__Group_7__0__Impl rule__Parallele2__Group_7__1 ;
    public final void rule__Parallele2__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5350:1: ( rule__Parallele2__Group_7__0__Impl rule__Parallele2__Group_7__1 )
            // InternalMyTurtleDsl.g:5351:2: rule__Parallele2__Group_7__0__Impl rule__Parallele2__Group_7__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:5358:1: rule__Parallele2__Group_7__0__Impl : ( ( rule__Parallele2__TAssignment_7_0 ) ) ;
    public final void rule__Parallele2__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5362:1: ( ( ( rule__Parallele2__TAssignment_7_0 ) ) )
            // InternalMyTurtleDsl.g:5363:1: ( ( rule__Parallele2__TAssignment_7_0 ) )
            {
            // InternalMyTurtleDsl.g:5363:1: ( ( rule__Parallele2__TAssignment_7_0 ) )
            // InternalMyTurtleDsl.g:5364:2: ( rule__Parallele2__TAssignment_7_0 )
            {
             before(grammarAccess.getParallele2Access().getTAssignment_7_0()); 
            // InternalMyTurtleDsl.g:5365:2: ( rule__Parallele2__TAssignment_7_0 )
            // InternalMyTurtleDsl.g:5365:3: rule__Parallele2__TAssignment_7_0
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
    // InternalMyTurtleDsl.g:5373:1: rule__Parallele2__Group_7__1 : rule__Parallele2__Group_7__1__Impl rule__Parallele2__Group_7__2 ;
    public final void rule__Parallele2__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5377:1: ( rule__Parallele2__Group_7__1__Impl rule__Parallele2__Group_7__2 )
            // InternalMyTurtleDsl.g:5378:2: rule__Parallele2__Group_7__1__Impl rule__Parallele2__Group_7__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalMyTurtleDsl.g:5385:1: rule__Parallele2__Group_7__1__Impl : ( '&' ) ;
    public final void rule__Parallele2__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5389:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:5390:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:5390:1: ( '&' )
            // InternalMyTurtleDsl.g:5391:2: '&'
            {
             before(grammarAccess.getParallele2Access().getAmpersandKeyword_7_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:5400:1: rule__Parallele2__Group_7__2 : rule__Parallele2__Group_7__2__Impl ;
    public final void rule__Parallele2__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5404:1: ( rule__Parallele2__Group_7__2__Impl )
            // InternalMyTurtleDsl.g:5405:2: rule__Parallele2__Group_7__2__Impl
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
    // InternalMyTurtleDsl.g:5411:1: rule__Parallele2__Group_7__2__Impl : ( ( rule__Parallele2__AAssignment_7_2 ) ) ;
    public final void rule__Parallele2__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5415:1: ( ( ( rule__Parallele2__AAssignment_7_2 ) ) )
            // InternalMyTurtleDsl.g:5416:1: ( ( rule__Parallele2__AAssignment_7_2 ) )
            {
            // InternalMyTurtleDsl.g:5416:1: ( ( rule__Parallele2__AAssignment_7_2 ) )
            // InternalMyTurtleDsl.g:5417:2: ( rule__Parallele2__AAssignment_7_2 )
            {
             before(grammarAccess.getParallele2Access().getAAssignment_7_2()); 
            // InternalMyTurtleDsl.g:5418:2: ( rule__Parallele2__AAssignment_7_2 )
            // InternalMyTurtleDsl.g:5418:3: rule__Parallele2__AAssignment_7_2
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
    // InternalMyTurtleDsl.g:5427:1: rule__Parallele2__Group_8__0 : rule__Parallele2__Group_8__0__Impl rule__Parallele2__Group_8__1 ;
    public final void rule__Parallele2__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5431:1: ( rule__Parallele2__Group_8__0__Impl rule__Parallele2__Group_8__1 )
            // InternalMyTurtleDsl.g:5432:2: rule__Parallele2__Group_8__0__Impl rule__Parallele2__Group_8__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:5439:1: rule__Parallele2__Group_8__0__Impl : ( ( rule__Parallele2__TAssignment_8_0 ) ) ;
    public final void rule__Parallele2__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5443:1: ( ( ( rule__Parallele2__TAssignment_8_0 ) ) )
            // InternalMyTurtleDsl.g:5444:1: ( ( rule__Parallele2__TAssignment_8_0 ) )
            {
            // InternalMyTurtleDsl.g:5444:1: ( ( rule__Parallele2__TAssignment_8_0 ) )
            // InternalMyTurtleDsl.g:5445:2: ( rule__Parallele2__TAssignment_8_0 )
            {
             before(grammarAccess.getParallele2Access().getTAssignment_8_0()); 
            // InternalMyTurtleDsl.g:5446:2: ( rule__Parallele2__TAssignment_8_0 )
            // InternalMyTurtleDsl.g:5446:3: rule__Parallele2__TAssignment_8_0
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
    // InternalMyTurtleDsl.g:5454:1: rule__Parallele2__Group_8__1 : rule__Parallele2__Group_8__1__Impl rule__Parallele2__Group_8__2 ;
    public final void rule__Parallele2__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5458:1: ( rule__Parallele2__Group_8__1__Impl rule__Parallele2__Group_8__2 )
            // InternalMyTurtleDsl.g:5459:2: rule__Parallele2__Group_8__1__Impl rule__Parallele2__Group_8__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyTurtleDsl.g:5466:1: rule__Parallele2__Group_8__1__Impl : ( '&' ) ;
    public final void rule__Parallele2__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5470:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:5471:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:5471:1: ( '&' )
            // InternalMyTurtleDsl.g:5472:2: '&'
            {
             before(grammarAccess.getParallele2Access().getAmpersandKeyword_8_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:5481:1: rule__Parallele2__Group_8__2 : rule__Parallele2__Group_8__2__Impl ;
    public final void rule__Parallele2__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5485:1: ( rule__Parallele2__Group_8__2__Impl )
            // InternalMyTurtleDsl.g:5486:2: rule__Parallele2__Group_8__2__Impl
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
    // InternalMyTurtleDsl.g:5492:1: rule__Parallele2__Group_8__2__Impl : ( ( rule__Parallele2__AAssignment_8_2 ) ) ;
    public final void rule__Parallele2__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5496:1: ( ( ( rule__Parallele2__AAssignment_8_2 ) ) )
            // InternalMyTurtleDsl.g:5497:1: ( ( rule__Parallele2__AAssignment_8_2 ) )
            {
            // InternalMyTurtleDsl.g:5497:1: ( ( rule__Parallele2__AAssignment_8_2 ) )
            // InternalMyTurtleDsl.g:5498:2: ( rule__Parallele2__AAssignment_8_2 )
            {
             before(grammarAccess.getParallele2Access().getAAssignment_8_2()); 
            // InternalMyTurtleDsl.g:5499:2: ( rule__Parallele2__AAssignment_8_2 )
            // InternalMyTurtleDsl.g:5499:3: rule__Parallele2__AAssignment_8_2
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
    // InternalMyTurtleDsl.g:5508:1: rule__Parallele2__Group_9__0 : rule__Parallele2__Group_9__0__Impl rule__Parallele2__Group_9__1 ;
    public final void rule__Parallele2__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5512:1: ( rule__Parallele2__Group_9__0__Impl rule__Parallele2__Group_9__1 )
            // InternalMyTurtleDsl.g:5513:2: rule__Parallele2__Group_9__0__Impl rule__Parallele2__Group_9__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:5520:1: rule__Parallele2__Group_9__0__Impl : ( ( rule__Parallele2__TAssignment_9_0 ) ) ;
    public final void rule__Parallele2__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5524:1: ( ( ( rule__Parallele2__TAssignment_9_0 ) ) )
            // InternalMyTurtleDsl.g:5525:1: ( ( rule__Parallele2__TAssignment_9_0 ) )
            {
            // InternalMyTurtleDsl.g:5525:1: ( ( rule__Parallele2__TAssignment_9_0 ) )
            // InternalMyTurtleDsl.g:5526:2: ( rule__Parallele2__TAssignment_9_0 )
            {
             before(grammarAccess.getParallele2Access().getTAssignment_9_0()); 
            // InternalMyTurtleDsl.g:5527:2: ( rule__Parallele2__TAssignment_9_0 )
            // InternalMyTurtleDsl.g:5527:3: rule__Parallele2__TAssignment_9_0
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
    // InternalMyTurtleDsl.g:5535:1: rule__Parallele2__Group_9__1 : rule__Parallele2__Group_9__1__Impl rule__Parallele2__Group_9__2 ;
    public final void rule__Parallele2__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5539:1: ( rule__Parallele2__Group_9__1__Impl rule__Parallele2__Group_9__2 )
            // InternalMyTurtleDsl.g:5540:2: rule__Parallele2__Group_9__1__Impl rule__Parallele2__Group_9__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalMyTurtleDsl.g:5547:1: rule__Parallele2__Group_9__1__Impl : ( '&' ) ;
    public final void rule__Parallele2__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5551:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:5552:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:5552:1: ( '&' )
            // InternalMyTurtleDsl.g:5553:2: '&'
            {
             before(grammarAccess.getParallele2Access().getAmpersandKeyword_9_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:5562:1: rule__Parallele2__Group_9__2 : rule__Parallele2__Group_9__2__Impl ;
    public final void rule__Parallele2__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5566:1: ( rule__Parallele2__Group_9__2__Impl )
            // InternalMyTurtleDsl.g:5567:2: rule__Parallele2__Group_9__2__Impl
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
    // InternalMyTurtleDsl.g:5573:1: rule__Parallele2__Group_9__2__Impl : ( ( rule__Parallele2__AAssignment_9_2 ) ) ;
    public final void rule__Parallele2__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5577:1: ( ( ( rule__Parallele2__AAssignment_9_2 ) ) )
            // InternalMyTurtleDsl.g:5578:1: ( ( rule__Parallele2__AAssignment_9_2 ) )
            {
            // InternalMyTurtleDsl.g:5578:1: ( ( rule__Parallele2__AAssignment_9_2 ) )
            // InternalMyTurtleDsl.g:5579:2: ( rule__Parallele2__AAssignment_9_2 )
            {
             before(grammarAccess.getParallele2Access().getAAssignment_9_2()); 
            // InternalMyTurtleDsl.g:5580:2: ( rule__Parallele2__AAssignment_9_2 )
            // InternalMyTurtleDsl.g:5580:3: rule__Parallele2__AAssignment_9_2
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
    // InternalMyTurtleDsl.g:5589:1: rule__Parallele2__Group_10__0 : rule__Parallele2__Group_10__0__Impl rule__Parallele2__Group_10__1 ;
    public final void rule__Parallele2__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5593:1: ( rule__Parallele2__Group_10__0__Impl rule__Parallele2__Group_10__1 )
            // InternalMyTurtleDsl.g:5594:2: rule__Parallele2__Group_10__0__Impl rule__Parallele2__Group_10__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:5601:1: rule__Parallele2__Group_10__0__Impl : ( ( rule__Parallele2__TAssignment_10_0 ) ) ;
    public final void rule__Parallele2__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5605:1: ( ( ( rule__Parallele2__TAssignment_10_0 ) ) )
            // InternalMyTurtleDsl.g:5606:1: ( ( rule__Parallele2__TAssignment_10_0 ) )
            {
            // InternalMyTurtleDsl.g:5606:1: ( ( rule__Parallele2__TAssignment_10_0 ) )
            // InternalMyTurtleDsl.g:5607:2: ( rule__Parallele2__TAssignment_10_0 )
            {
             before(grammarAccess.getParallele2Access().getTAssignment_10_0()); 
            // InternalMyTurtleDsl.g:5608:2: ( rule__Parallele2__TAssignment_10_0 )
            // InternalMyTurtleDsl.g:5608:3: rule__Parallele2__TAssignment_10_0
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
    // InternalMyTurtleDsl.g:5616:1: rule__Parallele2__Group_10__1 : rule__Parallele2__Group_10__1__Impl rule__Parallele2__Group_10__2 ;
    public final void rule__Parallele2__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5620:1: ( rule__Parallele2__Group_10__1__Impl rule__Parallele2__Group_10__2 )
            // InternalMyTurtleDsl.g:5621:2: rule__Parallele2__Group_10__1__Impl rule__Parallele2__Group_10__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyTurtleDsl.g:5628:1: rule__Parallele2__Group_10__1__Impl : ( '&' ) ;
    public final void rule__Parallele2__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5632:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:5633:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:5633:1: ( '&' )
            // InternalMyTurtleDsl.g:5634:2: '&'
            {
             before(grammarAccess.getParallele2Access().getAmpersandKeyword_10_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:5643:1: rule__Parallele2__Group_10__2 : rule__Parallele2__Group_10__2__Impl ;
    public final void rule__Parallele2__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5647:1: ( rule__Parallele2__Group_10__2__Impl )
            // InternalMyTurtleDsl.g:5648:2: rule__Parallele2__Group_10__2__Impl
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
    // InternalMyTurtleDsl.g:5654:1: rule__Parallele2__Group_10__2__Impl : ( ( rule__Parallele2__AAssignment_10_2 ) ) ;
    public final void rule__Parallele2__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5658:1: ( ( ( rule__Parallele2__AAssignment_10_2 ) ) )
            // InternalMyTurtleDsl.g:5659:1: ( ( rule__Parallele2__AAssignment_10_2 ) )
            {
            // InternalMyTurtleDsl.g:5659:1: ( ( rule__Parallele2__AAssignment_10_2 ) )
            // InternalMyTurtleDsl.g:5660:2: ( rule__Parallele2__AAssignment_10_2 )
            {
             before(grammarAccess.getParallele2Access().getAAssignment_10_2()); 
            // InternalMyTurtleDsl.g:5661:2: ( rule__Parallele2__AAssignment_10_2 )
            // InternalMyTurtleDsl.g:5661:3: rule__Parallele2__AAssignment_10_2
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
    // InternalMyTurtleDsl.g:5670:1: rule__Parallele2__Group_11__0 : rule__Parallele2__Group_11__0__Impl rule__Parallele2__Group_11__1 ;
    public final void rule__Parallele2__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5674:1: ( rule__Parallele2__Group_11__0__Impl rule__Parallele2__Group_11__1 )
            // InternalMyTurtleDsl.g:5675:2: rule__Parallele2__Group_11__0__Impl rule__Parallele2__Group_11__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:5682:1: rule__Parallele2__Group_11__0__Impl : ( ( rule__Parallele2__TAssignment_11_0 ) ) ;
    public final void rule__Parallele2__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5686:1: ( ( ( rule__Parallele2__TAssignment_11_0 ) ) )
            // InternalMyTurtleDsl.g:5687:1: ( ( rule__Parallele2__TAssignment_11_0 ) )
            {
            // InternalMyTurtleDsl.g:5687:1: ( ( rule__Parallele2__TAssignment_11_0 ) )
            // InternalMyTurtleDsl.g:5688:2: ( rule__Parallele2__TAssignment_11_0 )
            {
             before(grammarAccess.getParallele2Access().getTAssignment_11_0()); 
            // InternalMyTurtleDsl.g:5689:2: ( rule__Parallele2__TAssignment_11_0 )
            // InternalMyTurtleDsl.g:5689:3: rule__Parallele2__TAssignment_11_0
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
    // InternalMyTurtleDsl.g:5697:1: rule__Parallele2__Group_11__1 : rule__Parallele2__Group_11__1__Impl rule__Parallele2__Group_11__2 ;
    public final void rule__Parallele2__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5701:1: ( rule__Parallele2__Group_11__1__Impl rule__Parallele2__Group_11__2 )
            // InternalMyTurtleDsl.g:5702:2: rule__Parallele2__Group_11__1__Impl rule__Parallele2__Group_11__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyTurtleDsl.g:5709:1: rule__Parallele2__Group_11__1__Impl : ( '&' ) ;
    public final void rule__Parallele2__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5713:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:5714:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:5714:1: ( '&' )
            // InternalMyTurtleDsl.g:5715:2: '&'
            {
             before(grammarAccess.getParallele2Access().getAmpersandKeyword_11_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:5724:1: rule__Parallele2__Group_11__2 : rule__Parallele2__Group_11__2__Impl ;
    public final void rule__Parallele2__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5728:1: ( rule__Parallele2__Group_11__2__Impl )
            // InternalMyTurtleDsl.g:5729:2: rule__Parallele2__Group_11__2__Impl
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
    // InternalMyTurtleDsl.g:5735:1: rule__Parallele2__Group_11__2__Impl : ( ( rule__Parallele2__AAssignment_11_2 ) ) ;
    public final void rule__Parallele2__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5739:1: ( ( ( rule__Parallele2__AAssignment_11_2 ) ) )
            // InternalMyTurtleDsl.g:5740:1: ( ( rule__Parallele2__AAssignment_11_2 ) )
            {
            // InternalMyTurtleDsl.g:5740:1: ( ( rule__Parallele2__AAssignment_11_2 ) )
            // InternalMyTurtleDsl.g:5741:2: ( rule__Parallele2__AAssignment_11_2 )
            {
             before(grammarAccess.getParallele2Access().getAAssignment_11_2()); 
            // InternalMyTurtleDsl.g:5742:2: ( rule__Parallele2__AAssignment_11_2 )
            // InternalMyTurtleDsl.g:5742:3: rule__Parallele2__AAssignment_11_2
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
    // InternalMyTurtleDsl.g:5751:1: rule__Parallele3__Group_0__0 : rule__Parallele3__Group_0__0__Impl rule__Parallele3__Group_0__1 ;
    public final void rule__Parallele3__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5755:1: ( rule__Parallele3__Group_0__0__Impl rule__Parallele3__Group_0__1 )
            // InternalMyTurtleDsl.g:5756:2: rule__Parallele3__Group_0__0__Impl rule__Parallele3__Group_0__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:5763:1: rule__Parallele3__Group_0__0__Impl : ( ( rule__Parallele3__AAssignment_0_0 ) ) ;
    public final void rule__Parallele3__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5767:1: ( ( ( rule__Parallele3__AAssignment_0_0 ) ) )
            // InternalMyTurtleDsl.g:5768:1: ( ( rule__Parallele3__AAssignment_0_0 ) )
            {
            // InternalMyTurtleDsl.g:5768:1: ( ( rule__Parallele3__AAssignment_0_0 ) )
            // InternalMyTurtleDsl.g:5769:2: ( rule__Parallele3__AAssignment_0_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_0_0()); 
            // InternalMyTurtleDsl.g:5770:2: ( rule__Parallele3__AAssignment_0_0 )
            // InternalMyTurtleDsl.g:5770:3: rule__Parallele3__AAssignment_0_0
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
    // InternalMyTurtleDsl.g:5778:1: rule__Parallele3__Group_0__1 : rule__Parallele3__Group_0__1__Impl rule__Parallele3__Group_0__2 ;
    public final void rule__Parallele3__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5782:1: ( rule__Parallele3__Group_0__1__Impl rule__Parallele3__Group_0__2 )
            // InternalMyTurtleDsl.g:5783:2: rule__Parallele3__Group_0__1__Impl rule__Parallele3__Group_0__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyTurtleDsl.g:5790:1: rule__Parallele3__Group_0__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5794:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:5795:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:5795:1: ( '&' )
            // InternalMyTurtleDsl.g:5796:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_0_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:5805:1: rule__Parallele3__Group_0__2 : rule__Parallele3__Group_0__2__Impl rule__Parallele3__Group_0__3 ;
    public final void rule__Parallele3__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5809:1: ( rule__Parallele3__Group_0__2__Impl rule__Parallele3__Group_0__3 )
            // InternalMyTurtleDsl.g:5810:2: rule__Parallele3__Group_0__2__Impl rule__Parallele3__Group_0__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:5817:1: rule__Parallele3__Group_0__2__Impl : ( ( rule__Parallele3__BAssignment_0_2 ) ) ;
    public final void rule__Parallele3__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5821:1: ( ( ( rule__Parallele3__BAssignment_0_2 ) ) )
            // InternalMyTurtleDsl.g:5822:1: ( ( rule__Parallele3__BAssignment_0_2 ) )
            {
            // InternalMyTurtleDsl.g:5822:1: ( ( rule__Parallele3__BAssignment_0_2 ) )
            // InternalMyTurtleDsl.g:5823:2: ( rule__Parallele3__BAssignment_0_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_0_2()); 
            // InternalMyTurtleDsl.g:5824:2: ( rule__Parallele3__BAssignment_0_2 )
            // InternalMyTurtleDsl.g:5824:3: rule__Parallele3__BAssignment_0_2
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
    // InternalMyTurtleDsl.g:5832:1: rule__Parallele3__Group_0__3 : rule__Parallele3__Group_0__3__Impl rule__Parallele3__Group_0__4 ;
    public final void rule__Parallele3__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5836:1: ( rule__Parallele3__Group_0__3__Impl rule__Parallele3__Group_0__4 )
            // InternalMyTurtleDsl.g:5837:2: rule__Parallele3__Group_0__3__Impl rule__Parallele3__Group_0__4
            {
            pushFollow(FOLLOW_38);
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
    // InternalMyTurtleDsl.g:5844:1: rule__Parallele3__Group_0__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5848:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:5849:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:5849:1: ( '&' )
            // InternalMyTurtleDsl.g:5850:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_0_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:5859:1: rule__Parallele3__Group_0__4 : rule__Parallele3__Group_0__4__Impl ;
    public final void rule__Parallele3__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5863:1: ( rule__Parallele3__Group_0__4__Impl )
            // InternalMyTurtleDsl.g:5864:2: rule__Parallele3__Group_0__4__Impl
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
    // InternalMyTurtleDsl.g:5870:1: rule__Parallele3__Group_0__4__Impl : ( ( rule__Parallele3__CAssignment_0_4 ) ) ;
    public final void rule__Parallele3__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5874:1: ( ( ( rule__Parallele3__CAssignment_0_4 ) ) )
            // InternalMyTurtleDsl.g:5875:1: ( ( rule__Parallele3__CAssignment_0_4 ) )
            {
            // InternalMyTurtleDsl.g:5875:1: ( ( rule__Parallele3__CAssignment_0_4 ) )
            // InternalMyTurtleDsl.g:5876:2: ( rule__Parallele3__CAssignment_0_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_0_4()); 
            // InternalMyTurtleDsl.g:5877:2: ( rule__Parallele3__CAssignment_0_4 )
            // InternalMyTurtleDsl.g:5877:3: rule__Parallele3__CAssignment_0_4
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
    // InternalMyTurtleDsl.g:5886:1: rule__Parallele3__Group_1__0 : rule__Parallele3__Group_1__0__Impl rule__Parallele3__Group_1__1 ;
    public final void rule__Parallele3__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5890:1: ( rule__Parallele3__Group_1__0__Impl rule__Parallele3__Group_1__1 )
            // InternalMyTurtleDsl.g:5891:2: rule__Parallele3__Group_1__0__Impl rule__Parallele3__Group_1__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:5898:1: rule__Parallele3__Group_1__0__Impl : ( ( rule__Parallele3__AAssignment_1_0 ) ) ;
    public final void rule__Parallele3__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5902:1: ( ( ( rule__Parallele3__AAssignment_1_0 ) ) )
            // InternalMyTurtleDsl.g:5903:1: ( ( rule__Parallele3__AAssignment_1_0 ) )
            {
            // InternalMyTurtleDsl.g:5903:1: ( ( rule__Parallele3__AAssignment_1_0 ) )
            // InternalMyTurtleDsl.g:5904:2: ( rule__Parallele3__AAssignment_1_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_1_0()); 
            // InternalMyTurtleDsl.g:5905:2: ( rule__Parallele3__AAssignment_1_0 )
            // InternalMyTurtleDsl.g:5905:3: rule__Parallele3__AAssignment_1_0
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
    // InternalMyTurtleDsl.g:5913:1: rule__Parallele3__Group_1__1 : rule__Parallele3__Group_1__1__Impl rule__Parallele3__Group_1__2 ;
    public final void rule__Parallele3__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5917:1: ( rule__Parallele3__Group_1__1__Impl rule__Parallele3__Group_1__2 )
            // InternalMyTurtleDsl.g:5918:2: rule__Parallele3__Group_1__1__Impl rule__Parallele3__Group_1__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyTurtleDsl.g:5925:1: rule__Parallele3__Group_1__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5929:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:5930:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:5930:1: ( '&' )
            // InternalMyTurtleDsl.g:5931:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_1_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:5940:1: rule__Parallele3__Group_1__2 : rule__Parallele3__Group_1__2__Impl rule__Parallele3__Group_1__3 ;
    public final void rule__Parallele3__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5944:1: ( rule__Parallele3__Group_1__2__Impl rule__Parallele3__Group_1__3 )
            // InternalMyTurtleDsl.g:5945:2: rule__Parallele3__Group_1__2__Impl rule__Parallele3__Group_1__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:5952:1: rule__Parallele3__Group_1__2__Impl : ( ( rule__Parallele3__BAssignment_1_2 ) ) ;
    public final void rule__Parallele3__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5956:1: ( ( ( rule__Parallele3__BAssignment_1_2 ) ) )
            // InternalMyTurtleDsl.g:5957:1: ( ( rule__Parallele3__BAssignment_1_2 ) )
            {
            // InternalMyTurtleDsl.g:5957:1: ( ( rule__Parallele3__BAssignment_1_2 ) )
            // InternalMyTurtleDsl.g:5958:2: ( rule__Parallele3__BAssignment_1_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_1_2()); 
            // InternalMyTurtleDsl.g:5959:2: ( rule__Parallele3__BAssignment_1_2 )
            // InternalMyTurtleDsl.g:5959:3: rule__Parallele3__BAssignment_1_2
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
    // InternalMyTurtleDsl.g:5967:1: rule__Parallele3__Group_1__3 : rule__Parallele3__Group_1__3__Impl rule__Parallele3__Group_1__4 ;
    public final void rule__Parallele3__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5971:1: ( rule__Parallele3__Group_1__3__Impl rule__Parallele3__Group_1__4 )
            // InternalMyTurtleDsl.g:5972:2: rule__Parallele3__Group_1__3__Impl rule__Parallele3__Group_1__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyTurtleDsl.g:5979:1: rule__Parallele3__Group_1__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5983:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:5984:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:5984:1: ( '&' )
            // InternalMyTurtleDsl.g:5985:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_1_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:5994:1: rule__Parallele3__Group_1__4 : rule__Parallele3__Group_1__4__Impl ;
    public final void rule__Parallele3__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5998:1: ( rule__Parallele3__Group_1__4__Impl )
            // InternalMyTurtleDsl.g:5999:2: rule__Parallele3__Group_1__4__Impl
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
    // InternalMyTurtleDsl.g:6005:1: rule__Parallele3__Group_1__4__Impl : ( ( rule__Parallele3__CAssignment_1_4 ) ) ;
    public final void rule__Parallele3__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6009:1: ( ( ( rule__Parallele3__CAssignment_1_4 ) ) )
            // InternalMyTurtleDsl.g:6010:1: ( ( rule__Parallele3__CAssignment_1_4 ) )
            {
            // InternalMyTurtleDsl.g:6010:1: ( ( rule__Parallele3__CAssignment_1_4 ) )
            // InternalMyTurtleDsl.g:6011:2: ( rule__Parallele3__CAssignment_1_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_1_4()); 
            // InternalMyTurtleDsl.g:6012:2: ( rule__Parallele3__CAssignment_1_4 )
            // InternalMyTurtleDsl.g:6012:3: rule__Parallele3__CAssignment_1_4
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
    // InternalMyTurtleDsl.g:6021:1: rule__Parallele3__Group_2__0 : rule__Parallele3__Group_2__0__Impl rule__Parallele3__Group_2__1 ;
    public final void rule__Parallele3__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6025:1: ( rule__Parallele3__Group_2__0__Impl rule__Parallele3__Group_2__1 )
            // InternalMyTurtleDsl.g:6026:2: rule__Parallele3__Group_2__0__Impl rule__Parallele3__Group_2__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:6033:1: rule__Parallele3__Group_2__0__Impl : ( ( rule__Parallele3__AAssignment_2_0 ) ) ;
    public final void rule__Parallele3__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6037:1: ( ( ( rule__Parallele3__AAssignment_2_0 ) ) )
            // InternalMyTurtleDsl.g:6038:1: ( ( rule__Parallele3__AAssignment_2_0 ) )
            {
            // InternalMyTurtleDsl.g:6038:1: ( ( rule__Parallele3__AAssignment_2_0 ) )
            // InternalMyTurtleDsl.g:6039:2: ( rule__Parallele3__AAssignment_2_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_2_0()); 
            // InternalMyTurtleDsl.g:6040:2: ( rule__Parallele3__AAssignment_2_0 )
            // InternalMyTurtleDsl.g:6040:3: rule__Parallele3__AAssignment_2_0
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
    // InternalMyTurtleDsl.g:6048:1: rule__Parallele3__Group_2__1 : rule__Parallele3__Group_2__1__Impl rule__Parallele3__Group_2__2 ;
    public final void rule__Parallele3__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6052:1: ( rule__Parallele3__Group_2__1__Impl rule__Parallele3__Group_2__2 )
            // InternalMyTurtleDsl.g:6053:2: rule__Parallele3__Group_2__1__Impl rule__Parallele3__Group_2__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalMyTurtleDsl.g:6060:1: rule__Parallele3__Group_2__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6064:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:6065:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:6065:1: ( '&' )
            // InternalMyTurtleDsl.g:6066:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_2_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:6075:1: rule__Parallele3__Group_2__2 : rule__Parallele3__Group_2__2__Impl rule__Parallele3__Group_2__3 ;
    public final void rule__Parallele3__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6079:1: ( rule__Parallele3__Group_2__2__Impl rule__Parallele3__Group_2__3 )
            // InternalMyTurtleDsl.g:6080:2: rule__Parallele3__Group_2__2__Impl rule__Parallele3__Group_2__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:6087:1: rule__Parallele3__Group_2__2__Impl : ( ( rule__Parallele3__BAssignment_2_2 ) ) ;
    public final void rule__Parallele3__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6091:1: ( ( ( rule__Parallele3__BAssignment_2_2 ) ) )
            // InternalMyTurtleDsl.g:6092:1: ( ( rule__Parallele3__BAssignment_2_2 ) )
            {
            // InternalMyTurtleDsl.g:6092:1: ( ( rule__Parallele3__BAssignment_2_2 ) )
            // InternalMyTurtleDsl.g:6093:2: ( rule__Parallele3__BAssignment_2_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_2_2()); 
            // InternalMyTurtleDsl.g:6094:2: ( rule__Parallele3__BAssignment_2_2 )
            // InternalMyTurtleDsl.g:6094:3: rule__Parallele3__BAssignment_2_2
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
    // InternalMyTurtleDsl.g:6102:1: rule__Parallele3__Group_2__3 : rule__Parallele3__Group_2__3__Impl rule__Parallele3__Group_2__4 ;
    public final void rule__Parallele3__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6106:1: ( rule__Parallele3__Group_2__3__Impl rule__Parallele3__Group_2__4 )
            // InternalMyTurtleDsl.g:6107:2: rule__Parallele3__Group_2__3__Impl rule__Parallele3__Group_2__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyTurtleDsl.g:6114:1: rule__Parallele3__Group_2__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6118:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:6119:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:6119:1: ( '&' )
            // InternalMyTurtleDsl.g:6120:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_2_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:6129:1: rule__Parallele3__Group_2__4 : rule__Parallele3__Group_2__4__Impl ;
    public final void rule__Parallele3__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6133:1: ( rule__Parallele3__Group_2__4__Impl )
            // InternalMyTurtleDsl.g:6134:2: rule__Parallele3__Group_2__4__Impl
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
    // InternalMyTurtleDsl.g:6140:1: rule__Parallele3__Group_2__4__Impl : ( ( rule__Parallele3__CAssignment_2_4 ) ) ;
    public final void rule__Parallele3__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6144:1: ( ( ( rule__Parallele3__CAssignment_2_4 ) ) )
            // InternalMyTurtleDsl.g:6145:1: ( ( rule__Parallele3__CAssignment_2_4 ) )
            {
            // InternalMyTurtleDsl.g:6145:1: ( ( rule__Parallele3__CAssignment_2_4 ) )
            // InternalMyTurtleDsl.g:6146:2: ( rule__Parallele3__CAssignment_2_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_2_4()); 
            // InternalMyTurtleDsl.g:6147:2: ( rule__Parallele3__CAssignment_2_4 )
            // InternalMyTurtleDsl.g:6147:3: rule__Parallele3__CAssignment_2_4
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
    // InternalMyTurtleDsl.g:6156:1: rule__Parallele3__Group_3__0 : rule__Parallele3__Group_3__0__Impl rule__Parallele3__Group_3__1 ;
    public final void rule__Parallele3__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6160:1: ( rule__Parallele3__Group_3__0__Impl rule__Parallele3__Group_3__1 )
            // InternalMyTurtleDsl.g:6161:2: rule__Parallele3__Group_3__0__Impl rule__Parallele3__Group_3__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:6168:1: rule__Parallele3__Group_3__0__Impl : ( ( rule__Parallele3__AAssignment_3_0 ) ) ;
    public final void rule__Parallele3__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6172:1: ( ( ( rule__Parallele3__AAssignment_3_0 ) ) )
            // InternalMyTurtleDsl.g:6173:1: ( ( rule__Parallele3__AAssignment_3_0 ) )
            {
            // InternalMyTurtleDsl.g:6173:1: ( ( rule__Parallele3__AAssignment_3_0 ) )
            // InternalMyTurtleDsl.g:6174:2: ( rule__Parallele3__AAssignment_3_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_3_0()); 
            // InternalMyTurtleDsl.g:6175:2: ( rule__Parallele3__AAssignment_3_0 )
            // InternalMyTurtleDsl.g:6175:3: rule__Parallele3__AAssignment_3_0
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
    // InternalMyTurtleDsl.g:6183:1: rule__Parallele3__Group_3__1 : rule__Parallele3__Group_3__1__Impl rule__Parallele3__Group_3__2 ;
    public final void rule__Parallele3__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6187:1: ( rule__Parallele3__Group_3__1__Impl rule__Parallele3__Group_3__2 )
            // InternalMyTurtleDsl.g:6188:2: rule__Parallele3__Group_3__1__Impl rule__Parallele3__Group_3__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalMyTurtleDsl.g:6195:1: rule__Parallele3__Group_3__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6199:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:6200:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:6200:1: ( '&' )
            // InternalMyTurtleDsl.g:6201:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_3_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:6210:1: rule__Parallele3__Group_3__2 : rule__Parallele3__Group_3__2__Impl rule__Parallele3__Group_3__3 ;
    public final void rule__Parallele3__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6214:1: ( rule__Parallele3__Group_3__2__Impl rule__Parallele3__Group_3__3 )
            // InternalMyTurtleDsl.g:6215:2: rule__Parallele3__Group_3__2__Impl rule__Parallele3__Group_3__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:6222:1: rule__Parallele3__Group_3__2__Impl : ( ( rule__Parallele3__BAssignment_3_2 ) ) ;
    public final void rule__Parallele3__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6226:1: ( ( ( rule__Parallele3__BAssignment_3_2 ) ) )
            // InternalMyTurtleDsl.g:6227:1: ( ( rule__Parallele3__BAssignment_3_2 ) )
            {
            // InternalMyTurtleDsl.g:6227:1: ( ( rule__Parallele3__BAssignment_3_2 ) )
            // InternalMyTurtleDsl.g:6228:2: ( rule__Parallele3__BAssignment_3_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_3_2()); 
            // InternalMyTurtleDsl.g:6229:2: ( rule__Parallele3__BAssignment_3_2 )
            // InternalMyTurtleDsl.g:6229:3: rule__Parallele3__BAssignment_3_2
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
    // InternalMyTurtleDsl.g:6237:1: rule__Parallele3__Group_3__3 : rule__Parallele3__Group_3__3__Impl rule__Parallele3__Group_3__4 ;
    public final void rule__Parallele3__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6241:1: ( rule__Parallele3__Group_3__3__Impl rule__Parallele3__Group_3__4 )
            // InternalMyTurtleDsl.g:6242:2: rule__Parallele3__Group_3__3__Impl rule__Parallele3__Group_3__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyTurtleDsl.g:6249:1: rule__Parallele3__Group_3__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6253:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:6254:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:6254:1: ( '&' )
            // InternalMyTurtleDsl.g:6255:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_3_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:6264:1: rule__Parallele3__Group_3__4 : rule__Parallele3__Group_3__4__Impl ;
    public final void rule__Parallele3__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6268:1: ( rule__Parallele3__Group_3__4__Impl )
            // InternalMyTurtleDsl.g:6269:2: rule__Parallele3__Group_3__4__Impl
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
    // InternalMyTurtleDsl.g:6275:1: rule__Parallele3__Group_3__4__Impl : ( ( rule__Parallele3__CAssignment_3_4 ) ) ;
    public final void rule__Parallele3__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6279:1: ( ( ( rule__Parallele3__CAssignment_3_4 ) ) )
            // InternalMyTurtleDsl.g:6280:1: ( ( rule__Parallele3__CAssignment_3_4 ) )
            {
            // InternalMyTurtleDsl.g:6280:1: ( ( rule__Parallele3__CAssignment_3_4 ) )
            // InternalMyTurtleDsl.g:6281:2: ( rule__Parallele3__CAssignment_3_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_3_4()); 
            // InternalMyTurtleDsl.g:6282:2: ( rule__Parallele3__CAssignment_3_4 )
            // InternalMyTurtleDsl.g:6282:3: rule__Parallele3__CAssignment_3_4
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
    // InternalMyTurtleDsl.g:6291:1: rule__Parallele3__Group_4__0 : rule__Parallele3__Group_4__0__Impl rule__Parallele3__Group_4__1 ;
    public final void rule__Parallele3__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6295:1: ( rule__Parallele3__Group_4__0__Impl rule__Parallele3__Group_4__1 )
            // InternalMyTurtleDsl.g:6296:2: rule__Parallele3__Group_4__0__Impl rule__Parallele3__Group_4__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:6303:1: rule__Parallele3__Group_4__0__Impl : ( ( rule__Parallele3__AAssignment_4_0 ) ) ;
    public final void rule__Parallele3__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6307:1: ( ( ( rule__Parallele3__AAssignment_4_0 ) ) )
            // InternalMyTurtleDsl.g:6308:1: ( ( rule__Parallele3__AAssignment_4_0 ) )
            {
            // InternalMyTurtleDsl.g:6308:1: ( ( rule__Parallele3__AAssignment_4_0 ) )
            // InternalMyTurtleDsl.g:6309:2: ( rule__Parallele3__AAssignment_4_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_4_0()); 
            // InternalMyTurtleDsl.g:6310:2: ( rule__Parallele3__AAssignment_4_0 )
            // InternalMyTurtleDsl.g:6310:3: rule__Parallele3__AAssignment_4_0
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
    // InternalMyTurtleDsl.g:6318:1: rule__Parallele3__Group_4__1 : rule__Parallele3__Group_4__1__Impl rule__Parallele3__Group_4__2 ;
    public final void rule__Parallele3__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6322:1: ( rule__Parallele3__Group_4__1__Impl rule__Parallele3__Group_4__2 )
            // InternalMyTurtleDsl.g:6323:2: rule__Parallele3__Group_4__1__Impl rule__Parallele3__Group_4__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyTurtleDsl.g:6330:1: rule__Parallele3__Group_4__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6334:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:6335:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:6335:1: ( '&' )
            // InternalMyTurtleDsl.g:6336:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_4_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:6345:1: rule__Parallele3__Group_4__2 : rule__Parallele3__Group_4__2__Impl rule__Parallele3__Group_4__3 ;
    public final void rule__Parallele3__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6349:1: ( rule__Parallele3__Group_4__2__Impl rule__Parallele3__Group_4__3 )
            // InternalMyTurtleDsl.g:6350:2: rule__Parallele3__Group_4__2__Impl rule__Parallele3__Group_4__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:6357:1: rule__Parallele3__Group_4__2__Impl : ( ( rule__Parallele3__BAssignment_4_2 ) ) ;
    public final void rule__Parallele3__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6361:1: ( ( ( rule__Parallele3__BAssignment_4_2 ) ) )
            // InternalMyTurtleDsl.g:6362:1: ( ( rule__Parallele3__BAssignment_4_2 ) )
            {
            // InternalMyTurtleDsl.g:6362:1: ( ( rule__Parallele3__BAssignment_4_2 ) )
            // InternalMyTurtleDsl.g:6363:2: ( rule__Parallele3__BAssignment_4_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_4_2()); 
            // InternalMyTurtleDsl.g:6364:2: ( rule__Parallele3__BAssignment_4_2 )
            // InternalMyTurtleDsl.g:6364:3: rule__Parallele3__BAssignment_4_2
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
    // InternalMyTurtleDsl.g:6372:1: rule__Parallele3__Group_4__3 : rule__Parallele3__Group_4__3__Impl rule__Parallele3__Group_4__4 ;
    public final void rule__Parallele3__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6376:1: ( rule__Parallele3__Group_4__3__Impl rule__Parallele3__Group_4__4 )
            // InternalMyTurtleDsl.g:6377:2: rule__Parallele3__Group_4__3__Impl rule__Parallele3__Group_4__4
            {
            pushFollow(FOLLOW_38);
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
    // InternalMyTurtleDsl.g:6384:1: rule__Parallele3__Group_4__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6388:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:6389:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:6389:1: ( '&' )
            // InternalMyTurtleDsl.g:6390:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_4_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:6399:1: rule__Parallele3__Group_4__4 : rule__Parallele3__Group_4__4__Impl ;
    public final void rule__Parallele3__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6403:1: ( rule__Parallele3__Group_4__4__Impl )
            // InternalMyTurtleDsl.g:6404:2: rule__Parallele3__Group_4__4__Impl
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
    // InternalMyTurtleDsl.g:6410:1: rule__Parallele3__Group_4__4__Impl : ( ( rule__Parallele3__CAssignment_4_4 ) ) ;
    public final void rule__Parallele3__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6414:1: ( ( ( rule__Parallele3__CAssignment_4_4 ) ) )
            // InternalMyTurtleDsl.g:6415:1: ( ( rule__Parallele3__CAssignment_4_4 ) )
            {
            // InternalMyTurtleDsl.g:6415:1: ( ( rule__Parallele3__CAssignment_4_4 ) )
            // InternalMyTurtleDsl.g:6416:2: ( rule__Parallele3__CAssignment_4_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_4_4()); 
            // InternalMyTurtleDsl.g:6417:2: ( rule__Parallele3__CAssignment_4_4 )
            // InternalMyTurtleDsl.g:6417:3: rule__Parallele3__CAssignment_4_4
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
    // InternalMyTurtleDsl.g:6426:1: rule__Parallele3__Group_5__0 : rule__Parallele3__Group_5__0__Impl rule__Parallele3__Group_5__1 ;
    public final void rule__Parallele3__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6430:1: ( rule__Parallele3__Group_5__0__Impl rule__Parallele3__Group_5__1 )
            // InternalMyTurtleDsl.g:6431:2: rule__Parallele3__Group_5__0__Impl rule__Parallele3__Group_5__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:6438:1: rule__Parallele3__Group_5__0__Impl : ( ( rule__Parallele3__AAssignment_5_0 ) ) ;
    public final void rule__Parallele3__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6442:1: ( ( ( rule__Parallele3__AAssignment_5_0 ) ) )
            // InternalMyTurtleDsl.g:6443:1: ( ( rule__Parallele3__AAssignment_5_0 ) )
            {
            // InternalMyTurtleDsl.g:6443:1: ( ( rule__Parallele3__AAssignment_5_0 ) )
            // InternalMyTurtleDsl.g:6444:2: ( rule__Parallele3__AAssignment_5_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_5_0()); 
            // InternalMyTurtleDsl.g:6445:2: ( rule__Parallele3__AAssignment_5_0 )
            // InternalMyTurtleDsl.g:6445:3: rule__Parallele3__AAssignment_5_0
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
    // InternalMyTurtleDsl.g:6453:1: rule__Parallele3__Group_5__1 : rule__Parallele3__Group_5__1__Impl rule__Parallele3__Group_5__2 ;
    public final void rule__Parallele3__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6457:1: ( rule__Parallele3__Group_5__1__Impl rule__Parallele3__Group_5__2 )
            // InternalMyTurtleDsl.g:6458:2: rule__Parallele3__Group_5__1__Impl rule__Parallele3__Group_5__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyTurtleDsl.g:6465:1: rule__Parallele3__Group_5__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6469:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:6470:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:6470:1: ( '&' )
            // InternalMyTurtleDsl.g:6471:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_5_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:6480:1: rule__Parallele3__Group_5__2 : rule__Parallele3__Group_5__2__Impl rule__Parallele3__Group_5__3 ;
    public final void rule__Parallele3__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6484:1: ( rule__Parallele3__Group_5__2__Impl rule__Parallele3__Group_5__3 )
            // InternalMyTurtleDsl.g:6485:2: rule__Parallele3__Group_5__2__Impl rule__Parallele3__Group_5__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:6492:1: rule__Parallele3__Group_5__2__Impl : ( ( rule__Parallele3__BAssignment_5_2 ) ) ;
    public final void rule__Parallele3__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6496:1: ( ( ( rule__Parallele3__BAssignment_5_2 ) ) )
            // InternalMyTurtleDsl.g:6497:1: ( ( rule__Parallele3__BAssignment_5_2 ) )
            {
            // InternalMyTurtleDsl.g:6497:1: ( ( rule__Parallele3__BAssignment_5_2 ) )
            // InternalMyTurtleDsl.g:6498:2: ( rule__Parallele3__BAssignment_5_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_5_2()); 
            // InternalMyTurtleDsl.g:6499:2: ( rule__Parallele3__BAssignment_5_2 )
            // InternalMyTurtleDsl.g:6499:3: rule__Parallele3__BAssignment_5_2
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
    // InternalMyTurtleDsl.g:6507:1: rule__Parallele3__Group_5__3 : rule__Parallele3__Group_5__3__Impl rule__Parallele3__Group_5__4 ;
    public final void rule__Parallele3__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6511:1: ( rule__Parallele3__Group_5__3__Impl rule__Parallele3__Group_5__4 )
            // InternalMyTurtleDsl.g:6512:2: rule__Parallele3__Group_5__3__Impl rule__Parallele3__Group_5__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyTurtleDsl.g:6519:1: rule__Parallele3__Group_5__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6523:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:6524:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:6524:1: ( '&' )
            // InternalMyTurtleDsl.g:6525:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_5_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:6534:1: rule__Parallele3__Group_5__4 : rule__Parallele3__Group_5__4__Impl ;
    public final void rule__Parallele3__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6538:1: ( rule__Parallele3__Group_5__4__Impl )
            // InternalMyTurtleDsl.g:6539:2: rule__Parallele3__Group_5__4__Impl
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
    // InternalMyTurtleDsl.g:6545:1: rule__Parallele3__Group_5__4__Impl : ( ( rule__Parallele3__CAssignment_5_4 ) ) ;
    public final void rule__Parallele3__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6549:1: ( ( ( rule__Parallele3__CAssignment_5_4 ) ) )
            // InternalMyTurtleDsl.g:6550:1: ( ( rule__Parallele3__CAssignment_5_4 ) )
            {
            // InternalMyTurtleDsl.g:6550:1: ( ( rule__Parallele3__CAssignment_5_4 ) )
            // InternalMyTurtleDsl.g:6551:2: ( rule__Parallele3__CAssignment_5_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_5_4()); 
            // InternalMyTurtleDsl.g:6552:2: ( rule__Parallele3__CAssignment_5_4 )
            // InternalMyTurtleDsl.g:6552:3: rule__Parallele3__CAssignment_5_4
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
    // InternalMyTurtleDsl.g:6561:1: rule__Parallele3__Group_6__0 : rule__Parallele3__Group_6__0__Impl rule__Parallele3__Group_6__1 ;
    public final void rule__Parallele3__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6565:1: ( rule__Parallele3__Group_6__0__Impl rule__Parallele3__Group_6__1 )
            // InternalMyTurtleDsl.g:6566:2: rule__Parallele3__Group_6__0__Impl rule__Parallele3__Group_6__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:6573:1: rule__Parallele3__Group_6__0__Impl : ( ( rule__Parallele3__AAssignment_6_0 ) ) ;
    public final void rule__Parallele3__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6577:1: ( ( ( rule__Parallele3__AAssignment_6_0 ) ) )
            // InternalMyTurtleDsl.g:6578:1: ( ( rule__Parallele3__AAssignment_6_0 ) )
            {
            // InternalMyTurtleDsl.g:6578:1: ( ( rule__Parallele3__AAssignment_6_0 ) )
            // InternalMyTurtleDsl.g:6579:2: ( rule__Parallele3__AAssignment_6_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_6_0()); 
            // InternalMyTurtleDsl.g:6580:2: ( rule__Parallele3__AAssignment_6_0 )
            // InternalMyTurtleDsl.g:6580:3: rule__Parallele3__AAssignment_6_0
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
    // InternalMyTurtleDsl.g:6588:1: rule__Parallele3__Group_6__1 : rule__Parallele3__Group_6__1__Impl rule__Parallele3__Group_6__2 ;
    public final void rule__Parallele3__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6592:1: ( rule__Parallele3__Group_6__1__Impl rule__Parallele3__Group_6__2 )
            // InternalMyTurtleDsl.g:6593:2: rule__Parallele3__Group_6__1__Impl rule__Parallele3__Group_6__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalMyTurtleDsl.g:6600:1: rule__Parallele3__Group_6__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6604:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:6605:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:6605:1: ( '&' )
            // InternalMyTurtleDsl.g:6606:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_6_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:6615:1: rule__Parallele3__Group_6__2 : rule__Parallele3__Group_6__2__Impl rule__Parallele3__Group_6__3 ;
    public final void rule__Parallele3__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6619:1: ( rule__Parallele3__Group_6__2__Impl rule__Parallele3__Group_6__3 )
            // InternalMyTurtleDsl.g:6620:2: rule__Parallele3__Group_6__2__Impl rule__Parallele3__Group_6__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:6627:1: rule__Parallele3__Group_6__2__Impl : ( ( rule__Parallele3__BAssignment_6_2 ) ) ;
    public final void rule__Parallele3__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6631:1: ( ( ( rule__Parallele3__BAssignment_6_2 ) ) )
            // InternalMyTurtleDsl.g:6632:1: ( ( rule__Parallele3__BAssignment_6_2 ) )
            {
            // InternalMyTurtleDsl.g:6632:1: ( ( rule__Parallele3__BAssignment_6_2 ) )
            // InternalMyTurtleDsl.g:6633:2: ( rule__Parallele3__BAssignment_6_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_6_2()); 
            // InternalMyTurtleDsl.g:6634:2: ( rule__Parallele3__BAssignment_6_2 )
            // InternalMyTurtleDsl.g:6634:3: rule__Parallele3__BAssignment_6_2
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
    // InternalMyTurtleDsl.g:6642:1: rule__Parallele3__Group_6__3 : rule__Parallele3__Group_6__3__Impl rule__Parallele3__Group_6__4 ;
    public final void rule__Parallele3__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6646:1: ( rule__Parallele3__Group_6__3__Impl rule__Parallele3__Group_6__4 )
            // InternalMyTurtleDsl.g:6647:2: rule__Parallele3__Group_6__3__Impl rule__Parallele3__Group_6__4
            {
            pushFollow(FOLLOW_38);
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
    // InternalMyTurtleDsl.g:6654:1: rule__Parallele3__Group_6__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6658:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:6659:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:6659:1: ( '&' )
            // InternalMyTurtleDsl.g:6660:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_6_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:6669:1: rule__Parallele3__Group_6__4 : rule__Parallele3__Group_6__4__Impl ;
    public final void rule__Parallele3__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6673:1: ( rule__Parallele3__Group_6__4__Impl )
            // InternalMyTurtleDsl.g:6674:2: rule__Parallele3__Group_6__4__Impl
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
    // InternalMyTurtleDsl.g:6680:1: rule__Parallele3__Group_6__4__Impl : ( ( rule__Parallele3__CAssignment_6_4 ) ) ;
    public final void rule__Parallele3__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6684:1: ( ( ( rule__Parallele3__CAssignment_6_4 ) ) )
            // InternalMyTurtleDsl.g:6685:1: ( ( rule__Parallele3__CAssignment_6_4 ) )
            {
            // InternalMyTurtleDsl.g:6685:1: ( ( rule__Parallele3__CAssignment_6_4 ) )
            // InternalMyTurtleDsl.g:6686:2: ( rule__Parallele3__CAssignment_6_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_6_4()); 
            // InternalMyTurtleDsl.g:6687:2: ( rule__Parallele3__CAssignment_6_4 )
            // InternalMyTurtleDsl.g:6687:3: rule__Parallele3__CAssignment_6_4
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
    // InternalMyTurtleDsl.g:6696:1: rule__Parallele3__Group_7__0 : rule__Parallele3__Group_7__0__Impl rule__Parallele3__Group_7__1 ;
    public final void rule__Parallele3__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6700:1: ( rule__Parallele3__Group_7__0__Impl rule__Parallele3__Group_7__1 )
            // InternalMyTurtleDsl.g:6701:2: rule__Parallele3__Group_7__0__Impl rule__Parallele3__Group_7__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:6708:1: rule__Parallele3__Group_7__0__Impl : ( ( rule__Parallele3__AAssignment_7_0 ) ) ;
    public final void rule__Parallele3__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6712:1: ( ( ( rule__Parallele3__AAssignment_7_0 ) ) )
            // InternalMyTurtleDsl.g:6713:1: ( ( rule__Parallele3__AAssignment_7_0 ) )
            {
            // InternalMyTurtleDsl.g:6713:1: ( ( rule__Parallele3__AAssignment_7_0 ) )
            // InternalMyTurtleDsl.g:6714:2: ( rule__Parallele3__AAssignment_7_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_7_0()); 
            // InternalMyTurtleDsl.g:6715:2: ( rule__Parallele3__AAssignment_7_0 )
            // InternalMyTurtleDsl.g:6715:3: rule__Parallele3__AAssignment_7_0
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
    // InternalMyTurtleDsl.g:6723:1: rule__Parallele3__Group_7__1 : rule__Parallele3__Group_7__1__Impl rule__Parallele3__Group_7__2 ;
    public final void rule__Parallele3__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6727:1: ( rule__Parallele3__Group_7__1__Impl rule__Parallele3__Group_7__2 )
            // InternalMyTurtleDsl.g:6728:2: rule__Parallele3__Group_7__1__Impl rule__Parallele3__Group_7__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalMyTurtleDsl.g:6735:1: rule__Parallele3__Group_7__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6739:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:6740:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:6740:1: ( '&' )
            // InternalMyTurtleDsl.g:6741:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_7_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:6750:1: rule__Parallele3__Group_7__2 : rule__Parallele3__Group_7__2__Impl rule__Parallele3__Group_7__3 ;
    public final void rule__Parallele3__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6754:1: ( rule__Parallele3__Group_7__2__Impl rule__Parallele3__Group_7__3 )
            // InternalMyTurtleDsl.g:6755:2: rule__Parallele3__Group_7__2__Impl rule__Parallele3__Group_7__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:6762:1: rule__Parallele3__Group_7__2__Impl : ( ( rule__Parallele3__BAssignment_7_2 ) ) ;
    public final void rule__Parallele3__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6766:1: ( ( ( rule__Parallele3__BAssignment_7_2 ) ) )
            // InternalMyTurtleDsl.g:6767:1: ( ( rule__Parallele3__BAssignment_7_2 ) )
            {
            // InternalMyTurtleDsl.g:6767:1: ( ( rule__Parallele3__BAssignment_7_2 ) )
            // InternalMyTurtleDsl.g:6768:2: ( rule__Parallele3__BAssignment_7_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_7_2()); 
            // InternalMyTurtleDsl.g:6769:2: ( rule__Parallele3__BAssignment_7_2 )
            // InternalMyTurtleDsl.g:6769:3: rule__Parallele3__BAssignment_7_2
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
    // InternalMyTurtleDsl.g:6777:1: rule__Parallele3__Group_7__3 : rule__Parallele3__Group_7__3__Impl rule__Parallele3__Group_7__4 ;
    public final void rule__Parallele3__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6781:1: ( rule__Parallele3__Group_7__3__Impl rule__Parallele3__Group_7__4 )
            // InternalMyTurtleDsl.g:6782:2: rule__Parallele3__Group_7__3__Impl rule__Parallele3__Group_7__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyTurtleDsl.g:6789:1: rule__Parallele3__Group_7__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6793:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:6794:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:6794:1: ( '&' )
            // InternalMyTurtleDsl.g:6795:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_7_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:6804:1: rule__Parallele3__Group_7__4 : rule__Parallele3__Group_7__4__Impl ;
    public final void rule__Parallele3__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6808:1: ( rule__Parallele3__Group_7__4__Impl )
            // InternalMyTurtleDsl.g:6809:2: rule__Parallele3__Group_7__4__Impl
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
    // InternalMyTurtleDsl.g:6815:1: rule__Parallele3__Group_7__4__Impl : ( ( rule__Parallele3__CAssignment_7_4 ) ) ;
    public final void rule__Parallele3__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6819:1: ( ( ( rule__Parallele3__CAssignment_7_4 ) ) )
            // InternalMyTurtleDsl.g:6820:1: ( ( rule__Parallele3__CAssignment_7_4 ) )
            {
            // InternalMyTurtleDsl.g:6820:1: ( ( rule__Parallele3__CAssignment_7_4 ) )
            // InternalMyTurtleDsl.g:6821:2: ( rule__Parallele3__CAssignment_7_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_7_4()); 
            // InternalMyTurtleDsl.g:6822:2: ( rule__Parallele3__CAssignment_7_4 )
            // InternalMyTurtleDsl.g:6822:3: rule__Parallele3__CAssignment_7_4
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
    // InternalMyTurtleDsl.g:6831:1: rule__Parallele3__Group_8__0 : rule__Parallele3__Group_8__0__Impl rule__Parallele3__Group_8__1 ;
    public final void rule__Parallele3__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6835:1: ( rule__Parallele3__Group_8__0__Impl rule__Parallele3__Group_8__1 )
            // InternalMyTurtleDsl.g:6836:2: rule__Parallele3__Group_8__0__Impl rule__Parallele3__Group_8__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:6843:1: rule__Parallele3__Group_8__0__Impl : ( ( rule__Parallele3__AAssignment_8_0 ) ) ;
    public final void rule__Parallele3__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6847:1: ( ( ( rule__Parallele3__AAssignment_8_0 ) ) )
            // InternalMyTurtleDsl.g:6848:1: ( ( rule__Parallele3__AAssignment_8_0 ) )
            {
            // InternalMyTurtleDsl.g:6848:1: ( ( rule__Parallele3__AAssignment_8_0 ) )
            // InternalMyTurtleDsl.g:6849:2: ( rule__Parallele3__AAssignment_8_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_8_0()); 
            // InternalMyTurtleDsl.g:6850:2: ( rule__Parallele3__AAssignment_8_0 )
            // InternalMyTurtleDsl.g:6850:3: rule__Parallele3__AAssignment_8_0
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
    // InternalMyTurtleDsl.g:6858:1: rule__Parallele3__Group_8__1 : rule__Parallele3__Group_8__1__Impl rule__Parallele3__Group_8__2 ;
    public final void rule__Parallele3__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6862:1: ( rule__Parallele3__Group_8__1__Impl rule__Parallele3__Group_8__2 )
            // InternalMyTurtleDsl.g:6863:2: rule__Parallele3__Group_8__1__Impl rule__Parallele3__Group_8__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalMyTurtleDsl.g:6870:1: rule__Parallele3__Group_8__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6874:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:6875:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:6875:1: ( '&' )
            // InternalMyTurtleDsl.g:6876:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_8_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:6885:1: rule__Parallele3__Group_8__2 : rule__Parallele3__Group_8__2__Impl rule__Parallele3__Group_8__3 ;
    public final void rule__Parallele3__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6889:1: ( rule__Parallele3__Group_8__2__Impl rule__Parallele3__Group_8__3 )
            // InternalMyTurtleDsl.g:6890:2: rule__Parallele3__Group_8__2__Impl rule__Parallele3__Group_8__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:6897:1: rule__Parallele3__Group_8__2__Impl : ( ( rule__Parallele3__BAssignment_8_2 ) ) ;
    public final void rule__Parallele3__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6901:1: ( ( ( rule__Parallele3__BAssignment_8_2 ) ) )
            // InternalMyTurtleDsl.g:6902:1: ( ( rule__Parallele3__BAssignment_8_2 ) )
            {
            // InternalMyTurtleDsl.g:6902:1: ( ( rule__Parallele3__BAssignment_8_2 ) )
            // InternalMyTurtleDsl.g:6903:2: ( rule__Parallele3__BAssignment_8_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_8_2()); 
            // InternalMyTurtleDsl.g:6904:2: ( rule__Parallele3__BAssignment_8_2 )
            // InternalMyTurtleDsl.g:6904:3: rule__Parallele3__BAssignment_8_2
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
    // InternalMyTurtleDsl.g:6912:1: rule__Parallele3__Group_8__3 : rule__Parallele3__Group_8__3__Impl rule__Parallele3__Group_8__4 ;
    public final void rule__Parallele3__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6916:1: ( rule__Parallele3__Group_8__3__Impl rule__Parallele3__Group_8__4 )
            // InternalMyTurtleDsl.g:6917:2: rule__Parallele3__Group_8__3__Impl rule__Parallele3__Group_8__4
            {
            pushFollow(FOLLOW_36);
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
    // InternalMyTurtleDsl.g:6924:1: rule__Parallele3__Group_8__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6928:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:6929:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:6929:1: ( '&' )
            // InternalMyTurtleDsl.g:6930:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_8_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:6939:1: rule__Parallele3__Group_8__4 : rule__Parallele3__Group_8__4__Impl ;
    public final void rule__Parallele3__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6943:1: ( rule__Parallele3__Group_8__4__Impl )
            // InternalMyTurtleDsl.g:6944:2: rule__Parallele3__Group_8__4__Impl
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
    // InternalMyTurtleDsl.g:6950:1: rule__Parallele3__Group_8__4__Impl : ( ( rule__Parallele3__CAssignment_8_4 ) ) ;
    public final void rule__Parallele3__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6954:1: ( ( ( rule__Parallele3__CAssignment_8_4 ) ) )
            // InternalMyTurtleDsl.g:6955:1: ( ( rule__Parallele3__CAssignment_8_4 ) )
            {
            // InternalMyTurtleDsl.g:6955:1: ( ( rule__Parallele3__CAssignment_8_4 ) )
            // InternalMyTurtleDsl.g:6956:2: ( rule__Parallele3__CAssignment_8_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_8_4()); 
            // InternalMyTurtleDsl.g:6957:2: ( rule__Parallele3__CAssignment_8_4 )
            // InternalMyTurtleDsl.g:6957:3: rule__Parallele3__CAssignment_8_4
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
    // InternalMyTurtleDsl.g:6966:1: rule__Parallele3__Group_9__0 : rule__Parallele3__Group_9__0__Impl rule__Parallele3__Group_9__1 ;
    public final void rule__Parallele3__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6970:1: ( rule__Parallele3__Group_9__0__Impl rule__Parallele3__Group_9__1 )
            // InternalMyTurtleDsl.g:6971:2: rule__Parallele3__Group_9__0__Impl rule__Parallele3__Group_9__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:6978:1: rule__Parallele3__Group_9__0__Impl : ( ( rule__Parallele3__AAssignment_9_0 ) ) ;
    public final void rule__Parallele3__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6982:1: ( ( ( rule__Parallele3__AAssignment_9_0 ) ) )
            // InternalMyTurtleDsl.g:6983:1: ( ( rule__Parallele3__AAssignment_9_0 ) )
            {
            // InternalMyTurtleDsl.g:6983:1: ( ( rule__Parallele3__AAssignment_9_0 ) )
            // InternalMyTurtleDsl.g:6984:2: ( rule__Parallele3__AAssignment_9_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_9_0()); 
            // InternalMyTurtleDsl.g:6985:2: ( rule__Parallele3__AAssignment_9_0 )
            // InternalMyTurtleDsl.g:6985:3: rule__Parallele3__AAssignment_9_0
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
    // InternalMyTurtleDsl.g:6993:1: rule__Parallele3__Group_9__1 : rule__Parallele3__Group_9__1__Impl rule__Parallele3__Group_9__2 ;
    public final void rule__Parallele3__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6997:1: ( rule__Parallele3__Group_9__1__Impl rule__Parallele3__Group_9__2 )
            // InternalMyTurtleDsl.g:6998:2: rule__Parallele3__Group_9__1__Impl rule__Parallele3__Group_9__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalMyTurtleDsl.g:7005:1: rule__Parallele3__Group_9__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7009:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:7010:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:7010:1: ( '&' )
            // InternalMyTurtleDsl.g:7011:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_9_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:7020:1: rule__Parallele3__Group_9__2 : rule__Parallele3__Group_9__2__Impl rule__Parallele3__Group_9__3 ;
    public final void rule__Parallele3__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7024:1: ( rule__Parallele3__Group_9__2__Impl rule__Parallele3__Group_9__3 )
            // InternalMyTurtleDsl.g:7025:2: rule__Parallele3__Group_9__2__Impl rule__Parallele3__Group_9__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:7032:1: rule__Parallele3__Group_9__2__Impl : ( ( rule__Parallele3__BAssignment_9_2 ) ) ;
    public final void rule__Parallele3__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7036:1: ( ( ( rule__Parallele3__BAssignment_9_2 ) ) )
            // InternalMyTurtleDsl.g:7037:1: ( ( rule__Parallele3__BAssignment_9_2 ) )
            {
            // InternalMyTurtleDsl.g:7037:1: ( ( rule__Parallele3__BAssignment_9_2 ) )
            // InternalMyTurtleDsl.g:7038:2: ( rule__Parallele3__BAssignment_9_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_9_2()); 
            // InternalMyTurtleDsl.g:7039:2: ( rule__Parallele3__BAssignment_9_2 )
            // InternalMyTurtleDsl.g:7039:3: rule__Parallele3__BAssignment_9_2
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
    // InternalMyTurtleDsl.g:7047:1: rule__Parallele3__Group_9__3 : rule__Parallele3__Group_9__3__Impl rule__Parallele3__Group_9__4 ;
    public final void rule__Parallele3__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7051:1: ( rule__Parallele3__Group_9__3__Impl rule__Parallele3__Group_9__4 )
            // InternalMyTurtleDsl.g:7052:2: rule__Parallele3__Group_9__3__Impl rule__Parallele3__Group_9__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyTurtleDsl.g:7059:1: rule__Parallele3__Group_9__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7063:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:7064:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:7064:1: ( '&' )
            // InternalMyTurtleDsl.g:7065:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_9_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:7074:1: rule__Parallele3__Group_9__4 : rule__Parallele3__Group_9__4__Impl ;
    public final void rule__Parallele3__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7078:1: ( rule__Parallele3__Group_9__4__Impl )
            // InternalMyTurtleDsl.g:7079:2: rule__Parallele3__Group_9__4__Impl
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
    // InternalMyTurtleDsl.g:7085:1: rule__Parallele3__Group_9__4__Impl : ( ( rule__Parallele3__CAssignment_9_4 ) ) ;
    public final void rule__Parallele3__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7089:1: ( ( ( rule__Parallele3__CAssignment_9_4 ) ) )
            // InternalMyTurtleDsl.g:7090:1: ( ( rule__Parallele3__CAssignment_9_4 ) )
            {
            // InternalMyTurtleDsl.g:7090:1: ( ( rule__Parallele3__CAssignment_9_4 ) )
            // InternalMyTurtleDsl.g:7091:2: ( rule__Parallele3__CAssignment_9_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_9_4()); 
            // InternalMyTurtleDsl.g:7092:2: ( rule__Parallele3__CAssignment_9_4 )
            // InternalMyTurtleDsl.g:7092:3: rule__Parallele3__CAssignment_9_4
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
    // InternalMyTurtleDsl.g:7101:1: rule__Parallele3__Group_10__0 : rule__Parallele3__Group_10__0__Impl rule__Parallele3__Group_10__1 ;
    public final void rule__Parallele3__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7105:1: ( rule__Parallele3__Group_10__0__Impl rule__Parallele3__Group_10__1 )
            // InternalMyTurtleDsl.g:7106:2: rule__Parallele3__Group_10__0__Impl rule__Parallele3__Group_10__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:7113:1: rule__Parallele3__Group_10__0__Impl : ( ( rule__Parallele3__AAssignment_10_0 ) ) ;
    public final void rule__Parallele3__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7117:1: ( ( ( rule__Parallele3__AAssignment_10_0 ) ) )
            // InternalMyTurtleDsl.g:7118:1: ( ( rule__Parallele3__AAssignment_10_0 ) )
            {
            // InternalMyTurtleDsl.g:7118:1: ( ( rule__Parallele3__AAssignment_10_0 ) )
            // InternalMyTurtleDsl.g:7119:2: ( rule__Parallele3__AAssignment_10_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_10_0()); 
            // InternalMyTurtleDsl.g:7120:2: ( rule__Parallele3__AAssignment_10_0 )
            // InternalMyTurtleDsl.g:7120:3: rule__Parallele3__AAssignment_10_0
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
    // InternalMyTurtleDsl.g:7128:1: rule__Parallele3__Group_10__1 : rule__Parallele3__Group_10__1__Impl rule__Parallele3__Group_10__2 ;
    public final void rule__Parallele3__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7132:1: ( rule__Parallele3__Group_10__1__Impl rule__Parallele3__Group_10__2 )
            // InternalMyTurtleDsl.g:7133:2: rule__Parallele3__Group_10__1__Impl rule__Parallele3__Group_10__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyTurtleDsl.g:7140:1: rule__Parallele3__Group_10__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7144:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:7145:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:7145:1: ( '&' )
            // InternalMyTurtleDsl.g:7146:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_10_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:7155:1: rule__Parallele3__Group_10__2 : rule__Parallele3__Group_10__2__Impl rule__Parallele3__Group_10__3 ;
    public final void rule__Parallele3__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7159:1: ( rule__Parallele3__Group_10__2__Impl rule__Parallele3__Group_10__3 )
            // InternalMyTurtleDsl.g:7160:2: rule__Parallele3__Group_10__2__Impl rule__Parallele3__Group_10__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:7167:1: rule__Parallele3__Group_10__2__Impl : ( ( rule__Parallele3__BAssignment_10_2 ) ) ;
    public final void rule__Parallele3__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7171:1: ( ( ( rule__Parallele3__BAssignment_10_2 ) ) )
            // InternalMyTurtleDsl.g:7172:1: ( ( rule__Parallele3__BAssignment_10_2 ) )
            {
            // InternalMyTurtleDsl.g:7172:1: ( ( rule__Parallele3__BAssignment_10_2 ) )
            // InternalMyTurtleDsl.g:7173:2: ( rule__Parallele3__BAssignment_10_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_10_2()); 
            // InternalMyTurtleDsl.g:7174:2: ( rule__Parallele3__BAssignment_10_2 )
            // InternalMyTurtleDsl.g:7174:3: rule__Parallele3__BAssignment_10_2
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
    // InternalMyTurtleDsl.g:7182:1: rule__Parallele3__Group_10__3 : rule__Parallele3__Group_10__3__Impl rule__Parallele3__Group_10__4 ;
    public final void rule__Parallele3__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7186:1: ( rule__Parallele3__Group_10__3__Impl rule__Parallele3__Group_10__4 )
            // InternalMyTurtleDsl.g:7187:2: rule__Parallele3__Group_10__3__Impl rule__Parallele3__Group_10__4
            {
            pushFollow(FOLLOW_36);
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
    // InternalMyTurtleDsl.g:7194:1: rule__Parallele3__Group_10__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7198:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:7199:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:7199:1: ( '&' )
            // InternalMyTurtleDsl.g:7200:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_10_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:7209:1: rule__Parallele3__Group_10__4 : rule__Parallele3__Group_10__4__Impl ;
    public final void rule__Parallele3__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7213:1: ( rule__Parallele3__Group_10__4__Impl )
            // InternalMyTurtleDsl.g:7214:2: rule__Parallele3__Group_10__4__Impl
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
    // InternalMyTurtleDsl.g:7220:1: rule__Parallele3__Group_10__4__Impl : ( ( rule__Parallele3__CAssignment_10_4 ) ) ;
    public final void rule__Parallele3__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7224:1: ( ( ( rule__Parallele3__CAssignment_10_4 ) ) )
            // InternalMyTurtleDsl.g:7225:1: ( ( rule__Parallele3__CAssignment_10_4 ) )
            {
            // InternalMyTurtleDsl.g:7225:1: ( ( rule__Parallele3__CAssignment_10_4 ) )
            // InternalMyTurtleDsl.g:7226:2: ( rule__Parallele3__CAssignment_10_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_10_4()); 
            // InternalMyTurtleDsl.g:7227:2: ( rule__Parallele3__CAssignment_10_4 )
            // InternalMyTurtleDsl.g:7227:3: rule__Parallele3__CAssignment_10_4
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
    // InternalMyTurtleDsl.g:7236:1: rule__Parallele3__Group_11__0 : rule__Parallele3__Group_11__0__Impl rule__Parallele3__Group_11__1 ;
    public final void rule__Parallele3__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7240:1: ( rule__Parallele3__Group_11__0__Impl rule__Parallele3__Group_11__1 )
            // InternalMyTurtleDsl.g:7241:2: rule__Parallele3__Group_11__0__Impl rule__Parallele3__Group_11__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:7248:1: rule__Parallele3__Group_11__0__Impl : ( ( rule__Parallele3__AAssignment_11_0 ) ) ;
    public final void rule__Parallele3__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7252:1: ( ( ( rule__Parallele3__AAssignment_11_0 ) ) )
            // InternalMyTurtleDsl.g:7253:1: ( ( rule__Parallele3__AAssignment_11_0 ) )
            {
            // InternalMyTurtleDsl.g:7253:1: ( ( rule__Parallele3__AAssignment_11_0 ) )
            // InternalMyTurtleDsl.g:7254:2: ( rule__Parallele3__AAssignment_11_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_11_0()); 
            // InternalMyTurtleDsl.g:7255:2: ( rule__Parallele3__AAssignment_11_0 )
            // InternalMyTurtleDsl.g:7255:3: rule__Parallele3__AAssignment_11_0
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
    // InternalMyTurtleDsl.g:7263:1: rule__Parallele3__Group_11__1 : rule__Parallele3__Group_11__1__Impl rule__Parallele3__Group_11__2 ;
    public final void rule__Parallele3__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7267:1: ( rule__Parallele3__Group_11__1__Impl rule__Parallele3__Group_11__2 )
            // InternalMyTurtleDsl.g:7268:2: rule__Parallele3__Group_11__1__Impl rule__Parallele3__Group_11__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyTurtleDsl.g:7275:1: rule__Parallele3__Group_11__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7279:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:7280:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:7280:1: ( '&' )
            // InternalMyTurtleDsl.g:7281:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_11_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:7290:1: rule__Parallele3__Group_11__2 : rule__Parallele3__Group_11__2__Impl rule__Parallele3__Group_11__3 ;
    public final void rule__Parallele3__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7294:1: ( rule__Parallele3__Group_11__2__Impl rule__Parallele3__Group_11__3 )
            // InternalMyTurtleDsl.g:7295:2: rule__Parallele3__Group_11__2__Impl rule__Parallele3__Group_11__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:7302:1: rule__Parallele3__Group_11__2__Impl : ( ( rule__Parallele3__BAssignment_11_2 ) ) ;
    public final void rule__Parallele3__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7306:1: ( ( ( rule__Parallele3__BAssignment_11_2 ) ) )
            // InternalMyTurtleDsl.g:7307:1: ( ( rule__Parallele3__BAssignment_11_2 ) )
            {
            // InternalMyTurtleDsl.g:7307:1: ( ( rule__Parallele3__BAssignment_11_2 ) )
            // InternalMyTurtleDsl.g:7308:2: ( rule__Parallele3__BAssignment_11_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_11_2()); 
            // InternalMyTurtleDsl.g:7309:2: ( rule__Parallele3__BAssignment_11_2 )
            // InternalMyTurtleDsl.g:7309:3: rule__Parallele3__BAssignment_11_2
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
    // InternalMyTurtleDsl.g:7317:1: rule__Parallele3__Group_11__3 : rule__Parallele3__Group_11__3__Impl rule__Parallele3__Group_11__4 ;
    public final void rule__Parallele3__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7321:1: ( rule__Parallele3__Group_11__3__Impl rule__Parallele3__Group_11__4 )
            // InternalMyTurtleDsl.g:7322:2: rule__Parallele3__Group_11__3__Impl rule__Parallele3__Group_11__4
            {
            pushFollow(FOLLOW_38);
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
    // InternalMyTurtleDsl.g:7329:1: rule__Parallele3__Group_11__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7333:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:7334:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:7334:1: ( '&' )
            // InternalMyTurtleDsl.g:7335:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_11_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:7344:1: rule__Parallele3__Group_11__4 : rule__Parallele3__Group_11__4__Impl ;
    public final void rule__Parallele3__Group_11__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7348:1: ( rule__Parallele3__Group_11__4__Impl )
            // InternalMyTurtleDsl.g:7349:2: rule__Parallele3__Group_11__4__Impl
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
    // InternalMyTurtleDsl.g:7355:1: rule__Parallele3__Group_11__4__Impl : ( ( rule__Parallele3__CAssignment_11_4 ) ) ;
    public final void rule__Parallele3__Group_11__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7359:1: ( ( ( rule__Parallele3__CAssignment_11_4 ) ) )
            // InternalMyTurtleDsl.g:7360:1: ( ( rule__Parallele3__CAssignment_11_4 ) )
            {
            // InternalMyTurtleDsl.g:7360:1: ( ( rule__Parallele3__CAssignment_11_4 ) )
            // InternalMyTurtleDsl.g:7361:2: ( rule__Parallele3__CAssignment_11_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_11_4()); 
            // InternalMyTurtleDsl.g:7362:2: ( rule__Parallele3__CAssignment_11_4 )
            // InternalMyTurtleDsl.g:7362:3: rule__Parallele3__CAssignment_11_4
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
    // InternalMyTurtleDsl.g:7371:1: rule__Parallele3__Group_12__0 : rule__Parallele3__Group_12__0__Impl rule__Parallele3__Group_12__1 ;
    public final void rule__Parallele3__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7375:1: ( rule__Parallele3__Group_12__0__Impl rule__Parallele3__Group_12__1 )
            // InternalMyTurtleDsl.g:7376:2: rule__Parallele3__Group_12__0__Impl rule__Parallele3__Group_12__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:7383:1: rule__Parallele3__Group_12__0__Impl : ( ( rule__Parallele3__AAssignment_12_0 ) ) ;
    public final void rule__Parallele3__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7387:1: ( ( ( rule__Parallele3__AAssignment_12_0 ) ) )
            // InternalMyTurtleDsl.g:7388:1: ( ( rule__Parallele3__AAssignment_12_0 ) )
            {
            // InternalMyTurtleDsl.g:7388:1: ( ( rule__Parallele3__AAssignment_12_0 ) )
            // InternalMyTurtleDsl.g:7389:2: ( rule__Parallele3__AAssignment_12_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_12_0()); 
            // InternalMyTurtleDsl.g:7390:2: ( rule__Parallele3__AAssignment_12_0 )
            // InternalMyTurtleDsl.g:7390:3: rule__Parallele3__AAssignment_12_0
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
    // InternalMyTurtleDsl.g:7398:1: rule__Parallele3__Group_12__1 : rule__Parallele3__Group_12__1__Impl rule__Parallele3__Group_12__2 ;
    public final void rule__Parallele3__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7402:1: ( rule__Parallele3__Group_12__1__Impl rule__Parallele3__Group_12__2 )
            // InternalMyTurtleDsl.g:7403:2: rule__Parallele3__Group_12__1__Impl rule__Parallele3__Group_12__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalMyTurtleDsl.g:7410:1: rule__Parallele3__Group_12__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7414:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:7415:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:7415:1: ( '&' )
            // InternalMyTurtleDsl.g:7416:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_12_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:7425:1: rule__Parallele3__Group_12__2 : rule__Parallele3__Group_12__2__Impl rule__Parallele3__Group_12__3 ;
    public final void rule__Parallele3__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7429:1: ( rule__Parallele3__Group_12__2__Impl rule__Parallele3__Group_12__3 )
            // InternalMyTurtleDsl.g:7430:2: rule__Parallele3__Group_12__2__Impl rule__Parallele3__Group_12__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:7437:1: rule__Parallele3__Group_12__2__Impl : ( ( rule__Parallele3__BAssignment_12_2 ) ) ;
    public final void rule__Parallele3__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7441:1: ( ( ( rule__Parallele3__BAssignment_12_2 ) ) )
            // InternalMyTurtleDsl.g:7442:1: ( ( rule__Parallele3__BAssignment_12_2 ) )
            {
            // InternalMyTurtleDsl.g:7442:1: ( ( rule__Parallele3__BAssignment_12_2 ) )
            // InternalMyTurtleDsl.g:7443:2: ( rule__Parallele3__BAssignment_12_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_12_2()); 
            // InternalMyTurtleDsl.g:7444:2: ( rule__Parallele3__BAssignment_12_2 )
            // InternalMyTurtleDsl.g:7444:3: rule__Parallele3__BAssignment_12_2
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
    // InternalMyTurtleDsl.g:7452:1: rule__Parallele3__Group_12__3 : rule__Parallele3__Group_12__3__Impl rule__Parallele3__Group_12__4 ;
    public final void rule__Parallele3__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7456:1: ( rule__Parallele3__Group_12__3__Impl rule__Parallele3__Group_12__4 )
            // InternalMyTurtleDsl.g:7457:2: rule__Parallele3__Group_12__3__Impl rule__Parallele3__Group_12__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyTurtleDsl.g:7464:1: rule__Parallele3__Group_12__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7468:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:7469:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:7469:1: ( '&' )
            // InternalMyTurtleDsl.g:7470:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_12_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:7479:1: rule__Parallele3__Group_12__4 : rule__Parallele3__Group_12__4__Impl ;
    public final void rule__Parallele3__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7483:1: ( rule__Parallele3__Group_12__4__Impl )
            // InternalMyTurtleDsl.g:7484:2: rule__Parallele3__Group_12__4__Impl
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
    // InternalMyTurtleDsl.g:7490:1: rule__Parallele3__Group_12__4__Impl : ( ( rule__Parallele3__CAssignment_12_4 ) ) ;
    public final void rule__Parallele3__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7494:1: ( ( ( rule__Parallele3__CAssignment_12_4 ) ) )
            // InternalMyTurtleDsl.g:7495:1: ( ( rule__Parallele3__CAssignment_12_4 ) )
            {
            // InternalMyTurtleDsl.g:7495:1: ( ( rule__Parallele3__CAssignment_12_4 ) )
            // InternalMyTurtleDsl.g:7496:2: ( rule__Parallele3__CAssignment_12_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_12_4()); 
            // InternalMyTurtleDsl.g:7497:2: ( rule__Parallele3__CAssignment_12_4 )
            // InternalMyTurtleDsl.g:7497:3: rule__Parallele3__CAssignment_12_4
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
    // InternalMyTurtleDsl.g:7506:1: rule__Parallele3__Group_13__0 : rule__Parallele3__Group_13__0__Impl rule__Parallele3__Group_13__1 ;
    public final void rule__Parallele3__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7510:1: ( rule__Parallele3__Group_13__0__Impl rule__Parallele3__Group_13__1 )
            // InternalMyTurtleDsl.g:7511:2: rule__Parallele3__Group_13__0__Impl rule__Parallele3__Group_13__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:7518:1: rule__Parallele3__Group_13__0__Impl : ( ( rule__Parallele3__AAssignment_13_0 ) ) ;
    public final void rule__Parallele3__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7522:1: ( ( ( rule__Parallele3__AAssignment_13_0 ) ) )
            // InternalMyTurtleDsl.g:7523:1: ( ( rule__Parallele3__AAssignment_13_0 ) )
            {
            // InternalMyTurtleDsl.g:7523:1: ( ( rule__Parallele3__AAssignment_13_0 ) )
            // InternalMyTurtleDsl.g:7524:2: ( rule__Parallele3__AAssignment_13_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_13_0()); 
            // InternalMyTurtleDsl.g:7525:2: ( rule__Parallele3__AAssignment_13_0 )
            // InternalMyTurtleDsl.g:7525:3: rule__Parallele3__AAssignment_13_0
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
    // InternalMyTurtleDsl.g:7533:1: rule__Parallele3__Group_13__1 : rule__Parallele3__Group_13__1__Impl rule__Parallele3__Group_13__2 ;
    public final void rule__Parallele3__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7537:1: ( rule__Parallele3__Group_13__1__Impl rule__Parallele3__Group_13__2 )
            // InternalMyTurtleDsl.g:7538:2: rule__Parallele3__Group_13__1__Impl rule__Parallele3__Group_13__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalMyTurtleDsl.g:7545:1: rule__Parallele3__Group_13__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7549:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:7550:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:7550:1: ( '&' )
            // InternalMyTurtleDsl.g:7551:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_13_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:7560:1: rule__Parallele3__Group_13__2 : rule__Parallele3__Group_13__2__Impl rule__Parallele3__Group_13__3 ;
    public final void rule__Parallele3__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7564:1: ( rule__Parallele3__Group_13__2__Impl rule__Parallele3__Group_13__3 )
            // InternalMyTurtleDsl.g:7565:2: rule__Parallele3__Group_13__2__Impl rule__Parallele3__Group_13__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:7572:1: rule__Parallele3__Group_13__2__Impl : ( ( rule__Parallele3__BAssignment_13_2 ) ) ;
    public final void rule__Parallele3__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7576:1: ( ( ( rule__Parallele3__BAssignment_13_2 ) ) )
            // InternalMyTurtleDsl.g:7577:1: ( ( rule__Parallele3__BAssignment_13_2 ) )
            {
            // InternalMyTurtleDsl.g:7577:1: ( ( rule__Parallele3__BAssignment_13_2 ) )
            // InternalMyTurtleDsl.g:7578:2: ( rule__Parallele3__BAssignment_13_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_13_2()); 
            // InternalMyTurtleDsl.g:7579:2: ( rule__Parallele3__BAssignment_13_2 )
            // InternalMyTurtleDsl.g:7579:3: rule__Parallele3__BAssignment_13_2
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
    // InternalMyTurtleDsl.g:7587:1: rule__Parallele3__Group_13__3 : rule__Parallele3__Group_13__3__Impl rule__Parallele3__Group_13__4 ;
    public final void rule__Parallele3__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7591:1: ( rule__Parallele3__Group_13__3__Impl rule__Parallele3__Group_13__4 )
            // InternalMyTurtleDsl.g:7592:2: rule__Parallele3__Group_13__3__Impl rule__Parallele3__Group_13__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyTurtleDsl.g:7599:1: rule__Parallele3__Group_13__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7603:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:7604:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:7604:1: ( '&' )
            // InternalMyTurtleDsl.g:7605:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_13_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:7614:1: rule__Parallele3__Group_13__4 : rule__Parallele3__Group_13__4__Impl ;
    public final void rule__Parallele3__Group_13__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7618:1: ( rule__Parallele3__Group_13__4__Impl )
            // InternalMyTurtleDsl.g:7619:2: rule__Parallele3__Group_13__4__Impl
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
    // InternalMyTurtleDsl.g:7625:1: rule__Parallele3__Group_13__4__Impl : ( ( rule__Parallele3__CAssignment_13_4 ) ) ;
    public final void rule__Parallele3__Group_13__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7629:1: ( ( ( rule__Parallele3__CAssignment_13_4 ) ) )
            // InternalMyTurtleDsl.g:7630:1: ( ( rule__Parallele3__CAssignment_13_4 ) )
            {
            // InternalMyTurtleDsl.g:7630:1: ( ( rule__Parallele3__CAssignment_13_4 ) )
            // InternalMyTurtleDsl.g:7631:2: ( rule__Parallele3__CAssignment_13_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_13_4()); 
            // InternalMyTurtleDsl.g:7632:2: ( rule__Parallele3__CAssignment_13_4 )
            // InternalMyTurtleDsl.g:7632:3: rule__Parallele3__CAssignment_13_4
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
    // InternalMyTurtleDsl.g:7641:1: rule__Parallele3__Group_14__0 : rule__Parallele3__Group_14__0__Impl rule__Parallele3__Group_14__1 ;
    public final void rule__Parallele3__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7645:1: ( rule__Parallele3__Group_14__0__Impl rule__Parallele3__Group_14__1 )
            // InternalMyTurtleDsl.g:7646:2: rule__Parallele3__Group_14__0__Impl rule__Parallele3__Group_14__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:7653:1: rule__Parallele3__Group_14__0__Impl : ( ( rule__Parallele3__AAssignment_14_0 ) ) ;
    public final void rule__Parallele3__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7657:1: ( ( ( rule__Parallele3__AAssignment_14_0 ) ) )
            // InternalMyTurtleDsl.g:7658:1: ( ( rule__Parallele3__AAssignment_14_0 ) )
            {
            // InternalMyTurtleDsl.g:7658:1: ( ( rule__Parallele3__AAssignment_14_0 ) )
            // InternalMyTurtleDsl.g:7659:2: ( rule__Parallele3__AAssignment_14_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_14_0()); 
            // InternalMyTurtleDsl.g:7660:2: ( rule__Parallele3__AAssignment_14_0 )
            // InternalMyTurtleDsl.g:7660:3: rule__Parallele3__AAssignment_14_0
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
    // InternalMyTurtleDsl.g:7668:1: rule__Parallele3__Group_14__1 : rule__Parallele3__Group_14__1__Impl rule__Parallele3__Group_14__2 ;
    public final void rule__Parallele3__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7672:1: ( rule__Parallele3__Group_14__1__Impl rule__Parallele3__Group_14__2 )
            // InternalMyTurtleDsl.g:7673:2: rule__Parallele3__Group_14__1__Impl rule__Parallele3__Group_14__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyTurtleDsl.g:7680:1: rule__Parallele3__Group_14__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7684:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:7685:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:7685:1: ( '&' )
            // InternalMyTurtleDsl.g:7686:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_14_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:7695:1: rule__Parallele3__Group_14__2 : rule__Parallele3__Group_14__2__Impl rule__Parallele3__Group_14__3 ;
    public final void rule__Parallele3__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7699:1: ( rule__Parallele3__Group_14__2__Impl rule__Parallele3__Group_14__3 )
            // InternalMyTurtleDsl.g:7700:2: rule__Parallele3__Group_14__2__Impl rule__Parallele3__Group_14__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:7707:1: rule__Parallele3__Group_14__2__Impl : ( ( rule__Parallele3__BAssignment_14_2 ) ) ;
    public final void rule__Parallele3__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7711:1: ( ( ( rule__Parallele3__BAssignment_14_2 ) ) )
            // InternalMyTurtleDsl.g:7712:1: ( ( rule__Parallele3__BAssignment_14_2 ) )
            {
            // InternalMyTurtleDsl.g:7712:1: ( ( rule__Parallele3__BAssignment_14_2 ) )
            // InternalMyTurtleDsl.g:7713:2: ( rule__Parallele3__BAssignment_14_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_14_2()); 
            // InternalMyTurtleDsl.g:7714:2: ( rule__Parallele3__BAssignment_14_2 )
            // InternalMyTurtleDsl.g:7714:3: rule__Parallele3__BAssignment_14_2
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
    // InternalMyTurtleDsl.g:7722:1: rule__Parallele3__Group_14__3 : rule__Parallele3__Group_14__3__Impl rule__Parallele3__Group_14__4 ;
    public final void rule__Parallele3__Group_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7726:1: ( rule__Parallele3__Group_14__3__Impl rule__Parallele3__Group_14__4 )
            // InternalMyTurtleDsl.g:7727:2: rule__Parallele3__Group_14__3__Impl rule__Parallele3__Group_14__4
            {
            pushFollow(FOLLOW_36);
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
    // InternalMyTurtleDsl.g:7734:1: rule__Parallele3__Group_14__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_14__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7738:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:7739:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:7739:1: ( '&' )
            // InternalMyTurtleDsl.g:7740:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_14_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:7749:1: rule__Parallele3__Group_14__4 : rule__Parallele3__Group_14__4__Impl ;
    public final void rule__Parallele3__Group_14__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7753:1: ( rule__Parallele3__Group_14__4__Impl )
            // InternalMyTurtleDsl.g:7754:2: rule__Parallele3__Group_14__4__Impl
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
    // InternalMyTurtleDsl.g:7760:1: rule__Parallele3__Group_14__4__Impl : ( ( rule__Parallele3__CAssignment_14_4 ) ) ;
    public final void rule__Parallele3__Group_14__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7764:1: ( ( ( rule__Parallele3__CAssignment_14_4 ) ) )
            // InternalMyTurtleDsl.g:7765:1: ( ( rule__Parallele3__CAssignment_14_4 ) )
            {
            // InternalMyTurtleDsl.g:7765:1: ( ( rule__Parallele3__CAssignment_14_4 ) )
            // InternalMyTurtleDsl.g:7766:2: ( rule__Parallele3__CAssignment_14_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_14_4()); 
            // InternalMyTurtleDsl.g:7767:2: ( rule__Parallele3__CAssignment_14_4 )
            // InternalMyTurtleDsl.g:7767:3: rule__Parallele3__CAssignment_14_4
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
    // InternalMyTurtleDsl.g:7776:1: rule__Parallele3__Group_15__0 : rule__Parallele3__Group_15__0__Impl rule__Parallele3__Group_15__1 ;
    public final void rule__Parallele3__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7780:1: ( rule__Parallele3__Group_15__0__Impl rule__Parallele3__Group_15__1 )
            // InternalMyTurtleDsl.g:7781:2: rule__Parallele3__Group_15__0__Impl rule__Parallele3__Group_15__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:7788:1: rule__Parallele3__Group_15__0__Impl : ( ( rule__Parallele3__AAssignment_15_0 ) ) ;
    public final void rule__Parallele3__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7792:1: ( ( ( rule__Parallele3__AAssignment_15_0 ) ) )
            // InternalMyTurtleDsl.g:7793:1: ( ( rule__Parallele3__AAssignment_15_0 ) )
            {
            // InternalMyTurtleDsl.g:7793:1: ( ( rule__Parallele3__AAssignment_15_0 ) )
            // InternalMyTurtleDsl.g:7794:2: ( rule__Parallele3__AAssignment_15_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_15_0()); 
            // InternalMyTurtleDsl.g:7795:2: ( rule__Parallele3__AAssignment_15_0 )
            // InternalMyTurtleDsl.g:7795:3: rule__Parallele3__AAssignment_15_0
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
    // InternalMyTurtleDsl.g:7803:1: rule__Parallele3__Group_15__1 : rule__Parallele3__Group_15__1__Impl rule__Parallele3__Group_15__2 ;
    public final void rule__Parallele3__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7807:1: ( rule__Parallele3__Group_15__1__Impl rule__Parallele3__Group_15__2 )
            // InternalMyTurtleDsl.g:7808:2: rule__Parallele3__Group_15__1__Impl rule__Parallele3__Group_15__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyTurtleDsl.g:7815:1: rule__Parallele3__Group_15__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7819:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:7820:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:7820:1: ( '&' )
            // InternalMyTurtleDsl.g:7821:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_15_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:7830:1: rule__Parallele3__Group_15__2 : rule__Parallele3__Group_15__2__Impl rule__Parallele3__Group_15__3 ;
    public final void rule__Parallele3__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7834:1: ( rule__Parallele3__Group_15__2__Impl rule__Parallele3__Group_15__3 )
            // InternalMyTurtleDsl.g:7835:2: rule__Parallele3__Group_15__2__Impl rule__Parallele3__Group_15__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:7842:1: rule__Parallele3__Group_15__2__Impl : ( ( rule__Parallele3__BAssignment_15_2 ) ) ;
    public final void rule__Parallele3__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7846:1: ( ( ( rule__Parallele3__BAssignment_15_2 ) ) )
            // InternalMyTurtleDsl.g:7847:1: ( ( rule__Parallele3__BAssignment_15_2 ) )
            {
            // InternalMyTurtleDsl.g:7847:1: ( ( rule__Parallele3__BAssignment_15_2 ) )
            // InternalMyTurtleDsl.g:7848:2: ( rule__Parallele3__BAssignment_15_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_15_2()); 
            // InternalMyTurtleDsl.g:7849:2: ( rule__Parallele3__BAssignment_15_2 )
            // InternalMyTurtleDsl.g:7849:3: rule__Parallele3__BAssignment_15_2
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
    // InternalMyTurtleDsl.g:7857:1: rule__Parallele3__Group_15__3 : rule__Parallele3__Group_15__3__Impl rule__Parallele3__Group_15__4 ;
    public final void rule__Parallele3__Group_15__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7861:1: ( rule__Parallele3__Group_15__3__Impl rule__Parallele3__Group_15__4 )
            // InternalMyTurtleDsl.g:7862:2: rule__Parallele3__Group_15__3__Impl rule__Parallele3__Group_15__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyTurtleDsl.g:7869:1: rule__Parallele3__Group_15__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_15__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7873:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:7874:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:7874:1: ( '&' )
            // InternalMyTurtleDsl.g:7875:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_15_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:7884:1: rule__Parallele3__Group_15__4 : rule__Parallele3__Group_15__4__Impl ;
    public final void rule__Parallele3__Group_15__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7888:1: ( rule__Parallele3__Group_15__4__Impl )
            // InternalMyTurtleDsl.g:7889:2: rule__Parallele3__Group_15__4__Impl
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
    // InternalMyTurtleDsl.g:7895:1: rule__Parallele3__Group_15__4__Impl : ( ( rule__Parallele3__CAssignment_15_4 ) ) ;
    public final void rule__Parallele3__Group_15__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7899:1: ( ( ( rule__Parallele3__CAssignment_15_4 ) ) )
            // InternalMyTurtleDsl.g:7900:1: ( ( rule__Parallele3__CAssignment_15_4 ) )
            {
            // InternalMyTurtleDsl.g:7900:1: ( ( rule__Parallele3__CAssignment_15_4 ) )
            // InternalMyTurtleDsl.g:7901:2: ( rule__Parallele3__CAssignment_15_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_15_4()); 
            // InternalMyTurtleDsl.g:7902:2: ( rule__Parallele3__CAssignment_15_4 )
            // InternalMyTurtleDsl.g:7902:3: rule__Parallele3__CAssignment_15_4
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
    // InternalMyTurtleDsl.g:7911:1: rule__Parallele3__Group_16__0 : rule__Parallele3__Group_16__0__Impl rule__Parallele3__Group_16__1 ;
    public final void rule__Parallele3__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7915:1: ( rule__Parallele3__Group_16__0__Impl rule__Parallele3__Group_16__1 )
            // InternalMyTurtleDsl.g:7916:2: rule__Parallele3__Group_16__0__Impl rule__Parallele3__Group_16__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:7923:1: rule__Parallele3__Group_16__0__Impl : ( ( rule__Parallele3__AAssignment_16_0 ) ) ;
    public final void rule__Parallele3__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7927:1: ( ( ( rule__Parallele3__AAssignment_16_0 ) ) )
            // InternalMyTurtleDsl.g:7928:1: ( ( rule__Parallele3__AAssignment_16_0 ) )
            {
            // InternalMyTurtleDsl.g:7928:1: ( ( rule__Parallele3__AAssignment_16_0 ) )
            // InternalMyTurtleDsl.g:7929:2: ( rule__Parallele3__AAssignment_16_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_16_0()); 
            // InternalMyTurtleDsl.g:7930:2: ( rule__Parallele3__AAssignment_16_0 )
            // InternalMyTurtleDsl.g:7930:3: rule__Parallele3__AAssignment_16_0
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
    // InternalMyTurtleDsl.g:7938:1: rule__Parallele3__Group_16__1 : rule__Parallele3__Group_16__1__Impl rule__Parallele3__Group_16__2 ;
    public final void rule__Parallele3__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7942:1: ( rule__Parallele3__Group_16__1__Impl rule__Parallele3__Group_16__2 )
            // InternalMyTurtleDsl.g:7943:2: rule__Parallele3__Group_16__1__Impl rule__Parallele3__Group_16__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyTurtleDsl.g:7950:1: rule__Parallele3__Group_16__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7954:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:7955:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:7955:1: ( '&' )
            // InternalMyTurtleDsl.g:7956:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_16_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:7965:1: rule__Parallele3__Group_16__2 : rule__Parallele3__Group_16__2__Impl rule__Parallele3__Group_16__3 ;
    public final void rule__Parallele3__Group_16__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7969:1: ( rule__Parallele3__Group_16__2__Impl rule__Parallele3__Group_16__3 )
            // InternalMyTurtleDsl.g:7970:2: rule__Parallele3__Group_16__2__Impl rule__Parallele3__Group_16__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:7977:1: rule__Parallele3__Group_16__2__Impl : ( ( rule__Parallele3__BAssignment_16_2 ) ) ;
    public final void rule__Parallele3__Group_16__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7981:1: ( ( ( rule__Parallele3__BAssignment_16_2 ) ) )
            // InternalMyTurtleDsl.g:7982:1: ( ( rule__Parallele3__BAssignment_16_2 ) )
            {
            // InternalMyTurtleDsl.g:7982:1: ( ( rule__Parallele3__BAssignment_16_2 ) )
            // InternalMyTurtleDsl.g:7983:2: ( rule__Parallele3__BAssignment_16_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_16_2()); 
            // InternalMyTurtleDsl.g:7984:2: ( rule__Parallele3__BAssignment_16_2 )
            // InternalMyTurtleDsl.g:7984:3: rule__Parallele3__BAssignment_16_2
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
    // InternalMyTurtleDsl.g:7992:1: rule__Parallele3__Group_16__3 : rule__Parallele3__Group_16__3__Impl rule__Parallele3__Group_16__4 ;
    public final void rule__Parallele3__Group_16__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7996:1: ( rule__Parallele3__Group_16__3__Impl rule__Parallele3__Group_16__4 )
            // InternalMyTurtleDsl.g:7997:2: rule__Parallele3__Group_16__3__Impl rule__Parallele3__Group_16__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyTurtleDsl.g:8004:1: rule__Parallele3__Group_16__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_16__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8008:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:8009:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:8009:1: ( '&' )
            // InternalMyTurtleDsl.g:8010:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_16_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:8019:1: rule__Parallele3__Group_16__4 : rule__Parallele3__Group_16__4__Impl ;
    public final void rule__Parallele3__Group_16__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8023:1: ( rule__Parallele3__Group_16__4__Impl )
            // InternalMyTurtleDsl.g:8024:2: rule__Parallele3__Group_16__4__Impl
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
    // InternalMyTurtleDsl.g:8030:1: rule__Parallele3__Group_16__4__Impl : ( ( rule__Parallele3__CAssignment_16_4 ) ) ;
    public final void rule__Parallele3__Group_16__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8034:1: ( ( ( rule__Parallele3__CAssignment_16_4 ) ) )
            // InternalMyTurtleDsl.g:8035:1: ( ( rule__Parallele3__CAssignment_16_4 ) )
            {
            // InternalMyTurtleDsl.g:8035:1: ( ( rule__Parallele3__CAssignment_16_4 ) )
            // InternalMyTurtleDsl.g:8036:2: ( rule__Parallele3__CAssignment_16_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_16_4()); 
            // InternalMyTurtleDsl.g:8037:2: ( rule__Parallele3__CAssignment_16_4 )
            // InternalMyTurtleDsl.g:8037:3: rule__Parallele3__CAssignment_16_4
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
    // InternalMyTurtleDsl.g:8046:1: rule__Parallele3__Group_17__0 : rule__Parallele3__Group_17__0__Impl rule__Parallele3__Group_17__1 ;
    public final void rule__Parallele3__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8050:1: ( rule__Parallele3__Group_17__0__Impl rule__Parallele3__Group_17__1 )
            // InternalMyTurtleDsl.g:8051:2: rule__Parallele3__Group_17__0__Impl rule__Parallele3__Group_17__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:8058:1: rule__Parallele3__Group_17__0__Impl : ( ( rule__Parallele3__AAssignment_17_0 ) ) ;
    public final void rule__Parallele3__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8062:1: ( ( ( rule__Parallele3__AAssignment_17_0 ) ) )
            // InternalMyTurtleDsl.g:8063:1: ( ( rule__Parallele3__AAssignment_17_0 ) )
            {
            // InternalMyTurtleDsl.g:8063:1: ( ( rule__Parallele3__AAssignment_17_0 ) )
            // InternalMyTurtleDsl.g:8064:2: ( rule__Parallele3__AAssignment_17_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_17_0()); 
            // InternalMyTurtleDsl.g:8065:2: ( rule__Parallele3__AAssignment_17_0 )
            // InternalMyTurtleDsl.g:8065:3: rule__Parallele3__AAssignment_17_0
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
    // InternalMyTurtleDsl.g:8073:1: rule__Parallele3__Group_17__1 : rule__Parallele3__Group_17__1__Impl rule__Parallele3__Group_17__2 ;
    public final void rule__Parallele3__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8077:1: ( rule__Parallele3__Group_17__1__Impl rule__Parallele3__Group_17__2 )
            // InternalMyTurtleDsl.g:8078:2: rule__Parallele3__Group_17__1__Impl rule__Parallele3__Group_17__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyTurtleDsl.g:8085:1: rule__Parallele3__Group_17__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8089:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:8090:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:8090:1: ( '&' )
            // InternalMyTurtleDsl.g:8091:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_17_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:8100:1: rule__Parallele3__Group_17__2 : rule__Parallele3__Group_17__2__Impl rule__Parallele3__Group_17__3 ;
    public final void rule__Parallele3__Group_17__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8104:1: ( rule__Parallele3__Group_17__2__Impl rule__Parallele3__Group_17__3 )
            // InternalMyTurtleDsl.g:8105:2: rule__Parallele3__Group_17__2__Impl rule__Parallele3__Group_17__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:8112:1: rule__Parallele3__Group_17__2__Impl : ( ( rule__Parallele3__BAssignment_17_2 ) ) ;
    public final void rule__Parallele3__Group_17__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8116:1: ( ( ( rule__Parallele3__BAssignment_17_2 ) ) )
            // InternalMyTurtleDsl.g:8117:1: ( ( rule__Parallele3__BAssignment_17_2 ) )
            {
            // InternalMyTurtleDsl.g:8117:1: ( ( rule__Parallele3__BAssignment_17_2 ) )
            // InternalMyTurtleDsl.g:8118:2: ( rule__Parallele3__BAssignment_17_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_17_2()); 
            // InternalMyTurtleDsl.g:8119:2: ( rule__Parallele3__BAssignment_17_2 )
            // InternalMyTurtleDsl.g:8119:3: rule__Parallele3__BAssignment_17_2
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
    // InternalMyTurtleDsl.g:8127:1: rule__Parallele3__Group_17__3 : rule__Parallele3__Group_17__3__Impl rule__Parallele3__Group_17__4 ;
    public final void rule__Parallele3__Group_17__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8131:1: ( rule__Parallele3__Group_17__3__Impl rule__Parallele3__Group_17__4 )
            // InternalMyTurtleDsl.g:8132:2: rule__Parallele3__Group_17__3__Impl rule__Parallele3__Group_17__4
            {
            pushFollow(FOLLOW_36);
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
    // InternalMyTurtleDsl.g:8139:1: rule__Parallele3__Group_17__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_17__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8143:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:8144:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:8144:1: ( '&' )
            // InternalMyTurtleDsl.g:8145:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_17_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:8154:1: rule__Parallele3__Group_17__4 : rule__Parallele3__Group_17__4__Impl ;
    public final void rule__Parallele3__Group_17__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8158:1: ( rule__Parallele3__Group_17__4__Impl )
            // InternalMyTurtleDsl.g:8159:2: rule__Parallele3__Group_17__4__Impl
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
    // InternalMyTurtleDsl.g:8165:1: rule__Parallele3__Group_17__4__Impl : ( ( rule__Parallele3__CAssignment_17_4 ) ) ;
    public final void rule__Parallele3__Group_17__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8169:1: ( ( ( rule__Parallele3__CAssignment_17_4 ) ) )
            // InternalMyTurtleDsl.g:8170:1: ( ( rule__Parallele3__CAssignment_17_4 ) )
            {
            // InternalMyTurtleDsl.g:8170:1: ( ( rule__Parallele3__CAssignment_17_4 ) )
            // InternalMyTurtleDsl.g:8171:2: ( rule__Parallele3__CAssignment_17_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_17_4()); 
            // InternalMyTurtleDsl.g:8172:2: ( rule__Parallele3__CAssignment_17_4 )
            // InternalMyTurtleDsl.g:8172:3: rule__Parallele3__CAssignment_17_4
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
    // InternalMyTurtleDsl.g:8181:1: rule__Parallele3__Group_18__0 : rule__Parallele3__Group_18__0__Impl rule__Parallele3__Group_18__1 ;
    public final void rule__Parallele3__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8185:1: ( rule__Parallele3__Group_18__0__Impl rule__Parallele3__Group_18__1 )
            // InternalMyTurtleDsl.g:8186:2: rule__Parallele3__Group_18__0__Impl rule__Parallele3__Group_18__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:8193:1: rule__Parallele3__Group_18__0__Impl : ( ( rule__Parallele3__AAssignment_18_0 ) ) ;
    public final void rule__Parallele3__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8197:1: ( ( ( rule__Parallele3__AAssignment_18_0 ) ) )
            // InternalMyTurtleDsl.g:8198:1: ( ( rule__Parallele3__AAssignment_18_0 ) )
            {
            // InternalMyTurtleDsl.g:8198:1: ( ( rule__Parallele3__AAssignment_18_0 ) )
            // InternalMyTurtleDsl.g:8199:2: ( rule__Parallele3__AAssignment_18_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_18_0()); 
            // InternalMyTurtleDsl.g:8200:2: ( rule__Parallele3__AAssignment_18_0 )
            // InternalMyTurtleDsl.g:8200:3: rule__Parallele3__AAssignment_18_0
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
    // InternalMyTurtleDsl.g:8208:1: rule__Parallele3__Group_18__1 : rule__Parallele3__Group_18__1__Impl rule__Parallele3__Group_18__2 ;
    public final void rule__Parallele3__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8212:1: ( rule__Parallele3__Group_18__1__Impl rule__Parallele3__Group_18__2 )
            // InternalMyTurtleDsl.g:8213:2: rule__Parallele3__Group_18__1__Impl rule__Parallele3__Group_18__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalMyTurtleDsl.g:8220:1: rule__Parallele3__Group_18__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8224:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:8225:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:8225:1: ( '&' )
            // InternalMyTurtleDsl.g:8226:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_18_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:8235:1: rule__Parallele3__Group_18__2 : rule__Parallele3__Group_18__2__Impl rule__Parallele3__Group_18__3 ;
    public final void rule__Parallele3__Group_18__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8239:1: ( rule__Parallele3__Group_18__2__Impl rule__Parallele3__Group_18__3 )
            // InternalMyTurtleDsl.g:8240:2: rule__Parallele3__Group_18__2__Impl rule__Parallele3__Group_18__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:8247:1: rule__Parallele3__Group_18__2__Impl : ( ( rule__Parallele3__BAssignment_18_2 ) ) ;
    public final void rule__Parallele3__Group_18__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8251:1: ( ( ( rule__Parallele3__BAssignment_18_2 ) ) )
            // InternalMyTurtleDsl.g:8252:1: ( ( rule__Parallele3__BAssignment_18_2 ) )
            {
            // InternalMyTurtleDsl.g:8252:1: ( ( rule__Parallele3__BAssignment_18_2 ) )
            // InternalMyTurtleDsl.g:8253:2: ( rule__Parallele3__BAssignment_18_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_18_2()); 
            // InternalMyTurtleDsl.g:8254:2: ( rule__Parallele3__BAssignment_18_2 )
            // InternalMyTurtleDsl.g:8254:3: rule__Parallele3__BAssignment_18_2
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
    // InternalMyTurtleDsl.g:8262:1: rule__Parallele3__Group_18__3 : rule__Parallele3__Group_18__3__Impl rule__Parallele3__Group_18__4 ;
    public final void rule__Parallele3__Group_18__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8266:1: ( rule__Parallele3__Group_18__3__Impl rule__Parallele3__Group_18__4 )
            // InternalMyTurtleDsl.g:8267:2: rule__Parallele3__Group_18__3__Impl rule__Parallele3__Group_18__4
            {
            pushFollow(FOLLOW_38);
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
    // InternalMyTurtleDsl.g:8274:1: rule__Parallele3__Group_18__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_18__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8278:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:8279:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:8279:1: ( '&' )
            // InternalMyTurtleDsl.g:8280:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_18_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:8289:1: rule__Parallele3__Group_18__4 : rule__Parallele3__Group_18__4__Impl ;
    public final void rule__Parallele3__Group_18__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8293:1: ( rule__Parallele3__Group_18__4__Impl )
            // InternalMyTurtleDsl.g:8294:2: rule__Parallele3__Group_18__4__Impl
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
    // InternalMyTurtleDsl.g:8300:1: rule__Parallele3__Group_18__4__Impl : ( ( rule__Parallele3__CAssignment_18_4 ) ) ;
    public final void rule__Parallele3__Group_18__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8304:1: ( ( ( rule__Parallele3__CAssignment_18_4 ) ) )
            // InternalMyTurtleDsl.g:8305:1: ( ( rule__Parallele3__CAssignment_18_4 ) )
            {
            // InternalMyTurtleDsl.g:8305:1: ( ( rule__Parallele3__CAssignment_18_4 ) )
            // InternalMyTurtleDsl.g:8306:2: ( rule__Parallele3__CAssignment_18_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_18_4()); 
            // InternalMyTurtleDsl.g:8307:2: ( rule__Parallele3__CAssignment_18_4 )
            // InternalMyTurtleDsl.g:8307:3: rule__Parallele3__CAssignment_18_4
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
    // InternalMyTurtleDsl.g:8316:1: rule__Parallele3__Group_19__0 : rule__Parallele3__Group_19__0__Impl rule__Parallele3__Group_19__1 ;
    public final void rule__Parallele3__Group_19__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8320:1: ( rule__Parallele3__Group_19__0__Impl rule__Parallele3__Group_19__1 )
            // InternalMyTurtleDsl.g:8321:2: rule__Parallele3__Group_19__0__Impl rule__Parallele3__Group_19__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:8328:1: rule__Parallele3__Group_19__0__Impl : ( ( rule__Parallele3__AAssignment_19_0 ) ) ;
    public final void rule__Parallele3__Group_19__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8332:1: ( ( ( rule__Parallele3__AAssignment_19_0 ) ) )
            // InternalMyTurtleDsl.g:8333:1: ( ( rule__Parallele3__AAssignment_19_0 ) )
            {
            // InternalMyTurtleDsl.g:8333:1: ( ( rule__Parallele3__AAssignment_19_0 ) )
            // InternalMyTurtleDsl.g:8334:2: ( rule__Parallele3__AAssignment_19_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_19_0()); 
            // InternalMyTurtleDsl.g:8335:2: ( rule__Parallele3__AAssignment_19_0 )
            // InternalMyTurtleDsl.g:8335:3: rule__Parallele3__AAssignment_19_0
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
    // InternalMyTurtleDsl.g:8343:1: rule__Parallele3__Group_19__1 : rule__Parallele3__Group_19__1__Impl rule__Parallele3__Group_19__2 ;
    public final void rule__Parallele3__Group_19__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8347:1: ( rule__Parallele3__Group_19__1__Impl rule__Parallele3__Group_19__2 )
            // InternalMyTurtleDsl.g:8348:2: rule__Parallele3__Group_19__1__Impl rule__Parallele3__Group_19__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalMyTurtleDsl.g:8355:1: rule__Parallele3__Group_19__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_19__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8359:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:8360:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:8360:1: ( '&' )
            // InternalMyTurtleDsl.g:8361:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_19_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:8370:1: rule__Parallele3__Group_19__2 : rule__Parallele3__Group_19__2__Impl rule__Parallele3__Group_19__3 ;
    public final void rule__Parallele3__Group_19__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8374:1: ( rule__Parallele3__Group_19__2__Impl rule__Parallele3__Group_19__3 )
            // InternalMyTurtleDsl.g:8375:2: rule__Parallele3__Group_19__2__Impl rule__Parallele3__Group_19__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:8382:1: rule__Parallele3__Group_19__2__Impl : ( ( rule__Parallele3__BAssignment_19_2 ) ) ;
    public final void rule__Parallele3__Group_19__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8386:1: ( ( ( rule__Parallele3__BAssignment_19_2 ) ) )
            // InternalMyTurtleDsl.g:8387:1: ( ( rule__Parallele3__BAssignment_19_2 ) )
            {
            // InternalMyTurtleDsl.g:8387:1: ( ( rule__Parallele3__BAssignment_19_2 ) )
            // InternalMyTurtleDsl.g:8388:2: ( rule__Parallele3__BAssignment_19_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_19_2()); 
            // InternalMyTurtleDsl.g:8389:2: ( rule__Parallele3__BAssignment_19_2 )
            // InternalMyTurtleDsl.g:8389:3: rule__Parallele3__BAssignment_19_2
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
    // InternalMyTurtleDsl.g:8397:1: rule__Parallele3__Group_19__3 : rule__Parallele3__Group_19__3__Impl rule__Parallele3__Group_19__4 ;
    public final void rule__Parallele3__Group_19__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8401:1: ( rule__Parallele3__Group_19__3__Impl rule__Parallele3__Group_19__4 )
            // InternalMyTurtleDsl.g:8402:2: rule__Parallele3__Group_19__3__Impl rule__Parallele3__Group_19__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyTurtleDsl.g:8409:1: rule__Parallele3__Group_19__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_19__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8413:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:8414:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:8414:1: ( '&' )
            // InternalMyTurtleDsl.g:8415:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_19_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:8424:1: rule__Parallele3__Group_19__4 : rule__Parallele3__Group_19__4__Impl ;
    public final void rule__Parallele3__Group_19__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8428:1: ( rule__Parallele3__Group_19__4__Impl )
            // InternalMyTurtleDsl.g:8429:2: rule__Parallele3__Group_19__4__Impl
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
    // InternalMyTurtleDsl.g:8435:1: rule__Parallele3__Group_19__4__Impl : ( ( rule__Parallele3__CAssignment_19_4 ) ) ;
    public final void rule__Parallele3__Group_19__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8439:1: ( ( ( rule__Parallele3__CAssignment_19_4 ) ) )
            // InternalMyTurtleDsl.g:8440:1: ( ( rule__Parallele3__CAssignment_19_4 ) )
            {
            // InternalMyTurtleDsl.g:8440:1: ( ( rule__Parallele3__CAssignment_19_4 ) )
            // InternalMyTurtleDsl.g:8441:2: ( rule__Parallele3__CAssignment_19_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_19_4()); 
            // InternalMyTurtleDsl.g:8442:2: ( rule__Parallele3__CAssignment_19_4 )
            // InternalMyTurtleDsl.g:8442:3: rule__Parallele3__CAssignment_19_4
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
    // InternalMyTurtleDsl.g:8451:1: rule__Parallele3__Group_20__0 : rule__Parallele3__Group_20__0__Impl rule__Parallele3__Group_20__1 ;
    public final void rule__Parallele3__Group_20__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8455:1: ( rule__Parallele3__Group_20__0__Impl rule__Parallele3__Group_20__1 )
            // InternalMyTurtleDsl.g:8456:2: rule__Parallele3__Group_20__0__Impl rule__Parallele3__Group_20__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:8463:1: rule__Parallele3__Group_20__0__Impl : ( ( rule__Parallele3__AAssignment_20_0 ) ) ;
    public final void rule__Parallele3__Group_20__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8467:1: ( ( ( rule__Parallele3__AAssignment_20_0 ) ) )
            // InternalMyTurtleDsl.g:8468:1: ( ( rule__Parallele3__AAssignment_20_0 ) )
            {
            // InternalMyTurtleDsl.g:8468:1: ( ( rule__Parallele3__AAssignment_20_0 ) )
            // InternalMyTurtleDsl.g:8469:2: ( rule__Parallele3__AAssignment_20_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_20_0()); 
            // InternalMyTurtleDsl.g:8470:2: ( rule__Parallele3__AAssignment_20_0 )
            // InternalMyTurtleDsl.g:8470:3: rule__Parallele3__AAssignment_20_0
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
    // InternalMyTurtleDsl.g:8478:1: rule__Parallele3__Group_20__1 : rule__Parallele3__Group_20__1__Impl rule__Parallele3__Group_20__2 ;
    public final void rule__Parallele3__Group_20__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8482:1: ( rule__Parallele3__Group_20__1__Impl rule__Parallele3__Group_20__2 )
            // InternalMyTurtleDsl.g:8483:2: rule__Parallele3__Group_20__1__Impl rule__Parallele3__Group_20__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalMyTurtleDsl.g:8490:1: rule__Parallele3__Group_20__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_20__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8494:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:8495:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:8495:1: ( '&' )
            // InternalMyTurtleDsl.g:8496:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_20_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:8505:1: rule__Parallele3__Group_20__2 : rule__Parallele3__Group_20__2__Impl rule__Parallele3__Group_20__3 ;
    public final void rule__Parallele3__Group_20__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8509:1: ( rule__Parallele3__Group_20__2__Impl rule__Parallele3__Group_20__3 )
            // InternalMyTurtleDsl.g:8510:2: rule__Parallele3__Group_20__2__Impl rule__Parallele3__Group_20__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:8517:1: rule__Parallele3__Group_20__2__Impl : ( ( rule__Parallele3__BAssignment_20_2 ) ) ;
    public final void rule__Parallele3__Group_20__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8521:1: ( ( ( rule__Parallele3__BAssignment_20_2 ) ) )
            // InternalMyTurtleDsl.g:8522:1: ( ( rule__Parallele3__BAssignment_20_2 ) )
            {
            // InternalMyTurtleDsl.g:8522:1: ( ( rule__Parallele3__BAssignment_20_2 ) )
            // InternalMyTurtleDsl.g:8523:2: ( rule__Parallele3__BAssignment_20_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_20_2()); 
            // InternalMyTurtleDsl.g:8524:2: ( rule__Parallele3__BAssignment_20_2 )
            // InternalMyTurtleDsl.g:8524:3: rule__Parallele3__BAssignment_20_2
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
    // InternalMyTurtleDsl.g:8532:1: rule__Parallele3__Group_20__3 : rule__Parallele3__Group_20__3__Impl rule__Parallele3__Group_20__4 ;
    public final void rule__Parallele3__Group_20__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8536:1: ( rule__Parallele3__Group_20__3__Impl rule__Parallele3__Group_20__4 )
            // InternalMyTurtleDsl.g:8537:2: rule__Parallele3__Group_20__3__Impl rule__Parallele3__Group_20__4
            {
            pushFollow(FOLLOW_36);
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
    // InternalMyTurtleDsl.g:8544:1: rule__Parallele3__Group_20__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_20__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8548:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:8549:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:8549:1: ( '&' )
            // InternalMyTurtleDsl.g:8550:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_20_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:8559:1: rule__Parallele3__Group_20__4 : rule__Parallele3__Group_20__4__Impl ;
    public final void rule__Parallele3__Group_20__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8563:1: ( rule__Parallele3__Group_20__4__Impl )
            // InternalMyTurtleDsl.g:8564:2: rule__Parallele3__Group_20__4__Impl
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
    // InternalMyTurtleDsl.g:8570:1: rule__Parallele3__Group_20__4__Impl : ( ( rule__Parallele3__CAssignment_20_4 ) ) ;
    public final void rule__Parallele3__Group_20__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8574:1: ( ( ( rule__Parallele3__CAssignment_20_4 ) ) )
            // InternalMyTurtleDsl.g:8575:1: ( ( rule__Parallele3__CAssignment_20_4 ) )
            {
            // InternalMyTurtleDsl.g:8575:1: ( ( rule__Parallele3__CAssignment_20_4 ) )
            // InternalMyTurtleDsl.g:8576:2: ( rule__Parallele3__CAssignment_20_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_20_4()); 
            // InternalMyTurtleDsl.g:8577:2: ( rule__Parallele3__CAssignment_20_4 )
            // InternalMyTurtleDsl.g:8577:3: rule__Parallele3__CAssignment_20_4
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
    // InternalMyTurtleDsl.g:8586:1: rule__Parallele3__Group_21__0 : rule__Parallele3__Group_21__0__Impl rule__Parallele3__Group_21__1 ;
    public final void rule__Parallele3__Group_21__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8590:1: ( rule__Parallele3__Group_21__0__Impl rule__Parallele3__Group_21__1 )
            // InternalMyTurtleDsl.g:8591:2: rule__Parallele3__Group_21__0__Impl rule__Parallele3__Group_21__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:8598:1: rule__Parallele3__Group_21__0__Impl : ( ( rule__Parallele3__AAssignment_21_0 ) ) ;
    public final void rule__Parallele3__Group_21__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8602:1: ( ( ( rule__Parallele3__AAssignment_21_0 ) ) )
            // InternalMyTurtleDsl.g:8603:1: ( ( rule__Parallele3__AAssignment_21_0 ) )
            {
            // InternalMyTurtleDsl.g:8603:1: ( ( rule__Parallele3__AAssignment_21_0 ) )
            // InternalMyTurtleDsl.g:8604:2: ( rule__Parallele3__AAssignment_21_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_21_0()); 
            // InternalMyTurtleDsl.g:8605:2: ( rule__Parallele3__AAssignment_21_0 )
            // InternalMyTurtleDsl.g:8605:3: rule__Parallele3__AAssignment_21_0
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
    // InternalMyTurtleDsl.g:8613:1: rule__Parallele3__Group_21__1 : rule__Parallele3__Group_21__1__Impl rule__Parallele3__Group_21__2 ;
    public final void rule__Parallele3__Group_21__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8617:1: ( rule__Parallele3__Group_21__1__Impl rule__Parallele3__Group_21__2 )
            // InternalMyTurtleDsl.g:8618:2: rule__Parallele3__Group_21__1__Impl rule__Parallele3__Group_21__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalMyTurtleDsl.g:8625:1: rule__Parallele3__Group_21__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_21__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8629:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:8630:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:8630:1: ( '&' )
            // InternalMyTurtleDsl.g:8631:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_21_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:8640:1: rule__Parallele3__Group_21__2 : rule__Parallele3__Group_21__2__Impl rule__Parallele3__Group_21__3 ;
    public final void rule__Parallele3__Group_21__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8644:1: ( rule__Parallele3__Group_21__2__Impl rule__Parallele3__Group_21__3 )
            // InternalMyTurtleDsl.g:8645:2: rule__Parallele3__Group_21__2__Impl rule__Parallele3__Group_21__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:8652:1: rule__Parallele3__Group_21__2__Impl : ( ( rule__Parallele3__BAssignment_21_2 ) ) ;
    public final void rule__Parallele3__Group_21__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8656:1: ( ( ( rule__Parallele3__BAssignment_21_2 ) ) )
            // InternalMyTurtleDsl.g:8657:1: ( ( rule__Parallele3__BAssignment_21_2 ) )
            {
            // InternalMyTurtleDsl.g:8657:1: ( ( rule__Parallele3__BAssignment_21_2 ) )
            // InternalMyTurtleDsl.g:8658:2: ( rule__Parallele3__BAssignment_21_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_21_2()); 
            // InternalMyTurtleDsl.g:8659:2: ( rule__Parallele3__BAssignment_21_2 )
            // InternalMyTurtleDsl.g:8659:3: rule__Parallele3__BAssignment_21_2
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
    // InternalMyTurtleDsl.g:8667:1: rule__Parallele3__Group_21__3 : rule__Parallele3__Group_21__3__Impl rule__Parallele3__Group_21__4 ;
    public final void rule__Parallele3__Group_21__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8671:1: ( rule__Parallele3__Group_21__3__Impl rule__Parallele3__Group_21__4 )
            // InternalMyTurtleDsl.g:8672:2: rule__Parallele3__Group_21__3__Impl rule__Parallele3__Group_21__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyTurtleDsl.g:8679:1: rule__Parallele3__Group_21__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_21__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8683:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:8684:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:8684:1: ( '&' )
            // InternalMyTurtleDsl.g:8685:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_21_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:8694:1: rule__Parallele3__Group_21__4 : rule__Parallele3__Group_21__4__Impl ;
    public final void rule__Parallele3__Group_21__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8698:1: ( rule__Parallele3__Group_21__4__Impl )
            // InternalMyTurtleDsl.g:8699:2: rule__Parallele3__Group_21__4__Impl
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
    // InternalMyTurtleDsl.g:8705:1: rule__Parallele3__Group_21__4__Impl : ( ( rule__Parallele3__CAssignment_21_4 ) ) ;
    public final void rule__Parallele3__Group_21__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8709:1: ( ( ( rule__Parallele3__CAssignment_21_4 ) ) )
            // InternalMyTurtleDsl.g:8710:1: ( ( rule__Parallele3__CAssignment_21_4 ) )
            {
            // InternalMyTurtleDsl.g:8710:1: ( ( rule__Parallele3__CAssignment_21_4 ) )
            // InternalMyTurtleDsl.g:8711:2: ( rule__Parallele3__CAssignment_21_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_21_4()); 
            // InternalMyTurtleDsl.g:8712:2: ( rule__Parallele3__CAssignment_21_4 )
            // InternalMyTurtleDsl.g:8712:3: rule__Parallele3__CAssignment_21_4
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
    // InternalMyTurtleDsl.g:8721:1: rule__Parallele3__Group_22__0 : rule__Parallele3__Group_22__0__Impl rule__Parallele3__Group_22__1 ;
    public final void rule__Parallele3__Group_22__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8725:1: ( rule__Parallele3__Group_22__0__Impl rule__Parallele3__Group_22__1 )
            // InternalMyTurtleDsl.g:8726:2: rule__Parallele3__Group_22__0__Impl rule__Parallele3__Group_22__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:8733:1: rule__Parallele3__Group_22__0__Impl : ( ( rule__Parallele3__AAssignment_22_0 ) ) ;
    public final void rule__Parallele3__Group_22__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8737:1: ( ( ( rule__Parallele3__AAssignment_22_0 ) ) )
            // InternalMyTurtleDsl.g:8738:1: ( ( rule__Parallele3__AAssignment_22_0 ) )
            {
            // InternalMyTurtleDsl.g:8738:1: ( ( rule__Parallele3__AAssignment_22_0 ) )
            // InternalMyTurtleDsl.g:8739:2: ( rule__Parallele3__AAssignment_22_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_22_0()); 
            // InternalMyTurtleDsl.g:8740:2: ( rule__Parallele3__AAssignment_22_0 )
            // InternalMyTurtleDsl.g:8740:3: rule__Parallele3__AAssignment_22_0
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
    // InternalMyTurtleDsl.g:8748:1: rule__Parallele3__Group_22__1 : rule__Parallele3__Group_22__1__Impl rule__Parallele3__Group_22__2 ;
    public final void rule__Parallele3__Group_22__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8752:1: ( rule__Parallele3__Group_22__1__Impl rule__Parallele3__Group_22__2 )
            // InternalMyTurtleDsl.g:8753:2: rule__Parallele3__Group_22__1__Impl rule__Parallele3__Group_22__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyTurtleDsl.g:8760:1: rule__Parallele3__Group_22__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_22__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8764:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:8765:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:8765:1: ( '&' )
            // InternalMyTurtleDsl.g:8766:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_22_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:8775:1: rule__Parallele3__Group_22__2 : rule__Parallele3__Group_22__2__Impl rule__Parallele3__Group_22__3 ;
    public final void rule__Parallele3__Group_22__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8779:1: ( rule__Parallele3__Group_22__2__Impl rule__Parallele3__Group_22__3 )
            // InternalMyTurtleDsl.g:8780:2: rule__Parallele3__Group_22__2__Impl rule__Parallele3__Group_22__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:8787:1: rule__Parallele3__Group_22__2__Impl : ( ( rule__Parallele3__BAssignment_22_2 ) ) ;
    public final void rule__Parallele3__Group_22__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8791:1: ( ( ( rule__Parallele3__BAssignment_22_2 ) ) )
            // InternalMyTurtleDsl.g:8792:1: ( ( rule__Parallele3__BAssignment_22_2 ) )
            {
            // InternalMyTurtleDsl.g:8792:1: ( ( rule__Parallele3__BAssignment_22_2 ) )
            // InternalMyTurtleDsl.g:8793:2: ( rule__Parallele3__BAssignment_22_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_22_2()); 
            // InternalMyTurtleDsl.g:8794:2: ( rule__Parallele3__BAssignment_22_2 )
            // InternalMyTurtleDsl.g:8794:3: rule__Parallele3__BAssignment_22_2
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
    // InternalMyTurtleDsl.g:8802:1: rule__Parallele3__Group_22__3 : rule__Parallele3__Group_22__3__Impl rule__Parallele3__Group_22__4 ;
    public final void rule__Parallele3__Group_22__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8806:1: ( rule__Parallele3__Group_22__3__Impl rule__Parallele3__Group_22__4 )
            // InternalMyTurtleDsl.g:8807:2: rule__Parallele3__Group_22__3__Impl rule__Parallele3__Group_22__4
            {
            pushFollow(FOLLOW_38);
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
    // InternalMyTurtleDsl.g:8814:1: rule__Parallele3__Group_22__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_22__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8818:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:8819:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:8819:1: ( '&' )
            // InternalMyTurtleDsl.g:8820:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_22_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:8829:1: rule__Parallele3__Group_22__4 : rule__Parallele3__Group_22__4__Impl ;
    public final void rule__Parallele3__Group_22__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8833:1: ( rule__Parallele3__Group_22__4__Impl )
            // InternalMyTurtleDsl.g:8834:2: rule__Parallele3__Group_22__4__Impl
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
    // InternalMyTurtleDsl.g:8840:1: rule__Parallele3__Group_22__4__Impl : ( ( rule__Parallele3__CAssignment_22_4 ) ) ;
    public final void rule__Parallele3__Group_22__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8844:1: ( ( ( rule__Parallele3__CAssignment_22_4 ) ) )
            // InternalMyTurtleDsl.g:8845:1: ( ( rule__Parallele3__CAssignment_22_4 ) )
            {
            // InternalMyTurtleDsl.g:8845:1: ( ( rule__Parallele3__CAssignment_22_4 ) )
            // InternalMyTurtleDsl.g:8846:2: ( rule__Parallele3__CAssignment_22_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_22_4()); 
            // InternalMyTurtleDsl.g:8847:2: ( rule__Parallele3__CAssignment_22_4 )
            // InternalMyTurtleDsl.g:8847:3: rule__Parallele3__CAssignment_22_4
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
    // InternalMyTurtleDsl.g:8856:1: rule__Parallele3__Group_23__0 : rule__Parallele3__Group_23__0__Impl rule__Parallele3__Group_23__1 ;
    public final void rule__Parallele3__Group_23__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8860:1: ( rule__Parallele3__Group_23__0__Impl rule__Parallele3__Group_23__1 )
            // InternalMyTurtleDsl.g:8861:2: rule__Parallele3__Group_23__0__Impl rule__Parallele3__Group_23__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:8868:1: rule__Parallele3__Group_23__0__Impl : ( ( rule__Parallele3__AAssignment_23_0 ) ) ;
    public final void rule__Parallele3__Group_23__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8872:1: ( ( ( rule__Parallele3__AAssignment_23_0 ) ) )
            // InternalMyTurtleDsl.g:8873:1: ( ( rule__Parallele3__AAssignment_23_0 ) )
            {
            // InternalMyTurtleDsl.g:8873:1: ( ( rule__Parallele3__AAssignment_23_0 ) )
            // InternalMyTurtleDsl.g:8874:2: ( rule__Parallele3__AAssignment_23_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_23_0()); 
            // InternalMyTurtleDsl.g:8875:2: ( rule__Parallele3__AAssignment_23_0 )
            // InternalMyTurtleDsl.g:8875:3: rule__Parallele3__AAssignment_23_0
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
    // InternalMyTurtleDsl.g:8883:1: rule__Parallele3__Group_23__1 : rule__Parallele3__Group_23__1__Impl rule__Parallele3__Group_23__2 ;
    public final void rule__Parallele3__Group_23__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8887:1: ( rule__Parallele3__Group_23__1__Impl rule__Parallele3__Group_23__2 )
            // InternalMyTurtleDsl.g:8888:2: rule__Parallele3__Group_23__1__Impl rule__Parallele3__Group_23__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyTurtleDsl.g:8895:1: rule__Parallele3__Group_23__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_23__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8899:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:8900:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:8900:1: ( '&' )
            // InternalMyTurtleDsl.g:8901:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_23_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:8910:1: rule__Parallele3__Group_23__2 : rule__Parallele3__Group_23__2__Impl rule__Parallele3__Group_23__3 ;
    public final void rule__Parallele3__Group_23__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8914:1: ( rule__Parallele3__Group_23__2__Impl rule__Parallele3__Group_23__3 )
            // InternalMyTurtleDsl.g:8915:2: rule__Parallele3__Group_23__2__Impl rule__Parallele3__Group_23__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyTurtleDsl.g:8922:1: rule__Parallele3__Group_23__2__Impl : ( ( rule__Parallele3__BAssignment_23_2 ) ) ;
    public final void rule__Parallele3__Group_23__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8926:1: ( ( ( rule__Parallele3__BAssignment_23_2 ) ) )
            // InternalMyTurtleDsl.g:8927:1: ( ( rule__Parallele3__BAssignment_23_2 ) )
            {
            // InternalMyTurtleDsl.g:8927:1: ( ( rule__Parallele3__BAssignment_23_2 ) )
            // InternalMyTurtleDsl.g:8928:2: ( rule__Parallele3__BAssignment_23_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_23_2()); 
            // InternalMyTurtleDsl.g:8929:2: ( rule__Parallele3__BAssignment_23_2 )
            // InternalMyTurtleDsl.g:8929:3: rule__Parallele3__BAssignment_23_2
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
    // InternalMyTurtleDsl.g:8937:1: rule__Parallele3__Group_23__3 : rule__Parallele3__Group_23__3__Impl rule__Parallele3__Group_23__4 ;
    public final void rule__Parallele3__Group_23__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8941:1: ( rule__Parallele3__Group_23__3__Impl rule__Parallele3__Group_23__4 )
            // InternalMyTurtleDsl.g:8942:2: rule__Parallele3__Group_23__3__Impl rule__Parallele3__Group_23__4
            {
            pushFollow(FOLLOW_36);
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
    // InternalMyTurtleDsl.g:8949:1: rule__Parallele3__Group_23__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_23__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8953:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:8954:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:8954:1: ( '&' )
            // InternalMyTurtleDsl.g:8955:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_23_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:8964:1: rule__Parallele3__Group_23__4 : rule__Parallele3__Group_23__4__Impl ;
    public final void rule__Parallele3__Group_23__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8968:1: ( rule__Parallele3__Group_23__4__Impl )
            // InternalMyTurtleDsl.g:8969:2: rule__Parallele3__Group_23__4__Impl
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
    // InternalMyTurtleDsl.g:8975:1: rule__Parallele3__Group_23__4__Impl : ( ( rule__Parallele3__CAssignment_23_4 ) ) ;
    public final void rule__Parallele3__Group_23__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8979:1: ( ( ( rule__Parallele3__CAssignment_23_4 ) ) )
            // InternalMyTurtleDsl.g:8980:1: ( ( rule__Parallele3__CAssignment_23_4 ) )
            {
            // InternalMyTurtleDsl.g:8980:1: ( ( rule__Parallele3__CAssignment_23_4 ) )
            // InternalMyTurtleDsl.g:8981:2: ( rule__Parallele3__CAssignment_23_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_23_4()); 
            // InternalMyTurtleDsl.g:8982:2: ( rule__Parallele3__CAssignment_23_4 )
            // InternalMyTurtleDsl.g:8982:3: rule__Parallele3__CAssignment_23_4
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


    // $ANTLR start "rule__Model__ImportsAssignment_0"
    // InternalMyTurtleDsl.g:8991:1: rule__Model__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8995:1: ( ( ruleImport ) )
            // InternalMyTurtleDsl.g:8996:2: ( ruleImport )
            {
            // InternalMyTurtleDsl.g:8996:2: ( ruleImport )
            // InternalMyTurtleDsl.g:8997:3: ruleImport
            {
             before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ImportsAssignment_0"


    // $ANTLR start "rule__Model__PvhmAssignment_2"
    // InternalMyTurtleDsl.g:9006:1: rule__Model__PvhmAssignment_2 : ( rulePourcent_vitesse_hauteur_max ) ;
    public final void rule__Model__PvhmAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9010:1: ( ( rulePourcent_vitesse_hauteur_max ) )
            // InternalMyTurtleDsl.g:9011:2: ( rulePourcent_vitesse_hauteur_max )
            {
            // InternalMyTurtleDsl.g:9011:2: ( rulePourcent_vitesse_hauteur_max )
            // InternalMyTurtleDsl.g:9012:3: rulePourcent_vitesse_hauteur_max
            {
             before(grammarAccess.getModelAccess().getPvhmPourcent_vitesse_hauteur_maxParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePourcent_vitesse_hauteur_max();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPvhmPourcent_vitesse_hauteur_maxParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PvhmAssignment_2"


    // $ANTLR start "rule__Model__PvdmAssignment_4"
    // InternalMyTurtleDsl.g:9021:1: rule__Model__PvdmAssignment_4 : ( rulePourcent_vitesse_deplacement_max ) ;
    public final void rule__Model__PvdmAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9025:1: ( ( rulePourcent_vitesse_deplacement_max ) )
            // InternalMyTurtleDsl.g:9026:2: ( rulePourcent_vitesse_deplacement_max )
            {
            // InternalMyTurtleDsl.g:9026:2: ( rulePourcent_vitesse_deplacement_max )
            // InternalMyTurtleDsl.g:9027:3: rulePourcent_vitesse_deplacement_max
            {
             before(grammarAccess.getModelAccess().getPvdmPourcent_vitesse_deplacement_maxParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePourcent_vitesse_deplacement_max();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPvdmPourcent_vitesse_deplacement_maxParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PvdmAssignment_4"


    // $ANTLR start "rule__Model__PvrmAssignment_6"
    // InternalMyTurtleDsl.g:9036:1: rule__Model__PvrmAssignment_6 : ( rulePourcent_vitesse_rotation_max ) ;
    public final void rule__Model__PvrmAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9040:1: ( ( rulePourcent_vitesse_rotation_max ) )
            // InternalMyTurtleDsl.g:9041:2: ( rulePourcent_vitesse_rotation_max )
            {
            // InternalMyTurtleDsl.g:9041:2: ( rulePourcent_vitesse_rotation_max )
            // InternalMyTurtleDsl.g:9042:3: rulePourcent_vitesse_rotation_max
            {
             before(grammarAccess.getModelAccess().getPvrmPourcent_vitesse_rotation_maxParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePourcent_vitesse_rotation_max();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPvrmPourcent_vitesse_rotation_maxParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PvrmAssignment_6"


    // $ANTLR start "rule__Model__HmAssignment_8"
    // InternalMyTurtleDsl.g:9051:1: rule__Model__HmAssignment_8 : ( ruleHauteur_max ) ;
    public final void rule__Model__HmAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9055:1: ( ( ruleHauteur_max ) )
            // InternalMyTurtleDsl.g:9056:2: ( ruleHauteur_max )
            {
            // InternalMyTurtleDsl.g:9056:2: ( ruleHauteur_max )
            // InternalMyTurtleDsl.g:9057:3: ruleHauteur_max
            {
             before(grammarAccess.getModelAccess().getHmHauteur_maxParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleHauteur_max();

            state._fsp--;

             after(grammarAccess.getModelAccess().getHmHauteur_maxParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__HmAssignment_8"


    // $ANTLR start "rule__Model__EmAssignment_10"
    // InternalMyTurtleDsl.g:9066:1: rule__Model__EmAssignment_10 : ( ruleEloignement_max ) ;
    public final void rule__Model__EmAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9070:1: ( ( ruleEloignement_max ) )
            // InternalMyTurtleDsl.g:9071:2: ( ruleEloignement_max )
            {
            // InternalMyTurtleDsl.g:9071:2: ( ruleEloignement_max )
            // InternalMyTurtleDsl.g:9072:3: ruleEloignement_max
            {
             before(grammarAccess.getModelAccess().getEmEloignement_maxParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleEloignement_max();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEmEloignement_maxParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__EmAssignment_10"


    // $ANTLR start "rule__Model__MAssignment_12"
    // InternalMyTurtleDsl.g:9081:1: rule__Model__MAssignment_12 : ( ruleMain ) ;
    public final void rule__Model__MAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9085:1: ( ( ruleMain ) )
            // InternalMyTurtleDsl.g:9086:2: ( ruleMain )
            {
            // InternalMyTurtleDsl.g:9086:2: ( ruleMain )
            // InternalMyTurtleDsl.g:9087:3: ruleMain
            {
             before(grammarAccess.getModelAccess().getMMainParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleMain();

            state._fsp--;

             after(grammarAccess.getModelAccess().getMMainParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__MAssignment_12"


    // $ANTLR start "rule__Model__FonctionsAssignment_13"
    // InternalMyTurtleDsl.g:9096:1: rule__Model__FonctionsAssignment_13 : ( ruleFonctionDecl ) ;
    public final void rule__Model__FonctionsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9100:1: ( ( ruleFonctionDecl ) )
            // InternalMyTurtleDsl.g:9101:2: ( ruleFonctionDecl )
            {
            // InternalMyTurtleDsl.g:9101:2: ( ruleFonctionDecl )
            // InternalMyTurtleDsl.g:9102:3: ruleFonctionDecl
            {
             before(grammarAccess.getModelAccess().getFonctionsFonctionDeclParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleFonctionDecl();

            state._fsp--;

             after(grammarAccess.getModelAccess().getFonctionsFonctionDeclParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__FonctionsAssignment_13"


    // $ANTLR start "rule__Main__SeconDecAssignment_4_0"
    // InternalMyTurtleDsl.g:9111:1: rule__Main__SeconDecAssignment_4_0 : ( ruleIntDecl ) ;
    public final void rule__Main__SeconDecAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9115:1: ( ( ruleIntDecl ) )
            // InternalMyTurtleDsl.g:9116:2: ( ruleIntDecl )
            {
            // InternalMyTurtleDsl.g:9116:2: ( ruleIntDecl )
            // InternalMyTurtleDsl.g:9117:3: ruleIntDecl
            {
             before(grammarAccess.getMainAccess().getSeconDecIntDeclParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleIntDecl();

            state._fsp--;

             after(grammarAccess.getMainAccess().getSeconDecIntDeclParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__SeconDecAssignment_4_0"


    // $ANTLR start "rule__Main__PourDecAssignment_4_1"
    // InternalMyTurtleDsl.g:9126:1: rule__Main__PourDecAssignment_4_1 : ( rulePourcentDecl ) ;
    public final void rule__Main__PourDecAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9130:1: ( ( rulePourcentDecl ) )
            // InternalMyTurtleDsl.g:9131:2: ( rulePourcentDecl )
            {
            // InternalMyTurtleDsl.g:9131:2: ( rulePourcentDecl )
            // InternalMyTurtleDsl.g:9132:3: rulePourcentDecl
            {
             before(grammarAccess.getMainAccess().getPourDecPourcentDeclParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            rulePourcentDecl();

            state._fsp--;

             after(grammarAccess.getMainAccess().getPourDecPourcentDeclParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__PourDecAssignment_4_1"


    // $ANTLR start "rule__Main__StatementsAssignment_4_2"
    // InternalMyTurtleDsl.g:9141:1: rule__Main__StatementsAssignment_4_2 : ( ruleStatement ) ;
    public final void rule__Main__StatementsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9145:1: ( ( ruleStatement ) )
            // InternalMyTurtleDsl.g:9146:2: ( ruleStatement )
            {
            // InternalMyTurtleDsl.g:9146:2: ( ruleStatement )
            // InternalMyTurtleDsl.g:9147:3: ruleStatement
            {
             before(grammarAccess.getMainAccess().getStatementsStatementParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getMainAccess().getStatementsStatementParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__StatementsAssignment_4_2"


    // $ANTLR start "rule__Main__FonctionsAssignment_4_3"
    // InternalMyTurtleDsl.g:9156:1: rule__Main__FonctionsAssignment_4_3 : ( ruleFonctionCall ) ;
    public final void rule__Main__FonctionsAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9160:1: ( ( ruleFonctionCall ) )
            // InternalMyTurtleDsl.g:9161:2: ( ruleFonctionCall )
            {
            // InternalMyTurtleDsl.g:9161:2: ( ruleFonctionCall )
            // InternalMyTurtleDsl.g:9162:3: ruleFonctionCall
            {
             before(grammarAccess.getMainAccess().getFonctionsFonctionCallParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFonctionCall();

            state._fsp--;

             after(grammarAccess.getMainAccess().getFonctionsFonctionCallParserRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__FonctionsAssignment_4_3"


    // $ANTLR start "rule__Main__ParalleleAssignment_4_4"
    // InternalMyTurtleDsl.g:9171:1: rule__Main__ParalleleAssignment_4_4 : ( ( rule__Main__ParalleleAlternatives_4_4_0 ) ) ;
    public final void rule__Main__ParalleleAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9175:1: ( ( ( rule__Main__ParalleleAlternatives_4_4_0 ) ) )
            // InternalMyTurtleDsl.g:9176:2: ( ( rule__Main__ParalleleAlternatives_4_4_0 ) )
            {
            // InternalMyTurtleDsl.g:9176:2: ( ( rule__Main__ParalleleAlternatives_4_4_0 ) )
            // InternalMyTurtleDsl.g:9177:3: ( rule__Main__ParalleleAlternatives_4_4_0 )
            {
             before(grammarAccess.getMainAccess().getParalleleAlternatives_4_4_0()); 
            // InternalMyTurtleDsl.g:9178:3: ( rule__Main__ParalleleAlternatives_4_4_0 )
            // InternalMyTurtleDsl.g:9178:4: rule__Main__ParalleleAlternatives_4_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Main__ParalleleAlternatives_4_4_0();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getParalleleAlternatives_4_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__ParalleleAssignment_4_4"


    // $ANTLR start "rule__PourcentConst__ValAssignment"
    // InternalMyTurtleDsl.g:9186:1: rule__PourcentConst__ValAssignment : ( RULE_POURCENT ) ;
    public final void rule__PourcentConst__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9190:1: ( ( RULE_POURCENT ) )
            // InternalMyTurtleDsl.g:9191:2: ( RULE_POURCENT )
            {
            // InternalMyTurtleDsl.g:9191:2: ( RULE_POURCENT )
            // InternalMyTurtleDsl.g:9192:3: RULE_POURCENT
            {
             before(grammarAccess.getPourcentConstAccess().getValPOURCENTTerminalRuleCall_0()); 
            match(input,RULE_POURCENT,FOLLOW_2); 
             after(grammarAccess.getPourcentConstAccess().getValPOURCENTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PourcentConst__ValAssignment"


    // $ANTLR start "rule__Import__ImportURIAssignment_2"
    // InternalMyTurtleDsl.g:9201:1: rule__Import__ImportURIAssignment_2 : ( RULE_INCLUDE ) ;
    public final void rule__Import__ImportURIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9205:1: ( ( RULE_INCLUDE ) )
            // InternalMyTurtleDsl.g:9206:2: ( RULE_INCLUDE )
            {
            // InternalMyTurtleDsl.g:9206:2: ( RULE_INCLUDE )
            // InternalMyTurtleDsl.g:9207:3: RULE_INCLUDE
            {
             before(grammarAccess.getImportAccess().getImportURIINCLUDETerminalRuleCall_2_0()); 
            match(input,RULE_INCLUDE,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportURIINCLUDETerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportURIAssignment_2"


    // $ANTLR start "rule__Pourcent_vitesse_hauteur_max__Vitesse_verticaleAssignment_2"
    // InternalMyTurtleDsl.g:9216:1: rule__Pourcent_vitesse_hauteur_max__Vitesse_verticaleAssignment_2 : ( rulePourcentConst ) ;
    public final void rule__Pourcent_vitesse_hauteur_max__Vitesse_verticaleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9220:1: ( ( rulePourcentConst ) )
            // InternalMyTurtleDsl.g:9221:2: ( rulePourcentConst )
            {
            // InternalMyTurtleDsl.g:9221:2: ( rulePourcentConst )
            // InternalMyTurtleDsl.g:9222:3: rulePourcentConst
            {
             before(grammarAccess.getPourcent_vitesse_hauteur_maxAccess().getVitesse_verticalePourcentConstParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePourcentConst();

            state._fsp--;

             after(grammarAccess.getPourcent_vitesse_hauteur_maxAccess().getVitesse_verticalePourcentConstParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalMyTurtleDsl.g:9231:1: rule__Pourcent_vitesse_deplacement_max__Vitesse_deplacementAssignment_2 : ( rulePourcentConst ) ;
    public final void rule__Pourcent_vitesse_deplacement_max__Vitesse_deplacementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9235:1: ( ( rulePourcentConst ) )
            // InternalMyTurtleDsl.g:9236:2: ( rulePourcentConst )
            {
            // InternalMyTurtleDsl.g:9236:2: ( rulePourcentConst )
            // InternalMyTurtleDsl.g:9237:3: rulePourcentConst
            {
             before(grammarAccess.getPourcent_vitesse_deplacement_maxAccess().getVitesse_deplacementPourcentConstParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePourcentConst();

            state._fsp--;

             after(grammarAccess.getPourcent_vitesse_deplacement_maxAccess().getVitesse_deplacementPourcentConstParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalMyTurtleDsl.g:9246:1: rule__Pourcent_vitesse_rotation_max__Vitesse_deplacementAssignment_2 : ( rulePourcentConst ) ;
    public final void rule__Pourcent_vitesse_rotation_max__Vitesse_deplacementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9250:1: ( ( rulePourcentConst ) )
            // InternalMyTurtleDsl.g:9251:2: ( rulePourcentConst )
            {
            // InternalMyTurtleDsl.g:9251:2: ( rulePourcentConst )
            // InternalMyTurtleDsl.g:9252:3: rulePourcentConst
            {
             before(grammarAccess.getPourcent_vitesse_rotation_maxAccess().getVitesse_deplacementPourcentConstParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePourcentConst();

            state._fsp--;

             after(grammarAccess.getPourcent_vitesse_rotation_maxAccess().getVitesse_deplacementPourcentConstParserRuleCall_2_0()); 

            }


            }

        }
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
    // InternalMyTurtleDsl.g:9261:1: rule__Hauteur_max__Hauteur_maxAssignment_2 : ( ruleIntExp ) ;
    public final void rule__Hauteur_max__Hauteur_maxAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9265:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9266:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9266:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9267:3: ruleIntExp
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
    // InternalMyTurtleDsl.g:9276:1: rule__Eloignement_max__Hauteur_maxAssignment_2 : ( ruleIntExp ) ;
    public final void rule__Eloignement_max__Hauteur_maxAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9280:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9281:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9281:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9282:3: ruleIntExp
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
    // InternalMyTurtleDsl.g:9291:1: rule__Monter__DureeAssignment_2 : ( ruleIntExp ) ;
    public final void rule__Monter__DureeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9295:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9296:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9296:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9297:3: ruleIntExp
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
    // InternalMyTurtleDsl.g:9306:1: rule__Monter__Vitesse_verticaleAssignment_4 : ( rulePourcentExp ) ;
    public final void rule__Monter__Vitesse_verticaleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9310:1: ( ( rulePourcentExp ) )
            // InternalMyTurtleDsl.g:9311:2: ( rulePourcentExp )
            {
            // InternalMyTurtleDsl.g:9311:2: ( rulePourcentExp )
            // InternalMyTurtleDsl.g:9312:3: rulePourcentExp
            {
             before(grammarAccess.getMonterAccess().getVitesse_verticalePourcentExpParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePourcentExp();

            state._fsp--;

             after(grammarAccess.getMonterAccess().getVitesse_verticalePourcentExpParserRuleCall_4_0()); 

            }


            }

        }
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
    // InternalMyTurtleDsl.g:9321:1: rule__Descendre__DureeAssignment_2 : ( ruleIntExp ) ;
    public final void rule__Descendre__DureeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9325:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9326:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9326:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9327:3: ruleIntExp
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
    // InternalMyTurtleDsl.g:9336:1: rule__Descendre__Vitesse_verticaleAssignment_4 : ( rulePourcentExp ) ;
    public final void rule__Descendre__Vitesse_verticaleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9340:1: ( ( rulePourcentExp ) )
            // InternalMyTurtleDsl.g:9341:2: ( rulePourcentExp )
            {
            // InternalMyTurtleDsl.g:9341:2: ( rulePourcentExp )
            // InternalMyTurtleDsl.g:9342:3: rulePourcentExp
            {
             before(grammarAccess.getDescendreAccess().getVitesse_verticalePourcentExpParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePourcentExp();

            state._fsp--;

             after(grammarAccess.getDescendreAccess().getVitesse_verticalePourcentExpParserRuleCall_4_0()); 

            }


            }

        }
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
    // InternalMyTurtleDsl.g:9351:1: rule__Avancer__DureeAssignment_2 : ( ruleIntExp ) ;
    public final void rule__Avancer__DureeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9355:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9356:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9356:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9357:3: ruleIntExp
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
    // InternalMyTurtleDsl.g:9366:1: rule__Avancer__Vitesse_deplacementAssignment_4 : ( rulePourcentExp ) ;
    public final void rule__Avancer__Vitesse_deplacementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9370:1: ( ( rulePourcentExp ) )
            // InternalMyTurtleDsl.g:9371:2: ( rulePourcentExp )
            {
            // InternalMyTurtleDsl.g:9371:2: ( rulePourcentExp )
            // InternalMyTurtleDsl.g:9372:3: rulePourcentExp
            {
             before(grammarAccess.getAvancerAccess().getVitesse_deplacementPourcentExpParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePourcentExp();

            state._fsp--;

             after(grammarAccess.getAvancerAccess().getVitesse_deplacementPourcentExpParserRuleCall_4_0()); 

            }


            }

        }
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
    // InternalMyTurtleDsl.g:9381:1: rule__Reculer__DureeAssignment_2 : ( ruleIntExp ) ;
    public final void rule__Reculer__DureeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9385:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9386:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9386:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9387:3: ruleIntExp
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
    // InternalMyTurtleDsl.g:9396:1: rule__Reculer__Vitesse_deplacementAssignment_4 : ( rulePourcentExp ) ;
    public final void rule__Reculer__Vitesse_deplacementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9400:1: ( ( rulePourcentExp ) )
            // InternalMyTurtleDsl.g:9401:2: ( rulePourcentExp )
            {
            // InternalMyTurtleDsl.g:9401:2: ( rulePourcentExp )
            // InternalMyTurtleDsl.g:9402:3: rulePourcentExp
            {
             before(grammarAccess.getReculerAccess().getVitesse_deplacementPourcentExpParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePourcentExp();

            state._fsp--;

             after(grammarAccess.getReculerAccess().getVitesse_deplacementPourcentExpParserRuleCall_4_0()); 

            }


            }

        }
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
    // InternalMyTurtleDsl.g:9411:1: rule__Gauche__DureeAssignment_2 : ( ruleIntExp ) ;
    public final void rule__Gauche__DureeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9415:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9416:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9416:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9417:3: ruleIntExp
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
    // InternalMyTurtleDsl.g:9426:1: rule__Gauche__Vitesse_deplacementAssignment_4 : ( rulePourcentExp ) ;
    public final void rule__Gauche__Vitesse_deplacementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9430:1: ( ( rulePourcentExp ) )
            // InternalMyTurtleDsl.g:9431:2: ( rulePourcentExp )
            {
            // InternalMyTurtleDsl.g:9431:2: ( rulePourcentExp )
            // InternalMyTurtleDsl.g:9432:3: rulePourcentExp
            {
             before(grammarAccess.getGaucheAccess().getVitesse_deplacementPourcentExpParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePourcentExp();

            state._fsp--;

             after(grammarAccess.getGaucheAccess().getVitesse_deplacementPourcentExpParserRuleCall_4_0()); 

            }


            }

        }
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
    // InternalMyTurtleDsl.g:9441:1: rule__Droite__DureeAssignment_2 : ( ruleIntExp ) ;
    public final void rule__Droite__DureeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9445:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9446:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9446:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9447:3: ruleIntExp
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
    // InternalMyTurtleDsl.g:9456:1: rule__Droite__Vitesse_deplacementAssignment_4 : ( rulePourcentExp ) ;
    public final void rule__Droite__Vitesse_deplacementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9460:1: ( ( rulePourcentExp ) )
            // InternalMyTurtleDsl.g:9461:2: ( rulePourcentExp )
            {
            // InternalMyTurtleDsl.g:9461:2: ( rulePourcentExp )
            // InternalMyTurtleDsl.g:9462:3: rulePourcentExp
            {
             before(grammarAccess.getDroiteAccess().getVitesse_deplacementPourcentExpParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePourcentExp();

            state._fsp--;

             after(grammarAccess.getDroiteAccess().getVitesse_deplacementPourcentExpParserRuleCall_4_0()); 

            }


            }

        }
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
    // InternalMyTurtleDsl.g:9471:1: rule__Pause__DureeAssignment_2 : ( ruleIntExp ) ;
    public final void rule__Pause__DureeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9475:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9476:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9476:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9477:3: ruleIntExp
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
    // InternalMyTurtleDsl.g:9486:1: rule__RotationGauche__DureeAssignment_2 : ( ruleIntExp ) ;
    public final void rule__RotationGauche__DureeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9490:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9491:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9491:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9492:3: ruleIntExp
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
    // InternalMyTurtleDsl.g:9501:1: rule__RotationGauche__Vitesse_rotationAssignment_4 : ( rulePourcentExp ) ;
    public final void rule__RotationGauche__Vitesse_rotationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9505:1: ( ( rulePourcentExp ) )
            // InternalMyTurtleDsl.g:9506:2: ( rulePourcentExp )
            {
            // InternalMyTurtleDsl.g:9506:2: ( rulePourcentExp )
            // InternalMyTurtleDsl.g:9507:3: rulePourcentExp
            {
             before(grammarAccess.getRotationGaucheAccess().getVitesse_rotationPourcentExpParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePourcentExp();

            state._fsp--;

             after(grammarAccess.getRotationGaucheAccess().getVitesse_rotationPourcentExpParserRuleCall_4_0()); 

            }


            }

        }
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
    // InternalMyTurtleDsl.g:9516:1: rule__RotationDroite__DureeAssignment_2 : ( ruleIntExp ) ;
    public final void rule__RotationDroite__DureeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9520:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9521:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9521:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9522:3: ruleIntExp
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
    // InternalMyTurtleDsl.g:9531:1: rule__RotationDroite__Vitesse_rotationAssignment_4 : ( rulePourcentExp ) ;
    public final void rule__RotationDroite__Vitesse_rotationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9535:1: ( ( rulePourcentExp ) )
            // InternalMyTurtleDsl.g:9536:2: ( rulePourcentExp )
            {
            // InternalMyTurtleDsl.g:9536:2: ( rulePourcentExp )
            // InternalMyTurtleDsl.g:9537:3: rulePourcentExp
            {
             before(grammarAccess.getRotationDroiteAccess().getVitesse_rotationPourcentExpParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePourcentExp();

            state._fsp--;

             after(grammarAccess.getRotationDroiteAccess().getVitesse_rotationPourcentExpParserRuleCall_4_0()); 

            }


            }

        }
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
    // InternalMyTurtleDsl.g:9546:1: rule__FonctionDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FonctionDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9550:1: ( ( RULE_ID ) )
            // InternalMyTurtleDsl.g:9551:2: ( RULE_ID )
            {
            // InternalMyTurtleDsl.g:9551:2: ( RULE_ID )
            // InternalMyTurtleDsl.g:9552:3: RULE_ID
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
    // InternalMyTurtleDsl.g:9561:1: rule__FonctionDecl__BodyAssignment_5 : ( ruleStatement ) ;
    public final void rule__FonctionDecl__BodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9565:1: ( ( ruleStatement ) )
            // InternalMyTurtleDsl.g:9566:2: ( ruleStatement )
            {
            // InternalMyTurtleDsl.g:9566:2: ( ruleStatement )
            // InternalMyTurtleDsl.g:9567:3: ruleStatement
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


    // $ANTLR start "rule__PourcentDecl__NameAssignment_1"
    // InternalMyTurtleDsl.g:9576:1: rule__PourcentDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PourcentDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9580:1: ( ( RULE_ID ) )
            // InternalMyTurtleDsl.g:9581:2: ( RULE_ID )
            {
            // InternalMyTurtleDsl.g:9581:2: ( RULE_ID )
            // InternalMyTurtleDsl.g:9582:3: RULE_ID
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
    // InternalMyTurtleDsl.g:9591:1: rule__PourcentDecl__ValAssignment_3 : ( rulePourcentConst ) ;
    public final void rule__PourcentDecl__ValAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9595:1: ( ( rulePourcentConst ) )
            // InternalMyTurtleDsl.g:9596:2: ( rulePourcentConst )
            {
            // InternalMyTurtleDsl.g:9596:2: ( rulePourcentConst )
            // InternalMyTurtleDsl.g:9597:3: rulePourcentConst
            {
             before(grammarAccess.getPourcentDeclAccess().getValPourcentConstParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePourcentConst();

            state._fsp--;

             after(grammarAccess.getPourcentDeclAccess().getValPourcentConstParserRuleCall_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__IntDecl__NameAssignment_1"
    // InternalMyTurtleDsl.g:9606:1: rule__IntDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__IntDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9610:1: ( ( RULE_ID ) )
            // InternalMyTurtleDsl.g:9611:2: ( RULE_ID )
            {
            // InternalMyTurtleDsl.g:9611:2: ( RULE_ID )
            // InternalMyTurtleDsl.g:9612:3: RULE_ID
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
    // InternalMyTurtleDsl.g:9621:1: rule__IntDecl__ValAssignment_3 : ( ruleIntExp ) ;
    public final void rule__IntDecl__ValAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9625:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9626:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9626:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9627:3: ruleIntExp
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


    // $ANTLR start "rule__RefIntVar__VarAssignment"
    // InternalMyTurtleDsl.g:9636:1: rule__RefIntVar__VarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__RefIntVar__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9640:1: ( ( ( RULE_ID ) ) )
            // InternalMyTurtleDsl.g:9641:2: ( ( RULE_ID ) )
            {
            // InternalMyTurtleDsl.g:9641:2: ( ( RULE_ID ) )
            // InternalMyTurtleDsl.g:9642:3: ( RULE_ID )
            {
             before(grammarAccess.getRefIntVarAccess().getVarIntDeclCrossReference_0()); 
            // InternalMyTurtleDsl.g:9643:3: ( RULE_ID )
            // InternalMyTurtleDsl.g:9644:4: RULE_ID
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


    // $ANTLR start "rule__RefPourcentVar__VarAssignment"
    // InternalMyTurtleDsl.g:9655:1: rule__RefPourcentVar__VarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__RefPourcentVar__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9659:1: ( ( ( RULE_ID ) ) )
            // InternalMyTurtleDsl.g:9660:2: ( ( RULE_ID ) )
            {
            // InternalMyTurtleDsl.g:9660:2: ( ( RULE_ID ) )
            // InternalMyTurtleDsl.g:9661:3: ( RULE_ID )
            {
             before(grammarAccess.getRefPourcentVarAccess().getVarPourcentDeclCrossReference_0()); 
            // InternalMyTurtleDsl.g:9662:3: ( RULE_ID )
            // InternalMyTurtleDsl.g:9663:4: RULE_ID
            {
             before(grammarAccess.getRefPourcentVarAccess().getVarPourcentDeclIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRefPourcentVarAccess().getVarPourcentDeclIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getRefPourcentVarAccess().getVarPourcentDeclCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefPourcentVar__VarAssignment"


    // $ANTLR start "rule__IntConstante__ValAssignment"
    // InternalMyTurtleDsl.g:9674:1: rule__IntConstante__ValAssignment : ( RULE_INT ) ;
    public final void rule__IntConstante__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9678:1: ( ( RULE_INT ) )
            // InternalMyTurtleDsl.g:9679:2: ( RULE_INT )
            {
            // InternalMyTurtleDsl.g:9679:2: ( RULE_INT )
            // InternalMyTurtleDsl.g:9680:3: RULE_INT
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


    // $ANTLR start "rule__FonctionCall__FuncAssignment_0"
    // InternalMyTurtleDsl.g:9689:1: rule__FonctionCall__FuncAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FonctionCall__FuncAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9693:1: ( ( ( RULE_ID ) ) )
            // InternalMyTurtleDsl.g:9694:2: ( ( RULE_ID ) )
            {
            // InternalMyTurtleDsl.g:9694:2: ( ( RULE_ID ) )
            // InternalMyTurtleDsl.g:9695:3: ( RULE_ID )
            {
             before(grammarAccess.getFonctionCallAccess().getFuncFonctionDeclCrossReference_0_0()); 
            // InternalMyTurtleDsl.g:9696:3: ( RULE_ID )
            // InternalMyTurtleDsl.g:9697:4: RULE_ID
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
    // InternalMyTurtleDsl.g:9708:1: rule__Parallele2__AAssignment_0_0 : ( ruleMD ) ;
    public final void rule__Parallele2__AAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9712:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:9713:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:9713:2: ( ruleMD )
            // InternalMyTurtleDsl.g:9714:3: ruleMD
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
    // InternalMyTurtleDsl.g:9723:1: rule__Parallele2__TAssignment_0_2 : ( ruleGDr ) ;
    public final void rule__Parallele2__TAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9727:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:9728:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:9728:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:9729:3: ruleGDr
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
    // InternalMyTurtleDsl.g:9738:1: rule__Parallele2__AAssignment_1_0 : ( ruleMD ) ;
    public final void rule__Parallele2__AAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9742:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:9743:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:9743:2: ( ruleMD )
            // InternalMyTurtleDsl.g:9744:3: ruleMD
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
    // InternalMyTurtleDsl.g:9753:1: rule__Parallele2__TAssignment_1_2 : ( ruleAR ) ;
    public final void rule__Parallele2__TAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9757:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:9758:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:9758:2: ( ruleAR )
            // InternalMyTurtleDsl.g:9759:3: ruleAR
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
    // InternalMyTurtleDsl.g:9768:1: rule__Parallele2__AAssignment_2_0 : ( ruleMD ) ;
    public final void rule__Parallele2__AAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9772:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:9773:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:9773:2: ( ruleMD )
            // InternalMyTurtleDsl.g:9774:3: ruleMD
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
    // InternalMyTurtleDsl.g:9783:1: rule__Parallele2__TAssignment_2_2 : ( ruleRGRD ) ;
    public final void rule__Parallele2__TAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9787:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:9788:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:9788:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:9789:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:9798:1: rule__Parallele2__TAssignment_3_0 : ( ruleGDr ) ;
    public final void rule__Parallele2__TAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9802:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:9803:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:9803:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:9804:3: ruleGDr
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
    // InternalMyTurtleDsl.g:9813:1: rule__Parallele2__BAssignment_3_2 : ( ruleAR ) ;
    public final void rule__Parallele2__BAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9817:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:9818:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:9818:2: ( ruleAR )
            // InternalMyTurtleDsl.g:9819:3: ruleAR
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
    // InternalMyTurtleDsl.g:9828:1: rule__Parallele2__TAssignment_4_0 : ( ruleGDr ) ;
    public final void rule__Parallele2__TAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9832:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:9833:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:9833:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:9834:3: ruleGDr
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
    // InternalMyTurtleDsl.g:9843:1: rule__Parallele2__BAssignment_4_2 : ( ruleMD ) ;
    public final void rule__Parallele2__BAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9847:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:9848:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:9848:2: ( ruleMD )
            // InternalMyTurtleDsl.g:9849:3: ruleMD
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
    // InternalMyTurtleDsl.g:9858:1: rule__Parallele2__TAssignment_5_0 : ( ruleGDr ) ;
    public final void rule__Parallele2__TAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9862:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:9863:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:9863:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:9864:3: ruleGDr
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
    // InternalMyTurtleDsl.g:9873:1: rule__Parallele2__BAssignment_5_2 : ( ruleRGRD ) ;
    public final void rule__Parallele2__BAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9877:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:9878:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:9878:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:9879:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:9888:1: rule__Parallele2__TAssignment_6_0 : ( ruleRGRD ) ;
    public final void rule__Parallele2__TAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9892:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:9893:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:9893:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:9894:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:9903:1: rule__Parallele2__AAssignment_6_2 : ( ruleMD ) ;
    public final void rule__Parallele2__AAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9907:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:9908:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:9908:2: ( ruleMD )
            // InternalMyTurtleDsl.g:9909:3: ruleMD
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
    // InternalMyTurtleDsl.g:9918:1: rule__Parallele2__TAssignment_7_0 : ( ruleRGRD ) ;
    public final void rule__Parallele2__TAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9922:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:9923:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:9923:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:9924:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:9933:1: rule__Parallele2__AAssignment_7_2 : ( ruleAR ) ;
    public final void rule__Parallele2__AAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9937:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:9938:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:9938:2: ( ruleAR )
            // InternalMyTurtleDsl.g:9939:3: ruleAR
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
    // InternalMyTurtleDsl.g:9948:1: rule__Parallele2__TAssignment_8_0 : ( ruleRGRD ) ;
    public final void rule__Parallele2__TAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9952:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:9953:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:9953:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:9954:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:9963:1: rule__Parallele2__AAssignment_8_2 : ( ruleGDr ) ;
    public final void rule__Parallele2__AAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9967:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:9968:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:9968:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:9969:3: ruleGDr
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
    // InternalMyTurtleDsl.g:9978:1: rule__Parallele2__TAssignment_9_0 : ( ruleAR ) ;
    public final void rule__Parallele2__TAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9982:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:9983:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:9983:2: ( ruleAR )
            // InternalMyTurtleDsl.g:9984:3: ruleAR
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
    // InternalMyTurtleDsl.g:9993:1: rule__Parallele2__AAssignment_9_2 : ( ruleMD ) ;
    public final void rule__Parallele2__AAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9997:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:9998:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:9998:2: ( ruleMD )
            // InternalMyTurtleDsl.g:9999:3: ruleMD
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
    // InternalMyTurtleDsl.g:10008:1: rule__Parallele2__TAssignment_10_0 : ( ruleAR ) ;
    public final void rule__Parallele2__TAssignment_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10012:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:10013:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:10013:2: ( ruleAR )
            // InternalMyTurtleDsl.g:10014:3: ruleAR
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
    // InternalMyTurtleDsl.g:10023:1: rule__Parallele2__AAssignment_10_2 : ( ruleRGRD ) ;
    public final void rule__Parallele2__AAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10027:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:10028:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:10028:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:10029:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:10038:1: rule__Parallele2__TAssignment_11_0 : ( ruleAR ) ;
    public final void rule__Parallele2__TAssignment_11_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10042:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:10043:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:10043:2: ( ruleAR )
            // InternalMyTurtleDsl.g:10044:3: ruleAR
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
    // InternalMyTurtleDsl.g:10053:1: rule__Parallele2__AAssignment_11_2 : ( ruleGDr ) ;
    public final void rule__Parallele2__AAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10057:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:10058:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:10058:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:10059:3: ruleGDr
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
    // InternalMyTurtleDsl.g:10068:1: rule__Parallele3__AAssignment_0_0 : ( ruleAR ) ;
    public final void rule__Parallele3__AAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10072:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:10073:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:10073:2: ( ruleAR )
            // InternalMyTurtleDsl.g:10074:3: ruleAR
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
    // InternalMyTurtleDsl.g:10083:1: rule__Parallele3__BAssignment_0_2 : ( ruleGDr ) ;
    public final void rule__Parallele3__BAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10087:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:10088:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:10088:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:10089:3: ruleGDr
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
    // InternalMyTurtleDsl.g:10098:1: rule__Parallele3__CAssignment_0_4 : ( ruleMD ) ;
    public final void rule__Parallele3__CAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10102:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:10103:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:10103:2: ( ruleMD )
            // InternalMyTurtleDsl.g:10104:3: ruleMD
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
    // InternalMyTurtleDsl.g:10113:1: rule__Parallele3__AAssignment_1_0 : ( ruleAR ) ;
    public final void rule__Parallele3__AAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10117:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:10118:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:10118:2: ( ruleAR )
            // InternalMyTurtleDsl.g:10119:3: ruleAR
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
    // InternalMyTurtleDsl.g:10128:1: rule__Parallele3__BAssignment_1_2 : ( ruleGDr ) ;
    public final void rule__Parallele3__BAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10132:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:10133:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:10133:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:10134:3: ruleGDr
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
    // InternalMyTurtleDsl.g:10143:1: rule__Parallele3__CAssignment_1_4 : ( ruleRGRD ) ;
    public final void rule__Parallele3__CAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10147:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:10148:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:10148:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:10149:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:10158:1: rule__Parallele3__AAssignment_2_0 : ( ruleAR ) ;
    public final void rule__Parallele3__AAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10162:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:10163:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:10163:2: ( ruleAR )
            // InternalMyTurtleDsl.g:10164:3: ruleAR
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
    // InternalMyTurtleDsl.g:10173:1: rule__Parallele3__BAssignment_2_2 : ( ruleMD ) ;
    public final void rule__Parallele3__BAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10177:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:10178:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:10178:2: ( ruleMD )
            // InternalMyTurtleDsl.g:10179:3: ruleMD
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
    // InternalMyTurtleDsl.g:10188:1: rule__Parallele3__CAssignment_2_4 : ( ruleGDr ) ;
    public final void rule__Parallele3__CAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10192:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:10193:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:10193:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:10194:3: ruleGDr
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
    // InternalMyTurtleDsl.g:10203:1: rule__Parallele3__AAssignment_3_0 : ( ruleAR ) ;
    public final void rule__Parallele3__AAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10207:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:10208:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:10208:2: ( ruleAR )
            // InternalMyTurtleDsl.g:10209:3: ruleAR
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
    // InternalMyTurtleDsl.g:10218:1: rule__Parallele3__BAssignment_3_2 : ( ruleMD ) ;
    public final void rule__Parallele3__BAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10222:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:10223:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:10223:2: ( ruleMD )
            // InternalMyTurtleDsl.g:10224:3: ruleMD
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
    // InternalMyTurtleDsl.g:10233:1: rule__Parallele3__CAssignment_3_4 : ( ruleRGRD ) ;
    public final void rule__Parallele3__CAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10237:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:10238:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:10238:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:10239:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:10248:1: rule__Parallele3__AAssignment_4_0 : ( ruleAR ) ;
    public final void rule__Parallele3__AAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10252:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:10253:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:10253:2: ( ruleAR )
            // InternalMyTurtleDsl.g:10254:3: ruleAR
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
    // InternalMyTurtleDsl.g:10263:1: rule__Parallele3__BAssignment_4_2 : ( ruleRGRD ) ;
    public final void rule__Parallele3__BAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10267:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:10268:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:10268:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:10269:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:10278:1: rule__Parallele3__CAssignment_4_4 : ( ruleMD ) ;
    public final void rule__Parallele3__CAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10282:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:10283:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:10283:2: ( ruleMD )
            // InternalMyTurtleDsl.g:10284:3: ruleMD
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
    // InternalMyTurtleDsl.g:10293:1: rule__Parallele3__AAssignment_5_0 : ( ruleAR ) ;
    public final void rule__Parallele3__AAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10297:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:10298:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:10298:2: ( ruleAR )
            // InternalMyTurtleDsl.g:10299:3: ruleAR
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
    // InternalMyTurtleDsl.g:10308:1: rule__Parallele3__BAssignment_5_2 : ( ruleRGRD ) ;
    public final void rule__Parallele3__BAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10312:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:10313:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:10313:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:10314:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:10323:1: rule__Parallele3__CAssignment_5_4 : ( ruleGDr ) ;
    public final void rule__Parallele3__CAssignment_5_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10327:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:10328:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:10328:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:10329:3: ruleGDr
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
    // InternalMyTurtleDsl.g:10338:1: rule__Parallele3__AAssignment_6_0 : ( ruleGDr ) ;
    public final void rule__Parallele3__AAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10342:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:10343:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:10343:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:10344:3: ruleGDr
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
    // InternalMyTurtleDsl.g:10353:1: rule__Parallele3__BAssignment_6_2 : ( ruleAR ) ;
    public final void rule__Parallele3__BAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10357:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:10358:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:10358:2: ( ruleAR )
            // InternalMyTurtleDsl.g:10359:3: ruleAR
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
    // InternalMyTurtleDsl.g:10368:1: rule__Parallele3__CAssignment_6_4 : ( ruleMD ) ;
    public final void rule__Parallele3__CAssignment_6_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10372:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:10373:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:10373:2: ( ruleMD )
            // InternalMyTurtleDsl.g:10374:3: ruleMD
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
    // InternalMyTurtleDsl.g:10383:1: rule__Parallele3__AAssignment_7_0 : ( ruleGDr ) ;
    public final void rule__Parallele3__AAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10387:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:10388:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:10388:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:10389:3: ruleGDr
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
    // InternalMyTurtleDsl.g:10398:1: rule__Parallele3__BAssignment_7_2 : ( ruleAR ) ;
    public final void rule__Parallele3__BAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10402:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:10403:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:10403:2: ( ruleAR )
            // InternalMyTurtleDsl.g:10404:3: ruleAR
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
    // InternalMyTurtleDsl.g:10413:1: rule__Parallele3__CAssignment_7_4 : ( ruleRGRD ) ;
    public final void rule__Parallele3__CAssignment_7_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10417:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:10418:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:10418:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:10419:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:10428:1: rule__Parallele3__AAssignment_8_0 : ( ruleGDr ) ;
    public final void rule__Parallele3__AAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10432:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:10433:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:10433:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:10434:3: ruleGDr
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
    // InternalMyTurtleDsl.g:10443:1: rule__Parallele3__BAssignment_8_2 : ( ruleMD ) ;
    public final void rule__Parallele3__BAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10447:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:10448:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:10448:2: ( ruleMD )
            // InternalMyTurtleDsl.g:10449:3: ruleMD
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
    // InternalMyTurtleDsl.g:10458:1: rule__Parallele3__CAssignment_8_4 : ( ruleAR ) ;
    public final void rule__Parallele3__CAssignment_8_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10462:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:10463:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:10463:2: ( ruleAR )
            // InternalMyTurtleDsl.g:10464:3: ruleAR
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
    // InternalMyTurtleDsl.g:10473:1: rule__Parallele3__AAssignment_9_0 : ( ruleGDr ) ;
    public final void rule__Parallele3__AAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10477:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:10478:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:10478:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:10479:3: ruleGDr
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
    // InternalMyTurtleDsl.g:10488:1: rule__Parallele3__BAssignment_9_2 : ( ruleMD ) ;
    public final void rule__Parallele3__BAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10492:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:10493:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:10493:2: ( ruleMD )
            // InternalMyTurtleDsl.g:10494:3: ruleMD
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
    // InternalMyTurtleDsl.g:10503:1: rule__Parallele3__CAssignment_9_4 : ( ruleRGRD ) ;
    public final void rule__Parallele3__CAssignment_9_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10507:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:10508:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:10508:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:10509:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:10518:1: rule__Parallele3__AAssignment_10_0 : ( ruleGDr ) ;
    public final void rule__Parallele3__AAssignment_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10522:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:10523:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:10523:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:10524:3: ruleGDr
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
    // InternalMyTurtleDsl.g:10533:1: rule__Parallele3__BAssignment_10_2 : ( ruleRGRD ) ;
    public final void rule__Parallele3__BAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10537:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:10538:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:10538:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:10539:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:10548:1: rule__Parallele3__CAssignment_10_4 : ( ruleAR ) ;
    public final void rule__Parallele3__CAssignment_10_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10552:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:10553:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:10553:2: ( ruleAR )
            // InternalMyTurtleDsl.g:10554:3: ruleAR
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
    // InternalMyTurtleDsl.g:10563:1: rule__Parallele3__AAssignment_11_0 : ( ruleGDr ) ;
    public final void rule__Parallele3__AAssignment_11_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10567:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:10568:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:10568:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:10569:3: ruleGDr
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
    // InternalMyTurtleDsl.g:10578:1: rule__Parallele3__BAssignment_11_2 : ( ruleRGRD ) ;
    public final void rule__Parallele3__BAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10582:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:10583:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:10583:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:10584:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:10593:1: rule__Parallele3__CAssignment_11_4 : ( ruleMD ) ;
    public final void rule__Parallele3__CAssignment_11_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10597:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:10598:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:10598:2: ( ruleMD )
            // InternalMyTurtleDsl.g:10599:3: ruleMD
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
    // InternalMyTurtleDsl.g:10608:1: rule__Parallele3__AAssignment_12_0 : ( ruleMD ) ;
    public final void rule__Parallele3__AAssignment_12_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10612:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:10613:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:10613:2: ( ruleMD )
            // InternalMyTurtleDsl.g:10614:3: ruleMD
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
    // InternalMyTurtleDsl.g:10623:1: rule__Parallele3__BAssignment_12_2 : ( ruleAR ) ;
    public final void rule__Parallele3__BAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10627:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:10628:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:10628:2: ( ruleAR )
            // InternalMyTurtleDsl.g:10629:3: ruleAR
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
    // InternalMyTurtleDsl.g:10638:1: rule__Parallele3__CAssignment_12_4 : ( ruleGDr ) ;
    public final void rule__Parallele3__CAssignment_12_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10642:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:10643:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:10643:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:10644:3: ruleGDr
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
    // InternalMyTurtleDsl.g:10653:1: rule__Parallele3__AAssignment_13_0 : ( ruleMD ) ;
    public final void rule__Parallele3__AAssignment_13_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10657:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:10658:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:10658:2: ( ruleMD )
            // InternalMyTurtleDsl.g:10659:3: ruleMD
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
    // InternalMyTurtleDsl.g:10668:1: rule__Parallele3__BAssignment_13_2 : ( ruleAR ) ;
    public final void rule__Parallele3__BAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10672:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:10673:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:10673:2: ( ruleAR )
            // InternalMyTurtleDsl.g:10674:3: ruleAR
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
    // InternalMyTurtleDsl.g:10683:1: rule__Parallele3__CAssignment_13_4 : ( ruleRGRD ) ;
    public final void rule__Parallele3__CAssignment_13_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10687:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:10688:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:10688:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:10689:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:10698:1: rule__Parallele3__AAssignment_14_0 : ( ruleMD ) ;
    public final void rule__Parallele3__AAssignment_14_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10702:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:10703:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:10703:2: ( ruleMD )
            // InternalMyTurtleDsl.g:10704:3: ruleMD
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
    // InternalMyTurtleDsl.g:10713:1: rule__Parallele3__BAssignment_14_2 : ( ruleGDr ) ;
    public final void rule__Parallele3__BAssignment_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10717:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:10718:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:10718:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:10719:3: ruleGDr
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
    // InternalMyTurtleDsl.g:10728:1: rule__Parallele3__CAssignment_14_4 : ( ruleAR ) ;
    public final void rule__Parallele3__CAssignment_14_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10732:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:10733:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:10733:2: ( ruleAR )
            // InternalMyTurtleDsl.g:10734:3: ruleAR
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
    // InternalMyTurtleDsl.g:10743:1: rule__Parallele3__AAssignment_15_0 : ( ruleMD ) ;
    public final void rule__Parallele3__AAssignment_15_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10747:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:10748:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:10748:2: ( ruleMD )
            // InternalMyTurtleDsl.g:10749:3: ruleMD
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
    // InternalMyTurtleDsl.g:10758:1: rule__Parallele3__BAssignment_15_2 : ( ruleGDr ) ;
    public final void rule__Parallele3__BAssignment_15_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10762:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:10763:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:10763:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:10764:3: ruleGDr
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
    // InternalMyTurtleDsl.g:10773:1: rule__Parallele3__CAssignment_15_4 : ( ruleRGRD ) ;
    public final void rule__Parallele3__CAssignment_15_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10777:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:10778:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:10778:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:10779:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:10788:1: rule__Parallele3__AAssignment_16_0 : ( ruleMD ) ;
    public final void rule__Parallele3__AAssignment_16_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10792:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:10793:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:10793:2: ( ruleMD )
            // InternalMyTurtleDsl.g:10794:3: ruleMD
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
    // InternalMyTurtleDsl.g:10803:1: rule__Parallele3__BAssignment_16_2 : ( ruleRGRD ) ;
    public final void rule__Parallele3__BAssignment_16_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10807:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:10808:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:10808:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:10809:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:10818:1: rule__Parallele3__CAssignment_16_4 : ( ruleGDr ) ;
    public final void rule__Parallele3__CAssignment_16_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10822:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:10823:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:10823:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:10824:3: ruleGDr
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
    // InternalMyTurtleDsl.g:10833:1: rule__Parallele3__AAssignment_17_0 : ( ruleMD ) ;
    public final void rule__Parallele3__AAssignment_17_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10837:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:10838:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:10838:2: ( ruleMD )
            // InternalMyTurtleDsl.g:10839:3: ruleMD
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
    // InternalMyTurtleDsl.g:10848:1: rule__Parallele3__BAssignment_17_2 : ( ruleRGRD ) ;
    public final void rule__Parallele3__BAssignment_17_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10852:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:10853:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:10853:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:10854:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:10863:1: rule__Parallele3__CAssignment_17_4 : ( ruleAR ) ;
    public final void rule__Parallele3__CAssignment_17_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10867:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:10868:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:10868:2: ( ruleAR )
            // InternalMyTurtleDsl.g:10869:3: ruleAR
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
    // InternalMyTurtleDsl.g:10878:1: rule__Parallele3__AAssignment_18_0 : ( ruleRGRD ) ;
    public final void rule__Parallele3__AAssignment_18_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10882:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:10883:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:10883:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:10884:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:10893:1: rule__Parallele3__BAssignment_18_2 : ( ruleAR ) ;
    public final void rule__Parallele3__BAssignment_18_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10897:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:10898:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:10898:2: ( ruleAR )
            // InternalMyTurtleDsl.g:10899:3: ruleAR
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
    // InternalMyTurtleDsl.g:10908:1: rule__Parallele3__CAssignment_18_4 : ( ruleMD ) ;
    public final void rule__Parallele3__CAssignment_18_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10912:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:10913:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:10913:2: ( ruleMD )
            // InternalMyTurtleDsl.g:10914:3: ruleMD
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
    // InternalMyTurtleDsl.g:10923:1: rule__Parallele3__AAssignment_19_0 : ( ruleRGRD ) ;
    public final void rule__Parallele3__AAssignment_19_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10927:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:10928:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:10928:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:10929:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:10938:1: rule__Parallele3__BAssignment_19_2 : ( ruleAR ) ;
    public final void rule__Parallele3__BAssignment_19_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10942:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:10943:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:10943:2: ( ruleAR )
            // InternalMyTurtleDsl.g:10944:3: ruleAR
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
    // InternalMyTurtleDsl.g:10953:1: rule__Parallele3__CAssignment_19_4 : ( ruleGDr ) ;
    public final void rule__Parallele3__CAssignment_19_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10957:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:10958:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:10958:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:10959:3: ruleGDr
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
    // InternalMyTurtleDsl.g:10968:1: rule__Parallele3__AAssignment_20_0 : ( ruleRGRD ) ;
    public final void rule__Parallele3__AAssignment_20_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10972:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:10973:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:10973:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:10974:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:10983:1: rule__Parallele3__BAssignment_20_2 : ( ruleMD ) ;
    public final void rule__Parallele3__BAssignment_20_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:10987:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:10988:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:10988:2: ( ruleMD )
            // InternalMyTurtleDsl.g:10989:3: ruleMD
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
    // InternalMyTurtleDsl.g:10998:1: rule__Parallele3__CAssignment_20_4 : ( ruleAR ) ;
    public final void rule__Parallele3__CAssignment_20_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:11002:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:11003:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:11003:2: ( ruleAR )
            // InternalMyTurtleDsl.g:11004:3: ruleAR
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
    // InternalMyTurtleDsl.g:11013:1: rule__Parallele3__AAssignment_21_0 : ( ruleRGRD ) ;
    public final void rule__Parallele3__AAssignment_21_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:11017:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:11018:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:11018:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:11019:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:11028:1: rule__Parallele3__BAssignment_21_2 : ( ruleMD ) ;
    public final void rule__Parallele3__BAssignment_21_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:11032:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:11033:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:11033:2: ( ruleMD )
            // InternalMyTurtleDsl.g:11034:3: ruleMD
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
    // InternalMyTurtleDsl.g:11043:1: rule__Parallele3__CAssignment_21_4 : ( ruleGDr ) ;
    public final void rule__Parallele3__CAssignment_21_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:11047:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:11048:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:11048:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:11049:3: ruleGDr
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
    // InternalMyTurtleDsl.g:11058:1: rule__Parallele3__AAssignment_22_0 : ( ruleRGRD ) ;
    public final void rule__Parallele3__AAssignment_22_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:11062:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:11063:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:11063:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:11064:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:11073:1: rule__Parallele3__BAssignment_22_2 : ( ruleGDr ) ;
    public final void rule__Parallele3__BAssignment_22_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:11077:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:11078:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:11078:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:11079:3: ruleGDr
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
    // InternalMyTurtleDsl.g:11088:1: rule__Parallele3__CAssignment_22_4 : ( ruleMD ) ;
    public final void rule__Parallele3__CAssignment_22_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:11092:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:11093:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:11093:2: ( ruleMD )
            // InternalMyTurtleDsl.g:11094:3: ruleMD
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
    // InternalMyTurtleDsl.g:11103:1: rule__Parallele3__AAssignment_23_0 : ( ruleRGRD ) ;
    public final void rule__Parallele3__AAssignment_23_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:11107:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:11108:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:11108:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:11109:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:11118:1: rule__Parallele3__BAssignment_23_2 : ( ruleGDr ) ;
    public final void rule__Parallele3__BAssignment_23_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:11122:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:11123:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:11123:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:11124:3: ruleGDr
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
    // InternalMyTurtleDsl.g:11133:1: rule__Parallele3__CAssignment_23_4 : ( ruleAR ) ;
    public final void rule__Parallele3__CAssignment_23_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:11137:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:11138:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:11138:2: ( ruleAR )
            // InternalMyTurtleDsl.g:11139:3: ruleAR
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


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\106\uffff";
    static final String dfa_2s = "\1\6\2\uffff\10\33\1\uffff\10\6\10\37\2\34\6\37\5\4\1\uffff\3\4\20\34\10\6\1\uffff";
    static final String dfa_3s = "\1\52\2\uffff\10\33\1\uffff\10\7\20\37\5\6\1\uffff\3\6\20\34\10\53\1\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\10\uffff\1\4\35\uffff\1\3\33\uffff\1\5";
    static final String dfa_5s = "\106\uffff}>";
    static final String[] dfa_6s = {
            "\1\13\27\uffff\1\12\1\uffff\1\4\1\3\1\11\1\10\1\7\1\6\1\5\1\uffff\1\2\1\uffff\1\1",
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
            "\1\51\2\uffff\1\50",
            "\1\51\2\uffff\1\50",
            "\1\52",
            "\1\52",
            "\1\53",
            "\1\53",
            "\1\54",
            "\1\54",
            "\1\55\1\uffff\1\56",
            "\1\57\1\uffff\1\60",
            "\1\61\1\uffff\1\62",
            "\1\63\1\uffff\1\64",
            "\1\65\1\uffff\1\66",
            "",
            "\1\67\1\uffff\1\70",
            "\1\71\1\uffff\1\72",
            "\1\73\1\uffff\1\74",
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
            "\1\51\6\uffff\1\51\17\uffff\2\51\1\uffff\7\51\1\uffff\1\51\1\uffff\1\51\1\105",
            "\1\51\6\uffff\1\51\17\uffff\2\51\1\uffff\7\51\1\uffff\1\51\1\uffff\1\51\1\105",
            "\1\51\6\uffff\1\51\17\uffff\2\51\1\uffff\7\51\1\uffff\1\51\1\uffff\1\51\1\105",
            "\1\51\6\uffff\1\51\17\uffff\2\51\1\uffff\7\51\1\uffff\1\51\1\uffff\1\51\1\105",
            "\1\51\6\uffff\1\51\17\uffff\2\51\1\uffff\7\51\1\uffff\1\51\1\uffff\1\51\1\105",
            "\1\51\6\uffff\1\51\17\uffff\2\51\1\uffff\7\51\1\uffff\1\51\1\uffff\1\51\1\105",
            "\1\51\6\uffff\1\51\17\uffff\2\51\1\uffff\7\51\1\uffff\1\51\1\uffff\1\51\1\105",
            "\1\51\6\uffff\1\51\17\uffff\2\51\1\uffff\7\51\1\uffff\1\51\1\uffff\1\51\1\105",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1002:1: rule__Main__Alternatives_4 : ( ( ( rule__Main__SeconDecAssignment_4_0 ) ) | ( ( rule__Main__PourDecAssignment_4_1 ) ) | ( ( rule__Main__StatementsAssignment_4_2 ) ) | ( ( rule__Main__FonctionsAssignment_4_3 ) ) | ( ( rule__Main__ParalleleAssignment_4_4 ) ) );";
        }
    }
    static final String dfa_7s = "\u0107\uffff";
    static final String dfa_8s = "\1\36\10\33\10\6\20\37\10\4\20\34\10\53\1\41\3\36\30\33\30\6\60\37\30\4\60\34\30\6\2\uffff";
    static final String dfa_9s = "\1\46\10\33\10\7\20\37\10\6\20\34\10\53\2\46\1\44\1\46\30\33\30\7\60\37\30\6\60\34\30\53\2\uffff";
    static final String dfa_10s = "\u0105\uffff\1\1\1\2";
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
            "\1\111\1\112\1\107\1\110\1\105\1\106",
            "\1\113\1\uffff\1\114\1\115\1\116\2\uffff\1\117\1\120",
            "\1\123\1\uffff\1\124\1\125\1\126\1\121\1\122",
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
            "\1\u0105\6\uffff\1\u0105\17\uffff\2\u0105\1\uffff\7\u0105\1\uffff\1\u0105\1\uffff\1\u0105\1\u0106",
            "\1\u0105\6\uffff\1\u0105\17\uffff\2\u0105\1\uffff\7\u0105\1\uffff\1\u0105\1\uffff\1\u0105\1\u0106",
            "\1\u0105\6\uffff\1\u0105\17\uffff\2\u0105\1\uffff\7\u0105\1\uffff\1\u0105\1\uffff\1\u0105\1\u0106",
            "\1\u0105\6\uffff\1\u0105\17\uffff\2\u0105\1\uffff\7\u0105\1\uffff\1\u0105\1\uffff\1\u0105\1\u0106",
            "\1\u0105\6\uffff\1\u0105\17\uffff\2\u0105\1\uffff\7\u0105\1\uffff\1\u0105\1\uffff\1\u0105\1\u0106",
            "\1\u0105\6\uffff\1\u0105\17\uffff\2\u0105\1\uffff\7\u0105\1\uffff\1\u0105\1\uffff\1\u0105\1\u0106",
            "\1\u0105\6\uffff\1\u0105\17\uffff\2\u0105\1\uffff\7\u0105\1\uffff\1\u0105\1\uffff\1\u0105\1\u0106",
            "\1\u0105\6\uffff\1\u0105\17\uffff\2\u0105\1\uffff\7\u0105\1\uffff\1\u0105\1\uffff\1\u0105\1\u0106",
            "\1\u0105\6\uffff\1\u0105\17\uffff\2\u0105\1\uffff\7\u0105\1\uffff\1\u0105\1\uffff\1\u0105\1\u0106",
            "\1\u0105\6\uffff\1\u0105\17\uffff\2\u0105\1\uffff\7\u0105\1\uffff\1\u0105\1\uffff\1\u0105\1\u0106",
            "\1\u0105\6\uffff\1\u0105\17\uffff\2\u0105\1\uffff\7\u0105\1\uffff\1\u0105\1\uffff\1\u0105\1\u0106",
            "\1\u0105\6\uffff\1\u0105\17\uffff\2\u0105\1\uffff\7\u0105\1\uffff\1\u0105\1\uffff\1\u0105\1\u0106",
            "\1\u0105\6\uffff\1\u0105\17\uffff\2\u0105\1\uffff\7\u0105\1\uffff\1\u0105\1\uffff\1\u0105\1\u0106",
            "\1\u0105\6\uffff\1\u0105\17\uffff\2\u0105\1\uffff\7\u0105\1\uffff\1\u0105\1\uffff\1\u0105\1\u0106",
            "\1\u0105\6\uffff\1\u0105\17\uffff\2\u0105\1\uffff\7\u0105\1\uffff\1\u0105\1\uffff\1\u0105\1\u0106",
            "\1\u0105\6\uffff\1\u0105\17\uffff\2\u0105\1\uffff\7\u0105\1\uffff\1\u0105\1\uffff\1\u0105\1\u0106",
            "\1\u0105\6\uffff\1\u0105\17\uffff\2\u0105\1\uffff\7\u0105\1\uffff\1\u0105\1\uffff\1\u0105\1\u0106",
            "\1\u0105\6\uffff\1\u0105\17\uffff\2\u0105\1\uffff\7\u0105\1\uffff\1\u0105\1\uffff\1\u0105\1\u0106",
            "\1\u0105\6\uffff\1\u0105\17\uffff\2\u0105\1\uffff\7\u0105\1\uffff\1\u0105\1\uffff\1\u0105\1\u0106",
            "\1\u0105\6\uffff\1\u0105\17\uffff\2\u0105\1\uffff\7\u0105\1\uffff\1\u0105\1\uffff\1\u0105\1\u0106",
            "\1\u0105\6\uffff\1\u0105\17\uffff\2\u0105\1\uffff\7\u0105\1\uffff\1\u0105\1\uffff\1\u0105\1\u0106",
            "\1\u0105\6\uffff\1\u0105\17\uffff\2\u0105\1\uffff\7\u0105\1\uffff\1\u0105\1\uffff\1\u0105\1\u0106",
            "\1\u0105\6\uffff\1\u0105\17\uffff\2\u0105\1\uffff\7\u0105\1\uffff\1\u0105\1\uffff\1\u0105\1\u0106",
            "\1\u0105\6\uffff\1\u0105\17\uffff\2\u0105\1\uffff\7\u0105\1\uffff\1\u0105\1\uffff\1\u0105\1\u0106",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1041:1: rule__Main__ParalleleAlternatives_4_4_0 : ( ( ruleParallele2 ) | ( ruleParallele3 ) );";
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

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "1062:1: rule__Statement__Alternatives : ( ( ruleAvancer ) | ( ruleDescendre ) | ( ruleRotationDroite ) | ( ruleRotationGauche ) | ( rulePause ) | ( ruleDroite ) | ( ruleGauche ) | ( ruleReculer ) | ( ruleMonter ) );";
        }
    }
    static final String dfa_19s = "\121\uffff";
    static final String dfa_20s = "\1\36\10\33\10\6\20\37\10\4\20\34\10\53\1\41\3\36\14\uffff";
    static final String dfa_21s = "\1\46\10\33\10\7\20\37\10\6\20\34\10\53\2\46\1\44\1\46\14\uffff";
    static final String dfa_22s = "\105\uffff\1\3\1\2\1\1\1\5\1\4\1\6\1\11\1\10\1\7\1\14\1\13\1\12";
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
            "\2\106\2\107\2\105",
            "\1\110\1\uffff\1\110\2\111\2\uffff\2\112",
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
            return "1251:1: rule__Parallele2__Alternatives : ( ( ( rule__Parallele2__Group_0__0 ) ) | ( ( rule__Parallele2__Group_1__0 ) ) | ( ( rule__Parallele2__Group_2__0 ) ) | ( ( rule__Parallele2__Group_3__0 ) ) | ( ( rule__Parallele2__Group_4__0 ) ) | ( ( rule__Parallele2__Group_5__0 ) ) | ( ( rule__Parallele2__Group_6__0 ) ) | ( ( rule__Parallele2__Group_7__0 ) ) | ( ( rule__Parallele2__Group_8__0 ) ) | ( ( rule__Parallele2__Group_9__0 ) ) | ( ( rule__Parallele2__Group_10__0 ) ) | ( ( rule__Parallele2__Group_11__0 ) ) );";
        }
    }
    static final String dfa_25s = "\u0129\uffff";
    static final String dfa_26s = "\1\36\10\33\10\6\20\37\10\4\20\34\10\53\2\36\1\41\1\36\30\33\30\6\60\37\30\4\60\34\30\53\2\36\1\43\1\36\1\41\1\36\2\41\1\43\1\36\1\41\1\36\30\uffff";
    static final String dfa_27s = "\1\46\10\33\10\7\20\37\10\6\20\34\10\53\3\46\1\44\30\33\30\7\60\37\30\6\60\34\30\53\1\46\1\44\1\46\1\42\2\46\1\44\2\46\1\42\2\44\30\uffff";
    static final String dfa_28s = "\u0111\uffff\1\1\1\2\1\6\1\5\1\3\1\4\1\13\1\14\1\11\1\12\1\7\1\10\1\21\1\22\1\17\1\20\1\15\1\16\1\27\1\30\1\26\1\25\1\23\1\24";
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
            "\1\111\1\uffff\1\112\2\uffff\1\105\1\106\1\107\1\110",
            "\1\115\1\uffff\1\116\1\117\1\120\2\uffff\1\113\1\114",
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
            "\1\u0111\1\uffff\1\u0111\4\uffff\2\u0112",
            "\1\u0114\1\uffff\1\u0114\2\uffff\2\u0113",
            "\2\u0115\2\u0116",
            "\1\u0118\1\uffff\1\u0118\2\u0117",
            "\2\u0119\2\uffff\2\u011a",
            "\1\u011b\1\uffff\1\u011b\4\uffff\2\u011c",
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
            return "1332:1: rule__Parallele3__Alternatives : ( ( ( rule__Parallele3__Group_0__0 ) ) | ( ( rule__Parallele3__Group_1__0 ) ) | ( ( rule__Parallele3__Group_2__0 ) ) | ( ( rule__Parallele3__Group_3__0 ) ) | ( ( rule__Parallele3__Group_4__0 ) ) | ( ( rule__Parallele3__Group_5__0 ) ) | ( ( rule__Parallele3__Group_6__0 ) ) | ( ( rule__Parallele3__Group_7__0 ) ) | ( ( rule__Parallele3__Group_8__0 ) ) | ( ( rule__Parallele3__Group_9__0 ) ) | ( ( rule__Parallele3__Group_10__0 ) ) | ( ( rule__Parallele3__Group_11__0 ) ) | ( ( rule__Parallele3__Group_12__0 ) ) | ( ( rule__Parallele3__Group_13__0 ) ) | ( ( rule__Parallele3__Group_14__0 ) ) | ( ( rule__Parallele3__Group_15__0 ) ) | ( ( rule__Parallele3__Group_16__0 ) ) | ( ( rule__Parallele3__Group_17__0 ) ) | ( ( rule__Parallele3__Group_18__0 ) ) | ( ( rule__Parallele3__Group_19__0 ) ) | ( ( rule__Parallele3__Group_20__0 ) ) | ( ( rule__Parallele3__Group_21__0 ) ) | ( ( rule__Parallele3__Group_22__0 ) ) | ( ( rule__Parallele3__Group_23__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000008000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000057F60002040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000057F40000042L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000007F40002000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000007F40000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000007F40000000L});

}