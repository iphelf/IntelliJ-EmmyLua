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
import com.tang.intellij.lua.stubs.LuaTableFieldStub;
import com.tang.intellij.lua.psi.*;
import com.intellij.navigation.ItemPresentation;
import com.tang.intellij.lua.comment.psi.api.LuaComment;
import com.tang.intellij.lua.search.SearchContext;
import com.tang.intellij.lua.ty.ITy;
import com.intellij.psi.stubs.IStubElementType;
import org.jetbrains.annotations.ApiStatus.Experimental;
import com.intellij.psi.tree.IElementType;

public class LuaTableFieldImpl extends StubBasedPsiElementBase<LuaTableFieldStub> implements LuaTableField {

  public LuaTableFieldImpl(@NotNull LuaTableFieldStub stub, @NotNull IStubElementType<?, ?> type) {
    super(stub, type);
  }

  public LuaTableFieldImpl(@NotNull LuaTableFieldStub stub, @NotNull IElementType type) {
    super(stub, type);
  }

  public LuaTableFieldImpl(@NotNull ASTNode node) {
    super(node);
  }

  public LuaTableFieldImpl(LuaTableFieldStub stub, IElementType type, ASTNode node) {
    super(stub, type, node);
  }

  public void accept(@NotNull LuaVisitor visitor) {
    visitor.visitTableField(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LuaVisitor) accept((LuaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<LuaExpr> getExprList() {
    return PsiTreeUtil.getStubChildrenOfTypeAsList(this, LuaExpr.class);
  }

  @Override
  @Nullable
  public PsiElement getId() {
    return findChildByType(ID);
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
  public @Nullable String getFieldName() {
    return LuaPsiImplUtilKt.getFieldName(this);
  }

  @Override
  public @NotNull ItemPresentation getPresentation() {
    return LuaPsiImplUtilKt.getPresentation(this);
  }

  @Override
  public @NotNull ITy guessParentType(@NotNull SearchContext context) {
    return LuaPsiImplUtilKt.guessParentType(this, context);
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
  public @Nullable LuaComment getComment() {
    return LuaPsiImplUtilKt.getComment(this);
  }

  @Override
  public @Nullable LuaExpr getIdExpr() {
    return LuaPsiImplUtilKt.getIdExpr(this);
  }

  @Override
  @Nullable
  public PsiElement getLbrack() {
    return findChildByType(LBRACK);
  }

}
