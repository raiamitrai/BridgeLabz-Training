package OOPs.encapsulation.ecommerceplatform;

abstract class Product {

    private int productId;
    private String name;
    protected double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Abstract method
    public abstract double calculateDiscount();

    // Encapsulation (Getters & Setters)
    public int getProductId() {
        return productId;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public String getName() {
        return name;
    }
}

