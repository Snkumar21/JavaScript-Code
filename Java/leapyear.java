import java.util.Scanner;

class leapyear{
	public static void main(String Args[]){
	
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the year : ");
		int year = obj.nextInt();
		
		if(year%4==0)
		{
			System.out.println("Leap Year");
		}else{
			System.out.println("Not Leap Year");
		}
				
	}
}