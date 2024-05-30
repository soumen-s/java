// Program to implement ARRAYLIST along with some of it's popular methods

/*
    The ArrayList class is a resizable array, part of the Java Collections Framework.
    
    The difference between a built-in array and an arrayList in Java, is that the 
    size of an array cannot be modified. While modification can be done (elements 
    can be added and removed) in an arraylist. 
    
    Means making it a flexible choice for handling lists of data where the size is 
    not known in advance.
*/

import java.util.ArrayList;  // importing ArrayList class

public class arraylistDetails 
{
  public static void main(String[] args) 
  {
    ArrayList<String> perfumes = new ArrayList<String>();  // creating an ArrayList object
    perfumes.add("Dior");
    perfumes.add("Chanel");
    perfumes.add("Giorgio Armani");
    perfumes.add("Creed");
    perfumes.add("Tom Ford");
    perfumes.add("Versace");
    
    
    System.out.println(perfumes); // print the whole arraylist
    
    System.out.println(perfumes.get(1)); // to access any particular element
    
    perfumes.set(4,"Givenchy"); // to modify any particular element
    System.out.println(perfumes.get(4));
    
    perfumes.remove(4); // to remove any particular element
    System.out.println(perfumes);
    
    // perfumes.clear();  // to remove all elements
    // System.out.println(perfumes);
    
    System.out.println(perfumes.size()); // to get the arraylist size
    
    
  }
}