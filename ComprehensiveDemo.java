import java.io.*;
import java.util.*;

// Abstract class and inheritance
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Custom package usage (inside same file for simplicity)
class FileManager {
    public void writeFile(String filename, String content) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
            System.out.println("Content written to " + filename);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }

    public void readFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

// Runnable for multithreading
class MyRunnable implements Runnable {
    private String task;

    MyRunnable(String task) {
        this.task = task;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is performing task: " + task);
    }
}

public class ComprehensiveDemo {
    public static void main(String[] args) {
        // Demonstrating Inheritance and Polymorphism
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();
        shape1.draw();
        shape2.draw();

        // Using FileManager to handle files
        FileManager fileManager = new FileManager();
        String filename = "demo.txt";
        fileManager.writeFile(filename, "This is a demonstration of file handling.\nIt includes both writing and reading.");
        fileManager.readFile(filename);

        // Using Collections
        List<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");
        System.out.println("\nList contents:");
        items.forEach(System.out::println);

        // Using HashMap to store key-value pairs
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        System.out.println("\nMap contents:");
        map.forEach((key, value) -> System.out.println(key + ": " + value));

        // Demonstrating Multithreading
        System.out.println("\nStarting threads:");
        Thread thread1 = new Thread(new MyRunnable("Task A"));
        Thread thread2 = new Thread(new MyRunnable("Task B"));
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        // Synchronized block demonstration
        Counter counter = new Counter();
        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                counter.increment(Thread.currentThread().getName());
            }
        }, "Thread-3");

        Thread thread4 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                counter.increment(Thread.currentThread().getName());
            }
        }, "Thread-4");

        thread3.start();
        thread4.start();
        try {
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        System.out.println("Program finished.");
    }
}

class Counter {
    private int count = 0;

    public synchronized void increment(String threadName) {
        count++;
        System.out.println(threadName + " incremented count to: " + count);
    }
}
