package cg.com.day5;

abstract class Motorbike
{
	abstract void brake();
}

class Sportsbike extends Motorbike
{
	void brake()
	{
		System.out.println("Sport bike brake");
	}
}
class Mountainbike extends Motorbike
{
	void brake()
	{
		System.out.println("Mountain bike brake");
	}
}
public class AbstractClass2 
{

	public static void main(String[] args)
	{
		Mountainbike obj=new Mountainbike();
		obj.brake();
		Sportsbike obj2=new Sportsbike();
		obj2.brake();
	}

}
