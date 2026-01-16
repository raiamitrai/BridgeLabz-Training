package reflection.dynamicobjectCreation;

public class DynamicObjectCreation {
    public static void main(String[] args) {
        try {

            Class<?> cls = Class.forName("Student");

            Object obj = cls.getDeclaredConstructor().newInstance();

            System.out.println("Object created: " + obj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

