package com.co11ter.gotemplate;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class GoTemplateLexerAdapter extends FlexAdapter {
    public GoTemplateLexerAdapter() {
        super(new GoTemplateLexer((Reader) null));
    }
}
