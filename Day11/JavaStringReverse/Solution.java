package Day11.JavaStringReverse;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        char[] arr = A.toCharArray();
        int l = arr.length-1;
        int s = 0;

        while(s < l){
            if(arr[s] != arr[l]){
                System.out.println("No");
                return;
            }
            s++;
            l--;
        }

        System.out.println("Yes");
    }
}



