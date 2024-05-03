// Program to perform factorial using recursion

import java.util.*;
public class factorial_Recursion
{
    public static int store = 1; // as we take fact as void
    public static void fact(int n)
    {
        if(n==0)
        {
            store *= 1; // while input is 0
            System.out.println("The factorial result is: "+store);
            return;
        }

        store *= n;
        fact(n-1);
    }
    
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
            System.out.print("\nEnter the number: ");
            int n = sc.nextInt();
	    fact(n);
	}
}
