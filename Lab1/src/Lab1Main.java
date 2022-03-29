package edu.tr.maltepe.oop;

public class Lab1Main {
    public static void main(String[] args){
        Student s1 = new Student("Baris","Yazici",22,6548);
        Student s2 = new Student("Mehmet","Elci" ,22,6549);
        Professor p1 = new Professor("Ensar", "Gul", 60, "oop");
        Library lib = new Library("Maltepe University Library");

        lib.books.add(new Book("The Hobbit", "J.R.R. Tolkien", "fantasy",310));
        lib.books.add(new Book("The Fellowship of The Ring", "J.R.R. Tolkien", "fantasy",423));
        lib.books.add(new Book("The Two Towers", "J.R.R. Tolkien", "fantasy",352));
        lib.books.add(new Book("The Return of The King", "J.R.R. Tolkien", "fantasy",416));
        lib.books.add(new Book("The Silmarillion", "J.R.R. Tolkien", "fantasy",365));


        lib.printAvailableBooks();
        s1.borrowBook(lib.books.get(3),lib);
        s1.printBorrowedBooks();

        lib.printAvailableBooks();
        s1.borrowBook(lib.books.get(3),lib);
        s1.printBorrowedBooks();

        lib.printAvailableBooks();

        s1.returnBook(s1.borrowedBooks.get(0),lib);
        s1.printBorrowedBooks();
        lib.printAvailableBooks();

        s2.borrowBook(lib.books.get(0),lib);
        s2.printBorrowedBooks();
        lib.printAvailableBooks();
        p1.borrowBook(lib.books.get(2),lib);

        p1.printBorrowedBooks();
        lib.printAvailableBooks();
    }
}