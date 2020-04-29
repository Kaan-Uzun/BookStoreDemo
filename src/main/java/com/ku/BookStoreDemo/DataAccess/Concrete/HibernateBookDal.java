package com.ku.BookStoreDemo.DataAccess.Concrete;

import com.ku.BookStoreDemo.DataAccess.Abstract.IBookDal;
import com.ku.BookStoreDemo.Entities.Book;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class HibernateBookDal implements IBookDal {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Book> GetAll() {
        Session session = entityManager.unwrap(Session.class);
        List<Book> books = session.createQuery("from Book", Book.class).getResultList();
        return books;
    }

    @Override
    @Transactional
    public void Add(Book book) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(book);
    }

    @Override
    @Transactional
    public void Delete(Book book) {
        Session session = entityManager.unwrap(Session.class);
        Book bookToDelete = session.get(Book.class, book.id);
        session.delete(bookToDelete);
    }

    @Override
    @Transactional
    public void Update(Book book) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(book);
    }

    @Override
    @Transactional
    public Book GetById(int bookId) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(Book.class, bookId);
    }
}
