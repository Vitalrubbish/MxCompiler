package AST;

import Utils.position;

public class ReturnStmtNode extends StmtNode {
    public ExprNode expr;

    public ReturnStmtNode(position pos, ExprNode expr) {
        super(pos);
        this.expr = expr;
    }

    @override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}