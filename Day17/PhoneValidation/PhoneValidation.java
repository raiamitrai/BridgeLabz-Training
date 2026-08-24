package Day17.PhoneValidation;

import java.util.Scanner;

public class PhoneValidation {

    public static boolean isValidPhone(String phone) {
        return phone.matches(
            "^(\\+\\d{1,3}[-.]?)?\\(?\\d{3}\\)?[- .]?\\d{3}[- .]?\\d{4}$"
        );
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();

        System.out.println(isValidPhone(phone));

    }
}