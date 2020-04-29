package com.ku.BookStoreDemo.DataAccess.Abstract;

import com.ku.BookStoreDemo.Entities.Book;

import java.util.List;

public interface IBookDal {

    List<Book> GetAll();

    void Add(Book book);

    void Delete(Book book);

    void Update(Book book);

    Book GetById(int bookId);

}
