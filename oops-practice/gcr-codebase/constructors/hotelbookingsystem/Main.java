package OOPs.constructors.hotelbookingsystem;

public class Main {
    public static void main(String[] args) {
        // using default constructor
        HotelBookingSystem booking1  = new HotelBookingSystem();
        booking1.displayResult();

        // paramaterize constructor
        HotelBookingSystem booking2 = new HotelBookingSystem("Rahul", "Standard" , 10);
        booking2.displayResult();

        // copy constructor
        HotelBookingSystem booking3 = new HotelBookingSystem(booking2);
        booking3.displayResult();
    }
}
