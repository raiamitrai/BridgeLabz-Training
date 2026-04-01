package OOPs.inheritance.onlineretailordermanagement;

import java.util.Date;

public class DeliveredOrder extends ShippedOrder {
    private Date deliveryDate;

    public DeliveredOrder(int orderId, Date orderDate,long trackingNumber, Date deliveryDate) {
        super(orderId,orderDate,trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    @Override
    String orderStatus(){
        return "Order ID        : " + getOrderId() +
                "\nOrder Date     : " + getOrderDate() +
                "\nDelivery Date  : " + deliveryDate +
                "\nStatus         : Order Delivered";
    }

}
