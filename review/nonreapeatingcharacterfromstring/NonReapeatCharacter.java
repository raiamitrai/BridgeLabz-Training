package review.nonreapeatingcharacterfromstring;

public class NonReapeatCharacter{
    public static char firstNonRepeatingCharacter(String str) {
        int[] charCount = new int[256]; 

        
        for (char c : str.toCharArray()) {
            charCount[c]++;
        }

        
        for (char c : str.toCharArray()) {
            if (charCount[c] == 1) {
                return c;
            }
        }
        return '0'; 
    }

    public static void main(String[] args) {
        String input = "swiss";
        char result = firstNonRepeatingCharacter(input);
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("All characters are repeating.");
        }
    }
}
