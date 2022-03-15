package edu.tr.maltepe.oop;

public class Student extends Person {
    private int id;

    Student(String firstname_, String lastname_, int age_, int id_) {
        super(firstname_, lastname_, age_);
        id = id_;
    }

    int getId(){
        return this.id;
    }
    void setId(int newId){
        this.id = newId;
    }
}