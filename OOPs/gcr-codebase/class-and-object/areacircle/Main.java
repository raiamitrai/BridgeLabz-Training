package OOPs.classandobject.areacircle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        AreaOfCircle circle = new AreaOfCircle(r);
        circle.display();
    }
}
