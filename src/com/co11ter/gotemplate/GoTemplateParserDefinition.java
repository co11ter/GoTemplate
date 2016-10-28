package com.co11ter.gotemplate;

import com.intellij.lang.*;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.*;
import com.intellij.psi.tree.*;
import com.co11ter.gotemplate.parser.GoTemplateParser;
import com.co11ter.gotemplate.psi.*;
import org.jetbrains.annotations.NotNull;

public class GoTemplateParserDefinition implements ParserDefinition {
    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
    public static final TokenSet COMMENTS = TokenSet.create(GoTemplateTypes.COMMENT);

    public static final IFileElementType FILE =
            new IFileElementType(Language.<GoTemplateLanguage>findInstance(GoTemplateLanguage.class));

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new GoTemplateLexerAdapter();
    }

    @NotNull
    public TokenSet getWhitespaceTokens() {
        return WHITE_SPACES;
    }

    @NotNull
    public TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @NotNull
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    public PsiParser createParser(final Project project) {
        return new GoTemplateParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    public PsiFile createFile(FileViewProvider viewProvider) {
        return new GoTemplateFile(viewProvider);
    }

    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }

    @NotNull
    public PsiElement createElement(ASTNode node) {
        return GoTemplateTypes.Factory.createElement(node);
    }
}
