package com.shevchik.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shevchik
 * Date: 19.09.12
 * Time: 11:27
 * To change this template use File | Settings | File Templates.
 */
@Service
public class BookService {
    private List<Book> books = new ArrayList();
    {
        books.add(new Book("Scientists", "about Natur"));
        books.add(new Book("Gagarin", "about Kosmos"));
    }
    public List<Book> getBooks(){
        return books;
    }

    public static class Book{
        private String name;
        private String description;

        private Book(String name, String description) {
            this.name = name;
            this.description = description;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
