package workshop.smart_city_transport;

import java.time.LocalDateTime;

public interface TransportService {

    String getTransportName();
    String getRoute();
    int getTravelCost();
    LocalDateTime getDepartureTime();
    LocalDateTime getArrivalTime();

    default void printServiceDetails() {
        System.out.println(
                "Transport: " + getTransportName() +
                        " | Route: " + getRoute() +
                        " | Cost: ₹" + getTravelCost()
        );
    }
}
