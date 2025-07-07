package AST;

import java.util.ArrayList;
import Utils.position;

public class ArgListNode extends ASTNode {
    public ArrayList<ExprNode> argList = new ArrayList<> ();

    public ArgListNode(position pos, ArrayList<ExprNode> argList) {
        super(pos);
        this.argList = argList;
    }

    @override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}