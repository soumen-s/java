// Leetcode - 496

/*
    EXPLANATION ~
    Two arrays will be there. Here the first will be the subset of 2nd array.
    So when we'll traverse the first array, then we check whether the next 
    element of that particular element (which is also present in 2nd array)
    is greater than that traversed number or not. if yes then print it or else
    traverse the next ones untill we get. If it is till not present, print -1.
*/

import java.util.*;
public class leetcode_496
{
    static int x=0;
    static int z=0;
    
    public static boolean againCheck(int[] arr2, int target)
    {
        for(z=x; z<arr2.length-1; z++)
        {
            if(arr2[z+1] > target)
            {
                return true;
            }
            else
            {
                continue;
            }
        }
        return false;
    }
    
    public static boolean search(int[] arr2, int target)
    {
        for(x=0; x<arr2.length; x++)
        {
            if(arr2[x] == target)
            {
                return true;
            }
        }
        return false;
    }
    
    public static int[] nextGreaterElement(int[] arr1, int[] arr2) 
    {
        int k=0;
        for(int i=0; i<arr1.length; i++)
        {
            if(search(arr2,arr1[i]))  // whether the element is present on the other array or not
            {
                if((x+1) == arr2.length)   // is it the last element or not
                {
                    arr1[k] = -1;
                }
                else if(arr2[x+1]>arr2[x])  // if finally satisfied
                {
                    arr1[k] = arr2[x+1];
                }
                else
                {
                    if(againCheck(arr2,arr2[x]))  // checking the followed elements upto the length-1
                    {
                        arr1[k] = arr2[z+1];
                    }
                    else
                    {
                        arr1[k] = -1;
                    }
                }
                k++;  // position in arr1
            }
        }
        return arr1;
    }
    
	public static void main(String[] args) 
	{
		// int[] arr1 = {4,1,2};
		// int[] arr2 = {1,3,4,2};
		
		int[] arr1 = {1,3,5,2,4};
		int[] arr2 = {6,5,4,3,2,1,7};
		
		int[] result = nextGreaterElement(arr1,arr2);
		
        System.out.print("\nAnswer: ");
		System.out.println(Arrays.toString(result));
	}
}