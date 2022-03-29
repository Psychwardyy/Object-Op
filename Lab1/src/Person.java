package edu.tr.maltepe.oop;

import java.util.ArrayList;

public class Person {
    private String firstname;
    private String lastname;
    private int age;

    protected ArrayList<Book> borrowedBooks = new java.util.ArrayList<Book>();

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

    void borrowBook(Book book, Library lib){
        borrowedBooks.add(book);
        lib.books.remove(book);
        System.out.println(firstname+" "+lastname+" borrowed the book "+book.getTitle()+" by "+book.getAuthor()+".");
    }
    void returnBook(Book book, Library lib){
        borrowedBooks.remove(book);
        lib.books.add(book);

        System.out.println(firstname+" "+lastname+" returned the book "+book.getTitle()+" by "+book.getAuthor()+" to the " + lib.getName()+".");
    }
    ArrayList<Book> getBorrowedBooks(){
        return borrowedBooks;
    }
    void printBorrowedBooks(){
        System.out.println("\nThe books which are borrowed by "+ firstname + " " + lastname +" are:");

        var ref = new Object() {
            int index = 0;
        };
        borrowedBooks.forEach(book->{
            System.out.println(ref.index +"- "+book.getTitle());
            ref.index++;
        });
        System.out.println();
    }

}