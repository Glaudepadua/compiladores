package symtable;

public class EntryListVar extends EntryVar {

	public EntryTable listType;

	public EntryListVar(String n, EntryTable p, int d, EntryTable listType) {
		super(n, p, d);
		this.listType = listType;
	}

}
