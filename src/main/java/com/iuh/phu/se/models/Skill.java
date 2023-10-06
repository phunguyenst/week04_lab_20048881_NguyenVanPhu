package com.iuh.phu.se.models;

public class Skill {
    private long skill_id;
    private String skillName;

    private String skillDescripttion;

    public Skill() {
    }

    public Skill(long skill_id, String skillName, String skillDescripttion) {
        this.skill_id = skill_id;
        this.skillName = skillName;
        this.skillDescripttion = skillDescripttion;
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

    public String getSkillDescripttion() {
        return skillDescripttion;
    }

    public void setSkillDescripttion(String skillDescripttion) {
        this.skillDescripttion = skillDescripttion;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "skill_id=" + skill_id +
                ", skillName='" + skillName + '\'' +
                ", skillDescripttion='" + skillDescripttion + '\'' +
                '}';
    }
}
