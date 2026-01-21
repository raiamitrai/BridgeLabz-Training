package csvdatahandling.writecsvfile;

import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {

        String filePath = "src\\csvdatahandling\\writecsvfile\\employee.csv";

        try(FileWriter writer = new FileWriter(filePath)){

            //header
            writer.append("ID,Name,Department,Selery\n");

            // write content
            writer.append("1,Ravi,IT,50000\n");
            writer.append("2,Suman,HR,45000\n");
            writer.append("3,Aakash,Finance,55000\n");
            writer.append("4,Priya,Marketing,48000\n");
            writer.append("5,Neeraj,IT,60000\n");

            System.out.println("CSV file written successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
