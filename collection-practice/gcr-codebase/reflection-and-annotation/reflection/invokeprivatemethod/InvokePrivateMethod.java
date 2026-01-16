//Invoke Private Method: Define a class Calculator with a private method multiply(int a, int b). Use Reflection to invoke this method and display the result.

package reflection.invokeprivatemethod;

import java.lang.reflect.Method;

public class InvokePrivateMethod {
    public static void main(String[] args) {
        try {
            Calculator calc = new Calculator();

            Class<?> cls = calc.getClass();
            Method method = cls.getDeclaredMethod(
                    "multiply",
                    int.class,
                    int.class
            );

            method.setAccessible(true);

            int result = (int) method.invoke(calc, 4, 5);

            System.out.println("Result = " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

