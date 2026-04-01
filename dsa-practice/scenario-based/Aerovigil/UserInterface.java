package dsa.scenario.aero_vigil;

public interface UserInterface {

    boolean validateFlightNumber(String flightNumber)throws InvalidFlightException;

    boolean validateFlightName(String flightName) throws InvalidFlightException;

    boolean validatePassengerCount(int passengerCount, String flightName)throws InvalidFlightException;

    double calculateFuelToFillTank(String flightName, double currentFuelLevel)throws InvalidFlightException;
}
