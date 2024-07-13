package com.orhp.book.repository;

import java.util.List;
import com.orhp.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface BookRepository extends JpaRepository<Book, Integer>{

        List<Book> findById(int id);

    }

