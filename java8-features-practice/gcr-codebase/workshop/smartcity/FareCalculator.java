package practice.interfacevsabstract.smartcity;

@FunctionalInterface
public interface FareCalculator {
    double calculateFare(double distance, int passengerCount, boolean isPeakHour);
    

    static double getBaseFare(String serviceType) {
        return switch (serviceType) {
            case "Bus" -> 2.0;
            case "Metro" -> 3.0;
            case "Taxi" -> 5.0;
            case "EV_Charging" -> 0.0;
            default -> 1.0;
        };
    }
}
