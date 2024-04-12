// Program to create SUBARRAYS from a given array 

import java.util.*;

public class subArray
{
    public static void subArrayprint(int[] arr)
    {
        for(int i=0; i<arr.length; i++)  // start
        {
            for(int j=i; j<arr.length; j++) // end
            {

              System.out.print("[");
                for(int k=i; k<=j; k++) 
                {
                    System.out.print(arr[k]+" "); // printing from start to end
                }
              System.out.print("] ");

            }
          System.out.println();    
        }
    }
    
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5};
		
		subArrayprint(arr);
	}
}
