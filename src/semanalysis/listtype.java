package semanalysis;

import symtable.EntryTable;

public class listtype extends type {
	
    public EntryTable listType; // entrada na tabela do tipo

	public listtype(EntryTable t, int d, EntryTable listType) {
		super(t, d);
		this.listType = listType;
	}

}
