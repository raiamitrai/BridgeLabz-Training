package Day11.StringCompression;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String msg = sc.next();

        StringBuilder result = new StringBuilder();

        int count = 1;

        for (int i = 0; i < msg.length(); i++) {

            if (i < msg.length() - 1 && msg.charAt(i) == msg.charAt(i + 1)) {
                count++;
            } else {

                result.append(msg.charAt(i));

                if (count > 1) {
                    result.append(count);
                }
                count = 1;
            }
        }
        System.out.println(result);

    }
}
