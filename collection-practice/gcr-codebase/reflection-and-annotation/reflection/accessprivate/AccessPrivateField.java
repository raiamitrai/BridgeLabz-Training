//Access Private Field: Create a class Person with a private field age. Use Reflection to modify and retrieve its value.
package reflection.accessprivate;

import java.lang.reflect.Field;

public class AccessPrivateField {
    public static void main(String[] args) {
        try {
            Person person = new Person();

            Class<?> cls = person.getClass();

            Field field = cls.getDeclaredField("age");
            field.setAccessible(true); // 🔑 private access allow

            field.set(person, 23); // set value
            int value = (int) field.get(person); // get value

            System.out.println("Age = " + value);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

