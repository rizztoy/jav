import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        // Adding elements
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("New York"); // Duplicate element

        // Iterating over the set
        System.out.println("Cities:");
        for (String city : cities) {
            System.out.println(city);
        }

        // Checking if an element exists
        System.out.println("Contains 'Los Angeles'? " + cities.contains("Los Angeles"));
    }
}
