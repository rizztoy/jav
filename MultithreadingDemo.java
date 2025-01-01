// MultithreadingDemo.java

// A class extending Thread
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " is running.");
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

// A class implementing Runnable
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable " + Thread.currentThread().getName() + " is running.");
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + (i * 2));
        }
    }
}

// A shared resource with synchronized method
class Counter {
    private int count = 0;

    public synchronized void increment(String threadName) {
        count++;
        System.out.println(threadName + " incremented count to: " + count);
    }
}

public class MultithreadingDemo {
    public static void main(String[] args) {
        System.out.println("Main thread starts.");

        // Using Thread class
        MyThread thread1 = new MyThread();
        thread1.setName("Thread-1");
        thread1.start();

        // Using Runnable interface
        Thread thread2 = new Thread(new MyRunnable());
        thread2.setName("Thread-2");
        thread2.start();

        // Synchronized access to a shared resource
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

        // Wait for threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        System.out.println("Main thread ends.");
    }
}
