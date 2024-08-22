// Program to search the index of a substring(initially available) from a long string

import java.util.Arrays;
public class substringSearch
{
    public static int find(String str, String target)
    {
        for(int i=0; i<str.length(); i++)
        {
            if(str.substring(i, i+target.length()).equals(target))
            {
                return i;
            }
        }
        return -1;
    }
    
	public static void main(String[] args) 
	{
		String str = "My name is Soumen";
		String target = "is";
		int index = find(str,target);
		System.out.print("String ("+target+") is starting from index: "+index);
	}
}