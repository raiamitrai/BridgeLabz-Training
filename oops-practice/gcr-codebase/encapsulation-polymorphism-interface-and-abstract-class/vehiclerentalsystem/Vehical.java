package OOPs.encapsulation.vehiclerentalsystem;

public abstract class Vehical {
    private String vehicleNumber;
    private String type;
    protected double rentalRate;

    public Vehical(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public abstract double calculateRantalRate(int days);
}
