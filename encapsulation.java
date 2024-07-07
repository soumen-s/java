// Program to implement ENCAPSULATION in java

/*
    Encapsulation ~ encapsulate the properties.
    In encapsulation, we use setter and getter methods 
    to set a value from the private properties and to get 
    or return values respectively. 
*/

class Encapsulate
{
    private int length;
    private int width;
    
    void setArea(int a, int w)
    {
        length = a;
        this.width = w; //not needed
    }
    
    int getArea()
    {
        return length*width;
    }
}

public class encapsulation
{
	public static void main(String[] args) 
	{
		Encapsulate enc = new Encapsulate();
		enc.setArea(5,3); // setter
		System.out.println(enc.getArea()); // getter
	}
}
