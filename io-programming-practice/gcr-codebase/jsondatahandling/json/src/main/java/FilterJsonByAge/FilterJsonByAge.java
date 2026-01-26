package FilterJsonByAge;

import org.json.JSONArray;
import org.json.JSONObject;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FilterJsonByAge {
    public static void main(String[] args) throws Exception {

        //  Read JSON file as String
        String content = new String(
                Files.readAllBytes(Paths.get("users.json"))
        );

        //  String → JSONArray
        JSONArray jsonArray = new JSONArray(content);

        //  Loop through each record
        for (int i = 0; i < jsonArray.length(); i++) {

            JSONObject obj = jsonArray.getJSONObject(i);

            int age = obj.getInt("age");

            //  Filter condition
            if (age > 25) {
                System.out.println(obj.toString());
            }
        }
    }
}
