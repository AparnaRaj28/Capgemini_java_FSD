package cg.com;

final class A
{
	public void display()
	{
		System.out.println("This is the final method");
	}
}

//try to extend the final class
class B extends A
{
	public void display()
	{
		System.out.println("The final method is overriden");
	}
}
public class FinalClass {

	public static void main(String[] args) {
		B obj=new B();
		obj.display();

	}

}
