package stringhandling;

import java.util.Scanner;

public class RemoveSpecificCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.next().charAt(0);

           s = s.replace(ch,' ' );
           s = s.replace(" ","");

        System.out.println(s);
    }
}
