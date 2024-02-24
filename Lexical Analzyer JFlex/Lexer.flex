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

%%

%class Lexer
%byaccj

%{
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
%}

define      = "#define "{identifier}" "({int} | {float} | "bool" | "int" | "float" | "true" | "false")
int         = [0-9]+
float       = [0-9]+("."[0-9]+)?
identifier  = [a-zA-Z][a-zA-Z0-9_]*
newline     = \n
whitespace  = [ \t\r]+
linecomment = "//".*
blockcomment= "/*"[^]*"*/"

%%

"continue"                          { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.CONTINUE   ; }
"return"                            { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.RETURN     ; }
"struct"                            { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.STRUCT     ; }
"begin"                             { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.BEGIN      ; }
"break"                             { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.BREAK      ; }
"false"                             { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.BOOL_VALUE ; }
"float"                             { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.FLOAT      ; }
"print"                             { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.PRINT      ; }
"value"                             { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.VALUE      ; }
"while"                             { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.WHILE      ; }
"addr"                              { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.ADDR       ; }
"bool"                              { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.BOOL       ; }
"else"                              { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.ELSE       ; }
"func"                              { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.FUNC       ; }
"size"                              { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.SIZE       ; }
"then"                              { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.THEN       ; }
"true"                              { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.BOOL_VALUE ; }
"void"                              { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.VOID       ; }
"and"                               { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.OP         ; }
"end"                               { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.END        ; }
"int"                               { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.INT        ; }
"new"                               { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.NEW        ; }
"not"                               { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.OP         ; }
"var"                               { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.VAR        ; }
"if"                                { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.IF         ; }
"or"                                { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.OP         ; }
"::"                                { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.TYPEOF     ; }
":="                                { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.ASSIGN     ; }
"<>"                                { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.RELOP      ; }
"<="                                { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.RELOP      ; }
">="                                { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.RELOP      ; }
"("                                 { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.LPAREN     ; }
")"                                 { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.RPAREN     ; }
"["                                 { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.LBRACKET   ; }
"]"                                 { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.RBRACKET   ; }
";"                                 { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.SEMI       ; }
","                                 { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.COMMA      ; }
"."                                 { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.DOT        ; }
"+"                                 { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.OP         ; }
"-"                                 { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.OP         ; }
"*"                                 { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.OP         ; }
"<"                                 { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.RELOP      ; }
">"                                 { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.RELOP      ; }
"="                                 { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.RELOP      ; }
{int}"." | "."{int} | {int}"E"{int} | {int}"."{int}"E"{int} { System.out.println("\nLexical error: unexpected character '" + yytext() + "' at " + lineno + ":" + column + "."); return -1; }
{int}                               { String lexeme = yytext();
                                      parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.INT_LIT    ; }
{float}                             { String lexeme = yytext();
                                      parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.FLOAT_LIT  ; }    
{identifier}                        { String lexeme = yytext();
                                      parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.IDENT      ; }
{define}                            { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.DEFINE     ; }
{linecomment}                       { System.out.print(yytext()); column = prevCol; prevCol += yytext().length(); /* skip */ }
{newline}                           { System.out.print("\n"); lineno++; column = 1; prevCol = 1; /* skip */ }
{whitespace}                        { System.out.print(yytext()); column = prevCol; prevCol += yytext().length(); /* skip */ }
{blockcomment}                      { System.out.print(yytext());
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
"/"                                 { parser.yylval = new ParserVal((Object)yytext()); column = prevCol; prevCol += yytext().length(); return Parser.OP          ; }


"\b"     { column = prevCol; System.out.println("\nLexical error: backspace character '" + yytext() + "' at " + lineno + ":" + column + "."); return -1; }

/* error fallback */
[^]    { column = prevCol; System.out.println("\nLexical error: unexpected character '" + yytext() + "' at " + lineno + ":" + column + "."); return -1; }
