package review.inventorymanagementsystem;

public class ProductManagement {
    public static void main(String[] args) {
        AlertService alertService = new AlertServiceImpl();
        Inventory inventory = new Inventory(10, alertService);

        try {
            inventory.upStock(10); 
            System.out.println("Current Stock: " + inventory.getStock());
            inventory.upStock(-1);
        } catch (OutOfStockException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Products in the inventory:");
        for (Product product : inventory.getProducts().values()) {
            System.out.println("- " + product.getName() + " ($" + product.getPrice() + ")");
        }

        inventory.addProduct(101, new Product("Laptop", 999.99));
        inventory.addProduct(102, new Product("Smartphone", 499.99));
        System.out.println("Products in the inventory after adding new products:");
        for (Product product : inventory.getProducts().values()) {
            System.out.println("- " + product.getName() + " ($" + product.getPrice() + ")");
        }
        

    }
}

