package OOPs.classandobject.handlebookdetails;

public class HandleBooks {
    private String title;
    private String author;
    private int price;

    public HandleBooks(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails(){
        System.out.println("Title of the book: "+title);
        System.out.println("Author of the book: "+author);
        System.out.println("Price of the book: "+price);
    }
}
