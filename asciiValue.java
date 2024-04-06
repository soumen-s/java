// Program to find out ascii value of a character.
import java.util.*;

public class asciiValue
{
	public static void main(String[] args) 
	{
		System.out.print("\nEnter character to see it's Ascii value: ");
		
		Scanner sc = new Scanner(System.in);
	    char n = sc.next().charAt(0);  // As there is no classical nextChar() method in Java Scanner class.
		                               // This combination instructs Java to record the next character 
		                               // or string that is input into the command line.
		                               
		int convert = (int)n;  // typecasting from char to int
		
		System.out.print("Ascii value of "+ n +" is: "+ convert);
	}
}
