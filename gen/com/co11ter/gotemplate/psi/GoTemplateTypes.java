// This is a generated file. Not intended for manual editing.
package com.co11ter.gotemplate.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.co11ter.gotemplate.psi.impl.*;

public interface GoTemplateTypes {

  IElementType PROPERTY = new GoTemplateElementType("PROPERTY");

  IElementType COMMENT = new GoTemplateTokenType("COMMENT");
  IElementType CRLF = new GoTemplateTokenType("CRLF");
  IElementType EXPRESSION = new GoTemplateTokenType("EXPRESSION");
  IElementType LEFT_DELIMITER = new GoTemplateTokenType("LEFT_DELIMITER");
  IElementType RIGHT_DELIMITER = new GoTemplateTokenType("RIGHT_DELIMITER");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == PROPERTY) {
        return new GoTemplatePropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
