package syntacticTree;

import parser.*;


public class MethodInterfaceDeclNode extends GeneralNode {
    public int dim;
    public Token name;
    public Token modifier;
    public ListNode params;

    public MethodInterfaceDeclNode(Token t, int k, Token t2, Token t3, ListNode params) {
        super(t);
        dim = k;
        name = t2;
        modifier = t3;
        this.params = params;
    }
}
