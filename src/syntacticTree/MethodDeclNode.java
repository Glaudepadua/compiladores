package syntacticTree;

import parser.Token;

public class MethodDeclNode extends MethodInterfaceDeclNode {

    public MethodBodyNode body;
	
	public MethodDeclNode(Token t, int k, Token t2, Token t3, MethodBodyNode b) {
		super(t, k, t2, t3);
        body = b;
	}

}
