import java.util.Scanner;

class methodOverloading {
		
		public static void main(String Args[])
		{
			methodOverloading mO = new methodOverloading();
			mO.add(5,7);
			mO.add(10,15,25);
		}

		void add(int n1, int n2)
		{
			int sum = n1+n2;
			System.out.println(sum);
		}
			
		void add(int n1, int n2, int n3)
		{
			int sum = n1+n2+n3;
			System.out.println(sum);
		}

}