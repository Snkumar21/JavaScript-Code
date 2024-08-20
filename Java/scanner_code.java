import java.util.Scanner;

class scanner_code{
	public static void main(String Args[]){

		Scanner uInput = new Scanner(System.in);
    	
        	System.out.println("Enter an integer: ");
        	int num1 = uInput.nextInt();
        	System.out.println("The entered int number is"+" "+num1);

		System.out.println("Enter an Float number: ");
		float num2 = uInput.nextFloat();
		System.out.println("The entered float number is :"+" "+num2);

		System.out.println("Enter an Double number: ");
		float num3 = uInput.next();
		System.out.println("The entered double number is :"+" "+num3);

		System.out.println("Enter an String : ");
		float str1 = uInput.nextLong();
		System.out.println("The entered string is :"+" "+str1);

	}
}