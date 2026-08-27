package CapgeminiScenarioBasedProblem.LexicalTwist;

import java.util.*;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first word");
        String first = sc.nextLine();

        // Validate first word
        if (first.trim().contains(" ")) {
            System.out.println(first + " is an invalid word");
            return;
        }

        System.out.println("Enter the second word");
        String second = sc.nextLine();

        // Validate second word
        if (second.trim().contains(" ")) {
            System.out.println(second + " is an invalid word");
            return;
        }

        // Reverse first word
        String reversed = new StringBuilder(first)
                .reverse()
                .toString();

        // Check if second is reverse of first
        if (second.equalsIgnoreCase(reversed)) {

            // Convert reversed word to lowercase
            reversed = reversed.toLowerCase();

            // Replace vowels with @
            String result = reversed.replaceAll("[aeiou]", "@");

            System.out.println(result);

        } else {

            // Combine both words and convert to uppercase
            String combined = (first + second).toUpperCase();

            int vowels = 0;
            int consonants = 0;

            // Count vowels and consonants
            for (char ch : combined.toCharArray()) {

                if (ch >= 'A' && ch <= 'Z') {

                    if (ch == 'A' || ch == 'E' ||
                        ch == 'I' || ch == 'O' ||
                        ch == 'U') {

                        vowels++;

                    } else {
                        consonants++;
                    }
                }
            }

            // More vowels
            if (vowels > consonants) {

                String result = "";
                Set<Character> set = new LinkedHashSet<>();

                for (char ch : combined.toCharArray()) {

                    if (ch == 'A' || ch == 'E' ||
                        ch == 'I' || ch == 'O' ||
                        ch == 'U') {

                        set.add(ch);
                    }
                }

                for (char ch : set) {
                    result += ch;

                    if (result.length() == 2) {
                        break;
                    }
                }

                System.out.println(result);

            }

            // More consonants
            else if (consonants > vowels) {

                String result = "";
                Set<Character> set = new LinkedHashSet<>();

                for (char ch : combined.toCharArray()) {

                    if (ch >= 'A' && ch <= 'Z' &&
                        ch != 'A' && ch != 'E' &&
                        ch != 'I' && ch != 'O' &&
                        ch != 'U') {

                        set.add(ch);
                    }
                }

                for (char ch : set) {
                    result += ch;

                    if (result.length() == 2) {
                        break;
                    }
                }

                System.out.println(result);

            }

            // Equal
            else {
                System.out.println(
                    "Vowels and consonants are equal"
                );
            }
        }

        
    }
}