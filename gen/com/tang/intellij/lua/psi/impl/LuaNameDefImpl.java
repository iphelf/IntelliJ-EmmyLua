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
import com.tang.intellij.lua.stubs.LuaNameDefStub;
import com.tang.intellij.lua.psi.*;
import com.intellij.psi.search.SearchScope;
import com.intellij.psi.stubs.IStubElementType;
import org.jetbrains.annotations.ApiStatus.Experimental;
import com.intellij.psi.tree.IElementType;

public class LuaNameDefImpl extends StubBasedPsiElementBase<LuaNameDefStub> implements LuaNameDef {

  public LuaNameDefImpl(@NotNull LuaNameDefStub stub, @NotNull IStubElementType<?, ?> type) {
    super(stub, type);
  }

  public LuaNameDefImpl(@NotNull LuaNameDefStub stub, @NotNull IElementType type) {
    super(stub, type);
  }

  public LuaNameDefImpl(@NotNull ASTNode node) {
    super(node);
  }

  public LuaNameDefImpl(LuaNameDefStub stub, IElementType type, ASTNode node) {
    super(stub, type, node);
  }

  public void accept(@NotNull LuaVisitor visitor) {
    visitor.visitNameDef(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LuaVisitor) accept((LuaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getId() {
    return notNullChild(findChildByType(ID));
  }

  @Override
  public @NotNull String getName() {
    return LuaPsiImplUtilKt.getName(this);
  }

  @Override
  public @NotNull PsiElement setName(@NotNull String name) {
    return LuaPsiImplUtilKt.setName(this, name);
  }

  @Override
  public @NotNull PsiElement getNameIdentifier() {
    return LuaPsiImplUtilKt.getNameIdentifier(this);
  }

  @Override
  public @NotNull SearchScope getUseScope() {
    return LuaPsiImplUtilKt.getUseScope(this);
  }

}
