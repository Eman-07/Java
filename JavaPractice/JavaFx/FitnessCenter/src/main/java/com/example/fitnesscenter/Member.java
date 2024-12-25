package com.example.fitnesscenter;

import java.io.Serializable;

public class Member implements Serializable {

    private String name;
    private String membershipType;
    private String dob;
    private String gender;

    public Member(String name, String membershipType, String age, String gender) {
        this.name = name;
        this.membershipType = membershipType;
        this.dob = age;
        this.gender = gender;
    }
    public Member(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
