// Program to perform WRAPPER CLASS activities (Autoboxing & Unboxing)
/*
    Some advantages ~
    *  Primitive types cannot hold null values, but wrapper classes can.
    *  Wrapper classes provide useful utility methods that are not available with primitive types. 
 */

class wrapperClass 
{
  public static void main(String[] args) 
  {
      // Autoboxing ~
      // converting a primitive type (int & double) to its corresponding object type
        Integer aObj = Integer.valueOf(23); 
        Double bObj = Double.valueOf(5.55);
        
      // Unboxing ~
      // converting an object type (Integer & Double) to its corresponding primitive type 
        int a = aObj.intValue();
        double b = bObj.doubleValue();
        
        System.out.println("The value of a: " + a);
        System.out.println("The value of b: " + b);
        
     // Or, the Java compiler can directly convert the primitive types
     // into corresponding objects
       char x = 'A';
       Character xObj = x;
       char ex = xObj.charValue();
       System.out.println("The value of x: " + ex);
     
  }
}
