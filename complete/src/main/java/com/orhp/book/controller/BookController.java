package com.orhp.book.controller;

import com.orhp.book.entity.Author;
import com.orhp.book.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.orhp.book.service.BooksService;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BooksService service;


    //api to get the list of all authors , have to specify the crossorigin to avoid issues with CORS policy.
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/getAuthors")
    public List<Author> getAuthors() {
        return service.getAuthors();
    }

}