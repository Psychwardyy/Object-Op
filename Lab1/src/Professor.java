package edu.tr.maltepe.oop;

import java.util.ArrayList;

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
    void tellLecture(){
        System.out.println("Hello, I teach " + this.lecture);
    }

    @Override
    public void borrowBook(Book book, Library lib){
        borrowedBooks.add(book);
        lib.books.remove(book);
        System.out.println(this.getName()+"(professor) borrowed the book "+book.getTitle()+" by "+book.getAuthor()+".");
    }
    @Override
    public void returnBook(Book book, Library lib){
        borrowedBooks.remove(book);
        lib.books.add(book);
        System.out.println(this.getName()+"(professor) returned the book "+book.getTitle()+" by "+book.getAuthor()+" to the " + lib.getName()+".");
    }
}