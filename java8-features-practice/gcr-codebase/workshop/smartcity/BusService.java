package workshop.smart_city_transport;

import java.time.LocalDateTime;

public class BusService implements TransportService {

    @Override
    public String getTransportName() {
        return "City Bus";
    }

    @Override
    public String getRoute() {
        return "A-B";
    }

    @Override
    public int getTravelCost() {
        return 30;
    }

    @Override
    public LocalDateTime getDepartureTime() {
        return LocalDateTime.of(2026, 2, 2, 9, 0);
    }

    @Override
    public LocalDateTime getArrivalTime() {
        return LocalDateTime.of(2026, 2, 2, 10, 30);
    }
}
