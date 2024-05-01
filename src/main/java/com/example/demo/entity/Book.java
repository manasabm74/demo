package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id
    String title;
    String author;
    String ICBN;
    String genre;
    int year;
    public Book() {
        super();
    }
    public Book(String Title, String Author, String ICBN, String Genre, int year) {
        super();
        this.title = title;
        this.author = author;
        this.ICBN = ICBN;
        this.genre = genre;
        this.year=year;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String Title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String Author) {
        this.author = author;
    }
    public String getICBN() {
        return ICBN;
    }
    public void setICBN(String ICBN) {
        this.ICBN = ICBN;
    }
    public String getgenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return "Book [Title=" + title  + ", Author=" + author + ", ICBN=" + ICBN + ", Genre=" + genre + ", year=" + year + "]";
    }


}
