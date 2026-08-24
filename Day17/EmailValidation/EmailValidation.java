package Day17.EmailValidation;

public class EmailValidation {

    public static boolean isValidEmail(String email) {
        return email.matches(
            "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$"
        );
    }

    public static void main(String[] args) {

        String[] emails = {
            "amit@gmail.com",
            "john.doe@yahoo.com",
            "user123@outlook.com",
            "amitgmail.com",
            "amit@gmail",
            "amit@gmail."
        };

        for (String email : emails) {
            System.out.println(email + " -> " + isValidEmail(email));
        }
    }
}
