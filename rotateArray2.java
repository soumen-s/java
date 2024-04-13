// Program to see rotation or reversing an array using while loop in 2 ways
// In the previous code we used basic for loop which creates much complexity.

import java.util.*;

public class rotateArray2
{
    public static void reverse(int[] arr)
    {
        int start = 0;
        int mid = arr.length/2;
        int end = arr.length-1;
        
          //First Way
//      while(start < end) 
//      {
// 	    	int temp = arr[start];
// 	    	arr[start] = arr[end];
// 	    	arr[end] = temp;
// 	    	start++;
// 	    	end--;
//       }
           //Second Way
        while(start != mid)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
        
        System.out.print("\nAfter reversing ~ ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
	public static void main(String[] args) 
	{
		System.out.print("Enter size : ");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++)
		{
		    System.out.print("Enter arr["+i+"] : ");
		    arr[i] = sc.nextInt();
		}
		
		reverse(arr);
	}
}

