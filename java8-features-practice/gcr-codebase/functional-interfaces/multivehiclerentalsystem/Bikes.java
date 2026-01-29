package interfaces.multivehiclerentalsystem;

class Bikes implements Vehicals {

    public void rent() {
        System.out.println("Bike has been rented");
    }

    public void returnVehicle() {
        System.out.println("Bike has been returned");
    }
}

