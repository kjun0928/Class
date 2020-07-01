package game;

import java.util.HashMap;

public class ItemManager {
	private long CCurrentGUID = 100000000000L;
	
	private HashMap<Integer, String> CItemMap = new HashMap<Integer, String>();
	
	public ItemManager() {
		initItems();
	}
	private void initItems() {
		CItemMap.put(ItemDef.SWORD, "Sword");
		CItemMap.put(ItemDef.HAT, "HAT");
		CItemMap.put(ItemDef.WATER, "WATER");
		CItemMap.put(ItemDef.PANTS, "PANTS");
	}
	
	public long getGuid() {
		CCurrentGUID +=1;
		return CCurrentGUID;
	}
	
	public Item createItem(int itemCode, int itemCount) {
		Object itemNameObj = CItemMap.get(itemCode);
		if (itemNameObj == null)
		return null;
		
		return Item.createItem((String)itemNameObj,itemCode, getGuid(), itemCount); 
	}

}
