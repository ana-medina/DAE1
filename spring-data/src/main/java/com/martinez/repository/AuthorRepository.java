package com.martinez.repository;

import com.martinez.entities.Author;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer>, CrudRepository<Author, Integer> {

}
