package com.example.bsgi2;

public class DataModal {

    // string variables for our name and job
    private String name;
    private String member_id;

    public DataModal(String name, String member_id) {
        this.name = name;
        this.member_id = member_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getmember_id() {
        return member_id;
    }

    public void setmember_id(String member_id) {
        this.member_id = member_id;
    }

}