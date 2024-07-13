package com.orhp.book.service;

import com.orhp.book.repository.AuthorRepository;
import com.orhp.book.repository.BookRepository;
import com.orhp.book.entity.Author;
import com.orhp.book.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksService {

    @Autowired
    private AuthorRepository authrepo;

    //get authors service.
    public List<Author> getAuthors(){
        return authrepo.findAll();
    }
}

