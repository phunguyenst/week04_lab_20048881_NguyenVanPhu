package com.iuh.phu.se.models;

public class Skill {
    private long skill_id;
    private String skillName;



    public Skill() {
    }

    public Skill(long skill_id, String skillName) {
        this.skill_id = skill_id;
        this.skillName = skillName;
    }

    public long getSkill_id() {
        return skill_id;
    }

    public void setSkill_id(long skill_id) {
        this.skill_id = skill_id;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }


    @Override
    public String toString() {
        return "Skill{" +
                "skill_id=" + skill_id +
                ", skillName='" + skillName + '\'' +
                '}';
    }
}
