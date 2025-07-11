package AST;

import Utils.position;

public class ArrayCreatorWithLiteralNode extends CreatorNode {
    public TypeNode typeNode;
    public ArrayLiteralExprNode arrayLiteral;

    public ArrayCreatorWithLiteralNode(position pos, TypeNode typeNode, ArrayLiteralExprNode arrayLiteral) {
        super(pos);
        this.typeNode = typeNode;
        this.arrayLiteral = arrayLiteral;
    }

    @override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}