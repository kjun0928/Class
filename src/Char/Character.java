package Char;

import java.util.ArrayList;

public class Character {
	
	private String mName;
	private int mLevel;
	
	/*
	private String _Name;
	private int _Level;
	*/
	
	private ArrayList<Item> mItems;
	private ArrayList<Skill> mSkills;
	
	
	public Character(String name) {
		
		/*
		this.mName = name;
		this.mLevel = 1;
		*/
		
		/*
		_Name = name;
		_Level = 1;
		*/
		
		
		mItems = new ArrayList<Item>();
		mSkills = new ArrayList<Skill>();
		
		
	}

}
