//1. Count Vowels and Consonants
//Problem:
//Write a Java program to count the number of vowels and consonants in a given string.


package stringhandling;

import java.util.*;


public class CountVowelAndConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase().replace(" " , "");
        int countVowel = 0;
        int countConsonent = 0;
        for (int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                    countVowel++;
                }
                else {
                    countConsonent++;
                }
            }
        }
        System.out.printf("vowel : "+ countVowel + "and Consonent : " + countConsonent);
    }
}
