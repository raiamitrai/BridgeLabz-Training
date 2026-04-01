package createjsonobject;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonObject {
    public static void main(String[] args) {

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("name", "Alice");
        jsonObject.put("age", 25);

        // subjects array
        JSONArray subjects = new JSONArray();
        subjects.put("Mathematics");
        subjects.put("Computer Science");
        subjects.put("Physics");

        jsonObject.put("subjects", subjects);

        System.out.println(jsonObject.toString());
    }
}

