package cg.com.day5;
class Animal1 {

	  // field and method of the parent class
	  String name;
	  public void eat() 
	  {
	    System.out.println("I can eat");
	  }
	}
class Dog1 extends Animal1
{
	  // new method in subclass
	  public void display() {
	    System.out.println("My name is " + name);
	  }

}
public class InheritanceDemo {

	public static void main(String[] args) {
		// create an object of the subclass
	      Dog1 d=new Dog1();
	      
	      // access field of superclass
	      d.name = "jimmy";
	      d.display();
          d.eat();
 
	}

}
