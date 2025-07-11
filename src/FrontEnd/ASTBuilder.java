package Frontend;

import AST.*;
import parser.MxBaseVisitor;
import parser.MxParser;
import Util.Type;
import Util.position;
import org.antlr.v4.runtime.ParserRuleContext;

public class ASTBuilder extends MxBaseVisitor<ASTNode> {

	@Override public ASTNode visitProgram(MxParser.ProgramContext ctx) {
        position pos = new position(ctx);
        ArrayList<ClassDefNode> classDefs = new ArrayList<>();
        ArrayList<StmtNode> stmts = new ArrayList<>();
        ArrayList<FuncNode> funcs = new ArrayList<>();
        for (var classDef : ctx.classDef()) {
            ClassDefNode classDefNode = (ClassDefNode)visit(classDef);
            classDefs.add(classDefNode);
        }
        for (var stmt : ctx.statement()) {
            StmtNode stmtNode = (ClassDefNode)visit(stmt);
            stmts.add(stmtNode);
        }
        for (var func : ctx.function()) {
            FuncNode funcNode = (funcNode)visit(func);
            funcs.add(funcNode); 
        }
        return new RootNode(pos, classDefs, funcs, stmts);

    }

	@Override public ASTNode visitSingleVarDef(MxParser.SingleVarDefContext ctx) {
        position pos = new position(ctx);
        String identifier = ctx.Identifier().getText();
        ExprNode initEpxr = (ExprNode) visit(ctx.expression);
        return new SingleVarDefNode(pos, identifier, initExpr);
    }

	@Override public ASTNode visitVarDef(MxParser.VarDefContext ctx) {
		Type type;
		TypeContext typeContext = ctx.type();
		if (typeContext.Int() != null) {
			type = new Type("int");
		} else if (typeContext.Void() != null) {
			type = new Type("void");
		} else if (typeContext.Bool() != null) {
			type = new Type("bool");
		} else if (typeContext.String() != null) {
			type = new Type("string")
		} else if (typeContext.Identifier() != null) {
			type = new Type(typeContext.Identifier().getText())
		} else {
			TypeContext basicTypeContext = typeContext.type();
			int bracketCount = len(typeContext.LeftBracket());
			if (basicTypeContext.Int() != null) {
				type = new Type("int", bracketCount);
			} else if (basicTypeContext.Void() != null) {
				type = new Type("void", bracketCount);
			} else if (basicTypeContext.Bool() != null) {
				type = new Type("bool", bracketCount);
			} else if (basicTypeContext.String() != null) {
				type = new Type("string", bracketCount);
			} else (basicTypeContext.Identifier() != null) {
				type = new Type(basicTypeContext.Identifier().getText(), bracketCount);
			}
		}

		
	}

	@Override public ASTNode visitClassDef(MxParser.ClassDefContext ctx);

	@Override public ASTNode visitParameterList(MxParser.ParameterListContext ctx);

	@Override public ASTNode visitArgList(MxParser.ArgListContext ctx) {
        position pos = new position(ctx);
        ArrayList<ExprNode> exprs = new ArrayList<> ();
        for (var expr : ctx.expression()) {
            ExprNode exprNode = (ExprNode) visit(expr);
            exprs.add(exprNode);
        }
        return new ArgListNode(pos, exprs);
    }

	@Override public ASTNode visitNormalFunction(MxParser.NormalFunctionContext ctx);

	@Override public ASTNode visitConstructFunction(MxParser.ConstructFunctionContext ctx);

	T visitSuite(MxParser.SuiteContext ctx) {
        position pos = new position(ctx);
        ArrayList<StmtNode> stmts = new ArrayList<> ();
        for (var stmt : ctx.statement()) {
            StmtNode stmtNode = (StmtNode) visit(stmt);
            stmts.add(StmtNode);
        }
        return new BlockStmtNode(pos, stmts);
    }

	T visitBlockStmt(MxParser.BlockStmtContext ctx) {
        return visit(ctx.suite());
    }

	T visitVarDefStmt(MxParser.VarDefStmtContext ctx);

	T visitIfStmt(MxParser.IfStmtContext ctx) {
        position pos = new position(ctx);
        StmtNode trueStmtNode = (StmtNode) visit(ctx.trueStmt);
        StmtNode falseStmtNode = (StmtNode) visit(ctx.falseStmt);
        ExprNode conditionNode = (ExprNode) visit(ctx.expression());
        return new IfStmtNode(pos, conditionNode, trueStmtNode, falseStmtNode);
    }
	/**
	 * Visit a parse tree produced by the {@code forStmt}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(MxParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(MxParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code breakStmt}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(MxParser.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continueStmt}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStmt(MxParser.ContinueStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStmt}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(MxParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprStmt}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(MxParser.ExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pureStmt}
	 * labeled alternative in {@link MxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPureStmt(MxParser.PureStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#basicType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicType(MxParser.BasicTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MxParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpr(MxParser.NewExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thisExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpr(MxParser.ThisExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code memberAccess}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccess(MxParser.MemberAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteralExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteralExpr(MxParser.StringLiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullLiteralExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteralExpr(MxParser.NullLiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr(MxParser.BinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(MxParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(MxParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ternaryExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpr(MxParser.TernaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intLiteralExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteralExpr(MxParser.IntLiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAccess}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(MxParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(MxParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayLiteralExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteralExpr(MxParser.ArrayLiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolLiteralExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLiteralExpr(MxParser.BoolLiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(MxParser.AssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierExpr}
	 * labeled alternative in {@link MxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpr(MxParser.IdentifierExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayCreator}
	 * labeled alternative in {@link MxParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreator(MxParser.ArrayCreatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classCreator}
	 * labeled alternative in {@link MxParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreator(MxParser.ClassCreatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayCreatorWithLiteral}
	 * labeled alternative in {@link MxParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorWithLiteral(MxParser.ArrayCreatorWithLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(MxParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#boolLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLiteral(MxParser.BoolLiteralContext ctx);
}
