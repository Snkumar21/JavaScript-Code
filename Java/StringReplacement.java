import java.util.Scanner;

public class StringReplacement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the original string: ");
        String originalString = scanner.nextLine();

        System.out.print("Enter the string to replace: ");
        String toReplace = scanner.nextLine();

        System.out.print("Enter the replacement string: ");
        String replacement = scanner.nextLine();

        String result = originalString.replace(toReplace, replacement);
        System.out.println("Resulting string: " + result);

        scanner.close();
    }
}
