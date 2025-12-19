package controlflow;

import java.util.Scanner;

public class GreatestFactorUsingWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int greatestFactor = 1;
        int counter = number - 1;
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }
        System.out.println("The greatest factor is " + greatestFactor);
    }
}
