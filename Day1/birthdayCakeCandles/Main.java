package Day1.birthdayCakeCandles;

import java.util.*;

public class Main {

    public static int birthdayCakeCandles(List<Integer> candles) {
        int max = candles.get(0);
        int count = 0;

        // Find maximum height
        for (int num : candles) {
            if (num > max) {
                max = num;
            }
        }

        // Count maximum height candles
        for (int num : candles) {
            if (num == max) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> candles = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            candles.add(sc.nextInt());
        }

        int result = birthdayCakeCandles(candles);
        System.out.println(result);

        sc.close();
    }
}