Author:     Quinn Trate
Date:       February 23, 2024
Class:      CMPSC 470 Section 1: Compilers
Instructor: Dr. Hyuntae Na
Decription: Takes .minc Files as Input and
            Returns Lexeme Tokens. Uses
            JFlex to Generate the Lexer.


Made and Compiled in UNIX Machine

Command for Generating Lexer.java:
java -jar jflex-1.6.1.jar Lexer.flex

Commands for Testing:
javac *.java && java Program testX.minc
javac Test.java && java Test
