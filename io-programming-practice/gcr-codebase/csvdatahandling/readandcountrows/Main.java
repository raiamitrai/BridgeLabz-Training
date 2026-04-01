package csvdatahandling.readandcountrows;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        String csvFilePath = "src/csvdatahandling/readandcountrows/read.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(csvFilePath))){
            int count = 0;
            String line;
            while((line = br.readLine()) != null){
                count++;
            }
            System.out.println(count-1);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
