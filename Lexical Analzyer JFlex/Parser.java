//----------------------------------------------
// Author:     Quinn Trate
// Date:       February 23, 2024
// Class:      CMPSC 470 Section 1: Compilers
// Instructor: Dr. Hyuntae Na
// Purpose:    Parser Class that prints tokens
//             from the Lexical Analyzer. 
//             Gives Success or Error
//----------------------------------------------

import java.util.*;

public class Parser
{
    public static final int CONTINUE    = 10; // "continue"
    public static final int RETURN      = 11; // "return"
    public static final int STRUCT      = 12; // "struct"
    public static final int BEGIN       = 13; // "begin"
    public static final int BREAK       = 14; // "break"   
    public static final int FLOAT       = 15; // "float"
    public static final int PRINT       = 16; // "print"
    public static final int VALUE       = 17; // "value"
    public static final int WHILE       = 18; // "while"
    public static final int ADDR        = 19; // "addr"
    public static final int BOOL        = 20; // "boolean"
    public static final int ELSE        = 21; // "else"
    public static final int FUNC        = 22; // "function"
    public static final int SIZE        = 23; // "size"
    public static final int THEN        = 24; // "then"
    public static final int VOID        = 25; // "void"
    public static final int INT         = 26; // "int"
    public static final int END         = 27; // "end"
    public static final int NEW         = 28; // "new"
    public static final int VAR         = 29; // "variable"
    public static final int IF          = 30; // "if"
    public static final int TYPEOF      = 31; // "::"
    public static final int ASSIGN      = 32; // ":="
    public static final int LPAREN      = 33; // "("
    public static final int RPAREN      = 34; // ")"
    public static final int LBRACKET    = 35; // "["
    public static final int RBRACKET    = 36; // "]"
    public static final int SEMI        = 37; // ";"
    public static final int COMMA       = 38; // ","
    public static final int DOT         = 39; // "."
    public static final int BOOL_VALUE  = 40; // "true", "false"
    public static final int OP          = 41; // "+", "-", "*", "/", "and", "or", "not"
    public static final int RELOP       = 42; // "=", "!=", "<", ">", "<=", ">="
    public static final int INT_LIT     = 43; // {int}
    public static final int FLOAT_LIT   = 44; // {float}
    public static final int IDENT       = 45; // {identifier}
    public static final int DEFINE      = 46; // "#define"

    // Hashmap for Tokens
    HashMap<Integer, Integer> symbols = new HashMap<Integer, Integer>();
    
    // Hashmap for Symbol table
    HashMap<Object, Integer> symbolTable = new HashMap<Object, Integer>();
    int symbolTableIndex = 0;
    
    // Hashmap for Define
    HashMap<String, String> defineTable = new HashMap<String, String>();

    public Parser(java.io.Reader r, Compiler compiler) throws Exception
    {
        this.compiler = compiler;
        this.lexer    = new Lexer(r, this);

        // Fill Hashmap with Tokens
        symbols.put(9, DEFINE);
        symbols.put(10, CONTINUE);
        symbols.put(11, RETURN);
        symbols.put(12, STRUCT);
        symbols.put(13, BEGIN);
        symbols.put(14, BREAK);
        symbols.put(15, FLOAT);
        symbols.put(16, PRINT);
        symbols.put(17, VALUE);
        symbols.put(18, WHILE);
        symbols.put(19, ADDR);
        symbols.put(20, BOOL);
        symbols.put(21, ELSE);
        symbols.put(22, FUNC);
        symbols.put(23, SIZE);
        symbols.put(24, THEN);
        symbols.put(25, VOID);
        symbols.put(26, INT);
        symbols.put(27, END);
        symbols.put(28, NEW);
        symbols.put(29, VAR);
        symbols.put(30, IF);
        symbols.put(31, TYPEOF);
        symbols.put(32, ASSIGN);
        symbols.put(33, LPAREN);
        symbols.put(34, RPAREN);
        symbols.put(35, LBRACKET);
        symbols.put(36, RBRACKET);
        symbols.put(37, SEMI);
        symbols.put(38, COMMA);
        symbols.put(39, DOT);
        symbols.put(40, BOOL_VALUE);
        symbols.put(41, OP);
        symbols.put(42, RELOP);
        symbols.put(43, INT_LIT);
        symbols.put(44, FLOAT_LIT);
        symbols.put(45, IDENT);
        symbols.put(46, DEFINE);
    }

    Lexer            lexer;
    Compiler         compiler;
    public ParserVal yylval;

    public int yyparse() throws java.io.IOException
    {
        while ( true )
        {
            int token = lexer.yylex();
            Object attr = yylval.obj;
            String tokenname = "";

            // Switch Case for Tokens
            switch(token)
            {
                case 10:
                    System.out.print("<CONTINUE, " + lexer.lineno + ":" + lexer.column + ">");
                    break;
                case 11:
                    System.out.print("<RETURN, " + lexer.lineno + ":" + lexer.column + ">");
                    break;
                case 12:
                    System.out.print("<STRUCT, " + lexer.lineno + ":" + lexer.column + ">");
                    break;
                case 13:
                    System.out.print("<BEGIN, " + lexer.lineno + ":" + lexer.column + ">");
                    break;
                case 14:
                    System.out.print("<BREAK, " + lexer.lineno + ":" + lexer.column + ">");
                    break;
                case 15:
                    System.out.print("<FLOAT, " + lexer.lineno + ":" + lexer.column + ">");
                    break;
                case 16:
                    System.out.print("<PRINT, " + lexer.lineno + ":" + lexer.column + ">");
                    break;
                case 17:
                    System.out.print("<VALUE, " + lexer.lineno + ":" + lexer.column + ">");
                    break;
                case 18:
                    System.out.print("<WHILE, " + lexer.lineno + ":" + lexer.column + ">");
                    break;
                case 19:
                    System.out.print("<ADDR, " + lexer.lineno + ":" + lexer.column + ">");
                    break;
                case 20:
                    System.out.print("<BOOL, " + lexer.lineno + ":" + lexer.column + ">");
                    break;
                case 21:
                    System.out.print("<ELSE, " + lexer.lineno + ":" + lexer.column + ">");
                    break;
                case 22:
                    System.out.print("<FUNC, " + lexer.lineno + ":" + lexer.column + ">");
                    break;
                case 23:
                    System.out.print("<SIZE, " + lexer.lineno + ":" + lexer.column + ">");
                    break;
                case 24:
                    System.out.print("<THEN, " + lexer.lineno + ":" + lexer.column + ">");
                    break;
                case 25:
                    System.out.print("<VOID, " + lexer.lineno + ":" + lexer.column + ">");
                    break;
                case 26:
                    System.out.print("<INT, " + lexer.lineno + ":" + lexer.column + ">");
                    break;
                case 27:
                    System.out.print("<END, " + lexer.lineno + ":" + lexer.column + ">");
                    break;
                case 28:
                    System.out.print("<NEW, " + lexer.lineno + ":" + lexer.column + ">");
                    break;
                case 29:
                    System.out.print("<VAR, " + lexer.lineno + ":" + lexer.column + ">");
                    break;
                case 30:
                    System.out.print("<IF, " + lexer.lineno + ":" + lexer.column + ">");
                    break;
                case 31:
                    System.out.print("<TYPEOF, " + lexer.lineno + ":" + lexer.column + ">");
                    break;
                case 32:
                    System.out.print("<ASSIGN, " + lexer.lineno + ":" + lexer.column + ">");
                    break;
                case 33:
                    System.out.print("<LPAREN, " + lexer.lineno + ":" + lexer.column + ">");
                    break;
                case 34:
                    System.out.print("<RPAREN, " + lexer.lineno + ":" + lexer.column + ">");
                    break;
                case 35:
                    System.out.print("<LBRACKET, " + lexer.lineno + ":" + lexer.column + ">");
                    break;
                case 36:
                    System.out.print("<RBRACKET, " + lexer.lineno + ":" + lexer.column + ">");
                    break;
                case 37:
                    System.out.print("<SEMI, " + lexer.lineno + ":" + lexer.column + ">");
                    break;
                case 38:
                    System.out.print("<COMMA, " + lexer.lineno + ":" + lexer.column + ">");
                    break;
                case 39:
                    System.out.print("<DOT, " + lexer.lineno + ":" + lexer.column + ">");
                    break;
                case 40:
                    System.out.print("<BOOL_VALUE, attr:\"" + attr + "\", " + lexer.lineno + ":" + lexer.column + ">");
                    break;
                case 41:
                    System.out.print("<OP, attr:\"" + attr + "\" , " + lexer.lineno + ":" + lexer.column + ">");
                    break;
                case 42:
                    System.out.print("<RELOP, attr:\"" + attr + "\" , " + lexer.lineno + ":" + lexer.column + ">");
                    break;
                case 43:
                    System.out.print("<INT_VALUE, attr:\"" + attr + "\", " + lexer.lineno + ":" + lexer.column + ">");
                    break;
                case 44:
                    System.out.print("<FLOAT_VALUE, attr:\"" + attr + "\", " + lexer.lineno + ":" + lexer.column + ">");
                    break;
                case 45:
                    // Checks if the Identifier has Already been Defined
                    if (defineTable.containsKey(attr))
                    {
                        System.out.print(defineTable.get(attr) + lexer.lineno + ":" + lexer.column + ">");
                        break;
                    }
                    // Checks if the Identfier is in the Symbol Table
                    if(!symbolTable.containsKey(attr))
                    {
                        symbolTable.put(attr, symbolTableIndex);
                        System.out.print("<<new symbol table entity [" + symbolTableIndex + ", \"" + attr + "\"]>>");
                        symbolTableIndex++;
                    }
                    System.out.print("<ID, attr:sym-id:" + symbolTable.get(attr) + ", " + lexer.lineno + ":" + lexer.column + ">");
                    break;
                case 46:
                    // Puts the Defined Attributes in defineTable
                    String line = yylval.obj.toString();
                    String[] strArr = line.split(" ");
                    String newStr = strArr[1];
                    String tokenStr = strArr[2];
                    String lexeme = "";
                    if (tokenStr.equals("int"))
                    {
                        lexeme = "<INT, ";
                        defineTable.put(newStr, lexeme);
                    }
                    else if (tokenStr.equals("float"))
                    {
                        lexeme = "<FLOAT, ";
                        defineTable.put(newStr, lexeme);
                    }
                    else if (tokenStr.equals("bool"))
                    {
                        lexeme = "<BOOL, ";
                        defineTable.put(newStr, lexeme);
                    }
                    else if (tokenStr.equals("true"))
                    {
                        lexeme = "<BOOL_VALUE, attr:\"" + tokenStr + "\", ";
                        defineTable.put(newStr, lexeme);
                    }
                    else if (tokenStr.equals("false"))
                    {
                        lexeme = "<BOOL_VALUE, attr:\"" + tokenStr + "\", ";
                        defineTable.put(newStr, lexeme);
                    }
                    else if (tokenStr.matches("-?\\d+"))
                    {
                        lexeme = "<INT_VALUE, attr:\"" + tokenStr + "\", ";
                        defineTable.put(newStr, lexeme);
                    }
                    else
                    {
                        lexeme = "<FLOAT_VALUE, attr:\"" + tokenStr + "\", ";
                        defineTable.put(newStr, lexeme);
                    }
                    break;
            }

            if(token == 0)
            {
                // EOF is Reached
                System.out.println("Success!");
                return 0;
            }
            if(token == -1)
            {
                // Error
                return -1;
            }
        }
    }
}