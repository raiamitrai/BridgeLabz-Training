package WeeklyHackerRankChallenge.SherlockAndAnagrams;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

class Result {



    public static int sherlockAndAnagrams(String s) {

    HashMap<String, Integer> map = new HashMap<>();
    int count = 0;

    for (int i = 0; i < s.length(); i++) {

        for (int j = i + 1; j <= s.length(); j++) {

            String sub = s.substring(i, j);

            char[] arr = sub.toCharArray();
            Arrays.sort(arr);

            String key = new String(arr);

            if (map.containsKey(key)) {
                count += map.get(key);
            }

            map.put(key, map.getOrDefault(key, 0) + 1);
        }
    }

    return count;
}

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = Result.sherlockAndAnagrams(s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}

