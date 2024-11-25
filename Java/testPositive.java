import java.util.Scanner;
class testPositive
{
	public static void main(String[] Args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a value :");
		int x = s.nextInt();

		if(x>0)
		{
			System.out.println("The value is positive.");
		}
		else if(x<0)
		{
			System.out.println("The value is negative.");
		}
		else
		{
			System.out.println("The value is zero.");
		}
	}
}