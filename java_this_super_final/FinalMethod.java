package cg.com;

class FinalDemo3{
	//final method
    public final void display()
    {
   	 System.out.println("This is the final method");
    }	
}
class Main extends FinalDemo{
	//try to override final method
	//not possible
    public final void display()
    {
   	 System.out.println("This final method is overridden");
    }	
}
public class FinalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Main obj = new Main();
	    obj.display();


	}

}
