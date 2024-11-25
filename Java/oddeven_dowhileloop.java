import java.util.Scanner;

class oddeven_dowhileloop{
	public static void main(String Args[]){
	
		int i = 1;
		
		do{

			if(i%2==0)
			{
				System.out.println("The number is even " + i);
			}
			else	
			{
				System.out.println("The number is odd " + i);
			}
			i++;

		}while(i<=100);
	}
}