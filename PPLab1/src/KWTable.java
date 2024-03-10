import java.util.Hashtable;
public class KWTable {

	private Hashtable mTable;
	public KWTable()
	{
		// Inicijalizcaija hash tabele koja pamti kljucne reci
		mTable = new Hashtable();
		mTable.put("eof", new Integer(sym.EOF));
		mTable.put("main", new Integer(sym.MAIN));
		mTable.put("exit", new Integer(sym.EXIT));
		mTable.put("id", new Integer(sym.ID));
		mTable.put("int", new Integer(sym.INT));
		mTable.put("float", new Integer(sym.FLOAT));
		mTable.put("bool", new Integer(sym.BOOL));
		mTable.put("assign", new Integer(sym.ASSIGN));
		mTable.put("semicolon", new Integer(sym.SEMICOLON));
                mTable.put("plus", new Integer(sym.PLUS));
		mTable.put("minus", new Integer(sym.MINUS));
		mTable.put("const", new Integer(sym.CONST));
		mTable.put("for", new Integer(sym.FOR));
		mTable.put("in", new Integer(sym.IN));
		mTable.put("opensquare", new Integer(sym.OPENSQUARE));
		mTable.put("closedsquare", new Integer(sym.CLOSEDSQUARE));
		mTable.put("apply", new Integer(sym.APPLY));
		mTable.put("true", new Integer(sym.TRUE));
		mTable.put("false", new Integer(sym.FALSE));
		mTable.put("comm", new Integer(sym.COMM));
                mTable.put("colon", new Integer(sym.COLON));
                mTable.put("comma", new Integer(sym.COMMA));
                mTable.put("type", new Integer(sym.TYPE));
	}
	
	/**
	 * Vraca ID kljucne reci 
	 */
	public int find(String keyword)
	{
		Object symbol = mTable.get(keyword);
		if (symbol != null)
			return ((Integer)symbol).intValue();
		
		// Ako rec nije pronadjena u tabeli kljucnih reci radi se o identifikatoru
		return sym.ID;
	}
	

}
