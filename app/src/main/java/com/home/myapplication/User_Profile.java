package com.home.myapplication;

public class User_Profile {
    private String id;
    private Boolean isTeacher;
    private String name;
    private String lastName;
    private String username;
    private String pass;


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

    public void setUsername(String username) {this.username= username;}

    public void setPass(String pass) {
        this.pass = pass;
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

    public String getUsername() {return username;}

    public String getPass(){
        return pass;    }

    public User_Profile(String name, String lastName, String id, String username, String pass, Boolean isTeacher){ // builder operation
        this.name= name;
        this.lastName= lastName;
        this.id= id;
        this.username= username;
        this.pass = pass;
        this.isTeacher= isTeacher;

    }
}



