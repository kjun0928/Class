package Char;

public class Item {
	private String mName;
	private int mItemCode;
	private int mItemCount;
	private long mGUID;
	
	public Item(String name, int itemCode, int guid, int itemCount) {
		mName = name;
		mItemCode = itemCode;
		mGUID = guid;
		mItemCount = itemCount;
		
	}

}
