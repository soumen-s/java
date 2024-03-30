// Program to perform Binary Search recursivelly

import java.util.*;

public class binarySearchRecursive
{
    public static int binary(int arr[],int low,int high,int target)
    {
        int mid = (low+high) / 2;
        if(low <= high)
        {
            if(arr[mid] == target)
            {
                return mid;
            }
            else
            {
                if(target <= mid) // or (target > mid) then the rec. functions will swap 
                    return binary(arr,low,mid-1,target);
                else
                    return binary(arr,mid+1,high,target);
            }
        }
        else
        {
            return -1;
        }
    }    
    
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5};
		
		int low = 0;
		int high = arr.length-1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int target = sc.nextInt();
		
		int hold = binary(arr,low,high,target);
		
		if(hold >= 0)
		{
		    System.out.print(target+" is at index "+hold);
		}
		else
		{
		    System.out.print(target +" is not in the array !");
		}
		
	}
}
