package com.bridgelabz.Controller;


import com.bridgelabz.Service.Impl.BookStoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class HomeController {

    @Autowired
    private BookStoreServiceImpl bookStoreService;

    @GetMapping("/bookstore")
    public String setDataInDb(){
        bookStoreService.saveBookData();
        return "Added Csv Data In DataBase";
    }

}
