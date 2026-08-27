package CapgeminiScenarioBasedProblem.StreamBuzz;

import java.util.*;

class CreatorStats {

    private String CreatorName;
    private double[] WeeklyLikes;

    public CreatorStats() {
    }

    public CreatorStats(String CreatorName, double[] WeeklyLikes) {
        this.CreatorName = CreatorName;
        this.WeeklyLikes = WeeklyLikes;
    }

    public String getCreatorName() {
        return CreatorName;
    }

    public void setCreatorName(String CreatorName) {
        this.CreatorName = CreatorName;
    }

    public double[] getWeeklyLikes() {
        return WeeklyLikes;
    }

    public void setWeeklyLikes(double[] WeeklyLikes) {
        this.WeeklyLikes = WeeklyLikes;
    }

    public static List<CreatorStats> EngagementBoard =
            new ArrayList<>();
}


public class Program {

    public void RegisterCreator(CreatorStats record) {
        CreatorStats.EngagementBoard.add(record);
    }


    public Map<String, Integer> GetTopPostCounts(
            List<CreatorStats> records,
            double likeThreshold) {

        Map<String, Integer> result = new LinkedHashMap<>();

        for (CreatorStats creator : records) {

            int count = 0;

            for (double likes : creator.getWeeklyLikes()) {

                if (likes >= likeThreshold) {
                    count++;
                }
            }

            if (count > 0) {
                result.put(creator.getCreatorName(), count);
            }
        }

        return result;
    }


    public double CalculateAverageLikes() {

        double sum = 0;
        int count = 0;

        for (CreatorStats creator :
                CreatorStats.EngagementBoard) {

            for (double likes :
                    creator.getWeeklyLikes()) {

                sum += likes;
                count++;
            }
        }

        if (count == 0) {
            return 0;
        }

        return sum / count;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Program program = new Program();

        while (true) {

            System.out.println("1. Register Creator");
            System.out.println("2. Show Top Posts");
            System.out.println("3. Calculate Average Likes");
            System.out.println("4. Exit");

            System.out.println("Enter your choice:");

            int choice = sc.nextInt();
            sc.nextLine();

            // Register Creator
            if (choice == 1) {

                System.out.println("Enter Creator Name:");
                String name = sc.nextLine();

                double[] likes = new double[4];

                System.out.println(
                        "Enter weekly likes (Week 1 to 4):");

                for (int i = 0; i < 4; i++) {
                    likes[i] = sc.nextDouble();
                }

                sc.nextLine();

                CreatorStats creator =
                        new CreatorStats(name, likes);

                program.RegisterCreator(creator);

                System.out.println(
                        "Creator registered successfully");
            }

            // Show Top Posts
            else if (choice == 2) {

                System.out.println("Enter like threshold:");

                double threshold = sc.nextDouble();
                sc.nextLine();

                Map<String, Integer> result =
                        program.GetTopPostCounts(
                                CreatorStats.EngagementBoard,
                                threshold);

                if (result.isEmpty()) {

                    System.out.println(
                            "No top-performing posts this week");

                } else {

                    for (Map.Entry<String, Integer> entry :
                            result.entrySet()) {

                        System.out.println(
                                entry.getKey() +
                                " - " +
                                entry.getValue());
                    }
                }
            }

            // Calculate Average
            else if (choice == 3) {

                double average =
                        program.CalculateAverageLikes();

                System.out.println(
                        "Overall average weekly likes: " +
                        average);
            }

            // Exit
            else if (choice == 4) {

                System.out.println(
                        "Logging off - Keep Creating with StreamBuzz!");

                return;
            }
        }
    }
}
