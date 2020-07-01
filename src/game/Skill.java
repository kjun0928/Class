package game;

public class Skill {
	private String Cname;
	private int CSkillCode;
	private int CSkillMana;
	
	public Skill(String name, int skillCode, int skillMana) {
		Cname = name;
		CSkillCode = skillCode;
		CSkillMana = skillMana;
	}
	
	public static Skill createSkill(String name, int skillCode, int skillMana) {
		return new Skill(name, skillCode, skillMana);
	}
}