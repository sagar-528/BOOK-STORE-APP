package com.bridgelabz.Controller;

import com.bridgelabz.Model.Book;
import com.bridgelabz.Service.BookStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home-page")
public class CustomerController {

    @Autowired
    private BookStoreService bookStoreService;

    @GetMapping("")
    public ResponseEntity<List<Book>> getAllBook(){
        return new ResponseEntity<>(bookStoreService.getAllBook(), HttpStatus.OK);
    }

    @PostMapping("/add-new-book")
    public ResponseEntity<Book> addNewBook(@RequestBody Book book){
        return new ResponseEntity<>(bookStoreService.addNewBook(book),HttpStatus.OK);
    }

    @GetMapping("/{author}")
    public ResponseEntity<List<Book>> findByAuthor(@PathVariable String author){
        return new ResponseEntity<>(bookStoreService.findByAuthor(author),HttpStatus.OK);
    }

    @GetMapping("/sort-asc/price")
    public ResponseEntity<List<Book>> findAllByOrderByPriceAsc(){
        return new ResponseEntity<>(bookStoreService.getAllBookByPriceAsc(),HttpStatus.OK);
    }

    @GetMapping("/sort-desc/price")
    public ResponseEntity<List<Book>> findAllByOrderByPriceDesc(){
        return new ResponseEntity<>(bookStoreService.getAllBookByPriceDesc(),HttpStatus.OK);
    }
}
