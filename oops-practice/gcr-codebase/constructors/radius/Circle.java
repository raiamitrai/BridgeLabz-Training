package OOPs.constructors.redius;

class Circle {

    private double radius;

    // 1️⃣ Default constructor
    Circle() {
        this(1.0);   // calls parameterized constructor
    }

    // 2️⃣ Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    void display() {
        System.out.println("Radius: " + radius);
    }
}

