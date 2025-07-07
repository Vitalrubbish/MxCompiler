package AST;

import Utils.position;
import java.util.ArrayList;

public class ArrayLiteralExprNode extends LiteralExprNode {
    public ArrayList<ExprNode> exprs;

    public ArrayLiteralExprNode(position pos, ArrayList<ExprNode> exprs) {
        super(pos);
        this.exprs = exprs;
    }

    @override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    } 
}