// Leetcode - 66

/*
    In this question, we are given a large integer represented as an array
    of digits, where each digit is stored in one element of the array. The 
    integer does not contain any leading zero, except the number 0 itself. Your 
    task is to add one to the integer and return the resulting array of digits.
*/

import java.util.Arrays;

public class leetcode_66
{
    public static int[] plusOne(int[] arr)
    {
        for(int i=arr.length-1; i>=0; i--)
        {
            if(arr[i]+1 == 10)
            {
                arr[i]=0;
                //arr[i-1] += 1;
                if(i==0)
                {
                    int[] arr2 = new int[arr.length+1];
                    arr2[0] = 1;
                    for(int j=0; j<arr.length; j++)
                    {
                        arr2[j+1] = arr[j];
                    }
                    return arr2;
                }
            }
            else
            {
                arr[i] += 1;
                break;
            }
        }
        return arr;
        
    }
    
	public static void main(String[] args) 
	{
		//int[] arr = {9};
		//int[] arr = {9,9,9,9};
                int[] arr = {5,9,9,9};
		//int[] arr = {9,8,7,6,5,4,3,2,1,0};
		
		int[] result = plusOne(arr);
		
                System.out.print("\nThe upgraded array is: ");
		System.out.println(Arrays.toString(result));
	}
}