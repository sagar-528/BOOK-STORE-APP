package com.bridgelabz.Controller;

import com.bridgelabz.Model.Book;
import com.bridgelabz.Repository.BookStoreRepository;
import com.bridgelabz.Service.BookStoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;


@RestController
public class AdminController {

    @Autowired
    BookStoreServiceImpl bookStoreService;

    @Autowired
    private BookStoreRepository bookStoreRepository;

    @GetMapping("/bookstore")
    public void setDataInDb(){
        bookStoreService.saveBookData();
    }

    @GetMapping("/home-page")
    public ResponseEntity<List<Book>> getAllBook(){
        return new ResponseEntity<>(bookStoreService.getAllBook(), HttpStatus.OK);
    }

    @PostMapping("/home-page/add-new-book")
    public ResponseEntity<Book> addNewBook(@RequestBody Book book){
        return new ResponseEntity<>(bookStoreService.addNewBook(book),HttpStatus.OK);
    }

    @GetMapping("/home-page/{author}")
    public ResponseEntity<List<Book>> findByAuthor(@PathVariable String author){
        return new ResponseEntity<>(bookStoreRepository.findByAuthor(author),HttpStatus.OK);
    }
}
