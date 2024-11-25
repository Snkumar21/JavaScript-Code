import java.util.Scanner;

class methodOverloading2 {
		
		public static void main(String Args[])
		{
			methodOverloading2 mO = new methodOverloading2();
			mO.display(5,7);
			mO.display("Hello");
		}

		void display(int n1, int n2)
		{
			int sum = n1+n2;
			System.out.println(sum);
		}
			
		void display(String str)
		{
			System.out.println(str);
		}

}