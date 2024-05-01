package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{
    BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        super();
        this.bookRepository = bookRepository;
    }
    @Override
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }
    @Override
    public Book readBookByICBN(String ICBN) {
        // TODO Auto-generated method stub
        Book b1=bookRepository.findById(ICBN).get();
        return b1;
    }
    @Override
    public List<Book> readAllBook() {
        // TODO Auto-generated method stub
        List<Book> bookList=bookRepository.findAll();
        return bookList;
    }
    @Override
    public Book updateBook(Book book) {
        // TODO Auto-generated method stub
        Book b1=bookRepository.save(book);
        return b1;
    }
    @Override
    public String deleteBookByICBN(String ICBN) {
        // TODO Auto-generated method stub
        bookRepository.deleteById(ICBN);
        return "Book "+ICBN+"  deleted";
    }
}
