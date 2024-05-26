// Making a java recursive method to find the maximum element in an array

public class largestInArr_recursion 
{

    public static int findMax(int[] arr, int i, int currentMax) 
    {
        if (i == arr.length)  //base case: If we reach the end 
            return currentMax;
        
        if (arr[i] > currentMax) 
            currentMax = arr[i];
        
        return findMax(arr, i + 1, currentMax);
    }
    
    public static void main(String[] args) 
    {
        int[] arr = {1, 5, 3, 9, 2, 8};
        
        int maxElement = findMax(arr, 0, arr[0]); // array itself, index, first element
        
        System.out.println("The largest element in the array is: " + maxElement);
    }
}
