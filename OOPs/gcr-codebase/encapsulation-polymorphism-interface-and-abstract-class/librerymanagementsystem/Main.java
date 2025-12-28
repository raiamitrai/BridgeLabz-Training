package OOPs.encapsulation.librerymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<LibraryItem> items = new ArrayList<>();

        items.add(new Book("B101", "Java Basics", "James Gosling"));
        items.add(new Magazine("M202", "Tech Monthly", "Editorial Team"));
        items.add(new DVD("D303", "Inception", "Christopher Nolan"));

        for (LibraryItem item : items) {

            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            Reservable r = (Reservable) item;
            System.out.println("Available: " + r.checkAvailability());
            r.reserveItem();
            System.out.println("Available After Reserve: " + r.checkAvailability());

            System.out.println("---------------------------------");
        }
    }
}



