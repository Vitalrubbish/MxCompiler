package AST;

import Utils.Type;
import Utils.position;
import java.util.ArrayList;

public class VarDefStmtNode extends StmtNode {
    public ArrayList<SingleVarDefNode> vars;

    public VarDefStmtNode(position pos, Type type, ArrayList<SingleVarDefNode> vars) {
        super(pos);
        this.vars = vars;
    }

    @override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}