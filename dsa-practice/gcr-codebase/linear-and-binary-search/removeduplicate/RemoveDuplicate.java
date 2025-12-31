package dsa.linearandbinarysearch.removeduplicate;

import java.util.HashSet;

public class RemoveDuplicate {

    public static void main(String[] args) {

        String input = "programming";

        // Step 1: Empty StringBuilder
        StringBuilder sb = new StringBuilder();

        // Step 2: HashSet to track characters
        HashSet<Character> set = new HashSet<>();

        // Step 3: Traverse string character by character
        for (char ch : input.toCharArray()) {

            // Step 4: Check duplicate
            if (!set.contains(ch)) {
                sb.append(ch);   // add to result
                set.add(ch);     // mark as seen
            }
        }

        // Step 5: Convert StringBuilder to String
        String result = sb.toString();

        System.out.println("String without duplicates: " + result);
    }
}

