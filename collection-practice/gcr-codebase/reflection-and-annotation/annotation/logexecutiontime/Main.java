package annotation.customannotation.logexecutiontime;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Service service = new Service();

        // fatch all method from Service class
        Method[] methods = service.getClass().getDeclaredMethods();

        //check all methods
        for(Method i : methods){

            //check : methods which we have @LogExecutionTime annotation
            if(i.isAnnotationPresent(LogExecutionTime.class)){

                // start time
                long startTime =  System.nanoTime();

                // execute method
                i.invoke(service);    // invoke used for run(call) method through reflection

                // End time
                long endTime = System.nanoTime();    //System.nanoTime() used for measure execution time

                //  Execution time calculate
                long executionTime = endTime - startTime;

                // Print result
                System.out.println(
                        "Method: " + i.getName() +
                                " | Execution Time: " + executionTime + " ns"
                );
            }
        }
    }
}
