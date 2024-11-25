/*Write a java program to input integers and store it in an array. If the numbers are duplicate then an exception must be thrown.*/

import java.util.Scanner;

public class UniqueArrayInput
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of elements you want to add: ");
        	int n = scanner.nextInt();
        	int[] numbers = new int[n];

        	System.out.println("Enter " + n + " numbers:");

        	try
		{
            		for (int i = 0; i < n; i++)
			{
                		System.out.print("Enter number " + (i + 1) + ": ");
                		int num = scanner.nextInt();
                
                		if (num==num)
				{
                    			throw new Exception("Duplicate number found: " + num);
                		}
                
                		numbers[i] = num;
                		uniqueNumbers.add(num);
            		}

            		System.out.println("Array successfully created with unique numbers:");
            		for (int num : numbers) 
			{
                		System.out.print(num + " ");
            		}
        	} catch (DuplicateNumberException e) {
	
            		System.out.println(e.getMessage());

        	} finally {
            		scanner.close();
        	}
    	}
}
