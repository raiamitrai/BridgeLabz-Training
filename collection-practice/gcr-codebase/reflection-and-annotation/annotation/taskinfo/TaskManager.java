package annotation.taskinfo;

public class TaskManager {

    @TaskInfo(priority = "High", assignedTo = "Amit" )
    public void completeTask(){
        System.out.println("Task Completed");
    }
}
