package edu.tr.maltepe.oop;

import java.util.ArrayList;

public class Library {
    private String name;
    public ArrayList<Book> books = new ArrayList<Book>();

    public Library(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printAvailableBooks(){
        System.out.println("The available books in the " + name + " are:");

        var ref = new Object() {
            int index = 0;
        };
        books.forEach(book -> {
            System.out.println(ref.index + "- "+ book.getTitle());
            ref.index +=1;
        });
        System.out.println();
    }

    public Book getBookByTitle(String title){
        var bookObject = new Object() {
            Book theBook = null;
        };
        books.forEach(book -> {
            if(book.getTitle().equals(title)) {
                bookObject.theBook = book;
            }
        });
        return bookObject.theBook;
    }
}