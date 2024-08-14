// Program to find a sum from the set of array elements

/*
    Given a sorted array of integers arr and an integer target, write
    a program to find two indices in the array such that the sum of the 
    elements at those indices is equal to the target.
    
    Here the idea is, first we're subtracting all the array elements
    from the target element. So one part, by which we're subtracting is
    present in the array already. And on another part(subt. result part)
    we will found through binary search in the array to reduce the time 
    complexity.
*/

import java.util.*;
public class Main
{
    public static int binary(int[] arr, int key)
    {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        
        while(start <= end)
        {
            mid = (start+end)/2;
            if(arr[mid] == key)
            {
                return mid;
            }
            else
            {
                if(arr[mid]<key)
                {
                    start = mid+1;
                }
                else
                {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
    
    public static int[] func(int[] arr, int target)
    {
        for (int i=0; i<arr.length; i++)
		{
		    int sub = target - arr[i];
		    if(sub>0)
		    {
		        int ind1 = i;
		        int ind2 = binary(arr, sub);
		        if(ind2 != -1)
		        {
		            //System.out.print("["+ind1+" "+ind2+"]");
		            return new int[] {ind1,ind2};
		        }
		    }
		}
		return new int[] {};
    }
    
	public static void main(String[] args)
	{
		int arr[] = {2,7,11,15};
		int target = 9;
		
		Arrays.sort(arr);
		
		int[] result = func(arr, target);
		System.out.print(Arrays.toString(result));
	}
}