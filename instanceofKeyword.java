// Program to implement working of "instanceof" KEYWORD

/*
    In Java, instanceof is a keyword used for checking if a reference
    variable contains a given type of object reference or not. Means
    to test whether an object is an instance of a specific and valid
    class or not. 
*/

class Parent 
{
    // nothing is required
}

class Child extends Parent 
{
    // nothing is required
}

class Check
{
    
}

class Main 
{

	public static void main(String[] args)
	{
      /************** SOME OF THE USE CASES ARE DISCUSSED HERE **************/
      
		Child cObj = new Child();

		// checking whether "cObj" is an instance of "Child" class or not
		if (cObj instanceof Child)
			System.out.println("cObj is instance of Child"); // true
		else
			System.out.println("cObj is NOT instance of Child");


		// checking whether "cObj" is an instance of "Parent" class or not
		if (cObj instanceof Parent)
			System.out.println("cObj is instance of Parent"); // also true
		else
			System.out.println("cObj is NOT instance of Parent");
			
			
		// Parent object is not an instance of Child 	
		Parent pObj = new Parent();
		
		if (pObj instanceof Child)
            System.out.println("pObj is instance of Child");
        else
            System.out.println("pObj is NOT instance of Child"); // false	

        /* 
           Every class in Java inherits from Object, either directly 
           or indirectly. This means that "Object" is a superclass of all other 
           classes in Java. Means "Object" is like an ancestor of all classes.
        
		   instanceof returns true for all ancestors 
		*/

		if (cObj instanceof Object)
			System.out.println("cObj is instance of Object"); // true
		else
			System.out.println("cObj is NOT instance of Object");
			
			
		/*
		    If we apply instanceof operator with a variable that 
		    have null value, it returns false.	
		*/
		
		Child testObj = null;	
		
		if (testObj instanceof Child)
            System.out.println("testObj is instance of Child");
        else
            System.out.println("testObj is NOT instance of Child"); // false
            
            
            
            
    }
}
