package com.orhp.book.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

//Mapped to book table in mysql db.
@Entity
@Data
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "author_id")
    private int author_id;


}
