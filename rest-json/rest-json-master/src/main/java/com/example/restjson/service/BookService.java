package com.example.restjson.service;

import com.example.restjson.model.Book;
import com.example.restjson.repo.BookRepo;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private BookRepo bookRepo = new BookRepo("src\\main\\resources\\static\\book.json");



    public List<Book> getBooks(){
        /**
        Book book = new Book(1,"tittle","123-123",
                2020, new String[]{"Author", "Author2"});
        List<Book> books = new ArrayList<>();
        books.add(book);
         return books;
         **/
        return bookRepo.getAllBooks();
    }

    public Book getBookById(int id){
        return bookRepo.getBookById(id);
    }

    public void addBook(Book book) throws IOException {
        bookRepo.addBook(book);
    }

    public void updateBook(Book book) throws IOException {
        bookRepo.updateBook(book);
    }

    public void deleteBook(int id) throws IOException {
        bookRepo.deleteBook(id);
    }
}
