package Day1.plusMinus;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        plusMinus(arr);
    }

    public static void plusMinus(List<Integer> arr) {
        int n = arr.size();
        int plus = 0, minus = 0, zero = 0;

        for (int num : arr) {
            if (num > 0)
                plus++;
            else if (num < 0)
                minus++;
            else
                zero++;
        }

        System.out.printf("%.6f%n", (double) plus / n);
        System.out.printf("%.6f%n", (double) minus / n);
        System.out.printf("%.6f%n", (double) zero / n);
    }
}
