import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //task 1
        Library library = new Library();
        library.addBook(new Book("Percy Jackson and the sea of monsters", "Rick Riordan", 2007));
        library.addBook(new Book("Good Omens", "Neil Gaiman", 1990));
        library.addBook(new Book("Harry Potter", "Joane Rowling", 1997));
        library.addBook(new Book("Newerwhere", "Neil Gaiman", 2008));

        System.out.println("Books in the library:");
        library.print();

        System.out.println("Amount of Neil Gaiman's books: " + library.countBooksByAuthor("Neil Gaiman"));
        System.out.println("Amount of books by the title 'Good Omens': " + library.countBooksByTitle("Good Omens"));






        //task 2
        Bank bank = new Bank(10);

        bank.createAccount("12345", 1000);
        bank.createAccount("67890", 500);

        bank.withdrawFromAccount("67890", 200);

        bank.transferBetweenAccounts("12345", "67890", 300);


        bank.blockAccount("12345");
        bank.unblockAccount("67890");

        bank.printAllAccounts();


        //task3
        Company company = new Company();

        company.addEmployee(new Employee("John", 3000, "Manager", "Sales"));
        company.addEmployee(new Employee("Alice", 2500, "Engineer", "Engineering"));
        company.addEmployee(new Employee("Bob", 2800, "Analyst", "Finance"));

        company.printAllEmployees();

        System.out.println("Total salary: " + company.calculateTotalSalary());
        System.out.println("Average salary: " + company.calculateAverageSalary());

    }


}
