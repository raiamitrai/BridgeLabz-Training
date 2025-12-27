package OOPs.inheritance.educationalcoursehierarchy;

public class Course {
    private String courseName;
    private int duration;

    Course(String courseName, int duration){
        this.courseName = courseName;
        this.duration =duration;
    }

    public String getCourseName() {
        return courseName;
    }
    public int getDuration() {
        return duration;
    }

    public void displayDetails() {
        System.out.println("Course Name : " + courseName);
        System.out.println("Duration    : " + duration + " hours");
    }
}
