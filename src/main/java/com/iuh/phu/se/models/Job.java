package com.iuh.phu.se.models;

import java.util.List;

public class Job {
    private long job_id;
    private String jobTitle;
    private String descripttion;
    private String location;
    private double salary;

    private Candidate candidate;

    public Job() {
    }

    public Job(long job_id, String jobTitle, String descripttion, String location, double salary, Candidate candidate) {
        this.job_id = job_id;
        this.jobTitle = jobTitle;
        this.descripttion = descripttion;
        this.location = location;
        this.salary = salary;
        this.candidate = candidate;
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

    public String getDescripttion() {
        return descripttion;
    }

    public void setDescripttion(String descripttion) {
        this.descripttion = descripttion;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    @Override
    public String toString() {
        return "Job{" +
                "job_id=" + job_id +
                ", jobTitle='" + jobTitle + '\'' +
                ", descripttion='" + descripttion + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                ", candidate=" + candidate +
                '}';
    }
}
