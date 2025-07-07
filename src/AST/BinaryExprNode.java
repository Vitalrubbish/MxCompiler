package AST;

import Utils.position;

public enum BinaryType {
    add, sub, mult, div, mod, and, or, xor, land, lor, eq, neq, shl, shr;
}

public class BinaryExprNode extends ExprNode {
    public ExprNode lhs, rhs;
    public CalcType calcType;

    public BinaryExprNode(position pos, ExprNode lhs, ExprNode rhs, CalcType calcType) {
        super(pos, false);
        this.lhs = lhs;
        this.rhs = rhs;
        this.calcType = calcType;
    }

    @override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}