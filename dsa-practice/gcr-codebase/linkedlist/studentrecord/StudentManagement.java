package dsa.linkedlist.studentrecord;

public class StudentManagement {
    Node head;

    void insertAtBegining(String name, int rollNumber, int age, char grade) {
        Node newNode = new Node(name, rollNumber, age, grade);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    void insertAtEnd(String name, int rollNumber, int age, char grade) {
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

    void insertAtSpecificPoint(String name, int rollNumber, int age, char grade, int position) {
        Node newNode = new Node(name, rollNumber, age, grade);
        if (position <= 1) {
            insertAtBegining(name, rollNumber, age, grade);
            return;
        }
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        for (int i = 1; i < position - 1; i++) {
            if (temp.next == null) {
                System.out.println("Invalid position");
                return;
            }
            temp = temp.next;

        }
        newNode.next = temp.next;
        temp.next = newNode;
    }


    void deleteRecord(int rollNumber) {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        //  Case 1: Head node delete
        if (head.rollNumber == rollNumber) {
            head = head.next;
            System.out.println("Record deleted");
            return;
        }
        // Case 2: Middle / End delete
        Node temp = head;
        while (temp.next != null && temp.next.rollNumber != rollNumber) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("record not found");
            return;
        }
        if (temp.next.rollNumber == rollNumber) {
            temp.next = temp.next.next;
        }
    }
    void searchRecordByRollNumber(int rollNumber) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                System.out.println("Found → Roll: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Record not found");
    }

    void display() {
        if (head == null) {
            System.out.println("List Is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println("Roll: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }

    void updateGrade(int rollNumber, char newGrade) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                temp.grade = newGrade;
                System.out.println("Grade updated successfully");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Record not found");
    }


}
