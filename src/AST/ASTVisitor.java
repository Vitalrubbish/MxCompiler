package AST;

public interface ASTVisitor {

    void visit(RootNode node);

    void visit(ClassDefNode node);
    void visit(NormalFuncDefNode node);
    void visit(ConstructorDefNode node);
    void visit(ArgListNode node);
    void visit(ParameterNode node);
    void visit(SingleVarDefNode node);
    void visit(TypeNode node);

    void visit(VarDefStmtNode node);
    void visit(IfStmtNode node);
    void visit(ForStmtNode node);
    void visit(WhileStmtNode node);
    void visit(BreakStmtNode node);
    void visit(ContinueStmtNode node);
    void visit(ReturnStmtNode node);
    void visit(BlockStmtNode node);
    void visit(ExprStmtNode node);

    void visit(BinaryExprNode node);
    void visit(UnaryExprNode node);
    void visit(AssignExprNode node);
    void visit(TernaryExprNode node);
    void visit(MemberAccessExprNode node);
    void visit(ArrayAccessExprNode node);
    void visit(FunctionCallExprNode node);
    void visit(NewExprNode node);
    void visit(ArrayLiteralExprNode node);
    void visit(IdentifierExprNode node);
    void visit(ParenExprNode node);

    void visit(IntLiteralExprNode node);
    void visit(BoolLiteralExprNode node);
    void visit(StringLiteralExprNode node);
    void visit(NullLiteralExprNode node);
    void visit(ThisExprNode node);
}