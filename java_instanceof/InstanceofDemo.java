package Cg.com;
class Fruit
{
	
}
class Vehicle
{
	
}
public class InstanceofDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit apple=new Fruit();
		Vehicle car=new Vehicle();
		Fruit mango=null;
		
		//returns true if object is instance of class
		System.out.println("Apple is a Fruit:"+(apple instanceof Fruit));
		
		System.out.println("car is a Vehicle:"+(car instanceof Vehicle));
		System.out.println("mango is a Fruit:"+(mango instanceof Fruit));
		//returns error
		
		//System.out.println("car is a fruit:"+(car instanceof Fruit));

	}

}
