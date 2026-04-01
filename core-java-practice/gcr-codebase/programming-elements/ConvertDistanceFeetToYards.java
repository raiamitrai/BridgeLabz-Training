//Write a program the find the distance in yards and miles for the distance provided by user in feets
//Hint => 1 mile = 1760 yards and 1 yard is 3 feet
//I/P => distanceInFeet
//O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

package programmingElements;

import java.util.Scanner;

public class ConvertDistanceFeetToYards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distInFeet = sc.nextDouble();
        double distInYard = distInFeet/3;
        double distInMiles = distInYard/1760;

        System.out.println("Your Distance  in Yards is "+distInYard+" while in Miles is " + distInMiles);
    }
}
