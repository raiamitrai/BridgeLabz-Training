//2. Reverse a String
//Problem:
//Write a Java program to reverse a given string without using any built-in reverse
//functions.

package stringhandling;

import java.util.*;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        String st = "";
        for(int i = s.length()-1 ; i >= 0 ; i--){
            st = st + s.charAt(i);
        }
        System.out.println(st);
    }
}
