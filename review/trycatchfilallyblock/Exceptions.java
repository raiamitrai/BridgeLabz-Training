package review.trycatchfilallyblock;

public class Exceptions {
    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
            return 0; 
        } finally {
            System.out.println("Executing finally block.");
        }
    }

    public static void main(String[] args) {
        int result1 = divide(10, 2);
        System.out.println("Result of division: " + result1);

        int result2 = divide(10, 0);
        System.out.println("Result of division: " + result2);
    }
    
}
