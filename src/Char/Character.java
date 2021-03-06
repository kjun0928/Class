package Char;

import java.util.ArrayList;

public class Character {
	
	private String mName;
	private int mLevel;

	private ArrayList<Item> mItems;
	private ArrayList<Skill> mSkills;
	/*
	private String _Name;
	private int _Level;
	*/
	private long mGUID;
	
	private ItemManager mItemManager;
	
	public Character(String name,long guid) {
		mName = name;
		mLevel = 1;
		mItems = new ArrayList<Item>();
		mSkills = new ArrayList<Skill>();
		mGUID = guid;
		
		mItemManager = new ItemManager();
		/*
		this.mName = name;
		this.mLevel = 1;
		*/
		/*
		_Name = name;
		_Level = 1;
		*/
		initItems();
	}
	private void initItems() {
		createItem(ItemDefine.BLACK_STICK,1);
		createItem(ItemDefine.BLUE_STICK, 3);
		createItem(ItemDefine.PINK_STICK, 5);
		createItem(ItemDefine.YELLOW_STICK,2);
	}

	public boolean createItem(int itemCode, int itemAcount) {
		mItems.add(mItemManager.createItem(itemCode, itemAcount));
		return true;
	}
	public boolean removeItem(long guid) {
		return true;
	}

}
