// Leetcode - 1323

/*
    program to find the largest number we can get from a specific number with specific digits.
    Here the condition is that the number should be made of 9 & 6. So 
    considering that, we've to increase the number from 6 to 9.
*/

public class leetcode_1323
{
    public static int fun(int num)
    {
        String str = Integer.toString(num);  // to get length
        int length = str.length();
        int div=0;
        
        for(int i=0; i<str.length(); i++)
        {
            //div = (int)(Math.pow(10, (length-1)));  // 1000  100...
            
            //int current =  (int)((num / div) );  // 9  96   966  9669
            int current =  (int)((num / (int)(Math.pow(10, (length-1)))) ); // instead of div
            int currentF = current%10;  // 9  6  6  9
            
            if(currentF == 6)
            {
                //num += 3*div;  
                num += 3*((int)(Math.pow(10, (length-1))));
                break;
            }
            
            length--;
        }
        
        return num;
    }
    
	public static void main(String[] args) 
	{
		int num = 9669;
                //int num = 9996;
		int result = fun(num);
		System.out.println("\nThe largest number will be: " + result);
	}
}