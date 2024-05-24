// Java program to reverse a string using recursion

class recStringReverse
{
	public static void reverse(String str)
	{
	    // base case: if the string is empty or has only one character, it is already reversed
		if (str.isEmpty() || str.length() == 1)
		{
		    System.out.println(str);   
		}
		else
		{
			System.out.print(str.charAt(str.length()-1)); // last character 
			reverse(str.substring(0,str.length()-1));
		}
	}
	
	public static void main(String[] args) 
	{
		String str = "Hi Soumen";

		System.out.print("\nThe reversed string is : ");
		reverse(str);
	} 
}
