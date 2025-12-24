//Create a Book class with attributes title, author, and price. Provide both default and parameterized constructors.
package OOPs.constructors.book;

public class Book {
    private String title;
    private String author;
    private int price;

    public Book() {

    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // method to display book details
    void displayBookDetails(){
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
        System.out.println("-------------------");
    }
}
