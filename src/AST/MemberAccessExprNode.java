package AST;

import Utils.position;

public class MemberAccessExprNode extends ExprNode {
    public ExprNode expr;
    public IdentifierNode identifier;

    public MemberAccessExprNode(position pos, ExprNode expr, IdentifierNode identifier) {
        super(pos, true);
        this.expr = expr;
        this.identifier = identifier;
    }

    @override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}