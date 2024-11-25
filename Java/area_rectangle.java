import java.util.Scanner;

class area_rectangle
{
	public static void main(String Args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the length of rectangle : ");
		int l = scan.nextInt();

		System.out.println("Enter the width of rectangle : ");
		int w = scan.nextInt();

		int area = l * w;

		System.out.println("Area of rectangle is : " + area);
	}
}