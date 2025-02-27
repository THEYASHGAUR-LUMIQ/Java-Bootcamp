import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.PriorityQueue;

class Student implements Comparable<Student> {
    int id;
    String name;
    double cgpa;
    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int compareTo(Student b) {
        if (this.cgpa > b.cgpa) { return -1; }
        if (this.cgpa < b.cgpa) { return 1; }
        if (this.cgpa == b.cgpa) {
            if (this.name.compareTo(b.name) < 0 ) { return -1; }
            if (this.name.compareTo(b.name) > 0) { return 1; }
            if (this.name.compareTo(b.name) == 0) {
                if (this.id < b.id) { return -1; }
                if (this.id > b.id) { return 1; }
            }
        }
        return 0;
    }

    public String getName() {
        return name;
    }
}

    class Priorities {
        Priorities() {}
    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> queue = new PriorityQueue<>();
        for (String event : events) {
            if (event.contains("SERVED")) {
                if (!queue.isEmpty()) {
                    queue.poll();
                }
            } else {
                String[] data = event.split(" ");
                queue.add(new Student(Integer.parseInt(data[3]), data[1], Double.parseDouble(data[2])));
            }
        }

        List<Student> result = new ArrayList<>();
        while (!queue.isEmpty()) {
        result.add(queue.poll());
        }

        return result;
        }
        }

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}