package WeeklyHackerRankChallenge.FraudulentActivityNotifications;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static int activityNotifications(List<Integer> expenditure, int d) {
    // Write your code here

     int notifications = 0;

    // 0 to 200 expenditure frequency
    int[] count = new int[201];

    // First d days
    for (int i = 0; i < d; i++) {
        count[expenditure.get(i)]++;
    }

    // Remaining days
    for (int i = d; i < expenditure.size(); i++) {

        // Median find
        double median = 0;
        int total = 0;

        if (d % 2 == 1) {

            // Odd d
            int middle = d / 2 + 1;

            for (int j = 0; j <= 200; j++) {
                total += count[j];

                if (total >= middle) {
                    median = j;
                    break;
                }
            }

        } else {

            // Even d
            int first = d / 2;
            int second = first + 1;

            int firstValue = 0;
            int secondValue = 0;

            for (int j = 0; j <= 200; j++) {

                total += count[j];

                if (total >= first && firstValue == 0) {
                    firstValue = j;
                }

                if (total >= second) {
                    secondValue = j;
                    break;
                }
            }

            median = (firstValue + secondValue) / 2.0;
        }

        // Notification check
        if (expenditure.get(i) >= 2 * median) {
            notifications++;
        }

        // Old value remove
        count[expenditure.get(i - d)]--;

        // New value add
        count[expenditure.get(i)]++;
    }

    return notifications;


    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> expenditure = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.activityNotifications(expenditure, d);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

