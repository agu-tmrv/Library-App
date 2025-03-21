package com.example.library.dao;

import com.example.library.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;


public interface BookRepository extends JpaRepository<Book, Integer> {
}
