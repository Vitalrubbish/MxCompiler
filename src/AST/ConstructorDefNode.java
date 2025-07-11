package AST;

import Utils.position;

public class NormalFuncDefNode extends FuncNode {
    public String identifier;
    public BlockNode content;

    public NormalFuncDefNode(position pos, String identifier, BlockNode content) {
        super(pos);
        this.identifier = identifier;
        this.content = content;
    }

    @override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}