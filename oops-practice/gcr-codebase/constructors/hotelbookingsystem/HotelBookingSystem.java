//Hotel Booking System: Create a HotelBooking class with attributes guestName, roomType,
// and nights. Use default, parameterized, and copy constructors to initialize bookings.

package OOPs.constructors.hotelbookingsystem;

public class HotelBookingSystem {
    private String guestName;
    private String roomType;
    private int nights;

    // default constructors
    HotelBookingSystem(){
        this.guestName="Amit";
        this.roomType = "Non-Ac";
        this.nights = 2;
    }

    // parameterized constructor
    HotelBookingSystem(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // copy constructor
    HotelBookingSystem(HotelBookingSystem other){
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    void displayResult(){
        System.out.println("Guest Name : " + guestName);
        System.out.println("Room Type  : " + roomType);
        System.out.println("Nights     : " + nights);
        System.out.println("---------------------------");
    }
}
