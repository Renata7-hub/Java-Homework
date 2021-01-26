package Exercises;

public class Circle {
    private final Point2D center;
    private final double radius;

    public Circle(Point2D center, Point2D edge) {
        this.center = center;
        this.radius = Math.sqrt(Math.pow((edge.getX() - center.getX()), 2) + Math.pow((edge.getY() - center.getY()), 2));
    }

    public double getRadius() {
        return this.radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
