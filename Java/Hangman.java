import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        String[] words = {"java", "hangman", "computer", "programming", "game"};
        String wordToGuess = words[(int) (Math.random() * words.length)];
        char[] guessedWord = new char[wordToGuess.length()];
        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = '_';
        }

        int lives = 6;
        boolean gameWon = false;
        Scanner scanner = new Scanner(System.in);

        while (lives > 0 && !gameWon) {
            System.out.println("Word: " + new String(guessedWord));
            System.out.println("You have " + lives + " lives left. Guess a letter:");
            char guessedLetter = scanner.nextLine().charAt(0);

            boolean correctGuess = false;
            for (int i = 0; i < wordToGuess.length(); i++) {
                if (wordToGuess.charAt(i) == guessedLetter) {
                    guessedWord[i] = guessedLetter;
                    correctGuess = true;
                }
            }

            if (!correctGuess) {
                lives--;
            }

            gameWon = new String(guessedWord).equals(wordToGuess);
        }

        if (gameWon) {
            System.out.println("Congratulations! You've guessed the word: " + wordToGuess);
        } else {
            System.out.println("Sorry, you've run out of lives. The word was: " + wordToGuess);
        }

        scanner.close();
    }
}