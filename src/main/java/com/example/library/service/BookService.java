package com.example.library.service;


import com.example.library.entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    List<Book> findAll();

    void save(Book book);

    Book findById(int id);

    Book update(Book book);

    void delete(int id);
}
