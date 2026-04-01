//Find the Longest Word in a Sentence
//Problem:
//Write a Java program that takes a sentence as input and returns the longest word in the
//sentence.
package stringhandling;

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String s = sc.nextLine();

        int alphabetCount =0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' '){
                alphabetCount++;
            }
            else{
                if(alphabetCount >count) {
                    count = alphabetCount;
                    alphabetCount = 0;
                }
            }
        }
        System.out.print(count);
    }
}
