import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("Menu:");
            System.out.println("1. Bitwise OR");
            System.out.println("2. Bitwise AND");
            System.out.println("3. Bitwise XOR");
            System.out.println("4. Bitwise Complement");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter first integer: ");
                    int or1 = scanner.nextInt();
                    System.out.print("Enter second integer: ");
                    int or2 = scanner.nextInt();
                    System.out.println("Result of " + or1 + " | " + or2 + " = " + (or1 | or2));
                    break;
                    
                case 2:
                    System.out.print("Enter first integer: ");
                    int and1 = scanner.nextInt();
                    System.out.print("Enter second integer: ");
                    int and2 = scanner.nextInt();
                    System.out.println("Result of " + and1 + " & " + and2 + " = " + (and1 & and2));
                    break;

                case 3:
                    System.out.print("Enter first integer: ");
                    int xor1 = scanner.nextInt();
                    System.out.print("Enter second integer: ");
                    int xor2 = scanner.nextInt();
                    System.out.println("Result of " + xor1 + " ^ " + xor2 + " = " + (xor1 ^ xor2));
                    break;

                case 4:
                    System.out.print("Enter an integer: ");
                    int comp = scanner.nextInt();
                    System.out.println("Result of ~" + comp + " = " + (~comp));
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println(); // Print a new line for better readability
        } while (choice != 5);

        scanner.close();
    }
}