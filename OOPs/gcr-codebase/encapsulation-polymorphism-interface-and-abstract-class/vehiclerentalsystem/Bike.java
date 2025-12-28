package OOPs.encapsulation.vehiclerentalsystem;

public class Bike extends Vehical implements Insurable {

    private String insurancePolicyNumber; // encapsulated

    public Bike(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = policyNumber;
    }

    @Override
    public double calculateRantalRate(int days){
        return (rentalRate * days ) - 200 ;
    }

    @Override
    public double calculateInsurance(){
        return  200;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy: ****" +
                insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
    }
}
