public class Circle4 {
    // Instance variable
    private double radius;

    // Constructor
    public Circle4(double radius) {
        this.radius = radius;
    }

    // Getter and Setter methods
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
