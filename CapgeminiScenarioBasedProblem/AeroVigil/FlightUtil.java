package CapgeminiScenarioBasedProblem.AeroVigil;

public class FlightUtil {

    public boolean validateFlightNumber(String flightNumber) throws InvalidFlightException {

        if(flightNumber == null || !flightNumber.matches("FL-\\d{4}")){
            throw new InvalidFlightException("the flight number " + flightNumber + " is invalid");
        }
        return true;
    }


    public boolean validateFlightName(String flightName) throws InvalidFlightException {
        if(flightName == null || !(  flightName.equalsIgnoreCase("SpiceJet") || flightName.equalsIgnoreCase("Vistara") || flightName.equalsIgnoreCase("IndiGo")  || flightName.equalsIgnoreCase("Air Arabia")  )  ){
            throw new InvalidFlightException("the flight name " + flightName + " is invalid");
        }
        return true;
    }

    public boolean validatePassengerCount(int passengerCount, String flightName) throws InvalidFlightException {
        int maxCapacity = 0;

        if(flightName.equalsIgnoreCase("SpiceJet")){
            maxCapacity = 369;
        }

        else if (flightName.equalsIgnoreCase("Vistara")) {
            maxCapacity = 615;
        }

         else if (flightName.equalsIgnoreCase("IndiGo")) {
            maxCapacity = 230;
        }

          else if (flightName.equalsIgnoreCase("Air Arabia")) {
            maxCapacity = 130;
        }
          if(passengerCount <= 0 || passengerCount > maxCapacity){
              throw  new InvalidFlightException("the passenger count " + passengerCount + " invalid for " + flightName);
          }
          return true;
    }

    public double calculateFuelToFillTank(String flightName, double currentFuelLevel) throws InvalidFlightException {
        double maxFuelCapacity = 0;


         if(flightName.equalsIgnoreCase("SpiceJet")){
            maxFuelCapacity = 200000;
        }

        else if (flightName.equalsIgnoreCase("Vistara")) {
            maxFuelCapacity = 300000;
        }

         else if (flightName.equalsIgnoreCase("IndiGo")) {
            maxFuelCapacity = 250000;
        }

          else if (flightName.equalsIgnoreCase("Air Arabia")) {
            maxFuelCapacity = 150000;
        }

          if(currentFuelLevel < 0  ||currentFuelLevel > maxFuelCapacity){
              throw new InvalidFlightException("Invalid fuel level for " + flightName);
          }
          return currentFuelLevel;
    }


}
