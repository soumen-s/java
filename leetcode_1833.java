// Leetcode - 1833  (Maximum ice cream bars)

/*
    We are given an array costs[] where each element represents the price of 
    an ice cream bar. We also have a limited number of coins. Our goal is to
    purchase as many ice cream bars as possible without exceeding your budget.
*/

import java.util.Arrays;
public class leetcode_1833
{
    public static int maxIceCream(int[] costs, int coins)
    {
        int i=0, count=0;
        //int sumUp = 0;
        
        Arrays.sort(costs); // So that we can collect ice creams of smallest costs.
        
        for(i=0; i<costs.length; i++)
        {
            if(costs[i] > coins)  // happen in testcase 2
            {
                break; 
            }
            else
            {
                //if(sumUp+costs[i]<=coins)  // or we can use it
                if(coins - costs[i] >= 0)    // budget calculation (complexity decreased)
                {
                    //sumUp = sumUp+costs[i];
                    coins -= costs[i];
                    count++;
                }
            }
        }
        
        return count;
    }
    
	public static void main(String[] args) 
	{
	    
                int[] costs = {1,3,2,4,1}; // o/p: 4
		int coins = 7;
	    
// 		int[] costs = {10,6,8,7,7,8}; // o/p: 0
// 		int coins = 5;
		
// 		int[] costs = {1,6,3,1,2,5}; // o/p: 6
// 		int coins = 20;
		
		int total = maxIceCream(costs,coins);
		
		System.out.println("\nTotal no. of ice creams are: " + total);
	}
}