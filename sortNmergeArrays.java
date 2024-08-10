// Program to sort 2 arrays and merge & store it in 3rd array simultaneously 
/*
    The overall time complexity for the merge operation is O(n+m),
    where n is the size of arr1 and m is the size of arr2.
*/    

public class sortNmergeArrays
{
	public static void main(String[] args) 
	{
		int arr1[] = {1,4,6,9,10};
		int arr2[] = {2,5,7};
		
		int total = (arr1.length+arr2.length);
		
		int arr3[] = new int[total];
		int i=0, j=0, k=0;
		
		while(i<arr1.length && j<arr2.length)
		{
		    if(arr1[i]<=arr2[j])
		    {
		        arr3[k++] = arr1[i++];   
		    }
		    else
		    {
		        arr3[k++] = arr2[j++];   
		    }
		    
		} // loop wiil be end as soon we rich the smallest array
		  // because we're increasing together (i & j)
		
		// for rest of array portion
		while(i < arr1.length)
		{
		    arr3[k++] = arr1[i++];   
		}
		
		while(j < arr2.length)
		{
		    arr3[k++] = arr2[j++];
		}
		
		System.out.print("The sorted and final array is: ");
		for(int l : arr3)
		{
		    System.out.print(l+" ");
		}
	}
}