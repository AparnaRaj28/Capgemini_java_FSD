package cg.com;
class A
{
	B obj;
	A(B objb)
	{
		this.obj=obj;
	}
}
class B
{
	int x=10;
	B()
	{
		A obj=new A(this);
	}
	void display()
	{
		System.out.println("B::x="+x);
	}
}
public class ThisClass {
	public static void main(String args[]) {
		B obj=new B();
		obj.display();
		
	}

}
