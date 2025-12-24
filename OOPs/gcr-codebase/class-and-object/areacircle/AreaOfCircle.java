package OOPs.classandobject.areacircle;

public class AreaOfCircle {
    private double radius;

    AreaOfCircle(double radius){
        this.radius=radius;
    }
    double areaOfCircle(){
        return 3.14*radius*radius;
    }
    double circumOfCircle(){
        return 2*3.14*radius;
    }

    void display(){
        System.out.printf("Area Of Circle : %.4f \n", areaOfCircle());
        System.out.println("Circumference of Circle : " + circumOfCircle());
    }
}
