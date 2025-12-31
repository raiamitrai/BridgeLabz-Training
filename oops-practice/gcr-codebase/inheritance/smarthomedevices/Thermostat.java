package OOPs.inheritance.smarthomedevices;

class Thermostat extends Device {

    private int temperatureSetting;

    public Thermostat(String deviceId, boolean status, int temperatureSetting) {
        super(deviceId, status); // parent constructor
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    void display() {
        super.display(); // Device info
        System.out.println("Temperature Setting : " + temperatureSetting + "°C");

    }
}

