// Leetcode - 344

/*
    this code is simply asking for reversing the characters of the 
    array and also store it in the same array
*/

import java.util.Arrays;
public class leetcode_344
{
    public static char[] reverse(char[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        
        while(start<end)
        {
            char x = arr[start];
            arr[start] = arr[end];
            arr[end] = x;
            
            start++;
            end--;
        }
        return arr;
    }
    
    public static void main(String[] args) 
    {
    	char arr[] = {'h','e','l','l','o'};
    	
    	char[] result = reverse(arr);
    	
    	System.out.print(Arrays.toString(result));
    }
}