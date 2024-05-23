// Program to implement JAVA CONSTRUCTOR

/*
    In Java, a constructor is a block of codes similar to the method. 
    It is called when an instance of the class is created. At the time of 
    calling constructor, memory for the object is allocated in the memory.

    It is a special type of method which is used to initialize the object.
    Every time an object is created using the new() keyword, at least one 
    constructor is called.
*/
class Student            // compile - javac constructorUsage.java
{                        // run - java Student
    String name;  
    int roll;
    char section;
    
    Student(char s,String n) // parameterized constructor
    {  
        section = s;  
        name = n;  
    }  
    
    // *Overloading - creating three arg overloaded constructor, for several future usage 
    Student(char s,String n,int r)
    {  
        section = s;  
        name = n;  
        roll = r;  
    }  
    
    void display()
    {
        System.out.println(name + " " + roll + " " + section);
    }  
   
    public static void main(String args[])
    {  
        Student s1 = new Student('A', "Mridu");  // missing data, but no problem
        Student s2 = new Student('A', "Soumen", 77);  // parameterized constructor
        Student s3 = new Student('A', "Sourav", 66);  
        //Student s4 = new Student();  // default constructor
        
        /* 
            default constructor - "It will work only when we dont define any
                                   constructor in the class. At that time we 
                                   can only define class variables/properties 
                                   or methods as well."
        
        */

        System.out.println("\nThe outputs of the objects ~ ");
        s1.display();  
        s2.display();  
        s3.display();  
   }  
}  