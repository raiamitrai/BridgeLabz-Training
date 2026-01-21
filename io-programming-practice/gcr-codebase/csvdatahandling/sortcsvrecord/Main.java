package csvdatahandling.sortcsvrecord;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    static class Employee {
        String id;
        String name;
        String department;
        int salary;

        Employee(String id, String name, String department, int salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }
    }

    public static void main(String[] args) {

        String csvFilePath = "src/csvdatahandling/sortcsvrecord/sortrecord.csv";
        List<Employee> employees = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {

            String line;

            // Skip header
            br.readLine();

            // Read CSV data
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                Employee emp = new Employee(
                        data[0],
                        data[1],
                        data[2],
                        Integer.parseInt(data[3])
                );

                employees.add(emp);
            }

            // Sort by salary (descending)
            Collections.sort(employees, new Comparator<Employee>() {
                @Override
                public int compare(Employee e1, Employee e2) {
                    return e2.salary - e1.salary;
                }
            });

            // Print top 5 highest-paid employees
            System.out.println("Top 5 Highest Paid Employees:");
            System.out.println("--------------------------------");

            for (int i = 0; i < Math.min(5, employees.size()); i++) {
                Employee e = employees.get(i);
                System.out.println("Name       : " + e.name);
                System.out.println("Department : " + e.department);
                System.out.println("Salary     : " + e.salary);
                System.out.println("--------------------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

