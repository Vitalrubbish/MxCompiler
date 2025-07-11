package AST;

import Utils.position;

public class BreakStmtNode extends StmtNode {

    public BreakStmtNode(position pos) {
        super(pos);
    }

    @override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}