package com.orhp.book.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

//Mapped to author table in mysql db.
@Entity
@Data
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "name")
    private String name;

    //one to many relation created as one author can have multiple books
    @OneToMany(targetEntity = Book.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id" , referencedColumnName = "id")
    private List<Book> booksList;

}
