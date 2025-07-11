package AST;

import Utils.position;

public class IfStmtNode extends StmtNode {
    public ExprNode conditionExpr;
    public StmtNode trueStmt, falseStmt;
    
    public IfStmtNode(position pos, ExprNode conditionExpr, StmtNode trueStmt, StmtNode falseStmt) {
        super(pos);
        this.conditionExpr = conditionExpr;
        this.trueStmt = trueStmt;
        this.falseStmt = falseStmt;
    }

    @override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}