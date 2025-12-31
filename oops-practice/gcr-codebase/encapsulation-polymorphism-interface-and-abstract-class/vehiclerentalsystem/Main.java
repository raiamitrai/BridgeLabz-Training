package OOPs.encapsulation.vehiclerentalsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Vehical> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR101", 2000, "CAR-INS-9876"));
        vehicles.add(new Bike("BIKE202", 800, "BIKE-INS-1234"));
        vehicles.add(new Truck("TRUCK303", 5000, "TRUCK-INS-4567"));

        int days = 3;

        for (Vehical v : vehicles) {
            System.out.println("Vehicle Type   : " + v.getType());
            System.out.println("Vehicle Number : " + v.getVehicleNumber());
            System.out.println("Rental Cost    : " + v.calculateRantalRate(days));

            Insurable insurable = (Insurable) v;
            System.out.println("Insurance Cost : " + insurable.calculateInsurance());
            System.out.println(insurable.getInsuranceDetails());

            System.out.println("--------------------------------");
        }
    }
}

