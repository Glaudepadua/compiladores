package syntacticTree;

import parser.Token;

public class InterfaceDeclNode extends GeneralNode {
	public Token name;
	public Token supername;
	public Token modifier;
	public InterfaceBodyNode body;

	public InterfaceDeclNode(Token t1, Token t2, Token t3, Token t4,
			InterfaceBodyNode c) {
		super(t1); // passa token de referência para construtor da superclasse
		name = t2;
		supername = t3;
		modifier = t4;
		body = c;
	}
}
