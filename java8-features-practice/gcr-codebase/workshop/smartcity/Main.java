package workshop.smart_city_transport;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<TransportService> services = new ArrayList<>();

        services.add(new BusService());
        services.add(new MetroService());
        services.add(new TaxiService());
        services.add(new AmbulanceService());
        services.add(new FireService());


        System.out.println(" All Transport Services (Dashboard):");
        services.forEach(TransportService::printServiceDetails);


        // Filter
        services.stream()
                .filter(s -> s.getTravelCost() <= 50)
                .forEach(TransportService::printServiceDetails);

        // Sort
        services.stream()
                .sorted(Comparator.comparing(TransportService::getDepartureTime))
                .forEach(TransportService::printServiceDetails);

        //emergency
        System.out.println("\n Emergency Priority Services:");

        services.stream()
                .filter(s -> s instanceof EmergencyService)
                .forEach(s ->
                        System.out.println(s.getTransportName() + " gets priority"));

        // travel cast calculate
        TravelCostCalculator calculator = (baseFare, isPeak) -> {
            if (isPeak) {
                return baseFare + (baseFare * 20 / 100); // 20% extra
            }
            return baseFare;
        };

        System.out.println("\n Final Fare (Peak / Non-Peak):");

        services.forEach(service -> {
            boolean peak = isPeak(service.getDepartureTime());
            int finalFare = calculator.calculate(
                    service.getTravelCost(), peak);

            System.out.println(
                    service.getTransportName() +
                            " | Final Fare: ₹" + finalFare
            );
        });
c


    }
}
