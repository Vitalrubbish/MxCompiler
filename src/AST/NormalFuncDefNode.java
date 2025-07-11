package AST;

import Utils.Type
import Utils.position;

public class NormalFuncDefNode extends FuncNode {
    public Type type;
    public String identifier;
    public ParameterNode params;
    public BlockNode content;

    public NormalFuncDefNode(position pos, Type type, String identifier, ParameterNode params, BlockNode content) {
        super(pos);
        this.type = type;
        this.identifier = identifier;
        this.params = params;
        this.content = content;
    }

    @override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}