package reviews.biggerIsGreater;

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

    

    public static String biggerIsGreater(String w) {
    // Write your code here

    char[] arr = w.toCharArray();

    //pivot
    int i = arr.length-2;

    while(i >= 0 && arr[i] >= arr[i+1]){
        i--;
    }
    if(i < 0){
        return "no answer";
    }


    // grater than pivot
    int j = arr.length-1;
    while(arr[j] <= arr[i]){
        j--;
    }


    // swaping
    char temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;

    // reverse
    int lef = i+1;
    int ri =arr.length-1;
    while(lef < ri){
        temp = arr[lef];
        arr[lef] = arr[ri];
        arr[ri] = temp;

        lef++;
        ri--;
    }
    return new String(arr);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, T).forEach(TItr -> {
            try {
                String w = bufferedReader.readLine();

                String result = Result.biggerIsGreater(w);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}

