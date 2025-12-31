package OOPs.inheritance.smarthomedevices;

public class Device {
    private String deviceId;
    private boolean status;

    public Device(String deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public boolean isOn() {
        return status;
    }

    void display(){
        System.out.println("Device ID : " + deviceId);
        System.out.println("Status    : " + (status ? "ON" : "OFF"));
   }
}
