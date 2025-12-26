package OOPs.inheritance.onlineretailordermanagement;

import java.util.Date;

public class ShippedOrder extends Order {
    private long trackingNumber;

    public ShippedOrder(int orderId , Date orderDate, long trackingNumber) {
        super(orderId,orderDate);
        this.trackingNumber = trackingNumber;
    }

    public long getTrackingNumber() {
        return trackingNumber;
    }

    String orderStatus(){
        return "Order Shipped (Tracking No. :" + trackingNumber + ")";
    }

}
