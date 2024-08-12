// Program to reverse a number 
/*
    Here time complexity will be O(n^2) where n is the 
    size of the given number. 
    There should exist the reversed one as a number form,
    not a reverse printing form only.
*/

import java.util.*;
class backward
{
    int num;
    public backward(int num)
    {
        this.num = num;
    }
    
    public int reverse()
    {
        int len = (int)(Math.log10(this.num)+1); // calculate length
        int hold=0, result=0;
        
        while(len != 0)
        {
            hold = num%10;
            num = num/10;
            result += (int) ((Math.pow(10,(len-1)))*hold);
            len--;
        }
        return result;
    }
}

public class reverseNumber
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.printf("\nEnter a number to reverse: ");
	    int num = sc.nextInt();
	    
            backward b = new backward(num);
            int r = b.reverse();
            System.out.println("\nAfter reversing, the number is: " + r);
	}
}