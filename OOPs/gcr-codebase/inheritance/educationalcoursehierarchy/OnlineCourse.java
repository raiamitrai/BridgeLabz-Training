package OOPs.inheritance.educationalcoursehierarchy;

public class OnlineCourse extends Course {
    private String platform;
    private boolean isRecorded;

    OnlineCourse(String couseName , int duration , String platform, boolean isRecorded){
        super(couseName,duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    public String getPlateform() {
        return platform;
    }

    public boolean isRecorded() {
        return isRecorded;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Platform    : " + platform);
        System.out.println("Recorded    : " + (isRecorded ? "Yes" : "No"));
    }
}
