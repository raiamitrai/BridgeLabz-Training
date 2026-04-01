package exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("info.txt"))){
            String readFirstLine = bufferedReader.readLine();
        }
        catch (IOException e) {
            System.out.println("Error reading File");
        }
    }

}
