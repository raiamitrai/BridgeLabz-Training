//Rewrite the program to find all the multiples of a number below 100 using while loop.
//Hint =>
//Get the input value for a variable named number. Check the number is a positive integer and less than 100.
//Create a counter variable and assign counter = number - 1; Use a while till the counter is > 1
//Inside the loop, check if the counter perfectly divides the number. If true, print the number and continue the loop.

package controlflow;

import java.util.Scanner;

public interface MultipleOfNumberBelow100UsingWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number > 0 && number < 100) {
            int counter = number - 1;
            while (counter > 1) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        } else {
            System.out.println("Enter a positive number less than 100");
        }
    }
}
