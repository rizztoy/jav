// CollectionFrameworkDemo.java
import java.util.*;

public class CollectionFrameworkDemo {
    public static void main(String[] args) {
        System.out.println("=== ArrayList Example ===");
        // ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Apple"); // Duplicates allowed
        System.out.println("ArrayList: " + arrayList);
        System.out.println("Element at index 1: " + arrayList.get(1));

        System.out.println("\n=== HashSet Example ===");
        // HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Dog");
        hashSet.add("Cat");
        hashSet.add("Elephant");
        hashSet.add("Dog"); // Duplicates not allowed
        System.out.println("HashSet: " + hashSet);

        System.out.println("\n=== TreeSet Example ===");
        // TreeSet
        TreeSet<String> treeSet = new TreeSet<>(hashSet); // Maintains sorted order
        System.out.println("TreeSet: " + treeSet);

        System.out.println("\n=== HashMap Example ===");
        // HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        hashMap.put("One", 10); // Overwrites the value for key "One"
        System.out.println("HashMap: " + hashMap);
        System.out.println("Value for key 'Two': " + hashMap.get("Two"));

        System.out.println("\n=== Iteration Examples ===");
        // Iterating over ArrayList
        System.out.println("Iterating over ArrayList:");
        for (String item : arrayList) {
            System.out.println(item);
        }

        // Iterating over HashMap
        System.out.println("\nIterating over HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\n=== Stack Example ===");
        // Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack: " + stack);
        System.out.println("Popped: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        System.out.println("\n=== Queue Example ===");
        // Queue
        Queue<String> queue = new LinkedList<>();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");
        System.out.println("Queue: " + queue);
        System.out.println("Polled: " + queue.poll());
        System.out.println("Queue after poll: " + queue);
    }
}
