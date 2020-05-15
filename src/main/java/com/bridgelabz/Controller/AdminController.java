package com.bridgelabz.Controller;

import com.bridgelabz.Model.Book;
import com.bridgelabz.Service.BookStoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    BookStoreServiceImpl bookStoreService;

    @GetMapping("/homePage")
    public void setDataInDb(){
        bookStoreService.saveBookData();
    }

    @GetMapping("/homePage/allBook")
    public ResponseEntity<List<Book>> getAllBook(){
        return new ResponseEntity<>(bookStoreService.getAllBook(), HttpStatus.OK);
    }

    @PostMapping("/addBook")
    public ResponseEntity<Book> addNewBook(@RequestBody Book book){
        return new ResponseEntity<>(bookStoreService.addNewBook(book),HttpStatus.OK);
    }
}
