package com.example.springbootjsp.exception;

import com.example.springbootjsp.model.Book;

public class DuplicateBookException extends Exception{
    public DuplicateBookException(Book book) {
    }
}
