// Program to check if a given number is PERFECT SQUARE

import java.util.*;  

public class squareRootCheck  
{   
    static boolean PerfectSquare(double number)    
    {   
        //calculating the square root
        double sqrt=Math.sqrt(number);  
        
        //comparing with the floor value of the square root
        return ((sqrt - Math.floor(sqrt)) == 0);   
    }   

    public static void main(String[] args)    
    {   
        Scanner sc=new Scanner(System.in); 
        
        System.out.print("Enter the number: ");  
        double num=sc.nextDouble();   

        if (PerfectSquare(num))   
            System.out.print("Yes, the given number is perfect square.");   
        else  
            System.out.print("No, the given number is not perfect square.");   
    }   
}   