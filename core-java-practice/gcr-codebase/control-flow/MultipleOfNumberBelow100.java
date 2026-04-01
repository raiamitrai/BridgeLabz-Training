//Create a program to find all the multiples of a number taken as user input below 100.
//Hint =>
//Get the input value for a variable named number. Check the number is a positive integer and less than 100.
//Run a for loop backward: from i = 100 to i = 1.
//Inside the loop, check if i perfectly divide the number. If true, print the number and continue the loop.

package controlflow;



import java.util.Scanner;

public class MultipleOfNumberBelow100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number > 0 && number < 100) {
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Enter a positive number less than 100");
        }
    }
}
