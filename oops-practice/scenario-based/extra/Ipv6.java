package practice.prep;

import java.util.Scanner;

public class Ipv6 {
    public static void validate(String s) {

        String regex = "^[0-9]{4}:[a-zA-Z0-9]{1,4}:[a-zA-Z0-9]{1,4}:[a-zA-Z0-9]{1,4}:[a-zA-Z0-9]{1,4}:[a-zA-Z0-9]{4}:[a-zA-Z0-9]{4}:[a-zA-Z0-9]{4}::[A0-9]{2}:[B0-9]{2}:[C0-9]{2}:[D0-9]{2}:[E0-9]{2}:[F0-9]{2}$";



        if(s.matches(regex)){
            System.out.println("AUTHENTIC DEVICE");
        }
        else{
            System.out.println("REJECTED DEVICE");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        while(n-- > 0){
            String s = sc.nextLine();
            validate(s);
        }
    }
}
