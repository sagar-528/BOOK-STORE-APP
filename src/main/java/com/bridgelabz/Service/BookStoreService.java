package com.bridgelabz.Service;

import com.bridgelabz.Model.Book;
import org.springframework.data.domain.Sort;

import java.util.List;



public interface BookStoreService {
     void saveBookData();
     List<Book> getAllBook();
     Book addNewBook(Book book);
     List<Book> findByAuthor(String author);
     List<Book> getAllBookByPriceAsc();
     List<Book> getAllBookByPriceDesc();

}
