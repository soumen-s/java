// program to find substring of a string and replacing 
// a part of string or character from one to another.

class stringOperations_2
{
	public static void main(String[] args)
	{
		//function - substring

		String name1 = "My name is Soumen\n";
	    System.out.println(name1.substring(3,7));	


        String name2 = "I am from IT brunch";
		System.out.println(name2.replace("am","AM")); // change in string
		System.out.println(name2.replace('b','B')); // change in character
	}
} 