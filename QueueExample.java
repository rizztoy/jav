import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> tasks = new LinkedList<>();

        // Adding elements
        tasks.add("Task 1");
        tasks.add("Task 2");
        tasks.add("Task 3");

        // Viewing and removing the head
        System.out.println("Head of queue: " + tasks.peek());
        System.out.println("Removing: " + tasks.poll());

        // Remaining elements
        System.out.println("Queue after removal: " + tasks);
    }
}
