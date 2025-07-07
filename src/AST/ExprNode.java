package AST;

import Utils.position;

public class ExprNode extends ASTNode {
    public boolean is_left_value;
    public Type type;

    public ExprNode(position pos, boolean is_left_value) {
        super(pos);
        this.is_left_value = is_left_value;
    }
}s