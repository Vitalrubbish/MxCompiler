package AST;

import Utils.position;

public class ClassCreatorNode extends creatorNode {
    public Type type;
    
    public ClassCreatorNode(position pos, Type type) {
        this.type = type;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}