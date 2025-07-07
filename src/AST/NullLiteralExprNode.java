package AST;

import Utils.position;

public class NullLiteralExprNode extends LiteralExprNode {
    
    public NullLiteralExprNode(position pos) {
        super(pos);
    }

    @override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}