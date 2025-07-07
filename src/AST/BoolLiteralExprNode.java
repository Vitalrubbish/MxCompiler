package AST;

import Utils.position;

public class BoolLiteralExprNode extends LiteralExprNode {
    public boolean value;

    public BoolLiteralExprNode(position pos, boolean value) {
        super(pos, false);
        this.value = value;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}