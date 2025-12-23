package stringhandling;

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String toggleStr ="";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 'A' && str.charAt(i) <='Z'){
                toggleStr=toggleStr+Character.toLowerCase(str.charAt(i));
            }
            if(str.charAt(i) >= 'a' && str.charAt(i) <='z'){
                toggleStr=toggleStr+Character.toUpperCase(str.charAt(i));
            }
        }
        System.out.println(toggleStr);
    }
}
