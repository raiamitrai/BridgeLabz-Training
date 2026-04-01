//Write a program to check if the first, second, or third number is the largest of the three.
//I/P => number1, number2, number3
//O/P =>
//Is the first number the largest? ____
//Is the second number the largest? ___
//Is the third number the largest? ___

package controlflow;
import java.util.Scanner;
public class LargestNumberBetweenThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        if(number1 > number2 && number1 > number3){
            System.out.println("First number is Largest");
        }
        if(number1 < number2 && number3 < number2){
            System.out.println("second number is Largest");
        }
        else{
            System.out.println("Third number is Largest");
        }
    }
}
