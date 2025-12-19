//Write a program to check for the natural number and write the sum of n natural numbers
//Hint =>
//A Natural Number is a positive integer (1,2,3, etc) sometimes with the inclusion of 0
//A sum of n natural numbers is n * (n+1) / 2
//I/P => number
//O/P => If the number is a positive integer then the output is
//The sum of ___ natural numbers is ___
//Otherwise
//The number ___ is not a natural number

package controlflow;

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum =0;
        if( number > 0){
            System.out.println("the number is natural number");

            sum = (number * (number +1)) / 2;
        }

        System.out.println(sum);

    }
}
