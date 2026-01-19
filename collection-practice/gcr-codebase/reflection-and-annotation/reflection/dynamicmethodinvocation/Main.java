package reflection.dynamicmethodinvocation;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter mathod name (add / subtract / multiply):- ");
            String methodName = sc.nextLine();

            System.out.println("enter first number :- ");
            int a = sc.nextInt();

            System.out.println("enter second number :- ");
            int b = sc.nextInt();

            MathOperations operations = new MathOperations();

            // class object
            Class<?> cls = operations.getClass();

            Method method = cls.getDeclaredMethod(methodName, int.class, int.class);


            // method call
            Object result = method.invoke(operations, a, b);

            System.out.println("Result:- " + result);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
