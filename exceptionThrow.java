// Program that THROW an EXCEPTIONAL ERROR at compile time while found 

/*
    In Java, exceptions allows us to write good quality codes where the errors 
    are checked at the compile time instead of runtime. We specify the exception 
    object which is to be thrown. 
    The Exception has some message with it that provides the error description. 
    These exceptions generally related to user inputs. 
*/

import java.util.Scanner;

public class exceptionThrow 
{   
    public static void validate(int age) 
    {  
        if(age < 18) 
        {  
            // Throw ArithmeticException if condition does not match  
            throw new ArithmeticException("Person is not eligible to vote");    
        } 
        else 
        {  
            System.out.println("Person is eligible to vote!!");  
        }   
    }  
    
    public static void main(String args[])
    {  
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); 
        
        validate(age);  
    }    
}    