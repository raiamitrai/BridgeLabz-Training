package OOPs.classandobject.handlebookdetails;

public class Main {
    public static void main(String[] args) {
        HandleBooks books1 = new HandleBooks("2States", "Chetan Bhagat", 500);
        HandleBooks books2 = new HandleBooks("Wings Of Fire","Abdul kalam.A.P.J",  500);

        books1.displayDetails();
        books2.displayDetails();

    }
}
