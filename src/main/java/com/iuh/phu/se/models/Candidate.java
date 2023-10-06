package com.iuh.phu.se.models;

import org.springframework.stereotype.Component;

@Component
public class Candidate {

    private long can_id;

    private String fullName;

    private String email;

    private String phone;

    private int age;

    public Candidate() {
    }

    public Candidate(long cant_id, String fullName, String email, String phone, int age) {
        can_id = cant_id;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public long getCant_id() {
        return can_id;
    }

    public void setCant_id(long cant_id) {
        can_id = cant_id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "can_id=" + can_id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                '}';
    }
}
