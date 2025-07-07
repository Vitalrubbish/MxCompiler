package AST;

import Utils.position;

public class LiteralExprNode extends ExprNode {
    
    public LiteralNode(position pos) {
        super(pos, false);
    }
}