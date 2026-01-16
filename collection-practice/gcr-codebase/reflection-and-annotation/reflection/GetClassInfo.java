//Get Class Information: Write a program to accept a class name as input and display its methods, fields, and constructors using Reflection.

package reflection;

import java.lang.reflect.*;
        import java.util.Scanner;
public class GetClassInfo {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter class name: ");
            String className = sc.nextLine();

            Class<?> cls = Class.forName(className);

            System.out.println("\nClass Name: " + cls.getName());

            System.out.println("\n--- Methods ---");
            for (Method m : cls.getDeclaredMethods()) {
                System.out.println(m.getName());
            }

            System.out.println("\n--- Fields ---");
            for (Field f : cls.getDeclaredFields()) {
                System.out.println(f.getName());
            }

            System.out.println("\n--- Constructors ---");
            for (Constructor<?> c : cls.getDeclaredConstructors()) {
                System.out.println(c);
            }

        } catch (Exception e) {
            System.out.println("Invalid class name!");
        }
    }
}

