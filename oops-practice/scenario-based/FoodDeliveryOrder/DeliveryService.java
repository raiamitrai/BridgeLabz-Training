package scenariobased.oops.FoodDeliveryOrder;

import javax.swing.text.html.parser.Entity;
import java.util.*;

public class DeliveryService {
    Queue<Order> orderqueue ;
    List<DeliveryPerson> deliveryPersonList;
    Map<Order, DeliveryPerson> activeDeliveryList;

    public DeliveryService() {
        this.orderqueue = new LinkedList<>();
        this.deliveryPersonList = new ArrayList<>();
        this.activeDeliveryList = new HashMap<>();
    }



    public void orderAssign() throws NoAgentAvailableException{
        if(orderqueue.isEmpty()){
            System.out.println("There is no any order");
            return;
        }
        if(orderqueue.peek() != null){
            activeDeliveryList.put(orderqueue.poll(), deliveryPersonList.get(1));
            orderqueue.remove();
            return;
        }
        for(DeliveryPerson dp : deliveryPersonList){
            if(!dp.isAvilable()){
                throw new NoAgentAvailableException(" Delivery person Not Available ");
            }
            activeDeliveryList.put(orderqueue.poll(), dp);
            orderqueue.remove();
            dp.setAvilable(false);
            System.out.println("order assigned successfully");
            return;
        }

    }
    public void orderCancel(int orderId){
        Order forRemoveOrder = null;
        for(Map.Entry<Order,DeliveryPerson> i : activeDeliveryList.entrySet()){
            if(i.getKey().getOrderId() == orderId){
                i.getValue().setAvilable(true);
                forRemoveOrder = i.getKey();
                break;
            }
        }
        if(forRemoveOrder != null){
            activeDeliveryList.remove(forRemoveOrder);
            System.out.println("order cancel successfully");
        }
    }

    public void viewActiveOrders(){
         if (activeDeliveryList.isEmpty()) {
            System.out.println("No active deliveries");
            return;
         }
        for(Map.Entry<Order,DeliveryPerson> i : activeDeliveryList.entrySet()){
            System.out.println("======================================");
            System.out.println("order :- " + i.getKey().getOrderName());
            System.out.println("Delivery Boy :- "+i.getValue().getDeliveryPersonName());
        }
    }

}
