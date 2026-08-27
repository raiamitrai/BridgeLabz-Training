package CapgeminiScenarioBasedProblem.AeroVigil;

import java.util.Scanner;

public interface UserInterface {

    public static void main(String[] amit){
        Scanner sc =new Scanner(System.in);
        FlightUtil flightUtil = new FlightUtil();

        System.out.println("Enter Flight Details");

        String input = sc.nextLine();


        try{
            String[] parts = input.split(":");

            String flightNumber = parts[0];

            String flightName = parts[1];

            int passengerCount = Integer.parseInt(parts[2]);

            double correntFuelLevel = Double.parseDouble(parts[3]);

            flightUtil.validateFlightNumber(flightNumber);

            flightUtil.validateFlightName(flightName);

            flightUtil.validatePassengerCount(passengerCount, flightName);

            double fuelReq = flightUtil.calculateFuelToFillTank(flightName, correntFuelLevel);

            System.out.println("Fuel required to fill this tank : " + fuelReq);

        }

        catch (InvalidFlightException e) {
            System.out.println(e.getMessage());
        }
        catch(Exception e){
                System.out.println("Invalid Input");
        }
    }
}
