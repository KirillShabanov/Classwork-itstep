package com.example.restjson.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Book {
    private int id;
    private String title;
    private String isbn;
    private int year;
    private String[] authors;
}
