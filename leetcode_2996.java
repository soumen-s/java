// Leetcode - 2996

/*
    Here the concept is that first we've to select the sorted 
    array part and then add them and compare that sum with the 
    remaining part of the array. If this sum is found elsewhere
    in the array, return the just next largest element from the 
    array (if that is not present). Otherwise, return the sum.
*/

import java.util.*;

public class leetcode_2996
{
    public static boolean search(int[] arr, int index, int target) // for searching sum
    {                                                              // in the remaining
        int data = 0;                                              // array part
        for(int i=index; i<arr.length; i++)
        {
            if(arr[i] == target)
            {
                return true;
            }
        }
        return false;
    }
    
    public static int SMI(int[] arr)
    {
        int sum = arr[0], index=0, justmax = 0;
        
        if(arr.length == 1)  return arr[0]+1;
        
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i] == arr[i-1]+1)
            {
                sum = sum + arr[i];
                index++;
                justmax = sum;
            }
            else
            {
                if(index == 0)
                {
                    sum = sum+1;
                    justmax = sum; 
                }
                if(search(arr,index,justmax))
                {
                    justmax++;  // so that the sum stay safe if it is required to
                    if(i == arr.length-1)  // return in other cases.
                    {
                        return justmax;
                    }
                }
                else
                {
                    break ;  // applicable where the whole array is sorted.
                }
            }
        }
        return justmax;
    }
    
	public static void main(String[] args)  // some examples
	{
		//int[] arr = {1,4,3};  // 2
		//int[] arr = {3,4,5,12,14,13};  // 15
		//int[] arr = {3,4,5,14,13};  // 12
		//int[] arr = {4,5,6,7,8,8,9,4,3,2,7};  // 30
                //int[] arr = {1,2,3,2,5};  // 6
                //int[] arr = {29,30,31,32,33,34,35,36,37};  // 297
                //int[] arr = {29};  // 30
                //int[] arr = {1,2,3,9,2,10,8,3,10,2};  // 6
                int[] arr = {19,47,6,8,9,20};  // 21
                //int[] arr = {46,8,2,4,1,2,4,10,2,5,7,3,1};  //47
                
                // int[] arr = {1,49,48,47,,46,45,44,43,42,41,40,39,  // 50
                //              38,37,36,35,34,33,32,31,30,29,28,27,
                //              26,25,24,23,22,21,20,19,18,17,16,15,
                //              14,13,12,11,10,9,8,7,6,5,4,32};
		
		int result = SMI(arr);
		
		System.out.print("\n"+result);
	}
}