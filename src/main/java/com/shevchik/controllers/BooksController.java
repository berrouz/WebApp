package com.shevchik.controllers;

import com.shevchik.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shevchik
 * Date: 19.09.12
 * Time: 11:22
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/books")
public class BooksController {
    private final BookService bookService;

    @Autowired
    public BooksController(BookService bookService){
        this.bookService = bookService;
    }

    @RequestMapping(value = "/myBooks", method = RequestMethod.GET)
    public String showBook(@RequestParam String name, Model model){
        BookService bookService = new BookService();
        List<BookService.Book> books = bookService.getBooks();
        model.addAttribute(books);
        return "books/list";
    }
}
