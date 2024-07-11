// Program to implement digit finder for a number like charAt() for string

import java.util.*; // for math
public class digitFinder
{
    
    public static void numIndex(int num, int index)
    {
        int length = (int) (Math.log10(num)+1); // 5.091 ~= 5
        int current = (int) (num / Math.pow(10,(length-index))); // (48657/100) to get
                                                                 // 6 as the last digit
        int result = current%10;  // pick the last digit as a result
        
        System.out.println("At index "+index+", the element is: "+result);
    }
    
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("\nEnter the number: ");  // Ex: 48657
	    int num = sc.nextInt();
	    
	    System.out.print("Enter the index you wanna find the element: ");  // Ex: 3
	    int index = sc.nextInt();

	    numIndex(num, index); // Ex. Ans: 6
	}
}