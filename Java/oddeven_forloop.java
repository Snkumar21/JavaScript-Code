import java.util.Scanner;

class oddeven_forloop{
	public static void main(String Args[]){
	
		for( int i=1; i<=100; i++)
		{
			if(i%2==0)
			{
				System.out.println("The number is even " + i);
			}
			else	
			{
				System.out.println("The number is odd " + i);
			}
		}
	}
}