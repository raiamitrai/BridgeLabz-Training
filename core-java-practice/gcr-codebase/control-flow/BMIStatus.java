package controlflow;

import java.util.Scanner;

public class BMIStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weightInKg = sc.nextDouble();
        double heightInCm = sc.nextDouble();


       double heightInMeter = heightInCm /100;

       double BMI = weightInKg /(heightInMeter * heightInMeter);

       if(BMI <= 18.4){
           System.out.println("Underweight");
       }
       if(BMI >=18.5 && BMI <= 24.9){
           System.out.println("Normal");
       }
       if(BMI >= 25.0 && BMI <= 39.9 ){
           System.out.println("Overweight");
       }
       if(BMI >= 40.0){
           System.out.println("Obese");
       }
    }
}
