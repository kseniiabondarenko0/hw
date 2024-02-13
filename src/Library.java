public class Library {

    Book[] books = new Book[10];
    int len;

    public void addBook(Book book) {
        if (len < books.length) {
            books[len] = book;
            len++;
        }
    }
    public void removeBook(String bookName) {
        for (int i = 0; i < len; i++) {
            if ( bookName == books[i].title) {

                for (int j = i; j < len+1; j++) {
                    books[j]=books[j+1];
                }

                len--;
            }
        }

    }
    public void print() {
        for (int i = 0; i < len; i++) {
            System.out.print(i + 1 + " ");
            books[i].print();
            System.out.println();
        }
        System.out.println("-----------------");
    }
}

