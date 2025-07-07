package AST;

import Utils.position;

public enum IdentifierType {
    funcName, variableName, className
}

public class IdentifierExprNode extends ExprNode {
    public String identifier;
    public IdentifierType identifierType;

    public IdentifierExprNode(position pos, String identifier, IdentifierType identifierType) {
        if (identifierType == IdentifierType.variableName) {
            super(pos, true);
        } else {
            super(pos, false);
        }
        this.identifier = identifier;
        this.identifierType = identifierType;
    }

    @override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}