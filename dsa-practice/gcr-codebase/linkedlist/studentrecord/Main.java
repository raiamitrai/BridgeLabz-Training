package dsa.linkedlist.studentrecord;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StudentManagement sm = new StudentManagement();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- Student Record Management ---");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Specific Position");
            System.out.println("4. Delete by Roll Number");
            System.out.println("5. Search by Roll Number");
            System.out.println("6. Update Grade");
            System.out.println("7. Display All Records");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1 -> {
                    System.out.print("Name: ");
                    String name = sc.next();
                    System.out.print("Roll: ");
                    int roll = sc.nextInt();
                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    System.out.print("Grade: ");
                    char grade = sc.next().charAt(0);
                    sm.insertAtBegining(name, roll, age, grade);
                }

                case 2 -> {
                    System.out.print("Name: ");
                    String name = sc.next();
                    System.out.print("Roll: ");
                    int roll = sc.nextInt();
                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    System.out.print("Grade: ");
                    char grade = sc.next().charAt(0);
                    sm.insertAtEnd(name, roll, age, grade);
                }

                case 3 -> {
                    System.out.print("Name: ");
                    String name = sc.next();
                    System.out.print("Roll: ");
                    int roll = sc.nextInt();
                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    System.out.print("Grade: ");
                    char grade = sc.next().charAt(0);
                    System.out.print("Position: ");
                    int pos = sc.nextInt();
                    sm.insertAtSpecificPoint(name, roll, age, grade, pos);
                }

                case 4 -> {
                    System.out.print("Roll to delete: ");
                    int roll = sc.nextInt();
                    sm.deleteRecord(roll);
                }

                case 5 -> {
                    System.out.print("Roll to search: ");
                    int roll = sc.nextInt();
                    sm.searchRecordByRollNumber(roll);
                }

                case 6 -> {
                    System.out.print("Roll: ");
                    int roll = sc.nextInt();
                    System.out.print("New Grade: ");
                    char grade = sc.next().charAt(0);
                    sm.updateGrade(roll, grade);
                }

                case 7 -> sm.display();

                case 0 -> System.out.println("Exiting...");

                default -> System.out.println("Invalid choice");
            }

        } while (choice != 0);


    }
}

