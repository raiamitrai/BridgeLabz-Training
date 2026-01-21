package csvdatahandling.readcsvfile;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/csvdatahandling/readcsvfile/students.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            boolean isHeader = true;
            String line;
            while ((line = br.readLine()) != null){

                if(isHeader){
                    isHeader = false;
                    continue;
                }
                String[] data = line.split(",");

                System.out.println("ID    : " + data[0]);
                System.out.println("Name  : " + data[1]);
                System.out.println("Age   : " + data[2]);
                System.out.println("Marks : " + data[3]);
                System.out.println("-------------------");

            }
        } catch(Exception e){
            e.printStackTrace();
        }

    }
}
