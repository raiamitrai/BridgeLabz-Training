package readjasonfile;

import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws Exception{

        // file read in String
        String contant = new String(Files.readAllBytes(Paths.get("src/main/java/readjasonfile/user.json")));

        // String to jason object
        JSONObject jsonObject = new JSONObject(contant);

        String name = jsonObject.getString("name");
        String email = jsonObject.getString("email");

        System.out.println("name" + name);
        System.out.println("email" + email);
    }
}
