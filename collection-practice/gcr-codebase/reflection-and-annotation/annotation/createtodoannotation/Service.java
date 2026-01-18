package annotation.customannotation.createtodoannotation;

public class Service {

    @Todo(task = "Implement login feature", assignTo = "Amit", priority = "HIGH")
    public void loginFeature() {
    }

    @Todo(task = "Add payment gateway", assignTo = "Rahul")
    public void paymentFeature() {
    }

    @Todo(task = "Improve UI design", assignTo = "Neha", priority = "LOW")
    public void uiImprovement() {
    }

    public void completedFeature() {
    }
}

