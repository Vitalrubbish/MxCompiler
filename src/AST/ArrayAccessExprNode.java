package AST;

import Utils.position;

public class ArrayAccessExprNode extends ExprNode {
    public ExprNode arrayName;
    public ExprNode indexName;
    
    public ArrayAccessExprNode(position pos, ExprNode arrayName, ExprNode indexName) {
        super(pos, true);
        this.arrayName = arrayName;
        this.indexName = indexName;
    }

    @override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}