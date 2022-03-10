package cg.com;

public class ThisMethod2 {
	
	void print()
	{
		   this.show();
		   //show();
	       System.out.println("Test_this:: print");
	}
	void show()
	{
	       System.out.println("Test_this:: show");
	}

	public static void main(String[] args) {
		ThisMethod2 obj=new ThisMethod2();
		obj.print();

	}

}
