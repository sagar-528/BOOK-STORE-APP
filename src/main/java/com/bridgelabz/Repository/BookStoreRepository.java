package com.bridgelabz.Repository;

import com.bridgelabz.Model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookStoreRepository extends CrudRepository<Book, Integer> {

}
