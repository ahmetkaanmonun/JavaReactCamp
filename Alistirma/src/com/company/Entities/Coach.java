package com.company.Entities;

public class Coach extends Person {


    private String defaultFormation;
    private int yearsOfExperience;


    public Coach(int id, String firstName, String lastName, int age, String nationality, Team currentClub, double transferFee, String defaultFormation, int yearsOfExperience, double salary) {
        super(id,firstName,lastName,age,nationality,transferFee,salary,currentClub);
        this.defaultFormation = defaultFormation;
        this.yearsOfExperience = yearsOfExperience;

    }


    public String getDefaultFormation() {
        return defaultFormation;
    }

    public void setDefaultFormation(String defaultFormation) {
        this.defaultFormation = defaultFormation;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }


}
