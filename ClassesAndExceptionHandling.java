// ClassesAndExceptionHandling.java
import java.util.Scanner;

// A simple class with constructors
class Person {
    String name;
    int age;

    // Default constructor
    Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person's details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Custom exception for invalid age
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ClassesAndExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Using the default constructor
        Person defaultPerson = new Person();
        System.out.println("Default Person:");
        defaultPerson.display();

        // Using the parameterized constructor
        System.out.println("\nEnter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        try {
            // Check for invalid age
            if (age < 0) {
                throw new InvalidAgeException("Age cannot be negative!");
            }

            Person user = new Person(name, age);
            System.out.println("\nUser Details:");
            user.display();
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("\nThank you for using the program.");
        }

        scanner.close();
    }
}
