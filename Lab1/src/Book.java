package edu.tr.maltepe.oop;

public class Book {
    private String title;
    private String author;
    private String genre;
    private int page_count;

    Book(String title_, String author_, String genre_, int page_count_) {
        title = title_;
        author = author_;
        genre = genre_;
        page_count = page_count_;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPage_count() {
        return page_count;
    }
    public void setPage_count(int page_count) {
        this.page_count = page_count;
    }
}