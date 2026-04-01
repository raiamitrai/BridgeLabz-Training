package lexicaltwist.replacevowelwithSymbool;

public class Main {
    public static void main(String[] args) {

        String word1 = "Hello";
        String word2 = "olleH";

        String reversed = new StringBuilder(word1).reverse().toString();


        if (reversed.equalsIgnoreCase(word2)) {

            String lowerCaseWord = reversed.toLowerCase();

            String transformedWord = lowerCaseWord.replaceAll("[aeiou]", "@");

            System.out.println("Transformed Word: " + transformedWord);

        } else {
            System.out.println("Second word is NOT the reverse of the first word");
        }
    }
}

