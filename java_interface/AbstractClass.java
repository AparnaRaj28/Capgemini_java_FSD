package cg.com.day5;
//abstract: hiding the data or rather showing only required info.
//
//abstract is applicable for methods and classes only, not for variables.
//When a class has at least one abstract method then the class has to be made abstract.
//And you can't create object of an abstract class, but u can define a reference variable.
//Whenever a class extends an abstract class , then its compulsory for that subclass to 
//define the abstract methods.If not that subclass also to be made as abstract.

abstract class A2
{
	void display()
	{
		System.out.println("This is java programming");
	}
}
class B2 extends A2
{
  	
}
public class AbstractClass {

	public static void main(String[] args) 
	{
		B2 obj=new B2();
		obj.display();
	}

}
