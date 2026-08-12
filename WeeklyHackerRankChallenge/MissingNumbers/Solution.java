package WeeklyHackerRankChallenge.MissingNumbers;

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


    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
    // Write your code here
    HashMap<Integer, Integer> brrMap = new HashMap<>();
    HashMap<Integer, Integer> arrMap = new HashMap<>();

    List<Integer> result = new ArrayList<>();


    for (int num : brr) {
        brrMap.put(num, brrMap.getOrDefault(num, 0) + 1);
    }


    for (int num : arr) {
        arrMap.put(num, arrMap.getOrDefault(num, 0) + 1);
    }

    // Compare counts
    for (int num : brrMap.keySet()) {

        int brrCount = brrMap.get(num);
        int arrCount = arrMap.getOrDefault(num, 0);

        if (brrCount > arrCount) {
            result.add(num);
        }
    }

    Collections.sort(result);

    return result;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.missingNumbers(arr, brr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

