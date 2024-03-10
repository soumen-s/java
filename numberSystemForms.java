// Program to see the in built forms for representation of the same numerical decimal
// value (15 in this case) using different number system forms such as 
// decimal, octal, binary and hexadecimal

public class numberSystemForms
{
	public static void main(String[] args) 
	{
	    byte form1 = 15; // decimal form of 15
	    byte form2 = 017; // octal form of 15 (0 + number in dec + 2)
	    byte form3 = 0b1111; // binary form of 15 (0 + b + number in bin)
	    byte form4 = 0xf; // or 0xF // hexadecimal form of 15 (0 + x + number in hex)
	    
	    System.out.println(form1);
	    System.out.println(form2);
	    System.out.println(form3);
	    System.out.println(form4);
	}
}
