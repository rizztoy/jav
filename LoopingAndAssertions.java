// LoopingAndAssertions.java
import java.util.Scanner;

public class LoopingAndAssertions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.println("=== For Loop ===");
        // For loop: Print numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("For loop iteration: " + i);
        }

        System.out.println("\n=== While Loop ===");
        // While loop: Print numbers from 1 to 5
        int whileCounter = 1;
        while (whileCounter <= 5) {
            System.out.println("While loop iteration: " + whileCounter);
            whileCounter++;
        }

        System.out.println("\n=== Do-While Loop ===");
        // Do-while loop: Print numbers from 1 to 5
        int doWhileCounter = 1;
        do {
            System.out.println("Do-while loop iteration: " + doWhileCounter);
            doWhileCounter++;
        } while (doWhileCounter <= 5);

        System.out.println("\n=== Enhanced For Loop ===");
        // Enhanced for loop: Iterate over an array
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println("Enhanced for loop value: " + num);
        }

        System.out.println("\n=== Nested Loops ===");
        // Nested loops: Print a multiplication table for numbers 1 to 3
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }

        System.out.println("\n=== Infinite Loop with Break ===");
        // Infinite loop with break
        int counter = 1;
        while (true) {
            System.out.println("Infinite loop iteration: " + counter);
            if (counter >= 5) break; // Exit the loop after 5 iterations
            counter++;
        }

        System.out.println("\n=== Loop with Continue ===");
        // Loop with continue: Skip printing number 3
        for (int i = 1; i <= 5; i++) {
            if (i == 3) continue; // Skip iteration for number 3
            System.out.println("Loop with continue, value: " + i);
        }
        // Assertion: Check if the factorial is positive
       float b = 443;
        assert b > 0 : "Factorial must be a positive number!";

        System.out.println("\nProgram executed successfully.");
        scanner.close();
    }
}
