package AST;

import Utils.position;

public class LiteralExprNode extends ExprNode {
    
    public LiteralExprNode(position pos) {
        super(pos, false);
    }
}