package annotation.customannotation.createtodoannotation;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        Service service = new Service();

        Method[] methods = service.getClass().getDeclaredMethods();

        for( Method i : methods){
            if(i.isAnnotationPresent(Todo.class)){
                Todo todo = i.getAnnotation(Todo.class);
                System.out.println(
                        "Method: " + i.getName() +
                                "\n  Task: " + todo.task() +
                                "\n  Assigned To: " + todo.assignTo() +
                                "\n  Priority: " + todo.priority() +
                                "\n"
                );
            }
        }

    }
}
