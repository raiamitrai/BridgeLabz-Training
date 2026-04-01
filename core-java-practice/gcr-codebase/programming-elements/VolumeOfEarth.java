package programmingElements;

import java.util.*;
public class VolumeOfEarth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double pi = 3.14;
        double volumeOfEarthInKm = (4/3)* pi * Math.pow(r,3);
        double volumeOfEarthInMiles = volumeOfEarthInKm * 0.239913;
        System.out.print("The Volume Of earth in Kilometer is "+volumeOfEarthInKm+" and cubic miles is "+ volumeOfEarthInMiles);
    }
}
