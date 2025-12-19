//Write a program to check whether a number is positive, negative, or zero.
//Hint =>
//Get integer input from the user and store it in the number variable.
//If the number is positive, print positive.
//If the number is negative, print negative.
//If the number is zero, print zero.

package controlflow;
import java.util.Scanner;

class CheckNumberPositiveNegativeAndZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
