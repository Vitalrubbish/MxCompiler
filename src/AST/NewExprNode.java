package AST;

import Utils.Type;
import java.util.ArrayList;
import Utils.position;

public class NewExprNode extends ExprNode {
    public Type type;
    public ArrayList<ExprNode> sizeNode;
    public int dimension;

    public NewExprNode(position pos, Type type, ArrayList<ExprNode> sizeNode, int dimension) {
        super(pos, false);
        this.type = type;
        this.sizeNode = sizeNode;
        this.dimension = dimension;
    }

    @override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}