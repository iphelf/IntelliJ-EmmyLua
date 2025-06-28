// This is a generated file. Not intended for manual editing.
package com.tang.intellij.lua.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.tang.intellij.lua.psi.LuaTypes.*;
import com.intellij.extapi.psi.StubBasedPsiElementBase;
import com.tang.intellij.lua.stubs.LuaFuncStub;
import com.tang.intellij.lua.psi.*;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiReference;
import com.tang.intellij.lua.comment.psi.api.LuaComment;
import com.tang.intellij.lua.search.SearchContext;
import com.tang.intellij.lua.ty.ITy;
import com.tang.intellij.lua.ty.ITyClass;
import com.intellij.psi.stubs.IStubElementType;
import org.jetbrains.annotations.ApiStatus.Experimental;
import com.intellij.psi.tree.IElementType;

public class LuaFuncDefImpl extends StubBasedPsiElementBase<LuaFuncStub> implements LuaFuncDef {

  public LuaFuncDefImpl(@NotNull LuaFuncStub stub, @NotNull IStubElementType<?, ?> type) {
    super(stub, type);
  }

  public LuaFuncDefImpl(@NotNull LuaFuncStub stub, @NotNull IElementType type) {
    super(stub, type);
  }

  public LuaFuncDefImpl(@NotNull ASTNode node) {
    super(node);
  }

  public LuaFuncDefImpl(LuaFuncStub stub, IElementType type, ASTNode node) {
    super(stub, type, node);
  }

  public void accept(@NotNull LuaVisitor visitor) {
    visitor.visitFuncDef(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LuaVisitor) accept((LuaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public LuaFuncBody getFuncBody() {
    return PsiTreeUtil.getStubChildOfType(this, LuaFuncBody.class);
  }

  @Override
  @Nullable
  public PsiElement getId() {
    return findChildByType(ID);
  }

  @Override
  public @Nullable LuaComment getComment() {
    return LuaPsiImplUtilKt.getComment(this);
  }

  @Override
  public @NotNull ItemPresentation getPresentation() {
    return LuaPsiImplUtilKt.getPresentation(this);
  }

  @Override
  public @NotNull List<@NotNull LuaParamNameDef> getParamNameDefList() {
    return LuaPsiImplUtilKt.getParamNameDefList(this);
  }

  @Override
  public @Nullable PsiElement getNameIdentifier() {
    return LuaPsiImplUtilKt.getNameIdentifier(this);
  }

  @Override
  public @NotNull PsiElement setName(@NotNull String name) {
    return LuaPsiImplUtilKt.setName(this, name);
  }

  @Override
  public @Nullable String getName() {
    return LuaPsiImplUtilKt.getName(this);
  }

  @Override
  public int getTextOffset() {
    return LuaPsiImplUtilKt.getTextOffset(this);
  }

  @Override
  public @NotNull String toString() {
    return LuaPsiImplUtilKt.toString(this);
  }

  @Override
  public @NotNull ITy guessReturnType(@NotNull SearchContext searchContext) {
    return LuaPsiImplUtilKt.guessReturnType(this, searchContext);
  }

  @Override
  public @NotNull ITyClass guessParentType(@NotNull SearchContext searchContext) {
    return LuaPsiImplUtilKt.guessParentType(this, searchContext);
  }

  @Override
  public @NotNull Visibility getVisibility() {
    return LuaPsiImplUtilKt.getVisibility(this);
  }

  @Override
  public int getWorth() {
    return LuaPsiImplUtilKt.getWorth(this);
  }

  @Override
  public boolean isDeprecated() {
    return LuaPsiImplUtilKt.isDeprecated(this);
  }

  @Override
  public @NotNull LuaParamInfo @NotNull [] getParams() {
    return LuaPsiImplUtilKt.getParams(this);
  }

  @Override
  public @NotNull PsiReference @NotNull [] getReferences() {
    return LuaPsiImplUtilKt.getReferences(this);
  }

}
