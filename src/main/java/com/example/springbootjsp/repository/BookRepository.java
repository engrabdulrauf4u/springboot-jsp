package com.example.springbootjsp.repository;

import com.example.springbootjsp.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository  extends JpaRepository<Book,String> {
}
