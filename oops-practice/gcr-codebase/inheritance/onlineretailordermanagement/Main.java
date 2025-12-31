package OOPs.inheritance.onlineretailordermanagement;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date orderDate = new Date(2025, 8,10);
        Date deliveredDate = new Date(2025, 8,15);

        DeliveredOrder order =new DeliveredOrder(101, orderDate,12345, deliveredDate);
        System.out.println(order.orderStatus());

    }
}
