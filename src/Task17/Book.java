package Task17;

import java.util.*;

class Book {
    private String title;
    private String author;
    private int year;
    private String isbn;
    private BookStatus status;

    // Конструктор
    public Book(String title, String author, int year, String isbn) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
        this.status = BookStatus.AVAILABLE;

    }

    // Геттери
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getIsbn() {
        return isbn;
    }

    public BookStatus getStatus() {
        return status;
    }

}

// книга з таким ISBN вже існує
class DuplicateBookException extends Exception {
    public DuplicateBookException(String message) {
        super(message);
    }
}

// недійсний рік видання
class InvalidYearException extends Exception {
    public InvalidYearException(String message) {
        super(message);
    }
}

//книга не знайдена
class BookNotFoundException extends Exception {
    public BookNotFoundException(String message) {
        super(message);
    }
}