package Char;

import java.util.HashMap;

public class ItemManager {
	private long mCurrentGUID = 10000000000L;
	
	private HashMap<Integer, String> mItemMap = new HashMap<Integer, String>();
	
	public ItemManager() {
		initItems();
	}
	
	private void initItems() {
		mItemMap.put(ItemDefine.RED_STICK, "red stick");
		mItemMap.put(ItemDefine.BLUE_STICK, "blue stick");
		mItemMap.put(ItemDefine.BLACK_STICK, "black stick");
		mItemMap.put(ItemDefine.ORANGE_STICK, "orange stick");
		mItemMap.put(ItemDefine.GREEN_STICK, "green stick");
		mItemMap.put(ItemDefine.YELLOW_STICK, "yellow stick");
		mItemMap.put(ItemDefine.WHITE_STICK, "white stick");
		mItemMap.put(ItemDefine.PINK_STICK, "pink stick");
		mItemMap.put(ItemDefine.MAGIC_STICK, "magic stick");
	}
	
	public long getGuiD() {
		mCurrentGUID += 1;
		return mCurrentGUID;
	}
	
	public Item createItem(int itemCode, int itemCount) {
		Object itemNameObj = mItemMap.get(itemCode);
		if (itemNameObj == null)
			return null;
		
		return Item.createItem((String)itemNameObj, itemCode, getGuiD(), itemCount);
	}

}
