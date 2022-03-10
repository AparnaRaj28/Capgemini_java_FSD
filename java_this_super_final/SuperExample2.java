package cg.com;

class Animal1
{
	protected String type="animal";
}
class Dog1 extends Animal1
{
	public String type="mammal";
	public void print()
	{
		System.out.println("Type is:"+type);
		System.out.println("Type is:"+super.type);
		
	}

}

public class SuperExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog1 d=new Dog1();
		d.print();
	}

}
