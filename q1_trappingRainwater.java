// Program to solve TRAPPING RAINWATER problem

/*
   This problem includes some buildings in the form of blocks.
   We've to identify how much block of water can be stored into
   that uneven building blocks.
*/

public class q1_trappingRainwater
{
    public static void rainTrap(int[] arr)
    {
        int n = arr.length;
        
        int[] leftMax = new int[n]; // To track maximum height from left & also 
        int[] rightMax = new int[n]; // from right side for a position.
        
        leftMax[0] = arr[0];
        for(int i=1; i<n; i++)
        {
            leftMax[i] = Math.max(leftMax[i-1],arr[i]);
        }
        
        rightMax[n-1] = arr[n-1];
        for(int j=n-2; j>=0; j--)
        {
            rightMax[j] = Math.max(rightMax[j+1],arr[j]);
        }
        
        int trappedWater = 0, answer = 0;
        
        for(int i=0; i<n; i++)
        {
            trappedWater = Math.min(leftMax[i],rightMax[i]) - arr[i];  // min. water level - present block height
            answer += trappedWater;
        }
        
        System.out.println("\nLevel of water trapped is: " + answer);
    }
    
	public static void main(String[] args) 
	{
		int[] arr = {3,1,2,4,0,1,3,2};
		
		rainTrap(arr);
	}
}