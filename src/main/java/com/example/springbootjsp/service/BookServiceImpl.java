package com.example.springbootjsp.service;

import com.example.springbootjsp.exception.DuplicateBookException;
import com.example.springbootjsp.model.Book;
import com.example.springbootjsp.repository.BookRepository;
import com.mysql.cj.xdevapi.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public List<Book> getBooks() {

        return bookRepository.findAll();
    }

    @Override
    public Book addBook(Book book) throws DuplicateBookException {
        final Optional<Book> existingBook = bookRepository.findById(book.getIsbn());
        if (existingBook.isPresent()) {
            throw new DuplicateBookException(book);
        }

        final Book savedBook = bookRepository.save(convertBook(book));
        return savedBook;
    }

    private Book convertBook(Book book) {

        return new Book();
    }
}