package review.inventorymanagementsystem;

import java.util.HashMap;

class Inventory {
    private int stock;
    private AlertService alertService;

    HashMap<Integer, Product> products = new HashMap<>();


    public Inventory(int stock, AlertService alertService) {
        this.stock = stock;
        this.alertService = alertService;
    }


    public void upStock(int quantity) throws OutOfStockException {
        if (quantity < 0) {
            throw new OutOfStockException("Insufficient stock");
        }
        this.stock = quantity;
        if (this.stock < 5) {
            alertService.sendAlert("Stock is low: " + this.stock + " items left.");
        }
    }

    public int getStock() {
        return this.stock;
    }
    public HashMap<Integer, Product> getProducts() {
        return products;
    }
    HashMap<Integer, Product> addProduct(int productId, Product product) {
        products.put(productId, product);
        return products;
    }
}