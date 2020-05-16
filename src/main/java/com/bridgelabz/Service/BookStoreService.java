package com.bridgelabz.Service;

import com.bridgelabz.Model.Book;

import java.util.List;
import java.util.Optional;
import java.util.Set;


public interface BookStoreService {
     void saveBookData();
     List<Book>getAllBook();
     Book addNewBook(Book book);

}
