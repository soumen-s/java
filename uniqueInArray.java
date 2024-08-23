// Program to find out all unique numbers from a sorted and duplicate array (a leetcode q.)
/*
    Here we are not able to cover the remaining part with "_".
    To do that we've to convert the array to an Object type and
    then to an integer type again where it is interacting with
    an integer value. That's why we printed the array in that way.
*/

import java.util.*;
public class uniqueInArray
{
    public static int[] findUnique(int[] arr)
    {
        int j=1, k=0, count=0;
        for(int i=1; i<arr.length-1; i++)
        {
            if(arr[i]-arr[i+1] != 0)  // != indicates unique
            {
                arr[j] = arr[i+1];
                j++;
                count++;
            }
            else
            {
                continue;
            }
        }
        
        for(k=count+1; k<arr.length; k++) // to separate the remaining part
        {
            arr[k] = 0;
            //arr[k] = "_";   we can't do that as it is an array of integer
        }

        System.out.println("\nIn result, last "+(arr.length-(count+1))+" zeros indicating empty place.");
        return arr;
    }
    
	public static void main(String[] args) 
	{
		int[] arr = {0,0,0,1,2,2,2,6,6,7,7,9,9,9,11,12};
		
		int[] result = findUnique(arr);
		System.out.println("The result is: "+Arrays.toString(result));
	}
}