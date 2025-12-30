package dsa.linkedlist.studentrecordmanagement;

public class Main {
    public static void main(String[] args) {

        StudentRecordManagemant list = new StudentRecordManagemant();

        list.insertAtEnd("Amit", 1, 20, 'A');
        list.insertAtEnd("Ravi", 2, 21, 'B');
        list.insertAtBeginning("Neha", 3, 19, 'A');

        list.displayAll();

        System.out.println("\nSearch Roll 2:");
        list.searchStudent(2);

        System.out.println("\nUpdate Grade:");
        list.updateGrade(2, 'A');

        System.out.println("\nDelete Roll 1:");
        list.deleteByRollNumber(1);

        System.out.println("\nFinal Records:");
        list.displayAll();
    }
}
