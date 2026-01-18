package annotation.customannotation.markimportantmethods;

public class AnnotationMethods {

    @ImportantMethod
    public void saveData(){
        System.out.println("Data Saving");
    }

    @ImportantMethod(level = "Low")
    public void logData(){
        System.out.println("Logging data");
    }

    public void helper(){
        System.out.println("Helper method");
    }

}
