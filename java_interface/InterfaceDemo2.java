package cg.com.day5;
interface Polygon1
{
  void getArea();
  
  //calculate perimeter.
  default void getPerimeter(int...sides)
  {
	  int perimeter=0;
	  for(int i:sides)
	  {
		  perimeter+=i;
	  }
	  System.out.println("Perimeter="+perimeter);
  }
}
class Triangle implements Polygon
{
	private int a,b,c;
	private double s,area;
	
	Triangle(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		s=0;
	}
	
	//calculating area
	public void getArea()
	{
	      s = (double) (a + b + c)/2;
	      area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
	      System.out.println("Area: " + area);

	}
}

public class InterfaceDemo2 {

	public static void main(String[] args)
	{
		Triangle t1 = new Triangle(2, 3, 4);
	      t1.getArea();
	      t1.getPerimeter(2, 3, 4);
	}

}
