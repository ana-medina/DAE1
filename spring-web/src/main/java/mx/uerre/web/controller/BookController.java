package mx.uerre.web.controller;

import mx.uerre.entities.Book;
import mx.uerre.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    @RequestMapping(value = {"/books"})
    public String allBooks(Model model) {
        model.addAttribute("books", bookService.findAll());
        return "books";
    }

    @GetMapping
    @RequestMapping(value = {"/book/new"})
    public String newBook(Model model) {
        model.addAttribute("book", new Book());
        return "newBook";
    }

    @GetMapping
    @RequestMapping(value = {"/book/{isbn}"})
    public String showBook(@PathVariable String isbn, Model model) {
        model.addAttribute("book", bookService.findByIsbn(isbn));
        return "showBook";
    }

    @GetMapping
    @RequestMapping(value = {"/book/edit/{isbn}"})
    public String edit(@PathVariable String isbn, Model model) {
        model.addAttribute("book", bookService.findByIsbn(isbn));
        return "editBook";
    }

    @PostMapping
    @RequestMapping(value = {"/book"})
    public String saveBook(Book book) {
        bookService.saveBook(book);
        return "redirect:/book/" + book.getIsbn();
    }

    @RequestMapping(value = {"/book/delete/{isbn}"})
    public String delete(@PathVariable String isbn) {
        bookService.deleteBook(isbn);
        return "redirect:/books";
    }
}
