package Day9.MarkAndToys;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    public static int maximumToys(List<Integer> prices, int k) {
    // Write your code here
        int[] arr = new int[prices.size()];

        int index = 0;

        for (Integer i : prices) {
            arr[index] = i;
            index++;
        }

        int c = 0;
        int sum = 0;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {

            if (sum + arr[i] <= k) {
                sum = sum + arr[i];
                c++;
            } else {
                break;
            }
        }

        return c;
            
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> prices = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.maximumToys(prices, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

