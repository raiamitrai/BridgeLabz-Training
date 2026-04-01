package car;

import org.json.JSONObject;

public class CarToJson {
    public static void main(String[] args) {

        Car car = new Car("Toyota", "Fortuner", 2022);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("brand", car.getBrand());
        jsonObject.put("model", car.getModel());
        jsonObject.put("year", car.getYear());

        System.out.println(jsonObject.toString());
    }
}

