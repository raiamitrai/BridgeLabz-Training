package workshop.smart_city_transport;

@FunctionalInterface
public interface TravelCostCalculator {
    int calculate(int baseFare, boolean isPeakTime);

}
