package cg.com.day5;

interface FirstInterface 
{
  public void myMethod(); // interface method
}

interface SecondInterface
{
  public void myOtherMethod(); // interface method
}
class DemoClass implements FirstInterface, SecondInterface
{
	  public void myMethod()
	  {
	    System.out.println("Some text..");
	   }
	  public void myOtherMethod() 
	  {
		 System.out.println("Some other text...");
	  }
}


public class InterfaceInheritance {

	public static void main(String[] args) {
	    DemoClass Obj = new DemoClass();
	    Obj.myMethod();
	    Obj.myOtherMethod();


	}

}
