package AST;

import Utils.position;

public class ForStmtNode extends StmtNode {
    public StmtNode initialStmt, trueStmt;
    public ExprNode forConditionExpr, stepExpr;

    public ForStmtNode(position pos, StmtNode initialStmt, ExprNode forConditionExpr, ExprNode stepExpr, StmtNode trueStmt) {
        super(pos);
        this.initialStmt = initialStmt;
        this.forConditionStmt = forConditionStmt;
        this.stepExpr = stepExpr;
        this.trueStmt = trueStmt;
    }

    @override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}