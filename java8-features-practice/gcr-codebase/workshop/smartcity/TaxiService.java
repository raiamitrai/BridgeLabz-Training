package workshop.smart_city_transport;

import java.time.LocalDateTime;

public class TaxiService implements TransportService {

    @Override
    public String getTransportName() {
        return "Taxi";
    }

    @Override
    public String getRoute() {
        return "A-C";
    }

    @Override
    public int getTravelCost() {
        return 120;
    }

    @Override
    public LocalDateTime getDepartureTime() {
        return LocalDateTime.of(2026, 2, 2, 7, 45);
    }

    @Override
    public LocalDateTime getArrivalTime() {
        return LocalDateTime.of(2026, 2, 2, 8, 30);
    }
}
