public class Library {

    Book[] books;

    Library(){
        books = new Book[10];
    }

    int len;

    public void addBook(Book book) {
        books[len] = book;
        len++;
    }


    public void removeBook(String bookTitle) {
        int indexToRemove = -1;
        // Знаходимо індекс книги, яку потрібно видалити
        for (int i = 0; i < len; i++) {
            if (books[i].title.equals(bookTitle)) {
                indexToRemove = i;
                break;
            }
        }

        // Якщо книга знайдена, видаляємо її
        if (indexToRemove != -1) {
            // Створюємо новий масив на 1 елемент менший за поточний
            Book[] newBooks = new Book[len - 1];
            // Копіюємо елементи до індекса, який потрібно видалити
            if (indexToRemove > 0) {
                System.arraycopy(books, 0, newBooks, 0, indexToRemove);
            }
            // Копіюємо елементи після видалення
            if (indexToRemove < len - 1) {
                System.arraycopy(books, indexToRemove + 1, newBooks, indexToRemove, len - indexToRemove - 1);
            }
            // Призначаємо новий масив як список книг
            books = newBooks;
            // Зменшуємо лічильник кількості книг
            len--;
        } else {
            System.out.println("Book not found: " + bookTitle);
        }
    }

    public void print(){
        for (int i = 0; i< books.length; i++){
            System.out.print(i+1+" ");
            books[i].print();
        }
    }
}
