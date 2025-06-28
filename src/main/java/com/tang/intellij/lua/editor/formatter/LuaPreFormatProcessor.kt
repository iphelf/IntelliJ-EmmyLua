/*
 * Copyright (c) 2017. tangzx(love.tangzx@qq.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tang.intellij.lua.editor.formatter

import com.intellij.application.options.CodeStyle
import com.intellij.lang.ASTNode
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiDocumentManager
import com.intellij.psi.PsiElement
import com.intellij.psi.impl.source.codeStyle.PreFormatProcessor
import com.intellij.psi.tree.IElementType
import com.intellij.util.DocumentUtil
import com.tang.intellij.lua.psi.LuaPsiFile
import com.tang.intellij.lua.psi.LuaTypes
import com.tang.intellij.lua.psi.LuaVisitor

/**
 * 在语句末加分号;
 * Created by tangzx on 2017/7/8.
 */
class LuaPreFormatProcessor : PreFormatProcessor {
    private var nodeSet = setOf<IElementType>(
        LuaTypes.EXPR_STAT,
        LuaTypes.BREAK_STAT,
        LuaTypes.CONTINUE_STAT,
        LuaTypes.GOTO_STAT,
        LuaTypes.RETURN_STAT,
        LuaTypes.ASSIGN_STAT,
        LuaTypes.LOCAL_DEF,
        LuaTypes.LOCAL_FUNC_DEF,
    )

    override fun process(astNode: ASTNode, sourceRange: TextRange): TextRange {
        val psi = astNode.psi
        if (psi.containingFile is LuaPsiFile) {
            val settings = CodeStyle.getCustomSettings(psi.containingFile, LuaCodeStyleSettings::class.java)
            if (settings.END_LINE_WITH_SEMICOLON)
                processEndingLineWithSemicolons(psi, sourceRange)
        }
        return sourceRange
    }

    private fun processEndingLineWithSemicolons(psi: PsiElement, sourceRange: TextRange): Int {
        val list = mutableListOf<Int>()
        psi.accept(object : LuaVisitor() {
            override fun visitElement(o: PsiElement) {
                if (sourceRange.contains(o.textRange)
                    && o.node.elementType in nodeSet
                    && !o.node.text.endsWith(";")
                )
                    list.add(o.node.startOffset + o.node.textLength)
                o.acceptChildren(this)
            }
        })
        val psiDocumentManager = PsiDocumentManager.getInstance(psi.project)
        val document = psiDocumentManager.getDocument(psi.containingFile)
        document ?: return 0
        val set = list.toSortedSet()
        DocumentUtil.executeInBulk(document, true) {
            psiDocumentManager.doPostponedOperationsAndUnblockDocument(document)
            set.reversed().forEach {
                document.insertString(it, ";")
            }
            psiDocumentManager.commitDocument(document)
        }
        return set.size
    }
}