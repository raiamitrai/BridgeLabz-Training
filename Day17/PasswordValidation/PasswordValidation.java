package Day17.PasswordValidation;

import java.util.Scanner;

public class PasswordValidation {

    public static boolean isValidPassword(String password) {
        return password.matches(
            "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$"
        );
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        System.out.println(isValidPassword(password));

        sc.close();
    }
}
