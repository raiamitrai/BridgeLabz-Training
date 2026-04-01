package scenariobased.oops.FoodDeliveryOrder;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        // Service object
        DeliveryService service = new DeliveryService();

        // Delivery persons
        DeliveryPerson d1 = new DeliveryPerson(1, "Ramesh", "Area-1", true);
        DeliveryPerson d2 = new DeliveryPerson(2, "Suresh", "Area-2", true);

        service.deliveryPersonList.add(d1);
        service.deliveryPersonList.add(d2);

        // Orders
        Order o1 = new Order(101, "Pizza", "Area-1", LocalDateTime.now());
        Order o2 = new Order(102, "Burger", "Area-2", LocalDateTime.now());

        service.orderqueue.add(o1);
        service.orderqueue.add(o2);

        try {
            // Assign orders
            service.orderAssign();
            service.orderAssign();
        } catch (NoAgentAvailableException e) {
            System.out.println(e.getMessage());
        }

        // View active orders
        service.viewActiveOrders();

        // Cancel an order
        service.orderCancel(101);

        // View again
        service.viewActiveOrders();
    }
}
