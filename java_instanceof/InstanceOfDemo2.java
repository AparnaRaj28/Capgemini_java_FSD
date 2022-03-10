package Cg.com;
class A
{
	
}
class B extends A
{
	
}
public class InstanceOfDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj_b=new B();
		
		System.out.println("obj_b is an instance of B:"+(obj_b instanceof B));
		
		System.out.println("objOfClassB is an instance of the parent class A: " + (obj_b instanceof A));
	}

}
