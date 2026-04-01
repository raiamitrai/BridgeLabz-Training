//Write a program to check if the first is the smallest of the 3 numbers.
//I/P => number1, number2, number3
//O/P => Is the first number the smallest? ____

package controlflow;

import java.util.Scanner;

public class SmallestNumberBetweenThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        if(number1 < number2 && number1 < number3){
            System.out.println("First number is smallest");
        }else{
            System.out.println("First number is not smallest");
        }
    }
}
