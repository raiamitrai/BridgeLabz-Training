package exception.propogationexception;

import java.lang.reflect.Method;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class PropogationException {

    static double method1(double a , double b) throws ArithmeticException {
        if(b == 0){
            throw  new ArithmeticException(" denominator must be non zero");
        }
        return a/b;
    }

    static void method2(double a , double b){
            method1(a, b);
        }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            double a = scanner.nextDouble();
            double b  = scanner.nextDouble();
            method2(a,b);
        }
        catch (InputMismatchException e){
            System.out.println("Input mismatch");
        }
        catch(ArithmeticException e){
            System.out.println("i think denominator is zero please choose non zero number");
        }
    }
}

