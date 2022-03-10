package cg.com.day5;
class A
{
	void eat()
	{
		System.out.println("Eating..");
	}
}
class B extends A
{
	void bark()
	{
		System.out.println("Barking...");
	}
}
class C extends B
{
	void weep()
	{
		System.out.println("Weeping...");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		C obj=new C();
		obj.eat();
		obj.bark();
		obj.weep();
	}

}
