import java.util.Scanner;

class area_perimeter_circle{
	
	public static void main(String Args[])
	{
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the radius : ");
		double r = obj.nextDouble();

		double pi = 3.14;

		double area = pi * r * r;

		double circle =  2 * pi * r;

		System.out.println("Area of Circle = " + area);
		System.out.println("Perimeter of Circle = " + circle);
	}
}