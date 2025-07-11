package AST;

import Utils.position;

public class ParenExprNode extends ExprNode {
    public ExprNode expr;

    public ParenExprNode(position pos, ExprNode expr) {
        this.expr = expr;
    }

    @override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}