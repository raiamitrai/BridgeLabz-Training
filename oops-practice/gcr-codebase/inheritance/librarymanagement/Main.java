package OOPs.inheritance.librarymanagement;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("Clean Code", "2008");
        Author author = new Author(
                "Effective Java",
                "2018",
                "Joshua Bloch",
                "Java expert"
        );

        DisplayBookDetails display = new DisplayBookDetails();

        display.displayInfo(book);
        System.out.println();
        display.displayInfo(author);
    }
}
