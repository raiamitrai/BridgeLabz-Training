//Write a program to count down the number from the user input value to 1 using a while loop for a rocket launch
//Hint =>
//Create a variable counter to take user inputted value for the countdown.
//Use the while loop to check if the counter is 1
//Inside a while loop, print the value of the counter and decrement the counter.

package controlflow;

import java.util.Scanner;

class CountDown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = input.nextInt();
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
