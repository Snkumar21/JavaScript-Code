import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Ask the user to choose the game mode
        System.out.println("Choose Game Mode: ");
        System.out.println("1. Play with Computer");
        System.out.println("2. Two Player Game");
        int gameMode = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after nextInt()

        if (gameMode == 1) {
            // Play against the computer
            playWithComputer(scanner, random);
        } else if (gameMode == 2) {
            // Play two-player game
            playTwoPlayer(scanner);
        } else {
            System.out.println("Invalid choice. Please restart the game.");
        }

        scanner.close();
    }

    // Function to handle the game against the computer
    public static void playWithComputer(Scanner scanner, Random random) {
        String[] rps = {"Rock", "Paper", "Scissors"};
        
        // Computer randomly selects a move
        String computerMove = rps[random.nextInt(3)];

        // Player input
        System.out.println("Enter your move (Rock, Paper, Scissors): ");
        String playerMove = scanner.nextLine();

        // Check who wins
        if (playerMove.equalsIgnoreCase(computerMove)) {
            System.out.println("It's a tie! Computer chose " + computerMove);
        } else if ((playerMove.equalsIgnoreCase("Rock") && computerMove.equals("Scissors")) ||
                   (playerMove.equalsIgnoreCase("Scissors") && computerMove.equals("Paper")) ||
                   (playerMove.equalsIgnoreCase("Paper") && computerMove.equals("Rock"))) {
            System.out.println("You win! Computer chose " + computerMove);
        } else {
            System.out.println("You lose! Computer chose " + computerMove);
        }
    }

    // Function to handle two-player game
    public static void playTwoPlayer(Scanner scanner) {
        // Player 1 input
        System.out.println("Player 1, enter your move (Rock, Paper, Scissors): ");
        String player1Move = scanner.nextLine();

        // Clear screen (optional)
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Player 2 input
        System.out.println("Player 2, enter your move (Rock, Paper, Scissors): ");
        String player2Move = scanner.nextLine();

        // Determine the winner
        if (player1Move.equalsIgnoreCase(player2Move)) {
            System.out.println("It's a tie!");
        } else if ((player1Move.equalsIgnoreCase("Rock") && player2Move.equalsIgnoreCase("Scissors")) ||
                   (player1Move.equalsIgnoreCase("Scissors") && player2Move.equalsIgnoreCase("Paper")) ||
                   (player1Move.equalsIgnoreCase("Paper") && player2Move.equalsIgnoreCase("Rock"))) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }
    }
}
