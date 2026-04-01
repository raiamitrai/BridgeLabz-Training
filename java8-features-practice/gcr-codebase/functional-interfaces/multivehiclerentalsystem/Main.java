package interfaces.multivehiclerentalsystem;

public class Main {
    public static void main(String[] args) {

        Vehicals car = new Cars();
        Vehicals bike = new Bikes();
        Vehicals bus = new Buses();

        car.rent();
        bike.rent();
        bus.rent();

        car.returnVehicle();
        bike.returnVehicle();
        bus.returnVehicle();
    }
}
