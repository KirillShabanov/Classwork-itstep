package org.itstep.book;

import java.lang.annotation.*;
import java.lang.reflect.Field;

public class BookDemo {
    public static void main(String[] args) {
        Book book = new Book(null, "Homer J. Simpsone", -10);
        BookProcessor.process(book);
        NonNullProcess.process(book);
        IntPositiveProcess.process(book);
    }
}

@BookAnnotation("long")
class Book {
    @NonNull
    public String title;
    public String author;
    @IntPositive
    public int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void  printShort(){
        System.out.println("title: " + title);
    }

    public void printLong(){
        System.out.println("title: "
                + title
                + ", author: "
                + author
                + ", pages: "
                + pages);
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface NonNull {

}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface IntPositive {

}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface BookAnnotation {
    String value();
}

class BookProcessor {

    public static void process(Book book) {
        Class clazz = Book.class;
        // Annotation annotation = clazz
        //         .getAnnotation(BookAnnotation.class);
        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation instanceof BookAnnotation) {
                if (((BookAnnotation) annotation)
                        .value()
                        .equals("short"))
                    book.printShort();
                if (((BookAnnotation) annotation)
                        .value()
                        .equals("long"))
                    book.printLong();
            }
        }
    }
}

class NonNullProcess {

    public static void process(Book book) {
        Field[] fields = book
                .getClass()
                .getDeclaredFields();
        for (Field field : fields){
            Annotation annotation = field
                    .getAnnotation(NonNull.class);
            try {
                if (annotation != null && field.get(book) == null)
                    System.err.println("field "
                            + field.getName()
                            + "cannot be null!");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}

class IntPositiveProcess {
    public static void process(Book book) {
        Field[] fields = book
                .getClass()
                .getDeclaredFields();
        for (Field field : fields){
            Annotation annotation = field
                    .getAnnotation(IntPositive.class);
            try {
                if (annotation != null && field.getInt(book) <= 0)
                    System.err.println("field "
                            + field.getName()
                            + " must be positive!");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}

