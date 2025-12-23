package stringhandling;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();

        HashMap<Character, Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch ,0)+1);
        }
        char res = '\\';
        int count =0;
        for(Map.Entry<Character , Integer> i :freq.entrySet()){
            if(i.getValue() > count){
                count = i.getValue();
                res = i.getKey();
            }
        }
        System.out.println(res);
    }
}
