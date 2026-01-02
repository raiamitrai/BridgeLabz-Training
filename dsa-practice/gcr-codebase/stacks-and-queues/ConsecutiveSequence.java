//Longest Consecutive Sequence
//Problem: Given an unsorted array, find the length of the longest consecutive elements sequence.
//Hint: Use a hash map to store elements and check for consecutive elements efficiently.

package dsa.hashmap;

import java.util.HashSet;

public class ConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};

        HashSet<Integer> set = new HashSet<>();
        for (int i : arr){
            set.add(i);
        }
        int longest = 0;

        for(int i : arr){
            if(!set.contains(i-1)){
                int current = i;
                int count = 1;

                while (set.contains(current+1)){
                    current++;
                    count++;
                }

                if(count > longest){
                    longest=count;
                }
            }
        }
        System.out.println(longest);

    }
}
