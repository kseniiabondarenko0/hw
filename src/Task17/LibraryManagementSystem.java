package Task17;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

class LibraryManagementSystem {
    private List<Book> books;

    // Конструктор
    public LibraryManagementSystem() {
        this.books = new ArrayList<>();
    }

    // Метод для додавання книги
    public void addBook(String title, String author, int year, String isbn)
            throws DuplicateBookException, InvalidYearException {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                throw new DuplicateBookException("Book with ISBN " + isbn + " already exists");
            }
        }
        if (year < 0 || year > Calendar.getInstance().get(Calendar.YEAR)) {
            throw new InvalidYearException("Invalid year: " + year);
        }
        books.add(new Book(title, author, year, isbn));
    }

    // Метод для видалення книги за ISBN
    public  void removeBook(String isbn) throws BookNotFoundException {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                books.remove(book);
                return;
            }
        }
        throw new BookNotFoundException("Book with ISBN " + isbn + " not found");
    }

    // Метод для пошуку книги за ISBN
    public Book findBookByIsbn(String isbn) throws BookNotFoundException {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        throw new BookNotFoundException("Book with ISBN " + isbn + " not found");
    }

    // Метод для пошуку книг за автором
    public List<Book> findBooksByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }


    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() +
                    ", Year: " + book.getYear() + ", ISBN: " + book.getIsbn() +
                    ", Status: " + book.getStatus());
        }
    }
}