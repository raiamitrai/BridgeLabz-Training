package dsa.scenario.factory_Robot_hazard_analyzer;

import java.util.Scanner;

public class RobotHazardAuditor {

    public static double machineRiskFactor(String machineryState) {
        if (machineryState.equals("Worn")) {
            return 1.3;
        } else if (machineryState.equals("Faulty")) {
            return 2.0;
        } else if (machineryState.equals("Critical")) {
            return 3.0;
        }
        return 0;
    }



    public static double  CalculateHazardRisk(double armPrecision, int workerDensity, String machineryState) throws RobotSafetyException{

        if(!(armPrecision >= 0.0 && armPrecision <= 1.0)) {
            throw new RobotSafetyException("Error: Arm precision must be 0.0-1.0");
        }
        if(!(workerDensity >= 1 && workerDensity <= 20)){
            throw new RobotSafetyException("Error: Worker density must be 1-20");
        }
        if(!(machineryState.equals("Worn") || (machineryState.equals("Faulty")) || (machineryState.equals("Critical")))){
            throw new RobotSafetyException("Error: Unsupported machinery state");
        }




        double hazardRisk = ((1.0 - armPrecision) * 15.0)
                + (workerDensity * RobotHazardAuditor.machineRiskFactor(machineryState));

        System.out.println(hazardRisk);
        return hazardRisk;
    }
    public static void main(String[] args) throws RobotSafetyException{
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter arm Precision( 0.0 to 1.0) : ");
            double armPrecision = sc.nextDouble();
            System.out.println("enter Worker Dencity (1 to 20) : ");
            int workerDensity = sc.nextInt();
            System.out.println("Enter machinery State : ");
            String machineryState = sc.next();

            CalculateHazardRisk(armPrecision, workerDensity, machineryState);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

 }

