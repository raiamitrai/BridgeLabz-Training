package scenariobased.oops.FoodDeliveryOrder;

import java.time.LocalDateTime;

public class Order {
    private int orderId;
    private String orderName;
    private String customerLocation;
    private LocalDateTime orderTiming;

    public Order(int orderId, String orderName, String customerLocation, LocalDateTime orderTiming) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.customerLocation = customerLocation;
        this.orderTiming = orderTiming.now();
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getCustomerLocation() {
        return customerLocation;
    }

    public void setCustomerLocation(String customerLocation) {
        this.customerLocation = customerLocation;
    }

    public LocalDateTime getOrderTiming() {
        return orderTiming;
    }

    public void setOrderTiming(LocalDateTime orderTiming) {
        orderTiming = orderTiming;
    }
}
