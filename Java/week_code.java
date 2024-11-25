import java.util.Scanner;

class week_code {
	public static void main(String Args[]){

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a number (1-7) to get the day of the week: ");
        int day = obj.nextInt();

        if (day == 1) {
            System.out.println("The day is Monday.");
        } else if (day == 2) {
            System.out.println("The day is Tuesday.");
        } else if (day == 3) {
            System.out.println("The day is Wednesday.");
        } else if (day == 4) {
            System.out.println("The day is Thursday.");
        } else if (day == 5) {
            System.out.println("The day is Friday.");
        } else if (day == 6) {
            System.out.println("The day is Saturday.");
        } else if (day == 7) {
            System.out.println("The day is Sunday.");
        } else {
            System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }

    }
}
