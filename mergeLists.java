// Program to MERGE 2 LISTS in java using ARRAYLIST

/*
    ArrayList is dynamic arrays in Java. Though, it may be slower than 
    standard arrays but can be helpful in programs where lots of manipulation
    in the array is needed.
    
    The difference between a array and an ArrayList in Java, is that the 
    size of an array cannot be modified (we have to create a new one if we 
    want any modification). While elements can be added and removed from 
    an ArrayList whenever we want.
*/

import java.util.*;  // for ArrayList
import java.util.List;

public class mergeLists
{
    public static void main(String[] args) 
    {
        List<String> list1 = new ArrayList<>(); // to create an ArrayList object
        list1.add("1");
        list1.add("2");
        list1.add("3");
        List<String> list2 = new ArrayList<>();
        list2.add("8");
        list2.add("7");

        List<String> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        System.out.println("\nThe merged list is : " + mergedList);
    }
}
