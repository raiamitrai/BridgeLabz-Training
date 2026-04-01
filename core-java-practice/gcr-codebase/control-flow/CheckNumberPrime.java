package controlflow;

//check number is prime or not

import java.util.Scanner;

public class CheckNumberPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isPrime = true;
        if( number <= 1){
            isPrime = false;
        }
        for (int i = 2 ; i < Math.sqrt(number) ; i++){
            if (number % i == 0){
                isPrime = false;
            }
        }
        if(isPrime){
            System.out.println(number + " is Prime number");
        }
        else{
            System.out.println(number+ "is not Prime Number");
        }
    }
}

