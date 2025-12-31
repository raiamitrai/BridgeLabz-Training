package OOPs.inheritance.onlineretailordermanagement;

import java.util.Date;

public class Order {
    private int orderId;
    private Date orderDate;

    public Order(int orderId, Date orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public int getOrderId() {
        return orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

     String orderStatus(){
        return "Order Placed";
    }
}
