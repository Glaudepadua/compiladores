package syntacticTree;

import java.util.List;

import parser.Token;


public class ClassDeclNode extends GeneralNode {
    public Token name;
    public Token supername;
    public List<Token> interfaces;
    public Token modifier;
    public ClassBodyNode body;

    public ClassDeclNode(Token t1, Token t2, Token t3, Token t4, ClassBodyNode c, List<Token> i) {
        super(t1); // passa token de referência para construtor da superclasse
        name = t2;
        supername = t3;
        modifier = t4;
        body = c;
        interfaces = i;  
    }
}
