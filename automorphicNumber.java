// Program to check whether a number is AUTOMORPHIC or not

/* 
   Here i've used 2 array to store the square result and the number itself.
   Then i compared both the array portions from the end portion to check 
   whether the result and number is same or not. That's why time complexity is little higher.
   
   **Another way is ~> int lastDigits = squareResult % (int) Math.pow(10, count);
   
   from that method we can also get the last potion of the result from
   the remainder. Here time complexity is lesser than my approach.
*/

import java.util.*;

public class automorphicNumber
{
    public static boolean automorphic(int num)  // Ex. 5, 6, 25, 76 etc.
    {
        int count = 0;
        int n1 = num;
        while(n1 != 0)  // to count the i/p size
        {
            n1=n1/10;
            count ++;
        }
        
        int[] arr = new int[count];
        
        int n2 = num; 
        for(int i=0; i<count; i++)  // storing the num in the array
        {
            arr[i] = n2%10;
            n2 = n2/10;
        }
        
        int result = num * num;
        int[] arr2 = new int[count];  
        for(int j=0; j<count; j++)  // storing the result upto the size of the i/p
        {
            arr2[j] = result%10;
            result = result/10;
        }
        
        int check = 0;
        for(int i=0; i<count; i++)  // checking whether the i/p and the result's
        {                           // end part is same or not.
            if(arr[i] == arr2[i])
            {
                check = check + 1;
            }    
        }
        
        return check == count;  // if condition matches, it will return true. else false
        
    }
    
	public static void main(String[] args) 
	{
		System.out.print("\nEnter the number: ");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(automorphic(n))
                    System.out.print(n + " is a Automorphic number.\n");
		else
		    System.out.print(n + " is not a Automorphic number.\n");
	}
}
