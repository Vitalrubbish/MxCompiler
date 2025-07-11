package AST;

import Utils.position;

public class ContinueStmtNode extends StmtNode {

    public ContinueStmtNode(position pos) {
        super(pos);
    }

    @override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}