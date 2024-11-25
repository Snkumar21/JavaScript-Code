import java.util.Scanner;

class calc{

	int n1,n2;

	public static void main(String Args[]){

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number 1: ");
        	int n1 = scan.nextInt();
		System.out.println("Enter a number 2: ");
        	int n2 = scan.nextInt();
		
		calc cal = new calc();

		cal.add(n1,n2);
	}
	
	void add(int a, int b){

		int add1 = a+b;
		System.out.println(add1);

	}

	void sub(int a, int b){

		int sub1 = a-b;
		System.out.println(sub1);

	}

	void mul(int a, int b){
		
		int mul1 = a*b;
		System.out.println(mul1);

	}

	void div(int a, int b){

		int div1 = a/b;
		System.out.println(div1);

	}
}