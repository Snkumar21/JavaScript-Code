import java.util.Scanner;

public class SubstringSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the substring to search: ");
        String substring = scanner.nextLine();

        int index = inputString.indexOf(substring);
        if (index != -1) {
            System.out.println("The substring starts at index: " + index);
        } else {
            System.out.println("Substring not found.");
        }

        scanner.close();
    }
}
