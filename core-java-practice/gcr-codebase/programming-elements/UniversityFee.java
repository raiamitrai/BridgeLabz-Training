package programmingElements;
public class UniversityFee {
    public static void main(String[] args) {
        int fee = 125000;
        int discountPercent = 10;
        double discount = (fee * discountPercent)/100;
        double discountFee = fee - discount;
        System.out.print(discountFee);
    }
}
