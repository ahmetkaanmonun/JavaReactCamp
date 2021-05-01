package com.company.Entities;

public class Person{


    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String nationality;
    private double transferFee;
    private Team currentClub;
    private double salary;






    public Person(int id,String firstName, String lastName, int age,String nationality,double transferFee,double salary,Team currentClub) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.nationality = nationality;
        this.transferFee = transferFee;
        this.salary = salary;
        this.currentClub = currentClub;

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public double getTransferFee() {
        return transferFee;
    }

    public void setTransferFee(double transferFee) {
        this.transferFee = transferFee;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
