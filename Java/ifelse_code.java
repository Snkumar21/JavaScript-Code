import java.util.Scanner;

class ifelse_code{
	public static void main(String Args[]){
	
		int number;

		Scanner uInput = new Scanner(System.in);
		
		System.out.println("Enter an number: ");
        	number = uInput.nextInt();

        	if (number < 0) {
            		System.out.println("The number is negative.");
        	}
		else{
        		System.out.println("The number is positive");
		}

	}
}