package annotation.deprecated;

public class LegacyAPI {

    @Deprecated
    void oldFeature() {
        System.out.println("Old feature is deprecated");
    }

    void newFeature() {
        System.out.println("New feature is recommended");
    }
}
