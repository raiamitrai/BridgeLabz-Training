package exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckException {

    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(file);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}

