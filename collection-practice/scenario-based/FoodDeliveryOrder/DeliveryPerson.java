package scenariobased.oops.FoodDeliveryOrder;

public class DeliveryPerson {
    private int deliveryPersonId;
    private String deliveryPersonName;
    private String deliveryPersonLocation;
    private boolean isAvilable;

    public DeliveryPerson(int deliveryPersonId, String deliveryPersonName, String deliveryPersonLocation, boolean isAvilable) {
        this.deliveryPersonId = deliveryPersonId;
        this.deliveryPersonName = deliveryPersonName;
        this.deliveryPersonLocation = deliveryPersonLocation;
        this.isAvilable = isAvilable;
    }

    public int getDeliveryPersonId() {
        return deliveryPersonId;
    }

    public void setDeliveryPersonId(int deliveryPersonId) {
        this.deliveryPersonId = deliveryPersonId;
    }

    public String getDeliveryPersonName() {
        return deliveryPersonName;
    }

    public void setDeliveryPersonName(String deliveryPersonName) {
        this.deliveryPersonName = deliveryPersonName;
    }

    public String getDeliveryPersonLocation() {
        return deliveryPersonLocation;
    }

    public void setDeliveryPersonLocation(String deliveryPersonLocation) {
        this.deliveryPersonLocation = deliveryPersonLocation;
    }

    public boolean isAvilable() {
        return isAvilable;
    }

    public void setAvilable(boolean avilable) {
        isAvilable = avilable;
    }
}
