public class Cylinder extends Circle4 {
    // Instance variable
    private double height;

    // Constructor
    public Cylinder(double radius, double height) {
        super(radius);  // Invoke the constructor of Circle class
        this.height = height;
    }

    // Getter and Setter methods
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Method to calculate the volume of the cylinder
    public double getVolume() {
        return getArea() * height;  // Volume = Area of base * height
    }
}
