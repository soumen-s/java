// Question on character array exploration

/*
    Wap to take input of a word, then reverse the vowel characters only,
   'Without using string library' 
    
    Sample input: debanjan 
    Sample Output: dabanjen
*/

public class q4_charArrayQues
{
	public static void main(String[] args) 
	{
		char[] arr = {'D','e','b','a','n','j','a','n'};
		//char[] arr = {'S','o','u','m','e','n'};
		
		char[] vowelArr = new char[arr.length];
		
		int j=0;
		for(int i=0; i<arr.length; i++)
		{
		    //int j=0;
                    if(arr[i]=='A'||arr[i]=='a'||arr[i]=='E'||arr[i]=='e'||arr[i]=='I'||  // acts as isVowel method
                    arr[i]=='i'||arr[i]=='O'||arr[i]=='o'||arr[i]=='U'||arr[i]=='u') 
                    {
                        vowelArr[j] = arr[i];
                        j++;
                    }
		}
	
		for(int i=0; i<arr.length; i++)
		{
		    if(arr[i]=='A'||arr[i]=='a'||arr[i]=='E'||arr[i]=='e'||arr[i]=='I'||
    	            arr[i]=='i'||arr[i]=='O'||arr[i]=='o'||arr[i]=='U'||arr[i]=='u')
                    {
                        arr[i] = vowelArr[j-1];
                        j--;
                    }
      	            System.out.print(arr[i]);
		}
	}
}