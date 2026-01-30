package dsa.scenario.aero_vigil;

public class FlightUtil implements UserInterface {

    public boolean validateFlightNumber(String flightNumber) throws InvalidFlightException{

        String regax = "FL-[1-9][0-9]{3}";

        if(!flightNumber.matches(regax)){
            throw new InvalidFlightException("The flight number " + flightNumber + " is invalid");
        }
        return true;
    }

    public boolean validateFlightName(String flightName) throws InvalidFlightException{
        if(!flightName.equalsIgnoreCase("SpiceJet") && !flightName.equalsIgnoreCase("vistara") && !flightName.equalsIgnoreCase("IndiGo") && !flightName.equalsIgnoreCase("Air Arabia")){
            throw new InvalidFlightException("The flight name "+flightName+" is invalid");
        }
        return true;
    }

    public boolean validatePassengerCount(int passengerCount, String flightName) throws InvalidFlightException{

        if(flightName.equalsIgnoreCase("SpiceJet")  && (passengerCount <= 0 || passengerCount > 396)){
            throw new InvalidFlightException("The passenger count "+passengerCount+" is invalid for "+flightName);
        }
        if(flightName.equalsIgnoreCase("Vistara")  && (passengerCount <= 0 || passengerCount > 615)){
            throw new InvalidFlightException("The passenger count "+passengerCount+" is invalid for "+flightName);
        }
        if(flightName.equalsIgnoreCase("IndiGo")  && (passengerCount <= 0 || passengerCount > 230)){
            throw new InvalidFlightException("The passenger count "+passengerCount+" is invalid for "+flightName);
        }
        if(flightName.equalsIgnoreCase("Air Arabia")  && (passengerCount <= 0 || passengerCount > 130)){
            throw new InvalidFlightException("The passenger count "+passengerCount+" is invalid for "+flightName);
        }
        return true;
    }

    public double calculateFuelToFillTank(String flightName, double currentFuelLevel) throws InvalidFlightException {
        if (flightName.equalsIgnoreCase("SpiceJet")) {
            if (currentFuelLevel < 0 || currentFuelLevel > 200000) {
                throw new InvalidFlightException("Invalid fuel level for " + flightName);
            }
            return 200000 - currentFuelLevel;
        }
        if (flightName.equalsIgnoreCase("Vistara")) {
            if (currentFuelLevel < 0 || currentFuelLevel > 300000) {
                throw new InvalidFlightException("Invalid fuel level for " + flightName);
            }
            return 300000 - currentFuelLevel;
        }
        if (flightName.equalsIgnoreCase("IndiGo")) {
            if (currentFuelLevel < 0 || currentFuelLevel > 250000) {
                throw new InvalidFlightException("Invalid fuel level for " + flightName);
            }
            return 250000 - currentFuelLevel;
        }
        if (flightName.equalsIgnoreCase("Air Arabia")) {
            if (currentFuelLevel < 0 || currentFuelLevel > 150000) {
                throw new InvalidFlightException("Invalid fuel level for " + flightName);
            }
            return 150000 - currentFuelLevel;
        }
        throw new InvalidFlightException("Invalid fuel level for " + flightName);
    }

}
