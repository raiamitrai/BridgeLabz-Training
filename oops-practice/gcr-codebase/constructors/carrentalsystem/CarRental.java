package OOPs.constructors.carrentalsystem;


class CarRental {

    private String customerName;
    private String carModel;
    private int rentalDays;
    private double costPerDay;

    // 1️⃣ Default Constructor
    CarRental() {
        this.customerName = "Guest";
        this.carModel = "Standard";
        this.rentalDays = 1;
        this.costPerDay = 1000; // default rate per day
    }

    // 2️⃣ Parameterized Constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = 1000; // fixed rate per day
    }

    // Method to calculate total cost
    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    // Display rental details
    void displayDetails() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days  : " + rentalDays);
        System.out.println("Total Cost   : " + calculateTotalCost());
        System.out.println("----------------------------");
    }
}

