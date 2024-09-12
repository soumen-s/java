// Program to implement INNER CLASS & OUTER CLASS

/*
    To access the OUTER class, we know all the rules. First we've to create an 
    object of that class then we can acess the methods and variables.
    
    But in case of INNER class, we either can write static before class B, or we
    can skip that. If we use STATIC then to create an instance of a static inner
    class, we don't need an instance of the outer class. we simply can create it 
    directly using the outer class's name.It is often used when the inner class 
    doesn't need to access the outer class's instance variables or methods.
    
    But if the inner class is NON-STATIC, then we must first have an instance of 
    the outer class before new. This means it can access both static and non-static
    members of the outer class. It is used when the inner class needs to access or 
    modify the outer class's instance variables or methods.
*/

class A
{
    int a=5;
    public void fun()
    {
        System.out.println("Outer Class");
    }
    
    class B
    {
        int a = 8;
        public void fun()
        {
            System.out.println("Inner Class");
        }
    }
}

public class innerNouterClass
{
	public static void main(String[] args) 
	{
        A obj1 = new A();
        obj1.fun();
        System.out.println("Inner class Var: "+obj1.a);
        
        //A.B obj2 = new A.B(); // In case of static inner class
        A.B obj2 = obj1.new B(); // In case of static inner class
        obj2.fun();
        System.out.println("Outer class Var: "+obj2.a);
	}
}