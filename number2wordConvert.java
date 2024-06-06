// Program to PRINT GIVEN NUMBERS IN WORDS

import java.util.*;
public class number2wordConvert
{
    public void pw(int n, String ch)
    {
        String one[] = {    
                            " ", "One ", "Two ", "Three ",
                            "Four ", "Five ", "Six ", "Seven ", "Eight ", 
                            "Nine ", "Ten ", "Eleven ", "Twelve ", "Thirteen ",
                            "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", 
                            "Eighteen ","Nineteen " 
                        };

        String ten[] = {   
                            "  ", "  ", " Twenty ", " Thirty ", " Forty ", " Fifty ", " Sixty ",
                            " Seventy ", " Eighty ", " Ninety " 
                        };

        if (n > 19)
            System.out.print(ten[n / 10] + one[n % 10]);
        else
            System.out.print(one[n]);
            
        if (n > 0)
            System.out.print(ch);
    }        
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Enter the number ~ ");
        int n = sc.nextInt();
        
        System.out.print(n + " in words is:");
        if (n <= 0)
        {
            System.out.println("Enter numbers greater than 0");
        }
        else
        {
            /*  As we're using the outer class, so to access it's methods 
                & veriables (if present), we've to make reference of that 
                outer class(that is actually the file name) itself.  */
                
            number2wordConvert a = new number2wordConvert();
            
            a.pw((n / 1000000000), "Hundred ");
            a.pw((n / 10000000) % 100, "Crore ");
            a.pw(((n / 100000) % 100), "Lakh ");
            a.pw(((n / 1000) % 100), "Thousand ");
            a.pw(((n / 100) % 10), "Hundred ");
            a.pw((n % 100), "");
        }
    }
}