package AST;

import Utils.position;

public class ExprStmtNode extends StmtNode {
    public ExprNode expr;

    public ExprStmtNode(position pos, ExprNode expr) {
        super(pos);
        this.expr = expr;
    }

    @override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}