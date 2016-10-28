// This is a generated file. Not intended for manual editing.
package com.co11ter.gotemplate.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.co11ter.gotemplate.psi.GoTemplateTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.co11ter.gotemplate.psi.*;

public class GoTemplatePropertyImpl extends ASTWrapperPsiElement implements GoTemplateProperty {

  public GoTemplatePropertyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GoTemplateVisitor visitor) {
    visitor.visitProperty(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GoTemplateVisitor) accept((GoTemplateVisitor)visitor);
    else super.accept(visitor);
  }

}
