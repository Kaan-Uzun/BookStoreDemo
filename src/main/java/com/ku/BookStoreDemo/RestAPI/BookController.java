package com.ku.BookStoreDemo.RestAPI;

import com.ku.BookStoreDemo.Business.Abstract.IBookService;
import com.ku.BookStoreDemo.Entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    private IBookService _bookService;

    @GetMapping("/books")
    public List<Book> get(){
        return _bookService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody Book book){
        _bookService.add(book);
    }

    @PostMapping("/update")
    public void update(@RequestBody Book book){
        _bookService.update(book);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Book book){
        _bookService.delete(book);
    }

    @GetMapping("/books/{id}")
    public Book getById(@PathVariable int id){
        return _bookService.getById(id);
    }
}
