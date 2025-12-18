package programmingElements;
import java.util.*;
class KmToMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kilometers = input.nextDouble();
        double miles = kilometers * 0.621371;
        System.out.println("The distance in miles is " + miles);
    }
}
