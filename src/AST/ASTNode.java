package AST;

import Utils.position;

abstract public class ASTNode {
    public position pos;

    public ASTNode(position pos_) {
        this.pos = pos_;
    }

    abstract public void accept(ASTVisitor visitor);
}