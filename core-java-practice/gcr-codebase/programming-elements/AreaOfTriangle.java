//Write a program that takes the base and height to find area of a triangle in square inches and square centimeters
//Hint => Area of a Triangle is ½ * base * height
//I/P => base, height
//O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

package programmingElements;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double baseInCM = sc.nextDouble();
        double heightInCM = sc.nextDouble();

        double heightInInches = heightInCM/2.54;
        double heightInFeet = heightInInches/12;

        double areaInCM = (1/2) * baseInCM * heightInCM;
        double areaInInch = areaInCM/6.4516;
        System.out.println("Your Height in cm is " + heightInCM +" while in feet is "+ heightInFeet +" and inches is " + heightInInches);


    }
}
