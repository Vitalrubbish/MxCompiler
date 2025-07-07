package AST;

import Utils.position;

public class StringLiteralExprNode extends LiteralExprNode {
    public String value;

    public StringLiteralExprNode(postion pos, String value) {
        super(pos);
        this.value = value;
    }

    @override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}