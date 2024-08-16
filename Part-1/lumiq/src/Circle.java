public class Circle {
    // Private instance variables
    private double radius;
    private String color;

    // Default constructor
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    // Overloaded constructor
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Public method to get the radius
    public double getRadius() {
        return radius;
    }

    // Public method to get the area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Public method to get the color
    public String getColor() {
        return color;
    }

    // Public method to set the radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Public method to set the color
    public void setColor(String color) {
        this.color = color;
    }
}
