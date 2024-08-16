public class CylinderTest {
    public static void main(String[] args) {
        // Create an instance of Cylinder
        Cylinder cylinder = new Cylinder(5, 10);

        // Display the radius and height
        System.out.println("Radius of the cylinder: " + cylinder.getRadius());
        System.out.println("Height of the cylinder: " + cylinder.getHeight());

        // Display the area of the base (circle)
        System.out.println("Area of the base (circle): " + cylinder.getArea());

        // Display the volume of the cylinder
        System.out.println("Volume of the cylinder: " + cylinder.getVolume());

        // Modify the radius and height
        cylinder.setRadius(7);
        cylinder.setHeight(15);

        // Display the updated radius, height, area, and volume
        System.out.println("Updated radius of the cylinder: " + cylinder.getRadius());
        System.out.println("Updated height of the cylinder: " + cylinder.getHeight());
        System.out.println("Updated area of the base (circle): " + cylinder.getArea());
        System.out.println("Updated volume of the cylinder: " + cylinder.getVolume());
    }
}
