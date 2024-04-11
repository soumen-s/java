// Program to find the pair of the elements whose sum makes the largest number. 

// In the same way we can find the smallest 
// number with some little changes in line 10 and 20.

class pairOfLargest
{
    public static void pairOfLargest(int[] arr)
    {
        int max = Integer.MIN_VALUE;  // for comparing with the largest number
        int sum=0, x=0, y=0;
        
        System.out.println("\nAll the pairs are: ");
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                System.out.print("("+arr[i]+","+arr[j]+")");
                sum = arr[i]+arr[j];
                if(max < sum)  // one kind of largest num in the array code
                {
                    max = sum;
                    x = arr[i]; // grabing those elements, whose sum makes 
                    y = arr[j]; // the largest.
                }
            }
          System.out.println();    
        }
        System.out.print("The required pair is ["+x+","+y+"] and the sum is : "+max+"\n");
        
    }
    
    public static void main (String[] args) 
    {
        int[] arr = {-3,0,7,-5,9,1,-29,17,-11};
        
        pairOfLargest(arr);
    }
}