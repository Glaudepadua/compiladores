package syntacticTree;

import parser.Token;

public class ListTypeNode extends VarNode{

	public Token type;
	
	public ListTypeNode(Token t1, Token t2) {
		super(t1);
		type = t2;
	}

}
