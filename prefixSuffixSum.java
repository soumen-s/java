// Suffix & Prefix Sum

/*
	Here we've done addition of the prefixes in prefix order & and 
	similarly it'll be done for suffix.
*/

import java.util.Arrays;
class prefixSuffixSum
{
	public static void main(String[] args) 
	{
		int[] arr = { 1 , 2 , 3 , 4 , 5 , 5  };
		
		int[] prefixSum = new int[arr.length];
		int[] suffixSum = new int[arr.length];
		
		int p=0, s=0;
		
		for(int i=0; i<arr.length; i++)
		{
		    p = p+arr[i];
		    prefixSum[i] = p;
		}
		
		for(int i=arr.length-1; i>=0; i--)
		{
		    s = s+arr[i];
		    suffixSum[i] = s;
		}
		
		System.out.println("\nPrefix Sum: "+Arrays.toString(prefixSum));
		System.out.println("\nSuffix Sum: "+Arrays.toString(suffixSum));
	}
}