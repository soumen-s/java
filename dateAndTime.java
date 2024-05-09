// Program to display current Date and Time 

import java.util.Calendar;

public class dateAndTime 
{
    public static void main(String[] args) 
    {
        // An instance of the Calendar class representing the current date and time.
        Calendar c = Calendar.getInstance();
        
        System.out.println("\nCurrent Date and Time :");

        // Print the formatted date (month day, year.
        System.out.format("%tB %te, %tY%n", c, c, c);
        
        // Print the formatted time (hour:minute am/pm).
        System.out.format("%tl:%tM %tp%n", c, c, c); 
    }
}
