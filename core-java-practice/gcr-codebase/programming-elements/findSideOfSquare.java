//Write a program to find the side of the square whose parameter you read from user
//Hint => Perimeter of Square is 4 times side
//I/P => perimeter
//O/P => The length of the side is ___ whose perimeter is ____

package programmingElements;

import java.util.Scanner;

public class findSideOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int parameter = sc.nextInt();
        double lenghtOfSide = parameter/4;
        System.out.println("The length of the side is "+ lenghtOfSide +" whose perimeter is " + parameter);
    }
}
