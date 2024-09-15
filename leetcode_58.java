// Leetcode-58

/*
    In that program we've to figure out the last word's size.
    We've started counting of this program from the last index.
*/

public class leetcode_58
{
    public static int lastWord(String str)
    {
        String last = "";
        int len = 1; 

        for(int i=str.length()-1; i>0; i--)
        {
            if(str.charAt(i) != ' ')
            {
                last = last + str.substring(i,i+1);
                len = len+1;
                if(str.charAt(i-1) == ' ')  // that's why we've initialized len = 1
                {
                    len = len-1; // balanced
                    break;
                }
                
            }
        }
        return len;
    }
    
	public static void main(String[] args)
	{
		//String str = "Hello World";
        String str = "   fly me   to   the moon  ";
        //String str = "luffy is still joyboy";

        int result = lastWord(str);
        System.out.println("\nSize of the last word is: "+result);
	}
}