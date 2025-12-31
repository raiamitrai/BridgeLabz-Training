package OOPs.constructors.book;

public class Main {
    public static void main(String[] args) {
        // using default constructor
        Book book1 = new Book();
        book1.displayBookDetails();


        // using paramaterized constructor
        Book book2 = new Book("MySelf","amit",99 );
        book2.displayBookDetails();
    }
}
