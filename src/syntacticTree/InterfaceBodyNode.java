package syntacticTree;

import parser.Token;

public class InterfaceBodyNode extends GeneralNode {
	
    public ListNode mlist; // lista de métodos  

    public InterfaceBodyNode(Token t1, ListNode m){
    	super(t1);
    	this.mlist = m;
    }



}
