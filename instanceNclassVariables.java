// Program to understand the differences b/w CLASS VARIABLES & INSTANCE VARIABLES

/*
    CLASS VARIABLES ~ are declared inside the class but outside any method, constructor,
    or block. These classes can be accessed from outside the class using (className.variableName)
    and they are modifiable also. Their value doesn't change even though if we call them
    using the defined objects. It is static because it is only accessed from main which 
    is also a static method.
    
    INSTANCE VARIABLES ~ are the variables that can be accessed just after object creation
    using new keyword. Each instance or object has its own set of instance variables, 
    independent of other instances. These rules are applicable for instance methods also.
*/

class Rectangle 
{
    // class variables
    static int height = 13;
    
    // instance variables
    int length; 
    int width;

    Rectangle(int length, int width)
    {
        this.length = length;
        this.width = width;
    }
    
    // instance method
    int area()
    {
        return length*width;
    }
}

class instanceNclassVariables 
{
    public static void main(String[] args)
    {
        Rectangle R1 = new Rectangle(15,10);
        Rectangle R2 = new Rectangle(12,5);
        System.out.println(R1.length); // accessing instance variables
        System.out.println(R1.area()); // accessing instance methods
        System.out.println(R2.area());
        
        System.out.println(Rectangle.height); // accessing class variables
        Rectangle.height = 14; // modifying
        System.out.println(Rectangle.height); // 14
        
        System.out.println(R1.height); // 14  still won't change
        System.out.println(R2.height); // 14
    }
}