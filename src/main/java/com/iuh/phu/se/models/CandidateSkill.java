package com.iuh.phu.se.models;

public class CandidateSkill {
    private long can_id;

    private long job_id;

    private int level;

    public CandidateSkill(long can_id, long job_id, int level) {
        this.can_id = can_id;
        this.job_id = job_id;
        this.level = level;
    }

    public long getCan_id() {
        return can_id;
    }

    public void setCan_id(long can_id) {
        this.can_id = can_id;
    }

    public long getJob_id() {
        return job_id;
    }

    public void setJob_id(long job_id) {
        this.job_id = job_id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "CandidateSkill{" +
                "can_id=" + can_id +
                ", job_id=" + job_id +
                ", level=" + level +
                '}';
    }
}
