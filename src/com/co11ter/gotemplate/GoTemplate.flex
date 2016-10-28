package com.co11ter.gotemplate;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.co11ter.gotemplate.psi.GoTemplateTypes;
import com.intellij.psi.TokenType;

%%

%class GoTemplateLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

CRLF= \n|\r|\r\n
WHITE_SPACE=[\ \t\f]]
EXPRESSION_CHARACTER=[a-zA-Z0-9\ ]
LEFT_DELIMITER=\{\{
RIGHT_DELIMITER=\}\}

%state WAITING_VALUE

%%

<WAITING_VALUE> {CRLF}({CRLF}|{WHITE_SPACE})+               { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

<WAITING_VALUE> {WHITE_SPACE}+                              { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }

<YYINITIAL> {LEFT_DELIMITER}                                { yybegin(YYINITIAL); return GoTemplateTypes.LEFT_DELIMITER; }

<YYINITIAL> {RIGHT_DELIMITER}                               { yybegin(YYINITIAL); return GoTemplateTypes.RIGHT_DELIMITER; }

<YYINITIAL> {EXPRESSION_CHARACTER}+                         { yybegin(YYINITIAL); return GoTemplateTypes.EXPRESSION; }

({CRLF}|{WHITE_SPACE})+                                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

{WHITE_SPACE}+                                              { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

.                                                           { return TokenType.BAD_CHARACTER; }