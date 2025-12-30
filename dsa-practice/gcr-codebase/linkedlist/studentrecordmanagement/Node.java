package dsa.linkedlist.studentrecordmanagement;

public class Node {
    String name ;
    int rollNumber;
    int age;
    char grade;
    Node next;

    public Node(String name, int rollNumber, int age, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.grade = grade;
        this.next=null;
    }
}
