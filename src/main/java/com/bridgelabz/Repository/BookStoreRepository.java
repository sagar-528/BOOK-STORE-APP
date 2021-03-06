package com.bridgelabz.Repository;

import com.bridgelabz.Model.Book;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookStoreRepository extends JpaRepository<Book, String>{

    List<Book> findByAuthor(String author);
    List<Book> findAllByOrderByPriceAsc();
    List<Book> findAllByOrderByPriceDesc();
}
