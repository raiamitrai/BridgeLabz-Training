package annotation.taskinfo;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        TaskManager manager = new TaskManager();

        // reference of completeTask mathod
        Method method = manager.getClass().getMethod("completeTask");

        // get TaskInfo annotation from Method
        TaskInfo info =method.getAnnotation(TaskInfo.class);

        // use annotation value
        System.out.println("Priority :- " + info.priority());
        System.out.println("Assigned To :- " + info.assignedTo());
    }
}
