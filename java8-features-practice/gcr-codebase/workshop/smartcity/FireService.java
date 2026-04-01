package workshop.smart_city_transport;

import java.time.LocalDateTime;

public class FireService
        implements TransportService, EmergencyService {

    @Override
    public String getTransportName() {
        return "Fire Service";
    }

    @Override
    public String getRoute() {
        return "Fire Emergency Route";
    }

    @Override
    public int getTravelCost() {
        return 0;
    }

    @Override
    public LocalDateTime getDepartureTime() {
        return LocalDateTime.now();
    }

    @Override
    public LocalDateTime getArrivalTime() {
        return LocalDateTime.now().plusMinutes(20);
    }
}
