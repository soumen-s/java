// Program to create MAXIMUM SUBARRAYS SUM (Sum of Subarray elements) using BRUTE FORCE method 

import java.util.*;

public class subArraySum
{
    public static void sumOfSubarray(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        int currentSum = 0;
        
        for(int i=0; i<arr.length; i++)  // start
        {
            for(int j=i; j<arr.length; j++)  // end
            {
              currentSum=0; // reset it for the next iteration
              System.out.print("[");
                for(int k=i; k<=j; k++)
                {
                    currentSum += arr[k];
                }
              System.out.print(currentSum); // after completion, print it
                
              System.out.print("] ");
            }
          System.out.println();    
        }
    }
    
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5};
		
		sumOfSubarray(arr);
	}
}
