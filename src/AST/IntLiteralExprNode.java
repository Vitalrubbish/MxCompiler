package AST;

import Utils.position;

public class StringLiteralExprNode extends LiteralExprNode {
    public int value;

    public StringLiteralExprNode(postion pos, int value) {
        super(pos);
        this.value = value;
    }

    @override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}