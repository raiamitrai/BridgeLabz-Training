package scenariobased.collection.ocean_fleet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of vessels to be added");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        List<Vessel> list = new ArrayList<>();
        VesselUtil util = new VesselUtil(list);

        System.out.println("Enter vessel details");
        for (int i = 0; i < n; i++) {
            String[] data = sc.nextLine().split(":");

            Vessel v = new Vessel(
                    data[0],
                    data[1],
                    Double.parseDouble(data[2]),
                    data[3]
            );

            util.addVesselPerformance(v);
        }

        System.out.println("Enter the Vessel Id to check speed");
        String id = sc.nextLine();

        Vessel vessel = util.getVesselById(id);

        if (vessel != null) {
            System.out.println(
                    vessel.getVesselId() + " | " +
                            vessel.getVesselName() + " | " +
                            vessel.getVesselType() + " | " +
                            vessel.getAverageSpeed() + " knots"
            );
        } else {
            System.out.println("Vessel Id " + id + " not found");
        }

        System.out.println("High performance vessels are");
        for (Vessel v : util.getHighPerformanceVessels()) {
            System.out.println(
                    v.getVesselId() + " | " +
                            v.getVesselName() + " | " +
                            v.getVesselType() + " | " +
                            v.getAverageSpeed() + " knots"
            );
        }

        sc.close();
    }
}