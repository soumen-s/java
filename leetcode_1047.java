// Leetcode - 1047

 /*
 	This question asks us to remove all adjacent duplicate characters from a
 	given string repeatedly until no adjacent duplicates are left. The goal 
 	is to return the final string after all adjacent duplicates have been removed. 
 */

 import java.util.Stack;
 public class leetcode_1047
 {
     public static String removeDuplicate(String str)
     {
         Stack<Character> st = new Stack<Character>();
         for(int i=0; i<str.length(); i++)
         {
             if(!st.isEmpty() && str.charAt(i) == st.peek())
             {
                 st.pop();
             }
             else
             {
                 st.push(str.charAt(i));
             }
         }
         //System.out.print(st);
         
         StringBuilder sb = new StringBuilder(); // to convert it into a stringBuilder
 
         for (Character c : st) 
         {
             sb.append(c);
         }
         
         return sb.toString(); // to convert it into a proper string
     }
     
     public static void main(String[] args) 
     {
         String str = "abbaca";
         //String str = "azxxzy";
         
         String result = removeDuplicate(str);
         
         System.out.println("\nThe asked string is: "+result);
     }
 }