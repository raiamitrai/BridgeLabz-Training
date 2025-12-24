package OOPs.classandobject.fooddeliveryapp;

public class Restorant {
    private String name;
    private String location;
    private String[] foodItems;

    public Restorant(String name, String location, String[] foodItems) {
        this.name = name;
        this.location = location;
        this.foodItems = foodItems;
    }

    // display restorant details
    void display(){
        System.out.println("Restorant name :  " +name);
        System.out.println("Restorent Location : " + location);
        System.out.println("Food Items are : ");
        for (String item : foodItems){
            System.out.println(item);
        }
    }
    // method to check food items avilable or not
    boolean isFoodAvilable(String food){
        for(String item : foodItems){
            if(item.equalsIgnoreCase(food)){
                System.out.println("Yes avilable");
                return true;
            }

        }
        System.out.println("Sorry! Not Avilable");
        return false;
    }
}
