package workshop.smart_city_transport;

import java.time.LocalDateTime;

public class MetroService implements TransportService {

    @Override
    public String getTransportName() {
        return "Metro";
    }

    @Override
    public String getRoute() {
        return "B-C";
    }

    @Override
    public int getTravelCost() {
        return 50;
    }

    @Override
    public LocalDateTime getDepartureTime() {
        return LocalDateTime.of(2026, 2, 2, 8, 30);
    }

    @Override
    public LocalDateTime getArrivalTime() {
        return LocalDateTime.of(2026, 2, 2, 9, 15);
    }
}
