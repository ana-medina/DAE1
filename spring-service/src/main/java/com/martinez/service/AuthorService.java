package com.martinez.service;

import com.martinez.entities.Author;

import java.util.List;

public interface AuthorService {

    List<Author> findAll();

    Author saveAuthor(Author author);

    Author findById(Integer id);

    void deleteAuthor(Integer id);

}
