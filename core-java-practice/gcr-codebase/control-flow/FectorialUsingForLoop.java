package controlflow;


import java.util.Scanner;

public class FectorialUsingForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        long factorial = 1;
        if (number >= 0) {
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("Factorial is " + factorial);
        } else {
            System.out.println("Invalid input. Enter a positive integer.");
        }
    }
}
