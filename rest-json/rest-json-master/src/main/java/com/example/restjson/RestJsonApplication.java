package com.example.restjson;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestJsonApplication {

    public static void main(String[] args) {

        /**
        Book book = new Book(1,"tittle","123-123",
                2020, new String[]{"Author", "Author2"});
        System.out.println(book.getTittle());
        System.out.println(Arrays.toString(book.getAuthors()));
        **/

         SpringApplication.run(RestJsonApplication.class, args);
    }

}
