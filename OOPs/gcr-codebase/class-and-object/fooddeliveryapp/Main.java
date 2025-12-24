// Sample Program 1:  Food Delivery App
//Real-World Analogy
//Imagine a food delivery app like Swiggy or Uber Eats. The app deals with restaurants, and each restaurant has specific details like its name, location, and the food items it serves.

package OOPs.classandobject.fooddeliveryapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //food Items for the restorant
        String[] foodItems1 = {"pizza", "Pasta", "Burger"};
        String[] foodItems2 = {"Sushi", "Ramen", "Tempura"};

        // create restorant object
        Restorant restorant1 = new Restorant("Maharaja", "Varanasi", foodItems1);
        Restorant restorant2 = new Restorant("satkar", "varanasi",foodItems2);

//        display detail of each restorrant
        System.out.println("Restorant 1 :-");
        restorant1.display();
        System.out.println("Restorant 2 :- ");
        restorant2.display();

        //check food is avilable or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Write name of the food :- ");
        String food = sc.nextLine();
        restorant1.isFoodAvilable(food);
    }
}
