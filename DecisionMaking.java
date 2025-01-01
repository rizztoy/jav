// DecisionMaking.java
import java.util.Scanner;

public class DecisionMaking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example of if-else
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        if (age < 18) {
            System.out.println("You are a minor.");
        } else if (age >= 18 && age <= 60) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");
        }

        // Example of switch-case
        System.out.println("\nEnter a number between 1 and 3:");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You chose option 1: Hello!");
                break;
            case 2:
                System.out.println("You chose option 2: Good Morning!");
                break;
            case 3:
                System.out.println("You chose option 3: Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
        }

        // Example of the ternary operator
        System.out.println("\nEnter a number to check even or odd:");
        int num = scanner.nextInt();
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number " + num + " is " + result + ".");

        scanner.close();
    }
}
