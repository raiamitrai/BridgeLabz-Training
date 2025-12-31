package OOPs.encapsulation.vehiclerentalsystem;

public class Truck extends Vehical implements Insurable{

    private String insurancePolicyNumber; // encapsulated

    public Truck(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = policyNumber;
    }


    @Override
    public double calculateRantalRate(int days){
        return (rentalRate * days ) + 1000 ;
    }

    @Override
    public double calculateInsurance() {
        return 1200;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: ****" +
                insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
    }

}
