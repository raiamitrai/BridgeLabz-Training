//Write a program to check if a number is divisible by 5
//I/P => number
//O/P => Is the number ___ divisible by 5? ___

package controlflow;

import java.util.Scanner;

public class CheckNumberIsDivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number % 5 == 0){
            System.out.println(" the number "+number+" is divisible by 5");
        }else{
            System.out.println(" the number "+number+" is not divisible by 5");
        }
    }
}
