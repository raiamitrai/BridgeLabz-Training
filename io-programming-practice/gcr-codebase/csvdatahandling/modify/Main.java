package csvdatahandling.modify;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {

        String inputFile = "src/csvdatahandling/modify/modify.csv";
        String outputFile = "src/csvdatahandling/modify/employees_updated.csv";

        try (
                BufferedReader br = new BufferedReader(new FileReader(inputFile));
                FileWriter writer = new FileWriter(outputFile)
        ) {

            String line;

            // Read & write header
            line = br.readLine();
            writer.write(line + "\n");

            // Read remaining records
            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                String department = data[2];
                double salary = Double.parseDouble(data[3]);

                // Increase salary by 10% for IT department
                if (department.equalsIgnoreCase("IT")) {
                    salary = salary + (salary * 0.10);
                }

                // Write updated record
                writer.write(
                        data[0] + "," +
                                data[1] + "," +
                                data[2] + "," +
                                (int) salary + "\n"
                );
            }

            System.out.println("Salary updated successfully and saved to new CSV file.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

