package com.martinez.web.controller;

import com.martinez.entities.Author;
import com.martinez.service.AuthorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping
    @RequestMapping(value = {"/authors"})
    public String allAuthors(Model model) {
        model.addAttribute("authors", authorService.findAll());
        return "authors";
    }

    @GetMapping
    @RequestMapping(value = {"/author/new"})
    public String newAuthor(Model model) {
        model.addAttribute("author", new Author());
        return "newAuthor";
    }

    @GetMapping
    @RequestMapping(value = {"/author/{id}"})
    public String showAuthor(@PathVariable Integer id, Model model) {
        model.addAttribute("author", authorService.findById(id));
        return "showAuthor";
    }

    @GetMapping
    @RequestMapping(value = {"/author/edit/{id}"})
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("author", authorService.findById(id));
        return "editAuthor";
    }

    @PostMapping
    @RequestMapping(value = {"/author"})
    public String saveAuthor(Author author) {
        authorService.saveAuthor(author);
        return "redirect:/author/" + author.getIdAuthor();
    }

    @RequestMapping(value = {"/author/delete/{id}"})
    public String delete(@PathVariable Integer id) {
        authorService.deleteAuthor(id);
        return "redirect:/authors";
    }
}
