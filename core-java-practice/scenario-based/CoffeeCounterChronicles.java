package scenariobased;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class CoffeeCounterChronicles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Enter coffee Name (esprosso, latte, cappuccino) or exist :- ");
            String coffee = sc.nextLine();
            if(coffee.equalsIgnoreCase("exit")){
                System.out.println("Thankyou");
                break;
            }

            System.out.println("enter coffee Quantity :- ");
            double quantity = sc.nextDouble();
            sc.nextLine();
            double price = 0;

            switch (coffee.toLowerCase()) {

                case "esprosso":
                    price = 100;
                    break;

                case "latte":
                    price = 50;
                    break;

                case "cappuccino":
                    price = 60;
                    break;

                default:
                    System.out.println("invalid coffee");
            }


            double total = price * quantity;
            double gst = total * 0.5;
            double billWithGst = total + gst;

            System.out.println("total : "+ billWithGst +"rs");


        }
    }
}
