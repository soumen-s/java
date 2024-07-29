// Program to get a PRIME SERIES under a given range

import java.util.*;
public class primeRange
{
    public static boolean isPrime(int num)
    {
        int count = 0;
        for(int i=1; i<=num; i++)
        {
            if(num%i == 0)
            {
                count++;
            }
        }
        if(count == 2)
        {
            return true;
        }
        return false;
    }
    
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter the ranges: ");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		System.out.print("The prime numbers between "+number1+" and "+number2+" is: ");
		for(int i=number1; i<=number2; i++)
		{
		    if(isPrime(i))
                    {
                        System.out.print(i+" ");
                    }
		}
	}
}
