// Program to SORT an ARRAY OF STRINGS in alphabetic order

public class sortArrayOfStrings
{
    public static void stringOrdering(String[] arr)
    {
        String hold = null;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++) // checking all, after the i'th
            {
                if(arr[i].charAt(0) > arr[j].charAt(0))
                {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }    
        }
        
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args) 
    {
        String[] strArr = {"Zebra", "Cat", "Jack", "Ball", "Apple"};
        
        stringOrdering(strArr);
    }
}