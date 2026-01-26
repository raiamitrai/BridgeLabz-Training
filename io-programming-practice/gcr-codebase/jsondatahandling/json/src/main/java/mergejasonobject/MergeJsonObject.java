// Merge two JSON objects into one.
package mergejasonobject;

import org.json.JSONObject;

public class MergeJsonObject {
    public static void main(String[] args) {

        // First JSON object
        JSONObject json1 = new JSONObject();
        json1.put("name", "Alice");
        json1.put("age", 25);

        // Second JSON object
        JSONObject json2 = new JSONObject();
        json2.put("email", "alice@example.com");
        json2.put("city", "Delhi");

        // merge JSON2 Into JSON1
        for(String key : json2.keySet()){
            json1.put(key,json2.get(key));
        }

        //Final merge JSON
        System.out.println(json1.toString());
    }
}
