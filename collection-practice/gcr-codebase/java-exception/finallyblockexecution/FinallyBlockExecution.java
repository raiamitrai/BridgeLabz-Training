package exception.finallyblockexecution;

import java.util.Scanner;

public class FinallyBlockExecution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        try{
            int result = a/b;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println("denominator must be non zero");
        }
        finally {
            System.out.println("Operation completed");
        }
    }
}
