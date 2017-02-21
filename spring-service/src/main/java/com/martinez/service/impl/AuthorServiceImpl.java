package com.martinez.service.impl;

import com.martinez.entities.Author;
import com.martinez.repository.AuthorRepository;
import com.martinez.service.AuthorService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public List<Author> findAll() {
        return authorRepository.findAll();
    }

    @Override
    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public Author findById(Integer id) {
        return authorRepository.findOne(id);
    }

    @Override
    public void deleteAuthor(Integer id) {
        authorRepository.delete(id);
    }
}
