import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        // Adding key-value pairs
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");

        // Accessing a value by key
        System.out.println("Student ID 101: " + students.get(101));

        // Iterating over the map
        System.out.println("All students:");
        for (Integer id : students.keySet()) {
            System.out.println("ID: " + id + ", Name: " + students.get(id));
        }

        // Removing an entry
        students.remove(102);
        System.out.println("After removal: " + students);
    }
}
