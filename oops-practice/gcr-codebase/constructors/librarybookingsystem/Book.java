//Library Book System: Create a Book class with attributes title, author, price, and availability. Implement a method to borrow a book.
package OOPs.constructors.librarybookingsystem;

public class Book {
    private String title;
    private String author;
    private double price;
    private boolean available;

    // Constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true; // book is available initially
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    void setAvailable(boolean available){
        this.available = available;
    }
}
