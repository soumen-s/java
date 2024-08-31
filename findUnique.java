/*
    In this program we are given 2 arrays, arr2 is the parent array here.
    we've to find how much unique elements belongs inside arr1 which is 
    also present in arr2.

    Here first i've remove all the elements from arr1 by converting it 
    into a hashset. Then compare it's elements with arr2's elements with 
    the help of hashset method. 

    That's why it's complexity is O(n).
*/    
import java.util.Set;
import java.util.HashSet;

public class findUnique 
{
    public static void main(String[] args) 
    {
        int[] arr1 = {4,1,1,2,7,2,3}; // make hashset for it..
        int[] arr2 = {1,2,3,4,5,6}; // no need to use hashset for it
        
        Set<Integer> hs1 = new HashSet<Integer>();  // now arr1 = {1,2,3,4,7}
        
        for (int a : arr1)   // Copying from array -> HashSet
        {
           hs1.add(a);
        }
        
        // To convert a hashset into an array (not needed here).
        // int[] ARR = hs1.stream().mapToInt(Integer::intValue).toArray();
        
        int count = 0;
        
        for(int i=0; i<arr2.length; i++)
        {
            if(hs1.contains(arr2[i])) 
            {
                count++;
            }
        }
        System.out.println("\nNumber of common elements : "+count);
    }
}