package ast;

public interface ASTVisitor<T> {
    // Program
    T visit(RootNode node);
    
    // Declarations
    T visit(ClassDefNode node);
    T visit(NormalFuncDefNode node);
    T visit(ConstructorDefNode node);
    T visit(ParameterNode node);
    
    // Statements
    T visit(VarDefStmtNode node);
    T visit(IfStmtNode node);
    T visit(ForStmtNode node);
    T visit(WhileStmtNode node);
    T visit(BreakStmtNode node);
    T visit(ContinueStmtNode node);
    T visit(ReturnStmtNode node);
    T visit(BlockStmtNode node);
    T visit(ExprStmtNode node);
    
    // Expressions
    T visit(BinaryExprNode node);
    T visit(UnaryExprNode node);
    T visit(AssignExprNode node);
    T visit(TernaryExprNode node);
    T visit(MemberAccessExprNode node);
    T visit(ArrayAccessExprNode node);
    T visit(FunctionCallExprNode node);
    T visit(NewExprNode node);
    T visit(ArrayLiteralExprNode node);
    T visit(IdentifierExprNode node);
    
    // Literals
    T visit(IntLiteralExprNode node);
    T visit(BoolLiteralExprNode node);
    T visit(StringLiteralExprNode node);
    T visit(NullLiteralExprNode node);
    T visit(ThisExprNode node);
    
    // Types
    T visit(BuiltInTypeNode node);
    T visit(ClassTypeNode node);
    T visit(ArrayTypeNode node);
}