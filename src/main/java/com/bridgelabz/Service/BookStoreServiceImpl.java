package com.bridgelabz.Service;

import com.bridgelabz.Model.Book;
import com.bridgelabz.Repository.BookStoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

@Service
public class BookStoreServiceImpl implements BookStoreService {

    @Autowired
    public BookStoreRepository bookStoreRepository;

    String line = "";

    public void saveBookData() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/books_data.csv"));
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                Book book = new Book();
                book.setId(data[0]);
                book.setAuthor(data[1]);
                book.setNameOfBook(data[2]);
                book.setPicByte(data[3]);
                book.setPrice(data[4]);
                book.setDescription(data[5]);
                bookStoreRepository.save(book);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Book> getAllBook() {
        return bookStoreRepository.findAll();
    }

    @Override
    public Book addNewBook(Book book) {
        return bookStoreRepository.save(book);
    }
}