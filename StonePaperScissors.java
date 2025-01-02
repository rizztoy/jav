import java.util.Scanner;
import java.util.Random;

public class StonePaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"Stone", "Paper", "Scissors"};

        System.out.println("Welcome to Stone-Paper-Scissors!");
        System.out.println("Enter your choice: 0 for Stone, 1 for Paper, 2 for Scissors");
        System.out.println("Type -1 to exit the game.");

        while (true) {
            System.out.print("Your choice: ");
            int playerChoice = scanner.nextInt();

            if (playerChoice == -1) {
                System.out.println("Exiting the game. Thanks for playing!");
                break;
            }

            if (playerChoice < 0 || playerChoice > 2) {
                System.out.println("Invalid choice! Please enter 0, 1, or 2.");
                continue;
            }

            int computerChoice = random.nextInt(3);

            System.out.println("You chose: " + options[playerChoice]);
            System.out.println("Computer chose: " + options[computerChoice]);

            if (playerChoice == computerChoice) {
                System.out.println("It's a tie!");
            } else if ((playerChoice == 0 && computerChoice == 2) || 
                       (playerChoice == 1 && computerChoice == 0) || 
                       (playerChoice == 2 && computerChoice == 1)) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }

            System.out.println();
        }

        scanner.close();
    }
}
