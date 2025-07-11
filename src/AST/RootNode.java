package AST;

import Util.position;
import java.util.ArrayList;

public class RootNode extends ASTNode {
    public ArrayList<ClassDefNode> classDefs = new ArrayList<>();
    public ArrayList<NormalFuncDefNode> funcDefs = new ArrayList<>();
    public ArrayList<VarDefExprNode> globalVarDefs = new ArrayList<>();

    public RootNode(position pos, ArrayList<ClassDefNode> classDefs, ArrayList<FuncDefNode> funcDefs, ArrayList<StmtNode> globalVarDefs) {
        super(pos)
        this.classDefs = classDefs;
        this.funcDefs = funcDefs;
        this.globalVarDefs = globalVarDefs;
    }

    @override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this)
    }
} 