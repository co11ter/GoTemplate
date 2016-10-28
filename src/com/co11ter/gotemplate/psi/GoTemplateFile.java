package com.co11ter.gotemplate.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.co11ter.gotemplate.*;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class GoTemplateFile extends PsiFileBase {
    public GoTemplateFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, GoTemplateLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return GoTemplateFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Go Template File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
