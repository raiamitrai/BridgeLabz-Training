package programmingElements;


import java.util.Scanner;

class AverageOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        double average = (num1 + num2 + num3) / 3;
        System.out.println("The average is " + average);
    }
}
