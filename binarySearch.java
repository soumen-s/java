// Program to find any element of an array using Binary Search
// it's just java implementation of binary search, concept is same as C 
import java.util.*;

class binarySearch 
{
	public static void main(String[] args) 
	{
		System.out.print("\nEnter the size of the array: ");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("\nEnter all " + n + " elements in ascending order: ");
		for (int i = 0; i < n; i++) 
		{
			System.out.print("Enter arr[" + i + "]: ");
			arr[i] = sc.nextInt();
		}

		// performing binary search
		System.out.print("Enter the element you wanna find: ");
		int target = sc.nextInt();

		int low = 0;
		int high = (n-1);
		int mid = 0;

		boolean found = false;

        while (low <= high) 
        {
            mid = (low + high) / 2;

            if (arr[mid] == target) 
            {
                found = true;
                break;
            } 
            else if (arr[mid] < target) 
            {
                low = mid + 1;
            } 
            else 
            {
                high = mid - 1;
            }
        }

          if (found) 
          {
              System.out.println("\n" + target + " is at index: " + mid);
          } 
          else 
          {
              System.out.println("\n" + target + " not found in the array.");
          }
    }
}