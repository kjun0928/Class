package game;

import java.util.ArrayList;

public class Character {
	private String CName;
	private int CLevel;
	private int CHp;
	private int CMp;
	
	private ArrayList<Item> CItems;
	private ArrayList<Skill> CSkills;
	
	private long CGUID;
	
	private ItemManager CItemManager;
	private SkillManager CSkillManager;
	
	public Character(String name, long guid) {
		CName = name;
		CLevel = 1;
		CHp = 500;
		CMp = 100;
		CItems = new ArrayList<Item>();
		CSkills = new ArrayList<Skill>();
		CGUID = guid;
		
		CItemManager = new ItemManager();
		CSkillManager = new SkillManager();
		
		initItems();
		initSkills();
	}
	
	private void initItems() {
		createItem(ItemDef.SWORD,1);
		createItem(ItemDef.HAT,1);
		createItem(ItemDef.WATER,10);
		createItem(ItemDef.PANTS,1);
		
	}
	private void initSkills() {
		createSKill(SkillDef.FIRE, 10);
		createSKill(SkillDef.WATER, 10);
		createSKill(SkillDef.WIND, 10);
		
	}
	
	public boolean createSKill(int skillCode, int skillMana) {
		CSkills.add(CSkillManager.createSkill(skillCode,skillMana));
		return true;
	}

	public boolean createItem(int itemCode, int itemCount) {
		CItems.add(CItemManager.createItem(itemCode,itemCount));
		return true;
	}
	public boolean removeItem(long guid) {
		return true;
	}

}
