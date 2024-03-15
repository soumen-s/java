// Program to see the rotation of an array ~

import java.util.*;

class rotateArray 
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

		System.out.print("\nBefore rotation, the array is: ");
		for (int j=0; j<n; j++)
		{
			System.out.print(arr[j]+" ");
		}

		int start = 0;
		int end = n-1;

		for (int j=start; j<=end; j++)
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

		System.out.print("\nAfter rotation, the array is: ");
		for (int j=0; j<n; j++)
		{
			System.out.print(arr[j]+" ");
		}
	}
}