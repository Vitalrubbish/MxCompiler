package AST;

import Utils.position;

public class ArrayCreatorNode extends CreatorNode {
    public TypeNode typeNode;
    public ArrayList<ExprNode> exprs;

    public ArrayCreatorNode(position pos, TypeNode typeNode, ArrayList<ExprNode> exprs) {
        super(pos);
        this.typeNode = typeNode;
        this.exprs = exprs;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}