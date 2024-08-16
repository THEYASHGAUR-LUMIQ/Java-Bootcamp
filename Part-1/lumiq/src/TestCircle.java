public class TestCircle {
    public static void main(String[] args) {
        // Create a Circle object using the default constructor
        Circle circle1 = new Circle();
        System.out.println("Circle 1:");
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Color: " + circle1.getColor());

        // Create a Circle object using the overloaded constructor
        Circle circle2 = new Circle(2.5, "blue");
        System.out.println("\nCircle 2:");
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Area: " + circle2.getArea());
        System.out.println("Color: " + circle2.getColor());

        // Modify the radius and color of circle1
        circle1.setRadius(3.0);
        circle1.setColor("green");
        System.out.println("\nModified Circle 1:");
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Color: " + circle1.getColor());
    }
}
