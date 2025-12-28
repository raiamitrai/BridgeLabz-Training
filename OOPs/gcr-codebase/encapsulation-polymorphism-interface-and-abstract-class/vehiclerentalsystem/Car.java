package OOPs.encapsulation.vehiclerentalsystem;

public class Car extends Vehical implements Insurable {

    private String insurancePolicyNumber; // encapsulated

    public Car(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = policyNumber;
    }

    @Override
    public double calculateRantalRate(int days){
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance(){
        return 500;
    }
    @Override
    public String getInsuranceDetails(){
        return "car Insurance policy : " + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
    }

}
