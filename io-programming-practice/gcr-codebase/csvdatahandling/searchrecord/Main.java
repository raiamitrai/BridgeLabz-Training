package csvdatahandling.searchrecord;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String csvFilePath = "src/csvdatahandling/searchrecord/employees.csv";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name :- ");
        String searchName = sc.next();

        try(BufferedReader br = new BufferedReader(new FileReader(csvFilePath))){
            String line;
            // header skip
            br.readLine();
            while((line = br.readLine()) != null){

                String[] data = line.split(",");
                String name = data[1];

                if (name.equalsIgnoreCase(searchName)) {
                    System.out.println("Department    : " + data[2]);
                    System.out.println("Salary  : " + data[3]);
                    System.out.println("-------------------");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
