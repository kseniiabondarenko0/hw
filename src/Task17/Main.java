package Task17;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        LibraryManagementSystem librarySystem = new LibraryManagementSystem();

        try {
            librarySystem.addBook("To Kill a Mockingbird", "Harper Lee", 1960, "978-0061120084");
            librarySystem.addBook("1984", "George Orwell", 1949, "978-0451524935");
            librarySystem.addBook("Good Omens", "Neil Gaiman & Terry Pratchett", 1813, "978-0486284736");
            //librarySystem.addBook("1984", "George Orwell", 1949, "978-0451524935");     //перевірочка на компетентність



            Book bookByIsbn = librarySystem.findBookByIsbn("978-0486284736");
            System.out.println("Book found: " + bookByIsbn.getTitle() + " by " + bookByIsbn.getAuthor());


            librarySystem.removeBook("978-0061120084");
            System.out.println("Book with ISBN "+ bookByIsbn.getIsbn()+" removed successfully");

            List<Book> booksByAuthor = librarySystem.findBooksByAuthor("Neil Gaiman & Terry Pratchett");
            System.out.print("Books by "+bookByIsbn.getAuthor()+":\t");

            for (Book book : booksByAuthor) {
                System.out.println(book.getTitle());
            }
        } catch (DuplicateBookException | InvalidYearException | BookNotFoundException e) {         //треба розʼяснення, чо там вже чатик підключився
            e.printStackTrace();
        }

        librarySystem.displayBooks();
    }

}

