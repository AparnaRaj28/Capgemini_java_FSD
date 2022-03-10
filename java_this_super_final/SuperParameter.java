package cg.com;
class Animal2
{
	Animal2()
	{
		System.out.println("I am an animal");
	}
	
	Animal2(String type)
	{
		System.out.println("Type="+type);
	}
}

class Dog2 extends Animal2{
	Dog2()
	{
		//calling parameterised constuctor of super class
		super("animal");
		System.out.println("i am a dog");
	}
}


public class SuperParameter {

	public static void main(String[] args) {
		Dog2 d=new Dog2();

	}

}
