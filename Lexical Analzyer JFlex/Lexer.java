/* The following code was generated by JFlex 1.6.1 */

/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Copyright (C) 2000 Gerwin Klein <lsf@jflex.de>                          *
 * All rights reserved.                                                    *
 *                                                                         *
 * Thanks to Larry Bell and Bob Jamison for suggestions and comments.      *
 *                                                                         *
 * License: BSD                                                            *
 *                                                                         *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
 
/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Author:     Quinn Trate                                                 *
 * Date:       February 23, 2024                                           *
 * Class:      CMPSC 470 Section 1: Compilers                              *
 * Instructor: Dr. Hyuntae Na                                              *
 * Purpose:    Generates the Lexer.java File to be the DFA for the         *
 *             Lexical Analyzer                                            *
 *                                                                         *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>Lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\10\0\1\56\1\25\1\24\1\30\1\30\1\27\22\0\1\7\2\0"+
    "\1\1\4\0\1\46\1\47\1\31\1\54\1\53\1\54\1\21\1\26"+
    "\12\20\1\42\1\52\1\44\1\43\1\45\2\0\4\22\1\55\25\22"+
    "\1\50\1\0\1\51\1\0\1\23\1\0\1\14\1\10\1\32\1\2"+
    "\1\3\1\4\1\33\1\40\1\5\1\22\1\34\1\12\1\22\1\6"+
    "\1\11\1\35\1\22\1\15\1\17\1\13\1\16\1\36\1\37\2\22"+
    "\1\41\12\0\1\30\u1fa2\0\1\30\1\30\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\2\1\5\2\1\3\6\2\1\4\1\5\1\6"+
    "\1\7\1\10\4\2\1\1\3\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\0\5\2\1\21\6\2"+
    "\1\10\7\2\1\22\1\0\1\22\1\3\1\0\5\2"+
    "\1\23\1\24\1\0\1\25\4\2\1\26\1\27\11\2"+
    "\1\30\1\0\4\2\1\31\1\2\1\0\1\32\1\2"+
    "\1\33\1\2\1\34\1\2\1\35\1\36\1\37\1\2"+
    "\1\40\1\2\1\41\2\2\1\42\2\2\1\0\1\43"+
    "\1\44\1\45\3\2\1\46\1\47\1\50\1\0\1\51"+
    "\1\52\1\2\1\0\1\2\1\0\1\53\6\0\1\54"+
    "\10\0\1\54\2\0\1\54";

  private static int [] zzUnpackAction() {
    int [] result = new int[149];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\57\0\136\0\215\0\274\0\353\0\u011a\0\u0149"+
    "\0\u0178\0\u01a7\0\u01d6\0\u0205\0\u0234\0\u0263\0\u0292\0\u02c1"+
    "\0\u02f0\0\57\0\u031f\0\57\0\u034e\0\u037d\0\u03ac\0\u03db"+
    "\0\u040a\0\57\0\u0439\0\u0468\0\57\0\57\0\57\0\57"+
    "\0\57\0\57\0\57\0\u0497\0\u04c6\0\u04f5\0\u0524\0\u0553"+
    "\0\u0582\0\215\0\u05b1\0\u05e0\0\u060f\0\u063e\0\u066d\0\u069c"+
    "\0\215\0\u06cb\0\u06fa\0\u0729\0\u0758\0\u0787\0\u07b6\0\u07e5"+
    "\0\u0814\0\u02f0\0\u02f0\0\u0843\0\u0872\0\u08a1\0\u08d0\0\u08ff"+
    "\0\u092e\0\u095d\0\57\0\57\0\u098c\0\215\0\u09bb\0\u09ea"+
    "\0\u0a19\0\u0a48\0\215\0\215\0\u0a77\0\u0aa6\0\u0ad5\0\u0b04"+
    "\0\u0b33\0\u0b62\0\u0b91\0\u0bc0\0\u0bef\0\u0c1e\0\u0c4d\0\u0c7c"+
    "\0\u0cab\0\u0cda\0\u0d09\0\215\0\u0d38\0\u0d67\0\215\0\u0d96"+
    "\0\215\0\u0dc5\0\215\0\u0df4\0\215\0\215\0\215\0\u0e23"+
    "\0\215\0\u0e52\0\u0872\0\u0e81\0\u0eb0\0\215\0\u0edf\0\u0f0e"+
    "\0\u0f3d\0\215\0\215\0\215\0\u0f6c\0\u0f9b\0\u0fca\0\215"+
    "\0\215\0\215\0\u0ff9\0\215\0\215\0\u1028\0\u1057\0\u1086"+
    "\0\u10b5\0\215\0\u10e4\0\u1113\0\u1142\0\u1171\0\u11a0\0\u11cf"+
    "\0\u11fe\0\u122d\0\u125c\0\u128b\0\u12ba\0\u12e9\0\u1318\0\u1347"+
    "\0\u1376\0\57\0\u13a5\0\u13d4\0\u1318";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[149];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\4\1\14\1\15\1\16\1\4\1\17"+
    "\1\20\1\21\1\4\1\2\1\22\1\11\1\23\1\11"+
    "\1\2\1\24\1\25\2\4\1\26\1\27\1\30\2\4"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40"+
    "\1\41\1\42\1\24\1\4\1\43\61\0\1\44\56\0"+
    "\5\4\1\0\11\4\1\0\2\4\6\0\10\4\13\0"+
    "\1\4\3\0\4\4\1\45\1\0\2\4\1\46\6\4"+
    "\1\0\2\4\6\0\10\4\13\0\1\4\3\0\5\4"+
    "\1\0\2\4\1\47\1\4\1\50\1\4\1\51\2\4"+
    "\1\0\2\4\6\0\10\4\13\0\1\4\3\0\2\4"+
    "\1\52\1\4\1\53\1\0\11\4\1\0\2\4\6\0"+
    "\10\4\13\0\1\4\3\0\1\4\1\54\3\4\1\0"+
    "\1\4\1\55\7\4\1\0\2\4\6\0\10\4\13\0"+
    "\1\4\10\0\1\11\15\0\1\11\1\0\1\11\31\0"+
    "\1\4\1\56\3\4\1\0\1\4\1\57\3\4\1\60"+
    "\3\4\1\0\2\4\6\0\10\4\13\0\1\4\3\0"+
    "\5\4\1\0\5\4\1\61\3\4\1\0\2\4\6\0"+
    "\10\4\13\0\1\4\3\0\5\4\1\0\5\4\1\62"+
    "\3\4\1\0\2\4\6\0\6\4\1\63\1\4\13\0"+
    "\1\4\3\0\1\64\3\4\1\65\1\0\11\4\1\0"+
    "\2\4\6\0\10\4\13\0\1\4\3\0\1\4\1\66"+
    "\3\4\1\0\11\4\1\0\2\4\6\0\10\4\13\0"+
    "\1\4\3\0\3\4\1\67\1\4\1\0\3\4\1\70"+
    "\5\4\1\0\2\4\6\0\10\4\13\0\1\4\21\0"+
    "\1\20\1\71\33\0\1\72\21\0\1\73\64\0\1\74"+
    "\2\0\1\75\27\0\5\4\1\0\1\4\1\76\7\4"+
    "\1\0\2\4\6\0\10\4\13\0\1\4\3\0\5\4"+
    "\1\0\5\4\1\77\3\4\1\0\2\4\6\0\10\4"+
    "\13\0\1\4\3\0\5\4\1\0\1\4\1\100\2\4"+
    "\1\101\4\4\1\0\2\4\6\0\10\4\13\0\1\4"+
    "\3\0\5\4\1\0\11\4\1\0\2\4\6\0\6\4"+
    "\1\102\1\4\13\0\1\4\43\0\1\103\1\104\56\0"+
    "\1\32\1\0\1\32\54\0\1\32\16\0\1\105\55\0"+
    "\1\106\4\4\1\0\11\4\1\0\2\4\6\0\10\4"+
    "\13\0\1\4\3\0\5\4\1\0\7\4\1\107\1\4"+
    "\1\0\2\4\6\0\10\4\13\0\1\4\3\0\5\4"+
    "\1\0\1\4\1\110\7\4\1\0\2\4\6\0\10\4"+
    "\13\0\1\4\3\0\5\4\1\0\2\4\1\111\6\4"+
    "\1\0\2\4\6\0\10\4\13\0\1\4\3\0\4\4"+
    "\1\112\1\0\11\4\1\0\2\4\6\0\10\4\13\0"+
    "\1\4\3\0\5\4\1\0\3\4\1\113\5\4\1\0"+
    "\2\4\6\0\10\4\13\0\1\4\3\0\5\4\1\0"+
    "\11\4\1\0\2\4\6\0\5\4\1\114\2\4\13\0"+
    "\1\4\3\0\5\4\1\0\3\4\1\61\5\4\1\0"+
    "\2\4\6\0\10\4\13\0\1\4\3\0\5\4\1\0"+
    "\11\4\1\0\2\4\6\0\1\4\1\115\6\4\13\0"+
    "\1\4\3\0\5\4\1\0\1\4\1\116\7\4\1\0"+
    "\2\4\6\0\10\4\13\0\1\4\3\0\1\4\1\117"+
    "\3\4\1\0\11\4\1\0\2\4\6\0\10\4\13\0"+
    "\1\4\3\0\5\4\1\0\6\4\1\120\2\4\1\0"+
    "\2\4\6\0\10\4\13\0\1\4\3\0\1\4\1\121"+
    "\3\4\1\0\11\4\1\0\2\4\6\0\10\4\13\0"+
    "\1\4\3\0\1\122\4\4\1\0\11\4\1\0\2\4"+
    "\6\0\10\4\13\0\1\4\3\0\1\61\4\4\1\0"+
    "\11\4\1\0\2\4\6\0\10\4\13\0\1\4\3\0"+
    "\5\4\1\0\3\4\1\123\5\4\1\0\2\4\6\0"+
    "\10\4\13\0\1\4\3\0\5\4\1\0\11\4\1\0"+
    "\2\4\6\0\7\4\1\124\13\0\1\4\3\0\5\4"+
    "\1\0\5\4\1\125\3\4\1\0\2\4\6\0\10\4"+
    "\13\0\1\4\21\0\1\126\36\0\24\74\1\0\2\74"+
    "\2\0\26\74\31\75\1\127\25\75\2\0\4\4\1\130"+
    "\1\0\11\4\1\0\2\4\6\0\10\4\13\0\1\4"+
    "\3\0\3\4\1\131\1\4\1\0\11\4\1\0\2\4"+
    "\6\0\10\4\13\0\1\4\3\0\3\4\1\132\1\4"+
    "\1\0\11\4\1\0\2\4\6\0\10\4\13\0\1\4"+
    "\3\0\5\4\1\0\2\4\1\133\2\4\1\134\3\4"+
    "\1\0\2\4\6\0\10\4\13\0\1\4\3\0\3\4"+
    "\1\135\1\4\1\0\11\4\1\0\2\4\6\0\10\4"+
    "\13\0\1\4\5\0\1\136\54\0\1\4\1\137\3\4"+
    "\1\0\11\4\1\0\2\4\6\0\10\4\13\0\1\4"+
    "\3\0\5\4\1\0\4\4\1\140\4\4\1\0\2\4"+
    "\6\0\10\4\13\0\1\4\3\0\5\4\1\0\7\4"+
    "\1\120\1\4\1\0\2\4\6\0\10\4\13\0\1\4"+
    "\3\0\5\4\1\0\11\4\1\0\2\4\6\0\1\141"+
    "\7\4\13\0\1\4\3\0\3\4\1\142\1\4\1\0"+
    "\11\4\1\0\2\4\6\0\10\4\13\0\1\4\3\0"+
    "\5\4\1\0\2\4\1\143\6\4\1\0\2\4\6\0"+
    "\10\4\13\0\1\4\3\0\5\4\1\0\4\4\1\144"+
    "\4\4\1\0\2\4\6\0\10\4\13\0\1\4\3\0"+
    "\1\4\1\145\3\4\1\0\11\4\1\0\2\4\6\0"+
    "\10\4\13\0\1\4\3\0\4\4\1\146\1\0\11\4"+
    "\1\0\2\4\6\0\10\4\13\0\1\4\3\0\5\4"+
    "\1\0\5\4\1\147\3\4\1\0\2\4\6\0\10\4"+
    "\13\0\1\4\3\0\5\4\1\0\6\4\1\150\2\4"+
    "\1\0\2\4\6\0\10\4\13\0\1\4\3\0\1\4"+
    "\1\151\3\4\1\0\11\4\1\0\2\4\6\0\10\4"+
    "\13\0\1\4\3\0\5\4\1\0\6\4\1\152\2\4"+
    "\1\0\2\4\6\0\10\4\13\0\1\4\21\0\1\126"+
    "\34\0\1\72\1\0\26\75\1\153\2\75\1\127\25\75"+
    "\2\0\5\4\1\0\3\4\1\154\5\4\1\0\2\4"+
    "\6\0\10\4\13\0\1\4\3\0\4\4\1\155\1\0"+
    "\11\4\1\0\2\4\6\0\10\4\13\0\1\4\3\0"+
    "\1\156\4\4\1\0\11\4\1\0\2\4\6\0\10\4"+
    "\13\0\1\4\3\0\5\4\1\0\6\4\1\157\2\4"+
    "\1\0\2\4\6\0\10\4\13\0\1\4\3\0\5\4"+
    "\1\0\2\4\1\160\6\4\1\0\2\4\6\0\10\4"+
    "\13\0\1\4\6\0\1\161\53\0\5\4\1\0\3\4"+
    "\1\162\5\4\1\0\2\4\6\0\10\4\13\0\1\4"+
    "\3\0\4\4\1\163\1\0\11\4\1\0\2\4\6\0"+
    "\10\4\13\0\1\4\3\0\5\4\1\0\11\4\1\0"+
    "\2\4\6\0\2\4\1\164\5\4\13\0\1\4\3\0"+
    "\5\4\1\0\5\4\1\165\3\4\1\0\2\4\6\0"+
    "\10\4\13\0\1\4\3\0\5\4\1\0\11\4\1\0"+
    "\2\4\6\0\1\166\7\4\13\0\1\4\3\0\3\4"+
    "\1\167\1\4\1\0\11\4\1\0\2\4\6\0\10\4"+
    "\13\0\1\4\3\0\5\4\1\0\3\4\1\170\5\4"+
    "\1\0\2\4\6\0\10\4\13\0\1\4\3\0\1\4"+
    "\1\171\3\4\1\0\11\4\1\0\2\4\6\0\10\4"+
    "\13\0\1\4\3\0\1\4\1\172\3\4\1\0\11\4"+
    "\1\0\2\4\6\0\10\4\13\0\1\4\7\0\1\173"+
    "\52\0\4\4\1\174\1\0\11\4\1\0\2\4\6\0"+
    "\10\4\13\0\1\4\3\0\5\4\1\0\3\4\1\175"+
    "\5\4\1\0\2\4\6\0\10\4\13\0\1\4\3\0"+
    "\4\4\1\176\1\0\11\4\1\0\2\4\6\0\10\4"+
    "\13\0\1\4\4\0\1\177\55\0\5\4\1\0\6\4"+
    "\1\200\2\4\1\0\2\4\6\0\10\4\13\0\1\4"+
    "\10\0\1\201\51\0\1\4\1\202\3\4\1\0\11\4"+
    "\1\0\2\4\6\0\10\4\13\0\1\4\3\0\5\203"+
    "\1\0\10\203\2\0\1\203\7\0\10\203\13\0\1\203"+
    "\3\0\5\203\1\204\11\203\1\0\2\203\6\0\10\203"+
    "\13\0\1\203\5\0\1\205\1\206\2\0\1\207\2\0"+
    "\1\210\4\0\1\211\50\0\1\212\1\0\1\213\50\0"+
    "\1\214\61\0\1\215\62\0\1\216\61\0\1\211\1\217"+
    "\46\0\1\220\57\0\1\221\57\0\1\222\54\0\1\223"+
    "\63\0\1\224\60\0\1\225\52\0\1\214\61\0\1\224"+
    "\51\0\1\222\47\0\1\222\53\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5123];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\17\1\1\11\1\1\1\11\5\1\1\11"+
    "\2\1\7\11\1\0\25\1\1\0\2\1\1\0\5\1"+
    "\2\11\1\0\21\1\1\0\6\1\1\0\22\1\1\0"+
    "\11\1\1\0\3\1\1\0\1\1\1\0\1\1\6\0"+
    "\1\1\10\0\1\11\2\0\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[149];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
  public Parser   parser;
  public int      lineno;
  public int      column;
  public int      prevCol;

  public Lexer(java.io.Reader r, Parser parser)
  {
    this(r);
    this.parser = parser;
    this.lineno = 1;
    this.column = 1;
    this.prevCol = 1;
  }  


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 166) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return 0; }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { column = prevCol; System.out.println("\nLexical error: unexpected character '" + yytext() + "' at " + lineno + ":" + column + "."); return -1;
            }
          case 45: break;
          case 2: 
            { String lexeme = yytext();
                                      parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.IDENT      ;
            }
          case 46: break;
          case 3: 
            { System.out.print(yytext()); column = prevCol; prevCol += yytext().length(); /* skip */
            }
          case 47: break;
          case 4: 
            { String lexeme = yytext();
                                      parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.INT_LIT    ;
            }
          case 48: break;
          case 5: 
            { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.DOT        ;
            }
          case 49: break;
          case 6: 
            { System.out.print("\n"); lineno++; column = 1; prevCol = 1; /* skip */
            }
          case 50: break;
          case 7: 
            { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.OP          ;
            }
          case 51: break;
          case 8: 
            { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.OP         ;
            }
          case 52: break;
          case 9: 
            { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.RELOP      ;
            }
          case 53: break;
          case 10: 
            { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.LPAREN     ;
            }
          case 54: break;
          case 11: 
            { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.RPAREN     ;
            }
          case 55: break;
          case 12: 
            { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.LBRACKET   ;
            }
          case 56: break;
          case 13: 
            { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.RBRACKET   ;
            }
          case 57: break;
          case 14: 
            { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.SEMI       ;
            }
          case 58: break;
          case 15: 
            { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.COMMA      ;
            }
          case 59: break;
          case 16: 
            { column = prevCol; System.out.println("\nLexical error: backspace character '" + yytext() + "' at " + lineno + ":" + column + "."); return -1;
            }
          case 60: break;
          case 17: 
            { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.IF         ;
            }
          case 61: break;
          case 18: 
            { System.out.println("\nLexical error: unexpected character '" + yytext() + "' at " + lineno + ":" + column + "."); return -1;
            }
          case 62: break;
          case 19: 
            { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.TYPEOF     ;
            }
          case 63: break;
          case 20: 
            { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.ASSIGN     ;
            }
          case 64: break;
          case 21: 
            { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.END        ;
            }
          case 65: break;
          case 22: 
            { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.INT        ;
            }
          case 66: break;
          case 23: 
            { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.NEW        ;
            }
          case 67: break;
          case 24: 
            { String lexeme = yytext();
                                      parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.FLOAT_LIT  ;
            }
          case 68: break;
          case 25: 
            { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.VAR        ;
            }
          case 69: break;
          case 26: 
            { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.ELSE       ;
            }
          case 70: break;
          case 27: 
            { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.FUNC       ;
            }
          case 71: break;
          case 28: 
            { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.BOOL       ;
            }
          case 72: break;
          case 29: 
            { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.BOOL_VALUE ;
            }
          case 73: break;
          case 30: 
            { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.THEN       ;
            }
          case 74: break;
          case 31: 
            { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.ADDR       ;
            }
          case 75: break;
          case 32: 
            { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.SIZE       ;
            }
          case 76: break;
          case 33: 
            { System.out.print(yytext());
                                      for (int i = 0; i < yytext().length(); i++)
                                      {
                                          if (yytext().charAt(i) == '\n')
                                          {
                                              lineno++;
                                              column = 1;
                                              prevCol = 1;
                                          }
                                          else
                                          {
                                              column = prevCol;
                                              prevCol++;
                                          }
                                      }
                                      /* skip */
            }
          case 77: break;
          case 34: 
            { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.VOID       ;
            }
          case 78: break;
          case 35: 
            { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.FLOAT      ;
            }
          case 79: break;
          case 36: 
            { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.BEGIN      ;
            }
          case 80: break;
          case 37: 
            { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.BREAK      ;
            }
          case 81: break;
          case 38: 
            { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.PRINT      ;
            }
          case 82: break;
          case 39: 
            { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.VALUE      ;
            }
          case 83: break;
          case 40: 
            { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.WHILE      ;
            }
          case 84: break;
          case 41: 
            { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.RETURN     ;
            }
          case 85: break;
          case 42: 
            { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.STRUCT     ;
            }
          case 86: break;
          case 43: 
            { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.CONTINUE   ;
            }
          case 87: break;
          case 44: 
            { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.DEFINE     ;
            }
          case 88: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
