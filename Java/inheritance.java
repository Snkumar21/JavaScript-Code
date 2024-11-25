class child extends parent {
	int n2 = 20;

	void displayc()
	{
		System.out.println("In child " + n1 + " " + n2);
	}
}
	
class parent {
	int n1 = 10;

	void displayp()
	{
		System.out.println("In Parent");
	}
}

class inheritance {
	public static void main(String Args[])
	{
		child c = new child();
		parent p = new parent();

		c.displayp();
		c.displayc();
		p.displayp();
	}
}