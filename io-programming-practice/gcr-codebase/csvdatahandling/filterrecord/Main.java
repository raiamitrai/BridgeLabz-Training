package csvdatahandling.filterrecord;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        String csvFilePath = "src/csvdatahandling/filterrecord/filter.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(csvFilePath))){
            String line;
            // header skip
            br.readLine();
            while((line = br.readLine()) != null){

                String[] data = line.split(",");
                int marks = Integer.parseInt(data[3]);

                if (marks > 80) {
                    System.out.println("ID    : " + data[0]);
                    System.out.println("Name  : " + data[1]);
                    System.out.println("Age   : " + data[2]);
                    System.out.println("Marks : " + data[3]);
                    System.out.println("-------------------");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
