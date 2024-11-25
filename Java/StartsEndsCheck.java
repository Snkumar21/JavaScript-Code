import java.util.Scanner;

public class StartsEndsCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the starting letter: ");
        char startLetter = scanner.next().charAt(0);

        System.out.print("Enter the ending letter: ");
        char endLetter = scanner.next().charAt(0);

        boolean startsWith = inputString.startsWith(String.valueOf(startLetter));
        boolean endsWith = inputString.endsWith(String.valueOf(endLetter));

        if (startsWith && endsWith) {
            System.out.println("The string starts with '" + startLetter + "' and ends with '" + endLetter + "'.");
        } else {
            System.out.println("The string does not meet the criteria.");
        }

        scanner.close();
    }
}
