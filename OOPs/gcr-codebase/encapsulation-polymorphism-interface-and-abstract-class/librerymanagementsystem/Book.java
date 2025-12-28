package OOPs.encapsulation.librerymanagementsystem;

public class Book extends LibraryItem implements Reservable {

    private boolean available = true; // encapsulated

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // days
    }

    @Override
    public void reserveItem() {
        if (available) {
            available = false;
            System.out.println("Book reserved successfully");
        } else {
            System.out.println("Book is not available");
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}

