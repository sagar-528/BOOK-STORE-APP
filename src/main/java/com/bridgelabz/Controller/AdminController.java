package com.bridgelabz.Controller;

import com.bridgelabz.Service.BookStoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    BookStoreServiceImpl bookStoreService;

    @GetMapping("/homepage")
    public void setDataInDb(){
        bookStoreService.saveBookData();
    }
}
