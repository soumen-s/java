// Program to check whether a number is armstrong or not.

import java.util.*;

class armstrongNumber 
{

	public static int Armstrong(int x)
	{
		int count = 0;
		int temp = x;
		while(x != 0)
		{
			int rem = x%10;
			x = x/10;
			count ++;
		}

		int total = 0;
		while(temp != 0) 
		{
			int rem = temp%10;
			temp = temp/10;
			total += Math.pow(rem,count);
		}
	  return total;	
	}

	public static void main(String[] args)
	{
		System.out.println("\nChecking a number armstrong or not ~");
		System.out.print("Enter the number: ");

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int hold = Armstrong(n);


		if(hold == n)
			System.out.println("\n"+n+" is an armstrong number.");
		else
			System.out.println("\n"+n+" is not an armstrong number.");
	}
}