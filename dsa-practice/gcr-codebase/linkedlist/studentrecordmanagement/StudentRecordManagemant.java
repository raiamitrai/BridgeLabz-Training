package dsa.linkedlist.studentrecordmanagement;

public class StudentRecordManagemant {

    Node head;

    // Insert at Beginning
    public void insertAtBeginning(String name, int rollNumber, int age, char grade) {
        Node newNode = new Node(name, rollNumber, age, grade);
        newNode.next = head;
        head = newNode;
    }

    // Insert at End
    public void insertAtEnd(String name, int rollNumber, int age, char grade) {
        Node newNode = new Node(name, rollNumber, age, grade);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Insert at Specific Position (1-based)
    public void insertAtSpecificPosition(String name, int rollNumber, int age, char grade, int position) {
        if (position == 1) {
            insertAtBeginning(name, rollNumber, age, grade);
            return;
        }

        Node newNode = new Node(name, rollNumber, age, grade);
        Node temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete by Roll Number
    public void deleteByRollNumber(int rollNumber) {
        if (head == null) return;

        if (head.rollNumber == rollNumber) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.rollNumber != rollNumber) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Student not found");
        } else {
            temp.next = temp.next.next;
        }
    }

    // Search by Roll Number
    public void searchStudent(int rollNumber) {
        Node temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                System.out.println(
                        "Found → Roll: " + temp.rollNumber +
                                ", Name: " + temp.name +
                                ", Age: " + temp.age +
                                ", Grade: " + temp.grade
                );
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    // Update Grade
    public void updateGrade(int rollNumber, char newGrade) {
        Node temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                temp.grade = newGrade;
                System.out.println("Grade updated successfully");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    // Display All Records
    public void displayAll() {
        if (head == null) {
            System.out.println("No student records");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.println(
                    "Roll: " + temp.rollNumber +
                            ", Name: " + temp.name +
                            ", Age: " + temp.age +
                            ", Grade: " + temp.grade
            );
            temp = temp.next;
        }
    }
}
