import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three integers
        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third integer: ");
        int num3 = scanner.nextInt();

        // Calculate sum, average, and product
        int sum = num1 + num2 + num3;
        double average = sum / 3.0;
        int product = num1 * num2 * num3;

        // Determine the smallest and largest numbers
        int smallest = Math.min(num1, Math.min(num2, num3));
        int largest = Math.max(num1, Math.max(num2, num3));

        // Display the results
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Product: " + product);
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);

        scanner.close();
    }
}
