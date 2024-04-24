// Program to calculate the POWER (exponent) using recursion in java

import java.util.*;
public class powerUsingRecursion
{
    static int store = 1;
    public static void power(int x, int n)
    {
        if(n == 0)
        {
            System.out.println("The answer is = "+store);
            return;
        }
        store *= x;
        power(x,n-1);
    }
    
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    
		System.out.print("\nEnter base and exponent: ");
		int base = sc.nextInt();
		int exp = sc.nextInt();
		
		power(base,exp);
		
	}
}