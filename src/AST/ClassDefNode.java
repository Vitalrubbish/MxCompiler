package AST;

import Utils.position;
import java.util.ArrayList;

public class ClassDefNode extends ASTNode {
    public String identifier;
    public ArrayList<VarDefNode> varDefNodes;
    public ArrayList<FuncNode> funcs;

    public ClassDefNode(position pos, String identifier, ArrayList<VarDefNode> varDefNodes, ArrayList<FuncNode> funcs) {
        this.identifier = identifier;
        this.varDefNodes = varDefNodes;
        this.funcs = funcs;
    }

    @override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}