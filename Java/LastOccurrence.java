import java.util.Scanner;

public class LastOccurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the character to find: ");
        char characterToFind = scanner.next().charAt(0);

        int lastIndex = inputString.lastIndexOf(characterToFind);
        if (lastIndex != -1) {
            System.out.println("The last occurrence of '" + characterToFind + "' is at index: " + lastIndex);
        } else {
            System.out.println("Character not found.");
        }

        scanner.close();
    }
}
