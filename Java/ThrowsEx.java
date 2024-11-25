import java.io.*;

class ThrowsEx
{
	public static void main(String[] args) 
	{
		try
		{
			methodWithException();
		}
		catch (IOException e)
		{
			System.out.println("Caught IOException: " + e.getMessage());
		}
	}
	
	public static void methodWithException() throws IOException 
	{
		// Simulate an IOException
		throw new IOException("This is an IOException");
    }
}