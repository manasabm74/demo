package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;

@RestController
@RequestMapping("")
public class BookController{
    BookService bookService;

    public BookController(BookService bookService) {
        super();
        this.bookService = bookService;
    }
    //create and store book object
    @PostMapping()
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }
    //fetch book object for specified id
    @GetMapping("{ICBN}")
    public Book readBookByICBN(@PathVariable String ICBN) {
        return bookService.readBookByICBN(ICBN);
    }
    //fetch all the book objects
    @GetMapping
    public List<Book> readAllBook(){
        List<Book> bookList=bookService.readAllBook();
        return bookList;
    }
    //updating a book object
    @PutMapping
    public Book updateBook(@RequestBody Book book) {
        Book book1=bookService.updateBook(book);
        return book1;
    }
    //deleting a book object
    @DeleteMapping("{ICBN}")
    public String deleteBook(@PathVariable String ICBN) {
        String msg=bookService.deleteBookByICBN(ICBN);
        return msg;

    }

}
