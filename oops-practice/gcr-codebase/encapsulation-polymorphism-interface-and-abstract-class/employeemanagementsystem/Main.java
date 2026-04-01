package OOPs.encapsulation.employeemanagementsystem;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        Employee e1 = new FullTimeEmployee(101, "Rahul", 50000);
        Employee e2 = new PartTimeEmployee(102, "Amit", 500, 40);

        ((Department) e1).assignDepartment("IT");
        ((Department) e2).assignDepartment("HR");

        employees.add(e1);
        employees.add(e2);

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("-------------------");
        }
    }
}

