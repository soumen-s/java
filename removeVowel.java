// Program to remove vowels from a String 

import java.util.*; 

class removeVowel 
{	 
	static String remove(String str) 
	{ 
		//replacing the vowels with an empty string.
		return str.replaceAll("[aeiouAEIOU]", ""); 	
	}                    
	
	public static void main(String[] args) 
	{ 
		System.out.print("\nEnter the string: ");

	    Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); 

		System.out.println(remove(str)); 
	} 
} 
