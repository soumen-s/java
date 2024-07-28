// Program to convert a string into a integer.
/* Not applicable for strings that includes characters like "soumen" */

public class stringToInt
{  
    public static void main(String args[])
    {  
        String s="200";  
        
        int i = Integer.valueOf(s);  // or we can use parseInt() method
        
        System.out.println(s+100);  // 200100, as it is string concatenation  
        System.out.println(i+100);  // 300, as it is integer concatenation
    }
}