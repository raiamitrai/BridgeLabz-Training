package Day12.ConstructorOverloading;

class Student {
    String name;
    int age;
    String course;

    // 1. No-argument constructor
    public Student() {
        this("Unknown", 0, "Not assigned");
    }

    // 2. Name-only constructor
    public Student(String name) {
        this(name, 18, "General Studies");
    }

    // 3. Full constructor
    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        // Using no-argument constructor
        Student s1 = new Student();

        // Using name-only constructor
        Student s2 = new Student("Amit");

        // Using full constructor
        Student s3 = new Student("Rahul", 21, "Computer Science");

        // Display all objects
        s1.display();
        s2.display();
        s3.display();
    }
}
