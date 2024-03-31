/*--------------------------------------------------
Program to find distinct pairs from a given array
{1,2,3,4,5}
>>
(1,2) (1,3) (1,4) (1,5)
(2,3) (2,4) (2,5)
(3,4) (3,5)
(4,5)
--------------------------------------------------*/

public class pairsOfArray
{
    public static void pair(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
          System.out.println();  
        }
    }
    
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5};
		System.out.println("All the pairs are : ");
		pair(arr);
	}
}
