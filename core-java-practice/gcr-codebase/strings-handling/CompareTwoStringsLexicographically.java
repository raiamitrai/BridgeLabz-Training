package stringhandling;

import java.util.Scanner;

public class CompareTwoStringsLexicographically {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int result = 0;
        int minLength = Math.max(str1.length() , str2.length());
        for (int i = 0; i < minLength; i++) {
            if(str1.charAt(i) != str2.charAt(i)){
                result = str1.charAt(1) -str2.charAt(i);
                break;
            }
        }
        if (result == 0){
            result = str1.length() - str2.length();
        }
        if(result > 0){
            System.out.println(str1 + " comes before "+ str2 +" in lexicographical order");
        }
        if(result < 0){
            System.out.println(str2 + " comes before "+ str1 +" in lexicographical order");
        }
    }
}
