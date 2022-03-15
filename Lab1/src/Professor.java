package edu.tr.maltepe.oop;

public class Professor extends Person{
    private String lecture;

    Professor(String firstname_, String lastname_, int age_, String lecture_) {
        super(firstname_, lastname_, age_);
        lecture = lecture_;
    }

    String getLecture(){
        return this.lecture;
    }
    void setLecture(String newLecture){
        this.lecture = newLecture;
    }
}