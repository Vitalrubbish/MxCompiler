package AST;

import Utils.position;
import java.util.ArrayList;

public class BlockStmtNode extends StmtNode {
    public ArrayList<StmtNode> stmts;

    public BlockStmtNode(position pos, ArrayList<StmtNode> stmts) {
        super(pos);
        this.stmts = stmts;
    }

    @override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}