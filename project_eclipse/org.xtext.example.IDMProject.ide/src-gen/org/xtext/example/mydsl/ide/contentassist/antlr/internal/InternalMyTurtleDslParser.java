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


    // $ANTLR start "entryRuleMD"
    // InternalMyTurtleDsl.g:78:1: entryRuleMD : ruleMD EOF ;
    public final void entryRuleMD() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:79:1: ( ruleMD EOF )
            // InternalMyTurtleDsl.g:80:1: ruleMD EOF
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
    // InternalMyTurtleDsl.g:87:1: ruleMD : ( ( rule__MD__Alternatives ) ) ;
    public final void ruleMD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:91:2: ( ( ( rule__MD__Alternatives ) ) )
            // InternalMyTurtleDsl.g:92:2: ( ( rule__MD__Alternatives ) )
            {
            // InternalMyTurtleDsl.g:92:2: ( ( rule__MD__Alternatives ) )
            // InternalMyTurtleDsl.g:93:3: ( rule__MD__Alternatives )
            {
             before(grammarAccess.getMDAccess().getAlternatives()); 
            // InternalMyTurtleDsl.g:94:3: ( rule__MD__Alternatives )
            // InternalMyTurtleDsl.g:94:4: rule__MD__Alternatives
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
    // InternalMyTurtleDsl.g:103:1: entryRuleGDr : ruleGDr EOF ;
    public final void entryRuleGDr() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:104:1: ( ruleGDr EOF )
            // InternalMyTurtleDsl.g:105:1: ruleGDr EOF
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
    // InternalMyTurtleDsl.g:112:1: ruleGDr : ( ( rule__GDr__Alternatives ) ) ;
    public final void ruleGDr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:116:2: ( ( ( rule__GDr__Alternatives ) ) )
            // InternalMyTurtleDsl.g:117:2: ( ( rule__GDr__Alternatives ) )
            {
            // InternalMyTurtleDsl.g:117:2: ( ( rule__GDr__Alternatives ) )
            // InternalMyTurtleDsl.g:118:3: ( rule__GDr__Alternatives )
            {
             before(grammarAccess.getGDrAccess().getAlternatives()); 
            // InternalMyTurtleDsl.g:119:3: ( rule__GDr__Alternatives )
            // InternalMyTurtleDsl.g:119:4: rule__GDr__Alternatives
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
    // InternalMyTurtleDsl.g:128:1: entryRuleRGRD : ruleRGRD EOF ;
    public final void entryRuleRGRD() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:129:1: ( ruleRGRD EOF )
            // InternalMyTurtleDsl.g:130:1: ruleRGRD EOF
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
    // InternalMyTurtleDsl.g:137:1: ruleRGRD : ( ( rule__RGRD__Alternatives ) ) ;
    public final void ruleRGRD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:141:2: ( ( ( rule__RGRD__Alternatives ) ) )
            // InternalMyTurtleDsl.g:142:2: ( ( rule__RGRD__Alternatives ) )
            {
            // InternalMyTurtleDsl.g:142:2: ( ( rule__RGRD__Alternatives ) )
            // InternalMyTurtleDsl.g:143:3: ( rule__RGRD__Alternatives )
            {
             before(grammarAccess.getRGRDAccess().getAlternatives()); 
            // InternalMyTurtleDsl.g:144:3: ( rule__RGRD__Alternatives )
            // InternalMyTurtleDsl.g:144:4: rule__RGRD__Alternatives
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
    // InternalMyTurtleDsl.g:153:1: entryRuleAR : ruleAR EOF ;
    public final void entryRuleAR() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:154:1: ( ruleAR EOF )
            // InternalMyTurtleDsl.g:155:1: ruleAR EOF
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
    // InternalMyTurtleDsl.g:162:1: ruleAR : ( ( rule__AR__Alternatives ) ) ;
    public final void ruleAR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:166:2: ( ( ( rule__AR__Alternatives ) ) )
            // InternalMyTurtleDsl.g:167:2: ( ( rule__AR__Alternatives ) )
            {
            // InternalMyTurtleDsl.g:167:2: ( ( rule__AR__Alternatives ) )
            // InternalMyTurtleDsl.g:168:3: ( rule__AR__Alternatives )
            {
             before(grammarAccess.getARAccess().getAlternatives()); 
            // InternalMyTurtleDsl.g:169:3: ( rule__AR__Alternatives )
            // InternalMyTurtleDsl.g:169:4: rule__AR__Alternatives
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
    // InternalMyTurtleDsl.g:178:1: entryRuleParallele2 : ruleParallele2 EOF ;
    public final void entryRuleParallele2() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:179:1: ( ruleParallele2 EOF )
            // InternalMyTurtleDsl.g:180:1: ruleParallele2 EOF
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
    // InternalMyTurtleDsl.g:187:1: ruleParallele2 : ( ( rule__Parallele2__Alternatives ) ) ;
    public final void ruleParallele2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:191:2: ( ( ( rule__Parallele2__Alternatives ) ) )
            // InternalMyTurtleDsl.g:192:2: ( ( rule__Parallele2__Alternatives ) )
            {
            // InternalMyTurtleDsl.g:192:2: ( ( rule__Parallele2__Alternatives ) )
            // InternalMyTurtleDsl.g:193:3: ( rule__Parallele2__Alternatives )
            {
             before(grammarAccess.getParallele2Access().getAlternatives()); 
            // InternalMyTurtleDsl.g:194:3: ( rule__Parallele2__Alternatives )
            // InternalMyTurtleDsl.g:194:4: rule__Parallele2__Alternatives
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
    // InternalMyTurtleDsl.g:203:1: entryRuleParallele3 : ruleParallele3 EOF ;
    public final void entryRuleParallele3() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:204:1: ( ruleParallele3 EOF )
            // InternalMyTurtleDsl.g:205:1: ruleParallele3 EOF
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
    // InternalMyTurtleDsl.g:212:1: ruleParallele3 : ( ( rule__Parallele3__Alternatives ) ) ;
    public final void ruleParallele3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:216:2: ( ( ( rule__Parallele3__Alternatives ) ) )
            // InternalMyTurtleDsl.g:217:2: ( ( rule__Parallele3__Alternatives ) )
            {
            // InternalMyTurtleDsl.g:217:2: ( ( rule__Parallele3__Alternatives ) )
            // InternalMyTurtleDsl.g:218:3: ( rule__Parallele3__Alternatives )
            {
             before(grammarAccess.getParallele3Access().getAlternatives()); 
            // InternalMyTurtleDsl.g:219:3: ( rule__Parallele3__Alternatives )
            // InternalMyTurtleDsl.g:219:4: rule__Parallele3__Alternatives
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


    // $ANTLR start "entryRuleIncludes"
    // InternalMyTurtleDsl.g:228:1: entryRuleIncludes : ruleIncludes EOF ;
    public final void entryRuleIncludes() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:229:1: ( ruleIncludes EOF )
            // InternalMyTurtleDsl.g:230:1: ruleIncludes EOF
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
    // InternalMyTurtleDsl.g:237:1: ruleIncludes : ( ( rule__Includes__Group__0 ) ) ;
    public final void ruleIncludes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:241:2: ( ( ( rule__Includes__Group__0 ) ) )
            // InternalMyTurtleDsl.g:242:2: ( ( rule__Includes__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:242:2: ( ( rule__Includes__Group__0 ) )
            // InternalMyTurtleDsl.g:243:3: ( rule__Includes__Group__0 )
            {
             before(grammarAccess.getIncludesAccess().getGroup()); 
            // InternalMyTurtleDsl.g:244:3: ( rule__Includes__Group__0 )
            // InternalMyTurtleDsl.g:244:4: rule__Includes__Group__0
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


    // $ANTLR start "entryRuleDecoller"
    // InternalMyTurtleDsl.g:253:1: entryRuleDecoller : ruleDecoller EOF ;
    public final void entryRuleDecoller() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:254:1: ( ruleDecoller EOF )
            // InternalMyTurtleDsl.g:255:1: ruleDecoller EOF
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
    // InternalMyTurtleDsl.g:262:1: ruleDecoller : ( ( rule__Decoller__Group__0 ) ) ;
    public final void ruleDecoller() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:266:2: ( ( ( rule__Decoller__Group__0 ) ) )
            // InternalMyTurtleDsl.g:267:2: ( ( rule__Decoller__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:267:2: ( ( rule__Decoller__Group__0 ) )
            // InternalMyTurtleDsl.g:268:3: ( rule__Decoller__Group__0 )
            {
             before(grammarAccess.getDecollerAccess().getGroup()); 
            // InternalMyTurtleDsl.g:269:3: ( rule__Decoller__Group__0 )
            // InternalMyTurtleDsl.g:269:4: rule__Decoller__Group__0
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
    // InternalMyTurtleDsl.g:278:1: entryRuleAtterrir : ruleAtterrir EOF ;
    public final void entryRuleAtterrir() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:279:1: ( ruleAtterrir EOF )
            // InternalMyTurtleDsl.g:280:1: ruleAtterrir EOF
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
    // InternalMyTurtleDsl.g:287:1: ruleAtterrir : ( ( rule__Atterrir__Group__0 ) ) ;
    public final void ruleAtterrir() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:291:2: ( ( ( rule__Atterrir__Group__0 ) ) )
            // InternalMyTurtleDsl.g:292:2: ( ( rule__Atterrir__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:292:2: ( ( rule__Atterrir__Group__0 ) )
            // InternalMyTurtleDsl.g:293:3: ( rule__Atterrir__Group__0 )
            {
             before(grammarAccess.getAtterrirAccess().getGroup()); 
            // InternalMyTurtleDsl.g:294:3: ( rule__Atterrir__Group__0 )
            // InternalMyTurtleDsl.g:294:4: rule__Atterrir__Group__0
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
    // InternalMyTurtleDsl.g:303:1: entryRuleMonter : ruleMonter EOF ;
    public final void entryRuleMonter() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:304:1: ( ruleMonter EOF )
            // InternalMyTurtleDsl.g:305:1: ruleMonter EOF
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
    // InternalMyTurtleDsl.g:312:1: ruleMonter : ( ( rule__Monter__Group__0 ) ) ;
    public final void ruleMonter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:316:2: ( ( ( rule__Monter__Group__0 ) ) )
            // InternalMyTurtleDsl.g:317:2: ( ( rule__Monter__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:317:2: ( ( rule__Monter__Group__0 ) )
            // InternalMyTurtleDsl.g:318:3: ( rule__Monter__Group__0 )
            {
             before(grammarAccess.getMonterAccess().getGroup()); 
            // InternalMyTurtleDsl.g:319:3: ( rule__Monter__Group__0 )
            // InternalMyTurtleDsl.g:319:4: rule__Monter__Group__0
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
    // InternalMyTurtleDsl.g:328:1: entryRuleDescendre : ruleDescendre EOF ;
    public final void entryRuleDescendre() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:329:1: ( ruleDescendre EOF )
            // InternalMyTurtleDsl.g:330:1: ruleDescendre EOF
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
    // InternalMyTurtleDsl.g:337:1: ruleDescendre : ( ( rule__Descendre__Group__0 ) ) ;
    public final void ruleDescendre() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:341:2: ( ( ( rule__Descendre__Group__0 ) ) )
            // InternalMyTurtleDsl.g:342:2: ( ( rule__Descendre__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:342:2: ( ( rule__Descendre__Group__0 ) )
            // InternalMyTurtleDsl.g:343:3: ( rule__Descendre__Group__0 )
            {
             before(grammarAccess.getDescendreAccess().getGroup()); 
            // InternalMyTurtleDsl.g:344:3: ( rule__Descendre__Group__0 )
            // InternalMyTurtleDsl.g:344:4: rule__Descendre__Group__0
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
    // InternalMyTurtleDsl.g:353:1: entryRuleAvancer : ruleAvancer EOF ;
    public final void entryRuleAvancer() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:354:1: ( ruleAvancer EOF )
            // InternalMyTurtleDsl.g:355:1: ruleAvancer EOF
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
    // InternalMyTurtleDsl.g:362:1: ruleAvancer : ( ( rule__Avancer__Group__0 ) ) ;
    public final void ruleAvancer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:366:2: ( ( ( rule__Avancer__Group__0 ) ) )
            // InternalMyTurtleDsl.g:367:2: ( ( rule__Avancer__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:367:2: ( ( rule__Avancer__Group__0 ) )
            // InternalMyTurtleDsl.g:368:3: ( rule__Avancer__Group__0 )
            {
             before(grammarAccess.getAvancerAccess().getGroup()); 
            // InternalMyTurtleDsl.g:369:3: ( rule__Avancer__Group__0 )
            // InternalMyTurtleDsl.g:369:4: rule__Avancer__Group__0
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
    // InternalMyTurtleDsl.g:378:1: entryRuleReculer : ruleReculer EOF ;
    public final void entryRuleReculer() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:379:1: ( ruleReculer EOF )
            // InternalMyTurtleDsl.g:380:1: ruleReculer EOF
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
    // InternalMyTurtleDsl.g:387:1: ruleReculer : ( ( rule__Reculer__Group__0 ) ) ;
    public final void ruleReculer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:391:2: ( ( ( rule__Reculer__Group__0 ) ) )
            // InternalMyTurtleDsl.g:392:2: ( ( rule__Reculer__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:392:2: ( ( rule__Reculer__Group__0 ) )
            // InternalMyTurtleDsl.g:393:3: ( rule__Reculer__Group__0 )
            {
             before(grammarAccess.getReculerAccess().getGroup()); 
            // InternalMyTurtleDsl.g:394:3: ( rule__Reculer__Group__0 )
            // InternalMyTurtleDsl.g:394:4: rule__Reculer__Group__0
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
    // InternalMyTurtleDsl.g:403:1: entryRuleGauche : ruleGauche EOF ;
    public final void entryRuleGauche() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:404:1: ( ruleGauche EOF )
            // InternalMyTurtleDsl.g:405:1: ruleGauche EOF
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
    // InternalMyTurtleDsl.g:412:1: ruleGauche : ( ( rule__Gauche__Group__0 ) ) ;
    public final void ruleGauche() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:416:2: ( ( ( rule__Gauche__Group__0 ) ) )
            // InternalMyTurtleDsl.g:417:2: ( ( rule__Gauche__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:417:2: ( ( rule__Gauche__Group__0 ) )
            // InternalMyTurtleDsl.g:418:3: ( rule__Gauche__Group__0 )
            {
             before(grammarAccess.getGaucheAccess().getGroup()); 
            // InternalMyTurtleDsl.g:419:3: ( rule__Gauche__Group__0 )
            // InternalMyTurtleDsl.g:419:4: rule__Gauche__Group__0
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
    // InternalMyTurtleDsl.g:428:1: entryRuleDroite : ruleDroite EOF ;
    public final void entryRuleDroite() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:429:1: ( ruleDroite EOF )
            // InternalMyTurtleDsl.g:430:1: ruleDroite EOF
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
    // InternalMyTurtleDsl.g:437:1: ruleDroite : ( ( rule__Droite__Group__0 ) ) ;
    public final void ruleDroite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:441:2: ( ( ( rule__Droite__Group__0 ) ) )
            // InternalMyTurtleDsl.g:442:2: ( ( rule__Droite__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:442:2: ( ( rule__Droite__Group__0 ) )
            // InternalMyTurtleDsl.g:443:3: ( rule__Droite__Group__0 )
            {
             before(grammarAccess.getDroiteAccess().getGroup()); 
            // InternalMyTurtleDsl.g:444:3: ( rule__Droite__Group__0 )
            // InternalMyTurtleDsl.g:444:4: rule__Droite__Group__0
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
    // InternalMyTurtleDsl.g:453:1: entryRulePause : rulePause EOF ;
    public final void entryRulePause() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:454:1: ( rulePause EOF )
            // InternalMyTurtleDsl.g:455:1: rulePause EOF
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
    // InternalMyTurtleDsl.g:462:1: rulePause : ( ( rule__Pause__Group__0 ) ) ;
    public final void rulePause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:466:2: ( ( ( rule__Pause__Group__0 ) ) )
            // InternalMyTurtleDsl.g:467:2: ( ( rule__Pause__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:467:2: ( ( rule__Pause__Group__0 ) )
            // InternalMyTurtleDsl.g:468:3: ( rule__Pause__Group__0 )
            {
             before(grammarAccess.getPauseAccess().getGroup()); 
            // InternalMyTurtleDsl.g:469:3: ( rule__Pause__Group__0 )
            // InternalMyTurtleDsl.g:469:4: rule__Pause__Group__0
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
    // InternalMyTurtleDsl.g:478:1: entryRuleRotationGauche : ruleRotationGauche EOF ;
    public final void entryRuleRotationGauche() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:479:1: ( ruleRotationGauche EOF )
            // InternalMyTurtleDsl.g:480:1: ruleRotationGauche EOF
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
    // InternalMyTurtleDsl.g:487:1: ruleRotationGauche : ( ( rule__RotationGauche__Group__0 ) ) ;
    public final void ruleRotationGauche() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:491:2: ( ( ( rule__RotationGauche__Group__0 ) ) )
            // InternalMyTurtleDsl.g:492:2: ( ( rule__RotationGauche__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:492:2: ( ( rule__RotationGauche__Group__0 ) )
            // InternalMyTurtleDsl.g:493:3: ( rule__RotationGauche__Group__0 )
            {
             before(grammarAccess.getRotationGaucheAccess().getGroup()); 
            // InternalMyTurtleDsl.g:494:3: ( rule__RotationGauche__Group__0 )
            // InternalMyTurtleDsl.g:494:4: rule__RotationGauche__Group__0
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
    // InternalMyTurtleDsl.g:503:1: entryRuleRotationDroite : ruleRotationDroite EOF ;
    public final void entryRuleRotationDroite() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:504:1: ( ruleRotationDroite EOF )
            // InternalMyTurtleDsl.g:505:1: ruleRotationDroite EOF
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
    // InternalMyTurtleDsl.g:512:1: ruleRotationDroite : ( ( rule__RotationDroite__Group__0 ) ) ;
    public final void ruleRotationDroite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:516:2: ( ( ( rule__RotationDroite__Group__0 ) ) )
            // InternalMyTurtleDsl.g:517:2: ( ( rule__RotationDroite__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:517:2: ( ( rule__RotationDroite__Group__0 ) )
            // InternalMyTurtleDsl.g:518:3: ( rule__RotationDroite__Group__0 )
            {
             before(grammarAccess.getRotationDroiteAccess().getGroup()); 
            // InternalMyTurtleDsl.g:519:3: ( rule__RotationDroite__Group__0 )
            // InternalMyTurtleDsl.g:519:4: rule__RotationDroite__Group__0
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
    // InternalMyTurtleDsl.g:528:1: entryRuleStart : ruleStart EOF ;
    public final void entryRuleStart() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:529:1: ( ruleStart EOF )
            // InternalMyTurtleDsl.g:530:1: ruleStart EOF
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
    // InternalMyTurtleDsl.g:537:1: ruleStart : ( ruleDecoller ) ;
    public final void ruleStart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:541:2: ( ( ruleDecoller ) )
            // InternalMyTurtleDsl.g:542:2: ( ruleDecoller )
            {
            // InternalMyTurtleDsl.g:542:2: ( ruleDecoller )
            // InternalMyTurtleDsl.g:543:3: ruleDecoller
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
    // InternalMyTurtleDsl.g:553:1: entryRuleEnd : ruleEnd EOF ;
    public final void entryRuleEnd() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:554:1: ( ruleEnd EOF )
            // InternalMyTurtleDsl.g:555:1: ruleEnd EOF
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
    // InternalMyTurtleDsl.g:562:1: ruleEnd : ( ruleAtterrir ) ;
    public final void ruleEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:566:2: ( ( ruleAtterrir ) )
            // InternalMyTurtleDsl.g:567:2: ( ruleAtterrir )
            {
            // InternalMyTurtleDsl.g:567:2: ( ruleAtterrir )
            // InternalMyTurtleDsl.g:568:3: ruleAtterrir
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
    // InternalMyTurtleDsl.g:578:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:579:1: ( ruleStatement EOF )
            // InternalMyTurtleDsl.g:580:1: ruleStatement EOF
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
    // InternalMyTurtleDsl.g:587:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:591:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalMyTurtleDsl.g:592:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalMyTurtleDsl.g:592:2: ( ( rule__Statement__Alternatives ) )
            // InternalMyTurtleDsl.g:593:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalMyTurtleDsl.g:594:3: ( rule__Statement__Alternatives )
            // InternalMyTurtleDsl.g:594:4: rule__Statement__Alternatives
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
    // InternalMyTurtleDsl.g:603:1: entryRuleFonctionDecl : ruleFonctionDecl EOF ;
    public final void entryRuleFonctionDecl() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:604:1: ( ruleFonctionDecl EOF )
            // InternalMyTurtleDsl.g:605:1: ruleFonctionDecl EOF
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
    // InternalMyTurtleDsl.g:612:1: ruleFonctionDecl : ( ( rule__FonctionDecl__Group__0 ) ) ;
    public final void ruleFonctionDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:616:2: ( ( ( rule__FonctionDecl__Group__0 ) ) )
            // InternalMyTurtleDsl.g:617:2: ( ( rule__FonctionDecl__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:617:2: ( ( rule__FonctionDecl__Group__0 ) )
            // InternalMyTurtleDsl.g:618:3: ( rule__FonctionDecl__Group__0 )
            {
             before(grammarAccess.getFonctionDeclAccess().getGroup()); 
            // InternalMyTurtleDsl.g:619:3: ( rule__FonctionDecl__Group__0 )
            // InternalMyTurtleDsl.g:619:4: rule__FonctionDecl__Group__0
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
    // InternalMyTurtleDsl.g:628:1: entryRuleIntConstante : ruleIntConstante EOF ;
    public final void entryRuleIntConstante() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:629:1: ( ruleIntConstante EOF )
            // InternalMyTurtleDsl.g:630:1: ruleIntConstante EOF
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
    // InternalMyTurtleDsl.g:637:1: ruleIntConstante : ( ( rule__IntConstante__ValAssignment ) ) ;
    public final void ruleIntConstante() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:641:2: ( ( ( rule__IntConstante__ValAssignment ) ) )
            // InternalMyTurtleDsl.g:642:2: ( ( rule__IntConstante__ValAssignment ) )
            {
            // InternalMyTurtleDsl.g:642:2: ( ( rule__IntConstante__ValAssignment ) )
            // InternalMyTurtleDsl.g:643:3: ( rule__IntConstante__ValAssignment )
            {
             before(grammarAccess.getIntConstanteAccess().getValAssignment()); 
            // InternalMyTurtleDsl.g:644:3: ( rule__IntConstante__ValAssignment )
            // InternalMyTurtleDsl.g:644:4: rule__IntConstante__ValAssignment
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
    // InternalMyTurtleDsl.g:653:1: entryRuleIntDecl : ruleIntDecl EOF ;
    public final void entryRuleIntDecl() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:654:1: ( ruleIntDecl EOF )
            // InternalMyTurtleDsl.g:655:1: ruleIntDecl EOF
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
    // InternalMyTurtleDsl.g:662:1: ruleIntDecl : ( ( rule__IntDecl__Group__0 ) ) ;
    public final void ruleIntDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:666:2: ( ( ( rule__IntDecl__Group__0 ) ) )
            // InternalMyTurtleDsl.g:667:2: ( ( rule__IntDecl__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:667:2: ( ( rule__IntDecl__Group__0 ) )
            // InternalMyTurtleDsl.g:668:3: ( rule__IntDecl__Group__0 )
            {
             before(grammarAccess.getIntDeclAccess().getGroup()); 
            // InternalMyTurtleDsl.g:669:3: ( rule__IntDecl__Group__0 )
            // InternalMyTurtleDsl.g:669:4: rule__IntDecl__Group__0
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
    // InternalMyTurtleDsl.g:678:1: entryRulePourcentDecl : rulePourcentDecl EOF ;
    public final void entryRulePourcentDecl() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:679:1: ( rulePourcentDecl EOF )
            // InternalMyTurtleDsl.g:680:1: rulePourcentDecl EOF
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
    // InternalMyTurtleDsl.g:687:1: rulePourcentDecl : ( ( rule__PourcentDecl__Group__0 ) ) ;
    public final void rulePourcentDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:691:2: ( ( ( rule__PourcentDecl__Group__0 ) ) )
            // InternalMyTurtleDsl.g:692:2: ( ( rule__PourcentDecl__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:692:2: ( ( rule__PourcentDecl__Group__0 ) )
            // InternalMyTurtleDsl.g:693:3: ( rule__PourcentDecl__Group__0 )
            {
             before(grammarAccess.getPourcentDeclAccess().getGroup()); 
            // InternalMyTurtleDsl.g:694:3: ( rule__PourcentDecl__Group__0 )
            // InternalMyTurtleDsl.g:694:4: rule__PourcentDecl__Group__0
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
    // InternalMyTurtleDsl.g:703:1: entryRuleRefIntVar : ruleRefIntVar EOF ;
    public final void entryRuleRefIntVar() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:704:1: ( ruleRefIntVar EOF )
            // InternalMyTurtleDsl.g:705:1: ruleRefIntVar EOF
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
    // InternalMyTurtleDsl.g:712:1: ruleRefIntVar : ( ( rule__RefIntVar__VarAssignment ) ) ;
    public final void ruleRefIntVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:716:2: ( ( ( rule__RefIntVar__VarAssignment ) ) )
            // InternalMyTurtleDsl.g:717:2: ( ( rule__RefIntVar__VarAssignment ) )
            {
            // InternalMyTurtleDsl.g:717:2: ( ( rule__RefIntVar__VarAssignment ) )
            // InternalMyTurtleDsl.g:718:3: ( rule__RefIntVar__VarAssignment )
            {
             before(grammarAccess.getRefIntVarAccess().getVarAssignment()); 
            // InternalMyTurtleDsl.g:719:3: ( rule__RefIntVar__VarAssignment )
            // InternalMyTurtleDsl.g:719:4: rule__RefIntVar__VarAssignment
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
    // InternalMyTurtleDsl.g:728:1: entryRuleIntExp : ruleIntExp EOF ;
    public final void entryRuleIntExp() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:729:1: ( ruleIntExp EOF )
            // InternalMyTurtleDsl.g:730:1: ruleIntExp EOF
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
    // InternalMyTurtleDsl.g:737:1: ruleIntExp : ( ( rule__IntExp__Alternatives ) ) ;
    public final void ruleIntExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:741:2: ( ( ( rule__IntExp__Alternatives ) ) )
            // InternalMyTurtleDsl.g:742:2: ( ( rule__IntExp__Alternatives ) )
            {
            // InternalMyTurtleDsl.g:742:2: ( ( rule__IntExp__Alternatives ) )
            // InternalMyTurtleDsl.g:743:3: ( rule__IntExp__Alternatives )
            {
             before(grammarAccess.getIntExpAccess().getAlternatives()); 
            // InternalMyTurtleDsl.g:744:3: ( rule__IntExp__Alternatives )
            // InternalMyTurtleDsl.g:744:4: rule__IntExp__Alternatives
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
    // InternalMyTurtleDsl.g:753:1: entryRuleFonctionCall : ruleFonctionCall EOF ;
    public final void entryRuleFonctionCall() throws RecognitionException {
        try {
            // InternalMyTurtleDsl.g:754:1: ( ruleFonctionCall EOF )
            // InternalMyTurtleDsl.g:755:1: ruleFonctionCall EOF
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
    // InternalMyTurtleDsl.g:762:1: ruleFonctionCall : ( ( rule__FonctionCall__Group__0 ) ) ;
    public final void ruleFonctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:766:2: ( ( ( rule__FonctionCall__Group__0 ) ) )
            // InternalMyTurtleDsl.g:767:2: ( ( rule__FonctionCall__Group__0 ) )
            {
            // InternalMyTurtleDsl.g:767:2: ( ( rule__FonctionCall__Group__0 ) )
            // InternalMyTurtleDsl.g:768:3: ( rule__FonctionCall__Group__0 )
            {
             before(grammarAccess.getFonctionCallAccess().getGroup()); 
            // InternalMyTurtleDsl.g:769:3: ( rule__FonctionCall__Group__0 )
            // InternalMyTurtleDsl.g:769:4: rule__FonctionCall__Group__0
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


    // $ANTLR start "rule__Model__Alternatives_7"
    // InternalMyTurtleDsl.g:777:1: rule__Model__Alternatives_7 : ( ( ( rule__Model__SeconDecAssignment_7_0 ) ) | ( ( rule__Model__PourDecAssignment_7_1 ) ) | ( ( rule__Model__StatementsAssignment_7_2 ) ) | ( ( rule__Model__FonctionsAssignment_7_3 ) ) | ( ( rule__Model__ParalleleAssignment_7_4 ) ) );
    public final void rule__Model__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:781:1: ( ( ( rule__Model__SeconDecAssignment_7_0 ) ) | ( ( rule__Model__PourDecAssignment_7_1 ) ) | ( ( rule__Model__StatementsAssignment_7_2 ) ) | ( ( rule__Model__FonctionsAssignment_7_3 ) ) | ( ( rule__Model__ParalleleAssignment_7_4 ) ) )
            int alt2=5;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalMyTurtleDsl.g:782:2: ( ( rule__Model__SeconDecAssignment_7_0 ) )
                    {
                    // InternalMyTurtleDsl.g:782:2: ( ( rule__Model__SeconDecAssignment_7_0 ) )
                    // InternalMyTurtleDsl.g:783:3: ( rule__Model__SeconDecAssignment_7_0 )
                    {
                     before(grammarAccess.getModelAccess().getSeconDecAssignment_7_0()); 
                    // InternalMyTurtleDsl.g:784:3: ( rule__Model__SeconDecAssignment_7_0 )
                    // InternalMyTurtleDsl.g:784:4: rule__Model__SeconDecAssignment_7_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__SeconDecAssignment_7_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getSeconDecAssignment_7_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyTurtleDsl.g:788:2: ( ( rule__Model__PourDecAssignment_7_1 ) )
                    {
                    // InternalMyTurtleDsl.g:788:2: ( ( rule__Model__PourDecAssignment_7_1 ) )
                    // InternalMyTurtleDsl.g:789:3: ( rule__Model__PourDecAssignment_7_1 )
                    {
                     before(grammarAccess.getModelAccess().getPourDecAssignment_7_1()); 
                    // InternalMyTurtleDsl.g:790:3: ( rule__Model__PourDecAssignment_7_1 )
                    // InternalMyTurtleDsl.g:790:4: rule__Model__PourDecAssignment_7_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__PourDecAssignment_7_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getPourDecAssignment_7_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyTurtleDsl.g:794:2: ( ( rule__Model__StatementsAssignment_7_2 ) )
                    {
                    // InternalMyTurtleDsl.g:794:2: ( ( rule__Model__StatementsAssignment_7_2 ) )
                    // InternalMyTurtleDsl.g:795:3: ( rule__Model__StatementsAssignment_7_2 )
                    {
                     before(grammarAccess.getModelAccess().getStatementsAssignment_7_2()); 
                    // InternalMyTurtleDsl.g:796:3: ( rule__Model__StatementsAssignment_7_2 )
                    // InternalMyTurtleDsl.g:796:4: rule__Model__StatementsAssignment_7_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__StatementsAssignment_7_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getStatementsAssignment_7_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyTurtleDsl.g:800:2: ( ( rule__Model__FonctionsAssignment_7_3 ) )
                    {
                    // InternalMyTurtleDsl.g:800:2: ( ( rule__Model__FonctionsAssignment_7_3 ) )
                    // InternalMyTurtleDsl.g:801:3: ( rule__Model__FonctionsAssignment_7_3 )
                    {
                     before(grammarAccess.getModelAccess().getFonctionsAssignment_7_3()); 
                    // InternalMyTurtleDsl.g:802:3: ( rule__Model__FonctionsAssignment_7_3 )
                    // InternalMyTurtleDsl.g:802:4: rule__Model__FonctionsAssignment_7_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__FonctionsAssignment_7_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getFonctionsAssignment_7_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyTurtleDsl.g:806:2: ( ( rule__Model__ParalleleAssignment_7_4 ) )
                    {
                    // InternalMyTurtleDsl.g:806:2: ( ( rule__Model__ParalleleAssignment_7_4 ) )
                    // InternalMyTurtleDsl.g:807:3: ( rule__Model__ParalleleAssignment_7_4 )
                    {
                     before(grammarAccess.getModelAccess().getParalleleAssignment_7_4()); 
                    // InternalMyTurtleDsl.g:808:3: ( rule__Model__ParalleleAssignment_7_4 )
                    // InternalMyTurtleDsl.g:808:4: rule__Model__ParalleleAssignment_7_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__ParalleleAssignment_7_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getParalleleAssignment_7_4()); 

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
    // $ANTLR end "rule__Model__Alternatives_7"


    // $ANTLR start "rule__Model__ParalleleAlternatives_7_4_0"
    // InternalMyTurtleDsl.g:816:1: rule__Model__ParalleleAlternatives_7_4_0 : ( ( ruleParallele2 ) | ( ruleParallele3 ) );
    public final void rule__Model__ParalleleAlternatives_7_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:820:1: ( ( ruleParallele2 ) | ( ruleParallele3 ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalMyTurtleDsl.g:821:2: ( ruleParallele2 )
                    {
                    // InternalMyTurtleDsl.g:821:2: ( ruleParallele2 )
                    // InternalMyTurtleDsl.g:822:3: ruleParallele2
                    {
                     before(grammarAccess.getModelAccess().getParalleleParallele2ParserRuleCall_7_4_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleParallele2();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getParalleleParallele2ParserRuleCall_7_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyTurtleDsl.g:827:2: ( ruleParallele3 )
                    {
                    // InternalMyTurtleDsl.g:827:2: ( ruleParallele3 )
                    // InternalMyTurtleDsl.g:828:3: ruleParallele3
                    {
                     before(grammarAccess.getModelAccess().getParalleleParallele3ParserRuleCall_7_4_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleParallele3();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getParalleleParallele3ParserRuleCall_7_4_0_1()); 

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
    // $ANTLR end "rule__Model__ParalleleAlternatives_7_4_0"


    // $ANTLR start "rule__MD__Alternatives"
    // InternalMyTurtleDsl.g:837:1: rule__MD__Alternatives : ( ( ruleMonter ) | ( ruleDescendre ) );
    public final void rule__MD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:841:1: ( ( ruleMonter ) | ( ruleDescendre ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            else if ( (LA4_0==27) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyTurtleDsl.g:842:2: ( ruleMonter )
                    {
                    // InternalMyTurtleDsl.g:842:2: ( ruleMonter )
                    // InternalMyTurtleDsl.g:843:3: ruleMonter
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
                    // InternalMyTurtleDsl.g:848:2: ( ruleDescendre )
                    {
                    // InternalMyTurtleDsl.g:848:2: ( ruleDescendre )
                    // InternalMyTurtleDsl.g:849:3: ruleDescendre
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
    // InternalMyTurtleDsl.g:858:1: rule__GDr__Alternatives : ( ( ruleGauche ) | ( ruleDroite ) );
    public final void rule__GDr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:862:1: ( ( ruleGauche ) | ( ruleDroite ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==30) ) {
                alt5=1;
            }
            else if ( (LA5_0==31) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyTurtleDsl.g:863:2: ( ruleGauche )
                    {
                    // InternalMyTurtleDsl.g:863:2: ( ruleGauche )
                    // InternalMyTurtleDsl.g:864:3: ruleGauche
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
                    // InternalMyTurtleDsl.g:869:2: ( ruleDroite )
                    {
                    // InternalMyTurtleDsl.g:869:2: ( ruleDroite )
                    // InternalMyTurtleDsl.g:870:3: ruleDroite
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
    // InternalMyTurtleDsl.g:879:1: rule__RGRD__Alternatives : ( ( ruleRotationGauche ) | ( ruleRotationDroite ) );
    public final void rule__RGRD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:883:1: ( ( ruleRotationGauche ) | ( ruleRotationDroite ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==32) ) {
                alt6=1;
            }
            else if ( (LA6_0==33) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyTurtleDsl.g:884:2: ( ruleRotationGauche )
                    {
                    // InternalMyTurtleDsl.g:884:2: ( ruleRotationGauche )
                    // InternalMyTurtleDsl.g:885:3: ruleRotationGauche
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
                    // InternalMyTurtleDsl.g:890:2: ( ruleRotationDroite )
                    {
                    // InternalMyTurtleDsl.g:890:2: ( ruleRotationDroite )
                    // InternalMyTurtleDsl.g:891:3: ruleRotationDroite
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
    // InternalMyTurtleDsl.g:900:1: rule__AR__Alternatives : ( ( ruleAvancer ) | ( ruleReculer ) );
    public final void rule__AR__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:904:1: ( ( ruleAvancer ) | ( ruleReculer ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            else if ( (LA7_0==29) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyTurtleDsl.g:905:2: ( ruleAvancer )
                    {
                    // InternalMyTurtleDsl.g:905:2: ( ruleAvancer )
                    // InternalMyTurtleDsl.g:906:3: ruleAvancer
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
                    // InternalMyTurtleDsl.g:911:2: ( ruleReculer )
                    {
                    // InternalMyTurtleDsl.g:911:2: ( ruleReculer )
                    // InternalMyTurtleDsl.g:912:3: ruleReculer
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
    // InternalMyTurtleDsl.g:921:1: rule__Parallele2__Alternatives : ( ( ( rule__Parallele2__Group_0__0 ) ) | ( ( rule__Parallele2__Group_1__0 ) ) | ( ( rule__Parallele2__Group_2__0 ) ) | ( ( rule__Parallele2__Group_3__0 ) ) | ( ( rule__Parallele2__Group_4__0 ) ) | ( ( rule__Parallele2__Group_5__0 ) ) | ( ( rule__Parallele2__Group_6__0 ) ) | ( ( rule__Parallele2__Group_7__0 ) ) | ( ( rule__Parallele2__Group_8__0 ) ) | ( ( rule__Parallele2__Group_9__0 ) ) | ( ( rule__Parallele2__Group_10__0 ) ) | ( ( rule__Parallele2__Group_11__0 ) ) );
    public final void rule__Parallele2__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:925:1: ( ( ( rule__Parallele2__Group_0__0 ) ) | ( ( rule__Parallele2__Group_1__0 ) ) | ( ( rule__Parallele2__Group_2__0 ) ) | ( ( rule__Parallele2__Group_3__0 ) ) | ( ( rule__Parallele2__Group_4__0 ) ) | ( ( rule__Parallele2__Group_5__0 ) ) | ( ( rule__Parallele2__Group_6__0 ) ) | ( ( rule__Parallele2__Group_7__0 ) ) | ( ( rule__Parallele2__Group_8__0 ) ) | ( ( rule__Parallele2__Group_9__0 ) ) | ( ( rule__Parallele2__Group_10__0 ) ) | ( ( rule__Parallele2__Group_11__0 ) ) )
            int alt8=12;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalMyTurtleDsl.g:926:2: ( ( rule__Parallele2__Group_0__0 ) )
                    {
                    // InternalMyTurtleDsl.g:926:2: ( ( rule__Parallele2__Group_0__0 ) )
                    // InternalMyTurtleDsl.g:927:3: ( rule__Parallele2__Group_0__0 )
                    {
                     before(grammarAccess.getParallele2Access().getGroup_0()); 
                    // InternalMyTurtleDsl.g:928:3: ( rule__Parallele2__Group_0__0 )
                    // InternalMyTurtleDsl.g:928:4: rule__Parallele2__Group_0__0
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
                    // InternalMyTurtleDsl.g:932:2: ( ( rule__Parallele2__Group_1__0 ) )
                    {
                    // InternalMyTurtleDsl.g:932:2: ( ( rule__Parallele2__Group_1__0 ) )
                    // InternalMyTurtleDsl.g:933:3: ( rule__Parallele2__Group_1__0 )
                    {
                     before(grammarAccess.getParallele2Access().getGroup_1()); 
                    // InternalMyTurtleDsl.g:934:3: ( rule__Parallele2__Group_1__0 )
                    // InternalMyTurtleDsl.g:934:4: rule__Parallele2__Group_1__0
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
                    // InternalMyTurtleDsl.g:938:2: ( ( rule__Parallele2__Group_2__0 ) )
                    {
                    // InternalMyTurtleDsl.g:938:2: ( ( rule__Parallele2__Group_2__0 ) )
                    // InternalMyTurtleDsl.g:939:3: ( rule__Parallele2__Group_2__0 )
                    {
                     before(grammarAccess.getParallele2Access().getGroup_2()); 
                    // InternalMyTurtleDsl.g:940:3: ( rule__Parallele2__Group_2__0 )
                    // InternalMyTurtleDsl.g:940:4: rule__Parallele2__Group_2__0
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
                    // InternalMyTurtleDsl.g:944:2: ( ( rule__Parallele2__Group_3__0 ) )
                    {
                    // InternalMyTurtleDsl.g:944:2: ( ( rule__Parallele2__Group_3__0 ) )
                    // InternalMyTurtleDsl.g:945:3: ( rule__Parallele2__Group_3__0 )
                    {
                     before(grammarAccess.getParallele2Access().getGroup_3()); 
                    // InternalMyTurtleDsl.g:946:3: ( rule__Parallele2__Group_3__0 )
                    // InternalMyTurtleDsl.g:946:4: rule__Parallele2__Group_3__0
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
                    // InternalMyTurtleDsl.g:950:2: ( ( rule__Parallele2__Group_4__0 ) )
                    {
                    // InternalMyTurtleDsl.g:950:2: ( ( rule__Parallele2__Group_4__0 ) )
                    // InternalMyTurtleDsl.g:951:3: ( rule__Parallele2__Group_4__0 )
                    {
                     before(grammarAccess.getParallele2Access().getGroup_4()); 
                    // InternalMyTurtleDsl.g:952:3: ( rule__Parallele2__Group_4__0 )
                    // InternalMyTurtleDsl.g:952:4: rule__Parallele2__Group_4__0
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
                    // InternalMyTurtleDsl.g:956:2: ( ( rule__Parallele2__Group_5__0 ) )
                    {
                    // InternalMyTurtleDsl.g:956:2: ( ( rule__Parallele2__Group_5__0 ) )
                    // InternalMyTurtleDsl.g:957:3: ( rule__Parallele2__Group_5__0 )
                    {
                     before(grammarAccess.getParallele2Access().getGroup_5()); 
                    // InternalMyTurtleDsl.g:958:3: ( rule__Parallele2__Group_5__0 )
                    // InternalMyTurtleDsl.g:958:4: rule__Parallele2__Group_5__0
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
                    // InternalMyTurtleDsl.g:962:2: ( ( rule__Parallele2__Group_6__0 ) )
                    {
                    // InternalMyTurtleDsl.g:962:2: ( ( rule__Parallele2__Group_6__0 ) )
                    // InternalMyTurtleDsl.g:963:3: ( rule__Parallele2__Group_6__0 )
                    {
                     before(grammarAccess.getParallele2Access().getGroup_6()); 
                    // InternalMyTurtleDsl.g:964:3: ( rule__Parallele2__Group_6__0 )
                    // InternalMyTurtleDsl.g:964:4: rule__Parallele2__Group_6__0
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
                    // InternalMyTurtleDsl.g:968:2: ( ( rule__Parallele2__Group_7__0 ) )
                    {
                    // InternalMyTurtleDsl.g:968:2: ( ( rule__Parallele2__Group_7__0 ) )
                    // InternalMyTurtleDsl.g:969:3: ( rule__Parallele2__Group_7__0 )
                    {
                     before(grammarAccess.getParallele2Access().getGroup_7()); 
                    // InternalMyTurtleDsl.g:970:3: ( rule__Parallele2__Group_7__0 )
                    // InternalMyTurtleDsl.g:970:4: rule__Parallele2__Group_7__0
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
                    // InternalMyTurtleDsl.g:974:2: ( ( rule__Parallele2__Group_8__0 ) )
                    {
                    // InternalMyTurtleDsl.g:974:2: ( ( rule__Parallele2__Group_8__0 ) )
                    // InternalMyTurtleDsl.g:975:3: ( rule__Parallele2__Group_8__0 )
                    {
                     before(grammarAccess.getParallele2Access().getGroup_8()); 
                    // InternalMyTurtleDsl.g:976:3: ( rule__Parallele2__Group_8__0 )
                    // InternalMyTurtleDsl.g:976:4: rule__Parallele2__Group_8__0
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
                    // InternalMyTurtleDsl.g:980:2: ( ( rule__Parallele2__Group_9__0 ) )
                    {
                    // InternalMyTurtleDsl.g:980:2: ( ( rule__Parallele2__Group_9__0 ) )
                    // InternalMyTurtleDsl.g:981:3: ( rule__Parallele2__Group_9__0 )
                    {
                     before(grammarAccess.getParallele2Access().getGroup_9()); 
                    // InternalMyTurtleDsl.g:982:3: ( rule__Parallele2__Group_9__0 )
                    // InternalMyTurtleDsl.g:982:4: rule__Parallele2__Group_9__0
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
                    // InternalMyTurtleDsl.g:986:2: ( ( rule__Parallele2__Group_10__0 ) )
                    {
                    // InternalMyTurtleDsl.g:986:2: ( ( rule__Parallele2__Group_10__0 ) )
                    // InternalMyTurtleDsl.g:987:3: ( rule__Parallele2__Group_10__0 )
                    {
                     before(grammarAccess.getParallele2Access().getGroup_10()); 
                    // InternalMyTurtleDsl.g:988:3: ( rule__Parallele2__Group_10__0 )
                    // InternalMyTurtleDsl.g:988:4: rule__Parallele2__Group_10__0
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
                    // InternalMyTurtleDsl.g:992:2: ( ( rule__Parallele2__Group_11__0 ) )
                    {
                    // InternalMyTurtleDsl.g:992:2: ( ( rule__Parallele2__Group_11__0 ) )
                    // InternalMyTurtleDsl.g:993:3: ( rule__Parallele2__Group_11__0 )
                    {
                     before(grammarAccess.getParallele2Access().getGroup_11()); 
                    // InternalMyTurtleDsl.g:994:3: ( rule__Parallele2__Group_11__0 )
                    // InternalMyTurtleDsl.g:994:4: rule__Parallele2__Group_11__0
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
    // InternalMyTurtleDsl.g:1002:1: rule__Parallele3__Alternatives : ( ( ( rule__Parallele3__Group_0__0 ) ) | ( ( rule__Parallele3__Group_1__0 ) ) | ( ( rule__Parallele3__Group_2__0 ) ) | ( ( rule__Parallele3__Group_3__0 ) ) | ( ( rule__Parallele3__Group_4__0 ) ) | ( ( rule__Parallele3__Group_5__0 ) ) | ( ( rule__Parallele3__Group_6__0 ) ) | ( ( rule__Parallele3__Group_7__0 ) ) | ( ( rule__Parallele3__Group_8__0 ) ) | ( ( rule__Parallele3__Group_9__0 ) ) | ( ( rule__Parallele3__Group_10__0 ) ) | ( ( rule__Parallele3__Group_11__0 ) ) | ( ( rule__Parallele3__Group_12__0 ) ) | ( ( rule__Parallele3__Group_13__0 ) ) | ( ( rule__Parallele3__Group_14__0 ) ) | ( ( rule__Parallele3__Group_15__0 ) ) | ( ( rule__Parallele3__Group_16__0 ) ) | ( ( rule__Parallele3__Group_17__0 ) ) | ( ( rule__Parallele3__Group_18__0 ) ) | ( ( rule__Parallele3__Group_19__0 ) ) | ( ( rule__Parallele3__Group_20__0 ) ) | ( ( rule__Parallele3__Group_21__0 ) ) | ( ( rule__Parallele3__Group_22__0 ) ) | ( ( rule__Parallele3__Group_23__0 ) ) );
    public final void rule__Parallele3__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1006:1: ( ( ( rule__Parallele3__Group_0__0 ) ) | ( ( rule__Parallele3__Group_1__0 ) ) | ( ( rule__Parallele3__Group_2__0 ) ) | ( ( rule__Parallele3__Group_3__0 ) ) | ( ( rule__Parallele3__Group_4__0 ) ) | ( ( rule__Parallele3__Group_5__0 ) ) | ( ( rule__Parallele3__Group_6__0 ) ) | ( ( rule__Parallele3__Group_7__0 ) ) | ( ( rule__Parallele3__Group_8__0 ) ) | ( ( rule__Parallele3__Group_9__0 ) ) | ( ( rule__Parallele3__Group_10__0 ) ) | ( ( rule__Parallele3__Group_11__0 ) ) | ( ( rule__Parallele3__Group_12__0 ) ) | ( ( rule__Parallele3__Group_13__0 ) ) | ( ( rule__Parallele3__Group_14__0 ) ) | ( ( rule__Parallele3__Group_15__0 ) ) | ( ( rule__Parallele3__Group_16__0 ) ) | ( ( rule__Parallele3__Group_17__0 ) ) | ( ( rule__Parallele3__Group_18__0 ) ) | ( ( rule__Parallele3__Group_19__0 ) ) | ( ( rule__Parallele3__Group_20__0 ) ) | ( ( rule__Parallele3__Group_21__0 ) ) | ( ( rule__Parallele3__Group_22__0 ) ) | ( ( rule__Parallele3__Group_23__0 ) ) )
            int alt9=24;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalMyTurtleDsl.g:1007:2: ( ( rule__Parallele3__Group_0__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1007:2: ( ( rule__Parallele3__Group_0__0 ) )
                    // InternalMyTurtleDsl.g:1008:3: ( rule__Parallele3__Group_0__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_0()); 
                    // InternalMyTurtleDsl.g:1009:3: ( rule__Parallele3__Group_0__0 )
                    // InternalMyTurtleDsl.g:1009:4: rule__Parallele3__Group_0__0
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
                    // InternalMyTurtleDsl.g:1013:2: ( ( rule__Parallele3__Group_1__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1013:2: ( ( rule__Parallele3__Group_1__0 ) )
                    // InternalMyTurtleDsl.g:1014:3: ( rule__Parallele3__Group_1__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_1()); 
                    // InternalMyTurtleDsl.g:1015:3: ( rule__Parallele3__Group_1__0 )
                    // InternalMyTurtleDsl.g:1015:4: rule__Parallele3__Group_1__0
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
                    // InternalMyTurtleDsl.g:1019:2: ( ( rule__Parallele3__Group_2__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1019:2: ( ( rule__Parallele3__Group_2__0 ) )
                    // InternalMyTurtleDsl.g:1020:3: ( rule__Parallele3__Group_2__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_2()); 
                    // InternalMyTurtleDsl.g:1021:3: ( rule__Parallele3__Group_2__0 )
                    // InternalMyTurtleDsl.g:1021:4: rule__Parallele3__Group_2__0
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
                    // InternalMyTurtleDsl.g:1025:2: ( ( rule__Parallele3__Group_3__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1025:2: ( ( rule__Parallele3__Group_3__0 ) )
                    // InternalMyTurtleDsl.g:1026:3: ( rule__Parallele3__Group_3__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_3()); 
                    // InternalMyTurtleDsl.g:1027:3: ( rule__Parallele3__Group_3__0 )
                    // InternalMyTurtleDsl.g:1027:4: rule__Parallele3__Group_3__0
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
                    // InternalMyTurtleDsl.g:1031:2: ( ( rule__Parallele3__Group_4__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1031:2: ( ( rule__Parallele3__Group_4__0 ) )
                    // InternalMyTurtleDsl.g:1032:3: ( rule__Parallele3__Group_4__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_4()); 
                    // InternalMyTurtleDsl.g:1033:3: ( rule__Parallele3__Group_4__0 )
                    // InternalMyTurtleDsl.g:1033:4: rule__Parallele3__Group_4__0
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
                    // InternalMyTurtleDsl.g:1037:2: ( ( rule__Parallele3__Group_5__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1037:2: ( ( rule__Parallele3__Group_5__0 ) )
                    // InternalMyTurtleDsl.g:1038:3: ( rule__Parallele3__Group_5__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_5()); 
                    // InternalMyTurtleDsl.g:1039:3: ( rule__Parallele3__Group_5__0 )
                    // InternalMyTurtleDsl.g:1039:4: rule__Parallele3__Group_5__0
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
                    // InternalMyTurtleDsl.g:1043:2: ( ( rule__Parallele3__Group_6__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1043:2: ( ( rule__Parallele3__Group_6__0 ) )
                    // InternalMyTurtleDsl.g:1044:3: ( rule__Parallele3__Group_6__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_6()); 
                    // InternalMyTurtleDsl.g:1045:3: ( rule__Parallele3__Group_6__0 )
                    // InternalMyTurtleDsl.g:1045:4: rule__Parallele3__Group_6__0
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
                    // InternalMyTurtleDsl.g:1049:2: ( ( rule__Parallele3__Group_7__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1049:2: ( ( rule__Parallele3__Group_7__0 ) )
                    // InternalMyTurtleDsl.g:1050:3: ( rule__Parallele3__Group_7__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_7()); 
                    // InternalMyTurtleDsl.g:1051:3: ( rule__Parallele3__Group_7__0 )
                    // InternalMyTurtleDsl.g:1051:4: rule__Parallele3__Group_7__0
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
                    // InternalMyTurtleDsl.g:1055:2: ( ( rule__Parallele3__Group_8__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1055:2: ( ( rule__Parallele3__Group_8__0 ) )
                    // InternalMyTurtleDsl.g:1056:3: ( rule__Parallele3__Group_8__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_8()); 
                    // InternalMyTurtleDsl.g:1057:3: ( rule__Parallele3__Group_8__0 )
                    // InternalMyTurtleDsl.g:1057:4: rule__Parallele3__Group_8__0
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
                    // InternalMyTurtleDsl.g:1061:2: ( ( rule__Parallele3__Group_9__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1061:2: ( ( rule__Parallele3__Group_9__0 ) )
                    // InternalMyTurtleDsl.g:1062:3: ( rule__Parallele3__Group_9__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_9()); 
                    // InternalMyTurtleDsl.g:1063:3: ( rule__Parallele3__Group_9__0 )
                    // InternalMyTurtleDsl.g:1063:4: rule__Parallele3__Group_9__0
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
                    // InternalMyTurtleDsl.g:1067:2: ( ( rule__Parallele3__Group_10__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1067:2: ( ( rule__Parallele3__Group_10__0 ) )
                    // InternalMyTurtleDsl.g:1068:3: ( rule__Parallele3__Group_10__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_10()); 
                    // InternalMyTurtleDsl.g:1069:3: ( rule__Parallele3__Group_10__0 )
                    // InternalMyTurtleDsl.g:1069:4: rule__Parallele3__Group_10__0
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
                    // InternalMyTurtleDsl.g:1073:2: ( ( rule__Parallele3__Group_11__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1073:2: ( ( rule__Parallele3__Group_11__0 ) )
                    // InternalMyTurtleDsl.g:1074:3: ( rule__Parallele3__Group_11__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_11()); 
                    // InternalMyTurtleDsl.g:1075:3: ( rule__Parallele3__Group_11__0 )
                    // InternalMyTurtleDsl.g:1075:4: rule__Parallele3__Group_11__0
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
                    // InternalMyTurtleDsl.g:1079:2: ( ( rule__Parallele3__Group_12__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1079:2: ( ( rule__Parallele3__Group_12__0 ) )
                    // InternalMyTurtleDsl.g:1080:3: ( rule__Parallele3__Group_12__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_12()); 
                    // InternalMyTurtleDsl.g:1081:3: ( rule__Parallele3__Group_12__0 )
                    // InternalMyTurtleDsl.g:1081:4: rule__Parallele3__Group_12__0
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
                    // InternalMyTurtleDsl.g:1085:2: ( ( rule__Parallele3__Group_13__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1085:2: ( ( rule__Parallele3__Group_13__0 ) )
                    // InternalMyTurtleDsl.g:1086:3: ( rule__Parallele3__Group_13__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_13()); 
                    // InternalMyTurtleDsl.g:1087:3: ( rule__Parallele3__Group_13__0 )
                    // InternalMyTurtleDsl.g:1087:4: rule__Parallele3__Group_13__0
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
                    // InternalMyTurtleDsl.g:1091:2: ( ( rule__Parallele3__Group_14__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1091:2: ( ( rule__Parallele3__Group_14__0 ) )
                    // InternalMyTurtleDsl.g:1092:3: ( rule__Parallele3__Group_14__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_14()); 
                    // InternalMyTurtleDsl.g:1093:3: ( rule__Parallele3__Group_14__0 )
                    // InternalMyTurtleDsl.g:1093:4: rule__Parallele3__Group_14__0
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
                    // InternalMyTurtleDsl.g:1097:2: ( ( rule__Parallele3__Group_15__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1097:2: ( ( rule__Parallele3__Group_15__0 ) )
                    // InternalMyTurtleDsl.g:1098:3: ( rule__Parallele3__Group_15__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_15()); 
                    // InternalMyTurtleDsl.g:1099:3: ( rule__Parallele3__Group_15__0 )
                    // InternalMyTurtleDsl.g:1099:4: rule__Parallele3__Group_15__0
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
                    // InternalMyTurtleDsl.g:1103:2: ( ( rule__Parallele3__Group_16__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1103:2: ( ( rule__Parallele3__Group_16__0 ) )
                    // InternalMyTurtleDsl.g:1104:3: ( rule__Parallele3__Group_16__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_16()); 
                    // InternalMyTurtleDsl.g:1105:3: ( rule__Parallele3__Group_16__0 )
                    // InternalMyTurtleDsl.g:1105:4: rule__Parallele3__Group_16__0
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
                    // InternalMyTurtleDsl.g:1109:2: ( ( rule__Parallele3__Group_17__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1109:2: ( ( rule__Parallele3__Group_17__0 ) )
                    // InternalMyTurtleDsl.g:1110:3: ( rule__Parallele3__Group_17__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_17()); 
                    // InternalMyTurtleDsl.g:1111:3: ( rule__Parallele3__Group_17__0 )
                    // InternalMyTurtleDsl.g:1111:4: rule__Parallele3__Group_17__0
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
                    // InternalMyTurtleDsl.g:1115:2: ( ( rule__Parallele3__Group_18__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1115:2: ( ( rule__Parallele3__Group_18__0 ) )
                    // InternalMyTurtleDsl.g:1116:3: ( rule__Parallele3__Group_18__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_18()); 
                    // InternalMyTurtleDsl.g:1117:3: ( rule__Parallele3__Group_18__0 )
                    // InternalMyTurtleDsl.g:1117:4: rule__Parallele3__Group_18__0
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
                    // InternalMyTurtleDsl.g:1121:2: ( ( rule__Parallele3__Group_19__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1121:2: ( ( rule__Parallele3__Group_19__0 ) )
                    // InternalMyTurtleDsl.g:1122:3: ( rule__Parallele3__Group_19__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_19()); 
                    // InternalMyTurtleDsl.g:1123:3: ( rule__Parallele3__Group_19__0 )
                    // InternalMyTurtleDsl.g:1123:4: rule__Parallele3__Group_19__0
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
                    // InternalMyTurtleDsl.g:1127:2: ( ( rule__Parallele3__Group_20__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1127:2: ( ( rule__Parallele3__Group_20__0 ) )
                    // InternalMyTurtleDsl.g:1128:3: ( rule__Parallele3__Group_20__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_20()); 
                    // InternalMyTurtleDsl.g:1129:3: ( rule__Parallele3__Group_20__0 )
                    // InternalMyTurtleDsl.g:1129:4: rule__Parallele3__Group_20__0
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
                    // InternalMyTurtleDsl.g:1133:2: ( ( rule__Parallele3__Group_21__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1133:2: ( ( rule__Parallele3__Group_21__0 ) )
                    // InternalMyTurtleDsl.g:1134:3: ( rule__Parallele3__Group_21__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_21()); 
                    // InternalMyTurtleDsl.g:1135:3: ( rule__Parallele3__Group_21__0 )
                    // InternalMyTurtleDsl.g:1135:4: rule__Parallele3__Group_21__0
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
                    // InternalMyTurtleDsl.g:1139:2: ( ( rule__Parallele3__Group_22__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1139:2: ( ( rule__Parallele3__Group_22__0 ) )
                    // InternalMyTurtleDsl.g:1140:3: ( rule__Parallele3__Group_22__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_22()); 
                    // InternalMyTurtleDsl.g:1141:3: ( rule__Parallele3__Group_22__0 )
                    // InternalMyTurtleDsl.g:1141:4: rule__Parallele3__Group_22__0
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
                    // InternalMyTurtleDsl.g:1145:2: ( ( rule__Parallele3__Group_23__0 ) )
                    {
                    // InternalMyTurtleDsl.g:1145:2: ( ( rule__Parallele3__Group_23__0 ) )
                    // InternalMyTurtleDsl.g:1146:3: ( rule__Parallele3__Group_23__0 )
                    {
                     before(grammarAccess.getParallele3Access().getGroup_23()); 
                    // InternalMyTurtleDsl.g:1147:3: ( rule__Parallele3__Group_23__0 )
                    // InternalMyTurtleDsl.g:1147:4: rule__Parallele3__Group_23__0
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


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalMyTurtleDsl.g:1155:1: rule__Statement__Alternatives : ( ( ruleAvancer ) | ( ruleDescendre ) | ( ruleRotationDroite ) | ( ruleRotationGauche ) | ( rulePause ) | ( ruleDroite ) | ( ruleGauche ) | ( ruleReculer ) | ( ruleMonter ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1159:1: ( ( ruleAvancer ) | ( ruleDescendre ) | ( ruleRotationDroite ) | ( ruleRotationGauche ) | ( rulePause ) | ( ruleDroite ) | ( ruleGauche ) | ( ruleReculer ) | ( ruleMonter ) )
            int alt10=9;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalMyTurtleDsl.g:1160:2: ( ruleAvancer )
                    {
                    // InternalMyTurtleDsl.g:1160:2: ( ruleAvancer )
                    // InternalMyTurtleDsl.g:1161:3: ruleAvancer
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
                    // InternalMyTurtleDsl.g:1166:2: ( ruleDescendre )
                    {
                    // InternalMyTurtleDsl.g:1166:2: ( ruleDescendre )
                    // InternalMyTurtleDsl.g:1167:3: ruleDescendre
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
                    // InternalMyTurtleDsl.g:1172:2: ( ruleRotationDroite )
                    {
                    // InternalMyTurtleDsl.g:1172:2: ( ruleRotationDroite )
                    // InternalMyTurtleDsl.g:1173:3: ruleRotationDroite
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
                    // InternalMyTurtleDsl.g:1178:2: ( ruleRotationGauche )
                    {
                    // InternalMyTurtleDsl.g:1178:2: ( ruleRotationGauche )
                    // InternalMyTurtleDsl.g:1179:3: ruleRotationGauche
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
                    // InternalMyTurtleDsl.g:1184:2: ( rulePause )
                    {
                    // InternalMyTurtleDsl.g:1184:2: ( rulePause )
                    // InternalMyTurtleDsl.g:1185:3: rulePause
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
                    // InternalMyTurtleDsl.g:1190:2: ( ruleDroite )
                    {
                    // InternalMyTurtleDsl.g:1190:2: ( ruleDroite )
                    // InternalMyTurtleDsl.g:1191:3: ruleDroite
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
                    // InternalMyTurtleDsl.g:1196:2: ( ruleGauche )
                    {
                    // InternalMyTurtleDsl.g:1196:2: ( ruleGauche )
                    // InternalMyTurtleDsl.g:1197:3: ruleGauche
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
                    // InternalMyTurtleDsl.g:1202:2: ( ruleReculer )
                    {
                    // InternalMyTurtleDsl.g:1202:2: ( ruleReculer )
                    // InternalMyTurtleDsl.g:1203:3: ruleReculer
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
                    // InternalMyTurtleDsl.g:1208:2: ( ruleMonter )
                    {
                    // InternalMyTurtleDsl.g:1208:2: ( ruleMonter )
                    // InternalMyTurtleDsl.g:1209:3: ruleMonter
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
    // InternalMyTurtleDsl.g:1218:1: rule__IntExp__Alternatives : ( ( ruleIntConstante ) | ( ruleRefIntVar ) );
    public final void rule__IntExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1222:1: ( ( ruleIntConstante ) | ( ruleRefIntVar ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyTurtleDsl.g:1223:2: ( ruleIntConstante )
                    {
                    // InternalMyTurtleDsl.g:1223:2: ( ruleIntConstante )
                    // InternalMyTurtleDsl.g:1224:3: ruleIntConstante
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
                    // InternalMyTurtleDsl.g:1229:2: ( ruleRefIntVar )
                    {
                    // InternalMyTurtleDsl.g:1229:2: ( ruleRefIntVar )
                    // InternalMyTurtleDsl.g:1230:3: ruleRefIntVar
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


    // $ANTLR start "rule__Model__Group__0"
    // InternalMyTurtleDsl.g:1239:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1243:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMyTurtleDsl.g:1244:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalMyTurtleDsl.g:1251:1: rule__Model__Group__0__Impl : ( ( rule__Model__IncludesAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1255:1: ( ( ( rule__Model__IncludesAssignment_0 )* ) )
            // InternalMyTurtleDsl.g:1256:1: ( ( rule__Model__IncludesAssignment_0 )* )
            {
            // InternalMyTurtleDsl.g:1256:1: ( ( rule__Model__IncludesAssignment_0 )* )
            // InternalMyTurtleDsl.g:1257:2: ( rule__Model__IncludesAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getIncludesAssignment_0()); 
            // InternalMyTurtleDsl.g:1258:2: ( rule__Model__IncludesAssignment_0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:1258:3: rule__Model__IncludesAssignment_0
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
    // InternalMyTurtleDsl.g:1266:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1270:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalMyTurtleDsl.g:1271:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalMyTurtleDsl.g:1278:1: rule__Model__Group__1__Impl : ( ( '\\n' )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1282:1: ( ( ( '\\n' )* ) )
            // InternalMyTurtleDsl.g:1283:1: ( ( '\\n' )* )
            {
            // InternalMyTurtleDsl.g:1283:1: ( ( '\\n' )* )
            // InternalMyTurtleDsl.g:1284:2: ( '\\n' )*
            {
             before(grammarAccess.getModelAccess().getLineFeedKeyword_1()); 
            // InternalMyTurtleDsl.g:1285:2: ( '\\n' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==12) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:1285:3: '\\n'
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
    // InternalMyTurtleDsl.g:1293:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1297:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalMyTurtleDsl.g:1298:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalMyTurtleDsl.g:1305:1: rule__Model__Group__2__Impl : ( 'func' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1309:1: ( ( 'func' ) )
            // InternalMyTurtleDsl.g:1310:1: ( 'func' )
            {
            // InternalMyTurtleDsl.g:1310:1: ( 'func' )
            // InternalMyTurtleDsl.g:1311:2: 'func'
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
    // InternalMyTurtleDsl.g:1320:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1324:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalMyTurtleDsl.g:1325:2: rule__Model__Group__3__Impl rule__Model__Group__4
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
    // InternalMyTurtleDsl.g:1332:1: rule__Model__Group__3__Impl : ( 'main' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1336:1: ( ( 'main' ) )
            // InternalMyTurtleDsl.g:1337:1: ( 'main' )
            {
            // InternalMyTurtleDsl.g:1337:1: ( 'main' )
            // InternalMyTurtleDsl.g:1338:2: 'main'
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
    // InternalMyTurtleDsl.g:1347:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1351:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalMyTurtleDsl.g:1352:2: rule__Model__Group__4__Impl rule__Model__Group__5
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
    // InternalMyTurtleDsl.g:1359:1: rule__Model__Group__4__Impl : ( '{' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1363:1: ( ( '{' ) )
            // InternalMyTurtleDsl.g:1364:1: ( '{' )
            {
            // InternalMyTurtleDsl.g:1364:1: ( '{' )
            // InternalMyTurtleDsl.g:1365:2: '{'
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
    // InternalMyTurtleDsl.g:1374:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1378:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalMyTurtleDsl.g:1379:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyTurtleDsl.g:1386:1: rule__Model__Group__5__Impl : ( ruleStart ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1390:1: ( ( ruleStart ) )
            // InternalMyTurtleDsl.g:1391:1: ( ruleStart )
            {
            // InternalMyTurtleDsl.g:1391:1: ( ruleStart )
            // InternalMyTurtleDsl.g:1392:2: ruleStart
            {
             before(grammarAccess.getModelAccess().getStartParserRuleCall_5()); 
            pushFollow(FOLLOW_2);
            ruleStart();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStartParserRuleCall_5()); 

            }


            }

        }
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
    // InternalMyTurtleDsl.g:1401:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1405:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // InternalMyTurtleDsl.g:1406:2: rule__Model__Group__6__Impl rule__Model__Group__7
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
    // InternalMyTurtleDsl.g:1413:1: rule__Model__Group__6__Impl : ( ( '\\n' )* ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1417:1: ( ( ( '\\n' )* ) )
            // InternalMyTurtleDsl.g:1418:1: ( ( '\\n' )* )
            {
            // InternalMyTurtleDsl.g:1418:1: ( ( '\\n' )* )
            // InternalMyTurtleDsl.g:1419:2: ( '\\n' )*
            {
             before(grammarAccess.getModelAccess().getLineFeedKeyword_6()); 
            // InternalMyTurtleDsl.g:1420:2: ( '\\n' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==12) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:1420:3: '\\n'
            	    {
            	    match(input,12,FOLLOW_6); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getLineFeedKeyword_6()); 

            }


            }

        }
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
    // InternalMyTurtleDsl.g:1428:1: rule__Model__Group__7 : rule__Model__Group__7__Impl rule__Model__Group__8 ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1432:1: ( rule__Model__Group__7__Impl rule__Model__Group__8 )
            // InternalMyTurtleDsl.g:1433:2: rule__Model__Group__7__Impl rule__Model__Group__8
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyTurtleDsl.g:1440:1: rule__Model__Group__7__Impl : ( ( rule__Model__Alternatives_7 )* ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1444:1: ( ( ( rule__Model__Alternatives_7 )* ) )
            // InternalMyTurtleDsl.g:1445:1: ( ( rule__Model__Alternatives_7 )* )
            {
            // InternalMyTurtleDsl.g:1445:1: ( ( rule__Model__Alternatives_7 )* )
            // InternalMyTurtleDsl.g:1446:2: ( rule__Model__Alternatives_7 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_7()); 
            // InternalMyTurtleDsl.g:1447:2: ( rule__Model__Alternatives_7 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==25||(LA15_0>=27 && LA15_0<=34)||LA15_0==36) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:1447:3: rule__Model__Alternatives_7
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Model__Alternatives_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlternatives_7()); 

            }


            }

        }
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
    // InternalMyTurtleDsl.g:1455:1: rule__Model__Group__8 : rule__Model__Group__8__Impl rule__Model__Group__9 ;
    public final void rule__Model__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1459:1: ( rule__Model__Group__8__Impl rule__Model__Group__9 )
            // InternalMyTurtleDsl.g:1460:2: rule__Model__Group__8__Impl rule__Model__Group__9
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyTurtleDsl.g:1467:1: rule__Model__Group__8__Impl : ( ( '\\n' )* ) ;
    public final void rule__Model__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1471:1: ( ( ( '\\n' )* ) )
            // InternalMyTurtleDsl.g:1472:1: ( ( '\\n' )* )
            {
            // InternalMyTurtleDsl.g:1472:1: ( ( '\\n' )* )
            // InternalMyTurtleDsl.g:1473:2: ( '\\n' )*
            {
             before(grammarAccess.getModelAccess().getLineFeedKeyword_8()); 
            // InternalMyTurtleDsl.g:1474:2: ( '\\n' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==12) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:1474:3: '\\n'
            	    {
            	    match(input,12,FOLLOW_6); 

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalMyTurtleDsl.g:1482:1: rule__Model__Group__9 : rule__Model__Group__9__Impl rule__Model__Group__10 ;
    public final void rule__Model__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1486:1: ( rule__Model__Group__9__Impl rule__Model__Group__10 )
            // InternalMyTurtleDsl.g:1487:2: rule__Model__Group__9__Impl rule__Model__Group__10
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
    // InternalMyTurtleDsl.g:1494:1: rule__Model__Group__9__Impl : ( ruleEnd ) ;
    public final void rule__Model__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1498:1: ( ( ruleEnd ) )
            // InternalMyTurtleDsl.g:1499:1: ( ruleEnd )
            {
            // InternalMyTurtleDsl.g:1499:1: ( ruleEnd )
            // InternalMyTurtleDsl.g:1500:2: ruleEnd
            {
             before(grammarAccess.getModelAccess().getEndParserRuleCall_9()); 
            pushFollow(FOLLOW_2);
            ruleEnd();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEndParserRuleCall_9()); 

            }


            }

        }
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
    // InternalMyTurtleDsl.g:1509:1: rule__Model__Group__10 : rule__Model__Group__10__Impl rule__Model__Group__11 ;
    public final void rule__Model__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1513:1: ( rule__Model__Group__10__Impl rule__Model__Group__11 )
            // InternalMyTurtleDsl.g:1514:2: rule__Model__Group__10__Impl rule__Model__Group__11
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
    // InternalMyTurtleDsl.g:1521:1: rule__Model__Group__10__Impl : ( ( '\\n' )* ) ;
    public final void rule__Model__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1525:1: ( ( ( '\\n' )* ) )
            // InternalMyTurtleDsl.g:1526:1: ( ( '\\n' )* )
            {
            // InternalMyTurtleDsl.g:1526:1: ( ( '\\n' )* )
            // InternalMyTurtleDsl.g:1527:2: ( '\\n' )*
            {
             before(grammarAccess.getModelAccess().getLineFeedKeyword_10()); 
            // InternalMyTurtleDsl.g:1528:2: ( '\\n' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==12) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:1528:3: '\\n'
            	    {
            	    match(input,12,FOLLOW_6); 

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalMyTurtleDsl.g:1536:1: rule__Model__Group__11 : rule__Model__Group__11__Impl rule__Model__Group__12 ;
    public final void rule__Model__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1540:1: ( rule__Model__Group__11__Impl rule__Model__Group__12 )
            // InternalMyTurtleDsl.g:1541:2: rule__Model__Group__11__Impl rule__Model__Group__12
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
    // InternalMyTurtleDsl.g:1548:1: rule__Model__Group__11__Impl : ( '}' ) ;
    public final void rule__Model__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1552:1: ( ( '}' ) )
            // InternalMyTurtleDsl.g:1553:1: ( '}' )
            {
            // InternalMyTurtleDsl.g:1553:1: ( '}' )
            // InternalMyTurtleDsl.g:1554:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_11()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
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
    // InternalMyTurtleDsl.g:1563:1: rule__Model__Group__12 : rule__Model__Group__12__Impl rule__Model__Group__13 ;
    public final void rule__Model__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1567:1: ( rule__Model__Group__12__Impl rule__Model__Group__13 )
            // InternalMyTurtleDsl.g:1568:2: rule__Model__Group__12__Impl rule__Model__Group__13
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
    // InternalMyTurtleDsl.g:1575:1: rule__Model__Group__12__Impl : ( ( '\\n' )* ) ;
    public final void rule__Model__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1579:1: ( ( ( '\\n' )* ) )
            // InternalMyTurtleDsl.g:1580:1: ( ( '\\n' )* )
            {
            // InternalMyTurtleDsl.g:1580:1: ( ( '\\n' )* )
            // InternalMyTurtleDsl.g:1581:2: ( '\\n' )*
            {
             before(grammarAccess.getModelAccess().getLineFeedKeyword_12()); 
            // InternalMyTurtleDsl.g:1582:2: ( '\\n' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==12) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:1582:3: '\\n'
            	    {
            	    match(input,12,FOLLOW_6); 

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalMyTurtleDsl.g:1590:1: rule__Model__Group__13 : rule__Model__Group__13__Impl rule__Model__Group__14 ;
    public final void rule__Model__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1594:1: ( rule__Model__Group__13__Impl rule__Model__Group__14 )
            // InternalMyTurtleDsl.g:1595:2: rule__Model__Group__13__Impl rule__Model__Group__14
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyTurtleDsl.g:1602:1: rule__Model__Group__13__Impl : ( ( rule__Model__FonctionsAssignment_13 )* ) ;
    public final void rule__Model__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1606:1: ( ( ( rule__Model__FonctionsAssignment_13 )* ) )
            // InternalMyTurtleDsl.g:1607:1: ( ( rule__Model__FonctionsAssignment_13 )* )
            {
            // InternalMyTurtleDsl.g:1607:1: ( ( rule__Model__FonctionsAssignment_13 )* )
            // InternalMyTurtleDsl.g:1608:2: ( rule__Model__FonctionsAssignment_13 )*
            {
             before(grammarAccess.getModelAccess().getFonctionsAssignment_13()); 
            // InternalMyTurtleDsl.g:1609:2: ( rule__Model__FonctionsAssignment_13 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==13) ) {
                    int LA19_2 = input.LA(2);

                    if ( (LA19_2==RULE_ID) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:1609:3: rule__Model__FonctionsAssignment_13
            	    {
            	    pushFollow(FOLLOW_14);
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
    // InternalMyTurtleDsl.g:1617:1: rule__Model__Group__14 : rule__Model__Group__14__Impl ;
    public final void rule__Model__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1621:1: ( rule__Model__Group__14__Impl )
            // InternalMyTurtleDsl.g:1622:2: rule__Model__Group__14__Impl
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
    // InternalMyTurtleDsl.g:1628:1: rule__Model__Group__14__Impl : ( ( '\\n' )* ) ;
    public final void rule__Model__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1632:1: ( ( ( '\\n' )* ) )
            // InternalMyTurtleDsl.g:1633:1: ( ( '\\n' )* )
            {
            // InternalMyTurtleDsl.g:1633:1: ( ( '\\n' )* )
            // InternalMyTurtleDsl.g:1634:2: ( '\\n' )*
            {
             before(grammarAccess.getModelAccess().getLineFeedKeyword_14()); 
            // InternalMyTurtleDsl.g:1635:2: ( '\\n' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==12) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:1635:3: '\\n'
            	    {
            	    match(input,12,FOLLOW_6); 

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


    // $ANTLR start "rule__Parallele2__Group_0__0"
    // InternalMyTurtleDsl.g:1644:1: rule__Parallele2__Group_0__0 : rule__Parallele2__Group_0__0__Impl rule__Parallele2__Group_0__1 ;
    public final void rule__Parallele2__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1648:1: ( rule__Parallele2__Group_0__0__Impl rule__Parallele2__Group_0__1 )
            // InternalMyTurtleDsl.g:1649:2: rule__Parallele2__Group_0__0__Impl rule__Parallele2__Group_0__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:1656:1: rule__Parallele2__Group_0__0__Impl : ( ( rule__Parallele2__AAssignment_0_0 ) ) ;
    public final void rule__Parallele2__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1660:1: ( ( ( rule__Parallele2__AAssignment_0_0 ) ) )
            // InternalMyTurtleDsl.g:1661:1: ( ( rule__Parallele2__AAssignment_0_0 ) )
            {
            // InternalMyTurtleDsl.g:1661:1: ( ( rule__Parallele2__AAssignment_0_0 ) )
            // InternalMyTurtleDsl.g:1662:2: ( rule__Parallele2__AAssignment_0_0 )
            {
             before(grammarAccess.getParallele2Access().getAAssignment_0_0()); 
            // InternalMyTurtleDsl.g:1663:2: ( rule__Parallele2__AAssignment_0_0 )
            // InternalMyTurtleDsl.g:1663:3: rule__Parallele2__AAssignment_0_0
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
    // InternalMyTurtleDsl.g:1671:1: rule__Parallele2__Group_0__1 : rule__Parallele2__Group_0__1__Impl rule__Parallele2__Group_0__2 ;
    public final void rule__Parallele2__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1675:1: ( rule__Parallele2__Group_0__1__Impl rule__Parallele2__Group_0__2 )
            // InternalMyTurtleDsl.g:1676:2: rule__Parallele2__Group_0__1__Impl rule__Parallele2__Group_0__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyTurtleDsl.g:1683:1: rule__Parallele2__Group_0__1__Impl : ( '&' ) ;
    public final void rule__Parallele2__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1687:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:1688:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:1688:1: ( '&' )
            // InternalMyTurtleDsl.g:1689:2: '&'
            {
             before(grammarAccess.getParallele2Access().getAmpersandKeyword_0_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:1698:1: rule__Parallele2__Group_0__2 : rule__Parallele2__Group_0__2__Impl ;
    public final void rule__Parallele2__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1702:1: ( rule__Parallele2__Group_0__2__Impl )
            // InternalMyTurtleDsl.g:1703:2: rule__Parallele2__Group_0__2__Impl
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
    // InternalMyTurtleDsl.g:1709:1: rule__Parallele2__Group_0__2__Impl : ( ( rule__Parallele2__TAssignment_0_2 ) ) ;
    public final void rule__Parallele2__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1713:1: ( ( ( rule__Parallele2__TAssignment_0_2 ) ) )
            // InternalMyTurtleDsl.g:1714:1: ( ( rule__Parallele2__TAssignment_0_2 ) )
            {
            // InternalMyTurtleDsl.g:1714:1: ( ( rule__Parallele2__TAssignment_0_2 ) )
            // InternalMyTurtleDsl.g:1715:2: ( rule__Parallele2__TAssignment_0_2 )
            {
             before(grammarAccess.getParallele2Access().getTAssignment_0_2()); 
            // InternalMyTurtleDsl.g:1716:2: ( rule__Parallele2__TAssignment_0_2 )
            // InternalMyTurtleDsl.g:1716:3: rule__Parallele2__TAssignment_0_2
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
    // InternalMyTurtleDsl.g:1725:1: rule__Parallele2__Group_1__0 : rule__Parallele2__Group_1__0__Impl rule__Parallele2__Group_1__1 ;
    public final void rule__Parallele2__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1729:1: ( rule__Parallele2__Group_1__0__Impl rule__Parallele2__Group_1__1 )
            // InternalMyTurtleDsl.g:1730:2: rule__Parallele2__Group_1__0__Impl rule__Parallele2__Group_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:1737:1: rule__Parallele2__Group_1__0__Impl : ( ( rule__Parallele2__AAssignment_1_0 ) ) ;
    public final void rule__Parallele2__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1741:1: ( ( ( rule__Parallele2__AAssignment_1_0 ) ) )
            // InternalMyTurtleDsl.g:1742:1: ( ( rule__Parallele2__AAssignment_1_0 ) )
            {
            // InternalMyTurtleDsl.g:1742:1: ( ( rule__Parallele2__AAssignment_1_0 ) )
            // InternalMyTurtleDsl.g:1743:2: ( rule__Parallele2__AAssignment_1_0 )
            {
             before(grammarAccess.getParallele2Access().getAAssignment_1_0()); 
            // InternalMyTurtleDsl.g:1744:2: ( rule__Parallele2__AAssignment_1_0 )
            // InternalMyTurtleDsl.g:1744:3: rule__Parallele2__AAssignment_1_0
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
    // InternalMyTurtleDsl.g:1752:1: rule__Parallele2__Group_1__1 : rule__Parallele2__Group_1__1__Impl rule__Parallele2__Group_1__2 ;
    public final void rule__Parallele2__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1756:1: ( rule__Parallele2__Group_1__1__Impl rule__Parallele2__Group_1__2 )
            // InternalMyTurtleDsl.g:1757:2: rule__Parallele2__Group_1__1__Impl rule__Parallele2__Group_1__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyTurtleDsl.g:1764:1: rule__Parallele2__Group_1__1__Impl : ( '&' ) ;
    public final void rule__Parallele2__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1768:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:1769:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:1769:1: ( '&' )
            // InternalMyTurtleDsl.g:1770:2: '&'
            {
             before(grammarAccess.getParallele2Access().getAmpersandKeyword_1_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:1779:1: rule__Parallele2__Group_1__2 : rule__Parallele2__Group_1__2__Impl ;
    public final void rule__Parallele2__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1783:1: ( rule__Parallele2__Group_1__2__Impl )
            // InternalMyTurtleDsl.g:1784:2: rule__Parallele2__Group_1__2__Impl
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
    // InternalMyTurtleDsl.g:1790:1: rule__Parallele2__Group_1__2__Impl : ( ( rule__Parallele2__TAssignment_1_2 ) ) ;
    public final void rule__Parallele2__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1794:1: ( ( ( rule__Parallele2__TAssignment_1_2 ) ) )
            // InternalMyTurtleDsl.g:1795:1: ( ( rule__Parallele2__TAssignment_1_2 ) )
            {
            // InternalMyTurtleDsl.g:1795:1: ( ( rule__Parallele2__TAssignment_1_2 ) )
            // InternalMyTurtleDsl.g:1796:2: ( rule__Parallele2__TAssignment_1_2 )
            {
             before(grammarAccess.getParallele2Access().getTAssignment_1_2()); 
            // InternalMyTurtleDsl.g:1797:2: ( rule__Parallele2__TAssignment_1_2 )
            // InternalMyTurtleDsl.g:1797:3: rule__Parallele2__TAssignment_1_2
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
    // InternalMyTurtleDsl.g:1806:1: rule__Parallele2__Group_2__0 : rule__Parallele2__Group_2__0__Impl rule__Parallele2__Group_2__1 ;
    public final void rule__Parallele2__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1810:1: ( rule__Parallele2__Group_2__0__Impl rule__Parallele2__Group_2__1 )
            // InternalMyTurtleDsl.g:1811:2: rule__Parallele2__Group_2__0__Impl rule__Parallele2__Group_2__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:1818:1: rule__Parallele2__Group_2__0__Impl : ( ( rule__Parallele2__AAssignment_2_0 ) ) ;
    public final void rule__Parallele2__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1822:1: ( ( ( rule__Parallele2__AAssignment_2_0 ) ) )
            // InternalMyTurtleDsl.g:1823:1: ( ( rule__Parallele2__AAssignment_2_0 ) )
            {
            // InternalMyTurtleDsl.g:1823:1: ( ( rule__Parallele2__AAssignment_2_0 ) )
            // InternalMyTurtleDsl.g:1824:2: ( rule__Parallele2__AAssignment_2_0 )
            {
             before(grammarAccess.getParallele2Access().getAAssignment_2_0()); 
            // InternalMyTurtleDsl.g:1825:2: ( rule__Parallele2__AAssignment_2_0 )
            // InternalMyTurtleDsl.g:1825:3: rule__Parallele2__AAssignment_2_0
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
    // InternalMyTurtleDsl.g:1833:1: rule__Parallele2__Group_2__1 : rule__Parallele2__Group_2__1__Impl rule__Parallele2__Group_2__2 ;
    public final void rule__Parallele2__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1837:1: ( rule__Parallele2__Group_2__1__Impl rule__Parallele2__Group_2__2 )
            // InternalMyTurtleDsl.g:1838:2: rule__Parallele2__Group_2__1__Impl rule__Parallele2__Group_2__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyTurtleDsl.g:1845:1: rule__Parallele2__Group_2__1__Impl : ( '&' ) ;
    public final void rule__Parallele2__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1849:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:1850:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:1850:1: ( '&' )
            // InternalMyTurtleDsl.g:1851:2: '&'
            {
             before(grammarAccess.getParallele2Access().getAmpersandKeyword_2_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:1860:1: rule__Parallele2__Group_2__2 : rule__Parallele2__Group_2__2__Impl ;
    public final void rule__Parallele2__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1864:1: ( rule__Parallele2__Group_2__2__Impl )
            // InternalMyTurtleDsl.g:1865:2: rule__Parallele2__Group_2__2__Impl
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
    // InternalMyTurtleDsl.g:1871:1: rule__Parallele2__Group_2__2__Impl : ( ( rule__Parallele2__TAssignment_2_2 ) ) ;
    public final void rule__Parallele2__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1875:1: ( ( ( rule__Parallele2__TAssignment_2_2 ) ) )
            // InternalMyTurtleDsl.g:1876:1: ( ( rule__Parallele2__TAssignment_2_2 ) )
            {
            // InternalMyTurtleDsl.g:1876:1: ( ( rule__Parallele2__TAssignment_2_2 ) )
            // InternalMyTurtleDsl.g:1877:2: ( rule__Parallele2__TAssignment_2_2 )
            {
             before(grammarAccess.getParallele2Access().getTAssignment_2_2()); 
            // InternalMyTurtleDsl.g:1878:2: ( rule__Parallele2__TAssignment_2_2 )
            // InternalMyTurtleDsl.g:1878:3: rule__Parallele2__TAssignment_2_2
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
    // InternalMyTurtleDsl.g:1887:1: rule__Parallele2__Group_3__0 : rule__Parallele2__Group_3__0__Impl rule__Parallele2__Group_3__1 ;
    public final void rule__Parallele2__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1891:1: ( rule__Parallele2__Group_3__0__Impl rule__Parallele2__Group_3__1 )
            // InternalMyTurtleDsl.g:1892:2: rule__Parallele2__Group_3__0__Impl rule__Parallele2__Group_3__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:1899:1: rule__Parallele2__Group_3__0__Impl : ( ( rule__Parallele2__TAssignment_3_0 ) ) ;
    public final void rule__Parallele2__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1903:1: ( ( ( rule__Parallele2__TAssignment_3_0 ) ) )
            // InternalMyTurtleDsl.g:1904:1: ( ( rule__Parallele2__TAssignment_3_0 ) )
            {
            // InternalMyTurtleDsl.g:1904:1: ( ( rule__Parallele2__TAssignment_3_0 ) )
            // InternalMyTurtleDsl.g:1905:2: ( rule__Parallele2__TAssignment_3_0 )
            {
             before(grammarAccess.getParallele2Access().getTAssignment_3_0()); 
            // InternalMyTurtleDsl.g:1906:2: ( rule__Parallele2__TAssignment_3_0 )
            // InternalMyTurtleDsl.g:1906:3: rule__Parallele2__TAssignment_3_0
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
    // InternalMyTurtleDsl.g:1914:1: rule__Parallele2__Group_3__1 : rule__Parallele2__Group_3__1__Impl rule__Parallele2__Group_3__2 ;
    public final void rule__Parallele2__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1918:1: ( rule__Parallele2__Group_3__1__Impl rule__Parallele2__Group_3__2 )
            // InternalMyTurtleDsl.g:1919:2: rule__Parallele2__Group_3__1__Impl rule__Parallele2__Group_3__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyTurtleDsl.g:1926:1: rule__Parallele2__Group_3__1__Impl : ( '&' ) ;
    public final void rule__Parallele2__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1930:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:1931:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:1931:1: ( '&' )
            // InternalMyTurtleDsl.g:1932:2: '&'
            {
             before(grammarAccess.getParallele2Access().getAmpersandKeyword_3_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:1941:1: rule__Parallele2__Group_3__2 : rule__Parallele2__Group_3__2__Impl ;
    public final void rule__Parallele2__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1945:1: ( rule__Parallele2__Group_3__2__Impl )
            // InternalMyTurtleDsl.g:1946:2: rule__Parallele2__Group_3__2__Impl
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
    // InternalMyTurtleDsl.g:1952:1: rule__Parallele2__Group_3__2__Impl : ( ( rule__Parallele2__BAssignment_3_2 ) ) ;
    public final void rule__Parallele2__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1956:1: ( ( ( rule__Parallele2__BAssignment_3_2 ) ) )
            // InternalMyTurtleDsl.g:1957:1: ( ( rule__Parallele2__BAssignment_3_2 ) )
            {
            // InternalMyTurtleDsl.g:1957:1: ( ( rule__Parallele2__BAssignment_3_2 ) )
            // InternalMyTurtleDsl.g:1958:2: ( rule__Parallele2__BAssignment_3_2 )
            {
             before(grammarAccess.getParallele2Access().getBAssignment_3_2()); 
            // InternalMyTurtleDsl.g:1959:2: ( rule__Parallele2__BAssignment_3_2 )
            // InternalMyTurtleDsl.g:1959:3: rule__Parallele2__BAssignment_3_2
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
    // InternalMyTurtleDsl.g:1968:1: rule__Parallele2__Group_4__0 : rule__Parallele2__Group_4__0__Impl rule__Parallele2__Group_4__1 ;
    public final void rule__Parallele2__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1972:1: ( rule__Parallele2__Group_4__0__Impl rule__Parallele2__Group_4__1 )
            // InternalMyTurtleDsl.g:1973:2: rule__Parallele2__Group_4__0__Impl rule__Parallele2__Group_4__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:1980:1: rule__Parallele2__Group_4__0__Impl : ( ( rule__Parallele2__TAssignment_4_0 ) ) ;
    public final void rule__Parallele2__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1984:1: ( ( ( rule__Parallele2__TAssignment_4_0 ) ) )
            // InternalMyTurtleDsl.g:1985:1: ( ( rule__Parallele2__TAssignment_4_0 ) )
            {
            // InternalMyTurtleDsl.g:1985:1: ( ( rule__Parallele2__TAssignment_4_0 ) )
            // InternalMyTurtleDsl.g:1986:2: ( rule__Parallele2__TAssignment_4_0 )
            {
             before(grammarAccess.getParallele2Access().getTAssignment_4_0()); 
            // InternalMyTurtleDsl.g:1987:2: ( rule__Parallele2__TAssignment_4_0 )
            // InternalMyTurtleDsl.g:1987:3: rule__Parallele2__TAssignment_4_0
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
    // InternalMyTurtleDsl.g:1995:1: rule__Parallele2__Group_4__1 : rule__Parallele2__Group_4__1__Impl rule__Parallele2__Group_4__2 ;
    public final void rule__Parallele2__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:1999:1: ( rule__Parallele2__Group_4__1__Impl rule__Parallele2__Group_4__2 )
            // InternalMyTurtleDsl.g:2000:2: rule__Parallele2__Group_4__1__Impl rule__Parallele2__Group_4__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyTurtleDsl.g:2007:1: rule__Parallele2__Group_4__1__Impl : ( '&' ) ;
    public final void rule__Parallele2__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2011:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:2012:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:2012:1: ( '&' )
            // InternalMyTurtleDsl.g:2013:2: '&'
            {
             before(grammarAccess.getParallele2Access().getAmpersandKeyword_4_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:2022:1: rule__Parallele2__Group_4__2 : rule__Parallele2__Group_4__2__Impl ;
    public final void rule__Parallele2__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2026:1: ( rule__Parallele2__Group_4__2__Impl )
            // InternalMyTurtleDsl.g:2027:2: rule__Parallele2__Group_4__2__Impl
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
    // InternalMyTurtleDsl.g:2033:1: rule__Parallele2__Group_4__2__Impl : ( ( rule__Parallele2__BAssignment_4_2 ) ) ;
    public final void rule__Parallele2__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2037:1: ( ( ( rule__Parallele2__BAssignment_4_2 ) ) )
            // InternalMyTurtleDsl.g:2038:1: ( ( rule__Parallele2__BAssignment_4_2 ) )
            {
            // InternalMyTurtleDsl.g:2038:1: ( ( rule__Parallele2__BAssignment_4_2 ) )
            // InternalMyTurtleDsl.g:2039:2: ( rule__Parallele2__BAssignment_4_2 )
            {
             before(grammarAccess.getParallele2Access().getBAssignment_4_2()); 
            // InternalMyTurtleDsl.g:2040:2: ( rule__Parallele2__BAssignment_4_2 )
            // InternalMyTurtleDsl.g:2040:3: rule__Parallele2__BAssignment_4_2
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
    // InternalMyTurtleDsl.g:2049:1: rule__Parallele2__Group_5__0 : rule__Parallele2__Group_5__0__Impl rule__Parallele2__Group_5__1 ;
    public final void rule__Parallele2__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2053:1: ( rule__Parallele2__Group_5__0__Impl rule__Parallele2__Group_5__1 )
            // InternalMyTurtleDsl.g:2054:2: rule__Parallele2__Group_5__0__Impl rule__Parallele2__Group_5__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:2061:1: rule__Parallele2__Group_5__0__Impl : ( ( rule__Parallele2__TAssignment_5_0 ) ) ;
    public final void rule__Parallele2__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2065:1: ( ( ( rule__Parallele2__TAssignment_5_0 ) ) )
            // InternalMyTurtleDsl.g:2066:1: ( ( rule__Parallele2__TAssignment_5_0 ) )
            {
            // InternalMyTurtleDsl.g:2066:1: ( ( rule__Parallele2__TAssignment_5_0 ) )
            // InternalMyTurtleDsl.g:2067:2: ( rule__Parallele2__TAssignment_5_0 )
            {
             before(grammarAccess.getParallele2Access().getTAssignment_5_0()); 
            // InternalMyTurtleDsl.g:2068:2: ( rule__Parallele2__TAssignment_5_0 )
            // InternalMyTurtleDsl.g:2068:3: rule__Parallele2__TAssignment_5_0
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
    // InternalMyTurtleDsl.g:2076:1: rule__Parallele2__Group_5__1 : rule__Parallele2__Group_5__1__Impl rule__Parallele2__Group_5__2 ;
    public final void rule__Parallele2__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2080:1: ( rule__Parallele2__Group_5__1__Impl rule__Parallele2__Group_5__2 )
            // InternalMyTurtleDsl.g:2081:2: rule__Parallele2__Group_5__1__Impl rule__Parallele2__Group_5__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyTurtleDsl.g:2088:1: rule__Parallele2__Group_5__1__Impl : ( '&' ) ;
    public final void rule__Parallele2__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2092:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:2093:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:2093:1: ( '&' )
            // InternalMyTurtleDsl.g:2094:2: '&'
            {
             before(grammarAccess.getParallele2Access().getAmpersandKeyword_5_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:2103:1: rule__Parallele2__Group_5__2 : rule__Parallele2__Group_5__2__Impl ;
    public final void rule__Parallele2__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2107:1: ( rule__Parallele2__Group_5__2__Impl )
            // InternalMyTurtleDsl.g:2108:2: rule__Parallele2__Group_5__2__Impl
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
    // InternalMyTurtleDsl.g:2114:1: rule__Parallele2__Group_5__2__Impl : ( ( rule__Parallele2__BAssignment_5_2 ) ) ;
    public final void rule__Parallele2__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2118:1: ( ( ( rule__Parallele2__BAssignment_5_2 ) ) )
            // InternalMyTurtleDsl.g:2119:1: ( ( rule__Parallele2__BAssignment_5_2 ) )
            {
            // InternalMyTurtleDsl.g:2119:1: ( ( rule__Parallele2__BAssignment_5_2 ) )
            // InternalMyTurtleDsl.g:2120:2: ( rule__Parallele2__BAssignment_5_2 )
            {
             before(grammarAccess.getParallele2Access().getBAssignment_5_2()); 
            // InternalMyTurtleDsl.g:2121:2: ( rule__Parallele2__BAssignment_5_2 )
            // InternalMyTurtleDsl.g:2121:3: rule__Parallele2__BAssignment_5_2
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
    // InternalMyTurtleDsl.g:2130:1: rule__Parallele2__Group_6__0 : rule__Parallele2__Group_6__0__Impl rule__Parallele2__Group_6__1 ;
    public final void rule__Parallele2__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2134:1: ( rule__Parallele2__Group_6__0__Impl rule__Parallele2__Group_6__1 )
            // InternalMyTurtleDsl.g:2135:2: rule__Parallele2__Group_6__0__Impl rule__Parallele2__Group_6__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:2142:1: rule__Parallele2__Group_6__0__Impl : ( ( rule__Parallele2__TAssignment_6_0 ) ) ;
    public final void rule__Parallele2__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2146:1: ( ( ( rule__Parallele2__TAssignment_6_0 ) ) )
            // InternalMyTurtleDsl.g:2147:1: ( ( rule__Parallele2__TAssignment_6_0 ) )
            {
            // InternalMyTurtleDsl.g:2147:1: ( ( rule__Parallele2__TAssignment_6_0 ) )
            // InternalMyTurtleDsl.g:2148:2: ( rule__Parallele2__TAssignment_6_0 )
            {
             before(grammarAccess.getParallele2Access().getTAssignment_6_0()); 
            // InternalMyTurtleDsl.g:2149:2: ( rule__Parallele2__TAssignment_6_0 )
            // InternalMyTurtleDsl.g:2149:3: rule__Parallele2__TAssignment_6_0
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
    // InternalMyTurtleDsl.g:2157:1: rule__Parallele2__Group_6__1 : rule__Parallele2__Group_6__1__Impl rule__Parallele2__Group_6__2 ;
    public final void rule__Parallele2__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2161:1: ( rule__Parallele2__Group_6__1__Impl rule__Parallele2__Group_6__2 )
            // InternalMyTurtleDsl.g:2162:2: rule__Parallele2__Group_6__1__Impl rule__Parallele2__Group_6__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyTurtleDsl.g:2169:1: rule__Parallele2__Group_6__1__Impl : ( '&' ) ;
    public final void rule__Parallele2__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2173:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:2174:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:2174:1: ( '&' )
            // InternalMyTurtleDsl.g:2175:2: '&'
            {
             before(grammarAccess.getParallele2Access().getAmpersandKeyword_6_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:2184:1: rule__Parallele2__Group_6__2 : rule__Parallele2__Group_6__2__Impl ;
    public final void rule__Parallele2__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2188:1: ( rule__Parallele2__Group_6__2__Impl )
            // InternalMyTurtleDsl.g:2189:2: rule__Parallele2__Group_6__2__Impl
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
    // InternalMyTurtleDsl.g:2195:1: rule__Parallele2__Group_6__2__Impl : ( ( rule__Parallele2__AAssignment_6_2 ) ) ;
    public final void rule__Parallele2__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2199:1: ( ( ( rule__Parallele2__AAssignment_6_2 ) ) )
            // InternalMyTurtleDsl.g:2200:1: ( ( rule__Parallele2__AAssignment_6_2 ) )
            {
            // InternalMyTurtleDsl.g:2200:1: ( ( rule__Parallele2__AAssignment_6_2 ) )
            // InternalMyTurtleDsl.g:2201:2: ( rule__Parallele2__AAssignment_6_2 )
            {
             before(grammarAccess.getParallele2Access().getAAssignment_6_2()); 
            // InternalMyTurtleDsl.g:2202:2: ( rule__Parallele2__AAssignment_6_2 )
            // InternalMyTurtleDsl.g:2202:3: rule__Parallele2__AAssignment_6_2
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
    // InternalMyTurtleDsl.g:2211:1: rule__Parallele2__Group_7__0 : rule__Parallele2__Group_7__0__Impl rule__Parallele2__Group_7__1 ;
    public final void rule__Parallele2__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2215:1: ( rule__Parallele2__Group_7__0__Impl rule__Parallele2__Group_7__1 )
            // InternalMyTurtleDsl.g:2216:2: rule__Parallele2__Group_7__0__Impl rule__Parallele2__Group_7__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:2223:1: rule__Parallele2__Group_7__0__Impl : ( ( rule__Parallele2__TAssignment_7_0 ) ) ;
    public final void rule__Parallele2__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2227:1: ( ( ( rule__Parallele2__TAssignment_7_0 ) ) )
            // InternalMyTurtleDsl.g:2228:1: ( ( rule__Parallele2__TAssignment_7_0 ) )
            {
            // InternalMyTurtleDsl.g:2228:1: ( ( rule__Parallele2__TAssignment_7_0 ) )
            // InternalMyTurtleDsl.g:2229:2: ( rule__Parallele2__TAssignment_7_0 )
            {
             before(grammarAccess.getParallele2Access().getTAssignment_7_0()); 
            // InternalMyTurtleDsl.g:2230:2: ( rule__Parallele2__TAssignment_7_0 )
            // InternalMyTurtleDsl.g:2230:3: rule__Parallele2__TAssignment_7_0
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
    // InternalMyTurtleDsl.g:2238:1: rule__Parallele2__Group_7__1 : rule__Parallele2__Group_7__1__Impl rule__Parallele2__Group_7__2 ;
    public final void rule__Parallele2__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2242:1: ( rule__Parallele2__Group_7__1__Impl rule__Parallele2__Group_7__2 )
            // InternalMyTurtleDsl.g:2243:2: rule__Parallele2__Group_7__1__Impl rule__Parallele2__Group_7__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyTurtleDsl.g:2250:1: rule__Parallele2__Group_7__1__Impl : ( '&' ) ;
    public final void rule__Parallele2__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2254:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:2255:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:2255:1: ( '&' )
            // InternalMyTurtleDsl.g:2256:2: '&'
            {
             before(grammarAccess.getParallele2Access().getAmpersandKeyword_7_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:2265:1: rule__Parallele2__Group_7__2 : rule__Parallele2__Group_7__2__Impl ;
    public final void rule__Parallele2__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2269:1: ( rule__Parallele2__Group_7__2__Impl )
            // InternalMyTurtleDsl.g:2270:2: rule__Parallele2__Group_7__2__Impl
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
    // InternalMyTurtleDsl.g:2276:1: rule__Parallele2__Group_7__2__Impl : ( ( rule__Parallele2__AAssignment_7_2 ) ) ;
    public final void rule__Parallele2__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2280:1: ( ( ( rule__Parallele2__AAssignment_7_2 ) ) )
            // InternalMyTurtleDsl.g:2281:1: ( ( rule__Parallele2__AAssignment_7_2 ) )
            {
            // InternalMyTurtleDsl.g:2281:1: ( ( rule__Parallele2__AAssignment_7_2 ) )
            // InternalMyTurtleDsl.g:2282:2: ( rule__Parallele2__AAssignment_7_2 )
            {
             before(grammarAccess.getParallele2Access().getAAssignment_7_2()); 
            // InternalMyTurtleDsl.g:2283:2: ( rule__Parallele2__AAssignment_7_2 )
            // InternalMyTurtleDsl.g:2283:3: rule__Parallele2__AAssignment_7_2
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
    // InternalMyTurtleDsl.g:2292:1: rule__Parallele2__Group_8__0 : rule__Parallele2__Group_8__0__Impl rule__Parallele2__Group_8__1 ;
    public final void rule__Parallele2__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2296:1: ( rule__Parallele2__Group_8__0__Impl rule__Parallele2__Group_8__1 )
            // InternalMyTurtleDsl.g:2297:2: rule__Parallele2__Group_8__0__Impl rule__Parallele2__Group_8__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:2304:1: rule__Parallele2__Group_8__0__Impl : ( ( rule__Parallele2__TAssignment_8_0 ) ) ;
    public final void rule__Parallele2__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2308:1: ( ( ( rule__Parallele2__TAssignment_8_0 ) ) )
            // InternalMyTurtleDsl.g:2309:1: ( ( rule__Parallele2__TAssignment_8_0 ) )
            {
            // InternalMyTurtleDsl.g:2309:1: ( ( rule__Parallele2__TAssignment_8_0 ) )
            // InternalMyTurtleDsl.g:2310:2: ( rule__Parallele2__TAssignment_8_0 )
            {
             before(grammarAccess.getParallele2Access().getTAssignment_8_0()); 
            // InternalMyTurtleDsl.g:2311:2: ( rule__Parallele2__TAssignment_8_0 )
            // InternalMyTurtleDsl.g:2311:3: rule__Parallele2__TAssignment_8_0
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
    // InternalMyTurtleDsl.g:2319:1: rule__Parallele2__Group_8__1 : rule__Parallele2__Group_8__1__Impl rule__Parallele2__Group_8__2 ;
    public final void rule__Parallele2__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2323:1: ( rule__Parallele2__Group_8__1__Impl rule__Parallele2__Group_8__2 )
            // InternalMyTurtleDsl.g:2324:2: rule__Parallele2__Group_8__1__Impl rule__Parallele2__Group_8__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyTurtleDsl.g:2331:1: rule__Parallele2__Group_8__1__Impl : ( '&' ) ;
    public final void rule__Parallele2__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2335:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:2336:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:2336:1: ( '&' )
            // InternalMyTurtleDsl.g:2337:2: '&'
            {
             before(grammarAccess.getParallele2Access().getAmpersandKeyword_8_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:2346:1: rule__Parallele2__Group_8__2 : rule__Parallele2__Group_8__2__Impl ;
    public final void rule__Parallele2__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2350:1: ( rule__Parallele2__Group_8__2__Impl )
            // InternalMyTurtleDsl.g:2351:2: rule__Parallele2__Group_8__2__Impl
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
    // InternalMyTurtleDsl.g:2357:1: rule__Parallele2__Group_8__2__Impl : ( ( rule__Parallele2__AAssignment_8_2 ) ) ;
    public final void rule__Parallele2__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2361:1: ( ( ( rule__Parallele2__AAssignment_8_2 ) ) )
            // InternalMyTurtleDsl.g:2362:1: ( ( rule__Parallele2__AAssignment_8_2 ) )
            {
            // InternalMyTurtleDsl.g:2362:1: ( ( rule__Parallele2__AAssignment_8_2 ) )
            // InternalMyTurtleDsl.g:2363:2: ( rule__Parallele2__AAssignment_8_2 )
            {
             before(grammarAccess.getParallele2Access().getAAssignment_8_2()); 
            // InternalMyTurtleDsl.g:2364:2: ( rule__Parallele2__AAssignment_8_2 )
            // InternalMyTurtleDsl.g:2364:3: rule__Parallele2__AAssignment_8_2
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
    // InternalMyTurtleDsl.g:2373:1: rule__Parallele2__Group_9__0 : rule__Parallele2__Group_9__0__Impl rule__Parallele2__Group_9__1 ;
    public final void rule__Parallele2__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2377:1: ( rule__Parallele2__Group_9__0__Impl rule__Parallele2__Group_9__1 )
            // InternalMyTurtleDsl.g:2378:2: rule__Parallele2__Group_9__0__Impl rule__Parallele2__Group_9__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:2385:1: rule__Parallele2__Group_9__0__Impl : ( ( rule__Parallele2__TAssignment_9_0 ) ) ;
    public final void rule__Parallele2__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2389:1: ( ( ( rule__Parallele2__TAssignment_9_0 ) ) )
            // InternalMyTurtleDsl.g:2390:1: ( ( rule__Parallele2__TAssignment_9_0 ) )
            {
            // InternalMyTurtleDsl.g:2390:1: ( ( rule__Parallele2__TAssignment_9_0 ) )
            // InternalMyTurtleDsl.g:2391:2: ( rule__Parallele2__TAssignment_9_0 )
            {
             before(grammarAccess.getParallele2Access().getTAssignment_9_0()); 
            // InternalMyTurtleDsl.g:2392:2: ( rule__Parallele2__TAssignment_9_0 )
            // InternalMyTurtleDsl.g:2392:3: rule__Parallele2__TAssignment_9_0
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
    // InternalMyTurtleDsl.g:2400:1: rule__Parallele2__Group_9__1 : rule__Parallele2__Group_9__1__Impl rule__Parallele2__Group_9__2 ;
    public final void rule__Parallele2__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2404:1: ( rule__Parallele2__Group_9__1__Impl rule__Parallele2__Group_9__2 )
            // InternalMyTurtleDsl.g:2405:2: rule__Parallele2__Group_9__1__Impl rule__Parallele2__Group_9__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyTurtleDsl.g:2412:1: rule__Parallele2__Group_9__1__Impl : ( '&' ) ;
    public final void rule__Parallele2__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2416:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:2417:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:2417:1: ( '&' )
            // InternalMyTurtleDsl.g:2418:2: '&'
            {
             before(grammarAccess.getParallele2Access().getAmpersandKeyword_9_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:2427:1: rule__Parallele2__Group_9__2 : rule__Parallele2__Group_9__2__Impl ;
    public final void rule__Parallele2__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2431:1: ( rule__Parallele2__Group_9__2__Impl )
            // InternalMyTurtleDsl.g:2432:2: rule__Parallele2__Group_9__2__Impl
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
    // InternalMyTurtleDsl.g:2438:1: rule__Parallele2__Group_9__2__Impl : ( ( rule__Parallele2__AAssignment_9_2 ) ) ;
    public final void rule__Parallele2__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2442:1: ( ( ( rule__Parallele2__AAssignment_9_2 ) ) )
            // InternalMyTurtleDsl.g:2443:1: ( ( rule__Parallele2__AAssignment_9_2 ) )
            {
            // InternalMyTurtleDsl.g:2443:1: ( ( rule__Parallele2__AAssignment_9_2 ) )
            // InternalMyTurtleDsl.g:2444:2: ( rule__Parallele2__AAssignment_9_2 )
            {
             before(grammarAccess.getParallele2Access().getAAssignment_9_2()); 
            // InternalMyTurtleDsl.g:2445:2: ( rule__Parallele2__AAssignment_9_2 )
            // InternalMyTurtleDsl.g:2445:3: rule__Parallele2__AAssignment_9_2
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
    // InternalMyTurtleDsl.g:2454:1: rule__Parallele2__Group_10__0 : rule__Parallele2__Group_10__0__Impl rule__Parallele2__Group_10__1 ;
    public final void rule__Parallele2__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2458:1: ( rule__Parallele2__Group_10__0__Impl rule__Parallele2__Group_10__1 )
            // InternalMyTurtleDsl.g:2459:2: rule__Parallele2__Group_10__0__Impl rule__Parallele2__Group_10__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:2466:1: rule__Parallele2__Group_10__0__Impl : ( ( rule__Parallele2__TAssignment_10_0 ) ) ;
    public final void rule__Parallele2__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2470:1: ( ( ( rule__Parallele2__TAssignment_10_0 ) ) )
            // InternalMyTurtleDsl.g:2471:1: ( ( rule__Parallele2__TAssignment_10_0 ) )
            {
            // InternalMyTurtleDsl.g:2471:1: ( ( rule__Parallele2__TAssignment_10_0 ) )
            // InternalMyTurtleDsl.g:2472:2: ( rule__Parallele2__TAssignment_10_0 )
            {
             before(grammarAccess.getParallele2Access().getTAssignment_10_0()); 
            // InternalMyTurtleDsl.g:2473:2: ( rule__Parallele2__TAssignment_10_0 )
            // InternalMyTurtleDsl.g:2473:3: rule__Parallele2__TAssignment_10_0
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
    // InternalMyTurtleDsl.g:2481:1: rule__Parallele2__Group_10__1 : rule__Parallele2__Group_10__1__Impl rule__Parallele2__Group_10__2 ;
    public final void rule__Parallele2__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2485:1: ( rule__Parallele2__Group_10__1__Impl rule__Parallele2__Group_10__2 )
            // InternalMyTurtleDsl.g:2486:2: rule__Parallele2__Group_10__1__Impl rule__Parallele2__Group_10__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyTurtleDsl.g:2493:1: rule__Parallele2__Group_10__1__Impl : ( '&' ) ;
    public final void rule__Parallele2__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2497:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:2498:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:2498:1: ( '&' )
            // InternalMyTurtleDsl.g:2499:2: '&'
            {
             before(grammarAccess.getParallele2Access().getAmpersandKeyword_10_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:2508:1: rule__Parallele2__Group_10__2 : rule__Parallele2__Group_10__2__Impl ;
    public final void rule__Parallele2__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2512:1: ( rule__Parallele2__Group_10__2__Impl )
            // InternalMyTurtleDsl.g:2513:2: rule__Parallele2__Group_10__2__Impl
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
    // InternalMyTurtleDsl.g:2519:1: rule__Parallele2__Group_10__2__Impl : ( ( rule__Parallele2__AAssignment_10_2 ) ) ;
    public final void rule__Parallele2__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2523:1: ( ( ( rule__Parallele2__AAssignment_10_2 ) ) )
            // InternalMyTurtleDsl.g:2524:1: ( ( rule__Parallele2__AAssignment_10_2 ) )
            {
            // InternalMyTurtleDsl.g:2524:1: ( ( rule__Parallele2__AAssignment_10_2 ) )
            // InternalMyTurtleDsl.g:2525:2: ( rule__Parallele2__AAssignment_10_2 )
            {
             before(grammarAccess.getParallele2Access().getAAssignment_10_2()); 
            // InternalMyTurtleDsl.g:2526:2: ( rule__Parallele2__AAssignment_10_2 )
            // InternalMyTurtleDsl.g:2526:3: rule__Parallele2__AAssignment_10_2
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
    // InternalMyTurtleDsl.g:2535:1: rule__Parallele2__Group_11__0 : rule__Parallele2__Group_11__0__Impl rule__Parallele2__Group_11__1 ;
    public final void rule__Parallele2__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2539:1: ( rule__Parallele2__Group_11__0__Impl rule__Parallele2__Group_11__1 )
            // InternalMyTurtleDsl.g:2540:2: rule__Parallele2__Group_11__0__Impl rule__Parallele2__Group_11__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:2547:1: rule__Parallele2__Group_11__0__Impl : ( ( rule__Parallele2__TAssignment_11_0 ) ) ;
    public final void rule__Parallele2__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2551:1: ( ( ( rule__Parallele2__TAssignment_11_0 ) ) )
            // InternalMyTurtleDsl.g:2552:1: ( ( rule__Parallele2__TAssignment_11_0 ) )
            {
            // InternalMyTurtleDsl.g:2552:1: ( ( rule__Parallele2__TAssignment_11_0 ) )
            // InternalMyTurtleDsl.g:2553:2: ( rule__Parallele2__TAssignment_11_0 )
            {
             before(grammarAccess.getParallele2Access().getTAssignment_11_0()); 
            // InternalMyTurtleDsl.g:2554:2: ( rule__Parallele2__TAssignment_11_0 )
            // InternalMyTurtleDsl.g:2554:3: rule__Parallele2__TAssignment_11_0
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
    // InternalMyTurtleDsl.g:2562:1: rule__Parallele2__Group_11__1 : rule__Parallele2__Group_11__1__Impl rule__Parallele2__Group_11__2 ;
    public final void rule__Parallele2__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2566:1: ( rule__Parallele2__Group_11__1__Impl rule__Parallele2__Group_11__2 )
            // InternalMyTurtleDsl.g:2567:2: rule__Parallele2__Group_11__1__Impl rule__Parallele2__Group_11__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyTurtleDsl.g:2574:1: rule__Parallele2__Group_11__1__Impl : ( '&' ) ;
    public final void rule__Parallele2__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2578:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:2579:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:2579:1: ( '&' )
            // InternalMyTurtleDsl.g:2580:2: '&'
            {
             before(grammarAccess.getParallele2Access().getAmpersandKeyword_11_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:2589:1: rule__Parallele2__Group_11__2 : rule__Parallele2__Group_11__2__Impl ;
    public final void rule__Parallele2__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2593:1: ( rule__Parallele2__Group_11__2__Impl )
            // InternalMyTurtleDsl.g:2594:2: rule__Parallele2__Group_11__2__Impl
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
    // InternalMyTurtleDsl.g:2600:1: rule__Parallele2__Group_11__2__Impl : ( ( rule__Parallele2__AAssignment_11_2 ) ) ;
    public final void rule__Parallele2__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2604:1: ( ( ( rule__Parallele2__AAssignment_11_2 ) ) )
            // InternalMyTurtleDsl.g:2605:1: ( ( rule__Parallele2__AAssignment_11_2 ) )
            {
            // InternalMyTurtleDsl.g:2605:1: ( ( rule__Parallele2__AAssignment_11_2 ) )
            // InternalMyTurtleDsl.g:2606:2: ( rule__Parallele2__AAssignment_11_2 )
            {
             before(grammarAccess.getParallele2Access().getAAssignment_11_2()); 
            // InternalMyTurtleDsl.g:2607:2: ( rule__Parallele2__AAssignment_11_2 )
            // InternalMyTurtleDsl.g:2607:3: rule__Parallele2__AAssignment_11_2
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
    // InternalMyTurtleDsl.g:2616:1: rule__Parallele3__Group_0__0 : rule__Parallele3__Group_0__0__Impl rule__Parallele3__Group_0__1 ;
    public final void rule__Parallele3__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2620:1: ( rule__Parallele3__Group_0__0__Impl rule__Parallele3__Group_0__1 )
            // InternalMyTurtleDsl.g:2621:2: rule__Parallele3__Group_0__0__Impl rule__Parallele3__Group_0__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:2628:1: rule__Parallele3__Group_0__0__Impl : ( ( rule__Parallele3__AAssignment_0_0 ) ) ;
    public final void rule__Parallele3__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2632:1: ( ( ( rule__Parallele3__AAssignment_0_0 ) ) )
            // InternalMyTurtleDsl.g:2633:1: ( ( rule__Parallele3__AAssignment_0_0 ) )
            {
            // InternalMyTurtleDsl.g:2633:1: ( ( rule__Parallele3__AAssignment_0_0 ) )
            // InternalMyTurtleDsl.g:2634:2: ( rule__Parallele3__AAssignment_0_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_0_0()); 
            // InternalMyTurtleDsl.g:2635:2: ( rule__Parallele3__AAssignment_0_0 )
            // InternalMyTurtleDsl.g:2635:3: rule__Parallele3__AAssignment_0_0
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
    // InternalMyTurtleDsl.g:2643:1: rule__Parallele3__Group_0__1 : rule__Parallele3__Group_0__1__Impl rule__Parallele3__Group_0__2 ;
    public final void rule__Parallele3__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2647:1: ( rule__Parallele3__Group_0__1__Impl rule__Parallele3__Group_0__2 )
            // InternalMyTurtleDsl.g:2648:2: rule__Parallele3__Group_0__1__Impl rule__Parallele3__Group_0__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyTurtleDsl.g:2655:1: rule__Parallele3__Group_0__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2659:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:2660:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:2660:1: ( '&' )
            // InternalMyTurtleDsl.g:2661:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_0_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:2670:1: rule__Parallele3__Group_0__2 : rule__Parallele3__Group_0__2__Impl rule__Parallele3__Group_0__3 ;
    public final void rule__Parallele3__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2674:1: ( rule__Parallele3__Group_0__2__Impl rule__Parallele3__Group_0__3 )
            // InternalMyTurtleDsl.g:2675:2: rule__Parallele3__Group_0__2__Impl rule__Parallele3__Group_0__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:2682:1: rule__Parallele3__Group_0__2__Impl : ( ( rule__Parallele3__BAssignment_0_2 ) ) ;
    public final void rule__Parallele3__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2686:1: ( ( ( rule__Parallele3__BAssignment_0_2 ) ) )
            // InternalMyTurtleDsl.g:2687:1: ( ( rule__Parallele3__BAssignment_0_2 ) )
            {
            // InternalMyTurtleDsl.g:2687:1: ( ( rule__Parallele3__BAssignment_0_2 ) )
            // InternalMyTurtleDsl.g:2688:2: ( rule__Parallele3__BAssignment_0_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_0_2()); 
            // InternalMyTurtleDsl.g:2689:2: ( rule__Parallele3__BAssignment_0_2 )
            // InternalMyTurtleDsl.g:2689:3: rule__Parallele3__BAssignment_0_2
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
    // InternalMyTurtleDsl.g:2697:1: rule__Parallele3__Group_0__3 : rule__Parallele3__Group_0__3__Impl rule__Parallele3__Group_0__4 ;
    public final void rule__Parallele3__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2701:1: ( rule__Parallele3__Group_0__3__Impl rule__Parallele3__Group_0__4 )
            // InternalMyTurtleDsl.g:2702:2: rule__Parallele3__Group_0__3__Impl rule__Parallele3__Group_0__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyTurtleDsl.g:2709:1: rule__Parallele3__Group_0__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2713:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:2714:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:2714:1: ( '&' )
            // InternalMyTurtleDsl.g:2715:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_0_3()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:2724:1: rule__Parallele3__Group_0__4 : rule__Parallele3__Group_0__4__Impl ;
    public final void rule__Parallele3__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2728:1: ( rule__Parallele3__Group_0__4__Impl )
            // InternalMyTurtleDsl.g:2729:2: rule__Parallele3__Group_0__4__Impl
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
    // InternalMyTurtleDsl.g:2735:1: rule__Parallele3__Group_0__4__Impl : ( ( rule__Parallele3__CAssignment_0_4 ) ) ;
    public final void rule__Parallele3__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2739:1: ( ( ( rule__Parallele3__CAssignment_0_4 ) ) )
            // InternalMyTurtleDsl.g:2740:1: ( ( rule__Parallele3__CAssignment_0_4 ) )
            {
            // InternalMyTurtleDsl.g:2740:1: ( ( rule__Parallele3__CAssignment_0_4 ) )
            // InternalMyTurtleDsl.g:2741:2: ( rule__Parallele3__CAssignment_0_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_0_4()); 
            // InternalMyTurtleDsl.g:2742:2: ( rule__Parallele3__CAssignment_0_4 )
            // InternalMyTurtleDsl.g:2742:3: rule__Parallele3__CAssignment_0_4
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
    // InternalMyTurtleDsl.g:2751:1: rule__Parallele3__Group_1__0 : rule__Parallele3__Group_1__0__Impl rule__Parallele3__Group_1__1 ;
    public final void rule__Parallele3__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2755:1: ( rule__Parallele3__Group_1__0__Impl rule__Parallele3__Group_1__1 )
            // InternalMyTurtleDsl.g:2756:2: rule__Parallele3__Group_1__0__Impl rule__Parallele3__Group_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:2763:1: rule__Parallele3__Group_1__0__Impl : ( ( rule__Parallele3__AAssignment_1_0 ) ) ;
    public final void rule__Parallele3__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2767:1: ( ( ( rule__Parallele3__AAssignment_1_0 ) ) )
            // InternalMyTurtleDsl.g:2768:1: ( ( rule__Parallele3__AAssignment_1_0 ) )
            {
            // InternalMyTurtleDsl.g:2768:1: ( ( rule__Parallele3__AAssignment_1_0 ) )
            // InternalMyTurtleDsl.g:2769:2: ( rule__Parallele3__AAssignment_1_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_1_0()); 
            // InternalMyTurtleDsl.g:2770:2: ( rule__Parallele3__AAssignment_1_0 )
            // InternalMyTurtleDsl.g:2770:3: rule__Parallele3__AAssignment_1_0
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
    // InternalMyTurtleDsl.g:2778:1: rule__Parallele3__Group_1__1 : rule__Parallele3__Group_1__1__Impl rule__Parallele3__Group_1__2 ;
    public final void rule__Parallele3__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2782:1: ( rule__Parallele3__Group_1__1__Impl rule__Parallele3__Group_1__2 )
            // InternalMyTurtleDsl.g:2783:2: rule__Parallele3__Group_1__1__Impl rule__Parallele3__Group_1__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyTurtleDsl.g:2790:1: rule__Parallele3__Group_1__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2794:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:2795:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:2795:1: ( '&' )
            // InternalMyTurtleDsl.g:2796:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_1_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:2805:1: rule__Parallele3__Group_1__2 : rule__Parallele3__Group_1__2__Impl rule__Parallele3__Group_1__3 ;
    public final void rule__Parallele3__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2809:1: ( rule__Parallele3__Group_1__2__Impl rule__Parallele3__Group_1__3 )
            // InternalMyTurtleDsl.g:2810:2: rule__Parallele3__Group_1__2__Impl rule__Parallele3__Group_1__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:2817:1: rule__Parallele3__Group_1__2__Impl : ( ( rule__Parallele3__BAssignment_1_2 ) ) ;
    public final void rule__Parallele3__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2821:1: ( ( ( rule__Parallele3__BAssignment_1_2 ) ) )
            // InternalMyTurtleDsl.g:2822:1: ( ( rule__Parallele3__BAssignment_1_2 ) )
            {
            // InternalMyTurtleDsl.g:2822:1: ( ( rule__Parallele3__BAssignment_1_2 ) )
            // InternalMyTurtleDsl.g:2823:2: ( rule__Parallele3__BAssignment_1_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_1_2()); 
            // InternalMyTurtleDsl.g:2824:2: ( rule__Parallele3__BAssignment_1_2 )
            // InternalMyTurtleDsl.g:2824:3: rule__Parallele3__BAssignment_1_2
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
    // InternalMyTurtleDsl.g:2832:1: rule__Parallele3__Group_1__3 : rule__Parallele3__Group_1__3__Impl rule__Parallele3__Group_1__4 ;
    public final void rule__Parallele3__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2836:1: ( rule__Parallele3__Group_1__3__Impl rule__Parallele3__Group_1__4 )
            // InternalMyTurtleDsl.g:2837:2: rule__Parallele3__Group_1__3__Impl rule__Parallele3__Group_1__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyTurtleDsl.g:2844:1: rule__Parallele3__Group_1__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2848:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:2849:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:2849:1: ( '&' )
            // InternalMyTurtleDsl.g:2850:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_1_3()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:2859:1: rule__Parallele3__Group_1__4 : rule__Parallele3__Group_1__4__Impl ;
    public final void rule__Parallele3__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2863:1: ( rule__Parallele3__Group_1__4__Impl )
            // InternalMyTurtleDsl.g:2864:2: rule__Parallele3__Group_1__4__Impl
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
    // InternalMyTurtleDsl.g:2870:1: rule__Parallele3__Group_1__4__Impl : ( ( rule__Parallele3__CAssignment_1_4 ) ) ;
    public final void rule__Parallele3__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2874:1: ( ( ( rule__Parallele3__CAssignment_1_4 ) ) )
            // InternalMyTurtleDsl.g:2875:1: ( ( rule__Parallele3__CAssignment_1_4 ) )
            {
            // InternalMyTurtleDsl.g:2875:1: ( ( rule__Parallele3__CAssignment_1_4 ) )
            // InternalMyTurtleDsl.g:2876:2: ( rule__Parallele3__CAssignment_1_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_1_4()); 
            // InternalMyTurtleDsl.g:2877:2: ( rule__Parallele3__CAssignment_1_4 )
            // InternalMyTurtleDsl.g:2877:3: rule__Parallele3__CAssignment_1_4
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
    // InternalMyTurtleDsl.g:2886:1: rule__Parallele3__Group_2__0 : rule__Parallele3__Group_2__0__Impl rule__Parallele3__Group_2__1 ;
    public final void rule__Parallele3__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2890:1: ( rule__Parallele3__Group_2__0__Impl rule__Parallele3__Group_2__1 )
            // InternalMyTurtleDsl.g:2891:2: rule__Parallele3__Group_2__0__Impl rule__Parallele3__Group_2__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:2898:1: rule__Parallele3__Group_2__0__Impl : ( ( rule__Parallele3__AAssignment_2_0 ) ) ;
    public final void rule__Parallele3__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2902:1: ( ( ( rule__Parallele3__AAssignment_2_0 ) ) )
            // InternalMyTurtleDsl.g:2903:1: ( ( rule__Parallele3__AAssignment_2_0 ) )
            {
            // InternalMyTurtleDsl.g:2903:1: ( ( rule__Parallele3__AAssignment_2_0 ) )
            // InternalMyTurtleDsl.g:2904:2: ( rule__Parallele3__AAssignment_2_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_2_0()); 
            // InternalMyTurtleDsl.g:2905:2: ( rule__Parallele3__AAssignment_2_0 )
            // InternalMyTurtleDsl.g:2905:3: rule__Parallele3__AAssignment_2_0
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
    // InternalMyTurtleDsl.g:2913:1: rule__Parallele3__Group_2__1 : rule__Parallele3__Group_2__1__Impl rule__Parallele3__Group_2__2 ;
    public final void rule__Parallele3__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2917:1: ( rule__Parallele3__Group_2__1__Impl rule__Parallele3__Group_2__2 )
            // InternalMyTurtleDsl.g:2918:2: rule__Parallele3__Group_2__1__Impl rule__Parallele3__Group_2__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyTurtleDsl.g:2925:1: rule__Parallele3__Group_2__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2929:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:2930:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:2930:1: ( '&' )
            // InternalMyTurtleDsl.g:2931:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_2_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:2940:1: rule__Parallele3__Group_2__2 : rule__Parallele3__Group_2__2__Impl rule__Parallele3__Group_2__3 ;
    public final void rule__Parallele3__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2944:1: ( rule__Parallele3__Group_2__2__Impl rule__Parallele3__Group_2__3 )
            // InternalMyTurtleDsl.g:2945:2: rule__Parallele3__Group_2__2__Impl rule__Parallele3__Group_2__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:2952:1: rule__Parallele3__Group_2__2__Impl : ( ( rule__Parallele3__BAssignment_2_2 ) ) ;
    public final void rule__Parallele3__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2956:1: ( ( ( rule__Parallele3__BAssignment_2_2 ) ) )
            // InternalMyTurtleDsl.g:2957:1: ( ( rule__Parallele3__BAssignment_2_2 ) )
            {
            // InternalMyTurtleDsl.g:2957:1: ( ( rule__Parallele3__BAssignment_2_2 ) )
            // InternalMyTurtleDsl.g:2958:2: ( rule__Parallele3__BAssignment_2_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_2_2()); 
            // InternalMyTurtleDsl.g:2959:2: ( rule__Parallele3__BAssignment_2_2 )
            // InternalMyTurtleDsl.g:2959:3: rule__Parallele3__BAssignment_2_2
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
    // InternalMyTurtleDsl.g:2967:1: rule__Parallele3__Group_2__3 : rule__Parallele3__Group_2__3__Impl rule__Parallele3__Group_2__4 ;
    public final void rule__Parallele3__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2971:1: ( rule__Parallele3__Group_2__3__Impl rule__Parallele3__Group_2__4 )
            // InternalMyTurtleDsl.g:2972:2: rule__Parallele3__Group_2__3__Impl rule__Parallele3__Group_2__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyTurtleDsl.g:2979:1: rule__Parallele3__Group_2__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2983:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:2984:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:2984:1: ( '&' )
            // InternalMyTurtleDsl.g:2985:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_2_3()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:2994:1: rule__Parallele3__Group_2__4 : rule__Parallele3__Group_2__4__Impl ;
    public final void rule__Parallele3__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:2998:1: ( rule__Parallele3__Group_2__4__Impl )
            // InternalMyTurtleDsl.g:2999:2: rule__Parallele3__Group_2__4__Impl
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
    // InternalMyTurtleDsl.g:3005:1: rule__Parallele3__Group_2__4__Impl : ( ( rule__Parallele3__CAssignment_2_4 ) ) ;
    public final void rule__Parallele3__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3009:1: ( ( ( rule__Parallele3__CAssignment_2_4 ) ) )
            // InternalMyTurtleDsl.g:3010:1: ( ( rule__Parallele3__CAssignment_2_4 ) )
            {
            // InternalMyTurtleDsl.g:3010:1: ( ( rule__Parallele3__CAssignment_2_4 ) )
            // InternalMyTurtleDsl.g:3011:2: ( rule__Parallele3__CAssignment_2_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_2_4()); 
            // InternalMyTurtleDsl.g:3012:2: ( rule__Parallele3__CAssignment_2_4 )
            // InternalMyTurtleDsl.g:3012:3: rule__Parallele3__CAssignment_2_4
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
    // InternalMyTurtleDsl.g:3021:1: rule__Parallele3__Group_3__0 : rule__Parallele3__Group_3__0__Impl rule__Parallele3__Group_3__1 ;
    public final void rule__Parallele3__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3025:1: ( rule__Parallele3__Group_3__0__Impl rule__Parallele3__Group_3__1 )
            // InternalMyTurtleDsl.g:3026:2: rule__Parallele3__Group_3__0__Impl rule__Parallele3__Group_3__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:3033:1: rule__Parallele3__Group_3__0__Impl : ( ( rule__Parallele3__AAssignment_3_0 ) ) ;
    public final void rule__Parallele3__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3037:1: ( ( ( rule__Parallele3__AAssignment_3_0 ) ) )
            // InternalMyTurtleDsl.g:3038:1: ( ( rule__Parallele3__AAssignment_3_0 ) )
            {
            // InternalMyTurtleDsl.g:3038:1: ( ( rule__Parallele3__AAssignment_3_0 ) )
            // InternalMyTurtleDsl.g:3039:2: ( rule__Parallele3__AAssignment_3_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_3_0()); 
            // InternalMyTurtleDsl.g:3040:2: ( rule__Parallele3__AAssignment_3_0 )
            // InternalMyTurtleDsl.g:3040:3: rule__Parallele3__AAssignment_3_0
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
    // InternalMyTurtleDsl.g:3048:1: rule__Parallele3__Group_3__1 : rule__Parallele3__Group_3__1__Impl rule__Parallele3__Group_3__2 ;
    public final void rule__Parallele3__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3052:1: ( rule__Parallele3__Group_3__1__Impl rule__Parallele3__Group_3__2 )
            // InternalMyTurtleDsl.g:3053:2: rule__Parallele3__Group_3__1__Impl rule__Parallele3__Group_3__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyTurtleDsl.g:3060:1: rule__Parallele3__Group_3__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3064:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:3065:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:3065:1: ( '&' )
            // InternalMyTurtleDsl.g:3066:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_3_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:3075:1: rule__Parallele3__Group_3__2 : rule__Parallele3__Group_3__2__Impl rule__Parallele3__Group_3__3 ;
    public final void rule__Parallele3__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3079:1: ( rule__Parallele3__Group_3__2__Impl rule__Parallele3__Group_3__3 )
            // InternalMyTurtleDsl.g:3080:2: rule__Parallele3__Group_3__2__Impl rule__Parallele3__Group_3__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:3087:1: rule__Parallele3__Group_3__2__Impl : ( ( rule__Parallele3__BAssignment_3_2 ) ) ;
    public final void rule__Parallele3__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3091:1: ( ( ( rule__Parallele3__BAssignment_3_2 ) ) )
            // InternalMyTurtleDsl.g:3092:1: ( ( rule__Parallele3__BAssignment_3_2 ) )
            {
            // InternalMyTurtleDsl.g:3092:1: ( ( rule__Parallele3__BAssignment_3_2 ) )
            // InternalMyTurtleDsl.g:3093:2: ( rule__Parallele3__BAssignment_3_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_3_2()); 
            // InternalMyTurtleDsl.g:3094:2: ( rule__Parallele3__BAssignment_3_2 )
            // InternalMyTurtleDsl.g:3094:3: rule__Parallele3__BAssignment_3_2
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
    // InternalMyTurtleDsl.g:3102:1: rule__Parallele3__Group_3__3 : rule__Parallele3__Group_3__3__Impl rule__Parallele3__Group_3__4 ;
    public final void rule__Parallele3__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3106:1: ( rule__Parallele3__Group_3__3__Impl rule__Parallele3__Group_3__4 )
            // InternalMyTurtleDsl.g:3107:2: rule__Parallele3__Group_3__3__Impl rule__Parallele3__Group_3__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyTurtleDsl.g:3114:1: rule__Parallele3__Group_3__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3118:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:3119:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:3119:1: ( '&' )
            // InternalMyTurtleDsl.g:3120:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_3_3()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:3129:1: rule__Parallele3__Group_3__4 : rule__Parallele3__Group_3__4__Impl ;
    public final void rule__Parallele3__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3133:1: ( rule__Parallele3__Group_3__4__Impl )
            // InternalMyTurtleDsl.g:3134:2: rule__Parallele3__Group_3__4__Impl
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
    // InternalMyTurtleDsl.g:3140:1: rule__Parallele3__Group_3__4__Impl : ( ( rule__Parallele3__CAssignment_3_4 ) ) ;
    public final void rule__Parallele3__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3144:1: ( ( ( rule__Parallele3__CAssignment_3_4 ) ) )
            // InternalMyTurtleDsl.g:3145:1: ( ( rule__Parallele3__CAssignment_3_4 ) )
            {
            // InternalMyTurtleDsl.g:3145:1: ( ( rule__Parallele3__CAssignment_3_4 ) )
            // InternalMyTurtleDsl.g:3146:2: ( rule__Parallele3__CAssignment_3_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_3_4()); 
            // InternalMyTurtleDsl.g:3147:2: ( rule__Parallele3__CAssignment_3_4 )
            // InternalMyTurtleDsl.g:3147:3: rule__Parallele3__CAssignment_3_4
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
    // InternalMyTurtleDsl.g:3156:1: rule__Parallele3__Group_4__0 : rule__Parallele3__Group_4__0__Impl rule__Parallele3__Group_4__1 ;
    public final void rule__Parallele3__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3160:1: ( rule__Parallele3__Group_4__0__Impl rule__Parallele3__Group_4__1 )
            // InternalMyTurtleDsl.g:3161:2: rule__Parallele3__Group_4__0__Impl rule__Parallele3__Group_4__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:3168:1: rule__Parallele3__Group_4__0__Impl : ( ( rule__Parallele3__AAssignment_4_0 ) ) ;
    public final void rule__Parallele3__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3172:1: ( ( ( rule__Parallele3__AAssignment_4_0 ) ) )
            // InternalMyTurtleDsl.g:3173:1: ( ( rule__Parallele3__AAssignment_4_0 ) )
            {
            // InternalMyTurtleDsl.g:3173:1: ( ( rule__Parallele3__AAssignment_4_0 ) )
            // InternalMyTurtleDsl.g:3174:2: ( rule__Parallele3__AAssignment_4_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_4_0()); 
            // InternalMyTurtleDsl.g:3175:2: ( rule__Parallele3__AAssignment_4_0 )
            // InternalMyTurtleDsl.g:3175:3: rule__Parallele3__AAssignment_4_0
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
    // InternalMyTurtleDsl.g:3183:1: rule__Parallele3__Group_4__1 : rule__Parallele3__Group_4__1__Impl rule__Parallele3__Group_4__2 ;
    public final void rule__Parallele3__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3187:1: ( rule__Parallele3__Group_4__1__Impl rule__Parallele3__Group_4__2 )
            // InternalMyTurtleDsl.g:3188:2: rule__Parallele3__Group_4__1__Impl rule__Parallele3__Group_4__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyTurtleDsl.g:3195:1: rule__Parallele3__Group_4__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3199:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:3200:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:3200:1: ( '&' )
            // InternalMyTurtleDsl.g:3201:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_4_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:3210:1: rule__Parallele3__Group_4__2 : rule__Parallele3__Group_4__2__Impl rule__Parallele3__Group_4__3 ;
    public final void rule__Parallele3__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3214:1: ( rule__Parallele3__Group_4__2__Impl rule__Parallele3__Group_4__3 )
            // InternalMyTurtleDsl.g:3215:2: rule__Parallele3__Group_4__2__Impl rule__Parallele3__Group_4__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:3222:1: rule__Parallele3__Group_4__2__Impl : ( ( rule__Parallele3__BAssignment_4_2 ) ) ;
    public final void rule__Parallele3__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3226:1: ( ( ( rule__Parallele3__BAssignment_4_2 ) ) )
            // InternalMyTurtleDsl.g:3227:1: ( ( rule__Parallele3__BAssignment_4_2 ) )
            {
            // InternalMyTurtleDsl.g:3227:1: ( ( rule__Parallele3__BAssignment_4_2 ) )
            // InternalMyTurtleDsl.g:3228:2: ( rule__Parallele3__BAssignment_4_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_4_2()); 
            // InternalMyTurtleDsl.g:3229:2: ( rule__Parallele3__BAssignment_4_2 )
            // InternalMyTurtleDsl.g:3229:3: rule__Parallele3__BAssignment_4_2
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
    // InternalMyTurtleDsl.g:3237:1: rule__Parallele3__Group_4__3 : rule__Parallele3__Group_4__3__Impl rule__Parallele3__Group_4__4 ;
    public final void rule__Parallele3__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3241:1: ( rule__Parallele3__Group_4__3__Impl rule__Parallele3__Group_4__4 )
            // InternalMyTurtleDsl.g:3242:2: rule__Parallele3__Group_4__3__Impl rule__Parallele3__Group_4__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyTurtleDsl.g:3249:1: rule__Parallele3__Group_4__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3253:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:3254:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:3254:1: ( '&' )
            // InternalMyTurtleDsl.g:3255:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_4_3()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:3264:1: rule__Parallele3__Group_4__4 : rule__Parallele3__Group_4__4__Impl ;
    public final void rule__Parallele3__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3268:1: ( rule__Parallele3__Group_4__4__Impl )
            // InternalMyTurtleDsl.g:3269:2: rule__Parallele3__Group_4__4__Impl
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
    // InternalMyTurtleDsl.g:3275:1: rule__Parallele3__Group_4__4__Impl : ( ( rule__Parallele3__CAssignment_4_4 ) ) ;
    public final void rule__Parallele3__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3279:1: ( ( ( rule__Parallele3__CAssignment_4_4 ) ) )
            // InternalMyTurtleDsl.g:3280:1: ( ( rule__Parallele3__CAssignment_4_4 ) )
            {
            // InternalMyTurtleDsl.g:3280:1: ( ( rule__Parallele3__CAssignment_4_4 ) )
            // InternalMyTurtleDsl.g:3281:2: ( rule__Parallele3__CAssignment_4_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_4_4()); 
            // InternalMyTurtleDsl.g:3282:2: ( rule__Parallele3__CAssignment_4_4 )
            // InternalMyTurtleDsl.g:3282:3: rule__Parallele3__CAssignment_4_4
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
    // InternalMyTurtleDsl.g:3291:1: rule__Parallele3__Group_5__0 : rule__Parallele3__Group_5__0__Impl rule__Parallele3__Group_5__1 ;
    public final void rule__Parallele3__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3295:1: ( rule__Parallele3__Group_5__0__Impl rule__Parallele3__Group_5__1 )
            // InternalMyTurtleDsl.g:3296:2: rule__Parallele3__Group_5__0__Impl rule__Parallele3__Group_5__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:3303:1: rule__Parallele3__Group_5__0__Impl : ( ( rule__Parallele3__AAssignment_5_0 ) ) ;
    public final void rule__Parallele3__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3307:1: ( ( ( rule__Parallele3__AAssignment_5_0 ) ) )
            // InternalMyTurtleDsl.g:3308:1: ( ( rule__Parallele3__AAssignment_5_0 ) )
            {
            // InternalMyTurtleDsl.g:3308:1: ( ( rule__Parallele3__AAssignment_5_0 ) )
            // InternalMyTurtleDsl.g:3309:2: ( rule__Parallele3__AAssignment_5_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_5_0()); 
            // InternalMyTurtleDsl.g:3310:2: ( rule__Parallele3__AAssignment_5_0 )
            // InternalMyTurtleDsl.g:3310:3: rule__Parallele3__AAssignment_5_0
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
    // InternalMyTurtleDsl.g:3318:1: rule__Parallele3__Group_5__1 : rule__Parallele3__Group_5__1__Impl rule__Parallele3__Group_5__2 ;
    public final void rule__Parallele3__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3322:1: ( rule__Parallele3__Group_5__1__Impl rule__Parallele3__Group_5__2 )
            // InternalMyTurtleDsl.g:3323:2: rule__Parallele3__Group_5__1__Impl rule__Parallele3__Group_5__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyTurtleDsl.g:3330:1: rule__Parallele3__Group_5__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3334:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:3335:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:3335:1: ( '&' )
            // InternalMyTurtleDsl.g:3336:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_5_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:3345:1: rule__Parallele3__Group_5__2 : rule__Parallele3__Group_5__2__Impl rule__Parallele3__Group_5__3 ;
    public final void rule__Parallele3__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3349:1: ( rule__Parallele3__Group_5__2__Impl rule__Parallele3__Group_5__3 )
            // InternalMyTurtleDsl.g:3350:2: rule__Parallele3__Group_5__2__Impl rule__Parallele3__Group_5__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:3357:1: rule__Parallele3__Group_5__2__Impl : ( ( rule__Parallele3__BAssignment_5_2 ) ) ;
    public final void rule__Parallele3__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3361:1: ( ( ( rule__Parallele3__BAssignment_5_2 ) ) )
            // InternalMyTurtleDsl.g:3362:1: ( ( rule__Parallele3__BAssignment_5_2 ) )
            {
            // InternalMyTurtleDsl.g:3362:1: ( ( rule__Parallele3__BAssignment_5_2 ) )
            // InternalMyTurtleDsl.g:3363:2: ( rule__Parallele3__BAssignment_5_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_5_2()); 
            // InternalMyTurtleDsl.g:3364:2: ( rule__Parallele3__BAssignment_5_2 )
            // InternalMyTurtleDsl.g:3364:3: rule__Parallele3__BAssignment_5_2
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
    // InternalMyTurtleDsl.g:3372:1: rule__Parallele3__Group_5__3 : rule__Parallele3__Group_5__3__Impl rule__Parallele3__Group_5__4 ;
    public final void rule__Parallele3__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3376:1: ( rule__Parallele3__Group_5__3__Impl rule__Parallele3__Group_5__4 )
            // InternalMyTurtleDsl.g:3377:2: rule__Parallele3__Group_5__3__Impl rule__Parallele3__Group_5__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyTurtleDsl.g:3384:1: rule__Parallele3__Group_5__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3388:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:3389:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:3389:1: ( '&' )
            // InternalMyTurtleDsl.g:3390:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_5_3()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:3399:1: rule__Parallele3__Group_5__4 : rule__Parallele3__Group_5__4__Impl ;
    public final void rule__Parallele3__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3403:1: ( rule__Parallele3__Group_5__4__Impl )
            // InternalMyTurtleDsl.g:3404:2: rule__Parallele3__Group_5__4__Impl
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
    // InternalMyTurtleDsl.g:3410:1: rule__Parallele3__Group_5__4__Impl : ( ( rule__Parallele3__CAssignment_5_4 ) ) ;
    public final void rule__Parallele3__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3414:1: ( ( ( rule__Parallele3__CAssignment_5_4 ) ) )
            // InternalMyTurtleDsl.g:3415:1: ( ( rule__Parallele3__CAssignment_5_4 ) )
            {
            // InternalMyTurtleDsl.g:3415:1: ( ( rule__Parallele3__CAssignment_5_4 ) )
            // InternalMyTurtleDsl.g:3416:2: ( rule__Parallele3__CAssignment_5_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_5_4()); 
            // InternalMyTurtleDsl.g:3417:2: ( rule__Parallele3__CAssignment_5_4 )
            // InternalMyTurtleDsl.g:3417:3: rule__Parallele3__CAssignment_5_4
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
    // InternalMyTurtleDsl.g:3426:1: rule__Parallele3__Group_6__0 : rule__Parallele3__Group_6__0__Impl rule__Parallele3__Group_6__1 ;
    public final void rule__Parallele3__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3430:1: ( rule__Parallele3__Group_6__0__Impl rule__Parallele3__Group_6__1 )
            // InternalMyTurtleDsl.g:3431:2: rule__Parallele3__Group_6__0__Impl rule__Parallele3__Group_6__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:3438:1: rule__Parallele3__Group_6__0__Impl : ( ( rule__Parallele3__AAssignment_6_0 ) ) ;
    public final void rule__Parallele3__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3442:1: ( ( ( rule__Parallele3__AAssignment_6_0 ) ) )
            // InternalMyTurtleDsl.g:3443:1: ( ( rule__Parallele3__AAssignment_6_0 ) )
            {
            // InternalMyTurtleDsl.g:3443:1: ( ( rule__Parallele3__AAssignment_6_0 ) )
            // InternalMyTurtleDsl.g:3444:2: ( rule__Parallele3__AAssignment_6_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_6_0()); 
            // InternalMyTurtleDsl.g:3445:2: ( rule__Parallele3__AAssignment_6_0 )
            // InternalMyTurtleDsl.g:3445:3: rule__Parallele3__AAssignment_6_0
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
    // InternalMyTurtleDsl.g:3453:1: rule__Parallele3__Group_6__1 : rule__Parallele3__Group_6__1__Impl rule__Parallele3__Group_6__2 ;
    public final void rule__Parallele3__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3457:1: ( rule__Parallele3__Group_6__1__Impl rule__Parallele3__Group_6__2 )
            // InternalMyTurtleDsl.g:3458:2: rule__Parallele3__Group_6__1__Impl rule__Parallele3__Group_6__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyTurtleDsl.g:3465:1: rule__Parallele3__Group_6__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3469:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:3470:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:3470:1: ( '&' )
            // InternalMyTurtleDsl.g:3471:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_6_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:3480:1: rule__Parallele3__Group_6__2 : rule__Parallele3__Group_6__2__Impl rule__Parallele3__Group_6__3 ;
    public final void rule__Parallele3__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3484:1: ( rule__Parallele3__Group_6__2__Impl rule__Parallele3__Group_6__3 )
            // InternalMyTurtleDsl.g:3485:2: rule__Parallele3__Group_6__2__Impl rule__Parallele3__Group_6__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:3492:1: rule__Parallele3__Group_6__2__Impl : ( ( rule__Parallele3__BAssignment_6_2 ) ) ;
    public final void rule__Parallele3__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3496:1: ( ( ( rule__Parallele3__BAssignment_6_2 ) ) )
            // InternalMyTurtleDsl.g:3497:1: ( ( rule__Parallele3__BAssignment_6_2 ) )
            {
            // InternalMyTurtleDsl.g:3497:1: ( ( rule__Parallele3__BAssignment_6_2 ) )
            // InternalMyTurtleDsl.g:3498:2: ( rule__Parallele3__BAssignment_6_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_6_2()); 
            // InternalMyTurtleDsl.g:3499:2: ( rule__Parallele3__BAssignment_6_2 )
            // InternalMyTurtleDsl.g:3499:3: rule__Parallele3__BAssignment_6_2
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
    // InternalMyTurtleDsl.g:3507:1: rule__Parallele3__Group_6__3 : rule__Parallele3__Group_6__3__Impl rule__Parallele3__Group_6__4 ;
    public final void rule__Parallele3__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3511:1: ( rule__Parallele3__Group_6__3__Impl rule__Parallele3__Group_6__4 )
            // InternalMyTurtleDsl.g:3512:2: rule__Parallele3__Group_6__3__Impl rule__Parallele3__Group_6__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyTurtleDsl.g:3519:1: rule__Parallele3__Group_6__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3523:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:3524:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:3524:1: ( '&' )
            // InternalMyTurtleDsl.g:3525:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_6_3()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:3534:1: rule__Parallele3__Group_6__4 : rule__Parallele3__Group_6__4__Impl ;
    public final void rule__Parallele3__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3538:1: ( rule__Parallele3__Group_6__4__Impl )
            // InternalMyTurtleDsl.g:3539:2: rule__Parallele3__Group_6__4__Impl
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
    // InternalMyTurtleDsl.g:3545:1: rule__Parallele3__Group_6__4__Impl : ( ( rule__Parallele3__CAssignment_6_4 ) ) ;
    public final void rule__Parallele3__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3549:1: ( ( ( rule__Parallele3__CAssignment_6_4 ) ) )
            // InternalMyTurtleDsl.g:3550:1: ( ( rule__Parallele3__CAssignment_6_4 ) )
            {
            // InternalMyTurtleDsl.g:3550:1: ( ( rule__Parallele3__CAssignment_6_4 ) )
            // InternalMyTurtleDsl.g:3551:2: ( rule__Parallele3__CAssignment_6_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_6_4()); 
            // InternalMyTurtleDsl.g:3552:2: ( rule__Parallele3__CAssignment_6_4 )
            // InternalMyTurtleDsl.g:3552:3: rule__Parallele3__CAssignment_6_4
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
    // InternalMyTurtleDsl.g:3561:1: rule__Parallele3__Group_7__0 : rule__Parallele3__Group_7__0__Impl rule__Parallele3__Group_7__1 ;
    public final void rule__Parallele3__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3565:1: ( rule__Parallele3__Group_7__0__Impl rule__Parallele3__Group_7__1 )
            // InternalMyTurtleDsl.g:3566:2: rule__Parallele3__Group_7__0__Impl rule__Parallele3__Group_7__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:3573:1: rule__Parallele3__Group_7__0__Impl : ( ( rule__Parallele3__AAssignment_7_0 ) ) ;
    public final void rule__Parallele3__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3577:1: ( ( ( rule__Parallele3__AAssignment_7_0 ) ) )
            // InternalMyTurtleDsl.g:3578:1: ( ( rule__Parallele3__AAssignment_7_0 ) )
            {
            // InternalMyTurtleDsl.g:3578:1: ( ( rule__Parallele3__AAssignment_7_0 ) )
            // InternalMyTurtleDsl.g:3579:2: ( rule__Parallele3__AAssignment_7_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_7_0()); 
            // InternalMyTurtleDsl.g:3580:2: ( rule__Parallele3__AAssignment_7_0 )
            // InternalMyTurtleDsl.g:3580:3: rule__Parallele3__AAssignment_7_0
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
    // InternalMyTurtleDsl.g:3588:1: rule__Parallele3__Group_7__1 : rule__Parallele3__Group_7__1__Impl rule__Parallele3__Group_7__2 ;
    public final void rule__Parallele3__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3592:1: ( rule__Parallele3__Group_7__1__Impl rule__Parallele3__Group_7__2 )
            // InternalMyTurtleDsl.g:3593:2: rule__Parallele3__Group_7__1__Impl rule__Parallele3__Group_7__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyTurtleDsl.g:3600:1: rule__Parallele3__Group_7__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3604:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:3605:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:3605:1: ( '&' )
            // InternalMyTurtleDsl.g:3606:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_7_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:3615:1: rule__Parallele3__Group_7__2 : rule__Parallele3__Group_7__2__Impl rule__Parallele3__Group_7__3 ;
    public final void rule__Parallele3__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3619:1: ( rule__Parallele3__Group_7__2__Impl rule__Parallele3__Group_7__3 )
            // InternalMyTurtleDsl.g:3620:2: rule__Parallele3__Group_7__2__Impl rule__Parallele3__Group_7__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:3627:1: rule__Parallele3__Group_7__2__Impl : ( ( rule__Parallele3__BAssignment_7_2 ) ) ;
    public final void rule__Parallele3__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3631:1: ( ( ( rule__Parallele3__BAssignment_7_2 ) ) )
            // InternalMyTurtleDsl.g:3632:1: ( ( rule__Parallele3__BAssignment_7_2 ) )
            {
            // InternalMyTurtleDsl.g:3632:1: ( ( rule__Parallele3__BAssignment_7_2 ) )
            // InternalMyTurtleDsl.g:3633:2: ( rule__Parallele3__BAssignment_7_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_7_2()); 
            // InternalMyTurtleDsl.g:3634:2: ( rule__Parallele3__BAssignment_7_2 )
            // InternalMyTurtleDsl.g:3634:3: rule__Parallele3__BAssignment_7_2
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
    // InternalMyTurtleDsl.g:3642:1: rule__Parallele3__Group_7__3 : rule__Parallele3__Group_7__3__Impl rule__Parallele3__Group_7__4 ;
    public final void rule__Parallele3__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3646:1: ( rule__Parallele3__Group_7__3__Impl rule__Parallele3__Group_7__4 )
            // InternalMyTurtleDsl.g:3647:2: rule__Parallele3__Group_7__3__Impl rule__Parallele3__Group_7__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyTurtleDsl.g:3654:1: rule__Parallele3__Group_7__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3658:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:3659:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:3659:1: ( '&' )
            // InternalMyTurtleDsl.g:3660:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_7_3()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:3669:1: rule__Parallele3__Group_7__4 : rule__Parallele3__Group_7__4__Impl ;
    public final void rule__Parallele3__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3673:1: ( rule__Parallele3__Group_7__4__Impl )
            // InternalMyTurtleDsl.g:3674:2: rule__Parallele3__Group_7__4__Impl
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
    // InternalMyTurtleDsl.g:3680:1: rule__Parallele3__Group_7__4__Impl : ( ( rule__Parallele3__CAssignment_7_4 ) ) ;
    public final void rule__Parallele3__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3684:1: ( ( ( rule__Parallele3__CAssignment_7_4 ) ) )
            // InternalMyTurtleDsl.g:3685:1: ( ( rule__Parallele3__CAssignment_7_4 ) )
            {
            // InternalMyTurtleDsl.g:3685:1: ( ( rule__Parallele3__CAssignment_7_4 ) )
            // InternalMyTurtleDsl.g:3686:2: ( rule__Parallele3__CAssignment_7_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_7_4()); 
            // InternalMyTurtleDsl.g:3687:2: ( rule__Parallele3__CAssignment_7_4 )
            // InternalMyTurtleDsl.g:3687:3: rule__Parallele3__CAssignment_7_4
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
    // InternalMyTurtleDsl.g:3696:1: rule__Parallele3__Group_8__0 : rule__Parallele3__Group_8__0__Impl rule__Parallele3__Group_8__1 ;
    public final void rule__Parallele3__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3700:1: ( rule__Parallele3__Group_8__0__Impl rule__Parallele3__Group_8__1 )
            // InternalMyTurtleDsl.g:3701:2: rule__Parallele3__Group_8__0__Impl rule__Parallele3__Group_8__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:3708:1: rule__Parallele3__Group_8__0__Impl : ( ( rule__Parallele3__AAssignment_8_0 ) ) ;
    public final void rule__Parallele3__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3712:1: ( ( ( rule__Parallele3__AAssignment_8_0 ) ) )
            // InternalMyTurtleDsl.g:3713:1: ( ( rule__Parallele3__AAssignment_8_0 ) )
            {
            // InternalMyTurtleDsl.g:3713:1: ( ( rule__Parallele3__AAssignment_8_0 ) )
            // InternalMyTurtleDsl.g:3714:2: ( rule__Parallele3__AAssignment_8_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_8_0()); 
            // InternalMyTurtleDsl.g:3715:2: ( rule__Parallele3__AAssignment_8_0 )
            // InternalMyTurtleDsl.g:3715:3: rule__Parallele3__AAssignment_8_0
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
    // InternalMyTurtleDsl.g:3723:1: rule__Parallele3__Group_8__1 : rule__Parallele3__Group_8__1__Impl rule__Parallele3__Group_8__2 ;
    public final void rule__Parallele3__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3727:1: ( rule__Parallele3__Group_8__1__Impl rule__Parallele3__Group_8__2 )
            // InternalMyTurtleDsl.g:3728:2: rule__Parallele3__Group_8__1__Impl rule__Parallele3__Group_8__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyTurtleDsl.g:3735:1: rule__Parallele3__Group_8__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3739:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:3740:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:3740:1: ( '&' )
            // InternalMyTurtleDsl.g:3741:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_8_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:3750:1: rule__Parallele3__Group_8__2 : rule__Parallele3__Group_8__2__Impl rule__Parallele3__Group_8__3 ;
    public final void rule__Parallele3__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3754:1: ( rule__Parallele3__Group_8__2__Impl rule__Parallele3__Group_8__3 )
            // InternalMyTurtleDsl.g:3755:2: rule__Parallele3__Group_8__2__Impl rule__Parallele3__Group_8__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:3762:1: rule__Parallele3__Group_8__2__Impl : ( ( rule__Parallele3__BAssignment_8_2 ) ) ;
    public final void rule__Parallele3__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3766:1: ( ( ( rule__Parallele3__BAssignment_8_2 ) ) )
            // InternalMyTurtleDsl.g:3767:1: ( ( rule__Parallele3__BAssignment_8_2 ) )
            {
            // InternalMyTurtleDsl.g:3767:1: ( ( rule__Parallele3__BAssignment_8_2 ) )
            // InternalMyTurtleDsl.g:3768:2: ( rule__Parallele3__BAssignment_8_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_8_2()); 
            // InternalMyTurtleDsl.g:3769:2: ( rule__Parallele3__BAssignment_8_2 )
            // InternalMyTurtleDsl.g:3769:3: rule__Parallele3__BAssignment_8_2
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
    // InternalMyTurtleDsl.g:3777:1: rule__Parallele3__Group_8__3 : rule__Parallele3__Group_8__3__Impl rule__Parallele3__Group_8__4 ;
    public final void rule__Parallele3__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3781:1: ( rule__Parallele3__Group_8__3__Impl rule__Parallele3__Group_8__4 )
            // InternalMyTurtleDsl.g:3782:2: rule__Parallele3__Group_8__3__Impl rule__Parallele3__Group_8__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyTurtleDsl.g:3789:1: rule__Parallele3__Group_8__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3793:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:3794:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:3794:1: ( '&' )
            // InternalMyTurtleDsl.g:3795:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_8_3()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:3804:1: rule__Parallele3__Group_8__4 : rule__Parallele3__Group_8__4__Impl ;
    public final void rule__Parallele3__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3808:1: ( rule__Parallele3__Group_8__4__Impl )
            // InternalMyTurtleDsl.g:3809:2: rule__Parallele3__Group_8__4__Impl
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
    // InternalMyTurtleDsl.g:3815:1: rule__Parallele3__Group_8__4__Impl : ( ( rule__Parallele3__CAssignment_8_4 ) ) ;
    public final void rule__Parallele3__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3819:1: ( ( ( rule__Parallele3__CAssignment_8_4 ) ) )
            // InternalMyTurtleDsl.g:3820:1: ( ( rule__Parallele3__CAssignment_8_4 ) )
            {
            // InternalMyTurtleDsl.g:3820:1: ( ( rule__Parallele3__CAssignment_8_4 ) )
            // InternalMyTurtleDsl.g:3821:2: ( rule__Parallele3__CAssignment_8_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_8_4()); 
            // InternalMyTurtleDsl.g:3822:2: ( rule__Parallele3__CAssignment_8_4 )
            // InternalMyTurtleDsl.g:3822:3: rule__Parallele3__CAssignment_8_4
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
    // InternalMyTurtleDsl.g:3831:1: rule__Parallele3__Group_9__0 : rule__Parallele3__Group_9__0__Impl rule__Parallele3__Group_9__1 ;
    public final void rule__Parallele3__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3835:1: ( rule__Parallele3__Group_9__0__Impl rule__Parallele3__Group_9__1 )
            // InternalMyTurtleDsl.g:3836:2: rule__Parallele3__Group_9__0__Impl rule__Parallele3__Group_9__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:3843:1: rule__Parallele3__Group_9__0__Impl : ( ( rule__Parallele3__AAssignment_9_0 ) ) ;
    public final void rule__Parallele3__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3847:1: ( ( ( rule__Parallele3__AAssignment_9_0 ) ) )
            // InternalMyTurtleDsl.g:3848:1: ( ( rule__Parallele3__AAssignment_9_0 ) )
            {
            // InternalMyTurtleDsl.g:3848:1: ( ( rule__Parallele3__AAssignment_9_0 ) )
            // InternalMyTurtleDsl.g:3849:2: ( rule__Parallele3__AAssignment_9_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_9_0()); 
            // InternalMyTurtleDsl.g:3850:2: ( rule__Parallele3__AAssignment_9_0 )
            // InternalMyTurtleDsl.g:3850:3: rule__Parallele3__AAssignment_9_0
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
    // InternalMyTurtleDsl.g:3858:1: rule__Parallele3__Group_9__1 : rule__Parallele3__Group_9__1__Impl rule__Parallele3__Group_9__2 ;
    public final void rule__Parallele3__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3862:1: ( rule__Parallele3__Group_9__1__Impl rule__Parallele3__Group_9__2 )
            // InternalMyTurtleDsl.g:3863:2: rule__Parallele3__Group_9__1__Impl rule__Parallele3__Group_9__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyTurtleDsl.g:3870:1: rule__Parallele3__Group_9__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3874:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:3875:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:3875:1: ( '&' )
            // InternalMyTurtleDsl.g:3876:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_9_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:3885:1: rule__Parallele3__Group_9__2 : rule__Parallele3__Group_9__2__Impl rule__Parallele3__Group_9__3 ;
    public final void rule__Parallele3__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3889:1: ( rule__Parallele3__Group_9__2__Impl rule__Parallele3__Group_9__3 )
            // InternalMyTurtleDsl.g:3890:2: rule__Parallele3__Group_9__2__Impl rule__Parallele3__Group_9__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:3897:1: rule__Parallele3__Group_9__2__Impl : ( ( rule__Parallele3__BAssignment_9_2 ) ) ;
    public final void rule__Parallele3__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3901:1: ( ( ( rule__Parallele3__BAssignment_9_2 ) ) )
            // InternalMyTurtleDsl.g:3902:1: ( ( rule__Parallele3__BAssignment_9_2 ) )
            {
            // InternalMyTurtleDsl.g:3902:1: ( ( rule__Parallele3__BAssignment_9_2 ) )
            // InternalMyTurtleDsl.g:3903:2: ( rule__Parallele3__BAssignment_9_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_9_2()); 
            // InternalMyTurtleDsl.g:3904:2: ( rule__Parallele3__BAssignment_9_2 )
            // InternalMyTurtleDsl.g:3904:3: rule__Parallele3__BAssignment_9_2
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
    // InternalMyTurtleDsl.g:3912:1: rule__Parallele3__Group_9__3 : rule__Parallele3__Group_9__3__Impl rule__Parallele3__Group_9__4 ;
    public final void rule__Parallele3__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3916:1: ( rule__Parallele3__Group_9__3__Impl rule__Parallele3__Group_9__4 )
            // InternalMyTurtleDsl.g:3917:2: rule__Parallele3__Group_9__3__Impl rule__Parallele3__Group_9__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyTurtleDsl.g:3924:1: rule__Parallele3__Group_9__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3928:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:3929:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:3929:1: ( '&' )
            // InternalMyTurtleDsl.g:3930:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_9_3()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:3939:1: rule__Parallele3__Group_9__4 : rule__Parallele3__Group_9__4__Impl ;
    public final void rule__Parallele3__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3943:1: ( rule__Parallele3__Group_9__4__Impl )
            // InternalMyTurtleDsl.g:3944:2: rule__Parallele3__Group_9__4__Impl
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
    // InternalMyTurtleDsl.g:3950:1: rule__Parallele3__Group_9__4__Impl : ( ( rule__Parallele3__CAssignment_9_4 ) ) ;
    public final void rule__Parallele3__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3954:1: ( ( ( rule__Parallele3__CAssignment_9_4 ) ) )
            // InternalMyTurtleDsl.g:3955:1: ( ( rule__Parallele3__CAssignment_9_4 ) )
            {
            // InternalMyTurtleDsl.g:3955:1: ( ( rule__Parallele3__CAssignment_9_4 ) )
            // InternalMyTurtleDsl.g:3956:2: ( rule__Parallele3__CAssignment_9_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_9_4()); 
            // InternalMyTurtleDsl.g:3957:2: ( rule__Parallele3__CAssignment_9_4 )
            // InternalMyTurtleDsl.g:3957:3: rule__Parallele3__CAssignment_9_4
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
    // InternalMyTurtleDsl.g:3966:1: rule__Parallele3__Group_10__0 : rule__Parallele3__Group_10__0__Impl rule__Parallele3__Group_10__1 ;
    public final void rule__Parallele3__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3970:1: ( rule__Parallele3__Group_10__0__Impl rule__Parallele3__Group_10__1 )
            // InternalMyTurtleDsl.g:3971:2: rule__Parallele3__Group_10__0__Impl rule__Parallele3__Group_10__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:3978:1: rule__Parallele3__Group_10__0__Impl : ( ( rule__Parallele3__AAssignment_10_0 ) ) ;
    public final void rule__Parallele3__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3982:1: ( ( ( rule__Parallele3__AAssignment_10_0 ) ) )
            // InternalMyTurtleDsl.g:3983:1: ( ( rule__Parallele3__AAssignment_10_0 ) )
            {
            // InternalMyTurtleDsl.g:3983:1: ( ( rule__Parallele3__AAssignment_10_0 ) )
            // InternalMyTurtleDsl.g:3984:2: ( rule__Parallele3__AAssignment_10_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_10_0()); 
            // InternalMyTurtleDsl.g:3985:2: ( rule__Parallele3__AAssignment_10_0 )
            // InternalMyTurtleDsl.g:3985:3: rule__Parallele3__AAssignment_10_0
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
    // InternalMyTurtleDsl.g:3993:1: rule__Parallele3__Group_10__1 : rule__Parallele3__Group_10__1__Impl rule__Parallele3__Group_10__2 ;
    public final void rule__Parallele3__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:3997:1: ( rule__Parallele3__Group_10__1__Impl rule__Parallele3__Group_10__2 )
            // InternalMyTurtleDsl.g:3998:2: rule__Parallele3__Group_10__1__Impl rule__Parallele3__Group_10__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyTurtleDsl.g:4005:1: rule__Parallele3__Group_10__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4009:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:4010:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:4010:1: ( '&' )
            // InternalMyTurtleDsl.g:4011:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_10_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:4020:1: rule__Parallele3__Group_10__2 : rule__Parallele3__Group_10__2__Impl rule__Parallele3__Group_10__3 ;
    public final void rule__Parallele3__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4024:1: ( rule__Parallele3__Group_10__2__Impl rule__Parallele3__Group_10__3 )
            // InternalMyTurtleDsl.g:4025:2: rule__Parallele3__Group_10__2__Impl rule__Parallele3__Group_10__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:4032:1: rule__Parallele3__Group_10__2__Impl : ( ( rule__Parallele3__BAssignment_10_2 ) ) ;
    public final void rule__Parallele3__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4036:1: ( ( ( rule__Parallele3__BAssignment_10_2 ) ) )
            // InternalMyTurtleDsl.g:4037:1: ( ( rule__Parallele3__BAssignment_10_2 ) )
            {
            // InternalMyTurtleDsl.g:4037:1: ( ( rule__Parallele3__BAssignment_10_2 ) )
            // InternalMyTurtleDsl.g:4038:2: ( rule__Parallele3__BAssignment_10_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_10_2()); 
            // InternalMyTurtleDsl.g:4039:2: ( rule__Parallele3__BAssignment_10_2 )
            // InternalMyTurtleDsl.g:4039:3: rule__Parallele3__BAssignment_10_2
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
    // InternalMyTurtleDsl.g:4047:1: rule__Parallele3__Group_10__3 : rule__Parallele3__Group_10__3__Impl rule__Parallele3__Group_10__4 ;
    public final void rule__Parallele3__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4051:1: ( rule__Parallele3__Group_10__3__Impl rule__Parallele3__Group_10__4 )
            // InternalMyTurtleDsl.g:4052:2: rule__Parallele3__Group_10__3__Impl rule__Parallele3__Group_10__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyTurtleDsl.g:4059:1: rule__Parallele3__Group_10__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4063:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:4064:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:4064:1: ( '&' )
            // InternalMyTurtleDsl.g:4065:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_10_3()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:4074:1: rule__Parallele3__Group_10__4 : rule__Parallele3__Group_10__4__Impl ;
    public final void rule__Parallele3__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4078:1: ( rule__Parallele3__Group_10__4__Impl )
            // InternalMyTurtleDsl.g:4079:2: rule__Parallele3__Group_10__4__Impl
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
    // InternalMyTurtleDsl.g:4085:1: rule__Parallele3__Group_10__4__Impl : ( ( rule__Parallele3__CAssignment_10_4 ) ) ;
    public final void rule__Parallele3__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4089:1: ( ( ( rule__Parallele3__CAssignment_10_4 ) ) )
            // InternalMyTurtleDsl.g:4090:1: ( ( rule__Parallele3__CAssignment_10_4 ) )
            {
            // InternalMyTurtleDsl.g:4090:1: ( ( rule__Parallele3__CAssignment_10_4 ) )
            // InternalMyTurtleDsl.g:4091:2: ( rule__Parallele3__CAssignment_10_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_10_4()); 
            // InternalMyTurtleDsl.g:4092:2: ( rule__Parallele3__CAssignment_10_4 )
            // InternalMyTurtleDsl.g:4092:3: rule__Parallele3__CAssignment_10_4
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
    // InternalMyTurtleDsl.g:4101:1: rule__Parallele3__Group_11__0 : rule__Parallele3__Group_11__0__Impl rule__Parallele3__Group_11__1 ;
    public final void rule__Parallele3__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4105:1: ( rule__Parallele3__Group_11__0__Impl rule__Parallele3__Group_11__1 )
            // InternalMyTurtleDsl.g:4106:2: rule__Parallele3__Group_11__0__Impl rule__Parallele3__Group_11__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:4113:1: rule__Parallele3__Group_11__0__Impl : ( ( rule__Parallele3__AAssignment_11_0 ) ) ;
    public final void rule__Parallele3__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4117:1: ( ( ( rule__Parallele3__AAssignment_11_0 ) ) )
            // InternalMyTurtleDsl.g:4118:1: ( ( rule__Parallele3__AAssignment_11_0 ) )
            {
            // InternalMyTurtleDsl.g:4118:1: ( ( rule__Parallele3__AAssignment_11_0 ) )
            // InternalMyTurtleDsl.g:4119:2: ( rule__Parallele3__AAssignment_11_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_11_0()); 
            // InternalMyTurtleDsl.g:4120:2: ( rule__Parallele3__AAssignment_11_0 )
            // InternalMyTurtleDsl.g:4120:3: rule__Parallele3__AAssignment_11_0
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
    // InternalMyTurtleDsl.g:4128:1: rule__Parallele3__Group_11__1 : rule__Parallele3__Group_11__1__Impl rule__Parallele3__Group_11__2 ;
    public final void rule__Parallele3__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4132:1: ( rule__Parallele3__Group_11__1__Impl rule__Parallele3__Group_11__2 )
            // InternalMyTurtleDsl.g:4133:2: rule__Parallele3__Group_11__1__Impl rule__Parallele3__Group_11__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyTurtleDsl.g:4140:1: rule__Parallele3__Group_11__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4144:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:4145:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:4145:1: ( '&' )
            // InternalMyTurtleDsl.g:4146:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_11_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:4155:1: rule__Parallele3__Group_11__2 : rule__Parallele3__Group_11__2__Impl rule__Parallele3__Group_11__3 ;
    public final void rule__Parallele3__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4159:1: ( rule__Parallele3__Group_11__2__Impl rule__Parallele3__Group_11__3 )
            // InternalMyTurtleDsl.g:4160:2: rule__Parallele3__Group_11__2__Impl rule__Parallele3__Group_11__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:4167:1: rule__Parallele3__Group_11__2__Impl : ( ( rule__Parallele3__BAssignment_11_2 ) ) ;
    public final void rule__Parallele3__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4171:1: ( ( ( rule__Parallele3__BAssignment_11_2 ) ) )
            // InternalMyTurtleDsl.g:4172:1: ( ( rule__Parallele3__BAssignment_11_2 ) )
            {
            // InternalMyTurtleDsl.g:4172:1: ( ( rule__Parallele3__BAssignment_11_2 ) )
            // InternalMyTurtleDsl.g:4173:2: ( rule__Parallele3__BAssignment_11_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_11_2()); 
            // InternalMyTurtleDsl.g:4174:2: ( rule__Parallele3__BAssignment_11_2 )
            // InternalMyTurtleDsl.g:4174:3: rule__Parallele3__BAssignment_11_2
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
    // InternalMyTurtleDsl.g:4182:1: rule__Parallele3__Group_11__3 : rule__Parallele3__Group_11__3__Impl rule__Parallele3__Group_11__4 ;
    public final void rule__Parallele3__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4186:1: ( rule__Parallele3__Group_11__3__Impl rule__Parallele3__Group_11__4 )
            // InternalMyTurtleDsl.g:4187:2: rule__Parallele3__Group_11__3__Impl rule__Parallele3__Group_11__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyTurtleDsl.g:4194:1: rule__Parallele3__Group_11__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4198:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:4199:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:4199:1: ( '&' )
            // InternalMyTurtleDsl.g:4200:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_11_3()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:4209:1: rule__Parallele3__Group_11__4 : rule__Parallele3__Group_11__4__Impl ;
    public final void rule__Parallele3__Group_11__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4213:1: ( rule__Parallele3__Group_11__4__Impl )
            // InternalMyTurtleDsl.g:4214:2: rule__Parallele3__Group_11__4__Impl
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
    // InternalMyTurtleDsl.g:4220:1: rule__Parallele3__Group_11__4__Impl : ( ( rule__Parallele3__CAssignment_11_4 ) ) ;
    public final void rule__Parallele3__Group_11__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4224:1: ( ( ( rule__Parallele3__CAssignment_11_4 ) ) )
            // InternalMyTurtleDsl.g:4225:1: ( ( rule__Parallele3__CAssignment_11_4 ) )
            {
            // InternalMyTurtleDsl.g:4225:1: ( ( rule__Parallele3__CAssignment_11_4 ) )
            // InternalMyTurtleDsl.g:4226:2: ( rule__Parallele3__CAssignment_11_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_11_4()); 
            // InternalMyTurtleDsl.g:4227:2: ( rule__Parallele3__CAssignment_11_4 )
            // InternalMyTurtleDsl.g:4227:3: rule__Parallele3__CAssignment_11_4
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
    // InternalMyTurtleDsl.g:4236:1: rule__Parallele3__Group_12__0 : rule__Parallele3__Group_12__0__Impl rule__Parallele3__Group_12__1 ;
    public final void rule__Parallele3__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4240:1: ( rule__Parallele3__Group_12__0__Impl rule__Parallele3__Group_12__1 )
            // InternalMyTurtleDsl.g:4241:2: rule__Parallele3__Group_12__0__Impl rule__Parallele3__Group_12__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:4248:1: rule__Parallele3__Group_12__0__Impl : ( ( rule__Parallele3__AAssignment_12_0 ) ) ;
    public final void rule__Parallele3__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4252:1: ( ( ( rule__Parallele3__AAssignment_12_0 ) ) )
            // InternalMyTurtleDsl.g:4253:1: ( ( rule__Parallele3__AAssignment_12_0 ) )
            {
            // InternalMyTurtleDsl.g:4253:1: ( ( rule__Parallele3__AAssignment_12_0 ) )
            // InternalMyTurtleDsl.g:4254:2: ( rule__Parallele3__AAssignment_12_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_12_0()); 
            // InternalMyTurtleDsl.g:4255:2: ( rule__Parallele3__AAssignment_12_0 )
            // InternalMyTurtleDsl.g:4255:3: rule__Parallele3__AAssignment_12_0
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
    // InternalMyTurtleDsl.g:4263:1: rule__Parallele3__Group_12__1 : rule__Parallele3__Group_12__1__Impl rule__Parallele3__Group_12__2 ;
    public final void rule__Parallele3__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4267:1: ( rule__Parallele3__Group_12__1__Impl rule__Parallele3__Group_12__2 )
            // InternalMyTurtleDsl.g:4268:2: rule__Parallele3__Group_12__1__Impl rule__Parallele3__Group_12__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyTurtleDsl.g:4275:1: rule__Parallele3__Group_12__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4279:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:4280:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:4280:1: ( '&' )
            // InternalMyTurtleDsl.g:4281:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_12_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:4290:1: rule__Parallele3__Group_12__2 : rule__Parallele3__Group_12__2__Impl rule__Parallele3__Group_12__3 ;
    public final void rule__Parallele3__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4294:1: ( rule__Parallele3__Group_12__2__Impl rule__Parallele3__Group_12__3 )
            // InternalMyTurtleDsl.g:4295:2: rule__Parallele3__Group_12__2__Impl rule__Parallele3__Group_12__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:4302:1: rule__Parallele3__Group_12__2__Impl : ( ( rule__Parallele3__BAssignment_12_2 ) ) ;
    public final void rule__Parallele3__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4306:1: ( ( ( rule__Parallele3__BAssignment_12_2 ) ) )
            // InternalMyTurtleDsl.g:4307:1: ( ( rule__Parallele3__BAssignment_12_2 ) )
            {
            // InternalMyTurtleDsl.g:4307:1: ( ( rule__Parallele3__BAssignment_12_2 ) )
            // InternalMyTurtleDsl.g:4308:2: ( rule__Parallele3__BAssignment_12_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_12_2()); 
            // InternalMyTurtleDsl.g:4309:2: ( rule__Parallele3__BAssignment_12_2 )
            // InternalMyTurtleDsl.g:4309:3: rule__Parallele3__BAssignment_12_2
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
    // InternalMyTurtleDsl.g:4317:1: rule__Parallele3__Group_12__3 : rule__Parallele3__Group_12__3__Impl rule__Parallele3__Group_12__4 ;
    public final void rule__Parallele3__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4321:1: ( rule__Parallele3__Group_12__3__Impl rule__Parallele3__Group_12__4 )
            // InternalMyTurtleDsl.g:4322:2: rule__Parallele3__Group_12__3__Impl rule__Parallele3__Group_12__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyTurtleDsl.g:4329:1: rule__Parallele3__Group_12__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4333:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:4334:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:4334:1: ( '&' )
            // InternalMyTurtleDsl.g:4335:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_12_3()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:4344:1: rule__Parallele3__Group_12__4 : rule__Parallele3__Group_12__4__Impl ;
    public final void rule__Parallele3__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4348:1: ( rule__Parallele3__Group_12__4__Impl )
            // InternalMyTurtleDsl.g:4349:2: rule__Parallele3__Group_12__4__Impl
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
    // InternalMyTurtleDsl.g:4355:1: rule__Parallele3__Group_12__4__Impl : ( ( rule__Parallele3__CAssignment_12_4 ) ) ;
    public final void rule__Parallele3__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4359:1: ( ( ( rule__Parallele3__CAssignment_12_4 ) ) )
            // InternalMyTurtleDsl.g:4360:1: ( ( rule__Parallele3__CAssignment_12_4 ) )
            {
            // InternalMyTurtleDsl.g:4360:1: ( ( rule__Parallele3__CAssignment_12_4 ) )
            // InternalMyTurtleDsl.g:4361:2: ( rule__Parallele3__CAssignment_12_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_12_4()); 
            // InternalMyTurtleDsl.g:4362:2: ( rule__Parallele3__CAssignment_12_4 )
            // InternalMyTurtleDsl.g:4362:3: rule__Parallele3__CAssignment_12_4
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
    // InternalMyTurtleDsl.g:4371:1: rule__Parallele3__Group_13__0 : rule__Parallele3__Group_13__0__Impl rule__Parallele3__Group_13__1 ;
    public final void rule__Parallele3__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4375:1: ( rule__Parallele3__Group_13__0__Impl rule__Parallele3__Group_13__1 )
            // InternalMyTurtleDsl.g:4376:2: rule__Parallele3__Group_13__0__Impl rule__Parallele3__Group_13__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:4383:1: rule__Parallele3__Group_13__0__Impl : ( ( rule__Parallele3__AAssignment_13_0 ) ) ;
    public final void rule__Parallele3__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4387:1: ( ( ( rule__Parallele3__AAssignment_13_0 ) ) )
            // InternalMyTurtleDsl.g:4388:1: ( ( rule__Parallele3__AAssignment_13_0 ) )
            {
            // InternalMyTurtleDsl.g:4388:1: ( ( rule__Parallele3__AAssignment_13_0 ) )
            // InternalMyTurtleDsl.g:4389:2: ( rule__Parallele3__AAssignment_13_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_13_0()); 
            // InternalMyTurtleDsl.g:4390:2: ( rule__Parallele3__AAssignment_13_0 )
            // InternalMyTurtleDsl.g:4390:3: rule__Parallele3__AAssignment_13_0
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
    // InternalMyTurtleDsl.g:4398:1: rule__Parallele3__Group_13__1 : rule__Parallele3__Group_13__1__Impl rule__Parallele3__Group_13__2 ;
    public final void rule__Parallele3__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4402:1: ( rule__Parallele3__Group_13__1__Impl rule__Parallele3__Group_13__2 )
            // InternalMyTurtleDsl.g:4403:2: rule__Parallele3__Group_13__1__Impl rule__Parallele3__Group_13__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyTurtleDsl.g:4410:1: rule__Parallele3__Group_13__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4414:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:4415:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:4415:1: ( '&' )
            // InternalMyTurtleDsl.g:4416:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_13_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:4425:1: rule__Parallele3__Group_13__2 : rule__Parallele3__Group_13__2__Impl rule__Parallele3__Group_13__3 ;
    public final void rule__Parallele3__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4429:1: ( rule__Parallele3__Group_13__2__Impl rule__Parallele3__Group_13__3 )
            // InternalMyTurtleDsl.g:4430:2: rule__Parallele3__Group_13__2__Impl rule__Parallele3__Group_13__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:4437:1: rule__Parallele3__Group_13__2__Impl : ( ( rule__Parallele3__BAssignment_13_2 ) ) ;
    public final void rule__Parallele3__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4441:1: ( ( ( rule__Parallele3__BAssignment_13_2 ) ) )
            // InternalMyTurtleDsl.g:4442:1: ( ( rule__Parallele3__BAssignment_13_2 ) )
            {
            // InternalMyTurtleDsl.g:4442:1: ( ( rule__Parallele3__BAssignment_13_2 ) )
            // InternalMyTurtleDsl.g:4443:2: ( rule__Parallele3__BAssignment_13_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_13_2()); 
            // InternalMyTurtleDsl.g:4444:2: ( rule__Parallele3__BAssignment_13_2 )
            // InternalMyTurtleDsl.g:4444:3: rule__Parallele3__BAssignment_13_2
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
    // InternalMyTurtleDsl.g:4452:1: rule__Parallele3__Group_13__3 : rule__Parallele3__Group_13__3__Impl rule__Parallele3__Group_13__4 ;
    public final void rule__Parallele3__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4456:1: ( rule__Parallele3__Group_13__3__Impl rule__Parallele3__Group_13__4 )
            // InternalMyTurtleDsl.g:4457:2: rule__Parallele3__Group_13__3__Impl rule__Parallele3__Group_13__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyTurtleDsl.g:4464:1: rule__Parallele3__Group_13__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4468:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:4469:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:4469:1: ( '&' )
            // InternalMyTurtleDsl.g:4470:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_13_3()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:4479:1: rule__Parallele3__Group_13__4 : rule__Parallele3__Group_13__4__Impl ;
    public final void rule__Parallele3__Group_13__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4483:1: ( rule__Parallele3__Group_13__4__Impl )
            // InternalMyTurtleDsl.g:4484:2: rule__Parallele3__Group_13__4__Impl
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
    // InternalMyTurtleDsl.g:4490:1: rule__Parallele3__Group_13__4__Impl : ( ( rule__Parallele3__CAssignment_13_4 ) ) ;
    public final void rule__Parallele3__Group_13__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4494:1: ( ( ( rule__Parallele3__CAssignment_13_4 ) ) )
            // InternalMyTurtleDsl.g:4495:1: ( ( rule__Parallele3__CAssignment_13_4 ) )
            {
            // InternalMyTurtleDsl.g:4495:1: ( ( rule__Parallele3__CAssignment_13_4 ) )
            // InternalMyTurtleDsl.g:4496:2: ( rule__Parallele3__CAssignment_13_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_13_4()); 
            // InternalMyTurtleDsl.g:4497:2: ( rule__Parallele3__CAssignment_13_4 )
            // InternalMyTurtleDsl.g:4497:3: rule__Parallele3__CAssignment_13_4
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
    // InternalMyTurtleDsl.g:4506:1: rule__Parallele3__Group_14__0 : rule__Parallele3__Group_14__0__Impl rule__Parallele3__Group_14__1 ;
    public final void rule__Parallele3__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4510:1: ( rule__Parallele3__Group_14__0__Impl rule__Parallele3__Group_14__1 )
            // InternalMyTurtleDsl.g:4511:2: rule__Parallele3__Group_14__0__Impl rule__Parallele3__Group_14__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:4518:1: rule__Parallele3__Group_14__0__Impl : ( ( rule__Parallele3__AAssignment_14_0 ) ) ;
    public final void rule__Parallele3__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4522:1: ( ( ( rule__Parallele3__AAssignment_14_0 ) ) )
            // InternalMyTurtleDsl.g:4523:1: ( ( rule__Parallele3__AAssignment_14_0 ) )
            {
            // InternalMyTurtleDsl.g:4523:1: ( ( rule__Parallele3__AAssignment_14_0 ) )
            // InternalMyTurtleDsl.g:4524:2: ( rule__Parallele3__AAssignment_14_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_14_0()); 
            // InternalMyTurtleDsl.g:4525:2: ( rule__Parallele3__AAssignment_14_0 )
            // InternalMyTurtleDsl.g:4525:3: rule__Parallele3__AAssignment_14_0
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
    // InternalMyTurtleDsl.g:4533:1: rule__Parallele3__Group_14__1 : rule__Parallele3__Group_14__1__Impl rule__Parallele3__Group_14__2 ;
    public final void rule__Parallele3__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4537:1: ( rule__Parallele3__Group_14__1__Impl rule__Parallele3__Group_14__2 )
            // InternalMyTurtleDsl.g:4538:2: rule__Parallele3__Group_14__1__Impl rule__Parallele3__Group_14__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyTurtleDsl.g:4545:1: rule__Parallele3__Group_14__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4549:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:4550:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:4550:1: ( '&' )
            // InternalMyTurtleDsl.g:4551:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_14_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:4560:1: rule__Parallele3__Group_14__2 : rule__Parallele3__Group_14__2__Impl rule__Parallele3__Group_14__3 ;
    public final void rule__Parallele3__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4564:1: ( rule__Parallele3__Group_14__2__Impl rule__Parallele3__Group_14__3 )
            // InternalMyTurtleDsl.g:4565:2: rule__Parallele3__Group_14__2__Impl rule__Parallele3__Group_14__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:4572:1: rule__Parallele3__Group_14__2__Impl : ( ( rule__Parallele3__BAssignment_14_2 ) ) ;
    public final void rule__Parallele3__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4576:1: ( ( ( rule__Parallele3__BAssignment_14_2 ) ) )
            // InternalMyTurtleDsl.g:4577:1: ( ( rule__Parallele3__BAssignment_14_2 ) )
            {
            // InternalMyTurtleDsl.g:4577:1: ( ( rule__Parallele3__BAssignment_14_2 ) )
            // InternalMyTurtleDsl.g:4578:2: ( rule__Parallele3__BAssignment_14_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_14_2()); 
            // InternalMyTurtleDsl.g:4579:2: ( rule__Parallele3__BAssignment_14_2 )
            // InternalMyTurtleDsl.g:4579:3: rule__Parallele3__BAssignment_14_2
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
    // InternalMyTurtleDsl.g:4587:1: rule__Parallele3__Group_14__3 : rule__Parallele3__Group_14__3__Impl rule__Parallele3__Group_14__4 ;
    public final void rule__Parallele3__Group_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4591:1: ( rule__Parallele3__Group_14__3__Impl rule__Parallele3__Group_14__4 )
            // InternalMyTurtleDsl.g:4592:2: rule__Parallele3__Group_14__3__Impl rule__Parallele3__Group_14__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyTurtleDsl.g:4599:1: rule__Parallele3__Group_14__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_14__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4603:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:4604:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:4604:1: ( '&' )
            // InternalMyTurtleDsl.g:4605:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_14_3()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:4614:1: rule__Parallele3__Group_14__4 : rule__Parallele3__Group_14__4__Impl ;
    public final void rule__Parallele3__Group_14__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4618:1: ( rule__Parallele3__Group_14__4__Impl )
            // InternalMyTurtleDsl.g:4619:2: rule__Parallele3__Group_14__4__Impl
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
    // InternalMyTurtleDsl.g:4625:1: rule__Parallele3__Group_14__4__Impl : ( ( rule__Parallele3__CAssignment_14_4 ) ) ;
    public final void rule__Parallele3__Group_14__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4629:1: ( ( ( rule__Parallele3__CAssignment_14_4 ) ) )
            // InternalMyTurtleDsl.g:4630:1: ( ( rule__Parallele3__CAssignment_14_4 ) )
            {
            // InternalMyTurtleDsl.g:4630:1: ( ( rule__Parallele3__CAssignment_14_4 ) )
            // InternalMyTurtleDsl.g:4631:2: ( rule__Parallele3__CAssignment_14_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_14_4()); 
            // InternalMyTurtleDsl.g:4632:2: ( rule__Parallele3__CAssignment_14_4 )
            // InternalMyTurtleDsl.g:4632:3: rule__Parallele3__CAssignment_14_4
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
    // InternalMyTurtleDsl.g:4641:1: rule__Parallele3__Group_15__0 : rule__Parallele3__Group_15__0__Impl rule__Parallele3__Group_15__1 ;
    public final void rule__Parallele3__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4645:1: ( rule__Parallele3__Group_15__0__Impl rule__Parallele3__Group_15__1 )
            // InternalMyTurtleDsl.g:4646:2: rule__Parallele3__Group_15__0__Impl rule__Parallele3__Group_15__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:4653:1: rule__Parallele3__Group_15__0__Impl : ( ( rule__Parallele3__AAssignment_15_0 ) ) ;
    public final void rule__Parallele3__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4657:1: ( ( ( rule__Parallele3__AAssignment_15_0 ) ) )
            // InternalMyTurtleDsl.g:4658:1: ( ( rule__Parallele3__AAssignment_15_0 ) )
            {
            // InternalMyTurtleDsl.g:4658:1: ( ( rule__Parallele3__AAssignment_15_0 ) )
            // InternalMyTurtleDsl.g:4659:2: ( rule__Parallele3__AAssignment_15_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_15_0()); 
            // InternalMyTurtleDsl.g:4660:2: ( rule__Parallele3__AAssignment_15_0 )
            // InternalMyTurtleDsl.g:4660:3: rule__Parallele3__AAssignment_15_0
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
    // InternalMyTurtleDsl.g:4668:1: rule__Parallele3__Group_15__1 : rule__Parallele3__Group_15__1__Impl rule__Parallele3__Group_15__2 ;
    public final void rule__Parallele3__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4672:1: ( rule__Parallele3__Group_15__1__Impl rule__Parallele3__Group_15__2 )
            // InternalMyTurtleDsl.g:4673:2: rule__Parallele3__Group_15__1__Impl rule__Parallele3__Group_15__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyTurtleDsl.g:4680:1: rule__Parallele3__Group_15__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4684:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:4685:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:4685:1: ( '&' )
            // InternalMyTurtleDsl.g:4686:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_15_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:4695:1: rule__Parallele3__Group_15__2 : rule__Parallele3__Group_15__2__Impl rule__Parallele3__Group_15__3 ;
    public final void rule__Parallele3__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4699:1: ( rule__Parallele3__Group_15__2__Impl rule__Parallele3__Group_15__3 )
            // InternalMyTurtleDsl.g:4700:2: rule__Parallele3__Group_15__2__Impl rule__Parallele3__Group_15__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:4707:1: rule__Parallele3__Group_15__2__Impl : ( ( rule__Parallele3__BAssignment_15_2 ) ) ;
    public final void rule__Parallele3__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4711:1: ( ( ( rule__Parallele3__BAssignment_15_2 ) ) )
            // InternalMyTurtleDsl.g:4712:1: ( ( rule__Parallele3__BAssignment_15_2 ) )
            {
            // InternalMyTurtleDsl.g:4712:1: ( ( rule__Parallele3__BAssignment_15_2 ) )
            // InternalMyTurtleDsl.g:4713:2: ( rule__Parallele3__BAssignment_15_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_15_2()); 
            // InternalMyTurtleDsl.g:4714:2: ( rule__Parallele3__BAssignment_15_2 )
            // InternalMyTurtleDsl.g:4714:3: rule__Parallele3__BAssignment_15_2
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
    // InternalMyTurtleDsl.g:4722:1: rule__Parallele3__Group_15__3 : rule__Parallele3__Group_15__3__Impl rule__Parallele3__Group_15__4 ;
    public final void rule__Parallele3__Group_15__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4726:1: ( rule__Parallele3__Group_15__3__Impl rule__Parallele3__Group_15__4 )
            // InternalMyTurtleDsl.g:4727:2: rule__Parallele3__Group_15__3__Impl rule__Parallele3__Group_15__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyTurtleDsl.g:4734:1: rule__Parallele3__Group_15__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_15__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4738:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:4739:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:4739:1: ( '&' )
            // InternalMyTurtleDsl.g:4740:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_15_3()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:4749:1: rule__Parallele3__Group_15__4 : rule__Parallele3__Group_15__4__Impl ;
    public final void rule__Parallele3__Group_15__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4753:1: ( rule__Parallele3__Group_15__4__Impl )
            // InternalMyTurtleDsl.g:4754:2: rule__Parallele3__Group_15__4__Impl
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
    // InternalMyTurtleDsl.g:4760:1: rule__Parallele3__Group_15__4__Impl : ( ( rule__Parallele3__CAssignment_15_4 ) ) ;
    public final void rule__Parallele3__Group_15__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4764:1: ( ( ( rule__Parallele3__CAssignment_15_4 ) ) )
            // InternalMyTurtleDsl.g:4765:1: ( ( rule__Parallele3__CAssignment_15_4 ) )
            {
            // InternalMyTurtleDsl.g:4765:1: ( ( rule__Parallele3__CAssignment_15_4 ) )
            // InternalMyTurtleDsl.g:4766:2: ( rule__Parallele3__CAssignment_15_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_15_4()); 
            // InternalMyTurtleDsl.g:4767:2: ( rule__Parallele3__CAssignment_15_4 )
            // InternalMyTurtleDsl.g:4767:3: rule__Parallele3__CAssignment_15_4
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
    // InternalMyTurtleDsl.g:4776:1: rule__Parallele3__Group_16__0 : rule__Parallele3__Group_16__0__Impl rule__Parallele3__Group_16__1 ;
    public final void rule__Parallele3__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4780:1: ( rule__Parallele3__Group_16__0__Impl rule__Parallele3__Group_16__1 )
            // InternalMyTurtleDsl.g:4781:2: rule__Parallele3__Group_16__0__Impl rule__Parallele3__Group_16__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:4788:1: rule__Parallele3__Group_16__0__Impl : ( ( rule__Parallele3__AAssignment_16_0 ) ) ;
    public final void rule__Parallele3__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4792:1: ( ( ( rule__Parallele3__AAssignment_16_0 ) ) )
            // InternalMyTurtleDsl.g:4793:1: ( ( rule__Parallele3__AAssignment_16_0 ) )
            {
            // InternalMyTurtleDsl.g:4793:1: ( ( rule__Parallele3__AAssignment_16_0 ) )
            // InternalMyTurtleDsl.g:4794:2: ( rule__Parallele3__AAssignment_16_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_16_0()); 
            // InternalMyTurtleDsl.g:4795:2: ( rule__Parallele3__AAssignment_16_0 )
            // InternalMyTurtleDsl.g:4795:3: rule__Parallele3__AAssignment_16_0
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
    // InternalMyTurtleDsl.g:4803:1: rule__Parallele3__Group_16__1 : rule__Parallele3__Group_16__1__Impl rule__Parallele3__Group_16__2 ;
    public final void rule__Parallele3__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4807:1: ( rule__Parallele3__Group_16__1__Impl rule__Parallele3__Group_16__2 )
            // InternalMyTurtleDsl.g:4808:2: rule__Parallele3__Group_16__1__Impl rule__Parallele3__Group_16__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyTurtleDsl.g:4815:1: rule__Parallele3__Group_16__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4819:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:4820:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:4820:1: ( '&' )
            // InternalMyTurtleDsl.g:4821:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_16_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:4830:1: rule__Parallele3__Group_16__2 : rule__Parallele3__Group_16__2__Impl rule__Parallele3__Group_16__3 ;
    public final void rule__Parallele3__Group_16__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4834:1: ( rule__Parallele3__Group_16__2__Impl rule__Parallele3__Group_16__3 )
            // InternalMyTurtleDsl.g:4835:2: rule__Parallele3__Group_16__2__Impl rule__Parallele3__Group_16__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:4842:1: rule__Parallele3__Group_16__2__Impl : ( ( rule__Parallele3__BAssignment_16_2 ) ) ;
    public final void rule__Parallele3__Group_16__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4846:1: ( ( ( rule__Parallele3__BAssignment_16_2 ) ) )
            // InternalMyTurtleDsl.g:4847:1: ( ( rule__Parallele3__BAssignment_16_2 ) )
            {
            // InternalMyTurtleDsl.g:4847:1: ( ( rule__Parallele3__BAssignment_16_2 ) )
            // InternalMyTurtleDsl.g:4848:2: ( rule__Parallele3__BAssignment_16_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_16_2()); 
            // InternalMyTurtleDsl.g:4849:2: ( rule__Parallele3__BAssignment_16_2 )
            // InternalMyTurtleDsl.g:4849:3: rule__Parallele3__BAssignment_16_2
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
    // InternalMyTurtleDsl.g:4857:1: rule__Parallele3__Group_16__3 : rule__Parallele3__Group_16__3__Impl rule__Parallele3__Group_16__4 ;
    public final void rule__Parallele3__Group_16__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4861:1: ( rule__Parallele3__Group_16__3__Impl rule__Parallele3__Group_16__4 )
            // InternalMyTurtleDsl.g:4862:2: rule__Parallele3__Group_16__3__Impl rule__Parallele3__Group_16__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyTurtleDsl.g:4869:1: rule__Parallele3__Group_16__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_16__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4873:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:4874:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:4874:1: ( '&' )
            // InternalMyTurtleDsl.g:4875:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_16_3()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:4884:1: rule__Parallele3__Group_16__4 : rule__Parallele3__Group_16__4__Impl ;
    public final void rule__Parallele3__Group_16__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4888:1: ( rule__Parallele3__Group_16__4__Impl )
            // InternalMyTurtleDsl.g:4889:2: rule__Parallele3__Group_16__4__Impl
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
    // InternalMyTurtleDsl.g:4895:1: rule__Parallele3__Group_16__4__Impl : ( ( rule__Parallele3__CAssignment_16_4 ) ) ;
    public final void rule__Parallele3__Group_16__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4899:1: ( ( ( rule__Parallele3__CAssignment_16_4 ) ) )
            // InternalMyTurtleDsl.g:4900:1: ( ( rule__Parallele3__CAssignment_16_4 ) )
            {
            // InternalMyTurtleDsl.g:4900:1: ( ( rule__Parallele3__CAssignment_16_4 ) )
            // InternalMyTurtleDsl.g:4901:2: ( rule__Parallele3__CAssignment_16_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_16_4()); 
            // InternalMyTurtleDsl.g:4902:2: ( rule__Parallele3__CAssignment_16_4 )
            // InternalMyTurtleDsl.g:4902:3: rule__Parallele3__CAssignment_16_4
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
    // InternalMyTurtleDsl.g:4911:1: rule__Parallele3__Group_17__0 : rule__Parallele3__Group_17__0__Impl rule__Parallele3__Group_17__1 ;
    public final void rule__Parallele3__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4915:1: ( rule__Parallele3__Group_17__0__Impl rule__Parallele3__Group_17__1 )
            // InternalMyTurtleDsl.g:4916:2: rule__Parallele3__Group_17__0__Impl rule__Parallele3__Group_17__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:4923:1: rule__Parallele3__Group_17__0__Impl : ( ( rule__Parallele3__AAssignment_17_0 ) ) ;
    public final void rule__Parallele3__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4927:1: ( ( ( rule__Parallele3__AAssignment_17_0 ) ) )
            // InternalMyTurtleDsl.g:4928:1: ( ( rule__Parallele3__AAssignment_17_0 ) )
            {
            // InternalMyTurtleDsl.g:4928:1: ( ( rule__Parallele3__AAssignment_17_0 ) )
            // InternalMyTurtleDsl.g:4929:2: ( rule__Parallele3__AAssignment_17_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_17_0()); 
            // InternalMyTurtleDsl.g:4930:2: ( rule__Parallele3__AAssignment_17_0 )
            // InternalMyTurtleDsl.g:4930:3: rule__Parallele3__AAssignment_17_0
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
    // InternalMyTurtleDsl.g:4938:1: rule__Parallele3__Group_17__1 : rule__Parallele3__Group_17__1__Impl rule__Parallele3__Group_17__2 ;
    public final void rule__Parallele3__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4942:1: ( rule__Parallele3__Group_17__1__Impl rule__Parallele3__Group_17__2 )
            // InternalMyTurtleDsl.g:4943:2: rule__Parallele3__Group_17__1__Impl rule__Parallele3__Group_17__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyTurtleDsl.g:4950:1: rule__Parallele3__Group_17__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4954:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:4955:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:4955:1: ( '&' )
            // InternalMyTurtleDsl.g:4956:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_17_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:4965:1: rule__Parallele3__Group_17__2 : rule__Parallele3__Group_17__2__Impl rule__Parallele3__Group_17__3 ;
    public final void rule__Parallele3__Group_17__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4969:1: ( rule__Parallele3__Group_17__2__Impl rule__Parallele3__Group_17__3 )
            // InternalMyTurtleDsl.g:4970:2: rule__Parallele3__Group_17__2__Impl rule__Parallele3__Group_17__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:4977:1: rule__Parallele3__Group_17__2__Impl : ( ( rule__Parallele3__BAssignment_17_2 ) ) ;
    public final void rule__Parallele3__Group_17__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4981:1: ( ( ( rule__Parallele3__BAssignment_17_2 ) ) )
            // InternalMyTurtleDsl.g:4982:1: ( ( rule__Parallele3__BAssignment_17_2 ) )
            {
            // InternalMyTurtleDsl.g:4982:1: ( ( rule__Parallele3__BAssignment_17_2 ) )
            // InternalMyTurtleDsl.g:4983:2: ( rule__Parallele3__BAssignment_17_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_17_2()); 
            // InternalMyTurtleDsl.g:4984:2: ( rule__Parallele3__BAssignment_17_2 )
            // InternalMyTurtleDsl.g:4984:3: rule__Parallele3__BAssignment_17_2
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
    // InternalMyTurtleDsl.g:4992:1: rule__Parallele3__Group_17__3 : rule__Parallele3__Group_17__3__Impl rule__Parallele3__Group_17__4 ;
    public final void rule__Parallele3__Group_17__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:4996:1: ( rule__Parallele3__Group_17__3__Impl rule__Parallele3__Group_17__4 )
            // InternalMyTurtleDsl.g:4997:2: rule__Parallele3__Group_17__3__Impl rule__Parallele3__Group_17__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyTurtleDsl.g:5004:1: rule__Parallele3__Group_17__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_17__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5008:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:5009:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:5009:1: ( '&' )
            // InternalMyTurtleDsl.g:5010:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_17_3()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:5019:1: rule__Parallele3__Group_17__4 : rule__Parallele3__Group_17__4__Impl ;
    public final void rule__Parallele3__Group_17__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5023:1: ( rule__Parallele3__Group_17__4__Impl )
            // InternalMyTurtleDsl.g:5024:2: rule__Parallele3__Group_17__4__Impl
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
    // InternalMyTurtleDsl.g:5030:1: rule__Parallele3__Group_17__4__Impl : ( ( rule__Parallele3__CAssignment_17_4 ) ) ;
    public final void rule__Parallele3__Group_17__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5034:1: ( ( ( rule__Parallele3__CAssignment_17_4 ) ) )
            // InternalMyTurtleDsl.g:5035:1: ( ( rule__Parallele3__CAssignment_17_4 ) )
            {
            // InternalMyTurtleDsl.g:5035:1: ( ( rule__Parallele3__CAssignment_17_4 ) )
            // InternalMyTurtleDsl.g:5036:2: ( rule__Parallele3__CAssignment_17_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_17_4()); 
            // InternalMyTurtleDsl.g:5037:2: ( rule__Parallele3__CAssignment_17_4 )
            // InternalMyTurtleDsl.g:5037:3: rule__Parallele3__CAssignment_17_4
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
    // InternalMyTurtleDsl.g:5046:1: rule__Parallele3__Group_18__0 : rule__Parallele3__Group_18__0__Impl rule__Parallele3__Group_18__1 ;
    public final void rule__Parallele3__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5050:1: ( rule__Parallele3__Group_18__0__Impl rule__Parallele3__Group_18__1 )
            // InternalMyTurtleDsl.g:5051:2: rule__Parallele3__Group_18__0__Impl rule__Parallele3__Group_18__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:5058:1: rule__Parallele3__Group_18__0__Impl : ( ( rule__Parallele3__AAssignment_18_0 ) ) ;
    public final void rule__Parallele3__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5062:1: ( ( ( rule__Parallele3__AAssignment_18_0 ) ) )
            // InternalMyTurtleDsl.g:5063:1: ( ( rule__Parallele3__AAssignment_18_0 ) )
            {
            // InternalMyTurtleDsl.g:5063:1: ( ( rule__Parallele3__AAssignment_18_0 ) )
            // InternalMyTurtleDsl.g:5064:2: ( rule__Parallele3__AAssignment_18_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_18_0()); 
            // InternalMyTurtleDsl.g:5065:2: ( rule__Parallele3__AAssignment_18_0 )
            // InternalMyTurtleDsl.g:5065:3: rule__Parallele3__AAssignment_18_0
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
    // InternalMyTurtleDsl.g:5073:1: rule__Parallele3__Group_18__1 : rule__Parallele3__Group_18__1__Impl rule__Parallele3__Group_18__2 ;
    public final void rule__Parallele3__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5077:1: ( rule__Parallele3__Group_18__1__Impl rule__Parallele3__Group_18__2 )
            // InternalMyTurtleDsl.g:5078:2: rule__Parallele3__Group_18__1__Impl rule__Parallele3__Group_18__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyTurtleDsl.g:5085:1: rule__Parallele3__Group_18__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5089:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:5090:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:5090:1: ( '&' )
            // InternalMyTurtleDsl.g:5091:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_18_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:5100:1: rule__Parallele3__Group_18__2 : rule__Parallele3__Group_18__2__Impl rule__Parallele3__Group_18__3 ;
    public final void rule__Parallele3__Group_18__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5104:1: ( rule__Parallele3__Group_18__2__Impl rule__Parallele3__Group_18__3 )
            // InternalMyTurtleDsl.g:5105:2: rule__Parallele3__Group_18__2__Impl rule__Parallele3__Group_18__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:5112:1: rule__Parallele3__Group_18__2__Impl : ( ( rule__Parallele3__BAssignment_18_2 ) ) ;
    public final void rule__Parallele3__Group_18__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5116:1: ( ( ( rule__Parallele3__BAssignment_18_2 ) ) )
            // InternalMyTurtleDsl.g:5117:1: ( ( rule__Parallele3__BAssignment_18_2 ) )
            {
            // InternalMyTurtleDsl.g:5117:1: ( ( rule__Parallele3__BAssignment_18_2 ) )
            // InternalMyTurtleDsl.g:5118:2: ( rule__Parallele3__BAssignment_18_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_18_2()); 
            // InternalMyTurtleDsl.g:5119:2: ( rule__Parallele3__BAssignment_18_2 )
            // InternalMyTurtleDsl.g:5119:3: rule__Parallele3__BAssignment_18_2
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
    // InternalMyTurtleDsl.g:5127:1: rule__Parallele3__Group_18__3 : rule__Parallele3__Group_18__3__Impl rule__Parallele3__Group_18__4 ;
    public final void rule__Parallele3__Group_18__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5131:1: ( rule__Parallele3__Group_18__3__Impl rule__Parallele3__Group_18__4 )
            // InternalMyTurtleDsl.g:5132:2: rule__Parallele3__Group_18__3__Impl rule__Parallele3__Group_18__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyTurtleDsl.g:5139:1: rule__Parallele3__Group_18__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_18__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5143:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:5144:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:5144:1: ( '&' )
            // InternalMyTurtleDsl.g:5145:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_18_3()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:5154:1: rule__Parallele3__Group_18__4 : rule__Parallele3__Group_18__4__Impl ;
    public final void rule__Parallele3__Group_18__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5158:1: ( rule__Parallele3__Group_18__4__Impl )
            // InternalMyTurtleDsl.g:5159:2: rule__Parallele3__Group_18__4__Impl
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
    // InternalMyTurtleDsl.g:5165:1: rule__Parallele3__Group_18__4__Impl : ( ( rule__Parallele3__CAssignment_18_4 ) ) ;
    public final void rule__Parallele3__Group_18__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5169:1: ( ( ( rule__Parallele3__CAssignment_18_4 ) ) )
            // InternalMyTurtleDsl.g:5170:1: ( ( rule__Parallele3__CAssignment_18_4 ) )
            {
            // InternalMyTurtleDsl.g:5170:1: ( ( rule__Parallele3__CAssignment_18_4 ) )
            // InternalMyTurtleDsl.g:5171:2: ( rule__Parallele3__CAssignment_18_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_18_4()); 
            // InternalMyTurtleDsl.g:5172:2: ( rule__Parallele3__CAssignment_18_4 )
            // InternalMyTurtleDsl.g:5172:3: rule__Parallele3__CAssignment_18_4
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
    // InternalMyTurtleDsl.g:5181:1: rule__Parallele3__Group_19__0 : rule__Parallele3__Group_19__0__Impl rule__Parallele3__Group_19__1 ;
    public final void rule__Parallele3__Group_19__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5185:1: ( rule__Parallele3__Group_19__0__Impl rule__Parallele3__Group_19__1 )
            // InternalMyTurtleDsl.g:5186:2: rule__Parallele3__Group_19__0__Impl rule__Parallele3__Group_19__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:5193:1: rule__Parallele3__Group_19__0__Impl : ( ( rule__Parallele3__AAssignment_19_0 ) ) ;
    public final void rule__Parallele3__Group_19__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5197:1: ( ( ( rule__Parallele3__AAssignment_19_0 ) ) )
            // InternalMyTurtleDsl.g:5198:1: ( ( rule__Parallele3__AAssignment_19_0 ) )
            {
            // InternalMyTurtleDsl.g:5198:1: ( ( rule__Parallele3__AAssignment_19_0 ) )
            // InternalMyTurtleDsl.g:5199:2: ( rule__Parallele3__AAssignment_19_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_19_0()); 
            // InternalMyTurtleDsl.g:5200:2: ( rule__Parallele3__AAssignment_19_0 )
            // InternalMyTurtleDsl.g:5200:3: rule__Parallele3__AAssignment_19_0
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
    // InternalMyTurtleDsl.g:5208:1: rule__Parallele3__Group_19__1 : rule__Parallele3__Group_19__1__Impl rule__Parallele3__Group_19__2 ;
    public final void rule__Parallele3__Group_19__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5212:1: ( rule__Parallele3__Group_19__1__Impl rule__Parallele3__Group_19__2 )
            // InternalMyTurtleDsl.g:5213:2: rule__Parallele3__Group_19__1__Impl rule__Parallele3__Group_19__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyTurtleDsl.g:5220:1: rule__Parallele3__Group_19__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_19__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5224:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:5225:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:5225:1: ( '&' )
            // InternalMyTurtleDsl.g:5226:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_19_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:5235:1: rule__Parallele3__Group_19__2 : rule__Parallele3__Group_19__2__Impl rule__Parallele3__Group_19__3 ;
    public final void rule__Parallele3__Group_19__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5239:1: ( rule__Parallele3__Group_19__2__Impl rule__Parallele3__Group_19__3 )
            // InternalMyTurtleDsl.g:5240:2: rule__Parallele3__Group_19__2__Impl rule__Parallele3__Group_19__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:5247:1: rule__Parallele3__Group_19__2__Impl : ( ( rule__Parallele3__BAssignment_19_2 ) ) ;
    public final void rule__Parallele3__Group_19__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5251:1: ( ( ( rule__Parallele3__BAssignment_19_2 ) ) )
            // InternalMyTurtleDsl.g:5252:1: ( ( rule__Parallele3__BAssignment_19_2 ) )
            {
            // InternalMyTurtleDsl.g:5252:1: ( ( rule__Parallele3__BAssignment_19_2 ) )
            // InternalMyTurtleDsl.g:5253:2: ( rule__Parallele3__BAssignment_19_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_19_2()); 
            // InternalMyTurtleDsl.g:5254:2: ( rule__Parallele3__BAssignment_19_2 )
            // InternalMyTurtleDsl.g:5254:3: rule__Parallele3__BAssignment_19_2
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
    // InternalMyTurtleDsl.g:5262:1: rule__Parallele3__Group_19__3 : rule__Parallele3__Group_19__3__Impl rule__Parallele3__Group_19__4 ;
    public final void rule__Parallele3__Group_19__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5266:1: ( rule__Parallele3__Group_19__3__Impl rule__Parallele3__Group_19__4 )
            // InternalMyTurtleDsl.g:5267:2: rule__Parallele3__Group_19__3__Impl rule__Parallele3__Group_19__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyTurtleDsl.g:5274:1: rule__Parallele3__Group_19__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_19__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5278:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:5279:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:5279:1: ( '&' )
            // InternalMyTurtleDsl.g:5280:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_19_3()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:5289:1: rule__Parallele3__Group_19__4 : rule__Parallele3__Group_19__4__Impl ;
    public final void rule__Parallele3__Group_19__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5293:1: ( rule__Parallele3__Group_19__4__Impl )
            // InternalMyTurtleDsl.g:5294:2: rule__Parallele3__Group_19__4__Impl
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
    // InternalMyTurtleDsl.g:5300:1: rule__Parallele3__Group_19__4__Impl : ( ( rule__Parallele3__CAssignment_19_4 ) ) ;
    public final void rule__Parallele3__Group_19__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5304:1: ( ( ( rule__Parallele3__CAssignment_19_4 ) ) )
            // InternalMyTurtleDsl.g:5305:1: ( ( rule__Parallele3__CAssignment_19_4 ) )
            {
            // InternalMyTurtleDsl.g:5305:1: ( ( rule__Parallele3__CAssignment_19_4 ) )
            // InternalMyTurtleDsl.g:5306:2: ( rule__Parallele3__CAssignment_19_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_19_4()); 
            // InternalMyTurtleDsl.g:5307:2: ( rule__Parallele3__CAssignment_19_4 )
            // InternalMyTurtleDsl.g:5307:3: rule__Parallele3__CAssignment_19_4
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
    // InternalMyTurtleDsl.g:5316:1: rule__Parallele3__Group_20__0 : rule__Parallele3__Group_20__0__Impl rule__Parallele3__Group_20__1 ;
    public final void rule__Parallele3__Group_20__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5320:1: ( rule__Parallele3__Group_20__0__Impl rule__Parallele3__Group_20__1 )
            // InternalMyTurtleDsl.g:5321:2: rule__Parallele3__Group_20__0__Impl rule__Parallele3__Group_20__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:5328:1: rule__Parallele3__Group_20__0__Impl : ( ( rule__Parallele3__AAssignment_20_0 ) ) ;
    public final void rule__Parallele3__Group_20__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5332:1: ( ( ( rule__Parallele3__AAssignment_20_0 ) ) )
            // InternalMyTurtleDsl.g:5333:1: ( ( rule__Parallele3__AAssignment_20_0 ) )
            {
            // InternalMyTurtleDsl.g:5333:1: ( ( rule__Parallele3__AAssignment_20_0 ) )
            // InternalMyTurtleDsl.g:5334:2: ( rule__Parallele3__AAssignment_20_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_20_0()); 
            // InternalMyTurtleDsl.g:5335:2: ( rule__Parallele3__AAssignment_20_0 )
            // InternalMyTurtleDsl.g:5335:3: rule__Parallele3__AAssignment_20_0
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
    // InternalMyTurtleDsl.g:5343:1: rule__Parallele3__Group_20__1 : rule__Parallele3__Group_20__1__Impl rule__Parallele3__Group_20__2 ;
    public final void rule__Parallele3__Group_20__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5347:1: ( rule__Parallele3__Group_20__1__Impl rule__Parallele3__Group_20__2 )
            // InternalMyTurtleDsl.g:5348:2: rule__Parallele3__Group_20__1__Impl rule__Parallele3__Group_20__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyTurtleDsl.g:5355:1: rule__Parallele3__Group_20__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_20__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5359:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:5360:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:5360:1: ( '&' )
            // InternalMyTurtleDsl.g:5361:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_20_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:5370:1: rule__Parallele3__Group_20__2 : rule__Parallele3__Group_20__2__Impl rule__Parallele3__Group_20__3 ;
    public final void rule__Parallele3__Group_20__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5374:1: ( rule__Parallele3__Group_20__2__Impl rule__Parallele3__Group_20__3 )
            // InternalMyTurtleDsl.g:5375:2: rule__Parallele3__Group_20__2__Impl rule__Parallele3__Group_20__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:5382:1: rule__Parallele3__Group_20__2__Impl : ( ( rule__Parallele3__BAssignment_20_2 ) ) ;
    public final void rule__Parallele3__Group_20__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5386:1: ( ( ( rule__Parallele3__BAssignment_20_2 ) ) )
            // InternalMyTurtleDsl.g:5387:1: ( ( rule__Parallele3__BAssignment_20_2 ) )
            {
            // InternalMyTurtleDsl.g:5387:1: ( ( rule__Parallele3__BAssignment_20_2 ) )
            // InternalMyTurtleDsl.g:5388:2: ( rule__Parallele3__BAssignment_20_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_20_2()); 
            // InternalMyTurtleDsl.g:5389:2: ( rule__Parallele3__BAssignment_20_2 )
            // InternalMyTurtleDsl.g:5389:3: rule__Parallele3__BAssignment_20_2
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
    // InternalMyTurtleDsl.g:5397:1: rule__Parallele3__Group_20__3 : rule__Parallele3__Group_20__3__Impl rule__Parallele3__Group_20__4 ;
    public final void rule__Parallele3__Group_20__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5401:1: ( rule__Parallele3__Group_20__3__Impl rule__Parallele3__Group_20__4 )
            // InternalMyTurtleDsl.g:5402:2: rule__Parallele3__Group_20__3__Impl rule__Parallele3__Group_20__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyTurtleDsl.g:5409:1: rule__Parallele3__Group_20__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_20__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5413:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:5414:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:5414:1: ( '&' )
            // InternalMyTurtleDsl.g:5415:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_20_3()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:5424:1: rule__Parallele3__Group_20__4 : rule__Parallele3__Group_20__4__Impl ;
    public final void rule__Parallele3__Group_20__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5428:1: ( rule__Parallele3__Group_20__4__Impl )
            // InternalMyTurtleDsl.g:5429:2: rule__Parallele3__Group_20__4__Impl
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
    // InternalMyTurtleDsl.g:5435:1: rule__Parallele3__Group_20__4__Impl : ( ( rule__Parallele3__CAssignment_20_4 ) ) ;
    public final void rule__Parallele3__Group_20__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5439:1: ( ( ( rule__Parallele3__CAssignment_20_4 ) ) )
            // InternalMyTurtleDsl.g:5440:1: ( ( rule__Parallele3__CAssignment_20_4 ) )
            {
            // InternalMyTurtleDsl.g:5440:1: ( ( rule__Parallele3__CAssignment_20_4 ) )
            // InternalMyTurtleDsl.g:5441:2: ( rule__Parallele3__CAssignment_20_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_20_4()); 
            // InternalMyTurtleDsl.g:5442:2: ( rule__Parallele3__CAssignment_20_4 )
            // InternalMyTurtleDsl.g:5442:3: rule__Parallele3__CAssignment_20_4
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
    // InternalMyTurtleDsl.g:5451:1: rule__Parallele3__Group_21__0 : rule__Parallele3__Group_21__0__Impl rule__Parallele3__Group_21__1 ;
    public final void rule__Parallele3__Group_21__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5455:1: ( rule__Parallele3__Group_21__0__Impl rule__Parallele3__Group_21__1 )
            // InternalMyTurtleDsl.g:5456:2: rule__Parallele3__Group_21__0__Impl rule__Parallele3__Group_21__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:5463:1: rule__Parallele3__Group_21__0__Impl : ( ( rule__Parallele3__AAssignment_21_0 ) ) ;
    public final void rule__Parallele3__Group_21__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5467:1: ( ( ( rule__Parallele3__AAssignment_21_0 ) ) )
            // InternalMyTurtleDsl.g:5468:1: ( ( rule__Parallele3__AAssignment_21_0 ) )
            {
            // InternalMyTurtleDsl.g:5468:1: ( ( rule__Parallele3__AAssignment_21_0 ) )
            // InternalMyTurtleDsl.g:5469:2: ( rule__Parallele3__AAssignment_21_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_21_0()); 
            // InternalMyTurtleDsl.g:5470:2: ( rule__Parallele3__AAssignment_21_0 )
            // InternalMyTurtleDsl.g:5470:3: rule__Parallele3__AAssignment_21_0
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
    // InternalMyTurtleDsl.g:5478:1: rule__Parallele3__Group_21__1 : rule__Parallele3__Group_21__1__Impl rule__Parallele3__Group_21__2 ;
    public final void rule__Parallele3__Group_21__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5482:1: ( rule__Parallele3__Group_21__1__Impl rule__Parallele3__Group_21__2 )
            // InternalMyTurtleDsl.g:5483:2: rule__Parallele3__Group_21__1__Impl rule__Parallele3__Group_21__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyTurtleDsl.g:5490:1: rule__Parallele3__Group_21__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_21__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5494:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:5495:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:5495:1: ( '&' )
            // InternalMyTurtleDsl.g:5496:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_21_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:5505:1: rule__Parallele3__Group_21__2 : rule__Parallele3__Group_21__2__Impl rule__Parallele3__Group_21__3 ;
    public final void rule__Parallele3__Group_21__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5509:1: ( rule__Parallele3__Group_21__2__Impl rule__Parallele3__Group_21__3 )
            // InternalMyTurtleDsl.g:5510:2: rule__Parallele3__Group_21__2__Impl rule__Parallele3__Group_21__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:5517:1: rule__Parallele3__Group_21__2__Impl : ( ( rule__Parallele3__BAssignment_21_2 ) ) ;
    public final void rule__Parallele3__Group_21__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5521:1: ( ( ( rule__Parallele3__BAssignment_21_2 ) ) )
            // InternalMyTurtleDsl.g:5522:1: ( ( rule__Parallele3__BAssignment_21_2 ) )
            {
            // InternalMyTurtleDsl.g:5522:1: ( ( rule__Parallele3__BAssignment_21_2 ) )
            // InternalMyTurtleDsl.g:5523:2: ( rule__Parallele3__BAssignment_21_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_21_2()); 
            // InternalMyTurtleDsl.g:5524:2: ( rule__Parallele3__BAssignment_21_2 )
            // InternalMyTurtleDsl.g:5524:3: rule__Parallele3__BAssignment_21_2
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
    // InternalMyTurtleDsl.g:5532:1: rule__Parallele3__Group_21__3 : rule__Parallele3__Group_21__3__Impl rule__Parallele3__Group_21__4 ;
    public final void rule__Parallele3__Group_21__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5536:1: ( rule__Parallele3__Group_21__3__Impl rule__Parallele3__Group_21__4 )
            // InternalMyTurtleDsl.g:5537:2: rule__Parallele3__Group_21__3__Impl rule__Parallele3__Group_21__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyTurtleDsl.g:5544:1: rule__Parallele3__Group_21__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_21__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5548:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:5549:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:5549:1: ( '&' )
            // InternalMyTurtleDsl.g:5550:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_21_3()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:5559:1: rule__Parallele3__Group_21__4 : rule__Parallele3__Group_21__4__Impl ;
    public final void rule__Parallele3__Group_21__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5563:1: ( rule__Parallele3__Group_21__4__Impl )
            // InternalMyTurtleDsl.g:5564:2: rule__Parallele3__Group_21__4__Impl
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
    // InternalMyTurtleDsl.g:5570:1: rule__Parallele3__Group_21__4__Impl : ( ( rule__Parallele3__CAssignment_21_4 ) ) ;
    public final void rule__Parallele3__Group_21__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5574:1: ( ( ( rule__Parallele3__CAssignment_21_4 ) ) )
            // InternalMyTurtleDsl.g:5575:1: ( ( rule__Parallele3__CAssignment_21_4 ) )
            {
            // InternalMyTurtleDsl.g:5575:1: ( ( rule__Parallele3__CAssignment_21_4 ) )
            // InternalMyTurtleDsl.g:5576:2: ( rule__Parallele3__CAssignment_21_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_21_4()); 
            // InternalMyTurtleDsl.g:5577:2: ( rule__Parallele3__CAssignment_21_4 )
            // InternalMyTurtleDsl.g:5577:3: rule__Parallele3__CAssignment_21_4
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
    // InternalMyTurtleDsl.g:5586:1: rule__Parallele3__Group_22__0 : rule__Parallele3__Group_22__0__Impl rule__Parallele3__Group_22__1 ;
    public final void rule__Parallele3__Group_22__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5590:1: ( rule__Parallele3__Group_22__0__Impl rule__Parallele3__Group_22__1 )
            // InternalMyTurtleDsl.g:5591:2: rule__Parallele3__Group_22__0__Impl rule__Parallele3__Group_22__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:5598:1: rule__Parallele3__Group_22__0__Impl : ( ( rule__Parallele3__AAssignment_22_0 ) ) ;
    public final void rule__Parallele3__Group_22__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5602:1: ( ( ( rule__Parallele3__AAssignment_22_0 ) ) )
            // InternalMyTurtleDsl.g:5603:1: ( ( rule__Parallele3__AAssignment_22_0 ) )
            {
            // InternalMyTurtleDsl.g:5603:1: ( ( rule__Parallele3__AAssignment_22_0 ) )
            // InternalMyTurtleDsl.g:5604:2: ( rule__Parallele3__AAssignment_22_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_22_0()); 
            // InternalMyTurtleDsl.g:5605:2: ( rule__Parallele3__AAssignment_22_0 )
            // InternalMyTurtleDsl.g:5605:3: rule__Parallele3__AAssignment_22_0
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
    // InternalMyTurtleDsl.g:5613:1: rule__Parallele3__Group_22__1 : rule__Parallele3__Group_22__1__Impl rule__Parallele3__Group_22__2 ;
    public final void rule__Parallele3__Group_22__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5617:1: ( rule__Parallele3__Group_22__1__Impl rule__Parallele3__Group_22__2 )
            // InternalMyTurtleDsl.g:5618:2: rule__Parallele3__Group_22__1__Impl rule__Parallele3__Group_22__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyTurtleDsl.g:5625:1: rule__Parallele3__Group_22__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_22__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5629:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:5630:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:5630:1: ( '&' )
            // InternalMyTurtleDsl.g:5631:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_22_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:5640:1: rule__Parallele3__Group_22__2 : rule__Parallele3__Group_22__2__Impl rule__Parallele3__Group_22__3 ;
    public final void rule__Parallele3__Group_22__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5644:1: ( rule__Parallele3__Group_22__2__Impl rule__Parallele3__Group_22__3 )
            // InternalMyTurtleDsl.g:5645:2: rule__Parallele3__Group_22__2__Impl rule__Parallele3__Group_22__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:5652:1: rule__Parallele3__Group_22__2__Impl : ( ( rule__Parallele3__BAssignment_22_2 ) ) ;
    public final void rule__Parallele3__Group_22__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5656:1: ( ( ( rule__Parallele3__BAssignment_22_2 ) ) )
            // InternalMyTurtleDsl.g:5657:1: ( ( rule__Parallele3__BAssignment_22_2 ) )
            {
            // InternalMyTurtleDsl.g:5657:1: ( ( rule__Parallele3__BAssignment_22_2 ) )
            // InternalMyTurtleDsl.g:5658:2: ( rule__Parallele3__BAssignment_22_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_22_2()); 
            // InternalMyTurtleDsl.g:5659:2: ( rule__Parallele3__BAssignment_22_2 )
            // InternalMyTurtleDsl.g:5659:3: rule__Parallele3__BAssignment_22_2
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
    // InternalMyTurtleDsl.g:5667:1: rule__Parallele3__Group_22__3 : rule__Parallele3__Group_22__3__Impl rule__Parallele3__Group_22__4 ;
    public final void rule__Parallele3__Group_22__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5671:1: ( rule__Parallele3__Group_22__3__Impl rule__Parallele3__Group_22__4 )
            // InternalMyTurtleDsl.g:5672:2: rule__Parallele3__Group_22__3__Impl rule__Parallele3__Group_22__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyTurtleDsl.g:5679:1: rule__Parallele3__Group_22__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_22__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5683:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:5684:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:5684:1: ( '&' )
            // InternalMyTurtleDsl.g:5685:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_22_3()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:5694:1: rule__Parallele3__Group_22__4 : rule__Parallele3__Group_22__4__Impl ;
    public final void rule__Parallele3__Group_22__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5698:1: ( rule__Parallele3__Group_22__4__Impl )
            // InternalMyTurtleDsl.g:5699:2: rule__Parallele3__Group_22__4__Impl
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
    // InternalMyTurtleDsl.g:5705:1: rule__Parallele3__Group_22__4__Impl : ( ( rule__Parallele3__CAssignment_22_4 ) ) ;
    public final void rule__Parallele3__Group_22__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5709:1: ( ( ( rule__Parallele3__CAssignment_22_4 ) ) )
            // InternalMyTurtleDsl.g:5710:1: ( ( rule__Parallele3__CAssignment_22_4 ) )
            {
            // InternalMyTurtleDsl.g:5710:1: ( ( rule__Parallele3__CAssignment_22_4 ) )
            // InternalMyTurtleDsl.g:5711:2: ( rule__Parallele3__CAssignment_22_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_22_4()); 
            // InternalMyTurtleDsl.g:5712:2: ( rule__Parallele3__CAssignment_22_4 )
            // InternalMyTurtleDsl.g:5712:3: rule__Parallele3__CAssignment_22_4
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
    // InternalMyTurtleDsl.g:5721:1: rule__Parallele3__Group_23__0 : rule__Parallele3__Group_23__0__Impl rule__Parallele3__Group_23__1 ;
    public final void rule__Parallele3__Group_23__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5725:1: ( rule__Parallele3__Group_23__0__Impl rule__Parallele3__Group_23__1 )
            // InternalMyTurtleDsl.g:5726:2: rule__Parallele3__Group_23__0__Impl rule__Parallele3__Group_23__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:5733:1: rule__Parallele3__Group_23__0__Impl : ( ( rule__Parallele3__AAssignment_23_0 ) ) ;
    public final void rule__Parallele3__Group_23__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5737:1: ( ( ( rule__Parallele3__AAssignment_23_0 ) ) )
            // InternalMyTurtleDsl.g:5738:1: ( ( rule__Parallele3__AAssignment_23_0 ) )
            {
            // InternalMyTurtleDsl.g:5738:1: ( ( rule__Parallele3__AAssignment_23_0 ) )
            // InternalMyTurtleDsl.g:5739:2: ( rule__Parallele3__AAssignment_23_0 )
            {
             before(grammarAccess.getParallele3Access().getAAssignment_23_0()); 
            // InternalMyTurtleDsl.g:5740:2: ( rule__Parallele3__AAssignment_23_0 )
            // InternalMyTurtleDsl.g:5740:3: rule__Parallele3__AAssignment_23_0
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
    // InternalMyTurtleDsl.g:5748:1: rule__Parallele3__Group_23__1 : rule__Parallele3__Group_23__1__Impl rule__Parallele3__Group_23__2 ;
    public final void rule__Parallele3__Group_23__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5752:1: ( rule__Parallele3__Group_23__1__Impl rule__Parallele3__Group_23__2 )
            // InternalMyTurtleDsl.g:5753:2: rule__Parallele3__Group_23__1__Impl rule__Parallele3__Group_23__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyTurtleDsl.g:5760:1: rule__Parallele3__Group_23__1__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_23__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5764:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:5765:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:5765:1: ( '&' )
            // InternalMyTurtleDsl.g:5766:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_23_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:5775:1: rule__Parallele3__Group_23__2 : rule__Parallele3__Group_23__2__Impl rule__Parallele3__Group_23__3 ;
    public final void rule__Parallele3__Group_23__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5779:1: ( rule__Parallele3__Group_23__2__Impl rule__Parallele3__Group_23__3 )
            // InternalMyTurtleDsl.g:5780:2: rule__Parallele3__Group_23__2__Impl rule__Parallele3__Group_23__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyTurtleDsl.g:5787:1: rule__Parallele3__Group_23__2__Impl : ( ( rule__Parallele3__BAssignment_23_2 ) ) ;
    public final void rule__Parallele3__Group_23__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5791:1: ( ( ( rule__Parallele3__BAssignment_23_2 ) ) )
            // InternalMyTurtleDsl.g:5792:1: ( ( rule__Parallele3__BAssignment_23_2 ) )
            {
            // InternalMyTurtleDsl.g:5792:1: ( ( rule__Parallele3__BAssignment_23_2 ) )
            // InternalMyTurtleDsl.g:5793:2: ( rule__Parallele3__BAssignment_23_2 )
            {
             before(grammarAccess.getParallele3Access().getBAssignment_23_2()); 
            // InternalMyTurtleDsl.g:5794:2: ( rule__Parallele3__BAssignment_23_2 )
            // InternalMyTurtleDsl.g:5794:3: rule__Parallele3__BAssignment_23_2
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
    // InternalMyTurtleDsl.g:5802:1: rule__Parallele3__Group_23__3 : rule__Parallele3__Group_23__3__Impl rule__Parallele3__Group_23__4 ;
    public final void rule__Parallele3__Group_23__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5806:1: ( rule__Parallele3__Group_23__3__Impl rule__Parallele3__Group_23__4 )
            // InternalMyTurtleDsl.g:5807:2: rule__Parallele3__Group_23__3__Impl rule__Parallele3__Group_23__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyTurtleDsl.g:5814:1: rule__Parallele3__Group_23__3__Impl : ( '&' ) ;
    public final void rule__Parallele3__Group_23__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5818:1: ( ( '&' ) )
            // InternalMyTurtleDsl.g:5819:1: ( '&' )
            {
            // InternalMyTurtleDsl.g:5819:1: ( '&' )
            // InternalMyTurtleDsl.g:5820:2: '&'
            {
             before(grammarAccess.getParallele3Access().getAmpersandKeyword_23_3()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:5829:1: rule__Parallele3__Group_23__4 : rule__Parallele3__Group_23__4__Impl ;
    public final void rule__Parallele3__Group_23__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5833:1: ( rule__Parallele3__Group_23__4__Impl )
            // InternalMyTurtleDsl.g:5834:2: rule__Parallele3__Group_23__4__Impl
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
    // InternalMyTurtleDsl.g:5840:1: rule__Parallele3__Group_23__4__Impl : ( ( rule__Parallele3__CAssignment_23_4 ) ) ;
    public final void rule__Parallele3__Group_23__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5844:1: ( ( ( rule__Parallele3__CAssignment_23_4 ) ) )
            // InternalMyTurtleDsl.g:5845:1: ( ( rule__Parallele3__CAssignment_23_4 ) )
            {
            // InternalMyTurtleDsl.g:5845:1: ( ( rule__Parallele3__CAssignment_23_4 ) )
            // InternalMyTurtleDsl.g:5846:2: ( rule__Parallele3__CAssignment_23_4 )
            {
             before(grammarAccess.getParallele3Access().getCAssignment_23_4()); 
            // InternalMyTurtleDsl.g:5847:2: ( rule__Parallele3__CAssignment_23_4 )
            // InternalMyTurtleDsl.g:5847:3: rule__Parallele3__CAssignment_23_4
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


    // $ANTLR start "rule__Includes__Group__0"
    // InternalMyTurtleDsl.g:5856:1: rule__Includes__Group__0 : rule__Includes__Group__0__Impl rule__Includes__Group__1 ;
    public final void rule__Includes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5860:1: ( rule__Includes__Group__0__Impl rule__Includes__Group__1 )
            // InternalMyTurtleDsl.g:5861:2: rule__Includes__Group__0__Impl rule__Includes__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyTurtleDsl.g:5868:1: rule__Includes__Group__0__Impl : ( 'import' ) ;
    public final void rule__Includes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5872:1: ( ( 'import' ) )
            // InternalMyTurtleDsl.g:5873:1: ( 'import' )
            {
            // InternalMyTurtleDsl.g:5873:1: ( 'import' )
            // InternalMyTurtleDsl.g:5874:2: 'import'
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
    // InternalMyTurtleDsl.g:5883:1: rule__Includes__Group__1 : rule__Includes__Group__1__Impl rule__Includes__Group__2 ;
    public final void rule__Includes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5887:1: ( rule__Includes__Group__1__Impl rule__Includes__Group__2 )
            // InternalMyTurtleDsl.g:5888:2: rule__Includes__Group__1__Impl rule__Includes__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyTurtleDsl.g:5895:1: rule__Includes__Group__1__Impl : ( '<' ) ;
    public final void rule__Includes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5899:1: ( ( '<' ) )
            // InternalMyTurtleDsl.g:5900:1: ( '<' )
            {
            // InternalMyTurtleDsl.g:5900:1: ( '<' )
            // InternalMyTurtleDsl.g:5901:2: '<'
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
    // InternalMyTurtleDsl.g:5910:1: rule__Includes__Group__2 : rule__Includes__Group__2__Impl rule__Includes__Group__3 ;
    public final void rule__Includes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5914:1: ( rule__Includes__Group__2__Impl rule__Includes__Group__3 )
            // InternalMyTurtleDsl.g:5915:2: rule__Includes__Group__2__Impl rule__Includes__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyTurtleDsl.g:5922:1: rule__Includes__Group__2__Impl : ( ( rule__Includes__ImportURIAssignment_2 ) ) ;
    public final void rule__Includes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5926:1: ( ( ( rule__Includes__ImportURIAssignment_2 ) ) )
            // InternalMyTurtleDsl.g:5927:1: ( ( rule__Includes__ImportURIAssignment_2 ) )
            {
            // InternalMyTurtleDsl.g:5927:1: ( ( rule__Includes__ImportURIAssignment_2 ) )
            // InternalMyTurtleDsl.g:5928:2: ( rule__Includes__ImportURIAssignment_2 )
            {
             before(grammarAccess.getIncludesAccess().getImportURIAssignment_2()); 
            // InternalMyTurtleDsl.g:5929:2: ( rule__Includes__ImportURIAssignment_2 )
            // InternalMyTurtleDsl.g:5929:3: rule__Includes__ImportURIAssignment_2
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
    // InternalMyTurtleDsl.g:5937:1: rule__Includes__Group__3 : rule__Includes__Group__3__Impl ;
    public final void rule__Includes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5941:1: ( rule__Includes__Group__3__Impl )
            // InternalMyTurtleDsl.g:5942:2: rule__Includes__Group__3__Impl
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
    // InternalMyTurtleDsl.g:5948:1: rule__Includes__Group__3__Impl : ( '>;' ) ;
    public final void rule__Includes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5952:1: ( ( '>;' ) )
            // InternalMyTurtleDsl.g:5953:1: ( '>;' )
            {
            // InternalMyTurtleDsl.g:5953:1: ( '>;' )
            // InternalMyTurtleDsl.g:5954:2: '>;'
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


    // $ANTLR start "rule__Decoller__Group__0"
    // InternalMyTurtleDsl.g:5964:1: rule__Decoller__Group__0 : rule__Decoller__Group__0__Impl rule__Decoller__Group__1 ;
    public final void rule__Decoller__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5968:1: ( rule__Decoller__Group__0__Impl rule__Decoller__Group__1 )
            // InternalMyTurtleDsl.g:5969:2: rule__Decoller__Group__0__Impl rule__Decoller__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyTurtleDsl.g:5976:1: rule__Decoller__Group__0__Impl : ( 'decoller' ) ;
    public final void rule__Decoller__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5980:1: ( ( 'decoller' ) )
            // InternalMyTurtleDsl.g:5981:1: ( 'decoller' )
            {
            // InternalMyTurtleDsl.g:5981:1: ( 'decoller' )
            // InternalMyTurtleDsl.g:5982:2: 'decoller'
            {
             before(grammarAccess.getDecollerAccess().getDecollerKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:5991:1: rule__Decoller__Group__1 : rule__Decoller__Group__1__Impl rule__Decoller__Group__2 ;
    public final void rule__Decoller__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:5995:1: ( rule__Decoller__Group__1__Impl rule__Decoller__Group__2 )
            // InternalMyTurtleDsl.g:5996:2: rule__Decoller__Group__1__Impl rule__Decoller__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyTurtleDsl.g:6003:1: rule__Decoller__Group__1__Impl : ( '(' ) ;
    public final void rule__Decoller__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6007:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:6008:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:6008:1: ( '(' )
            // InternalMyTurtleDsl.g:6009:2: '('
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
    // InternalMyTurtleDsl.g:6018:1: rule__Decoller__Group__2 : rule__Decoller__Group__2__Impl ;
    public final void rule__Decoller__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6022:1: ( rule__Decoller__Group__2__Impl )
            // InternalMyTurtleDsl.g:6023:2: rule__Decoller__Group__2__Impl
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
    // InternalMyTurtleDsl.g:6029:1: rule__Decoller__Group__2__Impl : ( ')' ) ;
    public final void rule__Decoller__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6033:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:6034:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:6034:1: ( ')' )
            // InternalMyTurtleDsl.g:6035:2: ')'
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
    // InternalMyTurtleDsl.g:6045:1: rule__Atterrir__Group__0 : rule__Atterrir__Group__0__Impl rule__Atterrir__Group__1 ;
    public final void rule__Atterrir__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6049:1: ( rule__Atterrir__Group__0__Impl rule__Atterrir__Group__1 )
            // InternalMyTurtleDsl.g:6050:2: rule__Atterrir__Group__0__Impl rule__Atterrir__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyTurtleDsl.g:6057:1: rule__Atterrir__Group__0__Impl : ( 'atterrir' ) ;
    public final void rule__Atterrir__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6061:1: ( ( 'atterrir' ) )
            // InternalMyTurtleDsl.g:6062:1: ( 'atterrir' )
            {
            // InternalMyTurtleDsl.g:6062:1: ( 'atterrir' )
            // InternalMyTurtleDsl.g:6063:2: 'atterrir'
            {
             before(grammarAccess.getAtterrirAccess().getAtterrirKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:6072:1: rule__Atterrir__Group__1 : rule__Atterrir__Group__1__Impl rule__Atterrir__Group__2 ;
    public final void rule__Atterrir__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6076:1: ( rule__Atterrir__Group__1__Impl rule__Atterrir__Group__2 )
            // InternalMyTurtleDsl.g:6077:2: rule__Atterrir__Group__1__Impl rule__Atterrir__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyTurtleDsl.g:6084:1: rule__Atterrir__Group__1__Impl : ( '(' ) ;
    public final void rule__Atterrir__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6088:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:6089:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:6089:1: ( '(' )
            // InternalMyTurtleDsl.g:6090:2: '('
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
    // InternalMyTurtleDsl.g:6099:1: rule__Atterrir__Group__2 : rule__Atterrir__Group__2__Impl ;
    public final void rule__Atterrir__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6103:1: ( rule__Atterrir__Group__2__Impl )
            // InternalMyTurtleDsl.g:6104:2: rule__Atterrir__Group__2__Impl
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
    // InternalMyTurtleDsl.g:6110:1: rule__Atterrir__Group__2__Impl : ( ')' ) ;
    public final void rule__Atterrir__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6114:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:6115:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:6115:1: ( ')' )
            // InternalMyTurtleDsl.g:6116:2: ')'
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
    // InternalMyTurtleDsl.g:6126:1: rule__Monter__Group__0 : rule__Monter__Group__0__Impl rule__Monter__Group__1 ;
    public final void rule__Monter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6130:1: ( rule__Monter__Group__0__Impl rule__Monter__Group__1 )
            // InternalMyTurtleDsl.g:6131:2: rule__Monter__Group__0__Impl rule__Monter__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyTurtleDsl.g:6138:1: rule__Monter__Group__0__Impl : ( 'monter' ) ;
    public final void rule__Monter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6142:1: ( ( 'monter' ) )
            // InternalMyTurtleDsl.g:6143:1: ( 'monter' )
            {
            // InternalMyTurtleDsl.g:6143:1: ( 'monter' )
            // InternalMyTurtleDsl.g:6144:2: 'monter'
            {
             before(grammarAccess.getMonterAccess().getMonterKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:6153:1: rule__Monter__Group__1 : rule__Monter__Group__1__Impl rule__Monter__Group__2 ;
    public final void rule__Monter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6157:1: ( rule__Monter__Group__1__Impl rule__Monter__Group__2 )
            // InternalMyTurtleDsl.g:6158:2: rule__Monter__Group__1__Impl rule__Monter__Group__2
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
    // InternalMyTurtleDsl.g:6165:1: rule__Monter__Group__1__Impl : ( '(' ) ;
    public final void rule__Monter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6169:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:6170:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:6170:1: ( '(' )
            // InternalMyTurtleDsl.g:6171:2: '('
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
    // InternalMyTurtleDsl.g:6180:1: rule__Monter__Group__2 : rule__Monter__Group__2__Impl rule__Monter__Group__3 ;
    public final void rule__Monter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6184:1: ( rule__Monter__Group__2__Impl rule__Monter__Group__3 )
            // InternalMyTurtleDsl.g:6185:2: rule__Monter__Group__2__Impl rule__Monter__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyTurtleDsl.g:6192:1: rule__Monter__Group__2__Impl : ( ( rule__Monter__DureeAssignment_2 ) ) ;
    public final void rule__Monter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6196:1: ( ( ( rule__Monter__DureeAssignment_2 ) ) )
            // InternalMyTurtleDsl.g:6197:1: ( ( rule__Monter__DureeAssignment_2 ) )
            {
            // InternalMyTurtleDsl.g:6197:1: ( ( rule__Monter__DureeAssignment_2 ) )
            // InternalMyTurtleDsl.g:6198:2: ( rule__Monter__DureeAssignment_2 )
            {
             before(grammarAccess.getMonterAccess().getDureeAssignment_2()); 
            // InternalMyTurtleDsl.g:6199:2: ( rule__Monter__DureeAssignment_2 )
            // InternalMyTurtleDsl.g:6199:3: rule__Monter__DureeAssignment_2
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
    // InternalMyTurtleDsl.g:6207:1: rule__Monter__Group__3 : rule__Monter__Group__3__Impl rule__Monter__Group__4 ;
    public final void rule__Monter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6211:1: ( rule__Monter__Group__3__Impl rule__Monter__Group__4 )
            // InternalMyTurtleDsl.g:6212:2: rule__Monter__Group__3__Impl rule__Monter__Group__4
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
    // InternalMyTurtleDsl.g:6219:1: rule__Monter__Group__3__Impl : ( ',' ) ;
    public final void rule__Monter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6223:1: ( ( ',' ) )
            // InternalMyTurtleDsl.g:6224:1: ( ',' )
            {
            // InternalMyTurtleDsl.g:6224:1: ( ',' )
            // InternalMyTurtleDsl.g:6225:2: ','
            {
             before(grammarAccess.getMonterAccess().getCommaKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:6234:1: rule__Monter__Group__4 : rule__Monter__Group__4__Impl rule__Monter__Group__5 ;
    public final void rule__Monter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6238:1: ( rule__Monter__Group__4__Impl rule__Monter__Group__5 )
            // InternalMyTurtleDsl.g:6239:2: rule__Monter__Group__4__Impl rule__Monter__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyTurtleDsl.g:6246:1: rule__Monter__Group__4__Impl : ( ( rule__Monter__Vitesse_verticaleAssignment_4 ) ) ;
    public final void rule__Monter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6250:1: ( ( ( rule__Monter__Vitesse_verticaleAssignment_4 ) ) )
            // InternalMyTurtleDsl.g:6251:1: ( ( rule__Monter__Vitesse_verticaleAssignment_4 ) )
            {
            // InternalMyTurtleDsl.g:6251:1: ( ( rule__Monter__Vitesse_verticaleAssignment_4 ) )
            // InternalMyTurtleDsl.g:6252:2: ( rule__Monter__Vitesse_verticaleAssignment_4 )
            {
             before(grammarAccess.getMonterAccess().getVitesse_verticaleAssignment_4()); 
            // InternalMyTurtleDsl.g:6253:2: ( rule__Monter__Vitesse_verticaleAssignment_4 )
            // InternalMyTurtleDsl.g:6253:3: rule__Monter__Vitesse_verticaleAssignment_4
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
    // InternalMyTurtleDsl.g:6261:1: rule__Monter__Group__5 : rule__Monter__Group__5__Impl ;
    public final void rule__Monter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6265:1: ( rule__Monter__Group__5__Impl )
            // InternalMyTurtleDsl.g:6266:2: rule__Monter__Group__5__Impl
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
    // InternalMyTurtleDsl.g:6272:1: rule__Monter__Group__5__Impl : ( ')' ) ;
    public final void rule__Monter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6276:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:6277:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:6277:1: ( ')' )
            // InternalMyTurtleDsl.g:6278:2: ')'
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
    // InternalMyTurtleDsl.g:6288:1: rule__Descendre__Group__0 : rule__Descendre__Group__0__Impl rule__Descendre__Group__1 ;
    public final void rule__Descendre__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6292:1: ( rule__Descendre__Group__0__Impl rule__Descendre__Group__1 )
            // InternalMyTurtleDsl.g:6293:2: rule__Descendre__Group__0__Impl rule__Descendre__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyTurtleDsl.g:6300:1: rule__Descendre__Group__0__Impl : ( 'descendre' ) ;
    public final void rule__Descendre__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6304:1: ( ( 'descendre' ) )
            // InternalMyTurtleDsl.g:6305:1: ( 'descendre' )
            {
            // InternalMyTurtleDsl.g:6305:1: ( 'descendre' )
            // InternalMyTurtleDsl.g:6306:2: 'descendre'
            {
             before(grammarAccess.getDescendreAccess().getDescendreKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:6315:1: rule__Descendre__Group__1 : rule__Descendre__Group__1__Impl rule__Descendre__Group__2 ;
    public final void rule__Descendre__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6319:1: ( rule__Descendre__Group__1__Impl rule__Descendre__Group__2 )
            // InternalMyTurtleDsl.g:6320:2: rule__Descendre__Group__1__Impl rule__Descendre__Group__2
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
    // InternalMyTurtleDsl.g:6327:1: rule__Descendre__Group__1__Impl : ( '(' ) ;
    public final void rule__Descendre__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6331:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:6332:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:6332:1: ( '(' )
            // InternalMyTurtleDsl.g:6333:2: '('
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
    // InternalMyTurtleDsl.g:6342:1: rule__Descendre__Group__2 : rule__Descendre__Group__2__Impl rule__Descendre__Group__3 ;
    public final void rule__Descendre__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6346:1: ( rule__Descendre__Group__2__Impl rule__Descendre__Group__3 )
            // InternalMyTurtleDsl.g:6347:2: rule__Descendre__Group__2__Impl rule__Descendre__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyTurtleDsl.g:6354:1: rule__Descendre__Group__2__Impl : ( ( rule__Descendre__DureeAssignment_2 ) ) ;
    public final void rule__Descendre__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6358:1: ( ( ( rule__Descendre__DureeAssignment_2 ) ) )
            // InternalMyTurtleDsl.g:6359:1: ( ( rule__Descendre__DureeAssignment_2 ) )
            {
            // InternalMyTurtleDsl.g:6359:1: ( ( rule__Descendre__DureeAssignment_2 ) )
            // InternalMyTurtleDsl.g:6360:2: ( rule__Descendre__DureeAssignment_2 )
            {
             before(grammarAccess.getDescendreAccess().getDureeAssignment_2()); 
            // InternalMyTurtleDsl.g:6361:2: ( rule__Descendre__DureeAssignment_2 )
            // InternalMyTurtleDsl.g:6361:3: rule__Descendre__DureeAssignment_2
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
    // InternalMyTurtleDsl.g:6369:1: rule__Descendre__Group__3 : rule__Descendre__Group__3__Impl rule__Descendre__Group__4 ;
    public final void rule__Descendre__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6373:1: ( rule__Descendre__Group__3__Impl rule__Descendre__Group__4 )
            // InternalMyTurtleDsl.g:6374:2: rule__Descendre__Group__3__Impl rule__Descendre__Group__4
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
    // InternalMyTurtleDsl.g:6381:1: rule__Descendre__Group__3__Impl : ( ',' ) ;
    public final void rule__Descendre__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6385:1: ( ( ',' ) )
            // InternalMyTurtleDsl.g:6386:1: ( ',' )
            {
            // InternalMyTurtleDsl.g:6386:1: ( ',' )
            // InternalMyTurtleDsl.g:6387:2: ','
            {
             before(grammarAccess.getDescendreAccess().getCommaKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:6396:1: rule__Descendre__Group__4 : rule__Descendre__Group__4__Impl rule__Descendre__Group__5 ;
    public final void rule__Descendre__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6400:1: ( rule__Descendre__Group__4__Impl rule__Descendre__Group__5 )
            // InternalMyTurtleDsl.g:6401:2: rule__Descendre__Group__4__Impl rule__Descendre__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyTurtleDsl.g:6408:1: rule__Descendre__Group__4__Impl : ( ( rule__Descendre__Vitesse_verticaleAssignment_4 ) ) ;
    public final void rule__Descendre__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6412:1: ( ( ( rule__Descendre__Vitesse_verticaleAssignment_4 ) ) )
            // InternalMyTurtleDsl.g:6413:1: ( ( rule__Descendre__Vitesse_verticaleAssignment_4 ) )
            {
            // InternalMyTurtleDsl.g:6413:1: ( ( rule__Descendre__Vitesse_verticaleAssignment_4 ) )
            // InternalMyTurtleDsl.g:6414:2: ( rule__Descendre__Vitesse_verticaleAssignment_4 )
            {
             before(grammarAccess.getDescendreAccess().getVitesse_verticaleAssignment_4()); 
            // InternalMyTurtleDsl.g:6415:2: ( rule__Descendre__Vitesse_verticaleAssignment_4 )
            // InternalMyTurtleDsl.g:6415:3: rule__Descendre__Vitesse_verticaleAssignment_4
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
    // InternalMyTurtleDsl.g:6423:1: rule__Descendre__Group__5 : rule__Descendre__Group__5__Impl ;
    public final void rule__Descendre__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6427:1: ( rule__Descendre__Group__5__Impl )
            // InternalMyTurtleDsl.g:6428:2: rule__Descendre__Group__5__Impl
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
    // InternalMyTurtleDsl.g:6434:1: rule__Descendre__Group__5__Impl : ( ')' ) ;
    public final void rule__Descendre__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6438:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:6439:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:6439:1: ( ')' )
            // InternalMyTurtleDsl.g:6440:2: ')'
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
    // InternalMyTurtleDsl.g:6450:1: rule__Avancer__Group__0 : rule__Avancer__Group__0__Impl rule__Avancer__Group__1 ;
    public final void rule__Avancer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6454:1: ( rule__Avancer__Group__0__Impl rule__Avancer__Group__1 )
            // InternalMyTurtleDsl.g:6455:2: rule__Avancer__Group__0__Impl rule__Avancer__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyTurtleDsl.g:6462:1: rule__Avancer__Group__0__Impl : ( 'avancer' ) ;
    public final void rule__Avancer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6466:1: ( ( 'avancer' ) )
            // InternalMyTurtleDsl.g:6467:1: ( 'avancer' )
            {
            // InternalMyTurtleDsl.g:6467:1: ( 'avancer' )
            // InternalMyTurtleDsl.g:6468:2: 'avancer'
            {
             before(grammarAccess.getAvancerAccess().getAvancerKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:6477:1: rule__Avancer__Group__1 : rule__Avancer__Group__1__Impl rule__Avancer__Group__2 ;
    public final void rule__Avancer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6481:1: ( rule__Avancer__Group__1__Impl rule__Avancer__Group__2 )
            // InternalMyTurtleDsl.g:6482:2: rule__Avancer__Group__1__Impl rule__Avancer__Group__2
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
    // InternalMyTurtleDsl.g:6489:1: rule__Avancer__Group__1__Impl : ( '(' ) ;
    public final void rule__Avancer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6493:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:6494:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:6494:1: ( '(' )
            // InternalMyTurtleDsl.g:6495:2: '('
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
    // InternalMyTurtleDsl.g:6504:1: rule__Avancer__Group__2 : rule__Avancer__Group__2__Impl rule__Avancer__Group__3 ;
    public final void rule__Avancer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6508:1: ( rule__Avancer__Group__2__Impl rule__Avancer__Group__3 )
            // InternalMyTurtleDsl.g:6509:2: rule__Avancer__Group__2__Impl rule__Avancer__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyTurtleDsl.g:6516:1: rule__Avancer__Group__2__Impl : ( ( rule__Avancer__DureeAssignment_2 ) ) ;
    public final void rule__Avancer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6520:1: ( ( ( rule__Avancer__DureeAssignment_2 ) ) )
            // InternalMyTurtleDsl.g:6521:1: ( ( rule__Avancer__DureeAssignment_2 ) )
            {
            // InternalMyTurtleDsl.g:6521:1: ( ( rule__Avancer__DureeAssignment_2 ) )
            // InternalMyTurtleDsl.g:6522:2: ( rule__Avancer__DureeAssignment_2 )
            {
             before(grammarAccess.getAvancerAccess().getDureeAssignment_2()); 
            // InternalMyTurtleDsl.g:6523:2: ( rule__Avancer__DureeAssignment_2 )
            // InternalMyTurtleDsl.g:6523:3: rule__Avancer__DureeAssignment_2
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
    // InternalMyTurtleDsl.g:6531:1: rule__Avancer__Group__3 : rule__Avancer__Group__3__Impl rule__Avancer__Group__4 ;
    public final void rule__Avancer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6535:1: ( rule__Avancer__Group__3__Impl rule__Avancer__Group__4 )
            // InternalMyTurtleDsl.g:6536:2: rule__Avancer__Group__3__Impl rule__Avancer__Group__4
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
    // InternalMyTurtleDsl.g:6543:1: rule__Avancer__Group__3__Impl : ( ',' ) ;
    public final void rule__Avancer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6547:1: ( ( ',' ) )
            // InternalMyTurtleDsl.g:6548:1: ( ',' )
            {
            // InternalMyTurtleDsl.g:6548:1: ( ',' )
            // InternalMyTurtleDsl.g:6549:2: ','
            {
             before(grammarAccess.getAvancerAccess().getCommaKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:6558:1: rule__Avancer__Group__4 : rule__Avancer__Group__4__Impl rule__Avancer__Group__5 ;
    public final void rule__Avancer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6562:1: ( rule__Avancer__Group__4__Impl rule__Avancer__Group__5 )
            // InternalMyTurtleDsl.g:6563:2: rule__Avancer__Group__4__Impl rule__Avancer__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyTurtleDsl.g:6570:1: rule__Avancer__Group__4__Impl : ( ( rule__Avancer__Vitesse_deplacementAssignment_4 ) ) ;
    public final void rule__Avancer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6574:1: ( ( ( rule__Avancer__Vitesse_deplacementAssignment_4 ) ) )
            // InternalMyTurtleDsl.g:6575:1: ( ( rule__Avancer__Vitesse_deplacementAssignment_4 ) )
            {
            // InternalMyTurtleDsl.g:6575:1: ( ( rule__Avancer__Vitesse_deplacementAssignment_4 ) )
            // InternalMyTurtleDsl.g:6576:2: ( rule__Avancer__Vitesse_deplacementAssignment_4 )
            {
             before(grammarAccess.getAvancerAccess().getVitesse_deplacementAssignment_4()); 
            // InternalMyTurtleDsl.g:6577:2: ( rule__Avancer__Vitesse_deplacementAssignment_4 )
            // InternalMyTurtleDsl.g:6577:3: rule__Avancer__Vitesse_deplacementAssignment_4
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
    // InternalMyTurtleDsl.g:6585:1: rule__Avancer__Group__5 : rule__Avancer__Group__5__Impl ;
    public final void rule__Avancer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6589:1: ( rule__Avancer__Group__5__Impl )
            // InternalMyTurtleDsl.g:6590:2: rule__Avancer__Group__5__Impl
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
    // InternalMyTurtleDsl.g:6596:1: rule__Avancer__Group__5__Impl : ( ')' ) ;
    public final void rule__Avancer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6600:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:6601:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:6601:1: ( ')' )
            // InternalMyTurtleDsl.g:6602:2: ')'
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
    // InternalMyTurtleDsl.g:6612:1: rule__Reculer__Group__0 : rule__Reculer__Group__0__Impl rule__Reculer__Group__1 ;
    public final void rule__Reculer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6616:1: ( rule__Reculer__Group__0__Impl rule__Reculer__Group__1 )
            // InternalMyTurtleDsl.g:6617:2: rule__Reculer__Group__0__Impl rule__Reculer__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyTurtleDsl.g:6624:1: rule__Reculer__Group__0__Impl : ( 'reculer' ) ;
    public final void rule__Reculer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6628:1: ( ( 'reculer' ) )
            // InternalMyTurtleDsl.g:6629:1: ( 'reculer' )
            {
            // InternalMyTurtleDsl.g:6629:1: ( 'reculer' )
            // InternalMyTurtleDsl.g:6630:2: 'reculer'
            {
             before(grammarAccess.getReculerAccess().getReculerKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:6639:1: rule__Reculer__Group__1 : rule__Reculer__Group__1__Impl rule__Reculer__Group__2 ;
    public final void rule__Reculer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6643:1: ( rule__Reculer__Group__1__Impl rule__Reculer__Group__2 )
            // InternalMyTurtleDsl.g:6644:2: rule__Reculer__Group__1__Impl rule__Reculer__Group__2
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
    // InternalMyTurtleDsl.g:6651:1: rule__Reculer__Group__1__Impl : ( '(' ) ;
    public final void rule__Reculer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6655:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:6656:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:6656:1: ( '(' )
            // InternalMyTurtleDsl.g:6657:2: '('
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
    // InternalMyTurtleDsl.g:6666:1: rule__Reculer__Group__2 : rule__Reculer__Group__2__Impl rule__Reculer__Group__3 ;
    public final void rule__Reculer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6670:1: ( rule__Reculer__Group__2__Impl rule__Reculer__Group__3 )
            // InternalMyTurtleDsl.g:6671:2: rule__Reculer__Group__2__Impl rule__Reculer__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyTurtleDsl.g:6678:1: rule__Reculer__Group__2__Impl : ( ( rule__Reculer__DureeAssignment_2 ) ) ;
    public final void rule__Reculer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6682:1: ( ( ( rule__Reculer__DureeAssignment_2 ) ) )
            // InternalMyTurtleDsl.g:6683:1: ( ( rule__Reculer__DureeAssignment_2 ) )
            {
            // InternalMyTurtleDsl.g:6683:1: ( ( rule__Reculer__DureeAssignment_2 ) )
            // InternalMyTurtleDsl.g:6684:2: ( rule__Reculer__DureeAssignment_2 )
            {
             before(grammarAccess.getReculerAccess().getDureeAssignment_2()); 
            // InternalMyTurtleDsl.g:6685:2: ( rule__Reculer__DureeAssignment_2 )
            // InternalMyTurtleDsl.g:6685:3: rule__Reculer__DureeAssignment_2
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
    // InternalMyTurtleDsl.g:6693:1: rule__Reculer__Group__3 : rule__Reculer__Group__3__Impl rule__Reculer__Group__4 ;
    public final void rule__Reculer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6697:1: ( rule__Reculer__Group__3__Impl rule__Reculer__Group__4 )
            // InternalMyTurtleDsl.g:6698:2: rule__Reculer__Group__3__Impl rule__Reculer__Group__4
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
    // InternalMyTurtleDsl.g:6705:1: rule__Reculer__Group__3__Impl : ( ',' ) ;
    public final void rule__Reculer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6709:1: ( ( ',' ) )
            // InternalMyTurtleDsl.g:6710:1: ( ',' )
            {
            // InternalMyTurtleDsl.g:6710:1: ( ',' )
            // InternalMyTurtleDsl.g:6711:2: ','
            {
             before(grammarAccess.getReculerAccess().getCommaKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:6720:1: rule__Reculer__Group__4 : rule__Reculer__Group__4__Impl rule__Reculer__Group__5 ;
    public final void rule__Reculer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6724:1: ( rule__Reculer__Group__4__Impl rule__Reculer__Group__5 )
            // InternalMyTurtleDsl.g:6725:2: rule__Reculer__Group__4__Impl rule__Reculer__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyTurtleDsl.g:6732:1: rule__Reculer__Group__4__Impl : ( ( rule__Reculer__Vitesse_deplacementAssignment_4 ) ) ;
    public final void rule__Reculer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6736:1: ( ( ( rule__Reculer__Vitesse_deplacementAssignment_4 ) ) )
            // InternalMyTurtleDsl.g:6737:1: ( ( rule__Reculer__Vitesse_deplacementAssignment_4 ) )
            {
            // InternalMyTurtleDsl.g:6737:1: ( ( rule__Reculer__Vitesse_deplacementAssignment_4 ) )
            // InternalMyTurtleDsl.g:6738:2: ( rule__Reculer__Vitesse_deplacementAssignment_4 )
            {
             before(grammarAccess.getReculerAccess().getVitesse_deplacementAssignment_4()); 
            // InternalMyTurtleDsl.g:6739:2: ( rule__Reculer__Vitesse_deplacementAssignment_4 )
            // InternalMyTurtleDsl.g:6739:3: rule__Reculer__Vitesse_deplacementAssignment_4
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
    // InternalMyTurtleDsl.g:6747:1: rule__Reculer__Group__5 : rule__Reculer__Group__5__Impl ;
    public final void rule__Reculer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6751:1: ( rule__Reculer__Group__5__Impl )
            // InternalMyTurtleDsl.g:6752:2: rule__Reculer__Group__5__Impl
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
    // InternalMyTurtleDsl.g:6758:1: rule__Reculer__Group__5__Impl : ( ')' ) ;
    public final void rule__Reculer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6762:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:6763:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:6763:1: ( ')' )
            // InternalMyTurtleDsl.g:6764:2: ')'
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
    // InternalMyTurtleDsl.g:6774:1: rule__Gauche__Group__0 : rule__Gauche__Group__0__Impl rule__Gauche__Group__1 ;
    public final void rule__Gauche__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6778:1: ( rule__Gauche__Group__0__Impl rule__Gauche__Group__1 )
            // InternalMyTurtleDsl.g:6779:2: rule__Gauche__Group__0__Impl rule__Gauche__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyTurtleDsl.g:6786:1: rule__Gauche__Group__0__Impl : ( 'gauche' ) ;
    public final void rule__Gauche__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6790:1: ( ( 'gauche' ) )
            // InternalMyTurtleDsl.g:6791:1: ( 'gauche' )
            {
            // InternalMyTurtleDsl.g:6791:1: ( 'gauche' )
            // InternalMyTurtleDsl.g:6792:2: 'gauche'
            {
             before(grammarAccess.getGaucheAccess().getGaucheKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:6801:1: rule__Gauche__Group__1 : rule__Gauche__Group__1__Impl rule__Gauche__Group__2 ;
    public final void rule__Gauche__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6805:1: ( rule__Gauche__Group__1__Impl rule__Gauche__Group__2 )
            // InternalMyTurtleDsl.g:6806:2: rule__Gauche__Group__1__Impl rule__Gauche__Group__2
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
    // InternalMyTurtleDsl.g:6813:1: rule__Gauche__Group__1__Impl : ( '(' ) ;
    public final void rule__Gauche__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6817:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:6818:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:6818:1: ( '(' )
            // InternalMyTurtleDsl.g:6819:2: '('
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
    // InternalMyTurtleDsl.g:6828:1: rule__Gauche__Group__2 : rule__Gauche__Group__2__Impl rule__Gauche__Group__3 ;
    public final void rule__Gauche__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6832:1: ( rule__Gauche__Group__2__Impl rule__Gauche__Group__3 )
            // InternalMyTurtleDsl.g:6833:2: rule__Gauche__Group__2__Impl rule__Gauche__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyTurtleDsl.g:6840:1: rule__Gauche__Group__2__Impl : ( ( rule__Gauche__DureeAssignment_2 ) ) ;
    public final void rule__Gauche__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6844:1: ( ( ( rule__Gauche__DureeAssignment_2 ) ) )
            // InternalMyTurtleDsl.g:6845:1: ( ( rule__Gauche__DureeAssignment_2 ) )
            {
            // InternalMyTurtleDsl.g:6845:1: ( ( rule__Gauche__DureeAssignment_2 ) )
            // InternalMyTurtleDsl.g:6846:2: ( rule__Gauche__DureeAssignment_2 )
            {
             before(grammarAccess.getGaucheAccess().getDureeAssignment_2()); 
            // InternalMyTurtleDsl.g:6847:2: ( rule__Gauche__DureeAssignment_2 )
            // InternalMyTurtleDsl.g:6847:3: rule__Gauche__DureeAssignment_2
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
    // InternalMyTurtleDsl.g:6855:1: rule__Gauche__Group__3 : rule__Gauche__Group__3__Impl rule__Gauche__Group__4 ;
    public final void rule__Gauche__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6859:1: ( rule__Gauche__Group__3__Impl rule__Gauche__Group__4 )
            // InternalMyTurtleDsl.g:6860:2: rule__Gauche__Group__3__Impl rule__Gauche__Group__4
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
    // InternalMyTurtleDsl.g:6867:1: rule__Gauche__Group__3__Impl : ( ',' ) ;
    public final void rule__Gauche__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6871:1: ( ( ',' ) )
            // InternalMyTurtleDsl.g:6872:1: ( ',' )
            {
            // InternalMyTurtleDsl.g:6872:1: ( ',' )
            // InternalMyTurtleDsl.g:6873:2: ','
            {
             before(grammarAccess.getGaucheAccess().getCommaKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:6882:1: rule__Gauche__Group__4 : rule__Gauche__Group__4__Impl rule__Gauche__Group__5 ;
    public final void rule__Gauche__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6886:1: ( rule__Gauche__Group__4__Impl rule__Gauche__Group__5 )
            // InternalMyTurtleDsl.g:6887:2: rule__Gauche__Group__4__Impl rule__Gauche__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyTurtleDsl.g:6894:1: rule__Gauche__Group__4__Impl : ( ( rule__Gauche__Vitesse_deplacementAssignment_4 ) ) ;
    public final void rule__Gauche__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6898:1: ( ( ( rule__Gauche__Vitesse_deplacementAssignment_4 ) ) )
            // InternalMyTurtleDsl.g:6899:1: ( ( rule__Gauche__Vitesse_deplacementAssignment_4 ) )
            {
            // InternalMyTurtleDsl.g:6899:1: ( ( rule__Gauche__Vitesse_deplacementAssignment_4 ) )
            // InternalMyTurtleDsl.g:6900:2: ( rule__Gauche__Vitesse_deplacementAssignment_4 )
            {
             before(grammarAccess.getGaucheAccess().getVitesse_deplacementAssignment_4()); 
            // InternalMyTurtleDsl.g:6901:2: ( rule__Gauche__Vitesse_deplacementAssignment_4 )
            // InternalMyTurtleDsl.g:6901:3: rule__Gauche__Vitesse_deplacementAssignment_4
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
    // InternalMyTurtleDsl.g:6909:1: rule__Gauche__Group__5 : rule__Gauche__Group__5__Impl ;
    public final void rule__Gauche__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6913:1: ( rule__Gauche__Group__5__Impl )
            // InternalMyTurtleDsl.g:6914:2: rule__Gauche__Group__5__Impl
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
    // InternalMyTurtleDsl.g:6920:1: rule__Gauche__Group__5__Impl : ( ')' ) ;
    public final void rule__Gauche__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6924:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:6925:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:6925:1: ( ')' )
            // InternalMyTurtleDsl.g:6926:2: ')'
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
    // InternalMyTurtleDsl.g:6936:1: rule__Droite__Group__0 : rule__Droite__Group__0__Impl rule__Droite__Group__1 ;
    public final void rule__Droite__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6940:1: ( rule__Droite__Group__0__Impl rule__Droite__Group__1 )
            // InternalMyTurtleDsl.g:6941:2: rule__Droite__Group__0__Impl rule__Droite__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyTurtleDsl.g:6948:1: rule__Droite__Group__0__Impl : ( 'droite' ) ;
    public final void rule__Droite__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6952:1: ( ( 'droite' ) )
            // InternalMyTurtleDsl.g:6953:1: ( 'droite' )
            {
            // InternalMyTurtleDsl.g:6953:1: ( 'droite' )
            // InternalMyTurtleDsl.g:6954:2: 'droite'
            {
             before(grammarAccess.getDroiteAccess().getDroiteKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:6963:1: rule__Droite__Group__1 : rule__Droite__Group__1__Impl rule__Droite__Group__2 ;
    public final void rule__Droite__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6967:1: ( rule__Droite__Group__1__Impl rule__Droite__Group__2 )
            // InternalMyTurtleDsl.g:6968:2: rule__Droite__Group__1__Impl rule__Droite__Group__2
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
    // InternalMyTurtleDsl.g:6975:1: rule__Droite__Group__1__Impl : ( '(' ) ;
    public final void rule__Droite__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6979:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:6980:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:6980:1: ( '(' )
            // InternalMyTurtleDsl.g:6981:2: '('
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
    // InternalMyTurtleDsl.g:6990:1: rule__Droite__Group__2 : rule__Droite__Group__2__Impl rule__Droite__Group__3 ;
    public final void rule__Droite__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:6994:1: ( rule__Droite__Group__2__Impl rule__Droite__Group__3 )
            // InternalMyTurtleDsl.g:6995:2: rule__Droite__Group__2__Impl rule__Droite__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyTurtleDsl.g:7002:1: rule__Droite__Group__2__Impl : ( ( rule__Droite__DureeAssignment_2 ) ) ;
    public final void rule__Droite__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7006:1: ( ( ( rule__Droite__DureeAssignment_2 ) ) )
            // InternalMyTurtleDsl.g:7007:1: ( ( rule__Droite__DureeAssignment_2 ) )
            {
            // InternalMyTurtleDsl.g:7007:1: ( ( rule__Droite__DureeAssignment_2 ) )
            // InternalMyTurtleDsl.g:7008:2: ( rule__Droite__DureeAssignment_2 )
            {
             before(grammarAccess.getDroiteAccess().getDureeAssignment_2()); 
            // InternalMyTurtleDsl.g:7009:2: ( rule__Droite__DureeAssignment_2 )
            // InternalMyTurtleDsl.g:7009:3: rule__Droite__DureeAssignment_2
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
    // InternalMyTurtleDsl.g:7017:1: rule__Droite__Group__3 : rule__Droite__Group__3__Impl rule__Droite__Group__4 ;
    public final void rule__Droite__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7021:1: ( rule__Droite__Group__3__Impl rule__Droite__Group__4 )
            // InternalMyTurtleDsl.g:7022:2: rule__Droite__Group__3__Impl rule__Droite__Group__4
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
    // InternalMyTurtleDsl.g:7029:1: rule__Droite__Group__3__Impl : ( ',' ) ;
    public final void rule__Droite__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7033:1: ( ( ',' ) )
            // InternalMyTurtleDsl.g:7034:1: ( ',' )
            {
            // InternalMyTurtleDsl.g:7034:1: ( ',' )
            // InternalMyTurtleDsl.g:7035:2: ','
            {
             before(grammarAccess.getDroiteAccess().getCommaKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:7044:1: rule__Droite__Group__4 : rule__Droite__Group__4__Impl rule__Droite__Group__5 ;
    public final void rule__Droite__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7048:1: ( rule__Droite__Group__4__Impl rule__Droite__Group__5 )
            // InternalMyTurtleDsl.g:7049:2: rule__Droite__Group__4__Impl rule__Droite__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyTurtleDsl.g:7056:1: rule__Droite__Group__4__Impl : ( ( rule__Droite__Vitesse_deplacementAssignment_4 ) ) ;
    public final void rule__Droite__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7060:1: ( ( ( rule__Droite__Vitesse_deplacementAssignment_4 ) ) )
            // InternalMyTurtleDsl.g:7061:1: ( ( rule__Droite__Vitesse_deplacementAssignment_4 ) )
            {
            // InternalMyTurtleDsl.g:7061:1: ( ( rule__Droite__Vitesse_deplacementAssignment_4 ) )
            // InternalMyTurtleDsl.g:7062:2: ( rule__Droite__Vitesse_deplacementAssignment_4 )
            {
             before(grammarAccess.getDroiteAccess().getVitesse_deplacementAssignment_4()); 
            // InternalMyTurtleDsl.g:7063:2: ( rule__Droite__Vitesse_deplacementAssignment_4 )
            // InternalMyTurtleDsl.g:7063:3: rule__Droite__Vitesse_deplacementAssignment_4
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
    // InternalMyTurtleDsl.g:7071:1: rule__Droite__Group__5 : rule__Droite__Group__5__Impl ;
    public final void rule__Droite__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7075:1: ( rule__Droite__Group__5__Impl )
            // InternalMyTurtleDsl.g:7076:2: rule__Droite__Group__5__Impl
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
    // InternalMyTurtleDsl.g:7082:1: rule__Droite__Group__5__Impl : ( ')' ) ;
    public final void rule__Droite__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7086:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:7087:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:7087:1: ( ')' )
            // InternalMyTurtleDsl.g:7088:2: ')'
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
    // InternalMyTurtleDsl.g:7098:1: rule__Pause__Group__0 : rule__Pause__Group__0__Impl rule__Pause__Group__1 ;
    public final void rule__Pause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7102:1: ( rule__Pause__Group__0__Impl rule__Pause__Group__1 )
            // InternalMyTurtleDsl.g:7103:2: rule__Pause__Group__0__Impl rule__Pause__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyTurtleDsl.g:7110:1: rule__Pause__Group__0__Impl : ( 'droite' ) ;
    public final void rule__Pause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7114:1: ( ( 'droite' ) )
            // InternalMyTurtleDsl.g:7115:1: ( 'droite' )
            {
            // InternalMyTurtleDsl.g:7115:1: ( 'droite' )
            // InternalMyTurtleDsl.g:7116:2: 'droite'
            {
             before(grammarAccess.getPauseAccess().getDroiteKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:7125:1: rule__Pause__Group__1 : rule__Pause__Group__1__Impl rule__Pause__Group__2 ;
    public final void rule__Pause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7129:1: ( rule__Pause__Group__1__Impl rule__Pause__Group__2 )
            // InternalMyTurtleDsl.g:7130:2: rule__Pause__Group__1__Impl rule__Pause__Group__2
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
    // InternalMyTurtleDsl.g:7137:1: rule__Pause__Group__1__Impl : ( '(' ) ;
    public final void rule__Pause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7141:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:7142:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:7142:1: ( '(' )
            // InternalMyTurtleDsl.g:7143:2: '('
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
    // InternalMyTurtleDsl.g:7152:1: rule__Pause__Group__2 : rule__Pause__Group__2__Impl rule__Pause__Group__3 ;
    public final void rule__Pause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7156:1: ( rule__Pause__Group__2__Impl rule__Pause__Group__3 )
            // InternalMyTurtleDsl.g:7157:2: rule__Pause__Group__2__Impl rule__Pause__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyTurtleDsl.g:7164:1: rule__Pause__Group__2__Impl : ( ( rule__Pause__DureeAssignment_2 ) ) ;
    public final void rule__Pause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7168:1: ( ( ( rule__Pause__DureeAssignment_2 ) ) )
            // InternalMyTurtleDsl.g:7169:1: ( ( rule__Pause__DureeAssignment_2 ) )
            {
            // InternalMyTurtleDsl.g:7169:1: ( ( rule__Pause__DureeAssignment_2 ) )
            // InternalMyTurtleDsl.g:7170:2: ( rule__Pause__DureeAssignment_2 )
            {
             before(grammarAccess.getPauseAccess().getDureeAssignment_2()); 
            // InternalMyTurtleDsl.g:7171:2: ( rule__Pause__DureeAssignment_2 )
            // InternalMyTurtleDsl.g:7171:3: rule__Pause__DureeAssignment_2
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
    // InternalMyTurtleDsl.g:7179:1: rule__Pause__Group__3 : rule__Pause__Group__3__Impl ;
    public final void rule__Pause__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7183:1: ( rule__Pause__Group__3__Impl )
            // InternalMyTurtleDsl.g:7184:2: rule__Pause__Group__3__Impl
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
    // InternalMyTurtleDsl.g:7190:1: rule__Pause__Group__3__Impl : ( ')' ) ;
    public final void rule__Pause__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7194:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:7195:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:7195:1: ( ')' )
            // InternalMyTurtleDsl.g:7196:2: ')'
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
    // InternalMyTurtleDsl.g:7206:1: rule__RotationGauche__Group__0 : rule__RotationGauche__Group__0__Impl rule__RotationGauche__Group__1 ;
    public final void rule__RotationGauche__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7210:1: ( rule__RotationGauche__Group__0__Impl rule__RotationGauche__Group__1 )
            // InternalMyTurtleDsl.g:7211:2: rule__RotationGauche__Group__0__Impl rule__RotationGauche__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyTurtleDsl.g:7218:1: rule__RotationGauche__Group__0__Impl : ( 'rotation_gauche' ) ;
    public final void rule__RotationGauche__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7222:1: ( ( 'rotation_gauche' ) )
            // InternalMyTurtleDsl.g:7223:1: ( 'rotation_gauche' )
            {
            // InternalMyTurtleDsl.g:7223:1: ( 'rotation_gauche' )
            // InternalMyTurtleDsl.g:7224:2: 'rotation_gauche'
            {
             before(grammarAccess.getRotationGaucheAccess().getRotation_gaucheKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:7233:1: rule__RotationGauche__Group__1 : rule__RotationGauche__Group__1__Impl rule__RotationGauche__Group__2 ;
    public final void rule__RotationGauche__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7237:1: ( rule__RotationGauche__Group__1__Impl rule__RotationGauche__Group__2 )
            // InternalMyTurtleDsl.g:7238:2: rule__RotationGauche__Group__1__Impl rule__RotationGauche__Group__2
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
    // InternalMyTurtleDsl.g:7245:1: rule__RotationGauche__Group__1__Impl : ( '(' ) ;
    public final void rule__RotationGauche__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7249:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:7250:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:7250:1: ( '(' )
            // InternalMyTurtleDsl.g:7251:2: '('
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
    // InternalMyTurtleDsl.g:7260:1: rule__RotationGauche__Group__2 : rule__RotationGauche__Group__2__Impl rule__RotationGauche__Group__3 ;
    public final void rule__RotationGauche__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7264:1: ( rule__RotationGauche__Group__2__Impl rule__RotationGauche__Group__3 )
            // InternalMyTurtleDsl.g:7265:2: rule__RotationGauche__Group__2__Impl rule__RotationGauche__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyTurtleDsl.g:7272:1: rule__RotationGauche__Group__2__Impl : ( ( rule__RotationGauche__DureeAssignment_2 ) ) ;
    public final void rule__RotationGauche__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7276:1: ( ( ( rule__RotationGauche__DureeAssignment_2 ) ) )
            // InternalMyTurtleDsl.g:7277:1: ( ( rule__RotationGauche__DureeAssignment_2 ) )
            {
            // InternalMyTurtleDsl.g:7277:1: ( ( rule__RotationGauche__DureeAssignment_2 ) )
            // InternalMyTurtleDsl.g:7278:2: ( rule__RotationGauche__DureeAssignment_2 )
            {
             before(grammarAccess.getRotationGaucheAccess().getDureeAssignment_2()); 
            // InternalMyTurtleDsl.g:7279:2: ( rule__RotationGauche__DureeAssignment_2 )
            // InternalMyTurtleDsl.g:7279:3: rule__RotationGauche__DureeAssignment_2
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
    // InternalMyTurtleDsl.g:7287:1: rule__RotationGauche__Group__3 : rule__RotationGauche__Group__3__Impl rule__RotationGauche__Group__4 ;
    public final void rule__RotationGauche__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7291:1: ( rule__RotationGauche__Group__3__Impl rule__RotationGauche__Group__4 )
            // InternalMyTurtleDsl.g:7292:2: rule__RotationGauche__Group__3__Impl rule__RotationGauche__Group__4
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
    // InternalMyTurtleDsl.g:7299:1: rule__RotationGauche__Group__3__Impl : ( ',' ) ;
    public final void rule__RotationGauche__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7303:1: ( ( ',' ) )
            // InternalMyTurtleDsl.g:7304:1: ( ',' )
            {
            // InternalMyTurtleDsl.g:7304:1: ( ',' )
            // InternalMyTurtleDsl.g:7305:2: ','
            {
             before(grammarAccess.getRotationGaucheAccess().getCommaKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:7314:1: rule__RotationGauche__Group__4 : rule__RotationGauche__Group__4__Impl rule__RotationGauche__Group__5 ;
    public final void rule__RotationGauche__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7318:1: ( rule__RotationGauche__Group__4__Impl rule__RotationGauche__Group__5 )
            // InternalMyTurtleDsl.g:7319:2: rule__RotationGauche__Group__4__Impl rule__RotationGauche__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyTurtleDsl.g:7326:1: rule__RotationGauche__Group__4__Impl : ( ( rule__RotationGauche__Vitesse_rotationAssignment_4 ) ) ;
    public final void rule__RotationGauche__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7330:1: ( ( ( rule__RotationGauche__Vitesse_rotationAssignment_4 ) ) )
            // InternalMyTurtleDsl.g:7331:1: ( ( rule__RotationGauche__Vitesse_rotationAssignment_4 ) )
            {
            // InternalMyTurtleDsl.g:7331:1: ( ( rule__RotationGauche__Vitesse_rotationAssignment_4 ) )
            // InternalMyTurtleDsl.g:7332:2: ( rule__RotationGauche__Vitesse_rotationAssignment_4 )
            {
             before(grammarAccess.getRotationGaucheAccess().getVitesse_rotationAssignment_4()); 
            // InternalMyTurtleDsl.g:7333:2: ( rule__RotationGauche__Vitesse_rotationAssignment_4 )
            // InternalMyTurtleDsl.g:7333:3: rule__RotationGauche__Vitesse_rotationAssignment_4
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
    // InternalMyTurtleDsl.g:7341:1: rule__RotationGauche__Group__5 : rule__RotationGauche__Group__5__Impl ;
    public final void rule__RotationGauche__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7345:1: ( rule__RotationGauche__Group__5__Impl )
            // InternalMyTurtleDsl.g:7346:2: rule__RotationGauche__Group__5__Impl
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
    // InternalMyTurtleDsl.g:7352:1: rule__RotationGauche__Group__5__Impl : ( ')' ) ;
    public final void rule__RotationGauche__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7356:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:7357:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:7357:1: ( ')' )
            // InternalMyTurtleDsl.g:7358:2: ')'
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
    // InternalMyTurtleDsl.g:7368:1: rule__RotationDroite__Group__0 : rule__RotationDroite__Group__0__Impl rule__RotationDroite__Group__1 ;
    public final void rule__RotationDroite__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7372:1: ( rule__RotationDroite__Group__0__Impl rule__RotationDroite__Group__1 )
            // InternalMyTurtleDsl.g:7373:2: rule__RotationDroite__Group__0__Impl rule__RotationDroite__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyTurtleDsl.g:7380:1: rule__RotationDroite__Group__0__Impl : ( 'rotation_droite' ) ;
    public final void rule__RotationDroite__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7384:1: ( ( 'rotation_droite' ) )
            // InternalMyTurtleDsl.g:7385:1: ( 'rotation_droite' )
            {
            // InternalMyTurtleDsl.g:7385:1: ( 'rotation_droite' )
            // InternalMyTurtleDsl.g:7386:2: 'rotation_droite'
            {
             before(grammarAccess.getRotationDroiteAccess().getRotation_droiteKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:7395:1: rule__RotationDroite__Group__1 : rule__RotationDroite__Group__1__Impl rule__RotationDroite__Group__2 ;
    public final void rule__RotationDroite__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7399:1: ( rule__RotationDroite__Group__1__Impl rule__RotationDroite__Group__2 )
            // InternalMyTurtleDsl.g:7400:2: rule__RotationDroite__Group__1__Impl rule__RotationDroite__Group__2
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
    // InternalMyTurtleDsl.g:7407:1: rule__RotationDroite__Group__1__Impl : ( '(' ) ;
    public final void rule__RotationDroite__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7411:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:7412:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:7412:1: ( '(' )
            // InternalMyTurtleDsl.g:7413:2: '('
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
    // InternalMyTurtleDsl.g:7422:1: rule__RotationDroite__Group__2 : rule__RotationDroite__Group__2__Impl rule__RotationDroite__Group__3 ;
    public final void rule__RotationDroite__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7426:1: ( rule__RotationDroite__Group__2__Impl rule__RotationDroite__Group__3 )
            // InternalMyTurtleDsl.g:7427:2: rule__RotationDroite__Group__2__Impl rule__RotationDroite__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyTurtleDsl.g:7434:1: rule__RotationDroite__Group__2__Impl : ( ( rule__RotationDroite__DureeAssignment_2 ) ) ;
    public final void rule__RotationDroite__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7438:1: ( ( ( rule__RotationDroite__DureeAssignment_2 ) ) )
            // InternalMyTurtleDsl.g:7439:1: ( ( rule__RotationDroite__DureeAssignment_2 ) )
            {
            // InternalMyTurtleDsl.g:7439:1: ( ( rule__RotationDroite__DureeAssignment_2 ) )
            // InternalMyTurtleDsl.g:7440:2: ( rule__RotationDroite__DureeAssignment_2 )
            {
             before(grammarAccess.getRotationDroiteAccess().getDureeAssignment_2()); 
            // InternalMyTurtleDsl.g:7441:2: ( rule__RotationDroite__DureeAssignment_2 )
            // InternalMyTurtleDsl.g:7441:3: rule__RotationDroite__DureeAssignment_2
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
    // InternalMyTurtleDsl.g:7449:1: rule__RotationDroite__Group__3 : rule__RotationDroite__Group__3__Impl rule__RotationDroite__Group__4 ;
    public final void rule__RotationDroite__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7453:1: ( rule__RotationDroite__Group__3__Impl rule__RotationDroite__Group__4 )
            // InternalMyTurtleDsl.g:7454:2: rule__RotationDroite__Group__3__Impl rule__RotationDroite__Group__4
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
    // InternalMyTurtleDsl.g:7461:1: rule__RotationDroite__Group__3__Impl : ( ',' ) ;
    public final void rule__RotationDroite__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7465:1: ( ( ',' ) )
            // InternalMyTurtleDsl.g:7466:1: ( ',' )
            {
            // InternalMyTurtleDsl.g:7466:1: ( ',' )
            // InternalMyTurtleDsl.g:7467:2: ','
            {
             before(grammarAccess.getRotationDroiteAccess().getCommaKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:7476:1: rule__RotationDroite__Group__4 : rule__RotationDroite__Group__4__Impl rule__RotationDroite__Group__5 ;
    public final void rule__RotationDroite__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7480:1: ( rule__RotationDroite__Group__4__Impl rule__RotationDroite__Group__5 )
            // InternalMyTurtleDsl.g:7481:2: rule__RotationDroite__Group__4__Impl rule__RotationDroite__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyTurtleDsl.g:7488:1: rule__RotationDroite__Group__4__Impl : ( ( rule__RotationDroite__Vitesse_rotationAssignment_4 ) ) ;
    public final void rule__RotationDroite__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7492:1: ( ( ( rule__RotationDroite__Vitesse_rotationAssignment_4 ) ) )
            // InternalMyTurtleDsl.g:7493:1: ( ( rule__RotationDroite__Vitesse_rotationAssignment_4 ) )
            {
            // InternalMyTurtleDsl.g:7493:1: ( ( rule__RotationDroite__Vitesse_rotationAssignment_4 ) )
            // InternalMyTurtleDsl.g:7494:2: ( rule__RotationDroite__Vitesse_rotationAssignment_4 )
            {
             before(grammarAccess.getRotationDroiteAccess().getVitesse_rotationAssignment_4()); 
            // InternalMyTurtleDsl.g:7495:2: ( rule__RotationDroite__Vitesse_rotationAssignment_4 )
            // InternalMyTurtleDsl.g:7495:3: rule__RotationDroite__Vitesse_rotationAssignment_4
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
    // InternalMyTurtleDsl.g:7503:1: rule__RotationDroite__Group__5 : rule__RotationDroite__Group__5__Impl ;
    public final void rule__RotationDroite__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7507:1: ( rule__RotationDroite__Group__5__Impl )
            // InternalMyTurtleDsl.g:7508:2: rule__RotationDroite__Group__5__Impl
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
    // InternalMyTurtleDsl.g:7514:1: rule__RotationDroite__Group__5__Impl : ( ')' ) ;
    public final void rule__RotationDroite__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7518:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:7519:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:7519:1: ( ')' )
            // InternalMyTurtleDsl.g:7520:2: ')'
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
    // InternalMyTurtleDsl.g:7530:1: rule__FonctionDecl__Group__0 : rule__FonctionDecl__Group__0__Impl rule__FonctionDecl__Group__1 ;
    public final void rule__FonctionDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7534:1: ( rule__FonctionDecl__Group__0__Impl rule__FonctionDecl__Group__1 )
            // InternalMyTurtleDsl.g:7535:2: rule__FonctionDecl__Group__0__Impl rule__FonctionDecl__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyTurtleDsl.g:7542:1: rule__FonctionDecl__Group__0__Impl : ( 'func' ) ;
    public final void rule__FonctionDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7546:1: ( ( 'func' ) )
            // InternalMyTurtleDsl.g:7547:1: ( 'func' )
            {
            // InternalMyTurtleDsl.g:7547:1: ( 'func' )
            // InternalMyTurtleDsl.g:7548:2: 'func'
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
    // InternalMyTurtleDsl.g:7557:1: rule__FonctionDecl__Group__1 : rule__FonctionDecl__Group__1__Impl rule__FonctionDecl__Group__2 ;
    public final void rule__FonctionDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7561:1: ( rule__FonctionDecl__Group__1__Impl rule__FonctionDecl__Group__2 )
            // InternalMyTurtleDsl.g:7562:2: rule__FonctionDecl__Group__1__Impl rule__FonctionDecl__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyTurtleDsl.g:7569:1: rule__FonctionDecl__Group__1__Impl : ( ( rule__FonctionDecl__NameAssignment_1 ) ) ;
    public final void rule__FonctionDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7573:1: ( ( ( rule__FonctionDecl__NameAssignment_1 ) ) )
            // InternalMyTurtleDsl.g:7574:1: ( ( rule__FonctionDecl__NameAssignment_1 ) )
            {
            // InternalMyTurtleDsl.g:7574:1: ( ( rule__FonctionDecl__NameAssignment_1 ) )
            // InternalMyTurtleDsl.g:7575:2: ( rule__FonctionDecl__NameAssignment_1 )
            {
             before(grammarAccess.getFonctionDeclAccess().getNameAssignment_1()); 
            // InternalMyTurtleDsl.g:7576:2: ( rule__FonctionDecl__NameAssignment_1 )
            // InternalMyTurtleDsl.g:7576:3: rule__FonctionDecl__NameAssignment_1
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
    // InternalMyTurtleDsl.g:7584:1: rule__FonctionDecl__Group__2 : rule__FonctionDecl__Group__2__Impl rule__FonctionDecl__Group__3 ;
    public final void rule__FonctionDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7588:1: ( rule__FonctionDecl__Group__2__Impl rule__FonctionDecl__Group__3 )
            // InternalMyTurtleDsl.g:7589:2: rule__FonctionDecl__Group__2__Impl rule__FonctionDecl__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyTurtleDsl.g:7596:1: rule__FonctionDecl__Group__2__Impl : ( '(' ) ;
    public final void rule__FonctionDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7600:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:7601:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:7601:1: ( '(' )
            // InternalMyTurtleDsl.g:7602:2: '('
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
    // InternalMyTurtleDsl.g:7611:1: rule__FonctionDecl__Group__3 : rule__FonctionDecl__Group__3__Impl rule__FonctionDecl__Group__4 ;
    public final void rule__FonctionDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7615:1: ( rule__FonctionDecl__Group__3__Impl rule__FonctionDecl__Group__4 )
            // InternalMyTurtleDsl.g:7616:2: rule__FonctionDecl__Group__3__Impl rule__FonctionDecl__Group__4
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
    // InternalMyTurtleDsl.g:7623:1: rule__FonctionDecl__Group__3__Impl : ( ')' ) ;
    public final void rule__FonctionDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7627:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:7628:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:7628:1: ( ')' )
            // InternalMyTurtleDsl.g:7629:2: ')'
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
    // InternalMyTurtleDsl.g:7638:1: rule__FonctionDecl__Group__4 : rule__FonctionDecl__Group__4__Impl rule__FonctionDecl__Group__5 ;
    public final void rule__FonctionDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7642:1: ( rule__FonctionDecl__Group__4__Impl rule__FonctionDecl__Group__5 )
            // InternalMyTurtleDsl.g:7643:2: rule__FonctionDecl__Group__4__Impl rule__FonctionDecl__Group__5
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyTurtleDsl.g:7650:1: rule__FonctionDecl__Group__4__Impl : ( '{' ) ;
    public final void rule__FonctionDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7654:1: ( ( '{' ) )
            // InternalMyTurtleDsl.g:7655:1: ( '{' )
            {
            // InternalMyTurtleDsl.g:7655:1: ( '{' )
            // InternalMyTurtleDsl.g:7656:2: '{'
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
    // InternalMyTurtleDsl.g:7665:1: rule__FonctionDecl__Group__5 : rule__FonctionDecl__Group__5__Impl rule__FonctionDecl__Group__6 ;
    public final void rule__FonctionDecl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7669:1: ( rule__FonctionDecl__Group__5__Impl rule__FonctionDecl__Group__6 )
            // InternalMyTurtleDsl.g:7670:2: rule__FonctionDecl__Group__5__Impl rule__FonctionDecl__Group__6
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyTurtleDsl.g:7677:1: rule__FonctionDecl__Group__5__Impl : ( ( rule__FonctionDecl__BodyAssignment_5 )* ) ;
    public final void rule__FonctionDecl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7681:1: ( ( ( rule__FonctionDecl__BodyAssignment_5 )* ) )
            // InternalMyTurtleDsl.g:7682:1: ( ( rule__FonctionDecl__BodyAssignment_5 )* )
            {
            // InternalMyTurtleDsl.g:7682:1: ( ( rule__FonctionDecl__BodyAssignment_5 )* )
            // InternalMyTurtleDsl.g:7683:2: ( rule__FonctionDecl__BodyAssignment_5 )*
            {
             before(grammarAccess.getFonctionDeclAccess().getBodyAssignment_5()); 
            // InternalMyTurtleDsl.g:7684:2: ( rule__FonctionDecl__BodyAssignment_5 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==25||(LA21_0>=27 && LA21_0<=33)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyTurtleDsl.g:7684:3: rule__FonctionDecl__BodyAssignment_5
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__FonctionDecl__BodyAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalMyTurtleDsl.g:7692:1: rule__FonctionDecl__Group__6 : rule__FonctionDecl__Group__6__Impl rule__FonctionDecl__Group__7 ;
    public final void rule__FonctionDecl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7696:1: ( rule__FonctionDecl__Group__6__Impl rule__FonctionDecl__Group__7 )
            // InternalMyTurtleDsl.g:7697:2: rule__FonctionDecl__Group__6__Impl rule__FonctionDecl__Group__7
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyTurtleDsl.g:7704:1: rule__FonctionDecl__Group__6__Impl : ( '\\n' ) ;
    public final void rule__FonctionDecl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7708:1: ( ( '\\n' ) )
            // InternalMyTurtleDsl.g:7709:1: ( '\\n' )
            {
            // InternalMyTurtleDsl.g:7709:1: ( '\\n' )
            // InternalMyTurtleDsl.g:7710:2: '\\n'
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
    // InternalMyTurtleDsl.g:7719:1: rule__FonctionDecl__Group__7 : rule__FonctionDecl__Group__7__Impl ;
    public final void rule__FonctionDecl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7723:1: ( rule__FonctionDecl__Group__7__Impl )
            // InternalMyTurtleDsl.g:7724:2: rule__FonctionDecl__Group__7__Impl
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
    // InternalMyTurtleDsl.g:7730:1: rule__FonctionDecl__Group__7__Impl : ( '}' ) ;
    public final void rule__FonctionDecl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7734:1: ( ( '}' ) )
            // InternalMyTurtleDsl.g:7735:1: ( '}' )
            {
            // InternalMyTurtleDsl.g:7735:1: ( '}' )
            // InternalMyTurtleDsl.g:7736:2: '}'
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


    // $ANTLR start "rule__IntDecl__Group__0"
    // InternalMyTurtleDsl.g:7746:1: rule__IntDecl__Group__0 : rule__IntDecl__Group__0__Impl rule__IntDecl__Group__1 ;
    public final void rule__IntDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7750:1: ( rule__IntDecl__Group__0__Impl rule__IntDecl__Group__1 )
            // InternalMyTurtleDsl.g:7751:2: rule__IntDecl__Group__0__Impl rule__IntDecl__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyTurtleDsl.g:7758:1: rule__IntDecl__Group__0__Impl : ( 'Seconde' ) ;
    public final void rule__IntDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7762:1: ( ( 'Seconde' ) )
            // InternalMyTurtleDsl.g:7763:1: ( 'Seconde' )
            {
            // InternalMyTurtleDsl.g:7763:1: ( 'Seconde' )
            // InternalMyTurtleDsl.g:7764:2: 'Seconde'
            {
             before(grammarAccess.getIntDeclAccess().getSecondeKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:7773:1: rule__IntDecl__Group__1 : rule__IntDecl__Group__1__Impl rule__IntDecl__Group__2 ;
    public final void rule__IntDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7777:1: ( rule__IntDecl__Group__1__Impl rule__IntDecl__Group__2 )
            // InternalMyTurtleDsl.g:7778:2: rule__IntDecl__Group__1__Impl rule__IntDecl__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyTurtleDsl.g:7785:1: rule__IntDecl__Group__1__Impl : ( ( rule__IntDecl__NameAssignment_1 ) ) ;
    public final void rule__IntDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7789:1: ( ( ( rule__IntDecl__NameAssignment_1 ) ) )
            // InternalMyTurtleDsl.g:7790:1: ( ( rule__IntDecl__NameAssignment_1 ) )
            {
            // InternalMyTurtleDsl.g:7790:1: ( ( rule__IntDecl__NameAssignment_1 ) )
            // InternalMyTurtleDsl.g:7791:2: ( rule__IntDecl__NameAssignment_1 )
            {
             before(grammarAccess.getIntDeclAccess().getNameAssignment_1()); 
            // InternalMyTurtleDsl.g:7792:2: ( rule__IntDecl__NameAssignment_1 )
            // InternalMyTurtleDsl.g:7792:3: rule__IntDecl__NameAssignment_1
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
    // InternalMyTurtleDsl.g:7800:1: rule__IntDecl__Group__2 : rule__IntDecl__Group__2__Impl rule__IntDecl__Group__3 ;
    public final void rule__IntDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7804:1: ( rule__IntDecl__Group__2__Impl rule__IntDecl__Group__3 )
            // InternalMyTurtleDsl.g:7805:2: rule__IntDecl__Group__2__Impl rule__IntDecl__Group__3
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
    // InternalMyTurtleDsl.g:7812:1: rule__IntDecl__Group__2__Impl : ( '=' ) ;
    public final void rule__IntDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7816:1: ( ( '=' ) )
            // InternalMyTurtleDsl.g:7817:1: ( '=' )
            {
            // InternalMyTurtleDsl.g:7817:1: ( '=' )
            // InternalMyTurtleDsl.g:7818:2: '='
            {
             before(grammarAccess.getIntDeclAccess().getEqualsSignKeyword_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:7827:1: rule__IntDecl__Group__3 : rule__IntDecl__Group__3__Impl ;
    public final void rule__IntDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7831:1: ( rule__IntDecl__Group__3__Impl )
            // InternalMyTurtleDsl.g:7832:2: rule__IntDecl__Group__3__Impl
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
    // InternalMyTurtleDsl.g:7838:1: rule__IntDecl__Group__3__Impl : ( ( rule__IntDecl__ValAssignment_3 ) ) ;
    public final void rule__IntDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7842:1: ( ( ( rule__IntDecl__ValAssignment_3 ) ) )
            // InternalMyTurtleDsl.g:7843:1: ( ( rule__IntDecl__ValAssignment_3 ) )
            {
            // InternalMyTurtleDsl.g:7843:1: ( ( rule__IntDecl__ValAssignment_3 ) )
            // InternalMyTurtleDsl.g:7844:2: ( rule__IntDecl__ValAssignment_3 )
            {
             before(grammarAccess.getIntDeclAccess().getValAssignment_3()); 
            // InternalMyTurtleDsl.g:7845:2: ( rule__IntDecl__ValAssignment_3 )
            // InternalMyTurtleDsl.g:7845:3: rule__IntDecl__ValAssignment_3
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
    // InternalMyTurtleDsl.g:7854:1: rule__PourcentDecl__Group__0 : rule__PourcentDecl__Group__0__Impl rule__PourcentDecl__Group__1 ;
    public final void rule__PourcentDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7858:1: ( rule__PourcentDecl__Group__0__Impl rule__PourcentDecl__Group__1 )
            // InternalMyTurtleDsl.g:7859:2: rule__PourcentDecl__Group__0__Impl rule__PourcentDecl__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyTurtleDsl.g:7866:1: rule__PourcentDecl__Group__0__Impl : ( 'Pourcent' ) ;
    public final void rule__PourcentDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7870:1: ( ( 'Pourcent' ) )
            // InternalMyTurtleDsl.g:7871:1: ( 'Pourcent' )
            {
            // InternalMyTurtleDsl.g:7871:1: ( 'Pourcent' )
            // InternalMyTurtleDsl.g:7872:2: 'Pourcent'
            {
             before(grammarAccess.getPourcentDeclAccess().getPourcentKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:7881:1: rule__PourcentDecl__Group__1 : rule__PourcentDecl__Group__1__Impl rule__PourcentDecl__Group__2 ;
    public final void rule__PourcentDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7885:1: ( rule__PourcentDecl__Group__1__Impl rule__PourcentDecl__Group__2 )
            // InternalMyTurtleDsl.g:7886:2: rule__PourcentDecl__Group__1__Impl rule__PourcentDecl__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyTurtleDsl.g:7893:1: rule__PourcentDecl__Group__1__Impl : ( ( rule__PourcentDecl__NameAssignment_1 ) ) ;
    public final void rule__PourcentDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7897:1: ( ( ( rule__PourcentDecl__NameAssignment_1 ) ) )
            // InternalMyTurtleDsl.g:7898:1: ( ( rule__PourcentDecl__NameAssignment_1 ) )
            {
            // InternalMyTurtleDsl.g:7898:1: ( ( rule__PourcentDecl__NameAssignment_1 ) )
            // InternalMyTurtleDsl.g:7899:2: ( rule__PourcentDecl__NameAssignment_1 )
            {
             before(grammarAccess.getPourcentDeclAccess().getNameAssignment_1()); 
            // InternalMyTurtleDsl.g:7900:2: ( rule__PourcentDecl__NameAssignment_1 )
            // InternalMyTurtleDsl.g:7900:3: rule__PourcentDecl__NameAssignment_1
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
    // InternalMyTurtleDsl.g:7908:1: rule__PourcentDecl__Group__2 : rule__PourcentDecl__Group__2__Impl rule__PourcentDecl__Group__3 ;
    public final void rule__PourcentDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7912:1: ( rule__PourcentDecl__Group__2__Impl rule__PourcentDecl__Group__3 )
            // InternalMyTurtleDsl.g:7913:2: rule__PourcentDecl__Group__2__Impl rule__PourcentDecl__Group__3
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
    // InternalMyTurtleDsl.g:7920:1: rule__PourcentDecl__Group__2__Impl : ( '=' ) ;
    public final void rule__PourcentDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7924:1: ( ( '=' ) )
            // InternalMyTurtleDsl.g:7925:1: ( '=' )
            {
            // InternalMyTurtleDsl.g:7925:1: ( '=' )
            // InternalMyTurtleDsl.g:7926:2: '='
            {
             before(grammarAccess.getPourcentDeclAccess().getEqualsSignKeyword_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyTurtleDsl.g:7935:1: rule__PourcentDecl__Group__3 : rule__PourcentDecl__Group__3__Impl ;
    public final void rule__PourcentDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7939:1: ( rule__PourcentDecl__Group__3__Impl )
            // InternalMyTurtleDsl.g:7940:2: rule__PourcentDecl__Group__3__Impl
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
    // InternalMyTurtleDsl.g:7946:1: rule__PourcentDecl__Group__3__Impl : ( ( rule__PourcentDecl__ValAssignment_3 ) ) ;
    public final void rule__PourcentDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7950:1: ( ( ( rule__PourcentDecl__ValAssignment_3 ) ) )
            // InternalMyTurtleDsl.g:7951:1: ( ( rule__PourcentDecl__ValAssignment_3 ) )
            {
            // InternalMyTurtleDsl.g:7951:1: ( ( rule__PourcentDecl__ValAssignment_3 ) )
            // InternalMyTurtleDsl.g:7952:2: ( rule__PourcentDecl__ValAssignment_3 )
            {
             before(grammarAccess.getPourcentDeclAccess().getValAssignment_3()); 
            // InternalMyTurtleDsl.g:7953:2: ( rule__PourcentDecl__ValAssignment_3 )
            // InternalMyTurtleDsl.g:7953:3: rule__PourcentDecl__ValAssignment_3
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
    // InternalMyTurtleDsl.g:7962:1: rule__FonctionCall__Group__0 : rule__FonctionCall__Group__0__Impl rule__FonctionCall__Group__1 ;
    public final void rule__FonctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7966:1: ( rule__FonctionCall__Group__0__Impl rule__FonctionCall__Group__1 )
            // InternalMyTurtleDsl.g:7967:2: rule__FonctionCall__Group__0__Impl rule__FonctionCall__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyTurtleDsl.g:7974:1: rule__FonctionCall__Group__0__Impl : ( ( rule__FonctionCall__FuncAssignment_0 ) ) ;
    public final void rule__FonctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7978:1: ( ( ( rule__FonctionCall__FuncAssignment_0 ) ) )
            // InternalMyTurtleDsl.g:7979:1: ( ( rule__FonctionCall__FuncAssignment_0 ) )
            {
            // InternalMyTurtleDsl.g:7979:1: ( ( rule__FonctionCall__FuncAssignment_0 ) )
            // InternalMyTurtleDsl.g:7980:2: ( rule__FonctionCall__FuncAssignment_0 )
            {
             before(grammarAccess.getFonctionCallAccess().getFuncAssignment_0()); 
            // InternalMyTurtleDsl.g:7981:2: ( rule__FonctionCall__FuncAssignment_0 )
            // InternalMyTurtleDsl.g:7981:3: rule__FonctionCall__FuncAssignment_0
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
    // InternalMyTurtleDsl.g:7989:1: rule__FonctionCall__Group__1 : rule__FonctionCall__Group__1__Impl rule__FonctionCall__Group__2 ;
    public final void rule__FonctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:7993:1: ( rule__FonctionCall__Group__1__Impl rule__FonctionCall__Group__2 )
            // InternalMyTurtleDsl.g:7994:2: rule__FonctionCall__Group__1__Impl rule__FonctionCall__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyTurtleDsl.g:8001:1: rule__FonctionCall__Group__1__Impl : ( '(' ) ;
    public final void rule__FonctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8005:1: ( ( '(' ) )
            // InternalMyTurtleDsl.g:8006:1: ( '(' )
            {
            // InternalMyTurtleDsl.g:8006:1: ( '(' )
            // InternalMyTurtleDsl.g:8007:2: '('
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
    // InternalMyTurtleDsl.g:8016:1: rule__FonctionCall__Group__2 : rule__FonctionCall__Group__2__Impl ;
    public final void rule__FonctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8020:1: ( rule__FonctionCall__Group__2__Impl )
            // InternalMyTurtleDsl.g:8021:2: rule__FonctionCall__Group__2__Impl
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
    // InternalMyTurtleDsl.g:8027:1: rule__FonctionCall__Group__2__Impl : ( ')' ) ;
    public final void rule__FonctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8031:1: ( ( ')' ) )
            // InternalMyTurtleDsl.g:8032:1: ( ')' )
            {
            // InternalMyTurtleDsl.g:8032:1: ( ')' )
            // InternalMyTurtleDsl.g:8033:2: ')'
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


    // $ANTLR start "rule__Model__IncludesAssignment_0"
    // InternalMyTurtleDsl.g:8043:1: rule__Model__IncludesAssignment_0 : ( ruleIncludes ) ;
    public final void rule__Model__IncludesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8047:1: ( ( ruleIncludes ) )
            // InternalMyTurtleDsl.g:8048:2: ( ruleIncludes )
            {
            // InternalMyTurtleDsl.g:8048:2: ( ruleIncludes )
            // InternalMyTurtleDsl.g:8049:3: ruleIncludes
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


    // $ANTLR start "rule__Model__SeconDecAssignment_7_0"
    // InternalMyTurtleDsl.g:8058:1: rule__Model__SeconDecAssignment_7_0 : ( ruleIntDecl ) ;
    public final void rule__Model__SeconDecAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8062:1: ( ( ruleIntDecl ) )
            // InternalMyTurtleDsl.g:8063:2: ( ruleIntDecl )
            {
            // InternalMyTurtleDsl.g:8063:2: ( ruleIntDecl )
            // InternalMyTurtleDsl.g:8064:3: ruleIntDecl
            {
             before(grammarAccess.getModelAccess().getSeconDecIntDeclParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_2);
            ruleIntDecl();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSeconDecIntDeclParserRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__SeconDecAssignment_7_0"


    // $ANTLR start "rule__Model__PourDecAssignment_7_1"
    // InternalMyTurtleDsl.g:8073:1: rule__Model__PourDecAssignment_7_1 : ( rulePourcentDecl ) ;
    public final void rule__Model__PourDecAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8077:1: ( ( rulePourcentDecl ) )
            // InternalMyTurtleDsl.g:8078:2: ( rulePourcentDecl )
            {
            // InternalMyTurtleDsl.g:8078:2: ( rulePourcentDecl )
            // InternalMyTurtleDsl.g:8079:3: rulePourcentDecl
            {
             before(grammarAccess.getModelAccess().getPourDecPourcentDeclParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            rulePourcentDecl();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPourDecPourcentDeclParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PourDecAssignment_7_1"


    // $ANTLR start "rule__Model__StatementsAssignment_7_2"
    // InternalMyTurtleDsl.g:8088:1: rule__Model__StatementsAssignment_7_2 : ( ruleStatement ) ;
    public final void rule__Model__StatementsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8092:1: ( ( ruleStatement ) )
            // InternalMyTurtleDsl.g:8093:2: ( ruleStatement )
            {
            // InternalMyTurtleDsl.g:8093:2: ( ruleStatement )
            // InternalMyTurtleDsl.g:8094:3: ruleStatement
            {
             before(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__StatementsAssignment_7_2"


    // $ANTLR start "rule__Model__FonctionsAssignment_7_3"
    // InternalMyTurtleDsl.g:8103:1: rule__Model__FonctionsAssignment_7_3 : ( ruleFonctionCall ) ;
    public final void rule__Model__FonctionsAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8107:1: ( ( ruleFonctionCall ) )
            // InternalMyTurtleDsl.g:8108:2: ( ruleFonctionCall )
            {
            // InternalMyTurtleDsl.g:8108:2: ( ruleFonctionCall )
            // InternalMyTurtleDsl.g:8109:3: ruleFonctionCall
            {
             before(grammarAccess.getModelAccess().getFonctionsFonctionCallParserRuleCall_7_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFonctionCall();

            state._fsp--;

             after(grammarAccess.getModelAccess().getFonctionsFonctionCallParserRuleCall_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__FonctionsAssignment_7_3"


    // $ANTLR start "rule__Model__ParalleleAssignment_7_4"
    // InternalMyTurtleDsl.g:8118:1: rule__Model__ParalleleAssignment_7_4 : ( ( rule__Model__ParalleleAlternatives_7_4_0 ) ) ;
    public final void rule__Model__ParalleleAssignment_7_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8122:1: ( ( ( rule__Model__ParalleleAlternatives_7_4_0 ) ) )
            // InternalMyTurtleDsl.g:8123:2: ( ( rule__Model__ParalleleAlternatives_7_4_0 ) )
            {
            // InternalMyTurtleDsl.g:8123:2: ( ( rule__Model__ParalleleAlternatives_7_4_0 ) )
            // InternalMyTurtleDsl.g:8124:3: ( rule__Model__ParalleleAlternatives_7_4_0 )
            {
             before(grammarAccess.getModelAccess().getParalleleAlternatives_7_4_0()); 
            // InternalMyTurtleDsl.g:8125:3: ( rule__Model__ParalleleAlternatives_7_4_0 )
            // InternalMyTurtleDsl.g:8125:4: rule__Model__ParalleleAlternatives_7_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__ParalleleAlternatives_7_4_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getParalleleAlternatives_7_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ParalleleAssignment_7_4"


    // $ANTLR start "rule__Model__FonctionsAssignment_13"
    // InternalMyTurtleDsl.g:8133:1: rule__Model__FonctionsAssignment_13 : ( ruleFonctionDecl ) ;
    public final void rule__Model__FonctionsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8137:1: ( ( ruleFonctionDecl ) )
            // InternalMyTurtleDsl.g:8138:2: ( ruleFonctionDecl )
            {
            // InternalMyTurtleDsl.g:8138:2: ( ruleFonctionDecl )
            // InternalMyTurtleDsl.g:8139:3: ruleFonctionDecl
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


    // $ANTLR start "rule__Parallele2__AAssignment_0_0"
    // InternalMyTurtleDsl.g:8148:1: rule__Parallele2__AAssignment_0_0 : ( ruleMD ) ;
    public final void rule__Parallele2__AAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8152:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:8153:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:8153:2: ( ruleMD )
            // InternalMyTurtleDsl.g:8154:3: ruleMD
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
    // InternalMyTurtleDsl.g:8163:1: rule__Parallele2__TAssignment_0_2 : ( ruleGDr ) ;
    public final void rule__Parallele2__TAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8167:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:8168:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:8168:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:8169:3: ruleGDr
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
    // InternalMyTurtleDsl.g:8178:1: rule__Parallele2__AAssignment_1_0 : ( ruleMD ) ;
    public final void rule__Parallele2__AAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8182:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:8183:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:8183:2: ( ruleMD )
            // InternalMyTurtleDsl.g:8184:3: ruleMD
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
    // InternalMyTurtleDsl.g:8193:1: rule__Parallele2__TAssignment_1_2 : ( ruleAR ) ;
    public final void rule__Parallele2__TAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8197:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:8198:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:8198:2: ( ruleAR )
            // InternalMyTurtleDsl.g:8199:3: ruleAR
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
    // InternalMyTurtleDsl.g:8208:1: rule__Parallele2__AAssignment_2_0 : ( ruleMD ) ;
    public final void rule__Parallele2__AAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8212:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:8213:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:8213:2: ( ruleMD )
            // InternalMyTurtleDsl.g:8214:3: ruleMD
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
    // InternalMyTurtleDsl.g:8223:1: rule__Parallele2__TAssignment_2_2 : ( ruleRGRD ) ;
    public final void rule__Parallele2__TAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8227:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:8228:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:8228:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:8229:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:8238:1: rule__Parallele2__TAssignment_3_0 : ( ruleGDr ) ;
    public final void rule__Parallele2__TAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8242:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:8243:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:8243:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:8244:3: ruleGDr
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
    // InternalMyTurtleDsl.g:8253:1: rule__Parallele2__BAssignment_3_2 : ( ruleAR ) ;
    public final void rule__Parallele2__BAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8257:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:8258:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:8258:2: ( ruleAR )
            // InternalMyTurtleDsl.g:8259:3: ruleAR
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
    // InternalMyTurtleDsl.g:8268:1: rule__Parallele2__TAssignment_4_0 : ( ruleGDr ) ;
    public final void rule__Parallele2__TAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8272:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:8273:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:8273:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:8274:3: ruleGDr
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
    // InternalMyTurtleDsl.g:8283:1: rule__Parallele2__BAssignment_4_2 : ( ruleMD ) ;
    public final void rule__Parallele2__BAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8287:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:8288:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:8288:2: ( ruleMD )
            // InternalMyTurtleDsl.g:8289:3: ruleMD
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
    // InternalMyTurtleDsl.g:8298:1: rule__Parallele2__TAssignment_5_0 : ( ruleGDr ) ;
    public final void rule__Parallele2__TAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8302:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:8303:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:8303:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:8304:3: ruleGDr
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
    // InternalMyTurtleDsl.g:8313:1: rule__Parallele2__BAssignment_5_2 : ( ruleRGRD ) ;
    public final void rule__Parallele2__BAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8317:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:8318:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:8318:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:8319:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:8328:1: rule__Parallele2__TAssignment_6_0 : ( ruleRGRD ) ;
    public final void rule__Parallele2__TAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8332:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:8333:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:8333:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:8334:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:8343:1: rule__Parallele2__AAssignment_6_2 : ( ruleMD ) ;
    public final void rule__Parallele2__AAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8347:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:8348:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:8348:2: ( ruleMD )
            // InternalMyTurtleDsl.g:8349:3: ruleMD
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
    // InternalMyTurtleDsl.g:8358:1: rule__Parallele2__TAssignment_7_0 : ( ruleRGRD ) ;
    public final void rule__Parallele2__TAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8362:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:8363:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:8363:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:8364:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:8373:1: rule__Parallele2__AAssignment_7_2 : ( ruleAR ) ;
    public final void rule__Parallele2__AAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8377:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:8378:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:8378:2: ( ruleAR )
            // InternalMyTurtleDsl.g:8379:3: ruleAR
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
    // InternalMyTurtleDsl.g:8388:1: rule__Parallele2__TAssignment_8_0 : ( ruleRGRD ) ;
    public final void rule__Parallele2__TAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8392:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:8393:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:8393:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:8394:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:8403:1: rule__Parallele2__AAssignment_8_2 : ( ruleGDr ) ;
    public final void rule__Parallele2__AAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8407:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:8408:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:8408:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:8409:3: ruleGDr
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
    // InternalMyTurtleDsl.g:8418:1: rule__Parallele2__TAssignment_9_0 : ( ruleAR ) ;
    public final void rule__Parallele2__TAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8422:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:8423:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:8423:2: ( ruleAR )
            // InternalMyTurtleDsl.g:8424:3: ruleAR
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
    // InternalMyTurtleDsl.g:8433:1: rule__Parallele2__AAssignment_9_2 : ( ruleMD ) ;
    public final void rule__Parallele2__AAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8437:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:8438:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:8438:2: ( ruleMD )
            // InternalMyTurtleDsl.g:8439:3: ruleMD
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
    // InternalMyTurtleDsl.g:8448:1: rule__Parallele2__TAssignment_10_0 : ( ruleAR ) ;
    public final void rule__Parallele2__TAssignment_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8452:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:8453:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:8453:2: ( ruleAR )
            // InternalMyTurtleDsl.g:8454:3: ruleAR
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
    // InternalMyTurtleDsl.g:8463:1: rule__Parallele2__AAssignment_10_2 : ( ruleRGRD ) ;
    public final void rule__Parallele2__AAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8467:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:8468:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:8468:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:8469:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:8478:1: rule__Parallele2__TAssignment_11_0 : ( ruleAR ) ;
    public final void rule__Parallele2__TAssignment_11_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8482:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:8483:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:8483:2: ( ruleAR )
            // InternalMyTurtleDsl.g:8484:3: ruleAR
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
    // InternalMyTurtleDsl.g:8493:1: rule__Parallele2__AAssignment_11_2 : ( ruleGDr ) ;
    public final void rule__Parallele2__AAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8497:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:8498:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:8498:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:8499:3: ruleGDr
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
    // InternalMyTurtleDsl.g:8508:1: rule__Parallele3__AAssignment_0_0 : ( ruleAR ) ;
    public final void rule__Parallele3__AAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8512:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:8513:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:8513:2: ( ruleAR )
            // InternalMyTurtleDsl.g:8514:3: ruleAR
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
    // InternalMyTurtleDsl.g:8523:1: rule__Parallele3__BAssignment_0_2 : ( ruleGDr ) ;
    public final void rule__Parallele3__BAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8527:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:8528:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:8528:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:8529:3: ruleGDr
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
    // InternalMyTurtleDsl.g:8538:1: rule__Parallele3__CAssignment_0_4 : ( ruleMD ) ;
    public final void rule__Parallele3__CAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8542:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:8543:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:8543:2: ( ruleMD )
            // InternalMyTurtleDsl.g:8544:3: ruleMD
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
    // InternalMyTurtleDsl.g:8553:1: rule__Parallele3__AAssignment_1_0 : ( ruleAR ) ;
    public final void rule__Parallele3__AAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8557:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:8558:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:8558:2: ( ruleAR )
            // InternalMyTurtleDsl.g:8559:3: ruleAR
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
    // InternalMyTurtleDsl.g:8568:1: rule__Parallele3__BAssignment_1_2 : ( ruleGDr ) ;
    public final void rule__Parallele3__BAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8572:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:8573:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:8573:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:8574:3: ruleGDr
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
    // InternalMyTurtleDsl.g:8583:1: rule__Parallele3__CAssignment_1_4 : ( ruleRGRD ) ;
    public final void rule__Parallele3__CAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8587:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:8588:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:8588:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:8589:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:8598:1: rule__Parallele3__AAssignment_2_0 : ( ruleAR ) ;
    public final void rule__Parallele3__AAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8602:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:8603:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:8603:2: ( ruleAR )
            // InternalMyTurtleDsl.g:8604:3: ruleAR
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
    // InternalMyTurtleDsl.g:8613:1: rule__Parallele3__BAssignment_2_2 : ( ruleMD ) ;
    public final void rule__Parallele3__BAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8617:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:8618:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:8618:2: ( ruleMD )
            // InternalMyTurtleDsl.g:8619:3: ruleMD
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
    // InternalMyTurtleDsl.g:8628:1: rule__Parallele3__CAssignment_2_4 : ( ruleGDr ) ;
    public final void rule__Parallele3__CAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8632:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:8633:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:8633:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:8634:3: ruleGDr
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
    // InternalMyTurtleDsl.g:8643:1: rule__Parallele3__AAssignment_3_0 : ( ruleAR ) ;
    public final void rule__Parallele3__AAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8647:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:8648:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:8648:2: ( ruleAR )
            // InternalMyTurtleDsl.g:8649:3: ruleAR
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
    // InternalMyTurtleDsl.g:8658:1: rule__Parallele3__BAssignment_3_2 : ( ruleMD ) ;
    public final void rule__Parallele3__BAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8662:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:8663:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:8663:2: ( ruleMD )
            // InternalMyTurtleDsl.g:8664:3: ruleMD
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
    // InternalMyTurtleDsl.g:8673:1: rule__Parallele3__CAssignment_3_4 : ( ruleRGRD ) ;
    public final void rule__Parallele3__CAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8677:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:8678:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:8678:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:8679:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:8688:1: rule__Parallele3__AAssignment_4_0 : ( ruleAR ) ;
    public final void rule__Parallele3__AAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8692:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:8693:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:8693:2: ( ruleAR )
            // InternalMyTurtleDsl.g:8694:3: ruleAR
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
    // InternalMyTurtleDsl.g:8703:1: rule__Parallele3__BAssignment_4_2 : ( ruleRGRD ) ;
    public final void rule__Parallele3__BAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8707:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:8708:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:8708:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:8709:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:8718:1: rule__Parallele3__CAssignment_4_4 : ( ruleMD ) ;
    public final void rule__Parallele3__CAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8722:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:8723:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:8723:2: ( ruleMD )
            // InternalMyTurtleDsl.g:8724:3: ruleMD
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
    // InternalMyTurtleDsl.g:8733:1: rule__Parallele3__AAssignment_5_0 : ( ruleAR ) ;
    public final void rule__Parallele3__AAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8737:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:8738:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:8738:2: ( ruleAR )
            // InternalMyTurtleDsl.g:8739:3: ruleAR
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
    // InternalMyTurtleDsl.g:8748:1: rule__Parallele3__BAssignment_5_2 : ( ruleRGRD ) ;
    public final void rule__Parallele3__BAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8752:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:8753:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:8753:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:8754:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:8763:1: rule__Parallele3__CAssignment_5_4 : ( ruleGDr ) ;
    public final void rule__Parallele3__CAssignment_5_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8767:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:8768:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:8768:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:8769:3: ruleGDr
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
    // InternalMyTurtleDsl.g:8778:1: rule__Parallele3__AAssignment_6_0 : ( ruleGDr ) ;
    public final void rule__Parallele3__AAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8782:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:8783:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:8783:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:8784:3: ruleGDr
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
    // InternalMyTurtleDsl.g:8793:1: rule__Parallele3__BAssignment_6_2 : ( ruleAR ) ;
    public final void rule__Parallele3__BAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8797:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:8798:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:8798:2: ( ruleAR )
            // InternalMyTurtleDsl.g:8799:3: ruleAR
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
    // InternalMyTurtleDsl.g:8808:1: rule__Parallele3__CAssignment_6_4 : ( ruleMD ) ;
    public final void rule__Parallele3__CAssignment_6_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8812:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:8813:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:8813:2: ( ruleMD )
            // InternalMyTurtleDsl.g:8814:3: ruleMD
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
    // InternalMyTurtleDsl.g:8823:1: rule__Parallele3__AAssignment_7_0 : ( ruleGDr ) ;
    public final void rule__Parallele3__AAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8827:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:8828:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:8828:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:8829:3: ruleGDr
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
    // InternalMyTurtleDsl.g:8838:1: rule__Parallele3__BAssignment_7_2 : ( ruleAR ) ;
    public final void rule__Parallele3__BAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8842:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:8843:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:8843:2: ( ruleAR )
            // InternalMyTurtleDsl.g:8844:3: ruleAR
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
    // InternalMyTurtleDsl.g:8853:1: rule__Parallele3__CAssignment_7_4 : ( ruleRGRD ) ;
    public final void rule__Parallele3__CAssignment_7_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8857:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:8858:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:8858:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:8859:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:8868:1: rule__Parallele3__AAssignment_8_0 : ( ruleGDr ) ;
    public final void rule__Parallele3__AAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8872:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:8873:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:8873:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:8874:3: ruleGDr
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
    // InternalMyTurtleDsl.g:8883:1: rule__Parallele3__BAssignment_8_2 : ( ruleMD ) ;
    public final void rule__Parallele3__BAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8887:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:8888:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:8888:2: ( ruleMD )
            // InternalMyTurtleDsl.g:8889:3: ruleMD
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
    // InternalMyTurtleDsl.g:8898:1: rule__Parallele3__CAssignment_8_4 : ( ruleAR ) ;
    public final void rule__Parallele3__CAssignment_8_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8902:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:8903:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:8903:2: ( ruleAR )
            // InternalMyTurtleDsl.g:8904:3: ruleAR
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
    // InternalMyTurtleDsl.g:8913:1: rule__Parallele3__AAssignment_9_0 : ( ruleGDr ) ;
    public final void rule__Parallele3__AAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8917:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:8918:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:8918:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:8919:3: ruleGDr
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
    // InternalMyTurtleDsl.g:8928:1: rule__Parallele3__BAssignment_9_2 : ( ruleMD ) ;
    public final void rule__Parallele3__BAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8932:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:8933:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:8933:2: ( ruleMD )
            // InternalMyTurtleDsl.g:8934:3: ruleMD
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
    // InternalMyTurtleDsl.g:8943:1: rule__Parallele3__CAssignment_9_4 : ( ruleRGRD ) ;
    public final void rule__Parallele3__CAssignment_9_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8947:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:8948:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:8948:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:8949:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:8958:1: rule__Parallele3__AAssignment_10_0 : ( ruleGDr ) ;
    public final void rule__Parallele3__AAssignment_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8962:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:8963:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:8963:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:8964:3: ruleGDr
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
    // InternalMyTurtleDsl.g:8973:1: rule__Parallele3__BAssignment_10_2 : ( ruleRGRD ) ;
    public final void rule__Parallele3__BAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8977:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:8978:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:8978:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:8979:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:8988:1: rule__Parallele3__CAssignment_10_4 : ( ruleAR ) ;
    public final void rule__Parallele3__CAssignment_10_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:8992:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:8993:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:8993:2: ( ruleAR )
            // InternalMyTurtleDsl.g:8994:3: ruleAR
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
    // InternalMyTurtleDsl.g:9003:1: rule__Parallele3__AAssignment_11_0 : ( ruleGDr ) ;
    public final void rule__Parallele3__AAssignment_11_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9007:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:9008:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:9008:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:9009:3: ruleGDr
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
    // InternalMyTurtleDsl.g:9018:1: rule__Parallele3__BAssignment_11_2 : ( ruleRGRD ) ;
    public final void rule__Parallele3__BAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9022:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:9023:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:9023:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:9024:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:9033:1: rule__Parallele3__CAssignment_11_4 : ( ruleMD ) ;
    public final void rule__Parallele3__CAssignment_11_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9037:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:9038:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:9038:2: ( ruleMD )
            // InternalMyTurtleDsl.g:9039:3: ruleMD
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
    // InternalMyTurtleDsl.g:9048:1: rule__Parallele3__AAssignment_12_0 : ( ruleMD ) ;
    public final void rule__Parallele3__AAssignment_12_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9052:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:9053:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:9053:2: ( ruleMD )
            // InternalMyTurtleDsl.g:9054:3: ruleMD
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
    // InternalMyTurtleDsl.g:9063:1: rule__Parallele3__BAssignment_12_2 : ( ruleAR ) ;
    public final void rule__Parallele3__BAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9067:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:9068:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:9068:2: ( ruleAR )
            // InternalMyTurtleDsl.g:9069:3: ruleAR
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
    // InternalMyTurtleDsl.g:9078:1: rule__Parallele3__CAssignment_12_4 : ( ruleGDr ) ;
    public final void rule__Parallele3__CAssignment_12_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9082:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:9083:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:9083:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:9084:3: ruleGDr
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
    // InternalMyTurtleDsl.g:9093:1: rule__Parallele3__AAssignment_13_0 : ( ruleMD ) ;
    public final void rule__Parallele3__AAssignment_13_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9097:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:9098:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:9098:2: ( ruleMD )
            // InternalMyTurtleDsl.g:9099:3: ruleMD
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
    // InternalMyTurtleDsl.g:9108:1: rule__Parallele3__BAssignment_13_2 : ( ruleAR ) ;
    public final void rule__Parallele3__BAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9112:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:9113:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:9113:2: ( ruleAR )
            // InternalMyTurtleDsl.g:9114:3: ruleAR
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
    // InternalMyTurtleDsl.g:9123:1: rule__Parallele3__CAssignment_13_4 : ( ruleRGRD ) ;
    public final void rule__Parallele3__CAssignment_13_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9127:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:9128:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:9128:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:9129:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:9138:1: rule__Parallele3__AAssignment_14_0 : ( ruleMD ) ;
    public final void rule__Parallele3__AAssignment_14_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9142:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:9143:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:9143:2: ( ruleMD )
            // InternalMyTurtleDsl.g:9144:3: ruleMD
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
    // InternalMyTurtleDsl.g:9153:1: rule__Parallele3__BAssignment_14_2 : ( ruleGDr ) ;
    public final void rule__Parallele3__BAssignment_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9157:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:9158:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:9158:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:9159:3: ruleGDr
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
    // InternalMyTurtleDsl.g:9168:1: rule__Parallele3__CAssignment_14_4 : ( ruleAR ) ;
    public final void rule__Parallele3__CAssignment_14_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9172:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:9173:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:9173:2: ( ruleAR )
            // InternalMyTurtleDsl.g:9174:3: ruleAR
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
    // InternalMyTurtleDsl.g:9183:1: rule__Parallele3__AAssignment_15_0 : ( ruleMD ) ;
    public final void rule__Parallele3__AAssignment_15_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9187:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:9188:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:9188:2: ( ruleMD )
            // InternalMyTurtleDsl.g:9189:3: ruleMD
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
    // InternalMyTurtleDsl.g:9198:1: rule__Parallele3__BAssignment_15_2 : ( ruleGDr ) ;
    public final void rule__Parallele3__BAssignment_15_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9202:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:9203:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:9203:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:9204:3: ruleGDr
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
    // InternalMyTurtleDsl.g:9213:1: rule__Parallele3__CAssignment_15_4 : ( ruleRGRD ) ;
    public final void rule__Parallele3__CAssignment_15_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9217:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:9218:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:9218:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:9219:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:9228:1: rule__Parallele3__AAssignment_16_0 : ( ruleMD ) ;
    public final void rule__Parallele3__AAssignment_16_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9232:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:9233:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:9233:2: ( ruleMD )
            // InternalMyTurtleDsl.g:9234:3: ruleMD
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
    // InternalMyTurtleDsl.g:9243:1: rule__Parallele3__BAssignment_16_2 : ( ruleRGRD ) ;
    public final void rule__Parallele3__BAssignment_16_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9247:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:9248:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:9248:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:9249:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:9258:1: rule__Parallele3__CAssignment_16_4 : ( ruleGDr ) ;
    public final void rule__Parallele3__CAssignment_16_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9262:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:9263:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:9263:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:9264:3: ruleGDr
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
    // InternalMyTurtleDsl.g:9273:1: rule__Parallele3__AAssignment_17_0 : ( ruleMD ) ;
    public final void rule__Parallele3__AAssignment_17_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9277:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:9278:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:9278:2: ( ruleMD )
            // InternalMyTurtleDsl.g:9279:3: ruleMD
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
    // InternalMyTurtleDsl.g:9288:1: rule__Parallele3__BAssignment_17_2 : ( ruleRGRD ) ;
    public final void rule__Parallele3__BAssignment_17_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9292:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:9293:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:9293:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:9294:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:9303:1: rule__Parallele3__CAssignment_17_4 : ( ruleAR ) ;
    public final void rule__Parallele3__CAssignment_17_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9307:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:9308:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:9308:2: ( ruleAR )
            // InternalMyTurtleDsl.g:9309:3: ruleAR
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
    // InternalMyTurtleDsl.g:9318:1: rule__Parallele3__AAssignment_18_0 : ( ruleRGRD ) ;
    public final void rule__Parallele3__AAssignment_18_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9322:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:9323:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:9323:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:9324:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:9333:1: rule__Parallele3__BAssignment_18_2 : ( ruleAR ) ;
    public final void rule__Parallele3__BAssignment_18_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9337:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:9338:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:9338:2: ( ruleAR )
            // InternalMyTurtleDsl.g:9339:3: ruleAR
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
    // InternalMyTurtleDsl.g:9348:1: rule__Parallele3__CAssignment_18_4 : ( ruleMD ) ;
    public final void rule__Parallele3__CAssignment_18_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9352:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:9353:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:9353:2: ( ruleMD )
            // InternalMyTurtleDsl.g:9354:3: ruleMD
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
    // InternalMyTurtleDsl.g:9363:1: rule__Parallele3__AAssignment_19_0 : ( ruleRGRD ) ;
    public final void rule__Parallele3__AAssignment_19_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9367:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:9368:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:9368:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:9369:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:9378:1: rule__Parallele3__BAssignment_19_2 : ( ruleAR ) ;
    public final void rule__Parallele3__BAssignment_19_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9382:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:9383:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:9383:2: ( ruleAR )
            // InternalMyTurtleDsl.g:9384:3: ruleAR
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
    // InternalMyTurtleDsl.g:9393:1: rule__Parallele3__CAssignment_19_4 : ( ruleGDr ) ;
    public final void rule__Parallele3__CAssignment_19_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9397:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:9398:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:9398:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:9399:3: ruleGDr
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
    // InternalMyTurtleDsl.g:9408:1: rule__Parallele3__AAssignment_20_0 : ( ruleRGRD ) ;
    public final void rule__Parallele3__AAssignment_20_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9412:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:9413:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:9413:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:9414:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:9423:1: rule__Parallele3__BAssignment_20_2 : ( ruleMD ) ;
    public final void rule__Parallele3__BAssignment_20_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9427:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:9428:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:9428:2: ( ruleMD )
            // InternalMyTurtleDsl.g:9429:3: ruleMD
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
    // InternalMyTurtleDsl.g:9438:1: rule__Parallele3__CAssignment_20_4 : ( ruleAR ) ;
    public final void rule__Parallele3__CAssignment_20_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9442:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:9443:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:9443:2: ( ruleAR )
            // InternalMyTurtleDsl.g:9444:3: ruleAR
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
    // InternalMyTurtleDsl.g:9453:1: rule__Parallele3__AAssignment_21_0 : ( ruleRGRD ) ;
    public final void rule__Parallele3__AAssignment_21_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9457:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:9458:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:9458:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:9459:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:9468:1: rule__Parallele3__BAssignment_21_2 : ( ruleMD ) ;
    public final void rule__Parallele3__BAssignment_21_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9472:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:9473:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:9473:2: ( ruleMD )
            // InternalMyTurtleDsl.g:9474:3: ruleMD
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
    // InternalMyTurtleDsl.g:9483:1: rule__Parallele3__CAssignment_21_4 : ( ruleGDr ) ;
    public final void rule__Parallele3__CAssignment_21_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9487:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:9488:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:9488:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:9489:3: ruleGDr
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
    // InternalMyTurtleDsl.g:9498:1: rule__Parallele3__AAssignment_22_0 : ( ruleRGRD ) ;
    public final void rule__Parallele3__AAssignment_22_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9502:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:9503:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:9503:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:9504:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:9513:1: rule__Parallele3__BAssignment_22_2 : ( ruleGDr ) ;
    public final void rule__Parallele3__BAssignment_22_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9517:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:9518:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:9518:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:9519:3: ruleGDr
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
    // InternalMyTurtleDsl.g:9528:1: rule__Parallele3__CAssignment_22_4 : ( ruleMD ) ;
    public final void rule__Parallele3__CAssignment_22_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9532:1: ( ( ruleMD ) )
            // InternalMyTurtleDsl.g:9533:2: ( ruleMD )
            {
            // InternalMyTurtleDsl.g:9533:2: ( ruleMD )
            // InternalMyTurtleDsl.g:9534:3: ruleMD
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
    // InternalMyTurtleDsl.g:9543:1: rule__Parallele3__AAssignment_23_0 : ( ruleRGRD ) ;
    public final void rule__Parallele3__AAssignment_23_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9547:1: ( ( ruleRGRD ) )
            // InternalMyTurtleDsl.g:9548:2: ( ruleRGRD )
            {
            // InternalMyTurtleDsl.g:9548:2: ( ruleRGRD )
            // InternalMyTurtleDsl.g:9549:3: ruleRGRD
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
    // InternalMyTurtleDsl.g:9558:1: rule__Parallele3__BAssignment_23_2 : ( ruleGDr ) ;
    public final void rule__Parallele3__BAssignment_23_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9562:1: ( ( ruleGDr ) )
            // InternalMyTurtleDsl.g:9563:2: ( ruleGDr )
            {
            // InternalMyTurtleDsl.g:9563:2: ( ruleGDr )
            // InternalMyTurtleDsl.g:9564:3: ruleGDr
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
    // InternalMyTurtleDsl.g:9573:1: rule__Parallele3__CAssignment_23_4 : ( ruleAR ) ;
    public final void rule__Parallele3__CAssignment_23_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9577:1: ( ( ruleAR ) )
            // InternalMyTurtleDsl.g:9578:2: ( ruleAR )
            {
            // InternalMyTurtleDsl.g:9578:2: ( ruleAR )
            // InternalMyTurtleDsl.g:9579:3: ruleAR
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


    // $ANTLR start "rule__Includes__ImportURIAssignment_2"
    // InternalMyTurtleDsl.g:9588:1: rule__Includes__ImportURIAssignment_2 : ( RULE_INCLUDE ) ;
    public final void rule__Includes__ImportURIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9592:1: ( ( RULE_INCLUDE ) )
            // InternalMyTurtleDsl.g:9593:2: ( RULE_INCLUDE )
            {
            // InternalMyTurtleDsl.g:9593:2: ( RULE_INCLUDE )
            // InternalMyTurtleDsl.g:9594:3: RULE_INCLUDE
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


    // $ANTLR start "rule__Monter__DureeAssignment_2"
    // InternalMyTurtleDsl.g:9603:1: rule__Monter__DureeAssignment_2 : ( ruleIntExp ) ;
    public final void rule__Monter__DureeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9607:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9608:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9608:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9609:3: ruleIntExp
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
    // InternalMyTurtleDsl.g:9618:1: rule__Monter__Vitesse_verticaleAssignment_4 : ( ruleIntExp ) ;
    public final void rule__Monter__Vitesse_verticaleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9622:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9623:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9623:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9624:3: ruleIntExp
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
    // InternalMyTurtleDsl.g:9633:1: rule__Descendre__DureeAssignment_2 : ( ruleIntExp ) ;
    public final void rule__Descendre__DureeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9637:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9638:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9638:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9639:3: ruleIntExp
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
    // InternalMyTurtleDsl.g:9648:1: rule__Descendre__Vitesse_verticaleAssignment_4 : ( ruleIntExp ) ;
    public final void rule__Descendre__Vitesse_verticaleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9652:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9653:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9653:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9654:3: ruleIntExp
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
    // InternalMyTurtleDsl.g:9663:1: rule__Avancer__DureeAssignment_2 : ( ruleIntExp ) ;
    public final void rule__Avancer__DureeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9667:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9668:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9668:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9669:3: ruleIntExp
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
    // InternalMyTurtleDsl.g:9678:1: rule__Avancer__Vitesse_deplacementAssignment_4 : ( ruleIntExp ) ;
    public final void rule__Avancer__Vitesse_deplacementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9682:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9683:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9683:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9684:3: ruleIntExp
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
    // InternalMyTurtleDsl.g:9693:1: rule__Reculer__DureeAssignment_2 : ( ruleIntExp ) ;
    public final void rule__Reculer__DureeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9697:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9698:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9698:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9699:3: ruleIntExp
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
    // InternalMyTurtleDsl.g:9708:1: rule__Reculer__Vitesse_deplacementAssignment_4 : ( ruleIntExp ) ;
    public final void rule__Reculer__Vitesse_deplacementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9712:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9713:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9713:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9714:3: ruleIntExp
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
    // InternalMyTurtleDsl.g:9723:1: rule__Gauche__DureeAssignment_2 : ( ruleIntExp ) ;
    public final void rule__Gauche__DureeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9727:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9728:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9728:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9729:3: ruleIntExp
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
    // InternalMyTurtleDsl.g:9738:1: rule__Gauche__Vitesse_deplacementAssignment_4 : ( ruleIntExp ) ;
    public final void rule__Gauche__Vitesse_deplacementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9742:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9743:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9743:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9744:3: ruleIntExp
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
    // InternalMyTurtleDsl.g:9753:1: rule__Droite__DureeAssignment_2 : ( ruleIntExp ) ;
    public final void rule__Droite__DureeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9757:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9758:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9758:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9759:3: ruleIntExp
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
    // InternalMyTurtleDsl.g:9768:1: rule__Droite__Vitesse_deplacementAssignment_4 : ( ruleIntExp ) ;
    public final void rule__Droite__Vitesse_deplacementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9772:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9773:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9773:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9774:3: ruleIntExp
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
    // InternalMyTurtleDsl.g:9783:1: rule__Pause__DureeAssignment_2 : ( ruleIntExp ) ;
    public final void rule__Pause__DureeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9787:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9788:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9788:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9789:3: ruleIntExp
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
    // InternalMyTurtleDsl.g:9798:1: rule__RotationGauche__DureeAssignment_2 : ( ruleIntExp ) ;
    public final void rule__RotationGauche__DureeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9802:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9803:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9803:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9804:3: ruleIntExp
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
    // InternalMyTurtleDsl.g:9813:1: rule__RotationGauche__Vitesse_rotationAssignment_4 : ( ruleIntExp ) ;
    public final void rule__RotationGauche__Vitesse_rotationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9817:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9818:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9818:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9819:3: ruleIntExp
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
    // InternalMyTurtleDsl.g:9828:1: rule__RotationDroite__DureeAssignment_2 : ( ruleIntExp ) ;
    public final void rule__RotationDroite__DureeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9832:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9833:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9833:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9834:3: ruleIntExp
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
    // InternalMyTurtleDsl.g:9843:1: rule__RotationDroite__Vitesse_rotationAssignment_4 : ( ruleIntExp ) ;
    public final void rule__RotationDroite__Vitesse_rotationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9847:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9848:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9848:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9849:3: ruleIntExp
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
    // InternalMyTurtleDsl.g:9858:1: rule__FonctionDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FonctionDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9862:1: ( ( RULE_ID ) )
            // InternalMyTurtleDsl.g:9863:2: ( RULE_ID )
            {
            // InternalMyTurtleDsl.g:9863:2: ( RULE_ID )
            // InternalMyTurtleDsl.g:9864:3: RULE_ID
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
    // InternalMyTurtleDsl.g:9873:1: rule__FonctionDecl__BodyAssignment_5 : ( ruleStatement ) ;
    public final void rule__FonctionDecl__BodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9877:1: ( ( ruleStatement ) )
            // InternalMyTurtleDsl.g:9878:2: ( ruleStatement )
            {
            // InternalMyTurtleDsl.g:9878:2: ( ruleStatement )
            // InternalMyTurtleDsl.g:9879:3: ruleStatement
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
    // InternalMyTurtleDsl.g:9888:1: rule__IntConstante__ValAssignment : ( RULE_INT ) ;
    public final void rule__IntConstante__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9892:1: ( ( RULE_INT ) )
            // InternalMyTurtleDsl.g:9893:2: ( RULE_INT )
            {
            // InternalMyTurtleDsl.g:9893:2: ( RULE_INT )
            // InternalMyTurtleDsl.g:9894:3: RULE_INT
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
    // InternalMyTurtleDsl.g:9903:1: rule__IntDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__IntDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9907:1: ( ( RULE_ID ) )
            // InternalMyTurtleDsl.g:9908:2: ( RULE_ID )
            {
            // InternalMyTurtleDsl.g:9908:2: ( RULE_ID )
            // InternalMyTurtleDsl.g:9909:3: RULE_ID
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
    // InternalMyTurtleDsl.g:9918:1: rule__IntDecl__ValAssignment_3 : ( ruleIntExp ) ;
    public final void rule__IntDecl__ValAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9922:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9923:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9923:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9924:3: ruleIntExp
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
    // InternalMyTurtleDsl.g:9933:1: rule__PourcentDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PourcentDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9937:1: ( ( RULE_ID ) )
            // InternalMyTurtleDsl.g:9938:2: ( RULE_ID )
            {
            // InternalMyTurtleDsl.g:9938:2: ( RULE_ID )
            // InternalMyTurtleDsl.g:9939:3: RULE_ID
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
    // InternalMyTurtleDsl.g:9948:1: rule__PourcentDecl__ValAssignment_3 : ( ruleIntExp ) ;
    public final void rule__PourcentDecl__ValAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9952:1: ( ( ruleIntExp ) )
            // InternalMyTurtleDsl.g:9953:2: ( ruleIntExp )
            {
            // InternalMyTurtleDsl.g:9953:2: ( ruleIntExp )
            // InternalMyTurtleDsl.g:9954:3: ruleIntExp
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
    // InternalMyTurtleDsl.g:9963:1: rule__RefIntVar__VarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__RefIntVar__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9967:1: ( ( ( RULE_ID ) ) )
            // InternalMyTurtleDsl.g:9968:2: ( ( RULE_ID ) )
            {
            // InternalMyTurtleDsl.g:9968:2: ( ( RULE_ID ) )
            // InternalMyTurtleDsl.g:9969:3: ( RULE_ID )
            {
             before(grammarAccess.getRefIntVarAccess().getVarIntDeclCrossReference_0()); 
            // InternalMyTurtleDsl.g:9970:3: ( RULE_ID )
            // InternalMyTurtleDsl.g:9971:4: RULE_ID
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
    // InternalMyTurtleDsl.g:9982:1: rule__FonctionCall__FuncAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FonctionCall__FuncAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyTurtleDsl.g:9986:1: ( ( ( RULE_ID ) ) )
            // InternalMyTurtleDsl.g:9987:2: ( ( RULE_ID ) )
            {
            // InternalMyTurtleDsl.g:9987:2: ( ( RULE_ID ) )
            // InternalMyTurtleDsl.g:9988:3: ( RULE_ID )
            {
             before(grammarAccess.getFonctionCallAccess().getFuncFonctionDeclCrossReference_0_0()); 
            // InternalMyTurtleDsl.g:9989:3: ( RULE_ID )
            // InternalMyTurtleDsl.g:9990:4: RULE_ID
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

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    static final String dfa_1s = "\106\uffff";
    static final String dfa_2s = "\1\5\2\uffff\10\26\1\uffff\10\5\10\32\2\27\6\32\5\5\1\uffff\3\5\20\27\10\5\1\uffff";
    static final String dfa_3s = "\1\44\2\uffff\10\26\1\uffff\10\6\20\32\5\6\1\uffff\3\6\20\27\10\44\1\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\10\uffff\1\4\35\uffff\1\3\33\uffff\1\5";
    static final String dfa_5s = "\106\uffff}>";
    static final String[] dfa_6s = {
            "\1\13\23\uffff\1\12\1\uffff\1\4\1\3\1\11\1\10\1\7\1\6\1\5\1\1\1\uffff\1\2",
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
            "\1\51\6\uffff\1\51\4\uffff\1\105\6\uffff\2\51\1\uffff\10\51\1\uffff\1\51",
            "\1\51\6\uffff\1\51\4\uffff\1\105\6\uffff\2\51\1\uffff\10\51\1\uffff\1\51",
            "\1\51\6\uffff\1\51\4\uffff\1\105\6\uffff\2\51\1\uffff\10\51\1\uffff\1\51",
            "\1\51\6\uffff\1\51\4\uffff\1\105\6\uffff\2\51\1\uffff\10\51\1\uffff\1\51",
            "\1\51\6\uffff\1\51\4\uffff\1\105\6\uffff\2\51\1\uffff\10\51\1\uffff\1\51",
            "\1\51\6\uffff\1\51\4\uffff\1\105\6\uffff\2\51\1\uffff\10\51\1\uffff\1\51",
            "\1\51\6\uffff\1\51\4\uffff\1\105\6\uffff\2\51\1\uffff\10\51\1\uffff\1\51",
            "\1\51\6\uffff\1\51\4\uffff\1\105\6\uffff\2\51\1\uffff\10\51\1\uffff\1\51",
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
            return "777:1: rule__Model__Alternatives_7 : ( ( ( rule__Model__SeconDecAssignment_7_0 ) ) | ( ( rule__Model__PourDecAssignment_7_1 ) ) | ( ( rule__Model__StatementsAssignment_7_2 ) ) | ( ( rule__Model__FonctionsAssignment_7_3 ) ) | ( ( rule__Model__ParalleleAssignment_7_4 ) ) );";
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
            "\1\111\1\112\1\105\1\106\1\107\1\110",
            "\1\115\1\uffff\1\116\1\117\1\120\2\uffff\1\113\1\114",
            "\1\125\1\uffff\1\126\1\121\1\122\1\123\1\124",
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
            return "816:1: rule__Model__ParalleleAlternatives_7_4_0 : ( ( ruleParallele2 ) | ( ruleParallele3 ) );";
        }
    }
    static final String dfa_13s = "\121\uffff";
    static final String dfa_14s = "\1\31\10\26\10\5\20\32\10\5\20\27\10\21\1\34\3\31\14\uffff";
    static final String dfa_15s = "\1\41\10\26\10\6\20\32\10\6\20\27\10\21\2\41\1\37\1\41\14\uffff";
    static final String dfa_16s = "\105\uffff\1\3\1\2\1\1\1\6\1\5\1\4\1\11\1\10\1\7\1\13\1\12\1\14";
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
            "\2\106\2\107\2\105",
            "\1\111\1\uffff\1\111\2\112\2\uffff\2\110",
            "\1\115\1\uffff\1\115\2\114\2\113",
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

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "921:1: rule__Parallele2__Alternatives : ( ( ( rule__Parallele2__Group_0__0 ) ) | ( ( rule__Parallele2__Group_1__0 ) ) | ( ( rule__Parallele2__Group_2__0 ) ) | ( ( rule__Parallele2__Group_3__0 ) ) | ( ( rule__Parallele2__Group_4__0 ) ) | ( ( rule__Parallele2__Group_5__0 ) ) | ( ( rule__Parallele2__Group_6__0 ) ) | ( ( rule__Parallele2__Group_7__0 ) ) | ( ( rule__Parallele2__Group_8__0 ) ) | ( ( rule__Parallele2__Group_9__0 ) ) | ( ( rule__Parallele2__Group_10__0 ) ) | ( ( rule__Parallele2__Group_11__0 ) ) );";
        }
    }
    static final String dfa_19s = "\u0129\uffff";
    static final String dfa_20s = "\1\31\10\26\10\5\20\32\10\5\20\27\10\21\2\31\1\34\1\31\30\26\30\5\60\32\30\5\60\27\30\21\1\31\1\36\2\31\1\34\1\31\1\34\1\36\1\34\1\31\1\34\1\31\30\uffff";
    static final String dfa_21s = "\1\41\10\26\10\6\20\32\10\6\20\27\10\21\3\41\1\37\30\26\30\6\60\32\30\6\60\27\30\21\1\37\2\41\1\35\4\41\1\37\1\35\2\37\30\uffff";
    static final String dfa_22s = "\u0111\uffff\1\5\1\6\1\4\1\3\1\1\1\2\1\13\1\14\1\12\1\11\1\7\1\10\1\17\1\20\1\15\1\16\1\21\1\22\1\27\1\30\1\25\1\26\1\24\1\23";
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
            "\1\107\1\uffff\1\110\2\uffff\1\111\1\112\1\105\1\106",
            "\1\115\1\uffff\1\116\1\117\1\120\2\uffff\1\113\1\114",
            "\1\123\1\124\1\121\1\122\1\125\1\126",
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
            "\1\u0111\1\uffff\1\u0111\2\uffff\2\u0112",
            "\2\u0114\2\u0113",
            "\1\u0115\1\uffff\1\u0115\4\uffff\2\u0116",
            "\1\u0118\1\uffff\1\u0118\2\u0117",
            "\2\u011a\2\uffff\2\u0119",
            "\1\u011b\1\uffff\1\u011b\4\uffff\2\u011c",
            "\2\u011d\2\uffff\2\u011e",
            "\2\u011f\2\u0120",
            "\2\u0122\2\u0121",
            "\1\u0123\1\uffff\1\u0123\2\u0124",
            "\2\u0125\2\u0126",
            "\1\u0128\1\uffff\1\u0128\2\uffff\2\u0127",
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

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_19;
            this.eof = dfa_19;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "1002:1: rule__Parallele3__Alternatives : ( ( ( rule__Parallele3__Group_0__0 ) ) | ( ( rule__Parallele3__Group_1__0 ) ) | ( ( rule__Parallele3__Group_2__0 ) ) | ( ( rule__Parallele3__Group_3__0 ) ) | ( ( rule__Parallele3__Group_4__0 ) ) | ( ( rule__Parallele3__Group_5__0 ) ) | ( ( rule__Parallele3__Group_6__0 ) ) | ( ( rule__Parallele3__Group_7__0 ) ) | ( ( rule__Parallele3__Group_8__0 ) ) | ( ( rule__Parallele3__Group_9__0 ) ) | ( ( rule__Parallele3__Group_10__0 ) ) | ( ( rule__Parallele3__Group_11__0 ) ) | ( ( rule__Parallele3__Group_12__0 ) ) | ( ( rule__Parallele3__Group_13__0 ) ) | ( ( rule__Parallele3__Group_14__0 ) ) | ( ( rule__Parallele3__Group_15__0 ) ) | ( ( rule__Parallele3__Group_16__0 ) ) | ( ( rule__Parallele3__Group_17__0 ) ) | ( ( rule__Parallele3__Group_18__0 ) ) | ( ( rule__Parallele3__Group_19__0 ) ) | ( ( rule__Parallele3__Group_20__0 ) ) | ( ( rule__Parallele3__Group_21__0 ) ) | ( ( rule__Parallele3__Group_22__0 ) ) | ( ( rule__Parallele3__Group_23__0 ) ) );";
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

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_25;
            this.eof = dfa_25;
            this.min = dfa_26;
            this.max = dfa_27;
            this.accept = dfa_28;
            this.special = dfa_29;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "1155:1: rule__Statement__Alternatives : ( ( ruleAvancer ) | ( ruleDescendre ) | ( ruleRotationDroite ) | ( ruleRotationGauche ) | ( rulePause ) | ( ruleDroite ) | ( ruleGauche ) | ( ruleReculer ) | ( ruleMonter ) );";
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
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000017FB001020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000017FA000022L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000003FA000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000003FA001000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000003FA000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});

}