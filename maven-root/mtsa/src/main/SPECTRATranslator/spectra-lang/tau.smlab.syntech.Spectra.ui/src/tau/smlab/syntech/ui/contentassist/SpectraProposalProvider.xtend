/*
Copyright (c) since 2015, Tel Aviv University and Software Modeling Lab

All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:
    * Redistributions of source code must retain the above copyright
      notice, this list of conditions and the following disclaimer.
    * Redistributions in binary form must reproduce the above copyright
      notice, this list of conditions and the following disclaimer in the
      documentation and/or other materials provided with the distribution.
    * Neither the name of Tel Aviv University and Software Modeling Lab nor the
      names of its contributors may be used to endorse or promote products
      derived from this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL Tel Aviv University and Software Modeling Lab 
BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR 
CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE 
GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) 
HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT 
LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT 
OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. 
*/

/*
 * generated by Xtext 2.10.0
 */
package tau.smlab.syntech.ui.contentassist

import java.util.List
import javax.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.CrossReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.Keyword
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import tau.smlab.syntech.services.SpectraGrammarAccess
import tau.smlab.syntech.spectra.Decl
import tau.smlab.syntech.spectra.Model
import tau.smlab.syntech.spectra.Pattern
import tau.smlab.syntech.spectra.PatternParam
import tau.smlab.syntech.spectra.Predicate
import tau.smlab.syntech.spectra.TemporalPrimaryExpr
import tau.smlab.syntech.spectra.TemporalRelationalExpr
import tau.smlab.syntech.spectra.TypeConstant
import tau.smlab.syntech.spectra.TypedParam
import tau.smlab.syntech.spectra.TypedParamList
import tau.smlab.syntech.spectra.Var
import tau.smlab.syntech.spectra.VarDecl
import tau.smlab.syntech.spectra.VarType
import tau.smlab.syntech.typesystem.TypeSystemTemporalRelationalExpr
import tau.smlab.syntech.typesystem.TypeSystemUtils
import tau.smlab.syntech.spectra.TypeDef
import tau.smlab.syntech.spectra.Define
import tau.smlab.syntech.spectra.DefineDecl
import tau.smlab.syntech.spectra.Monitor
import tau.smlab.syntech.spectra.Counter

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class SpectraProposalProvider extends AbstractSpectraProposalProvider {

  @Inject SpectraGrammarAccess grammarAccess;

  override complete_Model(EObject model, RuleCall ruleCall, ContentAssistContext context,
    ICompletionProposalAcceptor acceptor) {
    acceptor.accept(createCompletionProposal(grammarAccess.modelAccess.specKeyword_1_1.value, context))
    super.complete_Model(model, ruleCall, context, acceptor)
  }

  override complete_Import(EObject model, RuleCall ruleCall, ContentAssistContext context,
    ICompletionProposalAcceptor acceptor) {
    acceptor.accept(createCompletionProposal(grammarAccess.importAccess.importKeyword_0.value, context))
    super.complete_Import(model, ruleCall, context, acceptor)
  }

  override completeVar_Kind(EObject model, Assignment assignment, ContentAssistContext context,
    ICompletionProposalAcceptor acceptor) {
    acceptor.accept(createCompletionProposal(grammarAccess.varOwnerAccess.SYSOutputKeyword_0_0.value, context))
    acceptor.accept(createCompletionProposal(grammarAccess.varOwnerAccess.SYSOutKeyword_1_0.value, context))
    acceptor.accept(createCompletionProposal(grammarAccess.varOwnerAccess.SYSSysvarKeyword_2_0.value, context))
    acceptor.accept(createCompletionProposal(grammarAccess.varOwnerAccess.SYSSysKeyword_3_0.value, context))
    acceptor.accept(createCompletionProposal(grammarAccess.varOwnerAccess.ENVInputKeyword_4_0.value, context))
    acceptor.accept(createCompletionProposal(grammarAccess.varOwnerAccess.ENVInKeyword_5_0.value, context))
    acceptor.accept(createCompletionProposal(grammarAccess.varOwnerAccess.ENVEnvvarKeyword_6_0.value, context))
    acceptor.accept(createCompletionProposal(grammarAccess.varOwnerAccess.ENVEnvKeyword_7_0.value, context))
    acceptor.accept(createCompletionProposal(grammarAccess.varOwnerAccess.AUXAuxvarKeyword_8_0.value, context))
    acceptor.accept(createCompletionProposal(
      grammarAccess.varOwnerAccess.AUXAuxKeyword_9_0.value,
      context
    ))
  }
  
  override complete_LTLGar(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    super.complete_LTLGar(model, ruleCall, context, acceptor)
    acceptor.accept(createCompletionProposal(grammarAccess.LTLGarAccess.iniKeyword_2_0_0_0.value, context))
    acceptor.accept(createCompletionProposal(grammarAccess.LTLGarAccess.safetyTransKeyword_2_0_0_2_0_1.value, context))
    acceptor.accept(createCompletionProposal(grammarAccess.LTLGarAccess.justiceAlwEvKeyword_2_0_0_4_0_1.value, context))
    acceptor.accept(createCompletionProposal(grammarAccess.LTLGarAccess.stateInvAlwKeyword_2_0_0_3_0_1.value, context))
  }
  
  override complete_LTLAsm(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    super.complete_LTLAsm(model, ruleCall, context, acceptor)
    acceptor.accept(createCompletionProposal(grammarAccess.LTLAsmAccess.iniKeyword_2_0_0_0.value, context))
    acceptor.accept(createCompletionProposal(grammarAccess.LTLAsmAccess.safetyTransKeyword_2_0_0_2_0_1.value, context))
    acceptor.accept(createCompletionProposal(grammarAccess.LTLAsmAccess.justiceAlwEvKeyword_2_0_0_4_0_1.value, context))
    acceptor.accept(createCompletionProposal(grammarAccess.LTLAsmAccess.stateInvAlwKeyword_2_0_0_3_0_1.value, context))
  }

  override completeTypedParam_Type(EObject model, Assignment assignment, ContentAssistContext context,
    ICompletionProposalAcceptor acceptor) {
    lookupCrossReference((assignment.getTerminal() as CrossReference), context, acceptor);
  }

  override completeTemporalPrimaryExpr_PredPattParams(EObject model, Assignment assignment,
    ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    // get possible legal(in the right type) params to the reference predicate/pattern
    val root = EcoreUtil2.getContainerOfType(model, Model)
    val theLegalParamsVar = newArrayList
    var tpe = context.getCurrentModel() as TemporalPrimaryExpr
    if ((tpe.getPredPatt() !== null) && (tpe.getPredPatt() instanceof Predicate)) {

      var predicate = tpe.getPredPatt() as Predicate;
      var predicateParamsList = predicate.getParams() as TypedParamList;
      var predicatesParamParam = predicateParamsList.getParams() as List<TypedParam>

      val elements = root.elements
      val List<VarDecl> varDecls = newArrayList()

      for (Decl elem : elements) {
        if (elem instanceof Var) {
          var var1 = elem as Var
          varDecls.add(var1.^var)
        }

      }
      for (TypedParam param : predicatesParamParam) {
        for (VarDecl vd : varDecls) {
          if (TypeSystemUtils.isSameVarType(vd.type, param.type)) {
            theLegalParamsVar.add(vd)
          }
        }

      }

    }

    if ((tpe.getPredPatt() !== null) && (tpe.getPredPatt() instanceof Pattern)) {
      val List<VarDecl> varDecls = newArrayList()
      val elements = root.elements

      for (Decl elem : elements) {
        if (elem instanceof Var) {
          var var1 = elem as Var
          varDecls.add(var1.^var)
        }
      }
      for (VarDecl vd : varDecls) {
        if (vd.type !== null && vd.type.name !== null) {
          if (vd.type.name.equals(grammarAccess.varTypeAccess.getNameBooleanKeyword_0_0_0().value)) {
            theLegalParamsVar.add(vd)
          }
        }
      }

    }

    for (i : 0 .. (theLegalParamsVar.size - 1)) {
      acceptor.accept(createCompletionProposal(theLegalParamsVar.get(i).name, context))
    }
    completeRuleCall((assignment.getTerminal() as RuleCall), context, acceptor);
  }

  override completeTemporalPrimaryExpr_Pointer(EObject model, Assignment assignment, ContentAssistContext context,
    ICompletionProposalAcceptor acceptor) {
    val theLegalParamsVar = newArrayList
    val root = EcoreUtil2.getContainerOfType(model, Model)

    // adding defines
    var declsList = root.elements as List<Decl>
    for (Decl decl : declsList) {
      if (decl instanceof Define) {
        var define = decl as Define
        var defineDeclsList = define.defineList as List<DefineDecl>
        for (DefineDecl defineDecl : defineDeclsList) {
          theLegalParamsVar.add(defineDecl);
        }
      }
      if (decl instanceof Monitor) {
        var monitor = decl as Monitor
        theLegalParamsVar.add(monitor);
      }
      if (decl instanceof Counter) {
        var counter = decl as Counter
        theLegalParamsVar.add(counter);
      }
    }

    var currModel = context.getCurrentModel()
    if (currModel instanceof TemporalRelationalExpr) { // we have "something= " (something is Referrable because it's the pointer) and we want to complete the right side of the TemporalRelationalExpr
      var tre = currModel as TemporalRelationalExpr
      var tpe = tre.left as TemporalPrimaryExpr

      if (TypeSystemUtils.extractDomainVarDeclFromTemporalPrimaryExpr(tpe) !== null) { // left side of the TemporalRelationalExpr is VarDecl
        var vd = TypeSystemUtils.extractDomainVarDeclFromTemporalPrimaryExpr(tpe) as VarDecl
        var vd_mtpe = new MyTemporalPrimaryExpr();
        vd_mtpe.pointer = vd
        if (EcoreUtil2.getContainerOfType(vd, Pattern) === null) { // pattern can't see varDecls outside his scope
          var List<MyTemporalPrimaryExpr> varDeclsTPE = newArrayList()
          varDeclsTPE.addAll(returnVarDeclsAsMyTemporalPrimaryExpr(root))
          for (MyTemporalPrimaryExpr mtpe : varDeclsTPE) {
            if (TypeSystemTemporalRelationalExpr.typeCheckVarDeclvsVarDecl(vd_mtpe, mtpe) === null) {
              theLegalParamsVar.add(mtpe.getPointerVarDecl())
            }
          }
        } else { // pattern can see only varDecls in his scope
          var patt = EcoreUtil2.getContainerOfType(vd, Pattern) as Pattern
          var varDecls = patt.varDeclList
          var varDeclsTpe = newArrayList()
          for (VarDecl vardec : varDecls) {
            var mytpe = new MyTemporalPrimaryExpr();
            mytpe.pointer = vardec
            varDeclsTpe.add(mytpe)
          }
          for (MyTemporalPrimaryExpr mtpe : varDeclsTpe) {
            if (TypeSystemTemporalRelationalExpr.typeCheckVarDeclvsVarDecl(vd_mtpe, mtpe) === null) { // check which varDecl in the current file can be legal completion
              theLegalParamsVar.add(mtpe.getPointerVarDecl())
            }
          }
        }

        var vartype = vd.type as VarType
        if (vartype.const !== null) {
          theLegalParamsVar.addAll(vartype.const)
        }
        if (vartype.type instanceof TypeDef) {
          var typedef = vartype.type as TypeDef
          if (typedef.type !== null) {
            var typeDefType = typedef.type as VarType
            theLegalParamsVar.addAll(typeDefType.const)
          }
        }

        if ((vartype.name !== null) &&
          (vartype.name.equals(grammarAccess.varTypeAccess.getNameBooleanKeyword_0_0_0().value))) {

          acceptor.accept(
            createCompletionProposal(grammarAccess.constantAccess.booleanValueFalseKeyword_1_1_0.value, context))
          acceptor.accept(
            createCompletionProposal(grammarAccess.constantAccess.booleanValueTrueKeyword_1_3_0.value, context))

        }
      } else if (TypeSystemUtils.extractTypedParamFromTemporalPrimaryExpr(tpe) !== null) { // left side of the TemporalRelationalExpr is TypedParam
        var typeParam = TypeSystemUtils.extractTypedParamFromTemporalPrimaryExpr(tpe) as TypedParam

        var List<VarDecl> varDecls = newArrayList
        val elements = root.elements

        for (Decl elem : elements) {
          if (elem instanceof Var) {
            var var1 = elem as Var
            varDecls.add(var1.^var)
          }

        }
        for (VarDecl vd : varDecls) {
          if (TypeSystemUtils.isSameVarType(vd.type, typeParam.type)) {
            theLegalParamsVar.add(vd)
          }
        }
        theLegalParamsVar.add(typeParam)
      } else if (TypeSystemUtils.extractTypeConstantFromTemporalPrimaryExpr(tpe) !== null) { // left side of the TemporalRelationalExpr is TypeConstant
        var typeConst = TypeSystemUtils.extractTypeConstantFromTemporalPrimaryExpr(tpe) as TypeConstant
        // theLegalParamsVar.add(typeConst)
        var tc_mtpe = new MyTemporalPrimaryExpr();
        tc_mtpe.pointer = typeConst
        if (EcoreUtil2.getContainerOfType(typeConst, Pattern) === null) { // pattern can't see varDecls outside his scope
          var List<MyTemporalPrimaryExpr> varDeclsTPE = newArrayList()
          varDeclsTPE.addAll(returnVarDeclsAsMyTemporalPrimaryExpr(root))
          for (MyTemporalPrimaryExpr mtpe : varDeclsTPE) {
            if (TypeSystemTemporalRelationalExpr.typeCheckVarDeclVsTypeConstant(mtpe, tc_mtpe) === null) { // check which varDecl in the current file can be legal completion
              theLegalParamsVar.add(mtpe.getPointerVarDecl())
            }
          }
        } else { // pattern can see only varDecls in his scope
          var patt = EcoreUtil2.getContainerOfType(typeConst, Pattern) as Pattern
          var varDecls = patt.varDeclList
          var varDeclsTpe = newArrayList()
          for (VarDecl vd : varDecls) {
            var mytpe = new MyTemporalPrimaryExpr();
            mytpe.pointer = vd
            varDeclsTpe.add(mytpe)
          }
          for (MyTemporalPrimaryExpr mtpe : varDeclsTpe) {
            if (TypeSystemTemporalRelationalExpr.typeCheckVarDeclVsTypeConstant(mtpe, tc_mtpe) === null) { // check which varDecl in the current file can be legal completion
              theLegalParamsVar.add(mtpe.getPointerVarDecl())
            }
          }

        }

      } else if (TypeSystemUtils.extractPatternParamFromTemporalPrimaryExpr(tpe) !== null) {
        // var pattParam = TypeSystemUtils.extractPatternParamFromTemporalPrimaryExpr(tpe) as PatternParam
        acceptor.accept(
          createCompletionProposal(grammarAccess.constantAccess.booleanValueFalseKeyword_1_1_0.value, context))
        acceptor.accept(
          createCompletionProposal(grammarAccess.constantAccess.booleanValueTrueKeyword_1_3_0.value, context))

      }

    } else { // we do Ctrl + space
      if (EcoreUtil2.getContainerOfType(currModel, Pattern) !== null) {
        var patt = EcoreUtil2.getContainerOfType(currModel, Pattern) as Pattern
        var vardecls = patt.varDeclList
        theLegalParamsVar.addAll(vardecls)
        for (VarDecl vd : vardecls) {
          if (vd.type.const !== null) {
            theLegalParamsVar.addAll(vd.type.const)
          }
        }
        if (patt.params !== null) {
          var pattParam = patt.params.params as List<PatternParam>

          for (PatternParam pp : pattParam) {
            theLegalParamsVar.add(pp)

          }
        }
      } else {
        val elements = root.elements

        for (Decl elem : elements) {
          if (elem instanceof Var) {
            var var1 = elem as Var
            theLegalParamsVar.add(var1.^var)
            if (var1.^var.type.const !== null) {
              theLegalParamsVar.addAll(var1.^var.type.const)
            }
          }
        }
        if (EcoreUtil2.getContainerOfType(currModel, Predicate) !== null) {
          var pred = EcoreUtil2.getContainerOfType(currModel, Predicate)
          theLegalParamsVar.addAll(pred.params.params as List<TypedParam>)
        }
      }

    }
    if (theLegalParamsVar.size > 0) {
      for (i : 0 .. (theLegalParamsVar.size - 1)) {
        acceptor.accept(createCompletionProposal(theLegalParamsVar.get(i).name, context))

      }
    }
  }

//return all VarDecl in file as MyTemporalPrimaryExpr so we can use functions from "TypeSystemTemporalRelationalExpr" file.
  def List<MyTemporalPrimaryExpr> returnVarDeclsAsMyTemporalPrimaryExpr(Model root) {
    val elements = root.elements
    var List<MyTemporalPrimaryExpr> varDeclsTpe = newArrayList
    for (Decl elem : elements) {
      if (elem instanceof Var) {
        var var1 = elem as Var
        var mytpe = new MyTemporalPrimaryExpr();
        mytpe.pointer = var1.^var
        varDeclsTpe.add(mytpe)
      }

    }
    return varDeclsTpe
  }

  override void complete_INT(EObject model, RuleCall ruleCall, ContentAssistContext context,
    ICompletionProposalAcceptor acceptor) {
  }

  // this method override the default completeKeyword we don't want because it's adding a lot of bad auto-completion
  // So, we need to keep the signature of this method like this.
  override completeKeyword(Keyword keyword, ContentAssistContext contentAssistContext,
    ICompletionProposalAcceptor acceptor) {
  }
  
  override complete_Counter(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
//        acceptor.accept(
//          createCompletionProposal(grammarAccess.counterAccess.decKeyword_4_0_3_0.toString, context))
//                acceptor.accept(
//          createCompletionProposal(grammarAccess.counterAccess.incKeyword_4_0_2_0.toString, context))
//                  acceptor.accept(
//          createCompletionProposal(grammarAccess.counterAccess.resetKeyword_4_0_1_0.toString, context))  
  }
  
}
