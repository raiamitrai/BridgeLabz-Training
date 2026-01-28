package lexicaltwist.combine;

public class Main {
    public static void main(String[] args) {

        String word1 = "Hello";
        String word2 = "World";

        // Reverse first word
        String reversed = new StringBuilder(word1).reverse().toString();

        // Check if second word is reverse of first
        if (reversed.equalsIgnoreCase(word2)) {

            // Case 1: Reversed match
            String lower = reversed.toLowerCase();
            String transformed = lower.replaceAll("[aeiou]", "@");
            System.out.println("Transformed Word: " + transformed);

        } else {

            // Step 1: Combine words
            String combined = word1 + word2;

            // Step 2: Convert to uppercase
            String upper = combined.toUpperCase();

            int vowelCount = 0;
            int consonantCount = 0;

            // Step 3: Count vowels & consonants
            for (char ch : upper.toCharArray()) {
                if (ch >= 'A' && ch <= 'Z') {
                    if ("AEIOU".indexOf(ch) != -1) {
                        vowelCount++;
                    } else {
                        consonantCount++;
                    }
                }
            }

            // Step 4: Decision based on counts
            if (vowelCount > consonantCount) {
                printFirstTwoUnique(upper, true);
            }
            else if (consonantCount > vowelCount) {
                printFirstTwoUnique(upper, false);
            }
            else {
                System.out.println("Vowels and consonants are equal");
            }
        }
    }

    // Helper method
    static void printFirstTwoUnique(String word, boolean vowels) {
        String printed = "";

        for (char ch : word.toCharArray()) {
            boolean isVowel = "AEIOU".indexOf(ch) != -1;

            if (vowels && isVowel || !vowels && !isVowel && ch >= 'A' && ch <= 'Z') {
                if (printed.indexOf(ch) == -1) {
                    System.out.print(ch);
                    printed += ch;
                }
            }

            if (printed.length() == 2) break;
        }
    }
}

