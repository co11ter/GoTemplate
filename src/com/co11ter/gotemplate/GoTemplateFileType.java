package com.co11ter.gotemplate;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.*;

import javax.swing.*;

public class GoTemplateFileType extends LanguageFileType {
    public static final GoTemplateFileType INSTANCE = new GoTemplateFileType();

    private GoTemplateFileType() {
        super(GoTemplateLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Go template file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Go template language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "gt";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return GoTemplateIcons.FILE;
    }
}
