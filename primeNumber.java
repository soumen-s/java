import java.util.*;

public class primeNumber
{
    public static boolean isPrime(int n)
    {
        int count = 0;
        for(int i=n; i>=1; i--)
        {
            if(n%i == 0)
               count ++;
        }
    
        if(count == 2)
            return true;
        else
            return false;
    }
	public static void main(String[] args) 
	{
		System.out.println("Checking a number is prime or not ~ ");;
		System.out.print("Enter the number: ");;
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		boolean check = isPrime(n);
		
		if (check == true)
    	    System.out.print("yes, "+n+" is a prime number.");
		else
		    System.out.print("No, "+n+" is not a prime number.");
	}
}
