package com.martinez.repository;

import com.martinez.entities.Book;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends JpaRepository<Book, String>, CrudRepository<Book, String> {

    List<Book> findByTitle(String title);

    Book findByIsbn(String isbn);

}