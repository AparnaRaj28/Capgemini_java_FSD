package cg.com.day5;

interface Polygon
{
	 void getArea();//this method is by default abstract
     default void getSides()
	{
		System.out.println("I can get sides of a polynomial");
	}
}

class Rectangle implements Polygon
{
	public void getArea()
	{
		int l=6;
		int b=5;
		int area=l*b;
		System.out.println("Area is:"+area);
		
	}
	  // overrides the getSides()
	  public void getSides() 
	  {
	    System.out.println("I have 4 sides.");
	  }

}
//implements the interface
class Square implements Polygon 
{
  public void getArea()
  {
 int length = 5;
 int area = length * length;
 System.out.println("The area of the square is " + area);
 }
}

public class InterfaceDemo {

	public static void main(String[] args)
	{
	    // create an object of Rectangle
	    Rectangle r1 = new Rectangle();
	    r1.getArea();
	    r1.getSides();

	    // create an object of Square
	    Square s1 = new Square();
	    s1.getArea();
	    s1.getSides();

	}

}
