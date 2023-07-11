package com.example.springbootjsp.service;

import com.example.springbootjsp.exception.DuplicateBookException;
import com.example.springbootjsp.model.Book;
import com.mysql.cj.xdevapi.Collection;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {

    public List<Book> getBooks();
    Book addBook(Book book) throws DuplicateBookException;
}
