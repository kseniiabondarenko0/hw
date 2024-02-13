public class MainBookTask {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to the library
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Book book2 = new Book("The Sun and the Star", "Rick Riordan, Mark Oshiro", 2023);
        Book book3 = new Book("1984", "George Orwell", 1949);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Displaying books in the library
        library.print();

        // Removing a book from the library
        library.removeBook("1984");

        // Displaying updated list of books
        System.out.println("\nAfter removing a book:");
        library.print();
    }
}
