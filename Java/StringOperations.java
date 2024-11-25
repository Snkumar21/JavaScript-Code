import java.util.Scanner;

class StringOperations 
{
    	public static void main(String[] args) 
	{

	Scanner scanner = new Scanner(System.in);
        
        String str1 = "This is a new Message.";        
	String str2 = "Welcome to the world.";

        int choice;
        do {
            System.out.println("1. Display the length of both strings");
            System.out.println("2. Concatenate both strings");
            System.out.println("3. Compare both strings");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Length of the first string: " + str1.length());
                    System.out.println("Length of the second string: " + str2.length());
                    break;

                case 2:
                    String concatenated = str1 + str2;
                    System.out.println("Concatenated string: " + concatenated);
                    break;

                case 3:
                    if (str1.equals(str2)) {
                        System.out.println("Both strings are equal.");
                    } else {
                        System.out.println("Strings are not equal.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
