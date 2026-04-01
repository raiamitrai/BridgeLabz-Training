// Validate JSON structure using Jackson.
package ValidateUsingjackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class Main {
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.readTree(new File("user.json"));
            System.out.println("JSON file is VALID");
        } catch (Exception e) {
            System.out.println("JSON file is INVALID");
        }
    }
}

