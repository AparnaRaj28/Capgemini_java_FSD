package cg.com;

public class ThisTest {
	int val1,val2;
	//parameterized constructor
	ThisTest(int x,int y)
	{
	   this.val1=x+x;
	   this.val2=y+y;
		
   //Same output		
//	   val1=x+x;
//	   val2=y+y;
			
	}
	void display()
	{
		System.out.println("val1="+val1);
		System.out.println("val2="+val2);
	}

	public static void main(String[] args) {
		
		ThisTest obj=new ThisTest(2,3);
		obj.display();

	}

}
