// Program to get Fibonacci series upto a term given by user.

import java.util.*;

class fibonacciSeries
{	
	public static int fibonacci(int x)
	{
		if (x == 0)
			return 0;

		else if (x == 1)
			return 1;

		else
			return fibonacci(x-1) + fibonacci(x-2);  // recursion 
	}

	public static void main(String[] args)
	{
		System.out.println("\nIndexing starts from 0 ~");
		System.out.print("Enter the number to get Fibonacci Series: ");

		Scanner scan = new Scanner(System.in);
		int n =  scan.nextInt();

            // Fibonacci Series
		for (int i=0; i<n; i++)
		{
			int now = fibonacci(i);
			System.out.print(now + " ");
		}

	}
}