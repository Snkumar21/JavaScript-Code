import java.util.Scanner;

public class CaseConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.println("Uppercase: " + inputString.toUpperCase());
        System.out.println("Lowercase: " + inputString.toLowerCase());

        scanner.close();
    }
}
