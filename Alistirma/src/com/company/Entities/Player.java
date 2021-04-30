package com.company.Entities;

public class Player extends Person {


    private String preferedFoot;
    private int jerseyNo;
    private double weight;
    private double height;
    private String position;


    public Player(int id, String firstName, String lastName, int age, String nationality, double transferFee, Team currentClubName, String preferedFoot, double salary, int jerseyNo, double weight, double height, String position) {
        super(id,firstName,lastName,age,nationality,transferFee,salary,currentClubName);
        this.preferedFoot = preferedFoot;
        this.jerseyNo = jerseyNo;
        this.weight = weight;
        this.height = height;
        this.position = position;
    }

    public String getPreferedFoot() {
        return preferedFoot;
    }

    public void setPreferedFoot(String preferedFoot) {
        this.preferedFoot = preferedFoot;
    }


    public int getJerseyNo() {
        return jerseyNo;
    }

    public void setJerseyNo(int jerseyNo) {
        this.jerseyNo = jerseyNo;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
