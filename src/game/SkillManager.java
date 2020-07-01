package game;

import java.util.HashMap;

public class SkillManager {
	private HashMap CSkillMap = new HashMap();
	
	public SkillManager() {
		initSkills();
	}
	
	private void initSkills() {
		CSkillMap.put(SkillDef.FIRE,"fire");
		CSkillMap.put(SkillDef.WATER,"water");
		CSkillMap.put(SkillDef.WIND,"wind");
		CSkillMap.put(SkillDef.BIG_FIRE,"big fire");
		CSkillMap.put(SkillDef.BIG_WATER,"big water");
		CSkillMap.put(SkillDef.BIG_WIND,"big wind");
	}
	
	public Skill createSkill(int skillCode,int skillMana) {
		Object skillNameObj = CSkillMap.get(skillCode);
		if (skillNameObj == null)
			return null;
	
	
	return Skill.createSkill((String)skillNameObj, skillCode, skillMana);
	}
}