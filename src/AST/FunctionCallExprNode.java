package AST;

import Utils.position;

public class FunctionCallExprNode extends ExprNode {
    public IdentifierExprNode identifierExpr;
    public ArgListNode argList;

    public FunctionCallExprNode(position pos, IdentifierExprNode identifierExpr, ArgListNode argList) {
        super(pos, false);
        this.identifierExpr = identifierExpr;
        this.argList = argList;
    }

    @override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}