package OOPs.constructors.librarybookingsystem;

public class Main {
    public static void main(String[] args) {

        // Create Book object
        Book book = new Book(
                "Wings of Fire",
                "A.P.J Abdul Kalam",
                399
        );

        // Create helper objects
        BorrowBook borrowBook = new BorrowBook();
        DisplayDetails display = new DisplayDetails();

        // Display book details before borrowing
        display.displayDetails(book);

        // Borrow the book
        borrowBook.borrowBook(book);

        // Try borrowing again
        borrowBook.borrowBook(book);

        // Display book details after borrowing
        display.displayDetails(book);
    }
}
