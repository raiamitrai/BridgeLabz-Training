package Day16.JavaStaticInitializerBlock;

import java.io.*;
import java.util.*;

public class Solution {


     static int B;
    static int H;

    static {
        Scanner sc = new Scanner(System.in);

        B = sc.nextInt();
        H = sc.nextInt();

        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


        if (B > 0 && H > 0) {
            System.out.println(B * H);
        }
    }
}
