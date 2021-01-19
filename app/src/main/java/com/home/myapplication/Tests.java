package com.home.myapplication;

public class Tests {
    private String date; // Date?
    private int grade;

    public Tests(String date, int grade){
        this.date= date;
        this.grade = grade;
    }

    public void setDate(String date){
        this.date=date;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getDate(){
        return date;
    }

    public int getGrade() {
        return grade;
    }
}
