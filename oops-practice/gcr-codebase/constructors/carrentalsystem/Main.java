package OOPs.constructors.carrentalsystem;

public class Main {
    public static void main(String[] args) {

        // Using default constructor
        CarRental rental1 = new CarRental();
        rental1.displayDetails();

        // Using parameterized constructor
        CarRental rental2 = new CarRental("Amit", "Honda City", 3);
        rental2.displayDetails();
    }
}

