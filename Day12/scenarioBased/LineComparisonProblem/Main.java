package Day12.scenarioBased.LineComparisonProblem;

class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

class Line {

    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    // UC1: Calculate length
    public double getLength() {

        double x = p2.getX() - p1.getX();
        double y = p2.getY() - p1.getY();

        return Math.sqrt(x * x + y * y);
    }

    // UC2: Check equality
    @Override
    public boolean equals(Object obj) {

        Line other = (Line) obj;

        if (this.getLength() == other.getLength()) {
            return true;
        }

        return false;
    }
}

public class Main {

    public static void main(String[] args) {

        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);

        Line line1 = new Line(p1, p2);

        Point p3 = new Point(0, 0);
        Point p4 = new Point(6, 8);

        Line line2 = new Line(p3, p4);

        // UC1
        System.out.println("Line 1 Length: " + line1.getLength());
        System.out.println("Line 2 Length: " + line2.getLength());

        // UC2
        if (line1.equals(line2)) {
            System.out.println("Both lines are equal");
        } else {
            System.out.println("Lines are not equal");
        }

        // UC3
        if (line1.getLength() > line2.getLength()) {
            System.out.println("Line 1 is greater");
        } else if (line1.getLength() < line2.getLength()) {
            System.out.println("Line 1 is smaller");
        } else {
            System.out.println("Both lines are equal");
        }
    }
}