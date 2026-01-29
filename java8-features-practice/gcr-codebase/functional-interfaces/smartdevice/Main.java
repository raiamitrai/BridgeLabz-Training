package interfaces.smartdevice;

public class Main {
    public static void main(String[] args) {

        Smartdevice light = new Lights();
        Smartdevice ac = new AC();
        Smartdevice tv = new TV();

        light.turnOn();
        ac.turnOn();
        tv.turnOn();

        light.turnOff();
        ac.turnOff();
        tv.turnOff();
    }
}

