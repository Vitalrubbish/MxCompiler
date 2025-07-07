package AST;

import java.util.ArrayList;
import Utils.position;
import Utils.Type;

public class VariableElement {
    public Type type;
    public String identifier;

    public VariableElement(Type type, String identifier) {
        this.type = type;
        this.identifier = identifier;
    }
}

public class ArgListNode extends ASTNode {
    public ArrayList<VariableElement> argList = new ArrayList<> ();

    public ArgListNode(position pos, ArrayList<VariableElement> argList) {
        super(pos);
        this.argList = argList;
    }

    @override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}