package Day7.Recursion3_fectorial;

import java.util.*;

public class Main {

    public static int factorial(int n) {

        if (n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = factorial(n);

        System.out.println(result);

        sc.close();
    }
}