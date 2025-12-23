// Problem:
//Write a Java program to remove all duplicate characters from a given string and return
//the modified string.

package stringhandling;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch ,0)+1);
        }
        String result = "";

        for(Map.Entry<Character , Integer> i :freq.entrySet()){
            if(i.getValue() < 2){
                result = result + i.getKey();
            }
        }
        System.out.print("remove duplicate = " + result);



    }

}
