package edu.tr.maltepe.oop;

import java.util.ArrayList;

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

    void greet(){
        System.out.println("Hello my name is " + this.getName());
    }

    @Override
    public void borrowBook(Book book, Library lib){
        borrowedBooks.add(book);
        lib.books.remove(book);
        System.out.println(this.getName()+"(student) borrowed the book "+book.getTitle()+" by "+book.getAuthor()+".");
    }
    @Override
    public void returnBook(Book book, Library lib){
        borrowedBooks.remove(book);
        lib.books.add(book);
        System.out.println(this.getName()+"(student) returned the book "+book.getTitle()+" by "+book.getAuthor()+" to the " + lib.getName()+".");
    }
}