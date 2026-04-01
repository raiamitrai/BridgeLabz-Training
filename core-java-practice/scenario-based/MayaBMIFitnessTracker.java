package scenariobased;

import java.util.Scanner;

public class MayaBMIFitnessTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the height :- ");
        double height = sc.nextDouble();
        System.out.println("enter the weight :- ");
        double weight = sc.nextDouble();

        double BMI = weight /(height * height);

        // dosplay BMI
        System.out.println("BMI: "+ BMI);

        // display category
        if(BMI <= 18.4){
            System.out.println("category : Underweight");
        }
        if(BMI >=18.5 && BMI <= 24.9){
            System.out.println("category : Normal");
        }
        if(BMI >= 25.0 && BMI <= 39.9 ){
            System.out.println("category : Overweight");
        }


    }
}
