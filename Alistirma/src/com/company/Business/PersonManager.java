package com.company.Business;

import com.company.Entities.Person;

public class PersonManager {

    public void addMultiple(Person[] persons){

        for (Person person:persons) {

            System.out.println(person.getFirstName() + " eklendi.");

        }

    }
    public void delete(Person person){



            System.out.println(person.getFirstName() + " silindi.");


    }
    public void update(Person person){



            System.out.println(person.getFirstName() + " bilgileri güncellendi.");



    }
    public void increaseSalary(Person person,double salaryRate){

        double result = person.getSalary() + (person.getSalary() * (salaryRate / 100));
        System.out.println("New salary: " + result);


    }




}
