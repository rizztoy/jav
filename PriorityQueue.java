import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements
        pq.add(15);
        pq.add(10);
        pq.add(20);

        // Iterating over elements
        System.out.println("PriorityQueue:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll()); // Removes and returns the smallest element
        }
    }
}
