package annotation.deprecated;

public class Main {
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();

        api.oldFeature();   // ⚠ Warning (deprecated)
        api.newFeature();   //  Preferred
    }
}

