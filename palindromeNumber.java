// Program to check whether a number is palinderome or not.
import java.util.*;

class palindromeNumber 
{

	public static int palindrome(int x)
	{
		int total = 0;
		while(x != 0) 
		{
			int rem = x%10;
			x = x/10;
			total = total*10 + rem;
		}
	  return total;	
	}

	public static void main(String[] args)
	{
		System.out.println("\nCheck a number palindrome or not ~");
		System.out.print("Enter the number: ");

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int hold = palindrome(n);

		if(hold == n)
		{
			System.out.println("\n"+n+" is a palindrome number.");
		}
		else
		{
			System.out.println("\n"+n+" is not a palindrome number.");
		}


	}
}