package AST;

import Utils.position;

public enum UnaryType {
    pos, neg, not, lnot
}

public class UnaryExprNode extends ExprNode {
    public ExprNode rhs;
    public UnaryType unaryType;

    public UnaryExprNode(position pos, ExprNode rhs, UnaryType unaryType) {
        super(pos, false);
        this.rhs = rhs;
        this.unaryType = unaryType;
    }

    @override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}