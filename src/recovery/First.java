package recovery;

import parser.ParserConstants;


public class First {

	static public final RecoverySet methoddecl = new RecoverySet();
	static public final RecoverySet vardecl = new RecoverySet();
	static public final RecoverySet classlist = new RecoverySet();
	static public final RecoverySet constructdecl = new RecoverySet();
	static public final RecoverySet statlist = new RecoverySet();
	static public final RecoverySet Start = classlist;

	static {
		methoddecl.add(new Integer(ParserConstants.INT));
		methoddecl.add(new Integer(ParserConstants.STRING));
		methoddecl.add(new Integer(ParserConstants.BOOLEAN));
		methoddecl.add(new Integer(ParserConstants.DOUBLE));
		methoddecl.add(new Integer(ParserConstants.IDENT));
		methoddecl.add(new Integer(ParserConstants.MODIFIER));
		methoddecl.add(new Integer(ParserConstants.VOID_CONSTANT));

		vardecl.add(new Integer(ParserConstants.INT));
		vardecl.add(new Integer(ParserConstants.STRING));
		vardecl.add(new Integer(ParserConstants.BOOLEAN));
		vardecl.add(new Integer(ParserConstants.DOUBLE));
		vardecl.add(new Integer(ParserConstants.IDENT));
		vardecl.add(new Integer(ParserConstants.MODIFIER));
		vardecl.add(new Integer(ParserConstants.VOID_CONSTANT));

		classlist.add(new Integer(ParserConstants.CLASS));

		constructdecl.add(new Integer(ParserConstants.MODIFIER));

		statlist.addAll(vardecl);
		statlist.add(new Integer(ParserConstants.IDENT)); // first do atribstat
		statlist.add(new Integer(ParserConstants.PRINT));
		statlist.add(new Integer(ParserConstants.READ));
		statlist.add(new Integer(ParserConstants.RETURN));
		statlist.add(new Integer(ParserConstants.SUPER));
		statlist.add(new Integer(ParserConstants.IF));
		statlist.add(new Integer(ParserConstants.FOR));
		statlist.add(new Integer(ParserConstants.LBRACE));
		statlist.add(new Integer(ParserConstants.BREAK));
		statlist.add(new Integer(ParserConstants.SEMICOLON));
	}
}
