//Rewrite the above program to find the power of a number using a while loop.
//Hint =>
//Get integer input for two variables named number and power.
//Create a result variable with an initial value of 1.
//Create a temp variable counter and initialize to zero. Use the while loop till _**counter == power**_.
//In each iteration of the loop, multiply the result by the number and assign the value to the result. Also, increment the counter.
//Finally, print the result

package controlflow;

import java.util.Scanner;

public class PowerOfNumberUsingWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int power = input.nextInt();
        int result = 1;
        int counter = 0;
        while (counter < power) {
            result *= number;
            counter++;
        }
        System.out.println("Result is " + result);
    }
}