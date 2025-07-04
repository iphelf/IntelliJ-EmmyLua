// This is a generated file. Not intended for manual editing.
package com.tang.intellij.lua.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.StubBasedPsiElement;
import com.tang.intellij.lua.stubs.LuaClassMethodStub;
import com.intellij.navigation.ItemPresentation;
import com.tang.intellij.lua.comment.psi.api.LuaComment;
import com.tang.intellij.lua.search.SearchContext;
import com.tang.intellij.lua.ty.ITy;

public interface LuaClassMethodDef extends LuaClassMethod, LuaDeclaration, LuaStatement, StubBasedPsiElement<LuaClassMethodStub> {

  @NotNull
  LuaClassMethodName getClassMethodName();

  @Nullable
  LuaFuncBody getFuncBody();

  @Nullable LuaComment getComment();

  @NotNull ITy guessParentType(@NotNull SearchContext context);

  @NotNull Visibility getVisibility();

  int getWorth();

  boolean isDeprecated();

  @NotNull List<@NotNull LuaParamNameDef> getParamNameDefList();

  @Nullable PsiElement getNameIdentifier();

  @NotNull PsiElement setName(@NotNull String name);

  @Nullable String getName();

  int getTextOffset();

  @NotNull ITy guessReturnType(@NotNull SearchContext searchContext);

  @NotNull LuaParamInfo @NotNull [] getParams();

  boolean isStatic();

  @NotNull ItemPresentation getPresentation();

}
