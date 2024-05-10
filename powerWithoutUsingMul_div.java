// Program to calculate POWER of a number WITHOUT USING (*) AND (/)
// With respect to, *example ~> let, base=2 & exp=5

import java.util.*;
public class powerWithoutUsingMul_div 
{	
    public static int power(int b, int e) 
    { 
        if (e == 0) 
            return 1; 
              
        int result = b; 
        int temp = b; 
                  
        for (int i = 1; i < e; i++) // 1.. 2.. 3.. 4
        { 
            for (int j = 1; j < b; j++) // single step in every iteration
            { 
                result += temp;  // 2+2=4.. 4+4=8.. 8+8=16.. 16+16=32
            } 
            
            temp = result; // =4.. =8.. =16.. =32.. 
        } 
          
        return result; 
    } 
 
   public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the base & exponent: ");
        int base = sc.nextInt();
        int exp = sc.nextInt();
        
		if (base>0 && exp>0)
		    System.out.println("Power of the number is : " + power(base, exp));
   }	    
 }
