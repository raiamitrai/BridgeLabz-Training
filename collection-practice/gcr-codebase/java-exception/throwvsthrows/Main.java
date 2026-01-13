package exception.throwvsthrows;

public class Main {
    public static void main(String[] args) {
        ThrowVsThrows result = new ThrowVsThrows();

        try {
            double interest = result.calculateInterest(50, 20, 10 );
            System.out.println("Calculated Interest: " + interest);

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: Amount and rate must be positive");
        }
    }
}
