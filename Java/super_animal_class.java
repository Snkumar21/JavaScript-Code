class animal
{
	void display()
	{
		System.out.println("I am in the Animal Class");
	}
}

class dog extends animal
{
	void display()
	{
		super.display();
		System.out.println("I am in the Dog Class");
	}
}

class super_animal_class
{

	public static void main(String Args[])
	{
		animal a = new animal();
		dog d = new dog();

		d.display();
	}
}