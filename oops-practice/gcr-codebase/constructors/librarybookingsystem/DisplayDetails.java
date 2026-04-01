package OOPs.constructors.librarybookingsystem;

public class DisplayDetails {

    void displayDetails(Book book){
        System.out.println("Title        : " + book.getTitle());
        System.out.println("Author       : " + book.getAuthor());
        System.out.println("Price        : " + book.getPrice());
        System.out.println("Availability : " +
                (book.isAvailable() ? "Available" : "Not Available"));
        System.out.println("-----------------------------");
    }
}
