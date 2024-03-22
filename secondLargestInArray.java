// Program to find the second largest element from an array ~

import java.util.*;

class secondLargestInArray 
{
	public static void main(String[] args) 
	{
		System.out.print("\nEnter the size of the array: ");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) 
		{
			System.out.print("Enter arr[" + (i+1) + "]: ");
			arr[i] = sc.nextInt();
		}

		int max1 = arr[0];
		int max2 = arr[0];

		for (int i=0; i<n; i++)
		{
			if(arr[i]>max1)        
			{
				max2 = max1;     // to hold the previous max
				max1 = arr[i];
			}
			else if (arr[i] > max2 && arr[i] != max1) 
			{ 
                max2 = arr[i];  // added condition to avoid setting max2 to max1
            }
		}
	  System.out.print("\nThe second largest element is: "+ max2);
	}
}