package com.ku.BookStoreDemo.Business.Abstract;

import com.ku.BookStoreDemo.Entities.Book;

import java.util.List;

public interface IBookService {
    List<Book> getAll();

    void add(Book book);

    void delete(Book book);

    void update(Book book);

    Book getById(int bookId);
}
