package edu.tr.maltepe.oop;

public class Person {
    private String firstname;
    private String lastname;
    private int age;

    Person(String firstname_, String lastname_, int age_){
        firstname = firstname_;
        lastname = lastname_;
        age = age_;
    }

    String getName(){
        return firstname + " " + lastname;
    }
    void setFirstName(String newFirstName){
        this.firstname = newFirstName;
    }
    int getAge(){
        return age;
    }
    void setAge(int newAge){
        this.age = newAge;
    }
}