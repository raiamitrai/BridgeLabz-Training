package dsa.hashmap;
import  java.util.*;
public class CheckPairSum {

    public static void main(String[] args) {


        int[] arr = {2, 7, 11, 15};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();
        boolean pairFound = false;

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int needed = target - current;

            if(map.containsKey(needed)){
                System.out.println(
                        "Pair Found: " + needed + " + " + current +
                                " (indices: " + map.get(needed) + ", " + i + ")"
                );
                pairFound = true;
                break;
            }
            map.put(current, i);
        }

        if (!pairFound) {
            System.out.println("No Pair Found");
        }

    }

}

