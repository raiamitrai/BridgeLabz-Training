//Rewrite the above program 7 to find the factors of a number using the while loop
//Hint =>
//Get the input value for a variable named number and check if it is a positive integer.
//Create a counter variable and run the _**while**_ loop till the counter is less than the user input number. In each iteration of the loop, check if the number is perfectly divisible by the counter. If true, print the value of the counter.

package controlflow;

import java.util.Scanner;

public class FactorUsingWhileLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number > 0) {
            int counter = 1;
            while (counter <= number) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter++;
            }
        } else {
            System.out.println("Enter a positive number");
        }
    }
}
