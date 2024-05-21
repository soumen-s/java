// Program to find the LCM of two numbers

import java.util.*;

class lcmOf2Numbers 
{
    public static int LCM(int a, int b)
    {
        // Checking for the largest number out of them
        int large = (a > b) ? a : b;

        while (true) 
        {
            if (large % a == 0 && large % b == 0)
                break;
                
            large++;
        }
        return large;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nEnter the 1st number: ");
        int a = sc.nextInt();
        
        System.out.print("Enter the 2nd number: ");
        int b = sc.nextInt();

        int answer = LCM(a,b);

        System.out.println("\nLCM of " + a + " and " + b + " is : " + answer);
    }
}
