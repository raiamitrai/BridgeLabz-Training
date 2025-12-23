//Problem:
//Write a Java program to check if a given string is a palindrome (a string that reads the
//same forward and backward).

package stringhandling;

import java.util.Scanner;

public class CheckPelindrome {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        String temp = s;
        String st = "";
        for(int i = s.length()-1 ; i >= 0 ; i--){
            st = st + s.charAt(i);
        }
        if(temp.equals(st)) {
            System.out.println("string is pelindrome");
        }
        else {
            System.out.println("not pelindrome");
        }
    }
}
