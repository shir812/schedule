package com.home.myapplication;

public class Subject {
    private Tests tests;
    private HW hw;
    private Assignment assignment;

    public Subject(Tests tests, HW hw, Assignment assignment)
    {
        this.tests = tests;
        this.hw =hw;
        this.assignment=assignment;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public HW getHw() {
        return hw;
    }

    public Tests getTests() {
        return tests;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    public void setHw(HW hw) {
        this.hw = hw;
    }

    public void setTests(Tests tests) {
        this.tests = tests;
    }

}

