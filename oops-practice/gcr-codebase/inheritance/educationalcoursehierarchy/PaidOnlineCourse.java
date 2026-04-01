package OOPs.inheritance.educationalcoursehierarchy;

public class PaidOnlineCourse extends OnlineCourse{
    private double fee;
    private double discount;

    public PaidOnlineCourse(String couseName, int duration, String plateform, boolean isRecorded, double fee, double discount) {
        super(couseName, duration, plateform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double calculateFinalFee() {
        return fee - (fee * discount / 100);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Course Fee  : ₹" + fee);
        System.out.println("Discount   : " + discount + "%");
        System.out.println("Final Fee  : ₹" + calculateFinalFee());
    }

}
