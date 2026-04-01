package annotation.customannotation.markimportantmethods;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        AnnotationMethods annotationMethods = new AnnotationMethods();

        // fatch all mathod from class
        Method[] method = annotationMethods.getClass().getDeclaredMethods( );

        // check all method
        for(Method i : method){
            //check : @Importantmethod are there or not
            if(i.isAnnotationPresent(ImportantMethod.class)){

                // fatch the data of anotation
                ImportantMethod importantMethod =i.getAnnotation(ImportantMethod.class);

                System.out.println(
                        "Method Name: " + i.getName() +
                                ", Level: " + importantMethod.level()
                );
            }
        }
    }
}
