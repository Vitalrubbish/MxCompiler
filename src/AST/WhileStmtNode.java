package AST;

import Utils.position;

public class WhileStmtNode extends StmtNode {
    public ExprNode conditionExpr;
    public StmtNode trueStmt;

    public WhileStmtNode(position pos, ExprNode conditionExpr, StmtNode trueStmt) {
        super(pos);
        this.conditionExpr = conditionExpr;
        this.trueStmt = trueStmt;
    }

    @override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}