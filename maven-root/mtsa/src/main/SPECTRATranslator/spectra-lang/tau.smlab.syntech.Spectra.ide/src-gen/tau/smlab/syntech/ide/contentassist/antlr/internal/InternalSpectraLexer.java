package tau.smlab.syntech.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpectraLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=5;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=7;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators

    public InternalSpectraLexer() {;} 
    public InternalSpectraLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSpectraLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSpectra.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:11:7: ( ';' )
            // InternalSpectra.g:11:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:12:7: ( 'module' )
            // InternalSpectra.g:12:9: 'module'
            {
            match("module"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:13:7: ( 'spec' )
            // InternalSpectra.g:13:9: 'spec'
            {
            match("spec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:14:7: ( 'ini' )
            // InternalSpectra.g:14:9: 'ini'
            {
            match("ini"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:15:7: ( 'initially' )
            // InternalSpectra.g:15:9: 'initially'
            {
            match("initially"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:16:7: ( 'G' )
            // InternalSpectra.g:16:9: 'G'
            {
            match('G'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:17:7: ( 'trans' )
            // InternalSpectra.g:17:9: 'trans'
            {
            match("trans"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:18:7: ( 'always' )
            // InternalSpectra.g:18:9: 'always'
            {
            match("always"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:19:7: ( 'alw' )
            // InternalSpectra.g:19:9: 'alw'
            {
            match("alw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:20:7: ( 'GF' )
            // InternalSpectra.g:20:9: 'GF'
            {
            match("GF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:21:7: ( 'alwEv' )
            // InternalSpectra.g:21:9: 'alwEv'
            {
            match("alwEv"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:22:7: ( 'alwaysEventually' )
            // InternalSpectra.g:22:9: 'alwaysEventually'
            {
            match("alwaysEventually"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:23:7: ( '()' )
            // InternalSpectra.g:23:9: '()'
            {
            match("()"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:24:7: ( 'guarantee' )
            // InternalSpectra.g:24:9: 'guarantee'
            {
            match("guarantee"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:25:7: ( 'gar' )
            // InternalSpectra.g:25:9: 'gar'
            {
            match("gar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:26:7: ( 'assumption' )
            // InternalSpectra.g:26:9: 'assumption'
            {
            match("assumption"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:27:7: ( 'asm' )
            // InternalSpectra.g:27:9: 'asm'
            {
            match("asm"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:28:7: ( '->' )
            // InternalSpectra.g:28:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:29:7: ( 'implies' )
            // InternalSpectra.g:29:9: 'implies'
            {
            match("implies"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:30:7: ( '<->' )
            // InternalSpectra.g:30:9: '<->'
            {
            match("<->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:31:7: ( 'iff' )
            // InternalSpectra.g:31:9: 'iff'
            {
            match("iff"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:32:7: ( '|' )
            // InternalSpectra.g:32:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:33:7: ( 'or' )
            // InternalSpectra.g:33:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:34:7: ( 'xor' )
            // InternalSpectra.g:34:9: 'xor'
            {
            match("xor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:35:7: ( '&' )
            // InternalSpectra.g:35:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:36:7: ( 'and' )
            // InternalSpectra.g:36:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:37:7: ( '=' )
            // InternalSpectra.g:37:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:38:7: ( '!=' )
            // InternalSpectra.g:38:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:39:7: ( '<' )
            // InternalSpectra.g:39:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:40:7: ( '>' )
            // InternalSpectra.g:40:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:41:7: ( '<=' )
            // InternalSpectra.g:41:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:42:7: ( '>=' )
            // InternalSpectra.g:42:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:43:7: ( 'mod' )
            // InternalSpectra.g:43:9: 'mod'
            {
            match("mod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:44:7: ( '%' )
            // InternalSpectra.g:44:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:45:7: ( '+' )
            // InternalSpectra.g:45:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:46:7: ( '-' )
            // InternalSpectra.g:46:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:47:7: ( '*' )
            // InternalSpectra.g:47:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:48:7: ( '/' )
            // InternalSpectra.g:48:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:49:7: ( 'S' )
            // InternalSpectra.g:49:9: 'S'
            {
            match('S'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:50:7: ( 'SINCE' )
            // InternalSpectra.g:50:9: 'SINCE'
            {
            match("SINCE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:51:7: ( 'T' )
            // InternalSpectra.g:51:9: 'T'
            {
            match('T'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:52:7: ( 'TRIGGERED' )
            // InternalSpectra.g:52:9: 'TRIGGERED'
            {
            match("TRIGGERED"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:53:7: ( 'Y' )
            // InternalSpectra.g:53:9: 'Y'
            {
            match('Y'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:54:7: ( 'PREV' )
            // InternalSpectra.g:54:9: 'PREV'
            {
            match("PREV"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:55:7: ( 'H' )
            // InternalSpectra.g:55:9: 'H'
            {
            match('H'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:56:7: ( 'HISTORICALLY' )
            // InternalSpectra.g:56:9: 'HISTORICALLY'
            {
            match("HISTORICALLY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:57:7: ( 'O' )
            // InternalSpectra.g:57:9: 'O'
            {
            match('O'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:58:7: ( 'ONCE' )
            // InternalSpectra.g:58:9: 'ONCE'
            {
            match("ONCE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:59:7: ( '!' )
            // InternalSpectra.g:59:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:60:7: ( 'TRUE' )
            // InternalSpectra.g:60:9: 'TRUE'
            {
            match("TRUE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:61:7: ( 'FALSE' )
            // InternalSpectra.g:61:9: 'FALSE'
            {
            match("FALSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:62:7: ( 'true' )
            // InternalSpectra.g:62:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:63:7: ( 'false' )
            // InternalSpectra.g:63:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:64:7: ( 'forall' )
            // InternalSpectra.g:64:9: 'forall'
            {
            match("forall"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:65:7: ( 'exists' )
            // InternalSpectra.g:65:9: 'exists'
            {
            match("exists"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:66:7: ( 'output' )
            // InternalSpectra.g:66:9: 'output'
            {
            match("output"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:67:7: ( 'out' )
            // InternalSpectra.g:67:9: 'out'
            {
            match("out"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:68:7: ( 'sysvar' )
            // InternalSpectra.g:68:9: 'sysvar'
            {
            match("sysvar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:69:7: ( 'sys' )
            // InternalSpectra.g:69:9: 'sys'
            {
            match("sys"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:70:7: ( 'input' )
            // InternalSpectra.g:70:9: 'input'
            {
            match("input"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:71:7: ( 'in' )
            // InternalSpectra.g:71:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:72:7: ( 'envvar' )
            // InternalSpectra.g:72:9: 'envvar'
            {
            match("envvar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:73:7: ( 'env' )
            // InternalSpectra.g:73:9: 'env'
            {
            match("env"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:74:7: ( 'auxvar' )
            // InternalSpectra.g:74:9: 'auxvar'
            {
            match("auxvar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:75:7: ( 'aux' )
            // InternalSpectra.g:75:9: 'aux'
            {
            match("aux"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:76:7: ( 'keep' )
            // InternalSpectra.g:76:9: 'keep'
            {
            match("keep"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:77:7: ( 'modulo' )
            // InternalSpectra.g:77:9: 'modulo'
            {
            match("modulo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:78:7: ( 'import' )
            // InternalSpectra.g:78:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:79:7: ( 'weight' )
            // InternalSpectra.g:79:9: 'weight'
            {
            match("weight"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:80:7: ( ':' )
            // InternalSpectra.g:80:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:81:7: ( 'type' )
            // InternalSpectra.g:81:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:82:7: ( 'define' )
            // InternalSpectra.g:82:9: 'define'
            {
            match("define"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:83:7: ( ':=' )
            // InternalSpectra.g:83:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:84:7: ( '[' )
            // InternalSpectra.g:84:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:85:7: ( ']' )
            // InternalSpectra.g:85:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:86:7: ( '{' )
            // InternalSpectra.g:86:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:87:7: ( '}' )
            // InternalSpectra.g:87:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:88:7: ( ',' )
            // InternalSpectra.g:88:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:89:7: ( 'regexp' )
            // InternalSpectra.g:89:9: 'regexp'
            {
            match("regexp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:90:7: ( 'counter' )
            // InternalSpectra.g:90:9: 'counter'
            {
            match("counter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:91:7: ( '(' )
            // InternalSpectra.g:91:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:92:7: ( ')' )
            // InternalSpectra.g:92:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:93:7: ( 'reset:' )
            // InternalSpectra.g:93:9: 'reset:'
            {
            match("reset:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:94:7: ( 'inc:' )
            // InternalSpectra.g:94:9: 'inc:'
            {
            match("inc:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:95:7: ( 'dec:' )
            // InternalSpectra.g:95:9: 'dec:'
            {
            match("dec:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:96:7: ( 'overflow:' )
            // InternalSpectra.g:96:9: 'overflow:'
            {
            match("overflow:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:97:7: ( 'underflow:' )
            // InternalSpectra.g:97:9: 'underflow:'
            {
            match("underflow:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:98:7: ( 'monitor' )
            // InternalSpectra.g:98:9: 'monitor'
            {
            match("monitor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:99:7: ( 'pattern' )
            // InternalSpectra.g:99:9: 'pattern'
            {
            match("pattern"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:100:8: ( 'var' )
            // InternalSpectra.g:100:10: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:101:8: ( 'predicate' )
            // InternalSpectra.g:101:10: 'predicate'
            {
            match("predicate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:102:8: ( 'Int' )
            // InternalSpectra.g:102:10: 'Int'
            {
            match("Int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:103:8: ( 'GE' )
            // InternalSpectra.g:103:10: 'GE'
            {
            match("GE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:104:8: ( 'GEF' )
            // InternalSpectra.g:104:10: 'GEF'
            {
            match("GEF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:105:8: ( '..' )
            // InternalSpectra.g:105:10: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:106:8: ( 'trig' )
            // InternalSpectra.g:106:10: 'trig'
            {
            match("trig"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:107:8: ( '|=>' )
            // InternalSpectra.g:107:10: '|=>'
            {
            match("|=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:108:8: ( '.' )
            // InternalSpectra.g:108:10: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:109:8: ( 'boolean' )
            // InternalSpectra.g:109:10: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:110:8: ( 'not' )
            // InternalSpectra.g:110:10: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:111:8: ( 'next' )
            // InternalSpectra.g:111:10: 'next'
            {
            match("next"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:112:8: ( '.all' )
            // InternalSpectra.g:112:10: '.all'
            {
            match(".all"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:113:8: ( '.any' )
            // InternalSpectra.g:113:10: '.any'
            {
            match(".any"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:114:8: ( '.prod' )
            // InternalSpectra.g:114:10: '.prod'
            {
            match(".prod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:115:8: ( '.sum' )
            // InternalSpectra.g:115:10: '.sum'
            {
            match(".sum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:116:8: ( '.min' )
            // InternalSpectra.g:116:10: '.min'
            {
            match(".min"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:117:8: ( '.max' )
            // InternalSpectra.g:117:10: '.max'
            {
            match(".max"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:118:8: ( '?' )
            // InternalSpectra.g:118:10: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:119:8: ( '~' )
            // InternalSpectra.g:119:10: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:15718:17: ( ( '//' | '--' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSpectra.g:15718:19: ( '//' | '--' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            // InternalSpectra.g:15718:19: ( '//' | '--' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='/') ) {
                alt1=1;
            }
            else if ( (LA1_0=='-') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSpectra.g:15718:20: '//'
                    {
                    match("//"); 


                    }
                    break;
                case 2 :
                    // InternalSpectra.g:15718:25: '--'
                    {
                    match("--"); 


                    }
                    break;

            }

            // InternalSpectra.g:15718:31: (~ ( ( '\\n' | '\\r' ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSpectra.g:15718:31: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalSpectra.g:15718:47: ( ( '\\r' )? '\\n' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\n'||LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSpectra.g:15718:48: ( '\\r' )? '\\n'
                    {
                    // InternalSpectra.g:15718:48: ( '\\r' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='\r') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalSpectra.g:15718:48: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:15720:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSpectra.g:15720:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSpectra.g:15720:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSpectra.g:15720:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalSpectra.g:15720:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSpectra.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:15722:10: ( ( '0' .. '9' )+ )
            // InternalSpectra.g:15722:12: ( '0' .. '9' )+
            {
            // InternalSpectra.g:15722:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSpectra.g:15722:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:15724:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSpectra.g:15724:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSpectra.g:15724:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSpectra.g:15724:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSpectra.g:15724:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalSpectra.g:15724:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSpectra.g:15724:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalSpectra.g:15724:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSpectra.g:15724:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalSpectra.g:15724:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSpectra.g:15724:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:15726:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSpectra.g:15726:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSpectra.g:15726:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSpectra.g:15726:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:15728:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSpectra.g:15728:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSpectra.g:15728:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSpectra.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSpectra.g:15730:16: ( . )
            // InternalSpectra.g:15730:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalSpectra.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=116;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalSpectra.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalSpectra.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalSpectra.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalSpectra.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalSpectra.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalSpectra.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalSpectra.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalSpectra.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalSpectra.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalSpectra.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalSpectra.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalSpectra.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalSpectra.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalSpectra.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalSpectra.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalSpectra.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalSpectra.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalSpectra.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalSpectra.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalSpectra.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalSpectra.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalSpectra.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalSpectra.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalSpectra.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalSpectra.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalSpectra.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalSpectra.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // InternalSpectra.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // InternalSpectra.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // InternalSpectra.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // InternalSpectra.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // InternalSpectra.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // InternalSpectra.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // InternalSpectra.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // InternalSpectra.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // InternalSpectra.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // InternalSpectra.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // InternalSpectra.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // InternalSpectra.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // InternalSpectra.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // InternalSpectra.g:1:250: T__51
                {
                mT__51(); 

                }
                break;
            case 42 :
                // InternalSpectra.g:1:256: T__52
                {
                mT__52(); 

                }
                break;
            case 43 :
                // InternalSpectra.g:1:262: T__53
                {
                mT__53(); 

                }
                break;
            case 44 :
                // InternalSpectra.g:1:268: T__54
                {
                mT__54(); 

                }
                break;
            case 45 :
                // InternalSpectra.g:1:274: T__55
                {
                mT__55(); 

                }
                break;
            case 46 :
                // InternalSpectra.g:1:280: T__56
                {
                mT__56(); 

                }
                break;
            case 47 :
                // InternalSpectra.g:1:286: T__57
                {
                mT__57(); 

                }
                break;
            case 48 :
                // InternalSpectra.g:1:292: T__58
                {
                mT__58(); 

                }
                break;
            case 49 :
                // InternalSpectra.g:1:298: T__59
                {
                mT__59(); 

                }
                break;
            case 50 :
                // InternalSpectra.g:1:304: T__60
                {
                mT__60(); 

                }
                break;
            case 51 :
                // InternalSpectra.g:1:310: T__61
                {
                mT__61(); 

                }
                break;
            case 52 :
                // InternalSpectra.g:1:316: T__62
                {
                mT__62(); 

                }
                break;
            case 53 :
                // InternalSpectra.g:1:322: T__63
                {
                mT__63(); 

                }
                break;
            case 54 :
                // InternalSpectra.g:1:328: T__64
                {
                mT__64(); 

                }
                break;
            case 55 :
                // InternalSpectra.g:1:334: T__65
                {
                mT__65(); 

                }
                break;
            case 56 :
                // InternalSpectra.g:1:340: T__66
                {
                mT__66(); 

                }
                break;
            case 57 :
                // InternalSpectra.g:1:346: T__67
                {
                mT__67(); 

                }
                break;
            case 58 :
                // InternalSpectra.g:1:352: T__68
                {
                mT__68(); 

                }
                break;
            case 59 :
                // InternalSpectra.g:1:358: T__69
                {
                mT__69(); 

                }
                break;
            case 60 :
                // InternalSpectra.g:1:364: T__70
                {
                mT__70(); 

                }
                break;
            case 61 :
                // InternalSpectra.g:1:370: T__71
                {
                mT__71(); 

                }
                break;
            case 62 :
                // InternalSpectra.g:1:376: T__72
                {
                mT__72(); 

                }
                break;
            case 63 :
                // InternalSpectra.g:1:382: T__73
                {
                mT__73(); 

                }
                break;
            case 64 :
                // InternalSpectra.g:1:388: T__74
                {
                mT__74(); 

                }
                break;
            case 65 :
                // InternalSpectra.g:1:394: T__75
                {
                mT__75(); 

                }
                break;
            case 66 :
                // InternalSpectra.g:1:400: T__76
                {
                mT__76(); 

                }
                break;
            case 67 :
                // InternalSpectra.g:1:406: T__77
                {
                mT__77(); 

                }
                break;
            case 68 :
                // InternalSpectra.g:1:412: T__78
                {
                mT__78(); 

                }
                break;
            case 69 :
                // InternalSpectra.g:1:418: T__79
                {
                mT__79(); 

                }
                break;
            case 70 :
                // InternalSpectra.g:1:424: T__80
                {
                mT__80(); 

                }
                break;
            case 71 :
                // InternalSpectra.g:1:430: T__81
                {
                mT__81(); 

                }
                break;
            case 72 :
                // InternalSpectra.g:1:436: T__82
                {
                mT__82(); 

                }
                break;
            case 73 :
                // InternalSpectra.g:1:442: T__83
                {
                mT__83(); 

                }
                break;
            case 74 :
                // InternalSpectra.g:1:448: T__84
                {
                mT__84(); 

                }
                break;
            case 75 :
                // InternalSpectra.g:1:454: T__85
                {
                mT__85(); 

                }
                break;
            case 76 :
                // InternalSpectra.g:1:460: T__86
                {
                mT__86(); 

                }
                break;
            case 77 :
                // InternalSpectra.g:1:466: T__87
                {
                mT__87(); 

                }
                break;
            case 78 :
                // InternalSpectra.g:1:472: T__88
                {
                mT__88(); 

                }
                break;
            case 79 :
                // InternalSpectra.g:1:478: T__89
                {
                mT__89(); 

                }
                break;
            case 80 :
                // InternalSpectra.g:1:484: T__90
                {
                mT__90(); 

                }
                break;
            case 81 :
                // InternalSpectra.g:1:490: T__91
                {
                mT__91(); 

                }
                break;
            case 82 :
                // InternalSpectra.g:1:496: T__92
                {
                mT__92(); 

                }
                break;
            case 83 :
                // InternalSpectra.g:1:502: T__93
                {
                mT__93(); 

                }
                break;
            case 84 :
                // InternalSpectra.g:1:508: T__94
                {
                mT__94(); 

                }
                break;
            case 85 :
                // InternalSpectra.g:1:514: T__95
                {
                mT__95(); 

                }
                break;
            case 86 :
                // InternalSpectra.g:1:520: T__96
                {
                mT__96(); 

                }
                break;
            case 87 :
                // InternalSpectra.g:1:526: T__97
                {
                mT__97(); 

                }
                break;
            case 88 :
                // InternalSpectra.g:1:532: T__98
                {
                mT__98(); 

                }
                break;
            case 89 :
                // InternalSpectra.g:1:538: T__99
                {
                mT__99(); 

                }
                break;
            case 90 :
                // InternalSpectra.g:1:544: T__100
                {
                mT__100(); 

                }
                break;
            case 91 :
                // InternalSpectra.g:1:551: T__101
                {
                mT__101(); 

                }
                break;
            case 92 :
                // InternalSpectra.g:1:558: T__102
                {
                mT__102(); 

                }
                break;
            case 93 :
                // InternalSpectra.g:1:565: T__103
                {
                mT__103(); 

                }
                break;
            case 94 :
                // InternalSpectra.g:1:572: T__104
                {
                mT__104(); 

                }
                break;
            case 95 :
                // InternalSpectra.g:1:579: T__105
                {
                mT__105(); 

                }
                break;
            case 96 :
                // InternalSpectra.g:1:586: T__106
                {
                mT__106(); 

                }
                break;
            case 97 :
                // InternalSpectra.g:1:593: T__107
                {
                mT__107(); 

                }
                break;
            case 98 :
                // InternalSpectra.g:1:600: T__108
                {
                mT__108(); 

                }
                break;
            case 99 :
                // InternalSpectra.g:1:607: T__109
                {
                mT__109(); 

                }
                break;
            case 100 :
                // InternalSpectra.g:1:614: T__110
                {
                mT__110(); 

                }
                break;
            case 101 :
                // InternalSpectra.g:1:621: T__111
                {
                mT__111(); 

                }
                break;
            case 102 :
                // InternalSpectra.g:1:628: T__112
                {
                mT__112(); 

                }
                break;
            case 103 :
                // InternalSpectra.g:1:635: T__113
                {
                mT__113(); 

                }
                break;
            case 104 :
                // InternalSpectra.g:1:642: T__114
                {
                mT__114(); 

                }
                break;
            case 105 :
                // InternalSpectra.g:1:649: T__115
                {
                mT__115(); 

                }
                break;
            case 106 :
                // InternalSpectra.g:1:656: T__116
                {
                mT__116(); 

                }
                break;
            case 107 :
                // InternalSpectra.g:1:663: T__117
                {
                mT__117(); 

                }
                break;
            case 108 :
                // InternalSpectra.g:1:670: T__118
                {
                mT__118(); 

                }
                break;
            case 109 :
                // InternalSpectra.g:1:677: T__119
                {
                mT__119(); 

                }
                break;
            case 110 :
                // InternalSpectra.g:1:684: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 111 :
                // InternalSpectra.g:1:700: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 112 :
                // InternalSpectra.g:1:708: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 113 :
                // InternalSpectra.g:1:717: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 114 :
                // InternalSpectra.g:1:729: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 115 :
                // InternalSpectra.g:1:745: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 116 :
                // InternalSpectra.g:1:753: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\2\uffff\3\76\1\106\2\76\1\116\1\76\1\123\1\126\1\130\2\76\2\uffff\1\140\1\142\3\uffff\1\147\1\151\1\153\1\154\1\76\1\157\1\161\5\76\1\172\1\76\5\uffff\2\76\1\uffff\4\76\1\u008e\2\76\2\uffff\1\73\2\uffff\2\73\3\uffff\1\76\1\uffff\2\76\1\u009e\2\76\1\u00a1\1\u00a3\1\uffff\6\76\2\uffff\2\76\10\uffff\1\u00af\3\76\13\uffff\1\76\1\uffff\1\76\2\uffff\2\76\1\uffff\1\76\1\uffff\7\76\2\uffff\1\76\5\uffff\2\76\1\uffff\5\76\6\uffff\3\76\5\uffff\1\u00d2\2\76\1\u00d6\1\u00d8\2\76\1\uffff\1\76\1\u00dd\1\uffff\1\u00de\1\uffff\4\76\1\u00e5\1\76\1\u00e7\1\u00e8\1\u00ea\1\76\1\u00ec\1\uffff\1\u00ee\1\76\1\u00f0\12\76\1\u00fc\12\76\1\u0107\1\u0108\4\uffff\1\76\1\u010a\2\76\1\uffff\1\76\1\u010e\1\76\1\uffff\1\76\1\uffff\1\76\1\uffff\2\76\2\uffff\1\76\1\u0115\1\u0116\1\u0117\2\76\1\uffff\1\76\2\uffff\1\76\1\uffff\1\76\1\uffff\1\76\1\uffff\1\76\1\uffff\2\76\1\u0121\1\u0122\1\76\1\u0124\5\76\1\uffff\1\u012a\2\76\1\uffff\6\76\2\uffff\1\76\1\uffff\1\u0134\2\76\1\uffff\2\76\1\u013a\2\76\1\u013d\3\uffff\1\76\1\u013f\5\76\1\u0145\1\76\2\uffff\1\76\1\uffff\1\u0148\1\u0149\3\76\1\uffff\11\76\1\uffff\1\u0156\1\u0157\1\76\1\u0159\1\76\1\uffff\1\76\1\u015c\1\uffff\1\u015e\1\uffff\1\76\1\u0160\1\76\1\u0162\1\76\1\uffff\2\76\2\uffff\1\u0166\1\u0167\1\u0168\1\u0169\1\u016a\1\u016b\1\uffff\5\76\2\uffff\1\u0171\1\uffff\1\76\1\u0173\1\uffff\1\76\1\uffff\1\76\1\uffff\1\76\1\uffff\3\76\6\uffff\1\u017a\1\76\1\u017c\1\76\1\u017e\1\uffff\1\76\1\uffff\6\76\1\uffff\1\76\1\uffff\1\76\1\uffff\1\u0188\2\76\1\u018b\1\uffff\1\u018c\2\76\1\u018f\1\uffff\1\76\1\u0191\2\uffff\1\76\2\uffff\1\76\1\uffff\2\76\1\u0196\1\76\1\uffff\2\76\1\u019a\1\uffff";
    static final String DFA13_eofS =
        "\u019b\uffff";
    static final String DFA13_minS =
        "\1\0\1\uffff\1\157\1\160\1\146\1\60\1\162\1\154\1\51\1\141\2\55\1\75\1\162\1\157\2\uffff\2\75\3\uffff\1\52\3\60\1\122\2\60\1\101\1\141\1\156\2\145\1\75\1\145\5\uffff\1\145\1\157\1\uffff\1\156\2\141\1\156\1\56\1\157\1\145\2\uffff\1\101\2\uffff\2\0\3\uffff\1\144\1\uffff\1\145\1\163\1\60\1\160\1\146\2\60\1\uffff\1\141\1\160\1\167\1\155\1\144\1\170\2\uffff\1\141\1\162\10\uffff\1\60\1\164\1\145\1\162\13\uffff\1\116\1\uffff\1\111\2\uffff\1\105\1\123\1\uffff\1\103\1\uffff\1\114\1\154\1\162\1\151\1\166\1\145\1\151\2\uffff\1\143\5\uffff\1\147\1\165\1\uffff\1\144\1\164\1\145\1\162\1\164\1\uffff\1\154\2\uffff\1\141\1\uffff\1\157\1\164\1\170\5\uffff\1\60\1\151\1\143\2\60\1\165\1\72\1\uffff\1\154\1\60\1\uffff\1\60\1\uffff\1\156\1\145\1\147\1\145\1\60\1\165\3\60\1\162\1\60\1\uffff\1\60\1\162\1\60\1\103\1\107\1\105\1\126\1\124\1\105\1\123\1\163\1\141\1\163\1\60\1\160\1\147\1\151\1\72\2\145\1\156\1\145\1\164\1\144\2\60\4\uffff\1\154\1\60\1\164\1\154\1\uffff\1\164\1\60\1\141\1\uffff\1\151\1\uffff\1\164\1\uffff\1\151\1\162\2\uffff\1\163\3\60\1\171\1\166\1\uffff\1\155\2\uffff\1\141\1\uffff\1\141\1\uffff\1\165\1\uffff\1\146\1\uffff\1\105\1\107\2\60\1\117\1\60\1\105\1\145\1\154\1\164\1\141\1\uffff\1\60\1\150\1\156\1\uffff\1\170\2\164\1\162\1\145\1\151\2\uffff\1\145\1\uffff\1\60\1\145\1\157\1\uffff\1\162\1\141\1\60\1\145\1\164\1\60\3\uffff\1\163\1\60\1\160\1\162\1\156\1\164\1\154\1\60\1\105\2\uffff\1\122\1\uffff\2\60\1\154\1\163\1\162\1\uffff\1\164\1\145\1\160\1\72\1\145\1\146\1\162\1\143\1\141\1\uffff\2\60\1\162\1\60\1\154\1\uffff\1\163\1\60\1\uffff\1\60\1\uffff\1\164\1\60\1\164\1\60\1\157\1\uffff\1\122\1\111\2\uffff\6\60\1\uffff\1\162\1\154\1\156\1\141\1\156\2\uffff\1\60\1\uffff\1\154\1\60\1\uffff\1\166\1\uffff\1\151\1\uffff\1\145\1\uffff\1\167\1\105\1\103\6\uffff\1\60\1\157\1\60\1\164\1\60\1\uffff\1\171\1\uffff\1\145\1\157\1\145\1\72\1\104\1\101\1\uffff\1\167\1\uffff\1\145\1\uffff\1\60\2\156\1\60\1\uffff\1\60\1\114\1\72\1\60\1\uffff\1\164\1\60\2\uffff\1\114\2\uffff\1\165\1\uffff\1\131\1\141\1\60\1\154\1\uffff\1\154\1\171\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\uffff\1\157\1\171\1\156\1\172\1\171\1\165\1\51\1\165\1\76\2\75\1\166\1\157\2\uffff\2\75\3\uffff\1\57\3\172\1\122\2\172\1\101\1\157\1\170\2\145\1\75\1\145\5\uffff\1\145\1\157\1\uffff\1\156\1\162\1\141\1\156\1\163\2\157\2\uffff\1\172\2\uffff\2\uffff\3\uffff\1\156\1\uffff\1\145\1\163\1\172\1\160\1\146\2\172\1\uffff\1\165\1\160\1\167\1\163\1\144\1\170\2\uffff\1\141\1\162\10\uffff\1\172\1\164\1\145\1\162\13\uffff\1\116\1\uffff\1\125\2\uffff\1\105\1\123\1\uffff\1\103\1\uffff\1\114\1\154\1\162\1\151\1\166\1\145\1\151\2\uffff\1\146\5\uffff\1\163\1\165\1\uffff\1\144\1\164\1\145\1\162\1\164\1\uffff\1\156\2\uffff\1\151\1\uffff\1\157\1\164\1\170\5\uffff\1\172\1\151\1\143\2\172\1\165\1\72\1\uffff\1\157\1\172\1\uffff\1\172\1\uffff\1\156\1\145\1\147\1\145\1\172\1\165\3\172\1\162\1\172\1\uffff\1\172\1\162\1\172\1\103\1\107\1\105\1\126\1\124\1\105\1\123\1\163\1\141\1\163\1\172\1\160\1\147\1\151\1\72\2\145\1\156\1\145\1\164\1\144\2\172\4\uffff\1\154\1\172\1\164\1\154\1\uffff\1\164\1\172\1\141\1\uffff\1\151\1\uffff\1\164\1\uffff\1\151\1\162\2\uffff\1\163\3\172\1\171\1\166\1\uffff\1\155\2\uffff\1\141\1\uffff\1\141\1\uffff\1\165\1\uffff\1\146\1\uffff\1\105\1\107\2\172\1\117\1\172\1\105\1\145\1\154\1\164\1\141\1\uffff\1\172\1\150\1\156\1\uffff\1\170\2\164\1\162\1\145\1\151\2\uffff\1\145\1\uffff\1\172\2\157\1\uffff\1\162\1\141\1\172\1\145\1\164\1\172\3\uffff\1\163\1\172\1\160\1\162\1\156\1\164\1\154\1\172\1\105\2\uffff\1\122\1\uffff\2\172\1\154\1\163\1\162\1\uffff\1\164\1\145\1\160\1\72\1\145\1\146\1\162\1\143\1\141\1\uffff\2\172\1\162\1\172\1\154\1\uffff\1\163\1\172\1\uffff\1\172\1\uffff\1\164\1\172\1\164\1\172\1\157\1\uffff\1\122\1\111\2\uffff\6\172\1\uffff\1\162\1\154\1\156\1\141\1\156\2\uffff\1\172\1\uffff\1\154\1\172\1\uffff\1\166\1\uffff\1\151\1\uffff\1\145\1\uffff\1\167\1\105\1\103\6\uffff\1\172\1\157\1\172\1\164\1\172\1\uffff\1\171\1\uffff\1\145\1\157\1\145\1\72\1\104\1\101\1\uffff\1\167\1\uffff\1\145\1\uffff\1\172\2\156\1\172\1\uffff\1\172\1\114\1\72\1\172\1\uffff\1\164\1\172\2\uffff\1\114\2\uffff\1\165\1\uffff\1\131\1\141\1\172\1\154\1\uffff\1\154\1\171\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\15\uffff\1\31\1\33\2\uffff\1\42\1\43\1\45\16\uffff\1\112\1\113\1\114\1\115\1\116\2\uffff\1\122\7\uffff\1\154\1\155\1\uffff\1\157\1\160\2\uffff\1\163\1\164\1\1\1\uffff\1\157\7\uffff\1\6\6\uffff\1\15\1\121\2\uffff\1\22\1\156\1\44\1\24\1\37\1\35\1\141\1\26\4\uffff\1\31\1\33\1\34\1\61\1\40\1\36\1\42\1\43\1\45\1\162\1\46\1\uffff\1\47\1\uffff\1\51\1\53\2\uffff\1\55\1\uffff\1\57\7\uffff\1\111\1\106\1\uffff\1\112\1\113\1\114\1\115\1\116\2\uffff\1\122\5\uffff\1\137\1\uffff\1\150\1\151\1\uffff\1\142\3\uffff\1\154\1\155\1\160\1\161\1\163\7\uffff\1\75\2\uffff\1\12\1\uffff\1\135\13\uffff\1\27\32\uffff\1\146\1\147\1\152\1\153\4\uffff\1\41\3\uffff\1\73\1\uffff\1\4\1\uffff\1\124\2\uffff\1\25\1\136\6\uffff\1\11\1\uffff\1\21\1\32\1\uffff\1\101\1\uffff\1\17\1\uffff\1\71\1\uffff\1\30\13\uffff\1\77\3\uffff\1\125\6\uffff\1\132\1\134\1\uffff\1\144\3\uffff\1\3\6\uffff\1\64\1\140\1\107\11\uffff\1\62\1\54\1\uffff\1\60\5\uffff\1\102\11\uffff\1\145\5\uffff\1\74\2\uffff\1\7\1\uffff\1\13\5\uffff\1\50\2\uffff\1\63\1\65\6\uffff\1\123\5\uffff\1\2\1\103\1\uffff\1\72\2\uffff\1\104\1\uffff\1\10\1\uffff\1\100\1\uffff\1\70\3\uffff\1\66\1\67\1\76\1\105\1\110\1\117\5\uffff\1\130\1\uffff\1\23\6\uffff\1\120\1\uffff\1\131\1\uffff\1\143\4\uffff\1\126\4\uffff\1\5\2\uffff\1\16\1\52\1\uffff\1\127\1\133\1\uffff\1\20\4\uffff\1\56\3\uffff\1\14";
    static final String DFA13_specialS =
        "\1\2\67\uffff\1\0\1\1\u0161\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\73\2\72\2\73\1\72\22\73\1\72\1\21\1\70\2\73\1\23\1\17\1\71\1\10\1\53\1\25\1\24\1\50\1\12\1\60\1\26\12\67\1\42\1\1\1\13\1\20\1\22\1\63\1\73\5\66\1\35\1\5\1\33\1\57\5\66\1\34\1\32\2\66\1\27\1\30\4\66\1\31\1\66\1\44\1\73\1\45\1\65\1\66\1\73\1\7\1\61\1\52\1\43\1\37\1\36\1\11\1\66\1\4\1\66\1\40\1\66\1\2\1\62\1\15\1\55\1\66\1\51\1\3\1\6\1\54\1\56\1\41\1\16\2\66\1\46\1\14\1\47\1\64\uff81\73",
            "",
            "\1\75",
            "\1\77\10\uffff\1\100",
            "\1\103\6\uffff\1\102\1\101",
            "\12\76\7\uffff\4\76\1\105\1\104\24\76\4\uffff\1\76\1\uffff\32\76",
            "\1\107\6\uffff\1\110",
            "\1\111\1\uffff\1\113\4\uffff\1\112\1\uffff\1\114",
            "\1\115",
            "\1\120\23\uffff\1\117",
            "\1\122\20\uffff\1\121",
            "\1\124\17\uffff\1\125",
            "\1\127",
            "\1\131\2\uffff\1\132\1\133",
            "\1\134",
            "",
            "",
            "\1\137",
            "\1\141",
            "",
            "",
            "",
            "\1\146\4\uffff\1\122",
            "\12\76\7\uffff\10\76\1\150\21\76\4\uffff\1\76\1\uffff\32\76",
            "\12\76\7\uffff\21\76\1\152\10\76\4\uffff\1\76\1\uffff\32\76",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\155",
            "\12\76\7\uffff\10\76\1\156\21\76\4\uffff\1\76\1\uffff\32\76",
            "\12\76\7\uffff\15\76\1\160\14\76\4\uffff\1\76\1\uffff\32\76",
            "\1\162",
            "\1\163\15\uffff\1\164",
            "\1\166\11\uffff\1\165",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\173",
            "",
            "",
            "",
            "",
            "",
            "\1\u0081",
            "\1\u0082",
            "",
            "\1\u0084",
            "\1\u0085\20\uffff\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089\62\uffff\1\u008a\13\uffff\1\u008d\2\uffff\1\u008b\2\uffff\1\u008c",
            "\1\u008f",
            "\1\u0091\11\uffff\1\u0090",
            "",
            "",
            "\32\76\4\uffff\1\76\1\uffff\32\76",
            "",
            "",
            "\0\u0095",
            "\0\u0095",
            "",
            "",
            "",
            "\1\u0097\11\uffff\1\u0098",
            "",
            "\1\u0099",
            "\1\u009a",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\2\76\1\u009d\5\76\1\u009b\6\76\1\u009c\12\76",
            "\1\u009f",
            "\1\u00a0",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\12\76\7\uffff\5\76\1\u00a2\24\76\4\uffff\1\76\1\uffff\32\76",
            "",
            "\1\u00a4\7\uffff\1\u00a6\13\uffff\1\u00a5",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00aa\5\uffff\1\u00a9",
            "\1\u00ab",
            "\1\u00ac",
            "",
            "",
            "\1\u00ad",
            "\1\u00ae",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
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
            "\1\u00b3",
            "",
            "\1\u00b4\13\uffff\1\u00b5",
            "",
            "",
            "\1\u00b6",
            "\1\u00b7",
            "",
            "\1\u00b8",
            "",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "",
            "",
            "\1\u00c1\2\uffff\1\u00c0",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c2\13\uffff\1\u00c3",
            "\1\u00c4",
            "",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "",
            "\1\u00ca\1\uffff\1\u00cb",
            "",
            "",
            "\1\u00cd\7\uffff\1\u00cc",
            "",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "",
            "",
            "",
            "",
            "",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\24\76\1\u00d1\5\76",
            "\1\u00d3",
            "\1\u00d4",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\25\76\1\u00d5\4\76",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\23\76\1\u00d7\6\76",
            "\1\u00d9",
            "\1\u00da",
            "",
            "\1\u00db\2\uffff\1\u00dc",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\12\76\7\uffff\4\76\1\u00e4\25\76\4\uffff\1\76\1\uffff\1\u00e3\31\76",
            "\1\u00e6",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\25\76\1\u00e9\4\76",
            "\1\u00eb",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\17\76\1\u00ed\12\76",
            "\1\u00ef",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\25\76\1\u00fb\4\76",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "",
            "",
            "",
            "",
            "\1\u0109",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u010b",
            "\1\u010c",
            "",
            "\1\u010d",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u010f",
            "",
            "\1\u0110",
            "",
            "\1\u0111",
            "",
            "\1\u0112",
            "\1\u0113",
            "",
            "",
            "\1\u0114",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u0118",
            "\1\u0119",
            "",
            "\1\u011a",
            "",
            "",
            "\1\u011b",
            "",
            "\1\u011c",
            "",
            "\1\u011d",
            "",
            "\1\u011e",
            "",
            "\1\u011f",
            "\1\u0120",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u0123",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u012b",
            "\1\u012c",
            "",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "",
            "",
            "\1\u0133",
            "",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u0135\11\uffff\1\u0136",
            "\1\u0137",
            "",
            "\1\u0138",
            "\1\u0139",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u013b",
            "\1\u013c",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "",
            "",
            "",
            "\1\u013e",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u0146",
            "",
            "",
            "\1\u0147",
            "",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u0158",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u015a",
            "",
            "\1\u015b",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "",
            "\12\76\7\uffff\4\76\1\u015d\25\76\4\uffff\1\76\1\uffff\32\76",
            "",
            "\1\u015f",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u0161",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u0163",
            "",
            "\1\u0164",
            "\1\u0165",
            "",
            "",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "",
            "",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "",
            "\1\u0172",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "",
            "\1\u0174",
            "",
            "\1\u0175",
            "",
            "\1\u0176",
            "",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u017b",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u017d",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "",
            "\1\u017f",
            "",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "",
            "\1\u0186",
            "",
            "\1\u0187",
            "",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u0189",
            "\1\u018a",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u018d",
            "\1\u018e",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "",
            "\1\u0190",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "",
            "",
            "\1\u0192",
            "",
            "",
            "\1\u0193",
            "",
            "\1\u0194",
            "\1\u0195",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            "\1\u0197",
            "",
            "\1\u0198",
            "\1\u0199",
            "\12\76\7\uffff\32\76\4\uffff\1\76\1\uffff\32\76",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_56 = input.LA(1);

                        s = -1;
                        if ( ((LA13_56>='\u0000' && LA13_56<='\uFFFF')) ) {s = 149;}

                        else s = 59;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_57 = input.LA(1);

                        s = -1;
                        if ( ((LA13_57>='\u0000' && LA13_57<='\uFFFF')) ) {s = 149;}

                        else s = 59;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0==';') ) {s = 1;}

                        else if ( (LA13_0=='m') ) {s = 2;}

                        else if ( (LA13_0=='s') ) {s = 3;}

                        else if ( (LA13_0=='i') ) {s = 4;}

                        else if ( (LA13_0=='G') ) {s = 5;}

                        else if ( (LA13_0=='t') ) {s = 6;}

                        else if ( (LA13_0=='a') ) {s = 7;}

                        else if ( (LA13_0=='(') ) {s = 8;}

                        else if ( (LA13_0=='g') ) {s = 9;}

                        else if ( (LA13_0=='-') ) {s = 10;}

                        else if ( (LA13_0=='<') ) {s = 11;}

                        else if ( (LA13_0=='|') ) {s = 12;}

                        else if ( (LA13_0=='o') ) {s = 13;}

                        else if ( (LA13_0=='x') ) {s = 14;}

                        else if ( (LA13_0=='&') ) {s = 15;}

                        else if ( (LA13_0=='=') ) {s = 16;}

                        else if ( (LA13_0=='!') ) {s = 17;}

                        else if ( (LA13_0=='>') ) {s = 18;}

                        else if ( (LA13_0=='%') ) {s = 19;}

                        else if ( (LA13_0=='+') ) {s = 20;}

                        else if ( (LA13_0=='*') ) {s = 21;}

                        else if ( (LA13_0=='/') ) {s = 22;}

                        else if ( (LA13_0=='S') ) {s = 23;}

                        else if ( (LA13_0=='T') ) {s = 24;}

                        else if ( (LA13_0=='Y') ) {s = 25;}

                        else if ( (LA13_0=='P') ) {s = 26;}

                        else if ( (LA13_0=='H') ) {s = 27;}

                        else if ( (LA13_0=='O') ) {s = 28;}

                        else if ( (LA13_0=='F') ) {s = 29;}

                        else if ( (LA13_0=='f') ) {s = 30;}

                        else if ( (LA13_0=='e') ) {s = 31;}

                        else if ( (LA13_0=='k') ) {s = 32;}

                        else if ( (LA13_0=='w') ) {s = 33;}

                        else if ( (LA13_0==':') ) {s = 34;}

                        else if ( (LA13_0=='d') ) {s = 35;}

                        else if ( (LA13_0=='[') ) {s = 36;}

                        else if ( (LA13_0==']') ) {s = 37;}

                        else if ( (LA13_0=='{') ) {s = 38;}

                        else if ( (LA13_0=='}') ) {s = 39;}

                        else if ( (LA13_0==',') ) {s = 40;}

                        else if ( (LA13_0=='r') ) {s = 41;}

                        else if ( (LA13_0=='c') ) {s = 42;}

                        else if ( (LA13_0==')') ) {s = 43;}

                        else if ( (LA13_0=='u') ) {s = 44;}

                        else if ( (LA13_0=='p') ) {s = 45;}

                        else if ( (LA13_0=='v') ) {s = 46;}

                        else if ( (LA13_0=='I') ) {s = 47;}

                        else if ( (LA13_0=='.') ) {s = 48;}

                        else if ( (LA13_0=='b') ) {s = 49;}

                        else if ( (LA13_0=='n') ) {s = 50;}

                        else if ( (LA13_0=='?') ) {s = 51;}

                        else if ( (LA13_0=='~') ) {s = 52;}

                        else if ( (LA13_0=='^') ) {s = 53;}

                        else if ( ((LA13_0>='A' && LA13_0<='E')||(LA13_0>='J' && LA13_0<='N')||(LA13_0>='Q' && LA13_0<='R')||(LA13_0>='U' && LA13_0<='X')||LA13_0=='Z'||LA13_0=='_'||LA13_0=='h'||LA13_0=='j'||LA13_0=='l'||LA13_0=='q'||(LA13_0>='y' && LA13_0<='z')) ) {s = 54;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 55;}

                        else if ( (LA13_0=='\"') ) {s = 56;}

                        else if ( (LA13_0=='\'') ) {s = 57;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 58;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||(LA13_0>='#' && LA13_0<='$')||LA13_0=='@'||LA13_0=='\\'||LA13_0=='`'||(LA13_0>='\u007F' && LA13_0<='\uFFFF')) ) {s = 59;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}