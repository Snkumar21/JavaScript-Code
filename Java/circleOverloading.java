//Circle Overloading

class circleOverloading
{
	public static void main(String Args[])
	{
		circle c1 = new circle(10,20,5);
	}
	
	class circle
	{
		int x,y,z;
		
		circle(int x, int y, int z)
		{
			this.x = x;
			this.y = y;
			this.z = z;
		}
	}
}