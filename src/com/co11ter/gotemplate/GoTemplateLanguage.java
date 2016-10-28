package com.co11ter.gotemplate;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.fileTypes.StdFileTypes;
import com.intellij.psi.templateLanguages.TemplateLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class GoTemplateLanguage extends Language implements TemplateLanguage {
    public static final GoTemplateLanguage INSTANCE = new GoTemplateLanguage();

    @SuppressWarnings("SameReturnValue")
    public static LanguageFileType getDefaultTemplateLang() {
        return StdFileTypes.HTML;
    }

    private GoTemplateLanguage() {
        super("GoTemplate");
    }

    public GoTemplateLanguage(@Nullable Language baseLanguage, @NotNull @NonNls final String ID, @NotNull @NonNls final String... mimeTypes) {
        super(baseLanguage, ID, mimeTypes);
    }
}
