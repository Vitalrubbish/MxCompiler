package AST;

import Utils.position;

public class SingleVarDefNode {
    public String identifier;
    public ExprNode init;

    public VariableElement(position pos, String identifier, ExprNode init) {
        super(pos);
        this.identifier = identifier;
        this.init = init;
    }

    @override
    public void accpet(ASTVisitor visitor) {
        visitor.visit(this);
    }
}