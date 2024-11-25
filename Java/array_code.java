import java.util.Scanner;

class array_code{
	public static void main(String Args[]){

		Scanner input = new Scanner(System.in);

		int num[]= new int[10];
        
		for(int i=0; i<10; i++)
		{
		       	System.out.println("Enter numbers " + (i+1) + ": ");
        		num[i] = input.nextInt();
		}

		for(int i=0; i<10; i++)
		{
			System.out.println(num[i] + " ");
		}

	}
}