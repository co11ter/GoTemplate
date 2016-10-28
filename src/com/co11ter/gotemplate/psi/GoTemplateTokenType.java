package com.co11ter.gotemplate.psi;

import com.co11ter.gotemplate.GoTemplateLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.*;

public class GoTemplateTokenType extends IElementType {
    public GoTemplateTokenType(@NotNull @NonNls String debugName) {
        super(debugName, GoTemplateLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "GoTemplateTokenType." + super.toString();
    }
}
