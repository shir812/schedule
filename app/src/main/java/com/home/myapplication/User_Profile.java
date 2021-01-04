package com.home.myapplication;

public class User_Profile {
    private String id;
    private Boolean isTeacher;
    private String name;
    private String lastName;

    public void setId(String id) {
        this.id = id;
    }
    public void setTeacher(Boolean teacher) {
        isTeacher = teacher;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public Boolean getTeacher() {
        return isTeacher;
    }
}



