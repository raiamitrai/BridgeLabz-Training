package Day5.quickSort2_sorting;

import java.io.*;
import java.util.*;

public class Solution {

    public static List<Integer> quickSort(List<Integer> arr) {

        if (arr.size() <= 1) {
            return arr;
        }

        int pivot = arr.get(0);

        List<Integer> left = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int num : arr) {
            if (num < pivot)
                left.add(num);
            else if (num == pivot)
                equal.add(num);
            else
                right.add(num);
        }

        left = quickSort(left);
        right = quickSort(right);

        List<Integer> result = new ArrayList<>();
        result.addAll(left);
        result.addAll(equal);
        result.addAll(right);

        // Print current partition
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i != result.size() - 1)
                System.out.print(" ");
        }
        System.out.println();

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        quickSort(arr);

        sc.close();
    }
}
