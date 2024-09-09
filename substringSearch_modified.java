// It is an modified version of the previous program
/*
    here we also have to terminate the target length portion
    so that we can reach upto the last (this case will arrive 
    when the substring will not be found). 
    
    When the target will not be found, then it'll return -1
*/

import java.util.Arrays;
public class substringSearch_modified
{
    public static int find(String str, String target)
    {
        for(int i=0; i<str.length()-target.length(); i++) // changed
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
		String target = "name";
		int index = find(str,target);
		System.out.print("String ("+target+") is starting from index: "+index);
	}
}