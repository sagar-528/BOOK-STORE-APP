package com.bridgelabz.Service;

import com.bridgelabz.Model.Book;

import java.util.List;



public interface BookStoreService {
     void saveBookData();
     List<Book> getAllBook();
     Book addNewBook(Book book);
}
