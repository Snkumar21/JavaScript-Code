//Write java program to find the index of the first occurrence of the character present inside the string.

import java.util.Scanner;

public class FirstOccurrenceIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the character to find: ");
        char characterToFind = scanner.next().charAt(0);

        int index = inputString.indexOf(characterToFind);

        if (index != -1) {
            System.out.println("The first occurrence of the character '" 
                                + characterToFind + "' is at index: " + index);
        } else {
            System.out.println("The character '" + characterToFind + "' is not found in the string.");
        }

        scanner.close();
    }
}
