// Program to SEARCH an element IN AN ARRAY RECURSIVELY

public class linearRecursiveSearch 
{
	static int recLinSearch(int arr[], int start, int end, int target)
	{
		if (end < start)
			return -1;

		if (arr[start] == target)
			return start;

		if (arr[end] == target)
			return end;
			
		return recLinSearch(arr, start+1, end-1, target);
	}

	public static void main(String[] args)
	{
		int find = 18;

		int arr[] = new int[] {25, 60, 18, 3, 10};

		int index = recLinSearch(arr, 0, arr.length-1, find);

		if (index != -1) 	// If index is found means element exists
			System.out.println(find + " is present at index "+ index);
		else
			System.out.println(find + " is not present");
	}
}
