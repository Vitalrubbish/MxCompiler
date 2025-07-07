package AST;

import Utils.position;

public class ThisExprNode extends ExprNode {
    
    public ThisExprNode(position pos) {
        super(pos, false);
    }

    @override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}