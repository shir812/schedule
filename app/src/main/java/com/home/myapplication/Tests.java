package com.home.myapplication;

import java.util.Date;

public class Tests {
    private Date date;
    private int grade;

    public Tests(Date date, int grade){
        this.date= date;
        this.grade = grade;
    }

    public void setDate(Date date){
        this.date=date;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Date getDate(){
        return date;
    }

    public int getGrade() {
        return grade;
    }
}
