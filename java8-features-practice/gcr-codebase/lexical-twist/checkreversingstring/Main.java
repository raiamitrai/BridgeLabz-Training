package lexicaltwist.checkreversingstring;

public class Main {
    public static void main(String[] args) {

        String word1 = "Hello";
        String word2 = "olleH";

        String reversedWord1 = new StringBuilder(word1).reverse().toString();

        if (reversedWord1.equalsIgnoreCase(word2)) {
            System.out.println("Second word is the reverse of the first word");
        } else {
            System.out.println("Second word is NOT the reverse of the first word");
        }
    }
}

