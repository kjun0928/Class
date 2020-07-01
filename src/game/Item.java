package game;

public class Item {
	private String CName;
	private int CItemCode;
	private int CItemCount;
	private long CGUID;
	
	public Item(String name, int itemCode, long guid, int itemCount) {
		CName = name;
		CItemCode = itemCode;
		CGUID = guid;
		CItemCount = itemCount;
	}
	
	public static Item createItem(String name, int itemCode, long guid, int itemCount) {
		return new Item(name,itemCode,guid,itemCount);
	}
}