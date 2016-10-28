package com.co11ter.gotemplate.psi;

import com.co11ter.gotemplate.GoTemplateLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.*;

public class GoTemplateElementType extends IElementType {
    public GoTemplateElementType(@NotNull @NonNls String debugName) {
        super(debugName, GoTemplateLanguage.INSTANCE);
    }
}
