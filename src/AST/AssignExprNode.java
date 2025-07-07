package AST;

import Utils.position;

public class AssignExprNode extends ExprNode {
    public ExprNode lhs, rhs;

    public AssignExprNode(position pos, ExprNode lhs, ExprNode rhs) {
        super(pos, false);
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}