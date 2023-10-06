package com.iuh.phu.se.models;

import java.util.List;

public class Job {
    private long job_id;
    private String jobTitle;


    public Job() {
    }

    public Job(long job_id, String jobTitle) {
        this.job_id = job_id;
        this.jobTitle = jobTitle;

    }

    public long getJob_id() {
        return job_id;
    }

    public void setJob_id(long job_id) {
        this.job_id = job_id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }



    @Override
    public String toString() {
        return "Job{" +
                "job_id=" + job_id +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
