package cg.com;
class Animal{
	
	//overriden method
	public void display()
	{
		System.out.println("I am animal");
	}
}

class Dog extends Animal{
	//overriding method
	public void display()
	{
		System.out.println("I am a dog");
	}
	public void print()
	{
		display();//calls overriding method
		
		super.display();//calls overriden method
	}
}
public class SuperExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.print();

	}

}
