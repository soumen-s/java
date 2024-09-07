// Program to find perfect square roots under a given range of numbers

public class findPerfectSquare
{
    public static int find(int[] arr)
    {
        int count=0;
        for(int i=0; i<arr.length; i++)
        {
            double a = arr[i]; 
            
            double b = Math.sqrt(a);
            
            int X = (int)b;  // to remove the fractional part
            
            double y = Math.pow(X,2);
            
            if(a == y) // if no fraction parts are not there-
            {
                count++; // means they are perfect square    
            }
        }
        return count;
    }
	public static void main(String[] args) 
	{
	    //int[] arr = {1,4,9,2};
	    int[] arr = {25,77,54,81,48,34,121};
	    
	    int a = find(arr);
	    System.out.println("\nNumber of perfect square roots are: " + a);
	}
}