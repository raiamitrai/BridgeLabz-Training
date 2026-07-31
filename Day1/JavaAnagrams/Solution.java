package Day1.JavaAnagrams;

import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b) {

         if (a.length() != b.length()) {
            return false;
        }

        char[] ch1 = a.toLowerCase().toCharArray();
        char[] ch2 = b.toLowerCase().toCharArray();

        java.util.Arrays.sort(ch1);
        java.util.Arrays.sort(ch2);

        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] != ch2[i]) {
                return false;
            }
        }

        return true;
    }

  public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

