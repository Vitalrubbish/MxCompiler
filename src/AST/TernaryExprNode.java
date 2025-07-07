package AST;

import Utils.position;

public class TernaryExprNode extends ExprNode {
    ExprNode condition;
    ExprNode trueExpr;
    ExprNode falseExpr;

    public TenaryExprNode(position pos, ExprNode condition, ExprNode trueExpr, ExprNode falseExpr) {
        super(pos, false);
        this.condition = condition;
        this.trueExpr = trueExpr;
        this.falseExpr = falseExpr;
    }

    @override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}