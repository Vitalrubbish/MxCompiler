package AST;

import Utils.position;
import Utils.Type;

public class TypeNode extends ASTNode {
    public Type type;

    public TypeNode(position pos, Type type) {
        super(pos);
        this.type = type;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}