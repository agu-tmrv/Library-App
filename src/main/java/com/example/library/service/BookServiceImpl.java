package com.example.library.service;

import com.example.library.dao.BookRepository;
import com.example.library.entity.Book;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }

    @Override
    public Book findById(int id) {

        Optional<Book> book = bookRepository.findById(id);
        Book theBook = null;

        if (book.isPresent()) {
            theBook=  book.get();
        }
        return theBook;

    }

    @Override
    @Transactional
    public Book update(@RequestBody Book book) {
        bookRepository.save(book);
        return book;
    }

    @Override
    @Transactional
    public void delete(int id) {
        bookRepository.deleteById(id);
    }


}
