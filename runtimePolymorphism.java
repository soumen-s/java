// Program to implement RUNTIME POLYMORPHISM in java

class Animal 
{ 
      void sound() 
      { 
        System.out.println("Animal makes a sound"); 
      } 
} 

class Dog extends Animal 
{ 
      void sound() 
      { 
        System.out.println("Dog barks"); 
        // subclass method overriding the Parent class method, the subclass 
        // method will be invoked at runtime.
      } 
} 

class Cat extends Animal 
{ 
      void sound() 
      { 
        System.out.println("Cat meows"); 
        // again overriding is done for an another subclass and will be invoked at runtime.
      } 
} 


public class runtimePolymorphism 
{
      public static void main(String[] args) 
      { 
          
        Animal a1; // Reference of superclass 
        Animal a2;
    
        a1 = new Dog(); // Upcasting (Dog is automatically upcasted to Animal class) 
                       
    
        a2 = new Cat(); // Upcasting (Cat is automatically upcasted to Animal class)
                       
                       
        a1.sound(); // Calls the Dog class method  // O/P~ Dog barks         
        a2.sound(); // Calls the Cat class method  // O/P~ Cat meows
        
      } 
} 
