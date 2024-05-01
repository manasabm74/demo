package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Book;

public interface BookService {
    //create and store book object
    Book createBook(Book book);
    // Read book for a specific ICBN
    Book readBookByICBN(String ICBN);
    //Read all the book
    List<Book> readAllBook();
    //Update the book
    Book updateBook(Book book);
    //Delete the book
    String deleteBookByICBN(String ICBN);



}
