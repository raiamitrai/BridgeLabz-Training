//interface vs abstract class implementation

package review.interfacevsabstract;

public class CompareInterfaceVsAbstractClass {
    

    interface Animal {
        void makeSound();
        void sleep();
    }
    static class Dog implements Animal {
        @Override
        public void makeSound() {
            System.out.println("fooof fooof");
        }

        @Override
        public void sleep() {
            System.out.println("Dog is sleeping");
        }
    }

    abstract static class Vehicle {
        abstract void startEngine();
        abstract void stopEngine();
    }
    static class Car extends Vehicle {
        @Override
        void startEngine() {
            System.out.println("Car engine started");
        }

        @Override
        void stopEngine() {
            System.out.println("Car engine stopped");
        }
    }
    public static void main(String[] args) {

        Animal dog = new Dog();
        dog.makeSound();
        dog.sleep();

        Vehicle car = new Car();
        car.startEngine();
        car.stopEngine();
    }

    
}
