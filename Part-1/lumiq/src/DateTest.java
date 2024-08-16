public class DateTest {
    public static void main(String[] args) {
        // Create an instance of Date
        Date date = new Date(8, 14, 2024);

        // Display the initial date
        System.out.print("Initial date: ");
        date.displayDate();

        // Modify the date using setters
        date.setMonth(12);
        date.setDay(25);
        date.setYear(2023);

        // Display the modified date
        System.out.print("Modified date: ");
        date.displayDate();

        // Access individual components using getters
        System.out.println("Month: " + date.getMonth());
        System.out.println("Day: " + date.getDay());
        System.out.println("Year: " + date.getYear());
    }
}
