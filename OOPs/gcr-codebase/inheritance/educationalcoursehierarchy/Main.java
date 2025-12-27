package OOPs.inheritance.educationalcoursehierarchy;

public class Main {
    public static void main(String[] args) {

        // Only child class object is enough
        PaidOnlineCourse course = new PaidOnlineCourse(
                "Java Full Stack",
                120,              // duration in hours
                "Udemy",          // platform
                false,             // isRecorded
                10000,            // fee
                20                // discount (%)
        );

        course.displayDetails();
    }
}
