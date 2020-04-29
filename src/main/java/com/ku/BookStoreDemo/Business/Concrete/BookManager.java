package com.ku.BookStoreDemo.Business.Concrete;

import com.ku.BookStoreDemo.Business.Abstract.IBookService;
import com.ku.BookStoreDemo.DataAccess.Abstract.IBookDal;
import com.ku.BookStoreDemo.Entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BookManager implements IBookService {

    @Autowired
    private IBookDal _bookDal;

    @Override
    public List<Book> getAll() {
        return _bookDal.GetAll();
    }

    @Override
    @Transactional
    public void add(Book book) {
        _bookDal.Add(book);
    }

    @Override
    @Transactional
    public void delete(Book book) {
        _bookDal.Delete(book);
    }

    @Override
    @Transactional
    public void update(Book book) {
        _bookDal.Update(book);
    }

    @Override
    @Transactional
    public Book getById(int bookId) {
        return _bookDal.GetById(bookId);
    }
}
