package Day16.GenericInterface;

import java.util.*;

class Student implements Comparable<Student> {

    int score;

    Student(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Student other) {
        return this.score - other.score;
    }

    @Override
    public String toString() {
        return "Student{score=" + score + "}";
    }
}

public class Main {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(85));
        studentList.add(new Student(60));
        studentList.add(new Student(95));
        studentList.add(new Student(72));

        Collections.sort(studentList);

        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
