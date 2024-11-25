import java.util.Scanner;

public class StudentAgeException 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
        
        	System.out.print("Enter student's age: ");
        	int age = scanner.nextInt();

        	try 
		{
	        	if (age < 18) 
			{
                	
				throw new ArithmeticException("Student's age is not correct");
            		
			} else {
	
                		System.out.println("Student's age is correct.");
            		}
        	} catch (ArithmeticException e) {

			System.out.println("Error: " + e.getMessage());
        	}
    	}
}