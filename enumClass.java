// Program to implement ENUM class in java, and access the variables

/* 
   * An enum is a special "class" that represents a group of constants
     or unchangeable variables.
   * Unlike a class an enum cannot be used to create objects, and it 
     cannot extend other classes.
   * They are like final veriables.
*/

enum grade 
{
  FIRST, SECOND, THIRD  //they are mostly represented in uppercase letters
}

public class Main 
{ 
  public static void main(String[] args) 
  { 
    grade variable = grade.SECOND;  // enum constants under enum type variable
    
    System.out.println(variable); 
  } 
}

// An enum cannot be used to create objects, and it cannot extend other classes